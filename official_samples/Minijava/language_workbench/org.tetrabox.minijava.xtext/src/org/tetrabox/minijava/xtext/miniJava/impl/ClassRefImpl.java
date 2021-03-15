/**
 */
package org.tetrabox.minijava.xtext.miniJava.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tetrabox.minijava.xtext.miniJava.ClassRef;
import org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage;
import org.tetrabox.minijava.xtext.miniJava.TypeDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.ClassRefImpl#getReferencedClass <em>Referenced Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassRefImpl extends SingleTypeRefImpl implements ClassRef {
	/**
	 * The cached value of the '{@link #getReferencedClass() <em>Referenced Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedClass()
	 * @generated
	 * @ordered
	 */
	protected TypeDeclaration referencedClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiniJavaPackage.Literals.CLASS_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDeclaration getReferencedClass() {
		if (referencedClass != null && referencedClass.eIsProxy()) {
			InternalEObject oldReferencedClass = (InternalEObject)referencedClass;
			referencedClass = (TypeDeclaration)eResolveProxy(oldReferencedClass);
			if (referencedClass != oldReferencedClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiniJavaPackage.CLASS_REF__REFERENCED_CLASS, oldReferencedClass, referencedClass));
			}
		}
		return referencedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDeclaration basicGetReferencedClass() {
		return referencedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedClass(TypeDeclaration newReferencedClass) {
		TypeDeclaration oldReferencedClass = referencedClass;
		referencedClass = newReferencedClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.CLASS_REF__REFERENCED_CLASS, oldReferencedClass, referencedClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiniJavaPackage.CLASS_REF__REFERENCED_CLASS:
				if (resolve) return getReferencedClass();
				return basicGetReferencedClass();
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
			case MiniJavaPackage.CLASS_REF__REFERENCED_CLASS:
				setReferencedClass((TypeDeclaration)newValue);
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
			case MiniJavaPackage.CLASS_REF__REFERENCED_CLASS:
				setReferencedClass((TypeDeclaration)null);
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
			case MiniJavaPackage.CLASS_REF__REFERENCED_CLASS:
				return referencedClass != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassRefImpl
