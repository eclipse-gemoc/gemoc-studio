/*******************************************************************************
 * Copyright (c)  2019 Inria.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package org.eclipse.gemoc.gemoc_studio.headless.runner;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.gemoc.dsl.debug.ide.launch.AbstractDSLLaunchConfigurationDelegate;
import org.eclipse.gemoc.execution.sequential.javaengine.IK3RunConfiguration;
import org.eclipse.gemoc.xdsmlframework.api.core.IRunConfiguration;

public class PlainK3SequentialLaunchConfigurationBuilder {
	
	/**
	 * create a standard launch configuration with these data
	 * cf. org.eclipse.gemoc.dsl.debug.ide.sirius.ui.launch.AbstractDSLLaunchConfigurationDelegateUI for an example
	 * @param modelFile
	 * @param selectedLanguage
	 * @param modelentryPoint 
	 * @param methodentryPoint 
	 * @param initializationMethod 
	 * @param initializationMethodArgs 
	 * @return
	 * @throws CoreException
	 */
	public static ILaunchConfiguration build(IFile modelFile, String selectedLanguage, String modelEntryPoint, String methodEntryPoint, String initializationMethod, String initializationMethodArgs) throws CoreException {
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
		// "org.eclipse.gemoc.execution.sequential.javaengine.ui.launcher" comes from org.eclipse.gemoc.execution.sequential.javaengine.ui.launcher.Launcher.java)
		// todo find a way to get it without ui dependency
		ILaunchConfigurationType type = manager.getLaunchConfigurationType("org.eclipse.gemoc.execution.sequential.javaengine.ui.launcher");
		ILaunchConfigurationWorkingCopy configuration = type.newInstance(null, modelFile.getName());
		
		configuration.setMappedResources(new IResource[] {modelFile, });
		configuration.setAttribute(AbstractDSLLaunchConfigurationDelegate.RESOURCE_URI, modelFile.getFullPath()
				.toString());
		configuration.setAttribute(IRunConfiguration.LAUNCH_SELECTED_LANGUAGE, selectedLanguage);
		configuration.setAttribute(IK3RunConfiguration.LAUNCH_METHOD_ENTRY_POINT, methodEntryPoint);
		configuration.setAttribute(IK3RunConfiguration.LAUNCH_MODEL_ENTRY_POINT, modelEntryPoint);
		configuration.setAttribute(IK3RunConfiguration.LAUNCH_INITIALIZATION_METHOD, initializationMethod);
		configuration.setAttribute(IK3RunConfiguration.LAUNCH_INITIALIZATION_ARGUMENTS, initializationMethodArgs);
		return configuration;
	}
}
