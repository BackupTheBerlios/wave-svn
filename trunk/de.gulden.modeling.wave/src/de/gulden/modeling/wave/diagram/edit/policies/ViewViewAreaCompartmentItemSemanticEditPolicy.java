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
import de.gulden.modeling.wave.diagram.edit.commands.AreaCreateCommand;
import de.gulden.modeling.wave.diagram.providers.WaveElementTypes;

/**
 * @generated
 */
public class ViewViewAreaCompartmentItemSemanticEditPolicy extends
		WaveBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ViewViewAreaCompartmentItemSemanticEditPolicy() {
		super(WaveElementTypes.View_13007);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WaveElementTypes.Area_13001 == req.getElementType()) {
			return getGEFWrapper(new AreaCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
