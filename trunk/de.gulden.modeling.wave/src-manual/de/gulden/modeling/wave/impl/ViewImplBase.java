/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.impl;

import de.gulden.modeling.wave.View;
import de.gulden.modeling.wave.WaveFactory;

public abstract class ViewImplBase extends ControllerMemberExecutableImpl implements View {

	protected ViewImplBase() {
		super();
		setOperation( WaveFactory.eINSTANCE.createOperation() ); // new OperationImpl()
	}
}
