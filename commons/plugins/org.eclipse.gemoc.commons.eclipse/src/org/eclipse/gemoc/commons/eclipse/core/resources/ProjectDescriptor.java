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

public class ProjectDescriptor {
	private String bundleName;
	private String zipLocation;
	
	/**
	 * Construct a descriptor that points to a zip file located
	 *  in a particular bundle at the given location within that
	 *  bundle. Also provided is the project name for which the
	 *  zip is the contents. Note that this project name should
	 *  be the same as is in the contents not some alternative name.
	 *  
	 * @param bundleName The bundle in the runtime that contains the
	 *  zipped up project contents.
	 * @param zipLocation The location within the bundle where the
	 *  zip file is located.
	 * @param projectName The project name in the workspace that
	 *  will be created to house the project contents.
	 */
	public ProjectDescriptor(String bundleName, String zipLocation) {
		super();
		this.bundleName = bundleName;
		this.zipLocation = zipLocation;
	}

	public String getBundleName() {
		return bundleName;
	}
	
	public String getZipLocation() {
		return zipLocation;
	}
}
