/**
 */
package org.tetrabox.minijava.xtext.miniJava.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tetrabox.minijava.xtext.miniJava.Assignment;
import org.tetrabox.minijava.xtext.miniJava.Block;
import org.tetrabox.minijava.xtext.miniJava.Expression;
import org.tetrabox.minijava.xtext.miniJava.ForStatement;
import org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.ForStatementImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.ForStatementImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.ForStatementImpl#getProgression <em>Progression</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.ForStatementImpl#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForStatementImpl extends StatementImpl implements ForStatement {
	/**
	 * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaration()
	 * @generated
	 * @ordered
	 */
	protected Assignment declaration;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression condition;

	/**
	 * The cached value of the '{@link #getProgression() <em>Progression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgression()
	 * @generated
	 * @ordered
	 */
	protected Assignment progression;

	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected Block block;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiniJavaPackage.Literals.FOR_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment getDeclaration() {
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeclaration(Assignment newDeclaration, NotificationChain msgs) {
		Assignment oldDeclaration = declaration;
		declaration = newDeclaration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniJavaPackage.FOR_STATEMENT__DECLARATION, oldDeclaration, newDeclaration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaration(Assignment newDeclaration) {
		if (newDeclaration != declaration) {
			NotificationChain msgs = null;
			if (declaration != null)
				msgs = ((InternalEObject)declaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.FOR_STATEMENT__DECLARATION, null, msgs);
			if (newDeclaration != null)
				msgs = ((InternalEObject)newDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.FOR_STATEMENT__DECLARATION, null, msgs);
			msgs = basicSetDeclaration(newDeclaration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.FOR_STATEMENT__DECLARATION, newDeclaration, newDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
		Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniJavaPackage.FOR_STATEMENT__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Expression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.FOR_STATEMENT__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.FOR_STATEMENT__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.FOR_STATEMENT__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment getProgression() {
		return progression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgression(Assignment newProgression, NotificationChain msgs) {
		Assignment oldProgression = progression;
		progression = newProgression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniJavaPackage.FOR_STATEMENT__PROGRESSION, oldProgression, newProgression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgression(Assignment newProgression) {
		if (newProgression != progression) {
			NotificationChain msgs = null;
			if (progression != null)
				msgs = ((InternalEObject)progression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.FOR_STATEMENT__PROGRESSION, null, msgs);
			if (newProgression != null)
				msgs = ((InternalEObject)newProgression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.FOR_STATEMENT__PROGRESSION, null, msgs);
			msgs = basicSetProgression(newProgression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.FOR_STATEMENT__PROGRESSION, newProgression, newProgression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getBlock() {
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlock(Block newBlock, NotificationChain msgs) {
		Block oldBlock = block;
		block = newBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniJavaPackage.FOR_STATEMENT__BLOCK, oldBlock, newBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlock(Block newBlock) {
		if (newBlock != block) {
			NotificationChain msgs = null;
			if (block != null)
				msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.FOR_STATEMENT__BLOCK, null, msgs);
			if (newBlock != null)
				msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.FOR_STATEMENT__BLOCK, null, msgs);
			msgs = basicSetBlock(newBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.FOR_STATEMENT__BLOCK, newBlock, newBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MiniJavaPackage.FOR_STATEMENT__DECLARATION:
				return basicSetDeclaration(null, msgs);
			case MiniJavaPackage.FOR_STATEMENT__CONDITION:
				return basicSetCondition(null, msgs);
			case MiniJavaPackage.FOR_STATEMENT__PROGRESSION:
				return basicSetProgression(null, msgs);
			case MiniJavaPackage.FOR_STATEMENT__BLOCK:
				return basicSetBlock(null, msgs);
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
			case MiniJavaPackage.FOR_STATEMENT__DECLARATION:
				return getDeclaration();
			case MiniJavaPackage.FOR_STATEMENT__CONDITION:
				return getCondition();
			case MiniJavaPackage.FOR_STATEMENT__PROGRESSION:
				return getProgression();
			case MiniJavaPackage.FOR_STATEMENT__BLOCK:
				return getBlock();
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
			case MiniJavaPackage.FOR_STATEMENT__DECLARATION:
				setDeclaration((Assignment)newValue);
				return;
			case MiniJavaPackage.FOR_STATEMENT__CONDITION:
				setCondition((Expression)newValue);
				return;
			case MiniJavaPackage.FOR_STATEMENT__PROGRESSION:
				setProgression((Assignment)newValue);
				return;
			case MiniJavaPackage.FOR_STATEMENT__BLOCK:
				setBlock((Block)newValue);
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
			case MiniJavaPackage.FOR_STATEMENT__DECLARATION:
				setDeclaration((Assignment)null);
				return;
			case MiniJavaPackage.FOR_STATEMENT__CONDITION:
				setCondition((Expression)null);
				return;
			case MiniJavaPackage.FOR_STATEMENT__PROGRESSION:
				setProgression((Assignment)null);
				return;
			case MiniJavaPackage.FOR_STATEMENT__BLOCK:
				setBlock((Block)null);
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
			case MiniJavaPackage.FOR_STATEMENT__DECLARATION:
				return declaration != null;
			case MiniJavaPackage.FOR_STATEMENT__CONDITION:
				return condition != null;
			case MiniJavaPackage.FOR_STATEMENT__PROGRESSION:
				return progression != null;
			case MiniJavaPackage.FOR_STATEMENT__BLOCK:
				return block != null;
		}
		return super.eIsSet(featureID);
	}

} //ForStatementImpl
