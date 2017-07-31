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
package org.eclipse.gemoc.gexpressions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.gemoc.gexpressions.GexpressionsFactory
 * @model kind="package"
 * @generated
 */
public interface GexpressionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gexpressions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.gemoc.org/gexpressions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gexpressions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GexpressionsPackage eINSTANCE = org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.impl.GProgramImpl <em>GProgram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.impl.GProgramImpl
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGProgram()
	 * @generated
	 */
	int GPROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPROGRAM__IMPORTS = 0;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPROGRAM__EXPRESSIONS = 1;

	/**
	 * The number of structural features of the '<em>GProgram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPROGRAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GProgram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.impl.GImportStatementImpl <em>GImport Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.impl.GImportStatementImpl
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGImportStatement()
	 * @generated
	 */
	int GIMPORT_STATEMENT = 1;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIMPORT_STATEMENT__IMPORT_URI = 0;

	/**
	 * The number of structural features of the '<em>GImport Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIMPORT_STATEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GImport Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIMPORT_STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.impl.GExpressionImpl <em>GExpression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.impl.GExpressionImpl
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGExpression()
	 * @generated
	 */
	int GEXPRESSION = 2;

	/**
	 * The number of structural features of the '<em>GExpression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>GExpression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.impl.GNavigationExpressionImpl <em>GNavigation Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.impl.GNavigationExpressionImpl
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGNavigationExpression()
	 * @generated
	 */
	int GNAVIGATION_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNAVIGATION_EXPRESSION__BODY = GEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referenced EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNAVIGATION_EXPRESSION__REFERENCED_EOBJECT = GEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GNavigation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNAVIGATION_EXPRESSION_FEATURE_COUNT = GEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>GNavigation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNAVIGATION_EXPRESSION_OPERATION_COUNT = GEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.impl.GReferenceExpressionImpl <em>GReference Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.impl.GReferenceExpressionImpl
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGReferenceExpression()
	 * @generated
	 */
	int GREFERENCE_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Referenced Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREFERENCE_EXPRESSION__REFERENCED_OBJECT = GEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referenced EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREFERENCE_EXPRESSION__REFERENCED_EOBJECT = GEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GReference Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREFERENCE_EXPRESSION_FEATURE_COUNT = GEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>GReference Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREFERENCE_EXPRESSION_OPERATION_COUNT = GEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.impl.GPrimaryExpressionImpl <em>GPrimary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.impl.GPrimaryExpressionImpl
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGPrimaryExpression()
	 * @generated
	 */
	int GPRIMARY_EXPRESSION = 5;

	/**
	 * The number of structural features of the '<em>GPrimary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPRIMARY_EXPRESSION_FEATURE_COUNT = GEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GPrimary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPRIMARY_EXPRESSION_OPERATION_COUNT = GEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.impl.GStringExpressionImpl <em>GString Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.impl.GStringExpressionImpl
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGStringExpression()
	 * @generated
	 */
	int GSTRING_EXPRESSION = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSTRING_EXPRESSION__VALUE = GPRIMARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GString Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSTRING_EXPRESSION_FEATURE_COUNT = GPRIMARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GString Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSTRING_EXPRESSION_OPERATION_COUNT = GPRIMARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.impl.GBooleanExpressionImpl <em>GBoolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.impl.GBooleanExpressionImpl
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGBooleanExpression()
	 * @generated
	 */
	int GBOOLEAN_EXPRESSION = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GBOOLEAN_EXPRESSION__VALUE = GPRIMARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GBoolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GBOOLEAN_EXPRESSION_FEATURE_COUNT = GPRIMARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GBoolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GBOOLEAN_EXPRESSION_OPERATION_COUNT = GPRIMARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.impl.GNumericExpressionImpl <em>GNumeric Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.impl.GNumericExpressionImpl
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGNumericExpression()
	 * @generated
	 */
	int GNUMERIC_EXPRESSION = 8;

	/**
	 * The number of structural features of the '<em>GNumeric Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNUMERIC_EXPRESSION_FEATURE_COUNT = GPRIMARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GNumeric Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNUMERIC_EXPRESSION_OPERATION_COUNT = GPRIMARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.impl.GIntegerExpressionImpl <em>GInteger Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.impl.GIntegerExpressionImpl
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGIntegerExpression()
	 * @generated
	 */
	int GINTEGER_EXPRESSION = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GINTEGER_EXPRESSION__VALUE = GNUMERIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GInteger Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GINTEGER_EXPRESSION_FEATURE_COUNT = GNUMERIC_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GInteger Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GINTEGER_EXPRESSION_OPERATION_COUNT = GNUMERIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.impl.GDoubleExpressionImpl <em>GDouble Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.impl.GDoubleExpressionImpl
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGDoubleExpression()
	 * @generated
	 */
	int GDOUBLE_EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDOUBLE_EXPRESSION__VALUE = GNUMERIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GDouble Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDOUBLE_EXPRESSION_FEATURE_COUNT = GNUMERIC_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GDouble Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDOUBLE_EXPRESSION_OPERATION_COUNT = GNUMERIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.impl.GIfExpressionImpl <em>GIf Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.impl.GIfExpressionImpl
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGIfExpression()
	 * @generated
	 */
	int GIF_EXPRESSION = 11;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIF_EXPRESSION__CONDITION = GPRIMARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIF_EXPRESSION__THEN_EXPRESSION = GPRIMARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIF_EXPRESSION__ELSE_EXPRESSION = GPRIMARY_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>GIf Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIF_EXPRESSION_FEATURE_COUNT = GPRIMARY_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>GIf Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIF_EXPRESSION_OPERATION_COUNT = GPRIMARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.impl.GBraceExpressionImpl <em>GBrace Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.impl.GBraceExpressionImpl
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGBraceExpression()
	 * @generated
	 */
	int GBRACE_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Inner Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GBRACE_EXPRESSION__INNER_EXPRESSION = GPRIMARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GBrace Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GBRACE_EXPRESSION_FEATURE_COUNT = GPRIMARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GBrace Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GBRACE_EXPRESSION_OPERATION_COUNT = GPRIMARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.impl.GEnumLiteralExpressionImpl <em>GEnum Literal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.impl.GEnumLiteralExpressionImpl
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGEnumLiteralExpression()
	 * @generated
	 */
	int GENUM_LITERAL_EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENUM_LITERAL_EXPRESSION__VALUE = GPRIMARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GEnum Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENUM_LITERAL_EXPRESSION_FEATURE_COUNT = GPRIMARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GEnum Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENUM_LITERAL_EXPRESSION_OPERATION_COUNT = GPRIMARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.impl.GBinaryOperatorExpressionImpl <em>GBinary Operator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.impl.GBinaryOperatorExpressionImpl
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGBinaryOperatorExpression()
	 * @generated
	 */
	int GBINARY_OPERATOR_EXPRESSION = 14;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GBINARY_OPERATOR_EXPRESSION__LEFT_OPERAND = GEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GBINARY_OPERATOR_EXPRESSION__RIGHT_OPERAND = GEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GBinary Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GBINARY_OPERATOR_EXPRESSION_FEATURE_COUNT = GEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>GBinary Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GBINARY_OPERATOR_EXPRESSION_OPERATION_COUNT = GEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.impl.GUnaryOperatorExpressionImpl <em>GUnary Operator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.impl.GUnaryOperatorExpressionImpl
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGUnaryOperatorExpression()
	 * @generated
	 */
	int GUNARY_OPERATOR_EXPRESSION = 15;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUNARY_OPERATOR_EXPRESSION__OPERAND = GEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GUnary Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUNARY_OPERATOR_EXPRESSION_FEATURE_COUNT = GEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GUnary Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUNARY_OPERATOR_EXPRESSION_OPERATION_COUNT = GEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.impl.GBooleanOperatorExpressionImpl <em>GBoolean Operator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.impl.GBooleanOperatorExpressionImpl
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGBooleanOperatorExpression()
	 * @generated
	 */
	int GBOOLEAN_OPERATOR_EXPRESSION = 16;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GBOOLEAN_OPERATOR_EXPRESSION__LEFT_OPERAND = GBINARY_OPERATOR_EXPRESSION__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GBOOLEAN_OPERATOR_EXPRESSION__RIGHT_OPERAND = GBINARY_OPERATOR_EXPRESSION__RIGHT_OPERAND;

	/**
	 * The number of structural features of the '<em>GBoolean Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GBOOLEAN_OPERATOR_EXPRESSION_FEATURE_COUNT = GBINARY_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GBoolean Operator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GBOOLEAN_OPERATOR_EXPRESSION_OPERATION_COUNT = GBINARY_OPERATOR_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.impl.GAndExpressionImpl <em>GAnd Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.impl.GAndExpressionImpl
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGAndExpression()
	 * @generated
	 */
	int GAND_EXPRESSION = 17;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAND_EXPRESSION__LEFT_OPERAND = GBOOLEAN_OPERATOR_EXPRESSION__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAND_EXPRESSION__RIGHT_OPERAND = GBOOLEAN_OPERATOR_EXPRESSION__RIGHT_OPERAND;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAND_EXPRESSION__OPERATOR = GBOOLEAN_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GAnd Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAND_EXPRESSION_FEATURE_COUNT = GBOOLEAN_OPERATOR_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GAnd Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAND_EXPRESSION_OPERATION_COUNT = GBOOLEAN_OPERATOR_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.impl.GXorExpressionImpl <em>GXor Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.impl.GXorExpressionImpl
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGXorExpression()
	 * @generated
	 */
	int GXOR_EXPRESSION = 18;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GXOR_EXPRESSION__LEFT_OPERAND = GBOOLEAN_OPERATOR_EXPRESSION__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GXOR_EXPRESSION__RIGHT_OPERAND = GBOOLEAN_OPERATOR_EXPRESSION__RIGHT_OPERAND;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GXOR_EXPRESSION__OPERATOR = GBOOLEAN_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GXor Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GXOR_EXPRESSION_FEATURE_COUNT = GBOOLEAN_OPERATOR_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GXor Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GXOR_EXPRESSION_OPERATION_COUNT = GBOOLEAN_OPERATOR_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.impl.GOrExpressionImpl <em>GOr Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.impl.GOrExpressionImpl
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGOrExpression()
	 * @generated
	 */
	int GOR_EXPRESSION = 19;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOR_EXPRESSION__LEFT_OPERAND = GBOOLEAN_OPERATOR_EXPRESSION__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOR_EXPRESSION__RIGHT_OPERAND = GBOOLEAN_OPERATOR_EXPRESSION__RIGHT_OPERAND;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOR_EXPRESSION__OPERATOR = GBOOLEAN_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GOr Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOR_EXPRESSION_FEATURE_COUNT = GBOOLEAN_OPERATOR_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GOr Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOR_EXPRESSION_OPERATION_COUNT = GBOOLEAN_OPERATOR_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.impl.GEqualityExpressionImpl <em>GEquality Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.impl.GEqualityExpressionImpl
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGEqualityExpression()
	 * @generated
	 */
	int GEQUALITY_EXPRESSION = 20;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEQUALITY_EXPRESSION__LEFT_OPERAND = GBINARY_OPERATOR_EXPRESSION__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEQUALITY_EXPRESSION__RIGHT_OPERAND = GBINARY_OPERATOR_EXPRESSION__RIGHT_OPERAND;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEQUALITY_EXPRESSION__OPERATOR = GBINARY_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GEquality Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEQUALITY_EXPRESSION_FEATURE_COUNT = GBINARY_OPERATOR_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GEquality Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEQUALITY_EXPRESSION_OPERATION_COUNT = GBINARY_OPERATOR_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.impl.GRelationExpressionImpl <em>GRelation Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.impl.GRelationExpressionImpl
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGRelationExpression()
	 * @generated
	 */
	int GRELATION_EXPRESSION = 21;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRELATION_EXPRESSION__LEFT_OPERAND = GBINARY_OPERATOR_EXPRESSION__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRELATION_EXPRESSION__RIGHT_OPERAND = GBINARY_OPERATOR_EXPRESSION__RIGHT_OPERAND;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRELATION_EXPRESSION__OPERATOR = GBINARY_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GRelation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRELATION_EXPRESSION_FEATURE_COUNT = GBINARY_OPERATOR_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GRelation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRELATION_EXPRESSION_OPERATION_COUNT = GBINARY_OPERATOR_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.impl.GAdditionExpressionImpl <em>GAddition Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.impl.GAdditionExpressionImpl
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGAdditionExpression()
	 * @generated
	 */
	int GADDITION_EXPRESSION = 22;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GADDITION_EXPRESSION__LEFT_OPERAND = GBINARY_OPERATOR_EXPRESSION__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GADDITION_EXPRESSION__RIGHT_OPERAND = GBINARY_OPERATOR_EXPRESSION__RIGHT_OPERAND;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GADDITION_EXPRESSION__OPERATOR = GBINARY_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GAddition Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GADDITION_EXPRESSION_FEATURE_COUNT = GBINARY_OPERATOR_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GAddition Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GADDITION_EXPRESSION_OPERATION_COUNT = GBINARY_OPERATOR_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.impl.GMultiplicationExpressionImpl <em>GMultiplication Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.impl.GMultiplicationExpressionImpl
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGMultiplicationExpression()
	 * @generated
	 */
	int GMULTIPLICATION_EXPRESSION = 23;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMULTIPLICATION_EXPRESSION__LEFT_OPERAND = GBINARY_OPERATOR_EXPRESSION__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMULTIPLICATION_EXPRESSION__RIGHT_OPERAND = GBINARY_OPERATOR_EXPRESSION__RIGHT_OPERAND;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMULTIPLICATION_EXPRESSION__OPERATOR = GBINARY_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GMultiplication Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMULTIPLICATION_EXPRESSION_FEATURE_COUNT = GBINARY_OPERATOR_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GMultiplication Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GMULTIPLICATION_EXPRESSION_OPERATION_COUNT = GBINARY_OPERATOR_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.impl.GNegationExpressionImpl <em>GNegation Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.impl.GNegationExpressionImpl
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGNegationExpression()
	 * @generated
	 */
	int GNEGATION_EXPRESSION = 24;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNEGATION_EXPRESSION__OPERAND = GUNARY_OPERATOR_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNEGATION_EXPRESSION__OPERATOR = GUNARY_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GNegation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNEGATION_EXPRESSION_FEATURE_COUNT = GUNARY_OPERATOR_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GNegation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNEGATION_EXPRESSION_OPERATION_COUNT = GUNARY_OPERATOR_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.GAndOperator <em>GAnd Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.GAndOperator
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGAndOperator()
	 * @generated
	 */
	int GAND_OPERATOR = 25;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.GXorOperator <em>GXor Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.GXorOperator
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGXorOperator()
	 * @generated
	 */
	int GXOR_OPERATOR = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.GOrOperator <em>GOr Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.GOrOperator
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGOrOperator()
	 * @generated
	 */
	int GOR_OPERATOR = 27;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.GEqualityOperator <em>GEquality Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.GEqualityOperator
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGEqualityOperator()
	 * @generated
	 */
	int GEQUALITY_OPERATOR = 28;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.GRelationOperator <em>GRelation Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.GRelationOperator
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGRelationOperator()
	 * @generated
	 */
	int GRELATION_OPERATOR = 29;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.GAdditionOperator <em>GAddition Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.GAdditionOperator
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGAdditionOperator()
	 * @generated
	 */
	int GADDITION_OPERATOR = 30;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.GMultiplicationOperator <em>GMultiplication Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.GMultiplicationOperator
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGMultiplicationOperator()
	 * @generated
	 */
	int GMULTIPLICATION_OPERATOR = 31;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.gexpressions.GNegationOperator <em>GNegation Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.gexpressions.GNegationOperator
	 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGNegationOperator()
	 * @generated
	 */
	int GNEGATION_OPERATOR = 32;


	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.gexpressions.GProgram <em>GProgram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GProgram</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GProgram
	 * @generated
	 */
	EClass getGProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.gexpressions.GProgram#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GProgram#getImports()
	 * @see #getGProgram()
	 * @generated
	 */
	EReference getGProgram_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.gexpressions.GProgram#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GProgram#getExpressions()
	 * @see #getGProgram()
	 * @generated
	 */
	EReference getGProgram_Expressions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.gexpressions.GImportStatement <em>GImport Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GImport Statement</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GImportStatement
	 * @generated
	 */
	EClass getGImportStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.gexpressions.GImportStatement#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GImportStatement#getImportURI()
	 * @see #getGImportStatement()
	 * @generated
	 */
	EAttribute getGImportStatement_ImportURI();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.gexpressions.GExpression <em>GExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GExpression</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GExpression
	 * @generated
	 */
	EClass getGExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.gexpressions.GNavigationExpression <em>GNavigation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GNavigation Expression</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GNavigationExpression
	 * @generated
	 */
	EClass getGNavigationExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.gexpressions.GNavigationExpression#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GNavigationExpression#getBody()
	 * @see #getGNavigationExpression()
	 * @generated
	 */
	EReference getGNavigationExpression_Body();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.gexpressions.GNavigationExpression#getReferencedEObject <em>Referenced EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced EObject</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GNavigationExpression#getReferencedEObject()
	 * @see #getGNavigationExpression()
	 * @generated
	 */
	EReference getGNavigationExpression_ReferencedEObject();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.gexpressions.GReferenceExpression <em>GReference Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GReference Expression</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GReferenceExpression
	 * @generated
	 */
	EClass getGReferenceExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.gexpressions.GReferenceExpression#getReferencedObject <em>Referenced Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Object</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GReferenceExpression#getReferencedObject()
	 * @see #getGReferenceExpression()
	 * @generated
	 */
	EAttribute getGReferenceExpression_ReferencedObject();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.gexpressions.GReferenceExpression#getReferencedEObject <em>Referenced EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced EObject</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GReferenceExpression#getReferencedEObject()
	 * @see #getGReferenceExpression()
	 * @generated
	 */
	EReference getGReferenceExpression_ReferencedEObject();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.gexpressions.GPrimaryExpression <em>GPrimary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPrimary Expression</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GPrimaryExpression
	 * @generated
	 */
	EClass getGPrimaryExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.gexpressions.GStringExpression <em>GString Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GString Expression</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GStringExpression
	 * @generated
	 */
	EClass getGStringExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.gexpressions.GStringExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GStringExpression#getValue()
	 * @see #getGStringExpression()
	 * @generated
	 */
	EAttribute getGStringExpression_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.gexpressions.GBooleanExpression <em>GBoolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GBoolean Expression</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GBooleanExpression
	 * @generated
	 */
	EClass getGBooleanExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.gexpressions.GBooleanExpression#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GBooleanExpression#isValue()
	 * @see #getGBooleanExpression()
	 * @generated
	 */
	EAttribute getGBooleanExpression_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.gexpressions.GNumericExpression <em>GNumeric Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GNumeric Expression</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GNumericExpression
	 * @generated
	 */
	EClass getGNumericExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.gexpressions.GIntegerExpression <em>GInteger Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GInteger Expression</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GIntegerExpression
	 * @generated
	 */
	EClass getGIntegerExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.gexpressions.GIntegerExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GIntegerExpression#getValue()
	 * @see #getGIntegerExpression()
	 * @generated
	 */
	EAttribute getGIntegerExpression_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.gexpressions.GDoubleExpression <em>GDouble Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GDouble Expression</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GDoubleExpression
	 * @generated
	 */
	EClass getGDoubleExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.gexpressions.GDoubleExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GDoubleExpression#getValue()
	 * @see #getGDoubleExpression()
	 * @generated
	 */
	EAttribute getGDoubleExpression_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.gexpressions.GIfExpression <em>GIf Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GIf Expression</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GIfExpression
	 * @generated
	 */
	EClass getGIfExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.gexpressions.GIfExpression#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GIfExpression#getCondition()
	 * @see #getGIfExpression()
	 * @generated
	 */
	EReference getGIfExpression_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.gexpressions.GIfExpression#getThenExpression <em>Then Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Expression</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GIfExpression#getThenExpression()
	 * @see #getGIfExpression()
	 * @generated
	 */
	EReference getGIfExpression_ThenExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.gexpressions.GIfExpression#getElseExpression <em>Else Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Expression</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GIfExpression#getElseExpression()
	 * @see #getGIfExpression()
	 * @generated
	 */
	EReference getGIfExpression_ElseExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.gexpressions.GBraceExpression <em>GBrace Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GBrace Expression</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GBraceExpression
	 * @generated
	 */
	EClass getGBraceExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.gexpressions.GBraceExpression#getInnerExpression <em>Inner Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inner Expression</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GBraceExpression#getInnerExpression()
	 * @see #getGBraceExpression()
	 * @generated
	 */
	EReference getGBraceExpression_InnerExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.gexpressions.GEnumLiteralExpression <em>GEnum Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GEnum Literal Expression</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GEnumLiteralExpression
	 * @generated
	 */
	EClass getGEnumLiteralExpression();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.gexpressions.GEnumLiteralExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GEnumLiteralExpression#getValue()
	 * @see #getGEnumLiteralExpression()
	 * @generated
	 */
	EReference getGEnumLiteralExpression_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.gexpressions.GBinaryOperatorExpression <em>GBinary Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GBinary Operator Expression</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GBinaryOperatorExpression
	 * @generated
	 */
	EClass getGBinaryOperatorExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.gexpressions.GBinaryOperatorExpression#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GBinaryOperatorExpression#getLeftOperand()
	 * @see #getGBinaryOperatorExpression()
	 * @generated
	 */
	EReference getGBinaryOperatorExpression_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.gexpressions.GBinaryOperatorExpression#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GBinaryOperatorExpression#getRightOperand()
	 * @see #getGBinaryOperatorExpression()
	 * @generated
	 */
	EReference getGBinaryOperatorExpression_RightOperand();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.gexpressions.GUnaryOperatorExpression <em>GUnary Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GUnary Operator Expression</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GUnaryOperatorExpression
	 * @generated
	 */
	EClass getGUnaryOperatorExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.gexpressions.GUnaryOperatorExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GUnaryOperatorExpression#getOperand()
	 * @see #getGUnaryOperatorExpression()
	 * @generated
	 */
	EReference getGUnaryOperatorExpression_Operand();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.gexpressions.GBooleanOperatorExpression <em>GBoolean Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GBoolean Operator Expression</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GBooleanOperatorExpression
	 * @generated
	 */
	EClass getGBooleanOperatorExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.gexpressions.GAndExpression <em>GAnd Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GAnd Expression</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GAndExpression
	 * @generated
	 */
	EClass getGAndExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.gexpressions.GAndExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GAndExpression#getOperator()
	 * @see #getGAndExpression()
	 * @generated
	 */
	EAttribute getGAndExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.gexpressions.GXorExpression <em>GXor Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GXor Expression</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GXorExpression
	 * @generated
	 */
	EClass getGXorExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.gexpressions.GXorExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GXorExpression#getOperator()
	 * @see #getGXorExpression()
	 * @generated
	 */
	EAttribute getGXorExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.gexpressions.GOrExpression <em>GOr Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GOr Expression</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GOrExpression
	 * @generated
	 */
	EClass getGOrExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.gexpressions.GOrExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GOrExpression#getOperator()
	 * @see #getGOrExpression()
	 * @generated
	 */
	EAttribute getGOrExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.gexpressions.GEqualityExpression <em>GEquality Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GEquality Expression</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GEqualityExpression
	 * @generated
	 */
	EClass getGEqualityExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.gexpressions.GEqualityExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GEqualityExpression#getOperator()
	 * @see #getGEqualityExpression()
	 * @generated
	 */
	EAttribute getGEqualityExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.gexpressions.GRelationExpression <em>GRelation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GRelation Expression</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GRelationExpression
	 * @generated
	 */
	EClass getGRelationExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.gexpressions.GRelationExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GRelationExpression#getOperator()
	 * @see #getGRelationExpression()
	 * @generated
	 */
	EAttribute getGRelationExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.gexpressions.GAdditionExpression <em>GAddition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GAddition Expression</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GAdditionExpression
	 * @generated
	 */
	EClass getGAdditionExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.gexpressions.GAdditionExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GAdditionExpression#getOperator()
	 * @see #getGAdditionExpression()
	 * @generated
	 */
	EAttribute getGAdditionExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.gexpressions.GMultiplicationExpression <em>GMultiplication Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GMultiplication Expression</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GMultiplicationExpression
	 * @generated
	 */
	EClass getGMultiplicationExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.gexpressions.GMultiplicationExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GMultiplicationExpression#getOperator()
	 * @see #getGMultiplicationExpression()
	 * @generated
	 */
	EAttribute getGMultiplicationExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.gexpressions.GNegationExpression <em>GNegation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GNegation Expression</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GNegationExpression
	 * @generated
	 */
	EClass getGNegationExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.gexpressions.GNegationExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GNegationExpression#getOperator()
	 * @see #getGNegationExpression()
	 * @generated
	 */
	EAttribute getGNegationExpression_Operator();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gemoc.gexpressions.GAndOperator <em>GAnd Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GAnd Operator</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GAndOperator
	 * @generated
	 */
	EEnum getGAndOperator();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gemoc.gexpressions.GXorOperator <em>GXor Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GXor Operator</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GXorOperator
	 * @generated
	 */
	EEnum getGXorOperator();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gemoc.gexpressions.GOrOperator <em>GOr Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GOr Operator</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GOrOperator
	 * @generated
	 */
	EEnum getGOrOperator();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gemoc.gexpressions.GEqualityOperator <em>GEquality Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GEquality Operator</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GEqualityOperator
	 * @generated
	 */
	EEnum getGEqualityOperator();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gemoc.gexpressions.GRelationOperator <em>GRelation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GRelation Operator</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GRelationOperator
	 * @generated
	 */
	EEnum getGRelationOperator();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gemoc.gexpressions.GAdditionOperator <em>GAddition Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GAddition Operator</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GAdditionOperator
	 * @generated
	 */
	EEnum getGAdditionOperator();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gemoc.gexpressions.GMultiplicationOperator <em>GMultiplication Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GMultiplication Operator</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GMultiplicationOperator
	 * @generated
	 */
	EEnum getGMultiplicationOperator();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gemoc.gexpressions.GNegationOperator <em>GNegation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GNegation Operator</em>'.
	 * @see org.eclipse.gemoc.gexpressions.GNegationOperator
	 * @generated
	 */
	EEnum getGNegationOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GexpressionsFactory getGexpressionsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.impl.GProgramImpl <em>GProgram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.impl.GProgramImpl
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGProgram()
		 * @generated
		 */
		EClass GPROGRAM = eINSTANCE.getGProgram();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GPROGRAM__IMPORTS = eINSTANCE.getGProgram_Imports();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GPROGRAM__EXPRESSIONS = eINSTANCE.getGProgram_Expressions();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.impl.GImportStatementImpl <em>GImport Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.impl.GImportStatementImpl
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGImportStatement()
		 * @generated
		 */
		EClass GIMPORT_STATEMENT = eINSTANCE.getGImportStatement();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIMPORT_STATEMENT__IMPORT_URI = eINSTANCE.getGImportStatement_ImportURI();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.impl.GExpressionImpl <em>GExpression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.impl.GExpressionImpl
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGExpression()
		 * @generated
		 */
		EClass GEXPRESSION = eINSTANCE.getGExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.impl.GNavigationExpressionImpl <em>GNavigation Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.impl.GNavigationExpressionImpl
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGNavigationExpression()
		 * @generated
		 */
		EClass GNAVIGATION_EXPRESSION = eINSTANCE.getGNavigationExpression();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GNAVIGATION_EXPRESSION__BODY = eINSTANCE.getGNavigationExpression_Body();

		/**
		 * The meta object literal for the '<em><b>Referenced EObject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GNAVIGATION_EXPRESSION__REFERENCED_EOBJECT = eINSTANCE.getGNavigationExpression_ReferencedEObject();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.impl.GReferenceExpressionImpl <em>GReference Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.impl.GReferenceExpressionImpl
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGReferenceExpression()
		 * @generated
		 */
		EClass GREFERENCE_EXPRESSION = eINSTANCE.getGReferenceExpression();

		/**
		 * The meta object literal for the '<em><b>Referenced Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GREFERENCE_EXPRESSION__REFERENCED_OBJECT = eINSTANCE.getGReferenceExpression_ReferencedObject();

		/**
		 * The meta object literal for the '<em><b>Referenced EObject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GREFERENCE_EXPRESSION__REFERENCED_EOBJECT = eINSTANCE.getGReferenceExpression_ReferencedEObject();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.impl.GPrimaryExpressionImpl <em>GPrimary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.impl.GPrimaryExpressionImpl
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGPrimaryExpression()
		 * @generated
		 */
		EClass GPRIMARY_EXPRESSION = eINSTANCE.getGPrimaryExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.impl.GStringExpressionImpl <em>GString Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.impl.GStringExpressionImpl
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGStringExpression()
		 * @generated
		 */
		EClass GSTRING_EXPRESSION = eINSTANCE.getGStringExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSTRING_EXPRESSION__VALUE = eINSTANCE.getGStringExpression_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.impl.GBooleanExpressionImpl <em>GBoolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.impl.GBooleanExpressionImpl
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGBooleanExpression()
		 * @generated
		 */
		EClass GBOOLEAN_EXPRESSION = eINSTANCE.getGBooleanExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GBOOLEAN_EXPRESSION__VALUE = eINSTANCE.getGBooleanExpression_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.impl.GNumericExpressionImpl <em>GNumeric Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.impl.GNumericExpressionImpl
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGNumericExpression()
		 * @generated
		 */
		EClass GNUMERIC_EXPRESSION = eINSTANCE.getGNumericExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.impl.GIntegerExpressionImpl <em>GInteger Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.impl.GIntegerExpressionImpl
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGIntegerExpression()
		 * @generated
		 */
		EClass GINTEGER_EXPRESSION = eINSTANCE.getGIntegerExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GINTEGER_EXPRESSION__VALUE = eINSTANCE.getGIntegerExpression_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.impl.GDoubleExpressionImpl <em>GDouble Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.impl.GDoubleExpressionImpl
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGDoubleExpression()
		 * @generated
		 */
		EClass GDOUBLE_EXPRESSION = eINSTANCE.getGDoubleExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GDOUBLE_EXPRESSION__VALUE = eINSTANCE.getGDoubleExpression_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.impl.GIfExpressionImpl <em>GIf Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.impl.GIfExpressionImpl
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGIfExpression()
		 * @generated
		 */
		EClass GIF_EXPRESSION = eINSTANCE.getGIfExpression();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIF_EXPRESSION__CONDITION = eINSTANCE.getGIfExpression_Condition();

		/**
		 * The meta object literal for the '<em><b>Then Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIF_EXPRESSION__THEN_EXPRESSION = eINSTANCE.getGIfExpression_ThenExpression();

		/**
		 * The meta object literal for the '<em><b>Else Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIF_EXPRESSION__ELSE_EXPRESSION = eINSTANCE.getGIfExpression_ElseExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.impl.GBraceExpressionImpl <em>GBrace Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.impl.GBraceExpressionImpl
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGBraceExpression()
		 * @generated
		 */
		EClass GBRACE_EXPRESSION = eINSTANCE.getGBraceExpression();

		/**
		 * The meta object literal for the '<em><b>Inner Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GBRACE_EXPRESSION__INNER_EXPRESSION = eINSTANCE.getGBraceExpression_InnerExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.impl.GEnumLiteralExpressionImpl <em>GEnum Literal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.impl.GEnumLiteralExpressionImpl
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGEnumLiteralExpression()
		 * @generated
		 */
		EClass GENUM_LITERAL_EXPRESSION = eINSTANCE.getGEnumLiteralExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENUM_LITERAL_EXPRESSION__VALUE = eINSTANCE.getGEnumLiteralExpression_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.impl.GBinaryOperatorExpressionImpl <em>GBinary Operator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.impl.GBinaryOperatorExpressionImpl
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGBinaryOperatorExpression()
		 * @generated
		 */
		EClass GBINARY_OPERATOR_EXPRESSION = eINSTANCE.getGBinaryOperatorExpression();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GBINARY_OPERATOR_EXPRESSION__LEFT_OPERAND = eINSTANCE.getGBinaryOperatorExpression_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GBINARY_OPERATOR_EXPRESSION__RIGHT_OPERAND = eINSTANCE.getGBinaryOperatorExpression_RightOperand();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.impl.GUnaryOperatorExpressionImpl <em>GUnary Operator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.impl.GUnaryOperatorExpressionImpl
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGUnaryOperatorExpression()
		 * @generated
		 */
		EClass GUNARY_OPERATOR_EXPRESSION = eINSTANCE.getGUnaryOperatorExpression();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUNARY_OPERATOR_EXPRESSION__OPERAND = eINSTANCE.getGUnaryOperatorExpression_Operand();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.impl.GBooleanOperatorExpressionImpl <em>GBoolean Operator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.impl.GBooleanOperatorExpressionImpl
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGBooleanOperatorExpression()
		 * @generated
		 */
		EClass GBOOLEAN_OPERATOR_EXPRESSION = eINSTANCE.getGBooleanOperatorExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.impl.GAndExpressionImpl <em>GAnd Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.impl.GAndExpressionImpl
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGAndExpression()
		 * @generated
		 */
		EClass GAND_EXPRESSION = eINSTANCE.getGAndExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAND_EXPRESSION__OPERATOR = eINSTANCE.getGAndExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.impl.GXorExpressionImpl <em>GXor Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.impl.GXorExpressionImpl
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGXorExpression()
		 * @generated
		 */
		EClass GXOR_EXPRESSION = eINSTANCE.getGXorExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GXOR_EXPRESSION__OPERATOR = eINSTANCE.getGXorExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.impl.GOrExpressionImpl <em>GOr Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.impl.GOrExpressionImpl
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGOrExpression()
		 * @generated
		 */
		EClass GOR_EXPRESSION = eINSTANCE.getGOrExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOR_EXPRESSION__OPERATOR = eINSTANCE.getGOrExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.impl.GEqualityExpressionImpl <em>GEquality Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.impl.GEqualityExpressionImpl
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGEqualityExpression()
		 * @generated
		 */
		EClass GEQUALITY_EXPRESSION = eINSTANCE.getGEqualityExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEQUALITY_EXPRESSION__OPERATOR = eINSTANCE.getGEqualityExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.impl.GRelationExpressionImpl <em>GRelation Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.impl.GRelationExpressionImpl
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGRelationExpression()
		 * @generated
		 */
		EClass GRELATION_EXPRESSION = eINSTANCE.getGRelationExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRELATION_EXPRESSION__OPERATOR = eINSTANCE.getGRelationExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.impl.GAdditionExpressionImpl <em>GAddition Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.impl.GAdditionExpressionImpl
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGAdditionExpression()
		 * @generated
		 */
		EClass GADDITION_EXPRESSION = eINSTANCE.getGAdditionExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GADDITION_EXPRESSION__OPERATOR = eINSTANCE.getGAdditionExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.impl.GMultiplicationExpressionImpl <em>GMultiplication Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.impl.GMultiplicationExpressionImpl
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGMultiplicationExpression()
		 * @generated
		 */
		EClass GMULTIPLICATION_EXPRESSION = eINSTANCE.getGMultiplicationExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GMULTIPLICATION_EXPRESSION__OPERATOR = eINSTANCE.getGMultiplicationExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.impl.GNegationExpressionImpl <em>GNegation Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.impl.GNegationExpressionImpl
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGNegationExpression()
		 * @generated
		 */
		EClass GNEGATION_EXPRESSION = eINSTANCE.getGNegationExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GNEGATION_EXPRESSION__OPERATOR = eINSTANCE.getGNegationExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.GAndOperator <em>GAnd Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.GAndOperator
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGAndOperator()
		 * @generated
		 */
		EEnum GAND_OPERATOR = eINSTANCE.getGAndOperator();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.GXorOperator <em>GXor Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.GXorOperator
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGXorOperator()
		 * @generated
		 */
		EEnum GXOR_OPERATOR = eINSTANCE.getGXorOperator();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.GOrOperator <em>GOr Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.GOrOperator
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGOrOperator()
		 * @generated
		 */
		EEnum GOR_OPERATOR = eINSTANCE.getGOrOperator();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.GEqualityOperator <em>GEquality Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.GEqualityOperator
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGEqualityOperator()
		 * @generated
		 */
		EEnum GEQUALITY_OPERATOR = eINSTANCE.getGEqualityOperator();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.GRelationOperator <em>GRelation Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.GRelationOperator
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGRelationOperator()
		 * @generated
		 */
		EEnum GRELATION_OPERATOR = eINSTANCE.getGRelationOperator();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.GAdditionOperator <em>GAddition Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.GAdditionOperator
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGAdditionOperator()
		 * @generated
		 */
		EEnum GADDITION_OPERATOR = eINSTANCE.getGAdditionOperator();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.GMultiplicationOperator <em>GMultiplication Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.GMultiplicationOperator
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGMultiplicationOperator()
		 * @generated
		 */
		EEnum GMULTIPLICATION_OPERATOR = eINSTANCE.getGMultiplicationOperator();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.gexpressions.GNegationOperator <em>GNegation Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.gexpressions.GNegationOperator
		 * @see org.eclipse.gemoc.gexpressions.impl.GexpressionsPackageImpl#getGNegationOperator()
		 * @generated
		 */
		EEnum GNEGATION_OPERATOR = eINSTANCE.getGNegationOperator();

	}

} //GexpressionsPackage
