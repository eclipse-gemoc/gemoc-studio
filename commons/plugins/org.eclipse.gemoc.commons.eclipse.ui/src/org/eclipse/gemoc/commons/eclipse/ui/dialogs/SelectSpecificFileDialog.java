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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.gemoc.commons.eclipse.core.resources.FileFinderVisitor;
import org.eclipse.gemoc.commons.eclipse.ui.Activator;

public abstract class SelectSpecificFileDialog extends SelectAnyIFileDialog {

	
	
	@Override
	protected boolean select(IResource resource) {
		boolean result = super.select(resource);
		if(resource instanceof IFile) {			
			FileFinderVisitor finder = instanciateFinder();
			try {
				resource.accept(finder);
				result = finder.getFile() != null;				
			} catch (CoreException e) {
				Activator.error(e.getMessage(), e);
			}	
		} 
		return result;
	}

	protected abstract FileFinderVisitor instanciateFinder();
	
}
