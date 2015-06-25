package org.xtext.example.mydsl.group.unchanged.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.group.unchanged.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RootElementType'", "'{'", "'element1'", "'element2'", "'element3'", "'}'", "'Element1'", "'Element2'", "'modelGroupElement1'", "','", "'modelGroupElement2'", "'modelGroupElement3'", "'Element3'", "'repeatableElement1'", "'repeatableElement2'", "'repeatableElement3'", "'String'"
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
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "RootElementType";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleRootElementType"
    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleRootElementType returns [EObject current=null] : iv_ruleRootElementType= ruleRootElementType EOF ;
    public final EObject entryRuleRootElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootElementType = null;


        try {
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleRootElementType= ruleRootElementType EOF )
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleRootElementType= ruleRootElementType EOF
            {
             newCompositeNode(grammarAccess.getRootElementTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRootElementType_in_entryRuleRootElementType75);
            iv_ruleRootElementType=ruleRootElementType();

            state._fsp--;

             current =iv_ruleRootElementType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRootElementType85); 

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
    // $ANTLR end "entryRuleRootElementType"


    // $ANTLR start "ruleRootElementType"
    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:76:1: ruleRootElementType returns [EObject current=null] : (otherlv_0= 'RootElementType' otherlv_1= '{' otherlv_2= 'element1' ( (lv_element1_3_0= ruleElement1 ) ) otherlv_4= 'element2' ( (lv_element2_5_0= ruleElement2 ) ) otherlv_6= 'element3' ( (lv_element3_7_0= ruleElement3 ) ) otherlv_8= '}' ) ;
    public final EObject ruleRootElementType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_element1_3_0 = null;

        EObject lv_element2_5_0 = null;

        EObject lv_element3_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:79:28: ( (otherlv_0= 'RootElementType' otherlv_1= '{' otherlv_2= 'element1' ( (lv_element1_3_0= ruleElement1 ) ) otherlv_4= 'element2' ( (lv_element2_5_0= ruleElement2 ) ) otherlv_6= 'element3' ( (lv_element3_7_0= ruleElement3 ) ) otherlv_8= '}' ) )
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'RootElementType' otherlv_1= '{' otherlv_2= 'element1' ( (lv_element1_3_0= ruleElement1 ) ) otherlv_4= 'element2' ( (lv_element2_5_0= ruleElement2 ) ) otherlv_6= 'element3' ( (lv_element3_7_0= ruleElement3 ) ) otherlv_8= '}' )
            {
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'RootElementType' otherlv_1= '{' otherlv_2= 'element1' ( (lv_element1_3_0= ruleElement1 ) ) otherlv_4= 'element2' ( (lv_element2_5_0= ruleElement2 ) ) otherlv_6= 'element3' ( (lv_element3_7_0= ruleElement3 ) ) otherlv_8= '}' )
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:80:3: otherlv_0= 'RootElementType' otherlv_1= '{' otherlv_2= 'element1' ( (lv_element1_3_0= ruleElement1 ) ) otherlv_4= 'element2' ( (lv_element2_5_0= ruleElement2 ) ) otherlv_6= 'element3' ( (lv_element3_7_0= ruleElement3 ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRootElementType122); 

                	newLeafNode(otherlv_0, grammarAccess.getRootElementTypeAccess().getRootElementTypeKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRootElementType134); 

                	newLeafNode(otherlv_1, grammarAccess.getRootElementTypeAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRootElementType146); 

                	newLeafNode(otherlv_2, grammarAccess.getRootElementTypeAccess().getElement1Keyword_2());
                
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:92:1: ( (lv_element1_3_0= ruleElement1 ) )
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:93:1: (lv_element1_3_0= ruleElement1 )
            {
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:93:1: (lv_element1_3_0= ruleElement1 )
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:94:3: lv_element1_3_0= ruleElement1
            {
             
            	        newCompositeNode(grammarAccess.getRootElementTypeAccess().getElement1Element1ParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleElement1_in_ruleRootElementType167);
            lv_element1_3_0=ruleElement1();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRootElementTypeRule());
            	        }
                   		set(
                   			current, 
                   			"element1",
                    		lv_element1_3_0, 
                    		"Element1");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRootElementType179); 

                	newLeafNode(otherlv_4, grammarAccess.getRootElementTypeAccess().getElement2Keyword_4());
                
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:114:1: ( (lv_element2_5_0= ruleElement2 ) )
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:115:1: (lv_element2_5_0= ruleElement2 )
            {
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:115:1: (lv_element2_5_0= ruleElement2 )
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:116:3: lv_element2_5_0= ruleElement2
            {
             
            	        newCompositeNode(grammarAccess.getRootElementTypeAccess().getElement2Element2ParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleElement2_in_ruleRootElementType200);
            lv_element2_5_0=ruleElement2();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRootElementTypeRule());
            	        }
                   		set(
                   			current, 
                   			"element2",
                    		lv_element2_5_0, 
                    		"Element2");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRootElementType212); 

                	newLeafNode(otherlv_6, grammarAccess.getRootElementTypeAccess().getElement3Keyword_6());
                
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:136:1: ( (lv_element3_7_0= ruleElement3 ) )
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:137:1: (lv_element3_7_0= ruleElement3 )
            {
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:137:1: (lv_element3_7_0= ruleElement3 )
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:138:3: lv_element3_7_0= ruleElement3
            {
             
            	        newCompositeNode(grammarAccess.getRootElementTypeAccess().getElement3Element3ParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleElement3_in_ruleRootElementType233);
            lv_element3_7_0=ruleElement3();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRootElementTypeRule());
            	        }
                   		set(
                   			current, 
                   			"element3",
                    		lv_element3_7_0, 
                    		"Element3");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRootElementType245); 

                	newLeafNode(otherlv_8, grammarAccess.getRootElementTypeAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleRootElementType"


    // $ANTLR start "entryRuleElement1"
    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:166:1: entryRuleElement1 returns [EObject current=null] : iv_ruleElement1= ruleElement1 EOF ;
    public final EObject entryRuleElement1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement1 = null;


        try {
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:167:2: (iv_ruleElement1= ruleElement1 EOF )
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:168:2: iv_ruleElement1= ruleElement1 EOF
            {
             newCompositeNode(grammarAccess.getElement1Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement1_in_entryRuleElement1281);
            iv_ruleElement1=ruleElement1();

            state._fsp--;

             current =iv_ruleElement1; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElement1291); 

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
    // $ANTLR end "entryRuleElement1"


    // $ANTLR start "ruleElement1"
    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:175:1: ruleElement1 returns [EObject current=null] : ( () otherlv_1= 'Element1' ) ;
    public final EObject ruleElement1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:178:28: ( ( () otherlv_1= 'Element1' ) )
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:179:1: ( () otherlv_1= 'Element1' )
            {
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:179:1: ( () otherlv_1= 'Element1' )
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:179:2: () otherlv_1= 'Element1'
            {
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:179:2: ()
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:180:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getElement1Access().getElement1Action_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleElement1337); 

                	newLeafNode(otherlv_1, grammarAccess.getElement1Access().getElement1Keyword_1());
                

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
    // $ANTLR end "ruleElement1"


    // $ANTLR start "entryRuleElement2"
    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:197:1: entryRuleElement2 returns [EObject current=null] : iv_ruleElement2= ruleElement2 EOF ;
    public final EObject entryRuleElement2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement2 = null;


        try {
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:198:2: (iv_ruleElement2= ruleElement2 EOF )
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:199:2: iv_ruleElement2= ruleElement2 EOF
            {
             newCompositeNode(grammarAccess.getElement2Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement2_in_entryRuleElement2373);
            iv_ruleElement2=ruleElement2();

            state._fsp--;

             current =iv_ruleElement2; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElement2383); 

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
    // $ANTLR end "entryRuleElement2"


    // $ANTLR start "ruleElement2"
    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:206:1: ruleElement2 returns [EObject current=null] : (otherlv_0= 'Element2' otherlv_1= '{' otherlv_2= 'modelGroupElement1' otherlv_3= '{' ( (lv_modelGroupElement1_4_0= ruleString0 ) ) (otherlv_5= ',' ( (lv_modelGroupElement1_6_0= ruleString0 ) ) )* otherlv_7= '}' otherlv_8= 'modelGroupElement2' ( (lv_modelGroupElement2_9_0= ruleString0 ) ) otherlv_10= 'modelGroupElement3' ( (lv_modelGroupElement3_11_0= ruleString0 ) ) otherlv_12= '}' ) ;
    public final EObject ruleElement2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_modelGroupElement1_4_0 = null;

        AntlrDatatypeRuleToken lv_modelGroupElement1_6_0 = null;

        AntlrDatatypeRuleToken lv_modelGroupElement2_9_0 = null;

        AntlrDatatypeRuleToken lv_modelGroupElement3_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:209:28: ( (otherlv_0= 'Element2' otherlv_1= '{' otherlv_2= 'modelGroupElement1' otherlv_3= '{' ( (lv_modelGroupElement1_4_0= ruleString0 ) ) (otherlv_5= ',' ( (lv_modelGroupElement1_6_0= ruleString0 ) ) )* otherlv_7= '}' otherlv_8= 'modelGroupElement2' ( (lv_modelGroupElement2_9_0= ruleString0 ) ) otherlv_10= 'modelGroupElement3' ( (lv_modelGroupElement3_11_0= ruleString0 ) ) otherlv_12= '}' ) )
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:210:1: (otherlv_0= 'Element2' otherlv_1= '{' otherlv_2= 'modelGroupElement1' otherlv_3= '{' ( (lv_modelGroupElement1_4_0= ruleString0 ) ) (otherlv_5= ',' ( (lv_modelGroupElement1_6_0= ruleString0 ) ) )* otherlv_7= '}' otherlv_8= 'modelGroupElement2' ( (lv_modelGroupElement2_9_0= ruleString0 ) ) otherlv_10= 'modelGroupElement3' ( (lv_modelGroupElement3_11_0= ruleString0 ) ) otherlv_12= '}' )
            {
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:210:1: (otherlv_0= 'Element2' otherlv_1= '{' otherlv_2= 'modelGroupElement1' otherlv_3= '{' ( (lv_modelGroupElement1_4_0= ruleString0 ) ) (otherlv_5= ',' ( (lv_modelGroupElement1_6_0= ruleString0 ) ) )* otherlv_7= '}' otherlv_8= 'modelGroupElement2' ( (lv_modelGroupElement2_9_0= ruleString0 ) ) otherlv_10= 'modelGroupElement3' ( (lv_modelGroupElement3_11_0= ruleString0 ) ) otherlv_12= '}' )
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:210:3: otherlv_0= 'Element2' otherlv_1= '{' otherlv_2= 'modelGroupElement1' otherlv_3= '{' ( (lv_modelGroupElement1_4_0= ruleString0 ) ) (otherlv_5= ',' ( (lv_modelGroupElement1_6_0= ruleString0 ) ) )* otherlv_7= '}' otherlv_8= 'modelGroupElement2' ( (lv_modelGroupElement2_9_0= ruleString0 ) ) otherlv_10= 'modelGroupElement3' ( (lv_modelGroupElement3_11_0= ruleString0 ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleElement2420); 

                	newLeafNode(otherlv_0, grammarAccess.getElement2Access().getElement2Keyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleElement2432); 

                	newLeafNode(otherlv_1, grammarAccess.getElement2Access().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleElement2444); 

                	newLeafNode(otherlv_2, grammarAccess.getElement2Access().getModelGroupElement1Keyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleElement2456); 

                	newLeafNode(otherlv_3, grammarAccess.getElement2Access().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:226:1: ( (lv_modelGroupElement1_4_0= ruleString0 ) )
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:227:1: (lv_modelGroupElement1_4_0= ruleString0 )
            {
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:227:1: (lv_modelGroupElement1_4_0= ruleString0 )
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:228:3: lv_modelGroupElement1_4_0= ruleString0
            {
             
            	        newCompositeNode(grammarAccess.getElement2Access().getModelGroupElement1String0ParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleElement2477);
            lv_modelGroupElement1_4_0=ruleString0();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getElement2Rule());
            	        }
                   		add(
                   			current, 
                   			"modelGroupElement1",
                    		lv_modelGroupElement1_4_0, 
                    		"String0");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:244:2: (otherlv_5= ',' ( (lv_modelGroupElement1_6_0= ruleString0 ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:244:4: otherlv_5= ',' ( (lv_modelGroupElement1_6_0= ruleString0 ) )
            	    {
            	    otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleElement2490); 

            	        	newLeafNode(otherlv_5, grammarAccess.getElement2Access().getCommaKeyword_5_0());
            	        
            	    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:248:1: ( (lv_modelGroupElement1_6_0= ruleString0 ) )
            	    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:249:1: (lv_modelGroupElement1_6_0= ruleString0 )
            	    {
            	    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:249:1: (lv_modelGroupElement1_6_0= ruleString0 )
            	    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:250:3: lv_modelGroupElement1_6_0= ruleString0
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getElement2Access().getModelGroupElement1String0ParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleElement2511);
            	    lv_modelGroupElement1_6_0=ruleString0();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getElement2Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"modelGroupElement1",
            	            		lv_modelGroupElement1_6_0, 
            	            		"String0");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleElement2525); 

                	newLeafNode(otherlv_7, grammarAccess.getElement2Access().getRightCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleElement2537); 

                	newLeafNode(otherlv_8, grammarAccess.getElement2Access().getModelGroupElement2Keyword_7());
                
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:274:1: ( (lv_modelGroupElement2_9_0= ruleString0 ) )
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:275:1: (lv_modelGroupElement2_9_0= ruleString0 )
            {
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:275:1: (lv_modelGroupElement2_9_0= ruleString0 )
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:276:3: lv_modelGroupElement2_9_0= ruleString0
            {
             
            	        newCompositeNode(grammarAccess.getElement2Access().getModelGroupElement2String0ParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleElement2558);
            lv_modelGroupElement2_9_0=ruleString0();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getElement2Rule());
            	        }
                   		set(
                   			current, 
                   			"modelGroupElement2",
                    		lv_modelGroupElement2_9_0, 
                    		"String0");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleElement2570); 

                	newLeafNode(otherlv_10, grammarAccess.getElement2Access().getModelGroupElement3Keyword_9());
                
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:296:1: ( (lv_modelGroupElement3_11_0= ruleString0 ) )
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:297:1: (lv_modelGroupElement3_11_0= ruleString0 )
            {
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:297:1: (lv_modelGroupElement3_11_0= ruleString0 )
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:298:3: lv_modelGroupElement3_11_0= ruleString0
            {
             
            	        newCompositeNode(grammarAccess.getElement2Access().getModelGroupElement3String0ParserRuleCall_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleElement2591);
            lv_modelGroupElement3_11_0=ruleString0();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getElement2Rule());
            	        }
                   		set(
                   			current, 
                   			"modelGroupElement3",
                    		lv_modelGroupElement3_11_0, 
                    		"String0");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleElement2603); 

                	newLeafNode(otherlv_12, grammarAccess.getElement2Access().getRightCurlyBracketKeyword_11());
                

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
    // $ANTLR end "ruleElement2"


    // $ANTLR start "entryRuleElement3"
    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:326:1: entryRuleElement3 returns [EObject current=null] : iv_ruleElement3= ruleElement3 EOF ;
    public final EObject entryRuleElement3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement3 = null;


        try {
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:327:2: (iv_ruleElement3= ruleElement3 EOF )
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:328:2: iv_ruleElement3= ruleElement3 EOF
            {
             newCompositeNode(grammarAccess.getElement3Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement3_in_entryRuleElement3639);
            iv_ruleElement3=ruleElement3();

            state._fsp--;

             current =iv_ruleElement3; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElement3649); 

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
    // $ANTLR end "entryRuleElement3"


    // $ANTLR start "ruleElement3"
    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:335:1: ruleElement3 returns [EObject current=null] : ( () otherlv_1= 'Element3' otherlv_2= '{' (otherlv_3= 'repeatableElement1' otherlv_4= '{' ( (lv_repeatableElement1_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_repeatableElement1_7_0= ruleString0 ) ) )* otherlv_8= '}' )? (otherlv_9= 'repeatableElement2' ( (lv_repeatableElement2_10_0= ruleString0 ) ) )? (otherlv_11= 'repeatableElement3' ( (lv_repeatableElement3_12_0= ruleString0 ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleElement3() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_repeatableElement1_5_0 = null;

        AntlrDatatypeRuleToken lv_repeatableElement1_7_0 = null;

        AntlrDatatypeRuleToken lv_repeatableElement2_10_0 = null;

        AntlrDatatypeRuleToken lv_repeatableElement3_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:338:28: ( ( () otherlv_1= 'Element3' otherlv_2= '{' (otherlv_3= 'repeatableElement1' otherlv_4= '{' ( (lv_repeatableElement1_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_repeatableElement1_7_0= ruleString0 ) ) )* otherlv_8= '}' )? (otherlv_9= 'repeatableElement2' ( (lv_repeatableElement2_10_0= ruleString0 ) ) )? (otherlv_11= 'repeatableElement3' ( (lv_repeatableElement3_12_0= ruleString0 ) ) )? otherlv_13= '}' ) )
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:339:1: ( () otherlv_1= 'Element3' otherlv_2= '{' (otherlv_3= 'repeatableElement1' otherlv_4= '{' ( (lv_repeatableElement1_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_repeatableElement1_7_0= ruleString0 ) ) )* otherlv_8= '}' )? (otherlv_9= 'repeatableElement2' ( (lv_repeatableElement2_10_0= ruleString0 ) ) )? (otherlv_11= 'repeatableElement3' ( (lv_repeatableElement3_12_0= ruleString0 ) ) )? otherlv_13= '}' )
            {
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:339:1: ( () otherlv_1= 'Element3' otherlv_2= '{' (otherlv_3= 'repeatableElement1' otherlv_4= '{' ( (lv_repeatableElement1_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_repeatableElement1_7_0= ruleString0 ) ) )* otherlv_8= '}' )? (otherlv_9= 'repeatableElement2' ( (lv_repeatableElement2_10_0= ruleString0 ) ) )? (otherlv_11= 'repeatableElement3' ( (lv_repeatableElement3_12_0= ruleString0 ) ) )? otherlv_13= '}' )
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:339:2: () otherlv_1= 'Element3' otherlv_2= '{' (otherlv_3= 'repeatableElement1' otherlv_4= '{' ( (lv_repeatableElement1_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_repeatableElement1_7_0= ruleString0 ) ) )* otherlv_8= '}' )? (otherlv_9= 'repeatableElement2' ( (lv_repeatableElement2_10_0= ruleString0 ) ) )? (otherlv_11= 'repeatableElement3' ( (lv_repeatableElement3_12_0= ruleString0 ) ) )? otherlv_13= '}'
            {
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:339:2: ()
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:340:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getElement3Access().getElement3Action_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleElement3695); 

                	newLeafNode(otherlv_1, grammarAccess.getElement3Access().getElement3Keyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleElement3707); 

                	newLeafNode(otherlv_2, grammarAccess.getElement3Access().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:353:1: (otherlv_3= 'repeatableElement1' otherlv_4= '{' ( (lv_repeatableElement1_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_repeatableElement1_7_0= ruleString0 ) ) )* otherlv_8= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:353:3: otherlv_3= 'repeatableElement1' otherlv_4= '{' ( (lv_repeatableElement1_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_repeatableElement1_7_0= ruleString0 ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleElement3720); 

                        	newLeafNode(otherlv_3, grammarAccess.getElement3Access().getRepeatableElement1Keyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleElement3732); 

                        	newLeafNode(otherlv_4, grammarAccess.getElement3Access().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:361:1: ( (lv_repeatableElement1_5_0= ruleString0 ) )
                    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:362:1: (lv_repeatableElement1_5_0= ruleString0 )
                    {
                    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:362:1: (lv_repeatableElement1_5_0= ruleString0 )
                    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:363:3: lv_repeatableElement1_5_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getElement3Access().getRepeatableElement1String0ParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleElement3753);
                    lv_repeatableElement1_5_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getElement3Rule());
                    	        }
                           		add(
                           			current, 
                           			"repeatableElement1",
                            		lv_repeatableElement1_5_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:379:2: (otherlv_6= ',' ( (lv_repeatableElement1_7_0= ruleString0 ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==20) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:379:4: otherlv_6= ',' ( (lv_repeatableElement1_7_0= ruleString0 ) )
                    	    {
                    	    otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleElement3766); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getElement3Access().getCommaKeyword_3_3_0());
                    	        
                    	    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:383:1: ( (lv_repeatableElement1_7_0= ruleString0 ) )
                    	    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:384:1: (lv_repeatableElement1_7_0= ruleString0 )
                    	    {
                    	    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:384:1: (lv_repeatableElement1_7_0= ruleString0 )
                    	    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:385:3: lv_repeatableElement1_7_0= ruleString0
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getElement3Access().getRepeatableElement1String0ParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleElement3787);
                    	    lv_repeatableElement1_7_0=ruleString0();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getElement3Rule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"repeatableElement1",
                    	            		lv_repeatableElement1_7_0, 
                    	            		"String0");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleElement3801); 

                        	newLeafNode(otherlv_8, grammarAccess.getElement3Access().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:405:3: (otherlv_9= 'repeatableElement2' ( (lv_repeatableElement2_10_0= ruleString0 ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:405:5: otherlv_9= 'repeatableElement2' ( (lv_repeatableElement2_10_0= ruleString0 ) )
                    {
                    otherlv_9=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleElement3816); 

                        	newLeafNode(otherlv_9, grammarAccess.getElement3Access().getRepeatableElement2Keyword_4_0());
                        
                    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:409:1: ( (lv_repeatableElement2_10_0= ruleString0 ) )
                    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:410:1: (lv_repeatableElement2_10_0= ruleString0 )
                    {
                    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:410:1: (lv_repeatableElement2_10_0= ruleString0 )
                    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:411:3: lv_repeatableElement2_10_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getElement3Access().getRepeatableElement2String0ParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleElement3837);
                    lv_repeatableElement2_10_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getElement3Rule());
                    	        }
                           		set(
                           			current, 
                           			"repeatableElement2",
                            		lv_repeatableElement2_10_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:427:4: (otherlv_11= 'repeatableElement3' ( (lv_repeatableElement3_12_0= ruleString0 ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:427:6: otherlv_11= 'repeatableElement3' ( (lv_repeatableElement3_12_0= ruleString0 ) )
                    {
                    otherlv_11=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleElement3852); 

                        	newLeafNode(otherlv_11, grammarAccess.getElement3Access().getRepeatableElement3Keyword_5_0());
                        
                    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:431:1: ( (lv_repeatableElement3_12_0= ruleString0 ) )
                    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:432:1: (lv_repeatableElement3_12_0= ruleString0 )
                    {
                    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:432:1: (lv_repeatableElement3_12_0= ruleString0 )
                    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:433:3: lv_repeatableElement3_12_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getElement3Access().getRepeatableElement3String0ParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleElement3873);
                    lv_repeatableElement3_12_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getElement3Rule());
                    	        }
                           		set(
                           			current, 
                           			"repeatableElement3",
                            		lv_repeatableElement3_12_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleElement3887); 

                	newLeafNode(otherlv_13, grammarAccess.getElement3Access().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleElement3"


    // $ANTLR start "entryRuleString0"
    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:461:1: entryRuleString0 returns [String current=null] : iv_ruleString0= ruleString0 EOF ;
    public final String entryRuleString0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleString0 = null;


        try {
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:462:2: (iv_ruleString0= ruleString0 EOF )
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:463:2: iv_ruleString0= ruleString0 EOF
            {
             newCompositeNode(grammarAccess.getString0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_entryRuleString0924);
            iv_ruleString0=ruleString0();

            state._fsp--;

             current =iv_ruleString0.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleString0935); 

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
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:470:1: ruleString0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'String' ;
    public final AntlrDatatypeRuleToken ruleString0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:473:28: (kw= 'String' )
            // ../org.xtext.example.mydsl.group.unchanged/src-gen/org/xtext/example/mydsl/group/unchanged/parser/antlr/internal/InternalMyDsl.g:475:2: kw= 'String'
            {
            kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleString0972); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getString0Access().getStringKeyword()); 
                

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
    // $ANTLR end "ruleString0"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRootElementType_in_entryRuleRootElementType75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRootElementType85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleRootElementType122 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRootElementType134 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleRootElementType146 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_ruleElement1_in_ruleRootElementType167 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRootElementType179 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleElement2_in_ruleRootElementType200 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRootElementType212 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleElement3_in_ruleRootElementType233 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRootElementType245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement1_in_entryRuleElement1281 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElement1291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleElement1337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement2_in_entryRuleElement2373 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElement2383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleElement2420 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleElement2432 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleElement2444 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleElement2456 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleString0_in_ruleElement2477 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_20_in_ruleElement2490 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleString0_in_ruleElement2511 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_16_in_ruleElement2525 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleElement2537 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleString0_in_ruleElement2558 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleElement2570 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleString0_in_ruleElement2591 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleElement2603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement3_in_entryRuleElement3639 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElement3649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleElement3695 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleElement3707 = new BitSet(new long[]{0x0000000007010000L});
        public static final BitSet FOLLOW_24_in_ruleElement3720 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleElement3732 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleString0_in_ruleElement3753 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_20_in_ruleElement3766 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleString0_in_ruleElement3787 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_16_in_ruleElement3801 = new BitSet(new long[]{0x0000000006010000L});
        public static final BitSet FOLLOW_25_in_ruleElement3816 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleString0_in_ruleElement3837 = new BitSet(new long[]{0x0000000004010000L});
        public static final BitSet FOLLOW_26_in_ruleElement3852 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleString0_in_ruleElement3873 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleElement3887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString0924 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString0935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleString0972 = new BitSet(new long[]{0x0000000000000002L});
    }


}