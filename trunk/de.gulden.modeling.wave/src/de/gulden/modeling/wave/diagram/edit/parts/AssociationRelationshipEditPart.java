/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import de.gulden.modeling.wave.diagram.edit.policies.AssociationRelationshipItemSemanticEditPolicy;

/**
 * @generated
 */
public class AssociationRelationshipEditPart extends de.gulden.modeling.wave.diagram.edit.parts.AssociationRelationshipEditPartBase
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3004;

	/**
	 * @generated
	 */
	public AssociationRelationshipEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new AssociationRelationshipItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new AssociationRelationshipFigure();
	}

	/**
	 * @generated
	 */
	public AssociationRelationshipFigure getPrimaryShape() {
		return (AssociationRelationshipFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class AssociationRelationshipFigure extends de.gulden.modeling.wave.diagram.edit.parts.AssociationRelationshipFigureBase {

		/**
		 * @generated
		 */
		public AssociationRelationshipFigure() {

			setSourceDecoration(createSourceDecoration());
			setTargetDecoration(createTargetDecoration()) ;
      	de.gulden.modeling.wave.util.WaveUtil.updateFace(AssociationRelationshipEditPart.this, this);
      
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createSourceDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

	}

}
