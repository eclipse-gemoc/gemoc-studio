/*******************************************************************************
 * Copyright (c) 2017 Inria and others.
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
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.URL;

import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystem;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.Request;
import org.eclipse.gemoc.commons.messagingsystem.api.reference.Reference;

/*
 * This is an implementation to work with a socket.
 * It is the client side, which send serialized requests.
 * Use Server4MessagingSystem for the server side.
 */
public class ClientMessagingSystem extends MessagingSystem{
	Socket kkSocket;
	ObjectOutputStream out = null;
	java.io.BufferedReader in = null;
	
	public ClientMessagingSystem(int port, String address) {
	  
	  try {
	    kkSocket = new Socket(address, port);
	    out = new ObjectOutputStream(kkSocket.getOutputStream());
	    
	    java.io.InputStreamReader isr = new java.io.InputStreamReader(System.in);
	    in  = new java.io.BufferedReader(isr);

	  } catch (Exception e){
		  System.out.println("exception caught: " + e);
	  }
	}

	@Override
	public void clearLog() {
		Request req = new Request();
	    req.calledMethod = Request.Method.clearLog;
	    try {
			out.writeObject(req);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	    
	}

	@Override
	public void log(Kind msgKind, String message, String messageGroup) {
	    Request req = new Request();
	    req.message = message;
	    req.messageGroup = messageGroup;
	    req.calledMethod = Request.Method.log;
	    req.msgKind = msgKind;
	    try {
			out.writeObject(req);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void log(Kind msgKind, String message, String messageGroup,
			Throwable senderTrace) {
		// TODO Auto-generated method stub
	}

	@Override
	public void logProblem(Kind msgKind, String message, String messageGroup,
			Reference causeObject) {
		// TODO Auto-generated method stub
	}

	@Override
	public void logProblem(Kind msgKind, String message, String messageGroup,
			Throwable senderTrace, Reference causeObject) {
		// TODO Auto-generated method stub
	}

	@Override
	public void flushProblem(String messageGroup, URL uri) {
		// TODO Auto-generated method stub
	}

	@Override
	public void flushAllProblems(URL uri) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BufferedReader getReader() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String readLine() {
		String result = "";
		try {
			
			return in.readLine();
			
		} catch (IOException e) {
			error("Failed to read line", "", e);
		}
		return result;
	}

	@Override
	public String readLine(String prompt) {
		log(Kind.UserINFO, prompt, "");
		return readLine();
	}

	@Override
	public void initProgress(String progressGroup, String message,
			String messageGroup, int nbWorkUnit) {
		Request req = new Request();
	    req.message = message;
	    req.progressGroup = progressGroup;
	    req.messageGroup = messageGroup;
	    req.calledMethod = Request.Method.initProgress;
	    req.nbUnit = nbWorkUnit;
	    try {
			out.writeObject(req);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

	@Override
	public void progress(String progressGroup, String message,
			String messageGroup, int workedUnit) {
		Request req = new Request();
	    req.message = message;
	    req.progressGroup = progressGroup;
	    req.messageGroup = messageGroup;
	    req.calledMethod = Request.Method.progress;
	    req.nbUnit = workedUnit;
	    try {
			out.writeObject(req);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void doneProgress(String progressGroup, String message,
			String messageGroup) {
		Request req = new Request();
	    req.message = message;
	    req.progressGroup = progressGroup;
	    req.messageGroup = messageGroup;
	    req.calledMethod = Request.Method.doneProgress;
	    req.messageGroup = messageGroup;
	   
	    try {
	    	out.writeObject(req);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void finalize() throws Throwable {
		out.flush();
		kkSocket.close();
		super.finalize();
	}
	
	
}
