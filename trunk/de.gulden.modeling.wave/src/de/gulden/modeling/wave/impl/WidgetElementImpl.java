/**
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 *
 * $Id$
 */
package de.gulden.modeling.wave.impl;

import de.gulden.modeling.wave.WavePackage;
import de.gulden.modeling.wave.WidgetElement;
import de.gulden.modeling.wave.WidgetOption;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.gulden.modeling.wave.impl.WidgetElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.WidgetElementImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.WidgetElementImpl#getMultiOptions <em>Multi Options</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WidgetElementImpl extends EObjectImpl implements WidgetElement {
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
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<WidgetOption> options;

	/**
	 * The cached value of the '{@link #getMultiOptions() <em>Multi Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<WidgetOption> multiOptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavePackage.Literals.WIDGET_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.WIDGET_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WidgetOption> getOptions() {
		if (options == null) {
			options = new EObjectContainmentEList<WidgetOption>(WidgetOption.class, this, WavePackage.WIDGET_ELEMENT__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WidgetOption> getMultiOptions() {
		if (multiOptions == null) {
			multiOptions = new EObjectContainmentEList<WidgetOption>(WidgetOption.class, this, WavePackage.WIDGET_ELEMENT__MULTI_OPTIONS);
		}
		return multiOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WavePackage.WIDGET_ELEMENT__OPTIONS:
				return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
			case WavePackage.WIDGET_ELEMENT__MULTI_OPTIONS:
				return ((InternalEList<?>)getMultiOptions()).basicRemove(otherEnd, msgs);
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
			case WavePackage.WIDGET_ELEMENT__NAME:
				return getName();
			case WavePackage.WIDGET_ELEMENT__OPTIONS:
				return getOptions();
			case WavePackage.WIDGET_ELEMENT__MULTI_OPTIONS:
				return getMultiOptions();
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
			case WavePackage.WIDGET_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case WavePackage.WIDGET_ELEMENT__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends WidgetOption>)newValue);
				return;
			case WavePackage.WIDGET_ELEMENT__MULTI_OPTIONS:
				getMultiOptions().clear();
				getMultiOptions().addAll((Collection<? extends WidgetOption>)newValue);
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
			case WavePackage.WIDGET_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WavePackage.WIDGET_ELEMENT__OPTIONS:
				getOptions().clear();
				return;
			case WavePackage.WIDGET_ELEMENT__MULTI_OPTIONS:
				getMultiOptions().clear();
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
			case WavePackage.WIDGET_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WavePackage.WIDGET_ELEMENT__OPTIONS:
				return options != null && !options.isEmpty();
			case WavePackage.WIDGET_ELEMENT__MULTI_OPTIONS:
				return multiOptions != null && !multiOptions.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //WidgetElementImpl
