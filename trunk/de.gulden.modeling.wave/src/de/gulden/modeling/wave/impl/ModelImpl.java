/**
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 *
 * $Id$
 */
package de.gulden.modeling.wave.impl;

import de.gulden.modeling.wave.Dictionary;
import de.gulden.modeling.wave.Documentation;
import de.gulden.modeling.wave.EnumGeneratorTarget;
import de.gulden.modeling.wave.EnumProjectLayout;
import de.gulden.modeling.wave.Include;
import de.gulden.modeling.wave.Model;
import de.gulden.modeling.wave.WavePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.gulden.modeling.wave.impl.ModelImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.ModelImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.ModelImpl#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.ModelImpl#getSourceFolder <em>Source Folder</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.ModelImpl#getGeneratorTarget <em>Generator Target</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.ModelImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.ModelImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.ModelImpl#getDictionary <em>Dictionary</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.ModelImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.ModelImpl#getFactoryClass <em>Factory Class</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.ModelImpl#getLayoutTemplate <em>Layout Template</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.ModelImpl#getBaseUrl <em>Base Url</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.ModelImpl#getIconPrefix <em>Icon Prefix</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.ModelImpl#getTestdataSQL <em>Testdata SQL</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.impl.ModelImpl#getProjectLayout <em>Project Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends PackageImpl implements Model {
	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected String basePackage = BASE_PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceFolder() <em>Source Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_FOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceFolder() <em>Source Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFolder()
	 * @generated
	 * @ordered
	 */
	protected String sourceFolder = SOURCE_FOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratorTarget() <em>Generator Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorTarget()
	 * @generated
	 * @ordered
	 */
	protected static final EnumGeneratorTarget GENERATOR_TARGET_EDEFAULT = EnumGeneratorTarget.NONE;

	/**
	 * The cached value of the '{@link #getGeneratorTarget() <em>Generator Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorTarget()
	 * @generated
	 * @ordered
	 */
	protected EnumGeneratorTarget generatorTarget = GENERATOR_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopyright() <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected static final String COPYRIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected String copyright = COPYRIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected String provider = PROVIDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDictionary() <em>Dictionary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDictionary()
	 * @generated
	 * @ordered
	 */
	protected Dictionary dictionary;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected EList<Documentation> documentation;

	/**
	 * The default value of the '{@link #getFactoryClass() <em>Factory Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryClass()
	 * @generated
	 * @ordered
	 */
	protected static final String FACTORY_CLASS_EDEFAULT = "DefaultWaveFactoryImpl";

	/**
	 * The cached value of the '{@link #getFactoryClass() <em>Factory Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactoryClass()
	 * @generated
	 * @ordered
	 */
	protected String factoryClass = FACTORY_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLayoutTemplate() <em>Layout Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutTemplate()
	 * @generated
	 * @ordered
	 */
	protected Include layoutTemplate;

	/**
	 * The default value of the '{@link #getBaseUrl() <em>Base Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseUrl() <em>Base Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseUrl()
	 * @generated
	 * @ordered
	 */
	protected String baseUrl = BASE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIconPrefix() <em>Icon Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIconPrefix() <em>Icon Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconPrefix()
	 * @generated
	 * @ordered
	 */
	protected String iconPrefix = ICON_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestdataSQL() <em>Testdata SQL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestdataSQL()
	 * @generated
	 * @ordered
	 */
	protected static final String TESTDATA_SQL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestdataSQL() <em>Testdata SQL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestdataSQL()
	 * @generated
	 * @ordered
	 */
	protected String testdataSQL = TESTDATA_SQL_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectLayout() <em>Project Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectLayout()
	 * @generated
	 * @ordered
	 */
	protected static final EnumProjectLayout PROJECT_LAYOUT_EDEFAULT = EnumProjectLayout.APPLICATION;

	/**
	 * The cached value of the '{@link #getProjectLayout() <em>Project Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectLayout()
	 * @generated
	 * @ordered
	 */
	protected EnumProjectLayout projectLayout = PROJECT_LAYOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavePackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.MODEL__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.MODEL__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBasePackage() {
		return basePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasePackage(String newBasePackage) {
		String oldBasePackage = basePackage;
		basePackage = newBasePackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.MODEL__BASE_PACKAGE, oldBasePackage, basePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceFolder() {
		return sourceFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceFolder(String newSourceFolder) {
		String oldSourceFolder = sourceFolder;
		sourceFolder = newSourceFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.MODEL__SOURCE_FOLDER, oldSourceFolder, sourceFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumGeneratorTarget getGeneratorTarget() {
		return generatorTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratorTarget(EnumGeneratorTarget newGeneratorTarget) {
		EnumGeneratorTarget oldGeneratorTarget = generatorTarget;
		generatorTarget = newGeneratorTarget == null ? GENERATOR_TARGET_EDEFAULT : newGeneratorTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.MODEL__GENERATOR_TARGET, oldGeneratorTarget, generatorTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyright(String newCopyright) {
		String oldCopyright = copyright;
		copyright = newCopyright;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.MODEL__COPYRIGHT, oldCopyright, copyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(String newProvider) {
		String oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.MODEL__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dictionary getDictionary() {
		return dictionary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDictionary(Dictionary newDictionary, NotificationChain msgs) {
		Dictionary oldDictionary = dictionary;
		dictionary = newDictionary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WavePackage.MODEL__DICTIONARY, oldDictionary, newDictionary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDictionary(Dictionary newDictionary) {
		if (newDictionary != dictionary) {
			NotificationChain msgs = null;
			if (dictionary != null)
				msgs = ((InternalEObject)dictionary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WavePackage.MODEL__DICTIONARY, null, msgs);
			if (newDictionary != null)
				msgs = ((InternalEObject)newDictionary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WavePackage.MODEL__DICTIONARY, null, msgs);
			msgs = basicSetDictionary(newDictionary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.MODEL__DICTIONARY, newDictionary, newDictionary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Documentation> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<Documentation>(Documentation.class, this, WavePackage.MODEL__DOCUMENTATION);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFactoryClass() {
		return factoryClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactoryClass(String newFactoryClass) {
		String oldFactoryClass = factoryClass;
		factoryClass = newFactoryClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.MODEL__FACTORY_CLASS, oldFactoryClass, factoryClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Include getLayoutTemplate() {
		if (layoutTemplate != null && layoutTemplate.eIsProxy()) {
			InternalEObject oldLayoutTemplate = (InternalEObject)layoutTemplate;
			layoutTemplate = (Include)eResolveProxy(oldLayoutTemplate);
			if (layoutTemplate != oldLayoutTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WavePackage.MODEL__LAYOUT_TEMPLATE, oldLayoutTemplate, layoutTemplate));
			}
		}
		return layoutTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Include basicGetLayoutTemplate() {
		return layoutTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutTemplate(Include newLayoutTemplate) {
		Include oldLayoutTemplate = layoutTemplate;
		layoutTemplate = newLayoutTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.MODEL__LAYOUT_TEMPLATE, oldLayoutTemplate, layoutTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseUrl() {
		return baseUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseUrl(String newBaseUrl) {
		String oldBaseUrl = baseUrl;
		baseUrl = newBaseUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.MODEL__BASE_URL, oldBaseUrl, baseUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIconPrefix() {
		return iconPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIconPrefix(String newIconPrefix) {
		String oldIconPrefix = iconPrefix;
		iconPrefix = newIconPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.MODEL__ICON_PREFIX, oldIconPrefix, iconPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTestdataSQL() {
		return testdataSQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestdataSQL(String newTestdataSQL) {
		String oldTestdataSQL = testdataSQL;
		testdataSQL = newTestdataSQL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.MODEL__TESTDATA_SQL, oldTestdataSQL, testdataSQL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumProjectLayout getProjectLayout() {
		return projectLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectLayout(EnumProjectLayout newProjectLayout) {
		EnumProjectLayout oldProjectLayout = projectLayout;
		projectLayout = newProjectLayout == null ? PROJECT_LAYOUT_EDEFAULT : newProjectLayout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WavePackage.MODEL__PROJECT_LAYOUT, oldProjectLayout, projectLayout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WavePackage.MODEL__DICTIONARY:
				return basicSetDictionary(null, msgs);
			case WavePackage.MODEL__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WavePackage.MODEL__AUTHOR:
				return getAuthor();
			case WavePackage.MODEL__VERSION:
				return getVersion();
			case WavePackage.MODEL__BASE_PACKAGE:
				return getBasePackage();
			case WavePackage.MODEL__SOURCE_FOLDER:
				return getSourceFolder();
			case WavePackage.MODEL__GENERATOR_TARGET:
				return getGeneratorTarget();
			case WavePackage.MODEL__COPYRIGHT:
				return getCopyright();
			case WavePackage.MODEL__PROVIDER:
				return getProvider();
			case WavePackage.MODEL__DICTIONARY:
				return getDictionary();
			case WavePackage.MODEL__DOCUMENTATION:
				return getDocumentation();
			case WavePackage.MODEL__FACTORY_CLASS:
				return getFactoryClass();
			case WavePackage.MODEL__LAYOUT_TEMPLATE:
				if (resolve) return getLayoutTemplate();
				return basicGetLayoutTemplate();
			case WavePackage.MODEL__BASE_URL:
				return getBaseUrl();
			case WavePackage.MODEL__ICON_PREFIX:
				return getIconPrefix();
			case WavePackage.MODEL__TESTDATA_SQL:
				return getTestdataSQL();
			case WavePackage.MODEL__PROJECT_LAYOUT:
				return getProjectLayout();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WavePackage.MODEL__AUTHOR:
				setAuthor((String)newValue);
				return;
			case WavePackage.MODEL__VERSION:
				setVersion((String)newValue);
				return;
			case WavePackage.MODEL__BASE_PACKAGE:
				setBasePackage((String)newValue);
				return;
			case WavePackage.MODEL__SOURCE_FOLDER:
				setSourceFolder((String)newValue);
				return;
			case WavePackage.MODEL__GENERATOR_TARGET:
				setGeneratorTarget((EnumGeneratorTarget)newValue);
				return;
			case WavePackage.MODEL__COPYRIGHT:
				setCopyright((String)newValue);
				return;
			case WavePackage.MODEL__PROVIDER:
				setProvider((String)newValue);
				return;
			case WavePackage.MODEL__DICTIONARY:
				setDictionary((Dictionary)newValue);
				return;
			case WavePackage.MODEL__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends Documentation>)newValue);
				return;
			case WavePackage.MODEL__FACTORY_CLASS:
				setFactoryClass((String)newValue);
				return;
			case WavePackage.MODEL__LAYOUT_TEMPLATE:
				setLayoutTemplate((Include)newValue);
				return;
			case WavePackage.MODEL__BASE_URL:
				setBaseUrl((String)newValue);
				return;
			case WavePackage.MODEL__ICON_PREFIX:
				setIconPrefix((String)newValue);
				return;
			case WavePackage.MODEL__TESTDATA_SQL:
				setTestdataSQL((String)newValue);
				return;
			case WavePackage.MODEL__PROJECT_LAYOUT:
				setProjectLayout((EnumProjectLayout)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WavePackage.MODEL__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case WavePackage.MODEL__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case WavePackage.MODEL__BASE_PACKAGE:
				setBasePackage(BASE_PACKAGE_EDEFAULT);
				return;
			case WavePackage.MODEL__SOURCE_FOLDER:
				setSourceFolder(SOURCE_FOLDER_EDEFAULT);
				return;
			case WavePackage.MODEL__GENERATOR_TARGET:
				setGeneratorTarget(GENERATOR_TARGET_EDEFAULT);
				return;
			case WavePackage.MODEL__COPYRIGHT:
				setCopyright(COPYRIGHT_EDEFAULT);
				return;
			case WavePackage.MODEL__PROVIDER:
				setProvider(PROVIDER_EDEFAULT);
				return;
			case WavePackage.MODEL__DICTIONARY:
				setDictionary((Dictionary)null);
				return;
			case WavePackage.MODEL__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case WavePackage.MODEL__FACTORY_CLASS:
				setFactoryClass(FACTORY_CLASS_EDEFAULT);
				return;
			case WavePackage.MODEL__LAYOUT_TEMPLATE:
				setLayoutTemplate((Include)null);
				return;
			case WavePackage.MODEL__BASE_URL:
				setBaseUrl(BASE_URL_EDEFAULT);
				return;
			case WavePackage.MODEL__ICON_PREFIX:
				setIconPrefix(ICON_PREFIX_EDEFAULT);
				return;
			case WavePackage.MODEL__TESTDATA_SQL:
				setTestdataSQL(TESTDATA_SQL_EDEFAULT);
				return;
			case WavePackage.MODEL__PROJECT_LAYOUT:
				setProjectLayout(PROJECT_LAYOUT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WavePackage.MODEL__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case WavePackage.MODEL__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case WavePackage.MODEL__BASE_PACKAGE:
				return BASE_PACKAGE_EDEFAULT == null ? basePackage != null : !BASE_PACKAGE_EDEFAULT.equals(basePackage);
			case WavePackage.MODEL__SOURCE_FOLDER:
				return SOURCE_FOLDER_EDEFAULT == null ? sourceFolder != null : !SOURCE_FOLDER_EDEFAULT.equals(sourceFolder);
			case WavePackage.MODEL__GENERATOR_TARGET:
				return generatorTarget != GENERATOR_TARGET_EDEFAULT;
			case WavePackage.MODEL__COPYRIGHT:
				return COPYRIGHT_EDEFAULT == null ? copyright != null : !COPYRIGHT_EDEFAULT.equals(copyright);
			case WavePackage.MODEL__PROVIDER:
				return PROVIDER_EDEFAULT == null ? provider != null : !PROVIDER_EDEFAULT.equals(provider);
			case WavePackage.MODEL__DICTIONARY:
				return dictionary != null;
			case WavePackage.MODEL__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case WavePackage.MODEL__FACTORY_CLASS:
				return FACTORY_CLASS_EDEFAULT == null ? factoryClass != null : !FACTORY_CLASS_EDEFAULT.equals(factoryClass);
			case WavePackage.MODEL__LAYOUT_TEMPLATE:
				return layoutTemplate != null;
			case WavePackage.MODEL__BASE_URL:
				return BASE_URL_EDEFAULT == null ? baseUrl != null : !BASE_URL_EDEFAULT.equals(baseUrl);
			case WavePackage.MODEL__ICON_PREFIX:
				return ICON_PREFIX_EDEFAULT == null ? iconPrefix != null : !ICON_PREFIX_EDEFAULT.equals(iconPrefix);
			case WavePackage.MODEL__TESTDATA_SQL:
				return TESTDATA_SQL_EDEFAULT == null ? testdataSQL != null : !TESTDATA_SQL_EDEFAULT.equals(testdataSQL);
			case WavePackage.MODEL__PROJECT_LAYOUT:
				return projectLayout != PROJECT_LAYOUT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (author: ");
		result.append(author);
		result.append(", version: ");
		result.append(version);
		result.append(", basePackage: ");
		result.append(basePackage);
		result.append(", sourceFolder: ");
		result.append(sourceFolder);
		result.append(", generatorTarget: ");
		result.append(generatorTarget);
		result.append(", copyright: ");
		result.append(copyright);
		result.append(", provider: ");
		result.append(provider);
		result.append(", factoryClass: ");
		result.append(factoryClass);
		result.append(", baseUrl: ");
		result.append(baseUrl);
		result.append(", iconPrefix: ");
		result.append(iconPrefix);
		result.append(", testdataSQL: ");
		result.append(testdataSQL);
		result.append(", projectLayout: ");
		result.append(projectLayout);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
