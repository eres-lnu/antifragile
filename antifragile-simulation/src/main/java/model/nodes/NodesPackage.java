/**
 */
package model.nodes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.nodes.NodesFactory
 * @model kind="package"
 * @generated
 */
public interface NodesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "nodes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nodes.antifragile.eres.lnu.se";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nodes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NodesPackage eINSTANCE = model.nodes.impl.NodesPackageImpl.init();

	/**
	 * The meta object id for the '{@link model.nodes.impl.NetworkedSystemImpl <em>Networked System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.nodes.impl.NetworkedSystemImpl
	 * @see model.nodes.impl.NodesPackageImpl#getNetworkedSystem()
	 * @generated
	 */
	int NETWORKED_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKED_SYSTEM__NODES = 0;

	/**
	 * The feature id for the '<em><b>Vectors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKED_SYSTEM__VECTORS = 1;

	/**
	 * The feature id for the '<em><b>Sofware</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKED_SYSTEM__SOFWARE = 2;

	/**
	 * The feature id for the '<em><b>Hardware</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKED_SYSTEM__HARDWARE = 3;

	/**
	 * The number of structural features of the '<em>Networked System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKED_SYSTEM_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Add Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKED_SYSTEM___ADD_NODE__NODE = 0;

	/**
	 * The number of operations of the '<em>Networked System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKED_SYSTEM_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.nodes.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.nodes.impl.NodeImpl
	 * @see model.nodes.impl.NodesPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Neighbors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NEIGHBORS = 0;

	/**
	 * The feature id for the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NODE_ID = 1;

	/**
	 * The feature id for the '<em><b>Is Infected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__IS_INFECTED = 2;

	/**
	 * The feature id for the '<em><b>Mean Healing T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MEAN_HEALING_T = 3;

	/**
	 * The feature id for the '<em><b>Sec Comm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SEC_COMM = 4;

	/**
	 * The feature id for the '<em><b>Installed Software</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INSTALLED_SOFTWARE = 5;

	/**
	 * The feature id for the '<em><b>Hardware</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__HARDWARE = 6;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.nodes.impl.AttackVectorsImpl <em>Attack Vectors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.nodes.impl.AttackVectorsImpl
	 * @see model.nodes.impl.NodesPackageImpl#getAttackVectors()
	 * @generated
	 */
	int ATTACK_VECTORS = 2;

	/**
	 * The feature id for the '<em><b>Vulnerabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_VECTORS__VULNERABILITIES = 0;

	/**
	 * The number of structural features of the '<em>Attack Vectors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_VECTORS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Attack Vectors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_VECTORS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.nodes.impl.VulnerabilityExploitImpl <em>Vulnerability Exploit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.nodes.impl.VulnerabilityExploitImpl
	 * @see model.nodes.impl.NodesPackageImpl#getVulnerabilityExploit()
	 * @generated
	 */
	int VULNERABILITY_EXPLOIT = 3;

	/**
	 * The feature id for the '<em><b>Vulnerability Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_EXPLOIT__VULNERABILITY_ID = 0;

	/**
	 * The feature id for the '<em><b>Prob Attack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_EXPLOIT__PROB_ATTACK = 1;

	/**
	 * The feature id for the '<em><b>Vulnerable Software</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_EXPLOIT__VULNERABLE_SOFTWARE = 2;

	/**
	 * The number of structural features of the '<em>Vulnerability Exploit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_EXPLOIT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Vulnerability Exploit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_EXPLOIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.nodes.impl.SoftwareTypeImpl <em>Software Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.nodes.impl.SoftwareTypeImpl
	 * @see model.nodes.impl.NodesPackageImpl#getSoftwareType()
	 * @generated
	 */
	int SOFTWARE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Software Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TYPE__SOFTWARE_ID = 0;

	/**
	 * The number of structural features of the '<em>Software Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Software Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.nodes.impl.HardwareTypeImpl <em>Hardware Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.nodes.impl.HardwareTypeImpl
	 * @see model.nodes.impl.NodesPackageImpl#getHardwareType()
	 * @generated
	 */
	int HARDWARE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TYPE__HARDWARE_ID = 0;

	/**
	 * The number of structural features of the '<em>Hardware Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Hardware Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link model.nodes.NetworkedSystem <em>Networked System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Networked System</em>'.
	 * @see model.nodes.NetworkedSystem
	 * @generated
	 */
	EClass getNetworkedSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link model.nodes.NetworkedSystem#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see model.nodes.NetworkedSystem#getNodes()
	 * @see #getNetworkedSystem()
	 * @generated
	 */
	EReference getNetworkedSystem_Nodes();

	/**
	 * Returns the meta object for the containment reference '{@link model.nodes.NetworkedSystem#getVectors <em>Vectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vectors</em>'.
	 * @see model.nodes.NetworkedSystem#getVectors()
	 * @see #getNetworkedSystem()
	 * @generated
	 */
	EReference getNetworkedSystem_Vectors();

	/**
	 * Returns the meta object for the containment reference list '{@link model.nodes.NetworkedSystem#getSofware <em>Sofware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sofware</em>'.
	 * @see model.nodes.NetworkedSystem#getSofware()
	 * @see #getNetworkedSystem()
	 * @generated
	 */
	EReference getNetworkedSystem_Sofware();

	/**
	 * Returns the meta object for the containment reference list '{@link model.nodes.NetworkedSystem#getHardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hardware</em>'.
	 * @see model.nodes.NetworkedSystem#getHardware()
	 * @see #getNetworkedSystem()
	 * @generated
	 */
	EReference getNetworkedSystem_Hardware();

	/**
	 * Returns the meta object for the '{@link model.nodes.NetworkedSystem#addNode(model.nodes.Node) <em>Add Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Node</em>' operation.
	 * @see model.nodes.NetworkedSystem#addNode(model.nodes.Node)
	 * @generated
	 */
	EOperation getNetworkedSystem__AddNode__Node();

	/**
	 * Returns the meta object for class '{@link model.nodes.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see model.nodes.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference list '{@link model.nodes.Node#getNeighbors <em>Neighbors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Neighbors</em>'.
	 * @see model.nodes.Node#getNeighbors()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Neighbors();

	/**
	 * Returns the meta object for the attribute '{@link model.nodes.Node#getNodeID <em>Node ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node ID</em>'.
	 * @see model.nodes.Node#getNodeID()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_NodeID();

	/**
	 * Returns the meta object for the attribute '{@link model.nodes.Node#isIsInfected <em>Is Infected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Infected</em>'.
	 * @see model.nodes.Node#isIsInfected()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_IsInfected();

	/**
	 * Returns the meta object for the attribute '{@link model.nodes.Node#getMeanHealingT <em>Mean Healing T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean Healing T</em>'.
	 * @see model.nodes.Node#getMeanHealingT()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_MeanHealingT();

	/**
	 * Returns the meta object for the attribute '{@link model.nodes.Node#isSecComm <em>Sec Comm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sec Comm</em>'.
	 * @see model.nodes.Node#isSecComm()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_SecComm();

	/**
	 * Returns the meta object for the reference '{@link model.nodes.Node#getInstalledSoftware <em>Installed Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Installed Software</em>'.
	 * @see model.nodes.Node#getInstalledSoftware()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_InstalledSoftware();

	/**
	 * Returns the meta object for the reference list '{@link model.nodes.Node#getHardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hardware</em>'.
	 * @see model.nodes.Node#getHardware()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Hardware();

	/**
	 * Returns the meta object for class '{@link model.nodes.AttackVectors <em>Attack Vectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attack Vectors</em>'.
	 * @see model.nodes.AttackVectors
	 * @generated
	 */
	EClass getAttackVectors();

	/**
	 * Returns the meta object for the containment reference list '{@link model.nodes.AttackVectors#getVulnerabilities <em>Vulnerabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vulnerabilities</em>'.
	 * @see model.nodes.AttackVectors#getVulnerabilities()
	 * @see #getAttackVectors()
	 * @generated
	 */
	EReference getAttackVectors_Vulnerabilities();

	/**
	 * Returns the meta object for class '{@link model.nodes.VulnerabilityExploit <em>Vulnerability Exploit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vulnerability Exploit</em>'.
	 * @see model.nodes.VulnerabilityExploit
	 * @generated
	 */
	EClass getVulnerabilityExploit();

	/**
	 * Returns the meta object for the attribute '{@link model.nodes.VulnerabilityExploit#getVulnerabilityId <em>Vulnerability Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vulnerability Id</em>'.
	 * @see model.nodes.VulnerabilityExploit#getVulnerabilityId()
	 * @see #getVulnerabilityExploit()
	 * @generated
	 */
	EAttribute getVulnerabilityExploit_VulnerabilityId();

	/**
	 * Returns the meta object for the attribute '{@link model.nodes.VulnerabilityExploit#getProbAttack <em>Prob Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prob Attack</em>'.
	 * @see model.nodes.VulnerabilityExploit#getProbAttack()
	 * @see #getVulnerabilityExploit()
	 * @generated
	 */
	EAttribute getVulnerabilityExploit_ProbAttack();

	/**
	 * Returns the meta object for the reference '{@link model.nodes.VulnerabilityExploit#getVulnerableSoftware <em>Vulnerable Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vulnerable Software</em>'.
	 * @see model.nodes.VulnerabilityExploit#getVulnerableSoftware()
	 * @see #getVulnerabilityExploit()
	 * @generated
	 */
	EReference getVulnerabilityExploit_VulnerableSoftware();

	/**
	 * Returns the meta object for class '{@link model.nodes.SoftwareType <em>Software Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Type</em>'.
	 * @see model.nodes.SoftwareType
	 * @generated
	 */
	EClass getSoftwareType();

	/**
	 * Returns the meta object for the attribute '{@link model.nodes.SoftwareType#getSoftwareId <em>Software Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Software Id</em>'.
	 * @see model.nodes.SoftwareType#getSoftwareId()
	 * @see #getSoftwareType()
	 * @generated
	 */
	EAttribute getSoftwareType_SoftwareId();

	/**
	 * Returns the meta object for class '{@link model.nodes.HardwareType <em>Hardware Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Type</em>'.
	 * @see model.nodes.HardwareType
	 * @generated
	 */
	EClass getHardwareType();

	/**
	 * Returns the meta object for the attribute '{@link model.nodes.HardwareType#getHardwareID <em>Hardware ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hardware ID</em>'.
	 * @see model.nodes.HardwareType#getHardwareID()
	 * @see #getHardwareType()
	 * @generated
	 */
	EAttribute getHardwareType_HardwareID();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NodesFactory getNodesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link model.nodes.impl.NetworkedSystemImpl <em>Networked System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.nodes.impl.NetworkedSystemImpl
		 * @see model.nodes.impl.NodesPackageImpl#getNetworkedSystem()
		 * @generated
		 */
		EClass NETWORKED_SYSTEM = eINSTANCE.getNetworkedSystem();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORKED_SYSTEM__NODES = eINSTANCE.getNetworkedSystem_Nodes();

		/**
		 * The meta object literal for the '<em><b>Vectors</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORKED_SYSTEM__VECTORS = eINSTANCE.getNetworkedSystem_Vectors();

		/**
		 * The meta object literal for the '<em><b>Sofware</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORKED_SYSTEM__SOFWARE = eINSTANCE.getNetworkedSystem_Sofware();

		/**
		 * The meta object literal for the '<em><b>Hardware</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORKED_SYSTEM__HARDWARE = eINSTANCE.getNetworkedSystem_Hardware();

		/**
		 * The meta object literal for the '<em><b>Add Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NETWORKED_SYSTEM___ADD_NODE__NODE = eINSTANCE.getNetworkedSystem__AddNode__Node();

		/**
		 * The meta object literal for the '{@link model.nodes.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.nodes.impl.NodeImpl
		 * @see model.nodes.impl.NodesPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Neighbors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__NEIGHBORS = eINSTANCE.getNode_Neighbors();

		/**
		 * The meta object literal for the '<em><b>Node ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NODE_ID = eINSTANCE.getNode_NodeID();

		/**
		 * The meta object literal for the '<em><b>Is Infected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__IS_INFECTED = eINSTANCE.getNode_IsInfected();

		/**
		 * The meta object literal for the '<em><b>Mean Healing T</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__MEAN_HEALING_T = eINSTANCE.getNode_MeanHealingT();

		/**
		 * The meta object literal for the '<em><b>Sec Comm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__SEC_COMM = eINSTANCE.getNode_SecComm();

		/**
		 * The meta object literal for the '<em><b>Installed Software</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__INSTALLED_SOFTWARE = eINSTANCE.getNode_InstalledSoftware();

		/**
		 * The meta object literal for the '<em><b>Hardware</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__HARDWARE = eINSTANCE.getNode_Hardware();

		/**
		 * The meta object literal for the '{@link model.nodes.impl.AttackVectorsImpl <em>Attack Vectors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.nodes.impl.AttackVectorsImpl
		 * @see model.nodes.impl.NodesPackageImpl#getAttackVectors()
		 * @generated
		 */
		EClass ATTACK_VECTORS = eINSTANCE.getAttackVectors();

		/**
		 * The meta object literal for the '<em><b>Vulnerabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACK_VECTORS__VULNERABILITIES = eINSTANCE.getAttackVectors_Vulnerabilities();

		/**
		 * The meta object literal for the '{@link model.nodes.impl.VulnerabilityExploitImpl <em>Vulnerability Exploit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.nodes.impl.VulnerabilityExploitImpl
		 * @see model.nodes.impl.NodesPackageImpl#getVulnerabilityExploit()
		 * @generated
		 */
		EClass VULNERABILITY_EXPLOIT = eINSTANCE.getVulnerabilityExploit();

		/**
		 * The meta object literal for the '<em><b>Vulnerability Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VULNERABILITY_EXPLOIT__VULNERABILITY_ID = eINSTANCE.getVulnerabilityExploit_VulnerabilityId();

		/**
		 * The meta object literal for the '<em><b>Prob Attack</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VULNERABILITY_EXPLOIT__PROB_ATTACK = eINSTANCE.getVulnerabilityExploit_ProbAttack();

		/**
		 * The meta object literal for the '<em><b>Vulnerable Software</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VULNERABILITY_EXPLOIT__VULNERABLE_SOFTWARE = eINSTANCE.getVulnerabilityExploit_VulnerableSoftware();

		/**
		 * The meta object literal for the '{@link model.nodes.impl.SoftwareTypeImpl <em>Software Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.nodes.impl.SoftwareTypeImpl
		 * @see model.nodes.impl.NodesPackageImpl#getSoftwareType()
		 * @generated
		 */
		EClass SOFTWARE_TYPE = eINSTANCE.getSoftwareType();

		/**
		 * The meta object literal for the '<em><b>Software Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_TYPE__SOFTWARE_ID = eINSTANCE.getSoftwareType_SoftwareId();

		/**
		 * The meta object literal for the '{@link model.nodes.impl.HardwareTypeImpl <em>Hardware Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.nodes.impl.HardwareTypeImpl
		 * @see model.nodes.impl.NodesPackageImpl#getHardwareType()
		 * @generated
		 */
		EClass HARDWARE_TYPE = eINSTANCE.getHardwareType();

		/**
		 * The meta object literal for the '<em><b>Hardware ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_TYPE__HARDWARE_ID = eINSTANCE.getHardwareType_HardwareID();

	}

} //NodesPackage
