/**
 */
package tosca.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tosca.EFeatureMapEntryType;
import tosca.EFeatureMapType;
import tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EFeature Map Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tosca.impl.EFeatureMapTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link tosca.impl.EFeatureMapTypeImpl#getPropertyKeyValuePair <em>Property Key Value Pair</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EFeatureMapTypeImpl extends MinimalEObjectImpl.Container implements EFeatureMapType {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPropertyKeyValuePair() <em>Property Key Value Pair</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyKeyValuePair()
	 * @generated
	 * @ordered
	 */
	protected EList<EFeatureMapEntryType> propertyKeyValuePair;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EFeatureMapTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.EFEATURE_MAP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.EFEATURE_MAP_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EFeatureMapEntryType> getPropertyKeyValuePair() {
		if (propertyKeyValuePair == null) {
			propertyKeyValuePair = new EObjectContainmentEList<EFeatureMapEntryType>(EFeatureMapEntryType.class, this, ToscaPackage.EFEATURE_MAP_TYPE__PROPERTY_KEY_VALUE_PAIR);
		}
		return propertyKeyValuePair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToscaPackage.EFEATURE_MAP_TYPE__PROPERTY_KEY_VALUE_PAIR:
				return ((InternalEList<?>)getPropertyKeyValuePair()).basicRemove(otherEnd, msgs);
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
			case ToscaPackage.EFEATURE_MAP_TYPE__ID:
				return getId();
			case ToscaPackage.EFEATURE_MAP_TYPE__PROPERTY_KEY_VALUE_PAIR:
				return getPropertyKeyValuePair();
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
			case ToscaPackage.EFEATURE_MAP_TYPE__ID:
				setId((String)newValue);
				return;
			case ToscaPackage.EFEATURE_MAP_TYPE__PROPERTY_KEY_VALUE_PAIR:
				getPropertyKeyValuePair().clear();
				getPropertyKeyValuePair().addAll((Collection<? extends EFeatureMapEntryType>)newValue);
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
			case ToscaPackage.EFEATURE_MAP_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case ToscaPackage.EFEATURE_MAP_TYPE__PROPERTY_KEY_VALUE_PAIR:
				getPropertyKeyValuePair().clear();
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
			case ToscaPackage.EFEATURE_MAP_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ToscaPackage.EFEATURE_MAP_TYPE__PROPERTY_KEY_VALUE_PAIR:
				return propertyKeyValuePair != null && !propertyKeyValuePair.isEmpty();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //EFeatureMapTypeImpl
