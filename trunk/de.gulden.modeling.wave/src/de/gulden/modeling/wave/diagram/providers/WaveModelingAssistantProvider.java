/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import de.gulden.modeling.wave.diagram.edit.parts.ActionEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.AreaEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.Class2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ClassEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ControllerEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ControllerPageActionsCompartmentEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ControllerPageViewsCompartmentEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.DocumentationEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.Interface2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.InterfaceEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ModelEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.PackagePackageCompartment2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.PackagePackageCompartmentEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.View2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ViewEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ViewViewAreaCompartment2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ViewViewAreaCompartmentEditPart;
import de.gulden.modeling.wave.diagram.part.Messages;
import de.gulden.modeling.wave.diagram.part.WaveDiagramEditorPlugin;

/**
 * @generated
 */
public class WaveModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof ClassEditPart) {
			List types = new ArrayList();
			types.add(WaveElementTypes.Attribute_2001);
			types.add(WaveElementTypes.Operation_2002);
			return types;
		}
		if (editPart instanceof InterfaceEditPart) {
			List types = new ArrayList();
			types.add(WaveElementTypes.Operation_2003);
			return types;
		}
		if (editPart instanceof ControllerEditPart) {
			List types = new ArrayList();
			types.add(WaveElementTypes.Attribute_2004);
			types.add(WaveElementTypes.Operation_2009);
			return types;
		}
		if (editPart instanceof ActionEditPart) {
			List types = new ArrayList();
			types.add(WaveElementTypes.Operation_13008);
			return types;
		}
		if (editPart instanceof ViewEditPart) {
			List types = new ArrayList();
			types.add(WaveElementTypes.Operation_13009);
			return types;
		}
		if (editPart instanceof AreaEditPart) {
			List types = new ArrayList();
			types.add(WaveElementTypes.View_13002);
			return types;
		}
		if (editPart instanceof View2EditPart) {
			List types = new ArrayList();
			types.add(WaveElementTypes.Operation_13009);
			return types;
		}
		if (editPart instanceof Class2EditPart) {
			List types = new ArrayList();
			types.add(WaveElementTypes.Attribute_2001);
			types.add(WaveElementTypes.Operation_2002);
			return types;
		}
		if (editPart instanceof Interface2EditPart) {
			List types = new ArrayList();
			types.add(WaveElementTypes.Operation_2003);
			return types;
		}
		if (editPart instanceof ControllerPageActionsCompartmentEditPart) {
			List types = new ArrayList();
			types.add(WaveElementTypes.Action_13006);
			return types;
		}
		if (editPart instanceof ControllerPageViewsCompartmentEditPart) {
			List types = new ArrayList();
			types.add(WaveElementTypes.View_13007);
			return types;
		}
		if (editPart instanceof ViewViewAreaCompartmentEditPart) {
			List types = new ArrayList();
			types.add(WaveElementTypes.Area_13001);
			return types;
		}
		if (editPart instanceof ViewViewAreaCompartment2EditPart) {
			List types = new ArrayList();
			types.add(WaveElementTypes.Area_13001);
			return types;
		}
		if (editPart instanceof PackagePackageCompartmentEditPart) {
			List types = new ArrayList();
			types.add(WaveElementTypes.Class_13003);
			types.add(WaveElementTypes.Interface_13004);
			types.add(WaveElementTypes.Package_13005);
			types.add(WaveElementTypes.Include_13010);
			return types;
		}
		if (editPart instanceof PackagePackageCompartment2EditPart) {
			List types = new ArrayList();
			types.add(WaveElementTypes.Class_13003);
			types.add(WaveElementTypes.Interface_13004);
			types.add(WaveElementTypes.Package_13005);
			types.add(WaveElementTypes.Include_13010);
			return types;
		}
		if (editPart instanceof ModelEditPart) {
			List types = new ArrayList();
			types.add(WaveElementTypes.Class_2017);
			types.add(WaveElementTypes.Interface_2018);
			types.add(WaveElementTypes.Controller_2026);
			types.add(WaveElementTypes.Include_2020);
			types.add(WaveElementTypes.Package_2021);
			types.add(WaveElementTypes.Documentation_2013);
			types.add(WaveElementTypes.StyleSheet_2022);
			types.add(WaveElementTypes.UsecaseSubsystem_2023);
			types.add(WaveElementTypes.Actor_2024);
			types.add(WaveElementTypes.Usecase_2025);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ClassEditPart) {
			List types = new ArrayList();
			types.add(WaveElementTypes.RealizationRelationship_3003);
			return types;
		}
		if (sourceEditPart instanceof ActionEditPart) {
			List types = new ArrayList();
			types.add(WaveElementTypes.ActionToViewTransition_3005);
			return types;
		}
		if (sourceEditPart instanceof Class2EditPart) {
			List types = new ArrayList();
			types.add(WaveElementTypes.RealizationRelationship_3003);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof InterfaceEditPart) {
			List types = new ArrayList();
			types.add(WaveElementTypes.RealizationRelationship_3003);
			return types;
		}
		if (targetEditPart instanceof DocumentationEditPart) {
			List types = new ArrayList();
			types.add(WaveElementTypes.ModelMemberDocs_4015);
			return types;
		}
		if (targetEditPart instanceof ViewEditPart) {
			List types = new ArrayList();
			types.add(WaveElementTypes.ActionToViewTransition_3005);
			return types;
		}
		if (targetEditPart instanceof View2EditPart) {
			List types = new ArrayList();
			types.add(WaveElementTypes.ActionToViewTransition_3005);
			return types;
		}
		if (targetEditPart instanceof Interface2EditPart) {
			List types = new ArrayList();
			types.add(WaveElementTypes.RealizationRelationship_3003);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ClassEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof InterfaceEditPart) {
				types.add(WaveElementTypes.RealizationRelationship_3003);
			}
			if (targetEditPart instanceof Interface2EditPart) {
				types.add(WaveElementTypes.RealizationRelationship_3003);
			}
			return types;
		}
		if (sourceEditPart instanceof ActionEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof ViewEditPart) {
				types.add(WaveElementTypes.ActionToViewTransition_3005);
			}
			if (targetEditPart instanceof View2EditPart) {
				types.add(WaveElementTypes.ActionToViewTransition_3005);
			}
			return types;
		}
		if (sourceEditPart instanceof Class2EditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof InterfaceEditPart) {
				types.add(WaveElementTypes.RealizationRelationship_3003);
			}
			if (targetEditPart instanceof Interface2EditPart) {
				types.add(WaveElementTypes.RealizationRelationship_3003);
			}
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof InterfaceEditPart) {
			List types = new ArrayList();
			if (relationshipType == WaveElementTypes.RealizationRelationship_3003) {
				types.add(WaveElementTypes.Class_2017);
			}
			if (relationshipType == WaveElementTypes.RealizationRelationship_3003) {
				types.add(WaveElementTypes.Class_13003);
			}
			return types;
		}
		if (targetEditPart instanceof DocumentationEditPart) {
			List types = new ArrayList();
			return types;
		}
		if (targetEditPart instanceof ViewEditPart) {
			List types = new ArrayList();
			if (relationshipType == WaveElementTypes.ActionToViewTransition_3005) {
				types.add(WaveElementTypes.Action_13006);
			}
			return types;
		}
		if (targetEditPart instanceof View2EditPart) {
			List types = new ArrayList();
			if (relationshipType == WaveElementTypes.ActionToViewTransition_3005) {
				types.add(WaveElementTypes.Action_13006);
			}
			return types;
		}
		if (targetEditPart instanceof Interface2EditPart) {
			List types = new ArrayList();
			if (relationshipType == WaveElementTypes.RealizationRelationship_3003) {
				types.add(WaveElementTypes.Class_2017);
			}
			if (relationshipType == WaveElementTypes.RealizationRelationship_3003) {
				types.add(WaveElementTypes.Class_13003);
			}
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ClassEditPart) {
			List types = new ArrayList();
			if (relationshipType == WaveElementTypes.RealizationRelationship_3003) {
				types.add(WaveElementTypes.Interface_2018);
			}
			if (relationshipType == WaveElementTypes.RealizationRelationship_3003) {
				types.add(WaveElementTypes.Interface_13004);
			}
			return types;
		}
		if (sourceEditPart instanceof ActionEditPart) {
			List types = new ArrayList();
			if (relationshipType == WaveElementTypes.ActionToViewTransition_3005) {
				types.add(WaveElementTypes.View_13007);
			}
			if (relationshipType == WaveElementTypes.ActionToViewTransition_3005) {
				types.add(WaveElementTypes.View_13002);
			}
			return types;
		}
		if (sourceEditPart instanceof Class2EditPart) {
			List types = new ArrayList();
			if (relationshipType == WaveElementTypes.RealizationRelationship_3003) {
				types.add(WaveElementTypes.Interface_2018);
			}
			if (relationshipType == WaveElementTypes.RealizationRelationship_3003) {
				types.add(WaveElementTypes.Interface_13004);
			}
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target,
				relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source,
				relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		Collection elements = new HashSet();
		for (Iterator it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				WaveDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.WaveModelingAssistantProviderMessage);
		dialog.setTitle(Messages.WaveModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
