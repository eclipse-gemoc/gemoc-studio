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
package org.eclipse.gemoc.commons.eclipse.logging.backends;

import org.eclipse.core.runtime.Status;
import org.eclipse.gemoc.commons.eclipse.logging.ILoggingBackend;
import org.eclipse.gemoc.commons.eclipse.logging.ILoggingEntity;

import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystem;
import org.eclipse.gemoc.commons.messagingsystem.api.impl.StdioSimpleMessagingSystem;

public class DefaultLoggingBackend implements ILoggingBackend 
{

	private ILoggingEntity _loggingEntity;

	public DefaultLoggingBackend(ILoggingEntity plugin)
	{
		_loggingEntity = plugin;
	}
	
	private MessagingSystem _messagingSystem;

	private MessagingSystem getMessagingSystem()
	{
		if (_messagingSystem == null)
		{
			_messagingSystem = new StdioSimpleMessagingSystem();
		}
		return _messagingSystem;
	}
	
	public void setMessagingSystem(MessagingSystem messagingSystem)
	{
		_messagingSystem = messagingSystem;
	}
	
	@Override
	public void info(String message) {
		getMessagingSystem().info(message, _loggingEntity.getId());	
	}

	@Override
	public void debug(String message) {
		getMessagingSystem().debug(message, _loggingEntity.getId());	
	}

	@Override
	public void warn(String message) {
		getMessagingSystem().warn(message, _loggingEntity.getId());	
	}

	@Override
	public void error(String message) {
		getMessagingSystem().error(message, _loggingEntity.getId());	
	}

	@Override
	public void warn(String message, Throwable e) {
		warn(message);
		_loggingEntity
			.getLog()
			.log(new Status(
						Status.WARNING, 
						_loggingEntity.getId(), 
						Status.OK, 
						message, e));
	}

	@Override
	public void error(String message, Throwable e) {
		error(message);
		_loggingEntity
			.getLog()
			.log(new Status(
						Status.ERROR, 
						_loggingEntity.getId(), 
						Status.OK, 
						message, e));	
	}

	@Override
	public void info(String message, Throwable e) {
		info(message);
		_loggingEntity
			.getLog()
			.log(new Status(
						Status.INFO, 
						_loggingEntity.getId(), 
						Status.OK, 
						message, e));	
	}

}
