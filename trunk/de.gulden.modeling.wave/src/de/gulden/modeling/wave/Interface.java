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
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gulden.modeling.wave.Interface#getTargetMode <em>Target Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gulden.modeling.wave.WavePackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends OOPClassifier {
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
	 * @see de.gulden.modeling.wave.WavePackage#getInterface_TargetMode()
	 * @model
	 * @generated
	 */
	EnumTargetModes getTargetMode();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.Interface#getTargetMode <em>Target Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Mode</em>' attribute.
	 * @see de.gulden.modeling.wave.EnumTargetModes
	 * @see #getTargetMode()
	 * @generated
	 */
	void setTargetMode(EnumTargetModes value);

} // Interface
