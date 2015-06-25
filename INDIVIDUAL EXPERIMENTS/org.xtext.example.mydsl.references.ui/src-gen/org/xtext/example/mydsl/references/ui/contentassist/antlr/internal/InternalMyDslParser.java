package org.xtext.example.mydsl.references.ui.contentassist.antlr.internal; 

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
import org.xtext.example.mydsl.references.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'OrdersType'", "'{'", "'order1'", "'}'", "'order2'", "'orderReference1'", "'orderReference2'", "','", "'OrderDetail1'", "'customerAddress'", "'customerContact'", "'customerName'", "'OrderDetail2'", "'OrderRef1'", "'orderDetail1'", "'OrderRef2'", "'orderDetail2'"
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
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleOrdersType : ruleOrdersType EOF ;
    public final void entryRuleOrdersType() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleOrdersType EOF )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleOrdersType EOF
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleOrdersType : ( ( rule__OrdersType__Group__0 ) ) ;
    public final void ruleOrdersType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__OrdersType__Group__0 ) ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__OrdersType__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__OrdersType__Group__0 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__OrdersType__Group__0 )
            {
             before(grammarAccess.getOrdersTypeAccess().getGroup()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__OrdersType__Group__0 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__OrdersType__Group__0
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleOrderDetail1 : ruleOrderDetail1 EOF ;
    public final void entryRuleOrderDetail1() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleOrderDetail1 EOF )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleOrderDetail1 EOF
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleOrderDetail1 : ( ( rule__OrderDetail1__Group__0 ) ) ;
    public final void ruleOrderDetail1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__OrderDetail1__Group__0 ) ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__OrderDetail1__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__OrderDetail1__Group__0 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__OrderDetail1__Group__0 )
            {
             before(grammarAccess.getOrderDetail1Access().getGroup()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__OrderDetail1__Group__0 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__OrderDetail1__Group__0
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleOrderDetail2 : ruleOrderDetail2 EOF ;
    public final void entryRuleOrderDetail2() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleOrderDetail2 EOF )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleOrderDetail2 EOF
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleOrderDetail2 : ( ( rule__OrderDetail2__Group__0 ) ) ;
    public final void ruleOrderDetail2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__OrderDetail2__Group__0 ) ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__OrderDetail2__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__OrderDetail2__Group__0 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__OrderDetail2__Group__0 )
            {
             before(grammarAccess.getOrderDetail2Access().getGroup()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__OrderDetail2__Group__0 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__OrderDetail2__Group__0
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleOrderRef1 : ruleOrderRef1 EOF ;
    public final void entryRuleOrderRef1() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleOrderRef1 EOF )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleOrderRef1 EOF
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleOrderRef1 : ( ( rule__OrderRef1__Group__0 ) ) ;
    public final void ruleOrderRef1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ( rule__OrderRef1__Group__0 ) ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__OrderRef1__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__OrderRef1__Group__0 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( rule__OrderRef1__Group__0 )
            {
             before(grammarAccess.getOrderRef1Access().getGroup()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__OrderRef1__Group__0 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: rule__OrderRef1__Group__0
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleOrderRef2 : ruleOrderRef2 EOF ;
    public final void entryRuleOrderRef2() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleOrderRef2 EOF )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleOrderRef2 EOF
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleOrderRef2 : ( ( rule__OrderRef2__Group__0 ) ) ;
    public final void ruleOrderRef2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( ( rule__OrderRef2__Group__0 ) ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__OrderRef2__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__OrderRef2__Group__0 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ( rule__OrderRef2__Group__0 )
            {
             before(grammarAccess.getOrderRef2Access().getGroup()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( rule__OrderRef2__Group__0 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:188:2: rule__OrderRef2__Group__0
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:200:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:201:1: ( ruleString0 EOF )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: ruleString0 EOF
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: ruleString0 : ( RULE_STRING ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:213:2: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: RULE_STRING
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


    // $ANTLR start "entryRuleID0"
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:228:1: entryRuleID0 : ruleID0 EOF ;
    public final void entryRuleID0() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:229:1: ( ruleID0 EOF )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: ruleID0 EOF
            {
             before(grammarAccess.getID0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleID0_in_entryRuleID0420);
            ruleID0();

            state._fsp--;

             after(grammarAccess.getID0Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleID0427); 

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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:237:1: ruleID0 : ( RULE_ID ) ;
    public final void ruleID0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:241:2: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:243:1: RULE_ID
            {
             before(grammarAccess.getID0Access().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleID0453); 
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


    // $ANTLR start "entryRuleIDREF"
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:256:1: entryRuleIDREF : ruleIDREF EOF ;
    public final void entryRuleIDREF() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:257:1: ( ruleIDREF EOF )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:258:1: ruleIDREF EOF
            {
             before(grammarAccess.getIDREFRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIDREF_in_entryRuleIDREF479);
            ruleIDREF();

            state._fsp--;

             after(grammarAccess.getIDREFRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIDREF486); 

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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:265:1: ruleIDREF : ( RULE_ID ) ;
    public final void ruleIDREF() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:269:2: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:271:1: RULE_ID
            {
             before(grammarAccess.getIDREFAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleIDREF512); 
             after(grammarAccess.getIDREFAccess().getIDTerminalRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "rule__OrdersType__Group__0"
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:286:1: rule__OrdersType__Group__0 : rule__OrdersType__Group__0__Impl rule__OrdersType__Group__1 ;
    public final void rule__OrdersType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:290:1: ( rule__OrdersType__Group__0__Impl rule__OrdersType__Group__1 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:291:2: rule__OrdersType__Group__0__Impl rule__OrdersType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__0__Impl_in_rule__OrdersType__Group__0545);
            rule__OrdersType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__1_in_rule__OrdersType__Group__0548);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: rule__OrdersType__Group__0__Impl : ( 'OrdersType' ) ;
    public final void rule__OrdersType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:302:1: ( ( 'OrdersType' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:303:1: ( 'OrdersType' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:303:1: ( 'OrdersType' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:304:1: 'OrdersType'
            {
             before(grammarAccess.getOrdersTypeAccess().getOrdersTypeKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__OrdersType__Group__0__Impl576); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:317:1: rule__OrdersType__Group__1 : rule__OrdersType__Group__1__Impl rule__OrdersType__Group__2 ;
    public final void rule__OrdersType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:321:1: ( rule__OrdersType__Group__1__Impl rule__OrdersType__Group__2 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:322:2: rule__OrdersType__Group__1__Impl rule__OrdersType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__1__Impl_in_rule__OrdersType__Group__1607);
            rule__OrdersType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__2_in_rule__OrdersType__Group__1610);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:329:1: rule__OrdersType__Group__1__Impl : ( '{' ) ;
    public final void rule__OrdersType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:333:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:334:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:334:1: ( '{' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:335:1: '{'
            {
             before(grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__OrdersType__Group__1__Impl638); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:348:1: rule__OrdersType__Group__2 : rule__OrdersType__Group__2__Impl rule__OrdersType__Group__3 ;
    public final void rule__OrdersType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:352:1: ( rule__OrdersType__Group__2__Impl rule__OrdersType__Group__3 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:353:2: rule__OrdersType__Group__2__Impl rule__OrdersType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__2__Impl_in_rule__OrdersType__Group__2669);
            rule__OrdersType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__3_in_rule__OrdersType__Group__2672);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:360:1: rule__OrdersType__Group__2__Impl : ( 'order1' ) ;
    public final void rule__OrdersType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:364:1: ( ( 'order1' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:365:1: ( 'order1' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:365:1: ( 'order1' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:366:1: 'order1'
            {
             before(grammarAccess.getOrdersTypeAccess().getOrder1Keyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__OrdersType__Group__2__Impl700); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:379:1: rule__OrdersType__Group__3 : rule__OrdersType__Group__3__Impl rule__OrdersType__Group__4 ;
    public final void rule__OrdersType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:383:1: ( rule__OrdersType__Group__3__Impl rule__OrdersType__Group__4 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:384:2: rule__OrdersType__Group__3__Impl rule__OrdersType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__3__Impl_in_rule__OrdersType__Group__3731);
            rule__OrdersType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__4_in_rule__OrdersType__Group__3734);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:391:1: rule__OrdersType__Group__3__Impl : ( '{' ) ;
    public final void rule__OrdersType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:395:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:396:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:396:1: ( '{' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:397:1: '{'
            {
             before(grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__OrdersType__Group__3__Impl762); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: rule__OrdersType__Group__4 : rule__OrdersType__Group__4__Impl rule__OrdersType__Group__5 ;
    public final void rule__OrdersType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:414:1: ( rule__OrdersType__Group__4__Impl rule__OrdersType__Group__5 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:415:2: rule__OrdersType__Group__4__Impl rule__OrdersType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__4__Impl_in_rule__OrdersType__Group__4793);
            rule__OrdersType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__5_in_rule__OrdersType__Group__4796);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:422:1: rule__OrdersType__Group__4__Impl : ( ( rule__OrdersType__Order1Assignment_4 ) ) ;
    public final void rule__OrdersType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:426:1: ( ( ( rule__OrdersType__Order1Assignment_4 ) ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:427:1: ( ( rule__OrdersType__Order1Assignment_4 ) )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:427:1: ( ( rule__OrdersType__Order1Assignment_4 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:428:1: ( rule__OrdersType__Order1Assignment_4 )
            {
             before(grammarAccess.getOrdersTypeAccess().getOrder1Assignment_4()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:429:1: ( rule__OrdersType__Order1Assignment_4 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:429:2: rule__OrdersType__Order1Assignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Order1Assignment_4_in_rule__OrdersType__Group__4__Impl823);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:439:1: rule__OrdersType__Group__5 : rule__OrdersType__Group__5__Impl rule__OrdersType__Group__6 ;
    public final void rule__OrdersType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:443:1: ( rule__OrdersType__Group__5__Impl rule__OrdersType__Group__6 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:444:2: rule__OrdersType__Group__5__Impl rule__OrdersType__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__5__Impl_in_rule__OrdersType__Group__5853);
            rule__OrdersType__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__6_in_rule__OrdersType__Group__5856);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:451:1: rule__OrdersType__Group__5__Impl : ( ( rule__OrdersType__Group_5__0 )* ) ;
    public final void rule__OrdersType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:455:1: ( ( ( rule__OrdersType__Group_5__0 )* ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:456:1: ( ( rule__OrdersType__Group_5__0 )* )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:456:1: ( ( rule__OrdersType__Group_5__0 )* )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:457:1: ( rule__OrdersType__Group_5__0 )*
            {
             before(grammarAccess.getOrdersTypeAccess().getGroup_5()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:458:1: ( rule__OrdersType__Group_5__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:458:2: rule__OrdersType__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_5__0_in_rule__OrdersType__Group__5__Impl883);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:468:1: rule__OrdersType__Group__6 : rule__OrdersType__Group__6__Impl rule__OrdersType__Group__7 ;
    public final void rule__OrdersType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:472:1: ( rule__OrdersType__Group__6__Impl rule__OrdersType__Group__7 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:473:2: rule__OrdersType__Group__6__Impl rule__OrdersType__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__6__Impl_in_rule__OrdersType__Group__6914);
            rule__OrdersType__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__7_in_rule__OrdersType__Group__6917);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:480:1: rule__OrdersType__Group__6__Impl : ( '}' ) ;
    public final void rule__OrdersType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:484:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:485:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:485:1: ( '}' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:486:1: '}'
            {
             before(grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__OrdersType__Group__6__Impl945); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:499:1: rule__OrdersType__Group__7 : rule__OrdersType__Group__7__Impl rule__OrdersType__Group__8 ;
    public final void rule__OrdersType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:503:1: ( rule__OrdersType__Group__7__Impl rule__OrdersType__Group__8 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:504:2: rule__OrdersType__Group__7__Impl rule__OrdersType__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__7__Impl_in_rule__OrdersType__Group__7976);
            rule__OrdersType__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__8_in_rule__OrdersType__Group__7979);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:511:1: rule__OrdersType__Group__7__Impl : ( 'order2' ) ;
    public final void rule__OrdersType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:515:1: ( ( 'order2' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:516:1: ( 'order2' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:516:1: ( 'order2' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:517:1: 'order2'
            {
             before(grammarAccess.getOrdersTypeAccess().getOrder2Keyword_7()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__OrdersType__Group__7__Impl1007); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:530:1: rule__OrdersType__Group__8 : rule__OrdersType__Group__8__Impl rule__OrdersType__Group__9 ;
    public final void rule__OrdersType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:534:1: ( rule__OrdersType__Group__8__Impl rule__OrdersType__Group__9 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:535:2: rule__OrdersType__Group__8__Impl rule__OrdersType__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__8__Impl_in_rule__OrdersType__Group__81038);
            rule__OrdersType__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__9_in_rule__OrdersType__Group__81041);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:542:1: rule__OrdersType__Group__8__Impl : ( '{' ) ;
    public final void rule__OrdersType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:546:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:547:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:547:1: ( '{' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:548:1: '{'
            {
             before(grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__OrdersType__Group__8__Impl1069); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:561:1: rule__OrdersType__Group__9 : rule__OrdersType__Group__9__Impl rule__OrdersType__Group__10 ;
    public final void rule__OrdersType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:565:1: ( rule__OrdersType__Group__9__Impl rule__OrdersType__Group__10 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:566:2: rule__OrdersType__Group__9__Impl rule__OrdersType__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__9__Impl_in_rule__OrdersType__Group__91100);
            rule__OrdersType__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__10_in_rule__OrdersType__Group__91103);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:573:1: rule__OrdersType__Group__9__Impl : ( ( rule__OrdersType__Order2Assignment_9 ) ) ;
    public final void rule__OrdersType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:577:1: ( ( ( rule__OrdersType__Order2Assignment_9 ) ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:578:1: ( ( rule__OrdersType__Order2Assignment_9 ) )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:578:1: ( ( rule__OrdersType__Order2Assignment_9 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:579:1: ( rule__OrdersType__Order2Assignment_9 )
            {
             before(grammarAccess.getOrdersTypeAccess().getOrder2Assignment_9()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:580:1: ( rule__OrdersType__Order2Assignment_9 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:580:2: rule__OrdersType__Order2Assignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Order2Assignment_9_in_rule__OrdersType__Group__9__Impl1130);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:590:1: rule__OrdersType__Group__10 : rule__OrdersType__Group__10__Impl rule__OrdersType__Group__11 ;
    public final void rule__OrdersType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:594:1: ( rule__OrdersType__Group__10__Impl rule__OrdersType__Group__11 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:595:2: rule__OrdersType__Group__10__Impl rule__OrdersType__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__10__Impl_in_rule__OrdersType__Group__101160);
            rule__OrdersType__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__11_in_rule__OrdersType__Group__101163);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:602:1: rule__OrdersType__Group__10__Impl : ( ( rule__OrdersType__Group_10__0 )* ) ;
    public final void rule__OrdersType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:606:1: ( ( ( rule__OrdersType__Group_10__0 )* ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:607:1: ( ( rule__OrdersType__Group_10__0 )* )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:607:1: ( ( rule__OrdersType__Group_10__0 )* )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:608:1: ( rule__OrdersType__Group_10__0 )*
            {
             before(grammarAccess.getOrdersTypeAccess().getGroup_10()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:609:1: ( rule__OrdersType__Group_10__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:609:2: rule__OrdersType__Group_10__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_10__0_in_rule__OrdersType__Group__10__Impl1190);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:619:1: rule__OrdersType__Group__11 : rule__OrdersType__Group__11__Impl rule__OrdersType__Group__12 ;
    public final void rule__OrdersType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:623:1: ( rule__OrdersType__Group__11__Impl rule__OrdersType__Group__12 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:624:2: rule__OrdersType__Group__11__Impl rule__OrdersType__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__11__Impl_in_rule__OrdersType__Group__111221);
            rule__OrdersType__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__12_in_rule__OrdersType__Group__111224);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:631:1: rule__OrdersType__Group__11__Impl : ( '}' ) ;
    public final void rule__OrdersType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:635:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:636:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:636:1: ( '}' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:637:1: '}'
            {
             before(grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_11()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__OrdersType__Group__11__Impl1252); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:650:1: rule__OrdersType__Group__12 : rule__OrdersType__Group__12__Impl rule__OrdersType__Group__13 ;
    public final void rule__OrdersType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:654:1: ( rule__OrdersType__Group__12__Impl rule__OrdersType__Group__13 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:655:2: rule__OrdersType__Group__12__Impl rule__OrdersType__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__12__Impl_in_rule__OrdersType__Group__121283);
            rule__OrdersType__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__13_in_rule__OrdersType__Group__121286);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:662:1: rule__OrdersType__Group__12__Impl : ( 'orderReference1' ) ;
    public final void rule__OrdersType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:666:1: ( ( 'orderReference1' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:667:1: ( 'orderReference1' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:667:1: ( 'orderReference1' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:668:1: 'orderReference1'
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderReference1Keyword_12()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__OrdersType__Group__12__Impl1314); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:681:1: rule__OrdersType__Group__13 : rule__OrdersType__Group__13__Impl rule__OrdersType__Group__14 ;
    public final void rule__OrdersType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:685:1: ( rule__OrdersType__Group__13__Impl rule__OrdersType__Group__14 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:686:2: rule__OrdersType__Group__13__Impl rule__OrdersType__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__13__Impl_in_rule__OrdersType__Group__131345);
            rule__OrdersType__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__14_in_rule__OrdersType__Group__131348);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:693:1: rule__OrdersType__Group__13__Impl : ( '{' ) ;
    public final void rule__OrdersType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:697:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:698:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:698:1: ( '{' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:699:1: '{'
            {
             before(grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_13()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__OrdersType__Group__13__Impl1376); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:712:1: rule__OrdersType__Group__14 : rule__OrdersType__Group__14__Impl rule__OrdersType__Group__15 ;
    public final void rule__OrdersType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:716:1: ( rule__OrdersType__Group__14__Impl rule__OrdersType__Group__15 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:717:2: rule__OrdersType__Group__14__Impl rule__OrdersType__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__14__Impl_in_rule__OrdersType__Group__141407);
            rule__OrdersType__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__15_in_rule__OrdersType__Group__141410);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:724:1: rule__OrdersType__Group__14__Impl : ( ( rule__OrdersType__OrderReference1Assignment_14 ) ) ;
    public final void rule__OrdersType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:728:1: ( ( ( rule__OrdersType__OrderReference1Assignment_14 ) ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:729:1: ( ( rule__OrdersType__OrderReference1Assignment_14 ) )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:729:1: ( ( rule__OrdersType__OrderReference1Assignment_14 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:730:1: ( rule__OrdersType__OrderReference1Assignment_14 )
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderReference1Assignment_14()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:731:1: ( rule__OrdersType__OrderReference1Assignment_14 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:731:2: rule__OrdersType__OrderReference1Assignment_14
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__OrderReference1Assignment_14_in_rule__OrdersType__Group__14__Impl1437);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:741:1: rule__OrdersType__Group__15 : rule__OrdersType__Group__15__Impl rule__OrdersType__Group__16 ;
    public final void rule__OrdersType__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:745:1: ( rule__OrdersType__Group__15__Impl rule__OrdersType__Group__16 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:746:2: rule__OrdersType__Group__15__Impl rule__OrdersType__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__15__Impl_in_rule__OrdersType__Group__151467);
            rule__OrdersType__Group__15__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__16_in_rule__OrdersType__Group__151470);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:753:1: rule__OrdersType__Group__15__Impl : ( ( rule__OrdersType__Group_15__0 )* ) ;
    public final void rule__OrdersType__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:757:1: ( ( ( rule__OrdersType__Group_15__0 )* ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:758:1: ( ( rule__OrdersType__Group_15__0 )* )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:758:1: ( ( rule__OrdersType__Group_15__0 )* )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:759:1: ( rule__OrdersType__Group_15__0 )*
            {
             before(grammarAccess.getOrdersTypeAccess().getGroup_15()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:760:1: ( rule__OrdersType__Group_15__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:760:2: rule__OrdersType__Group_15__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_15__0_in_rule__OrdersType__Group__15__Impl1497);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:770:1: rule__OrdersType__Group__16 : rule__OrdersType__Group__16__Impl rule__OrdersType__Group__17 ;
    public final void rule__OrdersType__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:774:1: ( rule__OrdersType__Group__16__Impl rule__OrdersType__Group__17 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:775:2: rule__OrdersType__Group__16__Impl rule__OrdersType__Group__17
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__16__Impl_in_rule__OrdersType__Group__161528);
            rule__OrdersType__Group__16__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__17_in_rule__OrdersType__Group__161531);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:782:1: rule__OrdersType__Group__16__Impl : ( '}' ) ;
    public final void rule__OrdersType__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:786:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:787:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:787:1: ( '}' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:788:1: '}'
            {
             before(grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_16()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__OrdersType__Group__16__Impl1559); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:801:1: rule__OrdersType__Group__17 : rule__OrdersType__Group__17__Impl rule__OrdersType__Group__18 ;
    public final void rule__OrdersType__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:805:1: ( rule__OrdersType__Group__17__Impl rule__OrdersType__Group__18 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:806:2: rule__OrdersType__Group__17__Impl rule__OrdersType__Group__18
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__17__Impl_in_rule__OrdersType__Group__171590);
            rule__OrdersType__Group__17__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__18_in_rule__OrdersType__Group__171593);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:813:1: rule__OrdersType__Group__17__Impl : ( 'orderReference2' ) ;
    public final void rule__OrdersType__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:817:1: ( ( 'orderReference2' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:818:1: ( 'orderReference2' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:818:1: ( 'orderReference2' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:819:1: 'orderReference2'
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderReference2Keyword_17()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__OrdersType__Group__17__Impl1621); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:832:1: rule__OrdersType__Group__18 : rule__OrdersType__Group__18__Impl rule__OrdersType__Group__19 ;
    public final void rule__OrdersType__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:836:1: ( rule__OrdersType__Group__18__Impl rule__OrdersType__Group__19 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:837:2: rule__OrdersType__Group__18__Impl rule__OrdersType__Group__19
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__18__Impl_in_rule__OrdersType__Group__181652);
            rule__OrdersType__Group__18__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__19_in_rule__OrdersType__Group__181655);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:844:1: rule__OrdersType__Group__18__Impl : ( '{' ) ;
    public final void rule__OrdersType__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:848:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:849:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:849:1: ( '{' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:850:1: '{'
            {
             before(grammarAccess.getOrdersTypeAccess().getLeftCurlyBracketKeyword_18()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__OrdersType__Group__18__Impl1683); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:863:1: rule__OrdersType__Group__19 : rule__OrdersType__Group__19__Impl rule__OrdersType__Group__20 ;
    public final void rule__OrdersType__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:867:1: ( rule__OrdersType__Group__19__Impl rule__OrdersType__Group__20 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:868:2: rule__OrdersType__Group__19__Impl rule__OrdersType__Group__20
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__19__Impl_in_rule__OrdersType__Group__191714);
            rule__OrdersType__Group__19__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__20_in_rule__OrdersType__Group__191717);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:875:1: rule__OrdersType__Group__19__Impl : ( ( rule__OrdersType__OrderReference2Assignment_19 ) ) ;
    public final void rule__OrdersType__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:879:1: ( ( ( rule__OrdersType__OrderReference2Assignment_19 ) ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:880:1: ( ( rule__OrdersType__OrderReference2Assignment_19 ) )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:880:1: ( ( rule__OrdersType__OrderReference2Assignment_19 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:881:1: ( rule__OrdersType__OrderReference2Assignment_19 )
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderReference2Assignment_19()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:882:1: ( rule__OrdersType__OrderReference2Assignment_19 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:882:2: rule__OrdersType__OrderReference2Assignment_19
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__OrderReference2Assignment_19_in_rule__OrdersType__Group__19__Impl1744);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:892:1: rule__OrdersType__Group__20 : rule__OrdersType__Group__20__Impl rule__OrdersType__Group__21 ;
    public final void rule__OrdersType__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:896:1: ( rule__OrdersType__Group__20__Impl rule__OrdersType__Group__21 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:897:2: rule__OrdersType__Group__20__Impl rule__OrdersType__Group__21
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__20__Impl_in_rule__OrdersType__Group__201774);
            rule__OrdersType__Group__20__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__21_in_rule__OrdersType__Group__201777);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:904:1: rule__OrdersType__Group__20__Impl : ( ( rule__OrdersType__Group_20__0 )* ) ;
    public final void rule__OrdersType__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:908:1: ( ( ( rule__OrdersType__Group_20__0 )* ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:909:1: ( ( rule__OrdersType__Group_20__0 )* )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:909:1: ( ( rule__OrdersType__Group_20__0 )* )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:910:1: ( rule__OrdersType__Group_20__0 )*
            {
             before(grammarAccess.getOrdersTypeAccess().getGroup_20()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:911:1: ( rule__OrdersType__Group_20__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:911:2: rule__OrdersType__Group_20__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_20__0_in_rule__OrdersType__Group__20__Impl1804);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:921:1: rule__OrdersType__Group__21 : rule__OrdersType__Group__21__Impl rule__OrdersType__Group__22 ;
    public final void rule__OrdersType__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:925:1: ( rule__OrdersType__Group__21__Impl rule__OrdersType__Group__22 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:926:2: rule__OrdersType__Group__21__Impl rule__OrdersType__Group__22
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__21__Impl_in_rule__OrdersType__Group__211835);
            rule__OrdersType__Group__21__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__22_in_rule__OrdersType__Group__211838);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:933:1: rule__OrdersType__Group__21__Impl : ( '}' ) ;
    public final void rule__OrdersType__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:937:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:938:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:938:1: ( '}' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:939:1: '}'
            {
             before(grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_21()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__OrdersType__Group__21__Impl1866); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:952:1: rule__OrdersType__Group__22 : rule__OrdersType__Group__22__Impl ;
    public final void rule__OrdersType__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:956:1: ( rule__OrdersType__Group__22__Impl )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:957:2: rule__OrdersType__Group__22__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group__22__Impl_in_rule__OrdersType__Group__221897);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:963:1: rule__OrdersType__Group__22__Impl : ( '}' ) ;
    public final void rule__OrdersType__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:967:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:968:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:968:1: ( '}' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:969:1: '}'
            {
             before(grammarAccess.getOrdersTypeAccess().getRightCurlyBracketKeyword_22()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__OrdersType__Group__22__Impl1925); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1028:1: rule__OrdersType__Group_5__0 : rule__OrdersType__Group_5__0__Impl rule__OrdersType__Group_5__1 ;
    public final void rule__OrdersType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1032:1: ( rule__OrdersType__Group_5__0__Impl rule__OrdersType__Group_5__1 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1033:2: rule__OrdersType__Group_5__0__Impl rule__OrdersType__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_5__0__Impl_in_rule__OrdersType__Group_5__02002);
            rule__OrdersType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_5__1_in_rule__OrdersType__Group_5__02005);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1040:1: rule__OrdersType__Group_5__0__Impl : ( ',' ) ;
    public final void rule__OrdersType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1044:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1045:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1045:1: ( ',' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1046:1: ','
            {
             before(grammarAccess.getOrdersTypeAccess().getCommaKeyword_5_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__OrdersType__Group_5__0__Impl2033); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1059:1: rule__OrdersType__Group_5__1 : rule__OrdersType__Group_5__1__Impl ;
    public final void rule__OrdersType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1063:1: ( rule__OrdersType__Group_5__1__Impl )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1064:2: rule__OrdersType__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_5__1__Impl_in_rule__OrdersType__Group_5__12064);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1070:1: rule__OrdersType__Group_5__1__Impl : ( ( rule__OrdersType__Order1Assignment_5_1 ) ) ;
    public final void rule__OrdersType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1074:1: ( ( ( rule__OrdersType__Order1Assignment_5_1 ) ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1075:1: ( ( rule__OrdersType__Order1Assignment_5_1 ) )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1075:1: ( ( rule__OrdersType__Order1Assignment_5_1 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1076:1: ( rule__OrdersType__Order1Assignment_5_1 )
            {
             before(grammarAccess.getOrdersTypeAccess().getOrder1Assignment_5_1()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1077:1: ( rule__OrdersType__Order1Assignment_5_1 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1077:2: rule__OrdersType__Order1Assignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Order1Assignment_5_1_in_rule__OrdersType__Group_5__1__Impl2091);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1091:1: rule__OrdersType__Group_10__0 : rule__OrdersType__Group_10__0__Impl rule__OrdersType__Group_10__1 ;
    public final void rule__OrdersType__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1095:1: ( rule__OrdersType__Group_10__0__Impl rule__OrdersType__Group_10__1 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1096:2: rule__OrdersType__Group_10__0__Impl rule__OrdersType__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_10__0__Impl_in_rule__OrdersType__Group_10__02125);
            rule__OrdersType__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_10__1_in_rule__OrdersType__Group_10__02128);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1103:1: rule__OrdersType__Group_10__0__Impl : ( ',' ) ;
    public final void rule__OrdersType__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1107:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1108:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1108:1: ( ',' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1109:1: ','
            {
             before(grammarAccess.getOrdersTypeAccess().getCommaKeyword_10_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__OrdersType__Group_10__0__Impl2156); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1122:1: rule__OrdersType__Group_10__1 : rule__OrdersType__Group_10__1__Impl ;
    public final void rule__OrdersType__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1126:1: ( rule__OrdersType__Group_10__1__Impl )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1127:2: rule__OrdersType__Group_10__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_10__1__Impl_in_rule__OrdersType__Group_10__12187);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1133:1: rule__OrdersType__Group_10__1__Impl : ( ( rule__OrdersType__Order2Assignment_10_1 ) ) ;
    public final void rule__OrdersType__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1137:1: ( ( ( rule__OrdersType__Order2Assignment_10_1 ) ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1138:1: ( ( rule__OrdersType__Order2Assignment_10_1 ) )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1138:1: ( ( rule__OrdersType__Order2Assignment_10_1 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1139:1: ( rule__OrdersType__Order2Assignment_10_1 )
            {
             before(grammarAccess.getOrdersTypeAccess().getOrder2Assignment_10_1()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1140:1: ( rule__OrdersType__Order2Assignment_10_1 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1140:2: rule__OrdersType__Order2Assignment_10_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Order2Assignment_10_1_in_rule__OrdersType__Group_10__1__Impl2214);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1154:1: rule__OrdersType__Group_15__0 : rule__OrdersType__Group_15__0__Impl rule__OrdersType__Group_15__1 ;
    public final void rule__OrdersType__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1158:1: ( rule__OrdersType__Group_15__0__Impl rule__OrdersType__Group_15__1 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1159:2: rule__OrdersType__Group_15__0__Impl rule__OrdersType__Group_15__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_15__0__Impl_in_rule__OrdersType__Group_15__02248);
            rule__OrdersType__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_15__1_in_rule__OrdersType__Group_15__02251);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1166:1: rule__OrdersType__Group_15__0__Impl : ( ',' ) ;
    public final void rule__OrdersType__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1170:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1171:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1171:1: ( ',' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1172:1: ','
            {
             before(grammarAccess.getOrdersTypeAccess().getCommaKeyword_15_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__OrdersType__Group_15__0__Impl2279); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1185:1: rule__OrdersType__Group_15__1 : rule__OrdersType__Group_15__1__Impl ;
    public final void rule__OrdersType__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1189:1: ( rule__OrdersType__Group_15__1__Impl )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1190:2: rule__OrdersType__Group_15__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_15__1__Impl_in_rule__OrdersType__Group_15__12310);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1196:1: rule__OrdersType__Group_15__1__Impl : ( ( rule__OrdersType__OrderReference1Assignment_15_1 ) ) ;
    public final void rule__OrdersType__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1200:1: ( ( ( rule__OrdersType__OrderReference1Assignment_15_1 ) ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1201:1: ( ( rule__OrdersType__OrderReference1Assignment_15_1 ) )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1201:1: ( ( rule__OrdersType__OrderReference1Assignment_15_1 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1202:1: ( rule__OrdersType__OrderReference1Assignment_15_1 )
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderReference1Assignment_15_1()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1203:1: ( rule__OrdersType__OrderReference1Assignment_15_1 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1203:2: rule__OrdersType__OrderReference1Assignment_15_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__OrderReference1Assignment_15_1_in_rule__OrdersType__Group_15__1__Impl2337);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1217:1: rule__OrdersType__Group_20__0 : rule__OrdersType__Group_20__0__Impl rule__OrdersType__Group_20__1 ;
    public final void rule__OrdersType__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1221:1: ( rule__OrdersType__Group_20__0__Impl rule__OrdersType__Group_20__1 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1222:2: rule__OrdersType__Group_20__0__Impl rule__OrdersType__Group_20__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_20__0__Impl_in_rule__OrdersType__Group_20__02371);
            rule__OrdersType__Group_20__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_20__1_in_rule__OrdersType__Group_20__02374);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1229:1: rule__OrdersType__Group_20__0__Impl : ( ',' ) ;
    public final void rule__OrdersType__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1233:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1234:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1234:1: ( ',' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1235:1: ','
            {
             before(grammarAccess.getOrdersTypeAccess().getCommaKeyword_20_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__OrdersType__Group_20__0__Impl2402); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1248:1: rule__OrdersType__Group_20__1 : rule__OrdersType__Group_20__1__Impl ;
    public final void rule__OrdersType__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1252:1: ( rule__OrdersType__Group_20__1__Impl )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1253:2: rule__OrdersType__Group_20__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__Group_20__1__Impl_in_rule__OrdersType__Group_20__12433);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1259:1: rule__OrdersType__Group_20__1__Impl : ( ( rule__OrdersType__OrderReference2Assignment_20_1 ) ) ;
    public final void rule__OrdersType__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1263:1: ( ( ( rule__OrdersType__OrderReference2Assignment_20_1 ) ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1264:1: ( ( rule__OrdersType__OrderReference2Assignment_20_1 ) )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1264:1: ( ( rule__OrdersType__OrderReference2Assignment_20_1 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1265:1: ( rule__OrdersType__OrderReference2Assignment_20_1 )
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderReference2Assignment_20_1()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1266:1: ( rule__OrdersType__OrderReference2Assignment_20_1 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1266:2: rule__OrdersType__OrderReference2Assignment_20_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrdersType__OrderReference2Assignment_20_1_in_rule__OrdersType__Group_20__1__Impl2460);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1280:1: rule__OrderDetail1__Group__0 : rule__OrderDetail1__Group__0__Impl rule__OrderDetail1__Group__1 ;
    public final void rule__OrderDetail1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1284:1: ( rule__OrderDetail1__Group__0__Impl rule__OrderDetail1__Group__1 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1285:2: rule__OrderDetail1__Group__0__Impl rule__OrderDetail1__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__0__Impl_in_rule__OrderDetail1__Group__02494);
            rule__OrderDetail1__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__1_in_rule__OrderDetail1__Group__02497);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1292:1: rule__OrderDetail1__Group__0__Impl : ( () ) ;
    public final void rule__OrderDetail1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1296:1: ( ( () ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1297:1: ( () )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1297:1: ( () )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1298:1: ()
            {
             before(grammarAccess.getOrderDetail1Access().getOrderDetail1Action_0()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1299:1: ()
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1301:1: 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1311:1: rule__OrderDetail1__Group__1 : rule__OrderDetail1__Group__1__Impl rule__OrderDetail1__Group__2 ;
    public final void rule__OrderDetail1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1315:1: ( rule__OrderDetail1__Group__1__Impl rule__OrderDetail1__Group__2 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1316:2: rule__OrderDetail1__Group__1__Impl rule__OrderDetail1__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__1__Impl_in_rule__OrderDetail1__Group__12555);
            rule__OrderDetail1__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__2_in_rule__OrderDetail1__Group__12558);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1323:1: rule__OrderDetail1__Group__1__Impl : ( 'OrderDetail1' ) ;
    public final void rule__OrderDetail1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1327:1: ( ( 'OrderDetail1' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1328:1: ( 'OrderDetail1' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1328:1: ( 'OrderDetail1' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1329:1: 'OrderDetail1'
            {
             before(grammarAccess.getOrderDetail1Access().getOrderDetail1Keyword_1()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__OrderDetail1__Group__1__Impl2586); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1342:1: rule__OrderDetail1__Group__2 : rule__OrderDetail1__Group__2__Impl rule__OrderDetail1__Group__3 ;
    public final void rule__OrderDetail1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1346:1: ( rule__OrderDetail1__Group__2__Impl rule__OrderDetail1__Group__3 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1347:2: rule__OrderDetail1__Group__2__Impl rule__OrderDetail1__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__2__Impl_in_rule__OrderDetail1__Group__22617);
            rule__OrderDetail1__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__3_in_rule__OrderDetail1__Group__22620);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1354:1: rule__OrderDetail1__Group__2__Impl : ( ( rule__OrderDetail1__NameAssignment_2 ) ) ;
    public final void rule__OrderDetail1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1358:1: ( ( ( rule__OrderDetail1__NameAssignment_2 ) ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1359:1: ( ( rule__OrderDetail1__NameAssignment_2 ) )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1359:1: ( ( rule__OrderDetail1__NameAssignment_2 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1360:1: ( rule__OrderDetail1__NameAssignment_2 )
            {
             before(grammarAccess.getOrderDetail1Access().getNameAssignment_2()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1361:1: ( rule__OrderDetail1__NameAssignment_2 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1361:2: rule__OrderDetail1__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__NameAssignment_2_in_rule__OrderDetail1__Group__2__Impl2647);
            rule__OrderDetail1__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOrderDetail1Access().getNameAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1371:1: rule__OrderDetail1__Group__3 : rule__OrderDetail1__Group__3__Impl rule__OrderDetail1__Group__4 ;
    public final void rule__OrderDetail1__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1375:1: ( rule__OrderDetail1__Group__3__Impl rule__OrderDetail1__Group__4 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1376:2: rule__OrderDetail1__Group__3__Impl rule__OrderDetail1__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__3__Impl_in_rule__OrderDetail1__Group__32677);
            rule__OrderDetail1__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__4_in_rule__OrderDetail1__Group__32680);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1383:1: rule__OrderDetail1__Group__3__Impl : ( '{' ) ;
    public final void rule__OrderDetail1__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1387:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1388:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1388:1: ( '{' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1389:1: '{'
            {
             before(grammarAccess.getOrderDetail1Access().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__OrderDetail1__Group__3__Impl2708); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1402:1: rule__OrderDetail1__Group__4 : rule__OrderDetail1__Group__4__Impl rule__OrderDetail1__Group__5 ;
    public final void rule__OrderDetail1__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1406:1: ( rule__OrderDetail1__Group__4__Impl rule__OrderDetail1__Group__5 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1407:2: rule__OrderDetail1__Group__4__Impl rule__OrderDetail1__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__4__Impl_in_rule__OrderDetail1__Group__42739);
            rule__OrderDetail1__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__5_in_rule__OrderDetail1__Group__42742);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1414:1: rule__OrderDetail1__Group__4__Impl : ( ( rule__OrderDetail1__Group_4__0 )? ) ;
    public final void rule__OrderDetail1__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1418:1: ( ( ( rule__OrderDetail1__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1419:1: ( ( rule__OrderDetail1__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1419:1: ( ( rule__OrderDetail1__Group_4__0 )? )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1420:1: ( rule__OrderDetail1__Group_4__0 )?
            {
             before(grammarAccess.getOrderDetail1Access().getGroup_4()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1421:1: ( rule__OrderDetail1__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1421:2: rule__OrderDetail1__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_4__0_in_rule__OrderDetail1__Group__4__Impl2769);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1431:1: rule__OrderDetail1__Group__5 : rule__OrderDetail1__Group__5__Impl rule__OrderDetail1__Group__6 ;
    public final void rule__OrderDetail1__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1435:1: ( rule__OrderDetail1__Group__5__Impl rule__OrderDetail1__Group__6 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1436:2: rule__OrderDetail1__Group__5__Impl rule__OrderDetail1__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__5__Impl_in_rule__OrderDetail1__Group__52800);
            rule__OrderDetail1__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__6_in_rule__OrderDetail1__Group__52803);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1443:1: rule__OrderDetail1__Group__5__Impl : ( ( rule__OrderDetail1__Group_5__0 )? ) ;
    public final void rule__OrderDetail1__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1447:1: ( ( ( rule__OrderDetail1__Group_5__0 )? ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1448:1: ( ( rule__OrderDetail1__Group_5__0 )? )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1448:1: ( ( rule__OrderDetail1__Group_5__0 )? )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1449:1: ( rule__OrderDetail1__Group_5__0 )?
            {
             before(grammarAccess.getOrderDetail1Access().getGroup_5()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1450:1: ( rule__OrderDetail1__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1450:2: rule__OrderDetail1__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_5__0_in_rule__OrderDetail1__Group__5__Impl2830);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1460:1: rule__OrderDetail1__Group__6 : rule__OrderDetail1__Group__6__Impl rule__OrderDetail1__Group__7 ;
    public final void rule__OrderDetail1__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1464:1: ( rule__OrderDetail1__Group__6__Impl rule__OrderDetail1__Group__7 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1465:2: rule__OrderDetail1__Group__6__Impl rule__OrderDetail1__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__6__Impl_in_rule__OrderDetail1__Group__62861);
            rule__OrderDetail1__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__7_in_rule__OrderDetail1__Group__62864);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1472:1: rule__OrderDetail1__Group__6__Impl : ( ( rule__OrderDetail1__Group_6__0 )? ) ;
    public final void rule__OrderDetail1__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1476:1: ( ( ( rule__OrderDetail1__Group_6__0 )? ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1477:1: ( ( rule__OrderDetail1__Group_6__0 )? )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1477:1: ( ( rule__OrderDetail1__Group_6__0 )? )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1478:1: ( rule__OrderDetail1__Group_6__0 )?
            {
             before(grammarAccess.getOrderDetail1Access().getGroup_6()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1479:1: ( rule__OrderDetail1__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1479:2: rule__OrderDetail1__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_6__0_in_rule__OrderDetail1__Group__6__Impl2891);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1489:1: rule__OrderDetail1__Group__7 : rule__OrderDetail1__Group__7__Impl ;
    public final void rule__OrderDetail1__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1493:1: ( rule__OrderDetail1__Group__7__Impl )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1494:2: rule__OrderDetail1__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group__7__Impl_in_rule__OrderDetail1__Group__72922);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1500:1: rule__OrderDetail1__Group__7__Impl : ( '}' ) ;
    public final void rule__OrderDetail1__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1504:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1505:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1505:1: ( '}' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1506:1: '}'
            {
             before(grammarAccess.getOrderDetail1Access().getRightCurlyBracketKeyword_7()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__OrderDetail1__Group__7__Impl2950); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1535:1: rule__OrderDetail1__Group_4__0 : rule__OrderDetail1__Group_4__0__Impl rule__OrderDetail1__Group_4__1 ;
    public final void rule__OrderDetail1__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1539:1: ( rule__OrderDetail1__Group_4__0__Impl rule__OrderDetail1__Group_4__1 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1540:2: rule__OrderDetail1__Group_4__0__Impl rule__OrderDetail1__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_4__0__Impl_in_rule__OrderDetail1__Group_4__02997);
            rule__OrderDetail1__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_4__1_in_rule__OrderDetail1__Group_4__03000);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1547:1: rule__OrderDetail1__Group_4__0__Impl : ( 'customerAddress' ) ;
    public final void rule__OrderDetail1__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1551:1: ( ( 'customerAddress' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1552:1: ( 'customerAddress' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1552:1: ( 'customerAddress' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1553:1: 'customerAddress'
            {
             before(grammarAccess.getOrderDetail1Access().getCustomerAddressKeyword_4_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__OrderDetail1__Group_4__0__Impl3028); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1566:1: rule__OrderDetail1__Group_4__1 : rule__OrderDetail1__Group_4__1__Impl ;
    public final void rule__OrderDetail1__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1570:1: ( rule__OrderDetail1__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1571:2: rule__OrderDetail1__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_4__1__Impl_in_rule__OrderDetail1__Group_4__13059);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1577:1: rule__OrderDetail1__Group_4__1__Impl : ( ( rule__OrderDetail1__CustomerAddressAssignment_4_1 ) ) ;
    public final void rule__OrderDetail1__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1581:1: ( ( ( rule__OrderDetail1__CustomerAddressAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1582:1: ( ( rule__OrderDetail1__CustomerAddressAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1582:1: ( ( rule__OrderDetail1__CustomerAddressAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1583:1: ( rule__OrderDetail1__CustomerAddressAssignment_4_1 )
            {
             before(grammarAccess.getOrderDetail1Access().getCustomerAddressAssignment_4_1()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1584:1: ( rule__OrderDetail1__CustomerAddressAssignment_4_1 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1584:2: rule__OrderDetail1__CustomerAddressAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__CustomerAddressAssignment_4_1_in_rule__OrderDetail1__Group_4__1__Impl3086);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1598:1: rule__OrderDetail1__Group_5__0 : rule__OrderDetail1__Group_5__0__Impl rule__OrderDetail1__Group_5__1 ;
    public final void rule__OrderDetail1__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1602:1: ( rule__OrderDetail1__Group_5__0__Impl rule__OrderDetail1__Group_5__1 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1603:2: rule__OrderDetail1__Group_5__0__Impl rule__OrderDetail1__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_5__0__Impl_in_rule__OrderDetail1__Group_5__03120);
            rule__OrderDetail1__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_5__1_in_rule__OrderDetail1__Group_5__03123);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1610:1: rule__OrderDetail1__Group_5__0__Impl : ( 'customerContact' ) ;
    public final void rule__OrderDetail1__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1614:1: ( ( 'customerContact' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1615:1: ( 'customerContact' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1615:1: ( 'customerContact' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1616:1: 'customerContact'
            {
             before(grammarAccess.getOrderDetail1Access().getCustomerContactKeyword_5_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__OrderDetail1__Group_5__0__Impl3151); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1629:1: rule__OrderDetail1__Group_5__1 : rule__OrderDetail1__Group_5__1__Impl ;
    public final void rule__OrderDetail1__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1633:1: ( rule__OrderDetail1__Group_5__1__Impl )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1634:2: rule__OrderDetail1__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_5__1__Impl_in_rule__OrderDetail1__Group_5__13182);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1640:1: rule__OrderDetail1__Group_5__1__Impl : ( ( rule__OrderDetail1__CustomerContactAssignment_5_1 ) ) ;
    public final void rule__OrderDetail1__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1644:1: ( ( ( rule__OrderDetail1__CustomerContactAssignment_5_1 ) ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1645:1: ( ( rule__OrderDetail1__CustomerContactAssignment_5_1 ) )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1645:1: ( ( rule__OrderDetail1__CustomerContactAssignment_5_1 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1646:1: ( rule__OrderDetail1__CustomerContactAssignment_5_1 )
            {
             before(grammarAccess.getOrderDetail1Access().getCustomerContactAssignment_5_1()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1647:1: ( rule__OrderDetail1__CustomerContactAssignment_5_1 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1647:2: rule__OrderDetail1__CustomerContactAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__CustomerContactAssignment_5_1_in_rule__OrderDetail1__Group_5__1__Impl3209);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1661:1: rule__OrderDetail1__Group_6__0 : rule__OrderDetail1__Group_6__0__Impl rule__OrderDetail1__Group_6__1 ;
    public final void rule__OrderDetail1__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1665:1: ( rule__OrderDetail1__Group_6__0__Impl rule__OrderDetail1__Group_6__1 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1666:2: rule__OrderDetail1__Group_6__0__Impl rule__OrderDetail1__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_6__0__Impl_in_rule__OrderDetail1__Group_6__03243);
            rule__OrderDetail1__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_6__1_in_rule__OrderDetail1__Group_6__03246);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1673:1: rule__OrderDetail1__Group_6__0__Impl : ( 'customerName' ) ;
    public final void rule__OrderDetail1__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1677:1: ( ( 'customerName' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1678:1: ( 'customerName' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1678:1: ( 'customerName' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1679:1: 'customerName'
            {
             before(grammarAccess.getOrderDetail1Access().getCustomerNameKeyword_6_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__OrderDetail1__Group_6__0__Impl3274); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1692:1: rule__OrderDetail1__Group_6__1 : rule__OrderDetail1__Group_6__1__Impl ;
    public final void rule__OrderDetail1__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1696:1: ( rule__OrderDetail1__Group_6__1__Impl )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1697:2: rule__OrderDetail1__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__Group_6__1__Impl_in_rule__OrderDetail1__Group_6__13305);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1703:1: rule__OrderDetail1__Group_6__1__Impl : ( ( rule__OrderDetail1__CustomerNameAssignment_6_1 ) ) ;
    public final void rule__OrderDetail1__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1707:1: ( ( ( rule__OrderDetail1__CustomerNameAssignment_6_1 ) ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1708:1: ( ( rule__OrderDetail1__CustomerNameAssignment_6_1 ) )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1708:1: ( ( rule__OrderDetail1__CustomerNameAssignment_6_1 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1709:1: ( rule__OrderDetail1__CustomerNameAssignment_6_1 )
            {
             before(grammarAccess.getOrderDetail1Access().getCustomerNameAssignment_6_1()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1710:1: ( rule__OrderDetail1__CustomerNameAssignment_6_1 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1710:2: rule__OrderDetail1__CustomerNameAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail1__CustomerNameAssignment_6_1_in_rule__OrderDetail1__Group_6__1__Impl3332);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1724:1: rule__OrderDetail2__Group__0 : rule__OrderDetail2__Group__0__Impl rule__OrderDetail2__Group__1 ;
    public final void rule__OrderDetail2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1728:1: ( rule__OrderDetail2__Group__0__Impl rule__OrderDetail2__Group__1 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1729:2: rule__OrderDetail2__Group__0__Impl rule__OrderDetail2__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__0__Impl_in_rule__OrderDetail2__Group__03366);
            rule__OrderDetail2__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__1_in_rule__OrderDetail2__Group__03369);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1736:1: rule__OrderDetail2__Group__0__Impl : ( () ) ;
    public final void rule__OrderDetail2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1740:1: ( ( () ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1741:1: ( () )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1741:1: ( () )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1742:1: ()
            {
             before(grammarAccess.getOrderDetail2Access().getOrderDetail2Action_0()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1743:1: ()
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1745:1: 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1755:1: rule__OrderDetail2__Group__1 : rule__OrderDetail2__Group__1__Impl rule__OrderDetail2__Group__2 ;
    public final void rule__OrderDetail2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1759:1: ( rule__OrderDetail2__Group__1__Impl rule__OrderDetail2__Group__2 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1760:2: rule__OrderDetail2__Group__1__Impl rule__OrderDetail2__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__1__Impl_in_rule__OrderDetail2__Group__13427);
            rule__OrderDetail2__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__2_in_rule__OrderDetail2__Group__13430);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1767:1: rule__OrderDetail2__Group__1__Impl : ( 'OrderDetail2' ) ;
    public final void rule__OrderDetail2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1771:1: ( ( 'OrderDetail2' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1772:1: ( 'OrderDetail2' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1772:1: ( 'OrderDetail2' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1773:1: 'OrderDetail2'
            {
             before(grammarAccess.getOrderDetail2Access().getOrderDetail2Keyword_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__OrderDetail2__Group__1__Impl3458); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1786:1: rule__OrderDetail2__Group__2 : rule__OrderDetail2__Group__2__Impl rule__OrderDetail2__Group__3 ;
    public final void rule__OrderDetail2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1790:1: ( rule__OrderDetail2__Group__2__Impl rule__OrderDetail2__Group__3 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1791:2: rule__OrderDetail2__Group__2__Impl rule__OrderDetail2__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__2__Impl_in_rule__OrderDetail2__Group__23489);
            rule__OrderDetail2__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__3_in_rule__OrderDetail2__Group__23492);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1798:1: rule__OrderDetail2__Group__2__Impl : ( ( rule__OrderDetail2__NameAssignment_2 ) ) ;
    public final void rule__OrderDetail2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1802:1: ( ( ( rule__OrderDetail2__NameAssignment_2 ) ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1803:1: ( ( rule__OrderDetail2__NameAssignment_2 ) )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1803:1: ( ( rule__OrderDetail2__NameAssignment_2 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1804:1: ( rule__OrderDetail2__NameAssignment_2 )
            {
             before(grammarAccess.getOrderDetail2Access().getNameAssignment_2()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1805:1: ( rule__OrderDetail2__NameAssignment_2 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1805:2: rule__OrderDetail2__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__NameAssignment_2_in_rule__OrderDetail2__Group__2__Impl3519);
            rule__OrderDetail2__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOrderDetail2Access().getNameAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1815:1: rule__OrderDetail2__Group__3 : rule__OrderDetail2__Group__3__Impl rule__OrderDetail2__Group__4 ;
    public final void rule__OrderDetail2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1819:1: ( rule__OrderDetail2__Group__3__Impl rule__OrderDetail2__Group__4 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1820:2: rule__OrderDetail2__Group__3__Impl rule__OrderDetail2__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__3__Impl_in_rule__OrderDetail2__Group__33549);
            rule__OrderDetail2__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__4_in_rule__OrderDetail2__Group__33552);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1827:1: rule__OrderDetail2__Group__3__Impl : ( '{' ) ;
    public final void rule__OrderDetail2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1831:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1832:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1832:1: ( '{' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1833:1: '{'
            {
             before(grammarAccess.getOrderDetail2Access().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__OrderDetail2__Group__3__Impl3580); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1846:1: rule__OrderDetail2__Group__4 : rule__OrderDetail2__Group__4__Impl rule__OrderDetail2__Group__5 ;
    public final void rule__OrderDetail2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1850:1: ( rule__OrderDetail2__Group__4__Impl rule__OrderDetail2__Group__5 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1851:2: rule__OrderDetail2__Group__4__Impl rule__OrderDetail2__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__4__Impl_in_rule__OrderDetail2__Group__43611);
            rule__OrderDetail2__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__5_in_rule__OrderDetail2__Group__43614);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1858:1: rule__OrderDetail2__Group__4__Impl : ( ( rule__OrderDetail2__Group_4__0 )? ) ;
    public final void rule__OrderDetail2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1862:1: ( ( ( rule__OrderDetail2__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1863:1: ( ( rule__OrderDetail2__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1863:1: ( ( rule__OrderDetail2__Group_4__0 )? )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1864:1: ( rule__OrderDetail2__Group_4__0 )?
            {
             before(grammarAccess.getOrderDetail2Access().getGroup_4()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1865:1: ( rule__OrderDetail2__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1865:2: rule__OrderDetail2__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group_4__0_in_rule__OrderDetail2__Group__4__Impl3641);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1875:1: rule__OrderDetail2__Group__5 : rule__OrderDetail2__Group__5__Impl ;
    public final void rule__OrderDetail2__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1879:1: ( rule__OrderDetail2__Group__5__Impl )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1880:2: rule__OrderDetail2__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group__5__Impl_in_rule__OrderDetail2__Group__53672);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1886:1: rule__OrderDetail2__Group__5__Impl : ( '}' ) ;
    public final void rule__OrderDetail2__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1890:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1891:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1891:1: ( '}' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1892:1: '}'
            {
             before(grammarAccess.getOrderDetail2Access().getRightCurlyBracketKeyword_5()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__OrderDetail2__Group__5__Impl3700); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1917:1: rule__OrderDetail2__Group_4__0 : rule__OrderDetail2__Group_4__0__Impl rule__OrderDetail2__Group_4__1 ;
    public final void rule__OrderDetail2__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1921:1: ( rule__OrderDetail2__Group_4__0__Impl rule__OrderDetail2__Group_4__1 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1922:2: rule__OrderDetail2__Group_4__0__Impl rule__OrderDetail2__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group_4__0__Impl_in_rule__OrderDetail2__Group_4__03743);
            rule__OrderDetail2__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group_4__1_in_rule__OrderDetail2__Group_4__03746);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1929:1: rule__OrderDetail2__Group_4__0__Impl : ( 'customerName' ) ;
    public final void rule__OrderDetail2__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1933:1: ( ( 'customerName' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1934:1: ( 'customerName' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1934:1: ( 'customerName' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1935:1: 'customerName'
            {
             before(grammarAccess.getOrderDetail2Access().getCustomerNameKeyword_4_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__OrderDetail2__Group_4__0__Impl3774); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1948:1: rule__OrderDetail2__Group_4__1 : rule__OrderDetail2__Group_4__1__Impl ;
    public final void rule__OrderDetail2__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1952:1: ( rule__OrderDetail2__Group_4__1__Impl )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1953:2: rule__OrderDetail2__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__Group_4__1__Impl_in_rule__OrderDetail2__Group_4__13805);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1959:1: rule__OrderDetail2__Group_4__1__Impl : ( ( rule__OrderDetail2__CustomerNameAssignment_4_1 ) ) ;
    public final void rule__OrderDetail2__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1963:1: ( ( ( rule__OrderDetail2__CustomerNameAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1964:1: ( ( rule__OrderDetail2__CustomerNameAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1964:1: ( ( rule__OrderDetail2__CustomerNameAssignment_4_1 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1965:1: ( rule__OrderDetail2__CustomerNameAssignment_4_1 )
            {
             before(grammarAccess.getOrderDetail2Access().getCustomerNameAssignment_4_1()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1966:1: ( rule__OrderDetail2__CustomerNameAssignment_4_1 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1966:2: rule__OrderDetail2__CustomerNameAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderDetail2__CustomerNameAssignment_4_1_in_rule__OrderDetail2__Group_4__1__Impl3832);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1980:1: rule__OrderRef1__Group__0 : rule__OrderRef1__Group__0__Impl rule__OrderRef1__Group__1 ;
    public final void rule__OrderRef1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1984:1: ( rule__OrderRef1__Group__0__Impl rule__OrderRef1__Group__1 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1985:2: rule__OrderRef1__Group__0__Impl rule__OrderRef1__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group__0__Impl_in_rule__OrderRef1__Group__03866);
            rule__OrderRef1__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group__1_in_rule__OrderRef1__Group__03869);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1992:1: rule__OrderRef1__Group__0__Impl : ( () ) ;
    public final void rule__OrderRef1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1996:1: ( ( () ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1997:1: ( () )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1997:1: ( () )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1998:1: ()
            {
             before(grammarAccess.getOrderRef1Access().getOrderRef1Action_0()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:1999:1: ()
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2001:1: 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2011:1: rule__OrderRef1__Group__1 : rule__OrderRef1__Group__1__Impl rule__OrderRef1__Group__2 ;
    public final void rule__OrderRef1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2015:1: ( rule__OrderRef1__Group__1__Impl rule__OrderRef1__Group__2 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2016:2: rule__OrderRef1__Group__1__Impl rule__OrderRef1__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group__1__Impl_in_rule__OrderRef1__Group__13927);
            rule__OrderRef1__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group__2_in_rule__OrderRef1__Group__13930);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2023:1: rule__OrderRef1__Group__1__Impl : ( 'OrderRef1' ) ;
    public final void rule__OrderRef1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2027:1: ( ( 'OrderRef1' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2028:1: ( 'OrderRef1' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2028:1: ( 'OrderRef1' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2029:1: 'OrderRef1'
            {
             before(grammarAccess.getOrderRef1Access().getOrderRef1Keyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__OrderRef1__Group__1__Impl3958); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2042:1: rule__OrderRef1__Group__2 : rule__OrderRef1__Group__2__Impl rule__OrderRef1__Group__3 ;
    public final void rule__OrderRef1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2046:1: ( rule__OrderRef1__Group__2__Impl rule__OrderRef1__Group__3 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2047:2: rule__OrderRef1__Group__2__Impl rule__OrderRef1__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group__2__Impl_in_rule__OrderRef1__Group__23989);
            rule__OrderRef1__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group__3_in_rule__OrderRef1__Group__23992);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2054:1: rule__OrderRef1__Group__2__Impl : ( '{' ) ;
    public final void rule__OrderRef1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2058:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2059:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2059:1: ( '{' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2060:1: '{'
            {
             before(grammarAccess.getOrderRef1Access().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__OrderRef1__Group__2__Impl4020); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2073:1: rule__OrderRef1__Group__3 : rule__OrderRef1__Group__3__Impl rule__OrderRef1__Group__4 ;
    public final void rule__OrderRef1__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2077:1: ( rule__OrderRef1__Group__3__Impl rule__OrderRef1__Group__4 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2078:2: rule__OrderRef1__Group__3__Impl rule__OrderRef1__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group__3__Impl_in_rule__OrderRef1__Group__34051);
            rule__OrderRef1__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group__4_in_rule__OrderRef1__Group__34054);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2085:1: rule__OrderRef1__Group__3__Impl : ( ( rule__OrderRef1__Group_3__0 )? ) ;
    public final void rule__OrderRef1__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2089:1: ( ( ( rule__OrderRef1__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2090:1: ( ( rule__OrderRef1__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2090:1: ( ( rule__OrderRef1__Group_3__0 )? )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2091:1: ( rule__OrderRef1__Group_3__0 )?
            {
             before(grammarAccess.getOrderRef1Access().getGroup_3()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2092:1: ( rule__OrderRef1__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2092:2: rule__OrderRef1__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group_3__0_in_rule__OrderRef1__Group__3__Impl4081);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2102:1: rule__OrderRef1__Group__4 : rule__OrderRef1__Group__4__Impl ;
    public final void rule__OrderRef1__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2106:1: ( rule__OrderRef1__Group__4__Impl )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2107:2: rule__OrderRef1__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group__4__Impl_in_rule__OrderRef1__Group__44112);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2113:1: rule__OrderRef1__Group__4__Impl : ( '}' ) ;
    public final void rule__OrderRef1__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2117:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2118:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2118:1: ( '}' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2119:1: '}'
            {
             before(grammarAccess.getOrderRef1Access().getRightCurlyBracketKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__OrderRef1__Group__4__Impl4140); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2142:1: rule__OrderRef1__Group_3__0 : rule__OrderRef1__Group_3__0__Impl rule__OrderRef1__Group_3__1 ;
    public final void rule__OrderRef1__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2146:1: ( rule__OrderRef1__Group_3__0__Impl rule__OrderRef1__Group_3__1 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2147:2: rule__OrderRef1__Group_3__0__Impl rule__OrderRef1__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group_3__0__Impl_in_rule__OrderRef1__Group_3__04181);
            rule__OrderRef1__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group_3__1_in_rule__OrderRef1__Group_3__04184);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2154:1: rule__OrderRef1__Group_3__0__Impl : ( 'orderDetail1' ) ;
    public final void rule__OrderRef1__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2158:1: ( ( 'orderDetail1' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2159:1: ( 'orderDetail1' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2159:1: ( 'orderDetail1' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2160:1: 'orderDetail1'
            {
             before(grammarAccess.getOrderRef1Access().getOrderDetail1Keyword_3_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__OrderRef1__Group_3__0__Impl4212); 
             after(grammarAccess.getOrderRef1Access().getOrderDetail1Keyword_3_0()); 

            }


            }

        }
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2173:1: rule__OrderRef1__Group_3__1 : rule__OrderRef1__Group_3__1__Impl ;
    public final void rule__OrderRef1__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2177:1: ( rule__OrderRef1__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2178:2: rule__OrderRef1__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__Group_3__1__Impl_in_rule__OrderRef1__Group_3__14243);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2184:1: rule__OrderRef1__Group_3__1__Impl : ( ( rule__OrderRef1__OrderDetail1Assignment_3_1 ) ) ;
    public final void rule__OrderRef1__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2188:1: ( ( ( rule__OrderRef1__OrderDetail1Assignment_3_1 ) ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2189:1: ( ( rule__OrderRef1__OrderDetail1Assignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2189:1: ( ( rule__OrderRef1__OrderDetail1Assignment_3_1 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2190:1: ( rule__OrderRef1__OrderDetail1Assignment_3_1 )
            {
             before(grammarAccess.getOrderRef1Access().getOrderDetail1Assignment_3_1()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2191:1: ( rule__OrderRef1__OrderDetail1Assignment_3_1 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2191:2: rule__OrderRef1__OrderDetail1Assignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef1__OrderDetail1Assignment_3_1_in_rule__OrderRef1__Group_3__1__Impl4270);
            rule__OrderRef1__OrderDetail1Assignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderRef1Access().getOrderDetail1Assignment_3_1()); 

            }


            }

        }
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2205:1: rule__OrderRef2__Group__0 : rule__OrderRef2__Group__0__Impl rule__OrderRef2__Group__1 ;
    public final void rule__OrderRef2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2209:1: ( rule__OrderRef2__Group__0__Impl rule__OrderRef2__Group__1 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2210:2: rule__OrderRef2__Group__0__Impl rule__OrderRef2__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group__0__Impl_in_rule__OrderRef2__Group__04304);
            rule__OrderRef2__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group__1_in_rule__OrderRef2__Group__04307);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2217:1: rule__OrderRef2__Group__0__Impl : ( () ) ;
    public final void rule__OrderRef2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2221:1: ( ( () ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2222:1: ( () )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2222:1: ( () )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2223:1: ()
            {
             before(grammarAccess.getOrderRef2Access().getOrderRef2Action_0()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2224:1: ()
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2226:1: 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2236:1: rule__OrderRef2__Group__1 : rule__OrderRef2__Group__1__Impl rule__OrderRef2__Group__2 ;
    public final void rule__OrderRef2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2240:1: ( rule__OrderRef2__Group__1__Impl rule__OrderRef2__Group__2 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2241:2: rule__OrderRef2__Group__1__Impl rule__OrderRef2__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group__1__Impl_in_rule__OrderRef2__Group__14365);
            rule__OrderRef2__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group__2_in_rule__OrderRef2__Group__14368);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2248:1: rule__OrderRef2__Group__1__Impl : ( 'OrderRef2' ) ;
    public final void rule__OrderRef2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2252:1: ( ( 'OrderRef2' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2253:1: ( 'OrderRef2' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2253:1: ( 'OrderRef2' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2254:1: 'OrderRef2'
            {
             before(grammarAccess.getOrderRef2Access().getOrderRef2Keyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__OrderRef2__Group__1__Impl4396); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2267:1: rule__OrderRef2__Group__2 : rule__OrderRef2__Group__2__Impl rule__OrderRef2__Group__3 ;
    public final void rule__OrderRef2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2271:1: ( rule__OrderRef2__Group__2__Impl rule__OrderRef2__Group__3 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2272:2: rule__OrderRef2__Group__2__Impl rule__OrderRef2__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group__2__Impl_in_rule__OrderRef2__Group__24427);
            rule__OrderRef2__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group__3_in_rule__OrderRef2__Group__24430);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2279:1: rule__OrderRef2__Group__2__Impl : ( '{' ) ;
    public final void rule__OrderRef2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2283:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2284:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2284:1: ( '{' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2285:1: '{'
            {
             before(grammarAccess.getOrderRef2Access().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__OrderRef2__Group__2__Impl4458); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2298:1: rule__OrderRef2__Group__3 : rule__OrderRef2__Group__3__Impl rule__OrderRef2__Group__4 ;
    public final void rule__OrderRef2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2302:1: ( rule__OrderRef2__Group__3__Impl rule__OrderRef2__Group__4 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2303:2: rule__OrderRef2__Group__3__Impl rule__OrderRef2__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group__3__Impl_in_rule__OrderRef2__Group__34489);
            rule__OrderRef2__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group__4_in_rule__OrderRef2__Group__34492);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2310:1: rule__OrderRef2__Group__3__Impl : ( ( rule__OrderRef2__Group_3__0 )? ) ;
    public final void rule__OrderRef2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2314:1: ( ( ( rule__OrderRef2__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2315:1: ( ( rule__OrderRef2__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2315:1: ( ( rule__OrderRef2__Group_3__0 )? )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2316:1: ( rule__OrderRef2__Group_3__0 )?
            {
             before(grammarAccess.getOrderRef2Access().getGroup_3()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2317:1: ( rule__OrderRef2__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2317:2: rule__OrderRef2__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group_3__0_in_rule__OrderRef2__Group__3__Impl4519);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2327:1: rule__OrderRef2__Group__4 : rule__OrderRef2__Group__4__Impl ;
    public final void rule__OrderRef2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2331:1: ( rule__OrderRef2__Group__4__Impl )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2332:2: rule__OrderRef2__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group__4__Impl_in_rule__OrderRef2__Group__44550);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2338:1: rule__OrderRef2__Group__4__Impl : ( '}' ) ;
    public final void rule__OrderRef2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2342:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2343:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2343:1: ( '}' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2344:1: '}'
            {
             before(grammarAccess.getOrderRef2Access().getRightCurlyBracketKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__OrderRef2__Group__4__Impl4578); 
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2367:1: rule__OrderRef2__Group_3__0 : rule__OrderRef2__Group_3__0__Impl rule__OrderRef2__Group_3__1 ;
    public final void rule__OrderRef2__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2371:1: ( rule__OrderRef2__Group_3__0__Impl rule__OrderRef2__Group_3__1 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2372:2: rule__OrderRef2__Group_3__0__Impl rule__OrderRef2__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group_3__0__Impl_in_rule__OrderRef2__Group_3__04619);
            rule__OrderRef2__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group_3__1_in_rule__OrderRef2__Group_3__04622);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2379:1: rule__OrderRef2__Group_3__0__Impl : ( 'orderDetail2' ) ;
    public final void rule__OrderRef2__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2383:1: ( ( 'orderDetail2' ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2384:1: ( 'orderDetail2' )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2384:1: ( 'orderDetail2' )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2385:1: 'orderDetail2'
            {
             before(grammarAccess.getOrderRef2Access().getOrderDetail2Keyword_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__OrderRef2__Group_3__0__Impl4650); 
             after(grammarAccess.getOrderRef2Access().getOrderDetail2Keyword_3_0()); 

            }


            }

        }
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2398:1: rule__OrderRef2__Group_3__1 : rule__OrderRef2__Group_3__1__Impl ;
    public final void rule__OrderRef2__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2402:1: ( rule__OrderRef2__Group_3__1__Impl )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2403:2: rule__OrderRef2__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__Group_3__1__Impl_in_rule__OrderRef2__Group_3__14681);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2409:1: rule__OrderRef2__Group_3__1__Impl : ( ( rule__OrderRef2__OrderDetail2Assignment_3_1 ) ) ;
    public final void rule__OrderRef2__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2413:1: ( ( ( rule__OrderRef2__OrderDetail2Assignment_3_1 ) ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2414:1: ( ( rule__OrderRef2__OrderDetail2Assignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2414:1: ( ( rule__OrderRef2__OrderDetail2Assignment_3_1 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2415:1: ( rule__OrderRef2__OrderDetail2Assignment_3_1 )
            {
             before(grammarAccess.getOrderRef2Access().getOrderDetail2Assignment_3_1()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2416:1: ( rule__OrderRef2__OrderDetail2Assignment_3_1 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2416:2: rule__OrderRef2__OrderDetail2Assignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrderRef2__OrderDetail2Assignment_3_1_in_rule__OrderRef2__Group_3__1__Impl4708);
            rule__OrderRef2__OrderDetail2Assignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderRef2Access().getOrderDetail2Assignment_3_1()); 

            }


            }

        }
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2431:1: rule__OrdersType__Order1Assignment_4 : ( ruleOrderDetail1 ) ;
    public final void rule__OrdersType__Order1Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2435:1: ( ( ruleOrderDetail1 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2436:1: ( ruleOrderDetail1 )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2436:1: ( ruleOrderDetail1 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2437:1: ruleOrderDetail1
            {
             before(grammarAccess.getOrdersTypeAccess().getOrder1OrderDetail1ParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderDetail1_in_rule__OrdersType__Order1Assignment_44747);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2446:1: rule__OrdersType__Order1Assignment_5_1 : ( ruleOrderDetail1 ) ;
    public final void rule__OrdersType__Order1Assignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2450:1: ( ( ruleOrderDetail1 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2451:1: ( ruleOrderDetail1 )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2451:1: ( ruleOrderDetail1 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2452:1: ruleOrderDetail1
            {
             before(grammarAccess.getOrdersTypeAccess().getOrder1OrderDetail1ParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderDetail1_in_rule__OrdersType__Order1Assignment_5_14778);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2461:1: rule__OrdersType__Order2Assignment_9 : ( ruleOrderDetail2 ) ;
    public final void rule__OrdersType__Order2Assignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2465:1: ( ( ruleOrderDetail2 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2466:1: ( ruleOrderDetail2 )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2466:1: ( ruleOrderDetail2 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2467:1: ruleOrderDetail2
            {
             before(grammarAccess.getOrdersTypeAccess().getOrder2OrderDetail2ParserRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderDetail2_in_rule__OrdersType__Order2Assignment_94809);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2476:1: rule__OrdersType__Order2Assignment_10_1 : ( ruleOrderDetail2 ) ;
    public final void rule__OrdersType__Order2Assignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2480:1: ( ( ruleOrderDetail2 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2481:1: ( ruleOrderDetail2 )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2481:1: ( ruleOrderDetail2 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2482:1: ruleOrderDetail2
            {
             before(grammarAccess.getOrdersTypeAccess().getOrder2OrderDetail2ParserRuleCall_10_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderDetail2_in_rule__OrdersType__Order2Assignment_10_14840);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2491:1: rule__OrdersType__OrderReference1Assignment_14 : ( ruleOrderRef1 ) ;
    public final void rule__OrdersType__OrderReference1Assignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:1: ( ( ruleOrderRef1 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2496:1: ( ruleOrderRef1 )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2496:1: ( ruleOrderRef1 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:1: ruleOrderRef1
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderReference1OrderRef1ParserRuleCall_14_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderRef1_in_rule__OrdersType__OrderReference1Assignment_144871);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2506:1: rule__OrdersType__OrderReference1Assignment_15_1 : ( ruleOrderRef1 ) ;
    public final void rule__OrdersType__OrderReference1Assignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2510:1: ( ( ruleOrderRef1 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2511:1: ( ruleOrderRef1 )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2511:1: ( ruleOrderRef1 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2512:1: ruleOrderRef1
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderReference1OrderRef1ParserRuleCall_15_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderRef1_in_rule__OrdersType__OrderReference1Assignment_15_14902);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2521:1: rule__OrdersType__OrderReference2Assignment_19 : ( ruleOrderRef2 ) ;
    public final void rule__OrdersType__OrderReference2Assignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2525:1: ( ( ruleOrderRef2 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2526:1: ( ruleOrderRef2 )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2526:1: ( ruleOrderRef2 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2527:1: ruleOrderRef2
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderReference2OrderRef2ParserRuleCall_19_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderRef2_in_rule__OrdersType__OrderReference2Assignment_194933);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2536:1: rule__OrdersType__OrderReference2Assignment_20_1 : ( ruleOrderRef2 ) ;
    public final void rule__OrdersType__OrderReference2Assignment_20_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2540:1: ( ( ruleOrderRef2 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2541:1: ( ruleOrderRef2 )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2541:1: ( ruleOrderRef2 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2542:1: ruleOrderRef2
            {
             before(grammarAccess.getOrdersTypeAccess().getOrderReference2OrderRef2ParserRuleCall_20_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrderRef2_in_rule__OrdersType__OrderReference2Assignment_20_14964);
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


    // $ANTLR start "rule__OrderDetail1__NameAssignment_2"
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2551:1: rule__OrderDetail1__NameAssignment_2 : ( ruleID0 ) ;
    public final void rule__OrderDetail1__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2555:1: ( ( ruleID0 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2556:1: ( ruleID0 )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2556:1: ( ruleID0 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2557:1: ruleID0
            {
             before(grammarAccess.getOrderDetail1Access().getNameID0ParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleID0_in_rule__OrderDetail1__NameAssignment_24995);
            ruleID0();

            state._fsp--;

             after(grammarAccess.getOrderDetail1Access().getNameID0ParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail1__NameAssignment_2"


    // $ANTLR start "rule__OrderDetail1__CustomerAddressAssignment_4_1"
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2566:1: rule__OrderDetail1__CustomerAddressAssignment_4_1 : ( ruleString0 ) ;
    public final void rule__OrderDetail1__CustomerAddressAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2570:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2571:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2571:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2572:1: ruleString0
            {
             before(grammarAccess.getOrderDetail1Access().getCustomerAddressString0ParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__OrderDetail1__CustomerAddressAssignment_4_15026);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2581:1: rule__OrderDetail1__CustomerContactAssignment_5_1 : ( ruleString0 ) ;
    public final void rule__OrderDetail1__CustomerContactAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2585:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2586:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2586:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2587:1: ruleString0
            {
             before(grammarAccess.getOrderDetail1Access().getCustomerContactString0ParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__OrderDetail1__CustomerContactAssignment_5_15057);
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
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2596:1: rule__OrderDetail1__CustomerNameAssignment_6_1 : ( ruleString0 ) ;
    public final void rule__OrderDetail1__CustomerNameAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2600:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2601:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2601:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2602:1: ruleString0
            {
             before(grammarAccess.getOrderDetail1Access().getCustomerNameString0ParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__OrderDetail1__CustomerNameAssignment_6_15088);
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


    // $ANTLR start "rule__OrderDetail2__NameAssignment_2"
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2611:1: rule__OrderDetail2__NameAssignment_2 : ( ruleID0 ) ;
    public final void rule__OrderDetail2__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2615:1: ( ( ruleID0 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2616:1: ( ruleID0 )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2616:1: ( ruleID0 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2617:1: ruleID0
            {
             before(grammarAccess.getOrderDetail2Access().getNameID0ParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleID0_in_rule__OrderDetail2__NameAssignment_25119);
            ruleID0();

            state._fsp--;

             after(grammarAccess.getOrderDetail2Access().getNameID0ParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDetail2__NameAssignment_2"


    // $ANTLR start "rule__OrderDetail2__CustomerNameAssignment_4_1"
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2626:1: rule__OrderDetail2__CustomerNameAssignment_4_1 : ( ruleString0 ) ;
    public final void rule__OrderDetail2__CustomerNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2630:1: ( ( ruleString0 ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2631:1: ( ruleString0 )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2631:1: ( ruleString0 )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2632:1: ruleString0
            {
             before(grammarAccess.getOrderDetail2Access().getCustomerNameString0ParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_rule__OrderDetail2__CustomerNameAssignment_4_15150);
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


    // $ANTLR start "rule__OrderRef1__OrderDetail1Assignment_3_1"
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2641:1: rule__OrderRef1__OrderDetail1Assignment_3_1 : ( ( ruleIDREF ) ) ;
    public final void rule__OrderRef1__OrderDetail1Assignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2645:1: ( ( ( ruleIDREF ) ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2646:1: ( ( ruleIDREF ) )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2646:1: ( ( ruleIDREF ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2647:1: ( ruleIDREF )
            {
             before(grammarAccess.getOrderRef1Access().getOrderDetail1OrderDetail1CrossReference_3_1_0()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2648:1: ( ruleIDREF )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2649:1: ruleIDREF
            {
             before(grammarAccess.getOrderRef1Access().getOrderDetail1OrderDetail1IDREFParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleIDREF_in_rule__OrderRef1__OrderDetail1Assignment_3_15185);
            ruleIDREF();

            state._fsp--;

             after(grammarAccess.getOrderRef1Access().getOrderDetail1OrderDetail1IDREFParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getOrderRef1Access().getOrderDetail1OrderDetail1CrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef1__OrderDetail1Assignment_3_1"


    // $ANTLR start "rule__OrderRef2__OrderDetail2Assignment_3_1"
    // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2660:1: rule__OrderRef2__OrderDetail2Assignment_3_1 : ( ( ruleIDREF ) ) ;
    public final void rule__OrderRef2__OrderDetail2Assignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2664:1: ( ( ( ruleIDREF ) ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2665:1: ( ( ruleIDREF ) )
            {
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2665:1: ( ( ruleIDREF ) )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2666:1: ( ruleIDREF )
            {
             before(grammarAccess.getOrderRef2Access().getOrderDetail2OrderDetail2CrossReference_3_1_0()); 
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2667:1: ( ruleIDREF )
            // ../org.xtext.example.mydsl.references.ui/src-gen/org/xtext/example/mydsl/references/ui/contentassist/antlr/internal/InternalMyDsl.g:2668:1: ruleIDREF
            {
             before(grammarAccess.getOrderRef2Access().getOrderDetail2OrderDetail2IDREFParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleIDREF_in_rule__OrderRef2__OrderDetail2Assignment_3_15224);
            ruleIDREF();

            state._fsp--;

             after(grammarAccess.getOrderRef2Access().getOrderDetail2OrderDetail2IDREFParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getOrderRef2Access().getOrderDetail2OrderDetail2CrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderRef2__OrderDetail2Assignment_3_1"

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
        public static final BitSet FOLLOW_RULE_STRING_in_ruleString0394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID0_in_entryRuleID0420 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleID0427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleID0453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIDREF_in_entryRuleIDREF479 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIDREF486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleIDREF512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__0__Impl_in_rule__OrdersType__Group__0545 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__1_in_rule__OrdersType__Group__0548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__OrdersType__Group__0__Impl576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__1__Impl_in_rule__OrdersType__Group__1607 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__2_in_rule__OrdersType__Group__1610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__OrdersType__Group__1__Impl638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__2__Impl_in_rule__OrdersType__Group__2669 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__3_in_rule__OrdersType__Group__2672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__OrdersType__Group__2__Impl700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__3__Impl_in_rule__OrdersType__Group__3731 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__4_in_rule__OrdersType__Group__3734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__OrdersType__Group__3__Impl762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__4__Impl_in_rule__OrdersType__Group__4793 = new BitSet(new long[]{0x0000000000044000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__5_in_rule__OrdersType__Group__4796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Order1Assignment_4_in_rule__OrdersType__Group__4__Impl823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__5__Impl_in_rule__OrdersType__Group__5853 = new BitSet(new long[]{0x0000000000044000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__6_in_rule__OrdersType__Group__5856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_5__0_in_rule__OrdersType__Group__5__Impl883 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__6__Impl_in_rule__OrdersType__Group__6914 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__7_in_rule__OrdersType__Group__6917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__OrdersType__Group__6__Impl945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__7__Impl_in_rule__OrdersType__Group__7976 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__8_in_rule__OrdersType__Group__7979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__OrdersType__Group__7__Impl1007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__8__Impl_in_rule__OrdersType__Group__81038 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__9_in_rule__OrdersType__Group__81041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__OrdersType__Group__8__Impl1069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__9__Impl_in_rule__OrdersType__Group__91100 = new BitSet(new long[]{0x0000000000044000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__10_in_rule__OrdersType__Group__91103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Order2Assignment_9_in_rule__OrdersType__Group__9__Impl1130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__10__Impl_in_rule__OrdersType__Group__101160 = new BitSet(new long[]{0x0000000000044000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__11_in_rule__OrdersType__Group__101163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_10__0_in_rule__OrdersType__Group__10__Impl1190 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__11__Impl_in_rule__OrdersType__Group__111221 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__12_in_rule__OrdersType__Group__111224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__OrdersType__Group__11__Impl1252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__12__Impl_in_rule__OrdersType__Group__121283 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__13_in_rule__OrdersType__Group__121286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__OrdersType__Group__12__Impl1314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__13__Impl_in_rule__OrdersType__Group__131345 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__14_in_rule__OrdersType__Group__131348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__OrdersType__Group__13__Impl1376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__14__Impl_in_rule__OrdersType__Group__141407 = new BitSet(new long[]{0x0000000000044000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__15_in_rule__OrdersType__Group__141410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__OrderReference1Assignment_14_in_rule__OrdersType__Group__14__Impl1437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__15__Impl_in_rule__OrdersType__Group__151467 = new BitSet(new long[]{0x0000000000044000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__16_in_rule__OrdersType__Group__151470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_15__0_in_rule__OrdersType__Group__15__Impl1497 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__16__Impl_in_rule__OrdersType__Group__161528 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__17_in_rule__OrdersType__Group__161531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__OrdersType__Group__16__Impl1559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__17__Impl_in_rule__OrdersType__Group__171590 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__18_in_rule__OrdersType__Group__171593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__OrdersType__Group__17__Impl1621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__18__Impl_in_rule__OrdersType__Group__181652 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__19_in_rule__OrdersType__Group__181655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__OrdersType__Group__18__Impl1683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__19__Impl_in_rule__OrdersType__Group__191714 = new BitSet(new long[]{0x0000000000044000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__20_in_rule__OrdersType__Group__191717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__OrderReference2Assignment_19_in_rule__OrdersType__Group__19__Impl1744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__20__Impl_in_rule__OrdersType__Group__201774 = new BitSet(new long[]{0x0000000000044000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__21_in_rule__OrdersType__Group__201777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_20__0_in_rule__OrdersType__Group__20__Impl1804 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__21__Impl_in_rule__OrdersType__Group__211835 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__22_in_rule__OrdersType__Group__211838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__OrdersType__Group__21__Impl1866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group__22__Impl_in_rule__OrdersType__Group__221897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__OrdersType__Group__22__Impl1925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_5__0__Impl_in_rule__OrdersType__Group_5__02002 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_5__1_in_rule__OrdersType__Group_5__02005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__OrdersType__Group_5__0__Impl2033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_5__1__Impl_in_rule__OrdersType__Group_5__12064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Order1Assignment_5_1_in_rule__OrdersType__Group_5__1__Impl2091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_10__0__Impl_in_rule__OrdersType__Group_10__02125 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_10__1_in_rule__OrdersType__Group_10__02128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__OrdersType__Group_10__0__Impl2156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_10__1__Impl_in_rule__OrdersType__Group_10__12187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Order2Assignment_10_1_in_rule__OrdersType__Group_10__1__Impl2214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_15__0__Impl_in_rule__OrdersType__Group_15__02248 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_15__1_in_rule__OrdersType__Group_15__02251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__OrdersType__Group_15__0__Impl2279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_15__1__Impl_in_rule__OrdersType__Group_15__12310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__OrderReference1Assignment_15_1_in_rule__OrdersType__Group_15__1__Impl2337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_20__0__Impl_in_rule__OrdersType__Group_20__02371 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_20__1_in_rule__OrdersType__Group_20__02374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__OrdersType__Group_20__0__Impl2402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__Group_20__1__Impl_in_rule__OrdersType__Group_20__12433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrdersType__OrderReference2Assignment_20_1_in_rule__OrdersType__Group_20__1__Impl2460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__0__Impl_in_rule__OrderDetail1__Group__02494 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__1_in_rule__OrderDetail1__Group__02497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__1__Impl_in_rule__OrderDetail1__Group__12555 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__2_in_rule__OrderDetail1__Group__12558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__OrderDetail1__Group__1__Impl2586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__2__Impl_in_rule__OrderDetail1__Group__22617 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__3_in_rule__OrderDetail1__Group__22620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__NameAssignment_2_in_rule__OrderDetail1__Group__2__Impl2647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__3__Impl_in_rule__OrderDetail1__Group__32677 = new BitSet(new long[]{0x0000000000704000L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__4_in_rule__OrderDetail1__Group__32680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__OrderDetail1__Group__3__Impl2708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__4__Impl_in_rule__OrderDetail1__Group__42739 = new BitSet(new long[]{0x0000000000704000L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__5_in_rule__OrderDetail1__Group__42742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_4__0_in_rule__OrderDetail1__Group__4__Impl2769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__5__Impl_in_rule__OrderDetail1__Group__52800 = new BitSet(new long[]{0x0000000000704000L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__6_in_rule__OrderDetail1__Group__52803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_5__0_in_rule__OrderDetail1__Group__5__Impl2830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__6__Impl_in_rule__OrderDetail1__Group__62861 = new BitSet(new long[]{0x0000000000704000L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__7_in_rule__OrderDetail1__Group__62864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_6__0_in_rule__OrderDetail1__Group__6__Impl2891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group__7__Impl_in_rule__OrderDetail1__Group__72922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__OrderDetail1__Group__7__Impl2950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_4__0__Impl_in_rule__OrderDetail1__Group_4__02997 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_4__1_in_rule__OrderDetail1__Group_4__03000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__OrderDetail1__Group_4__0__Impl3028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_4__1__Impl_in_rule__OrderDetail1__Group_4__13059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__CustomerAddressAssignment_4_1_in_rule__OrderDetail1__Group_4__1__Impl3086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_5__0__Impl_in_rule__OrderDetail1__Group_5__03120 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_5__1_in_rule__OrderDetail1__Group_5__03123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__OrderDetail1__Group_5__0__Impl3151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_5__1__Impl_in_rule__OrderDetail1__Group_5__13182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__CustomerContactAssignment_5_1_in_rule__OrderDetail1__Group_5__1__Impl3209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_6__0__Impl_in_rule__OrderDetail1__Group_6__03243 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_6__1_in_rule__OrderDetail1__Group_6__03246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__OrderDetail1__Group_6__0__Impl3274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__Group_6__1__Impl_in_rule__OrderDetail1__Group_6__13305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail1__CustomerNameAssignment_6_1_in_rule__OrderDetail1__Group_6__1__Impl3332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__0__Impl_in_rule__OrderDetail2__Group__03366 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__1_in_rule__OrderDetail2__Group__03369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__1__Impl_in_rule__OrderDetail2__Group__13427 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__2_in_rule__OrderDetail2__Group__13430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__OrderDetail2__Group__1__Impl3458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__2__Impl_in_rule__OrderDetail2__Group__23489 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__3_in_rule__OrderDetail2__Group__23492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__NameAssignment_2_in_rule__OrderDetail2__Group__2__Impl3519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__3__Impl_in_rule__OrderDetail2__Group__33549 = new BitSet(new long[]{0x0000000000404000L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__4_in_rule__OrderDetail2__Group__33552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__OrderDetail2__Group__3__Impl3580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__4__Impl_in_rule__OrderDetail2__Group__43611 = new BitSet(new long[]{0x0000000000404000L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__5_in_rule__OrderDetail2__Group__43614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group_4__0_in_rule__OrderDetail2__Group__4__Impl3641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group__5__Impl_in_rule__OrderDetail2__Group__53672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__OrderDetail2__Group__5__Impl3700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group_4__0__Impl_in_rule__OrderDetail2__Group_4__03743 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group_4__1_in_rule__OrderDetail2__Group_4__03746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__OrderDetail2__Group_4__0__Impl3774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__Group_4__1__Impl_in_rule__OrderDetail2__Group_4__13805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderDetail2__CustomerNameAssignment_4_1_in_rule__OrderDetail2__Group_4__1__Impl3832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group__0__Impl_in_rule__OrderRef1__Group__03866 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group__1_in_rule__OrderRef1__Group__03869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group__1__Impl_in_rule__OrderRef1__Group__13927 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group__2_in_rule__OrderRef1__Group__13930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__OrderRef1__Group__1__Impl3958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group__2__Impl_in_rule__OrderRef1__Group__23989 = new BitSet(new long[]{0x0000000002004000L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group__3_in_rule__OrderRef1__Group__23992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__OrderRef1__Group__2__Impl4020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group__3__Impl_in_rule__OrderRef1__Group__34051 = new BitSet(new long[]{0x0000000002004000L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group__4_in_rule__OrderRef1__Group__34054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group_3__0_in_rule__OrderRef1__Group__3__Impl4081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group__4__Impl_in_rule__OrderRef1__Group__44112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__OrderRef1__Group__4__Impl4140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group_3__0__Impl_in_rule__OrderRef1__Group_3__04181 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group_3__1_in_rule__OrderRef1__Group_3__04184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__OrderRef1__Group_3__0__Impl4212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef1__Group_3__1__Impl_in_rule__OrderRef1__Group_3__14243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef1__OrderDetail1Assignment_3_1_in_rule__OrderRef1__Group_3__1__Impl4270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group__0__Impl_in_rule__OrderRef2__Group__04304 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group__1_in_rule__OrderRef2__Group__04307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group__1__Impl_in_rule__OrderRef2__Group__14365 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group__2_in_rule__OrderRef2__Group__14368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__OrderRef2__Group__1__Impl4396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group__2__Impl_in_rule__OrderRef2__Group__24427 = new BitSet(new long[]{0x0000000008004000L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group__3_in_rule__OrderRef2__Group__24430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__OrderRef2__Group__2__Impl4458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group__3__Impl_in_rule__OrderRef2__Group__34489 = new BitSet(new long[]{0x0000000008004000L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group__4_in_rule__OrderRef2__Group__34492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group_3__0_in_rule__OrderRef2__Group__3__Impl4519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group__4__Impl_in_rule__OrderRef2__Group__44550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__OrderRef2__Group__4__Impl4578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group_3__0__Impl_in_rule__OrderRef2__Group_3__04619 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group_3__1_in_rule__OrderRef2__Group_3__04622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__OrderRef2__Group_3__0__Impl4650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef2__Group_3__1__Impl_in_rule__OrderRef2__Group_3__14681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrderRef2__OrderDetail2Assignment_3_1_in_rule__OrderRef2__Group_3__1__Impl4708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderDetail1_in_rule__OrdersType__Order1Assignment_44747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderDetail1_in_rule__OrdersType__Order1Assignment_5_14778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderDetail2_in_rule__OrdersType__Order2Assignment_94809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderDetail2_in_rule__OrdersType__Order2Assignment_10_14840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderRef1_in_rule__OrdersType__OrderReference1Assignment_144871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderRef1_in_rule__OrdersType__OrderReference1Assignment_15_14902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderRef2_in_rule__OrdersType__OrderReference2Assignment_194933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrderRef2_in_rule__OrdersType__OrderReference2Assignment_20_14964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID0_in_rule__OrderDetail1__NameAssignment_24995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__OrderDetail1__CustomerAddressAssignment_4_15026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__OrderDetail1__CustomerContactAssignment_5_15057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__OrderDetail1__CustomerNameAssignment_6_15088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID0_in_rule__OrderDetail2__NameAssignment_25119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_rule__OrderDetail2__CustomerNameAssignment_4_15150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIDREF_in_rule__OrderRef1__OrderDetail1Assignment_3_15185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIDREF_in_rule__OrderRef2__OrderDetail2Assignment_3_15224 = new BitSet(new long[]{0x0000000000000002L});
    }


}