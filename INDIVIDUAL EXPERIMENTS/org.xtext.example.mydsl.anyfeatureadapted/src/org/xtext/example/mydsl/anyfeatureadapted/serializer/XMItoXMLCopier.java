package org.xtext.example.mydsl.anyfeatureadapted.serializer;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.emf.ecore.impl.EReferenceImpl;
import org.eclipse.emf.ecore.impl.EStructuralFeatureImpl.SimpleFeatureMapEntry;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;

import com.example.example.with.anyfeature.Properties;

import anyfeatureadapted.AnyGenericAttribute;
import anyfeatureadapted.AnyGenericElement;

/**
 * It overwrites specific methods of 'Copier' s.t. source eClasses are mapped to target eClasses
 * and classes of type 'AnyGenericConstruct' are handled differently, i.e., mapped to arbitrary XML constructs:
 * 
 * - AnyGenericConstruct (abstract): 
 *   - AnyGenericElement ==> EReference (eDataType = AnyType) with 
 *   		EAttribute (eDataType = AnySimpleType), i.e., XML Tag with XML Tag Attribute, respectively.
 *   - AnyGenericText ==> EAttribute (eDataType = AnySimpleType), i.e., XML Tag Main Content
 * - AnyGenericAttribute ==> (see AnyGenericElement)
 * 
 * See also: https://goo.gl/BjTXud
 * 
 * @author pneubaue
 *
 */
public class XMItoXMLCopier extends Copier {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String XML_TYPE_NAMESPACE = "http://www.eclipse.org/emf/2003/XMLType";
	private static final String TARGET_ANY_NAMESPACE = null;
	
	private String targetNamespace;
	
	public XMItoXMLCopier(String targetNamespace) {
		this.targetNamespace = targetNamespace;
	}

	@Override
	protected EClass getTarget(EClass eClass) {
		// return the corresponding EClass of the target Ecore metamodel
		EClass targetEClass = createEClass(targetNamespace, eClass.getName());
		return targetEClass;
	}// getTarget (EClass)

	@Override
	protected EStructuralFeature getTarget(EStructuralFeature eStructuralFeature) {
		// return the corresponding EStructuralFeature of the target Ecore
		// metamodel
		EStructuralFeature targetEStructuralFeature = createEStructuralFeauture(targetNamespace, eStructuralFeature);
		return targetEStructuralFeature;
	}// getTarget (EStructuralFeature)

	private static EClass createEClass(String nsURI, String name) {
		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(nsURI);
		EClass eClass = (EClass) ePackage.getEClassifier(name);
		return eClass;
	}// createEClass

	private static EObject createEObject(String nsURI, String name) {
		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(nsURI);
		EClass eClass = (EClass) ePackage.getEClassifier(name);
		return ePackage.getEFactoryInstance().create(eClass);
	}// createEObject

	private static EStructuralFeature createEStructuralFeauture(String nsURI, EStructuralFeature feature) {
		String eClassName = feature.getEContainingClass().getName();
		EClass eClass = createEClass(nsURI, eClassName);
		EStructuralFeature eStructuralFeature = null;
		if (feature.getEType().getName().equals("AnyGenericConstruct")) {
			eStructuralFeature = eClass.getEStructuralFeature("mixed");
		} else {
			eStructuralFeature = eClass.getEStructuralFeature(feature.getName());
		}
		return eStructuralFeature;
	}// createEStructuralFeature

	@Override
	protected void copyContainment(EReference eReference, EObject eObject, EObject copyEObject) {
		if (eObject.eIsSet(eReference)) {
			EStructuralFeature.Setting setting = getTarget(eReference, eObject, copyEObject);
			if (setting != null) {
				Object value = eObject.eGet(eReference);
				if (eReference.getEType().getName().equals("AnyGenericConstruct")) {
					// if containment is a AnyGenericConstruct
					copyAnyGenericConstructContainment(value, setting, eReference, eObject, copyEObject);
				} else {
					// if containment is not a AnyGenericContruct (default)
					if (eReference.isMany()) {
						@SuppressWarnings("unchecked")
						List<EObject> target = (List<EObject>) value;
						setting.set(copyAll(target));
					} else {
						setting.set(copy((EObject) value));
					}
				}
			}
		}
	}

	/**
	 * 
	 * @param sourceElement
	 *            AnyGenericElementImpl
	 * @param setting
	 *            target BasicFeatureMap
	 * @param sourceEReference
	 *            EReferenceImpl (anyGenericElem)
	 * @param sourceEObject
	 *            the source container object, e.g., PropertiesImpl
	 * @param targetEObject
	 *            the target container object, e.g., PropertiesImpl
	 */
	private void copyAnyGenericConstructContainment(Object sourceElement, Setting setting, EReference sourceEReference,
			EObject sourceEObject, EObject targetEObject) {

		// obtain the source element name and content
		EObjectContainmentEList sourceElementList = (EObjectContainmentEList) sourceElement;
		AnyGenericElement anyGenericElement = (AnyGenericElement) sourceElementList.get(0);
		
		// establish SimpleFeatureMapEntry for given source and target
		SimpleFeatureMapEntry anyTypeFeatureMapEntry = buildSimpleFeatureMapEntry(anyGenericElement, targetEObject);
		
		// assign result to target EObject
		FeatureMap targetAnyFeatureMap = ((Properties) targetEObject).getMixed();
		targetAnyFeatureMap.add(anyTypeFeatureMapEntry);

	}// copyAnyGenericConstructContainment

	private SimpleFeatureMapEntry buildSimpleFeatureMapEntry(AnyGenericElement anyGenericElement, EObject targetEObject) {

		// establish XML Tag
		AnyType anyTypeObject = XMLTypeFactory.eINSTANCE.createAnyType();
		
		// assign XML Tag Attributes
		for (AnyGenericAttribute anyGenericAttribute : anyGenericElement.getAnyGenericAttr()) {
			EAttributeImpl eAttribute = (EAttributeImpl) ExtendedMetaData.INSTANCE.demandFeature(TARGET_ANY_NAMESPACE, anyGenericAttribute.getAttrName(), false, false);
			SimpleFeatureMapEntry eAttributeMapEntry = new SimpleFeatureMapEntry(eAttribute, anyGenericAttribute.getAttrValue());
			anyTypeObject.getAnyAttribute().add(eAttributeMapEntry);
		}
		
		// assign XML Tag Main Content
		if (anyGenericElement.getElemValue() != null) {
			EAttributeImpl eAttribute = (EAttributeImpl) ExtendedMetaData.INSTANCE.demandFeature(XML_TYPE_NAMESPACE, "text", true, false);
			SimpleFeatureMapEntry eAttributeMapEntry = new SimpleFeatureMapEntry(eAttribute, anyGenericElement.getElemValue());
			anyTypeObject.getMixed().add(eAttributeMapEntry);
		}
		
		// assign XML Tag Children (recursively)
		for (AnyGenericElement childAnyGenericElement : anyGenericElement.getChildElem()) {
			EObject childTargetEObject = XMLTypeFactory.eINSTANCE.createAnyType();
			SimpleFeatureMapEntry childAnyTypeFeatureMapEntry = buildSimpleFeatureMapEntry(childAnyGenericElement, childTargetEObject);
			anyTypeObject.getMixed().add(childAnyTypeFeatureMapEntry);
		}
		
		// build reference for anyTypeObject
		EReferenceImpl anyTypeObjectReference = (EReferenceImpl) ExtendedMetaData.INSTANCE.demandFeature(TARGET_ANY_NAMESPACE, anyGenericElement.getElemName(), true, true);
		SimpleFeatureMapEntry anyTypeFeatureMapEntry = new SimpleFeatureMapEntry(anyTypeObjectReference, anyTypeObject);
		return anyTypeFeatureMapEntry;
	}// buildSimpleFeatureMapEntry

}
