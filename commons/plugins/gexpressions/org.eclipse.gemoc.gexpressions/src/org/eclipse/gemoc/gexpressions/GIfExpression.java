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
 * A representation of the model object '<em><b>GIf Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.gexpressions.GIfExpression#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.gemoc.gexpressions.GIfExpression#getThenExpression <em>Then Expression</em>}</li>
 *   <li>{@link org.eclipse.gemoc.gexpressions.GIfExpression#getElseExpression <em>Else Expression</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.gexpressions.GexpressionsPackage#getGIfExpression()
 * @model
 * @generated
 */
public interface GIfExpression extends GPrimaryExpression {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(GExpression)
	 * @see org.eclipse.gemoc.gexpressions.GexpressionsPackage#getGIfExpression_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GExpression getCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.gexpressions.GIfExpression#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(GExpression value);

	/**
	 * Returns the value of the '<em><b>Then Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Expression</em>' containment reference.
	 * @see #setThenExpression(GExpression)
	 * @see org.eclipse.gemoc.gexpressions.GexpressionsPackage#getGIfExpression_ThenExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GExpression getThenExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.gexpressions.GIfExpression#getThenExpression <em>Then Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Expression</em>' containment reference.
	 * @see #getThenExpression()
	 * @generated
	 */
	void setThenExpression(GExpression value);

	/**
	 * Returns the value of the '<em><b>Else Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Expression</em>' containment reference.
	 * @see #setElseExpression(GExpression)
	 * @see org.eclipse.gemoc.gexpressions.GexpressionsPackage#getGIfExpression_ElseExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GExpression getElseExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.gexpressions.GIfExpression#getElseExpression <em>Else Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Expression</em>' containment reference.
	 * @see #getElseExpression()
	 * @generated
	 */
	void setElseExpression(GExpression value);

} // GIfExpression
