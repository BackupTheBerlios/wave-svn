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
public class ViewViewAreaCompartment2ItemSemanticEditPolicy extends
		WaveBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WaveElementTypes.Area_13001 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req
						.setContainmentFeature(WavePackage.eINSTANCE
								.getView_Areas());
			}
			return getGEFWrapper(new AreaCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}