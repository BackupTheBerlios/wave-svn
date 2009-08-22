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
 * A representation of the model object '<em><b>View Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gulden.modeling.wave.ViewTransition#getSource <em>Source</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.ViewTransition#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gulden.modeling.wave.WavePackage#getViewTransition()
 * @model
 * @generated
 */
public interface ViewTransition extends Transition {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ControllerMemberExecutable)
	 * @see de.gulden.modeling.wave.WavePackage#getViewTransition_Source()
	 * @model required="true"
	 * @generated
	 */
	ControllerMemberExecutable getSource();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.ViewTransition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ControllerMemberExecutable value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ControllerMemberExecutable)
	 * @see de.gulden.modeling.wave.WavePackage#getViewTransition_Target()
	 * @model required="true"
	 * @generated
	 */
	ControllerMemberExecutable getTarget();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.ViewTransition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ControllerMemberExecutable value);

} // ViewTransition
