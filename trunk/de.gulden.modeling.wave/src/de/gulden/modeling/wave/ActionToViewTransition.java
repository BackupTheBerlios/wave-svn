/**
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 *
 * $Id$
 */
package de.gulden.modeling.wave;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action To View Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gulden.modeling.wave.ActionToViewTransition#getTarget <em>Target</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.ActionToViewTransition#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gulden.modeling.wave.WavePackage#getActionToViewTransition()
 * @model
 * @generated
 */
public interface ActionToViewTransition extends Transition {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(View)
	 * @see de.gulden.modeling.wave.WavePackage#getActionToViewTransition_Target()
	 * @model required="true"
	 * @generated
	 */
	View getTarget();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.ActionToViewTransition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(View value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Action)
	 * @see de.gulden.modeling.wave.WavePackage#getActionToViewTransition_Source()
	 * @model required="true"
	 * @generated
	 */
	Action getSource();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.ActionToViewTransition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Action value);

} // ActionToViewTransition
