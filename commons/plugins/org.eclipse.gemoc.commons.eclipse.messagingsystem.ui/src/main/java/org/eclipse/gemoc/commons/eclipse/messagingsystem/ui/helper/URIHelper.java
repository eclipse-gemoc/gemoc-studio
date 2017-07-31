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
package org.eclipse.gemoc.commons.eclipse.messagingsystem.ui.helper;

import java.util.List;

import org.eclipse.emf.common.util.URI;

/**
 * @author ftanguy
 *
 */
public class URIHelper {
	
	/**
	 * This method safely removes the platform:/resource scheme of the string uri given as a parameter.
	 * The uri parameter must be of the form platform:/resource/myDir/myFile
	 * @param uri
	 * @return The clean uri as a String
	 */
	static public String getPathFromPlatformURI(String uri) {
		URI u = URI.createURI(uri);
		String path = "";
		boolean mustAdd = false;
		for (String segment : ((List<String>) u.segmentsList()) ) {
			// Avoiding the add of "resource" segment
			if ( ! mustAdd )
				mustAdd = true;
			else
				path += "/" + segment;
		}
		return path;
	}
	/**
	 * return the uri without its last segment
	 * if the uri doesn't have a last segment (ex: http://spoon ), returns the uri itself
	 * @param uri
	 * @return
	 */
	static public String removeFileName(String uri) {
		URI u = URI.createURI(uri);
		if(u.lastSegment() != null)
				return u.toString().replace(u.lastSegment(), "");
		else return uri;
	}
		
}


