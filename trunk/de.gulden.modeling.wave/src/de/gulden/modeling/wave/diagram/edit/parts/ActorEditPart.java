/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import de.gulden.modeling.wave.diagram.edit.policies.ActorItemSemanticEditPolicy;
import de.gulden.modeling.wave.diagram.part.WaveVisualIDRegistry;
import de.gulden.modeling.wave.diagram.providers.WaveElementTypes;

/**
 * @generated
 */
public class ActorEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2024;

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
	public ActorEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ActorItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new ActorFigure();
	}

	/**
	 * @generated
	 */
	public ActorFigure getPrimaryShape() {
		return (ActorFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ActorNameEditPart) {
			((ActorNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureActorNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ActorNameEditPart) {
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
				.getType(ActorNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(WaveElementTypes.DependencyRelationship_3001);
		types.add(WaveElementTypes.InheritanceRelationship_3002);
		types.add(WaveElementTypes.AssociationRelationship_3004);
		types.add(WaveElementTypes.ModelMemberDocs_4015);
		types.add(WaveElementTypes.DependencyRelationship_4016);
		types.add(WaveElementTypes.DependencyRelationship_4017);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ClassEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_3001);
		}
		if (targetEditPart instanceof InterfaceEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_3001);
		}
		if (targetEditPart instanceof ControllerEditPart) {
			types.add(WaveElementTypes.DependencyRelationship_3001);
		}
		if (targetEditPart instanceof IncludeEditPart) {
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
		if (targetEditPart instanceof de.gulden.modeling.wave.diagram.edit.parts.ActorEditPart) {
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
		if (targetEditPart instanceof IncludeEditPart) {
			types.add(WaveElementTypes.InheritanceRelationship_3002);
		}
		if (targetEditPart instanceof StyleSheetEditPart) {
			types.add(WaveElementTypes.InheritanceRelationship_3002);
		}
		if (targetEditPart instanceof de.gulden.modeling.wave.diagram.edit.parts.ActorEditPart) {
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
		if (targetEditPart instanceof ClassEditPart) {
			types.add(WaveElementTypes.AssociationRelationship_3004);
		}
		if (targetEditPart instanceof InterfaceEditPart) {
			types.add(WaveElementTypes.AssociationRelationship_3004);
		}
		if (targetEditPart instanceof de.gulden.modeling.wave.diagram.edit.parts.ActorEditPart) {
			types.add(WaveElementTypes.AssociationRelationship_3004);
		}
		if (targetEditPart instanceof UsecaseEditPart) {
			types.add(WaveElementTypes.AssociationRelationship_3004);
		}
		if (targetEditPart instanceof Class2EditPart) {
			types.add(WaveElementTypes.AssociationRelationship_3004);
		}
		if (targetEditPart instanceof Interface2EditPart) {
			types.add(WaveElementTypes.AssociationRelationship_3004);
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
		if (targetEditPart instanceof IncludeEditPart) {
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
		if (targetEditPart instanceof de.gulden.modeling.wave.diagram.edit.parts.ActorEditPart) {
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
		if (targetEditPart instanceof IncludeEditPart) {
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
		if (targetEditPart instanceof de.gulden.modeling.wave.diagram.edit.parts.ActorEditPart) {
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
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.Class_2017);
			types.add(WaveElementTypes.Interface_2018);
			types.add(WaveElementTypes.Controller_2026);
			types.add(WaveElementTypes.Include_2020);
			types.add(WaveElementTypes.Package_2021);
			types.add(WaveElementTypes.StyleSheet_2022);
			types.add(WaveElementTypes.UsecaseSubsystem_2023);
			types.add(WaveElementTypes.Actor_2024);
			types.add(WaveElementTypes.Usecase_2025);
			types.add(WaveElementTypes.Action_13006);
			types.add(WaveElementTypes.View_13007);
			types.add(WaveElementTypes.Area_13001);
			types.add(WaveElementTypes.View_13002);
			types.add(WaveElementTypes.Class_13003);
			types.add(WaveElementTypes.Interface_13004);
			types.add(WaveElementTypes.Package_13005);
			types.add(WaveElementTypes.Include_13010);
		} else if (relationshipType == WaveElementTypes.InheritanceRelationship_3002) {
			types.add(WaveElementTypes.Class_2017);
			types.add(WaveElementTypes.Interface_2018);
			types.add(WaveElementTypes.Controller_2026);
			types.add(WaveElementTypes.Include_2020);
			types.add(WaveElementTypes.StyleSheet_2022);
			types.add(WaveElementTypes.Actor_2024);
			types.add(WaveElementTypes.Usecase_2025);
			types.add(WaveElementTypes.Class_13003);
			types.add(WaveElementTypes.Interface_13004);
			types.add(WaveElementTypes.Include_13010);
		} else if (relationshipType == WaveElementTypes.AssociationRelationship_3004) {
			types.add(WaveElementTypes.Class_2017);
			types.add(WaveElementTypes.Interface_2018);
			types.add(WaveElementTypes.Actor_2024);
			types.add(WaveElementTypes.Usecase_2025);
			types.add(WaveElementTypes.Class_13003);
			types.add(WaveElementTypes.Interface_13004);
		} else if (relationshipType == WaveElementTypes.ModelMemberDocs_4015) {
			types.add(WaveElementTypes.Documentation_2013);
		} else if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.Class_2017);
			types.add(WaveElementTypes.Interface_2018);
			types.add(WaveElementTypes.Controller_2026);
			types.add(WaveElementTypes.Include_2020);
			types.add(WaveElementTypes.Package_2021);
			types.add(WaveElementTypes.StyleSheet_2022);
			types.add(WaveElementTypes.UsecaseSubsystem_2023);
			types.add(WaveElementTypes.Actor_2024);
			types.add(WaveElementTypes.Usecase_2025);
			types.add(WaveElementTypes.Action_13006);
			types.add(WaveElementTypes.View_13007);
			types.add(WaveElementTypes.Area_13001);
			types.add(WaveElementTypes.View_13002);
			types.add(WaveElementTypes.Class_13003);
			types.add(WaveElementTypes.Interface_13004);
			types.add(WaveElementTypes.Package_13005);
			types.add(WaveElementTypes.Include_13010);
		} else if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.Class_2017);
			types.add(WaveElementTypes.Interface_2018);
			types.add(WaveElementTypes.Controller_2026);
			types.add(WaveElementTypes.Include_2020);
			types.add(WaveElementTypes.Package_2021);
			types.add(WaveElementTypes.StyleSheet_2022);
			types.add(WaveElementTypes.UsecaseSubsystem_2023);
			types.add(WaveElementTypes.Actor_2024);
			types.add(WaveElementTypes.Usecase_2025);
			types.add(WaveElementTypes.Action_13006);
			types.add(WaveElementTypes.View_13007);
			types.add(WaveElementTypes.Area_13001);
			types.add(WaveElementTypes.View_13002);
			types.add(WaveElementTypes.Class_13003);
			types.add(WaveElementTypes.Interface_13004);
			types.add(WaveElementTypes.Package_13005);
			types.add(WaveElementTypes.Include_13010);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(WaveElementTypes.DependencyRelationship_3001);
		types.add(WaveElementTypes.InheritanceRelationship_3002);
		types.add(WaveElementTypes.AssociationRelationship_3004);
		types.add(WaveElementTypes.DependencyRelationship_4016);
		types.add(WaveElementTypes.DependencyRelationship_4017);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == WaveElementTypes.DependencyRelationship_3001) {
			types.add(WaveElementTypes.Class_2017);
			types.add(WaveElementTypes.Interface_2018);
			types.add(WaveElementTypes.Controller_2026);
			types.add(WaveElementTypes.Include_2020);
			types.add(WaveElementTypes.Package_2021);
			types.add(WaveElementTypes.StyleSheet_2022);
			types.add(WaveElementTypes.UsecaseSubsystem_2023);
			types.add(WaveElementTypes.Actor_2024);
			types.add(WaveElementTypes.Usecase_2025);
			types.add(WaveElementTypes.Action_13006);
			types.add(WaveElementTypes.View_13007);
			types.add(WaveElementTypes.Area_13001);
			types.add(WaveElementTypes.View_13002);
			types.add(WaveElementTypes.Class_13003);
			types.add(WaveElementTypes.Interface_13004);
			types.add(WaveElementTypes.Package_13005);
			types.add(WaveElementTypes.Include_13010);
		} else if (relationshipType == WaveElementTypes.InheritanceRelationship_3002) {
			types.add(WaveElementTypes.Class_2017);
			types.add(WaveElementTypes.Interface_2018);
			types.add(WaveElementTypes.Controller_2026);
			types.add(WaveElementTypes.Include_2020);
			types.add(WaveElementTypes.StyleSheet_2022);
			types.add(WaveElementTypes.Actor_2024);
			types.add(WaveElementTypes.Usecase_2025);
			types.add(WaveElementTypes.Class_13003);
			types.add(WaveElementTypes.Interface_13004);
			types.add(WaveElementTypes.Include_13010);
		} else if (relationshipType == WaveElementTypes.AssociationRelationship_3004) {
			types.add(WaveElementTypes.Class_2017);
			types.add(WaveElementTypes.Interface_2018);
			types.add(WaveElementTypes.Actor_2024);
			types.add(WaveElementTypes.Usecase_2025);
			types.add(WaveElementTypes.Class_13003);
			types.add(WaveElementTypes.Interface_13004);
		} else if (relationshipType == WaveElementTypes.DependencyRelationship_4016) {
			types.add(WaveElementTypes.Class_2017);
			types.add(WaveElementTypes.Interface_2018);
			types.add(WaveElementTypes.Controller_2026);
			types.add(WaveElementTypes.Include_2020);
			types.add(WaveElementTypes.Package_2021);
			types.add(WaveElementTypes.StyleSheet_2022);
			types.add(WaveElementTypes.UsecaseSubsystem_2023);
			types.add(WaveElementTypes.Actor_2024);
			types.add(WaveElementTypes.Usecase_2025);
			types.add(WaveElementTypes.Action_13006);
			types.add(WaveElementTypes.View_13007);
			types.add(WaveElementTypes.Area_13001);
			types.add(WaveElementTypes.View_13002);
			types.add(WaveElementTypes.Class_13003);
			types.add(WaveElementTypes.Interface_13004);
			types.add(WaveElementTypes.Package_13005);
			types.add(WaveElementTypes.Include_13010);
		} else if (relationshipType == WaveElementTypes.DependencyRelationship_4017) {
			types.add(WaveElementTypes.Class_2017);
			types.add(WaveElementTypes.Interface_2018);
			types.add(WaveElementTypes.Controller_2026);
			types.add(WaveElementTypes.Include_2020);
			types.add(WaveElementTypes.Package_2021);
			types.add(WaveElementTypes.StyleSheet_2022);
			types.add(WaveElementTypes.UsecaseSubsystem_2023);
			types.add(WaveElementTypes.Actor_2024);
			types.add(WaveElementTypes.Usecase_2025);
			types.add(WaveElementTypes.Action_13006);
			types.add(WaveElementTypes.View_13007);
			types.add(WaveElementTypes.Area_13001);
			types.add(WaveElementTypes.View_13002);
			types.add(WaveElementTypes.Class_13003);
			types.add(WaveElementTypes.Interface_13004);
			types.add(WaveElementTypes.Package_13005);
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
	public class ActorFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureActorNameFigure;

		/**
		 * @generated
		 */
		public ActorFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			this.setOutline(false);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			Ellipse actorHeadFigure0 = new Ellipse();
			actorHeadFigure0.setPreferredSize(new Dimension(getMapMode()
					.DPtoLP(12), getMapMode().DPtoLP(12)));

			GridData constraintActorHeadFigure0 = new GridData();
			constraintActorHeadFigure0.verticalAlignment = GridData.BEGINNING;
			constraintActorHeadFigure0.horizontalAlignment = GridData.BEGINNING;
			constraintActorHeadFigure0.horizontalIndent = 0;
			constraintActorHeadFigure0.horizontalSpan = 1;
			constraintActorHeadFigure0.verticalSpan = 1;
			constraintActorHeadFigure0.grabExcessHorizontalSpace = false;
			constraintActorHeadFigure0.grabExcessVerticalSpace = false;
			this.add(actorHeadFigure0, constraintActorHeadFigure0);

			Polyline actorBodyFigure0 = new Polyline();
			actorBodyFigure0.addPoint(new Point(getMapMode().DPtoLP(10),
					getMapMode().DPtoLP(17)));
			actorBodyFigure0.addPoint(new Point(getMapMode().DPtoLP(10),
					getMapMode().DPtoLP(45)));
			actorBodyFigure0.addPoint(new Point(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(60)));
			actorBodyFigure0.addPoint(new Point(getMapMode().DPtoLP(10),
					getMapMode().DPtoLP(45)));
			actorBodyFigure0.addPoint(new Point(getMapMode().DPtoLP(20),
					getMapMode().DPtoLP(60)));
			actorBodyFigure0.addPoint(new Point(getMapMode().DPtoLP(10),
					getMapMode().DPtoLP(45)));
			actorBodyFigure0.addPoint(new Point(getMapMode().DPtoLP(10),
					getMapMode().DPtoLP(27)));
			actorBodyFigure0.addPoint(new Point(getMapMode().DPtoLP(3),
					getMapMode().DPtoLP(35)));
			actorBodyFigure0.addPoint(new Point(getMapMode().DPtoLP(10),
					getMapMode().DPtoLP(27)));
			actorBodyFigure0.addPoint(new Point(getMapMode().DPtoLP(17),
					getMapMode().DPtoLP(35)));
			actorBodyFigure0.addPoint(new Point(getMapMode().DPtoLP(10),
					getMapMode().DPtoLP(27)));
			actorBodyFigure0.addPoint(new Point(getMapMode().DPtoLP(10),
					getMapMode().DPtoLP(20)));

			GridData constraintActorBodyFigure0 = new GridData();
			constraintActorBodyFigure0.verticalAlignment = GridData.CENTER;
			constraintActorBodyFigure0.horizontalAlignment = GridData.CENTER;
			constraintActorBodyFigure0.horizontalIndent = 0;
			constraintActorBodyFigure0.horizontalSpan = 1;
			constraintActorBodyFigure0.verticalSpan = 1;
			constraintActorBodyFigure0.grabExcessHorizontalSpace = false;
			constraintActorBodyFigure0.grabExcessVerticalSpace = false;
			this.add(actorBodyFigure0, constraintActorBodyFigure0);

			fFigureActorNameFigure = new WrappingLabel();
			fFigureActorNameFigure.setText("<...>");

			GridData constraintFFigureActorNameFigure = new GridData();
			constraintFFigureActorNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureActorNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureActorNameFigure.horizontalIndent = 0;
			constraintFFigureActorNameFigure.horizontalSpan = 1;
			constraintFFigureActorNameFigure.verticalSpan = 1;
			constraintFFigureActorNameFigure.grabExcessHorizontalSpace = false;
			constraintFFigureActorNameFigure.grabExcessVerticalSpace = false;
			this.add(fFigureActorNameFigure, constraintFFigureActorNameFigure);

		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = true;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureActorNameFigure() {
			return fFigureActorNameFigure;
		}

	}

}
