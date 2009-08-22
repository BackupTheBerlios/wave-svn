/**
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 *
 * $Id$
 */
package de.gulden.modeling.wave.impl;

import de.gulden.modeling.wave.Documentation;
import de.gulden.modeling.wave.EnumDocumentationAudienceType;
import de.gulden.modeling.wave.WavePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.gulden.modeling.wave.impl.DocumentationImpl#getText <em>Text</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.DocumentationImpl#getAudience <em>Audience</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.DocumentationImpl#getDetailLevel <em>Detail Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentationImpl extends EObjectImpl implements Documentation {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAudience() <em>Audience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudience()
	 * @generated
	 * @ordered
	 */
	protected static final EnumDocumentationAudienceType AUDIENCE_EDEFAULT = EnumDocumentationAudienceType.DOCUMENTATION_AUDIENCE_DEVELOPER;

	/**
	 * The cached value of the '{@link #getAudience() <em>Audience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudience()
	 * @generated
	 * @ordered
	 */
	protected EnumDocumentationAudienceType audience = AUDIENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDetailLevel() <em>Detail Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int DETAIL_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDetailLevel() <em>Detail Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailLevel()
	 * @generated
	 * @ordered
	 */
	protected int detailLevel = DETAIL_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavePackage.Literals.DOCUMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.DOCUMENTATION__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumDocumentationAudienceType getAudience() {
		return audience;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAudience(EnumDocumentationAudienceType newAudience) {
		EnumDocumentationAudienceType oldAudience = audience;
		audience = newAudience == null ? AUDIENCE_EDEFAULT : newAudience;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.DOCUMENTATION__AUDIENCE, oldAudience, audience));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDetailLevel() {
		return detailLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetailLevel(int newDetailLevel) {
		int oldDetailLevel = detailLevel;
		detailLevel = newDetailLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.DOCUMENTATION__DETAIL_LEVEL, oldDetailLevel, detailLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WavePackage.DOCUMENTATION__TEXT:
				return getText();
			case WavePackage.DOCUMENTATION__AUDIENCE:
				return getAudience();
			case WavePackage.DOCUMENTATION__DETAIL_LEVEL:
				return new Integer(getDetailLevel());
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
			case WavePackage.DOCUMENTATION__TEXT:
				setText((String)newValue);
				return;
			case WavePackage.DOCUMENTATION__AUDIENCE:
				setAudience((EnumDocumentationAudienceType)newValue);
				return;
			case WavePackage.DOCUMENTATION__DETAIL_LEVEL:
				setDetailLevel(((Integer)newValue).intValue());
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
			case WavePackage.DOCUMENTATION__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case WavePackage.DOCUMENTATION__AUDIENCE:
				setAudience(AUDIENCE_EDEFAULT);
				return;
			case WavePackage.DOCUMENTATION__DETAIL_LEVEL:
				setDetailLevel(DETAIL_LEVEL_EDEFAULT);
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
			case WavePackage.DOCUMENTATION__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case WavePackage.DOCUMENTATION__AUDIENCE:
				return audience != AUDIENCE_EDEFAULT;
			case WavePackage.DOCUMENTATION__DETAIL_LEVEL:
				return detailLevel != DETAIL_LEVEL_EDEFAULT;
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
		result.append(" (text: ");
		result.append(text);
		result.append(", audience: ");
		result.append(audience);
		result.append(", detailLevel: ");
		result.append(detailLevel);
		result.append(')');
		return result.toString();
	}

} //DocumentationImpl
