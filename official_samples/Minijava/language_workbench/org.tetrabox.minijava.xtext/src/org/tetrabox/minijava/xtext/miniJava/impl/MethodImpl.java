/**
 */
package org.tetrabox.minijava.xtext.miniJava.impl;

import java.util.Collection;
import java.util.Map;

import java.util.Map.Entry;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tetrabox.minijava.xtext.miniJava.Block;
import org.tetrabox.minijava.xtext.miniJava.Clazz;
import org.tetrabox.minijava.xtext.miniJava.Method;
import org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage;
import org.tetrabox.minijava.xtext.miniJava.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.MethodImpl#isIsabstract <em>Isabstract</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.MethodImpl#isIsstatic <em>Isstatic</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.MethodImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.MethodImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.MethodImpl#getCache <em>Cache</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImpl extends MemberImpl implements Method {
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
	 * The default value of the '{@link #isIsstatic() <em>Isstatic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsstatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ISSTATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsstatic() <em>Isstatic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsstatic()
	 * @generated
	 * @ordered
	 */
	protected boolean isstatic = ISSTATIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> params;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected Block body;

	/**
	 * The cached value of the '{@link #getCache() <em>Cache</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCache()
	 * @generated
	 * @ordered
	 */
	protected EList<Map.Entry<Clazz, Method>> cache;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiniJavaPackage.Literals.METHOD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.METHOD__ISABSTRACT, oldIsabstract, isabstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsstatic() {
		return isstatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsstatic(boolean newIsstatic) {
		boolean oldIsstatic = isstatic;
		isstatic = newIsstatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.METHOD__ISSTATIC, oldIsstatic, isstatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParams() {
		if (params == null) {
			params = new EObjectContainmentEList<Parameter>(Parameter.class, this, MiniJavaPackage.METHOD__PARAMS);
		}
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Block newBody, NotificationChain msgs) {
		Block oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniJavaPackage.METHOD__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(Block newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.METHOD__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.METHOD__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.METHOD__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Map.Entry<Clazz, Method>> getCache() {
		if (cache == null) {
			cache = new EObjectResolvingEList<Map.Entry<Clazz, Method>>(Entry.class, this, MiniJavaPackage.METHOD__CACHE);
		}
		return cache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MiniJavaPackage.METHOD__PARAMS:
				return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
			case MiniJavaPackage.METHOD__BODY:
				return basicSetBody(null, msgs);
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
			case MiniJavaPackage.METHOD__ISABSTRACT:
				return isIsabstract();
			case MiniJavaPackage.METHOD__ISSTATIC:
				return isIsstatic();
			case MiniJavaPackage.METHOD__PARAMS:
				return getParams();
			case MiniJavaPackage.METHOD__BODY:
				return getBody();
			case MiniJavaPackage.METHOD__CACHE:
				return getCache();
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
			case MiniJavaPackage.METHOD__ISABSTRACT:
				setIsabstract((Boolean)newValue);
				return;
			case MiniJavaPackage.METHOD__ISSTATIC:
				setIsstatic((Boolean)newValue);
				return;
			case MiniJavaPackage.METHOD__PARAMS:
				getParams().clear();
				getParams().addAll((Collection<? extends Parameter>)newValue);
				return;
			case MiniJavaPackage.METHOD__BODY:
				setBody((Block)newValue);
				return;
			case MiniJavaPackage.METHOD__CACHE:
				getCache().clear();
				getCache().addAll((Collection<? extends Map.Entry<Clazz, Method>>)newValue);
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
			case MiniJavaPackage.METHOD__ISABSTRACT:
				setIsabstract(ISABSTRACT_EDEFAULT);
				return;
			case MiniJavaPackage.METHOD__ISSTATIC:
				setIsstatic(ISSTATIC_EDEFAULT);
				return;
			case MiniJavaPackage.METHOD__PARAMS:
				getParams().clear();
				return;
			case MiniJavaPackage.METHOD__BODY:
				setBody((Block)null);
				return;
			case MiniJavaPackage.METHOD__CACHE:
				getCache().clear();
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
			case MiniJavaPackage.METHOD__ISABSTRACT:
				return isabstract != ISABSTRACT_EDEFAULT;
			case MiniJavaPackage.METHOD__ISSTATIC:
				return isstatic != ISSTATIC_EDEFAULT;
			case MiniJavaPackage.METHOD__PARAMS:
				return params != null && !params.isEmpty();
			case MiniJavaPackage.METHOD__BODY:
				return body != null;
			case MiniJavaPackage.METHOD__CACHE:
				return cache != null && !cache.isEmpty();
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
		result.append(", isstatic: ");
		result.append(isstatic);
		result.append(')');
		return result.toString();
	}

} //MethodImpl
