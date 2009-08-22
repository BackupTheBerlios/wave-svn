/**
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 *
 * $Id$
 */
package de.gulden.modeling.wave.impl;

import de.gulden.modeling.wave.Interface;
import de.gulden.modeling.wave.RealizationRelationship;
import de.gulden.modeling.wave.WavePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Realization Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.gulden.modeling.wave.impl.RealizationRelationshipImpl#getParentInterface <em>Parent Interface</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.RealizationRelationshipImpl#getImplementingClass <em>Implementing Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RealizationRelationshipImpl extends TopLevelModelMemberImpl implements RealizationRelationship {
	/**
	 * The cached value of the '{@link #getParentInterface() <em>Parent Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentInterface()
	 * @generated
	 * @ordered
	 */
	protected Interface parentInterface;

	/**
	 * The cached value of the '{@link #getImplementingClass() <em>Implementing Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementingClass()
	 * @generated
	 * @ordered
	 */
	protected de.gulden.modeling.wave.Class implementingClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealizationRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavePackage.Literals.REALIZATION_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getParentInterface() {
		if (parentInterface != null && parentInterface.eIsProxy()) {
			InternalEObject oldParentInterface = (InternalEObject)parentInterface;
			parentInterface = (Interface)eResolveProxy(oldParentInterface);
			if (parentInterface != oldParentInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WavePackage.REALIZATION_RELATIONSHIP__PARENT_INTERFACE, oldParentInterface, parentInterface));
			}
		}
		return parentInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetParentInterface() {
		return parentInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentInterface(Interface newParentInterface) {
		Interface oldParentInterface = parentInterface;
		parentInterface = newParentInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.REALIZATION_RELATIONSHIP__PARENT_INTERFACE, oldParentInterface, parentInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.gulden.modeling.wave.Class getImplementingClass() {
		if (implementingClass != null && implementingClass.eIsProxy()) {
			InternalEObject oldImplementingClass = (InternalEObject)implementingClass;
			implementingClass = (de.gulden.modeling.wave.Class)eResolveProxy(oldImplementingClass);
			if (implementingClass != oldImplementingClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WavePackage.REALIZATION_RELATIONSHIP__IMPLEMENTING_CLASS, oldImplementingClass, implementingClass));
			}
		}
		return implementingClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.gulden.modeling.wave.Class basicGetImplementingClass() {
		return implementingClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementingClass(de.gulden.modeling.wave.Class newImplementingClass) {
		de.gulden.modeling.wave.Class oldImplementingClass = implementingClass;
		implementingClass = newImplementingClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.REALIZATION_RELATIONSHIP__IMPLEMENTING_CLASS, oldImplementingClass, implementingClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WavePackage.REALIZATION_RELATIONSHIP__PARENT_INTERFACE:
				if (resolve) return getParentInterface();
				return basicGetParentInterface();
			case WavePackage.REALIZATION_RELATIONSHIP__IMPLEMENTING_CLASS:
				if (resolve) return getImplementingClass();
				return basicGetImplementingClass();
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
			case WavePackage.REALIZATION_RELATIONSHIP__PARENT_INTERFACE:
				setParentInterface((Interface)newValue);
				return;
			case WavePackage.REALIZATION_RELATIONSHIP__IMPLEMENTING_CLASS:
				setImplementingClass((de.gulden.modeling.wave.Class)newValue);
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
			case WavePackage.REALIZATION_RELATIONSHIP__PARENT_INTERFACE:
				setParentInterface((Interface)null);
				return;
			case WavePackage.REALIZATION_RELATIONSHIP__IMPLEMENTING_CLASS:
				setImplementingClass((de.gulden.modeling.wave.Class)null);
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
			case WavePackage.REALIZATION_RELATIONSHIP__PARENT_INTERFACE:
				return parentInterface != null;
			case WavePackage.REALIZATION_RELATIONSHIP__IMPLEMENTING_CLASS:
				return implementingClass != null;
		}
		return super.eIsSet(featureID);
	}

} //RealizationRelationshipImpl
