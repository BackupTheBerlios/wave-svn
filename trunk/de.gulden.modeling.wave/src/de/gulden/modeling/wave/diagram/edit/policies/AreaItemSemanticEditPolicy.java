/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import de.gulden.modeling.wave.diagram.edit.commands.DependencyRelationship2CreateCommand;
import de.gulden.modeling.wave.diagram.edit.commands.DependencyRelationship2ReorientCommand;
import de.gulden.modeling.wave.diagram.edit.commands.DependencyRelationship3CreateCommand;
import de.gulden.modeling.wave.diagram.edit.commands.DependencyRelationship3ReorientCommand;
import de.gulden.modeling.wave.diagram.edit.commands.DependencyRelationshipCreateCommand;
import de.gulden.modeling.wave.diagram.edit.commands.DependencyRelationshipReorientCommand;
import de.gulden.modeling.wave.diagram.edit.commands.ModelMemberDocsCreateCommand;
import de.gulden.modeling.wave.diagram.edit.commands.ModelMemberDocsReorientCommand;
import de.gulden.modeling.wave.diagram.edit.commands.View2CreateCommand;
import de.gulden.modeling.wave.diagram.edit.parts.ActionToViewTransitionEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.DependencyRelationship2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.DependencyRelationship3EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.DependencyRelationshipEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ModelMemberDocsEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.View2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ViewTransitionEditPart;
import de.gulden.modeling.wave.diagram.part.WaveVisualIDRegistry;
import de.gulden.modeling.wave.diagram.providers.WaveElementTypes;

/**
 * @generated
 */
public class AreaItemSemanticEditPolicy extends WaveBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AreaItemSemanticEditPolicy() {
		super(WaveElementTypes.Area_13001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WaveElementTypes.View_13002 == req.getElementType()) {
			return getGEFWrapper(new View2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (WaveVisualIDRegistry.getVisualID(incomingLink) == DependencyRelationshipEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (WaveVisualIDRegistry.getVisualID(incomingLink) == DependencyRelationship2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (WaveVisualIDRegistry.getVisualID(incomingLink) == DependencyRelationship3EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (WaveVisualIDRegistry.getVisualID(outgoingLink) == DependencyRelationshipEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (WaveVisualIDRegistry.getVisualID(outgoingLink) == ModelMemberDocsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (WaveVisualIDRegistry.getVisualID(outgoingLink) == DependencyRelationship2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (WaveVisualIDRegistry.getVisualID(outgoingLink) == DependencyRelationship3EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (WaveVisualIDRegistry.getVisualID(node)) {
			case View2EditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it
						.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (WaveVisualIDRegistry.getVisualID(incomingLink) == DependencyRelationshipEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (WaveVisualIDRegistry.getVisualID(incomingLink) == ActionToViewTransitionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (WaveVisualIDRegistry.getVisualID(incomingLink) == ViewTransitionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (WaveVisualIDRegistry.getVisualID(incomingLink) == DependencyRelationship2EditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (WaveVisualIDRegistry.getVisualID(incomingLink) == DependencyRelationship3EditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
				}
				for (Iterator<?> it = node.getSourceEdges().iterator(); it
						.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (WaveVisualIDRegistry.getVisualID(outgoingLink) == DependencyRelationshipEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (WaveVisualIDRegistry.getVisualID(outgoingLink) == ModelMemberDocsEditPart.VISUAL_ID) {
						DestroyReferenceRequest r = new DestroyReferenceRequest(
								outgoingLink.getSource().getElement(), null,
								outgoingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (WaveVisualIDRegistry.getVisualID(outgoingLink) == ViewTransitionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (WaveVisualIDRegistry.getVisualID(outgoingLink) == DependencyRelationship2EditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (WaveVisualIDRegistry.getVisualID(outgoingLink) == DependencyRelationship3EditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(
								outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			}
		}
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
			return getGEFWrapper(new ModelMemberDocsCreateCommand(req,
					req.getSource(), req.getTarget()));
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
