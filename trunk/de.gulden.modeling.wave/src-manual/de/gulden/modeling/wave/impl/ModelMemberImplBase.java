/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.impl;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import de.gulden.modeling.wave.ModelMember;

public abstract class ModelMemberImplBase extends EObjectImpl implements ModelMember {

	protected transient boolean dirty = true;

	public void markDirty() {
		dirty = true;
	}

}
