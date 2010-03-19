/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import de.gulden.modeling.wave.WavePackage;
import de.gulden.modeling.wave.diagram.edit.commands.OperationCreateCommand;
import de.gulden.modeling.wave.diagram.providers.WaveElementTypes;

/**
 * @generated
 */
public class ClassClassOperationsCompartment2ItemSemanticEditPolicy extends
		WaveBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ClassClassOperationsCompartment2ItemSemanticEditPolicy() {
		super(WaveElementTypes.Class_13003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WaveElementTypes.Operation_2002 == req.getElementType()) {
			return getGEFWrapper(new OperationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
