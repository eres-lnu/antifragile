/**
 */
package model.nodes.impl;

import java.util.Collection;

import model.nodes.HardwareType;
import model.nodes.Node;
import model.nodes.NodesPackage;
import model.nodes.SoftwareType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.nodes.impl.NodeImpl#getNeighbors <em>Neighbors</em>}</li>
 *   <li>{@link model.nodes.impl.NodeImpl#getNodeID <em>Node ID</em>}</li>
 *   <li>{@link model.nodes.impl.NodeImpl#isIsInfected <em>Is Infected</em>}</li>
 *   <li>{@link model.nodes.impl.NodeImpl#getMeanHealingT <em>Mean Healing T</em>}</li>
 *   <li>{@link model.nodes.impl.NodeImpl#isSecComm <em>Sec Comm</em>}</li>
 *   <li>{@link model.nodes.impl.NodeImpl#getInstalledSoftware <em>Installed Software</em>}</li>
 *   <li>{@link model.nodes.impl.NodeImpl#getHardware <em>Hardware</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends MinimalEObjectImpl.Container implements Node {
	/**
	 * The cached value of the '{@link #getNeighbors() <em>Neighbors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeighbors()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> neighbors;

	/**
	 * The default value of the '{@link #getNodeID() <em>Node ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeID()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodeID() <em>Node ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeID()
	 * @generated
	 * @ordered
	 */
	protected String nodeID = NODE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsInfected() <em>Is Infected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInfected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INFECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInfected() <em>Is Infected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInfected()
	 * @generated
	 * @ordered
	 */
	protected boolean isInfected = IS_INFECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeanHealingT() <em>Mean Healing T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanHealingT()
	 * @generated
	 * @ordered
	 */
	protected static final double MEAN_HEALING_T_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMeanHealingT() <em>Mean Healing T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanHealingT()
	 * @generated
	 * @ordered
	 */
	protected double meanHealingT = MEAN_HEALING_T_EDEFAULT;

	/**
	 * The default value of the '{@link #isSecComm() <em>Sec Comm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSecComm()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SEC_COMM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSecComm() <em>Sec Comm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSecComm()
	 * @generated
	 * @ordered
	 */
	protected boolean secComm = SEC_COMM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInstalledSoftware() <em>Installed Software</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstalledSoftware()
	 * @generated
	 * @ordered
	 */
	protected SoftwareType installedSoftware;

	/**
	 * The cached value of the '{@link #getHardware() <em>Hardware</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardware()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareType> hardware;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NodesPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNeighbors() {
		if (neighbors == null) {
			neighbors = new EObjectResolvingEList<Node>(Node.class, this, NodesPackage.NODE__NEIGHBORS);
		}
		return neighbors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNodeID() {
		return nodeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeID(String newNodeID) {
		String oldNodeID = nodeID;
		nodeID = newNodeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__NODE_ID, oldNodeID, nodeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInfected() {
		return isInfected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInfected(boolean newIsInfected) {
		boolean oldIsInfected = isInfected;
		isInfected = newIsInfected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__IS_INFECTED, oldIsInfected, isInfected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMeanHealingT() {
		return meanHealingT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeanHealingT(double newMeanHealingT) {
		double oldMeanHealingT = meanHealingT;
		meanHealingT = newMeanHealingT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__MEAN_HEALING_T, oldMeanHealingT, meanHealingT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSecComm() {
		return secComm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecComm(boolean newSecComm) {
		boolean oldSecComm = secComm;
		secComm = newSecComm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__SEC_COMM, oldSecComm, secComm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareType getInstalledSoftware() {
		if (installedSoftware != null && installedSoftware.eIsProxy()) {
			InternalEObject oldInstalledSoftware = (InternalEObject)installedSoftware;
			installedSoftware = (SoftwareType)eResolveProxy(oldInstalledSoftware);
			if (installedSoftware != oldInstalledSoftware) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NodesPackage.NODE__INSTALLED_SOFTWARE, oldInstalledSoftware, installedSoftware));
			}
		}
		return installedSoftware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareType basicGetInstalledSoftware() {
		return installedSoftware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstalledSoftware(SoftwareType newInstalledSoftware) {
		SoftwareType oldInstalledSoftware = installedSoftware;
		installedSoftware = newInstalledSoftware;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__INSTALLED_SOFTWARE, oldInstalledSoftware, installedSoftware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareType> getHardware() {
		if (hardware == null) {
			hardware = new EObjectResolvingEList<HardwareType>(HardwareType.class, this, NodesPackage.NODE__HARDWARE);
		}
		return hardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NodesPackage.NODE__NEIGHBORS:
				return getNeighbors();
			case NodesPackage.NODE__NODE_ID:
				return getNodeID();
			case NodesPackage.NODE__IS_INFECTED:
				return isIsInfected();
			case NodesPackage.NODE__MEAN_HEALING_T:
				return getMeanHealingT();
			case NodesPackage.NODE__SEC_COMM:
				return isSecComm();
			case NodesPackage.NODE__INSTALLED_SOFTWARE:
				if (resolve) return getInstalledSoftware();
				return basicGetInstalledSoftware();
			case NodesPackage.NODE__HARDWARE:
				return getHardware();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NodesPackage.NODE__NEIGHBORS:
				getNeighbors().clear();
				getNeighbors().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__NODE_ID:
				setNodeID((String)newValue);
				return;
			case NodesPackage.NODE__IS_INFECTED:
				setIsInfected((Boolean)newValue);
				return;
			case NodesPackage.NODE__MEAN_HEALING_T:
				setMeanHealingT((Double)newValue);
				return;
			case NodesPackage.NODE__SEC_COMM:
				setSecComm((Boolean)newValue);
				return;
			case NodesPackage.NODE__INSTALLED_SOFTWARE:
				setInstalledSoftware((SoftwareType)newValue);
				return;
			case NodesPackage.NODE__HARDWARE:
				getHardware().clear();
				getHardware().addAll((Collection<? extends HardwareType>)newValue);
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
			case NodesPackage.NODE__NEIGHBORS:
				getNeighbors().clear();
				return;
			case NodesPackage.NODE__NODE_ID:
				setNodeID(NODE_ID_EDEFAULT);
				return;
			case NodesPackage.NODE__IS_INFECTED:
				setIsInfected(IS_INFECTED_EDEFAULT);
				return;
			case NodesPackage.NODE__MEAN_HEALING_T:
				setMeanHealingT(MEAN_HEALING_T_EDEFAULT);
				return;
			case NodesPackage.NODE__SEC_COMM:
				setSecComm(SEC_COMM_EDEFAULT);
				return;
			case NodesPackage.NODE__INSTALLED_SOFTWARE:
				setInstalledSoftware((SoftwareType)null);
				return;
			case NodesPackage.NODE__HARDWARE:
				getHardware().clear();
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
			case NodesPackage.NODE__NEIGHBORS:
				return neighbors != null && !neighbors.isEmpty();
			case NodesPackage.NODE__NODE_ID:
				return NODE_ID_EDEFAULT == null ? nodeID != null : !NODE_ID_EDEFAULT.equals(nodeID);
			case NodesPackage.NODE__IS_INFECTED:
				return isInfected != IS_INFECTED_EDEFAULT;
			case NodesPackage.NODE__MEAN_HEALING_T:
				return meanHealingT != MEAN_HEALING_T_EDEFAULT;
			case NodesPackage.NODE__SEC_COMM:
				return secComm != SEC_COMM_EDEFAULT;
			case NodesPackage.NODE__INSTALLED_SOFTWARE:
				return installedSoftware != null;
			case NodesPackage.NODE__HARDWARE:
				return hardware != null && !hardware.isEmpty();
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
		result.append(" (nodeID: ");
		result.append(nodeID);
		result.append(", isInfected: ");
		result.append(isInfected);
		result.append(", meanHealingT: ");
		result.append(meanHealingT);
		result.append(", secComm: ");
		result.append(secComm);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
