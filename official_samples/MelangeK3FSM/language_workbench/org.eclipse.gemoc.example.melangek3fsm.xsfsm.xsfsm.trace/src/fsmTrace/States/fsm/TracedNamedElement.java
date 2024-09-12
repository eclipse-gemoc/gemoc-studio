/**
 */
package fsmTrace.States.fsm;

import fsmTrace.States.SpecificDimension;
import fsmTrace.States.SpecificTracedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fsmTrace.States.fsm.FsmPackage#getTracedNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface TracedNamedElement extends SpecificTracedObject<SpecificDimension<?>> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<SpecificDimension<?>> getDimensionsInternal();

} // TracedNamedElement
