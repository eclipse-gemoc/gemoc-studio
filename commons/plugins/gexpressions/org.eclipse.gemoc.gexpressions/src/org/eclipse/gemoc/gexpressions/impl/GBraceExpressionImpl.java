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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gemoc.gexpressions.GBraceExpression;
import org.eclipse.gemoc.gexpressions.GExpression;
import org.eclipse.gemoc.gexpressions.GexpressionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GBrace Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.gexpressions.impl.GBraceExpressionImpl#getInnerExpression <em>Inner Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GBraceExpressionImpl extends GPrimaryExpressionImpl implements GBraceExpression {
	/**
	 * The cached value of the '{@link #getInnerExpression() <em>Inner Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerExpression()
	 * @generated
	 * @ordered
	 */
	protected GExpression innerExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GBraceExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GexpressionsPackage.Literals.GBRACE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GExpression getInnerExpression() {
		return innerExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInnerExpression(GExpression newInnerExpression, NotificationChain msgs) {
		GExpression oldInnerExpression = innerExpression;
		innerExpression = newInnerExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GexpressionsPackage.GBRACE_EXPRESSION__INNER_EXPRESSION, oldInnerExpression, newInnerExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerExpression(GExpression newInnerExpression) {
		if (newInnerExpression != innerExpression) {
			NotificationChain msgs = null;
			if (innerExpression != null)
				msgs = ((InternalEObject)innerExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GexpressionsPackage.GBRACE_EXPRESSION__INNER_EXPRESSION, null, msgs);
			if (newInnerExpression != null)
				msgs = ((InternalEObject)newInnerExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GexpressionsPackage.GBRACE_EXPRESSION__INNER_EXPRESSION, null, msgs);
			msgs = basicSetInnerExpression(newInnerExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GexpressionsPackage.GBRACE_EXPRESSION__INNER_EXPRESSION, newInnerExpression, newInnerExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GexpressionsPackage.GBRACE_EXPRESSION__INNER_EXPRESSION:
				return basicSetInnerExpression(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GexpressionsPackage.GBRACE_EXPRESSION__INNER_EXPRESSION:
				return getInnerExpression();
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
			case GexpressionsPackage.GBRACE_EXPRESSION__INNER_EXPRESSION:
				setInnerExpression((GExpression)newValue);
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
			case GexpressionsPackage.GBRACE_EXPRESSION__INNER_EXPRESSION:
				setInnerExpression((GExpression)null);
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
			case GexpressionsPackage.GBRACE_EXPRESSION__INNER_EXPRESSION:
				return innerExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //GBraceExpressionImpl
