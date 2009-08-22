/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import de.gulden.modeling.wave.Area;
import de.gulden.modeling.wave.InheritanceRelationship;
import de.gulden.modeling.wave.Model;
import de.gulden.modeling.wave.RealizationRelationship;
import de.gulden.modeling.wave.diagram.edit.parts.ActionEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ActionNameEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ActionToViewTransitionConditionEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ActionToViewTransitionEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ActorEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ActorNameEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.AreaEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.AssociationRelationshipEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.AssociationRelationshipNameEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.Attribute2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.AttributeEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.Class2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ClassEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ClassName2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ClassNameEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ControllerEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ControllerNameEditPart;
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
import de.gulden.modeling.wave.diagram.part.WaveDiagramEditorPlugin;
import de.gulden.modeling.wave.diagram.part.WaveVisualIDRegistry;
import de.gulden.modeling.wave.diagram.providers.WaveElementTypes;
import de.gulden.modeling.wave.diagram.providers.WaveParserProvider;

/**
 * @generated
 */
public class WaveNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		WaveDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		WaveDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof WaveNavigatorItem
				&& !isOwnView(((WaveNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof WaveNavigatorGroup) {
			WaveNavigatorGroup group = (WaveNavigatorGroup) element;
			return WaveDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof WaveNavigatorItem) {
			WaveNavigatorItem navigatorItem = (WaveNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (WaveVisualIDRegistry.getVisualID(view)) {
		case ModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://jensgulden.de/modeling/wave?Model", WaveElementTypes.Model_1000); //$NON-NLS-1$
		case ClassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://jensgulden.de/modeling/wave?Class", WaveElementTypes.Class_2017); //$NON-NLS-1$
		case InterfaceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://jensgulden.de/modeling/wave?Interface", WaveElementTypes.Interface_2018); //$NON-NLS-1$
		case ControllerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://jensgulden.de/modeling/wave?Controller", WaveElementTypes.Controller_2026); //$NON-NLS-1$
		case IncludeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://jensgulden.de/modeling/wave?Include", WaveElementTypes.Include_2020); //$NON-NLS-1$
		case PackageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://jensgulden.de/modeling/wave?Package", WaveElementTypes.Package_2021); //$NON-NLS-1$
		case DocumentationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://jensgulden.de/modeling/wave?Documentation", WaveElementTypes.Documentation_2013); //$NON-NLS-1$
		case StyleSheetEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://jensgulden.de/modeling/wave?StyleSheet", WaveElementTypes.StyleSheet_2022); //$NON-NLS-1$
		case UsecaseSubsystemEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://jensgulden.de/modeling/wave?UsecaseSubsystem", WaveElementTypes.UsecaseSubsystem_2023); //$NON-NLS-1$
		case ActorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://jensgulden.de/modeling/wave?Actor", WaveElementTypes.Actor_2024); //$NON-NLS-1$
		case UsecaseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://jensgulden.de/modeling/wave?Usecase", WaveElementTypes.Usecase_2025); //$NON-NLS-1$
		case AttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jensgulden.de/modeling/wave?Attribute", WaveElementTypes.Attribute_2001); //$NON-NLS-1$
		case OperationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jensgulden.de/modeling/wave?Operation", WaveElementTypes.Operation_2002); //$NON-NLS-1$
		case Operation2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jensgulden.de/modeling/wave?Operation", WaveElementTypes.Operation_2003); //$NON-NLS-1$
		case Attribute2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jensgulden.de/modeling/wave?Attribute", WaveElementTypes.Attribute_2004); //$NON-NLS-1$
		case ActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jensgulden.de/modeling/wave?Action", WaveElementTypes.Action_13006); //$NON-NLS-1$
		case Operation3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jensgulden.de/modeling/wave?Operation", WaveElementTypes.Operation_13008); //$NON-NLS-1$
		case ViewEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jensgulden.de/modeling/wave?View", WaveElementTypes.View_13007); //$NON-NLS-1$
		case Operation4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jensgulden.de/modeling/wave?Operation", WaveElementTypes.Operation_13009); //$NON-NLS-1$
		case AreaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jensgulden.de/modeling/wave?Area", WaveElementTypes.Area_13001); //$NON-NLS-1$
		case View2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jensgulden.de/modeling/wave?View", WaveElementTypes.View_13002); //$NON-NLS-1$
		case Operation5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jensgulden.de/modeling/wave?Operation", WaveElementTypes.Operation_2009); //$NON-NLS-1$
		case Class2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jensgulden.de/modeling/wave?Class", WaveElementTypes.Class_13003); //$NON-NLS-1$
		case Interface2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jensgulden.de/modeling/wave?Interface", WaveElementTypes.Interface_13004); //$NON-NLS-1$
		case Package2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jensgulden.de/modeling/wave?Package", WaveElementTypes.Package_13005); //$NON-NLS-1$
		case Include2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jensgulden.de/modeling/wave?Include", WaveElementTypes.Include_13010); //$NON-NLS-1$
		case DependencyRelationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://jensgulden.de/modeling/wave?DependencyRelationship", WaveElementTypes.DependencyRelationship_3001); //$NON-NLS-1$
		case InheritanceRelationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://jensgulden.de/modeling/wave?InheritanceRelationship", WaveElementTypes.InheritanceRelationship_3002); //$NON-NLS-1$
		case RealizationRelationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://jensgulden.de/modeling/wave?RealizationRelationship", WaveElementTypes.RealizationRelationship_3003); //$NON-NLS-1$
		case AssociationRelationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://jensgulden.de/modeling/wave?AssociationRelationship", WaveElementTypes.AssociationRelationship_3004); //$NON-NLS-1$
		case ActionToViewTransitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://jensgulden.de/modeling/wave?ActionToViewTransition", WaveElementTypes.ActionToViewTransition_3005); //$NON-NLS-1$
		case ModelMemberDocsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://jensgulden.de/modeling/wave?ModelMember?docs", WaveElementTypes.ModelMemberDocs_4015); //$NON-NLS-1$
		case ViewTransitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://jensgulden.de/modeling/wave?ViewTransition", WaveElementTypes.ViewTransition_4013); //$NON-NLS-1$
		case DependencyRelationship2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://jensgulden.de/modeling/wave?DependencyRelationship", WaveElementTypes.DependencyRelationship_4016); //$NON-NLS-1$
		case DependencyRelationship3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://jensgulden.de/modeling/wave?DependencyRelationship", WaveElementTypes.DependencyRelationship_4017); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = WaveDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& WaveElementTypes.isKnownElementType(elementType)) {
			image = WaveElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof WaveNavigatorGroup) {
			WaveNavigatorGroup group = (WaveNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof WaveNavigatorItem) {
			WaveNavigatorItem navigatorItem = (WaveNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (WaveVisualIDRegistry.getVisualID(view)) {
		case ModelEditPart.VISUAL_ID:
			return getModel_1000Text(view);
		case ClassEditPart.VISUAL_ID:
			return getClass_2017Text(view);
		case InterfaceEditPart.VISUAL_ID:
			return getInterface_2018Text(view);
		case ControllerEditPart.VISUAL_ID:
			return getController_2026Text(view);
		case IncludeEditPart.VISUAL_ID:
			return getInclude_2020Text(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_2021Text(view);
		case DocumentationEditPart.VISUAL_ID:
			return getDocumentation_2013Text(view);
		case StyleSheetEditPart.VISUAL_ID:
			return getStyleSheet_2022Text(view);
		case UsecaseSubsystemEditPart.VISUAL_ID:
			return getUsecaseSubsystem_2023Text(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2024Text(view);
		case UsecaseEditPart.VISUAL_ID:
			return getUsecase_2025Text(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_2001Text(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_2002Text(view);
		case Operation2EditPart.VISUAL_ID:
			return getOperation_2003Text(view);
		case Attribute2EditPart.VISUAL_ID:
			return getAttribute_2004Text(view);
		case ActionEditPart.VISUAL_ID:
			return getAction_13006Text(view);
		case Operation3EditPart.VISUAL_ID:
			return getOperation_13008Text(view);
		case ViewEditPart.VISUAL_ID:
			return getView_13007Text(view);
		case Operation4EditPart.VISUAL_ID:
			return getOperation_13009Text(view);
		case AreaEditPart.VISUAL_ID:
			return getArea_13001Text(view);
		case View2EditPart.VISUAL_ID:
			return getView_13002Text(view);
		case Operation5EditPart.VISUAL_ID:
			return getOperation_2009Text(view);
		case Class2EditPart.VISUAL_ID:
			return getClass_13003Text(view);
		case Interface2EditPart.VISUAL_ID:
			return getInterface_13004Text(view);
		case Package2EditPart.VISUAL_ID:
			return getPackage_13005Text(view);
		case Include2EditPart.VISUAL_ID:
			return getInclude_13010Text(view);
		case DependencyRelationshipEditPart.VISUAL_ID:
			return getDependencyRelationship_3001Text(view);
		case InheritanceRelationshipEditPart.VISUAL_ID:
			return getInheritanceRelationship_3002Text(view);
		case RealizationRelationshipEditPart.VISUAL_ID:
			return getRealizationRelationship_3003Text(view);
		case AssociationRelationshipEditPart.VISUAL_ID:
			return getAssociationRelationship_3004Text(view);
		case ActionToViewTransitionEditPart.VISUAL_ID:
			return getActionToViewTransition_3005Text(view);
		case ModelMemberDocsEditPart.VISUAL_ID:
			return getModelMemberDocs_4015Text(view);
		case ViewTransitionEditPart.VISUAL_ID:
			return getViewTransition_4013Text(view);
		case DependencyRelationship2EditPart.VISUAL_ID:
			return getDependencyRelationship_4016Text(view);
		case DependencyRelationship3EditPart.VISUAL_ID:
			return getDependencyRelationship_4017Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getModel_1000Text(View view) {
		Model domainModelElement = (Model) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClass_2017Text(View view) {
		IAdaptable hintAdapter = new WaveParserProvider.HintAdapter(
				WaveElementTypes.Class_2017, (view.getElement() != null ? view
						.getElement() : view), WaveVisualIDRegistry
						.getType(ClassNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getInterface_2018Text(View view) {
		IAdaptable hintAdapter = new WaveParserProvider.HintAdapter(
				WaveElementTypes.Interface_2018,
				(view.getElement() != null ? view.getElement() : view),
				WaveVisualIDRegistry.getType(InterfaceNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getController_2026Text(View view) {
		IAdaptable hintAdapter = new WaveParserProvider.HintAdapter(
				WaveElementTypes.Controller_2026,
				(view.getElement() != null ? view.getElement() : view),
				WaveVisualIDRegistry.getType(ControllerNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getInclude_2020Text(View view) {
		IAdaptable hintAdapter = new WaveParserProvider.HintAdapter(
				WaveElementTypes.Include_2020,
				(view.getElement() != null ? view.getElement() : view),
				WaveVisualIDRegistry.getType(IncludeNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getPackage_2021Text(View view) {
		IAdaptable hintAdapter = new WaveParserProvider.HintAdapter(
				WaveElementTypes.Package_2021,
				(view.getElement() != null ? view.getElement() : view),
				WaveVisualIDRegistry.getType(PackageNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getDocumentation_2013Text(View view) {
		IAdaptable hintAdapter = new WaveParserProvider.HintAdapter(
				WaveElementTypes.Documentation_2013,
				(view.getElement() != null ? view.getElement() : view),
				WaveVisualIDRegistry
						.getType(DocumentationTextEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getStyleSheet_2022Text(View view) {
		IAdaptable hintAdapter = new WaveParserProvider.HintAdapter(
				WaveElementTypes.StyleSheet_2022,
				(view.getElement() != null ? view.getElement() : view),
				WaveVisualIDRegistry.getType(StyleSheetNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getUsecaseSubsystem_2023Text(View view) {
		IAdaptable hintAdapter = new WaveParserProvider.HintAdapter(
				WaveElementTypes.UsecaseSubsystem_2023,
				(view.getElement() != null ? view.getElement() : view),
				WaveVisualIDRegistry
						.getType(UsecaseSubsystemNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getActor_2024Text(View view) {
		IAdaptable hintAdapter = new WaveParserProvider.HintAdapter(
				WaveElementTypes.Actor_2024, (view.getElement() != null ? view
						.getElement() : view), WaveVisualIDRegistry
						.getType(ActorNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getUsecase_2025Text(View view) {
		IAdaptable hintAdapter = new WaveParserProvider.HintAdapter(
				WaveElementTypes.Usecase_2025,
				(view.getElement() != null ? view.getElement() : view),
				WaveVisualIDRegistry.getType(UsecaseTextEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getAttribute_2001Text(View view) {
		IAdaptable hintAdapter = new WaveParserProvider.HintAdapter(
				WaveElementTypes.Attribute_2001,
				(view.getElement() != null ? view.getElement() : view),
				WaveVisualIDRegistry.getType(AttributeEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 2001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOperation_2002Text(View view) {
		IAdaptable hintAdapter = new WaveParserProvider.HintAdapter(
				WaveElementTypes.Operation_2002,
				(view.getElement() != null ? view.getElement() : view),
				WaveVisualIDRegistry.getType(OperationEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 2002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOperation_2003Text(View view) {
		IAdaptable hintAdapter = new WaveParserProvider.HintAdapter(
				WaveElementTypes.Operation_2003,
				(view.getElement() != null ? view.getElement() : view),
				WaveVisualIDRegistry.getType(Operation2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 2003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttribute_2004Text(View view) {
		IAdaptable hintAdapter = new WaveParserProvider.HintAdapter(
				WaveElementTypes.Attribute_2004,
				(view.getElement() != null ? view.getElement() : view),
				WaveVisualIDRegistry.getType(Attribute2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 2004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAction_13006Text(View view) {
		IAdaptable hintAdapter = new WaveParserProvider.HintAdapter(
				WaveElementTypes.Action_13006,
				(view.getElement() != null ? view.getElement() : view),
				WaveVisualIDRegistry.getType(ActionNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getOperation_13008Text(View view) {
		IAdaptable hintAdapter = new WaveParserProvider.HintAdapter(
				WaveElementTypes.Operation_13008,
				(view.getElement() != null ? view.getElement() : view),
				WaveVisualIDRegistry.getType(Operation3EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 13008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getView_13007Text(View view) {
		IAdaptable hintAdapter = new WaveParserProvider.HintAdapter(
				WaveElementTypes.View_13007, (view.getElement() != null ? view
						.getElement() : view), WaveVisualIDRegistry
						.getType(ViewNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getOperation_13009Text(View view) {
		IAdaptable hintAdapter = new WaveParserProvider.HintAdapter(
				WaveElementTypes.Operation_13009,
				(view.getElement() != null ? view.getElement() : view),
				WaveVisualIDRegistry.getType(Operation4EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 13009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArea_13001Text(View view) {
		Area domainModelElement = (Area) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 13001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getView_13002Text(View view) {
		IAdaptable hintAdapter = new WaveParserProvider.HintAdapter(
				WaveElementTypes.View_13002, (view.getElement() != null ? view
						.getElement() : view), WaveVisualIDRegistry
						.getType(ViewName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getOperation_2009Text(View view) {
		IAdaptable hintAdapter = new WaveParserProvider.HintAdapter(
				WaveElementTypes.Operation_2009,
				(view.getElement() != null ? view.getElement() : view),
				WaveVisualIDRegistry.getType(Operation5EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 2009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClass_13003Text(View view) {
		IAdaptable hintAdapter = new WaveParserProvider.HintAdapter(
				WaveElementTypes.Class_13003, (view.getElement() != null ? view
						.getElement() : view), WaveVisualIDRegistry
						.getType(ClassName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getInterface_13004Text(View view) {
		IAdaptable hintAdapter = new WaveParserProvider.HintAdapter(
				WaveElementTypes.Interface_13004,
				(view.getElement() != null ? view.getElement() : view),
				WaveVisualIDRegistry.getType(InterfaceName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getPackage_13005Text(View view) {
		IAdaptable hintAdapter = new WaveParserProvider.HintAdapter(
				WaveElementTypes.Package_13005,
				(view.getElement() != null ? view.getElement() : view),
				WaveVisualIDRegistry.getType(PackageName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getInclude_13010Text(View view) {
		IAdaptable hintAdapter = new WaveParserProvider.HintAdapter(
				WaveElementTypes.Include_13010,
				(view.getElement() != null ? view.getElement() : view),
				WaveVisualIDRegistry.getType(IncludeName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getDependencyRelationship_3001Text(View view) {
		IAdaptable hintAdapter = new WaveParserProvider.HintAdapter(
				WaveElementTypes.DependencyRelationship_3001,
				(view.getElement() != null ? view.getElement() : view),
				WaveVisualIDRegistry
						.getType(DependencyRelationshipStereotypeEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getInheritanceRelationship_3002Text(View view) {
		InheritanceRelationship domainModelElement = (InheritanceRelationship) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getStereotype();
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRealizationRelationship_3003Text(View view) {
		RealizationRelationship domainModelElement = (RealizationRelationship) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getStereotype();
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssociationRelationship_3004Text(View view) {
		IAdaptable hintAdapter = new WaveParserProvider.HintAdapter(
				WaveElementTypes.AssociationRelationship_3004, (view
						.getElement() != null ? view.getElement() : view),
				WaveVisualIDRegistry
						.getType(AssociationRelationshipNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getActionToViewTransition_3005Text(View view) {
		IAdaptable hintAdapter = new WaveParserProvider.HintAdapter(
				WaveElementTypes.ActionToViewTransition_3005,
				(view.getElement() != null ? view.getElement() : view),
				WaveVisualIDRegistry
						.getType(ActionToViewTransitionConditionEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getModelMemberDocs_4015Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getViewTransition_4013Text(View view) {
		IAdaptable hintAdapter = new WaveParserProvider.HintAdapter(
				WaveElementTypes.ViewTransition_4013,
				(view.getElement() != null ? view.getElement() : view),
				WaveVisualIDRegistry
						.getType(ViewTransitionNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getDependencyRelationship_4016Text(View view) {
		IAdaptable hintAdapter = new WaveParserProvider.HintAdapter(
				WaveElementTypes.DependencyRelationship_4016,
				(view.getElement() != null ? view.getElement() : view),
				WaveVisualIDRegistry
						.getType(DependencyRelationshipStereotype2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getDependencyRelationship_4017Text(View view) {
		IAdaptable hintAdapter = new WaveParserProvider.HintAdapter(
				WaveElementTypes.DependencyRelationship_4017,
				(view.getElement() != null ? view.getElement() : view),
				WaveVisualIDRegistry
						.getType(DependencyRelationshipStereotype3EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ModelEditPart.MODEL_ID.equals(WaveVisualIDRegistry
				.getModelID(view));
	}

}
