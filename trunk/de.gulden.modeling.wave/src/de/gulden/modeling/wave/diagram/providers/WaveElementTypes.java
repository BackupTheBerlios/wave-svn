/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import de.gulden.modeling.wave.WavePackage;
import de.gulden.modeling.wave.diagram.part.WaveDiagramEditorPlugin;

/**
 * @generated
 */
public class WaveElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private WaveElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Model_1000 = getElementType("de.gulden.modeling.wave.Model_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Class_2017 = getElementType("de.gulden.modeling.wave.Class_2017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Interface_2018 = getElementType("de.gulden.modeling.wave.Interface_2018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Controller_2026 = getElementType("de.gulden.modeling.wave.Controller_2026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Include_2020 = getElementType("de.gulden.modeling.wave.Include_2020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Package_2021 = getElementType("de.gulden.modeling.wave.Package_2021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Documentation_2013 = getElementType("de.gulden.modeling.wave.Documentation_2013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StyleSheet_2022 = getElementType("de.gulden.modeling.wave.StyleSheet_2022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UsecaseSubsystem_2023 = getElementType("de.gulden.modeling.wave.UsecaseSubsystem_2023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Actor_2024 = getElementType("de.gulden.modeling.wave.Actor_2024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Usecase_2025 = getElementType("de.gulden.modeling.wave.Usecase_2025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Attribute_2001 = getElementType("de.gulden.modeling.wave.Attribute_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Operation_2002 = getElementType("de.gulden.modeling.wave.Operation_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Operation_2003 = getElementType("de.gulden.modeling.wave.Operation_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Attribute_2004 = getElementType("de.gulden.modeling.wave.Attribute_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Action_13006 = getElementType("de.gulden.modeling.wave.Action_13006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Operation_13008 = getElementType("de.gulden.modeling.wave.Operation_13008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType View_13007 = getElementType("de.gulden.modeling.wave.View_13007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Operation_13009 = getElementType("de.gulden.modeling.wave.Operation_13009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Area_13001 = getElementType("de.gulden.modeling.wave.Area_13001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType View_13002 = getElementType("de.gulden.modeling.wave.View_13002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Operation_2009 = getElementType("de.gulden.modeling.wave.Operation_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Class_13003 = getElementType("de.gulden.modeling.wave.Class_13003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Interface_13004 = getElementType("de.gulden.modeling.wave.Interface_13004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Package_13005 = getElementType("de.gulden.modeling.wave.Package_13005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Include_13010 = getElementType("de.gulden.modeling.wave.Include_13010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DependencyRelationship_3001 = getElementType("de.gulden.modeling.wave.DependencyRelationship_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InheritanceRelationship_3002 = getElementType("de.gulden.modeling.wave.InheritanceRelationship_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RealizationRelationship_3003 = getElementType("de.gulden.modeling.wave.RealizationRelationship_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AssociationRelationship_3004 = getElementType("de.gulden.modeling.wave.AssociationRelationship_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActionToViewTransition_3005 = getElementType("de.gulden.modeling.wave.ActionToViewTransition_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ModelMemberDocs_4015 = getElementType("de.gulden.modeling.wave.ModelMemberDocs_4015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ViewTransition_4013 = getElementType("de.gulden.modeling.wave.ViewTransition_4013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DependencyRelationship_4016 = getElementType("de.gulden.modeling.wave.DependencyRelationship_4016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DependencyRelationship_4017 = getElementType("de.gulden.modeling.wave.DependencyRelationship_4017"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return WaveDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();

			elements.put(Model_1000, WavePackage.eINSTANCE.getModel());

			elements.put(Class_2017, WavePackage.eINSTANCE.getClass_());

			elements.put(Interface_2018, WavePackage.eINSTANCE.getInterface());

			elements
					.put(Controller_2026, WavePackage.eINSTANCE.getController());

			elements.put(Include_2020, WavePackage.eINSTANCE.getInclude());

			elements.put(Package_2021, WavePackage.eINSTANCE.getPackage());

			elements.put(Documentation_2013, WavePackage.eINSTANCE
					.getDocumentation());

			elements
					.put(StyleSheet_2022, WavePackage.eINSTANCE.getStyleSheet());

			elements.put(UsecaseSubsystem_2023, WavePackage.eINSTANCE
					.getUsecaseSubsystem());

			elements.put(Actor_2024, WavePackage.eINSTANCE.getActor());

			elements.put(Usecase_2025, WavePackage.eINSTANCE.getUsecase());

			elements.put(Attribute_2001, WavePackage.eINSTANCE.getAttribute());

			elements.put(Operation_2002, WavePackage.eINSTANCE.getOperation());

			elements.put(Operation_2003, WavePackage.eINSTANCE.getOperation());

			elements.put(Attribute_2004, WavePackage.eINSTANCE.getAttribute());

			elements.put(Action_13006, WavePackage.eINSTANCE.getAction());

			elements.put(Operation_13008, WavePackage.eINSTANCE.getOperation());

			elements.put(View_13007, WavePackage.eINSTANCE.getView());

			elements.put(Operation_13009, WavePackage.eINSTANCE.getOperation());

			elements.put(Area_13001, WavePackage.eINSTANCE.getArea());

			elements.put(View_13002, WavePackage.eINSTANCE.getView());

			elements.put(Operation_2009, WavePackage.eINSTANCE.getOperation());

			elements.put(Class_13003, WavePackage.eINSTANCE.getClass_());

			elements.put(Interface_13004, WavePackage.eINSTANCE.getInterface());

			elements.put(Package_13005, WavePackage.eINSTANCE.getPackage());

			elements.put(Include_13010, WavePackage.eINSTANCE.getInclude());

			elements.put(DependencyRelationship_3001, WavePackage.eINSTANCE
					.getDependencyRelationship());

			elements.put(InheritanceRelationship_3002, WavePackage.eINSTANCE
					.getInheritanceRelationship());

			elements.put(RealizationRelationship_3003, WavePackage.eINSTANCE
					.getRealizationRelationship());

			elements.put(AssociationRelationship_3004, WavePackage.eINSTANCE
					.getAssociationRelationship());

			elements.put(ActionToViewTransition_3005, WavePackage.eINSTANCE
					.getActionToViewTransition());

			elements.put(ModelMemberDocs_4015, WavePackage.eINSTANCE
					.getModelMember_Docs());

			elements.put(ViewTransition_4013, WavePackage.eINSTANCE
					.getViewTransition());

			elements.put(DependencyRelationship_4016, WavePackage.eINSTANCE
					.getDependencyRelationship());

			elements.put(DependencyRelationship_4017, WavePackage.eINSTANCE
					.getDependencyRelationship());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(Model_1000);
			KNOWN_ELEMENT_TYPES.add(Class_2017);
			KNOWN_ELEMENT_TYPES.add(Interface_2018);
			KNOWN_ELEMENT_TYPES.add(Controller_2026);
			KNOWN_ELEMENT_TYPES.add(Include_2020);
			KNOWN_ELEMENT_TYPES.add(Package_2021);
			KNOWN_ELEMENT_TYPES.add(Documentation_2013);
			KNOWN_ELEMENT_TYPES.add(StyleSheet_2022);
			KNOWN_ELEMENT_TYPES.add(UsecaseSubsystem_2023);
			KNOWN_ELEMENT_TYPES.add(Actor_2024);
			KNOWN_ELEMENT_TYPES.add(Usecase_2025);
			KNOWN_ELEMENT_TYPES.add(Attribute_2001);
			KNOWN_ELEMENT_TYPES.add(Operation_2002);
			KNOWN_ELEMENT_TYPES.add(Operation_2003);
			KNOWN_ELEMENT_TYPES.add(Attribute_2004);
			KNOWN_ELEMENT_TYPES.add(Action_13006);
			KNOWN_ELEMENT_TYPES.add(Operation_13008);
			KNOWN_ELEMENT_TYPES.add(View_13007);
			KNOWN_ELEMENT_TYPES.add(Operation_13009);
			KNOWN_ELEMENT_TYPES.add(Area_13001);
			KNOWN_ELEMENT_TYPES.add(View_13002);
			KNOWN_ELEMENT_TYPES.add(Operation_2009);
			KNOWN_ELEMENT_TYPES.add(Class_13003);
			KNOWN_ELEMENT_TYPES.add(Interface_13004);
			KNOWN_ELEMENT_TYPES.add(Package_13005);
			KNOWN_ELEMENT_TYPES.add(Include_13010);
			KNOWN_ELEMENT_TYPES.add(DependencyRelationship_3001);
			KNOWN_ELEMENT_TYPES.add(InheritanceRelationship_3002);
			KNOWN_ELEMENT_TYPES.add(RealizationRelationship_3003);
			KNOWN_ELEMENT_TYPES.add(AssociationRelationship_3004);
			KNOWN_ELEMENT_TYPES.add(ActionToViewTransition_3005);
			KNOWN_ELEMENT_TYPES.add(ModelMemberDocs_4015);
			KNOWN_ELEMENT_TYPES.add(ViewTransition_4013);
			KNOWN_ELEMENT_TYPES.add(DependencyRelationship_4016);
			KNOWN_ELEMENT_TYPES.add(DependencyRelationship_4017);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

}
