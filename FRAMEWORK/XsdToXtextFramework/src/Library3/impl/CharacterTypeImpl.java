/**
 */
package Library3.impl;

import Library3.CharacterType;
import Library3.Library3Package;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Character Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Library3.impl.CharacterTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Library3.impl.CharacterTypeImpl#getFriendOf <em>Friend Of</em>}</li>
 *   <li>{@link Library3.impl.CharacterTypeImpl#getSince <em>Since</em>}</li>
 *   <li>{@link Library3.impl.CharacterTypeImpl#getQualification <em>Qualification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CharacterTypeImpl extends MinimalEObjectImpl.Container implements CharacterType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFriendOf() <em>Friend Of</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFriendOf()
	 * @generated
	 * @ordered
	 */
	protected EList<String> friendOf;

	/**
	 * The default value of the '{@link #getSince() <em>Since</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSince()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar SINCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSince() <em>Since</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSince()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar since = SINCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualification() <em>Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualification()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualification() <em>Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualification()
	 * @generated
	 * @ordered
	 */
	protected String qualification = QUALIFICATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Library3Package.Literals.CHARACTER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Library3Package.CHARACTER_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFriendOf() {
		if (friendOf == null) {
			friendOf = new EDataTypeEList<String>(String.class, this, Library3Package.CHARACTER_TYPE__FRIEND_OF);
		}
		return friendOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getSince() {
		return since;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSince(XMLGregorianCalendar newSince) {
		XMLGregorianCalendar oldSince = since;
		since = newSince;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Library3Package.CHARACTER_TYPE__SINCE, oldSince, since));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualification() {
		return qualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualification(String newQualification) {
		String oldQualification = qualification;
		qualification = newQualification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Library3Package.CHARACTER_TYPE__QUALIFICATION, oldQualification, qualification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Library3Package.CHARACTER_TYPE__NAME:
				return getName();
			case Library3Package.CHARACTER_TYPE__FRIEND_OF:
				return getFriendOf();
			case Library3Package.CHARACTER_TYPE__SINCE:
				return getSince();
			case Library3Package.CHARACTER_TYPE__QUALIFICATION:
				return getQualification();
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
			case Library3Package.CHARACTER_TYPE__NAME:
				setName((String)newValue);
				return;
			case Library3Package.CHARACTER_TYPE__FRIEND_OF:
				getFriendOf().clear();
				getFriendOf().addAll((Collection<? extends String>)newValue);
				return;
			case Library3Package.CHARACTER_TYPE__SINCE:
				setSince((XMLGregorianCalendar)newValue);
				return;
			case Library3Package.CHARACTER_TYPE__QUALIFICATION:
				setQualification((String)newValue);
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
			case Library3Package.CHARACTER_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Library3Package.CHARACTER_TYPE__FRIEND_OF:
				getFriendOf().clear();
				return;
			case Library3Package.CHARACTER_TYPE__SINCE:
				setSince(SINCE_EDEFAULT);
				return;
			case Library3Package.CHARACTER_TYPE__QUALIFICATION:
				setQualification(QUALIFICATION_EDEFAULT);
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
			case Library3Package.CHARACTER_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Library3Package.CHARACTER_TYPE__FRIEND_OF:
				return friendOf != null && !friendOf.isEmpty();
			case Library3Package.CHARACTER_TYPE__SINCE:
				return SINCE_EDEFAULT == null ? since != null : !SINCE_EDEFAULT.equals(since);
			case Library3Package.CHARACTER_TYPE__QUALIFICATION:
				return QUALIFICATION_EDEFAULT == null ? qualification != null : !QUALIFICATION_EDEFAULT.equals(qualification);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", friendOf: ");
		result.append(friendOf);
		result.append(", since: ");
		result.append(since);
		result.append(", qualification: ");
		result.append(qualification);
		result.append(')');
		return result.toString();
	}

} //CharacterTypeImpl
