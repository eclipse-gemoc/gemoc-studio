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
/**
 */
package org.eclipse.gemoc.gexpressions.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.gemoc.gexpressions.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.gemoc.gexpressions.GexpressionsPackage
 * @generated
 */
public class GexpressionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GexpressionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GexpressionsSwitch() {
		if (modelPackage == null) {
			modelPackage = GexpressionsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GexpressionsPackage.GPROGRAM: {
				GProgram gProgram = (GProgram)theEObject;
				T result = caseGProgram(gProgram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GexpressionsPackage.GIMPORT_STATEMENT: {
				GImportStatement gImportStatement = (GImportStatement)theEObject;
				T result = caseGImportStatement(gImportStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GexpressionsPackage.GEXPRESSION: {
				GExpression gExpression = (GExpression)theEObject;
				T result = caseGExpression(gExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GexpressionsPackage.GNAVIGATION_EXPRESSION: {
				GNavigationExpression gNavigationExpression = (GNavigationExpression)theEObject;
				T result = caseGNavigationExpression(gNavigationExpression);
				if (result == null) result = caseGExpression(gNavigationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GexpressionsPackage.GREFERENCE_EXPRESSION: {
				GReferenceExpression gReferenceExpression = (GReferenceExpression)theEObject;
				T result = caseGReferenceExpression(gReferenceExpression);
				if (result == null) result = caseGExpression(gReferenceExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GexpressionsPackage.GPRIMARY_EXPRESSION: {
				GPrimaryExpression gPrimaryExpression = (GPrimaryExpression)theEObject;
				T result = caseGPrimaryExpression(gPrimaryExpression);
				if (result == null) result = caseGExpression(gPrimaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GexpressionsPackage.GSTRING_EXPRESSION: {
				GStringExpression gStringExpression = (GStringExpression)theEObject;
				T result = caseGStringExpression(gStringExpression);
				if (result == null) result = caseGPrimaryExpression(gStringExpression);
				if (result == null) result = caseGExpression(gStringExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GexpressionsPackage.GBOOLEAN_EXPRESSION: {
				GBooleanExpression gBooleanExpression = (GBooleanExpression)theEObject;
				T result = caseGBooleanExpression(gBooleanExpression);
				if (result == null) result = caseGPrimaryExpression(gBooleanExpression);
				if (result == null) result = caseGExpression(gBooleanExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GexpressionsPackage.GNUMERIC_EXPRESSION: {
				GNumericExpression gNumericExpression = (GNumericExpression)theEObject;
				T result = caseGNumericExpression(gNumericExpression);
				if (result == null) result = caseGPrimaryExpression(gNumericExpression);
				if (result == null) result = caseGExpression(gNumericExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GexpressionsPackage.GINTEGER_EXPRESSION: {
				GIntegerExpression gIntegerExpression = (GIntegerExpression)theEObject;
				T result = caseGIntegerExpression(gIntegerExpression);
				if (result == null) result = caseGNumericExpression(gIntegerExpression);
				if (result == null) result = caseGPrimaryExpression(gIntegerExpression);
				if (result == null) result = caseGExpression(gIntegerExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GexpressionsPackage.GDOUBLE_EXPRESSION: {
				GDoubleExpression gDoubleExpression = (GDoubleExpression)theEObject;
				T result = caseGDoubleExpression(gDoubleExpression);
				if (result == null) result = caseGNumericExpression(gDoubleExpression);
				if (result == null) result = caseGPrimaryExpression(gDoubleExpression);
				if (result == null) result = caseGExpression(gDoubleExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GexpressionsPackage.GIF_EXPRESSION: {
				GIfExpression gIfExpression = (GIfExpression)theEObject;
				T result = caseGIfExpression(gIfExpression);
				if (result == null) result = caseGPrimaryExpression(gIfExpression);
				if (result == null) result = caseGExpression(gIfExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GexpressionsPackage.GBRACE_EXPRESSION: {
				GBraceExpression gBraceExpression = (GBraceExpression)theEObject;
				T result = caseGBraceExpression(gBraceExpression);
				if (result == null) result = caseGPrimaryExpression(gBraceExpression);
				if (result == null) result = caseGExpression(gBraceExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GexpressionsPackage.GENUM_LITERAL_EXPRESSION: {
				GEnumLiteralExpression gEnumLiteralExpression = (GEnumLiteralExpression)theEObject;
				T result = caseGEnumLiteralExpression(gEnumLiteralExpression);
				if (result == null) result = caseGPrimaryExpression(gEnumLiteralExpression);
				if (result == null) result = caseGExpression(gEnumLiteralExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GexpressionsPackage.GBINARY_OPERATOR_EXPRESSION: {
				GBinaryOperatorExpression gBinaryOperatorExpression = (GBinaryOperatorExpression)theEObject;
				T result = caseGBinaryOperatorExpression(gBinaryOperatorExpression);
				if (result == null) result = caseGExpression(gBinaryOperatorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GexpressionsPackage.GUNARY_OPERATOR_EXPRESSION: {
				GUnaryOperatorExpression gUnaryOperatorExpression = (GUnaryOperatorExpression)theEObject;
				T result = caseGUnaryOperatorExpression(gUnaryOperatorExpression);
				if (result == null) result = caseGExpression(gUnaryOperatorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GexpressionsPackage.GBOOLEAN_OPERATOR_EXPRESSION: {
				GBooleanOperatorExpression gBooleanOperatorExpression = (GBooleanOperatorExpression)theEObject;
				T result = caseGBooleanOperatorExpression(gBooleanOperatorExpression);
				if (result == null) result = caseGBinaryOperatorExpression(gBooleanOperatorExpression);
				if (result == null) result = caseGExpression(gBooleanOperatorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GexpressionsPackage.GAND_EXPRESSION: {
				GAndExpression gAndExpression = (GAndExpression)theEObject;
				T result = caseGAndExpression(gAndExpression);
				if (result == null) result = caseGBooleanOperatorExpression(gAndExpression);
				if (result == null) result = caseGBinaryOperatorExpression(gAndExpression);
				if (result == null) result = caseGExpression(gAndExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GexpressionsPackage.GXOR_EXPRESSION: {
				GXorExpression gXorExpression = (GXorExpression)theEObject;
				T result = caseGXorExpression(gXorExpression);
				if (result == null) result = caseGBooleanOperatorExpression(gXorExpression);
				if (result == null) result = caseGBinaryOperatorExpression(gXorExpression);
				if (result == null) result = caseGExpression(gXorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GexpressionsPackage.GOR_EXPRESSION: {
				GOrExpression gOrExpression = (GOrExpression)theEObject;
				T result = caseGOrExpression(gOrExpression);
				if (result == null) result = caseGBooleanOperatorExpression(gOrExpression);
				if (result == null) result = caseGBinaryOperatorExpression(gOrExpression);
				if (result == null) result = caseGExpression(gOrExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GexpressionsPackage.GEQUALITY_EXPRESSION: {
				GEqualityExpression gEqualityExpression = (GEqualityExpression)theEObject;
				T result = caseGEqualityExpression(gEqualityExpression);
				if (result == null) result = caseGBinaryOperatorExpression(gEqualityExpression);
				if (result == null) result = caseGExpression(gEqualityExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GexpressionsPackage.GRELATION_EXPRESSION: {
				GRelationExpression gRelationExpression = (GRelationExpression)theEObject;
				T result = caseGRelationExpression(gRelationExpression);
				if (result == null) result = caseGBinaryOperatorExpression(gRelationExpression);
				if (result == null) result = caseGExpression(gRelationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GexpressionsPackage.GADDITION_EXPRESSION: {
				GAdditionExpression gAdditionExpression = (GAdditionExpression)theEObject;
				T result = caseGAdditionExpression(gAdditionExpression);
				if (result == null) result = caseGBinaryOperatorExpression(gAdditionExpression);
				if (result == null) result = caseGExpression(gAdditionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GexpressionsPackage.GMULTIPLICATION_EXPRESSION: {
				GMultiplicationExpression gMultiplicationExpression = (GMultiplicationExpression)theEObject;
				T result = caseGMultiplicationExpression(gMultiplicationExpression);
				if (result == null) result = caseGBinaryOperatorExpression(gMultiplicationExpression);
				if (result == null) result = caseGExpression(gMultiplicationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GexpressionsPackage.GNEGATION_EXPRESSION: {
				GNegationExpression gNegationExpression = (GNegationExpression)theEObject;
				T result = caseGNegationExpression(gNegationExpression);
				if (result == null) result = caseGUnaryOperatorExpression(gNegationExpression);
				if (result == null) result = caseGExpression(gNegationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GProgram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GProgram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGProgram(GProgram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GImport Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GImport Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGImportStatement(GImportStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GExpression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GExpression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGExpression(GExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GNavigation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GNavigation Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGNavigationExpression(GNavigationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GReference Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GReference Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGReferenceExpression(GReferenceExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GPrimary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GPrimary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGPrimaryExpression(GPrimaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GString Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GString Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGStringExpression(GStringExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GBoolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GBoolean Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGBooleanExpression(GBooleanExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GNumeric Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GNumeric Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGNumericExpression(GNumericExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GInteger Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GInteger Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGIntegerExpression(GIntegerExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GDouble Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GDouble Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGDoubleExpression(GDoubleExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GIf Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GIf Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGIfExpression(GIfExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GBrace Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GBrace Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGBraceExpression(GBraceExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEnum Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEnum Literal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEnumLiteralExpression(GEnumLiteralExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GBinary Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GBinary Operator Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGBinaryOperatorExpression(GBinaryOperatorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GUnary Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GUnary Operator Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGUnaryOperatorExpression(GUnaryOperatorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GBoolean Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GBoolean Operator Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGBooleanOperatorExpression(GBooleanOperatorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GAnd Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GAnd Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGAndExpression(GAndExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GXor Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GXor Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGXorExpression(GXorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GOr Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GOr Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGOrExpression(GOrExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEquality Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEquality Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEqualityExpression(GEqualityExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GRelation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GRelation Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGRelationExpression(GRelationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GAddition Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GAddition Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGAdditionExpression(GAdditionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GMultiplication Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GMultiplication Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGMultiplicationExpression(GMultiplicationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GNegation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GNegation Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGNegationExpression(GNegationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GexpressionsSwitch
