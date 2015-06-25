package org.xtext.example.mydsl1.group.serializer;

import com.example.example.with.group.Element1;
import com.example.example.with.group.Element1Choice;
import com.example.example.with.group.Element2;
import com.example.example.with.group.Element3;
import com.example.example.with.group.GroupPackage;
import com.example.example.with.group.RootElementType;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl1.group.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractMyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == GroupPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GroupPackage.ELEMENT1:
				if(context == grammarAccess.getElement1Rule()) {
					sequence_Element1(context, (Element1) semanticObject); 
					return; 
				}
				else break;
			case GroupPackage.ELEMENT1_CHOICE:
				if(context == grammarAccess.getElement1ChoiceRule()) {
					sequence_Element1Choice(context, (Element1Choice) semanticObject); 
					return; 
				}
				else break;
			case GroupPackage.ELEMENT2:
				if(context == grammarAccess.getElement2Rule()) {
					sequence_Element2(context, (Element2) semanticObject); 
					return; 
				}
				else break;
			case GroupPackage.ELEMENT3:
				if(context == grammarAccess.getElement3Rule()) {
					sequence_Element3(context, (Element3) semanticObject); 
					return; 
				}
				else break;
			case GroupPackage.ROOT_ELEMENT_TYPE:
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
	 *     (
	 *         (repeatableElement1+=String0 repeatableElement1+=String0*)? 
	 *         (repeatableElement2+=String0 repeatableElement2+=String0*)? 
	 *         (repeatableElement3+=String0 repeatableElement3+=String0*)?
	 *     )
	 */
	protected void sequence_Element1Choice(EObject context, Element1Choice semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (element1Choice=Element1Choice?)
	 */
	protected void sequence_Element1(EObject context, Element1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modelGroupElement1+=String0 modelGroupElement1+=String0* modelGroupElement2=String0 modelGroupElement3=String0)
	 */
	protected void sequence_Element2(EObject context, Element2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((repeatableElement1+=String0 repeatableElement1+=String0*)? repeatableElement2=String0? repeatableElement3=String0?)
	 */
	protected void sequence_Element3(EObject context, Element3 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (element1=Element1 element2=Element2 element3=Element3)
	 */
	protected void sequence_RootElementType(EObject context, RootElementType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GroupPackage.Literals.ROOT_ELEMENT_TYPE__ELEMENT1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GroupPackage.Literals.ROOT_ELEMENT_TYPE__ELEMENT1));
			if(transientValues.isValueTransient(semanticObject, GroupPackage.Literals.ROOT_ELEMENT_TYPE__ELEMENT2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GroupPackage.Literals.ROOT_ELEMENT_TYPE__ELEMENT2));
			if(transientValues.isValueTransient(semanticObject, GroupPackage.Literals.ROOT_ELEMENT_TYPE__ELEMENT3) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GroupPackage.Literals.ROOT_ELEMENT_TYPE__ELEMENT3));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRootElementTypeAccess().getElement1Element1ParserRuleCall_3_0(), semanticObject.getElement1());
		feeder.accept(grammarAccess.getRootElementTypeAccess().getElement2Element2ParserRuleCall_5_0(), semanticObject.getElement2());
		feeder.accept(grammarAccess.getRootElementTypeAccess().getElement3Element3ParserRuleCall_7_0(), semanticObject.getElement3());
		feeder.finish();
	}
}
