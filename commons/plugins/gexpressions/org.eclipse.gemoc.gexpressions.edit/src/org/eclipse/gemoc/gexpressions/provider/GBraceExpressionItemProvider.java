/*******************************************************************************
 * Copyright (c) 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.gemoc.gexpressions.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.gemoc.gexpressions.GBraceExpression;
import org.eclipse.gemoc.gexpressions.GexpressionsFactory;
import org.eclipse.gemoc.gexpressions.GexpressionsPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.gemoc.gexpressions.GBraceExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GBraceExpressionItemProvider extends GPrimaryExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GBraceExpressionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(GexpressionsPackage.Literals.GBRACE_EXPRESSION__INNER_EXPRESSION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns GBraceExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GBraceExpression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_GBraceExpression_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(GBraceExpression.class)) {
			case GexpressionsPackage.GBRACE_EXPRESSION__INNER_EXPRESSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(GexpressionsPackage.Literals.GBRACE_EXPRESSION__INNER_EXPRESSION,
				 GexpressionsFactory.eINSTANCE.createGNavigationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(GexpressionsPackage.Literals.GBRACE_EXPRESSION__INNER_EXPRESSION,
				 GexpressionsFactory.eINSTANCE.createGReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(GexpressionsPackage.Literals.GBRACE_EXPRESSION__INNER_EXPRESSION,
				 GexpressionsFactory.eINSTANCE.createGStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(GexpressionsPackage.Literals.GBRACE_EXPRESSION__INNER_EXPRESSION,
				 GexpressionsFactory.eINSTANCE.createGBooleanExpression()));

		newChildDescriptors.add
			(createChildParameter
				(GexpressionsPackage.Literals.GBRACE_EXPRESSION__INNER_EXPRESSION,
				 GexpressionsFactory.eINSTANCE.createGIntegerExpression()));

		newChildDescriptors.add
			(createChildParameter
				(GexpressionsPackage.Literals.GBRACE_EXPRESSION__INNER_EXPRESSION,
				 GexpressionsFactory.eINSTANCE.createGDoubleExpression()));

		newChildDescriptors.add
			(createChildParameter
				(GexpressionsPackage.Literals.GBRACE_EXPRESSION__INNER_EXPRESSION,
				 GexpressionsFactory.eINSTANCE.createGIfExpression()));

		newChildDescriptors.add
			(createChildParameter
				(GexpressionsPackage.Literals.GBRACE_EXPRESSION__INNER_EXPRESSION,
				 GexpressionsFactory.eINSTANCE.createGBraceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(GexpressionsPackage.Literals.GBRACE_EXPRESSION__INNER_EXPRESSION,
				 GexpressionsFactory.eINSTANCE.createGEnumLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(GexpressionsPackage.Literals.GBRACE_EXPRESSION__INNER_EXPRESSION,
				 GexpressionsFactory.eINSTANCE.createGAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(GexpressionsPackage.Literals.GBRACE_EXPRESSION__INNER_EXPRESSION,
				 GexpressionsFactory.eINSTANCE.createGXorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(GexpressionsPackage.Literals.GBRACE_EXPRESSION__INNER_EXPRESSION,
				 GexpressionsFactory.eINSTANCE.createGOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(GexpressionsPackage.Literals.GBRACE_EXPRESSION__INNER_EXPRESSION,
				 GexpressionsFactory.eINSTANCE.createGEqualityExpression()));

		newChildDescriptors.add
			(createChildParameter
				(GexpressionsPackage.Literals.GBRACE_EXPRESSION__INNER_EXPRESSION,
				 GexpressionsFactory.eINSTANCE.createGRelationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(GexpressionsPackage.Literals.GBRACE_EXPRESSION__INNER_EXPRESSION,
				 GexpressionsFactory.eINSTANCE.createGAdditionExpression()));

		newChildDescriptors.add
			(createChildParameter
				(GexpressionsPackage.Literals.GBRACE_EXPRESSION__INNER_EXPRESSION,
				 GexpressionsFactory.eINSTANCE.createGMultiplicationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(GexpressionsPackage.Literals.GBRACE_EXPRESSION__INNER_EXPRESSION,
				 GexpressionsFactory.eINSTANCE.createGNegationExpression()));
	}

}
