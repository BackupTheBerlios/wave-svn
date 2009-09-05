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
import de.gulden.modeling.wave.ActionToViewTransition;
import de.gulden.modeling.wave.Actor;
import de.gulden.modeling.wave.Area;
import de.gulden.modeling.wave.AssociationRelationship;
import de.gulden.modeling.wave.Attribute;
import de.gulden.modeling.wave.ClassifierMember;
import de.gulden.modeling.wave.Controller;
import de.gulden.modeling.wave.ControllerMemberExecutable;
import de.gulden.modeling.wave.DatabaseTable;
import de.gulden.modeling.wave.DependencyRelationship;
import de.gulden.modeling.wave.Dictionary;
import de.gulden.modeling.wave.Documentation;
import de.gulden.modeling.wave.EnumAjaxModes;
import de.gulden.modeling.wave.EnumDirection;
import de.gulden.modeling.wave.EnumDisplayMode;
import de.gulden.modeling.wave.EnumDocumentationAudienceType;
import de.gulden.modeling.wave.EnumMultiplicity;
import de.gulden.modeling.wave.EnumProjectLayout;
import de.gulden.modeling.wave.EnumTargetModes;
import de.gulden.modeling.wave.EnumVisibility;
import de.gulden.modeling.wave.EnumWidgetType;
import de.gulden.modeling.wave.Enumeration;
import de.gulden.modeling.wave.EnumerationLiteral;
import de.gulden.modeling.wave.Form;
import de.gulden.modeling.wave.Include;
import de.gulden.modeling.wave.InheritanceRelationship;
import de.gulden.modeling.wave.Interface;
import de.gulden.modeling.wave.Label;
import de.gulden.modeling.wave.Langstring;
import de.gulden.modeling.wave.Model;
import de.gulden.modeling.wave.Operation;
import de.gulden.modeling.wave.RealizationRelationship;
import de.gulden.modeling.wave.StyleSheet;
import de.gulden.modeling.wave.TaggedValue;
import de.gulden.modeling.wave.Usecase;
import de.gulden.modeling.wave.UsecaseSubsystem;
import de.gulden.modeling.wave.View;
import de.gulden.modeling.wave.ViewTransition;
import de.gulden.modeling.wave.WaveFactory;
import de.gulden.modeling.wave.WavePackage;
import de.gulden.modeling.wave.WidgetAssociation;
import de.gulden.modeling.wave.WidgetAttribute;
import de.gulden.modeling.wave.WidgetElement;
import de.gulden.modeling.wave.WidgetOption;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WaveFactoryImpl extends EFactoryImpl implements WaveFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WaveFactory init() {
		try {
			WaveFactory theWaveFactory = (WaveFactory)EPackage.Registry.INSTANCE.getEFactory("http://jensgulden.de/modeling/wave"); 
			if (theWaveFactory != null) {
				return theWaveFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WaveFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaveFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WavePackage.CONTROLLER: return createController();
			case WavePackage.ASSOCIATION_RELATIONSHIP: return createAssociationRelationship();
			case WavePackage.OPERATION: return createOperation();
			case WavePackage.ACTION: return createAction();
			case WavePackage.VIEW: return createView();
			case WavePackage.ATTRIBUTE: return createAttribute();
			case WavePackage.INHERITANCE_RELATIONSHIP: return createInheritanceRelationship();
			case WavePackage.REALIZATION_RELATIONSHIP: return createRealizationRelationship();
			case WavePackage.MODEL: return createModel();
			case WavePackage.PACKAGE: return createPackage();
			case WavePackage.DEPENDENCY_RELATIONSHIP: return createDependencyRelationship();
			case WavePackage.CLASS: return createClass();
			case WavePackage.INTERFACE: return createInterface();
			case WavePackage.ACTION_TO_VIEW_TRANSITION: return createActionToViewTransition();
			case WavePackage.TAGGED_VALUE: return createTaggedValue();
			case WavePackage.DOCUMENTATION: return createDocumentation();
			case WavePackage.CLASSIFIER_MEMBER: return createClassifierMember();
			case WavePackage.INCLUDE: return createInclude();
			case WavePackage.STYLE_SHEET: return createStyleSheet();
			case WavePackage.VIEW_TRANSITION: return createViewTransition();
			case WavePackage.ENUMERATION: return createEnumeration();
			case WavePackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
			case WavePackage.DICTIONARY: return createDictionary();
			case WavePackage.LABEL: return createLabel();
			case WavePackage.LANGSTRING: return createLangstring();
			case WavePackage.DATABASE_TABLE: return createDatabaseTable();
			case WavePackage.USECASE_SUBSYSTEM: return createUsecaseSubsystem();
			case WavePackage.USECASE: return createUsecase();
			case WavePackage.ACTOR: return createActor();
			case WavePackage.AREA: return createArea();
			case WavePackage.CONTROLLER_MEMBER_EXECUTABLE: return createControllerMemberExecutable();
			case WavePackage.WIDGET_ELEMENT: return createWidgetElement();
			case WavePackage.WIDGET_OPTION: return createWidgetOption();
			case WavePackage.FORM: return createForm();
			case WavePackage.WIDGET_ATTRIBUTE: return createWidgetAttribute();
			case WavePackage.WIDGET_ASSOCIATION: return createWidgetAssociation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case WavePackage.ENUM_AJAX_MODES:
				return createEnumAjaxModesFromString(eDataType, initialValue);
			case WavePackage.ENUM_MULTIPLICITY:
				return createEnumMultiplicityFromString(eDataType, initialValue);
			case WavePackage.ENUM_VISIBILITY:
				return createEnumVisibilityFromString(eDataType, initialValue);
			case WavePackage.ENUM_DOCUMENTATION_AUDIENCE_TYPE:
				return createEnumDocumentationAudienceTypeFromString(eDataType, initialValue);
			case WavePackage.ENUM_TARGET_MODES:
				return createEnumTargetModesFromString(eDataType, initialValue);
			case WavePackage.ENUM_DIRECTION:
				return createEnumDirectionFromString(eDataType, initialValue);
			case WavePackage.ENUM_DISPLAY_MODE:
				return createEnumDisplayModeFromString(eDataType, initialValue);
			case WavePackage.ENUM_WIDGET_TYPE:
				return createEnumWidgetTypeFromString(eDataType, initialValue);
			case WavePackage.ENUM_PROJECT_LAYOUT:
				return createEnumProjectLayoutFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case WavePackage.ENUM_AJAX_MODES:
				return convertEnumAjaxModesToString(eDataType, instanceValue);
			case WavePackage.ENUM_MULTIPLICITY:
				return convertEnumMultiplicityToString(eDataType, instanceValue);
			case WavePackage.ENUM_VISIBILITY:
				return convertEnumVisibilityToString(eDataType, instanceValue);
			case WavePackage.ENUM_DOCUMENTATION_AUDIENCE_TYPE:
				return convertEnumDocumentationAudienceTypeToString(eDataType, instanceValue);
			case WavePackage.ENUM_TARGET_MODES:
				return convertEnumTargetModesToString(eDataType, instanceValue);
			case WavePackage.ENUM_DIRECTION:
				return convertEnumDirectionToString(eDataType, instanceValue);
			case WavePackage.ENUM_DISPLAY_MODE:
				return convertEnumDisplayModeToString(eDataType, instanceValue);
			case WavePackage.ENUM_WIDGET_TYPE:
				return convertEnumWidgetTypeToString(eDataType, instanceValue);
			case WavePackage.ENUM_PROJECT_LAYOUT:
				return convertEnumProjectLayoutToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller createController() {
		ControllerImpl controller = new ControllerImpl();
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationRelationship createAssociationRelationship() {
		AssociationRelationshipImpl associationRelationship = new AssociationRelationshipImpl();
		return associationRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View createView() {
		ViewImpl view = new ViewImpl();
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritanceRelationship createInheritanceRelationship() {
		InheritanceRelationshipImpl inheritanceRelationship = new InheritanceRelationshipImpl();
		return inheritanceRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealizationRelationship createRealizationRelationship() {
		RealizationRelationshipImpl realizationRelationship = new RealizationRelationshipImpl();
		return realizationRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.gulden.modeling.wave.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyRelationship createDependencyRelationship() {
		DependencyRelationshipImpl dependencyRelationship = new DependencyRelationshipImpl();
		return dependencyRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.gulden.modeling.wave.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionToViewTransition createActionToViewTransition() {
		ActionToViewTransitionImpl actionToViewTransition = new ActionToViewTransitionImpl();
		return actionToViewTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaggedValue createTaggedValue() {
		TaggedValueImpl taggedValue = new TaggedValueImpl();
		return taggedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentation createDocumentation() {
		DocumentationImpl documentation = new DocumentationImpl();
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierMember createClassifierMember() {
		ClassifierMemberImpl classifierMember = new ClassifierMemberImpl();
		return classifierMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Include createInclude() {
		IncludeImpl include = new IncludeImpl();
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleSheet createStyleSheet() {
		StyleSheetImpl styleSheet = new StyleSheetImpl();
		return styleSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewTransition createViewTransition() {
		ViewTransitionImpl viewTransition = new ViewTransitionImpl();
		return viewTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral createEnumerationLiteral() {
		EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
		return enumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dictionary createDictionary() {
		DictionaryImpl dictionary = new DictionaryImpl();
		return dictionary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Langstring createLangstring() {
		LangstringImpl langstring = new LangstringImpl();
		return langstring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseTable createDatabaseTable() {
		DatabaseTableImpl databaseTable = new DatabaseTableImpl();
		return databaseTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsecaseSubsystem createUsecaseSubsystem() {
		UsecaseSubsystemImpl usecaseSubsystem = new UsecaseSubsystemImpl();
		return usecaseSubsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usecase createUsecase() {
		UsecaseImpl usecase = new UsecaseImpl();
		return usecase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Area createArea() {
		AreaImpl area = new AreaImpl();
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerMemberExecutable createControllerMemberExecutable() {
		ControllerMemberExecutableImpl controllerMemberExecutable = new ControllerMemberExecutableImpl();
		return controllerMemberExecutable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetElement createWidgetElement() {
		WidgetElementImpl widgetElement = new WidgetElementImpl();
		return widgetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetOption createWidgetOption() {
		WidgetOptionImpl widgetOption = new WidgetOptionImpl();
		return widgetOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form createForm() {
		FormImpl form = new FormImpl();
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetAttribute createWidgetAttribute() {
		WidgetAttributeImpl widgetAttribute = new WidgetAttributeImpl();
		return widgetAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetAssociation createWidgetAssociation() {
		WidgetAssociationImpl widgetAssociation = new WidgetAssociationImpl();
		return widgetAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumAjaxModes createEnumAjaxModesFromString(EDataType eDataType, String initialValue) {
		EnumAjaxModes result = EnumAjaxModes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumAjaxModesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumMultiplicity createEnumMultiplicityFromString(EDataType eDataType, String initialValue) {
		EnumMultiplicity result = EnumMultiplicity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumMultiplicityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumVisibility createEnumVisibilityFromString(EDataType eDataType, String initialValue) {
		EnumVisibility result = EnumVisibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumDocumentationAudienceType createEnumDocumentationAudienceTypeFromString(EDataType eDataType, String initialValue) {
		EnumDocumentationAudienceType result = EnumDocumentationAudienceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumDocumentationAudienceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumTargetModes createEnumTargetModesFromString(EDataType eDataType, String initialValue) {
		EnumTargetModes result = EnumTargetModes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumTargetModesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumDirection createEnumDirectionFromString(EDataType eDataType, String initialValue) {
		EnumDirection result = EnumDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumDisplayMode createEnumDisplayModeFromString(EDataType eDataType, String initialValue) {
		EnumDisplayMode result = EnumDisplayMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumDisplayModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumWidgetType createEnumWidgetTypeFromString(EDataType eDataType, String initialValue) {
		EnumWidgetType result = EnumWidgetType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumWidgetTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumProjectLayout createEnumProjectLayoutFromString(EDataType eDataType, String initialValue) {
		EnumProjectLayout result = EnumProjectLayout.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumProjectLayoutToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WavePackage getWavePackage() {
		return (WavePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WavePackage getPackage() {
		return WavePackage.eINSTANCE;
	}

} //WaveFactoryImpl
