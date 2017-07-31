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
package fsmTrace.States.impl;

import fsmTrace.States.State;
import fsmTrace.States.StateMachine_consummedString_Value;
import fsmTrace.States.StateMachine_currentState_Value;
import fsmTrace.States.StateMachine_producedString_Value;
import fsmTrace.States.StateMachine_unprocessedString_Value;
import fsmTrace.States.StatesPackage;

import fsmTrace.Steps.SpecificStep;
import fsmTrace.Steps.StepsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fsmTrace.States.impl.StateImpl#getEndedSteps <em>Ended Steps</em>}</li>
 *   <li>{@link fsmTrace.States.impl.StateImpl#getStartedSteps <em>Started Steps</em>}</li>
 *   <li>{@link fsmTrace.States.impl.StateImpl#getStateMachine_consummedString_Values <em>State Machine consummed String Values</em>}</li>
 *   <li>{@link fsmTrace.States.impl.StateImpl#getStateMachine_currentState_Values <em>State Machine current State Values</em>}</li>
 *   <li>{@link fsmTrace.States.impl.StateImpl#getStateMachine_producedString_Values <em>State Machine produced String Values</em>}</li>
 *   <li>{@link fsmTrace.States.impl.StateImpl#getStateMachine_unprocessedString_Values <em>State Machine unprocessed String Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The cached value of the '{@link #getEndedSteps() <em>Ended Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndedSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecificStep> endedSteps;

	/**
	 * The cached value of the '{@link #getStartedSteps() <em>Started Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartedSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecificStep> startedSteps;

	/**
	 * The cached value of the '{@link #getStateMachine_consummedString_Values() <em>State Machine consummed String Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachine_consummedString_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachine_consummedString_Value> stateMachine_consummedString_Values;

	/**
	 * The cached value of the '{@link #getStateMachine_currentState_Values() <em>State Machine current State Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachine_currentState_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachine_currentState_Value> stateMachine_currentState_Values;

	/**
	 * The cached value of the '{@link #getStateMachine_producedString_Values() <em>State Machine produced String Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachine_producedString_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachine_producedString_Value> stateMachine_producedString_Values;

	/**
	 * The cached value of the '{@link #getStateMachine_unprocessedString_Values() <em>State Machine unprocessed String Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachine_unprocessedString_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachine_unprocessedString_Value> stateMachine_unprocessedString_Values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificStep> getEndedSteps() {
		if (endedSteps == null) {
			endedSteps = new EObjectWithInverseResolvingEList<SpecificStep>(SpecificStep.class, this, StatesPackage.STATE__ENDED_STEPS, StepsPackage.SPECIFIC_STEP__ENDING_STATE);
		}
		return endedSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificStep> getStartedSteps() {
		if (startedSteps == null) {
			startedSteps = new EObjectWithInverseResolvingEList<SpecificStep>(SpecificStep.class, this, StatesPackage.STATE__STARTED_STEPS, StepsPackage.SPECIFIC_STEP__STARTING_STATE);
		}
		return startedSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachine_consummedString_Value> getStateMachine_consummedString_Values() {
		if (stateMachine_consummedString_Values == null) {
			stateMachine_consummedString_Values = new EObjectWithInverseResolvingEList.ManyInverse<StateMachine_consummedString_Value>(StateMachine_consummedString_Value.class, this, StatesPackage.STATE__STATE_MACHINE_CONSUMMED_STRING_VALUES, StatesPackage.STATE_MACHINE_CONSUMMED_STRING_VALUE__STATES);
		}
		return stateMachine_consummedString_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachine_currentState_Value> getStateMachine_currentState_Values() {
		if (stateMachine_currentState_Values == null) {
			stateMachine_currentState_Values = new EObjectWithInverseResolvingEList.ManyInverse<StateMachine_currentState_Value>(StateMachine_currentState_Value.class, this, StatesPackage.STATE__STATE_MACHINE_CURRENT_STATE_VALUES, StatesPackage.STATE_MACHINE_CURRENT_STATE_VALUE__STATES);
		}
		return stateMachine_currentState_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachine_producedString_Value> getStateMachine_producedString_Values() {
		if (stateMachine_producedString_Values == null) {
			stateMachine_producedString_Values = new EObjectWithInverseResolvingEList.ManyInverse<StateMachine_producedString_Value>(StateMachine_producedString_Value.class, this, StatesPackage.STATE__STATE_MACHINE_PRODUCED_STRING_VALUES, StatesPackage.STATE_MACHINE_PRODUCED_STRING_VALUE__STATES);
		}
		return stateMachine_producedString_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachine_unprocessedString_Value> getStateMachine_unprocessedString_Values() {
		if (stateMachine_unprocessedString_Values == null) {
			stateMachine_unprocessedString_Values = new EObjectWithInverseResolvingEList.ManyInverse<StateMachine_unprocessedString_Value>(StateMachine_unprocessedString_Value.class, this, StatesPackage.STATE__STATE_MACHINE_UNPROCESSED_STRING_VALUES, StatesPackage.STATE_MACHINE_UNPROCESSED_STRING_VALUE__STATES);
		}
		return stateMachine_unprocessedString_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesPackage.STATE__ENDED_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndedSteps()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__STARTED_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStartedSteps()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__STATE_MACHINE_CONSUMMED_STRING_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStateMachine_consummedString_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__STATE_MACHINE_CURRENT_STATE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStateMachine_currentState_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__STATE_MACHINE_PRODUCED_STRING_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStateMachine_producedString_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__STATE_MACHINE_UNPROCESSED_STRING_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStateMachine_unprocessedString_Values()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesPackage.STATE__ENDED_STEPS:
				return ((InternalEList<?>)getEndedSteps()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__STARTED_STEPS:
				return ((InternalEList<?>)getStartedSteps()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__STATE_MACHINE_CONSUMMED_STRING_VALUES:
				return ((InternalEList<?>)getStateMachine_consummedString_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__STATE_MACHINE_CURRENT_STATE_VALUES:
				return ((InternalEList<?>)getStateMachine_currentState_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__STATE_MACHINE_PRODUCED_STRING_VALUES:
				return ((InternalEList<?>)getStateMachine_producedString_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__STATE_MACHINE_UNPROCESSED_STRING_VALUES:
				return ((InternalEList<?>)getStateMachine_unprocessedString_Values()).basicRemove(otherEnd, msgs);
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
			case StatesPackage.STATE__ENDED_STEPS:
				return getEndedSteps();
			case StatesPackage.STATE__STARTED_STEPS:
				return getStartedSteps();
			case StatesPackage.STATE__STATE_MACHINE_CONSUMMED_STRING_VALUES:
				return getStateMachine_consummedString_Values();
			case StatesPackage.STATE__STATE_MACHINE_CURRENT_STATE_VALUES:
				return getStateMachine_currentState_Values();
			case StatesPackage.STATE__STATE_MACHINE_PRODUCED_STRING_VALUES:
				return getStateMachine_producedString_Values();
			case StatesPackage.STATE__STATE_MACHINE_UNPROCESSED_STRING_VALUES:
				return getStateMachine_unprocessedString_Values();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatesPackage.STATE__ENDED_STEPS:
				getEndedSteps().clear();
				getEndedSteps().addAll((Collection<? extends SpecificStep>)newValue);
				return;
			case StatesPackage.STATE__STARTED_STEPS:
				getStartedSteps().clear();
				getStartedSteps().addAll((Collection<? extends SpecificStep>)newValue);
				return;
			case StatesPackage.STATE__STATE_MACHINE_CONSUMMED_STRING_VALUES:
				getStateMachine_consummedString_Values().clear();
				getStateMachine_consummedString_Values().addAll((Collection<? extends StateMachine_consummedString_Value>)newValue);
				return;
			case StatesPackage.STATE__STATE_MACHINE_CURRENT_STATE_VALUES:
				getStateMachine_currentState_Values().clear();
				getStateMachine_currentState_Values().addAll((Collection<? extends StateMachine_currentState_Value>)newValue);
				return;
			case StatesPackage.STATE__STATE_MACHINE_PRODUCED_STRING_VALUES:
				getStateMachine_producedString_Values().clear();
				getStateMachine_producedString_Values().addAll((Collection<? extends StateMachine_producedString_Value>)newValue);
				return;
			case StatesPackage.STATE__STATE_MACHINE_UNPROCESSED_STRING_VALUES:
				getStateMachine_unprocessedString_Values().clear();
				getStateMachine_unprocessedString_Values().addAll((Collection<? extends StateMachine_unprocessedString_Value>)newValue);
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
			case StatesPackage.STATE__ENDED_STEPS:
				getEndedSteps().clear();
				return;
			case StatesPackage.STATE__STARTED_STEPS:
				getStartedSteps().clear();
				return;
			case StatesPackage.STATE__STATE_MACHINE_CONSUMMED_STRING_VALUES:
				getStateMachine_consummedString_Values().clear();
				return;
			case StatesPackage.STATE__STATE_MACHINE_CURRENT_STATE_VALUES:
				getStateMachine_currentState_Values().clear();
				return;
			case StatesPackage.STATE__STATE_MACHINE_PRODUCED_STRING_VALUES:
				getStateMachine_producedString_Values().clear();
				return;
			case StatesPackage.STATE__STATE_MACHINE_UNPROCESSED_STRING_VALUES:
				getStateMachine_unprocessedString_Values().clear();
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
			case StatesPackage.STATE__ENDED_STEPS:
				return endedSteps != null && !endedSteps.isEmpty();
			case StatesPackage.STATE__STARTED_STEPS:
				return startedSteps != null && !startedSteps.isEmpty();
			case StatesPackage.STATE__STATE_MACHINE_CONSUMMED_STRING_VALUES:
				return stateMachine_consummedString_Values != null && !stateMachine_consummedString_Values.isEmpty();
			case StatesPackage.STATE__STATE_MACHINE_CURRENT_STATE_VALUES:
				return stateMachine_currentState_Values != null && !stateMachine_currentState_Values.isEmpty();
			case StatesPackage.STATE__STATE_MACHINE_PRODUCED_STRING_VALUES:
				return stateMachine_producedString_Values != null && !stateMachine_producedString_Values.isEmpty();
			case StatesPackage.STATE__STATE_MACHINE_UNPROCESSED_STRING_VALUES:
				return stateMachine_unprocessedString_Values != null && !stateMachine_unprocessedString_Values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateImpl
