/**
 */
package tosca_yaml_standard.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tosca_yaml_standard.Property;
import tosca_yaml_standard.Property_parameter;
import tosca_yaml_standard.Tosca_yaml_standardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tosca_yaml_standard.impl.PropertyImpl#getProperty_name <em>Property name</em>}</li>
 *   <li>{@link tosca_yaml_standard.impl.PropertyImpl#getProperty_hasParameters <em>Property has Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends MinimalEObjectImpl.Container implements Property {
	/**
	 * The default value of the '{@link #getProperty_name() <em>Property name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty_name()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProperty_name() <em>Property name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty_name()
	 * @generated
	 * @ordered
	 */
	protected String property_name = PROPERTY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperty_hasParameters() <em>Property has Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty_hasParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Property_parameter> property_hasParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tosca_yaml_standardPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProperty_name() {
		return property_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty_name(String newProperty_name) {
		String oldProperty_name = property_name;
		property_name = newProperty_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tosca_yaml_standardPackage.PROPERTY__PROPERTY_NAME, oldProperty_name, property_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property_parameter> getProperty_hasParameters() {
		if (property_hasParameters == null) {
			property_hasParameters = new EObjectContainmentEList<Property_parameter>(Property_parameter.class, this, Tosca_yaml_standardPackage.PROPERTY__PROPERTY_HAS_PARAMETERS);
		}
		return property_hasParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tosca_yaml_standardPackage.PROPERTY__PROPERTY_HAS_PARAMETERS:
				return ((InternalEList<?>)getProperty_hasParameters()).basicRemove(otherEnd, msgs);
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
			case Tosca_yaml_standardPackage.PROPERTY__PROPERTY_NAME:
				return getProperty_name();
			case Tosca_yaml_standardPackage.PROPERTY__PROPERTY_HAS_PARAMETERS:
				return getProperty_hasParameters();
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
			case Tosca_yaml_standardPackage.PROPERTY__PROPERTY_NAME:
				setProperty_name((String)newValue);
				return;
			case Tosca_yaml_standardPackage.PROPERTY__PROPERTY_HAS_PARAMETERS:
				getProperty_hasParameters().clear();
				getProperty_hasParameters().addAll((Collection<? extends Property_parameter>)newValue);
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
			case Tosca_yaml_standardPackage.PROPERTY__PROPERTY_NAME:
				setProperty_name(PROPERTY_NAME_EDEFAULT);
				return;
			case Tosca_yaml_standardPackage.PROPERTY__PROPERTY_HAS_PARAMETERS:
				getProperty_hasParameters().clear();
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
			case Tosca_yaml_standardPackage.PROPERTY__PROPERTY_NAME:
				return PROPERTY_NAME_EDEFAULT == null ? property_name != null : !PROPERTY_NAME_EDEFAULT.equals(property_name);
			case Tosca_yaml_standardPackage.PROPERTY__PROPERTY_HAS_PARAMETERS:
				return property_hasParameters != null && !property_hasParameters.isEmpty();
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
		result.append(" (property_name: ");
		result.append(property_name);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
