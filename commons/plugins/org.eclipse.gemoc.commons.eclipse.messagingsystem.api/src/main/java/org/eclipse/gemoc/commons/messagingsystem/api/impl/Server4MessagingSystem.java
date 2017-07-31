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

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystem;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.Request;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystem.Kind;

/*
 * Get request from a ClientMessagingSystem and
 * call corresponding methods of the real MessagingSystem
 */
public class Server4MessagingSystem implements Runnable{
	
	int port;
	
	MessagingSystem logger;
	
	ServerSocket serverSocket;

	public Server4MessagingSystem(int port, MessagingSystem ms) {	
		try {
			
			this.logger = ms;
			serverSocket = new ServerSocket(port);
			this.port = serverSocket.getLocalPort();
			
		} catch (IOException e) {
			logger.error(e.getMessage(), Server4MessagingSystem.class.getName(),e);
		}
	}
	
	public int getPort(){
		return port;
	}

	@Override
	public void run() {
		
        ObjectInputStream reader = null;
        Object msg;
        
        try {
    		Socket clientSocket = serverSocket.accept();
    		
    		InputStream in = clientSocket.getInputStream();
        	reader = new ObjectInputStream(new BufferedInputStream(in));
        	
        	logger.log(Kind.DevINFO, "Messaging system server started on port "+port, "");	
        	
            while(true) {
            	msg = reader.readObject();
            	Request req = (Request)msg;
            	
            	switch (req.calledMethod) {
				case clearLog:
					logger.clearLog();
					break;
				case log:
					logger.log(req.msgKind, req.message, req.messageGroup);		
					break;
				case logProblem:
					//not implemented
					break;
				case initProgress:
					logger.initProgress(req.progressGroup, req.message, req.messageGroup, req.nbUnit);
					break;
				case progress:
					logger.progress(req.progressGroup, req.message, req.messageGroup, req.nbUnit);
					break;
				case doneProgress:
					logger.doneProgress(req.progressGroup, req.message, req.messageGroup);
					break;

				default:
					//do nothing
					break;
				}
            }
        }
        catch (EOFException e) {
        	try {
        		if(reader != null) reader.close();
			} catch (IOException e1) {
				logger.error(e1.getMessage(), Server4MessagingSystem.class.getName(),e1);
			}
        }
        catch(java.net.SocketException e){
        	if("Connection reset".equals(e.getMessage())){
        		logger.log(Kind.DevDEBUG, e.getMessage()+" on sockect port "+port, Server4MessagingSystem.class.getName(), null);
        	}
        	else
        	logger.log(Kind.DevDEBUG, e.getMessage(), Server4MessagingSystem.class.getName(), e);
        }
        catch (Exception e) {
        	logger.error(e.getMessage(), Server4MessagingSystem.class.getName(),e);
        }		
	}
	
}
