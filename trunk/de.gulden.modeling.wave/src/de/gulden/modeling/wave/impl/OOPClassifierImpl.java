/**
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.impl;

import de.gulden.modeling.wave.EnumVisibility;
import de.gulden.modeling.wave.OOPClassifier;
import de.gulden.modeling.wave.WavePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OOP Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.gulden.modeling.wave.impl.OOPClassifierImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.OOPClassifierImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.OOPClassifierImpl#getExternalExtends <em>External Extends</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.OOPClassifierImpl#getExternalImplements <em>External Implements</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.OOPClassifierImpl#getInner <em>Inner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class OOPClassifierImpl extends ClassifierImpl implements OOPClassifier {
	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

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
	 * The default value of the '{@link #getExternalExtends() <em>External Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalExtends()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_EXTENDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalExtends() <em>External Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalExtends()
	 * @generated
	 * @ordered
	 */
	protected String externalExtends = EXTERNAL_EXTENDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalImplements() <em>External Implements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalImplements()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_IMPLEMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalImplements() <em>External Implements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalImplements()
	 * @generated
	 * @ordered
	 */
	protected String externalImplements = EXTERNAL_IMPLEMENTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInner() <em>Inner</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInner()
	 * @generated
	 * @ordered
	 */
	protected EList<OOPClassifier> inner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OOPClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavePackage.Literals.OOP_CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.OOP_CLASSIFIER__IS_ABSTRACT, oldIsAbstract, isAbstract));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.OOP_CLASSIFIER__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalExtends() {
		return externalExtends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalExtends(String newExternalExtends) {
		String oldExternalExtends = externalExtends;
		externalExtends = newExternalExtends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.OOP_CLASSIFIER__EXTERNAL_EXTENDS, oldExternalExtends, externalExtends));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalImplements() {
		return externalImplements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalImplements(String newExternalImplements) {
		String oldExternalImplements = externalImplements;
		externalImplements = newExternalImplements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.OOP_CLASSIFIER__EXTERNAL_IMPLEMENTS, oldExternalImplements, externalImplements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OOPClassifier> getInner() {
		if (inner == null) {
			inner = new EObjectContainmentEList<OOPClassifier>(OOPClassifier.class, this, WavePackage.OOP_CLASSIFIER__INNER);
		}
		return inner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WavePackage.OOP_CLASSIFIER__INNER:
				return ((InternalEList<?>)getInner()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WavePackage.OOP_CLASSIFIER__IS_ABSTRACT:
				return isIsAbstract();
			case WavePackage.OOP_CLASSIFIER__VISIBILITY:
				return getVisibility();
			case WavePackage.OOP_CLASSIFIER__EXTERNAL_EXTENDS:
				return getExternalExtends();
			case WavePackage.OOP_CLASSIFIER__EXTERNAL_IMPLEMENTS:
				return getExternalImplements();
			case WavePackage.OOP_CLASSIFIER__INNER:
				return getInner();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WavePackage.OOP_CLASSIFIER__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case WavePackage.OOP_CLASSIFIER__VISIBILITY:
				setVisibility((EnumVisibility)newValue);
				return;
			case WavePackage.OOP_CLASSIFIER__EXTERNAL_EXTENDS:
				setExternalExtends((String)newValue);
				return;
			case WavePackage.OOP_CLASSIFIER__EXTERNAL_IMPLEMENTS:
				setExternalImplements((String)newValue);
				return;
			case WavePackage.OOP_CLASSIFIER__INNER:
				getInner().clear();
				getInner().addAll((Collection<? extends OOPClassifier>)newValue);
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
			case WavePackage.OOP_CLASSIFIER__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case WavePackage.OOP_CLASSIFIER__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case WavePackage.OOP_CLASSIFIER__EXTERNAL_EXTENDS:
				setExternalExtends(EXTERNAL_EXTENDS_EDEFAULT);
				return;
			case WavePackage.OOP_CLASSIFIER__EXTERNAL_IMPLEMENTS:
				setExternalImplements(EXTERNAL_IMPLEMENTS_EDEFAULT);
				return;
			case WavePackage.OOP_CLASSIFIER__INNER:
				getInner().clear();
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
			case WavePackage.OOP_CLASSIFIER__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case WavePackage.OOP_CLASSIFIER__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case WavePackage.OOP_CLASSIFIER__EXTERNAL_EXTENDS:
				return EXTERNAL_EXTENDS_EDEFAULT == null ? externalExtends != null : !EXTERNAL_EXTENDS_EDEFAULT.equals(externalExtends);
			case WavePackage.OOP_CLASSIFIER__EXTERNAL_IMPLEMENTS:
				return EXTERNAL_IMPLEMENTS_EDEFAULT == null ? externalImplements != null : !EXTERNAL_IMPLEMENTS_EDEFAULT.equals(externalImplements);
			case WavePackage.OOP_CLASSIFIER__INNER:
				return inner != null && !inner.isEmpty();
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
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(", visibility: ");
		result.append(visibility);
		result.append(", externalExtends: ");
		result.append(externalExtends);
		result.append(", externalImplements: ");
		result.append(externalImplements);
		result.append(')');
		return result.toString();
	}

} //OOPClassifierImpl
