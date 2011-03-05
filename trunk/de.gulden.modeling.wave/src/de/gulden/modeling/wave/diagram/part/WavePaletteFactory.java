/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import de.gulden.modeling.wave.diagram.providers.WaveElementTypes;

/**
 * @generated
 */
public class WavePaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createDocumentation1Group());
		paletteRoot.add(createElements2Group());
		paletteRoot.add(createElementsofPage3Group());
		paletteRoot.add(createElementsofClass4Group());
		paletteRoot.add(createRelationships5Group());
		paletteRoot.add(createUseCases6Group());
	}

	/**
	 * Creates "Documentation" palette tool group
	 * @generated
	 */
	private PaletteContainer createDocumentation1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Documentation1Group_title);
		paletteContainer.setId("createDocumentation1Group"); //$NON-NLS-1$
		paletteContainer.add(createDocumentation1CreationTool());
		paletteContainer.add(createConnection2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Elements" palette tool group
	 * @generated
	 */
	private PaletteContainer createElements2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Elements2Group_title);
		paletteContainer.setId("createElements2Group"); //$NON-NLS-1$
		paletteContainer.add(createController1CreationTool());
		paletteContainer.add(createClass2CreationTool());
		paletteContainer.add(createInterface3CreationTool());
		paletteContainer.add(createInclude4CreationTool());
		paletteContainer.add(createStyleSheet5CreationTool());
		paletteContainer.add(createPackage6CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Elements of Page" palette tool group
	 * @generated
	 */
	private PaletteContainer createElementsofPage3Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.ElementsofPage3Group_title);
		paletteContainer.setId("createElementsofPage3Group"); //$NON-NLS-1$
		paletteContainer.add(createAction1CreationTool());
		paletteContainer.add(createView2CreationTool());
		//paletteContainer.add(createArea3CreationTool()) ;
		paletteContainer.add(createTransition4CreationTool());
		paletteContainer.add(createFlow5CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Elements of Class" palette tool group
	 * @generated
	 */
	private PaletteContainer createElementsofClass4Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.ElementsofClass4Group_title);
		paletteContainer.setId("createElementsofClass4Group"); //$NON-NLS-1$
		paletteContainer.add(createAttribute1CreationTool());
		paletteContainer.add(createOperation2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Relationships" palette tool group
	 * @generated
	 */
	private PaletteContainer createRelationships5Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Relationships5Group_title);
		paletteContainer.setId("createRelationships5Group"); //$NON-NLS-1$
		paletteContainer.add(createAssociation1CreationTool());
		paletteContainer.add(createDependency2CreationTool());
		paletteContainer.add(createInheritance3CreationTool());
		paletteContainer.add(createRealization4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Use Cases" palette tool group
	 * @generated
	 */
	private PaletteContainer createUseCases6Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.UseCases6Group_title);
		paletteContainer.setId("createUseCases6Group"); //$NON-NLS-1$
		paletteContainer.add(createSubsystem1CreationTool());
		paletteContainer.add(createActor2CreationTool());
		paletteContainer.add(createUseCase3CreationTool());
		paletteContainer.add(createIncludes4CreationTool());
		paletteContainer.add(createExtends5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDocumentation1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Documentation1CreationTool_title,
				Messages.Documentation1CreationTool_desc,
				Collections.singletonList(WaveElementTypes.Documentation_2013));
		entry.setId("createDocumentation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/Documentation.gif")); //$NON-NLS-1$
		entry.setLargeIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/Documentation.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnection2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Connection2CreationTool_title,
				Messages.Connection2CreationTool_desc,
				Collections
						.singletonList(WaveElementTypes.ModelMemberDocs_4015));
		entry.setId("createConnection2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/DocumentationConnection.gif")); //$NON-NLS-1$
		entry.setLargeIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/DocumentationConnection.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createController1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Controller1CreationTool_title,
				Messages.Controller1CreationTool_desc,
				Collections.singletonList(WaveElementTypes.Controller_2026));
		entry.setId("createController1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/Controller.gif")); //$NON-NLS-1$
		entry.setLargeIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/Controller.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClass2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WaveElementTypes.Class_2017);
		types.add(WaveElementTypes.Class_13003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Class2CreationTool_title,
				Messages.Class2CreationTool_desc, types);
		entry.setId("createClass2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/Class.gif")); //$NON-NLS-1$
		entry.setLargeIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/Class.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInterface3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WaveElementTypes.Interface_2018);
		types.add(WaveElementTypes.Interface_13004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Interface3CreationTool_title,
				Messages.Interface3CreationTool_desc, types);
		entry.setId("createInterface3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/Interface.gif")); //$NON-NLS-1$
		entry.setLargeIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/Interface.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInclude4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WaveElementTypes.Include_2020);
		types.add(WaveElementTypes.Include_13010);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Include4CreationTool_title,
				Messages.Include4CreationTool_desc, types);
		entry.setId("createInclude4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/Include.gif")); //$NON-NLS-1$
		entry.setLargeIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/Include.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStyleSheet5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.StyleSheet5CreationTool_title,
				Messages.StyleSheet5CreationTool_desc,
				Collections.singletonList(WaveElementTypes.StyleSheet_2022));
		entry.setId("createStyleSheet5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/StyleSheet.gif")); //$NON-NLS-1$
		entry.setLargeIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/StyleSheet.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPackage6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WaveElementTypes.Package_2021);
		types.add(WaveElementTypes.Package_13005);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Package6CreationTool_title,
				Messages.Package6CreationTool_desc, types);
		entry.setId("createPackage6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/Package.gif")); //$NON-NLS-1$
		entry.setLargeIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/Package.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAction1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Action1CreationTool_title,
				Messages.Action1CreationTool_desc,
				Collections.singletonList(WaveElementTypes.Action_13006));
		entry.setId("createAction1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/Action.gif")); //$NON-NLS-1$
		entry.setLargeIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/Action.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createView2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WaveElementTypes.View_13007);
		types.add(WaveElementTypes.View_13002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.View2CreationTool_title,
				Messages.View2CreationTool_desc, types);
		entry.setId("createView2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/View.gif")); //$NON-NLS-1$
		entry.setLargeIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/View.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArea3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Area3CreationTool_title,
				Messages.Area3CreationTool_desc,
				Collections.singletonList(WaveElementTypes.Area_13001));
		entry.setId("createArea3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/Area.gif")); //$NON-NLS-1$
		entry.setLargeIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/Area.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransition4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Transition4CreationTool_title,
				Messages.Transition4CreationTool_desc,
				Collections
						.singletonList(WaveElementTypes.ActionToViewTransition_3005));
		entry.setId("createTransition4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/ActionToViewTransition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/ActionToViewTransition.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFlow5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Flow5CreationTool_title,
				Messages.Flow5CreationTool_desc,
				Collections.singletonList(WaveElementTypes.ViewTransition_4013));
		entry.setId("createFlow5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/ViewTransition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/ViewTransition.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WaveElementTypes.Attribute_2001);
		types.add(WaveElementTypes.Attribute_2004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Attribute1CreationTool_title,
				Messages.Attribute1CreationTool_desc, types);
		entry.setId("createAttribute1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/Attribute.gif")); //$NON-NLS-1$
		entry.setLargeIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/Attribute.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOperation2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(WaveElementTypes.Operation_2002);
		types.add(WaveElementTypes.Operation_2003);
		types.add(WaveElementTypes.Operation_13008);
		types.add(WaveElementTypes.Operation_13009);
		types.add(WaveElementTypes.Operation_2009);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Operation2CreationTool_title,
				Messages.Operation2CreationTool_desc, types);
		entry.setId("createOperation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/Operation.gif")); //$NON-NLS-1$
		entry.setLargeIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/Operation.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssociation1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Association1CreationTool_title,
				Messages.Association1CreationTool_desc,
				Collections
						.singletonList(WaveElementTypes.AssociationRelationship_3004));
		entry.setId("createAssociation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/AssociationRelationship.gif")); //$NON-NLS-1$
		entry.setLargeIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/AssociationRelationship.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDependency2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Dependency2CreationTool_title,
				Messages.Dependency2CreationTool_desc,
				Collections
						.singletonList(WaveElementTypes.DependencyRelationship_3001));
		entry.setId("createDependency2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/DependencyRelationship.gif")); //$NON-NLS-1$
		entry.setLargeIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/DependencyRelationship.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInheritance3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Inheritance3CreationTool_title,
				Messages.Inheritance3CreationTool_desc,
				Collections
						.singletonList(WaveElementTypes.InheritanceRelationship_3002));
		entry.setId("createInheritance3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/InheritanceRelationship.gif")); //$NON-NLS-1$
		entry.setLargeIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/InheritanceRelationship.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRealization4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Realization4CreationTool_title,
				Messages.Realization4CreationTool_desc,
				Collections
						.singletonList(WaveElementTypes.RealizationRelationship_3003));
		entry.setId("createRealization4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/RealizationRelationship.gif")); //$NON-NLS-1$
		entry.setLargeIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/RealizationRelationship.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubsystem1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Subsystem1CreationTool_title,
				Messages.Subsystem1CreationTool_desc,
				Collections
						.singletonList(WaveElementTypes.UsecaseSubsystem_2023));
		entry.setId("createSubsystem1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/UsecaseSubsystem.gif")); //$NON-NLS-1$
		entry.setLargeIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/UsecaseSubsystem.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActor2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Actor2CreationTool_title,
				Messages.Actor2CreationTool_desc,
				Collections.singletonList(WaveElementTypes.Actor_2024));
		entry.setId("createActor2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/Actor.gif")); //$NON-NLS-1$
		entry.setLargeIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/Actor.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUseCase3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.UseCase3CreationTool_title,
				Messages.UseCase3CreationTool_desc,
				Collections.singletonList(WaveElementTypes.Usecase_2025));
		entry.setId("createUseCase3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/Usecase.gif")); //$NON-NLS-1$
		entry.setLargeIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/Usecase.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIncludes4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Includes4CreationTool_title,
				Messages.Includes4CreationTool_desc,
				Collections
						.singletonList(WaveElementTypes.DependencyRelationship_4016));
		entry.setId("createIncludes4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/IncludesRelationship.gif")); //$NON-NLS-1$
		entry.setLargeIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/IncludesRelationship.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExtends5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Extends5CreationTool_title,
				Messages.Extends5CreationTool_desc,
				Collections
						.singletonList(WaveElementTypes.DependencyRelationship_4017));
		entry.setId("createExtends5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/ExtendsRelationship.gif")); //$NON-NLS-1$
		entry.setLargeIcon(WaveDiagramEditorPlugin
				.findImageDescriptor("/de.gulden.modeling.wave/icons/full/obj16/ExtendsRelationship.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
