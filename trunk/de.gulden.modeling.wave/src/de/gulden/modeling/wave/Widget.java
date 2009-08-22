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
 * A representation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gulden.modeling.wave.Widget#getWidgetType <em>Widget Type</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.Widget#getWidgetHint <em>Widget Hint</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.Widget#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.Widget#isRequired <em>Required</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.Widget#isIgnore <em>Ignore</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.Widget#getFilters <em>Filters</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.Widget#getValidators <em>Validators</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.Widget#getOptions <em>Options</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.Widget#getMenuActions <em>Menu Actions</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.Widget#getElementFormName <em>Element Form Name</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.Widget#isMultiLine <em>Multi Line</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.Widget#isMultiChoice <em>Multi Choice</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gulden.modeling.wave.WavePackage#getWidget()
 * @model abstract="true"
 * @generated
 */
public interface Widget extends ModelMember {
	/**
	 * Returns the value of the '<em><b>Widget Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link de.gulden.modeling.wave.EnumWidgetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widget Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widget Type</em>' attribute.
	 * @see de.gulden.modeling.wave.EnumWidgetType
	 * @see #setWidgetType(EnumWidgetType)
	 * @see de.gulden.modeling.wave.WavePackage#getWidget_WidgetType()
	 * @model default=""
	 * @generated
	 */
	EnumWidgetType getWidgetType();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.Widget#getWidgetType <em>Widget Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Widget Type</em>' attribute.
	 * @see de.gulden.modeling.wave.EnumWidgetType
	 * @see #getWidgetType()
	 * @generated
	 */
	void setWidgetType(EnumWidgetType value);

	/**
	 * Returns the value of the '<em><b>Widget Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widget Hint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widget Hint</em>' attribute.
	 * @see #setWidgetHint(String)
	 * @see de.gulden.modeling.wave.WavePackage#getWidget_WidgetHint()
	 * @model
	 * @generated
	 */
	String getWidgetHint();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.Widget#getWidgetHint <em>Widget Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Widget Hint</em>' attribute.
	 * @see #getWidgetHint()
	 * @generated
	 */
	void setWidgetHint(String value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(boolean)
	 * @see de.gulden.modeling.wave.WavePackage#getWidget_ReadOnly()
	 * @model
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.Widget#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see de.gulden.modeling.wave.WavePackage#getWidget_Required()
	 * @model
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.Widget#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Ignore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore</em>' attribute.
	 * @see #setIgnore(boolean)
	 * @see de.gulden.modeling.wave.WavePackage#getWidget_Ignore()
	 * @model
	 * @generated
	 */
	boolean isIgnore();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.Widget#isIgnore <em>Ignore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore</em>' attribute.
	 * @see #isIgnore()
	 * @generated
	 */
	void setIgnore(boolean value);

	/**
	 * Returns the value of the '<em><b>Filters</b></em>' containment reference list.
	 * The list contents are of type {@link de.gulden.modeling.wave.WidgetElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' containment reference list.
	 * @see de.gulden.modeling.wave.WavePackage#getWidget_Filters()
	 * @model containment="true"
	 * @generated
	 */
	EList<WidgetElement> getFilters();

	/**
	 * Returns the value of the '<em><b>Validators</b></em>' containment reference list.
	 * The list contents are of type {@link de.gulden.modeling.wave.WidgetElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validators</em>' containment reference list.
	 * @see de.gulden.modeling.wave.WavePackage#getWidget_Validators()
	 * @model containment="true"
	 * @generated
	 */
	EList<WidgetElement> getValidators();

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link de.gulden.modeling.wave.WidgetOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see de.gulden.modeling.wave.WavePackage#getWidget_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<WidgetOption> getOptions();

	/**
	 * Returns the value of the '<em><b>Menu Actions</b></em>' reference list.
	 * The list contents are of type {@link de.gulden.modeling.wave.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu Actions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu Actions</em>' reference list.
	 * @see de.gulden.modeling.wave.WavePackage#getWidget_MenuActions()
	 * @model
	 * @generated
	 */
	EList<Action> getMenuActions();

	/**
	 * Returns the value of the '<em><b>Element Form Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Form Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Form Name</em>' attribute.
	 * @see #setElementFormName(String)
	 * @see de.gulden.modeling.wave.WavePackage#getWidget_ElementFormName()
	 * @model
	 * @generated
	 */
	String getElementFormName();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.Widget#getElementFormName <em>Element Form Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Form Name</em>' attribute.
	 * @see #getElementFormName()
	 * @generated
	 */
	void setElementFormName(String value);

	/**
	 * Returns the value of the '<em><b>Multi Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Line</em>' attribute.
	 * @see #setMultiLine(boolean)
	 * @see de.gulden.modeling.wave.WavePackage#getWidget_MultiLine()
	 * @model
	 * @generated
	 */
	boolean isMultiLine();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.Widget#isMultiLine <em>Multi Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Line</em>' attribute.
	 * @see #isMultiLine()
	 * @generated
	 */
	void setMultiLine(boolean value);

	/**
	 * Returns the value of the '<em><b>Multi Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Choice</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Choice</em>' attribute.
	 * @see #setMultiChoice(boolean)
	 * @see de.gulden.modeling.wave.WavePackage#getWidget_MultiChoice()
	 * @model
	 * @generated
	 */
	boolean isMultiChoice();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.Widget#isMultiChoice <em>Multi Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Choice</em>' attribute.
	 * @see #isMultiChoice()
	 * @generated
	 */
	void setMultiChoice(boolean value);

} // Widget
