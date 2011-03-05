/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

import de.gulden.modeling.wave.diagram.part.WaveVisualIDRegistry;

/**
 * @generated
 */
public class WaveEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (WaveVisualIDRegistry.getVisualID(view)) {

			case ModelEditPart.VISUAL_ID:
				return new ModelEditPart(view);

			case ClassEditPart.VISUAL_ID:
				return new ClassEditPart(view);

			case ClassNameEditPart.VISUAL_ID:
				return new ClassNameEditPart(view);

			case InterfaceEditPart.VISUAL_ID:
				return new InterfaceEditPart(view);

			case InterfaceNameEditPart.VISUAL_ID:
				return new InterfaceNameEditPart(view);

			case ControllerEditPart.VISUAL_ID:
				return new ControllerEditPart(view);

			case ControllerNameEditPart.VISUAL_ID:
				return new ControllerNameEditPart(view);

			case IncludeEditPart.VISUAL_ID:
				return new IncludeEditPart(view);

			case IncludeNameEditPart.VISUAL_ID:
				return new IncludeNameEditPart(view);

			case PackageEditPart.VISUAL_ID:
				return new PackageEditPart(view);

			case PackageNameEditPart.VISUAL_ID:
				return new PackageNameEditPart(view);

			case DocumentationEditPart.VISUAL_ID:
				return new DocumentationEditPart(view);

			case DocumentationTextEditPart.VISUAL_ID:
				return new DocumentationTextEditPart(view);

			case StyleSheetEditPart.VISUAL_ID:
				return new StyleSheetEditPart(view);

			case StyleSheetNameEditPart.VISUAL_ID:
				return new StyleSheetNameEditPart(view);

			case UsecaseSubsystemEditPart.VISUAL_ID:
				return new UsecaseSubsystemEditPart(view);

			case UsecaseSubsystemNameEditPart.VISUAL_ID:
				return new UsecaseSubsystemNameEditPart(view);

			case ActorEditPart.VISUAL_ID:
				return new ActorEditPart(view);

			case ActorNameEditPart.VISUAL_ID:
				return new ActorNameEditPart(view);

			case UsecaseEditPart.VISUAL_ID:
				return new UsecaseEditPart(view);

			case UsecaseTextEditPart.VISUAL_ID:
				return new UsecaseTextEditPart(view);

			case AttributeEditPart.VISUAL_ID:
				return new AttributeEditPart(view);

			case OperationEditPart.VISUAL_ID:
				return new OperationEditPart(view);

			case Operation2EditPart.VISUAL_ID:
				return new Operation2EditPart(view);

			case Attribute2EditPart.VISUAL_ID:
				return new Attribute2EditPart(view);

			case ActionEditPart.VISUAL_ID:
				return new ActionEditPart(view);

			case ActionNameEditPart.VISUAL_ID:
				return new ActionNameEditPart(view);

			case Operation3EditPart.VISUAL_ID:
				return new Operation3EditPart(view);

			case ViewEditPart.VISUAL_ID:
				return new ViewEditPart(view);

			case ViewNameEditPart.VISUAL_ID:
				return new ViewNameEditPart(view);

			case Operation4EditPart.VISUAL_ID:
				return new Operation4EditPart(view);

			case AreaEditPart.VISUAL_ID:
				return new AreaEditPart(view);

			case View2EditPart.VISUAL_ID:
				return new View2EditPart(view);

			case ViewName2EditPart.VISUAL_ID:
				return new ViewName2EditPart(view);

			case Operation5EditPart.VISUAL_ID:
				return new Operation5EditPart(view);

			case Class2EditPart.VISUAL_ID:
				return new Class2EditPart(view);

			case ClassName2EditPart.VISUAL_ID:
				return new ClassName2EditPart(view);

			case Interface2EditPart.VISUAL_ID:
				return new Interface2EditPart(view);

			case InterfaceName2EditPart.VISUAL_ID:
				return new InterfaceName2EditPart(view);

			case Package2EditPart.VISUAL_ID:
				return new Package2EditPart(view);

			case PackageName2EditPart.VISUAL_ID:
				return new PackageName2EditPart(view);

			case Include2EditPart.VISUAL_ID:
				return new Include2EditPart(view);

			case IncludeName2EditPart.VISUAL_ID:
				return new IncludeName2EditPart(view);

			case ClassClassAttributesCompartmentEditPart.VISUAL_ID:
				return new ClassClassAttributesCompartmentEditPart(view);

			case ClassClassOperationsCompartmentEditPart.VISUAL_ID:
				return new ClassClassOperationsCompartmentEditPart(view);

			case InterfaceInterfaceOperationsCompartmentEditPart.VISUAL_ID:
				return new InterfaceInterfaceOperationsCompartmentEditPart(view);

			case ControllerPageParametersCompartmentEditPart.VISUAL_ID:
				return new ControllerPageParametersCompartmentEditPart(view);

			case ControllerPageActionsCompartmentEditPart.VISUAL_ID:
				return new ControllerPageActionsCompartmentEditPart(view);

			case ControllerPageViewsCompartmentEditPart.VISUAL_ID:
				return new ControllerPageViewsCompartmentEditPart(view);

			case ControllerPageFunctionsCompartmentEditPart.VISUAL_ID:
				return new ControllerPageFunctionsCompartmentEditPart(view);

			case ActionActionOperationCompartmentEditPart.VISUAL_ID:
				return new ActionActionOperationCompartmentEditPart(view);

			case ViewViewOperationCompartmentEditPart.VISUAL_ID:
				return new ViewViewOperationCompartmentEditPart(view);

			case ViewViewAreaCompartmentEditPart.VISUAL_ID:
				return new ViewViewAreaCompartmentEditPart(view);

			case ViewViewOperationCompartment2EditPart.VISUAL_ID:
				return new ViewViewOperationCompartment2EditPart(view);

			case ViewViewAreaCompartment2EditPart.VISUAL_ID:
				return new ViewViewAreaCompartment2EditPart(view);

			case PackagePackageCompartmentEditPart.VISUAL_ID:
				return new PackagePackageCompartmentEditPart(view);

			case ClassClassAttributesCompartment2EditPart.VISUAL_ID:
				return new ClassClassAttributesCompartment2EditPart(view);

			case ClassClassOperationsCompartment2EditPart.VISUAL_ID:
				return new ClassClassOperationsCompartment2EditPart(view);

			case InterfaceInterfaceOperationsCompartment2EditPart.VISUAL_ID:
				return new InterfaceInterfaceOperationsCompartment2EditPart(
						view);

			case PackagePackageCompartment2EditPart.VISUAL_ID:
				return new PackagePackageCompartment2EditPart(view);

			case DependencyRelationshipEditPart.VISUAL_ID:
				return new DependencyRelationshipEditPart(view);

			case DependencyRelationshipStereotypeEditPart.VISUAL_ID:
				return new DependencyRelationshipStereotypeEditPart(view);

			case InheritanceRelationshipEditPart.VISUAL_ID:
				return new InheritanceRelationshipEditPart(view);

			case RealizationRelationshipEditPart.VISUAL_ID:
				return new RealizationRelationshipEditPart(view);

			case AssociationRelationshipEditPart.VISUAL_ID:
				return new AssociationRelationshipEditPart(view);

			case AssociationRelationshipNameEditPart.VISUAL_ID:
				return new AssociationRelationshipNameEditPart(view);

			case AssociationRelationshipMultiplicityAEditPart.VISUAL_ID:
				return new AssociationRelationshipMultiplicityAEditPart(view);

			case AssociationRelationshipMultiplicityBEditPart.VISUAL_ID:
				return new AssociationRelationshipMultiplicityBEditPart(view);

			case ActionToViewTransitionEditPart.VISUAL_ID:
				return new ActionToViewTransitionEditPart(view);

			case ActionToViewTransitionConditionEditPart.VISUAL_ID:
				return new ActionToViewTransitionConditionEditPart(view);

			case ModelMemberDocsEditPart.VISUAL_ID:
				return new ModelMemberDocsEditPart(view);

			case ViewTransitionEditPart.VISUAL_ID:
				return new ViewTransitionEditPart(view);

			case ViewTransitionConditionEditPart.VISUAL_ID:
				return new ViewTransitionConditionEditPart(view);

			case DependencyRelationship2EditPart.VISUAL_ID:
				return new DependencyRelationship2EditPart(view);

			case DependencyRelationshipStereotype2EditPart.VISUAL_ID:
				return new DependencyRelationshipStereotype2EditPart(view);

			case DependencyRelationship3EditPart.VISUAL_ID:
				return new DependencyRelationship3EditPart(view);

			case DependencyRelationshipStereotype3EditPart.VISUAL_ID:
				return new DependencyRelationshipStereotype3EditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				if (getWrapLabel().isTextWrapOn()
						&& getWrapLabel().getText().length() > 0) {
					rect.setSize(new Dimension(text.computeSize(rect.width,
							SWT.DEFAULT)));
				} else {
					int avr = FigureUtilities.getFontMetrics(text.getFont())
							.getAverageCharWidth();
					rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
							SWT.DEFAULT)).expand(avr * 2, 0));
				}
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
