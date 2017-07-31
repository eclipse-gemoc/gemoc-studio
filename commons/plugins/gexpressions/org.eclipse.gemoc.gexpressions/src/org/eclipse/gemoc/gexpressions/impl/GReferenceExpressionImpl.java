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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gemoc.gexpressions.GReferenceExpression;
import org.eclipse.gemoc.gexpressions.GexpressionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GReference Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.gexpressions.impl.GReferenceExpressionImpl#getReferencedObject <em>Referenced Object</em>}</li>
 *   <li>{@link org.eclipse.gemoc.gexpressions.impl.GReferenceExpressionImpl#getReferencedEObject <em>Referenced EObject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GReferenceExpressionImpl extends GExpressionImpl implements GReferenceExpression {
	/**
	 * The default value of the '{@link #getReferencedObject() <em>Referenced Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedObject()
	 * @generated
	 * @ordered
	 */
	protected static final Object REFERENCED_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferencedObject() <em>Referenced Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedObject()
	 * @generated
	 * @ordered
	 */
	protected Object referencedObject = REFERENCED_OBJECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferencedEObject() <em>Referenced EObject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedEObject()
	 * @generated
	 * @ordered
	 */
	protected EObject referencedEObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GReferenceExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GexpressionsPackage.Literals.GREFERENCE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getReferencedObject() {
		return referencedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedObject(Object newReferencedObject) {
		Object oldReferencedObject = referencedObject;
		referencedObject = newReferencedObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GexpressionsPackage.GREFERENCE_EXPRESSION__REFERENCED_OBJECT, oldReferencedObject, referencedObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getReferencedEObject() {
		if (referencedEObject != null && referencedEObject.eIsProxy()) {
			InternalEObject oldReferencedEObject = (InternalEObject)referencedEObject;
			referencedEObject = eResolveProxy(oldReferencedEObject);
			if (referencedEObject != oldReferencedEObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GexpressionsPackage.GREFERENCE_EXPRESSION__REFERENCED_EOBJECT, oldReferencedEObject, referencedEObject));
			}
		}
		return referencedEObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetReferencedEObject() {
		return referencedEObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedEObject(EObject newReferencedEObject) {
		EObject oldReferencedEObject = referencedEObject;
		referencedEObject = newReferencedEObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GexpressionsPackage.GREFERENCE_EXPRESSION__REFERENCED_EOBJECT, oldReferencedEObject, referencedEObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GexpressionsPackage.GREFERENCE_EXPRESSION__REFERENCED_OBJECT:
				return getReferencedObject();
			case GexpressionsPackage.GREFERENCE_EXPRESSION__REFERENCED_EOBJECT:
				if (resolve) return getReferencedEObject();
				return basicGetReferencedEObject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GexpressionsPackage.GREFERENCE_EXPRESSION__REFERENCED_OBJECT:
				setReferencedObject(newValue);
				return;
			case GexpressionsPackage.GREFERENCE_EXPRESSION__REFERENCED_EOBJECT:
				setReferencedEObject((EObject)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GexpressionsPackage.GREFERENCE_EXPRESSION__REFERENCED_OBJECT:
				setReferencedObject(REFERENCED_OBJECT_EDEFAULT);
				return;
			case GexpressionsPackage.GREFERENCE_EXPRESSION__REFERENCED_EOBJECT:
				setReferencedEObject((EObject)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GexpressionsPackage.GREFERENCE_EXPRESSION__REFERENCED_OBJECT:
				return REFERENCED_OBJECT_EDEFAULT == null ? referencedObject != null : !REFERENCED_OBJECT_EDEFAULT.equals(referencedObject);
			case GexpressionsPackage.GREFERENCE_EXPRESSION__REFERENCED_EOBJECT:
				return referencedEObject != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (referencedObject: ");
		result.append(referencedObject);
		result.append(')');
		return result.toString();
	}

} //GReferenceExpressionImpl
