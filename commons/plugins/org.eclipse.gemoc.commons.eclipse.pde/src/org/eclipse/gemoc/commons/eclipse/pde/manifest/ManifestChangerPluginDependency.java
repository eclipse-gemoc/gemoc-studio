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
import java.util.Enumeration;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.osgi.util.ManifestElement;
import org.osgi.framework.BundleException;

import org.eclipse.gemoc.commons.eclipse.pde.manifest.ManifestChanger;

public class ManifestChangerPluginDependency {

	private ManifestChanger _connection;
	
	public ManifestChangerPluginDependency(ManifestChanger connection) {
		_connection = connection;
	}
	
	public void add(String pluginName) throws BundleException, IOException, CoreException {
		add(pluginName, "0.0.0", true, true);
	}

	private Manifest getManifest() throws IOException, CoreException {
		return _connection.getManifest();
	}
	
	public void add(String plugin, String version, boolean reexport, boolean overwrite) throws BundleException, IOException, CoreException {
		final String requireBundleHeader = "Require-Bundle";
		final String bundleVersionAttr = "bundle-version";
		final String rexportDirective = "visibility";

		//assert (manifest != null);
		assert (plugin != null);
		if (plugin == null)
			return;
		if (version == null) {
			version = "1.0.0";
		}

		boolean foundHeader = false;
		boolean hasValuesForPlugin = false;
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
			if (!requireBundleHeader.equals(header))
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
					Enumeration<?> keys = manifestElement.getKeys();
					Enumeration<?> directiveKeys = manifestElement
							.getDirectiveKeys();
					StringBuilder valueComponents = new StringBuilder();
					boolean lastElement = i >= elements.length - 1;
					boolean firstElement = i == 0;
					boolean elementIsRequiredPlugin = false;

					for (int j = 0; j < manifestElement.getValueComponents().length; j++) {
						String pureValue = manifestElement.getValueComponents()[j];
						if (plugin.equalsIgnoreCase(pureValue)) {
							hasValuesForPlugin = true;
							elementIsRequiredPlugin = true;
							// if its already in the header element components
							// and we are not overwriting quit now
							if (!overwrite)
								return;
						}
						// ALWAYS WRITE THE LAST ; -> if we don't have any keys
						// or directives now - we will have
						// if this is not the required element we will just
						// write the line in one go using
						// manifestElement.getValue()
						valueComponents.append(pureValue + ";");
					}

					if (!elementIsRequiredPlugin) {
						// we haven't got a component THIS TIME which is equal
						// to the component we are looking to change
						// so just write out the whole of this component without
						// editing it, and carry on looking
						strBuilder.append((firstElement ? "" : " ")
								+ manifestElement
								+ (lastElement ? "" : ",\n"));
						continue;
					} else {
						// write out the value components found so far - we may
						// wish to edit bits of it
						strBuilder.append((firstElement ? "" : " ")
								+ valueComponents);
					}
					boolean foundVersionAttr = false;
					if (keys != null) {
						while (keys.hasMoreElements()) {
							String key = (String) keys.nextElement();
							String value = manifestElement.getAttribute(key);
							if (bundleVersionAttr.equalsIgnoreCase(key)) {
								// always write the last ; if we are editing the
								// values - we will be writing the export
								// directive
								strBuilder
										.append(key + "=\"" + version + "\";");
								foundVersionAttr = true;
							} else {
								// always write the last ; if we are editing the
								// values - we will be writing the export
								// directive
								strBuilder.append(key + "=\"" + value + "\";");
							}
						}
					}
					if (!foundVersionAttr) {
						// always write the last ; if we are editing the values
						// - we will be writing the export directive
						strBuilder.append(bundleVersionAttr + "=" + version
								+ ";");
					}
					boolean foundDirective = false;
					if (directiveKeys != null) {
						while (directiveKeys.hasMoreElements()) {
							String key = (String) directiveKeys.nextElement();
							boolean lastDirective = !directiveKeys
									.hasMoreElements();
							if (rexportDirective.equalsIgnoreCase(key)) {
								foundDirective = true;
								strBuilder.append(key + ":=");
								String dirValues[] = manifestElement
										.getDirectives(key);
								for (int j = 0; j < dirValues.length; j++) {
									String string = dirValues[j];
									boolean lastDirectiveValue = j >= dirValues.length - 1;
									if ("reexport".equalsIgnoreCase(string)
											&& !reexport) {
										string = "private";
									} else if ("private"
											.equalsIgnoreCase(string)
											&& reexport) {
										string = "reexport";
									}
									strBuilder.append(string
											+ (lastDirectiveValue ? "" : ","));
								}
							} else {
								strBuilder.append(key + ":="
										+ manifestElement.getDirective(key));
							}
							if (!lastDirective) {
								strBuilder.append(";");
							}
						}
					}
					if (!foundDirective) {
						strBuilder.append(rexportDirective + ":="
								+ (reexport ? "reexport" : "private"));
					}
					if (!lastElement) {
						strBuilder.append(",\n");
					}
				}
			}
			break;
		}
		if (!foundHeader) {
			// Add a new one
			getManifest().getMainAttributes().putValue(
					requireBundleHeader,
					plugin + ";" + bundleVersionAttr + "=" + version + ";"
							+ rexportDirective + ":="
							+ (reexport ? "reexport" : "private"));
		} else if (overwrite) {
			// found it and wish to edit it...
			if (hasValuesForPlugin) {
				// we have already edited the values for the plugin we wish to
				// add
				getManifest().getMainAttributes().putValue(requireBundleHeader,
						strBuilder.toString());
			} else {
				// There are no values for the plugin we wish to add.
				// ...create a fresh entry
				String existingValues = strBuilder.toString();
				boolean areExistingValues = existingValues.trim().length() != 0;
				String newValue = plugin + ";" + bundleVersionAttr + "="
						+ version + ";" + rexportDirective + ":="
						+ (reexport ? "reexport" : "private");
				newValue = (areExistingValues) ? (existingValues + ",\n " + newValue)
						: newValue;
				getManifest().getMainAttributes().putValue(requireBundleHeader,
						newValue);
			}
		}
	}


}
