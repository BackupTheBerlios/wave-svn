/**
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gulden.modeling.wave.Action#getAjaxMode <em>Ajax Mode</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.Action#getAjaxTarget <em>Ajax Target</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.Action#isConfirmExecute <em>Confirm Execute</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gulden.modeling.wave.WavePackage#getAction()
 * @model
 * @generated
 */
public interface Action extends ControllerMemberExecutable {
	/**
	 * Returns the value of the '<em><b>Ajax Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link de.gulden.modeling.wave.EnumAjaxModes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ajax Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ajax Mode</em>' attribute.
	 * @see de.gulden.modeling.wave.EnumAjaxModes
	 * @see #setAjaxMode(EnumAjaxModes)
	 * @see de.gulden.modeling.wave.WavePackage#getAction_AjaxMode()
	 * @model
	 * @generated
	 */
	EnumAjaxModes getAjaxMode();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.Action#getAjaxMode <em>Ajax Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ajax Mode</em>' attribute.
	 * @see de.gulden.modeling.wave.EnumAjaxModes
	 * @see #getAjaxMode()
	 * @generated
	 */
	void setAjaxMode(EnumAjaxModes value);

	/**
	 * Returns the value of the '<em><b>Ajax Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ajax Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ajax Target</em>' attribute.
	 * @see #setAjaxTarget(String)
	 * @see de.gulden.modeling.wave.WavePackage#getAction_AjaxTarget()
	 * @model
	 * @generated
	 */
	String getAjaxTarget();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.Action#getAjaxTarget <em>Ajax Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ajax Target</em>' attribute.
	 * @see #getAjaxTarget()
	 * @generated
	 */
	void setAjaxTarget(String value);

	/**
	 * Returns the value of the '<em><b>Confirm Execute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confirm Execute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirm Execute</em>' attribute.
	 * @see #setConfirmExecute(boolean)
	 * @see de.gulden.modeling.wave.WavePackage#getAction_ConfirmExecute()
	 * @model
	 * @generated
	 */
	boolean isConfirmExecute();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.Action#isConfirmExecute <em>Confirm Execute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirm Execute</em>' attribute.
	 * @see #isConfirmExecute()
	 * @generated
	 */
	void setConfirmExecute(boolean value);

} // Action
