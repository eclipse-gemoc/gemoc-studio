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
package org.eclipse.gemoc.commons.eclipse.messagingsystem.ui.internal.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.ui.Activator;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.ui.internal.console.message.ConsoleMessage;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.ui.internal.console.message.WarningMessage;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.ui.preferences.PreferenceConstants;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IOConsoleOutputStream;



public class EclipseConsoleIO extends ConsoleIO implements IPropertyChangeListener {

	public boolean notAlreadyUsed = true;
	
	/** 	max width of the lines in the console, if overflow, start a new line */
	public static final int CONSOLE_MAX_WIDTH = 5000;
	
	/** 	size for which we need to split the message before passing to the stream */
	public static final int LARGE_MESSAGE_SIZE = 10000;
	
	public final static int MIN_CHARS = 1000;
	
	/**
	 * The internal eclipse IOConsole instance.
	 */
	protected org.eclipse.ui.console.IOConsole console = null;

	/**
	 * Create a new IO that will output to the Eclipse console passed as parameter
	 * @param console
	 */
	public EclipseConsoleIO(org.eclipse.ui.console.IOConsole console) {
		this.console = console;	
		Activator.getDefault().getPreferenceStore().addPropertyChangeListener(this);
		updateOutputLimit();
	}
	
	/**
	 * This is a lazy initialization.
	 * @return
	 */
	public OutputStream getOutputStream() {
		if ( outputStream == null ){
			outputStream = console.newOutputStream();
		}
		return outputStream;
	}
	
	/**
	 * This is a lazy initialization.
	 * @return
	 */
	public BufferedReader getReader() {
		if ( reader == null ){
			reader = new BufferedReader( new InputStreamReader( console.getInputStream() ) );
		}
		return reader;
	}
	
	public String promptAndRead(String prompt) {
		console.activate();
		print(prompt);
		return read();
	}
	
	public void clear() {
		console.clearConsole();
	}
	
	//////////////////////////////
	//////////////////////////////
	//		Writing Methods		//
	///////////////////////////////////////////////////////////////////////////////////////
	// The writing protocol provides some methods to print out some String or messages . //
	// Any object can be printed as far as it declares a toString method.			 //
	///////////////////////////////////////////////////////////////////////////////////////
	
	/**
	 * print the message eventually justify the message according to the maxwidth constant 
	 * deal with large string : they are printed using a separated thread instead of the UI thread
	 */
	public void print(final ConsoleMessage message) {
		if(notAlreadyUsed){
			// display the console for the first time to the user 
			ConsolePlugin.getDefault().getConsoleManager().showConsoleView(console);
			console.activate();
			notAlreadyUsed = false;
		}
		
		
		if(message.getMessage().length() > LARGE_MESSAGE_SIZE){			
			// large message
			// support for large string !
			Job myJob = new Job("Writing a large string to the console") {
			      public IStatus run(IProgressMonitor monitor) {
			    	  safePrint( message.getMessage(), message.getColor(), monitor);
			         return new Status(IStatus.OK, "fr.irisa.triskell.eclipse.utils", "large message printed to the console");
			      }
			   };
			myJob.schedule();
			// must wait before continuing
			try {
				myJob.join();
			} catch (InterruptedException e) {
				print(new WarningMessage("writing of large message to the console interrupted"));
			}
		}
		else{
			// normal messages are run in the UI thread
			// support for reasonnable sized string
			Runnable r = new Runnable() {
				public void run() {
					changeColor(message.getColor());
					String justifiedMsg = justifyMessage(message.getMessage());
					if(!((IOConsoleOutputStream)getOutputStream()).isClosed()){
						try {
							((IOConsoleOutputStream)getOutputStream()).write(justifiedMsg);
						} catch (IOException e) {
						}
					}
				}
			};
			//ConsolePlugin.getStandardDisplay().syncExec(r);			
			ConsolePlugin.getStandardDisplay().asyncExec(r);
		}
	}
	/** deal with not justified and large string
	 * this is because large string may block Eclipse UI
	 */
	protected void safePrint(String message, Color c, IProgressMonitor monitor){
		try {
			String justifiedMsg = justifyMessage(message);
			if(justifiedMsg.length() > LARGE_MESSAGE_SIZE){
				// deal with large messages ... chunk the message
				int nbChunk = justifiedMsg.length()/LARGE_MESSAGE_SIZE;
				monitor.beginTask("writing large string to the console", nbChunk+1);
				int start, end= 0;
				for(int i = 0; i< nbChunk; i++){
					start = LARGE_MESSAGE_SIZE*i;
					end = LARGE_MESSAGE_SIZE*i + LARGE_MESSAGE_SIZE;
					changeStream();
					changeColor(c);
					((IOConsoleOutputStream)getOutputStream()).write(justifiedMsg.substring(start, end));
					monitor.worked(1);
				}
				changeStream();
				changeColor(c);
				((IOConsoleOutputStream)getOutputStream()).write(justifiedMsg.substring(end, justifiedMsg.length()));
				monitor.done();
			}
			else{
				changeColor(c);
				((IOConsoleOutputStream)getOutputStream()).write(justifiedMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * this methods allow to change the color of futur message
	 * (this is because a simple change of current stream color, change the color for all messages, even previous ones ...) 
	 * @param c
	 */
	public void changeColor(Color c){
		Color previousColor = ((IOConsoleOutputStream) getOutputStream()).getColor();
		if( (c==null && c!= previousColor) || (c!=null && !c.equals(previousColor)) ){
			// need to change to another stream for the new color
			changeStream(); // reset the stream
			((IOConsoleOutputStream) getOutputStream()).setColor(c);
		}
	}
	/**
	 * allows to change stream, sometime needed if a stream is too full or when changing color
	 */
	public void changeStream(){
		try {
			if(outputStream != null){
				outputStream.close();
			}
		} catch (IOException e) {
		}
		outputStream = null;
	}
	public void println(final ConsoleMessage message) {
		// use normal print for the message itself
		print(message);
		// add the carriage return
		Runnable r = new Runnable() {
			public void run() {
				changeColor(message.getColor());
				if(!((IOConsoleOutputStream)getOutputStream()).isClosed()){
					try {
						((IOConsoleOutputStream)getOutputStream()).write("\n");
					} catch (IOException e) {
					}
				}
			}
		};
		ConsolePlugin.getStandardDisplay().asyncExec(r);
	}
	

	private void updateOutputLimit() 
	{
		int nMaxChars = Activator.getDefault().getPreferenceStore().getInt(PreferenceConstants.P_MAX_CONSOLE_OUTPUT);
		int nMinChars = Math.min (MIN_CHARS, nMaxChars -1);
		this.console.setWaterMarks (Math.max (-1, nMinChars), Math.max (-1, nMaxChars));
	}
	
	//////////////////////////////////////
	//////////////////////////////////////
	//		End of Writing Methods		//
	//////////////////////////////////////
	//////////////////////////////////////
	
	public static String justifyMessage(String message){
		StringBuffer justifiedMessage = new StringBuffer(message);
		int lastNLIndex = 0;
		int index = 0;
		while(index < justifiedMessage.length()){
			if(justifiedMessage.charAt(index) == '\n' || index == justifiedMessage.length()-1){
				if(index - lastNLIndex > CONSOLE_MAX_WIDTH){
					// need to insert a newline
					justifiedMessage.insert(lastNLIndex+CONSOLE_MAX_WIDTH, '\n');
					lastNLIndex=lastNLIndex+CONSOLE_MAX_WIDTH;
					// normally , since we have inserted a char we should fall on the same newline char again
				}
				else{
					lastNLIndex=index;
				}
			}
			index++;
		}
		
		return justifiedMessage.toString();
	}

	@Override
	public void propertyChange(PropertyChangeEvent arg0) {
		updateOutputLimit();
	}
	
	/**
	 * Show the console view on this console
	 */
	public void showConsole(){
		ConsolePlugin.getDefault().getConsoleManager().showConsoleView(console);
		console.activate(); // console will be displayed
	}
}


