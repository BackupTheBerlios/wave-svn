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
 * A representation of the model object '<em><b>OOP Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gulden.modeling.wave.OOPClassifier#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.OOPClassifier#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.OOPClassifier#getExternalExtends <em>External Extends</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.OOPClassifier#getExternalImplements <em>External Implements</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.OOPClassifier#getInner <em>Inner</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gulden.modeling.wave.WavePackage#getOOPClassifier()
 * @model abstract="true"
 * @generated
 */
public interface OOPClassifier extends Classifier {
	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see de.gulden.modeling.wave.WavePackage#getOOPClassifier_IsAbstract()
	 * @model
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.OOPClassifier#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link de.gulden.modeling.wave.EnumVisibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see de.gulden.modeling.wave.EnumVisibility
	 * @see #setVisibility(EnumVisibility)
	 * @see de.gulden.modeling.wave.WavePackage#getOOPClassifier_Visibility()
	 * @model
	 * @generated
	 */
	EnumVisibility getVisibility();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.OOPClassifier#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see de.gulden.modeling.wave.EnumVisibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(EnumVisibility value);

	/**
	 * Returns the value of the '<em><b>External Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Extends</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Extends</em>' attribute.
	 * @see #setExternalExtends(String)
	 * @see de.gulden.modeling.wave.WavePackage#getOOPClassifier_ExternalExtends()
	 * @model
	 * @generated
	 */
	String getExternalExtends();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.OOPClassifier#getExternalExtends <em>External Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Extends</em>' attribute.
	 * @see #getExternalExtends()
	 * @generated
	 */
	void setExternalExtends(String value);

	/**
	 * Returns the value of the '<em><b>External Implements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Implements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Implements</em>' attribute.
	 * @see #setExternalImplements(String)
	 * @see de.gulden.modeling.wave.WavePackage#getOOPClassifier_ExternalImplements()
	 * @model
	 * @generated
	 */
	String getExternalImplements();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.OOPClassifier#getExternalImplements <em>External Implements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Implements</em>' attribute.
	 * @see #getExternalImplements()
	 * @generated
	 */
	void setExternalImplements(String value);

	/**
	 * Returns the value of the '<em><b>Inner</b></em>' containment reference list.
	 * The list contents are of type {@link de.gulden.modeling.wave.OOPClassifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner</em>' containment reference list.
	 * @see de.gulden.modeling.wave.WavePackage#getOOPClassifier_Inner()
	 * @model containment="true"
	 * @generated
	 */
	EList<OOPClassifier> getInner();

} // OOPClassifier
