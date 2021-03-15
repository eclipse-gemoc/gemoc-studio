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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tetrabox.minijava.xtext.miniJava.AccessLevel;
import org.tetrabox.minijava.xtext.miniJava.Interface;
import org.tetrabox.minijava.xtext.miniJava.Member;
import org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage;
import org.tetrabox.minijava.xtext.miniJava.TypeDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.TypeDeclarationImpl#getAccessLevel <em>Access Level</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.TypeDeclarationImpl#getImplementz <em>Implementz</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.TypeDeclarationImpl#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeDeclarationImpl extends NamedElementImpl implements TypeDeclaration {
	/**
	 * The default value of the '{@link #getAccessLevel() <em>Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessLevel()
	 * @generated
	 * @ordered
	 */
	protected static final AccessLevel ACCESS_LEVEL_EDEFAULT = AccessLevel.PRIVATE;

	/**
	 * The cached value of the '{@link #getAccessLevel() <em>Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessLevel()
	 * @generated
	 * @ordered
	 */
	protected AccessLevel accessLevel = ACCESS_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImplementz() <em>Implementz</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementz()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> implementz;

	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Member> members;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiniJavaPackage.Literals.TYPE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessLevel getAccessLevel() {
		return accessLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessLevel(AccessLevel newAccessLevel) {
		AccessLevel oldAccessLevel = accessLevel;
		accessLevel = newAccessLevel == null ? ACCESS_LEVEL_EDEFAULT : newAccessLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.TYPE_DECLARATION__ACCESS_LEVEL, oldAccessLevel, accessLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getImplementz() {
		if (implementz == null) {
			implementz = new EObjectResolvingEList<Interface>(Interface.class, this, MiniJavaPackage.TYPE_DECLARATION__IMPLEMENTZ);
		}
		return implementz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Member> getMembers() {
		if (members == null) {
			members = new EObjectContainmentEList<Member>(Member.class, this, MiniJavaPackage.TYPE_DECLARATION__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MiniJavaPackage.TYPE_DECLARATION__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
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
			case MiniJavaPackage.TYPE_DECLARATION__ACCESS_LEVEL:
				return getAccessLevel();
			case MiniJavaPackage.TYPE_DECLARATION__IMPLEMENTZ:
				return getImplementz();
			case MiniJavaPackage.TYPE_DECLARATION__MEMBERS:
				return getMembers();
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
			case MiniJavaPackage.TYPE_DECLARATION__ACCESS_LEVEL:
				setAccessLevel((AccessLevel)newValue);
				return;
			case MiniJavaPackage.TYPE_DECLARATION__IMPLEMENTZ:
				getImplementz().clear();
				getImplementz().addAll((Collection<? extends Interface>)newValue);
				return;
			case MiniJavaPackage.TYPE_DECLARATION__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends Member>)newValue);
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
			case MiniJavaPackage.TYPE_DECLARATION__ACCESS_LEVEL:
				setAccessLevel(ACCESS_LEVEL_EDEFAULT);
				return;
			case MiniJavaPackage.TYPE_DECLARATION__IMPLEMENTZ:
				getImplementz().clear();
				return;
			case MiniJavaPackage.TYPE_DECLARATION__MEMBERS:
				getMembers().clear();
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
			case MiniJavaPackage.TYPE_DECLARATION__ACCESS_LEVEL:
				return accessLevel != ACCESS_LEVEL_EDEFAULT;
			case MiniJavaPackage.TYPE_DECLARATION__IMPLEMENTZ:
				return implementz != null && !implementz.isEmpty();
			case MiniJavaPackage.TYPE_DECLARATION__MEMBERS:
				return members != null && !members.isEmpty();
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
		result.append(" (accessLevel: ");
		result.append(accessLevel);
		result.append(')');
		return result.toString();
	}

} //TypeDeclarationImpl
