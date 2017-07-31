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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gemoc.gexpressions.GexpressionsPackage
 * @generated
 */
public interface GexpressionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GexpressionsFactory eINSTANCE = org.eclipse.gemoc.gexpressions.impl.GexpressionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>GProgram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GProgram</em>'.
	 * @generated
	 */
	GProgram createGProgram();

	/**
	 * Returns a new object of class '<em>GImport Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GImport Statement</em>'.
	 * @generated
	 */
	GImportStatement createGImportStatement();

	/**
	 * Returns a new object of class '<em>GNavigation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GNavigation Expression</em>'.
	 * @generated
	 */
	GNavigationExpression createGNavigationExpression();

	/**
	 * Returns a new object of class '<em>GReference Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GReference Expression</em>'.
	 * @generated
	 */
	GReferenceExpression createGReferenceExpression();

	/**
	 * Returns a new object of class '<em>GString Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GString Expression</em>'.
	 * @generated
	 */
	GStringExpression createGStringExpression();

	/**
	 * Returns a new object of class '<em>GBoolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GBoolean Expression</em>'.
	 * @generated
	 */
	GBooleanExpression createGBooleanExpression();

	/**
	 * Returns a new object of class '<em>GInteger Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GInteger Expression</em>'.
	 * @generated
	 */
	GIntegerExpression createGIntegerExpression();

	/**
	 * Returns a new object of class '<em>GDouble Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GDouble Expression</em>'.
	 * @generated
	 */
	GDoubleExpression createGDoubleExpression();

	/**
	 * Returns a new object of class '<em>GIf Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GIf Expression</em>'.
	 * @generated
	 */
	GIfExpression createGIfExpression();

	/**
	 * Returns a new object of class '<em>GBrace Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GBrace Expression</em>'.
	 * @generated
	 */
	GBraceExpression createGBraceExpression();

	/**
	 * Returns a new object of class '<em>GEnum Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GEnum Literal Expression</em>'.
	 * @generated
	 */
	GEnumLiteralExpression createGEnumLiteralExpression();

	/**
	 * Returns a new object of class '<em>GAnd Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GAnd Expression</em>'.
	 * @generated
	 */
	GAndExpression createGAndExpression();

	/**
	 * Returns a new object of class '<em>GXor Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GXor Expression</em>'.
	 * @generated
	 */
	GXorExpression createGXorExpression();

	/**
	 * Returns a new object of class '<em>GOr Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GOr Expression</em>'.
	 * @generated
	 */
	GOrExpression createGOrExpression();

	/**
	 * Returns a new object of class '<em>GEquality Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GEquality Expression</em>'.
	 * @generated
	 */
	GEqualityExpression createGEqualityExpression();

	/**
	 * Returns a new object of class '<em>GRelation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GRelation Expression</em>'.
	 * @generated
	 */
	GRelationExpression createGRelationExpression();

	/**
	 * Returns a new object of class '<em>GAddition Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GAddition Expression</em>'.
	 * @generated
	 */
	GAdditionExpression createGAdditionExpression();

	/**
	 * Returns a new object of class '<em>GMultiplication Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GMultiplication Expression</em>'.
	 * @generated
	 */
	GMultiplicationExpression createGMultiplicationExpression();

	/**
	 * Returns a new object of class '<em>GNegation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GNegation Expression</em>'.
	 * @generated
	 */
	GNegationExpression createGNegationExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GexpressionsPackage getGexpressionsPackage();

} //GexpressionsFactory
