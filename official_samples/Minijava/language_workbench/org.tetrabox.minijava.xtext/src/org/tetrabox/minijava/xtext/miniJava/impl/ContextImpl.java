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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tetrabox.minijava.xtext.miniJava.Context;
import org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage;
import org.tetrabox.minijava.xtext.miniJava.Symbol;
import org.tetrabox.minijava.xtext.miniJava.SymbolBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.ContextImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.ContextImpl#getParentContext <em>Parent Context</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.ContextImpl#getChildContext <em>Child Context</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.ContextImpl#getCache <em>Cache</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextImpl extends MinimalEObjectImpl.Container implements Context {
	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<SymbolBinding> bindings;

	/**
	 * The cached value of the '{@link #getChildContext() <em>Child Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildContext()
	 * @generated
	 * @ordered
	 */
	protected Context childContext;

	/**
	 * The cached value of the '{@link #getCache() <em>Cache</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCache()
	 * @generated
	 * @ordered
	 */
	protected EList<Map.Entry<Symbol, SymbolBinding>> cache;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiniJavaPackage.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SymbolBinding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentEList<SymbolBinding>(SymbolBinding.class, this, MiniJavaPackage.CONTEXT__BINDINGS);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getParentContext() {
		if (eContainerFeatureID() != MiniJavaPackage.CONTEXT__PARENT_CONTEXT) return null;
		return (Context)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentContext(Context newParentContext, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentContext, MiniJavaPackage.CONTEXT__PARENT_CONTEXT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentContext(Context newParentContext) {
		if (newParentContext != eInternalContainer() || (eContainerFeatureID() != MiniJavaPackage.CONTEXT__PARENT_CONTEXT && newParentContext != null)) {
			if (EcoreUtil.isAncestor(this, newParentContext))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentContext != null)
				msgs = ((InternalEObject)newParentContext).eInverseAdd(this, MiniJavaPackage.CONTEXT__CHILD_CONTEXT, Context.class, msgs);
			msgs = basicSetParentContext(newParentContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.CONTEXT__PARENT_CONTEXT, newParentContext, newParentContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getChildContext() {
		return childContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildContext(Context newChildContext, NotificationChain msgs) {
		Context oldChildContext = childContext;
		childContext = newChildContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniJavaPackage.CONTEXT__CHILD_CONTEXT, oldChildContext, newChildContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildContext(Context newChildContext) {
		if (newChildContext != childContext) {
			NotificationChain msgs = null;
			if (childContext != null)
				msgs = ((InternalEObject)childContext).eInverseRemove(this, MiniJavaPackage.CONTEXT__PARENT_CONTEXT, Context.class, msgs);
			if (newChildContext != null)
				msgs = ((InternalEObject)newChildContext).eInverseAdd(this, MiniJavaPackage.CONTEXT__PARENT_CONTEXT, Context.class, msgs);
			msgs = basicSetChildContext(newChildContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.CONTEXT__CHILD_CONTEXT, newChildContext, newChildContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Map.Entry<Symbol, SymbolBinding>> getCache() {
		if (cache == null) {
			cache = new EObjectResolvingEList<Map.Entry<Symbol, SymbolBinding>>(Entry.class, this, MiniJavaPackage.CONTEXT__CACHE);
		}
		return cache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MiniJavaPackage.CONTEXT__PARENT_CONTEXT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentContext((Context)otherEnd, msgs);
			case MiniJavaPackage.CONTEXT__CHILD_CONTEXT:
				if (childContext != null)
					msgs = ((InternalEObject)childContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.CONTEXT__CHILD_CONTEXT, null, msgs);
				return basicSetChildContext((Context)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MiniJavaPackage.CONTEXT__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
			case MiniJavaPackage.CONTEXT__PARENT_CONTEXT:
				return basicSetParentContext(null, msgs);
			case MiniJavaPackage.CONTEXT__CHILD_CONTEXT:
				return basicSetChildContext(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MiniJavaPackage.CONTEXT__PARENT_CONTEXT:
				return eInternalContainer().eInverseRemove(this, MiniJavaPackage.CONTEXT__CHILD_CONTEXT, Context.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiniJavaPackage.CONTEXT__BINDINGS:
				return getBindings();
			case MiniJavaPackage.CONTEXT__PARENT_CONTEXT:
				return getParentContext();
			case MiniJavaPackage.CONTEXT__CHILD_CONTEXT:
				return getChildContext();
			case MiniJavaPackage.CONTEXT__CACHE:
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
			case MiniJavaPackage.CONTEXT__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends SymbolBinding>)newValue);
				return;
			case MiniJavaPackage.CONTEXT__PARENT_CONTEXT:
				setParentContext((Context)newValue);
				return;
			case MiniJavaPackage.CONTEXT__CHILD_CONTEXT:
				setChildContext((Context)newValue);
				return;
			case MiniJavaPackage.CONTEXT__CACHE:
				getCache().clear();
				getCache().addAll((Collection<? extends Map.Entry<Symbol, SymbolBinding>>)newValue);
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
			case MiniJavaPackage.CONTEXT__BINDINGS:
				getBindings().clear();
				return;
			case MiniJavaPackage.CONTEXT__PARENT_CONTEXT:
				setParentContext((Context)null);
				return;
			case MiniJavaPackage.CONTEXT__CHILD_CONTEXT:
				setChildContext((Context)null);
				return;
			case MiniJavaPackage.CONTEXT__CACHE:
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
			case MiniJavaPackage.CONTEXT__BINDINGS:
				return bindings != null && !bindings.isEmpty();
			case MiniJavaPackage.CONTEXT__PARENT_CONTEXT:
				return getParentContext() != null;
			case MiniJavaPackage.CONTEXT__CHILD_CONTEXT:
				return childContext != null;
			case MiniJavaPackage.CONTEXT__CACHE:
				return cache != null && !cache.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContextImpl
