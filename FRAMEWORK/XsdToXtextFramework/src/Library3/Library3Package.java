/**
 */
package Library3;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see Library3.Library3Factory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface Library3Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Library3";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/library3.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Library3";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Library3Package eINSTANCE = Library3.impl.Library3PackageImpl.init();

	/**
	 * The meta object id for the '{@link Library3.impl.BookTypeImpl <em>Book Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Library3.impl.BookTypeImpl
	 * @see Library3.impl.Library3PackageImpl#getBookType()
	 * @generated
	 */
	int BOOK_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE__AUTHOR = 1;

	/**
	 * The feature id for the '<em><b>Character</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE__CHARACTER = 2;

	/**
	 * The feature id for the '<em><b>Isbn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE__ISBN = 3;

	/**
	 * The number of structural features of the '<em>Book Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Book Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Library3.impl.CharacterTypeImpl <em>Character Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Library3.impl.CharacterTypeImpl
	 * @see Library3.impl.Library3PackageImpl#getCharacterType()
	 * @generated
	 */
	int CHARACTER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Friend Of</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_TYPE__FRIEND_OF = 1;

	/**
	 * The feature id for the '<em><b>Since</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_TYPE__SINCE = 2;

	/**
	 * The feature id for the '<em><b>Qualification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_TYPE__QUALIFICATION = 3;

	/**
	 * The number of structural features of the '<em>Character Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Character Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Library3.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Library3.impl.DocumentRootImpl
	 * @see Library3.impl.Library3PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Book</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOOK = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Desc Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see Library3.impl.Library3PackageImpl#getDescType()
	 * @generated
	 */
	int DESC_TYPE = 3;

	/**
	 * The meta object id for the '<em>Isbn Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see Library3.impl.Library3PackageImpl#getIsbnType()
	 * @generated
	 */
	int ISBN_TYPE = 4;

	/**
	 * The meta object id for the '<em>Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see Library3.impl.Library3PackageImpl#getNameType()
	 * @generated
	 */
	int NAME_TYPE = 5;

	/**
	 * The meta object id for the '<em>Since Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see Library3.impl.Library3PackageImpl#getSinceType()
	 * @generated
	 */
	int SINCE_TYPE = 6;


	/**
	 * Returns the meta object for class '{@link Library3.BookType <em>Book Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book Type</em>'.
	 * @see Library3.BookType
	 * @generated
	 */
	EClass getBookType();

	/**
	 * Returns the meta object for the attribute '{@link Library3.BookType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see Library3.BookType#getTitle()
	 * @see #getBookType()
	 * @generated
	 */
	EAttribute getBookType_Title();

	/**
	 * Returns the meta object for the attribute '{@link Library3.BookType#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see Library3.BookType#getAuthor()
	 * @see #getBookType()
	 * @generated
	 */
	EAttribute getBookType_Author();

	/**
	 * Returns the meta object for the containment reference list '{@link Library3.BookType#getCharacter <em>Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Character</em>'.
	 * @see Library3.BookType#getCharacter()
	 * @see #getBookType()
	 * @generated
	 */
	EReference getBookType_Character();

	/**
	 * Returns the meta object for the attribute '{@link Library3.BookType#getIsbn <em>Isbn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isbn</em>'.
	 * @see Library3.BookType#getIsbn()
	 * @see #getBookType()
	 * @generated
	 */
	EAttribute getBookType_Isbn();

	/**
	 * Returns the meta object for class '{@link Library3.CharacterType <em>Character Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Type</em>'.
	 * @see Library3.CharacterType
	 * @generated
	 */
	EClass getCharacterType();

	/**
	 * Returns the meta object for the attribute '{@link Library3.CharacterType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Library3.CharacterType#getName()
	 * @see #getCharacterType()
	 * @generated
	 */
	EAttribute getCharacterType_Name();

	/**
	 * Returns the meta object for the attribute list '{@link Library3.CharacterType#getFriendOf <em>Friend Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Friend Of</em>'.
	 * @see Library3.CharacterType#getFriendOf()
	 * @see #getCharacterType()
	 * @generated
	 */
	EAttribute getCharacterType_FriendOf();

	/**
	 * Returns the meta object for the attribute '{@link Library3.CharacterType#getSince <em>Since</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Since</em>'.
	 * @see Library3.CharacterType#getSince()
	 * @see #getCharacterType()
	 * @generated
	 */
	EAttribute getCharacterType_Since();

	/**
	 * Returns the meta object for the attribute '{@link Library3.CharacterType#getQualification <em>Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualification</em>'.
	 * @see Library3.CharacterType#getQualification()
	 * @see #getCharacterType()
	 * @generated
	 */
	EAttribute getCharacterType_Qualification();

	/**
	 * Returns the meta object for class '{@link Library3.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see Library3.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link Library3.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Library3.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link Library3.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see Library3.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link Library3.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see Library3.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link Library3.DocumentRoot#getBook <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Book</em>'.
	 * @see Library3.DocumentRoot#getBook()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Book();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Desc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Desc Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='descType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getDescType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Isbn Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Isbn Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='isbnType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[0-9]{10}'"
	 * @generated
	 */
	EDataType getIsbnType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='nameType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='32'"
	 * @generated
	 */
	EDataType getNameType();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Since Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Since Type</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='sinceType' baseType='http://www.eclipse.org/emf/2003/XMLType#date'"
	 * @generated
	 */
	EDataType getSinceType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Library3Factory getLibrary3Factory();

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
		 * The meta object literal for the '{@link Library3.impl.BookTypeImpl <em>Book Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Library3.impl.BookTypeImpl
		 * @see Library3.impl.Library3PackageImpl#getBookType()
		 * @generated
		 */
		EClass BOOK_TYPE = eINSTANCE.getBookType();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK_TYPE__TITLE = eINSTANCE.getBookType_Title();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK_TYPE__AUTHOR = eINSTANCE.getBookType_Author();

		/**
		 * The meta object literal for the '<em><b>Character</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK_TYPE__CHARACTER = eINSTANCE.getBookType_Character();

		/**
		 * The meta object literal for the '<em><b>Isbn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK_TYPE__ISBN = eINSTANCE.getBookType_Isbn();

		/**
		 * The meta object literal for the '{@link Library3.impl.CharacterTypeImpl <em>Character Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Library3.impl.CharacterTypeImpl
		 * @see Library3.impl.Library3PackageImpl#getCharacterType()
		 * @generated
		 */
		EClass CHARACTER_TYPE = eINSTANCE.getCharacterType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_TYPE__NAME = eINSTANCE.getCharacterType_Name();

		/**
		 * The meta object literal for the '<em><b>Friend Of</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_TYPE__FRIEND_OF = eINSTANCE.getCharacterType_FriendOf();

		/**
		 * The meta object literal for the '<em><b>Since</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_TYPE__SINCE = eINSTANCE.getCharacterType_Since();

		/**
		 * The meta object literal for the '<em><b>Qualification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_TYPE__QUALIFICATION = eINSTANCE.getCharacterType_Qualification();

		/**
		 * The meta object literal for the '{@link Library3.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Library3.impl.DocumentRootImpl
		 * @see Library3.impl.Library3PackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Book</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BOOK = eINSTANCE.getDocumentRoot_Book();

		/**
		 * The meta object literal for the '<em>Desc Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see Library3.impl.Library3PackageImpl#getDescType()
		 * @generated
		 */
		EDataType DESC_TYPE = eINSTANCE.getDescType();

		/**
		 * The meta object literal for the '<em>Isbn Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see Library3.impl.Library3PackageImpl#getIsbnType()
		 * @generated
		 */
		EDataType ISBN_TYPE = eINSTANCE.getIsbnType();

		/**
		 * The meta object literal for the '<em>Name Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see Library3.impl.Library3PackageImpl#getNameType()
		 * @generated
		 */
		EDataType NAME_TYPE = eINSTANCE.getNameType();

		/**
		 * The meta object literal for the '<em>Since Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see Library3.impl.Library3PackageImpl#getSinceType()
		 * @generated
		 */
		EDataType SINCE_TYPE = eINSTANCE.getSinceType();

	}

} //Library3Package
