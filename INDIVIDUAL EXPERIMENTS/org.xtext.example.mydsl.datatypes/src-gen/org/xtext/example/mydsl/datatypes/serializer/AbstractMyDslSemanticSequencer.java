package org.xtext.example.mydsl.datatypes.serializer;

import com.example.example.with.datetypes.DataTypeTest;
import com.example.example.with.datetypes.DatetypesPackage;
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
import org.xtext.example.mydsl.datatypes.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractMyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DatetypesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DatetypesPackage.DATA_TYPE_TEST:
				if(context == grammarAccess.getDataTypeTestRule()) {
					sequence_DataTypeTest(context, (DataTypeTest) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         aID=ID0 
	 *         aAnySimpleType=AnySimpleType? 
	 *         aAnyURI=AnyURI? 
	 *         aBase64Binary=Base64Binary? 
	 *         aBoolean=Boolean? 
	 *         aByte=Byte? 
	 *         aDate=Date? 
	 *         aDateTime=DateTime? 
	 *         aDecimal=Decimal? 
	 *         aDouble=Double? 
	 *         aDuration=Duration? 
	 *         aEntities=ENTITIES? 
	 *         aEntity=ENTITY? 
	 *         aFloat=Float? 
	 *         aGDay=GDay? 
	 *         aGMonth=GMonth? 
	 *         aGMonthDay=GMonthDay? 
	 *         aGYear=GYear? 
	 *         aGYearMonth=GYearMonth? 
	 *         aHexBinary=HexBinary? 
	 *         aIDREF=IDREF? 
	 *         aIDREFS=IDREFS? 
	 *         aInt=Int0? 
	 *         aInteger=Integer? 
	 *         aLanguage=Language? 
	 *         aLong=Long? 
	 *         aName=Name? 
	 *         aNCName=NCName? 
	 *         aNMTOKEN=NMTOKEN? 
	 *         aNMTOKENS=NMTOKENS? 
	 *         aNonNegativeInteger=NonNegativeInteger? 
	 *         aNonPositiveInteger=NonPositiveInteger? 
	 *         aPositiveInteger=PositiveInteger? 
	 *         aQName=QName? 
	 *         aShort=Short? 
	 *         aString=String0? 
	 *         aTime=Time? 
	 *         aToken=Token? 
	 *         aUnsignedByte=UnsignedByte? 
	 *         aUnsignedInt=UnsignedInt? 
	 *         aUnsignedLong=UnsignedLong? 
	 *         aUnsignedShort=UnsignedShort?
	 *     )
	 */
	protected void sequence_DataTypeTest(EObject context, DataTypeTest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
