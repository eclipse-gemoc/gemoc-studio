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
package org.eclipse.gemoc.commons.eclipse.ui.dialogs;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.gemoc.commons.eclipse.core.resources.FileFinderVisitor;
import org.eclipse.gemoc.commons.eclipse.ui.Activator;

/**
 * Project finder dialog that searches for a Plugin project containing at least one file with one of the given extension. 
 *
 */
public class SelectPluginIProjectWithFileExtensionDialog extends SelectPluginIProjectDialog {

	protected FileFinderVisitor projectVisitor;
	public SelectPluginIProjectWithFileExtensionDialog(Shell parentShell, List<String> searchedFileExtensions) {
		super(parentShell);
		projectVisitor = new FileFinderVisitor(searchedFileExtensions);
	}
	public SelectPluginIProjectWithFileExtensionDialog(Shell parentShell, String searchedFileExtension) {
		super(parentShell);
		projectVisitor = new FileFinderVisitor(searchedFileExtension);
	}

	@Override
	protected boolean select(IResource resource) {
		boolean result = super.select(resource);
		if(resource instanceof IProject){
			boolean hasFileWithExtension = false;
			
			try {
				resource.accept(projectVisitor);
				hasFileWithExtension = projectVisitor.getFile() != null;
			} catch (CoreException e) {
				Activator.error(e.getMessage(), e);
			}
			result = result && hasFileWithExtension;
		}
		return result;
	}
}
