/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;

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
import de.gulden.modeling.wave.diagram.edit.parts.ModelMemberDocsEditPart;
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
import de.gulden.modeling.wave.diagram.edit.parts.ViewTransitionConditionEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ViewTransitionEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ViewViewAreaCompartment2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ViewViewAreaCompartmentEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ViewViewOperationCompartment2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ViewViewOperationCompartmentEditPart;
import de.gulden.modeling.wave.diagram.part.WaveVisualIDRegistry;
import de.gulden.modeling.wave.diagram.view.factories.ActionActionOperationCompartmentViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.ActionNameViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.ActionToViewTransitionConditionViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.ActionToViewTransitionViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.ActionViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.ActorNameViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.ActorViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.AreaViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.AssociationRelationshipMultiplicityAViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.AssociationRelationshipMultiplicityBViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.AssociationRelationshipNameViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.AssociationRelationshipViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.Attribute2ViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.AttributeViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.Class2ViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.ClassClassAttributesCompartment2ViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.ClassClassAttributesCompartmentViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.ClassClassOperationsCompartment2ViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.ClassClassOperationsCompartmentViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.ClassName2ViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.ClassNameViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.ClassViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.ControllerNameViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.ControllerPageActionsCompartmentViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.ControllerPageFunctionsCompartmentViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.ControllerPageParametersCompartmentViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.ControllerPageViewsCompartmentViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.ControllerViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.DependencyRelationship2ViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.DependencyRelationship3ViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.DependencyRelationshipStereotype2ViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.DependencyRelationshipStereotype3ViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.DependencyRelationshipStereotypeViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.DependencyRelationshipViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.DocumentationTextViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.DocumentationViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.Include2ViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.IncludeName2ViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.IncludeNameViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.IncludeViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.InheritanceRelationshipViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.Interface2ViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.InterfaceInterfaceOperationsCompartment2ViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.InterfaceInterfaceOperationsCompartmentViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.InterfaceName2ViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.InterfaceNameViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.InterfaceViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.ModelMemberDocsViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.ModelViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.Operation2ViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.Operation3ViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.Operation4ViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.Operation5ViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.OperationViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.Package2ViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.PackageName2ViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.PackageNameViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.PackagePackageCompartment2ViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.PackagePackageCompartmentViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.PackageViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.RealizationRelationshipViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.StyleSheetNameViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.StyleSheetViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.UsecaseSubsystemNameViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.UsecaseSubsystemViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.UsecaseTextViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.UsecaseViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.View2ViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.ViewName2ViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.ViewNameViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.ViewTransitionConditionViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.ViewTransitionViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.ViewViewAreaCompartment2ViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.ViewViewAreaCompartmentViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.ViewViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.ViewViewOperationCompartment2ViewFactory;
import de.gulden.modeling.wave.diagram.view.factories.ViewViewOperationCompartmentViewFactory;

/**
 * @generated
 */
public class WaveViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter,
			String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (ModelEditPart.MODEL_ID.equals(diagramKind)
				&& WaveVisualIDRegistry.getDiagramVisualID(semanticElement) != -1) {
			return ModelViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		if (containerView == null) {
			return null;
		}
		IElementType elementType = getSemanticElementType(semanticAdapter);
		EObject domainElement = getSemanticElement(semanticAdapter);
		int visualID;
		if (semanticHint == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return null;
			}
			visualID = WaveVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		} else {
			visualID = WaveVisualIDRegistry.getVisualID(semanticHint);
			if (elementType != null) {
				// Semantic hint is specified together with element type.
				// Both parameters should describe exactly the same diagram element.
				// In addition we check that visualID returned by VisualIDRegistry.getNodeVisualID() for
				// domainElement (if specified) is the same as in element type.
				if (!WaveElementTypes.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return null; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType)
						.getSemanticHint();
				if (!semanticHint.equals(elementTypeHint)) {
					return null; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null
						&& visualID != WaveVisualIDRegistry.getNodeVisualID(
								containerView, domainElement)) {
					return null; // visual id for node EClass should match visual id from element type
				}
			} else {
				// Element type is not specified. Domain element should be present (except pure design elements).
				// This method is called with EObjectAdapter as parameter from:
				//   - ViewService.createNode(View container, EObject eObject, String type, PreferencesHint preferencesHint) 
				//   - generated ViewFactory.decorateView() for parent element
				if (!ModelEditPart.MODEL_ID.equals(WaveVisualIDRegistry
						.getModelID(containerView))) {
					return null; // foreign diagram
				}
				switch (visualID) {
				case ClassEditPart.VISUAL_ID:
				case InterfaceEditPart.VISUAL_ID:
				case ControllerEditPart.VISUAL_ID:
				case IncludeEditPart.VISUAL_ID:
				case PackageEditPart.VISUAL_ID:
				case DocumentationEditPart.VISUAL_ID:
				case StyleSheetEditPart.VISUAL_ID:
				case UsecaseSubsystemEditPart.VISUAL_ID:
				case ActorEditPart.VISUAL_ID:
				case UsecaseEditPart.VISUAL_ID:
				case AttributeEditPart.VISUAL_ID:
				case OperationEditPart.VISUAL_ID:
				case ActionEditPart.VISUAL_ID:
				case ViewEditPart.VISUAL_ID:
				case AreaEditPart.VISUAL_ID:
				case Operation2EditPart.VISUAL_ID:
				case Attribute2EditPart.VISUAL_ID:
				case Operation3EditPart.VISUAL_ID:
				case Operation4EditPart.VISUAL_ID:
				case View2EditPart.VISUAL_ID:
				case Operation5EditPart.VISUAL_ID:
				case Class2EditPart.VISUAL_ID:
				case Interface2EditPart.VISUAL_ID:
				case Package2EditPart.VISUAL_ID:
				case Include2EditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != WaveVisualIDRegistry
									.getNodeVisualID(containerView,
											domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case ClassNameEditPart.VISUAL_ID:
				case ClassClassAttributesCompartmentEditPart.VISUAL_ID:
				case ClassClassOperationsCompartmentEditPart.VISUAL_ID:
					if (ClassEditPart.VISUAL_ID != WaveVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case InterfaceNameEditPart.VISUAL_ID:
				case InterfaceInterfaceOperationsCompartmentEditPart.VISUAL_ID:
					if (InterfaceEditPart.VISUAL_ID != WaveVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ControllerNameEditPart.VISUAL_ID:
				case ControllerPageParametersCompartmentEditPart.VISUAL_ID:
				case ControllerPageActionsCompartmentEditPart.VISUAL_ID:
				case ControllerPageViewsCompartmentEditPart.VISUAL_ID:
				case ControllerPageFunctionsCompartmentEditPart.VISUAL_ID:
					if (ControllerEditPart.VISUAL_ID != WaveVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case IncludeNameEditPart.VISUAL_ID:
					if (IncludeEditPart.VISUAL_ID != WaveVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PackageNameEditPart.VISUAL_ID:
				case PackagePackageCompartmentEditPart.VISUAL_ID:
					if (PackageEditPart.VISUAL_ID != WaveVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DocumentationTextEditPart.VISUAL_ID:
					if (DocumentationEditPart.VISUAL_ID != WaveVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case StyleSheetNameEditPart.VISUAL_ID:
					if (StyleSheetEditPart.VISUAL_ID != WaveVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case UsecaseSubsystemNameEditPart.VISUAL_ID:
					if (UsecaseSubsystemEditPart.VISUAL_ID != WaveVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ActorNameEditPart.VISUAL_ID:
					if (ActorEditPart.VISUAL_ID != WaveVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case UsecaseTextEditPart.VISUAL_ID:
					if (UsecaseEditPart.VISUAL_ID != WaveVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ActionNameEditPart.VISUAL_ID:
				case ActionActionOperationCompartmentEditPart.VISUAL_ID:
					if (ActionEditPart.VISUAL_ID != WaveVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ViewNameEditPart.VISUAL_ID:
				case ViewViewOperationCompartmentEditPart.VISUAL_ID:
				case ViewViewAreaCompartmentEditPart.VISUAL_ID:
					if (ViewEditPart.VISUAL_ID != WaveVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ViewName2EditPart.VISUAL_ID:
				case ViewViewOperationCompartment2EditPart.VISUAL_ID:
				case ViewViewAreaCompartment2EditPart.VISUAL_ID:
					if (View2EditPart.VISUAL_ID != WaveVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ClassName2EditPart.VISUAL_ID:
				case ClassClassAttributesCompartment2EditPart.VISUAL_ID:
				case ClassClassOperationsCompartment2EditPart.VISUAL_ID:
					if (Class2EditPart.VISUAL_ID != WaveVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case InterfaceName2EditPart.VISUAL_ID:
				case InterfaceInterfaceOperationsCompartment2EditPart.VISUAL_ID:
					if (Interface2EditPart.VISUAL_ID != WaveVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PackageName2EditPart.VISUAL_ID:
				case PackagePackageCompartment2EditPart.VISUAL_ID:
					if (Package2EditPart.VISUAL_ID != WaveVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case IncludeName2EditPart.VISUAL_ID:
					if (Include2EditPart.VISUAL_ID != WaveVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DependencyRelationshipStereotypeEditPart.VISUAL_ID:
					if (DependencyRelationshipEditPart.VISUAL_ID != WaveVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AssociationRelationshipNameEditPart.VISUAL_ID:
				case AssociationRelationshipMultiplicityAEditPart.VISUAL_ID:
				case AssociationRelationshipMultiplicityBEditPart.VISUAL_ID:
					if (AssociationRelationshipEditPart.VISUAL_ID != WaveVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ActionToViewTransitionConditionEditPart.VISUAL_ID:
					if (ActionToViewTransitionEditPart.VISUAL_ID != WaveVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ViewTransitionConditionEditPart.VISUAL_ID:
					if (ViewTransitionEditPart.VISUAL_ID != WaveVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DependencyRelationshipStereotype2EditPart.VISUAL_ID:
					if (DependencyRelationship2EditPart.VISUAL_ID != WaveVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DependencyRelationshipStereotype3EditPart.VISUAL_ID:
					if (DependencyRelationship3EditPart.VISUAL_ID != WaveVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				default:
					return null;
				}
			}
		}
		return getNodeViewClass(containerView, visualID);
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(View containerView, int visualID) {
		if (containerView == null
				|| !WaveVisualIDRegistry.canCreateNode(containerView, visualID)) {
			return null;
		}
		switch (visualID) {
		case ClassEditPart.VISUAL_ID:
			return ClassViewFactory.class;
		case ClassNameEditPart.VISUAL_ID:
			return ClassNameViewFactory.class;
		case InterfaceEditPart.VISUAL_ID:
			return InterfaceViewFactory.class;
		case InterfaceNameEditPart.VISUAL_ID:
			return InterfaceNameViewFactory.class;
		case ControllerEditPart.VISUAL_ID:
			return ControllerViewFactory.class;
		case ControllerNameEditPart.VISUAL_ID:
			return ControllerNameViewFactory.class;
		case IncludeEditPart.VISUAL_ID:
			return IncludeViewFactory.class;
		case IncludeNameEditPart.VISUAL_ID:
			return IncludeNameViewFactory.class;
		case PackageEditPart.VISUAL_ID:
			return PackageViewFactory.class;
		case PackageNameEditPart.VISUAL_ID:
			return PackageNameViewFactory.class;
		case DocumentationEditPart.VISUAL_ID:
			return DocumentationViewFactory.class;
		case DocumentationTextEditPart.VISUAL_ID:
			return DocumentationTextViewFactory.class;
		case StyleSheetEditPart.VISUAL_ID:
			return StyleSheetViewFactory.class;
		case StyleSheetNameEditPart.VISUAL_ID:
			return StyleSheetNameViewFactory.class;
		case UsecaseSubsystemEditPart.VISUAL_ID:
			return UsecaseSubsystemViewFactory.class;
		case UsecaseSubsystemNameEditPart.VISUAL_ID:
			return UsecaseSubsystemNameViewFactory.class;
		case ActorEditPart.VISUAL_ID:
			return ActorViewFactory.class;
		case ActorNameEditPart.VISUAL_ID:
			return ActorNameViewFactory.class;
		case UsecaseEditPart.VISUAL_ID:
			return UsecaseViewFactory.class;
		case UsecaseTextEditPart.VISUAL_ID:
			return UsecaseTextViewFactory.class;
		case AttributeEditPart.VISUAL_ID:
			return AttributeViewFactory.class;
		case OperationEditPart.VISUAL_ID:
			return OperationViewFactory.class;
		case Operation2EditPart.VISUAL_ID:
			return Operation2ViewFactory.class;
		case Attribute2EditPart.VISUAL_ID:
			return Attribute2ViewFactory.class;
		case ActionEditPart.VISUAL_ID:
			return ActionViewFactory.class;
		case ActionNameEditPart.VISUAL_ID:
			return ActionNameViewFactory.class;
		case Operation3EditPart.VISUAL_ID:
			return Operation3ViewFactory.class;
		case ViewEditPart.VISUAL_ID:
			return ViewViewFactory.class;
		case ViewNameEditPart.VISUAL_ID:
			return ViewNameViewFactory.class;
		case Operation4EditPart.VISUAL_ID:
			return Operation4ViewFactory.class;
		case AreaEditPart.VISUAL_ID:
			return AreaViewFactory.class;
		case View2EditPart.VISUAL_ID:
			return View2ViewFactory.class;
		case ViewName2EditPart.VISUAL_ID:
			return ViewName2ViewFactory.class;
		case Operation5EditPart.VISUAL_ID:
			return Operation5ViewFactory.class;
		case Class2EditPart.VISUAL_ID:
			return Class2ViewFactory.class;
		case ClassName2EditPart.VISUAL_ID:
			return ClassName2ViewFactory.class;
		case Interface2EditPart.VISUAL_ID:
			return Interface2ViewFactory.class;
		case InterfaceName2EditPart.VISUAL_ID:
			return InterfaceName2ViewFactory.class;
		case Package2EditPart.VISUAL_ID:
			return Package2ViewFactory.class;
		case PackageName2EditPart.VISUAL_ID:
			return PackageName2ViewFactory.class;
		case Include2EditPart.VISUAL_ID:
			return Include2ViewFactory.class;
		case IncludeName2EditPart.VISUAL_ID:
			return IncludeName2ViewFactory.class;
		case ClassClassAttributesCompartmentEditPart.VISUAL_ID:
			return ClassClassAttributesCompartmentViewFactory.class;
		case ClassClassOperationsCompartmentEditPart.VISUAL_ID:
			return ClassClassOperationsCompartmentViewFactory.class;
		case InterfaceInterfaceOperationsCompartmentEditPart.VISUAL_ID:
			return InterfaceInterfaceOperationsCompartmentViewFactory.class;
		case ControllerPageParametersCompartmentEditPart.VISUAL_ID:
			return ControllerPageParametersCompartmentViewFactory.class;
		case ControllerPageActionsCompartmentEditPart.VISUAL_ID:
			return ControllerPageActionsCompartmentViewFactory.class;
		case ControllerPageViewsCompartmentEditPart.VISUAL_ID:
			return ControllerPageViewsCompartmentViewFactory.class;
		case ControllerPageFunctionsCompartmentEditPart.VISUAL_ID:
			return ControllerPageFunctionsCompartmentViewFactory.class;
		case ActionActionOperationCompartmentEditPart.VISUAL_ID:
			return ActionActionOperationCompartmentViewFactory.class;
		case ViewViewOperationCompartmentEditPart.VISUAL_ID:
			return ViewViewOperationCompartmentViewFactory.class;
		case ViewViewAreaCompartmentEditPart.VISUAL_ID:
			return ViewViewAreaCompartmentViewFactory.class;
		case ViewViewOperationCompartment2EditPart.VISUAL_ID:
			return ViewViewOperationCompartment2ViewFactory.class;
		case ViewViewAreaCompartment2EditPart.VISUAL_ID:
			return ViewViewAreaCompartment2ViewFactory.class;
		case PackagePackageCompartmentEditPart.VISUAL_ID:
			return PackagePackageCompartmentViewFactory.class;
		case ClassClassAttributesCompartment2EditPart.VISUAL_ID:
			return ClassClassAttributesCompartment2ViewFactory.class;
		case ClassClassOperationsCompartment2EditPart.VISUAL_ID:
			return ClassClassOperationsCompartment2ViewFactory.class;
		case InterfaceInterfaceOperationsCompartment2EditPart.VISUAL_ID:
			return InterfaceInterfaceOperationsCompartment2ViewFactory.class;
		case PackagePackageCompartment2EditPart.VISUAL_ID:
			return PackagePackageCompartment2ViewFactory.class;
		case DependencyRelationshipStereotypeEditPart.VISUAL_ID:
			return DependencyRelationshipStereotypeViewFactory.class;
		case AssociationRelationshipNameEditPart.VISUAL_ID:
			return AssociationRelationshipNameViewFactory.class;
		case AssociationRelationshipMultiplicityAEditPart.VISUAL_ID:
			return AssociationRelationshipMultiplicityAViewFactory.class;
		case AssociationRelationshipMultiplicityBEditPart.VISUAL_ID:
			return AssociationRelationshipMultiplicityBViewFactory.class;
		case ActionToViewTransitionConditionEditPart.VISUAL_ID:
			return ActionToViewTransitionConditionViewFactory.class;
		case ViewTransitionConditionEditPart.VISUAL_ID:
			return ViewTransitionConditionViewFactory.class;
		case DependencyRelationshipStereotype2EditPart.VISUAL_ID:
			return DependencyRelationshipStereotype2ViewFactory.class;
		case DependencyRelationshipStereotype3EditPart.VISUAL_ID:
			return DependencyRelationshipStereotype3ViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (!WaveElementTypes.isKnownElementType(elementType)
				|| (!(elementType instanceof IHintedType))) {
			return null; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null) {
			return null; // our hint is visual id and must be specified
		}
		if (semanticHint != null && !semanticHint.equals(elementTypeHint)) {
			return null; // if semantic hint is specified it should be the same as in element type
		}
		int visualID = WaveVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null
				&& visualID != WaveVisualIDRegistry
						.getLinkWithClassVisualID(domainElement)) {
			return null; // visual id for link EClass should match visual id from element type
		}
		return getEdgeViewClass(visualID);
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(int visualID) {
		switch (visualID) {
		case DependencyRelationshipEditPart.VISUAL_ID:
			return DependencyRelationshipViewFactory.class;
		case InheritanceRelationshipEditPart.VISUAL_ID:
			return InheritanceRelationshipViewFactory.class;
		case RealizationRelationshipEditPart.VISUAL_ID:
			return RealizationRelationshipViewFactory.class;
		case AssociationRelationshipEditPart.VISUAL_ID:
			return AssociationRelationshipViewFactory.class;
		case ActionToViewTransitionEditPart.VISUAL_ID:
			return ActionToViewTransitionViewFactory.class;
		case ModelMemberDocsEditPart.VISUAL_ID:
			return ModelMemberDocsViewFactory.class;
		case ViewTransitionEditPart.VISUAL_ID:
			return ViewTransitionViewFactory.class;
		case DependencyRelationship2EditPart.VISUAL_ID:
			return DependencyRelationship2ViewFactory.class;
		case DependencyRelationship3EditPart.VISUAL_ID:
			return DependencyRelationship3ViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}
}
