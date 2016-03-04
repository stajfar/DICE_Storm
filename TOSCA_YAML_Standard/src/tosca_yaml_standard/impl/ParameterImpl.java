/**
 */
package tosca_yaml_standard.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tosca_yaml_standard.Parameter;
import tosca_yaml_standard.Tosca_yaml_standardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tosca_yaml_standard.impl.ParameterImpl#getParameter_name <em>Parameter name</em>}</li>
 *   <li>{@link tosca_yaml_standard.impl.ParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link tosca_yaml_standard.impl.ParameterImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link tosca_yaml_standard.impl.ParameterImpl#getValue <em>Value</em>}</li>
 *   <li>{@link tosca_yaml_standard.impl.ParameterImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link tosca_yaml_standard.impl.ParameterImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link tosca_yaml_standard.impl.ParameterImpl#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends MinimalEObjectImpl.Container implements Parameter {
	/**
	 * The default value of the '{@link #getParameter_name() <em>Parameter name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter_name()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameter_name() <em>Parameter name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter_name()
	 * @generated
	 * @ordered
	 */
	protected String parameter_name = PARAMETER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected String required = REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected String default_ = DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tosca_yaml_standardPackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameter_name() {
		return parameter_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter_name(String newParameter_name) {
		String oldParameter_name = parameter_name;
		parameter_name = newParameter_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tosca_yaml_standardPackage.PARAMETER__PARAMETER_NAME, oldParameter_name, parameter_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tosca_yaml_standardPackage.PARAMETER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tosca_yaml_standardPackage.PARAMETER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tosca_yaml_standardPackage.PARAMETER__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(String newRequired) {
		String oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tosca_yaml_standardPackage.PARAMETER__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault) {
		String oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tosca_yaml_standardPackage.PARAMETER__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tosca_yaml_standardPackage.PARAMETER__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tosca_yaml_standardPackage.PARAMETER__PARAMETER_NAME:
				return getParameter_name();
			case Tosca_yaml_standardPackage.PARAMETER__TYPE:
				return getType();
			case Tosca_yaml_standardPackage.PARAMETER__DESCRIPTION:
				return getDescription();
			case Tosca_yaml_standardPackage.PARAMETER__VALUE:
				return getValue();
			case Tosca_yaml_standardPackage.PARAMETER__REQUIRED:
				return getRequired();
			case Tosca_yaml_standardPackage.PARAMETER__DEFAULT:
				return getDefault();
			case Tosca_yaml_standardPackage.PARAMETER__STATUS:
				return getStatus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Tosca_yaml_standardPackage.PARAMETER__PARAMETER_NAME:
				setParameter_name((String)newValue);
				return;
			case Tosca_yaml_standardPackage.PARAMETER__TYPE:
				setType((String)newValue);
				return;
			case Tosca_yaml_standardPackage.PARAMETER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Tosca_yaml_standardPackage.PARAMETER__VALUE:
				setValue((String)newValue);
				return;
			case Tosca_yaml_standardPackage.PARAMETER__REQUIRED:
				setRequired((String)newValue);
				return;
			case Tosca_yaml_standardPackage.PARAMETER__DEFAULT:
				setDefault((String)newValue);
				return;
			case Tosca_yaml_standardPackage.PARAMETER__STATUS:
				setStatus((String)newValue);
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
			case Tosca_yaml_standardPackage.PARAMETER__PARAMETER_NAME:
				setParameter_name(PARAMETER_NAME_EDEFAULT);
				return;
			case Tosca_yaml_standardPackage.PARAMETER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Tosca_yaml_standardPackage.PARAMETER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Tosca_yaml_standardPackage.PARAMETER__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case Tosca_yaml_standardPackage.PARAMETER__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case Tosca_yaml_standardPackage.PARAMETER__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case Tosca_yaml_standardPackage.PARAMETER__STATUS:
				setStatus(STATUS_EDEFAULT);
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
			case Tosca_yaml_standardPackage.PARAMETER__PARAMETER_NAME:
				return PARAMETER_NAME_EDEFAULT == null ? parameter_name != null : !PARAMETER_NAME_EDEFAULT.equals(parameter_name);
			case Tosca_yaml_standardPackage.PARAMETER__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case Tosca_yaml_standardPackage.PARAMETER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Tosca_yaml_standardPackage.PARAMETER__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case Tosca_yaml_standardPackage.PARAMETER__REQUIRED:
				return REQUIRED_EDEFAULT == null ? required != null : !REQUIRED_EDEFAULT.equals(required);
			case Tosca_yaml_standardPackage.PARAMETER__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case Tosca_yaml_standardPackage.PARAMETER__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
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
		result.append(" (parameter_name: ");
		result.append(parameter_name);
		result.append(", type: ");
		result.append(type);
		result.append(", description: ");
		result.append(description);
		result.append(", value: ");
		result.append(value);
		result.append(", required: ");
		result.append(required);
		result.append(", default: ");
		result.append(default_);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
