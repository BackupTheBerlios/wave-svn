/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.diagram.edit.parts;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.swt.graphics.Color;
import de.gulden.modeling.wave.diagram.edit.policies.IncludeItemSemanticEditPolicy;
import de.gulden.modeling.wave.diagram.edit.policies.WaveTextSelectionEditPolicy;
import de.gulden.modeling.wave.diagram.part.WaveVisualIDRegistry;
import de.gulden.modeling.wave.diagram.providers.WaveElementTypes;

/**
 * @generated
 */
public class IncludeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2020;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public IncludeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new IncludeItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		ConstrainedToolbarLayoutEditPolicy lep = new ConstrainedToolbarLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				if (child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE) == null) {
					if (child instanceof ITextAwareEditPart) {
						return new WaveTextSelectionEditPolicy();
					}
				}
				return super.createChildEditPolicy(child);
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		IncludeFigure figure = new IncludeFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public IncludeFigure getPrimaryShape() {
		return (IncludeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof IncludeNameEditPart) {
			((IncludeNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureIncludeNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof IncludeNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(WaveVisualIDRegistry
				.getType(IncludeNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSource() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(WaveElementTypes.DependencyRelationship_3001);
		types.add(WaveElementTypes.InheritanceRelationship_3002);
		types.add(WaveElementTypes.ModelMemberDocs_4015);
		types.add(WaveElementTypes.DependencyRelationship_4016);
		types.add(WaveElementTypes.DependencyRelationship_4017);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (targetEditPart instanceof ClassEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_3001);
		}
		if (targetEditPart instanceof InterfaceEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_3001);
		}
		if (targetEditPart instanceof ControllerEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_3001);
		}
		if (targetEditPart instanceof de.gulden.modeling.wave.diagram.edit.parts.IncludeEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_3001);
		}
		if (targetEditPart instanceof PackageEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_3001);
		}
		if (targetEditPart instanceof StyleSheetEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_3001);
		}
		if (targetEditPart instanceof UsecaseSubsystemEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_3001);
		}
		if (targetEditPart instanceof ActorEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_3001);
		}
		if (targetEditPart instanceof UsecaseEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_3001);
		}
		if (targetEditPart instanceof ActionEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_3001);
		}
		if (targetEditPart instanceof ViewEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_3001);
		}
		if (targetEditPart instanceof AreaEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_3001);
		}
		if (targetEditPart instanceof View2EditPart) {
			types.add(WaveElementTypes.DependencyRelationship_3001);
		}
		if (targetEditPart instanceof Class2EditPart) {
			types.add(WaveElementTypes.DependencyRelationship_3001);
		}
		if (targetEditPart instanceof Interface2EditPart) {
			types.add(WaveElementTypes.DependencyRelationship_3001);
		}
		if (targetEditPart instanceof Package2EditPart) {
			types.add(WaveElementTypes.DependencyRelationship_3001);
		}
		if (targetEditPart instanceof Include2EditPart) {
			types.add(WaveElementTypes.DependencyRelationship_3001);
		}
		if (targetEditPart instanceof ClassEditPart) {
			types.add(WaveElementTypes.InheritanceRelationship_3002);
		}
		if (targetEditPart instanceof InterfaceEditPart) {
			types.add(WaveElementTypes.InheritanceRelationship_3002);
		}
		if (targetEditPart instanceof ControllerEditPart) {
			types.add(WaveElementTypes.InheritanceRelationship_3002);
		}
		if (targetEditPart instanceof de.gulden.modeling.wave.diagram.edit.parts.IncludeEditPart) {
			types.add(WaveElementTypes.InheritanceRelationship_3002);
		}
		if (targetEditPart instanceof StyleSheetEditPart) {
			types.add(WaveElementTypes.InheritanceRelationship_3002);
		}
		if (targetEditPart instanceof ActorEditPart) {
			types.add(WaveElementTypes.InheritanceRelationship_3002);
		}
		if (targetEditPart instanceof UsecaseEditPart) {
			types.add(WaveElementTypes.InheritanceRelationship_3002);
		}
		if (targetEditPart instanceof Class2EditPart) {
			types.add(WaveElementTypes.InheritanceRelationship_3002);
		}
		if (targetEditPart instanceof Interface2EditPart) {
			types.add(WaveElementTypes.InheritanceRelationship_3002);
		}
		if (targetEditPart instanceof Include2EditPart) {
			types.add(WaveElementTypes.InheritanceRelationship_3002);
		}
		if (targetEditPart instanceof DocumentationEditPart) {
			types.add(WaveElementTypes.ModelMemberDocs_4015);
		}
		if (targetEditPart instanceof ClassEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4016);
		}
		if (targetEditPart instanceof InterfaceEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4016);
		}
		if (targetEditPart instanceof ControllerEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4016);
		}
		if (targetEditPart instanceof de.gulden.modeling.wave.diagram.edit.parts.IncludeEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4016);
		}
		if (targetEditPart instanceof PackageEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4016);
		}
		if (targetEditPart instanceof StyleSheetEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4016);
		}
		if (targetEditPart instanceof UsecaseSubsystemEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4016);
		}
		if (targetEditPart instanceof ActorEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4016);
		}
		if (targetEditPart instanceof UsecaseEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4016);
		}
		if (targetEditPart instanceof ActionEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4016);
		}
		if (targetEditPart instanceof ViewEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4016);
		}
		if (targetEditPart instanceof AreaEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4016);
		}
		if (targetEditPart instanceof View2EditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4016);
		}
		if (targetEditPart instanceof Class2EditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4016);
		}
		if (targetEditPart instanceof Interface2EditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4016);
		}
		if (targetEditPart instanceof Package2EditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4016);
		}
		if (targetEditPart instanceof Include2EditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4016);
		}
		if (targetEditPart instanceof ClassEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4017);
		}
		if (targetEditPart instanceof InterfaceEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4017);
		}
		if (targetEditPart instanceof ControllerEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4017);
		}
		if (targetEditPart instanceof de.gulden.modeling.wave.diagram.edit.parts.IncludeEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4017);
		}
		if (targetEditPart instanceof PackageEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4017);
		}
		if (targetEditPart instanceof StyleSheetEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4017);
		}
		if (targetEditPart instanceof UsecaseSubsystemEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4017);
		}
		if (targetEditPart instanceof ActorEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4017);
		}
		if (targetEditPart instanceof UsecaseEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4017);
		}
		if (targetEditPart instanceof ActionEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4017);
		}
		if (targetEditPart instanceof ViewEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4017);
		}
		if (targetEditPart instanceof AreaEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4017);
		}
		if (targetEditPart instanceof View2EditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4017);
		}
		if (targetEditPart instanceof Class2EditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4017);
		}
		if (targetEditPart instanceof Interface2EditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4017);
		}
		if (targetEditPart instanceof Package2EditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4017);
		}
		if (targetEditPart instanceof Include2EditPart) {
			types.add(WaveElementTypes.DependencyRelationship_4017);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForTarget(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.Class_2017);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.Interface_2018);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.Controller_2026);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.Include_2020);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.Package_2021);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.StyleSheet_2022);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.UsecaseSubsystem_2023);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.Actor_2024);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.Usecase_2025);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.Action_13006);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.View_13007);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.Area_13001);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.View_13002);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.Class_13003);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.Interface_13004);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.Package_13005);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.Include_13010);
		}
		if (relationshipType == WaveElementTypes.InheritanceRelationship_3002) {
			types.add(WaveElementTypes.Class_2017);
		}
		if (relationshipType == WaveElementTypes.InheritanceRelationship_3002) {
			types.add(WaveElementTypes.Interface_2018);
		}
		if (relationshipType == WaveElementTypes.InheritanceRelationship_3002) {
			types.add(WaveElementTypes.Controller_2026);
		}
		if (relationshipType == WaveElementTypes.InheritanceRelationship_3002) {
			types.add(WaveElementTypes.Include_2020);
		}
		if (relationshipType == WaveElementTypes.InheritanceRelationship_3002) {
			types.add(WaveElementTypes.StyleSheet_2022);
		}
		if (relationshipType == WaveElementTypes.InheritanceRelationship_3002) {
			types.add(WaveElementTypes.Actor_2024);
		}
		if (relationshipType == WaveElementTypes.InheritanceRelationship_3002) {
			types.add(WaveElementTypes.Usecase_2025);
		}
		if (relationshipType == WaveElementTypes.InheritanceRelationship_3002) {
			types.add(WaveElementTypes.Class_13003);
		}
		if (relationshipType == WaveElementTypes.InheritanceRelationship_3002) {
			types.add(WaveElementTypes.Interface_13004);
		}
		if (relationshipType == WaveElementTypes.InheritanceRelationship_3002) {
			types.add(WaveElementTypes.Include_13010);
		}
		if (relationshipType == WaveElementTypes.ModelMemberDocs_4015) {
			types.add(WaveElementTypes.Documentation_2013);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.Class_2017);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.Interface_2018);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.Controller_2026);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.Include_2020);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.Package_2021);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.StyleSheet_2022);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.UsecaseSubsystem_2023);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.Actor_2024);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.Usecase_2025);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.Action_13006);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.View_13007);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.Area_13001);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.View_13002);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.Class_13003);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.Interface_13004);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.Package_13005);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.Include_13010);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.Class_2017);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.Interface_2018);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.Controller_2026);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.Include_2020);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.Package_2021);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.StyleSheet_2022);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.UsecaseSubsystem_2023);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.Actor_2024);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.Usecase_2025);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.Action_13006);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.View_13007);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.Area_13001);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.View_13002);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.Class_13003);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.Interface_13004);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.Package_13005);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.Include_13010);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(WaveElementTypes.DependencyRelationship_3001);
		types.add(WaveElementTypes.InheritanceRelationship_3002);
		types.add(WaveElementTypes.DependencyRelationship_4016);
		types.add(WaveElementTypes.DependencyRelationship_4017);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForSource(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.Class_2017);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.Interface_2018);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.Controller_2026);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.Include_2020);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.Package_2021);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.StyleSheet_2022);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.UsecaseSubsystem_2023);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.Actor_2024);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.Usecase_2025);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.Action_13006);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.View_13007);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.Area_13001);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.View_13002);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.Class_13003);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.Interface_13004);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.Package_13005);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.Include_13010);
		}
		if (relationshipType == WaveElementTypes.InheritanceRelationship_3002) {
			types.add(WaveElementTypes.Class_2017);
		}
		if (relationshipType == WaveElementTypes.InheritanceRelationship_3002) {
			types.add(WaveElementTypes.Interface_2018);
		}
		if (relationshipType == WaveElementTypes.InheritanceRelationship_3002) {
			types.add(WaveElementTypes.Controller_2026);
		}
		if (relationshipType == WaveElementTypes.InheritanceRelationship_3002) {
			types.add(WaveElementTypes.Include_2020);
		}
		if (relationshipType == WaveElementTypes.InheritanceRelationship_3002) {
			types.add(WaveElementTypes.StyleSheet_2022);
		}
		if (relationshipType == WaveElementTypes.InheritanceRelationship_3002) {
			types.add(WaveElementTypes.Actor_2024);
		}
		if (relationshipType == WaveElementTypes.InheritanceRelationship_3002) {
			types.add(WaveElementTypes.Usecase_2025);
		}
		if (relationshipType == WaveElementTypes.InheritanceRelationship_3002) {
			types.add(WaveElementTypes.Class_13003);
		}
		if (relationshipType == WaveElementTypes.InheritanceRelationship_3002) {
			types.add(WaveElementTypes.Interface_13004);
		}
		if (relationshipType == WaveElementTypes.InheritanceRelationship_3002) {
			types.add(WaveElementTypes.Include_13010);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.Class_2017);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.Interface_2018);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.Controller_2026);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.Include_2020);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.Package_2021);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.StyleSheet_2022);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.UsecaseSubsystem_2023);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.Actor_2024);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.Usecase_2025);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.Action_13006);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.View_13007);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.Area_13001);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.View_13002);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.Class_13003);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.Interface_13004);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.Package_13005);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.Include_13010);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.Class_2017);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.Interface_2018);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.Controller_2026);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.Include_2020);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.Package_2021);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.StyleSheet_2022);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.UsecaseSubsystem_2023);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.Actor_2024);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.Usecase_2025);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.Action_13006);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.View_13007);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.Area_13001);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.View_13002);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.Class_13003);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.Interface_13004);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.Package_13005);
		}
		if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.Include_13010);
		}
		return types;
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations()
						.equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class IncludeFigure extends Shape {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureIncludeNameFigure;

		/**
		 * @generated
		 */
		public IncludeFigure() {

			ToolbarLayout layoutThis = new ToolbarLayout();
			layoutThis.setStretchMinorAxis(true);
			layoutThis.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutThis.setSpacing(5);
			layoutThis.setVertical(true);

			this.setLayoutManager(layoutThis);

			this.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode()
					.DPtoLP(0)));
			this.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode()
					.DPtoLP(200)));
			this.addPoint(new Point(getMapMode().DPtoLP(200), getMapMode()
					.DPtoLP(200)));
			this.addPoint(new Point(getMapMode().DPtoLP(200), getMapMode()
					.DPtoLP(10)));
			this.addPoint(new Point(getMapMode().DPtoLP(190), getMapMode()
					.DPtoLP(0)));
			this.addPoint(new Point(getMapMode().DPtoLP(190), getMapMode()
					.DPtoLP(10)));
			this.addPoint(new Point(getMapMode().DPtoLP(200), getMapMode()
					.DPtoLP(10)));
			this.addPoint(new Point(getMapMode().DPtoLP(190), getMapMode()
					.DPtoLP(0)));
			this.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode()
					.DPtoLP(0)));
			this.setFill(true);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureIncludeNameFigure = new WrappingLabel();
			fFigureIncludeNameFigure.setText("");

			this.add(fFigureIncludeNameFigure);

		}

		/**
		 * @generated
		 */
		private final PointList myTemplate = new PointList();
		/**
		 * @generated
		 */
		private Rectangle myTemplateBounds;

		/**
		 * @generated
		 */
		public void addPoint(Point point) {
			myTemplate.addPoint(point);
			myTemplateBounds = null;
		}

		/**
		 * @generated
		 */
		protected void fillShape(Graphics graphics) {
			Rectangle bounds = getBounds();
			graphics.pushState();
			graphics.translate(bounds.x, bounds.y);
			graphics.fillPolygon(scalePointList());
			graphics.popState();
		}

		/**
		 * @generated
		 */
		protected void outlineShape(Graphics graphics) {
			Rectangle bounds = getBounds();
			graphics.pushState();
			graphics.translate(bounds.x, bounds.y);
			graphics.drawPolygon(scalePointList());
			graphics.popState();
		}

		/**
		 * @generated
		 */
		private Rectangle getTemplateBounds() {
			if (myTemplateBounds == null) {
				myTemplateBounds = myTemplate.getBounds().getCopy().union(0, 0);
				//just safety -- we are going to use this as divider 
				if (myTemplateBounds.width < 1) {
					myTemplateBounds.width = 1;
				}
				if (myTemplateBounds.height < 1) {
					myTemplateBounds.height = 1;
				}
			}
			return myTemplateBounds;
		}

		/**
		 * @generated
		 */
		private int[] scalePointList() {
			Rectangle pointsBounds = getTemplateBounds();
			Rectangle actualBounds = getBounds();

			float xScale = ((float) actualBounds.width) / pointsBounds.width;
			float yScale = ((float) actualBounds.height) / pointsBounds.height;

			if (xScale == 1 && yScale == 1) {
				return myTemplate.toIntArray();
			}
			int[] scaled = (int[]) myTemplate.toIntArray().clone();
			for (int i = 0; i < scaled.length; i += 2) {
				scaled[i] = (int) Math.floor(scaled[i] * xScale);
				scaled[i + 1] = (int) Math.floor(scaled[i + 1] * yScale);
			}
			return scaled;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureIncludeNameFigure() {
			return fFigureIncludeNameFigure;
		}

	}

}
