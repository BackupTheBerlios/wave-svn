/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

import de.gulden.modeling.wave.WavePackage;
import de.gulden.modeling.wave.diagram.edit.parts.Operation4EditPart;
import de.gulden.modeling.wave.diagram.part.WaveDiagramUpdater;
import de.gulden.modeling.wave.diagram.part.WaveNodeDescriptor;
import de.gulden.modeling.wave.diagram.part.WaveVisualIDRegistry;

/**
 * @generated
 */
public class ViewViewOperationCompartmentCanonicalEditPolicy extends
		CanonicalEditPolicy {

	/**
	 * @generated
	 */
	Set myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		List result = new LinkedList();
		for (Iterator it = WaveDiagramUpdater
				.getViewViewOperationCompartment_7022SemanticChildren(
						viewObject).iterator(); it.hasNext();) {
			result.add(((WaveNodeDescriptor) it.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = WaveVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case Operation4EditPart.VISUAL_ID:
			if (!semanticChildren.contains(view.getElement())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet();
			myFeaturesToSynchronize.add(WavePackage.eINSTANCE
					.getControllerMemberExecutable_Operation());
		}
		return myFeaturesToSynchronize;
	}

}
