/**
 */
package fsmTrace.Steps.impl;

import fsmTrace.States.fsm.TracedStateMachine;

import fsmTrace.Steps.Fsm_StateMachine_InitializeModel;
import fsmTrace.Steps.StepsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gemoc.trace.commons.model.trace.Footprint;
import org.eclipse.gemoc.trace.commons.model.trace.SmallStep;
import org.eclipse.gemoc.trace.commons.model.trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fsm State Machine Initialize Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fsmTrace.Steps.impl.Fsm_StateMachine_InitializeModelImpl#getFootprint <em>Footprint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fsm_StateMachine_InitializeModelImpl extends SpecificStepImpl implements Fsm_StateMachine_InitializeModel {
	/**
	 * The cached value of the '{@link #getFootprint() <em>Footprint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFootprint()
	 * @generated
	 * @ordered
	 */
	protected Footprint footprint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fsm_StateMachine_InitializeModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.FSM_STATE_MACHINE_INITIALIZE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Footprint getFootprint() {
		return footprint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFootprint(Footprint newFootprint, NotificationChain msgs) {
		Footprint oldFootprint = footprint;
		footprint = newFootprint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StepsPackage.FSM_STATE_MACHINE_INITIALIZE_MODEL__FOOTPRINT, oldFootprint, newFootprint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFootprint(Footprint newFootprint) {
		if (newFootprint != footprint) {
			NotificationChain msgs = null;
			if (footprint != null)
				msgs = ((InternalEObject)footprint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StepsPackage.FSM_STATE_MACHINE_INITIALIZE_MODEL__FOOTPRINT, null, msgs);
			if (newFootprint != null)
				msgs = ((InternalEObject)newFootprint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StepsPackage.FSM_STATE_MACHINE_INITIALIZE_MODEL__FOOTPRINT, null, msgs);
			msgs = basicSetFootprint(newFootprint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StepsPackage.FSM_STATE_MACHINE_INITIALIZE_MODEL__FOOTPRINT, newFootprint, newFootprint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TracedStateMachine getCaller() {
		return (fsmTrace.States.fsm.TracedStateMachine) this.getMseoccurrence().getMse().getCaller();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StepsPackage.FSM_STATE_MACHINE_INITIALIZE_MODEL__FOOTPRINT:
				return basicSetFootprint(null, msgs);
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
			case StepsPackage.FSM_STATE_MACHINE_INITIALIZE_MODEL__FOOTPRINT:
				return getFootprint();
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
			case StepsPackage.FSM_STATE_MACHINE_INITIALIZE_MODEL__FOOTPRINT:
				setFootprint((Footprint)newValue);
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
			case StepsPackage.FSM_STATE_MACHINE_INITIALIZE_MODEL__FOOTPRINT:
				setFootprint((Footprint)null);
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
			case StepsPackage.FSM_STATE_MACHINE_INITIALIZE_MODEL__FOOTPRINT:
				return footprint != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SmallStep.class) {
			switch (derivedFeatureID) {
				case StepsPackage.FSM_STATE_MACHINE_INITIALIZE_MODEL__FOOTPRINT: return TracePackage.SMALL_STEP__FOOTPRINT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SmallStep.class) {
			switch (baseFeatureID) {
				case TracePackage.SMALL_STEP__FOOTPRINT: return StepsPackage.FSM_STATE_MACHINE_INITIALIZE_MODEL__FOOTPRINT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //Fsm_StateMachine_InitializeModelImpl
