/*******************************************************************************
 * Copyright (c) 2011, 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package org.eclipse.gemoc.commons.eclipse.messagingsystem.ui.internal;

import java.net.URL;
import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystem;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystem.Kind;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.ui.Activator;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.ui.EclipseMessagingSystem;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.ui.helper.FileHelpers;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.ui.helper.ResourceHelpers;
import org.eclipse.gemoc.commons.messagingsystem.api.reference.FileReference;
import org.eclipse.gemoc.commons.messagingsystem.api.reference.Reference;
import org.eclipse.gemoc.commons.messagingsystem.api.reference.TextReference;
import org.eclipse.ui.texteditor.MarkerUtilities;

public class EclipseReporter {
	
	public static final String PROBLEM_MARKER_ID = Activator.PLUGIN_ID+".Kermeta2ProblemMarker";
	public static final String KERMETA_MARKER_ATTRIBUTE = "kermeta2_marker";
	
	protected MessagingSystem ms;
	
	public EclipseReporter(EclipseMessagingSystem eclipseMessagingSystem) {
		ms = eclipseMessagingSystem;
	}

	public void addMarker( int markerSeverity, Reference ref, String msg, String msgGroup){
		if(ref instanceof TextReference){
			try {
				IFile iFile = (IFile)  ResourceHelpers.getIResourceFromURL(((TextReference)ref).getFileURL());
				iFile = check(iFile,((TextReference)ref).getFileURL());
				addMarker(markerSeverity, PROBLEM_MARKER_ID, iFile,msg, ((TextReference) ref).getBeginLine(), ((TextReference) ref).getBeginOffset(), ((TextReference) ref).getEndOffset(),msgGroup);
				ms.log(Kind.DevDEBUG, "File marked ("+iFile+")", Activator.PLUGIN_ID);
			} catch (Exception e) {
				ms.log(Kind.DevERROR, "Failed to mark TextFile ("+((TextReference)ref).getFileURL().getPath()+") => "+msg, Activator.PLUGIN_ID, e);
			}
		}
		else if(ref instanceof FileReference){
			try {
				IFile iFile = (IFile) ResourceHelpers.getIResourceFromURL(((FileReference)ref).getFileURL());
				iFile = check(iFile,((FileReference)ref).getFileURL());
				addMarker(markerSeverity, PROBLEM_MARKER_ID, iFile,msg,msgGroup);
				ms.log(Kind.DevDEBUG, "File marked ("+iFile+")", Activator.PLUGIN_ID);
			} catch (Exception e) {
				ms.log(Kind.DevERROR, "Failed to mark File ("+((FileReference)ref).getFileURL().getPath()+") => "+msg, Activator.PLUGIN_ID, e);
			}
		}
		/*else if(ref instanceof ModelReference){
			
		}*/
	}
	
	public void addMarker(int markerSeverity, String Marker,IFile file, String message, Integer lineNumber, Integer beginChar, Integer endChar, String msgGroup) {
		try {
			HashMap<String, java.lang.Object> datas = new HashMap<String, java.lang.Object>();
	        datas.put( IMarker.MESSAGE, message != null ? message : "<null>" );
	        datas.put( IMarker.SEVERITY, markerSeverity );
	        
	        if ( beginChar != null )
	        	datas.put( IMarker.CHAR_START, beginChar );
	        else
	        	datas.put( IMarker.CHAR_START, 0 );
	 
	        if ( endChar != null )
	           	datas.put( IMarker.CHAR_END, endChar );
	       	else
	       		datas.put( IMarker.CHAR_END, 0 );
	        if(lineNumber != null)
	        	datas.put(IMarker.LINE_NUMBER, lineNumber);
	        datas.put(KERMETA_MARKER_ATTRIBUTE, msgGroup);
	        MarkerUtilities.createMarker( file, datas, IMarker.PROBLEM );
		/*
			IMarker marker = file.createMarker(Marker);
			marker.setAttribute(IMarker.MESSAGE, message != null ? message : "<null>");
			marker.setAttribute(IMarker.SEVERITY, markerSeverity);
			if (lineNumber == -1) {
				lineNumber = 1;
			}
			marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
			marker.setAttribute(IMarker.CHAR_START, beginChar);
			marker.setAttribute(IMarker.CHAR_END, endChar);
			marker.setAttribute(KERMETA_MARKER_ATTRIBUTE, msgGroup);
		*/
		} catch (CoreException e) {
			ms.log(Kind.DevERROR, "Failed to mark TextFile", Activator.PLUGIN_ID, e);
		}
	}
	
	public void addMarker(int markerSeverity, String Marker,IFile file, String message, String msgGroup) {
		addMarker(markerSeverity, Marker, file, message, 0, 0,0, msgGroup);
	}

	
	
	private IFile check(IFile iFile, URL theRef) {
		if (iFile != null) {
			return iFile;
		}
		for (IProject aProject : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
			IFile attempt = (IFile) ResourcesPlugin.getWorkspace().getRoot().findMember(FileHelpers.URLToStringWithoutFile(theRef).replaceFirst(aProject.getLocation().toString().substring(0, aProject.getLocation().toString().lastIndexOf(aProject.getName())), ""));
			if (attempt != null) {
				return attempt;
			}
			
		}
		return null;
	}
	
	public void flushProblem(final String problemGroup,final URL url) {
		try {
			IResource ifile = ResourceHelpers.getIResourceFromURL(url);
			if(ifile != null){
				for (IMarker aMarker : ifile.findMarkers(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE)) {
					if (aMarker.getAttribute(KERMETA_MARKER_ATTRIBUTE).equals(problemGroup)) {
						//ms.log(Kind.DevDEBUG, "#removing marker on "+ uri+" - problemGroup="+problemGroup, Activator.PLUGIN_ID , new Exception());
						aMarker.delete();
					}
				}
			}
		} catch (CoreException e) {
			ms.log(Kind.DevERROR, "Failed to flush markers for group "+problemGroup, Activator.PLUGIN_ID, e);
		} catch (NullPointerException e) {}
	}
	
	public void flushAllProblems(URL url) {
		try {
			IResource ifile = ResourceHelpers.getIResourceFromURL(url);			
			if(ifile !=null) ifile.deleteMarkers(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE);
		} catch (CoreException e) {
			ms.log(Kind.DevERROR, "Failed to flush all markers", Activator.PLUGIN_ID, e);
		} catch (NullPointerException e) {}
	}
}
