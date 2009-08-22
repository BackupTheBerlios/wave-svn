/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.diagram.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.gulden.modeling.wave.diagram.edit.parts.Class2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ClassEditPart;
import de.gulden.modeling.wave.util.WaveUtil;

public abstract class Class2EditPartBase extends ShapeNodeEditPart {
	
	public Class2EditPartBase(View view) {
		super(view);
	}

	protected void handleNotificationEvent(Notification notification) {
		if (notification.getNotifier() instanceof de.gulden.modeling.wave.Class) {
			WaveUtil.updateNameLabel((Class2EditPart)this);
		}
		super.handleNotificationEvent(notification);
	}
}
