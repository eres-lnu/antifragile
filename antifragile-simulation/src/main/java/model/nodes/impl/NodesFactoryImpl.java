/**
 */
package model.nodes.impl;

import model.nodes.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NodesFactoryImpl extends EFactoryImpl implements NodesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NodesFactory init() {
		try {
			NodesFactory theNodesFactory = (NodesFactory)EPackage.Registry.INSTANCE.getEFactory(NodesPackage.eNS_URI);
			if (theNodesFactory != null) {
				return theNodesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NodesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodesFactoryImpl() {
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
			case NodesPackage.NETWORKED_SYSTEM: return createNetworkedSystem();
			case NodesPackage.NODE: return createNode();
			case NodesPackage.ATTACK_VECTORS: return createAttackVectors();
			case NodesPackage.VULNERABILITY_EXPLOIT: return createVulnerabilityExploit();
			case NodesPackage.SOFTWARE_TYPE: return createSoftwareType();
			case NodesPackage.HARDWARE_TYPE: return createHardwareType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkedSystem createNetworkedSystem() {
		NetworkedSystemImpl networkedSystem = new NetworkedSystemImpl();
		return networkedSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackVectors createAttackVectors() {
		AttackVectorsImpl attackVectors = new AttackVectorsImpl();
		return attackVectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VulnerabilityExploit createVulnerabilityExploit() {
		VulnerabilityExploitImpl vulnerabilityExploit = new VulnerabilityExploitImpl();
		return vulnerabilityExploit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareType createSoftwareType() {
		SoftwareTypeImpl softwareType = new SoftwareTypeImpl();
		return softwareType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareType createHardwareType() {
		HardwareTypeImpl hardwareType = new HardwareTypeImpl();
		return hardwareType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodesPackage getNodesPackage() {
		return (NodesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NodesPackage getPackage() {
		return NodesPackage.eINSTANCE;
	}

} //NodesFactoryImpl
