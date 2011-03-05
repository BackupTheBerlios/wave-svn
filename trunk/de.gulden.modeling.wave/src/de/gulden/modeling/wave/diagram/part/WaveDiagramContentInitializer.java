/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.diagram.part;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import de.gulden.modeling.wave.Model;
import de.gulden.modeling.wave.diagram.edit.parts.ActionActionOperationCompartmentEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ActionEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ActionToViewTransitionEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ActorEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.AreaEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.AssociationRelationshipEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.Attribute2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.AttributeEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.Class2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ClassClassAttributesCompartment2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ClassClassAttributesCompartmentEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ClassClassOperationsCompartment2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ClassClassOperationsCompartmentEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ClassEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ControllerEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ControllerPageActionsCompartmentEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ControllerPageFunctionsCompartmentEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ControllerPageParametersCompartmentEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ControllerPageViewsCompartmentEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.DependencyRelationship2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.DependencyRelationship3EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.DependencyRelationshipEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.DocumentationEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.Include2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.IncludeEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.InheritanceRelationshipEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.Interface2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.InterfaceEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.InterfaceInterfaceOperationsCompartment2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.InterfaceInterfaceOperationsCompartmentEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ModelEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.Operation2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.Operation3EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.Operation4EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.Operation5EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.OperationEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.Package2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.PackageEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.PackagePackageCompartment2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.PackagePackageCompartmentEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.RealizationRelationshipEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.StyleSheetEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.UsecaseEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.UsecaseSubsystemEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.View2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ViewEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ViewTransitionEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ViewViewAreaCompartment2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ViewViewAreaCompartmentEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ViewViewOperationCompartment2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ViewViewOperationCompartmentEditPart;

/**
 * @generated
 */
public class WaveDiagramContentInitializer {

	/**
	 * @generated
	 */
	private Map myDomain2NotationMap = new HashMap();

	/**
	 * @generated
	 */
	private Collection myLinkDescriptors = new LinkedList();

	/**
	 * @generated
	 */
	public void initDiagramContent(Diagram diagram) {
		if (!ModelEditPart.MODEL_ID.equals(diagram.getType())) {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Incorrect diagram passed as a parameter: "
							+ diagram.getType());
			return;
		}
		if (false == diagram.getElement() instanceof Model) {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Incorrect diagram element specified: "
							+ diagram.getElement() + " instead of Model");
			return;
		}
		createModel_1000Children(diagram);
		createLinks(diagram);
	}

	/**
	 * @generated
	 */
	private void createModel_1000Children(View view) {
		Collection childNodeDescriptors = WaveDiagramUpdater
				.getModel_1000SemanticChildren(view);
		for (Iterator it = childNodeDescriptors.iterator(); it.hasNext();) {
			createNode(view, (WaveNodeDescriptor) it.next());
		}
	}

	/**
	 * @generated
	 */
	private void createClass_2017Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(WaveDiagramUpdater
				.getClass_2017OutgoingLinks(view));
		createClassClassAttributesCompartment_7004Children(getCompartment(view,
				ClassClassAttributesCompartmentEditPart.VISUAL_ID));
		createClassClassOperationsCompartment_7005Children(getCompartment(view,
				ClassClassOperationsCompartmentEditPart.VISUAL_ID));

	}

	/**
	 * @generated
	 */
	private void createInterface_2018Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(WaveDiagramUpdater
				.getInterface_2018OutgoingLinks(view));
		createInterfaceInterfaceOperationsCompartment_7006Children(getCompartment(
				view, InterfaceInterfaceOperationsCompartmentEditPart.VISUAL_ID));

	}

	/**
	 * @generated
	 */
	private void createController_2026Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(WaveDiagramUpdater
				.getController_2026OutgoingLinks(view));
		createControllerPageParametersCompartment_7017Children(getCompartment(
				view, ControllerPageParametersCompartmentEditPart.VISUAL_ID));
		createControllerPageActionsCompartment_7018Children(getCompartment(
				view, ControllerPageActionsCompartmentEditPart.VISUAL_ID));
		createControllerPageViewsCompartment_7019Children(getCompartment(view,
				ControllerPageViewsCompartmentEditPart.VISUAL_ID));
		createControllerPageFunctionsCompartment_7020Children(getCompartment(
				view, ControllerPageFunctionsCompartmentEditPart.VISUAL_ID));

	}

	/**
	 * @generated
	 */
	private void createInclude_2020Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(WaveDiagramUpdater
				.getInclude_2020OutgoingLinks(view));

	}

	/**
	 * @generated
	 */
	private void createPackage_2021Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(WaveDiagramUpdater
				.getPackage_2021OutgoingLinks(view));
		createPackagePackageCompartment_7014Children(getCompartment(view,
				PackagePackageCompartmentEditPart.VISUAL_ID));

	}

	/**
	 * @generated
	 */
	private void createDocumentation_2013Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(WaveDiagramUpdater
				.getDocumentation_2013OutgoingLinks(view));

	}

	/**
	 * @generated
	 */
	private void createStyleSheet_2022Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(WaveDiagramUpdater
				.getStyleSheet_2022OutgoingLinks(view));

	}

	/**
	 * @generated
	 */
	private void createUsecaseSubsystem_2023Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(WaveDiagramUpdater
				.getUsecaseSubsystem_2023OutgoingLinks(view));

	}

	/**
	 * @generated
	 */
	private void createActor_2024Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(WaveDiagramUpdater
				.getActor_2024OutgoingLinks(view));

	}

	/**
	 * @generated
	 */
	private void createUsecase_2025Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(WaveDiagramUpdater
				.getUsecase_2025OutgoingLinks(view));

	}

	/**
	 * @generated
	 */
	private void createAttribute_2001Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(WaveDiagramUpdater
				.getAttribute_2001OutgoingLinks(view));

	}

	/**
	 * @generated
	 */
	private void createOperation_2002Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(WaveDiagramUpdater
				.getOperation_2002OutgoingLinks(view));

	}

	/**
	 * @generated
	 */
	private void createOperation_2003Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(WaveDiagramUpdater
				.getOperation_2003OutgoingLinks(view));

	}

	/**
	 * @generated
	 */
	private void createAttribute_2004Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(WaveDiagramUpdater
				.getAttribute_2004OutgoingLinks(view));

	}

	/**
	 * @generated
	 */
	private void createAction_13006Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(WaveDiagramUpdater
				.getAction_13006OutgoingLinks(view));
		createActionActionOperationCompartment_7021Children(getCompartment(
				view, ActionActionOperationCompartmentEditPart.VISUAL_ID));

	}

	/**
	 * @generated
	 */
	private void createOperation_13008Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(WaveDiagramUpdater
				.getOperation_13008OutgoingLinks(view));

	}

	/**
	 * @generated
	 */
	private void createView_13007Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(WaveDiagramUpdater
				.getView_13007OutgoingLinks(view));
		createViewViewOperationCompartment_7022Children(getCompartment(view,
				ViewViewOperationCompartmentEditPart.VISUAL_ID));
		createViewViewAreaCompartment_7023Children(getCompartment(view,
				ViewViewAreaCompartmentEditPart.VISUAL_ID));

	}

	/**
	 * @generated
	 */
	private void createOperation_13009Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(WaveDiagramUpdater
				.getOperation_13009OutgoingLinks(view));

	}

	/**
	 * @generated
	 */
	private void createArea_13001Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(WaveDiagramUpdater
				.getArea_13001OutgoingLinks(view));
		Collection childNodeDescriptors = WaveDiagramUpdater
				.getArea_13001SemanticChildren(view);
		for (Iterator it = childNodeDescriptors.iterator(); it.hasNext();) {
			createNode(view, (WaveNodeDescriptor) it.next());
		}

	}

	/**
	 * @generated
	 */
	private void createView_13002Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(WaveDiagramUpdater
				.getView_13002OutgoingLinks(view));
		createViewViewOperationCompartment_7002Children(getCompartment(view,
				ViewViewOperationCompartment2EditPart.VISUAL_ID));
		createViewViewAreaCompartment_7003Children(getCompartment(view,
				ViewViewAreaCompartment2EditPart.VISUAL_ID));

	}

	/**
	 * @generated
	 */
	private void createOperation_2009Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(WaveDiagramUpdater
				.getOperation_2009OutgoingLinks(view));

	}

	/**
	 * @generated
	 */
	private void createClass_13003Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(WaveDiagramUpdater
				.getClass_13003OutgoingLinks(view));
		createClassClassAttributesCompartment_7012Children(getCompartment(view,
				ClassClassAttributesCompartment2EditPart.VISUAL_ID));
		createClassClassOperationsCompartment_7013Children(getCompartment(view,
				ClassClassOperationsCompartment2EditPart.VISUAL_ID));

	}

	/**
	 * @generated
	 */
	private void createInterface_13004Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(WaveDiagramUpdater
				.getInterface_13004OutgoingLinks(view));
		createInterfaceInterfaceOperationsCompartment_7015Children(getCompartment(
				view,
				InterfaceInterfaceOperationsCompartment2EditPart.VISUAL_ID));

	}

	/**
	 * @generated
	 */
	private void createPackage_13005Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(WaveDiagramUpdater
				.getPackage_13005OutgoingLinks(view));
		createPackagePackageCompartment_7016Children(getCompartment(view,
				PackagePackageCompartment2EditPart.VISUAL_ID));

	}

	/**
	 * @generated
	 */
	private void createInclude_13010Children(View view) {
		myDomain2NotationMap.put(view.getElement(), view);
		myLinkDescriptors.addAll(WaveDiagramUpdater
				.getInclude_13010OutgoingLinks(view));

	}

	/**
	 * @generated
	 */
	private void createClassClassAttributesCompartment_7004Children(View view) {
		Collection childNodeDescriptors = WaveDiagramUpdater
				.getClassClassAttributesCompartment_7004SemanticChildren(view);
		for (Iterator it = childNodeDescriptors.iterator(); it.hasNext();) {
			createNode(view, (WaveNodeDescriptor) it.next());
		}
	}

	/**
	 * @generated
	 */
	private void createClassClassOperationsCompartment_7005Children(View view) {
		Collection childNodeDescriptors = WaveDiagramUpdater
				.getClassClassOperationsCompartment_7005SemanticChildren(view);
		for (Iterator it = childNodeDescriptors.iterator(); it.hasNext();) {
			createNode(view, (WaveNodeDescriptor) it.next());
		}
	}

	/**
	 * @generated
	 */
	private void createInterfaceInterfaceOperationsCompartment_7006Children(
			View view) {
		Collection childNodeDescriptors = WaveDiagramUpdater
				.getInterfaceInterfaceOperationsCompartment_7006SemanticChildren(view);
		for (Iterator it = childNodeDescriptors.iterator(); it.hasNext();) {
			createNode(view, (WaveNodeDescriptor) it.next());
		}
	}

	/**
	 * @generated
	 */
	private void createControllerPageParametersCompartment_7017Children(
			View view) {
		Collection childNodeDescriptors = WaveDiagramUpdater
				.getControllerPageParametersCompartment_7017SemanticChildren(view);
		for (Iterator it = childNodeDescriptors.iterator(); it.hasNext();) {
			createNode(view, (WaveNodeDescriptor) it.next());
		}
	}

	/**
	 * @generated
	 */
	private void createControllerPageActionsCompartment_7018Children(View view) {
		Collection childNodeDescriptors = WaveDiagramUpdater
				.getControllerPageActionsCompartment_7018SemanticChildren(view);
		for (Iterator it = childNodeDescriptors.iterator(); it.hasNext();) {
			createNode(view, (WaveNodeDescriptor) it.next());
		}
	}

	/**
	 * @generated
	 */
	private void createControllerPageViewsCompartment_7019Children(View view) {
		Collection childNodeDescriptors = WaveDiagramUpdater
				.getControllerPageViewsCompartment_7019SemanticChildren(view);
		for (Iterator it = childNodeDescriptors.iterator(); it.hasNext();) {
			createNode(view, (WaveNodeDescriptor) it.next());
		}
	}

	/**
	 * @generated
	 */
	private void createControllerPageFunctionsCompartment_7020Children(View view) {
		Collection childNodeDescriptors = WaveDiagramUpdater
				.getControllerPageFunctionsCompartment_7020SemanticChildren(view);
		for (Iterator it = childNodeDescriptors.iterator(); it.hasNext();) {
			createNode(view, (WaveNodeDescriptor) it.next());
		}
	}

	/**
	 * @generated
	 */
	private void createActionActionOperationCompartment_7021Children(View view) {
		Collection childNodeDescriptors = WaveDiagramUpdater
				.getActionActionOperationCompartment_7021SemanticChildren(view);
		for (Iterator it = childNodeDescriptors.iterator(); it.hasNext();) {
			createNode(view, (WaveNodeDescriptor) it.next());
		}
	}

	/**
	 * @generated
	 */
	private void createViewViewOperationCompartment_7022Children(View view) {
		Collection childNodeDescriptors = WaveDiagramUpdater
				.getViewViewOperationCompartment_7022SemanticChildren(view);
		for (Iterator it = childNodeDescriptors.iterator(); it.hasNext();) {
			createNode(view, (WaveNodeDescriptor) it.next());
		}
	}

	/**
	 * @generated
	 */
	private void createViewViewAreaCompartment_7023Children(View view) {
		Collection childNodeDescriptors = WaveDiagramUpdater
				.getViewViewAreaCompartment_7023SemanticChildren(view);
		for (Iterator it = childNodeDescriptors.iterator(); it.hasNext();) {
			createNode(view, (WaveNodeDescriptor) it.next());
		}
	}

	/**
	 * @generated
	 */
	private void createViewViewOperationCompartment_7002Children(View view) {
		Collection childNodeDescriptors = WaveDiagramUpdater
				.getViewViewOperationCompartment_7002SemanticChildren(view);
		for (Iterator it = childNodeDescriptors.iterator(); it.hasNext();) {
			createNode(view, (WaveNodeDescriptor) it.next());
		}
	}

	/**
	 * @generated
	 */
	private void createViewViewAreaCompartment_7003Children(View view) {
		Collection childNodeDescriptors = WaveDiagramUpdater
				.getViewViewAreaCompartment_7003SemanticChildren(view);
		for (Iterator it = childNodeDescriptors.iterator(); it.hasNext();) {
			createNode(view, (WaveNodeDescriptor) it.next());
		}
	}

	/**
	 * @generated
	 */
	private void createPackagePackageCompartment_7014Children(View view) {
		Collection childNodeDescriptors = WaveDiagramUpdater
				.getPackagePackageCompartment_7014SemanticChildren(view);
		for (Iterator it = childNodeDescriptors.iterator(); it.hasNext();) {
			createNode(view, (WaveNodeDescriptor) it.next());
		}
	}

	/**
	 * @generated
	 */
	private void createClassClassAttributesCompartment_7012Children(View view) {
		Collection childNodeDescriptors = WaveDiagramUpdater
				.getClassClassAttributesCompartment_7012SemanticChildren(view);
		for (Iterator it = childNodeDescriptors.iterator(); it.hasNext();) {
			createNode(view, (WaveNodeDescriptor) it.next());
		}
	}

	/**
	 * @generated
	 */
	private void createClassClassOperationsCompartment_7013Children(View view) {
		Collection childNodeDescriptors = WaveDiagramUpdater
				.getClassClassOperationsCompartment_7013SemanticChildren(view);
		for (Iterator it = childNodeDescriptors.iterator(); it.hasNext();) {
			createNode(view, (WaveNodeDescriptor) it.next());
		}
	}

	/**
	 * @generated
	 */
	private void createInterfaceInterfaceOperationsCompartment_7015Children(
			View view) {
		Collection childNodeDescriptors = WaveDiagramUpdater
				.getInterfaceInterfaceOperationsCompartment_7015SemanticChildren(view);
		for (Iterator it = childNodeDescriptors.iterator(); it.hasNext();) {
			createNode(view, (WaveNodeDescriptor) it.next());
		}
	}

	/**
	 * @generated
	 */
	private void createPackagePackageCompartment_7016Children(View view) {
		Collection childNodeDescriptors = WaveDiagramUpdater
				.getPackagePackageCompartment_7016SemanticChildren(view);
		for (Iterator it = childNodeDescriptors.iterator(); it.hasNext();) {
			createNode(view, (WaveNodeDescriptor) it.next());
		}
	}

	/**
	 * @generated
	 */
	private void createNode(View parentView, WaveNodeDescriptor nodeDescriptor) {
		final String nodeType = WaveVisualIDRegistry.getType(nodeDescriptor
				.getVisualID());
		Node node = ViewService.createNode(parentView,
				nodeDescriptor.getModelElement(), nodeType,
				WaveDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		switch (nodeDescriptor.getVisualID()) {
		case ClassEditPart.VISUAL_ID:
			createClass_2017Children(node);
			return;
		case InterfaceEditPart.VISUAL_ID:
			createInterface_2018Children(node);
			return;
		case ControllerEditPart.VISUAL_ID:
			createController_2026Children(node);
			return;
		case IncludeEditPart.VISUAL_ID:
			createInclude_2020Children(node);
			return;
		case PackageEditPart.VISUAL_ID:
			createPackage_2021Children(node);
			return;
		case DocumentationEditPart.VISUAL_ID:
			createDocumentation_2013Children(node);
			return;
		case StyleSheetEditPart.VISUAL_ID:
			createStyleSheet_2022Children(node);
			return;
		case UsecaseSubsystemEditPart.VISUAL_ID:
			createUsecaseSubsystem_2023Children(node);
			return;
		case ActorEditPart.VISUAL_ID:
			createActor_2024Children(node);
			return;
		case UsecaseEditPart.VISUAL_ID:
			createUsecase_2025Children(node);
			return;
		case AttributeEditPart.VISUAL_ID:
			createAttribute_2001Children(node);
			return;
		case OperationEditPart.VISUAL_ID:
			createOperation_2002Children(node);
			return;
		case Operation2EditPart.VISUAL_ID:
			createOperation_2003Children(node);
			return;
		case Attribute2EditPart.VISUAL_ID:
			createAttribute_2004Children(node);
			return;
		case ActionEditPart.VISUAL_ID:
			createAction_13006Children(node);
			return;
		case Operation3EditPart.VISUAL_ID:
			createOperation_13008Children(node);
			return;
		case ViewEditPart.VISUAL_ID:
			createView_13007Children(node);
			return;
		case Operation4EditPart.VISUAL_ID:
			createOperation_13009Children(node);
			return;
		case AreaEditPart.VISUAL_ID:
			createArea_13001Children(node);
			return;
		case View2EditPart.VISUAL_ID:
			createView_13002Children(node);
			return;
		case Operation5EditPart.VISUAL_ID:
			createOperation_2009Children(node);
			return;
		case Class2EditPart.VISUAL_ID:
			createClass_13003Children(node);
			return;
		case Interface2EditPart.VISUAL_ID:
			createInterface_13004Children(node);
			return;
		case Package2EditPart.VISUAL_ID:
			createPackage_13005Children(node);
			return;
		case Include2EditPart.VISUAL_ID:
			createInclude_13010Children(node);
			return;
		}
	}

	/**
	 * @generated
	 */
	private void createLinks(Diagram diagram) {
		for (boolean continueLinkCreation = true; continueLinkCreation;) {
			continueLinkCreation = false;
			Collection additionalDescriptors = new LinkedList();
			for (Iterator it = myLinkDescriptors.iterator(); it.hasNext();) {
				WaveLinkDescriptor nextLinkDescriptor = (WaveLinkDescriptor) it
						.next();
				if (!myDomain2NotationMap.containsKey(nextLinkDescriptor
						.getSource())
						|| !myDomain2NotationMap.containsKey(nextLinkDescriptor
								.getDestination())) {
					continue;
				}
				final String linkType = WaveVisualIDRegistry
						.getType(nextLinkDescriptor.getVisualID());
				Edge edge = ViewService.getInstance().createEdge(
						nextLinkDescriptor.getSemanticAdapter(), diagram,
						linkType, ViewUtil.APPEND, true,
						WaveDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				if (edge != null) {
					edge.setSource((View) myDomain2NotationMap
							.get(nextLinkDescriptor.getSource()));
					edge.setTarget((View) myDomain2NotationMap
							.get(nextLinkDescriptor.getDestination()));
					it.remove();
					if (nextLinkDescriptor.getModelElement() != null) {
						myDomain2NotationMap.put(
								nextLinkDescriptor.getModelElement(), edge);
					}
					continueLinkCreation = true;
					switch (nextLinkDescriptor.getVisualID()) {
					case DependencyRelationshipEditPart.VISUAL_ID:
						additionalDescriptors
								.addAll(WaveDiagramUpdater
										.getDependencyRelationship_3001OutgoingLinks(edge));
						break;
					case InheritanceRelationshipEditPart.VISUAL_ID:
						additionalDescriptors
								.addAll(WaveDiagramUpdater
										.getInheritanceRelationship_3002OutgoingLinks(edge));
						break;
					case RealizationRelationshipEditPart.VISUAL_ID:
						additionalDescriptors
								.addAll(WaveDiagramUpdater
										.getRealizationRelationship_3003OutgoingLinks(edge));
						break;
					case AssociationRelationshipEditPart.VISUAL_ID:
						additionalDescriptors
								.addAll(WaveDiagramUpdater
										.getAssociationRelationship_3004OutgoingLinks(edge));
						break;
					case ActionToViewTransitionEditPart.VISUAL_ID:
						additionalDescriptors
								.addAll(WaveDiagramUpdater
										.getActionToViewTransition_3005OutgoingLinks(edge));
						break;
					case ViewTransitionEditPart.VISUAL_ID:
						additionalDescriptors.addAll(WaveDiagramUpdater
								.getViewTransition_4013OutgoingLinks(edge));
						break;
					case DependencyRelationship2EditPart.VISUAL_ID:
						additionalDescriptors
								.addAll(WaveDiagramUpdater
										.getDependencyRelationship_4016OutgoingLinks(edge));
						break;
					case DependencyRelationship3EditPart.VISUAL_ID:
						additionalDescriptors
								.addAll(WaveDiagramUpdater
										.getDependencyRelationship_4017OutgoingLinks(edge));
						break;
					}
				}
			}
			myLinkDescriptors.addAll(additionalDescriptors);
		}
	}

	/**
	 * @generated
	 */
	private Node getCompartment(View node, int visualID) {
		String type = WaveVisualIDRegistry.getType(visualID);
		for (Iterator it = node.getChildren().iterator(); it.hasNext();) {
			View nextView = (View) it.next();
			if (nextView instanceof Node && type.equals(nextView.getType())) {
				return (Node) nextView;
			}
		}
		return null;
	}

}
