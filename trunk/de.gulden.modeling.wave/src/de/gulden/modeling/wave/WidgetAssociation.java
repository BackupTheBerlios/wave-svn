/**
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 *
 * $Id$
 */
package de.gulden.modeling.wave;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gulden.modeling.wave.WidgetAssociation#getAssociation <em>Association</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.WidgetAssociation#getElementsMenuActions <em>Elements Menu Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gulden.modeling.wave.WavePackage#getWidgetAssociation()
 * @model
 * @generated
 */
public interface WidgetAssociation extends Widget {
	/**
	 * Returns the value of the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' reference.
	 * @see #setAssociation(AssociationRelationship)
	 * @see de.gulden.modeling.wave.WavePackage#getWidgetAssociation_Association()
	 * @model required="true"
	 * @generated
	 */
	AssociationRelationship getAssociation();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.WidgetAssociation#getAssociation <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(AssociationRelationship value);

	/**
	 * Returns the value of the '<em><b>Elements Menu Actions</b></em>' reference list.
	 * The list contents are of type {@link de.gulden.modeling.wave.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements Menu Actions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements Menu Actions</em>' reference list.
	 * @see de.gulden.modeling.wave.WavePackage#getWidgetAssociation_ElementsMenuActions()
	 * @model
	 * @generated
	 */
	EList<Action> getElementsMenuActions();

} // WidgetAssociation
