package org.xtext.example.mydsl.anyfeatureadapted.serializer;

import anyfeatureadapted.AnyGenericAttribute;
import anyfeatureadapted.AnyGenericElement;
import anyfeatureadapted.AnyGenericText;
import anyfeatureadapted.AnyfeatureadaptedPackage;
import anyfeatureadapted.Element1;
import anyfeatureadapted.Properties;
import anyfeatureadapted.RootElementType;
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
import org.xtext.example.mydsl.anyfeatureadapted.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractMyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AnyfeatureadaptedPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AnyfeatureadaptedPackage.ANY_GENERIC_ATTRIBUTE:
				if(context == grammarAccess.getAnyGenericAttributeRule()) {
					sequence_AnyGenericAttribute(context, (AnyGenericAttribute) semanticObject); 
					return; 
				}
				else break;
			case AnyfeatureadaptedPackage.ANY_GENERIC_ELEMENT:
				if(context == grammarAccess.getAnyGenericConstructRule() ||
				   context == grammarAccess.getAnyGenericElementRule()) {
					sequence_AnyGenericElement(context, (AnyGenericElement) semanticObject); 
					return; 
				}
				else break;
			case AnyfeatureadaptedPackage.ANY_GENERIC_TEXT:
				if(context == grammarAccess.getAnyGenericConstructRule() ||
				   context == grammarAccess.getAnyGenericTextRule()) {
					sequence_AnyGenericText(context, (AnyGenericText) semanticObject); 
					return; 
				}
				else break;
			case AnyfeatureadaptedPackage.ELEMENT1:
				if(context == grammarAccess.getElement1Rule()) {
					sequence_Element1(context, (Element1) semanticObject); 
					return; 
				}
				else break;
			case AnyfeatureadaptedPackage.PROPERTIES:
				if(context == grammarAccess.getPropertiesRule()) {
					sequence_Properties(context, (Properties) semanticObject); 
					return; 
				}
				else break;
			case AnyfeatureadaptedPackage.ROOT_ELEMENT_TYPE:
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
	 *     (attrName=STRING attrValue=STRING)
	 */
	protected void sequence_AnyGenericAttribute(EObject context, AnyGenericAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AnyfeatureadaptedPackage.Literals.ANY_GENERIC_ATTRIBUTE__ATTR_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnyfeatureadaptedPackage.Literals.ANY_GENERIC_ATTRIBUTE__ATTR_NAME));
			if(transientValues.isValueTransient(semanticObject, AnyfeatureadaptedPackage.Literals.ANY_GENERIC_ATTRIBUTE__ATTR_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnyfeatureadaptedPackage.Literals.ANY_GENERIC_ATTRIBUTE__ATTR_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAnyGenericAttributeAccess().getAttrNameSTRINGTerminalRuleCall_3_0(), semanticObject.getAttrName());
		feeder.accept(grammarAccess.getAnyGenericAttributeAccess().getAttrValueSTRINGTerminalRuleCall_5_0(), semanticObject.getAttrValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         elemName=STRING? 
	 *         elemValue=STRING? 
	 *         (anyGenericAttr+=AnyGenericAttribute anyGenericAttr+=AnyGenericAttribute*)? 
	 *         (childElem+=AnyGenericElement childElem+=AnyGenericElement*)?
	 *     )
	 */
	protected void sequence_AnyGenericElement(EObject context, AnyGenericElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (textValue=STRING?)
	 */
	protected void sequence_AnyGenericText(EObject context, AnyGenericText semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (city=STRING? street=STRING?)
	 */
	protected void sequence_Element1(EObject context, Element1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (anyGenericElem+=AnyGenericConstruct anyGenericElem+=AnyGenericConstruct*)
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
