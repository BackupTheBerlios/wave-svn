/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.gulden.modeling.wave.Attribute;
import de.gulden.modeling.wave.EnumVisibility;
import de.gulden.modeling.wave.WavePackage;
import de.gulden.modeling.wave.util.WaveUtil;

public abstract class AttributeImplBase extends ClassifierMemberImpl implements Attribute {

	protected static final String DEFAULT_NAME_PREFIX = "attribute";
	
	protected static int defaultNamePostfixCount = 1;
	
	public AttributeImplBase() {
		super();
		this.setVisibility(EnumVisibility.PROTECTED);
		this.eAdapters().add( WaveUtil.signatureListener );
	}

	public String getSignature() {
		if (dirty) {
			String oldSignature = signature;
			signature = WaveUtil.buildSignature(this);
			//if (eNotificationRequired()) {
			//	String newSignature = getSignature();
			//	eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.OPERATION__SIGNATURE, oldSignature, newSignature));
			//}
			dirty = false;
		}
		return signature;
	}

	public void setSignature(String newSignature) {
		String oldSignature = getSignature(); 
		if ((this.signature == null) || ( ! oldSignature.equals(newSignature))) {
			WaveUtil.parseSignature(this, newSignature); // split into name, visibility etc.
			dirty = true; // rebuild on next read access
		}
		if (eNotificationRequired()) {
			newSignature = getSignature();
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.OPERATION__SIGNATURE, oldSignature, newSignature));
		}
	}

	public String getName() {
		if (name == null) {
			name = DEFAULT_NAME_PREFIX + (defaultNamePostfixCount++);
		}
		return name;
	}

}
