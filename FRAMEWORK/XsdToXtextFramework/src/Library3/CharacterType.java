/**
 */
package Library3;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Library3.CharacterType#getName <em>Name</em>}</li>
 *   <li>{@link Library3.CharacterType#getFriendOf <em>Friend Of</em>}</li>
 *   <li>{@link Library3.CharacterType#getSince <em>Since</em>}</li>
 *   <li>{@link Library3.CharacterType#getQualification <em>Qualification</em>}</li>
 * </ul>
 * </p>
 *
 * @see Library3.Library3Package#getCharacterType()
 * @model extendedMetaData="name='characterType' kind='elementOnly'"
 * @generated
 */
public interface CharacterType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Library3.Library3Package#getCharacterType_Name()
	 * @model dataType="Library3.NameType" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Library3.CharacterType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Friend Of</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Friend Of</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Friend Of</em>' attribute list.
	 * @see Library3.Library3Package#getCharacterType_FriendOf()
	 * @model unique="false" dataType="Library3.NameType"
	 *        extendedMetaData="kind='element' name='friend-of' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getFriendOf();

	/**
	 * Returns the value of the '<em><b>Since</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Since</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Since</em>' attribute.
	 * @see #setSince(XMLGregorianCalendar)
	 * @see Library3.Library3Package#getCharacterType_Since()
	 * @model dataType="Library3.SinceType" required="true"
	 *        extendedMetaData="kind='element' name='since' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getSince();

	/**
	 * Sets the value of the '{@link Library3.CharacterType#getSince <em>Since</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Since</em>' attribute.
	 * @see #getSince()
	 * @generated
	 */
	void setSince(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Qualification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualification</em>' attribute.
	 * @see #setQualification(String)
	 * @see Library3.Library3Package#getCharacterType_Qualification()
	 * @model dataType="Library3.DescType" required="true"
	 *        extendedMetaData="kind='element' name='qualification' namespace='##targetNamespace'"
	 * @generated
	 */
	String getQualification();

	/**
	 * Sets the value of the '{@link Library3.CharacterType#getQualification <em>Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualification</em>' attribute.
	 * @see #getQualification()
	 * @generated
	 */
	void setQualification(String value);

} // CharacterType
