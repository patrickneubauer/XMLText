package org.xtext.example.mydsl.anyfeatureadapted.ui.contentassist.antlr.internal; 

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
import org.xtext.example.mydsl.anyfeatureadapted.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RootElementType'", "'{'", "'element1'", "'}'", "'properties'", "'Element1'", "'city'", "'street'", "'Properties'", "'anyGenericElem'", "','", "'AnyGenericElement'", "'elemName'", "'elemValue'", "'anyGenericAttr'", "'childElem'", "'AnyGenericText'", "'textValue'", "'AnyGenericAttribute'", "'attrName'", "'attrValue'"
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleRootElementType : ruleRootElementType EOF ;
    public final void entryRuleRootElementType() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleRootElementType EOF )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleRootElementType EOF
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleRootElementType : ( ( rule__RootElementType__Group__0 ) ) ;
    public final void ruleRootElementType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__RootElementType__Group__0 ) ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__RootElementType__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__RootElementType__Group__0 ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__RootElementType__Group__0 )
            {
             before(grammarAccess.getRootElementTypeAccess().getGroup()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__RootElementType__Group__0 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__RootElementType__Group__0
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


    // $ANTLR start "entryRuleAnyGenericConstruct"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleAnyGenericConstruct : ruleAnyGenericConstruct EOF ;
    public final void entryRuleAnyGenericConstruct() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleAnyGenericConstruct EOF )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleAnyGenericConstruct EOF
            {
             before(grammarAccess.getAnyGenericConstructRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyGenericConstruct_in_entryRuleAnyGenericConstruct121);
            ruleAnyGenericConstruct();

            state._fsp--;

             after(grammarAccess.getAnyGenericConstructRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnyGenericConstruct128); 

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
    // $ANTLR end "entryRuleAnyGenericConstruct"


    // $ANTLR start "ruleAnyGenericConstruct"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleAnyGenericConstruct : ( ( rule__AnyGenericConstruct__Alternatives ) ) ;
    public final void ruleAnyGenericConstruct() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__AnyGenericConstruct__Alternatives ) ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__AnyGenericConstruct__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__AnyGenericConstruct__Alternatives ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__AnyGenericConstruct__Alternatives )
            {
             before(grammarAccess.getAnyGenericConstructAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__AnyGenericConstruct__Alternatives )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__AnyGenericConstruct__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericConstruct__Alternatives_in_ruleAnyGenericConstruct154);
            rule__AnyGenericConstruct__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAnyGenericConstructAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnyGenericConstruct"


    // $ANTLR start "entryRuleElement1"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleElement1 : ruleElement1 EOF ;
    public final void entryRuleElement1() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleElement1 EOF )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleElement1 EOF
            {
             before(grammarAccess.getElement1Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement1_in_entryRuleElement1181);
            ruleElement1();

            state._fsp--;

             after(grammarAccess.getElement1Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElement1188); 

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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleElement1 : ( ( rule__Element1__Group__0 ) ) ;
    public final void ruleElement1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__Element1__Group__0 ) ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Element1__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Element1__Group__0 ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__Element1__Group__0 )
            {
             before(grammarAccess.getElement1Access().getGroup()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__Element1__Group__0 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__Element1__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__0_in_ruleElement1214);
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleProperties : ruleProperties EOF ;
    public final void entryRuleProperties() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleProperties EOF )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleProperties EOF
            {
             before(grammarAccess.getPropertiesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperties_in_entryRuleProperties241);
            ruleProperties();

            state._fsp--;

             after(grammarAccess.getPropertiesRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProperties248); 

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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleProperties : ( ( rule__Properties__Group__0 ) ) ;
    public final void ruleProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ( rule__Properties__Group__0 ) ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Properties__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Properties__Group__0 ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( rule__Properties__Group__0 )
            {
             before(grammarAccess.getPropertiesAccess().getGroup()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__Properties__Group__0 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: rule__Properties__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Properties__Group__0_in_ruleProperties274);
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


    // $ANTLR start "entryRuleAnyGenericElement"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: entryRuleAnyGenericElement : ruleAnyGenericElement EOF ;
    public final void entryRuleAnyGenericElement() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:175:1: ( ruleAnyGenericElement EOF )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:176:1: ruleAnyGenericElement EOF
            {
             before(grammarAccess.getAnyGenericElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyGenericElement_in_entryRuleAnyGenericElement303);
            ruleAnyGenericElement();

            state._fsp--;

             after(grammarAccess.getAnyGenericElementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnyGenericElement310); 

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
    // $ANTLR end "entryRuleAnyGenericElement"


    // $ANTLR start "ruleAnyGenericElement"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:183:1: ruleAnyGenericElement : ( ( rule__AnyGenericElement__Group__0 ) ) ;
    public final void ruleAnyGenericElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:187:2: ( ( ( rule__AnyGenericElement__Group__0 ) ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( ( rule__AnyGenericElement__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( ( rule__AnyGenericElement__Group__0 ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:189:1: ( rule__AnyGenericElement__Group__0 )
            {
             before(grammarAccess.getAnyGenericElementAccess().getGroup()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:190:1: ( rule__AnyGenericElement__Group__0 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:190:2: rule__AnyGenericElement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group__0_in_ruleAnyGenericElement336);
            rule__AnyGenericElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnyGenericElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnyGenericElement"


    // $ANTLR start "entryRuleAnyGenericText"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: entryRuleAnyGenericText : ruleAnyGenericText EOF ;
    public final void entryRuleAnyGenericText() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:203:1: ( ruleAnyGenericText EOF )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:204:1: ruleAnyGenericText EOF
            {
             before(grammarAccess.getAnyGenericTextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyGenericText_in_entryRuleAnyGenericText363);
            ruleAnyGenericText();

            state._fsp--;

             after(grammarAccess.getAnyGenericTextRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnyGenericText370); 

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
    // $ANTLR end "entryRuleAnyGenericText"


    // $ANTLR start "ruleAnyGenericText"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:211:1: ruleAnyGenericText : ( ( rule__AnyGenericText__Group__0 ) ) ;
    public final void ruleAnyGenericText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:215:2: ( ( ( rule__AnyGenericText__Group__0 ) ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ( ( rule__AnyGenericText__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ( ( rule__AnyGenericText__Group__0 ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:217:1: ( rule__AnyGenericText__Group__0 )
            {
             before(grammarAccess.getAnyGenericTextAccess().getGroup()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:218:1: ( rule__AnyGenericText__Group__0 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:218:2: rule__AnyGenericText__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericText__Group__0_in_ruleAnyGenericText396);
            rule__AnyGenericText__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnyGenericTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnyGenericText"


    // $ANTLR start "entryRuleAnyGenericAttribute"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: entryRuleAnyGenericAttribute : ruleAnyGenericAttribute EOF ;
    public final void entryRuleAnyGenericAttribute() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:231:1: ( ruleAnyGenericAttribute EOF )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:232:1: ruleAnyGenericAttribute EOF
            {
             before(grammarAccess.getAnyGenericAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyGenericAttribute_in_entryRuleAnyGenericAttribute423);
            ruleAnyGenericAttribute();

            state._fsp--;

             after(grammarAccess.getAnyGenericAttributeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnyGenericAttribute430); 

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
    // $ANTLR end "entryRuleAnyGenericAttribute"


    // $ANTLR start "ruleAnyGenericAttribute"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:239:1: ruleAnyGenericAttribute : ( ( rule__AnyGenericAttribute__Group__0 ) ) ;
    public final void ruleAnyGenericAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:243:2: ( ( ( rule__AnyGenericAttribute__Group__0 ) ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ( ( rule__AnyGenericAttribute__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ( ( rule__AnyGenericAttribute__Group__0 ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:245:1: ( rule__AnyGenericAttribute__Group__0 )
            {
             before(grammarAccess.getAnyGenericAttributeAccess().getGroup()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:246:1: ( rule__AnyGenericAttribute__Group__0 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:246:2: rule__AnyGenericAttribute__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericAttribute__Group__0_in_ruleAnyGenericAttribute456);
            rule__AnyGenericAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnyGenericAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnyGenericAttribute"


    // $ANTLR start "rule__AnyGenericConstruct__Alternatives"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:258:1: rule__AnyGenericConstruct__Alternatives : ( ( ruleAnyGenericElement ) | ( ruleAnyGenericText ) );
    public final void rule__AnyGenericConstruct__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:262:1: ( ( ruleAnyGenericElement ) | ( ruleAnyGenericText ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22) ) {
                alt1=1;
            }
            else if ( (LA1_0==27) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:263:1: ( ruleAnyGenericElement )
                    {
                    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:263:1: ( ruleAnyGenericElement )
                    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:264:1: ruleAnyGenericElement
                    {
                     before(grammarAccess.getAnyGenericConstructAccess().getAnyGenericElementParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAnyGenericElement_in_rule__AnyGenericConstruct__Alternatives492);
                    ruleAnyGenericElement();

                    state._fsp--;

                     after(grammarAccess.getAnyGenericConstructAccess().getAnyGenericElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:269:6: ( ruleAnyGenericText )
                    {
                    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:269:6: ( ruleAnyGenericText )
                    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ruleAnyGenericText
                    {
                     before(grammarAccess.getAnyGenericConstructAccess().getAnyGenericTextParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAnyGenericText_in_rule__AnyGenericConstruct__Alternatives509);
                    ruleAnyGenericText();

                    state._fsp--;

                     after(grammarAccess.getAnyGenericConstructAccess().getAnyGenericTextParserRuleCall_1()); 

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
    // $ANTLR end "rule__AnyGenericConstruct__Alternatives"


    // $ANTLR start "rule__RootElementType__Group__0"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:282:1: rule__RootElementType__Group__0 : rule__RootElementType__Group__0__Impl rule__RootElementType__Group__1 ;
    public final void rule__RootElementType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:286:1: ( rule__RootElementType__Group__0__Impl rule__RootElementType__Group__1 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:287:2: rule__RootElementType__Group__0__Impl rule__RootElementType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__0__Impl_in_rule__RootElementType__Group__0539);
            rule__RootElementType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__1_in_rule__RootElementType__Group__0542);
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:294:1: rule__RootElementType__Group__0__Impl : ( 'RootElementType' ) ;
    public final void rule__RootElementType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( 'RootElementType' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:299:1: ( 'RootElementType' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:299:1: ( 'RootElementType' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:300:1: 'RootElementType'
            {
             before(grammarAccess.getRootElementTypeAccess().getRootElementTypeKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__RootElementType__Group__0__Impl570); 
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:313:1: rule__RootElementType__Group__1 : rule__RootElementType__Group__1__Impl rule__RootElementType__Group__2 ;
    public final void rule__RootElementType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:317:1: ( rule__RootElementType__Group__1__Impl rule__RootElementType__Group__2 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:318:2: rule__RootElementType__Group__1__Impl rule__RootElementType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__1__Impl_in_rule__RootElementType__Group__1601);
            rule__RootElementType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__2_in_rule__RootElementType__Group__1604);
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:325:1: rule__RootElementType__Group__1__Impl : ( '{' ) ;
    public final void rule__RootElementType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:329:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:330:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:330:1: ( '{' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:331:1: '{'
            {
             before(grammarAccess.getRootElementTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__RootElementType__Group__1__Impl632); 
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:344:1: rule__RootElementType__Group__2 : rule__RootElementType__Group__2__Impl rule__RootElementType__Group__3 ;
    public final void rule__RootElementType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:348:1: ( rule__RootElementType__Group__2__Impl rule__RootElementType__Group__3 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:349:2: rule__RootElementType__Group__2__Impl rule__RootElementType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__2__Impl_in_rule__RootElementType__Group__2663);
            rule__RootElementType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__3_in_rule__RootElementType__Group__2666);
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:356:1: rule__RootElementType__Group__2__Impl : ( 'element1' ) ;
    public final void rule__RootElementType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:360:1: ( ( 'element1' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:361:1: ( 'element1' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:361:1: ( 'element1' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:362:1: 'element1'
            {
             before(grammarAccess.getRootElementTypeAccess().getElement1Keyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__RootElementType__Group__2__Impl694); 
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:375:1: rule__RootElementType__Group__3 : rule__RootElementType__Group__3__Impl rule__RootElementType__Group__4 ;
    public final void rule__RootElementType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:379:1: ( rule__RootElementType__Group__3__Impl rule__RootElementType__Group__4 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:380:2: rule__RootElementType__Group__3__Impl rule__RootElementType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__3__Impl_in_rule__RootElementType__Group__3725);
            rule__RootElementType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__4_in_rule__RootElementType__Group__3728);
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:387:1: rule__RootElementType__Group__3__Impl : ( ( rule__RootElementType__Element1Assignment_3 ) ) ;
    public final void rule__RootElementType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:391:1: ( ( ( rule__RootElementType__Element1Assignment_3 ) ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:392:1: ( ( rule__RootElementType__Element1Assignment_3 ) )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:392:1: ( ( rule__RootElementType__Element1Assignment_3 ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:393:1: ( rule__RootElementType__Element1Assignment_3 )
            {
             before(grammarAccess.getRootElementTypeAccess().getElement1Assignment_3()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:394:1: ( rule__RootElementType__Element1Assignment_3 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:394:2: rule__RootElementType__Element1Assignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Element1Assignment_3_in_rule__RootElementType__Group__3__Impl755);
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:404:1: rule__RootElementType__Group__4 : rule__RootElementType__Group__4__Impl rule__RootElementType__Group__5 ;
    public final void rule__RootElementType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:408:1: ( rule__RootElementType__Group__4__Impl rule__RootElementType__Group__5 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:409:2: rule__RootElementType__Group__4__Impl rule__RootElementType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__4__Impl_in_rule__RootElementType__Group__4785);
            rule__RootElementType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__5_in_rule__RootElementType__Group__4788);
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:416:1: rule__RootElementType__Group__4__Impl : ( ( rule__RootElementType__Group_4__0 )? ) ;
    public final void rule__RootElementType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:420:1: ( ( ( rule__RootElementType__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:421:1: ( ( rule__RootElementType__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:421:1: ( ( rule__RootElementType__Group_4__0 )? )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:422:1: ( rule__RootElementType__Group_4__0 )?
            {
             before(grammarAccess.getRootElementTypeAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:423:1: ( rule__RootElementType__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:423:2: rule__RootElementType__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group_4__0_in_rule__RootElementType__Group__4__Impl815);
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:433:1: rule__RootElementType__Group__5 : rule__RootElementType__Group__5__Impl ;
    public final void rule__RootElementType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:437:1: ( rule__RootElementType__Group__5__Impl )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:438:2: rule__RootElementType__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group__5__Impl_in_rule__RootElementType__Group__5846);
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:444:1: rule__RootElementType__Group__5__Impl : ( '}' ) ;
    public final void rule__RootElementType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:448:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:449:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:449:1: ( '}' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:450:1: '}'
            {
             before(grammarAccess.getRootElementTypeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__RootElementType__Group__5__Impl874); 
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:475:1: rule__RootElementType__Group_4__0 : rule__RootElementType__Group_4__0__Impl rule__RootElementType__Group_4__1 ;
    public final void rule__RootElementType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:479:1: ( rule__RootElementType__Group_4__0__Impl rule__RootElementType__Group_4__1 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:480:2: rule__RootElementType__Group_4__0__Impl rule__RootElementType__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group_4__0__Impl_in_rule__RootElementType__Group_4__0917);
            rule__RootElementType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group_4__1_in_rule__RootElementType__Group_4__0920);
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:487:1: rule__RootElementType__Group_4__0__Impl : ( 'properties' ) ;
    public final void rule__RootElementType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:491:1: ( ( 'properties' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:492:1: ( 'properties' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:492:1: ( 'properties' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:493:1: 'properties'
            {
             before(grammarAccess.getRootElementTypeAccess().getPropertiesKeyword_4_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__RootElementType__Group_4__0__Impl948); 
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:506:1: rule__RootElementType__Group_4__1 : rule__RootElementType__Group_4__1__Impl ;
    public final void rule__RootElementType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:510:1: ( rule__RootElementType__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:511:2: rule__RootElementType__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__Group_4__1__Impl_in_rule__RootElementType__Group_4__1979);
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:517:1: rule__RootElementType__Group_4__1__Impl : ( ( rule__RootElementType__PropertiesAssignment_4_1 ) ) ;
    public final void rule__RootElementType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:521:1: ( ( ( rule__RootElementType__PropertiesAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:522:1: ( ( rule__RootElementType__PropertiesAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:522:1: ( ( rule__RootElementType__PropertiesAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:523:1: ( rule__RootElementType__PropertiesAssignment_4_1 )
            {
             before(grammarAccess.getRootElementTypeAccess().getPropertiesAssignment_4_1()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:524:1: ( rule__RootElementType__PropertiesAssignment_4_1 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:524:2: rule__RootElementType__PropertiesAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RootElementType__PropertiesAssignment_4_1_in_rule__RootElementType__Group_4__1__Impl1006);
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:538:1: rule__Element1__Group__0 : rule__Element1__Group__0__Impl rule__Element1__Group__1 ;
    public final void rule__Element1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:542:1: ( rule__Element1__Group__0__Impl rule__Element1__Group__1 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:543:2: rule__Element1__Group__0__Impl rule__Element1__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__0__Impl_in_rule__Element1__Group__01040);
            rule__Element1__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__1_in_rule__Element1__Group__01043);
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:550:1: rule__Element1__Group__0__Impl : ( () ) ;
    public final void rule__Element1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:554:1: ( ( () ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:555:1: ( () )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:555:1: ( () )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:556:1: ()
            {
             before(grammarAccess.getElement1Access().getElement1Action_0()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:557:1: ()
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:559:1: 
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:569:1: rule__Element1__Group__1 : rule__Element1__Group__1__Impl rule__Element1__Group__2 ;
    public final void rule__Element1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:573:1: ( rule__Element1__Group__1__Impl rule__Element1__Group__2 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:574:2: rule__Element1__Group__1__Impl rule__Element1__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__1__Impl_in_rule__Element1__Group__11101);
            rule__Element1__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__2_in_rule__Element1__Group__11104);
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:581:1: rule__Element1__Group__1__Impl : ( 'Element1' ) ;
    public final void rule__Element1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:585:1: ( ( 'Element1' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:586:1: ( 'Element1' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:586:1: ( 'Element1' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:587:1: 'Element1'
            {
             before(grammarAccess.getElement1Access().getElement1Keyword_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Element1__Group__1__Impl1132); 
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:600:1: rule__Element1__Group__2 : rule__Element1__Group__2__Impl rule__Element1__Group__3 ;
    public final void rule__Element1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:604:1: ( rule__Element1__Group__2__Impl rule__Element1__Group__3 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:605:2: rule__Element1__Group__2__Impl rule__Element1__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__2__Impl_in_rule__Element1__Group__21163);
            rule__Element1__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__3_in_rule__Element1__Group__21166);
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:612:1: rule__Element1__Group__2__Impl : ( '{' ) ;
    public final void rule__Element1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:616:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:617:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:617:1: ( '{' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:618:1: '{'
            {
             before(grammarAccess.getElement1Access().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Element1__Group__2__Impl1194); 
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:631:1: rule__Element1__Group__3 : rule__Element1__Group__3__Impl rule__Element1__Group__4 ;
    public final void rule__Element1__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:635:1: ( rule__Element1__Group__3__Impl rule__Element1__Group__4 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:636:2: rule__Element1__Group__3__Impl rule__Element1__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__3__Impl_in_rule__Element1__Group__31225);
            rule__Element1__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__4_in_rule__Element1__Group__31228);
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:643:1: rule__Element1__Group__3__Impl : ( ( rule__Element1__Group_3__0 )? ) ;
    public final void rule__Element1__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:647:1: ( ( ( rule__Element1__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:648:1: ( ( rule__Element1__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:648:1: ( ( rule__Element1__Group_3__0 )? )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:649:1: ( rule__Element1__Group_3__0 )?
            {
             before(grammarAccess.getElement1Access().getGroup_3()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:650:1: ( rule__Element1__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:650:2: rule__Element1__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Element1__Group_3__0_in_rule__Element1__Group__3__Impl1255);
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:660:1: rule__Element1__Group__4 : rule__Element1__Group__4__Impl rule__Element1__Group__5 ;
    public final void rule__Element1__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:664:1: ( rule__Element1__Group__4__Impl rule__Element1__Group__5 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:665:2: rule__Element1__Group__4__Impl rule__Element1__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__4__Impl_in_rule__Element1__Group__41286);
            rule__Element1__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__5_in_rule__Element1__Group__41289);
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:672:1: rule__Element1__Group__4__Impl : ( ( rule__Element1__Group_4__0 )? ) ;
    public final void rule__Element1__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:676:1: ( ( ( rule__Element1__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:677:1: ( ( rule__Element1__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:677:1: ( ( rule__Element1__Group_4__0 )? )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:678:1: ( rule__Element1__Group_4__0 )?
            {
             before(grammarAccess.getElement1Access().getGroup_4()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:679:1: ( rule__Element1__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:679:2: rule__Element1__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Element1__Group_4__0_in_rule__Element1__Group__4__Impl1316);
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:689:1: rule__Element1__Group__5 : rule__Element1__Group__5__Impl ;
    public final void rule__Element1__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:693:1: ( rule__Element1__Group__5__Impl )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:694:2: rule__Element1__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group__5__Impl_in_rule__Element1__Group__51347);
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:700:1: rule__Element1__Group__5__Impl : ( '}' ) ;
    public final void rule__Element1__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:704:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:705:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:705:1: ( '}' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:706:1: '}'
            {
             before(grammarAccess.getElement1Access().getRightCurlyBracketKeyword_5()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Element1__Group__5__Impl1375); 
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:731:1: rule__Element1__Group_3__0 : rule__Element1__Group_3__0__Impl rule__Element1__Group_3__1 ;
    public final void rule__Element1__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:735:1: ( rule__Element1__Group_3__0__Impl rule__Element1__Group_3__1 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:736:2: rule__Element1__Group_3__0__Impl rule__Element1__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group_3__0__Impl_in_rule__Element1__Group_3__01418);
            rule__Element1__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group_3__1_in_rule__Element1__Group_3__01421);
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:743:1: rule__Element1__Group_3__0__Impl : ( 'city' ) ;
    public final void rule__Element1__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:747:1: ( ( 'city' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:748:1: ( 'city' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:748:1: ( 'city' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:749:1: 'city'
            {
             before(grammarAccess.getElement1Access().getCityKeyword_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Element1__Group_3__0__Impl1449); 
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:762:1: rule__Element1__Group_3__1 : rule__Element1__Group_3__1__Impl ;
    public final void rule__Element1__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:766:1: ( rule__Element1__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:767:2: rule__Element1__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group_3__1__Impl_in_rule__Element1__Group_3__11480);
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:773:1: rule__Element1__Group_3__1__Impl : ( ( rule__Element1__CityAssignment_3_1 ) ) ;
    public final void rule__Element1__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:777:1: ( ( ( rule__Element1__CityAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:778:1: ( ( rule__Element1__CityAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:778:1: ( ( rule__Element1__CityAssignment_3_1 ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:779:1: ( rule__Element1__CityAssignment_3_1 )
            {
             before(grammarAccess.getElement1Access().getCityAssignment_3_1()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:780:1: ( rule__Element1__CityAssignment_3_1 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:780:2: rule__Element1__CityAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__CityAssignment_3_1_in_rule__Element1__Group_3__1__Impl1507);
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:794:1: rule__Element1__Group_4__0 : rule__Element1__Group_4__0__Impl rule__Element1__Group_4__1 ;
    public final void rule__Element1__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:798:1: ( rule__Element1__Group_4__0__Impl rule__Element1__Group_4__1 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:799:2: rule__Element1__Group_4__0__Impl rule__Element1__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group_4__0__Impl_in_rule__Element1__Group_4__01541);
            rule__Element1__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group_4__1_in_rule__Element1__Group_4__01544);
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:806:1: rule__Element1__Group_4__0__Impl : ( 'street' ) ;
    public final void rule__Element1__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:810:1: ( ( 'street' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:811:1: ( 'street' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:811:1: ( 'street' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:812:1: 'street'
            {
             before(grammarAccess.getElement1Access().getStreetKeyword_4_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Element1__Group_4__0__Impl1572); 
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:825:1: rule__Element1__Group_4__1 : rule__Element1__Group_4__1__Impl ;
    public final void rule__Element1__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:829:1: ( rule__Element1__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:830:2: rule__Element1__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__Group_4__1__Impl_in_rule__Element1__Group_4__11603);
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:836:1: rule__Element1__Group_4__1__Impl : ( ( rule__Element1__StreetAssignment_4_1 ) ) ;
    public final void rule__Element1__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:840:1: ( ( ( rule__Element1__StreetAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:841:1: ( ( rule__Element1__StreetAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:841:1: ( ( rule__Element1__StreetAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:842:1: ( rule__Element1__StreetAssignment_4_1 )
            {
             before(grammarAccess.getElement1Access().getStreetAssignment_4_1()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:843:1: ( rule__Element1__StreetAssignment_4_1 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:843:2: rule__Element1__StreetAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element1__StreetAssignment_4_1_in_rule__Element1__Group_4__1__Impl1630);
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:857:1: rule__Properties__Group__0 : rule__Properties__Group__0__Impl rule__Properties__Group__1 ;
    public final void rule__Properties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:861:1: ( rule__Properties__Group__0__Impl rule__Properties__Group__1 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:862:2: rule__Properties__Group__0__Impl rule__Properties__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Properties__Group__0__Impl_in_rule__Properties__Group__01664);
            rule__Properties__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Properties__Group__1_in_rule__Properties__Group__01667);
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:869:1: rule__Properties__Group__0__Impl : ( 'Properties' ) ;
    public final void rule__Properties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:873:1: ( ( 'Properties' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:874:1: ( 'Properties' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:874:1: ( 'Properties' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:875:1: 'Properties'
            {
             before(grammarAccess.getPropertiesAccess().getPropertiesKeyword_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Properties__Group__0__Impl1695); 
             after(grammarAccess.getPropertiesAccess().getPropertiesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__0__Impl"


    // $ANTLR start "rule__Properties__Group__1"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:888:1: rule__Properties__Group__1 : rule__Properties__Group__1__Impl rule__Properties__Group__2 ;
    public final void rule__Properties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:892:1: ( rule__Properties__Group__1__Impl rule__Properties__Group__2 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:893:2: rule__Properties__Group__1__Impl rule__Properties__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Properties__Group__1__Impl_in_rule__Properties__Group__11726);
            rule__Properties__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Properties__Group__2_in_rule__Properties__Group__11729);
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:900:1: rule__Properties__Group__1__Impl : ( '{' ) ;
    public final void rule__Properties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:904:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:905:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:905:1: ( '{' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:906:1: '{'
            {
             before(grammarAccess.getPropertiesAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Properties__Group__1__Impl1757); 
             after(grammarAccess.getPropertiesAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:919:1: rule__Properties__Group__2 : rule__Properties__Group__2__Impl rule__Properties__Group__3 ;
    public final void rule__Properties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:923:1: ( rule__Properties__Group__2__Impl rule__Properties__Group__3 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:924:2: rule__Properties__Group__2__Impl rule__Properties__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Properties__Group__2__Impl_in_rule__Properties__Group__21788);
            rule__Properties__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Properties__Group__3_in_rule__Properties__Group__21791);
            rule__Properties__Group__3();

            state._fsp--;


            }

        }
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:931:1: rule__Properties__Group__2__Impl : ( 'anyGenericElem' ) ;
    public final void rule__Properties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:935:1: ( ( 'anyGenericElem' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:936:1: ( 'anyGenericElem' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:936:1: ( 'anyGenericElem' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:937:1: 'anyGenericElem'
            {
             before(grammarAccess.getPropertiesAccess().getAnyGenericElemKeyword_2()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Properties__Group__2__Impl1819); 
             after(grammarAccess.getPropertiesAccess().getAnyGenericElemKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Properties__Group__3"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:950:1: rule__Properties__Group__3 : rule__Properties__Group__3__Impl rule__Properties__Group__4 ;
    public final void rule__Properties__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:954:1: ( rule__Properties__Group__3__Impl rule__Properties__Group__4 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:955:2: rule__Properties__Group__3__Impl rule__Properties__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Properties__Group__3__Impl_in_rule__Properties__Group__31850);
            rule__Properties__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Properties__Group__4_in_rule__Properties__Group__31853);
            rule__Properties__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__3"


    // $ANTLR start "rule__Properties__Group__3__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:962:1: rule__Properties__Group__3__Impl : ( '{' ) ;
    public final void rule__Properties__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:966:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:967:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:967:1: ( '{' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:968:1: '{'
            {
             before(grammarAccess.getPropertiesAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Properties__Group__3__Impl1881); 
             after(grammarAccess.getPropertiesAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__3__Impl"


    // $ANTLR start "rule__Properties__Group__4"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:981:1: rule__Properties__Group__4 : rule__Properties__Group__4__Impl rule__Properties__Group__5 ;
    public final void rule__Properties__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:985:1: ( rule__Properties__Group__4__Impl rule__Properties__Group__5 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:986:2: rule__Properties__Group__4__Impl rule__Properties__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Properties__Group__4__Impl_in_rule__Properties__Group__41912);
            rule__Properties__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Properties__Group__5_in_rule__Properties__Group__41915);
            rule__Properties__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__4"


    // $ANTLR start "rule__Properties__Group__4__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:993:1: rule__Properties__Group__4__Impl : ( ( rule__Properties__AnyGenericElemAssignment_4 ) ) ;
    public final void rule__Properties__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:997:1: ( ( ( rule__Properties__AnyGenericElemAssignment_4 ) ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:998:1: ( ( rule__Properties__AnyGenericElemAssignment_4 ) )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:998:1: ( ( rule__Properties__AnyGenericElemAssignment_4 ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:999:1: ( rule__Properties__AnyGenericElemAssignment_4 )
            {
             before(grammarAccess.getPropertiesAccess().getAnyGenericElemAssignment_4()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1000:1: ( rule__Properties__AnyGenericElemAssignment_4 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1000:2: rule__Properties__AnyGenericElemAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Properties__AnyGenericElemAssignment_4_in_rule__Properties__Group__4__Impl1942);
            rule__Properties__AnyGenericElemAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPropertiesAccess().getAnyGenericElemAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__4__Impl"


    // $ANTLR start "rule__Properties__Group__5"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1010:1: rule__Properties__Group__5 : rule__Properties__Group__5__Impl rule__Properties__Group__6 ;
    public final void rule__Properties__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1014:1: ( rule__Properties__Group__5__Impl rule__Properties__Group__6 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1015:2: rule__Properties__Group__5__Impl rule__Properties__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Properties__Group__5__Impl_in_rule__Properties__Group__51972);
            rule__Properties__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Properties__Group__6_in_rule__Properties__Group__51975);
            rule__Properties__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__5"


    // $ANTLR start "rule__Properties__Group__5__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1022:1: rule__Properties__Group__5__Impl : ( ( rule__Properties__Group_5__0 )* ) ;
    public final void rule__Properties__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1026:1: ( ( ( rule__Properties__Group_5__0 )* ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1027:1: ( ( rule__Properties__Group_5__0 )* )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1027:1: ( ( rule__Properties__Group_5__0 )* )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1028:1: ( rule__Properties__Group_5__0 )*
            {
             before(grammarAccess.getPropertiesAccess().getGroup_5()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1029:1: ( rule__Properties__Group_5__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1029:2: rule__Properties__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Properties__Group_5__0_in_rule__Properties__Group__5__Impl2002);
            	    rule__Properties__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPropertiesAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__5__Impl"


    // $ANTLR start "rule__Properties__Group__6"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1039:1: rule__Properties__Group__6 : rule__Properties__Group__6__Impl rule__Properties__Group__7 ;
    public final void rule__Properties__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1043:1: ( rule__Properties__Group__6__Impl rule__Properties__Group__7 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1044:2: rule__Properties__Group__6__Impl rule__Properties__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Properties__Group__6__Impl_in_rule__Properties__Group__62033);
            rule__Properties__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Properties__Group__7_in_rule__Properties__Group__62036);
            rule__Properties__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__6"


    // $ANTLR start "rule__Properties__Group__6__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1051:1: rule__Properties__Group__6__Impl : ( '}' ) ;
    public final void rule__Properties__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1055:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1056:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1056:1: ( '}' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1057:1: '}'
            {
             before(grammarAccess.getPropertiesAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Properties__Group__6__Impl2064); 
             after(grammarAccess.getPropertiesAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__6__Impl"


    // $ANTLR start "rule__Properties__Group__7"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1070:1: rule__Properties__Group__7 : rule__Properties__Group__7__Impl ;
    public final void rule__Properties__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1074:1: ( rule__Properties__Group__7__Impl )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1075:2: rule__Properties__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Properties__Group__7__Impl_in_rule__Properties__Group__72095);
            rule__Properties__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__7"


    // $ANTLR start "rule__Properties__Group__7__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1081:1: rule__Properties__Group__7__Impl : ( '}' ) ;
    public final void rule__Properties__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1085:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1086:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1086:1: ( '}' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1087:1: '}'
            {
             before(grammarAccess.getPropertiesAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Properties__Group__7__Impl2123); 
             after(grammarAccess.getPropertiesAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__7__Impl"


    // $ANTLR start "rule__Properties__Group_5__0"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1116:1: rule__Properties__Group_5__0 : rule__Properties__Group_5__0__Impl rule__Properties__Group_5__1 ;
    public final void rule__Properties__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1120:1: ( rule__Properties__Group_5__0__Impl rule__Properties__Group_5__1 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1121:2: rule__Properties__Group_5__0__Impl rule__Properties__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Properties__Group_5__0__Impl_in_rule__Properties__Group_5__02170);
            rule__Properties__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Properties__Group_5__1_in_rule__Properties__Group_5__02173);
            rule__Properties__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group_5__0"


    // $ANTLR start "rule__Properties__Group_5__0__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1128:1: rule__Properties__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Properties__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1132:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1133:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1133:1: ( ',' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1134:1: ','
            {
             before(grammarAccess.getPropertiesAccess().getCommaKeyword_5_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Properties__Group_5__0__Impl2201); 
             after(grammarAccess.getPropertiesAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group_5__0__Impl"


    // $ANTLR start "rule__Properties__Group_5__1"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1147:1: rule__Properties__Group_5__1 : rule__Properties__Group_5__1__Impl ;
    public final void rule__Properties__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1151:1: ( rule__Properties__Group_5__1__Impl )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1152:2: rule__Properties__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Properties__Group_5__1__Impl_in_rule__Properties__Group_5__12232);
            rule__Properties__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group_5__1"


    // $ANTLR start "rule__Properties__Group_5__1__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1158:1: rule__Properties__Group_5__1__Impl : ( ( rule__Properties__AnyGenericElemAssignment_5_1 ) ) ;
    public final void rule__Properties__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1162:1: ( ( ( rule__Properties__AnyGenericElemAssignment_5_1 ) ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1163:1: ( ( rule__Properties__AnyGenericElemAssignment_5_1 ) )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1163:1: ( ( rule__Properties__AnyGenericElemAssignment_5_1 ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1164:1: ( rule__Properties__AnyGenericElemAssignment_5_1 )
            {
             before(grammarAccess.getPropertiesAccess().getAnyGenericElemAssignment_5_1()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1165:1: ( rule__Properties__AnyGenericElemAssignment_5_1 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1165:2: rule__Properties__AnyGenericElemAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Properties__AnyGenericElemAssignment_5_1_in_rule__Properties__Group_5__1__Impl2259);
            rule__Properties__AnyGenericElemAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertiesAccess().getAnyGenericElemAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group_5__1__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group__0"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1179:1: rule__AnyGenericElement__Group__0 : rule__AnyGenericElement__Group__0__Impl rule__AnyGenericElement__Group__1 ;
    public final void rule__AnyGenericElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1183:1: ( rule__AnyGenericElement__Group__0__Impl rule__AnyGenericElement__Group__1 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1184:2: rule__AnyGenericElement__Group__0__Impl rule__AnyGenericElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group__0__Impl_in_rule__AnyGenericElement__Group__02293);
            rule__AnyGenericElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group__1_in_rule__AnyGenericElement__Group__02296);
            rule__AnyGenericElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group__0"


    // $ANTLR start "rule__AnyGenericElement__Group__0__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1191:1: rule__AnyGenericElement__Group__0__Impl : ( () ) ;
    public final void rule__AnyGenericElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1195:1: ( ( () ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1196:1: ( () )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1196:1: ( () )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1197:1: ()
            {
             before(grammarAccess.getAnyGenericElementAccess().getAnyGenericElementAction_0()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1198:1: ()
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1200:1: 
            {
            }

             after(grammarAccess.getAnyGenericElementAccess().getAnyGenericElementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group__0__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group__1"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1210:1: rule__AnyGenericElement__Group__1 : rule__AnyGenericElement__Group__1__Impl rule__AnyGenericElement__Group__2 ;
    public final void rule__AnyGenericElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1214:1: ( rule__AnyGenericElement__Group__1__Impl rule__AnyGenericElement__Group__2 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1215:2: rule__AnyGenericElement__Group__1__Impl rule__AnyGenericElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group__1__Impl_in_rule__AnyGenericElement__Group__12354);
            rule__AnyGenericElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group__2_in_rule__AnyGenericElement__Group__12357);
            rule__AnyGenericElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group__1"


    // $ANTLR start "rule__AnyGenericElement__Group__1__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1222:1: rule__AnyGenericElement__Group__1__Impl : ( 'AnyGenericElement' ) ;
    public final void rule__AnyGenericElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1226:1: ( ( 'AnyGenericElement' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1227:1: ( 'AnyGenericElement' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1227:1: ( 'AnyGenericElement' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1228:1: 'AnyGenericElement'
            {
             before(grammarAccess.getAnyGenericElementAccess().getAnyGenericElementKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__AnyGenericElement__Group__1__Impl2385); 
             after(grammarAccess.getAnyGenericElementAccess().getAnyGenericElementKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group__1__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group__2"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1241:1: rule__AnyGenericElement__Group__2 : rule__AnyGenericElement__Group__2__Impl rule__AnyGenericElement__Group__3 ;
    public final void rule__AnyGenericElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1245:1: ( rule__AnyGenericElement__Group__2__Impl rule__AnyGenericElement__Group__3 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1246:2: rule__AnyGenericElement__Group__2__Impl rule__AnyGenericElement__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group__2__Impl_in_rule__AnyGenericElement__Group__22416);
            rule__AnyGenericElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group__3_in_rule__AnyGenericElement__Group__22419);
            rule__AnyGenericElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group__2"


    // $ANTLR start "rule__AnyGenericElement__Group__2__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1253:1: rule__AnyGenericElement__Group__2__Impl : ( '{' ) ;
    public final void rule__AnyGenericElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1257:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1258:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1258:1: ( '{' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1259:1: '{'
            {
             before(grammarAccess.getAnyGenericElementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__AnyGenericElement__Group__2__Impl2447); 
             after(grammarAccess.getAnyGenericElementAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group__2__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group__3"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1272:1: rule__AnyGenericElement__Group__3 : rule__AnyGenericElement__Group__3__Impl rule__AnyGenericElement__Group__4 ;
    public final void rule__AnyGenericElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1276:1: ( rule__AnyGenericElement__Group__3__Impl rule__AnyGenericElement__Group__4 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1277:2: rule__AnyGenericElement__Group__3__Impl rule__AnyGenericElement__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group__3__Impl_in_rule__AnyGenericElement__Group__32478);
            rule__AnyGenericElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group__4_in_rule__AnyGenericElement__Group__32481);
            rule__AnyGenericElement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group__3"


    // $ANTLR start "rule__AnyGenericElement__Group__3__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1284:1: rule__AnyGenericElement__Group__3__Impl : ( ( rule__AnyGenericElement__Group_3__0 )? ) ;
    public final void rule__AnyGenericElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1288:1: ( ( ( rule__AnyGenericElement__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1289:1: ( ( rule__AnyGenericElement__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1289:1: ( ( rule__AnyGenericElement__Group_3__0 )? )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1290:1: ( rule__AnyGenericElement__Group_3__0 )?
            {
             before(grammarAccess.getAnyGenericElementAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1291:1: ( rule__AnyGenericElement__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1291:2: rule__AnyGenericElement__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_3__0_in_rule__AnyGenericElement__Group__3__Impl2508);
                    rule__AnyGenericElement__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnyGenericElementAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group__3__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group__4"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1301:1: rule__AnyGenericElement__Group__4 : rule__AnyGenericElement__Group__4__Impl rule__AnyGenericElement__Group__5 ;
    public final void rule__AnyGenericElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1305:1: ( rule__AnyGenericElement__Group__4__Impl rule__AnyGenericElement__Group__5 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1306:2: rule__AnyGenericElement__Group__4__Impl rule__AnyGenericElement__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group__4__Impl_in_rule__AnyGenericElement__Group__42539);
            rule__AnyGenericElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group__5_in_rule__AnyGenericElement__Group__42542);
            rule__AnyGenericElement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group__4"


    // $ANTLR start "rule__AnyGenericElement__Group__4__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1313:1: rule__AnyGenericElement__Group__4__Impl : ( ( rule__AnyGenericElement__Group_4__0 )? ) ;
    public final void rule__AnyGenericElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1317:1: ( ( ( rule__AnyGenericElement__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1318:1: ( ( rule__AnyGenericElement__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1318:1: ( ( rule__AnyGenericElement__Group_4__0 )? )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1319:1: ( rule__AnyGenericElement__Group_4__0 )?
            {
             before(grammarAccess.getAnyGenericElementAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1320:1: ( rule__AnyGenericElement__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1320:2: rule__AnyGenericElement__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_4__0_in_rule__AnyGenericElement__Group__4__Impl2569);
                    rule__AnyGenericElement__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnyGenericElementAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group__4__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group__5"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1330:1: rule__AnyGenericElement__Group__5 : rule__AnyGenericElement__Group__5__Impl rule__AnyGenericElement__Group__6 ;
    public final void rule__AnyGenericElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1334:1: ( rule__AnyGenericElement__Group__5__Impl rule__AnyGenericElement__Group__6 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1335:2: rule__AnyGenericElement__Group__5__Impl rule__AnyGenericElement__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group__5__Impl_in_rule__AnyGenericElement__Group__52600);
            rule__AnyGenericElement__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group__6_in_rule__AnyGenericElement__Group__52603);
            rule__AnyGenericElement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group__5"


    // $ANTLR start "rule__AnyGenericElement__Group__5__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1342:1: rule__AnyGenericElement__Group__5__Impl : ( ( rule__AnyGenericElement__Group_5__0 )? ) ;
    public final void rule__AnyGenericElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1346:1: ( ( ( rule__AnyGenericElement__Group_5__0 )? ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1347:1: ( ( rule__AnyGenericElement__Group_5__0 )? )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1347:1: ( ( rule__AnyGenericElement__Group_5__0 )? )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1348:1: ( rule__AnyGenericElement__Group_5__0 )?
            {
             before(grammarAccess.getAnyGenericElementAccess().getGroup_5()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1349:1: ( rule__AnyGenericElement__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1349:2: rule__AnyGenericElement__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_5__0_in_rule__AnyGenericElement__Group__5__Impl2630);
                    rule__AnyGenericElement__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnyGenericElementAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group__5__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group__6"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1359:1: rule__AnyGenericElement__Group__6 : rule__AnyGenericElement__Group__6__Impl rule__AnyGenericElement__Group__7 ;
    public final void rule__AnyGenericElement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1363:1: ( rule__AnyGenericElement__Group__6__Impl rule__AnyGenericElement__Group__7 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1364:2: rule__AnyGenericElement__Group__6__Impl rule__AnyGenericElement__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group__6__Impl_in_rule__AnyGenericElement__Group__62661);
            rule__AnyGenericElement__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group__7_in_rule__AnyGenericElement__Group__62664);
            rule__AnyGenericElement__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group__6"


    // $ANTLR start "rule__AnyGenericElement__Group__6__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1371:1: rule__AnyGenericElement__Group__6__Impl : ( ( rule__AnyGenericElement__Group_6__0 )? ) ;
    public final void rule__AnyGenericElement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1375:1: ( ( ( rule__AnyGenericElement__Group_6__0 )? ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1376:1: ( ( rule__AnyGenericElement__Group_6__0 )? )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1376:1: ( ( rule__AnyGenericElement__Group_6__0 )? )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1377:1: ( rule__AnyGenericElement__Group_6__0 )?
            {
             before(grammarAccess.getAnyGenericElementAccess().getGroup_6()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1378:1: ( rule__AnyGenericElement__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1378:2: rule__AnyGenericElement__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_6__0_in_rule__AnyGenericElement__Group__6__Impl2691);
                    rule__AnyGenericElement__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnyGenericElementAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group__6__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group__7"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1388:1: rule__AnyGenericElement__Group__7 : rule__AnyGenericElement__Group__7__Impl ;
    public final void rule__AnyGenericElement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1392:1: ( rule__AnyGenericElement__Group__7__Impl )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1393:2: rule__AnyGenericElement__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group__7__Impl_in_rule__AnyGenericElement__Group__72722);
            rule__AnyGenericElement__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group__7"


    // $ANTLR start "rule__AnyGenericElement__Group__7__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1399:1: rule__AnyGenericElement__Group__7__Impl : ( '}' ) ;
    public final void rule__AnyGenericElement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1403:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1404:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1404:1: ( '}' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1405:1: '}'
            {
             before(grammarAccess.getAnyGenericElementAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__AnyGenericElement__Group__7__Impl2750); 
             after(grammarAccess.getAnyGenericElementAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group__7__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group_3__0"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1434:1: rule__AnyGenericElement__Group_3__0 : rule__AnyGenericElement__Group_3__0__Impl rule__AnyGenericElement__Group_3__1 ;
    public final void rule__AnyGenericElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1438:1: ( rule__AnyGenericElement__Group_3__0__Impl rule__AnyGenericElement__Group_3__1 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1439:2: rule__AnyGenericElement__Group_3__0__Impl rule__AnyGenericElement__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_3__0__Impl_in_rule__AnyGenericElement__Group_3__02797);
            rule__AnyGenericElement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_3__1_in_rule__AnyGenericElement__Group_3__02800);
            rule__AnyGenericElement__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_3__0"


    // $ANTLR start "rule__AnyGenericElement__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1446:1: rule__AnyGenericElement__Group_3__0__Impl : ( 'elemName' ) ;
    public final void rule__AnyGenericElement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1450:1: ( ( 'elemName' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1451:1: ( 'elemName' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1451:1: ( 'elemName' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1452:1: 'elemName'
            {
             before(grammarAccess.getAnyGenericElementAccess().getElemNameKeyword_3_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__AnyGenericElement__Group_3__0__Impl2828); 
             after(grammarAccess.getAnyGenericElementAccess().getElemNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_3__0__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group_3__1"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1465:1: rule__AnyGenericElement__Group_3__1 : rule__AnyGenericElement__Group_3__1__Impl ;
    public final void rule__AnyGenericElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1469:1: ( rule__AnyGenericElement__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1470:2: rule__AnyGenericElement__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_3__1__Impl_in_rule__AnyGenericElement__Group_3__12859);
            rule__AnyGenericElement__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_3__1"


    // $ANTLR start "rule__AnyGenericElement__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1476:1: rule__AnyGenericElement__Group_3__1__Impl : ( ( rule__AnyGenericElement__ElemNameAssignment_3_1 ) ) ;
    public final void rule__AnyGenericElement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1480:1: ( ( ( rule__AnyGenericElement__ElemNameAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1481:1: ( ( rule__AnyGenericElement__ElemNameAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1481:1: ( ( rule__AnyGenericElement__ElemNameAssignment_3_1 ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1482:1: ( rule__AnyGenericElement__ElemNameAssignment_3_1 )
            {
             before(grammarAccess.getAnyGenericElementAccess().getElemNameAssignment_3_1()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1483:1: ( rule__AnyGenericElement__ElemNameAssignment_3_1 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1483:2: rule__AnyGenericElement__ElemNameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__ElemNameAssignment_3_1_in_rule__AnyGenericElement__Group_3__1__Impl2886);
            rule__AnyGenericElement__ElemNameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAnyGenericElementAccess().getElemNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_3__1__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group_4__0"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1497:1: rule__AnyGenericElement__Group_4__0 : rule__AnyGenericElement__Group_4__0__Impl rule__AnyGenericElement__Group_4__1 ;
    public final void rule__AnyGenericElement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1501:1: ( rule__AnyGenericElement__Group_4__0__Impl rule__AnyGenericElement__Group_4__1 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1502:2: rule__AnyGenericElement__Group_4__0__Impl rule__AnyGenericElement__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_4__0__Impl_in_rule__AnyGenericElement__Group_4__02920);
            rule__AnyGenericElement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_4__1_in_rule__AnyGenericElement__Group_4__02923);
            rule__AnyGenericElement__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_4__0"


    // $ANTLR start "rule__AnyGenericElement__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1509:1: rule__AnyGenericElement__Group_4__0__Impl : ( 'elemValue' ) ;
    public final void rule__AnyGenericElement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1513:1: ( ( 'elemValue' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1514:1: ( 'elemValue' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1514:1: ( 'elemValue' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1515:1: 'elemValue'
            {
             before(grammarAccess.getAnyGenericElementAccess().getElemValueKeyword_4_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__AnyGenericElement__Group_4__0__Impl2951); 
             after(grammarAccess.getAnyGenericElementAccess().getElemValueKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_4__0__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group_4__1"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1528:1: rule__AnyGenericElement__Group_4__1 : rule__AnyGenericElement__Group_4__1__Impl ;
    public final void rule__AnyGenericElement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1532:1: ( rule__AnyGenericElement__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1533:2: rule__AnyGenericElement__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_4__1__Impl_in_rule__AnyGenericElement__Group_4__12982);
            rule__AnyGenericElement__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_4__1"


    // $ANTLR start "rule__AnyGenericElement__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1539:1: rule__AnyGenericElement__Group_4__1__Impl : ( ( rule__AnyGenericElement__ElemValueAssignment_4_1 ) ) ;
    public final void rule__AnyGenericElement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1543:1: ( ( ( rule__AnyGenericElement__ElemValueAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1544:1: ( ( rule__AnyGenericElement__ElemValueAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1544:1: ( ( rule__AnyGenericElement__ElemValueAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1545:1: ( rule__AnyGenericElement__ElemValueAssignment_4_1 )
            {
             before(grammarAccess.getAnyGenericElementAccess().getElemValueAssignment_4_1()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1546:1: ( rule__AnyGenericElement__ElemValueAssignment_4_1 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1546:2: rule__AnyGenericElement__ElemValueAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__ElemValueAssignment_4_1_in_rule__AnyGenericElement__Group_4__1__Impl3009);
            rule__AnyGenericElement__ElemValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAnyGenericElementAccess().getElemValueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_4__1__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group_5__0"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1560:1: rule__AnyGenericElement__Group_5__0 : rule__AnyGenericElement__Group_5__0__Impl rule__AnyGenericElement__Group_5__1 ;
    public final void rule__AnyGenericElement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1564:1: ( rule__AnyGenericElement__Group_5__0__Impl rule__AnyGenericElement__Group_5__1 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1565:2: rule__AnyGenericElement__Group_5__0__Impl rule__AnyGenericElement__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_5__0__Impl_in_rule__AnyGenericElement__Group_5__03043);
            rule__AnyGenericElement__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_5__1_in_rule__AnyGenericElement__Group_5__03046);
            rule__AnyGenericElement__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_5__0"


    // $ANTLR start "rule__AnyGenericElement__Group_5__0__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1572:1: rule__AnyGenericElement__Group_5__0__Impl : ( 'anyGenericAttr' ) ;
    public final void rule__AnyGenericElement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1576:1: ( ( 'anyGenericAttr' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1577:1: ( 'anyGenericAttr' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1577:1: ( 'anyGenericAttr' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1578:1: 'anyGenericAttr'
            {
             before(grammarAccess.getAnyGenericElementAccess().getAnyGenericAttrKeyword_5_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__AnyGenericElement__Group_5__0__Impl3074); 
             after(grammarAccess.getAnyGenericElementAccess().getAnyGenericAttrKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_5__0__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group_5__1"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1591:1: rule__AnyGenericElement__Group_5__1 : rule__AnyGenericElement__Group_5__1__Impl rule__AnyGenericElement__Group_5__2 ;
    public final void rule__AnyGenericElement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1595:1: ( rule__AnyGenericElement__Group_5__1__Impl rule__AnyGenericElement__Group_5__2 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1596:2: rule__AnyGenericElement__Group_5__1__Impl rule__AnyGenericElement__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_5__1__Impl_in_rule__AnyGenericElement__Group_5__13105);
            rule__AnyGenericElement__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_5__2_in_rule__AnyGenericElement__Group_5__13108);
            rule__AnyGenericElement__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_5__1"


    // $ANTLR start "rule__AnyGenericElement__Group_5__1__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1603:1: rule__AnyGenericElement__Group_5__1__Impl : ( '{' ) ;
    public final void rule__AnyGenericElement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1607:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1608:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1608:1: ( '{' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1609:1: '{'
            {
             before(grammarAccess.getAnyGenericElementAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__AnyGenericElement__Group_5__1__Impl3136); 
             after(grammarAccess.getAnyGenericElementAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_5__1__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group_5__2"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1622:1: rule__AnyGenericElement__Group_5__2 : rule__AnyGenericElement__Group_5__2__Impl rule__AnyGenericElement__Group_5__3 ;
    public final void rule__AnyGenericElement__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1626:1: ( rule__AnyGenericElement__Group_5__2__Impl rule__AnyGenericElement__Group_5__3 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1627:2: rule__AnyGenericElement__Group_5__2__Impl rule__AnyGenericElement__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_5__2__Impl_in_rule__AnyGenericElement__Group_5__23167);
            rule__AnyGenericElement__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_5__3_in_rule__AnyGenericElement__Group_5__23170);
            rule__AnyGenericElement__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_5__2"


    // $ANTLR start "rule__AnyGenericElement__Group_5__2__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1634:1: rule__AnyGenericElement__Group_5__2__Impl : ( ( rule__AnyGenericElement__AnyGenericAttrAssignment_5_2 ) ) ;
    public final void rule__AnyGenericElement__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1638:1: ( ( ( rule__AnyGenericElement__AnyGenericAttrAssignment_5_2 ) ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1639:1: ( ( rule__AnyGenericElement__AnyGenericAttrAssignment_5_2 ) )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1639:1: ( ( rule__AnyGenericElement__AnyGenericAttrAssignment_5_2 ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1640:1: ( rule__AnyGenericElement__AnyGenericAttrAssignment_5_2 )
            {
             before(grammarAccess.getAnyGenericElementAccess().getAnyGenericAttrAssignment_5_2()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1641:1: ( rule__AnyGenericElement__AnyGenericAttrAssignment_5_2 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1641:2: rule__AnyGenericElement__AnyGenericAttrAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__AnyGenericAttrAssignment_5_2_in_rule__AnyGenericElement__Group_5__2__Impl3197);
            rule__AnyGenericElement__AnyGenericAttrAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getAnyGenericElementAccess().getAnyGenericAttrAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_5__2__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group_5__3"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1651:1: rule__AnyGenericElement__Group_5__3 : rule__AnyGenericElement__Group_5__3__Impl rule__AnyGenericElement__Group_5__4 ;
    public final void rule__AnyGenericElement__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1655:1: ( rule__AnyGenericElement__Group_5__3__Impl rule__AnyGenericElement__Group_5__4 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1656:2: rule__AnyGenericElement__Group_5__3__Impl rule__AnyGenericElement__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_5__3__Impl_in_rule__AnyGenericElement__Group_5__33227);
            rule__AnyGenericElement__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_5__4_in_rule__AnyGenericElement__Group_5__33230);
            rule__AnyGenericElement__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_5__3"


    // $ANTLR start "rule__AnyGenericElement__Group_5__3__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1663:1: rule__AnyGenericElement__Group_5__3__Impl : ( ( rule__AnyGenericElement__Group_5_3__0 )* ) ;
    public final void rule__AnyGenericElement__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1667:1: ( ( ( rule__AnyGenericElement__Group_5_3__0 )* ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1668:1: ( ( rule__AnyGenericElement__Group_5_3__0 )* )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1668:1: ( ( rule__AnyGenericElement__Group_5_3__0 )* )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1669:1: ( rule__AnyGenericElement__Group_5_3__0 )*
            {
             before(grammarAccess.getAnyGenericElementAccess().getGroup_5_3()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1670:1: ( rule__AnyGenericElement__Group_5_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1670:2: rule__AnyGenericElement__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_5_3__0_in_rule__AnyGenericElement__Group_5__3__Impl3257);
            	    rule__AnyGenericElement__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getAnyGenericElementAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_5__3__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group_5__4"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1680:1: rule__AnyGenericElement__Group_5__4 : rule__AnyGenericElement__Group_5__4__Impl ;
    public final void rule__AnyGenericElement__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1684:1: ( rule__AnyGenericElement__Group_5__4__Impl )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1685:2: rule__AnyGenericElement__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_5__4__Impl_in_rule__AnyGenericElement__Group_5__43288);
            rule__AnyGenericElement__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_5__4"


    // $ANTLR start "rule__AnyGenericElement__Group_5__4__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1691:1: rule__AnyGenericElement__Group_5__4__Impl : ( '}' ) ;
    public final void rule__AnyGenericElement__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1695:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1696:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1696:1: ( '}' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1697:1: '}'
            {
             before(grammarAccess.getAnyGenericElementAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__AnyGenericElement__Group_5__4__Impl3316); 
             after(grammarAccess.getAnyGenericElementAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_5__4__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group_5_3__0"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1720:1: rule__AnyGenericElement__Group_5_3__0 : rule__AnyGenericElement__Group_5_3__0__Impl rule__AnyGenericElement__Group_5_3__1 ;
    public final void rule__AnyGenericElement__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1724:1: ( rule__AnyGenericElement__Group_5_3__0__Impl rule__AnyGenericElement__Group_5_3__1 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1725:2: rule__AnyGenericElement__Group_5_3__0__Impl rule__AnyGenericElement__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_5_3__0__Impl_in_rule__AnyGenericElement__Group_5_3__03357);
            rule__AnyGenericElement__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_5_3__1_in_rule__AnyGenericElement__Group_5_3__03360);
            rule__AnyGenericElement__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_5_3__0"


    // $ANTLR start "rule__AnyGenericElement__Group_5_3__0__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1732:1: rule__AnyGenericElement__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__AnyGenericElement__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1736:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1737:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1737:1: ( ',' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1738:1: ','
            {
             before(grammarAccess.getAnyGenericElementAccess().getCommaKeyword_5_3_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__AnyGenericElement__Group_5_3__0__Impl3388); 
             after(grammarAccess.getAnyGenericElementAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_5_3__0__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group_5_3__1"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1751:1: rule__AnyGenericElement__Group_5_3__1 : rule__AnyGenericElement__Group_5_3__1__Impl ;
    public final void rule__AnyGenericElement__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1755:1: ( rule__AnyGenericElement__Group_5_3__1__Impl )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1756:2: rule__AnyGenericElement__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_5_3__1__Impl_in_rule__AnyGenericElement__Group_5_3__13419);
            rule__AnyGenericElement__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_5_3__1"


    // $ANTLR start "rule__AnyGenericElement__Group_5_3__1__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1762:1: rule__AnyGenericElement__Group_5_3__1__Impl : ( ( rule__AnyGenericElement__AnyGenericAttrAssignment_5_3_1 ) ) ;
    public final void rule__AnyGenericElement__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1766:1: ( ( ( rule__AnyGenericElement__AnyGenericAttrAssignment_5_3_1 ) ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1767:1: ( ( rule__AnyGenericElement__AnyGenericAttrAssignment_5_3_1 ) )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1767:1: ( ( rule__AnyGenericElement__AnyGenericAttrAssignment_5_3_1 ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1768:1: ( rule__AnyGenericElement__AnyGenericAttrAssignment_5_3_1 )
            {
             before(grammarAccess.getAnyGenericElementAccess().getAnyGenericAttrAssignment_5_3_1()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1769:1: ( rule__AnyGenericElement__AnyGenericAttrAssignment_5_3_1 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1769:2: rule__AnyGenericElement__AnyGenericAttrAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__AnyGenericAttrAssignment_5_3_1_in_rule__AnyGenericElement__Group_5_3__1__Impl3446);
            rule__AnyGenericElement__AnyGenericAttrAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAnyGenericElementAccess().getAnyGenericAttrAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_5_3__1__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group_6__0"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1783:1: rule__AnyGenericElement__Group_6__0 : rule__AnyGenericElement__Group_6__0__Impl rule__AnyGenericElement__Group_6__1 ;
    public final void rule__AnyGenericElement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1787:1: ( rule__AnyGenericElement__Group_6__0__Impl rule__AnyGenericElement__Group_6__1 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1788:2: rule__AnyGenericElement__Group_6__0__Impl rule__AnyGenericElement__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_6__0__Impl_in_rule__AnyGenericElement__Group_6__03480);
            rule__AnyGenericElement__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_6__1_in_rule__AnyGenericElement__Group_6__03483);
            rule__AnyGenericElement__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_6__0"


    // $ANTLR start "rule__AnyGenericElement__Group_6__0__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1795:1: rule__AnyGenericElement__Group_6__0__Impl : ( 'childElem' ) ;
    public final void rule__AnyGenericElement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1799:1: ( ( 'childElem' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1800:1: ( 'childElem' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1800:1: ( 'childElem' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1801:1: 'childElem'
            {
             before(grammarAccess.getAnyGenericElementAccess().getChildElemKeyword_6_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__AnyGenericElement__Group_6__0__Impl3511); 
             after(grammarAccess.getAnyGenericElementAccess().getChildElemKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_6__0__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group_6__1"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1814:1: rule__AnyGenericElement__Group_6__1 : rule__AnyGenericElement__Group_6__1__Impl rule__AnyGenericElement__Group_6__2 ;
    public final void rule__AnyGenericElement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1818:1: ( rule__AnyGenericElement__Group_6__1__Impl rule__AnyGenericElement__Group_6__2 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1819:2: rule__AnyGenericElement__Group_6__1__Impl rule__AnyGenericElement__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_6__1__Impl_in_rule__AnyGenericElement__Group_6__13542);
            rule__AnyGenericElement__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_6__2_in_rule__AnyGenericElement__Group_6__13545);
            rule__AnyGenericElement__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_6__1"


    // $ANTLR start "rule__AnyGenericElement__Group_6__1__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1826:1: rule__AnyGenericElement__Group_6__1__Impl : ( '{' ) ;
    public final void rule__AnyGenericElement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1830:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1831:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1831:1: ( '{' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1832:1: '{'
            {
             before(grammarAccess.getAnyGenericElementAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__AnyGenericElement__Group_6__1__Impl3573); 
             after(grammarAccess.getAnyGenericElementAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_6__1__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group_6__2"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1845:1: rule__AnyGenericElement__Group_6__2 : rule__AnyGenericElement__Group_6__2__Impl rule__AnyGenericElement__Group_6__3 ;
    public final void rule__AnyGenericElement__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1849:1: ( rule__AnyGenericElement__Group_6__2__Impl rule__AnyGenericElement__Group_6__3 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1850:2: rule__AnyGenericElement__Group_6__2__Impl rule__AnyGenericElement__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_6__2__Impl_in_rule__AnyGenericElement__Group_6__23604);
            rule__AnyGenericElement__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_6__3_in_rule__AnyGenericElement__Group_6__23607);
            rule__AnyGenericElement__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_6__2"


    // $ANTLR start "rule__AnyGenericElement__Group_6__2__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1857:1: rule__AnyGenericElement__Group_6__2__Impl : ( ( rule__AnyGenericElement__ChildElemAssignment_6_2 ) ) ;
    public final void rule__AnyGenericElement__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1861:1: ( ( ( rule__AnyGenericElement__ChildElemAssignment_6_2 ) ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1862:1: ( ( rule__AnyGenericElement__ChildElemAssignment_6_2 ) )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1862:1: ( ( rule__AnyGenericElement__ChildElemAssignment_6_2 ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1863:1: ( rule__AnyGenericElement__ChildElemAssignment_6_2 )
            {
             before(grammarAccess.getAnyGenericElementAccess().getChildElemAssignment_6_2()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1864:1: ( rule__AnyGenericElement__ChildElemAssignment_6_2 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1864:2: rule__AnyGenericElement__ChildElemAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__ChildElemAssignment_6_2_in_rule__AnyGenericElement__Group_6__2__Impl3634);
            rule__AnyGenericElement__ChildElemAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getAnyGenericElementAccess().getChildElemAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_6__2__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group_6__3"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1874:1: rule__AnyGenericElement__Group_6__3 : rule__AnyGenericElement__Group_6__3__Impl rule__AnyGenericElement__Group_6__4 ;
    public final void rule__AnyGenericElement__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1878:1: ( rule__AnyGenericElement__Group_6__3__Impl rule__AnyGenericElement__Group_6__4 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1879:2: rule__AnyGenericElement__Group_6__3__Impl rule__AnyGenericElement__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_6__3__Impl_in_rule__AnyGenericElement__Group_6__33664);
            rule__AnyGenericElement__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_6__4_in_rule__AnyGenericElement__Group_6__33667);
            rule__AnyGenericElement__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_6__3"


    // $ANTLR start "rule__AnyGenericElement__Group_6__3__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1886:1: rule__AnyGenericElement__Group_6__3__Impl : ( ( rule__AnyGenericElement__Group_6_3__0 )* ) ;
    public final void rule__AnyGenericElement__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1890:1: ( ( ( rule__AnyGenericElement__Group_6_3__0 )* ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1891:1: ( ( rule__AnyGenericElement__Group_6_3__0 )* )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1891:1: ( ( rule__AnyGenericElement__Group_6_3__0 )* )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1892:1: ( rule__AnyGenericElement__Group_6_3__0 )*
            {
             before(grammarAccess.getAnyGenericElementAccess().getGroup_6_3()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1893:1: ( rule__AnyGenericElement__Group_6_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1893:2: rule__AnyGenericElement__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_6_3__0_in_rule__AnyGenericElement__Group_6__3__Impl3694);
            	    rule__AnyGenericElement__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAnyGenericElementAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_6__3__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group_6__4"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1903:1: rule__AnyGenericElement__Group_6__4 : rule__AnyGenericElement__Group_6__4__Impl ;
    public final void rule__AnyGenericElement__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1907:1: ( rule__AnyGenericElement__Group_6__4__Impl )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1908:2: rule__AnyGenericElement__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_6__4__Impl_in_rule__AnyGenericElement__Group_6__43725);
            rule__AnyGenericElement__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_6__4"


    // $ANTLR start "rule__AnyGenericElement__Group_6__4__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1914:1: rule__AnyGenericElement__Group_6__4__Impl : ( '}' ) ;
    public final void rule__AnyGenericElement__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1918:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1919:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1919:1: ( '}' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1920:1: '}'
            {
             before(grammarAccess.getAnyGenericElementAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__AnyGenericElement__Group_6__4__Impl3753); 
             after(grammarAccess.getAnyGenericElementAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_6__4__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group_6_3__0"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1943:1: rule__AnyGenericElement__Group_6_3__0 : rule__AnyGenericElement__Group_6_3__0__Impl rule__AnyGenericElement__Group_6_3__1 ;
    public final void rule__AnyGenericElement__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1947:1: ( rule__AnyGenericElement__Group_6_3__0__Impl rule__AnyGenericElement__Group_6_3__1 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1948:2: rule__AnyGenericElement__Group_6_3__0__Impl rule__AnyGenericElement__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_6_3__0__Impl_in_rule__AnyGenericElement__Group_6_3__03794);
            rule__AnyGenericElement__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_6_3__1_in_rule__AnyGenericElement__Group_6_3__03797);
            rule__AnyGenericElement__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_6_3__0"


    // $ANTLR start "rule__AnyGenericElement__Group_6_3__0__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1955:1: rule__AnyGenericElement__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__AnyGenericElement__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1959:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1960:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1960:1: ( ',' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1961:1: ','
            {
             before(grammarAccess.getAnyGenericElementAccess().getCommaKeyword_6_3_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__AnyGenericElement__Group_6_3__0__Impl3825); 
             after(grammarAccess.getAnyGenericElementAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_6_3__0__Impl"


    // $ANTLR start "rule__AnyGenericElement__Group_6_3__1"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1974:1: rule__AnyGenericElement__Group_6_3__1 : rule__AnyGenericElement__Group_6_3__1__Impl ;
    public final void rule__AnyGenericElement__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1978:1: ( rule__AnyGenericElement__Group_6_3__1__Impl )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1979:2: rule__AnyGenericElement__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__Group_6_3__1__Impl_in_rule__AnyGenericElement__Group_6_3__13856);
            rule__AnyGenericElement__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_6_3__1"


    // $ANTLR start "rule__AnyGenericElement__Group_6_3__1__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1985:1: rule__AnyGenericElement__Group_6_3__1__Impl : ( ( rule__AnyGenericElement__ChildElemAssignment_6_3_1 ) ) ;
    public final void rule__AnyGenericElement__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1989:1: ( ( ( rule__AnyGenericElement__ChildElemAssignment_6_3_1 ) ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1990:1: ( ( rule__AnyGenericElement__ChildElemAssignment_6_3_1 ) )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1990:1: ( ( rule__AnyGenericElement__ChildElemAssignment_6_3_1 ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1991:1: ( rule__AnyGenericElement__ChildElemAssignment_6_3_1 )
            {
             before(grammarAccess.getAnyGenericElementAccess().getChildElemAssignment_6_3_1()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1992:1: ( rule__AnyGenericElement__ChildElemAssignment_6_3_1 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:1992:2: rule__AnyGenericElement__ChildElemAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericElement__ChildElemAssignment_6_3_1_in_rule__AnyGenericElement__Group_6_3__1__Impl3883);
            rule__AnyGenericElement__ChildElemAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAnyGenericElementAccess().getChildElemAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__Group_6_3__1__Impl"


    // $ANTLR start "rule__AnyGenericText__Group__0"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2006:1: rule__AnyGenericText__Group__0 : rule__AnyGenericText__Group__0__Impl rule__AnyGenericText__Group__1 ;
    public final void rule__AnyGenericText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2010:1: ( rule__AnyGenericText__Group__0__Impl rule__AnyGenericText__Group__1 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2011:2: rule__AnyGenericText__Group__0__Impl rule__AnyGenericText__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericText__Group__0__Impl_in_rule__AnyGenericText__Group__03917);
            rule__AnyGenericText__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericText__Group__1_in_rule__AnyGenericText__Group__03920);
            rule__AnyGenericText__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericText__Group__0"


    // $ANTLR start "rule__AnyGenericText__Group__0__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2018:1: rule__AnyGenericText__Group__0__Impl : ( () ) ;
    public final void rule__AnyGenericText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2022:1: ( ( () ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2023:1: ( () )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2023:1: ( () )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2024:1: ()
            {
             before(grammarAccess.getAnyGenericTextAccess().getAnyGenericTextAction_0()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2025:1: ()
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2027:1: 
            {
            }

             after(grammarAccess.getAnyGenericTextAccess().getAnyGenericTextAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericText__Group__0__Impl"


    // $ANTLR start "rule__AnyGenericText__Group__1"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2037:1: rule__AnyGenericText__Group__1 : rule__AnyGenericText__Group__1__Impl rule__AnyGenericText__Group__2 ;
    public final void rule__AnyGenericText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2041:1: ( rule__AnyGenericText__Group__1__Impl rule__AnyGenericText__Group__2 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2042:2: rule__AnyGenericText__Group__1__Impl rule__AnyGenericText__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericText__Group__1__Impl_in_rule__AnyGenericText__Group__13978);
            rule__AnyGenericText__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericText__Group__2_in_rule__AnyGenericText__Group__13981);
            rule__AnyGenericText__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericText__Group__1"


    // $ANTLR start "rule__AnyGenericText__Group__1__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2049:1: rule__AnyGenericText__Group__1__Impl : ( 'AnyGenericText' ) ;
    public final void rule__AnyGenericText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2053:1: ( ( 'AnyGenericText' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2054:1: ( 'AnyGenericText' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2054:1: ( 'AnyGenericText' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2055:1: 'AnyGenericText'
            {
             before(grammarAccess.getAnyGenericTextAccess().getAnyGenericTextKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__AnyGenericText__Group__1__Impl4009); 
             after(grammarAccess.getAnyGenericTextAccess().getAnyGenericTextKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericText__Group__1__Impl"


    // $ANTLR start "rule__AnyGenericText__Group__2"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2068:1: rule__AnyGenericText__Group__2 : rule__AnyGenericText__Group__2__Impl rule__AnyGenericText__Group__3 ;
    public final void rule__AnyGenericText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2072:1: ( rule__AnyGenericText__Group__2__Impl rule__AnyGenericText__Group__3 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2073:2: rule__AnyGenericText__Group__2__Impl rule__AnyGenericText__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericText__Group__2__Impl_in_rule__AnyGenericText__Group__24040);
            rule__AnyGenericText__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericText__Group__3_in_rule__AnyGenericText__Group__24043);
            rule__AnyGenericText__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericText__Group__2"


    // $ANTLR start "rule__AnyGenericText__Group__2__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2080:1: rule__AnyGenericText__Group__2__Impl : ( '{' ) ;
    public final void rule__AnyGenericText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2084:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2085:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2085:1: ( '{' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2086:1: '{'
            {
             before(grammarAccess.getAnyGenericTextAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__AnyGenericText__Group__2__Impl4071); 
             after(grammarAccess.getAnyGenericTextAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericText__Group__2__Impl"


    // $ANTLR start "rule__AnyGenericText__Group__3"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2099:1: rule__AnyGenericText__Group__3 : rule__AnyGenericText__Group__3__Impl rule__AnyGenericText__Group__4 ;
    public final void rule__AnyGenericText__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2103:1: ( rule__AnyGenericText__Group__3__Impl rule__AnyGenericText__Group__4 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2104:2: rule__AnyGenericText__Group__3__Impl rule__AnyGenericText__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericText__Group__3__Impl_in_rule__AnyGenericText__Group__34102);
            rule__AnyGenericText__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericText__Group__4_in_rule__AnyGenericText__Group__34105);
            rule__AnyGenericText__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericText__Group__3"


    // $ANTLR start "rule__AnyGenericText__Group__3__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2111:1: rule__AnyGenericText__Group__3__Impl : ( ( rule__AnyGenericText__Group_3__0 )? ) ;
    public final void rule__AnyGenericText__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2115:1: ( ( ( rule__AnyGenericText__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2116:1: ( ( rule__AnyGenericText__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2116:1: ( ( rule__AnyGenericText__Group_3__0 )? )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2117:1: ( rule__AnyGenericText__Group_3__0 )?
            {
             before(grammarAccess.getAnyGenericTextAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2118:1: ( rule__AnyGenericText__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2118:2: rule__AnyGenericText__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AnyGenericText__Group_3__0_in_rule__AnyGenericText__Group__3__Impl4132);
                    rule__AnyGenericText__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnyGenericTextAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericText__Group__3__Impl"


    // $ANTLR start "rule__AnyGenericText__Group__4"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2128:1: rule__AnyGenericText__Group__4 : rule__AnyGenericText__Group__4__Impl ;
    public final void rule__AnyGenericText__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2132:1: ( rule__AnyGenericText__Group__4__Impl )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2133:2: rule__AnyGenericText__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericText__Group__4__Impl_in_rule__AnyGenericText__Group__44163);
            rule__AnyGenericText__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericText__Group__4"


    // $ANTLR start "rule__AnyGenericText__Group__4__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2139:1: rule__AnyGenericText__Group__4__Impl : ( '}' ) ;
    public final void rule__AnyGenericText__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2143:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2144:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2144:1: ( '}' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2145:1: '}'
            {
             before(grammarAccess.getAnyGenericTextAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__AnyGenericText__Group__4__Impl4191); 
             after(grammarAccess.getAnyGenericTextAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericText__Group__4__Impl"


    // $ANTLR start "rule__AnyGenericText__Group_3__0"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2168:1: rule__AnyGenericText__Group_3__0 : rule__AnyGenericText__Group_3__0__Impl rule__AnyGenericText__Group_3__1 ;
    public final void rule__AnyGenericText__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2172:1: ( rule__AnyGenericText__Group_3__0__Impl rule__AnyGenericText__Group_3__1 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2173:2: rule__AnyGenericText__Group_3__0__Impl rule__AnyGenericText__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericText__Group_3__0__Impl_in_rule__AnyGenericText__Group_3__04232);
            rule__AnyGenericText__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericText__Group_3__1_in_rule__AnyGenericText__Group_3__04235);
            rule__AnyGenericText__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericText__Group_3__0"


    // $ANTLR start "rule__AnyGenericText__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2180:1: rule__AnyGenericText__Group_3__0__Impl : ( 'textValue' ) ;
    public final void rule__AnyGenericText__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2184:1: ( ( 'textValue' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2185:1: ( 'textValue' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2185:1: ( 'textValue' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2186:1: 'textValue'
            {
             before(grammarAccess.getAnyGenericTextAccess().getTextValueKeyword_3_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__AnyGenericText__Group_3__0__Impl4263); 
             after(grammarAccess.getAnyGenericTextAccess().getTextValueKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericText__Group_3__0__Impl"


    // $ANTLR start "rule__AnyGenericText__Group_3__1"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2199:1: rule__AnyGenericText__Group_3__1 : rule__AnyGenericText__Group_3__1__Impl ;
    public final void rule__AnyGenericText__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2203:1: ( rule__AnyGenericText__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2204:2: rule__AnyGenericText__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericText__Group_3__1__Impl_in_rule__AnyGenericText__Group_3__14294);
            rule__AnyGenericText__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericText__Group_3__1"


    // $ANTLR start "rule__AnyGenericText__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2210:1: rule__AnyGenericText__Group_3__1__Impl : ( ( rule__AnyGenericText__TextValueAssignment_3_1 ) ) ;
    public final void rule__AnyGenericText__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2214:1: ( ( ( rule__AnyGenericText__TextValueAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2215:1: ( ( rule__AnyGenericText__TextValueAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2215:1: ( ( rule__AnyGenericText__TextValueAssignment_3_1 ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2216:1: ( rule__AnyGenericText__TextValueAssignment_3_1 )
            {
             before(grammarAccess.getAnyGenericTextAccess().getTextValueAssignment_3_1()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2217:1: ( rule__AnyGenericText__TextValueAssignment_3_1 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2217:2: rule__AnyGenericText__TextValueAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericText__TextValueAssignment_3_1_in_rule__AnyGenericText__Group_3__1__Impl4321);
            rule__AnyGenericText__TextValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAnyGenericTextAccess().getTextValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericText__Group_3__1__Impl"


    // $ANTLR start "rule__AnyGenericAttribute__Group__0"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2231:1: rule__AnyGenericAttribute__Group__0 : rule__AnyGenericAttribute__Group__0__Impl rule__AnyGenericAttribute__Group__1 ;
    public final void rule__AnyGenericAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2235:1: ( rule__AnyGenericAttribute__Group__0__Impl rule__AnyGenericAttribute__Group__1 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2236:2: rule__AnyGenericAttribute__Group__0__Impl rule__AnyGenericAttribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericAttribute__Group__0__Impl_in_rule__AnyGenericAttribute__Group__04355);
            rule__AnyGenericAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericAttribute__Group__1_in_rule__AnyGenericAttribute__Group__04358);
            rule__AnyGenericAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericAttribute__Group__0"


    // $ANTLR start "rule__AnyGenericAttribute__Group__0__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2243:1: rule__AnyGenericAttribute__Group__0__Impl : ( 'AnyGenericAttribute' ) ;
    public final void rule__AnyGenericAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2247:1: ( ( 'AnyGenericAttribute' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2248:1: ( 'AnyGenericAttribute' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2248:1: ( 'AnyGenericAttribute' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2249:1: 'AnyGenericAttribute'
            {
             before(grammarAccess.getAnyGenericAttributeAccess().getAnyGenericAttributeKeyword_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__AnyGenericAttribute__Group__0__Impl4386); 
             after(grammarAccess.getAnyGenericAttributeAccess().getAnyGenericAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericAttribute__Group__0__Impl"


    // $ANTLR start "rule__AnyGenericAttribute__Group__1"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2262:1: rule__AnyGenericAttribute__Group__1 : rule__AnyGenericAttribute__Group__1__Impl rule__AnyGenericAttribute__Group__2 ;
    public final void rule__AnyGenericAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2266:1: ( rule__AnyGenericAttribute__Group__1__Impl rule__AnyGenericAttribute__Group__2 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2267:2: rule__AnyGenericAttribute__Group__1__Impl rule__AnyGenericAttribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericAttribute__Group__1__Impl_in_rule__AnyGenericAttribute__Group__14417);
            rule__AnyGenericAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericAttribute__Group__2_in_rule__AnyGenericAttribute__Group__14420);
            rule__AnyGenericAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericAttribute__Group__1"


    // $ANTLR start "rule__AnyGenericAttribute__Group__1__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2274:1: rule__AnyGenericAttribute__Group__1__Impl : ( '{' ) ;
    public final void rule__AnyGenericAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2278:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2279:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2279:1: ( '{' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2280:1: '{'
            {
             before(grammarAccess.getAnyGenericAttributeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__AnyGenericAttribute__Group__1__Impl4448); 
             after(grammarAccess.getAnyGenericAttributeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericAttribute__Group__1__Impl"


    // $ANTLR start "rule__AnyGenericAttribute__Group__2"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2293:1: rule__AnyGenericAttribute__Group__2 : rule__AnyGenericAttribute__Group__2__Impl rule__AnyGenericAttribute__Group__3 ;
    public final void rule__AnyGenericAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2297:1: ( rule__AnyGenericAttribute__Group__2__Impl rule__AnyGenericAttribute__Group__3 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2298:2: rule__AnyGenericAttribute__Group__2__Impl rule__AnyGenericAttribute__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericAttribute__Group__2__Impl_in_rule__AnyGenericAttribute__Group__24479);
            rule__AnyGenericAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericAttribute__Group__3_in_rule__AnyGenericAttribute__Group__24482);
            rule__AnyGenericAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericAttribute__Group__2"


    // $ANTLR start "rule__AnyGenericAttribute__Group__2__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2305:1: rule__AnyGenericAttribute__Group__2__Impl : ( 'attrName' ) ;
    public final void rule__AnyGenericAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2309:1: ( ( 'attrName' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2310:1: ( 'attrName' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2310:1: ( 'attrName' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2311:1: 'attrName'
            {
             before(grammarAccess.getAnyGenericAttributeAccess().getAttrNameKeyword_2()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__AnyGenericAttribute__Group__2__Impl4510); 
             after(grammarAccess.getAnyGenericAttributeAccess().getAttrNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericAttribute__Group__2__Impl"


    // $ANTLR start "rule__AnyGenericAttribute__Group__3"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2324:1: rule__AnyGenericAttribute__Group__3 : rule__AnyGenericAttribute__Group__3__Impl rule__AnyGenericAttribute__Group__4 ;
    public final void rule__AnyGenericAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2328:1: ( rule__AnyGenericAttribute__Group__3__Impl rule__AnyGenericAttribute__Group__4 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2329:2: rule__AnyGenericAttribute__Group__3__Impl rule__AnyGenericAttribute__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericAttribute__Group__3__Impl_in_rule__AnyGenericAttribute__Group__34541);
            rule__AnyGenericAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericAttribute__Group__4_in_rule__AnyGenericAttribute__Group__34544);
            rule__AnyGenericAttribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericAttribute__Group__3"


    // $ANTLR start "rule__AnyGenericAttribute__Group__3__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2336:1: rule__AnyGenericAttribute__Group__3__Impl : ( ( rule__AnyGenericAttribute__AttrNameAssignment_3 ) ) ;
    public final void rule__AnyGenericAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2340:1: ( ( ( rule__AnyGenericAttribute__AttrNameAssignment_3 ) ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2341:1: ( ( rule__AnyGenericAttribute__AttrNameAssignment_3 ) )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2341:1: ( ( rule__AnyGenericAttribute__AttrNameAssignment_3 ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2342:1: ( rule__AnyGenericAttribute__AttrNameAssignment_3 )
            {
             before(grammarAccess.getAnyGenericAttributeAccess().getAttrNameAssignment_3()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2343:1: ( rule__AnyGenericAttribute__AttrNameAssignment_3 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2343:2: rule__AnyGenericAttribute__AttrNameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericAttribute__AttrNameAssignment_3_in_rule__AnyGenericAttribute__Group__3__Impl4571);
            rule__AnyGenericAttribute__AttrNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAnyGenericAttributeAccess().getAttrNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericAttribute__Group__3__Impl"


    // $ANTLR start "rule__AnyGenericAttribute__Group__4"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2353:1: rule__AnyGenericAttribute__Group__4 : rule__AnyGenericAttribute__Group__4__Impl rule__AnyGenericAttribute__Group__5 ;
    public final void rule__AnyGenericAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2357:1: ( rule__AnyGenericAttribute__Group__4__Impl rule__AnyGenericAttribute__Group__5 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2358:2: rule__AnyGenericAttribute__Group__4__Impl rule__AnyGenericAttribute__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericAttribute__Group__4__Impl_in_rule__AnyGenericAttribute__Group__44601);
            rule__AnyGenericAttribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericAttribute__Group__5_in_rule__AnyGenericAttribute__Group__44604);
            rule__AnyGenericAttribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericAttribute__Group__4"


    // $ANTLR start "rule__AnyGenericAttribute__Group__4__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2365:1: rule__AnyGenericAttribute__Group__4__Impl : ( 'attrValue' ) ;
    public final void rule__AnyGenericAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2369:1: ( ( 'attrValue' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2370:1: ( 'attrValue' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2370:1: ( 'attrValue' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2371:1: 'attrValue'
            {
             before(grammarAccess.getAnyGenericAttributeAccess().getAttrValueKeyword_4()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__AnyGenericAttribute__Group__4__Impl4632); 
             after(grammarAccess.getAnyGenericAttributeAccess().getAttrValueKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericAttribute__Group__4__Impl"


    // $ANTLR start "rule__AnyGenericAttribute__Group__5"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2384:1: rule__AnyGenericAttribute__Group__5 : rule__AnyGenericAttribute__Group__5__Impl rule__AnyGenericAttribute__Group__6 ;
    public final void rule__AnyGenericAttribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2388:1: ( rule__AnyGenericAttribute__Group__5__Impl rule__AnyGenericAttribute__Group__6 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2389:2: rule__AnyGenericAttribute__Group__5__Impl rule__AnyGenericAttribute__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericAttribute__Group__5__Impl_in_rule__AnyGenericAttribute__Group__54663);
            rule__AnyGenericAttribute__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericAttribute__Group__6_in_rule__AnyGenericAttribute__Group__54666);
            rule__AnyGenericAttribute__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericAttribute__Group__5"


    // $ANTLR start "rule__AnyGenericAttribute__Group__5__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2396:1: rule__AnyGenericAttribute__Group__5__Impl : ( ( rule__AnyGenericAttribute__AttrValueAssignment_5 ) ) ;
    public final void rule__AnyGenericAttribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2400:1: ( ( ( rule__AnyGenericAttribute__AttrValueAssignment_5 ) ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2401:1: ( ( rule__AnyGenericAttribute__AttrValueAssignment_5 ) )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2401:1: ( ( rule__AnyGenericAttribute__AttrValueAssignment_5 ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2402:1: ( rule__AnyGenericAttribute__AttrValueAssignment_5 )
            {
             before(grammarAccess.getAnyGenericAttributeAccess().getAttrValueAssignment_5()); 
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2403:1: ( rule__AnyGenericAttribute__AttrValueAssignment_5 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2403:2: rule__AnyGenericAttribute__AttrValueAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericAttribute__AttrValueAssignment_5_in_rule__AnyGenericAttribute__Group__5__Impl4693);
            rule__AnyGenericAttribute__AttrValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAnyGenericAttributeAccess().getAttrValueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericAttribute__Group__5__Impl"


    // $ANTLR start "rule__AnyGenericAttribute__Group__6"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2413:1: rule__AnyGenericAttribute__Group__6 : rule__AnyGenericAttribute__Group__6__Impl ;
    public final void rule__AnyGenericAttribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2417:1: ( rule__AnyGenericAttribute__Group__6__Impl )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2418:2: rule__AnyGenericAttribute__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnyGenericAttribute__Group__6__Impl_in_rule__AnyGenericAttribute__Group__64723);
            rule__AnyGenericAttribute__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericAttribute__Group__6"


    // $ANTLR start "rule__AnyGenericAttribute__Group__6__Impl"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2424:1: rule__AnyGenericAttribute__Group__6__Impl : ( '}' ) ;
    public final void rule__AnyGenericAttribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2428:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2429:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2429:1: ( '}' )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2430:1: '}'
            {
             before(grammarAccess.getAnyGenericAttributeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__AnyGenericAttribute__Group__6__Impl4751); 
             after(grammarAccess.getAnyGenericAttributeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericAttribute__Group__6__Impl"


    // $ANTLR start "rule__RootElementType__Element1Assignment_3"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2458:1: rule__RootElementType__Element1Assignment_3 : ( ruleElement1 ) ;
    public final void rule__RootElementType__Element1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2462:1: ( ( ruleElement1 ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2463:1: ( ruleElement1 )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2463:1: ( ruleElement1 )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2464:1: ruleElement1
            {
             before(grammarAccess.getRootElementTypeAccess().getElement1Element1ParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement1_in_rule__RootElementType__Element1Assignment_34801);
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2473:1: rule__RootElementType__PropertiesAssignment_4_1 : ( ruleProperties ) ;
    public final void rule__RootElementType__PropertiesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2477:1: ( ( ruleProperties ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2478:1: ( ruleProperties )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2478:1: ( ruleProperties )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2479:1: ruleProperties
            {
             before(grammarAccess.getRootElementTypeAccess().getPropertiesPropertiesParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperties_in_rule__RootElementType__PropertiesAssignment_4_14832);
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2488:1: rule__Element1__CityAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Element1__CityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2492:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2493:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2493:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2494:1: RULE_STRING
            {
             before(grammarAccess.getElement1Access().getCitySTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Element1__CityAssignment_3_14863); 
             after(grammarAccess.getElement1Access().getCitySTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
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
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2503:1: rule__Element1__StreetAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Element1__StreetAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2507:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2508:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2508:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2509:1: RULE_STRING
            {
             before(grammarAccess.getElement1Access().getStreetSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Element1__StreetAssignment_4_14894); 
             after(grammarAccess.getElement1Access().getStreetSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Properties__AnyGenericElemAssignment_4"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2518:1: rule__Properties__AnyGenericElemAssignment_4 : ( ruleAnyGenericConstruct ) ;
    public final void rule__Properties__AnyGenericElemAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2522:1: ( ( ruleAnyGenericConstruct ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2523:1: ( ruleAnyGenericConstruct )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2523:1: ( ruleAnyGenericConstruct )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2524:1: ruleAnyGenericConstruct
            {
             before(grammarAccess.getPropertiesAccess().getAnyGenericElemAnyGenericConstructParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyGenericConstruct_in_rule__Properties__AnyGenericElemAssignment_44925);
            ruleAnyGenericConstruct();

            state._fsp--;

             after(grammarAccess.getPropertiesAccess().getAnyGenericElemAnyGenericConstructParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__AnyGenericElemAssignment_4"


    // $ANTLR start "rule__Properties__AnyGenericElemAssignment_5_1"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2533:1: rule__Properties__AnyGenericElemAssignment_5_1 : ( ruleAnyGenericConstruct ) ;
    public final void rule__Properties__AnyGenericElemAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2537:1: ( ( ruleAnyGenericConstruct ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2538:1: ( ruleAnyGenericConstruct )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2538:1: ( ruleAnyGenericConstruct )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2539:1: ruleAnyGenericConstruct
            {
             before(grammarAccess.getPropertiesAccess().getAnyGenericElemAnyGenericConstructParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyGenericConstruct_in_rule__Properties__AnyGenericElemAssignment_5_14956);
            ruleAnyGenericConstruct();

            state._fsp--;

             after(grammarAccess.getPropertiesAccess().getAnyGenericElemAnyGenericConstructParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__AnyGenericElemAssignment_5_1"


    // $ANTLR start "rule__AnyGenericElement__ElemNameAssignment_3_1"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2548:1: rule__AnyGenericElement__ElemNameAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__AnyGenericElement__ElemNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2552:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2553:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2553:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2554:1: RULE_STRING
            {
             before(grammarAccess.getAnyGenericElementAccess().getElemNameSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__AnyGenericElement__ElemNameAssignment_3_14987); 
             after(grammarAccess.getAnyGenericElementAccess().getElemNameSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__ElemNameAssignment_3_1"


    // $ANTLR start "rule__AnyGenericElement__ElemValueAssignment_4_1"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2563:1: rule__AnyGenericElement__ElemValueAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__AnyGenericElement__ElemValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2567:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2568:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2568:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2569:1: RULE_STRING
            {
             before(grammarAccess.getAnyGenericElementAccess().getElemValueSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__AnyGenericElement__ElemValueAssignment_4_15018); 
             after(grammarAccess.getAnyGenericElementAccess().getElemValueSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__ElemValueAssignment_4_1"


    // $ANTLR start "rule__AnyGenericElement__AnyGenericAttrAssignment_5_2"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2578:1: rule__AnyGenericElement__AnyGenericAttrAssignment_5_2 : ( ruleAnyGenericAttribute ) ;
    public final void rule__AnyGenericElement__AnyGenericAttrAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2582:1: ( ( ruleAnyGenericAttribute ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2583:1: ( ruleAnyGenericAttribute )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2583:1: ( ruleAnyGenericAttribute )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2584:1: ruleAnyGenericAttribute
            {
             before(grammarAccess.getAnyGenericElementAccess().getAnyGenericAttrAnyGenericAttributeParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyGenericAttribute_in_rule__AnyGenericElement__AnyGenericAttrAssignment_5_25049);
            ruleAnyGenericAttribute();

            state._fsp--;

             after(grammarAccess.getAnyGenericElementAccess().getAnyGenericAttrAnyGenericAttributeParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__AnyGenericAttrAssignment_5_2"


    // $ANTLR start "rule__AnyGenericElement__AnyGenericAttrAssignment_5_3_1"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2593:1: rule__AnyGenericElement__AnyGenericAttrAssignment_5_3_1 : ( ruleAnyGenericAttribute ) ;
    public final void rule__AnyGenericElement__AnyGenericAttrAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2597:1: ( ( ruleAnyGenericAttribute ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2598:1: ( ruleAnyGenericAttribute )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2598:1: ( ruleAnyGenericAttribute )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2599:1: ruleAnyGenericAttribute
            {
             before(grammarAccess.getAnyGenericElementAccess().getAnyGenericAttrAnyGenericAttributeParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyGenericAttribute_in_rule__AnyGenericElement__AnyGenericAttrAssignment_5_3_15080);
            ruleAnyGenericAttribute();

            state._fsp--;

             after(grammarAccess.getAnyGenericElementAccess().getAnyGenericAttrAnyGenericAttributeParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__AnyGenericAttrAssignment_5_3_1"


    // $ANTLR start "rule__AnyGenericElement__ChildElemAssignment_6_2"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2608:1: rule__AnyGenericElement__ChildElemAssignment_6_2 : ( ruleAnyGenericElement ) ;
    public final void rule__AnyGenericElement__ChildElemAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2612:1: ( ( ruleAnyGenericElement ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2613:1: ( ruleAnyGenericElement )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2613:1: ( ruleAnyGenericElement )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2614:1: ruleAnyGenericElement
            {
             before(grammarAccess.getAnyGenericElementAccess().getChildElemAnyGenericElementParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyGenericElement_in_rule__AnyGenericElement__ChildElemAssignment_6_25111);
            ruleAnyGenericElement();

            state._fsp--;

             after(grammarAccess.getAnyGenericElementAccess().getChildElemAnyGenericElementParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__ChildElemAssignment_6_2"


    // $ANTLR start "rule__AnyGenericElement__ChildElemAssignment_6_3_1"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2623:1: rule__AnyGenericElement__ChildElemAssignment_6_3_1 : ( ruleAnyGenericElement ) ;
    public final void rule__AnyGenericElement__ChildElemAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2627:1: ( ( ruleAnyGenericElement ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2628:1: ( ruleAnyGenericElement )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2628:1: ( ruleAnyGenericElement )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2629:1: ruleAnyGenericElement
            {
             before(grammarAccess.getAnyGenericElementAccess().getChildElemAnyGenericElementParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyGenericElement_in_rule__AnyGenericElement__ChildElemAssignment_6_3_15142);
            ruleAnyGenericElement();

            state._fsp--;

             after(grammarAccess.getAnyGenericElementAccess().getChildElemAnyGenericElementParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericElement__ChildElemAssignment_6_3_1"


    // $ANTLR start "rule__AnyGenericText__TextValueAssignment_3_1"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2638:1: rule__AnyGenericText__TextValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__AnyGenericText__TextValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2642:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2643:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2643:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2644:1: RULE_STRING
            {
             before(grammarAccess.getAnyGenericTextAccess().getTextValueSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__AnyGenericText__TextValueAssignment_3_15173); 
             after(grammarAccess.getAnyGenericTextAccess().getTextValueSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericText__TextValueAssignment_3_1"


    // $ANTLR start "rule__AnyGenericAttribute__AttrNameAssignment_3"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2653:1: rule__AnyGenericAttribute__AttrNameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__AnyGenericAttribute__AttrNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2657:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2658:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2658:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2659:1: RULE_STRING
            {
             before(grammarAccess.getAnyGenericAttributeAccess().getAttrNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__AnyGenericAttribute__AttrNameAssignment_35204); 
             after(grammarAccess.getAnyGenericAttributeAccess().getAttrNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericAttribute__AttrNameAssignment_3"


    // $ANTLR start "rule__AnyGenericAttribute__AttrValueAssignment_5"
    // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2668:1: rule__AnyGenericAttribute__AttrValueAssignment_5 : ( RULE_STRING ) ;
    public final void rule__AnyGenericAttribute__AttrValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2672:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2673:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2673:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.anyfeatureadapted.ui/src-gen/org/xtext/example/mydsl/anyfeatureadapted/ui/contentassist/antlr/internal/InternalMyDsl.g:2674:1: RULE_STRING
            {
             before(grammarAccess.getAnyGenericAttributeAccess().getAttrValueSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__AnyGenericAttribute__AttrValueAssignment_55235); 
             after(grammarAccess.getAnyGenericAttributeAccess().getAttrValueSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyGenericAttribute__AttrValueAssignment_5"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRootElementType_in_entryRuleRootElementType61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRootElementType68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__0_in_ruleRootElementType94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyGenericConstruct_in_entryRuleAnyGenericConstruct121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnyGenericConstruct128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericConstruct__Alternatives_in_ruleAnyGenericConstruct154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement1_in_entryRuleElement1181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElement1188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group__0_in_ruleElement1214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperties_in_entryRuleProperties241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperties248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Properties__Group__0_in_ruleProperties274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyGenericElement_in_entryRuleAnyGenericElement303 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnyGenericElement310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group__0_in_ruleAnyGenericElement336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyGenericText_in_entryRuleAnyGenericText363 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnyGenericText370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericText__Group__0_in_ruleAnyGenericText396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyGenericAttribute_in_entryRuleAnyGenericAttribute423 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnyGenericAttribute430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericAttribute__Group__0_in_ruleAnyGenericAttribute456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyGenericElement_in_rule__AnyGenericConstruct__Alternatives492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyGenericText_in_rule__AnyGenericConstruct__Alternatives509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__0__Impl_in_rule__RootElementType__Group__0539 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__1_in_rule__RootElementType__Group__0542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__RootElementType__Group__0__Impl570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__1__Impl_in_rule__RootElementType__Group__1601 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__2_in_rule__RootElementType__Group__1604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__RootElementType__Group__1__Impl632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__2__Impl_in_rule__RootElementType__Group__2663 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__3_in_rule__RootElementType__Group__2666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__RootElementType__Group__2__Impl694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__3__Impl_in_rule__RootElementType__Group__3725 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__4_in_rule__RootElementType__Group__3728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Element1Assignment_3_in_rule__RootElementType__Group__3__Impl755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__4__Impl_in_rule__RootElementType__Group__4785 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__5_in_rule__RootElementType__Group__4788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group_4__0_in_rule__RootElementType__Group__4__Impl815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group__5__Impl_in_rule__RootElementType__Group__5846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__RootElementType__Group__5__Impl874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group_4__0__Impl_in_rule__RootElementType__Group_4__0917 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__RootElementType__Group_4__1_in_rule__RootElementType__Group_4__0920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__RootElementType__Group_4__0__Impl948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__Group_4__1__Impl_in_rule__RootElementType__Group_4__1979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RootElementType__PropertiesAssignment_4_1_in_rule__RootElementType__Group_4__1__Impl1006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group__0__Impl_in_rule__Element1__Group__01040 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Element1__Group__1_in_rule__Element1__Group__01043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group__1__Impl_in_rule__Element1__Group__11101 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Element1__Group__2_in_rule__Element1__Group__11104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Element1__Group__1__Impl1132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group__2__Impl_in_rule__Element1__Group__21163 = new BitSet(new long[]{0x0000000000064000L});
        public static final BitSet FOLLOW_rule__Element1__Group__3_in_rule__Element1__Group__21166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Element1__Group__2__Impl1194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group__3__Impl_in_rule__Element1__Group__31225 = new BitSet(new long[]{0x0000000000064000L});
        public static final BitSet FOLLOW_rule__Element1__Group__4_in_rule__Element1__Group__31228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group_3__0_in_rule__Element1__Group__3__Impl1255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group__4__Impl_in_rule__Element1__Group__41286 = new BitSet(new long[]{0x0000000000064000L});
        public static final BitSet FOLLOW_rule__Element1__Group__5_in_rule__Element1__Group__41289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group_4__0_in_rule__Element1__Group__4__Impl1316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group__5__Impl_in_rule__Element1__Group__51347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Element1__Group__5__Impl1375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group_3__0__Impl_in_rule__Element1__Group_3__01418 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Element1__Group_3__1_in_rule__Element1__Group_3__01421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Element1__Group_3__0__Impl1449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group_3__1__Impl_in_rule__Element1__Group_3__11480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__CityAssignment_3_1_in_rule__Element1__Group_3__1__Impl1507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group_4__0__Impl_in_rule__Element1__Group_4__01541 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Element1__Group_4__1_in_rule__Element1__Group_4__01544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Element1__Group_4__0__Impl1572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__Group_4__1__Impl_in_rule__Element1__Group_4__11603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element1__StreetAssignment_4_1_in_rule__Element1__Group_4__1__Impl1630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Properties__Group__0__Impl_in_rule__Properties__Group__01664 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Properties__Group__1_in_rule__Properties__Group__01667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Properties__Group__0__Impl1695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Properties__Group__1__Impl_in_rule__Properties__Group__11726 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Properties__Group__2_in_rule__Properties__Group__11729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Properties__Group__1__Impl1757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Properties__Group__2__Impl_in_rule__Properties__Group__21788 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Properties__Group__3_in_rule__Properties__Group__21791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Properties__Group__2__Impl1819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Properties__Group__3__Impl_in_rule__Properties__Group__31850 = new BitSet(new long[]{0x0000000008400000L});
        public static final BitSet FOLLOW_rule__Properties__Group__4_in_rule__Properties__Group__31853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Properties__Group__3__Impl1881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Properties__Group__4__Impl_in_rule__Properties__Group__41912 = new BitSet(new long[]{0x0000000000204000L});
        public static final BitSet FOLLOW_rule__Properties__Group__5_in_rule__Properties__Group__41915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Properties__AnyGenericElemAssignment_4_in_rule__Properties__Group__4__Impl1942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Properties__Group__5__Impl_in_rule__Properties__Group__51972 = new BitSet(new long[]{0x0000000000204000L});
        public static final BitSet FOLLOW_rule__Properties__Group__6_in_rule__Properties__Group__51975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Properties__Group_5__0_in_rule__Properties__Group__5__Impl2002 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_rule__Properties__Group__6__Impl_in_rule__Properties__Group__62033 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Properties__Group__7_in_rule__Properties__Group__62036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Properties__Group__6__Impl2064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Properties__Group__7__Impl_in_rule__Properties__Group__72095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Properties__Group__7__Impl2123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Properties__Group_5__0__Impl_in_rule__Properties__Group_5__02170 = new BitSet(new long[]{0x0000000008400000L});
        public static final BitSet FOLLOW_rule__Properties__Group_5__1_in_rule__Properties__Group_5__02173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Properties__Group_5__0__Impl2201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Properties__Group_5__1__Impl_in_rule__Properties__Group_5__12232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Properties__AnyGenericElemAssignment_5_1_in_rule__Properties__Group_5__1__Impl2259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group__0__Impl_in_rule__AnyGenericElement__Group__02293 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group__1_in_rule__AnyGenericElement__Group__02296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group__1__Impl_in_rule__AnyGenericElement__Group__12354 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group__2_in_rule__AnyGenericElement__Group__12357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__AnyGenericElement__Group__1__Impl2385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group__2__Impl_in_rule__AnyGenericElement__Group__22416 = new BitSet(new long[]{0x0000000007804000L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group__3_in_rule__AnyGenericElement__Group__22419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__AnyGenericElement__Group__2__Impl2447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group__3__Impl_in_rule__AnyGenericElement__Group__32478 = new BitSet(new long[]{0x0000000007804000L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group__4_in_rule__AnyGenericElement__Group__32481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_3__0_in_rule__AnyGenericElement__Group__3__Impl2508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group__4__Impl_in_rule__AnyGenericElement__Group__42539 = new BitSet(new long[]{0x0000000007804000L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group__5_in_rule__AnyGenericElement__Group__42542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_4__0_in_rule__AnyGenericElement__Group__4__Impl2569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group__5__Impl_in_rule__AnyGenericElement__Group__52600 = new BitSet(new long[]{0x0000000007804000L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group__6_in_rule__AnyGenericElement__Group__52603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_5__0_in_rule__AnyGenericElement__Group__5__Impl2630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group__6__Impl_in_rule__AnyGenericElement__Group__62661 = new BitSet(new long[]{0x0000000007804000L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group__7_in_rule__AnyGenericElement__Group__62664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_6__0_in_rule__AnyGenericElement__Group__6__Impl2691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group__7__Impl_in_rule__AnyGenericElement__Group__72722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__AnyGenericElement__Group__7__Impl2750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_3__0__Impl_in_rule__AnyGenericElement__Group_3__02797 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_3__1_in_rule__AnyGenericElement__Group_3__02800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__AnyGenericElement__Group_3__0__Impl2828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_3__1__Impl_in_rule__AnyGenericElement__Group_3__12859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__ElemNameAssignment_3_1_in_rule__AnyGenericElement__Group_3__1__Impl2886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_4__0__Impl_in_rule__AnyGenericElement__Group_4__02920 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_4__1_in_rule__AnyGenericElement__Group_4__02923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__AnyGenericElement__Group_4__0__Impl2951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_4__1__Impl_in_rule__AnyGenericElement__Group_4__12982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__ElemValueAssignment_4_1_in_rule__AnyGenericElement__Group_4__1__Impl3009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_5__0__Impl_in_rule__AnyGenericElement__Group_5__03043 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_5__1_in_rule__AnyGenericElement__Group_5__03046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__AnyGenericElement__Group_5__0__Impl3074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_5__1__Impl_in_rule__AnyGenericElement__Group_5__13105 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_5__2_in_rule__AnyGenericElement__Group_5__13108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__AnyGenericElement__Group_5__1__Impl3136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_5__2__Impl_in_rule__AnyGenericElement__Group_5__23167 = new BitSet(new long[]{0x0000000000204000L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_5__3_in_rule__AnyGenericElement__Group_5__23170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__AnyGenericAttrAssignment_5_2_in_rule__AnyGenericElement__Group_5__2__Impl3197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_5__3__Impl_in_rule__AnyGenericElement__Group_5__33227 = new BitSet(new long[]{0x0000000000204000L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_5__4_in_rule__AnyGenericElement__Group_5__33230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_5_3__0_in_rule__AnyGenericElement__Group_5__3__Impl3257 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_5__4__Impl_in_rule__AnyGenericElement__Group_5__43288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__AnyGenericElement__Group_5__4__Impl3316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_5_3__0__Impl_in_rule__AnyGenericElement__Group_5_3__03357 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_5_3__1_in_rule__AnyGenericElement__Group_5_3__03360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__AnyGenericElement__Group_5_3__0__Impl3388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_5_3__1__Impl_in_rule__AnyGenericElement__Group_5_3__13419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__AnyGenericAttrAssignment_5_3_1_in_rule__AnyGenericElement__Group_5_3__1__Impl3446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_6__0__Impl_in_rule__AnyGenericElement__Group_6__03480 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_6__1_in_rule__AnyGenericElement__Group_6__03483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__AnyGenericElement__Group_6__0__Impl3511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_6__1__Impl_in_rule__AnyGenericElement__Group_6__13542 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_6__2_in_rule__AnyGenericElement__Group_6__13545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__AnyGenericElement__Group_6__1__Impl3573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_6__2__Impl_in_rule__AnyGenericElement__Group_6__23604 = new BitSet(new long[]{0x0000000000204000L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_6__3_in_rule__AnyGenericElement__Group_6__23607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__ChildElemAssignment_6_2_in_rule__AnyGenericElement__Group_6__2__Impl3634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_6__3__Impl_in_rule__AnyGenericElement__Group_6__33664 = new BitSet(new long[]{0x0000000000204000L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_6__4_in_rule__AnyGenericElement__Group_6__33667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_6_3__0_in_rule__AnyGenericElement__Group_6__3__Impl3694 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_6__4__Impl_in_rule__AnyGenericElement__Group_6__43725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__AnyGenericElement__Group_6__4__Impl3753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_6_3__0__Impl_in_rule__AnyGenericElement__Group_6_3__03794 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_6_3__1_in_rule__AnyGenericElement__Group_6_3__03797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__AnyGenericElement__Group_6_3__0__Impl3825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__Group_6_3__1__Impl_in_rule__AnyGenericElement__Group_6_3__13856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericElement__ChildElemAssignment_6_3_1_in_rule__AnyGenericElement__Group_6_3__1__Impl3883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericText__Group__0__Impl_in_rule__AnyGenericText__Group__03917 = new BitSet(new long[]{0x0000000008400000L});
        public static final BitSet FOLLOW_rule__AnyGenericText__Group__1_in_rule__AnyGenericText__Group__03920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericText__Group__1__Impl_in_rule__AnyGenericText__Group__13978 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__AnyGenericText__Group__2_in_rule__AnyGenericText__Group__13981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__AnyGenericText__Group__1__Impl4009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericText__Group__2__Impl_in_rule__AnyGenericText__Group__24040 = new BitSet(new long[]{0x0000000010004000L});
        public static final BitSet FOLLOW_rule__AnyGenericText__Group__3_in_rule__AnyGenericText__Group__24043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__AnyGenericText__Group__2__Impl4071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericText__Group__3__Impl_in_rule__AnyGenericText__Group__34102 = new BitSet(new long[]{0x0000000010004000L});
        public static final BitSet FOLLOW_rule__AnyGenericText__Group__4_in_rule__AnyGenericText__Group__34105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericText__Group_3__0_in_rule__AnyGenericText__Group__3__Impl4132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericText__Group__4__Impl_in_rule__AnyGenericText__Group__44163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__AnyGenericText__Group__4__Impl4191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericText__Group_3__0__Impl_in_rule__AnyGenericText__Group_3__04232 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__AnyGenericText__Group_3__1_in_rule__AnyGenericText__Group_3__04235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__AnyGenericText__Group_3__0__Impl4263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericText__Group_3__1__Impl_in_rule__AnyGenericText__Group_3__14294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericText__TextValueAssignment_3_1_in_rule__AnyGenericText__Group_3__1__Impl4321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericAttribute__Group__0__Impl_in_rule__AnyGenericAttribute__Group__04355 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__AnyGenericAttribute__Group__1_in_rule__AnyGenericAttribute__Group__04358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__AnyGenericAttribute__Group__0__Impl4386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericAttribute__Group__1__Impl_in_rule__AnyGenericAttribute__Group__14417 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__AnyGenericAttribute__Group__2_in_rule__AnyGenericAttribute__Group__14420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__AnyGenericAttribute__Group__1__Impl4448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericAttribute__Group__2__Impl_in_rule__AnyGenericAttribute__Group__24479 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__AnyGenericAttribute__Group__3_in_rule__AnyGenericAttribute__Group__24482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__AnyGenericAttribute__Group__2__Impl4510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericAttribute__Group__3__Impl_in_rule__AnyGenericAttribute__Group__34541 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__AnyGenericAttribute__Group__4_in_rule__AnyGenericAttribute__Group__34544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericAttribute__AttrNameAssignment_3_in_rule__AnyGenericAttribute__Group__3__Impl4571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericAttribute__Group__4__Impl_in_rule__AnyGenericAttribute__Group__44601 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__AnyGenericAttribute__Group__5_in_rule__AnyGenericAttribute__Group__44604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__AnyGenericAttribute__Group__4__Impl4632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericAttribute__Group__5__Impl_in_rule__AnyGenericAttribute__Group__54663 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__AnyGenericAttribute__Group__6_in_rule__AnyGenericAttribute__Group__54666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericAttribute__AttrValueAssignment_5_in_rule__AnyGenericAttribute__Group__5__Impl4693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnyGenericAttribute__Group__6__Impl_in_rule__AnyGenericAttribute__Group__64723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__AnyGenericAttribute__Group__6__Impl4751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement1_in_rule__RootElementType__Element1Assignment_34801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperties_in_rule__RootElementType__PropertiesAssignment_4_14832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Element1__CityAssignment_3_14863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Element1__StreetAssignment_4_14894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyGenericConstruct_in_rule__Properties__AnyGenericElemAssignment_44925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyGenericConstruct_in_rule__Properties__AnyGenericElemAssignment_5_14956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__AnyGenericElement__ElemNameAssignment_3_14987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__AnyGenericElement__ElemValueAssignment_4_15018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyGenericAttribute_in_rule__AnyGenericElement__AnyGenericAttrAssignment_5_25049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyGenericAttribute_in_rule__AnyGenericElement__AnyGenericAttrAssignment_5_3_15080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyGenericElement_in_rule__AnyGenericElement__ChildElemAssignment_6_25111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyGenericElement_in_rule__AnyGenericElement__ChildElemAssignment_6_3_15142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__AnyGenericText__TextValueAssignment_3_15173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__AnyGenericAttribute__AttrNameAssignment_35204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__AnyGenericAttribute__AttrValueAssignment_55235 = new BitSet(new long[]{0x0000000000000002L});
    }


}