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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gemoc.gexpressions.GExpression;
import org.eclipse.gemoc.gexpressions.GNavigationExpression;
import org.eclipse.gemoc.gexpressions.GReferenceExpression;
import org.eclipse.gemoc.gexpressions.util.GexpressionsSwitch;

/**
 * Replaces in the GReferenceExpression an EClass by the given EObject (if types
 * correspond) and removes the EOperationNavigationExpression term at the end of
 * the expression. Useful to partially evaluate an expression to determine on
 * which EObject the EOperation should be called.
 * 
 * Example : "MyEClass.foo.bar.do()" returns "MyEObject.foo.bar". This
 * expression can then be interpreted to get the value of the "bar" feature.
 * 
 * @author flatombe
 *
 */
public class EClassByEObjectReplacerAndEOperationRemover extends
		GexpressionsSwitch<GExpression> {
	private EObject context;

	public EClassByEObjectReplacerAndEOperationRemover(EObject context) {
		this.context = context;
	}

	@Override
	public GExpression caseGReferenceExpression(GReferenceExpression object) {
		EObject eo = object.getReferencedEObject();
		if (eo instanceof EClass) {
			EClass eClass = (EClass) eo;
			if (GExpressionsHelper
					.eClassIsSuperTypeOf(eClass, context.eClass())) {
				object.setReferencedEObject(context);
			}
		}
		return object;
	}

	@Override
	public GExpression caseGNavigationExpression(GNavigationExpression object) {
		EObject referencedEObject = object.getReferencedEObject();
		if (referencedEObject instanceof EStructuralFeature) {
			object.setBody(this.doSwitch(object.getBody()));
			return object;
		} else {
			return this.doSwitch(object.getBody());
		}
	}

	@Override
	public GExpression caseGExpression(GExpression object) {
		return object;
	}

}
