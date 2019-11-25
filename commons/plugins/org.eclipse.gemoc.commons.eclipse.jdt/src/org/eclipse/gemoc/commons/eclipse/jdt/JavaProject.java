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
package org.eclipse.gemoc.commons.eclipse.jdt;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.gemoc.commons.eclipse.core.resources.IProjectUtils;

public class JavaProject 
{

	static public void create(IProject project) throws CoreException, IOException
	{
		if(!project.hasNature(JavaCore.NATURE_ID)){
			JavaCore.create(project);
			IProjectUtils.addNature(project, JavaCore.NATURE_ID);
			IProjectUtils.createFolder(project, "src/main/java", new NullProgressMonitor());
			IProjectUtils.createFolder(project, "src/main/xdsml-java-gen", new NullProgressMonitor());
			addJavaResources(project);
		}		
	}
	
	public static final String CLASSPATH_TEMPLATE= "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+
"<classpath>\n"+
"	<classpathentry kind=\"src\" path=\"src/main/java\"/>\n"+
"	<classpathentry kind=\"src\" path=\"src/main/xdsml-java-gen\"/>\n"+
"	<classpathentry kind=\"con\" path=\"org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.6\"/>\n"+
"	<classpathentry kind=\"output\" path=\"bin\"/>\n"+
"</classpath>";
	
	private static void addJavaResources(IProject project) throws CoreException, IOException 
	{
		final IFile file = project.getFile(new Path(".classpath")); 
		InputStream stream = null;
		try 
			{
				stream = new ByteArrayInputStream(CLASSPATH_TEMPLATE.getBytes());
				if (file.exists()) 
				{
					file.setContents(stream, true, true, null);
				} 
				else 
				{
					file.create(stream, true, null);
				}
			} 
			finally
			{
				if (stream != null)
					stream.close();				
			}
	}
	
	/**
	 * Add the folder as a java source folder (ie. update the classpath)
	 * @param project
	 * @param folder
	 * @throws JavaModelException
	 */
	public static void addSourceFolder(IProject project, String folder) throws JavaModelException{
		IJavaProject javaProject = JavaCore.create(project);
		IClasspathEntry[] entries = javaProject.getRawClasspath();
		IClasspathEntry[] newEntries = new IClasspathEntry[entries.length + 1];
		System.arraycopy(entries, 0, newEntries, 0, entries.length);

		IPath srcPath= javaProject.getPath().append(folder);
		IClasspathEntry srcEntry= JavaCore.newSourceEntry(srcPath, null);
		
		boolean entryfound = false;
		for (IClasspathEntry cpe : entries) {
			if (cpe.equals(srcEntry)){
				entryfound = true;
			}
		}
		
		if (! entryfound) {
			newEntries[entries.length] = JavaCore.newSourceEntry(srcEntry.getPath());
			javaProject.setRawClasspath(newEntries, null);
		}
	}

}
