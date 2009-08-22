/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import de.gulden.modeling.wave.WavePackage;
import de.gulden.modeling.wave.diagram.edit.parts.ActionNameEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ActionToViewTransitionConditionEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ActorNameEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.AssociationRelationshipMultiplicityAEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.AssociationRelationshipMultiplicityBEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.AssociationRelationshipNameEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.Attribute2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.AttributeEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ClassName2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ClassNameEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ControllerNameEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.DependencyRelationshipStereotype2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.DependencyRelationshipStereotype3EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.DependencyRelationshipStereotypeEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.DocumentationTextEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.IncludeName2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.IncludeNameEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.InterfaceName2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.InterfaceNameEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.Operation2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.Operation3EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.Operation4EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.Operation5EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.OperationEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.PackageName2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.PackageNameEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.StyleSheetNameEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.UsecaseSubsystemNameEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.UsecaseTextEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ViewName2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ViewNameEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ViewTransitionNameEditPart;
import de.gulden.modeling.wave.diagram.parsers.MessageFormatParser;
import de.gulden.modeling.wave.diagram.part.WaveVisualIDRegistry;

/**
 * @generated
 */
public class WaveParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser className_5019Parser;

	/**
	 * @generated
	 */
	private IParser getClassName_5019Parser() {
		if (className_5019Parser == null) {
			className_5019Parser = createClassName_5019Parser();
		}
		return className_5019Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createClassName_5019Parser() {
		EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
				.getClassifier_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser interfaceName_5020Parser;

	/**
	 * @generated
	 */
	private IParser getInterfaceName_5020Parser() {
		if (interfaceName_5020Parser == null) {
			interfaceName_5020Parser = createInterfaceName_5020Parser();
		}
		return interfaceName_5020Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createInterfaceName_5020Parser() {
		EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
				.getClassifier_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser controllerName_5033Parser;

	/**
	 * @generated
	 */
	private IParser getControllerName_5033Parser() {
		if (controllerName_5033Parser == null) {
			controllerName_5033Parser = createControllerName_5033Parser();
		}
		return controllerName_5033Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createControllerName_5033Parser() {
		EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
				.getClassifier_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser includeName_5022Parser;

	/**
	 * @generated
	 */
	private IParser getIncludeName_5022Parser() {
		if (includeName_5022Parser == null) {
			includeName_5022Parser = createIncludeName_5022Parser();
		}
		return includeName_5022Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createIncludeName_5022Parser() {
		EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
				.getClassifier_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser packageName_5023Parser;

	/**
	 * @generated
	 */
	private IParser getPackageName_5023Parser() {
		if (packageName_5023Parser == null) {
			packageName_5023Parser = createPackageName_5023Parser();
		}
		return packageName_5023Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPackageName_5023Parser() {
		EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
				.getPackage_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser documentationText_5013Parser;

	/**
	 * @generated
	 */
	private IParser getDocumentationText_5013Parser() {
		if (documentationText_5013Parser == null) {
			documentationText_5013Parser = createDocumentationText_5013Parser();
		}
		return documentationText_5013Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDocumentationText_5013Parser() {
		EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
				.getDocumentation_Text(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser styleSheetName_5024Parser;

	/**
	 * @generated
	 */
	private IParser getStyleSheetName_5024Parser() {
		if (styleSheetName_5024Parser == null) {
			styleSheetName_5024Parser = createStyleSheetName_5024Parser();
		}
		return styleSheetName_5024Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createStyleSheetName_5024Parser() {
		EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
				.getClassifier_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser usecaseSubsystemName_5025Parser;

	/**
	 * @generated
	 */
	private IParser getUsecaseSubsystemName_5025Parser() {
		if (usecaseSubsystemName_5025Parser == null) {
			usecaseSubsystemName_5025Parser = createUsecaseSubsystemName_5025Parser();
		}
		return usecaseSubsystemName_5025Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createUsecaseSubsystemName_5025Parser() {
		EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
				.getUsecaseSubsystem_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser actorName_5026Parser;

	/**
	 * @generated
	 */
	private IParser getActorName_5026Parser() {
		if (actorName_5026Parser == null) {
			actorName_5026Parser = createActorName_5026Parser();
		}
		return actorName_5026Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createActorName_5026Parser() {
		EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
				.getClassifier_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser usecaseText_5027Parser;

	/**
	 * @generated
	 */
	private IParser getUsecaseText_5027Parser() {
		if (usecaseText_5027Parser == null) {
			usecaseText_5027Parser = createUsecaseText_5027Parser();
		}
		return usecaseText_5027Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createUsecaseText_5027Parser() {
		EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
				.getUsecase_Text(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser attribute_2001Parser;

	/**
	 * @generated
	 */
	private IParser getAttribute_2001Parser() {
		if (attribute_2001Parser == null) {
			attribute_2001Parser = createAttribute_2001Parser();
		}
		return attribute_2001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAttribute_2001Parser() {
		EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
				.getClassifierMember_Signature(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser operation_2002Parser;

	/**
	 * @generated
	 */
	private IParser getOperation_2002Parser() {
		if (operation_2002Parser == null) {
			operation_2002Parser = createOperation_2002Parser();
		}
		return operation_2002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOperation_2002Parser() {
		EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
				.getClassifierMember_Signature(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser operation_2003Parser;

	/**
	 * @generated
	 */
	private IParser getOperation_2003Parser() {
		if (operation_2003Parser == null) {
			operation_2003Parser = createOperation_2003Parser();
		}
		return operation_2003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOperation_2003Parser() {
		EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
				.getClassifierMember_Signature(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser attribute_2004Parser;

	/**
	 * @generated
	 */
	private IParser getAttribute_2004Parser() {
		if (attribute_2004Parser == null) {
			attribute_2004Parser = createAttribute_2004Parser();
		}
		return attribute_2004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAttribute_2004Parser() {
		EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
				.getClassifierMember_Signature(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser actionName_5031Parser;

	/**
	 * @generated
	 */
	private IParser getActionName_5031Parser() {
		if (actionName_5031Parser == null) {
			actionName_5031Parser = createActionName_5031Parser();
		}
		return actionName_5031Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createActionName_5031Parser() {
		EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
				.getControllerMember_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser operation_13008Parser;

	/**
	 * @generated
	 */
	private IParser getOperation_13008Parser() {
		if (operation_13008Parser == null) {
			operation_13008Parser = createOperation_13008Parser();
		}
		return operation_13008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOperation_13008Parser() {
		EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
				.getClassifierMember_Signature(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser viewName_5032Parser;

	/**
	 * @generated
	 */
	private IParser getViewName_5032Parser() {
		if (viewName_5032Parser == null) {
			viewName_5032Parser = createViewName_5032Parser();
		}
		return viewName_5032Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createViewName_5032Parser() {
		EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
				.getControllerMember_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser operation_13009Parser;

	/**
	 * @generated
	 */
	private IParser getOperation_13009Parser() {
		if (operation_13009Parser == null) {
			operation_13009Parser = createOperation_13009Parser();
		}
		return operation_13009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOperation_13009Parser() {
		EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
				.getClassifierMember_Signature(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser viewName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getViewName_5018Parser() {
		if (viewName_5018Parser == null) {
			viewName_5018Parser = createViewName_5018Parser();
		}
		return viewName_5018Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createViewName_5018Parser() {
		EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
				.getControllerMember_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser operation_2009Parser;

	/**
	 * @generated
	 */
	private IParser getOperation_2009Parser() {
		if (operation_2009Parser == null) {
			operation_2009Parser = createOperation_2009Parser();
		}
		return operation_2009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOperation_2009Parser() {
		EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
				.getClassifierMember_Signature(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser className_5028Parser;

	/**
	 * @generated
	 */
	private IParser getClassName_5028Parser() {
		if (className_5028Parser == null) {
			className_5028Parser = createClassName_5028Parser();
		}
		return className_5028Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createClassName_5028Parser() {
		EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
				.getClassifier_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser interfaceName_5029Parser;

	/**
	 * @generated
	 */
	private IParser getInterfaceName_5029Parser() {
		if (interfaceName_5029Parser == null) {
			interfaceName_5029Parser = createInterfaceName_5029Parser();
		}
		return interfaceName_5029Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createInterfaceName_5029Parser() {
		EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
				.getClassifier_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser packageName_5030Parser;

	/**
	 * @generated
	 */
	private IParser getPackageName_5030Parser() {
		if (packageName_5030Parser == null) {
			packageName_5030Parser = createPackageName_5030Parser();
		}
		return packageName_5030Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPackageName_5030Parser() {
		EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
				.getPackage_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser includeName_5034Parser;

	/**
	 * @generated
	 */
	private IParser getIncludeName_5034Parser() {
		if (includeName_5034Parser == null) {
			includeName_5034Parser = createIncludeName_5034Parser();
		}
		return includeName_5034Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createIncludeName_5034Parser() {
		EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
				.getClassifier_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser dependencyRelationshipStereotype_6003Parser;

	/**
	 * @generated
	 */
	private IParser getDependencyRelationshipStereotype_6003Parser() {
		if (dependencyRelationshipStereotype_6003Parser == null) {
			dependencyRelationshipStereotype_6003Parser = createDependencyRelationshipStereotype_6003Parser();
		}
		return dependencyRelationshipStereotype_6003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDependencyRelationshipStereotype_6003Parser() {
		EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
				.getModelMember_Stereotype(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser associationRelationshipName_4008Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationRelationshipName_4008Parser() {
		if (associationRelationshipName_4008Parser == null) {
			associationRelationshipName_4008Parser = createAssociationRelationshipName_4008Parser();
		}
		return associationRelationshipName_4008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAssociationRelationshipName_4008Parser() {
		EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
				.getAssociationRelationship_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser associationRelationshipMultiplicityA_4009Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationRelationshipMultiplicityA_4009Parser() {
		if (associationRelationshipMultiplicityA_4009Parser == null) {
			associationRelationshipMultiplicityA_4009Parser = createAssociationRelationshipMultiplicityA_4009Parser();
		}
		return associationRelationshipMultiplicityA_4009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAssociationRelationshipMultiplicityA_4009Parser() {
		EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
				.getAssociationRelationship_MultiplicityA(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser associationRelationshipMultiplicityB_4010Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationRelationshipMultiplicityB_4010Parser() {
		if (associationRelationshipMultiplicityB_4010Parser == null) {
			associationRelationshipMultiplicityB_4010Parser = createAssociationRelationshipMultiplicityB_4010Parser();
		}
		return associationRelationshipMultiplicityB_4010Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAssociationRelationshipMultiplicityB_4010Parser() {
		EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
				.getAssociationRelationship_MultiplicityB(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser actionToViewTransitionCondition_4011Parser;

	/**
	 * @generated
	 */
	private IParser getActionToViewTransitionCondition_4011Parser() {
		if (actionToViewTransitionCondition_4011Parser == null) {
			actionToViewTransitionCondition_4011Parser = createActionToViewTransitionCondition_4011Parser();
		}
		return actionToViewTransitionCondition_4011Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createActionToViewTransitionCondition_4011Parser() {
		EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
				.getTransition_Condition(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser viewTransitionCondition_6002Parser;

	/**
	 * @generated
	 */
	private IParser getViewTransitionCondition_6002Parser() {
		if (viewTransitionCondition_6002Parser == null) {
			viewTransitionCondition_6002Parser = createViewTransitionCondition_6002Parser();
		}
		return viewTransitionCondition_6002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createViewTransitionCondition_6002Parser() {
		EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
				.getTransition_Condition(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser dependencyRelationshipStereotype_6004Parser;

	/**
	 * @generated
	 */
	private IParser getDependencyRelationshipStereotype_6004Parser() {
		if (dependencyRelationshipStereotype_6004Parser == null) {
			dependencyRelationshipStereotype_6004Parser = createDependencyRelationshipStereotype_6004Parser();
		}
		return dependencyRelationshipStereotype_6004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDependencyRelationshipStereotype_6004Parser() {
		EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
				.getModelMember_Stereotype(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser dependencyRelationshipStereotype_6005Parser;

	/**
	 * @generated
	 */
	private IParser getDependencyRelationshipStereotype_6005Parser() {
		if (dependencyRelationshipStereotype_6005Parser == null) {
			dependencyRelationshipStereotype_6005Parser = createDependencyRelationshipStereotype_6005Parser();
		}
		return dependencyRelationshipStereotype_6005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDependencyRelationshipStereotype_6005Parser() {
		EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
				.getModelMember_Stereotype(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ClassNameEditPart.VISUAL_ID:
			return getClassName_5019Parser();
		case InterfaceNameEditPart.VISUAL_ID:
			return getInterfaceName_5020Parser();
		case ControllerNameEditPart.VISUAL_ID:
			return getControllerName_5033Parser();
		case IncludeNameEditPart.VISUAL_ID:
			return getIncludeName_5022Parser();
		case PackageNameEditPart.VISUAL_ID:
			return getPackageName_5023Parser();
		case DocumentationTextEditPart.VISUAL_ID:
			return getDocumentationText_5013Parser();
		case StyleSheetNameEditPart.VISUAL_ID:
			return getStyleSheetName_5024Parser();
		case UsecaseSubsystemNameEditPart.VISUAL_ID:
			return getUsecaseSubsystemName_5025Parser();
		case ActorNameEditPart.VISUAL_ID:
			return getActorName_5026Parser();
		case UsecaseTextEditPart.VISUAL_ID:
			return getUsecaseText_5027Parser();
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_2001Parser();
		case OperationEditPart.VISUAL_ID:
			return getOperation_2002Parser();
		case Operation2EditPart.VISUAL_ID:
			return getOperation_2003Parser();
		case Attribute2EditPart.VISUAL_ID:
			return getAttribute_2004Parser();
		case ActionNameEditPart.VISUAL_ID:
			return getActionName_5031Parser();
		case Operation3EditPart.VISUAL_ID:
			return getOperation_13008Parser();
		case ViewNameEditPart.VISUAL_ID:
			return getViewName_5032Parser();
		case Operation4EditPart.VISUAL_ID:
			return getOperation_13009Parser();
		case ViewName2EditPart.VISUAL_ID:
			return getViewName_5018Parser();
		case Operation5EditPart.VISUAL_ID:
			return getOperation_2009Parser();
		case ClassName2EditPart.VISUAL_ID:
			return getClassName_5028Parser();
		case InterfaceName2EditPart.VISUAL_ID:
			return getInterfaceName_5029Parser();
		case PackageName2EditPart.VISUAL_ID:
			return getPackageName_5030Parser();
		case IncludeName2EditPart.VISUAL_ID:
			return getIncludeName_5034Parser();
		case DependencyRelationshipStereotypeEditPart.VISUAL_ID:
			return getDependencyRelationshipStereotype_6003Parser();
		case AssociationRelationshipNameEditPart.VISUAL_ID:
			return getAssociationRelationshipName_4008Parser();
		case AssociationRelationshipMultiplicityAEditPart.VISUAL_ID:
			return getAssociationRelationshipMultiplicityA_4009Parser();
		case AssociationRelationshipMultiplicityBEditPart.VISUAL_ID:
			return getAssociationRelationshipMultiplicityB_4010Parser();
		case ActionToViewTransitionConditionEditPart.VISUAL_ID:
			return getActionToViewTransitionCondition_4011Parser();
		case ViewTransitionNameEditPart.VISUAL_ID:
			return getViewTransitionCondition_6002Parser();
		case DependencyRelationshipStereotype2EditPart.VISUAL_ID:
			return getDependencyRelationshipStereotype_6004Parser();
		case DependencyRelationshipStereotype3EditPart.VISUAL_ID:
			return getDependencyRelationshipStereotype_6005Parser();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(WaveVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(WaveVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (WaveElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
