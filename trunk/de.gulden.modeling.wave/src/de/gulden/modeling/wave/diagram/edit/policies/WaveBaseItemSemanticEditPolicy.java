/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.diagram.edit.policies;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IEditHelperContext;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import de.gulden.modeling.wave.Action;
import de.gulden.modeling.wave.Class;
import de.gulden.modeling.wave.Classifier;
import de.gulden.modeling.wave.Controller;
import de.gulden.modeling.wave.ControllerMemberExecutable;
import de.gulden.modeling.wave.Documentation;
import de.gulden.modeling.wave.Interface;
import de.gulden.modeling.wave.ModelMember;
import de.gulden.modeling.wave.OOPClassifier;
import de.gulden.modeling.wave.Package;
import de.gulden.modeling.wave.WavePackage;
import de.gulden.modeling.wave.diagram.edit.helpers.WaveBaseEditHelper;
import de.gulden.modeling.wave.diagram.expressions.WaveAbstractExpression;
import de.gulden.modeling.wave.diagram.expressions.WaveOCLFactory;
import de.gulden.modeling.wave.diagram.part.WaveDiagramEditorPlugin;
import de.gulden.modeling.wave.diagram.part.WaveVisualIDRegistry;

/**
 * @generated
 */
public class WaveBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	 * Extended request data key to hold editpart visual id.
	 * 
	 * @generated
	 */
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	 * Extended request data key to hold editpart visual id.
	 * Add visual id of edited editpart to extended data of the request
	 * so command switch can decide what kind of diagram element is being edited.
	 * It is done in those cases when it's not possible to deduce diagram
	 * element kind from domain element.
	 * 
	 * @generated
	 */
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart()
					.getModel();
			if (view instanceof View) {
				Integer id = new Integer(WaveVisualIDRegistry
						.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	 * Returns visual id from request parameters.
	 * 
	 * @generated
	 */
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Object editHelperContext = completedRequest.getEditHelperContext();
		if (editHelperContext instanceof View
				|| (editHelperContext instanceof IEditHelperContext && ((IEditHelperContext) editHelperContext)
						.getEObject() instanceof View)) {
			// no semantic commands are provided for pure design elements
			return null;
		}
		if (editHelperContext == null) {
			editHelperContext = ViewUtil
					.resolveSemanticElement((View) getHost().getModel());
		}
		IElementType elementType = ElementTypeRegistry.getInstance()
				.getElementType(editHelperContext);
		if (elementType == ElementTypeRegistry.getInstance().getType(
				"org.eclipse.gmf.runtime.emf.type.core.default")) { //$NON-NLS-1$ 
			elementType = null;
		}
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		if (elementType != null) {
			if (semanticCommand != null) {
				ICommand command = semanticCommand instanceof ICommandProxy ? ((ICommandProxy) semanticCommand)
						.getICommand()
						: new CommandProxy(semanticCommand);
				completedRequest.setParameter(
						WaveBaseEditHelper.EDIT_POLICY_COMMAND, command);
			}
			ICommand command = elementType.getEditCommand(completedRequest);
			if (command != null) {
				if (!(command instanceof CompositeTransactionalCommand)) {
					TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
							.getEditingDomain();
					command = new CompositeTransactionalCommand(editingDomain,
							command.getLabel()).compose(command);
				}
				semanticCommand = new ICommandProxy(command);
			}
		}
		boolean shouldProceed = true;
		if (completedRequest instanceof DestroyRequest) {
			shouldProceed = shouldProceed((DestroyRequest) completedRequest);
		}
		if (shouldProceed) {
			if (completedRequest instanceof DestroyRequest) {
				TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
						.getEditingDomain();
				Command deleteViewCommand = new ICommandProxy(
						new DeleteCommand(editingDomain, (View) getHost()
								.getModel()));
				semanticCommand = semanticCommand == null ? deleteViewCommand
						: semanticCommand.chain(deleteViewCommand);
			}
			return semanticCommand;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	 * @deprecated use getGEFWrapper() instead
	 * @generated
	 */
	protected final Command getMSLWrapper(ICommand cmd) {
		// XXX deprecated: use getGEFWrapper() instead
		return getGEFWrapper(cmd);
	}

	/**
	 * @generated
	 */
	protected EObject getSemanticElement() {
		return ViewUtil.resolveSemanticElement((View) getHost().getModel());
	}

	/**
	 * Returns editing domain from the host edit part.
	 * 
	 * @generated
	 */
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	 * Creates command to destroy the link.
	 * 
	 * @generated
	 */
	protected Command getDestroyElementCommand(View view) {
		EditPart editPart = (EditPart) getHost().getViewer()
				.getEditPartRegistry().get(view);
		DestroyElementRequest request = new DestroyElementRequest(
				getEditingDomain(), false);
		return editPart.getCommand(new EditCommandRequestWrapper(request,
				Collections.EMPTY_MAP));
	}

	/**
	 * Creates commands to destroy all host incoming and outgoing links.
	 * 
	 * @generated
	 */
	protected CompoundCommand getDestroyEdgesCommand() {
		CompoundCommand cmd = new CompoundCommand();
		View view = (View) getHost().getModel();
		for (Iterator it = view.getSourceEdges().iterator(); it.hasNext();) {
			cmd.add(getDestroyElementCommand((Edge) it.next()));
		}
		for (Iterator it = view.getTargetEdges().iterator(); it.hasNext();) {
			cmd.add(getDestroyElementCommand((Edge) it.next()));
		}
		return cmd;
	}

	/**
	 * @generated
	 */
	protected void addDestroyShortcutsCommand(CompoundCommand command) {
		View view = (View) getHost().getModel();
		if (view.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
			return;
		}
		for (Iterator it = view.getDiagram().getChildren().iterator(); it
				.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() || nextView.getElement() != view.getElement()) { //$NON-NLS-1$
				continue;
			}
			command.add(getDestroyElementCommand(nextView));
		}
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		 * @generated
		 */
		private static final String OPPOSITE_END_VAR = "oppositeEnd"; //$NON-NLS-1$

		/**
		 * @generated
		 */
		private static WaveAbstractExpression DependencyRelationship_4016_SourceExpression;
		/**
		 * @generated
		 */
		private static WaveAbstractExpression DependencyRelationship_4016_TargetExpression;
		/**
		 * @generated
		 */
		private static WaveAbstractExpression DependencyRelationship_4017_SourceExpression;
		/**
		 * @generated
		 */
		private static WaveAbstractExpression DependencyRelationship_4017_TargetExpression;

		/**
		 * @generated
		 */
		public static boolean canCreateDependencyRelationship_3001(
				Package container, ModelMember source, ModelMember target) {
			return canExistDependencyRelationship_3001(container, source,
					target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateInheritanceRelationship_3002(
				Package container, Classifier source, Classifier target) {
			return canExistInheritanceRelationship_3002(container, source,
					target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateRealizationRelationship_3003(
				Package container, Class source, Interface target) {
			return canExistRealizationRelationship_3003(container, source,
					target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateAssociationRelationship_3004(
				Package container, OOPClassifier source, OOPClassifier target) {
			return canExistAssociationRelationship_3004(container, source,
					target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateActionToViewTransition_3005(
				Controller container, Action source,
				de.gulden.modeling.wave.View target) {
			return canExistActionToViewTransition_3005(container, source,
					target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateModelMemberDocs_4015(ModelMember source,
				Documentation target) {
			if (source != null) {
				if (source.getDocs().contains(target)) {
					return false;
				}
			}
			return canExistModelMemberDocs_4015(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateViewTransition_4013(
				Controller container, ControllerMemberExecutable source,
				ControllerMemberExecutable target) {
			return canExistViewTransition_4013(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateDependencyRelationship_4016(
				Package container, ModelMember source, ModelMember target) {
			return canExistDependencyRelationship_4016(container, source,
					target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateDependencyRelationship_4017(
				Package container, ModelMember source, ModelMember target) {
			return canExistDependencyRelationship_4017(container, source,
					target);
		}

		/**
		 * @generated
		 */
		public static boolean canExistDependencyRelationship_3001(
				Package container, ModelMember source, ModelMember target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistInheritanceRelationship_3002(
				Package container, Classifier source, Classifier target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistRealizationRelationship_3003(
				Package container, Class source, Interface target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistAssociationRelationship_3004(
				Package container, OOPClassifier source, OOPClassifier target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistActionToViewTransition_3005(
				Controller container, Action source,
				de.gulden.modeling.wave.View target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistModelMemberDocs_4015(ModelMember source,
				Documentation target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistViewTransition_4013(Controller container,
				ControllerMemberExecutable source,
				ControllerMemberExecutable target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistDependencyRelationship_4016(
				Package container, ModelMember source, ModelMember target) {
			try {
				if (source == null) {
					return true;
				}
				if (DependencyRelationship_4016_SourceExpression == null) {
					Map env = Collections.singletonMap(OPPOSITE_END_VAR,
							WavePackage.eINSTANCE.getModelMember());
					DependencyRelationship_4016_SourceExpression = WaveOCLFactory
							.getExpression(
									"self.oclIsKindOf(Usecase)", WavePackage.eINSTANCE.getModelMember(), env); //$NON-NLS-1$
				}
				Object sourceVal = DependencyRelationship_4016_SourceExpression
						.evaluate(source, Collections.singletonMap(
								OPPOSITE_END_VAR, target));
				if (false == sourceVal instanceof Boolean
						|| !((Boolean) sourceVal).booleanValue()) {
					return false;
				} // else fall-through
				if (target == null) {
					return true;
				}
				if (DependencyRelationship_4016_TargetExpression == null) {
					Map env = Collections.singletonMap(OPPOSITE_END_VAR,
							WavePackage.eINSTANCE.getModelMember());
					DependencyRelationship_4016_TargetExpression = WaveOCLFactory
							.getExpression(
									"self.oclIsKindOf(Usecase)", WavePackage.eINSTANCE.getModelMember(), env); //$NON-NLS-1$
				}
				Object targetVal = DependencyRelationship_4016_TargetExpression
						.evaluate(target, Collections.singletonMap(
								OPPOSITE_END_VAR, source));
				if (false == targetVal instanceof Boolean
						|| !((Boolean) targetVal).booleanValue()) {
					return false;
				} // else fall-through
				return true;
			} catch (Exception e) {
				WaveDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public static boolean canExistDependencyRelationship_4017(
				Package container, ModelMember source, ModelMember target) {
			try {
				if (source == null) {
					return true;
				}
				if (DependencyRelationship_4017_SourceExpression == null) {
					Map env = Collections.singletonMap(OPPOSITE_END_VAR,
							WavePackage.eINSTANCE.getModelMember());
					DependencyRelationship_4017_SourceExpression = WaveOCLFactory
							.getExpression(
									"self.oclIsKindOf(Usecase)", WavePackage.eINSTANCE.getModelMember(), env); //$NON-NLS-1$
				}
				Object sourceVal = DependencyRelationship_4017_SourceExpression
						.evaluate(source, Collections.singletonMap(
								OPPOSITE_END_VAR, target));
				if (false == sourceVal instanceof Boolean
						|| !((Boolean) sourceVal).booleanValue()) {
					return false;
				} // else fall-through
				if (target == null) {
					return true;
				}
				if (DependencyRelationship_4017_TargetExpression == null) {
					Map env = Collections.singletonMap(OPPOSITE_END_VAR,
							WavePackage.eINSTANCE.getModelMember());
					DependencyRelationship_4017_TargetExpression = WaveOCLFactory
							.getExpression(
									"self.oclIsKindOf(Usecase)", WavePackage.eINSTANCE.getModelMember(), env); //$NON-NLS-1$
				}
				Object targetVal = DependencyRelationship_4017_TargetExpression
						.evaluate(target, Collections.singletonMap(
								OPPOSITE_END_VAR, source));
				if (false == targetVal instanceof Boolean
						|| !((Boolean) targetVal).booleanValue()) {
					return false;
				} // else fall-through
				return true;
			} catch (Exception e) {
				WaveDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}
	}

}
