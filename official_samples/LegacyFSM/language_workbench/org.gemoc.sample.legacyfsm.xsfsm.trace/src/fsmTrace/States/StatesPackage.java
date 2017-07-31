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
package fsmTrace.States;

import org.eclipse.gemoc.trace.commons.model.trace.TracePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see fsmTrace.States.StatesFactory
 * @model kind="package"
 * @generated
 */
public interface StatesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "States";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fsmTrace_States";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tracedclasses";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatesPackage eINSTANCE = fsmTrace.States.impl.StatesPackageImpl.init();

	/**
	 * The meta object id for the '{@link fsmTrace.States.impl.SpecificValueImpl <em>Specific Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.impl.SpecificValueImpl
	 * @see fsmTrace.States.impl.StatesPackageImpl#getSpecificValue()
	 * @generated
	 */
	int SPECIFIC_VALUE = 5;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_VALUE__STATES = TracePackage.VALUE__STATES;

	/**
	 * The number of structural features of the '<em>Specific Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_VALUE_FEATURE_COUNT = TracePackage.VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.States.SpecificAttributeValue <em>Specific Attribute Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.SpecificAttributeValue
	 * @see fsmTrace.States.impl.StatesPackageImpl#getSpecificAttributeValue()
	 * @generated
	 */
	int SPECIFIC_ATTRIBUTE_VALUE = 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE_VALUE__STATES = SPECIFIC_VALUE__STATES;

	/**
	 * The number of structural features of the '<em>Specific Attribute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT = SPECIFIC_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.States.impl.SpecificDimensionImpl <em>Specific Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.impl.SpecificDimensionImpl
	 * @see fsmTrace.States.impl.StatesPackageImpl#getSpecificDimension()
	 * @generated
	 */
	int SPECIFIC_DIMENSION = 1;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DIMENSION__VALUES = TracePackage.DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>Specific Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DIMENSION_FEATURE_COUNT = TracePackage.DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.States.SpecificReferenceValue <em>Specific Reference Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.SpecificReferenceValue
	 * @see fsmTrace.States.impl.StatesPackageImpl#getSpecificReferenceValue()
	 * @generated
	 */
	int SPECIFIC_REFERENCE_VALUE = 2;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_REFERENCE_VALUE__STATES = SPECIFIC_VALUE__STATES;

	/**
	 * The number of structural features of the '<em>Specific Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_REFERENCE_VALUE_FEATURE_COUNT = SPECIFIC_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.States.impl.SpecificStateImpl <em>Specific State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.impl.SpecificStateImpl
	 * @see fsmTrace.States.impl.StatesPackageImpl#getSpecificState()
	 * @generated
	 */
	int SPECIFIC_STATE = 3;

	/**
	 * The feature id for the '<em><b>Started Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STATE__STARTED_STEPS = TracePackage.STATE__STARTED_STEPS;

	/**
	 * The feature id for the '<em><b>Ended Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STATE__ENDED_STEPS = TracePackage.STATE__ENDED_STEPS;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STATE__VALUES = TracePackage.STATE__VALUES;

	/**
	 * The number of structural features of the '<em>Specific State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STATE_FEATURE_COUNT = TracePackage.STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.States.impl.SpecificTracedObjectImpl <em>Specific Traced Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.impl.SpecificTracedObjectImpl
	 * @see fsmTrace.States.impl.StatesPackageImpl#getSpecificTracedObject()
	 * @generated
	 */
	int SPECIFIC_TRACED_OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACED_OBJECT__DIMENSIONS = TracePackage.TRACED_OBJECT__DIMENSIONS;

	/**
	 * The number of structural features of the '<em>Specific Traced Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACED_OBJECT_FEATURE_COUNT = TracePackage.TRACED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.States.impl.StateMachine_consummedString_DimensionImpl <em>State Machine consummed String Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.impl.StateMachine_consummedString_DimensionImpl
	 * @see fsmTrace.States.impl.StatesPackageImpl#getStateMachine_consummedString_Dimension()
	 * @generated
	 */
	int STATE_MACHINE_CONSUMMED_STRING_DIMENSION = 6;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_CONSUMMED_STRING_DIMENSION__VALUES = SPECIFIC_DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>State Machine consummed String Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_CONSUMMED_STRING_DIMENSION_FEATURE_COUNT = SPECIFIC_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.States.impl.StateMachine_consummedString_ValueImpl <em>State Machine consummed String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.impl.StateMachine_consummedString_ValueImpl
	 * @see fsmTrace.States.impl.StatesPackageImpl#getStateMachine_consummedString_Value()
	 * @generated
	 */
	int STATE_MACHINE_CONSUMMED_STRING_VALUE = 7;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_CONSUMMED_STRING_VALUE__STATES = SPECIFIC_ATTRIBUTE_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Consummed String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_CONSUMMED_STRING_VALUE__CONSUMMED_STRING = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Machine consummed String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_CONSUMMED_STRING_VALUE_FEATURE_COUNT = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fsmTrace.States.impl.StateMachine_currentState_DimensionImpl <em>State Machine current State Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.impl.StateMachine_currentState_DimensionImpl
	 * @see fsmTrace.States.impl.StatesPackageImpl#getStateMachine_currentState_Dimension()
	 * @generated
	 */
	int STATE_MACHINE_CURRENT_STATE_DIMENSION = 8;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_CURRENT_STATE_DIMENSION__VALUES = SPECIFIC_DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>State Machine current State Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_CURRENT_STATE_DIMENSION_FEATURE_COUNT = SPECIFIC_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.States.impl.StateMachine_currentState_ValueImpl <em>State Machine current State Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.impl.StateMachine_currentState_ValueImpl
	 * @see fsmTrace.States.impl.StatesPackageImpl#getStateMachine_currentState_Value()
	 * @generated
	 */
	int STATE_MACHINE_CURRENT_STATE_VALUE = 9;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_CURRENT_STATE_VALUE__STATES = SPECIFIC_REFERENCE_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Current State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_CURRENT_STATE_VALUE__CURRENT_STATE = SPECIFIC_REFERENCE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Machine current State Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_CURRENT_STATE_VALUE_FEATURE_COUNT = SPECIFIC_REFERENCE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fsmTrace.States.impl.StateMachine_producedString_DimensionImpl <em>State Machine produced String Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.impl.StateMachine_producedString_DimensionImpl
	 * @see fsmTrace.States.impl.StatesPackageImpl#getStateMachine_producedString_Dimension()
	 * @generated
	 */
	int STATE_MACHINE_PRODUCED_STRING_DIMENSION = 10;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_PRODUCED_STRING_DIMENSION__VALUES = SPECIFIC_DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>State Machine produced String Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_PRODUCED_STRING_DIMENSION_FEATURE_COUNT = SPECIFIC_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.States.impl.StateMachine_producedString_ValueImpl <em>State Machine produced String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.impl.StateMachine_producedString_ValueImpl
	 * @see fsmTrace.States.impl.StatesPackageImpl#getStateMachine_producedString_Value()
	 * @generated
	 */
	int STATE_MACHINE_PRODUCED_STRING_VALUE = 11;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_PRODUCED_STRING_VALUE__STATES = SPECIFIC_ATTRIBUTE_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Produced String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_PRODUCED_STRING_VALUE__PRODUCED_STRING = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Machine produced String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_PRODUCED_STRING_VALUE_FEATURE_COUNT = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fsmTrace.States.impl.StateMachine_unprocessedString_DimensionImpl <em>State Machine unprocessed String Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.impl.StateMachine_unprocessedString_DimensionImpl
	 * @see fsmTrace.States.impl.StatesPackageImpl#getStateMachine_unprocessedString_Dimension()
	 * @generated
	 */
	int STATE_MACHINE_UNPROCESSED_STRING_DIMENSION = 12;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_UNPROCESSED_STRING_DIMENSION__VALUES = SPECIFIC_DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>State Machine unprocessed String Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_UNPROCESSED_STRING_DIMENSION_FEATURE_COUNT = SPECIFIC_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.States.impl.StateMachine_unprocessedString_ValueImpl <em>State Machine unprocessed String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.impl.StateMachine_unprocessedString_ValueImpl
	 * @see fsmTrace.States.impl.StatesPackageImpl#getStateMachine_unprocessedString_Value()
	 * @generated
	 */
	int STATE_MACHINE_UNPROCESSED_STRING_VALUE = 13;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_UNPROCESSED_STRING_VALUE__STATES = SPECIFIC_ATTRIBUTE_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Unprocessed String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_UNPROCESSED_STRING_VALUE__UNPROCESSED_STRING = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Machine unprocessed String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_UNPROCESSED_STRING_VALUE_FEATURE_COUNT = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link fsmTrace.States.SpecificAttributeValue <em>Specific Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Attribute Value</em>'.
	 * @see fsmTrace.States.SpecificAttributeValue
	 * @generated
	 */
	EClass getSpecificAttributeValue();

	/**
	 * Returns the meta object for class '{@link fsmTrace.States.SpecificDimension <em>Specific Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Dimension</em>'.
	 * @see fsmTrace.States.SpecificDimension
	 * @generated
	 */
	EClass getSpecificDimension();

	/**
	 * Returns the meta object for class '{@link fsmTrace.States.SpecificReferenceValue <em>Specific Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Reference Value</em>'.
	 * @see fsmTrace.States.SpecificReferenceValue
	 * @generated
	 */
	EClass getSpecificReferenceValue();

	/**
	 * Returns the meta object for class '{@link fsmTrace.States.SpecificState <em>Specific State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific State</em>'.
	 * @see fsmTrace.States.SpecificState
	 * @generated
	 */
	EClass getSpecificState();

	/**
	 * Returns the meta object for class '{@link fsmTrace.States.SpecificTracedObject <em>Specific Traced Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Traced Object</em>'.
	 * @see fsmTrace.States.SpecificTracedObject
	 * @generated
	 */
	EClass getSpecificTracedObject();

	/**
	 * Returns the meta object for class '{@link fsmTrace.States.SpecificValue <em>Specific Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Value</em>'.
	 * @see fsmTrace.States.SpecificValue
	 * @generated
	 */
	EClass getSpecificValue();

	/**
	 * Returns the meta object for class '{@link fsmTrace.States.StateMachine_consummedString_Dimension <em>State Machine consummed String Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine consummed String Dimension</em>'.
	 * @see fsmTrace.States.StateMachine_consummedString_Dimension
	 * @generated
	 */
	EClass getStateMachine_consummedString_Dimension();

	/**
	 * Returns the meta object for class '{@link fsmTrace.States.StateMachine_consummedString_Value <em>State Machine consummed String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine consummed String Value</em>'.
	 * @see fsmTrace.States.StateMachine_consummedString_Value
	 * @generated
	 */
	EClass getStateMachine_consummedString_Value();

	/**
	 * Returns the meta object for the attribute '{@link fsmTrace.States.StateMachine_consummedString_Value#getConsummedString <em>Consummed String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consummed String</em>'.
	 * @see fsmTrace.States.StateMachine_consummedString_Value#getConsummedString()
	 * @see #getStateMachine_consummedString_Value()
	 * @generated
	 */
	EAttribute getStateMachine_consummedString_Value_ConsummedString();

	/**
	 * Returns the meta object for class '{@link fsmTrace.States.StateMachine_currentState_Dimension <em>State Machine current State Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine current State Dimension</em>'.
	 * @see fsmTrace.States.StateMachine_currentState_Dimension
	 * @generated
	 */
	EClass getStateMachine_currentState_Dimension();

	/**
	 * Returns the meta object for class '{@link fsmTrace.States.StateMachine_currentState_Value <em>State Machine current State Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine current State Value</em>'.
	 * @see fsmTrace.States.StateMachine_currentState_Value
	 * @generated
	 */
	EClass getStateMachine_currentState_Value();

	/**
	 * Returns the meta object for the reference '{@link fsmTrace.States.StateMachine_currentState_Value#getCurrentState <em>Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current State</em>'.
	 * @see fsmTrace.States.StateMachine_currentState_Value#getCurrentState()
	 * @see #getStateMachine_currentState_Value()
	 * @generated
	 */
	EReference getStateMachine_currentState_Value_CurrentState();

	/**
	 * Returns the meta object for class '{@link fsmTrace.States.StateMachine_producedString_Dimension <em>State Machine produced String Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine produced String Dimension</em>'.
	 * @see fsmTrace.States.StateMachine_producedString_Dimension
	 * @generated
	 */
	EClass getStateMachine_producedString_Dimension();

	/**
	 * Returns the meta object for class '{@link fsmTrace.States.StateMachine_producedString_Value <em>State Machine produced String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine produced String Value</em>'.
	 * @see fsmTrace.States.StateMachine_producedString_Value
	 * @generated
	 */
	EClass getStateMachine_producedString_Value();

	/**
	 * Returns the meta object for the attribute '{@link fsmTrace.States.StateMachine_producedString_Value#getProducedString <em>Produced String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Produced String</em>'.
	 * @see fsmTrace.States.StateMachine_producedString_Value#getProducedString()
	 * @see #getStateMachine_producedString_Value()
	 * @generated
	 */
	EAttribute getStateMachine_producedString_Value_ProducedString();

	/**
	 * Returns the meta object for class '{@link fsmTrace.States.StateMachine_unprocessedString_Dimension <em>State Machine unprocessed String Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine unprocessed String Dimension</em>'.
	 * @see fsmTrace.States.StateMachine_unprocessedString_Dimension
	 * @generated
	 */
	EClass getStateMachine_unprocessedString_Dimension();

	/**
	 * Returns the meta object for class '{@link fsmTrace.States.StateMachine_unprocessedString_Value <em>State Machine unprocessed String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine unprocessed String Value</em>'.
	 * @see fsmTrace.States.StateMachine_unprocessedString_Value
	 * @generated
	 */
	EClass getStateMachine_unprocessedString_Value();

	/**
	 * Returns the meta object for the attribute '{@link fsmTrace.States.StateMachine_unprocessedString_Value#getUnprocessedString <em>Unprocessed String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unprocessed String</em>'.
	 * @see fsmTrace.States.StateMachine_unprocessedString_Value#getUnprocessedString()
	 * @see #getStateMachine_unprocessedString_Value()
	 * @generated
	 */
	EAttribute getStateMachine_unprocessedString_Value_UnprocessedString();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatesFactory getStatesFactory();

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
		 * The meta object literal for the '{@link fsmTrace.States.SpecificAttributeValue <em>Specific Attribute Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.SpecificAttributeValue
		 * @see fsmTrace.States.impl.StatesPackageImpl#getSpecificAttributeValue()
		 * @generated
		 */
		EClass SPECIFIC_ATTRIBUTE_VALUE = eINSTANCE.getSpecificAttributeValue();

		/**
		 * The meta object literal for the '{@link fsmTrace.States.impl.SpecificDimensionImpl <em>Specific Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.impl.SpecificDimensionImpl
		 * @see fsmTrace.States.impl.StatesPackageImpl#getSpecificDimension()
		 * @generated
		 */
		EClass SPECIFIC_DIMENSION = eINSTANCE.getSpecificDimension();

		/**
		 * The meta object literal for the '{@link fsmTrace.States.SpecificReferenceValue <em>Specific Reference Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.SpecificReferenceValue
		 * @see fsmTrace.States.impl.StatesPackageImpl#getSpecificReferenceValue()
		 * @generated
		 */
		EClass SPECIFIC_REFERENCE_VALUE = eINSTANCE.getSpecificReferenceValue();

		/**
		 * The meta object literal for the '{@link fsmTrace.States.impl.SpecificStateImpl <em>Specific State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.impl.SpecificStateImpl
		 * @see fsmTrace.States.impl.StatesPackageImpl#getSpecificState()
		 * @generated
		 */
		EClass SPECIFIC_STATE = eINSTANCE.getSpecificState();

		/**
		 * The meta object literal for the '{@link fsmTrace.States.impl.SpecificTracedObjectImpl <em>Specific Traced Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.impl.SpecificTracedObjectImpl
		 * @see fsmTrace.States.impl.StatesPackageImpl#getSpecificTracedObject()
		 * @generated
		 */
		EClass SPECIFIC_TRACED_OBJECT = eINSTANCE.getSpecificTracedObject();

		/**
		 * The meta object literal for the '{@link fsmTrace.States.impl.SpecificValueImpl <em>Specific Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.impl.SpecificValueImpl
		 * @see fsmTrace.States.impl.StatesPackageImpl#getSpecificValue()
		 * @generated
		 */
		EClass SPECIFIC_VALUE = eINSTANCE.getSpecificValue();

		/**
		 * The meta object literal for the '{@link fsmTrace.States.impl.StateMachine_consummedString_DimensionImpl <em>State Machine consummed String Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.impl.StateMachine_consummedString_DimensionImpl
		 * @see fsmTrace.States.impl.StatesPackageImpl#getStateMachine_consummedString_Dimension()
		 * @generated
		 */
		EClass STATE_MACHINE_CONSUMMED_STRING_DIMENSION = eINSTANCE.getStateMachine_consummedString_Dimension();

		/**
		 * The meta object literal for the '{@link fsmTrace.States.impl.StateMachine_consummedString_ValueImpl <em>State Machine consummed String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.impl.StateMachine_consummedString_ValueImpl
		 * @see fsmTrace.States.impl.StatesPackageImpl#getStateMachine_consummedString_Value()
		 * @generated
		 */
		EClass STATE_MACHINE_CONSUMMED_STRING_VALUE = eINSTANCE.getStateMachine_consummedString_Value();

		/**
		 * The meta object literal for the '<em><b>Consummed String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_MACHINE_CONSUMMED_STRING_VALUE__CONSUMMED_STRING = eINSTANCE.getStateMachine_consummedString_Value_ConsummedString();

		/**
		 * The meta object literal for the '{@link fsmTrace.States.impl.StateMachine_currentState_DimensionImpl <em>State Machine current State Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.impl.StateMachine_currentState_DimensionImpl
		 * @see fsmTrace.States.impl.StatesPackageImpl#getStateMachine_currentState_Dimension()
		 * @generated
		 */
		EClass STATE_MACHINE_CURRENT_STATE_DIMENSION = eINSTANCE.getStateMachine_currentState_Dimension();

		/**
		 * The meta object literal for the '{@link fsmTrace.States.impl.StateMachine_currentState_ValueImpl <em>State Machine current State Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.impl.StateMachine_currentState_ValueImpl
		 * @see fsmTrace.States.impl.StatesPackageImpl#getStateMachine_currentState_Value()
		 * @generated
		 */
		EClass STATE_MACHINE_CURRENT_STATE_VALUE = eINSTANCE.getStateMachine_currentState_Value();

		/**
		 * The meta object literal for the '<em><b>Current State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE_CURRENT_STATE_VALUE__CURRENT_STATE = eINSTANCE.getStateMachine_currentState_Value_CurrentState();

		/**
		 * The meta object literal for the '{@link fsmTrace.States.impl.StateMachine_producedString_DimensionImpl <em>State Machine produced String Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.impl.StateMachine_producedString_DimensionImpl
		 * @see fsmTrace.States.impl.StatesPackageImpl#getStateMachine_producedString_Dimension()
		 * @generated
		 */
		EClass STATE_MACHINE_PRODUCED_STRING_DIMENSION = eINSTANCE.getStateMachine_producedString_Dimension();

		/**
		 * The meta object literal for the '{@link fsmTrace.States.impl.StateMachine_producedString_ValueImpl <em>State Machine produced String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.impl.StateMachine_producedString_ValueImpl
		 * @see fsmTrace.States.impl.StatesPackageImpl#getStateMachine_producedString_Value()
		 * @generated
		 */
		EClass STATE_MACHINE_PRODUCED_STRING_VALUE = eINSTANCE.getStateMachine_producedString_Value();

		/**
		 * The meta object literal for the '<em><b>Produced String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_MACHINE_PRODUCED_STRING_VALUE__PRODUCED_STRING = eINSTANCE.getStateMachine_producedString_Value_ProducedString();

		/**
		 * The meta object literal for the '{@link fsmTrace.States.impl.StateMachine_unprocessedString_DimensionImpl <em>State Machine unprocessed String Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.impl.StateMachine_unprocessedString_DimensionImpl
		 * @see fsmTrace.States.impl.StatesPackageImpl#getStateMachine_unprocessedString_Dimension()
		 * @generated
		 */
		EClass STATE_MACHINE_UNPROCESSED_STRING_DIMENSION = eINSTANCE.getStateMachine_unprocessedString_Dimension();

		/**
		 * The meta object literal for the '{@link fsmTrace.States.impl.StateMachine_unprocessedString_ValueImpl <em>State Machine unprocessed String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.impl.StateMachine_unprocessedString_ValueImpl
		 * @see fsmTrace.States.impl.StatesPackageImpl#getStateMachine_unprocessedString_Value()
		 * @generated
		 */
		EClass STATE_MACHINE_UNPROCESSED_STRING_VALUE = eINSTANCE.getStateMachine_unprocessedString_Value();

		/**
		 * The meta object literal for the '<em><b>Unprocessed String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_MACHINE_UNPROCESSED_STRING_VALUE__UNPROCESSED_STRING = eINSTANCE.getStateMachine_unprocessedString_Value_UnprocessedString();

	}

} //StatesPackage
