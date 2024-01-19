/**
 */
package model.nodes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.nodes.SoftwareType#getSoftwareId <em>Software Id</em>}</li>
 * </ul>
 *
 * @see model.nodes.NodesPackage#getSoftwareType()
 * @model
 * @generated
 */
public interface SoftwareType extends EObject {
	/**
	 * Returns the value of the '<em><b>Software Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Id</em>' attribute.
	 * @see #setSoftwareId(String)
	 * @see model.nodes.NodesPackage#getSoftwareType_SoftwareId()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getSoftwareId();

	/**
	 * Sets the value of the '{@link model.nodes.SoftwareType#getSoftwareId <em>Software Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Id</em>' attribute.
	 * @see #getSoftwareId()
	 * @generated
	 */
	void setSoftwareId(String value);

} // SoftwareType
