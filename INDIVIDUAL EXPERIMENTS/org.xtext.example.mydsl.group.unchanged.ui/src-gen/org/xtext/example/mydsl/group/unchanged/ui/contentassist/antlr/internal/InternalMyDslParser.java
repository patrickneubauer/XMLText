package org.xtext.example.mydsl.group.unchanged.ui.contentassist.antlr.internal; 

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
import org.xtext.example.mydsl.group.unchanged.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'RootElementType'", "'{'", "'element1'", "'element2'", "'element3'", "'}'", "'Element1'", "'Element2'", "'modelGroupElement1'", "'modelGroupElement2'", "'modelGroupElement3'", "','", "'Element3'", "'repeatableElement1'", "'repeatableElement2'", "'repeatableElement3'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
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
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
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
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleRootElementType : ruleRootElementType EOF ;
    public final void entryRuleRootElementType() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleRootElementType EOF )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleRootElementType EOF
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
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleRootElementType : ( ( rule__RootElementType__Group__0 ) ) ;
    public final void ruleRootElementType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__RootElementType__Group__0 ) ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__RootElementType__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__RootElementType__Group__0 ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__RootElementType__Group__0 )
            {
             before(grammarAccess.getRootElementTypeAccess().getGroup()); 
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__RootElementType__Group__0 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__RootElementType__Group__0
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
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleElement1 : ruleElement1 EOF ;
    public final void entryRuleElement1() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleElement1 EOF )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleElement1 EOF
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
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleElement1 : ( ( rule__Element1__Group__0 ) ) ;
    public final void ruleElement1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__Element1__Group__0 ) ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Element1__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Element1__Group__0 ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__Element1__Group__0 )
            {
             before(grammarAccess.getElement1Access().getGroup()); 
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__Element1__Group__0 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__Element1__Group__0
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


    // $ANTLR start "entryRuleElement2"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleElement2 : ruleElement2 EOF ;
    public final void entryRuleElement2() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleElement2 EOF )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleElement2 EOF
            {
             before(grammarAccess.getElement2Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement2_in_entryRuleElement2181);
            ruleElement2();

            state._fsp--;

             after(grammarAccess.getElement2Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElement2188); 

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
    // $ANTLR end "entryRuleElement2"


    // $ANTLR start "ruleElement2"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleElement2 : ( ( rule__Element2__Group__0 ) ) ;
    public final void ruleElement2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__Element2__Group__0 ) ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Element2__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Element2__Group__0 ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__Element2__Group__0 )
            {
             before(grammarAccess.getElement2Access().getGroup()); 
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__Element2__Group__0 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__Element2__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__0_in_ruleElement2214);
            rule__Element2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElement2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement2"


    // $ANTLR start "entryRuleElement3"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleElement3 : ruleElement3 EOF ;
    public final void entryRuleElement3() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleElement3 EOF )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleElement3 EOF
            {
             before(grammarAccess.getElement3Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement3_in_entryRuleElement3241);
            ruleElement3();

            state._fsp--;

             after(grammarAccess.getElement3Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElement3248); 

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
    // $ANTLR end "entryRuleElement3"


    // $ANTLR start "ruleElement3"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleElement3 : ( ( rule__Element3__Group__0 ) ) ;
    public final void ruleElement3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ( rule__Element3__Group__0 ) ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Element3__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Element3__Group__0 ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( rule__Element3__Group__0 )
            {
             before(grammarAccess.getElement3Access().getGroup()); 
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__Element3__Group__0 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: rule__Element3__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group__0_in_ruleElement3274);
            rule__Element3__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElement3Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement3"


    // $ANTLR start "entryRuleString0"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleString0 EOF )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleString0 EOF
            {
             before(grammarAccess.getString0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_entryRuleString0301);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getString0Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleString0308); 

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
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleString0 : ( 'String' ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( 'String' ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( 'String' )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( 'String' )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: 'String'
            {
             before(grammarAccess.getString0Access().getStringKeyword()); 
            match(input,11,FollowSets000.FOLLOW_11_in_ruleString0335); 
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


    // $ANTLR start "rule__RootElementType__Group__0"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:204:1: rule__RootElementType__Group__0 : rule__RootElementType__Group__0__Impl rule__RootElementType__Group__1 ;
    public final void rule__RootElementType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:208:1: ( rule__RootElementType__Group__0__Impl rule__RootElementType__Group__1 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:209:2: rule__RootElementType__Group__0__Impl rule__RootElementType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__0__Impl_in_rule__RootElementType__Group__0370);
            rule__RootElementType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__1_in_rule__RootElementType__Group__0373);
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
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: rule__RootElementType__Group__0__Impl : ( 'RootElementType' ) ;
    public final void rule__RootElementType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:220:1: ( ( 'RootElementType' ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:221:1: ( 'RootElementType' )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:221:1: ( 'RootElementType' )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:222:1: 'RootElementType'
            {
             before(grammarAccess.getRootElementTypeAccess().getRootElementTypeKeyword_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__RootElementType__Group__0__Impl401); 
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
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:235:1: rule__RootElementType__Group__1 : rule__RootElementType__Group__1__Impl rule__RootElementType__Group__2 ;
    public final void rule__RootElementType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:239:1: ( rule__RootElementType__Group__1__Impl rule__RootElementType__Group__2 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:240:2: rule__RootElementType__Group__1__Impl rule__RootElementType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__1__Impl_in_rule__RootElementType__Group__1432);
            rule__RootElementType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__2_in_rule__RootElementType__Group__1435);
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
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:247:1: rule__RootElementType__Group__1__Impl : ( '{' ) ;
    public final void rule__RootElementType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:251:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:252:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:252:1: ( '{' )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:253:1: '{'
            {
             before(grammarAccess.getRootElementTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__RootElementType__Group__1__Impl463); 
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
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:266:1: rule__RootElementType__Group__2 : rule__RootElementType__Group__2__Impl rule__RootElementType__Group__3 ;
    public final void rule__RootElementType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( rule__RootElementType__Group__2__Impl rule__RootElementType__Group__3 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:271:2: rule__RootElementType__Group__2__Impl rule__RootElementType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__2__Impl_in_rule__RootElementType__Group__2494);
            rule__RootElementType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__3_in_rule__RootElementType__Group__2497);
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
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:278:1: rule__RootElementType__Group__2__Impl : ( 'element1' ) ;
    public final void rule__RootElementType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:282:1: ( ( 'element1' ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:283:1: ( 'element1' )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:283:1: ( 'element1' )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:284:1: 'element1'
            {
             before(grammarAccess.getRootElementTypeAccess().getElement1Keyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__RootElementType__Group__2__Impl525); 
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
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:297:1: rule__RootElementType__Group__3 : rule__RootElementType__Group__3__Impl rule__RootElementType__Group__4 ;
    public final void rule__RootElementType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:301:1: ( rule__RootElementType__Group__3__Impl rule__RootElementType__Group__4 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:302:2: rule__RootElementType__Group__3__Impl rule__RootElementType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__3__Impl_in_rule__RootElementType__Group__3556);
            rule__RootElementType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__4_in_rule__RootElementType__Group__3559);
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
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:309:1: rule__RootElementType__Group__3__Impl : ( ( rule__RootElementType__Element1Assignment_3 ) ) ;
    public final void rule__RootElementType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:313:1: ( ( ( rule__RootElementType__Element1Assignment_3 ) ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:314:1: ( ( rule__RootElementType__Element1Assignment_3 ) )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:314:1: ( ( rule__RootElementType__Element1Assignment_3 ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:315:1: ( rule__RootElementType__Element1Assignment_3 )
            {
             before(grammarAccess.getRootElementTypeAccess().getElement1Assignment_3()); 
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:316:1: ( rule__RootElementType__Element1Assignment_3 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:316:2: rule__RootElementType__Element1Assignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Element1Assignment_3_in_rule__RootElementType__Group__3__Impl586);
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
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: rule__RootElementType__Group__4 : rule__RootElementType__Group__4__Impl rule__RootElementType__Group__5 ;
    public final void rule__RootElementType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:330:1: ( rule__RootElementType__Group__4__Impl rule__RootElementType__Group__5 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:331:2: rule__RootElementType__Group__4__Impl rule__RootElementType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__4__Impl_in_rule__RootElementType__Group__4616);
            rule__RootElementType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__5_in_rule__RootElementType__Group__4619);
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
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:338:1: rule__RootElementType__Group__4__Impl : ( 'element2' ) ;
    public final void rule__RootElementType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: ( ( 'element2' ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:343:1: ( 'element2' )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:343:1: ( 'element2' )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:344:1: 'element2'
            {
             before(grammarAccess.getRootElementTypeAccess().getElement2Keyword_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__RootElementType__Group__4__Impl647); 
             after(grammarAccess.getRootElementTypeAccess().getElement2Keyword_4()); 

            }


            }

        }
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
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:357:1: rule__RootElementType__Group__5 : rule__RootElementType__Group__5__Impl rule__RootElementType__Group__6 ;
    public final void rule__RootElementType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:361:1: ( rule__RootElementType__Group__5__Impl rule__RootElementType__Group__6 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:362:2: rule__RootElementType__Group__5__Impl rule__RootElementType__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__5__Impl_in_rule__RootElementType__Group__5678);
            rule__RootElementType__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__6_in_rule__RootElementType__Group__5681);
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
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:369:1: rule__RootElementType__Group__5__Impl : ( ( rule__RootElementType__Element2Assignment_5 ) ) ;
    public final void rule__RootElementType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:373:1: ( ( ( rule__RootElementType__Element2Assignment_5 ) ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:374:1: ( ( rule__RootElementType__Element2Assignment_5 ) )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:374:1: ( ( rule__RootElementType__Element2Assignment_5 ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:375:1: ( rule__RootElementType__Element2Assignment_5 )
            {
             before(grammarAccess.getRootElementTypeAccess().getElement2Assignment_5()); 
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:376:1: ( rule__RootElementType__Element2Assignment_5 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:376:2: rule__RootElementType__Element2Assignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Element2Assignment_5_in_rule__RootElementType__Group__5__Impl708);
            rule__RootElementType__Element2Assignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRootElementTypeAccess().getElement2Assignment_5()); 

            }


            }

        }
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
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:386:1: rule__RootElementType__Group__6 : rule__RootElementType__Group__6__Impl rule__RootElementType__Group__7 ;
    public final void rule__RootElementType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:390:1: ( rule__RootElementType__Group__6__Impl rule__RootElementType__Group__7 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:391:2: rule__RootElementType__Group__6__Impl rule__RootElementType__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__6__Impl_in_rule__RootElementType__Group__6738);
            rule__RootElementType__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__7_in_rule__RootElementType__Group__6741);
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
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:398:1: rule__RootElementType__Group__6__Impl : ( 'element3' ) ;
    public final void rule__RootElementType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:402:1: ( ( 'element3' ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:403:1: ( 'element3' )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:403:1: ( 'element3' )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:404:1: 'element3'
            {
             before(grammarAccess.getRootElementTypeAccess().getElement3Keyword_6()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__RootElementType__Group__6__Impl769); 
             after(grammarAccess.getRootElementTypeAccess().getElement3Keyword_6()); 

            }


            }

        }
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
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:417:1: rule__RootElementType__Group__7 : rule__RootElementType__Group__7__Impl rule__RootElementType__Group__8 ;
    public final void rule__RootElementType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:421:1: ( rule__RootElementType__Group__7__Impl rule__RootElementType__Group__8 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:422:2: rule__RootElementType__Group__7__Impl rule__RootElementType__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__7__Impl_in_rule__RootElementType__Group__7800);
            rule__RootElementType__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__8_in_rule__RootElementType__Group__7803);
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
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:429:1: rule__RootElementType__Group__7__Impl : ( ( rule__RootElementType__Element3Assignment_7 ) ) ;
    public final void rule__RootElementType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:433:1: ( ( ( rule__RootElementType__Element3Assignment_7 ) ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:434:1: ( ( rule__RootElementType__Element3Assignment_7 ) )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:434:1: ( ( rule__RootElementType__Element3Assignment_7 ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:435:1: ( rule__RootElementType__Element3Assignment_7 )
            {
             before(grammarAccess.getRootElementTypeAccess().getElement3Assignment_7()); 
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:436:1: ( rule__RootElementType__Element3Assignment_7 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:436:2: rule__RootElementType__Element3Assignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Element3Assignment_7_in_rule__RootElementType__Group__7__Impl830);
            rule__RootElementType__Element3Assignment_7();

            state._fsp--;


            }

             after(grammarAccess.getRootElementTypeAccess().getElement3Assignment_7()); 

            }


            }

        }
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
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:446:1: rule__RootElementType__Group__8 : rule__RootElementType__Group__8__Impl ;
    public final void rule__RootElementType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:450:1: ( rule__RootElementType__Group__8__Impl )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:451:2: rule__RootElementType__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__8__Impl_in_rule__RootElementType__Group__8860);
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
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:457:1: rule__RootElementType__Group__8__Impl : ( '}' ) ;
    public final void rule__RootElementType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:461:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:462:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:462:1: ( '}' )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:463:1: '}'
            {
             before(grammarAccess.getRootElementTypeAccess().getRightCurlyBracketKeyword_8()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__RootElementType__Group__8__Impl888); 
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


    // $ANTLR start "rule__Element1__Group__0"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:494:1: rule__Element1__Group__0 : rule__Element1__Group__0__Impl rule__Element1__Group__1 ;
    public final void rule__Element1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:498:1: ( rule__Element1__Group__0__Impl rule__Element1__Group__1 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:499:2: rule__Element1__Group__0__Impl rule__Element1__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__0__Impl_in_rule__Element1__Group__0937);
            rule__Element1__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__1_in_rule__Element1__Group__0940);
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
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:506:1: rule__Element1__Group__0__Impl : ( () ) ;
    public final void rule__Element1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:510:1: ( ( () ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:511:1: ( () )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:511:1: ( () )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:512:1: ()
            {
             before(grammarAccess.getElement1Access().getElement1Action_0()); 
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:513:1: ()
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:515:1: 
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
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:525:1: rule__Element1__Group__1 : rule__Element1__Group__1__Impl ;
    public final void rule__Element1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:529:1: ( rule__Element1__Group__1__Impl )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:530:2: rule__Element1__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__1__Impl_in_rule__Element1__Group__1998);
            rule__Element1__Group__1__Impl();

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
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:536:1: rule__Element1__Group__1__Impl : ( 'Element1' ) ;
    public final void rule__Element1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:540:1: ( ( 'Element1' ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:541:1: ( 'Element1' )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:541:1: ( 'Element1' )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:542:1: 'Element1'
            {
             before(grammarAccess.getElement1Access().getElement1Keyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Element1__Group__1__Impl1026); 
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


    // $ANTLR start "rule__Element2__Group__0"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:559:1: rule__Element2__Group__0 : rule__Element2__Group__0__Impl rule__Element2__Group__1 ;
    public final void rule__Element2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:563:1: ( rule__Element2__Group__0__Impl rule__Element2__Group__1 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:564:2: rule__Element2__Group__0__Impl rule__Element2__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__0__Impl_in_rule__Element2__Group__01061);
            rule__Element2__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__1_in_rule__Element2__Group__01064);
            rule__Element2__Group__1();

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
    // $ANTLR end "rule__Element2__Group__0"


    // $ANTLR start "rule__Element2__Group__0__Impl"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:571:1: rule__Element2__Group__0__Impl : ( 'Element2' ) ;
    public final void rule__Element2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:575:1: ( ( 'Element2' ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:576:1: ( 'Element2' )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:576:1: ( 'Element2' )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:577:1: 'Element2'
            {
             before(grammarAccess.getElement2Access().getElement2Keyword_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Element2__Group__0__Impl1092); 
             after(grammarAccess.getElement2Access().getElement2Keyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element2__Group__0__Impl"


    // $ANTLR start "rule__Element2__Group__1"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:590:1: rule__Element2__Group__1 : rule__Element2__Group__1__Impl rule__Element2__Group__2 ;
    public final void rule__Element2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:594:1: ( rule__Element2__Group__1__Impl rule__Element2__Group__2 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:595:2: rule__Element2__Group__1__Impl rule__Element2__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__1__Impl_in_rule__Element2__Group__11123);
            rule__Element2__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__2_in_rule__Element2__Group__11126);
            rule__Element2__Group__2();

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
    // $ANTLR end "rule__Element2__Group__1"


    // $ANTLR start "rule__Element2__Group__1__Impl"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:602:1: rule__Element2__Group__1__Impl : ( '{' ) ;
    public final void rule__Element2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:606:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:607:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:607:1: ( '{' )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:608:1: '{'
            {
             before(grammarAccess.getElement2Access().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Element2__Group__1__Impl1154); 
             after(grammarAccess.getElement2Access().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element2__Group__1__Impl"


    // $ANTLR start "rule__Element2__Group__2"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:621:1: rule__Element2__Group__2 : rule__Element2__Group__2__Impl rule__Element2__Group__3 ;
    public final void rule__Element2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:625:1: ( rule__Element2__Group__2__Impl rule__Element2__Group__3 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:626:2: rule__Element2__Group__2__Impl rule__Element2__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__2__Impl_in_rule__Element2__Group__21185);
            rule__Element2__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__3_in_rule__Element2__Group__21188);
            rule__Element2__Group__3();

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
    // $ANTLR end "rule__Element2__Group__2"


    // $ANTLR start "rule__Element2__Group__2__Impl"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:633:1: rule__Element2__Group__2__Impl : ( 'modelGroupElement1' ) ;
    public final void rule__Element2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:637:1: ( ( 'modelGroupElement1' ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:638:1: ( 'modelGroupElement1' )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:638:1: ( 'modelGroupElement1' )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:639:1: 'modelGroupElement1'
            {
             before(grammarAccess.getElement2Access().getModelGroupElement1Keyword_2()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Element2__Group__2__Impl1216); 
             after(grammarAccess.getElement2Access().getModelGroupElement1Keyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element2__Group__2__Impl"


    // $ANTLR start "rule__Element2__Group__3"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:652:1: rule__Element2__Group__3 : rule__Element2__Group__3__Impl rule__Element2__Group__4 ;
    public final void rule__Element2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:656:1: ( rule__Element2__Group__3__Impl rule__Element2__Group__4 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:657:2: rule__Element2__Group__3__Impl rule__Element2__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__3__Impl_in_rule__Element2__Group__31247);
            rule__Element2__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__4_in_rule__Element2__Group__31250);
            rule__Element2__Group__4();

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
    // $ANTLR end "rule__Element2__Group__3"


    // $ANTLR start "rule__Element2__Group__3__Impl"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:664:1: rule__Element2__Group__3__Impl : ( '{' ) ;
    public final void rule__Element2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:668:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:669:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:669:1: ( '{' )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:670:1: '{'
            {
             before(grammarAccess.getElement2Access().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Element2__Group__3__Impl1278); 
             after(grammarAccess.getElement2Access().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element2__Group__3__Impl"


    // $ANTLR start "rule__Element2__Group__4"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:683:1: rule__Element2__Group__4 : rule__Element2__Group__4__Impl rule__Element2__Group__5 ;
    public final void rule__Element2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:687:1: ( rule__Element2__Group__4__Impl rule__Element2__Group__5 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:688:2: rule__Element2__Group__4__Impl rule__Element2__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__4__Impl_in_rule__Element2__Group__41309);
            rule__Element2__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__5_in_rule__Element2__Group__41312);
            rule__Element2__Group__5();

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
    // $ANTLR end "rule__Element2__Group__4"


    // $ANTLR start "rule__Element2__Group__4__Impl"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:695:1: rule__Element2__Group__4__Impl : ( ( rule__Element2__ModelGroupElement1Assignment_4 ) ) ;
    public final void rule__Element2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:699:1: ( ( ( rule__Element2__ModelGroupElement1Assignment_4 ) ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:700:1: ( ( rule__Element2__ModelGroupElement1Assignment_4 ) )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:700:1: ( ( rule__Element2__ModelGroupElement1Assignment_4 ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:701:1: ( rule__Element2__ModelGroupElement1Assignment_4 )
            {
             before(grammarAccess.getElement2Access().getModelGroupElement1Assignment_4()); 
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:702:1: ( rule__Element2__ModelGroupElement1Assignment_4 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:702:2: rule__Element2__ModelGroupElement1Assignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__ModelGroupElement1Assignment_4_in_rule__Element2__Group__4__Impl1339);
            rule__Element2__ModelGroupElement1Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getElement2Access().getModelGroupElement1Assignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element2__Group__4__Impl"


    // $ANTLR start "rule__Element2__Group__5"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:712:1: rule__Element2__Group__5 : rule__Element2__Group__5__Impl rule__Element2__Group__6 ;
    public final void rule__Element2__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:716:1: ( rule__Element2__Group__5__Impl rule__Element2__Group__6 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:717:2: rule__Element2__Group__5__Impl rule__Element2__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__5__Impl_in_rule__Element2__Group__51369);
            rule__Element2__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__6_in_rule__Element2__Group__51372);
            rule__Element2__Group__6();

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
    // $ANTLR end "rule__Element2__Group__5"


    // $ANTLR start "rule__Element2__Group__5__Impl"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:724:1: rule__Element2__Group__5__Impl : ( ( rule__Element2__Group_5__0 )* ) ;
    public final void rule__Element2__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:728:1: ( ( ( rule__Element2__Group_5__0 )* ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:729:1: ( ( rule__Element2__Group_5__0 )* )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:729:1: ( ( rule__Element2__Group_5__0 )* )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:730:1: ( rule__Element2__Group_5__0 )*
            {
             before(grammarAccess.getElement2Access().getGroup_5()); 
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:731:1: ( rule__Element2__Group_5__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:731:2: rule__Element2__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Element2__Group_5__0_in_rule__Element2__Group__5__Impl1399);
            	    rule__Element2__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getElement2Access().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element2__Group__5__Impl"


    // $ANTLR start "rule__Element2__Group__6"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:741:1: rule__Element2__Group__6 : rule__Element2__Group__6__Impl rule__Element2__Group__7 ;
    public final void rule__Element2__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:745:1: ( rule__Element2__Group__6__Impl rule__Element2__Group__7 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:746:2: rule__Element2__Group__6__Impl rule__Element2__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__6__Impl_in_rule__Element2__Group__61430);
            rule__Element2__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__7_in_rule__Element2__Group__61433);
            rule__Element2__Group__7();

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
    // $ANTLR end "rule__Element2__Group__6"


    // $ANTLR start "rule__Element2__Group__6__Impl"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:753:1: rule__Element2__Group__6__Impl : ( '}' ) ;
    public final void rule__Element2__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:757:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:758:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:758:1: ( '}' )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:759:1: '}'
            {
             before(grammarAccess.getElement2Access().getRightCurlyBracketKeyword_6()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Element2__Group__6__Impl1461); 
             after(grammarAccess.getElement2Access().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element2__Group__6__Impl"


    // $ANTLR start "rule__Element2__Group__7"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:772:1: rule__Element2__Group__7 : rule__Element2__Group__7__Impl rule__Element2__Group__8 ;
    public final void rule__Element2__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:776:1: ( rule__Element2__Group__7__Impl rule__Element2__Group__8 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:777:2: rule__Element2__Group__7__Impl rule__Element2__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__7__Impl_in_rule__Element2__Group__71492);
            rule__Element2__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__8_in_rule__Element2__Group__71495);
            rule__Element2__Group__8();

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
    // $ANTLR end "rule__Element2__Group__7"


    // $ANTLR start "rule__Element2__Group__7__Impl"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:784:1: rule__Element2__Group__7__Impl : ( 'modelGroupElement2' ) ;
    public final void rule__Element2__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:788:1: ( ( 'modelGroupElement2' ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:789:1: ( 'modelGroupElement2' )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:789:1: ( 'modelGroupElement2' )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:790:1: 'modelGroupElement2'
            {
             before(grammarAccess.getElement2Access().getModelGroupElement2Keyword_7()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Element2__Group__7__Impl1523); 
             after(grammarAccess.getElement2Access().getModelGroupElement2Keyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element2__Group__7__Impl"


    // $ANTLR start "rule__Element2__Group__8"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:803:1: rule__Element2__Group__8 : rule__Element2__Group__8__Impl rule__Element2__Group__9 ;
    public final void rule__Element2__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:807:1: ( rule__Element2__Group__8__Impl rule__Element2__Group__9 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:808:2: rule__Element2__Group__8__Impl rule__Element2__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__8__Impl_in_rule__Element2__Group__81554);
            rule__Element2__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__9_in_rule__Element2__Group__81557);
            rule__Element2__Group__9();

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
    // $ANTLR end "rule__Element2__Group__8"


    // $ANTLR start "rule__Element2__Group__8__Impl"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:815:1: rule__Element2__Group__8__Impl : ( ( rule__Element2__ModelGroupElement2Assignment_8 ) ) ;
    public final void rule__Element2__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:819:1: ( ( ( rule__Element2__ModelGroupElement2Assignment_8 ) ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:820:1: ( ( rule__Element2__ModelGroupElement2Assignment_8 ) )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:820:1: ( ( rule__Element2__ModelGroupElement2Assignment_8 ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:821:1: ( rule__Element2__ModelGroupElement2Assignment_8 )
            {
             before(grammarAccess.getElement2Access().getModelGroupElement2Assignment_8()); 
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:822:1: ( rule__Element2__ModelGroupElement2Assignment_8 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:822:2: rule__Element2__ModelGroupElement2Assignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__ModelGroupElement2Assignment_8_in_rule__Element2__Group__8__Impl1584);
            rule__Element2__ModelGroupElement2Assignment_8();

            state._fsp--;


            }

             after(grammarAccess.getElement2Access().getModelGroupElement2Assignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element2__Group__8__Impl"


    // $ANTLR start "rule__Element2__Group__9"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:832:1: rule__Element2__Group__9 : rule__Element2__Group__9__Impl rule__Element2__Group__10 ;
    public final void rule__Element2__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:836:1: ( rule__Element2__Group__9__Impl rule__Element2__Group__10 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:837:2: rule__Element2__Group__9__Impl rule__Element2__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__9__Impl_in_rule__Element2__Group__91614);
            rule__Element2__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__10_in_rule__Element2__Group__91617);
            rule__Element2__Group__10();

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
    // $ANTLR end "rule__Element2__Group__9"


    // $ANTLR start "rule__Element2__Group__9__Impl"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:844:1: rule__Element2__Group__9__Impl : ( 'modelGroupElement3' ) ;
    public final void rule__Element2__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:848:1: ( ( 'modelGroupElement3' ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:849:1: ( 'modelGroupElement3' )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:849:1: ( 'modelGroupElement3' )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:850:1: 'modelGroupElement3'
            {
             before(grammarAccess.getElement2Access().getModelGroupElement3Keyword_9()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Element2__Group__9__Impl1645); 
             after(grammarAccess.getElement2Access().getModelGroupElement3Keyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element2__Group__9__Impl"


    // $ANTLR start "rule__Element2__Group__10"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:863:1: rule__Element2__Group__10 : rule__Element2__Group__10__Impl rule__Element2__Group__11 ;
    public final void rule__Element2__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:867:1: ( rule__Element2__Group__10__Impl rule__Element2__Group__11 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:868:2: rule__Element2__Group__10__Impl rule__Element2__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__10__Impl_in_rule__Element2__Group__101676);
            rule__Element2__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__11_in_rule__Element2__Group__101679);
            rule__Element2__Group__11();

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
    // $ANTLR end "rule__Element2__Group__10"


    // $ANTLR start "rule__Element2__Group__10__Impl"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:875:1: rule__Element2__Group__10__Impl : ( ( rule__Element2__ModelGroupElement3Assignment_10 ) ) ;
    public final void rule__Element2__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:879:1: ( ( ( rule__Element2__ModelGroupElement3Assignment_10 ) ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:880:1: ( ( rule__Element2__ModelGroupElement3Assignment_10 ) )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:880:1: ( ( rule__Element2__ModelGroupElement3Assignment_10 ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:881:1: ( rule__Element2__ModelGroupElement3Assignment_10 )
            {
             before(grammarAccess.getElement2Access().getModelGroupElement3Assignment_10()); 
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:882:1: ( rule__Element2__ModelGroupElement3Assignment_10 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:882:2: rule__Element2__ModelGroupElement3Assignment_10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__ModelGroupElement3Assignment_10_in_rule__Element2__Group__10__Impl1706);
            rule__Element2__ModelGroupElement3Assignment_10();

            state._fsp--;


            }

             after(grammarAccess.getElement2Access().getModelGroupElement3Assignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element2__Group__10__Impl"


    // $ANTLR start "rule__Element2__Group__11"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:892:1: rule__Element2__Group__11 : rule__Element2__Group__11__Impl ;
    public final void rule__Element2__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:896:1: ( rule__Element2__Group__11__Impl )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:897:2: rule__Element2__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__11__Impl_in_rule__Element2__Group__111736);
            rule__Element2__Group__11__Impl();

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
    // $ANTLR end "rule__Element2__Group__11"


    // $ANTLR start "rule__Element2__Group__11__Impl"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:903:1: rule__Element2__Group__11__Impl : ( '}' ) ;
    public final void rule__Element2__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:907:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:908:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:908:1: ( '}' )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:909:1: '}'
            {
             before(grammarAccess.getElement2Access().getRightCurlyBracketKeyword_11()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Element2__Group__11__Impl1764); 
             after(grammarAccess.getElement2Access().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element2__Group__11__Impl"


    // $ANTLR start "rule__Element2__Group_5__0"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:946:1: rule__Element2__Group_5__0 : rule__Element2__Group_5__0__Impl rule__Element2__Group_5__1 ;
    public final void rule__Element2__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:950:1: ( rule__Element2__Group_5__0__Impl rule__Element2__Group_5__1 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:951:2: rule__Element2__Group_5__0__Impl rule__Element2__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group_5__0__Impl_in_rule__Element2__Group_5__01819);
            rule__Element2__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group_5__1_in_rule__Element2__Group_5__01822);
            rule__Element2__Group_5__1();

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
    // $ANTLR end "rule__Element2__Group_5__0"


    // $ANTLR start "rule__Element2__Group_5__0__Impl"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:958:1: rule__Element2__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Element2__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:962:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:963:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:963:1: ( ',' )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:964:1: ','
            {
             before(grammarAccess.getElement2Access().getCommaKeyword_5_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Element2__Group_5__0__Impl1850); 
             after(grammarAccess.getElement2Access().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element2__Group_5__0__Impl"


    // $ANTLR start "rule__Element2__Group_5__1"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:977:1: rule__Element2__Group_5__1 : rule__Element2__Group_5__1__Impl ;
    public final void rule__Element2__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:981:1: ( rule__Element2__Group_5__1__Impl )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:982:2: rule__Element2__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group_5__1__Impl_in_rule__Element2__Group_5__11881);
            rule__Element2__Group_5__1__Impl();

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
    // $ANTLR end "rule__Element2__Group_5__1"


    // $ANTLR start "rule__Element2__Group_5__1__Impl"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:988:1: rule__Element2__Group_5__1__Impl : ( ( rule__Element2__ModelGroupElement1Assignment_5_1 ) ) ;
    public final void rule__Element2__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:992:1: ( ( ( rule__Element2__ModelGroupElement1Assignment_5_1 ) ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:993:1: ( ( rule__Element2__ModelGroupElement1Assignment_5_1 ) )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:993:1: ( ( rule__Element2__ModelGroupElement1Assignment_5_1 ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:994:1: ( rule__Element2__ModelGroupElement1Assignment_5_1 )
            {
             before(grammarAccess.getElement2Access().getModelGroupElement1Assignment_5_1()); 
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:995:1: ( rule__Element2__ModelGroupElement1Assignment_5_1 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:995:2: rule__Element2__ModelGroupElement1Assignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__ModelGroupElement1Assignment_5_1_in_rule__Element2__Group_5__1__Impl1908);
            rule__Element2__ModelGroupElement1Assignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getElement2Access().getModelGroupElement1Assignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element2__Group_5__1__Impl"


    // $ANTLR start "rule__Element3__Group__0"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1009:1: rule__Element3__Group__0 : rule__Element3__Group__0__Impl rule__Element3__Group__1 ;
    public final void rule__Element3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1013:1: ( rule__Element3__Group__0__Impl rule__Element3__Group__1 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1014:2: rule__Element3__Group__0__Impl rule__Element3__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group__0__Impl_in_rule__Element3__Group__01942);
            rule__Element3__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group__1_in_rule__Element3__Group__01945);
            rule__Element3__Group__1();

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
    // $ANTLR end "rule__Element3__Group__0"


    // $ANTLR start "rule__Element3__Group__0__Impl"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1021:1: rule__Element3__Group__0__Impl : ( () ) ;
    public final void rule__Element3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1025:1: ( ( () ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1026:1: ( () )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1026:1: ( () )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1027:1: ()
            {
             before(grammarAccess.getElement3Access().getElement3Action_0()); 
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1028:1: ()
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1030:1: 
            {
            }

             after(grammarAccess.getElement3Access().getElement3Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element3__Group__0__Impl"


    // $ANTLR start "rule__Element3__Group__1"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1040:1: rule__Element3__Group__1 : rule__Element3__Group__1__Impl rule__Element3__Group__2 ;
    public final void rule__Element3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1044:1: ( rule__Element3__Group__1__Impl rule__Element3__Group__2 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1045:2: rule__Element3__Group__1__Impl rule__Element3__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group__1__Impl_in_rule__Element3__Group__12003);
            rule__Element3__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group__2_in_rule__Element3__Group__12006);
            rule__Element3__Group__2();

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
    // $ANTLR end "rule__Element3__Group__1"


    // $ANTLR start "rule__Element3__Group__1__Impl"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1052:1: rule__Element3__Group__1__Impl : ( 'Element3' ) ;
    public final void rule__Element3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1056:1: ( ( 'Element3' ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1057:1: ( 'Element3' )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1057:1: ( 'Element3' )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1058:1: 'Element3'
            {
             before(grammarAccess.getElement3Access().getElement3Keyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Element3__Group__1__Impl2034); 
             after(grammarAccess.getElement3Access().getElement3Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element3__Group__1__Impl"


    // $ANTLR start "rule__Element3__Group__2"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1071:1: rule__Element3__Group__2 : rule__Element3__Group__2__Impl rule__Element3__Group__3 ;
    public final void rule__Element3__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1075:1: ( rule__Element3__Group__2__Impl rule__Element3__Group__3 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1076:2: rule__Element3__Group__2__Impl rule__Element3__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group__2__Impl_in_rule__Element3__Group__22065);
            rule__Element3__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group__3_in_rule__Element3__Group__22068);
            rule__Element3__Group__3();

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
    // $ANTLR end "rule__Element3__Group__2"


    // $ANTLR start "rule__Element3__Group__2__Impl"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1083:1: rule__Element3__Group__2__Impl : ( '{' ) ;
    public final void rule__Element3__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1087:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1088:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1088:1: ( '{' )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1089:1: '{'
            {
             before(grammarAccess.getElement3Access().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Element3__Group__2__Impl2096); 
             after(grammarAccess.getElement3Access().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element3__Group__2__Impl"


    // $ANTLR start "rule__Element3__Group__3"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1102:1: rule__Element3__Group__3 : rule__Element3__Group__3__Impl rule__Element3__Group__4 ;
    public final void rule__Element3__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1106:1: ( rule__Element3__Group__3__Impl rule__Element3__Group__4 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1107:2: rule__Element3__Group__3__Impl rule__Element3__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group__3__Impl_in_rule__Element3__Group__32127);
            rule__Element3__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group__4_in_rule__Element3__Group__32130);
            rule__Element3__Group__4();

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
    // $ANTLR end "rule__Element3__Group__3"


    // $ANTLR start "rule__Element3__Group__3__Impl"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1114:1: rule__Element3__Group__3__Impl : ( ( rule__Element3__Group_3__0 )? ) ;
    public final void rule__Element3__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1118:1: ( ( ( rule__Element3__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1119:1: ( ( rule__Element3__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1119:1: ( ( rule__Element3__Group_3__0 )? )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1120:1: ( rule__Element3__Group_3__0 )?
            {
             before(grammarAccess.getElement3Access().getGroup_3()); 
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1121:1: ( rule__Element3__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==25) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1121:2: rule__Element3__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_3__0_in_rule__Element3__Group__3__Impl2157);
                    rule__Element3__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElement3Access().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element3__Group__3__Impl"


    // $ANTLR start "rule__Element3__Group__4"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1131:1: rule__Element3__Group__4 : rule__Element3__Group__4__Impl rule__Element3__Group__5 ;
    public final void rule__Element3__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1135:1: ( rule__Element3__Group__4__Impl rule__Element3__Group__5 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1136:2: rule__Element3__Group__4__Impl rule__Element3__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group__4__Impl_in_rule__Element3__Group__42188);
            rule__Element3__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group__5_in_rule__Element3__Group__42191);
            rule__Element3__Group__5();

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
    // $ANTLR end "rule__Element3__Group__4"


    // $ANTLR start "rule__Element3__Group__4__Impl"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1143:1: rule__Element3__Group__4__Impl : ( ( rule__Element3__Group_4__0 )? ) ;
    public final void rule__Element3__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1147:1: ( ( ( rule__Element3__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1148:1: ( ( rule__Element3__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1148:1: ( ( rule__Element3__Group_4__0 )? )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1149:1: ( rule__Element3__Group_4__0 )?
            {
             before(grammarAccess.getElement3Access().getGroup_4()); 
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1150:1: ( rule__Element3__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1150:2: rule__Element3__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_4__0_in_rule__Element3__Group__4__Impl2218);
                    rule__Element3__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElement3Access().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element3__Group__4__Impl"


    // $ANTLR start "rule__Element3__Group__5"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1160:1: rule__Element3__Group__5 : rule__Element3__Group__5__Impl rule__Element3__Group__6 ;
    public final void rule__Element3__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1164:1: ( rule__Element3__Group__5__Impl rule__Element3__Group__6 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1165:2: rule__Element3__Group__5__Impl rule__Element3__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group__5__Impl_in_rule__Element3__Group__52249);
            rule__Element3__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group__6_in_rule__Element3__Group__52252);
            rule__Element3__Group__6();

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
    // $ANTLR end "rule__Element3__Group__5"


    // $ANTLR start "rule__Element3__Group__5__Impl"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1172:1: rule__Element3__Group__5__Impl : ( ( rule__Element3__Group_5__0 )? ) ;
    public final void rule__Element3__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1176:1: ( ( ( rule__Element3__Group_5__0 )? ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1177:1: ( ( rule__Element3__Group_5__0 )? )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1177:1: ( ( rule__Element3__Group_5__0 )? )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1178:1: ( rule__Element3__Group_5__0 )?
            {
             before(grammarAccess.getElement3Access().getGroup_5()); 
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1179:1: ( rule__Element3__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1179:2: rule__Element3__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_5__0_in_rule__Element3__Group__5__Impl2279);
                    rule__Element3__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElement3Access().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element3__Group__5__Impl"


    // $ANTLR start "rule__Element3__Group__6"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1189:1: rule__Element3__Group__6 : rule__Element3__Group__6__Impl ;
    public final void rule__Element3__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1193:1: ( rule__Element3__Group__6__Impl )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1194:2: rule__Element3__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group__6__Impl_in_rule__Element3__Group__62310);
            rule__Element3__Group__6__Impl();

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
    // $ANTLR end "rule__Element3__Group__6"


    // $ANTLR start "rule__Element3__Group__6__Impl"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1200:1: rule__Element3__Group__6__Impl : ( '}' ) ;
    public final void rule__Element3__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1204:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1205:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1205:1: ( '}' )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1206:1: '}'
            {
             before(grammarAccess.getElement3Access().getRightCurlyBracketKeyword_6()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Element3__Group__6__Impl2338); 
             after(grammarAccess.getElement3Access().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element3__Group__6__Impl"


    // $ANTLR start "rule__Element3__Group_3__0"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1233:1: rule__Element3__Group_3__0 : rule__Element3__Group_3__0__Impl rule__Element3__Group_3__1 ;
    public final void rule__Element3__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1237:1: ( rule__Element3__Group_3__0__Impl rule__Element3__Group_3__1 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1238:2: rule__Element3__Group_3__0__Impl rule__Element3__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_3__0__Impl_in_rule__Element3__Group_3__02383);
            rule__Element3__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_3__1_in_rule__Element3__Group_3__02386);
            rule__Element3__Group_3__1();

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
    // $ANTLR end "rule__Element3__Group_3__0"


    // $ANTLR start "rule__Element3__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1245:1: rule__Element3__Group_3__0__Impl : ( 'repeatableElement1' ) ;
    public final void rule__Element3__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1249:1: ( ( 'repeatableElement1' ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1250:1: ( 'repeatableElement1' )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1250:1: ( 'repeatableElement1' )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1251:1: 'repeatableElement1'
            {
             before(grammarAccess.getElement3Access().getRepeatableElement1Keyword_3_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Element3__Group_3__0__Impl2414); 
             after(grammarAccess.getElement3Access().getRepeatableElement1Keyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element3__Group_3__0__Impl"


    // $ANTLR start "rule__Element3__Group_3__1"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1264:1: rule__Element3__Group_3__1 : rule__Element3__Group_3__1__Impl rule__Element3__Group_3__2 ;
    public final void rule__Element3__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1268:1: ( rule__Element3__Group_3__1__Impl rule__Element3__Group_3__2 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1269:2: rule__Element3__Group_3__1__Impl rule__Element3__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_3__1__Impl_in_rule__Element3__Group_3__12445);
            rule__Element3__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_3__2_in_rule__Element3__Group_3__12448);
            rule__Element3__Group_3__2();

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
    // $ANTLR end "rule__Element3__Group_3__1"


    // $ANTLR start "rule__Element3__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1276:1: rule__Element3__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Element3__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1280:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1281:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1281:1: ( '{' )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1282:1: '{'
            {
             before(grammarAccess.getElement3Access().getLeftCurlyBracketKeyword_3_1()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Element3__Group_3__1__Impl2476); 
             after(grammarAccess.getElement3Access().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element3__Group_3__1__Impl"


    // $ANTLR start "rule__Element3__Group_3__2"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1295:1: rule__Element3__Group_3__2 : rule__Element3__Group_3__2__Impl rule__Element3__Group_3__3 ;
    public final void rule__Element3__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1299:1: ( rule__Element3__Group_3__2__Impl rule__Element3__Group_3__3 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1300:2: rule__Element3__Group_3__2__Impl rule__Element3__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_3__2__Impl_in_rule__Element3__Group_3__22507);
            rule__Element3__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_3__3_in_rule__Element3__Group_3__22510);
            rule__Element3__Group_3__3();

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
    // $ANTLR end "rule__Element3__Group_3__2"


    // $ANTLR start "rule__Element3__Group_3__2__Impl"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1307:1: rule__Element3__Group_3__2__Impl : ( ( rule__Element3__RepeatableElement1Assignment_3_2 ) ) ;
    public final void rule__Element3__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1311:1: ( ( ( rule__Element3__RepeatableElement1Assignment_3_2 ) ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1312:1: ( ( rule__Element3__RepeatableElement1Assignment_3_2 ) )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1312:1: ( ( rule__Element3__RepeatableElement1Assignment_3_2 ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1313:1: ( rule__Element3__RepeatableElement1Assignment_3_2 )
            {
             before(grammarAccess.getElement3Access().getRepeatableElement1Assignment_3_2()); 
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1314:1: ( rule__Element3__RepeatableElement1Assignment_3_2 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1314:2: rule__Element3__RepeatableElement1Assignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__RepeatableElement1Assignment_3_2_in_rule__Element3__Group_3__2__Impl2537);
            rule__Element3__RepeatableElement1Assignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getElement3Access().getRepeatableElement1Assignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element3__Group_3__2__Impl"


    // $ANTLR start "rule__Element3__Group_3__3"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1324:1: rule__Element3__Group_3__3 : rule__Element3__Group_3__3__Impl rule__Element3__Group_3__4 ;
    public final void rule__Element3__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1328:1: ( rule__Element3__Group_3__3__Impl rule__Element3__Group_3__4 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1329:2: rule__Element3__Group_3__3__Impl rule__Element3__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_3__3__Impl_in_rule__Element3__Group_3__32567);
            rule__Element3__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_3__4_in_rule__Element3__Group_3__32570);
            rule__Element3__Group_3__4();

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
    // $ANTLR end "rule__Element3__Group_3__3"


    // $ANTLR start "rule__Element3__Group_3__3__Impl"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1336:1: rule__Element3__Group_3__3__Impl : ( ( rule__Element3__Group_3_3__0 )* ) ;
    public final void rule__Element3__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1340:1: ( ( ( rule__Element3__Group_3_3__0 )* ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1341:1: ( ( rule__Element3__Group_3_3__0 )* )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1341:1: ( ( rule__Element3__Group_3_3__0 )* )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1342:1: ( rule__Element3__Group_3_3__0 )*
            {
             before(grammarAccess.getElement3Access().getGroup_3_3()); 
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1343:1: ( rule__Element3__Group_3_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1343:2: rule__Element3__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_3_3__0_in_rule__Element3__Group_3__3__Impl2597);
            	    rule__Element3__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getElement3Access().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element3__Group_3__3__Impl"


    // $ANTLR start "rule__Element3__Group_3__4"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1353:1: rule__Element3__Group_3__4 : rule__Element3__Group_3__4__Impl ;
    public final void rule__Element3__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1357:1: ( rule__Element3__Group_3__4__Impl )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1358:2: rule__Element3__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_3__4__Impl_in_rule__Element3__Group_3__42628);
            rule__Element3__Group_3__4__Impl();

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
    // $ANTLR end "rule__Element3__Group_3__4"


    // $ANTLR start "rule__Element3__Group_3__4__Impl"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1364:1: rule__Element3__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Element3__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1368:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1369:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1369:1: ( '}' )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1370:1: '}'
            {
             before(grammarAccess.getElement3Access().getRightCurlyBracketKeyword_3_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Element3__Group_3__4__Impl2656); 
             after(grammarAccess.getElement3Access().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element3__Group_3__4__Impl"


    // $ANTLR start "rule__Element3__Group_3_3__0"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1393:1: rule__Element3__Group_3_3__0 : rule__Element3__Group_3_3__0__Impl rule__Element3__Group_3_3__1 ;
    public final void rule__Element3__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1397:1: ( rule__Element3__Group_3_3__0__Impl rule__Element3__Group_3_3__1 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1398:2: rule__Element3__Group_3_3__0__Impl rule__Element3__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_3_3__0__Impl_in_rule__Element3__Group_3_3__02697);
            rule__Element3__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_3_3__1_in_rule__Element3__Group_3_3__02700);
            rule__Element3__Group_3_3__1();

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
    // $ANTLR end "rule__Element3__Group_3_3__0"


    // $ANTLR start "rule__Element3__Group_3_3__0__Impl"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1405:1: rule__Element3__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Element3__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1409:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1410:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1410:1: ( ',' )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1411:1: ','
            {
             before(grammarAccess.getElement3Access().getCommaKeyword_3_3_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Element3__Group_3_3__0__Impl2728); 
             after(grammarAccess.getElement3Access().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element3__Group_3_3__0__Impl"


    // $ANTLR start "rule__Element3__Group_3_3__1"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1424:1: rule__Element3__Group_3_3__1 : rule__Element3__Group_3_3__1__Impl ;
    public final void rule__Element3__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1428:1: ( rule__Element3__Group_3_3__1__Impl )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1429:2: rule__Element3__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_3_3__1__Impl_in_rule__Element3__Group_3_3__12759);
            rule__Element3__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__Element3__Group_3_3__1"


    // $ANTLR start "rule__Element3__Group_3_3__1__Impl"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1435:1: rule__Element3__Group_3_3__1__Impl : ( ( rule__Element3__RepeatableElement1Assignment_3_3_1 ) ) ;
    public final void rule__Element3__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1439:1: ( ( ( rule__Element3__RepeatableElement1Assignment_3_3_1 ) ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1440:1: ( ( rule__Element3__RepeatableElement1Assignment_3_3_1 ) )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1440:1: ( ( rule__Element3__RepeatableElement1Assignment_3_3_1 ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1441:1: ( rule__Element3__RepeatableElement1Assignment_3_3_1 )
            {
             before(grammarAccess.getElement3Access().getRepeatableElement1Assignment_3_3_1()); 
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1442:1: ( rule__Element3__RepeatableElement1Assignment_3_3_1 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1442:2: rule__Element3__RepeatableElement1Assignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__RepeatableElement1Assignment_3_3_1_in_rule__Element3__Group_3_3__1__Impl2786);
            rule__Element3__RepeatableElement1Assignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getElement3Access().getRepeatableElement1Assignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element3__Group_3_3__1__Impl"


    // $ANTLR start "rule__Element3__Group_4__0"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1456:1: rule__Element3__Group_4__0 : rule__Element3__Group_4__0__Impl rule__Element3__Group_4__1 ;
    public final void rule__Element3__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1460:1: ( rule__Element3__Group_4__0__Impl rule__Element3__Group_4__1 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1461:2: rule__Element3__Group_4__0__Impl rule__Element3__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_4__0__Impl_in_rule__Element3__Group_4__02820);
            rule__Element3__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_4__1_in_rule__Element3__Group_4__02823);
            rule__Element3__Group_4__1();

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
    // $ANTLR end "rule__Element3__Group_4__0"


    // $ANTLR start "rule__Element3__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1468:1: rule__Element3__Group_4__0__Impl : ( 'repeatableElement2' ) ;
    public final void rule__Element3__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1472:1: ( ( 'repeatableElement2' ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1473:1: ( 'repeatableElement2' )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1473:1: ( 'repeatableElement2' )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1474:1: 'repeatableElement2'
            {
             before(grammarAccess.getElement3Access().getRepeatableElement2Keyword_4_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Element3__Group_4__0__Impl2851); 
             after(grammarAccess.getElement3Access().getRepeatableElement2Keyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element3__Group_4__0__Impl"


    // $ANTLR start "rule__Element3__Group_4__1"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1487:1: rule__Element3__Group_4__1 : rule__Element3__Group_4__1__Impl ;
    public final void rule__Element3__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1491:1: ( rule__Element3__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1492:2: rule__Element3__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_4__1__Impl_in_rule__Element3__Group_4__12882);
            rule__Element3__Group_4__1__Impl();

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
    // $ANTLR end "rule__Element3__Group_4__1"


    // $ANTLR start "rule__Element3__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1498:1: rule__Element3__Group_4__1__Impl : ( ( rule__Element3__RepeatableElement2Assignment_4_1 ) ) ;
    public final void rule__Element3__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1502:1: ( ( ( rule__Element3__RepeatableElement2Assignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1503:1: ( ( rule__Element3__RepeatableElement2Assignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1503:1: ( ( rule__Element3__RepeatableElement2Assignment_4_1 ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1504:1: ( rule__Element3__RepeatableElement2Assignment_4_1 )
            {
             before(grammarAccess.getElement3Access().getRepeatableElement2Assignment_4_1()); 
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1505:1: ( rule__Element3__RepeatableElement2Assignment_4_1 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1505:2: rule__Element3__RepeatableElement2Assignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__RepeatableElement2Assignment_4_1_in_rule__Element3__Group_4__1__Impl2909);
            rule__Element3__RepeatableElement2Assignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getElement3Access().getRepeatableElement2Assignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element3__Group_4__1__Impl"


    // $ANTLR start "rule__Element3__Group_5__0"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1519:1: rule__Element3__Group_5__0 : rule__Element3__Group_5__0__Impl rule__Element3__Group_5__1 ;
    public final void rule__Element3__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1523:1: ( rule__Element3__Group_5__0__Impl rule__Element3__Group_5__1 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1524:2: rule__Element3__Group_5__0__Impl rule__Element3__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_5__0__Impl_in_rule__Element3__Group_5__02943);
            rule__Element3__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_5__1_in_rule__Element3__Group_5__02946);
            rule__Element3__Group_5__1();

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
    // $ANTLR end "rule__Element3__Group_5__0"


    // $ANTLR start "rule__Element3__Group_5__0__Impl"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1531:1: rule__Element3__Group_5__0__Impl : ( 'repeatableElement3' ) ;
    public final void rule__Element3__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1535:1: ( ( 'repeatableElement3' ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1536:1: ( 'repeatableElement3' )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1536:1: ( 'repeatableElement3' )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1537:1: 'repeatableElement3'
            {
             before(grammarAccess.getElement3Access().getRepeatableElement3Keyword_5_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Element3__Group_5__0__Impl2974); 
             after(grammarAccess.getElement3Access().getRepeatableElement3Keyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element3__Group_5__0__Impl"


    // $ANTLR start "rule__Element3__Group_5__1"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1550:1: rule__Element3__Group_5__1 : rule__Element3__Group_5__1__Impl ;
    public final void rule__Element3__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1554:1: ( rule__Element3__Group_5__1__Impl )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1555:2: rule__Element3__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_5__1__Impl_in_rule__Element3__Group_5__13005);
            rule__Element3__Group_5__1__Impl();

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
    // $ANTLR end "rule__Element3__Group_5__1"


    // $ANTLR start "rule__Element3__Group_5__1__Impl"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1561:1: rule__Element3__Group_5__1__Impl : ( ( rule__Element3__RepeatableElement3Assignment_5_1 ) ) ;
    public final void rule__Element3__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1565:1: ( ( ( rule__Element3__RepeatableElement3Assignment_5_1 ) ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1566:1: ( ( rule__Element3__RepeatableElement3Assignment_5_1 ) )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1566:1: ( ( rule__Element3__RepeatableElement3Assignment_5_1 ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1567:1: ( rule__Element3__RepeatableElement3Assignment_5_1 )
            {
             before(grammarAccess.getElement3Access().getRepeatableElement3Assignment_5_1()); 
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1568:1: ( rule__Element3__RepeatableElement3Assignment_5_1 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1568:2: rule__Element3__RepeatableElement3Assignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__RepeatableElement3Assignment_5_1_in_rule__Element3__Group_5__1__Impl3032);
            rule__Element3__RepeatableElement3Assignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getElement3Access().getRepeatableElement3Assignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element3__Group_5__1__Impl"


    // $ANTLR start "rule__RootElementType__Element1Assignment_3"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1583:1: rule__RootElementType__Element1Assignment_3 : ( ruleElement1 ) ;
    public final void rule__RootElementType__Element1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1587:1: ( ( ruleElement1 ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1588:1: ( ruleElement1 )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1588:1: ( ruleElement1 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1589:1: ruleElement1
            {
             before(grammarAccess.getRootElementTypeAccess().getElement1Element1ParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement1_in_rule__RootElementType__Element1Assignment_33071);
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


    // $ANTLR start "rule__RootElementType__Element2Assignment_5"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1598:1: rule__RootElementType__Element2Assignment_5 : ( ruleElement2 ) ;
    public final void rule__RootElementType__Element2Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1602:1: ( ( ruleElement2 ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1603:1: ( ruleElement2 )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1603:1: ( ruleElement2 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1604:1: ruleElement2
            {
             before(grammarAccess.getRootElementTypeAccess().getElement2Element2ParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement2_in_rule__RootElementType__Element2Assignment_53102);
            ruleElement2();

            state._fsp--;

             after(grammarAccess.getRootElementTypeAccess().getElement2Element2ParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootElementType__Element2Assignment_5"


    // $ANTLR start "rule__RootElementType__Element3Assignment_7"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1613:1: rule__RootElementType__Element3Assignment_7 : ( ruleElement3 ) ;
    public final void rule__RootElementType__Element3Assignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1617:1: ( ( ruleElement3 ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1618:1: ( ruleElement3 )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1618:1: ( ruleElement3 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1619:1: ruleElement3
            {
             before(grammarAccess.getRootElementTypeAccess().getElement3Element3ParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement3_in_rule__RootElementType__Element3Assignment_73133);
            ruleElement3();

            state._fsp--;

             after(grammarAccess.getRootElementTypeAccess().getElement3Element3ParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootElementType__Element3Assignment_7"


    // $ANTLR start "rule__Element2__ModelGroupElement1Assignment_4"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1628:1: rule__Element2__ModelGroupElement1Assignment_4 : ( ruleString0 ) ;
    public final void rule__Element2__ModelGroupElement1Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1632:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1633:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1633:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1634:1: ruleString0
            {
             before(grammarAccess.getElement2Access().getModelGroupElement1String0ParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Element2__ModelGroupElement1Assignment_43164);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getElement2Access().getModelGroupElement1String0ParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element2__ModelGroupElement1Assignment_4"


    // $ANTLR start "rule__Element2__ModelGroupElement1Assignment_5_1"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1643:1: rule__Element2__ModelGroupElement1Assignment_5_1 : ( ruleString0 ) ;
    public final void rule__Element2__ModelGroupElement1Assignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1647:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1648:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1648:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1649:1: ruleString0
            {
             before(grammarAccess.getElement2Access().getModelGroupElement1String0ParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Element2__ModelGroupElement1Assignment_5_13195);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getElement2Access().getModelGroupElement1String0ParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element2__ModelGroupElement1Assignment_5_1"


    // $ANTLR start "rule__Element2__ModelGroupElement2Assignment_8"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1658:1: rule__Element2__ModelGroupElement2Assignment_8 : ( ruleString0 ) ;
    public final void rule__Element2__ModelGroupElement2Assignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1662:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1663:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1663:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1664:1: ruleString0
            {
             before(grammarAccess.getElement2Access().getModelGroupElement2String0ParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Element2__ModelGroupElement2Assignment_83226);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getElement2Access().getModelGroupElement2String0ParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element2__ModelGroupElement2Assignment_8"


    // $ANTLR start "rule__Element2__ModelGroupElement3Assignment_10"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1673:1: rule__Element2__ModelGroupElement3Assignment_10 : ( ruleString0 ) ;
    public final void rule__Element2__ModelGroupElement3Assignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1677:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1678:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1678:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1679:1: ruleString0
            {
             before(grammarAccess.getElement2Access().getModelGroupElement3String0ParserRuleCall_10_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Element2__ModelGroupElement3Assignment_103257);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getElement2Access().getModelGroupElement3String0ParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element2__ModelGroupElement3Assignment_10"


    // $ANTLR start "rule__Element3__RepeatableElement1Assignment_3_2"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1688:1: rule__Element3__RepeatableElement1Assignment_3_2 : ( ruleString0 ) ;
    public final void rule__Element3__RepeatableElement1Assignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1692:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1693:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1693:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1694:1: ruleString0
            {
             before(grammarAccess.getElement3Access().getRepeatableElement1String0ParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Element3__RepeatableElement1Assignment_3_23288);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getElement3Access().getRepeatableElement1String0ParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element3__RepeatableElement1Assignment_3_2"


    // $ANTLR start "rule__Element3__RepeatableElement1Assignment_3_3_1"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1703:1: rule__Element3__RepeatableElement1Assignment_3_3_1 : ( ruleString0 ) ;
    public final void rule__Element3__RepeatableElement1Assignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1707:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1708:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1708:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1709:1: ruleString0
            {
             before(grammarAccess.getElement3Access().getRepeatableElement1String0ParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Element3__RepeatableElement1Assignment_3_3_13319);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getElement3Access().getRepeatableElement1String0ParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element3__RepeatableElement1Assignment_3_3_1"


    // $ANTLR start "rule__Element3__RepeatableElement2Assignment_4_1"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1718:1: rule__Element3__RepeatableElement2Assignment_4_1 : ( ruleString0 ) ;
    public final void rule__Element3__RepeatableElement2Assignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1722:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1723:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1723:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1724:1: ruleString0
            {
             before(grammarAccess.getElement3Access().getRepeatableElement2String0ParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Element3__RepeatableElement2Assignment_4_13350);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getElement3Access().getRepeatableElement2String0ParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element3__RepeatableElement2Assignment_4_1"


    // $ANTLR start "rule__Element3__RepeatableElement3Assignment_5_1"
    // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1733:1: rule__Element3__RepeatableElement3Assignment_5_1 : ( ruleString0 ) ;
    public final void rule__Element3__RepeatableElement3Assignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1737:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1738:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1738:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.group.unchanged.ui/src-gen/org/xtext/example/mydsl/group/unchanged/ui/contentassist/antlr/internal/InternalMyDsl.g:1739:1: ruleString0
            {
             before(grammarAccess.getElement3Access().getRepeatableElement3String0ParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Element3__RepeatableElement3Assignment_5_13381);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getElement3Access().getRepeatableElement3String0ParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element3__RepeatableElement3Assignment_5_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRootElementType_in_entryRuleRootElementType61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRootElementType68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__0_in_ruleRootElementType94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement1_in_entryRuleElement1121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElement1128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group__0_in_ruleElement1154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement2_in_entryRuleElement2181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElement2188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__Group__0_in_ruleElement2214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement3_in_entryRuleElement3241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElement3248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group__0_in_ruleElement3274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString0301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString0308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleString0335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__0__Impl_in_rule__RootElementType__Group__0370 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__1_in_rule__RootElementType__Group__0373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__RootElementType__Group__0__Impl401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__1__Impl_in_rule__RootElementType__Group__1432 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__2_in_rule__RootElementType__Group__1435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__RootElementType__Group__1__Impl463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__2__Impl_in_rule__RootElementType__Group__2494 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__3_in_rule__RootElementType__Group__2497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__RootElementType__Group__2__Impl525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__3__Impl_in_rule__RootElementType__Group__3556 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__4_in_rule__RootElementType__Group__3559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Element1Assignment_3_in_rule__RootElementType__Group__3__Impl586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__4__Impl_in_rule__RootElementType__Group__4616 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__5_in_rule__RootElementType__Group__4619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__RootElementType__Group__4__Impl647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__5__Impl_in_rule__RootElementType__Group__5678 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__6_in_rule__RootElementType__Group__5681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Element2Assignment_5_in_rule__RootElementType__Group__5__Impl708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__6__Impl_in_rule__RootElementType__Group__6738 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__7_in_rule__RootElementType__Group__6741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__RootElementType__Group__6__Impl769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__7__Impl_in_rule__RootElementType__Group__7800 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__8_in_rule__RootElementType__Group__7803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Element3Assignment_7_in_rule__RootElementType__Group__7__Impl830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__8__Impl_in_rule__RootElementType__Group__8860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__RootElementType__Group__8__Impl888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group__0__Impl_in_rule__Element1__Group__0937 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Element1__Group__1_in_rule__Element1__Group__0940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group__1__Impl_in_rule__Element1__Group__1998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Element1__Group__1__Impl1026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__Group__0__Impl_in_rule__Element2__Group__01061 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Element2__Group__1_in_rule__Element2__Group__01064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Element2__Group__0__Impl1092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__Group__1__Impl_in_rule__Element2__Group__11123 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Element2__Group__2_in_rule__Element2__Group__11126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Element2__Group__1__Impl1154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__Group__2__Impl_in_rule__Element2__Group__21185 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Element2__Group__3_in_rule__Element2__Group__21188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Element2__Group__2__Impl1216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__Group__3__Impl_in_rule__Element2__Group__31247 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Element2__Group__4_in_rule__Element2__Group__31250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Element2__Group__3__Impl1278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__Group__4__Impl_in_rule__Element2__Group__41309 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_rule__Element2__Group__5_in_rule__Element2__Group__41312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__ModelGroupElement1Assignment_4_in_rule__Element2__Group__4__Impl1339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__Group__5__Impl_in_rule__Element2__Group__51369 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_rule__Element2__Group__6_in_rule__Element2__Group__51372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__Group_5__0_in_rule__Element2__Group__5__Impl1399 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__Element2__Group__6__Impl_in_rule__Element2__Group__61430 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Element2__Group__7_in_rule__Element2__Group__61433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Element2__Group__6__Impl1461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__Group__7__Impl_in_rule__Element2__Group__71492 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Element2__Group__8_in_rule__Element2__Group__71495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Element2__Group__7__Impl1523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__Group__8__Impl_in_rule__Element2__Group__81554 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Element2__Group__9_in_rule__Element2__Group__81557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__ModelGroupElement2Assignment_8_in_rule__Element2__Group__8__Impl1584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__Group__9__Impl_in_rule__Element2__Group__91614 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Element2__Group__10_in_rule__Element2__Group__91617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Element2__Group__9__Impl1645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__Group__10__Impl_in_rule__Element2__Group__101676 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Element2__Group__11_in_rule__Element2__Group__101679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__ModelGroupElement3Assignment_10_in_rule__Element2__Group__10__Impl1706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__Group__11__Impl_in_rule__Element2__Group__111736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Element2__Group__11__Impl1764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__Group_5__0__Impl_in_rule__Element2__Group_5__01819 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Element2__Group_5__1_in_rule__Element2__Group_5__01822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Element2__Group_5__0__Impl1850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__Group_5__1__Impl_in_rule__Element2__Group_5__11881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__ModelGroupElement1Assignment_5_1_in_rule__Element2__Group_5__1__Impl1908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group__0__Impl_in_rule__Element3__Group__01942 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Element3__Group__1_in_rule__Element3__Group__01945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group__1__Impl_in_rule__Element3__Group__12003 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Element3__Group__2_in_rule__Element3__Group__12006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Element3__Group__1__Impl2034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group__2__Impl_in_rule__Element3__Group__22065 = new BitSet(new long[]{0x000000000E020000L});
        public static final BitSet FOLLOW_rule__Element3__Group__3_in_rule__Element3__Group__22068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Element3__Group__2__Impl2096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group__3__Impl_in_rule__Element3__Group__32127 = new BitSet(new long[]{0x000000000E020000L});
        public static final BitSet FOLLOW_rule__Element3__Group__4_in_rule__Element3__Group__32130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group_3__0_in_rule__Element3__Group__3__Impl2157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group__4__Impl_in_rule__Element3__Group__42188 = new BitSet(new long[]{0x000000000E020000L});
        public static final BitSet FOLLOW_rule__Element3__Group__5_in_rule__Element3__Group__42191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group_4__0_in_rule__Element3__Group__4__Impl2218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group__5__Impl_in_rule__Element3__Group__52249 = new BitSet(new long[]{0x000000000E020000L});
        public static final BitSet FOLLOW_rule__Element3__Group__6_in_rule__Element3__Group__52252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group_5__0_in_rule__Element3__Group__5__Impl2279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group__6__Impl_in_rule__Element3__Group__62310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Element3__Group__6__Impl2338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group_3__0__Impl_in_rule__Element3__Group_3__02383 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Element3__Group_3__1_in_rule__Element3__Group_3__02386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Element3__Group_3__0__Impl2414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group_3__1__Impl_in_rule__Element3__Group_3__12445 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Element3__Group_3__2_in_rule__Element3__Group_3__12448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Element3__Group_3__1__Impl2476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group_3__2__Impl_in_rule__Element3__Group_3__22507 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_rule__Element3__Group_3__3_in_rule__Element3__Group_3__22510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__RepeatableElement1Assignment_3_2_in_rule__Element3__Group_3__2__Impl2537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group_3__3__Impl_in_rule__Element3__Group_3__32567 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_rule__Element3__Group_3__4_in_rule__Element3__Group_3__32570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group_3_3__0_in_rule__Element3__Group_3__3__Impl2597 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__Element3__Group_3__4__Impl_in_rule__Element3__Group_3__42628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Element3__Group_3__4__Impl2656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group_3_3__0__Impl_in_rule__Element3__Group_3_3__02697 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Element3__Group_3_3__1_in_rule__Element3__Group_3_3__02700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Element3__Group_3_3__0__Impl2728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group_3_3__1__Impl_in_rule__Element3__Group_3_3__12759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__RepeatableElement1Assignment_3_3_1_in_rule__Element3__Group_3_3__1__Impl2786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group_4__0__Impl_in_rule__Element3__Group_4__02820 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Element3__Group_4__1_in_rule__Element3__Group_4__02823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Element3__Group_4__0__Impl2851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group_4__1__Impl_in_rule__Element3__Group_4__12882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__RepeatableElement2Assignment_4_1_in_rule__Element3__Group_4__1__Impl2909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group_5__0__Impl_in_rule__Element3__Group_5__02943 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Element3__Group_5__1_in_rule__Element3__Group_5__02946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Element3__Group_5__0__Impl2974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group_5__1__Impl_in_rule__Element3__Group_5__13005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__RepeatableElement3Assignment_5_1_in_rule__Element3__Group_5__1__Impl3032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement1_in_rule__RootElementType__Element1Assignment_33071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement2_in_rule__RootElementType__Element2Assignment_53102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement3_in_rule__RootElementType__Element3Assignment_73133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Element2__ModelGroupElement1Assignment_43164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Element2__ModelGroupElement1Assignment_5_13195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Element2__ModelGroupElement2Assignment_83226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Element2__ModelGroupElement3Assignment_103257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Element3__RepeatableElement1Assignment_3_23288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Element3__RepeatableElement1Assignment_3_3_13319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Element3__RepeatableElement2Assignment_4_13350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Element3__RepeatableElement3Assignment_5_13381 = new BitSet(new long[]{0x0000000000000002L});
    }


}