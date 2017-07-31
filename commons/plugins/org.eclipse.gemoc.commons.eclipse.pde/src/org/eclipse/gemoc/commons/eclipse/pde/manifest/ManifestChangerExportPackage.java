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
import org.eclipse.osgi.util.ManifestElement;
import org.osgi.framework.BundleException;

import org.eclipse.gemoc.commons.eclipse.pde.manifest.ManifestChanger;

public class ManifestChangerExportPackage {
	private ManifestChanger _mfChanger;
	public ManifestChangerExportPackage(ManifestChanger connection) {
		_mfChanger = connection;
	}
	
	public void add(String packageName) throws BundleException, IOException, CoreException {
		final String exportPackageHeader = "Export-Package";
		
		boolean foundHeader = false;
		boolean hasValuesForPackageName = false;
		StringBuilder strBuilder = new StringBuilder();

		Attributes mainAttrs = getManifest().getMainAttributes();
		for (Object entryName : mainAttrs.keySet()) {
			String values;
			String header;

			// Get the values safely
			if (entryName instanceof String) {
				header = (String) entryName;
				values = mainAttrs.getValue(header);
			} else if (entryName instanceof Attributes.Name) {
				header = (String) ((Attributes.Name) entryName).toString();
				values = mainAttrs.getValue((Attributes.Name) entryName);
			} else {
				throw new BundleException("Unknown Main Attribute Key type: "
						+ entryName.getClass() + " (" + entryName + ")");
			}

			// loop to the next header if we don't find ours
			if (!exportPackageHeader.equals(header))
				continue;

			// found it
			foundHeader = true;

			// process the components of the value for this element see
			// ManifestElement javadocs for spec
			if (values != null) {
				ManifestElement[] elements = ManifestElement.parseHeader(
						header, values);
				for (int i = 0; i < elements.length; i++) {
					ManifestElement manifestElement = elements[i];

					boolean lastElement = i >= elements.length - 1;
					if(packageName.equals(manifestElement.getValueComponents()[0])){
						hasValuesForPackageName = true;
						break;
					}
					strBuilder.append(manifestElement.getValue());
					if (!lastElement) {
						strBuilder.append(",\n");
					}
				}
			}
		
			break;
		}
		if (!foundHeader) {
			// Add a new one with this package
			getManifest().getMainAttributes().putValue(
					exportPackageHeader,
					packageName);
		} else  {
			// found it and wish to edit it...
			if (!hasValuesForPackageName) {
				// There are no values for the package we wish to add.
				// ...create a fresh entry
				String existingValues = strBuilder.toString();
				boolean areExistingValues = existingValues.trim().length() != 0;
				String newValue = packageName ;
				newValue = (areExistingValues) ? (existingValues + ",\n " + newValue)
						: newValue;
				getManifest().getMainAttributes().putValue(exportPackageHeader,
						newValue);
			}
		}
	}
	private Manifest getManifest() throws IOException, CoreException {
		return _mfChanger.getManifest();
	}
}
