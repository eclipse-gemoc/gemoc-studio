/*******************************************************************************
 * Copyright (c) 2015, 2017  Inria  and others.
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
package fsmTrace.States.fsm.impl;

import fsmTrace.States.SpecificDimension;
import fsmTrace.States.StateMachine_consummedString_Dimension;
import fsmTrace.States.StateMachine_currentState_Dimension;
import fsmTrace.States.StateMachine_producedString_Dimension;
import fsmTrace.States.StateMachine_unprocessedString_Dimension;

import fsmTrace.States.fsm.FsmPackage;
import fsmTrace.States.fsm.TracedStateMachine;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fsmTrace.States.fsm.impl.TracedStateMachineImpl#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link fsmTrace.States.fsm.impl.TracedStateMachineImpl#getStateMachine_consummedString_Dimension <em>State Machine consummed String Dimension</em>}</li>
 *   <li>{@link fsmTrace.States.fsm.impl.TracedStateMachineImpl#getStateMachine_currentState_Dimension <em>State Machine current State Dimension</em>}</li>
 *   <li>{@link fsmTrace.States.fsm.impl.TracedStateMachineImpl#getStateMachine_producedString_Dimension <em>State Machine produced String Dimension</em>}</li>
 *   <li>{@link fsmTrace.States.fsm.impl.TracedStateMachineImpl#getStateMachine_unprocessedString_Dimension <em>State Machine unprocessed String Dimension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedStateMachineImpl extends TracedNamedElementImpl implements TracedStateMachine {
	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected StateMachine originalObject;

	/**
	 * The cached value of the '{@link #getStateMachine_consummedString_Dimension() <em>State Machine consummed String Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachine_consummedString_Dimension()
	 * @generated
	 * @ordered
	 */
	protected StateMachine_consummedString_Dimension stateMachine_consummedString_Dimension;

	/**
	 * The cached value of the '{@link #getStateMachine_currentState_Dimension() <em>State Machine current State Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachine_currentState_Dimension()
	 * @generated
	 * @ordered
	 */
	protected StateMachine_currentState_Dimension stateMachine_currentState_Dimension;

	/**
	 * The cached value of the '{@link #getStateMachine_producedString_Dimension() <em>State Machine produced String Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachine_producedString_Dimension()
	 * @generated
	 * @ordered
	 */
	protected StateMachine_producedString_Dimension stateMachine_producedString_Dimension;

	/**
	 * The cached value of the '{@link #getStateMachine_unprocessedString_Dimension() <em>State Machine unprocessed String Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachine_unprocessedString_Dimension()
	 * @generated
	 * @ordered
	 */
	protected StateMachine_unprocessedString_Dimension stateMachine_unprocessedString_Dimension;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedStateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FsmPackage.Literals.TRACED_STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (StateMachine)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FsmPackage.TRACED_STATE_MACHINE__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(StateMachine newOriginalObject) {
		StateMachine oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.TRACED_STATE_MACHINE__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine_consummedString_Dimension getStateMachine_consummedString_Dimension() {
		return stateMachine_consummedString_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateMachine_consummedString_Dimension(StateMachine_consummedString_Dimension newStateMachine_consummedString_Dimension, NotificationChain msgs) {
		StateMachine_consummedString_Dimension oldStateMachine_consummedString_Dimension = stateMachine_consummedString_Dimension;
		stateMachine_consummedString_Dimension = newStateMachine_consummedString_Dimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_CONSUMMED_STRING_DIMENSION, oldStateMachine_consummedString_Dimension, newStateMachine_consummedString_Dimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateMachine_consummedString_Dimension(StateMachine_consummedString_Dimension newStateMachine_consummedString_Dimension) {
		if (newStateMachine_consummedString_Dimension != stateMachine_consummedString_Dimension) {
			NotificationChain msgs = null;
			if (stateMachine_consummedString_Dimension != null)
				msgs = ((InternalEObject)stateMachine_consummedString_Dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_CONSUMMED_STRING_DIMENSION, null, msgs);
			if (newStateMachine_consummedString_Dimension != null)
				msgs = ((InternalEObject)newStateMachine_consummedString_Dimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_CONSUMMED_STRING_DIMENSION, null, msgs);
			msgs = basicSetStateMachine_consummedString_Dimension(newStateMachine_consummedString_Dimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_CONSUMMED_STRING_DIMENSION, newStateMachine_consummedString_Dimension, newStateMachine_consummedString_Dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine_currentState_Dimension getStateMachine_currentState_Dimension() {
		return stateMachine_currentState_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateMachine_currentState_Dimension(StateMachine_currentState_Dimension newStateMachine_currentState_Dimension, NotificationChain msgs) {
		StateMachine_currentState_Dimension oldStateMachine_currentState_Dimension = stateMachine_currentState_Dimension;
		stateMachine_currentState_Dimension = newStateMachine_currentState_Dimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_CURRENT_STATE_DIMENSION, oldStateMachine_currentState_Dimension, newStateMachine_currentState_Dimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateMachine_currentState_Dimension(StateMachine_currentState_Dimension newStateMachine_currentState_Dimension) {
		if (newStateMachine_currentState_Dimension != stateMachine_currentState_Dimension) {
			NotificationChain msgs = null;
			if (stateMachine_currentState_Dimension != null)
				msgs = ((InternalEObject)stateMachine_currentState_Dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_CURRENT_STATE_DIMENSION, null, msgs);
			if (newStateMachine_currentState_Dimension != null)
				msgs = ((InternalEObject)newStateMachine_currentState_Dimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_CURRENT_STATE_DIMENSION, null, msgs);
			msgs = basicSetStateMachine_currentState_Dimension(newStateMachine_currentState_Dimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_CURRENT_STATE_DIMENSION, newStateMachine_currentState_Dimension, newStateMachine_currentState_Dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine_producedString_Dimension getStateMachine_producedString_Dimension() {
		return stateMachine_producedString_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateMachine_producedString_Dimension(StateMachine_producedString_Dimension newStateMachine_producedString_Dimension, NotificationChain msgs) {
		StateMachine_producedString_Dimension oldStateMachine_producedString_Dimension = stateMachine_producedString_Dimension;
		stateMachine_producedString_Dimension = newStateMachine_producedString_Dimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_PRODUCED_STRING_DIMENSION, oldStateMachine_producedString_Dimension, newStateMachine_producedString_Dimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateMachine_producedString_Dimension(StateMachine_producedString_Dimension newStateMachine_producedString_Dimension) {
		if (newStateMachine_producedString_Dimension != stateMachine_producedString_Dimension) {
			NotificationChain msgs = null;
			if (stateMachine_producedString_Dimension != null)
				msgs = ((InternalEObject)stateMachine_producedString_Dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_PRODUCED_STRING_DIMENSION, null, msgs);
			if (newStateMachine_producedString_Dimension != null)
				msgs = ((InternalEObject)newStateMachine_producedString_Dimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_PRODUCED_STRING_DIMENSION, null, msgs);
			msgs = basicSetStateMachine_producedString_Dimension(newStateMachine_producedString_Dimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_PRODUCED_STRING_DIMENSION, newStateMachine_producedString_Dimension, newStateMachine_producedString_Dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine_unprocessedString_Dimension getStateMachine_unprocessedString_Dimension() {
		return stateMachine_unprocessedString_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateMachine_unprocessedString_Dimension(StateMachine_unprocessedString_Dimension newStateMachine_unprocessedString_Dimension, NotificationChain msgs) {
		StateMachine_unprocessedString_Dimension oldStateMachine_unprocessedString_Dimension = stateMachine_unprocessedString_Dimension;
		stateMachine_unprocessedString_Dimension = newStateMachine_unprocessedString_Dimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_UNPROCESSED_STRING_DIMENSION, oldStateMachine_unprocessedString_Dimension, newStateMachine_unprocessedString_Dimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateMachine_unprocessedString_Dimension(StateMachine_unprocessedString_Dimension newStateMachine_unprocessedString_Dimension) {
		if (newStateMachine_unprocessedString_Dimension != stateMachine_unprocessedString_Dimension) {
			NotificationChain msgs = null;
			if (stateMachine_unprocessedString_Dimension != null)
				msgs = ((InternalEObject)stateMachine_unprocessedString_Dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_UNPROCESSED_STRING_DIMENSION, null, msgs);
			if (newStateMachine_unprocessedString_Dimension != null)
				msgs = ((InternalEObject)newStateMachine_unprocessedString_Dimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_UNPROCESSED_STRING_DIMENSION, null, msgs);
			msgs = basicSetStateMachine_unprocessedString_Dimension(newStateMachine_unprocessedString_Dimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_UNPROCESSED_STRING_DIMENSION, newStateMachine_unprocessedString_Dimension, newStateMachine_unprocessedString_Dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificDimension<?>> getDimensionsInternal() {
		final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);
		result.addAll(super.getDimensionsInternal());
		result.add(getStateMachine_currentState_Dimension());
		result.add(getStateMachine_unprocessedString_Dimension());
		result.add(getStateMachine_consummedString_Dimension());
		result.add(getStateMachine_producedString_Dimension());
		return result;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_CONSUMMED_STRING_DIMENSION:
				return basicSetStateMachine_consummedString_Dimension(null, msgs);
			case FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_CURRENT_STATE_DIMENSION:
				return basicSetStateMachine_currentState_Dimension(null, msgs);
			case FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_PRODUCED_STRING_DIMENSION:
				return basicSetStateMachine_producedString_Dimension(null, msgs);
			case FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_UNPROCESSED_STRING_DIMENSION:
				return basicSetStateMachine_unprocessedString_Dimension(null, msgs);
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
			case FsmPackage.TRACED_STATE_MACHINE__ORIGINAL_OBJECT:
				if (resolve) return getOriginalObject();
				return basicGetOriginalObject();
			case FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_CONSUMMED_STRING_DIMENSION:
				return getStateMachine_consummedString_Dimension();
			case FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_CURRENT_STATE_DIMENSION:
				return getStateMachine_currentState_Dimension();
			case FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_PRODUCED_STRING_DIMENSION:
				return getStateMachine_producedString_Dimension();
			case FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_UNPROCESSED_STRING_DIMENSION:
				return getStateMachine_unprocessedString_Dimension();
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
			case FsmPackage.TRACED_STATE_MACHINE__ORIGINAL_OBJECT:
				setOriginalObject((StateMachine)newValue);
				return;
			case FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_CONSUMMED_STRING_DIMENSION:
				setStateMachine_consummedString_Dimension((StateMachine_consummedString_Dimension)newValue);
				return;
			case FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_CURRENT_STATE_DIMENSION:
				setStateMachine_currentState_Dimension((StateMachine_currentState_Dimension)newValue);
				return;
			case FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_PRODUCED_STRING_DIMENSION:
				setStateMachine_producedString_Dimension((StateMachine_producedString_Dimension)newValue);
				return;
			case FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_UNPROCESSED_STRING_DIMENSION:
				setStateMachine_unprocessedString_Dimension((StateMachine_unprocessedString_Dimension)newValue);
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
			case FsmPackage.TRACED_STATE_MACHINE__ORIGINAL_OBJECT:
				setOriginalObject((StateMachine)null);
				return;
			case FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_CONSUMMED_STRING_DIMENSION:
				setStateMachine_consummedString_Dimension((StateMachine_consummedString_Dimension)null);
				return;
			case FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_CURRENT_STATE_DIMENSION:
				setStateMachine_currentState_Dimension((StateMachine_currentState_Dimension)null);
				return;
			case FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_PRODUCED_STRING_DIMENSION:
				setStateMachine_producedString_Dimension((StateMachine_producedString_Dimension)null);
				return;
			case FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_UNPROCESSED_STRING_DIMENSION:
				setStateMachine_unprocessedString_Dimension((StateMachine_unprocessedString_Dimension)null);
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
			case FsmPackage.TRACED_STATE_MACHINE__ORIGINAL_OBJECT:
				return originalObject != null;
			case FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_CONSUMMED_STRING_DIMENSION:
				return stateMachine_consummedString_Dimension != null;
			case FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_CURRENT_STATE_DIMENSION:
				return stateMachine_currentState_Dimension != null;
			case FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_PRODUCED_STRING_DIMENSION:
				return stateMachine_producedString_Dimension != null;
			case FsmPackage.TRACED_STATE_MACHINE__STATE_MACHINE_UNPROCESSED_STRING_DIMENSION:
				return stateMachine_unprocessedString_Dimension != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedStateMachineImpl
