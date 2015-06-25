package org.xtext.example.mydsl.anyfeature.serializer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.xtext.example.mydsl.anyfeature.MyDslStandaloneSetup;

import com.example.example.with.anyfeature.AnyfeaturePackage;

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
	 * @param writeOptions options used to read the input file and write the output file
	 * @throws IOException is thrown, e.g., when input file or metamodel cannot be found
	 */
	public void writeOutput(URI inputModelURI, URI outputModelURI, String... writeOptions) throws IOException {
		// Standalone Setup if used in non-plugin project
		MyDslStandaloneSetup.doSetup();
		AnyfeaturePackage.eINSTANCE.eClass(); // instead of manually registering "tml"		
				
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xml", new XMLResourceFactoryImpl());
		
		// create the resource set and add extended meta data to read/write options
		ResourceSet resourceSet = new ResourceSetImpl();
		
		// overwrite load options
		Map<Object,Object> loadOptionsMap = resourceSet.getLoadOptions();
//		loadOptionsMap.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
//		loadOptionsMap.put(XMLResource.OPTION_RECORD_ANY_TYPE_NAMESPACE_DECLARATIONS, Boolean.TRUE);
		loadOptionsMap.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
//		loadOptionsMap.put(XMLResource.OPTION_XML_OPTIONS, Boolean.TRUE);

		
		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(resourceSet.getPackageRegistry());
		Map<Object,Object> optionsMap = new HashMap<Object,Object>();
		for (String option : writeOptions) {
			optionsMap.put(option, extendedMetaData);
		}
		// manual adding stuff
		optionsMap.put(XMIResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		
		// load input model from file
		Resource inputResource = resourceSet.getResource(inputModelURI, true);

		// create output model resource by copying contents of input model
		Resource outputResource = resourceSet.createResource(outputModelURI);
		outputResource.getContents().add(EcoreUtil.copy(inputResource.getContents().get(0)));
		
		// save output model to file
		outputResource.save(optionsMap);
	}// writeOutput
	
}
