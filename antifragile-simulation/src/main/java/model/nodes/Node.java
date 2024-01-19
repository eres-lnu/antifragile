/**
 */
package model.nodes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.nodes.Node#getNeighbors <em>Neighbors</em>}</li>
 *   <li>{@link model.nodes.Node#getNodeID <em>Node ID</em>}</li>
 *   <li>{@link model.nodes.Node#isIsInfected <em>Is Infected</em>}</li>
 *   <li>{@link model.nodes.Node#getMeanHealingT <em>Mean Healing T</em>}</li>
 *   <li>{@link model.nodes.Node#isSecComm <em>Sec Comm</em>}</li>
 *   <li>{@link model.nodes.Node#getInstalledSoftware <em>Installed Software</em>}</li>
 *   <li>{@link model.nodes.Node#getHardware <em>Hardware</em>}</li>
 * </ul>
 *
 * @see model.nodes.NodesPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Neighbors</b></em>' reference list.
	 * The list contents are of type {@link model.nodes.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neighbors</em>' reference list.
	 * @see model.nodes.NodesPackage#getNode_Neighbors()
	 * @model
	 * @generated
	 */
	EList<Node> getNeighbors();

	/**
	 * Returns the value of the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node ID</em>' attribute.
	 * @see #setNodeID(String)
	 * @see model.nodes.NodesPackage#getNode_NodeID()
	 * @model required="true"
	 * @generated
	 */
	String getNodeID();

	/**
	 * Sets the value of the '{@link model.nodes.Node#getNodeID <em>Node ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node ID</em>' attribute.
	 * @see #getNodeID()
	 * @generated
	 */
	void setNodeID(String value);

	/**
	 * Returns the value of the '<em><b>Is Infected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Infected</em>' attribute.
	 * @see #setIsInfected(boolean)
	 * @see model.nodes.NodesPackage#getNode_IsInfected()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsInfected();

	/**
	 * Sets the value of the '{@link model.nodes.Node#isIsInfected <em>Is Infected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Infected</em>' attribute.
	 * @see #isIsInfected()
	 * @generated
	 */
	void setIsInfected(boolean value);

	/**
	 * Returns the value of the '<em><b>Mean Healing T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mean Healing T</em>' attribute.
	 * @see #setMeanHealingT(double)
	 * @see model.nodes.NodesPackage#getNode_MeanHealingT()
	 * @model required="true"
	 * @generated
	 */
	double getMeanHealingT();

	/**
	 * Sets the value of the '{@link model.nodes.Node#getMeanHealingT <em>Mean Healing T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean Healing T</em>' attribute.
	 * @see #getMeanHealingT()
	 * @generated
	 */
	void setMeanHealingT(double value);

	/**
	 * Returns the value of the '<em><b>Sec Comm</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sec Comm</em>' attribute.
	 * @see #setSecComm(boolean)
	 * @see model.nodes.NodesPackage#getNode_SecComm()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isSecComm();

	/**
	 * Sets the value of the '{@link model.nodes.Node#isSecComm <em>Sec Comm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sec Comm</em>' attribute.
	 * @see #isSecComm()
	 * @generated
	 */
	void setSecComm(boolean value);

	/**
	 * Returns the value of the '<em><b>Installed Software</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Installed Software</em>' reference.
	 * @see #setInstalledSoftware(SoftwareType)
	 * @see model.nodes.NodesPackage#getNode_InstalledSoftware()
	 * @model required="true"
	 * @generated
	 */
	SoftwareType getInstalledSoftware();

	/**
	 * Sets the value of the '{@link model.nodes.Node#getInstalledSoftware <em>Installed Software</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Installed Software</em>' reference.
	 * @see #getInstalledSoftware()
	 * @generated
	 */
	void setInstalledSoftware(SoftwareType value);

	/**
	 * Returns the value of the '<em><b>Hardware</b></em>' reference list.
	 * The list contents are of type {@link model.nodes.HardwareType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware</em>' reference list.
	 * @see model.nodes.NodesPackage#getNode_Hardware()
	 * @model
	 * @generated
	 */
	EList<HardwareType> getHardware();

} // Node
