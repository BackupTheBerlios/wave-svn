/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import de.gulden.modeling.wave.diagram.edit.commands.Operation2CreateCommand;
import de.gulden.modeling.wave.diagram.providers.WaveElementTypes;

/**
 * @generated
 */
public class InterfaceInterfaceOperationsCompartment2ItemSemanticEditPolicy
		extends WaveBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InterfaceInterfaceOperationsCompartment2ItemSemanticEditPolicy() {
		super(WaveElementTypes.Interface_13004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WaveElementTypes.Operation_2003 == req.getElementType()) {
			return getGEFWrapper(new Operation2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
