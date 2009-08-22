/**
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 *
 * $Id$
 */
package de.gulden.modeling.wave.impl;

import de.gulden.modeling.wave.ClassifierMember;
import de.gulden.modeling.wave.EnumTargetModes;
import de.gulden.modeling.wave.EnumVisibility;
import de.gulden.modeling.wave.WavePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.gulden.modeling.wave.impl.ClassifierMemberImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.ClassifierMemberImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.ClassifierMemberImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.ClassifierMemberImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.ClassifierMemberImpl#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.ClassifierMemberImpl#getTargetMode <em>Target Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassifierMemberImpl extends ModelMemberImpl implements ClassifierMember {
	/**
	 * The default value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected String signature = SIGNATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final EnumVisibility VISIBILITY_EDEFAULT = EnumVisibility.PUBLIC;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected EnumVisibility visibility = VISIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean isStatic = IS_STATIC_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean isFinal = IS_FINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetMode() <em>Target Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMode()
	 * @generated
	 * @ordered
	 */
	protected static final EnumTargetModes TARGET_MODE_EDEFAULT = EnumTargetModes.SERVER;

	/**
	 * The cached value of the '{@link #getTargetMode() <em>Target Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMode()
	 * @generated
	 * @ordered
	 */
	protected EnumTargetModes targetMode = TARGET_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavePackage.Literals.CLASSIFIER_MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(String newSignature) {
		String oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.CLASSIFIER_MEMBER__SIGNATURE, oldSignature, signature));
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.CLASSIFIER_MEMBER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumVisibility getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(EnumVisibility newVisibility) {
		EnumVisibility oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.CLASSIFIER_MEMBER__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStatic() {
		return isStatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStatic(boolean newIsStatic) {
		boolean oldIsStatic = isStatic;
		isStatic = newIsStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.CLASSIFIER_MEMBER__IS_STATIC, oldIsStatic, isStatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFinal() {
		return isFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFinal(boolean newIsFinal) {
		boolean oldIsFinal = isFinal;
		isFinal = newIsFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.CLASSIFIER_MEMBER__IS_FINAL, oldIsFinal, isFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumTargetModes getTargetMode() {
		return targetMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetMode(EnumTargetModes newTargetMode) {
		EnumTargetModes oldTargetMode = targetMode;
		targetMode = newTargetMode == null ? TARGET_MODE_EDEFAULT : newTargetMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.CLASSIFIER_MEMBER__TARGET_MODE, oldTargetMode, targetMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WavePackage.CLASSIFIER_MEMBER__SIGNATURE:
				return getSignature();
			case WavePackage.CLASSIFIER_MEMBER__NAME:
				return getName();
			case WavePackage.CLASSIFIER_MEMBER__VISIBILITY:
				return getVisibility();
			case WavePackage.CLASSIFIER_MEMBER__IS_STATIC:
				return isIsStatic() ? Boolean.TRUE : Boolean.FALSE;
			case WavePackage.CLASSIFIER_MEMBER__IS_FINAL:
				return isIsFinal() ? Boolean.TRUE : Boolean.FALSE;
			case WavePackage.CLASSIFIER_MEMBER__TARGET_MODE:
				return getTargetMode();
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
			case WavePackage.CLASSIFIER_MEMBER__SIGNATURE:
				setSignature((String)newValue);
				return;
			case WavePackage.CLASSIFIER_MEMBER__NAME:
				setName((String)newValue);
				return;
			case WavePackage.CLASSIFIER_MEMBER__VISIBILITY:
				setVisibility((EnumVisibility)newValue);
				return;
			case WavePackage.CLASSIFIER_MEMBER__IS_STATIC:
				setIsStatic(((Boolean)newValue).booleanValue());
				return;
			case WavePackage.CLASSIFIER_MEMBER__IS_FINAL:
				setIsFinal(((Boolean)newValue).booleanValue());
				return;
			case WavePackage.CLASSIFIER_MEMBER__TARGET_MODE:
				setTargetMode((EnumTargetModes)newValue);
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
			case WavePackage.CLASSIFIER_MEMBER__SIGNATURE:
				setSignature(SIGNATURE_EDEFAULT);
				return;
			case WavePackage.CLASSIFIER_MEMBER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WavePackage.CLASSIFIER_MEMBER__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case WavePackage.CLASSIFIER_MEMBER__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case WavePackage.CLASSIFIER_MEMBER__IS_FINAL:
				setIsFinal(IS_FINAL_EDEFAULT);
				return;
			case WavePackage.CLASSIFIER_MEMBER__TARGET_MODE:
				setTargetMode(TARGET_MODE_EDEFAULT);
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
			case WavePackage.CLASSIFIER_MEMBER__SIGNATURE:
				return SIGNATURE_EDEFAULT == null ? signature != null : !SIGNATURE_EDEFAULT.equals(signature);
			case WavePackage.CLASSIFIER_MEMBER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WavePackage.CLASSIFIER_MEMBER__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case WavePackage.CLASSIFIER_MEMBER__IS_STATIC:
				return isStatic != IS_STATIC_EDEFAULT;
			case WavePackage.CLASSIFIER_MEMBER__IS_FINAL:
				return isFinal != IS_FINAL_EDEFAULT;
			case WavePackage.CLASSIFIER_MEMBER__TARGET_MODE:
				return targetMode != TARGET_MODE_EDEFAULT;
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
		result.append(" (signature: ");
		result.append(signature);
		result.append(", name: ");
		result.append(name);
		result.append(", visibility: ");
		result.append(visibility);
		result.append(", isStatic: ");
		result.append(isStatic);
		result.append(", isFinal: ");
		result.append(isFinal);
		result.append(", targetMode: ");
		result.append(targetMode);
		result.append(')');
		return result.toString();
	}

} //ClassifierMemberImpl
