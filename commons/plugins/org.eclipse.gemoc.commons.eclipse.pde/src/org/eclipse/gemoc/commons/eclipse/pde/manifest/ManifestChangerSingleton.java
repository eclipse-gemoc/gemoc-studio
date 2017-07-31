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
package org.eclipse.gemoc.commons.eclipse.pde.manifest;

import java.io.IOException;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import org.eclipse.core.runtime.CoreException;
import org.osgi.framework.BundleException;

import org.eclipse.gemoc.commons.eclipse.pde.manifest.ManifestChanger;

class ManifestChangerSingleton {

	private ManifestChanger _connection;
	
	public ManifestChangerSingleton(ManifestChanger connection) {
		_connection = connection;
	}
	
	private Manifest getManifest() throws IOException, CoreException {
		return _connection.getManifest();
	}
	
	public void apply() throws BundleException, IOException, CoreException {
		final String bundleSymbolicNameHeader = "Bundle-SymbolicName";
		Attributes mainAttrs = getManifest().getMainAttributes();
		String value = null;
		for (Object entryName : mainAttrs.keySet()) {
			String header;

			// Get the values safely
			if (entryName instanceof String) {
				header = (String) entryName;
				value = mainAttrs.getValue(header);
			} else if (entryName instanceof Attributes.Name) {
				header = (String) ((Attributes.Name) entryName).toString();
				value = mainAttrs.getValue((Attributes.Name) entryName);
			} else {
				throw new BundleException("Unknown Main Attribute Key type: "
						+ entryName.getClass() + " (" + entryName + ")");
			}

			// loop to the next header if we don't find ours
			if (bundleSymbolicNameHeader.equals(header)){
				break;
			}
		}
		if(value != null && !value.endsWith( ";singleton:=true")){
			// doesn't exist or already have it, so do not try to add the singleton ...
			getManifest().getMainAttributes().putValue(bundleSymbolicNameHeader,
					value + ";singleton:=true");
		}
	}
	
}
