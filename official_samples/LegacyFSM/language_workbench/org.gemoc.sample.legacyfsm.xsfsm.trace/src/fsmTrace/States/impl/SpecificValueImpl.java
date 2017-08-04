/**
 */
package fsmTrace.States.impl;

import fsmTrace.States.SpecificState;
import fsmTrace.States.SpecificValue;
import fsmTrace.States.StatesPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;

import org.eclipse.gemoc.trace.commons.model.trace.State;
import org.eclipse.gemoc.trace.commons.model.trace.TracePackage;

import org.eclipse.gemoc.trace.commons.model.trace.impl.ValueImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class SpecificValueImpl extends ValueImpl<SpecificState> implements SpecificValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.SPECIFIC_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<SpecificState> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<SpecificState>(SpecificState.class, this, StatesPackage.SPECIFIC_VALUE__STATES, TracePackage.STATE__VALUES) { private static final long serialVersionUID = 1L; @Override public Class<?> getInverseFeatureClass() { return State.class; } };
		}
		return states;
	}

} //SpecificValueImpl
