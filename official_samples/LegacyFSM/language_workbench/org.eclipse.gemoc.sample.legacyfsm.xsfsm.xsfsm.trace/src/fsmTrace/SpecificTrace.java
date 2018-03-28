/**
 */
package fsmTrace;

import fsmTrace.States.SpecificDimension;
import fsmTrace.States.SpecificState;
import fsmTrace.States.SpecificTracedObject;
import fsmTrace.States.SpecificValue;

import fsmTrace.Steps.Fsm_StateMachine_InitializeModel;
import fsmTrace.Steps.Fsm_State_Step;
import fsmTrace.Steps.Fsm_Transition_Fire;
import fsmTrace.Steps.SpecificStep;

import org.eclipse.emf.common.util.EList;

import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;
import org.eclipse.gemoc.trace.commons.model.trace.Trace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsmTrace.SpecificTrace#getFsm_StateMachine_InitializeModel_Sequence <em>Fsm State Machine Initialize Model Sequence</em>}</li>
 *   <li>{@link fsmTrace.SpecificTrace#getFsm_State_Step_Sequence <em>Fsm State Step Sequence</em>}</li>
 *   <li>{@link fsmTrace.SpecificTrace#getFsm_Transition_Fire_Sequence <em>Fsm Transition Fire Sequence</em>}</li>
 * </ul>
 *
 * @see fsmTrace.FsmTracePackage#getSpecificTrace()
 * @model
 * @generated
 */
public interface SpecificTrace extends Trace<SequentialStep<? extends SpecificStep, ? extends SpecificState>, SpecificTracedObject<? extends SpecificDimension<? extends SpecificValue>>, SpecificState> {
	/**
	 * Returns the value of the '<em><b>Fsm State Machine Initialize Model Sequence</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.Steps.Fsm_StateMachine_InitializeModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm State Machine Initialize Model Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm State Machine Initialize Model Sequence</em>' reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_Fsm_StateMachine_InitializeModel_Sequence()
	 * @model
	 * @generated
	 */
	EList<Fsm_StateMachine_InitializeModel> getFsm_StateMachine_InitializeModel_Sequence();

	/**
	 * Returns the value of the '<em><b>Fsm State Step Sequence</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.Steps.Fsm_State_Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm State Step Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm State Step Sequence</em>' reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_Fsm_State_Step_Sequence()
	 * @model
	 * @generated
	 */
	EList<Fsm_State_Step> getFsm_State_Step_Sequence();

	/**
	 * Returns the value of the '<em><b>Fsm Transition Fire Sequence</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.Steps.Fsm_Transition_Fire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm Transition Fire Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm Transition Fire Sequence</em>' reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_Fsm_Transition_Fire_Sequence()
	 * @model
	 * @generated
	 */
	EList<Fsm_Transition_Fire> getFsm_Transition_Fire_Sequence();

} // SpecificTrace
