package at.ac.tuwien.big.xaml.serializer.test;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryRegistryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import at.ac.tuwien.big.xaml.serializer.XAMLSerializer;
import caex.util.CaexResourceFactoryImpl;

/**
 * SerializerTest
 * 
 * XML --> XMI --> XAML and directly XML --> XAML
 * 
 * (!) Check if model resources are available before executing this test
 * 
 * @author pneubaue
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SerializerTest {

	ResourceSet resourceSet = null;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		resourceSet = new ResourceSetImpl();
		
		ResourceFactoryRegistryImpl.INSTANCE.getExtensionToFactoryMap()
			.put("xaml", new CaexResourceFactoryImpl());
	
		ResourceFactoryRegistryImpl.INSTANCE.getExtensionToFactoryMap()
			.put("xmi", new XMIResourceFactoryImpl());
		
		ResourceFactoryRegistryImpl.INSTANCE.getExtensionToFactoryMap()
			.put("xml", new XMLResourceFactoryImpl());
	}
	
	private static final String INPUT_MODEL = "models/ExampleTopology.xaml"; // must end with .xaml
	private static final String OUTPUT_MODEL_PATH = "models/generated/"; // must end with /

	@Test
	public void _1_xamlToXmiTest() throws IOException {
		URI inputModelResourceURI = URI.createFileURI(new File(INPUT_MODEL).getAbsolutePath());		
		URI outputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat(".xmi")).getAbsolutePath());
		XAMLSerializer serializer = new XAMLSerializer();
		serializer.writeOutput(inputModelResourceURI, outputModelResourceURI, XMLResource.OPTION_EXTENDED_META_DATA);
	}// xamlToXmiTest

	@Test
	public void _3_xamlToXmlDirectlyTest() throws IOException {
		URI inputModelResourceURI = URI.createFileURI(new File(INPUT_MODEL).getAbsolutePath());		
		URI outputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat(".xml")).getAbsolutePath());
		XAMLSerializer serializer = new XAMLSerializer();
		serializer.writeOutput(inputModelResourceURI, outputModelResourceURI, XMLResource.OPTION_EXTENDED_META_DATA);
	}// xamlToXmlDirectlyTest

}// SerializerTest
