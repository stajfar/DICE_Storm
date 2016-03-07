/**
 */
package tosca_yaml_standard.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tosca_yaml_standard.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Tosca_yaml_standardFactoryImpl extends EFactoryImpl implements Tosca_yaml_standardFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Tosca_yaml_standardFactory init() {
		try {
			Tosca_yaml_standardFactory theTosca_yaml_standardFactory = (Tosca_yaml_standardFactory)EPackage.Registry.INSTANCE.getEFactory(Tosca_yaml_standardPackage.eNS_URI);
			if (theTosca_yaml_standardFactory != null) {
				return theTosca_yaml_standardFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Tosca_yaml_standardFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_yaml_standardFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Tosca_yaml_standardPackage.NODE_TEMPLATE: return createNode_template();
			case Tosca_yaml_standardPackage.INTERFACE: return createInterface();
			case Tosca_yaml_standardPackage.SOURCE_INTERFACE: return createSource_interface();
			case Tosca_yaml_standardPackage.TARGET_INTERFACE: return createTarget_interface();
			case Tosca_yaml_standardPackage.RELATIONSHIP: return createRelationship();
			case Tosca_yaml_standardPackage.CONTAINED_IN: return createContained_in();
			case Tosca_yaml_standardPackage.CONNECTED_TO: return createConnected_to();
			case Tosca_yaml_standardPackage.PARAMETER: return createParameter();
			case Tosca_yaml_standardPackage.PROPERTY: return createProperty();
			case Tosca_yaml_standardPackage.ATTRIBUTE: return createAttribute();
			case Tosca_yaml_standardPackage.INPUT: return createInput();
			case Tosca_yaml_standardPackage.OUTPUT: return createOutput();
			case Tosca_yaml_standardPackage.REQUIREMENT: return createRequirement();
			case Tosca_yaml_standardPackage.OPERATION: return createOperation();
			case Tosca_yaml_standardPackage.SERVICE_TEMPLATE: return createService_Template();
			case Tosca_yaml_standardPackage.IMPORT: return createImport();
			case Tosca_yaml_standardPackage.INSTANCE: return createinstance();
			case Tosca_yaml_standardPackage.PARAMETERS: return createParameters();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node_template createNode_template() {
		Node_templateImpl node_template = new Node_templateImpl();
		return node_template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source_interface createSource_interface() {
		Source_interfaceImpl source_interface = new Source_interfaceImpl();
		return source_interface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Target_interface createTarget_interface() {
		Target_interfaceImpl target_interface = new Target_interfaceImpl();
		return target_interface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship createRelationship() {
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contained_in createContained_in() {
		Contained_inImpl contained_in = new Contained_inImpl();
		return contained_in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connected_to createConnected_to() {
		Connected_toImpl connected_to = new Connected_toImpl();
		return connected_to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement createRequirement() {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service_Template createService_Template() {
		Service_TemplateImpl service_Template = new Service_TemplateImpl();
		return service_Template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public instance createinstance() {
		instanceImpl instance = new instanceImpl();
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameters createParameters() {
		ParametersImpl parameters = new ParametersImpl();
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca_yaml_standardPackage getTosca_yaml_standardPackage() {
		return (Tosca_yaml_standardPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Tosca_yaml_standardPackage getPackage() {
		return Tosca_yaml_standardPackage.eINSTANCE;
	}

} //Tosca_yaml_standardFactoryImpl
