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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.gulden.modeling.wave.WavePackage
 * @generated
 */
public class WaveAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WavePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaveAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WavePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaveSwitch<Adapter> modelSwitch =
		new WaveSwitch<Adapter>() {
			@Override
			public Adapter caseClassifier(Classifier object) {
				return createClassifierAdapter();
			}
			@Override
			public Adapter caseController(Controller object) {
				return createControllerAdapter();
			}
			@Override
			public Adapter caseAssociationRelationship(AssociationRelationship object) {
				return createAssociationRelationshipAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseView(View object) {
				return createViewAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseInheritanceRelationship(InheritanceRelationship object) {
				return createInheritanceRelationshipAdapter();
			}
			@Override
			public Adapter caseRealizationRelationship(RealizationRelationship object) {
				return createRealizationRelationshipAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseModelMember(ModelMember object) {
				return createModelMemberAdapter();
			}
			@Override
			public Adapter casePackage(de.gulden.modeling.wave.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter caseDependencyRelationship(DependencyRelationship object) {
				return createDependencyRelationshipAdapter();
			}
			@Override
			public Adapter caseClass(de.gulden.modeling.wave.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseTopLevelModelMember(TopLevelModelMember object) {
				return createTopLevelModelMemberAdapter();
			}
			@Override
			public Adapter caseActionToViewTransition(ActionToViewTransition object) {
				return createActionToViewTransitionAdapter();
			}
			@Override
			public Adapter caseTaggedValue(TaggedValue object) {
				return createTaggedValueAdapter();
			}
			@Override
			public Adapter caseDocumentation(Documentation object) {
				return createDocumentationAdapter();
			}
			@Override
			public Adapter caseOOPClassifier(OOPClassifier object) {
				return createOOPClassifierAdapter();
			}
			@Override
			public Adapter caseClassifierMember(ClassifierMember object) {
				return createClassifierMemberAdapter();
			}
			@Override
			public Adapter caseArtifactClassifier(ArtifactClassifier object) {
				return createArtifactClassifierAdapter();
			}
			@Override
			public Adapter caseInclude(Include object) {
				return createIncludeAdapter();
			}
			@Override
			public Adapter caseStyleSheet(StyleSheet object) {
				return createStyleSheetAdapter();
			}
			@Override
			public Adapter caseViewTransition(ViewTransition object) {
				return createViewTransitionAdapter();
			}
			@Override
			public Adapter caseControllerMember(ControllerMember object) {
				return createControllerMemberAdapter();
			}
			@Override
			public Adapter caseEnumeration(Enumeration object) {
				return createEnumerationAdapter();
			}
			@Override
			public Adapter caseEnumerationLiteral(EnumerationLiteral object) {
				return createEnumerationLiteralAdapter();
			}
			@Override
			public Adapter caseDictionary(Dictionary object) {
				return createDictionaryAdapter();
			}
			@Override
			public Adapter caseLabel(Label object) {
				return createLabelAdapter();
			}
			@Override
			public Adapter caseLangstring(Langstring object) {
				return createLangstringAdapter();
			}
			@Override
			public Adapter caseDatabaseTable(DatabaseTable object) {
				return createDatabaseTableAdapter();
			}
			@Override
			public Adapter caseWidget(Widget object) {
				return createWidgetAdapter();
			}
			@Override
			public Adapter caseUsecaseSubsystem(UsecaseSubsystem object) {
				return createUsecaseSubsystemAdapter();
			}
			@Override
			public Adapter caseUsecaseClassifier(UsecaseClassifier object) {
				return createUsecaseClassifierAdapter();
			}
			@Override
			public Adapter caseUsecase(Usecase object) {
				return createUsecaseAdapter();
			}
			@Override
			public Adapter caseActor(Actor object) {
				return createActorAdapter();
			}
			@Override
			public Adapter caseArea(Area object) {
				return createAreaAdapter();
			}
			@Override
			public Adapter caseControllerMemberExecutable(ControllerMemberExecutable object) {
				return createControllerMemberExecutableAdapter();
			}
			@Override
			public Adapter caseWidgetElement(WidgetElement object) {
				return createWidgetElementAdapter();
			}
			@Override
			public Adapter caseWidgetOption(WidgetOption object) {
				return createWidgetOptionAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseForm(Form object) {
				return createFormAdapter();
			}
			@Override
			public Adapter caseWidgetAttribute(WidgetAttribute object) {
				return createWidgetAttributeAdapter();
			}
			@Override
			public Adapter caseWidgetAssociation(WidgetAssociation object) {
				return createWidgetAssociationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.Classifier
	 * @generated
	 */
	public Adapter createClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.Controller
	 * @generated
	 */
	public Adapter createControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.AssociationRelationship <em>Association Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.AssociationRelationship
	 * @generated
	 */
	public Adapter createAssociationRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.View
	 * @generated
	 */
	public Adapter createViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.InheritanceRelationship <em>Inheritance Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.InheritanceRelationship
	 * @generated
	 */
	public Adapter createInheritanceRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.RealizationRelationship <em>Realization Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.RealizationRelationship
	 * @generated
	 */
	public Adapter createRealizationRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.ModelMember <em>Model Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.ModelMember
	 * @generated
	 */
	public Adapter createModelMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.DependencyRelationship <em>Dependency Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.DependencyRelationship
	 * @generated
	 */
	public Adapter createDependencyRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.TopLevelModelMember <em>Top Level Model Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.TopLevelModelMember
	 * @generated
	 */
	public Adapter createTopLevelModelMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.ActionToViewTransition <em>Action To View Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.ActionToViewTransition
	 * @generated
	 */
	public Adapter createActionToViewTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.TaggedValue <em>Tagged Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.TaggedValue
	 * @generated
	 */
	public Adapter createTaggedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.Documentation
	 * @generated
	 */
	public Adapter createDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.OOPClassifier <em>OOP Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.OOPClassifier
	 * @generated
	 */
	public Adapter createOOPClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.ClassifierMember <em>Classifier Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.ClassifierMember
	 * @generated
	 */
	public Adapter createClassifierMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.ArtifactClassifier <em>Artifact Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.ArtifactClassifier
	 * @generated
	 */
	public Adapter createArtifactClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.Include <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.Include
	 * @generated
	 */
	public Adapter createIncludeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.StyleSheet <em>Style Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.StyleSheet
	 * @generated
	 */
	public Adapter createStyleSheetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.ViewTransition <em>View Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.ViewTransition
	 * @generated
	 */
	public Adapter createViewTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.ControllerMember <em>Controller Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.ControllerMember
	 * @generated
	 */
	public Adapter createControllerMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.Enumeration
	 * @generated
	 */
	public Adapter createEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.EnumerationLiteral
	 * @generated
	 */
	public Adapter createEnumerationLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.Dictionary <em>Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.Dictionary
	 * @generated
	 */
	public Adapter createDictionaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.Langstring <em>Langstring</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.Langstring
	 * @generated
	 */
	public Adapter createLangstringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.DatabaseTable <em>Database Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.DatabaseTable
	 * @generated
	 */
	public Adapter createDatabaseTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.Widget
	 * @generated
	 */
	public Adapter createWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.UsecaseSubsystem <em>Usecase Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.UsecaseSubsystem
	 * @generated
	 */
	public Adapter createUsecaseSubsystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.UsecaseClassifier <em>Usecase Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.UsecaseClassifier
	 * @generated
	 */
	public Adapter createUsecaseClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.Usecase <em>Usecase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.Usecase
	 * @generated
	 */
	public Adapter createUsecaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.Area
	 * @generated
	 */
	public Adapter createAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.ControllerMemberExecutable <em>Controller Member Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.ControllerMemberExecutable
	 * @generated
	 */
	public Adapter createControllerMemberExecutableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.WidgetElement <em>Widget Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.WidgetElement
	 * @generated
	 */
	public Adapter createWidgetElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.WidgetOption <em>Widget Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.WidgetOption
	 * @generated
	 */
	public Adapter createWidgetOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.Form
	 * @generated
	 */
	public Adapter createFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.WidgetAttribute <em>Widget Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.WidgetAttribute
	 * @generated
	 */
	public Adapter createWidgetAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gulden.modeling.wave.WidgetAssociation <em>Widget Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gulden.modeling.wave.WidgetAssociation
	 * @generated
	 */
	public Adapter createWidgetAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WaveAdapterFactory
