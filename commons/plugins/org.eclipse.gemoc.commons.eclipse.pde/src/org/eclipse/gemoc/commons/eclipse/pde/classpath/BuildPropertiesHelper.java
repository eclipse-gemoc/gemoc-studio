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

import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gemoc.commons.eclipse.core.resources.IFileUtils;


public class BuildPropertiesHelper {
	/**
	 * Add a new source entry (for the main jar "." ) to build.properties file.
	 * This is equivalent to call  addJarSourceEntry(project, ".", newSourceEntryValue,  monitor)
	 * @throws IOException 
	 */
	public static void addMainJarSourceEntry(IProject project, String newSourceEntryValue, IProgressMonitor monitor) throws CoreException, IOException {
		addJarSourceEntry(project, ".", newSourceEntryValue, monitor);
	}
	
	/**
	 * Add a new source entry for a given jar to build.properties file
	 * This is equivalent to call  addEntryInProperty(project, "source."+jarName, newSourceEntryValue,  monitor)
	 * @throws IOException 
	 * @param project
	 * @param jarName
	 * @param newSourceEntryValue new value that must be added in the source property of the given jar
	 * @param monitor
	 * @throws CoreException
	 * @throws IOException
	 */
	public static void addJarSourceEntry(IProject project, String jarName, String newSourceEntryValue, IProgressMonitor monitor) throws CoreException, IOException {
		addEntryInProperty(project, "source."+jarName, newSourceEntryValue,  monitor);
	}	
	
	/**
	 * Add a new  entry for a property of build.properties file
	 * This adds the entry  in the comma separated format for the property.
	 * If the entry is already present, the method will have no effect.
	 * @throws IOException 
	 * @param project
	 * @param propertyName
	 * @param newEntryValue new value that must be added in the source property of the given jar
	 * @param monitor
	 * @throws CoreException
	 * @throws IOException
	 */
	public static void addEntryInProperty(IProject project, String propertyName, String newEntryValue, IProgressMonitor monitor) throws CoreException, IOException {
			Properties properties = new Properties();
		IFile file = project.getFile("build.properties");
		if(file.exists()) {
			properties.load(file.getContents(true));
			String commaSeparatedPropvalues = properties.getProperty(propertyName);
			if(commaSeparatedPropvalues != null){
				// check if it is already there
				List<String> propValues = Arrays.asList(commaSeparatedPropvalues.split(","));
				for (String srcEntry : propValues) {
					if(srcEntry.trim().replaceAll("\\\\", "").equals(newEntryValue)){
						// nothing to do, already there!
						return;
					}
				}
				// not found, so add it to the end
				String newcommaSeparatedPropvalues = commaSeparatedPropvalues + ","+newEntryValue;
				properties.setProperty(propertyName, newcommaSeparatedPropvalues);
			} else {
				properties.setProperty(propertyName, newEntryValue);
			}
		} else {
			properties.setProperty(propertyName, newEntryValue);
		}
		StringWriter writer = new StringWriter();
		properties.store(writer, "");
		IFileUtils.writeInFile(file, writer.toString(), monitor);
	}
}
