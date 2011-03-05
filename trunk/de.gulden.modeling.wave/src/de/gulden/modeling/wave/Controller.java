/**
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gulden.modeling.wave.Controller#getActions <em>Actions</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.Controller#getViews <em>Views</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.Controller#getTransitionsActionToView <em>Transitions Action To View</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.Controller#getTransitionsView <em>Transitions View</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gulden.modeling.wave.WavePackage#getController()
 * @model
 * @generated
 */
public interface Controller extends ArtifactClassifier {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link de.gulden.modeling.wave.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see de.gulden.modeling.wave.WavePackage#getController_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * The list contents are of type {@link de.gulden.modeling.wave.View}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see de.gulden.modeling.wave.WavePackage#getController_Views()
	 * @model containment="true"
	 * @generated
	 */
	EList<View> getViews();

	/**
	 * Returns the value of the '<em><b>Transitions Action To View</b></em>' containment reference list.
	 * The list contents are of type {@link de.gulden.modeling.wave.ActionToViewTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions Action To View</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions Action To View</em>' containment reference list.
	 * @see de.gulden.modeling.wave.WavePackage#getController_TransitionsActionToView()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionToViewTransition> getTransitionsActionToView();

	/**
	 * Returns the value of the '<em><b>Transitions View</b></em>' containment reference list.
	 * The list contents are of type {@link de.gulden.modeling.wave.ViewTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions View</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions View</em>' containment reference list.
	 * @see de.gulden.modeling.wave.WavePackage#getController_TransitionsView()
	 * @model containment="true"
	 * @generated
	 */
	EList<ViewTransition> getTransitionsView();

} // Controller
