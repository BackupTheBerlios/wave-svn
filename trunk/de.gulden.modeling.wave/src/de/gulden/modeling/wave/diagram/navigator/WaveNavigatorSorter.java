/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import de.gulden.modeling.wave.diagram.part.WaveVisualIDRegistry;

/**
 * @generated
 */
public class WaveNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 13012;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof WaveNavigatorItem) {
			WaveNavigatorItem item = (WaveNavigatorItem) element;
			return WaveVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
