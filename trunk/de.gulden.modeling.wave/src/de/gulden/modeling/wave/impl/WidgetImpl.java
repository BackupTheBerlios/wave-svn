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
import de.gulden.modeling.wave.EnumWidgetType;
import de.gulden.modeling.wave.WavePackage;
import de.gulden.modeling.wave.Widget;
import de.gulden.modeling.wave.WidgetElement;
import de.gulden.modeling.wave.WidgetOption;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.gulden.modeling.wave.impl.WidgetImpl#getWidgetType <em>Widget Type</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.WidgetImpl#getWidgetHint <em>Widget Hint</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.WidgetImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.WidgetImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.WidgetImpl#isIgnore <em>Ignore</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.WidgetImpl#getFilters <em>Filters</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.WidgetImpl#getValidators <em>Validators</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.WidgetImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.WidgetImpl#getMenuActions <em>Menu Actions</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.WidgetImpl#getElementFormName <em>Element Form Name</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.WidgetImpl#isMultiLine <em>Multi Line</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.WidgetImpl#isMultiChoice <em>Multi Choice</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class WidgetImpl extends ModelMemberImpl implements Widget {
	/**
	 * The default value of the '{@link #getWidgetType() <em>Widget Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgetType()
	 * @generated
	 * @ordered
	 */
	protected static final EnumWidgetType WIDGET_TYPE_EDEFAULT = EnumWidgetType.DEFAULT;

	/**
	 * The cached value of the '{@link #getWidgetType() <em>Widget Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgetType()
	 * @generated
	 * @ordered
	 */
	protected EnumWidgetType widgetType = WIDGET_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidgetHint() <em>Widget Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgetHint()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDGET_HINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidgetHint() <em>Widget Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgetHint()
	 * @generated
	 * @ordered
	 */
	protected String widgetHint = WIDGET_HINT_EDEFAULT;

	/**
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnly = READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIgnore() <em>Ignore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnore()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IGNORE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIgnore() <em>Ignore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnore()
	 * @generated
	 * @ordered
	 */
	protected boolean ignore = IGNORE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFilters() <em>Filters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<WidgetElement> filters;

	/**
	 * The cached value of the '{@link #getValidators() <em>Validators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidators()
	 * @generated
	 * @ordered
	 */
	protected EList<WidgetElement> validators;

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
	 * The cached value of the '{@link #getMenuActions() <em>Menu Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenuActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> menuActions;

	/**
	 * The default value of the '{@link #getElementFormName() <em>Element Form Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementFormName()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_FORM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementFormName() <em>Element Form Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementFormName()
	 * @generated
	 * @ordered
	 */
	protected String elementFormName = ELEMENT_FORM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isMultiLine() <em>Multi Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiLine()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTI_LINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultiLine() <em>Multi Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiLine()
	 * @generated
	 * @ordered
	 */
	protected boolean multiLine = MULTI_LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMultiChoice() <em>Multi Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiChoice()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTI_CHOICE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultiChoice() <em>Multi Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiChoice()
	 * @generated
	 * @ordered
	 */
	protected boolean multiChoice = MULTI_CHOICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavePackage.Literals.WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumWidgetType getWidgetType() {
		return widgetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidgetType(EnumWidgetType newWidgetType) {
		EnumWidgetType oldWidgetType = widgetType;
		widgetType = newWidgetType == null ? WIDGET_TYPE_EDEFAULT : newWidgetType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.WIDGET__WIDGET_TYPE, oldWidgetType, widgetType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWidgetHint() {
		return widgetHint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidgetHint(String newWidgetHint) {
		String oldWidgetHint = widgetHint;
		widgetHint = newWidgetHint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.WIDGET__WIDGET_HINT, oldWidgetHint, widgetHint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.WIDGET__READ_ONLY, oldReadOnly, readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.WIDGET__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIgnore() {
		return ignore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnore(boolean newIgnore) {
		boolean oldIgnore = ignore;
		ignore = newIgnore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.WIDGET__IGNORE, oldIgnore, ignore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WidgetElement> getFilters() {
		if (filters == null) {
			filters = new EObjectContainmentEList<WidgetElement>(WidgetElement.class, this, WavePackage.WIDGET__FILTERS);
		}
		return filters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WidgetElement> getValidators() {
		if (validators == null) {
			validators = new EObjectContainmentEList<WidgetElement>(WidgetElement.class, this, WavePackage.WIDGET__VALIDATORS);
		}
		return validators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WidgetOption> getOptions() {
		if (options == null) {
			options = new EObjectContainmentEList<WidgetOption>(WidgetOption.class, this, WavePackage.WIDGET__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getMenuActions() {
		if (menuActions == null) {
			menuActions = new EObjectResolvingEList<Action>(Action.class, this, WavePackage.WIDGET__MENU_ACTIONS);
		}
		return menuActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementFormName() {
		return elementFormName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementFormName(String newElementFormName) {
		String oldElementFormName = elementFormName;
		elementFormName = newElementFormName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.WIDGET__ELEMENT_FORM_NAME, oldElementFormName, elementFormName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultiLine() {
		return multiLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiLine(boolean newMultiLine) {
		boolean oldMultiLine = multiLine;
		multiLine = newMultiLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.WIDGET__MULTI_LINE, oldMultiLine, multiLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultiChoice() {
		return multiChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiChoice(boolean newMultiChoice) {
		boolean oldMultiChoice = multiChoice;
		multiChoice = newMultiChoice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.WIDGET__MULTI_CHOICE, oldMultiChoice, multiChoice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WavePackage.WIDGET__FILTERS:
				return ((InternalEList<?>)getFilters()).basicRemove(otherEnd, msgs);
			case WavePackage.WIDGET__VALIDATORS:
				return ((InternalEList<?>)getValidators()).basicRemove(otherEnd, msgs);
			case WavePackage.WIDGET__OPTIONS:
				return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
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
			case WavePackage.WIDGET__WIDGET_TYPE:
				return getWidgetType();
			case WavePackage.WIDGET__WIDGET_HINT:
				return getWidgetHint();
			case WavePackage.WIDGET__READ_ONLY:
				return isReadOnly() ? Boolean.TRUE : Boolean.FALSE;
			case WavePackage.WIDGET__REQUIRED:
				return isRequired() ? Boolean.TRUE : Boolean.FALSE;
			case WavePackage.WIDGET__IGNORE:
				return isIgnore() ? Boolean.TRUE : Boolean.FALSE;
			case WavePackage.WIDGET__FILTERS:
				return getFilters();
			case WavePackage.WIDGET__VALIDATORS:
				return getValidators();
			case WavePackage.WIDGET__OPTIONS:
				return getOptions();
			case WavePackage.WIDGET__MENU_ACTIONS:
				return getMenuActions();
			case WavePackage.WIDGET__ELEMENT_FORM_NAME:
				return getElementFormName();
			case WavePackage.WIDGET__MULTI_LINE:
				return isMultiLine() ? Boolean.TRUE : Boolean.FALSE;
			case WavePackage.WIDGET__MULTI_CHOICE:
				return isMultiChoice() ? Boolean.TRUE : Boolean.FALSE;
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
			case WavePackage.WIDGET__WIDGET_TYPE:
				setWidgetType((EnumWidgetType)newValue);
				return;
			case WavePackage.WIDGET__WIDGET_HINT:
				setWidgetHint((String)newValue);
				return;
			case WavePackage.WIDGET__READ_ONLY:
				setReadOnly(((Boolean)newValue).booleanValue());
				return;
			case WavePackage.WIDGET__REQUIRED:
				setRequired(((Boolean)newValue).booleanValue());
				return;
			case WavePackage.WIDGET__IGNORE:
				setIgnore(((Boolean)newValue).booleanValue());
				return;
			case WavePackage.WIDGET__FILTERS:
				getFilters().clear();
				getFilters().addAll((Collection<? extends WidgetElement>)newValue);
				return;
			case WavePackage.WIDGET__VALIDATORS:
				getValidators().clear();
				getValidators().addAll((Collection<? extends WidgetElement>)newValue);
				return;
			case WavePackage.WIDGET__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends WidgetOption>)newValue);
				return;
			case WavePackage.WIDGET__MENU_ACTIONS:
				getMenuActions().clear();
				getMenuActions().addAll((Collection<? extends Action>)newValue);
				return;
			case WavePackage.WIDGET__ELEMENT_FORM_NAME:
				setElementFormName((String)newValue);
				return;
			case WavePackage.WIDGET__MULTI_LINE:
				setMultiLine(((Boolean)newValue).booleanValue());
				return;
			case WavePackage.WIDGET__MULTI_CHOICE:
				setMultiChoice(((Boolean)newValue).booleanValue());
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
			case WavePackage.WIDGET__WIDGET_TYPE:
				setWidgetType(WIDGET_TYPE_EDEFAULT);
				return;
			case WavePackage.WIDGET__WIDGET_HINT:
				setWidgetHint(WIDGET_HINT_EDEFAULT);
				return;
			case WavePackage.WIDGET__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case WavePackage.WIDGET__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case WavePackage.WIDGET__IGNORE:
				setIgnore(IGNORE_EDEFAULT);
				return;
			case WavePackage.WIDGET__FILTERS:
				getFilters().clear();
				return;
			case WavePackage.WIDGET__VALIDATORS:
				getValidators().clear();
				return;
			case WavePackage.WIDGET__OPTIONS:
				getOptions().clear();
				return;
			case WavePackage.WIDGET__MENU_ACTIONS:
				getMenuActions().clear();
				return;
			case WavePackage.WIDGET__ELEMENT_FORM_NAME:
				setElementFormName(ELEMENT_FORM_NAME_EDEFAULT);
				return;
			case WavePackage.WIDGET__MULTI_LINE:
				setMultiLine(MULTI_LINE_EDEFAULT);
				return;
			case WavePackage.WIDGET__MULTI_CHOICE:
				setMultiChoice(MULTI_CHOICE_EDEFAULT);
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
			case WavePackage.WIDGET__WIDGET_TYPE:
				return widgetType != WIDGET_TYPE_EDEFAULT;
			case WavePackage.WIDGET__WIDGET_HINT:
				return WIDGET_HINT_EDEFAULT == null ? widgetHint != null : !WIDGET_HINT_EDEFAULT.equals(widgetHint);
			case WavePackage.WIDGET__READ_ONLY:
				return readOnly != READ_ONLY_EDEFAULT;
			case WavePackage.WIDGET__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case WavePackage.WIDGET__IGNORE:
				return ignore != IGNORE_EDEFAULT;
			case WavePackage.WIDGET__FILTERS:
				return filters != null && !filters.isEmpty();
			case WavePackage.WIDGET__VALIDATORS:
				return validators != null && !validators.isEmpty();
			case WavePackage.WIDGET__OPTIONS:
				return options != null && !options.isEmpty();
			case WavePackage.WIDGET__MENU_ACTIONS:
				return menuActions != null && !menuActions.isEmpty();
			case WavePackage.WIDGET__ELEMENT_FORM_NAME:
				return ELEMENT_FORM_NAME_EDEFAULT == null ? elementFormName != null : !ELEMENT_FORM_NAME_EDEFAULT.equals(elementFormName);
			case WavePackage.WIDGET__MULTI_LINE:
				return multiLine != MULTI_LINE_EDEFAULT;
			case WavePackage.WIDGET__MULTI_CHOICE:
				return multiChoice != MULTI_CHOICE_EDEFAULT;
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
		result.append(" (widgetType: ");
		result.append(widgetType);
		result.append(", widgetHint: ");
		result.append(widgetHint);
		result.append(", readOnly: ");
		result.append(readOnly);
		result.append(", required: ");
		result.append(required);
		result.append(", ignore: ");
		result.append(ignore);
		result.append(", elementFormName: ");
		result.append(elementFormName);
		result.append(", multiLine: ");
		result.append(multiLine);
		result.append(", multiChoice: ");
		result.append(multiChoice);
		result.append(')');
		return result.toString();
	}

} //WidgetImpl
