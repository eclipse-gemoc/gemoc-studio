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
package org.eclipse.gemoc.commons.eclipse.pde.ui;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.pde.internal.ui.wizards.tools.ConvertProjectToPluginOperation;

public class PluginConverter {

	
	final static public void convert(IProject project) 
			throws InvocationTargetException, InterruptedException
	{
		ConvertProjectToPluginOperation convertOperation = new ConvertProjectToPluginOperation(new IProject[]{project}, false);
		convertOperation.run(new NullProgressMonitor());
	}
	
}
