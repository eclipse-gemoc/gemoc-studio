/*******************************************************************************
 * Copyright (c)  2019 Inria.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package org.eclipse.gemoc.gemoc_studio.headless;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystem;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystemManager;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	// The plug-in ID
		public static final String PLUGIN_ID = "org.eclipse.gemoc.gemoc_studio.headless"; //$NON-NLS-1$
		
		// The shared instance
		private static Activator plugin;
		
		private static BundleContext context;

		static BundleContext getContext() {
			return context;
		}
		/**
		 * Returns the shared instance
		 *
		 * @return the shared instance
		 */
		public static Activator getDefault() {
			return plugin;
		}

		protected MessagingSystem messaggingSystem = null;
		
		/*
		 * (non-Javadoc)
		 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
		 */
		public void start(BundleContext bundleContext) throws Exception {		
			Activator.context = bundleContext;
			plugin = this;
		}

		/*
		 * (non-Javadoc)
		 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
		 */
		public void stop(BundleContext bundleContext) throws Exception {
			Activator.context = null;
		}

		public static void warn(String msg, Throwable e){
			Platform.getLog(Platform.getBundle(PLUGIN_ID)).log(new Status(Status.WARNING, PLUGIN_ID,
	                Status.OK, 
	                msg, 
	                e));
		}
		public static void error(String msg, Throwable e){
			Platform.getLog(Platform.getBundle(PLUGIN_ID)).log(new Status(Status.ERROR, PLUGIN_ID,
	                Status.OK, 
	                msg, 
	                e));
		}
		public MessagingSystem getMessaggingSystem() {
			if (messaggingSystem == null) {
				MessagingSystemManager msm = new MessagingSystemManager();
				messaggingSystem = msm.createBestPlatformMessagingSystem(
						PLUGIN_ID, 
						"Model Debugger console");
			}
			return messaggingSystem;
		}
}
