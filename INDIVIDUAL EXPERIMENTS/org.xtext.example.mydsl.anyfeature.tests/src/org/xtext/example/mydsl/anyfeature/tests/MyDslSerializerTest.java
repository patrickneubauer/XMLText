package org.xtext.example.mydsl.anyfeature.tests;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.xtext.example.mydsl.anyfeature.serializer.MyDslSerializer;


/**
 * (!) Check if model resources are available before executing this test
 * 
 * @author pneubaue
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MyDslSerializerTest {

	private static final String INPUT_MODEL = "models/Example_with_anyfeature.xml"; // must end with .xml
	private static final String OUTPUT_MODEL_PATH = "models/generated/"; // must end with /

	@Test
	public void _1_xmlToXmiTest() throws IOException {
		URI inputModelResourceURI = URI.createFileURI(new File(INPUT_MODEL.substring(0, INPUT_MODEL.length() - 4).concat(".xml")).getAbsolutePath());		
		URI outputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat(".xmi")).getAbsolutePath());
		MyDslSerializer serializer = new MyDslSerializer();
		serializer.writeOutput(inputModelResourceURI, outputModelResourceURI, "");
	}// xmlToXmiTest

	@Test
	public void _2_xmiToMyDslTest() throws IOException {
		URI inputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat(".xmi")).getAbsolutePath());
		URI outputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat(".mydsl_with_anyfeature")).getAbsolutePath());
		MyDslSerializer serializer = new MyDslSerializer();
		serializer.writeOutput(inputModelResourceURI, outputModelResourceURI, "");
	}// xmiToMyDslTest

	@Test
	public void _3_myDslToXmiTest() throws IOException {
		URI inputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat(".mydsl_with_anyfeature")).getAbsolutePath());
		URI outputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat("_reverse.xmi")).getAbsolutePath());
		MyDslSerializer serializer = new MyDslSerializer();
		serializer.writeOutput(inputModelResourceURI, outputModelResourceURI, "");
	}// myDslToXmiTest

	@Test
	public void _4_xmiToXmlTest() throws IOException {
		URI inputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat(".xmi")).getAbsolutePath());
		URI outputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat("_reverse.xml")).getAbsolutePath());
		MyDslSerializer serializer = new MyDslSerializer();
		serializer.writeOutput(inputModelResourceURI, outputModelResourceURI, "");
	}// xmiToXmlTest

	@Test
	public void _5_xmlToMyDslDirectlyTest() throws IOException {
		URI inputModelResourceURI = URI.createFileURI(new File(INPUT_MODEL.substring(0, INPUT_MODEL.length() - 4).concat(".xml")).getAbsolutePath());				
		URI outputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat("_directly.mydsl_with_anyfeature")).getAbsolutePath());
		MyDslSerializer serializer = new MyDslSerializer();
		serializer.writeOutput(inputModelResourceURI, outputModelResourceURI, "");
	}// xmlToMyDslDirectlyTest

	@Test
	public void _6_myDslToXmlDirectlyTest() throws IOException {
		URI inputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat("_directly.mydsl_with_anyfeature")).getAbsolutePath());
		URI outputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat("_directly.xml")).getAbsolutePath());
		MyDslSerializer serializer = new MyDslSerializer();
		serializer.writeOutput(inputModelResourceURI, outputModelResourceURI, "");
	}// myDslToXmlDirectlyTest

}// SerializerTest
