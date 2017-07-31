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
package org.eclipse.gemoc.gexpressions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.gemoc.gexpressions.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GexpressionsFactoryImpl extends EFactoryImpl implements GexpressionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GexpressionsFactory init() {
		try {
			GexpressionsFactory theGexpressionsFactory = (GexpressionsFactory)EPackage.Registry.INSTANCE.getEFactory(GexpressionsPackage.eNS_URI);
			if (theGexpressionsFactory != null) {
				return theGexpressionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GexpressionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GexpressionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GexpressionsPackage.GPROGRAM: return createGProgram();
			case GexpressionsPackage.GIMPORT_STATEMENT: return createGImportStatement();
			case GexpressionsPackage.GNAVIGATION_EXPRESSION: return createGNavigationExpression();
			case GexpressionsPackage.GREFERENCE_EXPRESSION: return createGReferenceExpression();
			case GexpressionsPackage.GSTRING_EXPRESSION: return createGStringExpression();
			case GexpressionsPackage.GBOOLEAN_EXPRESSION: return createGBooleanExpression();
			case GexpressionsPackage.GINTEGER_EXPRESSION: return createGIntegerExpression();
			case GexpressionsPackage.GDOUBLE_EXPRESSION: return createGDoubleExpression();
			case GexpressionsPackage.GIF_EXPRESSION: return createGIfExpression();
			case GexpressionsPackage.GBRACE_EXPRESSION: return createGBraceExpression();
			case GexpressionsPackage.GENUM_LITERAL_EXPRESSION: return createGEnumLiteralExpression();
			case GexpressionsPackage.GAND_EXPRESSION: return createGAndExpression();
			case GexpressionsPackage.GXOR_EXPRESSION: return createGXorExpression();
			case GexpressionsPackage.GOR_EXPRESSION: return createGOrExpression();
			case GexpressionsPackage.GEQUALITY_EXPRESSION: return createGEqualityExpression();
			case GexpressionsPackage.GRELATION_EXPRESSION: return createGRelationExpression();
			case GexpressionsPackage.GADDITION_EXPRESSION: return createGAdditionExpression();
			case GexpressionsPackage.GMULTIPLICATION_EXPRESSION: return createGMultiplicationExpression();
			case GexpressionsPackage.GNEGATION_EXPRESSION: return createGNegationExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GexpressionsPackage.GAND_OPERATOR:
				return createGAndOperatorFromString(eDataType, initialValue);
			case GexpressionsPackage.GXOR_OPERATOR:
				return createGXorOperatorFromString(eDataType, initialValue);
			case GexpressionsPackage.GOR_OPERATOR:
				return createGOrOperatorFromString(eDataType, initialValue);
			case GexpressionsPackage.GEQUALITY_OPERATOR:
				return createGEqualityOperatorFromString(eDataType, initialValue);
			case GexpressionsPackage.GRELATION_OPERATOR:
				return createGRelationOperatorFromString(eDataType, initialValue);
			case GexpressionsPackage.GADDITION_OPERATOR:
				return createGAdditionOperatorFromString(eDataType, initialValue);
			case GexpressionsPackage.GMULTIPLICATION_OPERATOR:
				return createGMultiplicationOperatorFromString(eDataType, initialValue);
			case GexpressionsPackage.GNEGATION_OPERATOR:
				return createGNegationOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GexpressionsPackage.GAND_OPERATOR:
				return convertGAndOperatorToString(eDataType, instanceValue);
			case GexpressionsPackage.GXOR_OPERATOR:
				return convertGXorOperatorToString(eDataType, instanceValue);
			case GexpressionsPackage.GOR_OPERATOR:
				return convertGOrOperatorToString(eDataType, instanceValue);
			case GexpressionsPackage.GEQUALITY_OPERATOR:
				return convertGEqualityOperatorToString(eDataType, instanceValue);
			case GexpressionsPackage.GRELATION_OPERATOR:
				return convertGRelationOperatorToString(eDataType, instanceValue);
			case GexpressionsPackage.GADDITION_OPERATOR:
				return convertGAdditionOperatorToString(eDataType, instanceValue);
			case GexpressionsPackage.GMULTIPLICATION_OPERATOR:
				return convertGMultiplicationOperatorToString(eDataType, instanceValue);
			case GexpressionsPackage.GNEGATION_OPERATOR:
				return convertGNegationOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GProgram createGProgram() {
		GProgramImpl gProgram = new GProgramImpl();
		return gProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GImportStatement createGImportStatement() {
		GImportStatementImpl gImportStatement = new GImportStatementImpl();
		return gImportStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GNavigationExpression createGNavigationExpression() {
		GNavigationExpressionImpl gNavigationExpression = new GNavigationExpressionImpl();
		return gNavigationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GReferenceExpression createGReferenceExpression() {
		GReferenceExpressionImpl gReferenceExpression = new GReferenceExpressionImpl();
		return gReferenceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GStringExpression createGStringExpression() {
		GStringExpressionImpl gStringExpression = new GStringExpressionImpl();
		return gStringExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GBooleanExpression createGBooleanExpression() {
		GBooleanExpressionImpl gBooleanExpression = new GBooleanExpressionImpl();
		return gBooleanExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GIntegerExpression createGIntegerExpression() {
		GIntegerExpressionImpl gIntegerExpression = new GIntegerExpressionImpl();
		return gIntegerExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GDoubleExpression createGDoubleExpression() {
		GDoubleExpressionImpl gDoubleExpression = new GDoubleExpressionImpl();
		return gDoubleExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GIfExpression createGIfExpression() {
		GIfExpressionImpl gIfExpression = new GIfExpressionImpl();
		return gIfExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GBraceExpression createGBraceExpression() {
		GBraceExpressionImpl gBraceExpression = new GBraceExpressionImpl();
		return gBraceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GEnumLiteralExpression createGEnumLiteralExpression() {
		GEnumLiteralExpressionImpl gEnumLiteralExpression = new GEnumLiteralExpressionImpl();
		return gEnumLiteralExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GAndExpression createGAndExpression() {
		GAndExpressionImpl gAndExpression = new GAndExpressionImpl();
		return gAndExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GXorExpression createGXorExpression() {
		GXorExpressionImpl gXorExpression = new GXorExpressionImpl();
		return gXorExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOrExpression createGOrExpression() {
		GOrExpressionImpl gOrExpression = new GOrExpressionImpl();
		return gOrExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GEqualityExpression createGEqualityExpression() {
		GEqualityExpressionImpl gEqualityExpression = new GEqualityExpressionImpl();
		return gEqualityExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRelationExpression createGRelationExpression() {
		GRelationExpressionImpl gRelationExpression = new GRelationExpressionImpl();
		return gRelationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GAdditionExpression createGAdditionExpression() {
		GAdditionExpressionImpl gAdditionExpression = new GAdditionExpressionImpl();
		return gAdditionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMultiplicationExpression createGMultiplicationExpression() {
		GMultiplicationExpressionImpl gMultiplicationExpression = new GMultiplicationExpressionImpl();
		return gMultiplicationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GNegationExpression createGNegationExpression() {
		GNegationExpressionImpl gNegationExpression = new GNegationExpressionImpl();
		return gNegationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GAndOperator createGAndOperatorFromString(EDataType eDataType, String initialValue) {
		GAndOperator result = GAndOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGAndOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GXorOperator createGXorOperatorFromString(EDataType eDataType, String initialValue) {
		GXorOperator result = GXorOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGXorOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOrOperator createGOrOperatorFromString(EDataType eDataType, String initialValue) {
		GOrOperator result = GOrOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGOrOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GEqualityOperator createGEqualityOperatorFromString(EDataType eDataType, String initialValue) {
		GEqualityOperator result = GEqualityOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGEqualityOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRelationOperator createGRelationOperatorFromString(EDataType eDataType, String initialValue) {
		GRelationOperator result = GRelationOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGRelationOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GAdditionOperator createGAdditionOperatorFromString(EDataType eDataType, String initialValue) {
		GAdditionOperator result = GAdditionOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGAdditionOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMultiplicationOperator createGMultiplicationOperatorFromString(EDataType eDataType, String initialValue) {
		GMultiplicationOperator result = GMultiplicationOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGMultiplicationOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GNegationOperator createGNegationOperatorFromString(EDataType eDataType, String initialValue) {
		GNegationOperator result = GNegationOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGNegationOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GexpressionsPackage getGexpressionsPackage() {
		return (GexpressionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GexpressionsPackage getPackage() {
		return GexpressionsPackage.eINSTANCE;
	}

} //GexpressionsFactoryImpl
