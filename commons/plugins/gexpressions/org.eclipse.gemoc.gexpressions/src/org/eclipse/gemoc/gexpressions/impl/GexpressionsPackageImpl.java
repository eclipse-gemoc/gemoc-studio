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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gemoc.gexpressions.GAdditionExpression;
import org.eclipse.gemoc.gexpressions.GAdditionOperator;
import org.eclipse.gemoc.gexpressions.GAndExpression;
import org.eclipse.gemoc.gexpressions.GAndOperator;
import org.eclipse.gemoc.gexpressions.GBinaryOperatorExpression;
import org.eclipse.gemoc.gexpressions.GBooleanExpression;
import org.eclipse.gemoc.gexpressions.GBooleanOperatorExpression;
import org.eclipse.gemoc.gexpressions.GBraceExpression;
import org.eclipse.gemoc.gexpressions.GDoubleExpression;
import org.eclipse.gemoc.gexpressions.GEnumLiteralExpression;
import org.eclipse.gemoc.gexpressions.GEqualityExpression;
import org.eclipse.gemoc.gexpressions.GEqualityOperator;
import org.eclipse.gemoc.gexpressions.GExpression;
import org.eclipse.gemoc.gexpressions.GIfExpression;
import org.eclipse.gemoc.gexpressions.GImportStatement;
import org.eclipse.gemoc.gexpressions.GIntegerExpression;
import org.eclipse.gemoc.gexpressions.GMultiplicationExpression;
import org.eclipse.gemoc.gexpressions.GMultiplicationOperator;
import org.eclipse.gemoc.gexpressions.GNavigationExpression;
import org.eclipse.gemoc.gexpressions.GNegationExpression;
import org.eclipse.gemoc.gexpressions.GNegationOperator;
import org.eclipse.gemoc.gexpressions.GNumericExpression;
import org.eclipse.gemoc.gexpressions.GOrExpression;
import org.eclipse.gemoc.gexpressions.GOrOperator;
import org.eclipse.gemoc.gexpressions.GPrimaryExpression;
import org.eclipse.gemoc.gexpressions.GProgram;
import org.eclipse.gemoc.gexpressions.GReferenceExpression;
import org.eclipse.gemoc.gexpressions.GRelationExpression;
import org.eclipse.gemoc.gexpressions.GRelationOperator;
import org.eclipse.gemoc.gexpressions.GStringExpression;
import org.eclipse.gemoc.gexpressions.GUnaryOperatorExpression;
import org.eclipse.gemoc.gexpressions.GXorExpression;
import org.eclipse.gemoc.gexpressions.GXorOperator;
import org.eclipse.gemoc.gexpressions.GexpressionsFactory;
import org.eclipse.gemoc.gexpressions.GexpressionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GexpressionsPackageImpl extends EPackageImpl implements GexpressionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gProgramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gImportStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gNavigationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gReferenceExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gPrimaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gStringExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gBooleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gNumericExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gIntegerExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gDoubleExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gIfExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gBraceExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gEnumLiteralExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gBinaryOperatorExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gUnaryOperatorExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gBooleanOperatorExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gAndExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gXorExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gOrExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gEqualityExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gRelationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gAdditionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gMultiplicationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gNegationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gAndOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gXorOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gOrOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gEqualityOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gRelationOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gAdditionOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gMultiplicationOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gNegationOperatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.gemoc.gexpressions.GexpressionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GexpressionsPackageImpl() {
		super(eNS_URI, GexpressionsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GexpressionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GexpressionsPackage init() {
		if (isInited) return (GexpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(GexpressionsPackage.eNS_URI);

		// Obtain or create and register package
		GexpressionsPackageImpl theGexpressionsPackage = (GexpressionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GexpressionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GexpressionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGexpressionsPackage.createPackageContents();

		// Initialize created meta-data
		theGexpressionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGexpressionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GexpressionsPackage.eNS_URI, theGexpressionsPackage);
		return theGexpressionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGProgram() {
		return gProgramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGProgram_Imports() {
		return (EReference)gProgramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGProgram_Expressions() {
		return (EReference)gProgramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGImportStatement() {
		return gImportStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGImportStatement_ImportURI() {
		return (EAttribute)gImportStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGExpression() {
		return gExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGNavigationExpression() {
		return gNavigationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGNavigationExpression_Body() {
		return (EReference)gNavigationExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGNavigationExpression_ReferencedEObject() {
		return (EReference)gNavigationExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGReferenceExpression() {
		return gReferenceExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGReferenceExpression_ReferencedObject() {
		return (EAttribute)gReferenceExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGReferenceExpression_ReferencedEObject() {
		return (EReference)gReferenceExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGPrimaryExpression() {
		return gPrimaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGStringExpression() {
		return gStringExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGStringExpression_Value() {
		return (EAttribute)gStringExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGBooleanExpression() {
		return gBooleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGBooleanExpression_Value() {
		return (EAttribute)gBooleanExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGNumericExpression() {
		return gNumericExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGIntegerExpression() {
		return gIntegerExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGIntegerExpression_Value() {
		return (EAttribute)gIntegerExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGDoubleExpression() {
		return gDoubleExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGDoubleExpression_Value() {
		return (EAttribute)gDoubleExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGIfExpression() {
		return gIfExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGIfExpression_Condition() {
		return (EReference)gIfExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGIfExpression_ThenExpression() {
		return (EReference)gIfExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGIfExpression_ElseExpression() {
		return (EReference)gIfExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGBraceExpression() {
		return gBraceExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGBraceExpression_InnerExpression() {
		return (EReference)gBraceExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGEnumLiteralExpression() {
		return gEnumLiteralExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGEnumLiteralExpression_Value() {
		return (EReference)gEnumLiteralExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGBinaryOperatorExpression() {
		return gBinaryOperatorExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGBinaryOperatorExpression_LeftOperand() {
		return (EReference)gBinaryOperatorExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGBinaryOperatorExpression_RightOperand() {
		return (EReference)gBinaryOperatorExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGUnaryOperatorExpression() {
		return gUnaryOperatorExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGUnaryOperatorExpression_Operand() {
		return (EReference)gUnaryOperatorExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGBooleanOperatorExpression() {
		return gBooleanOperatorExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGAndExpression() {
		return gAndExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGAndExpression_Operator() {
		return (EAttribute)gAndExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGXorExpression() {
		return gXorExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGXorExpression_Operator() {
		return (EAttribute)gXorExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGOrExpression() {
		return gOrExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGOrExpression_Operator() {
		return (EAttribute)gOrExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGEqualityExpression() {
		return gEqualityExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGEqualityExpression_Operator() {
		return (EAttribute)gEqualityExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGRelationExpression() {
		return gRelationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGRelationExpression_Operator() {
		return (EAttribute)gRelationExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGAdditionExpression() {
		return gAdditionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGAdditionExpression_Operator() {
		return (EAttribute)gAdditionExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGMultiplicationExpression() {
		return gMultiplicationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGMultiplicationExpression_Operator() {
		return (EAttribute)gMultiplicationExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGNegationExpression() {
		return gNegationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGNegationExpression_Operator() {
		return (EAttribute)gNegationExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGAndOperator() {
		return gAndOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGXorOperator() {
		return gXorOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGOrOperator() {
		return gOrOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGEqualityOperator() {
		return gEqualityOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGRelationOperator() {
		return gRelationOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGAdditionOperator() {
		return gAdditionOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGMultiplicationOperator() {
		return gMultiplicationOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGNegationOperator() {
		return gNegationOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GexpressionsFactory getGexpressionsFactory() {
		return (GexpressionsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		gProgramEClass = createEClass(GPROGRAM);
		createEReference(gProgramEClass, GPROGRAM__IMPORTS);
		createEReference(gProgramEClass, GPROGRAM__EXPRESSIONS);

		gImportStatementEClass = createEClass(GIMPORT_STATEMENT);
		createEAttribute(gImportStatementEClass, GIMPORT_STATEMENT__IMPORT_URI);

		gExpressionEClass = createEClass(GEXPRESSION);

		gNavigationExpressionEClass = createEClass(GNAVIGATION_EXPRESSION);
		createEReference(gNavigationExpressionEClass, GNAVIGATION_EXPRESSION__BODY);
		createEReference(gNavigationExpressionEClass, GNAVIGATION_EXPRESSION__REFERENCED_EOBJECT);

		gReferenceExpressionEClass = createEClass(GREFERENCE_EXPRESSION);
		createEAttribute(gReferenceExpressionEClass, GREFERENCE_EXPRESSION__REFERENCED_OBJECT);
		createEReference(gReferenceExpressionEClass, GREFERENCE_EXPRESSION__REFERENCED_EOBJECT);

		gPrimaryExpressionEClass = createEClass(GPRIMARY_EXPRESSION);

		gStringExpressionEClass = createEClass(GSTRING_EXPRESSION);
		createEAttribute(gStringExpressionEClass, GSTRING_EXPRESSION__VALUE);

		gBooleanExpressionEClass = createEClass(GBOOLEAN_EXPRESSION);
		createEAttribute(gBooleanExpressionEClass, GBOOLEAN_EXPRESSION__VALUE);

		gNumericExpressionEClass = createEClass(GNUMERIC_EXPRESSION);

		gIntegerExpressionEClass = createEClass(GINTEGER_EXPRESSION);
		createEAttribute(gIntegerExpressionEClass, GINTEGER_EXPRESSION__VALUE);

		gDoubleExpressionEClass = createEClass(GDOUBLE_EXPRESSION);
		createEAttribute(gDoubleExpressionEClass, GDOUBLE_EXPRESSION__VALUE);

		gIfExpressionEClass = createEClass(GIF_EXPRESSION);
		createEReference(gIfExpressionEClass, GIF_EXPRESSION__CONDITION);
		createEReference(gIfExpressionEClass, GIF_EXPRESSION__THEN_EXPRESSION);
		createEReference(gIfExpressionEClass, GIF_EXPRESSION__ELSE_EXPRESSION);

		gBraceExpressionEClass = createEClass(GBRACE_EXPRESSION);
		createEReference(gBraceExpressionEClass, GBRACE_EXPRESSION__INNER_EXPRESSION);

		gEnumLiteralExpressionEClass = createEClass(GENUM_LITERAL_EXPRESSION);
		createEReference(gEnumLiteralExpressionEClass, GENUM_LITERAL_EXPRESSION__VALUE);

		gBinaryOperatorExpressionEClass = createEClass(GBINARY_OPERATOR_EXPRESSION);
		createEReference(gBinaryOperatorExpressionEClass, GBINARY_OPERATOR_EXPRESSION__LEFT_OPERAND);
		createEReference(gBinaryOperatorExpressionEClass, GBINARY_OPERATOR_EXPRESSION__RIGHT_OPERAND);

		gUnaryOperatorExpressionEClass = createEClass(GUNARY_OPERATOR_EXPRESSION);
		createEReference(gUnaryOperatorExpressionEClass, GUNARY_OPERATOR_EXPRESSION__OPERAND);

		gBooleanOperatorExpressionEClass = createEClass(GBOOLEAN_OPERATOR_EXPRESSION);

		gAndExpressionEClass = createEClass(GAND_EXPRESSION);
		createEAttribute(gAndExpressionEClass, GAND_EXPRESSION__OPERATOR);

		gXorExpressionEClass = createEClass(GXOR_EXPRESSION);
		createEAttribute(gXorExpressionEClass, GXOR_EXPRESSION__OPERATOR);

		gOrExpressionEClass = createEClass(GOR_EXPRESSION);
		createEAttribute(gOrExpressionEClass, GOR_EXPRESSION__OPERATOR);

		gEqualityExpressionEClass = createEClass(GEQUALITY_EXPRESSION);
		createEAttribute(gEqualityExpressionEClass, GEQUALITY_EXPRESSION__OPERATOR);

		gRelationExpressionEClass = createEClass(GRELATION_EXPRESSION);
		createEAttribute(gRelationExpressionEClass, GRELATION_EXPRESSION__OPERATOR);

		gAdditionExpressionEClass = createEClass(GADDITION_EXPRESSION);
		createEAttribute(gAdditionExpressionEClass, GADDITION_EXPRESSION__OPERATOR);

		gMultiplicationExpressionEClass = createEClass(GMULTIPLICATION_EXPRESSION);
		createEAttribute(gMultiplicationExpressionEClass, GMULTIPLICATION_EXPRESSION__OPERATOR);

		gNegationExpressionEClass = createEClass(GNEGATION_EXPRESSION);
		createEAttribute(gNegationExpressionEClass, GNEGATION_EXPRESSION__OPERATOR);

		// Create enums
		gAndOperatorEEnum = createEEnum(GAND_OPERATOR);
		gXorOperatorEEnum = createEEnum(GXOR_OPERATOR);
		gOrOperatorEEnum = createEEnum(GOR_OPERATOR);
		gEqualityOperatorEEnum = createEEnum(GEQUALITY_OPERATOR);
		gRelationOperatorEEnum = createEEnum(GRELATION_OPERATOR);
		gAdditionOperatorEEnum = createEEnum(GADDITION_OPERATOR);
		gMultiplicationOperatorEEnum = createEEnum(GMULTIPLICATION_OPERATOR);
		gNegationOperatorEEnum = createEEnum(GNEGATION_OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gNavigationExpressionEClass.getESuperTypes().add(this.getGExpression());
		gReferenceExpressionEClass.getESuperTypes().add(this.getGExpression());
		gPrimaryExpressionEClass.getESuperTypes().add(this.getGExpression());
		gStringExpressionEClass.getESuperTypes().add(this.getGPrimaryExpression());
		gBooleanExpressionEClass.getESuperTypes().add(this.getGPrimaryExpression());
		gNumericExpressionEClass.getESuperTypes().add(this.getGPrimaryExpression());
		gIntegerExpressionEClass.getESuperTypes().add(this.getGNumericExpression());
		gDoubleExpressionEClass.getESuperTypes().add(this.getGNumericExpression());
		gIfExpressionEClass.getESuperTypes().add(this.getGPrimaryExpression());
		gBraceExpressionEClass.getESuperTypes().add(this.getGPrimaryExpression());
		gEnumLiteralExpressionEClass.getESuperTypes().add(this.getGPrimaryExpression());
		gBinaryOperatorExpressionEClass.getESuperTypes().add(this.getGExpression());
		gUnaryOperatorExpressionEClass.getESuperTypes().add(this.getGExpression());
		gBooleanOperatorExpressionEClass.getESuperTypes().add(this.getGBinaryOperatorExpression());
		gAndExpressionEClass.getESuperTypes().add(this.getGBooleanOperatorExpression());
		gXorExpressionEClass.getESuperTypes().add(this.getGBooleanOperatorExpression());
		gOrExpressionEClass.getESuperTypes().add(this.getGBooleanOperatorExpression());
		gEqualityExpressionEClass.getESuperTypes().add(this.getGBinaryOperatorExpression());
		gRelationExpressionEClass.getESuperTypes().add(this.getGBinaryOperatorExpression());
		gAdditionExpressionEClass.getESuperTypes().add(this.getGBinaryOperatorExpression());
		gMultiplicationExpressionEClass.getESuperTypes().add(this.getGBinaryOperatorExpression());
		gNegationExpressionEClass.getESuperTypes().add(this.getGUnaryOperatorExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(gProgramEClass, GProgram.class, "GProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGProgram_Imports(), this.getGImportStatement(), null, "imports", null, 0, -1, GProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGProgram_Expressions(), this.getGExpression(), null, "expressions", null, 0, -1, GProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gImportStatementEClass, GImportStatement.class, "GImportStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGImportStatement_ImportURI(), ecorePackage.getEString(), "importURI", null, 1, 1, GImportStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gExpressionEClass, GExpression.class, "GExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gNavigationExpressionEClass, GNavigationExpression.class, "GNavigationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGNavigationExpression_Body(), this.getGExpression(), null, "body", null, 1, 1, GNavigationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGNavigationExpression_ReferencedEObject(), theEcorePackage.getEObject(), null, "referencedEObject", null, 1, 1, GNavigationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gReferenceExpressionEClass, GReferenceExpression.class, "GReferenceExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGReferenceExpression_ReferencedObject(), ecorePackage.getEJavaObject(), "referencedObject", null, 0, 1, GReferenceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGReferenceExpression_ReferencedEObject(), ecorePackage.getEObject(), null, "referencedEObject", null, 1, 1, GReferenceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gPrimaryExpressionEClass, GPrimaryExpression.class, "GPrimaryExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gStringExpressionEClass, GStringExpression.class, "GStringExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGStringExpression_Value(), ecorePackage.getEString(), "value", null, 1, 1, GStringExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gBooleanExpressionEClass, GBooleanExpression.class, "GBooleanExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGBooleanExpression_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, GBooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gNumericExpressionEClass, GNumericExpression.class, "GNumericExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gIntegerExpressionEClass, GIntegerExpression.class, "GIntegerExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGIntegerExpression_Value(), ecorePackage.getEInt(), "value", null, 1, 1, GIntegerExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gDoubleExpressionEClass, GDoubleExpression.class, "GDoubleExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGDoubleExpression_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, GDoubleExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gIfExpressionEClass, GIfExpression.class, "GIfExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGIfExpression_Condition(), this.getGExpression(), null, "condition", null, 1, 1, GIfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGIfExpression_ThenExpression(), this.getGExpression(), null, "thenExpression", null, 1, 1, GIfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGIfExpression_ElseExpression(), this.getGExpression(), null, "elseExpression", null, 1, 1, GIfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gBraceExpressionEClass, GBraceExpression.class, "GBraceExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGBraceExpression_InnerExpression(), this.getGExpression(), null, "innerExpression", null, 1, 1, GBraceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gEnumLiteralExpressionEClass, GEnumLiteralExpression.class, "GEnumLiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGEnumLiteralExpression_Value(), theEcorePackage.getEEnumLiteral(), null, "value", null, 1, 1, GEnumLiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gBinaryOperatorExpressionEClass, GBinaryOperatorExpression.class, "GBinaryOperatorExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGBinaryOperatorExpression_LeftOperand(), this.getGExpression(), null, "leftOperand", null, 1, 1, GBinaryOperatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGBinaryOperatorExpression_RightOperand(), this.getGExpression(), null, "rightOperand", null, 1, 1, GBinaryOperatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gUnaryOperatorExpressionEClass, GUnaryOperatorExpression.class, "GUnaryOperatorExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGUnaryOperatorExpression_Operand(), this.getGExpression(), null, "operand", null, 1, 1, GUnaryOperatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gBooleanOperatorExpressionEClass, GBooleanOperatorExpression.class, "GBooleanOperatorExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gAndExpressionEClass, GAndExpression.class, "GAndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGAndExpression_Operator(), this.getGAndOperator(), "operator", null, 1, 1, GAndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gXorExpressionEClass, GXorExpression.class, "GXorExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGXorExpression_Operator(), this.getGXorOperator(), "operator", null, 1, 1, GXorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gOrExpressionEClass, GOrExpression.class, "GOrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGOrExpression_Operator(), this.getGOrOperator(), "operator", null, 1, 1, GOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gEqualityExpressionEClass, GEqualityExpression.class, "GEqualityExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGEqualityExpression_Operator(), this.getGEqualityOperator(), "operator", null, 1, 1, GEqualityExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gRelationExpressionEClass, GRelationExpression.class, "GRelationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGRelationExpression_Operator(), this.getGRelationOperator(), "operator", null, 1, 1, GRelationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gAdditionExpressionEClass, GAdditionExpression.class, "GAdditionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGAdditionExpression_Operator(), this.getGAdditionOperator(), "operator", null, 1, 1, GAdditionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gMultiplicationExpressionEClass, GMultiplicationExpression.class, "GMultiplicationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGMultiplicationExpression_Operator(), this.getGMultiplicationOperator(), "operator", null, 1, 1, GMultiplicationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gNegationExpressionEClass, GNegationExpression.class, "GNegationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGNegationExpression_Operator(), this.getGNegationOperator(), "operator", null, 1, 1, GNegationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(gAndOperatorEEnum, GAndOperator.class, "GAndOperator");
		addEEnumLiteral(gAndOperatorEEnum, GAndOperator.AND);

		initEEnum(gXorOperatorEEnum, GXorOperator.class, "GXorOperator");
		addEEnumLiteral(gXorOperatorEEnum, GXorOperator.XOR);

		initEEnum(gOrOperatorEEnum, GOrOperator.class, "GOrOperator");
		addEEnumLiteral(gOrOperatorEEnum, GOrOperator.OR);

		initEEnum(gEqualityOperatorEEnum, GEqualityOperator.class, "GEqualityOperator");
		addEEnumLiteral(gEqualityOperatorEEnum, GEqualityOperator.EQUAL);
		addEEnumLiteral(gEqualityOperatorEEnum, GEqualityOperator.NOTEQUAL);

		initEEnum(gRelationOperatorEEnum, GRelationOperator.class, "GRelationOperator");
		addEEnumLiteral(gRelationOperatorEEnum, GRelationOperator.LESS);
		addEEnumLiteral(gRelationOperatorEEnum, GRelationOperator.GREATER);
		addEEnumLiteral(gRelationOperatorEEnum, GRelationOperator.LESSEQUAL);
		addEEnumLiteral(gRelationOperatorEEnum, GRelationOperator.GREATEREQUAL);

		initEEnum(gAdditionOperatorEEnum, GAdditionOperator.class, "GAdditionOperator");
		addEEnumLiteral(gAdditionOperatorEEnum, GAdditionOperator.ADDITION);
		addEEnumLiteral(gAdditionOperatorEEnum, GAdditionOperator.SUBTRACTION);

		initEEnum(gMultiplicationOperatorEEnum, GMultiplicationOperator.class, "GMultiplicationOperator");
		addEEnumLiteral(gMultiplicationOperatorEEnum, GMultiplicationOperator.MULTIPLICATION);
		addEEnumLiteral(gMultiplicationOperatorEEnum, GMultiplicationOperator.DIVISION);

		initEEnum(gNegationOperatorEEnum, GNegationOperator.class, "GNegationOperator");
		addEEnumLiteral(gNegationOperatorEEnum, GNegationOperator.NEGATION);
		addEEnumLiteral(gNegationOperatorEEnum, GNegationOperator.MINUS);

		// Create resource
		createResource(eNS_URI);
	}

} //GexpressionsPackageImpl
