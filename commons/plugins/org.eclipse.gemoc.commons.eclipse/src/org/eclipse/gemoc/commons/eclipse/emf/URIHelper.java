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
package org.eclipse.gemoc.commons.eclipse.emf;

import org.eclipse.emf.common.util.URI;

public abstract class URIHelper {

	public static String removePlatformScheme(URI uri)
	{
		String result = uri.toString();
		if (uri.isPlatformResource())
		{
			result = uri.toString().replace("platform:/resource", "");
		}		
		else if (uri.isPlatformPlugin())
		{
			result = uri.toString().replace("platform:/plugin", "");
		}
		return result;
	}
	
}
