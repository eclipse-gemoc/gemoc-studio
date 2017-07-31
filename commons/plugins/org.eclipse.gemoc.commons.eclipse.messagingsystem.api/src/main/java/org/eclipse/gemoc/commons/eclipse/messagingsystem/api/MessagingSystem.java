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


package org.eclipse.gemoc.commons.eclipse.messagingsystem.api;

import java.io.BufferedReader;
import java.net.URL;

import org.eclipse.gemoc.commons.messagingsystem.api.reference.Reference;

/**
 * MessagingSystem API
 * This interface is used to be a facade for sending messages coming from any programs to the system
 * The system will be in charge of concretely presenting them in the most appropriate way according to the information kind 
 */
public abstract class MessagingSystem {
	public static enum Kind {
		UserINFO, UserWARNING, UserERROR, DevDEBUG, DevINFO, DevWARNING, DevERROR 
	}
	
	public static int UNKNOWN_NBWORKUNIT = -1;
	
	protected String baseMessageGroup = "";
	protected String userFriendlyName = "";
	
	/**
	 * Initialize the MessagingSystem
	 * @param baseMessageGroup is used as id for the MessagingSystem, if several MessagingSystem 
	 * in a platform use the same baseMessageGroup, then the platform may share some resource (like consoles for ex) 
	 * as the messages are supposed to be in the same group. 
	 * @param userFriendlyName name used when requiring to display this MessagingSystem to the user (like console window name, ...)
	 */
	public MessagingSystem initialize(String baseMessageGroup, String userFriendlyName){
		this.baseMessageGroup = baseMessageGroup;
		this.userFriendlyName = userFriendlyName;
		return this;
	}
	
	/** remove old log message from the user view if any */
	public abstract void clearLog();
	
	public abstract void log(Kind msgKind, String message, String messageGroup);
	public abstract void log(Kind msgKind, String message, String messageGroup, Throwable senderTrace);
	public abstract void logProblem(Kind msgKind, String message, String messageGroup, Reference causeObject);
	public abstract void logProblem(Kind msgKind, String message, String messageGroup, Throwable senderTrace, Reference causeObject);
	public abstract void flushProblem(String messageGroup, URL uri);
	public abstract void flushAllProblems(URL uri);
	
	
	public abstract BufferedReader getReader();
	public abstract String readLine();
	public abstract String readLine(String prompt);
	
	
	
	public abstract void initProgress(String progressGroup, String message, String messageGroup, int nbWorkUnit);
	public abstract void progress(String progressGroup, String message, String messageGroup, int workedUnit);
	public abstract void doneProgress(String progressGroup, String message, String messageGroup);
	
	
	// convenient operations for quicker call
	/**
	 * convenient operation for quicker call
	 * Equivalent to
	 * log(MessagingSystem.Kind.DevDEBUG, message, messageGroup)
	 */
	public void debug(String message, String messageGroup){
		log(MessagingSystem.Kind.DevDEBUG, message, messageGroup);
	}
	/**
	 * convenient operation for quicker call
	 * Equivalent to
	 * log(MessagingSystem.Kind.DevINFO, message, messageGroup)
	 */
	public void devInfo(String message, String messageGroup){
		log(MessagingSystem.Kind.DevINFO, message, messageGroup);
	}
	/**
	 * convenient operation for quicker call
	 * Equivalent to
	 * log(MessagingSystem.Kind.UserINFO, message, messageGroup)
	 */
	public void info(String message, String messageGroup){
		log(MessagingSystem.Kind.UserINFO, message, messageGroup);
	}
	/**
	 * convenient operation for quicker call
	 * Equivalent to
	 * log(MessagingSystem.Kind.UserWARNING, message, messageGroup, senderTrace)
	 */
	public void warn(String message, String messageGroup, Throwable senderTrace){
		log(MessagingSystem.Kind.UserWARNING, message, messageGroup, senderTrace);
	}
	/**
	 * convenient operation for quicker call
	 * Equivalent to
	 * log(MessagingSystem.Kind.UserWARNING, message, messageGroup, null)
	 */
	public void warn(String message, String messageGroup){
		log(MessagingSystem.Kind.UserWARNING, message, messageGroup, null);
	}
	/**
	 * convenient operation for quicker call
	 * Equivalent to
	 * log(MessagingSystem.Kind.UserERROR, message, messageGroup, senderTrace)
	 */
	public void error(String message, String messageGroup, Throwable senderTrace){
		log(MessagingSystem.Kind.UserERROR, message, messageGroup, senderTrace);
	}
	/**
	 * convenient operation for quicker call
	 * Equivalent to
	 * log(MessagingSystem.Kind.UserERROR, message, messageGroup, null)
	 */
	public void error(String message, String messageGroup){
		log(MessagingSystem.Kind.UserERROR, message, messageGroup, null);
	}
	
	
	/** 
	 * add user focus on the given MessagingSystem
	 * The behavior may vary depending on the concrete implementation of the Messaging system
	 */
	public void focus(){};
}
