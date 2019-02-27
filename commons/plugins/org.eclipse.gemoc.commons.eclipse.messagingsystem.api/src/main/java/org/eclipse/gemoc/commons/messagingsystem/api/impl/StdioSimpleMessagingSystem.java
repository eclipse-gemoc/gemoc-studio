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
package org.eclipse.gemoc.commons.messagingsystem.api.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;

import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystem;
import org.eclipse.gemoc.commons.messagingsystem.api.reference.Reference;

/**
 * Very basic implementation of MessagingSystem that uses System.out and System.err
 *
 */
public class StdioSimpleMessagingSystem extends MessagingSystem {

	

	@Override
	public void clearLog(){
	}
	
	@Override
	public void log(Kind msgKind, String message, String messageGroup) {
		if(messageGroup.isEmpty()){
			// simplified message when no group is specified
			System.out.println(message);
		}
		else{
			System.out.println(String.format("%7s [%s] %s %s", 
					getKindString(msgKind),
					shortenMessageGroup(messageGroup),
					message,
					getCallerString()
					));
		}
	}

	@Override
	public void log(Kind msgKind, String message, String messageGroup,
			Throwable throwable) {
		String stackTrace = "";
		StringWriter sw = new StringWriter();
		if(throwable != null){
			throwable.printStackTrace(new PrintWriter(sw));
			stackTrace = "\n"+sw.toString();
		}
		if(messageGroup.isEmpty()){
			// simplified message when no group is specified
			System.out.println(message+ stackTrace);
		}
		else{
			System.out.println(String.format("%7s [%s] %s %s\n%s", 
					getKindString(msgKind),
					shortenMessageGroup(messageGroup),
					message,
					getCallerString(),
					stackTrace
					));
		}
		
	}

	@Override
	public void logProblem(Kind msgKind, String message, String messageGroup,
			Reference causeObject) {
		
		System.out.println(getKindString(msgKind) + " [" +messageGroup + "] " + message + " " + causeObject + " "+getCallerString());

	}

	@Override
	public void logProblem(Kind msgKind, String message, String messageGroup,
			Throwable throwable, Reference causeObject) {

		String stackTrace = "";
		StringWriter sw = new StringWriter();
		if(throwable != null){
			throwable.printStackTrace(new PrintWriter(sw));
			stackTrace ="\n"+ sw.toString();
		}
		System.out.println(getKindString(msgKind)+" [" +messageGroup + "] " + message+ " " + causeObject + " "+getCallerString()+ stackTrace);

	}

	@Override
	public void initProgress(String progressGroup, String message,
			String messageGroup, int nbWorkUnit) {
		info("[BEGIN_" + progressGroup + "] " + message, messageGroup);

	}

	@Override
	public void progress(String progressGroup, String message,
			String messageGroup, int workedUnit) {
		info("["+progressGroup + "] " + message, messageGroup);

	}

	@Override
	public void doneProgress(String progressGroup, String message,
			String messageGroup) {
		info("[END_" + progressGroup + "] " + message, messageGroup);
	}

	protected String getKindString(Kind kind){
		switch (kind) {
		
		case UserINFO :
			return "INFO";
		case UserImportantINFO :
			return "IMPORTANT";
		case UserWARNING :
			return "WARNING";
		case UserERROR :
			return "ERROR";
		case DevINFO :
			return "INFO";
		case DevWARNING :
			return "WARNING";
		case DevERROR :
			return "ERROR";
		case DevDEBUG :
			return "DEBUG";
		default:
			break;
		}
		return "";
	}
	/**
	 * identify the caller of this message
	 * @return
	 */
	protected String getCallerString(){
		Exception e = new Exception();
		
		StackTraceElement[] stackTraceElements = e.getStackTrace();
		
		// return first caller which isn't getCallerString or log
		for(StackTraceElement stackTraceElement : stackTraceElements){
			if(! (	stackTraceElement.getMethodName().equals("log") || 
					stackTraceElement.getMethodName().equals("info") ||
					stackTraceElement.getMethodName().equals("debug") ||
					stackTraceElement.getMethodName().equals("warn") ||
					stackTraceElement.getMethodName().equals("error") ||
					stackTraceElement.getClassName().contains("org.eclipse.gemoc.commons.eclipse.messagingsystem") || 
					stackTraceElement.getClassName().contains("org.eclipse.gemoc.commons.messagingsystem"))){

				return stackTraceElement.toString();
			}
		}
		
		
		return "";		
		
	}

	@Override
	public void flushAllProblems(URL uri) {
		
	}

	@Override
	public void flushProblem(String messageGroup, URL uri) {
		
	}

	@Override
	public String readLine() {
		String result = "";
		try {
			java.io.InputStreamReader isr =new java.io.InputStreamReader(System.in);
			java.io.BufferedReader bufferedReader  =new java.io.BufferedReader(isr);
		
			return bufferedReader.readLine();
		} catch (IOException e) {
			error("Failed to read line", "", e);
		}
		return result;
	}

	@Override
	public String readLine(String prompt) {
		info(prompt, "");
		return readLine();
		
	}

	protected BufferedReader reader;
	@Override
	public BufferedReader getReader() {
		if(reader == null){
			// reader is System.in
			reader = new BufferedReader( new InputStreamReader(System.in));
		}
		return reader;
	}
	
	/**
	 * provide a shorter version of the message group for printing
	 * will use the . in the pattern to shorten  first part of the group while keeping the last two elements
	 * @param messageGroup
	 * @return
	 */
	public static String shortenMessageGroup(String messageGroup) {
		//return messageGroup.replaceAll("\\B\\w+(\\.[a-z])","$1");  // nice for java classes but does not keep the last 2 part of the plugin name (all lowercase)
		StringBuilder sb = new StringBuilder();
		String[] f = messageGroup.split("\\.");
		int idx = 0;
		final int limit = f.length -2;
		for (String string : f) {
			if(idx < limit && !string.isEmpty()) {
				sb.append(string.charAt(0));
			} else {
				sb.append(string);
			}
			if(idx < f.length-1) {
				sb.append(".");
			}
			idx++;
		}
		return sb.toString();
	}
	
}
