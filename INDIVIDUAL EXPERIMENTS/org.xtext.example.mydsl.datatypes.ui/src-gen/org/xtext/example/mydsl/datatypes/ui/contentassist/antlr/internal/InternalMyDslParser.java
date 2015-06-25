package org.xtext.example.mydsl.datatypes.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.datatypes.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AnySimpleType'", "'AnyURI'", "'Base64Binary'", "'Boolean'", "'Byte'", "'Date'", "'DateTime'", "'Decimal'", "'Double'", "'Duration'", "'ENTITIES'", "'ENTITY'", "'Float'", "'GDay'", "'GMonth'", "'GMonthDay'", "'GYear'", "'GYearMonth'", "'HexBinary'", "'ID'", "'IDREF'", "'IDREFS'", "'Int'", "'Integer'", "'Language'", "'Long'", "'Name'", "'NCName'", "'NMTOKEN'", "'NMTOKENS'", "'NonNegativeInteger'", "'NonPositiveInteger'", "'PositiveInteger'", "'QName'", "'Short'", "'String'", "'Time'", "'Token'", "'UnsignedByte'", "'UnsignedInt'", "'UnsignedLong'", "'UnsignedShort'", "'DataTypeTest'", "'{'", "'}'", "'aAnySimpleType'", "'aAnyURI'", "'aBase64Binary'", "'aBoolean'", "'aByte'", "'aDate'", "'aDateTime'", "'aDecimal'", "'aDouble'", "'aDuration'", "'aEntities'", "'aEntity'", "'aFloat'", "'aGDay'", "'aGMonth'", "'aGMonthDay'", "'aGYear'", "'aGYearMonth'", "'aHexBinary'", "'aIDREF'", "'aIDREFS'", "'aInt'", "'aInteger'", "'aLanguage'", "'aLong'", "'aName'", "'aNCName'", "'aNMTOKEN'", "'aNMTOKENS'", "'aNonNegativeInteger'", "'aNonPositiveInteger'", "'aPositiveInteger'", "'aQName'", "'aShort'", "'aString'", "'aTime'", "'aToken'", "'aUnsignedByte'", "'aUnsignedInt'", "'aUnsignedLong'", "'aUnsignedShort'"
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
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleDataTypeTest"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleDataTypeTest : ruleDataTypeTest EOF ;
    public final void entryRuleDataTypeTest() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleDataTypeTest EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleDataTypeTest EOF
            {
             before(grammarAccess.getDataTypeTestRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataTypeTest_in_entryRuleDataTypeTest61);
            ruleDataTypeTest();

            state._fsp--;

             after(grammarAccess.getDataTypeTestRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDataTypeTest68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataTypeTest"


    // $ANTLR start "ruleDataTypeTest"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleDataTypeTest : ( ( rule__DataTypeTest__Group__0 ) ) ;
    public final void ruleDataTypeTest() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__DataTypeTest__Group__0 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__DataTypeTest__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__DataTypeTest__Group__0 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__DataTypeTest__Group__0 )
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__DataTypeTest__Group__0 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__DataTypeTest__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__0_in_ruleDataTypeTest94);
            rule__DataTypeTest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataTypeTest"


    // $ANTLR start "entryRuleAnySimpleType"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleAnySimpleType : ruleAnySimpleType EOF ;
    public final void entryRuleAnySimpleType() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleAnySimpleType EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleAnySimpleType EOF
            {
             before(grammarAccess.getAnySimpleTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnySimpleType_in_entryRuleAnySimpleType121);
            ruleAnySimpleType();

            state._fsp--;

             after(grammarAccess.getAnySimpleTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnySimpleType128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnySimpleType"


    // $ANTLR start "ruleAnySimpleType"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleAnySimpleType : ( 'AnySimpleType' ) ;
    public final void ruleAnySimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( 'AnySimpleType' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( 'AnySimpleType' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( 'AnySimpleType' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: 'AnySimpleType'
            {
             before(grammarAccess.getAnySimpleTypeAccess().getAnySimpleTypeKeyword()); 
            match(input,11,FollowSets000.FOLLOW_11_in_ruleAnySimpleType155); 
             after(grammarAccess.getAnySimpleTypeAccess().getAnySimpleTypeKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnySimpleType"


    // $ANTLR start "entryRuleAnyURI"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: entryRuleAnyURI : ruleAnyURI EOF ;
    public final void entryRuleAnyURI() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:119:1: ( ruleAnyURI EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:120:1: ruleAnyURI EOF
            {
             before(grammarAccess.getAnyURIRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyURI_in_entryRuleAnyURI183);
            ruleAnyURI();

            state._fsp--;

             after(grammarAccess.getAnyURIRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnyURI190); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnyURI"


    // $ANTLR start "ruleAnyURI"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:127:1: ruleAnyURI : ( 'AnyURI' ) ;
    public final void ruleAnyURI() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:131:2: ( ( 'AnyURI' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( 'AnyURI' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( 'AnyURI' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:133:1: 'AnyURI'
            {
             before(grammarAccess.getAnyURIAccess().getAnyURIKeyword()); 
            match(input,12,FollowSets000.FOLLOW_12_in_ruleAnyURI217); 
             after(grammarAccess.getAnyURIAccess().getAnyURIKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnyURI"


    // $ANTLR start "entryRuleBase64Binary"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:148:1: entryRuleBase64Binary : ruleBase64Binary EOF ;
    public final void entryRuleBase64Binary() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:149:1: ( ruleBase64Binary EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:150:1: ruleBase64Binary EOF
            {
             before(grammarAccess.getBase64BinaryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBase64Binary_in_entryRuleBase64Binary245);
            ruleBase64Binary();

            state._fsp--;

             after(grammarAccess.getBase64BinaryRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBase64Binary252); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBase64Binary"


    // $ANTLR start "ruleBase64Binary"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:157:1: ruleBase64Binary : ( 'Base64Binary' ) ;
    public final void ruleBase64Binary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:161:2: ( ( 'Base64Binary' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:162:1: ( 'Base64Binary' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:162:1: ( 'Base64Binary' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:163:1: 'Base64Binary'
            {
             before(grammarAccess.getBase64BinaryAccess().getBase64BinaryKeyword()); 
            match(input,13,FollowSets000.FOLLOW_13_in_ruleBase64Binary279); 
             after(grammarAccess.getBase64BinaryAccess().getBase64BinaryKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBase64Binary"


    // $ANTLR start "entryRuleBoolean"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:178:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:179:1: ( ruleBoolean EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:180:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_entryRuleBoolean307);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolean314); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ruleBoolean : ( 'Boolean' ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:191:2: ( ( 'Boolean' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:192:1: ( 'Boolean' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:192:1: ( 'Boolean' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:193:1: 'Boolean'
            {
             before(grammarAccess.getBooleanAccess().getBooleanKeyword()); 
            match(input,14,FollowSets000.FOLLOW_14_in_ruleBoolean341); 
             after(grammarAccess.getBooleanAccess().getBooleanKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleByte"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:208:1: entryRuleByte : ruleByte EOF ;
    public final void entryRuleByte() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: ( ruleByte EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:210:1: ruleByte EOF
            {
             before(grammarAccess.getByteRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleByte_in_entryRuleByte369);
            ruleByte();

            state._fsp--;

             after(grammarAccess.getByteRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleByte376); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleByte"


    // $ANTLR start "ruleByte"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:217:1: ruleByte : ( 'Byte' ) ;
    public final void ruleByte() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:221:2: ( ( 'Byte' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:222:1: ( 'Byte' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:222:1: ( 'Byte' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:223:1: 'Byte'
            {
             before(grammarAccess.getByteAccess().getByteKeyword()); 
            match(input,15,FollowSets000.FOLLOW_15_in_ruleByte403); 
             after(grammarAccess.getByteAccess().getByteKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleByte"


    // $ANTLR start "entryRuleDate"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:238:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:239:1: ( ruleDate EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:240:1: ruleDate EOF
            {
             before(grammarAccess.getDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_entryRuleDate431);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDateRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDate438); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:247:1: ruleDate : ( 'Date' ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:251:2: ( ( 'Date' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:252:1: ( 'Date' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:252:1: ( 'Date' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:253:1: 'Date'
            {
             before(grammarAccess.getDateAccess().getDateKeyword()); 
            match(input,16,FollowSets000.FOLLOW_16_in_ruleDate465); 
             after(grammarAccess.getDateAccess().getDateKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleDateTime"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:268:1: entryRuleDateTime : ruleDateTime EOF ;
    public final void entryRuleDateTime() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:269:1: ( ruleDateTime EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ruleDateTime EOF
            {
             before(grammarAccess.getDateTimeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDateTime_in_entryRuleDateTime493);
            ruleDateTime();

            state._fsp--;

             after(grammarAccess.getDateTimeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDateTime500); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDateTime"


    // $ANTLR start "ruleDateTime"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:277:1: ruleDateTime : ( 'DateTime' ) ;
    public final void ruleDateTime() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:281:2: ( ( 'DateTime' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:282:1: ( 'DateTime' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:282:1: ( 'DateTime' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:283:1: 'DateTime'
            {
             before(grammarAccess.getDateTimeAccess().getDateTimeKeyword()); 
            match(input,17,FollowSets000.FOLLOW_17_in_ruleDateTime527); 
             after(grammarAccess.getDateTimeAccess().getDateTimeKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDateTime"


    // $ANTLR start "entryRuleDecimal"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: entryRuleDecimal : ruleDecimal EOF ;
    public final void entryRuleDecimal() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:299:1: ( ruleDecimal EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:300:1: ruleDecimal EOF
            {
             before(grammarAccess.getDecimalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDecimal_in_entryRuleDecimal555);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getDecimalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDecimal562); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDecimal"


    // $ANTLR start "ruleDecimal"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:307:1: ruleDecimal : ( 'Decimal' ) ;
    public final void ruleDecimal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:311:2: ( ( 'Decimal' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:312:1: ( 'Decimal' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:312:1: ( 'Decimal' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:313:1: 'Decimal'
            {
             before(grammarAccess.getDecimalAccess().getDecimalKeyword()); 
            match(input,18,FollowSets000.FOLLOW_18_in_ruleDecimal589); 
             after(grammarAccess.getDecimalAccess().getDecimalKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecimal"


    // $ANTLR start "entryRuleDouble"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:328:1: entryRuleDouble : ruleDouble EOF ;
    public final void entryRuleDouble() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:329:1: ( ruleDouble EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:330:1: ruleDouble EOF
            {
             before(grammarAccess.getDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDouble_in_entryRuleDouble617);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getDoubleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDouble624); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:337:1: ruleDouble : ( 'Double' ) ;
    public final void ruleDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:341:2: ( ( 'Double' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: ( 'Double' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: ( 'Double' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:343:1: 'Double'
            {
             before(grammarAccess.getDoubleAccess().getDoubleKeyword()); 
            match(input,19,FollowSets000.FOLLOW_19_in_ruleDouble651); 
             after(grammarAccess.getDoubleAccess().getDoubleKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRuleDuration"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:358:1: entryRuleDuration : ruleDuration EOF ;
    public final void entryRuleDuration() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:359:1: ( ruleDuration EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:360:1: ruleDuration EOF
            {
             before(grammarAccess.getDurationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDuration_in_entryRuleDuration679);
            ruleDuration();

            state._fsp--;

             after(grammarAccess.getDurationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDuration686); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDuration"


    // $ANTLR start "ruleDuration"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:367:1: ruleDuration : ( 'Duration' ) ;
    public final void ruleDuration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:371:2: ( ( 'Duration' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:372:1: ( 'Duration' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:372:1: ( 'Duration' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:373:1: 'Duration'
            {
             before(grammarAccess.getDurationAccess().getDurationKeyword()); 
            match(input,20,FollowSets000.FOLLOW_20_in_ruleDuration713); 
             after(grammarAccess.getDurationAccess().getDurationKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDuration"


    // $ANTLR start "entryRuleENTITIES"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:388:1: entryRuleENTITIES : ruleENTITIES EOF ;
    public final void entryRuleENTITIES() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:389:1: ( ruleENTITIES EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:390:1: ruleENTITIES EOF
            {
             before(grammarAccess.getENTITIESRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleENTITIES_in_entryRuleENTITIES741);
            ruleENTITIES();

            state._fsp--;

             after(grammarAccess.getENTITIESRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleENTITIES748); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleENTITIES"


    // $ANTLR start "ruleENTITIES"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:397:1: ruleENTITIES : ( 'ENTITIES' ) ;
    public final void ruleENTITIES() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:401:2: ( ( 'ENTITIES' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:402:1: ( 'ENTITIES' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:402:1: ( 'ENTITIES' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:403:1: 'ENTITIES'
            {
             before(grammarAccess.getENTITIESAccess().getENTITIESKeyword()); 
            match(input,21,FollowSets000.FOLLOW_21_in_ruleENTITIES775); 
             after(grammarAccess.getENTITIESAccess().getENTITIESKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleENTITIES"


    // $ANTLR start "entryRuleENTITY"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:418:1: entryRuleENTITY : ruleENTITY EOF ;
    public final void entryRuleENTITY() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:419:1: ( ruleENTITY EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:420:1: ruleENTITY EOF
            {
             before(grammarAccess.getENTITYRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleENTITY_in_entryRuleENTITY803);
            ruleENTITY();

            state._fsp--;

             after(grammarAccess.getENTITYRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleENTITY810); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleENTITY"


    // $ANTLR start "ruleENTITY"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:427:1: ruleENTITY : ( 'ENTITY' ) ;
    public final void ruleENTITY() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:431:2: ( ( 'ENTITY' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:432:1: ( 'ENTITY' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:432:1: ( 'ENTITY' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:433:1: 'ENTITY'
            {
             before(grammarAccess.getENTITYAccess().getENTITYKeyword()); 
            match(input,22,FollowSets000.FOLLOW_22_in_ruleENTITY837); 
             after(grammarAccess.getENTITYAccess().getENTITYKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleENTITY"


    // $ANTLR start "entryRuleFloat"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:448:1: entryRuleFloat : ruleFloat EOF ;
    public final void entryRuleFloat() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:449:1: ( ruleFloat EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:450:1: ruleFloat EOF
            {
             before(grammarAccess.getFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFloat_in_entryRuleFloat865);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getFloatRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloat872); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:457:1: ruleFloat : ( 'Float' ) ;
    public final void ruleFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:461:2: ( ( 'Float' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:462:1: ( 'Float' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:462:1: ( 'Float' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:463:1: 'Float'
            {
             before(grammarAccess.getFloatAccess().getFloatKeyword()); 
            match(input,23,FollowSets000.FOLLOW_23_in_ruleFloat899); 
             after(grammarAccess.getFloatAccess().getFloatKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleGDay"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:478:1: entryRuleGDay : ruleGDay EOF ;
    public final void entryRuleGDay() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:479:1: ( ruleGDay EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:480:1: ruleGDay EOF
            {
             before(grammarAccess.getGDayRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGDay_in_entryRuleGDay927);
            ruleGDay();

            state._fsp--;

             after(grammarAccess.getGDayRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGDay934); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGDay"


    // $ANTLR start "ruleGDay"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:487:1: ruleGDay : ( 'GDay' ) ;
    public final void ruleGDay() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:491:2: ( ( 'GDay' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:492:1: ( 'GDay' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:492:1: ( 'GDay' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:493:1: 'GDay'
            {
             before(grammarAccess.getGDayAccess().getGDayKeyword()); 
            match(input,24,FollowSets000.FOLLOW_24_in_ruleGDay961); 
             after(grammarAccess.getGDayAccess().getGDayKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGDay"


    // $ANTLR start "entryRuleGMonth"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:508:1: entryRuleGMonth : ruleGMonth EOF ;
    public final void entryRuleGMonth() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:509:1: ( ruleGMonth EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:510:1: ruleGMonth EOF
            {
             before(grammarAccess.getGMonthRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGMonth_in_entryRuleGMonth989);
            ruleGMonth();

            state._fsp--;

             after(grammarAccess.getGMonthRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGMonth996); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGMonth"


    // $ANTLR start "ruleGMonth"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:517:1: ruleGMonth : ( 'GMonth' ) ;
    public final void ruleGMonth() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:521:2: ( ( 'GMonth' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:522:1: ( 'GMonth' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:522:1: ( 'GMonth' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:523:1: 'GMonth'
            {
             before(grammarAccess.getGMonthAccess().getGMonthKeyword()); 
            match(input,25,FollowSets000.FOLLOW_25_in_ruleGMonth1023); 
             after(grammarAccess.getGMonthAccess().getGMonthKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGMonth"


    // $ANTLR start "entryRuleGMonthDay"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:538:1: entryRuleGMonthDay : ruleGMonthDay EOF ;
    public final void entryRuleGMonthDay() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:539:1: ( ruleGMonthDay EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:540:1: ruleGMonthDay EOF
            {
             before(grammarAccess.getGMonthDayRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGMonthDay_in_entryRuleGMonthDay1051);
            ruleGMonthDay();

            state._fsp--;

             after(grammarAccess.getGMonthDayRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGMonthDay1058); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGMonthDay"


    // $ANTLR start "ruleGMonthDay"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:547:1: ruleGMonthDay : ( 'GMonthDay' ) ;
    public final void ruleGMonthDay() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:551:2: ( ( 'GMonthDay' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:552:1: ( 'GMonthDay' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:552:1: ( 'GMonthDay' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:553:1: 'GMonthDay'
            {
             before(grammarAccess.getGMonthDayAccess().getGMonthDayKeyword()); 
            match(input,26,FollowSets000.FOLLOW_26_in_ruleGMonthDay1085); 
             after(grammarAccess.getGMonthDayAccess().getGMonthDayKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGMonthDay"


    // $ANTLR start "entryRuleGYear"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:568:1: entryRuleGYear : ruleGYear EOF ;
    public final void entryRuleGYear() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:569:1: ( ruleGYear EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:570:1: ruleGYear EOF
            {
             before(grammarAccess.getGYearRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGYear_in_entryRuleGYear1113);
            ruleGYear();

            state._fsp--;

             after(grammarAccess.getGYearRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGYear1120); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGYear"


    // $ANTLR start "ruleGYear"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:577:1: ruleGYear : ( 'GYear' ) ;
    public final void ruleGYear() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:581:2: ( ( 'GYear' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:582:1: ( 'GYear' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:582:1: ( 'GYear' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:583:1: 'GYear'
            {
             before(grammarAccess.getGYearAccess().getGYearKeyword()); 
            match(input,27,FollowSets000.FOLLOW_27_in_ruleGYear1147); 
             after(grammarAccess.getGYearAccess().getGYearKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGYear"


    // $ANTLR start "entryRuleGYearMonth"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:598:1: entryRuleGYearMonth : ruleGYearMonth EOF ;
    public final void entryRuleGYearMonth() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:599:1: ( ruleGYearMonth EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:600:1: ruleGYearMonth EOF
            {
             before(grammarAccess.getGYearMonthRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGYearMonth_in_entryRuleGYearMonth1175);
            ruleGYearMonth();

            state._fsp--;

             after(grammarAccess.getGYearMonthRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGYearMonth1182); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGYearMonth"


    // $ANTLR start "ruleGYearMonth"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:607:1: ruleGYearMonth : ( 'GYearMonth' ) ;
    public final void ruleGYearMonth() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:611:2: ( ( 'GYearMonth' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:612:1: ( 'GYearMonth' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:612:1: ( 'GYearMonth' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:613:1: 'GYearMonth'
            {
             before(grammarAccess.getGYearMonthAccess().getGYearMonthKeyword()); 
            match(input,28,FollowSets000.FOLLOW_28_in_ruleGYearMonth1209); 
             after(grammarAccess.getGYearMonthAccess().getGYearMonthKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGYearMonth"


    // $ANTLR start "entryRuleHexBinary"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:628:1: entryRuleHexBinary : ruleHexBinary EOF ;
    public final void entryRuleHexBinary() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:629:1: ( ruleHexBinary EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:630:1: ruleHexBinary EOF
            {
             before(grammarAccess.getHexBinaryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHexBinary_in_entryRuleHexBinary1237);
            ruleHexBinary();

            state._fsp--;

             after(grammarAccess.getHexBinaryRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHexBinary1244); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHexBinary"


    // $ANTLR start "ruleHexBinary"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:637:1: ruleHexBinary : ( 'HexBinary' ) ;
    public final void ruleHexBinary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:641:2: ( ( 'HexBinary' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:642:1: ( 'HexBinary' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:642:1: ( 'HexBinary' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:643:1: 'HexBinary'
            {
             before(grammarAccess.getHexBinaryAccess().getHexBinaryKeyword()); 
            match(input,29,FollowSets000.FOLLOW_29_in_ruleHexBinary1271); 
             after(grammarAccess.getHexBinaryAccess().getHexBinaryKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHexBinary"


    // $ANTLR start "entryRuleID0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:658:1: entryRuleID0 : ruleID0 EOF ;
    public final void entryRuleID0() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:659:1: ( ruleID0 EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:660:1: ruleID0 EOF
            {
             before(grammarAccess.getID0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleID0_in_entryRuleID01299);
            ruleID0();

            state._fsp--;

             after(grammarAccess.getID0Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleID01306); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleID0"


    // $ANTLR start "ruleID0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:667:1: ruleID0 : ( 'ID' ) ;
    public final void ruleID0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:671:2: ( ( 'ID' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:672:1: ( 'ID' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:672:1: ( 'ID' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:673:1: 'ID'
            {
             before(grammarAccess.getID0Access().getIDKeyword()); 
            match(input,30,FollowSets000.FOLLOW_30_in_ruleID01333); 
             after(grammarAccess.getID0Access().getIDKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleID0"


    // $ANTLR start "entryRuleIDREF"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:688:1: entryRuleIDREF : ruleIDREF EOF ;
    public final void entryRuleIDREF() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:689:1: ( ruleIDREF EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:690:1: ruleIDREF EOF
            {
             before(grammarAccess.getIDREFRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIDREF_in_entryRuleIDREF1361);
            ruleIDREF();

            state._fsp--;

             after(grammarAccess.getIDREFRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIDREF1368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIDREF"


    // $ANTLR start "ruleIDREF"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:697:1: ruleIDREF : ( 'IDREF' ) ;
    public final void ruleIDREF() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:701:2: ( ( 'IDREF' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:702:1: ( 'IDREF' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:702:1: ( 'IDREF' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:703:1: 'IDREF'
            {
             before(grammarAccess.getIDREFAccess().getIDREFKeyword()); 
            match(input,31,FollowSets000.FOLLOW_31_in_ruleIDREF1395); 
             after(grammarAccess.getIDREFAccess().getIDREFKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIDREF"


    // $ANTLR start "entryRuleIDREFS"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:718:1: entryRuleIDREFS : ruleIDREFS EOF ;
    public final void entryRuleIDREFS() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:719:1: ( ruleIDREFS EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:720:1: ruleIDREFS EOF
            {
             before(grammarAccess.getIDREFSRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIDREFS_in_entryRuleIDREFS1423);
            ruleIDREFS();

            state._fsp--;

             after(grammarAccess.getIDREFSRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIDREFS1430); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIDREFS"


    // $ANTLR start "ruleIDREFS"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:727:1: ruleIDREFS : ( 'IDREFS' ) ;
    public final void ruleIDREFS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:731:2: ( ( 'IDREFS' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:732:1: ( 'IDREFS' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:732:1: ( 'IDREFS' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:733:1: 'IDREFS'
            {
             before(grammarAccess.getIDREFSAccess().getIDREFSKeyword()); 
            match(input,32,FollowSets000.FOLLOW_32_in_ruleIDREFS1457); 
             after(grammarAccess.getIDREFSAccess().getIDREFSKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIDREFS"


    // $ANTLR start "entryRuleInt0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:748:1: entryRuleInt0 : ruleInt0 EOF ;
    public final void entryRuleInt0() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:749:1: ( ruleInt0 EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:750:1: ruleInt0 EOF
            {
             before(grammarAccess.getInt0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInt0_in_entryRuleInt01485);
            ruleInt0();

            state._fsp--;

             after(grammarAccess.getInt0Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInt01492); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInt0"


    // $ANTLR start "ruleInt0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:757:1: ruleInt0 : ( 'Int' ) ;
    public final void ruleInt0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:761:2: ( ( 'Int' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:762:1: ( 'Int' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:762:1: ( 'Int' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:763:1: 'Int'
            {
             before(grammarAccess.getInt0Access().getIntKeyword()); 
            match(input,33,FollowSets000.FOLLOW_33_in_ruleInt01519); 
             after(grammarAccess.getInt0Access().getIntKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInt0"


    // $ANTLR start "entryRuleInteger"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:778:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:779:1: ( ruleInteger EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:780:1: ruleInteger EOF
            {
             before(grammarAccess.getIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_entryRuleInteger1547);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteger1554); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:787:1: ruleInteger : ( 'Integer' ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:791:2: ( ( 'Integer' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:792:1: ( 'Integer' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:792:1: ( 'Integer' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:793:1: 'Integer'
            {
             before(grammarAccess.getIntegerAccess().getIntegerKeyword()); 
            match(input,34,FollowSets000.FOLLOW_34_in_ruleInteger1581); 
             after(grammarAccess.getIntegerAccess().getIntegerKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleLanguage"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:808:1: entryRuleLanguage : ruleLanguage EOF ;
    public final void entryRuleLanguage() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:809:1: ( ruleLanguage EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:810:1: ruleLanguage EOF
            {
             before(grammarAccess.getLanguageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLanguage_in_entryRuleLanguage1609);
            ruleLanguage();

            state._fsp--;

             after(grammarAccess.getLanguageRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLanguage1616); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLanguage"


    // $ANTLR start "ruleLanguage"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:817:1: ruleLanguage : ( 'Language' ) ;
    public final void ruleLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:821:2: ( ( 'Language' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:822:1: ( 'Language' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:822:1: ( 'Language' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:823:1: 'Language'
            {
             before(grammarAccess.getLanguageAccess().getLanguageKeyword()); 
            match(input,35,FollowSets000.FOLLOW_35_in_ruleLanguage1643); 
             after(grammarAccess.getLanguageAccess().getLanguageKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLanguage"


    // $ANTLR start "entryRuleLong"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:838:1: entryRuleLong : ruleLong EOF ;
    public final void entryRuleLong() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:839:1: ( ruleLong EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:840:1: ruleLong EOF
            {
             before(grammarAccess.getLongRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLong_in_entryRuleLong1671);
            ruleLong();

            state._fsp--;

             after(grammarAccess.getLongRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLong1678); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLong"


    // $ANTLR start "ruleLong"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:847:1: ruleLong : ( 'Long' ) ;
    public final void ruleLong() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:851:2: ( ( 'Long' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:852:1: ( 'Long' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:852:1: ( 'Long' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:853:1: 'Long'
            {
             before(grammarAccess.getLongAccess().getLongKeyword()); 
            match(input,36,FollowSets000.FOLLOW_36_in_ruleLong1705); 
             after(grammarAccess.getLongAccess().getLongKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLong"


    // $ANTLR start "entryRuleName"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:868:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:869:1: ( ruleName EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:870:1: ruleName EOF
            {
             before(grammarAccess.getNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleName_in_entryRuleName1733);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNameRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleName1740); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:877:1: ruleName : ( 'Name' ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:881:2: ( ( 'Name' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:882:1: ( 'Name' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:882:1: ( 'Name' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:883:1: 'Name'
            {
             before(grammarAccess.getNameAccess().getNameKeyword()); 
            match(input,37,FollowSets000.FOLLOW_37_in_ruleName1767); 
             after(grammarAccess.getNameAccess().getNameKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleNCName"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:898:1: entryRuleNCName : ruleNCName EOF ;
    public final void entryRuleNCName() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:899:1: ( ruleNCName EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:900:1: ruleNCName EOF
            {
             before(grammarAccess.getNCNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNCName_in_entryRuleNCName1795);
            ruleNCName();

            state._fsp--;

             after(grammarAccess.getNCNameRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNCName1802); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNCName"


    // $ANTLR start "ruleNCName"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:907:1: ruleNCName : ( 'NCName' ) ;
    public final void ruleNCName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:911:2: ( ( 'NCName' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:912:1: ( 'NCName' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:912:1: ( 'NCName' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:913:1: 'NCName'
            {
             before(grammarAccess.getNCNameAccess().getNCNameKeyword()); 
            match(input,38,FollowSets000.FOLLOW_38_in_ruleNCName1829); 
             after(grammarAccess.getNCNameAccess().getNCNameKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNCName"


    // $ANTLR start "entryRuleNMTOKEN"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:928:1: entryRuleNMTOKEN : ruleNMTOKEN EOF ;
    public final void entryRuleNMTOKEN() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:929:1: ( ruleNMTOKEN EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:930:1: ruleNMTOKEN EOF
            {
             before(grammarAccess.getNMTOKENRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNMTOKEN_in_entryRuleNMTOKEN1857);
            ruleNMTOKEN();

            state._fsp--;

             after(grammarAccess.getNMTOKENRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNMTOKEN1864); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNMTOKEN"


    // $ANTLR start "ruleNMTOKEN"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:937:1: ruleNMTOKEN : ( 'NMTOKEN' ) ;
    public final void ruleNMTOKEN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:941:2: ( ( 'NMTOKEN' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:942:1: ( 'NMTOKEN' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:942:1: ( 'NMTOKEN' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:943:1: 'NMTOKEN'
            {
             before(grammarAccess.getNMTOKENAccess().getNMTOKENKeyword()); 
            match(input,39,FollowSets000.FOLLOW_39_in_ruleNMTOKEN1891); 
             after(grammarAccess.getNMTOKENAccess().getNMTOKENKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNMTOKEN"


    // $ANTLR start "entryRuleNMTOKENS"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:958:1: entryRuleNMTOKENS : ruleNMTOKENS EOF ;
    public final void entryRuleNMTOKENS() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:959:1: ( ruleNMTOKENS EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:960:1: ruleNMTOKENS EOF
            {
             before(grammarAccess.getNMTOKENSRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNMTOKENS_in_entryRuleNMTOKENS1919);
            ruleNMTOKENS();

            state._fsp--;

             after(grammarAccess.getNMTOKENSRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNMTOKENS1926); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNMTOKENS"


    // $ANTLR start "ruleNMTOKENS"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:967:1: ruleNMTOKENS : ( 'NMTOKENS' ) ;
    public final void ruleNMTOKENS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:971:2: ( ( 'NMTOKENS' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:972:1: ( 'NMTOKENS' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:972:1: ( 'NMTOKENS' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:973:1: 'NMTOKENS'
            {
             before(grammarAccess.getNMTOKENSAccess().getNMTOKENSKeyword()); 
            match(input,40,FollowSets000.FOLLOW_40_in_ruleNMTOKENS1953); 
             after(grammarAccess.getNMTOKENSAccess().getNMTOKENSKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNMTOKENS"


    // $ANTLR start "entryRuleNonNegativeInteger"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:988:1: entryRuleNonNegativeInteger : ruleNonNegativeInteger EOF ;
    public final void entryRuleNonNegativeInteger() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:989:1: ( ruleNonNegativeInteger EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:990:1: ruleNonNegativeInteger EOF
            {
             before(grammarAccess.getNonNegativeIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNonNegativeInteger_in_entryRuleNonNegativeInteger1981);
            ruleNonNegativeInteger();

            state._fsp--;

             after(grammarAccess.getNonNegativeIntegerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNonNegativeInteger1988); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNonNegativeInteger"


    // $ANTLR start "ruleNonNegativeInteger"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:997:1: ruleNonNegativeInteger : ( 'NonNegativeInteger' ) ;
    public final void ruleNonNegativeInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1001:2: ( ( 'NonNegativeInteger' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1002:1: ( 'NonNegativeInteger' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1002:1: ( 'NonNegativeInteger' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1003:1: 'NonNegativeInteger'
            {
             before(grammarAccess.getNonNegativeIntegerAccess().getNonNegativeIntegerKeyword()); 
            match(input,41,FollowSets000.FOLLOW_41_in_ruleNonNegativeInteger2015); 
             after(grammarAccess.getNonNegativeIntegerAccess().getNonNegativeIntegerKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNonNegativeInteger"


    // $ANTLR start "entryRuleNonPositiveInteger"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1018:1: entryRuleNonPositiveInteger : ruleNonPositiveInteger EOF ;
    public final void entryRuleNonPositiveInteger() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1019:1: ( ruleNonPositiveInteger EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1020:1: ruleNonPositiveInteger EOF
            {
             before(grammarAccess.getNonPositiveIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNonPositiveInteger_in_entryRuleNonPositiveInteger2043);
            ruleNonPositiveInteger();

            state._fsp--;

             after(grammarAccess.getNonPositiveIntegerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNonPositiveInteger2050); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNonPositiveInteger"


    // $ANTLR start "ruleNonPositiveInteger"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1027:1: ruleNonPositiveInteger : ( 'NonPositiveInteger' ) ;
    public final void ruleNonPositiveInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1031:2: ( ( 'NonPositiveInteger' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1032:1: ( 'NonPositiveInteger' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1032:1: ( 'NonPositiveInteger' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1033:1: 'NonPositiveInteger'
            {
             before(grammarAccess.getNonPositiveIntegerAccess().getNonPositiveIntegerKeyword()); 
            match(input,42,FollowSets000.FOLLOW_42_in_ruleNonPositiveInteger2077); 
             after(grammarAccess.getNonPositiveIntegerAccess().getNonPositiveIntegerKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNonPositiveInteger"


    // $ANTLR start "entryRulePositiveInteger"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1048:1: entryRulePositiveInteger : rulePositiveInteger EOF ;
    public final void entryRulePositiveInteger() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1049:1: ( rulePositiveInteger EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1050:1: rulePositiveInteger EOF
            {
             before(grammarAccess.getPositiveIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePositiveInteger_in_entryRulePositiveInteger2105);
            rulePositiveInteger();

            state._fsp--;

             after(grammarAccess.getPositiveIntegerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePositiveInteger2112); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePositiveInteger"


    // $ANTLR start "rulePositiveInteger"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1057:1: rulePositiveInteger : ( 'PositiveInteger' ) ;
    public final void rulePositiveInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1061:2: ( ( 'PositiveInteger' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1062:1: ( 'PositiveInteger' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1062:1: ( 'PositiveInteger' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1063:1: 'PositiveInteger'
            {
             before(grammarAccess.getPositiveIntegerAccess().getPositiveIntegerKeyword()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rulePositiveInteger2139); 
             after(grammarAccess.getPositiveIntegerAccess().getPositiveIntegerKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePositiveInteger"


    // $ANTLR start "entryRuleQName"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1078:1: entryRuleQName : ruleQName EOF ;
    public final void entryRuleQName() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1079:1: ( ruleQName EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1080:1: ruleQName EOF
            {
             before(grammarAccess.getQNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_entryRuleQName2167);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getQNameRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQName2174); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQName"


    // $ANTLR start "ruleQName"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1087:1: ruleQName : ( 'QName' ) ;
    public final void ruleQName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1091:2: ( ( 'QName' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1092:1: ( 'QName' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1092:1: ( 'QName' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1093:1: 'QName'
            {
             before(grammarAccess.getQNameAccess().getQNameKeyword()); 
            match(input,44,FollowSets000.FOLLOW_44_in_ruleQName2201); 
             after(grammarAccess.getQNameAccess().getQNameKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQName"


    // $ANTLR start "entryRuleShort"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1108:1: entryRuleShort : ruleShort EOF ;
    public final void entryRuleShort() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1109:1: ( ruleShort EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1110:1: ruleShort EOF
            {
             before(grammarAccess.getShortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleShort_in_entryRuleShort2229);
            ruleShort();

            state._fsp--;

             after(grammarAccess.getShortRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleShort2236); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShort"


    // $ANTLR start "ruleShort"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1117:1: ruleShort : ( 'Short' ) ;
    public final void ruleShort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1121:2: ( ( 'Short' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1122:1: ( 'Short' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1122:1: ( 'Short' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1123:1: 'Short'
            {
             before(grammarAccess.getShortAccess().getShortKeyword()); 
            match(input,45,FollowSets000.FOLLOW_45_in_ruleShort2263); 
             after(grammarAccess.getShortAccess().getShortKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShort"


    // $ANTLR start "entryRuleString0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1138:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1139:1: ( ruleString0 EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1140:1: ruleString0 EOF
            {
             before(grammarAccess.getString0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_entryRuleString02291);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getString0Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleString02298); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1147:1: ruleString0 : ( 'String' ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1151:2: ( ( 'String' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1152:1: ( 'String' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1152:1: ( 'String' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1153:1: 'String'
            {
             before(grammarAccess.getString0Access().getStringKeyword()); 
            match(input,46,FollowSets000.FOLLOW_46_in_ruleString02325); 
             after(grammarAccess.getString0Access().getStringKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleTime"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1168:1: entryRuleTime : ruleTime EOF ;
    public final void entryRuleTime() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1169:1: ( ruleTime EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1170:1: ruleTime EOF
            {
             before(grammarAccess.getTimeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTime_in_entryRuleTime2353);
            ruleTime();

            state._fsp--;

             after(grammarAccess.getTimeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTime2360); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1177:1: ruleTime : ( 'Time' ) ;
    public final void ruleTime() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1181:2: ( ( 'Time' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1182:1: ( 'Time' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1182:1: ( 'Time' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1183:1: 'Time'
            {
             before(grammarAccess.getTimeAccess().getTimeKeyword()); 
            match(input,47,FollowSets000.FOLLOW_47_in_ruleTime2387); 
             after(grammarAccess.getTimeAccess().getTimeKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTime"


    // $ANTLR start "entryRuleToken"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1198:1: entryRuleToken : ruleToken EOF ;
    public final void entryRuleToken() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1199:1: ( ruleToken EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1200:1: ruleToken EOF
            {
             before(grammarAccess.getTokenRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleToken_in_entryRuleToken2415);
            ruleToken();

            state._fsp--;

             after(grammarAccess.getTokenRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleToken2422); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleToken"


    // $ANTLR start "ruleToken"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1207:1: ruleToken : ( 'Token' ) ;
    public final void ruleToken() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1211:2: ( ( 'Token' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1212:1: ( 'Token' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1212:1: ( 'Token' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1213:1: 'Token'
            {
             before(grammarAccess.getTokenAccess().getTokenKeyword()); 
            match(input,48,FollowSets000.FOLLOW_48_in_ruleToken2449); 
             after(grammarAccess.getTokenAccess().getTokenKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleToken"


    // $ANTLR start "entryRuleUnsignedByte"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1228:1: entryRuleUnsignedByte : ruleUnsignedByte EOF ;
    public final void entryRuleUnsignedByte() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1229:1: ( ruleUnsignedByte EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1230:1: ruleUnsignedByte EOF
            {
             before(grammarAccess.getUnsignedByteRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnsignedByte_in_entryRuleUnsignedByte2477);
            ruleUnsignedByte();

            state._fsp--;

             after(grammarAccess.getUnsignedByteRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnsignedByte2484); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnsignedByte"


    // $ANTLR start "ruleUnsignedByte"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1237:1: ruleUnsignedByte : ( 'UnsignedByte' ) ;
    public final void ruleUnsignedByte() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1241:2: ( ( 'UnsignedByte' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1242:1: ( 'UnsignedByte' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1242:1: ( 'UnsignedByte' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1243:1: 'UnsignedByte'
            {
             before(grammarAccess.getUnsignedByteAccess().getUnsignedByteKeyword()); 
            match(input,49,FollowSets000.FOLLOW_49_in_ruleUnsignedByte2511); 
             after(grammarAccess.getUnsignedByteAccess().getUnsignedByteKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnsignedByte"


    // $ANTLR start "entryRuleUnsignedInt"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1258:1: entryRuleUnsignedInt : ruleUnsignedInt EOF ;
    public final void entryRuleUnsignedInt() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1259:1: ( ruleUnsignedInt EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1260:1: ruleUnsignedInt EOF
            {
             before(grammarAccess.getUnsignedIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnsignedInt_in_entryRuleUnsignedInt2539);
            ruleUnsignedInt();

            state._fsp--;

             after(grammarAccess.getUnsignedIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnsignedInt2546); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnsignedInt"


    // $ANTLR start "ruleUnsignedInt"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1267:1: ruleUnsignedInt : ( 'UnsignedInt' ) ;
    public final void ruleUnsignedInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1271:2: ( ( 'UnsignedInt' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1272:1: ( 'UnsignedInt' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1272:1: ( 'UnsignedInt' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1273:1: 'UnsignedInt'
            {
             before(grammarAccess.getUnsignedIntAccess().getUnsignedIntKeyword()); 
            match(input,50,FollowSets000.FOLLOW_50_in_ruleUnsignedInt2573); 
             after(grammarAccess.getUnsignedIntAccess().getUnsignedIntKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnsignedInt"


    // $ANTLR start "entryRuleUnsignedLong"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1288:1: entryRuleUnsignedLong : ruleUnsignedLong EOF ;
    public final void entryRuleUnsignedLong() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1289:1: ( ruleUnsignedLong EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1290:1: ruleUnsignedLong EOF
            {
             before(grammarAccess.getUnsignedLongRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnsignedLong_in_entryRuleUnsignedLong2601);
            ruleUnsignedLong();

            state._fsp--;

             after(grammarAccess.getUnsignedLongRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnsignedLong2608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnsignedLong"


    // $ANTLR start "ruleUnsignedLong"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1297:1: ruleUnsignedLong : ( 'UnsignedLong' ) ;
    public final void ruleUnsignedLong() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1301:2: ( ( 'UnsignedLong' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1302:1: ( 'UnsignedLong' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1302:1: ( 'UnsignedLong' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1303:1: 'UnsignedLong'
            {
             before(grammarAccess.getUnsignedLongAccess().getUnsignedLongKeyword()); 
            match(input,51,FollowSets000.FOLLOW_51_in_ruleUnsignedLong2635); 
             after(grammarAccess.getUnsignedLongAccess().getUnsignedLongKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnsignedLong"


    // $ANTLR start "entryRuleUnsignedShort"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1318:1: entryRuleUnsignedShort : ruleUnsignedShort EOF ;
    public final void entryRuleUnsignedShort() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1319:1: ( ruleUnsignedShort EOF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1320:1: ruleUnsignedShort EOF
            {
             before(grammarAccess.getUnsignedShortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnsignedShort_in_entryRuleUnsignedShort2663);
            ruleUnsignedShort();

            state._fsp--;

             after(grammarAccess.getUnsignedShortRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnsignedShort2670); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnsignedShort"


    // $ANTLR start "ruleUnsignedShort"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1327:1: ruleUnsignedShort : ( 'UnsignedShort' ) ;
    public final void ruleUnsignedShort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1331:2: ( ( 'UnsignedShort' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1332:1: ( 'UnsignedShort' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1332:1: ( 'UnsignedShort' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1333:1: 'UnsignedShort'
            {
             before(grammarAccess.getUnsignedShortAccess().getUnsignedShortKeyword()); 
            match(input,52,FollowSets000.FOLLOW_52_in_ruleUnsignedShort2697); 
             after(grammarAccess.getUnsignedShortAccess().getUnsignedShortKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnsignedShort"


    // $ANTLR start "rule__DataTypeTest__Group__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1350:1: rule__DataTypeTest__Group__0 : rule__DataTypeTest__Group__0__Impl rule__DataTypeTest__Group__1 ;
    public final void rule__DataTypeTest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1354:1: ( rule__DataTypeTest__Group__0__Impl rule__DataTypeTest__Group__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1355:2: rule__DataTypeTest__Group__0__Impl rule__DataTypeTest__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__0__Impl_in_rule__DataTypeTest__Group__02732);
            rule__DataTypeTest__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__1_in_rule__DataTypeTest__Group__02735);
            rule__DataTypeTest__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__0"


    // $ANTLR start "rule__DataTypeTest__Group__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1362:1: rule__DataTypeTest__Group__0__Impl : ( () ) ;
    public final void rule__DataTypeTest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1366:1: ( ( () ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1367:1: ( () )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1367:1: ( () )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1368:1: ()
            {
             before(grammarAccess.getDataTypeTestAccess().getDataTypeTestAction_0()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1369:1: ()
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1371:1: 
            {
            }

             after(grammarAccess.getDataTypeTestAccess().getDataTypeTestAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1381:1: rule__DataTypeTest__Group__1 : rule__DataTypeTest__Group__1__Impl rule__DataTypeTest__Group__2 ;
    public final void rule__DataTypeTest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1385:1: ( rule__DataTypeTest__Group__1__Impl rule__DataTypeTest__Group__2 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1386:2: rule__DataTypeTest__Group__1__Impl rule__DataTypeTest__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__1__Impl_in_rule__DataTypeTest__Group__12793);
            rule__DataTypeTest__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__2_in_rule__DataTypeTest__Group__12796);
            rule__DataTypeTest__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__1"


    // $ANTLR start "rule__DataTypeTest__Group__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1393:1: rule__DataTypeTest__Group__1__Impl : ( 'DataTypeTest' ) ;
    public final void rule__DataTypeTest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1397:1: ( ( 'DataTypeTest' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1398:1: ( 'DataTypeTest' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1398:1: ( 'DataTypeTest' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1399:1: 'DataTypeTest'
            {
             before(grammarAccess.getDataTypeTestAccess().getDataTypeTestKeyword_1()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__DataTypeTest__Group__1__Impl2824); 
             after(grammarAccess.getDataTypeTestAccess().getDataTypeTestKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__2"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1412:1: rule__DataTypeTest__Group__2 : rule__DataTypeTest__Group__2__Impl rule__DataTypeTest__Group__3 ;
    public final void rule__DataTypeTest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1416:1: ( rule__DataTypeTest__Group__2__Impl rule__DataTypeTest__Group__3 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1417:2: rule__DataTypeTest__Group__2__Impl rule__DataTypeTest__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__2__Impl_in_rule__DataTypeTest__Group__22855);
            rule__DataTypeTest__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__3_in_rule__DataTypeTest__Group__22858);
            rule__DataTypeTest__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__2"


    // $ANTLR start "rule__DataTypeTest__Group__2__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1424:1: rule__DataTypeTest__Group__2__Impl : ( ( rule__DataTypeTest__AIDAssignment_2 ) ) ;
    public final void rule__DataTypeTest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1428:1: ( ( ( rule__DataTypeTest__AIDAssignment_2 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1429:1: ( ( rule__DataTypeTest__AIDAssignment_2 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1429:1: ( ( rule__DataTypeTest__AIDAssignment_2 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1430:1: ( rule__DataTypeTest__AIDAssignment_2 )
            {
             before(grammarAccess.getDataTypeTestAccess().getAIDAssignment_2()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1431:1: ( rule__DataTypeTest__AIDAssignment_2 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1431:2: rule__DataTypeTest__AIDAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__AIDAssignment_2_in_rule__DataTypeTest__Group__2__Impl2885);
            rule__DataTypeTest__AIDAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getAIDAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__2__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__3"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1441:1: rule__DataTypeTest__Group__3 : rule__DataTypeTest__Group__3__Impl rule__DataTypeTest__Group__4 ;
    public final void rule__DataTypeTest__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1445:1: ( rule__DataTypeTest__Group__3__Impl rule__DataTypeTest__Group__4 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1446:2: rule__DataTypeTest__Group__3__Impl rule__DataTypeTest__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__3__Impl_in_rule__DataTypeTest__Group__32915);
            rule__DataTypeTest__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__4_in_rule__DataTypeTest__Group__32918);
            rule__DataTypeTest__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__3"


    // $ANTLR start "rule__DataTypeTest__Group__3__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1453:1: rule__DataTypeTest__Group__3__Impl : ( '{' ) ;
    public final void rule__DataTypeTest__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1457:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1458:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1458:1: ( '{' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1459:1: '{'
            {
             before(grammarAccess.getDataTypeTestAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,54,FollowSets000.FOLLOW_54_in_rule__DataTypeTest__Group__3__Impl2946); 
             after(grammarAccess.getDataTypeTestAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__3__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__4"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1472:1: rule__DataTypeTest__Group__4 : rule__DataTypeTest__Group__4__Impl rule__DataTypeTest__Group__5 ;
    public final void rule__DataTypeTest__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1476:1: ( rule__DataTypeTest__Group__4__Impl rule__DataTypeTest__Group__5 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1477:2: rule__DataTypeTest__Group__4__Impl rule__DataTypeTest__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__4__Impl_in_rule__DataTypeTest__Group__42977);
            rule__DataTypeTest__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__5_in_rule__DataTypeTest__Group__42980);
            rule__DataTypeTest__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__4"


    // $ANTLR start "rule__DataTypeTest__Group__4__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1484:1: rule__DataTypeTest__Group__4__Impl : ( ( rule__DataTypeTest__Group_4__0 )? ) ;
    public final void rule__DataTypeTest__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1488:1: ( ( ( rule__DataTypeTest__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1489:1: ( ( rule__DataTypeTest__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1489:1: ( ( rule__DataTypeTest__Group_4__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1490:1: ( rule__DataTypeTest__Group_4__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1491:1: ( rule__DataTypeTest__Group_4__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==56) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1491:2: rule__DataTypeTest__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_4__0_in_rule__DataTypeTest__Group__4__Impl3007);
                    rule__DataTypeTest__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__4__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__5"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1501:1: rule__DataTypeTest__Group__5 : rule__DataTypeTest__Group__5__Impl rule__DataTypeTest__Group__6 ;
    public final void rule__DataTypeTest__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1505:1: ( rule__DataTypeTest__Group__5__Impl rule__DataTypeTest__Group__6 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1506:2: rule__DataTypeTest__Group__5__Impl rule__DataTypeTest__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__5__Impl_in_rule__DataTypeTest__Group__53038);
            rule__DataTypeTest__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__6_in_rule__DataTypeTest__Group__53041);
            rule__DataTypeTest__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__5"


    // $ANTLR start "rule__DataTypeTest__Group__5__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1513:1: rule__DataTypeTest__Group__5__Impl : ( ( rule__DataTypeTest__Group_5__0 )? ) ;
    public final void rule__DataTypeTest__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1517:1: ( ( ( rule__DataTypeTest__Group_5__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1518:1: ( ( rule__DataTypeTest__Group_5__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1518:1: ( ( rule__DataTypeTest__Group_5__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1519:1: ( rule__DataTypeTest__Group_5__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_5()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1520:1: ( rule__DataTypeTest__Group_5__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==57) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1520:2: rule__DataTypeTest__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_5__0_in_rule__DataTypeTest__Group__5__Impl3068);
                    rule__DataTypeTest__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__5__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__6"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1530:1: rule__DataTypeTest__Group__6 : rule__DataTypeTest__Group__6__Impl rule__DataTypeTest__Group__7 ;
    public final void rule__DataTypeTest__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1534:1: ( rule__DataTypeTest__Group__6__Impl rule__DataTypeTest__Group__7 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1535:2: rule__DataTypeTest__Group__6__Impl rule__DataTypeTest__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__6__Impl_in_rule__DataTypeTest__Group__63099);
            rule__DataTypeTest__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__7_in_rule__DataTypeTest__Group__63102);
            rule__DataTypeTest__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__6"


    // $ANTLR start "rule__DataTypeTest__Group__6__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1542:1: rule__DataTypeTest__Group__6__Impl : ( ( rule__DataTypeTest__Group_6__0 )? ) ;
    public final void rule__DataTypeTest__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1546:1: ( ( ( rule__DataTypeTest__Group_6__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1547:1: ( ( rule__DataTypeTest__Group_6__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1547:1: ( ( rule__DataTypeTest__Group_6__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1548:1: ( rule__DataTypeTest__Group_6__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_6()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1549:1: ( rule__DataTypeTest__Group_6__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==58) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1549:2: rule__DataTypeTest__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_6__0_in_rule__DataTypeTest__Group__6__Impl3129);
                    rule__DataTypeTest__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__6__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__7"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1559:1: rule__DataTypeTest__Group__7 : rule__DataTypeTest__Group__7__Impl rule__DataTypeTest__Group__8 ;
    public final void rule__DataTypeTest__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1563:1: ( rule__DataTypeTest__Group__7__Impl rule__DataTypeTest__Group__8 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1564:2: rule__DataTypeTest__Group__7__Impl rule__DataTypeTest__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__7__Impl_in_rule__DataTypeTest__Group__73160);
            rule__DataTypeTest__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__8_in_rule__DataTypeTest__Group__73163);
            rule__DataTypeTest__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__7"


    // $ANTLR start "rule__DataTypeTest__Group__7__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1571:1: rule__DataTypeTest__Group__7__Impl : ( ( rule__DataTypeTest__Group_7__0 )? ) ;
    public final void rule__DataTypeTest__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1575:1: ( ( ( rule__DataTypeTest__Group_7__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1576:1: ( ( rule__DataTypeTest__Group_7__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1576:1: ( ( rule__DataTypeTest__Group_7__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1577:1: ( rule__DataTypeTest__Group_7__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_7()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1578:1: ( rule__DataTypeTest__Group_7__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==59) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1578:2: rule__DataTypeTest__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_7__0_in_rule__DataTypeTest__Group__7__Impl3190);
                    rule__DataTypeTest__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__7__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__8"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1588:1: rule__DataTypeTest__Group__8 : rule__DataTypeTest__Group__8__Impl rule__DataTypeTest__Group__9 ;
    public final void rule__DataTypeTest__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1592:1: ( rule__DataTypeTest__Group__8__Impl rule__DataTypeTest__Group__9 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1593:2: rule__DataTypeTest__Group__8__Impl rule__DataTypeTest__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__8__Impl_in_rule__DataTypeTest__Group__83221);
            rule__DataTypeTest__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__9_in_rule__DataTypeTest__Group__83224);
            rule__DataTypeTest__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__8"


    // $ANTLR start "rule__DataTypeTest__Group__8__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1600:1: rule__DataTypeTest__Group__8__Impl : ( ( rule__DataTypeTest__Group_8__0 )? ) ;
    public final void rule__DataTypeTest__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1604:1: ( ( ( rule__DataTypeTest__Group_8__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1605:1: ( ( rule__DataTypeTest__Group_8__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1605:1: ( ( rule__DataTypeTest__Group_8__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1606:1: ( rule__DataTypeTest__Group_8__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_8()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1607:1: ( rule__DataTypeTest__Group_8__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==60) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1607:2: rule__DataTypeTest__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_8__0_in_rule__DataTypeTest__Group__8__Impl3251);
                    rule__DataTypeTest__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__8__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__9"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1617:1: rule__DataTypeTest__Group__9 : rule__DataTypeTest__Group__9__Impl rule__DataTypeTest__Group__10 ;
    public final void rule__DataTypeTest__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1621:1: ( rule__DataTypeTest__Group__9__Impl rule__DataTypeTest__Group__10 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1622:2: rule__DataTypeTest__Group__9__Impl rule__DataTypeTest__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__9__Impl_in_rule__DataTypeTest__Group__93282);
            rule__DataTypeTest__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__10_in_rule__DataTypeTest__Group__93285);
            rule__DataTypeTest__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__9"


    // $ANTLR start "rule__DataTypeTest__Group__9__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1629:1: rule__DataTypeTest__Group__9__Impl : ( ( rule__DataTypeTest__Group_9__0 )? ) ;
    public final void rule__DataTypeTest__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1633:1: ( ( ( rule__DataTypeTest__Group_9__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1634:1: ( ( rule__DataTypeTest__Group_9__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1634:1: ( ( rule__DataTypeTest__Group_9__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1635:1: ( rule__DataTypeTest__Group_9__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_9()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1636:1: ( rule__DataTypeTest__Group_9__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==61) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1636:2: rule__DataTypeTest__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_9__0_in_rule__DataTypeTest__Group__9__Impl3312);
                    rule__DataTypeTest__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__9__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__10"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1646:1: rule__DataTypeTest__Group__10 : rule__DataTypeTest__Group__10__Impl rule__DataTypeTest__Group__11 ;
    public final void rule__DataTypeTest__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1650:1: ( rule__DataTypeTest__Group__10__Impl rule__DataTypeTest__Group__11 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1651:2: rule__DataTypeTest__Group__10__Impl rule__DataTypeTest__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__10__Impl_in_rule__DataTypeTest__Group__103343);
            rule__DataTypeTest__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__11_in_rule__DataTypeTest__Group__103346);
            rule__DataTypeTest__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__10"


    // $ANTLR start "rule__DataTypeTest__Group__10__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1658:1: rule__DataTypeTest__Group__10__Impl : ( ( rule__DataTypeTest__Group_10__0 )? ) ;
    public final void rule__DataTypeTest__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1662:1: ( ( ( rule__DataTypeTest__Group_10__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1663:1: ( ( rule__DataTypeTest__Group_10__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1663:1: ( ( rule__DataTypeTest__Group_10__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1664:1: ( rule__DataTypeTest__Group_10__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_10()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1665:1: ( rule__DataTypeTest__Group_10__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==62) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1665:2: rule__DataTypeTest__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_10__0_in_rule__DataTypeTest__Group__10__Impl3373);
                    rule__DataTypeTest__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__10__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__11"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1675:1: rule__DataTypeTest__Group__11 : rule__DataTypeTest__Group__11__Impl rule__DataTypeTest__Group__12 ;
    public final void rule__DataTypeTest__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1679:1: ( rule__DataTypeTest__Group__11__Impl rule__DataTypeTest__Group__12 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1680:2: rule__DataTypeTest__Group__11__Impl rule__DataTypeTest__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__11__Impl_in_rule__DataTypeTest__Group__113404);
            rule__DataTypeTest__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__12_in_rule__DataTypeTest__Group__113407);
            rule__DataTypeTest__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__11"


    // $ANTLR start "rule__DataTypeTest__Group__11__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1687:1: rule__DataTypeTest__Group__11__Impl : ( ( rule__DataTypeTest__Group_11__0 )? ) ;
    public final void rule__DataTypeTest__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1691:1: ( ( ( rule__DataTypeTest__Group_11__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1692:1: ( ( rule__DataTypeTest__Group_11__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1692:1: ( ( rule__DataTypeTest__Group_11__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1693:1: ( rule__DataTypeTest__Group_11__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_11()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1694:1: ( rule__DataTypeTest__Group_11__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==63) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1694:2: rule__DataTypeTest__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_11__0_in_rule__DataTypeTest__Group__11__Impl3434);
                    rule__DataTypeTest__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__11__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__12"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1704:1: rule__DataTypeTest__Group__12 : rule__DataTypeTest__Group__12__Impl rule__DataTypeTest__Group__13 ;
    public final void rule__DataTypeTest__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1708:1: ( rule__DataTypeTest__Group__12__Impl rule__DataTypeTest__Group__13 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1709:2: rule__DataTypeTest__Group__12__Impl rule__DataTypeTest__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__12__Impl_in_rule__DataTypeTest__Group__123465);
            rule__DataTypeTest__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__13_in_rule__DataTypeTest__Group__123468);
            rule__DataTypeTest__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__12"


    // $ANTLR start "rule__DataTypeTest__Group__12__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1716:1: rule__DataTypeTest__Group__12__Impl : ( ( rule__DataTypeTest__Group_12__0 )? ) ;
    public final void rule__DataTypeTest__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1720:1: ( ( ( rule__DataTypeTest__Group_12__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1721:1: ( ( rule__DataTypeTest__Group_12__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1721:1: ( ( rule__DataTypeTest__Group_12__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1722:1: ( rule__DataTypeTest__Group_12__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_12()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1723:1: ( rule__DataTypeTest__Group_12__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==64) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1723:2: rule__DataTypeTest__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_12__0_in_rule__DataTypeTest__Group__12__Impl3495);
                    rule__DataTypeTest__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__12__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__13"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1733:1: rule__DataTypeTest__Group__13 : rule__DataTypeTest__Group__13__Impl rule__DataTypeTest__Group__14 ;
    public final void rule__DataTypeTest__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1737:1: ( rule__DataTypeTest__Group__13__Impl rule__DataTypeTest__Group__14 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1738:2: rule__DataTypeTest__Group__13__Impl rule__DataTypeTest__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__13__Impl_in_rule__DataTypeTest__Group__133526);
            rule__DataTypeTest__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__14_in_rule__DataTypeTest__Group__133529);
            rule__DataTypeTest__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__13"


    // $ANTLR start "rule__DataTypeTest__Group__13__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1745:1: rule__DataTypeTest__Group__13__Impl : ( ( rule__DataTypeTest__Group_13__0 )? ) ;
    public final void rule__DataTypeTest__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1749:1: ( ( ( rule__DataTypeTest__Group_13__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1750:1: ( ( rule__DataTypeTest__Group_13__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1750:1: ( ( rule__DataTypeTest__Group_13__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1751:1: ( rule__DataTypeTest__Group_13__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_13()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1752:1: ( rule__DataTypeTest__Group_13__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==65) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1752:2: rule__DataTypeTest__Group_13__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_13__0_in_rule__DataTypeTest__Group__13__Impl3556);
                    rule__DataTypeTest__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__13__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__14"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1762:1: rule__DataTypeTest__Group__14 : rule__DataTypeTest__Group__14__Impl rule__DataTypeTest__Group__15 ;
    public final void rule__DataTypeTest__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1766:1: ( rule__DataTypeTest__Group__14__Impl rule__DataTypeTest__Group__15 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1767:2: rule__DataTypeTest__Group__14__Impl rule__DataTypeTest__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__14__Impl_in_rule__DataTypeTest__Group__143587);
            rule__DataTypeTest__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__15_in_rule__DataTypeTest__Group__143590);
            rule__DataTypeTest__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__14"


    // $ANTLR start "rule__DataTypeTest__Group__14__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1774:1: rule__DataTypeTest__Group__14__Impl : ( ( rule__DataTypeTest__Group_14__0 )? ) ;
    public final void rule__DataTypeTest__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1778:1: ( ( ( rule__DataTypeTest__Group_14__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1779:1: ( ( rule__DataTypeTest__Group_14__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1779:1: ( ( rule__DataTypeTest__Group_14__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1780:1: ( rule__DataTypeTest__Group_14__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_14()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1781:1: ( rule__DataTypeTest__Group_14__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==66) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1781:2: rule__DataTypeTest__Group_14__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_14__0_in_rule__DataTypeTest__Group__14__Impl3617);
                    rule__DataTypeTest__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__14__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__15"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1791:1: rule__DataTypeTest__Group__15 : rule__DataTypeTest__Group__15__Impl rule__DataTypeTest__Group__16 ;
    public final void rule__DataTypeTest__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1795:1: ( rule__DataTypeTest__Group__15__Impl rule__DataTypeTest__Group__16 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1796:2: rule__DataTypeTest__Group__15__Impl rule__DataTypeTest__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__15__Impl_in_rule__DataTypeTest__Group__153648);
            rule__DataTypeTest__Group__15__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__16_in_rule__DataTypeTest__Group__153651);
            rule__DataTypeTest__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__15"


    // $ANTLR start "rule__DataTypeTest__Group__15__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1803:1: rule__DataTypeTest__Group__15__Impl : ( ( rule__DataTypeTest__Group_15__0 )? ) ;
    public final void rule__DataTypeTest__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1807:1: ( ( ( rule__DataTypeTest__Group_15__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1808:1: ( ( rule__DataTypeTest__Group_15__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1808:1: ( ( rule__DataTypeTest__Group_15__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1809:1: ( rule__DataTypeTest__Group_15__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_15()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1810:1: ( rule__DataTypeTest__Group_15__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==67) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1810:2: rule__DataTypeTest__Group_15__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_15__0_in_rule__DataTypeTest__Group__15__Impl3678);
                    rule__DataTypeTest__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__15__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__16"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1820:1: rule__DataTypeTest__Group__16 : rule__DataTypeTest__Group__16__Impl rule__DataTypeTest__Group__17 ;
    public final void rule__DataTypeTest__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1824:1: ( rule__DataTypeTest__Group__16__Impl rule__DataTypeTest__Group__17 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1825:2: rule__DataTypeTest__Group__16__Impl rule__DataTypeTest__Group__17
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__16__Impl_in_rule__DataTypeTest__Group__163709);
            rule__DataTypeTest__Group__16__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__17_in_rule__DataTypeTest__Group__163712);
            rule__DataTypeTest__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__16"


    // $ANTLR start "rule__DataTypeTest__Group__16__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1832:1: rule__DataTypeTest__Group__16__Impl : ( ( rule__DataTypeTest__Group_16__0 )? ) ;
    public final void rule__DataTypeTest__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1836:1: ( ( ( rule__DataTypeTest__Group_16__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1837:1: ( ( rule__DataTypeTest__Group_16__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1837:1: ( ( rule__DataTypeTest__Group_16__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1838:1: ( rule__DataTypeTest__Group_16__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_16()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1839:1: ( rule__DataTypeTest__Group_16__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==68) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1839:2: rule__DataTypeTest__Group_16__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_16__0_in_rule__DataTypeTest__Group__16__Impl3739);
                    rule__DataTypeTest__Group_16__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__16__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__17"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1849:1: rule__DataTypeTest__Group__17 : rule__DataTypeTest__Group__17__Impl rule__DataTypeTest__Group__18 ;
    public final void rule__DataTypeTest__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1853:1: ( rule__DataTypeTest__Group__17__Impl rule__DataTypeTest__Group__18 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1854:2: rule__DataTypeTest__Group__17__Impl rule__DataTypeTest__Group__18
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__17__Impl_in_rule__DataTypeTest__Group__173770);
            rule__DataTypeTest__Group__17__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__18_in_rule__DataTypeTest__Group__173773);
            rule__DataTypeTest__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__17"


    // $ANTLR start "rule__DataTypeTest__Group__17__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1861:1: rule__DataTypeTest__Group__17__Impl : ( ( rule__DataTypeTest__Group_17__0 )? ) ;
    public final void rule__DataTypeTest__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1865:1: ( ( ( rule__DataTypeTest__Group_17__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1866:1: ( ( rule__DataTypeTest__Group_17__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1866:1: ( ( rule__DataTypeTest__Group_17__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1867:1: ( rule__DataTypeTest__Group_17__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_17()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1868:1: ( rule__DataTypeTest__Group_17__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==69) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1868:2: rule__DataTypeTest__Group_17__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_17__0_in_rule__DataTypeTest__Group__17__Impl3800);
                    rule__DataTypeTest__Group_17__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__17__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__18"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1878:1: rule__DataTypeTest__Group__18 : rule__DataTypeTest__Group__18__Impl rule__DataTypeTest__Group__19 ;
    public final void rule__DataTypeTest__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1882:1: ( rule__DataTypeTest__Group__18__Impl rule__DataTypeTest__Group__19 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1883:2: rule__DataTypeTest__Group__18__Impl rule__DataTypeTest__Group__19
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__18__Impl_in_rule__DataTypeTest__Group__183831);
            rule__DataTypeTest__Group__18__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__19_in_rule__DataTypeTest__Group__183834);
            rule__DataTypeTest__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__18"


    // $ANTLR start "rule__DataTypeTest__Group__18__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1890:1: rule__DataTypeTest__Group__18__Impl : ( ( rule__DataTypeTest__Group_18__0 )? ) ;
    public final void rule__DataTypeTest__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1894:1: ( ( ( rule__DataTypeTest__Group_18__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1895:1: ( ( rule__DataTypeTest__Group_18__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1895:1: ( ( rule__DataTypeTest__Group_18__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1896:1: ( rule__DataTypeTest__Group_18__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_18()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1897:1: ( rule__DataTypeTest__Group_18__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==70) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1897:2: rule__DataTypeTest__Group_18__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_18__0_in_rule__DataTypeTest__Group__18__Impl3861);
                    rule__DataTypeTest__Group_18__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__18__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__19"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1907:1: rule__DataTypeTest__Group__19 : rule__DataTypeTest__Group__19__Impl rule__DataTypeTest__Group__20 ;
    public final void rule__DataTypeTest__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1911:1: ( rule__DataTypeTest__Group__19__Impl rule__DataTypeTest__Group__20 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1912:2: rule__DataTypeTest__Group__19__Impl rule__DataTypeTest__Group__20
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__19__Impl_in_rule__DataTypeTest__Group__193892);
            rule__DataTypeTest__Group__19__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__20_in_rule__DataTypeTest__Group__193895);
            rule__DataTypeTest__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__19"


    // $ANTLR start "rule__DataTypeTest__Group__19__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1919:1: rule__DataTypeTest__Group__19__Impl : ( ( rule__DataTypeTest__Group_19__0 )? ) ;
    public final void rule__DataTypeTest__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1923:1: ( ( ( rule__DataTypeTest__Group_19__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1924:1: ( ( rule__DataTypeTest__Group_19__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1924:1: ( ( rule__DataTypeTest__Group_19__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1925:1: ( rule__DataTypeTest__Group_19__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_19()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1926:1: ( rule__DataTypeTest__Group_19__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==71) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1926:2: rule__DataTypeTest__Group_19__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_19__0_in_rule__DataTypeTest__Group__19__Impl3922);
                    rule__DataTypeTest__Group_19__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__19__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__20"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1936:1: rule__DataTypeTest__Group__20 : rule__DataTypeTest__Group__20__Impl rule__DataTypeTest__Group__21 ;
    public final void rule__DataTypeTest__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1940:1: ( rule__DataTypeTest__Group__20__Impl rule__DataTypeTest__Group__21 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1941:2: rule__DataTypeTest__Group__20__Impl rule__DataTypeTest__Group__21
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__20__Impl_in_rule__DataTypeTest__Group__203953);
            rule__DataTypeTest__Group__20__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__21_in_rule__DataTypeTest__Group__203956);
            rule__DataTypeTest__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__20"


    // $ANTLR start "rule__DataTypeTest__Group__20__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1948:1: rule__DataTypeTest__Group__20__Impl : ( ( rule__DataTypeTest__Group_20__0 )? ) ;
    public final void rule__DataTypeTest__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1952:1: ( ( ( rule__DataTypeTest__Group_20__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1953:1: ( ( rule__DataTypeTest__Group_20__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1953:1: ( ( rule__DataTypeTest__Group_20__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1954:1: ( rule__DataTypeTest__Group_20__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_20()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1955:1: ( rule__DataTypeTest__Group_20__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==72) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1955:2: rule__DataTypeTest__Group_20__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_20__0_in_rule__DataTypeTest__Group__20__Impl3983);
                    rule__DataTypeTest__Group_20__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__20__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__21"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1965:1: rule__DataTypeTest__Group__21 : rule__DataTypeTest__Group__21__Impl rule__DataTypeTest__Group__22 ;
    public final void rule__DataTypeTest__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1969:1: ( rule__DataTypeTest__Group__21__Impl rule__DataTypeTest__Group__22 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1970:2: rule__DataTypeTest__Group__21__Impl rule__DataTypeTest__Group__22
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__21__Impl_in_rule__DataTypeTest__Group__214014);
            rule__DataTypeTest__Group__21__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__22_in_rule__DataTypeTest__Group__214017);
            rule__DataTypeTest__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__21"


    // $ANTLR start "rule__DataTypeTest__Group__21__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1977:1: rule__DataTypeTest__Group__21__Impl : ( ( rule__DataTypeTest__Group_21__0 )? ) ;
    public final void rule__DataTypeTest__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1981:1: ( ( ( rule__DataTypeTest__Group_21__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1982:1: ( ( rule__DataTypeTest__Group_21__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1982:1: ( ( rule__DataTypeTest__Group_21__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1983:1: ( rule__DataTypeTest__Group_21__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_21()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1984:1: ( rule__DataTypeTest__Group_21__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==73) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1984:2: rule__DataTypeTest__Group_21__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_21__0_in_rule__DataTypeTest__Group__21__Impl4044);
                    rule__DataTypeTest__Group_21__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__21__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__22"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1994:1: rule__DataTypeTest__Group__22 : rule__DataTypeTest__Group__22__Impl rule__DataTypeTest__Group__23 ;
    public final void rule__DataTypeTest__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1998:1: ( rule__DataTypeTest__Group__22__Impl rule__DataTypeTest__Group__23 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1999:2: rule__DataTypeTest__Group__22__Impl rule__DataTypeTest__Group__23
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__22__Impl_in_rule__DataTypeTest__Group__224075);
            rule__DataTypeTest__Group__22__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__23_in_rule__DataTypeTest__Group__224078);
            rule__DataTypeTest__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__22"


    // $ANTLR start "rule__DataTypeTest__Group__22__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2006:1: rule__DataTypeTest__Group__22__Impl : ( ( rule__DataTypeTest__Group_22__0 )? ) ;
    public final void rule__DataTypeTest__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2010:1: ( ( ( rule__DataTypeTest__Group_22__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2011:1: ( ( rule__DataTypeTest__Group_22__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2011:1: ( ( rule__DataTypeTest__Group_22__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2012:1: ( rule__DataTypeTest__Group_22__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_22()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2013:1: ( rule__DataTypeTest__Group_22__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==74) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2013:2: rule__DataTypeTest__Group_22__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_22__0_in_rule__DataTypeTest__Group__22__Impl4105);
                    rule__DataTypeTest__Group_22__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__22__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__23"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2023:1: rule__DataTypeTest__Group__23 : rule__DataTypeTest__Group__23__Impl rule__DataTypeTest__Group__24 ;
    public final void rule__DataTypeTest__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2027:1: ( rule__DataTypeTest__Group__23__Impl rule__DataTypeTest__Group__24 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2028:2: rule__DataTypeTest__Group__23__Impl rule__DataTypeTest__Group__24
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__23__Impl_in_rule__DataTypeTest__Group__234136);
            rule__DataTypeTest__Group__23__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__24_in_rule__DataTypeTest__Group__234139);
            rule__DataTypeTest__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__23"


    // $ANTLR start "rule__DataTypeTest__Group__23__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2035:1: rule__DataTypeTest__Group__23__Impl : ( ( rule__DataTypeTest__Group_23__0 )? ) ;
    public final void rule__DataTypeTest__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2039:1: ( ( ( rule__DataTypeTest__Group_23__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2040:1: ( ( rule__DataTypeTest__Group_23__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2040:1: ( ( rule__DataTypeTest__Group_23__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2041:1: ( rule__DataTypeTest__Group_23__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_23()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2042:1: ( rule__DataTypeTest__Group_23__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==75) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2042:2: rule__DataTypeTest__Group_23__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_23__0_in_rule__DataTypeTest__Group__23__Impl4166);
                    rule__DataTypeTest__Group_23__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__23__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__24"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2052:1: rule__DataTypeTest__Group__24 : rule__DataTypeTest__Group__24__Impl rule__DataTypeTest__Group__25 ;
    public final void rule__DataTypeTest__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2056:1: ( rule__DataTypeTest__Group__24__Impl rule__DataTypeTest__Group__25 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2057:2: rule__DataTypeTest__Group__24__Impl rule__DataTypeTest__Group__25
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__24__Impl_in_rule__DataTypeTest__Group__244197);
            rule__DataTypeTest__Group__24__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__25_in_rule__DataTypeTest__Group__244200);
            rule__DataTypeTest__Group__25();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__24"


    // $ANTLR start "rule__DataTypeTest__Group__24__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2064:1: rule__DataTypeTest__Group__24__Impl : ( ( rule__DataTypeTest__Group_24__0 )? ) ;
    public final void rule__DataTypeTest__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2068:1: ( ( ( rule__DataTypeTest__Group_24__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2069:1: ( ( rule__DataTypeTest__Group_24__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2069:1: ( ( rule__DataTypeTest__Group_24__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2070:1: ( rule__DataTypeTest__Group_24__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_24()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2071:1: ( rule__DataTypeTest__Group_24__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==76) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2071:2: rule__DataTypeTest__Group_24__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_24__0_in_rule__DataTypeTest__Group__24__Impl4227);
                    rule__DataTypeTest__Group_24__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__24__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__25"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2081:1: rule__DataTypeTest__Group__25 : rule__DataTypeTest__Group__25__Impl rule__DataTypeTest__Group__26 ;
    public final void rule__DataTypeTest__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2085:1: ( rule__DataTypeTest__Group__25__Impl rule__DataTypeTest__Group__26 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2086:2: rule__DataTypeTest__Group__25__Impl rule__DataTypeTest__Group__26
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__25__Impl_in_rule__DataTypeTest__Group__254258);
            rule__DataTypeTest__Group__25__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__26_in_rule__DataTypeTest__Group__254261);
            rule__DataTypeTest__Group__26();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__25"


    // $ANTLR start "rule__DataTypeTest__Group__25__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2093:1: rule__DataTypeTest__Group__25__Impl : ( ( rule__DataTypeTest__Group_25__0 )? ) ;
    public final void rule__DataTypeTest__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2097:1: ( ( ( rule__DataTypeTest__Group_25__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2098:1: ( ( rule__DataTypeTest__Group_25__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2098:1: ( ( rule__DataTypeTest__Group_25__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2099:1: ( rule__DataTypeTest__Group_25__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_25()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2100:1: ( rule__DataTypeTest__Group_25__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==77) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2100:2: rule__DataTypeTest__Group_25__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_25__0_in_rule__DataTypeTest__Group__25__Impl4288);
                    rule__DataTypeTest__Group_25__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_25()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__25__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__26"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2110:1: rule__DataTypeTest__Group__26 : rule__DataTypeTest__Group__26__Impl rule__DataTypeTest__Group__27 ;
    public final void rule__DataTypeTest__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2114:1: ( rule__DataTypeTest__Group__26__Impl rule__DataTypeTest__Group__27 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2115:2: rule__DataTypeTest__Group__26__Impl rule__DataTypeTest__Group__27
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__26__Impl_in_rule__DataTypeTest__Group__264319);
            rule__DataTypeTest__Group__26__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__27_in_rule__DataTypeTest__Group__264322);
            rule__DataTypeTest__Group__27();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__26"


    // $ANTLR start "rule__DataTypeTest__Group__26__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2122:1: rule__DataTypeTest__Group__26__Impl : ( ( rule__DataTypeTest__Group_26__0 )? ) ;
    public final void rule__DataTypeTest__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2126:1: ( ( ( rule__DataTypeTest__Group_26__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2127:1: ( ( rule__DataTypeTest__Group_26__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2127:1: ( ( rule__DataTypeTest__Group_26__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2128:1: ( rule__DataTypeTest__Group_26__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_26()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2129:1: ( rule__DataTypeTest__Group_26__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==78) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2129:2: rule__DataTypeTest__Group_26__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_26__0_in_rule__DataTypeTest__Group__26__Impl4349);
                    rule__DataTypeTest__Group_26__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_26()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__26__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__27"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2139:1: rule__DataTypeTest__Group__27 : rule__DataTypeTest__Group__27__Impl rule__DataTypeTest__Group__28 ;
    public final void rule__DataTypeTest__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2143:1: ( rule__DataTypeTest__Group__27__Impl rule__DataTypeTest__Group__28 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2144:2: rule__DataTypeTest__Group__27__Impl rule__DataTypeTest__Group__28
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__27__Impl_in_rule__DataTypeTest__Group__274380);
            rule__DataTypeTest__Group__27__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__28_in_rule__DataTypeTest__Group__274383);
            rule__DataTypeTest__Group__28();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__27"


    // $ANTLR start "rule__DataTypeTest__Group__27__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2151:1: rule__DataTypeTest__Group__27__Impl : ( ( rule__DataTypeTest__Group_27__0 )? ) ;
    public final void rule__DataTypeTest__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2155:1: ( ( ( rule__DataTypeTest__Group_27__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2156:1: ( ( rule__DataTypeTest__Group_27__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2156:1: ( ( rule__DataTypeTest__Group_27__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2157:1: ( rule__DataTypeTest__Group_27__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_27()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2158:1: ( rule__DataTypeTest__Group_27__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==79) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2158:2: rule__DataTypeTest__Group_27__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_27__0_in_rule__DataTypeTest__Group__27__Impl4410);
                    rule__DataTypeTest__Group_27__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_27()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__27__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__28"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2168:1: rule__DataTypeTest__Group__28 : rule__DataTypeTest__Group__28__Impl rule__DataTypeTest__Group__29 ;
    public final void rule__DataTypeTest__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2172:1: ( rule__DataTypeTest__Group__28__Impl rule__DataTypeTest__Group__29 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2173:2: rule__DataTypeTest__Group__28__Impl rule__DataTypeTest__Group__29
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__28__Impl_in_rule__DataTypeTest__Group__284441);
            rule__DataTypeTest__Group__28__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__29_in_rule__DataTypeTest__Group__284444);
            rule__DataTypeTest__Group__29();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__28"


    // $ANTLR start "rule__DataTypeTest__Group__28__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2180:1: rule__DataTypeTest__Group__28__Impl : ( ( rule__DataTypeTest__Group_28__0 )? ) ;
    public final void rule__DataTypeTest__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2184:1: ( ( ( rule__DataTypeTest__Group_28__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2185:1: ( ( rule__DataTypeTest__Group_28__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2185:1: ( ( rule__DataTypeTest__Group_28__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2186:1: ( rule__DataTypeTest__Group_28__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_28()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2187:1: ( rule__DataTypeTest__Group_28__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==80) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2187:2: rule__DataTypeTest__Group_28__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_28__0_in_rule__DataTypeTest__Group__28__Impl4471);
                    rule__DataTypeTest__Group_28__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_28()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__28__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__29"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2197:1: rule__DataTypeTest__Group__29 : rule__DataTypeTest__Group__29__Impl rule__DataTypeTest__Group__30 ;
    public final void rule__DataTypeTest__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2201:1: ( rule__DataTypeTest__Group__29__Impl rule__DataTypeTest__Group__30 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2202:2: rule__DataTypeTest__Group__29__Impl rule__DataTypeTest__Group__30
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__29__Impl_in_rule__DataTypeTest__Group__294502);
            rule__DataTypeTest__Group__29__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__30_in_rule__DataTypeTest__Group__294505);
            rule__DataTypeTest__Group__30();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__29"


    // $ANTLR start "rule__DataTypeTest__Group__29__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2209:1: rule__DataTypeTest__Group__29__Impl : ( ( rule__DataTypeTest__Group_29__0 )? ) ;
    public final void rule__DataTypeTest__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2213:1: ( ( ( rule__DataTypeTest__Group_29__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2214:1: ( ( rule__DataTypeTest__Group_29__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2214:1: ( ( rule__DataTypeTest__Group_29__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2215:1: ( rule__DataTypeTest__Group_29__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_29()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2216:1: ( rule__DataTypeTest__Group_29__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==81) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2216:2: rule__DataTypeTest__Group_29__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_29__0_in_rule__DataTypeTest__Group__29__Impl4532);
                    rule__DataTypeTest__Group_29__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_29()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__29__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__30"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2226:1: rule__DataTypeTest__Group__30 : rule__DataTypeTest__Group__30__Impl rule__DataTypeTest__Group__31 ;
    public final void rule__DataTypeTest__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2230:1: ( rule__DataTypeTest__Group__30__Impl rule__DataTypeTest__Group__31 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2231:2: rule__DataTypeTest__Group__30__Impl rule__DataTypeTest__Group__31
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__30__Impl_in_rule__DataTypeTest__Group__304563);
            rule__DataTypeTest__Group__30__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__31_in_rule__DataTypeTest__Group__304566);
            rule__DataTypeTest__Group__31();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__30"


    // $ANTLR start "rule__DataTypeTest__Group__30__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2238:1: rule__DataTypeTest__Group__30__Impl : ( ( rule__DataTypeTest__Group_30__0 )? ) ;
    public final void rule__DataTypeTest__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2242:1: ( ( ( rule__DataTypeTest__Group_30__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2243:1: ( ( rule__DataTypeTest__Group_30__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2243:1: ( ( rule__DataTypeTest__Group_30__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2244:1: ( rule__DataTypeTest__Group_30__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_30()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2245:1: ( rule__DataTypeTest__Group_30__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==82) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2245:2: rule__DataTypeTest__Group_30__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_30__0_in_rule__DataTypeTest__Group__30__Impl4593);
                    rule__DataTypeTest__Group_30__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_30()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__30__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__31"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2255:1: rule__DataTypeTest__Group__31 : rule__DataTypeTest__Group__31__Impl rule__DataTypeTest__Group__32 ;
    public final void rule__DataTypeTest__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2259:1: ( rule__DataTypeTest__Group__31__Impl rule__DataTypeTest__Group__32 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2260:2: rule__DataTypeTest__Group__31__Impl rule__DataTypeTest__Group__32
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__31__Impl_in_rule__DataTypeTest__Group__314624);
            rule__DataTypeTest__Group__31__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__32_in_rule__DataTypeTest__Group__314627);
            rule__DataTypeTest__Group__32();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__31"


    // $ANTLR start "rule__DataTypeTest__Group__31__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2267:1: rule__DataTypeTest__Group__31__Impl : ( ( rule__DataTypeTest__Group_31__0 )? ) ;
    public final void rule__DataTypeTest__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2271:1: ( ( ( rule__DataTypeTest__Group_31__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2272:1: ( ( rule__DataTypeTest__Group_31__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2272:1: ( ( rule__DataTypeTest__Group_31__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2273:1: ( rule__DataTypeTest__Group_31__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_31()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2274:1: ( rule__DataTypeTest__Group_31__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==83) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2274:2: rule__DataTypeTest__Group_31__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_31__0_in_rule__DataTypeTest__Group__31__Impl4654);
                    rule__DataTypeTest__Group_31__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_31()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__31__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__32"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2284:1: rule__DataTypeTest__Group__32 : rule__DataTypeTest__Group__32__Impl rule__DataTypeTest__Group__33 ;
    public final void rule__DataTypeTest__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2288:1: ( rule__DataTypeTest__Group__32__Impl rule__DataTypeTest__Group__33 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2289:2: rule__DataTypeTest__Group__32__Impl rule__DataTypeTest__Group__33
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__32__Impl_in_rule__DataTypeTest__Group__324685);
            rule__DataTypeTest__Group__32__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__33_in_rule__DataTypeTest__Group__324688);
            rule__DataTypeTest__Group__33();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__32"


    // $ANTLR start "rule__DataTypeTest__Group__32__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2296:1: rule__DataTypeTest__Group__32__Impl : ( ( rule__DataTypeTest__Group_32__0 )? ) ;
    public final void rule__DataTypeTest__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2300:1: ( ( ( rule__DataTypeTest__Group_32__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2301:1: ( ( rule__DataTypeTest__Group_32__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2301:1: ( ( rule__DataTypeTest__Group_32__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2302:1: ( rule__DataTypeTest__Group_32__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_32()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2303:1: ( rule__DataTypeTest__Group_32__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==84) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2303:2: rule__DataTypeTest__Group_32__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_32__0_in_rule__DataTypeTest__Group__32__Impl4715);
                    rule__DataTypeTest__Group_32__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_32()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__32__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__33"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2313:1: rule__DataTypeTest__Group__33 : rule__DataTypeTest__Group__33__Impl rule__DataTypeTest__Group__34 ;
    public final void rule__DataTypeTest__Group__33() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2317:1: ( rule__DataTypeTest__Group__33__Impl rule__DataTypeTest__Group__34 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2318:2: rule__DataTypeTest__Group__33__Impl rule__DataTypeTest__Group__34
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__33__Impl_in_rule__DataTypeTest__Group__334746);
            rule__DataTypeTest__Group__33__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__34_in_rule__DataTypeTest__Group__334749);
            rule__DataTypeTest__Group__34();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__33"


    // $ANTLR start "rule__DataTypeTest__Group__33__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2325:1: rule__DataTypeTest__Group__33__Impl : ( ( rule__DataTypeTest__Group_33__0 )? ) ;
    public final void rule__DataTypeTest__Group__33__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2329:1: ( ( ( rule__DataTypeTest__Group_33__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2330:1: ( ( rule__DataTypeTest__Group_33__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2330:1: ( ( rule__DataTypeTest__Group_33__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2331:1: ( rule__DataTypeTest__Group_33__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_33()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2332:1: ( rule__DataTypeTest__Group_33__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==85) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2332:2: rule__DataTypeTest__Group_33__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_33__0_in_rule__DataTypeTest__Group__33__Impl4776);
                    rule__DataTypeTest__Group_33__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_33()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__33__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__34"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2342:1: rule__DataTypeTest__Group__34 : rule__DataTypeTest__Group__34__Impl rule__DataTypeTest__Group__35 ;
    public final void rule__DataTypeTest__Group__34() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2346:1: ( rule__DataTypeTest__Group__34__Impl rule__DataTypeTest__Group__35 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2347:2: rule__DataTypeTest__Group__34__Impl rule__DataTypeTest__Group__35
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__34__Impl_in_rule__DataTypeTest__Group__344807);
            rule__DataTypeTest__Group__34__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__35_in_rule__DataTypeTest__Group__344810);
            rule__DataTypeTest__Group__35();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__34"


    // $ANTLR start "rule__DataTypeTest__Group__34__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2354:1: rule__DataTypeTest__Group__34__Impl : ( ( rule__DataTypeTest__Group_34__0 )? ) ;
    public final void rule__DataTypeTest__Group__34__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2358:1: ( ( ( rule__DataTypeTest__Group_34__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2359:1: ( ( rule__DataTypeTest__Group_34__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2359:1: ( ( rule__DataTypeTest__Group_34__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2360:1: ( rule__DataTypeTest__Group_34__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_34()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2361:1: ( rule__DataTypeTest__Group_34__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==86) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2361:2: rule__DataTypeTest__Group_34__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_34__0_in_rule__DataTypeTest__Group__34__Impl4837);
                    rule__DataTypeTest__Group_34__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_34()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__34__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__35"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2371:1: rule__DataTypeTest__Group__35 : rule__DataTypeTest__Group__35__Impl rule__DataTypeTest__Group__36 ;
    public final void rule__DataTypeTest__Group__35() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2375:1: ( rule__DataTypeTest__Group__35__Impl rule__DataTypeTest__Group__36 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2376:2: rule__DataTypeTest__Group__35__Impl rule__DataTypeTest__Group__36
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__35__Impl_in_rule__DataTypeTest__Group__354868);
            rule__DataTypeTest__Group__35__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__36_in_rule__DataTypeTest__Group__354871);
            rule__DataTypeTest__Group__36();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__35"


    // $ANTLR start "rule__DataTypeTest__Group__35__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2383:1: rule__DataTypeTest__Group__35__Impl : ( ( rule__DataTypeTest__Group_35__0 )? ) ;
    public final void rule__DataTypeTest__Group__35__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2387:1: ( ( ( rule__DataTypeTest__Group_35__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2388:1: ( ( rule__DataTypeTest__Group_35__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2388:1: ( ( rule__DataTypeTest__Group_35__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2389:1: ( rule__DataTypeTest__Group_35__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_35()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2390:1: ( rule__DataTypeTest__Group_35__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==87) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2390:2: rule__DataTypeTest__Group_35__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_35__0_in_rule__DataTypeTest__Group__35__Impl4898);
                    rule__DataTypeTest__Group_35__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_35()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__35__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__36"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2400:1: rule__DataTypeTest__Group__36 : rule__DataTypeTest__Group__36__Impl rule__DataTypeTest__Group__37 ;
    public final void rule__DataTypeTest__Group__36() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2404:1: ( rule__DataTypeTest__Group__36__Impl rule__DataTypeTest__Group__37 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2405:2: rule__DataTypeTest__Group__36__Impl rule__DataTypeTest__Group__37
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__36__Impl_in_rule__DataTypeTest__Group__364929);
            rule__DataTypeTest__Group__36__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__37_in_rule__DataTypeTest__Group__364932);
            rule__DataTypeTest__Group__37();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__36"


    // $ANTLR start "rule__DataTypeTest__Group__36__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2412:1: rule__DataTypeTest__Group__36__Impl : ( ( rule__DataTypeTest__Group_36__0 )? ) ;
    public final void rule__DataTypeTest__Group__36__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2416:1: ( ( ( rule__DataTypeTest__Group_36__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2417:1: ( ( rule__DataTypeTest__Group_36__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2417:1: ( ( rule__DataTypeTest__Group_36__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2418:1: ( rule__DataTypeTest__Group_36__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_36()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2419:1: ( rule__DataTypeTest__Group_36__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==88) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2419:2: rule__DataTypeTest__Group_36__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_36__0_in_rule__DataTypeTest__Group__36__Impl4959);
                    rule__DataTypeTest__Group_36__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_36()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__36__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__37"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2429:1: rule__DataTypeTest__Group__37 : rule__DataTypeTest__Group__37__Impl rule__DataTypeTest__Group__38 ;
    public final void rule__DataTypeTest__Group__37() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2433:1: ( rule__DataTypeTest__Group__37__Impl rule__DataTypeTest__Group__38 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2434:2: rule__DataTypeTest__Group__37__Impl rule__DataTypeTest__Group__38
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__37__Impl_in_rule__DataTypeTest__Group__374990);
            rule__DataTypeTest__Group__37__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__38_in_rule__DataTypeTest__Group__374993);
            rule__DataTypeTest__Group__38();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__37"


    // $ANTLR start "rule__DataTypeTest__Group__37__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2441:1: rule__DataTypeTest__Group__37__Impl : ( ( rule__DataTypeTest__Group_37__0 )? ) ;
    public final void rule__DataTypeTest__Group__37__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2445:1: ( ( ( rule__DataTypeTest__Group_37__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2446:1: ( ( rule__DataTypeTest__Group_37__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2446:1: ( ( rule__DataTypeTest__Group_37__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2447:1: ( rule__DataTypeTest__Group_37__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_37()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2448:1: ( rule__DataTypeTest__Group_37__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==89) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2448:2: rule__DataTypeTest__Group_37__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_37__0_in_rule__DataTypeTest__Group__37__Impl5020);
                    rule__DataTypeTest__Group_37__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_37()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__37__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__38"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2458:1: rule__DataTypeTest__Group__38 : rule__DataTypeTest__Group__38__Impl rule__DataTypeTest__Group__39 ;
    public final void rule__DataTypeTest__Group__38() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2462:1: ( rule__DataTypeTest__Group__38__Impl rule__DataTypeTest__Group__39 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2463:2: rule__DataTypeTest__Group__38__Impl rule__DataTypeTest__Group__39
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__38__Impl_in_rule__DataTypeTest__Group__385051);
            rule__DataTypeTest__Group__38__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__39_in_rule__DataTypeTest__Group__385054);
            rule__DataTypeTest__Group__39();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__38"


    // $ANTLR start "rule__DataTypeTest__Group__38__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2470:1: rule__DataTypeTest__Group__38__Impl : ( ( rule__DataTypeTest__Group_38__0 )? ) ;
    public final void rule__DataTypeTest__Group__38__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2474:1: ( ( ( rule__DataTypeTest__Group_38__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2475:1: ( ( rule__DataTypeTest__Group_38__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2475:1: ( ( rule__DataTypeTest__Group_38__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2476:1: ( rule__DataTypeTest__Group_38__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_38()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2477:1: ( rule__DataTypeTest__Group_38__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==90) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2477:2: rule__DataTypeTest__Group_38__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_38__0_in_rule__DataTypeTest__Group__38__Impl5081);
                    rule__DataTypeTest__Group_38__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_38()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__38__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__39"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2487:1: rule__DataTypeTest__Group__39 : rule__DataTypeTest__Group__39__Impl rule__DataTypeTest__Group__40 ;
    public final void rule__DataTypeTest__Group__39() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2491:1: ( rule__DataTypeTest__Group__39__Impl rule__DataTypeTest__Group__40 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2492:2: rule__DataTypeTest__Group__39__Impl rule__DataTypeTest__Group__40
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__39__Impl_in_rule__DataTypeTest__Group__395112);
            rule__DataTypeTest__Group__39__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__40_in_rule__DataTypeTest__Group__395115);
            rule__DataTypeTest__Group__40();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__39"


    // $ANTLR start "rule__DataTypeTest__Group__39__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2499:1: rule__DataTypeTest__Group__39__Impl : ( ( rule__DataTypeTest__Group_39__0 )? ) ;
    public final void rule__DataTypeTest__Group__39__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2503:1: ( ( ( rule__DataTypeTest__Group_39__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2504:1: ( ( rule__DataTypeTest__Group_39__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2504:1: ( ( rule__DataTypeTest__Group_39__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2505:1: ( rule__DataTypeTest__Group_39__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_39()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2506:1: ( rule__DataTypeTest__Group_39__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==91) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2506:2: rule__DataTypeTest__Group_39__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_39__0_in_rule__DataTypeTest__Group__39__Impl5142);
                    rule__DataTypeTest__Group_39__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_39()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__39__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__40"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2516:1: rule__DataTypeTest__Group__40 : rule__DataTypeTest__Group__40__Impl rule__DataTypeTest__Group__41 ;
    public final void rule__DataTypeTest__Group__40() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2520:1: ( rule__DataTypeTest__Group__40__Impl rule__DataTypeTest__Group__41 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2521:2: rule__DataTypeTest__Group__40__Impl rule__DataTypeTest__Group__41
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__40__Impl_in_rule__DataTypeTest__Group__405173);
            rule__DataTypeTest__Group__40__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__41_in_rule__DataTypeTest__Group__405176);
            rule__DataTypeTest__Group__41();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__40"


    // $ANTLR start "rule__DataTypeTest__Group__40__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2528:1: rule__DataTypeTest__Group__40__Impl : ( ( rule__DataTypeTest__Group_40__0 )? ) ;
    public final void rule__DataTypeTest__Group__40__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2532:1: ( ( ( rule__DataTypeTest__Group_40__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2533:1: ( ( rule__DataTypeTest__Group_40__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2533:1: ( ( rule__DataTypeTest__Group_40__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2534:1: ( rule__DataTypeTest__Group_40__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_40()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2535:1: ( rule__DataTypeTest__Group_40__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==92) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2535:2: rule__DataTypeTest__Group_40__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_40__0_in_rule__DataTypeTest__Group__40__Impl5203);
                    rule__DataTypeTest__Group_40__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_40()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__40__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__41"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2545:1: rule__DataTypeTest__Group__41 : rule__DataTypeTest__Group__41__Impl rule__DataTypeTest__Group__42 ;
    public final void rule__DataTypeTest__Group__41() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2549:1: ( rule__DataTypeTest__Group__41__Impl rule__DataTypeTest__Group__42 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2550:2: rule__DataTypeTest__Group__41__Impl rule__DataTypeTest__Group__42
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__41__Impl_in_rule__DataTypeTest__Group__415234);
            rule__DataTypeTest__Group__41__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__42_in_rule__DataTypeTest__Group__415237);
            rule__DataTypeTest__Group__42();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__41"


    // $ANTLR start "rule__DataTypeTest__Group__41__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2557:1: rule__DataTypeTest__Group__41__Impl : ( ( rule__DataTypeTest__Group_41__0 )? ) ;
    public final void rule__DataTypeTest__Group__41__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2561:1: ( ( ( rule__DataTypeTest__Group_41__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2562:1: ( ( rule__DataTypeTest__Group_41__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2562:1: ( ( rule__DataTypeTest__Group_41__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2563:1: ( rule__DataTypeTest__Group_41__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_41()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2564:1: ( rule__DataTypeTest__Group_41__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==93) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2564:2: rule__DataTypeTest__Group_41__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_41__0_in_rule__DataTypeTest__Group__41__Impl5264);
                    rule__DataTypeTest__Group_41__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_41()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__41__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__42"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2574:1: rule__DataTypeTest__Group__42 : rule__DataTypeTest__Group__42__Impl rule__DataTypeTest__Group__43 ;
    public final void rule__DataTypeTest__Group__42() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2578:1: ( rule__DataTypeTest__Group__42__Impl rule__DataTypeTest__Group__43 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2579:2: rule__DataTypeTest__Group__42__Impl rule__DataTypeTest__Group__43
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__42__Impl_in_rule__DataTypeTest__Group__425295);
            rule__DataTypeTest__Group__42__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__43_in_rule__DataTypeTest__Group__425298);
            rule__DataTypeTest__Group__43();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__42"


    // $ANTLR start "rule__DataTypeTest__Group__42__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2586:1: rule__DataTypeTest__Group__42__Impl : ( ( rule__DataTypeTest__Group_42__0 )? ) ;
    public final void rule__DataTypeTest__Group__42__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2590:1: ( ( ( rule__DataTypeTest__Group_42__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2591:1: ( ( rule__DataTypeTest__Group_42__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2591:1: ( ( rule__DataTypeTest__Group_42__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2592:1: ( rule__DataTypeTest__Group_42__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_42()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2593:1: ( rule__DataTypeTest__Group_42__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==94) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2593:2: rule__DataTypeTest__Group_42__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_42__0_in_rule__DataTypeTest__Group__42__Impl5325);
                    rule__DataTypeTest__Group_42__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_42()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__42__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__43"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2603:1: rule__DataTypeTest__Group__43 : rule__DataTypeTest__Group__43__Impl rule__DataTypeTest__Group__44 ;
    public final void rule__DataTypeTest__Group__43() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2607:1: ( rule__DataTypeTest__Group__43__Impl rule__DataTypeTest__Group__44 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2608:2: rule__DataTypeTest__Group__43__Impl rule__DataTypeTest__Group__44
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__43__Impl_in_rule__DataTypeTest__Group__435356);
            rule__DataTypeTest__Group__43__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__44_in_rule__DataTypeTest__Group__435359);
            rule__DataTypeTest__Group__44();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__43"


    // $ANTLR start "rule__DataTypeTest__Group__43__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2615:1: rule__DataTypeTest__Group__43__Impl : ( ( rule__DataTypeTest__Group_43__0 )? ) ;
    public final void rule__DataTypeTest__Group__43__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2619:1: ( ( ( rule__DataTypeTest__Group_43__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2620:1: ( ( rule__DataTypeTest__Group_43__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2620:1: ( ( rule__DataTypeTest__Group_43__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2621:1: ( rule__DataTypeTest__Group_43__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_43()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2622:1: ( rule__DataTypeTest__Group_43__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==95) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2622:2: rule__DataTypeTest__Group_43__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_43__0_in_rule__DataTypeTest__Group__43__Impl5386);
                    rule__DataTypeTest__Group_43__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_43()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__43__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__44"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2632:1: rule__DataTypeTest__Group__44 : rule__DataTypeTest__Group__44__Impl rule__DataTypeTest__Group__45 ;
    public final void rule__DataTypeTest__Group__44() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2636:1: ( rule__DataTypeTest__Group__44__Impl rule__DataTypeTest__Group__45 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2637:2: rule__DataTypeTest__Group__44__Impl rule__DataTypeTest__Group__45
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__44__Impl_in_rule__DataTypeTest__Group__445417);
            rule__DataTypeTest__Group__44__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__45_in_rule__DataTypeTest__Group__445420);
            rule__DataTypeTest__Group__45();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__44"


    // $ANTLR start "rule__DataTypeTest__Group__44__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2644:1: rule__DataTypeTest__Group__44__Impl : ( ( rule__DataTypeTest__Group_44__0 )? ) ;
    public final void rule__DataTypeTest__Group__44__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2648:1: ( ( ( rule__DataTypeTest__Group_44__0 )? ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2649:1: ( ( rule__DataTypeTest__Group_44__0 )? )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2649:1: ( ( rule__DataTypeTest__Group_44__0 )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2650:1: ( rule__DataTypeTest__Group_44__0 )?
            {
             before(grammarAccess.getDataTypeTestAccess().getGroup_44()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2651:1: ( rule__DataTypeTest__Group_44__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==96) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2651:2: rule__DataTypeTest__Group_44__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_44__0_in_rule__DataTypeTest__Group__44__Impl5447);
                    rule__DataTypeTest__Group_44__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeTestAccess().getGroup_44()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__44__Impl"


    // $ANTLR start "rule__DataTypeTest__Group__45"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2661:1: rule__DataTypeTest__Group__45 : rule__DataTypeTest__Group__45__Impl ;
    public final void rule__DataTypeTest__Group__45() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2665:1: ( rule__DataTypeTest__Group__45__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2666:2: rule__DataTypeTest__Group__45__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group__45__Impl_in_rule__DataTypeTest__Group__455478);
            rule__DataTypeTest__Group__45__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__45"


    // $ANTLR start "rule__DataTypeTest__Group__45__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2672:1: rule__DataTypeTest__Group__45__Impl : ( '}' ) ;
    public final void rule__DataTypeTest__Group__45__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2676:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2677:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2677:1: ( '}' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2678:1: '}'
            {
             before(grammarAccess.getDataTypeTestAccess().getRightCurlyBracketKeyword_45()); 
            match(input,55,FollowSets000.FOLLOW_55_in_rule__DataTypeTest__Group__45__Impl5506); 
             after(grammarAccess.getDataTypeTestAccess().getRightCurlyBracketKeyword_45()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group__45__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_4__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2783:1: rule__DataTypeTest__Group_4__0 : rule__DataTypeTest__Group_4__0__Impl rule__DataTypeTest__Group_4__1 ;
    public final void rule__DataTypeTest__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2787:1: ( rule__DataTypeTest__Group_4__0__Impl rule__DataTypeTest__Group_4__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2788:2: rule__DataTypeTest__Group_4__0__Impl rule__DataTypeTest__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_4__0__Impl_in_rule__DataTypeTest__Group_4__05629);
            rule__DataTypeTest__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_4__1_in_rule__DataTypeTest__Group_4__05632);
            rule__DataTypeTest__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_4__0"


    // $ANTLR start "rule__DataTypeTest__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2795:1: rule__DataTypeTest__Group_4__0__Impl : ( 'aAnySimpleType' ) ;
    public final void rule__DataTypeTest__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2799:1: ( ( 'aAnySimpleType' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2800:1: ( 'aAnySimpleType' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2800:1: ( 'aAnySimpleType' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2801:1: 'aAnySimpleType'
            {
             before(grammarAccess.getDataTypeTestAccess().getAAnySimpleTypeKeyword_4_0()); 
            match(input,56,FollowSets000.FOLLOW_56_in_rule__DataTypeTest__Group_4__0__Impl5660); 
             after(grammarAccess.getDataTypeTestAccess().getAAnySimpleTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_4__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_4__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2814:1: rule__DataTypeTest__Group_4__1 : rule__DataTypeTest__Group_4__1__Impl ;
    public final void rule__DataTypeTest__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2818:1: ( rule__DataTypeTest__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2819:2: rule__DataTypeTest__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_4__1__Impl_in_rule__DataTypeTest__Group_4__15691);
            rule__DataTypeTest__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_4__1"


    // $ANTLR start "rule__DataTypeTest__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2825:1: rule__DataTypeTest__Group_4__1__Impl : ( ( rule__DataTypeTest__AAnySimpleTypeAssignment_4_1 ) ) ;
    public final void rule__DataTypeTest__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2829:1: ( ( ( rule__DataTypeTest__AAnySimpleTypeAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2830:1: ( ( rule__DataTypeTest__AAnySimpleTypeAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2830:1: ( ( rule__DataTypeTest__AAnySimpleTypeAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2831:1: ( rule__DataTypeTest__AAnySimpleTypeAssignment_4_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getAAnySimpleTypeAssignment_4_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2832:1: ( rule__DataTypeTest__AAnySimpleTypeAssignment_4_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2832:2: rule__DataTypeTest__AAnySimpleTypeAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__AAnySimpleTypeAssignment_4_1_in_rule__DataTypeTest__Group_4__1__Impl5718);
            rule__DataTypeTest__AAnySimpleTypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getAAnySimpleTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_4__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_5__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2846:1: rule__DataTypeTest__Group_5__0 : rule__DataTypeTest__Group_5__0__Impl rule__DataTypeTest__Group_5__1 ;
    public final void rule__DataTypeTest__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2850:1: ( rule__DataTypeTest__Group_5__0__Impl rule__DataTypeTest__Group_5__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2851:2: rule__DataTypeTest__Group_5__0__Impl rule__DataTypeTest__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_5__0__Impl_in_rule__DataTypeTest__Group_5__05752);
            rule__DataTypeTest__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_5__1_in_rule__DataTypeTest__Group_5__05755);
            rule__DataTypeTest__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_5__0"


    // $ANTLR start "rule__DataTypeTest__Group_5__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2858:1: rule__DataTypeTest__Group_5__0__Impl : ( 'aAnyURI' ) ;
    public final void rule__DataTypeTest__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2862:1: ( ( 'aAnyURI' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2863:1: ( 'aAnyURI' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2863:1: ( 'aAnyURI' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2864:1: 'aAnyURI'
            {
             before(grammarAccess.getDataTypeTestAccess().getAAnyURIKeyword_5_0()); 
            match(input,57,FollowSets000.FOLLOW_57_in_rule__DataTypeTest__Group_5__0__Impl5783); 
             after(grammarAccess.getDataTypeTestAccess().getAAnyURIKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_5__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_5__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2877:1: rule__DataTypeTest__Group_5__1 : rule__DataTypeTest__Group_5__1__Impl ;
    public final void rule__DataTypeTest__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2881:1: ( rule__DataTypeTest__Group_5__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2882:2: rule__DataTypeTest__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_5__1__Impl_in_rule__DataTypeTest__Group_5__15814);
            rule__DataTypeTest__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_5__1"


    // $ANTLR start "rule__DataTypeTest__Group_5__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2888:1: rule__DataTypeTest__Group_5__1__Impl : ( ( rule__DataTypeTest__AAnyURIAssignment_5_1 ) ) ;
    public final void rule__DataTypeTest__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2892:1: ( ( ( rule__DataTypeTest__AAnyURIAssignment_5_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2893:1: ( ( rule__DataTypeTest__AAnyURIAssignment_5_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2893:1: ( ( rule__DataTypeTest__AAnyURIAssignment_5_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2894:1: ( rule__DataTypeTest__AAnyURIAssignment_5_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getAAnyURIAssignment_5_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2895:1: ( rule__DataTypeTest__AAnyURIAssignment_5_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2895:2: rule__DataTypeTest__AAnyURIAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__AAnyURIAssignment_5_1_in_rule__DataTypeTest__Group_5__1__Impl5841);
            rule__DataTypeTest__AAnyURIAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getAAnyURIAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_5__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_6__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2909:1: rule__DataTypeTest__Group_6__0 : rule__DataTypeTest__Group_6__0__Impl rule__DataTypeTest__Group_6__1 ;
    public final void rule__DataTypeTest__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2913:1: ( rule__DataTypeTest__Group_6__0__Impl rule__DataTypeTest__Group_6__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2914:2: rule__DataTypeTest__Group_6__0__Impl rule__DataTypeTest__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_6__0__Impl_in_rule__DataTypeTest__Group_6__05875);
            rule__DataTypeTest__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_6__1_in_rule__DataTypeTest__Group_6__05878);
            rule__DataTypeTest__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_6__0"


    // $ANTLR start "rule__DataTypeTest__Group_6__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2921:1: rule__DataTypeTest__Group_6__0__Impl : ( 'aBase64Binary' ) ;
    public final void rule__DataTypeTest__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2925:1: ( ( 'aBase64Binary' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2926:1: ( 'aBase64Binary' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2926:1: ( 'aBase64Binary' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2927:1: 'aBase64Binary'
            {
             before(grammarAccess.getDataTypeTestAccess().getABase64BinaryKeyword_6_0()); 
            match(input,58,FollowSets000.FOLLOW_58_in_rule__DataTypeTest__Group_6__0__Impl5906); 
             after(grammarAccess.getDataTypeTestAccess().getABase64BinaryKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_6__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_6__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2940:1: rule__DataTypeTest__Group_6__1 : rule__DataTypeTest__Group_6__1__Impl ;
    public final void rule__DataTypeTest__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2944:1: ( rule__DataTypeTest__Group_6__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2945:2: rule__DataTypeTest__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_6__1__Impl_in_rule__DataTypeTest__Group_6__15937);
            rule__DataTypeTest__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_6__1"


    // $ANTLR start "rule__DataTypeTest__Group_6__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2951:1: rule__DataTypeTest__Group_6__1__Impl : ( ( rule__DataTypeTest__ABase64BinaryAssignment_6_1 ) ) ;
    public final void rule__DataTypeTest__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2955:1: ( ( ( rule__DataTypeTest__ABase64BinaryAssignment_6_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2956:1: ( ( rule__DataTypeTest__ABase64BinaryAssignment_6_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2956:1: ( ( rule__DataTypeTest__ABase64BinaryAssignment_6_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2957:1: ( rule__DataTypeTest__ABase64BinaryAssignment_6_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getABase64BinaryAssignment_6_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2958:1: ( rule__DataTypeTest__ABase64BinaryAssignment_6_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2958:2: rule__DataTypeTest__ABase64BinaryAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__ABase64BinaryAssignment_6_1_in_rule__DataTypeTest__Group_6__1__Impl5964);
            rule__DataTypeTest__ABase64BinaryAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getABase64BinaryAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_6__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_7__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2972:1: rule__DataTypeTest__Group_7__0 : rule__DataTypeTest__Group_7__0__Impl rule__DataTypeTest__Group_7__1 ;
    public final void rule__DataTypeTest__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2976:1: ( rule__DataTypeTest__Group_7__0__Impl rule__DataTypeTest__Group_7__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2977:2: rule__DataTypeTest__Group_7__0__Impl rule__DataTypeTest__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_7__0__Impl_in_rule__DataTypeTest__Group_7__05998);
            rule__DataTypeTest__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_7__1_in_rule__DataTypeTest__Group_7__06001);
            rule__DataTypeTest__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_7__0"


    // $ANTLR start "rule__DataTypeTest__Group_7__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2984:1: rule__DataTypeTest__Group_7__0__Impl : ( 'aBoolean' ) ;
    public final void rule__DataTypeTest__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2988:1: ( ( 'aBoolean' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2989:1: ( 'aBoolean' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2989:1: ( 'aBoolean' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:2990:1: 'aBoolean'
            {
             before(grammarAccess.getDataTypeTestAccess().getABooleanKeyword_7_0()); 
            match(input,59,FollowSets000.FOLLOW_59_in_rule__DataTypeTest__Group_7__0__Impl6029); 
             after(grammarAccess.getDataTypeTestAccess().getABooleanKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_7__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_7__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3003:1: rule__DataTypeTest__Group_7__1 : rule__DataTypeTest__Group_7__1__Impl ;
    public final void rule__DataTypeTest__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3007:1: ( rule__DataTypeTest__Group_7__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3008:2: rule__DataTypeTest__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_7__1__Impl_in_rule__DataTypeTest__Group_7__16060);
            rule__DataTypeTest__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_7__1"


    // $ANTLR start "rule__DataTypeTest__Group_7__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3014:1: rule__DataTypeTest__Group_7__1__Impl : ( ( rule__DataTypeTest__ABooleanAssignment_7_1 ) ) ;
    public final void rule__DataTypeTest__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3018:1: ( ( ( rule__DataTypeTest__ABooleanAssignment_7_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3019:1: ( ( rule__DataTypeTest__ABooleanAssignment_7_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3019:1: ( ( rule__DataTypeTest__ABooleanAssignment_7_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3020:1: ( rule__DataTypeTest__ABooleanAssignment_7_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getABooleanAssignment_7_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3021:1: ( rule__DataTypeTest__ABooleanAssignment_7_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3021:2: rule__DataTypeTest__ABooleanAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__ABooleanAssignment_7_1_in_rule__DataTypeTest__Group_7__1__Impl6087);
            rule__DataTypeTest__ABooleanAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getABooleanAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_7__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_8__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3035:1: rule__DataTypeTest__Group_8__0 : rule__DataTypeTest__Group_8__0__Impl rule__DataTypeTest__Group_8__1 ;
    public final void rule__DataTypeTest__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3039:1: ( rule__DataTypeTest__Group_8__0__Impl rule__DataTypeTest__Group_8__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3040:2: rule__DataTypeTest__Group_8__0__Impl rule__DataTypeTest__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_8__0__Impl_in_rule__DataTypeTest__Group_8__06121);
            rule__DataTypeTest__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_8__1_in_rule__DataTypeTest__Group_8__06124);
            rule__DataTypeTest__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_8__0"


    // $ANTLR start "rule__DataTypeTest__Group_8__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3047:1: rule__DataTypeTest__Group_8__0__Impl : ( 'aByte' ) ;
    public final void rule__DataTypeTest__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3051:1: ( ( 'aByte' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3052:1: ( 'aByte' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3052:1: ( 'aByte' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3053:1: 'aByte'
            {
             before(grammarAccess.getDataTypeTestAccess().getAByteKeyword_8_0()); 
            match(input,60,FollowSets000.FOLLOW_60_in_rule__DataTypeTest__Group_8__0__Impl6152); 
             after(grammarAccess.getDataTypeTestAccess().getAByteKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_8__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_8__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3066:1: rule__DataTypeTest__Group_8__1 : rule__DataTypeTest__Group_8__1__Impl ;
    public final void rule__DataTypeTest__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3070:1: ( rule__DataTypeTest__Group_8__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3071:2: rule__DataTypeTest__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_8__1__Impl_in_rule__DataTypeTest__Group_8__16183);
            rule__DataTypeTest__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_8__1"


    // $ANTLR start "rule__DataTypeTest__Group_8__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3077:1: rule__DataTypeTest__Group_8__1__Impl : ( ( rule__DataTypeTest__AByteAssignment_8_1 ) ) ;
    public final void rule__DataTypeTest__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3081:1: ( ( ( rule__DataTypeTest__AByteAssignment_8_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3082:1: ( ( rule__DataTypeTest__AByteAssignment_8_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3082:1: ( ( rule__DataTypeTest__AByteAssignment_8_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3083:1: ( rule__DataTypeTest__AByteAssignment_8_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getAByteAssignment_8_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3084:1: ( rule__DataTypeTest__AByteAssignment_8_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3084:2: rule__DataTypeTest__AByteAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__AByteAssignment_8_1_in_rule__DataTypeTest__Group_8__1__Impl6210);
            rule__DataTypeTest__AByteAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getAByteAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_8__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_9__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3098:1: rule__DataTypeTest__Group_9__0 : rule__DataTypeTest__Group_9__0__Impl rule__DataTypeTest__Group_9__1 ;
    public final void rule__DataTypeTest__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3102:1: ( rule__DataTypeTest__Group_9__0__Impl rule__DataTypeTest__Group_9__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3103:2: rule__DataTypeTest__Group_9__0__Impl rule__DataTypeTest__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_9__0__Impl_in_rule__DataTypeTest__Group_9__06244);
            rule__DataTypeTest__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_9__1_in_rule__DataTypeTest__Group_9__06247);
            rule__DataTypeTest__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_9__0"


    // $ANTLR start "rule__DataTypeTest__Group_9__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3110:1: rule__DataTypeTest__Group_9__0__Impl : ( 'aDate' ) ;
    public final void rule__DataTypeTest__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3114:1: ( ( 'aDate' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3115:1: ( 'aDate' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3115:1: ( 'aDate' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3116:1: 'aDate'
            {
             before(grammarAccess.getDataTypeTestAccess().getADateKeyword_9_0()); 
            match(input,61,FollowSets000.FOLLOW_61_in_rule__DataTypeTest__Group_9__0__Impl6275); 
             after(grammarAccess.getDataTypeTestAccess().getADateKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_9__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_9__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3129:1: rule__DataTypeTest__Group_9__1 : rule__DataTypeTest__Group_9__1__Impl ;
    public final void rule__DataTypeTest__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3133:1: ( rule__DataTypeTest__Group_9__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3134:2: rule__DataTypeTest__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_9__1__Impl_in_rule__DataTypeTest__Group_9__16306);
            rule__DataTypeTest__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_9__1"


    // $ANTLR start "rule__DataTypeTest__Group_9__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3140:1: rule__DataTypeTest__Group_9__1__Impl : ( ( rule__DataTypeTest__ADateAssignment_9_1 ) ) ;
    public final void rule__DataTypeTest__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3144:1: ( ( ( rule__DataTypeTest__ADateAssignment_9_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3145:1: ( ( rule__DataTypeTest__ADateAssignment_9_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3145:1: ( ( rule__DataTypeTest__ADateAssignment_9_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3146:1: ( rule__DataTypeTest__ADateAssignment_9_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getADateAssignment_9_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3147:1: ( rule__DataTypeTest__ADateAssignment_9_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3147:2: rule__DataTypeTest__ADateAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__ADateAssignment_9_1_in_rule__DataTypeTest__Group_9__1__Impl6333);
            rule__DataTypeTest__ADateAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getADateAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_9__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_10__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3161:1: rule__DataTypeTest__Group_10__0 : rule__DataTypeTest__Group_10__0__Impl rule__DataTypeTest__Group_10__1 ;
    public final void rule__DataTypeTest__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3165:1: ( rule__DataTypeTest__Group_10__0__Impl rule__DataTypeTest__Group_10__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3166:2: rule__DataTypeTest__Group_10__0__Impl rule__DataTypeTest__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_10__0__Impl_in_rule__DataTypeTest__Group_10__06367);
            rule__DataTypeTest__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_10__1_in_rule__DataTypeTest__Group_10__06370);
            rule__DataTypeTest__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_10__0"


    // $ANTLR start "rule__DataTypeTest__Group_10__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3173:1: rule__DataTypeTest__Group_10__0__Impl : ( 'aDateTime' ) ;
    public final void rule__DataTypeTest__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3177:1: ( ( 'aDateTime' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3178:1: ( 'aDateTime' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3178:1: ( 'aDateTime' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3179:1: 'aDateTime'
            {
             before(grammarAccess.getDataTypeTestAccess().getADateTimeKeyword_10_0()); 
            match(input,62,FollowSets000.FOLLOW_62_in_rule__DataTypeTest__Group_10__0__Impl6398); 
             after(grammarAccess.getDataTypeTestAccess().getADateTimeKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_10__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_10__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3192:1: rule__DataTypeTest__Group_10__1 : rule__DataTypeTest__Group_10__1__Impl ;
    public final void rule__DataTypeTest__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3196:1: ( rule__DataTypeTest__Group_10__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3197:2: rule__DataTypeTest__Group_10__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_10__1__Impl_in_rule__DataTypeTest__Group_10__16429);
            rule__DataTypeTest__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_10__1"


    // $ANTLR start "rule__DataTypeTest__Group_10__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3203:1: rule__DataTypeTest__Group_10__1__Impl : ( ( rule__DataTypeTest__ADateTimeAssignment_10_1 ) ) ;
    public final void rule__DataTypeTest__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3207:1: ( ( ( rule__DataTypeTest__ADateTimeAssignment_10_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3208:1: ( ( rule__DataTypeTest__ADateTimeAssignment_10_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3208:1: ( ( rule__DataTypeTest__ADateTimeAssignment_10_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3209:1: ( rule__DataTypeTest__ADateTimeAssignment_10_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getADateTimeAssignment_10_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3210:1: ( rule__DataTypeTest__ADateTimeAssignment_10_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3210:2: rule__DataTypeTest__ADateTimeAssignment_10_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__ADateTimeAssignment_10_1_in_rule__DataTypeTest__Group_10__1__Impl6456);
            rule__DataTypeTest__ADateTimeAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getADateTimeAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_10__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_11__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3224:1: rule__DataTypeTest__Group_11__0 : rule__DataTypeTest__Group_11__0__Impl rule__DataTypeTest__Group_11__1 ;
    public final void rule__DataTypeTest__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3228:1: ( rule__DataTypeTest__Group_11__0__Impl rule__DataTypeTest__Group_11__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3229:2: rule__DataTypeTest__Group_11__0__Impl rule__DataTypeTest__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_11__0__Impl_in_rule__DataTypeTest__Group_11__06490);
            rule__DataTypeTest__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_11__1_in_rule__DataTypeTest__Group_11__06493);
            rule__DataTypeTest__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_11__0"


    // $ANTLR start "rule__DataTypeTest__Group_11__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3236:1: rule__DataTypeTest__Group_11__0__Impl : ( 'aDecimal' ) ;
    public final void rule__DataTypeTest__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3240:1: ( ( 'aDecimal' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3241:1: ( 'aDecimal' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3241:1: ( 'aDecimal' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3242:1: 'aDecimal'
            {
             before(grammarAccess.getDataTypeTestAccess().getADecimalKeyword_11_0()); 
            match(input,63,FollowSets000.FOLLOW_63_in_rule__DataTypeTest__Group_11__0__Impl6521); 
             after(grammarAccess.getDataTypeTestAccess().getADecimalKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_11__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_11__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3255:1: rule__DataTypeTest__Group_11__1 : rule__DataTypeTest__Group_11__1__Impl ;
    public final void rule__DataTypeTest__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3259:1: ( rule__DataTypeTest__Group_11__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3260:2: rule__DataTypeTest__Group_11__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_11__1__Impl_in_rule__DataTypeTest__Group_11__16552);
            rule__DataTypeTest__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_11__1"


    // $ANTLR start "rule__DataTypeTest__Group_11__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3266:1: rule__DataTypeTest__Group_11__1__Impl : ( ( rule__DataTypeTest__ADecimalAssignment_11_1 ) ) ;
    public final void rule__DataTypeTest__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3270:1: ( ( ( rule__DataTypeTest__ADecimalAssignment_11_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3271:1: ( ( rule__DataTypeTest__ADecimalAssignment_11_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3271:1: ( ( rule__DataTypeTest__ADecimalAssignment_11_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3272:1: ( rule__DataTypeTest__ADecimalAssignment_11_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getADecimalAssignment_11_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3273:1: ( rule__DataTypeTest__ADecimalAssignment_11_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3273:2: rule__DataTypeTest__ADecimalAssignment_11_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__ADecimalAssignment_11_1_in_rule__DataTypeTest__Group_11__1__Impl6579);
            rule__DataTypeTest__ADecimalAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getADecimalAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_11__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_12__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3287:1: rule__DataTypeTest__Group_12__0 : rule__DataTypeTest__Group_12__0__Impl rule__DataTypeTest__Group_12__1 ;
    public final void rule__DataTypeTest__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3291:1: ( rule__DataTypeTest__Group_12__0__Impl rule__DataTypeTest__Group_12__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3292:2: rule__DataTypeTest__Group_12__0__Impl rule__DataTypeTest__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_12__0__Impl_in_rule__DataTypeTest__Group_12__06613);
            rule__DataTypeTest__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_12__1_in_rule__DataTypeTest__Group_12__06616);
            rule__DataTypeTest__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_12__0"


    // $ANTLR start "rule__DataTypeTest__Group_12__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3299:1: rule__DataTypeTest__Group_12__0__Impl : ( 'aDouble' ) ;
    public final void rule__DataTypeTest__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3303:1: ( ( 'aDouble' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3304:1: ( 'aDouble' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3304:1: ( 'aDouble' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3305:1: 'aDouble'
            {
             before(grammarAccess.getDataTypeTestAccess().getADoubleKeyword_12_0()); 
            match(input,64,FollowSets000.FOLLOW_64_in_rule__DataTypeTest__Group_12__0__Impl6644); 
             after(grammarAccess.getDataTypeTestAccess().getADoubleKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_12__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_12__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3318:1: rule__DataTypeTest__Group_12__1 : rule__DataTypeTest__Group_12__1__Impl ;
    public final void rule__DataTypeTest__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3322:1: ( rule__DataTypeTest__Group_12__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3323:2: rule__DataTypeTest__Group_12__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_12__1__Impl_in_rule__DataTypeTest__Group_12__16675);
            rule__DataTypeTest__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_12__1"


    // $ANTLR start "rule__DataTypeTest__Group_12__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3329:1: rule__DataTypeTest__Group_12__1__Impl : ( ( rule__DataTypeTest__ADoubleAssignment_12_1 ) ) ;
    public final void rule__DataTypeTest__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3333:1: ( ( ( rule__DataTypeTest__ADoubleAssignment_12_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3334:1: ( ( rule__DataTypeTest__ADoubleAssignment_12_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3334:1: ( ( rule__DataTypeTest__ADoubleAssignment_12_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3335:1: ( rule__DataTypeTest__ADoubleAssignment_12_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getADoubleAssignment_12_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3336:1: ( rule__DataTypeTest__ADoubleAssignment_12_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3336:2: rule__DataTypeTest__ADoubleAssignment_12_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__ADoubleAssignment_12_1_in_rule__DataTypeTest__Group_12__1__Impl6702);
            rule__DataTypeTest__ADoubleAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getADoubleAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_12__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_13__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3350:1: rule__DataTypeTest__Group_13__0 : rule__DataTypeTest__Group_13__0__Impl rule__DataTypeTest__Group_13__1 ;
    public final void rule__DataTypeTest__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3354:1: ( rule__DataTypeTest__Group_13__0__Impl rule__DataTypeTest__Group_13__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3355:2: rule__DataTypeTest__Group_13__0__Impl rule__DataTypeTest__Group_13__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_13__0__Impl_in_rule__DataTypeTest__Group_13__06736);
            rule__DataTypeTest__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_13__1_in_rule__DataTypeTest__Group_13__06739);
            rule__DataTypeTest__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_13__0"


    // $ANTLR start "rule__DataTypeTest__Group_13__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3362:1: rule__DataTypeTest__Group_13__0__Impl : ( 'aDuration' ) ;
    public final void rule__DataTypeTest__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3366:1: ( ( 'aDuration' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3367:1: ( 'aDuration' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3367:1: ( 'aDuration' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3368:1: 'aDuration'
            {
             before(grammarAccess.getDataTypeTestAccess().getADurationKeyword_13_0()); 
            match(input,65,FollowSets000.FOLLOW_65_in_rule__DataTypeTest__Group_13__0__Impl6767); 
             after(grammarAccess.getDataTypeTestAccess().getADurationKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_13__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_13__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3381:1: rule__DataTypeTest__Group_13__1 : rule__DataTypeTest__Group_13__1__Impl ;
    public final void rule__DataTypeTest__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3385:1: ( rule__DataTypeTest__Group_13__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3386:2: rule__DataTypeTest__Group_13__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_13__1__Impl_in_rule__DataTypeTest__Group_13__16798);
            rule__DataTypeTest__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_13__1"


    // $ANTLR start "rule__DataTypeTest__Group_13__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3392:1: rule__DataTypeTest__Group_13__1__Impl : ( ( rule__DataTypeTest__ADurationAssignment_13_1 ) ) ;
    public final void rule__DataTypeTest__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3396:1: ( ( ( rule__DataTypeTest__ADurationAssignment_13_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3397:1: ( ( rule__DataTypeTest__ADurationAssignment_13_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3397:1: ( ( rule__DataTypeTest__ADurationAssignment_13_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3398:1: ( rule__DataTypeTest__ADurationAssignment_13_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getADurationAssignment_13_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3399:1: ( rule__DataTypeTest__ADurationAssignment_13_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3399:2: rule__DataTypeTest__ADurationAssignment_13_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__ADurationAssignment_13_1_in_rule__DataTypeTest__Group_13__1__Impl6825);
            rule__DataTypeTest__ADurationAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getADurationAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_13__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_14__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3413:1: rule__DataTypeTest__Group_14__0 : rule__DataTypeTest__Group_14__0__Impl rule__DataTypeTest__Group_14__1 ;
    public final void rule__DataTypeTest__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3417:1: ( rule__DataTypeTest__Group_14__0__Impl rule__DataTypeTest__Group_14__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3418:2: rule__DataTypeTest__Group_14__0__Impl rule__DataTypeTest__Group_14__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_14__0__Impl_in_rule__DataTypeTest__Group_14__06859);
            rule__DataTypeTest__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_14__1_in_rule__DataTypeTest__Group_14__06862);
            rule__DataTypeTest__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_14__0"


    // $ANTLR start "rule__DataTypeTest__Group_14__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3425:1: rule__DataTypeTest__Group_14__0__Impl : ( 'aEntities' ) ;
    public final void rule__DataTypeTest__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3429:1: ( ( 'aEntities' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3430:1: ( 'aEntities' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3430:1: ( 'aEntities' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3431:1: 'aEntities'
            {
             before(grammarAccess.getDataTypeTestAccess().getAEntitiesKeyword_14_0()); 
            match(input,66,FollowSets000.FOLLOW_66_in_rule__DataTypeTest__Group_14__0__Impl6890); 
             after(grammarAccess.getDataTypeTestAccess().getAEntitiesKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_14__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_14__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3444:1: rule__DataTypeTest__Group_14__1 : rule__DataTypeTest__Group_14__1__Impl ;
    public final void rule__DataTypeTest__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3448:1: ( rule__DataTypeTest__Group_14__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3449:2: rule__DataTypeTest__Group_14__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_14__1__Impl_in_rule__DataTypeTest__Group_14__16921);
            rule__DataTypeTest__Group_14__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_14__1"


    // $ANTLR start "rule__DataTypeTest__Group_14__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3455:1: rule__DataTypeTest__Group_14__1__Impl : ( ( rule__DataTypeTest__AEntitiesAssignment_14_1 ) ) ;
    public final void rule__DataTypeTest__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3459:1: ( ( ( rule__DataTypeTest__AEntitiesAssignment_14_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3460:1: ( ( rule__DataTypeTest__AEntitiesAssignment_14_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3460:1: ( ( rule__DataTypeTest__AEntitiesAssignment_14_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3461:1: ( rule__DataTypeTest__AEntitiesAssignment_14_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getAEntitiesAssignment_14_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3462:1: ( rule__DataTypeTest__AEntitiesAssignment_14_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3462:2: rule__DataTypeTest__AEntitiesAssignment_14_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__AEntitiesAssignment_14_1_in_rule__DataTypeTest__Group_14__1__Impl6948);
            rule__DataTypeTest__AEntitiesAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getAEntitiesAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_14__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_15__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3476:1: rule__DataTypeTest__Group_15__0 : rule__DataTypeTest__Group_15__0__Impl rule__DataTypeTest__Group_15__1 ;
    public final void rule__DataTypeTest__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3480:1: ( rule__DataTypeTest__Group_15__0__Impl rule__DataTypeTest__Group_15__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3481:2: rule__DataTypeTest__Group_15__0__Impl rule__DataTypeTest__Group_15__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_15__0__Impl_in_rule__DataTypeTest__Group_15__06982);
            rule__DataTypeTest__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_15__1_in_rule__DataTypeTest__Group_15__06985);
            rule__DataTypeTest__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_15__0"


    // $ANTLR start "rule__DataTypeTest__Group_15__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3488:1: rule__DataTypeTest__Group_15__0__Impl : ( 'aEntity' ) ;
    public final void rule__DataTypeTest__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3492:1: ( ( 'aEntity' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3493:1: ( 'aEntity' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3493:1: ( 'aEntity' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3494:1: 'aEntity'
            {
             before(grammarAccess.getDataTypeTestAccess().getAEntityKeyword_15_0()); 
            match(input,67,FollowSets000.FOLLOW_67_in_rule__DataTypeTest__Group_15__0__Impl7013); 
             after(grammarAccess.getDataTypeTestAccess().getAEntityKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_15__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_15__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3507:1: rule__DataTypeTest__Group_15__1 : rule__DataTypeTest__Group_15__1__Impl ;
    public final void rule__DataTypeTest__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3511:1: ( rule__DataTypeTest__Group_15__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3512:2: rule__DataTypeTest__Group_15__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_15__1__Impl_in_rule__DataTypeTest__Group_15__17044);
            rule__DataTypeTest__Group_15__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_15__1"


    // $ANTLR start "rule__DataTypeTest__Group_15__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3518:1: rule__DataTypeTest__Group_15__1__Impl : ( ( rule__DataTypeTest__AEntityAssignment_15_1 ) ) ;
    public final void rule__DataTypeTest__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3522:1: ( ( ( rule__DataTypeTest__AEntityAssignment_15_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3523:1: ( ( rule__DataTypeTest__AEntityAssignment_15_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3523:1: ( ( rule__DataTypeTest__AEntityAssignment_15_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3524:1: ( rule__DataTypeTest__AEntityAssignment_15_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getAEntityAssignment_15_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3525:1: ( rule__DataTypeTest__AEntityAssignment_15_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3525:2: rule__DataTypeTest__AEntityAssignment_15_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__AEntityAssignment_15_1_in_rule__DataTypeTest__Group_15__1__Impl7071);
            rule__DataTypeTest__AEntityAssignment_15_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getAEntityAssignment_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_15__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_16__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3539:1: rule__DataTypeTest__Group_16__0 : rule__DataTypeTest__Group_16__0__Impl rule__DataTypeTest__Group_16__1 ;
    public final void rule__DataTypeTest__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3543:1: ( rule__DataTypeTest__Group_16__0__Impl rule__DataTypeTest__Group_16__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3544:2: rule__DataTypeTest__Group_16__0__Impl rule__DataTypeTest__Group_16__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_16__0__Impl_in_rule__DataTypeTest__Group_16__07105);
            rule__DataTypeTest__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_16__1_in_rule__DataTypeTest__Group_16__07108);
            rule__DataTypeTest__Group_16__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_16__0"


    // $ANTLR start "rule__DataTypeTest__Group_16__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3551:1: rule__DataTypeTest__Group_16__0__Impl : ( 'aFloat' ) ;
    public final void rule__DataTypeTest__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3555:1: ( ( 'aFloat' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3556:1: ( 'aFloat' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3556:1: ( 'aFloat' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3557:1: 'aFloat'
            {
             before(grammarAccess.getDataTypeTestAccess().getAFloatKeyword_16_0()); 
            match(input,68,FollowSets000.FOLLOW_68_in_rule__DataTypeTest__Group_16__0__Impl7136); 
             after(grammarAccess.getDataTypeTestAccess().getAFloatKeyword_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_16__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_16__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3570:1: rule__DataTypeTest__Group_16__1 : rule__DataTypeTest__Group_16__1__Impl ;
    public final void rule__DataTypeTest__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3574:1: ( rule__DataTypeTest__Group_16__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3575:2: rule__DataTypeTest__Group_16__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_16__1__Impl_in_rule__DataTypeTest__Group_16__17167);
            rule__DataTypeTest__Group_16__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_16__1"


    // $ANTLR start "rule__DataTypeTest__Group_16__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3581:1: rule__DataTypeTest__Group_16__1__Impl : ( ( rule__DataTypeTest__AFloatAssignment_16_1 ) ) ;
    public final void rule__DataTypeTest__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3585:1: ( ( ( rule__DataTypeTest__AFloatAssignment_16_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3586:1: ( ( rule__DataTypeTest__AFloatAssignment_16_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3586:1: ( ( rule__DataTypeTest__AFloatAssignment_16_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3587:1: ( rule__DataTypeTest__AFloatAssignment_16_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getAFloatAssignment_16_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3588:1: ( rule__DataTypeTest__AFloatAssignment_16_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3588:2: rule__DataTypeTest__AFloatAssignment_16_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__AFloatAssignment_16_1_in_rule__DataTypeTest__Group_16__1__Impl7194);
            rule__DataTypeTest__AFloatAssignment_16_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getAFloatAssignment_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_16__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_17__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3602:1: rule__DataTypeTest__Group_17__0 : rule__DataTypeTest__Group_17__0__Impl rule__DataTypeTest__Group_17__1 ;
    public final void rule__DataTypeTest__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3606:1: ( rule__DataTypeTest__Group_17__0__Impl rule__DataTypeTest__Group_17__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3607:2: rule__DataTypeTest__Group_17__0__Impl rule__DataTypeTest__Group_17__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_17__0__Impl_in_rule__DataTypeTest__Group_17__07228);
            rule__DataTypeTest__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_17__1_in_rule__DataTypeTest__Group_17__07231);
            rule__DataTypeTest__Group_17__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_17__0"


    // $ANTLR start "rule__DataTypeTest__Group_17__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3614:1: rule__DataTypeTest__Group_17__0__Impl : ( 'aGDay' ) ;
    public final void rule__DataTypeTest__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3618:1: ( ( 'aGDay' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3619:1: ( 'aGDay' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3619:1: ( 'aGDay' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3620:1: 'aGDay'
            {
             before(grammarAccess.getDataTypeTestAccess().getAGDayKeyword_17_0()); 
            match(input,69,FollowSets000.FOLLOW_69_in_rule__DataTypeTest__Group_17__0__Impl7259); 
             after(grammarAccess.getDataTypeTestAccess().getAGDayKeyword_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_17__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_17__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3633:1: rule__DataTypeTest__Group_17__1 : rule__DataTypeTest__Group_17__1__Impl ;
    public final void rule__DataTypeTest__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3637:1: ( rule__DataTypeTest__Group_17__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3638:2: rule__DataTypeTest__Group_17__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_17__1__Impl_in_rule__DataTypeTest__Group_17__17290);
            rule__DataTypeTest__Group_17__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_17__1"


    // $ANTLR start "rule__DataTypeTest__Group_17__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3644:1: rule__DataTypeTest__Group_17__1__Impl : ( ( rule__DataTypeTest__AGDayAssignment_17_1 ) ) ;
    public final void rule__DataTypeTest__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3648:1: ( ( ( rule__DataTypeTest__AGDayAssignment_17_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3649:1: ( ( rule__DataTypeTest__AGDayAssignment_17_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3649:1: ( ( rule__DataTypeTest__AGDayAssignment_17_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3650:1: ( rule__DataTypeTest__AGDayAssignment_17_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getAGDayAssignment_17_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3651:1: ( rule__DataTypeTest__AGDayAssignment_17_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3651:2: rule__DataTypeTest__AGDayAssignment_17_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__AGDayAssignment_17_1_in_rule__DataTypeTest__Group_17__1__Impl7317);
            rule__DataTypeTest__AGDayAssignment_17_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getAGDayAssignment_17_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_17__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_18__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3665:1: rule__DataTypeTest__Group_18__0 : rule__DataTypeTest__Group_18__0__Impl rule__DataTypeTest__Group_18__1 ;
    public final void rule__DataTypeTest__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3669:1: ( rule__DataTypeTest__Group_18__0__Impl rule__DataTypeTest__Group_18__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3670:2: rule__DataTypeTest__Group_18__0__Impl rule__DataTypeTest__Group_18__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_18__0__Impl_in_rule__DataTypeTest__Group_18__07351);
            rule__DataTypeTest__Group_18__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_18__1_in_rule__DataTypeTest__Group_18__07354);
            rule__DataTypeTest__Group_18__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_18__0"


    // $ANTLR start "rule__DataTypeTest__Group_18__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3677:1: rule__DataTypeTest__Group_18__0__Impl : ( 'aGMonth' ) ;
    public final void rule__DataTypeTest__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3681:1: ( ( 'aGMonth' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3682:1: ( 'aGMonth' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3682:1: ( 'aGMonth' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3683:1: 'aGMonth'
            {
             before(grammarAccess.getDataTypeTestAccess().getAGMonthKeyword_18_0()); 
            match(input,70,FollowSets000.FOLLOW_70_in_rule__DataTypeTest__Group_18__0__Impl7382); 
             after(grammarAccess.getDataTypeTestAccess().getAGMonthKeyword_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_18__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_18__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3696:1: rule__DataTypeTest__Group_18__1 : rule__DataTypeTest__Group_18__1__Impl ;
    public final void rule__DataTypeTest__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3700:1: ( rule__DataTypeTest__Group_18__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3701:2: rule__DataTypeTest__Group_18__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_18__1__Impl_in_rule__DataTypeTest__Group_18__17413);
            rule__DataTypeTest__Group_18__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_18__1"


    // $ANTLR start "rule__DataTypeTest__Group_18__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3707:1: rule__DataTypeTest__Group_18__1__Impl : ( ( rule__DataTypeTest__AGMonthAssignment_18_1 ) ) ;
    public final void rule__DataTypeTest__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3711:1: ( ( ( rule__DataTypeTest__AGMonthAssignment_18_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3712:1: ( ( rule__DataTypeTest__AGMonthAssignment_18_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3712:1: ( ( rule__DataTypeTest__AGMonthAssignment_18_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3713:1: ( rule__DataTypeTest__AGMonthAssignment_18_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getAGMonthAssignment_18_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3714:1: ( rule__DataTypeTest__AGMonthAssignment_18_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3714:2: rule__DataTypeTest__AGMonthAssignment_18_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__AGMonthAssignment_18_1_in_rule__DataTypeTest__Group_18__1__Impl7440);
            rule__DataTypeTest__AGMonthAssignment_18_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getAGMonthAssignment_18_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_18__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_19__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3728:1: rule__DataTypeTest__Group_19__0 : rule__DataTypeTest__Group_19__0__Impl rule__DataTypeTest__Group_19__1 ;
    public final void rule__DataTypeTest__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3732:1: ( rule__DataTypeTest__Group_19__0__Impl rule__DataTypeTest__Group_19__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3733:2: rule__DataTypeTest__Group_19__0__Impl rule__DataTypeTest__Group_19__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_19__0__Impl_in_rule__DataTypeTest__Group_19__07474);
            rule__DataTypeTest__Group_19__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_19__1_in_rule__DataTypeTest__Group_19__07477);
            rule__DataTypeTest__Group_19__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_19__0"


    // $ANTLR start "rule__DataTypeTest__Group_19__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3740:1: rule__DataTypeTest__Group_19__0__Impl : ( 'aGMonthDay' ) ;
    public final void rule__DataTypeTest__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3744:1: ( ( 'aGMonthDay' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3745:1: ( 'aGMonthDay' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3745:1: ( 'aGMonthDay' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3746:1: 'aGMonthDay'
            {
             before(grammarAccess.getDataTypeTestAccess().getAGMonthDayKeyword_19_0()); 
            match(input,71,FollowSets000.FOLLOW_71_in_rule__DataTypeTest__Group_19__0__Impl7505); 
             after(grammarAccess.getDataTypeTestAccess().getAGMonthDayKeyword_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_19__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_19__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3759:1: rule__DataTypeTest__Group_19__1 : rule__DataTypeTest__Group_19__1__Impl ;
    public final void rule__DataTypeTest__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3763:1: ( rule__DataTypeTest__Group_19__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3764:2: rule__DataTypeTest__Group_19__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_19__1__Impl_in_rule__DataTypeTest__Group_19__17536);
            rule__DataTypeTest__Group_19__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_19__1"


    // $ANTLR start "rule__DataTypeTest__Group_19__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3770:1: rule__DataTypeTest__Group_19__1__Impl : ( ( rule__DataTypeTest__AGMonthDayAssignment_19_1 ) ) ;
    public final void rule__DataTypeTest__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3774:1: ( ( ( rule__DataTypeTest__AGMonthDayAssignment_19_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3775:1: ( ( rule__DataTypeTest__AGMonthDayAssignment_19_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3775:1: ( ( rule__DataTypeTest__AGMonthDayAssignment_19_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3776:1: ( rule__DataTypeTest__AGMonthDayAssignment_19_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getAGMonthDayAssignment_19_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3777:1: ( rule__DataTypeTest__AGMonthDayAssignment_19_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3777:2: rule__DataTypeTest__AGMonthDayAssignment_19_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__AGMonthDayAssignment_19_1_in_rule__DataTypeTest__Group_19__1__Impl7563);
            rule__DataTypeTest__AGMonthDayAssignment_19_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getAGMonthDayAssignment_19_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_19__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_20__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3791:1: rule__DataTypeTest__Group_20__0 : rule__DataTypeTest__Group_20__0__Impl rule__DataTypeTest__Group_20__1 ;
    public final void rule__DataTypeTest__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3795:1: ( rule__DataTypeTest__Group_20__0__Impl rule__DataTypeTest__Group_20__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3796:2: rule__DataTypeTest__Group_20__0__Impl rule__DataTypeTest__Group_20__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_20__0__Impl_in_rule__DataTypeTest__Group_20__07597);
            rule__DataTypeTest__Group_20__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_20__1_in_rule__DataTypeTest__Group_20__07600);
            rule__DataTypeTest__Group_20__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_20__0"


    // $ANTLR start "rule__DataTypeTest__Group_20__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3803:1: rule__DataTypeTest__Group_20__0__Impl : ( 'aGYear' ) ;
    public final void rule__DataTypeTest__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3807:1: ( ( 'aGYear' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3808:1: ( 'aGYear' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3808:1: ( 'aGYear' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3809:1: 'aGYear'
            {
             before(grammarAccess.getDataTypeTestAccess().getAGYearKeyword_20_0()); 
            match(input,72,FollowSets000.FOLLOW_72_in_rule__DataTypeTest__Group_20__0__Impl7628); 
             after(grammarAccess.getDataTypeTestAccess().getAGYearKeyword_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_20__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_20__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3822:1: rule__DataTypeTest__Group_20__1 : rule__DataTypeTest__Group_20__1__Impl ;
    public final void rule__DataTypeTest__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3826:1: ( rule__DataTypeTest__Group_20__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3827:2: rule__DataTypeTest__Group_20__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_20__1__Impl_in_rule__DataTypeTest__Group_20__17659);
            rule__DataTypeTest__Group_20__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_20__1"


    // $ANTLR start "rule__DataTypeTest__Group_20__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3833:1: rule__DataTypeTest__Group_20__1__Impl : ( ( rule__DataTypeTest__AGYearAssignment_20_1 ) ) ;
    public final void rule__DataTypeTest__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3837:1: ( ( ( rule__DataTypeTest__AGYearAssignment_20_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3838:1: ( ( rule__DataTypeTest__AGYearAssignment_20_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3838:1: ( ( rule__DataTypeTest__AGYearAssignment_20_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3839:1: ( rule__DataTypeTest__AGYearAssignment_20_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getAGYearAssignment_20_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3840:1: ( rule__DataTypeTest__AGYearAssignment_20_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3840:2: rule__DataTypeTest__AGYearAssignment_20_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__AGYearAssignment_20_1_in_rule__DataTypeTest__Group_20__1__Impl7686);
            rule__DataTypeTest__AGYearAssignment_20_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getAGYearAssignment_20_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_20__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_21__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3854:1: rule__DataTypeTest__Group_21__0 : rule__DataTypeTest__Group_21__0__Impl rule__DataTypeTest__Group_21__1 ;
    public final void rule__DataTypeTest__Group_21__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3858:1: ( rule__DataTypeTest__Group_21__0__Impl rule__DataTypeTest__Group_21__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3859:2: rule__DataTypeTest__Group_21__0__Impl rule__DataTypeTest__Group_21__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_21__0__Impl_in_rule__DataTypeTest__Group_21__07720);
            rule__DataTypeTest__Group_21__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_21__1_in_rule__DataTypeTest__Group_21__07723);
            rule__DataTypeTest__Group_21__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_21__0"


    // $ANTLR start "rule__DataTypeTest__Group_21__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3866:1: rule__DataTypeTest__Group_21__0__Impl : ( 'aGYearMonth' ) ;
    public final void rule__DataTypeTest__Group_21__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3870:1: ( ( 'aGYearMonth' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3871:1: ( 'aGYearMonth' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3871:1: ( 'aGYearMonth' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3872:1: 'aGYearMonth'
            {
             before(grammarAccess.getDataTypeTestAccess().getAGYearMonthKeyword_21_0()); 
            match(input,73,FollowSets000.FOLLOW_73_in_rule__DataTypeTest__Group_21__0__Impl7751); 
             after(grammarAccess.getDataTypeTestAccess().getAGYearMonthKeyword_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_21__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_21__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3885:1: rule__DataTypeTest__Group_21__1 : rule__DataTypeTest__Group_21__1__Impl ;
    public final void rule__DataTypeTest__Group_21__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3889:1: ( rule__DataTypeTest__Group_21__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3890:2: rule__DataTypeTest__Group_21__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_21__1__Impl_in_rule__DataTypeTest__Group_21__17782);
            rule__DataTypeTest__Group_21__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_21__1"


    // $ANTLR start "rule__DataTypeTest__Group_21__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3896:1: rule__DataTypeTest__Group_21__1__Impl : ( ( rule__DataTypeTest__AGYearMonthAssignment_21_1 ) ) ;
    public final void rule__DataTypeTest__Group_21__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3900:1: ( ( ( rule__DataTypeTest__AGYearMonthAssignment_21_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3901:1: ( ( rule__DataTypeTest__AGYearMonthAssignment_21_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3901:1: ( ( rule__DataTypeTest__AGYearMonthAssignment_21_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3902:1: ( rule__DataTypeTest__AGYearMonthAssignment_21_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getAGYearMonthAssignment_21_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3903:1: ( rule__DataTypeTest__AGYearMonthAssignment_21_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3903:2: rule__DataTypeTest__AGYearMonthAssignment_21_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__AGYearMonthAssignment_21_1_in_rule__DataTypeTest__Group_21__1__Impl7809);
            rule__DataTypeTest__AGYearMonthAssignment_21_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getAGYearMonthAssignment_21_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_21__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_22__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3917:1: rule__DataTypeTest__Group_22__0 : rule__DataTypeTest__Group_22__0__Impl rule__DataTypeTest__Group_22__1 ;
    public final void rule__DataTypeTest__Group_22__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3921:1: ( rule__DataTypeTest__Group_22__0__Impl rule__DataTypeTest__Group_22__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3922:2: rule__DataTypeTest__Group_22__0__Impl rule__DataTypeTest__Group_22__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_22__0__Impl_in_rule__DataTypeTest__Group_22__07843);
            rule__DataTypeTest__Group_22__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_22__1_in_rule__DataTypeTest__Group_22__07846);
            rule__DataTypeTest__Group_22__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_22__0"


    // $ANTLR start "rule__DataTypeTest__Group_22__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3929:1: rule__DataTypeTest__Group_22__0__Impl : ( 'aHexBinary' ) ;
    public final void rule__DataTypeTest__Group_22__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3933:1: ( ( 'aHexBinary' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3934:1: ( 'aHexBinary' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3934:1: ( 'aHexBinary' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3935:1: 'aHexBinary'
            {
             before(grammarAccess.getDataTypeTestAccess().getAHexBinaryKeyword_22_0()); 
            match(input,74,FollowSets000.FOLLOW_74_in_rule__DataTypeTest__Group_22__0__Impl7874); 
             after(grammarAccess.getDataTypeTestAccess().getAHexBinaryKeyword_22_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_22__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_22__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3948:1: rule__DataTypeTest__Group_22__1 : rule__DataTypeTest__Group_22__1__Impl ;
    public final void rule__DataTypeTest__Group_22__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3952:1: ( rule__DataTypeTest__Group_22__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3953:2: rule__DataTypeTest__Group_22__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_22__1__Impl_in_rule__DataTypeTest__Group_22__17905);
            rule__DataTypeTest__Group_22__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_22__1"


    // $ANTLR start "rule__DataTypeTest__Group_22__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3959:1: rule__DataTypeTest__Group_22__1__Impl : ( ( rule__DataTypeTest__AHexBinaryAssignment_22_1 ) ) ;
    public final void rule__DataTypeTest__Group_22__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3963:1: ( ( ( rule__DataTypeTest__AHexBinaryAssignment_22_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3964:1: ( ( rule__DataTypeTest__AHexBinaryAssignment_22_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3964:1: ( ( rule__DataTypeTest__AHexBinaryAssignment_22_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3965:1: ( rule__DataTypeTest__AHexBinaryAssignment_22_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getAHexBinaryAssignment_22_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3966:1: ( rule__DataTypeTest__AHexBinaryAssignment_22_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3966:2: rule__DataTypeTest__AHexBinaryAssignment_22_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__AHexBinaryAssignment_22_1_in_rule__DataTypeTest__Group_22__1__Impl7932);
            rule__DataTypeTest__AHexBinaryAssignment_22_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getAHexBinaryAssignment_22_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_22__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_23__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3980:1: rule__DataTypeTest__Group_23__0 : rule__DataTypeTest__Group_23__0__Impl rule__DataTypeTest__Group_23__1 ;
    public final void rule__DataTypeTest__Group_23__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3984:1: ( rule__DataTypeTest__Group_23__0__Impl rule__DataTypeTest__Group_23__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3985:2: rule__DataTypeTest__Group_23__0__Impl rule__DataTypeTest__Group_23__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_23__0__Impl_in_rule__DataTypeTest__Group_23__07966);
            rule__DataTypeTest__Group_23__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_23__1_in_rule__DataTypeTest__Group_23__07969);
            rule__DataTypeTest__Group_23__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_23__0"


    // $ANTLR start "rule__DataTypeTest__Group_23__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3992:1: rule__DataTypeTest__Group_23__0__Impl : ( 'aIDREF' ) ;
    public final void rule__DataTypeTest__Group_23__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3996:1: ( ( 'aIDREF' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3997:1: ( 'aIDREF' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3997:1: ( 'aIDREF' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:3998:1: 'aIDREF'
            {
             before(grammarAccess.getDataTypeTestAccess().getAIDREFKeyword_23_0()); 
            match(input,75,FollowSets000.FOLLOW_75_in_rule__DataTypeTest__Group_23__0__Impl7997); 
             after(grammarAccess.getDataTypeTestAccess().getAIDREFKeyword_23_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_23__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_23__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4011:1: rule__DataTypeTest__Group_23__1 : rule__DataTypeTest__Group_23__1__Impl ;
    public final void rule__DataTypeTest__Group_23__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4015:1: ( rule__DataTypeTest__Group_23__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4016:2: rule__DataTypeTest__Group_23__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_23__1__Impl_in_rule__DataTypeTest__Group_23__18028);
            rule__DataTypeTest__Group_23__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_23__1"


    // $ANTLR start "rule__DataTypeTest__Group_23__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4022:1: rule__DataTypeTest__Group_23__1__Impl : ( ( rule__DataTypeTest__AIDREFAssignment_23_1 ) ) ;
    public final void rule__DataTypeTest__Group_23__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4026:1: ( ( ( rule__DataTypeTest__AIDREFAssignment_23_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4027:1: ( ( rule__DataTypeTest__AIDREFAssignment_23_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4027:1: ( ( rule__DataTypeTest__AIDREFAssignment_23_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4028:1: ( rule__DataTypeTest__AIDREFAssignment_23_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getAIDREFAssignment_23_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4029:1: ( rule__DataTypeTest__AIDREFAssignment_23_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4029:2: rule__DataTypeTest__AIDREFAssignment_23_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__AIDREFAssignment_23_1_in_rule__DataTypeTest__Group_23__1__Impl8055);
            rule__DataTypeTest__AIDREFAssignment_23_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getAIDREFAssignment_23_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_23__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_24__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4043:1: rule__DataTypeTest__Group_24__0 : rule__DataTypeTest__Group_24__0__Impl rule__DataTypeTest__Group_24__1 ;
    public final void rule__DataTypeTest__Group_24__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4047:1: ( rule__DataTypeTest__Group_24__0__Impl rule__DataTypeTest__Group_24__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4048:2: rule__DataTypeTest__Group_24__0__Impl rule__DataTypeTest__Group_24__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_24__0__Impl_in_rule__DataTypeTest__Group_24__08089);
            rule__DataTypeTest__Group_24__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_24__1_in_rule__DataTypeTest__Group_24__08092);
            rule__DataTypeTest__Group_24__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_24__0"


    // $ANTLR start "rule__DataTypeTest__Group_24__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4055:1: rule__DataTypeTest__Group_24__0__Impl : ( 'aIDREFS' ) ;
    public final void rule__DataTypeTest__Group_24__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4059:1: ( ( 'aIDREFS' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4060:1: ( 'aIDREFS' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4060:1: ( 'aIDREFS' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4061:1: 'aIDREFS'
            {
             before(grammarAccess.getDataTypeTestAccess().getAIDREFSKeyword_24_0()); 
            match(input,76,FollowSets000.FOLLOW_76_in_rule__DataTypeTest__Group_24__0__Impl8120); 
             after(grammarAccess.getDataTypeTestAccess().getAIDREFSKeyword_24_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_24__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_24__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4074:1: rule__DataTypeTest__Group_24__1 : rule__DataTypeTest__Group_24__1__Impl ;
    public final void rule__DataTypeTest__Group_24__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4078:1: ( rule__DataTypeTest__Group_24__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4079:2: rule__DataTypeTest__Group_24__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_24__1__Impl_in_rule__DataTypeTest__Group_24__18151);
            rule__DataTypeTest__Group_24__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_24__1"


    // $ANTLR start "rule__DataTypeTest__Group_24__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4085:1: rule__DataTypeTest__Group_24__1__Impl : ( ( rule__DataTypeTest__AIDREFSAssignment_24_1 ) ) ;
    public final void rule__DataTypeTest__Group_24__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4089:1: ( ( ( rule__DataTypeTest__AIDREFSAssignment_24_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4090:1: ( ( rule__DataTypeTest__AIDREFSAssignment_24_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4090:1: ( ( rule__DataTypeTest__AIDREFSAssignment_24_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4091:1: ( rule__DataTypeTest__AIDREFSAssignment_24_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getAIDREFSAssignment_24_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4092:1: ( rule__DataTypeTest__AIDREFSAssignment_24_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4092:2: rule__DataTypeTest__AIDREFSAssignment_24_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__AIDREFSAssignment_24_1_in_rule__DataTypeTest__Group_24__1__Impl8178);
            rule__DataTypeTest__AIDREFSAssignment_24_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getAIDREFSAssignment_24_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_24__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_25__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4106:1: rule__DataTypeTest__Group_25__0 : rule__DataTypeTest__Group_25__0__Impl rule__DataTypeTest__Group_25__1 ;
    public final void rule__DataTypeTest__Group_25__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4110:1: ( rule__DataTypeTest__Group_25__0__Impl rule__DataTypeTest__Group_25__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4111:2: rule__DataTypeTest__Group_25__0__Impl rule__DataTypeTest__Group_25__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_25__0__Impl_in_rule__DataTypeTest__Group_25__08212);
            rule__DataTypeTest__Group_25__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_25__1_in_rule__DataTypeTest__Group_25__08215);
            rule__DataTypeTest__Group_25__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_25__0"


    // $ANTLR start "rule__DataTypeTest__Group_25__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4118:1: rule__DataTypeTest__Group_25__0__Impl : ( 'aInt' ) ;
    public final void rule__DataTypeTest__Group_25__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4122:1: ( ( 'aInt' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4123:1: ( 'aInt' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4123:1: ( 'aInt' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4124:1: 'aInt'
            {
             before(grammarAccess.getDataTypeTestAccess().getAIntKeyword_25_0()); 
            match(input,77,FollowSets000.FOLLOW_77_in_rule__DataTypeTest__Group_25__0__Impl8243); 
             after(grammarAccess.getDataTypeTestAccess().getAIntKeyword_25_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_25__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_25__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4137:1: rule__DataTypeTest__Group_25__1 : rule__DataTypeTest__Group_25__1__Impl ;
    public final void rule__DataTypeTest__Group_25__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4141:1: ( rule__DataTypeTest__Group_25__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4142:2: rule__DataTypeTest__Group_25__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_25__1__Impl_in_rule__DataTypeTest__Group_25__18274);
            rule__DataTypeTest__Group_25__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_25__1"


    // $ANTLR start "rule__DataTypeTest__Group_25__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4148:1: rule__DataTypeTest__Group_25__1__Impl : ( ( rule__DataTypeTest__AIntAssignment_25_1 ) ) ;
    public final void rule__DataTypeTest__Group_25__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4152:1: ( ( ( rule__DataTypeTest__AIntAssignment_25_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4153:1: ( ( rule__DataTypeTest__AIntAssignment_25_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4153:1: ( ( rule__DataTypeTest__AIntAssignment_25_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4154:1: ( rule__DataTypeTest__AIntAssignment_25_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getAIntAssignment_25_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4155:1: ( rule__DataTypeTest__AIntAssignment_25_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4155:2: rule__DataTypeTest__AIntAssignment_25_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__AIntAssignment_25_1_in_rule__DataTypeTest__Group_25__1__Impl8301);
            rule__DataTypeTest__AIntAssignment_25_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getAIntAssignment_25_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_25__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_26__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4169:1: rule__DataTypeTest__Group_26__0 : rule__DataTypeTest__Group_26__0__Impl rule__DataTypeTest__Group_26__1 ;
    public final void rule__DataTypeTest__Group_26__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4173:1: ( rule__DataTypeTest__Group_26__0__Impl rule__DataTypeTest__Group_26__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4174:2: rule__DataTypeTest__Group_26__0__Impl rule__DataTypeTest__Group_26__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_26__0__Impl_in_rule__DataTypeTest__Group_26__08335);
            rule__DataTypeTest__Group_26__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_26__1_in_rule__DataTypeTest__Group_26__08338);
            rule__DataTypeTest__Group_26__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_26__0"


    // $ANTLR start "rule__DataTypeTest__Group_26__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4181:1: rule__DataTypeTest__Group_26__0__Impl : ( 'aInteger' ) ;
    public final void rule__DataTypeTest__Group_26__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4185:1: ( ( 'aInteger' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4186:1: ( 'aInteger' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4186:1: ( 'aInteger' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4187:1: 'aInteger'
            {
             before(grammarAccess.getDataTypeTestAccess().getAIntegerKeyword_26_0()); 
            match(input,78,FollowSets000.FOLLOW_78_in_rule__DataTypeTest__Group_26__0__Impl8366); 
             after(grammarAccess.getDataTypeTestAccess().getAIntegerKeyword_26_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_26__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_26__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4200:1: rule__DataTypeTest__Group_26__1 : rule__DataTypeTest__Group_26__1__Impl ;
    public final void rule__DataTypeTest__Group_26__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4204:1: ( rule__DataTypeTest__Group_26__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4205:2: rule__DataTypeTest__Group_26__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_26__1__Impl_in_rule__DataTypeTest__Group_26__18397);
            rule__DataTypeTest__Group_26__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_26__1"


    // $ANTLR start "rule__DataTypeTest__Group_26__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4211:1: rule__DataTypeTest__Group_26__1__Impl : ( ( rule__DataTypeTest__AIntegerAssignment_26_1 ) ) ;
    public final void rule__DataTypeTest__Group_26__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4215:1: ( ( ( rule__DataTypeTest__AIntegerAssignment_26_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4216:1: ( ( rule__DataTypeTest__AIntegerAssignment_26_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4216:1: ( ( rule__DataTypeTest__AIntegerAssignment_26_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4217:1: ( rule__DataTypeTest__AIntegerAssignment_26_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getAIntegerAssignment_26_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4218:1: ( rule__DataTypeTest__AIntegerAssignment_26_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4218:2: rule__DataTypeTest__AIntegerAssignment_26_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__AIntegerAssignment_26_1_in_rule__DataTypeTest__Group_26__1__Impl8424);
            rule__DataTypeTest__AIntegerAssignment_26_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getAIntegerAssignment_26_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_26__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_27__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4232:1: rule__DataTypeTest__Group_27__0 : rule__DataTypeTest__Group_27__0__Impl rule__DataTypeTest__Group_27__1 ;
    public final void rule__DataTypeTest__Group_27__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4236:1: ( rule__DataTypeTest__Group_27__0__Impl rule__DataTypeTest__Group_27__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4237:2: rule__DataTypeTest__Group_27__0__Impl rule__DataTypeTest__Group_27__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_27__0__Impl_in_rule__DataTypeTest__Group_27__08458);
            rule__DataTypeTest__Group_27__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_27__1_in_rule__DataTypeTest__Group_27__08461);
            rule__DataTypeTest__Group_27__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_27__0"


    // $ANTLR start "rule__DataTypeTest__Group_27__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4244:1: rule__DataTypeTest__Group_27__0__Impl : ( 'aLanguage' ) ;
    public final void rule__DataTypeTest__Group_27__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4248:1: ( ( 'aLanguage' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4249:1: ( 'aLanguage' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4249:1: ( 'aLanguage' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4250:1: 'aLanguage'
            {
             before(grammarAccess.getDataTypeTestAccess().getALanguageKeyword_27_0()); 
            match(input,79,FollowSets000.FOLLOW_79_in_rule__DataTypeTest__Group_27__0__Impl8489); 
             after(grammarAccess.getDataTypeTestAccess().getALanguageKeyword_27_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_27__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_27__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4263:1: rule__DataTypeTest__Group_27__1 : rule__DataTypeTest__Group_27__1__Impl ;
    public final void rule__DataTypeTest__Group_27__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4267:1: ( rule__DataTypeTest__Group_27__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4268:2: rule__DataTypeTest__Group_27__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_27__1__Impl_in_rule__DataTypeTest__Group_27__18520);
            rule__DataTypeTest__Group_27__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_27__1"


    // $ANTLR start "rule__DataTypeTest__Group_27__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4274:1: rule__DataTypeTest__Group_27__1__Impl : ( ( rule__DataTypeTest__ALanguageAssignment_27_1 ) ) ;
    public final void rule__DataTypeTest__Group_27__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4278:1: ( ( ( rule__DataTypeTest__ALanguageAssignment_27_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4279:1: ( ( rule__DataTypeTest__ALanguageAssignment_27_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4279:1: ( ( rule__DataTypeTest__ALanguageAssignment_27_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4280:1: ( rule__DataTypeTest__ALanguageAssignment_27_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getALanguageAssignment_27_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4281:1: ( rule__DataTypeTest__ALanguageAssignment_27_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4281:2: rule__DataTypeTest__ALanguageAssignment_27_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__ALanguageAssignment_27_1_in_rule__DataTypeTest__Group_27__1__Impl8547);
            rule__DataTypeTest__ALanguageAssignment_27_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getALanguageAssignment_27_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_27__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_28__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4295:1: rule__DataTypeTest__Group_28__0 : rule__DataTypeTest__Group_28__0__Impl rule__DataTypeTest__Group_28__1 ;
    public final void rule__DataTypeTest__Group_28__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4299:1: ( rule__DataTypeTest__Group_28__0__Impl rule__DataTypeTest__Group_28__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4300:2: rule__DataTypeTest__Group_28__0__Impl rule__DataTypeTest__Group_28__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_28__0__Impl_in_rule__DataTypeTest__Group_28__08581);
            rule__DataTypeTest__Group_28__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_28__1_in_rule__DataTypeTest__Group_28__08584);
            rule__DataTypeTest__Group_28__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_28__0"


    // $ANTLR start "rule__DataTypeTest__Group_28__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4307:1: rule__DataTypeTest__Group_28__0__Impl : ( 'aLong' ) ;
    public final void rule__DataTypeTest__Group_28__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4311:1: ( ( 'aLong' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4312:1: ( 'aLong' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4312:1: ( 'aLong' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4313:1: 'aLong'
            {
             before(grammarAccess.getDataTypeTestAccess().getALongKeyword_28_0()); 
            match(input,80,FollowSets000.FOLLOW_80_in_rule__DataTypeTest__Group_28__0__Impl8612); 
             after(grammarAccess.getDataTypeTestAccess().getALongKeyword_28_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_28__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_28__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4326:1: rule__DataTypeTest__Group_28__1 : rule__DataTypeTest__Group_28__1__Impl ;
    public final void rule__DataTypeTest__Group_28__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4330:1: ( rule__DataTypeTest__Group_28__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4331:2: rule__DataTypeTest__Group_28__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_28__1__Impl_in_rule__DataTypeTest__Group_28__18643);
            rule__DataTypeTest__Group_28__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_28__1"


    // $ANTLR start "rule__DataTypeTest__Group_28__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4337:1: rule__DataTypeTest__Group_28__1__Impl : ( ( rule__DataTypeTest__ALongAssignment_28_1 ) ) ;
    public final void rule__DataTypeTest__Group_28__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4341:1: ( ( ( rule__DataTypeTest__ALongAssignment_28_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4342:1: ( ( rule__DataTypeTest__ALongAssignment_28_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4342:1: ( ( rule__DataTypeTest__ALongAssignment_28_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4343:1: ( rule__DataTypeTest__ALongAssignment_28_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getALongAssignment_28_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4344:1: ( rule__DataTypeTest__ALongAssignment_28_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4344:2: rule__DataTypeTest__ALongAssignment_28_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__ALongAssignment_28_1_in_rule__DataTypeTest__Group_28__1__Impl8670);
            rule__DataTypeTest__ALongAssignment_28_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getALongAssignment_28_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_28__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_29__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4358:1: rule__DataTypeTest__Group_29__0 : rule__DataTypeTest__Group_29__0__Impl rule__DataTypeTest__Group_29__1 ;
    public final void rule__DataTypeTest__Group_29__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4362:1: ( rule__DataTypeTest__Group_29__0__Impl rule__DataTypeTest__Group_29__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4363:2: rule__DataTypeTest__Group_29__0__Impl rule__DataTypeTest__Group_29__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_29__0__Impl_in_rule__DataTypeTest__Group_29__08704);
            rule__DataTypeTest__Group_29__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_29__1_in_rule__DataTypeTest__Group_29__08707);
            rule__DataTypeTest__Group_29__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_29__0"


    // $ANTLR start "rule__DataTypeTest__Group_29__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4370:1: rule__DataTypeTest__Group_29__0__Impl : ( 'aName' ) ;
    public final void rule__DataTypeTest__Group_29__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4374:1: ( ( 'aName' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4375:1: ( 'aName' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4375:1: ( 'aName' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4376:1: 'aName'
            {
             before(grammarAccess.getDataTypeTestAccess().getANameKeyword_29_0()); 
            match(input,81,FollowSets000.FOLLOW_81_in_rule__DataTypeTest__Group_29__0__Impl8735); 
             after(grammarAccess.getDataTypeTestAccess().getANameKeyword_29_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_29__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_29__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4389:1: rule__DataTypeTest__Group_29__1 : rule__DataTypeTest__Group_29__1__Impl ;
    public final void rule__DataTypeTest__Group_29__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4393:1: ( rule__DataTypeTest__Group_29__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4394:2: rule__DataTypeTest__Group_29__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_29__1__Impl_in_rule__DataTypeTest__Group_29__18766);
            rule__DataTypeTest__Group_29__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_29__1"


    // $ANTLR start "rule__DataTypeTest__Group_29__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4400:1: rule__DataTypeTest__Group_29__1__Impl : ( ( rule__DataTypeTest__ANameAssignment_29_1 ) ) ;
    public final void rule__DataTypeTest__Group_29__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4404:1: ( ( ( rule__DataTypeTest__ANameAssignment_29_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4405:1: ( ( rule__DataTypeTest__ANameAssignment_29_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4405:1: ( ( rule__DataTypeTest__ANameAssignment_29_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4406:1: ( rule__DataTypeTest__ANameAssignment_29_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getANameAssignment_29_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4407:1: ( rule__DataTypeTest__ANameAssignment_29_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4407:2: rule__DataTypeTest__ANameAssignment_29_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__ANameAssignment_29_1_in_rule__DataTypeTest__Group_29__1__Impl8793);
            rule__DataTypeTest__ANameAssignment_29_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getANameAssignment_29_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_29__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_30__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4421:1: rule__DataTypeTest__Group_30__0 : rule__DataTypeTest__Group_30__0__Impl rule__DataTypeTest__Group_30__1 ;
    public final void rule__DataTypeTest__Group_30__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4425:1: ( rule__DataTypeTest__Group_30__0__Impl rule__DataTypeTest__Group_30__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4426:2: rule__DataTypeTest__Group_30__0__Impl rule__DataTypeTest__Group_30__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_30__0__Impl_in_rule__DataTypeTest__Group_30__08827);
            rule__DataTypeTest__Group_30__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_30__1_in_rule__DataTypeTest__Group_30__08830);
            rule__DataTypeTest__Group_30__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_30__0"


    // $ANTLR start "rule__DataTypeTest__Group_30__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4433:1: rule__DataTypeTest__Group_30__0__Impl : ( 'aNCName' ) ;
    public final void rule__DataTypeTest__Group_30__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4437:1: ( ( 'aNCName' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4438:1: ( 'aNCName' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4438:1: ( 'aNCName' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4439:1: 'aNCName'
            {
             before(grammarAccess.getDataTypeTestAccess().getANCNameKeyword_30_0()); 
            match(input,82,FollowSets000.FOLLOW_82_in_rule__DataTypeTest__Group_30__0__Impl8858); 
             after(grammarAccess.getDataTypeTestAccess().getANCNameKeyword_30_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_30__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_30__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4452:1: rule__DataTypeTest__Group_30__1 : rule__DataTypeTest__Group_30__1__Impl ;
    public final void rule__DataTypeTest__Group_30__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4456:1: ( rule__DataTypeTest__Group_30__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4457:2: rule__DataTypeTest__Group_30__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_30__1__Impl_in_rule__DataTypeTest__Group_30__18889);
            rule__DataTypeTest__Group_30__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_30__1"


    // $ANTLR start "rule__DataTypeTest__Group_30__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4463:1: rule__DataTypeTest__Group_30__1__Impl : ( ( rule__DataTypeTest__ANCNameAssignment_30_1 ) ) ;
    public final void rule__DataTypeTest__Group_30__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4467:1: ( ( ( rule__DataTypeTest__ANCNameAssignment_30_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4468:1: ( ( rule__DataTypeTest__ANCNameAssignment_30_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4468:1: ( ( rule__DataTypeTest__ANCNameAssignment_30_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4469:1: ( rule__DataTypeTest__ANCNameAssignment_30_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getANCNameAssignment_30_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4470:1: ( rule__DataTypeTest__ANCNameAssignment_30_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4470:2: rule__DataTypeTest__ANCNameAssignment_30_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__ANCNameAssignment_30_1_in_rule__DataTypeTest__Group_30__1__Impl8916);
            rule__DataTypeTest__ANCNameAssignment_30_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getANCNameAssignment_30_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_30__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_31__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4484:1: rule__DataTypeTest__Group_31__0 : rule__DataTypeTest__Group_31__0__Impl rule__DataTypeTest__Group_31__1 ;
    public final void rule__DataTypeTest__Group_31__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4488:1: ( rule__DataTypeTest__Group_31__0__Impl rule__DataTypeTest__Group_31__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4489:2: rule__DataTypeTest__Group_31__0__Impl rule__DataTypeTest__Group_31__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_31__0__Impl_in_rule__DataTypeTest__Group_31__08950);
            rule__DataTypeTest__Group_31__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_31__1_in_rule__DataTypeTest__Group_31__08953);
            rule__DataTypeTest__Group_31__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_31__0"


    // $ANTLR start "rule__DataTypeTest__Group_31__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4496:1: rule__DataTypeTest__Group_31__0__Impl : ( 'aNMTOKEN' ) ;
    public final void rule__DataTypeTest__Group_31__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4500:1: ( ( 'aNMTOKEN' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4501:1: ( 'aNMTOKEN' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4501:1: ( 'aNMTOKEN' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4502:1: 'aNMTOKEN'
            {
             before(grammarAccess.getDataTypeTestAccess().getANMTOKENKeyword_31_0()); 
            match(input,83,FollowSets000.FOLLOW_83_in_rule__DataTypeTest__Group_31__0__Impl8981); 
             after(grammarAccess.getDataTypeTestAccess().getANMTOKENKeyword_31_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_31__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_31__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4515:1: rule__DataTypeTest__Group_31__1 : rule__DataTypeTest__Group_31__1__Impl ;
    public final void rule__DataTypeTest__Group_31__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4519:1: ( rule__DataTypeTest__Group_31__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4520:2: rule__DataTypeTest__Group_31__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_31__1__Impl_in_rule__DataTypeTest__Group_31__19012);
            rule__DataTypeTest__Group_31__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_31__1"


    // $ANTLR start "rule__DataTypeTest__Group_31__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4526:1: rule__DataTypeTest__Group_31__1__Impl : ( ( rule__DataTypeTest__ANMTOKENAssignment_31_1 ) ) ;
    public final void rule__DataTypeTest__Group_31__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4530:1: ( ( ( rule__DataTypeTest__ANMTOKENAssignment_31_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4531:1: ( ( rule__DataTypeTest__ANMTOKENAssignment_31_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4531:1: ( ( rule__DataTypeTest__ANMTOKENAssignment_31_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4532:1: ( rule__DataTypeTest__ANMTOKENAssignment_31_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getANMTOKENAssignment_31_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4533:1: ( rule__DataTypeTest__ANMTOKENAssignment_31_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4533:2: rule__DataTypeTest__ANMTOKENAssignment_31_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__ANMTOKENAssignment_31_1_in_rule__DataTypeTest__Group_31__1__Impl9039);
            rule__DataTypeTest__ANMTOKENAssignment_31_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getANMTOKENAssignment_31_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_31__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_32__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4547:1: rule__DataTypeTest__Group_32__0 : rule__DataTypeTest__Group_32__0__Impl rule__DataTypeTest__Group_32__1 ;
    public final void rule__DataTypeTest__Group_32__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4551:1: ( rule__DataTypeTest__Group_32__0__Impl rule__DataTypeTest__Group_32__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4552:2: rule__DataTypeTest__Group_32__0__Impl rule__DataTypeTest__Group_32__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_32__0__Impl_in_rule__DataTypeTest__Group_32__09073);
            rule__DataTypeTest__Group_32__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_32__1_in_rule__DataTypeTest__Group_32__09076);
            rule__DataTypeTest__Group_32__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_32__0"


    // $ANTLR start "rule__DataTypeTest__Group_32__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4559:1: rule__DataTypeTest__Group_32__0__Impl : ( 'aNMTOKENS' ) ;
    public final void rule__DataTypeTest__Group_32__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4563:1: ( ( 'aNMTOKENS' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4564:1: ( 'aNMTOKENS' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4564:1: ( 'aNMTOKENS' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4565:1: 'aNMTOKENS'
            {
             before(grammarAccess.getDataTypeTestAccess().getANMTOKENSKeyword_32_0()); 
            match(input,84,FollowSets000.FOLLOW_84_in_rule__DataTypeTest__Group_32__0__Impl9104); 
             after(grammarAccess.getDataTypeTestAccess().getANMTOKENSKeyword_32_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_32__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_32__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4578:1: rule__DataTypeTest__Group_32__1 : rule__DataTypeTest__Group_32__1__Impl ;
    public final void rule__DataTypeTest__Group_32__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4582:1: ( rule__DataTypeTest__Group_32__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4583:2: rule__DataTypeTest__Group_32__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_32__1__Impl_in_rule__DataTypeTest__Group_32__19135);
            rule__DataTypeTest__Group_32__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_32__1"


    // $ANTLR start "rule__DataTypeTest__Group_32__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4589:1: rule__DataTypeTest__Group_32__1__Impl : ( ( rule__DataTypeTest__ANMTOKENSAssignment_32_1 ) ) ;
    public final void rule__DataTypeTest__Group_32__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4593:1: ( ( ( rule__DataTypeTest__ANMTOKENSAssignment_32_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4594:1: ( ( rule__DataTypeTest__ANMTOKENSAssignment_32_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4594:1: ( ( rule__DataTypeTest__ANMTOKENSAssignment_32_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4595:1: ( rule__DataTypeTest__ANMTOKENSAssignment_32_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getANMTOKENSAssignment_32_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4596:1: ( rule__DataTypeTest__ANMTOKENSAssignment_32_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4596:2: rule__DataTypeTest__ANMTOKENSAssignment_32_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__ANMTOKENSAssignment_32_1_in_rule__DataTypeTest__Group_32__1__Impl9162);
            rule__DataTypeTest__ANMTOKENSAssignment_32_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getANMTOKENSAssignment_32_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_32__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_33__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4610:1: rule__DataTypeTest__Group_33__0 : rule__DataTypeTest__Group_33__0__Impl rule__DataTypeTest__Group_33__1 ;
    public final void rule__DataTypeTest__Group_33__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4614:1: ( rule__DataTypeTest__Group_33__0__Impl rule__DataTypeTest__Group_33__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4615:2: rule__DataTypeTest__Group_33__0__Impl rule__DataTypeTest__Group_33__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_33__0__Impl_in_rule__DataTypeTest__Group_33__09196);
            rule__DataTypeTest__Group_33__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_33__1_in_rule__DataTypeTest__Group_33__09199);
            rule__DataTypeTest__Group_33__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_33__0"


    // $ANTLR start "rule__DataTypeTest__Group_33__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4622:1: rule__DataTypeTest__Group_33__0__Impl : ( 'aNonNegativeInteger' ) ;
    public final void rule__DataTypeTest__Group_33__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4626:1: ( ( 'aNonNegativeInteger' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4627:1: ( 'aNonNegativeInteger' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4627:1: ( 'aNonNegativeInteger' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4628:1: 'aNonNegativeInteger'
            {
             before(grammarAccess.getDataTypeTestAccess().getANonNegativeIntegerKeyword_33_0()); 
            match(input,85,FollowSets000.FOLLOW_85_in_rule__DataTypeTest__Group_33__0__Impl9227); 
             after(grammarAccess.getDataTypeTestAccess().getANonNegativeIntegerKeyword_33_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_33__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_33__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4641:1: rule__DataTypeTest__Group_33__1 : rule__DataTypeTest__Group_33__1__Impl ;
    public final void rule__DataTypeTest__Group_33__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4645:1: ( rule__DataTypeTest__Group_33__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4646:2: rule__DataTypeTest__Group_33__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_33__1__Impl_in_rule__DataTypeTest__Group_33__19258);
            rule__DataTypeTest__Group_33__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_33__1"


    // $ANTLR start "rule__DataTypeTest__Group_33__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4652:1: rule__DataTypeTest__Group_33__1__Impl : ( ( rule__DataTypeTest__ANonNegativeIntegerAssignment_33_1 ) ) ;
    public final void rule__DataTypeTest__Group_33__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4656:1: ( ( ( rule__DataTypeTest__ANonNegativeIntegerAssignment_33_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4657:1: ( ( rule__DataTypeTest__ANonNegativeIntegerAssignment_33_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4657:1: ( ( rule__DataTypeTest__ANonNegativeIntegerAssignment_33_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4658:1: ( rule__DataTypeTest__ANonNegativeIntegerAssignment_33_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getANonNegativeIntegerAssignment_33_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4659:1: ( rule__DataTypeTest__ANonNegativeIntegerAssignment_33_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4659:2: rule__DataTypeTest__ANonNegativeIntegerAssignment_33_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__ANonNegativeIntegerAssignment_33_1_in_rule__DataTypeTest__Group_33__1__Impl9285);
            rule__DataTypeTest__ANonNegativeIntegerAssignment_33_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getANonNegativeIntegerAssignment_33_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_33__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_34__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4673:1: rule__DataTypeTest__Group_34__0 : rule__DataTypeTest__Group_34__0__Impl rule__DataTypeTest__Group_34__1 ;
    public final void rule__DataTypeTest__Group_34__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4677:1: ( rule__DataTypeTest__Group_34__0__Impl rule__DataTypeTest__Group_34__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4678:2: rule__DataTypeTest__Group_34__0__Impl rule__DataTypeTest__Group_34__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_34__0__Impl_in_rule__DataTypeTest__Group_34__09319);
            rule__DataTypeTest__Group_34__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_34__1_in_rule__DataTypeTest__Group_34__09322);
            rule__DataTypeTest__Group_34__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_34__0"


    // $ANTLR start "rule__DataTypeTest__Group_34__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4685:1: rule__DataTypeTest__Group_34__0__Impl : ( 'aNonPositiveInteger' ) ;
    public final void rule__DataTypeTest__Group_34__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4689:1: ( ( 'aNonPositiveInteger' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4690:1: ( 'aNonPositiveInteger' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4690:1: ( 'aNonPositiveInteger' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4691:1: 'aNonPositiveInteger'
            {
             before(grammarAccess.getDataTypeTestAccess().getANonPositiveIntegerKeyword_34_0()); 
            match(input,86,FollowSets000.FOLLOW_86_in_rule__DataTypeTest__Group_34__0__Impl9350); 
             after(grammarAccess.getDataTypeTestAccess().getANonPositiveIntegerKeyword_34_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_34__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_34__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4704:1: rule__DataTypeTest__Group_34__1 : rule__DataTypeTest__Group_34__1__Impl ;
    public final void rule__DataTypeTest__Group_34__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4708:1: ( rule__DataTypeTest__Group_34__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4709:2: rule__DataTypeTest__Group_34__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_34__1__Impl_in_rule__DataTypeTest__Group_34__19381);
            rule__DataTypeTest__Group_34__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_34__1"


    // $ANTLR start "rule__DataTypeTest__Group_34__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4715:1: rule__DataTypeTest__Group_34__1__Impl : ( ( rule__DataTypeTest__ANonPositiveIntegerAssignment_34_1 ) ) ;
    public final void rule__DataTypeTest__Group_34__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4719:1: ( ( ( rule__DataTypeTest__ANonPositiveIntegerAssignment_34_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4720:1: ( ( rule__DataTypeTest__ANonPositiveIntegerAssignment_34_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4720:1: ( ( rule__DataTypeTest__ANonPositiveIntegerAssignment_34_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4721:1: ( rule__DataTypeTest__ANonPositiveIntegerAssignment_34_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getANonPositiveIntegerAssignment_34_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4722:1: ( rule__DataTypeTest__ANonPositiveIntegerAssignment_34_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4722:2: rule__DataTypeTest__ANonPositiveIntegerAssignment_34_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__ANonPositiveIntegerAssignment_34_1_in_rule__DataTypeTest__Group_34__1__Impl9408);
            rule__DataTypeTest__ANonPositiveIntegerAssignment_34_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getANonPositiveIntegerAssignment_34_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_34__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_35__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4736:1: rule__DataTypeTest__Group_35__0 : rule__DataTypeTest__Group_35__0__Impl rule__DataTypeTest__Group_35__1 ;
    public final void rule__DataTypeTest__Group_35__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4740:1: ( rule__DataTypeTest__Group_35__0__Impl rule__DataTypeTest__Group_35__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4741:2: rule__DataTypeTest__Group_35__0__Impl rule__DataTypeTest__Group_35__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_35__0__Impl_in_rule__DataTypeTest__Group_35__09442);
            rule__DataTypeTest__Group_35__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_35__1_in_rule__DataTypeTest__Group_35__09445);
            rule__DataTypeTest__Group_35__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_35__0"


    // $ANTLR start "rule__DataTypeTest__Group_35__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4748:1: rule__DataTypeTest__Group_35__0__Impl : ( 'aPositiveInteger' ) ;
    public final void rule__DataTypeTest__Group_35__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4752:1: ( ( 'aPositiveInteger' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4753:1: ( 'aPositiveInteger' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4753:1: ( 'aPositiveInteger' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4754:1: 'aPositiveInteger'
            {
             before(grammarAccess.getDataTypeTestAccess().getAPositiveIntegerKeyword_35_0()); 
            match(input,87,FollowSets000.FOLLOW_87_in_rule__DataTypeTest__Group_35__0__Impl9473); 
             after(grammarAccess.getDataTypeTestAccess().getAPositiveIntegerKeyword_35_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_35__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_35__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4767:1: rule__DataTypeTest__Group_35__1 : rule__DataTypeTest__Group_35__1__Impl ;
    public final void rule__DataTypeTest__Group_35__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4771:1: ( rule__DataTypeTest__Group_35__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4772:2: rule__DataTypeTest__Group_35__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_35__1__Impl_in_rule__DataTypeTest__Group_35__19504);
            rule__DataTypeTest__Group_35__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_35__1"


    // $ANTLR start "rule__DataTypeTest__Group_35__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4778:1: rule__DataTypeTest__Group_35__1__Impl : ( ( rule__DataTypeTest__APositiveIntegerAssignment_35_1 ) ) ;
    public final void rule__DataTypeTest__Group_35__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4782:1: ( ( ( rule__DataTypeTest__APositiveIntegerAssignment_35_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4783:1: ( ( rule__DataTypeTest__APositiveIntegerAssignment_35_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4783:1: ( ( rule__DataTypeTest__APositiveIntegerAssignment_35_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4784:1: ( rule__DataTypeTest__APositiveIntegerAssignment_35_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getAPositiveIntegerAssignment_35_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4785:1: ( rule__DataTypeTest__APositiveIntegerAssignment_35_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4785:2: rule__DataTypeTest__APositiveIntegerAssignment_35_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__APositiveIntegerAssignment_35_1_in_rule__DataTypeTest__Group_35__1__Impl9531);
            rule__DataTypeTest__APositiveIntegerAssignment_35_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getAPositiveIntegerAssignment_35_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_35__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_36__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4799:1: rule__DataTypeTest__Group_36__0 : rule__DataTypeTest__Group_36__0__Impl rule__DataTypeTest__Group_36__1 ;
    public final void rule__DataTypeTest__Group_36__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4803:1: ( rule__DataTypeTest__Group_36__0__Impl rule__DataTypeTest__Group_36__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4804:2: rule__DataTypeTest__Group_36__0__Impl rule__DataTypeTest__Group_36__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_36__0__Impl_in_rule__DataTypeTest__Group_36__09565);
            rule__DataTypeTest__Group_36__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_36__1_in_rule__DataTypeTest__Group_36__09568);
            rule__DataTypeTest__Group_36__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_36__0"


    // $ANTLR start "rule__DataTypeTest__Group_36__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4811:1: rule__DataTypeTest__Group_36__0__Impl : ( 'aQName' ) ;
    public final void rule__DataTypeTest__Group_36__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4815:1: ( ( 'aQName' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4816:1: ( 'aQName' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4816:1: ( 'aQName' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4817:1: 'aQName'
            {
             before(grammarAccess.getDataTypeTestAccess().getAQNameKeyword_36_0()); 
            match(input,88,FollowSets000.FOLLOW_88_in_rule__DataTypeTest__Group_36__0__Impl9596); 
             after(grammarAccess.getDataTypeTestAccess().getAQNameKeyword_36_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_36__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_36__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4830:1: rule__DataTypeTest__Group_36__1 : rule__DataTypeTest__Group_36__1__Impl ;
    public final void rule__DataTypeTest__Group_36__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4834:1: ( rule__DataTypeTest__Group_36__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4835:2: rule__DataTypeTest__Group_36__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_36__1__Impl_in_rule__DataTypeTest__Group_36__19627);
            rule__DataTypeTest__Group_36__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_36__1"


    // $ANTLR start "rule__DataTypeTest__Group_36__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4841:1: rule__DataTypeTest__Group_36__1__Impl : ( ( rule__DataTypeTest__AQNameAssignment_36_1 ) ) ;
    public final void rule__DataTypeTest__Group_36__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4845:1: ( ( ( rule__DataTypeTest__AQNameAssignment_36_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4846:1: ( ( rule__DataTypeTest__AQNameAssignment_36_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4846:1: ( ( rule__DataTypeTest__AQNameAssignment_36_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4847:1: ( rule__DataTypeTest__AQNameAssignment_36_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getAQNameAssignment_36_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4848:1: ( rule__DataTypeTest__AQNameAssignment_36_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4848:2: rule__DataTypeTest__AQNameAssignment_36_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__AQNameAssignment_36_1_in_rule__DataTypeTest__Group_36__1__Impl9654);
            rule__DataTypeTest__AQNameAssignment_36_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getAQNameAssignment_36_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_36__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_37__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4862:1: rule__DataTypeTest__Group_37__0 : rule__DataTypeTest__Group_37__0__Impl rule__DataTypeTest__Group_37__1 ;
    public final void rule__DataTypeTest__Group_37__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4866:1: ( rule__DataTypeTest__Group_37__0__Impl rule__DataTypeTest__Group_37__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4867:2: rule__DataTypeTest__Group_37__0__Impl rule__DataTypeTest__Group_37__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_37__0__Impl_in_rule__DataTypeTest__Group_37__09688);
            rule__DataTypeTest__Group_37__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_37__1_in_rule__DataTypeTest__Group_37__09691);
            rule__DataTypeTest__Group_37__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_37__0"


    // $ANTLR start "rule__DataTypeTest__Group_37__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4874:1: rule__DataTypeTest__Group_37__0__Impl : ( 'aShort' ) ;
    public final void rule__DataTypeTest__Group_37__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4878:1: ( ( 'aShort' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4879:1: ( 'aShort' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4879:1: ( 'aShort' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4880:1: 'aShort'
            {
             before(grammarAccess.getDataTypeTestAccess().getAShortKeyword_37_0()); 
            match(input,89,FollowSets000.FOLLOW_89_in_rule__DataTypeTest__Group_37__0__Impl9719); 
             after(grammarAccess.getDataTypeTestAccess().getAShortKeyword_37_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_37__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_37__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4893:1: rule__DataTypeTest__Group_37__1 : rule__DataTypeTest__Group_37__1__Impl ;
    public final void rule__DataTypeTest__Group_37__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4897:1: ( rule__DataTypeTest__Group_37__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4898:2: rule__DataTypeTest__Group_37__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_37__1__Impl_in_rule__DataTypeTest__Group_37__19750);
            rule__DataTypeTest__Group_37__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_37__1"


    // $ANTLR start "rule__DataTypeTest__Group_37__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4904:1: rule__DataTypeTest__Group_37__1__Impl : ( ( rule__DataTypeTest__AShortAssignment_37_1 ) ) ;
    public final void rule__DataTypeTest__Group_37__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4908:1: ( ( ( rule__DataTypeTest__AShortAssignment_37_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4909:1: ( ( rule__DataTypeTest__AShortAssignment_37_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4909:1: ( ( rule__DataTypeTest__AShortAssignment_37_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4910:1: ( rule__DataTypeTest__AShortAssignment_37_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getAShortAssignment_37_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4911:1: ( rule__DataTypeTest__AShortAssignment_37_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4911:2: rule__DataTypeTest__AShortAssignment_37_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__AShortAssignment_37_1_in_rule__DataTypeTest__Group_37__1__Impl9777);
            rule__DataTypeTest__AShortAssignment_37_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getAShortAssignment_37_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_37__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_38__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4925:1: rule__DataTypeTest__Group_38__0 : rule__DataTypeTest__Group_38__0__Impl rule__DataTypeTest__Group_38__1 ;
    public final void rule__DataTypeTest__Group_38__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4929:1: ( rule__DataTypeTest__Group_38__0__Impl rule__DataTypeTest__Group_38__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4930:2: rule__DataTypeTest__Group_38__0__Impl rule__DataTypeTest__Group_38__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_38__0__Impl_in_rule__DataTypeTest__Group_38__09811);
            rule__DataTypeTest__Group_38__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_38__1_in_rule__DataTypeTest__Group_38__09814);
            rule__DataTypeTest__Group_38__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_38__0"


    // $ANTLR start "rule__DataTypeTest__Group_38__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4937:1: rule__DataTypeTest__Group_38__0__Impl : ( 'aString' ) ;
    public final void rule__DataTypeTest__Group_38__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4941:1: ( ( 'aString' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4942:1: ( 'aString' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4942:1: ( 'aString' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4943:1: 'aString'
            {
             before(grammarAccess.getDataTypeTestAccess().getAStringKeyword_38_0()); 
            match(input,90,FollowSets000.FOLLOW_90_in_rule__DataTypeTest__Group_38__0__Impl9842); 
             after(grammarAccess.getDataTypeTestAccess().getAStringKeyword_38_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_38__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_38__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4956:1: rule__DataTypeTest__Group_38__1 : rule__DataTypeTest__Group_38__1__Impl ;
    public final void rule__DataTypeTest__Group_38__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4960:1: ( rule__DataTypeTest__Group_38__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4961:2: rule__DataTypeTest__Group_38__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_38__1__Impl_in_rule__DataTypeTest__Group_38__19873);
            rule__DataTypeTest__Group_38__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_38__1"


    // $ANTLR start "rule__DataTypeTest__Group_38__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4967:1: rule__DataTypeTest__Group_38__1__Impl : ( ( rule__DataTypeTest__AStringAssignment_38_1 ) ) ;
    public final void rule__DataTypeTest__Group_38__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4971:1: ( ( ( rule__DataTypeTest__AStringAssignment_38_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4972:1: ( ( rule__DataTypeTest__AStringAssignment_38_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4972:1: ( ( rule__DataTypeTest__AStringAssignment_38_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4973:1: ( rule__DataTypeTest__AStringAssignment_38_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getAStringAssignment_38_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4974:1: ( rule__DataTypeTest__AStringAssignment_38_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4974:2: rule__DataTypeTest__AStringAssignment_38_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__AStringAssignment_38_1_in_rule__DataTypeTest__Group_38__1__Impl9900);
            rule__DataTypeTest__AStringAssignment_38_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getAStringAssignment_38_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_38__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_39__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4988:1: rule__DataTypeTest__Group_39__0 : rule__DataTypeTest__Group_39__0__Impl rule__DataTypeTest__Group_39__1 ;
    public final void rule__DataTypeTest__Group_39__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4992:1: ( rule__DataTypeTest__Group_39__0__Impl rule__DataTypeTest__Group_39__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:4993:2: rule__DataTypeTest__Group_39__0__Impl rule__DataTypeTest__Group_39__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_39__0__Impl_in_rule__DataTypeTest__Group_39__09934);
            rule__DataTypeTest__Group_39__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_39__1_in_rule__DataTypeTest__Group_39__09937);
            rule__DataTypeTest__Group_39__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_39__0"


    // $ANTLR start "rule__DataTypeTest__Group_39__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5000:1: rule__DataTypeTest__Group_39__0__Impl : ( 'aTime' ) ;
    public final void rule__DataTypeTest__Group_39__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5004:1: ( ( 'aTime' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5005:1: ( 'aTime' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5005:1: ( 'aTime' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5006:1: 'aTime'
            {
             before(grammarAccess.getDataTypeTestAccess().getATimeKeyword_39_0()); 
            match(input,91,FollowSets000.FOLLOW_91_in_rule__DataTypeTest__Group_39__0__Impl9965); 
             after(grammarAccess.getDataTypeTestAccess().getATimeKeyword_39_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_39__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_39__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5019:1: rule__DataTypeTest__Group_39__1 : rule__DataTypeTest__Group_39__1__Impl ;
    public final void rule__DataTypeTest__Group_39__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5023:1: ( rule__DataTypeTest__Group_39__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5024:2: rule__DataTypeTest__Group_39__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_39__1__Impl_in_rule__DataTypeTest__Group_39__19996);
            rule__DataTypeTest__Group_39__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_39__1"


    // $ANTLR start "rule__DataTypeTest__Group_39__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5030:1: rule__DataTypeTest__Group_39__1__Impl : ( ( rule__DataTypeTest__ATimeAssignment_39_1 ) ) ;
    public final void rule__DataTypeTest__Group_39__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5034:1: ( ( ( rule__DataTypeTest__ATimeAssignment_39_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5035:1: ( ( rule__DataTypeTest__ATimeAssignment_39_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5035:1: ( ( rule__DataTypeTest__ATimeAssignment_39_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5036:1: ( rule__DataTypeTest__ATimeAssignment_39_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getATimeAssignment_39_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5037:1: ( rule__DataTypeTest__ATimeAssignment_39_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5037:2: rule__DataTypeTest__ATimeAssignment_39_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__ATimeAssignment_39_1_in_rule__DataTypeTest__Group_39__1__Impl10023);
            rule__DataTypeTest__ATimeAssignment_39_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getATimeAssignment_39_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_39__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_40__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5051:1: rule__DataTypeTest__Group_40__0 : rule__DataTypeTest__Group_40__0__Impl rule__DataTypeTest__Group_40__1 ;
    public final void rule__DataTypeTest__Group_40__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5055:1: ( rule__DataTypeTest__Group_40__0__Impl rule__DataTypeTest__Group_40__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5056:2: rule__DataTypeTest__Group_40__0__Impl rule__DataTypeTest__Group_40__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_40__0__Impl_in_rule__DataTypeTest__Group_40__010057);
            rule__DataTypeTest__Group_40__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_40__1_in_rule__DataTypeTest__Group_40__010060);
            rule__DataTypeTest__Group_40__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_40__0"


    // $ANTLR start "rule__DataTypeTest__Group_40__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5063:1: rule__DataTypeTest__Group_40__0__Impl : ( 'aToken' ) ;
    public final void rule__DataTypeTest__Group_40__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5067:1: ( ( 'aToken' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5068:1: ( 'aToken' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5068:1: ( 'aToken' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5069:1: 'aToken'
            {
             before(grammarAccess.getDataTypeTestAccess().getATokenKeyword_40_0()); 
            match(input,92,FollowSets000.FOLLOW_92_in_rule__DataTypeTest__Group_40__0__Impl10088); 
             after(grammarAccess.getDataTypeTestAccess().getATokenKeyword_40_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_40__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_40__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5082:1: rule__DataTypeTest__Group_40__1 : rule__DataTypeTest__Group_40__1__Impl ;
    public final void rule__DataTypeTest__Group_40__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5086:1: ( rule__DataTypeTest__Group_40__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5087:2: rule__DataTypeTest__Group_40__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_40__1__Impl_in_rule__DataTypeTest__Group_40__110119);
            rule__DataTypeTest__Group_40__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_40__1"


    // $ANTLR start "rule__DataTypeTest__Group_40__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5093:1: rule__DataTypeTest__Group_40__1__Impl : ( ( rule__DataTypeTest__ATokenAssignment_40_1 ) ) ;
    public final void rule__DataTypeTest__Group_40__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5097:1: ( ( ( rule__DataTypeTest__ATokenAssignment_40_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5098:1: ( ( rule__DataTypeTest__ATokenAssignment_40_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5098:1: ( ( rule__DataTypeTest__ATokenAssignment_40_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5099:1: ( rule__DataTypeTest__ATokenAssignment_40_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getATokenAssignment_40_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5100:1: ( rule__DataTypeTest__ATokenAssignment_40_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5100:2: rule__DataTypeTest__ATokenAssignment_40_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__ATokenAssignment_40_1_in_rule__DataTypeTest__Group_40__1__Impl10146);
            rule__DataTypeTest__ATokenAssignment_40_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getATokenAssignment_40_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_40__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_41__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5114:1: rule__DataTypeTest__Group_41__0 : rule__DataTypeTest__Group_41__0__Impl rule__DataTypeTest__Group_41__1 ;
    public final void rule__DataTypeTest__Group_41__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5118:1: ( rule__DataTypeTest__Group_41__0__Impl rule__DataTypeTest__Group_41__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5119:2: rule__DataTypeTest__Group_41__0__Impl rule__DataTypeTest__Group_41__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_41__0__Impl_in_rule__DataTypeTest__Group_41__010180);
            rule__DataTypeTest__Group_41__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_41__1_in_rule__DataTypeTest__Group_41__010183);
            rule__DataTypeTest__Group_41__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_41__0"


    // $ANTLR start "rule__DataTypeTest__Group_41__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5126:1: rule__DataTypeTest__Group_41__0__Impl : ( 'aUnsignedByte' ) ;
    public final void rule__DataTypeTest__Group_41__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5130:1: ( ( 'aUnsignedByte' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5131:1: ( 'aUnsignedByte' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5131:1: ( 'aUnsignedByte' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5132:1: 'aUnsignedByte'
            {
             before(grammarAccess.getDataTypeTestAccess().getAUnsignedByteKeyword_41_0()); 
            match(input,93,FollowSets000.FOLLOW_93_in_rule__DataTypeTest__Group_41__0__Impl10211); 
             after(grammarAccess.getDataTypeTestAccess().getAUnsignedByteKeyword_41_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_41__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_41__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5145:1: rule__DataTypeTest__Group_41__1 : rule__DataTypeTest__Group_41__1__Impl ;
    public final void rule__DataTypeTest__Group_41__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5149:1: ( rule__DataTypeTest__Group_41__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5150:2: rule__DataTypeTest__Group_41__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_41__1__Impl_in_rule__DataTypeTest__Group_41__110242);
            rule__DataTypeTest__Group_41__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_41__1"


    // $ANTLR start "rule__DataTypeTest__Group_41__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5156:1: rule__DataTypeTest__Group_41__1__Impl : ( ( rule__DataTypeTest__AUnsignedByteAssignment_41_1 ) ) ;
    public final void rule__DataTypeTest__Group_41__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5160:1: ( ( ( rule__DataTypeTest__AUnsignedByteAssignment_41_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5161:1: ( ( rule__DataTypeTest__AUnsignedByteAssignment_41_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5161:1: ( ( rule__DataTypeTest__AUnsignedByteAssignment_41_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5162:1: ( rule__DataTypeTest__AUnsignedByteAssignment_41_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getAUnsignedByteAssignment_41_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5163:1: ( rule__DataTypeTest__AUnsignedByteAssignment_41_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5163:2: rule__DataTypeTest__AUnsignedByteAssignment_41_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__AUnsignedByteAssignment_41_1_in_rule__DataTypeTest__Group_41__1__Impl10269);
            rule__DataTypeTest__AUnsignedByteAssignment_41_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getAUnsignedByteAssignment_41_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_41__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_42__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5177:1: rule__DataTypeTest__Group_42__0 : rule__DataTypeTest__Group_42__0__Impl rule__DataTypeTest__Group_42__1 ;
    public final void rule__DataTypeTest__Group_42__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5181:1: ( rule__DataTypeTest__Group_42__0__Impl rule__DataTypeTest__Group_42__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5182:2: rule__DataTypeTest__Group_42__0__Impl rule__DataTypeTest__Group_42__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_42__0__Impl_in_rule__DataTypeTest__Group_42__010303);
            rule__DataTypeTest__Group_42__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_42__1_in_rule__DataTypeTest__Group_42__010306);
            rule__DataTypeTest__Group_42__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_42__0"


    // $ANTLR start "rule__DataTypeTest__Group_42__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5189:1: rule__DataTypeTest__Group_42__0__Impl : ( 'aUnsignedInt' ) ;
    public final void rule__DataTypeTest__Group_42__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5193:1: ( ( 'aUnsignedInt' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5194:1: ( 'aUnsignedInt' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5194:1: ( 'aUnsignedInt' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5195:1: 'aUnsignedInt'
            {
             before(grammarAccess.getDataTypeTestAccess().getAUnsignedIntKeyword_42_0()); 
            match(input,94,FollowSets000.FOLLOW_94_in_rule__DataTypeTest__Group_42__0__Impl10334); 
             after(grammarAccess.getDataTypeTestAccess().getAUnsignedIntKeyword_42_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_42__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_42__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5208:1: rule__DataTypeTest__Group_42__1 : rule__DataTypeTest__Group_42__1__Impl ;
    public final void rule__DataTypeTest__Group_42__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5212:1: ( rule__DataTypeTest__Group_42__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5213:2: rule__DataTypeTest__Group_42__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_42__1__Impl_in_rule__DataTypeTest__Group_42__110365);
            rule__DataTypeTest__Group_42__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_42__1"


    // $ANTLR start "rule__DataTypeTest__Group_42__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5219:1: rule__DataTypeTest__Group_42__1__Impl : ( ( rule__DataTypeTest__AUnsignedIntAssignment_42_1 ) ) ;
    public final void rule__DataTypeTest__Group_42__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5223:1: ( ( ( rule__DataTypeTest__AUnsignedIntAssignment_42_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5224:1: ( ( rule__DataTypeTest__AUnsignedIntAssignment_42_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5224:1: ( ( rule__DataTypeTest__AUnsignedIntAssignment_42_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5225:1: ( rule__DataTypeTest__AUnsignedIntAssignment_42_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getAUnsignedIntAssignment_42_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5226:1: ( rule__DataTypeTest__AUnsignedIntAssignment_42_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5226:2: rule__DataTypeTest__AUnsignedIntAssignment_42_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__AUnsignedIntAssignment_42_1_in_rule__DataTypeTest__Group_42__1__Impl10392);
            rule__DataTypeTest__AUnsignedIntAssignment_42_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getAUnsignedIntAssignment_42_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_42__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_43__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5240:1: rule__DataTypeTest__Group_43__0 : rule__DataTypeTest__Group_43__0__Impl rule__DataTypeTest__Group_43__1 ;
    public final void rule__DataTypeTest__Group_43__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5244:1: ( rule__DataTypeTest__Group_43__0__Impl rule__DataTypeTest__Group_43__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5245:2: rule__DataTypeTest__Group_43__0__Impl rule__DataTypeTest__Group_43__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_43__0__Impl_in_rule__DataTypeTest__Group_43__010426);
            rule__DataTypeTest__Group_43__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_43__1_in_rule__DataTypeTest__Group_43__010429);
            rule__DataTypeTest__Group_43__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_43__0"


    // $ANTLR start "rule__DataTypeTest__Group_43__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5252:1: rule__DataTypeTest__Group_43__0__Impl : ( 'aUnsignedLong' ) ;
    public final void rule__DataTypeTest__Group_43__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5256:1: ( ( 'aUnsignedLong' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5257:1: ( 'aUnsignedLong' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5257:1: ( 'aUnsignedLong' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5258:1: 'aUnsignedLong'
            {
             before(grammarAccess.getDataTypeTestAccess().getAUnsignedLongKeyword_43_0()); 
            match(input,95,FollowSets000.FOLLOW_95_in_rule__DataTypeTest__Group_43__0__Impl10457); 
             after(grammarAccess.getDataTypeTestAccess().getAUnsignedLongKeyword_43_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_43__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_43__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5271:1: rule__DataTypeTest__Group_43__1 : rule__DataTypeTest__Group_43__1__Impl ;
    public final void rule__DataTypeTest__Group_43__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5275:1: ( rule__DataTypeTest__Group_43__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5276:2: rule__DataTypeTest__Group_43__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_43__1__Impl_in_rule__DataTypeTest__Group_43__110488);
            rule__DataTypeTest__Group_43__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_43__1"


    // $ANTLR start "rule__DataTypeTest__Group_43__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5282:1: rule__DataTypeTest__Group_43__1__Impl : ( ( rule__DataTypeTest__AUnsignedLongAssignment_43_1 ) ) ;
    public final void rule__DataTypeTest__Group_43__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5286:1: ( ( ( rule__DataTypeTest__AUnsignedLongAssignment_43_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5287:1: ( ( rule__DataTypeTest__AUnsignedLongAssignment_43_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5287:1: ( ( rule__DataTypeTest__AUnsignedLongAssignment_43_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5288:1: ( rule__DataTypeTest__AUnsignedLongAssignment_43_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getAUnsignedLongAssignment_43_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5289:1: ( rule__DataTypeTest__AUnsignedLongAssignment_43_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5289:2: rule__DataTypeTest__AUnsignedLongAssignment_43_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__AUnsignedLongAssignment_43_1_in_rule__DataTypeTest__Group_43__1__Impl10515);
            rule__DataTypeTest__AUnsignedLongAssignment_43_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getAUnsignedLongAssignment_43_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_43__1__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_44__0"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5303:1: rule__DataTypeTest__Group_44__0 : rule__DataTypeTest__Group_44__0__Impl rule__DataTypeTest__Group_44__1 ;
    public final void rule__DataTypeTest__Group_44__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5307:1: ( rule__DataTypeTest__Group_44__0__Impl rule__DataTypeTest__Group_44__1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5308:2: rule__DataTypeTest__Group_44__0__Impl rule__DataTypeTest__Group_44__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_44__0__Impl_in_rule__DataTypeTest__Group_44__010549);
            rule__DataTypeTest__Group_44__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_44__1_in_rule__DataTypeTest__Group_44__010552);
            rule__DataTypeTest__Group_44__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_44__0"


    // $ANTLR start "rule__DataTypeTest__Group_44__0__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5315:1: rule__DataTypeTest__Group_44__0__Impl : ( 'aUnsignedShort' ) ;
    public final void rule__DataTypeTest__Group_44__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5319:1: ( ( 'aUnsignedShort' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5320:1: ( 'aUnsignedShort' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5320:1: ( 'aUnsignedShort' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5321:1: 'aUnsignedShort'
            {
             before(grammarAccess.getDataTypeTestAccess().getAUnsignedShortKeyword_44_0()); 
            match(input,96,FollowSets000.FOLLOW_96_in_rule__DataTypeTest__Group_44__0__Impl10580); 
             after(grammarAccess.getDataTypeTestAccess().getAUnsignedShortKeyword_44_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_44__0__Impl"


    // $ANTLR start "rule__DataTypeTest__Group_44__1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5334:1: rule__DataTypeTest__Group_44__1 : rule__DataTypeTest__Group_44__1__Impl ;
    public final void rule__DataTypeTest__Group_44__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5338:1: ( rule__DataTypeTest__Group_44__1__Impl )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5339:2: rule__DataTypeTest__Group_44__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__Group_44__1__Impl_in_rule__DataTypeTest__Group_44__110611);
            rule__DataTypeTest__Group_44__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_44__1"


    // $ANTLR start "rule__DataTypeTest__Group_44__1__Impl"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5345:1: rule__DataTypeTest__Group_44__1__Impl : ( ( rule__DataTypeTest__AUnsignedShortAssignment_44_1 ) ) ;
    public final void rule__DataTypeTest__Group_44__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5349:1: ( ( ( rule__DataTypeTest__AUnsignedShortAssignment_44_1 ) ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5350:1: ( ( rule__DataTypeTest__AUnsignedShortAssignment_44_1 ) )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5350:1: ( ( rule__DataTypeTest__AUnsignedShortAssignment_44_1 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5351:1: ( rule__DataTypeTest__AUnsignedShortAssignment_44_1 )
            {
             before(grammarAccess.getDataTypeTestAccess().getAUnsignedShortAssignment_44_1()); 
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5352:1: ( rule__DataTypeTest__AUnsignedShortAssignment_44_1 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5352:2: rule__DataTypeTest__AUnsignedShortAssignment_44_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypeTest__AUnsignedShortAssignment_44_1_in_rule__DataTypeTest__Group_44__1__Impl10638);
            rule__DataTypeTest__AUnsignedShortAssignment_44_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeTestAccess().getAUnsignedShortAssignment_44_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__Group_44__1__Impl"


    // $ANTLR start "rule__DataTypeTest__AIDAssignment_2"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5367:1: rule__DataTypeTest__AIDAssignment_2 : ( ruleID0 ) ;
    public final void rule__DataTypeTest__AIDAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5371:1: ( ( ruleID0 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5372:1: ( ruleID0 )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5372:1: ( ruleID0 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5373:1: ruleID0
            {
             before(grammarAccess.getDataTypeTestAccess().getAIDID0ParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleID0_in_rule__DataTypeTest__AIDAssignment_210677);
            ruleID0();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getAIDID0ParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__AIDAssignment_2"


    // $ANTLR start "rule__DataTypeTest__AAnySimpleTypeAssignment_4_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5382:1: rule__DataTypeTest__AAnySimpleTypeAssignment_4_1 : ( ruleAnySimpleType ) ;
    public final void rule__DataTypeTest__AAnySimpleTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5386:1: ( ( ruleAnySimpleType ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5387:1: ( ruleAnySimpleType )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5387:1: ( ruleAnySimpleType )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5388:1: ruleAnySimpleType
            {
             before(grammarAccess.getDataTypeTestAccess().getAAnySimpleTypeAnySimpleTypeParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnySimpleType_in_rule__DataTypeTest__AAnySimpleTypeAssignment_4_110708);
            ruleAnySimpleType();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getAAnySimpleTypeAnySimpleTypeParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__AAnySimpleTypeAssignment_4_1"


    // $ANTLR start "rule__DataTypeTest__AAnyURIAssignment_5_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5397:1: rule__DataTypeTest__AAnyURIAssignment_5_1 : ( ruleAnyURI ) ;
    public final void rule__DataTypeTest__AAnyURIAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5401:1: ( ( ruleAnyURI ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5402:1: ( ruleAnyURI )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5402:1: ( ruleAnyURI )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5403:1: ruleAnyURI
            {
             before(grammarAccess.getDataTypeTestAccess().getAAnyURIAnyURIParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyURI_in_rule__DataTypeTest__AAnyURIAssignment_5_110739);
            ruleAnyURI();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getAAnyURIAnyURIParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__AAnyURIAssignment_5_1"


    // $ANTLR start "rule__DataTypeTest__ABase64BinaryAssignment_6_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5412:1: rule__DataTypeTest__ABase64BinaryAssignment_6_1 : ( ruleBase64Binary ) ;
    public final void rule__DataTypeTest__ABase64BinaryAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5416:1: ( ( ruleBase64Binary ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5417:1: ( ruleBase64Binary )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5417:1: ( ruleBase64Binary )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5418:1: ruleBase64Binary
            {
             before(grammarAccess.getDataTypeTestAccess().getABase64BinaryBase64BinaryParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBase64Binary_in_rule__DataTypeTest__ABase64BinaryAssignment_6_110770);
            ruleBase64Binary();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getABase64BinaryBase64BinaryParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__ABase64BinaryAssignment_6_1"


    // $ANTLR start "rule__DataTypeTest__ABooleanAssignment_7_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5427:1: rule__DataTypeTest__ABooleanAssignment_7_1 : ( ruleBoolean ) ;
    public final void rule__DataTypeTest__ABooleanAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5431:1: ( ( ruleBoolean ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5432:1: ( ruleBoolean )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5432:1: ( ruleBoolean )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5433:1: ruleBoolean
            {
             before(grammarAccess.getDataTypeTestAccess().getABooleanBooleanParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolean_in_rule__DataTypeTest__ABooleanAssignment_7_110801);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getABooleanBooleanParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__ABooleanAssignment_7_1"


    // $ANTLR start "rule__DataTypeTest__AByteAssignment_8_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5442:1: rule__DataTypeTest__AByteAssignment_8_1 : ( ruleByte ) ;
    public final void rule__DataTypeTest__AByteAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5446:1: ( ( ruleByte ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5447:1: ( ruleByte )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5447:1: ( ruleByte )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5448:1: ruleByte
            {
             before(grammarAccess.getDataTypeTestAccess().getAByteByteParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleByte_in_rule__DataTypeTest__AByteAssignment_8_110832);
            ruleByte();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getAByteByteParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__AByteAssignment_8_1"


    // $ANTLR start "rule__DataTypeTest__ADateAssignment_9_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5457:1: rule__DataTypeTest__ADateAssignment_9_1 : ( ruleDate ) ;
    public final void rule__DataTypeTest__ADateAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5461:1: ( ( ruleDate ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5462:1: ( ruleDate )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5462:1: ( ruleDate )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5463:1: ruleDate
            {
             before(grammarAccess.getDataTypeTestAccess().getADateDateParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_rule__DataTypeTest__ADateAssignment_9_110863);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getADateDateParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__ADateAssignment_9_1"


    // $ANTLR start "rule__DataTypeTest__ADateTimeAssignment_10_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5472:1: rule__DataTypeTest__ADateTimeAssignment_10_1 : ( ruleDateTime ) ;
    public final void rule__DataTypeTest__ADateTimeAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5476:1: ( ( ruleDateTime ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5477:1: ( ruleDateTime )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5477:1: ( ruleDateTime )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5478:1: ruleDateTime
            {
             before(grammarAccess.getDataTypeTestAccess().getADateTimeDateTimeParserRuleCall_10_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDateTime_in_rule__DataTypeTest__ADateTimeAssignment_10_110894);
            ruleDateTime();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getADateTimeDateTimeParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__ADateTimeAssignment_10_1"


    // $ANTLR start "rule__DataTypeTest__ADecimalAssignment_11_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5487:1: rule__DataTypeTest__ADecimalAssignment_11_1 : ( ruleDecimal ) ;
    public final void rule__DataTypeTest__ADecimalAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5491:1: ( ( ruleDecimal ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5492:1: ( ruleDecimal )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5492:1: ( ruleDecimal )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5493:1: ruleDecimal
            {
             before(grammarAccess.getDataTypeTestAccess().getADecimalDecimalParserRuleCall_11_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDecimal_in_rule__DataTypeTest__ADecimalAssignment_11_110925);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getADecimalDecimalParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__ADecimalAssignment_11_1"


    // $ANTLR start "rule__DataTypeTest__ADoubleAssignment_12_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5502:1: rule__DataTypeTest__ADoubleAssignment_12_1 : ( ruleDouble ) ;
    public final void rule__DataTypeTest__ADoubleAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5506:1: ( ( ruleDouble ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5507:1: ( ruleDouble )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5507:1: ( ruleDouble )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5508:1: ruleDouble
            {
             before(grammarAccess.getDataTypeTestAccess().getADoubleDoubleParserRuleCall_12_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDouble_in_rule__DataTypeTest__ADoubleAssignment_12_110956);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getADoubleDoubleParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__ADoubleAssignment_12_1"


    // $ANTLR start "rule__DataTypeTest__ADurationAssignment_13_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5517:1: rule__DataTypeTest__ADurationAssignment_13_1 : ( ruleDuration ) ;
    public final void rule__DataTypeTest__ADurationAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5521:1: ( ( ruleDuration ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5522:1: ( ruleDuration )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5522:1: ( ruleDuration )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5523:1: ruleDuration
            {
             before(grammarAccess.getDataTypeTestAccess().getADurationDurationParserRuleCall_13_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDuration_in_rule__DataTypeTest__ADurationAssignment_13_110987);
            ruleDuration();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getADurationDurationParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__ADurationAssignment_13_1"


    // $ANTLR start "rule__DataTypeTest__AEntitiesAssignment_14_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5532:1: rule__DataTypeTest__AEntitiesAssignment_14_1 : ( ruleENTITIES ) ;
    public final void rule__DataTypeTest__AEntitiesAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5536:1: ( ( ruleENTITIES ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5537:1: ( ruleENTITIES )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5537:1: ( ruleENTITIES )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5538:1: ruleENTITIES
            {
             before(grammarAccess.getDataTypeTestAccess().getAEntitiesENTITIESParserRuleCall_14_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleENTITIES_in_rule__DataTypeTest__AEntitiesAssignment_14_111018);
            ruleENTITIES();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getAEntitiesENTITIESParserRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__AEntitiesAssignment_14_1"


    // $ANTLR start "rule__DataTypeTest__AEntityAssignment_15_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5547:1: rule__DataTypeTest__AEntityAssignment_15_1 : ( ruleENTITY ) ;
    public final void rule__DataTypeTest__AEntityAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5551:1: ( ( ruleENTITY ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5552:1: ( ruleENTITY )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5552:1: ( ruleENTITY )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5553:1: ruleENTITY
            {
             before(grammarAccess.getDataTypeTestAccess().getAEntityENTITYParserRuleCall_15_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleENTITY_in_rule__DataTypeTest__AEntityAssignment_15_111049);
            ruleENTITY();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getAEntityENTITYParserRuleCall_15_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__AEntityAssignment_15_1"


    // $ANTLR start "rule__DataTypeTest__AFloatAssignment_16_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5562:1: rule__DataTypeTest__AFloatAssignment_16_1 : ( ruleFloat ) ;
    public final void rule__DataTypeTest__AFloatAssignment_16_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5566:1: ( ( ruleFloat ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5567:1: ( ruleFloat )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5567:1: ( ruleFloat )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5568:1: ruleFloat
            {
             before(grammarAccess.getDataTypeTestAccess().getAFloatFloatParserRuleCall_16_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFloat_in_rule__DataTypeTest__AFloatAssignment_16_111080);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getAFloatFloatParserRuleCall_16_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__AFloatAssignment_16_1"


    // $ANTLR start "rule__DataTypeTest__AGDayAssignment_17_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5577:1: rule__DataTypeTest__AGDayAssignment_17_1 : ( ruleGDay ) ;
    public final void rule__DataTypeTest__AGDayAssignment_17_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5581:1: ( ( ruleGDay ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5582:1: ( ruleGDay )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5582:1: ( ruleGDay )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5583:1: ruleGDay
            {
             before(grammarAccess.getDataTypeTestAccess().getAGDayGDayParserRuleCall_17_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGDay_in_rule__DataTypeTest__AGDayAssignment_17_111111);
            ruleGDay();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getAGDayGDayParserRuleCall_17_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__AGDayAssignment_17_1"


    // $ANTLR start "rule__DataTypeTest__AGMonthAssignment_18_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5592:1: rule__DataTypeTest__AGMonthAssignment_18_1 : ( ruleGMonth ) ;
    public final void rule__DataTypeTest__AGMonthAssignment_18_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5596:1: ( ( ruleGMonth ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5597:1: ( ruleGMonth )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5597:1: ( ruleGMonth )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5598:1: ruleGMonth
            {
             before(grammarAccess.getDataTypeTestAccess().getAGMonthGMonthParserRuleCall_18_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGMonth_in_rule__DataTypeTest__AGMonthAssignment_18_111142);
            ruleGMonth();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getAGMonthGMonthParserRuleCall_18_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__AGMonthAssignment_18_1"


    // $ANTLR start "rule__DataTypeTest__AGMonthDayAssignment_19_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5607:1: rule__DataTypeTest__AGMonthDayAssignment_19_1 : ( ruleGMonthDay ) ;
    public final void rule__DataTypeTest__AGMonthDayAssignment_19_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5611:1: ( ( ruleGMonthDay ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5612:1: ( ruleGMonthDay )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5612:1: ( ruleGMonthDay )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5613:1: ruleGMonthDay
            {
             before(grammarAccess.getDataTypeTestAccess().getAGMonthDayGMonthDayParserRuleCall_19_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGMonthDay_in_rule__DataTypeTest__AGMonthDayAssignment_19_111173);
            ruleGMonthDay();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getAGMonthDayGMonthDayParserRuleCall_19_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__AGMonthDayAssignment_19_1"


    // $ANTLR start "rule__DataTypeTest__AGYearAssignment_20_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5622:1: rule__DataTypeTest__AGYearAssignment_20_1 : ( ruleGYear ) ;
    public final void rule__DataTypeTest__AGYearAssignment_20_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5626:1: ( ( ruleGYear ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5627:1: ( ruleGYear )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5627:1: ( ruleGYear )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5628:1: ruleGYear
            {
             before(grammarAccess.getDataTypeTestAccess().getAGYearGYearParserRuleCall_20_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGYear_in_rule__DataTypeTest__AGYearAssignment_20_111204);
            ruleGYear();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getAGYearGYearParserRuleCall_20_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__AGYearAssignment_20_1"


    // $ANTLR start "rule__DataTypeTest__AGYearMonthAssignment_21_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5637:1: rule__DataTypeTest__AGYearMonthAssignment_21_1 : ( ruleGYearMonth ) ;
    public final void rule__DataTypeTest__AGYearMonthAssignment_21_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5641:1: ( ( ruleGYearMonth ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5642:1: ( ruleGYearMonth )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5642:1: ( ruleGYearMonth )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5643:1: ruleGYearMonth
            {
             before(grammarAccess.getDataTypeTestAccess().getAGYearMonthGYearMonthParserRuleCall_21_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGYearMonth_in_rule__DataTypeTest__AGYearMonthAssignment_21_111235);
            ruleGYearMonth();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getAGYearMonthGYearMonthParserRuleCall_21_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__AGYearMonthAssignment_21_1"


    // $ANTLR start "rule__DataTypeTest__AHexBinaryAssignment_22_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5652:1: rule__DataTypeTest__AHexBinaryAssignment_22_1 : ( ruleHexBinary ) ;
    public final void rule__DataTypeTest__AHexBinaryAssignment_22_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5656:1: ( ( ruleHexBinary ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5657:1: ( ruleHexBinary )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5657:1: ( ruleHexBinary )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5658:1: ruleHexBinary
            {
             before(grammarAccess.getDataTypeTestAccess().getAHexBinaryHexBinaryParserRuleCall_22_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleHexBinary_in_rule__DataTypeTest__AHexBinaryAssignment_22_111266);
            ruleHexBinary();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getAHexBinaryHexBinaryParserRuleCall_22_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__AHexBinaryAssignment_22_1"


    // $ANTLR start "rule__DataTypeTest__AIDREFAssignment_23_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5667:1: rule__DataTypeTest__AIDREFAssignment_23_1 : ( ruleIDREF ) ;
    public final void rule__DataTypeTest__AIDREFAssignment_23_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5671:1: ( ( ruleIDREF ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5672:1: ( ruleIDREF )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5672:1: ( ruleIDREF )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5673:1: ruleIDREF
            {
             before(grammarAccess.getDataTypeTestAccess().getAIDREFIDREFParserRuleCall_23_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIDREF_in_rule__DataTypeTest__AIDREFAssignment_23_111297);
            ruleIDREF();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getAIDREFIDREFParserRuleCall_23_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__AIDREFAssignment_23_1"


    // $ANTLR start "rule__DataTypeTest__AIDREFSAssignment_24_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5682:1: rule__DataTypeTest__AIDREFSAssignment_24_1 : ( ruleIDREFS ) ;
    public final void rule__DataTypeTest__AIDREFSAssignment_24_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5686:1: ( ( ruleIDREFS ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5687:1: ( ruleIDREFS )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5687:1: ( ruleIDREFS )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5688:1: ruleIDREFS
            {
             before(grammarAccess.getDataTypeTestAccess().getAIDREFSIDREFSParserRuleCall_24_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIDREFS_in_rule__DataTypeTest__AIDREFSAssignment_24_111328);
            ruleIDREFS();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getAIDREFSIDREFSParserRuleCall_24_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__AIDREFSAssignment_24_1"


    // $ANTLR start "rule__DataTypeTest__AIntAssignment_25_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5697:1: rule__DataTypeTest__AIntAssignment_25_1 : ( ruleInt0 ) ;
    public final void rule__DataTypeTest__AIntAssignment_25_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5701:1: ( ( ruleInt0 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5702:1: ( ruleInt0 )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5702:1: ( ruleInt0 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5703:1: ruleInt0
            {
             before(grammarAccess.getDataTypeTestAccess().getAIntInt0ParserRuleCall_25_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInt0_in_rule__DataTypeTest__AIntAssignment_25_111359);
            ruleInt0();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getAIntInt0ParserRuleCall_25_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__AIntAssignment_25_1"


    // $ANTLR start "rule__DataTypeTest__AIntegerAssignment_26_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5712:1: rule__DataTypeTest__AIntegerAssignment_26_1 : ( ruleInteger ) ;
    public final void rule__DataTypeTest__AIntegerAssignment_26_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5716:1: ( ( ruleInteger ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5717:1: ( ruleInteger )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5717:1: ( ruleInteger )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5718:1: ruleInteger
            {
             before(grammarAccess.getDataTypeTestAccess().getAIntegerIntegerParserRuleCall_26_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_rule__DataTypeTest__AIntegerAssignment_26_111390);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getAIntegerIntegerParserRuleCall_26_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__AIntegerAssignment_26_1"


    // $ANTLR start "rule__DataTypeTest__ALanguageAssignment_27_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5727:1: rule__DataTypeTest__ALanguageAssignment_27_1 : ( ruleLanguage ) ;
    public final void rule__DataTypeTest__ALanguageAssignment_27_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5731:1: ( ( ruleLanguage ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5732:1: ( ruleLanguage )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5732:1: ( ruleLanguage )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5733:1: ruleLanguage
            {
             before(grammarAccess.getDataTypeTestAccess().getALanguageLanguageParserRuleCall_27_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLanguage_in_rule__DataTypeTest__ALanguageAssignment_27_111421);
            ruleLanguage();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getALanguageLanguageParserRuleCall_27_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__ALanguageAssignment_27_1"


    // $ANTLR start "rule__DataTypeTest__ALongAssignment_28_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5742:1: rule__DataTypeTest__ALongAssignment_28_1 : ( ruleLong ) ;
    public final void rule__DataTypeTest__ALongAssignment_28_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5746:1: ( ( ruleLong ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5747:1: ( ruleLong )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5747:1: ( ruleLong )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5748:1: ruleLong
            {
             before(grammarAccess.getDataTypeTestAccess().getALongLongParserRuleCall_28_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLong_in_rule__DataTypeTest__ALongAssignment_28_111452);
            ruleLong();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getALongLongParserRuleCall_28_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__ALongAssignment_28_1"


    // $ANTLR start "rule__DataTypeTest__ANameAssignment_29_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5757:1: rule__DataTypeTest__ANameAssignment_29_1 : ( ruleName ) ;
    public final void rule__DataTypeTest__ANameAssignment_29_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5761:1: ( ( ruleName ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5762:1: ( ruleName )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5762:1: ( ruleName )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5763:1: ruleName
            {
             before(grammarAccess.getDataTypeTestAccess().getANameNameParserRuleCall_29_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleName_in_rule__DataTypeTest__ANameAssignment_29_111483);
            ruleName();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getANameNameParserRuleCall_29_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__ANameAssignment_29_1"


    // $ANTLR start "rule__DataTypeTest__ANCNameAssignment_30_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5772:1: rule__DataTypeTest__ANCNameAssignment_30_1 : ( ruleNCName ) ;
    public final void rule__DataTypeTest__ANCNameAssignment_30_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5776:1: ( ( ruleNCName ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5777:1: ( ruleNCName )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5777:1: ( ruleNCName )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5778:1: ruleNCName
            {
             before(grammarAccess.getDataTypeTestAccess().getANCNameNCNameParserRuleCall_30_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNCName_in_rule__DataTypeTest__ANCNameAssignment_30_111514);
            ruleNCName();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getANCNameNCNameParserRuleCall_30_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__ANCNameAssignment_30_1"


    // $ANTLR start "rule__DataTypeTest__ANMTOKENAssignment_31_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5787:1: rule__DataTypeTest__ANMTOKENAssignment_31_1 : ( ruleNMTOKEN ) ;
    public final void rule__DataTypeTest__ANMTOKENAssignment_31_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5791:1: ( ( ruleNMTOKEN ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5792:1: ( ruleNMTOKEN )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5792:1: ( ruleNMTOKEN )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5793:1: ruleNMTOKEN
            {
             before(grammarAccess.getDataTypeTestAccess().getANMTOKENNMTOKENParserRuleCall_31_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNMTOKEN_in_rule__DataTypeTest__ANMTOKENAssignment_31_111545);
            ruleNMTOKEN();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getANMTOKENNMTOKENParserRuleCall_31_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__ANMTOKENAssignment_31_1"


    // $ANTLR start "rule__DataTypeTest__ANMTOKENSAssignment_32_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5802:1: rule__DataTypeTest__ANMTOKENSAssignment_32_1 : ( ruleNMTOKENS ) ;
    public final void rule__DataTypeTest__ANMTOKENSAssignment_32_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5806:1: ( ( ruleNMTOKENS ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5807:1: ( ruleNMTOKENS )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5807:1: ( ruleNMTOKENS )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5808:1: ruleNMTOKENS
            {
             before(grammarAccess.getDataTypeTestAccess().getANMTOKENSNMTOKENSParserRuleCall_32_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNMTOKENS_in_rule__DataTypeTest__ANMTOKENSAssignment_32_111576);
            ruleNMTOKENS();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getANMTOKENSNMTOKENSParserRuleCall_32_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__ANMTOKENSAssignment_32_1"


    // $ANTLR start "rule__DataTypeTest__ANonNegativeIntegerAssignment_33_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5817:1: rule__DataTypeTest__ANonNegativeIntegerAssignment_33_1 : ( ruleNonNegativeInteger ) ;
    public final void rule__DataTypeTest__ANonNegativeIntegerAssignment_33_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5821:1: ( ( ruleNonNegativeInteger ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5822:1: ( ruleNonNegativeInteger )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5822:1: ( ruleNonNegativeInteger )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5823:1: ruleNonNegativeInteger
            {
             before(grammarAccess.getDataTypeTestAccess().getANonNegativeIntegerNonNegativeIntegerParserRuleCall_33_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNonNegativeInteger_in_rule__DataTypeTest__ANonNegativeIntegerAssignment_33_111607);
            ruleNonNegativeInteger();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getANonNegativeIntegerNonNegativeIntegerParserRuleCall_33_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__ANonNegativeIntegerAssignment_33_1"


    // $ANTLR start "rule__DataTypeTest__ANonPositiveIntegerAssignment_34_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5832:1: rule__DataTypeTest__ANonPositiveIntegerAssignment_34_1 : ( ruleNonPositiveInteger ) ;
    public final void rule__DataTypeTest__ANonPositiveIntegerAssignment_34_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5836:1: ( ( ruleNonPositiveInteger ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5837:1: ( ruleNonPositiveInteger )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5837:1: ( ruleNonPositiveInteger )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5838:1: ruleNonPositiveInteger
            {
             before(grammarAccess.getDataTypeTestAccess().getANonPositiveIntegerNonPositiveIntegerParserRuleCall_34_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNonPositiveInteger_in_rule__DataTypeTest__ANonPositiveIntegerAssignment_34_111638);
            ruleNonPositiveInteger();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getANonPositiveIntegerNonPositiveIntegerParserRuleCall_34_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__ANonPositiveIntegerAssignment_34_1"


    // $ANTLR start "rule__DataTypeTest__APositiveIntegerAssignment_35_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5847:1: rule__DataTypeTest__APositiveIntegerAssignment_35_1 : ( rulePositiveInteger ) ;
    public final void rule__DataTypeTest__APositiveIntegerAssignment_35_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5851:1: ( ( rulePositiveInteger ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5852:1: ( rulePositiveInteger )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5852:1: ( rulePositiveInteger )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5853:1: rulePositiveInteger
            {
             before(grammarAccess.getDataTypeTestAccess().getAPositiveIntegerPositiveIntegerParserRuleCall_35_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePositiveInteger_in_rule__DataTypeTest__APositiveIntegerAssignment_35_111669);
            rulePositiveInteger();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getAPositiveIntegerPositiveIntegerParserRuleCall_35_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__APositiveIntegerAssignment_35_1"


    // $ANTLR start "rule__DataTypeTest__AQNameAssignment_36_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5862:1: rule__DataTypeTest__AQNameAssignment_36_1 : ( ruleQName ) ;
    public final void rule__DataTypeTest__AQNameAssignment_36_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5866:1: ( ( ruleQName ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5867:1: ( ruleQName )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5867:1: ( ruleQName )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5868:1: ruleQName
            {
             before(grammarAccess.getDataTypeTestAccess().getAQNameQNameParserRuleCall_36_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_rule__DataTypeTest__AQNameAssignment_36_111700);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getAQNameQNameParserRuleCall_36_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__AQNameAssignment_36_1"


    // $ANTLR start "rule__DataTypeTest__AShortAssignment_37_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5877:1: rule__DataTypeTest__AShortAssignment_37_1 : ( ruleShort ) ;
    public final void rule__DataTypeTest__AShortAssignment_37_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5881:1: ( ( ruleShort ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5882:1: ( ruleShort )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5882:1: ( ruleShort )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5883:1: ruleShort
            {
             before(grammarAccess.getDataTypeTestAccess().getAShortShortParserRuleCall_37_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleShort_in_rule__DataTypeTest__AShortAssignment_37_111731);
            ruleShort();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getAShortShortParserRuleCall_37_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__AShortAssignment_37_1"


    // $ANTLR start "rule__DataTypeTest__AStringAssignment_38_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5892:1: rule__DataTypeTest__AStringAssignment_38_1 : ( ruleString0 ) ;
    public final void rule__DataTypeTest__AStringAssignment_38_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5896:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5897:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5897:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5898:1: ruleString0
            {
             before(grammarAccess.getDataTypeTestAccess().getAStringString0ParserRuleCall_38_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__DataTypeTest__AStringAssignment_38_111762);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getAStringString0ParserRuleCall_38_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__AStringAssignment_38_1"


    // $ANTLR start "rule__DataTypeTest__ATimeAssignment_39_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5907:1: rule__DataTypeTest__ATimeAssignment_39_1 : ( ruleTime ) ;
    public final void rule__DataTypeTest__ATimeAssignment_39_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5911:1: ( ( ruleTime ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5912:1: ( ruleTime )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5912:1: ( ruleTime )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5913:1: ruleTime
            {
             before(grammarAccess.getDataTypeTestAccess().getATimeTimeParserRuleCall_39_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTime_in_rule__DataTypeTest__ATimeAssignment_39_111793);
            ruleTime();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getATimeTimeParserRuleCall_39_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__ATimeAssignment_39_1"


    // $ANTLR start "rule__DataTypeTest__ATokenAssignment_40_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5922:1: rule__DataTypeTest__ATokenAssignment_40_1 : ( ruleToken ) ;
    public final void rule__DataTypeTest__ATokenAssignment_40_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5926:1: ( ( ruleToken ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5927:1: ( ruleToken )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5927:1: ( ruleToken )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5928:1: ruleToken
            {
             before(grammarAccess.getDataTypeTestAccess().getATokenTokenParserRuleCall_40_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleToken_in_rule__DataTypeTest__ATokenAssignment_40_111824);
            ruleToken();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getATokenTokenParserRuleCall_40_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__ATokenAssignment_40_1"


    // $ANTLR start "rule__DataTypeTest__AUnsignedByteAssignment_41_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5937:1: rule__DataTypeTest__AUnsignedByteAssignment_41_1 : ( ruleUnsignedByte ) ;
    public final void rule__DataTypeTest__AUnsignedByteAssignment_41_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5941:1: ( ( ruleUnsignedByte ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5942:1: ( ruleUnsignedByte )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5942:1: ( ruleUnsignedByte )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5943:1: ruleUnsignedByte
            {
             before(grammarAccess.getDataTypeTestAccess().getAUnsignedByteUnsignedByteParserRuleCall_41_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnsignedByte_in_rule__DataTypeTest__AUnsignedByteAssignment_41_111855);
            ruleUnsignedByte();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getAUnsignedByteUnsignedByteParserRuleCall_41_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__AUnsignedByteAssignment_41_1"


    // $ANTLR start "rule__DataTypeTest__AUnsignedIntAssignment_42_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5952:1: rule__DataTypeTest__AUnsignedIntAssignment_42_1 : ( ruleUnsignedInt ) ;
    public final void rule__DataTypeTest__AUnsignedIntAssignment_42_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5956:1: ( ( ruleUnsignedInt ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5957:1: ( ruleUnsignedInt )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5957:1: ( ruleUnsignedInt )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5958:1: ruleUnsignedInt
            {
             before(grammarAccess.getDataTypeTestAccess().getAUnsignedIntUnsignedIntParserRuleCall_42_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnsignedInt_in_rule__DataTypeTest__AUnsignedIntAssignment_42_111886);
            ruleUnsignedInt();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getAUnsignedIntUnsignedIntParserRuleCall_42_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__AUnsignedIntAssignment_42_1"


    // $ANTLR start "rule__DataTypeTest__AUnsignedLongAssignment_43_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5967:1: rule__DataTypeTest__AUnsignedLongAssignment_43_1 : ( ruleUnsignedLong ) ;
    public final void rule__DataTypeTest__AUnsignedLongAssignment_43_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5971:1: ( ( ruleUnsignedLong ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5972:1: ( ruleUnsignedLong )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5972:1: ( ruleUnsignedLong )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5973:1: ruleUnsignedLong
            {
             before(grammarAccess.getDataTypeTestAccess().getAUnsignedLongUnsignedLongParserRuleCall_43_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnsignedLong_in_rule__DataTypeTest__AUnsignedLongAssignment_43_111917);
            ruleUnsignedLong();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getAUnsignedLongUnsignedLongParserRuleCall_43_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__AUnsignedLongAssignment_43_1"


    // $ANTLR start "rule__DataTypeTest__AUnsignedShortAssignment_44_1"
    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5982:1: rule__DataTypeTest__AUnsignedShortAssignment_44_1 : ( ruleUnsignedShort ) ;
    public final void rule__DataTypeTest__AUnsignedShortAssignment_44_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5986:1: ( ( ruleUnsignedShort ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5987:1: ( ruleUnsignedShort )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5987:1: ( ruleUnsignedShort )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5988:1: ruleUnsignedShort
            {
             before(grammarAccess.getDataTypeTestAccess().getAUnsignedShortUnsignedShortParserRuleCall_44_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnsignedShort_in_rule__DataTypeTest__AUnsignedShortAssignment_44_111948);
            ruleUnsignedShort();

            state._fsp--;

             after(grammarAccess.getDataTypeTestAccess().getAUnsignedShortUnsignedShortParserRuleCall_44_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeTest__AUnsignedShortAssignment_44_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleDataTypeTest_in_entryRuleDataTypeTest61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeTest68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__0_in_ruleDataTypeTest94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnySimpleType_in_entryRuleAnySimpleType121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnySimpleType128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleAnySimpleType155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyURI_in_entryRuleAnyURI183 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnyURI190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleAnyURI217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBase64Binary_in_entryRuleBase64Binary245 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBase64Binary252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleBase64Binary279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean307 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolean314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleBoolean341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleByte_in_entryRuleByte369 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleByte376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleByte403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_entryRuleDate431 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDate438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleDate465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDateTime_in_entryRuleDateTime493 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDateTime500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleDateTime527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDecimal_in_entryRuleDecimal555 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDecimal562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleDecimal589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDouble_in_entryRuleDouble617 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDouble624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleDouble651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDuration_in_entryRuleDuration679 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDuration686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleDuration713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleENTITIES_in_entryRuleENTITIES741 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleENTITIES748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleENTITIES775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleENTITY_in_entryRuleENTITY803 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleENTITY810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleENTITY837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloat_in_entryRuleFloat865 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloat872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleFloat899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGDay_in_entryRuleGDay927 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGDay934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleGDay961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGMonth_in_entryRuleGMonth989 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGMonth996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleGMonth1023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGMonthDay_in_entryRuleGMonthDay1051 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGMonthDay1058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleGMonthDay1085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGYear_in_entryRuleGYear1113 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGYear1120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleGYear1147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGYearMonth_in_entryRuleGYearMonth1175 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGYearMonth1182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleGYearMonth1209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHexBinary_in_entryRuleHexBinary1237 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHexBinary1244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleHexBinary1271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID0_in_entryRuleID01299 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleID01306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleID01333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIDREF_in_entryRuleIDREF1361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIDREF1368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleIDREF1395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIDREFS_in_entryRuleIDREFS1423 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIDREFS1430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleIDREFS1457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInt0_in_entryRuleInt01485 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInt01492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleInt01519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger1547 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteger1554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleInteger1581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLanguage_in_entryRuleLanguage1609 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLanguage1616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleLanguage1643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLong_in_entryRuleLong1671 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLong1678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleLong1705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleName_in_entryRuleName1733 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleName1740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleName1767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNCName_in_entryRuleNCName1795 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNCName1802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleNCName1829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNMTOKEN_in_entryRuleNMTOKEN1857 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNMTOKEN1864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleNMTOKEN1891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNMTOKENS_in_entryRuleNMTOKENS1919 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNMTOKENS1926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleNMTOKENS1953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNonNegativeInteger_in_entryRuleNonNegativeInteger1981 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNonNegativeInteger1988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleNonNegativeInteger2015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNonPositiveInteger_in_entryRuleNonPositiveInteger2043 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNonPositiveInteger2050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleNonPositiveInteger2077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePositiveInteger_in_entryRulePositiveInteger2105 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePositiveInteger2112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rulePositiveInteger2139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQName_in_entryRuleQName2167 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQName2174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleQName2201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShort_in_entryRuleShort2229 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleShort2236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleShort2263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString02291 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString02298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleString02325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTime_in_entryRuleTime2353 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTime2360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleTime2387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleToken_in_entryRuleToken2415 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleToken2422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleToken2449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnsignedByte_in_entryRuleUnsignedByte2477 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnsignedByte2484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleUnsignedByte2511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnsignedInt_in_entryRuleUnsignedInt2539 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnsignedInt2546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleUnsignedInt2573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnsignedLong_in_entryRuleUnsignedLong2601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnsignedLong2608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleUnsignedLong2635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnsignedShort_in_entryRuleUnsignedShort2663 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnsignedShort2670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleUnsignedShort2697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__0__Impl_in_rule__DataTypeTest__Group__02732 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__1_in_rule__DataTypeTest__Group__02735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__1__Impl_in_rule__DataTypeTest__Group__12793 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__2_in_rule__DataTypeTest__Group__12796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__DataTypeTest__Group__1__Impl2824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__2__Impl_in_rule__DataTypeTest__Group__22855 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__3_in_rule__DataTypeTest__Group__22858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__AIDAssignment_2_in_rule__DataTypeTest__Group__2__Impl2885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__3__Impl_in_rule__DataTypeTest__Group__32915 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__4_in_rule__DataTypeTest__Group__32918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rule__DataTypeTest__Group__3__Impl2946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__4__Impl_in_rule__DataTypeTest__Group__42977 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__5_in_rule__DataTypeTest__Group__42980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_4__0_in_rule__DataTypeTest__Group__4__Impl3007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__5__Impl_in_rule__DataTypeTest__Group__53038 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__6_in_rule__DataTypeTest__Group__53041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_5__0_in_rule__DataTypeTest__Group__5__Impl3068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__6__Impl_in_rule__DataTypeTest__Group__63099 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__7_in_rule__DataTypeTest__Group__63102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_6__0_in_rule__DataTypeTest__Group__6__Impl3129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__7__Impl_in_rule__DataTypeTest__Group__73160 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__8_in_rule__DataTypeTest__Group__73163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_7__0_in_rule__DataTypeTest__Group__7__Impl3190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__8__Impl_in_rule__DataTypeTest__Group__83221 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__9_in_rule__DataTypeTest__Group__83224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_8__0_in_rule__DataTypeTest__Group__8__Impl3251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__9__Impl_in_rule__DataTypeTest__Group__93282 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__10_in_rule__DataTypeTest__Group__93285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_9__0_in_rule__DataTypeTest__Group__9__Impl3312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__10__Impl_in_rule__DataTypeTest__Group__103343 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__11_in_rule__DataTypeTest__Group__103346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_10__0_in_rule__DataTypeTest__Group__10__Impl3373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__11__Impl_in_rule__DataTypeTest__Group__113404 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__12_in_rule__DataTypeTest__Group__113407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_11__0_in_rule__DataTypeTest__Group__11__Impl3434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__12__Impl_in_rule__DataTypeTest__Group__123465 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__13_in_rule__DataTypeTest__Group__123468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_12__0_in_rule__DataTypeTest__Group__12__Impl3495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__13__Impl_in_rule__DataTypeTest__Group__133526 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__14_in_rule__DataTypeTest__Group__133529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_13__0_in_rule__DataTypeTest__Group__13__Impl3556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__14__Impl_in_rule__DataTypeTest__Group__143587 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__15_in_rule__DataTypeTest__Group__143590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_14__0_in_rule__DataTypeTest__Group__14__Impl3617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__15__Impl_in_rule__DataTypeTest__Group__153648 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__16_in_rule__DataTypeTest__Group__153651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_15__0_in_rule__DataTypeTest__Group__15__Impl3678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__16__Impl_in_rule__DataTypeTest__Group__163709 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__17_in_rule__DataTypeTest__Group__163712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_16__0_in_rule__DataTypeTest__Group__16__Impl3739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__17__Impl_in_rule__DataTypeTest__Group__173770 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__18_in_rule__DataTypeTest__Group__173773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_17__0_in_rule__DataTypeTest__Group__17__Impl3800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__18__Impl_in_rule__DataTypeTest__Group__183831 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__19_in_rule__DataTypeTest__Group__183834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_18__0_in_rule__DataTypeTest__Group__18__Impl3861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__19__Impl_in_rule__DataTypeTest__Group__193892 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__20_in_rule__DataTypeTest__Group__193895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_19__0_in_rule__DataTypeTest__Group__19__Impl3922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__20__Impl_in_rule__DataTypeTest__Group__203953 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__21_in_rule__DataTypeTest__Group__203956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_20__0_in_rule__DataTypeTest__Group__20__Impl3983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__21__Impl_in_rule__DataTypeTest__Group__214014 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__22_in_rule__DataTypeTest__Group__214017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_21__0_in_rule__DataTypeTest__Group__21__Impl4044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__22__Impl_in_rule__DataTypeTest__Group__224075 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__23_in_rule__DataTypeTest__Group__224078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_22__0_in_rule__DataTypeTest__Group__22__Impl4105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__23__Impl_in_rule__DataTypeTest__Group__234136 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__24_in_rule__DataTypeTest__Group__234139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_23__0_in_rule__DataTypeTest__Group__23__Impl4166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__24__Impl_in_rule__DataTypeTest__Group__244197 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__25_in_rule__DataTypeTest__Group__244200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_24__0_in_rule__DataTypeTest__Group__24__Impl4227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__25__Impl_in_rule__DataTypeTest__Group__254258 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__26_in_rule__DataTypeTest__Group__254261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_25__0_in_rule__DataTypeTest__Group__25__Impl4288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__26__Impl_in_rule__DataTypeTest__Group__264319 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__27_in_rule__DataTypeTest__Group__264322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_26__0_in_rule__DataTypeTest__Group__26__Impl4349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__27__Impl_in_rule__DataTypeTest__Group__274380 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__28_in_rule__DataTypeTest__Group__274383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_27__0_in_rule__DataTypeTest__Group__27__Impl4410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__28__Impl_in_rule__DataTypeTest__Group__284441 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__29_in_rule__DataTypeTest__Group__284444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_28__0_in_rule__DataTypeTest__Group__28__Impl4471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__29__Impl_in_rule__DataTypeTest__Group__294502 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__30_in_rule__DataTypeTest__Group__294505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_29__0_in_rule__DataTypeTest__Group__29__Impl4532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__30__Impl_in_rule__DataTypeTest__Group__304563 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__31_in_rule__DataTypeTest__Group__304566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_30__0_in_rule__DataTypeTest__Group__30__Impl4593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__31__Impl_in_rule__DataTypeTest__Group__314624 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__32_in_rule__DataTypeTest__Group__314627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_31__0_in_rule__DataTypeTest__Group__31__Impl4654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__32__Impl_in_rule__DataTypeTest__Group__324685 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__33_in_rule__DataTypeTest__Group__324688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_32__0_in_rule__DataTypeTest__Group__32__Impl4715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__33__Impl_in_rule__DataTypeTest__Group__334746 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__34_in_rule__DataTypeTest__Group__334749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_33__0_in_rule__DataTypeTest__Group__33__Impl4776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__34__Impl_in_rule__DataTypeTest__Group__344807 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__35_in_rule__DataTypeTest__Group__344810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_34__0_in_rule__DataTypeTest__Group__34__Impl4837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__35__Impl_in_rule__DataTypeTest__Group__354868 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__36_in_rule__DataTypeTest__Group__354871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_35__0_in_rule__DataTypeTest__Group__35__Impl4898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__36__Impl_in_rule__DataTypeTest__Group__364929 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__37_in_rule__DataTypeTest__Group__364932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_36__0_in_rule__DataTypeTest__Group__36__Impl4959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__37__Impl_in_rule__DataTypeTest__Group__374990 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__38_in_rule__DataTypeTest__Group__374993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_37__0_in_rule__DataTypeTest__Group__37__Impl5020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__38__Impl_in_rule__DataTypeTest__Group__385051 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__39_in_rule__DataTypeTest__Group__385054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_38__0_in_rule__DataTypeTest__Group__38__Impl5081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__39__Impl_in_rule__DataTypeTest__Group__395112 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__40_in_rule__DataTypeTest__Group__395115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_39__0_in_rule__DataTypeTest__Group__39__Impl5142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__40__Impl_in_rule__DataTypeTest__Group__405173 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__41_in_rule__DataTypeTest__Group__405176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_40__0_in_rule__DataTypeTest__Group__40__Impl5203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__41__Impl_in_rule__DataTypeTest__Group__415234 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__42_in_rule__DataTypeTest__Group__415237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_41__0_in_rule__DataTypeTest__Group__41__Impl5264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__42__Impl_in_rule__DataTypeTest__Group__425295 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__43_in_rule__DataTypeTest__Group__425298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_42__0_in_rule__DataTypeTest__Group__42__Impl5325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__43__Impl_in_rule__DataTypeTest__Group__435356 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__44_in_rule__DataTypeTest__Group__435359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_43__0_in_rule__DataTypeTest__Group__43__Impl5386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__44__Impl_in_rule__DataTypeTest__Group__445417 = new BitSet(new long[]{0xFF80000000000000L,0x00000001FFFFFFFFL});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__45_in_rule__DataTypeTest__Group__445420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_44__0_in_rule__DataTypeTest__Group__44__Impl5447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group__45__Impl_in_rule__DataTypeTest__Group__455478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__DataTypeTest__Group__45__Impl5506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_4__0__Impl_in_rule__DataTypeTest__Group_4__05629 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_4__1_in_rule__DataTypeTest__Group_4__05632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__DataTypeTest__Group_4__0__Impl5660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_4__1__Impl_in_rule__DataTypeTest__Group_4__15691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__AAnySimpleTypeAssignment_4_1_in_rule__DataTypeTest__Group_4__1__Impl5718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_5__0__Impl_in_rule__DataTypeTest__Group_5__05752 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_5__1_in_rule__DataTypeTest__Group_5__05755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rule__DataTypeTest__Group_5__0__Impl5783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_5__1__Impl_in_rule__DataTypeTest__Group_5__15814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__AAnyURIAssignment_5_1_in_rule__DataTypeTest__Group_5__1__Impl5841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_6__0__Impl_in_rule__DataTypeTest__Group_6__05875 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_6__1_in_rule__DataTypeTest__Group_6__05878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rule__DataTypeTest__Group_6__0__Impl5906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_6__1__Impl_in_rule__DataTypeTest__Group_6__15937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__ABase64BinaryAssignment_6_1_in_rule__DataTypeTest__Group_6__1__Impl5964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_7__0__Impl_in_rule__DataTypeTest__Group_7__05998 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_7__1_in_rule__DataTypeTest__Group_7__06001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rule__DataTypeTest__Group_7__0__Impl6029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_7__1__Impl_in_rule__DataTypeTest__Group_7__16060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__ABooleanAssignment_7_1_in_rule__DataTypeTest__Group_7__1__Impl6087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_8__0__Impl_in_rule__DataTypeTest__Group_8__06121 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_8__1_in_rule__DataTypeTest__Group_8__06124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_rule__DataTypeTest__Group_8__0__Impl6152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_8__1__Impl_in_rule__DataTypeTest__Group_8__16183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__AByteAssignment_8_1_in_rule__DataTypeTest__Group_8__1__Impl6210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_9__0__Impl_in_rule__DataTypeTest__Group_9__06244 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_9__1_in_rule__DataTypeTest__Group_9__06247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_rule__DataTypeTest__Group_9__0__Impl6275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_9__1__Impl_in_rule__DataTypeTest__Group_9__16306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__ADateAssignment_9_1_in_rule__DataTypeTest__Group_9__1__Impl6333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_10__0__Impl_in_rule__DataTypeTest__Group_10__06367 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_10__1_in_rule__DataTypeTest__Group_10__06370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_rule__DataTypeTest__Group_10__0__Impl6398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_10__1__Impl_in_rule__DataTypeTest__Group_10__16429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__ADateTimeAssignment_10_1_in_rule__DataTypeTest__Group_10__1__Impl6456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_11__0__Impl_in_rule__DataTypeTest__Group_11__06490 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_11__1_in_rule__DataTypeTest__Group_11__06493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_rule__DataTypeTest__Group_11__0__Impl6521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_11__1__Impl_in_rule__DataTypeTest__Group_11__16552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__ADecimalAssignment_11_1_in_rule__DataTypeTest__Group_11__1__Impl6579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_12__0__Impl_in_rule__DataTypeTest__Group_12__06613 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_12__1_in_rule__DataTypeTest__Group_12__06616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_rule__DataTypeTest__Group_12__0__Impl6644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_12__1__Impl_in_rule__DataTypeTest__Group_12__16675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__ADoubleAssignment_12_1_in_rule__DataTypeTest__Group_12__1__Impl6702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_13__0__Impl_in_rule__DataTypeTest__Group_13__06736 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_13__1_in_rule__DataTypeTest__Group_13__06739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_rule__DataTypeTest__Group_13__0__Impl6767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_13__1__Impl_in_rule__DataTypeTest__Group_13__16798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__ADurationAssignment_13_1_in_rule__DataTypeTest__Group_13__1__Impl6825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_14__0__Impl_in_rule__DataTypeTest__Group_14__06859 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_14__1_in_rule__DataTypeTest__Group_14__06862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_rule__DataTypeTest__Group_14__0__Impl6890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_14__1__Impl_in_rule__DataTypeTest__Group_14__16921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__AEntitiesAssignment_14_1_in_rule__DataTypeTest__Group_14__1__Impl6948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_15__0__Impl_in_rule__DataTypeTest__Group_15__06982 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_15__1_in_rule__DataTypeTest__Group_15__06985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_rule__DataTypeTest__Group_15__0__Impl7013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_15__1__Impl_in_rule__DataTypeTest__Group_15__17044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__AEntityAssignment_15_1_in_rule__DataTypeTest__Group_15__1__Impl7071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_16__0__Impl_in_rule__DataTypeTest__Group_16__07105 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_16__1_in_rule__DataTypeTest__Group_16__07108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_rule__DataTypeTest__Group_16__0__Impl7136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_16__1__Impl_in_rule__DataTypeTest__Group_16__17167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__AFloatAssignment_16_1_in_rule__DataTypeTest__Group_16__1__Impl7194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_17__0__Impl_in_rule__DataTypeTest__Group_17__07228 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_17__1_in_rule__DataTypeTest__Group_17__07231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_rule__DataTypeTest__Group_17__0__Impl7259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_17__1__Impl_in_rule__DataTypeTest__Group_17__17290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__AGDayAssignment_17_1_in_rule__DataTypeTest__Group_17__1__Impl7317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_18__0__Impl_in_rule__DataTypeTest__Group_18__07351 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_18__1_in_rule__DataTypeTest__Group_18__07354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_rule__DataTypeTest__Group_18__0__Impl7382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_18__1__Impl_in_rule__DataTypeTest__Group_18__17413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__AGMonthAssignment_18_1_in_rule__DataTypeTest__Group_18__1__Impl7440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_19__0__Impl_in_rule__DataTypeTest__Group_19__07474 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_19__1_in_rule__DataTypeTest__Group_19__07477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_rule__DataTypeTest__Group_19__0__Impl7505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_19__1__Impl_in_rule__DataTypeTest__Group_19__17536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__AGMonthDayAssignment_19_1_in_rule__DataTypeTest__Group_19__1__Impl7563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_20__0__Impl_in_rule__DataTypeTest__Group_20__07597 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_20__1_in_rule__DataTypeTest__Group_20__07600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_rule__DataTypeTest__Group_20__0__Impl7628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_20__1__Impl_in_rule__DataTypeTest__Group_20__17659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__AGYearAssignment_20_1_in_rule__DataTypeTest__Group_20__1__Impl7686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_21__0__Impl_in_rule__DataTypeTest__Group_21__07720 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_21__1_in_rule__DataTypeTest__Group_21__07723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_rule__DataTypeTest__Group_21__0__Impl7751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_21__1__Impl_in_rule__DataTypeTest__Group_21__17782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__AGYearMonthAssignment_21_1_in_rule__DataTypeTest__Group_21__1__Impl7809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_22__0__Impl_in_rule__DataTypeTest__Group_22__07843 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_22__1_in_rule__DataTypeTest__Group_22__07846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_rule__DataTypeTest__Group_22__0__Impl7874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_22__1__Impl_in_rule__DataTypeTest__Group_22__17905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__AHexBinaryAssignment_22_1_in_rule__DataTypeTest__Group_22__1__Impl7932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_23__0__Impl_in_rule__DataTypeTest__Group_23__07966 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_23__1_in_rule__DataTypeTest__Group_23__07969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_rule__DataTypeTest__Group_23__0__Impl7997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_23__1__Impl_in_rule__DataTypeTest__Group_23__18028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__AIDREFAssignment_23_1_in_rule__DataTypeTest__Group_23__1__Impl8055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_24__0__Impl_in_rule__DataTypeTest__Group_24__08089 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_24__1_in_rule__DataTypeTest__Group_24__08092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_rule__DataTypeTest__Group_24__0__Impl8120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_24__1__Impl_in_rule__DataTypeTest__Group_24__18151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__AIDREFSAssignment_24_1_in_rule__DataTypeTest__Group_24__1__Impl8178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_25__0__Impl_in_rule__DataTypeTest__Group_25__08212 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_25__1_in_rule__DataTypeTest__Group_25__08215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_rule__DataTypeTest__Group_25__0__Impl8243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_25__1__Impl_in_rule__DataTypeTest__Group_25__18274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__AIntAssignment_25_1_in_rule__DataTypeTest__Group_25__1__Impl8301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_26__0__Impl_in_rule__DataTypeTest__Group_26__08335 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_26__1_in_rule__DataTypeTest__Group_26__08338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_rule__DataTypeTest__Group_26__0__Impl8366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_26__1__Impl_in_rule__DataTypeTest__Group_26__18397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__AIntegerAssignment_26_1_in_rule__DataTypeTest__Group_26__1__Impl8424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_27__0__Impl_in_rule__DataTypeTest__Group_27__08458 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_27__1_in_rule__DataTypeTest__Group_27__08461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_79_in_rule__DataTypeTest__Group_27__0__Impl8489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_27__1__Impl_in_rule__DataTypeTest__Group_27__18520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__ALanguageAssignment_27_1_in_rule__DataTypeTest__Group_27__1__Impl8547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_28__0__Impl_in_rule__DataTypeTest__Group_28__08581 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_28__1_in_rule__DataTypeTest__Group_28__08584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_80_in_rule__DataTypeTest__Group_28__0__Impl8612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_28__1__Impl_in_rule__DataTypeTest__Group_28__18643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__ALongAssignment_28_1_in_rule__DataTypeTest__Group_28__1__Impl8670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_29__0__Impl_in_rule__DataTypeTest__Group_29__08704 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_29__1_in_rule__DataTypeTest__Group_29__08707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_rule__DataTypeTest__Group_29__0__Impl8735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_29__1__Impl_in_rule__DataTypeTest__Group_29__18766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__ANameAssignment_29_1_in_rule__DataTypeTest__Group_29__1__Impl8793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_30__0__Impl_in_rule__DataTypeTest__Group_30__08827 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_30__1_in_rule__DataTypeTest__Group_30__08830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_82_in_rule__DataTypeTest__Group_30__0__Impl8858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_30__1__Impl_in_rule__DataTypeTest__Group_30__18889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__ANCNameAssignment_30_1_in_rule__DataTypeTest__Group_30__1__Impl8916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_31__0__Impl_in_rule__DataTypeTest__Group_31__08950 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_31__1_in_rule__DataTypeTest__Group_31__08953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_83_in_rule__DataTypeTest__Group_31__0__Impl8981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_31__1__Impl_in_rule__DataTypeTest__Group_31__19012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__ANMTOKENAssignment_31_1_in_rule__DataTypeTest__Group_31__1__Impl9039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_32__0__Impl_in_rule__DataTypeTest__Group_32__09073 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_32__1_in_rule__DataTypeTest__Group_32__09076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_84_in_rule__DataTypeTest__Group_32__0__Impl9104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_32__1__Impl_in_rule__DataTypeTest__Group_32__19135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__ANMTOKENSAssignment_32_1_in_rule__DataTypeTest__Group_32__1__Impl9162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_33__0__Impl_in_rule__DataTypeTest__Group_33__09196 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_33__1_in_rule__DataTypeTest__Group_33__09199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_85_in_rule__DataTypeTest__Group_33__0__Impl9227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_33__1__Impl_in_rule__DataTypeTest__Group_33__19258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__ANonNegativeIntegerAssignment_33_1_in_rule__DataTypeTest__Group_33__1__Impl9285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_34__0__Impl_in_rule__DataTypeTest__Group_34__09319 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_34__1_in_rule__DataTypeTest__Group_34__09322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_86_in_rule__DataTypeTest__Group_34__0__Impl9350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_34__1__Impl_in_rule__DataTypeTest__Group_34__19381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__ANonPositiveIntegerAssignment_34_1_in_rule__DataTypeTest__Group_34__1__Impl9408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_35__0__Impl_in_rule__DataTypeTest__Group_35__09442 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_35__1_in_rule__DataTypeTest__Group_35__09445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_87_in_rule__DataTypeTest__Group_35__0__Impl9473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_35__1__Impl_in_rule__DataTypeTest__Group_35__19504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__APositiveIntegerAssignment_35_1_in_rule__DataTypeTest__Group_35__1__Impl9531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_36__0__Impl_in_rule__DataTypeTest__Group_36__09565 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_36__1_in_rule__DataTypeTest__Group_36__09568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_88_in_rule__DataTypeTest__Group_36__0__Impl9596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_36__1__Impl_in_rule__DataTypeTest__Group_36__19627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__AQNameAssignment_36_1_in_rule__DataTypeTest__Group_36__1__Impl9654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_37__0__Impl_in_rule__DataTypeTest__Group_37__09688 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_37__1_in_rule__DataTypeTest__Group_37__09691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_89_in_rule__DataTypeTest__Group_37__0__Impl9719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_37__1__Impl_in_rule__DataTypeTest__Group_37__19750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__AShortAssignment_37_1_in_rule__DataTypeTest__Group_37__1__Impl9777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_38__0__Impl_in_rule__DataTypeTest__Group_38__09811 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_38__1_in_rule__DataTypeTest__Group_38__09814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_90_in_rule__DataTypeTest__Group_38__0__Impl9842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_38__1__Impl_in_rule__DataTypeTest__Group_38__19873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__AStringAssignment_38_1_in_rule__DataTypeTest__Group_38__1__Impl9900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_39__0__Impl_in_rule__DataTypeTest__Group_39__09934 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_39__1_in_rule__DataTypeTest__Group_39__09937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_91_in_rule__DataTypeTest__Group_39__0__Impl9965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_39__1__Impl_in_rule__DataTypeTest__Group_39__19996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__ATimeAssignment_39_1_in_rule__DataTypeTest__Group_39__1__Impl10023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_40__0__Impl_in_rule__DataTypeTest__Group_40__010057 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_40__1_in_rule__DataTypeTest__Group_40__010060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_92_in_rule__DataTypeTest__Group_40__0__Impl10088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_40__1__Impl_in_rule__DataTypeTest__Group_40__110119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__ATokenAssignment_40_1_in_rule__DataTypeTest__Group_40__1__Impl10146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_41__0__Impl_in_rule__DataTypeTest__Group_41__010180 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_41__1_in_rule__DataTypeTest__Group_41__010183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_93_in_rule__DataTypeTest__Group_41__0__Impl10211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_41__1__Impl_in_rule__DataTypeTest__Group_41__110242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__AUnsignedByteAssignment_41_1_in_rule__DataTypeTest__Group_41__1__Impl10269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_42__0__Impl_in_rule__DataTypeTest__Group_42__010303 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_42__1_in_rule__DataTypeTest__Group_42__010306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_94_in_rule__DataTypeTest__Group_42__0__Impl10334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_42__1__Impl_in_rule__DataTypeTest__Group_42__110365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__AUnsignedIntAssignment_42_1_in_rule__DataTypeTest__Group_42__1__Impl10392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_43__0__Impl_in_rule__DataTypeTest__Group_43__010426 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_43__1_in_rule__DataTypeTest__Group_43__010429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_95_in_rule__DataTypeTest__Group_43__0__Impl10457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_43__1__Impl_in_rule__DataTypeTest__Group_43__110488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__AUnsignedLongAssignment_43_1_in_rule__DataTypeTest__Group_43__1__Impl10515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_44__0__Impl_in_rule__DataTypeTest__Group_44__010549 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_44__1_in_rule__DataTypeTest__Group_44__010552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_96_in_rule__DataTypeTest__Group_44__0__Impl10580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__Group_44__1__Impl_in_rule__DataTypeTest__Group_44__110611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypeTest__AUnsignedShortAssignment_44_1_in_rule__DataTypeTest__Group_44__1__Impl10638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID0_in_rule__DataTypeTest__AIDAssignment_210677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnySimpleType_in_rule__DataTypeTest__AAnySimpleTypeAssignment_4_110708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyURI_in_rule__DataTypeTest__AAnyURIAssignment_5_110739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBase64Binary_in_rule__DataTypeTest__ABase64BinaryAssignment_6_110770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolean_in_rule__DataTypeTest__ABooleanAssignment_7_110801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleByte_in_rule__DataTypeTest__AByteAssignment_8_110832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_rule__DataTypeTest__ADateAssignment_9_110863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDateTime_in_rule__DataTypeTest__ADateTimeAssignment_10_110894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDecimal_in_rule__DataTypeTest__ADecimalAssignment_11_110925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDouble_in_rule__DataTypeTest__ADoubleAssignment_12_110956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDuration_in_rule__DataTypeTest__ADurationAssignment_13_110987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleENTITIES_in_rule__DataTypeTest__AEntitiesAssignment_14_111018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleENTITY_in_rule__DataTypeTest__AEntityAssignment_15_111049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloat_in_rule__DataTypeTest__AFloatAssignment_16_111080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGDay_in_rule__DataTypeTest__AGDayAssignment_17_111111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGMonth_in_rule__DataTypeTest__AGMonthAssignment_18_111142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGMonthDay_in_rule__DataTypeTest__AGMonthDayAssignment_19_111173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGYear_in_rule__DataTypeTest__AGYearAssignment_20_111204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGYearMonth_in_rule__DataTypeTest__AGYearMonthAssignment_21_111235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHexBinary_in_rule__DataTypeTest__AHexBinaryAssignment_22_111266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIDREF_in_rule__DataTypeTest__AIDREFAssignment_23_111297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIDREFS_in_rule__DataTypeTest__AIDREFSAssignment_24_111328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInt0_in_rule__DataTypeTest__AIntAssignment_25_111359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_rule__DataTypeTest__AIntegerAssignment_26_111390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLanguage_in_rule__DataTypeTest__ALanguageAssignment_27_111421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLong_in_rule__DataTypeTest__ALongAssignment_28_111452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleName_in_rule__DataTypeTest__ANameAssignment_29_111483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNCName_in_rule__DataTypeTest__ANCNameAssignment_30_111514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNMTOKEN_in_rule__DataTypeTest__ANMTOKENAssignment_31_111545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNMTOKENS_in_rule__DataTypeTest__ANMTOKENSAssignment_32_111576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNonNegativeInteger_in_rule__DataTypeTest__ANonNegativeIntegerAssignment_33_111607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNonPositiveInteger_in_rule__DataTypeTest__ANonPositiveIntegerAssignment_34_111638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePositiveInteger_in_rule__DataTypeTest__APositiveIntegerAssignment_35_111669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQName_in_rule__DataTypeTest__AQNameAssignment_36_111700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShort_in_rule__DataTypeTest__AShortAssignment_37_111731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__DataTypeTest__AStringAssignment_38_111762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTime_in_rule__DataTypeTest__ATimeAssignment_39_111793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleToken_in_rule__DataTypeTest__ATokenAssignment_40_111824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnsignedByte_in_rule__DataTypeTest__AUnsignedByteAssignment_41_111855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnsignedInt_in_rule__DataTypeTest__AUnsignedIntAssignment_42_111886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnsignedLong_in_rule__DataTypeTest__AUnsignedLongAssignment_43_111917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnsignedShort_in_rule__DataTypeTest__AUnsignedShortAssignment_44_111948 = new BitSet(new long[]{0x0000000000000002L});
    }


}