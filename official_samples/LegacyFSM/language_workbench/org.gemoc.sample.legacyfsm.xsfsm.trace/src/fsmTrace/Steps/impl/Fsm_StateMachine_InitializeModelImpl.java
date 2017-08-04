/**
 */
package fsmTrace.Steps.impl;

import fsmTrace.States.fsm.TracedStateMachine;

import fsmTrace.Steps.Fsm_StateMachine_InitializeModel;
import fsmTrace.Steps.StepsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fsm State Machine Initialize Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Fsm_StateMachine_InitializeModelImpl extends SpecificStepImpl implements Fsm_StateMachine_InitializeModel {
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
	public TracedStateMachine getCaller() {
		return (fsmTrace.States.fsm.TracedStateMachine) this.getMseoccurrence().getMse().getCaller();
	}

} //Fsm_StateMachine_InitializeModelImpl
