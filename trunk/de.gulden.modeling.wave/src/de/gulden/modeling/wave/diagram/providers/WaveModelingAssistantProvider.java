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
import de.gulden.modeling.wave.diagram.edit.parts.ActorEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.AreaEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.Class2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ClassEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ControllerEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ControllerPageActionsCompartmentEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ControllerPageViewsCompartmentEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.DocumentationEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.Include2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.IncludeEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.Interface2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.InterfaceEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ModelEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.Package2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.PackageEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.PackagePackageCompartment2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.PackagePackageCompartmentEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.StyleSheetEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.UsecaseEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.UsecaseSubsystemEditPart;
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
			ArrayList types = new ArrayList(2);
			types.add(WaveElementTypes.Attribute_2001);
			types.add(WaveElementTypes.Operation_2002);
			return types;
		}
		if (editPart instanceof InterfaceEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(WaveElementTypes.Operation_2003);
			return types;
		}
		if (editPart instanceof ControllerEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(WaveElementTypes.Attribute_2004);
			types.add(WaveElementTypes.Operation_2009);
			return types;
		}
		if (editPart instanceof ActionEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(WaveElementTypes.Operation_13008);
			return types;
		}
		if (editPart instanceof ViewEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(WaveElementTypes.Operation_13009);
			return types;
		}
		if (editPart instanceof AreaEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(WaveElementTypes.View_13002);
			return types;
		}
		if (editPart instanceof View2EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(WaveElementTypes.Operation_13009);
			return types;
		}
		if (editPart instanceof Class2EditPart) {
			ArrayList types = new ArrayList(2);
			types.add(WaveElementTypes.Attribute_2001);
			types.add(WaveElementTypes.Operation_2002);
			return types;
		}
		if (editPart instanceof Interface2EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(WaveElementTypes.Operation_2003);
			return types;
		}
		if (editPart instanceof ControllerPageActionsCompartmentEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(WaveElementTypes.Action_13006);
			return types;
		}
		if (editPart instanceof ControllerPageViewsCompartmentEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(WaveElementTypes.View_13007);
			return types;
		}
		if (editPart instanceof ViewViewAreaCompartmentEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(WaveElementTypes.Area_13001);
			return types;
		}
		if (editPart instanceof ViewViewAreaCompartment2EditPart) {
			ArrayList types = new ArrayList(1);
			types.add(WaveElementTypes.Area_13001);
			return types;
		}
		if (editPart instanceof PackagePackageCompartmentEditPart) {
			ArrayList types = new ArrayList(4);
			types.add(WaveElementTypes.Class_13003);
			types.add(WaveElementTypes.Interface_13004);
			types.add(WaveElementTypes.Package_13005);
			types.add(WaveElementTypes.Include_13010);
			return types;
		}
		if (editPart instanceof PackagePackageCompartment2EditPart) {
			ArrayList types = new ArrayList(4);
			types.add(WaveElementTypes.Class_13003);
			types.add(WaveElementTypes.Interface_13004);
			types.add(WaveElementTypes.Package_13005);
			types.add(WaveElementTypes.Include_13010);
			return types;
		}
		if (editPart instanceof ModelEditPart) {
			ArrayList types = new ArrayList(10);
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
			return ((ClassEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof InterfaceEditPart) {
			return ((InterfaceEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ControllerEditPart) {
			return ((ControllerEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof IncludeEditPart) {
			return ((IncludeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PackageEditPart) {
			return ((PackageEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StyleSheetEditPart) {
			return ((StyleSheetEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof UsecaseSubsystemEditPart) {
			return ((UsecaseSubsystemEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ActorEditPart) {
			return ((ActorEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof UsecaseEditPart) {
			return ((UsecaseEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ActionEditPart) {
			return ((ActionEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ViewEditPart) {
			return ((ViewEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AreaEditPart) {
			return ((AreaEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof View2EditPart) {
			return ((View2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Class2EditPart) {
			return ((Class2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Interface2EditPart) {
			return ((Interface2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Package2EditPart) {
			return ((Package2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Include2EditPart) {
			return ((Include2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof ClassEditPart) {
			return ((ClassEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof InterfaceEditPart) {
			return ((InterfaceEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ControllerEditPart) {
			return ((ControllerEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof IncludeEditPart) {
			return ((IncludeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof PackageEditPart) {
			return ((PackageEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof DocumentationEditPart) {
			return ((DocumentationEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StyleSheetEditPart) {
			return ((StyleSheetEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof UsecaseSubsystemEditPart) {
			return ((UsecaseSubsystemEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ActorEditPart) {
			return ((ActorEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof UsecaseEditPart) {
			return ((UsecaseEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ActionEditPart) {
			return ((ActionEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ViewEditPart) {
			return ((ViewEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AreaEditPart) {
			return ((AreaEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof View2EditPart) {
			return ((View2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Class2EditPart) {
			return ((Class2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Interface2EditPart) {
			return ((Interface2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Package2EditPart) {
			return ((Package2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Include2EditPart) {
			return ((Include2EditPart) targetEditPart).getMARelTypesOnTarget();
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
			return ((ClassEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof InterfaceEditPart) {
			return ((InterfaceEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ControllerEditPart) {
			return ((ControllerEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof IncludeEditPart) {
			return ((IncludeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PackageEditPart) {
			return ((PackageEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StyleSheetEditPart) {
			return ((StyleSheetEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof UsecaseSubsystemEditPart) {
			return ((UsecaseSubsystemEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ActorEditPart) {
			return ((ActorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof UsecaseEditPart) {
			return ((UsecaseEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ActionEditPart) {
			return ((ActionEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ViewEditPart) {
			return ((ViewEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AreaEditPart) {
			return ((AreaEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof View2EditPart) {
			return ((View2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Class2EditPart) {
			return ((Class2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Interface2EditPart) {
			return ((Interface2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Package2EditPart) {
			return ((Package2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Include2EditPart) {
			return ((Include2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
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
		if (targetEditPart instanceof ClassEditPart) {
			return ((ClassEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof InterfaceEditPart) {
			return ((InterfaceEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ControllerEditPart) {
			return ((ControllerEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof IncludeEditPart) {
			return ((IncludeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof PackageEditPart) {
			return ((PackageEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof DocumentationEditPart) {
			return ((DocumentationEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StyleSheetEditPart) {
			return ((StyleSheetEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof UsecaseSubsystemEditPart) {
			return ((UsecaseSubsystemEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ActorEditPart) {
			return ((ActorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof UsecaseEditPart) {
			return ((UsecaseEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ActionEditPart) {
			return ((ActionEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ViewEditPart) {
			return ((ViewEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AreaEditPart) {
			return ((AreaEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof View2EditPart) {
			return ((View2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Class2EditPart) {
			return ((Class2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Interface2EditPart) {
			return ((Interface2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Package2EditPart) {
			return ((Package2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Include2EditPart) {
			return ((Include2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
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
			return ((ClassEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof InterfaceEditPart) {
			return ((InterfaceEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ControllerEditPart) {
			return ((ControllerEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof IncludeEditPart) {
			return ((IncludeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PackageEditPart) {
			return ((PackageEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StyleSheetEditPart) {
			return ((StyleSheetEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof UsecaseSubsystemEditPart) {
			return ((UsecaseSubsystemEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ActorEditPart) {
			return ((ActorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof UsecaseEditPart) {
			return ((UsecaseEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ActionEditPart) {
			return ((ActionEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ViewEditPart) {
			return ((ViewEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AreaEditPart) {
			return ((AreaEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof View2EditPart) {
			return ((View2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Class2EditPart) {
			return ((Class2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Interface2EditPart) {
			return ((Interface2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Package2EditPart) {
			return ((Package2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Include2EditPart) {
			return ((Include2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
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
