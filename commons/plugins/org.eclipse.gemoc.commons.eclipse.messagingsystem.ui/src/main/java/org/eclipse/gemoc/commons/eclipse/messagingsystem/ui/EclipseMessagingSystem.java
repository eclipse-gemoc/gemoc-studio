/*******************************************************************************
 * Copyright (c) 2011, 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package org.eclipse.gemoc.commons.eclipse.messagingsystem.ui;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.util.Hashtable;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystem;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.ui.internal.EclipseReporter;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.ui.internal.console.ConsoleIO;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.ui.internal.console.EclipseConsoleIO;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.ui.internal.console.EclipseConsoleIOFactory;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.ui.internal.console.message.ConsoleMessage;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.ui.internal.console.message.DebugErrorMessage;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.ui.internal.console.message.DebugMessage;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.ui.internal.console.message.DebugWarningMessage;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.ui.internal.console.message.ErrorMessage;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.ui.internal.console.message.InfoMessage;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.ui.internal.console.message.WarningMessage;
import org.eclipse.gemoc.commons.messagingsystem.api.reference.Reference;


public class EclipseMessagingSystem extends MessagingSystem {
	
	EclipseReporter eclipseReporter;
	
	protected ConsoleIO consoleIO; 
	
	protected int progressBarMaxDepth = 1;
	protected long progressBarIdleTime = 100;
	protected int progressBarScale = 1000;
	
	public ConsoleIO getConsoleIO() {
		if(consoleIO == null){
			if(baseMessageGroup == null || baseMessageGroup.isEmpty()){
				consoleIO = Activator.getDefault().getConsoleIO(); // use default MessagingSystem console
			}
			else{
				consoleIO = EclipseConsoleIOFactory.getInstance().getConsoleIO(baseMessageGroup, userFriendlyName);
			}
		}
		return consoleIO;
	}

	protected Hashtable<String,Long> progressStartTimeTable = new Hashtable<String,Long>();
	protected Hashtable<String, IProgressMonitor> progressMonitorTable = new Hashtable<String,IProgressMonitor>();
	
	protected Integer consoleLogLevel = ConsoleLogLevel.DEV_DEBUG;
	
	public Integer getConsoleLogLevel() {
		return consoleLogLevel;
	}

	public void setConsoleLogLevel(Integer consoleLogLevel) {
		this.consoleLogLevel = consoleLogLevel;
	}

	public EclipseMessagingSystem() {
		this.eclipseReporter = new EclipseReporter(this);		
	}
	
	@Override
	public void doneProgress(String progressGroup, String msg, String msgGroup) {

		boolean mustLog = false;
		IProgressMonitor progressMonitor =  getProgressMonitor(progressGroup);
		
		if(progressMonitor != null){
			progressMonitor.subTask(msg);
			progressMonitor.done();
			
			if(progressMonitor != null){
				releaseProgressMonitor(progressGroup);
			}
		}
		else{
			mustLog = true;
		}
		
		
		// for the moment forward all messages to usual log
		Kind logLevel;
		if(mustLog){
			logLevel = Kind.UserINFO;
		}
		else logLevel = Kind.DevINFO;
		this.log(logLevel, "["+progressGroup+"]"+ msg+getElapsedTime(progressGroup), msgGroup);		
		
	}

	private String getIntermediateElapsedTime(String progressGroup) {
		String elapsedTime="";
		if(progressGroup!= null){
			Long startTime = progressStartTimeTable.get(progressGroup);
			if(startTime != null){
				long endTime= System.currentTimeMillis() - startTime;
				elapsedTime = " (T0 + "+endTime+"ms)";
			}
		}
		return elapsedTime;
	}
	private String getElapsedTime(String progressGroup) {
		String elapsedTime="";
		if(progressGroup!= null){
			Long startTime = progressStartTimeTable.get(progressGroup);
			if(startTime != null){
				long endTime= System.currentTimeMillis() - startTime;
				elapsedTime = " (done in "+endTime+"ms)";
				progressStartTimeTable.remove(progressGroup); // free some memory
			}
		}
		return elapsedTime;
	}
	
	private IProgressMonitor releaseProgressMonitor(String progressGroup){
		synchronized(this) {
	        return this.progressMonitorTable.remove(progressGroup);
	    }
	}
	private IProgressMonitor getProgressMonitor(String progressGroup){
		synchronized(this) {
	        return this.progressMonitorTable.get(progressGroup);
	    }
	}
	public void addProgressMonitor(String progressGroup, IProgressMonitor progressMonitor){
		synchronized(this) {
	        this.progressMonitorTable.put(progressGroup, progressMonitor);
	    }
	}
	
	private IProgressMonitor getParentProgressMonitor(String progressGroup){
		if(progressGroup.contains(".")){
			String parentProgressGroup = progressGroup.substring(0, progressGroup.lastIndexOf("."));
			IProgressMonitor result = this.progressMonitorTable.get(parentProgressGroup);
			if(result != null ) return result;		
			return getParentProgressMonitor(parentProgressGroup);
		}
		return null;
	}

	@Override
	public void initProgress(String progressGroup, String msg, String msgGroup, int unitToWork) {

		boolean mustLog = false;
		if(this.progressBarMaxDepth > 0){
			IProgressMonitor progressMonitor = getProgressMonitor(progressGroup);
			if(progressMonitor != null){
				progressMonitor.beginTask(msg, unitToWork * progressBarScale);			
			}
			else {
				IProgressMonitor parentProgressMonitor = getParentProgressMonitor(progressGroup);
				if (parentProgressMonitor!= null){
					progressMonitor = new SubProgressMonitor(parentProgressMonitor, 1*progressBarScale);
					addProgressMonitor(progressGroup, progressMonitor);
					progressMonitor.beginTask(msg, unitToWork * progressBarScale);
				}
				else{ mustLog = true; }
			}
			
			
			/*
			ProgressWrapper progressWrapper = getProgressWrapper(progressGroup);
			IProgressMonitor progressMonitor = null;
			if(progressWrapper != null){
				// TODO must stop the previous and recreate a new one !!!
			}
			progressWrapper = getParentProgressWrapper(progressGroup);
			if(progressWrapper != null){
				// TODO must provision a new subProgressMonitor in the wrapper 
			}
			else {
				progressWrapper = new ProgressWrapper(progressGroup, this.progressBarIdleTime, this);
				org.eclipse.ui.progress.UIJob uiJob = new ProgressWrapperStarter(progressWrapper, progressMonitor, this);
				uiJob.schedule();
				try {
					uiJob.join();
					progressMonitor = progressWrapper.getProgressMonitor();
					progressMonitor.beginTask(msg, unitToWork * progressBarScale);
				} catch (InterruptedException e) {
					this.log(Kind.DevWARNING, "["+progressGroup+"] cannot create progress monitor, => log only. "+e.getMessage(), msgGroup, e);
					mustLog = true;
				}
			}
			*/
		}
		else {
			mustLog = true;
		}
		
		if(mustLog){
			// forward message to usual log
			this.log(Kind.DevINFO, "["+progressGroup+"]"+ msg, msgGroup);
		}

		if(progressGroup!= null){
			progressStartTimeTable.put(progressGroup, Long.valueOf(System.currentTimeMillis()));
		}
	}

	@Override
	public void clearLog(){
		getConsoleIO().clear();
	}
	
	@Override
	public void log(Kind msgKind, String message, String messageGroup) {
		
		// some error message should go to the eclipse error view
		switch (msgKind) {
		case UserWARNING:
		case DevWARNING:
			if(messageGroup ==  null || !messageGroup.isEmpty())
				Activator.getDefault().getLog().log(new Status(IStatus.WARNING, messageGroup, IStatus.WARNING, message != null ? message : "<null>",null));
			break;
		case UserERROR:
		case DevERROR:
			if(messageGroup ==  null || !messageGroup.isEmpty())
				Activator.getDefault().getLog().log(new Status(IStatus.ERROR, messageGroup, IStatus.ERROR, message != null ? message : "<null>",null));
			break;
		default:
			break;
		}
		
		if(ConsoleLogLevel.isLevelEnoughToLog(ConsoleLogLevel.kind2Level(msgKind), getConsoleLogLevel())){
			getConsoleIO().print(getConsoleMessageFor(msgKind,message));
		}
		// currently redirect to stdio
		//StdioSimpleMessagingSystem stdioRedirect = new StdioSimpleMessagingSystem();
		//stdioRedirect.log(msgKind, message, messageGroup);
	}

	

	@Override
	public void log(Kind msgKind, String message, String messageGroup, Throwable throwable) {
		
		// some error message should go to the eclipse error view
		switch (msgKind) {
		case UserWARNING:
		case DevWARNING:
			if(messageGroup ==  null || !messageGroup.isEmpty())
				Activator.getDefault().getLog().log(new Status(IStatus.WARNING, messageGroup, IStatus.WARNING, message != null ? message : "<null>",throwable));
			break;
		case UserERROR:
		case DevERROR:
			if(messageGroup ==  null || !messageGroup.isEmpty())
				Activator.getDefault().getLog().log(new Status(IStatus.ERROR, messageGroup, IStatus.ERROR, message != null ? message : "<null>",throwable));
			break;
		default:
			break;
		}
		
		if(ConsoleLogLevel.isLevelEnoughToLog(ConsoleLogLevel.kind2Level(msgKind), getConsoleLogLevel())){
			String stackTrace = "";
			if(throwable != null){
				StringWriter sw = new StringWriter();
				throwable.printStackTrace(new PrintWriter(sw));
				stackTrace = "\n"+sw.toString();
			}
			getConsoleIO().print(getConsoleMessageFor(msgKind,message+stackTrace));
		}
	}

	@Override
	public void logProblem(Kind kind, String msg, String msgGroup, Reference ref) {
		//Kind log_kind = kind;
		switch (kind) {
		case UserWARNING:
			eclipseReporter.addMarker( IMarker.SEVERITY_WARNING, ref, msg,msgGroup);
			// since the message is in the problem view, downgrade log_kind to dev so it can be filtered
			//log_kind = Kind.DevWARNING;
			break;
		case UserERROR:
			eclipseReporter.addMarker( IMarker.SEVERITY_ERROR, ref, msg,msgGroup);
			// downgrade log_kind to dev
			//log_kind = Kind.DevERROR;
			break;
		default:
			eclipseReporter.addMarker( IMarker.SEVERITY_INFO, ref, msg,msgGroup);
			// downgrade log_kind to dev
			//log_kind = Kind.DevERROR;
			break;
		}
		// forward all message to usual log too
		//log(log_kind, msg + " "+ref, msgGroup);
	}

	@Override
	public void logProblem(Kind kind, String msg, String msgGroup, Throwable exception,
			Reference ref) {
		//Kind log_kind = kind;
		switch (kind) {
		case UserWARNING:
			eclipseReporter.addMarker( IMarker.SEVERITY_WARNING, ref, msg,msgGroup);
			//  since the message is in the problem view, downgrade log_kind to dev so it can be filtered
			//log_kind = Kind.DevWARNING;
			break;
		case UserERROR:
			eclipseReporter.addMarker( IMarker.SEVERITY_ERROR, ref, msg,msgGroup);
			// downgrade log_kind to dev
			//log_kind = Kind.DevERROR;
			break;
		default:
			eclipseReporter.addMarker( IMarker.SEVERITY_INFO, ref, msg,msgGroup);
			// downgrade log_kind to dev
			//log_kind = Kind.DevERROR;
			break;
		}
		// forward all message to usual log too, here we can use the stacktrace 
		//log(log_kind, msg + " "+ref, msgGroup, exception);
		
	}

	@Override
	public void progress(String progressGroup, String msg, String msgGroup, int workedUnit) {
		boolean mustLog = false;
		IProgressMonitor progressMonitor = getProgressMonitor(progressGroup);		
		if(progressMonitor != null){
			progressMonitor.subTask(msg);
			progressMonitor.worked(workedUnit*progressBarScale);
		}
		else{
			mustLog = true;
		}
		
		// for the moment forward all messages to usual log
		Kind logLevel;
		if(mustLog){
			logLevel = Kind.UserINFO;
		}
		else logLevel = Kind.DevINFO;
		this.log(logLevel, "["+progressGroup+"]"+ msg+getIntermediateElapsedTime(progressGroup), msgGroup);
		
	}

	@Override
	public void flushAllProblems(URL uri) {
		eclipseReporter.flushAllProblems(uri);		
	}

	@Override
	public void flushProblem(String messageGroup, URL uri) {
		eclipseReporter.flushProblem(messageGroup,uri);	
		
	}

	protected ConsoleMessage getConsoleMessageFor(Kind msgKind, String message) {
		switch (msgKind) {
		case DevDEBUG:
			return new DebugMessage(message+"\n");
		case UserINFO:
			return new InfoMessage(message+"\n");
		case DevINFO:
			return new DebugMessage(message+"\n");
		case UserWARNING:
			return new WarningMessage(message+"\n");
		case DevWARNING:
			return new DebugWarningMessage(message+"\n");
		case UserERROR:
			return new ErrorMessage(message+"\n");
		case DevERROR:
			return new DebugErrorMessage(message+"\n");
			
		default:
			return new DebugMessage(message+"\n");
		}
	}

	@Override
	public String readLine() {
		return getConsoleIO().read();
	}

	@Override
	public String readLine(String prompt) {
		info(prompt, "");
		Thread.yield();
		return readLine();
	}

	@Override
	public BufferedReader getReader() {
		return getConsoleIO().getReader();
	}
	
	/**
	 * 
	 * @return
	 */
	public int getProgressBarMaxDepth() {
		return progressBarMaxDepth;
	}

	/**
	 * set the maximum depth for wich progress bar must be created
	 * if 0, no progress bar will be created
	 * @return
	 */
	public void setProgressBarMaxDepth(int progressBarMaxDepth) {
		this.progressBarMaxDepth = progressBarMaxDepth;
	}
	
	
	/*
	class ProgressWrapperStarter extends org.eclipse.ui.progress.UIJob{
		ProgressWrapper progressWrapper; 
		IProgressMonitor progressMonitor;
		EclipseMessagingSystem logger;
		
		public ProgressWrapperStarter(ProgressWrapper progressWrapper, IProgressMonitor progressMonitor, EclipseMessagingSystem logger){
			super("adding progress monitor");
			this.progressMonitor = progressMonitor;
			this.progressWrapper = progressWrapper;
			this.logger = logger;
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor arg0) {
			try {

				IWorkbench wb = PlatformUI.getWorkbench();
				IProgressService ps = wb.getProgressService();
				ps.busyCursorWhile(progressWrapper);

				logger.log(Kind.DevINFO, "["+this.getClass()+"]progressWrapper created" , this.getClass().toString());
			} catch (InvocationTargetException e) {
				logger.log(Kind.DevWARNING, "["+progressWrapper.getRootProgressGroup()+"] cannot create progress monitor, => log only. "+e.getMessage(), progressWrapper.getRootProgressGroup(), e);
				//mustLog = true;
			} catch (InterruptedException e) {
				logger.log(Kind.DevWARNING, "["+progressWrapper.getRootProgressGroup()+"] cannot create progress monitor, => log only. "+e.getMessage(), progressWrapper.getRootProgressGroup(), e);
				//mustLog = true;
			}
			return null;
		}
		
	}
	*/
	/**
	 * Show the console view on this MessagingSystem console
	 */
	public void showConsole(){
		if(getConsoleIO() instanceof EclipseConsoleIO){
			((EclipseConsoleIO)getConsoleIO()).showConsole();
		}
	}
	
	@Override
	public void focus(){
		showConsole();
	}
}
