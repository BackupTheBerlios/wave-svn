/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import de.gulden.modeling.wave.WavePackage;
import de.gulden.modeling.wave.diagram.edit.commands.ActorCreateCommand;
import de.gulden.modeling.wave.diagram.edit.commands.ClassCreateCommand;
import de.gulden.modeling.wave.diagram.edit.commands.ControllerCreateCommand;
import de.gulden.modeling.wave.diagram.edit.commands.DocumentationCreateCommand;
import de.gulden.modeling.wave.diagram.edit.commands.IncludeCreateCommand;
import de.gulden.modeling.wave.diagram.edit.commands.InterfaceCreateCommand;
import de.gulden.modeling.wave.diagram.edit.commands.PackageCreateCommand;
import de.gulden.modeling.wave.diagram.edit.commands.StyleSheetCreateCommand;
import de.gulden.modeling.wave.diagram.edit.commands.UsecaseCreateCommand;
import de.gulden.modeling.wave.diagram.edit.commands.UsecaseSubsystemCreateCommand;
import de.gulden.modeling.wave.diagram.providers.WaveElementTypes;

/**
 * @generated
 */
public class ModelItemSemanticEditPolicy extends WaveBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WaveElementTypes.Class_2017 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(WavePackage.eINSTANCE
						.getPackage_Members());
			}
			return getGEFWrapper(new ClassCreateCommand(req));
		}
		if (WaveElementTypes.Interface_2018 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(WavePackage.eINSTANCE
						.getPackage_Members());
			}
			return getGEFWrapper(new InterfaceCreateCommand(req));
		}
		if (WaveElementTypes.Controller_2026 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(WavePackage.eINSTANCE
						.getPackage_Members());
			}
			return getGEFWrapper(new ControllerCreateCommand(req));
		}
		if (WaveElementTypes.Include_2020 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(WavePackage.eINSTANCE
						.getPackage_Members());
			}
			return getGEFWrapper(new IncludeCreateCommand(req));
		}
		if (WaveElementTypes.Package_2021 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(WavePackage.eINSTANCE
						.getPackage_Members());
			}
			return getGEFWrapper(new PackageCreateCommand(req));
		}
		if (WaveElementTypes.Documentation_2013 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(WavePackage.eINSTANCE
						.getModel_Documentation());
			}
			return getGEFWrapper(new DocumentationCreateCommand(req));
		}
		if (WaveElementTypes.StyleSheet_2022 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(WavePackage.eINSTANCE
						.getPackage_Members());
			}
			return getGEFWrapper(new StyleSheetCreateCommand(req));
		}
		if (WaveElementTypes.UsecaseSubsystem_2023 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(WavePackage.eINSTANCE
						.getPackage_Members());
			}
			return getGEFWrapper(new UsecaseSubsystemCreateCommand(req));
		}
		if (WaveElementTypes.Actor_2024 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(WavePackage.eINSTANCE
						.getPackage_Members());
			}
			return getGEFWrapper(new ActorCreateCommand(req));
		}
		if (WaveElementTypes.Usecase_2025 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(WavePackage.eINSTANCE
						.getPackage_Members());
			}
			return getGEFWrapper(new UsecaseCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
