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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;

public class IProjectUtils {

	/**
	 * Create recursively folders in the project.
	 * Do nothing if folder already exists.
	 * @param project
	 * @param nameOrPath
	 * @return
	 * @throws CoreException
	 */
	public static IFolder createFolder(IProject project, String nameOrPath) throws CoreException {
		return createFolder(project, nameOrPath, new NullProgressMonitor());
	}

	/**
	 * Create recursively folders in the project.
	 * Do nothing if folder already exists.
	 * @param project
	 * @param nameOrPath
	 * @param monitor
	 * @return 
	 * @throws CoreException
	 */
	public static IFolder createFolder(IProject project, String nameOrPath, IProgressMonitor monitor) throws CoreException {
		return createFolder(project, new Path(nameOrPath), monitor);
	}

	/**
	 * Create recursively folders in the project.
	 * Do nothing if folder already exists.
	 * @param project
	 * @param path
	 * @param monitor
	 * @return
	 * @throws CoreException
	 */
	public static IFolder createFolder(IProject project, IPath path, IProgressMonitor monitor) throws CoreException {
		IFolder folder = project.getFolder(path);
		if (!folder.exists()) {
			if (path.segmentCount() > 1) {
				IPath currentFolderPath = new Path("");
				for (int i=0; i<path.segmentCount()-1; i++) {
					currentFolderPath = currentFolderPath.append(path.segment(i));
					createFolder(project, currentFolderPath, monitor);
				}				
			}
			folder.create(true, true, monitor);
		}
		return folder;
	}

	/**
	 * Create a file in the project with default content.
	 * Do nothing if file already exists.
	 * @param project
	 * @param nameOrPath
	 * @param content
	 * @param monitor
	 * @return
	 * @throws CoreException
	 */
	public static IFile createFile(IProject project, String nameOrPath, String content, IProgressMonitor monitor) throws CoreException {
		ByteArrayInputStream contentStream = new ByteArrayInputStream(content.getBytes());
		IFile file = createFile(project, new Path(nameOrPath), contentStream, monitor);			
		return file;
	}
	
	/**
	 * Create a file in the project with default content.
	 * Do nothing if file already exists.
	 * @param project
	 * @param nameOrPath
	 * @param contentStream
	 * @param monitor
	 * @return
	 * @throws CoreException
	 */
	public static IFile createFile(IProject project, String nameOrPath, InputStream contentStream, IProgressMonitor monitor) throws CoreException {
		return createFile(project, new Path(nameOrPath), contentStream, monitor);
	}

	/**
	 * Create a file in the project with default content.
	 * Do nothing if file already exists.
	 * @param project
	 * @param path
	 * @param contentStream
	 * @param monitor
	 * @return
	 * @throws CoreException
	 */
	public static IFile createFile(IProject project, IPath path, InputStream contentStream, IProgressMonitor monitor) throws CoreException {
		IFile file = project.getFile(path);
		return createFile(project, file, contentStream, monitor);
	}
	
	public static IFile createFile(IProject project, IFile file, String content) throws CoreException {
		return createFile(project, file, content, new NullProgressMonitor());
	}

	public static IFile createFile(IProject project, IFile file, String content, IProgressMonitor monitor) throws CoreException {
		ByteArrayInputStream contentStream = new ByteArrayInputStream(content.getBytes());
		return createFile(project, file, contentStream, new NullProgressMonitor());
	}

	public static IFile createFile(IProject project, IFile file, InputStream contentStream, IProgressMonitor monitor) throws CoreException {
		if (!file.exists()) 
		{
			IPath path = file.getProjectRelativePath();
			if (path.segmentCount() > 1) {
				IPath currentFolderPath = new Path("");
				for (int i=0; i<path.segmentCount()-1; i++) {
					currentFolderPath = currentFolderPath.append(path.segment(i));
					createFolder(project, currentFolderPath, monitor);
				}				
			}
			try
			{
				file.create(contentStream, true, monitor);
			}
			finally
			{
				try {
					contentStream.close();
				} catch (IOException e) {
					throw new CoreException(new Status(Status.ERROR, "", "Could not close stream for file " + file.getFullPath(), e));
				}
			}
		}
		return file;
	}
	
	public static void addNature(IProject project, String natureId) throws CoreException 
	{
		IProjectDescription description = project.getDescription();
		String[] natures = description.getNatureIds();
		if (!project.hasNature(natureId)) 
		{
			String[] newNatures = new String[natures.length + 1];
			System.arraycopy(natures, 0, newNatures, 1, natures.length);
			newNatures[0] = natureId;
			description.setNatureIds(newNatures);
			project.setDescription(description, null);
		}
	}
	
	public static void removeNature(IProject project, String natureId) throws CoreException 
	{
		IProjectDescription description = project.getDescription();
		List<String> natures = Arrays.asList(description.getNatureIds());
		natures.remove(natureId);
		String[] newNatures = natures.toArray(new String[natures.size()]);
		description.setNatureIds(newNatures);
		project.setDescription(description, null);
	}
	
	public static NatureToggling toggleNature(IProject project, String natureId) throws CoreException
	{
		if (!project.hasNature(natureId)) 
		{
			addNature(project, natureId);
			return NatureToggling.Added;
		}
		else 
		{
			removeNature(project, natureId);
			return NatureToggling.Removed;
		}
	}

	public static void setFileContent(IProject project, String filePath, String fileContent) throws CoreException 
	{
		setFileContent(project, new Path(filePath), fileContent);
	}
	
	public static void setFileContent(IProject project, IPath filePath, String fileContent) throws CoreException 
	{
		IFile file = project.getFile(filePath);
		setFileContent(project, file, fileContent, new NullProgressMonitor());
	}
	
	public static void setFileContent(IProject project, IFile file, String fileContent, IProgressMonitor monitor) throws CoreException 
	{
		if (file.exists()) 
		{
			ByteArrayInputStream contentStream = new ByteArrayInputStream(fileContent.getBytes());
			try
			{
				file.setContents(contentStream, true, true, monitor);
			}
			finally
			{
				try {
					contentStream.close();
				} catch (IOException e) {
					throw new CoreException(new Status(Status.ERROR, "", "Could not close stream for file " + file.getFullPath(), e));
				}
			}
		}
	}

}
