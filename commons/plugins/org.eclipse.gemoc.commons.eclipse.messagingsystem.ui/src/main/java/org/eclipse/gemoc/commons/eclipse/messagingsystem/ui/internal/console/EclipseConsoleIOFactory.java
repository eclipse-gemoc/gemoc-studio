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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IOConsole;

public class EclipseConsoleIOFactory  {

    protected static EclipseConsoleIOFactory instance = new EclipseConsoleIOFactory();
    
    protected Map<String,EclipseConsoleIO> consoleIOMap = new HashMap<String,EclipseConsoleIO>();
    /**
     * retrieve or create a ConsoleIO with the given UId
     * the name is used only if the console is created
     * @param name
     * @return
     */
    public EclipseConsoleIO getConsoleIO(String uid, String name){    	
    	
    	EclipseConsoleIO consoleIo=consoleIOMap.get(uid);    	
    	if(consoleIo == null){
    		// create the eclipse console
    		IOConsole ioConsole = new IOConsole(name, null);
	    	ConsolePlugin.getDefault().getConsoleManager().addConsoles(new IConsole[]{ ioConsole });
			// ConsolePlugin.getDefault().getConsoleManager().showConsoleView(ioConsole);
			// ioConsole.activate(); // console will be displayed on first use
    		// create the IO with this console
			consoleIo = new EclipseConsoleIO(ioConsole);
	    	consoleIOMap.put(uid, consoleIo);
    	}
    	return consoleIo;
    }
    
    public static EclipseConsoleIOFactory getInstance(){
    	return instance;
    }
    
    /**
     * when no longer used, the consoles must be discarded
     * @param name
     */
    public void removeConsoleIO(String uid){
    	EclipseConsoleIO consoleIo=consoleIOMap.get(uid);
    	ConsolePlugin.getDefault().getConsoleManager().removeConsoles( new IConsole[] {consoleIo.console});
    	consoleIOMap.remove(uid);
    }
	
}


