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
 * A representation of the model object '<em><b>GBrace Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.gexpressions.GBraceExpression#getInnerExpression <em>Inner Expression</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.gexpressions.GexpressionsPackage#getGBraceExpression()
 * @model
 * @generated
 */
public interface GBraceExpression extends GPrimaryExpression {
	/**
	 * Returns the value of the '<em><b>Inner Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Expression</em>' containment reference.
	 * @see #setInnerExpression(GExpression)
	 * @see org.eclipse.gemoc.gexpressions.GexpressionsPackage#getGBraceExpression_InnerExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GExpression getInnerExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.gexpressions.GBraceExpression#getInnerExpression <em>Inner Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Expression</em>' containment reference.
	 * @see #getInnerExpression()
	 * @generated
	 */
	void setInnerExpression(GExpression value);

} // GBraceExpression
