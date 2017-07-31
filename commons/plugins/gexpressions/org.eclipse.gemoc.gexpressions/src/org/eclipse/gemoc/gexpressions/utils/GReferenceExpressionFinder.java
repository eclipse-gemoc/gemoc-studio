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

import java.util.Collections;
import java.util.List;

import org.eclipse.gemoc.gexpressions.GBinaryOperatorExpression;
import org.eclipse.gemoc.gexpressions.GNavigationExpression;
import org.eclipse.gemoc.gexpressions.GPrimaryExpression;
import org.eclipse.gemoc.gexpressions.GReferenceExpression;
import org.eclipse.gemoc.gexpressions.GUnaryOperatorExpression;
import org.eclipse.gemoc.gexpressions.util.GexpressionsSwitch;

/**
 * Collects the GReferenceExpression which are leaves of a more complex
 * expression. Places them in the correct order, e.g. Expression (A.b() or
 * C.d()) will return [A, C]
 * 
 * @author flatombe
 *
 */
public class GReferenceExpressionFinder extends
		GexpressionsSwitch<List<GReferenceExpression>> {

	@Override
	public List<GReferenceExpression> caseGPrimaryExpression(
			GPrimaryExpression object) {
		return Collections.emptyList();
	}

	@Override
	public List<GReferenceExpression> caseGUnaryOperatorExpression(
			GUnaryOperatorExpression object) {
		return this.doSwitch(object.getOperand());
	}

	@Override
	public List<GReferenceExpression> caseGBinaryOperatorExpression(
			GBinaryOperatorExpression object) {
		List<GReferenceExpression> res = this.doSwitch(object.getLeftOperand());
		res.addAll(this.doSwitch(object.getRightOperand()));
		return res;
	}

	@Override
	public List<GReferenceExpression> caseGNavigationExpression(
			GNavigationExpression object) {
		return this.doSwitch(object.getBody());
	}

	@Override
	public List<GReferenceExpression> caseGReferenceExpression(
			GReferenceExpression object) {
		return Collections.singletonList(object);
	}

}
