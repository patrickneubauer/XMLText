/**
 */
package Library3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Book Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Library3.BookType#getTitle <em>Title</em>}</li>
 *   <li>{@link Library3.BookType#getAuthor <em>Author</em>}</li>
 *   <li>{@link Library3.BookType#getCharacter <em>Character</em>}</li>
 *   <li>{@link Library3.BookType#getIsbn <em>Isbn</em>}</li>
 * </ul>
 * </p>
 *
 * @see Library3.Library3Package#getBookType()
 * @model extendedMetaData="name='bookType' kind='elementOnly'"
 * @generated
 */
public interface BookType extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see Library3.Library3Package#getBookType_Title()
	 * @model dataType="Library3.NameType" required="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link Library3.BookType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see Library3.Library3Package#getBookType_Author()
	 * @model dataType="Library3.NameType" required="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link Library3.BookType#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Character</b></em>' containment reference list.
	 * The list contents are of type {@link Library3.CharacterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Character</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character</em>' containment reference list.
	 * @see Library3.Library3Package#getBookType_Character()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='character' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CharacterType> getCharacter();

	/**
	 * Returns the value of the '<em><b>Isbn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isbn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isbn</em>' attribute.
	 * @see #setIsbn(String)
	 * @see Library3.Library3Package#getBookType_Isbn()
	 * @model dataType="Library3.IsbnType" required="true"
	 *        extendedMetaData="kind='attribute' name='isbn' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIsbn();

	/**
	 * Sets the value of the '{@link Library3.BookType#getIsbn <em>Isbn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isbn</em>' attribute.
	 * @see #getIsbn()
	 * @generated
	 */
	void setIsbn(String value);

} // BookType
