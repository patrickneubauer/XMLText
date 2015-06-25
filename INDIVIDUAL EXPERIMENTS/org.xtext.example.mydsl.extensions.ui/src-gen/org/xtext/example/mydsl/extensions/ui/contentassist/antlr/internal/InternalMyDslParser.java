package org.xtext.example.mydsl.extensions.ui.contentassist.antlr.internal; 

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
import org.xtext.example.mydsl.extensions.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RootElementType'", "'{'", "'extendedAddress'", "'address'", "'language'", "'}'", "'ExtendedAddress'", "'street'", "'city'", "'country'", "'latitude'", "'longitude'", "'Address'", "'Language'", "'value'", "'.'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
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




    // $ANTLR start "entryRuleRootElementType"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleRootElementType : ruleRootElementType EOF ;
    public final void entryRuleRootElementType() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleRootElementType EOF )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleRootElementType EOF
            {
             before(grammarAccess.getRootElementTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRootElementType_in_entryRuleRootElementType61);
            ruleRootElementType();

            state._fsp--;

             after(grammarAccess.getRootElementTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRootElementType68); 

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
    // $ANTLR end "entryRuleRootElementType"


    // $ANTLR start "ruleRootElementType"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleRootElementType : ( ( rule__RootElementType__Group__0 ) ) ;
    public final void ruleRootElementType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__RootElementType__Group__0 ) ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__RootElementType__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__RootElementType__Group__0 ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__RootElementType__Group__0 )
            {
             before(grammarAccess.getRootElementTypeAccess().getGroup()); 
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__RootElementType__Group__0 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__RootElementType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__0_in_ruleRootElementType94);
            rule__RootElementType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRootElementTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleRootElementType"


    // $ANTLR start "entryRuleAddress"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleAddress : ruleAddress EOF ;
    public final void entryRuleAddress() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleAddress EOF )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleAddress EOF
            {
             before(grammarAccess.getAddressRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddress_in_entryRuleAddress121);
            ruleAddress();

            state._fsp--;

             after(grammarAccess.getAddressRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddress128); 

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
    // $ANTLR end "entryRuleAddress"


    // $ANTLR start "ruleAddress"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleAddress : ( ( rule__Address__Alternatives ) ) ;
    public final void ruleAddress() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__Address__Alternatives ) ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Address__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Address__Alternatives ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__Address__Alternatives )
            {
             before(grammarAccess.getAddressAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__Address__Alternatives )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__Address__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Address__Alternatives_in_ruleAddress154);
            rule__Address__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAddressAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAddress"


    // $ANTLR start "entryRuleExtendedAddress"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleExtendedAddress : ruleExtendedAddress EOF ;
    public final void entryRuleExtendedAddress() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleExtendedAddress EOF )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleExtendedAddress EOF
            {
             before(grammarAccess.getExtendedAddressRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedAddress_in_entryRuleExtendedAddress181);
            ruleExtendedAddress();

            state._fsp--;

             after(grammarAccess.getExtendedAddressRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtendedAddress188); 

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
    // $ANTLR end "entryRuleExtendedAddress"


    // $ANTLR start "ruleExtendedAddress"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleExtendedAddress : ( ( rule__ExtendedAddress__Group__0 ) ) ;
    public final void ruleExtendedAddress() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__ExtendedAddress__Group__0 ) ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__ExtendedAddress__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__ExtendedAddress__Group__0 ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__ExtendedAddress__Group__0 )
            {
             before(grammarAccess.getExtendedAddressAccess().getGroup()); 
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__ExtendedAddress__Group__0 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__ExtendedAddress__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__Group__0_in_ruleExtendedAddress214);
            rule__ExtendedAddress__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtendedAddressAccess().getGroup()); 

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
    // $ANTLR end "ruleExtendedAddress"


    // $ANTLR start "entryRuleAddress_Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleAddress_Impl : ruleAddress_Impl EOF ;
    public final void entryRuleAddress_Impl() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleAddress_Impl EOF )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleAddress_Impl EOF
            {
             before(grammarAccess.getAddress_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddress_Impl_in_entryRuleAddress_Impl241);
            ruleAddress_Impl();

            state._fsp--;

             after(grammarAccess.getAddress_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddress_Impl248); 

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
    // $ANTLR end "entryRuleAddress_Impl"


    // $ANTLR start "ruleAddress_Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleAddress_Impl : ( ( rule__Address_Impl__Group__0 ) ) ;
    public final void ruleAddress_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ( rule__Address_Impl__Group__0 ) ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Address_Impl__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Address_Impl__Group__0 ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( rule__Address_Impl__Group__0 )
            {
             before(grammarAccess.getAddress_ImplAccess().getGroup()); 
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__Address_Impl__Group__0 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: rule__Address_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Address_Impl__Group__0_in_ruleAddress_Impl274);
            rule__Address_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddress_ImplAccess().getGroup()); 

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
    // $ANTLR end "ruleAddress_Impl"


    // $ANTLR start "entryRuleLanguage"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleLanguage : ruleLanguage EOF ;
    public final void entryRuleLanguage() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleLanguage EOF )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleLanguage EOF
            {
             before(grammarAccess.getLanguageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLanguage_in_entryRuleLanguage301);
            ruleLanguage();

            state._fsp--;

             after(grammarAccess.getLanguageRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLanguage308); 

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
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleLanguage : ( ( rule__Language__Group__0 ) ) ;
    public final void ruleLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( ( rule__Language__Group__0 ) ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__Language__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__Language__Group__0 ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ( rule__Language__Group__0 )
            {
             before(grammarAccess.getLanguageAccess().getGroup()); 
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( rule__Language__Group__0 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:188:2: rule__Language__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Language__Group__0_in_ruleLanguage334);
            rule__Language__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLanguageAccess().getGroup()); 

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


    // $ANTLR start "entryRuleString0"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:200:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:201:1: ( ruleString0 EOF )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: ruleString0 EOF
            {
             before(grammarAccess.getString0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_entryRuleString0361);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getString0Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleString0368); 

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
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: ruleString0 : ( RULE_STRING ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:213:2: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: RULE_STRING
            {
             before(grammarAccess.getString0Access().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleString0394); 
             after(grammarAccess.getString0Access().getSTRINGTerminalRuleCall()); 

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


    // $ANTLR start "entryRuleDecimal"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:228:1: entryRuleDecimal : ruleDecimal EOF ;
    public final void entryRuleDecimal() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:229:1: ( ruleDecimal EOF )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: ruleDecimal EOF
            {
             before(grammarAccess.getDecimalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDecimal_in_entryRuleDecimal420);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getDecimalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDecimal427); 

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
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:237:1: ruleDecimal : ( ( rule__Decimal__Group__0 ) ) ;
    public final void ruleDecimal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:241:2: ( ( ( rule__Decimal__Group__0 ) ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__Decimal__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__Decimal__Group__0 ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:243:1: ( rule__Decimal__Group__0 )
            {
             before(grammarAccess.getDecimalAccess().getGroup()); 
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ( rule__Decimal__Group__0 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:244:2: rule__Decimal__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Decimal__Group__0_in_ruleDecimal453);
            rule__Decimal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDecimalAccess().getGroup()); 

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


    // $ANTLR start "entryRuleLanguage0"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:256:1: entryRuleLanguage0 : ruleLanguage0 EOF ;
    public final void entryRuleLanguage0() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:257:1: ( ruleLanguage0 EOF )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:258:1: ruleLanguage0 EOF
            {
             before(grammarAccess.getLanguage0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLanguage0_in_entryRuleLanguage0480);
            ruleLanguage0();

            state._fsp--;

             after(grammarAccess.getLanguage0Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLanguage0487); 

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
    // $ANTLR end "entryRuleLanguage0"


    // $ANTLR start "ruleLanguage0"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:265:1: ruleLanguage0 : ( RULE_STRING ) ;
    public final void ruleLanguage0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:269:2: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:271:1: RULE_STRING
            {
             before(grammarAccess.getLanguage0Access().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleLanguage0513); 
             after(grammarAccess.getLanguage0Access().getSTRINGTerminalRuleCall()); 

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
    // $ANTLR end "ruleLanguage0"


    // $ANTLR start "rule__Address__Alternatives"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:284:1: rule__Address__Alternatives : ( ( ruleAddress_Impl ) | ( ruleExtendedAddress ) );
    public final void rule__Address__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:288:1: ( ( ruleAddress_Impl ) | ( ruleExtendedAddress ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            else if ( (LA1_0==17) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:289:1: ( ruleAddress_Impl )
                    {
                    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:289:1: ( ruleAddress_Impl )
                    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:290:1: ruleAddress_Impl
                    {
                     before(grammarAccess.getAddressAccess().getAddress_ImplParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAddress_Impl_in_rule__Address__Alternatives548);
                    ruleAddress_Impl();

                    state._fsp--;

                     after(grammarAccess.getAddressAccess().getAddress_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:295:6: ( ruleExtendedAddress )
                    {
                    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:295:6: ( ruleExtendedAddress )
                    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:296:1: ruleExtendedAddress
                    {
                     before(grammarAccess.getAddressAccess().getExtendedAddressParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExtendedAddress_in_rule__Address__Alternatives565);
                    ruleExtendedAddress();

                    state._fsp--;

                     after(grammarAccess.getAddressAccess().getExtendedAddressParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Alternatives"


    // $ANTLR start "rule__RootElementType__Group__0"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:308:1: rule__RootElementType__Group__0 : rule__RootElementType__Group__0__Impl rule__RootElementType__Group__1 ;
    public final void rule__RootElementType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:312:1: ( rule__RootElementType__Group__0__Impl rule__RootElementType__Group__1 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:313:2: rule__RootElementType__Group__0__Impl rule__RootElementType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__0__Impl_in_rule__RootElementType__Group__0595);
            rule__RootElementType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__1_in_rule__RootElementType__Group__0598);
            rule__RootElementType__Group__1();

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
    // $ANTLR end "rule__RootElementType__Group__0"


    // $ANTLR start "rule__RootElementType__Group__0__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:320:1: rule__RootElementType__Group__0__Impl : ( 'RootElementType' ) ;
    public final void rule__RootElementType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:324:1: ( ( 'RootElementType' ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:325:1: ( 'RootElementType' )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:325:1: ( 'RootElementType' )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: 'RootElementType'
            {
             before(grammarAccess.getRootElementTypeAccess().getRootElementTypeKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__RootElementType__Group__0__Impl626); 
             after(grammarAccess.getRootElementTypeAccess().getRootElementTypeKeyword_0()); 

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
    // $ANTLR end "rule__RootElementType__Group__0__Impl"


    // $ANTLR start "rule__RootElementType__Group__1"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:339:1: rule__RootElementType__Group__1 : rule__RootElementType__Group__1__Impl rule__RootElementType__Group__2 ;
    public final void rule__RootElementType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:343:1: ( rule__RootElementType__Group__1__Impl rule__RootElementType__Group__2 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:344:2: rule__RootElementType__Group__1__Impl rule__RootElementType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__1__Impl_in_rule__RootElementType__Group__1657);
            rule__RootElementType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__2_in_rule__RootElementType__Group__1660);
            rule__RootElementType__Group__2();

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
    // $ANTLR end "rule__RootElementType__Group__1"


    // $ANTLR start "rule__RootElementType__Group__1__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:351:1: rule__RootElementType__Group__1__Impl : ( '{' ) ;
    public final void rule__RootElementType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:355:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:356:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:356:1: ( '{' )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:357:1: '{'
            {
             before(grammarAccess.getRootElementTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__RootElementType__Group__1__Impl688); 
             after(grammarAccess.getRootElementTypeAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__RootElementType__Group__1__Impl"


    // $ANTLR start "rule__RootElementType__Group__2"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:370:1: rule__RootElementType__Group__2 : rule__RootElementType__Group__2__Impl rule__RootElementType__Group__3 ;
    public final void rule__RootElementType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:374:1: ( rule__RootElementType__Group__2__Impl rule__RootElementType__Group__3 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:375:2: rule__RootElementType__Group__2__Impl rule__RootElementType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__2__Impl_in_rule__RootElementType__Group__2719);
            rule__RootElementType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__3_in_rule__RootElementType__Group__2722);
            rule__RootElementType__Group__3();

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
    // $ANTLR end "rule__RootElementType__Group__2"


    // $ANTLR start "rule__RootElementType__Group__2__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:382:1: rule__RootElementType__Group__2__Impl : ( 'extendedAddress' ) ;
    public final void rule__RootElementType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:386:1: ( ( 'extendedAddress' ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:387:1: ( 'extendedAddress' )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:387:1: ( 'extendedAddress' )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:388:1: 'extendedAddress'
            {
             before(grammarAccess.getRootElementTypeAccess().getExtendedAddressKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__RootElementType__Group__2__Impl750); 
             after(grammarAccess.getRootElementTypeAccess().getExtendedAddressKeyword_2()); 

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
    // $ANTLR end "rule__RootElementType__Group__2__Impl"


    // $ANTLR start "rule__RootElementType__Group__3"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:401:1: rule__RootElementType__Group__3 : rule__RootElementType__Group__3__Impl rule__RootElementType__Group__4 ;
    public final void rule__RootElementType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:405:1: ( rule__RootElementType__Group__3__Impl rule__RootElementType__Group__4 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:406:2: rule__RootElementType__Group__3__Impl rule__RootElementType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__3__Impl_in_rule__RootElementType__Group__3781);
            rule__RootElementType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__4_in_rule__RootElementType__Group__3784);
            rule__RootElementType__Group__4();

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
    // $ANTLR end "rule__RootElementType__Group__3"


    // $ANTLR start "rule__RootElementType__Group__3__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:413:1: rule__RootElementType__Group__3__Impl : ( ( rule__RootElementType__ExtendedAddressAssignment_3 ) ) ;
    public final void rule__RootElementType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:417:1: ( ( ( rule__RootElementType__ExtendedAddressAssignment_3 ) ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:418:1: ( ( rule__RootElementType__ExtendedAddressAssignment_3 ) )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:418:1: ( ( rule__RootElementType__ExtendedAddressAssignment_3 ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:419:1: ( rule__RootElementType__ExtendedAddressAssignment_3 )
            {
             before(grammarAccess.getRootElementTypeAccess().getExtendedAddressAssignment_3()); 
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:420:1: ( rule__RootElementType__ExtendedAddressAssignment_3 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:420:2: rule__RootElementType__ExtendedAddressAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__ExtendedAddressAssignment_3_in_rule__RootElementType__Group__3__Impl811);
            rule__RootElementType__ExtendedAddressAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRootElementTypeAccess().getExtendedAddressAssignment_3()); 

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
    // $ANTLR end "rule__RootElementType__Group__3__Impl"


    // $ANTLR start "rule__RootElementType__Group__4"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:430:1: rule__RootElementType__Group__4 : rule__RootElementType__Group__4__Impl rule__RootElementType__Group__5 ;
    public final void rule__RootElementType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:434:1: ( rule__RootElementType__Group__4__Impl rule__RootElementType__Group__5 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:435:2: rule__RootElementType__Group__4__Impl rule__RootElementType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__4__Impl_in_rule__RootElementType__Group__4841);
            rule__RootElementType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__5_in_rule__RootElementType__Group__4844);
            rule__RootElementType__Group__5();

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
    // $ANTLR end "rule__RootElementType__Group__4"


    // $ANTLR start "rule__RootElementType__Group__4__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:442:1: rule__RootElementType__Group__4__Impl : ( 'address' ) ;
    public final void rule__RootElementType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:446:1: ( ( 'address' ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:447:1: ( 'address' )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:447:1: ( 'address' )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:448:1: 'address'
            {
             before(grammarAccess.getRootElementTypeAccess().getAddressKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__RootElementType__Group__4__Impl872); 
             after(grammarAccess.getRootElementTypeAccess().getAddressKeyword_4()); 

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
    // $ANTLR end "rule__RootElementType__Group__4__Impl"


    // $ANTLR start "rule__RootElementType__Group__5"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:461:1: rule__RootElementType__Group__5 : rule__RootElementType__Group__5__Impl rule__RootElementType__Group__6 ;
    public final void rule__RootElementType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:465:1: ( rule__RootElementType__Group__5__Impl rule__RootElementType__Group__6 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:466:2: rule__RootElementType__Group__5__Impl rule__RootElementType__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__5__Impl_in_rule__RootElementType__Group__5903);
            rule__RootElementType__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__6_in_rule__RootElementType__Group__5906);
            rule__RootElementType__Group__6();

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
    // $ANTLR end "rule__RootElementType__Group__5"


    // $ANTLR start "rule__RootElementType__Group__5__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:473:1: rule__RootElementType__Group__5__Impl : ( ( rule__RootElementType__AddressAssignment_5 ) ) ;
    public final void rule__RootElementType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:477:1: ( ( ( rule__RootElementType__AddressAssignment_5 ) ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:478:1: ( ( rule__RootElementType__AddressAssignment_5 ) )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:478:1: ( ( rule__RootElementType__AddressAssignment_5 ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:479:1: ( rule__RootElementType__AddressAssignment_5 )
            {
             before(grammarAccess.getRootElementTypeAccess().getAddressAssignment_5()); 
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:480:1: ( rule__RootElementType__AddressAssignment_5 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:480:2: rule__RootElementType__AddressAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__AddressAssignment_5_in_rule__RootElementType__Group__5__Impl933);
            rule__RootElementType__AddressAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRootElementTypeAccess().getAddressAssignment_5()); 

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
    // $ANTLR end "rule__RootElementType__Group__5__Impl"


    // $ANTLR start "rule__RootElementType__Group__6"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:490:1: rule__RootElementType__Group__6 : rule__RootElementType__Group__6__Impl rule__RootElementType__Group__7 ;
    public final void rule__RootElementType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:494:1: ( rule__RootElementType__Group__6__Impl rule__RootElementType__Group__7 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:495:2: rule__RootElementType__Group__6__Impl rule__RootElementType__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__6__Impl_in_rule__RootElementType__Group__6963);
            rule__RootElementType__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__7_in_rule__RootElementType__Group__6966);
            rule__RootElementType__Group__7();

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
    // $ANTLR end "rule__RootElementType__Group__6"


    // $ANTLR start "rule__RootElementType__Group__6__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:502:1: rule__RootElementType__Group__6__Impl : ( 'language' ) ;
    public final void rule__RootElementType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:506:1: ( ( 'language' ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:507:1: ( 'language' )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:507:1: ( 'language' )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:508:1: 'language'
            {
             before(grammarAccess.getRootElementTypeAccess().getLanguageKeyword_6()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__RootElementType__Group__6__Impl994); 
             after(grammarAccess.getRootElementTypeAccess().getLanguageKeyword_6()); 

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
    // $ANTLR end "rule__RootElementType__Group__6__Impl"


    // $ANTLR start "rule__RootElementType__Group__7"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:521:1: rule__RootElementType__Group__7 : rule__RootElementType__Group__7__Impl rule__RootElementType__Group__8 ;
    public final void rule__RootElementType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:525:1: ( rule__RootElementType__Group__7__Impl rule__RootElementType__Group__8 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:526:2: rule__RootElementType__Group__7__Impl rule__RootElementType__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__7__Impl_in_rule__RootElementType__Group__71025);
            rule__RootElementType__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__8_in_rule__RootElementType__Group__71028);
            rule__RootElementType__Group__8();

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
    // $ANTLR end "rule__RootElementType__Group__7"


    // $ANTLR start "rule__RootElementType__Group__7__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:533:1: rule__RootElementType__Group__7__Impl : ( ( rule__RootElementType__LanguageAssignment_7 ) ) ;
    public final void rule__RootElementType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:537:1: ( ( ( rule__RootElementType__LanguageAssignment_7 ) ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:538:1: ( ( rule__RootElementType__LanguageAssignment_7 ) )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:538:1: ( ( rule__RootElementType__LanguageAssignment_7 ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:539:1: ( rule__RootElementType__LanguageAssignment_7 )
            {
             before(grammarAccess.getRootElementTypeAccess().getLanguageAssignment_7()); 
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:540:1: ( rule__RootElementType__LanguageAssignment_7 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:540:2: rule__RootElementType__LanguageAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__LanguageAssignment_7_in_rule__RootElementType__Group__7__Impl1055);
            rule__RootElementType__LanguageAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getRootElementTypeAccess().getLanguageAssignment_7()); 

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
    // $ANTLR end "rule__RootElementType__Group__7__Impl"


    // $ANTLR start "rule__RootElementType__Group__8"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:550:1: rule__RootElementType__Group__8 : rule__RootElementType__Group__8__Impl ;
    public final void rule__RootElementType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:554:1: ( rule__RootElementType__Group__8__Impl )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:555:2: rule__RootElementType__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__8__Impl_in_rule__RootElementType__Group__81085);
            rule__RootElementType__Group__8__Impl();

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
    // $ANTLR end "rule__RootElementType__Group__8"


    // $ANTLR start "rule__RootElementType__Group__8__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:561:1: rule__RootElementType__Group__8__Impl : ( '}' ) ;
    public final void rule__RootElementType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:565:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:566:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:566:1: ( '}' )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:567:1: '}'
            {
             before(grammarAccess.getRootElementTypeAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__RootElementType__Group__8__Impl1113); 
             after(grammarAccess.getRootElementTypeAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__RootElementType__Group__8__Impl"


    // $ANTLR start "rule__ExtendedAddress__Group__0"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:598:1: rule__ExtendedAddress__Group__0 : rule__ExtendedAddress__Group__0__Impl rule__ExtendedAddress__Group__1 ;
    public final void rule__ExtendedAddress__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:602:1: ( rule__ExtendedAddress__Group__0__Impl rule__ExtendedAddress__Group__1 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:603:2: rule__ExtendedAddress__Group__0__Impl rule__ExtendedAddress__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__Group__0__Impl_in_rule__ExtendedAddress__Group__01162);
            rule__ExtendedAddress__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__Group__1_in_rule__ExtendedAddress__Group__01165);
            rule__ExtendedAddress__Group__1();

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
    // $ANTLR end "rule__ExtendedAddress__Group__0"


    // $ANTLR start "rule__ExtendedAddress__Group__0__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:610:1: rule__ExtendedAddress__Group__0__Impl : ( 'ExtendedAddress' ) ;
    public final void rule__ExtendedAddress__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:614:1: ( ( 'ExtendedAddress' ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:615:1: ( 'ExtendedAddress' )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:615:1: ( 'ExtendedAddress' )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:616:1: 'ExtendedAddress'
            {
             before(grammarAccess.getExtendedAddressAccess().getExtendedAddressKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__ExtendedAddress__Group__0__Impl1193); 
             after(grammarAccess.getExtendedAddressAccess().getExtendedAddressKeyword_0()); 

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
    // $ANTLR end "rule__ExtendedAddress__Group__0__Impl"


    // $ANTLR start "rule__ExtendedAddress__Group__1"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:629:1: rule__ExtendedAddress__Group__1 : rule__ExtendedAddress__Group__1__Impl rule__ExtendedAddress__Group__2 ;
    public final void rule__ExtendedAddress__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:633:1: ( rule__ExtendedAddress__Group__1__Impl rule__ExtendedAddress__Group__2 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:634:2: rule__ExtendedAddress__Group__1__Impl rule__ExtendedAddress__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__Group__1__Impl_in_rule__ExtendedAddress__Group__11224);
            rule__ExtendedAddress__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__Group__2_in_rule__ExtendedAddress__Group__11227);
            rule__ExtendedAddress__Group__2();

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
    // $ANTLR end "rule__ExtendedAddress__Group__1"


    // $ANTLR start "rule__ExtendedAddress__Group__1__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:641:1: rule__ExtendedAddress__Group__1__Impl : ( '{' ) ;
    public final void rule__ExtendedAddress__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:645:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:646:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:646:1: ( '{' )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:647:1: '{'
            {
             before(grammarAccess.getExtendedAddressAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__ExtendedAddress__Group__1__Impl1255); 
             after(grammarAccess.getExtendedAddressAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__ExtendedAddress__Group__1__Impl"


    // $ANTLR start "rule__ExtendedAddress__Group__2"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:660:1: rule__ExtendedAddress__Group__2 : rule__ExtendedAddress__Group__2__Impl rule__ExtendedAddress__Group__3 ;
    public final void rule__ExtendedAddress__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:664:1: ( rule__ExtendedAddress__Group__2__Impl rule__ExtendedAddress__Group__3 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:665:2: rule__ExtendedAddress__Group__2__Impl rule__ExtendedAddress__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__Group__2__Impl_in_rule__ExtendedAddress__Group__21286);
            rule__ExtendedAddress__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__Group__3_in_rule__ExtendedAddress__Group__21289);
            rule__ExtendedAddress__Group__3();

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
    // $ANTLR end "rule__ExtendedAddress__Group__2"


    // $ANTLR start "rule__ExtendedAddress__Group__2__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:672:1: rule__ExtendedAddress__Group__2__Impl : ( 'street' ) ;
    public final void rule__ExtendedAddress__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:676:1: ( ( 'street' ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:677:1: ( 'street' )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:677:1: ( 'street' )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:678:1: 'street'
            {
             before(grammarAccess.getExtendedAddressAccess().getStreetKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__ExtendedAddress__Group__2__Impl1317); 
             after(grammarAccess.getExtendedAddressAccess().getStreetKeyword_2()); 

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
    // $ANTLR end "rule__ExtendedAddress__Group__2__Impl"


    // $ANTLR start "rule__ExtendedAddress__Group__3"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:691:1: rule__ExtendedAddress__Group__3 : rule__ExtendedAddress__Group__3__Impl rule__ExtendedAddress__Group__4 ;
    public final void rule__ExtendedAddress__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:695:1: ( rule__ExtendedAddress__Group__3__Impl rule__ExtendedAddress__Group__4 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:696:2: rule__ExtendedAddress__Group__3__Impl rule__ExtendedAddress__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__Group__3__Impl_in_rule__ExtendedAddress__Group__31348);
            rule__ExtendedAddress__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__Group__4_in_rule__ExtendedAddress__Group__31351);
            rule__ExtendedAddress__Group__4();

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
    // $ANTLR end "rule__ExtendedAddress__Group__3"


    // $ANTLR start "rule__ExtendedAddress__Group__3__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:703:1: rule__ExtendedAddress__Group__3__Impl : ( ( rule__ExtendedAddress__StreetAssignment_3 ) ) ;
    public final void rule__ExtendedAddress__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:707:1: ( ( ( rule__ExtendedAddress__StreetAssignment_3 ) ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:708:1: ( ( rule__ExtendedAddress__StreetAssignment_3 ) )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:708:1: ( ( rule__ExtendedAddress__StreetAssignment_3 ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:709:1: ( rule__ExtendedAddress__StreetAssignment_3 )
            {
             before(grammarAccess.getExtendedAddressAccess().getStreetAssignment_3()); 
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:710:1: ( rule__ExtendedAddress__StreetAssignment_3 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:710:2: rule__ExtendedAddress__StreetAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__StreetAssignment_3_in_rule__ExtendedAddress__Group__3__Impl1378);
            rule__ExtendedAddress__StreetAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExtendedAddressAccess().getStreetAssignment_3()); 

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
    // $ANTLR end "rule__ExtendedAddress__Group__3__Impl"


    // $ANTLR start "rule__ExtendedAddress__Group__4"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:720:1: rule__ExtendedAddress__Group__4 : rule__ExtendedAddress__Group__4__Impl rule__ExtendedAddress__Group__5 ;
    public final void rule__ExtendedAddress__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:724:1: ( rule__ExtendedAddress__Group__4__Impl rule__ExtendedAddress__Group__5 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:725:2: rule__ExtendedAddress__Group__4__Impl rule__ExtendedAddress__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__Group__4__Impl_in_rule__ExtendedAddress__Group__41408);
            rule__ExtendedAddress__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__Group__5_in_rule__ExtendedAddress__Group__41411);
            rule__ExtendedAddress__Group__5();

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
    // $ANTLR end "rule__ExtendedAddress__Group__4"


    // $ANTLR start "rule__ExtendedAddress__Group__4__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:732:1: rule__ExtendedAddress__Group__4__Impl : ( 'city' ) ;
    public final void rule__ExtendedAddress__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:736:1: ( ( 'city' ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:737:1: ( 'city' )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:737:1: ( 'city' )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:738:1: 'city'
            {
             before(grammarAccess.getExtendedAddressAccess().getCityKeyword_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__ExtendedAddress__Group__4__Impl1439); 
             after(grammarAccess.getExtendedAddressAccess().getCityKeyword_4()); 

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
    // $ANTLR end "rule__ExtendedAddress__Group__4__Impl"


    // $ANTLR start "rule__ExtendedAddress__Group__5"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:751:1: rule__ExtendedAddress__Group__5 : rule__ExtendedAddress__Group__5__Impl rule__ExtendedAddress__Group__6 ;
    public final void rule__ExtendedAddress__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:755:1: ( rule__ExtendedAddress__Group__5__Impl rule__ExtendedAddress__Group__6 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:756:2: rule__ExtendedAddress__Group__5__Impl rule__ExtendedAddress__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__Group__5__Impl_in_rule__ExtendedAddress__Group__51470);
            rule__ExtendedAddress__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__Group__6_in_rule__ExtendedAddress__Group__51473);
            rule__ExtendedAddress__Group__6();

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
    // $ANTLR end "rule__ExtendedAddress__Group__5"


    // $ANTLR start "rule__ExtendedAddress__Group__5__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:763:1: rule__ExtendedAddress__Group__5__Impl : ( ( rule__ExtendedAddress__CityAssignment_5 ) ) ;
    public final void rule__ExtendedAddress__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:767:1: ( ( ( rule__ExtendedAddress__CityAssignment_5 ) ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:768:1: ( ( rule__ExtendedAddress__CityAssignment_5 ) )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:768:1: ( ( rule__ExtendedAddress__CityAssignment_5 ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:769:1: ( rule__ExtendedAddress__CityAssignment_5 )
            {
             before(grammarAccess.getExtendedAddressAccess().getCityAssignment_5()); 
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:770:1: ( rule__ExtendedAddress__CityAssignment_5 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:770:2: rule__ExtendedAddress__CityAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__CityAssignment_5_in_rule__ExtendedAddress__Group__5__Impl1500);
            rule__ExtendedAddress__CityAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getExtendedAddressAccess().getCityAssignment_5()); 

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
    // $ANTLR end "rule__ExtendedAddress__Group__5__Impl"


    // $ANTLR start "rule__ExtendedAddress__Group__6"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:780:1: rule__ExtendedAddress__Group__6 : rule__ExtendedAddress__Group__6__Impl rule__ExtendedAddress__Group__7 ;
    public final void rule__ExtendedAddress__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:784:1: ( rule__ExtendedAddress__Group__6__Impl rule__ExtendedAddress__Group__7 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:785:2: rule__ExtendedAddress__Group__6__Impl rule__ExtendedAddress__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__Group__6__Impl_in_rule__ExtendedAddress__Group__61530);
            rule__ExtendedAddress__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__Group__7_in_rule__ExtendedAddress__Group__61533);
            rule__ExtendedAddress__Group__7();

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
    // $ANTLR end "rule__ExtendedAddress__Group__6"


    // $ANTLR start "rule__ExtendedAddress__Group__6__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:792:1: rule__ExtendedAddress__Group__6__Impl : ( 'country' ) ;
    public final void rule__ExtendedAddress__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:796:1: ( ( 'country' ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:797:1: ( 'country' )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:797:1: ( 'country' )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:798:1: 'country'
            {
             before(grammarAccess.getExtendedAddressAccess().getCountryKeyword_6()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__ExtendedAddress__Group__6__Impl1561); 
             after(grammarAccess.getExtendedAddressAccess().getCountryKeyword_6()); 

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
    // $ANTLR end "rule__ExtendedAddress__Group__6__Impl"


    // $ANTLR start "rule__ExtendedAddress__Group__7"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:811:1: rule__ExtendedAddress__Group__7 : rule__ExtendedAddress__Group__7__Impl rule__ExtendedAddress__Group__8 ;
    public final void rule__ExtendedAddress__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:815:1: ( rule__ExtendedAddress__Group__7__Impl rule__ExtendedAddress__Group__8 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:816:2: rule__ExtendedAddress__Group__7__Impl rule__ExtendedAddress__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__Group__7__Impl_in_rule__ExtendedAddress__Group__71592);
            rule__ExtendedAddress__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__Group__8_in_rule__ExtendedAddress__Group__71595);
            rule__ExtendedAddress__Group__8();

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
    // $ANTLR end "rule__ExtendedAddress__Group__7"


    // $ANTLR start "rule__ExtendedAddress__Group__7__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:823:1: rule__ExtendedAddress__Group__7__Impl : ( ( rule__ExtendedAddress__CountryAssignment_7 ) ) ;
    public final void rule__ExtendedAddress__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:827:1: ( ( ( rule__ExtendedAddress__CountryAssignment_7 ) ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:828:1: ( ( rule__ExtendedAddress__CountryAssignment_7 ) )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:828:1: ( ( rule__ExtendedAddress__CountryAssignment_7 ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:829:1: ( rule__ExtendedAddress__CountryAssignment_7 )
            {
             before(grammarAccess.getExtendedAddressAccess().getCountryAssignment_7()); 
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:830:1: ( rule__ExtendedAddress__CountryAssignment_7 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:830:2: rule__ExtendedAddress__CountryAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__CountryAssignment_7_in_rule__ExtendedAddress__Group__7__Impl1622);
            rule__ExtendedAddress__CountryAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getExtendedAddressAccess().getCountryAssignment_7()); 

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
    // $ANTLR end "rule__ExtendedAddress__Group__7__Impl"


    // $ANTLR start "rule__ExtendedAddress__Group__8"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:840:1: rule__ExtendedAddress__Group__8 : rule__ExtendedAddress__Group__8__Impl rule__ExtendedAddress__Group__9 ;
    public final void rule__ExtendedAddress__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:844:1: ( rule__ExtendedAddress__Group__8__Impl rule__ExtendedAddress__Group__9 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:845:2: rule__ExtendedAddress__Group__8__Impl rule__ExtendedAddress__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__Group__8__Impl_in_rule__ExtendedAddress__Group__81652);
            rule__ExtendedAddress__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__Group__9_in_rule__ExtendedAddress__Group__81655);
            rule__ExtendedAddress__Group__9();

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
    // $ANTLR end "rule__ExtendedAddress__Group__8"


    // $ANTLR start "rule__ExtendedAddress__Group__8__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:852:1: rule__ExtendedAddress__Group__8__Impl : ( ( rule__ExtendedAddress__Group_8__0 )? ) ;
    public final void rule__ExtendedAddress__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:856:1: ( ( ( rule__ExtendedAddress__Group_8__0 )? ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:857:1: ( ( rule__ExtendedAddress__Group_8__0 )? )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:857:1: ( ( rule__ExtendedAddress__Group_8__0 )? )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:858:1: ( rule__ExtendedAddress__Group_8__0 )?
            {
             before(grammarAccess.getExtendedAddressAccess().getGroup_8()); 
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:859:1: ( rule__ExtendedAddress__Group_8__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:859:2: rule__ExtendedAddress__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__Group_8__0_in_rule__ExtendedAddress__Group__8__Impl1682);
                    rule__ExtendedAddress__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExtendedAddressAccess().getGroup_8()); 

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
    // $ANTLR end "rule__ExtendedAddress__Group__8__Impl"


    // $ANTLR start "rule__ExtendedAddress__Group__9"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:869:1: rule__ExtendedAddress__Group__9 : rule__ExtendedAddress__Group__9__Impl rule__ExtendedAddress__Group__10 ;
    public final void rule__ExtendedAddress__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:873:1: ( rule__ExtendedAddress__Group__9__Impl rule__ExtendedAddress__Group__10 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:874:2: rule__ExtendedAddress__Group__9__Impl rule__ExtendedAddress__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__Group__9__Impl_in_rule__ExtendedAddress__Group__91713);
            rule__ExtendedAddress__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__Group__10_in_rule__ExtendedAddress__Group__91716);
            rule__ExtendedAddress__Group__10();

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
    // $ANTLR end "rule__ExtendedAddress__Group__9"


    // $ANTLR start "rule__ExtendedAddress__Group__9__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:881:1: rule__ExtendedAddress__Group__9__Impl : ( ( rule__ExtendedAddress__Group_9__0 )? ) ;
    public final void rule__ExtendedAddress__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:885:1: ( ( ( rule__ExtendedAddress__Group_9__0 )? ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:886:1: ( ( rule__ExtendedAddress__Group_9__0 )? )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:886:1: ( ( rule__ExtendedAddress__Group_9__0 )? )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:887:1: ( rule__ExtendedAddress__Group_9__0 )?
            {
             before(grammarAccess.getExtendedAddressAccess().getGroup_9()); 
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:888:1: ( rule__ExtendedAddress__Group_9__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:888:2: rule__ExtendedAddress__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__Group_9__0_in_rule__ExtendedAddress__Group__9__Impl1743);
                    rule__ExtendedAddress__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExtendedAddressAccess().getGroup_9()); 

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
    // $ANTLR end "rule__ExtendedAddress__Group__9__Impl"


    // $ANTLR start "rule__ExtendedAddress__Group__10"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:898:1: rule__ExtendedAddress__Group__10 : rule__ExtendedAddress__Group__10__Impl ;
    public final void rule__ExtendedAddress__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:902:1: ( rule__ExtendedAddress__Group__10__Impl )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:903:2: rule__ExtendedAddress__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__Group__10__Impl_in_rule__ExtendedAddress__Group__101774);
            rule__ExtendedAddress__Group__10__Impl();

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
    // $ANTLR end "rule__ExtendedAddress__Group__10"


    // $ANTLR start "rule__ExtendedAddress__Group__10__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:909:1: rule__ExtendedAddress__Group__10__Impl : ( '}' ) ;
    public final void rule__ExtendedAddress__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:913:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:914:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:914:1: ( '}' )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:915:1: '}'
            {
             before(grammarAccess.getExtendedAddressAccess().getRightCurlyBracketKeyword_10()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__ExtendedAddress__Group__10__Impl1802); 
             after(grammarAccess.getExtendedAddressAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__ExtendedAddress__Group__10__Impl"


    // $ANTLR start "rule__ExtendedAddress__Group_8__0"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:950:1: rule__ExtendedAddress__Group_8__0 : rule__ExtendedAddress__Group_8__0__Impl rule__ExtendedAddress__Group_8__1 ;
    public final void rule__ExtendedAddress__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:954:1: ( rule__ExtendedAddress__Group_8__0__Impl rule__ExtendedAddress__Group_8__1 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:955:2: rule__ExtendedAddress__Group_8__0__Impl rule__ExtendedAddress__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__Group_8__0__Impl_in_rule__ExtendedAddress__Group_8__01855);
            rule__ExtendedAddress__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__Group_8__1_in_rule__ExtendedAddress__Group_8__01858);
            rule__ExtendedAddress__Group_8__1();

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
    // $ANTLR end "rule__ExtendedAddress__Group_8__0"


    // $ANTLR start "rule__ExtendedAddress__Group_8__0__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:962:1: rule__ExtendedAddress__Group_8__0__Impl : ( 'latitude' ) ;
    public final void rule__ExtendedAddress__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:966:1: ( ( 'latitude' ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:967:1: ( 'latitude' )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:967:1: ( 'latitude' )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:968:1: 'latitude'
            {
             before(grammarAccess.getExtendedAddressAccess().getLatitudeKeyword_8_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__ExtendedAddress__Group_8__0__Impl1886); 
             after(grammarAccess.getExtendedAddressAccess().getLatitudeKeyword_8_0()); 

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
    // $ANTLR end "rule__ExtendedAddress__Group_8__0__Impl"


    // $ANTLR start "rule__ExtendedAddress__Group_8__1"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:981:1: rule__ExtendedAddress__Group_8__1 : rule__ExtendedAddress__Group_8__1__Impl ;
    public final void rule__ExtendedAddress__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:985:1: ( rule__ExtendedAddress__Group_8__1__Impl )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:986:2: rule__ExtendedAddress__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__Group_8__1__Impl_in_rule__ExtendedAddress__Group_8__11917);
            rule__ExtendedAddress__Group_8__1__Impl();

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
    // $ANTLR end "rule__ExtendedAddress__Group_8__1"


    // $ANTLR start "rule__ExtendedAddress__Group_8__1__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:992:1: rule__ExtendedAddress__Group_8__1__Impl : ( ( rule__ExtendedAddress__LatitudeAssignment_8_1 ) ) ;
    public final void rule__ExtendedAddress__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:996:1: ( ( ( rule__ExtendedAddress__LatitudeAssignment_8_1 ) ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:997:1: ( ( rule__ExtendedAddress__LatitudeAssignment_8_1 ) )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:997:1: ( ( rule__ExtendedAddress__LatitudeAssignment_8_1 ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:998:1: ( rule__ExtendedAddress__LatitudeAssignment_8_1 )
            {
             before(grammarAccess.getExtendedAddressAccess().getLatitudeAssignment_8_1()); 
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:999:1: ( rule__ExtendedAddress__LatitudeAssignment_8_1 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:999:2: rule__ExtendedAddress__LatitudeAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__LatitudeAssignment_8_1_in_rule__ExtendedAddress__Group_8__1__Impl1944);
            rule__ExtendedAddress__LatitudeAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getExtendedAddressAccess().getLatitudeAssignment_8_1()); 

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
    // $ANTLR end "rule__ExtendedAddress__Group_8__1__Impl"


    // $ANTLR start "rule__ExtendedAddress__Group_9__0"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1013:1: rule__ExtendedAddress__Group_9__0 : rule__ExtendedAddress__Group_9__0__Impl rule__ExtendedAddress__Group_9__1 ;
    public final void rule__ExtendedAddress__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1017:1: ( rule__ExtendedAddress__Group_9__0__Impl rule__ExtendedAddress__Group_9__1 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1018:2: rule__ExtendedAddress__Group_9__0__Impl rule__ExtendedAddress__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__Group_9__0__Impl_in_rule__ExtendedAddress__Group_9__01978);
            rule__ExtendedAddress__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__Group_9__1_in_rule__ExtendedAddress__Group_9__01981);
            rule__ExtendedAddress__Group_9__1();

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
    // $ANTLR end "rule__ExtendedAddress__Group_9__0"


    // $ANTLR start "rule__ExtendedAddress__Group_9__0__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1025:1: rule__ExtendedAddress__Group_9__0__Impl : ( 'longitude' ) ;
    public final void rule__ExtendedAddress__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1029:1: ( ( 'longitude' ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1030:1: ( 'longitude' )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1030:1: ( 'longitude' )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1031:1: 'longitude'
            {
             before(grammarAccess.getExtendedAddressAccess().getLongitudeKeyword_9_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__ExtendedAddress__Group_9__0__Impl2009); 
             after(grammarAccess.getExtendedAddressAccess().getLongitudeKeyword_9_0()); 

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
    // $ANTLR end "rule__ExtendedAddress__Group_9__0__Impl"


    // $ANTLR start "rule__ExtendedAddress__Group_9__1"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1044:1: rule__ExtendedAddress__Group_9__1 : rule__ExtendedAddress__Group_9__1__Impl ;
    public final void rule__ExtendedAddress__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1048:1: ( rule__ExtendedAddress__Group_9__1__Impl )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1049:2: rule__ExtendedAddress__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__Group_9__1__Impl_in_rule__ExtendedAddress__Group_9__12040);
            rule__ExtendedAddress__Group_9__1__Impl();

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
    // $ANTLR end "rule__ExtendedAddress__Group_9__1"


    // $ANTLR start "rule__ExtendedAddress__Group_9__1__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1055:1: rule__ExtendedAddress__Group_9__1__Impl : ( ( rule__ExtendedAddress__LongitudeAssignment_9_1 ) ) ;
    public final void rule__ExtendedAddress__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1059:1: ( ( ( rule__ExtendedAddress__LongitudeAssignment_9_1 ) ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1060:1: ( ( rule__ExtendedAddress__LongitudeAssignment_9_1 ) )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1060:1: ( ( rule__ExtendedAddress__LongitudeAssignment_9_1 ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1061:1: ( rule__ExtendedAddress__LongitudeAssignment_9_1 )
            {
             before(grammarAccess.getExtendedAddressAccess().getLongitudeAssignment_9_1()); 
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1062:1: ( rule__ExtendedAddress__LongitudeAssignment_9_1 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1062:2: rule__ExtendedAddress__LongitudeAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedAddress__LongitudeAssignment_9_1_in_rule__ExtendedAddress__Group_9__1__Impl2067);
            rule__ExtendedAddress__LongitudeAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getExtendedAddressAccess().getLongitudeAssignment_9_1()); 

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
    // $ANTLR end "rule__ExtendedAddress__Group_9__1__Impl"


    // $ANTLR start "rule__Address_Impl__Group__0"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1076:1: rule__Address_Impl__Group__0 : rule__Address_Impl__Group__0__Impl rule__Address_Impl__Group__1 ;
    public final void rule__Address_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1080:1: ( rule__Address_Impl__Group__0__Impl rule__Address_Impl__Group__1 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1081:2: rule__Address_Impl__Group__0__Impl rule__Address_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Address_Impl__Group__0__Impl_in_rule__Address_Impl__Group__02101);
            rule__Address_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Address_Impl__Group__1_in_rule__Address_Impl__Group__02104);
            rule__Address_Impl__Group__1();

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
    // $ANTLR end "rule__Address_Impl__Group__0"


    // $ANTLR start "rule__Address_Impl__Group__0__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1088:1: rule__Address_Impl__Group__0__Impl : ( 'Address' ) ;
    public final void rule__Address_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1092:1: ( ( 'Address' ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1093:1: ( 'Address' )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1093:1: ( 'Address' )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1094:1: 'Address'
            {
             before(grammarAccess.getAddress_ImplAccess().getAddressKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Address_Impl__Group__0__Impl2132); 
             after(grammarAccess.getAddress_ImplAccess().getAddressKeyword_0()); 

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
    // $ANTLR end "rule__Address_Impl__Group__0__Impl"


    // $ANTLR start "rule__Address_Impl__Group__1"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1107:1: rule__Address_Impl__Group__1 : rule__Address_Impl__Group__1__Impl rule__Address_Impl__Group__2 ;
    public final void rule__Address_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1111:1: ( rule__Address_Impl__Group__1__Impl rule__Address_Impl__Group__2 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1112:2: rule__Address_Impl__Group__1__Impl rule__Address_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Address_Impl__Group__1__Impl_in_rule__Address_Impl__Group__12163);
            rule__Address_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Address_Impl__Group__2_in_rule__Address_Impl__Group__12166);
            rule__Address_Impl__Group__2();

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
    // $ANTLR end "rule__Address_Impl__Group__1"


    // $ANTLR start "rule__Address_Impl__Group__1__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1119:1: rule__Address_Impl__Group__1__Impl : ( '{' ) ;
    public final void rule__Address_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1123:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1124:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1124:1: ( '{' )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1125:1: '{'
            {
             before(grammarAccess.getAddress_ImplAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Address_Impl__Group__1__Impl2194); 
             after(grammarAccess.getAddress_ImplAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Address_Impl__Group__1__Impl"


    // $ANTLR start "rule__Address_Impl__Group__2"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1138:1: rule__Address_Impl__Group__2 : rule__Address_Impl__Group__2__Impl rule__Address_Impl__Group__3 ;
    public final void rule__Address_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1142:1: ( rule__Address_Impl__Group__2__Impl rule__Address_Impl__Group__3 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1143:2: rule__Address_Impl__Group__2__Impl rule__Address_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Address_Impl__Group__2__Impl_in_rule__Address_Impl__Group__22225);
            rule__Address_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Address_Impl__Group__3_in_rule__Address_Impl__Group__22228);
            rule__Address_Impl__Group__3();

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
    // $ANTLR end "rule__Address_Impl__Group__2"


    // $ANTLR start "rule__Address_Impl__Group__2__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1150:1: rule__Address_Impl__Group__2__Impl : ( 'street' ) ;
    public final void rule__Address_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1154:1: ( ( 'street' ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1155:1: ( 'street' )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1155:1: ( 'street' )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1156:1: 'street'
            {
             before(grammarAccess.getAddress_ImplAccess().getStreetKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Address_Impl__Group__2__Impl2256); 
             after(grammarAccess.getAddress_ImplAccess().getStreetKeyword_2()); 

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
    // $ANTLR end "rule__Address_Impl__Group__2__Impl"


    // $ANTLR start "rule__Address_Impl__Group__3"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1169:1: rule__Address_Impl__Group__3 : rule__Address_Impl__Group__3__Impl rule__Address_Impl__Group__4 ;
    public final void rule__Address_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1173:1: ( rule__Address_Impl__Group__3__Impl rule__Address_Impl__Group__4 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1174:2: rule__Address_Impl__Group__3__Impl rule__Address_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Address_Impl__Group__3__Impl_in_rule__Address_Impl__Group__32287);
            rule__Address_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Address_Impl__Group__4_in_rule__Address_Impl__Group__32290);
            rule__Address_Impl__Group__4();

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
    // $ANTLR end "rule__Address_Impl__Group__3"


    // $ANTLR start "rule__Address_Impl__Group__3__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1181:1: rule__Address_Impl__Group__3__Impl : ( ( rule__Address_Impl__StreetAssignment_3 ) ) ;
    public final void rule__Address_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1185:1: ( ( ( rule__Address_Impl__StreetAssignment_3 ) ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1186:1: ( ( rule__Address_Impl__StreetAssignment_3 ) )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1186:1: ( ( rule__Address_Impl__StreetAssignment_3 ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1187:1: ( rule__Address_Impl__StreetAssignment_3 )
            {
             before(grammarAccess.getAddress_ImplAccess().getStreetAssignment_3()); 
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1188:1: ( rule__Address_Impl__StreetAssignment_3 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1188:2: rule__Address_Impl__StreetAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Address_Impl__StreetAssignment_3_in_rule__Address_Impl__Group__3__Impl2317);
            rule__Address_Impl__StreetAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAddress_ImplAccess().getStreetAssignment_3()); 

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
    // $ANTLR end "rule__Address_Impl__Group__3__Impl"


    // $ANTLR start "rule__Address_Impl__Group__4"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1198:1: rule__Address_Impl__Group__4 : rule__Address_Impl__Group__4__Impl rule__Address_Impl__Group__5 ;
    public final void rule__Address_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1202:1: ( rule__Address_Impl__Group__4__Impl rule__Address_Impl__Group__5 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1203:2: rule__Address_Impl__Group__4__Impl rule__Address_Impl__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Address_Impl__Group__4__Impl_in_rule__Address_Impl__Group__42347);
            rule__Address_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Address_Impl__Group__5_in_rule__Address_Impl__Group__42350);
            rule__Address_Impl__Group__5();

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
    // $ANTLR end "rule__Address_Impl__Group__4"


    // $ANTLR start "rule__Address_Impl__Group__4__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1210:1: rule__Address_Impl__Group__4__Impl : ( 'city' ) ;
    public final void rule__Address_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1214:1: ( ( 'city' ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1215:1: ( 'city' )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1215:1: ( 'city' )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1216:1: 'city'
            {
             before(grammarAccess.getAddress_ImplAccess().getCityKeyword_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Address_Impl__Group__4__Impl2378); 
             after(grammarAccess.getAddress_ImplAccess().getCityKeyword_4()); 

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
    // $ANTLR end "rule__Address_Impl__Group__4__Impl"


    // $ANTLR start "rule__Address_Impl__Group__5"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1229:1: rule__Address_Impl__Group__5 : rule__Address_Impl__Group__5__Impl rule__Address_Impl__Group__6 ;
    public final void rule__Address_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1233:1: ( rule__Address_Impl__Group__5__Impl rule__Address_Impl__Group__6 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1234:2: rule__Address_Impl__Group__5__Impl rule__Address_Impl__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Address_Impl__Group__5__Impl_in_rule__Address_Impl__Group__52409);
            rule__Address_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Address_Impl__Group__6_in_rule__Address_Impl__Group__52412);
            rule__Address_Impl__Group__6();

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
    // $ANTLR end "rule__Address_Impl__Group__5"


    // $ANTLR start "rule__Address_Impl__Group__5__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1241:1: rule__Address_Impl__Group__5__Impl : ( ( rule__Address_Impl__CityAssignment_5 ) ) ;
    public final void rule__Address_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1245:1: ( ( ( rule__Address_Impl__CityAssignment_5 ) ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1246:1: ( ( rule__Address_Impl__CityAssignment_5 ) )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1246:1: ( ( rule__Address_Impl__CityAssignment_5 ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1247:1: ( rule__Address_Impl__CityAssignment_5 )
            {
             before(grammarAccess.getAddress_ImplAccess().getCityAssignment_5()); 
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1248:1: ( rule__Address_Impl__CityAssignment_5 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1248:2: rule__Address_Impl__CityAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Address_Impl__CityAssignment_5_in_rule__Address_Impl__Group__5__Impl2439);
            rule__Address_Impl__CityAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAddress_ImplAccess().getCityAssignment_5()); 

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
    // $ANTLR end "rule__Address_Impl__Group__5__Impl"


    // $ANTLR start "rule__Address_Impl__Group__6"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1258:1: rule__Address_Impl__Group__6 : rule__Address_Impl__Group__6__Impl rule__Address_Impl__Group__7 ;
    public final void rule__Address_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1262:1: ( rule__Address_Impl__Group__6__Impl rule__Address_Impl__Group__7 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1263:2: rule__Address_Impl__Group__6__Impl rule__Address_Impl__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Address_Impl__Group__6__Impl_in_rule__Address_Impl__Group__62469);
            rule__Address_Impl__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Address_Impl__Group__7_in_rule__Address_Impl__Group__62472);
            rule__Address_Impl__Group__7();

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
    // $ANTLR end "rule__Address_Impl__Group__6"


    // $ANTLR start "rule__Address_Impl__Group__6__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1270:1: rule__Address_Impl__Group__6__Impl : ( 'country' ) ;
    public final void rule__Address_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1274:1: ( ( 'country' ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1275:1: ( 'country' )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1275:1: ( 'country' )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1276:1: 'country'
            {
             before(grammarAccess.getAddress_ImplAccess().getCountryKeyword_6()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Address_Impl__Group__6__Impl2500); 
             after(grammarAccess.getAddress_ImplAccess().getCountryKeyword_6()); 

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
    // $ANTLR end "rule__Address_Impl__Group__6__Impl"


    // $ANTLR start "rule__Address_Impl__Group__7"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1289:1: rule__Address_Impl__Group__7 : rule__Address_Impl__Group__7__Impl rule__Address_Impl__Group__8 ;
    public final void rule__Address_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1293:1: ( rule__Address_Impl__Group__7__Impl rule__Address_Impl__Group__8 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1294:2: rule__Address_Impl__Group__7__Impl rule__Address_Impl__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Address_Impl__Group__7__Impl_in_rule__Address_Impl__Group__72531);
            rule__Address_Impl__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Address_Impl__Group__8_in_rule__Address_Impl__Group__72534);
            rule__Address_Impl__Group__8();

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
    // $ANTLR end "rule__Address_Impl__Group__7"


    // $ANTLR start "rule__Address_Impl__Group__7__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1301:1: rule__Address_Impl__Group__7__Impl : ( ( rule__Address_Impl__CountryAssignment_7 ) ) ;
    public final void rule__Address_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1305:1: ( ( ( rule__Address_Impl__CountryAssignment_7 ) ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1306:1: ( ( rule__Address_Impl__CountryAssignment_7 ) )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1306:1: ( ( rule__Address_Impl__CountryAssignment_7 ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1307:1: ( rule__Address_Impl__CountryAssignment_7 )
            {
             before(grammarAccess.getAddress_ImplAccess().getCountryAssignment_7()); 
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1308:1: ( rule__Address_Impl__CountryAssignment_7 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1308:2: rule__Address_Impl__CountryAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Address_Impl__CountryAssignment_7_in_rule__Address_Impl__Group__7__Impl2561);
            rule__Address_Impl__CountryAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getAddress_ImplAccess().getCountryAssignment_7()); 

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
    // $ANTLR end "rule__Address_Impl__Group__7__Impl"


    // $ANTLR start "rule__Address_Impl__Group__8"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1318:1: rule__Address_Impl__Group__8 : rule__Address_Impl__Group__8__Impl ;
    public final void rule__Address_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1322:1: ( rule__Address_Impl__Group__8__Impl )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1323:2: rule__Address_Impl__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Address_Impl__Group__8__Impl_in_rule__Address_Impl__Group__82591);
            rule__Address_Impl__Group__8__Impl();

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
    // $ANTLR end "rule__Address_Impl__Group__8"


    // $ANTLR start "rule__Address_Impl__Group__8__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1329:1: rule__Address_Impl__Group__8__Impl : ( '}' ) ;
    public final void rule__Address_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1333:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1334:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1334:1: ( '}' )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1335:1: '}'
            {
             before(grammarAccess.getAddress_ImplAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Address_Impl__Group__8__Impl2619); 
             after(grammarAccess.getAddress_ImplAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Address_Impl__Group__8__Impl"


    // $ANTLR start "rule__Language__Group__0"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1366:1: rule__Language__Group__0 : rule__Language__Group__0__Impl rule__Language__Group__1 ;
    public final void rule__Language__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1370:1: ( rule__Language__Group__0__Impl rule__Language__Group__1 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1371:2: rule__Language__Group__0__Impl rule__Language__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Language__Group__0__Impl_in_rule__Language__Group__02668);
            rule__Language__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Language__Group__1_in_rule__Language__Group__02671);
            rule__Language__Group__1();

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
    // $ANTLR end "rule__Language__Group__0"


    // $ANTLR start "rule__Language__Group__0__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1378:1: rule__Language__Group__0__Impl : ( () ) ;
    public final void rule__Language__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1382:1: ( ( () ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1383:1: ( () )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1383:1: ( () )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1384:1: ()
            {
             before(grammarAccess.getLanguageAccess().getLanguageAction_0()); 
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1385:1: ()
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1387:1: 
            {
            }

             after(grammarAccess.getLanguageAccess().getLanguageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__0__Impl"


    // $ANTLR start "rule__Language__Group__1"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1397:1: rule__Language__Group__1 : rule__Language__Group__1__Impl rule__Language__Group__2 ;
    public final void rule__Language__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1401:1: ( rule__Language__Group__1__Impl rule__Language__Group__2 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1402:2: rule__Language__Group__1__Impl rule__Language__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Language__Group__1__Impl_in_rule__Language__Group__12729);
            rule__Language__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Language__Group__2_in_rule__Language__Group__12732);
            rule__Language__Group__2();

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
    // $ANTLR end "rule__Language__Group__1"


    // $ANTLR start "rule__Language__Group__1__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1409:1: rule__Language__Group__1__Impl : ( 'Language' ) ;
    public final void rule__Language__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1413:1: ( ( 'Language' ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1414:1: ( 'Language' )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1414:1: ( 'Language' )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1415:1: 'Language'
            {
             before(grammarAccess.getLanguageAccess().getLanguageKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Language__Group__1__Impl2760); 
             after(grammarAccess.getLanguageAccess().getLanguageKeyword_1()); 

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
    // $ANTLR end "rule__Language__Group__1__Impl"


    // $ANTLR start "rule__Language__Group__2"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1428:1: rule__Language__Group__2 : rule__Language__Group__2__Impl rule__Language__Group__3 ;
    public final void rule__Language__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1432:1: ( rule__Language__Group__2__Impl rule__Language__Group__3 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1433:2: rule__Language__Group__2__Impl rule__Language__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Language__Group__2__Impl_in_rule__Language__Group__22791);
            rule__Language__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Language__Group__3_in_rule__Language__Group__22794);
            rule__Language__Group__3();

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
    // $ANTLR end "rule__Language__Group__2"


    // $ANTLR start "rule__Language__Group__2__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1440:1: rule__Language__Group__2__Impl : ( '{' ) ;
    public final void rule__Language__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1444:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1445:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1445:1: ( '{' )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1446:1: '{'
            {
             before(grammarAccess.getLanguageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Language__Group__2__Impl2822); 
             after(grammarAccess.getLanguageAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Language__Group__2__Impl"


    // $ANTLR start "rule__Language__Group__3"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1459:1: rule__Language__Group__3 : rule__Language__Group__3__Impl rule__Language__Group__4 ;
    public final void rule__Language__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1463:1: ( rule__Language__Group__3__Impl rule__Language__Group__4 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1464:2: rule__Language__Group__3__Impl rule__Language__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Language__Group__3__Impl_in_rule__Language__Group__32853);
            rule__Language__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Language__Group__4_in_rule__Language__Group__32856);
            rule__Language__Group__4();

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
    // $ANTLR end "rule__Language__Group__3"


    // $ANTLR start "rule__Language__Group__3__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1471:1: rule__Language__Group__3__Impl : ( ( rule__Language__Group_3__0 )? ) ;
    public final void rule__Language__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1475:1: ( ( ( rule__Language__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1476:1: ( ( rule__Language__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1476:1: ( ( rule__Language__Group_3__0 )? )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1477:1: ( rule__Language__Group_3__0 )?
            {
             before(grammarAccess.getLanguageAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1478:1: ( rule__Language__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1478:2: rule__Language__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Language__Group_3__0_in_rule__Language__Group__3__Impl2883);
                    rule__Language__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLanguageAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Language__Group__3__Impl"


    // $ANTLR start "rule__Language__Group__4"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1488:1: rule__Language__Group__4 : rule__Language__Group__4__Impl rule__Language__Group__5 ;
    public final void rule__Language__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1492:1: ( rule__Language__Group__4__Impl rule__Language__Group__5 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1493:2: rule__Language__Group__4__Impl rule__Language__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Language__Group__4__Impl_in_rule__Language__Group__42914);
            rule__Language__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Language__Group__5_in_rule__Language__Group__42917);
            rule__Language__Group__5();

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
    // $ANTLR end "rule__Language__Group__4"


    // $ANTLR start "rule__Language__Group__4__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1500:1: rule__Language__Group__4__Impl : ( ( rule__Language__Group_4__0 )? ) ;
    public final void rule__Language__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1504:1: ( ( ( rule__Language__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1505:1: ( ( rule__Language__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1505:1: ( ( rule__Language__Group_4__0 )? )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1506:1: ( rule__Language__Group_4__0 )?
            {
             before(grammarAccess.getLanguageAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1507:1: ( rule__Language__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1507:2: rule__Language__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Language__Group_4__0_in_rule__Language__Group__4__Impl2944);
                    rule__Language__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLanguageAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Language__Group__4__Impl"


    // $ANTLR start "rule__Language__Group__5"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1517:1: rule__Language__Group__5 : rule__Language__Group__5__Impl ;
    public final void rule__Language__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1521:1: ( rule__Language__Group__5__Impl )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1522:2: rule__Language__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Language__Group__5__Impl_in_rule__Language__Group__52975);
            rule__Language__Group__5__Impl();

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
    // $ANTLR end "rule__Language__Group__5"


    // $ANTLR start "rule__Language__Group__5__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1528:1: rule__Language__Group__5__Impl : ( '}' ) ;
    public final void rule__Language__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1532:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1533:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1533:1: ( '}' )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1534:1: '}'
            {
             before(grammarAccess.getLanguageAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Language__Group__5__Impl3003); 
             after(grammarAccess.getLanguageAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Language__Group__5__Impl"


    // $ANTLR start "rule__Language__Group_3__0"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1559:1: rule__Language__Group_3__0 : rule__Language__Group_3__0__Impl rule__Language__Group_3__1 ;
    public final void rule__Language__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1563:1: ( rule__Language__Group_3__0__Impl rule__Language__Group_3__1 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1564:2: rule__Language__Group_3__0__Impl rule__Language__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Language__Group_3__0__Impl_in_rule__Language__Group_3__03046);
            rule__Language__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Language__Group_3__1_in_rule__Language__Group_3__03049);
            rule__Language__Group_3__1();

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
    // $ANTLR end "rule__Language__Group_3__0"


    // $ANTLR start "rule__Language__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1571:1: rule__Language__Group_3__0__Impl : ( 'value' ) ;
    public final void rule__Language__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1575:1: ( ( 'value' ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1576:1: ( 'value' )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1576:1: ( 'value' )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1577:1: 'value'
            {
             before(grammarAccess.getLanguageAccess().getValueKeyword_3_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Language__Group_3__0__Impl3077); 
             after(grammarAccess.getLanguageAccess().getValueKeyword_3_0()); 

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
    // $ANTLR end "rule__Language__Group_3__0__Impl"


    // $ANTLR start "rule__Language__Group_3__1"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1590:1: rule__Language__Group_3__1 : rule__Language__Group_3__1__Impl ;
    public final void rule__Language__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1594:1: ( rule__Language__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1595:2: rule__Language__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Language__Group_3__1__Impl_in_rule__Language__Group_3__13108);
            rule__Language__Group_3__1__Impl();

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
    // $ANTLR end "rule__Language__Group_3__1"


    // $ANTLR start "rule__Language__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1601:1: rule__Language__Group_3__1__Impl : ( ( rule__Language__ValueAssignment_3_1 ) ) ;
    public final void rule__Language__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1605:1: ( ( ( rule__Language__ValueAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1606:1: ( ( rule__Language__ValueAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1606:1: ( ( rule__Language__ValueAssignment_3_1 ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1607:1: ( rule__Language__ValueAssignment_3_1 )
            {
             before(grammarAccess.getLanguageAccess().getValueAssignment_3_1()); 
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1608:1: ( rule__Language__ValueAssignment_3_1 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1608:2: rule__Language__ValueAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Language__ValueAssignment_3_1_in_rule__Language__Group_3__1__Impl3135);
            rule__Language__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLanguageAccess().getValueAssignment_3_1()); 

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
    // $ANTLR end "rule__Language__Group_3__1__Impl"


    // $ANTLR start "rule__Language__Group_4__0"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1622:1: rule__Language__Group_4__0 : rule__Language__Group_4__0__Impl rule__Language__Group_4__1 ;
    public final void rule__Language__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1626:1: ( rule__Language__Group_4__0__Impl rule__Language__Group_4__1 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1627:2: rule__Language__Group_4__0__Impl rule__Language__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Language__Group_4__0__Impl_in_rule__Language__Group_4__03169);
            rule__Language__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Language__Group_4__1_in_rule__Language__Group_4__03172);
            rule__Language__Group_4__1();

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
    // $ANTLR end "rule__Language__Group_4__0"


    // $ANTLR start "rule__Language__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1634:1: rule__Language__Group_4__0__Impl : ( 'language' ) ;
    public final void rule__Language__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1638:1: ( ( 'language' ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1639:1: ( 'language' )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1639:1: ( 'language' )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1640:1: 'language'
            {
             before(grammarAccess.getLanguageAccess().getLanguageKeyword_4_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Language__Group_4__0__Impl3200); 
             after(grammarAccess.getLanguageAccess().getLanguageKeyword_4_0()); 

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
    // $ANTLR end "rule__Language__Group_4__0__Impl"


    // $ANTLR start "rule__Language__Group_4__1"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1653:1: rule__Language__Group_4__1 : rule__Language__Group_4__1__Impl ;
    public final void rule__Language__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1657:1: ( rule__Language__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1658:2: rule__Language__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Language__Group_4__1__Impl_in_rule__Language__Group_4__13231);
            rule__Language__Group_4__1__Impl();

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
    // $ANTLR end "rule__Language__Group_4__1"


    // $ANTLR start "rule__Language__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1664:1: rule__Language__Group_4__1__Impl : ( ( rule__Language__LanguageAssignment_4_1 ) ) ;
    public final void rule__Language__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1668:1: ( ( ( rule__Language__LanguageAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1669:1: ( ( rule__Language__LanguageAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1669:1: ( ( rule__Language__LanguageAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1670:1: ( rule__Language__LanguageAssignment_4_1 )
            {
             before(grammarAccess.getLanguageAccess().getLanguageAssignment_4_1()); 
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1671:1: ( rule__Language__LanguageAssignment_4_1 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1671:2: rule__Language__LanguageAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Language__LanguageAssignment_4_1_in_rule__Language__Group_4__1__Impl3258);
            rule__Language__LanguageAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLanguageAccess().getLanguageAssignment_4_1()); 

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
    // $ANTLR end "rule__Language__Group_4__1__Impl"


    // $ANTLR start "rule__Decimal__Group__0"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1685:1: rule__Decimal__Group__0 : rule__Decimal__Group__0__Impl rule__Decimal__Group__1 ;
    public final void rule__Decimal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1689:1: ( rule__Decimal__Group__0__Impl rule__Decimal__Group__1 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1690:2: rule__Decimal__Group__0__Impl rule__Decimal__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Decimal__Group__0__Impl_in_rule__Decimal__Group__03292);
            rule__Decimal__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Decimal__Group__1_in_rule__Decimal__Group__03295);
            rule__Decimal__Group__1();

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
    // $ANTLR end "rule__Decimal__Group__0"


    // $ANTLR start "rule__Decimal__Group__0__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1697:1: rule__Decimal__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Decimal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1701:1: ( ( RULE_INT ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1702:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1702:1: ( RULE_INT )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1703:1: RULE_INT
            {
             before(grammarAccess.getDecimalAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Decimal__Group__0__Impl3322); 
             after(grammarAccess.getDecimalAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Decimal__Group__0__Impl"


    // $ANTLR start "rule__Decimal__Group__1"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1714:1: rule__Decimal__Group__1 : rule__Decimal__Group__1__Impl rule__Decimal__Group__2 ;
    public final void rule__Decimal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1718:1: ( rule__Decimal__Group__1__Impl rule__Decimal__Group__2 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1719:2: rule__Decimal__Group__1__Impl rule__Decimal__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Decimal__Group__1__Impl_in_rule__Decimal__Group__13351);
            rule__Decimal__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Decimal__Group__2_in_rule__Decimal__Group__13354);
            rule__Decimal__Group__2();

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
    // $ANTLR end "rule__Decimal__Group__1"


    // $ANTLR start "rule__Decimal__Group__1__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1726:1: rule__Decimal__Group__1__Impl : ( '.' ) ;
    public final void rule__Decimal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1730:1: ( ( '.' ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1731:1: ( '.' )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1731:1: ( '.' )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1732:1: '.'
            {
             before(grammarAccess.getDecimalAccess().getFullStopKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Decimal__Group__1__Impl3382); 
             after(grammarAccess.getDecimalAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__Decimal__Group__1__Impl"


    // $ANTLR start "rule__Decimal__Group__2"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1745:1: rule__Decimal__Group__2 : rule__Decimal__Group__2__Impl ;
    public final void rule__Decimal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1749:1: ( rule__Decimal__Group__2__Impl )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1750:2: rule__Decimal__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Decimal__Group__2__Impl_in_rule__Decimal__Group__23413);
            rule__Decimal__Group__2__Impl();

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
    // $ANTLR end "rule__Decimal__Group__2"


    // $ANTLR start "rule__Decimal__Group__2__Impl"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1756:1: rule__Decimal__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Decimal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1760:1: ( ( RULE_INT ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1761:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1761:1: ( RULE_INT )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1762:1: RULE_INT
            {
             before(grammarAccess.getDecimalAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Decimal__Group__2__Impl3440); 
             after(grammarAccess.getDecimalAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Decimal__Group__2__Impl"


    // $ANTLR start "rule__RootElementType__ExtendedAddressAssignment_3"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1780:1: rule__RootElementType__ExtendedAddressAssignment_3 : ( ruleExtendedAddress ) ;
    public final void rule__RootElementType__ExtendedAddressAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1784:1: ( ( ruleExtendedAddress ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1785:1: ( ruleExtendedAddress )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1785:1: ( ruleExtendedAddress )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1786:1: ruleExtendedAddress
            {
             before(grammarAccess.getRootElementTypeAccess().getExtendedAddressExtendedAddressParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedAddress_in_rule__RootElementType__ExtendedAddressAssignment_33480);
            ruleExtendedAddress();

            state._fsp--;

             after(grammarAccess.getRootElementTypeAccess().getExtendedAddressExtendedAddressParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__RootElementType__ExtendedAddressAssignment_3"


    // $ANTLR start "rule__RootElementType__AddressAssignment_5"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1795:1: rule__RootElementType__AddressAssignment_5 : ( ruleAddress ) ;
    public final void rule__RootElementType__AddressAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1799:1: ( ( ruleAddress ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1800:1: ( ruleAddress )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1800:1: ( ruleAddress )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1801:1: ruleAddress
            {
             before(grammarAccess.getRootElementTypeAccess().getAddressAddressParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddress_in_rule__RootElementType__AddressAssignment_53511);
            ruleAddress();

            state._fsp--;

             after(grammarAccess.getRootElementTypeAccess().getAddressAddressParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__RootElementType__AddressAssignment_5"


    // $ANTLR start "rule__RootElementType__LanguageAssignment_7"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1810:1: rule__RootElementType__LanguageAssignment_7 : ( ruleLanguage ) ;
    public final void rule__RootElementType__LanguageAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1814:1: ( ( ruleLanguage ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1815:1: ( ruleLanguage )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1815:1: ( ruleLanguage )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1816:1: ruleLanguage
            {
             before(grammarAccess.getRootElementTypeAccess().getLanguageLanguageParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLanguage_in_rule__RootElementType__LanguageAssignment_73542);
            ruleLanguage();

            state._fsp--;

             after(grammarAccess.getRootElementTypeAccess().getLanguageLanguageParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__RootElementType__LanguageAssignment_7"


    // $ANTLR start "rule__ExtendedAddress__StreetAssignment_3"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1825:1: rule__ExtendedAddress__StreetAssignment_3 : ( ruleString0 ) ;
    public final void rule__ExtendedAddress__StreetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1829:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1830:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1830:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1831:1: ruleString0
            {
             before(grammarAccess.getExtendedAddressAccess().getStreetString0ParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__ExtendedAddress__StreetAssignment_33573);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getExtendedAddressAccess().getStreetString0ParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ExtendedAddress__StreetAssignment_3"


    // $ANTLR start "rule__ExtendedAddress__CityAssignment_5"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1840:1: rule__ExtendedAddress__CityAssignment_5 : ( ruleString0 ) ;
    public final void rule__ExtendedAddress__CityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1844:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1845:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1845:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1846:1: ruleString0
            {
             before(grammarAccess.getExtendedAddressAccess().getCityString0ParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__ExtendedAddress__CityAssignment_53604);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getExtendedAddressAccess().getCityString0ParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ExtendedAddress__CityAssignment_5"


    // $ANTLR start "rule__ExtendedAddress__CountryAssignment_7"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1855:1: rule__ExtendedAddress__CountryAssignment_7 : ( ruleString0 ) ;
    public final void rule__ExtendedAddress__CountryAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1859:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1860:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1860:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1861:1: ruleString0
            {
             before(grammarAccess.getExtendedAddressAccess().getCountryString0ParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__ExtendedAddress__CountryAssignment_73635);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getExtendedAddressAccess().getCountryString0ParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__ExtendedAddress__CountryAssignment_7"


    // $ANTLR start "rule__ExtendedAddress__LatitudeAssignment_8_1"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1870:1: rule__ExtendedAddress__LatitudeAssignment_8_1 : ( ruleDecimal ) ;
    public final void rule__ExtendedAddress__LatitudeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1874:1: ( ( ruleDecimal ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1875:1: ( ruleDecimal )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1875:1: ( ruleDecimal )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1876:1: ruleDecimal
            {
             before(grammarAccess.getExtendedAddressAccess().getLatitudeDecimalParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDecimal_in_rule__ExtendedAddress__LatitudeAssignment_8_13666);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getExtendedAddressAccess().getLatitudeDecimalParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__ExtendedAddress__LatitudeAssignment_8_1"


    // $ANTLR start "rule__ExtendedAddress__LongitudeAssignment_9_1"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1885:1: rule__ExtendedAddress__LongitudeAssignment_9_1 : ( ruleDecimal ) ;
    public final void rule__ExtendedAddress__LongitudeAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1889:1: ( ( ruleDecimal ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1890:1: ( ruleDecimal )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1890:1: ( ruleDecimal )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1891:1: ruleDecimal
            {
             before(grammarAccess.getExtendedAddressAccess().getLongitudeDecimalParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDecimal_in_rule__ExtendedAddress__LongitudeAssignment_9_13697);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getExtendedAddressAccess().getLongitudeDecimalParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__ExtendedAddress__LongitudeAssignment_9_1"


    // $ANTLR start "rule__Address_Impl__StreetAssignment_3"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1900:1: rule__Address_Impl__StreetAssignment_3 : ( ruleString0 ) ;
    public final void rule__Address_Impl__StreetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1904:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1905:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1905:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1906:1: ruleString0
            {
             before(grammarAccess.getAddress_ImplAccess().getStreetString0ParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Address_Impl__StreetAssignment_33728);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getAddress_ImplAccess().getStreetString0ParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Address_Impl__StreetAssignment_3"


    // $ANTLR start "rule__Address_Impl__CityAssignment_5"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1915:1: rule__Address_Impl__CityAssignment_5 : ( ruleString0 ) ;
    public final void rule__Address_Impl__CityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1919:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1920:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1920:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1921:1: ruleString0
            {
             before(grammarAccess.getAddress_ImplAccess().getCityString0ParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Address_Impl__CityAssignment_53759);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getAddress_ImplAccess().getCityString0ParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Address_Impl__CityAssignment_5"


    // $ANTLR start "rule__Address_Impl__CountryAssignment_7"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1930:1: rule__Address_Impl__CountryAssignment_7 : ( ruleString0 ) ;
    public final void rule__Address_Impl__CountryAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1934:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1935:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1935:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1936:1: ruleString0
            {
             before(grammarAccess.getAddress_ImplAccess().getCountryString0ParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Address_Impl__CountryAssignment_73790);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getAddress_ImplAccess().getCountryString0ParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Address_Impl__CountryAssignment_7"


    // $ANTLR start "rule__Language__ValueAssignment_3_1"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1945:1: rule__Language__ValueAssignment_3_1 : ( ruleString0 ) ;
    public final void rule__Language__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1949:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1950:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1950:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1951:1: ruleString0
            {
             before(grammarAccess.getLanguageAccess().getValueString0ParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Language__ValueAssignment_3_13821);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getLanguageAccess().getValueString0ParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Language__ValueAssignment_3_1"


    // $ANTLR start "rule__Language__LanguageAssignment_4_1"
    // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1960:1: rule__Language__LanguageAssignment_4_1 : ( ruleLanguage0 ) ;
    public final void rule__Language__LanguageAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1964:1: ( ( ruleLanguage0 ) )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1965:1: ( ruleLanguage0 )
            {
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1965:1: ( ruleLanguage0 )
            // ../org.xtext.example.mydsl.extensions.ui/src-gen/org/xtext/example/mydsl/extensions/ui/contentassist/antlr/internal/InternalMyDsl.g:1966:1: ruleLanguage0
            {
             before(grammarAccess.getLanguageAccess().getLanguageLanguage0ParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLanguage0_in_rule__Language__LanguageAssignment_4_13852);
            ruleLanguage0();

            state._fsp--;

             after(grammarAccess.getLanguageAccess().getLanguageLanguage0ParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Language__LanguageAssignment_4_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRootElementType_in_entryRuleRootElementType61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRootElementType68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__0_in_ruleRootElementType94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddress_in_entryRuleAddress121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddress128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Address__Alternatives_in_ruleAddress154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedAddress_in_entryRuleExtendedAddress181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtendedAddress188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__Group__0_in_ruleExtendedAddress214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddress_Impl_in_entryRuleAddress_Impl241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddress_Impl248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Address_Impl__Group__0_in_ruleAddress_Impl274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLanguage_in_entryRuleLanguage301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLanguage308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Language__Group__0_in_ruleLanguage334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString0361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString0368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleString0394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDecimal_in_entryRuleDecimal420 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDecimal427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Decimal__Group__0_in_ruleDecimal453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLanguage0_in_entryRuleLanguage0480 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLanguage0487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleLanguage0513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddress_Impl_in_rule__Address__Alternatives548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedAddress_in_rule__Address__Alternatives565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__0__Impl_in_rule__RootElementType__Group__0595 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__1_in_rule__RootElementType__Group__0598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__RootElementType__Group__0__Impl626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__1__Impl_in_rule__RootElementType__Group__1657 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__2_in_rule__RootElementType__Group__1660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__RootElementType__Group__1__Impl688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__2__Impl_in_rule__RootElementType__Group__2719 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__3_in_rule__RootElementType__Group__2722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__RootElementType__Group__2__Impl750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__3__Impl_in_rule__RootElementType__Group__3781 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__4_in_rule__RootElementType__Group__3784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__ExtendedAddressAssignment_3_in_rule__RootElementType__Group__3__Impl811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__4__Impl_in_rule__RootElementType__Group__4841 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__5_in_rule__RootElementType__Group__4844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__RootElementType__Group__4__Impl872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__5__Impl_in_rule__RootElementType__Group__5903 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__6_in_rule__RootElementType__Group__5906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__AddressAssignment_5_in_rule__RootElementType__Group__5__Impl933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__6__Impl_in_rule__RootElementType__Group__6963 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__7_in_rule__RootElementType__Group__6966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__RootElementType__Group__6__Impl994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__7__Impl_in_rule__RootElementType__Group__71025 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__8_in_rule__RootElementType__Group__71028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__LanguageAssignment_7_in_rule__RootElementType__Group__7__Impl1055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__8__Impl_in_rule__RootElementType__Group__81085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__RootElementType__Group__8__Impl1113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__Group__0__Impl_in_rule__ExtendedAddress__Group__01162 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__Group__1_in_rule__ExtendedAddress__Group__01165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__ExtendedAddress__Group__0__Impl1193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__Group__1__Impl_in_rule__ExtendedAddress__Group__11224 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__Group__2_in_rule__ExtendedAddress__Group__11227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__ExtendedAddress__Group__1__Impl1255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__Group__2__Impl_in_rule__ExtendedAddress__Group__21286 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__Group__3_in_rule__ExtendedAddress__Group__21289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__ExtendedAddress__Group__2__Impl1317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__Group__3__Impl_in_rule__ExtendedAddress__Group__31348 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__Group__4_in_rule__ExtendedAddress__Group__31351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__StreetAssignment_3_in_rule__ExtendedAddress__Group__3__Impl1378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__Group__4__Impl_in_rule__ExtendedAddress__Group__41408 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__Group__5_in_rule__ExtendedAddress__Group__41411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__ExtendedAddress__Group__4__Impl1439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__Group__5__Impl_in_rule__ExtendedAddress__Group__51470 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__Group__6_in_rule__ExtendedAddress__Group__51473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__CityAssignment_5_in_rule__ExtendedAddress__Group__5__Impl1500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__Group__6__Impl_in_rule__ExtendedAddress__Group__61530 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__Group__7_in_rule__ExtendedAddress__Group__61533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__ExtendedAddress__Group__6__Impl1561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__Group__7__Impl_in_rule__ExtendedAddress__Group__71592 = new BitSet(new long[]{0x0000000000610000L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__Group__8_in_rule__ExtendedAddress__Group__71595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__CountryAssignment_7_in_rule__ExtendedAddress__Group__7__Impl1622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__Group__8__Impl_in_rule__ExtendedAddress__Group__81652 = new BitSet(new long[]{0x0000000000610000L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__Group__9_in_rule__ExtendedAddress__Group__81655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__Group_8__0_in_rule__ExtendedAddress__Group__8__Impl1682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__Group__9__Impl_in_rule__ExtendedAddress__Group__91713 = new BitSet(new long[]{0x0000000000610000L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__Group__10_in_rule__ExtendedAddress__Group__91716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__Group_9__0_in_rule__ExtendedAddress__Group__9__Impl1743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__Group__10__Impl_in_rule__ExtendedAddress__Group__101774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__ExtendedAddress__Group__10__Impl1802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__Group_8__0__Impl_in_rule__ExtendedAddress__Group_8__01855 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__Group_8__1_in_rule__ExtendedAddress__Group_8__01858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__ExtendedAddress__Group_8__0__Impl1886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__Group_8__1__Impl_in_rule__ExtendedAddress__Group_8__11917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__LatitudeAssignment_8_1_in_rule__ExtendedAddress__Group_8__1__Impl1944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__Group_9__0__Impl_in_rule__ExtendedAddress__Group_9__01978 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__Group_9__1_in_rule__ExtendedAddress__Group_9__01981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__ExtendedAddress__Group_9__0__Impl2009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__Group_9__1__Impl_in_rule__ExtendedAddress__Group_9__12040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedAddress__LongitudeAssignment_9_1_in_rule__ExtendedAddress__Group_9__1__Impl2067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Address_Impl__Group__0__Impl_in_rule__Address_Impl__Group__02101 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Address_Impl__Group__1_in_rule__Address_Impl__Group__02104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Address_Impl__Group__0__Impl2132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Address_Impl__Group__1__Impl_in_rule__Address_Impl__Group__12163 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Address_Impl__Group__2_in_rule__Address_Impl__Group__12166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Address_Impl__Group__1__Impl2194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Address_Impl__Group__2__Impl_in_rule__Address_Impl__Group__22225 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Address_Impl__Group__3_in_rule__Address_Impl__Group__22228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Address_Impl__Group__2__Impl2256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Address_Impl__Group__3__Impl_in_rule__Address_Impl__Group__32287 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Address_Impl__Group__4_in_rule__Address_Impl__Group__32290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Address_Impl__StreetAssignment_3_in_rule__Address_Impl__Group__3__Impl2317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Address_Impl__Group__4__Impl_in_rule__Address_Impl__Group__42347 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Address_Impl__Group__5_in_rule__Address_Impl__Group__42350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Address_Impl__Group__4__Impl2378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Address_Impl__Group__5__Impl_in_rule__Address_Impl__Group__52409 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Address_Impl__Group__6_in_rule__Address_Impl__Group__52412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Address_Impl__CityAssignment_5_in_rule__Address_Impl__Group__5__Impl2439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Address_Impl__Group__6__Impl_in_rule__Address_Impl__Group__62469 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Address_Impl__Group__7_in_rule__Address_Impl__Group__62472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Address_Impl__Group__6__Impl2500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Address_Impl__Group__7__Impl_in_rule__Address_Impl__Group__72531 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Address_Impl__Group__8_in_rule__Address_Impl__Group__72534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Address_Impl__CountryAssignment_7_in_rule__Address_Impl__Group__7__Impl2561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Address_Impl__Group__8__Impl_in_rule__Address_Impl__Group__82591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Address_Impl__Group__8__Impl2619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Language__Group__0__Impl_in_rule__Language__Group__02668 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Language__Group__1_in_rule__Language__Group__02671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Language__Group__1__Impl_in_rule__Language__Group__12729 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Language__Group__2_in_rule__Language__Group__12732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Language__Group__1__Impl2760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Language__Group__2__Impl_in_rule__Language__Group__22791 = new BitSet(new long[]{0x0000000002018000L});
        public static final BitSet FOLLOW_rule__Language__Group__3_in_rule__Language__Group__22794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Language__Group__2__Impl2822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Language__Group__3__Impl_in_rule__Language__Group__32853 = new BitSet(new long[]{0x0000000002018000L});
        public static final BitSet FOLLOW_rule__Language__Group__4_in_rule__Language__Group__32856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Language__Group_3__0_in_rule__Language__Group__3__Impl2883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Language__Group__4__Impl_in_rule__Language__Group__42914 = new BitSet(new long[]{0x0000000002018000L});
        public static final BitSet FOLLOW_rule__Language__Group__5_in_rule__Language__Group__42917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Language__Group_4__0_in_rule__Language__Group__4__Impl2944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Language__Group__5__Impl_in_rule__Language__Group__52975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Language__Group__5__Impl3003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Language__Group_3__0__Impl_in_rule__Language__Group_3__03046 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Language__Group_3__1_in_rule__Language__Group_3__03049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Language__Group_3__0__Impl3077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Language__Group_3__1__Impl_in_rule__Language__Group_3__13108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Language__ValueAssignment_3_1_in_rule__Language__Group_3__1__Impl3135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Language__Group_4__0__Impl_in_rule__Language__Group_4__03169 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Language__Group_4__1_in_rule__Language__Group_4__03172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Language__Group_4__0__Impl3200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Language__Group_4__1__Impl_in_rule__Language__Group_4__13231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Language__LanguageAssignment_4_1_in_rule__Language__Group_4__1__Impl3258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Decimal__Group__0__Impl_in_rule__Decimal__Group__03292 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Decimal__Group__1_in_rule__Decimal__Group__03295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Decimal__Group__0__Impl3322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Decimal__Group__1__Impl_in_rule__Decimal__Group__13351 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Decimal__Group__2_in_rule__Decimal__Group__13354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Decimal__Group__1__Impl3382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Decimal__Group__2__Impl_in_rule__Decimal__Group__23413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Decimal__Group__2__Impl3440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedAddress_in_rule__RootElementType__ExtendedAddressAssignment_33480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddress_in_rule__RootElementType__AddressAssignment_53511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLanguage_in_rule__RootElementType__LanguageAssignment_73542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__ExtendedAddress__StreetAssignment_33573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__ExtendedAddress__CityAssignment_53604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__ExtendedAddress__CountryAssignment_73635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDecimal_in_rule__ExtendedAddress__LatitudeAssignment_8_13666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDecimal_in_rule__ExtendedAddress__LongitudeAssignment_9_13697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Address_Impl__StreetAssignment_33728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Address_Impl__CityAssignment_53759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Address_Impl__CountryAssignment_73790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Language__ValueAssignment_3_13821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLanguage0_in_rule__Language__LanguageAssignment_4_13852 = new BitSet(new long[]{0x0000000000000002L});
    }


}