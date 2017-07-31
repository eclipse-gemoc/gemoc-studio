/*******************************************************************************
 * Copyright (c)  2009, 2017 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.gemoc.gemoc_studio.branding;

import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.core.net.proxy.IProxyData;
import org.eclipse.core.net.proxy.IProxyService;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The activator class controls the plug-in life cycle
 * 
 * @author Cedric Brun <cedric.brun@obeo.fr>
 */
public class Activator extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.gemoc.gemoc_studio.branding";

	private final ServiceTracker proxyTracker;

	// The shared instance
	private static Activator plugin;

	/**
	 * The constructor
	 */
	public Activator() {
		proxyTracker = new ServiceTracker(FrameworkUtil.getBundle(
				this.getClass()).getBundleContext(),
				IProxyService.class.getName(), null);
		proxyTracker.open();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	public void prepareProxySettings(String uriString) {
		URI uri;
		try {
			uri = new URI(uriString);
			IProxyService proxyService = Activator.getDefault()
					.getProxyService();
			IProxyData[] proxyDataForHost = proxyService.select(uri);
			for (IProxyData data : proxyDataForHost) {
				if (data.getHost() != null) {
					System.setProperty("http.proxySet", "true");
					System.setProperty("http.proxyHost", data.getHost());
				}
				if (data.getHost() != null) {
					System.setProperty("http.proxyPort",
							String.valueOf(data.getPort()));
				}
			}
			// Close the service and close the service tracker
			proxyService = null;
		} catch (URISyntaxException e) {
			getLog().log(
					new Status(IStatus.WARNING, PLUGIN_ID, e.getMessage(), e));
		}
	}

	public IProxyService getProxyService() {
		return (IProxyService) proxyTracker.getService();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		proxyTracker.close();
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

}
