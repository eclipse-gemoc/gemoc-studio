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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GBinary Operator Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.gexpressions.GBinaryOperatorExpression#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link org.eclipse.gemoc.gexpressions.GBinaryOperatorExpression#getRightOperand <em>Right Operand</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.gexpressions.GexpressionsPackage#getGBinaryOperatorExpression()
 * @model abstract="true"
 * @generated
 */
public interface GBinaryOperatorExpression extends GExpression {
	/**
	 * Returns the value of the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Operand</em>' containment reference.
	 * @see #setLeftOperand(GExpression)
	 * @see org.eclipse.gemoc.gexpressions.GexpressionsPackage#getGBinaryOperatorExpression_LeftOperand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GExpression getLeftOperand();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.gexpressions.GBinaryOperatorExpression#getLeftOperand <em>Left Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Operand</em>' containment reference.
	 * @see #getLeftOperand()
	 * @generated
	 */
	void setLeftOperand(GExpression value);

	/**
	 * Returns the value of the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Operand</em>' containment reference.
	 * @see #setRightOperand(GExpression)
	 * @see org.eclipse.gemoc.gexpressions.GexpressionsPackage#getGBinaryOperatorExpression_RightOperand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GExpression getRightOperand();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.gexpressions.GBinaryOperatorExpression#getRightOperand <em>Right Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Operand</em>' containment reference.
	 * @see #getRightOperand()
	 * @generated
	 */
	void setRightOperand(GExpression value);

} // GBinaryOperatorExpression
