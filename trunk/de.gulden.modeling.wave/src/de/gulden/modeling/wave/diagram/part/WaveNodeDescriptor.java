/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.diagram.part;

import org.eclipse.emf.ecore.EObject;

/**
 * @generated
 */
public class WaveNodeDescriptor {

	/**
	 * @generated
	 */
	private final EObject myModelElement;

	/**
	 * @generated
	 */
	private final int myVisualID;

	/**
	 * @generated
	 */
	public WaveNodeDescriptor(EObject modelElement, int visualID) {
		myModelElement = modelElement;
		myVisualID = visualID;
	}

	/**
	 * @generated
	 */
	public EObject getModelElement() {
		return myModelElement;
	}

	/**
	 * @generated
	 */
	public int getVisualID() {
		return myVisualID;
	}

}
