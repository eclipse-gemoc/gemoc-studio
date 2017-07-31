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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GNavigation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.gexpressions.GNavigationExpression#getBody <em>Body</em>}</li>
 *   <li>{@link org.eclipse.gemoc.gexpressions.GNavigationExpression#getReferencedEObject <em>Referenced EObject</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.gexpressions.GexpressionsPackage#getGNavigationExpression()
 * @model
 * @generated
 */
public interface GNavigationExpression extends GExpression {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(GExpression)
	 * @see org.eclipse.gemoc.gexpressions.GexpressionsPackage#getGNavigationExpression_Body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GExpression getBody();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.gexpressions.GNavigationExpression#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(GExpression value);

	/**
	 * Returns the value of the '<em><b>Referenced EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced EObject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced EObject</em>' reference.
	 * @see #setReferencedEObject(EObject)
	 * @see org.eclipse.gemoc.gexpressions.GexpressionsPackage#getGNavigationExpression_ReferencedEObject()
	 * @model required="true"
	 * @generated
	 */
	EObject getReferencedEObject();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.gexpressions.GNavigationExpression#getReferencedEObject <em>Referenced EObject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced EObject</em>' reference.
	 * @see #getReferencedEObject()
	 * @generated
	 */
	void setReferencedEObject(EObject value);

} // GNavigationExpression
