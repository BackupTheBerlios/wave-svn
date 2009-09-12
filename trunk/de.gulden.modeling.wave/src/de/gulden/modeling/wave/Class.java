/**
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 *
 * $Id$
 */
package de.gulden.modeling.wave;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gulden.modeling.wave.Class#isIsPersistent <em>Is Persistent</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.Class#getTargetMode <em>Target Mode</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.Class#getForms <em>Forms</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gulden.modeling.wave.WavePackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends OOPClassifier {
	/**
	 * Returns the value of the '<em><b>Is Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Persistent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Persistent</em>' attribute.
	 * @see #setIsPersistent(boolean)
	 * @see de.gulden.modeling.wave.WavePackage#getClass_IsPersistent()
	 * @model
	 * @generated
	 */
	boolean isIsPersistent();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.Class#isIsPersistent <em>Is Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Persistent</em>' attribute.
	 * @see #isIsPersistent()
	 * @generated
	 */
	void setIsPersistent(boolean value);

	/**
	 * Returns the value of the '<em><b>Target Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link de.gulden.modeling.wave.EnumTargetModes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Mode</em>' attribute.
	 * @see de.gulden.modeling.wave.EnumTargetModes
	 * @see #setTargetMode(EnumTargetModes)
	 * @see de.gulden.modeling.wave.WavePackage#getClass_TargetMode()
	 * @model
	 * @generated
	 */
	EnumTargetModes getTargetMode();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.Class#getTargetMode <em>Target Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Mode</em>' attribute.
	 * @see de.gulden.modeling.wave.EnumTargetModes
	 * @see #getTargetMode()
	 * @generated
	 */
	void setTargetMode(EnumTargetModes value);

	/**
	 * Returns the value of the '<em><b>Forms</b></em>' containment reference list.
	 * The list contents are of type {@link de.gulden.modeling.wave.Form}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forms</em>' containment reference list.
	 * @see de.gulden.modeling.wave.WavePackage#getClass_Forms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Form> getForms();

} // Class
