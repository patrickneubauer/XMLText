package org.xtext.example.mydsl.recursion.ui.contentassist.antlr.internal; 

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
import org.xtext.example.mydsl.recursion.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'('", "')'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
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




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleModel EOF )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleModel : ( ( ( rule__Model__ElementsAssignment ) ) ( ( rule__Model__ElementsAssignment )* ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( ( rule__Model__ElementsAssignment ) ) ( ( rule__Model__ElementsAssignment )* ) ) )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( ( rule__Model__ElementsAssignment ) ) ( ( rule__Model__ElementsAssignment )* ) )
            {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( ( rule__Model__ElementsAssignment ) ) ( ( rule__Model__ElementsAssignment )* ) )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( ( rule__Model__ElementsAssignment ) ) ( ( rule__Model__ElementsAssignment )* )
            {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( ( rule__Model__ElementsAssignment ) )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__Model__ElementsAssignment )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:77:1: ( rule__Model__ElementsAssignment )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:77:2: rule__Model__ElementsAssignment
            {
            pushFollow(FOLLOW_rule__Model__ElementsAssignment_in_ruleModel96);
            rule__Model__ElementsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

            }

            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:80:1: ( ( rule__Model__ElementsAssignment )* )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:81:1: ( rule__Model__ElementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:82:1: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_STRING||LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:82:2: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__ElementsAssignment_in_ruleModel108);
            	    rule__Model__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleElement"
    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:95:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:96:1: ( ruleElement EOF )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement138);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement145); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:108:2: ( ( ( rule__Element__Alternatives ) ) )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:109:1: ( ( rule__Element__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:109:1: ( ( rule__Element__Alternatives ) )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:110:1: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:111:1: ( rule__Element__Alternatives )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:111:2: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_rule__Element__Alternatives_in_ruleElement171);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRulePair"
    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:123:1: entryRulePair : rulePair EOF ;
    public final void entryRulePair() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:124:1: ( rulePair EOF )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: rulePair EOF
            {
             before(grammarAccess.getPairRule()); 
            pushFollow(FOLLOW_rulePair_in_entryRulePair198);
            rulePair();

            state._fsp--;

             after(grammarAccess.getPairRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePair205); 

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
    // $ANTLR end "entryRulePair"


    // $ANTLR start "rulePair"
    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: rulePair : ( ( rule__Pair__Group__0 ) ) ;
    public final void rulePair() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:136:2: ( ( ( rule__Pair__Group__0 ) ) )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:137:1: ( ( rule__Pair__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:137:1: ( ( rule__Pair__Group__0 ) )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:138:1: ( rule__Pair__Group__0 )
            {
             before(grammarAccess.getPairAccess().getGroup()); 
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:139:1: ( rule__Pair__Group__0 )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:139:2: rule__Pair__Group__0
            {
            pushFollow(FOLLOW_rule__Pair__Group__0_in_rulePair231);
            rule__Pair__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPairAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePair"


    // $ANTLR start "entryRulePairs"
    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:151:1: entryRulePairs : rulePairs EOF ;
    public final void entryRulePairs() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:152:1: ( rulePairs EOF )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: rulePairs EOF
            {
             before(grammarAccess.getPairsRule()); 
            pushFollow(FOLLOW_rulePairs_in_entryRulePairs258);
            rulePairs();

            state._fsp--;

             after(grammarAccess.getPairsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePairs265); 

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
    // $ANTLR end "entryRulePairs"


    // $ANTLR start "rulePairs"
    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: rulePairs : ( ( rule__Pairs__Group__0 ) ) ;
    public final void rulePairs() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:164:2: ( ( ( rule__Pairs__Group__0 ) ) )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:165:1: ( ( rule__Pairs__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:165:1: ( ( rule__Pairs__Group__0 ) )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:166:1: ( rule__Pairs__Group__0 )
            {
             before(grammarAccess.getPairsAccess().getGroup()); 
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:167:1: ( rule__Pairs__Group__0 )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:167:2: rule__Pairs__Group__0
            {
            pushFollow(FOLLOW_rule__Pairs__Group__0_in_rulePairs291);
            rule__Pairs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPairsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePairs"


    // $ANTLR start "rule__Element__Alternatives"
    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:179:1: rule__Element__Alternatives : ( ( rulePair ) | ( rulePairs ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:183:1: ( ( rulePair ) | ( rulePairs ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:184:1: ( rulePair )
                    {
                    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:184:1: ( rulePair )
                    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:185:1: rulePair
                    {
                     before(grammarAccess.getElementAccess().getPairParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePair_in_rule__Element__Alternatives327);
                    rulePair();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getPairParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:190:6: ( rulePairs )
                    {
                    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:190:6: ( rulePairs )
                    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:191:1: rulePairs
                    {
                     before(grammarAccess.getElementAccess().getPairsParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePairs_in_rule__Element__Alternatives344);
                    rulePairs();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getPairsParserRuleCall_1()); 

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Pair__Group__0"
    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:203:1: rule__Pair__Group__0 : rule__Pair__Group__0__Impl rule__Pair__Group__1 ;
    public final void rule__Pair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:207:1: ( rule__Pair__Group__0__Impl rule__Pair__Group__1 )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:208:2: rule__Pair__Group__0__Impl rule__Pair__Group__1
            {
            pushFollow(FOLLOW_rule__Pair__Group__0__Impl_in_rule__Pair__Group__0374);
            rule__Pair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pair__Group__1_in_rule__Pair__Group__0377);
            rule__Pair__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pair__Group__0"


    // $ANTLR start "rule__Pair__Group__0__Impl"
    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: rule__Pair__Group__0__Impl : ( ( rule__Pair__KeyAssignment_0 ) ) ;
    public final void rule__Pair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:219:1: ( ( ( rule__Pair__KeyAssignment_0 ) ) )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:220:1: ( ( rule__Pair__KeyAssignment_0 ) )
            {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:220:1: ( ( rule__Pair__KeyAssignment_0 ) )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:221:1: ( rule__Pair__KeyAssignment_0 )
            {
             before(grammarAccess.getPairAccess().getKeyAssignment_0()); 
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:222:1: ( rule__Pair__KeyAssignment_0 )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:222:2: rule__Pair__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__Pair__KeyAssignment_0_in_rule__Pair__Group__0__Impl404);
            rule__Pair__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPairAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pair__Group__0__Impl"


    // $ANTLR start "rule__Pair__Group__1"
    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:232:1: rule__Pair__Group__1 : rule__Pair__Group__1__Impl rule__Pair__Group__2 ;
    public final void rule__Pair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:236:1: ( rule__Pair__Group__1__Impl rule__Pair__Group__2 )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:237:2: rule__Pair__Group__1__Impl rule__Pair__Group__2
            {
            pushFollow(FOLLOW_rule__Pair__Group__1__Impl_in_rule__Pair__Group__1434);
            rule__Pair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pair__Group__2_in_rule__Pair__Group__1437);
            rule__Pair__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pair__Group__1"


    // $ANTLR start "rule__Pair__Group__1__Impl"
    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: rule__Pair__Group__1__Impl : ( ':' ) ;
    public final void rule__Pair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:248:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:249:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:249:1: ( ':' )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:250:1: ':'
            {
             before(grammarAccess.getPairAccess().getColonKeyword_1()); 
            match(input,11,FOLLOW_11_in_rule__Pair__Group__1__Impl465); 
             after(grammarAccess.getPairAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pair__Group__1__Impl"


    // $ANTLR start "rule__Pair__Group__2"
    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:263:1: rule__Pair__Group__2 : rule__Pair__Group__2__Impl ;
    public final void rule__Pair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:267:1: ( rule__Pair__Group__2__Impl )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:268:2: rule__Pair__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Pair__Group__2__Impl_in_rule__Pair__Group__2496);
            rule__Pair__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pair__Group__2"


    // $ANTLR start "rule__Pair__Group__2__Impl"
    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:274:1: rule__Pair__Group__2__Impl : ( ( rule__Pair__ValueAssignment_2 ) ) ;
    public final void rule__Pair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:278:1: ( ( ( rule__Pair__ValueAssignment_2 ) ) )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:279:1: ( ( rule__Pair__ValueAssignment_2 ) )
            {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:279:1: ( ( rule__Pair__ValueAssignment_2 ) )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:280:1: ( rule__Pair__ValueAssignment_2 )
            {
             before(grammarAccess.getPairAccess().getValueAssignment_2()); 
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:281:1: ( rule__Pair__ValueAssignment_2 )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:281:2: rule__Pair__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Pair__ValueAssignment_2_in_rule__Pair__Group__2__Impl523);
            rule__Pair__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPairAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pair__Group__2__Impl"


    // $ANTLR start "rule__Pairs__Group__0"
    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:297:1: rule__Pairs__Group__0 : rule__Pairs__Group__0__Impl rule__Pairs__Group__1 ;
    public final void rule__Pairs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:301:1: ( rule__Pairs__Group__0__Impl rule__Pairs__Group__1 )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:302:2: rule__Pairs__Group__0__Impl rule__Pairs__Group__1
            {
            pushFollow(FOLLOW_rule__Pairs__Group__0__Impl_in_rule__Pairs__Group__0559);
            rule__Pairs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pairs__Group__1_in_rule__Pairs__Group__0562);
            rule__Pairs__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pairs__Group__0"


    // $ANTLR start "rule__Pairs__Group__0__Impl"
    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:309:1: rule__Pairs__Group__0__Impl : ( () ) ;
    public final void rule__Pairs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:313:1: ( ( () ) )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:314:1: ( () )
            {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:314:1: ( () )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:315:1: ()
            {
             before(grammarAccess.getPairsAccess().getPairsAction_0()); 
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:316:1: ()
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:318:1: 
            {
            }

             after(grammarAccess.getPairsAccess().getPairsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pairs__Group__0__Impl"


    // $ANTLR start "rule__Pairs__Group__1"
    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:328:1: rule__Pairs__Group__1 : rule__Pairs__Group__1__Impl rule__Pairs__Group__2 ;
    public final void rule__Pairs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:332:1: ( rule__Pairs__Group__1__Impl rule__Pairs__Group__2 )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:333:2: rule__Pairs__Group__1__Impl rule__Pairs__Group__2
            {
            pushFollow(FOLLOW_rule__Pairs__Group__1__Impl_in_rule__Pairs__Group__1620);
            rule__Pairs__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pairs__Group__2_in_rule__Pairs__Group__1623);
            rule__Pairs__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pairs__Group__1"


    // $ANTLR start "rule__Pairs__Group__1__Impl"
    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:340:1: rule__Pairs__Group__1__Impl : ( '(' ) ;
    public final void rule__Pairs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:344:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:345:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:345:1: ( '(' )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:346:1: '('
            {
             before(grammarAccess.getPairsAccess().getLeftParenthesisKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__Pairs__Group__1__Impl651); 
             after(grammarAccess.getPairsAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pairs__Group__1__Impl"


    // $ANTLR start "rule__Pairs__Group__2"
    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:359:1: rule__Pairs__Group__2 : rule__Pairs__Group__2__Impl rule__Pairs__Group__3 ;
    public final void rule__Pairs__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:363:1: ( rule__Pairs__Group__2__Impl rule__Pairs__Group__3 )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:364:2: rule__Pairs__Group__2__Impl rule__Pairs__Group__3
            {
            pushFollow(FOLLOW_rule__Pairs__Group__2__Impl_in_rule__Pairs__Group__2682);
            rule__Pairs__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pairs__Group__3_in_rule__Pairs__Group__2685);
            rule__Pairs__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pairs__Group__2"


    // $ANTLR start "rule__Pairs__Group__2__Impl"
    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:371:1: rule__Pairs__Group__2__Impl : ( ( rule__Pairs__ElementsAssignment_2 )* ) ;
    public final void rule__Pairs__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:375:1: ( ( ( rule__Pairs__ElementsAssignment_2 )* ) )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:376:1: ( ( rule__Pairs__ElementsAssignment_2 )* )
            {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:376:1: ( ( rule__Pairs__ElementsAssignment_2 )* )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:377:1: ( rule__Pairs__ElementsAssignment_2 )*
            {
             before(grammarAccess.getPairsAccess().getElementsAssignment_2()); 
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:378:1: ( rule__Pairs__ElementsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING||LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:378:2: rule__Pairs__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Pairs__ElementsAssignment_2_in_rule__Pairs__Group__2__Impl712);
            	    rule__Pairs__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getPairsAccess().getElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pairs__Group__2__Impl"


    // $ANTLR start "rule__Pairs__Group__3"
    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:388:1: rule__Pairs__Group__3 : rule__Pairs__Group__3__Impl ;
    public final void rule__Pairs__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:392:1: ( rule__Pairs__Group__3__Impl )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:393:2: rule__Pairs__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Pairs__Group__3__Impl_in_rule__Pairs__Group__3743);
            rule__Pairs__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pairs__Group__3"


    // $ANTLR start "rule__Pairs__Group__3__Impl"
    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:399:1: rule__Pairs__Group__3__Impl : ( ')' ) ;
    public final void rule__Pairs__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:403:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:404:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:404:1: ( ')' )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:405:1: ')'
            {
             before(grammarAccess.getPairsAccess().getRightParenthesisKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Pairs__Group__3__Impl771); 
             after(grammarAccess.getPairsAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pairs__Group__3__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:427:1: rule__Model__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:431:1: ( ( ruleElement ) )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:432:1: ( ruleElement )
            {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:432:1: ( ruleElement )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:433:1: ruleElement
            {
             before(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__Model__ElementsAssignment815);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__Pair__KeyAssignment_0"
    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:442:1: rule__Pair__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Pair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:446:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:447:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:447:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:448:1: RULE_STRING
            {
             before(grammarAccess.getPairAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Pair__KeyAssignment_0846); 
             after(grammarAccess.getPairAccess().getKeySTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pair__KeyAssignment_0"


    // $ANTLR start "rule__Pair__ValueAssignment_2"
    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:457:1: rule__Pair__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Pair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:461:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:462:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:462:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:463:1: RULE_STRING
            {
             before(grammarAccess.getPairAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Pair__ValueAssignment_2877); 
             after(grammarAccess.getPairAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pair__ValueAssignment_2"


    // $ANTLR start "rule__Pairs__ElementsAssignment_2"
    // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:472:1: rule__Pairs__ElementsAssignment_2 : ( ruleElement ) ;
    public final void rule__Pairs__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:476:1: ( ( ruleElement ) )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:477:1: ( ruleElement )
            {
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:477:1: ( ruleElement )
            // ../org.xtext.example.mydsl.recursion.ui/src-gen/org/xtext/example/mydsl/recursion/ui/contentassist/antlr/internal/InternalMyDsl.g:478:1: ruleElement
            {
             before(grammarAccess.getPairsAccess().getElementsElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__Pairs__ElementsAssignment_2908);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getPairsAccess().getElementsElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pairs__ElementsAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ElementsAssignment_in_ruleModel96 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_rule__Model__ElementsAssignment_in_ruleModel108 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Alternatives_in_ruleElement171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePair_in_entryRulePair198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePair205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__Group__0_in_rulePair231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePairs_in_entryRulePairs258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePairs265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pairs__Group__0_in_rulePairs291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePair_in_rule__Element__Alternatives327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePairs_in_rule__Element__Alternatives344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__Group__0__Impl_in_rule__Pair__Group__0374 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Pair__Group__1_in_rule__Pair__Group__0377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__KeyAssignment_0_in_rule__Pair__Group__0__Impl404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__Group__1__Impl_in_rule__Pair__Group__1434 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Pair__Group__2_in_rule__Pair__Group__1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Pair__Group__1__Impl465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__Group__2__Impl_in_rule__Pair__Group__2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pair__ValueAssignment_2_in_rule__Pair__Group__2__Impl523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pairs__Group__0__Impl_in_rule__Pairs__Group__0559 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__Pairs__Group__1_in_rule__Pairs__Group__0562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pairs__Group__1__Impl_in_rule__Pairs__Group__1620 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_rule__Pairs__Group__2_in_rule__Pairs__Group__1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Pairs__Group__1__Impl651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pairs__Group__2__Impl_in_rule__Pairs__Group__2682 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_rule__Pairs__Group__3_in_rule__Pairs__Group__2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pairs__ElementsAssignment_2_in_rule__Pairs__Group__2__Impl712 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_rule__Pairs__Group__3__Impl_in_rule__Pairs__Group__3743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Pairs__Group__3__Impl771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Model__ElementsAssignment815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Pair__KeyAssignment_0846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Pair__ValueAssignment_2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Pairs__ElementsAssignment_2908 = new BitSet(new long[]{0x0000000000000002L});

}