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
package org.eclipse.gemoc.commons.eclipse.resource.merging;

import java.util.ArrayList;

import org.eclipse.core.resources.IFile;

public class ResourcesMergerContext {

	private IFile _inputFile;
	public void setInputFile(IFile inputFile) {
		_inputFile = inputFile;
	}
	public IFile getInputFile() {
		return _inputFile;
	}

	private IFile _outputFile;
	public void setOutputFile(IFile outputFile) {
		_outputFile = outputFile;
	}
	public IFile getOutputFile() {
		return _outputFile;
	}

	private ArrayList<IBeforeSavingAction> _beforeSavingActions = new ArrayList<IBeforeSavingAction>();
	public void addBeforeSavingActions(IBeforeSavingAction action) {
		_beforeSavingActions.add(action);
	}
	public ArrayList<IBeforeSavingAction> getBeforeSavingActions() {
		return _beforeSavingActions;
	}

	
}
