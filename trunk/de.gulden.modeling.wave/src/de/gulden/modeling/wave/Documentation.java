/**
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gulden.modeling.wave.Documentation#getText <em>Text</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.Documentation#getAudience <em>Audience</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.Documentation#getDetailLevel <em>Detail Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gulden.modeling.wave.WavePackage#getDocumentation()
 * @model
 * @generated
 */
public interface Documentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see de.gulden.modeling.wave.WavePackage#getDocumentation_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.Documentation#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Audience</b></em>' attribute.
	 * The literals are from the enumeration {@link de.gulden.modeling.wave.EnumDocumentationAudienceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audience</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audience</em>' attribute.
	 * @see de.gulden.modeling.wave.EnumDocumentationAudienceType
	 * @see #setAudience(EnumDocumentationAudienceType)
	 * @see de.gulden.modeling.wave.WavePackage#getDocumentation_Audience()
	 * @model
	 * @generated
	 */
	EnumDocumentationAudienceType getAudience();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.Documentation#getAudience <em>Audience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audience</em>' attribute.
	 * @see de.gulden.modeling.wave.EnumDocumentationAudienceType
	 * @see #getAudience()
	 * @generated
	 */
	void setAudience(EnumDocumentationAudienceType value);

	/**
	 * Returns the value of the '<em><b>Detail Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail Level</em>' attribute.
	 * @see #setDetailLevel(int)
	 * @see de.gulden.modeling.wave.WavePackage#getDocumentation_DetailLevel()
	 * @model
	 * @generated
	 */
	int getDetailLevel();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.Documentation#getDetailLevel <em>Detail Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail Level</em>' attribute.
	 * @see #getDetailLevel()
	 * @generated
	 */
	void setDetailLevel(int value);

} // Documentation
