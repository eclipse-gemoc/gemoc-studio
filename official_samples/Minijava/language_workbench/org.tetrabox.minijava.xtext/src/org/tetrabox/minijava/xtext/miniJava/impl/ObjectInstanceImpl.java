/**
 */
package org.tetrabox.minijava.xtext.miniJava.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tetrabox.minijava.xtext.miniJava.Clazz;
import org.tetrabox.minijava.xtext.miniJava.FieldBinding;
import org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage;
import org.tetrabox.minijava.xtext.miniJava.ObjectInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.ObjectInstanceImpl#getFieldbindings <em>Fieldbindings</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.ObjectInstanceImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectInstanceImpl extends MinimalEObjectImpl.Container implements ObjectInstance {
	/**
	 * The cached value of the '{@link #getFieldbindings() <em>Fieldbindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldbindings()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldBinding> fieldbindings;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Clazz type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiniJavaPackage.Literals.OBJECT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldBinding> getFieldbindings() {
		if (fieldbindings == null) {
			fieldbindings = new EObjectContainmentEList<FieldBinding>(FieldBinding.class, this, MiniJavaPackage.OBJECT_INSTANCE__FIELDBINDINGS);
		}
		return fieldbindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clazz getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Clazz)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiniJavaPackage.OBJECT_INSTANCE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clazz basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Clazz newType) {
		Clazz oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.OBJECT_INSTANCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MiniJavaPackage.OBJECT_INSTANCE__FIELDBINDINGS:
				return ((InternalEList<?>)getFieldbindings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiniJavaPackage.OBJECT_INSTANCE__FIELDBINDINGS:
				return getFieldbindings();
			case MiniJavaPackage.OBJECT_INSTANCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MiniJavaPackage.OBJECT_INSTANCE__FIELDBINDINGS:
				getFieldbindings().clear();
				getFieldbindings().addAll((Collection<? extends FieldBinding>)newValue);
				return;
			case MiniJavaPackage.OBJECT_INSTANCE__TYPE:
				setType((Clazz)newValue);
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
			case MiniJavaPackage.OBJECT_INSTANCE__FIELDBINDINGS:
				getFieldbindings().clear();
				return;
			case MiniJavaPackage.OBJECT_INSTANCE__TYPE:
				setType((Clazz)null);
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
			case MiniJavaPackage.OBJECT_INSTANCE__FIELDBINDINGS:
				return fieldbindings != null && !fieldbindings.isEmpty();
			case MiniJavaPackage.OBJECT_INSTANCE__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectInstanceImpl
