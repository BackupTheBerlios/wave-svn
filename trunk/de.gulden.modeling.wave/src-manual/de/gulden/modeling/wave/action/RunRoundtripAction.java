/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.action;

public class RunRoundtripAction extends RunCodeGenerationAction {

	public RunRoundtripAction() {
		super();
	}
	
	@Override
	protected void init() {
		super.init();
		this.invoke = "roundtrip";
	}
	
}
