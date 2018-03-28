/**
 */
package fsmTrace.States.impl;

import fsmTrace.States.StateMachine_unprocessedString_Value;
import fsmTrace.States.StatesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine unprocessed String Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fsmTrace.States.impl.StateMachine_unprocessedString_ValueImpl#getUnprocessedString <em>Unprocessed String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachine_unprocessedString_ValueImpl extends SpecificValueImpl implements StateMachine_unprocessedString_Value {
	/**
	 * The default value of the '{@link #getUnprocessedString() <em>Unprocessed String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnprocessedString()
	 * @generated
	 * @ordered
	 */
	protected static final String UNPROCESSED_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnprocessedString() <em>Unprocessed String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnprocessedString()
	 * @generated
	 * @ordered
	 */
	protected String unprocessedString = UNPROCESSED_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachine_unprocessedString_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.STATE_MACHINE_UNPROCESSED_STRING_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnprocessedString() {
		return unprocessedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnprocessedString(String newUnprocessedString) {
		String oldUnprocessedString = unprocessedString;
		unprocessedString = newUnprocessedString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.STATE_MACHINE_UNPROCESSED_STRING_VALUE__UNPROCESSED_STRING, oldUnprocessedString, unprocessedString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.STATE_MACHINE_UNPROCESSED_STRING_VALUE__UNPROCESSED_STRING:
				return getUnprocessedString();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatesPackage.STATE_MACHINE_UNPROCESSED_STRING_VALUE__UNPROCESSED_STRING:
				setUnprocessedString((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StatesPackage.STATE_MACHINE_UNPROCESSED_STRING_VALUE__UNPROCESSED_STRING:
				setUnprocessedString(UNPROCESSED_STRING_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StatesPackage.STATE_MACHINE_UNPROCESSED_STRING_VALUE__UNPROCESSED_STRING:
				return UNPROCESSED_STRING_EDEFAULT == null ? unprocessedString != null : !UNPROCESSED_STRING_EDEFAULT.equals(unprocessedString);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (unprocessedString: ");
		result.append(unprocessedString);
		result.append(')');
		return result.toString();
	}

} //StateMachine_unprocessedString_ValueImpl
