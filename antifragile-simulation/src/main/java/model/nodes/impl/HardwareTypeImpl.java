/**
 */
package model.nodes.impl;

import model.nodes.HardwareType;
import model.nodes.NodesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.nodes.impl.HardwareTypeImpl#getHardwareID <em>Hardware ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HardwareTypeImpl extends MinimalEObjectImpl.Container implements HardwareType {
	/**
	 * The default value of the '{@link #getHardwareID() <em>Hardware ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareID()
	 * @generated
	 * @ordered
	 */
	protected static final String HARDWARE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHardwareID() <em>Hardware ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareID()
	 * @generated
	 * @ordered
	 */
	protected String hardwareID = HARDWARE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NodesPackage.Literals.HARDWARE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHardwareID() {
		return hardwareID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardwareID(String newHardwareID) {
		String oldHardwareID = hardwareID;
		hardwareID = newHardwareID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.HARDWARE_TYPE__HARDWARE_ID, oldHardwareID, hardwareID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NodesPackage.HARDWARE_TYPE__HARDWARE_ID:
				return getHardwareID();
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
			case NodesPackage.HARDWARE_TYPE__HARDWARE_ID:
				setHardwareID((String)newValue);
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
			case NodesPackage.HARDWARE_TYPE__HARDWARE_ID:
				setHardwareID(HARDWARE_ID_EDEFAULT);
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
			case NodesPackage.HARDWARE_TYPE__HARDWARE_ID:
				return HARDWARE_ID_EDEFAULT == null ? hardwareID != null : !HARDWARE_ID_EDEFAULT.equals(hardwareID);
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
		result.append(" (hardwareID: ");
		result.append(hardwareID);
		result.append(')');
		return result.toString();
	}

} //HardwareTypeImpl
