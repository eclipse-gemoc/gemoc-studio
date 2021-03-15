/**
 */
package org.tetrabox.minijava.xtext.miniJava.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tetrabox.minijava.xtext.miniJava.MethodCall;
import org.tetrabox.minijava.xtext.miniJava.MethodCall2;
import org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Call2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.MethodCall2Impl#getMethodcall <em>Methodcall</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodCall2Impl extends CallImpl implements MethodCall2 {
	/**
	 * The cached value of the '{@link #getMethodcall() <em>Methodcall</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodcall()
	 * @generated
	 * @ordered
	 */
	protected MethodCall methodcall;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodCall2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiniJavaPackage.Literals.METHOD_CALL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodCall getMethodcall() {
		if (methodcall != null && methodcall.eIsProxy()) {
			InternalEObject oldMethodcall = (InternalEObject)methodcall;
			methodcall = (MethodCall)eResolveProxy(oldMethodcall);
			if (methodcall != oldMethodcall) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiniJavaPackage.METHOD_CALL2__METHODCALL, oldMethodcall, methodcall));
			}
		}
		return methodcall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodCall basicGetMethodcall() {
		return methodcall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodcall(MethodCall newMethodcall) {
		MethodCall oldMethodcall = methodcall;
		methodcall = newMethodcall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.METHOD_CALL2__METHODCALL, oldMethodcall, methodcall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiniJavaPackage.METHOD_CALL2__METHODCALL:
				if (resolve) return getMethodcall();
				return basicGetMethodcall();
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
			case MiniJavaPackage.METHOD_CALL2__METHODCALL:
				setMethodcall((MethodCall)newValue);
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
			case MiniJavaPackage.METHOD_CALL2__METHODCALL:
				setMethodcall((MethodCall)null);
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
			case MiniJavaPackage.METHOD_CALL2__METHODCALL:
				return methodcall != null;
		}
		return super.eIsSet(featureID);
	}

} //MethodCall2Impl
