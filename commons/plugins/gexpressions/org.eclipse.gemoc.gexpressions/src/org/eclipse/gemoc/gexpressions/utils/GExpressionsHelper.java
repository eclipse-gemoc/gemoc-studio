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
package org.eclipse.gemoc.gexpressions.utils;

import org.eclipse.emf.ecore.EClass;

public class GExpressionsHelper {

	/**
	 * Returns whether or not eClass is a supertype of otherEClass. Check based
	 * on names...
	 * 
	 * @param eClass
	 * @param otherEClass
	 * @return
	 */
	public static Boolean eClassIsSuperTypeOf(EClass eClass, EClass otherEClass) {
		Boolean res = classEquals(eClass, otherEClass);
		for (EClass clazz : otherEClass.getEAllSuperTypes()) {
			res = res || classEquals(clazz, eClass);
		}
		return res;
	}

	private static Boolean classEquals(EClass eClass, EClass otherEClass) {
		return eClass.equals(otherEClass)
				|| (eClass.getName().equals(otherEClass.getName()) && eClass
						.getEPackage().getName()
						.equals(otherEClass.getEPackage().getName()));
	}
}
