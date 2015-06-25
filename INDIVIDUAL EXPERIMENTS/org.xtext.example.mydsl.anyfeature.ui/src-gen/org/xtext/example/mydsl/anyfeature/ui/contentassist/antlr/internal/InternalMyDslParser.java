package org.xtext.example.mydsl.anyfeature.ui.contentassist.antlr.internal; 

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
import org.xtext.example.mydsl.anyfeature.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RootElementType'", "'{'", "'element1'", "'}'", "'properties'", "'Element1'", "'city'", "'street'", "'Properties'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
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
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleRootElementType : ruleRootElementType EOF ;
    public final void entryRuleRootElementType() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleRootElementType EOF )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleRootElementType EOF
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
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleRootElementType : ( ( rule__RootElementType__Group__0 ) ) ;
    public final void ruleRootElementType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__RootElementType__Group__0 ) ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__RootElementType__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__RootElementType__Group__0 ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__RootElementType__Group__0 )
            {
             before(grammarAccess.getRootElementTypeAccess().getGroup()); 
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__RootElementType__Group__0 )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__RootElementType__Group__0
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


    // $ANTLR start "entryRuleElement1"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleElement1 : ruleElement1 EOF ;
    public final void entryRuleElement1() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleElement1 EOF )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleElement1 EOF
            {
             before(grammarAccess.getElement1Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement1_in_entryRuleElement1121);
            ruleElement1();

            state._fsp--;

             after(grammarAccess.getElement1Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElement1128); 

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
    // $ANTLR end "entryRuleElement1"


    // $ANTLR start "ruleElement1"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleElement1 : ( ( rule__Element1__Group__0 ) ) ;
    public final void ruleElement1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__Element1__Group__0 ) ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Element1__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Element1__Group__0 ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__Element1__Group__0 )
            {
             before(grammarAccess.getElement1Access().getGroup()); 
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__Element1__Group__0 )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__Element1__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__0_in_ruleElement1154);
            rule__Element1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElement1Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement1"


    // $ANTLR start "entryRuleProperties"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleProperties : ruleProperties EOF ;
    public final void entryRuleProperties() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleProperties EOF )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleProperties EOF
            {
             before(grammarAccess.getPropertiesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperties_in_entryRuleProperties181);
            ruleProperties();

            state._fsp--;

             after(grammarAccess.getPropertiesRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProperties188); 

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
    // $ANTLR end "entryRuleProperties"


    // $ANTLR start "ruleProperties"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleProperties : ( ( rule__Properties__Group__0 ) ) ;
    public final void ruleProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__Properties__Group__0 ) ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Properties__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Properties__Group__0 ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__Properties__Group__0 )
            {
             before(grammarAccess.getPropertiesAccess().getGroup()); 
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__Properties__Group__0 )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__Properties__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Properties__Group__0_in_ruleProperties214);
            rule__Properties__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertiesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperties"


    // $ANTLR start "entryRuleEFeatureMapEntry"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleEFeatureMapEntry : ruleEFeatureMapEntry EOF ;
    public final void entryRuleEFeatureMapEntry() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleEFeatureMapEntry EOF )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleEFeatureMapEntry EOF
            {
             before(grammarAccess.getEFeatureMapEntryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFeatureMapEntry_in_entryRuleEFeatureMapEntry241);
            ruleEFeatureMapEntry();

            state._fsp--;

             after(grammarAccess.getEFeatureMapEntryRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEFeatureMapEntry248); 

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
    // $ANTLR end "entryRuleEFeatureMapEntry"


    // $ANTLR start "ruleEFeatureMapEntry"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleEFeatureMapEntry : ( RULE_STRING ) ;
    public final void ruleEFeatureMapEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: RULE_STRING
            {
             before(grammarAccess.getEFeatureMapEntryAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEFeatureMapEntry274); 
             after(grammarAccess.getEFeatureMapEntryAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEFeatureMapEntry"


    // $ANTLR start "entryRuleString0"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleString0 EOF )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleString0 EOF
            {
             before(grammarAccess.getString0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_entryRuleString0300);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getString0Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleString0307); 

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
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleString0 : ( RULE_STRING ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: RULE_STRING
            {
             before(grammarAccess.getString0Access().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleString0333); 
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


    // $ANTLR start "rule__RootElementType__Group__0"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: rule__RootElementType__Group__0 : rule__RootElementType__Group__0__Impl rule__RootElementType__Group__1 ;
    public final void rule__RootElementType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:206:1: ( rule__RootElementType__Group__0__Impl rule__RootElementType__Group__1 )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:207:2: rule__RootElementType__Group__0__Impl rule__RootElementType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__0__Impl_in_rule__RootElementType__Group__0366);
            rule__RootElementType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__1_in_rule__RootElementType__Group__0369);
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
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: rule__RootElementType__Group__0__Impl : ( 'RootElementType' ) ;
    public final void rule__RootElementType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:218:1: ( ( 'RootElementType' ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:219:1: ( 'RootElementType' )
            {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:219:1: ( 'RootElementType' )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:220:1: 'RootElementType'
            {
             before(grammarAccess.getRootElementTypeAccess().getRootElementTypeKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__RootElementType__Group__0__Impl397); 
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
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:233:1: rule__RootElementType__Group__1 : rule__RootElementType__Group__1__Impl rule__RootElementType__Group__2 ;
    public final void rule__RootElementType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:237:1: ( rule__RootElementType__Group__1__Impl rule__RootElementType__Group__2 )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:238:2: rule__RootElementType__Group__1__Impl rule__RootElementType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__1__Impl_in_rule__RootElementType__Group__1428);
            rule__RootElementType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__2_in_rule__RootElementType__Group__1431);
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
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:245:1: rule__RootElementType__Group__1__Impl : ( '{' ) ;
    public final void rule__RootElementType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:249:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:250:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:250:1: ( '{' )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:251:1: '{'
            {
             before(grammarAccess.getRootElementTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__RootElementType__Group__1__Impl459); 
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
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:264:1: rule__RootElementType__Group__2 : rule__RootElementType__Group__2__Impl rule__RootElementType__Group__3 ;
    public final void rule__RootElementType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:268:1: ( rule__RootElementType__Group__2__Impl rule__RootElementType__Group__3 )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:269:2: rule__RootElementType__Group__2__Impl rule__RootElementType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__2__Impl_in_rule__RootElementType__Group__2490);
            rule__RootElementType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__3_in_rule__RootElementType__Group__2493);
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
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:276:1: rule__RootElementType__Group__2__Impl : ( 'element1' ) ;
    public final void rule__RootElementType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:280:1: ( ( 'element1' ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:281:1: ( 'element1' )
            {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:281:1: ( 'element1' )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:282:1: 'element1'
            {
             before(grammarAccess.getRootElementTypeAccess().getElement1Keyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__RootElementType__Group__2__Impl521); 
             after(grammarAccess.getRootElementTypeAccess().getElement1Keyword_2()); 

            }


            }

        }
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
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:295:1: rule__RootElementType__Group__3 : rule__RootElementType__Group__3__Impl rule__RootElementType__Group__4 ;
    public final void rule__RootElementType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:299:1: ( rule__RootElementType__Group__3__Impl rule__RootElementType__Group__4 )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:300:2: rule__RootElementType__Group__3__Impl rule__RootElementType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__3__Impl_in_rule__RootElementType__Group__3552);
            rule__RootElementType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__4_in_rule__RootElementType__Group__3555);
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
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:307:1: rule__RootElementType__Group__3__Impl : ( ( rule__RootElementType__Element1Assignment_3 ) ) ;
    public final void rule__RootElementType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:311:1: ( ( ( rule__RootElementType__Element1Assignment_3 ) ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:312:1: ( ( rule__RootElementType__Element1Assignment_3 ) )
            {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:312:1: ( ( rule__RootElementType__Element1Assignment_3 ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:313:1: ( rule__RootElementType__Element1Assignment_3 )
            {
             before(grammarAccess.getRootElementTypeAccess().getElement1Assignment_3()); 
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:314:1: ( rule__RootElementType__Element1Assignment_3 )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:314:2: rule__RootElementType__Element1Assignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Element1Assignment_3_in_rule__RootElementType__Group__3__Impl582);
            rule__RootElementType__Element1Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRootElementTypeAccess().getElement1Assignment_3()); 

            }


            }

        }
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
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:324:1: rule__RootElementType__Group__4 : rule__RootElementType__Group__4__Impl rule__RootElementType__Group__5 ;
    public final void rule__RootElementType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:328:1: ( rule__RootElementType__Group__4__Impl rule__RootElementType__Group__5 )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:329:2: rule__RootElementType__Group__4__Impl rule__RootElementType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__4__Impl_in_rule__RootElementType__Group__4612);
            rule__RootElementType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__5_in_rule__RootElementType__Group__4615);
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
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:336:1: rule__RootElementType__Group__4__Impl : ( ( rule__RootElementType__Group_4__0 )? ) ;
    public final void rule__RootElementType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:340:1: ( ( ( rule__RootElementType__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:341:1: ( ( rule__RootElementType__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:341:1: ( ( rule__RootElementType__Group_4__0 )? )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: ( rule__RootElementType__Group_4__0 )?
            {
             before(grammarAccess.getRootElementTypeAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:343:1: ( rule__RootElementType__Group_4__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:343:2: rule__RootElementType__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group_4__0_in_rule__RootElementType__Group__4__Impl642);
                    rule__RootElementType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRootElementTypeAccess().getGroup_4()); 

            }


            }

        }
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
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:353:1: rule__RootElementType__Group__5 : rule__RootElementType__Group__5__Impl ;
    public final void rule__RootElementType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:357:1: ( rule__RootElementType__Group__5__Impl )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:358:2: rule__RootElementType__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__5__Impl_in_rule__RootElementType__Group__5673);
            rule__RootElementType__Group__5__Impl();

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
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:364:1: rule__RootElementType__Group__5__Impl : ( '}' ) ;
    public final void rule__RootElementType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:368:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:369:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:369:1: ( '}' )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:370:1: '}'
            {
             before(grammarAccess.getRootElementTypeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__RootElementType__Group__5__Impl701); 
             after(grammarAccess.getRootElementTypeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__RootElementType__Group_4__0"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:395:1: rule__RootElementType__Group_4__0 : rule__RootElementType__Group_4__0__Impl rule__RootElementType__Group_4__1 ;
    public final void rule__RootElementType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:399:1: ( rule__RootElementType__Group_4__0__Impl rule__RootElementType__Group_4__1 )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:400:2: rule__RootElementType__Group_4__0__Impl rule__RootElementType__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group_4__0__Impl_in_rule__RootElementType__Group_4__0744);
            rule__RootElementType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group_4__1_in_rule__RootElementType__Group_4__0747);
            rule__RootElementType__Group_4__1();

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
    // $ANTLR end "rule__RootElementType__Group_4__0"


    // $ANTLR start "rule__RootElementType__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:407:1: rule__RootElementType__Group_4__0__Impl : ( 'properties' ) ;
    public final void rule__RootElementType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:411:1: ( ( 'properties' ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:412:1: ( 'properties' )
            {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:412:1: ( 'properties' )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:413:1: 'properties'
            {
             before(grammarAccess.getRootElementTypeAccess().getPropertiesKeyword_4_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__RootElementType__Group_4__0__Impl775); 
             after(grammarAccess.getRootElementTypeAccess().getPropertiesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootElementType__Group_4__0__Impl"


    // $ANTLR start "rule__RootElementType__Group_4__1"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:426:1: rule__RootElementType__Group_4__1 : rule__RootElementType__Group_4__1__Impl ;
    public final void rule__RootElementType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:430:1: ( rule__RootElementType__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:431:2: rule__RootElementType__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group_4__1__Impl_in_rule__RootElementType__Group_4__1806);
            rule__RootElementType__Group_4__1__Impl();

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
    // $ANTLR end "rule__RootElementType__Group_4__1"


    // $ANTLR start "rule__RootElementType__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:437:1: rule__RootElementType__Group_4__1__Impl : ( ( rule__RootElementType__PropertiesAssignment_4_1 ) ) ;
    public final void rule__RootElementType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:441:1: ( ( ( rule__RootElementType__PropertiesAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:442:1: ( ( rule__RootElementType__PropertiesAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:442:1: ( ( rule__RootElementType__PropertiesAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:443:1: ( rule__RootElementType__PropertiesAssignment_4_1 )
            {
             before(grammarAccess.getRootElementTypeAccess().getPropertiesAssignment_4_1()); 
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:444:1: ( rule__RootElementType__PropertiesAssignment_4_1 )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:444:2: rule__RootElementType__PropertiesAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__PropertiesAssignment_4_1_in_rule__RootElementType__Group_4__1__Impl833);
            rule__RootElementType__PropertiesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRootElementTypeAccess().getPropertiesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootElementType__Group_4__1__Impl"


    // $ANTLR start "rule__Element1__Group__0"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:458:1: rule__Element1__Group__0 : rule__Element1__Group__0__Impl rule__Element1__Group__1 ;
    public final void rule__Element1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:462:1: ( rule__Element1__Group__0__Impl rule__Element1__Group__1 )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:463:2: rule__Element1__Group__0__Impl rule__Element1__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__0__Impl_in_rule__Element1__Group__0867);
            rule__Element1__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__1_in_rule__Element1__Group__0870);
            rule__Element1__Group__1();

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
    // $ANTLR end "rule__Element1__Group__0"


    // $ANTLR start "rule__Element1__Group__0__Impl"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:470:1: rule__Element1__Group__0__Impl : ( () ) ;
    public final void rule__Element1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:474:1: ( ( () ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:475:1: ( () )
            {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:475:1: ( () )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:476:1: ()
            {
             before(grammarAccess.getElement1Access().getElement1Action_0()); 
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:477:1: ()
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:479:1: 
            {
            }

             after(grammarAccess.getElement1Access().getElement1Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1__Group__0__Impl"


    // $ANTLR start "rule__Element1__Group__1"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:489:1: rule__Element1__Group__1 : rule__Element1__Group__1__Impl rule__Element1__Group__2 ;
    public final void rule__Element1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:493:1: ( rule__Element1__Group__1__Impl rule__Element1__Group__2 )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:494:2: rule__Element1__Group__1__Impl rule__Element1__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__1__Impl_in_rule__Element1__Group__1928);
            rule__Element1__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__2_in_rule__Element1__Group__1931);
            rule__Element1__Group__2();

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
    // $ANTLR end "rule__Element1__Group__1"


    // $ANTLR start "rule__Element1__Group__1__Impl"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:501:1: rule__Element1__Group__1__Impl : ( 'Element1' ) ;
    public final void rule__Element1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:505:1: ( ( 'Element1' ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:506:1: ( 'Element1' )
            {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:506:1: ( 'Element1' )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:507:1: 'Element1'
            {
             before(grammarAccess.getElement1Access().getElement1Keyword_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Element1__Group__1__Impl959); 
             after(grammarAccess.getElement1Access().getElement1Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1__Group__1__Impl"


    // $ANTLR start "rule__Element1__Group__2"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:520:1: rule__Element1__Group__2 : rule__Element1__Group__2__Impl rule__Element1__Group__3 ;
    public final void rule__Element1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:524:1: ( rule__Element1__Group__2__Impl rule__Element1__Group__3 )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:525:2: rule__Element1__Group__2__Impl rule__Element1__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__2__Impl_in_rule__Element1__Group__2990);
            rule__Element1__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__3_in_rule__Element1__Group__2993);
            rule__Element1__Group__3();

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
    // $ANTLR end "rule__Element1__Group__2"


    // $ANTLR start "rule__Element1__Group__2__Impl"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:532:1: rule__Element1__Group__2__Impl : ( '{' ) ;
    public final void rule__Element1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:536:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:537:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:537:1: ( '{' )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:538:1: '{'
            {
             before(grammarAccess.getElement1Access().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Element1__Group__2__Impl1021); 
             after(grammarAccess.getElement1Access().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1__Group__2__Impl"


    // $ANTLR start "rule__Element1__Group__3"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:551:1: rule__Element1__Group__3 : rule__Element1__Group__3__Impl rule__Element1__Group__4 ;
    public final void rule__Element1__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:555:1: ( rule__Element1__Group__3__Impl rule__Element1__Group__4 )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:556:2: rule__Element1__Group__3__Impl rule__Element1__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__3__Impl_in_rule__Element1__Group__31052);
            rule__Element1__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__4_in_rule__Element1__Group__31055);
            rule__Element1__Group__4();

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
    // $ANTLR end "rule__Element1__Group__3"


    // $ANTLR start "rule__Element1__Group__3__Impl"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:563:1: rule__Element1__Group__3__Impl : ( ( rule__Element1__Group_3__0 )? ) ;
    public final void rule__Element1__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:567:1: ( ( ( rule__Element1__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:568:1: ( ( rule__Element1__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:568:1: ( ( rule__Element1__Group_3__0 )? )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:569:1: ( rule__Element1__Group_3__0 )?
            {
             before(grammarAccess.getElement1Access().getGroup_3()); 
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:570:1: ( rule__Element1__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:570:2: rule__Element1__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Element1__Group_3__0_in_rule__Element1__Group__3__Impl1082);
                    rule__Element1__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElement1Access().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1__Group__3__Impl"


    // $ANTLR start "rule__Element1__Group__4"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:580:1: rule__Element1__Group__4 : rule__Element1__Group__4__Impl rule__Element1__Group__5 ;
    public final void rule__Element1__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:584:1: ( rule__Element1__Group__4__Impl rule__Element1__Group__5 )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:585:2: rule__Element1__Group__4__Impl rule__Element1__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__4__Impl_in_rule__Element1__Group__41113);
            rule__Element1__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__5_in_rule__Element1__Group__41116);
            rule__Element1__Group__5();

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
    // $ANTLR end "rule__Element1__Group__4"


    // $ANTLR start "rule__Element1__Group__4__Impl"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:592:1: rule__Element1__Group__4__Impl : ( ( rule__Element1__Group_4__0 )? ) ;
    public final void rule__Element1__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:596:1: ( ( ( rule__Element1__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:597:1: ( ( rule__Element1__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:597:1: ( ( rule__Element1__Group_4__0 )? )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:598:1: ( rule__Element1__Group_4__0 )?
            {
             before(grammarAccess.getElement1Access().getGroup_4()); 
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:599:1: ( rule__Element1__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:599:2: rule__Element1__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Element1__Group_4__0_in_rule__Element1__Group__4__Impl1143);
                    rule__Element1__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElement1Access().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1__Group__4__Impl"


    // $ANTLR start "rule__Element1__Group__5"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:609:1: rule__Element1__Group__5 : rule__Element1__Group__5__Impl ;
    public final void rule__Element1__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:613:1: ( rule__Element1__Group__5__Impl )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:614:2: rule__Element1__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__5__Impl_in_rule__Element1__Group__51174);
            rule__Element1__Group__5__Impl();

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
    // $ANTLR end "rule__Element1__Group__5"


    // $ANTLR start "rule__Element1__Group__5__Impl"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:620:1: rule__Element1__Group__5__Impl : ( '}' ) ;
    public final void rule__Element1__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:624:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:625:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:625:1: ( '}' )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:626:1: '}'
            {
             before(grammarAccess.getElement1Access().getRightCurlyBracketKeyword_5()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Element1__Group__5__Impl1202); 
             after(grammarAccess.getElement1Access().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1__Group__5__Impl"


    // $ANTLR start "rule__Element1__Group_3__0"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:651:1: rule__Element1__Group_3__0 : rule__Element1__Group_3__0__Impl rule__Element1__Group_3__1 ;
    public final void rule__Element1__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:655:1: ( rule__Element1__Group_3__0__Impl rule__Element1__Group_3__1 )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:656:2: rule__Element1__Group_3__0__Impl rule__Element1__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group_3__0__Impl_in_rule__Element1__Group_3__01245);
            rule__Element1__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group_3__1_in_rule__Element1__Group_3__01248);
            rule__Element1__Group_3__1();

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
    // $ANTLR end "rule__Element1__Group_3__0"


    // $ANTLR start "rule__Element1__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:663:1: rule__Element1__Group_3__0__Impl : ( 'city' ) ;
    public final void rule__Element1__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:667:1: ( ( 'city' ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:668:1: ( 'city' )
            {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:668:1: ( 'city' )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:669:1: 'city'
            {
             before(grammarAccess.getElement1Access().getCityKeyword_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Element1__Group_3__0__Impl1276); 
             after(grammarAccess.getElement1Access().getCityKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1__Group_3__0__Impl"


    // $ANTLR start "rule__Element1__Group_3__1"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:682:1: rule__Element1__Group_3__1 : rule__Element1__Group_3__1__Impl ;
    public final void rule__Element1__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:686:1: ( rule__Element1__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:687:2: rule__Element1__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group_3__1__Impl_in_rule__Element1__Group_3__11307);
            rule__Element1__Group_3__1__Impl();

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
    // $ANTLR end "rule__Element1__Group_3__1"


    // $ANTLR start "rule__Element1__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:693:1: rule__Element1__Group_3__1__Impl : ( ( rule__Element1__CityAssignment_3_1 ) ) ;
    public final void rule__Element1__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:697:1: ( ( ( rule__Element1__CityAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:698:1: ( ( rule__Element1__CityAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:698:1: ( ( rule__Element1__CityAssignment_3_1 ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:699:1: ( rule__Element1__CityAssignment_3_1 )
            {
             before(grammarAccess.getElement1Access().getCityAssignment_3_1()); 
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:700:1: ( rule__Element1__CityAssignment_3_1 )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:700:2: rule__Element1__CityAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__CityAssignment_3_1_in_rule__Element1__Group_3__1__Impl1334);
            rule__Element1__CityAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getElement1Access().getCityAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1__Group_3__1__Impl"


    // $ANTLR start "rule__Element1__Group_4__0"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:714:1: rule__Element1__Group_4__0 : rule__Element1__Group_4__0__Impl rule__Element1__Group_4__1 ;
    public final void rule__Element1__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:718:1: ( rule__Element1__Group_4__0__Impl rule__Element1__Group_4__1 )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:719:2: rule__Element1__Group_4__0__Impl rule__Element1__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group_4__0__Impl_in_rule__Element1__Group_4__01368);
            rule__Element1__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group_4__1_in_rule__Element1__Group_4__01371);
            rule__Element1__Group_4__1();

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
    // $ANTLR end "rule__Element1__Group_4__0"


    // $ANTLR start "rule__Element1__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:726:1: rule__Element1__Group_4__0__Impl : ( 'street' ) ;
    public final void rule__Element1__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:730:1: ( ( 'street' ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:731:1: ( 'street' )
            {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:731:1: ( 'street' )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:732:1: 'street'
            {
             before(grammarAccess.getElement1Access().getStreetKeyword_4_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Element1__Group_4__0__Impl1399); 
             after(grammarAccess.getElement1Access().getStreetKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1__Group_4__0__Impl"


    // $ANTLR start "rule__Element1__Group_4__1"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:745:1: rule__Element1__Group_4__1 : rule__Element1__Group_4__1__Impl ;
    public final void rule__Element1__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:749:1: ( rule__Element1__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:750:2: rule__Element1__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group_4__1__Impl_in_rule__Element1__Group_4__11430);
            rule__Element1__Group_4__1__Impl();

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
    // $ANTLR end "rule__Element1__Group_4__1"


    // $ANTLR start "rule__Element1__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:756:1: rule__Element1__Group_4__1__Impl : ( ( rule__Element1__StreetAssignment_4_1 ) ) ;
    public final void rule__Element1__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:760:1: ( ( ( rule__Element1__StreetAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:761:1: ( ( rule__Element1__StreetAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:761:1: ( ( rule__Element1__StreetAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:762:1: ( rule__Element1__StreetAssignment_4_1 )
            {
             before(grammarAccess.getElement1Access().getStreetAssignment_4_1()); 
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:763:1: ( rule__Element1__StreetAssignment_4_1 )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:763:2: rule__Element1__StreetAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__StreetAssignment_4_1_in_rule__Element1__Group_4__1__Impl1457);
            rule__Element1__StreetAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getElement1Access().getStreetAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1__Group_4__1__Impl"


    // $ANTLR start "rule__Properties__Group__0"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:777:1: rule__Properties__Group__0 : rule__Properties__Group__0__Impl rule__Properties__Group__1 ;
    public final void rule__Properties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:781:1: ( rule__Properties__Group__0__Impl rule__Properties__Group__1 )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:782:2: rule__Properties__Group__0__Impl rule__Properties__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Properties__Group__0__Impl_in_rule__Properties__Group__01491);
            rule__Properties__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Properties__Group__1_in_rule__Properties__Group__01494);
            rule__Properties__Group__1();

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
    // $ANTLR end "rule__Properties__Group__0"


    // $ANTLR start "rule__Properties__Group__0__Impl"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:789:1: rule__Properties__Group__0__Impl : ( () ) ;
    public final void rule__Properties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:793:1: ( ( () ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:794:1: ( () )
            {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:794:1: ( () )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:795:1: ()
            {
             before(grammarAccess.getPropertiesAccess().getPropertiesAction_0()); 
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:796:1: ()
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:798:1: 
            {
            }

             after(grammarAccess.getPropertiesAccess().getPropertiesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__0__Impl"


    // $ANTLR start "rule__Properties__Group__1"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:808:1: rule__Properties__Group__1 : rule__Properties__Group__1__Impl rule__Properties__Group__2 ;
    public final void rule__Properties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:812:1: ( rule__Properties__Group__1__Impl rule__Properties__Group__2 )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:813:2: rule__Properties__Group__1__Impl rule__Properties__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Properties__Group__1__Impl_in_rule__Properties__Group__11552);
            rule__Properties__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Properties__Group__2_in_rule__Properties__Group__11555);
            rule__Properties__Group__2();

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
    // $ANTLR end "rule__Properties__Group__1"


    // $ANTLR start "rule__Properties__Group__1__Impl"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:820:1: rule__Properties__Group__1__Impl : ( 'Properties' ) ;
    public final void rule__Properties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:824:1: ( ( 'Properties' ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:825:1: ( 'Properties' )
            {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:825:1: ( 'Properties' )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:826:1: 'Properties'
            {
             before(grammarAccess.getPropertiesAccess().getPropertiesKeyword_1()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Properties__Group__1__Impl1583); 
             after(grammarAccess.getPropertiesAccess().getPropertiesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__1__Impl"


    // $ANTLR start "rule__Properties__Group__2"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:839:1: rule__Properties__Group__2 : rule__Properties__Group__2__Impl ;
    public final void rule__Properties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:843:1: ( rule__Properties__Group__2__Impl )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:844:2: rule__Properties__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Properties__Group__2__Impl_in_rule__Properties__Group__21614);
            rule__Properties__Group__2__Impl();

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
    // $ANTLR end "rule__Properties__Group__2"


    // $ANTLR start "rule__Properties__Group__2__Impl"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:850:1: rule__Properties__Group__2__Impl : ( ( rule__Properties__AnyAssignment_2 )? ) ;
    public final void rule__Properties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:854:1: ( ( ( rule__Properties__AnyAssignment_2 )? ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:855:1: ( ( rule__Properties__AnyAssignment_2 )? )
            {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:855:1: ( ( rule__Properties__AnyAssignment_2 )? )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:856:1: ( rule__Properties__AnyAssignment_2 )?
            {
             before(grammarAccess.getPropertiesAccess().getAnyAssignment_2()); 
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:857:1: ( rule__Properties__AnyAssignment_2 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:857:2: rule__Properties__AnyAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Properties__AnyAssignment_2_in_rule__Properties__Group__2__Impl1641);
                    rule__Properties__AnyAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertiesAccess().getAnyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__2__Impl"


    // $ANTLR start "rule__RootElementType__Element1Assignment_3"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:874:1: rule__RootElementType__Element1Assignment_3 : ( ruleElement1 ) ;
    public final void rule__RootElementType__Element1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:878:1: ( ( ruleElement1 ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:879:1: ( ruleElement1 )
            {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:879:1: ( ruleElement1 )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:880:1: ruleElement1
            {
             before(grammarAccess.getRootElementTypeAccess().getElement1Element1ParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement1_in_rule__RootElementType__Element1Assignment_31683);
            ruleElement1();

            state._fsp--;

             after(grammarAccess.getRootElementTypeAccess().getElement1Element1ParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootElementType__Element1Assignment_3"


    // $ANTLR start "rule__RootElementType__PropertiesAssignment_4_1"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:889:1: rule__RootElementType__PropertiesAssignment_4_1 : ( ruleProperties ) ;
    public final void rule__RootElementType__PropertiesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:893:1: ( ( ruleProperties ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:894:1: ( ruleProperties )
            {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:894:1: ( ruleProperties )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:895:1: ruleProperties
            {
             before(grammarAccess.getRootElementTypeAccess().getPropertiesPropertiesParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperties_in_rule__RootElementType__PropertiesAssignment_4_11714);
            ruleProperties();

            state._fsp--;

             after(grammarAccess.getRootElementTypeAccess().getPropertiesPropertiesParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootElementType__PropertiesAssignment_4_1"


    // $ANTLR start "rule__Element1__CityAssignment_3_1"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:904:1: rule__Element1__CityAssignment_3_1 : ( ruleString0 ) ;
    public final void rule__Element1__CityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:908:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:909:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:909:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:910:1: ruleString0
            {
             before(grammarAccess.getElement1Access().getCityString0ParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Element1__CityAssignment_3_11745);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getElement1Access().getCityString0ParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1__CityAssignment_3_1"


    // $ANTLR start "rule__Element1__StreetAssignment_4_1"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:919:1: rule__Element1__StreetAssignment_4_1 : ( ruleString0 ) ;
    public final void rule__Element1__StreetAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:923:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:924:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:924:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:925:1: ruleString0
            {
             before(grammarAccess.getElement1Access().getStreetString0ParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Element1__StreetAssignment_4_11776);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getElement1Access().getStreetString0ParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1__StreetAssignment_4_1"


    // $ANTLR start "rule__Properties__AnyAssignment_2"
    // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:934:1: rule__Properties__AnyAssignment_2 : ( ruleEFeatureMapEntry ) ;
    public final void rule__Properties__AnyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:938:1: ( ( ruleEFeatureMapEntry ) )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:939:1: ( ruleEFeatureMapEntry )
            {
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:939:1: ( ruleEFeatureMapEntry )
            // ../org.xtext.example.mydsl.anyfeature.ui/src-gen/org/xtext/example/mydsl/anyfeature/ui/contentassist/antlr/internal/InternalMyDsl.g:940:1: ruleEFeatureMapEntry
            {
             before(grammarAccess.getPropertiesAccess().getAnyEFeatureMapEntryParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFeatureMapEntry_in_rule__Properties__AnyAssignment_21807);
            ruleEFeatureMapEntry();

            state._fsp--;

             after(grammarAccess.getPropertiesAccess().getAnyEFeatureMapEntryParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__AnyAssignment_2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRootElementType_in_entryRuleRootElementType61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRootElementType68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__0_in_ruleRootElementType94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement1_in_entryRuleElement1121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElement1128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group__0_in_ruleElement1154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperties_in_entryRuleProperties181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperties188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Properties__Group__0_in_ruleProperties214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFeatureMapEntry_in_entryRuleEFeatureMapEntry241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFeatureMapEntry248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEFeatureMapEntry274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString0300 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString0307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleString0333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__0__Impl_in_rule__RootElementType__Group__0366 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__1_in_rule__RootElementType__Group__0369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__RootElementType__Group__0__Impl397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__1__Impl_in_rule__RootElementType__Group__1428 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__2_in_rule__RootElementType__Group__1431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__RootElementType__Group__1__Impl459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__2__Impl_in_rule__RootElementType__Group__2490 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__3_in_rule__RootElementType__Group__2493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__RootElementType__Group__2__Impl521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__3__Impl_in_rule__RootElementType__Group__3552 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__4_in_rule__RootElementType__Group__3555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Element1Assignment_3_in_rule__RootElementType__Group__3__Impl582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__4__Impl_in_rule__RootElementType__Group__4612 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__5_in_rule__RootElementType__Group__4615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group_4__0_in_rule__RootElementType__Group__4__Impl642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__5__Impl_in_rule__RootElementType__Group__5673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__RootElementType__Group__5__Impl701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group_4__0__Impl_in_rule__RootElementType__Group_4__0744 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group_4__1_in_rule__RootElementType__Group_4__0747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__RootElementType__Group_4__0__Impl775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group_4__1__Impl_in_rule__RootElementType__Group_4__1806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__PropertiesAssignment_4_1_in_rule__RootElementType__Group_4__1__Impl833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group__0__Impl_in_rule__Element1__Group__0867 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Element1__Group__1_in_rule__Element1__Group__0870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group__1__Impl_in_rule__Element1__Group__1928 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Element1__Group__2_in_rule__Element1__Group__1931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Element1__Group__1__Impl959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group__2__Impl_in_rule__Element1__Group__2990 = new BitSet(new long[]{0x0000000000064000L});
        public static final BitSet FOLLOW_rule__Element1__Group__3_in_rule__Element1__Group__2993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Element1__Group__2__Impl1021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group__3__Impl_in_rule__Element1__Group__31052 = new BitSet(new long[]{0x0000000000064000L});
        public static final BitSet FOLLOW_rule__Element1__Group__4_in_rule__Element1__Group__31055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group_3__0_in_rule__Element1__Group__3__Impl1082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group__4__Impl_in_rule__Element1__Group__41113 = new BitSet(new long[]{0x0000000000064000L});
        public static final BitSet FOLLOW_rule__Element1__Group__5_in_rule__Element1__Group__41116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group_4__0_in_rule__Element1__Group__4__Impl1143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group__5__Impl_in_rule__Element1__Group__51174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Element1__Group__5__Impl1202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group_3__0__Impl_in_rule__Element1__Group_3__01245 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Element1__Group_3__1_in_rule__Element1__Group_3__01248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Element1__Group_3__0__Impl1276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group_3__1__Impl_in_rule__Element1__Group_3__11307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__CityAssignment_3_1_in_rule__Element1__Group_3__1__Impl1334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group_4__0__Impl_in_rule__Element1__Group_4__01368 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Element1__Group_4__1_in_rule__Element1__Group_4__01371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Element1__Group_4__0__Impl1399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group_4__1__Impl_in_rule__Element1__Group_4__11430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__StreetAssignment_4_1_in_rule__Element1__Group_4__1__Impl1457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Properties__Group__0__Impl_in_rule__Properties__Group__01491 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Properties__Group__1_in_rule__Properties__Group__01494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Properties__Group__1__Impl_in_rule__Properties__Group__11552 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Properties__Group__2_in_rule__Properties__Group__11555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Properties__Group__1__Impl1583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Properties__Group__2__Impl_in_rule__Properties__Group__21614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Properties__AnyAssignment_2_in_rule__Properties__Group__2__Impl1641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement1_in_rule__RootElementType__Element1Assignment_31683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperties_in_rule__RootElementType__PropertiesAssignment_4_11714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Element1__CityAssignment_3_11745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Element1__StreetAssignment_4_11776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFeatureMapEntry_in_rule__Properties__AnyAssignment_21807 = new BitSet(new long[]{0x0000000000000002L});
    }


}