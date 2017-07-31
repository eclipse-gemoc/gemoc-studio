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
package fsmTrace.Steps;

import org.eclipse.gemoc.trace.commons.model.trace.TracePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fsmTrace.Steps.StepsFactory
 * @model kind="package"
 * @generated
 */
public interface StepsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Steps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fsmTrace_Steps";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "events";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepsPackage eINSTANCE = fsmTrace.Steps.impl.StepsPackageImpl.init();

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.impl.SpecificStepImpl <em>Specific Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.impl.SpecificStepImpl
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
	 * @generated
	 */
	int SPECIFIC_STEP = 7;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__MSEOCCURRENCE = TracePackage.STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__STARTING_STATE = TracePackage.STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__ENDING_STATE = TracePackage.STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Specific Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP_FEATURE_COUNT = TracePackage.STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.impl.Fsm_StateMachine_InitializeModelImpl <em>Fsm State Machine Initialize Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.impl.Fsm_StateMachine_InitializeModelImpl
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_StateMachine_InitializeModel()
	 * @generated
	 */
	int FSM_STATE_MACHINE_INITIALIZE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_INITIALIZE_MODEL__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_INITIALIZE_MODEL__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_INITIALIZE_MODEL__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Fsm State Machine Initialize Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_INITIALIZE_MODEL_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.impl.Fsm_State_StepImpl <em>Fsm State Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.impl.Fsm_State_StepImpl
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_State_Step()
	 * @generated
	 */
	int FSM_STATE_STEP = 1;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_STEP__SUB_STEPS = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fsm State Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.Fsm_State_Step_AbstractSubStep <em>Fsm State Step Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.Fsm_State_Step_AbstractSubStep
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_State_Step_AbstractSubStep()
	 * @generated
	 */
	int FSM_STATE_STEP_ABSTRACT_SUB_STEP = 2;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_STEP_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_STEP_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_STEP_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Fsm State Step Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_STEP_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.impl.Fsm_State_Step_ImplicitStepImpl <em>Fsm State Step Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.impl.Fsm_State_Step_ImplicitStepImpl
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_State_Step_ImplicitStep()
	 * @generated
	 */
	int FSM_STATE_STEP_IMPLICIT_STEP = 3;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_STEP_IMPLICIT_STEP__MSEOCCURRENCE = FSM_STATE_STEP_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_STEP_IMPLICIT_STEP__STARTING_STATE = FSM_STATE_STEP_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_STEP_IMPLICIT_STEP__ENDING_STATE = FSM_STATE_STEP_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Fsm State Step Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_STEP_IMPLICIT_STEP_FEATURE_COUNT = FSM_STATE_STEP_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.impl.Fsm_Transition_FireImpl <em>Fsm Transition Fire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.impl.Fsm_Transition_FireImpl
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_Transition_Fire()
	 * @generated
	 */
	int FSM_TRANSITION_FIRE = 4;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_TRANSITION_FIRE__MSEOCCURRENCE = FSM_STATE_STEP_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_TRANSITION_FIRE__STARTING_STATE = FSM_STATE_STEP_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_TRANSITION_FIRE__ENDING_STATE = FSM_STATE_STEP_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Fsm Transition Fire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_TRANSITION_FIRE_FEATURE_COUNT = FSM_STATE_STEP_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.impl.RootImplicitStepImpl
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
	 * @generated
	 */
	int ROOT_IMPLICIT_STEP = 5;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__MSEOCCURRENCE = TracePackage.SMALL_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__STARTING_STATE = TracePackage.SMALL_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__ENDING_STATE = TracePackage.SMALL_STEP__ENDING_STATE;

	/**
	 * The number of structural features of the '<em>Root Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP_FEATURE_COUNT = TracePackage.SMALL_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.impl.SpecificRootStepImpl <em>Specific Root Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.impl.SpecificRootStepImpl
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getSpecificRootStep()
	 * @generated
	 */
	int SPECIFIC_ROOT_STEP = 6;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ROOT_STEP__MSEOCCURRENCE = TracePackage.SEQUENTIAL_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ROOT_STEP__STARTING_STATE = TracePackage.SEQUENTIAL_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ROOT_STEP__ENDING_STATE = TracePackage.SEQUENTIAL_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ROOT_STEP__SUB_STEPS = TracePackage.SEQUENTIAL_STEP__SUB_STEPS;

	/**
	 * The number of structural features of the '<em>Specific Root Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ROOT_STEP_FEATURE_COUNT = TracePackage.SEQUENTIAL_STEP_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.Fsm_StateMachine_InitializeModel <em>Fsm State Machine Initialize Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fsm State Machine Initialize Model</em>'.
	 * @see fsmTrace.Steps.Fsm_StateMachine_InitializeModel
	 * @generated
	 */
	EClass getFsm_StateMachine_InitializeModel();

	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.Fsm_State_Step <em>Fsm State Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fsm State Step</em>'.
	 * @see fsmTrace.Steps.Fsm_State_Step
	 * @generated
	 */
	EClass getFsm_State_Step();

	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.Fsm_State_Step_AbstractSubStep <em>Fsm State Step Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fsm State Step Abstract Sub Step</em>'.
	 * @see fsmTrace.Steps.Fsm_State_Step_AbstractSubStep
	 * @generated
	 */
	EClass getFsm_State_Step_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.Fsm_State_Step_ImplicitStep <em>Fsm State Step Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fsm State Step Implicit Step</em>'.
	 * @see fsmTrace.Steps.Fsm_State_Step_ImplicitStep
	 * @generated
	 */
	EClass getFsm_State_Step_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.Fsm_Transition_Fire <em>Fsm Transition Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fsm Transition Fire</em>'.
	 * @see fsmTrace.Steps.Fsm_Transition_Fire
	 * @generated
	 */
	EClass getFsm_Transition_Fire();

	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.RootImplicitStep <em>Root Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Implicit Step</em>'.
	 * @see fsmTrace.Steps.RootImplicitStep
	 * @generated
	 */
	EClass getRootImplicitStep();

	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.SpecificRootStep <em>Specific Root Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Root Step</em>'.
	 * @see fsmTrace.Steps.SpecificRootStep
	 * @generated
	 */
	EClass getSpecificRootStep();

	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.SpecificStep <em>Specific Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Step</em>'.
	 * @see fsmTrace.Steps.SpecificStep
	 * @generated
	 */
	EClass getSpecificStep();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StepsFactory getStepsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.impl.Fsm_StateMachine_InitializeModelImpl <em>Fsm State Machine Initialize Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.impl.Fsm_StateMachine_InitializeModelImpl
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_StateMachine_InitializeModel()
		 * @generated
		 */
		EClass FSM_STATE_MACHINE_INITIALIZE_MODEL = eINSTANCE.getFsm_StateMachine_InitializeModel();

		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.impl.Fsm_State_StepImpl <em>Fsm State Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.impl.Fsm_State_StepImpl
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_State_Step()
		 * @generated
		 */
		EClass FSM_STATE_STEP = eINSTANCE.getFsm_State_Step();

		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.Fsm_State_Step_AbstractSubStep <em>Fsm State Step Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.Fsm_State_Step_AbstractSubStep
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_State_Step_AbstractSubStep()
		 * @generated
		 */
		EClass FSM_STATE_STEP_ABSTRACT_SUB_STEP = eINSTANCE.getFsm_State_Step_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.impl.Fsm_State_Step_ImplicitStepImpl <em>Fsm State Step Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.impl.Fsm_State_Step_ImplicitStepImpl
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_State_Step_ImplicitStep()
		 * @generated
		 */
		EClass FSM_STATE_STEP_IMPLICIT_STEP = eINSTANCE.getFsm_State_Step_ImplicitStep();

		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.impl.Fsm_Transition_FireImpl <em>Fsm Transition Fire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.impl.Fsm_Transition_FireImpl
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_Transition_Fire()
		 * @generated
		 */
		EClass FSM_TRANSITION_FIRE = eINSTANCE.getFsm_Transition_Fire();

		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.impl.RootImplicitStepImpl
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
		 * @generated
		 */
		EClass ROOT_IMPLICIT_STEP = eINSTANCE.getRootImplicitStep();

		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.impl.SpecificRootStepImpl <em>Specific Root Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.impl.SpecificRootStepImpl
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getSpecificRootStep()
		 * @generated
		 */
		EClass SPECIFIC_ROOT_STEP = eINSTANCE.getSpecificRootStep();

		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.impl.SpecificStepImpl <em>Specific Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.impl.SpecificStepImpl
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
		 * @generated
		 */
		EClass SPECIFIC_STEP = eINSTANCE.getSpecificStep();

	}

} //StepsPackage
