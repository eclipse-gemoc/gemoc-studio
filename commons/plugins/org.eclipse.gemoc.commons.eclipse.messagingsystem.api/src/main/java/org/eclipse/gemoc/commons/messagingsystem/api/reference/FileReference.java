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
package org.eclipse.gemoc.commons.messagingsystem.api.reference;

import java.net.URL;

public class FileReference extends Reference {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8923951563039501091L;
	protected URL fileURL;

	
	
	public FileReference(URL fileURL) {
		super();
		this.fileURL = fileURL;
	}

	// getters and setters
	public URL getFileURL() {
		return fileURL;
	}

	public void setFileURL(URL fileURL) {
		this.fileURL = fileURL;
	}
	
	
	
}
