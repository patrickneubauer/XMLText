package org.xtext.example.mydsl.extensions.serializer;

import com.example.example.with.extensions.Address;
import com.example.example.with.extensions.ExtendedAddress;
import com.example.example.with.extensions.ExtensionsPackage;
import com.example.example.with.extensions.Language;
import com.example.example.with.extensions.RootElementType;
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
import org.xtext.example.mydsl.extensions.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractMyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ExtensionsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ExtensionsPackage.ADDRESS:
				if(context == grammarAccess.getAddressRule() ||
				   context == grammarAccess.getAddress_ImplRule()) {
					sequence_Address_Impl(context, (Address) semanticObject); 
					return; 
				}
				else break;
			case ExtensionsPackage.EXTENDED_ADDRESS:
				if(context == grammarAccess.getAddressRule() ||
				   context == grammarAccess.getExtendedAddressRule()) {
					sequence_ExtendedAddress(context, (ExtendedAddress) semanticObject); 
					return; 
				}
				else break;
			case ExtensionsPackage.LANGUAGE:
				if(context == grammarAccess.getLanguageRule()) {
					sequence_Language(context, (Language) semanticObject); 
					return; 
				}
				else break;
			case ExtensionsPackage.ROOT_ELEMENT_TYPE:
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
	 *     (street=String0 city=String0 country=String0)
	 */
	protected void sequence_Address_Impl(EObject context, Address semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExtensionsPackage.Literals.ADDRESS__STREET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtensionsPackage.Literals.ADDRESS__STREET));
			if(transientValues.isValueTransient(semanticObject, ExtensionsPackage.Literals.ADDRESS__CITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtensionsPackage.Literals.ADDRESS__CITY));
			if(transientValues.isValueTransient(semanticObject, ExtensionsPackage.Literals.ADDRESS__COUNTRY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtensionsPackage.Literals.ADDRESS__COUNTRY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAddress_ImplAccess().getStreetString0ParserRuleCall_3_0(), semanticObject.getStreet());
		feeder.accept(grammarAccess.getAddress_ImplAccess().getCityString0ParserRuleCall_5_0(), semanticObject.getCity());
		feeder.accept(grammarAccess.getAddress_ImplAccess().getCountryString0ParserRuleCall_7_0(), semanticObject.getCountry());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (street=String0 city=String0 country=String0 latitude=Decimal? longitude=Decimal?)
	 */
	protected void sequence_ExtendedAddress(EObject context, ExtendedAddress semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=String0? language=Language0?)
	 */
	protected void sequence_Language(EObject context, Language semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (extendedAddress=ExtendedAddress address=Address language=Language)
	 */
	protected void sequence_RootElementType(EObject context, RootElementType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExtensionsPackage.Literals.ROOT_ELEMENT_TYPE__EXTENDED_ADDRESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtensionsPackage.Literals.ROOT_ELEMENT_TYPE__EXTENDED_ADDRESS));
			if(transientValues.isValueTransient(semanticObject, ExtensionsPackage.Literals.ROOT_ELEMENT_TYPE__ADDRESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtensionsPackage.Literals.ROOT_ELEMENT_TYPE__ADDRESS));
			if(transientValues.isValueTransient(semanticObject, ExtensionsPackage.Literals.ROOT_ELEMENT_TYPE__LANGUAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtensionsPackage.Literals.ROOT_ELEMENT_TYPE__LANGUAGE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRootElementTypeAccess().getExtendedAddressExtendedAddressParserRuleCall_3_0(), semanticObject.getExtendedAddress());
		feeder.accept(grammarAccess.getRootElementTypeAccess().getAddressAddressParserRuleCall_5_0(), semanticObject.getAddress());
		feeder.accept(grammarAccess.getRootElementTypeAccess().getLanguageLanguageParserRuleCall_7_0(), semanticObject.getLanguage());
		feeder.finish();
	}
}
