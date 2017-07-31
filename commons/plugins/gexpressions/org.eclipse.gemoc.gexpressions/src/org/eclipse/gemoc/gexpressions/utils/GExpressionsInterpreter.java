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
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gemoc.gexpressions.GAdditionExpression;
import org.eclipse.gemoc.gexpressions.GAndExpression;
import org.eclipse.gemoc.gexpressions.GBooleanExpression;
import org.eclipse.gemoc.gexpressions.GBraceExpression;
import org.eclipse.gemoc.gexpressions.GDoubleExpression;
import org.eclipse.gemoc.gexpressions.GEnumLiteralExpression;
import org.eclipse.gemoc.gexpressions.GEqualityExpression;
import org.eclipse.gemoc.gexpressions.GIfExpression;
import org.eclipse.gemoc.gexpressions.GIntegerExpression;
import org.eclipse.gemoc.gexpressions.GMultiplicationExpression;
import org.eclipse.gemoc.gexpressions.GNavigationExpression;
import org.eclipse.gemoc.gexpressions.GNegationExpression;
import org.eclipse.gemoc.gexpressions.GOrExpression;
import org.eclipse.gemoc.gexpressions.GReferenceExpression;
import org.eclipse.gemoc.gexpressions.GRelationExpression;
import org.eclipse.gemoc.gexpressions.GStringExpression;
import org.eclipse.gemoc.gexpressions.GXorExpression;
import org.eclipse.gemoc.gexpressions.util.GexpressionsSwitch;
public class GExpressionsInterpreter extends GexpressionsSwitch<Object> {

	@Override
	public Object caseGNavigationExpression(GNavigationExpression object) {
		EObject referencedEObject = object.getReferencedEObject();
		if (referencedEObject instanceof EStructuralFeature) {
			EStructuralFeature feature = (EStructuralFeature) referencedEObject;
			Object previousObject = this.doSwitch(object.getBody());
			EObject eo = (EObject) previousObject;
			// Had to hack this, the feature is probably loaded at two different
			// places...
			if (eo instanceof EClass) {
				return ((EClass) eo).getEStructuralFeature(feature.getName())
						.getEType();
			} else {
				return eo.eGet(eo.eClass().getEStructuralFeature(
						feature.getName()));
			}
		} else if (referencedEObject instanceof EOperation) {
			EOperation operation = (EOperation) referencedEObject;
			Object previousObject = this.doSwitch(object.getBody());
			EObject eo = (EObject) previousObject;

			if (eo instanceof EClass) {
				return ((EClass) eo).getEOperation(operation.getOperationID());
			} else {
				return eo.eClass().getEOperation(operation.getOperationID());
			}
		} else {
			return object.getReferencedEObject();
		}
	}

	@Override
	public Object caseGReferenceExpression(GReferenceExpression object) {
		return object.getReferencedObject() == null ? object
				.getReferencedEObject() : object.getReferencedObject();
	}

	@Override
	public Object caseGStringExpression(GStringExpression object) {
		return object.getValue();
	}

	@Override
	public Object caseGBooleanExpression(GBooleanExpression object) {
		return object.isValue();
	}

	@Override
	public Object caseGIntegerExpression(GIntegerExpression object) {
		return object.getValue();
	}

	@Override
	public Object caseGDoubleExpression(GDoubleExpression object) {
		return object.getValue();
	}

	@Override
	public Object caseGIfExpression(GIfExpression object) {
		Boolean conditionResult = (Boolean) this
				.doSwitch(object.getCondition());
		if (conditionResult) {
			return this.doSwitch(object.getThenExpression());
		} else {
			return this.doSwitch(object.getElseExpression());
		}
	}

	@Override
	public Object caseGBraceExpression(GBraceExpression object) {
		return this.doSwitch(object.getInnerExpression());
	}

	@Override
	public Object caseGEnumLiteralExpression(GEnumLiteralExpression object) {
		return object.getValue();
	}

	@Override
	public Object caseGAndExpression(GAndExpression object) {
		return (Boolean) this.doSwitch(object.getLeftOperand())
				&& (Boolean) this.doSwitch(object.getRightOperand());
	}

	@Override
	public Object caseGXorExpression(GXorExpression object) {
		return (Boolean) this.doSwitch(object.getLeftOperand())
				^ (Boolean) this.doSwitch(object.getRightOperand());
	}

	@Override
	public Object caseGOrExpression(GOrExpression object) {
		return (Boolean) this.doSwitch(object.getLeftOperand())
				|| (Boolean) this.doSwitch(object.getRightOperand());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Object caseGEqualityExpression(GEqualityExpression object) {
		Object leftValue = this.doSwitch(object.getLeftOperand());
		Object rightValue = this.doSwitch(object.getRightOperand());
		switch (object.getOperator()) {
		case EQUAL:
			if (leftValue instanceof Comparable
					&& rightValue instanceof Comparable) {
				return ((Comparable) leftValue)
						.compareTo((Comparable) rightValue) == 0;
			} else {
				return leftValue.equals(rightValue);
			}
		case NOTEQUAL:
			if (leftValue instanceof Comparable
					&& rightValue instanceof Comparable) {
				return ((Comparable) leftValue)
						.compareTo((Comparable) rightValue) != 0;
			} else {
				return !(leftValue.equals(rightValue));
			}

		default:
			throw new UnsupportedOperationException(
					"Could not determine the type of the operator: "
							+ object.getOperator());
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Object caseGRelationExpression(GRelationExpression object) {
		switch (object.getOperator()) {
		case GREATER:
			return ((Comparable) this.doSwitch(object.getLeftOperand()))
					.compareTo((Comparable) this.doSwitch(object
							.getRightOperand())) > 0;
		case GREATEREQUAL:
			return ((Comparable) this.doSwitch(object.getLeftOperand()))
					.compareTo((Comparable) this.doSwitch(object
							.getRightOperand())) >= 0;

		case LESS:
			return ((Comparable) this.doSwitch(object.getLeftOperand()))
					.compareTo((Comparable) this.doSwitch(object
							.getRightOperand())) < 0;

		case LESSEQUAL:
			return ((Comparable) this.doSwitch(object.getLeftOperand()))
					.compareTo((Comparable) this.doSwitch(object
							.getRightOperand())) <= 0;

		default:
			throw new UnsupportedOperationException(
					"Could not determine the type of the operator: "
							+ object.getOperator());

		}
	}

	@Override
	public Object caseGAdditionExpression(GAdditionExpression object) {

		Object op1 = this.doSwitch(object.getLeftOperand());
		Object op2 = this.doSwitch(object.getRightOperand());

		switch (object.getOperator()) {
		case ADDITION:
			return addition(op1, op2);
		case SUBTRACTION:
			return subtraction(op1, op2);
		default:
			throw new UnsupportedOperationException(
					"Could not determine the type of the operator: "
							+ object.getOperator());
		}
	}

	private Object addition(Object op1, Object op2) {
		if (op1 instanceof String || op2 instanceof String) {
			return String.valueOf(op1) + String.valueOf(op2);
		}

		if (!(op1 instanceof Number) || !(op2 instanceof Number)) {
			throw new UnsupportedOperationException(
					"Invalid operands for mathematical operator [+]");
		}

		if (op1 instanceof Double || op2 instanceof Double) {
			return ((Number) op1).doubleValue() + ((Number) op2).doubleValue();
		}

		if (op1 instanceof Float || op2 instanceof Float) {
			return ((Number) op1).floatValue() + ((Number) op2).floatValue();
		}

		if (op1 instanceof Long || op2 instanceof Long) {
			return ((Number) op1).longValue() + ((Number) op2).longValue();
		}

		return ((Number) op1).intValue() + ((Number) op2).intValue();
	}

	private Object subtraction(Object op1, Object op2) {
		if (!(op1 instanceof Number) || !(op2 instanceof Number)) {
			throw new UnsupportedOperationException(
					"Invalid operands for mathematical operator [-]");
		}

		if (op1 instanceof Double || op2 instanceof Double) {
			return ((Number) op1).doubleValue() - ((Number) op2).doubleValue();
		}

		if (op1 instanceof Float || op2 instanceof Float) {
			return ((Number) op1).floatValue() - ((Number) op2).floatValue();
		}

		if (op1 instanceof Long || op2 instanceof Long) {
			return ((Number) op1).longValue() - ((Number) op2).longValue();
		}

		return ((Number) op1).intValue() - ((Number) op2).intValue();
	}

	@Override
	public Object caseGMultiplicationExpression(GMultiplicationExpression object) {
		Object op1 = this.doSwitch(object.getLeftOperand());
		Object op2 = this.doSwitch(object.getRightOperand());

		switch (object.getOperator()) {
		case MULTIPLICATION:
			return multiplication(op1, op2);
		case DIVISION:
			return division(op1, op2);
		default:
			throw new UnsupportedOperationException(
					"Could not determine the type of the operator: "
							+ object.getOperator());
		}
	}

	private Object multiplication(Object op1, Object op2) {
		if (!(op1 instanceof Number) || !(op2 instanceof Number)) {
			throw new UnsupportedOperationException(
					"Invalid operands for mathematical operator [*]");
		}

		if (op1 instanceof Double || op2 instanceof Double) {
			return ((Number) op1).doubleValue() * ((Number) op2).doubleValue();
		}

		if (op1 instanceof Float || op2 instanceof Float) {
			return ((Number) op1).floatValue() * ((Number) op2).floatValue();
		}

		if (op1 instanceof Long || op2 instanceof Long) {
			return ((Number) op1).longValue() * ((Number) op2).longValue();
		}

		return ((Number) op1).intValue() * ((Number) op2).intValue();
	}

	private Object division(Object op1, Object op2) {
		if (!(op1 instanceof Number) || !(op2 instanceof Number)) {
			throw new UnsupportedOperationException(
					"Invalid operands for mathematical operator [/]");
		}

		if (op1 instanceof Double || op2 instanceof Double) {
			return ((Number) op1).doubleValue() / ((Number) op2).doubleValue();
		}

		if (op1 instanceof Float || op2 instanceof Float) {
			return ((Number) op1).floatValue() / ((Number) op2).floatValue();
		}

		if (op1 instanceof Long || op2 instanceof Long) {
			return ((Number) op1).longValue() / ((Number) op2).longValue();
		}

		return ((Number) op1).intValue() / ((Number) op2).intValue();
	}

	@Override
	public Object caseGNegationExpression(GNegationExpression object) {
		Object op = this.doSwitch(object.getOperand());
		switch (object.getOperator()) {
		case MINUS:
			return subtraction(0, op);
		case NEGATION:
			return negation(op);
		default:
			throw new UnsupportedOperationException(
					"Could not determine the type of the operator: "
							+ object.getOperator());
		}
	}

	private Object negation(Object op) {
		if (!(op instanceof Boolean)) {
			throw new UnsupportedOperationException(
					"Cannot apply negation on non-boolean object");
		} else {
			Boolean b = (Boolean) op;
			return !b;
		}
	}

}
