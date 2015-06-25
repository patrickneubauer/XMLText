package org.xtext.example.mydsl.anyfeatureadapted.tests;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.xtext.example.mydsl.anyfeatureadapted.serializer.MyDslSerializer;


/**
 * 
 * (!) Check if model resources are available before executing this test
 * 
 * @author pneubaue
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MyDslSerializerTest {

	private static final String DSL_FILE_ENDING = ".mydsl_with_anyfeatureadapted";
	private static final String INPUT_MODEL = "models/Example_with_anyfeatureadapted.xml"; // must end with .xml
	private static final String OUTPUT_MODEL_PATH = "models/generated/"; // must end with /

	@Test
	public void _1_xmlToXmiTest() throws Exception {
		URI inputModelResourceURI = URI.createFileURI(new File(INPUT_MODEL.substring(0, INPUT_MODEL.length() - 4).concat(".xml")).getAbsolutePath());		
		URI outputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat(".xmi")).getAbsolutePath());
		MyDslSerializer serializer = new MyDslSerializer();
		serializer.buildOutput(inputModelResourceURI, outputModelResourceURI, DSL_FILE_ENDING);
	}// xmlToXmiTest

	@Test
	public void _2_xmiToMyDslTest() throws Exception {
		URI inputModelResourceURI = URI.createFileURI(new File(INPUT_MODEL.substring(0, INPUT_MODEL.length() - 4).concat(".xmi")).getAbsolutePath());		
		URI outputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat(DSL_FILE_ENDING)).getAbsolutePath());
		MyDslSerializer serializer = new MyDslSerializer();
		serializer.buildOutput(inputModelResourceURI, outputModelResourceURI, DSL_FILE_ENDING);
	}// xmiToMyDslTest

	@Test
	public void _3_myDslToXmiTest() throws Exception {
		URI inputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat(DSL_FILE_ENDING)).getAbsolutePath());
		URI outputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat("_reverse.xmi")).getAbsolutePath());
		MyDslSerializer serializer = new MyDslSerializer();
		serializer.buildOutput(inputModelResourceURI, outputModelResourceURI, DSL_FILE_ENDING);
	}// myDslToXmiTest

	@Test
	public void _4_xmiToXmlTest() throws Exception {
		URI inputModelResourceURI = URI.createFileURI(new File(INPUT_MODEL.substring(0, INPUT_MODEL.length() - 4).concat(".xmi")).getAbsolutePath());		
		URI outputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat("_reverse.xml")).getAbsolutePath());
		MyDslSerializer serializer = new MyDslSerializer();
		serializer.buildOutput(inputModelResourceURI, outputModelResourceURI, DSL_FILE_ENDING);
	}// xmiToXmlTest

	@Test
	public void _5_xmlToMyDslDirectlyTest() throws Exception {
		URI inputModelResourceURI = URI.createFileURI(new File(INPUT_MODEL.substring(0, INPUT_MODEL.length() - 4).concat(".xml")).getAbsolutePath());				
		URI outputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat("_directly.mydsl_with_anyfeatureadapted")).getAbsolutePath());
		MyDslSerializer serializer = new MyDslSerializer();
		serializer.buildOutput(inputModelResourceURI, outputModelResourceURI, DSL_FILE_ENDING);
	}// xmlToMyDslDirectlyTest

	@Test
	public void _6_myDslToXmlDirectlyTest() throws Exception {
		URI inputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat("_directly.mydsl_with_anyfeatureadapted")).getAbsolutePath());
		URI outputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat("_directly.xml")).getAbsolutePath());
		MyDslSerializer serializer = new MyDslSerializer();
		serializer.buildOutput(inputModelResourceURI, outputModelResourceURI, DSL_FILE_ENDING);
	}// myDslToXmlDirectlyTest

}// SerializerTest
