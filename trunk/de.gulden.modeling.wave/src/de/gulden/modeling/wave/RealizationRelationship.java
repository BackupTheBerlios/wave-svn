/**
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realization Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gulden.modeling.wave.RealizationRelationship#getParentInterface <em>Parent Interface</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.RealizationRelationship#getImplementingClass <em>Implementing Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gulden.modeling.wave.WavePackage#getRealizationRelationship()
 * @model
 * @generated
 */
public interface RealizationRelationship extends TopLevelModelMember {
	/**
	 * Returns the value of the '<em><b>Parent Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Interface</em>' reference.
	 * @see #setParentInterface(Interface)
	 * @see de.gulden.modeling.wave.WavePackage#getRealizationRelationship_ParentInterface()
	 * @model required="true"
	 * @generated
	 */
	Interface getParentInterface();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.RealizationRelationship#getParentInterface <em>Parent Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Interface</em>' reference.
	 * @see #getParentInterface()
	 * @generated
	 */
	void setParentInterface(Interface value);

	/**
	 * Returns the value of the '<em><b>Implementing Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementing Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementing Class</em>' reference.
	 * @see #setImplementingClass(de.gulden.modeling.wave.Class)
	 * @see de.gulden.modeling.wave.WavePackage#getRealizationRelationship_ImplementingClass()
	 * @model required="true"
	 * @generated
	 */
	de.gulden.modeling.wave.Class getImplementingClass();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.RealizationRelationship#getImplementingClass <em>Implementing Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementing Class</em>' reference.
	 * @see #getImplementingClass()
	 * @generated
	 */
	void setImplementingClass(de.gulden.modeling.wave.Class value);

} // RealizationRelationship
