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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gemoc.example.k3fsm.FSM;
import org.eclipse.gemoc.example.k3fsm.K3fsmPackage;
import org.eclipse.gemoc.example.k3fsm.State;
import org.eclipse.gemoc.example.k3fsm.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.example.k3fsm.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gemoc.example.k3fsm.impl.StateImpl#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link org.eclipse.gemoc.example.k3fsm.impl.StateImpl#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 *   <li>{@link org.eclipse.gemoc.example.k3fsm.impl.StateImpl#getOwningFSM <em>Owning FSM</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
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
	 * The cached value of the '{@link #getOutgoingTransitions() <em>Outgoing Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outgoingTransitions;

	/**
	 * The cached value of the '{@link #getIncomingTransitions() <em>Incoming Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> incomingTransitions;

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
		return K3fsmPackage.Literals.STATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, K3fsmPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOutgoingTransitions() {
		if (outgoingTransitions == null) {
			outgoingTransitions = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this,
					K3fsmPackage.STATE__OUTGOING_TRANSITIONS, K3fsmPackage.TRANSITION__SOURCE);
		}
		return outgoingTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getIncomingTransitions() {
		if (incomingTransitions == null) {
			incomingTransitions = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this,
					K3fsmPackage.STATE__INCOMING_TRANSITIONS, K3fsmPackage.TRANSITION__TARGET);
		}
		return incomingTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSM getOwningFSM() {
		if (eContainerFeatureID() != K3fsmPackage.STATE__OWNING_FSM)
			return null;
		return (FSM) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningFSM(FSM newOwningFSM, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOwningFSM, K3fsmPackage.STATE__OWNING_FSM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningFSM(FSM newOwningFSM) {
		if (newOwningFSM != eInternalContainer()
				|| (eContainerFeatureID() != K3fsmPackage.STATE__OWNING_FSM && newOwningFSM != null)) {
			if (EcoreUtil.isAncestor(this, newOwningFSM))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningFSM != null)
				msgs = ((InternalEObject) newOwningFSM).eInverseAdd(this, K3fsmPackage.FSM__OWNED_STATES, FSM.class,
						msgs);
			msgs = basicSetOwningFSM(newOwningFSM, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K3fsmPackage.STATE__OWNING_FSM, newOwningFSM,
					newOwningFSM));
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
		case K3fsmPackage.STATE__OUTGOING_TRANSITIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoingTransitions()).basicAdd(otherEnd,
					msgs);
		case K3fsmPackage.STATE__INCOMING_TRANSITIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomingTransitions()).basicAdd(otherEnd,
					msgs);
		case K3fsmPackage.STATE__OWNING_FSM:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetOwningFSM((FSM) otherEnd, msgs);
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
		case K3fsmPackage.STATE__OUTGOING_TRANSITIONS:
			return ((InternalEList<?>) getOutgoingTransitions()).basicRemove(otherEnd, msgs);
		case K3fsmPackage.STATE__INCOMING_TRANSITIONS:
			return ((InternalEList<?>) getIncomingTransitions()).basicRemove(otherEnd, msgs);
		case K3fsmPackage.STATE__OWNING_FSM:
			return basicSetOwningFSM(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case K3fsmPackage.STATE__OWNING_FSM:
			return eInternalContainer().eInverseRemove(this, K3fsmPackage.FSM__OWNED_STATES, FSM.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case K3fsmPackage.STATE__NAME:
			return getName();
		case K3fsmPackage.STATE__OUTGOING_TRANSITIONS:
			return getOutgoingTransitions();
		case K3fsmPackage.STATE__INCOMING_TRANSITIONS:
			return getIncomingTransitions();
		case K3fsmPackage.STATE__OWNING_FSM:
			return getOwningFSM();
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
		case K3fsmPackage.STATE__NAME:
			setName((String) newValue);
			return;
		case K3fsmPackage.STATE__OUTGOING_TRANSITIONS:
			getOutgoingTransitions().clear();
			getOutgoingTransitions().addAll((Collection<? extends Transition>) newValue);
			return;
		case K3fsmPackage.STATE__INCOMING_TRANSITIONS:
			getIncomingTransitions().clear();
			getIncomingTransitions().addAll((Collection<? extends Transition>) newValue);
			return;
		case K3fsmPackage.STATE__OWNING_FSM:
			setOwningFSM((FSM) newValue);
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
		case K3fsmPackage.STATE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case K3fsmPackage.STATE__OUTGOING_TRANSITIONS:
			getOutgoingTransitions().clear();
			return;
		case K3fsmPackage.STATE__INCOMING_TRANSITIONS:
			getIncomingTransitions().clear();
			return;
		case K3fsmPackage.STATE__OWNING_FSM:
			setOwningFSM((FSM) null);
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
		case K3fsmPackage.STATE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case K3fsmPackage.STATE__OUTGOING_TRANSITIONS:
			return outgoingTransitions != null && !outgoingTransitions.isEmpty();
		case K3fsmPackage.STATE__INCOMING_TRANSITIONS:
			return incomingTransitions != null && !incomingTransitions.isEmpty();
		case K3fsmPackage.STATE__OWNING_FSM:
			return getOwningFSM() != null;
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
		result.append(')');
		return result.toString();
	}

} //StateImpl
