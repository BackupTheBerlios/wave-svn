/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.gulden.modeling.wave.Action;
import de.gulden.modeling.wave.Operation;
import de.gulden.modeling.wave.View;
import de.gulden.modeling.wave.WavePackage;
import de.gulden.modeling.wave.util.WaveUtil;

public abstract class OperationImplBase extends ClassifierMemberImpl implements Operation {

	protected static final String DEFAULT_NAME_PREFIX = "operation";
	
	protected static int defaultNamePostfixCount = 1;
	
	protected static final String PREFIX_ACTION = "action_";
	
	protected static final String PREFIX_VIEW = "view_";
	
	protected transient String signature = SIGNATURE_EDEFAULT;
	
	protected OperationImplBase() {
		super();
		this.eAdapters().add( WaveUtil.signatureListener );
	}
	
	public String getSignature() {
		if (dirty) {
			signature = WaveUtil.buildSignature(this);
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
		Object parent = this.eContainer();
		if (parent instanceof Action) {
			return PREFIX_ACTION + ((Action)parent).getName();
		} else if (parent instanceof View) {
			return PREFIX_VIEW + ((View)parent).getName();
		} else {
			if (name == null) {
				//setName(DEFAULT_NAME_PREFIX + (defaultNamePostfixCount++));
				name = (DEFAULT_NAME_PREFIX + (defaultNamePostfixCount++));
			}
			return name;
		}
	}
	
}
