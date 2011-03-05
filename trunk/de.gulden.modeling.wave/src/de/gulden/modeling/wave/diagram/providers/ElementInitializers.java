/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.diagram.providers;

import de.gulden.modeling.wave.DependencyRelationship;
import de.gulden.modeling.wave.WavePackage;
import de.gulden.modeling.wave.diagram.expressions.WaveOCLFactory;
import de.gulden.modeling.wave.diagram.part.WaveDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public void init_DependencyRelationship_4016(DependencyRelationship instance) {
		try {
			Object value_0 = WaveOCLFactory.getExpression(2,
					WavePackage.eINSTANCE.getDependencyRelationship(), null)
					.evaluate(instance);
			instance.setStereotype((String) value_0);
		} catch (RuntimeException e) {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_DependencyRelationship_4017(DependencyRelationship instance) {
		try {
			Object value_0 = WaveOCLFactory.getExpression(6,
					WavePackage.eINSTANCE.getDependencyRelationship(), null)
					.evaluate(instance);
			instance.setStereotype((String) value_0);
		} catch (RuntimeException e) {
			WaveDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = WaveDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			WaveDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
