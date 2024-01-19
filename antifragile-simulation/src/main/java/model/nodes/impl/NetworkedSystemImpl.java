/**
 */
package model.nodes.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import model.nodes.AttackVectors;
import model.nodes.HardwareType;
import model.nodes.NetworkedSystem;
import model.nodes.Node;
import model.nodes.NodesPackage;
import model.nodes.SoftwareType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Networked System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.nodes.impl.NetworkedSystemImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link model.nodes.impl.NetworkedSystemImpl#getVectors <em>Vectors</em>}</li>
 *   <li>{@link model.nodes.impl.NetworkedSystemImpl#getSofware <em>Sofware</em>}</li>
 *   <li>{@link model.nodes.impl.NetworkedSystemImpl#getHardware <em>Hardware</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkedSystemImpl extends MinimalEObjectImpl.Container implements NetworkedSystem {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * The cached value of the '{@link #getVectors() <em>Vectors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectors()
	 * @generated
	 * @ordered
	 */
	protected AttackVectors vectors;

	/**
	 * The cached value of the '{@link #getSofware() <em>Sofware</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSofware()
	 * @generated
	 * @ordered
	 */
	protected EList<SoftwareType> sofware;

	/**
	 * The cached value of the '{@link #getHardware() <em>Hardware</em>}' containment reference list.
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
	protected NetworkedSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NodesPackage.Literals.NETWORKED_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NETWORKED_SYSTEM__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackVectors getVectors() {
		return vectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVectors(AttackVectors newVectors, NotificationChain msgs) {
		AttackVectors oldVectors = vectors;
		vectors = newVectors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NETWORKED_SYSTEM__VECTORS, oldVectors, newVectors);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVectors(AttackVectors newVectors) {
		if (newVectors != vectors) {
			NotificationChain msgs = null;
			if (vectors != null)
				msgs = ((InternalEObject)vectors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NETWORKED_SYSTEM__VECTORS, null, msgs);
			if (newVectors != null)
				msgs = ((InternalEObject)newVectors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NETWORKED_SYSTEM__VECTORS, null, msgs);
			msgs = basicSetVectors(newVectors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NETWORKED_SYSTEM__VECTORS, newVectors, newVectors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftwareType> getSofware() {
		if (sofware == null) {
			sofware = new EObjectContainmentEList<SoftwareType>(SoftwareType.class, this, NodesPackage.NETWORKED_SYSTEM__SOFWARE);
		}
		return sofware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareType> getHardware() {
		if (hardware == null) {
			hardware = new EObjectContainmentEList<HardwareType>(HardwareType.class, this, NodesPackage.NETWORKED_SYSTEM__HARDWARE);
		}
		return hardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addNode(final Node n) {
		getNodes().add(n);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NodesPackage.NETWORKED_SYSTEM__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case NodesPackage.NETWORKED_SYSTEM__VECTORS:
				return basicSetVectors(null, msgs);
			case NodesPackage.NETWORKED_SYSTEM__SOFWARE:
				return ((InternalEList<?>)getSofware()).basicRemove(otherEnd, msgs);
			case NodesPackage.NETWORKED_SYSTEM__HARDWARE:
				return ((InternalEList<?>)getHardware()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NodesPackage.NETWORKED_SYSTEM__NODES:
				return getNodes();
			case NodesPackage.NETWORKED_SYSTEM__VECTORS:
				return getVectors();
			case NodesPackage.NETWORKED_SYSTEM__SOFWARE:
				return getSofware();
			case NodesPackage.NETWORKED_SYSTEM__HARDWARE:
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
			case NodesPackage.NETWORKED_SYSTEM__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NETWORKED_SYSTEM__VECTORS:
				setVectors((AttackVectors)newValue);
				return;
			case NodesPackage.NETWORKED_SYSTEM__SOFWARE:
				getSofware().clear();
				getSofware().addAll((Collection<? extends SoftwareType>)newValue);
				return;
			case NodesPackage.NETWORKED_SYSTEM__HARDWARE:
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
			case NodesPackage.NETWORKED_SYSTEM__NODES:
				getNodes().clear();
				return;
			case NodesPackage.NETWORKED_SYSTEM__VECTORS:
				setVectors((AttackVectors)null);
				return;
			case NodesPackage.NETWORKED_SYSTEM__SOFWARE:
				getSofware().clear();
				return;
			case NodesPackage.NETWORKED_SYSTEM__HARDWARE:
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
			case NodesPackage.NETWORKED_SYSTEM__NODES:
				return nodes != null && !nodes.isEmpty();
			case NodesPackage.NETWORKED_SYSTEM__VECTORS:
				return vectors != null;
			case NodesPackage.NETWORKED_SYSTEM__SOFWARE:
				return sofware != null && !sofware.isEmpty();
			case NodesPackage.NETWORKED_SYSTEM__HARDWARE:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case NodesPackage.NETWORKED_SYSTEM___ADD_NODE__NODE:
				addNode((Node)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //NetworkedSystemImpl
