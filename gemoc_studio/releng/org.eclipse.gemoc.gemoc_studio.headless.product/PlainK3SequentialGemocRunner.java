package org.eclipse.gemoc.gemoc_studio.headless.runner;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.gemoc.execution.sequential.javaengine.IK3RunConfiguration;
import org.eclipse.gemoc.execution.sequential.javaengine.K3RunConfiguration;
import org.eclipse.gemoc.execution.sequential.javaengine.PlainK3ExecutionEngine;
import org.eclipse.gemoc.execution.sequential.javaengine.SequentialModelExecutionContext;
import org.eclipse.gemoc.executionframework.engine.commons.EngineContextException;
import org.eclipse.gemoc.xdsmlframework.api.core.ExecutionMode;
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine;

public class PlainK3SequentialGemocRunner extends AbstractSequentialGemocRunner<SequentialModelExecutionContext<IK3RunConfiguration>, IK3RunConfiguration> {

	@Override
	protected IExecutionEngine<SequentialModelExecutionContext<IK3RunConfiguration>> createExecutionEngine(
			IK3RunConfiguration runConfiguration, ExecutionMode executionMode)
			throws CoreException, EngineContextException {
		PlainK3ExecutionEngine executionEngine = new PlainK3ExecutionEngine();
		SequentialModelExecutionContext<IK3RunConfiguration> executioncontext = new SequentialModelExecutionContext<IK3RunConfiguration>(
				runConfiguration, executionMode);
		//executioncontext.getExecutionPlatform().getModelLoader().setProgressMonitor(this.launchProgressMonitor);
		executioncontext.initializeResourceModel();
		executionEngine.initialize(executioncontext);
		return executionEngine;
	}

}
