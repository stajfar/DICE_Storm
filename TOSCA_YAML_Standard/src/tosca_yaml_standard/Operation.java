/**
 */
package tosca_yaml_standard;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca_yaml_standard.Operation#getOperation_name <em>Operation name</em>}</li>
 *   <li>{@link tosca_yaml_standard.Operation#getDescription <em>Description</em>}</li>
 *   <li>{@link tosca_yaml_standard.Operation#getOperation_hasInput <em>Operation has Input</em>}</li>
 *   <li>{@link tosca_yaml_standard.Operation#getScript <em>Script</em>}</li>
 *   <li>{@link tosca_yaml_standard.Operation#getExecutor <em>Executor</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca_yaml_standard.Tosca_yaml_standardPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation name</em>' attribute.
	 * @see #setOperation_name(String)
	 * @see tosca_yaml_standard.Tosca_yaml_standardPackage#getOperation_Operation_name()
	 * @model
	 * @generated
	 */
	String getOperation_name();

	/**
	 * Sets the value of the '{@link tosca_yaml_standard.Operation#getOperation_name <em>Operation name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation name</em>' attribute.
	 * @see #getOperation_name()
	 * @generated
	 */
	void setOperation_name(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see tosca_yaml_standard.Tosca_yaml_standardPackage#getOperation_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link tosca_yaml_standard.Operation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Operation has Input</b></em>' containment reference list.
	 * The list contents are of type {@link tosca_yaml_standard.Input}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation has Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation has Input</em>' containment reference list.
	 * @see tosca_yaml_standard.Tosca_yaml_standardPackage#getOperation_Operation_hasInput()
	 * @model containment="true"
	 * @generated
	 */
	EList<Input> getOperation_hasInput();

	/**
	 * Returns the value of the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' attribute.
	 * @see #setScript(String)
	 * @see tosca_yaml_standard.Tosca_yaml_standardPackage#getOperation_Script()
	 * @model
	 * @generated
	 */
	String getScript();

	/**
	 * Sets the value of the '{@link tosca_yaml_standard.Operation#getScript <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' attribute.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(String value);

	/**
	 * Returns the value of the '<em><b>Executor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executor</em>' attribute.
	 * @see #setExecutor(String)
	 * @see tosca_yaml_standard.Tosca_yaml_standardPackage#getOperation_Executor()
	 * @model
	 * @generated
	 */
	String getExecutor();

	/**
	 * Sets the value of the '{@link tosca_yaml_standard.Operation#getExecutor <em>Executor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executor</em>' attribute.
	 * @see #getExecutor()
	 * @generated
	 */
	void setExecutor(String value);

} // Operation
