/**
 */
package fsmTrace.Steps.impl;

import fsmTrace.States.fsm.TracedTransition;

import fsmTrace.Steps.Fsm_State_Step_AbstractSubStep;
import fsmTrace.Steps.Fsm_Transition_Fire;
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
 * An implementation of the model object '<em><b>Fsm Transition Fire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fsmTrace.Steps.impl.Fsm_Transition_FireImpl#getFootprint <em>Footprint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fsm_Transition_FireImpl extends SpecificStepImpl implements Fsm_Transition_Fire {
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
	protected Fsm_Transition_FireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.FSM_TRANSITION_FIRE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StepsPackage.FSM_TRANSITION_FIRE__FOOTPRINT, oldFootprint, newFootprint);
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
				msgs = ((InternalEObject)footprint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StepsPackage.FSM_TRANSITION_FIRE__FOOTPRINT, null, msgs);
			if (newFootprint != null)
				msgs = ((InternalEObject)newFootprint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StepsPackage.FSM_TRANSITION_FIRE__FOOTPRINT, null, msgs);
			msgs = basicSetFootprint(newFootprint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StepsPackage.FSM_TRANSITION_FIRE__FOOTPRINT, newFootprint, newFootprint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TracedTransition getCaller() {
		return (fsmTrace.States.fsm.TracedTransition) this.getMseoccurrence().getMse().getCaller();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StepsPackage.FSM_TRANSITION_FIRE__FOOTPRINT:
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
			case StepsPackage.FSM_TRANSITION_FIRE__FOOTPRINT:
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
			case StepsPackage.FSM_TRANSITION_FIRE__FOOTPRINT:
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
			case StepsPackage.FSM_TRANSITION_FIRE__FOOTPRINT:
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
			case StepsPackage.FSM_TRANSITION_FIRE__FOOTPRINT:
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
				case StepsPackage.FSM_TRANSITION_FIRE__FOOTPRINT: return TracePackage.SMALL_STEP__FOOTPRINT;
				default: return -1;
			}
		}
		if (baseClass == Fsm_State_Step_AbstractSubStep.class) {
			switch (derivedFeatureID) {
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
				case TracePackage.SMALL_STEP__FOOTPRINT: return StepsPackage.FSM_TRANSITION_FIRE__FOOTPRINT;
				default: return -1;
			}
		}
		if (baseClass == Fsm_State_Step_AbstractSubStep.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //Fsm_Transition_FireImpl
