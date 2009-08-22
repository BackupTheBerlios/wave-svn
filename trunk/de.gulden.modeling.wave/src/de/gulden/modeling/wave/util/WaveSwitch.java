/**
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 *
 * $Id$
 */
package de.gulden.modeling.wave.util;

import de.gulden.modeling.wave.Action;
import de.gulden.modeling.wave.ActionToViewTransition;
import de.gulden.modeling.wave.Actor;
import de.gulden.modeling.wave.Area;
import de.gulden.modeling.wave.ArtifactClassifier;
import de.gulden.modeling.wave.AssociationRelationship;
import de.gulden.modeling.wave.Attribute;
import de.gulden.modeling.wave.Classifier;
import de.gulden.modeling.wave.ClassifierMember;
import de.gulden.modeling.wave.Controller;
import de.gulden.modeling.wave.ControllerMember;
import de.gulden.modeling.wave.ControllerMemberExecutable;
import de.gulden.modeling.wave.DatabaseTable;
import de.gulden.modeling.wave.DependencyRelationship;
import de.gulden.modeling.wave.Dictionary;
import de.gulden.modeling.wave.Documentation;
import de.gulden.modeling.wave.Enumeration;
import de.gulden.modeling.wave.EnumerationLiteral;
import de.gulden.modeling.wave.Form;
import de.gulden.modeling.wave.Include;
import de.gulden.modeling.wave.InheritanceRelationship;
import de.gulden.modeling.wave.Interface;
import de.gulden.modeling.wave.Label;
import de.gulden.modeling.wave.Langstring;
import de.gulden.modeling.wave.Model;
import de.gulden.modeling.wave.ModelMember;
import de.gulden.modeling.wave.OOPClassifier;
import de.gulden.modeling.wave.Operation;
import de.gulden.modeling.wave.RealizationRelationship;
import de.gulden.modeling.wave.StyleSheet;
import de.gulden.modeling.wave.TaggedValue;
import de.gulden.modeling.wave.TopLevelModelMember;
import de.gulden.modeling.wave.Transition;
import de.gulden.modeling.wave.Usecase;
import de.gulden.modeling.wave.UsecaseClassifier;
import de.gulden.modeling.wave.UsecaseSubsystem;
import de.gulden.modeling.wave.View;
import de.gulden.modeling.wave.ViewTransition;
import de.gulden.modeling.wave.WavePackage;
import de.gulden.modeling.wave.Widget;
import de.gulden.modeling.wave.WidgetAssociation;
import de.gulden.modeling.wave.WidgetAttribute;
import de.gulden.modeling.wave.WidgetElement;
import de.gulden.modeling.wave.WidgetOption;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.gulden.modeling.wave.WavePackage
 * @generated
 */
public class WaveSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WavePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaveSwitch() {
		if (modelPackage == null) {
			modelPackage = WavePackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WavePackage.CLASSIFIER: {
				Classifier classifier = (Classifier)theEObject;
				T result = caseClassifier(classifier);
				if (result == null) result = caseTopLevelModelMember(classifier);
				if (result == null) result = caseModelMember(classifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.CONTROLLER: {
				Controller controller = (Controller)theEObject;
				T result = caseController(controller);
				if (result == null) result = caseArtifactClassifier(controller);
				if (result == null) result = caseClassifier(controller);
				if (result == null) result = caseTopLevelModelMember(controller);
				if (result == null) result = caseModelMember(controller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.ASSOCIATION_RELATIONSHIP: {
				AssociationRelationship associationRelationship = (AssociationRelationship)theEObject;
				T result = caseAssociationRelationship(associationRelationship);
				if (result == null) result = caseTopLevelModelMember(associationRelationship);
				if (result == null) result = caseModelMember(associationRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseClassifierMember(operation);
				if (result == null) result = caseModelMember(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseControllerMemberExecutable(action);
				if (result == null) result = caseControllerMember(action);
				if (result == null) result = caseModelMember(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.VIEW: {
				View view = (View)theEObject;
				T result = caseView(view);
				if (result == null) result = caseControllerMemberExecutable(view);
				if (result == null) result = caseControllerMember(view);
				if (result == null) result = caseModelMember(view);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseClassifierMember(attribute);
				if (result == null) result = caseModelMember(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.INHERITANCE_RELATIONSHIP: {
				InheritanceRelationship inheritanceRelationship = (InheritanceRelationship)theEObject;
				T result = caseInheritanceRelationship(inheritanceRelationship);
				if (result == null) result = caseTopLevelModelMember(inheritanceRelationship);
				if (result == null) result = caseModelMember(inheritanceRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.REALIZATION_RELATIONSHIP: {
				RealizationRelationship realizationRelationship = (RealizationRelationship)theEObject;
				T result = caseRealizationRelationship(realizationRelationship);
				if (result == null) result = caseTopLevelModelMember(realizationRelationship);
				if (result == null) result = caseModelMember(realizationRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = casePackage(model);
				if (result == null) result = caseTopLevelModelMember(model);
				if (result == null) result = caseModelMember(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.MODEL_MEMBER: {
				ModelMember modelMember = (ModelMember)theEObject;
				T result = caseModelMember(modelMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.PACKAGE: {
				de.gulden.modeling.wave.Package package_ = (de.gulden.modeling.wave.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = caseTopLevelModelMember(package_);
				if (result == null) result = caseModelMember(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.DEPENDENCY_RELATIONSHIP: {
				DependencyRelationship dependencyRelationship = (DependencyRelationship)theEObject;
				T result = caseDependencyRelationship(dependencyRelationship);
				if (result == null) result = caseTopLevelModelMember(dependencyRelationship);
				if (result == null) result = caseModelMember(dependencyRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.CLASS: {
				de.gulden.modeling.wave.Class class_ = (de.gulden.modeling.wave.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseOOPClassifier(class_);
				if (result == null) result = caseClassifier(class_);
				if (result == null) result = caseTopLevelModelMember(class_);
				if (result == null) result = caseModelMember(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				T result = caseInterface(interface_);
				if (result == null) result = caseOOPClassifier(interface_);
				if (result == null) result = caseClassifier(interface_);
				if (result == null) result = caseTopLevelModelMember(interface_);
				if (result == null) result = caseModelMember(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.TOP_LEVEL_MODEL_MEMBER: {
				TopLevelModelMember topLevelModelMember = (TopLevelModelMember)theEObject;
				T result = caseTopLevelModelMember(topLevelModelMember);
				if (result == null) result = caseModelMember(topLevelModelMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.ACTION_TO_VIEW_TRANSITION: {
				ActionToViewTransition actionToViewTransition = (ActionToViewTransition)theEObject;
				T result = caseActionToViewTransition(actionToViewTransition);
				if (result == null) result = caseTransition(actionToViewTransition);
				if (result == null) result = caseModelMember(actionToViewTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.TAGGED_VALUE: {
				TaggedValue taggedValue = (TaggedValue)theEObject;
				T result = caseTaggedValue(taggedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.DOCUMENTATION: {
				Documentation documentation = (Documentation)theEObject;
				T result = caseDocumentation(documentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.OOP_CLASSIFIER: {
				OOPClassifier oopClassifier = (OOPClassifier)theEObject;
				T result = caseOOPClassifier(oopClassifier);
				if (result == null) result = caseClassifier(oopClassifier);
				if (result == null) result = caseTopLevelModelMember(oopClassifier);
				if (result == null) result = caseModelMember(oopClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.CLASSIFIER_MEMBER: {
				ClassifierMember classifierMember = (ClassifierMember)theEObject;
				T result = caseClassifierMember(classifierMember);
				if (result == null) result = caseModelMember(classifierMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.ARTIFACT_CLASSIFIER: {
				ArtifactClassifier artifactClassifier = (ArtifactClassifier)theEObject;
				T result = caseArtifactClassifier(artifactClassifier);
				if (result == null) result = caseClassifier(artifactClassifier);
				if (result == null) result = caseTopLevelModelMember(artifactClassifier);
				if (result == null) result = caseModelMember(artifactClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.INCLUDE: {
				Include include = (Include)theEObject;
				T result = caseInclude(include);
				if (result == null) result = caseArtifactClassifier(include);
				if (result == null) result = caseClassifier(include);
				if (result == null) result = caseTopLevelModelMember(include);
				if (result == null) result = caseModelMember(include);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.STYLE_SHEET: {
				StyleSheet styleSheet = (StyleSheet)theEObject;
				T result = caseStyleSheet(styleSheet);
				if (result == null) result = caseArtifactClassifier(styleSheet);
				if (result == null) result = caseClassifier(styleSheet);
				if (result == null) result = caseTopLevelModelMember(styleSheet);
				if (result == null) result = caseModelMember(styleSheet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.VIEW_TRANSITION: {
				ViewTransition viewTransition = (ViewTransition)theEObject;
				T result = caseViewTransition(viewTransition);
				if (result == null) result = caseTransition(viewTransition);
				if (result == null) result = caseModelMember(viewTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.CONTROLLER_MEMBER: {
				ControllerMember controllerMember = (ControllerMember)theEObject;
				T result = caseControllerMember(controllerMember);
				if (result == null) result = caseModelMember(controllerMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.ENUMERATION: {
				Enumeration enumeration = (Enumeration)theEObject;
				T result = caseEnumeration(enumeration);
				if (result == null) result = caseTopLevelModelMember(enumeration);
				if (result == null) result = caseModelMember(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.ENUMERATION_LITERAL: {
				EnumerationLiteral enumerationLiteral = (EnumerationLiteral)theEObject;
				T result = caseEnumerationLiteral(enumerationLiteral);
				if (result == null) result = caseModelMember(enumerationLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.DICTIONARY: {
				Dictionary dictionary = (Dictionary)theEObject;
				T result = caseDictionary(dictionary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.LABEL: {
				Label label = (Label)theEObject;
				T result = caseLabel(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.LANGSTRING: {
				Langstring langstring = (Langstring)theEObject;
				T result = caseLangstring(langstring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.DATABASE_TABLE: {
				DatabaseTable databaseTable = (DatabaseTable)theEObject;
				T result = caseDatabaseTable(databaseTable);
				if (result == null) result = caseTopLevelModelMember(databaseTable);
				if (result == null) result = caseModelMember(databaseTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.WIDGET: {
				Widget widget = (Widget)theEObject;
				T result = caseWidget(widget);
				if (result == null) result = caseModelMember(widget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.USECASE_SUBSYSTEM: {
				UsecaseSubsystem usecaseSubsystem = (UsecaseSubsystem)theEObject;
				T result = caseUsecaseSubsystem(usecaseSubsystem);
				if (result == null) result = caseTopLevelModelMember(usecaseSubsystem);
				if (result == null) result = caseModelMember(usecaseSubsystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.USECASE_CLASSIFIER: {
				UsecaseClassifier usecaseClassifier = (UsecaseClassifier)theEObject;
				T result = caseUsecaseClassifier(usecaseClassifier);
				if (result == null) result = caseOOPClassifier(usecaseClassifier);
				if (result == null) result = caseClassifier(usecaseClassifier);
				if (result == null) result = caseTopLevelModelMember(usecaseClassifier);
				if (result == null) result = caseModelMember(usecaseClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.USECASE: {
				Usecase usecase = (Usecase)theEObject;
				T result = caseUsecase(usecase);
				if (result == null) result = caseUsecaseClassifier(usecase);
				if (result == null) result = caseOOPClassifier(usecase);
				if (result == null) result = caseClassifier(usecase);
				if (result == null) result = caseTopLevelModelMember(usecase);
				if (result == null) result = caseModelMember(usecase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.ACTOR: {
				Actor actor = (Actor)theEObject;
				T result = caseActor(actor);
				if (result == null) result = caseUsecaseClassifier(actor);
				if (result == null) result = caseOOPClassifier(actor);
				if (result == null) result = caseClassifier(actor);
				if (result == null) result = caseTopLevelModelMember(actor);
				if (result == null) result = caseModelMember(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.AREA: {
				Area area = (Area)theEObject;
				T result = caseArea(area);
				if (result == null) result = caseControllerMember(area);
				if (result == null) result = caseModelMember(area);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.CONTROLLER_MEMBER_EXECUTABLE: {
				ControllerMemberExecutable controllerMemberExecutable = (ControllerMemberExecutable)theEObject;
				T result = caseControllerMemberExecutable(controllerMemberExecutable);
				if (result == null) result = caseControllerMember(controllerMemberExecutable);
				if (result == null) result = caseModelMember(controllerMemberExecutable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.WIDGET_ELEMENT: {
				WidgetElement widgetElement = (WidgetElement)theEObject;
				T result = caseWidgetElement(widgetElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.WIDGET_OPTION: {
				WidgetOption widgetOption = (WidgetOption)theEObject;
				T result = caseWidgetOption(widgetOption);
				if (result == null) result = caseModelMember(widgetOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseModelMember(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.FORM: {
				Form form = (Form)theEObject;
				T result = caseForm(form);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.WIDGET_ATTRIBUTE: {
				WidgetAttribute widgetAttribute = (WidgetAttribute)theEObject;
				T result = caseWidgetAttribute(widgetAttribute);
				if (result == null) result = caseWidget(widgetAttribute);
				if (result == null) result = caseModelMember(widgetAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WavePackage.WIDGET_ASSOCIATION: {
				WidgetAssociation widgetAssociation = (WidgetAssociation)theEObject;
				T result = caseWidgetAssociation(widgetAssociation);
				if (result == null) result = caseWidget(widgetAssociation);
				if (result == null) result = caseModelMember(widgetAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseController(Controller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationRelationship(AssociationRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseView(View object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inheritance Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inheritance Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInheritanceRelationship(InheritanceRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realization Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realization Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealizationRelationship(RealizationRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelMember(ModelMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(de.gulden.modeling.wave.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependencyRelationship(DependencyRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(de.gulden.modeling.wave.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Top Level Model Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Top Level Model Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopLevelModelMember(TopLevelModelMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action To View Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action To View Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionToViewTransition(ActionToViewTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tagged Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tagged Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaggedValue(TaggedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentation(Documentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OOP Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OOP Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOPClassifier(OOPClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierMember(ClassifierMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactClassifier(ArtifactClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Include</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Include</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInclude(Include object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Sheet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Sheet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleSheet(StyleSheet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewTransition(ViewTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllerMember(ControllerMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationLiteral(EnumerationLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dictionary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dictionary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDictionary(Dictionary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Langstring</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Langstring</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLangstring(Langstring object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseTable(DatabaseTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidget(Widget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usecase Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usecase Subsystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsecaseSubsystem(UsecaseSubsystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usecase Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usecase Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsecaseClassifier(UsecaseClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usecase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usecase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsecase(Usecase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArea(Area object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller Member Executable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller Member Executable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllerMemberExecutable(ControllerMemberExecutable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidgetElement(WidgetElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidgetOption(WidgetOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForm(Form object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidgetAttribute(WidgetAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidgetAssociation(WidgetAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //WaveSwitch
