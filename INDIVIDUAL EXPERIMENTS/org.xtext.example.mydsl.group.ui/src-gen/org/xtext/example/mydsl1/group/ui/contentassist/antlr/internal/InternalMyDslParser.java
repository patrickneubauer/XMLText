package org.xtext.example.mydsl1.group.ui.contentassist.antlr.internal; 

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
import org.xtext.example.mydsl1.group.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'RootElementType'", "'{'", "'element1'", "'element2'", "'element3'", "'}'", "'Element1'", "'element1Choice'", "'Element2'", "'modelGroupElement1'", "'modelGroupElement2'", "'modelGroupElement3'", "','", "'Element3'", "'repeatableElement1'", "'repeatableElement2'", "'repeatableElement3'", "'Element1Choice'"
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
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
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
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleRootElementType : ruleRootElementType EOF ;
    public final void entryRuleRootElementType() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleRootElementType EOF )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleRootElementType EOF
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleRootElementType : ( ( rule__RootElementType__Group__0 ) ) ;
    public final void ruleRootElementType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__RootElementType__Group__0 ) ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__RootElementType__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__RootElementType__Group__0 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__RootElementType__Group__0 )
            {
             before(grammarAccess.getRootElementTypeAccess().getGroup()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__RootElementType__Group__0 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__RootElementType__Group__0
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleElement1 : ruleElement1 EOF ;
    public final void entryRuleElement1() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleElement1 EOF )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleElement1 EOF
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleElement1 : ( ( rule__Element1__Group__0 ) ) ;
    public final void ruleElement1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__Element1__Group__0 ) ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Element1__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Element1__Group__0 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__Element1__Group__0 )
            {
             before(grammarAccess.getElement1Access().getGroup()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__Element1__Group__0 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__Element1__Group__0
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleElement2 : ruleElement2 EOF ;
    public final void entryRuleElement2() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleElement2 EOF )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleElement2 EOF
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleElement2 : ( ( rule__Element2__Group__0 ) ) ;
    public final void ruleElement2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__Element2__Group__0 ) ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Element2__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Element2__Group__0 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__Element2__Group__0 )
            {
             before(grammarAccess.getElement2Access().getGroup()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__Element2__Group__0 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__Element2__Group__0
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleElement3 : ruleElement3 EOF ;
    public final void entryRuleElement3() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleElement3 EOF )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleElement3 EOF
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleElement3 : ( ( rule__Element3__Group__0 ) ) ;
    public final void ruleElement3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ( rule__Element3__Group__0 ) ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Element3__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Element3__Group__0 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( rule__Element3__Group__0 )
            {
             before(grammarAccess.getElement3Access().getGroup()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__Element3__Group__0 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: rule__Element3__Group__0
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


    // $ANTLR start "entryRuleElement1Choice"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleElement1Choice : ruleElement1Choice EOF ;
    public final void entryRuleElement1Choice() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleElement1Choice EOF )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleElement1Choice EOF
            {
             before(grammarAccess.getElement1ChoiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement1Choice_in_entryRuleElement1Choice301);
            ruleElement1Choice();

            state._fsp--;

             after(grammarAccess.getElement1ChoiceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElement1Choice308); 

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
    // $ANTLR end "entryRuleElement1Choice"


    // $ANTLR start "ruleElement1Choice"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleElement1Choice : ( ( rule__Element1Choice__Group__0 ) ) ;
    public final void ruleElement1Choice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( ( rule__Element1Choice__Group__0 ) ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__Element1Choice__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__Element1Choice__Group__0 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ( rule__Element1Choice__Group__0 )
            {
             before(grammarAccess.getElement1ChoiceAccess().getGroup()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( rule__Element1Choice__Group__0 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:188:2: rule__Element1Choice__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group__0_in_ruleElement1Choice334);
            rule__Element1Choice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElement1ChoiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement1Choice"


    // $ANTLR start "entryRuleString0"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:200:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:201:1: ( ruleString0 EOF )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: ruleString0 EOF
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: ruleString0 : ( 'String' ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:213:2: ( ( 'String' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( 'String' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( 'String' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: 'String'
            {
             before(grammarAccess.getString0Access().getStringKeyword()); 
            match(input,11,FollowSets000.FOLLOW_11_in_ruleString0395); 
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:232:1: rule__RootElementType__Group__0 : rule__RootElementType__Group__0__Impl rule__RootElementType__Group__1 ;
    public final void rule__RootElementType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:236:1: ( rule__RootElementType__Group__0__Impl rule__RootElementType__Group__1 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:237:2: rule__RootElementType__Group__0__Impl rule__RootElementType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__0__Impl_in_rule__RootElementType__Group__0430);
            rule__RootElementType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__1_in_rule__RootElementType__Group__0433);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: rule__RootElementType__Group__0__Impl : ( 'RootElementType' ) ;
    public final void rule__RootElementType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:248:1: ( ( 'RootElementType' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:249:1: ( 'RootElementType' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:249:1: ( 'RootElementType' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:250:1: 'RootElementType'
            {
             before(grammarAccess.getRootElementTypeAccess().getRootElementTypeKeyword_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__RootElementType__Group__0__Impl461); 
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:263:1: rule__RootElementType__Group__1 : rule__RootElementType__Group__1__Impl rule__RootElementType__Group__2 ;
    public final void rule__RootElementType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:267:1: ( rule__RootElementType__Group__1__Impl rule__RootElementType__Group__2 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:268:2: rule__RootElementType__Group__1__Impl rule__RootElementType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__1__Impl_in_rule__RootElementType__Group__1492);
            rule__RootElementType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__2_in_rule__RootElementType__Group__1495);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:275:1: rule__RootElementType__Group__1__Impl : ( '{' ) ;
    public final void rule__RootElementType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:279:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:280:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:280:1: ( '{' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:281:1: '{'
            {
             before(grammarAccess.getRootElementTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__RootElementType__Group__1__Impl523); 
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:294:1: rule__RootElementType__Group__2 : rule__RootElementType__Group__2__Impl rule__RootElementType__Group__3 ;
    public final void rule__RootElementType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( rule__RootElementType__Group__2__Impl rule__RootElementType__Group__3 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:299:2: rule__RootElementType__Group__2__Impl rule__RootElementType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__2__Impl_in_rule__RootElementType__Group__2554);
            rule__RootElementType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__3_in_rule__RootElementType__Group__2557);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:306:1: rule__RootElementType__Group__2__Impl : ( 'element1' ) ;
    public final void rule__RootElementType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:310:1: ( ( 'element1' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:311:1: ( 'element1' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:311:1: ( 'element1' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:312:1: 'element1'
            {
             before(grammarAccess.getRootElementTypeAccess().getElement1Keyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__RootElementType__Group__2__Impl585); 
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:325:1: rule__RootElementType__Group__3 : rule__RootElementType__Group__3__Impl rule__RootElementType__Group__4 ;
    public final void rule__RootElementType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:329:1: ( rule__RootElementType__Group__3__Impl rule__RootElementType__Group__4 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:330:2: rule__RootElementType__Group__3__Impl rule__RootElementType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__3__Impl_in_rule__RootElementType__Group__3616);
            rule__RootElementType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__4_in_rule__RootElementType__Group__3619);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:337:1: rule__RootElementType__Group__3__Impl : ( ( rule__RootElementType__Element1Assignment_3 ) ) ;
    public final void rule__RootElementType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:341:1: ( ( ( rule__RootElementType__Element1Assignment_3 ) ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: ( ( rule__RootElementType__Element1Assignment_3 ) )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: ( ( rule__RootElementType__Element1Assignment_3 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:343:1: ( rule__RootElementType__Element1Assignment_3 )
            {
             before(grammarAccess.getRootElementTypeAccess().getElement1Assignment_3()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:344:1: ( rule__RootElementType__Element1Assignment_3 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:344:2: rule__RootElementType__Element1Assignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Element1Assignment_3_in_rule__RootElementType__Group__3__Impl646);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: rule__RootElementType__Group__4 : rule__RootElementType__Group__4__Impl rule__RootElementType__Group__5 ;
    public final void rule__RootElementType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:358:1: ( rule__RootElementType__Group__4__Impl rule__RootElementType__Group__5 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:359:2: rule__RootElementType__Group__4__Impl rule__RootElementType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__4__Impl_in_rule__RootElementType__Group__4676);
            rule__RootElementType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__5_in_rule__RootElementType__Group__4679);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:366:1: rule__RootElementType__Group__4__Impl : ( 'element2' ) ;
    public final void rule__RootElementType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:370:1: ( ( 'element2' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:371:1: ( 'element2' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:371:1: ( 'element2' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:372:1: 'element2'
            {
             before(grammarAccess.getRootElementTypeAccess().getElement2Keyword_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__RootElementType__Group__4__Impl707); 
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:385:1: rule__RootElementType__Group__5 : rule__RootElementType__Group__5__Impl rule__RootElementType__Group__6 ;
    public final void rule__RootElementType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:389:1: ( rule__RootElementType__Group__5__Impl rule__RootElementType__Group__6 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:390:2: rule__RootElementType__Group__5__Impl rule__RootElementType__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__5__Impl_in_rule__RootElementType__Group__5738);
            rule__RootElementType__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__6_in_rule__RootElementType__Group__5741);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:397:1: rule__RootElementType__Group__5__Impl : ( ( rule__RootElementType__Element2Assignment_5 ) ) ;
    public final void rule__RootElementType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:401:1: ( ( ( rule__RootElementType__Element2Assignment_5 ) ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:402:1: ( ( rule__RootElementType__Element2Assignment_5 ) )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:402:1: ( ( rule__RootElementType__Element2Assignment_5 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:403:1: ( rule__RootElementType__Element2Assignment_5 )
            {
             before(grammarAccess.getRootElementTypeAccess().getElement2Assignment_5()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:404:1: ( rule__RootElementType__Element2Assignment_5 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:404:2: rule__RootElementType__Element2Assignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Element2Assignment_5_in_rule__RootElementType__Group__5__Impl768);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:414:1: rule__RootElementType__Group__6 : rule__RootElementType__Group__6__Impl rule__RootElementType__Group__7 ;
    public final void rule__RootElementType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:418:1: ( rule__RootElementType__Group__6__Impl rule__RootElementType__Group__7 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:419:2: rule__RootElementType__Group__6__Impl rule__RootElementType__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__6__Impl_in_rule__RootElementType__Group__6798);
            rule__RootElementType__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__7_in_rule__RootElementType__Group__6801);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:426:1: rule__RootElementType__Group__6__Impl : ( 'element3' ) ;
    public final void rule__RootElementType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:430:1: ( ( 'element3' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:431:1: ( 'element3' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:431:1: ( 'element3' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:432:1: 'element3'
            {
             before(grammarAccess.getRootElementTypeAccess().getElement3Keyword_6()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__RootElementType__Group__6__Impl829); 
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:445:1: rule__RootElementType__Group__7 : rule__RootElementType__Group__7__Impl rule__RootElementType__Group__8 ;
    public final void rule__RootElementType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:449:1: ( rule__RootElementType__Group__7__Impl rule__RootElementType__Group__8 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:450:2: rule__RootElementType__Group__7__Impl rule__RootElementType__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__7__Impl_in_rule__RootElementType__Group__7860);
            rule__RootElementType__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__8_in_rule__RootElementType__Group__7863);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:457:1: rule__RootElementType__Group__7__Impl : ( ( rule__RootElementType__Element3Assignment_7 ) ) ;
    public final void rule__RootElementType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:461:1: ( ( ( rule__RootElementType__Element3Assignment_7 ) ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:462:1: ( ( rule__RootElementType__Element3Assignment_7 ) )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:462:1: ( ( rule__RootElementType__Element3Assignment_7 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:463:1: ( rule__RootElementType__Element3Assignment_7 )
            {
             before(grammarAccess.getRootElementTypeAccess().getElement3Assignment_7()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:464:1: ( rule__RootElementType__Element3Assignment_7 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:464:2: rule__RootElementType__Element3Assignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Element3Assignment_7_in_rule__RootElementType__Group__7__Impl890);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:474:1: rule__RootElementType__Group__8 : rule__RootElementType__Group__8__Impl ;
    public final void rule__RootElementType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:478:1: ( rule__RootElementType__Group__8__Impl )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:479:2: rule__RootElementType__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__8__Impl_in_rule__RootElementType__Group__8920);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:485:1: rule__RootElementType__Group__8__Impl : ( '}' ) ;
    public final void rule__RootElementType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:489:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:490:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:490:1: ( '}' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:491:1: '}'
            {
             before(grammarAccess.getRootElementTypeAccess().getRightCurlyBracketKeyword_8()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__RootElementType__Group__8__Impl948); 
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:522:1: rule__Element1__Group__0 : rule__Element1__Group__0__Impl rule__Element1__Group__1 ;
    public final void rule__Element1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:526:1: ( rule__Element1__Group__0__Impl rule__Element1__Group__1 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:527:2: rule__Element1__Group__0__Impl rule__Element1__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__0__Impl_in_rule__Element1__Group__0997);
            rule__Element1__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__1_in_rule__Element1__Group__01000);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:534:1: rule__Element1__Group__0__Impl : ( () ) ;
    public final void rule__Element1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:538:1: ( ( () ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:539:1: ( () )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:539:1: ( () )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:540:1: ()
            {
             before(grammarAccess.getElement1Access().getElement1Action_0()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:541:1: ()
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:543:1: 
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:553:1: rule__Element1__Group__1 : rule__Element1__Group__1__Impl rule__Element1__Group__2 ;
    public final void rule__Element1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:557:1: ( rule__Element1__Group__1__Impl rule__Element1__Group__2 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:558:2: rule__Element1__Group__1__Impl rule__Element1__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__1__Impl_in_rule__Element1__Group__11058);
            rule__Element1__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__2_in_rule__Element1__Group__11061);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:565:1: rule__Element1__Group__1__Impl : ( 'Element1' ) ;
    public final void rule__Element1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:569:1: ( ( 'Element1' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:570:1: ( 'Element1' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:570:1: ( 'Element1' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:571:1: 'Element1'
            {
             before(grammarAccess.getElement1Access().getElement1Keyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Element1__Group__1__Impl1089); 
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:584:1: rule__Element1__Group__2 : rule__Element1__Group__2__Impl rule__Element1__Group__3 ;
    public final void rule__Element1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:588:1: ( rule__Element1__Group__2__Impl rule__Element1__Group__3 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:589:2: rule__Element1__Group__2__Impl rule__Element1__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__2__Impl_in_rule__Element1__Group__21120);
            rule__Element1__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__3_in_rule__Element1__Group__21123);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:596:1: rule__Element1__Group__2__Impl : ( '{' ) ;
    public final void rule__Element1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:600:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:601:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:601:1: ( '{' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:602:1: '{'
            {
             before(grammarAccess.getElement1Access().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Element1__Group__2__Impl1151); 
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:615:1: rule__Element1__Group__3 : rule__Element1__Group__3__Impl rule__Element1__Group__4 ;
    public final void rule__Element1__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:619:1: ( rule__Element1__Group__3__Impl rule__Element1__Group__4 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:620:2: rule__Element1__Group__3__Impl rule__Element1__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__3__Impl_in_rule__Element1__Group__31182);
            rule__Element1__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__4_in_rule__Element1__Group__31185);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:627:1: rule__Element1__Group__3__Impl : ( ( rule__Element1__Group_3__0 )? ) ;
    public final void rule__Element1__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:631:1: ( ( ( rule__Element1__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:632:1: ( ( rule__Element1__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:632:1: ( ( rule__Element1__Group_3__0 )? )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:633:1: ( rule__Element1__Group_3__0 )?
            {
             before(grammarAccess.getElement1Access().getGroup_3()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:634:1: ( rule__Element1__Group_3__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:634:2: rule__Element1__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Element1__Group_3__0_in_rule__Element1__Group__3__Impl1212);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:644:1: rule__Element1__Group__4 : rule__Element1__Group__4__Impl ;
    public final void rule__Element1__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:648:1: ( rule__Element1__Group__4__Impl )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:649:2: rule__Element1__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__4__Impl_in_rule__Element1__Group__41243);
            rule__Element1__Group__4__Impl();

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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:655:1: rule__Element1__Group__4__Impl : ( '}' ) ;
    public final void rule__Element1__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:659:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:660:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:660:1: ( '}' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:661:1: '}'
            {
             before(grammarAccess.getElement1Access().getRightCurlyBracketKeyword_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Element1__Group__4__Impl1271); 
             after(grammarAccess.getElement1Access().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Element1__Group_3__0"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:684:1: rule__Element1__Group_3__0 : rule__Element1__Group_3__0__Impl rule__Element1__Group_3__1 ;
    public final void rule__Element1__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:688:1: ( rule__Element1__Group_3__0__Impl rule__Element1__Group_3__1 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:689:2: rule__Element1__Group_3__0__Impl rule__Element1__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group_3__0__Impl_in_rule__Element1__Group_3__01312);
            rule__Element1__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group_3__1_in_rule__Element1__Group_3__01315);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:696:1: rule__Element1__Group_3__0__Impl : ( 'element1Choice' ) ;
    public final void rule__Element1__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:700:1: ( ( 'element1Choice' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:701:1: ( 'element1Choice' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:701:1: ( 'element1Choice' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:702:1: 'element1Choice'
            {
             before(grammarAccess.getElement1Access().getElement1ChoiceKeyword_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Element1__Group_3__0__Impl1343); 
             after(grammarAccess.getElement1Access().getElement1ChoiceKeyword_3_0()); 

            }


            }

        }
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:715:1: rule__Element1__Group_3__1 : rule__Element1__Group_3__1__Impl ;
    public final void rule__Element1__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:719:1: ( rule__Element1__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:720:2: rule__Element1__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group_3__1__Impl_in_rule__Element1__Group_3__11374);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:726:1: rule__Element1__Group_3__1__Impl : ( ( rule__Element1__Element1ChoiceAssignment_3_1 ) ) ;
    public final void rule__Element1__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:730:1: ( ( ( rule__Element1__Element1ChoiceAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:731:1: ( ( rule__Element1__Element1ChoiceAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:731:1: ( ( rule__Element1__Element1ChoiceAssignment_3_1 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:732:1: ( rule__Element1__Element1ChoiceAssignment_3_1 )
            {
             before(grammarAccess.getElement1Access().getElement1ChoiceAssignment_3_1()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:733:1: ( rule__Element1__Element1ChoiceAssignment_3_1 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:733:2: rule__Element1__Element1ChoiceAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__Element1ChoiceAssignment_3_1_in_rule__Element1__Group_3__1__Impl1401);
            rule__Element1__Element1ChoiceAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getElement1Access().getElement1ChoiceAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Element2__Group__0"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:747:1: rule__Element2__Group__0 : rule__Element2__Group__0__Impl rule__Element2__Group__1 ;
    public final void rule__Element2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:751:1: ( rule__Element2__Group__0__Impl rule__Element2__Group__1 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:752:2: rule__Element2__Group__0__Impl rule__Element2__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__0__Impl_in_rule__Element2__Group__01435);
            rule__Element2__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__1_in_rule__Element2__Group__01438);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:759:1: rule__Element2__Group__0__Impl : ( 'Element2' ) ;
    public final void rule__Element2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:763:1: ( ( 'Element2' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:764:1: ( 'Element2' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:764:1: ( 'Element2' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:765:1: 'Element2'
            {
             before(grammarAccess.getElement2Access().getElement2Keyword_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Element2__Group__0__Impl1466); 
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:778:1: rule__Element2__Group__1 : rule__Element2__Group__1__Impl rule__Element2__Group__2 ;
    public final void rule__Element2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:782:1: ( rule__Element2__Group__1__Impl rule__Element2__Group__2 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:783:2: rule__Element2__Group__1__Impl rule__Element2__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__1__Impl_in_rule__Element2__Group__11497);
            rule__Element2__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__2_in_rule__Element2__Group__11500);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:790:1: rule__Element2__Group__1__Impl : ( '{' ) ;
    public final void rule__Element2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:794:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:795:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:795:1: ( '{' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:796:1: '{'
            {
             before(grammarAccess.getElement2Access().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Element2__Group__1__Impl1528); 
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:809:1: rule__Element2__Group__2 : rule__Element2__Group__2__Impl rule__Element2__Group__3 ;
    public final void rule__Element2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:813:1: ( rule__Element2__Group__2__Impl rule__Element2__Group__3 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:814:2: rule__Element2__Group__2__Impl rule__Element2__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__2__Impl_in_rule__Element2__Group__21559);
            rule__Element2__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__3_in_rule__Element2__Group__21562);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:821:1: rule__Element2__Group__2__Impl : ( 'modelGroupElement1' ) ;
    public final void rule__Element2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:825:1: ( ( 'modelGroupElement1' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:826:1: ( 'modelGroupElement1' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:826:1: ( 'modelGroupElement1' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:827:1: 'modelGroupElement1'
            {
             before(grammarAccess.getElement2Access().getModelGroupElement1Keyword_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Element2__Group__2__Impl1590); 
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:840:1: rule__Element2__Group__3 : rule__Element2__Group__3__Impl rule__Element2__Group__4 ;
    public final void rule__Element2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:844:1: ( rule__Element2__Group__3__Impl rule__Element2__Group__4 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:845:2: rule__Element2__Group__3__Impl rule__Element2__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__3__Impl_in_rule__Element2__Group__31621);
            rule__Element2__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__4_in_rule__Element2__Group__31624);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:852:1: rule__Element2__Group__3__Impl : ( '{' ) ;
    public final void rule__Element2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:856:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:857:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:857:1: ( '{' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:858:1: '{'
            {
             before(grammarAccess.getElement2Access().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Element2__Group__3__Impl1652); 
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:871:1: rule__Element2__Group__4 : rule__Element2__Group__4__Impl rule__Element2__Group__5 ;
    public final void rule__Element2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:875:1: ( rule__Element2__Group__4__Impl rule__Element2__Group__5 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:876:2: rule__Element2__Group__4__Impl rule__Element2__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__4__Impl_in_rule__Element2__Group__41683);
            rule__Element2__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__5_in_rule__Element2__Group__41686);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:883:1: rule__Element2__Group__4__Impl : ( ( rule__Element2__ModelGroupElement1Assignment_4 ) ) ;
    public final void rule__Element2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:887:1: ( ( ( rule__Element2__ModelGroupElement1Assignment_4 ) ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:888:1: ( ( rule__Element2__ModelGroupElement1Assignment_4 ) )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:888:1: ( ( rule__Element2__ModelGroupElement1Assignment_4 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:889:1: ( rule__Element2__ModelGroupElement1Assignment_4 )
            {
             before(grammarAccess.getElement2Access().getModelGroupElement1Assignment_4()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:890:1: ( rule__Element2__ModelGroupElement1Assignment_4 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:890:2: rule__Element2__ModelGroupElement1Assignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__ModelGroupElement1Assignment_4_in_rule__Element2__Group__4__Impl1713);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:900:1: rule__Element2__Group__5 : rule__Element2__Group__5__Impl rule__Element2__Group__6 ;
    public final void rule__Element2__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:904:1: ( rule__Element2__Group__5__Impl rule__Element2__Group__6 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:905:2: rule__Element2__Group__5__Impl rule__Element2__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__5__Impl_in_rule__Element2__Group__51743);
            rule__Element2__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__6_in_rule__Element2__Group__51746);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:912:1: rule__Element2__Group__5__Impl : ( ( rule__Element2__Group_5__0 )* ) ;
    public final void rule__Element2__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:916:1: ( ( ( rule__Element2__Group_5__0 )* ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:917:1: ( ( rule__Element2__Group_5__0 )* )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:917:1: ( ( rule__Element2__Group_5__0 )* )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:918:1: ( rule__Element2__Group_5__0 )*
            {
             before(grammarAccess.getElement2Access().getGroup_5()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:919:1: ( rule__Element2__Group_5__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==24) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:919:2: rule__Element2__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Element2__Group_5__0_in_rule__Element2__Group__5__Impl1773);
            	    rule__Element2__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:929:1: rule__Element2__Group__6 : rule__Element2__Group__6__Impl rule__Element2__Group__7 ;
    public final void rule__Element2__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:933:1: ( rule__Element2__Group__6__Impl rule__Element2__Group__7 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:934:2: rule__Element2__Group__6__Impl rule__Element2__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__6__Impl_in_rule__Element2__Group__61804);
            rule__Element2__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__7_in_rule__Element2__Group__61807);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:941:1: rule__Element2__Group__6__Impl : ( '}' ) ;
    public final void rule__Element2__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:945:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:946:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:946:1: ( '}' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:947:1: '}'
            {
             before(grammarAccess.getElement2Access().getRightCurlyBracketKeyword_6()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Element2__Group__6__Impl1835); 
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:960:1: rule__Element2__Group__7 : rule__Element2__Group__7__Impl rule__Element2__Group__8 ;
    public final void rule__Element2__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:964:1: ( rule__Element2__Group__7__Impl rule__Element2__Group__8 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:965:2: rule__Element2__Group__7__Impl rule__Element2__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__7__Impl_in_rule__Element2__Group__71866);
            rule__Element2__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__8_in_rule__Element2__Group__71869);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:972:1: rule__Element2__Group__7__Impl : ( 'modelGroupElement2' ) ;
    public final void rule__Element2__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:976:1: ( ( 'modelGroupElement2' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:977:1: ( 'modelGroupElement2' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:977:1: ( 'modelGroupElement2' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:978:1: 'modelGroupElement2'
            {
             before(grammarAccess.getElement2Access().getModelGroupElement2Keyword_7()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Element2__Group__7__Impl1897); 
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:991:1: rule__Element2__Group__8 : rule__Element2__Group__8__Impl rule__Element2__Group__9 ;
    public final void rule__Element2__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:995:1: ( rule__Element2__Group__8__Impl rule__Element2__Group__9 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:996:2: rule__Element2__Group__8__Impl rule__Element2__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__8__Impl_in_rule__Element2__Group__81928);
            rule__Element2__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__9_in_rule__Element2__Group__81931);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1003:1: rule__Element2__Group__8__Impl : ( ( rule__Element2__ModelGroupElement2Assignment_8 ) ) ;
    public final void rule__Element2__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1007:1: ( ( ( rule__Element2__ModelGroupElement2Assignment_8 ) ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1008:1: ( ( rule__Element2__ModelGroupElement2Assignment_8 ) )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1008:1: ( ( rule__Element2__ModelGroupElement2Assignment_8 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1009:1: ( rule__Element2__ModelGroupElement2Assignment_8 )
            {
             before(grammarAccess.getElement2Access().getModelGroupElement2Assignment_8()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1010:1: ( rule__Element2__ModelGroupElement2Assignment_8 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1010:2: rule__Element2__ModelGroupElement2Assignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__ModelGroupElement2Assignment_8_in_rule__Element2__Group__8__Impl1958);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1020:1: rule__Element2__Group__9 : rule__Element2__Group__9__Impl rule__Element2__Group__10 ;
    public final void rule__Element2__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1024:1: ( rule__Element2__Group__9__Impl rule__Element2__Group__10 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1025:2: rule__Element2__Group__9__Impl rule__Element2__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__9__Impl_in_rule__Element2__Group__91988);
            rule__Element2__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__10_in_rule__Element2__Group__91991);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1032:1: rule__Element2__Group__9__Impl : ( 'modelGroupElement3' ) ;
    public final void rule__Element2__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1036:1: ( ( 'modelGroupElement3' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1037:1: ( 'modelGroupElement3' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1037:1: ( 'modelGroupElement3' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1038:1: 'modelGroupElement3'
            {
             before(grammarAccess.getElement2Access().getModelGroupElement3Keyword_9()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Element2__Group__9__Impl2019); 
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1051:1: rule__Element2__Group__10 : rule__Element2__Group__10__Impl rule__Element2__Group__11 ;
    public final void rule__Element2__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1055:1: ( rule__Element2__Group__10__Impl rule__Element2__Group__11 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1056:2: rule__Element2__Group__10__Impl rule__Element2__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__10__Impl_in_rule__Element2__Group__102050);
            rule__Element2__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__11_in_rule__Element2__Group__102053);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1063:1: rule__Element2__Group__10__Impl : ( ( rule__Element2__ModelGroupElement3Assignment_10 ) ) ;
    public final void rule__Element2__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1067:1: ( ( ( rule__Element2__ModelGroupElement3Assignment_10 ) ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1068:1: ( ( rule__Element2__ModelGroupElement3Assignment_10 ) )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1068:1: ( ( rule__Element2__ModelGroupElement3Assignment_10 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1069:1: ( rule__Element2__ModelGroupElement3Assignment_10 )
            {
             before(grammarAccess.getElement2Access().getModelGroupElement3Assignment_10()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1070:1: ( rule__Element2__ModelGroupElement3Assignment_10 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1070:2: rule__Element2__ModelGroupElement3Assignment_10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__ModelGroupElement3Assignment_10_in_rule__Element2__Group__10__Impl2080);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1080:1: rule__Element2__Group__11 : rule__Element2__Group__11__Impl ;
    public final void rule__Element2__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1084:1: ( rule__Element2__Group__11__Impl )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1085:2: rule__Element2__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group__11__Impl_in_rule__Element2__Group__112110);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1091:1: rule__Element2__Group__11__Impl : ( '}' ) ;
    public final void rule__Element2__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1095:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1096:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1096:1: ( '}' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1097:1: '}'
            {
             before(grammarAccess.getElement2Access().getRightCurlyBracketKeyword_11()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Element2__Group__11__Impl2138); 
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1134:1: rule__Element2__Group_5__0 : rule__Element2__Group_5__0__Impl rule__Element2__Group_5__1 ;
    public final void rule__Element2__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1138:1: ( rule__Element2__Group_5__0__Impl rule__Element2__Group_5__1 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1139:2: rule__Element2__Group_5__0__Impl rule__Element2__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group_5__0__Impl_in_rule__Element2__Group_5__02193);
            rule__Element2__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group_5__1_in_rule__Element2__Group_5__02196);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1146:1: rule__Element2__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Element2__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1150:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1151:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1151:1: ( ',' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1152:1: ','
            {
             before(grammarAccess.getElement2Access().getCommaKeyword_5_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Element2__Group_5__0__Impl2224); 
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1165:1: rule__Element2__Group_5__1 : rule__Element2__Group_5__1__Impl ;
    public final void rule__Element2__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1169:1: ( rule__Element2__Group_5__1__Impl )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1170:2: rule__Element2__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__Group_5__1__Impl_in_rule__Element2__Group_5__12255);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1176:1: rule__Element2__Group_5__1__Impl : ( ( rule__Element2__ModelGroupElement1Assignment_5_1 ) ) ;
    public final void rule__Element2__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1180:1: ( ( ( rule__Element2__ModelGroupElement1Assignment_5_1 ) ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1181:1: ( ( rule__Element2__ModelGroupElement1Assignment_5_1 ) )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1181:1: ( ( rule__Element2__ModelGroupElement1Assignment_5_1 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1182:1: ( rule__Element2__ModelGroupElement1Assignment_5_1 )
            {
             before(grammarAccess.getElement2Access().getModelGroupElement1Assignment_5_1()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1183:1: ( rule__Element2__ModelGroupElement1Assignment_5_1 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1183:2: rule__Element2__ModelGroupElement1Assignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element2__ModelGroupElement1Assignment_5_1_in_rule__Element2__Group_5__1__Impl2282);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1197:1: rule__Element3__Group__0 : rule__Element3__Group__0__Impl rule__Element3__Group__1 ;
    public final void rule__Element3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1201:1: ( rule__Element3__Group__0__Impl rule__Element3__Group__1 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1202:2: rule__Element3__Group__0__Impl rule__Element3__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group__0__Impl_in_rule__Element3__Group__02316);
            rule__Element3__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group__1_in_rule__Element3__Group__02319);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1209:1: rule__Element3__Group__0__Impl : ( () ) ;
    public final void rule__Element3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1213:1: ( ( () ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1214:1: ( () )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1214:1: ( () )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1215:1: ()
            {
             before(grammarAccess.getElement3Access().getElement3Action_0()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1216:1: ()
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1218:1: 
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1228:1: rule__Element3__Group__1 : rule__Element3__Group__1__Impl rule__Element3__Group__2 ;
    public final void rule__Element3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1232:1: ( rule__Element3__Group__1__Impl rule__Element3__Group__2 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1233:2: rule__Element3__Group__1__Impl rule__Element3__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group__1__Impl_in_rule__Element3__Group__12377);
            rule__Element3__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group__2_in_rule__Element3__Group__12380);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1240:1: rule__Element3__Group__1__Impl : ( 'Element3' ) ;
    public final void rule__Element3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1244:1: ( ( 'Element3' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1245:1: ( 'Element3' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1245:1: ( 'Element3' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1246:1: 'Element3'
            {
             before(grammarAccess.getElement3Access().getElement3Keyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Element3__Group__1__Impl2408); 
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1259:1: rule__Element3__Group__2 : rule__Element3__Group__2__Impl rule__Element3__Group__3 ;
    public final void rule__Element3__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1263:1: ( rule__Element3__Group__2__Impl rule__Element3__Group__3 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1264:2: rule__Element3__Group__2__Impl rule__Element3__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group__2__Impl_in_rule__Element3__Group__22439);
            rule__Element3__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group__3_in_rule__Element3__Group__22442);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1271:1: rule__Element3__Group__2__Impl : ( '{' ) ;
    public final void rule__Element3__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1275:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1276:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1276:1: ( '{' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1277:1: '{'
            {
             before(grammarAccess.getElement3Access().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Element3__Group__2__Impl2470); 
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1290:1: rule__Element3__Group__3 : rule__Element3__Group__3__Impl rule__Element3__Group__4 ;
    public final void rule__Element3__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1294:1: ( rule__Element3__Group__3__Impl rule__Element3__Group__4 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1295:2: rule__Element3__Group__3__Impl rule__Element3__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group__3__Impl_in_rule__Element3__Group__32501);
            rule__Element3__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group__4_in_rule__Element3__Group__32504);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1302:1: rule__Element3__Group__3__Impl : ( ( rule__Element3__Group_3__0 )? ) ;
    public final void rule__Element3__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1306:1: ( ( ( rule__Element3__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1307:1: ( ( rule__Element3__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1307:1: ( ( rule__Element3__Group_3__0 )? )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1308:1: ( rule__Element3__Group_3__0 )?
            {
             before(grammarAccess.getElement3Access().getGroup_3()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1309:1: ( rule__Element3__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1309:2: rule__Element3__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_3__0_in_rule__Element3__Group__3__Impl2531);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1319:1: rule__Element3__Group__4 : rule__Element3__Group__4__Impl rule__Element3__Group__5 ;
    public final void rule__Element3__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1323:1: ( rule__Element3__Group__4__Impl rule__Element3__Group__5 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1324:2: rule__Element3__Group__4__Impl rule__Element3__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group__4__Impl_in_rule__Element3__Group__42562);
            rule__Element3__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group__5_in_rule__Element3__Group__42565);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1331:1: rule__Element3__Group__4__Impl : ( ( rule__Element3__Group_4__0 )? ) ;
    public final void rule__Element3__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1335:1: ( ( ( rule__Element3__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1336:1: ( ( rule__Element3__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1336:1: ( ( rule__Element3__Group_4__0 )? )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1337:1: ( rule__Element3__Group_4__0 )?
            {
             before(grammarAccess.getElement3Access().getGroup_4()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1338:1: ( rule__Element3__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1338:2: rule__Element3__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_4__0_in_rule__Element3__Group__4__Impl2592);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1348:1: rule__Element3__Group__5 : rule__Element3__Group__5__Impl rule__Element3__Group__6 ;
    public final void rule__Element3__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1352:1: ( rule__Element3__Group__5__Impl rule__Element3__Group__6 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1353:2: rule__Element3__Group__5__Impl rule__Element3__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group__5__Impl_in_rule__Element3__Group__52623);
            rule__Element3__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group__6_in_rule__Element3__Group__52626);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1360:1: rule__Element3__Group__5__Impl : ( ( rule__Element3__Group_5__0 )? ) ;
    public final void rule__Element3__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1364:1: ( ( ( rule__Element3__Group_5__0 )? ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1365:1: ( ( rule__Element3__Group_5__0 )? )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1365:1: ( ( rule__Element3__Group_5__0 )? )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1366:1: ( rule__Element3__Group_5__0 )?
            {
             before(grammarAccess.getElement3Access().getGroup_5()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1367:1: ( rule__Element3__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1367:2: rule__Element3__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_5__0_in_rule__Element3__Group__5__Impl2653);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1377:1: rule__Element3__Group__6 : rule__Element3__Group__6__Impl ;
    public final void rule__Element3__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1381:1: ( rule__Element3__Group__6__Impl )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1382:2: rule__Element3__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group__6__Impl_in_rule__Element3__Group__62684);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1388:1: rule__Element3__Group__6__Impl : ( '}' ) ;
    public final void rule__Element3__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1392:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1393:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1393:1: ( '}' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1394:1: '}'
            {
             before(grammarAccess.getElement3Access().getRightCurlyBracketKeyword_6()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Element3__Group__6__Impl2712); 
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1421:1: rule__Element3__Group_3__0 : rule__Element3__Group_3__0__Impl rule__Element3__Group_3__1 ;
    public final void rule__Element3__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1425:1: ( rule__Element3__Group_3__0__Impl rule__Element3__Group_3__1 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1426:2: rule__Element3__Group_3__0__Impl rule__Element3__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_3__0__Impl_in_rule__Element3__Group_3__02757);
            rule__Element3__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_3__1_in_rule__Element3__Group_3__02760);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1433:1: rule__Element3__Group_3__0__Impl : ( 'repeatableElement1' ) ;
    public final void rule__Element3__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1437:1: ( ( 'repeatableElement1' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1438:1: ( 'repeatableElement1' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1438:1: ( 'repeatableElement1' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1439:1: 'repeatableElement1'
            {
             before(grammarAccess.getElement3Access().getRepeatableElement1Keyword_3_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Element3__Group_3__0__Impl2788); 
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1452:1: rule__Element3__Group_3__1 : rule__Element3__Group_3__1__Impl rule__Element3__Group_3__2 ;
    public final void rule__Element3__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1456:1: ( rule__Element3__Group_3__1__Impl rule__Element3__Group_3__2 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1457:2: rule__Element3__Group_3__1__Impl rule__Element3__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_3__1__Impl_in_rule__Element3__Group_3__12819);
            rule__Element3__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_3__2_in_rule__Element3__Group_3__12822);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1464:1: rule__Element3__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Element3__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1468:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1469:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1469:1: ( '{' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1470:1: '{'
            {
             before(grammarAccess.getElement3Access().getLeftCurlyBracketKeyword_3_1()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Element3__Group_3__1__Impl2850); 
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1483:1: rule__Element3__Group_3__2 : rule__Element3__Group_3__2__Impl rule__Element3__Group_3__3 ;
    public final void rule__Element3__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1487:1: ( rule__Element3__Group_3__2__Impl rule__Element3__Group_3__3 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1488:2: rule__Element3__Group_3__2__Impl rule__Element3__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_3__2__Impl_in_rule__Element3__Group_3__22881);
            rule__Element3__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_3__3_in_rule__Element3__Group_3__22884);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1495:1: rule__Element3__Group_3__2__Impl : ( ( rule__Element3__RepeatableElement1Assignment_3_2 ) ) ;
    public final void rule__Element3__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1499:1: ( ( ( rule__Element3__RepeatableElement1Assignment_3_2 ) ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1500:1: ( ( rule__Element3__RepeatableElement1Assignment_3_2 ) )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1500:1: ( ( rule__Element3__RepeatableElement1Assignment_3_2 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1501:1: ( rule__Element3__RepeatableElement1Assignment_3_2 )
            {
             before(grammarAccess.getElement3Access().getRepeatableElement1Assignment_3_2()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1502:1: ( rule__Element3__RepeatableElement1Assignment_3_2 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1502:2: rule__Element3__RepeatableElement1Assignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__RepeatableElement1Assignment_3_2_in_rule__Element3__Group_3__2__Impl2911);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1512:1: rule__Element3__Group_3__3 : rule__Element3__Group_3__3__Impl rule__Element3__Group_3__4 ;
    public final void rule__Element3__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1516:1: ( rule__Element3__Group_3__3__Impl rule__Element3__Group_3__4 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1517:2: rule__Element3__Group_3__3__Impl rule__Element3__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_3__3__Impl_in_rule__Element3__Group_3__32941);
            rule__Element3__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_3__4_in_rule__Element3__Group_3__32944);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1524:1: rule__Element3__Group_3__3__Impl : ( ( rule__Element3__Group_3_3__0 )* ) ;
    public final void rule__Element3__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1528:1: ( ( ( rule__Element3__Group_3_3__0 )* ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1529:1: ( ( rule__Element3__Group_3_3__0 )* )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1529:1: ( ( rule__Element3__Group_3_3__0 )* )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1530:1: ( rule__Element3__Group_3_3__0 )*
            {
             before(grammarAccess.getElement3Access().getGroup_3_3()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1531:1: ( rule__Element3__Group_3_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1531:2: rule__Element3__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_3_3__0_in_rule__Element3__Group_3__3__Impl2971);
            	    rule__Element3__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1541:1: rule__Element3__Group_3__4 : rule__Element3__Group_3__4__Impl ;
    public final void rule__Element3__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1545:1: ( rule__Element3__Group_3__4__Impl )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1546:2: rule__Element3__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_3__4__Impl_in_rule__Element3__Group_3__43002);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1552:1: rule__Element3__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Element3__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1556:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1557:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1557:1: ( '}' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1558:1: '}'
            {
             before(grammarAccess.getElement3Access().getRightCurlyBracketKeyword_3_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Element3__Group_3__4__Impl3030); 
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1581:1: rule__Element3__Group_3_3__0 : rule__Element3__Group_3_3__0__Impl rule__Element3__Group_3_3__1 ;
    public final void rule__Element3__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1585:1: ( rule__Element3__Group_3_3__0__Impl rule__Element3__Group_3_3__1 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1586:2: rule__Element3__Group_3_3__0__Impl rule__Element3__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_3_3__0__Impl_in_rule__Element3__Group_3_3__03071);
            rule__Element3__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_3_3__1_in_rule__Element3__Group_3_3__03074);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1593:1: rule__Element3__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Element3__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1597:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1598:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1598:1: ( ',' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1599:1: ','
            {
             before(grammarAccess.getElement3Access().getCommaKeyword_3_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Element3__Group_3_3__0__Impl3102); 
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1612:1: rule__Element3__Group_3_3__1 : rule__Element3__Group_3_3__1__Impl ;
    public final void rule__Element3__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1616:1: ( rule__Element3__Group_3_3__1__Impl )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1617:2: rule__Element3__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_3_3__1__Impl_in_rule__Element3__Group_3_3__13133);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1623:1: rule__Element3__Group_3_3__1__Impl : ( ( rule__Element3__RepeatableElement1Assignment_3_3_1 ) ) ;
    public final void rule__Element3__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1627:1: ( ( ( rule__Element3__RepeatableElement1Assignment_3_3_1 ) ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1628:1: ( ( rule__Element3__RepeatableElement1Assignment_3_3_1 ) )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1628:1: ( ( rule__Element3__RepeatableElement1Assignment_3_3_1 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1629:1: ( rule__Element3__RepeatableElement1Assignment_3_3_1 )
            {
             before(grammarAccess.getElement3Access().getRepeatableElement1Assignment_3_3_1()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1630:1: ( rule__Element3__RepeatableElement1Assignment_3_3_1 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1630:2: rule__Element3__RepeatableElement1Assignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__RepeatableElement1Assignment_3_3_1_in_rule__Element3__Group_3_3__1__Impl3160);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1644:1: rule__Element3__Group_4__0 : rule__Element3__Group_4__0__Impl rule__Element3__Group_4__1 ;
    public final void rule__Element3__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1648:1: ( rule__Element3__Group_4__0__Impl rule__Element3__Group_4__1 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1649:2: rule__Element3__Group_4__0__Impl rule__Element3__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_4__0__Impl_in_rule__Element3__Group_4__03194);
            rule__Element3__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_4__1_in_rule__Element3__Group_4__03197);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1656:1: rule__Element3__Group_4__0__Impl : ( 'repeatableElement2' ) ;
    public final void rule__Element3__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1660:1: ( ( 'repeatableElement2' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1661:1: ( 'repeatableElement2' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1661:1: ( 'repeatableElement2' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1662:1: 'repeatableElement2'
            {
             before(grammarAccess.getElement3Access().getRepeatableElement2Keyword_4_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Element3__Group_4__0__Impl3225); 
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1675:1: rule__Element3__Group_4__1 : rule__Element3__Group_4__1__Impl ;
    public final void rule__Element3__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1679:1: ( rule__Element3__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1680:2: rule__Element3__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_4__1__Impl_in_rule__Element3__Group_4__13256);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1686:1: rule__Element3__Group_4__1__Impl : ( ( rule__Element3__RepeatableElement2Assignment_4_1 ) ) ;
    public final void rule__Element3__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1690:1: ( ( ( rule__Element3__RepeatableElement2Assignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1691:1: ( ( rule__Element3__RepeatableElement2Assignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1691:1: ( ( rule__Element3__RepeatableElement2Assignment_4_1 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1692:1: ( rule__Element3__RepeatableElement2Assignment_4_1 )
            {
             before(grammarAccess.getElement3Access().getRepeatableElement2Assignment_4_1()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1693:1: ( rule__Element3__RepeatableElement2Assignment_4_1 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1693:2: rule__Element3__RepeatableElement2Assignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__RepeatableElement2Assignment_4_1_in_rule__Element3__Group_4__1__Impl3283);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1707:1: rule__Element3__Group_5__0 : rule__Element3__Group_5__0__Impl rule__Element3__Group_5__1 ;
    public final void rule__Element3__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1711:1: ( rule__Element3__Group_5__0__Impl rule__Element3__Group_5__1 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1712:2: rule__Element3__Group_5__0__Impl rule__Element3__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_5__0__Impl_in_rule__Element3__Group_5__03317);
            rule__Element3__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_5__1_in_rule__Element3__Group_5__03320);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1719:1: rule__Element3__Group_5__0__Impl : ( 'repeatableElement3' ) ;
    public final void rule__Element3__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1723:1: ( ( 'repeatableElement3' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1724:1: ( 'repeatableElement3' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1724:1: ( 'repeatableElement3' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1725:1: 'repeatableElement3'
            {
             before(grammarAccess.getElement3Access().getRepeatableElement3Keyword_5_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Element3__Group_5__0__Impl3348); 
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1738:1: rule__Element3__Group_5__1 : rule__Element3__Group_5__1__Impl ;
    public final void rule__Element3__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1742:1: ( rule__Element3__Group_5__1__Impl )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1743:2: rule__Element3__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__Group_5__1__Impl_in_rule__Element3__Group_5__13379);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1749:1: rule__Element3__Group_5__1__Impl : ( ( rule__Element3__RepeatableElement3Assignment_5_1 ) ) ;
    public final void rule__Element3__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1753:1: ( ( ( rule__Element3__RepeatableElement3Assignment_5_1 ) ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1754:1: ( ( rule__Element3__RepeatableElement3Assignment_5_1 ) )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1754:1: ( ( rule__Element3__RepeatableElement3Assignment_5_1 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1755:1: ( rule__Element3__RepeatableElement3Assignment_5_1 )
            {
             before(grammarAccess.getElement3Access().getRepeatableElement3Assignment_5_1()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1756:1: ( rule__Element3__RepeatableElement3Assignment_5_1 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1756:2: rule__Element3__RepeatableElement3Assignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element3__RepeatableElement3Assignment_5_1_in_rule__Element3__Group_5__1__Impl3406);
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


    // $ANTLR start "rule__Element1Choice__Group__0"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1770:1: rule__Element1Choice__Group__0 : rule__Element1Choice__Group__0__Impl rule__Element1Choice__Group__1 ;
    public final void rule__Element1Choice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1774:1: ( rule__Element1Choice__Group__0__Impl rule__Element1Choice__Group__1 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1775:2: rule__Element1Choice__Group__0__Impl rule__Element1Choice__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group__0__Impl_in_rule__Element1Choice__Group__03440);
            rule__Element1Choice__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group__1_in_rule__Element1Choice__Group__03443);
            rule__Element1Choice__Group__1();

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
    // $ANTLR end "rule__Element1Choice__Group__0"


    // $ANTLR start "rule__Element1Choice__Group__0__Impl"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1782:1: rule__Element1Choice__Group__0__Impl : ( () ) ;
    public final void rule__Element1Choice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1786:1: ( ( () ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1787:1: ( () )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1787:1: ( () )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1788:1: ()
            {
             before(grammarAccess.getElement1ChoiceAccess().getElement1ChoiceAction_0()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1789:1: ()
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1791:1: 
            {
            }

             after(grammarAccess.getElement1ChoiceAccess().getElement1ChoiceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__Group__0__Impl"


    // $ANTLR start "rule__Element1Choice__Group__1"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1801:1: rule__Element1Choice__Group__1 : rule__Element1Choice__Group__1__Impl rule__Element1Choice__Group__2 ;
    public final void rule__Element1Choice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1805:1: ( rule__Element1Choice__Group__1__Impl rule__Element1Choice__Group__2 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1806:2: rule__Element1Choice__Group__1__Impl rule__Element1Choice__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group__1__Impl_in_rule__Element1Choice__Group__13501);
            rule__Element1Choice__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group__2_in_rule__Element1Choice__Group__13504);
            rule__Element1Choice__Group__2();

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
    // $ANTLR end "rule__Element1Choice__Group__1"


    // $ANTLR start "rule__Element1Choice__Group__1__Impl"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1813:1: rule__Element1Choice__Group__1__Impl : ( 'Element1Choice' ) ;
    public final void rule__Element1Choice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1817:1: ( ( 'Element1Choice' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1818:1: ( 'Element1Choice' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1818:1: ( 'Element1Choice' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1819:1: 'Element1Choice'
            {
             before(grammarAccess.getElement1ChoiceAccess().getElement1ChoiceKeyword_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Element1Choice__Group__1__Impl3532); 
             after(grammarAccess.getElement1ChoiceAccess().getElement1ChoiceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__Group__1__Impl"


    // $ANTLR start "rule__Element1Choice__Group__2"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1832:1: rule__Element1Choice__Group__2 : rule__Element1Choice__Group__2__Impl rule__Element1Choice__Group__3 ;
    public final void rule__Element1Choice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1836:1: ( rule__Element1Choice__Group__2__Impl rule__Element1Choice__Group__3 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1837:2: rule__Element1Choice__Group__2__Impl rule__Element1Choice__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group__2__Impl_in_rule__Element1Choice__Group__23563);
            rule__Element1Choice__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group__3_in_rule__Element1Choice__Group__23566);
            rule__Element1Choice__Group__3();

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
    // $ANTLR end "rule__Element1Choice__Group__2"


    // $ANTLR start "rule__Element1Choice__Group__2__Impl"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1844:1: rule__Element1Choice__Group__2__Impl : ( '{' ) ;
    public final void rule__Element1Choice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1848:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1849:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1849:1: ( '{' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1850:1: '{'
            {
             before(grammarAccess.getElement1ChoiceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Element1Choice__Group__2__Impl3594); 
             after(grammarAccess.getElement1ChoiceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__Group__2__Impl"


    // $ANTLR start "rule__Element1Choice__Group__3"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1863:1: rule__Element1Choice__Group__3 : rule__Element1Choice__Group__3__Impl rule__Element1Choice__Group__4 ;
    public final void rule__Element1Choice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1867:1: ( rule__Element1Choice__Group__3__Impl rule__Element1Choice__Group__4 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1868:2: rule__Element1Choice__Group__3__Impl rule__Element1Choice__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group__3__Impl_in_rule__Element1Choice__Group__33625);
            rule__Element1Choice__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group__4_in_rule__Element1Choice__Group__33628);
            rule__Element1Choice__Group__4();

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
    // $ANTLR end "rule__Element1Choice__Group__3"


    // $ANTLR start "rule__Element1Choice__Group__3__Impl"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1875:1: rule__Element1Choice__Group__3__Impl : ( ( rule__Element1Choice__Group_3__0 )? ) ;
    public final void rule__Element1Choice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1879:1: ( ( ( rule__Element1Choice__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1880:1: ( ( rule__Element1Choice__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1880:1: ( ( rule__Element1Choice__Group_3__0 )? )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1881:1: ( rule__Element1Choice__Group_3__0 )?
            {
             before(grammarAccess.getElement1ChoiceAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1882:1: ( rule__Element1Choice__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1882:2: rule__Element1Choice__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_3__0_in_rule__Element1Choice__Group__3__Impl3655);
                    rule__Element1Choice__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElement1ChoiceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__Group__3__Impl"


    // $ANTLR start "rule__Element1Choice__Group__4"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1892:1: rule__Element1Choice__Group__4 : rule__Element1Choice__Group__4__Impl rule__Element1Choice__Group__5 ;
    public final void rule__Element1Choice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1896:1: ( rule__Element1Choice__Group__4__Impl rule__Element1Choice__Group__5 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1897:2: rule__Element1Choice__Group__4__Impl rule__Element1Choice__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group__4__Impl_in_rule__Element1Choice__Group__43686);
            rule__Element1Choice__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group__5_in_rule__Element1Choice__Group__43689);
            rule__Element1Choice__Group__5();

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
    // $ANTLR end "rule__Element1Choice__Group__4"


    // $ANTLR start "rule__Element1Choice__Group__4__Impl"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1904:1: rule__Element1Choice__Group__4__Impl : ( ( rule__Element1Choice__Group_4__0 )? ) ;
    public final void rule__Element1Choice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1908:1: ( ( ( rule__Element1Choice__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1909:1: ( ( rule__Element1Choice__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1909:1: ( ( rule__Element1Choice__Group_4__0 )? )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1910:1: ( rule__Element1Choice__Group_4__0 )?
            {
             before(grammarAccess.getElement1ChoiceAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1911:1: ( rule__Element1Choice__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1911:2: rule__Element1Choice__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_4__0_in_rule__Element1Choice__Group__4__Impl3716);
                    rule__Element1Choice__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElement1ChoiceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__Group__4__Impl"


    // $ANTLR start "rule__Element1Choice__Group__5"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1921:1: rule__Element1Choice__Group__5 : rule__Element1Choice__Group__5__Impl rule__Element1Choice__Group__6 ;
    public final void rule__Element1Choice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1925:1: ( rule__Element1Choice__Group__5__Impl rule__Element1Choice__Group__6 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1926:2: rule__Element1Choice__Group__5__Impl rule__Element1Choice__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group__5__Impl_in_rule__Element1Choice__Group__53747);
            rule__Element1Choice__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group__6_in_rule__Element1Choice__Group__53750);
            rule__Element1Choice__Group__6();

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
    // $ANTLR end "rule__Element1Choice__Group__5"


    // $ANTLR start "rule__Element1Choice__Group__5__Impl"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1933:1: rule__Element1Choice__Group__5__Impl : ( ( rule__Element1Choice__Group_5__0 )? ) ;
    public final void rule__Element1Choice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1937:1: ( ( ( rule__Element1Choice__Group_5__0 )? ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1938:1: ( ( rule__Element1Choice__Group_5__0 )? )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1938:1: ( ( rule__Element1Choice__Group_5__0 )? )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1939:1: ( rule__Element1Choice__Group_5__0 )?
            {
             before(grammarAccess.getElement1ChoiceAccess().getGroup_5()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1940:1: ( rule__Element1Choice__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1940:2: rule__Element1Choice__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_5__0_in_rule__Element1Choice__Group__5__Impl3777);
                    rule__Element1Choice__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElement1ChoiceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__Group__5__Impl"


    // $ANTLR start "rule__Element1Choice__Group__6"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1950:1: rule__Element1Choice__Group__6 : rule__Element1Choice__Group__6__Impl ;
    public final void rule__Element1Choice__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1954:1: ( rule__Element1Choice__Group__6__Impl )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1955:2: rule__Element1Choice__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group__6__Impl_in_rule__Element1Choice__Group__63808);
            rule__Element1Choice__Group__6__Impl();

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
    // $ANTLR end "rule__Element1Choice__Group__6"


    // $ANTLR start "rule__Element1Choice__Group__6__Impl"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1961:1: rule__Element1Choice__Group__6__Impl : ( '}' ) ;
    public final void rule__Element1Choice__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1965:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1966:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1966:1: ( '}' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1967:1: '}'
            {
             before(grammarAccess.getElement1ChoiceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Element1Choice__Group__6__Impl3836); 
             after(grammarAccess.getElement1ChoiceAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__Group__6__Impl"


    // $ANTLR start "rule__Element1Choice__Group_3__0"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1994:1: rule__Element1Choice__Group_3__0 : rule__Element1Choice__Group_3__0__Impl rule__Element1Choice__Group_3__1 ;
    public final void rule__Element1Choice__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1998:1: ( rule__Element1Choice__Group_3__0__Impl rule__Element1Choice__Group_3__1 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:1999:2: rule__Element1Choice__Group_3__0__Impl rule__Element1Choice__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_3__0__Impl_in_rule__Element1Choice__Group_3__03881);
            rule__Element1Choice__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_3__1_in_rule__Element1Choice__Group_3__03884);
            rule__Element1Choice__Group_3__1();

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
    // $ANTLR end "rule__Element1Choice__Group_3__0"


    // $ANTLR start "rule__Element1Choice__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2006:1: rule__Element1Choice__Group_3__0__Impl : ( 'repeatableElement1' ) ;
    public final void rule__Element1Choice__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2010:1: ( ( 'repeatableElement1' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2011:1: ( 'repeatableElement1' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2011:1: ( 'repeatableElement1' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2012:1: 'repeatableElement1'
            {
             before(grammarAccess.getElement1ChoiceAccess().getRepeatableElement1Keyword_3_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Element1Choice__Group_3__0__Impl3912); 
             after(grammarAccess.getElement1ChoiceAccess().getRepeatableElement1Keyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__Group_3__0__Impl"


    // $ANTLR start "rule__Element1Choice__Group_3__1"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2025:1: rule__Element1Choice__Group_3__1 : rule__Element1Choice__Group_3__1__Impl rule__Element1Choice__Group_3__2 ;
    public final void rule__Element1Choice__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2029:1: ( rule__Element1Choice__Group_3__1__Impl rule__Element1Choice__Group_3__2 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2030:2: rule__Element1Choice__Group_3__1__Impl rule__Element1Choice__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_3__1__Impl_in_rule__Element1Choice__Group_3__13943);
            rule__Element1Choice__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_3__2_in_rule__Element1Choice__Group_3__13946);
            rule__Element1Choice__Group_3__2();

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
    // $ANTLR end "rule__Element1Choice__Group_3__1"


    // $ANTLR start "rule__Element1Choice__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2037:1: rule__Element1Choice__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Element1Choice__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2041:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2042:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2042:1: ( '{' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2043:1: '{'
            {
             before(grammarAccess.getElement1ChoiceAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Element1Choice__Group_3__1__Impl3974); 
             after(grammarAccess.getElement1ChoiceAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__Group_3__1__Impl"


    // $ANTLR start "rule__Element1Choice__Group_3__2"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2056:1: rule__Element1Choice__Group_3__2 : rule__Element1Choice__Group_3__2__Impl rule__Element1Choice__Group_3__3 ;
    public final void rule__Element1Choice__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2060:1: ( rule__Element1Choice__Group_3__2__Impl rule__Element1Choice__Group_3__3 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2061:2: rule__Element1Choice__Group_3__2__Impl rule__Element1Choice__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_3__2__Impl_in_rule__Element1Choice__Group_3__24005);
            rule__Element1Choice__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_3__3_in_rule__Element1Choice__Group_3__24008);
            rule__Element1Choice__Group_3__3();

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
    // $ANTLR end "rule__Element1Choice__Group_3__2"


    // $ANTLR start "rule__Element1Choice__Group_3__2__Impl"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2068:1: rule__Element1Choice__Group_3__2__Impl : ( ( rule__Element1Choice__RepeatableElement1Assignment_3_2 ) ) ;
    public final void rule__Element1Choice__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2072:1: ( ( ( rule__Element1Choice__RepeatableElement1Assignment_3_2 ) ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2073:1: ( ( rule__Element1Choice__RepeatableElement1Assignment_3_2 ) )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2073:1: ( ( rule__Element1Choice__RepeatableElement1Assignment_3_2 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2074:1: ( rule__Element1Choice__RepeatableElement1Assignment_3_2 )
            {
             before(grammarAccess.getElement1ChoiceAccess().getRepeatableElement1Assignment_3_2()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2075:1: ( rule__Element1Choice__RepeatableElement1Assignment_3_2 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2075:2: rule__Element1Choice__RepeatableElement1Assignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__RepeatableElement1Assignment_3_2_in_rule__Element1Choice__Group_3__2__Impl4035);
            rule__Element1Choice__RepeatableElement1Assignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getElement1ChoiceAccess().getRepeatableElement1Assignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__Group_3__2__Impl"


    // $ANTLR start "rule__Element1Choice__Group_3__3"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2085:1: rule__Element1Choice__Group_3__3 : rule__Element1Choice__Group_3__3__Impl rule__Element1Choice__Group_3__4 ;
    public final void rule__Element1Choice__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2089:1: ( rule__Element1Choice__Group_3__3__Impl rule__Element1Choice__Group_3__4 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2090:2: rule__Element1Choice__Group_3__3__Impl rule__Element1Choice__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_3__3__Impl_in_rule__Element1Choice__Group_3__34065);
            rule__Element1Choice__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_3__4_in_rule__Element1Choice__Group_3__34068);
            rule__Element1Choice__Group_3__4();

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
    // $ANTLR end "rule__Element1Choice__Group_3__3"


    // $ANTLR start "rule__Element1Choice__Group_3__3__Impl"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2097:1: rule__Element1Choice__Group_3__3__Impl : ( ( rule__Element1Choice__Group_3_3__0 )* ) ;
    public final void rule__Element1Choice__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2101:1: ( ( ( rule__Element1Choice__Group_3_3__0 )* ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2102:1: ( ( rule__Element1Choice__Group_3_3__0 )* )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2102:1: ( ( rule__Element1Choice__Group_3_3__0 )* )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2103:1: ( rule__Element1Choice__Group_3_3__0 )*
            {
             before(grammarAccess.getElement1ChoiceAccess().getGroup_3_3()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2104:1: ( rule__Element1Choice__Group_3_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2104:2: rule__Element1Choice__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_3_3__0_in_rule__Element1Choice__Group_3__3__Impl4095);
            	    rule__Element1Choice__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getElement1ChoiceAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__Group_3__3__Impl"


    // $ANTLR start "rule__Element1Choice__Group_3__4"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2114:1: rule__Element1Choice__Group_3__4 : rule__Element1Choice__Group_3__4__Impl ;
    public final void rule__Element1Choice__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2118:1: ( rule__Element1Choice__Group_3__4__Impl )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2119:2: rule__Element1Choice__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_3__4__Impl_in_rule__Element1Choice__Group_3__44126);
            rule__Element1Choice__Group_3__4__Impl();

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
    // $ANTLR end "rule__Element1Choice__Group_3__4"


    // $ANTLR start "rule__Element1Choice__Group_3__4__Impl"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2125:1: rule__Element1Choice__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Element1Choice__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2129:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2130:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2130:1: ( '}' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2131:1: '}'
            {
             before(grammarAccess.getElement1ChoiceAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Element1Choice__Group_3__4__Impl4154); 
             after(grammarAccess.getElement1ChoiceAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__Group_3__4__Impl"


    // $ANTLR start "rule__Element1Choice__Group_3_3__0"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2154:1: rule__Element1Choice__Group_3_3__0 : rule__Element1Choice__Group_3_3__0__Impl rule__Element1Choice__Group_3_3__1 ;
    public final void rule__Element1Choice__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2158:1: ( rule__Element1Choice__Group_3_3__0__Impl rule__Element1Choice__Group_3_3__1 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2159:2: rule__Element1Choice__Group_3_3__0__Impl rule__Element1Choice__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_3_3__0__Impl_in_rule__Element1Choice__Group_3_3__04195);
            rule__Element1Choice__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_3_3__1_in_rule__Element1Choice__Group_3_3__04198);
            rule__Element1Choice__Group_3_3__1();

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
    // $ANTLR end "rule__Element1Choice__Group_3_3__0"


    // $ANTLR start "rule__Element1Choice__Group_3_3__0__Impl"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2166:1: rule__Element1Choice__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Element1Choice__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2170:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2171:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2171:1: ( ',' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2172:1: ','
            {
             before(grammarAccess.getElement1ChoiceAccess().getCommaKeyword_3_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Element1Choice__Group_3_3__0__Impl4226); 
             after(grammarAccess.getElement1ChoiceAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__Group_3_3__0__Impl"


    // $ANTLR start "rule__Element1Choice__Group_3_3__1"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2185:1: rule__Element1Choice__Group_3_3__1 : rule__Element1Choice__Group_3_3__1__Impl ;
    public final void rule__Element1Choice__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2189:1: ( rule__Element1Choice__Group_3_3__1__Impl )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2190:2: rule__Element1Choice__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_3_3__1__Impl_in_rule__Element1Choice__Group_3_3__14257);
            rule__Element1Choice__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__Element1Choice__Group_3_3__1"


    // $ANTLR start "rule__Element1Choice__Group_3_3__1__Impl"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2196:1: rule__Element1Choice__Group_3_3__1__Impl : ( ( rule__Element1Choice__RepeatableElement1Assignment_3_3_1 ) ) ;
    public final void rule__Element1Choice__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2200:1: ( ( ( rule__Element1Choice__RepeatableElement1Assignment_3_3_1 ) ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2201:1: ( ( rule__Element1Choice__RepeatableElement1Assignment_3_3_1 ) )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2201:1: ( ( rule__Element1Choice__RepeatableElement1Assignment_3_3_1 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2202:1: ( rule__Element1Choice__RepeatableElement1Assignment_3_3_1 )
            {
             before(grammarAccess.getElement1ChoiceAccess().getRepeatableElement1Assignment_3_3_1()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2203:1: ( rule__Element1Choice__RepeatableElement1Assignment_3_3_1 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2203:2: rule__Element1Choice__RepeatableElement1Assignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__RepeatableElement1Assignment_3_3_1_in_rule__Element1Choice__Group_3_3__1__Impl4284);
            rule__Element1Choice__RepeatableElement1Assignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getElement1ChoiceAccess().getRepeatableElement1Assignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__Group_3_3__1__Impl"


    // $ANTLR start "rule__Element1Choice__Group_4__0"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2217:1: rule__Element1Choice__Group_4__0 : rule__Element1Choice__Group_4__0__Impl rule__Element1Choice__Group_4__1 ;
    public final void rule__Element1Choice__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2221:1: ( rule__Element1Choice__Group_4__0__Impl rule__Element1Choice__Group_4__1 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2222:2: rule__Element1Choice__Group_4__0__Impl rule__Element1Choice__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_4__0__Impl_in_rule__Element1Choice__Group_4__04318);
            rule__Element1Choice__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_4__1_in_rule__Element1Choice__Group_4__04321);
            rule__Element1Choice__Group_4__1();

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
    // $ANTLR end "rule__Element1Choice__Group_4__0"


    // $ANTLR start "rule__Element1Choice__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2229:1: rule__Element1Choice__Group_4__0__Impl : ( 'repeatableElement2' ) ;
    public final void rule__Element1Choice__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2233:1: ( ( 'repeatableElement2' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2234:1: ( 'repeatableElement2' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2234:1: ( 'repeatableElement2' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2235:1: 'repeatableElement2'
            {
             before(grammarAccess.getElement1ChoiceAccess().getRepeatableElement2Keyword_4_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Element1Choice__Group_4__0__Impl4349); 
             after(grammarAccess.getElement1ChoiceAccess().getRepeatableElement2Keyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__Group_4__0__Impl"


    // $ANTLR start "rule__Element1Choice__Group_4__1"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2248:1: rule__Element1Choice__Group_4__1 : rule__Element1Choice__Group_4__1__Impl rule__Element1Choice__Group_4__2 ;
    public final void rule__Element1Choice__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2252:1: ( rule__Element1Choice__Group_4__1__Impl rule__Element1Choice__Group_4__2 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2253:2: rule__Element1Choice__Group_4__1__Impl rule__Element1Choice__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_4__1__Impl_in_rule__Element1Choice__Group_4__14380);
            rule__Element1Choice__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_4__2_in_rule__Element1Choice__Group_4__14383);
            rule__Element1Choice__Group_4__2();

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
    // $ANTLR end "rule__Element1Choice__Group_4__1"


    // $ANTLR start "rule__Element1Choice__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2260:1: rule__Element1Choice__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Element1Choice__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2264:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2265:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2265:1: ( '{' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2266:1: '{'
            {
             before(grammarAccess.getElement1ChoiceAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Element1Choice__Group_4__1__Impl4411); 
             after(grammarAccess.getElement1ChoiceAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__Group_4__1__Impl"


    // $ANTLR start "rule__Element1Choice__Group_4__2"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2279:1: rule__Element1Choice__Group_4__2 : rule__Element1Choice__Group_4__2__Impl rule__Element1Choice__Group_4__3 ;
    public final void rule__Element1Choice__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2283:1: ( rule__Element1Choice__Group_4__2__Impl rule__Element1Choice__Group_4__3 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2284:2: rule__Element1Choice__Group_4__2__Impl rule__Element1Choice__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_4__2__Impl_in_rule__Element1Choice__Group_4__24442);
            rule__Element1Choice__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_4__3_in_rule__Element1Choice__Group_4__24445);
            rule__Element1Choice__Group_4__3();

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
    // $ANTLR end "rule__Element1Choice__Group_4__2"


    // $ANTLR start "rule__Element1Choice__Group_4__2__Impl"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2291:1: rule__Element1Choice__Group_4__2__Impl : ( ( rule__Element1Choice__RepeatableElement2Assignment_4_2 ) ) ;
    public final void rule__Element1Choice__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2295:1: ( ( ( rule__Element1Choice__RepeatableElement2Assignment_4_2 ) ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2296:1: ( ( rule__Element1Choice__RepeatableElement2Assignment_4_2 ) )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2296:1: ( ( rule__Element1Choice__RepeatableElement2Assignment_4_2 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2297:1: ( rule__Element1Choice__RepeatableElement2Assignment_4_2 )
            {
             before(grammarAccess.getElement1ChoiceAccess().getRepeatableElement2Assignment_4_2()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2298:1: ( rule__Element1Choice__RepeatableElement2Assignment_4_2 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2298:2: rule__Element1Choice__RepeatableElement2Assignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__RepeatableElement2Assignment_4_2_in_rule__Element1Choice__Group_4__2__Impl4472);
            rule__Element1Choice__RepeatableElement2Assignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getElement1ChoiceAccess().getRepeatableElement2Assignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__Group_4__2__Impl"


    // $ANTLR start "rule__Element1Choice__Group_4__3"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2308:1: rule__Element1Choice__Group_4__3 : rule__Element1Choice__Group_4__3__Impl rule__Element1Choice__Group_4__4 ;
    public final void rule__Element1Choice__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2312:1: ( rule__Element1Choice__Group_4__3__Impl rule__Element1Choice__Group_4__4 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2313:2: rule__Element1Choice__Group_4__3__Impl rule__Element1Choice__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_4__3__Impl_in_rule__Element1Choice__Group_4__34502);
            rule__Element1Choice__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_4__4_in_rule__Element1Choice__Group_4__34505);
            rule__Element1Choice__Group_4__4();

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
    // $ANTLR end "rule__Element1Choice__Group_4__3"


    // $ANTLR start "rule__Element1Choice__Group_4__3__Impl"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2320:1: rule__Element1Choice__Group_4__3__Impl : ( ( rule__Element1Choice__Group_4_3__0 )* ) ;
    public final void rule__Element1Choice__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2324:1: ( ( ( rule__Element1Choice__Group_4_3__0 )* ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2325:1: ( ( rule__Element1Choice__Group_4_3__0 )* )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2325:1: ( ( rule__Element1Choice__Group_4_3__0 )* )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2326:1: ( rule__Element1Choice__Group_4_3__0 )*
            {
             before(grammarAccess.getElement1ChoiceAccess().getGroup_4_3()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2327:1: ( rule__Element1Choice__Group_4_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2327:2: rule__Element1Choice__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_4_3__0_in_rule__Element1Choice__Group_4__3__Impl4532);
            	    rule__Element1Choice__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getElement1ChoiceAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__Group_4__3__Impl"


    // $ANTLR start "rule__Element1Choice__Group_4__4"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2337:1: rule__Element1Choice__Group_4__4 : rule__Element1Choice__Group_4__4__Impl ;
    public final void rule__Element1Choice__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2341:1: ( rule__Element1Choice__Group_4__4__Impl )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2342:2: rule__Element1Choice__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_4__4__Impl_in_rule__Element1Choice__Group_4__44563);
            rule__Element1Choice__Group_4__4__Impl();

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
    // $ANTLR end "rule__Element1Choice__Group_4__4"


    // $ANTLR start "rule__Element1Choice__Group_4__4__Impl"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2348:1: rule__Element1Choice__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Element1Choice__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2352:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2353:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2353:1: ( '}' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2354:1: '}'
            {
             before(grammarAccess.getElement1ChoiceAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Element1Choice__Group_4__4__Impl4591); 
             after(grammarAccess.getElement1ChoiceAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__Group_4__4__Impl"


    // $ANTLR start "rule__Element1Choice__Group_4_3__0"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2377:1: rule__Element1Choice__Group_4_3__0 : rule__Element1Choice__Group_4_3__0__Impl rule__Element1Choice__Group_4_3__1 ;
    public final void rule__Element1Choice__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2381:1: ( rule__Element1Choice__Group_4_3__0__Impl rule__Element1Choice__Group_4_3__1 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2382:2: rule__Element1Choice__Group_4_3__0__Impl rule__Element1Choice__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_4_3__0__Impl_in_rule__Element1Choice__Group_4_3__04632);
            rule__Element1Choice__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_4_3__1_in_rule__Element1Choice__Group_4_3__04635);
            rule__Element1Choice__Group_4_3__1();

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
    // $ANTLR end "rule__Element1Choice__Group_4_3__0"


    // $ANTLR start "rule__Element1Choice__Group_4_3__0__Impl"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2389:1: rule__Element1Choice__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Element1Choice__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2393:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2394:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2394:1: ( ',' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2395:1: ','
            {
             before(grammarAccess.getElement1ChoiceAccess().getCommaKeyword_4_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Element1Choice__Group_4_3__0__Impl4663); 
             after(grammarAccess.getElement1ChoiceAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__Group_4_3__0__Impl"


    // $ANTLR start "rule__Element1Choice__Group_4_3__1"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2408:1: rule__Element1Choice__Group_4_3__1 : rule__Element1Choice__Group_4_3__1__Impl ;
    public final void rule__Element1Choice__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2412:1: ( rule__Element1Choice__Group_4_3__1__Impl )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2413:2: rule__Element1Choice__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_4_3__1__Impl_in_rule__Element1Choice__Group_4_3__14694);
            rule__Element1Choice__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Element1Choice__Group_4_3__1"


    // $ANTLR start "rule__Element1Choice__Group_4_3__1__Impl"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2419:1: rule__Element1Choice__Group_4_3__1__Impl : ( ( rule__Element1Choice__RepeatableElement2Assignment_4_3_1 ) ) ;
    public final void rule__Element1Choice__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2423:1: ( ( ( rule__Element1Choice__RepeatableElement2Assignment_4_3_1 ) ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2424:1: ( ( rule__Element1Choice__RepeatableElement2Assignment_4_3_1 ) )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2424:1: ( ( rule__Element1Choice__RepeatableElement2Assignment_4_3_1 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2425:1: ( rule__Element1Choice__RepeatableElement2Assignment_4_3_1 )
            {
             before(grammarAccess.getElement1ChoiceAccess().getRepeatableElement2Assignment_4_3_1()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2426:1: ( rule__Element1Choice__RepeatableElement2Assignment_4_3_1 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2426:2: rule__Element1Choice__RepeatableElement2Assignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__RepeatableElement2Assignment_4_3_1_in_rule__Element1Choice__Group_4_3__1__Impl4721);
            rule__Element1Choice__RepeatableElement2Assignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getElement1ChoiceAccess().getRepeatableElement2Assignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__Group_4_3__1__Impl"


    // $ANTLR start "rule__Element1Choice__Group_5__0"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2440:1: rule__Element1Choice__Group_5__0 : rule__Element1Choice__Group_5__0__Impl rule__Element1Choice__Group_5__1 ;
    public final void rule__Element1Choice__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2444:1: ( rule__Element1Choice__Group_5__0__Impl rule__Element1Choice__Group_5__1 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2445:2: rule__Element1Choice__Group_5__0__Impl rule__Element1Choice__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_5__0__Impl_in_rule__Element1Choice__Group_5__04755);
            rule__Element1Choice__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_5__1_in_rule__Element1Choice__Group_5__04758);
            rule__Element1Choice__Group_5__1();

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
    // $ANTLR end "rule__Element1Choice__Group_5__0"


    // $ANTLR start "rule__Element1Choice__Group_5__0__Impl"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2452:1: rule__Element1Choice__Group_5__0__Impl : ( 'repeatableElement3' ) ;
    public final void rule__Element1Choice__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2456:1: ( ( 'repeatableElement3' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2457:1: ( 'repeatableElement3' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2457:1: ( 'repeatableElement3' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2458:1: 'repeatableElement3'
            {
             before(grammarAccess.getElement1ChoiceAccess().getRepeatableElement3Keyword_5_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Element1Choice__Group_5__0__Impl4786); 
             after(grammarAccess.getElement1ChoiceAccess().getRepeatableElement3Keyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__Group_5__0__Impl"


    // $ANTLR start "rule__Element1Choice__Group_5__1"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2471:1: rule__Element1Choice__Group_5__1 : rule__Element1Choice__Group_5__1__Impl rule__Element1Choice__Group_5__2 ;
    public final void rule__Element1Choice__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2475:1: ( rule__Element1Choice__Group_5__1__Impl rule__Element1Choice__Group_5__2 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2476:2: rule__Element1Choice__Group_5__1__Impl rule__Element1Choice__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_5__1__Impl_in_rule__Element1Choice__Group_5__14817);
            rule__Element1Choice__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_5__2_in_rule__Element1Choice__Group_5__14820);
            rule__Element1Choice__Group_5__2();

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
    // $ANTLR end "rule__Element1Choice__Group_5__1"


    // $ANTLR start "rule__Element1Choice__Group_5__1__Impl"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2483:1: rule__Element1Choice__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Element1Choice__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2487:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2488:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2488:1: ( '{' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2489:1: '{'
            {
             before(grammarAccess.getElement1ChoiceAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Element1Choice__Group_5__1__Impl4848); 
             after(grammarAccess.getElement1ChoiceAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__Group_5__1__Impl"


    // $ANTLR start "rule__Element1Choice__Group_5__2"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2502:1: rule__Element1Choice__Group_5__2 : rule__Element1Choice__Group_5__2__Impl rule__Element1Choice__Group_5__3 ;
    public final void rule__Element1Choice__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2506:1: ( rule__Element1Choice__Group_5__2__Impl rule__Element1Choice__Group_5__3 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2507:2: rule__Element1Choice__Group_5__2__Impl rule__Element1Choice__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_5__2__Impl_in_rule__Element1Choice__Group_5__24879);
            rule__Element1Choice__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_5__3_in_rule__Element1Choice__Group_5__24882);
            rule__Element1Choice__Group_5__3();

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
    // $ANTLR end "rule__Element1Choice__Group_5__2"


    // $ANTLR start "rule__Element1Choice__Group_5__2__Impl"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2514:1: rule__Element1Choice__Group_5__2__Impl : ( ( rule__Element1Choice__RepeatableElement3Assignment_5_2 ) ) ;
    public final void rule__Element1Choice__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2518:1: ( ( ( rule__Element1Choice__RepeatableElement3Assignment_5_2 ) ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2519:1: ( ( rule__Element1Choice__RepeatableElement3Assignment_5_2 ) )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2519:1: ( ( rule__Element1Choice__RepeatableElement3Assignment_5_2 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2520:1: ( rule__Element1Choice__RepeatableElement3Assignment_5_2 )
            {
             before(grammarAccess.getElement1ChoiceAccess().getRepeatableElement3Assignment_5_2()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2521:1: ( rule__Element1Choice__RepeatableElement3Assignment_5_2 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2521:2: rule__Element1Choice__RepeatableElement3Assignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__RepeatableElement3Assignment_5_2_in_rule__Element1Choice__Group_5__2__Impl4909);
            rule__Element1Choice__RepeatableElement3Assignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getElement1ChoiceAccess().getRepeatableElement3Assignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__Group_5__2__Impl"


    // $ANTLR start "rule__Element1Choice__Group_5__3"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2531:1: rule__Element1Choice__Group_5__3 : rule__Element1Choice__Group_5__3__Impl rule__Element1Choice__Group_5__4 ;
    public final void rule__Element1Choice__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2535:1: ( rule__Element1Choice__Group_5__3__Impl rule__Element1Choice__Group_5__4 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2536:2: rule__Element1Choice__Group_5__3__Impl rule__Element1Choice__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_5__3__Impl_in_rule__Element1Choice__Group_5__34939);
            rule__Element1Choice__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_5__4_in_rule__Element1Choice__Group_5__34942);
            rule__Element1Choice__Group_5__4();

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
    // $ANTLR end "rule__Element1Choice__Group_5__3"


    // $ANTLR start "rule__Element1Choice__Group_5__3__Impl"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2543:1: rule__Element1Choice__Group_5__3__Impl : ( ( rule__Element1Choice__Group_5_3__0 )* ) ;
    public final void rule__Element1Choice__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2547:1: ( ( ( rule__Element1Choice__Group_5_3__0 )* ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2548:1: ( ( rule__Element1Choice__Group_5_3__0 )* )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2548:1: ( ( rule__Element1Choice__Group_5_3__0 )* )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2549:1: ( rule__Element1Choice__Group_5_3__0 )*
            {
             before(grammarAccess.getElement1ChoiceAccess().getGroup_5_3()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2550:1: ( rule__Element1Choice__Group_5_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2550:2: rule__Element1Choice__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_5_3__0_in_rule__Element1Choice__Group_5__3__Impl4969);
            	    rule__Element1Choice__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getElement1ChoiceAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__Group_5__3__Impl"


    // $ANTLR start "rule__Element1Choice__Group_5__4"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2560:1: rule__Element1Choice__Group_5__4 : rule__Element1Choice__Group_5__4__Impl ;
    public final void rule__Element1Choice__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2564:1: ( rule__Element1Choice__Group_5__4__Impl )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2565:2: rule__Element1Choice__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_5__4__Impl_in_rule__Element1Choice__Group_5__45000);
            rule__Element1Choice__Group_5__4__Impl();

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
    // $ANTLR end "rule__Element1Choice__Group_5__4"


    // $ANTLR start "rule__Element1Choice__Group_5__4__Impl"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2571:1: rule__Element1Choice__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Element1Choice__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2575:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2576:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2576:1: ( '}' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2577:1: '}'
            {
             before(grammarAccess.getElement1ChoiceAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Element1Choice__Group_5__4__Impl5028); 
             after(grammarAccess.getElement1ChoiceAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__Group_5__4__Impl"


    // $ANTLR start "rule__Element1Choice__Group_5_3__0"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2600:1: rule__Element1Choice__Group_5_3__0 : rule__Element1Choice__Group_5_3__0__Impl rule__Element1Choice__Group_5_3__1 ;
    public final void rule__Element1Choice__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2604:1: ( rule__Element1Choice__Group_5_3__0__Impl rule__Element1Choice__Group_5_3__1 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2605:2: rule__Element1Choice__Group_5_3__0__Impl rule__Element1Choice__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_5_3__0__Impl_in_rule__Element1Choice__Group_5_3__05069);
            rule__Element1Choice__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_5_3__1_in_rule__Element1Choice__Group_5_3__05072);
            rule__Element1Choice__Group_5_3__1();

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
    // $ANTLR end "rule__Element1Choice__Group_5_3__0"


    // $ANTLR start "rule__Element1Choice__Group_5_3__0__Impl"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2612:1: rule__Element1Choice__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Element1Choice__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2616:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2617:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2617:1: ( ',' )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2618:1: ','
            {
             before(grammarAccess.getElement1ChoiceAccess().getCommaKeyword_5_3_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Element1Choice__Group_5_3__0__Impl5100); 
             after(grammarAccess.getElement1ChoiceAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__Group_5_3__0__Impl"


    // $ANTLR start "rule__Element1Choice__Group_5_3__1"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2631:1: rule__Element1Choice__Group_5_3__1 : rule__Element1Choice__Group_5_3__1__Impl ;
    public final void rule__Element1Choice__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2635:1: ( rule__Element1Choice__Group_5_3__1__Impl )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2636:2: rule__Element1Choice__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__Group_5_3__1__Impl_in_rule__Element1Choice__Group_5_3__15131);
            rule__Element1Choice__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Element1Choice__Group_5_3__1"


    // $ANTLR start "rule__Element1Choice__Group_5_3__1__Impl"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2642:1: rule__Element1Choice__Group_5_3__1__Impl : ( ( rule__Element1Choice__RepeatableElement3Assignment_5_3_1 ) ) ;
    public final void rule__Element1Choice__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2646:1: ( ( ( rule__Element1Choice__RepeatableElement3Assignment_5_3_1 ) ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2647:1: ( ( rule__Element1Choice__RepeatableElement3Assignment_5_3_1 ) )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2647:1: ( ( rule__Element1Choice__RepeatableElement3Assignment_5_3_1 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2648:1: ( rule__Element1Choice__RepeatableElement3Assignment_5_3_1 )
            {
             before(grammarAccess.getElement1ChoiceAccess().getRepeatableElement3Assignment_5_3_1()); 
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2649:1: ( rule__Element1Choice__RepeatableElement3Assignment_5_3_1 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2649:2: rule__Element1Choice__RepeatableElement3Assignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1Choice__RepeatableElement3Assignment_5_3_1_in_rule__Element1Choice__Group_5_3__1__Impl5158);
            rule__Element1Choice__RepeatableElement3Assignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getElement1ChoiceAccess().getRepeatableElement3Assignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__Group_5_3__1__Impl"


    // $ANTLR start "rule__RootElementType__Element1Assignment_3"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2664:1: rule__RootElementType__Element1Assignment_3 : ( ruleElement1 ) ;
    public final void rule__RootElementType__Element1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2668:1: ( ( ruleElement1 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2669:1: ( ruleElement1 )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2669:1: ( ruleElement1 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2670:1: ruleElement1
            {
             before(grammarAccess.getRootElementTypeAccess().getElement1Element1ParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement1_in_rule__RootElementType__Element1Assignment_35197);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2679:1: rule__RootElementType__Element2Assignment_5 : ( ruleElement2 ) ;
    public final void rule__RootElementType__Element2Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2683:1: ( ( ruleElement2 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2684:1: ( ruleElement2 )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2684:1: ( ruleElement2 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2685:1: ruleElement2
            {
             before(grammarAccess.getRootElementTypeAccess().getElement2Element2ParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement2_in_rule__RootElementType__Element2Assignment_55228);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2694:1: rule__RootElementType__Element3Assignment_7 : ( ruleElement3 ) ;
    public final void rule__RootElementType__Element3Assignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2698:1: ( ( ruleElement3 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2699:1: ( ruleElement3 )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2699:1: ( ruleElement3 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2700:1: ruleElement3
            {
             before(grammarAccess.getRootElementTypeAccess().getElement3Element3ParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement3_in_rule__RootElementType__Element3Assignment_75259);
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


    // $ANTLR start "rule__Element1__Element1ChoiceAssignment_3_1"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2709:1: rule__Element1__Element1ChoiceAssignment_3_1 : ( ruleElement1Choice ) ;
    public final void rule__Element1__Element1ChoiceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2713:1: ( ( ruleElement1Choice ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2714:1: ( ruleElement1Choice )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2714:1: ( ruleElement1Choice )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2715:1: ruleElement1Choice
            {
             before(grammarAccess.getElement1Access().getElement1ChoiceElement1ChoiceParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement1Choice_in_rule__Element1__Element1ChoiceAssignment_3_15290);
            ruleElement1Choice();

            state._fsp--;

             after(grammarAccess.getElement1Access().getElement1ChoiceElement1ChoiceParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1__Element1ChoiceAssignment_3_1"


    // $ANTLR start "rule__Element2__ModelGroupElement1Assignment_4"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2724:1: rule__Element2__ModelGroupElement1Assignment_4 : ( ruleString0 ) ;
    public final void rule__Element2__ModelGroupElement1Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2728:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2729:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2729:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2730:1: ruleString0
            {
             before(grammarAccess.getElement2Access().getModelGroupElement1String0ParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Element2__ModelGroupElement1Assignment_45321);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2739:1: rule__Element2__ModelGroupElement1Assignment_5_1 : ( ruleString0 ) ;
    public final void rule__Element2__ModelGroupElement1Assignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2743:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2744:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2744:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2745:1: ruleString0
            {
             before(grammarAccess.getElement2Access().getModelGroupElement1String0ParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Element2__ModelGroupElement1Assignment_5_15352);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2754:1: rule__Element2__ModelGroupElement2Assignment_8 : ( ruleString0 ) ;
    public final void rule__Element2__ModelGroupElement2Assignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2758:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2759:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2759:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2760:1: ruleString0
            {
             before(grammarAccess.getElement2Access().getModelGroupElement2String0ParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Element2__ModelGroupElement2Assignment_85383);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2769:1: rule__Element2__ModelGroupElement3Assignment_10 : ( ruleString0 ) ;
    public final void rule__Element2__ModelGroupElement3Assignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2773:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2774:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2774:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2775:1: ruleString0
            {
             before(grammarAccess.getElement2Access().getModelGroupElement3String0ParserRuleCall_10_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Element2__ModelGroupElement3Assignment_105414);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2784:1: rule__Element3__RepeatableElement1Assignment_3_2 : ( ruleString0 ) ;
    public final void rule__Element3__RepeatableElement1Assignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2788:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2789:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2789:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2790:1: ruleString0
            {
             before(grammarAccess.getElement3Access().getRepeatableElement1String0ParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Element3__RepeatableElement1Assignment_3_25445);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2799:1: rule__Element3__RepeatableElement1Assignment_3_3_1 : ( ruleString0 ) ;
    public final void rule__Element3__RepeatableElement1Assignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2803:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2804:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2804:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2805:1: ruleString0
            {
             before(grammarAccess.getElement3Access().getRepeatableElement1String0ParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Element3__RepeatableElement1Assignment_3_3_15476);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2814:1: rule__Element3__RepeatableElement2Assignment_4_1 : ( ruleString0 ) ;
    public final void rule__Element3__RepeatableElement2Assignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2818:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2819:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2819:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2820:1: ruleString0
            {
             before(grammarAccess.getElement3Access().getRepeatableElement2String0ParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Element3__RepeatableElement2Assignment_4_15507);
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
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2829:1: rule__Element3__RepeatableElement3Assignment_5_1 : ( ruleString0 ) ;
    public final void rule__Element3__RepeatableElement3Assignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2833:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2834:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2834:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2835:1: ruleString0
            {
             before(grammarAccess.getElement3Access().getRepeatableElement3String0ParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Element3__RepeatableElement3Assignment_5_15538);
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


    // $ANTLR start "rule__Element1Choice__RepeatableElement1Assignment_3_2"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2844:1: rule__Element1Choice__RepeatableElement1Assignment_3_2 : ( ruleString0 ) ;
    public final void rule__Element1Choice__RepeatableElement1Assignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2848:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2849:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2849:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2850:1: ruleString0
            {
             before(grammarAccess.getElement1ChoiceAccess().getRepeatableElement1String0ParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Element1Choice__RepeatableElement1Assignment_3_25569);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getElement1ChoiceAccess().getRepeatableElement1String0ParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__RepeatableElement1Assignment_3_2"


    // $ANTLR start "rule__Element1Choice__RepeatableElement1Assignment_3_3_1"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2859:1: rule__Element1Choice__RepeatableElement1Assignment_3_3_1 : ( ruleString0 ) ;
    public final void rule__Element1Choice__RepeatableElement1Assignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2863:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2864:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2864:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2865:1: ruleString0
            {
             before(grammarAccess.getElement1ChoiceAccess().getRepeatableElement1String0ParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Element1Choice__RepeatableElement1Assignment_3_3_15600);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getElement1ChoiceAccess().getRepeatableElement1String0ParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__RepeatableElement1Assignment_3_3_1"


    // $ANTLR start "rule__Element1Choice__RepeatableElement2Assignment_4_2"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2874:1: rule__Element1Choice__RepeatableElement2Assignment_4_2 : ( ruleString0 ) ;
    public final void rule__Element1Choice__RepeatableElement2Assignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2878:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2879:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2879:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2880:1: ruleString0
            {
             before(grammarAccess.getElement1ChoiceAccess().getRepeatableElement2String0ParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Element1Choice__RepeatableElement2Assignment_4_25631);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getElement1ChoiceAccess().getRepeatableElement2String0ParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__RepeatableElement2Assignment_4_2"


    // $ANTLR start "rule__Element1Choice__RepeatableElement2Assignment_4_3_1"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2889:1: rule__Element1Choice__RepeatableElement2Assignment_4_3_1 : ( ruleString0 ) ;
    public final void rule__Element1Choice__RepeatableElement2Assignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2893:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2894:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2894:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2895:1: ruleString0
            {
             before(grammarAccess.getElement1ChoiceAccess().getRepeatableElement2String0ParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Element1Choice__RepeatableElement2Assignment_4_3_15662);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getElement1ChoiceAccess().getRepeatableElement2String0ParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__RepeatableElement2Assignment_4_3_1"


    // $ANTLR start "rule__Element1Choice__RepeatableElement3Assignment_5_2"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2904:1: rule__Element1Choice__RepeatableElement3Assignment_5_2 : ( ruleString0 ) ;
    public final void rule__Element1Choice__RepeatableElement3Assignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2908:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2909:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2909:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2910:1: ruleString0
            {
             before(grammarAccess.getElement1ChoiceAccess().getRepeatableElement3String0ParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Element1Choice__RepeatableElement3Assignment_5_25693);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getElement1ChoiceAccess().getRepeatableElement3String0ParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__RepeatableElement3Assignment_5_2"


    // $ANTLR start "rule__Element1Choice__RepeatableElement3Assignment_5_3_1"
    // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2919:1: rule__Element1Choice__RepeatableElement3Assignment_5_3_1 : ( ruleString0 ) ;
    public final void rule__Element1Choice__RepeatableElement3Assignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2923:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2924:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2924:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.group.ui/src-gen/org/xtext/example/mydsl1/group/ui/contentassist/antlr/internal/InternalMyDsl.g:2925:1: ruleString0
            {
             before(grammarAccess.getElement1ChoiceAccess().getRepeatableElement3String0ParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__Element1Choice__RepeatableElement3Assignment_5_3_15724);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getElement1ChoiceAccess().getRepeatableElement3String0ParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element1Choice__RepeatableElement3Assignment_5_3_1"

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
        public static final BitSet FOLLOW_ruleElement1Choice_in_entryRuleElement1Choice301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElement1Choice308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group__0_in_ruleElement1Choice334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString0361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString0368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleString0395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__0__Impl_in_rule__RootElementType__Group__0430 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__1_in_rule__RootElementType__Group__0433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__RootElementType__Group__0__Impl461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__1__Impl_in_rule__RootElementType__Group__1492 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__2_in_rule__RootElementType__Group__1495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__RootElementType__Group__1__Impl523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__2__Impl_in_rule__RootElementType__Group__2554 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__3_in_rule__RootElementType__Group__2557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__RootElementType__Group__2__Impl585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__3__Impl_in_rule__RootElementType__Group__3616 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__4_in_rule__RootElementType__Group__3619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Element1Assignment_3_in_rule__RootElementType__Group__3__Impl646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__4__Impl_in_rule__RootElementType__Group__4676 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__5_in_rule__RootElementType__Group__4679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__RootElementType__Group__4__Impl707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__5__Impl_in_rule__RootElementType__Group__5738 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__6_in_rule__RootElementType__Group__5741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Element2Assignment_5_in_rule__RootElementType__Group__5__Impl768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__6__Impl_in_rule__RootElementType__Group__6798 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__7_in_rule__RootElementType__Group__6801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__RootElementType__Group__6__Impl829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__7__Impl_in_rule__RootElementType__Group__7860 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__8_in_rule__RootElementType__Group__7863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Element3Assignment_7_in_rule__RootElementType__Group__7__Impl890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__8__Impl_in_rule__RootElementType__Group__8920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__RootElementType__Group__8__Impl948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group__0__Impl_in_rule__Element1__Group__0997 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Element1__Group__1_in_rule__Element1__Group__01000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group__1__Impl_in_rule__Element1__Group__11058 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Element1__Group__2_in_rule__Element1__Group__11061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Element1__Group__1__Impl1089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group__2__Impl_in_rule__Element1__Group__21120 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_rule__Element1__Group__3_in_rule__Element1__Group__21123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Element1__Group__2__Impl1151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group__3__Impl_in_rule__Element1__Group__31182 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_rule__Element1__Group__4_in_rule__Element1__Group__31185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group_3__0_in_rule__Element1__Group__3__Impl1212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group__4__Impl_in_rule__Element1__Group__41243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Element1__Group__4__Impl1271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group_3__0__Impl_in_rule__Element1__Group_3__01312 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Element1__Group_3__1_in_rule__Element1__Group_3__01315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Element1__Group_3__0__Impl1343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group_3__1__Impl_in_rule__Element1__Group_3__11374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Element1ChoiceAssignment_3_1_in_rule__Element1__Group_3__1__Impl1401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__Group__0__Impl_in_rule__Element2__Group__01435 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Element2__Group__1_in_rule__Element2__Group__01438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Element2__Group__0__Impl1466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__Group__1__Impl_in_rule__Element2__Group__11497 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Element2__Group__2_in_rule__Element2__Group__11500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Element2__Group__1__Impl1528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__Group__2__Impl_in_rule__Element2__Group__21559 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Element2__Group__3_in_rule__Element2__Group__21562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Element2__Group__2__Impl1590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__Group__3__Impl_in_rule__Element2__Group__31621 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Element2__Group__4_in_rule__Element2__Group__31624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Element2__Group__3__Impl1652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__Group__4__Impl_in_rule__Element2__Group__41683 = new BitSet(new long[]{0x0000000001020000L});
        public static final BitSet FOLLOW_rule__Element2__Group__5_in_rule__Element2__Group__41686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__ModelGroupElement1Assignment_4_in_rule__Element2__Group__4__Impl1713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__Group__5__Impl_in_rule__Element2__Group__51743 = new BitSet(new long[]{0x0000000001020000L});
        public static final BitSet FOLLOW_rule__Element2__Group__6_in_rule__Element2__Group__51746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__Group_5__0_in_rule__Element2__Group__5__Impl1773 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__Element2__Group__6__Impl_in_rule__Element2__Group__61804 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Element2__Group__7_in_rule__Element2__Group__61807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Element2__Group__6__Impl1835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__Group__7__Impl_in_rule__Element2__Group__71866 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Element2__Group__8_in_rule__Element2__Group__71869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Element2__Group__7__Impl1897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__Group__8__Impl_in_rule__Element2__Group__81928 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Element2__Group__9_in_rule__Element2__Group__81931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__ModelGroupElement2Assignment_8_in_rule__Element2__Group__8__Impl1958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__Group__9__Impl_in_rule__Element2__Group__91988 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Element2__Group__10_in_rule__Element2__Group__91991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Element2__Group__9__Impl2019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__Group__10__Impl_in_rule__Element2__Group__102050 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Element2__Group__11_in_rule__Element2__Group__102053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__ModelGroupElement3Assignment_10_in_rule__Element2__Group__10__Impl2080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__Group__11__Impl_in_rule__Element2__Group__112110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Element2__Group__11__Impl2138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__Group_5__0__Impl_in_rule__Element2__Group_5__02193 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Element2__Group_5__1_in_rule__Element2__Group_5__02196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Element2__Group_5__0__Impl2224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__Group_5__1__Impl_in_rule__Element2__Group_5__12255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element2__ModelGroupElement1Assignment_5_1_in_rule__Element2__Group_5__1__Impl2282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group__0__Impl_in_rule__Element3__Group__02316 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Element3__Group__1_in_rule__Element3__Group__02319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group__1__Impl_in_rule__Element3__Group__12377 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Element3__Group__2_in_rule__Element3__Group__12380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Element3__Group__1__Impl2408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group__2__Impl_in_rule__Element3__Group__22439 = new BitSet(new long[]{0x000000001C020000L});
        public static final BitSet FOLLOW_rule__Element3__Group__3_in_rule__Element3__Group__22442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Element3__Group__2__Impl2470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group__3__Impl_in_rule__Element3__Group__32501 = new BitSet(new long[]{0x000000001C020000L});
        public static final BitSet FOLLOW_rule__Element3__Group__4_in_rule__Element3__Group__32504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group_3__0_in_rule__Element3__Group__3__Impl2531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group__4__Impl_in_rule__Element3__Group__42562 = new BitSet(new long[]{0x000000001C020000L});
        public static final BitSet FOLLOW_rule__Element3__Group__5_in_rule__Element3__Group__42565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group_4__0_in_rule__Element3__Group__4__Impl2592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group__5__Impl_in_rule__Element3__Group__52623 = new BitSet(new long[]{0x000000001C020000L});
        public static final BitSet FOLLOW_rule__Element3__Group__6_in_rule__Element3__Group__52626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group_5__0_in_rule__Element3__Group__5__Impl2653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group__6__Impl_in_rule__Element3__Group__62684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Element3__Group__6__Impl2712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group_3__0__Impl_in_rule__Element3__Group_3__02757 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Element3__Group_3__1_in_rule__Element3__Group_3__02760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Element3__Group_3__0__Impl2788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group_3__1__Impl_in_rule__Element3__Group_3__12819 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Element3__Group_3__2_in_rule__Element3__Group_3__12822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Element3__Group_3__1__Impl2850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group_3__2__Impl_in_rule__Element3__Group_3__22881 = new BitSet(new long[]{0x0000000001020000L});
        public static final BitSet FOLLOW_rule__Element3__Group_3__3_in_rule__Element3__Group_3__22884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__RepeatableElement1Assignment_3_2_in_rule__Element3__Group_3__2__Impl2911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group_3__3__Impl_in_rule__Element3__Group_3__32941 = new BitSet(new long[]{0x0000000001020000L});
        public static final BitSet FOLLOW_rule__Element3__Group_3__4_in_rule__Element3__Group_3__32944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group_3_3__0_in_rule__Element3__Group_3__3__Impl2971 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__Element3__Group_3__4__Impl_in_rule__Element3__Group_3__43002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Element3__Group_3__4__Impl3030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group_3_3__0__Impl_in_rule__Element3__Group_3_3__03071 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Element3__Group_3_3__1_in_rule__Element3__Group_3_3__03074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Element3__Group_3_3__0__Impl3102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group_3_3__1__Impl_in_rule__Element3__Group_3_3__13133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__RepeatableElement1Assignment_3_3_1_in_rule__Element3__Group_3_3__1__Impl3160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group_4__0__Impl_in_rule__Element3__Group_4__03194 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Element3__Group_4__1_in_rule__Element3__Group_4__03197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Element3__Group_4__0__Impl3225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group_4__1__Impl_in_rule__Element3__Group_4__13256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__RepeatableElement2Assignment_4_1_in_rule__Element3__Group_4__1__Impl3283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group_5__0__Impl_in_rule__Element3__Group_5__03317 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Element3__Group_5__1_in_rule__Element3__Group_5__03320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Element3__Group_5__0__Impl3348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__Group_5__1__Impl_in_rule__Element3__Group_5__13379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element3__RepeatableElement3Assignment_5_1_in_rule__Element3__Group_5__1__Impl3406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group__0__Impl_in_rule__Element1Choice__Group__03440 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group__1_in_rule__Element1Choice__Group__03443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group__1__Impl_in_rule__Element1Choice__Group__13501 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group__2_in_rule__Element1Choice__Group__13504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Element1Choice__Group__1__Impl3532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group__2__Impl_in_rule__Element1Choice__Group__23563 = new BitSet(new long[]{0x000000001C020000L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group__3_in_rule__Element1Choice__Group__23566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Element1Choice__Group__2__Impl3594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group__3__Impl_in_rule__Element1Choice__Group__33625 = new BitSet(new long[]{0x000000001C020000L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group__4_in_rule__Element1Choice__Group__33628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_3__0_in_rule__Element1Choice__Group__3__Impl3655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group__4__Impl_in_rule__Element1Choice__Group__43686 = new BitSet(new long[]{0x000000001C020000L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group__5_in_rule__Element1Choice__Group__43689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_4__0_in_rule__Element1Choice__Group__4__Impl3716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group__5__Impl_in_rule__Element1Choice__Group__53747 = new BitSet(new long[]{0x000000001C020000L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group__6_in_rule__Element1Choice__Group__53750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_5__0_in_rule__Element1Choice__Group__5__Impl3777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group__6__Impl_in_rule__Element1Choice__Group__63808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Element1Choice__Group__6__Impl3836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_3__0__Impl_in_rule__Element1Choice__Group_3__03881 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_3__1_in_rule__Element1Choice__Group_3__03884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Element1Choice__Group_3__0__Impl3912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_3__1__Impl_in_rule__Element1Choice__Group_3__13943 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_3__2_in_rule__Element1Choice__Group_3__13946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Element1Choice__Group_3__1__Impl3974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_3__2__Impl_in_rule__Element1Choice__Group_3__24005 = new BitSet(new long[]{0x0000000001020000L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_3__3_in_rule__Element1Choice__Group_3__24008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__RepeatableElement1Assignment_3_2_in_rule__Element1Choice__Group_3__2__Impl4035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_3__3__Impl_in_rule__Element1Choice__Group_3__34065 = new BitSet(new long[]{0x0000000001020000L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_3__4_in_rule__Element1Choice__Group_3__34068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_3_3__0_in_rule__Element1Choice__Group_3__3__Impl4095 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_3__4__Impl_in_rule__Element1Choice__Group_3__44126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Element1Choice__Group_3__4__Impl4154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_3_3__0__Impl_in_rule__Element1Choice__Group_3_3__04195 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_3_3__1_in_rule__Element1Choice__Group_3_3__04198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Element1Choice__Group_3_3__0__Impl4226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_3_3__1__Impl_in_rule__Element1Choice__Group_3_3__14257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__RepeatableElement1Assignment_3_3_1_in_rule__Element1Choice__Group_3_3__1__Impl4284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_4__0__Impl_in_rule__Element1Choice__Group_4__04318 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_4__1_in_rule__Element1Choice__Group_4__04321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Element1Choice__Group_4__0__Impl4349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_4__1__Impl_in_rule__Element1Choice__Group_4__14380 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_4__2_in_rule__Element1Choice__Group_4__14383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Element1Choice__Group_4__1__Impl4411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_4__2__Impl_in_rule__Element1Choice__Group_4__24442 = new BitSet(new long[]{0x0000000001020000L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_4__3_in_rule__Element1Choice__Group_4__24445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__RepeatableElement2Assignment_4_2_in_rule__Element1Choice__Group_4__2__Impl4472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_4__3__Impl_in_rule__Element1Choice__Group_4__34502 = new BitSet(new long[]{0x0000000001020000L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_4__4_in_rule__Element1Choice__Group_4__34505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_4_3__0_in_rule__Element1Choice__Group_4__3__Impl4532 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_4__4__Impl_in_rule__Element1Choice__Group_4__44563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Element1Choice__Group_4__4__Impl4591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_4_3__0__Impl_in_rule__Element1Choice__Group_4_3__04632 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_4_3__1_in_rule__Element1Choice__Group_4_3__04635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Element1Choice__Group_4_3__0__Impl4663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_4_3__1__Impl_in_rule__Element1Choice__Group_4_3__14694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__RepeatableElement2Assignment_4_3_1_in_rule__Element1Choice__Group_4_3__1__Impl4721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_5__0__Impl_in_rule__Element1Choice__Group_5__04755 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_5__1_in_rule__Element1Choice__Group_5__04758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Element1Choice__Group_5__0__Impl4786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_5__1__Impl_in_rule__Element1Choice__Group_5__14817 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_5__2_in_rule__Element1Choice__Group_5__14820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Element1Choice__Group_5__1__Impl4848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_5__2__Impl_in_rule__Element1Choice__Group_5__24879 = new BitSet(new long[]{0x0000000001020000L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_5__3_in_rule__Element1Choice__Group_5__24882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__RepeatableElement3Assignment_5_2_in_rule__Element1Choice__Group_5__2__Impl4909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_5__3__Impl_in_rule__Element1Choice__Group_5__34939 = new BitSet(new long[]{0x0000000001020000L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_5__4_in_rule__Element1Choice__Group_5__34942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_5_3__0_in_rule__Element1Choice__Group_5__3__Impl4969 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_5__4__Impl_in_rule__Element1Choice__Group_5__45000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Element1Choice__Group_5__4__Impl5028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_5_3__0__Impl_in_rule__Element1Choice__Group_5_3__05069 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_5_3__1_in_rule__Element1Choice__Group_5_3__05072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Element1Choice__Group_5_3__0__Impl5100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__Group_5_3__1__Impl_in_rule__Element1Choice__Group_5_3__15131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1Choice__RepeatableElement3Assignment_5_3_1_in_rule__Element1Choice__Group_5_3__1__Impl5158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement1_in_rule__RootElementType__Element1Assignment_35197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement2_in_rule__RootElementType__Element2Assignment_55228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement3_in_rule__RootElementType__Element3Assignment_75259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement1Choice_in_rule__Element1__Element1ChoiceAssignment_3_15290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Element2__ModelGroupElement1Assignment_45321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Element2__ModelGroupElement1Assignment_5_15352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Element2__ModelGroupElement2Assignment_85383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Element2__ModelGroupElement3Assignment_105414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Element3__RepeatableElement1Assignment_3_25445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Element3__RepeatableElement1Assignment_3_3_15476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Element3__RepeatableElement2Assignment_4_15507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Element3__RepeatableElement3Assignment_5_15538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Element1Choice__RepeatableElement1Assignment_3_25569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Element1Choice__RepeatableElement1Assignment_3_3_15600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Element1Choice__RepeatableElement2Assignment_4_25631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Element1Choice__RepeatableElement2Assignment_4_3_15662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Element1Choice__RepeatableElement3Assignment_5_25693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__Element1Choice__RepeatableElement3Assignment_5_3_15724 = new BitSet(new long[]{0x0000000000000002L});
    }


}