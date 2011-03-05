/**
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.provider;


import de.gulden.modeling.wave.WaveFactory;
import de.gulden.modeling.wave.WavePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.gulden.modeling.wave.Package} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageItemProvider
	extends TopLevelModelMemberItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Package_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Package_name_feature", "_UI_Package_type"),
				 WavePackage.Literals.PACKAGE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(WavePackage.Literals.PACKAGE__MEMBERS);
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
	 * This returns Package.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Package"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((de.gulden.modeling.wave.Package)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Package_type") :
			getString("_UI_Package_type") + " " + label;
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

		switch (notification.getFeatureID(de.gulden.modeling.wave.Package.class)) {
			case WavePackage.PACKAGE__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WavePackage.PACKAGE__MEMBERS:
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
				(WavePackage.Literals.PACKAGE__MEMBERS,
				 WaveFactory.eINSTANCE.createController()));

		newChildDescriptors.add
			(createChildParameter
				(WavePackage.Literals.PACKAGE__MEMBERS,
				 WaveFactory.eINSTANCE.createAssociationRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(WavePackage.Literals.PACKAGE__MEMBERS,
				 WaveFactory.eINSTANCE.createInheritanceRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(WavePackage.Literals.PACKAGE__MEMBERS,
				 WaveFactory.eINSTANCE.createRealizationRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(WavePackage.Literals.PACKAGE__MEMBERS,
				 WaveFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(WavePackage.Literals.PACKAGE__MEMBERS,
				 WaveFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(WavePackage.Literals.PACKAGE__MEMBERS,
				 WaveFactory.eINSTANCE.createDependencyRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(WavePackage.Literals.PACKAGE__MEMBERS,
				 WaveFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(WavePackage.Literals.PACKAGE__MEMBERS,
				 WaveFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(WavePackage.Literals.PACKAGE__MEMBERS,
				 WaveFactory.eINSTANCE.createInclude()));

		newChildDescriptors.add
			(createChildParameter
				(WavePackage.Literals.PACKAGE__MEMBERS,
				 WaveFactory.eINSTANCE.createStyleSheet()));

		newChildDescriptors.add
			(createChildParameter
				(WavePackage.Literals.PACKAGE__MEMBERS,
				 WaveFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(WavePackage.Literals.PACKAGE__MEMBERS,
				 WaveFactory.eINSTANCE.createDatabaseTable()));

		newChildDescriptors.add
			(createChildParameter
				(WavePackage.Literals.PACKAGE__MEMBERS,
				 WaveFactory.eINSTANCE.createUsecaseSubsystem()));

		newChildDescriptors.add
			(createChildParameter
				(WavePackage.Literals.PACKAGE__MEMBERS,
				 WaveFactory.eINSTANCE.createUsecase()));

		newChildDescriptors.add
			(createChildParameter
				(WavePackage.Literals.PACKAGE__MEMBERS,
				 WaveFactory.eINSTANCE.createActor()));
	}

}
