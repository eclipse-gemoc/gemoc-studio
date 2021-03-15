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
import org.eclipse.emf.ecore.util.InternalEList;

import org.tetrabox.minijava.xtext.miniJava.Expression;
import org.tetrabox.minijava.xtext.miniJava.Method;
import org.tetrabox.minijava.xtext.miniJava.MethodCall;
import org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.MethodCallImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.MethodCallImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.MethodCallImpl#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodCallImpl extends ExpressionImpl implements MethodCall {
	/**
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected Expression receiver;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected Method method;

	/**
	 * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> args;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiniJavaPackage.Literals.METHOD_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getReceiver() {
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceiver(Expression newReceiver, NotificationChain msgs) {
		Expression oldReceiver = receiver;
		receiver = newReceiver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniJavaPackage.METHOD_CALL__RECEIVER, oldReceiver, newReceiver);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiver(Expression newReceiver) {
		if (newReceiver != receiver) {
			NotificationChain msgs = null;
			if (receiver != null)
				msgs = ((InternalEObject)receiver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.METHOD_CALL__RECEIVER, null, msgs);
			if (newReceiver != null)
				msgs = ((InternalEObject)newReceiver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.METHOD_CALL__RECEIVER, null, msgs);
			msgs = basicSetReceiver(newReceiver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.METHOD_CALL__RECEIVER, newReceiver, newReceiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getMethod() {
		if (method != null && method.eIsProxy()) {
			InternalEObject oldMethod = (InternalEObject)method;
			method = (Method)eResolveProxy(oldMethod);
			if (method != oldMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiniJavaPackage.METHOD_CALL__METHOD, oldMethod, method));
			}
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method basicGetMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(Method newMethod) {
		Method oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.METHOD_CALL__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getArgs() {
		if (args == null) {
			args = new EObjectContainmentEList<Expression>(Expression.class, this, MiniJavaPackage.METHOD_CALL__ARGS);
		}
		return args;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MiniJavaPackage.METHOD_CALL__RECEIVER:
				return basicSetReceiver(null, msgs);
			case MiniJavaPackage.METHOD_CALL__ARGS:
				return ((InternalEList<?>)getArgs()).basicRemove(otherEnd, msgs);
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
			case MiniJavaPackage.METHOD_CALL__RECEIVER:
				return getReceiver();
			case MiniJavaPackage.METHOD_CALL__METHOD:
				if (resolve) return getMethod();
				return basicGetMethod();
			case MiniJavaPackage.METHOD_CALL__ARGS:
				return getArgs();
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
			case MiniJavaPackage.METHOD_CALL__RECEIVER:
				setReceiver((Expression)newValue);
				return;
			case MiniJavaPackage.METHOD_CALL__METHOD:
				setMethod((Method)newValue);
				return;
			case MiniJavaPackage.METHOD_CALL__ARGS:
				getArgs().clear();
				getArgs().addAll((Collection<? extends Expression>)newValue);
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
			case MiniJavaPackage.METHOD_CALL__RECEIVER:
				setReceiver((Expression)null);
				return;
			case MiniJavaPackage.METHOD_CALL__METHOD:
				setMethod((Method)null);
				return;
			case MiniJavaPackage.METHOD_CALL__ARGS:
				getArgs().clear();
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
			case MiniJavaPackage.METHOD_CALL__RECEIVER:
				return receiver != null;
			case MiniJavaPackage.METHOD_CALL__METHOD:
				return method != null;
			case MiniJavaPackage.METHOD_CALL__ARGS:
				return args != null && !args.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MethodCallImpl
