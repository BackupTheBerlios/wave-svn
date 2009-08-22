/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.diagram.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import de.gulden.modeling.wave.AssociationRelationship;
import de.gulden.modeling.wave.diagram.edit.parts.AssociationRelationshipEditPart;
import de.gulden.modeling.wave.util.WaveUtil;

public abstract class AssociationRelationshipEditPartBase extends ConnectionNodeEditPart{
	
	public AssociationRelationshipEditPartBase(View view) {
		super(view);
	}

	protected void handleNotificationEvent(Notification notification) {
		if (notification.getNotifier() instanceof AssociationRelationship) {
			de.gulden.modeling.wave.util.WaveUtil.updateFace((AssociationRelationshipEditPart)this, ((AssociationRelationshipFigureBase)getPrimaryShape()));
		}
		super.handleNotificationEvent(notification);
	}
	
	protected abstract PolylineConnectionEx getPrimaryShape();
}
