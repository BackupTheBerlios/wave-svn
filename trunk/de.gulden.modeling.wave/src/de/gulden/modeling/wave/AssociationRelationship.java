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
 * A representation of the model object '<em><b>Association Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gulden.modeling.wave.AssociationRelationship#getName <em>Name</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.AssociationRelationship#getMultiplicityA <em>Multiplicity A</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.AssociationRelationship#getMultiplicityB <em>Multiplicity B</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.AssociationRelationship#getA <em>A</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.AssociationRelationship#getB <em>B</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.AssociationRelationship#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gulden.modeling.wave.WavePackage#getAssociationRelationship()
 * @model
 * @generated
 */
public interface AssociationRelationship extends TopLevelModelMember {
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
	 * @see de.gulden.modeling.wave.WavePackage#getAssociationRelationship_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.AssociationRelationship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicity A</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * The literals are from the enumeration {@link de.gulden.modeling.wave.EnumMultiplicity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity A</em>' attribute.
	 * @see de.gulden.modeling.wave.EnumMultiplicity
	 * @see #setMultiplicityA(EnumMultiplicity)
	 * @see de.gulden.modeling.wave.WavePackage#getAssociationRelationship_MultiplicityA()
	 * @model default="1"
	 * @generated
	 */
	EnumMultiplicity getMultiplicityA();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.AssociationRelationship#getMultiplicityA <em>Multiplicity A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity A</em>' attribute.
	 * @see de.gulden.modeling.wave.EnumMultiplicity
	 * @see #getMultiplicityA()
	 * @generated
	 */
	void setMultiplicityA(EnumMultiplicity value);

	/**
	 * Returns the value of the '<em><b>Multiplicity B</b></em>' attribute.
	 * The default value is <code>"*"</code>.
	 * The literals are from the enumeration {@link de.gulden.modeling.wave.EnumMultiplicity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity B</em>' attribute.
	 * @see de.gulden.modeling.wave.EnumMultiplicity
	 * @see #setMultiplicityB(EnumMultiplicity)
	 * @see de.gulden.modeling.wave.WavePackage#getAssociationRelationship_MultiplicityB()
	 * @model default="*"
	 * @generated
	 */
	EnumMultiplicity getMultiplicityB();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.AssociationRelationship#getMultiplicityB <em>Multiplicity B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity B</em>' attribute.
	 * @see de.gulden.modeling.wave.EnumMultiplicity
	 * @see #getMultiplicityB()
	 * @generated
	 */
	void setMultiplicityB(EnumMultiplicity value);

	/**
	 * Returns the value of the '<em><b>A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' reference.
	 * @see #setA(OOPClassifier)
	 * @see de.gulden.modeling.wave.WavePackage#getAssociationRelationship_A()
	 * @model required="true"
	 * @generated
	 */
	OOPClassifier getA();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.AssociationRelationship#getA <em>A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A</em>' reference.
	 * @see #getA()
	 * @generated
	 */
	void setA(OOPClassifier value);

	/**
	 * Returns the value of the '<em><b>B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' reference.
	 * @see #setB(OOPClassifier)
	 * @see de.gulden.modeling.wave.WavePackage#getAssociationRelationship_B()
	 * @model required="true"
	 * @generated
	 */
	OOPClassifier getB();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.AssociationRelationship#getB <em>B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' reference.
	 * @see #getB()
	 * @generated
	 */
	void setB(OOPClassifier value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link de.gulden.modeling.wave.EnumDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see de.gulden.modeling.wave.EnumDirection
	 * @see #setDirection(EnumDirection)
	 * @see de.gulden.modeling.wave.WavePackage#getAssociationRelationship_Direction()
	 * @model
	 * @generated
	 */
	EnumDirection getDirection();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.AssociationRelationship#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see de.gulden.modeling.wave.EnumDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(EnumDirection value);

} // AssociationRelationship
