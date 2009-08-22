/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.diagram.part;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import de.gulden.modeling.wave.WavePackage;

/**
 * @generated
 */
public class WaveDomainModelElementTester extends PropertyTester {

	/**
	 * @generated
	 */
	public boolean test(Object receiver, String method, Object[] args,
			Object expectedValue) {
		if (false == receiver instanceof EObject) {
			return false;
		}
		EObject eObject = (EObject) receiver;
		EClass eClass = eObject.eClass();
		if (eClass == WavePackage.eINSTANCE.getClassifier()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getController()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getAssociationRelationship()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getOperation()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getAction()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getView()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getAttribute()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getInheritanceRelationship()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getRealizationRelationship()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getModel()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getModelMember()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getPackage()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getDependencyRelationship()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getClass_()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getInterface()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getTopLevelModelMember()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getActionToViewTransition()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getTaggedValue()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getDocumentation()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getOOPClassifier()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getClassifierMember()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getArtifactClassifier()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getInclude()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getStyleSheet()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getViewTransition()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getControllerMember()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getEnumeration()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getEnumerationLiteral()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getDictionary()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getLabel()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getLangstring()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getDatabaseTable()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getWidget()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getUsecaseSubsystem()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getUsecaseClassifier()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getUsecase()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getActor()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getArea()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getControllerMemberExecutable()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getWidgetElement()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getWidgetOption()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getTransition()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getForm()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getWidgetAttribute()) {
			return true;
		}
		if (eClass == WavePackage.eINSTANCE.getWidgetAssociation()) {
			return true;
		}
		return false;
	}

}
