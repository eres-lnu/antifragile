/**
 */
package model.nodes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Networked System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.nodes.NetworkedSystem#getNodes <em>Nodes</em>}</li>
 *   <li>{@link model.nodes.NetworkedSystem#getVectors <em>Vectors</em>}</li>
 *   <li>{@link model.nodes.NetworkedSystem#getSofware <em>Sofware</em>}</li>
 *   <li>{@link model.nodes.NetworkedSystem#getHardware <em>Hardware</em>}</li>
 * </ul>
 *
 * @see model.nodes.NodesPackage#getNetworkedSystem()
 * @model
 * @generated
 */
public interface NetworkedSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link model.nodes.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see model.nodes.NodesPackage#getNetworkedSystem_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Vectors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vectors</em>' containment reference.
	 * @see #setVectors(AttackVectors)
	 * @see model.nodes.NodesPackage#getNetworkedSystem_Vectors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AttackVectors getVectors();

	/**
	 * Sets the value of the '{@link model.nodes.NetworkedSystem#getVectors <em>Vectors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vectors</em>' containment reference.
	 * @see #getVectors()
	 * @generated
	 */
	void setVectors(AttackVectors value);

	/**
	 * Returns the value of the '<em><b>Sofware</b></em>' containment reference list.
	 * The list contents are of type {@link model.nodes.SoftwareType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sofware</em>' containment reference list.
	 * @see model.nodes.NodesPackage#getNetworkedSystem_Sofware()
	 * @model containment="true"
	 * @generated
	 */
	EList<SoftwareType> getSofware();

	/**
	 * Returns the value of the '<em><b>Hardware</b></em>' containment reference list.
	 * The list contents are of type {@link model.nodes.HardwareType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware</em>' containment reference list.
	 * @see model.nodes.NodesPackage#getNetworkedSystem_Hardware()
	 * @model containment="true"
	 * @generated
	 */
	EList<HardwareType> getHardware();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addNode(Node n);

} // NetworkedSystem
