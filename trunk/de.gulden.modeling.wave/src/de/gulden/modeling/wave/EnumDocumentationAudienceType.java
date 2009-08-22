/**
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 *
 * $Id$
 */
package de.gulden.modeling.wave;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum Documentation Audience Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.gulden.modeling.wave.WavePackage#getEnumDocumentationAudienceType()
 * @model
 * @generated
 */
public enum EnumDocumentationAudienceType implements Enumerator {
	/**
	 * The '<em><b>DOCUMENTATION AUDIENCE DEVELOPER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENTATION_AUDIENCE_DEVELOPER_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENTATION_AUDIENCE_DEVELOPER(0, "DOCUMENTATION_AUDIENCE_DEVELOPER", "Developers"),

	/**
	 * The '<em><b>DOCUMENTATION AUDIENCE USER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENTATION_AUDIENCE_USER_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENTATION_AUDIENCE_USER(0, "DOCUMENTATION_AUDIENCE_USER", "Users");

	/**
	 * The '<em><b>DOCUMENTATION AUDIENCE DEVELOPER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOCUMENTATION AUDIENCE DEVELOPER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOCUMENTATION_AUDIENCE_DEVELOPER
	 * @model literal="Developers"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENTATION_AUDIENCE_DEVELOPER_VALUE = 0;

	/**
	 * The '<em><b>DOCUMENTATION AUDIENCE USER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOCUMENTATION AUDIENCE USER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOCUMENTATION_AUDIENCE_USER
	 * @model literal="Users"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENTATION_AUDIENCE_USER_VALUE = 0;

	/**
	 * An array of all the '<em><b>Enum Documentation Audience Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumDocumentationAudienceType[] VALUES_ARRAY =
		new EnumDocumentationAudienceType[] {
			DOCUMENTATION_AUDIENCE_DEVELOPER,
			DOCUMENTATION_AUDIENCE_USER,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Documentation Audience Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumDocumentationAudienceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Documentation Audience Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumDocumentationAudienceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumDocumentationAudienceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Documentation Audience Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumDocumentationAudienceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumDocumentationAudienceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Documentation Audience Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumDocumentationAudienceType get(int value) {
		switch (value) {
			case DOCUMENTATION_AUDIENCE_DEVELOPER_VALUE: return DOCUMENTATION_AUDIENCE_DEVELOPER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EnumDocumentationAudienceType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EnumDocumentationAudienceType
