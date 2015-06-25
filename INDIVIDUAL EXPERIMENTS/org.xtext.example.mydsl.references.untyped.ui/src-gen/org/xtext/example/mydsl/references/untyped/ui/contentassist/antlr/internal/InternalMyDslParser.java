package org.xtext.example.mydsl.references.untyped.ui.contentassist.antlr.internal; 

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
import org.xtext.example.mydsl.references.untyped.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'OrdersType'", "'{'", "'order1'", "'}'", "'order2'", "'orderReference1'", "'orderReference2'", "','", "'OrderDetail1'", "'customerAddress'", "'customerContact'", "'customerName'", "'OrderDetail2'", "'OrderRef1'", "'name'", "'OrderRef2'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_INT=6;
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
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
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




    // $ANTLR start "entryRuleOrdersType"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleOrdersType : ruleOrdersType EOF ;
    public final void entryRuleOrdersType() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleOrdersType EOF )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleOrdersType EOF
            {
             before(grammarAccess.getOrdersTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrdersType_in_entryRuleOrdersType61);
            ruleOrdersType();

            state._fsp--;

             after(grammarAccess.getOrdersTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrdersType68); 

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
    // $ANTLR end "entryRuleOrdersType"


    // $ANTLR start "ruleOrdersType"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleOrdersType : ( ( rule__OrdersType__Group__0 ) ) ;
    public final void ruleOrdersType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__OrdersType__Group__0 ) ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__OrdersType__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__OrdersType__Group__0 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__OrdersType__Group__0 )
            {
             before(grammarAccess.getOrdersTypeAccess().getGroup()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__OrdersType__Group__0 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__OrdersType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__0_in_ruleOrdersType94);
            rule__OrdersType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrdersTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrdersType"


    // $ANTLR start "entryRuleOrderDetail1"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleOrderDetail1 : ruleOrderDetail1 EOF ;
    public final void entryRuleOrderDetail1() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleOrderDetail1 EOF )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleOrderDetail1 EOF
            {
             before(grammarAccess.getOrderDetail1Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderDetail1_in_entryRuleOrderDetail1121);
            ruleOrderDetail1();

            state._fsp--;

             after(grammarAccess.getOrderDetail1Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrderDetail1128); 

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
    // $ANTLR end "entryRuleOrderDetail1"


    // $ANTLR start "ruleOrderDetail1"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleOrderDetail1 : ( ( rule__OrderDetail1__Group__0 ) ) ;
    public final void ruleOrderDetail1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__OrderDetail1__Group__0 ) ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__OrderDetail1__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__OrderDetail1__Group__0 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__OrderDetail1__Group__0 )
            {
             before(grammarAccess.getOrderDetail1Access().getGroup()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__OrderDetail1__Group__0 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__OrderDetail1__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__0_in_ruleOrderDetail1154);
            rule__OrderDetail1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderDetail1Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrderDetail1"


    // $ANTLR start "entryRuleOrderDetail2"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleOrderDetail2 : ruleOrderDetail2 EOF ;
    public final void entryRuleOrderDetail2() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleOrderDetail2 EOF )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleOrderDetail2 EOF
            {
             before(grammarAccess.getOrderDetail2Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderDetail2_in_entryRuleOrderDetail2181);
            ruleOrderDetail2();

            state._fsp--;

             after(grammarAccess.getOrderDetail2Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrderDetail2188); 

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
    // $ANTLR end "entryRuleOrderDetail2"


    // $ANTLR start "ruleOrderDetail2"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleOrderDetail2 : ( ( rule__OrderDetail2__Group__0 ) ) ;
    public final void ruleOrderDetail2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__OrderDetail2__Group__0 ) ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__OrderDetail2__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__OrderDetail2__Group__0 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__OrderDetail2__Group__0 )
            {
             before(grammarAccess.getOrderDetail2Access().getGroup()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__OrderDetail2__Group__0 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__OrderDetail2__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__0_in_ruleOrderDetail2214);
            rule__OrderDetail2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderDetail2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrderDetail2"


    // $ANTLR start "entryRuleOrderRef1"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleOrderRef1 : ruleOrderRef1 EOF ;
    public final void entryRuleOrderRef1() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleOrderRef1 EOF )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleOrderRef1 EOF
            {
             before(grammarAccess.getOrderRef1Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderRef1_in_entryRuleOrderRef1241);
            ruleOrderRef1();

            state._fsp--;

             after(grammarAccess.getOrderRef1Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrderRef1248); 

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
    // $ANTLR end "entryRuleOrderRef1"


    // $ANTLR start "ruleOrderRef1"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleOrderRef1 : ( ( rule__OrderRef1__Group__0 ) ) ;
    public final void ruleOrderRef1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ( rule__OrderRef1__Group__0 ) ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__OrderRef1__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__OrderRef1__Group__0 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( rule__OrderRef1__Group__0 )
            {
             before(grammarAccess.getOrderRef1Access().getGroup()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__OrderRef1__Group__0 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: rule__OrderRef1__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group__0_in_ruleOrderRef1274);
            rule__OrderRef1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderRef1Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrderRef1"


    // $ANTLR start "entryRuleOrderRef2"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleOrderRef2 : ruleOrderRef2 EOF ;
    public final void entryRuleOrderRef2() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleOrderRef2 EOF )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleOrderRef2 EOF
            {
             before(grammarAccess.getOrderRef2Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderRef2_in_entryRuleOrderRef2301);
            ruleOrderRef2();

            state._fsp--;

             after(grammarAccess.getOrderRef2Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrderRef2308); 

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
    // $ANTLR end "entryRuleOrderRef2"


    // $ANTLR start "ruleOrderRef2"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleOrderRef2 : ( ( rule__OrderRef2__Group__0 ) ) ;
    public final void ruleOrderRef2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( ( rule__OrderRef2__Group__0 ) ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__OrderRef2__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__OrderRef2__Group__0 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ( rule__OrderRef2__Group__0 )
            {
             before(grammarAccess.getOrderRef2Access().getGroup()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( rule__OrderRef2__Group__0 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:188:2: rule__OrderRef2__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group__0_in_ruleOrderRef2334);
            rule__OrderRef2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderRef2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrderRef2"


    // $ANTLR start "entryRuleString0"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:200:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:201:1: ( ruleString0 EOF )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: ruleString0 EOF
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
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: ruleString0 : ( 'String' ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:213:2: ( ( 'String' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( 'String' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( 'String' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: 'String'
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


    // $ANTLR start "entryRuleID0"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: entryRuleID0 : ruleID0 EOF ;
    public final void entryRuleID0() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:231:1: ( ruleID0 EOF )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:232:1: ruleID0 EOF
            {
             before(grammarAccess.getID0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleID0_in_entryRuleID0423);
            ruleID0();

            state._fsp--;

             after(grammarAccess.getID0Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleID0430); 

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
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:239:1: ruleID0 : ( RULE_ID ) ;
    public final void ruleID0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:243:2: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:245:1: RULE_ID
            {
             before(grammarAccess.getID0Access().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleID0456); 
             after(grammarAccess.getID0Access().getIDTerminalRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:260:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:261:1: ( ruleEString EOF )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:262:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString484);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString491); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:269:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:273:2: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:274:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:274:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:275:1: RULE_STRING
            {
             before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString517); 
             after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__OrdersType__Group__0"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:290:1: rule__OrdersType__Group__0 : rule__OrdersType__Group__0__Impl rule__OrdersType__Group__1 ;
    public final void rule__OrdersType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:294:1: ( rule__OrdersType__Group__0__Impl rule__OrdersType__Group__1 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:295:2: rule__OrdersType__Group__0__Impl rule__OrdersType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__0__Impl_in_rule__OrdersType__Group__0550);
            rule__OrdersType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__1_in_rule__OrdersType__Group__0553);
            rule__OrdersType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__0"


    // $ANTLR start "rule__OrdersType__Group__0__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:302:1: rule__OrdersType__Group__0__Impl : ( 'OrdersType' ) ;
    public final void rule__OrdersType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:306:1: ( ( 'OrdersType' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:307:1: ( 'OrdersType' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:307:1: ( 'OrdersType' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:308:1: 'OrdersType'
            {
             before(grammarAccess.getOrdersTypeAccess().getOrdersTypeKeyword_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__OrdersType__Group__0__Impl581); 
             after(grammarAccess.getOrdersTypeAccess().getOrdersTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__0__Impl"


    // $ANTLR start "rule__OrdersType__Group__1"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:321:1: rule__OrdersType__Group__1 : rule__OrdersType__Group__1__Impl rule__OrdersType__Group__2 ;
    public final void rule__OrdersType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:325:1: ( rule__OrdersType__Group__1__Impl rule__OrdersType__Group__2 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:326:2: rule__OrdersType__Group__1__Impl rule__OrdersType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__1__Impl_in_rule__OrdersType__Group__1612);
            rule__OrdersType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__2_in_rule__OrdersType__Group__1615);
            rule__OrdersType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__1"


    // $ANTLR start "rule__OrdersType__Group__1__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:333:1: rule__OrdersType__Group__1__Impl : ( '{' ) ;
    public final void rule__OrdersType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:337:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:338:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:338:1: ( '{' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:339:1: '{'
            {
             before(grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__OrdersType__Group__1__Impl643); 
             after(grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__1__Impl"


    // $ANTLR start "rule__OrdersType__Group__2"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:352:1: rule__OrdersType__Group__2 : rule__OrdersType__Group__2__Impl rule__OrdersType__Group__3 ;
    public final void rule__OrdersType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:356:1: ( rule__OrdersType__Group__2__Impl rule__OrdersType__Group__3 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:357:2: rule__OrdersType__Group__2__Impl rule__OrdersType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__2__Impl_in_rule__OrdersType__Group__2674);
            rule__OrdersType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__3_in_rule__OrdersType__Group__2677);
            rule__OrdersType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__2"


    // $ANTLR start "rule__OrdersType__Group__2__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:364:1: rule__OrdersType__Group__2__Impl : ( 'order1' ) ;
    public final void rule__OrdersType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:368:1: ( ( 'order1' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:369:1: ( 'order1' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:369:1: ( 'order1' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:370:1: 'order1'
            {
             before(grammarAccess.getOrdersTypeAccess().getOrder1Keyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__OrdersType__Group__2__Impl705); 
             after(grammarAccess.getOrdersTypeAccess().getOrder1Keyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__2__Impl"


    // $ANTLR start "rule__OrdersType__Group__3"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:383:1: rule__OrdersType__Group__3 : rule__OrdersType__Group__3__Impl rule__OrdersType__Group__4 ;
    public final void rule__OrdersType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:387:1: ( rule__OrdersType__Group__3__Impl rule__OrdersType__Group__4 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:388:2: rule__OrdersType__Group__3__Impl rule__OrdersType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__3__Impl_in_rule__OrdersType__Group__3736);
            rule__OrdersType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__4_in_rule__OrdersType__Group__3739);
            rule__OrdersType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__3"


    // $ANTLR start "rule__OrdersType__Group__3__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:395:1: rule__OrdersType__Group__3__Impl : ( '{' ) ;
    public final void rule__OrdersType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:399:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:400:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:400:1: ( '{' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:401:1: '{'
            {
             before(grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__OrdersType__Group__3__Impl767); 
             after(grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__3__Impl"


    // $ANTLR start "rule__OrdersType__Group__4"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:414:1: rule__OrdersType__Group__4 : rule__OrdersType__Group__4__Impl rule__OrdersType__Group__5 ;
    public final void rule__OrdersType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:418:1: ( rule__OrdersType__Group__4__Impl rule__OrdersType__Group__5 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:419:2: rule__OrdersType__Group__4__Impl rule__OrdersType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__4__Impl_in_rule__OrdersType__Group__4798);
            rule__OrdersType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__5_in_rule__OrdersType__Group__4801);
            rule__OrdersType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__4"


    // $ANTLR start "rule__OrdersType__Group__4__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:426:1: rule__OrdersType__Group__4__Impl : ( ( rule__OrdersType__Order1Assignment_4 ) ) ;
    public final void rule__OrdersType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:430:1: ( ( ( rule__OrdersType__Order1Assignment_4 ) ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:431:1: ( ( rule__OrdersType__Order1Assignment_4 ) )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:431:1: ( ( rule__OrdersType__Order1Assignment_4 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:432:1: ( rule__OrdersType__Order1Assignment_4 )
            {
             before(grammarAccess.getOrdersTypeAccess().getOrder1Assignment_4()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:433:1: ( rule__OrdersType__Order1Assignment_4 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:433:2: rule__OrdersType__Order1Assignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Order1Assignment_4_in_rule__OrdersType__Group__4__Impl828);
            rule__OrdersType__Order1Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOrdersTypeAccess().getOrder1Assignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__4__Impl"


    // $ANTLR start "rule__OrdersType__Group__5"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:443:1: rule__OrdersType__Group__5 : rule__OrdersType__Group__5__Impl rule__OrdersType__Group__6 ;
    public final void rule__OrdersType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:447:1: ( rule__OrdersType__Group__5__Impl rule__OrdersType__Group__6 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:448:2: rule__OrdersType__Group__5__Impl rule__OrdersType__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__5__Impl_in_rule__OrdersType__Group__5858);
            rule__OrdersType__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__6_in_rule__OrdersType__Group__5861);
            rule__OrdersType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__5"


    // $ANTLR start "rule__OrdersType__Group__5__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:455:1: rule__OrdersType__Group__5__Impl : ( ( rule__OrdersType__Group_5__0 )* ) ;
    public final void rule__OrdersType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:459:1: ( ( ( rule__OrdersType__Group_5__0 )* ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:460:1: ( ( rule__OrdersType__Group_5__0 )* )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:460:1: ( ( rule__OrdersType__Group_5__0 )* )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:461:1: ( rule__OrdersType__Group_5__0 )*
            {
             before(grammarAccess.getOrdersTypeAccess().getGroup_5()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:462:1: ( rule__OrdersType__Group_5__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:462:2: rule__OrdersType__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_5__0_in_rule__OrdersType__Group__5__Impl888);
            	    rule__OrdersType__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getOrdersTypeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__5__Impl"


    // $ANTLR start "rule__OrdersType__Group__6"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:472:1: rule__OrdersType__Group__6 : rule__OrdersType__Group__6__Impl rule__OrdersType__Group__7 ;
    public final void rule__OrdersType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:476:1: ( rule__OrdersType__Group__6__Impl rule__OrdersType__Group__7 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:477:2: rule__OrdersType__Group__6__Impl rule__OrdersType__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__6__Impl_in_rule__OrdersType__Group__6919);
            rule__OrdersType__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__7_in_rule__OrdersType__Group__6922);
            rule__OrdersType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__6"


    // $ANTLR start "rule__OrdersType__Group__6__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:484:1: rule__OrdersType__Group__6__Impl : ( '}' ) ;
    public final void rule__OrdersType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:488:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:489:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:489:1: ( '}' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:490:1: '}'
            {
             before(grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__OrdersType__Group__6__Impl950); 
             after(grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__6__Impl"


    // $ANTLR start "rule__OrdersType__Group__7"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:503:1: rule__OrdersType__Group__7 : rule__OrdersType__Group__7__Impl rule__OrdersType__Group__8 ;
    public final void rule__OrdersType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:507:1: ( rule__OrdersType__Group__7__Impl rule__OrdersType__Group__8 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:508:2: rule__OrdersType__Group__7__Impl rule__OrdersType__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__7__Impl_in_rule__OrdersType__Group__7981);
            rule__OrdersType__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__8_in_rule__OrdersType__Group__7984);
            rule__OrdersType__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__7"


    // $ANTLR start "rule__OrdersType__Group__7__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:515:1: rule__OrdersType__Group__7__Impl : ( 'order2' ) ;
    public final void rule__OrdersType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:519:1: ( ( 'order2' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:520:1: ( 'order2' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:520:1: ( 'order2' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:521:1: 'order2'
            {
             before(grammarAccess.getOrdersTypeAccess().getOrder2Keyword_7()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__OrdersType__Group__7__Impl1012); 
             after(grammarAccess.getOrdersTypeAccess().getOrder2Keyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__7__Impl"


    // $ANTLR start "rule__OrdersType__Group__8"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:534:1: rule__OrdersType__Group__8 : rule__OrdersType__Group__8__Impl rule__OrdersType__Group__9 ;
    public final void rule__OrdersType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:538:1: ( rule__OrdersType__Group__8__Impl rule__OrdersType__Group__9 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:539:2: rule__OrdersType__Group__8__Impl rule__OrdersType__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__8__Impl_in_rule__OrdersType__Group__81043);
            rule__OrdersType__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__9_in_rule__OrdersType__Group__81046);
            rule__OrdersType__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__8"


    // $ANTLR start "rule__OrdersType__Group__8__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:546:1: rule__OrdersType__Group__8__Impl : ( '{' ) ;
    public final void rule__OrdersType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:550:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:551:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:551:1: ( '{' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:552:1: '{'
            {
             before(grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__OrdersType__Group__8__Impl1074); 
             after(grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__8__Impl"


    // $ANTLR start "rule__OrdersType__Group__9"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:565:1: rule__OrdersType__Group__9 : rule__OrdersType__Group__9__Impl rule__OrdersType__Group__10 ;
    public final void rule__OrdersType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:569:1: ( rule__OrdersType__Group__9__Impl rule__OrdersType__Group__10 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:570:2: rule__OrdersType__Group__9__Impl rule__OrdersType__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__9__Impl_in_rule__OrdersType__Group__91105);
            rule__OrdersType__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__10_in_rule__OrdersType__Group__91108);
            rule__OrdersType__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__9"


    // $ANTLR start "rule__OrdersType__Group__9__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:577:1: rule__OrdersType__Group__9__Impl : ( ( rule__OrdersType__Order2Assignment_9 ) ) ;
    public final void rule__OrdersType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:581:1: ( ( ( rule__OrdersType__Order2Assignment_9 ) ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:582:1: ( ( rule__OrdersType__Order2Assignment_9 ) )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:582:1: ( ( rule__OrdersType__Order2Assignment_9 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:583:1: ( rule__OrdersType__Order2Assignment_9 )
            {
             before(grammarAccess.getOrdersTypeAccess().getOrder2Assignment_9()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:584:1: ( rule__OrdersType__Order2Assignment_9 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:584:2: rule__OrdersType__Order2Assignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Order2Assignment_9_in_rule__OrdersType__Group__9__Impl1135);
            rule__OrdersType__Order2Assignment_9();

            state._fsp--;


            }

             after(grammarAccess.getOrdersTypeAccess().getOrder2Assignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__9__Impl"


    // $ANTLR start "rule__OrdersType__Group__10"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:594:1: rule__OrdersType__Group__10 : rule__OrdersType__Group__10__Impl rule__OrdersType__Group__11 ;
    public final void rule__OrdersType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:598:1: ( rule__OrdersType__Group__10__Impl rule__OrdersType__Group__11 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:599:2: rule__OrdersType__Group__10__Impl rule__OrdersType__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__10__Impl_in_rule__OrdersType__Group__101165);
            rule__OrdersType__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__11_in_rule__OrdersType__Group__101168);
            rule__OrdersType__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__10"


    // $ANTLR start "rule__OrdersType__Group__10__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:606:1: rule__OrdersType__Group__10__Impl : ( ( rule__OrdersType__Group_10__0 )* ) ;
    public final void rule__OrdersType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:610:1: ( ( ( rule__OrdersType__Group_10__0 )* ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:611:1: ( ( rule__OrdersType__Group_10__0 )* )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:611:1: ( ( rule__OrdersType__Group_10__0 )* )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:612:1: ( rule__OrdersType__Group_10__0 )*
            {
             before(grammarAccess.getOrdersTypeAccess().getGroup_10()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:613:1: ( rule__OrdersType__Group_10__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:613:2: rule__OrdersType__Group_10__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_10__0_in_rule__OrdersType__Group__10__Impl1195);
            	    rule__OrdersType__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getOrdersTypeAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__10__Impl"


    // $ANTLR start "rule__OrdersType__Group__11"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:623:1: rule__OrdersType__Group__11 : rule__OrdersType__Group__11__Impl rule__OrdersType__Group__12 ;
    public final void rule__OrdersType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:627:1: ( rule__OrdersType__Group__11__Impl rule__OrdersType__Group__12 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:628:2: rule__OrdersType__Group__11__Impl rule__OrdersType__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__11__Impl_in_rule__OrdersType__Group__111226);
            rule__OrdersType__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__12_in_rule__OrdersType__Group__111229);
            rule__OrdersType__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__11"


    // $ANTLR start "rule__OrdersType__Group__11__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:635:1: rule__OrdersType__Group__11__Impl : ( '}' ) ;
    public final void rule__OrdersType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:639:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:640:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:640:1: ( '}' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:641:1: '}'
            {
             before(grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_11()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__OrdersType__Group__11__Impl1257); 
             after(grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__11__Impl"


    // $ANTLR start "rule__OrdersType__Group__12"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:654:1: rule__OrdersType__Group__12 : rule__OrdersType__Group__12__Impl rule__OrdersType__Group__13 ;
    public final void rule__OrdersType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:658:1: ( rule__OrdersType__Group__12__Impl rule__OrdersType__Group__13 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:659:2: rule__OrdersType__Group__12__Impl rule__OrdersType__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__12__Impl_in_rule__OrdersType__Group__121288);
            rule__OrdersType__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__13_in_rule__OrdersType__Group__121291);
            rule__OrdersType__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__12"


    // $ANTLR start "rule__OrdersType__Group__12__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:666:1: rule__OrdersType__Group__12__Impl : ( 'orderReference1' ) ;
    public final void rule__OrdersType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:670:1: ( ( 'orderReference1' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:671:1: ( 'orderReference1' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:671:1: ( 'orderReference1' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:672:1: 'orderReference1'
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderReference1Keyword_12()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__OrdersType__Group__12__Impl1319); 
             after(grammarAccess.getOrdersTypeAccess().getOrderReference1Keyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__12__Impl"


    // $ANTLR start "rule__OrdersType__Group__13"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:685:1: rule__OrdersType__Group__13 : rule__OrdersType__Group__13__Impl rule__OrdersType__Group__14 ;
    public final void rule__OrdersType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:689:1: ( rule__OrdersType__Group__13__Impl rule__OrdersType__Group__14 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:690:2: rule__OrdersType__Group__13__Impl rule__OrdersType__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__13__Impl_in_rule__OrdersType__Group__131350);
            rule__OrdersType__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__14_in_rule__OrdersType__Group__131353);
            rule__OrdersType__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__13"


    // $ANTLR start "rule__OrdersType__Group__13__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:697:1: rule__OrdersType__Group__13__Impl : ( '{' ) ;
    public final void rule__OrdersType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:701:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:702:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:702:1: ( '{' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:703:1: '{'
            {
             before(grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_13()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__OrdersType__Group__13__Impl1381); 
             after(grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__13__Impl"


    // $ANTLR start "rule__OrdersType__Group__14"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:716:1: rule__OrdersType__Group__14 : rule__OrdersType__Group__14__Impl rule__OrdersType__Group__15 ;
    public final void rule__OrdersType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:720:1: ( rule__OrdersType__Group__14__Impl rule__OrdersType__Group__15 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:721:2: rule__OrdersType__Group__14__Impl rule__OrdersType__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__14__Impl_in_rule__OrdersType__Group__141412);
            rule__OrdersType__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__15_in_rule__OrdersType__Group__141415);
            rule__OrdersType__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__14"


    // $ANTLR start "rule__OrdersType__Group__14__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:728:1: rule__OrdersType__Group__14__Impl : ( ( rule__OrdersType__OrderReference1Assignment_14 ) ) ;
    public final void rule__OrdersType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:732:1: ( ( ( rule__OrdersType__OrderReference1Assignment_14 ) ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:733:1: ( ( rule__OrdersType__OrderReference1Assignment_14 ) )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:733:1: ( ( rule__OrdersType__OrderReference1Assignment_14 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:734:1: ( rule__OrdersType__OrderReference1Assignment_14 )
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderReference1Assignment_14()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:735:1: ( rule__OrdersType__OrderReference1Assignment_14 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:735:2: rule__OrdersType__OrderReference1Assignment_14
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__OrderReference1Assignment_14_in_rule__OrdersType__Group__14__Impl1442);
            rule__OrdersType__OrderReference1Assignment_14();

            state._fsp--;


            }

             after(grammarAccess.getOrdersTypeAccess().getOrderReference1Assignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__14__Impl"


    // $ANTLR start "rule__OrdersType__Group__15"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:745:1: rule__OrdersType__Group__15 : rule__OrdersType__Group__15__Impl rule__OrdersType__Group__16 ;
    public final void rule__OrdersType__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:749:1: ( rule__OrdersType__Group__15__Impl rule__OrdersType__Group__16 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:750:2: rule__OrdersType__Group__15__Impl rule__OrdersType__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__15__Impl_in_rule__OrdersType__Group__151472);
            rule__OrdersType__Group__15__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__16_in_rule__OrdersType__Group__151475);
            rule__OrdersType__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__15"


    // $ANTLR start "rule__OrdersType__Group__15__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:757:1: rule__OrdersType__Group__15__Impl : ( ( rule__OrdersType__Group_15__0 )* ) ;
    public final void rule__OrdersType__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:761:1: ( ( ( rule__OrdersType__Group_15__0 )* ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:762:1: ( ( rule__OrdersType__Group_15__0 )* )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:762:1: ( ( rule__OrdersType__Group_15__0 )* )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:763:1: ( rule__OrdersType__Group_15__0 )*
            {
             before(grammarAccess.getOrdersTypeAccess().getGroup_15()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:764:1: ( rule__OrdersType__Group_15__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:764:2: rule__OrdersType__Group_15__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_15__0_in_rule__OrdersType__Group__15__Impl1502);
            	    rule__OrdersType__Group_15__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getOrdersTypeAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__15__Impl"


    // $ANTLR start "rule__OrdersType__Group__16"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:774:1: rule__OrdersType__Group__16 : rule__OrdersType__Group__16__Impl rule__OrdersType__Group__17 ;
    public final void rule__OrdersType__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:778:1: ( rule__OrdersType__Group__16__Impl rule__OrdersType__Group__17 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:779:2: rule__OrdersType__Group__16__Impl rule__OrdersType__Group__17
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__16__Impl_in_rule__OrdersType__Group__161533);
            rule__OrdersType__Group__16__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__17_in_rule__OrdersType__Group__161536);
            rule__OrdersType__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__16"


    // $ANTLR start "rule__OrdersType__Group__16__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:786:1: rule__OrdersType__Group__16__Impl : ( '}' ) ;
    public final void rule__OrdersType__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:790:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:791:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:791:1: ( '}' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:792:1: '}'
            {
             before(grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_16()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__OrdersType__Group__16__Impl1564); 
             after(grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__16__Impl"


    // $ANTLR start "rule__OrdersType__Group__17"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:805:1: rule__OrdersType__Group__17 : rule__OrdersType__Group__17__Impl rule__OrdersType__Group__18 ;
    public final void rule__OrdersType__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:809:1: ( rule__OrdersType__Group__17__Impl rule__OrdersType__Group__18 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:810:2: rule__OrdersType__Group__17__Impl rule__OrdersType__Group__18
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__17__Impl_in_rule__OrdersType__Group__171595);
            rule__OrdersType__Group__17__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__18_in_rule__OrdersType__Group__171598);
            rule__OrdersType__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__17"


    // $ANTLR start "rule__OrdersType__Group__17__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:817:1: rule__OrdersType__Group__17__Impl : ( 'orderReference2' ) ;
    public final void rule__OrdersType__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:821:1: ( ( 'orderReference2' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:822:1: ( 'orderReference2' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:822:1: ( 'orderReference2' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:823:1: 'orderReference2'
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderReference2Keyword_17()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__OrdersType__Group__17__Impl1626); 
             after(grammarAccess.getOrdersTypeAccess().getOrderReference2Keyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__17__Impl"


    // $ANTLR start "rule__OrdersType__Group__18"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:836:1: rule__OrdersType__Group__18 : rule__OrdersType__Group__18__Impl rule__OrdersType__Group__19 ;
    public final void rule__OrdersType__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:840:1: ( rule__OrdersType__Group__18__Impl rule__OrdersType__Group__19 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:841:2: rule__OrdersType__Group__18__Impl rule__OrdersType__Group__19
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__18__Impl_in_rule__OrdersType__Group__181657);
            rule__OrdersType__Group__18__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__19_in_rule__OrdersType__Group__181660);
            rule__OrdersType__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__18"


    // $ANTLR start "rule__OrdersType__Group__18__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:848:1: rule__OrdersType__Group__18__Impl : ( '{' ) ;
    public final void rule__OrdersType__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:852:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:853:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:853:1: ( '{' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:854:1: '{'
            {
             before(grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_18()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__OrdersType__Group__18__Impl1688); 
             after(grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__18__Impl"


    // $ANTLR start "rule__OrdersType__Group__19"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:867:1: rule__OrdersType__Group__19 : rule__OrdersType__Group__19__Impl rule__OrdersType__Group__20 ;
    public final void rule__OrdersType__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:871:1: ( rule__OrdersType__Group__19__Impl rule__OrdersType__Group__20 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:872:2: rule__OrdersType__Group__19__Impl rule__OrdersType__Group__20
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__19__Impl_in_rule__OrdersType__Group__191719);
            rule__OrdersType__Group__19__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__20_in_rule__OrdersType__Group__191722);
            rule__OrdersType__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__19"


    // $ANTLR start "rule__OrdersType__Group__19__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:879:1: rule__OrdersType__Group__19__Impl : ( ( rule__OrdersType__OrderReference2Assignment_19 ) ) ;
    public final void rule__OrdersType__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:883:1: ( ( ( rule__OrdersType__OrderReference2Assignment_19 ) ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:884:1: ( ( rule__OrdersType__OrderReference2Assignment_19 ) )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:884:1: ( ( rule__OrdersType__OrderReference2Assignment_19 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:885:1: ( rule__OrdersType__OrderReference2Assignment_19 )
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderReference2Assignment_19()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:886:1: ( rule__OrdersType__OrderReference2Assignment_19 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:886:2: rule__OrdersType__OrderReference2Assignment_19
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__OrderReference2Assignment_19_in_rule__OrdersType__Group__19__Impl1749);
            rule__OrdersType__OrderReference2Assignment_19();

            state._fsp--;


            }

             after(grammarAccess.getOrdersTypeAccess().getOrderReference2Assignment_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__19__Impl"


    // $ANTLR start "rule__OrdersType__Group__20"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:896:1: rule__OrdersType__Group__20 : rule__OrdersType__Group__20__Impl rule__OrdersType__Group__21 ;
    public final void rule__OrdersType__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:900:1: ( rule__OrdersType__Group__20__Impl rule__OrdersType__Group__21 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:901:2: rule__OrdersType__Group__20__Impl rule__OrdersType__Group__21
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__20__Impl_in_rule__OrdersType__Group__201779);
            rule__OrdersType__Group__20__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__21_in_rule__OrdersType__Group__201782);
            rule__OrdersType__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__20"


    // $ANTLR start "rule__OrdersType__Group__20__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:908:1: rule__OrdersType__Group__20__Impl : ( ( rule__OrdersType__Group_20__0 )* ) ;
    public final void rule__OrdersType__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:912:1: ( ( ( rule__OrdersType__Group_20__0 )* ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:913:1: ( ( rule__OrdersType__Group_20__0 )* )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:913:1: ( ( rule__OrdersType__Group_20__0 )* )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:914:1: ( rule__OrdersType__Group_20__0 )*
            {
             before(grammarAccess.getOrdersTypeAccess().getGroup_20()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:915:1: ( rule__OrdersType__Group_20__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:915:2: rule__OrdersType__Group_20__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_20__0_in_rule__OrdersType__Group__20__Impl1809);
            	    rule__OrdersType__Group_20__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getOrdersTypeAccess().getGroup_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__20__Impl"


    // $ANTLR start "rule__OrdersType__Group__21"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:925:1: rule__OrdersType__Group__21 : rule__OrdersType__Group__21__Impl rule__OrdersType__Group__22 ;
    public final void rule__OrdersType__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:929:1: ( rule__OrdersType__Group__21__Impl rule__OrdersType__Group__22 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:930:2: rule__OrdersType__Group__21__Impl rule__OrdersType__Group__22
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__21__Impl_in_rule__OrdersType__Group__211840);
            rule__OrdersType__Group__21__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__22_in_rule__OrdersType__Group__211843);
            rule__OrdersType__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__21"


    // $ANTLR start "rule__OrdersType__Group__21__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:937:1: rule__OrdersType__Group__21__Impl : ( '}' ) ;
    public final void rule__OrdersType__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:941:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:942:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:942:1: ( '}' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:943:1: '}'
            {
             before(grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_21()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__OrdersType__Group__21__Impl1871); 
             after(grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__21__Impl"


    // $ANTLR start "rule__OrdersType__Group__22"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:956:1: rule__OrdersType__Group__22 : rule__OrdersType__Group__22__Impl ;
    public final void rule__OrdersType__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:960:1: ( rule__OrdersType__Group__22__Impl )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:961:2: rule__OrdersType__Group__22__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__22__Impl_in_rule__OrdersType__Group__221902);
            rule__OrdersType__Group__22__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__22"


    // $ANTLR start "rule__OrdersType__Group__22__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:967:1: rule__OrdersType__Group__22__Impl : ( '}' ) ;
    public final void rule__OrdersType__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:971:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:972:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:972:1: ( '}' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:973:1: '}'
            {
             before(grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_22()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__OrdersType__Group__22__Impl1930); 
             after(grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group__22__Impl"


    // $ANTLR start "rule__OrdersType__Group_5__0"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1032:1: rule__OrdersType__Group_5__0 : rule__OrdersType__Group_5__0__Impl rule__OrdersType__Group_5__1 ;
    public final void rule__OrdersType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1036:1: ( rule__OrdersType__Group_5__0__Impl rule__OrdersType__Group_5__1 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1037:2: rule__OrdersType__Group_5__0__Impl rule__OrdersType__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_5__0__Impl_in_rule__OrdersType__Group_5__02007);
            rule__OrdersType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_5__1_in_rule__OrdersType__Group_5__02010);
            rule__OrdersType__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group_5__0"


    // $ANTLR start "rule__OrdersType__Group_5__0__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1044:1: rule__OrdersType__Group_5__0__Impl : ( ',' ) ;
    public final void rule__OrdersType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1048:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1049:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1049:1: ( ',' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1050:1: ','
            {
             before(grammarAccess.getOrdersTypeAccess().getCommaKeyword_5_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__OrdersType__Group_5__0__Impl2038); 
             after(grammarAccess.getOrdersTypeAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group_5__0__Impl"


    // $ANTLR start "rule__OrdersType__Group_5__1"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1063:1: rule__OrdersType__Group_5__1 : rule__OrdersType__Group_5__1__Impl ;
    public final void rule__OrdersType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1067:1: ( rule__OrdersType__Group_5__1__Impl )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1068:2: rule__OrdersType__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_5__1__Impl_in_rule__OrdersType__Group_5__12069);
            rule__OrdersType__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group_5__1"


    // $ANTLR start "rule__OrdersType__Group_5__1__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1074:1: rule__OrdersType__Group_5__1__Impl : ( ( rule__OrdersType__Order1Assignment_5_1 ) ) ;
    public final void rule__OrdersType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1078:1: ( ( ( rule__OrdersType__Order1Assignment_5_1 ) ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1079:1: ( ( rule__OrdersType__Order1Assignment_5_1 ) )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1079:1: ( ( rule__OrdersType__Order1Assignment_5_1 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1080:1: ( rule__OrdersType__Order1Assignment_5_1 )
            {
             before(grammarAccess.getOrdersTypeAccess().getOrder1Assignment_5_1()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1081:1: ( rule__OrdersType__Order1Assignment_5_1 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1081:2: rule__OrdersType__Order1Assignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Order1Assignment_5_1_in_rule__OrdersType__Group_5__1__Impl2096);
            rule__OrdersType__Order1Assignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getOrdersTypeAccess().getOrder1Assignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group_5__1__Impl"


    // $ANTLR start "rule__OrdersType__Group_10__0"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1095:1: rule__OrdersType__Group_10__0 : rule__OrdersType__Group_10__0__Impl rule__OrdersType__Group_10__1 ;
    public final void rule__OrdersType__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1099:1: ( rule__OrdersType__Group_10__0__Impl rule__OrdersType__Group_10__1 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1100:2: rule__OrdersType__Group_10__0__Impl rule__OrdersType__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_10__0__Impl_in_rule__OrdersType__Group_10__02130);
            rule__OrdersType__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_10__1_in_rule__OrdersType__Group_10__02133);
            rule__OrdersType__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group_10__0"


    // $ANTLR start "rule__OrdersType__Group_10__0__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1107:1: rule__OrdersType__Group_10__0__Impl : ( ',' ) ;
    public final void rule__OrdersType__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1111:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1112:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1112:1: ( ',' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1113:1: ','
            {
             before(grammarAccess.getOrdersTypeAccess().getCommaKeyword_10_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__OrdersType__Group_10__0__Impl2161); 
             after(grammarAccess.getOrdersTypeAccess().getCommaKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group_10__0__Impl"


    // $ANTLR start "rule__OrdersType__Group_10__1"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1126:1: rule__OrdersType__Group_10__1 : rule__OrdersType__Group_10__1__Impl ;
    public final void rule__OrdersType__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1130:1: ( rule__OrdersType__Group_10__1__Impl )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1131:2: rule__OrdersType__Group_10__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_10__1__Impl_in_rule__OrdersType__Group_10__12192);
            rule__OrdersType__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group_10__1"


    // $ANTLR start "rule__OrdersType__Group_10__1__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1137:1: rule__OrdersType__Group_10__1__Impl : ( ( rule__OrdersType__Order2Assignment_10_1 ) ) ;
    public final void rule__OrdersType__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1141:1: ( ( ( rule__OrdersType__Order2Assignment_10_1 ) ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1142:1: ( ( rule__OrdersType__Order2Assignment_10_1 ) )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1142:1: ( ( rule__OrdersType__Order2Assignment_10_1 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1143:1: ( rule__OrdersType__Order2Assignment_10_1 )
            {
             before(grammarAccess.getOrdersTypeAccess().getOrder2Assignment_10_1()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1144:1: ( rule__OrdersType__Order2Assignment_10_1 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1144:2: rule__OrdersType__Order2Assignment_10_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Order2Assignment_10_1_in_rule__OrdersType__Group_10__1__Impl2219);
            rule__OrdersType__Order2Assignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getOrdersTypeAccess().getOrder2Assignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group_10__1__Impl"


    // $ANTLR start "rule__OrdersType__Group_15__0"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1158:1: rule__OrdersType__Group_15__0 : rule__OrdersType__Group_15__0__Impl rule__OrdersType__Group_15__1 ;
    public final void rule__OrdersType__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1162:1: ( rule__OrdersType__Group_15__0__Impl rule__OrdersType__Group_15__1 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1163:2: rule__OrdersType__Group_15__0__Impl rule__OrdersType__Group_15__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_15__0__Impl_in_rule__OrdersType__Group_15__02253);
            rule__OrdersType__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_15__1_in_rule__OrdersType__Group_15__02256);
            rule__OrdersType__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group_15__0"


    // $ANTLR start "rule__OrdersType__Group_15__0__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1170:1: rule__OrdersType__Group_15__0__Impl : ( ',' ) ;
    public final void rule__OrdersType__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1174:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1175:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1175:1: ( ',' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1176:1: ','
            {
             before(grammarAccess.getOrdersTypeAccess().getCommaKeyword_15_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__OrdersType__Group_15__0__Impl2284); 
             after(grammarAccess.getOrdersTypeAccess().getCommaKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group_15__0__Impl"


    // $ANTLR start "rule__OrdersType__Group_15__1"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1189:1: rule__OrdersType__Group_15__1 : rule__OrdersType__Group_15__1__Impl ;
    public final void rule__OrdersType__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1193:1: ( rule__OrdersType__Group_15__1__Impl )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1194:2: rule__OrdersType__Group_15__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_15__1__Impl_in_rule__OrdersType__Group_15__12315);
            rule__OrdersType__Group_15__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group_15__1"


    // $ANTLR start "rule__OrdersType__Group_15__1__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1200:1: rule__OrdersType__Group_15__1__Impl : ( ( rule__OrdersType__OrderReference1Assignment_15_1 ) ) ;
    public final void rule__OrdersType__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1204:1: ( ( ( rule__OrdersType__OrderReference1Assignment_15_1 ) ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1205:1: ( ( rule__OrdersType__OrderReference1Assignment_15_1 ) )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1205:1: ( ( rule__OrdersType__OrderReference1Assignment_15_1 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1206:1: ( rule__OrdersType__OrderReference1Assignment_15_1 )
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderReference1Assignment_15_1()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1207:1: ( rule__OrdersType__OrderReference1Assignment_15_1 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1207:2: rule__OrdersType__OrderReference1Assignment_15_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__OrderReference1Assignment_15_1_in_rule__OrdersType__Group_15__1__Impl2342);
            rule__OrdersType__OrderReference1Assignment_15_1();

            state._fsp--;


            }

             after(grammarAccess.getOrdersTypeAccess().getOrderReference1Assignment_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group_15__1__Impl"


    // $ANTLR start "rule__OrdersType__Group_20__0"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1221:1: rule__OrdersType__Group_20__0 : rule__OrdersType__Group_20__0__Impl rule__OrdersType__Group_20__1 ;
    public final void rule__OrdersType__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1225:1: ( rule__OrdersType__Group_20__0__Impl rule__OrdersType__Group_20__1 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1226:2: rule__OrdersType__Group_20__0__Impl rule__OrdersType__Group_20__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_20__0__Impl_in_rule__OrdersType__Group_20__02376);
            rule__OrdersType__Group_20__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_20__1_in_rule__OrdersType__Group_20__02379);
            rule__OrdersType__Group_20__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group_20__0"


    // $ANTLR start "rule__OrdersType__Group_20__0__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1233:1: rule__OrdersType__Group_20__0__Impl : ( ',' ) ;
    public final void rule__OrdersType__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1237:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1238:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1238:1: ( ',' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1239:1: ','
            {
             before(grammarAccess.getOrdersTypeAccess().getCommaKeyword_20_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__OrdersType__Group_20__0__Impl2407); 
             after(grammarAccess.getOrdersTypeAccess().getCommaKeyword_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group_20__0__Impl"


    // $ANTLR start "rule__OrdersType__Group_20__1"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1252:1: rule__OrdersType__Group_20__1 : rule__OrdersType__Group_20__1__Impl ;
    public final void rule__OrdersType__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1256:1: ( rule__OrdersType__Group_20__1__Impl )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1257:2: rule__OrdersType__Group_20__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_20__1__Impl_in_rule__OrdersType__Group_20__12438);
            rule__OrdersType__Group_20__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group_20__1"


    // $ANTLR start "rule__OrdersType__Group_20__1__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1263:1: rule__OrdersType__Group_20__1__Impl : ( ( rule__OrdersType__OrderReference2Assignment_20_1 ) ) ;
    public final void rule__OrdersType__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1267:1: ( ( ( rule__OrdersType__OrderReference2Assignment_20_1 ) ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1268:1: ( ( rule__OrdersType__OrderReference2Assignment_20_1 ) )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1268:1: ( ( rule__OrdersType__OrderReference2Assignment_20_1 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1269:1: ( rule__OrdersType__OrderReference2Assignment_20_1 )
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderReference2Assignment_20_1()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1270:1: ( rule__OrdersType__OrderReference2Assignment_20_1 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1270:2: rule__OrdersType__OrderReference2Assignment_20_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__OrderReference2Assignment_20_1_in_rule__OrdersType__Group_20__1__Impl2465);
            rule__OrdersType__OrderReference2Assignment_20_1();

            state._fsp--;


            }

             after(grammarAccess.getOrdersTypeAccess().getOrderReference2Assignment_20_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Group_20__1__Impl"


    // $ANTLR start "rule__OrderDetail1__Group__0"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1284:1: rule__OrderDetail1__Group__0 : rule__OrderDetail1__Group__0__Impl rule__OrderDetail1__Group__1 ;
    public final void rule__OrderDetail1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1288:1: ( rule__OrderDetail1__Group__0__Impl rule__OrderDetail1__Group__1 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1289:2: rule__OrderDetail1__Group__0__Impl rule__OrderDetail1__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__0__Impl_in_rule__OrderDetail1__Group__02499);
            rule__OrderDetail1__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__1_in_rule__OrderDetail1__Group__02502);
            rule__OrderDetail1__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__Group__0"


    // $ANTLR start "rule__OrderDetail1__Group__0__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1296:1: rule__OrderDetail1__Group__0__Impl : ( () ) ;
    public final void rule__OrderDetail1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1300:1: ( ( () ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1301:1: ( () )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1301:1: ( () )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1302:1: ()
            {
             before(grammarAccess.getOrderDetail1Access().getOrderDetail1Action_0()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1303:1: ()
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1305:1: 
            {
            }

             after(grammarAccess.getOrderDetail1Access().getOrderDetail1Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__Group__0__Impl"


    // $ANTLR start "rule__OrderDetail1__Group__1"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1315:1: rule__OrderDetail1__Group__1 : rule__OrderDetail1__Group__1__Impl rule__OrderDetail1__Group__2 ;
    public final void rule__OrderDetail1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1319:1: ( rule__OrderDetail1__Group__1__Impl rule__OrderDetail1__Group__2 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1320:2: rule__OrderDetail1__Group__1__Impl rule__OrderDetail1__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__1__Impl_in_rule__OrderDetail1__Group__12560);
            rule__OrderDetail1__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__2_in_rule__OrderDetail1__Group__12563);
            rule__OrderDetail1__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__Group__1"


    // $ANTLR start "rule__OrderDetail1__Group__1__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1327:1: rule__OrderDetail1__Group__1__Impl : ( 'OrderDetail1' ) ;
    public final void rule__OrderDetail1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1331:1: ( ( 'OrderDetail1' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1332:1: ( 'OrderDetail1' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1332:1: ( 'OrderDetail1' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1333:1: 'OrderDetail1'
            {
             before(grammarAccess.getOrderDetail1Access().getOrderDetail1Keyword_1()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__OrderDetail1__Group__1__Impl2591); 
             after(grammarAccess.getOrderDetail1Access().getOrderDetail1Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__Group__1__Impl"


    // $ANTLR start "rule__OrderDetail1__Group__2"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1346:1: rule__OrderDetail1__Group__2 : rule__OrderDetail1__Group__2__Impl rule__OrderDetail1__Group__3 ;
    public final void rule__OrderDetail1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1350:1: ( rule__OrderDetail1__Group__2__Impl rule__OrderDetail1__Group__3 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1351:2: rule__OrderDetail1__Group__2__Impl rule__OrderDetail1__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__2__Impl_in_rule__OrderDetail1__Group__22622);
            rule__OrderDetail1__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__3_in_rule__OrderDetail1__Group__22625);
            rule__OrderDetail1__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__Group__2"


    // $ANTLR start "rule__OrderDetail1__Group__2__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1358:1: rule__OrderDetail1__Group__2__Impl : ( ( rule__OrderDetail1__OrderIDAssignment_2 ) ) ;
    public final void rule__OrderDetail1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1362:1: ( ( ( rule__OrderDetail1__OrderIDAssignment_2 ) ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1363:1: ( ( rule__OrderDetail1__OrderIDAssignment_2 ) )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1363:1: ( ( rule__OrderDetail1__OrderIDAssignment_2 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1364:1: ( rule__OrderDetail1__OrderIDAssignment_2 )
            {
             before(grammarAccess.getOrderDetail1Access().getOrderIDAssignment_2()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1365:1: ( rule__OrderDetail1__OrderIDAssignment_2 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1365:2: rule__OrderDetail1__OrderIDAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__OrderIDAssignment_2_in_rule__OrderDetail1__Group__2__Impl2652);
            rule__OrderDetail1__OrderIDAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOrderDetail1Access().getOrderIDAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__Group__2__Impl"


    // $ANTLR start "rule__OrderDetail1__Group__3"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1375:1: rule__OrderDetail1__Group__3 : rule__OrderDetail1__Group__3__Impl rule__OrderDetail1__Group__4 ;
    public final void rule__OrderDetail1__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1379:1: ( rule__OrderDetail1__Group__3__Impl rule__OrderDetail1__Group__4 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1380:2: rule__OrderDetail1__Group__3__Impl rule__OrderDetail1__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__3__Impl_in_rule__OrderDetail1__Group__32682);
            rule__OrderDetail1__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__4_in_rule__OrderDetail1__Group__32685);
            rule__OrderDetail1__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__Group__3"


    // $ANTLR start "rule__OrderDetail1__Group__3__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1387:1: rule__OrderDetail1__Group__3__Impl : ( '{' ) ;
    public final void rule__OrderDetail1__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1391:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1392:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1392:1: ( '{' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1393:1: '{'
            {
             before(grammarAccess.getOrderDetail1Access().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__OrderDetail1__Group__3__Impl2713); 
             after(grammarAccess.getOrderDetail1Access().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__Group__3__Impl"


    // $ANTLR start "rule__OrderDetail1__Group__4"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1406:1: rule__OrderDetail1__Group__4 : rule__OrderDetail1__Group__4__Impl rule__OrderDetail1__Group__5 ;
    public final void rule__OrderDetail1__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1410:1: ( rule__OrderDetail1__Group__4__Impl rule__OrderDetail1__Group__5 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1411:2: rule__OrderDetail1__Group__4__Impl rule__OrderDetail1__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__4__Impl_in_rule__OrderDetail1__Group__42744);
            rule__OrderDetail1__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__5_in_rule__OrderDetail1__Group__42747);
            rule__OrderDetail1__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__Group__4"


    // $ANTLR start "rule__OrderDetail1__Group__4__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1418:1: rule__OrderDetail1__Group__4__Impl : ( ( rule__OrderDetail1__Group_4__0 )? ) ;
    public final void rule__OrderDetail1__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1422:1: ( ( ( rule__OrderDetail1__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1423:1: ( ( rule__OrderDetail1__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1423:1: ( ( rule__OrderDetail1__Group_4__0 )? )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1424:1: ( rule__OrderDetail1__Group_4__0 )?
            {
             before(grammarAccess.getOrderDetail1Access().getGroup_4()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1425:1: ( rule__OrderDetail1__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1425:2: rule__OrderDetail1__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_4__0_in_rule__OrderDetail1__Group__4__Impl2774);
                    rule__OrderDetail1__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrderDetail1Access().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__Group__4__Impl"


    // $ANTLR start "rule__OrderDetail1__Group__5"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1435:1: rule__OrderDetail1__Group__5 : rule__OrderDetail1__Group__5__Impl rule__OrderDetail1__Group__6 ;
    public final void rule__OrderDetail1__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1439:1: ( rule__OrderDetail1__Group__5__Impl rule__OrderDetail1__Group__6 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1440:2: rule__OrderDetail1__Group__5__Impl rule__OrderDetail1__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__5__Impl_in_rule__OrderDetail1__Group__52805);
            rule__OrderDetail1__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__6_in_rule__OrderDetail1__Group__52808);
            rule__OrderDetail1__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__Group__5"


    // $ANTLR start "rule__OrderDetail1__Group__5__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1447:1: rule__OrderDetail1__Group__5__Impl : ( ( rule__OrderDetail1__Group_5__0 )? ) ;
    public final void rule__OrderDetail1__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1451:1: ( ( ( rule__OrderDetail1__Group_5__0 )? ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1452:1: ( ( rule__OrderDetail1__Group_5__0 )? )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1452:1: ( ( rule__OrderDetail1__Group_5__0 )? )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1453:1: ( rule__OrderDetail1__Group_5__0 )?
            {
             before(grammarAccess.getOrderDetail1Access().getGroup_5()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1454:1: ( rule__OrderDetail1__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1454:2: rule__OrderDetail1__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_5__0_in_rule__OrderDetail1__Group__5__Impl2835);
                    rule__OrderDetail1__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrderDetail1Access().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__Group__5__Impl"


    // $ANTLR start "rule__OrderDetail1__Group__6"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1464:1: rule__OrderDetail1__Group__6 : rule__OrderDetail1__Group__6__Impl rule__OrderDetail1__Group__7 ;
    public final void rule__OrderDetail1__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1468:1: ( rule__OrderDetail1__Group__6__Impl rule__OrderDetail1__Group__7 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1469:2: rule__OrderDetail1__Group__6__Impl rule__OrderDetail1__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__6__Impl_in_rule__OrderDetail1__Group__62866);
            rule__OrderDetail1__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__7_in_rule__OrderDetail1__Group__62869);
            rule__OrderDetail1__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__Group__6"


    // $ANTLR start "rule__OrderDetail1__Group__6__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1476:1: rule__OrderDetail1__Group__6__Impl : ( ( rule__OrderDetail1__Group_6__0 )? ) ;
    public final void rule__OrderDetail1__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1480:1: ( ( ( rule__OrderDetail1__Group_6__0 )? ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1481:1: ( ( rule__OrderDetail1__Group_6__0 )? )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1481:1: ( ( rule__OrderDetail1__Group_6__0 )? )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1482:1: ( rule__OrderDetail1__Group_6__0 )?
            {
             before(grammarAccess.getOrderDetail1Access().getGroup_6()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1483:1: ( rule__OrderDetail1__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1483:2: rule__OrderDetail1__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_6__0_in_rule__OrderDetail1__Group__6__Impl2896);
                    rule__OrderDetail1__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrderDetail1Access().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__Group__6__Impl"


    // $ANTLR start "rule__OrderDetail1__Group__7"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1493:1: rule__OrderDetail1__Group__7 : rule__OrderDetail1__Group__7__Impl ;
    public final void rule__OrderDetail1__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1497:1: ( rule__OrderDetail1__Group__7__Impl )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1498:2: rule__OrderDetail1__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__7__Impl_in_rule__OrderDetail1__Group__72927);
            rule__OrderDetail1__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__Group__7"


    // $ANTLR start "rule__OrderDetail1__Group__7__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1504:1: rule__OrderDetail1__Group__7__Impl : ( '}' ) ;
    public final void rule__OrderDetail1__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1508:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1509:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1509:1: ( '}' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1510:1: '}'
            {
             before(grammarAccess.getOrderDetail1Access().getRightCurlyBracketKeyword_7()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__OrderDetail1__Group__7__Impl2955); 
             after(grammarAccess.getOrderDetail1Access().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__Group__7__Impl"


    // $ANTLR start "rule__OrderDetail1__Group_4__0"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1539:1: rule__OrderDetail1__Group_4__0 : rule__OrderDetail1__Group_4__0__Impl rule__OrderDetail1__Group_4__1 ;
    public final void rule__OrderDetail1__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1543:1: ( rule__OrderDetail1__Group_4__0__Impl rule__OrderDetail1__Group_4__1 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1544:2: rule__OrderDetail1__Group_4__0__Impl rule__OrderDetail1__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_4__0__Impl_in_rule__OrderDetail1__Group_4__03002);
            rule__OrderDetail1__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_4__1_in_rule__OrderDetail1__Group_4__03005);
            rule__OrderDetail1__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__Group_4__0"


    // $ANTLR start "rule__OrderDetail1__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1551:1: rule__OrderDetail1__Group_4__0__Impl : ( 'customerAddress' ) ;
    public final void rule__OrderDetail1__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1555:1: ( ( 'customerAddress' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1556:1: ( 'customerAddress' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1556:1: ( 'customerAddress' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1557:1: 'customerAddress'
            {
             before(grammarAccess.getOrderDetail1Access().getCustomerAddressKeyword_4_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__OrderDetail1__Group_4__0__Impl3033); 
             after(grammarAccess.getOrderDetail1Access().getCustomerAddressKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__Group_4__0__Impl"


    // $ANTLR start "rule__OrderDetail1__Group_4__1"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1570:1: rule__OrderDetail1__Group_4__1 : rule__OrderDetail1__Group_4__1__Impl ;
    public final void rule__OrderDetail1__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1574:1: ( rule__OrderDetail1__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1575:2: rule__OrderDetail1__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_4__1__Impl_in_rule__OrderDetail1__Group_4__13064);
            rule__OrderDetail1__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__Group_4__1"


    // $ANTLR start "rule__OrderDetail1__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1581:1: rule__OrderDetail1__Group_4__1__Impl : ( ( rule__OrderDetail1__CustomerAddressAssignment_4_1 ) ) ;
    public final void rule__OrderDetail1__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1585:1: ( ( ( rule__OrderDetail1__CustomerAddressAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1586:1: ( ( rule__OrderDetail1__CustomerAddressAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1586:1: ( ( rule__OrderDetail1__CustomerAddressAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1587:1: ( rule__OrderDetail1__CustomerAddressAssignment_4_1 )
            {
             before(grammarAccess.getOrderDetail1Access().getCustomerAddressAssignment_4_1()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1588:1: ( rule__OrderDetail1__CustomerAddressAssignment_4_1 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1588:2: rule__OrderDetail1__CustomerAddressAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__CustomerAddressAssignment_4_1_in_rule__OrderDetail1__Group_4__1__Impl3091);
            rule__OrderDetail1__CustomerAddressAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderDetail1Access().getCustomerAddressAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__Group_4__1__Impl"


    // $ANTLR start "rule__OrderDetail1__Group_5__0"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1602:1: rule__OrderDetail1__Group_5__0 : rule__OrderDetail1__Group_5__0__Impl rule__OrderDetail1__Group_5__1 ;
    public final void rule__OrderDetail1__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1606:1: ( rule__OrderDetail1__Group_5__0__Impl rule__OrderDetail1__Group_5__1 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1607:2: rule__OrderDetail1__Group_5__0__Impl rule__OrderDetail1__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_5__0__Impl_in_rule__OrderDetail1__Group_5__03125);
            rule__OrderDetail1__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_5__1_in_rule__OrderDetail1__Group_5__03128);
            rule__OrderDetail1__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__Group_5__0"


    // $ANTLR start "rule__OrderDetail1__Group_5__0__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1614:1: rule__OrderDetail1__Group_5__0__Impl : ( 'customerContact' ) ;
    public final void rule__OrderDetail1__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1618:1: ( ( 'customerContact' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1619:1: ( 'customerContact' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1619:1: ( 'customerContact' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1620:1: 'customerContact'
            {
             before(grammarAccess.getOrderDetail1Access().getCustomerContactKeyword_5_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__OrderDetail1__Group_5__0__Impl3156); 
             after(grammarAccess.getOrderDetail1Access().getCustomerContactKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__Group_5__0__Impl"


    // $ANTLR start "rule__OrderDetail1__Group_5__1"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1633:1: rule__OrderDetail1__Group_5__1 : rule__OrderDetail1__Group_5__1__Impl ;
    public final void rule__OrderDetail1__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1637:1: ( rule__OrderDetail1__Group_5__1__Impl )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1638:2: rule__OrderDetail1__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_5__1__Impl_in_rule__OrderDetail1__Group_5__13187);
            rule__OrderDetail1__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__Group_5__1"


    // $ANTLR start "rule__OrderDetail1__Group_5__1__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1644:1: rule__OrderDetail1__Group_5__1__Impl : ( ( rule__OrderDetail1__CustomerContactAssignment_5_1 ) ) ;
    public final void rule__OrderDetail1__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1648:1: ( ( ( rule__OrderDetail1__CustomerContactAssignment_5_1 ) ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1649:1: ( ( rule__OrderDetail1__CustomerContactAssignment_5_1 ) )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1649:1: ( ( rule__OrderDetail1__CustomerContactAssignment_5_1 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1650:1: ( rule__OrderDetail1__CustomerContactAssignment_5_1 )
            {
             before(grammarAccess.getOrderDetail1Access().getCustomerContactAssignment_5_1()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1651:1: ( rule__OrderDetail1__CustomerContactAssignment_5_1 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1651:2: rule__OrderDetail1__CustomerContactAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__CustomerContactAssignment_5_1_in_rule__OrderDetail1__Group_5__1__Impl3214);
            rule__OrderDetail1__CustomerContactAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderDetail1Access().getCustomerContactAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__Group_5__1__Impl"


    // $ANTLR start "rule__OrderDetail1__Group_6__0"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1665:1: rule__OrderDetail1__Group_6__0 : rule__OrderDetail1__Group_6__0__Impl rule__OrderDetail1__Group_6__1 ;
    public final void rule__OrderDetail1__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1669:1: ( rule__OrderDetail1__Group_6__0__Impl rule__OrderDetail1__Group_6__1 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1670:2: rule__OrderDetail1__Group_6__0__Impl rule__OrderDetail1__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_6__0__Impl_in_rule__OrderDetail1__Group_6__03248);
            rule__OrderDetail1__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_6__1_in_rule__OrderDetail1__Group_6__03251);
            rule__OrderDetail1__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__Group_6__0"


    // $ANTLR start "rule__OrderDetail1__Group_6__0__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1677:1: rule__OrderDetail1__Group_6__0__Impl : ( 'customerName' ) ;
    public final void rule__OrderDetail1__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1681:1: ( ( 'customerName' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1682:1: ( 'customerName' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1682:1: ( 'customerName' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1683:1: 'customerName'
            {
             before(grammarAccess.getOrderDetail1Access().getCustomerNameKeyword_6_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__OrderDetail1__Group_6__0__Impl3279); 
             after(grammarAccess.getOrderDetail1Access().getCustomerNameKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__Group_6__0__Impl"


    // $ANTLR start "rule__OrderDetail1__Group_6__1"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1696:1: rule__OrderDetail1__Group_6__1 : rule__OrderDetail1__Group_6__1__Impl ;
    public final void rule__OrderDetail1__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1700:1: ( rule__OrderDetail1__Group_6__1__Impl )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1701:2: rule__OrderDetail1__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_6__1__Impl_in_rule__OrderDetail1__Group_6__13310);
            rule__OrderDetail1__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__Group_6__1"


    // $ANTLR start "rule__OrderDetail1__Group_6__1__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1707:1: rule__OrderDetail1__Group_6__1__Impl : ( ( rule__OrderDetail1__CustomerNameAssignment_6_1 ) ) ;
    public final void rule__OrderDetail1__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1711:1: ( ( ( rule__OrderDetail1__CustomerNameAssignment_6_1 ) ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1712:1: ( ( rule__OrderDetail1__CustomerNameAssignment_6_1 ) )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1712:1: ( ( rule__OrderDetail1__CustomerNameAssignment_6_1 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1713:1: ( rule__OrderDetail1__CustomerNameAssignment_6_1 )
            {
             before(grammarAccess.getOrderDetail1Access().getCustomerNameAssignment_6_1()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1714:1: ( rule__OrderDetail1__CustomerNameAssignment_6_1 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1714:2: rule__OrderDetail1__CustomerNameAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__CustomerNameAssignment_6_1_in_rule__OrderDetail1__Group_6__1__Impl3337);
            rule__OrderDetail1__CustomerNameAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderDetail1Access().getCustomerNameAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__Group_6__1__Impl"


    // $ANTLR start "rule__OrderDetail2__Group__0"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1728:1: rule__OrderDetail2__Group__0 : rule__OrderDetail2__Group__0__Impl rule__OrderDetail2__Group__1 ;
    public final void rule__OrderDetail2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1732:1: ( rule__OrderDetail2__Group__0__Impl rule__OrderDetail2__Group__1 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1733:2: rule__OrderDetail2__Group__0__Impl rule__OrderDetail2__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__0__Impl_in_rule__OrderDetail2__Group__03371);
            rule__OrderDetail2__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__1_in_rule__OrderDetail2__Group__03374);
            rule__OrderDetail2__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail2__Group__0"


    // $ANTLR start "rule__OrderDetail2__Group__0__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1740:1: rule__OrderDetail2__Group__0__Impl : ( () ) ;
    public final void rule__OrderDetail2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1744:1: ( ( () ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1745:1: ( () )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1745:1: ( () )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1746:1: ()
            {
             before(grammarAccess.getOrderDetail2Access().getOrderDetail2Action_0()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1747:1: ()
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1749:1: 
            {
            }

             after(grammarAccess.getOrderDetail2Access().getOrderDetail2Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail2__Group__0__Impl"


    // $ANTLR start "rule__OrderDetail2__Group__1"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1759:1: rule__OrderDetail2__Group__1 : rule__OrderDetail2__Group__1__Impl rule__OrderDetail2__Group__2 ;
    public final void rule__OrderDetail2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1763:1: ( rule__OrderDetail2__Group__1__Impl rule__OrderDetail2__Group__2 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1764:2: rule__OrderDetail2__Group__1__Impl rule__OrderDetail2__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__1__Impl_in_rule__OrderDetail2__Group__13432);
            rule__OrderDetail2__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__2_in_rule__OrderDetail2__Group__13435);
            rule__OrderDetail2__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail2__Group__1"


    // $ANTLR start "rule__OrderDetail2__Group__1__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1771:1: rule__OrderDetail2__Group__1__Impl : ( 'OrderDetail2' ) ;
    public final void rule__OrderDetail2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1775:1: ( ( 'OrderDetail2' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1776:1: ( 'OrderDetail2' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1776:1: ( 'OrderDetail2' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1777:1: 'OrderDetail2'
            {
             before(grammarAccess.getOrderDetail2Access().getOrderDetail2Keyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__OrderDetail2__Group__1__Impl3463); 
             after(grammarAccess.getOrderDetail2Access().getOrderDetail2Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail2__Group__1__Impl"


    // $ANTLR start "rule__OrderDetail2__Group__2"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1790:1: rule__OrderDetail2__Group__2 : rule__OrderDetail2__Group__2__Impl rule__OrderDetail2__Group__3 ;
    public final void rule__OrderDetail2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1794:1: ( rule__OrderDetail2__Group__2__Impl rule__OrderDetail2__Group__3 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1795:2: rule__OrderDetail2__Group__2__Impl rule__OrderDetail2__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__2__Impl_in_rule__OrderDetail2__Group__23494);
            rule__OrderDetail2__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__3_in_rule__OrderDetail2__Group__23497);
            rule__OrderDetail2__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail2__Group__2"


    // $ANTLR start "rule__OrderDetail2__Group__2__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1802:1: rule__OrderDetail2__Group__2__Impl : ( ( rule__OrderDetail2__OrderIDAssignment_2 ) ) ;
    public final void rule__OrderDetail2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1806:1: ( ( ( rule__OrderDetail2__OrderIDAssignment_2 ) ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1807:1: ( ( rule__OrderDetail2__OrderIDAssignment_2 ) )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1807:1: ( ( rule__OrderDetail2__OrderIDAssignment_2 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1808:1: ( rule__OrderDetail2__OrderIDAssignment_2 )
            {
             before(grammarAccess.getOrderDetail2Access().getOrderIDAssignment_2()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1809:1: ( rule__OrderDetail2__OrderIDAssignment_2 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1809:2: rule__OrderDetail2__OrderIDAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__OrderIDAssignment_2_in_rule__OrderDetail2__Group__2__Impl3524);
            rule__OrderDetail2__OrderIDAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOrderDetail2Access().getOrderIDAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail2__Group__2__Impl"


    // $ANTLR start "rule__OrderDetail2__Group__3"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1819:1: rule__OrderDetail2__Group__3 : rule__OrderDetail2__Group__3__Impl rule__OrderDetail2__Group__4 ;
    public final void rule__OrderDetail2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1823:1: ( rule__OrderDetail2__Group__3__Impl rule__OrderDetail2__Group__4 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1824:2: rule__OrderDetail2__Group__3__Impl rule__OrderDetail2__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__3__Impl_in_rule__OrderDetail2__Group__33554);
            rule__OrderDetail2__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__4_in_rule__OrderDetail2__Group__33557);
            rule__OrderDetail2__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail2__Group__3"


    // $ANTLR start "rule__OrderDetail2__Group__3__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1831:1: rule__OrderDetail2__Group__3__Impl : ( '{' ) ;
    public final void rule__OrderDetail2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1835:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1836:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1836:1: ( '{' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1837:1: '{'
            {
             before(grammarAccess.getOrderDetail2Access().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__OrderDetail2__Group__3__Impl3585); 
             after(grammarAccess.getOrderDetail2Access().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail2__Group__3__Impl"


    // $ANTLR start "rule__OrderDetail2__Group__4"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1850:1: rule__OrderDetail2__Group__4 : rule__OrderDetail2__Group__4__Impl rule__OrderDetail2__Group__5 ;
    public final void rule__OrderDetail2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1854:1: ( rule__OrderDetail2__Group__4__Impl rule__OrderDetail2__Group__5 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1855:2: rule__OrderDetail2__Group__4__Impl rule__OrderDetail2__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__4__Impl_in_rule__OrderDetail2__Group__43616);
            rule__OrderDetail2__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__5_in_rule__OrderDetail2__Group__43619);
            rule__OrderDetail2__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail2__Group__4"


    // $ANTLR start "rule__OrderDetail2__Group__4__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1862:1: rule__OrderDetail2__Group__4__Impl : ( ( rule__OrderDetail2__Group_4__0 )? ) ;
    public final void rule__OrderDetail2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1866:1: ( ( ( rule__OrderDetail2__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1867:1: ( ( rule__OrderDetail2__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1867:1: ( ( rule__OrderDetail2__Group_4__0 )? )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1868:1: ( rule__OrderDetail2__Group_4__0 )?
            {
             before(grammarAccess.getOrderDetail2Access().getGroup_4()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1869:1: ( rule__OrderDetail2__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1869:2: rule__OrderDetail2__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group_4__0_in_rule__OrderDetail2__Group__4__Impl3646);
                    rule__OrderDetail2__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrderDetail2Access().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail2__Group__4__Impl"


    // $ANTLR start "rule__OrderDetail2__Group__5"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1879:1: rule__OrderDetail2__Group__5 : rule__OrderDetail2__Group__5__Impl ;
    public final void rule__OrderDetail2__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1883:1: ( rule__OrderDetail2__Group__5__Impl )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1884:2: rule__OrderDetail2__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__5__Impl_in_rule__OrderDetail2__Group__53677);
            rule__OrderDetail2__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail2__Group__5"


    // $ANTLR start "rule__OrderDetail2__Group__5__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1890:1: rule__OrderDetail2__Group__5__Impl : ( '}' ) ;
    public final void rule__OrderDetail2__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1894:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1895:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1895:1: ( '}' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1896:1: '}'
            {
             before(grammarAccess.getOrderDetail2Access().getRightCurlyBracketKeyword_5()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__OrderDetail2__Group__5__Impl3705); 
             after(grammarAccess.getOrderDetail2Access().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail2__Group__5__Impl"


    // $ANTLR start "rule__OrderDetail2__Group_4__0"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1921:1: rule__OrderDetail2__Group_4__0 : rule__OrderDetail2__Group_4__0__Impl rule__OrderDetail2__Group_4__1 ;
    public final void rule__OrderDetail2__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1925:1: ( rule__OrderDetail2__Group_4__0__Impl rule__OrderDetail2__Group_4__1 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1926:2: rule__OrderDetail2__Group_4__0__Impl rule__OrderDetail2__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group_4__0__Impl_in_rule__OrderDetail2__Group_4__03748);
            rule__OrderDetail2__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group_4__1_in_rule__OrderDetail2__Group_4__03751);
            rule__OrderDetail2__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail2__Group_4__0"


    // $ANTLR start "rule__OrderDetail2__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1933:1: rule__OrderDetail2__Group_4__0__Impl : ( 'customerName' ) ;
    public final void rule__OrderDetail2__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1937:1: ( ( 'customerName' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1938:1: ( 'customerName' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1938:1: ( 'customerName' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1939:1: 'customerName'
            {
             before(grammarAccess.getOrderDetail2Access().getCustomerNameKeyword_4_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__OrderDetail2__Group_4__0__Impl3779); 
             after(grammarAccess.getOrderDetail2Access().getCustomerNameKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail2__Group_4__0__Impl"


    // $ANTLR start "rule__OrderDetail2__Group_4__1"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1952:1: rule__OrderDetail2__Group_4__1 : rule__OrderDetail2__Group_4__1__Impl ;
    public final void rule__OrderDetail2__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1956:1: ( rule__OrderDetail2__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1957:2: rule__OrderDetail2__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group_4__1__Impl_in_rule__OrderDetail2__Group_4__13810);
            rule__OrderDetail2__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail2__Group_4__1"


    // $ANTLR start "rule__OrderDetail2__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1963:1: rule__OrderDetail2__Group_4__1__Impl : ( ( rule__OrderDetail2__CustomerNameAssignment_4_1 ) ) ;
    public final void rule__OrderDetail2__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1967:1: ( ( ( rule__OrderDetail2__CustomerNameAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1968:1: ( ( rule__OrderDetail2__CustomerNameAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1968:1: ( ( rule__OrderDetail2__CustomerNameAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1969:1: ( rule__OrderDetail2__CustomerNameAssignment_4_1 )
            {
             before(grammarAccess.getOrderDetail2Access().getCustomerNameAssignment_4_1()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1970:1: ( rule__OrderDetail2__CustomerNameAssignment_4_1 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1970:2: rule__OrderDetail2__CustomerNameAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__CustomerNameAssignment_4_1_in_rule__OrderDetail2__Group_4__1__Impl3837);
            rule__OrderDetail2__CustomerNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderDetail2Access().getCustomerNameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail2__Group_4__1__Impl"


    // $ANTLR start "rule__OrderRef1__Group__0"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1984:1: rule__OrderRef1__Group__0 : rule__OrderRef1__Group__0__Impl rule__OrderRef1__Group__1 ;
    public final void rule__OrderRef1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1988:1: ( rule__OrderRef1__Group__0__Impl rule__OrderRef1__Group__1 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1989:2: rule__OrderRef1__Group__0__Impl rule__OrderRef1__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group__0__Impl_in_rule__OrderRef1__Group__03871);
            rule__OrderRef1__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group__1_in_rule__OrderRef1__Group__03874);
            rule__OrderRef1__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef1__Group__0"


    // $ANTLR start "rule__OrderRef1__Group__0__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:1996:1: rule__OrderRef1__Group__0__Impl : ( () ) ;
    public final void rule__OrderRef1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2000:1: ( ( () ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2001:1: ( () )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2001:1: ( () )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2002:1: ()
            {
             before(grammarAccess.getOrderRef1Access().getOrderRef1Action_0()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2003:1: ()
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2005:1: 
            {
            }

             after(grammarAccess.getOrderRef1Access().getOrderRef1Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef1__Group__0__Impl"


    // $ANTLR start "rule__OrderRef1__Group__1"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2015:1: rule__OrderRef1__Group__1 : rule__OrderRef1__Group__1__Impl rule__OrderRef1__Group__2 ;
    public final void rule__OrderRef1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2019:1: ( rule__OrderRef1__Group__1__Impl rule__OrderRef1__Group__2 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2020:2: rule__OrderRef1__Group__1__Impl rule__OrderRef1__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group__1__Impl_in_rule__OrderRef1__Group__13932);
            rule__OrderRef1__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group__2_in_rule__OrderRef1__Group__13935);
            rule__OrderRef1__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef1__Group__1"


    // $ANTLR start "rule__OrderRef1__Group__1__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2027:1: rule__OrderRef1__Group__1__Impl : ( 'OrderRef1' ) ;
    public final void rule__OrderRef1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2031:1: ( ( 'OrderRef1' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2032:1: ( 'OrderRef1' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2032:1: ( 'OrderRef1' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2033:1: 'OrderRef1'
            {
             before(grammarAccess.getOrderRef1Access().getOrderRef1Keyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__OrderRef1__Group__1__Impl3963); 
             after(grammarAccess.getOrderRef1Access().getOrderRef1Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef1__Group__1__Impl"


    // $ANTLR start "rule__OrderRef1__Group__2"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2046:1: rule__OrderRef1__Group__2 : rule__OrderRef1__Group__2__Impl rule__OrderRef1__Group__3 ;
    public final void rule__OrderRef1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2050:1: ( rule__OrderRef1__Group__2__Impl rule__OrderRef1__Group__3 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2051:2: rule__OrderRef1__Group__2__Impl rule__OrderRef1__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group__2__Impl_in_rule__OrderRef1__Group__23994);
            rule__OrderRef1__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group__3_in_rule__OrderRef1__Group__23997);
            rule__OrderRef1__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef1__Group__2"


    // $ANTLR start "rule__OrderRef1__Group__2__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2058:1: rule__OrderRef1__Group__2__Impl : ( '{' ) ;
    public final void rule__OrderRef1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2062:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2063:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2063:1: ( '{' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2064:1: '{'
            {
             before(grammarAccess.getOrderRef1Access().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__OrderRef1__Group__2__Impl4025); 
             after(grammarAccess.getOrderRef1Access().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef1__Group__2__Impl"


    // $ANTLR start "rule__OrderRef1__Group__3"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2077:1: rule__OrderRef1__Group__3 : rule__OrderRef1__Group__3__Impl rule__OrderRef1__Group__4 ;
    public final void rule__OrderRef1__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2081:1: ( rule__OrderRef1__Group__3__Impl rule__OrderRef1__Group__4 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2082:2: rule__OrderRef1__Group__3__Impl rule__OrderRef1__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group__3__Impl_in_rule__OrderRef1__Group__34056);
            rule__OrderRef1__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group__4_in_rule__OrderRef1__Group__34059);
            rule__OrderRef1__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef1__Group__3"


    // $ANTLR start "rule__OrderRef1__Group__3__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2089:1: rule__OrderRef1__Group__3__Impl : ( ( rule__OrderRef1__Group_3__0 )? ) ;
    public final void rule__OrderRef1__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2093:1: ( ( ( rule__OrderRef1__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2094:1: ( ( rule__OrderRef1__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2094:1: ( ( rule__OrderRef1__Group_3__0 )? )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2095:1: ( rule__OrderRef1__Group_3__0 )?
            {
             before(grammarAccess.getOrderRef1Access().getGroup_3()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2096:1: ( rule__OrderRef1__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2096:2: rule__OrderRef1__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group_3__0_in_rule__OrderRef1__Group__3__Impl4086);
                    rule__OrderRef1__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrderRef1Access().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef1__Group__3__Impl"


    // $ANTLR start "rule__OrderRef1__Group__4"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2106:1: rule__OrderRef1__Group__4 : rule__OrderRef1__Group__4__Impl ;
    public final void rule__OrderRef1__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2110:1: ( rule__OrderRef1__Group__4__Impl )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2111:2: rule__OrderRef1__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group__4__Impl_in_rule__OrderRef1__Group__44117);
            rule__OrderRef1__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef1__Group__4"


    // $ANTLR start "rule__OrderRef1__Group__4__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2117:1: rule__OrderRef1__Group__4__Impl : ( '}' ) ;
    public final void rule__OrderRef1__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2121:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2122:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2122:1: ( '}' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2123:1: '}'
            {
             before(grammarAccess.getOrderRef1Access().getRightCurlyBracketKeyword_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__OrderRef1__Group__4__Impl4145); 
             after(grammarAccess.getOrderRef1Access().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef1__Group__4__Impl"


    // $ANTLR start "rule__OrderRef1__Group_3__0"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2146:1: rule__OrderRef1__Group_3__0 : rule__OrderRef1__Group_3__0__Impl rule__OrderRef1__Group_3__1 ;
    public final void rule__OrderRef1__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2150:1: ( rule__OrderRef1__Group_3__0__Impl rule__OrderRef1__Group_3__1 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2151:2: rule__OrderRef1__Group_3__0__Impl rule__OrderRef1__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group_3__0__Impl_in_rule__OrderRef1__Group_3__04186);
            rule__OrderRef1__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group_3__1_in_rule__OrderRef1__Group_3__04189);
            rule__OrderRef1__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef1__Group_3__0"


    // $ANTLR start "rule__OrderRef1__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2158:1: rule__OrderRef1__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__OrderRef1__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2162:1: ( ( 'name' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2163:1: ( 'name' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2163:1: ( 'name' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2164:1: 'name'
            {
             before(grammarAccess.getOrderRef1Access().getNameKeyword_3_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__OrderRef1__Group_3__0__Impl4217); 
             after(grammarAccess.getOrderRef1Access().getNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef1__Group_3__0__Impl"


    // $ANTLR start "rule__OrderRef1__Group_3__1"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2177:1: rule__OrderRef1__Group_3__1 : rule__OrderRef1__Group_3__1__Impl ;
    public final void rule__OrderRef1__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2181:1: ( rule__OrderRef1__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2182:2: rule__OrderRef1__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group_3__1__Impl_in_rule__OrderRef1__Group_3__14248);
            rule__OrderRef1__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef1__Group_3__1"


    // $ANTLR start "rule__OrderRef1__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2188:1: rule__OrderRef1__Group_3__1__Impl : ( ( rule__OrderRef1__NameAssignment_3_1 ) ) ;
    public final void rule__OrderRef1__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2192:1: ( ( ( rule__OrderRef1__NameAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2193:1: ( ( rule__OrderRef1__NameAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2193:1: ( ( rule__OrderRef1__NameAssignment_3_1 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2194:1: ( rule__OrderRef1__NameAssignment_3_1 )
            {
             before(grammarAccess.getOrderRef1Access().getNameAssignment_3_1()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2195:1: ( rule__OrderRef1__NameAssignment_3_1 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2195:2: rule__OrderRef1__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__NameAssignment_3_1_in_rule__OrderRef1__Group_3__1__Impl4275);
            rule__OrderRef1__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderRef1Access().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef1__Group_3__1__Impl"


    // $ANTLR start "rule__OrderRef2__Group__0"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2209:1: rule__OrderRef2__Group__0 : rule__OrderRef2__Group__0__Impl rule__OrderRef2__Group__1 ;
    public final void rule__OrderRef2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2213:1: ( rule__OrderRef2__Group__0__Impl rule__OrderRef2__Group__1 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2214:2: rule__OrderRef2__Group__0__Impl rule__OrderRef2__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group__0__Impl_in_rule__OrderRef2__Group__04309);
            rule__OrderRef2__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group__1_in_rule__OrderRef2__Group__04312);
            rule__OrderRef2__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef2__Group__0"


    // $ANTLR start "rule__OrderRef2__Group__0__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2221:1: rule__OrderRef2__Group__0__Impl : ( () ) ;
    public final void rule__OrderRef2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2225:1: ( ( () ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2226:1: ( () )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2226:1: ( () )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2227:1: ()
            {
             before(grammarAccess.getOrderRef2Access().getOrderRef2Action_0()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2228:1: ()
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2230:1: 
            {
            }

             after(grammarAccess.getOrderRef2Access().getOrderRef2Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef2__Group__0__Impl"


    // $ANTLR start "rule__OrderRef2__Group__1"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2240:1: rule__OrderRef2__Group__1 : rule__OrderRef2__Group__1__Impl rule__OrderRef2__Group__2 ;
    public final void rule__OrderRef2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2244:1: ( rule__OrderRef2__Group__1__Impl rule__OrderRef2__Group__2 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2245:2: rule__OrderRef2__Group__1__Impl rule__OrderRef2__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group__1__Impl_in_rule__OrderRef2__Group__14370);
            rule__OrderRef2__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group__2_in_rule__OrderRef2__Group__14373);
            rule__OrderRef2__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef2__Group__1"


    // $ANTLR start "rule__OrderRef2__Group__1__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2252:1: rule__OrderRef2__Group__1__Impl : ( 'OrderRef2' ) ;
    public final void rule__OrderRef2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2256:1: ( ( 'OrderRef2' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2257:1: ( 'OrderRef2' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2257:1: ( 'OrderRef2' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2258:1: 'OrderRef2'
            {
             before(grammarAccess.getOrderRef2Access().getOrderRef2Keyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__OrderRef2__Group__1__Impl4401); 
             after(grammarAccess.getOrderRef2Access().getOrderRef2Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef2__Group__1__Impl"


    // $ANTLR start "rule__OrderRef2__Group__2"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2271:1: rule__OrderRef2__Group__2 : rule__OrderRef2__Group__2__Impl rule__OrderRef2__Group__3 ;
    public final void rule__OrderRef2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2275:1: ( rule__OrderRef2__Group__2__Impl rule__OrderRef2__Group__3 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2276:2: rule__OrderRef2__Group__2__Impl rule__OrderRef2__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group__2__Impl_in_rule__OrderRef2__Group__24432);
            rule__OrderRef2__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group__3_in_rule__OrderRef2__Group__24435);
            rule__OrderRef2__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef2__Group__2"


    // $ANTLR start "rule__OrderRef2__Group__2__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2283:1: rule__OrderRef2__Group__2__Impl : ( '{' ) ;
    public final void rule__OrderRef2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2287:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2288:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2288:1: ( '{' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2289:1: '{'
            {
             before(grammarAccess.getOrderRef2Access().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__OrderRef2__Group__2__Impl4463); 
             after(grammarAccess.getOrderRef2Access().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef2__Group__2__Impl"


    // $ANTLR start "rule__OrderRef2__Group__3"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2302:1: rule__OrderRef2__Group__3 : rule__OrderRef2__Group__3__Impl rule__OrderRef2__Group__4 ;
    public final void rule__OrderRef2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2306:1: ( rule__OrderRef2__Group__3__Impl rule__OrderRef2__Group__4 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2307:2: rule__OrderRef2__Group__3__Impl rule__OrderRef2__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group__3__Impl_in_rule__OrderRef2__Group__34494);
            rule__OrderRef2__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group__4_in_rule__OrderRef2__Group__34497);
            rule__OrderRef2__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef2__Group__3"


    // $ANTLR start "rule__OrderRef2__Group__3__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2314:1: rule__OrderRef2__Group__3__Impl : ( ( rule__OrderRef2__Group_3__0 )? ) ;
    public final void rule__OrderRef2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2318:1: ( ( ( rule__OrderRef2__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2319:1: ( ( rule__OrderRef2__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2319:1: ( ( rule__OrderRef2__Group_3__0 )? )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2320:1: ( rule__OrderRef2__Group_3__0 )?
            {
             before(grammarAccess.getOrderRef2Access().getGroup_3()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2321:1: ( rule__OrderRef2__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2321:2: rule__OrderRef2__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group_3__0_in_rule__OrderRef2__Group__3__Impl4524);
                    rule__OrderRef2__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrderRef2Access().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef2__Group__3__Impl"


    // $ANTLR start "rule__OrderRef2__Group__4"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2331:1: rule__OrderRef2__Group__4 : rule__OrderRef2__Group__4__Impl ;
    public final void rule__OrderRef2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2335:1: ( rule__OrderRef2__Group__4__Impl )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2336:2: rule__OrderRef2__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group__4__Impl_in_rule__OrderRef2__Group__44555);
            rule__OrderRef2__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef2__Group__4"


    // $ANTLR start "rule__OrderRef2__Group__4__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2342:1: rule__OrderRef2__Group__4__Impl : ( '}' ) ;
    public final void rule__OrderRef2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2346:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2347:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2347:1: ( '}' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2348:1: '}'
            {
             before(grammarAccess.getOrderRef2Access().getRightCurlyBracketKeyword_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__OrderRef2__Group__4__Impl4583); 
             after(grammarAccess.getOrderRef2Access().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef2__Group__4__Impl"


    // $ANTLR start "rule__OrderRef2__Group_3__0"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2371:1: rule__OrderRef2__Group_3__0 : rule__OrderRef2__Group_3__0__Impl rule__OrderRef2__Group_3__1 ;
    public final void rule__OrderRef2__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2375:1: ( rule__OrderRef2__Group_3__0__Impl rule__OrderRef2__Group_3__1 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2376:2: rule__OrderRef2__Group_3__0__Impl rule__OrderRef2__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group_3__0__Impl_in_rule__OrderRef2__Group_3__04624);
            rule__OrderRef2__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group_3__1_in_rule__OrderRef2__Group_3__04627);
            rule__OrderRef2__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef2__Group_3__0"


    // $ANTLR start "rule__OrderRef2__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2383:1: rule__OrderRef2__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__OrderRef2__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2387:1: ( ( 'name' ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2388:1: ( 'name' )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2388:1: ( 'name' )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2389:1: 'name'
            {
             before(grammarAccess.getOrderRef2Access().getNameKeyword_3_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__OrderRef2__Group_3__0__Impl4655); 
             after(grammarAccess.getOrderRef2Access().getNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef2__Group_3__0__Impl"


    // $ANTLR start "rule__OrderRef2__Group_3__1"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2402:1: rule__OrderRef2__Group_3__1 : rule__OrderRef2__Group_3__1__Impl ;
    public final void rule__OrderRef2__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2406:1: ( rule__OrderRef2__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2407:2: rule__OrderRef2__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group_3__1__Impl_in_rule__OrderRef2__Group_3__14686);
            rule__OrderRef2__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef2__Group_3__1"


    // $ANTLR start "rule__OrderRef2__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2413:1: rule__OrderRef2__Group_3__1__Impl : ( ( rule__OrderRef2__NameAssignment_3_1 ) ) ;
    public final void rule__OrderRef2__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2417:1: ( ( ( rule__OrderRef2__NameAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2418:1: ( ( rule__OrderRef2__NameAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2418:1: ( ( rule__OrderRef2__NameAssignment_3_1 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2419:1: ( rule__OrderRef2__NameAssignment_3_1 )
            {
             before(grammarAccess.getOrderRef2Access().getNameAssignment_3_1()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2420:1: ( rule__OrderRef2__NameAssignment_3_1 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2420:2: rule__OrderRef2__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__NameAssignment_3_1_in_rule__OrderRef2__Group_3__1__Impl4713);
            rule__OrderRef2__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderRef2Access().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef2__Group_3__1__Impl"


    // $ANTLR start "rule__OrdersType__Order1Assignment_4"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2436:1: rule__OrdersType__Order1Assignment_4 : ( ruleOrderDetail1 ) ;
    public final void rule__OrdersType__Order1Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2440:1: ( ( ruleOrderDetail1 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2441:1: ( ruleOrderDetail1 )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2441:1: ( ruleOrderDetail1 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2442:1: ruleOrderDetail1
            {
             before(grammarAccess.getOrdersTypeAccess().getOrder1OrderDetail1ParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderDetail1_in_rule__OrdersType__Order1Assignment_44753);
            ruleOrderDetail1();

            state._fsp--;

             after(grammarAccess.getOrdersTypeAccess().getOrder1OrderDetail1ParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Order1Assignment_4"


    // $ANTLR start "rule__OrdersType__Order1Assignment_5_1"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2451:1: rule__OrdersType__Order1Assignment_5_1 : ( ruleOrderDetail1 ) ;
    public final void rule__OrdersType__Order1Assignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2455:1: ( ( ruleOrderDetail1 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2456:1: ( ruleOrderDetail1 )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2456:1: ( ruleOrderDetail1 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2457:1: ruleOrderDetail1
            {
             before(grammarAccess.getOrdersTypeAccess().getOrder1OrderDetail1ParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderDetail1_in_rule__OrdersType__Order1Assignment_5_14784);
            ruleOrderDetail1();

            state._fsp--;

             after(grammarAccess.getOrdersTypeAccess().getOrder1OrderDetail1ParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Order1Assignment_5_1"


    // $ANTLR start "rule__OrdersType__Order2Assignment_9"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2466:1: rule__OrdersType__Order2Assignment_9 : ( ruleOrderDetail2 ) ;
    public final void rule__OrdersType__Order2Assignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2470:1: ( ( ruleOrderDetail2 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2471:1: ( ruleOrderDetail2 )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2471:1: ( ruleOrderDetail2 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2472:1: ruleOrderDetail2
            {
             before(grammarAccess.getOrdersTypeAccess().getOrder2OrderDetail2ParserRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderDetail2_in_rule__OrdersType__Order2Assignment_94815);
            ruleOrderDetail2();

            state._fsp--;

             after(grammarAccess.getOrdersTypeAccess().getOrder2OrderDetail2ParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Order2Assignment_9"


    // $ANTLR start "rule__OrdersType__Order2Assignment_10_1"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2481:1: rule__OrdersType__Order2Assignment_10_1 : ( ruleOrderDetail2 ) ;
    public final void rule__OrdersType__Order2Assignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:1: ( ( ruleOrderDetail2 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2486:1: ( ruleOrderDetail2 )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2486:1: ( ruleOrderDetail2 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2487:1: ruleOrderDetail2
            {
             before(grammarAccess.getOrdersTypeAccess().getOrder2OrderDetail2ParserRuleCall_10_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderDetail2_in_rule__OrdersType__Order2Assignment_10_14846);
            ruleOrderDetail2();

            state._fsp--;

             after(grammarAccess.getOrdersTypeAccess().getOrder2OrderDetail2ParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__Order2Assignment_10_1"


    // $ANTLR start "rule__OrdersType__OrderReference1Assignment_14"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2496:1: rule__OrdersType__OrderReference1Assignment_14 : ( ruleOrderRef1 ) ;
    public final void rule__OrdersType__OrderReference1Assignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2500:1: ( ( ruleOrderRef1 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2501:1: ( ruleOrderRef1 )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2501:1: ( ruleOrderRef1 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2502:1: ruleOrderRef1
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderReference1OrderRef1ParserRuleCall_14_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderRef1_in_rule__OrdersType__OrderReference1Assignment_144877);
            ruleOrderRef1();

            state._fsp--;

             after(grammarAccess.getOrdersTypeAccess().getOrderReference1OrderRef1ParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__OrderReference1Assignment_14"


    // $ANTLR start "rule__OrdersType__OrderReference1Assignment_15_1"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2511:1: rule__OrdersType__OrderReference1Assignment_15_1 : ( ruleOrderRef1 ) ;
    public final void rule__OrdersType__OrderReference1Assignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2515:1: ( ( ruleOrderRef1 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2516:1: ( ruleOrderRef1 )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2516:1: ( ruleOrderRef1 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2517:1: ruleOrderRef1
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderReference1OrderRef1ParserRuleCall_15_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderRef1_in_rule__OrdersType__OrderReference1Assignment_15_14908);
            ruleOrderRef1();

            state._fsp--;

             after(grammarAccess.getOrdersTypeAccess().getOrderReference1OrderRef1ParserRuleCall_15_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__OrderReference1Assignment_15_1"


    // $ANTLR start "rule__OrdersType__OrderReference2Assignment_19"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2526:1: rule__OrdersType__OrderReference2Assignment_19 : ( ruleOrderRef2 ) ;
    public final void rule__OrdersType__OrderReference2Assignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2530:1: ( ( ruleOrderRef2 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2531:1: ( ruleOrderRef2 )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2531:1: ( ruleOrderRef2 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2532:1: ruleOrderRef2
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderReference2OrderRef2ParserRuleCall_19_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderRef2_in_rule__OrdersType__OrderReference2Assignment_194939);
            ruleOrderRef2();

            state._fsp--;

             after(grammarAccess.getOrdersTypeAccess().getOrderReference2OrderRef2ParserRuleCall_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__OrderReference2Assignment_19"


    // $ANTLR start "rule__OrdersType__OrderReference2Assignment_20_1"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2541:1: rule__OrdersType__OrderReference2Assignment_20_1 : ( ruleOrderRef2 ) ;
    public final void rule__OrdersType__OrderReference2Assignment_20_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2545:1: ( ( ruleOrderRef2 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2546:1: ( ruleOrderRef2 )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2546:1: ( ruleOrderRef2 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2547:1: ruleOrderRef2
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderReference2OrderRef2ParserRuleCall_20_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderRef2_in_rule__OrdersType__OrderReference2Assignment_20_14970);
            ruleOrderRef2();

            state._fsp--;

             after(grammarAccess.getOrdersTypeAccess().getOrderReference2OrderRef2ParserRuleCall_20_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrdersType__OrderReference2Assignment_20_1"


    // $ANTLR start "rule__OrderDetail1__OrderIDAssignment_2"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2556:1: rule__OrderDetail1__OrderIDAssignment_2 : ( ruleID0 ) ;
    public final void rule__OrderDetail1__OrderIDAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2560:1: ( ( ruleID0 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2561:1: ( ruleID0 )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2561:1: ( ruleID0 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2562:1: ruleID0
            {
             before(grammarAccess.getOrderDetail1Access().getOrderIDID0ParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleID0_in_rule__OrderDetail1__OrderIDAssignment_25001);
            ruleID0();

            state._fsp--;

             after(grammarAccess.getOrderDetail1Access().getOrderIDID0ParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__OrderIDAssignment_2"


    // $ANTLR start "rule__OrderDetail1__CustomerAddressAssignment_4_1"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2571:1: rule__OrderDetail1__CustomerAddressAssignment_4_1 : ( ruleString0 ) ;
    public final void rule__OrderDetail1__CustomerAddressAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2575:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2576:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2576:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2577:1: ruleString0
            {
             before(grammarAccess.getOrderDetail1Access().getCustomerAddressString0ParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__OrderDetail1__CustomerAddressAssignment_4_15032);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getOrderDetail1Access().getCustomerAddressString0ParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__CustomerAddressAssignment_4_1"


    // $ANTLR start "rule__OrderDetail1__CustomerContactAssignment_5_1"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2586:1: rule__OrderDetail1__CustomerContactAssignment_5_1 : ( ruleString0 ) ;
    public final void rule__OrderDetail1__CustomerContactAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2590:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2591:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2591:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2592:1: ruleString0
            {
             before(grammarAccess.getOrderDetail1Access().getCustomerContactString0ParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__OrderDetail1__CustomerContactAssignment_5_15063);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getOrderDetail1Access().getCustomerContactString0ParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__CustomerContactAssignment_5_1"


    // $ANTLR start "rule__OrderDetail1__CustomerNameAssignment_6_1"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2601:1: rule__OrderDetail1__CustomerNameAssignment_6_1 : ( ruleString0 ) ;
    public final void rule__OrderDetail1__CustomerNameAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2605:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2606:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2606:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2607:1: ruleString0
            {
             before(grammarAccess.getOrderDetail1Access().getCustomerNameString0ParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__OrderDetail1__CustomerNameAssignment_6_15094);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getOrderDetail1Access().getCustomerNameString0ParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__CustomerNameAssignment_6_1"


    // $ANTLR start "rule__OrderDetail2__OrderIDAssignment_2"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2616:1: rule__OrderDetail2__OrderIDAssignment_2 : ( ruleID0 ) ;
    public final void rule__OrderDetail2__OrderIDAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2620:1: ( ( ruleID0 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2621:1: ( ruleID0 )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2621:1: ( ruleID0 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2622:1: ruleID0
            {
             before(grammarAccess.getOrderDetail2Access().getOrderIDID0ParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleID0_in_rule__OrderDetail2__OrderIDAssignment_25125);
            ruleID0();

            state._fsp--;

             after(grammarAccess.getOrderDetail2Access().getOrderIDID0ParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail2__OrderIDAssignment_2"


    // $ANTLR start "rule__OrderDetail2__CustomerNameAssignment_4_1"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2631:1: rule__OrderDetail2__CustomerNameAssignment_4_1 : ( ruleString0 ) ;
    public final void rule__OrderDetail2__CustomerNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2635:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2636:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2636:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2637:1: ruleString0
            {
             before(grammarAccess.getOrderDetail2Access().getCustomerNameString0ParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__OrderDetail2__CustomerNameAssignment_4_15156);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getOrderDetail2Access().getCustomerNameString0ParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail2__CustomerNameAssignment_4_1"


    // $ANTLR start "rule__OrderRef1__NameAssignment_3_1"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2646:1: rule__OrderRef1__NameAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__OrderRef1__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2650:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2651:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2651:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2652:1: ( ruleEString )
            {
             before(grammarAccess.getOrderRef1Access().getNameEObjectCrossReference_3_1_0()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2653:1: ( ruleEString )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2654:1: ruleEString
            {
             before(grammarAccess.getOrderRef1Access().getNameEObjectEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OrderRef1__NameAssignment_3_15191);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOrderRef1Access().getNameEObjectEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getOrderRef1Access().getNameEObjectCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef1__NameAssignment_3_1"


    // $ANTLR start "rule__OrderRef2__NameAssignment_3_1"
    // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2665:1: rule__OrderRef2__NameAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__OrderRef2__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2669:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2670:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2670:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2671:1: ( ruleEString )
            {
             before(grammarAccess.getOrderRef2Access().getNameEObjectCrossReference_3_1_0()); 
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2672:1: ( ruleEString )
            // ../org.xtext.example.mydsl.references.untyped.ui/src-gen/org/xtext/example/mydsl/references/untyped/ui/contentassist/antlr/internal/InternalMyDsl.g:2673:1: ruleEString
            {
             before(grammarAccess.getOrderRef2Access().getNameEObjectEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OrderRef2__NameAssignment_3_15230);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOrderRef2Access().getNameEObjectEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getOrderRef2Access().getNameEObjectCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef2__NameAssignment_3_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleOrdersType_in_entryRuleOrdersType61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrdersType68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__0_in_ruleOrdersType94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderDetail1_in_entryRuleOrderDetail1121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrderDetail1128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__0_in_ruleOrderDetail1154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderDetail2_in_entryRuleOrderDetail2181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrderDetail2188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__0_in_ruleOrderDetail2214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderRef1_in_entryRuleOrderRef1241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrderRef1248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group__0_in_ruleOrderRef1274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderRef2_in_entryRuleOrderRef2301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrderRef2308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group__0_in_ruleOrderRef2334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString0361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString0368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleString0395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID0_in_entryRuleID0423 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleID0430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleID0456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString484 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__0__Impl_in_rule__OrdersType__Group__0550 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__1_in_rule__OrdersType__Group__0553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__OrdersType__Group__0__Impl581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__1__Impl_in_rule__OrdersType__Group__1612 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__2_in_rule__OrdersType__Group__1615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__OrdersType__Group__1__Impl643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__2__Impl_in_rule__OrdersType__Group__2674 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__3_in_rule__OrdersType__Group__2677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__OrdersType__Group__2__Impl705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__3__Impl_in_rule__OrdersType__Group__3736 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__4_in_rule__OrdersType__Group__3739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__OrdersType__Group__3__Impl767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__4__Impl_in_rule__OrdersType__Group__4798 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__5_in_rule__OrdersType__Group__4801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Order1Assignment_4_in_rule__OrdersType__Group__4__Impl828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__5__Impl_in_rule__OrdersType__Group__5858 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__6_in_rule__OrdersType__Group__5861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_5__0_in_rule__OrdersType__Group__5__Impl888 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__6__Impl_in_rule__OrdersType__Group__6919 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__7_in_rule__OrdersType__Group__6922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__OrdersType__Group__6__Impl950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__7__Impl_in_rule__OrdersType__Group__7981 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__8_in_rule__OrdersType__Group__7984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__OrdersType__Group__7__Impl1012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__8__Impl_in_rule__OrdersType__Group__81043 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__9_in_rule__OrdersType__Group__81046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__OrdersType__Group__8__Impl1074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__9__Impl_in_rule__OrdersType__Group__91105 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__10_in_rule__OrdersType__Group__91108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Order2Assignment_9_in_rule__OrdersType__Group__9__Impl1135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__10__Impl_in_rule__OrdersType__Group__101165 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__11_in_rule__OrdersType__Group__101168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_10__0_in_rule__OrdersType__Group__10__Impl1195 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__11__Impl_in_rule__OrdersType__Group__111226 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__12_in_rule__OrdersType__Group__111229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__OrdersType__Group__11__Impl1257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__12__Impl_in_rule__OrdersType__Group__121288 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__13_in_rule__OrdersType__Group__121291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__OrdersType__Group__12__Impl1319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__13__Impl_in_rule__OrdersType__Group__131350 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__14_in_rule__OrdersType__Group__131353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__OrdersType__Group__13__Impl1381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__14__Impl_in_rule__OrdersType__Group__141412 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__15_in_rule__OrdersType__Group__141415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__OrderReference1Assignment_14_in_rule__OrdersType__Group__14__Impl1442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__15__Impl_in_rule__OrdersType__Group__151472 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__16_in_rule__OrdersType__Group__151475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_15__0_in_rule__OrdersType__Group__15__Impl1502 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__16__Impl_in_rule__OrdersType__Group__161533 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__17_in_rule__OrdersType__Group__161536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__OrdersType__Group__16__Impl1564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__17__Impl_in_rule__OrdersType__Group__171595 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__18_in_rule__OrdersType__Group__171598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__OrdersType__Group__17__Impl1626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__18__Impl_in_rule__OrdersType__Group__181657 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__19_in_rule__OrdersType__Group__181660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__OrdersType__Group__18__Impl1688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__19__Impl_in_rule__OrdersType__Group__191719 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__20_in_rule__OrdersType__Group__191722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__OrderReference2Assignment_19_in_rule__OrdersType__Group__19__Impl1749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__20__Impl_in_rule__OrdersType__Group__201779 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__21_in_rule__OrdersType__Group__201782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_20__0_in_rule__OrdersType__Group__20__Impl1809 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__21__Impl_in_rule__OrdersType__Group__211840 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__22_in_rule__OrdersType__Group__211843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__OrdersType__Group__21__Impl1871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__22__Impl_in_rule__OrdersType__Group__221902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__OrdersType__Group__22__Impl1930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_5__0__Impl_in_rule__OrdersType__Group_5__02007 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_5__1_in_rule__OrdersType__Group_5__02010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__OrdersType__Group_5__0__Impl2038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_5__1__Impl_in_rule__OrdersType__Group_5__12069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Order1Assignment_5_1_in_rule__OrdersType__Group_5__1__Impl2096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_10__0__Impl_in_rule__OrdersType__Group_10__02130 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_10__1_in_rule__OrdersType__Group_10__02133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__OrdersType__Group_10__0__Impl2161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_10__1__Impl_in_rule__OrdersType__Group_10__12192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Order2Assignment_10_1_in_rule__OrdersType__Group_10__1__Impl2219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_15__0__Impl_in_rule__OrdersType__Group_15__02253 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_15__1_in_rule__OrdersType__Group_15__02256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__OrdersType__Group_15__0__Impl2284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_15__1__Impl_in_rule__OrdersType__Group_15__12315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__OrderReference1Assignment_15_1_in_rule__OrdersType__Group_15__1__Impl2342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_20__0__Impl_in_rule__OrdersType__Group_20__02376 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_20__1_in_rule__OrdersType__Group_20__02379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__OrdersType__Group_20__0__Impl2407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_20__1__Impl_in_rule__OrdersType__Group_20__12438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__OrderReference2Assignment_20_1_in_rule__OrdersType__Group_20__1__Impl2465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__0__Impl_in_rule__OrderDetail1__Group__02499 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__1_in_rule__OrderDetail1__Group__02502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__1__Impl_in_rule__OrderDetail1__Group__12560 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__2_in_rule__OrderDetail1__Group__12563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__OrderDetail1__Group__1__Impl2591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__2__Impl_in_rule__OrderDetail1__Group__22622 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__3_in_rule__OrderDetail1__Group__22625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__OrderIDAssignment_2_in_rule__OrderDetail1__Group__2__Impl2652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__3__Impl_in_rule__OrderDetail1__Group__32682 = new BitSet(new long[]{0x0000000000E08000L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__4_in_rule__OrderDetail1__Group__32685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__OrderDetail1__Group__3__Impl2713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__4__Impl_in_rule__OrderDetail1__Group__42744 = new BitSet(new long[]{0x0000000000E08000L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__5_in_rule__OrderDetail1__Group__42747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_4__0_in_rule__OrderDetail1__Group__4__Impl2774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__5__Impl_in_rule__OrderDetail1__Group__52805 = new BitSet(new long[]{0x0000000000E08000L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__6_in_rule__OrderDetail1__Group__52808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_5__0_in_rule__OrderDetail1__Group__5__Impl2835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__6__Impl_in_rule__OrderDetail1__Group__62866 = new BitSet(new long[]{0x0000000000E08000L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__7_in_rule__OrderDetail1__Group__62869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_6__0_in_rule__OrderDetail1__Group__6__Impl2896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__7__Impl_in_rule__OrderDetail1__Group__72927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__OrderDetail1__Group__7__Impl2955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_4__0__Impl_in_rule__OrderDetail1__Group_4__03002 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_4__1_in_rule__OrderDetail1__Group_4__03005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__OrderDetail1__Group_4__0__Impl3033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_4__1__Impl_in_rule__OrderDetail1__Group_4__13064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__CustomerAddressAssignment_4_1_in_rule__OrderDetail1__Group_4__1__Impl3091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_5__0__Impl_in_rule__OrderDetail1__Group_5__03125 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_5__1_in_rule__OrderDetail1__Group_5__03128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__OrderDetail1__Group_5__0__Impl3156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_5__1__Impl_in_rule__OrderDetail1__Group_5__13187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__CustomerContactAssignment_5_1_in_rule__OrderDetail1__Group_5__1__Impl3214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_6__0__Impl_in_rule__OrderDetail1__Group_6__03248 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_6__1_in_rule__OrderDetail1__Group_6__03251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__OrderDetail1__Group_6__0__Impl3279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_6__1__Impl_in_rule__OrderDetail1__Group_6__13310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__CustomerNameAssignment_6_1_in_rule__OrderDetail1__Group_6__1__Impl3337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__0__Impl_in_rule__OrderDetail2__Group__03371 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__1_in_rule__OrderDetail2__Group__03374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__1__Impl_in_rule__OrderDetail2__Group__13432 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__2_in_rule__OrderDetail2__Group__13435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__OrderDetail2__Group__1__Impl3463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__2__Impl_in_rule__OrderDetail2__Group__23494 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__3_in_rule__OrderDetail2__Group__23497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__OrderIDAssignment_2_in_rule__OrderDetail2__Group__2__Impl3524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__3__Impl_in_rule__OrderDetail2__Group__33554 = new BitSet(new long[]{0x0000000000808000L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__4_in_rule__OrderDetail2__Group__33557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__OrderDetail2__Group__3__Impl3585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__4__Impl_in_rule__OrderDetail2__Group__43616 = new BitSet(new long[]{0x0000000000808000L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__5_in_rule__OrderDetail2__Group__43619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group_4__0_in_rule__OrderDetail2__Group__4__Impl3646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__5__Impl_in_rule__OrderDetail2__Group__53677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__OrderDetail2__Group__5__Impl3705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group_4__0__Impl_in_rule__OrderDetail2__Group_4__03748 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group_4__1_in_rule__OrderDetail2__Group_4__03751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__OrderDetail2__Group_4__0__Impl3779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group_4__1__Impl_in_rule__OrderDetail2__Group_4__13810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__CustomerNameAssignment_4_1_in_rule__OrderDetail2__Group_4__1__Impl3837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group__0__Impl_in_rule__OrderRef1__Group__03871 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group__1_in_rule__OrderRef1__Group__03874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group__1__Impl_in_rule__OrderRef1__Group__13932 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group__2_in_rule__OrderRef1__Group__13935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__OrderRef1__Group__1__Impl3963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group__2__Impl_in_rule__OrderRef1__Group__23994 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group__3_in_rule__OrderRef1__Group__23997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__OrderRef1__Group__2__Impl4025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group__3__Impl_in_rule__OrderRef1__Group__34056 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group__4_in_rule__OrderRef1__Group__34059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group_3__0_in_rule__OrderRef1__Group__3__Impl4086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group__4__Impl_in_rule__OrderRef1__Group__44117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__OrderRef1__Group__4__Impl4145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group_3__0__Impl_in_rule__OrderRef1__Group_3__04186 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group_3__1_in_rule__OrderRef1__Group_3__04189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__OrderRef1__Group_3__0__Impl4217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group_3__1__Impl_in_rule__OrderRef1__Group_3__14248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef1__NameAssignment_3_1_in_rule__OrderRef1__Group_3__1__Impl4275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group__0__Impl_in_rule__OrderRef2__Group__04309 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group__1_in_rule__OrderRef2__Group__04312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group__1__Impl_in_rule__OrderRef2__Group__14370 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group__2_in_rule__OrderRef2__Group__14373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__OrderRef2__Group__1__Impl4401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group__2__Impl_in_rule__OrderRef2__Group__24432 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group__3_in_rule__OrderRef2__Group__24435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__OrderRef2__Group__2__Impl4463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group__3__Impl_in_rule__OrderRef2__Group__34494 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group__4_in_rule__OrderRef2__Group__34497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group_3__0_in_rule__OrderRef2__Group__3__Impl4524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group__4__Impl_in_rule__OrderRef2__Group__44555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__OrderRef2__Group__4__Impl4583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group_3__0__Impl_in_rule__OrderRef2__Group_3__04624 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group_3__1_in_rule__OrderRef2__Group_3__04627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__OrderRef2__Group_3__0__Impl4655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group_3__1__Impl_in_rule__OrderRef2__Group_3__14686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef2__NameAssignment_3_1_in_rule__OrderRef2__Group_3__1__Impl4713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderDetail1_in_rule__OrdersType__Order1Assignment_44753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderDetail1_in_rule__OrdersType__Order1Assignment_5_14784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderDetail2_in_rule__OrdersType__Order2Assignment_94815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderDetail2_in_rule__OrdersType__Order2Assignment_10_14846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderRef1_in_rule__OrdersType__OrderReference1Assignment_144877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderRef1_in_rule__OrdersType__OrderReference1Assignment_15_14908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderRef2_in_rule__OrdersType__OrderReference2Assignment_194939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderRef2_in_rule__OrdersType__OrderReference2Assignment_20_14970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID0_in_rule__OrderDetail1__OrderIDAssignment_25001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__OrderDetail1__CustomerAddressAssignment_4_15032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__OrderDetail1__CustomerContactAssignment_5_15063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__OrderDetail1__CustomerNameAssignment_6_15094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID0_in_rule__OrderDetail2__OrderIDAssignment_25125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__OrderDetail2__CustomerNameAssignment_4_15156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OrderRef1__NameAssignment_3_15191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OrderRef2__NameAssignment_3_15230 = new BitSet(new long[]{0x0000000000000002L});
    }


}