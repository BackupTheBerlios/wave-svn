/**
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.gulden.modeling.wave.WaveFactory
 * @model kind="package"
 * @generated
 */
public interface WavePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wave";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jensgulden.de/modeling/wave";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wave";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WavePackage eINSTANCE = de.gulden.modeling.wave.impl.WavePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.ModelMemberImpl <em>Model Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.ModelMemberImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getModelMember()
	 * @generated
	 */
	int MODEL_MEMBER = 10;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_MEMBER__TAGGED_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_MEMBER__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_MEMBER__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_MEMBER__DOCS = 3;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_MEMBER__STEREOTYPE = 4;

	/**
	 * The number of structural features of the '<em>Model Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_MEMBER_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.TopLevelModelMemberImpl <em>Top Level Model Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.TopLevelModelMemberImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getTopLevelModelMember()
	 * @generated
	 */
	int TOP_LEVEL_MODEL_MEMBER = 15;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_MODEL_MEMBER__TAGGED_VALUE = MODEL_MEMBER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_MODEL_MEMBER__LABEL = MODEL_MEMBER__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_MODEL_MEMBER__DESCRIPTION = MODEL_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_MODEL_MEMBER__DOCS = MODEL_MEMBER__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_MODEL_MEMBER__STEREOTYPE = MODEL_MEMBER__STEREOTYPE;

	/**
	 * The number of structural features of the '<em>Top Level Model Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_MODEL_MEMBER_FEATURE_COUNT = MODEL_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.ClassifierImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 0;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__TAGGED_VALUE = TOP_LEVEL_MODEL_MEMBER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__LABEL = TOP_LEVEL_MODEL_MEMBER__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__DESCRIPTION = TOP_LEVEL_MODEL_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__DOCS = TOP_LEVEL_MODEL_MEMBER__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__STEREOTYPE = TOP_LEVEL_MODEL_MEMBER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OPERATIONS = TOP_LEVEL_MODEL_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__NAME = TOP_LEVEL_MODEL_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__ATTRIBUTES = TOP_LEVEL_MODEL_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__IS_EXTERNAL = TOP_LEVEL_MODEL_MEMBER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = TOP_LEVEL_MODEL_MEMBER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.ArtifactClassifierImpl <em>Artifact Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.ArtifactClassifierImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getArtifactClassifier()
	 * @generated
	 */
	int ARTIFACT_CLASSIFIER = 21;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_CLASSIFIER__TAGGED_VALUE = CLASSIFIER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_CLASSIFIER__LABEL = CLASSIFIER__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_CLASSIFIER__DESCRIPTION = CLASSIFIER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_CLASSIFIER__DOCS = CLASSIFIER__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_CLASSIFIER__STEREOTYPE = CLASSIFIER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_CLASSIFIER__OPERATIONS = CLASSIFIER__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_CLASSIFIER__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_CLASSIFIER__ATTRIBUTES = CLASSIFIER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Is External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_CLASSIFIER__IS_EXTERNAL = CLASSIFIER__IS_EXTERNAL;

	/**
	 * The number of structural features of the '<em>Artifact Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_CLASSIFIER_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.ControllerImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 1;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__TAGGED_VALUE = ARTIFACT_CLASSIFIER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__LABEL = ARTIFACT_CLASSIFIER__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__DESCRIPTION = ARTIFACT_CLASSIFIER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__DOCS = ARTIFACT_CLASSIFIER__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__STEREOTYPE = ARTIFACT_CLASSIFIER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__OPERATIONS = ARTIFACT_CLASSIFIER__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__NAME = ARTIFACT_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__ATTRIBUTES = ARTIFACT_CLASSIFIER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Is External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__IS_EXTERNAL = ARTIFACT_CLASSIFIER__IS_EXTERNAL;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__ACTIONS = ARTIFACT_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__VIEWS = ARTIFACT_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transitions Action To View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__TRANSITIONS_ACTION_TO_VIEW = ARTIFACT_CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transitions View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__TRANSITIONS_VIEW = ARTIFACT_CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = ARTIFACT_CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.AssociationRelationshipImpl <em>Association Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.AssociationRelationshipImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getAssociationRelationship()
	 * @generated
	 */
	int ASSOCIATION_RELATIONSHIP = 2;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RELATIONSHIP__TAGGED_VALUE = TOP_LEVEL_MODEL_MEMBER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RELATIONSHIP__LABEL = TOP_LEVEL_MODEL_MEMBER__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RELATIONSHIP__DESCRIPTION = TOP_LEVEL_MODEL_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RELATIONSHIP__DOCS = TOP_LEVEL_MODEL_MEMBER__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RELATIONSHIP__STEREOTYPE = TOP_LEVEL_MODEL_MEMBER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RELATIONSHIP__NAME = TOP_LEVEL_MODEL_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multiplicity A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RELATIONSHIP__MULTIPLICITY_A = TOP_LEVEL_MODEL_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multiplicity B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RELATIONSHIP__MULTIPLICITY_B = TOP_LEVEL_MODEL_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RELATIONSHIP__A = TOP_LEVEL_MODEL_MEMBER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RELATIONSHIP__B = TOP_LEVEL_MODEL_MEMBER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RELATIONSHIP__DIRECTION = TOP_LEVEL_MODEL_MEMBER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Association Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RELATIONSHIP_FEATURE_COUNT = TOP_LEVEL_MODEL_MEMBER_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.ClassifierMemberImpl <em>Classifier Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.ClassifierMemberImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getClassifierMember()
	 * @generated
	 */
	int CLASSIFIER_MEMBER = 20;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MEMBER__TAGGED_VALUE = MODEL_MEMBER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MEMBER__LABEL = MODEL_MEMBER__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MEMBER__DESCRIPTION = MODEL_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MEMBER__DOCS = MODEL_MEMBER__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MEMBER__STEREOTYPE = MODEL_MEMBER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MEMBER__SIGNATURE = MODEL_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MEMBER__NAME = MODEL_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MEMBER__VISIBILITY = MODEL_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MEMBER__IS_STATIC = MODEL_MEMBER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MEMBER__IS_FINAL = MODEL_MEMBER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Target Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MEMBER__TARGET_MODE = MODEL_MEMBER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Classifier Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MEMBER_FEATURE_COUNT = MODEL_MEMBER_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.OperationImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TAGGED_VALUE = CLASSIFIER_MEMBER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__LABEL = CLASSIFIER_MEMBER__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DESCRIPTION = CLASSIFIER_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DOCS = CLASSIFIER_MEMBER__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__STEREOTYPE = CLASSIFIER_MEMBER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SIGNATURE = CLASSIFIER_MEMBER__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = CLASSIFIER_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__VISIBILITY = CLASSIFIER_MEMBER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IS_STATIC = CLASSIFIER_MEMBER__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IS_FINAL = CLASSIFIER_MEMBER__IS_FINAL;

	/**
	 * The feature id for the '<em><b>Target Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TARGET_MODE = CLASSIFIER_MEMBER__TARGET_MODE;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RETURN_TYPE = CLASSIFIER_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IS_ABSTRACT = CLASSIFIER_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CODE = CLASSIFIER_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Throws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__THROWS = CLASSIFIER_MEMBER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARAMETERS = CLASSIFIER_MEMBER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = CLASSIFIER_MEMBER_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.ControllerMemberImpl <em>Controller Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.ControllerMemberImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getControllerMember()
	 * @generated
	 */
	int CONTROLLER_MEMBER = 25;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_MEMBER__TAGGED_VALUE = MODEL_MEMBER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_MEMBER__LABEL = MODEL_MEMBER__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_MEMBER__DESCRIPTION = MODEL_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_MEMBER__DOCS = MODEL_MEMBER__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_MEMBER__STEREOTYPE = MODEL_MEMBER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Usecases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_MEMBER__USECASES = MODEL_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_MEMBER__NAME = MODEL_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Controller Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_MEMBER_FEATURE_COUNT = MODEL_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.ControllerMemberExecutableImpl <em>Controller Member Executable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.ControllerMemberExecutableImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getControllerMemberExecutable()
	 * @generated
	 */
	int CONTROLLER_MEMBER_EXECUTABLE = 38;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_MEMBER_EXECUTABLE__TAGGED_VALUE = CONTROLLER_MEMBER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_MEMBER_EXECUTABLE__LABEL = CONTROLLER_MEMBER__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_MEMBER_EXECUTABLE__DESCRIPTION = CONTROLLER_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_MEMBER_EXECUTABLE__DOCS = CONTROLLER_MEMBER__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_MEMBER_EXECUTABLE__STEREOTYPE = CONTROLLER_MEMBER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Usecases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_MEMBER_EXECUTABLE__USECASES = CONTROLLER_MEMBER__USECASES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_MEMBER_EXECUTABLE__NAME = CONTROLLER_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_MEMBER_EXECUTABLE__OPERATION = CONTROLLER_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Controller Member Executable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_MEMBER_EXECUTABLE_FEATURE_COUNT = CONTROLLER_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.ActionImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TAGGED_VALUE = CONTROLLER_MEMBER_EXECUTABLE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__LABEL = CONTROLLER_MEMBER_EXECUTABLE__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DESCRIPTION = CONTROLLER_MEMBER_EXECUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DOCS = CONTROLLER_MEMBER_EXECUTABLE__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__STEREOTYPE = CONTROLLER_MEMBER_EXECUTABLE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Usecases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__USECASES = CONTROLLER_MEMBER_EXECUTABLE__USECASES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = CONTROLLER_MEMBER_EXECUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OPERATION = CONTROLLER_MEMBER_EXECUTABLE__OPERATION;

	/**
	 * The feature id for the '<em><b>Ajax Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__AJAX_MODE = CONTROLLER_MEMBER_EXECUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ajax Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__AJAX_TARGET = CONTROLLER_MEMBER_EXECUTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Confirm Execute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONFIRM_EXECUTE = CONTROLLER_MEMBER_EXECUTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = CONTROLLER_MEMBER_EXECUTABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.ViewImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getView()
	 * @generated
	 */
	int VIEW = 5;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__TAGGED_VALUE = CONTROLLER_MEMBER_EXECUTABLE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__LABEL = CONTROLLER_MEMBER_EXECUTABLE__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__DESCRIPTION = CONTROLLER_MEMBER_EXECUTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__DOCS = CONTROLLER_MEMBER_EXECUTABLE__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__STEREOTYPE = CONTROLLER_MEMBER_EXECUTABLE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Usecases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__USECASES = CONTROLLER_MEMBER_EXECUTABLE__USECASES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = CONTROLLER_MEMBER_EXECUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__OPERATION = CONTROLLER_MEMBER_EXECUTABLE__OPERATION;

	/**
	 * The feature id for the '<em><b>Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__AREAS = CONTROLLER_MEMBER_EXECUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = CONTROLLER_MEMBER_EXECUTABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.AttributeImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TAGGED_VALUE = CLASSIFIER_MEMBER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__LABEL = CLASSIFIER_MEMBER__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DESCRIPTION = CLASSIFIER_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DOCS = CLASSIFIER_MEMBER__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__STEREOTYPE = CLASSIFIER_MEMBER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SIGNATURE = CLASSIFIER_MEMBER__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = CLASSIFIER_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VISIBILITY = CLASSIFIER_MEMBER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_STATIC = CLASSIFIER_MEMBER__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_FINAL = CLASSIFIER_MEMBER__IS_FINAL;

	/**
	 * The feature id for the '<em><b>Target Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TARGET_MODE = CLASSIFIER_MEMBER__TARGET_MODE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = CLASSIFIER_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DEFAULT_VALUE = CLASSIFIER_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_MULTIPLE = CLASSIFIER_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = CLASSIFIER_MEMBER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.InheritanceRelationshipImpl <em>Inheritance Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.InheritanceRelationshipImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getInheritanceRelationship()
	 * @generated
	 */
	int INHERITANCE_RELATIONSHIP = 7;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_RELATIONSHIP__TAGGED_VALUE = TOP_LEVEL_MODEL_MEMBER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_RELATIONSHIP__LABEL = TOP_LEVEL_MODEL_MEMBER__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_RELATIONSHIP__DESCRIPTION = TOP_LEVEL_MODEL_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_RELATIONSHIP__DOCS = TOP_LEVEL_MODEL_MEMBER__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_RELATIONSHIP__STEREOTYPE = TOP_LEVEL_MODEL_MEMBER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_RELATIONSHIP__PARENT = TOP_LEVEL_MODEL_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_RELATIONSHIP__CHILD = TOP_LEVEL_MODEL_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inheritance Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_RELATIONSHIP_FEATURE_COUNT = TOP_LEVEL_MODEL_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.RealizationRelationshipImpl <em>Realization Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.RealizationRelationshipImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getRealizationRelationship()
	 * @generated
	 */
	int REALIZATION_RELATIONSHIP = 8;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_RELATIONSHIP__TAGGED_VALUE = TOP_LEVEL_MODEL_MEMBER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_RELATIONSHIP__LABEL = TOP_LEVEL_MODEL_MEMBER__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_RELATIONSHIP__DESCRIPTION = TOP_LEVEL_MODEL_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_RELATIONSHIP__DOCS = TOP_LEVEL_MODEL_MEMBER__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_RELATIONSHIP__STEREOTYPE = TOP_LEVEL_MODEL_MEMBER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Parent Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_RELATIONSHIP__PARENT_INTERFACE = TOP_LEVEL_MODEL_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implementing Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_RELATIONSHIP__IMPLEMENTING_CLASS = TOP_LEVEL_MODEL_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Realization Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_RELATIONSHIP_FEATURE_COUNT = TOP_LEVEL_MODEL_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.PackageImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 11;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TAGGED_VALUE = TOP_LEVEL_MODEL_MEMBER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__LABEL = TOP_LEVEL_MODEL_MEMBER__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DESCRIPTION = TOP_LEVEL_MODEL_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DOCS = TOP_LEVEL_MODEL_MEMBER__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__STEREOTYPE = TOP_LEVEL_MODEL_MEMBER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = TOP_LEVEL_MODEL_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MEMBERS = TOP_LEVEL_MODEL_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = TOP_LEVEL_MODEL_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.ModelImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 9;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TAGGED_VALUE = PACKAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__LABEL = PACKAGE__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DESCRIPTION = PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DOCS = PACKAGE__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__STEREOTYPE = PACKAGE__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MEMBERS = PACKAGE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__AUTHOR = PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__VERSION = PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__BASE_PACKAGE = PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SOURCE_FOLDER = PACKAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Generator Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__GENERATOR_TARGET = PACKAGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__COPYRIGHT = PACKAGE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PROVIDER = PACKAGE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Dictionary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DICTIONARY = PACKAGE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DOCUMENTATION = PACKAGE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Factory Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__FACTORY_CLASS = PACKAGE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Layout Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__LAYOUT_TEMPLATE = PACKAGE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Base Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__BASE_URL = PACKAGE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Icon Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ICON_PREFIX = PACKAGE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Testdata SQL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TESTDATA_SQL = PACKAGE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Project Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PROJECT_LAYOUT = PACKAGE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = PACKAGE_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.DependencyRelationshipImpl <em>Dependency Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.DependencyRelationshipImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getDependencyRelationship()
	 * @generated
	 */
	int DEPENDENCY_RELATIONSHIP = 12;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_RELATIONSHIP__TAGGED_VALUE = TOP_LEVEL_MODEL_MEMBER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_RELATIONSHIP__LABEL = TOP_LEVEL_MODEL_MEMBER__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_RELATIONSHIP__DESCRIPTION = TOP_LEVEL_MODEL_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_RELATIONSHIP__DOCS = TOP_LEVEL_MODEL_MEMBER__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_RELATIONSHIP__STEREOTYPE = TOP_LEVEL_MODEL_MEMBER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_RELATIONSHIP__CLIENT = TOP_LEVEL_MODEL_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_RELATIONSHIP__SUPPLIER = TOP_LEVEL_MODEL_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dependency Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_RELATIONSHIP_FEATURE_COUNT = TOP_LEVEL_MODEL_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.OOPClassifierImpl <em>OOP Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.OOPClassifierImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getOOPClassifier()
	 * @generated
	 */
	int OOP_CLASSIFIER = 19;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OOP_CLASSIFIER__TAGGED_VALUE = CLASSIFIER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OOP_CLASSIFIER__LABEL = CLASSIFIER__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OOP_CLASSIFIER__DESCRIPTION = CLASSIFIER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OOP_CLASSIFIER__DOCS = CLASSIFIER__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OOP_CLASSIFIER__STEREOTYPE = CLASSIFIER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OOP_CLASSIFIER__OPERATIONS = CLASSIFIER__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OOP_CLASSIFIER__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OOP_CLASSIFIER__ATTRIBUTES = CLASSIFIER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Is External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OOP_CLASSIFIER__IS_EXTERNAL = CLASSIFIER__IS_EXTERNAL;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OOP_CLASSIFIER__IS_ABSTRACT = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OOP_CLASSIFIER__VISIBILITY = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>External Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OOP_CLASSIFIER__EXTERNAL_EXTENDS = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>External Implements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OOP_CLASSIFIER__EXTERNAL_IMPLEMENTS = CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inner</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OOP_CLASSIFIER__INNER = CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>OOP Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OOP_CLASSIFIER_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.ClassImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 13;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TAGGED_VALUE = OOP_CLASSIFIER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__LABEL = OOP_CLASSIFIER__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__DESCRIPTION = OOP_CLASSIFIER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__DOCS = OOP_CLASSIFIER__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__STEREOTYPE = OOP_CLASSIFIER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OPERATIONS = OOP_CLASSIFIER__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = OOP_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ATTRIBUTES = OOP_CLASSIFIER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Is External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_EXTERNAL = OOP_CLASSIFIER__IS_EXTERNAL;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_ABSTRACT = OOP_CLASSIFIER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__VISIBILITY = OOP_CLASSIFIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>External Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__EXTERNAL_EXTENDS = OOP_CLASSIFIER__EXTERNAL_EXTENDS;

	/**
	 * The feature id for the '<em><b>External Implements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__EXTERNAL_IMPLEMENTS = OOP_CLASSIFIER__EXTERNAL_IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Inner</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__INNER = OOP_CLASSIFIER__INNER;

	/**
	 * The feature id for the '<em><b>Is Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_PERSISTENT = OOP_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TARGET_MODE = OOP_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FORMS = OOP_CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = OOP_CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.InterfaceImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 14;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__TAGGED_VALUE = OOP_CLASSIFIER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__LABEL = OOP_CLASSIFIER__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__DESCRIPTION = OOP_CLASSIFIER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__DOCS = OOP_CLASSIFIER__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__STEREOTYPE = OOP_CLASSIFIER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__OPERATIONS = OOP_CLASSIFIER__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = OOP_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ATTRIBUTES = OOP_CLASSIFIER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Is External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__IS_EXTERNAL = OOP_CLASSIFIER__IS_EXTERNAL;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__IS_ABSTRACT = OOP_CLASSIFIER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__VISIBILITY = OOP_CLASSIFIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>External Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__EXTERNAL_EXTENDS = OOP_CLASSIFIER__EXTERNAL_EXTENDS;

	/**
	 * The feature id for the '<em><b>External Implements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__EXTERNAL_IMPLEMENTS = OOP_CLASSIFIER__EXTERNAL_IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Inner</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__INNER = OOP_CLASSIFIER__INNER;

	/**
	 * The feature id for the '<em><b>Target Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__TARGET_MODE = OOP_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = OOP_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.TransitionImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 41;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TAGGED_VALUE = MODEL_MEMBER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__LABEL = MODEL_MEMBER__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DESCRIPTION = MODEL_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DOCS = MODEL_MEMBER__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__STEREOTYPE = MODEL_MEMBER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = MODEL_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONDITION = MODEL_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = MODEL_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.ActionToViewTransitionImpl <em>Action To View Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.ActionToViewTransitionImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getActionToViewTransition()
	 * @generated
	 */
	int ACTION_TO_VIEW_TRANSITION = 16;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TO_VIEW_TRANSITION__TAGGED_VALUE = TRANSITION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TO_VIEW_TRANSITION__LABEL = TRANSITION__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TO_VIEW_TRANSITION__DESCRIPTION = TRANSITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TO_VIEW_TRANSITION__DOCS = TRANSITION__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TO_VIEW_TRANSITION__STEREOTYPE = TRANSITION__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TO_VIEW_TRANSITION__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TO_VIEW_TRANSITION__CONDITION = TRANSITION__CONDITION;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TO_VIEW_TRANSITION__TARGET = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TO_VIEW_TRANSITION__SOURCE = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action To View Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TO_VIEW_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.TaggedValueImpl <em>Tagged Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.TaggedValueImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getTaggedValue()
	 * @generated
	 */
	int TAGGED_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Tagged Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.DocumentationImpl <em>Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.DocumentationImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getDocumentation()
	 * @generated
	 */
	int DOCUMENTATION = 18;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Audience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__AUDIENCE = 1;

	/**
	 * The feature id for the '<em><b>Detail Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__DETAIL_LEVEL = 2;

	/**
	 * The number of structural features of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.IncludeImpl <em>Include</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.IncludeImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getInclude()
	 * @generated
	 */
	int INCLUDE = 22;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__TAGGED_VALUE = ARTIFACT_CLASSIFIER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__LABEL = ARTIFACT_CLASSIFIER__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__DESCRIPTION = ARTIFACT_CLASSIFIER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__DOCS = ARTIFACT_CLASSIFIER__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__STEREOTYPE = ARTIFACT_CLASSIFIER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__OPERATIONS = ARTIFACT_CLASSIFIER__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__NAME = ARTIFACT_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__ATTRIBUTES = ARTIFACT_CLASSIFIER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Is External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__IS_EXTERNAL = ARTIFACT_CLASSIFIER__IS_EXTERNAL;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__CODE = ARTIFACT_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Url Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__URL_PATH = ARTIFACT_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_FEATURE_COUNT = ARTIFACT_CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.StyleSheetImpl <em>Style Sheet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.StyleSheetImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getStyleSheet()
	 * @generated
	 */
	int STYLE_SHEET = 23;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET__TAGGED_VALUE = ARTIFACT_CLASSIFIER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET__LABEL = ARTIFACT_CLASSIFIER__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET__DESCRIPTION = ARTIFACT_CLASSIFIER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET__DOCS = ARTIFACT_CLASSIFIER__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET__STEREOTYPE = ARTIFACT_CLASSIFIER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET__OPERATIONS = ARTIFACT_CLASSIFIER__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET__NAME = ARTIFACT_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET__ATTRIBUTES = ARTIFACT_CLASSIFIER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Is External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET__IS_EXTERNAL = ARTIFACT_CLASSIFIER__IS_EXTERNAL;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET__CODE = ARTIFACT_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Style Sheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SHEET_FEATURE_COUNT = ARTIFACT_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.ViewTransitionImpl <em>View Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.ViewTransitionImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getViewTransition()
	 * @generated
	 */
	int VIEW_TRANSITION = 24;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TRANSITION__TAGGED_VALUE = TRANSITION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TRANSITION__LABEL = TRANSITION__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TRANSITION__DESCRIPTION = TRANSITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TRANSITION__DOCS = TRANSITION__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TRANSITION__STEREOTYPE = TRANSITION__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TRANSITION__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TRANSITION__CONDITION = TRANSITION__CONDITION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TRANSITION__SOURCE = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TRANSITION__TARGET = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>View Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.EnumerationImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 26;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__TAGGED_VALUE = OOP_CLASSIFIER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__LABEL = OOP_CLASSIFIER__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__DESCRIPTION = OOP_CLASSIFIER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__DOCS = OOP_CLASSIFIER__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__STEREOTYPE = OOP_CLASSIFIER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__OPERATIONS = OOP_CLASSIFIER__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = OOP_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__ATTRIBUTES = OOP_CLASSIFIER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Is External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__IS_EXTERNAL = OOP_CLASSIFIER__IS_EXTERNAL;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__IS_ABSTRACT = OOP_CLASSIFIER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__VISIBILITY = OOP_CLASSIFIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>External Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__EXTERNAL_EXTENDS = OOP_CLASSIFIER__EXTERNAL_EXTENDS;

	/**
	 * The feature id for the '<em><b>External Implements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__EXTERNAL_IMPLEMENTS = OOP_CLASSIFIER__EXTERNAL_IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Inner</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__INNER = OOP_CLASSIFIER__INNER;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__LITERALS = OOP_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = OOP_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.EnumerationLiteralImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getEnumerationLiteral()
	 * @generated
	 */
	int ENUMERATION_LITERAL = 27;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__TAGGED_VALUE = MODEL_MEMBER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__LABEL = MODEL_MEMBER__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__DESCRIPTION = MODEL_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__DOCS = MODEL_MEMBER__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__STEREOTYPE = MODEL_MEMBER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__NAME = MODEL_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__VALUE = MODEL_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_FEATURE_COUNT = MODEL_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.DictionaryImpl <em>Dictionary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.DictionaryImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getDictionary()
	 * @generated
	 */
	int DICTIONARY = 28;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Default Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__DEFAULT_LANG = 1;

	/**
	 * The number of structural features of the '<em>Dictionary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.LabelImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 29;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Langstring</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__LANGSTRING = 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ICON = 2;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__MODE = 3;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.LangstringImpl <em>Langstring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.LangstringImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getLangstring()
	 * @generated
	 */
	int LANGSTRING = 30;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGSTRING__LANG = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGSTRING__TEXT = 1;

	/**
	 * The number of structural features of the '<em>Langstring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGSTRING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.DatabaseTableImpl <em>Database Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.DatabaseTableImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getDatabaseTable()
	 * @generated
	 */
	int DATABASE_TABLE = 31;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TABLE__TAGGED_VALUE = TOP_LEVEL_MODEL_MEMBER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TABLE__LABEL = TOP_LEVEL_MODEL_MEMBER__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TABLE__DESCRIPTION = TOP_LEVEL_MODEL_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TABLE__DOCS = TOP_LEVEL_MODEL_MEMBER__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TABLE__STEREOTYPE = TOP_LEVEL_MODEL_MEMBER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TABLE__NAME = TOP_LEVEL_MODEL_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sql Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TABLE__SQL_CREATE = TOP_LEVEL_MODEL_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Database Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TABLE_FEATURE_COUNT = TOP_LEVEL_MODEL_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.WidgetImpl <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.WidgetImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getWidget()
	 * @generated
	 */
	int WIDGET = 32;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__TAGGED_VALUE = MODEL_MEMBER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__LABEL = MODEL_MEMBER__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__DESCRIPTION = MODEL_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__DOCS = MODEL_MEMBER__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__STEREOTYPE = MODEL_MEMBER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__WIDGET_TYPE = MODEL_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Widget Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__WIDGET_HINT = MODEL_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__READ_ONLY = MODEL_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__REQUIRED = MODEL_MEMBER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ignore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__IGNORE = MODEL_MEMBER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__FILTERS = MODEL_MEMBER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__VALIDATORS = MODEL_MEMBER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__OPTIONS = MODEL_MEMBER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Menu Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__MENU_ACTIONS = MODEL_MEMBER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Element Form Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ELEMENT_FORM_NAME = MODEL_MEMBER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Multi Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__MULTI_LINE = MODEL_MEMBER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Multi Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__MULTI_CHOICE = MODEL_MEMBER_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEATURE_COUNT = MODEL_MEMBER_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.UsecaseSubsystemImpl <em>Usecase Subsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.UsecaseSubsystemImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getUsecaseSubsystem()
	 * @generated
	 */
	int USECASE_SUBSYSTEM = 33;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE_SUBSYSTEM__TAGGED_VALUE = TOP_LEVEL_MODEL_MEMBER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE_SUBSYSTEM__LABEL = TOP_LEVEL_MODEL_MEMBER__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE_SUBSYSTEM__DESCRIPTION = TOP_LEVEL_MODEL_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE_SUBSYSTEM__DOCS = TOP_LEVEL_MODEL_MEMBER__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE_SUBSYSTEM__STEREOTYPE = TOP_LEVEL_MODEL_MEMBER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE_SUBSYSTEM__NAME = TOP_LEVEL_MODEL_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Usecases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE_SUBSYSTEM__USECASES = TOP_LEVEL_MODEL_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Usecase Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE_SUBSYSTEM_FEATURE_COUNT = TOP_LEVEL_MODEL_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.UsecaseClassifierImpl <em>Usecase Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.UsecaseClassifierImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getUsecaseClassifier()
	 * @generated
	 */
	int USECASE_CLASSIFIER = 34;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE_CLASSIFIER__TAGGED_VALUE = OOP_CLASSIFIER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE_CLASSIFIER__LABEL = OOP_CLASSIFIER__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE_CLASSIFIER__DESCRIPTION = OOP_CLASSIFIER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE_CLASSIFIER__DOCS = OOP_CLASSIFIER__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE_CLASSIFIER__STEREOTYPE = OOP_CLASSIFIER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE_CLASSIFIER__OPERATIONS = OOP_CLASSIFIER__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE_CLASSIFIER__NAME = OOP_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE_CLASSIFIER__ATTRIBUTES = OOP_CLASSIFIER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Is External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE_CLASSIFIER__IS_EXTERNAL = OOP_CLASSIFIER__IS_EXTERNAL;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE_CLASSIFIER__IS_ABSTRACT = OOP_CLASSIFIER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE_CLASSIFIER__VISIBILITY = OOP_CLASSIFIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>External Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE_CLASSIFIER__EXTERNAL_EXTENDS = OOP_CLASSIFIER__EXTERNAL_EXTENDS;

	/**
	 * The feature id for the '<em><b>External Implements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE_CLASSIFIER__EXTERNAL_IMPLEMENTS = OOP_CLASSIFIER__EXTERNAL_IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Inner</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE_CLASSIFIER__INNER = OOP_CLASSIFIER__INNER;

	/**
	 * The number of structural features of the '<em>Usecase Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE_CLASSIFIER_FEATURE_COUNT = OOP_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.UsecaseImpl <em>Usecase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.UsecaseImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getUsecase()
	 * @generated
	 */
	int USECASE = 35;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE__TAGGED_VALUE = USECASE_CLASSIFIER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE__LABEL = USECASE_CLASSIFIER__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE__DESCRIPTION = USECASE_CLASSIFIER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE__DOCS = USECASE_CLASSIFIER__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE__STEREOTYPE = USECASE_CLASSIFIER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE__OPERATIONS = USECASE_CLASSIFIER__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE__NAME = USECASE_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE__ATTRIBUTES = USECASE_CLASSIFIER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Is External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE__IS_EXTERNAL = USECASE_CLASSIFIER__IS_EXTERNAL;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE__IS_ABSTRACT = USECASE_CLASSIFIER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE__VISIBILITY = USECASE_CLASSIFIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>External Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE__EXTERNAL_EXTENDS = USECASE_CLASSIFIER__EXTERNAL_EXTENDS;

	/**
	 * The feature id for the '<em><b>External Implements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE__EXTERNAL_IMPLEMENTS = USECASE_CLASSIFIER__EXTERNAL_IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Inner</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE__INNER = USECASE_CLASSIFIER__INNER;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE__TEXT = USECASE_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Usecase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASE_FEATURE_COUNT = USECASE_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.ActorImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 36;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__TAGGED_VALUE = USECASE_CLASSIFIER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__LABEL = USECASE_CLASSIFIER__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DESCRIPTION = USECASE_CLASSIFIER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DOCS = USECASE_CLASSIFIER__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__STEREOTYPE = USECASE_CLASSIFIER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OPERATIONS = USECASE_CLASSIFIER__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = USECASE_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ATTRIBUTES = USECASE_CLASSIFIER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Is External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__IS_EXTERNAL = USECASE_CLASSIFIER__IS_EXTERNAL;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__IS_ABSTRACT = USECASE_CLASSIFIER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__VISIBILITY = USECASE_CLASSIFIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>External Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__EXTERNAL_EXTENDS = USECASE_CLASSIFIER__EXTERNAL_EXTENDS;

	/**
	 * The feature id for the '<em><b>External Implements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__EXTERNAL_IMPLEMENTS = USECASE_CLASSIFIER__EXTERNAL_IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Inner</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__INNER = USECASE_CLASSIFIER__INNER;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = USECASE_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.AreaImpl <em>Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.AreaImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getArea()
	 * @generated
	 */
	int AREA = 37;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__TAGGED_VALUE = CONTROLLER_MEMBER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__LABEL = CONTROLLER_MEMBER__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__DESCRIPTION = CONTROLLER_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__DOCS = CONTROLLER_MEMBER__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__STEREOTYPE = CONTROLLER_MEMBER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Usecases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__USECASES = CONTROLLER_MEMBER__USECASES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__NAME = CONTROLLER_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__VIEWS = CONTROLLER_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__STYLE = CONTROLLER_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_FEATURE_COUNT = CONTROLLER_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.WidgetElementImpl <em>Widget Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.WidgetElementImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getWidgetElement()
	 * @generated
	 */
	int WIDGET_ELEMENT = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ELEMENT__OPTIONS = 1;

	/**
	 * The feature id for the '<em><b>Multi Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ELEMENT__MULTI_OPTIONS = 2;

	/**
	 * The number of structural features of the '<em>Widget Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.WidgetOptionImpl <em>Widget Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.WidgetOptionImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getWidgetOption()
	 * @generated
	 */
	int WIDGET_OPTION = 40;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OPTION__TAGGED_VALUE = MODEL_MEMBER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OPTION__LABEL = MODEL_MEMBER__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OPTION__DESCRIPTION = MODEL_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OPTION__DOCS = MODEL_MEMBER__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OPTION__STEREOTYPE = MODEL_MEMBER__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OPTION__NAME = MODEL_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OPTION__VALUE = MODEL_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Widget Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_OPTION_FEATURE_COUNT = MODEL_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.FormImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getForm()
	 * @generated
	 */
	int FORM = 42;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__WIDGETS = 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__NAME = 2;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.WidgetAttributeImpl <em>Widget Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.WidgetAttributeImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getWidgetAttribute()
	 * @generated
	 */
	int WIDGET_ATTRIBUTE = 43;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ATTRIBUTE__TAGGED_VALUE = WIDGET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ATTRIBUTE__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ATTRIBUTE__DESCRIPTION = WIDGET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ATTRIBUTE__DOCS = WIDGET__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ATTRIBUTE__STEREOTYPE = WIDGET__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ATTRIBUTE__WIDGET_TYPE = WIDGET__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ATTRIBUTE__WIDGET_HINT = WIDGET__WIDGET_HINT;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ATTRIBUTE__READ_ONLY = WIDGET__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ATTRIBUTE__REQUIRED = WIDGET__REQUIRED;

	/**
	 * The feature id for the '<em><b>Ignore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ATTRIBUTE__IGNORE = WIDGET__IGNORE;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ATTRIBUTE__FILTERS = WIDGET__FILTERS;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ATTRIBUTE__VALIDATORS = WIDGET__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ATTRIBUTE__OPTIONS = WIDGET__OPTIONS;

	/**
	 * The feature id for the '<em><b>Menu Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ATTRIBUTE__MENU_ACTIONS = WIDGET__MENU_ACTIONS;

	/**
	 * The feature id for the '<em><b>Element Form Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ATTRIBUTE__ELEMENT_FORM_NAME = WIDGET__ELEMENT_FORM_NAME;

	/**
	 * The feature id for the '<em><b>Multi Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ATTRIBUTE__MULTI_LINE = WIDGET__MULTI_LINE;

	/**
	 * The feature id for the '<em><b>Multi Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ATTRIBUTE__MULTI_CHOICE = WIDGET__MULTI_CHOICE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ATTRIBUTE__ATTRIBUTE = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Widget Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ATTRIBUTE_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.impl.WidgetAssociationImpl <em>Widget Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.impl.WidgetAssociationImpl
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getWidgetAssociation()
	 * @generated
	 */
	int WIDGET_ASSOCIATION = 44;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ASSOCIATION__TAGGED_VALUE = WIDGET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ASSOCIATION__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ASSOCIATION__DESCRIPTION = WIDGET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Docs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ASSOCIATION__DOCS = WIDGET__DOCS;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ASSOCIATION__STEREOTYPE = WIDGET__STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Widget Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ASSOCIATION__WIDGET_TYPE = WIDGET__WIDGET_TYPE;

	/**
	 * The feature id for the '<em><b>Widget Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ASSOCIATION__WIDGET_HINT = WIDGET__WIDGET_HINT;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ASSOCIATION__READ_ONLY = WIDGET__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ASSOCIATION__REQUIRED = WIDGET__REQUIRED;

	/**
	 * The feature id for the '<em><b>Ignore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ASSOCIATION__IGNORE = WIDGET__IGNORE;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ASSOCIATION__FILTERS = WIDGET__FILTERS;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ASSOCIATION__VALIDATORS = WIDGET__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ASSOCIATION__OPTIONS = WIDGET__OPTIONS;

	/**
	 * The feature id for the '<em><b>Menu Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ASSOCIATION__MENU_ACTIONS = WIDGET__MENU_ACTIONS;

	/**
	 * The feature id for the '<em><b>Element Form Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ASSOCIATION__ELEMENT_FORM_NAME = WIDGET__ELEMENT_FORM_NAME;

	/**
	 * The feature id for the '<em><b>Multi Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ASSOCIATION__MULTI_LINE = WIDGET__MULTI_LINE;

	/**
	 * The feature id for the '<em><b>Multi Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ASSOCIATION__MULTI_CHOICE = WIDGET__MULTI_CHOICE;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ASSOCIATION__ASSOCIATION = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements Menu Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ASSOCIATION__ELEMENTS_MENU_ACTIONS = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Widget Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ASSOCIATION_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.EnumAjaxModes <em>Enum Ajax Modes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.EnumAjaxModes
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getEnumAjaxModes()
	 * @generated
	 */
	int ENUM_AJAX_MODES = 45;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.EnumMultiplicity <em>Enum Multiplicity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.EnumMultiplicity
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getEnumMultiplicity()
	 * @generated
	 */
	int ENUM_MULTIPLICITY = 46;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.EnumVisibility <em>Enum Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.EnumVisibility
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getEnumVisibility()
	 * @generated
	 */
	int ENUM_VISIBILITY = 47;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.EnumDocumentationAudienceType <em>Enum Documentation Audience Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.EnumDocumentationAudienceType
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getEnumDocumentationAudienceType()
	 * @generated
	 */
	int ENUM_DOCUMENTATION_AUDIENCE_TYPE = 48;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.EnumTargetModes <em>Enum Target Modes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.EnumTargetModes
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getEnumTargetModes()
	 * @generated
	 */
	int ENUM_TARGET_MODES = 49;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.EnumDirection <em>Enum Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.EnumDirection
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getEnumDirection()
	 * @generated
	 */
	int ENUM_DIRECTION = 50;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.EnumDisplayMode <em>Enum Display Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.EnumDisplayMode
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getEnumDisplayMode()
	 * @generated
	 */
	int ENUM_DISPLAY_MODE = 51;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.EnumWidgetType <em>Enum Widget Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.EnumWidgetType
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getEnumWidgetType()
	 * @generated
	 */
	int ENUM_WIDGET_TYPE = 52;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.EnumProjectLayout <em>Enum Project Layout</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.EnumProjectLayout
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getEnumProjectLayout()
	 * @generated
	 */
	int ENUM_PROJECT_LAYOUT = 53;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.EnumLabelMode <em>Enum Label Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.EnumLabelMode
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getEnumLabelMode()
	 * @generated
	 */
	int ENUM_LABEL_MODE = 54;

	/**
	 * The meta object id for the '{@link de.gulden.modeling.wave.EnumGeneratorTarget <em>Enum Generator Target</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gulden.modeling.wave.EnumGeneratorTarget
	 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getEnumGeneratorTarget()
	 * @generated
	 */
	int ENUM_GENERATOR_TARGET = 55;


	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see de.gulden.modeling.wave.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gulden.modeling.wave.Classifier#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see de.gulden.modeling.wave.Classifier#getOperations()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Operations();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Classifier#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.gulden.modeling.wave.Classifier#getName()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gulden.modeling.wave.Classifier#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see de.gulden.modeling.wave.Classifier#getAttributes()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Classifier#isIsExternal <em>Is External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is External</em>'.
	 * @see de.gulden.modeling.wave.Classifier#isIsExternal()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_IsExternal();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see de.gulden.modeling.wave.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gulden.modeling.wave.Controller#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see de.gulden.modeling.wave.Controller#getActions()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gulden.modeling.wave.Controller#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see de.gulden.modeling.wave.Controller#getViews()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Views();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gulden.modeling.wave.Controller#getTransitionsActionToView <em>Transitions Action To View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions Action To View</em>'.
	 * @see de.gulden.modeling.wave.Controller#getTransitionsActionToView()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_TransitionsActionToView();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gulden.modeling.wave.Controller#getTransitionsView <em>Transitions View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions View</em>'.
	 * @see de.gulden.modeling.wave.Controller#getTransitionsView()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_TransitionsView();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.AssociationRelationship <em>Association Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Relationship</em>'.
	 * @see de.gulden.modeling.wave.AssociationRelationship
	 * @generated
	 */
	EClass getAssociationRelationship();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.AssociationRelationship#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.gulden.modeling.wave.AssociationRelationship#getName()
	 * @see #getAssociationRelationship()
	 * @generated
	 */
	EAttribute getAssociationRelationship_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.AssociationRelationship#getMultiplicityA <em>Multiplicity A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity A</em>'.
	 * @see de.gulden.modeling.wave.AssociationRelationship#getMultiplicityA()
	 * @see #getAssociationRelationship()
	 * @generated
	 */
	EAttribute getAssociationRelationship_MultiplicityA();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.AssociationRelationship#getMultiplicityB <em>Multiplicity B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity B</em>'.
	 * @see de.gulden.modeling.wave.AssociationRelationship#getMultiplicityB()
	 * @see #getAssociationRelationship()
	 * @generated
	 */
	EAttribute getAssociationRelationship_MultiplicityB();

	/**
	 * Returns the meta object for the reference '{@link de.gulden.modeling.wave.AssociationRelationship#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>A</em>'.
	 * @see de.gulden.modeling.wave.AssociationRelationship#getA()
	 * @see #getAssociationRelationship()
	 * @generated
	 */
	EReference getAssociationRelationship_A();

	/**
	 * Returns the meta object for the reference '{@link de.gulden.modeling.wave.AssociationRelationship#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>B</em>'.
	 * @see de.gulden.modeling.wave.AssociationRelationship#getB()
	 * @see #getAssociationRelationship()
	 * @generated
	 */
	EReference getAssociationRelationship_B();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.AssociationRelationship#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see de.gulden.modeling.wave.AssociationRelationship#getDirection()
	 * @see #getAssociationRelationship()
	 * @generated
	 */
	EAttribute getAssociationRelationship_Direction();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see de.gulden.modeling.wave.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Operation#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see de.gulden.modeling.wave.Operation#getReturnType()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Operation#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see de.gulden.modeling.wave.Operation#isIsAbstract()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Operation#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see de.gulden.modeling.wave.Operation#getCode()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Code();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Operation#getThrows <em>Throws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throws</em>'.
	 * @see de.gulden.modeling.wave.Operation#getThrows()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Throws();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gulden.modeling.wave.Operation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see de.gulden.modeling.wave.Operation#getParameters()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Parameters();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see de.gulden.modeling.wave.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Action#getAjaxMode <em>Ajax Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ajax Mode</em>'.
	 * @see de.gulden.modeling.wave.Action#getAjaxMode()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_AjaxMode();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Action#getAjaxTarget <em>Ajax Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ajax Target</em>'.
	 * @see de.gulden.modeling.wave.Action#getAjaxTarget()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_AjaxTarget();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Action#isConfirmExecute <em>Confirm Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirm Execute</em>'.
	 * @see de.gulden.modeling.wave.Action#isConfirmExecute()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_ConfirmExecute();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see de.gulden.modeling.wave.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gulden.modeling.wave.View#getAreas <em>Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Areas</em>'.
	 * @see de.gulden.modeling.wave.View#getAreas()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Areas();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see de.gulden.modeling.wave.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.gulden.modeling.wave.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Attribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see de.gulden.modeling.wave.Attribute#getDefaultValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Attribute#isIsMultiple <em>Is Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Multiple</em>'.
	 * @see de.gulden.modeling.wave.Attribute#isIsMultiple()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsMultiple();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.InheritanceRelationship <em>Inheritance Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inheritance Relationship</em>'.
	 * @see de.gulden.modeling.wave.InheritanceRelationship
	 * @generated
	 */
	EClass getInheritanceRelationship();

	/**
	 * Returns the meta object for the reference '{@link de.gulden.modeling.wave.InheritanceRelationship#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see de.gulden.modeling.wave.InheritanceRelationship#getParent()
	 * @see #getInheritanceRelationship()
	 * @generated
	 */
	EReference getInheritanceRelationship_Parent();

	/**
	 * Returns the meta object for the reference '{@link de.gulden.modeling.wave.InheritanceRelationship#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child</em>'.
	 * @see de.gulden.modeling.wave.InheritanceRelationship#getChild()
	 * @see #getInheritanceRelationship()
	 * @generated
	 */
	EReference getInheritanceRelationship_Child();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.RealizationRelationship <em>Realization Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realization Relationship</em>'.
	 * @see de.gulden.modeling.wave.RealizationRelationship
	 * @generated
	 */
	EClass getRealizationRelationship();

	/**
	 * Returns the meta object for the reference '{@link de.gulden.modeling.wave.RealizationRelationship#getParentInterface <em>Parent Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Interface</em>'.
	 * @see de.gulden.modeling.wave.RealizationRelationship#getParentInterface()
	 * @see #getRealizationRelationship()
	 * @generated
	 */
	EReference getRealizationRelationship_ParentInterface();

	/**
	 * Returns the meta object for the reference '{@link de.gulden.modeling.wave.RealizationRelationship#getImplementingClass <em>Implementing Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementing Class</em>'.
	 * @see de.gulden.modeling.wave.RealizationRelationship#getImplementingClass()
	 * @see #getRealizationRelationship()
	 * @generated
	 */
	EReference getRealizationRelationship_ImplementingClass();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see de.gulden.modeling.wave.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Model#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see de.gulden.modeling.wave.Model#getAuthor()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Author();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Model#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.gulden.modeling.wave.Model#getVersion()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Version();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Model#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see de.gulden.modeling.wave.Model#getBasePackage()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_BasePackage();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Model#getSourceFolder <em>Source Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Folder</em>'.
	 * @see de.gulden.modeling.wave.Model#getSourceFolder()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_SourceFolder();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Model#getGeneratorTarget <em>Generator Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator Target</em>'.
	 * @see de.gulden.modeling.wave.Model#getGeneratorTarget()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_GeneratorTarget();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Model#getCopyright <em>Copyright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copyright</em>'.
	 * @see de.gulden.modeling.wave.Model#getCopyright()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Copyright();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Model#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see de.gulden.modeling.wave.Model#getProvider()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Provider();

	/**
	 * Returns the meta object for the containment reference '{@link de.gulden.modeling.wave.Model#getDictionary <em>Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dictionary</em>'.
	 * @see de.gulden.modeling.wave.Model#getDictionary()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Dictionary();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gulden.modeling.wave.Model#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see de.gulden.modeling.wave.Model#getDocumentation()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Model#getFactoryClass <em>Factory Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factory Class</em>'.
	 * @see de.gulden.modeling.wave.Model#getFactoryClass()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_FactoryClass();

	/**
	 * Returns the meta object for the reference '{@link de.gulden.modeling.wave.Model#getLayoutTemplate <em>Layout Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout Template</em>'.
	 * @see de.gulden.modeling.wave.Model#getLayoutTemplate()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_LayoutTemplate();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Model#getBaseUrl <em>Base Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Url</em>'.
	 * @see de.gulden.modeling.wave.Model#getBaseUrl()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_BaseUrl();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Model#getIconPrefix <em>Icon Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon Prefix</em>'.
	 * @see de.gulden.modeling.wave.Model#getIconPrefix()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_IconPrefix();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Model#getTestdataSQL <em>Testdata SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testdata SQL</em>'.
	 * @see de.gulden.modeling.wave.Model#getTestdataSQL()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_TestdataSQL();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Model#getProjectLayout <em>Project Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Layout</em>'.
	 * @see de.gulden.modeling.wave.Model#getProjectLayout()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_ProjectLayout();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.ModelMember <em>Model Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Member</em>'.
	 * @see de.gulden.modeling.wave.ModelMember
	 * @generated
	 */
	EClass getModelMember();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gulden.modeling.wave.ModelMember#getTaggedValue <em>Tagged Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tagged Value</em>'.
	 * @see de.gulden.modeling.wave.ModelMember#getTaggedValue()
	 * @see #getModelMember()
	 * @generated
	 */
	EReference getModelMember_TaggedValue();

	/**
	 * Returns the meta object for the reference '{@link de.gulden.modeling.wave.ModelMember#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Label</em>'.
	 * @see de.gulden.modeling.wave.ModelMember#getLabel()
	 * @see #getModelMember()
	 * @generated
	 */
	EReference getModelMember_Label();

	/**
	 * Returns the meta object for the reference '{@link de.gulden.modeling.wave.ModelMember#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Description</em>'.
	 * @see de.gulden.modeling.wave.ModelMember#getDescription()
	 * @see #getModelMember()
	 * @generated
	 */
	EReference getModelMember_Description();

	/**
	 * Returns the meta object for the reference list '{@link de.gulden.modeling.wave.ModelMember#getDocs <em>Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Docs</em>'.
	 * @see de.gulden.modeling.wave.ModelMember#getDocs()
	 * @see #getModelMember()
	 * @generated
	 */
	EReference getModelMember_Docs();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.ModelMember#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see de.gulden.modeling.wave.ModelMember#getStereotype()
	 * @see #getModelMember()
	 * @generated
	 */
	EAttribute getModelMember_Stereotype();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see de.gulden.modeling.wave.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Package#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.gulden.modeling.wave.Package#getName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gulden.modeling.wave.Package#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see de.gulden.modeling.wave.Package#getMembers()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Members();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.DependencyRelationship <em>Dependency Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Relationship</em>'.
	 * @see de.gulden.modeling.wave.DependencyRelationship
	 * @generated
	 */
	EClass getDependencyRelationship();

	/**
	 * Returns the meta object for the reference '{@link de.gulden.modeling.wave.DependencyRelationship#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client</em>'.
	 * @see de.gulden.modeling.wave.DependencyRelationship#getClient()
	 * @see #getDependencyRelationship()
	 * @generated
	 */
	EReference getDependencyRelationship_Client();

	/**
	 * Returns the meta object for the reference '{@link de.gulden.modeling.wave.DependencyRelationship#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supplier</em>'.
	 * @see de.gulden.modeling.wave.DependencyRelationship#getSupplier()
	 * @see #getDependencyRelationship()
	 * @generated
	 */
	EReference getDependencyRelationship_Supplier();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see de.gulden.modeling.wave.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Class#isIsPersistent <em>Is Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Persistent</em>'.
	 * @see de.gulden.modeling.wave.Class#isIsPersistent()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_IsPersistent();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Class#getTargetMode <em>Target Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Mode</em>'.
	 * @see de.gulden.modeling.wave.Class#getTargetMode()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_TargetMode();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gulden.modeling.wave.Class#getForms <em>Forms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forms</em>'.
	 * @see de.gulden.modeling.wave.Class#getForms()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Forms();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see de.gulden.modeling.wave.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Interface#getTargetMode <em>Target Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Mode</em>'.
	 * @see de.gulden.modeling.wave.Interface#getTargetMode()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_TargetMode();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.TopLevelModelMember <em>Top Level Model Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top Level Model Member</em>'.
	 * @see de.gulden.modeling.wave.TopLevelModelMember
	 * @generated
	 */
	EClass getTopLevelModelMember();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.ActionToViewTransition <em>Action To View Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action To View Transition</em>'.
	 * @see de.gulden.modeling.wave.ActionToViewTransition
	 * @generated
	 */
	EClass getActionToViewTransition();

	/**
	 * Returns the meta object for the reference '{@link de.gulden.modeling.wave.ActionToViewTransition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.gulden.modeling.wave.ActionToViewTransition#getTarget()
	 * @see #getActionToViewTransition()
	 * @generated
	 */
	EReference getActionToViewTransition_Target();

	/**
	 * Returns the meta object for the reference '{@link de.gulden.modeling.wave.ActionToViewTransition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.gulden.modeling.wave.ActionToViewTransition#getSource()
	 * @see #getActionToViewTransition()
	 * @generated
	 */
	EReference getActionToViewTransition_Source();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.TaggedValue <em>Tagged Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tagged Value</em>'.
	 * @see de.gulden.modeling.wave.TaggedValue
	 * @generated
	 */
	EClass getTaggedValue();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.TaggedValue#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see de.gulden.modeling.wave.TaggedValue#getKey()
	 * @see #getTaggedValue()
	 * @generated
	 */
	EAttribute getTaggedValue_Key();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.TaggedValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.gulden.modeling.wave.TaggedValue#getValue()
	 * @see #getTaggedValue()
	 * @generated
	 */
	EAttribute getTaggedValue_Value();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation</em>'.
	 * @see de.gulden.modeling.wave.Documentation
	 * @generated
	 */
	EClass getDocumentation();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Documentation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.gulden.modeling.wave.Documentation#getText()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Text();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Documentation#getAudience <em>Audience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Audience</em>'.
	 * @see de.gulden.modeling.wave.Documentation#getAudience()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Audience();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Documentation#getDetailLevel <em>Detail Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detail Level</em>'.
	 * @see de.gulden.modeling.wave.Documentation#getDetailLevel()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_DetailLevel();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.OOPClassifier <em>OOP Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OOP Classifier</em>'.
	 * @see de.gulden.modeling.wave.OOPClassifier
	 * @generated
	 */
	EClass getOOPClassifier();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.OOPClassifier#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see de.gulden.modeling.wave.OOPClassifier#isIsAbstract()
	 * @see #getOOPClassifier()
	 * @generated
	 */
	EAttribute getOOPClassifier_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.OOPClassifier#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see de.gulden.modeling.wave.OOPClassifier#getVisibility()
	 * @see #getOOPClassifier()
	 * @generated
	 */
	EAttribute getOOPClassifier_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.OOPClassifier#getExternalExtends <em>External Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Extends</em>'.
	 * @see de.gulden.modeling.wave.OOPClassifier#getExternalExtends()
	 * @see #getOOPClassifier()
	 * @generated
	 */
	EAttribute getOOPClassifier_ExternalExtends();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.OOPClassifier#getExternalImplements <em>External Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Implements</em>'.
	 * @see de.gulden.modeling.wave.OOPClassifier#getExternalImplements()
	 * @see #getOOPClassifier()
	 * @generated
	 */
	EAttribute getOOPClassifier_ExternalImplements();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gulden.modeling.wave.OOPClassifier#getInner <em>Inner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inner</em>'.
	 * @see de.gulden.modeling.wave.OOPClassifier#getInner()
	 * @see #getOOPClassifier()
	 * @generated
	 */
	EReference getOOPClassifier_Inner();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.ClassifierMember <em>Classifier Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier Member</em>'.
	 * @see de.gulden.modeling.wave.ClassifierMember
	 * @generated
	 */
	EClass getClassifierMember();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.ClassifierMember#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see de.gulden.modeling.wave.ClassifierMember#getSignature()
	 * @see #getClassifierMember()
	 * @generated
	 */
	EAttribute getClassifierMember_Signature();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.ClassifierMember#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.gulden.modeling.wave.ClassifierMember#getName()
	 * @see #getClassifierMember()
	 * @generated
	 */
	EAttribute getClassifierMember_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.ClassifierMember#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see de.gulden.modeling.wave.ClassifierMember#getVisibility()
	 * @see #getClassifierMember()
	 * @generated
	 */
	EAttribute getClassifierMember_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.ClassifierMember#isIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see de.gulden.modeling.wave.ClassifierMember#isIsStatic()
	 * @see #getClassifierMember()
	 * @generated
	 */
	EAttribute getClassifierMember_IsStatic();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.ClassifierMember#isIsFinal <em>Is Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Final</em>'.
	 * @see de.gulden.modeling.wave.ClassifierMember#isIsFinal()
	 * @see #getClassifierMember()
	 * @generated
	 */
	EAttribute getClassifierMember_IsFinal();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.ClassifierMember#getTargetMode <em>Target Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Mode</em>'.
	 * @see de.gulden.modeling.wave.ClassifierMember#getTargetMode()
	 * @see #getClassifierMember()
	 * @generated
	 */
	EAttribute getClassifierMember_TargetMode();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.ArtifactClassifier <em>Artifact Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact Classifier</em>'.
	 * @see de.gulden.modeling.wave.ArtifactClassifier
	 * @generated
	 */
	EClass getArtifactClassifier();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.Include <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Include</em>'.
	 * @see de.gulden.modeling.wave.Include
	 * @generated
	 */
	EClass getInclude();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Include#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see de.gulden.modeling.wave.Include#getCode()
	 * @see #getInclude()
	 * @generated
	 */
	EAttribute getInclude_Code();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Include#getUrlPath <em>Url Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url Path</em>'.
	 * @see de.gulden.modeling.wave.Include#getUrlPath()
	 * @see #getInclude()
	 * @generated
	 */
	EAttribute getInclude_UrlPath();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.StyleSheet <em>Style Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Sheet</em>'.
	 * @see de.gulden.modeling.wave.StyleSheet
	 * @generated
	 */
	EClass getStyleSheet();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.StyleSheet#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see de.gulden.modeling.wave.StyleSheet#getCode()
	 * @see #getStyleSheet()
	 * @generated
	 */
	EAttribute getStyleSheet_Code();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.ViewTransition <em>View Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Transition</em>'.
	 * @see de.gulden.modeling.wave.ViewTransition
	 * @generated
	 */
	EClass getViewTransition();

	/**
	 * Returns the meta object for the reference '{@link de.gulden.modeling.wave.ViewTransition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.gulden.modeling.wave.ViewTransition#getSource()
	 * @see #getViewTransition()
	 * @generated
	 */
	EReference getViewTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link de.gulden.modeling.wave.ViewTransition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.gulden.modeling.wave.ViewTransition#getTarget()
	 * @see #getViewTransition()
	 * @generated
	 */
	EReference getViewTransition_Target();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.ControllerMember <em>Controller Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller Member</em>'.
	 * @see de.gulden.modeling.wave.ControllerMember
	 * @generated
	 */
	EClass getControllerMember();

	/**
	 * Returns the meta object for the reference list '{@link de.gulden.modeling.wave.ControllerMember#getUsecases <em>Usecases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usecases</em>'.
	 * @see de.gulden.modeling.wave.ControllerMember#getUsecases()
	 * @see #getControllerMember()
	 * @generated
	 */
	EReference getControllerMember_Usecases();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.ControllerMember#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.gulden.modeling.wave.ControllerMember#getName()
	 * @see #getControllerMember()
	 * @generated
	 */
	EAttribute getControllerMember_Name();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see de.gulden.modeling.wave.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gulden.modeling.wave.Enumeration#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see de.gulden.modeling.wave.Enumeration#getLiterals()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Literals();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Literal</em>'.
	 * @see de.gulden.modeling.wave.EnumerationLiteral
	 * @generated
	 */
	EClass getEnumerationLiteral();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.EnumerationLiteral#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.gulden.modeling.wave.EnumerationLiteral#getName()
	 * @see #getEnumerationLiteral()
	 * @generated
	 */
	EAttribute getEnumerationLiteral_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.EnumerationLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.gulden.modeling.wave.EnumerationLiteral#getValue()
	 * @see #getEnumerationLiteral()
	 * @generated
	 */
	EAttribute getEnumerationLiteral_Value();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.Dictionary <em>Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dictionary</em>'.
	 * @see de.gulden.modeling.wave.Dictionary
	 * @generated
	 */
	EClass getDictionary();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gulden.modeling.wave.Dictionary#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see de.gulden.modeling.wave.Dictionary#getLabel()
	 * @see #getDictionary()
	 * @generated
	 */
	EReference getDictionary_Label();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Dictionary#getDefaultLang <em>Default Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Lang</em>'.
	 * @see de.gulden.modeling.wave.Dictionary#getDefaultLang()
	 * @see #getDictionary()
	 * @generated
	 */
	EAttribute getDictionary_DefaultLang();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see de.gulden.modeling.wave.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Label#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.gulden.modeling.wave.Label#getText()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gulden.modeling.wave.Label#getLangstring <em>Langstring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Langstring</em>'.
	 * @see de.gulden.modeling.wave.Label#getLangstring()
	 * @see #getLabel()
	 * @generated
	 */
	EReference getLabel_Langstring();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Label#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see de.gulden.modeling.wave.Label#getIcon()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Icon();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Label#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see de.gulden.modeling.wave.Label#getMode()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Mode();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.Langstring <em>Langstring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Langstring</em>'.
	 * @see de.gulden.modeling.wave.Langstring
	 * @generated
	 */
	EClass getLangstring();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Langstring#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see de.gulden.modeling.wave.Langstring#getLang()
	 * @see #getLangstring()
	 * @generated
	 */
	EAttribute getLangstring_Lang();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Langstring#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.gulden.modeling.wave.Langstring#getText()
	 * @see #getLangstring()
	 * @generated
	 */
	EAttribute getLangstring_Text();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.DatabaseTable <em>Database Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Table</em>'.
	 * @see de.gulden.modeling.wave.DatabaseTable
	 * @generated
	 */
	EClass getDatabaseTable();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.DatabaseTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.gulden.modeling.wave.DatabaseTable#getName()
	 * @see #getDatabaseTable()
	 * @generated
	 */
	EAttribute getDatabaseTable_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.DatabaseTable#getSqlCreate <em>Sql Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sql Create</em>'.
	 * @see de.gulden.modeling.wave.DatabaseTable#getSqlCreate()
	 * @see #getDatabaseTable()
	 * @generated
	 */
	EAttribute getDatabaseTable_SqlCreate();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget</em>'.
	 * @see de.gulden.modeling.wave.Widget
	 * @generated
	 */
	EClass getWidget();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Widget#getWidgetType <em>Widget Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Widget Type</em>'.
	 * @see de.gulden.modeling.wave.Widget#getWidgetType()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_WidgetType();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Widget#getWidgetHint <em>Widget Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Widget Hint</em>'.
	 * @see de.gulden.modeling.wave.Widget#getWidgetHint()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_WidgetHint();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Widget#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see de.gulden.modeling.wave.Widget#isReadOnly()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_ReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Widget#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see de.gulden.modeling.wave.Widget#isRequired()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Required();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Widget#isIgnore <em>Ignore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore</em>'.
	 * @see de.gulden.modeling.wave.Widget#isIgnore()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Ignore();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gulden.modeling.wave.Widget#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filters</em>'.
	 * @see de.gulden.modeling.wave.Widget#getFilters()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Filters();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gulden.modeling.wave.Widget#getValidators <em>Validators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validators</em>'.
	 * @see de.gulden.modeling.wave.Widget#getValidators()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Validators();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gulden.modeling.wave.Widget#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see de.gulden.modeling.wave.Widget#getOptions()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Options();

	/**
	 * Returns the meta object for the reference list '{@link de.gulden.modeling.wave.Widget#getMenuActions <em>Menu Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Menu Actions</em>'.
	 * @see de.gulden.modeling.wave.Widget#getMenuActions()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_MenuActions();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Widget#getElementFormName <em>Element Form Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Form Name</em>'.
	 * @see de.gulden.modeling.wave.Widget#getElementFormName()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_ElementFormName();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Widget#isMultiLine <em>Multi Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Line</em>'.
	 * @see de.gulden.modeling.wave.Widget#isMultiLine()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_MultiLine();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Widget#isMultiChoice <em>Multi Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Choice</em>'.
	 * @see de.gulden.modeling.wave.Widget#isMultiChoice()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_MultiChoice();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.UsecaseSubsystem <em>Usecase Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usecase Subsystem</em>'.
	 * @see de.gulden.modeling.wave.UsecaseSubsystem
	 * @generated
	 */
	EClass getUsecaseSubsystem();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.UsecaseSubsystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.gulden.modeling.wave.UsecaseSubsystem#getName()
	 * @see #getUsecaseSubsystem()
	 * @generated
	 */
	EAttribute getUsecaseSubsystem_Name();

	/**
	 * Returns the meta object for the reference list '{@link de.gulden.modeling.wave.UsecaseSubsystem#getUsecases <em>Usecases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usecases</em>'.
	 * @see de.gulden.modeling.wave.UsecaseSubsystem#getUsecases()
	 * @see #getUsecaseSubsystem()
	 * @generated
	 */
	EReference getUsecaseSubsystem_Usecases();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.UsecaseClassifier <em>Usecase Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usecase Classifier</em>'.
	 * @see de.gulden.modeling.wave.UsecaseClassifier
	 * @generated
	 */
	EClass getUsecaseClassifier();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.Usecase <em>Usecase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usecase</em>'.
	 * @see de.gulden.modeling.wave.Usecase
	 * @generated
	 */
	EClass getUsecase();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Usecase#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.gulden.modeling.wave.Usecase#getText()
	 * @see #getUsecase()
	 * @generated
	 */
	EAttribute getUsecase_Text();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see de.gulden.modeling.wave.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area</em>'.
	 * @see de.gulden.modeling.wave.Area
	 * @generated
	 */
	EClass getArea();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gulden.modeling.wave.Area#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see de.gulden.modeling.wave.Area#getViews()
	 * @see #getArea()
	 * @generated
	 */
	EReference getArea_Views();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Area#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see de.gulden.modeling.wave.Area#getStyle()
	 * @see #getArea()
	 * @generated
	 */
	EAttribute getArea_Style();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.ControllerMemberExecutable <em>Controller Member Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller Member Executable</em>'.
	 * @see de.gulden.modeling.wave.ControllerMemberExecutable
	 * @generated
	 */
	EClass getControllerMemberExecutable();

	/**
	 * Returns the meta object for the containment reference '{@link de.gulden.modeling.wave.ControllerMemberExecutable#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see de.gulden.modeling.wave.ControllerMemberExecutable#getOperation()
	 * @see #getControllerMemberExecutable()
	 * @generated
	 */
	EReference getControllerMemberExecutable_Operation();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.WidgetElement <em>Widget Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Element</em>'.
	 * @see de.gulden.modeling.wave.WidgetElement
	 * @generated
	 */
	EClass getWidgetElement();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.WidgetElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.gulden.modeling.wave.WidgetElement#getName()
	 * @see #getWidgetElement()
	 * @generated
	 */
	EAttribute getWidgetElement_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gulden.modeling.wave.WidgetElement#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see de.gulden.modeling.wave.WidgetElement#getOptions()
	 * @see #getWidgetElement()
	 * @generated
	 */
	EReference getWidgetElement_Options();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gulden.modeling.wave.WidgetElement#getMultiOptions <em>Multi Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multi Options</em>'.
	 * @see de.gulden.modeling.wave.WidgetElement#getMultiOptions()
	 * @see #getWidgetElement()
	 * @generated
	 */
	EReference getWidgetElement_MultiOptions();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.WidgetOption <em>Widget Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Option</em>'.
	 * @see de.gulden.modeling.wave.WidgetOption
	 * @generated
	 */
	EClass getWidgetOption();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.WidgetOption#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.gulden.modeling.wave.WidgetOption#getName()
	 * @see #getWidgetOption()
	 * @generated
	 */
	EAttribute getWidgetOption_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.WidgetOption#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.gulden.modeling.wave.WidgetOption#getValue()
	 * @see #getWidgetOption()
	 * @generated
	 */
	EAttribute getWidgetOption_Value();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see de.gulden.modeling.wave.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.gulden.modeling.wave.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Transition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see de.gulden.modeling.wave.Transition#getCondition()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Condition();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see de.gulden.modeling.wave.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gulden.modeling.wave.Form#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widgets</em>'.
	 * @see de.gulden.modeling.wave.Form#getWidgets()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Widgets();

	/**
	 * Returns the meta object for the reference '{@link de.gulden.modeling.wave.Form#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see de.gulden.modeling.wave.Form#getOperation()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Operation();

	/**
	 * Returns the meta object for the attribute '{@link de.gulden.modeling.wave.Form#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.gulden.modeling.wave.Form#getName()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Name();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.WidgetAttribute <em>Widget Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Attribute</em>'.
	 * @see de.gulden.modeling.wave.WidgetAttribute
	 * @generated
	 */
	EClass getWidgetAttribute();

	/**
	 * Returns the meta object for the reference '{@link de.gulden.modeling.wave.WidgetAttribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see de.gulden.modeling.wave.WidgetAttribute#getAttribute()
	 * @see #getWidgetAttribute()
	 * @generated
	 */
	EReference getWidgetAttribute_Attribute();

	/**
	 * Returns the meta object for class '{@link de.gulden.modeling.wave.WidgetAssociation <em>Widget Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Association</em>'.
	 * @see de.gulden.modeling.wave.WidgetAssociation
	 * @generated
	 */
	EClass getWidgetAssociation();

	/**
	 * Returns the meta object for the reference '{@link de.gulden.modeling.wave.WidgetAssociation#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Association</em>'.
	 * @see de.gulden.modeling.wave.WidgetAssociation#getAssociation()
	 * @see #getWidgetAssociation()
	 * @generated
	 */
	EReference getWidgetAssociation_Association();

	/**
	 * Returns the meta object for the reference list '{@link de.gulden.modeling.wave.WidgetAssociation#getElementsMenuActions <em>Elements Menu Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements Menu Actions</em>'.
	 * @see de.gulden.modeling.wave.WidgetAssociation#getElementsMenuActions()
	 * @see #getWidgetAssociation()
	 * @generated
	 */
	EReference getWidgetAssociation_ElementsMenuActions();

	/**
	 * Returns the meta object for enum '{@link de.gulden.modeling.wave.EnumAjaxModes <em>Enum Ajax Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Ajax Modes</em>'.
	 * @see de.gulden.modeling.wave.EnumAjaxModes
	 * @generated
	 */
	EEnum getEnumAjaxModes();

	/**
	 * Returns the meta object for enum '{@link de.gulden.modeling.wave.EnumMultiplicity <em>Enum Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Multiplicity</em>'.
	 * @see de.gulden.modeling.wave.EnumMultiplicity
	 * @generated
	 */
	EEnum getEnumMultiplicity();

	/**
	 * Returns the meta object for enum '{@link de.gulden.modeling.wave.EnumVisibility <em>Enum Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Visibility</em>'.
	 * @see de.gulden.modeling.wave.EnumVisibility
	 * @generated
	 */
	EEnum getEnumVisibility();

	/**
	 * Returns the meta object for enum '{@link de.gulden.modeling.wave.EnumDocumentationAudienceType <em>Enum Documentation Audience Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Documentation Audience Type</em>'.
	 * @see de.gulden.modeling.wave.EnumDocumentationAudienceType
	 * @generated
	 */
	EEnum getEnumDocumentationAudienceType();

	/**
	 * Returns the meta object for enum '{@link de.gulden.modeling.wave.EnumTargetModes <em>Enum Target Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Target Modes</em>'.
	 * @see de.gulden.modeling.wave.EnumTargetModes
	 * @generated
	 */
	EEnum getEnumTargetModes();

	/**
	 * Returns the meta object for enum '{@link de.gulden.modeling.wave.EnumDirection <em>Enum Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Direction</em>'.
	 * @see de.gulden.modeling.wave.EnumDirection
	 * @generated
	 */
	EEnum getEnumDirection();

	/**
	 * Returns the meta object for enum '{@link de.gulden.modeling.wave.EnumDisplayMode <em>Enum Display Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Display Mode</em>'.
	 * @see de.gulden.modeling.wave.EnumDisplayMode
	 * @generated
	 */
	EEnum getEnumDisplayMode();

	/**
	 * Returns the meta object for enum '{@link de.gulden.modeling.wave.EnumWidgetType <em>Enum Widget Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Widget Type</em>'.
	 * @see de.gulden.modeling.wave.EnumWidgetType
	 * @generated
	 */
	EEnum getEnumWidgetType();

	/**
	 * Returns the meta object for enum '{@link de.gulden.modeling.wave.EnumProjectLayout <em>Enum Project Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Project Layout</em>'.
	 * @see de.gulden.modeling.wave.EnumProjectLayout
	 * @generated
	 */
	EEnum getEnumProjectLayout();

	/**
	 * Returns the meta object for enum '{@link de.gulden.modeling.wave.EnumLabelMode <em>Enum Label Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Label Mode</em>'.
	 * @see de.gulden.modeling.wave.EnumLabelMode
	 * @generated
	 */
	EEnum getEnumLabelMode();

	/**
	 * Returns the meta object for enum '{@link de.gulden.modeling.wave.EnumGeneratorTarget <em>Enum Generator Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Generator Target</em>'.
	 * @see de.gulden.modeling.wave.EnumGeneratorTarget
	 * @generated
	 */
	EEnum getEnumGeneratorTarget();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WaveFactory getWaveFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.ClassifierImpl <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.ClassifierImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__OPERATIONS = eINSTANCE.getClassifier_Operations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__NAME = eINSTANCE.getClassifier_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__ATTRIBUTES = eINSTANCE.getClassifier_Attributes();

		/**
		 * The meta object literal for the '<em><b>Is External</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__IS_EXTERNAL = eINSTANCE.getClassifier_IsExternal();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.ControllerImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__ACTIONS = eINSTANCE.getController_Actions();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__VIEWS = eINSTANCE.getController_Views();

		/**
		 * The meta object literal for the '<em><b>Transitions Action To View</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__TRANSITIONS_ACTION_TO_VIEW = eINSTANCE.getController_TransitionsActionToView();

		/**
		 * The meta object literal for the '<em><b>Transitions View</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__TRANSITIONS_VIEW = eINSTANCE.getController_TransitionsView();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.AssociationRelationshipImpl <em>Association Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.AssociationRelationshipImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getAssociationRelationship()
		 * @generated
		 */
		EClass ASSOCIATION_RELATIONSHIP = eINSTANCE.getAssociationRelationship();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_RELATIONSHIP__NAME = eINSTANCE.getAssociationRelationship_Name();

		/**
		 * The meta object literal for the '<em><b>Multiplicity A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_RELATIONSHIP__MULTIPLICITY_A = eINSTANCE.getAssociationRelationship_MultiplicityA();

		/**
		 * The meta object literal for the '<em><b>Multiplicity B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_RELATIONSHIP__MULTIPLICITY_B = eINSTANCE.getAssociationRelationship_MultiplicityB();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_RELATIONSHIP__A = eINSTANCE.getAssociationRelationship_A();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_RELATIONSHIP__B = eINSTANCE.getAssociationRelationship_B();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_RELATIONSHIP__DIRECTION = eINSTANCE.getAssociationRelationship_Direction();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.OperationImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__RETURN_TYPE = eINSTANCE.getOperation_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__IS_ABSTRACT = eINSTANCE.getOperation_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__CODE = eINSTANCE.getOperation_Code();

		/**
		 * The meta object literal for the '<em><b>Throws</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__THROWS = eINSTANCE.getOperation_Throws();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PARAMETERS = eINSTANCE.getOperation_Parameters();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.ActionImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Ajax Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__AJAX_MODE = eINSTANCE.getAction_AjaxMode();

		/**
		 * The meta object literal for the '<em><b>Ajax Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__AJAX_TARGET = eINSTANCE.getAction_AjaxTarget();

		/**
		 * The meta object literal for the '<em><b>Confirm Execute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__CONFIRM_EXECUTE = eINSTANCE.getAction_ConfirmExecute();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.ViewImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Areas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__AREAS = eINSTANCE.getView_Areas();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.AttributeImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getAttribute_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Is Multiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_MULTIPLE = eINSTANCE.getAttribute_IsMultiple();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.InheritanceRelationshipImpl <em>Inheritance Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.InheritanceRelationshipImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getInheritanceRelationship()
		 * @generated
		 */
		EClass INHERITANCE_RELATIONSHIP = eINSTANCE.getInheritanceRelationship();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHERITANCE_RELATIONSHIP__PARENT = eINSTANCE.getInheritanceRelationship_Parent();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHERITANCE_RELATIONSHIP__CHILD = eINSTANCE.getInheritanceRelationship_Child();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.RealizationRelationshipImpl <em>Realization Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.RealizationRelationshipImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getRealizationRelationship()
		 * @generated
		 */
		EClass REALIZATION_RELATIONSHIP = eINSTANCE.getRealizationRelationship();

		/**
		 * The meta object literal for the '<em><b>Parent Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZATION_RELATIONSHIP__PARENT_INTERFACE = eINSTANCE.getRealizationRelationship_ParentInterface();

		/**
		 * The meta object literal for the '<em><b>Implementing Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZATION_RELATIONSHIP__IMPLEMENTING_CLASS = eINSTANCE.getRealizationRelationship_ImplementingClass();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.ModelImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__AUTHOR = eINSTANCE.getModel_Author();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__VERSION = eINSTANCE.getModel_Version();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__BASE_PACKAGE = eINSTANCE.getModel_BasePackage();

		/**
		 * The meta object literal for the '<em><b>Source Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__SOURCE_FOLDER = eINSTANCE.getModel_SourceFolder();

		/**
		 * The meta object literal for the '<em><b>Generator Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__GENERATOR_TARGET = eINSTANCE.getModel_GeneratorTarget();

		/**
		 * The meta object literal for the '<em><b>Copyright</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__COPYRIGHT = eINSTANCE.getModel_Copyright();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__PROVIDER = eINSTANCE.getModel_Provider();

		/**
		 * The meta object literal for the '<em><b>Dictionary</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DICTIONARY = eINSTANCE.getModel_Dictionary();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DOCUMENTATION = eINSTANCE.getModel_Documentation();

		/**
		 * The meta object literal for the '<em><b>Factory Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__FACTORY_CLASS = eINSTANCE.getModel_FactoryClass();

		/**
		 * The meta object literal for the '<em><b>Layout Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__LAYOUT_TEMPLATE = eINSTANCE.getModel_LayoutTemplate();

		/**
		 * The meta object literal for the '<em><b>Base Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__BASE_URL = eINSTANCE.getModel_BaseUrl();

		/**
		 * The meta object literal for the '<em><b>Icon Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__ICON_PREFIX = eINSTANCE.getModel_IconPrefix();

		/**
		 * The meta object literal for the '<em><b>Testdata SQL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__TESTDATA_SQL = eINSTANCE.getModel_TestdataSQL();

		/**
		 * The meta object literal for the '<em><b>Project Layout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__PROJECT_LAYOUT = eINSTANCE.getModel_ProjectLayout();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.ModelMemberImpl <em>Model Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.ModelMemberImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getModelMember()
		 * @generated
		 */
		EClass MODEL_MEMBER = eINSTANCE.getModelMember();

		/**
		 * The meta object literal for the '<em><b>Tagged Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_MEMBER__TAGGED_VALUE = eINSTANCE.getModelMember_TaggedValue();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_MEMBER__LABEL = eINSTANCE.getModelMember_Label();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_MEMBER__DESCRIPTION = eINSTANCE.getModelMember_Description();

		/**
		 * The meta object literal for the '<em><b>Docs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_MEMBER__DOCS = eINSTANCE.getModelMember_Docs();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_MEMBER__STEREOTYPE = eINSTANCE.getModelMember_Stereotype();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.PackageImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__MEMBERS = eINSTANCE.getPackage_Members();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.DependencyRelationshipImpl <em>Dependency Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.DependencyRelationshipImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getDependencyRelationship()
		 * @generated
		 */
		EClass DEPENDENCY_RELATIONSHIP = eINSTANCE.getDependencyRelationship();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY_RELATIONSHIP__CLIENT = eINSTANCE.getDependencyRelationship_Client();

		/**
		 * The meta object literal for the '<em><b>Supplier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY_RELATIONSHIP__SUPPLIER = eINSTANCE.getDependencyRelationship_Supplier();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.ClassImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Is Persistent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__IS_PERSISTENT = eINSTANCE.getClass_IsPersistent();

		/**
		 * The meta object literal for the '<em><b>Target Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__TARGET_MODE = eINSTANCE.getClass_TargetMode();

		/**
		 * The meta object literal for the '<em><b>Forms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__FORMS = eINSTANCE.getClass_Forms();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.InterfaceImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Target Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__TARGET_MODE = eINSTANCE.getInterface_TargetMode();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.TopLevelModelMemberImpl <em>Top Level Model Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.TopLevelModelMemberImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getTopLevelModelMember()
		 * @generated
		 */
		EClass TOP_LEVEL_MODEL_MEMBER = eINSTANCE.getTopLevelModelMember();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.ActionToViewTransitionImpl <em>Action To View Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.ActionToViewTransitionImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getActionToViewTransition()
		 * @generated
		 */
		EClass ACTION_TO_VIEW_TRANSITION = eINSTANCE.getActionToViewTransition();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_TO_VIEW_TRANSITION__TARGET = eINSTANCE.getActionToViewTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_TO_VIEW_TRANSITION__SOURCE = eINSTANCE.getActionToViewTransition_Source();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.TaggedValueImpl <em>Tagged Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.TaggedValueImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getTaggedValue()
		 * @generated
		 */
		EClass TAGGED_VALUE = eINSTANCE.getTaggedValue();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_VALUE__KEY = eINSTANCE.getTaggedValue_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_VALUE__VALUE = eINSTANCE.getTaggedValue_Value();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.DocumentationImpl <em>Documentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.DocumentationImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getDocumentation()
		 * @generated
		 */
		EClass DOCUMENTATION = eINSTANCE.getDocumentation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__TEXT = eINSTANCE.getDocumentation_Text();

		/**
		 * The meta object literal for the '<em><b>Audience</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__AUDIENCE = eINSTANCE.getDocumentation_Audience();

		/**
		 * The meta object literal for the '<em><b>Detail Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__DETAIL_LEVEL = eINSTANCE.getDocumentation_DetailLevel();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.OOPClassifierImpl <em>OOP Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.OOPClassifierImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getOOPClassifier()
		 * @generated
		 */
		EClass OOP_CLASSIFIER = eINSTANCE.getOOPClassifier();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OOP_CLASSIFIER__IS_ABSTRACT = eINSTANCE.getOOPClassifier_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OOP_CLASSIFIER__VISIBILITY = eINSTANCE.getOOPClassifier_Visibility();

		/**
		 * The meta object literal for the '<em><b>External Extends</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OOP_CLASSIFIER__EXTERNAL_EXTENDS = eINSTANCE.getOOPClassifier_ExternalExtends();

		/**
		 * The meta object literal for the '<em><b>External Implements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OOP_CLASSIFIER__EXTERNAL_IMPLEMENTS = eINSTANCE.getOOPClassifier_ExternalImplements();

		/**
		 * The meta object literal for the '<em><b>Inner</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OOP_CLASSIFIER__INNER = eINSTANCE.getOOPClassifier_Inner();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.ClassifierMemberImpl <em>Classifier Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.ClassifierMemberImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getClassifierMember()
		 * @generated
		 */
		EClass CLASSIFIER_MEMBER = eINSTANCE.getClassifierMember();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER_MEMBER__SIGNATURE = eINSTANCE.getClassifierMember_Signature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER_MEMBER__NAME = eINSTANCE.getClassifierMember_Name();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER_MEMBER__VISIBILITY = eINSTANCE.getClassifierMember_Visibility();

		/**
		 * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER_MEMBER__IS_STATIC = eINSTANCE.getClassifierMember_IsStatic();

		/**
		 * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER_MEMBER__IS_FINAL = eINSTANCE.getClassifierMember_IsFinal();

		/**
		 * The meta object literal for the '<em><b>Target Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER_MEMBER__TARGET_MODE = eINSTANCE.getClassifierMember_TargetMode();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.ArtifactClassifierImpl <em>Artifact Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.ArtifactClassifierImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getArtifactClassifier()
		 * @generated
		 */
		EClass ARTIFACT_CLASSIFIER = eINSTANCE.getArtifactClassifier();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.IncludeImpl <em>Include</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.IncludeImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getInclude()
		 * @generated
		 */
		EClass INCLUDE = eINSTANCE.getInclude();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE__CODE = eINSTANCE.getInclude_Code();

		/**
		 * The meta object literal for the '<em><b>Url Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE__URL_PATH = eINSTANCE.getInclude_UrlPath();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.StyleSheetImpl <em>Style Sheet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.StyleSheetImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getStyleSheet()
		 * @generated
		 */
		EClass STYLE_SHEET = eINSTANCE.getStyleSheet();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_SHEET__CODE = eINSTANCE.getStyleSheet_Code();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.ViewTransitionImpl <em>View Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.ViewTransitionImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getViewTransition()
		 * @generated
		 */
		EClass VIEW_TRANSITION = eINSTANCE.getViewTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_TRANSITION__SOURCE = eINSTANCE.getViewTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_TRANSITION__TARGET = eINSTANCE.getViewTransition_Target();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.ControllerMemberImpl <em>Controller Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.ControllerMemberImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getControllerMember()
		 * @generated
		 */
		EClass CONTROLLER_MEMBER = eINSTANCE.getControllerMember();

		/**
		 * The meta object literal for the '<em><b>Usecases</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_MEMBER__USECASES = eINSTANCE.getControllerMember_Usecases();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_MEMBER__NAME = eINSTANCE.getControllerMember_Name();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.EnumerationImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__LITERALS = eINSTANCE.getEnumeration_Literals();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.EnumerationLiteralImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getEnumerationLiteral()
		 * @generated
		 */
		EClass ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteral();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_LITERAL__NAME = eINSTANCE.getEnumerationLiteral_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_LITERAL__VALUE = eINSTANCE.getEnumerationLiteral_Value();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.DictionaryImpl <em>Dictionary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.DictionaryImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getDictionary()
		 * @generated
		 */
		EClass DICTIONARY = eINSTANCE.getDictionary();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTIONARY__LABEL = eINSTANCE.getDictionary_Label();

		/**
		 * The meta object literal for the '<em><b>Default Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICTIONARY__DEFAULT_LANG = eINSTANCE.getDictionary_DefaultLang();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.LabelImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__TEXT = eINSTANCE.getLabel_Text();

		/**
		 * The meta object literal for the '<em><b>Langstring</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL__LANGSTRING = eINSTANCE.getLabel_Langstring();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__ICON = eINSTANCE.getLabel_Icon();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__MODE = eINSTANCE.getLabel_Mode();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.LangstringImpl <em>Langstring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.LangstringImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getLangstring()
		 * @generated
		 */
		EClass LANGSTRING = eINSTANCE.getLangstring();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGSTRING__LANG = eINSTANCE.getLangstring_Lang();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGSTRING__TEXT = eINSTANCE.getLangstring_Text();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.DatabaseTableImpl <em>Database Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.DatabaseTableImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getDatabaseTable()
		 * @generated
		 */
		EClass DATABASE_TABLE = eINSTANCE.getDatabaseTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_TABLE__NAME = eINSTANCE.getDatabaseTable_Name();

		/**
		 * The meta object literal for the '<em><b>Sql Create</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_TABLE__SQL_CREATE = eINSTANCE.getDatabaseTable_SqlCreate();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.WidgetImpl <em>Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.WidgetImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getWidget()
		 * @generated
		 */
		EClass WIDGET = eINSTANCE.getWidget();

		/**
		 * The meta object literal for the '<em><b>Widget Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__WIDGET_TYPE = eINSTANCE.getWidget_WidgetType();

		/**
		 * The meta object literal for the '<em><b>Widget Hint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__WIDGET_HINT = eINSTANCE.getWidget_WidgetHint();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__READ_ONLY = eINSTANCE.getWidget_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__REQUIRED = eINSTANCE.getWidget_Required();

		/**
		 * The meta object literal for the '<em><b>Ignore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__IGNORE = eINSTANCE.getWidget_Ignore();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__FILTERS = eINSTANCE.getWidget_Filters();

		/**
		 * The meta object literal for the '<em><b>Validators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__VALIDATORS = eINSTANCE.getWidget_Validators();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__OPTIONS = eINSTANCE.getWidget_Options();

		/**
		 * The meta object literal for the '<em><b>Menu Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__MENU_ACTIONS = eINSTANCE.getWidget_MenuActions();

		/**
		 * The meta object literal for the '<em><b>Element Form Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__ELEMENT_FORM_NAME = eINSTANCE.getWidget_ElementFormName();

		/**
		 * The meta object literal for the '<em><b>Multi Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__MULTI_LINE = eINSTANCE.getWidget_MultiLine();

		/**
		 * The meta object literal for the '<em><b>Multi Choice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__MULTI_CHOICE = eINSTANCE.getWidget_MultiChoice();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.UsecaseSubsystemImpl <em>Usecase Subsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.UsecaseSubsystemImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getUsecaseSubsystem()
		 * @generated
		 */
		EClass USECASE_SUBSYSTEM = eINSTANCE.getUsecaseSubsystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USECASE_SUBSYSTEM__NAME = eINSTANCE.getUsecaseSubsystem_Name();

		/**
		 * The meta object literal for the '<em><b>Usecases</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USECASE_SUBSYSTEM__USECASES = eINSTANCE.getUsecaseSubsystem_Usecases();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.UsecaseClassifierImpl <em>Usecase Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.UsecaseClassifierImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getUsecaseClassifier()
		 * @generated
		 */
		EClass USECASE_CLASSIFIER = eINSTANCE.getUsecaseClassifier();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.UsecaseImpl <em>Usecase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.UsecaseImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getUsecase()
		 * @generated
		 */
		EClass USECASE = eINSTANCE.getUsecase();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USECASE__TEXT = eINSTANCE.getUsecase_Text();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.ActorImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.AreaImpl <em>Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.AreaImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getArea()
		 * @generated
		 */
		EClass AREA = eINSTANCE.getArea();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA__VIEWS = eINSTANCE.getArea_Views();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA__STYLE = eINSTANCE.getArea_Style();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.ControllerMemberExecutableImpl <em>Controller Member Executable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.ControllerMemberExecutableImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getControllerMemberExecutable()
		 * @generated
		 */
		EClass CONTROLLER_MEMBER_EXECUTABLE = eINSTANCE.getControllerMemberExecutable();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_MEMBER_EXECUTABLE__OPERATION = eINSTANCE.getControllerMemberExecutable_Operation();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.WidgetElementImpl <em>Widget Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.WidgetElementImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getWidgetElement()
		 * @generated
		 */
		EClass WIDGET_ELEMENT = eINSTANCE.getWidgetElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_ELEMENT__NAME = eINSTANCE.getWidgetElement_Name();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET_ELEMENT__OPTIONS = eINSTANCE.getWidgetElement_Options();

		/**
		 * The meta object literal for the '<em><b>Multi Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET_ELEMENT__MULTI_OPTIONS = eINSTANCE.getWidgetElement_MultiOptions();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.WidgetOptionImpl <em>Widget Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.WidgetOptionImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getWidgetOption()
		 * @generated
		 */
		EClass WIDGET_OPTION = eINSTANCE.getWidgetOption();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_OPTION__NAME = eINSTANCE.getWidgetOption_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_OPTION__VALUE = eINSTANCE.getWidgetOption_Value();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.TransitionImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__CONDITION = eINSTANCE.getTransition_Condition();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.FormImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__WIDGETS = eINSTANCE.getForm_Widgets();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__OPERATION = eINSTANCE.getForm_Operation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__NAME = eINSTANCE.getForm_Name();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.WidgetAttributeImpl <em>Widget Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.WidgetAttributeImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getWidgetAttribute()
		 * @generated
		 */
		EClass WIDGET_ATTRIBUTE = eINSTANCE.getWidgetAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getWidgetAttribute_Attribute();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.impl.WidgetAssociationImpl <em>Widget Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.impl.WidgetAssociationImpl
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getWidgetAssociation()
		 * @generated
		 */
		EClass WIDGET_ASSOCIATION = eINSTANCE.getWidgetAssociation();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET_ASSOCIATION__ASSOCIATION = eINSTANCE.getWidgetAssociation_Association();

		/**
		 * The meta object literal for the '<em><b>Elements Menu Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET_ASSOCIATION__ELEMENTS_MENU_ACTIONS = eINSTANCE.getWidgetAssociation_ElementsMenuActions();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.EnumAjaxModes <em>Enum Ajax Modes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.EnumAjaxModes
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getEnumAjaxModes()
		 * @generated
		 */
		EEnum ENUM_AJAX_MODES = eINSTANCE.getEnumAjaxModes();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.EnumMultiplicity <em>Enum Multiplicity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.EnumMultiplicity
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getEnumMultiplicity()
		 * @generated
		 */
		EEnum ENUM_MULTIPLICITY = eINSTANCE.getEnumMultiplicity();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.EnumVisibility <em>Enum Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.EnumVisibility
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getEnumVisibility()
		 * @generated
		 */
		EEnum ENUM_VISIBILITY = eINSTANCE.getEnumVisibility();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.EnumDocumentationAudienceType <em>Enum Documentation Audience Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.EnumDocumentationAudienceType
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getEnumDocumentationAudienceType()
		 * @generated
		 */
		EEnum ENUM_DOCUMENTATION_AUDIENCE_TYPE = eINSTANCE.getEnumDocumentationAudienceType();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.EnumTargetModes <em>Enum Target Modes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.EnumTargetModes
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getEnumTargetModes()
		 * @generated
		 */
		EEnum ENUM_TARGET_MODES = eINSTANCE.getEnumTargetModes();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.EnumDirection <em>Enum Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.EnumDirection
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getEnumDirection()
		 * @generated
		 */
		EEnum ENUM_DIRECTION = eINSTANCE.getEnumDirection();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.EnumDisplayMode <em>Enum Display Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.EnumDisplayMode
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getEnumDisplayMode()
		 * @generated
		 */
		EEnum ENUM_DISPLAY_MODE = eINSTANCE.getEnumDisplayMode();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.EnumWidgetType <em>Enum Widget Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.EnumWidgetType
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getEnumWidgetType()
		 * @generated
		 */
		EEnum ENUM_WIDGET_TYPE = eINSTANCE.getEnumWidgetType();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.EnumProjectLayout <em>Enum Project Layout</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.EnumProjectLayout
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getEnumProjectLayout()
		 * @generated
		 */
		EEnum ENUM_PROJECT_LAYOUT = eINSTANCE.getEnumProjectLayout();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.EnumLabelMode <em>Enum Label Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.EnumLabelMode
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getEnumLabelMode()
		 * @generated
		 */
		EEnum ENUM_LABEL_MODE = eINSTANCE.getEnumLabelMode();

		/**
		 * The meta object literal for the '{@link de.gulden.modeling.wave.EnumGeneratorTarget <em>Enum Generator Target</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gulden.modeling.wave.EnumGeneratorTarget
		 * @see de.gulden.modeling.wave.impl.WavePackageImpl#getEnumGeneratorTarget()
		 * @generated
		 */
		EEnum ENUM_GENERATOR_TARGET = eINSTANCE.getEnumGeneratorTarget();

	}

} //WavePackage
