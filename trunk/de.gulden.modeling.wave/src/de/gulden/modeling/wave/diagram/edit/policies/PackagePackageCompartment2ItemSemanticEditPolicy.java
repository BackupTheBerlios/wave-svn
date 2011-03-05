/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import de.gulden.modeling.wave.diagram.edit.commands.Class2CreateCommand;
import de.gulden.modeling.wave.diagram.edit.commands.Include2CreateCommand;
import de.gulden.modeling.wave.diagram.edit.commands.Interface2CreateCommand;
import de.gulden.modeling.wave.diagram.edit.commands.Package2CreateCommand;
import de.gulden.modeling.wave.diagram.providers.WaveElementTypes;

/**
 * @generated
 */
public class PackagePackageCompartment2ItemSemanticEditPolicy extends
		WaveBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PackagePackageCompartment2ItemSemanticEditPolicy() {
		super(WaveElementTypes.Package_13005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WaveElementTypes.Class_13003 == req.getElementType()) {
			return getGEFWrapper(new Class2CreateCommand(req));
		}
		if (WaveElementTypes.Interface_13004 == req.getElementType()) {
			return getGEFWrapper(new Interface2CreateCommand(req));
		}
		if (WaveElementTypes.Package_13005 == req.getElementType()) {
			return getGEFWrapper(new Package2CreateCommand(req));
		}
		if (WaveElementTypes.Include_13010 == req.getElementType()) {
			return getGEFWrapper(new Include2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
