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
 * A representation of the model object '<em><b>GReference Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.gexpressions.GReferenceExpression#getReferencedObject <em>Referenced Object</em>}</li>
 *   <li>{@link org.eclipse.gemoc.gexpressions.GReferenceExpression#getReferencedEObject <em>Referenced EObject</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.gexpressions.GexpressionsPackage#getGReferenceExpression()
 * @model
 * @generated
 */
public interface GReferenceExpression extends GExpression {
	/**
	 * Returns the value of the '<em><b>Referenced Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Object</em>' attribute.
	 * @see #setReferencedObject(Object)
	 * @see org.eclipse.gemoc.gexpressions.GexpressionsPackage#getGReferenceExpression_ReferencedObject()
	 * @model
	 * @generated
	 */
	Object getReferencedObject();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.gexpressions.GReferenceExpression#getReferencedObject <em>Referenced Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Object</em>' attribute.
	 * @see #getReferencedObject()
	 * @generated
	 */
	void setReferencedObject(Object value);

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
	 * @see org.eclipse.gemoc.gexpressions.GexpressionsPackage#getGReferenceExpression_ReferencedEObject()
	 * @model required="true"
	 * @generated
	 */
	EObject getReferencedEObject();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.gexpressions.GReferenceExpression#getReferencedEObject <em>Referenced EObject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced EObject</em>' reference.
	 * @see #getReferencedEObject()
	 * @generated
	 */
	void setReferencedEObject(EObject value);

} // GReferenceExpression
