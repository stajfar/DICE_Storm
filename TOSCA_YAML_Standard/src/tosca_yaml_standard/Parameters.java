/**
 */
package tosca_yaml_standard;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca_yaml_standard.Parameters#getParemeters_hasParameter <em>Paremeters has Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca_yaml_standard.Tosca_yaml_standardPackage#getParameters()
 * @model
 * @generated
 */
public interface Parameters extends EObject {
	/**
	 * Returns the value of the '<em><b>Paremeters has Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link tosca_yaml_standard.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paremeters has Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paremeters has Parameter</em>' containment reference list.
	 * @see tosca_yaml_standard.Tosca_yaml_standardPackage#getParameters_Paremeters_hasParameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParemeters_hasParameter();

} // Parameters
