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
package org.eclipse.gemoc.commons.eclipse.jdt;

import java.util.HashSet;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.internal.corext.callhierarchy.CallHierarchy;
import org.eclipse.jdt.internal.corext.callhierarchy.CallLocation;
import org.eclipse.jdt.internal.corext.callhierarchy.MethodCall;
import org.eclipse.jdt.internal.corext.callhierarchy.MethodWrapper;

public class CallHierarchyHelper {

	/**
	 * Find methods calling method 'm'
	 */
	public static HashSet<IMethod> getCallersOf(IMethod m) {

	    CallHierarchy callHierarchy = CallHierarchy.getDefault();

	    IMember[] members = { m };

	    MethodWrapper[] methodWrappers = callHierarchy.getCallerRoots(members);
	    HashSet<IMethod> callers = new HashSet<IMethod>();
	    for (MethodWrapper mw : methodWrappers) {
	        MethodWrapper[] mw2 = mw.getCalls(new NullProgressMonitor());
	        HashSet<IMethod> temp = getIMethods(mw2);
	        callers.addAll(temp);
	    }

	    return callers;
	}
	
	/**
	 * Find calling sites for method 'm' 
	 */
	public static HashSet<CallLocation> getCallLocationsOf(IMethod m) {
		CallHierarchy callHierarchy = CallHierarchy.getDefault();

	    IMember[] members = { m };

	    MethodWrapper[] methodWrappers = callHierarchy.getCallerRoots(members);
	    HashSet<CallLocation> callers = new HashSet<CallLocation>();
	    for (MethodWrapper mw : methodWrappers) {
	        MethodWrapper[] mw2 = mw.getCalls(new NullProgressMonitor());
	        HashSet<CallLocation> temp = getCallLocations(mw2);
	        callers.addAll(temp);
	    }

	    return callers;
	}
	
	private static HashSet<IMethod> getIMethods(MethodWrapper[] methodWrappers) {
	    HashSet<IMethod> c = new HashSet<IMethod>();
	    for (MethodWrapper m : methodWrappers) {
	        IMethod im = getIMethodFromMethodWrapper(m);
	        if (im != null) {
	            c.add(im);
	        }
	    }
	    return c;
	}
	
	private static IMethod getIMethodFromMethodWrapper(MethodWrapper m) {
		try {
			IMember im = m.getMember();
			if (im.getElementType() == IJavaElement.METHOD) {
				return (IMethod) m.getMember();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private static HashSet<CallLocation> getCallLocations(MethodWrapper[] methodWrappers) {
	    HashSet<CallLocation> c = new HashSet<CallLocation>();
	    for (MethodWrapper m : methodWrappers) {
	    	CallLocation im = getCallLocation(m);
	        if (im != null) {
	            c.add(im);
	        }
	    }
	    return c;
	}
	
	private static CallLocation getCallLocation(MethodWrapper m) {
		return m.getMethodCall().getFirstCallLocation();
	}
	
}
