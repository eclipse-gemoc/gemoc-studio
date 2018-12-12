/**
 */
package fsmTrace.Steps.impl;

import fsmTrace.Steps.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StepsFactoryImpl extends EFactoryImpl implements StepsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StepsFactory init() {
		try {
			StepsFactory theStepsFactory = (StepsFactory)EPackage.Registry.INSTANCE.getEFactory(StepsPackage.eNS_URI);
			if (theStepsFactory != null) {
				return theStepsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StepsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StepsPackage.FSM_STATE_MACHINE_INITIALIZE_MODEL: return createFsm_StateMachine_InitializeModel();
			case StepsPackage.FSM_STATE_STEP: return createFsm_State_Step();
			case StepsPackage.FSM_STATE_STEP_IMPLICIT_STEP: return createFsm_State_Step_ImplicitStep();
			case StepsPackage.FSM_TRANSITION_FIRE: return createFsm_Transition_Fire();
			case StepsPackage.ROOT_IMPLICIT_STEP: return createRootImplicitStep();
			case StepsPackage.SPECIFIC_ROOT_STEP: return createSpecificRootStep();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fsm_StateMachine_InitializeModel createFsm_StateMachine_InitializeModel() {
		Fsm_StateMachine_InitializeModelImpl fsm_StateMachine_InitializeModel = new Fsm_StateMachine_InitializeModelImpl();
		return fsm_StateMachine_InitializeModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fsm_State_Step createFsm_State_Step() {
		Fsm_State_StepImpl fsm_State_Step = new Fsm_State_StepImpl();
		return fsm_State_Step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fsm_State_Step_ImplicitStep createFsm_State_Step_ImplicitStep() {
		Fsm_State_Step_ImplicitStepImpl fsm_State_Step_ImplicitStep = new Fsm_State_Step_ImplicitStepImpl();
		return fsm_State_Step_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fsm_Transition_Fire createFsm_Transition_Fire() {
		Fsm_Transition_FireImpl fsm_Transition_Fire = new Fsm_Transition_FireImpl();
		return fsm_Transition_Fire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootImplicitStep createRootImplicitStep() {
		RootImplicitStepImpl rootImplicitStep = new RootImplicitStepImpl();
		return rootImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificRootStep createSpecificRootStep() {
		SpecificRootStepImpl specificRootStep = new SpecificRootStepImpl();
		return specificRootStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsPackage getStepsPackage() {
		return (StepsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StepsPackage getPackage() {
		return StepsPackage.eINSTANCE;
	}

} //StepsFactoryImpl
