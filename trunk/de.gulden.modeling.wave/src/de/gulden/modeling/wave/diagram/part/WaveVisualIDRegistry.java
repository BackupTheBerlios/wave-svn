/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import de.gulden.modeling.wave.DependencyRelationship;
import de.gulden.modeling.wave.Model;
import de.gulden.modeling.wave.WavePackage;
import de.gulden.modeling.wave.diagram.edit.parts.ActionActionOperationCompartmentEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ActionEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ActionNameEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ActionToViewTransitionConditionEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ActionToViewTransitionEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ActorEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ActorNameEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.AreaEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.AssociationRelationshipEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.AssociationRelationshipMultiplicityAEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.AssociationRelationshipMultiplicityBEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.AssociationRelationshipNameEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.Attribute2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.AttributeEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.Class2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ClassClassAttributesCompartment2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ClassClassAttributesCompartmentEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ClassClassOperationsCompartment2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ClassClassOperationsCompartmentEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ClassEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ClassName2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ClassNameEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ControllerEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ControllerNameEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ControllerPageActionsCompartmentEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ControllerPageFunctionsCompartmentEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ControllerPageParametersCompartmentEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ControllerPageViewsCompartmentEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.DependencyRelationship2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.DependencyRelationship3EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.DependencyRelationshipEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.DependencyRelationshipStereotype2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.DependencyRelationshipStereotype3EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.DependencyRelationshipStereotypeEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.DocumentationEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.DocumentationTextEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.Include2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.IncludeEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.IncludeName2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.IncludeNameEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.InheritanceRelationshipEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.Interface2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.InterfaceEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.InterfaceInterfaceOperationsCompartment2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.InterfaceInterfaceOperationsCompartmentEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.InterfaceName2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.InterfaceNameEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ModelEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.Operation2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.Operation3EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.Operation4EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.Operation5EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.OperationEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.Package2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.PackageEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.PackageName2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.PackageNameEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.PackagePackageCompartment2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.PackagePackageCompartmentEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.RealizationRelationshipEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.StyleSheetEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.StyleSheetNameEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.UsecaseEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.UsecaseSubsystemEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.UsecaseSubsystemNameEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.UsecaseTextEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.View2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ViewEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ViewName2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ViewNameEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ViewTransitionEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ViewTransitionNameEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ViewViewAreaCompartment2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ViewViewAreaCompartmentEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ViewViewOperationCompartment2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ViewViewOperationCompartmentEditPart;
import de.gulden.modeling.wave.diagram.expressions.WaveAbstractExpression;
import de.gulden.modeling.wave.diagram.expressions.WaveOCLFactory;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class WaveVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "de.gulden.modeling.wave/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static WaveAbstractExpression DependencyRelationship_3001_Constraint;

	/**
	 * @generated
	 */
	private static WaveAbstractExpression DependencyRelationship_4016_Constraint;

	/**
	 * @generated
	 */
	private static WaveAbstractExpression DependencyRelationship_4017_Constraint;

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ModelEditPart.MODEL_ID.equals(view.getType())) {
				return ModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return de.gulden.modeling.wave.diagram.part.WaveVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				WaveDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (WavePackage.eINSTANCE.getModel().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Model) domainElement)) {
			return ModelEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = de.gulden.modeling.wave.diagram.part.WaveVisualIDRegistry
				.getModelID(containerView);
		if (!ModelEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = de.gulden.modeling.wave.diagram.part.WaveVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case AreaEditPart.VISUAL_ID:
			if (WavePackage.eINSTANCE.getView().isSuperTypeOf(
					domainElement.eClass())) {
				return View2EditPart.VISUAL_ID;
			}
			break;
		case ClassClassAttributesCompartmentEditPart.VISUAL_ID:
			if (WavePackage.eINSTANCE.getAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return AttributeEditPart.VISUAL_ID;
			}
			break;
		case ClassClassOperationsCompartmentEditPart.VISUAL_ID:
			if (WavePackage.eINSTANCE.getOperation().isSuperTypeOf(
					domainElement.eClass())) {
				return OperationEditPart.VISUAL_ID;
			}
			break;
		case InterfaceInterfaceOperationsCompartmentEditPart.VISUAL_ID:
			if (WavePackage.eINSTANCE.getOperation().isSuperTypeOf(
					domainElement.eClass())) {
				return Operation2EditPart.VISUAL_ID;
			}
			break;
		case ControllerPageParametersCompartmentEditPart.VISUAL_ID:
			if (WavePackage.eINSTANCE.getAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return Attribute2EditPart.VISUAL_ID;
			}
			break;
		case ControllerPageActionsCompartmentEditPart.VISUAL_ID:
			if (WavePackage.eINSTANCE.getAction().isSuperTypeOf(
					domainElement.eClass())) {
				return ActionEditPart.VISUAL_ID;
			}
			break;
		case ControllerPageViewsCompartmentEditPart.VISUAL_ID:
			if (WavePackage.eINSTANCE.getView().isSuperTypeOf(
					domainElement.eClass())) {
				return ViewEditPart.VISUAL_ID;
			}
			break;
		case ControllerPageFunctionsCompartmentEditPart.VISUAL_ID:
			if (WavePackage.eINSTANCE.getOperation().isSuperTypeOf(
					domainElement.eClass())) {
				return Operation5EditPart.VISUAL_ID;
			}
			break;
		case ActionActionOperationCompartmentEditPart.VISUAL_ID:
			if (WavePackage.eINSTANCE.getOperation().isSuperTypeOf(
					domainElement.eClass())) {
				return Operation3EditPart.VISUAL_ID;
			}
			break;
		case ViewViewOperationCompartmentEditPart.VISUAL_ID:
			if (WavePackage.eINSTANCE.getOperation().isSuperTypeOf(
					domainElement.eClass())) {
				return Operation4EditPart.VISUAL_ID;
			}
			break;
		case ViewViewAreaCompartmentEditPart.VISUAL_ID:
			if (WavePackage.eINSTANCE.getArea().isSuperTypeOf(
					domainElement.eClass())) {
				return AreaEditPart.VISUAL_ID;
			}
			break;
		case ViewViewOperationCompartment2EditPart.VISUAL_ID:
			if (WavePackage.eINSTANCE.getOperation().isSuperTypeOf(
					domainElement.eClass())) {
				return Operation4EditPart.VISUAL_ID;
			}
			break;
		case ViewViewAreaCompartment2EditPart.VISUAL_ID:
			if (WavePackage.eINSTANCE.getArea().isSuperTypeOf(
					domainElement.eClass())) {
				return AreaEditPart.VISUAL_ID;
			}
			break;
		case PackagePackageCompartmentEditPart.VISUAL_ID:
			if (WavePackage.eINSTANCE.getClass_().isSuperTypeOf(
					domainElement.eClass())) {
				return Class2EditPart.VISUAL_ID;
			}
			if (WavePackage.eINSTANCE.getInterface().isSuperTypeOf(
					domainElement.eClass())) {
				return Interface2EditPart.VISUAL_ID;
			}
			if (WavePackage.eINSTANCE.getPackage().isSuperTypeOf(
					domainElement.eClass())) {
				return Package2EditPart.VISUAL_ID;
			}
			if (WavePackage.eINSTANCE.getInclude().isSuperTypeOf(
					domainElement.eClass())) {
				return Include2EditPart.VISUAL_ID;
			}
			break;
		case ClassClassAttributesCompartment2EditPart.VISUAL_ID:
			if (WavePackage.eINSTANCE.getAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return AttributeEditPart.VISUAL_ID;
			}
			break;
		case ClassClassOperationsCompartment2EditPart.VISUAL_ID:
			if (WavePackage.eINSTANCE.getOperation().isSuperTypeOf(
					domainElement.eClass())) {
				return OperationEditPart.VISUAL_ID;
			}
			break;
		case InterfaceInterfaceOperationsCompartment2EditPart.VISUAL_ID:
			if (WavePackage.eINSTANCE.getOperation().isSuperTypeOf(
					domainElement.eClass())) {
				return Operation2EditPart.VISUAL_ID;
			}
			break;
		case PackagePackageCompartment2EditPart.VISUAL_ID:
			if (WavePackage.eINSTANCE.getClass_().isSuperTypeOf(
					domainElement.eClass())) {
				return Class2EditPart.VISUAL_ID;
			}
			if (WavePackage.eINSTANCE.getInterface().isSuperTypeOf(
					domainElement.eClass())) {
				return Interface2EditPart.VISUAL_ID;
			}
			if (WavePackage.eINSTANCE.getPackage().isSuperTypeOf(
					domainElement.eClass())) {
				return Package2EditPart.VISUAL_ID;
			}
			if (WavePackage.eINSTANCE.getInclude().isSuperTypeOf(
					domainElement.eClass())) {
				return Include2EditPart.VISUAL_ID;
			}
			break;
		case ModelEditPart.VISUAL_ID:
			if (WavePackage.eINSTANCE.getClass_().isSuperTypeOf(
					domainElement.eClass())) {
				return ClassEditPart.VISUAL_ID;
			}
			if (WavePackage.eINSTANCE.getInterface().isSuperTypeOf(
					domainElement.eClass())) {
				return InterfaceEditPart.VISUAL_ID;
			}
			if (WavePackage.eINSTANCE.getController().isSuperTypeOf(
					domainElement.eClass())) {
				return ControllerEditPart.VISUAL_ID;
			}
			if (WavePackage.eINSTANCE.getInclude().isSuperTypeOf(
					domainElement.eClass())) {
				return IncludeEditPart.VISUAL_ID;
			}
			if (WavePackage.eINSTANCE.getPackage().isSuperTypeOf(
					domainElement.eClass())) {
				return PackageEditPart.VISUAL_ID;
			}
			if (WavePackage.eINSTANCE.getDocumentation().isSuperTypeOf(
					domainElement.eClass())) {
				return DocumentationEditPart.VISUAL_ID;
			}
			if (WavePackage.eINSTANCE.getStyleSheet().isSuperTypeOf(
					domainElement.eClass())) {
				return StyleSheetEditPart.VISUAL_ID;
			}
			if (WavePackage.eINSTANCE.getUsecaseSubsystem().isSuperTypeOf(
					domainElement.eClass())) {
				return UsecaseSubsystemEditPart.VISUAL_ID;
			}
			if (WavePackage.eINSTANCE.getActor().isSuperTypeOf(
					domainElement.eClass())) {
				return ActorEditPart.VISUAL_ID;
			}
			if (WavePackage.eINSTANCE.getUsecase().isSuperTypeOf(
					domainElement.eClass())) {
				return UsecaseEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = de.gulden.modeling.wave.diagram.part.WaveVisualIDRegistry
				.getModelID(containerView);
		if (!ModelEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = de.gulden.modeling.wave.diagram.part.WaveVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ClassEditPart.VISUAL_ID:
			if (ClassNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassClassAttributesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassClassOperationsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InterfaceEditPart.VISUAL_ID:
			if (InterfaceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InterfaceInterfaceOperationsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControllerEditPart.VISUAL_ID:
			if (ControllerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControllerPageParametersCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControllerPageActionsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControllerPageViewsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControllerPageFunctionsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IncludeEditPart.VISUAL_ID:
			if (IncludeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackageEditPart.VISUAL_ID:
			if (PackageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackagePackageCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DocumentationEditPart.VISUAL_ID:
			if (DocumentationTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StyleSheetEditPart.VISUAL_ID:
			if (StyleSheetNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UsecaseSubsystemEditPart.VISUAL_ID:
			if (UsecaseSubsystemNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActorEditPart.VISUAL_ID:
			if (ActorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UsecaseEditPart.VISUAL_ID:
			if (UsecaseTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActionEditPart.VISUAL_ID:
			if (ActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActionActionOperationCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ViewEditPart.VISUAL_ID:
			if (ViewNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ViewViewOperationCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ViewViewAreaCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AreaEditPart.VISUAL_ID:
			if (View2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case View2EditPart.VISUAL_ID:
			if (ViewName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ViewViewOperationCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ViewViewAreaCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Class2EditPart.VISUAL_ID:
			if (ClassName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassClassAttributesCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassClassOperationsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Interface2EditPart.VISUAL_ID:
			if (InterfaceName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InterfaceInterfaceOperationsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Package2EditPart.VISUAL_ID:
			if (PackageName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackagePackageCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Include2EditPart.VISUAL_ID:
			if (IncludeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassClassAttributesCompartmentEditPart.VISUAL_ID:
			if (AttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassClassOperationsCompartmentEditPart.VISUAL_ID:
			if (OperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InterfaceInterfaceOperationsCompartmentEditPart.VISUAL_ID:
			if (Operation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControllerPageParametersCompartmentEditPart.VISUAL_ID:
			if (Attribute2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControllerPageActionsCompartmentEditPart.VISUAL_ID:
			if (ActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControllerPageViewsCompartmentEditPart.VISUAL_ID:
			if (ViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControllerPageFunctionsCompartmentEditPart.VISUAL_ID:
			if (Operation5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActionActionOperationCompartmentEditPart.VISUAL_ID:
			if (Operation3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ViewViewOperationCompartmentEditPart.VISUAL_ID:
			if (Operation4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ViewViewAreaCompartmentEditPart.VISUAL_ID:
			if (AreaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ViewViewOperationCompartment2EditPart.VISUAL_ID:
			if (Operation4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ViewViewAreaCompartment2EditPart.VISUAL_ID:
			if (AreaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackagePackageCompartmentEditPart.VISUAL_ID:
			if (Class2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Interface2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Package2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Include2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassClassAttributesCompartment2EditPart.VISUAL_ID:
			if (AttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassClassOperationsCompartment2EditPart.VISUAL_ID:
			if (OperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InterfaceInterfaceOperationsCompartment2EditPart.VISUAL_ID:
			if (Operation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackagePackageCompartment2EditPart.VISUAL_ID:
			if (Class2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Interface2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Package2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Include2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ModelEditPart.VISUAL_ID:
			if (ClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InterfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControllerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IncludeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DocumentationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StyleSheetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UsecaseSubsystemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UsecaseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DependencyRelationshipEditPart.VISUAL_ID:
			if (DependencyRelationshipStereotypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssociationRelationshipEditPart.VISUAL_ID:
			if (AssociationRelationshipNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationRelationshipMultiplicityAEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationRelationshipMultiplicityBEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActionToViewTransitionEditPart.VISUAL_ID:
			if (ActionToViewTransitionConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ViewTransitionEditPart.VISUAL_ID:
			if (ViewTransitionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DependencyRelationship2EditPart.VISUAL_ID:
			if (DependencyRelationshipStereotype2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DependencyRelationship3EditPart.VISUAL_ID:
			if (DependencyRelationshipStereotype3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (WavePackage.eINSTANCE.getDependencyRelationship().isSuperTypeOf(
				domainElement.eClass())
				&& isDependencyRelationship_3001((DependencyRelationship) domainElement)) {
			return DependencyRelationshipEditPart.VISUAL_ID;
		}
		if (WavePackage.eINSTANCE.getInheritanceRelationship().isSuperTypeOf(
				domainElement.eClass())) {
			return InheritanceRelationshipEditPart.VISUAL_ID;
		}
		if (WavePackage.eINSTANCE.getRealizationRelationship().isSuperTypeOf(
				domainElement.eClass())) {
			return RealizationRelationshipEditPart.VISUAL_ID;
		}
		if (WavePackage.eINSTANCE.getAssociationRelationship().isSuperTypeOf(
				domainElement.eClass())) {
			return AssociationRelationshipEditPart.VISUAL_ID;
		}
		if (WavePackage.eINSTANCE.getActionToViewTransition().isSuperTypeOf(
				domainElement.eClass())) {
			return ActionToViewTransitionEditPart.VISUAL_ID;
		}
		if (WavePackage.eINSTANCE.getViewTransition().isSuperTypeOf(
				domainElement.eClass())) {
			return ViewTransitionEditPart.VISUAL_ID;
		}
		if (WavePackage.eINSTANCE.getDependencyRelationship().isSuperTypeOf(
				domainElement.eClass())
				&& isDependencyRelationship_4016((DependencyRelationship) domainElement)) {
			return DependencyRelationship2EditPart.VISUAL_ID;
		}
		if (WavePackage.eINSTANCE.getDependencyRelationship().isSuperTypeOf(
				domainElement.eClass())
				&& isDependencyRelationship_4017((DependencyRelationship) domainElement)) {
			return DependencyRelationship3EditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Model element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static boolean isDependencyRelationship_3001(
			DependencyRelationship domainElement) {
		if (DependencyRelationship_3001_Constraint == null) { // lazy initialization
			DependencyRelationship_3001_Constraint = WaveOCLFactory
					.getExpression(
							"self.stereotype->isEmpty()", WavePackage.eINSTANCE.getDependencyRelationship()); //$NON-NLS-1$
		}
		Object result = DependencyRelationship_3001_Constraint
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isDependencyRelationship_4016(
			DependencyRelationship domainElement) {
		if (DependencyRelationship_4016_Constraint == null) { // lazy initialization
			DependencyRelationship_4016_Constraint = WaveOCLFactory
					.getExpression(
							"self.stereotype=\'includes\'", WavePackage.eINSTANCE.getDependencyRelationship()); //$NON-NLS-1$
		}
		Object result = DependencyRelationship_4016_Constraint
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isDependencyRelationship_4017(
			DependencyRelationship domainElement) {
		if (DependencyRelationship_4017_Constraint == null) { // lazy initialization
			DependencyRelationship_4017_Constraint = WaveOCLFactory
					.getExpression(
							"self.stereotype=\'extends\'", WavePackage.eINSTANCE.getDependencyRelationship()); //$NON-NLS-1$
		}
		Object result = DependencyRelationship_4017_Constraint
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

}
