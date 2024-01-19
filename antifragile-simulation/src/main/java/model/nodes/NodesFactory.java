/**
 */
package model.nodes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see model.nodes.NodesPackage
 * @generated
 */
public interface NodesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NodesFactory eINSTANCE = model.nodes.impl.NodesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Networked System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Networked System</em>'.
	 * @generated
	 */
	NetworkedSystem createNetworkedSystem();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Attack Vectors</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attack Vectors</em>'.
	 * @generated
	 */
	AttackVectors createAttackVectors();

	/**
	 * Returns a new object of class '<em>Vulnerability Exploit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vulnerability Exploit</em>'.
	 * @generated
	 */
	VulnerabilityExploit createVulnerabilityExploit();

	/**
	 * Returns a new object of class '<em>Software Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Type</em>'.
	 * @generated
	 */
	SoftwareType createSoftwareType();

	/**
	 * Returns a new object of class '<em>Hardware Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Type</em>'.
	 * @generated
	 */
	HardwareType createHardwareType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NodesPackage getNodesPackage();

} //NodesFactory
