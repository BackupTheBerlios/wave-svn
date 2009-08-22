/**
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 *
 * $Id$
 */
package de.gulden.modeling.wave.impl;

import de.gulden.modeling.wave.AssociationRelationship;
import de.gulden.modeling.wave.EnumDirection;
import de.gulden.modeling.wave.EnumMultiplicity;
import de.gulden.modeling.wave.OOPClassifier;
import de.gulden.modeling.wave.WavePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.gulden.modeling.wave.impl.AssociationRelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.AssociationRelationshipImpl#getMultiplicityA <em>Multiplicity A</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.AssociationRelationshipImpl#getMultiplicityB <em>Multiplicity B</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.AssociationRelationshipImpl#getA <em>A</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.AssociationRelationshipImpl#getB <em>B</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.AssociationRelationshipImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationRelationshipImpl extends TopLevelModelMemberImpl implements AssociationRelationship {
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
	 * The default value of the '{@link #getMultiplicityA() <em>Multiplicity A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityA()
	 * @generated
	 * @ordered
	 */
	protected static final EnumMultiplicity MULTIPLICITY_A_EDEFAULT = EnumMultiplicity.ZERO_OR_ONE;

	/**
	 * The cached value of the '{@link #getMultiplicityA() <em>Multiplicity A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityA()
	 * @generated
	 * @ordered
	 */
	protected EnumMultiplicity multiplicityA = MULTIPLICITY_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicityB() <em>Multiplicity B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityB()
	 * @generated
	 * @ordered
	 */
	protected static final EnumMultiplicity MULTIPLICITY_B_EDEFAULT = EnumMultiplicity.ZERO_OR_ONE;

	/**
	 * The cached value of the '{@link #getMultiplicityB() <em>Multiplicity B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityB()
	 * @generated
	 * @ordered
	 */
	protected EnumMultiplicity multiplicityB = MULTIPLICITY_B_EDEFAULT;

	/**
	 * The cached value of the '{@link #getA() <em>A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected OOPClassifier a;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected OOPClassifier b;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final EnumDirection DIRECTION_EDEFAULT = EnumDirection.AB;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected EnumDirection direction = DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavePackage.Literals.ASSOCIATION_RELATIONSHIP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.ASSOCIATION_RELATIONSHIP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumMultiplicity getMultiplicityA() {
		return multiplicityA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicityA(EnumMultiplicity newMultiplicityA) {
		EnumMultiplicity oldMultiplicityA = multiplicityA;
		multiplicityA = newMultiplicityA == null ? MULTIPLICITY_A_EDEFAULT : newMultiplicityA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.ASSOCIATION_RELATIONSHIP__MULTIPLICITY_A, oldMultiplicityA, multiplicityA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumMultiplicity getMultiplicityB() {
		return multiplicityB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicityB(EnumMultiplicity newMultiplicityB) {
		EnumMultiplicity oldMultiplicityB = multiplicityB;
		multiplicityB = newMultiplicityB == null ? MULTIPLICITY_B_EDEFAULT : newMultiplicityB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.ASSOCIATION_RELATIONSHIP__MULTIPLICITY_B, oldMultiplicityB, multiplicityB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOPClassifier getA() {
		if (a != null && a.eIsProxy()) {
			InternalEObject oldA = (InternalEObject)a;
			a = (OOPClassifier)eResolveProxy(oldA);
			if (a != oldA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WavePackage.ASSOCIATION_RELATIONSHIP__A, oldA, a));
			}
		}
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOPClassifier basicGetA() {
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA(OOPClassifier newA) {
		OOPClassifier oldA = a;
		a = newA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.ASSOCIATION_RELATIONSHIP__A, oldA, a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOPClassifier getB() {
		if (b != null && b.eIsProxy()) {
			InternalEObject oldB = (InternalEObject)b;
			b = (OOPClassifier)eResolveProxy(oldB);
			if (b != oldB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WavePackage.ASSOCIATION_RELATIONSHIP__B, oldB, b));
			}
		}
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOPClassifier basicGetB() {
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB(OOPClassifier newB) {
		OOPClassifier oldB = b;
		b = newB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.ASSOCIATION_RELATIONSHIP__B, oldB, b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumDirection getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(EnumDirection newDirection) {
		EnumDirection oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.ASSOCIATION_RELATIONSHIP__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WavePackage.ASSOCIATION_RELATIONSHIP__NAME:
				return getName();
			case WavePackage.ASSOCIATION_RELATIONSHIP__MULTIPLICITY_A:
				return getMultiplicityA();
			case WavePackage.ASSOCIATION_RELATIONSHIP__MULTIPLICITY_B:
				return getMultiplicityB();
			case WavePackage.ASSOCIATION_RELATIONSHIP__A:
				if (resolve) return getA();
				return basicGetA();
			case WavePackage.ASSOCIATION_RELATIONSHIP__B:
				if (resolve) return getB();
				return basicGetB();
			case WavePackage.ASSOCIATION_RELATIONSHIP__DIRECTION:
				return getDirection();
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
			case WavePackage.ASSOCIATION_RELATIONSHIP__NAME:
				setName((String)newValue);
				return;
			case WavePackage.ASSOCIATION_RELATIONSHIP__MULTIPLICITY_A:
				setMultiplicityA((EnumMultiplicity)newValue);
				return;
			case WavePackage.ASSOCIATION_RELATIONSHIP__MULTIPLICITY_B:
				setMultiplicityB((EnumMultiplicity)newValue);
				return;
			case WavePackage.ASSOCIATION_RELATIONSHIP__A:
				setA((OOPClassifier)newValue);
				return;
			case WavePackage.ASSOCIATION_RELATIONSHIP__B:
				setB((OOPClassifier)newValue);
				return;
			case WavePackage.ASSOCIATION_RELATIONSHIP__DIRECTION:
				setDirection((EnumDirection)newValue);
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
			case WavePackage.ASSOCIATION_RELATIONSHIP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WavePackage.ASSOCIATION_RELATIONSHIP__MULTIPLICITY_A:
				setMultiplicityA(MULTIPLICITY_A_EDEFAULT);
				return;
			case WavePackage.ASSOCIATION_RELATIONSHIP__MULTIPLICITY_B:
				setMultiplicityB(MULTIPLICITY_B_EDEFAULT);
				return;
			case WavePackage.ASSOCIATION_RELATIONSHIP__A:
				setA((OOPClassifier)null);
				return;
			case WavePackage.ASSOCIATION_RELATIONSHIP__B:
				setB((OOPClassifier)null);
				return;
			case WavePackage.ASSOCIATION_RELATIONSHIP__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
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
			case WavePackage.ASSOCIATION_RELATIONSHIP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WavePackage.ASSOCIATION_RELATIONSHIP__MULTIPLICITY_A:
				return multiplicityA != MULTIPLICITY_A_EDEFAULT;
			case WavePackage.ASSOCIATION_RELATIONSHIP__MULTIPLICITY_B:
				return multiplicityB != MULTIPLICITY_B_EDEFAULT;
			case WavePackage.ASSOCIATION_RELATIONSHIP__A:
				return a != null;
			case WavePackage.ASSOCIATION_RELATIONSHIP__B:
				return b != null;
			case WavePackage.ASSOCIATION_RELATIONSHIP__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
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
		result.append(", multiplicityA: ");
		result.append(multiplicityA);
		result.append(", multiplicityB: ");
		result.append(multiplicityB);
		result.append(", direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //AssociationRelationshipImpl
