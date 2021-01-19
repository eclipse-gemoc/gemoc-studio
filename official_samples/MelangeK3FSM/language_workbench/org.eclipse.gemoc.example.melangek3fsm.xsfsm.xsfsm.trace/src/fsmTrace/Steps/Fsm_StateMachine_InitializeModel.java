/**
 */
package fsmTrace.Steps;

import fsmTrace.States.SpecificState;

import fsmTrace.States.fsm.TracedStateMachine;

import org.eclipse.gemoc.trace.commons.model.trace.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fsm State Machine Initialize Model</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fsmTrace.Steps.StepsPackage#getFsm_StateMachine_InitializeModel()
 * @model
 * @generated
 */
public interface Fsm_StateMachine_InitializeModel extends SpecificStep, SmallStep<SpecificState> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	TracedStateMachine getCaller();

} // Fsm_StateMachine_InitializeModel
