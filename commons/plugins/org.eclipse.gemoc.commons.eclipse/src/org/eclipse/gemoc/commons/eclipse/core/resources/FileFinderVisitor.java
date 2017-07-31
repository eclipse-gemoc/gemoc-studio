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
package org.eclipse.gemoc.commons.eclipse.core.resources;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;

public class FileFinderVisitor implements IResourceVisitor {

	/**
	 * Searched file extensions
	 * @param searchedFileExtensions, must not be empty,
	 *  must contain the empty string to match file without extensions
	 */
	public FileFinderVisitor(List<String> searchedFileExtensions) 
	{
		_searchedFileExtensions.addAll(searchedFileExtensions);
	}
	
	public FileFinderVisitor(String searchedFileExtension) 
	{
		_searchedFileExtensions.add(searchedFileExtension);
	}
	
	private ArrayList<String> _searchedFileExtensions = new ArrayList<String>();
	
	protected List<IFile> _files = new ArrayList<IFile>();
	
	/**
	 * @return the first file found, or null if not file found
	 */
	public IFile getFile() {
		if(_files.isEmpty()) return null;
		return _files.get(0);
	}
	/** 
	 * 
	 * @return a list of the files found
	 */
	public List<IFile> getFiles() {
		return _files;
	}

	@Override
	public boolean visit(IResource resource) throws CoreException {
		boolean mustVisitChild = true;
		if(resource instanceof IFile){
			String resourceExtension = resource.getFileExtension();
			if(resourceExtension == null){
				resourceExtension = "";
			}
			if(_searchedFileExtensions.contains(resourceExtension)){
				_files.add((IFile) resource);
			}
			mustVisitChild = false;
		}
		return mustVisitChild;
	}

}
