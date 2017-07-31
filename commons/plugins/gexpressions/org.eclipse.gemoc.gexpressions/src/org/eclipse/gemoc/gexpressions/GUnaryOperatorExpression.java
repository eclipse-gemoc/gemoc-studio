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
 * A representation of the model object '<em><b>GUnary Operator Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.gexpressions.GUnaryOperatorExpression#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.gexpressions.GexpressionsPackage#getGUnaryOperatorExpression()
 * @model abstract="true"
 * @generated
 */
public interface GUnaryOperatorExpression extends GExpression {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference.
	 * @see #setOperand(GExpression)
	 * @see org.eclipse.gemoc.gexpressions.GexpressionsPackage#getGUnaryOperatorExpression_Operand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GExpression getOperand();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.gexpressions.GUnaryOperatorExpression#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(GExpression value);

} // GUnaryOperatorExpression
