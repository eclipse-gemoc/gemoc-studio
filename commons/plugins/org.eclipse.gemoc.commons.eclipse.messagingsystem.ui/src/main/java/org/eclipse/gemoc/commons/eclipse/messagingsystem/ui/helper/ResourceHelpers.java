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
package org.eclipse.gemoc.commons.eclipse.messagingsystem.ui.helper;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Hashtable;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.QualifiedName;

public class ResourceHelpers {
	/**
	 * The eclipse workspace.
	 */
	static final public IWorkspace workspace = ResourcesPlugin.getWorkspace();
	
	/**
	 * The eclipse workspace's root
	 */
	static final public IWorkspaceRoot root = workspace.getRoot();
	
	
	/**
	 * The resource's path may contain annoying extras schemes like platform:/resource or file:/${workspacelocation}
	 * This method checks if the existency of such schemes and remove them.
	 * @param resourcePath
	 * @return It returns the clean path.
	 */
	static private String cleanIfNecessaryPath(String resourcePath) {
		// deal with windows \\ delimiter
		String unifiedSepratorResourcePath = resourcePath.replaceAll("\\\\", "/");
		
		String cleanPath = unifiedSepratorResourcePath;
		if ( unifiedSepratorResourcePath.matches("platform:/resource.*") )
			cleanPath = URIHelper.getPathFromPlatformURI(resourcePath);
		else /*if ( unifiedSepratorResourcePath.matches("platform:/plugin.*") )
			cleanPath = URIHelper.getPathFromPlatformURI(resourcePath);
		else*/ if ( unifiedSepratorResourcePath.matches("file:/.*") ){
			String rootPath = ""; // path of the workspace root that we will remove from the resource path
			
			// deal with windows path
			if ( unifiedSepratorResourcePath.matches("file:/.:/.+") ) {
				rootPath = "file:/" + root.getLocation().toString().replaceAll(" ", "%20");
			} else {
				rootPath = "file:" + root.getLocation().toString();
			}
				
			cleanPath = unifiedSepratorResourcePath.replace(rootPath, "");
		}
		return cleanPath;
	}
	
	
	/**
	 * This methods gives an IFile resource corresponding to the file path in the workspace.
	 * Note: it cannot retreive IFile outside of the workspace
	 * @see org.eclipse.core.resources.IFile
	 * @param filePath The path of the file. It accepts several formats:
	 * 		- relative to the workspace root directory (ex: /myProject/myDir/myFile).
	 * 		- platform:/resource url (ex: platform:/resource/myProject/mydir/myFile).
	 * 		- file:/ url (ex: file:/C:/eclipse/workspace/myProject/mydir/myFile or file:/udd/userName/eclipse/workspace/myProject/mydir/myFile
	 * 			note that in this case it will work only if the file is really in the workspace 
	 * @return The method returns an IFile resource.
	 */
	static public IFile getIFile(String filePath) {
		/*String cleanPath = cleanIfNecessaryPath(filePath);
		Path path = new Path(cleanPath);
		try {
			IFile file = root.getFile(path);
			if ( file.exists() )
				return file;
			else 
				return null;
		} catch (java.lang.IllegalArgumentException exception) {
			return null;
		}*/
		return getIFile(filePath, true);
	}
	
	static public IFile getIFile(String filePath, boolean checkExistency) {
		String cleanPath = cleanIfNecessaryPath(filePath);
		Path path = new Path(cleanPath);
		try {
			IFile file = root.getFile(path);
			if ( ! checkExistency )
				return file;
			else {
				if ( file.exists() )
					return file;
				else 
					return null;
			}
		} catch (java.lang.IllegalArgumentException exception) {
			return null;
		}
	}
	
	/**
	 * This methods gives an IFile resource corresponding to the file path in the workspace.
	 * No control is done. It means that even if the file does not exist, you will be given a resource.
	 * Note: it cannot retreive IFile outside of the workspace
	 * @see org.eclipse.core.resources.IFile
	 * @param filePath The path of the file. It accepts several formats:
	 * 		- relative to the workspace root directory (ex: /myProject/myDir/myFile).
	 * 		- platform:/resource url (ex: platform:/resource/myProject/mydir/myFile).
	 * 		- file:/ url (ex: file:/C:/eclipse/workspace/myProject/mydir/myFile or file:/udd/userName/eclipse/workspace/myProject/mydir/myFile
	 * 			note that in this case it will work only if the file is really in the workspace 
	 * @return The method returns an IFile resource.
	 */
	static public IFile getOrCreateIFile(String filePath) {
		String cleanPath = cleanIfNecessaryPath(filePath);
		Path path = new Path(cleanPath);
		try {
			IFile file = root.getFile(path);
			return file;
		} catch (java.lang.IllegalArgumentException exception) {
			return null;
		}
	}
	
	static public IResource getIResourceFromURL(URL url){
		IWorkspace workspace= ResourcesPlugin.getWorkspace();
		IResource ifile = (IResource) workspace.getRoot().findMember(FileHelpers.URLToStringWithoutFile(url));
		if(ifile == null && url.getProtocol().equals("file")){
			// try another method
			try {
				File file = new File(url.toURI());
				IPath location= Path.fromOSString(file.getAbsolutePath()); 
				ifile = workspace.getRoot().getFileForLocation(location);
			} catch (URISyntaxException e) {
			}
		}
		return ifile;
	}
	
	/**
	 * This method is the same as calling getIFile with filePath + "/" + fileName as argument.
	 * @see ResourceHelper#getIFile(String filePath)
	 * @param filePath
	 * @param fileName
	 * @return The method returns an IFile resource
	 */
	static public IFile getIFile(String filePath, String fileName) {
		return getIFile( filePath + "/" + fileName );
	}	
	
	/**
	 * This methods gives an IFolder resource corresponding to the folder path.
	 * No control is done. It means that even if the folder does not exist, you will be given a resource.
	 * @see{org.eclipse.core.resources.IFolder}
	 * @param folderPath The path of the folder relative to the workspace root directory (ex: /myProject/myFolder). 
	 * @return The method returns an IFolder resource.
	 */
	static public IFolder getIFolder(String folderPath) {
		String cleanPath = cleanIfNecessaryPath(folderPath);
		Path path = new Path(cleanPath);
		try {
			return root.getFolder(path);	
		} catch (java.lang.IllegalArgumentException exception) {
			return null;
		}
	}
	
	/**
	 * This method is the same as calling getIFolder with folderPath + "/" + folderName as argument.
	 * @see ResourceHelper#getIFolder(String folderPath)
	 * @param folderPath
	 * @param folderName
	 * @return The method returns an IFolder resource.
	 */
	static public IFolder getIFolder(String folderPath, String folderName) {
		return getIFolder( folderPath + "/" + folderName );
	}
	
	
	/**
	 * This methods gives an IProject resource corresponding to the project name.
	 * No control is done. It means that even if the project does not exist, you will be given a resource.
	 * @see{org.eclipse.core.resources.IProject}
	 * @param projectName The name of the project relative to the workspace root directory. 
	 * @return The method returns an IProject resource.
	 */
	static public IProject getIProject(String projectName) {
		return root.getProject(projectName);
	}
	
	
	static public String getFileExtension(String filePath) {
		IFile file = getIFile(filePath);
		return file.getFileExtension();
	}
	
	static public URL IResourceToURL(IResource resource) throws MalformedURLException {
		URI locationURI = resource.getLocationURI();
		return locationURI.toURL();		
	}

	//////////////////////////////////
	//////////////////////////////////
	//		Property Mechanism		//
	//////////////////////////////////
	//////////////////////////////////
	static public String getProperty(IResource resource, String qualifiedProperyName) throws PropertyNotFoundException {
		int index = qualifiedProperyName.lastIndexOf(".");
		String qualifer = qualifiedProperyName.substring(0, index);
		String localName = qualifiedProperyName.substring(index+1);
		QualifiedName key = new QualifiedName(qualifer, localName);
		String result = "";
		try {
			result = resource.getPersistentProperty(key);
			if ( result == null )
				throw new PropertyNotFoundException(resource, qualifiedProperyName);
		} catch (CoreException e) {}
		return result;
	}
	
	static public void setProperty(IResource resource, String qualifiedProperyName, boolean value) {
		int index = qualifiedProperyName.lastIndexOf(".");
		String qualifer = qualifiedProperyName.substring(0, index);
		String localName = qualifiedProperyName.substring(index+1);
		QualifiedName key = new QualifiedName(qualifer, localName);
		try {
			resource.setPersistentProperty(key, String.valueOf(value));
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	static public void setPropertyRecursively(IResource resource, final String qualifiedName, final boolean value) {
		IResourceVisitor visitor = new IResourceVisitor() {
			public boolean visit(IResource resource) throws CoreException {
				boolean result = false;
				switch ( resource.getType() ) {
				
				case IResource.FILE :
					setProperty(resource, qualifiedName, value);
					break;
					
				case IResource.FOLDER :
					result = true;
					setProperty(resource, qualifiedName, value);
					break;
					
				case IResource.PROJECT :
					result = true;
					setProperty(resource, qualifiedName, value);
					break;
				}
				return result;
			}
			 
		 };
		 try {
			resource.accept( visitor );
		} catch (CoreException e) {}
	}
	
	static public void setPropertyRecursively(IResource resource, final Hashtable<String, Boolean> qualifiedNames) {
		IResourceVisitor visitor = new IResourceVisitor() {
			public boolean visit(IResource resource) throws CoreException {
				boolean result = false;
				switch ( resource.getType() ) {
				
				case IResource.FILE :
					for ( String s : qualifiedNames.keySet() )
						setProperty(resource, s, qualifiedNames.get(s) );
					break;
					
				case IResource.FOLDER :
					result = true;
					for ( String s : qualifiedNames.keySet() )
						setProperty(resource, s, qualifiedNames.get(s) );
					break;
					
				case IResource.PROJECT :
					result = true;
					for ( String s : qualifiedNames.keySet() )
						setProperty(resource, s, qualifiedNames.get(s) );
					break;
				}
				return result;
			}
			 
		 };
		 try {
			resource.accept( visitor );
		} catch (CoreException e) {}
		
	}
	//////////////////////////////////////////
	//////////////////////////////////////////
	//		End of Property Mechanism		//
	//////////////////////////////////////////
	//////////////////////////////////////////

    
    /**
	 * This methods removes an IProject resource corresponding to the project name.
	 * @param projectName The name of the project relative to the workspace root directory
	 * @param force a flag controlling whether resources that are not
	 * in sync with the local file system will be tolerated
	 */
	static public void deleteIProject(String projectName, boolean force) {
		try {
			if( getIProject(projectName) != null ) {
				getIProject(projectName).delete(true, force, new NullProgressMonitor());
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
}
