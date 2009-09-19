/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import de.gulden.modeling.wave.diagram.edit.commands.DependencyRelationship2CreateCommand;
import de.gulden.modeling.wave.diagram.edit.commands.DependencyRelationship2ReorientCommand;
import de.gulden.modeling.wave.diagram.edit.commands.DependencyRelationship3CreateCommand;
import de.gulden.modeling.wave.diagram.edit.commands.DependencyRelationship3ReorientCommand;
import de.gulden.modeling.wave.diagram.edit.commands.DependencyRelationshipCreateCommand;
import de.gulden.modeling.wave.diagram.edit.commands.DependencyRelationshipReorientCommand;
import de.gulden.modeling.wave.diagram.edit.commands.ModelMemberDocsCreateCommand;
import de.gulden.modeling.wave.diagram.edit.commands.ModelMemberDocsReorientCommand;
import de.gulden.modeling.wave.diagram.edit.parts.DependencyRelationship2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.DependencyRelationship3EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.DependencyRelationshipEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ModelMemberDocsEditPart;
import de.gulden.modeling.wave.diagram.providers.WaveElementTypes;

/**
 * @generated
 */
public class Attribute2ItemSemanticEditPolicy extends
		WaveBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = getDestroyEdgesCommand();
		addDestroyShortcutsCommand(cc);
		cc.add(getGEFWrapper(new DestroyElementCommand(req)));
		return cc.unwrap();
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (WaveElementTypes.DependencyRelationship_3001 == req
				.getElementType()) {
			return getGEFWrapper(new DependencyRelationshipCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (WaveElementTypes.ModelMemberDocs_4015 == req.getElementType()) {
			return getGEFWrapper(new ModelMemberDocsCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (WaveElementTypes.DependencyRelationship_4016 == req
				.getElementType()) {
			return getGEFWrapper(new DependencyRelationship2CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (WaveElementTypes.DependencyRelationship_4017 == req
				.getElementType()) {
			return getGEFWrapper(new DependencyRelationship3CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (WaveElementTypes.DependencyRelationship_3001 == req
				.getElementType()) {
			return getGEFWrapper(new DependencyRelationshipCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (WaveElementTypes.ModelMemberDocs_4015 == req.getElementType()) {
			return null;
		}
		if (WaveElementTypes.DependencyRelationship_4016 == req
				.getElementType()) {
			return getGEFWrapper(new DependencyRelationship2CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (WaveElementTypes.DependencyRelationship_4017 == req
				.getElementType()) {
			return getGEFWrapper(new DependencyRelationship3CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case DependencyRelationshipEditPart.VISUAL_ID:
			return getGEFWrapper(new DependencyRelationshipReorientCommand(req));
		case DependencyRelationship2EditPart.VISUAL_ID:
			return getGEFWrapper(new DependencyRelationship2ReorientCommand(req));
		case DependencyRelationship3EditPart.VISUAL_ID:
			return getGEFWrapper(new DependencyRelationship3ReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ModelMemberDocsEditPart.VISUAL_ID:
			return getGEFWrapper(new ModelMemberDocsReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
