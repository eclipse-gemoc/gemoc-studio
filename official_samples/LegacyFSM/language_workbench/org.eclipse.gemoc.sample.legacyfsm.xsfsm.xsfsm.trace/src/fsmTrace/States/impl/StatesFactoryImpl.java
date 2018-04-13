/**
 */
package fsmTrace.States.impl;

import fsmTrace.States.*;

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
public class StatesFactoryImpl extends EFactoryImpl implements StatesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatesFactory init() {
		try {
			StatesFactory theStatesFactory = (StatesFactory)EPackage.Registry.INSTANCE.getEFactory(StatesPackage.eNS_URI);
			if (theStatesFactory != null) {
				return theStatesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesFactoryImpl() {
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
			case StatesPackage.SPECIFIC_STATE: return createSpecificState();
			case StatesPackage.STATE_MACHINE_CONSUMMED_STRING_DIMENSION: return createStateMachine_consummedString_Dimension();
			case StatesPackage.STATE_MACHINE_CONSUMMED_STRING_VALUE: return createStateMachine_consummedString_Value();
			case StatesPackage.STATE_MACHINE_CURRENT_STATE_DIMENSION: return createStateMachine_currentState_Dimension();
			case StatesPackage.STATE_MACHINE_CURRENT_STATE_VALUE: return createStateMachine_currentState_Value();
			case StatesPackage.STATE_MACHINE_PRODUCED_STRING_DIMENSION: return createStateMachine_producedString_Dimension();
			case StatesPackage.STATE_MACHINE_PRODUCED_STRING_VALUE: return createStateMachine_producedString_Value();
			case StatesPackage.STATE_MACHINE_UNPROCESSED_STRING_DIMENSION: return createStateMachine_unprocessedString_Dimension();
			case StatesPackage.STATE_MACHINE_UNPROCESSED_STRING_VALUE: return createStateMachine_unprocessedString_Value();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificState createSpecificState() {
		SpecificStateImpl specificState = new SpecificStateImpl();
		return specificState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine_consummedString_Dimension createStateMachine_consummedString_Dimension() {
		StateMachine_consummedString_DimensionImpl stateMachine_consummedString_Dimension = new StateMachine_consummedString_DimensionImpl();
		return stateMachine_consummedString_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine_consummedString_Value createStateMachine_consummedString_Value() {
		StateMachine_consummedString_ValueImpl stateMachine_consummedString_Value = new StateMachine_consummedString_ValueImpl();
		return stateMachine_consummedString_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine_currentState_Dimension createStateMachine_currentState_Dimension() {
		StateMachine_currentState_DimensionImpl stateMachine_currentState_Dimension = new StateMachine_currentState_DimensionImpl();
		return stateMachine_currentState_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine_currentState_Value createStateMachine_currentState_Value() {
		StateMachine_currentState_ValueImpl stateMachine_currentState_Value = new StateMachine_currentState_ValueImpl();
		return stateMachine_currentState_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine_producedString_Dimension createStateMachine_producedString_Dimension() {
		StateMachine_producedString_DimensionImpl stateMachine_producedString_Dimension = new StateMachine_producedString_DimensionImpl();
		return stateMachine_producedString_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine_producedString_Value createStateMachine_producedString_Value() {
		StateMachine_producedString_ValueImpl stateMachine_producedString_Value = new StateMachine_producedString_ValueImpl();
		return stateMachine_producedString_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine_unprocessedString_Dimension createStateMachine_unprocessedString_Dimension() {
		StateMachine_unprocessedString_DimensionImpl stateMachine_unprocessedString_Dimension = new StateMachine_unprocessedString_DimensionImpl();
		return stateMachine_unprocessedString_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine_unprocessedString_Value createStateMachine_unprocessedString_Value() {
		StateMachine_unprocessedString_ValueImpl stateMachine_unprocessedString_Value = new StateMachine_unprocessedString_ValueImpl();
		return stateMachine_unprocessedString_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesPackage getStatesPackage() {
		return (StatesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatesPackage getPackage() {
		return StatesPackage.eINSTANCE;
	}

} //StatesFactoryImpl
