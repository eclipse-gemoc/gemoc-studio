/**
 */
package org.tetrabox.minijava.xtext.miniJava.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage;
import org.tetrabox.minijava.xtext.miniJava.NewCall;
import org.tetrabox.minijava.xtext.miniJava.NewObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.NewCallImpl#getNewz <em>Newz</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NewCallImpl extends CallImpl implements NewCall {
	/**
	 * The cached value of the '{@link #getNewz() <em>Newz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewz()
	 * @generated
	 * @ordered
	 */
	protected NewObject newz;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiniJavaPackage.Literals.NEW_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewObject getNewz() {
		if (newz != null && newz.eIsProxy()) {
			InternalEObject oldNewz = (InternalEObject)newz;
			newz = (NewObject)eResolveProxy(oldNewz);
			if (newz != oldNewz) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiniJavaPackage.NEW_CALL__NEWZ, oldNewz, newz));
			}
		}
		return newz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewObject basicGetNewz() {
		return newz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewz(NewObject newNewz) {
		NewObject oldNewz = newz;
		newz = newNewz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.NEW_CALL__NEWZ, oldNewz, newz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiniJavaPackage.NEW_CALL__NEWZ:
				if (resolve) return getNewz();
				return basicGetNewz();
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
			case MiniJavaPackage.NEW_CALL__NEWZ:
				setNewz((NewObject)newValue);
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
			case MiniJavaPackage.NEW_CALL__NEWZ:
				setNewz((NewObject)null);
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
			case MiniJavaPackage.NEW_CALL__NEWZ:
				return newz != null;
		}
		return super.eIsSet(featureID);
	}

} //NewCallImpl
