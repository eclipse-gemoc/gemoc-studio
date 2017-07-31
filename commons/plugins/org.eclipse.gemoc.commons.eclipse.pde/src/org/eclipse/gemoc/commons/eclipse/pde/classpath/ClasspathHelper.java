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
package org.eclipse.gemoc.commons.eclipse.pde.classpath;

import java.util.ArrayList;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;

public class ClasspathHelper {

	/**
	 * Add a new entry to the existing java project
	 * 	you can use JavaCore factory to create the entry itself
	 * 	ex : JavaCore.newProjectEntry(ecoreIFile.getProject().getFullPath())
	 * If the entry is already there, the method will do nothing.
	 */
	public static void addEntry(IProject project, IClasspathEntry newEntry, IProgressMonitor monitor) throws CoreException{
		IJavaProject javaProject = (IJavaProject)project.getNature(JavaCore.NATURE_ID);
		ArrayList<IClasspathEntry> newClassPathArrayList = new ArrayList<IClasspathEntry>();
		IClasspathEntry[] previousentries = javaProject.getRawClasspath();
		for(IClasspathEntry previousentry : previousentries){
			newClassPathArrayList.add(previousentry);
		}
		if(!newClassPathArrayList.contains(newEntry)){
			newClassPathArrayList.add(newEntry);
			IClasspathEntry[] newClassPath = new IClasspathEntry[newClassPathArrayList.size()];
			javaProject.setRawClasspath(newClassPathArrayList.toArray(newClassPath), monitor);
		}
	}
	
	/**
	 * Add a new Source entry (as String) to the existing java project
	 * The project must have the java nature
	 * If the entry is already there, the method will do nothing.
	 */
	public static void addSourceEntry(IProject project, String newEntryFolder, IProgressMonitor monitor) throws CoreException{
		IJavaProject javaProject = (IJavaProject) project.getNature(JavaCore.NATURE_ID);
		IClasspathEntry entry = JavaCore.newSourceEntry(javaProject.getPackageFragmentRoot(project.getFolder(newEntryFolder)).getPath());
		addEntry(project, entry, monitor);
	}
}
