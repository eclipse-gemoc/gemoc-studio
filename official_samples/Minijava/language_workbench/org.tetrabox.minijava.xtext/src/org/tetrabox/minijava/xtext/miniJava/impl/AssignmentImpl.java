/**
 */
package org.tetrabox.minijava.xtext.miniJava.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tetrabox.minijava.xtext.miniJava.Assignee;
import org.tetrabox.minijava.xtext.miniJava.Assignment;
import org.tetrabox.minijava.xtext.miniJava.Expression;
import org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.AssignmentImpl#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.AssignmentImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentImpl extends StatementImpl implements Assignment {
	/**
	 * The cached value of the '{@link #getAssignee() <em>Assignee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignee()
	 * @generated
	 * @ordered
	 */
	protected Assignee assignee;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Expression value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiniJavaPackage.Literals.ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignee getAssignee() {
		return assignee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignee(Assignee newAssignee, NotificationChain msgs) {
		Assignee oldAssignee = assignee;
		assignee = newAssignee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniJavaPackage.ASSIGNMENT__ASSIGNEE, oldAssignee, newAssignee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignee(Assignee newAssignee) {
		if (newAssignee != assignee) {
			NotificationChain msgs = null;
			if (assignee != null)
				msgs = ((InternalEObject)assignee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.ASSIGNMENT__ASSIGNEE, null, msgs);
			if (newAssignee != null)
				msgs = ((InternalEObject)newAssignee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.ASSIGNMENT__ASSIGNEE, null, msgs);
			msgs = basicSetAssignee(newAssignee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.ASSIGNMENT__ASSIGNEE, newAssignee, newAssignee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Expression newValue, NotificationChain msgs) {
		Expression oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniJavaPackage.ASSIGNMENT__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Expression newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.ASSIGNMENT__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.ASSIGNMENT__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.ASSIGNMENT__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MiniJavaPackage.ASSIGNMENT__ASSIGNEE:
				return basicSetAssignee(null, msgs);
			case MiniJavaPackage.ASSIGNMENT__VALUE:
				return basicSetValue(null, msgs);
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
			case MiniJavaPackage.ASSIGNMENT__ASSIGNEE:
				return getAssignee();
			case MiniJavaPackage.ASSIGNMENT__VALUE:
				return getValue();
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
			case MiniJavaPackage.ASSIGNMENT__ASSIGNEE:
				setAssignee((Assignee)newValue);
				return;
			case MiniJavaPackage.ASSIGNMENT__VALUE:
				setValue((Expression)newValue);
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
			case MiniJavaPackage.ASSIGNMENT__ASSIGNEE:
				setAssignee((Assignee)null);
				return;
			case MiniJavaPackage.ASSIGNMENT__VALUE:
				setValue((Expression)null);
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
			case MiniJavaPackage.ASSIGNMENT__ASSIGNEE:
				return assignee != null;
			case MiniJavaPackage.ASSIGNMENT__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

} //AssignmentImpl
