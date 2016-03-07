/**
 */
package tosca_yaml_standard;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca_yaml_standard.Import#getImport_name <em>Import name</em>}</li>
 *   <li>{@link tosca_yaml_standard.Import#getFile <em>File</em>}</li>
 *   <li>{@link tosca_yaml_standard.Import#getRepository <em>Repository</em>}</li>
 *   <li>{@link tosca_yaml_standard.Import#getNamespace_uri <em>Namespace uri</em>}</li>
 *   <li>{@link tosca_yaml_standard.Import#getNamespace_prefix <em>Namespace prefix</em>}</li>
 * </ul>
 *
 * @see tosca_yaml_standard.Tosca_yaml_standardPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject {
	/**
	 * Returns the value of the '<em><b>Import name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import name</em>' attribute.
	 * @see #setImport_name(String)
	 * @see tosca_yaml_standard.Tosca_yaml_standardPackage#getImport_Import_name()
	 * @model
	 * @generated
	 */
	String getImport_name();

	/**
	 * Sets the value of the '{@link tosca_yaml_standard.Import#getImport_name <em>Import name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import name</em>' attribute.
	 * @see #getImport_name()
	 * @generated
	 */
	void setImport_name(String value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' attribute.
	 * @see #setFile(String)
	 * @see tosca_yaml_standard.Tosca_yaml_standardPackage#getImport_File()
	 * @model
	 * @generated
	 */
	String getFile();

	/**
	 * Sets the value of the '{@link tosca_yaml_standard.Import#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(String value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' attribute.
	 * @see #setRepository(String)
	 * @see tosca_yaml_standard.Tosca_yaml_standardPackage#getImport_Repository()
	 * @model
	 * @generated
	 */
	String getRepository();

	/**
	 * Sets the value of the '{@link tosca_yaml_standard.Import#getRepository <em>Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' attribute.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(String value);

	/**
	 * Returns the value of the '<em><b>Namespace uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace uri</em>' attribute.
	 * @see #setNamespace_uri(String)
	 * @see tosca_yaml_standard.Tosca_yaml_standardPackage#getImport_Namespace_uri()
	 * @model
	 * @generated
	 */
	String getNamespace_uri();

	/**
	 * Sets the value of the '{@link tosca_yaml_standard.Import#getNamespace_uri <em>Namespace uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace uri</em>' attribute.
	 * @see #getNamespace_uri()
	 * @generated
	 */
	void setNamespace_uri(String value);

	/**
	 * Returns the value of the '<em><b>Namespace prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace prefix</em>' attribute.
	 * @see #setNamespace_prefix(String)
	 * @see tosca_yaml_standard.Tosca_yaml_standardPackage#getImport_Namespace_prefix()
	 * @model
	 * @generated
	 */
	String getNamespace_prefix();

	/**
	 * Sets the value of the '{@link tosca_yaml_standard.Import#getNamespace_prefix <em>Namespace prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace prefix</em>' attribute.
	 * @see #getNamespace_prefix()
	 * @generated
	 */
	void setNamespace_prefix(String value);

} // Import
