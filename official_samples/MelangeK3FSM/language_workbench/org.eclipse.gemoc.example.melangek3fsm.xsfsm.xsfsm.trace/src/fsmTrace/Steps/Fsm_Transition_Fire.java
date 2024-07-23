/**
 */
package fsmTrace.Steps;

import fsmTrace.States.SpecificState;

import fsmTrace.States.fsm.TracedTransition;

import org.eclipse.gemoc.trace.commons.model.trace.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fsm Transition Fire</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fsmTrace.Steps.StepsPackage#getFsm_Transition_Fire()
 * @model
 * @generated
 */
public interface Fsm_Transition_Fire extends Fsm_State_Step_AbstractSubStep, SpecificStep, SmallStep<SpecificState> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	TracedTransition getCaller();

} // Fsm_Transition_Fire
