/**
 */
package org.eclipse.gemoc.example.k3fsm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gemoc.example.k3fsm.FSM;
import org.eclipse.gemoc.example.k3fsm.K3fsmPackage;
import org.eclipse.gemoc.example.k3fsm.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FSM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.example.k3fsm.impl.FSMImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gemoc.example.k3fsm.impl.FSMImpl#getOwnedStates <em>Owned States</em>}</li>
 *   <li>{@link org.eclipse.gemoc.example.k3fsm.impl.FSMImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link org.eclipse.gemoc.example.k3fsm.impl.FSMImpl#getFinalState <em>Final State</em>}</li>
 *   <li>{@link org.eclipse.gemoc.example.k3fsm.impl.FSMImpl#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link org.eclipse.gemoc.example.k3fsm.impl.FSMImpl#getUnprocessedString <em>Unprocessed String</em>}</li>
 *   <li>{@link org.eclipse.gemoc.example.k3fsm.impl.FSMImpl#getConsummedString <em>Consummed String</em>}</li>
 *   <li>{@link org.eclipse.gemoc.example.k3fsm.impl.FSMImpl#getProducedString <em>Produced String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FSMImpl extends MinimalEObjectImpl.Container implements FSM {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedStates() <em>Owned States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> ownedStates;

	/**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected State initialState;

	/**
	 * The cached value of the '{@link #getFinalState() <em>Final State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalState()
	 * @generated
	 * @ordered
	 */
	protected State finalState;

	/**
	 * The cached value of the '{@link #getCurrentState() <em>Current State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentState()
	 * @generated
	 * @ordered
	 */
	protected State currentState;

	/**
	 * The default value of the '{@link #getUnprocessedString() <em>Unprocessed String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnprocessedString()
	 * @generated
	 * @ordered
	 */
	protected static final String UNPROCESSED_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnprocessedString() <em>Unprocessed String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnprocessedString()
	 * @generated
	 * @ordered
	 */
	protected String unprocessedString = UNPROCESSED_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsummedString() <em>Consummed String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsummedString()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSUMMED_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsummedString() <em>Consummed String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsummedString()
	 * @generated
	 * @ordered
	 */
	protected String consummedString = CONSUMMED_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getProducedString() <em>Produced String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducedString()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCED_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProducedString() <em>Produced String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducedString()
	 * @generated
	 * @ordered
	 */
	protected String producedString = PRODUCED_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FSMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return K3fsmPackage.Literals.FSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K3fsmPackage.FSM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getOwnedStates() {
		if (ownedStates == null) {
			ownedStates = new EObjectContainmentWithInverseEList<State>(State.class, this,
					K3fsmPackage.FSM__OWNED_STATES, K3fsmPackage.STATE__OWNING_FSM);
		}
		return ownedStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getInitialState() {
		if (initialState != null && initialState.eIsProxy()) {
			InternalEObject oldInitialState = (InternalEObject) initialState;
			initialState = (State) eResolveProxy(oldInitialState);
			if (initialState != oldInitialState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, K3fsmPackage.FSM__INITIAL_STATE,
							oldInitialState, initialState));
			}
		}
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialState(State newInitialState) {
		State oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K3fsmPackage.FSM__INITIAL_STATE, oldInitialState,
					initialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getFinalState() {
		if (finalState != null && finalState.eIsProxy()) {
			InternalEObject oldFinalState = (InternalEObject) finalState;
			finalState = (State) eResolveProxy(oldFinalState);
			if (finalState != oldFinalState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, K3fsmPackage.FSM__FINAL_STATE,
							oldFinalState, finalState));
			}
		}
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetFinalState() {
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalState(State newFinalState) {
		State oldFinalState = finalState;
		finalState = newFinalState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K3fsmPackage.FSM__FINAL_STATE, oldFinalState,
					finalState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getCurrentState() {
		if (currentState != null && currentState.eIsProxy()) {
			InternalEObject oldCurrentState = (InternalEObject) currentState;
			currentState = (State) eResolveProxy(oldCurrentState);
			if (currentState != oldCurrentState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, K3fsmPackage.FSM__CURRENT_STATE,
							oldCurrentState, currentState));
			}
		}
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetCurrentState() {
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentState(State newCurrentState) {
		State oldCurrentState = currentState;
		currentState = newCurrentState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K3fsmPackage.FSM__CURRENT_STATE, oldCurrentState,
					currentState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnprocessedString() {
		return unprocessedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnprocessedString(String newUnprocessedString) {
		String oldUnprocessedString = unprocessedString;
		unprocessedString = newUnprocessedString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K3fsmPackage.FSM__UNPROCESSED_STRING,
					oldUnprocessedString, unprocessedString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsummedString() {
		return consummedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsummedString(String newConsummedString) {
		String oldConsummedString = consummedString;
		consummedString = newConsummedString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K3fsmPackage.FSM__CONSUMMED_STRING,
					oldConsummedString, consummedString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProducedString() {
		return producedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProducedString(String newProducedString) {
		String oldProducedString = producedString;
		producedString = newProducedString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K3fsmPackage.FSM__PRODUCED_STRING, oldProducedString,
					producedString));
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
		case K3fsmPackage.FSM__OWNED_STATES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedStates()).basicAdd(otherEnd, msgs);
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
		case K3fsmPackage.FSM__OWNED_STATES:
			return ((InternalEList<?>) getOwnedStates()).basicRemove(otherEnd, msgs);
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
		case K3fsmPackage.FSM__NAME:
			return getName();
		case K3fsmPackage.FSM__OWNED_STATES:
			return getOwnedStates();
		case K3fsmPackage.FSM__INITIAL_STATE:
			if (resolve)
				return getInitialState();
			return basicGetInitialState();
		case K3fsmPackage.FSM__FINAL_STATE:
			if (resolve)
				return getFinalState();
			return basicGetFinalState();
		case K3fsmPackage.FSM__CURRENT_STATE:
			if (resolve)
				return getCurrentState();
			return basicGetCurrentState();
		case K3fsmPackage.FSM__UNPROCESSED_STRING:
			return getUnprocessedString();
		case K3fsmPackage.FSM__CONSUMMED_STRING:
			return getConsummedString();
		case K3fsmPackage.FSM__PRODUCED_STRING:
			return getProducedString();
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
		case K3fsmPackage.FSM__NAME:
			setName((String) newValue);
			return;
		case K3fsmPackage.FSM__OWNED_STATES:
			getOwnedStates().clear();
			getOwnedStates().addAll((Collection<? extends State>) newValue);
			return;
		case K3fsmPackage.FSM__INITIAL_STATE:
			setInitialState((State) newValue);
			return;
		case K3fsmPackage.FSM__FINAL_STATE:
			setFinalState((State) newValue);
			return;
		case K3fsmPackage.FSM__CURRENT_STATE:
			setCurrentState((State) newValue);
			return;
		case K3fsmPackage.FSM__UNPROCESSED_STRING:
			setUnprocessedString((String) newValue);
			return;
		case K3fsmPackage.FSM__CONSUMMED_STRING:
			setConsummedString((String) newValue);
			return;
		case K3fsmPackage.FSM__PRODUCED_STRING:
			setProducedString((String) newValue);
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
		case K3fsmPackage.FSM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case K3fsmPackage.FSM__OWNED_STATES:
			getOwnedStates().clear();
			return;
		case K3fsmPackage.FSM__INITIAL_STATE:
			setInitialState((State) null);
			return;
		case K3fsmPackage.FSM__FINAL_STATE:
			setFinalState((State) null);
			return;
		case K3fsmPackage.FSM__CURRENT_STATE:
			setCurrentState((State) null);
			return;
		case K3fsmPackage.FSM__UNPROCESSED_STRING:
			setUnprocessedString(UNPROCESSED_STRING_EDEFAULT);
			return;
		case K3fsmPackage.FSM__CONSUMMED_STRING:
			setConsummedString(CONSUMMED_STRING_EDEFAULT);
			return;
		case K3fsmPackage.FSM__PRODUCED_STRING:
			setProducedString(PRODUCED_STRING_EDEFAULT);
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
		case K3fsmPackage.FSM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case K3fsmPackage.FSM__OWNED_STATES:
			return ownedStates != null && !ownedStates.isEmpty();
		case K3fsmPackage.FSM__INITIAL_STATE:
			return initialState != null;
		case K3fsmPackage.FSM__FINAL_STATE:
			return finalState != null;
		case K3fsmPackage.FSM__CURRENT_STATE:
			return currentState != null;
		case K3fsmPackage.FSM__UNPROCESSED_STRING:
			return UNPROCESSED_STRING_EDEFAULT == null ? unprocessedString != null
					: !UNPROCESSED_STRING_EDEFAULT.equals(unprocessedString);
		case K3fsmPackage.FSM__CONSUMMED_STRING:
			return CONSUMMED_STRING_EDEFAULT == null ? consummedString != null
					: !CONSUMMED_STRING_EDEFAULT.equals(consummedString);
		case K3fsmPackage.FSM__PRODUCED_STRING:
			return PRODUCED_STRING_EDEFAULT == null ? producedString != null
					: !PRODUCED_STRING_EDEFAULT.equals(producedString);
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", unprocessedString: ");
		result.append(unprocessedString);
		result.append(", consummedString: ");
		result.append(consummedString);
		result.append(", producedString: ");
		result.append(producedString);
		result.append(')');
		return result.toString();
	}

} //FSMImpl
