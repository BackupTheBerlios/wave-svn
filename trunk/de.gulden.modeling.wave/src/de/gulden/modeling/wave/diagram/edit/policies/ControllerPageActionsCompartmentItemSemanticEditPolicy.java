/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import de.gulden.modeling.wave.diagram.edit.commands.ActionCreateCommand;
import de.gulden.modeling.wave.diagram.providers.WaveElementTypes;

/**
 * @generated
 */
public class ControllerPageActionsCompartmentItemSemanticEditPolicy extends
		WaveBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ControllerPageActionsCompartmentItemSemanticEditPolicy() {
		super(WaveElementTypes.Controller_2026);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WaveElementTypes.Action_13006 == req.getElementType()) {
			return getGEFWrapper(new ActionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
