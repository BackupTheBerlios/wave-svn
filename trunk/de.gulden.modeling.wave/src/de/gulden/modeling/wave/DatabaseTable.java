/**
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gulden.modeling.wave.DatabaseTable#getName <em>Name</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.DatabaseTable#getSqlCreate <em>Sql Create</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gulden.modeling.wave.WavePackage#getDatabaseTable()
 * @model
 * @generated
 */
public interface DatabaseTable extends TopLevelModelMember {
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
	 * @see de.gulden.modeling.wave.WavePackage#getDatabaseTable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.DatabaseTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sql Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql Create</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql Create</em>' attribute.
	 * @see #setSqlCreate(String)
	 * @see de.gulden.modeling.wave.WavePackage#getDatabaseTable_SqlCreate()
	 * @model
	 * @generated
	 */
	String getSqlCreate();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.DatabaseTable#getSqlCreate <em>Sql Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sql Create</em>' attribute.
	 * @see #getSqlCreate()
	 * @generated
	 */
	void setSqlCreate(String value);

} // DatabaseTable
