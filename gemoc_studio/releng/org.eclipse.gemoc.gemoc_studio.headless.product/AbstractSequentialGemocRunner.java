package org.eclipse.gemoc.gemoc_studio.headless.runner;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.gemoc.executionframework.engine.commons.EngineContextException;
import org.eclipse.gemoc.xdsmlframework.api.core.ExecutionMode;
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionContext;
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.eclipse.gemoc.xdsmlframework.api.core.IRunConfiguration;

public abstract class AbstractSequentialGemocRunner<C extends IExecutionContext<R, ?, ?>, R extends IRunConfiguration> {
	protected abstract IExecutionEngine<C> createExecutionEngine(R runConfiguration, ExecutionMode executionMode)
			throws CoreException, EngineContextException;
}
