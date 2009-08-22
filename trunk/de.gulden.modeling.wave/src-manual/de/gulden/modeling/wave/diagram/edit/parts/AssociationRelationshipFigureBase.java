/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.diagram.edit.parts;

import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;

public class AssociationRelationshipFigureBase extends PolylineConnectionEx{

	@Override
	public RotatableDecoration getSourceDecoration() {
		return super.getSourceDecoration();
	}

	@Override
	public RotatableDecoration getTargetDecoration() {
		return super.getTargetDecoration();
	}
	
	 

}
