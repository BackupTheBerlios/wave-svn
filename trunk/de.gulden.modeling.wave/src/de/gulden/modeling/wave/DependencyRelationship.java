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
 * A representation of the model object '<em><b>Dependency Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gulden.modeling.wave.DependencyRelationship#getClient <em>Client</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.DependencyRelationship#getSupplier <em>Supplier</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gulden.modeling.wave.WavePackage#getDependencyRelationship()
 * @model
 * @generated
 */
public interface DependencyRelationship extends TopLevelModelMember {
	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference.
	 * @see #setClient(ModelMember)
	 * @see de.gulden.modeling.wave.WavePackage#getDependencyRelationship_Client()
	 * @model required="true"
	 * @generated
	 */
	ModelMember getClient();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.DependencyRelationship#getClient <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(ModelMember value);

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier</em>' reference.
	 * @see #setSupplier(ModelMember)
	 * @see de.gulden.modeling.wave.WavePackage#getDependencyRelationship_Supplier()
	 * @model required="true"
	 * @generated
	 */
	ModelMember getSupplier();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.DependencyRelationship#getSupplier <em>Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier</em>' reference.
	 * @see #getSupplier()
	 * @generated
	 */
	void setSupplier(ModelMember value);

} // DependencyRelationship
