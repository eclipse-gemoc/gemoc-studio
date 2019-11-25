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
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.gemoc.dsl.debug.ide.launch.AbstractDSLLaunchConfigurationDelegate;
import org.eclipse.gemoc.execution.sequential.javaengine.IK3RunConfiguration;
import org.eclipse.gemoc.execution.sequential.javaengine.K3RunConfiguration;
import org.eclipse.gemoc.execution.sequential.javaengine.PlainK3ExecutionEngine;
import org.eclipse.gemoc.execution.sequential.javaengine.SequentialModelExecutionContext;
import org.eclipse.gemoc.executionframework.engine.commons.EngineContextException;
import org.eclipse.gemoc.gemoc_studio.headless.Activator;
import org.eclipse.gemoc.xdsmlframework.api.core.ExecutionMode;
import org.eclipse.gemoc.xdsmlframework.api.core.IRunConfiguration;

public class PlainK3SequentialRunner implements IEngineRunner {
	
	ILaunchConfiguration launchConfiguration = null;
	
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
	public ILaunchConfiguration buildLaunchConfiguration(IFile modelFile, String selectedLanguage, String modelEntryPoint, String methodEntryPoint, String initializationMethod, String initializationMethodArgs) throws CoreException {
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
		launchConfiguration = configuration;
		return configuration;
	}
	
	public void run() throws CoreException, EngineContextException, InterruptedException {
		IK3RunConfiguration runConfiguration = new K3RunConfiguration(launchConfiguration);
		
		PlainK3ExecutionEngine executionEngine = new PlainK3ExecutionEngine();
		
		
		
		SequentialModelExecutionContext<IK3RunConfiguration> executioncontext = new SequentialModelExecutionContext<IK3RunConfiguration>(
				runConfiguration, ExecutionMode.Run);
		executioncontext.initializeResourceModel();
		executionEngine.initialize(executioncontext);
		
		
		Job job = new Job("") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				Activator.getDefault().getMessaggingSystem().debug("Starting engine", Activator.PLUGIN_ID);		
				executionEngine.start();
				return new Status(IStatus.OK, Activator.PLUGIN_ID, "executionStartedMessage");
			}
		};
		job.schedule();
		job.join();
		Activator.getDefault().getMessaggingSystem().debug("Engine Started",Activator.PLUGIN_ID);
		// wait for the end of the execution of the model
		executionEngine.joinThread();
		Activator.getDefault().getMessaggingSystem().debug("Engine Stopped", Activator.PLUGIN_ID);
		//runner.initContext();
	}
}
