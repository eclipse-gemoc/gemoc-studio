/*******************************************************************************
 * Copyright (c) 2016, 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package org.eclipse.gemoc.gemoc_studio.headless.runner;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.gemoc.execution.sequential.javaxdsml.api.extensions.languages.SequentialLanguageDefinitionExtension;
import org.eclipse.gemoc.execution.sequential.javaxdsml.api.extensions.languages.SequentialLanguageDefinitionExtensionPoint;
import org.eclipse.gemoc.executionframework.engine.commons.DefaultExecutionPlatform;
import org.eclipse.gemoc.executionframework.engine.commons.EngineContextException;
import org.eclipse.gemoc.executionframework.engine.commons.AbstractModelExecutionContext;
import org.eclipse.gemoc.trace.commons.model.trace.MSEModel;
import org.eclipse.gemoc.xdsmlframework.api.core.ExecutionMode;
import org.eclipse.gemoc.xdsmlframework.api.core.IRunConfiguration;

public class SequentialModelHeadlessExecutionContext<T extends IRunConfiguration> extends AbstractModelExecutionContext<T, DefaultExecutionPlatform, SequentialLanguageDefinitionExtension> {

	public SequentialModelHeadlessExecutionContext(T runConfiguration, ExecutionMode executionMode)
			throws EngineContextException {
		super(runConfiguration, executionMode);
	}

	@Override
	protected SequentialLanguageDefinitionExtension getLanguageDefinition(String languageName) throws EngineContextException {
		SequentialLanguageDefinitionExtension languageDefinition = SequentialLanguageDefinitionExtensionPoint
				.findDefinition(_runConfiguration.getLanguageName());
		if (languageDefinition == null) {
			String message = "Cannot find sequential xdsml definition for the language "
					+ _runConfiguration.getLanguageName() + ", please verify that is is correctly deployed.";
			EngineContextException exception = new EngineContextException(message);
			throw exception;
		}
		return languageDefinition;
	}

	@Override
	public MSEModel getMSEModel() {
		return null;
	}

	@Override
	protected DefaultExecutionPlatform createExecutionPlatform() throws CoreException {
		return new DefaultExecutionPlatform(_languageDefinition, _runConfiguration);
	}

}
