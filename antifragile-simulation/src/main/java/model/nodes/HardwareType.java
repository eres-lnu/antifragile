/**
 */
package model.nodes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.nodes.HardwareType#getHardwareID <em>Hardware ID</em>}</li>
 * </ul>
 *
 * @see model.nodes.NodesPackage#getHardwareType()
 * @model
 * @generated
 */
public interface HardwareType extends EObject {
	/**
	 * Returns the value of the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware ID</em>' attribute.
	 * @see #setHardwareID(String)
	 * @see model.nodes.NodesPackage#getHardwareType_HardwareID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getHardwareID();

	/**
	 * Sets the value of the '{@link model.nodes.HardwareType#getHardwareID <em>Hardware ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware ID</em>' attribute.
	 * @see #getHardwareID()
	 * @generated
	 */
	void setHardwareID(String value);

} // HardwareType
