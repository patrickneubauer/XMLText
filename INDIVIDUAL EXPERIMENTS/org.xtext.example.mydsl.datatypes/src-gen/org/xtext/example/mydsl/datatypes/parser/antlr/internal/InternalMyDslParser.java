package org.xtext.example.mydsl.datatypes.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.datatypes.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DataTypeTest'", "'{'", "'aAnySimpleType'", "'aAnyURI'", "'aBase64Binary'", "'aBoolean'", "'aByte'", "'aDate'", "'aDateTime'", "'aDecimal'", "'aDouble'", "'aDuration'", "'aEntities'", "'aEntity'", "'aFloat'", "'aGDay'", "'aGMonth'", "'aGMonthDay'", "'aGYear'", "'aGYearMonth'", "'aHexBinary'", "'aIDREF'", "'aIDREFS'", "'aInt'", "'aInteger'", "'aLanguage'", "'aLong'", "'aName'", "'aNCName'", "'aNMTOKEN'", "'aNMTOKENS'", "'aNonNegativeInteger'", "'aNonPositiveInteger'", "'aPositiveInteger'", "'aQName'", "'aShort'", "'aString'", "'aTime'", "'aToken'", "'aUnsignedByte'", "'aUnsignedInt'", "'aUnsignedLong'", "'aUnsignedShort'", "'}'", "'AnySimpleType'", "'AnyURI'", "'Base64Binary'", "'Boolean'", "'Byte'", "'Date'", "'DateTime'", "'Decimal'", "'Double'", "'Duration'", "'ENTITIES'", "'ENTITY'", "'Float'", "'GDay'", "'GMonth'", "'GMonthDay'", "'GYear'", "'GYearMonth'", "'HexBinary'", "'ID'", "'IDREF'", "'IDREFS'", "'Int'", "'Integer'", "'Language'", "'Long'", "'Name'", "'NCName'", "'NMTOKEN'", "'NMTOKENS'", "'NonNegativeInteger'", "'NonPositiveInteger'", "'PositiveInteger'", "'QName'", "'Short'", "'String'", "'Time'", "'Token'", "'UnsignedByte'", "'UnsignedInt'", "'UnsignedLong'", "'UnsignedShort'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DataTypeTest";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDataTypeTest"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleDataTypeTest returns [EObject current=null] : iv_ruleDataTypeTest= ruleDataTypeTest EOF ;
    public final EObject entryRuleDataTypeTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeTest = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleDataTypeTest= ruleDataTypeTest EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleDataTypeTest= ruleDataTypeTest EOF
            {
             newCompositeNode(grammarAccess.getDataTypeTestRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataTypeTest_in_entryRuleDataTypeTest75);
            iv_ruleDataTypeTest=ruleDataTypeTest();

            state._fsp--;

             current =iv_ruleDataTypeTest; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDataTypeTest85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataTypeTest"


    // $ANTLR start "ruleDataTypeTest"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:76:1: ruleDataTypeTest returns [EObject current=null] : ( () otherlv_1= 'DataTypeTest' ( (lv_aID_2_0= ruleID0 ) ) otherlv_3= '{' (otherlv_4= 'aAnySimpleType' ( (lv_aAnySimpleType_5_0= ruleAnySimpleType ) ) )? (otherlv_6= 'aAnyURI' ( (lv_aAnyURI_7_0= ruleAnyURI ) ) )? (otherlv_8= 'aBase64Binary' ( (lv_aBase64Binary_9_0= ruleBase64Binary ) ) )? (otherlv_10= 'aBoolean' ( (lv_aBoolean_11_0= ruleBoolean ) ) )? (otherlv_12= 'aByte' ( (lv_aByte_13_0= ruleByte ) ) )? (otherlv_14= 'aDate' ( (lv_aDate_15_0= ruleDate ) ) )? (otherlv_16= 'aDateTime' ( (lv_aDateTime_17_0= ruleDateTime ) ) )? (otherlv_18= 'aDecimal' ( (lv_aDecimal_19_0= ruleDecimal ) ) )? (otherlv_20= 'aDouble' ( (lv_aDouble_21_0= ruleDouble ) ) )? (otherlv_22= 'aDuration' ( (lv_aDuration_23_0= ruleDuration ) ) )? (otherlv_24= 'aEntities' ( (lv_aEntities_25_0= ruleENTITIES ) ) )? (otherlv_26= 'aEntity' ( (lv_aEntity_27_0= ruleENTITY ) ) )? (otherlv_28= 'aFloat' ( (lv_aFloat_29_0= ruleFloat ) ) )? (otherlv_30= 'aGDay' ( (lv_aGDay_31_0= ruleGDay ) ) )? (otherlv_32= 'aGMonth' ( (lv_aGMonth_33_0= ruleGMonth ) ) )? (otherlv_34= 'aGMonthDay' ( (lv_aGMonthDay_35_0= ruleGMonthDay ) ) )? (otherlv_36= 'aGYear' ( (lv_aGYear_37_0= ruleGYear ) ) )? (otherlv_38= 'aGYearMonth' ( (lv_aGYearMonth_39_0= ruleGYearMonth ) ) )? (otherlv_40= 'aHexBinary' ( (lv_aHexBinary_41_0= ruleHexBinary ) ) )? (otherlv_42= 'aIDREF' ( (lv_aIDREF_43_0= ruleIDREF ) ) )? (otherlv_44= 'aIDREFS' ( (lv_aIDREFS_45_0= ruleIDREFS ) ) )? (otherlv_46= 'aInt' ( (lv_aInt_47_0= ruleInt0 ) ) )? (otherlv_48= 'aInteger' ( (lv_aInteger_49_0= ruleInteger ) ) )? (otherlv_50= 'aLanguage' ( (lv_aLanguage_51_0= ruleLanguage ) ) )? (otherlv_52= 'aLong' ( (lv_aLong_53_0= ruleLong ) ) )? (otherlv_54= 'aName' ( (lv_aName_55_0= ruleName ) ) )? (otherlv_56= 'aNCName' ( (lv_aNCName_57_0= ruleNCName ) ) )? (otherlv_58= 'aNMTOKEN' ( (lv_aNMTOKEN_59_0= ruleNMTOKEN ) ) )? (otherlv_60= 'aNMTOKENS' ( (lv_aNMTOKENS_61_0= ruleNMTOKENS ) ) )? (otherlv_62= 'aNonNegativeInteger' ( (lv_aNonNegativeInteger_63_0= ruleNonNegativeInteger ) ) )? (otherlv_64= 'aNonPositiveInteger' ( (lv_aNonPositiveInteger_65_0= ruleNonPositiveInteger ) ) )? (otherlv_66= 'aPositiveInteger' ( (lv_aPositiveInteger_67_0= rulePositiveInteger ) ) )? (otherlv_68= 'aQName' ( (lv_aQName_69_0= ruleQName ) ) )? (otherlv_70= 'aShort' ( (lv_aShort_71_0= ruleShort ) ) )? (otherlv_72= 'aString' ( (lv_aString_73_0= ruleString0 ) ) )? (otherlv_74= 'aTime' ( (lv_aTime_75_0= ruleTime ) ) )? (otherlv_76= 'aToken' ( (lv_aToken_77_0= ruleToken ) ) )? (otherlv_78= 'aUnsignedByte' ( (lv_aUnsignedByte_79_0= ruleUnsignedByte ) ) )? (otherlv_80= 'aUnsignedInt' ( (lv_aUnsignedInt_81_0= ruleUnsignedInt ) ) )? (otherlv_82= 'aUnsignedLong' ( (lv_aUnsignedLong_83_0= ruleUnsignedLong ) ) )? (otherlv_84= 'aUnsignedShort' ( (lv_aUnsignedShort_85_0= ruleUnsignedShort ) ) )? otherlv_86= '}' ) ;
    public final EObject ruleDataTypeTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token otherlv_50=null;
        Token otherlv_52=null;
        Token otherlv_54=null;
        Token otherlv_56=null;
        Token otherlv_58=null;
        Token otherlv_60=null;
        Token otherlv_62=null;
        Token otherlv_64=null;
        Token otherlv_66=null;
        Token otherlv_68=null;
        Token otherlv_70=null;
        Token otherlv_72=null;
        Token otherlv_74=null;
        Token otherlv_76=null;
        Token otherlv_78=null;
        Token otherlv_80=null;
        Token otherlv_82=null;
        Token otherlv_84=null;
        Token otherlv_86=null;
        AntlrDatatypeRuleToken lv_aID_2_0 = null;

        AntlrDatatypeRuleToken lv_aAnySimpleType_5_0 = null;

        AntlrDatatypeRuleToken lv_aAnyURI_7_0 = null;

        AntlrDatatypeRuleToken lv_aBase64Binary_9_0 = null;

        AntlrDatatypeRuleToken lv_aBoolean_11_0 = null;

        AntlrDatatypeRuleToken lv_aByte_13_0 = null;

        AntlrDatatypeRuleToken lv_aDate_15_0 = null;

        AntlrDatatypeRuleToken lv_aDateTime_17_0 = null;

        AntlrDatatypeRuleToken lv_aDecimal_19_0 = null;

        AntlrDatatypeRuleToken lv_aDouble_21_0 = null;

        AntlrDatatypeRuleToken lv_aDuration_23_0 = null;

        AntlrDatatypeRuleToken lv_aEntities_25_0 = null;

        AntlrDatatypeRuleToken lv_aEntity_27_0 = null;

        AntlrDatatypeRuleToken lv_aFloat_29_0 = null;

        AntlrDatatypeRuleToken lv_aGDay_31_0 = null;

        AntlrDatatypeRuleToken lv_aGMonth_33_0 = null;

        AntlrDatatypeRuleToken lv_aGMonthDay_35_0 = null;

        AntlrDatatypeRuleToken lv_aGYear_37_0 = null;

        AntlrDatatypeRuleToken lv_aGYearMonth_39_0 = null;

        AntlrDatatypeRuleToken lv_aHexBinary_41_0 = null;

        AntlrDatatypeRuleToken lv_aIDREF_43_0 = null;

        AntlrDatatypeRuleToken lv_aIDREFS_45_0 = null;

        AntlrDatatypeRuleToken lv_aInt_47_0 = null;

        AntlrDatatypeRuleToken lv_aInteger_49_0 = null;

        AntlrDatatypeRuleToken lv_aLanguage_51_0 = null;

        AntlrDatatypeRuleToken lv_aLong_53_0 = null;

        AntlrDatatypeRuleToken lv_aName_55_0 = null;

        AntlrDatatypeRuleToken lv_aNCName_57_0 = null;

        AntlrDatatypeRuleToken lv_aNMTOKEN_59_0 = null;

        AntlrDatatypeRuleToken lv_aNMTOKENS_61_0 = null;

        AntlrDatatypeRuleToken lv_aNonNegativeInteger_63_0 = null;

        AntlrDatatypeRuleToken lv_aNonPositiveInteger_65_0 = null;

        AntlrDatatypeRuleToken lv_aPositiveInteger_67_0 = null;

        AntlrDatatypeRuleToken lv_aQName_69_0 = null;

        AntlrDatatypeRuleToken lv_aShort_71_0 = null;

        AntlrDatatypeRuleToken lv_aString_73_0 = null;

        AntlrDatatypeRuleToken lv_aTime_75_0 = null;

        AntlrDatatypeRuleToken lv_aToken_77_0 = null;

        AntlrDatatypeRuleToken lv_aUnsignedByte_79_0 = null;

        AntlrDatatypeRuleToken lv_aUnsignedInt_81_0 = null;

        AntlrDatatypeRuleToken lv_aUnsignedLong_83_0 = null;

        AntlrDatatypeRuleToken lv_aUnsignedShort_85_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:79:28: ( ( () otherlv_1= 'DataTypeTest' ( (lv_aID_2_0= ruleID0 ) ) otherlv_3= '{' (otherlv_4= 'aAnySimpleType' ( (lv_aAnySimpleType_5_0= ruleAnySimpleType ) ) )? (otherlv_6= 'aAnyURI' ( (lv_aAnyURI_7_0= ruleAnyURI ) ) )? (otherlv_8= 'aBase64Binary' ( (lv_aBase64Binary_9_0= ruleBase64Binary ) ) )? (otherlv_10= 'aBoolean' ( (lv_aBoolean_11_0= ruleBoolean ) ) )? (otherlv_12= 'aByte' ( (lv_aByte_13_0= ruleByte ) ) )? (otherlv_14= 'aDate' ( (lv_aDate_15_0= ruleDate ) ) )? (otherlv_16= 'aDateTime' ( (lv_aDateTime_17_0= ruleDateTime ) ) )? (otherlv_18= 'aDecimal' ( (lv_aDecimal_19_0= ruleDecimal ) ) )? (otherlv_20= 'aDouble' ( (lv_aDouble_21_0= ruleDouble ) ) )? (otherlv_22= 'aDuration' ( (lv_aDuration_23_0= ruleDuration ) ) )? (otherlv_24= 'aEntities' ( (lv_aEntities_25_0= ruleENTITIES ) ) )? (otherlv_26= 'aEntity' ( (lv_aEntity_27_0= ruleENTITY ) ) )? (otherlv_28= 'aFloat' ( (lv_aFloat_29_0= ruleFloat ) ) )? (otherlv_30= 'aGDay' ( (lv_aGDay_31_0= ruleGDay ) ) )? (otherlv_32= 'aGMonth' ( (lv_aGMonth_33_0= ruleGMonth ) ) )? (otherlv_34= 'aGMonthDay' ( (lv_aGMonthDay_35_0= ruleGMonthDay ) ) )? (otherlv_36= 'aGYear' ( (lv_aGYear_37_0= ruleGYear ) ) )? (otherlv_38= 'aGYearMonth' ( (lv_aGYearMonth_39_0= ruleGYearMonth ) ) )? (otherlv_40= 'aHexBinary' ( (lv_aHexBinary_41_0= ruleHexBinary ) ) )? (otherlv_42= 'aIDREF' ( (lv_aIDREF_43_0= ruleIDREF ) ) )? (otherlv_44= 'aIDREFS' ( (lv_aIDREFS_45_0= ruleIDREFS ) ) )? (otherlv_46= 'aInt' ( (lv_aInt_47_0= ruleInt0 ) ) )? (otherlv_48= 'aInteger' ( (lv_aInteger_49_0= ruleInteger ) ) )? (otherlv_50= 'aLanguage' ( (lv_aLanguage_51_0= ruleLanguage ) ) )? (otherlv_52= 'aLong' ( (lv_aLong_53_0= ruleLong ) ) )? (otherlv_54= 'aName' ( (lv_aName_55_0= ruleName ) ) )? (otherlv_56= 'aNCName' ( (lv_aNCName_57_0= ruleNCName ) ) )? (otherlv_58= 'aNMTOKEN' ( (lv_aNMTOKEN_59_0= ruleNMTOKEN ) ) )? (otherlv_60= 'aNMTOKENS' ( (lv_aNMTOKENS_61_0= ruleNMTOKENS ) ) )? (otherlv_62= 'aNonNegativeInteger' ( (lv_aNonNegativeInteger_63_0= ruleNonNegativeInteger ) ) )? (otherlv_64= 'aNonPositiveInteger' ( (lv_aNonPositiveInteger_65_0= ruleNonPositiveInteger ) ) )? (otherlv_66= 'aPositiveInteger' ( (lv_aPositiveInteger_67_0= rulePositiveInteger ) ) )? (otherlv_68= 'aQName' ( (lv_aQName_69_0= ruleQName ) ) )? (otherlv_70= 'aShort' ( (lv_aShort_71_0= ruleShort ) ) )? (otherlv_72= 'aString' ( (lv_aString_73_0= ruleString0 ) ) )? (otherlv_74= 'aTime' ( (lv_aTime_75_0= ruleTime ) ) )? (otherlv_76= 'aToken' ( (lv_aToken_77_0= ruleToken ) ) )? (otherlv_78= 'aUnsignedByte' ( (lv_aUnsignedByte_79_0= ruleUnsignedByte ) ) )? (otherlv_80= 'aUnsignedInt' ( (lv_aUnsignedInt_81_0= ruleUnsignedInt ) ) )? (otherlv_82= 'aUnsignedLong' ( (lv_aUnsignedLong_83_0= ruleUnsignedLong ) ) )? (otherlv_84= 'aUnsignedShort' ( (lv_aUnsignedShort_85_0= ruleUnsignedShort ) ) )? otherlv_86= '}' ) )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:80:1: ( () otherlv_1= 'DataTypeTest' ( (lv_aID_2_0= ruleID0 ) ) otherlv_3= '{' (otherlv_4= 'aAnySimpleType' ( (lv_aAnySimpleType_5_0= ruleAnySimpleType ) ) )? (otherlv_6= 'aAnyURI' ( (lv_aAnyURI_7_0= ruleAnyURI ) ) )? (otherlv_8= 'aBase64Binary' ( (lv_aBase64Binary_9_0= ruleBase64Binary ) ) )? (otherlv_10= 'aBoolean' ( (lv_aBoolean_11_0= ruleBoolean ) ) )? (otherlv_12= 'aByte' ( (lv_aByte_13_0= ruleByte ) ) )? (otherlv_14= 'aDate' ( (lv_aDate_15_0= ruleDate ) ) )? (otherlv_16= 'aDateTime' ( (lv_aDateTime_17_0= ruleDateTime ) ) )? (otherlv_18= 'aDecimal' ( (lv_aDecimal_19_0= ruleDecimal ) ) )? (otherlv_20= 'aDouble' ( (lv_aDouble_21_0= ruleDouble ) ) )? (otherlv_22= 'aDuration' ( (lv_aDuration_23_0= ruleDuration ) ) )? (otherlv_24= 'aEntities' ( (lv_aEntities_25_0= ruleENTITIES ) ) )? (otherlv_26= 'aEntity' ( (lv_aEntity_27_0= ruleENTITY ) ) )? (otherlv_28= 'aFloat' ( (lv_aFloat_29_0= ruleFloat ) ) )? (otherlv_30= 'aGDay' ( (lv_aGDay_31_0= ruleGDay ) ) )? (otherlv_32= 'aGMonth' ( (lv_aGMonth_33_0= ruleGMonth ) ) )? (otherlv_34= 'aGMonthDay' ( (lv_aGMonthDay_35_0= ruleGMonthDay ) ) )? (otherlv_36= 'aGYear' ( (lv_aGYear_37_0= ruleGYear ) ) )? (otherlv_38= 'aGYearMonth' ( (lv_aGYearMonth_39_0= ruleGYearMonth ) ) )? (otherlv_40= 'aHexBinary' ( (lv_aHexBinary_41_0= ruleHexBinary ) ) )? (otherlv_42= 'aIDREF' ( (lv_aIDREF_43_0= ruleIDREF ) ) )? (otherlv_44= 'aIDREFS' ( (lv_aIDREFS_45_0= ruleIDREFS ) ) )? (otherlv_46= 'aInt' ( (lv_aInt_47_0= ruleInt0 ) ) )? (otherlv_48= 'aInteger' ( (lv_aInteger_49_0= ruleInteger ) ) )? (otherlv_50= 'aLanguage' ( (lv_aLanguage_51_0= ruleLanguage ) ) )? (otherlv_52= 'aLong' ( (lv_aLong_53_0= ruleLong ) ) )? (otherlv_54= 'aName' ( (lv_aName_55_0= ruleName ) ) )? (otherlv_56= 'aNCName' ( (lv_aNCName_57_0= ruleNCName ) ) )? (otherlv_58= 'aNMTOKEN' ( (lv_aNMTOKEN_59_0= ruleNMTOKEN ) ) )? (otherlv_60= 'aNMTOKENS' ( (lv_aNMTOKENS_61_0= ruleNMTOKENS ) ) )? (otherlv_62= 'aNonNegativeInteger' ( (lv_aNonNegativeInteger_63_0= ruleNonNegativeInteger ) ) )? (otherlv_64= 'aNonPositiveInteger' ( (lv_aNonPositiveInteger_65_0= ruleNonPositiveInteger ) ) )? (otherlv_66= 'aPositiveInteger' ( (lv_aPositiveInteger_67_0= rulePositiveInteger ) ) )? (otherlv_68= 'aQName' ( (lv_aQName_69_0= ruleQName ) ) )? (otherlv_70= 'aShort' ( (lv_aShort_71_0= ruleShort ) ) )? (otherlv_72= 'aString' ( (lv_aString_73_0= ruleString0 ) ) )? (otherlv_74= 'aTime' ( (lv_aTime_75_0= ruleTime ) ) )? (otherlv_76= 'aToken' ( (lv_aToken_77_0= ruleToken ) ) )? (otherlv_78= 'aUnsignedByte' ( (lv_aUnsignedByte_79_0= ruleUnsignedByte ) ) )? (otherlv_80= 'aUnsignedInt' ( (lv_aUnsignedInt_81_0= ruleUnsignedInt ) ) )? (otherlv_82= 'aUnsignedLong' ( (lv_aUnsignedLong_83_0= ruleUnsignedLong ) ) )? (otherlv_84= 'aUnsignedShort' ( (lv_aUnsignedShort_85_0= ruleUnsignedShort ) ) )? otherlv_86= '}' )
            {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:80:1: ( () otherlv_1= 'DataTypeTest' ( (lv_aID_2_0= ruleID0 ) ) otherlv_3= '{' (otherlv_4= 'aAnySimpleType' ( (lv_aAnySimpleType_5_0= ruleAnySimpleType ) ) )? (otherlv_6= 'aAnyURI' ( (lv_aAnyURI_7_0= ruleAnyURI ) ) )? (otherlv_8= 'aBase64Binary' ( (lv_aBase64Binary_9_0= ruleBase64Binary ) ) )? (otherlv_10= 'aBoolean' ( (lv_aBoolean_11_0= ruleBoolean ) ) )? (otherlv_12= 'aByte' ( (lv_aByte_13_0= ruleByte ) ) )? (otherlv_14= 'aDate' ( (lv_aDate_15_0= ruleDate ) ) )? (otherlv_16= 'aDateTime' ( (lv_aDateTime_17_0= ruleDateTime ) ) )? (otherlv_18= 'aDecimal' ( (lv_aDecimal_19_0= ruleDecimal ) ) )? (otherlv_20= 'aDouble' ( (lv_aDouble_21_0= ruleDouble ) ) )? (otherlv_22= 'aDuration' ( (lv_aDuration_23_0= ruleDuration ) ) )? (otherlv_24= 'aEntities' ( (lv_aEntities_25_0= ruleENTITIES ) ) )? (otherlv_26= 'aEntity' ( (lv_aEntity_27_0= ruleENTITY ) ) )? (otherlv_28= 'aFloat' ( (lv_aFloat_29_0= ruleFloat ) ) )? (otherlv_30= 'aGDay' ( (lv_aGDay_31_0= ruleGDay ) ) )? (otherlv_32= 'aGMonth' ( (lv_aGMonth_33_0= ruleGMonth ) ) )? (otherlv_34= 'aGMonthDay' ( (lv_aGMonthDay_35_0= ruleGMonthDay ) ) )? (otherlv_36= 'aGYear' ( (lv_aGYear_37_0= ruleGYear ) ) )? (otherlv_38= 'aGYearMonth' ( (lv_aGYearMonth_39_0= ruleGYearMonth ) ) )? (otherlv_40= 'aHexBinary' ( (lv_aHexBinary_41_0= ruleHexBinary ) ) )? (otherlv_42= 'aIDREF' ( (lv_aIDREF_43_0= ruleIDREF ) ) )? (otherlv_44= 'aIDREFS' ( (lv_aIDREFS_45_0= ruleIDREFS ) ) )? (otherlv_46= 'aInt' ( (lv_aInt_47_0= ruleInt0 ) ) )? (otherlv_48= 'aInteger' ( (lv_aInteger_49_0= ruleInteger ) ) )? (otherlv_50= 'aLanguage' ( (lv_aLanguage_51_0= ruleLanguage ) ) )? (otherlv_52= 'aLong' ( (lv_aLong_53_0= ruleLong ) ) )? (otherlv_54= 'aName' ( (lv_aName_55_0= ruleName ) ) )? (otherlv_56= 'aNCName' ( (lv_aNCName_57_0= ruleNCName ) ) )? (otherlv_58= 'aNMTOKEN' ( (lv_aNMTOKEN_59_0= ruleNMTOKEN ) ) )? (otherlv_60= 'aNMTOKENS' ( (lv_aNMTOKENS_61_0= ruleNMTOKENS ) ) )? (otherlv_62= 'aNonNegativeInteger' ( (lv_aNonNegativeInteger_63_0= ruleNonNegativeInteger ) ) )? (otherlv_64= 'aNonPositiveInteger' ( (lv_aNonPositiveInteger_65_0= ruleNonPositiveInteger ) ) )? (otherlv_66= 'aPositiveInteger' ( (lv_aPositiveInteger_67_0= rulePositiveInteger ) ) )? (otherlv_68= 'aQName' ( (lv_aQName_69_0= ruleQName ) ) )? (otherlv_70= 'aShort' ( (lv_aShort_71_0= ruleShort ) ) )? (otherlv_72= 'aString' ( (lv_aString_73_0= ruleString0 ) ) )? (otherlv_74= 'aTime' ( (lv_aTime_75_0= ruleTime ) ) )? (otherlv_76= 'aToken' ( (lv_aToken_77_0= ruleToken ) ) )? (otherlv_78= 'aUnsignedByte' ( (lv_aUnsignedByte_79_0= ruleUnsignedByte ) ) )? (otherlv_80= 'aUnsignedInt' ( (lv_aUnsignedInt_81_0= ruleUnsignedInt ) ) )? (otherlv_82= 'aUnsignedLong' ( (lv_aUnsignedLong_83_0= ruleUnsignedLong ) ) )? (otherlv_84= 'aUnsignedShort' ( (lv_aUnsignedShort_85_0= ruleUnsignedShort ) ) )? otherlv_86= '}' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:80:2: () otherlv_1= 'DataTypeTest' ( (lv_aID_2_0= ruleID0 ) ) otherlv_3= '{' (otherlv_4= 'aAnySimpleType' ( (lv_aAnySimpleType_5_0= ruleAnySimpleType ) ) )? (otherlv_6= 'aAnyURI' ( (lv_aAnyURI_7_0= ruleAnyURI ) ) )? (otherlv_8= 'aBase64Binary' ( (lv_aBase64Binary_9_0= ruleBase64Binary ) ) )? (otherlv_10= 'aBoolean' ( (lv_aBoolean_11_0= ruleBoolean ) ) )? (otherlv_12= 'aByte' ( (lv_aByte_13_0= ruleByte ) ) )? (otherlv_14= 'aDate' ( (lv_aDate_15_0= ruleDate ) ) )? (otherlv_16= 'aDateTime' ( (lv_aDateTime_17_0= ruleDateTime ) ) )? (otherlv_18= 'aDecimal' ( (lv_aDecimal_19_0= ruleDecimal ) ) )? (otherlv_20= 'aDouble' ( (lv_aDouble_21_0= ruleDouble ) ) )? (otherlv_22= 'aDuration' ( (lv_aDuration_23_0= ruleDuration ) ) )? (otherlv_24= 'aEntities' ( (lv_aEntities_25_0= ruleENTITIES ) ) )? (otherlv_26= 'aEntity' ( (lv_aEntity_27_0= ruleENTITY ) ) )? (otherlv_28= 'aFloat' ( (lv_aFloat_29_0= ruleFloat ) ) )? (otherlv_30= 'aGDay' ( (lv_aGDay_31_0= ruleGDay ) ) )? (otherlv_32= 'aGMonth' ( (lv_aGMonth_33_0= ruleGMonth ) ) )? (otherlv_34= 'aGMonthDay' ( (lv_aGMonthDay_35_0= ruleGMonthDay ) ) )? (otherlv_36= 'aGYear' ( (lv_aGYear_37_0= ruleGYear ) ) )? (otherlv_38= 'aGYearMonth' ( (lv_aGYearMonth_39_0= ruleGYearMonth ) ) )? (otherlv_40= 'aHexBinary' ( (lv_aHexBinary_41_0= ruleHexBinary ) ) )? (otherlv_42= 'aIDREF' ( (lv_aIDREF_43_0= ruleIDREF ) ) )? (otherlv_44= 'aIDREFS' ( (lv_aIDREFS_45_0= ruleIDREFS ) ) )? (otherlv_46= 'aInt' ( (lv_aInt_47_0= ruleInt0 ) ) )? (otherlv_48= 'aInteger' ( (lv_aInteger_49_0= ruleInteger ) ) )? (otherlv_50= 'aLanguage' ( (lv_aLanguage_51_0= ruleLanguage ) ) )? (otherlv_52= 'aLong' ( (lv_aLong_53_0= ruleLong ) ) )? (otherlv_54= 'aName' ( (lv_aName_55_0= ruleName ) ) )? (otherlv_56= 'aNCName' ( (lv_aNCName_57_0= ruleNCName ) ) )? (otherlv_58= 'aNMTOKEN' ( (lv_aNMTOKEN_59_0= ruleNMTOKEN ) ) )? (otherlv_60= 'aNMTOKENS' ( (lv_aNMTOKENS_61_0= ruleNMTOKENS ) ) )? (otherlv_62= 'aNonNegativeInteger' ( (lv_aNonNegativeInteger_63_0= ruleNonNegativeInteger ) ) )? (otherlv_64= 'aNonPositiveInteger' ( (lv_aNonPositiveInteger_65_0= ruleNonPositiveInteger ) ) )? (otherlv_66= 'aPositiveInteger' ( (lv_aPositiveInteger_67_0= rulePositiveInteger ) ) )? (otherlv_68= 'aQName' ( (lv_aQName_69_0= ruleQName ) ) )? (otherlv_70= 'aShort' ( (lv_aShort_71_0= ruleShort ) ) )? (otherlv_72= 'aString' ( (lv_aString_73_0= ruleString0 ) ) )? (otherlv_74= 'aTime' ( (lv_aTime_75_0= ruleTime ) ) )? (otherlv_76= 'aToken' ( (lv_aToken_77_0= ruleToken ) ) )? (otherlv_78= 'aUnsignedByte' ( (lv_aUnsignedByte_79_0= ruleUnsignedByte ) ) )? (otherlv_80= 'aUnsignedInt' ( (lv_aUnsignedInt_81_0= ruleUnsignedInt ) ) )? (otherlv_82= 'aUnsignedLong' ( (lv_aUnsignedLong_83_0= ruleUnsignedLong ) ) )? (otherlv_84= 'aUnsignedShort' ( (lv_aUnsignedShort_85_0= ruleUnsignedShort ) ) )? otherlv_86= '}'
            {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:80:2: ()
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDataTypeTestAccess().getDataTypeTestAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleDataTypeTest131); 

                	newLeafNode(otherlv_1, grammarAccess.getDataTypeTestAccess().getDataTypeTestKeyword_1());
                
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:90:1: ( (lv_aID_2_0= ruleID0 ) )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:91:1: (lv_aID_2_0= ruleID0 )
            {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:91:1: (lv_aID_2_0= ruleID0 )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:92:3: lv_aID_2_0= ruleID0
            {
             
            	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getAIDID0ParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleID0_in_ruleDataTypeTest152);
            lv_aID_2_0=ruleID0();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
            	        }
                   		set(
                   			current, 
                   			"aID",
                    		lv_aID_2_0, 
                    		"ID0");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDataTypeTest164); 

                	newLeafNode(otherlv_3, grammarAccess.getDataTypeTestAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:112:1: (otherlv_4= 'aAnySimpleType' ( (lv_aAnySimpleType_5_0= ruleAnySimpleType ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:112:3: otherlv_4= 'aAnySimpleType' ( (lv_aAnySimpleType_5_0= ruleAnySimpleType ) )
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDataTypeTest177); 

                        	newLeafNode(otherlv_4, grammarAccess.getDataTypeTestAccess().getAAnySimpleTypeKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:116:1: ( (lv_aAnySimpleType_5_0= ruleAnySimpleType ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:117:1: (lv_aAnySimpleType_5_0= ruleAnySimpleType )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:117:1: (lv_aAnySimpleType_5_0= ruleAnySimpleType )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:118:3: lv_aAnySimpleType_5_0= ruleAnySimpleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getAAnySimpleTypeAnySimpleTypeParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnySimpleType_in_ruleDataTypeTest198);
                    lv_aAnySimpleType_5_0=ruleAnySimpleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aAnySimpleType",
                            		lv_aAnySimpleType_5_0, 
                            		"AnySimpleType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:134:4: (otherlv_6= 'aAnyURI' ( (lv_aAnyURI_7_0= ruleAnyURI ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:134:6: otherlv_6= 'aAnyURI' ( (lv_aAnyURI_7_0= ruleAnyURI ) )
                    {
                    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDataTypeTest213); 

                        	newLeafNode(otherlv_6, grammarAccess.getDataTypeTestAccess().getAAnyURIKeyword_5_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:138:1: ( (lv_aAnyURI_7_0= ruleAnyURI ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:139:1: (lv_aAnyURI_7_0= ruleAnyURI )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:139:1: (lv_aAnyURI_7_0= ruleAnyURI )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:140:3: lv_aAnyURI_7_0= ruleAnyURI
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getAAnyURIAnyURIParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnyURI_in_ruleDataTypeTest234);
                    lv_aAnyURI_7_0=ruleAnyURI();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aAnyURI",
                            		lv_aAnyURI_7_0, 
                            		"AnyURI");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:156:4: (otherlv_8= 'aBase64Binary' ( (lv_aBase64Binary_9_0= ruleBase64Binary ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:156:6: otherlv_8= 'aBase64Binary' ( (lv_aBase64Binary_9_0= ruleBase64Binary ) )
                    {
                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDataTypeTest249); 

                        	newLeafNode(otherlv_8, grammarAccess.getDataTypeTestAccess().getABase64BinaryKeyword_6_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:160:1: ( (lv_aBase64Binary_9_0= ruleBase64Binary ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:161:1: (lv_aBase64Binary_9_0= ruleBase64Binary )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:161:1: (lv_aBase64Binary_9_0= ruleBase64Binary )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:162:3: lv_aBase64Binary_9_0= ruleBase64Binary
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getABase64BinaryBase64BinaryParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBase64Binary_in_ruleDataTypeTest270);
                    lv_aBase64Binary_9_0=ruleBase64Binary();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aBase64Binary",
                            		lv_aBase64Binary_9_0, 
                            		"Base64Binary");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:178:4: (otherlv_10= 'aBoolean' ( (lv_aBoolean_11_0= ruleBoolean ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:178:6: otherlv_10= 'aBoolean' ( (lv_aBoolean_11_0= ruleBoolean ) )
                    {
                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDataTypeTest285); 

                        	newLeafNode(otherlv_10, grammarAccess.getDataTypeTestAccess().getABooleanKeyword_7_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:182:1: ( (lv_aBoolean_11_0= ruleBoolean ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:183:1: (lv_aBoolean_11_0= ruleBoolean )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:183:1: (lv_aBoolean_11_0= ruleBoolean )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:184:3: lv_aBoolean_11_0= ruleBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getABooleanBooleanParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_ruleDataTypeTest306);
                    lv_aBoolean_11_0=ruleBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aBoolean",
                            		lv_aBoolean_11_0, 
                            		"Boolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:200:4: (otherlv_12= 'aByte' ( (lv_aByte_13_0= ruleByte ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:200:6: otherlv_12= 'aByte' ( (lv_aByte_13_0= ruleByte ) )
                    {
                    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDataTypeTest321); 

                        	newLeafNode(otherlv_12, grammarAccess.getDataTypeTestAccess().getAByteKeyword_8_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:204:1: ( (lv_aByte_13_0= ruleByte ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:205:1: (lv_aByte_13_0= ruleByte )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:205:1: (lv_aByte_13_0= ruleByte )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:206:3: lv_aByte_13_0= ruleByte
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getAByteByteParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleByte_in_ruleDataTypeTest342);
                    lv_aByte_13_0=ruleByte();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aByte",
                            		lv_aByte_13_0, 
                            		"Byte");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:222:4: (otherlv_14= 'aDate' ( (lv_aDate_15_0= ruleDate ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:222:6: otherlv_14= 'aDate' ( (lv_aDate_15_0= ruleDate ) )
                    {
                    otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDataTypeTest357); 

                        	newLeafNode(otherlv_14, grammarAccess.getDataTypeTestAccess().getADateKeyword_9_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:226:1: ( (lv_aDate_15_0= ruleDate ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:227:1: (lv_aDate_15_0= ruleDate )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:227:1: (lv_aDate_15_0= ruleDate )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:228:3: lv_aDate_15_0= ruleDate
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getADateDateParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDate_in_ruleDataTypeTest378);
                    lv_aDate_15_0=ruleDate();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aDate",
                            		lv_aDate_15_0, 
                            		"Date");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:244:4: (otherlv_16= 'aDateTime' ( (lv_aDateTime_17_0= ruleDateTime ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:244:6: otherlv_16= 'aDateTime' ( (lv_aDateTime_17_0= ruleDateTime ) )
                    {
                    otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDataTypeTest393); 

                        	newLeafNode(otherlv_16, grammarAccess.getDataTypeTestAccess().getADateTimeKeyword_10_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:248:1: ( (lv_aDateTime_17_0= ruleDateTime ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:249:1: (lv_aDateTime_17_0= ruleDateTime )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:249:1: (lv_aDateTime_17_0= ruleDateTime )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:250:3: lv_aDateTime_17_0= ruleDateTime
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getADateTimeDateTimeParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDateTime_in_ruleDataTypeTest414);
                    lv_aDateTime_17_0=ruleDateTime();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aDateTime",
                            		lv_aDateTime_17_0, 
                            		"DateTime");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:266:4: (otherlv_18= 'aDecimal' ( (lv_aDecimal_19_0= ruleDecimal ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:266:6: otherlv_18= 'aDecimal' ( (lv_aDecimal_19_0= ruleDecimal ) )
                    {
                    otherlv_18=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleDataTypeTest429); 

                        	newLeafNode(otherlv_18, grammarAccess.getDataTypeTestAccess().getADecimalKeyword_11_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:270:1: ( (lv_aDecimal_19_0= ruleDecimal ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:271:1: (lv_aDecimal_19_0= ruleDecimal )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:271:1: (lv_aDecimal_19_0= ruleDecimal )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:272:3: lv_aDecimal_19_0= ruleDecimal
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getADecimalDecimalParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDecimal_in_ruleDataTypeTest450);
                    lv_aDecimal_19_0=ruleDecimal();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aDecimal",
                            		lv_aDecimal_19_0, 
                            		"Decimal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:288:4: (otherlv_20= 'aDouble' ( (lv_aDouble_21_0= ruleDouble ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:288:6: otherlv_20= 'aDouble' ( (lv_aDouble_21_0= ruleDouble ) )
                    {
                    otherlv_20=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleDataTypeTest465); 

                        	newLeafNode(otherlv_20, grammarAccess.getDataTypeTestAccess().getADoubleKeyword_12_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:292:1: ( (lv_aDouble_21_0= ruleDouble ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:293:1: (lv_aDouble_21_0= ruleDouble )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:293:1: (lv_aDouble_21_0= ruleDouble )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:294:3: lv_aDouble_21_0= ruleDouble
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getADoubleDoubleParserRuleCall_12_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDouble_in_ruleDataTypeTest486);
                    lv_aDouble_21_0=ruleDouble();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aDouble",
                            		lv_aDouble_21_0, 
                            		"Double");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:310:4: (otherlv_22= 'aDuration' ( (lv_aDuration_23_0= ruleDuration ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:310:6: otherlv_22= 'aDuration' ( (lv_aDuration_23_0= ruleDuration ) )
                    {
                    otherlv_22=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleDataTypeTest501); 

                        	newLeafNode(otherlv_22, grammarAccess.getDataTypeTestAccess().getADurationKeyword_13_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:314:1: ( (lv_aDuration_23_0= ruleDuration ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:315:1: (lv_aDuration_23_0= ruleDuration )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:315:1: (lv_aDuration_23_0= ruleDuration )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:316:3: lv_aDuration_23_0= ruleDuration
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getADurationDurationParserRuleCall_13_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDuration_in_ruleDataTypeTest522);
                    lv_aDuration_23_0=ruleDuration();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aDuration",
                            		lv_aDuration_23_0, 
                            		"Duration");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:332:4: (otherlv_24= 'aEntities' ( (lv_aEntities_25_0= ruleENTITIES ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:332:6: otherlv_24= 'aEntities' ( (lv_aEntities_25_0= ruleENTITIES ) )
                    {
                    otherlv_24=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleDataTypeTest537); 

                        	newLeafNode(otherlv_24, grammarAccess.getDataTypeTestAccess().getAEntitiesKeyword_14_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:336:1: ( (lv_aEntities_25_0= ruleENTITIES ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:337:1: (lv_aEntities_25_0= ruleENTITIES )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:337:1: (lv_aEntities_25_0= ruleENTITIES )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:338:3: lv_aEntities_25_0= ruleENTITIES
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getAEntitiesENTITIESParserRuleCall_14_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleENTITIES_in_ruleDataTypeTest558);
                    lv_aEntities_25_0=ruleENTITIES();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aEntities",
                            		lv_aEntities_25_0, 
                            		"ENTITIES");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:354:4: (otherlv_26= 'aEntity' ( (lv_aEntity_27_0= ruleENTITY ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:354:6: otherlv_26= 'aEntity' ( (lv_aEntity_27_0= ruleENTITY ) )
                    {
                    otherlv_26=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleDataTypeTest573); 

                        	newLeafNode(otherlv_26, grammarAccess.getDataTypeTestAccess().getAEntityKeyword_15_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:358:1: ( (lv_aEntity_27_0= ruleENTITY ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:359:1: (lv_aEntity_27_0= ruleENTITY )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:359:1: (lv_aEntity_27_0= ruleENTITY )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:360:3: lv_aEntity_27_0= ruleENTITY
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getAEntityENTITYParserRuleCall_15_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleENTITY_in_ruleDataTypeTest594);
                    lv_aEntity_27_0=ruleENTITY();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aEntity",
                            		lv_aEntity_27_0, 
                            		"ENTITY");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:376:4: (otherlv_28= 'aFloat' ( (lv_aFloat_29_0= ruleFloat ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:376:6: otherlv_28= 'aFloat' ( (lv_aFloat_29_0= ruleFloat ) )
                    {
                    otherlv_28=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleDataTypeTest609); 

                        	newLeafNode(otherlv_28, grammarAccess.getDataTypeTestAccess().getAFloatKeyword_16_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:380:1: ( (lv_aFloat_29_0= ruleFloat ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:381:1: (lv_aFloat_29_0= ruleFloat )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:381:1: (lv_aFloat_29_0= ruleFloat )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:382:3: lv_aFloat_29_0= ruleFloat
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getAFloatFloatParserRuleCall_16_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFloat_in_ruleDataTypeTest630);
                    lv_aFloat_29_0=ruleFloat();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aFloat",
                            		lv_aFloat_29_0, 
                            		"Float");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:398:4: (otherlv_30= 'aGDay' ( (lv_aGDay_31_0= ruleGDay ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:398:6: otherlv_30= 'aGDay' ( (lv_aGDay_31_0= ruleGDay ) )
                    {
                    otherlv_30=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleDataTypeTest645); 

                        	newLeafNode(otherlv_30, grammarAccess.getDataTypeTestAccess().getAGDayKeyword_17_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:402:1: ( (lv_aGDay_31_0= ruleGDay ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:403:1: (lv_aGDay_31_0= ruleGDay )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:403:1: (lv_aGDay_31_0= ruleGDay )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:404:3: lv_aGDay_31_0= ruleGDay
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getAGDayGDayParserRuleCall_17_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGDay_in_ruleDataTypeTest666);
                    lv_aGDay_31_0=ruleGDay();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aGDay",
                            		lv_aGDay_31_0, 
                            		"GDay");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:420:4: (otherlv_32= 'aGMonth' ( (lv_aGMonth_33_0= ruleGMonth ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:420:6: otherlv_32= 'aGMonth' ( (lv_aGMonth_33_0= ruleGMonth ) )
                    {
                    otherlv_32=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleDataTypeTest681); 

                        	newLeafNode(otherlv_32, grammarAccess.getDataTypeTestAccess().getAGMonthKeyword_18_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:424:1: ( (lv_aGMonth_33_0= ruleGMonth ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:425:1: (lv_aGMonth_33_0= ruleGMonth )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:425:1: (lv_aGMonth_33_0= ruleGMonth )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:426:3: lv_aGMonth_33_0= ruleGMonth
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getAGMonthGMonthParserRuleCall_18_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGMonth_in_ruleDataTypeTest702);
                    lv_aGMonth_33_0=ruleGMonth();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aGMonth",
                            		lv_aGMonth_33_0, 
                            		"GMonth");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:442:4: (otherlv_34= 'aGMonthDay' ( (lv_aGMonthDay_35_0= ruleGMonthDay ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:442:6: otherlv_34= 'aGMonthDay' ( (lv_aGMonthDay_35_0= ruleGMonthDay ) )
                    {
                    otherlv_34=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleDataTypeTest717); 

                        	newLeafNode(otherlv_34, grammarAccess.getDataTypeTestAccess().getAGMonthDayKeyword_19_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:446:1: ( (lv_aGMonthDay_35_0= ruleGMonthDay ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:447:1: (lv_aGMonthDay_35_0= ruleGMonthDay )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:447:1: (lv_aGMonthDay_35_0= ruleGMonthDay )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:448:3: lv_aGMonthDay_35_0= ruleGMonthDay
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getAGMonthDayGMonthDayParserRuleCall_19_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGMonthDay_in_ruleDataTypeTest738);
                    lv_aGMonthDay_35_0=ruleGMonthDay();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aGMonthDay",
                            		lv_aGMonthDay_35_0, 
                            		"GMonthDay");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:464:4: (otherlv_36= 'aGYear' ( (lv_aGYear_37_0= ruleGYear ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:464:6: otherlv_36= 'aGYear' ( (lv_aGYear_37_0= ruleGYear ) )
                    {
                    otherlv_36=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDataTypeTest753); 

                        	newLeafNode(otherlv_36, grammarAccess.getDataTypeTestAccess().getAGYearKeyword_20_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:468:1: ( (lv_aGYear_37_0= ruleGYear ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:469:1: (lv_aGYear_37_0= ruleGYear )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:469:1: (lv_aGYear_37_0= ruleGYear )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:470:3: lv_aGYear_37_0= ruleGYear
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getAGYearGYearParserRuleCall_20_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGYear_in_ruleDataTypeTest774);
                    lv_aGYear_37_0=ruleGYear();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aGYear",
                            		lv_aGYear_37_0, 
                            		"GYear");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:486:4: (otherlv_38= 'aGYearMonth' ( (lv_aGYearMonth_39_0= ruleGYearMonth ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:486:6: otherlv_38= 'aGYearMonth' ( (lv_aGYearMonth_39_0= ruleGYearMonth ) )
                    {
                    otherlv_38=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleDataTypeTest789); 

                        	newLeafNode(otherlv_38, grammarAccess.getDataTypeTestAccess().getAGYearMonthKeyword_21_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:490:1: ( (lv_aGYearMonth_39_0= ruleGYearMonth ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:491:1: (lv_aGYearMonth_39_0= ruleGYearMonth )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:491:1: (lv_aGYearMonth_39_0= ruleGYearMonth )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:492:3: lv_aGYearMonth_39_0= ruleGYearMonth
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getAGYearMonthGYearMonthParserRuleCall_21_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGYearMonth_in_ruleDataTypeTest810);
                    lv_aGYearMonth_39_0=ruleGYearMonth();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aGYearMonth",
                            		lv_aGYearMonth_39_0, 
                            		"GYearMonth");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:508:4: (otherlv_40= 'aHexBinary' ( (lv_aHexBinary_41_0= ruleHexBinary ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:508:6: otherlv_40= 'aHexBinary' ( (lv_aHexBinary_41_0= ruleHexBinary ) )
                    {
                    otherlv_40=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleDataTypeTest825); 

                        	newLeafNode(otherlv_40, grammarAccess.getDataTypeTestAccess().getAHexBinaryKeyword_22_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:512:1: ( (lv_aHexBinary_41_0= ruleHexBinary ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:513:1: (lv_aHexBinary_41_0= ruleHexBinary )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:513:1: (lv_aHexBinary_41_0= ruleHexBinary )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:514:3: lv_aHexBinary_41_0= ruleHexBinary
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getAHexBinaryHexBinaryParserRuleCall_22_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleHexBinary_in_ruleDataTypeTest846);
                    lv_aHexBinary_41_0=ruleHexBinary();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aHexBinary",
                            		lv_aHexBinary_41_0, 
                            		"HexBinary");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:530:4: (otherlv_42= 'aIDREF' ( (lv_aIDREF_43_0= ruleIDREF ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:530:6: otherlv_42= 'aIDREF' ( (lv_aIDREF_43_0= ruleIDREF ) )
                    {
                    otherlv_42=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleDataTypeTest861); 

                        	newLeafNode(otherlv_42, grammarAccess.getDataTypeTestAccess().getAIDREFKeyword_23_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:534:1: ( (lv_aIDREF_43_0= ruleIDREF ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:535:1: (lv_aIDREF_43_0= ruleIDREF )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:535:1: (lv_aIDREF_43_0= ruleIDREF )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:536:3: lv_aIDREF_43_0= ruleIDREF
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getAIDREFIDREFParserRuleCall_23_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleIDREF_in_ruleDataTypeTest882);
                    lv_aIDREF_43_0=ruleIDREF();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aIDREF",
                            		lv_aIDREF_43_0, 
                            		"IDREF");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:552:4: (otherlv_44= 'aIDREFS' ( (lv_aIDREFS_45_0= ruleIDREFS ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:552:6: otherlv_44= 'aIDREFS' ( (lv_aIDREFS_45_0= ruleIDREFS ) )
                    {
                    otherlv_44=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleDataTypeTest897); 

                        	newLeafNode(otherlv_44, grammarAccess.getDataTypeTestAccess().getAIDREFSKeyword_24_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:556:1: ( (lv_aIDREFS_45_0= ruleIDREFS ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:557:1: (lv_aIDREFS_45_0= ruleIDREFS )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:557:1: (lv_aIDREFS_45_0= ruleIDREFS )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:558:3: lv_aIDREFS_45_0= ruleIDREFS
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getAIDREFSIDREFSParserRuleCall_24_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleIDREFS_in_ruleDataTypeTest918);
                    lv_aIDREFS_45_0=ruleIDREFS();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aIDREFS",
                            		lv_aIDREFS_45_0, 
                            		"IDREFS");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:574:4: (otherlv_46= 'aInt' ( (lv_aInt_47_0= ruleInt0 ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:574:6: otherlv_46= 'aInt' ( (lv_aInt_47_0= ruleInt0 ) )
                    {
                    otherlv_46=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleDataTypeTest933); 

                        	newLeafNode(otherlv_46, grammarAccess.getDataTypeTestAccess().getAIntKeyword_25_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:578:1: ( (lv_aInt_47_0= ruleInt0 ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:579:1: (lv_aInt_47_0= ruleInt0 )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:579:1: (lv_aInt_47_0= ruleInt0 )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:580:3: lv_aInt_47_0= ruleInt0
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getAIntInt0ParserRuleCall_25_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInt0_in_ruleDataTypeTest954);
                    lv_aInt_47_0=ruleInt0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aInt",
                            		lv_aInt_47_0, 
                            		"Int0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:596:4: (otherlv_48= 'aInteger' ( (lv_aInteger_49_0= ruleInteger ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:596:6: otherlv_48= 'aInteger' ( (lv_aInteger_49_0= ruleInteger ) )
                    {
                    otherlv_48=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleDataTypeTest969); 

                        	newLeafNode(otherlv_48, grammarAccess.getDataTypeTestAccess().getAIntegerKeyword_26_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:600:1: ( (lv_aInteger_49_0= ruleInteger ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:601:1: (lv_aInteger_49_0= ruleInteger )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:601:1: (lv_aInteger_49_0= ruleInteger )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:602:3: lv_aInteger_49_0= ruleInteger
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getAIntegerIntegerParserRuleCall_26_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInteger_in_ruleDataTypeTest990);
                    lv_aInteger_49_0=ruleInteger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aInteger",
                            		lv_aInteger_49_0, 
                            		"Integer");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:618:4: (otherlv_50= 'aLanguage' ( (lv_aLanguage_51_0= ruleLanguage ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==36) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:618:6: otherlv_50= 'aLanguage' ( (lv_aLanguage_51_0= ruleLanguage ) )
                    {
                    otherlv_50=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleDataTypeTest1005); 

                        	newLeafNode(otherlv_50, grammarAccess.getDataTypeTestAccess().getALanguageKeyword_27_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:622:1: ( (lv_aLanguage_51_0= ruleLanguage ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:623:1: (lv_aLanguage_51_0= ruleLanguage )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:623:1: (lv_aLanguage_51_0= ruleLanguage )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:624:3: lv_aLanguage_51_0= ruleLanguage
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getALanguageLanguageParserRuleCall_27_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLanguage_in_ruleDataTypeTest1026);
                    lv_aLanguage_51_0=ruleLanguage();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aLanguage",
                            		lv_aLanguage_51_0, 
                            		"Language");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:640:4: (otherlv_52= 'aLong' ( (lv_aLong_53_0= ruleLong ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:640:6: otherlv_52= 'aLong' ( (lv_aLong_53_0= ruleLong ) )
                    {
                    otherlv_52=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleDataTypeTest1041); 

                        	newLeafNode(otherlv_52, grammarAccess.getDataTypeTestAccess().getALongKeyword_28_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:644:1: ( (lv_aLong_53_0= ruleLong ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:645:1: (lv_aLong_53_0= ruleLong )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:645:1: (lv_aLong_53_0= ruleLong )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:646:3: lv_aLong_53_0= ruleLong
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getALongLongParserRuleCall_28_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLong_in_ruleDataTypeTest1062);
                    lv_aLong_53_0=ruleLong();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aLong",
                            		lv_aLong_53_0, 
                            		"Long");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:662:4: (otherlv_54= 'aName' ( (lv_aName_55_0= ruleName ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:662:6: otherlv_54= 'aName' ( (lv_aName_55_0= ruleName ) )
                    {
                    otherlv_54=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleDataTypeTest1077); 

                        	newLeafNode(otherlv_54, grammarAccess.getDataTypeTestAccess().getANameKeyword_29_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:666:1: ( (lv_aName_55_0= ruleName ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:667:1: (lv_aName_55_0= ruleName )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:667:1: (lv_aName_55_0= ruleName )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:668:3: lv_aName_55_0= ruleName
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getANameNameParserRuleCall_29_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleName_in_ruleDataTypeTest1098);
                    lv_aName_55_0=ruleName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aName",
                            		lv_aName_55_0, 
                            		"Name");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:684:4: (otherlv_56= 'aNCName' ( (lv_aNCName_57_0= ruleNCName ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:684:6: otherlv_56= 'aNCName' ( (lv_aNCName_57_0= ruleNCName ) )
                    {
                    otherlv_56=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleDataTypeTest1113); 

                        	newLeafNode(otherlv_56, grammarAccess.getDataTypeTestAccess().getANCNameKeyword_30_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:688:1: ( (lv_aNCName_57_0= ruleNCName ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:689:1: (lv_aNCName_57_0= ruleNCName )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:689:1: (lv_aNCName_57_0= ruleNCName )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:690:3: lv_aNCName_57_0= ruleNCName
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getANCNameNCNameParserRuleCall_30_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNCName_in_ruleDataTypeTest1134);
                    lv_aNCName_57_0=ruleNCName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aNCName",
                            		lv_aNCName_57_0, 
                            		"NCName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:706:4: (otherlv_58= 'aNMTOKEN' ( (lv_aNMTOKEN_59_0= ruleNMTOKEN ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:706:6: otherlv_58= 'aNMTOKEN' ( (lv_aNMTOKEN_59_0= ruleNMTOKEN ) )
                    {
                    otherlv_58=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleDataTypeTest1149); 

                        	newLeafNode(otherlv_58, grammarAccess.getDataTypeTestAccess().getANMTOKENKeyword_31_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:710:1: ( (lv_aNMTOKEN_59_0= ruleNMTOKEN ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:711:1: (lv_aNMTOKEN_59_0= ruleNMTOKEN )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:711:1: (lv_aNMTOKEN_59_0= ruleNMTOKEN )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:712:3: lv_aNMTOKEN_59_0= ruleNMTOKEN
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getANMTOKENNMTOKENParserRuleCall_31_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNMTOKEN_in_ruleDataTypeTest1170);
                    lv_aNMTOKEN_59_0=ruleNMTOKEN();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aNMTOKEN",
                            		lv_aNMTOKEN_59_0, 
                            		"NMTOKEN");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:728:4: (otherlv_60= 'aNMTOKENS' ( (lv_aNMTOKENS_61_0= ruleNMTOKENS ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==41) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:728:6: otherlv_60= 'aNMTOKENS' ( (lv_aNMTOKENS_61_0= ruleNMTOKENS ) )
                    {
                    otherlv_60=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleDataTypeTest1185); 

                        	newLeafNode(otherlv_60, grammarAccess.getDataTypeTestAccess().getANMTOKENSKeyword_32_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:732:1: ( (lv_aNMTOKENS_61_0= ruleNMTOKENS ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:733:1: (lv_aNMTOKENS_61_0= ruleNMTOKENS )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:733:1: (lv_aNMTOKENS_61_0= ruleNMTOKENS )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:734:3: lv_aNMTOKENS_61_0= ruleNMTOKENS
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getANMTOKENSNMTOKENSParserRuleCall_32_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNMTOKENS_in_ruleDataTypeTest1206);
                    lv_aNMTOKENS_61_0=ruleNMTOKENS();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aNMTOKENS",
                            		lv_aNMTOKENS_61_0, 
                            		"NMTOKENS");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:750:4: (otherlv_62= 'aNonNegativeInteger' ( (lv_aNonNegativeInteger_63_0= ruleNonNegativeInteger ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==42) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:750:6: otherlv_62= 'aNonNegativeInteger' ( (lv_aNonNegativeInteger_63_0= ruleNonNegativeInteger ) )
                    {
                    otherlv_62=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleDataTypeTest1221); 

                        	newLeafNode(otherlv_62, grammarAccess.getDataTypeTestAccess().getANonNegativeIntegerKeyword_33_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:754:1: ( (lv_aNonNegativeInteger_63_0= ruleNonNegativeInteger ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:755:1: (lv_aNonNegativeInteger_63_0= ruleNonNegativeInteger )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:755:1: (lv_aNonNegativeInteger_63_0= ruleNonNegativeInteger )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:756:3: lv_aNonNegativeInteger_63_0= ruleNonNegativeInteger
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getANonNegativeIntegerNonNegativeIntegerParserRuleCall_33_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNonNegativeInteger_in_ruleDataTypeTest1242);
                    lv_aNonNegativeInteger_63_0=ruleNonNegativeInteger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aNonNegativeInteger",
                            		lv_aNonNegativeInteger_63_0, 
                            		"NonNegativeInteger");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:772:4: (otherlv_64= 'aNonPositiveInteger' ( (lv_aNonPositiveInteger_65_0= ruleNonPositiveInteger ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==43) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:772:6: otherlv_64= 'aNonPositiveInteger' ( (lv_aNonPositiveInteger_65_0= ruleNonPositiveInteger ) )
                    {
                    otherlv_64=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleDataTypeTest1257); 

                        	newLeafNode(otherlv_64, grammarAccess.getDataTypeTestAccess().getANonPositiveIntegerKeyword_34_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:776:1: ( (lv_aNonPositiveInteger_65_0= ruleNonPositiveInteger ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:777:1: (lv_aNonPositiveInteger_65_0= ruleNonPositiveInteger )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:777:1: (lv_aNonPositiveInteger_65_0= ruleNonPositiveInteger )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:778:3: lv_aNonPositiveInteger_65_0= ruleNonPositiveInteger
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getANonPositiveIntegerNonPositiveIntegerParserRuleCall_34_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNonPositiveInteger_in_ruleDataTypeTest1278);
                    lv_aNonPositiveInteger_65_0=ruleNonPositiveInteger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aNonPositiveInteger",
                            		lv_aNonPositiveInteger_65_0, 
                            		"NonPositiveInteger");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:794:4: (otherlv_66= 'aPositiveInteger' ( (lv_aPositiveInteger_67_0= rulePositiveInteger ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==44) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:794:6: otherlv_66= 'aPositiveInteger' ( (lv_aPositiveInteger_67_0= rulePositiveInteger ) )
                    {
                    otherlv_66=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleDataTypeTest1293); 

                        	newLeafNode(otherlv_66, grammarAccess.getDataTypeTestAccess().getAPositiveIntegerKeyword_35_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:798:1: ( (lv_aPositiveInteger_67_0= rulePositiveInteger ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:799:1: (lv_aPositiveInteger_67_0= rulePositiveInteger )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:799:1: (lv_aPositiveInteger_67_0= rulePositiveInteger )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:800:3: lv_aPositiveInteger_67_0= rulePositiveInteger
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getAPositiveIntegerPositiveIntegerParserRuleCall_35_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePositiveInteger_in_ruleDataTypeTest1314);
                    lv_aPositiveInteger_67_0=rulePositiveInteger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aPositiveInteger",
                            		lv_aPositiveInteger_67_0, 
                            		"PositiveInteger");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:816:4: (otherlv_68= 'aQName' ( (lv_aQName_69_0= ruleQName ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==45) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:816:6: otherlv_68= 'aQName' ( (lv_aQName_69_0= ruleQName ) )
                    {
                    otherlv_68=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleDataTypeTest1329); 

                        	newLeafNode(otherlv_68, grammarAccess.getDataTypeTestAccess().getAQNameKeyword_36_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:820:1: ( (lv_aQName_69_0= ruleQName ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:821:1: (lv_aQName_69_0= ruleQName )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:821:1: (lv_aQName_69_0= ruleQName )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:822:3: lv_aQName_69_0= ruleQName
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getAQNameQNameParserRuleCall_36_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQName_in_ruleDataTypeTest1350);
                    lv_aQName_69_0=ruleQName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aQName",
                            		lv_aQName_69_0, 
                            		"QName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:838:4: (otherlv_70= 'aShort' ( (lv_aShort_71_0= ruleShort ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==46) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:838:6: otherlv_70= 'aShort' ( (lv_aShort_71_0= ruleShort ) )
                    {
                    otherlv_70=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleDataTypeTest1365); 

                        	newLeafNode(otherlv_70, grammarAccess.getDataTypeTestAccess().getAShortKeyword_37_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:842:1: ( (lv_aShort_71_0= ruleShort ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:843:1: (lv_aShort_71_0= ruleShort )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:843:1: (lv_aShort_71_0= ruleShort )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:844:3: lv_aShort_71_0= ruleShort
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getAShortShortParserRuleCall_37_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleShort_in_ruleDataTypeTest1386);
                    lv_aShort_71_0=ruleShort();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aShort",
                            		lv_aShort_71_0, 
                            		"Short");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:860:4: (otherlv_72= 'aString' ( (lv_aString_73_0= ruleString0 ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==47) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:860:6: otherlv_72= 'aString' ( (lv_aString_73_0= ruleString0 ) )
                    {
                    otherlv_72=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleDataTypeTest1401); 

                        	newLeafNode(otherlv_72, grammarAccess.getDataTypeTestAccess().getAStringKeyword_38_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:864:1: ( (lv_aString_73_0= ruleString0 ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:865:1: (lv_aString_73_0= ruleString0 )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:865:1: (lv_aString_73_0= ruleString0 )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:866:3: lv_aString_73_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getAStringString0ParserRuleCall_38_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleDataTypeTest1422);
                    lv_aString_73_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aString",
                            		lv_aString_73_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:882:4: (otherlv_74= 'aTime' ( (lv_aTime_75_0= ruleTime ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==48) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:882:6: otherlv_74= 'aTime' ( (lv_aTime_75_0= ruleTime ) )
                    {
                    otherlv_74=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleDataTypeTest1437); 

                        	newLeafNode(otherlv_74, grammarAccess.getDataTypeTestAccess().getATimeKeyword_39_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:886:1: ( (lv_aTime_75_0= ruleTime ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:887:1: (lv_aTime_75_0= ruleTime )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:887:1: (lv_aTime_75_0= ruleTime )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:888:3: lv_aTime_75_0= ruleTime
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getATimeTimeParserRuleCall_39_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTime_in_ruleDataTypeTest1458);
                    lv_aTime_75_0=ruleTime();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aTime",
                            		lv_aTime_75_0, 
                            		"Time");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:904:4: (otherlv_76= 'aToken' ( (lv_aToken_77_0= ruleToken ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==49) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:904:6: otherlv_76= 'aToken' ( (lv_aToken_77_0= ruleToken ) )
                    {
                    otherlv_76=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleDataTypeTest1473); 

                        	newLeafNode(otherlv_76, grammarAccess.getDataTypeTestAccess().getATokenKeyword_40_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:908:1: ( (lv_aToken_77_0= ruleToken ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:909:1: (lv_aToken_77_0= ruleToken )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:909:1: (lv_aToken_77_0= ruleToken )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:910:3: lv_aToken_77_0= ruleToken
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getATokenTokenParserRuleCall_40_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleToken_in_ruleDataTypeTest1494);
                    lv_aToken_77_0=ruleToken();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aToken",
                            		lv_aToken_77_0, 
                            		"Token");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:926:4: (otherlv_78= 'aUnsignedByte' ( (lv_aUnsignedByte_79_0= ruleUnsignedByte ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==50) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:926:6: otherlv_78= 'aUnsignedByte' ( (lv_aUnsignedByte_79_0= ruleUnsignedByte ) )
                    {
                    otherlv_78=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleDataTypeTest1509); 

                        	newLeafNode(otherlv_78, grammarAccess.getDataTypeTestAccess().getAUnsignedByteKeyword_41_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:930:1: ( (lv_aUnsignedByte_79_0= ruleUnsignedByte ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:931:1: (lv_aUnsignedByte_79_0= ruleUnsignedByte )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:931:1: (lv_aUnsignedByte_79_0= ruleUnsignedByte )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:932:3: lv_aUnsignedByte_79_0= ruleUnsignedByte
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getAUnsignedByteUnsignedByteParserRuleCall_41_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleUnsignedByte_in_ruleDataTypeTest1530);
                    lv_aUnsignedByte_79_0=ruleUnsignedByte();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aUnsignedByte",
                            		lv_aUnsignedByte_79_0, 
                            		"UnsignedByte");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:948:4: (otherlv_80= 'aUnsignedInt' ( (lv_aUnsignedInt_81_0= ruleUnsignedInt ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==51) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:948:6: otherlv_80= 'aUnsignedInt' ( (lv_aUnsignedInt_81_0= ruleUnsignedInt ) )
                    {
                    otherlv_80=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleDataTypeTest1545); 

                        	newLeafNode(otherlv_80, grammarAccess.getDataTypeTestAccess().getAUnsignedIntKeyword_42_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:952:1: ( (lv_aUnsignedInt_81_0= ruleUnsignedInt ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:953:1: (lv_aUnsignedInt_81_0= ruleUnsignedInt )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:953:1: (lv_aUnsignedInt_81_0= ruleUnsignedInt )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:954:3: lv_aUnsignedInt_81_0= ruleUnsignedInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getAUnsignedIntUnsignedIntParserRuleCall_42_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleUnsignedInt_in_ruleDataTypeTest1566);
                    lv_aUnsignedInt_81_0=ruleUnsignedInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aUnsignedInt",
                            		lv_aUnsignedInt_81_0, 
                            		"UnsignedInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:970:4: (otherlv_82= 'aUnsignedLong' ( (lv_aUnsignedLong_83_0= ruleUnsignedLong ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==52) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:970:6: otherlv_82= 'aUnsignedLong' ( (lv_aUnsignedLong_83_0= ruleUnsignedLong ) )
                    {
                    otherlv_82=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleDataTypeTest1581); 

                        	newLeafNode(otherlv_82, grammarAccess.getDataTypeTestAccess().getAUnsignedLongKeyword_43_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:974:1: ( (lv_aUnsignedLong_83_0= ruleUnsignedLong ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:975:1: (lv_aUnsignedLong_83_0= ruleUnsignedLong )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:975:1: (lv_aUnsignedLong_83_0= ruleUnsignedLong )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:976:3: lv_aUnsignedLong_83_0= ruleUnsignedLong
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getAUnsignedLongUnsignedLongParserRuleCall_43_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleUnsignedLong_in_ruleDataTypeTest1602);
                    lv_aUnsignedLong_83_0=ruleUnsignedLong();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aUnsignedLong",
                            		lv_aUnsignedLong_83_0, 
                            		"UnsignedLong");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:992:4: (otherlv_84= 'aUnsignedShort' ( (lv_aUnsignedShort_85_0= ruleUnsignedShort ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==53) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:992:6: otherlv_84= 'aUnsignedShort' ( (lv_aUnsignedShort_85_0= ruleUnsignedShort ) )
                    {
                    otherlv_84=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleDataTypeTest1617); 

                        	newLeafNode(otherlv_84, grammarAccess.getDataTypeTestAccess().getAUnsignedShortKeyword_44_0());
                        
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:996:1: ( (lv_aUnsignedShort_85_0= ruleUnsignedShort ) )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:997:1: (lv_aUnsignedShort_85_0= ruleUnsignedShort )
                    {
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:997:1: (lv_aUnsignedShort_85_0= ruleUnsignedShort )
                    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:998:3: lv_aUnsignedShort_85_0= ruleUnsignedShort
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeTestAccess().getAUnsignedShortUnsignedShortParserRuleCall_44_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleUnsignedShort_in_ruleDataTypeTest1638);
                    lv_aUnsignedShort_85_0=ruleUnsignedShort();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"aUnsignedShort",
                            		lv_aUnsignedShort_85_0, 
                            		"UnsignedShort");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_86=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleDataTypeTest1652); 

                	newLeafNode(otherlv_86, grammarAccess.getDataTypeTestAccess().getRightCurlyBracketKeyword_45());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataTypeTest"


    // $ANTLR start "entryRuleAnySimpleType"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1026:1: entryRuleAnySimpleType returns [String current=null] : iv_ruleAnySimpleType= ruleAnySimpleType EOF ;
    public final String entryRuleAnySimpleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnySimpleType = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1027:2: (iv_ruleAnySimpleType= ruleAnySimpleType EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1028:2: iv_ruleAnySimpleType= ruleAnySimpleType EOF
            {
             newCompositeNode(grammarAccess.getAnySimpleTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnySimpleType_in_entryRuleAnySimpleType1689);
            iv_ruleAnySimpleType=ruleAnySimpleType();

            state._fsp--;

             current =iv_ruleAnySimpleType.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnySimpleType1700); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnySimpleType"


    // $ANTLR start "ruleAnySimpleType"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1035:1: ruleAnySimpleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'AnySimpleType' ;
    public final AntlrDatatypeRuleToken ruleAnySimpleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1038:28: (kw= 'AnySimpleType' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1040:2: kw= 'AnySimpleType'
            {
            kw=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleAnySimpleType1737); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAnySimpleTypeAccess().getAnySimpleTypeKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnySimpleType"


    // $ANTLR start "entryRuleAnyURI"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1053:1: entryRuleAnyURI returns [String current=null] : iv_ruleAnyURI= ruleAnyURI EOF ;
    public final String entryRuleAnyURI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnyURI = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1054:2: (iv_ruleAnyURI= ruleAnyURI EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1055:2: iv_ruleAnyURI= ruleAnyURI EOF
            {
             newCompositeNode(grammarAccess.getAnyURIRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyURI_in_entryRuleAnyURI1777);
            iv_ruleAnyURI=ruleAnyURI();

            state._fsp--;

             current =iv_ruleAnyURI.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnyURI1788); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnyURI"


    // $ANTLR start "ruleAnyURI"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1062:1: ruleAnyURI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'AnyURI' ;
    public final AntlrDatatypeRuleToken ruleAnyURI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1065:28: (kw= 'AnyURI' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1067:2: kw= 'AnyURI'
            {
            kw=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleAnyURI1825); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAnyURIAccess().getAnyURIKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnyURI"


    // $ANTLR start "entryRuleBase64Binary"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1080:1: entryRuleBase64Binary returns [String current=null] : iv_ruleBase64Binary= ruleBase64Binary EOF ;
    public final String entryRuleBase64Binary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBase64Binary = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1081:2: (iv_ruleBase64Binary= ruleBase64Binary EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1082:2: iv_ruleBase64Binary= ruleBase64Binary EOF
            {
             newCompositeNode(grammarAccess.getBase64BinaryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBase64Binary_in_entryRuleBase64Binary1865);
            iv_ruleBase64Binary=ruleBase64Binary();

            state._fsp--;

             current =iv_ruleBase64Binary.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBase64Binary1876); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBase64Binary"


    // $ANTLR start "ruleBase64Binary"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1089:1: ruleBase64Binary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Base64Binary' ;
    public final AntlrDatatypeRuleToken ruleBase64Binary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1092:28: (kw= 'Base64Binary' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1094:2: kw= 'Base64Binary'
            {
            kw=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleBase64Binary1913); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getBase64BinaryAccess().getBase64BinaryKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBase64Binary"


    // $ANTLR start "entryRuleBoolean"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1107:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1108:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1109:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_entryRuleBoolean1953);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolean1964); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1116:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Boolean' ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1119:28: (kw= 'Boolean' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1121:2: kw= 'Boolean'
            {
            kw=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleBoolean2001); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getBooleanAccess().getBooleanKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleByte"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1134:1: entryRuleByte returns [String current=null] : iv_ruleByte= ruleByte EOF ;
    public final String entryRuleByte() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleByte = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1135:2: (iv_ruleByte= ruleByte EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1136:2: iv_ruleByte= ruleByte EOF
            {
             newCompositeNode(grammarAccess.getByteRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleByte_in_entryRuleByte2041);
            iv_ruleByte=ruleByte();

            state._fsp--;

             current =iv_ruleByte.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleByte2052); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleByte"


    // $ANTLR start "ruleByte"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1143:1: ruleByte returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Byte' ;
    public final AntlrDatatypeRuleToken ruleByte() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1146:28: (kw= 'Byte' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1148:2: kw= 'Byte'
            {
            kw=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleByte2089); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getByteAccess().getByteKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleByte"


    // $ANTLR start "entryRuleDate"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1161:1: entryRuleDate returns [String current=null] : iv_ruleDate= ruleDate EOF ;
    public final String entryRuleDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDate = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1162:2: (iv_ruleDate= ruleDate EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1163:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_entryRuleDate2129);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDate2140); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1170:1: ruleDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Date' ;
    public final AntlrDatatypeRuleToken ruleDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1173:28: (kw= 'Date' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1175:2: kw= 'Date'
            {
            kw=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleDate2177); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDateAccess().getDateKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleDateTime"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1188:1: entryRuleDateTime returns [String current=null] : iv_ruleDateTime= ruleDateTime EOF ;
    public final String entryRuleDateTime() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDateTime = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1189:2: (iv_ruleDateTime= ruleDateTime EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1190:2: iv_ruleDateTime= ruleDateTime EOF
            {
             newCompositeNode(grammarAccess.getDateTimeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDateTime_in_entryRuleDateTime2217);
            iv_ruleDateTime=ruleDateTime();

            state._fsp--;

             current =iv_ruleDateTime.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDateTime2228); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDateTime"


    // $ANTLR start "ruleDateTime"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1197:1: ruleDateTime returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'DateTime' ;
    public final AntlrDatatypeRuleToken ruleDateTime() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1200:28: (kw= 'DateTime' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1202:2: kw= 'DateTime'
            {
            kw=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleDateTime2265); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDateTimeAccess().getDateTimeKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateTime"


    // $ANTLR start "entryRuleDecimal"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1215:1: entryRuleDecimal returns [String current=null] : iv_ruleDecimal= ruleDecimal EOF ;
    public final String entryRuleDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecimal = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1216:2: (iv_ruleDecimal= ruleDecimal EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1217:2: iv_ruleDecimal= ruleDecimal EOF
            {
             newCompositeNode(grammarAccess.getDecimalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDecimal_in_entryRuleDecimal2305);
            iv_ruleDecimal=ruleDecimal();

            state._fsp--;

             current =iv_ruleDecimal.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDecimal2316); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecimal"


    // $ANTLR start "ruleDecimal"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1224:1: ruleDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Decimal' ;
    public final AntlrDatatypeRuleToken ruleDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1227:28: (kw= 'Decimal' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1229:2: kw= 'Decimal'
            {
            kw=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleDecimal2353); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDecimalAccess().getDecimalKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecimal"


    // $ANTLR start "entryRuleDouble"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1242:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1243:2: (iv_ruleDouble= ruleDouble EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1244:2: iv_ruleDouble= ruleDouble EOF
            {
             newCompositeNode(grammarAccess.getDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDouble_in_entryRuleDouble2393);
            iv_ruleDouble=ruleDouble();

            state._fsp--;

             current =iv_ruleDouble.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDouble2404); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1251:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Double' ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1254:28: (kw= 'Double' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1256:2: kw= 'Double'
            {
            kw=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleDouble2441); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDoubleAccess().getDoubleKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRuleDuration"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1269:1: entryRuleDuration returns [String current=null] : iv_ruleDuration= ruleDuration EOF ;
    public final String entryRuleDuration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDuration = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1270:2: (iv_ruleDuration= ruleDuration EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1271:2: iv_ruleDuration= ruleDuration EOF
            {
             newCompositeNode(grammarAccess.getDurationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDuration_in_entryRuleDuration2481);
            iv_ruleDuration=ruleDuration();

            state._fsp--;

             current =iv_ruleDuration.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDuration2492); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDuration"


    // $ANTLR start "ruleDuration"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1278:1: ruleDuration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Duration' ;
    public final AntlrDatatypeRuleToken ruleDuration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1281:28: (kw= 'Duration' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1283:2: kw= 'Duration'
            {
            kw=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleDuration2529); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDurationAccess().getDurationKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDuration"


    // $ANTLR start "entryRuleENTITIES"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1296:1: entryRuleENTITIES returns [String current=null] : iv_ruleENTITIES= ruleENTITIES EOF ;
    public final String entryRuleENTITIES() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleENTITIES = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1297:2: (iv_ruleENTITIES= ruleENTITIES EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1298:2: iv_ruleENTITIES= ruleENTITIES EOF
            {
             newCompositeNode(grammarAccess.getENTITIESRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleENTITIES_in_entryRuleENTITIES2569);
            iv_ruleENTITIES=ruleENTITIES();

            state._fsp--;

             current =iv_ruleENTITIES.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleENTITIES2580); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleENTITIES"


    // $ANTLR start "ruleENTITIES"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1305:1: ruleENTITIES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ENTITIES' ;
    public final AntlrDatatypeRuleToken ruleENTITIES() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1308:28: (kw= 'ENTITIES' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1310:2: kw= 'ENTITIES'
            {
            kw=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleENTITIES2617); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getENTITIESAccess().getENTITIESKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleENTITIES"


    // $ANTLR start "entryRuleENTITY"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1323:1: entryRuleENTITY returns [String current=null] : iv_ruleENTITY= ruleENTITY EOF ;
    public final String entryRuleENTITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleENTITY = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1324:2: (iv_ruleENTITY= ruleENTITY EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1325:2: iv_ruleENTITY= ruleENTITY EOF
            {
             newCompositeNode(grammarAccess.getENTITYRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleENTITY_in_entryRuleENTITY2657);
            iv_ruleENTITY=ruleENTITY();

            state._fsp--;

             current =iv_ruleENTITY.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleENTITY2668); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleENTITY"


    // $ANTLR start "ruleENTITY"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1332:1: ruleENTITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ENTITY' ;
    public final AntlrDatatypeRuleToken ruleENTITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1335:28: (kw= 'ENTITY' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1337:2: kw= 'ENTITY'
            {
            kw=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleENTITY2705); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getENTITYAccess().getENTITYKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleENTITY"


    // $ANTLR start "entryRuleFloat"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1350:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1351:2: (iv_ruleFloat= ruleFloat EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1352:2: iv_ruleFloat= ruleFloat EOF
            {
             newCompositeNode(grammarAccess.getFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFloat_in_entryRuleFloat2745);
            iv_ruleFloat=ruleFloat();

            state._fsp--;

             current =iv_ruleFloat.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloat2756); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1359:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Float' ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1362:28: (kw= 'Float' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1364:2: kw= 'Float'
            {
            kw=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleFloat2793); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFloatAccess().getFloatKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleGDay"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1377:1: entryRuleGDay returns [String current=null] : iv_ruleGDay= ruleGDay EOF ;
    public final String entryRuleGDay() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGDay = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1378:2: (iv_ruleGDay= ruleGDay EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1379:2: iv_ruleGDay= ruleGDay EOF
            {
             newCompositeNode(grammarAccess.getGDayRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGDay_in_entryRuleGDay2833);
            iv_ruleGDay=ruleGDay();

            state._fsp--;

             current =iv_ruleGDay.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGDay2844); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGDay"


    // $ANTLR start "ruleGDay"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1386:1: ruleGDay returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'GDay' ;
    public final AntlrDatatypeRuleToken ruleGDay() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1389:28: (kw= 'GDay' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1391:2: kw= 'GDay'
            {
            kw=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleGDay2881); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getGDayAccess().getGDayKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGDay"


    // $ANTLR start "entryRuleGMonth"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1404:1: entryRuleGMonth returns [String current=null] : iv_ruleGMonth= ruleGMonth EOF ;
    public final String entryRuleGMonth() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGMonth = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1405:2: (iv_ruleGMonth= ruleGMonth EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1406:2: iv_ruleGMonth= ruleGMonth EOF
            {
             newCompositeNode(grammarAccess.getGMonthRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGMonth_in_entryRuleGMonth2921);
            iv_ruleGMonth=ruleGMonth();

            state._fsp--;

             current =iv_ruleGMonth.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGMonth2932); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGMonth"


    // $ANTLR start "ruleGMonth"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1413:1: ruleGMonth returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'GMonth' ;
    public final AntlrDatatypeRuleToken ruleGMonth() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1416:28: (kw= 'GMonth' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1418:2: kw= 'GMonth'
            {
            kw=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleGMonth2969); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getGMonthAccess().getGMonthKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGMonth"


    // $ANTLR start "entryRuleGMonthDay"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1431:1: entryRuleGMonthDay returns [String current=null] : iv_ruleGMonthDay= ruleGMonthDay EOF ;
    public final String entryRuleGMonthDay() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGMonthDay = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1432:2: (iv_ruleGMonthDay= ruleGMonthDay EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1433:2: iv_ruleGMonthDay= ruleGMonthDay EOF
            {
             newCompositeNode(grammarAccess.getGMonthDayRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGMonthDay_in_entryRuleGMonthDay3009);
            iv_ruleGMonthDay=ruleGMonthDay();

            state._fsp--;

             current =iv_ruleGMonthDay.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGMonthDay3020); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGMonthDay"


    // $ANTLR start "ruleGMonthDay"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1440:1: ruleGMonthDay returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'GMonthDay' ;
    public final AntlrDatatypeRuleToken ruleGMonthDay() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1443:28: (kw= 'GMonthDay' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1445:2: kw= 'GMonthDay'
            {
            kw=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleGMonthDay3057); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getGMonthDayAccess().getGMonthDayKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGMonthDay"


    // $ANTLR start "entryRuleGYear"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1458:1: entryRuleGYear returns [String current=null] : iv_ruleGYear= ruleGYear EOF ;
    public final String entryRuleGYear() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGYear = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1459:2: (iv_ruleGYear= ruleGYear EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1460:2: iv_ruleGYear= ruleGYear EOF
            {
             newCompositeNode(grammarAccess.getGYearRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGYear_in_entryRuleGYear3097);
            iv_ruleGYear=ruleGYear();

            state._fsp--;

             current =iv_ruleGYear.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGYear3108); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGYear"


    // $ANTLR start "ruleGYear"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1467:1: ruleGYear returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'GYear' ;
    public final AntlrDatatypeRuleToken ruleGYear() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1470:28: (kw= 'GYear' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1472:2: kw= 'GYear'
            {
            kw=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleGYear3145); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getGYearAccess().getGYearKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGYear"


    // $ANTLR start "entryRuleGYearMonth"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1485:1: entryRuleGYearMonth returns [String current=null] : iv_ruleGYearMonth= ruleGYearMonth EOF ;
    public final String entryRuleGYearMonth() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGYearMonth = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1486:2: (iv_ruleGYearMonth= ruleGYearMonth EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1487:2: iv_ruleGYearMonth= ruleGYearMonth EOF
            {
             newCompositeNode(grammarAccess.getGYearMonthRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGYearMonth_in_entryRuleGYearMonth3185);
            iv_ruleGYearMonth=ruleGYearMonth();

            state._fsp--;

             current =iv_ruleGYearMonth.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGYearMonth3196); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGYearMonth"


    // $ANTLR start "ruleGYearMonth"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1494:1: ruleGYearMonth returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'GYearMonth' ;
    public final AntlrDatatypeRuleToken ruleGYearMonth() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1497:28: (kw= 'GYearMonth' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1499:2: kw= 'GYearMonth'
            {
            kw=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleGYearMonth3233); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getGYearMonthAccess().getGYearMonthKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGYearMonth"


    // $ANTLR start "entryRuleHexBinary"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1512:1: entryRuleHexBinary returns [String current=null] : iv_ruleHexBinary= ruleHexBinary EOF ;
    public final String entryRuleHexBinary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHexBinary = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1513:2: (iv_ruleHexBinary= ruleHexBinary EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1514:2: iv_ruleHexBinary= ruleHexBinary EOF
            {
             newCompositeNode(grammarAccess.getHexBinaryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHexBinary_in_entryRuleHexBinary3273);
            iv_ruleHexBinary=ruleHexBinary();

            state._fsp--;

             current =iv_ruleHexBinary.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHexBinary3284); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHexBinary"


    // $ANTLR start "ruleHexBinary"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1521:1: ruleHexBinary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'HexBinary' ;
    public final AntlrDatatypeRuleToken ruleHexBinary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1524:28: (kw= 'HexBinary' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1526:2: kw= 'HexBinary'
            {
            kw=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleHexBinary3321); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getHexBinaryAccess().getHexBinaryKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHexBinary"


    // $ANTLR start "entryRuleID0"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1539:1: entryRuleID0 returns [String current=null] : iv_ruleID0= ruleID0 EOF ;
    public final String entryRuleID0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleID0 = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1540:2: (iv_ruleID0= ruleID0 EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1541:2: iv_ruleID0= ruleID0 EOF
            {
             newCompositeNode(grammarAccess.getID0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleID0_in_entryRuleID03361);
            iv_ruleID0=ruleID0();

            state._fsp--;

             current =iv_ruleID0.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleID03372); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleID0"


    // $ANTLR start "ruleID0"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1548:1: ruleID0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ID' ;
    public final AntlrDatatypeRuleToken ruleID0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1551:28: (kw= 'ID' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1553:2: kw= 'ID'
            {
            kw=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleID03409); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getID0Access().getIDKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleID0"


    // $ANTLR start "entryRuleIDREF"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1566:1: entryRuleIDREF returns [String current=null] : iv_ruleIDREF= ruleIDREF EOF ;
    public final String entryRuleIDREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIDREF = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1567:2: (iv_ruleIDREF= ruleIDREF EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1568:2: iv_ruleIDREF= ruleIDREF EOF
            {
             newCompositeNode(grammarAccess.getIDREFRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIDREF_in_entryRuleIDREF3449);
            iv_ruleIDREF=ruleIDREF();

            state._fsp--;

             current =iv_ruleIDREF.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIDREF3460); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIDREF"


    // $ANTLR start "ruleIDREF"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1575:1: ruleIDREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'IDREF' ;
    public final AntlrDatatypeRuleToken ruleIDREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1578:28: (kw= 'IDREF' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1580:2: kw= 'IDREF'
            {
            kw=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleIDREF3497); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIDREFAccess().getIDREFKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIDREF"


    // $ANTLR start "entryRuleIDREFS"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1593:1: entryRuleIDREFS returns [String current=null] : iv_ruleIDREFS= ruleIDREFS EOF ;
    public final String entryRuleIDREFS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIDREFS = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1594:2: (iv_ruleIDREFS= ruleIDREFS EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1595:2: iv_ruleIDREFS= ruleIDREFS EOF
            {
             newCompositeNode(grammarAccess.getIDREFSRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIDREFS_in_entryRuleIDREFS3537);
            iv_ruleIDREFS=ruleIDREFS();

            state._fsp--;

             current =iv_ruleIDREFS.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIDREFS3548); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIDREFS"


    // $ANTLR start "ruleIDREFS"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1602:1: ruleIDREFS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'IDREFS' ;
    public final AntlrDatatypeRuleToken ruleIDREFS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1605:28: (kw= 'IDREFS' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1607:2: kw= 'IDREFS'
            {
            kw=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleIDREFS3585); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIDREFSAccess().getIDREFSKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIDREFS"


    // $ANTLR start "entryRuleInt0"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1620:1: entryRuleInt0 returns [String current=null] : iv_ruleInt0= ruleInt0 EOF ;
    public final String entryRuleInt0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInt0 = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1621:2: (iv_ruleInt0= ruleInt0 EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1622:2: iv_ruleInt0= ruleInt0 EOF
            {
             newCompositeNode(grammarAccess.getInt0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInt0_in_entryRuleInt03625);
            iv_ruleInt0=ruleInt0();

            state._fsp--;

             current =iv_ruleInt0.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInt03636); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInt0"


    // $ANTLR start "ruleInt0"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1629:1: ruleInt0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Int' ;
    public final AntlrDatatypeRuleToken ruleInt0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1632:28: (kw= 'Int' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1634:2: kw= 'Int'
            {
            kw=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleInt03673); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getInt0Access().getIntKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInt0"


    // $ANTLR start "entryRuleInteger"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1647:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1648:2: (iv_ruleInteger= ruleInteger EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1649:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_entryRuleInteger3713);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteger3724); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1656:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Integer' ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1659:28: (kw= 'Integer' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1661:2: kw= 'Integer'
            {
            kw=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleInteger3761); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIntegerAccess().getIntegerKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleLanguage"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1674:1: entryRuleLanguage returns [String current=null] : iv_ruleLanguage= ruleLanguage EOF ;
    public final String entryRuleLanguage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLanguage = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1675:2: (iv_ruleLanguage= ruleLanguage EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1676:2: iv_ruleLanguage= ruleLanguage EOF
            {
             newCompositeNode(grammarAccess.getLanguageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLanguage_in_entryRuleLanguage3801);
            iv_ruleLanguage=ruleLanguage();

            state._fsp--;

             current =iv_ruleLanguage.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLanguage3812); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLanguage"


    // $ANTLR start "ruleLanguage"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1683:1: ruleLanguage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Language' ;
    public final AntlrDatatypeRuleToken ruleLanguage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1686:28: (kw= 'Language' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1688:2: kw= 'Language'
            {
            kw=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleLanguage3849); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLanguageAccess().getLanguageKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLanguage"


    // $ANTLR start "entryRuleLong"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1701:1: entryRuleLong returns [String current=null] : iv_ruleLong= ruleLong EOF ;
    public final String entryRuleLong() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLong = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1702:2: (iv_ruleLong= ruleLong EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1703:2: iv_ruleLong= ruleLong EOF
            {
             newCompositeNode(grammarAccess.getLongRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLong_in_entryRuleLong3889);
            iv_ruleLong=ruleLong();

            state._fsp--;

             current =iv_ruleLong.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLong3900); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLong"


    // $ANTLR start "ruleLong"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1710:1: ruleLong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Long' ;
    public final AntlrDatatypeRuleToken ruleLong() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1713:28: (kw= 'Long' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1715:2: kw= 'Long'
            {
            kw=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleLong3937); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLongAccess().getLongKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLong"


    // $ANTLR start "entryRuleName"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1728:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1729:2: (iv_ruleName= ruleName EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1730:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleName_in_entryRuleName3977);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleName3988); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1737:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Name' ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1740:28: (kw= 'Name' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1742:2: kw= 'Name'
            {
            kw=(Token)match(input,81,FollowSets000.FOLLOW_81_in_ruleName4025); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNameAccess().getNameKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleNCName"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1755:1: entryRuleNCName returns [String current=null] : iv_ruleNCName= ruleNCName EOF ;
    public final String entryRuleNCName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNCName = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1756:2: (iv_ruleNCName= ruleNCName EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1757:2: iv_ruleNCName= ruleNCName EOF
            {
             newCompositeNode(grammarAccess.getNCNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNCName_in_entryRuleNCName4065);
            iv_ruleNCName=ruleNCName();

            state._fsp--;

             current =iv_ruleNCName.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNCName4076); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNCName"


    // $ANTLR start "ruleNCName"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1764:1: ruleNCName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'NCName' ;
    public final AntlrDatatypeRuleToken ruleNCName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1767:28: (kw= 'NCName' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1769:2: kw= 'NCName'
            {
            kw=(Token)match(input,82,FollowSets000.FOLLOW_82_in_ruleNCName4113); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNCNameAccess().getNCNameKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNCName"


    // $ANTLR start "entryRuleNMTOKEN"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1782:1: entryRuleNMTOKEN returns [String current=null] : iv_ruleNMTOKEN= ruleNMTOKEN EOF ;
    public final String entryRuleNMTOKEN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNMTOKEN = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1783:2: (iv_ruleNMTOKEN= ruleNMTOKEN EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1784:2: iv_ruleNMTOKEN= ruleNMTOKEN EOF
            {
             newCompositeNode(grammarAccess.getNMTOKENRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNMTOKEN_in_entryRuleNMTOKEN4153);
            iv_ruleNMTOKEN=ruleNMTOKEN();

            state._fsp--;

             current =iv_ruleNMTOKEN.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNMTOKEN4164); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNMTOKEN"


    // $ANTLR start "ruleNMTOKEN"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1791:1: ruleNMTOKEN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'NMTOKEN' ;
    public final AntlrDatatypeRuleToken ruleNMTOKEN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1794:28: (kw= 'NMTOKEN' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1796:2: kw= 'NMTOKEN'
            {
            kw=(Token)match(input,83,FollowSets000.FOLLOW_83_in_ruleNMTOKEN4201); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNMTOKENAccess().getNMTOKENKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNMTOKEN"


    // $ANTLR start "entryRuleNMTOKENS"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1809:1: entryRuleNMTOKENS returns [String current=null] : iv_ruleNMTOKENS= ruleNMTOKENS EOF ;
    public final String entryRuleNMTOKENS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNMTOKENS = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1810:2: (iv_ruleNMTOKENS= ruleNMTOKENS EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1811:2: iv_ruleNMTOKENS= ruleNMTOKENS EOF
            {
             newCompositeNode(grammarAccess.getNMTOKENSRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNMTOKENS_in_entryRuleNMTOKENS4241);
            iv_ruleNMTOKENS=ruleNMTOKENS();

            state._fsp--;

             current =iv_ruleNMTOKENS.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNMTOKENS4252); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNMTOKENS"


    // $ANTLR start "ruleNMTOKENS"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1818:1: ruleNMTOKENS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'NMTOKENS' ;
    public final AntlrDatatypeRuleToken ruleNMTOKENS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1821:28: (kw= 'NMTOKENS' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1823:2: kw= 'NMTOKENS'
            {
            kw=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruleNMTOKENS4289); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNMTOKENSAccess().getNMTOKENSKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNMTOKENS"


    // $ANTLR start "entryRuleNonNegativeInteger"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1836:1: entryRuleNonNegativeInteger returns [String current=null] : iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF ;
    public final String entryRuleNonNegativeInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNonNegativeInteger = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1837:2: (iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1838:2: iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF
            {
             newCompositeNode(grammarAccess.getNonNegativeIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNonNegativeInteger_in_entryRuleNonNegativeInteger4329);
            iv_ruleNonNegativeInteger=ruleNonNegativeInteger();

            state._fsp--;

             current =iv_ruleNonNegativeInteger.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNonNegativeInteger4340); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonNegativeInteger"


    // $ANTLR start "ruleNonNegativeInteger"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1845:1: ruleNonNegativeInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'NonNegativeInteger' ;
    public final AntlrDatatypeRuleToken ruleNonNegativeInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1848:28: (kw= 'NonNegativeInteger' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1850:2: kw= 'NonNegativeInteger'
            {
            kw=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleNonNegativeInteger4377); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNonNegativeIntegerAccess().getNonNegativeIntegerKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNonNegativeInteger"


    // $ANTLR start "entryRuleNonPositiveInteger"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1863:1: entryRuleNonPositiveInteger returns [String current=null] : iv_ruleNonPositiveInteger= ruleNonPositiveInteger EOF ;
    public final String entryRuleNonPositiveInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNonPositiveInteger = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1864:2: (iv_ruleNonPositiveInteger= ruleNonPositiveInteger EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1865:2: iv_ruleNonPositiveInteger= ruleNonPositiveInteger EOF
            {
             newCompositeNode(grammarAccess.getNonPositiveIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNonPositiveInteger_in_entryRuleNonPositiveInteger4417);
            iv_ruleNonPositiveInteger=ruleNonPositiveInteger();

            state._fsp--;

             current =iv_ruleNonPositiveInteger.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNonPositiveInteger4428); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonPositiveInteger"


    // $ANTLR start "ruleNonPositiveInteger"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1872:1: ruleNonPositiveInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'NonPositiveInteger' ;
    public final AntlrDatatypeRuleToken ruleNonPositiveInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1875:28: (kw= 'NonPositiveInteger' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1877:2: kw= 'NonPositiveInteger'
            {
            kw=(Token)match(input,86,FollowSets000.FOLLOW_86_in_ruleNonPositiveInteger4465); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNonPositiveIntegerAccess().getNonPositiveIntegerKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNonPositiveInteger"


    // $ANTLR start "entryRulePositiveInteger"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1890:1: entryRulePositiveInteger returns [String current=null] : iv_rulePositiveInteger= rulePositiveInteger EOF ;
    public final String entryRulePositiveInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePositiveInteger = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1891:2: (iv_rulePositiveInteger= rulePositiveInteger EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1892:2: iv_rulePositiveInteger= rulePositiveInteger EOF
            {
             newCompositeNode(grammarAccess.getPositiveIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePositiveInteger_in_entryRulePositiveInteger4505);
            iv_rulePositiveInteger=rulePositiveInteger();

            state._fsp--;

             current =iv_rulePositiveInteger.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePositiveInteger4516); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePositiveInteger"


    // $ANTLR start "rulePositiveInteger"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1899:1: rulePositiveInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'PositiveInteger' ;
    public final AntlrDatatypeRuleToken rulePositiveInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1902:28: (kw= 'PositiveInteger' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1904:2: kw= 'PositiveInteger'
            {
            kw=(Token)match(input,87,FollowSets000.FOLLOW_87_in_rulePositiveInteger4553); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPositiveIntegerAccess().getPositiveIntegerKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePositiveInteger"


    // $ANTLR start "entryRuleQName"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1917:1: entryRuleQName returns [String current=null] : iv_ruleQName= ruleQName EOF ;
    public final String entryRuleQName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQName = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1918:2: (iv_ruleQName= ruleQName EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1919:2: iv_ruleQName= ruleQName EOF
            {
             newCompositeNode(grammarAccess.getQNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_entryRuleQName4593);
            iv_ruleQName=ruleQName();

            state._fsp--;

             current =iv_ruleQName.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQName4604); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQName"


    // $ANTLR start "ruleQName"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1926:1: ruleQName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'QName' ;
    public final AntlrDatatypeRuleToken ruleQName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1929:28: (kw= 'QName' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1931:2: kw= 'QName'
            {
            kw=(Token)match(input,88,FollowSets000.FOLLOW_88_in_ruleQName4641); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getQNameAccess().getQNameKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQName"


    // $ANTLR start "entryRuleShort"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1944:1: entryRuleShort returns [String current=null] : iv_ruleShort= ruleShort EOF ;
    public final String entryRuleShort() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleShort = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1945:2: (iv_ruleShort= ruleShort EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1946:2: iv_ruleShort= ruleShort EOF
            {
             newCompositeNode(grammarAccess.getShortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleShort_in_entryRuleShort4681);
            iv_ruleShort=ruleShort();

            state._fsp--;

             current =iv_ruleShort.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleShort4692); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShort"


    // $ANTLR start "ruleShort"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1953:1: ruleShort returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Short' ;
    public final AntlrDatatypeRuleToken ruleShort() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1956:28: (kw= 'Short' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1958:2: kw= 'Short'
            {
            kw=(Token)match(input,89,FollowSets000.FOLLOW_89_in_ruleShort4729); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getShortAccess().getShortKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShort"


    // $ANTLR start "entryRuleString0"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1971:1: entryRuleString0 returns [String current=null] : iv_ruleString0= ruleString0 EOF ;
    public final String entryRuleString0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleString0 = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1972:2: (iv_ruleString0= ruleString0 EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1973:2: iv_ruleString0= ruleString0 EOF
            {
             newCompositeNode(grammarAccess.getString0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_entryRuleString04769);
            iv_ruleString0=ruleString0();

            state._fsp--;

             current =iv_ruleString0.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleString04780); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1980:1: ruleString0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'String' ;
    public final AntlrDatatypeRuleToken ruleString0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1983:28: (kw= 'String' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1985:2: kw= 'String'
            {
            kw=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleString04817); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getString0Access().getStringKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleTime"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1998:1: entryRuleTime returns [String current=null] : iv_ruleTime= ruleTime EOF ;
    public final String entryRuleTime() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTime = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:1999:2: (iv_ruleTime= ruleTime EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2000:2: iv_ruleTime= ruleTime EOF
            {
             newCompositeNode(grammarAccess.getTimeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTime_in_entryRuleTime4857);
            iv_ruleTime=ruleTime();

            state._fsp--;

             current =iv_ruleTime.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTime4868); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2007:1: ruleTime returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Time' ;
    public final AntlrDatatypeRuleToken ruleTime() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2010:28: (kw= 'Time' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2012:2: kw= 'Time'
            {
            kw=(Token)match(input,91,FollowSets000.FOLLOW_91_in_ruleTime4905); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTimeAccess().getTimeKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTime"


    // $ANTLR start "entryRuleToken"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2025:1: entryRuleToken returns [String current=null] : iv_ruleToken= ruleToken EOF ;
    public final String entryRuleToken() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleToken = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2026:2: (iv_ruleToken= ruleToken EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2027:2: iv_ruleToken= ruleToken EOF
            {
             newCompositeNode(grammarAccess.getTokenRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleToken_in_entryRuleToken4945);
            iv_ruleToken=ruleToken();

            state._fsp--;

             current =iv_ruleToken.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleToken4956); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleToken"


    // $ANTLR start "ruleToken"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2034:1: ruleToken returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Token' ;
    public final AntlrDatatypeRuleToken ruleToken() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2037:28: (kw= 'Token' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2039:2: kw= 'Token'
            {
            kw=(Token)match(input,92,FollowSets000.FOLLOW_92_in_ruleToken4993); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTokenAccess().getTokenKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleToken"


    // $ANTLR start "entryRuleUnsignedByte"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2052:1: entryRuleUnsignedByte returns [String current=null] : iv_ruleUnsignedByte= ruleUnsignedByte EOF ;
    public final String entryRuleUnsignedByte() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnsignedByte = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2053:2: (iv_ruleUnsignedByte= ruleUnsignedByte EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2054:2: iv_ruleUnsignedByte= ruleUnsignedByte EOF
            {
             newCompositeNode(grammarAccess.getUnsignedByteRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnsignedByte_in_entryRuleUnsignedByte5033);
            iv_ruleUnsignedByte=ruleUnsignedByte();

            state._fsp--;

             current =iv_ruleUnsignedByte.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnsignedByte5044); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnsignedByte"


    // $ANTLR start "ruleUnsignedByte"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2061:1: ruleUnsignedByte returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'UnsignedByte' ;
    public final AntlrDatatypeRuleToken ruleUnsignedByte() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2064:28: (kw= 'UnsignedByte' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2066:2: kw= 'UnsignedByte'
            {
            kw=(Token)match(input,93,FollowSets000.FOLLOW_93_in_ruleUnsignedByte5081); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getUnsignedByteAccess().getUnsignedByteKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnsignedByte"


    // $ANTLR start "entryRuleUnsignedInt"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2079:1: entryRuleUnsignedInt returns [String current=null] : iv_ruleUnsignedInt= ruleUnsignedInt EOF ;
    public final String entryRuleUnsignedInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnsignedInt = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2080:2: (iv_ruleUnsignedInt= ruleUnsignedInt EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2081:2: iv_ruleUnsignedInt= ruleUnsignedInt EOF
            {
             newCompositeNode(grammarAccess.getUnsignedIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnsignedInt_in_entryRuleUnsignedInt5121);
            iv_ruleUnsignedInt=ruleUnsignedInt();

            state._fsp--;

             current =iv_ruleUnsignedInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnsignedInt5132); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnsignedInt"


    // $ANTLR start "ruleUnsignedInt"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2088:1: ruleUnsignedInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'UnsignedInt' ;
    public final AntlrDatatypeRuleToken ruleUnsignedInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2091:28: (kw= 'UnsignedInt' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2093:2: kw= 'UnsignedInt'
            {
            kw=(Token)match(input,94,FollowSets000.FOLLOW_94_in_ruleUnsignedInt5169); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getUnsignedIntAccess().getUnsignedIntKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnsignedInt"


    // $ANTLR start "entryRuleUnsignedLong"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2106:1: entryRuleUnsignedLong returns [String current=null] : iv_ruleUnsignedLong= ruleUnsignedLong EOF ;
    public final String entryRuleUnsignedLong() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnsignedLong = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2107:2: (iv_ruleUnsignedLong= ruleUnsignedLong EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2108:2: iv_ruleUnsignedLong= ruleUnsignedLong EOF
            {
             newCompositeNode(grammarAccess.getUnsignedLongRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnsignedLong_in_entryRuleUnsignedLong5209);
            iv_ruleUnsignedLong=ruleUnsignedLong();

            state._fsp--;

             current =iv_ruleUnsignedLong.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnsignedLong5220); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnsignedLong"


    // $ANTLR start "ruleUnsignedLong"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2115:1: ruleUnsignedLong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'UnsignedLong' ;
    public final AntlrDatatypeRuleToken ruleUnsignedLong() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2118:28: (kw= 'UnsignedLong' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2120:2: kw= 'UnsignedLong'
            {
            kw=(Token)match(input,95,FollowSets000.FOLLOW_95_in_ruleUnsignedLong5257); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getUnsignedLongAccess().getUnsignedLongKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnsignedLong"


    // $ANTLR start "entryRuleUnsignedShort"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2133:1: entryRuleUnsignedShort returns [String current=null] : iv_ruleUnsignedShort= ruleUnsignedShort EOF ;
    public final String entryRuleUnsignedShort() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnsignedShort = null;


        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2134:2: (iv_ruleUnsignedShort= ruleUnsignedShort EOF )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2135:2: iv_ruleUnsignedShort= ruleUnsignedShort EOF
            {
             newCompositeNode(grammarAccess.getUnsignedShortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnsignedShort_in_entryRuleUnsignedShort5297);
            iv_ruleUnsignedShort=ruleUnsignedShort();

            state._fsp--;

             current =iv_ruleUnsignedShort.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnsignedShort5308); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnsignedShort"


    // $ANTLR start "ruleUnsignedShort"
    // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2142:1: ruleUnsignedShort returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'UnsignedShort' ;
    public final AntlrDatatypeRuleToken ruleUnsignedShort() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2145:28: (kw= 'UnsignedShort' )
            // ../org.xtext.example.mydsl.datatypes/src-gen/org/xtext/example/mydsl/datatypes/parser/antlr/internal/InternalMyDsl.g:2147:2: kw= 'UnsignedShort'
            {
            kw=(Token)match(input,96,FollowSets000.FOLLOW_96_in_ruleUnsignedShort5345); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getUnsignedShortAccess().getUnsignedShortKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnsignedShort"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleDataTypeTest_in_entryRuleDataTypeTest75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeTest85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleDataTypeTest131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_ruleID0_in_ruleDataTypeTest152 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDataTypeTest164 = new BitSet(new long[]{0x007FFFFFFFFFE000L});
        public static final BitSet FOLLOW_13_in_ruleDataTypeTest177 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_ruleAnySimpleType_in_ruleDataTypeTest198 = new BitSet(new long[]{0x007FFFFFFFFFC000L});
        public static final BitSet FOLLOW_14_in_ruleDataTypeTest213 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_ruleAnyURI_in_ruleDataTypeTest234 = new BitSet(new long[]{0x007FFFFFFFFF8000L});
        public static final BitSet FOLLOW_15_in_ruleDataTypeTest249 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_ruleBase64Binary_in_ruleDataTypeTest270 = new BitSet(new long[]{0x007FFFFFFFFF0000L});
        public static final BitSet FOLLOW_16_in_ruleDataTypeTest285 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_ruleBoolean_in_ruleDataTypeTest306 = new BitSet(new long[]{0x007FFFFFFFFE0000L});
        public static final BitSet FOLLOW_17_in_ruleDataTypeTest321 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_ruleByte_in_ruleDataTypeTest342 = new BitSet(new long[]{0x007FFFFFFFFC0000L});
        public static final BitSet FOLLOW_18_in_ruleDataTypeTest357 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_ruleDate_in_ruleDataTypeTest378 = new BitSet(new long[]{0x007FFFFFFFF80000L});
        public static final BitSet FOLLOW_19_in_ruleDataTypeTest393 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_ruleDateTime_in_ruleDataTypeTest414 = new BitSet(new long[]{0x007FFFFFFFF00000L});
        public static final BitSet FOLLOW_20_in_ruleDataTypeTest429 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_ruleDecimal_in_ruleDataTypeTest450 = new BitSet(new long[]{0x007FFFFFFFE00000L});
        public static final BitSet FOLLOW_21_in_ruleDataTypeTest465 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_ruleDouble_in_ruleDataTypeTest486 = new BitSet(new long[]{0x007FFFFFFFC00000L});
        public static final BitSet FOLLOW_22_in_ruleDataTypeTest501 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleDuration_in_ruleDataTypeTest522 = new BitSet(new long[]{0x007FFFFFFF800000L});
        public static final BitSet FOLLOW_23_in_ruleDataTypeTest537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_ruleENTITIES_in_ruleDataTypeTest558 = new BitSet(new long[]{0x007FFFFFFF000000L});
        public static final BitSet FOLLOW_24_in_ruleDataTypeTest573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleENTITY_in_ruleDataTypeTest594 = new BitSet(new long[]{0x007FFFFFFE000000L});
        public static final BitSet FOLLOW_25_in_ruleDataTypeTest609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_ruleFloat_in_ruleDataTypeTest630 = new BitSet(new long[]{0x007FFFFFFC000000L});
        public static final BitSet FOLLOW_26_in_ruleDataTypeTest645 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_ruleGDay_in_ruleDataTypeTest666 = new BitSet(new long[]{0x007FFFFFF8000000L});
        public static final BitSet FOLLOW_27_in_ruleDataTypeTest681 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_ruleGMonth_in_ruleDataTypeTest702 = new BitSet(new long[]{0x007FFFFFF0000000L});
        public static final BitSet FOLLOW_28_in_ruleDataTypeTest717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
        public static final BitSet FOLLOW_ruleGMonthDay_in_ruleDataTypeTest738 = new BitSet(new long[]{0x007FFFFFE0000000L});
        public static final BitSet FOLLOW_29_in_ruleDataTypeTest753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_ruleGYear_in_ruleDataTypeTest774 = new BitSet(new long[]{0x007FFFFFC0000000L});
        public static final BitSet FOLLOW_30_in_ruleDataTypeTest789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
        public static final BitSet FOLLOW_ruleGYearMonth_in_ruleDataTypeTest810 = new BitSet(new long[]{0x007FFFFF80000000L});
        public static final BitSet FOLLOW_31_in_ruleDataTypeTest825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
        public static final BitSet FOLLOW_ruleHexBinary_in_ruleDataTypeTest846 = new BitSet(new long[]{0x007FFFFF00000000L});
        public static final BitSet FOLLOW_32_in_ruleDataTypeTest861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_ruleIDREF_in_ruleDataTypeTest882 = new BitSet(new long[]{0x007FFFFE00000000L});
        public static final BitSet FOLLOW_33_in_ruleDataTypeTest897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
        public static final BitSet FOLLOW_ruleIDREFS_in_ruleDataTypeTest918 = new BitSet(new long[]{0x007FFFFC00000000L});
        public static final BitSet FOLLOW_34_in_ruleDataTypeTest933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleInt0_in_ruleDataTypeTest954 = new BitSet(new long[]{0x007FFFF800000000L});
        public static final BitSet FOLLOW_35_in_ruleDataTypeTest969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
        public static final BitSet FOLLOW_ruleInteger_in_ruleDataTypeTest990 = new BitSet(new long[]{0x007FFFF000000000L});
        public static final BitSet FOLLOW_36_in_ruleDataTypeTest1005 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
        public static final BitSet FOLLOW_ruleLanguage_in_ruleDataTypeTest1026 = new BitSet(new long[]{0x007FFFE000000000L});
        public static final BitSet FOLLOW_37_in_ruleDataTypeTest1041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
        public static final BitSet FOLLOW_ruleLong_in_ruleDataTypeTest1062 = new BitSet(new long[]{0x007FFFC000000000L});
        public static final BitSet FOLLOW_38_in_ruleDataTypeTest1077 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
        public static final BitSet FOLLOW_ruleName_in_ruleDataTypeTest1098 = new BitSet(new long[]{0x007FFF8000000000L});
        public static final BitSet FOLLOW_39_in_ruleDataTypeTest1113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
        public static final BitSet FOLLOW_ruleNCName_in_ruleDataTypeTest1134 = new BitSet(new long[]{0x007FFF0000000000L});
        public static final BitSet FOLLOW_40_in_ruleDataTypeTest1149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
        public static final BitSet FOLLOW_ruleNMTOKEN_in_ruleDataTypeTest1170 = new BitSet(new long[]{0x007FFE0000000000L});
        public static final BitSet FOLLOW_41_in_ruleDataTypeTest1185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
        public static final BitSet FOLLOW_ruleNMTOKENS_in_ruleDataTypeTest1206 = new BitSet(new long[]{0x007FFC0000000000L});
        public static final BitSet FOLLOW_42_in_ruleDataTypeTest1221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
        public static final BitSet FOLLOW_ruleNonNegativeInteger_in_ruleDataTypeTest1242 = new BitSet(new long[]{0x007FF80000000000L});
        public static final BitSet FOLLOW_43_in_ruleDataTypeTest1257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
        public static final BitSet FOLLOW_ruleNonPositiveInteger_in_ruleDataTypeTest1278 = new BitSet(new long[]{0x007FF00000000000L});
        public static final BitSet FOLLOW_44_in_ruleDataTypeTest1293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
        public static final BitSet FOLLOW_rulePositiveInteger_in_ruleDataTypeTest1314 = new BitSet(new long[]{0x007FE00000000000L});
        public static final BitSet FOLLOW_45_in_ruleDataTypeTest1329 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
        public static final BitSet FOLLOW_ruleQName_in_ruleDataTypeTest1350 = new BitSet(new long[]{0x007FC00000000000L});
        public static final BitSet FOLLOW_46_in_ruleDataTypeTest1365 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
        public static final BitSet FOLLOW_ruleShort_in_ruleDataTypeTest1386 = new BitSet(new long[]{0x007F800000000000L});
        public static final BitSet FOLLOW_47_in_ruleDataTypeTest1401 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
        public static final BitSet FOLLOW_ruleString0_in_ruleDataTypeTest1422 = new BitSet(new long[]{0x007F000000000000L});
        public static final BitSet FOLLOW_48_in_ruleDataTypeTest1437 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
        public static final BitSet FOLLOW_ruleTime_in_ruleDataTypeTest1458 = new BitSet(new long[]{0x007E000000000000L});
        public static final BitSet FOLLOW_49_in_ruleDataTypeTest1473 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
        public static final BitSet FOLLOW_ruleToken_in_ruleDataTypeTest1494 = new BitSet(new long[]{0x007C000000000000L});
        public static final BitSet FOLLOW_50_in_ruleDataTypeTest1509 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
        public static final BitSet FOLLOW_ruleUnsignedByte_in_ruleDataTypeTest1530 = new BitSet(new long[]{0x0078000000000000L});
        public static final BitSet FOLLOW_51_in_ruleDataTypeTest1545 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
        public static final BitSet FOLLOW_ruleUnsignedInt_in_ruleDataTypeTest1566 = new BitSet(new long[]{0x0070000000000000L});
        public static final BitSet FOLLOW_52_in_ruleDataTypeTest1581 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
        public static final BitSet FOLLOW_ruleUnsignedLong_in_ruleDataTypeTest1602 = new BitSet(new long[]{0x0060000000000000L});
        public static final BitSet FOLLOW_53_in_ruleDataTypeTest1617 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
        public static final BitSet FOLLOW_ruleUnsignedShort_in_ruleDataTypeTest1638 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleDataTypeTest1652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnySimpleType_in_entryRuleAnySimpleType1689 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnySimpleType1700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleAnySimpleType1737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyURI_in_entryRuleAnyURI1777 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnyURI1788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleAnyURI1825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBase64Binary_in_entryRuleBase64Binary1865 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBase64Binary1876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleBase64Binary1913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean1953 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolean1964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleBoolean2001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleByte_in_entryRuleByte2041 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleByte2052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleByte2089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_entryRuleDate2129 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDate2140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleDate2177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDateTime_in_entryRuleDateTime2217 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDateTime2228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleDateTime2265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDecimal_in_entryRuleDecimal2305 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDecimal2316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleDecimal2353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDouble_in_entryRuleDouble2393 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDouble2404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleDouble2441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDuration_in_entryRuleDuration2481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDuration2492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleDuration2529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleENTITIES_in_entryRuleENTITIES2569 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleENTITIES2580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleENTITIES2617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleENTITY_in_entryRuleENTITY2657 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleENTITY2668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleENTITY2705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloat_in_entryRuleFloat2745 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloat2756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleFloat2793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGDay_in_entryRuleGDay2833 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGDay2844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleGDay2881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGMonth_in_entryRuleGMonth2921 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGMonth2932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleGMonth2969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGMonthDay_in_entryRuleGMonthDay3009 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGMonthDay3020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleGMonthDay3057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGYear_in_entryRuleGYear3097 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGYear3108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleGYear3145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGYearMonth_in_entryRuleGYearMonth3185 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGYearMonth3196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleGYearMonth3233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHexBinary_in_entryRuleHexBinary3273 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHexBinary3284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleHexBinary3321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID0_in_entryRuleID03361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleID03372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_ruleID03409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIDREF_in_entryRuleIDREF3449 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIDREF3460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_ruleIDREF3497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIDREFS_in_entryRuleIDREFS3537 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIDREFS3548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleIDREFS3585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInt0_in_entryRuleInt03625 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInt03636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_ruleInt03673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger3713 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteger3724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_ruleInteger3761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLanguage_in_entryRuleLanguage3801 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLanguage3812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_79_in_ruleLanguage3849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLong_in_entryRuleLong3889 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLong3900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_80_in_ruleLong3937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleName_in_entryRuleName3977 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleName3988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_ruleName4025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNCName_in_entryRuleNCName4065 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNCName4076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_82_in_ruleNCName4113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNMTOKEN_in_entryRuleNMTOKEN4153 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNMTOKEN4164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_83_in_ruleNMTOKEN4201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNMTOKENS_in_entryRuleNMTOKENS4241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNMTOKENS4252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_84_in_ruleNMTOKENS4289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNonNegativeInteger_in_entryRuleNonNegativeInteger4329 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNonNegativeInteger4340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_85_in_ruleNonNegativeInteger4377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNonPositiveInteger_in_entryRuleNonPositiveInteger4417 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNonPositiveInteger4428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_86_in_ruleNonPositiveInteger4465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePositiveInteger_in_entryRulePositiveInteger4505 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePositiveInteger4516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_87_in_rulePositiveInteger4553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQName_in_entryRuleQName4593 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQName4604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_88_in_ruleQName4641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShort_in_entryRuleShort4681 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleShort4692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_89_in_ruleShort4729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString04769 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString04780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_90_in_ruleString04817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTime_in_entryRuleTime4857 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTime4868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_91_in_ruleTime4905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleToken_in_entryRuleToken4945 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleToken4956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_92_in_ruleToken4993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnsignedByte_in_entryRuleUnsignedByte5033 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnsignedByte5044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_93_in_ruleUnsignedByte5081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnsignedInt_in_entryRuleUnsignedInt5121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnsignedInt5132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_94_in_ruleUnsignedInt5169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnsignedLong_in_entryRuleUnsignedLong5209 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnsignedLong5220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_95_in_ruleUnsignedLong5257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnsignedShort_in_entryRuleUnsignedShort5297 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnsignedShort5308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_96_in_ruleUnsignedShort5345 = new BitSet(new long[]{0x0000000000000002L});
    }


}