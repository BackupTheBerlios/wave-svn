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
 * A representation of the literals of the enumeration '<em><b>Enum Label Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.gulden.modeling.wave.WavePackage#getEnumLabelMode()
 * @model
 * @generated
 */
public enum EnumLabelMode implements Enumerator {
	/**
	 * The '<em><b>ICON OR TEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICON_OR_TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	ICON_OR_TEXT(0, "ICON_OR_TEXT", "ICON_OR_TEXT"),

	/**
	 * The '<em><b>ICON AND TEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICON_AND_TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	ICON_AND_TEXT(1, "ICON_AND_TEXT", "ICON_AND_TEXT");

	/**
	 * The '<em><b>ICON OR TEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ICON OR TEXT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ICON_OR_TEXT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ICON_OR_TEXT_VALUE = 0;

	/**
	 * The '<em><b>ICON AND TEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ICON AND TEXT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ICON_AND_TEXT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ICON_AND_TEXT_VALUE = 1;

	/**
	 * An array of all the '<em><b>Enum Label Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumLabelMode[] VALUES_ARRAY =
		new EnumLabelMode[] {
			ICON_OR_TEXT,
			ICON_AND_TEXT,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Label Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumLabelMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Label Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumLabelMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumLabelMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Label Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumLabelMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumLabelMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Label Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumLabelMode get(int value) {
		switch (value) {
			case ICON_OR_TEXT_VALUE: return ICON_OR_TEXT;
			case ICON_AND_TEXT_VALUE: return ICON_AND_TEXT;
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
	private EnumLabelMode(int value, String name, String literal) {
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
	
} //EnumLabelMode
