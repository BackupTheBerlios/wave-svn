/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import de.gulden.modeling.wave.Action;
import de.gulden.modeling.wave.ActionToViewTransition;
import de.gulden.modeling.wave.Actor;
import de.gulden.modeling.wave.Area;
import de.gulden.modeling.wave.AssociationRelationship;
import de.gulden.modeling.wave.Attribute;
import de.gulden.modeling.wave.Class;
import de.gulden.modeling.wave.Classifier;
import de.gulden.modeling.wave.Controller;
import de.gulden.modeling.wave.ControllerMemberExecutable;
import de.gulden.modeling.wave.DependencyRelationship;
import de.gulden.modeling.wave.Documentation;
import de.gulden.modeling.wave.Include;
import de.gulden.modeling.wave.InheritanceRelationship;
import de.gulden.modeling.wave.Interface;
import de.gulden.modeling.wave.Model;
import de.gulden.modeling.wave.ModelMember;
import de.gulden.modeling.wave.OOPClassifier;
import de.gulden.modeling.wave.Operation;
import de.gulden.modeling.wave.Package;
import de.gulden.modeling.wave.RealizationRelationship;
import de.gulden.modeling.wave.StyleSheet;
import de.gulden.modeling.wave.TopLevelModelMember;
import de.gulden.modeling.wave.Usecase;
import de.gulden.modeling.wave.UsecaseSubsystem;
import de.gulden.modeling.wave.ViewTransition;
import de.gulden.modeling.wave.WavePackage;
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
import de.gulden.modeling.wave.diagram.edit.parts.ModelMemberDocsEditPart;
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
import de.gulden.modeling.wave.diagram.providers.WaveElementTypes;

/**
 * @generated
 */
public class WaveDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (WaveVisualIDRegistry.getVisualID(view)) {
		case AreaEditPart.VISUAL_ID:
			return getArea_13001SemanticChildren(view);
		case ClassClassAttributesCompartmentEditPart.VISUAL_ID:
			return getClassClassAttributesCompartment_7004SemanticChildren(view);
		case ClassClassOperationsCompartmentEditPart.VISUAL_ID:
			return getClassClassOperationsCompartment_7005SemanticChildren(view);
		case InterfaceInterfaceOperationsCompartmentEditPart.VISUAL_ID:
			return getInterfaceInterfaceOperationsCompartment_7006SemanticChildren(view);
		case ControllerPageParametersCompartmentEditPart.VISUAL_ID:
			return getControllerPageParametersCompartment_7017SemanticChildren(view);
		case ControllerPageActionsCompartmentEditPart.VISUAL_ID:
			return getControllerPageActionsCompartment_7018SemanticChildren(view);
		case ControllerPageViewsCompartmentEditPart.VISUAL_ID:
			return getControllerPageViewsCompartment_7019SemanticChildren(view);
		case ControllerPageFunctionsCompartmentEditPart.VISUAL_ID:
			return getControllerPageFunctionsCompartment_7020SemanticChildren(view);
		case ActionActionOperationCompartmentEditPart.VISUAL_ID:
			return getActionActionOperationCompartment_7021SemanticChildren(view);
		case ViewViewOperationCompartmentEditPart.VISUAL_ID:
			return getViewViewOperationCompartment_7022SemanticChildren(view);
		case ViewViewAreaCompartmentEditPart.VISUAL_ID:
			return getViewViewAreaCompartment_7023SemanticChildren(view);
		case ViewViewOperationCompartment2EditPart.VISUAL_ID:
			return getViewViewOperationCompartment_7002SemanticChildren(view);
		case ViewViewAreaCompartment2EditPart.VISUAL_ID:
			return getViewViewAreaCompartment_7003SemanticChildren(view);
		case PackagePackageCompartmentEditPart.VISUAL_ID:
			return getPackagePackageCompartment_7014SemanticChildren(view);
		case ClassClassAttributesCompartment2EditPart.VISUAL_ID:
			return getClassClassAttributesCompartment_7012SemanticChildren(view);
		case ClassClassOperationsCompartment2EditPart.VISUAL_ID:
			return getClassClassOperationsCompartment_7013SemanticChildren(view);
		case InterfaceInterfaceOperationsCompartment2EditPart.VISUAL_ID:
			return getInterfaceInterfaceOperationsCompartment_7015SemanticChildren(view);
		case PackagePackageCompartment2EditPart.VISUAL_ID:
			return getPackagePackageCompartment_7016SemanticChildren(view);
		case ModelEditPart.VISUAL_ID:
			return getModel_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getArea_13001SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Area modelElement = (Area) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getViews().iterator(); it.hasNext();) {
			de.gulden.modeling.wave.View childElement = (de.gulden.modeling.wave.View) it
					.next();
			int visualID = WaveVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == View2EditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClassClassAttributesCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Class modelElement = (Class) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAttributes().iterator(); it
				.hasNext();) {
			Attribute childElement = (Attribute) it.next();
			int visualID = WaveVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AttributeEditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClassClassOperationsCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Class modelElement = (Class) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOperations().iterator(); it
				.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = WaveVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OperationEditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterfaceInterfaceOperationsCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Interface modelElement = (Interface) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOperations().iterator(); it
				.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = WaveVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Operation2EditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControllerPageParametersCompartment_7017SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Controller modelElement = (Controller) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAttributes().iterator(); it
				.hasNext();) {
			Attribute childElement = (Attribute) it.next();
			int visualID = WaveVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Attribute2EditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControllerPageActionsCompartment_7018SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Controller modelElement = (Controller) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getActions().iterator(); it.hasNext();) {
			Action childElement = (Action) it.next();
			int visualID = WaveVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ActionEditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControllerPageViewsCompartment_7019SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Controller modelElement = (Controller) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getViews().iterator(); it.hasNext();) {
			de.gulden.modeling.wave.View childElement = (de.gulden.modeling.wave.View) it
					.next();
			int visualID = WaveVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ViewEditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getControllerPageFunctionsCompartment_7020SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Controller modelElement = (Controller) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOperations().iterator(); it
				.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = WaveVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Operation5EditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionActionOperationCompartment_7021SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Action modelElement = (Action) containerView.getElement();
		List result = new LinkedList();
		{
			Operation childElement = modelElement.getOperation();
			int visualID = WaveVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Operation3EditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getViewViewOperationCompartment_7022SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		de.gulden.modeling.wave.View modelElement = (de.gulden.modeling.wave.View) containerView
				.getElement();
		List result = new LinkedList();
		{
			Operation childElement = modelElement.getOperation();
			int visualID = WaveVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Operation4EditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getViewViewAreaCompartment_7023SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		de.gulden.modeling.wave.View modelElement = (de.gulden.modeling.wave.View) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAreas().iterator(); it.hasNext();) {
			Area childElement = (Area) it.next();
			int visualID = WaveVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AreaEditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getViewViewOperationCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		de.gulden.modeling.wave.View modelElement = (de.gulden.modeling.wave.View) containerView
				.getElement();
		List result = new LinkedList();
		{
			Operation childElement = modelElement.getOperation();
			int visualID = WaveVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Operation4EditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getViewViewAreaCompartment_7003SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		de.gulden.modeling.wave.View modelElement = (de.gulden.modeling.wave.View) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAreas().iterator(); it.hasNext();) {
			Area childElement = (Area) it.next();
			int visualID = WaveVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AreaEditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackagePackageCompartment_7014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Package modelElement = (Package) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getMembers().iterator(); it.hasNext();) {
			TopLevelModelMember childElement = (TopLevelModelMember) it.next();
			int visualID = WaveVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Class2EditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Interface2EditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Package2EditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Include2EditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClassClassAttributesCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Class modelElement = (Class) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getAttributes().iterator(); it
				.hasNext();) {
			Attribute childElement = (Attribute) it.next();
			int visualID = WaveVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AttributeEditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClassClassOperationsCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Class modelElement = (Class) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOperations().iterator(); it
				.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = WaveVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OperationEditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterfaceInterfaceOperationsCompartment_7015SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Interface modelElement = (Interface) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOperations().iterator(); it
				.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = WaveVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Operation2EditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackagePackageCompartment_7016SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Package modelElement = (Package) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getMembers().iterator(); it.hasNext();) {
			TopLevelModelMember childElement = (TopLevelModelMember) it.next();
			int visualID = WaveVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Class2EditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Interface2EditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Package2EditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Include2EditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getModel_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Model modelElement = (Model) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getMembers().iterator(); it.hasNext();) {
			TopLevelModelMember childElement = (TopLevelModelMember) it.next();
			int visualID = WaveVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ClassEditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InterfaceEditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ControllerEditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IncludeEditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PackageEditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StyleSheetEditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UsecaseSubsystemEditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActorEditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UsecaseEditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getDocumentation().iterator(); it
				.hasNext();) {
			Documentation childElement = (Documentation) it.next();
			int visualID = WaveVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DocumentationEditPart.VISUAL_ID) {
				result.add(new WaveNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (WaveVisualIDRegistry.getVisualID(view)) {
		case ModelEditPart.VISUAL_ID:
			return getModel_1000ContainedLinks(view);
		case ClassEditPart.VISUAL_ID:
			return getClass_2017ContainedLinks(view);
		case InterfaceEditPart.VISUAL_ID:
			return getInterface_2018ContainedLinks(view);
		case ControllerEditPart.VISUAL_ID:
			return getController_2026ContainedLinks(view);
		case IncludeEditPart.VISUAL_ID:
			return getInclude_2020ContainedLinks(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_2021ContainedLinks(view);
		case DocumentationEditPart.VISUAL_ID:
			return getDocumentation_2013ContainedLinks(view);
		case StyleSheetEditPart.VISUAL_ID:
			return getStyleSheet_2022ContainedLinks(view);
		case UsecaseSubsystemEditPart.VISUAL_ID:
			return getUsecaseSubsystem_2023ContainedLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2024ContainedLinks(view);
		case UsecaseEditPart.VISUAL_ID:
			return getUsecase_2025ContainedLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_2001ContainedLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_2002ContainedLinks(view);
		case Operation2EditPart.VISUAL_ID:
			return getOperation_2003ContainedLinks(view);
		case Attribute2EditPart.VISUAL_ID:
			return getAttribute_2004ContainedLinks(view);
		case ActionEditPart.VISUAL_ID:
			return getAction_13006ContainedLinks(view);
		case Operation3EditPart.VISUAL_ID:
			return getOperation_13008ContainedLinks(view);
		case ViewEditPart.VISUAL_ID:
			return getView_13007ContainedLinks(view);
		case Operation4EditPart.VISUAL_ID:
			return getOperation_13009ContainedLinks(view);
		case AreaEditPart.VISUAL_ID:
			return getArea_13001ContainedLinks(view);
		case View2EditPart.VISUAL_ID:
			return getView_13002ContainedLinks(view);
		case Operation5EditPart.VISUAL_ID:
			return getOperation_2009ContainedLinks(view);
		case Class2EditPart.VISUAL_ID:
			return getClass_13003ContainedLinks(view);
		case Interface2EditPart.VISUAL_ID:
			return getInterface_13004ContainedLinks(view);
		case Package2EditPart.VISUAL_ID:
			return getPackage_13005ContainedLinks(view);
		case Include2EditPart.VISUAL_ID:
			return getInclude_13010ContainedLinks(view);
		case DependencyRelationshipEditPart.VISUAL_ID:
			return getDependencyRelationship_3001ContainedLinks(view);
		case InheritanceRelationshipEditPart.VISUAL_ID:
			return getInheritanceRelationship_3002ContainedLinks(view);
		case RealizationRelationshipEditPart.VISUAL_ID:
			return getRealizationRelationship_3003ContainedLinks(view);
		case AssociationRelationshipEditPart.VISUAL_ID:
			return getAssociationRelationship_3004ContainedLinks(view);
		case ActionToViewTransitionEditPart.VISUAL_ID:
			return getActionToViewTransition_3005ContainedLinks(view);
		case ViewTransitionEditPart.VISUAL_ID:
			return getViewTransition_4013ContainedLinks(view);
		case DependencyRelationship2EditPart.VISUAL_ID:
			return getDependencyRelationship_4016ContainedLinks(view);
		case DependencyRelationship3EditPart.VISUAL_ID:
			return getDependencyRelationship_4017ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (WaveVisualIDRegistry.getVisualID(view)) {
		case ClassEditPart.VISUAL_ID:
			return getClass_2017IncomingLinks(view);
		case InterfaceEditPart.VISUAL_ID:
			return getInterface_2018IncomingLinks(view);
		case ControllerEditPart.VISUAL_ID:
			return getController_2026IncomingLinks(view);
		case IncludeEditPart.VISUAL_ID:
			return getInclude_2020IncomingLinks(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_2021IncomingLinks(view);
		case DocumentationEditPart.VISUAL_ID:
			return getDocumentation_2013IncomingLinks(view);
		case StyleSheetEditPart.VISUAL_ID:
			return getStyleSheet_2022IncomingLinks(view);
		case UsecaseSubsystemEditPart.VISUAL_ID:
			return getUsecaseSubsystem_2023IncomingLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2024IncomingLinks(view);
		case UsecaseEditPart.VISUAL_ID:
			return getUsecase_2025IncomingLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_2001IncomingLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_2002IncomingLinks(view);
		case Operation2EditPart.VISUAL_ID:
			return getOperation_2003IncomingLinks(view);
		case Attribute2EditPart.VISUAL_ID:
			return getAttribute_2004IncomingLinks(view);
		case ActionEditPart.VISUAL_ID:
			return getAction_13006IncomingLinks(view);
		case Operation3EditPart.VISUAL_ID:
			return getOperation_13008IncomingLinks(view);
		case ViewEditPart.VISUAL_ID:
			return getView_13007IncomingLinks(view);
		case Operation4EditPart.VISUAL_ID:
			return getOperation_13009IncomingLinks(view);
		case AreaEditPart.VISUAL_ID:
			return getArea_13001IncomingLinks(view);
		case View2EditPart.VISUAL_ID:
			return getView_13002IncomingLinks(view);
		case Operation5EditPart.VISUAL_ID:
			return getOperation_2009IncomingLinks(view);
		case Class2EditPart.VISUAL_ID:
			return getClass_13003IncomingLinks(view);
		case Interface2EditPart.VISUAL_ID:
			return getInterface_13004IncomingLinks(view);
		case Package2EditPart.VISUAL_ID:
			return getPackage_13005IncomingLinks(view);
		case Include2EditPart.VISUAL_ID:
			return getInclude_13010IncomingLinks(view);
		case DependencyRelationshipEditPart.VISUAL_ID:
			return getDependencyRelationship_3001IncomingLinks(view);
		case InheritanceRelationshipEditPart.VISUAL_ID:
			return getInheritanceRelationship_3002IncomingLinks(view);
		case RealizationRelationshipEditPart.VISUAL_ID:
			return getRealizationRelationship_3003IncomingLinks(view);
		case AssociationRelationshipEditPart.VISUAL_ID:
			return getAssociationRelationship_3004IncomingLinks(view);
		case ActionToViewTransitionEditPart.VISUAL_ID:
			return getActionToViewTransition_3005IncomingLinks(view);
		case ViewTransitionEditPart.VISUAL_ID:
			return getViewTransition_4013IncomingLinks(view);
		case DependencyRelationship2EditPart.VISUAL_ID:
			return getDependencyRelationship_4016IncomingLinks(view);
		case DependencyRelationship3EditPart.VISUAL_ID:
			return getDependencyRelationship_4017IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (WaveVisualIDRegistry.getVisualID(view)) {
		case ClassEditPart.VISUAL_ID:
			return getClass_2017OutgoingLinks(view);
		case InterfaceEditPart.VISUAL_ID:
			return getInterface_2018OutgoingLinks(view);
		case ControllerEditPart.VISUAL_ID:
			return getController_2026OutgoingLinks(view);
		case IncludeEditPart.VISUAL_ID:
			return getInclude_2020OutgoingLinks(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_2021OutgoingLinks(view);
		case DocumentationEditPart.VISUAL_ID:
			return getDocumentation_2013OutgoingLinks(view);
		case StyleSheetEditPart.VISUAL_ID:
			return getStyleSheet_2022OutgoingLinks(view);
		case UsecaseSubsystemEditPart.VISUAL_ID:
			return getUsecaseSubsystem_2023OutgoingLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2024OutgoingLinks(view);
		case UsecaseEditPart.VISUAL_ID:
			return getUsecase_2025OutgoingLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_2001OutgoingLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_2002OutgoingLinks(view);
		case Operation2EditPart.VISUAL_ID:
			return getOperation_2003OutgoingLinks(view);
		case Attribute2EditPart.VISUAL_ID:
			return getAttribute_2004OutgoingLinks(view);
		case ActionEditPart.VISUAL_ID:
			return getAction_13006OutgoingLinks(view);
		case Operation3EditPart.VISUAL_ID:
			return getOperation_13008OutgoingLinks(view);
		case ViewEditPart.VISUAL_ID:
			return getView_13007OutgoingLinks(view);
		case Operation4EditPart.VISUAL_ID:
			return getOperation_13009OutgoingLinks(view);
		case AreaEditPart.VISUAL_ID:
			return getArea_13001OutgoingLinks(view);
		case View2EditPart.VISUAL_ID:
			return getView_13002OutgoingLinks(view);
		case Operation5EditPart.VISUAL_ID:
			return getOperation_2009OutgoingLinks(view);
		case Class2EditPart.VISUAL_ID:
			return getClass_13003OutgoingLinks(view);
		case Interface2EditPart.VISUAL_ID:
			return getInterface_13004OutgoingLinks(view);
		case Package2EditPart.VISUAL_ID:
			return getPackage_13005OutgoingLinks(view);
		case Include2EditPart.VISUAL_ID:
			return getInclude_13010OutgoingLinks(view);
		case DependencyRelationshipEditPart.VISUAL_ID:
			return getDependencyRelationship_3001OutgoingLinks(view);
		case InheritanceRelationshipEditPart.VISUAL_ID:
			return getInheritanceRelationship_3002OutgoingLinks(view);
		case RealizationRelationshipEditPart.VISUAL_ID:
			return getRealizationRelationship_3003OutgoingLinks(view);
		case AssociationRelationshipEditPart.VISUAL_ID:
			return getAssociationRelationship_3004OutgoingLinks(view);
		case ActionToViewTransitionEditPart.VISUAL_ID:
			return getActionToViewTransition_3005OutgoingLinks(view);
		case ViewTransitionEditPart.VISUAL_ID:
			return getViewTransition_4013OutgoingLinks(view);
		case DependencyRelationship2EditPart.VISUAL_ID:
			return getDependencyRelationship_4016OutgoingLinks(view);
		case DependencyRelationship3EditPart.VISUAL_ID:
			return getDependencyRelationship_4017OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getModel_1000ContainedLinks(View view) {
		Model modelElement = (Model) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_InheritanceRelationship_3002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_RealizationRelationship_3003(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_AssociationRelationship_3004(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClass_2017ContainedLinks(View view) {
		Class modelElement = (Class) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterface_2018ContainedLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getController_2026ContainedLinks(View view) {
		Controller modelElement = (Controller) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_ActionToViewTransition_3005(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_ViewTransition_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInclude_2020ContainedLinks(View view) {
		Include modelElement = (Include) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackage_2021ContainedLinks(View view) {
		Package modelElement = (Package) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_InheritanceRelationship_3002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_RealizationRelationship_3003(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_AssociationRelationship_3004(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDocumentation_2013ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getStyleSheet_2022ContainedLinks(View view) {
		StyleSheet modelElement = (StyleSheet) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getUsecaseSubsystem_2023ContainedLinks(View view) {
		UsecaseSubsystem modelElement = (UsecaseSubsystem) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActor_2024ContainedLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getUsecase_2025ContainedLinks(View view) {
		Usecase modelElement = (Usecase) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAttribute_2001ContainedLinks(View view) {
		Attribute modelElement = (Attribute) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperation_2002ContainedLinks(View view) {
		Operation modelElement = (Operation) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperation_2003ContainedLinks(View view) {
		Operation modelElement = (Operation) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAttribute_2004ContainedLinks(View view) {
		Attribute modelElement = (Attribute) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAction_13006ContainedLinks(View view) {
		Action modelElement = (Action) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperation_13008ContainedLinks(View view) {
		Operation modelElement = (Operation) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getView_13007ContainedLinks(View view) {
		de.gulden.modeling.wave.View modelElement = (de.gulden.modeling.wave.View) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperation_13009ContainedLinks(View view) {
		Operation modelElement = (Operation) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getArea_13001ContainedLinks(View view) {
		Area modelElement = (Area) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getView_13002ContainedLinks(View view) {
		de.gulden.modeling.wave.View modelElement = (de.gulden.modeling.wave.View) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperation_2009ContainedLinks(View view) {
		Operation modelElement = (Operation) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClass_13003ContainedLinks(View view) {
		Class modelElement = (Class) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterface_13004ContainedLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackage_13005ContainedLinks(View view) {
		Package modelElement = (Package) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_InheritanceRelationship_3002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_RealizationRelationship_3003(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_AssociationRelationship_3004(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInclude_13010ContainedLinks(View view) {
		Include modelElement = (Include) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDependencyRelationship_3001ContainedLinks(View view) {
		DependencyRelationship modelElement = (DependencyRelationship) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInheritanceRelationship_3002ContainedLinks(View view) {
		InheritanceRelationship modelElement = (InheritanceRelationship) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRealizationRelationship_3003ContainedLinks(View view) {
		RealizationRelationship modelElement = (RealizationRelationship) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssociationRelationship_3004ContainedLinks(View view) {
		AssociationRelationship modelElement = (AssociationRelationship) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionToViewTransition_3005ContainedLinks(View view) {
		ActionToViewTransition modelElement = (ActionToViewTransition) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getViewTransition_4013ContainedLinks(View view) {
		ViewTransition modelElement = (ViewTransition) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDependencyRelationship_4016ContainedLinks(View view) {
		DependencyRelationship modelElement = (DependencyRelationship) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDependencyRelationship_4017ContainedLinks(View view) {
		DependencyRelationship modelElement = (DependencyRelationship) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClass_2017IncomingLinks(View view) {
		Class modelElement = (Class) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_InheritanceRelationship_3002(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_AssociationRelationship_3004(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterface_2018IncomingLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_InheritanceRelationship_3002(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_RealizationRelationship_3003(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_AssociationRelationship_3004(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getController_2026IncomingLinks(View view) {
		Controller modelElement = (Controller) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_InheritanceRelationship_3002(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInclude_2020IncomingLinks(View view) {
		Include modelElement = (Include) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_InheritanceRelationship_3002(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackage_2021IncomingLinks(View view) {
		Package modelElement = (Package) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDocumentation_2013IncomingLinks(View view) {
		Documentation modelElement = (Documentation) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_ModelMember_Docs_4015(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getStyleSheet_2022IncomingLinks(View view) {
		StyleSheet modelElement = (StyleSheet) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_InheritanceRelationship_3002(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getUsecaseSubsystem_2023IncomingLinks(View view) {
		UsecaseSubsystem modelElement = (UsecaseSubsystem) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActor_2024IncomingLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_InheritanceRelationship_3002(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_AssociationRelationship_3004(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getUsecase_2025IncomingLinks(View view) {
		Usecase modelElement = (Usecase) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_InheritanceRelationship_3002(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_AssociationRelationship_3004(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAttribute_2001IncomingLinks(View view) {
		Attribute modelElement = (Attribute) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperation_2002IncomingLinks(View view) {
		Operation modelElement = (Operation) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperation_2003IncomingLinks(View view) {
		Operation modelElement = (Operation) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAttribute_2004IncomingLinks(View view) {
		Attribute modelElement = (Attribute) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAction_13006IncomingLinks(View view) {
		Action modelElement = (Action) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ViewTransition_4013(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperation_13008IncomingLinks(View view) {
		Operation modelElement = (Operation) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getView_13007IncomingLinks(View view) {
		de.gulden.modeling.wave.View modelElement = (de.gulden.modeling.wave.View) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_ActionToViewTransition_3005(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ViewTransition_4013(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperation_13009IncomingLinks(View view) {
		Operation modelElement = (Operation) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getArea_13001IncomingLinks(View view) {
		Area modelElement = (Area) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getView_13002IncomingLinks(View view) {
		de.gulden.modeling.wave.View modelElement = (de.gulden.modeling.wave.View) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_ActionToViewTransition_3005(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ViewTransition_4013(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperation_2009IncomingLinks(View view) {
		Operation modelElement = (Operation) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClass_13003IncomingLinks(View view) {
		Class modelElement = (Class) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_InheritanceRelationship_3002(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_AssociationRelationship_3004(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterface_13004IncomingLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_InheritanceRelationship_3002(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_RealizationRelationship_3003(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_AssociationRelationship_3004(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackage_13005IncomingLinks(View view) {
		Package modelElement = (Package) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInclude_13010IncomingLinks(View view) {
		Include modelElement = (Include) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_InheritanceRelationship_3002(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDependencyRelationship_3001IncomingLinks(View view) {
		DependencyRelationship modelElement = (DependencyRelationship) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInheritanceRelationship_3002IncomingLinks(View view) {
		InheritanceRelationship modelElement = (InheritanceRelationship) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRealizationRelationship_3003IncomingLinks(View view) {
		RealizationRelationship modelElement = (RealizationRelationship) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssociationRelationship_3004IncomingLinks(View view) {
		AssociationRelationship modelElement = (AssociationRelationship) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionToViewTransition_3005IncomingLinks(View view) {
		ActionToViewTransition modelElement = (ActionToViewTransition) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getViewTransition_4013IncomingLinks(View view) {
		ViewTransition modelElement = (ViewTransition) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDependencyRelationship_4016IncomingLinks(View view) {
		DependencyRelationship modelElement = (DependencyRelationship) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDependencyRelationship_4017IncomingLinks(View view) {
		DependencyRelationship modelElement = (DependencyRelationship) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
						modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClass_2017OutgoingLinks(View view) {
		Class modelElement = (Class) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_InheritanceRelationship_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_RealizationRelationship_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AssociationRelationship_3004(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterface_2018OutgoingLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_InheritanceRelationship_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AssociationRelationship_3004(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getController_2026OutgoingLinks(View view) {
		Controller modelElement = (Controller) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_InheritanceRelationship_3002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInclude_2020OutgoingLinks(View view) {
		Include modelElement = (Include) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_InheritanceRelationship_3002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackage_2021OutgoingLinks(View view) {
		Package modelElement = (Package) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDocumentation_2013OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getStyleSheet_2022OutgoingLinks(View view) {
		StyleSheet modelElement = (StyleSheet) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_InheritanceRelationship_3002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getUsecaseSubsystem_2023OutgoingLinks(View view) {
		UsecaseSubsystem modelElement = (UsecaseSubsystem) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActor_2024OutgoingLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_InheritanceRelationship_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AssociationRelationship_3004(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getUsecase_2025OutgoingLinks(View view) {
		Usecase modelElement = (Usecase) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_InheritanceRelationship_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AssociationRelationship_3004(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAttribute_2001OutgoingLinks(View view) {
		Attribute modelElement = (Attribute) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperation_2002OutgoingLinks(View view) {
		Operation modelElement = (Operation) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperation_2003OutgoingLinks(View view) {
		Operation modelElement = (Operation) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAttribute_2004OutgoingLinks(View view) {
		Attribute modelElement = (Attribute) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAction_13006OutgoingLinks(View view) {
		Action modelElement = (Action) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_ActionToViewTransition_3005(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_ViewTransition_4013(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperation_13008OutgoingLinks(View view) {
		Operation modelElement = (Operation) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getView_13007OutgoingLinks(View view) {
		de.gulden.modeling.wave.View modelElement = (de.gulden.modeling.wave.View) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_ViewTransition_4013(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperation_13009OutgoingLinks(View view) {
		Operation modelElement = (Operation) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getArea_13001OutgoingLinks(View view) {
		Area modelElement = (Area) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getView_13002OutgoingLinks(View view) {
		de.gulden.modeling.wave.View modelElement = (de.gulden.modeling.wave.View) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_ViewTransition_4013(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperation_2009OutgoingLinks(View view) {
		Operation modelElement = (Operation) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClass_13003OutgoingLinks(View view) {
		Class modelElement = (Class) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_InheritanceRelationship_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_RealizationRelationship_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AssociationRelationship_3004(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterface_13004OutgoingLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_InheritanceRelationship_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AssociationRelationship_3004(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackage_13005OutgoingLinks(View view) {
		Package modelElement = (Package) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInclude_13010OutgoingLinks(View view) {
		Include modelElement = (Include) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_InheritanceRelationship_3002(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDependencyRelationship_3001OutgoingLinks(View view) {
		DependencyRelationship modelElement = (DependencyRelationship) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInheritanceRelationship_3002OutgoingLinks(View view) {
		InheritanceRelationship modelElement = (InheritanceRelationship) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRealizationRelationship_3003OutgoingLinks(View view) {
		RealizationRelationship modelElement = (RealizationRelationship) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssociationRelationship_3004OutgoingLinks(View view) {
		AssociationRelationship modelElement = (AssociationRelationship) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionToViewTransition_3005OutgoingLinks(View view) {
		ActionToViewTransition modelElement = (ActionToViewTransition) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getViewTransition_4013OutgoingLinks(View view) {
		ViewTransition modelElement = (ViewTransition) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDependencyRelationship_4016OutgoingLinks(View view) {
		DependencyRelationship modelElement = (DependencyRelationship) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDependencyRelationship_4017OutgoingLinks(View view) {
		DependencyRelationship modelElement = (DependencyRelationship) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_DependencyRelationship_3001(
			Package container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getMembers().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DependencyRelationship) {
				continue;
			}
			DependencyRelationship link = (DependencyRelationship) linkObject;
			if (DependencyRelationshipEditPart.VISUAL_ID != WaveVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ModelMember dst = link.getSupplier();
			ModelMember src = link.getClient();
			result.add(new WaveLinkDescriptor(src, dst, link,
					WaveElementTypes.DependencyRelationship_3001,
					DependencyRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_InheritanceRelationship_3002(
			Package container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getMembers().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InheritanceRelationship) {
				continue;
			}
			InheritanceRelationship link = (InheritanceRelationship) linkObject;
			if (InheritanceRelationshipEditPart.VISUAL_ID != WaveVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classifier dst = link.getParent();
			Classifier src = link.getChild();
			result.add(new WaveLinkDescriptor(src, dst, link,
					WaveElementTypes.InheritanceRelationship_3002,
					InheritanceRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_RealizationRelationship_3003(
			Package container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getMembers().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof RealizationRelationship) {
				continue;
			}
			RealizationRelationship link = (RealizationRelationship) linkObject;
			if (RealizationRelationshipEditPart.VISUAL_ID != WaveVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Interface dst = link.getParentInterface();
			Class src = link.getImplementingClass();
			result.add(new WaveLinkDescriptor(src, dst, link,
					WaveElementTypes.RealizationRelationship_3003,
					RealizationRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_AssociationRelationship_3004(
			Package container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getMembers().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AssociationRelationship) {
				continue;
			}
			AssociationRelationship link = (AssociationRelationship) linkObject;
			if (AssociationRelationshipEditPart.VISUAL_ID != WaveVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OOPClassifier dst = link.getB();
			OOPClassifier src = link.getA();
			result.add(new WaveLinkDescriptor(src, dst, link,
					WaveElementTypes.AssociationRelationship_3004,
					AssociationRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_ActionToViewTransition_3005(
			Controller container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getTransitionsActionToView().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ActionToViewTransition) {
				continue;
			}
			ActionToViewTransition link = (ActionToViewTransition) linkObject;
			if (ActionToViewTransitionEditPart.VISUAL_ID != WaveVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.gulden.modeling.wave.View dst = link.getTarget();
			Action src = link.getSource();
			result.add(new WaveLinkDescriptor(src, dst, link,
					WaveElementTypes.ActionToViewTransition_3005,
					ActionToViewTransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_ViewTransition_4013(
			Controller container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getTransitionsView().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ViewTransition) {
				continue;
			}
			ViewTransition link = (ViewTransition) linkObject;
			if (ViewTransitionEditPart.VISUAL_ID != WaveVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ControllerMemberExecutable dst = link.getTarget();
			ControllerMemberExecutable src = link.getSource();
			result.add(new WaveLinkDescriptor(src, dst, link,
					WaveElementTypes.ViewTransition_4013,
					ViewTransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_DependencyRelationship_4016(
			Package container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getMembers().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DependencyRelationship) {
				continue;
			}
			DependencyRelationship link = (DependencyRelationship) linkObject;
			if (DependencyRelationship2EditPart.VISUAL_ID != WaveVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ModelMember dst = link.getSupplier();
			ModelMember src = link.getClient();
			result.add(new WaveLinkDescriptor(src, dst, link,
					WaveElementTypes.DependencyRelationship_4016,
					DependencyRelationship2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_DependencyRelationship_4017(
			Package container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getMembers().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DependencyRelationship) {
				continue;
			}
			DependencyRelationship link = (DependencyRelationship) linkObject;
			if (DependencyRelationship3EditPart.VISUAL_ID != WaveVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ModelMember dst = link.getSupplier();
			ModelMember src = link.getClient();
			result.add(new WaveLinkDescriptor(src, dst, link,
					WaveElementTypes.DependencyRelationship_4017,
					DependencyRelationship3EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_DependencyRelationship_3001(
			ModelMember target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != WavePackage.eINSTANCE
					.getDependencyRelationship_Supplier()
					|| false == setting.getEObject() instanceof DependencyRelationship) {
				continue;
			}
			DependencyRelationship link = (DependencyRelationship) setting
					.getEObject();
			if (DependencyRelationshipEditPart.VISUAL_ID != WaveVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ModelMember src = link.getClient();
			result.add(new WaveLinkDescriptor(src, target, link,
					WaveElementTypes.DependencyRelationship_3001,
					DependencyRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_InheritanceRelationship_3002(
			Classifier target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != WavePackage.eINSTANCE
					.getInheritanceRelationship_Parent()
					|| false == setting.getEObject() instanceof InheritanceRelationship) {
				continue;
			}
			InheritanceRelationship link = (InheritanceRelationship) setting
					.getEObject();
			if (InheritanceRelationshipEditPart.VISUAL_ID != WaveVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classifier src = link.getChild();
			result.add(new WaveLinkDescriptor(src, target, link,
					WaveElementTypes.InheritanceRelationship_3002,
					InheritanceRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_RealizationRelationship_3003(
			Interface target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != WavePackage.eINSTANCE
					.getRealizationRelationship_ParentInterface()
					|| false == setting.getEObject() instanceof RealizationRelationship) {
				continue;
			}
			RealizationRelationship link = (RealizationRelationship) setting
					.getEObject();
			if (RealizationRelationshipEditPart.VISUAL_ID != WaveVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Class src = link.getImplementingClass();
			result.add(new WaveLinkDescriptor(src, target, link,
					WaveElementTypes.RealizationRelationship_3003,
					RealizationRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_AssociationRelationship_3004(
			OOPClassifier target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != WavePackage.eINSTANCE
					.getAssociationRelationship_B()
					|| false == setting.getEObject() instanceof AssociationRelationship) {
				continue;
			}
			AssociationRelationship link = (AssociationRelationship) setting
					.getEObject();
			if (AssociationRelationshipEditPart.VISUAL_ID != WaveVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OOPClassifier src = link.getA();
			result.add(new WaveLinkDescriptor(src, target, link,
					WaveElementTypes.AssociationRelationship_3004,
					AssociationRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_ActionToViewTransition_3005(
			de.gulden.modeling.wave.View target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != WavePackage.eINSTANCE
					.getActionToViewTransition_Target()
					|| false == setting.getEObject() instanceof ActionToViewTransition) {
				continue;
			}
			ActionToViewTransition link = (ActionToViewTransition) setting
					.getEObject();
			if (ActionToViewTransitionEditPart.VISUAL_ID != WaveVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Action src = link.getSource();
			result.add(new WaveLinkDescriptor(src, target, link,
					WaveElementTypes.ActionToViewTransition_3005,
					ActionToViewTransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ModelMember_Docs_4015(
			Documentation target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == WavePackage.eINSTANCE
					.getModelMember_Docs()) {
				result.add(new WaveLinkDescriptor(setting.getEObject(), target,
						WaveElementTypes.ModelMemberDocs_4015,
						ModelMemberDocsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_ViewTransition_4013(
			ControllerMemberExecutable target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != WavePackage.eINSTANCE
					.getViewTransition_Target()
					|| false == setting.getEObject() instanceof ViewTransition) {
				continue;
			}
			ViewTransition link = (ViewTransition) setting.getEObject();
			if (ViewTransitionEditPart.VISUAL_ID != WaveVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ControllerMemberExecutable src = link.getSource();
			result.add(new WaveLinkDescriptor(src, target, link,
					WaveElementTypes.ViewTransition_4013,
					ViewTransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_DependencyRelationship_4016(
			ModelMember target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != WavePackage.eINSTANCE
					.getDependencyRelationship_Supplier()
					|| false == setting.getEObject() instanceof DependencyRelationship) {
				continue;
			}
			DependencyRelationship link = (DependencyRelationship) setting
					.getEObject();
			if (DependencyRelationship2EditPart.VISUAL_ID != WaveVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ModelMember src = link.getClient();
			result.add(new WaveLinkDescriptor(src, target, link,
					WaveElementTypes.DependencyRelationship_4016,
					DependencyRelationship2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_DependencyRelationship_4017(
			ModelMember target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != WavePackage.eINSTANCE
					.getDependencyRelationship_Supplier()
					|| false == setting.getEObject() instanceof DependencyRelationship) {
				continue;
			}
			DependencyRelationship link = (DependencyRelationship) setting
					.getEObject();
			if (DependencyRelationship3EditPart.VISUAL_ID != WaveVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ModelMember src = link.getClient();
			result.add(new WaveLinkDescriptor(src, target, link,
					WaveElementTypes.DependencyRelationship_4017,
					DependencyRelationship3EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_DependencyRelationship_3001(
			ModelMember source) {
		Package container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Package) {
				container = (Package) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getMembers().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DependencyRelationship) {
				continue;
			}
			DependencyRelationship link = (DependencyRelationship) linkObject;
			if (DependencyRelationshipEditPart.VISUAL_ID != WaveVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ModelMember dst = link.getSupplier();
			ModelMember src = link.getClient();
			if (src != source) {
				continue;
			}
			result.add(new WaveLinkDescriptor(src, dst, link,
					WaveElementTypes.DependencyRelationship_3001,
					DependencyRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_InheritanceRelationship_3002(
			Classifier source) {
		Package container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Package) {
				container = (Package) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getMembers().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InheritanceRelationship) {
				continue;
			}
			InheritanceRelationship link = (InheritanceRelationship) linkObject;
			if (InheritanceRelationshipEditPart.VISUAL_ID != WaveVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classifier dst = link.getParent();
			Classifier src = link.getChild();
			if (src != source) {
				continue;
			}
			result.add(new WaveLinkDescriptor(src, dst, link,
					WaveElementTypes.InheritanceRelationship_3002,
					InheritanceRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_RealizationRelationship_3003(
			Class source) {
		Package container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Package) {
				container = (Package) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getMembers().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof RealizationRelationship) {
				continue;
			}
			RealizationRelationship link = (RealizationRelationship) linkObject;
			if (RealizationRelationshipEditPart.VISUAL_ID != WaveVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Interface dst = link.getParentInterface();
			Class src = link.getImplementingClass();
			if (src != source) {
				continue;
			}
			result.add(new WaveLinkDescriptor(src, dst, link,
					WaveElementTypes.RealizationRelationship_3003,
					RealizationRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_AssociationRelationship_3004(
			OOPClassifier source) {
		Package container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Package) {
				container = (Package) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getMembers().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AssociationRelationship) {
				continue;
			}
			AssociationRelationship link = (AssociationRelationship) linkObject;
			if (AssociationRelationshipEditPart.VISUAL_ID != WaveVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			OOPClassifier dst = link.getB();
			OOPClassifier src = link.getA();
			if (src != source) {
				continue;
			}
			result.add(new WaveLinkDescriptor(src, dst, link,
					WaveElementTypes.AssociationRelationship_3004,
					AssociationRelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_ActionToViewTransition_3005(
			Action source) {
		Controller container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Controller) {
				container = (Controller) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getTransitionsActionToView().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ActionToViewTransition) {
				continue;
			}
			ActionToViewTransition link = (ActionToViewTransition) linkObject;
			if (ActionToViewTransitionEditPart.VISUAL_ID != WaveVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.gulden.modeling.wave.View dst = link.getTarget();
			Action src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new WaveLinkDescriptor(src, dst, link,
					WaveElementTypes.ActionToViewTransition_3005,
					ActionToViewTransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ModelMember_Docs_4015(
			ModelMember source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getDocs().iterator(); destinations
				.hasNext();) {
			Documentation destination = (Documentation) destinations.next();
			result.add(new WaveLinkDescriptor(source, destination,
					WaveElementTypes.ModelMemberDocs_4015,
					ModelMemberDocsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_ViewTransition_4013(
			ControllerMemberExecutable source) {
		Controller container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Controller) {
				container = (Controller) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getTransitionsView().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ViewTransition) {
				continue;
			}
			ViewTransition link = (ViewTransition) linkObject;
			if (ViewTransitionEditPart.VISUAL_ID != WaveVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ControllerMemberExecutable dst = link.getTarget();
			ControllerMemberExecutable src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new WaveLinkDescriptor(src, dst, link,
					WaveElementTypes.ViewTransition_4013,
					ViewTransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_DependencyRelationship_4016(
			ModelMember source) {
		Package container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Package) {
				container = (Package) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getMembers().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DependencyRelationship) {
				continue;
			}
			DependencyRelationship link = (DependencyRelationship) linkObject;
			if (DependencyRelationship2EditPart.VISUAL_ID != WaveVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ModelMember dst = link.getSupplier();
			ModelMember src = link.getClient();
			if (src != source) {
				continue;
			}
			result.add(new WaveLinkDescriptor(src, dst, link,
					WaveElementTypes.DependencyRelationship_4016,
					DependencyRelationship2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_DependencyRelationship_4017(
			ModelMember source) {
		Package container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Package) {
				container = (Package) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getMembers().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DependencyRelationship) {
				continue;
			}
			DependencyRelationship link = (DependencyRelationship) linkObject;
			if (DependencyRelationship3EditPart.VISUAL_ID != WaveVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ModelMember dst = link.getSupplier();
			ModelMember src = link.getClient();
			if (src != source) {
				continue;
			}
			result.add(new WaveLinkDescriptor(src, dst, link,
					WaveElementTypes.DependencyRelationship_4017,
					DependencyRelationship3EditPart.VISUAL_ID));
		}
		return result;
	}

}
