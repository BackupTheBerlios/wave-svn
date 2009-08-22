/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.diagram.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;

import de.gulden.modeling.wave.Attribute;
import de.gulden.modeling.wave.Class;
import de.gulden.modeling.wave.ClassifierMember;
import de.gulden.modeling.wave.Operation;

public abstract class ClassifierMemberEditPartBase extends CompartmentEditPart implements ITextAwareEditPart {
	
	public ClassifierMemberEditPartBase(EObject object) {
		super(object);
	}
	
	protected abstract EObject getParserElement();
	
	protected void refreshUnderline() {
		EObject e = getParserElement();
		if ((getFigure() instanceof WrapLabel) && (e instanceof ClassifierMember)) {
			((WrapLabel) getFigure()).setTextUnderline(((ClassifierMember)e).isIsStatic());
		}
	}

	protected void refreshFont() {
		EObject e = getParserElement();
		if ((getFigure() instanceof WrapLabel) && (e instanceof Operation)) {
			FontStyle style = (FontStyle) getPrimaryView().getStyle(NotationPackage.eINSTANCE.getFontStyle());
			FontData fontData = new FontData(style.getFontName(), style.getFontHeight(), ((Operation)e).isIsAbstract() ? SWT.ITALIC : SWT.NORMAL);
			setFont(fontData);
			//((WrapLabel) getFigure()).setTextUnderline(((ClassifierMember)e).isIsStatic());
		}
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		if (notification.getNotifier() instanceof ClassifierMember) {
			refreshVisuals();
		}
		super.handleNotificationEvent(notification);
	}

}
