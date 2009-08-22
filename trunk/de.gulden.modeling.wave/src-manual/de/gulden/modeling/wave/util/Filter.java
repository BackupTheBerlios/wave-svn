/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.util;

import java.util.ArrayList;

public class Filter<T> extends ArrayList<T> {
	
	public Filter(Class clazz, Iterable c) {
		super();
		for (Object e : c) {
			if (clazz.isAssignableFrom(e.getClass())) {
				this.add((T)e);
			}
		}
	}
	
}
