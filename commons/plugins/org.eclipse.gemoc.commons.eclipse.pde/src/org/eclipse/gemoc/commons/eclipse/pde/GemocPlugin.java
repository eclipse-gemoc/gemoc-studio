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
package org.eclipse.gemoc.commons.eclipse.pde;

import java.util.ArrayList;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.gemoc.commons.eclipse.logging.ILoggingBackend;
import org.eclipse.gemoc.commons.eclipse.logging.ILoggingEntity;
import org.eclipse.gemoc.commons.eclipse.logging.backends.DefaultLoggingBackend;
import org.osgi.framework.BundleContext;

public abstract class GemocPlugin extends Plugin implements ILoggingEntity {

	
	@Override
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		super.start(context);
		DefaultLoggingBackend backend = resolveLoggingBackend();
		if (backend != null)
			addLoggingBackend(backend);
	}
	
	public abstract DefaultLoggingBackend resolveLoggingBackend();

	/**
	 * Get the plugin id as specified in the manifest.
	 * @return
	 */
	public abstract String getId();
	
	/**
	 * Get the plugin name as specified in the manifest.
	 * @return
	 */
	public String getName()
	{
		return this.getBundle().getHeaders().get("Bundle-Name");
	}
	
	private ArrayList<ILoggingBackend> _loggingBackends = new ArrayList<ILoggingBackend>();
	private void addLoggingBackend(ILoggingBackend backend) 
	{
		if (backend == null)
			throw new IllegalArgumentException("backend");
		_loggingBackends.add(backend);
	}
	
	public void debug(String message) {
		
		for(ILoggingBackend b : _loggingBackends)
			b.debug(message);
	}

	public void error(String message) {
		for(ILoggingBackend b : _loggingBackends)
			b.error(message);
	}
	
	public void info(String message) {
		for(ILoggingBackend b : _loggingBackends)
			b.info(message);
	}
	
	public void warn(String message) {
		for(ILoggingBackend b : _loggingBackends)
			b.warn(message);
	}
	
	public void error(String message, Throwable e) {
		for(ILoggingBackend b : _loggingBackends)
			b.error(message, e);
	}
	
	public void warn(String message, Throwable e) {
		for(ILoggingBackend b : _loggingBackends)
			b.warn(message, e);
	}
	
	public void info(String message, Throwable e) {
		for(ILoggingBackend b : _loggingBackends)
			b.info(message, e);
	}

}
