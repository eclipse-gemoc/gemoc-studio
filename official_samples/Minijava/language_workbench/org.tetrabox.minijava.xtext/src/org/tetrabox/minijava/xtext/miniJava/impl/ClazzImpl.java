/**
 */
package org.tetrabox.minijava.xtext.miniJava.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tetrabox.minijava.xtext.miniJava.Clazz;
import org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clazz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.ClazzImpl#isIsabstract <em>Isabstract</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.ClazzImpl#getSuperClass <em>Super Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClazzImpl extends TypeDeclarationImpl implements Clazz {
	/**
	 * The default value of the '{@link #isIsabstract() <em>Isabstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsabstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ISABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsabstract() <em>Isabstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsabstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isabstract = ISABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuperClass() <em>Super Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClass()
	 * @generated
	 * @ordered
	 */
	protected Clazz superClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClazzImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiniJavaPackage.Literals.CLAZZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsabstract() {
		return isabstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsabstract(boolean newIsabstract) {
		boolean oldIsabstract = isabstract;
		isabstract = newIsabstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.CLAZZ__ISABSTRACT, oldIsabstract, isabstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clazz getSuperClass() {
		if (superClass != null && superClass.eIsProxy()) {
			InternalEObject oldSuperClass = (InternalEObject)superClass;
			superClass = (Clazz)eResolveProxy(oldSuperClass);
			if (superClass != oldSuperClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiniJavaPackage.CLAZZ__SUPER_CLASS, oldSuperClass, superClass));
			}
		}
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clazz basicGetSuperClass() {
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperClass(Clazz newSuperClass) {
		Clazz oldSuperClass = superClass;
		superClass = newSuperClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.CLAZZ__SUPER_CLASS, oldSuperClass, superClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiniJavaPackage.CLAZZ__ISABSTRACT:
				return isIsabstract();
			case MiniJavaPackage.CLAZZ__SUPER_CLASS:
				if (resolve) return getSuperClass();
				return basicGetSuperClass();
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
			case MiniJavaPackage.CLAZZ__ISABSTRACT:
				setIsabstract((Boolean)newValue);
				return;
			case MiniJavaPackage.CLAZZ__SUPER_CLASS:
				setSuperClass((Clazz)newValue);
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
			case MiniJavaPackage.CLAZZ__ISABSTRACT:
				setIsabstract(ISABSTRACT_EDEFAULT);
				return;
			case MiniJavaPackage.CLAZZ__SUPER_CLASS:
				setSuperClass((Clazz)null);
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
			case MiniJavaPackage.CLAZZ__ISABSTRACT:
				return isabstract != ISABSTRACT_EDEFAULT;
			case MiniJavaPackage.CLAZZ__SUPER_CLASS:
				return superClass != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isabstract: ");
		result.append(isabstract);
		result.append(')');
		return result.toString();
	}

} //ClazzImpl
