package org.xtext.example.mydsl.recursion.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.recursion.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:76:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleElement ) )+ ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:79:28: ( ( (lv_elements_0_0= ruleElement ) )+ )
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:80:1: ( (lv_elements_0_0= ruleElement ) )+
            {
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:80:1: ( (lv_elements_0_0= ruleElement ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_STRING||LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:81:1: (lv_elements_0_0= ruleElement )
            	    {
            	    // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:81:1: (lv_elements_0_0= ruleElement )
            	    // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:82:3: lv_elements_0_0= ruleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElement_in_ruleModel130);
            	    lv_elements_0_0=ruleElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"Element");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleElement"
    // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:106:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:107:2: (iv_ruleElement= ruleElement EOF )
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:108:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement166);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement176); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:115:1: ruleElement returns [EObject current=null] : (this_Pair_0= rulePair | this_Pairs_1= rulePairs ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Pair_0 = null;

        EObject this_Pairs_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:118:28: ( (this_Pair_0= rulePair | this_Pairs_1= rulePairs ) )
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:119:1: (this_Pair_0= rulePair | this_Pairs_1= rulePairs )
            {
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:119:1: (this_Pair_0= rulePair | this_Pairs_1= rulePairs )
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
                    // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:120:5: this_Pair_0= rulePair
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getPairParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePair_in_ruleElement223);
                    this_Pair_0=rulePair();

                    state._fsp--;

                     
                            current = this_Pair_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:130:5: this_Pairs_1= rulePairs
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getPairsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePairs_in_ruleElement250);
                    this_Pairs_1=rulePairs();

                    state._fsp--;

                     
                            current = this_Pairs_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRulePair"
    // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:146:1: entryRulePair returns [EObject current=null] : iv_rulePair= rulePair EOF ;
    public final EObject entryRulePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePair = null;


        try {
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:147:2: (iv_rulePair= rulePair EOF )
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:148:2: iv_rulePair= rulePair EOF
            {
             newCompositeNode(grammarAccess.getPairRule()); 
            pushFollow(FOLLOW_rulePair_in_entryRulePair285);
            iv_rulePair=rulePair();

            state._fsp--;

             current =iv_rulePair; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePair295); 

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
    // $ANTLR end "entryRulePair"


    // $ANTLR start "rulePair"
    // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:155:1: rulePair returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePair() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:158:28: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:159:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:159:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:159:2: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:159:2: ( (lv_key_0_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:160:1: (lv_key_0_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:160:1: (lv_key_0_0= RULE_STRING )
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:161:3: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePair337); 

            			newLeafNode(lv_key_0_0, grammarAccess.getPairAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPairRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"key",
                    		lv_key_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_rulePair354); 

                	newLeafNode(otherlv_1, grammarAccess.getPairAccess().getColonKeyword_1());
                
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:181:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:182:1: (lv_value_2_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:182:1: (lv_value_2_0= RULE_STRING )
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:183:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePair371); 

            			newLeafNode(lv_value_2_0, grammarAccess.getPairAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPairRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"STRING");
            	    

            }


            }


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
    // $ANTLR end "rulePair"


    // $ANTLR start "entryRulePairs"
    // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:207:1: entryRulePairs returns [EObject current=null] : iv_rulePairs= rulePairs EOF ;
    public final EObject entryRulePairs() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePairs = null;


        try {
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:208:2: (iv_rulePairs= rulePairs EOF )
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:209:2: iv_rulePairs= rulePairs EOF
            {
             newCompositeNode(grammarAccess.getPairsRule()); 
            pushFollow(FOLLOW_rulePairs_in_entryRulePairs412);
            iv_rulePairs=rulePairs();

            state._fsp--;

             current =iv_rulePairs; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePairs422); 

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
    // $ANTLR end "entryRulePairs"


    // $ANTLR start "rulePairs"
    // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:216:1: rulePairs returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_elements_2_0= ruleElement ) )* otherlv_3= ')' ) ;
    public final EObject rulePairs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:219:28: ( ( () otherlv_1= '(' ( (lv_elements_2_0= ruleElement ) )* otherlv_3= ')' ) )
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:220:1: ( () otherlv_1= '(' ( (lv_elements_2_0= ruleElement ) )* otherlv_3= ')' )
            {
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:220:1: ( () otherlv_1= '(' ( (lv_elements_2_0= ruleElement ) )* otherlv_3= ')' )
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:220:2: () otherlv_1= '(' ( (lv_elements_2_0= ruleElement ) )* otherlv_3= ')'
            {
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:220:2: ()
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:221:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPairsAccess().getPairsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_rulePairs468); 

                	newLeafNode(otherlv_1, grammarAccess.getPairsAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:230:1: ( (lv_elements_2_0= ruleElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING||LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:231:1: (lv_elements_2_0= ruleElement )
            	    {
            	    // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:231:1: (lv_elements_2_0= ruleElement )
            	    // ../org.xtext.example.mydsl.recursion/src-gen/org/xtext/example/mydsl/recursion/parser/antlr/internal/InternalMyDsl.g:232:3: lv_elements_2_0= ruleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPairsAccess().getElementsElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElement_in_rulePairs489);
            	    lv_elements_2_0=ruleElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPairsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_2_0, 
            	            		"Element");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_rulePairs502); 

                	newLeafNode(otherlv_3, grammarAccess.getPairsAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "rulePairs"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_ruleModel130 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePair_in_ruleElement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePairs_in_ruleElement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePair_in_entryRulePair285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePair295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePair337 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_rulePair354 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePair371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePairs_in_entryRulePairs412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePairs422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePairs468 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_ruleElement_in_rulePairs489 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_13_in_rulePairs502 = new BitSet(new long[]{0x0000000000000002L});

}