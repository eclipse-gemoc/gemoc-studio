/**
 */
package fsmTrace.Steps.impl;

import fsmTrace.States.fsm.TracedTransition;

import fsmTrace.Steps.Fsm_Transition_Fire;
import fsmTrace.Steps.StepsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fsm Transition Fire</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Fsm_Transition_FireImpl extends SpecificStepImpl implements Fsm_Transition_Fire {
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
	public TracedTransition getCaller() {
		return (fsmTrace.States.fsm.TracedTransition) this.getMseoccurrence().getMse().getCaller();
	}

} //Fsm_Transition_FireImpl
