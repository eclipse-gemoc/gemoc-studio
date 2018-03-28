/**
 */
package fsmTrace.States.impl;

import fsmTrace.States.StateMachine_consummedString_Value;
import fsmTrace.States.StatesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine consummed String Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fsmTrace.States.impl.StateMachine_consummedString_ValueImpl#getConsummedString <em>Consummed String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachine_consummedString_ValueImpl extends SpecificValueImpl implements StateMachine_consummedString_Value {
	/**
	 * The default value of the '{@link #getConsummedString() <em>Consummed String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsummedString()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSUMMED_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsummedString() <em>Consummed String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsummedString()
	 * @generated
	 * @ordered
	 */
	protected String consummedString = CONSUMMED_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachine_consummedString_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.STATE_MACHINE_CONSUMMED_STRING_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsummedString() {
		return consummedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsummedString(String newConsummedString) {
		String oldConsummedString = consummedString;
		consummedString = newConsummedString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.STATE_MACHINE_CONSUMMED_STRING_VALUE__CONSUMMED_STRING, oldConsummedString, consummedString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.STATE_MACHINE_CONSUMMED_STRING_VALUE__CONSUMMED_STRING:
				return getConsummedString();
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
			case StatesPackage.STATE_MACHINE_CONSUMMED_STRING_VALUE__CONSUMMED_STRING:
				setConsummedString((String)newValue);
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
			case StatesPackage.STATE_MACHINE_CONSUMMED_STRING_VALUE__CONSUMMED_STRING:
				setConsummedString(CONSUMMED_STRING_EDEFAULT);
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
			case StatesPackage.STATE_MACHINE_CONSUMMED_STRING_VALUE__CONSUMMED_STRING:
				return CONSUMMED_STRING_EDEFAULT == null ? consummedString != null : !CONSUMMED_STRING_EDEFAULT.equals(consummedString);
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
		result.append(" (consummedString: ");
		result.append(consummedString);
		result.append(')');
		return result.toString();
	}

} //StateMachine_consummedString_ValueImpl
