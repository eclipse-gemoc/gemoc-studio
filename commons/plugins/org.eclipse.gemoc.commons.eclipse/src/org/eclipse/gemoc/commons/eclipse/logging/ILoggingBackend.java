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
package org.eclipse.gemoc.commons.eclipse.logging;


public interface ILoggingBackend {

	public void info(String message);	
	public void debug(String message);
	public void warn(String message);
	public void error(String message);

	public void info(String message, Throwable e);	
	public void warn(String msg, Throwable e);
	public void error(String msg, Throwable e);

}
