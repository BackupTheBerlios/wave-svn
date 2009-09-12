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
import de.gulden.modeling.wave.WaveFactory;
import de.gulden.modeling.wave.WavePackage;
import de.gulden.modeling.wave.Widget;
import de.gulden.modeling.wave.WidgetAssociation;
import de.gulden.modeling.wave.WidgetAttribute;
import de.gulden.modeling.wave.WidgetElement;
import de.gulden.modeling.wave.WidgetOption;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WavePackageImpl extends EPackageImpl implements WavePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritanceRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realizationRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topLevelModelMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionToViewTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taggedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oopClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleSheetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dictionaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass langstringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usecaseSubsystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usecaseClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usecaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerMemberExecutableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumAjaxModesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumMultiplicityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumVisibilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumDocumentationAudienceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumTargetModesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumDisplayModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumWidgetTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumProjectLayoutEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.gulden.modeling.wave.WavePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WavePackageImpl() {
		super(eNS_URI, WaveFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WavePackage init() {
		if (isInited) return (WavePackage)EPackage.Registry.INSTANCE.getEPackage(WavePackage.eNS_URI);

		// Obtain or create and register package
		WavePackageImpl theWavePackage = (WavePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof WavePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new WavePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theWavePackage.createPackageContents();

		// Initialize created meta-data
		theWavePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWavePackage.freeze();

		return theWavePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifier() {
		return classifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Operations() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifier_Name() {
		return (EAttribute)classifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Attributes() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifier_IsExternal() {
		return (EAttribute)classifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getController() {
		return controllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getController_Actions() {
		return (EReference)controllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getController_Views() {
		return (EReference)controllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getController_TransitionsActionToView() {
		return (EReference)controllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getController_TransitionsView() {
		return (EReference)controllerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationRelationship() {
		return associationRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationRelationship_Name() {
		return (EAttribute)associationRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationRelationship_MultiplicityA() {
		return (EAttribute)associationRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationRelationship_MultiplicityB() {
		return (EAttribute)associationRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationRelationship_A() {
		return (EReference)associationRelationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationRelationship_B() {
		return (EReference)associationRelationshipEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationRelationship_Direction() {
		return (EAttribute)associationRelationshipEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_ReturnType() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_IsAbstract() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Code() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Throws() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Parameters() {
		return (EReference)operationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_AjaxMode() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_AjaxTarget() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_Areas() {
		return (EReference)viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Type() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_DefaultValue() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_IsMultiple() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInheritanceRelationship() {
		return inheritanceRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInheritanceRelationship_Parent() {
		return (EReference)inheritanceRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInheritanceRelationship_Child() {
		return (EReference)inheritanceRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealizationRelationship() {
		return realizationRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealizationRelationship_ParentInterface() {
		return (EReference)realizationRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealizationRelationship_ImplementingClass() {
		return (EReference)realizationRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Author() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Version() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_BasePackage() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_SourceFolder() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_GeneratorTarget() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Copyright() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Provider() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Dictionary() {
		return (EReference)modelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Documentation() {
		return (EReference)modelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_FactoryClass() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_LayoutTemplate() {
		return (EReference)modelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_BaseUrl() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_IconPrefix() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_TestdataSQL() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_ProjectLayout() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelMember() {
		return modelMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelMember_TaggedValue() {
		return (EReference)modelMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelMember_Label() {
		return (EReference)modelMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelMember_Description() {
		return (EReference)modelMemberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelMember_Docs() {
		return (EReference)modelMemberEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelMember_Stereotype() {
		return (EAttribute)modelMemberEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Name() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Members() {
		return (EReference)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependencyRelationship() {
		return dependencyRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependencyRelationship_Client() {
		return (EReference)dependencyRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependencyRelationship_Supplier() {
		return (EReference)dependencyRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_IsPersistent() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_TargetMode() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Forms() {
		return (EReference)classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_TargetMode() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopLevelModelMember() {
		return topLevelModelMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionToViewTransition() {
		return actionToViewTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionToViewTransition_Target() {
		return (EReference)actionToViewTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionToViewTransition_Source() {
		return (EReference)actionToViewTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaggedValue() {
		return taggedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaggedValue_Key() {
		return (EAttribute)taggedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaggedValue_Value() {
		return (EAttribute)taggedValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentation() {
		return documentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentation_Text() {
		return (EAttribute)documentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentation_Audience() {
		return (EAttribute)documentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentation_DetailLevel() {
		return (EAttribute)documentationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOOPClassifier() {
		return oopClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOOPClassifier_IsAbstract() {
		return (EAttribute)oopClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOOPClassifier_Visibility() {
		return (EAttribute)oopClassifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOOPClassifier_ExternalExtends() {
		return (EAttribute)oopClassifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOOPClassifier_ExternalImplements() {
		return (EAttribute)oopClassifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifierMember() {
		return classifierMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifierMember_Signature() {
		return (EAttribute)classifierMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifierMember_Name() {
		return (EAttribute)classifierMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifierMember_Visibility() {
		return (EAttribute)classifierMemberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifierMember_IsStatic() {
		return (EAttribute)classifierMemberEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifierMember_IsFinal() {
		return (EAttribute)classifierMemberEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifierMember_TargetMode() {
		return (EAttribute)classifierMemberEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactClassifier() {
		return artifactClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInclude() {
		return includeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInclude_Code() {
		return (EAttribute)includeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInclude_UrlPath() {
		return (EAttribute)includeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleSheet() {
		return styleSheetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleSheet_Code() {
		return (EAttribute)styleSheetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewTransition() {
		return viewTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewTransition_Source() {
		return (EReference)viewTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewTransition_Target() {
		return (EReference)viewTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllerMember() {
		return controllerMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllerMember_Usecases() {
		return (EReference)controllerMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerMember_Name() {
		return (EAttribute)controllerMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeration() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_Literals() {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumeration_Name() {
		return (EAttribute)enumerationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationLiteral() {
		return enumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationLiteral_Name() {
		return (EAttribute)enumerationLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationLiteral_Value() {
		return (EAttribute)enumerationLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDictionary() {
		return dictionaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDictionary_Label() {
		return (EReference)dictionaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDictionary_DefaultLang() {
		return (EAttribute)dictionaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_Text() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabel_Langstring() {
		return (EReference)labelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_Icon() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLangstring() {
		return langstringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLangstring_Lang() {
		return (EAttribute)langstringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLangstring_Text() {
		return (EAttribute)langstringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseTable() {
		return databaseTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseTable_Name() {
		return (EAttribute)databaseTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseTable_SqlCreate() {
		return (EAttribute)databaseTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidget() {
		return widgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_WidgetType() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_WidgetHint() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_ReadOnly() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_Required() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_Ignore() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Filters() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Validators() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Options() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_MenuActions() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_ElementFormName() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_MultiLine() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_MultiChoice() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsecaseSubsystem() {
		return usecaseSubsystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsecaseSubsystem_Name() {
		return (EAttribute)usecaseSubsystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsecaseSubsystem_Usecases() {
		return (EReference)usecaseSubsystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsecaseClassifier() {
		return usecaseClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsecase() {
		return usecaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsecase_Text() {
		return (EAttribute)usecaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArea() {
		return areaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArea_Views() {
		return (EReference)areaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArea_Style() {
		return (EAttribute)areaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllerMemberExecutable() {
		return controllerMemberExecutableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllerMemberExecutable_Operation() {
		return (EReference)controllerMemberExecutableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidgetElement() {
		return widgetElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidgetElement_Name() {
		return (EAttribute)widgetElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetElement_Options() {
		return (EReference)widgetElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetElement_MultiOptions() {
		return (EReference)widgetElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidgetOption() {
		return widgetOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidgetOption_Name() {
		return (EAttribute)widgetOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidgetOption_Value() {
		return (EAttribute)widgetOptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Name() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Condition() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForm() {
		return formEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForm_Widgets() {
		return (EReference)formEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForm_Operation() {
		return (EReference)formEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Name() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidgetAttribute() {
		return widgetAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetAttribute_Attribute() {
		return (EReference)widgetAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidgetAssociation() {
		return widgetAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetAssociation_Association() {
		return (EReference)widgetAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetAssociation_ElementsMenuActions() {
		return (EReference)widgetAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumAjaxModes() {
		return enumAjaxModesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumMultiplicity() {
		return enumMultiplicityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumVisibility() {
		return enumVisibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumDocumentationAudienceType() {
		return enumDocumentationAudienceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumTargetModes() {
		return enumTargetModesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumDirection() {
		return enumDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumDisplayMode() {
		return enumDisplayModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumWidgetType() {
		return enumWidgetTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumProjectLayout() {
		return enumProjectLayoutEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaveFactory getWaveFactory() {
		return (WaveFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		classifierEClass = createEClass(CLASSIFIER);
		createEReference(classifierEClass, CLASSIFIER__OPERATIONS);
		createEAttribute(classifierEClass, CLASSIFIER__NAME);
		createEReference(classifierEClass, CLASSIFIER__ATTRIBUTES);
		createEAttribute(classifierEClass, CLASSIFIER__IS_EXTERNAL);

		controllerEClass = createEClass(CONTROLLER);
		createEReference(controllerEClass, CONTROLLER__ACTIONS);
		createEReference(controllerEClass, CONTROLLER__VIEWS);
		createEReference(controllerEClass, CONTROLLER__TRANSITIONS_ACTION_TO_VIEW);
		createEReference(controllerEClass, CONTROLLER__TRANSITIONS_VIEW);

		associationRelationshipEClass = createEClass(ASSOCIATION_RELATIONSHIP);
		createEAttribute(associationRelationshipEClass, ASSOCIATION_RELATIONSHIP__NAME);
		createEAttribute(associationRelationshipEClass, ASSOCIATION_RELATIONSHIP__MULTIPLICITY_A);
		createEAttribute(associationRelationshipEClass, ASSOCIATION_RELATIONSHIP__MULTIPLICITY_B);
		createEReference(associationRelationshipEClass, ASSOCIATION_RELATIONSHIP__A);
		createEReference(associationRelationshipEClass, ASSOCIATION_RELATIONSHIP__B);
		createEAttribute(associationRelationshipEClass, ASSOCIATION_RELATIONSHIP__DIRECTION);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__RETURN_TYPE);
		createEAttribute(operationEClass, OPERATION__IS_ABSTRACT);
		createEAttribute(operationEClass, OPERATION__CODE);
		createEAttribute(operationEClass, OPERATION__THROWS);
		createEReference(operationEClass, OPERATION__PARAMETERS);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__AJAX_MODE);
		createEAttribute(actionEClass, ACTION__AJAX_TARGET);

		viewEClass = createEClass(VIEW);
		createEReference(viewEClass, VIEW__AREAS);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__TYPE);
		createEAttribute(attributeEClass, ATTRIBUTE__DEFAULT_VALUE);
		createEAttribute(attributeEClass, ATTRIBUTE__IS_MULTIPLE);

		inheritanceRelationshipEClass = createEClass(INHERITANCE_RELATIONSHIP);
		createEReference(inheritanceRelationshipEClass, INHERITANCE_RELATIONSHIP__PARENT);
		createEReference(inheritanceRelationshipEClass, INHERITANCE_RELATIONSHIP__CHILD);

		realizationRelationshipEClass = createEClass(REALIZATION_RELATIONSHIP);
		createEReference(realizationRelationshipEClass, REALIZATION_RELATIONSHIP__PARENT_INTERFACE);
		createEReference(realizationRelationshipEClass, REALIZATION_RELATIONSHIP__IMPLEMENTING_CLASS);

		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__AUTHOR);
		createEAttribute(modelEClass, MODEL__VERSION);
		createEAttribute(modelEClass, MODEL__BASE_PACKAGE);
		createEAttribute(modelEClass, MODEL__SOURCE_FOLDER);
		createEAttribute(modelEClass, MODEL__GENERATOR_TARGET);
		createEAttribute(modelEClass, MODEL__COPYRIGHT);
		createEAttribute(modelEClass, MODEL__PROVIDER);
		createEReference(modelEClass, MODEL__DICTIONARY);
		createEReference(modelEClass, MODEL__DOCUMENTATION);
		createEAttribute(modelEClass, MODEL__FACTORY_CLASS);
		createEReference(modelEClass, MODEL__LAYOUT_TEMPLATE);
		createEAttribute(modelEClass, MODEL__BASE_URL);
		createEAttribute(modelEClass, MODEL__ICON_PREFIX);
		createEAttribute(modelEClass, MODEL__TESTDATA_SQL);
		createEAttribute(modelEClass, MODEL__PROJECT_LAYOUT);

		modelMemberEClass = createEClass(MODEL_MEMBER);
		createEReference(modelMemberEClass, MODEL_MEMBER__TAGGED_VALUE);
		createEReference(modelMemberEClass, MODEL_MEMBER__LABEL);
		createEReference(modelMemberEClass, MODEL_MEMBER__DESCRIPTION);
		createEReference(modelMemberEClass, MODEL_MEMBER__DOCS);
		createEAttribute(modelMemberEClass, MODEL_MEMBER__STEREOTYPE);

		packageEClass = createEClass(PACKAGE);
		createEAttribute(packageEClass, PACKAGE__NAME);
		createEReference(packageEClass, PACKAGE__MEMBERS);

		dependencyRelationshipEClass = createEClass(DEPENDENCY_RELATIONSHIP);
		createEReference(dependencyRelationshipEClass, DEPENDENCY_RELATIONSHIP__CLIENT);
		createEReference(dependencyRelationshipEClass, DEPENDENCY_RELATIONSHIP__SUPPLIER);

		classEClass = createEClass(CLASS);
		createEAttribute(classEClass, CLASS__IS_PERSISTENT);
		createEAttribute(classEClass, CLASS__TARGET_MODE);
		createEReference(classEClass, CLASS__FORMS);

		interfaceEClass = createEClass(INTERFACE);
		createEAttribute(interfaceEClass, INTERFACE__TARGET_MODE);

		topLevelModelMemberEClass = createEClass(TOP_LEVEL_MODEL_MEMBER);

		actionToViewTransitionEClass = createEClass(ACTION_TO_VIEW_TRANSITION);
		createEReference(actionToViewTransitionEClass, ACTION_TO_VIEW_TRANSITION__TARGET);
		createEReference(actionToViewTransitionEClass, ACTION_TO_VIEW_TRANSITION__SOURCE);

		taggedValueEClass = createEClass(TAGGED_VALUE);
		createEAttribute(taggedValueEClass, TAGGED_VALUE__KEY);
		createEAttribute(taggedValueEClass, TAGGED_VALUE__VALUE);

		documentationEClass = createEClass(DOCUMENTATION);
		createEAttribute(documentationEClass, DOCUMENTATION__TEXT);
		createEAttribute(documentationEClass, DOCUMENTATION__AUDIENCE);
		createEAttribute(documentationEClass, DOCUMENTATION__DETAIL_LEVEL);

		oopClassifierEClass = createEClass(OOP_CLASSIFIER);
		createEAttribute(oopClassifierEClass, OOP_CLASSIFIER__IS_ABSTRACT);
		createEAttribute(oopClassifierEClass, OOP_CLASSIFIER__VISIBILITY);
		createEAttribute(oopClassifierEClass, OOP_CLASSIFIER__EXTERNAL_EXTENDS);
		createEAttribute(oopClassifierEClass, OOP_CLASSIFIER__EXTERNAL_IMPLEMENTS);

		classifierMemberEClass = createEClass(CLASSIFIER_MEMBER);
		createEAttribute(classifierMemberEClass, CLASSIFIER_MEMBER__SIGNATURE);
		createEAttribute(classifierMemberEClass, CLASSIFIER_MEMBER__NAME);
		createEAttribute(classifierMemberEClass, CLASSIFIER_MEMBER__VISIBILITY);
		createEAttribute(classifierMemberEClass, CLASSIFIER_MEMBER__IS_STATIC);
		createEAttribute(classifierMemberEClass, CLASSIFIER_MEMBER__IS_FINAL);
		createEAttribute(classifierMemberEClass, CLASSIFIER_MEMBER__TARGET_MODE);

		artifactClassifierEClass = createEClass(ARTIFACT_CLASSIFIER);

		includeEClass = createEClass(INCLUDE);
		createEAttribute(includeEClass, INCLUDE__CODE);
		createEAttribute(includeEClass, INCLUDE__URL_PATH);

		styleSheetEClass = createEClass(STYLE_SHEET);
		createEAttribute(styleSheetEClass, STYLE_SHEET__CODE);

		viewTransitionEClass = createEClass(VIEW_TRANSITION);
		createEReference(viewTransitionEClass, VIEW_TRANSITION__SOURCE);
		createEReference(viewTransitionEClass, VIEW_TRANSITION__TARGET);

		controllerMemberEClass = createEClass(CONTROLLER_MEMBER);
		createEReference(controllerMemberEClass, CONTROLLER_MEMBER__USECASES);
		createEAttribute(controllerMemberEClass, CONTROLLER_MEMBER__NAME);

		enumerationEClass = createEClass(ENUMERATION);
		createEReference(enumerationEClass, ENUMERATION__LITERALS);
		createEAttribute(enumerationEClass, ENUMERATION__NAME);

		enumerationLiteralEClass = createEClass(ENUMERATION_LITERAL);
		createEAttribute(enumerationLiteralEClass, ENUMERATION_LITERAL__NAME);
		createEAttribute(enumerationLiteralEClass, ENUMERATION_LITERAL__VALUE);

		dictionaryEClass = createEClass(DICTIONARY);
		createEReference(dictionaryEClass, DICTIONARY__LABEL);
		createEAttribute(dictionaryEClass, DICTIONARY__DEFAULT_LANG);

		labelEClass = createEClass(LABEL);
		createEAttribute(labelEClass, LABEL__TEXT);
		createEReference(labelEClass, LABEL__LANGSTRING);
		createEAttribute(labelEClass, LABEL__ICON);

		langstringEClass = createEClass(LANGSTRING);
		createEAttribute(langstringEClass, LANGSTRING__LANG);
		createEAttribute(langstringEClass, LANGSTRING__TEXT);

		databaseTableEClass = createEClass(DATABASE_TABLE);
		createEAttribute(databaseTableEClass, DATABASE_TABLE__NAME);
		createEAttribute(databaseTableEClass, DATABASE_TABLE__SQL_CREATE);

		widgetEClass = createEClass(WIDGET);
		createEAttribute(widgetEClass, WIDGET__WIDGET_TYPE);
		createEAttribute(widgetEClass, WIDGET__WIDGET_HINT);
		createEAttribute(widgetEClass, WIDGET__READ_ONLY);
		createEAttribute(widgetEClass, WIDGET__REQUIRED);
		createEAttribute(widgetEClass, WIDGET__IGNORE);
		createEReference(widgetEClass, WIDGET__FILTERS);
		createEReference(widgetEClass, WIDGET__VALIDATORS);
		createEReference(widgetEClass, WIDGET__OPTIONS);
		createEReference(widgetEClass, WIDGET__MENU_ACTIONS);
		createEAttribute(widgetEClass, WIDGET__ELEMENT_FORM_NAME);
		createEAttribute(widgetEClass, WIDGET__MULTI_LINE);
		createEAttribute(widgetEClass, WIDGET__MULTI_CHOICE);

		usecaseSubsystemEClass = createEClass(USECASE_SUBSYSTEM);
		createEAttribute(usecaseSubsystemEClass, USECASE_SUBSYSTEM__NAME);
		createEReference(usecaseSubsystemEClass, USECASE_SUBSYSTEM__USECASES);

		usecaseClassifierEClass = createEClass(USECASE_CLASSIFIER);

		usecaseEClass = createEClass(USECASE);
		createEAttribute(usecaseEClass, USECASE__TEXT);

		actorEClass = createEClass(ACTOR);

		areaEClass = createEClass(AREA);
		createEReference(areaEClass, AREA__VIEWS);
		createEAttribute(areaEClass, AREA__STYLE);

		controllerMemberExecutableEClass = createEClass(CONTROLLER_MEMBER_EXECUTABLE);
		createEReference(controllerMemberExecutableEClass, CONTROLLER_MEMBER_EXECUTABLE__OPERATION);

		widgetElementEClass = createEClass(WIDGET_ELEMENT);
		createEAttribute(widgetElementEClass, WIDGET_ELEMENT__NAME);
		createEReference(widgetElementEClass, WIDGET_ELEMENT__OPTIONS);
		createEReference(widgetElementEClass, WIDGET_ELEMENT__MULTI_OPTIONS);

		widgetOptionEClass = createEClass(WIDGET_OPTION);
		createEAttribute(widgetOptionEClass, WIDGET_OPTION__NAME);
		createEAttribute(widgetOptionEClass, WIDGET_OPTION__VALUE);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__NAME);
		createEAttribute(transitionEClass, TRANSITION__CONDITION);

		formEClass = createEClass(FORM);
		createEReference(formEClass, FORM__WIDGETS);
		createEReference(formEClass, FORM__OPERATION);
		createEAttribute(formEClass, FORM__NAME);

		widgetAttributeEClass = createEClass(WIDGET_ATTRIBUTE);
		createEReference(widgetAttributeEClass, WIDGET_ATTRIBUTE__ATTRIBUTE);

		widgetAssociationEClass = createEClass(WIDGET_ASSOCIATION);
		createEReference(widgetAssociationEClass, WIDGET_ASSOCIATION__ASSOCIATION);
		createEReference(widgetAssociationEClass, WIDGET_ASSOCIATION__ELEMENTS_MENU_ACTIONS);

		// Create enums
		enumAjaxModesEEnum = createEEnum(ENUM_AJAX_MODES);
		enumMultiplicityEEnum = createEEnum(ENUM_MULTIPLICITY);
		enumVisibilityEEnum = createEEnum(ENUM_VISIBILITY);
		enumDocumentationAudienceTypeEEnum = createEEnum(ENUM_DOCUMENTATION_AUDIENCE_TYPE);
		enumTargetModesEEnum = createEEnum(ENUM_TARGET_MODES);
		enumDirectionEEnum = createEEnum(ENUM_DIRECTION);
		enumDisplayModeEEnum = createEEnum(ENUM_DISPLAY_MODE);
		enumWidgetTypeEEnum = createEEnum(ENUM_WIDGET_TYPE);
		enumProjectLayoutEEnum = createEEnum(ENUM_PROJECT_LAYOUT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		classifierEClass.getESuperTypes().add(this.getTopLevelModelMember());
		controllerEClass.getESuperTypes().add(this.getArtifactClassifier());
		associationRelationshipEClass.getESuperTypes().add(this.getTopLevelModelMember());
		operationEClass.getESuperTypes().add(this.getClassifierMember());
		actionEClass.getESuperTypes().add(this.getControllerMemberExecutable());
		viewEClass.getESuperTypes().add(this.getControllerMemberExecutable());
		attributeEClass.getESuperTypes().add(this.getClassifierMember());
		inheritanceRelationshipEClass.getESuperTypes().add(this.getTopLevelModelMember());
		realizationRelationshipEClass.getESuperTypes().add(this.getTopLevelModelMember());
		modelEClass.getESuperTypes().add(this.getPackage());
		packageEClass.getESuperTypes().add(this.getTopLevelModelMember());
		dependencyRelationshipEClass.getESuperTypes().add(this.getTopLevelModelMember());
		classEClass.getESuperTypes().add(this.getOOPClassifier());
		interfaceEClass.getESuperTypes().add(this.getOOPClassifier());
		topLevelModelMemberEClass.getESuperTypes().add(this.getModelMember());
		actionToViewTransitionEClass.getESuperTypes().add(this.getTransition());
		oopClassifierEClass.getESuperTypes().add(this.getClassifier());
		classifierMemberEClass.getESuperTypes().add(this.getModelMember());
		artifactClassifierEClass.getESuperTypes().add(this.getClassifier());
		includeEClass.getESuperTypes().add(this.getArtifactClassifier());
		styleSheetEClass.getESuperTypes().add(this.getArtifactClassifier());
		viewTransitionEClass.getESuperTypes().add(this.getTransition());
		controllerMemberEClass.getESuperTypes().add(this.getModelMember());
		enumerationEClass.getESuperTypes().add(this.getTopLevelModelMember());
		enumerationLiteralEClass.getESuperTypes().add(this.getModelMember());
		databaseTableEClass.getESuperTypes().add(this.getTopLevelModelMember());
		widgetEClass.getESuperTypes().add(this.getModelMember());
		usecaseSubsystemEClass.getESuperTypes().add(this.getTopLevelModelMember());
		usecaseClassifierEClass.getESuperTypes().add(this.getOOPClassifier());
		usecaseEClass.getESuperTypes().add(this.getUsecaseClassifier());
		actorEClass.getESuperTypes().add(this.getUsecaseClassifier());
		areaEClass.getESuperTypes().add(this.getControllerMember());
		controllerMemberExecutableEClass.getESuperTypes().add(this.getControllerMember());
		widgetOptionEClass.getESuperTypes().add(this.getModelMember());
		transitionEClass.getESuperTypes().add(this.getModelMember());
		widgetAttributeEClass.getESuperTypes().add(this.getWidget());
		widgetAssociationEClass.getESuperTypes().add(this.getWidget());

		// Initialize classes and features; add operations and parameters
		initEClass(classifierEClass, Classifier.class, "Classifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassifier_Operations(), this.getOperation(), null, "operations", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassifier_Name(), ecorePackage.getEString(), "name", null, 0, 1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassifier_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassifier_IsExternal(), ecorePackage.getEBoolean(), "isExternal", null, 0, 1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerEClass, Controller.class, "Controller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getController_Actions(), this.getAction(), null, "actions", null, 0, -1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getController_Views(), this.getView(), null, "views", null, 0, -1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getController_TransitionsActionToView(), this.getActionToViewTransition(), null, "transitionsActionToView", null, 0, -1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getController_TransitionsView(), this.getViewTransition(), null, "transitionsView", null, 0, -1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationRelationshipEClass, AssociationRelationship.class, "AssociationRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociationRelationship_Name(), ecorePackage.getEString(), "name", null, 0, 1, AssociationRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociationRelationship_MultiplicityA(), this.getEnumMultiplicity(), "multiplicityA", "1", 0, 1, AssociationRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociationRelationship_MultiplicityB(), this.getEnumMultiplicity(), "multiplicityB", "*", 0, 1, AssociationRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationRelationship_A(), this.getOOPClassifier(), null, "a", null, 1, 1, AssociationRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationRelationship_B(), this.getOOPClassifier(), null, "b", null, 1, 1, AssociationRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociationRelationship_Direction(), this.getEnumDirection(), "direction", null, 0, 1, AssociationRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_ReturnType(), ecorePackage.getEString(), "returnType", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Code(), ecorePackage.getEString(), "code", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Throws(), ecorePackage.getEString(), "throws", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Parameters(), this.getAttribute(), null, "parameters", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_AjaxMode(), this.getEnumAjaxModes(), "ajaxMode", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_AjaxTarget(), ecorePackage.getEString(), "ajaxTarget", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewEClass, View.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getView_Areas(), this.getArea(), null, "areas", null, 0, -1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Type(), ecorePackage.getEString(), "type", "string", 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_IsMultiple(), ecorePackage.getEBoolean(), "isMultiple", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inheritanceRelationshipEClass, InheritanceRelationship.class, "InheritanceRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInheritanceRelationship_Parent(), this.getClassifier(), null, "parent", null, 1, 1, InheritanceRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInheritanceRelationship_Child(), this.getClassifier(), null, "child", null, 1, 1, InheritanceRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realizationRelationshipEClass, RealizationRelationship.class, "RealizationRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRealizationRelationship_ParentInterface(), this.getInterface(), null, "parentInterface", null, 1, 1, RealizationRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealizationRelationship_ImplementingClass(), this.getClass_(), null, "implementingClass", null, 1, 1, RealizationRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_Author(), ecorePackage.getEString(), "author", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_Version(), ecorePackage.getEString(), "version", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_BasePackage(), ecorePackage.getEString(), "basePackage", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_SourceFolder(), ecorePackage.getEString(), "sourceFolder", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_GeneratorTarget(), ecorePackage.getEString(), "generatorTarget", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_Copyright(), ecorePackage.getEString(), "copyright", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_Provider(), ecorePackage.getEString(), "provider", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Dictionary(), this.getDictionary(), null, "dictionary", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Documentation(), this.getDocumentation(), null, "documentation", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_FactoryClass(), ecorePackage.getEString(), "factoryClass", "DefaultWaveFactoryImpl", 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_LayoutTemplate(), this.getInclude(), null, "layoutTemplate", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_BaseUrl(), ecorePackage.getEString(), "baseUrl", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_IconPrefix(), ecorePackage.getEString(), "iconPrefix", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_TestdataSQL(), ecorePackage.getEString(), "testdataSQL", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_ProjectLayout(), this.getEnumProjectLayout(), "projectLayout", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelMemberEClass, ModelMember.class, "ModelMember", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelMember_TaggedValue(), this.getTaggedValue(), null, "taggedValue", null, 0, -1, ModelMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelMember_Label(), this.getLabel(), null, "label", null, 0, 1, ModelMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelMember_Description(), this.getLabel(), null, "description", null, 0, 1, ModelMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelMember_Docs(), this.getDocumentation(), null, "docs", null, 0, -1, ModelMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelMember_Stereotype(), ecorePackage.getEString(), "stereotype", null, 0, 1, ModelMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, de.gulden.modeling.wave.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, de.gulden.modeling.wave.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_Members(), this.getTopLevelModelMember(), null, "members", null, 0, -1, de.gulden.modeling.wave.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyRelationshipEClass, DependencyRelationship.class, "DependencyRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependencyRelationship_Client(), this.getModelMember(), null, "client", null, 1, 1, DependencyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependencyRelationship_Supplier(), this.getModelMember(), null, "supplier", null, 1, 1, DependencyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classEClass, de.gulden.modeling.wave.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClass_IsPersistent(), ecorePackage.getEBoolean(), "isPersistent", null, 0, 1, de.gulden.modeling.wave.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_TargetMode(), this.getEnumTargetModes(), "targetMode", null, 0, 1, de.gulden.modeling.wave.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Forms(), this.getForm(), null, "forms", null, 0, -1, de.gulden.modeling.wave.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterface_TargetMode(), this.getEnumTargetModes(), "targetMode", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topLevelModelMemberEClass, TopLevelModelMember.class, "TopLevelModelMember", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionToViewTransitionEClass, ActionToViewTransition.class, "ActionToViewTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionToViewTransition_Target(), this.getView(), null, "target", null, 1, 1, ActionToViewTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionToViewTransition_Source(), this.getAction(), null, "source", null, 1, 1, ActionToViewTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taggedValueEClass, TaggedValue.class, "TaggedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaggedValue_Key(), ecorePackage.getEString(), "key", null, 0, 1, TaggedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaggedValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, TaggedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentationEClass, Documentation.class, "Documentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentation_Text(), ecorePackage.getEString(), "text", null, 0, 1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentation_Audience(), this.getEnumDocumentationAudienceType(), "audience", null, 0, 1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentation_DetailLevel(), ecorePackage.getEInt(), "detailLevel", null, 0, 1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oopClassifierEClass, OOPClassifier.class, "OOPClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOOPClassifier_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 0, 1, OOPClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOOPClassifier_Visibility(), this.getEnumVisibility(), "visibility", null, 0, 1, OOPClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOOPClassifier_ExternalExtends(), ecorePackage.getEString(), "externalExtends", null, 0, 1, OOPClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOOPClassifier_ExternalImplements(), ecorePackage.getEString(), "externalImplements", null, 0, 1, OOPClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classifierMemberEClass, ClassifierMember.class, "ClassifierMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassifierMember_Signature(), ecorePackage.getEString(), "signature", null, 0, 1, ClassifierMember.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassifierMember_Name(), ecorePackage.getEString(), "name", null, 0, 1, ClassifierMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassifierMember_Visibility(), this.getEnumVisibility(), "visibility", null, 0, 1, ClassifierMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassifierMember_IsStatic(), ecorePackage.getEBoolean(), "isStatic", null, 0, 1, ClassifierMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassifierMember_IsFinal(), ecorePackage.getEBoolean(), "isFinal", null, 0, 1, ClassifierMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassifierMember_TargetMode(), this.getEnumTargetModes(), "targetMode", null, 0, 1, ClassifierMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactClassifierEClass, ArtifactClassifier.class, "ArtifactClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(includeEClass, Include.class, "Include", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInclude_Code(), ecorePackage.getEString(), "code", null, 0, 1, Include.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInclude_UrlPath(), ecorePackage.getEString(), "urlPath", null, 0, 1, Include.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleSheetEClass, StyleSheet.class, "StyleSheet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStyleSheet_Code(), ecorePackage.getEString(), "code", null, 0, 1, StyleSheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewTransitionEClass, ViewTransition.class, "ViewTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewTransition_Source(), this.getControllerMemberExecutable(), null, "source", null, 1, 1, ViewTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewTransition_Target(), this.getControllerMemberExecutable(), null, "target", null, 1, 1, ViewTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerMemberEClass, ControllerMember.class, "ControllerMember", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControllerMember_Usecases(), this.getUsecase(), null, "usecases", null, 0, -1, ControllerMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerMember_Name(), ecorePackage.getEString(), "name", null, 0, 1, ControllerMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeration_Literals(), this.getEnumerationLiteral(), null, "literals", null, 0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumeration_Name(), ecorePackage.getEString(), "name", null, 0, 1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationLiteralEClass, EnumerationLiteral.class, "EnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumerationLiteral_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumerationLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, EnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dictionaryEClass, Dictionary.class, "Dictionary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDictionary_Label(), this.getLabel(), null, "label", null, 0, -1, Dictionary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDictionary_DefaultLang(), ecorePackage.getEString(), "defaultLang", null, 0, 1, Dictionary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabel_Text(), ecorePackage.getEString(), "text", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabel_Langstring(), this.getLangstring(), null, "langstring", null, 1, -1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(langstringEClass, Langstring.class, "Langstring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLangstring_Lang(), ecorePackage.getEString(), "lang", null, 0, 1, Langstring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLangstring_Text(), ecorePackage.getEString(), "text", null, 0, 1, Langstring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseTableEClass, DatabaseTable.class, "DatabaseTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabaseTable_Name(), ecorePackage.getEString(), "name", null, 0, 1, DatabaseTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseTable_SqlCreate(), ecorePackage.getEString(), "sqlCreate", null, 0, 1, DatabaseTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetEClass, Widget.class, "Widget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidget_WidgetType(), this.getEnumWidgetType(), "widgetType", "", 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_WidgetHint(), ecorePackage.getEString(), "widgetHint", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_ReadOnly(), ecorePackage.getEBoolean(), "readOnly", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Ignore(), ecorePackage.getEBoolean(), "ignore", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Filters(), this.getWidgetElement(), null, "filters", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Validators(), this.getWidgetElement(), null, "validators", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Options(), this.getWidgetOption(), null, "options", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_MenuActions(), this.getAction(), null, "menuActions", null, 0, -1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_ElementFormName(), ecorePackage.getEString(), "elementFormName", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_MultiLine(), ecorePackage.getEBoolean(), "multiLine", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_MultiChoice(), ecorePackage.getEBoolean(), "multiChoice", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usecaseSubsystemEClass, UsecaseSubsystem.class, "UsecaseSubsystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsecaseSubsystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, UsecaseSubsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsecaseSubsystem_Usecases(), this.getUsecase(), null, "usecases", null, 0, -1, UsecaseSubsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usecaseClassifierEClass, UsecaseClassifier.class, "UsecaseClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(usecaseEClass, Usecase.class, "Usecase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsecase_Text(), ecorePackage.getEString(), "text", null, 0, 1, Usecase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(areaEClass, Area.class, "Area", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArea_Views(), this.getView(), null, "views", null, 0, -1, Area.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArea_Style(), ecorePackage.getEString(), "style", null, 0, 1, Area.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerMemberExecutableEClass, ControllerMemberExecutable.class, "ControllerMemberExecutable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControllerMemberExecutable_Operation(), this.getOperation(), null, "operation", null, 1, 1, ControllerMemberExecutable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetElementEClass, WidgetElement.class, "WidgetElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidgetElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, WidgetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidgetElement_Options(), this.getWidgetOption(), null, "options", null, 0, -1, WidgetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidgetElement_MultiOptions(), this.getWidgetOption(), null, "multiOptions", null, 0, -1, WidgetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetOptionEClass, WidgetOption.class, "WidgetOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidgetOption_Name(), ecorePackage.getEString(), "name", null, 0, 1, WidgetOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidgetOption_Value(), ecorePackage.getEString(), "value", null, 0, 1, WidgetOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Name(), ecorePackage.getEString(), "name", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formEClass, Form.class, "Form", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForm_Widgets(), this.getWidget(), null, "widgets", null, 0, -1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForm_Operation(), this.getOperation(), null, "operation", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_Name(), ecorePackage.getEString(), "name", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetAttributeEClass, WidgetAttribute.class, "WidgetAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWidgetAttribute_Attribute(), this.getAttribute(), null, "attribute", null, 1, 1, WidgetAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetAssociationEClass, WidgetAssociation.class, "WidgetAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWidgetAssociation_Association(), this.getAssociationRelationship(), null, "association", null, 1, 1, WidgetAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidgetAssociation_ElementsMenuActions(), this.getAction(), null, "elementsMenuActions", null, 0, -1, WidgetAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumAjaxModesEEnum, EnumAjaxModes.class, "EnumAjaxModes");
		addEEnumLiteral(enumAjaxModesEEnum, EnumAjaxModes.AJAX_NO);
		addEEnumLiteral(enumAjaxModesEEnum, EnumAjaxModes.AJAX_YES);
		addEEnumLiteral(enumAjaxModesEEnum, EnumAjaxModes.AJAX_ONLY);

		initEEnum(enumMultiplicityEEnum, EnumMultiplicity.class, "EnumMultiplicity");
		addEEnumLiteral(enumMultiplicityEEnum, EnumMultiplicity.ZERO_OR_ONE);
		addEEnumLiteral(enumMultiplicityEEnum, EnumMultiplicity.ONE);
		addEEnumLiteral(enumMultiplicityEEnum, EnumMultiplicity.ZERO_OR_MORE);
		addEEnumLiteral(enumMultiplicityEEnum, EnumMultiplicity.ONE_OR_MORE);

		initEEnum(enumVisibilityEEnum, EnumVisibility.class, "EnumVisibility");
		addEEnumLiteral(enumVisibilityEEnum, EnumVisibility.PUBLIC);
		addEEnumLiteral(enumVisibilityEEnum, EnumVisibility.PACKAGE);
		addEEnumLiteral(enumVisibilityEEnum, EnumVisibility.PROTECTED);
		addEEnumLiteral(enumVisibilityEEnum, EnumVisibility.PRIVATE);

		initEEnum(enumDocumentationAudienceTypeEEnum, EnumDocumentationAudienceType.class, "EnumDocumentationAudienceType");
		addEEnumLiteral(enumDocumentationAudienceTypeEEnum, EnumDocumentationAudienceType.DOCUMENTATION_AUDIENCE_DEVELOPER);
		addEEnumLiteral(enumDocumentationAudienceTypeEEnum, EnumDocumentationAudienceType.DOCUMENTATION_AUDIENCE_USER);

		initEEnum(enumTargetModesEEnum, EnumTargetModes.class, "EnumTargetModes");
		addEEnumLiteral(enumTargetModesEEnum, EnumTargetModes.SERVER);
		addEEnumLiteral(enumTargetModesEEnum, EnumTargetModes.CLIENT);
		addEEnumLiteral(enumTargetModesEEnum, EnumTargetModes.BOTH);

		initEEnum(enumDirectionEEnum, EnumDirection.class, "EnumDirection");
		addEEnumLiteral(enumDirectionEEnum, EnumDirection.AB);
		addEEnumLiteral(enumDirectionEEnum, EnumDirection.BA);
		addEEnumLiteral(enumDirectionEEnum, EnumDirection.BOTH);

		initEEnum(enumDisplayModeEEnum, EnumDisplayMode.class, "EnumDisplayMode");
		addEEnumLiteral(enumDisplayModeEEnum, EnumDisplayMode.VIEW);
		addEEnumLiteral(enumDisplayModeEEnum, EnumDisplayMode.EDIT);
		addEEnumLiteral(enumDisplayModeEEnum, EnumDisplayMode.LISTENTRY);
		addEEnumLiteral(enumDisplayModeEEnum, EnumDisplayMode.DETAIL);
		addEEnumLiteral(enumDisplayModeEEnum, EnumDisplayMode.USER);
		addEEnumLiteral(enumDisplayModeEEnum, EnumDisplayMode.ADMIN);

		initEEnum(enumWidgetTypeEEnum, EnumWidgetType.class, "EnumWidgetType");
		addEEnumLiteral(enumWidgetTypeEEnum, EnumWidgetType.DEFAULT);
		addEEnumLiteral(enumWidgetTypeEEnum, EnumWidgetType.TEXT);
		addEEnumLiteral(enumWidgetTypeEEnum, EnumWidgetType.RESERVED);
		addEEnumLiteral(enumWidgetTypeEEnum, EnumWidgetType.SELECT);
		addEEnumLiteral(enumWidgetTypeEEnum, EnumWidgetType.SELECTEDIT);
		addEEnumLiteral(enumWidgetTypeEEnum, EnumWidgetType.CHECKBOX);
		addEEnumLiteral(enumWidgetTypeEEnum, EnumWidgetType.RADIOBUTTON);
		addEEnumLiteral(enumWidgetTypeEEnum, EnumWidgetType.DATE);
		addEEnumLiteral(enumWidgetTypeEEnum, EnumWidgetType.FILE);
		addEEnumLiteral(enumWidgetTypeEEnum, EnumWidgetType.PASSWORD);
		addEEnumLiteral(enumWidgetTypeEEnum, EnumWidgetType.LABEL);
		addEEnumLiteral(enumWidgetTypeEEnum, EnumWidgetType.SPINNER);

		initEEnum(enumProjectLayoutEEnum, EnumProjectLayout.class, "EnumProjectLayout");
		addEEnumLiteral(enumProjectLayoutEEnum, EnumProjectLayout.APPLICATION);
		addEEnumLiteral(enumProjectLayoutEEnum, EnumProjectLayout.MODULE);

		// Create resource
		createResource(eNS_URI);
	}

} //WavePackageImpl
