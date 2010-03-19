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
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
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
import de.gulden.modeling.wave.diagram.edit.parts.ViewTransitionConditionEditPart;
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
			EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
					.getClassifier_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			className_5019Parser = parser;
		}
		return className_5019Parser;
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
			EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
					.getClassifier_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			interfaceName_5020Parser = parser;
		}
		return interfaceName_5020Parser;
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
			EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
					.getClassifier_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			controllerName_5033Parser = parser;
		}
		return controllerName_5033Parser;
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
			EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
					.getClassifier_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			includeName_5022Parser = parser;
		}
		return includeName_5022Parser;
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
			EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
					.getPackage_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			packageName_5023Parser = parser;
		}
		return packageName_5023Parser;
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
			EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
					.getDocumentation_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			documentationText_5013Parser = parser;
		}
		return documentationText_5013Parser;
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
			EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
					.getClassifier_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			styleSheetName_5024Parser = parser;
		}
		return styleSheetName_5024Parser;
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
			EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
					.getUsecaseSubsystem_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			usecaseSubsystemName_5025Parser = parser;
		}
		return usecaseSubsystemName_5025Parser;
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
			EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
					.getClassifier_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			actorName_5026Parser = parser;
		}
		return actorName_5026Parser;
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
			EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
					.getUsecase_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			usecaseText_5027Parser = parser;
		}
		return usecaseText_5027Parser;
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
			EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
					.getClassifierMember_Signature() };
			MessageFormatParser parser = new MessageFormatParser(features);
			attribute_2001Parser = parser;
		}
		return attribute_2001Parser;
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
			EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
					.getClassifierMember_Signature() };
			MessageFormatParser parser = new MessageFormatParser(features);
			operation_2002Parser = parser;
		}
		return operation_2002Parser;
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
			EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
					.getClassifierMember_Signature() };
			MessageFormatParser parser = new MessageFormatParser(features);
			operation_2003Parser = parser;
		}
		return operation_2003Parser;
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
			EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
					.getClassifierMember_Signature() };
			MessageFormatParser parser = new MessageFormatParser(features);
			attribute_2004Parser = parser;
		}
		return attribute_2004Parser;
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
			EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
					.getControllerMember_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			actionName_5031Parser = parser;
		}
		return actionName_5031Parser;
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
			EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
					.getClassifierMember_Signature() };
			MessageFormatParser parser = new MessageFormatParser(features);
			operation_13008Parser = parser;
		}
		return operation_13008Parser;
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
			EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
					.getControllerMember_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			viewName_5032Parser = parser;
		}
		return viewName_5032Parser;
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
			EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
					.getClassifierMember_Signature() };
			MessageFormatParser parser = new MessageFormatParser(features);
			operation_13009Parser = parser;
		}
		return operation_13009Parser;
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
			EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
					.getControllerMember_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			viewName_5018Parser = parser;
		}
		return viewName_5018Parser;
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
			EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
					.getClassifierMember_Signature() };
			MessageFormatParser parser = new MessageFormatParser(features);
			operation_2009Parser = parser;
		}
		return operation_2009Parser;
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
			EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
					.getClassifier_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			className_5028Parser = parser;
		}
		return className_5028Parser;
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
			EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
					.getClassifier_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			interfaceName_5029Parser = parser;
		}
		return interfaceName_5029Parser;
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
			EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
					.getPackage_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			packageName_5030Parser = parser;
		}
		return packageName_5030Parser;
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
			EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
					.getClassifier_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			includeName_5034Parser = parser;
		}
		return includeName_5034Parser;
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
			EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
					.getModelMember_Stereotype() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dependencyRelationshipStereotype_6003Parser = parser;
		}
		return dependencyRelationshipStereotype_6003Parser;
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
			EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
					.getAssociationRelationship_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationRelationshipName_4008Parser = parser;
		}
		return associationRelationshipName_4008Parser;
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
			EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
					.getAssociationRelationship_MultiplicityA() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationRelationshipMultiplicityA_4009Parser = parser;
		}
		return associationRelationshipMultiplicityA_4009Parser;
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
			EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
					.getAssociationRelationship_MultiplicityB() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationRelationshipMultiplicityB_4010Parser = parser;
		}
		return associationRelationshipMultiplicityB_4010Parser;
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
			EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
					.getTransition_Condition() };
			MessageFormatParser parser = new MessageFormatParser(features);
			actionToViewTransitionCondition_4011Parser = parser;
		}
		return actionToViewTransitionCondition_4011Parser;
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
			EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
					.getTransition_Condition() };
			MessageFormatParser parser = new MessageFormatParser(features);
			viewTransitionCondition_6002Parser = parser;
		}
		return viewTransitionCondition_6002Parser;
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
			EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
					.getModelMember_Stereotype() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dependencyRelationshipStereotype_6004Parser = parser;
		}
		return dependencyRelationshipStereotype_6004Parser;
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
			EAttribute[] features = new EAttribute[] { WavePackage.eINSTANCE
					.getModelMember_Stereotype() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dependencyRelationshipStereotype_6005Parser = parser;
		}
		return dependencyRelationshipStereotype_6005Parser;
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
		case ViewTransitionConditionEditPart.VISUAL_ID:
			return getViewTransitionCondition_6002Parser();
		case DependencyRelationshipStereotype2EditPart.VISUAL_ID:
			return getDependencyRelationshipStereotype_6004Parser();
		case DependencyRelationshipStereotype3EditPart.VISUAL_ID:
			return getDependencyRelationshipStereotype_6005Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
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
	private static class HintAdapter extends ParserHintAdapter {

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
