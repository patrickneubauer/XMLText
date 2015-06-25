package org.xtext.example.mydsl1.group.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl1.group.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RootElementType'", "'{'", "'element1'", "'element2'", "'element3'", "'}'", "'Element1'", "'element1Choice'", "'Element2'", "'modelGroupElement1'", "','", "'modelGroupElement2'", "'modelGroupElement3'", "'Element3'", "'repeatableElement1'", "'repeatableElement2'", "'repeatableElement3'", "'Element1Choice'", "'String'"
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
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g"; }



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
    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleRootElementType returns [EObject current=null] : iv_ruleRootElementType= ruleRootElementType EOF ;
    public final EObject entryRuleRootElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootElementType = null;


        try {
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleRootElementType= ruleRootElementType EOF )
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleRootElementType= ruleRootElementType EOF
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
    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:76:1: ruleRootElementType returns [EObject current=null] : (otherlv_0= 'RootElementType' otherlv_1= '{' otherlv_2= 'element1' ( (lv_element1_3_0= ruleElement1 ) ) otherlv_4= 'element2' ( (lv_element2_5_0= ruleElement2 ) ) otherlv_6= 'element3' ( (lv_element3_7_0= ruleElement3 ) ) otherlv_8= '}' ) ;
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
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:79:28: ( (otherlv_0= 'RootElementType' otherlv_1= '{' otherlv_2= 'element1' ( (lv_element1_3_0= ruleElement1 ) ) otherlv_4= 'element2' ( (lv_element2_5_0= ruleElement2 ) ) otherlv_6= 'element3' ( (lv_element3_7_0= ruleElement3 ) ) otherlv_8= '}' ) )
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'RootElementType' otherlv_1= '{' otherlv_2= 'element1' ( (lv_element1_3_0= ruleElement1 ) ) otherlv_4= 'element2' ( (lv_element2_5_0= ruleElement2 ) ) otherlv_6= 'element3' ( (lv_element3_7_0= ruleElement3 ) ) otherlv_8= '}' )
            {
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'RootElementType' otherlv_1= '{' otherlv_2= 'element1' ( (lv_element1_3_0= ruleElement1 ) ) otherlv_4= 'element2' ( (lv_element2_5_0= ruleElement2 ) ) otherlv_6= 'element3' ( (lv_element3_7_0= ruleElement3 ) ) otherlv_8= '}' )
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:80:3: otherlv_0= 'RootElementType' otherlv_1= '{' otherlv_2= 'element1' ( (lv_element1_3_0= ruleElement1 ) ) otherlv_4= 'element2' ( (lv_element2_5_0= ruleElement2 ) ) otherlv_6= 'element3' ( (lv_element3_7_0= ruleElement3 ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRootElementType122); 

                	newLeafNode(otherlv_0, grammarAccess.getRootElementTypeAccess().getRootElementTypeKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRootElementType134); 

                	newLeafNode(otherlv_1, grammarAccess.getRootElementTypeAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRootElementType146); 

                	newLeafNode(otherlv_2, grammarAccess.getRootElementTypeAccess().getElement1Keyword_2());
                
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:92:1: ( (lv_element1_3_0= ruleElement1 ) )
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:93:1: (lv_element1_3_0= ruleElement1 )
            {
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:93:1: (lv_element1_3_0= ruleElement1 )
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:94:3: lv_element1_3_0= ruleElement1
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
                
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:114:1: ( (lv_element2_5_0= ruleElement2 ) )
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:115:1: (lv_element2_5_0= ruleElement2 )
            {
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:115:1: (lv_element2_5_0= ruleElement2 )
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:116:3: lv_element2_5_0= ruleElement2
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
                
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:136:1: ( (lv_element3_7_0= ruleElement3 ) )
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:137:1: (lv_element3_7_0= ruleElement3 )
            {
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:137:1: (lv_element3_7_0= ruleElement3 )
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:138:3: lv_element3_7_0= ruleElement3
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
    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:166:1: entryRuleElement1 returns [EObject current=null] : iv_ruleElement1= ruleElement1 EOF ;
    public final EObject entryRuleElement1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement1 = null;


        try {
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:167:2: (iv_ruleElement1= ruleElement1 EOF )
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:168:2: iv_ruleElement1= ruleElement1 EOF
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
    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:175:1: ruleElement1 returns [EObject current=null] : ( () otherlv_1= 'Element1' otherlv_2= '{' (otherlv_3= 'element1Choice' ( (lv_element1Choice_4_0= ruleElement1Choice ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleElement1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element1Choice_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:178:28: ( ( () otherlv_1= 'Element1' otherlv_2= '{' (otherlv_3= 'element1Choice' ( (lv_element1Choice_4_0= ruleElement1Choice ) ) )? otherlv_5= '}' ) )
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:179:1: ( () otherlv_1= 'Element1' otherlv_2= '{' (otherlv_3= 'element1Choice' ( (lv_element1Choice_4_0= ruleElement1Choice ) ) )? otherlv_5= '}' )
            {
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:179:1: ( () otherlv_1= 'Element1' otherlv_2= '{' (otherlv_3= 'element1Choice' ( (lv_element1Choice_4_0= ruleElement1Choice ) ) )? otherlv_5= '}' )
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:179:2: () otherlv_1= 'Element1' otherlv_2= '{' (otherlv_3= 'element1Choice' ( (lv_element1Choice_4_0= ruleElement1Choice ) ) )? otherlv_5= '}'
            {
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:179:2: ()
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:180:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getElement1Access().getElement1Action_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleElement1337); 

                	newLeafNode(otherlv_1, grammarAccess.getElement1Access().getElement1Keyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleElement1349); 

                	newLeafNode(otherlv_2, grammarAccess.getElement1Access().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:193:1: (otherlv_3= 'element1Choice' ( (lv_element1Choice_4_0= ruleElement1Choice ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:193:3: otherlv_3= 'element1Choice' ( (lv_element1Choice_4_0= ruleElement1Choice ) )
                    {
                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleElement1362); 

                        	newLeafNode(otherlv_3, grammarAccess.getElement1Access().getElement1ChoiceKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:197:1: ( (lv_element1Choice_4_0= ruleElement1Choice ) )
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:198:1: (lv_element1Choice_4_0= ruleElement1Choice )
                    {
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:198:1: (lv_element1Choice_4_0= ruleElement1Choice )
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:199:3: lv_element1Choice_4_0= ruleElement1Choice
                    {
                     
                    	        newCompositeNode(grammarAccess.getElement1Access().getElement1ChoiceElement1ChoiceParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleElement1Choice_in_ruleElement1383);
                    lv_element1Choice_4_0=ruleElement1Choice();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getElement1Rule());
                    	        }
                           		set(
                           			current, 
                           			"element1Choice",
                            		lv_element1Choice_4_0, 
                            		"Element1Choice");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleElement1397); 

                	newLeafNode(otherlv_5, grammarAccess.getElement1Access().getRightCurlyBracketKeyword_4());
                

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
    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:227:1: entryRuleElement2 returns [EObject current=null] : iv_ruleElement2= ruleElement2 EOF ;
    public final EObject entryRuleElement2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement2 = null;


        try {
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:228:2: (iv_ruleElement2= ruleElement2 EOF )
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:229:2: iv_ruleElement2= ruleElement2 EOF
            {
             newCompositeNode(grammarAccess.getElement2Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement2_in_entryRuleElement2433);
            iv_ruleElement2=ruleElement2();

            state._fsp--;

             current =iv_ruleElement2; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElement2443); 

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
    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:236:1: ruleElement2 returns [EObject current=null] : (otherlv_0= 'Element2' otherlv_1= '{' otherlv_2= 'modelGroupElement1' otherlv_3= '{' ( (lv_modelGroupElement1_4_0= ruleString0 ) ) (otherlv_5= ',' ( (lv_modelGroupElement1_6_0= ruleString0 ) ) )* otherlv_7= '}' otherlv_8= 'modelGroupElement2' ( (lv_modelGroupElement2_9_0= ruleString0 ) ) otherlv_10= 'modelGroupElement3' ( (lv_modelGroupElement3_11_0= ruleString0 ) ) otherlv_12= '}' ) ;
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
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:239:28: ( (otherlv_0= 'Element2' otherlv_1= '{' otherlv_2= 'modelGroupElement1' otherlv_3= '{' ( (lv_modelGroupElement1_4_0= ruleString0 ) ) (otherlv_5= ',' ( (lv_modelGroupElement1_6_0= ruleString0 ) ) )* otherlv_7= '}' otherlv_8= 'modelGroupElement2' ( (lv_modelGroupElement2_9_0= ruleString0 ) ) otherlv_10= 'modelGroupElement3' ( (lv_modelGroupElement3_11_0= ruleString0 ) ) otherlv_12= '}' ) )
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:240:1: (otherlv_0= 'Element2' otherlv_1= '{' otherlv_2= 'modelGroupElement1' otherlv_3= '{' ( (lv_modelGroupElement1_4_0= ruleString0 ) ) (otherlv_5= ',' ( (lv_modelGroupElement1_6_0= ruleString0 ) ) )* otherlv_7= '}' otherlv_8= 'modelGroupElement2' ( (lv_modelGroupElement2_9_0= ruleString0 ) ) otherlv_10= 'modelGroupElement3' ( (lv_modelGroupElement3_11_0= ruleString0 ) ) otherlv_12= '}' )
            {
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:240:1: (otherlv_0= 'Element2' otherlv_1= '{' otherlv_2= 'modelGroupElement1' otherlv_3= '{' ( (lv_modelGroupElement1_4_0= ruleString0 ) ) (otherlv_5= ',' ( (lv_modelGroupElement1_6_0= ruleString0 ) ) )* otherlv_7= '}' otherlv_8= 'modelGroupElement2' ( (lv_modelGroupElement2_9_0= ruleString0 ) ) otherlv_10= 'modelGroupElement3' ( (lv_modelGroupElement3_11_0= ruleString0 ) ) otherlv_12= '}' )
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:240:3: otherlv_0= 'Element2' otherlv_1= '{' otherlv_2= 'modelGroupElement1' otherlv_3= '{' ( (lv_modelGroupElement1_4_0= ruleString0 ) ) (otherlv_5= ',' ( (lv_modelGroupElement1_6_0= ruleString0 ) ) )* otherlv_7= '}' otherlv_8= 'modelGroupElement2' ( (lv_modelGroupElement2_9_0= ruleString0 ) ) otherlv_10= 'modelGroupElement3' ( (lv_modelGroupElement3_11_0= ruleString0 ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleElement2480); 

                	newLeafNode(otherlv_0, grammarAccess.getElement2Access().getElement2Keyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleElement2492); 

                	newLeafNode(otherlv_1, grammarAccess.getElement2Access().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleElement2504); 

                	newLeafNode(otherlv_2, grammarAccess.getElement2Access().getModelGroupElement1Keyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleElement2516); 

                	newLeafNode(otherlv_3, grammarAccess.getElement2Access().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:256:1: ( (lv_modelGroupElement1_4_0= ruleString0 ) )
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:257:1: (lv_modelGroupElement1_4_0= ruleString0 )
            {
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:257:1: (lv_modelGroupElement1_4_0= ruleString0 )
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:258:3: lv_modelGroupElement1_4_0= ruleString0
            {
             
            	        newCompositeNode(grammarAccess.getElement2Access().getModelGroupElement1String0ParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleElement2537);
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

            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:274:2: (otherlv_5= ',' ( (lv_modelGroupElement1_6_0= ruleString0 ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:274:4: otherlv_5= ',' ( (lv_modelGroupElement1_6_0= ruleString0 ) )
            	    {
            	    otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleElement2550); 

            	        	newLeafNode(otherlv_5, grammarAccess.getElement2Access().getCommaKeyword_5_0());
            	        
            	    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:278:1: ( (lv_modelGroupElement1_6_0= ruleString0 ) )
            	    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:279:1: (lv_modelGroupElement1_6_0= ruleString0 )
            	    {
            	    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:279:1: (lv_modelGroupElement1_6_0= ruleString0 )
            	    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:280:3: lv_modelGroupElement1_6_0= ruleString0
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getElement2Access().getModelGroupElement1String0ParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleElement2571);
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
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleElement2585); 

                	newLeafNode(otherlv_7, grammarAccess.getElement2Access().getRightCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleElement2597); 

                	newLeafNode(otherlv_8, grammarAccess.getElement2Access().getModelGroupElement2Keyword_7());
                
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:304:1: ( (lv_modelGroupElement2_9_0= ruleString0 ) )
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:305:1: (lv_modelGroupElement2_9_0= ruleString0 )
            {
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:305:1: (lv_modelGroupElement2_9_0= ruleString0 )
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:306:3: lv_modelGroupElement2_9_0= ruleString0
            {
             
            	        newCompositeNode(grammarAccess.getElement2Access().getModelGroupElement2String0ParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleElement2618);
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

            otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleElement2630); 

                	newLeafNode(otherlv_10, grammarAccess.getElement2Access().getModelGroupElement3Keyword_9());
                
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:326:1: ( (lv_modelGroupElement3_11_0= ruleString0 ) )
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:327:1: (lv_modelGroupElement3_11_0= ruleString0 )
            {
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:327:1: (lv_modelGroupElement3_11_0= ruleString0 )
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:328:3: lv_modelGroupElement3_11_0= ruleString0
            {
             
            	        newCompositeNode(grammarAccess.getElement2Access().getModelGroupElement3String0ParserRuleCall_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleElement2651);
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

            otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleElement2663); 

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
    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:356:1: entryRuleElement3 returns [EObject current=null] : iv_ruleElement3= ruleElement3 EOF ;
    public final EObject entryRuleElement3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement3 = null;


        try {
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:357:2: (iv_ruleElement3= ruleElement3 EOF )
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:358:2: iv_ruleElement3= ruleElement3 EOF
            {
             newCompositeNode(grammarAccess.getElement3Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement3_in_entryRuleElement3699);
            iv_ruleElement3=ruleElement3();

            state._fsp--;

             current =iv_ruleElement3; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElement3709); 

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
    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:365:1: ruleElement3 returns [EObject current=null] : ( () otherlv_1= 'Element3' otherlv_2= '{' (otherlv_3= 'repeatableElement1' otherlv_4= '{' ( (lv_repeatableElement1_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_repeatableElement1_7_0= ruleString0 ) ) )* otherlv_8= '}' )? (otherlv_9= 'repeatableElement2' ( (lv_repeatableElement2_10_0= ruleString0 ) ) )? (otherlv_11= 'repeatableElement3' ( (lv_repeatableElement3_12_0= ruleString0 ) ) )? otherlv_13= '}' ) ;
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
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:368:28: ( ( () otherlv_1= 'Element3' otherlv_2= '{' (otherlv_3= 'repeatableElement1' otherlv_4= '{' ( (lv_repeatableElement1_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_repeatableElement1_7_0= ruleString0 ) ) )* otherlv_8= '}' )? (otherlv_9= 'repeatableElement2' ( (lv_repeatableElement2_10_0= ruleString0 ) ) )? (otherlv_11= 'repeatableElement3' ( (lv_repeatableElement3_12_0= ruleString0 ) ) )? otherlv_13= '}' ) )
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:369:1: ( () otherlv_1= 'Element3' otherlv_2= '{' (otherlv_3= 'repeatableElement1' otherlv_4= '{' ( (lv_repeatableElement1_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_repeatableElement1_7_0= ruleString0 ) ) )* otherlv_8= '}' )? (otherlv_9= 'repeatableElement2' ( (lv_repeatableElement2_10_0= ruleString0 ) ) )? (otherlv_11= 'repeatableElement3' ( (lv_repeatableElement3_12_0= ruleString0 ) ) )? otherlv_13= '}' )
            {
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:369:1: ( () otherlv_1= 'Element3' otherlv_2= '{' (otherlv_3= 'repeatableElement1' otherlv_4= '{' ( (lv_repeatableElement1_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_repeatableElement1_7_0= ruleString0 ) ) )* otherlv_8= '}' )? (otherlv_9= 'repeatableElement2' ( (lv_repeatableElement2_10_0= ruleString0 ) ) )? (otherlv_11= 'repeatableElement3' ( (lv_repeatableElement3_12_0= ruleString0 ) ) )? otherlv_13= '}' )
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:369:2: () otherlv_1= 'Element3' otherlv_2= '{' (otherlv_3= 'repeatableElement1' otherlv_4= '{' ( (lv_repeatableElement1_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_repeatableElement1_7_0= ruleString0 ) ) )* otherlv_8= '}' )? (otherlv_9= 'repeatableElement2' ( (lv_repeatableElement2_10_0= ruleString0 ) ) )? (otherlv_11= 'repeatableElement3' ( (lv_repeatableElement3_12_0= ruleString0 ) ) )? otherlv_13= '}'
            {
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:369:2: ()
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:370:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getElement3Access().getElement3Action_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleElement3755); 

                	newLeafNode(otherlv_1, grammarAccess.getElement3Access().getElement3Keyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleElement3767); 

                	newLeafNode(otherlv_2, grammarAccess.getElement3Access().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:383:1: (otherlv_3= 'repeatableElement1' otherlv_4= '{' ( (lv_repeatableElement1_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_repeatableElement1_7_0= ruleString0 ) ) )* otherlv_8= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:383:3: otherlv_3= 'repeatableElement1' otherlv_4= '{' ( (lv_repeatableElement1_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_repeatableElement1_7_0= ruleString0 ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleElement3780); 

                        	newLeafNode(otherlv_3, grammarAccess.getElement3Access().getRepeatableElement1Keyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleElement3792); 

                        	newLeafNode(otherlv_4, grammarAccess.getElement3Access().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:391:1: ( (lv_repeatableElement1_5_0= ruleString0 ) )
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:392:1: (lv_repeatableElement1_5_0= ruleString0 )
                    {
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:392:1: (lv_repeatableElement1_5_0= ruleString0 )
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:393:3: lv_repeatableElement1_5_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getElement3Access().getRepeatableElement1String0ParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleElement3813);
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

                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:409:2: (otherlv_6= ',' ( (lv_repeatableElement1_7_0= ruleString0 ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==21) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:409:4: otherlv_6= ',' ( (lv_repeatableElement1_7_0= ruleString0 ) )
                    	    {
                    	    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleElement3826); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getElement3Access().getCommaKeyword_3_3_0());
                    	        
                    	    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:413:1: ( (lv_repeatableElement1_7_0= ruleString0 ) )
                    	    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:414:1: (lv_repeatableElement1_7_0= ruleString0 )
                    	    {
                    	    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:414:1: (lv_repeatableElement1_7_0= ruleString0 )
                    	    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:415:3: lv_repeatableElement1_7_0= ruleString0
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getElement3Access().getRepeatableElement1String0ParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleElement3847);
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
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleElement3861); 

                        	newLeafNode(otherlv_8, grammarAccess.getElement3Access().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:435:3: (otherlv_9= 'repeatableElement2' ( (lv_repeatableElement2_10_0= ruleString0 ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:435:5: otherlv_9= 'repeatableElement2' ( (lv_repeatableElement2_10_0= ruleString0 ) )
                    {
                    otherlv_9=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleElement3876); 

                        	newLeafNode(otherlv_9, grammarAccess.getElement3Access().getRepeatableElement2Keyword_4_0());
                        
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:439:1: ( (lv_repeatableElement2_10_0= ruleString0 ) )
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:440:1: (lv_repeatableElement2_10_0= ruleString0 )
                    {
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:440:1: (lv_repeatableElement2_10_0= ruleString0 )
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:441:3: lv_repeatableElement2_10_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getElement3Access().getRepeatableElement2String0ParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleElement3897);
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

            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:457:4: (otherlv_11= 'repeatableElement3' ( (lv_repeatableElement3_12_0= ruleString0 ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:457:6: otherlv_11= 'repeatableElement3' ( (lv_repeatableElement3_12_0= ruleString0 ) )
                    {
                    otherlv_11=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleElement3912); 

                        	newLeafNode(otherlv_11, grammarAccess.getElement3Access().getRepeatableElement3Keyword_5_0());
                        
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:461:1: ( (lv_repeatableElement3_12_0= ruleString0 ) )
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:462:1: (lv_repeatableElement3_12_0= ruleString0 )
                    {
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:462:1: (lv_repeatableElement3_12_0= ruleString0 )
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:463:3: lv_repeatableElement3_12_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getElement3Access().getRepeatableElement3String0ParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleElement3933);
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

            otherlv_13=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleElement3947); 

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


    // $ANTLR start "entryRuleElement1Choice"
    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:491:1: entryRuleElement1Choice returns [EObject current=null] : iv_ruleElement1Choice= ruleElement1Choice EOF ;
    public final EObject entryRuleElement1Choice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement1Choice = null;


        try {
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:492:2: (iv_ruleElement1Choice= ruleElement1Choice EOF )
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:493:2: iv_ruleElement1Choice= ruleElement1Choice EOF
            {
             newCompositeNode(grammarAccess.getElement1ChoiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement1Choice_in_entryRuleElement1Choice983);
            iv_ruleElement1Choice=ruleElement1Choice();

            state._fsp--;

             current =iv_ruleElement1Choice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElement1Choice993); 

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
    // $ANTLR end "entryRuleElement1Choice"


    // $ANTLR start "ruleElement1Choice"
    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:500:1: ruleElement1Choice returns [EObject current=null] : ( () otherlv_1= 'Element1Choice' otherlv_2= '{' (otherlv_3= 'repeatableElement1' otherlv_4= '{' ( (lv_repeatableElement1_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_repeatableElement1_7_0= ruleString0 ) ) )* otherlv_8= '}' )? (otherlv_9= 'repeatableElement2' otherlv_10= '{' ( (lv_repeatableElement2_11_0= ruleString0 ) ) (otherlv_12= ',' ( (lv_repeatableElement2_13_0= ruleString0 ) ) )* otherlv_14= '}' )? (otherlv_15= 'repeatableElement3' otherlv_16= '{' ( (lv_repeatableElement3_17_0= ruleString0 ) ) (otherlv_18= ',' ( (lv_repeatableElement3_19_0= ruleString0 ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleElement1Choice() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_repeatableElement1_5_0 = null;

        AntlrDatatypeRuleToken lv_repeatableElement1_7_0 = null;

        AntlrDatatypeRuleToken lv_repeatableElement2_11_0 = null;

        AntlrDatatypeRuleToken lv_repeatableElement2_13_0 = null;

        AntlrDatatypeRuleToken lv_repeatableElement3_17_0 = null;

        AntlrDatatypeRuleToken lv_repeatableElement3_19_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:503:28: ( ( () otherlv_1= 'Element1Choice' otherlv_2= '{' (otherlv_3= 'repeatableElement1' otherlv_4= '{' ( (lv_repeatableElement1_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_repeatableElement1_7_0= ruleString0 ) ) )* otherlv_8= '}' )? (otherlv_9= 'repeatableElement2' otherlv_10= '{' ( (lv_repeatableElement2_11_0= ruleString0 ) ) (otherlv_12= ',' ( (lv_repeatableElement2_13_0= ruleString0 ) ) )* otherlv_14= '}' )? (otherlv_15= 'repeatableElement3' otherlv_16= '{' ( (lv_repeatableElement3_17_0= ruleString0 ) ) (otherlv_18= ',' ( (lv_repeatableElement3_19_0= ruleString0 ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:504:1: ( () otherlv_1= 'Element1Choice' otherlv_2= '{' (otherlv_3= 'repeatableElement1' otherlv_4= '{' ( (lv_repeatableElement1_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_repeatableElement1_7_0= ruleString0 ) ) )* otherlv_8= '}' )? (otherlv_9= 'repeatableElement2' otherlv_10= '{' ( (lv_repeatableElement2_11_0= ruleString0 ) ) (otherlv_12= ',' ( (lv_repeatableElement2_13_0= ruleString0 ) ) )* otherlv_14= '}' )? (otherlv_15= 'repeatableElement3' otherlv_16= '{' ( (lv_repeatableElement3_17_0= ruleString0 ) ) (otherlv_18= ',' ( (lv_repeatableElement3_19_0= ruleString0 ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:504:1: ( () otherlv_1= 'Element1Choice' otherlv_2= '{' (otherlv_3= 'repeatableElement1' otherlv_4= '{' ( (lv_repeatableElement1_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_repeatableElement1_7_0= ruleString0 ) ) )* otherlv_8= '}' )? (otherlv_9= 'repeatableElement2' otherlv_10= '{' ( (lv_repeatableElement2_11_0= ruleString0 ) ) (otherlv_12= ',' ( (lv_repeatableElement2_13_0= ruleString0 ) ) )* otherlv_14= '}' )? (otherlv_15= 'repeatableElement3' otherlv_16= '{' ( (lv_repeatableElement3_17_0= ruleString0 ) ) (otherlv_18= ',' ( (lv_repeatableElement3_19_0= ruleString0 ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:504:2: () otherlv_1= 'Element1Choice' otherlv_2= '{' (otherlv_3= 'repeatableElement1' otherlv_4= '{' ( (lv_repeatableElement1_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_repeatableElement1_7_0= ruleString0 ) ) )* otherlv_8= '}' )? (otherlv_9= 'repeatableElement2' otherlv_10= '{' ( (lv_repeatableElement2_11_0= ruleString0 ) ) (otherlv_12= ',' ( (lv_repeatableElement2_13_0= ruleString0 ) ) )* otherlv_14= '}' )? (otherlv_15= 'repeatableElement3' otherlv_16= '{' ( (lv_repeatableElement3_17_0= ruleString0 ) ) (otherlv_18= ',' ( (lv_repeatableElement3_19_0= ruleString0 ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:504:2: ()
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:505:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getElement1ChoiceAccess().getElement1ChoiceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleElement1Choice1039); 

                	newLeafNode(otherlv_1, grammarAccess.getElement1ChoiceAccess().getElement1ChoiceKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleElement1Choice1051); 

                	newLeafNode(otherlv_2, grammarAccess.getElement1ChoiceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:518:1: (otherlv_3= 'repeatableElement1' otherlv_4= '{' ( (lv_repeatableElement1_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_repeatableElement1_7_0= ruleString0 ) ) )* otherlv_8= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:518:3: otherlv_3= 'repeatableElement1' otherlv_4= '{' ( (lv_repeatableElement1_5_0= ruleString0 ) ) (otherlv_6= ',' ( (lv_repeatableElement1_7_0= ruleString0 ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleElement1Choice1064); 

                        	newLeafNode(otherlv_3, grammarAccess.getElement1ChoiceAccess().getRepeatableElement1Keyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleElement1Choice1076); 

                        	newLeafNode(otherlv_4, grammarAccess.getElement1ChoiceAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:526:1: ( (lv_repeatableElement1_5_0= ruleString0 ) )
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:527:1: (lv_repeatableElement1_5_0= ruleString0 )
                    {
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:527:1: (lv_repeatableElement1_5_0= ruleString0 )
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:528:3: lv_repeatableElement1_5_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getElement1ChoiceAccess().getRepeatableElement1String0ParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleElement1Choice1097);
                    lv_repeatableElement1_5_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getElement1ChoiceRule());
                    	        }
                           		add(
                           			current, 
                           			"repeatableElement1",
                            		lv_repeatableElement1_5_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:544:2: (otherlv_6= ',' ( (lv_repeatableElement1_7_0= ruleString0 ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==21) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:544:4: otherlv_6= ',' ( (lv_repeatableElement1_7_0= ruleString0 ) )
                    	    {
                    	    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleElement1Choice1110); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getElement1ChoiceAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:548:1: ( (lv_repeatableElement1_7_0= ruleString0 ) )
                    	    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:549:1: (lv_repeatableElement1_7_0= ruleString0 )
                    	    {
                    	    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:549:1: (lv_repeatableElement1_7_0= ruleString0 )
                    	    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:550:3: lv_repeatableElement1_7_0= ruleString0
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getElement1ChoiceAccess().getRepeatableElement1String0ParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleElement1Choice1131);
                    	    lv_repeatableElement1_7_0=ruleString0();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getElement1ChoiceRule());
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
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleElement1Choice1145); 

                        	newLeafNode(otherlv_8, grammarAccess.getElement1ChoiceAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:570:3: (otherlv_9= 'repeatableElement2' otherlv_10= '{' ( (lv_repeatableElement2_11_0= ruleString0 ) ) (otherlv_12= ',' ( (lv_repeatableElement2_13_0= ruleString0 ) ) )* otherlv_14= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:570:5: otherlv_9= 'repeatableElement2' otherlv_10= '{' ( (lv_repeatableElement2_11_0= ruleString0 ) ) (otherlv_12= ',' ( (lv_repeatableElement2_13_0= ruleString0 ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleElement1Choice1160); 

                        	newLeafNode(otherlv_9, grammarAccess.getElement1ChoiceAccess().getRepeatableElement2Keyword_4_0());
                        
                    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleElement1Choice1172); 

                        	newLeafNode(otherlv_10, grammarAccess.getElement1ChoiceAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:578:1: ( (lv_repeatableElement2_11_0= ruleString0 ) )
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:579:1: (lv_repeatableElement2_11_0= ruleString0 )
                    {
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:579:1: (lv_repeatableElement2_11_0= ruleString0 )
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:580:3: lv_repeatableElement2_11_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getElement1ChoiceAccess().getRepeatableElement2String0ParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleElement1Choice1193);
                    lv_repeatableElement2_11_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getElement1ChoiceRule());
                    	        }
                           		add(
                           			current, 
                           			"repeatableElement2",
                            		lv_repeatableElement2_11_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:596:2: (otherlv_12= ',' ( (lv_repeatableElement2_13_0= ruleString0 ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==21) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:596:4: otherlv_12= ',' ( (lv_repeatableElement2_13_0= ruleString0 ) )
                    	    {
                    	    otherlv_12=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleElement1Choice1206); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getElement1ChoiceAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:600:1: ( (lv_repeatableElement2_13_0= ruleString0 ) )
                    	    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:601:1: (lv_repeatableElement2_13_0= ruleString0 )
                    	    {
                    	    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:601:1: (lv_repeatableElement2_13_0= ruleString0 )
                    	    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:602:3: lv_repeatableElement2_13_0= ruleString0
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getElement1ChoiceAccess().getRepeatableElement2String0ParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleElement1Choice1227);
                    	    lv_repeatableElement2_13_0=ruleString0();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getElement1ChoiceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"repeatableElement2",
                    	            		lv_repeatableElement2_13_0, 
                    	            		"String0");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleElement1Choice1241); 

                        	newLeafNode(otherlv_14, grammarAccess.getElement1ChoiceAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:622:3: (otherlv_15= 'repeatableElement3' otherlv_16= '{' ( (lv_repeatableElement3_17_0= ruleString0 ) ) (otherlv_18= ',' ( (lv_repeatableElement3_19_0= ruleString0 ) ) )* otherlv_20= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:622:5: otherlv_15= 'repeatableElement3' otherlv_16= '{' ( (lv_repeatableElement3_17_0= ruleString0 ) ) (otherlv_18= ',' ( (lv_repeatableElement3_19_0= ruleString0 ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleElement1Choice1256); 

                        	newLeafNode(otherlv_15, grammarAccess.getElement1ChoiceAccess().getRepeatableElement3Keyword_5_0());
                        
                    otherlv_16=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleElement1Choice1268); 

                        	newLeafNode(otherlv_16, grammarAccess.getElement1ChoiceAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:630:1: ( (lv_repeatableElement3_17_0= ruleString0 ) )
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:631:1: (lv_repeatableElement3_17_0= ruleString0 )
                    {
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:631:1: (lv_repeatableElement3_17_0= ruleString0 )
                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:632:3: lv_repeatableElement3_17_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getElement1ChoiceAccess().getRepeatableElement3String0ParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleElement1Choice1289);
                    lv_repeatableElement3_17_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getElement1ChoiceRule());
                    	        }
                           		add(
                           			current, 
                           			"repeatableElement3",
                            		lv_repeatableElement3_17_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:648:2: (otherlv_18= ',' ( (lv_repeatableElement3_19_0= ruleString0 ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==21) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:648:4: otherlv_18= ',' ( (lv_repeatableElement3_19_0= ruleString0 ) )
                    	    {
                    	    otherlv_18=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleElement1Choice1302); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getElement1ChoiceAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:652:1: ( (lv_repeatableElement3_19_0= ruleString0 ) )
                    	    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:653:1: (lv_repeatableElement3_19_0= ruleString0 )
                    	    {
                    	    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:653:1: (lv_repeatableElement3_19_0= ruleString0 )
                    	    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:654:3: lv_repeatableElement3_19_0= ruleString0
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getElement1ChoiceAccess().getRepeatableElement3String0ParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleElement1Choice1323);
                    	    lv_repeatableElement3_19_0=ruleString0();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getElement1ChoiceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"repeatableElement3",
                    	            		lv_repeatableElement3_19_0, 
                    	            		"String0");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleElement1Choice1337); 

                        	newLeafNode(otherlv_20, grammarAccess.getElement1ChoiceAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleElement1Choice1351); 

                	newLeafNode(otherlv_21, grammarAccess.getElement1ChoiceAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleElement1Choice"


    // $ANTLR start "entryRuleString0"
    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:686:1: entryRuleString0 returns [String current=null] : iv_ruleString0= ruleString0 EOF ;
    public final String entryRuleString0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleString0 = null;


        try {
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:687:2: (iv_ruleString0= ruleString0 EOF )
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:688:2: iv_ruleString0= ruleString0 EOF
            {
             newCompositeNode(grammarAccess.getString0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_entryRuleString01388);
            iv_ruleString0=ruleString0();

            state._fsp--;

             current =iv_ruleString0.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleString01399); 

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
    // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:695:1: ruleString0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'String' ;
    public final AntlrDatatypeRuleToken ruleString0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:698:28: (kw= 'String' )
            // ../org.xtext.example.mydsl.group/src-gen/org/xtext/example/mydsl1/group/parser/antlr/internal/InternalMyDsl.g:700:2: kw= 'String'
            {
            kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleString01436); 

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
        public static final BitSet FOLLOW_14_in_ruleRootElementType179 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleElement2_in_ruleRootElementType200 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRootElementType212 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleElement3_in_ruleRootElementType233 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRootElementType245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement1_in_entryRuleElement1281 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElement1291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleElement1337 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleElement1349 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_18_in_ruleElement1362 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleElement1Choice_in_ruleElement1383 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleElement1397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement2_in_entryRuleElement2433 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElement2443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleElement2480 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleElement2492 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleElement2504 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleElement2516 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleString0_in_ruleElement2537 = new BitSet(new long[]{0x0000000000210000L});
        public static final BitSet FOLLOW_21_in_ruleElement2550 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleString0_in_ruleElement2571 = new BitSet(new long[]{0x0000000000210000L});
        public static final BitSet FOLLOW_16_in_ruleElement2585 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleElement2597 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleString0_in_ruleElement2618 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleElement2630 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleString0_in_ruleElement2651 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleElement2663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement3_in_entryRuleElement3699 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElement3709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleElement3755 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleElement3767 = new BitSet(new long[]{0x000000000E010000L});
        public static final BitSet FOLLOW_25_in_ruleElement3780 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleElement3792 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleString0_in_ruleElement3813 = new BitSet(new long[]{0x0000000000210000L});
        public static final BitSet FOLLOW_21_in_ruleElement3826 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleString0_in_ruleElement3847 = new BitSet(new long[]{0x0000000000210000L});
        public static final BitSet FOLLOW_16_in_ruleElement3861 = new BitSet(new long[]{0x000000000C010000L});
        public static final BitSet FOLLOW_26_in_ruleElement3876 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleString0_in_ruleElement3897 = new BitSet(new long[]{0x0000000008010000L});
        public static final BitSet FOLLOW_27_in_ruleElement3912 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleString0_in_ruleElement3933 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleElement3947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement1Choice_in_entryRuleElement1Choice983 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElement1Choice993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleElement1Choice1039 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleElement1Choice1051 = new BitSet(new long[]{0x000000000E010000L});
        public static final BitSet FOLLOW_25_in_ruleElement1Choice1064 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleElement1Choice1076 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleString0_in_ruleElement1Choice1097 = new BitSet(new long[]{0x0000000000210000L});
        public static final BitSet FOLLOW_21_in_ruleElement1Choice1110 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleString0_in_ruleElement1Choice1131 = new BitSet(new long[]{0x0000000000210000L});
        public static final BitSet FOLLOW_16_in_ruleElement1Choice1145 = new BitSet(new long[]{0x000000000C010000L});
        public static final BitSet FOLLOW_26_in_ruleElement1Choice1160 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleElement1Choice1172 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleString0_in_ruleElement1Choice1193 = new BitSet(new long[]{0x0000000000210000L});
        public static final BitSet FOLLOW_21_in_ruleElement1Choice1206 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleString0_in_ruleElement1Choice1227 = new BitSet(new long[]{0x0000000000210000L});
        public static final BitSet FOLLOW_16_in_ruleElement1Choice1241 = new BitSet(new long[]{0x0000000008010000L});
        public static final BitSet FOLLOW_27_in_ruleElement1Choice1256 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleElement1Choice1268 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleString0_in_ruleElement1Choice1289 = new BitSet(new long[]{0x0000000000210000L});
        public static final BitSet FOLLOW_21_in_ruleElement1Choice1302 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleString0_in_ruleElement1Choice1323 = new BitSet(new long[]{0x0000000000210000L});
        public static final BitSet FOLLOW_16_in_ruleElement1Choice1337 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleElement1Choice1351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString01388 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString01399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleString01436 = new BitSet(new long[]{0x0000000000000002L});
    }


}