/**
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inheritance Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gulden.modeling.wave.InheritanceRelationship#getParent <em>Parent</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.InheritanceRelationship#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gulden.modeling.wave.WavePackage#getInheritanceRelationship()
 * @model
 * @generated
 */
public interface InheritanceRelationship extends TopLevelModelMember {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Classifier)
	 * @see de.gulden.modeling.wave.WavePackage#getInheritanceRelationship_Parent()
	 * @model required="true"
	 * @generated
	 */
	Classifier getParent();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.InheritanceRelationship#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Classifier value);

	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference.
	 * @see #setChild(Classifier)
	 * @see de.gulden.modeling.wave.WavePackage#getInheritanceRelationship_Child()
	 * @model required="true"
	 * @generated
	 */
	Classifier getChild();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.InheritanceRelationship#getChild <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(Classifier value);

} // InheritanceRelationship
