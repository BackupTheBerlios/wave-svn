/**
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 *
 * $Id$
 */
package de.gulden.modeling.wave.impl;

import de.gulden.modeling.wave.Action;
import de.gulden.modeling.wave.EnumAjaxModes;
import de.gulden.modeling.wave.WavePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.gulden.modeling.wave.impl.ActionImpl#getAjaxMode <em>Ajax Mode</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.ActionImpl#getAjaxTarget <em>Ajax Target</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.ActionImpl#isConfirmExecute <em>Confirm Execute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends de.gulden.modeling.wave.impl.ActionImplBase implements Action {
	/**
	 * The default value of the '{@link #getAjaxMode() <em>Ajax Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAjaxMode()
	 * @generated
	 * @ordered
	 */
	protected static final EnumAjaxModes AJAX_MODE_EDEFAULT = EnumAjaxModes.AJAX_NO;

	/**
	 * The cached value of the '{@link #getAjaxMode() <em>Ajax Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAjaxMode()
	 * @generated
	 * @ordered
	 */
	protected EnumAjaxModes ajaxMode = AJAX_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAjaxTarget() <em>Ajax Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAjaxTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String AJAX_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAjaxTarget() <em>Ajax Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAjaxTarget()
	 * @generated
	 * @ordered
	 */
	protected String ajaxTarget = AJAX_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #isConfirmExecute() <em>Confirm Execute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConfirmExecute()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONFIRM_EXECUTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConfirmExecute() <em>Confirm Execute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConfirmExecute()
	 * @generated
	 * @ordered
	 */
	protected boolean confirmExecute = CONFIRM_EXECUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavePackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumAjaxModes getAjaxMode() {
		return ajaxMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAjaxMode(EnumAjaxModes newAjaxMode) {
		EnumAjaxModes oldAjaxMode = ajaxMode;
		ajaxMode = newAjaxMode == null ? AJAX_MODE_EDEFAULT : newAjaxMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.ACTION__AJAX_MODE, oldAjaxMode, ajaxMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAjaxTarget() {
		return ajaxTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAjaxTarget(String newAjaxTarget) {
		String oldAjaxTarget = ajaxTarget;
		ajaxTarget = newAjaxTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.ACTION__AJAX_TARGET, oldAjaxTarget, ajaxTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConfirmExecute() {
		return confirmExecute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfirmExecute(boolean newConfirmExecute) {
		boolean oldConfirmExecute = confirmExecute;
		confirmExecute = newConfirmExecute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.ACTION__CONFIRM_EXECUTE, oldConfirmExecute, confirmExecute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WavePackage.ACTION__AJAX_MODE:
				return getAjaxMode();
			case WavePackage.ACTION__AJAX_TARGET:
				return getAjaxTarget();
			case WavePackage.ACTION__CONFIRM_EXECUTE:
				return isConfirmExecute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WavePackage.ACTION__AJAX_MODE:
				setAjaxMode((EnumAjaxModes)newValue);
				return;
			case WavePackage.ACTION__AJAX_TARGET:
				setAjaxTarget((String)newValue);
				return;
			case WavePackage.ACTION__CONFIRM_EXECUTE:
				setConfirmExecute((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WavePackage.ACTION__AJAX_MODE:
				setAjaxMode(AJAX_MODE_EDEFAULT);
				return;
			case WavePackage.ACTION__AJAX_TARGET:
				setAjaxTarget(AJAX_TARGET_EDEFAULT);
				return;
			case WavePackage.ACTION__CONFIRM_EXECUTE:
				setConfirmExecute(CONFIRM_EXECUTE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WavePackage.ACTION__AJAX_MODE:
				return ajaxMode != AJAX_MODE_EDEFAULT;
			case WavePackage.ACTION__AJAX_TARGET:
				return AJAX_TARGET_EDEFAULT == null ? ajaxTarget != null : !AJAX_TARGET_EDEFAULT.equals(ajaxTarget);
			case WavePackage.ACTION__CONFIRM_EXECUTE:
				return confirmExecute != CONFIRM_EXECUTE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ajaxMode: ");
		result.append(ajaxMode);
		result.append(", ajaxTarget: ");
		result.append(ajaxTarget);
		result.append(", confirmExecute: ");
		result.append(confirmExecute);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
