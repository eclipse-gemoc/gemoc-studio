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

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.gemoc.commons.messagingsystem.api.reference.Reference;



/**
 * Very basic implementation of MessagingSystem that uses System.out and System.err
 * and that collect Errors in an Array
 * Useful for testing purpose, do not use for real deployment systems as the array is never flushed
 */
public class ErrorAwareMessagingSystem extends StdioSimpleMessagingSystem {

	public List<String> errorTrace = new ArrayList<String>();
	@Override
	public void log(Kind msgKind, String message, String messageGroup) {
		System.out.println(getKindString(msgKind) + " [" +messageGroup + "] " + message +" "+getCallerString());
		switch (msgKind) {
		case UserERROR:
			errorTrace.add(getKindString(msgKind) + " [" +messageGroup + "] " + message + " "  + " "+getCallerString());
			break;
		case DevERROR:
			errorTrace.add(getKindString(msgKind) + " [" +messageGroup + "] " + message + " "  + " "+getCallerString());
			break;
		default:
			break;
		}
	}

	@Override
	public void log(Kind msgKind, String message, String messageGroup,
			Throwable throwable) {
		StringWriter sw = new StringWriter();
		if(throwable != null){
			throwable.printStackTrace(new PrintWriter(sw));
		}
		String stackTrace = sw.toString();
		System.out.println(getKindString(msgKind)+" [" +messageGroup + "] " + message + " "+getCallerString()+"\n"+ stackTrace);
		switch (msgKind) {
		case UserERROR:
			errorTrace.add(getKindString(msgKind) + " [" +messageGroup + "] " + message + " "  + " "+getCallerString());
			break;
		case DevERROR:
			errorTrace.add(getKindString(msgKind) + " [" +messageGroup + "] " + message + " "  + " "+getCallerString());
			break;
		default:
			break;
		}
	}

	@Override
	public void logProblem(Kind msgKind, String message, String messageGroup,
			Reference causeObject) {
		
		System.out.println(getKindString(msgKind) + " [" +messageGroup + "] " + message + " " + causeObject + " "+getCallerString());
		errorTrace.add(getKindString(msgKind) + " [" +messageGroup + "] " + message + " " + causeObject + " "+getCallerString());
	}

	@Override
	public void logProblem(Kind msgKind, String message, String messageGroup,
			Throwable throwable, Reference causeObject) {

		StringWriter sw = new StringWriter();
		throwable.printStackTrace(new PrintWriter(sw));
		String stackTrace = sw.toString();
		System.out.println(getKindString(msgKind)+" [" +messageGroup + "] " + message+ " " + causeObject + " "+getCallerString()+"\n"+ stackTrace);
		errorTrace.add(getKindString(msgKind) + " [" +messageGroup + "] " + message + " " + causeObject + " "+getCallerString());
	}


	
}
