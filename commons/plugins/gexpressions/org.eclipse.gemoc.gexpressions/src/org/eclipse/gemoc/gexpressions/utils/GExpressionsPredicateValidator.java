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

import org.eclipse.gemoc.gexpressions.GBooleanExpression;
import org.eclipse.gemoc.gexpressions.GBooleanOperatorExpression;
import org.eclipse.gemoc.gexpressions.GEqualityExpression;
import org.eclipse.gemoc.gexpressions.GExpression;
import org.eclipse.gemoc.gexpressions.GNegationExpression;
import org.eclipse.gemoc.gexpressions.GRelationExpression;
import org.eclipse.gemoc.gexpressions.util.GexpressionsSwitch;

/**
 * Returns whether or not the GExpression is a predicate (returns a boolean).
 * Not meant to be super detailed, this is just for some very basic validation.
 * Should be extended and the case for GReferenceExpression should be customized
 * to one's needs.
 * 
 * @author flatombe
 *
 */
public class GExpressionsPredicateValidator extends GexpressionsSwitch<Boolean> {

	@Override
	public Boolean caseGBooleanExpression(GBooleanExpression object) {
		return true;
	}

	@Override
	public Boolean caseGBooleanOperatorExpression(
			GBooleanOperatorExpression object) {
		return true;
	}

	@Override
	public Boolean caseGNegationExpression(GNegationExpression object) {
		return true;
	}

	@Override
	public Boolean caseGRelationExpression(GRelationExpression object) {
		return true;
	}

	@Override
	public Boolean caseGEqualityExpression(GEqualityExpression object) {
		return true;
	}

	@Override
	public Boolean caseGExpression(GExpression object) {
		return false;
	}
}
