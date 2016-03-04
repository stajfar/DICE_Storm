/**
 */
package tosca_yaml_standard;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca_yaml_standard.Property#getProperty_name <em>Property name</em>}</li>
 *   <li>{@link tosca_yaml_standard.Property#getProperty_hasParameters <em>Property has Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca_yaml_standard.Tosca_yaml_standardPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject {
	/**
	 * Returns the value of the '<em><b>Property name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property name</em>' attribute.
	 * @see #setProperty_name(String)
	 * @see tosca_yaml_standard.Tosca_yaml_standardPackage#getProperty_Property_name()
	 * @model id="true"
	 * @generated
	 */
	String getProperty_name();

	/**
	 * Sets the value of the '{@link tosca_yaml_standard.Property#getProperty_name <em>Property name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property name</em>' attribute.
	 * @see #getProperty_name()
	 * @generated
	 */
	void setProperty_name(String value);

	/**
	 * Returns the value of the '<em><b>Property has Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link tosca_yaml_standard.Property_parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property has Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property has Parameters</em>' containment reference list.
	 * @see tosca_yaml_standard.Tosca_yaml_standardPackage#getProperty_Property_hasParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property_parameter> getProperty_hasParameters();

} // Property
