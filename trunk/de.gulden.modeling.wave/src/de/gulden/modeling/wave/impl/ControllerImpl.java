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
import de.gulden.modeling.wave.ActionToViewTransition;
import de.gulden.modeling.wave.Controller;
import de.gulden.modeling.wave.View;
import de.gulden.modeling.wave.ViewTransition;
import de.gulden.modeling.wave.WavePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.gulden.modeling.wave.impl.ControllerImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.ControllerImpl#getViews <em>Views</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.ControllerImpl#getTransitionsActionToView <em>Transitions Action To View</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.ControllerImpl#getTransitionsView <em>Transitions View</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControllerImpl extends ArtifactClassifierImpl implements Controller {
	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getViews() <em>Views</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected EList<View> views;

	/**
	 * The cached value of the '{@link #getTransitionsActionToView() <em>Transitions Action To View</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionsActionToView()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionToViewTransition> transitionsActionToView;

	/**
	 * The cached value of the '{@link #getTransitionsView() <em>Transitions View</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionsView()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewTransition> transitionsView;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavePackage.Literals.CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, WavePackage.CONTROLLER__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<View> getViews() {
		if (views == null) {
			views = new EObjectContainmentEList<View>(View.class, this, WavePackage.CONTROLLER__VIEWS);
		}
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionToViewTransition> getTransitionsActionToView() {
		if (transitionsActionToView == null) {
			transitionsActionToView = new EObjectContainmentEList<ActionToViewTransition>(ActionToViewTransition.class, this, WavePackage.CONTROLLER__TRANSITIONS_ACTION_TO_VIEW);
		}
		return transitionsActionToView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewTransition> getTransitionsView() {
		if (transitionsView == null) {
			transitionsView = new EObjectContainmentEList<ViewTransition>(ViewTransition.class, this, WavePackage.CONTROLLER__TRANSITIONS_VIEW);
		}
		return transitionsView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WavePackage.CONTROLLER__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case WavePackage.CONTROLLER__VIEWS:
				return ((InternalEList<?>)getViews()).basicRemove(otherEnd, msgs);
			case WavePackage.CONTROLLER__TRANSITIONS_ACTION_TO_VIEW:
				return ((InternalEList<?>)getTransitionsActionToView()).basicRemove(otherEnd, msgs);
			case WavePackage.CONTROLLER__TRANSITIONS_VIEW:
				return ((InternalEList<?>)getTransitionsView()).basicRemove(otherEnd, msgs);
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
			case WavePackage.CONTROLLER__ACTIONS:
				return getActions();
			case WavePackage.CONTROLLER__VIEWS:
				return getViews();
			case WavePackage.CONTROLLER__TRANSITIONS_ACTION_TO_VIEW:
				return getTransitionsActionToView();
			case WavePackage.CONTROLLER__TRANSITIONS_VIEW:
				return getTransitionsView();
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
			case WavePackage.CONTROLLER__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case WavePackage.CONTROLLER__VIEWS:
				getViews().clear();
				getViews().addAll((Collection<? extends View>)newValue);
				return;
			case WavePackage.CONTROLLER__TRANSITIONS_ACTION_TO_VIEW:
				getTransitionsActionToView().clear();
				getTransitionsActionToView().addAll((Collection<? extends ActionToViewTransition>)newValue);
				return;
			case WavePackage.CONTROLLER__TRANSITIONS_VIEW:
				getTransitionsView().clear();
				getTransitionsView().addAll((Collection<? extends ViewTransition>)newValue);
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
			case WavePackage.CONTROLLER__ACTIONS:
				getActions().clear();
				return;
			case WavePackage.CONTROLLER__VIEWS:
				getViews().clear();
				return;
			case WavePackage.CONTROLLER__TRANSITIONS_ACTION_TO_VIEW:
				getTransitionsActionToView().clear();
				return;
			case WavePackage.CONTROLLER__TRANSITIONS_VIEW:
				getTransitionsView().clear();
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
			case WavePackage.CONTROLLER__ACTIONS:
				return actions != null && !actions.isEmpty();
			case WavePackage.CONTROLLER__VIEWS:
				return views != null && !views.isEmpty();
			case WavePackage.CONTROLLER__TRANSITIONS_ACTION_TO_VIEW:
				return transitionsActionToView != null && !transitionsActionToView.isEmpty();
			case WavePackage.CONTROLLER__TRANSITIONS_VIEW:
				return transitionsView != null && !transitionsView.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControllerImpl
