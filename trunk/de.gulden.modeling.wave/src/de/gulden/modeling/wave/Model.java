/**
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 *
 * $Id$
 */
package de.gulden.modeling.wave;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gulden.modeling.wave.Model#getAuthor <em>Author</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.Model#getVersion <em>Version</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.Model#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.Model#getSourceFolder <em>Source Folder</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.Model#getGeneratorTarget <em>Generator Target</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.Model#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.Model#getProvider <em>Provider</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.Model#getDictionary <em>Dictionary</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.Model#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.Model#getFactoryClass <em>Factory Class</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.Model#getLayoutTemplate <em>Layout Template</em>}</li>
 *   <li>{@link de.gulden.modeling.wave.Model#getBaseUrl <em>Base Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gulden.modeling.wave.WavePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends de.gulden.modeling.wave.Package {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see de.gulden.modeling.wave.WavePackage#getModel_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.Model#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see de.gulden.modeling.wave.WavePackage#getModel_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.Model#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' attribute.
	 * @see #setBasePackage(String)
	 * @see de.gulden.modeling.wave.WavePackage#getModel_BasePackage()
	 * @model
	 * @generated
	 */
	String getBasePackage();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.Model#getBasePackage <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' attribute.
	 * @see #getBasePackage()
	 * @generated
	 */
	void setBasePackage(String value);

	/**
	 * Returns the value of the '<em><b>Source Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Folder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Folder</em>' attribute.
	 * @see #setSourceFolder(String)
	 * @see de.gulden.modeling.wave.WavePackage#getModel_SourceFolder()
	 * @model
	 * @generated
	 */
	String getSourceFolder();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.Model#getSourceFolder <em>Source Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Folder</em>' attribute.
	 * @see #getSourceFolder()
	 * @generated
	 */
	void setSourceFolder(String value);

	/**
	 * Returns the value of the '<em><b>Generator Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator Target</em>' attribute.
	 * @see #setGeneratorTarget(String)
	 * @see de.gulden.modeling.wave.WavePackage#getModel_GeneratorTarget()
	 * @model
	 * @generated
	 */
	String getGeneratorTarget();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.Model#getGeneratorTarget <em>Generator Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator Target</em>' attribute.
	 * @see #getGeneratorTarget()
	 * @generated
	 */
	void setGeneratorTarget(String value);

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copyright</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copyright</em>' attribute.
	 * @see #setCopyright(String)
	 * @see de.gulden.modeling.wave.WavePackage#getModel_Copyright()
	 * @model
	 * @generated
	 */
	String getCopyright();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.Model#getCopyright <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' attribute.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(String value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' attribute.
	 * @see #setProvider(String)
	 * @see de.gulden.modeling.wave.WavePackage#getModel_Provider()
	 * @model
	 * @generated
	 */
	String getProvider();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.Model#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(String value);

	/**
	 * Returns the value of the '<em><b>Dictionary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dictionary</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dictionary</em>' containment reference.
	 * @see #setDictionary(Dictionary)
	 * @see de.gulden.modeling.wave.WavePackage#getModel_Dictionary()
	 * @model containment="true"
	 * @generated
	 */
	Dictionary getDictionary();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.Model#getDictionary <em>Dictionary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dictionary</em>' containment reference.
	 * @see #getDictionary()
	 * @generated
	 */
	void setDictionary(Dictionary value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link de.gulden.modeling.wave.Documentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference list.
	 * @see de.gulden.modeling.wave.WavePackage#getModel_Documentation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Documentation> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Factory Class</b></em>' attribute.
	 * The default value is <code>"DefaultWaveFactoryImpl"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factory Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory Class</em>' attribute.
	 * @see #setFactoryClass(String)
	 * @see de.gulden.modeling.wave.WavePackage#getModel_FactoryClass()
	 * @model default="DefaultWaveFactoryImpl"
	 * @generated
	 */
	String getFactoryClass();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.Model#getFactoryClass <em>Factory Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory Class</em>' attribute.
	 * @see #getFactoryClass()
	 * @generated
	 */
	void setFactoryClass(String value);

	/**
	 * Returns the value of the '<em><b>Layout Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Template</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Template</em>' reference.
	 * @see #setLayoutTemplate(Include)
	 * @see de.gulden.modeling.wave.WavePackage#getModel_LayoutTemplate()
	 * @model
	 * @generated
	 */
	Include getLayoutTemplate();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.Model#getLayoutTemplate <em>Layout Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Template</em>' reference.
	 * @see #getLayoutTemplate()
	 * @generated
	 */
	void setLayoutTemplate(Include value);

	/**
	 * Returns the value of the '<em><b>Base Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Url</em>' attribute.
	 * @see #setBaseUrl(String)
	 * @see de.gulden.modeling.wave.WavePackage#getModel_BaseUrl()
	 * @model
	 * @generated
	 */
	String getBaseUrl();

	/**
	 * Sets the value of the '{@link de.gulden.modeling.wave.Model#getBaseUrl <em>Base Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Url</em>' attribute.
	 * @see #getBaseUrl()
	 * @generated
	 */
	void setBaseUrl(String value);

} // Model
