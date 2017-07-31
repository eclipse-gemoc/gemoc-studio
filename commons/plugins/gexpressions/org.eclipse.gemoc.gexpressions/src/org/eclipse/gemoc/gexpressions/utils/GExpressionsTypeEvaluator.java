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

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.gemoc.gexpressions.GNavigationExpression;
import org.eclipse.gemoc.gexpressions.GReferenceExpression;
import org.eclipse.gemoc.gexpressions.util.GexpressionsSwitch;

public class GExpressionsTypeEvaluator extends GexpressionsSwitch<EClassifier> {

	@Override
	public EClassifier caseGReferenceExpression(GReferenceExpression object) {

		if (object.getReferencedEObject() instanceof EClassifier) {
			return (EClassifier) object.getReferencedEObject();
		} else {
			return object.getReferencedEObject().eClass();
		}

	}

	@Override
	public EClassifier caseGNavigationExpression(GNavigationExpression object) {
		EObject referencedEObject = object.getReferencedEObject();
		if (referencedEObject instanceof ETypedElement) {
			ETypedElement typedElement = (ETypedElement) referencedEObject;
			return typedElement.getEType();
		} else if (referencedEObject instanceof EClassifier) {
			EClassifier classifier = (EClassifier) referencedEObject;
			return classifier;
		} else {
			return referencedEObject.eClass();
		}
	}

}
