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

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.swt.widgets.Shell;

public class SelectPluginIProjectDialog extends SelectAnyIProjectDialog {

	public SelectPluginIProjectDialog(Shell parentShell) {
		super(parentShell);
	}

	@Override
	protected boolean select(IResource resource) {
		boolean result = super.select(resource);
		if(resource instanceof IProject){
			// must contain a manifest.mf file
			boolean hasManifestFile = ((IProject)resource).findMember("META-INF/MANIFEST.MF") != null;
			/*
			FileFinderVisitor projectVisitor = new FileFinderVisitor("mf");
			try {
				resource.accept(projectVisitor);
				hasManifestFile = projectVisitor.getFile() != null;
			} catch (CoreException e) {
				Activator.error(e.getMessage(), e);
			}*/
			result = result && hasManifestFile;
		}
		return result;
	}
}
