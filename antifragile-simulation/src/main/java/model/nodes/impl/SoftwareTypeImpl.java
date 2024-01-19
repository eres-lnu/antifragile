/**
 */
package model.nodes.impl;

import model.nodes.NodesPackage;
import model.nodes.SoftwareType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.nodes.impl.SoftwareTypeImpl#getSoftwareId <em>Software Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoftwareTypeImpl extends MinimalEObjectImpl.Container implements SoftwareType {
	/**
	 * The default value of the '{@link #getSoftwareId() <em>Software Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareId()
	 * @generated
	 * @ordered
	 */
	protected static final String SOFTWARE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoftwareId() <em>Software Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareId()
	 * @generated
	 * @ordered
	 */
	protected String softwareId = SOFTWARE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NodesPackage.Literals.SOFTWARE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSoftwareId() {
		return softwareId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftwareId(String newSoftwareId) {
		String oldSoftwareId = softwareId;
		softwareId = newSoftwareId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.SOFTWARE_TYPE__SOFTWARE_ID, oldSoftwareId, softwareId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NodesPackage.SOFTWARE_TYPE__SOFTWARE_ID:
				return getSoftwareId();
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
			case NodesPackage.SOFTWARE_TYPE__SOFTWARE_ID:
				setSoftwareId((String)newValue);
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
			case NodesPackage.SOFTWARE_TYPE__SOFTWARE_ID:
				setSoftwareId(SOFTWARE_ID_EDEFAULT);
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
			case NodesPackage.SOFTWARE_TYPE__SOFTWARE_ID:
				return SOFTWARE_ID_EDEFAULT == null ? softwareId != null : !SOFTWARE_ID_EDEFAULT.equals(softwareId);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (softwareId: ");
		result.append(softwareId);
		result.append(')');
		return result.toString();
	}

} //SoftwareTypeImpl
