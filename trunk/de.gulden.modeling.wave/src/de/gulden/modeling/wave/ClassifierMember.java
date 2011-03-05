/**
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gulden.modeling.wave.ClassifierMember#getSignature <em>Signature</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.ClassifierMember#getName <em>Name</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.ClassifierMember#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.ClassifierMember#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.ClassifierMember#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.ClassifierMember#getTargetMode <em>Target Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gulden.modeling.wave.WavePackage#getClassifierMember()
 * @model
 * @generated
 */
public interface ClassifierMember extends ModelMember {
	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #setSignature(String)
	 * @see de.gulden.modeling.wave.WavePackage#getClassifierMember_Signature()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.ClassifierMember#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.gulden.modeling.wave.WavePackage#getClassifierMember_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.ClassifierMember#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see de.gulden.modeling.wave.WavePackage#getClassifierMember_Visibility()
	 * @model
	 * @generated
	 */
	EnumVisibility getVisibility();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.ClassifierMember#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see de.gulden.modeling.wave.EnumVisibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(EnumVisibility value);

	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #setIsStatic(boolean)
	 * @see de.gulden.modeling.wave.WavePackage#getClassifierMember_IsStatic()
	 * @model
	 * @generated
	 */
	boolean isIsStatic();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.ClassifierMember#isIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #isIsStatic()
	 * @generated
	 */
	void setIsStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Final</em>' attribute.
	 * @see #setIsFinal(boolean)
	 * @see de.gulden.modeling.wave.WavePackage#getClassifierMember_IsFinal()
	 * @model
	 * @generated
	 */
	boolean isIsFinal();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.ClassifierMember#isIsFinal <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Final</em>' attribute.
	 * @see #isIsFinal()
	 * @generated
	 */
	void setIsFinal(boolean value);

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
	 * @see de.gulden.modeling.wave.WavePackage#getClassifierMember_TargetMode()
	 * @model
	 * @generated
	 */
	EnumTargetModes getTargetMode();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.ClassifierMember#getTargetMode <em>Target Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Mode</em>' attribute.
	 * @see de.gulden.modeling.wave.EnumTargetModes
	 * @see #getTargetMode()
	 * @generated
	 */
	void setTargetMode(EnumTargetModes value);

} // ClassifierMember
