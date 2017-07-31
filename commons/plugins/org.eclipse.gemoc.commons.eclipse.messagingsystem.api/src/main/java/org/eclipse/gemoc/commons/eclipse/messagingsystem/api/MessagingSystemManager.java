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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.gemoc.commons.messagingsystem.api.impl.StdioSimpleMessagingSystem;

public class MessagingSystemManager {

	public static final String MESSAGINGSYSTEM_EXTENSION_POINT_NAME = "fr.inria.diverse.commons.eclipse.messagingsystem";
	public static final String MESSAGINGSYSTEM_EXTENSION_POINT_CONTRIB = "MessagingSystem_Contribution";
	public static final String MESSAGINGSYSTEM_EXTENSION_POINT_CONTRIB_NAME_ATT = "name_string";
	public static final String MESSAGINGSYSTEM_EXTENSION_POINT_CONTRIB_MESSAGINGSYSTEM_ATT = "MessagingSystem_class";
	
	// best platform shared messaging system
	protected MessagingSystem bestPlatformMessaggingSystem= null;
	
	/**
	 * 
	 * @return the current shared instance of the best implementation of MessagingSystem for the current platform
	 */
	public MessagingSystem getBestPlatformSharedMessaggingSystem(){
	
		if(bestPlatformMessaggingSystem == null){
			bestPlatformMessaggingSystem = createBestPlatformMessagingSystem();
		}
		return bestPlatformMessaggingSystem;
	}
	
	
	/**
	 * 
	 * @return a new MessagingSystem that is supposed to be the best implementation for the current platform
	 * use the default paramters, so the platform may decide to group the messages in a single console to save resources
	 */
	public MessagingSystem createBestPlatformMessagingSystem(){
		return createBestPlatformMessagingSystem("", "Default MessagingSystem");
	}
	/**
	 * 
	 * @return a new MessagingSystem that is supposed to be the best implementation for the current platform
	 * @param baseMessageGroup id for the messaging system, if two instances of MessagingSystem use the same id, the platform may decide to group the messages in a single console
	 * @param userFriendlyName, name for the console, if several instances use the same  baseMessageGroup, it will use one of the userFriendlyName (the first that is created) 
	 */
	public MessagingSystem createBestPlatformMessagingSystem(String baseMessageGroup, String userFriendlyName ){
		MessagingSystem result = null;
		IConfigurationElement[] confElements = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(MESSAGINGSYSTEM_EXTENSION_POINT_NAME);
		for (int i = 0; i < confElements.length; i++) {
			// get first working contribution
			// TODO find some criterion or properties allowing to have better selection in case of multiple definitions
			//String name = confElements[i].getAttribute(MESSAGINGSYSTEM_EXTENSION_POINT_CONTRIB_NAME_ATT);
			try {
				result = (MessagingSystem) confElements[i].createExecutableExtension(MESSAGINGSYSTEM_EXTENSION_POINT_CONTRIB_MESSAGINGSYSTEM_ATT);
				result.initialize(baseMessageGroup, userFriendlyName);
				if(result != null)	break;
			} catch (CoreException e) {;
			}
		}
		if (result == null){
			// still not created, either due to exception or to missing extension contributor
			// fallback to default constructor
			result = new StdioSimpleMessagingSystem();
		}
		
		return result;
	}
}
