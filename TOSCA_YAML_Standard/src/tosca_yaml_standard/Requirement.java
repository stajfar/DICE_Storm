/**
 */
package tosca_yaml_standard;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca_yaml_standard.Requirement#getRequirement_name <em>Requirement name</em>}</li>
 *   <li>{@link tosca_yaml_standard.Requirement#getNode <em>Node</em>}</li>
 *   <li>{@link tosca_yaml_standard.Requirement#getCapability_Type_name <em>Capability Type name</em>}</li>
 *   <li>{@link tosca_yaml_standard.Requirement#getOccurances <em>Occurances</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca_yaml_standard.Tosca_yaml_standardPackage#getRequirement()
 * @model
 * @generated
 */
public interface Requirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Requirement name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement name</em>' attribute.
	 * @see #setRequirement_name(String)
	 * @see tosca_yaml_standard.Tosca_yaml_standardPackage#getRequirement_Requirement_name()
	 * @model
	 * @generated
	 */
	String getRequirement_name();

	/**
	 * Sets the value of the '{@link tosca_yaml_standard.Requirement#getRequirement_name <em>Requirement name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement name</em>' attribute.
	 * @see #getRequirement_name()
	 * @generated
	 */
	void setRequirement_name(String value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' attribute.
	 * @see #setNode(String)
	 * @see tosca_yaml_standard.Tosca_yaml_standardPackage#getRequirement_Node()
	 * @model
	 * @generated
	 */
	String getNode();

	/**
	 * Sets the value of the '{@link tosca_yaml_standard.Requirement#getNode <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' attribute.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(String value);

	/**
	 * Returns the value of the '<em><b>Capability Type name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability Type name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability Type name</em>' attribute.
	 * @see #setCapability_Type_name(String)
	 * @see tosca_yaml_standard.Tosca_yaml_standardPackage#getRequirement_Capability_Type_name()
	 * @model
	 * @generated
	 */
	String getCapability_Type_name();

	/**
	 * Sets the value of the '{@link tosca_yaml_standard.Requirement#getCapability_Type_name <em>Capability Type name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability Type name</em>' attribute.
	 * @see #getCapability_Type_name()
	 * @generated
	 */
	void setCapability_Type_name(String value);

	/**
	 * Returns the value of the '<em><b>Occurances</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurances</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurances</em>' attribute list.
	 * @see tosca_yaml_standard.Tosca_yaml_standardPackage#getRequirement_Occurances()
	 * @model upper="2"
	 * @generated
	 */
	EList<String> getOccurances();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void EOperation0();

} // Requirement
