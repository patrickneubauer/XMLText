package org.xtext.example.mydsl.anyfeature.serializer;

import com.example.example.with.anyfeature.AnyfeaturePackage;
import com.example.example.with.anyfeature.Element1;
import com.example.example.with.anyfeature.Properties;
import com.example.example.with.anyfeature.RootElementType;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.xtext.example.mydsl.anyfeature.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractMyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AnyfeaturePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AnyfeaturePackage.ELEMENT1:
				if(context == grammarAccess.getElement1Rule()) {
					sequence_Element1(context, (Element1) semanticObject); 
					return; 
				}
				else break;
			case AnyfeaturePackage.PROPERTIES:
				if(context == grammarAccess.getPropertiesRule()) {
					sequence_Properties(context, (Properties) semanticObject); 
					return; 
				}
				else break;
			case AnyfeaturePackage.ROOT_ELEMENT_TYPE:
				if(context == grammarAccess.getRootElementTypeRule()) {
					sequence_RootElementType(context, (RootElementType) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (city=String0? street=String0?)
	 */
	protected void sequence_Element1(EObject context, Element1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (any+=EFeatureMapEntry?)
	 */
	protected void sequence_Properties(EObject context, Properties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (element1=Element1 properties=Properties?)
	 */
	protected void sequence_RootElementType(EObject context, RootElementType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
