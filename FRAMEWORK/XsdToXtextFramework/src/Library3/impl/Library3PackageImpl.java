/**
 */
package Library3.impl;

import Library3.BookType;
import Library3.CharacterType;
import Library3.DocumentRoot;
import Library3.Library3Factory;
import Library3.Library3Package;

import Library3.util.Library3Validator;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Library3PackageImpl extends EPackageImpl implements Library3Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType descTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType isbnTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sinceTypeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Library3.Library3Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Library3PackageImpl() {
		super(eNS_URI, Library3Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Library3Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Library3Package init() {
		if (isInited) return (Library3Package)EPackage.Registry.INSTANCE.getEPackage(Library3Package.eNS_URI);

		// Obtain or create and register package
		Library3PackageImpl theLibrary3Package = (Library3PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Library3PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Library3PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theLibrary3Package.createPackageContents();

		// Initialize created meta-data
		theLibrary3Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theLibrary3Package, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Library3Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theLibrary3Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Library3Package.eNS_URI, theLibrary3Package);
		return theLibrary3Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookType() {
		return bookTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookType_Title() {
		return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookType_Author() {
		return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookType_Character() {
		return (EReference)bookTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookType_Isbn() {
		return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacterType() {
		return characterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterType_Name() {
		return (EAttribute)characterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterType_FriendOf() {
		return (EAttribute)characterTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterType_Since() {
		return (EAttribute)characterTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterType_Qualification() {
		return (EAttribute)characterTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Book() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDescType() {
		return descTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIsbnType() {
		return isbnTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNameType() {
		return nameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSinceType() {
		return sinceTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library3Factory getLibrary3Factory() {
		return (Library3Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bookTypeEClass = createEClass(BOOK_TYPE);
		createEAttribute(bookTypeEClass, BOOK_TYPE__TITLE);
		createEAttribute(bookTypeEClass, BOOK_TYPE__AUTHOR);
		createEReference(bookTypeEClass, BOOK_TYPE__CHARACTER);
		createEAttribute(bookTypeEClass, BOOK_TYPE__ISBN);

		characterTypeEClass = createEClass(CHARACTER_TYPE);
		createEAttribute(characterTypeEClass, CHARACTER_TYPE__NAME);
		createEAttribute(characterTypeEClass, CHARACTER_TYPE__FRIEND_OF);
		createEAttribute(characterTypeEClass, CHARACTER_TYPE__SINCE);
		createEAttribute(characterTypeEClass, CHARACTER_TYPE__QUALIFICATION);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BOOK);

		// Create data types
		descTypeEDataType = createEDataType(DESC_TYPE);
		isbnTypeEDataType = createEDataType(ISBN_TYPE);
		nameTypeEDataType = createEDataType(NAME_TYPE);
		sinceTypeEDataType = createEDataType(SINCE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(bookTypeEClass, BookType.class, "BookType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBookType_Title(), this.getNameType(), "title", null, 1, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBookType_Author(), this.getNameType(), "author", null, 1, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBookType_Character(), this.getCharacterType(), null, "character", null, 0, -1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBookType_Isbn(), this.getIsbnType(), "isbn", null, 1, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(characterTypeEClass, CharacterType.class, "CharacterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharacterType_Name(), this.getNameType(), "name", null, 1, 1, CharacterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterType_FriendOf(), this.getNameType(), "friendOf", null, 0, -1, CharacterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterType_Since(), this.getSinceType(), "since", null, 1, 1, CharacterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterType_Qualification(), this.getDescType(), "qualification", null, 1, 1, CharacterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Book(), this.getBookType(), null, "book", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(descTypeEDataType, String.class, "DescType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(isbnTypeEDataType, String.class, "IsbnType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nameTypeEDataType, String.class, "NameType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sinceTypeEDataType, XMLGregorianCalendar.class, "SinceType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "qualified", "false"
		   });	
		addAnnotation
		  (bookTypeEClass, 
		   source, 
		   new String[] {
			 "name", "bookType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getBookType_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBookType_Author(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "author",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBookType_Character(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "character",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBookType_Isbn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isbn",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (characterTypeEClass, 
		   source, 
		   new String[] {
			 "name", "characterType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCharacterType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCharacterType_FriendOf(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "friend-of",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCharacterType_Since(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "since",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCharacterType_Qualification(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "qualification",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (descTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "descType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (getDocumentRoot_Book(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "book",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (isbnTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "isbnType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "[0-9]{10}"
		   });	
		addAnnotation
		  (nameTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "nameType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "maxLength", "32"
		   });	
		addAnnotation
		  (sinceTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "sinceType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#date"
		   });
	}

} //Library3PackageImpl
