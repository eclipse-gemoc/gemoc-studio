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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map.Entry;
import java.util.jar.Attributes.Name;
import java.util.jar.Manifest;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.osgi.framework.BundleException;

import org.eclipse.gemoc.commons.eclipse.pde.manifest.ManifestChangerExportPackage;
import org.eclipse.gemoc.commons.eclipse.pde.manifest.ManifestChangerPluginDependency;
import org.eclipse.gemoc.commons.eclipse.pde.manifest.ManifestChangerSingleton;

public class ManifestChanger {

	private IFile _manifestFile;
	
	public ManifestChanger(IFile manifestFile) {
		_manifestFile = manifestFile;
	}
	public ManifestChanger(IProject project) {
		this(project.getFile(new Path("META-INF/MANIFEST.MF")));
	}

	private Manifest _manifest;
	private void loadManifest(InputStream in) throws IOException {
		try {
			_manifest =  new Manifest(in);			
		} finally {
			in.close();
		}
	}
	
	public Manifest getManifest() throws IOException, CoreException {
		if (_manifest == null) {
			_manifest = new Manifest();
			loadManifest(_manifestFile.getContents());
		}
		return _manifest;
	}
	
	public void commit() throws IOException, CoreException {
		writeManifest(_manifestFile);
	}
	
	private void writeManifest(OutputStream out) throws IOException {
		// [FT] bypass the writing of the Manifest class because at this date 14/04/2014 there is a bug
		// that inserts new lines that invalidates the file.
		//manifest.write(out);
		StringBuilder builder = new StringBuilder();
		// write out the *-Version header first, if it exists
        String vername = Name.MANIFEST_VERSION.toString();
        String version = _manifest.getMainAttributes().getValue(vername);
        if (version == null) {
            vername = Name.SIGNATURE_VERSION.toString();
            version = _manifest.getMainAttributes().getValue(vername);
        }

        if (version != null) {
        	builder.append(vername+": "+version+"\r\n");
        }
		// write out all attributes except for the version
        // we wrote out earlier
		for (Entry<Object, Object> pairs : _manifest.getMainAttributes().entrySet()) {
			Object key = pairs.getKey();
			String keyString = key.toString();
			Object value = pairs.getValue();
			if ((version != null) && ! (keyString.equalsIgnoreCase(vername))) {
				builder.append(keyString);
				builder.append(": ");
				if((keyString.equals("Require-Bundle") || keyString.equals("Export-Package")) && value instanceof String && !((String)value).contains("\n")){
					String val = (String) value;
					String newVal = val.replaceAll(",", ",\n ");
					builder.append(newVal);
				}
				else{
					builder.append(value);
				}
				builder.append("\n");
				//builder.append(System.getProperty("line.separator"));
			}
		}
		out.write(builder.toString().getBytes());		
	}
	
	private void writeManifest(IFile outputFile) throws IOException, CoreException {
		if (_manifest != null) { // manifest null means that no update needed.
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			writeManifest(out);
			ByteArrayInputStream is = new ByteArrayInputStream(out.toByteArray());
			outputFile.setContents(is, 1, new NullProgressMonitor());			
		}
	}
	public void addPluginDependency(String plugin) throws BundleException, IOException, CoreException {
		if(plugin == null || plugin.isEmpty()) return;
		ManifestChangerPluginDependency dependency = new ManifestChangerPluginDependency(this);		
		dependency.add(plugin);
	}
	public void addPluginDependency(String plugin, String version, boolean reexport, boolean overwrite) throws BundleException, IOException, CoreException {
		ManifestChangerPluginDependency dependency = new ManifestChangerPluginDependency(this);
		dependency.add(plugin, version, reexport, overwrite);
	}
	public void addExportPackage(String packageName) throws BundleException, IOException, CoreException {
		if(packageName == null || packageName.isEmpty()) return;
		ManifestChangerExportPackage exportPackageMFChanger = new ManifestChangerExportPackage(this);
		exportPackageMFChanger.add(packageName);
	}
	public void addSingleton() throws BundleException, IOException, CoreException {
		ManifestChangerSingleton singleton = new ManifestChangerSingleton(this);
		singleton.apply();		
	}
	public void addAttributes(String attributeName, String value){
		_manifest.getMainAttributes().putValue(attributeName, value);
	}
}
