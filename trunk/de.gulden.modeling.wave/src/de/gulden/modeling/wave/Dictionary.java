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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dictionary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gulden.modeling.wave.Dictionary#getLabel <em>Label</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.Dictionary#getDefaultLang <em>Default Lang</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gulden.modeling.wave.WavePackage#getDictionary()
 * @model
 * @generated
 */
public interface Dictionary extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference list.
	 * The list contents are of type {@link de.gulden.modeling.wave.Label}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference list.
	 * @see de.gulden.modeling.wave.WavePackage#getDictionary_Label()
	 * @model containment="true"
	 * @generated
	 */
	EList<Label> getLabel();

	/**
	 * Returns the value of the '<em><b>Default Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Lang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Lang</em>' attribute.
	 * @see #setDefaultLang(String)
	 * @see de.gulden.modeling.wave.WavePackage#getDictionary_DefaultLang()
	 * @model
	 * @generated
	 */
	String getDefaultLang();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.Dictionary#getDefaultLang <em>Default Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Lang</em>' attribute.
	 * @see #getDefaultLang()
	 * @generated
	 */
	void setDefaultLang(String value);

} // Dictionary
