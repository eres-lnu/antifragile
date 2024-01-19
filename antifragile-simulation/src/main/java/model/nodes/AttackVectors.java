/**
 */
package model.nodes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attack Vectors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.nodes.AttackVectors#getVulnerabilities <em>Vulnerabilities</em>}</li>
 * </ul>
 *
 * @see model.nodes.NodesPackage#getAttackVectors()
 * @model
 * @generated
 */
public interface AttackVectors extends EObject {
	/**
	 * Returns the value of the '<em><b>Vulnerabilities</b></em>' containment reference list.
	 * The list contents are of type {@link model.nodes.VulnerabilityExploit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vulnerabilities</em>' containment reference list.
	 * @see model.nodes.NodesPackage#getAttackVectors_Vulnerabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<VulnerabilityExploit> getVulnerabilities();

} // AttackVectors
