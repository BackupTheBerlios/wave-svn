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

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import de.gulden.modeling.wave.diagram.edit.policies.Package2ItemSemanticEditPolicy;
import de.gulden.modeling.wave.diagram.part.WaveVisualIDRegistry;
import de.gulden.modeling.wave.diagram.providers.WaveElementTypes;

/**
 * @generated
 */
public class Package2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 13005;

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
	public Package2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new Package2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child,
					EditPart after) {
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
		return primaryShape = new PackageFigure();
	}

	/**
	 * @generated
	 */
	public PackageFigure getPrimaryShape() {
		return (PackageFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PackageName2EditPart) {
			((PackageName2EditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigurePackageNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PackageName2EditPart) {
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
				.getType(PackageName2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(WaveElementTypes.DependencyRelationship_3001);
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
		if (targetEditPart instanceof de.gulden.modeling.wave.diagram.edit.parts.Package2EditPart) {
			types.add(WaveElementTypes.DependencyRelationship_3001);
		}
		if (targetEditPart instanceof Include2EditPart) {
			types.add(WaveElementTypes.DependencyRelationship_3001);
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
		if (targetEditPart instanceof de.gulden.modeling.wave.diagram.edit.parts.Package2EditPart) {
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
		if (targetEditPart instanceof de.gulden.modeling.wave.diagram.edit.parts.Package2EditPart) {
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
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(WaveElementTypes.DependencyRelationship_3001);
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
	public class PackageFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigurePackageNameFigure;

		/**
		 * @generated
		 */
		public PackageFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(true);

			this.setLayoutManager(layoutThis);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigurePackageNameFigure = new WrappingLabel();
			fFigurePackageNameFigure.setText("<...>");

			this.add(fFigurePackageNameFigure);

		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

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
		public WrappingLabel getFigurePackageNameFigure() {
			return fFigurePackageNameFigure;
		}

	}

}
