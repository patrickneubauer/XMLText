package org.xtext.example.mydsl.anyfeatureadapted.serializer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.xtext.example.mydsl.anyfeatureadapted.MyDslStandaloneSetup;

import com.example.example.with.anyfeature.AnyfeaturePackage;

import anyfeatureadapted.AnyfeatureadaptedPackage;


public class MyDslSerializer {
	
	/**
	 * Create a output model file from a given input model file
	 * Note: The metamodel is considered to be already registered
	 * 
	 * Possible input:	XMI, XML, DSL
	 * Possible output:	XMI, XML, DSL	
	 * 
	 * @param inputModelURI input model file location (URI)
	 * @param outputModelURI output model file location (URI)
	 * @param dslFileExtension TODO
	 * @throws Exception 
	 */
	public void buildOutput(URI inputModelURI, URI outputModelURI, String dslFileExtension) throws Exception {
		// Standalone Setup if used in non-plugin project
		MyDslStandaloneSetup.doSetup();
		AnyfeatureadaptedPackage.eINSTANCE.eClass(); // instead of manually registering DSML
		
		// Setup for "original" Ecore MM 
		org.xtext.example.mydsl.anyfeature.MyDslStandaloneSetup.doSetup();
		AnyfeaturePackage.eINSTANCE.eClass();
				
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xml", new XMLResourceFactoryImpl());
		
		// create the resource set and add extended meta data to read/write options
		ResourceSet resourceSet = new ResourceSetImpl();
		

		if (inputModelURI.fileExtension().equals(dslFileExtension) && outputModelURI.fileExtension().equals("xmi")) {
			// DSL --> XMI
			fromDSLtoXMI(inputModelURI, outputModelURI, resourceSet);
			
		} else if (inputModelURI.fileExtension().equals("xmi") && outputModelURI.fileExtension().equals(dslFileExtension)) {
			// XMI --> DSL
			fromXMItoDSL(inputModelURI, outputModelURI, resourceSet);
		
		} else if (inputModelURI.fileExtension().equals("xmi") && outputModelURI.fileExtension().equals("xml")) {
			// XMI --> XML (Serializer)
			fromXMItoXML(inputModelURI, outputModelURI, resourceSet);
		
		} else if (inputModelURI.fileExtension().equals("xml") && outputModelURI.fileExtension().equals("xmi")) {
			// XML --> XMI (De-Serializer)
			throw new Exception("NOT YET IMPLEMENTED!");			
		}
			
	}// buildOutput

	private void fromXMItoDSL(URI inputModelURI, URI outputModelURI,
			ResourceSet resourceSet) {
		fromDSLtoXMI(inputModelURI, outputModelURI, resourceSet);
		
	}

	private void fromDSLtoXMI(URI inputModelURI, URI outputModelURI,
			ResourceSet resourceSet) {
		// set load options
		Map<Object,Object> loadOptionsMap = resourceSet.getLoadOptions();
	//				loadOptionsMap.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
	//				loadOptionsMap.put(XMLResource.OPTION_RECORD_ANY_TYPE_NAMESPACE_DECLARATIONS, Boolean.TRUE);
		loadOptionsMap.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		loadOptionsMap.put(XMIResource.OPTION_SUPPRESS_DOCUMENT_ROOT, Boolean.TRUE);
		
		// set save options
		Map<Object,Object> saveOptionsMap = new HashMap<Object,Object>();
		saveOptionsMap.put(XMIResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		saveOptionsMap.put(XMIResource.OPTION_SUPPRESS_DOCUMENT_ROOT, Boolean.TRUE);		
		
		// load input model from file
		Resource inputResource = resourceSet.getResource(inputModelURI, true);
		
		// create output model resource by copying contents of input model
		Resource outputResource = resourceSet.createResource(outputModelURI);
		outputResource.getContents().add(EcoreUtil.copy(inputResource.getContents().get(0)));
	
		// save output model to file
		try {
			outputResource.save(saveOptionsMap);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void fromXMItoXML(URI inputModelURI, URI outputModelURI,
			ResourceSet resourceSet) throws IOException {
		// overwrite load options
		Map<Object,Object> loadOptionsMap = resourceSet.getLoadOptions();
		loadOptionsMap.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		loadOptionsMap.put(XMIResource.OPTION_SUPPRESS_DOCUMENT_ROOT, Boolean.TRUE);
		
		// set save options
		Map<Object,Object> saveOptionsMap = new HashMap<Object,Object>();
		saveOptionsMap.put(XMIResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		saveOptionsMap.put(XMIResource.OPTION_SUPPRESS_DOCUMENT_ROOT, Boolean.TRUE);		
		
		// load input model from file
		XMIResource inputResource = (XMIResource) resourceSet.getResource(inputModelURI, true);
		
		// create output model resource by copying contents of input model
		Resource outputResource = resourceSet.createResource(outputModelURI);
		XMItoXMLCopier xmiToXmlCopier = new XMItoXMLCopier("http://example.com/example-with-anyfeature");
		outputResource.getContents().add(xmiToXmlCopier.copy(inputResource.getContents().get(0)));
		
		// save output model to file
		outputResource.save(saveOptionsMap);
	}
	
	/**
	 * The result of this is supposed to be put into the save-option-map when saving the model in XML-format
	 * 
	 * @return
	 */
	private ExtendedMetaData createExtendedMetaData() {
		final ExtendedMetaData ext = new BasicExtendedMetaData(
				ExtendedMetaData.ANNOTATION_URI,
				EPackage.Registry.INSTANCE, new HashMap());
		
//		ext.setQualified(AnyfeatureadaptedPackage.eINSTANCE, false);
		ext.setFeatureKind(AnyfeatureadaptedPackage.Literals.ANY_GENERIC_ELEMENT__ELEM_NAME, ExtendedMetaData.ELEMENT_FEATURE);
		
//		ext.setFeatureKind(AnyfeatureadaptedPackage.Literals.ANY_GENERIC_ELEMENT__ELEM_VALUE, ExtendedMetaData.ELEMENT_FEATURE);
		
		return ext;
	}
	
	public static EObject createEObject(String nsURI, String name) {
		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(nsURI);
		EClass eClass = (EClass) ePackage.getEClassifier(name);
		return ePackage.getEFactoryInstance().create(eClass);
	}// createEObject
	
	public static void printAttributeValues(EObject object) {
		EClass eClass = object.eClass();
		System.out.println(eClass.getName());
		for (Iterator iter = eClass.getEAllAttributes().iterator(); iter.hasNext();) {
			EAttribute attribute = (EAttribute) iter.next();
			Object value = object.eGet(attribute);
			System.out.print("  " + attribute.getName() + ": " + value);
			if (object.eIsSet(attribute)) {
				System.out.println(); // attribute is set
			} else {
				System.out.println(" (default)"); // attribute is not set
			}
		}
	}// printAttributeValues
	
	public static void main(String args[]) {
		// Setup for "original" Ecore MM 
		org.xtext.example.mydsl.anyfeature.MyDslStandaloneSetup.doSetup();
		AnyfeaturePackage.eINSTANCE.eClass();
		
		EObject eobject = createEObject("http://example.com/example-with-anyfeature", "Properties");
		System.out.println(eobject);
		printAttributeValues(eobject);
	}
	
	
	
}
 