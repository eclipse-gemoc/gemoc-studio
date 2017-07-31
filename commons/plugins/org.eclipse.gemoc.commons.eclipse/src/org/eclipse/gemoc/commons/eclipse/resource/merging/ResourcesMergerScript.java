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

import java.io.IOException;

import org.eclipse.core.resources.IFile;

public class ResourcesMergerScript {

	public static ResourcesMergerScript allResourcesFrom(IFile inputFile) {
		ResourcesMergerContext context = new ResourcesMergerContext();
		context.setInputFile(inputFile);
		return new ResourcesMergerScript(context);
	}

	
	private ResourcesMergerContext _context;
	
	ResourcesMergerScript(ResourcesMergerContext context) {
		_context = context;
	}

	public ResourcesMergerScript mergeInto(IFile outputFile) {
		_context.setOutputFile(outputFile);
		return this;
	}

	public ResourcesMergerScript beforeSavingPerform(IBeforeSavingAction action) {
		_context.addBeforeSavingActions(action);
		return this;
	}

	public void go() throws IOException {
		ResourceMerger merger = new ResourceMerger(_context);
		merger.merge();
	}
	
}
