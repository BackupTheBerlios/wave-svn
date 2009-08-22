/**
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 *
 * $Id$
 */
package de.gulden.modeling.wave.impl;

import de.gulden.modeling.wave.Action;
import de.gulden.modeling.wave.AssociationRelationship;
import de.gulden.modeling.wave.WavePackage;
import de.gulden.modeling.wave.WidgetAssociation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.gulden.modeling.wave.impl.WidgetAssociationImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.WidgetAssociationImpl#getElementsMenuActions <em>Elements Menu Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WidgetAssociationImpl extends WidgetImpl implements WidgetAssociation {
	/**
	 * The cached value of the '{@link #getAssociation() <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
	protected AssociationRelationship association;

	/**
	 * The cached value of the '{@link #getElementsMenuActions() <em>Elements Menu Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementsMenuActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> elementsMenuActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavePackage.Literals.WIDGET_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationRelationship getAssociation() {
		if (association != null && association.eIsProxy()) {
			InternalEObject oldAssociation = (InternalEObject)association;
			association = (AssociationRelationship)eResolveProxy(oldAssociation);
			if (association != oldAssociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WavePackage.WIDGET_ASSOCIATION__ASSOCIATION, oldAssociation, association));
			}
		}
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationRelationship basicGetAssociation() {
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociation(AssociationRelationship newAssociation) {
		AssociationRelationship oldAssociation = association;
		association = newAssociation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.WIDGET_ASSOCIATION__ASSOCIATION, oldAssociation, association));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getElementsMenuActions() {
		if (elementsMenuActions == null) {
			elementsMenuActions = new EObjectResolvingEList<Action>(Action.class, this, WavePackage.WIDGET_ASSOCIATION__ELEMENTS_MENU_ACTIONS);
		}
		return elementsMenuActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WavePackage.WIDGET_ASSOCIATION__ASSOCIATION:
				if (resolve) return getAssociation();
				return basicGetAssociation();
			case WavePackage.WIDGET_ASSOCIATION__ELEMENTS_MENU_ACTIONS:
				return getElementsMenuActions();
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
			case WavePackage.WIDGET_ASSOCIATION__ASSOCIATION:
				setAssociation((AssociationRelationship)newValue);
				return;
			case WavePackage.WIDGET_ASSOCIATION__ELEMENTS_MENU_ACTIONS:
				getElementsMenuActions().clear();
				getElementsMenuActions().addAll((Collection<? extends Action>)newValue);
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
			case WavePackage.WIDGET_ASSOCIATION__ASSOCIATION:
				setAssociation((AssociationRelationship)null);
				return;
			case WavePackage.WIDGET_ASSOCIATION__ELEMENTS_MENU_ACTIONS:
				getElementsMenuActions().clear();
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
			case WavePackage.WIDGET_ASSOCIATION__ASSOCIATION:
				return association != null;
			case WavePackage.WIDGET_ASSOCIATION__ELEMENTS_MENU_ACTIONS:
				return elementsMenuActions != null && !elementsMenuActions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WidgetAssociationImpl
