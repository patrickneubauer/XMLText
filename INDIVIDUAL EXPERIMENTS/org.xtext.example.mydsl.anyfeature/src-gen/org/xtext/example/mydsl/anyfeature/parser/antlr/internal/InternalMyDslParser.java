package org.xtext.example.mydsl.anyfeature.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.anyfeature.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RootElementType'", "'{'", "'element1'", "'properties'", "'}'", "'Element1'", "'city'", "'street'", "'Properties'"
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
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g"; }



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
    // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleRootElementType returns [EObject current=null] : iv_ruleRootElementType= ruleRootElementType EOF ;
    public final EObject entryRuleRootElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootElementType = null;


        try {
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleRootElementType= ruleRootElementType EOF )
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleRootElementType= ruleRootElementType EOF
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
    // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:76:1: ruleRootElementType returns [EObject current=null] : (otherlv_0= 'RootElementType' otherlv_1= '{' otherlv_2= 'element1' ( (lv_element1_3_0= ruleElement1 ) ) (otherlv_4= 'properties' ( (lv_properties_5_0= ruleProperties ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleRootElementType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_element1_3_0 = null;

        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:79:28: ( (otherlv_0= 'RootElementType' otherlv_1= '{' otherlv_2= 'element1' ( (lv_element1_3_0= ruleElement1 ) ) (otherlv_4= 'properties' ( (lv_properties_5_0= ruleProperties ) ) )? otherlv_6= '}' ) )
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'RootElementType' otherlv_1= '{' otherlv_2= 'element1' ( (lv_element1_3_0= ruleElement1 ) ) (otherlv_4= 'properties' ( (lv_properties_5_0= ruleProperties ) ) )? otherlv_6= '}' )
            {
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'RootElementType' otherlv_1= '{' otherlv_2= 'element1' ( (lv_element1_3_0= ruleElement1 ) ) (otherlv_4= 'properties' ( (lv_properties_5_0= ruleProperties ) ) )? otherlv_6= '}' )
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:80:3: otherlv_0= 'RootElementType' otherlv_1= '{' otherlv_2= 'element1' ( (lv_element1_3_0= ruleElement1 ) ) (otherlv_4= 'properties' ( (lv_properties_5_0= ruleProperties ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRootElementType122); 

                	newLeafNode(otherlv_0, grammarAccess.getRootElementTypeAccess().getRootElementTypeKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRootElementType134); 

                	newLeafNode(otherlv_1, grammarAccess.getRootElementTypeAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRootElementType146); 

                	newLeafNode(otherlv_2, grammarAccess.getRootElementTypeAccess().getElement1Keyword_2());
                
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:92:1: ( (lv_element1_3_0= ruleElement1 ) )
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:93:1: (lv_element1_3_0= ruleElement1 )
            {
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:93:1: (lv_element1_3_0= ruleElement1 )
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:94:3: lv_element1_3_0= ruleElement1
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

            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:110:2: (otherlv_4= 'properties' ( (lv_properties_5_0= ruleProperties ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:110:4: otherlv_4= 'properties' ( (lv_properties_5_0= ruleProperties ) )
                    {
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRootElementType180); 

                        	newLeafNode(otherlv_4, grammarAccess.getRootElementTypeAccess().getPropertiesKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:114:1: ( (lv_properties_5_0= ruleProperties ) )
                    // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:115:1: (lv_properties_5_0= ruleProperties )
                    {
                    // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:115:1: (lv_properties_5_0= ruleProperties )
                    // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:116:3: lv_properties_5_0= ruleProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getRootElementTypeAccess().getPropertiesPropertiesParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleProperties_in_ruleRootElementType201);
                    lv_properties_5_0=ruleProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRootElementTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"properties",
                            		lv_properties_5_0, 
                            		"Properties");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRootElementType215); 

                	newLeafNode(otherlv_6, grammarAccess.getRootElementTypeAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:144:1: entryRuleElement1 returns [EObject current=null] : iv_ruleElement1= ruleElement1 EOF ;
    public final EObject entryRuleElement1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement1 = null;


        try {
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:145:2: (iv_ruleElement1= ruleElement1 EOF )
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:146:2: iv_ruleElement1= ruleElement1 EOF
            {
             newCompositeNode(grammarAccess.getElement1Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement1_in_entryRuleElement1251);
            iv_ruleElement1=ruleElement1();

            state._fsp--;

             current =iv_ruleElement1; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElement1261); 

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
    // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:153:1: ruleElement1 returns [EObject current=null] : ( () otherlv_1= 'Element1' otherlv_2= '{' (otherlv_3= 'city' ( (lv_city_4_0= ruleString0 ) ) )? (otherlv_5= 'street' ( (lv_street_6_0= ruleString0 ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleElement1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_city_4_0 = null;

        AntlrDatatypeRuleToken lv_street_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:156:28: ( ( () otherlv_1= 'Element1' otherlv_2= '{' (otherlv_3= 'city' ( (lv_city_4_0= ruleString0 ) ) )? (otherlv_5= 'street' ( (lv_street_6_0= ruleString0 ) ) )? otherlv_7= '}' ) )
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:157:1: ( () otherlv_1= 'Element1' otherlv_2= '{' (otherlv_3= 'city' ( (lv_city_4_0= ruleString0 ) ) )? (otherlv_5= 'street' ( (lv_street_6_0= ruleString0 ) ) )? otherlv_7= '}' )
            {
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:157:1: ( () otherlv_1= 'Element1' otherlv_2= '{' (otherlv_3= 'city' ( (lv_city_4_0= ruleString0 ) ) )? (otherlv_5= 'street' ( (lv_street_6_0= ruleString0 ) ) )? otherlv_7= '}' )
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:157:2: () otherlv_1= 'Element1' otherlv_2= '{' (otherlv_3= 'city' ( (lv_city_4_0= ruleString0 ) ) )? (otherlv_5= 'street' ( (lv_street_6_0= ruleString0 ) ) )? otherlv_7= '}'
            {
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:157:2: ()
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:158:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getElement1Access().getElement1Action_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleElement1307); 

                	newLeafNode(otherlv_1, grammarAccess.getElement1Access().getElement1Keyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleElement1319); 

                	newLeafNode(otherlv_2, grammarAccess.getElement1Access().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:171:1: (otherlv_3= 'city' ( (lv_city_4_0= ruleString0 ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:171:3: otherlv_3= 'city' ( (lv_city_4_0= ruleString0 ) )
                    {
                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleElement1332); 

                        	newLeafNode(otherlv_3, grammarAccess.getElement1Access().getCityKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:175:1: ( (lv_city_4_0= ruleString0 ) )
                    // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:176:1: (lv_city_4_0= ruleString0 )
                    {
                    // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:176:1: (lv_city_4_0= ruleString0 )
                    // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:177:3: lv_city_4_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getElement1Access().getCityString0ParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleElement1353);
                    lv_city_4_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getElement1Rule());
                    	        }
                           		set(
                           			current, 
                           			"city",
                            		lv_city_4_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:193:4: (otherlv_5= 'street' ( (lv_street_6_0= ruleString0 ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:193:6: otherlv_5= 'street' ( (lv_street_6_0= ruleString0 ) )
                    {
                    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleElement1368); 

                        	newLeafNode(otherlv_5, grammarAccess.getElement1Access().getStreetKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:197:1: ( (lv_street_6_0= ruleString0 ) )
                    // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:198:1: (lv_street_6_0= ruleString0 )
                    {
                    // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:198:1: (lv_street_6_0= ruleString0 )
                    // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:199:3: lv_street_6_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getElement1Access().getStreetString0ParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleElement1389);
                    lv_street_6_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getElement1Rule());
                    	        }
                           		set(
                           			current, 
                           			"street",
                            		lv_street_6_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleElement1403); 

                	newLeafNode(otherlv_7, grammarAccess.getElement1Access().getRightCurlyBracketKeyword_5());
                

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


    // $ANTLR start "entryRuleProperties"
    // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:227:1: entryRuleProperties returns [EObject current=null] : iv_ruleProperties= ruleProperties EOF ;
    public final EObject entryRuleProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperties = null;


        try {
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:228:2: (iv_ruleProperties= ruleProperties EOF )
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:229:2: iv_ruleProperties= ruleProperties EOF
            {
             newCompositeNode(grammarAccess.getPropertiesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperties_in_entryRuleProperties439);
            iv_ruleProperties=ruleProperties();

            state._fsp--;

             current =iv_ruleProperties; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProperties449); 

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
    // $ANTLR end "entryRuleProperties"


    // $ANTLR start "ruleProperties"
    // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:236:1: ruleProperties returns [EObject current=null] : ( () otherlv_1= 'Properties' ( (lv_any_2_0= ruleEFeatureMapEntry ) )? ) ;
    public final EObject ruleProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_any_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:239:28: ( ( () otherlv_1= 'Properties' ( (lv_any_2_0= ruleEFeatureMapEntry ) )? ) )
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:240:1: ( () otherlv_1= 'Properties' ( (lv_any_2_0= ruleEFeatureMapEntry ) )? )
            {
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:240:1: ( () otherlv_1= 'Properties' ( (lv_any_2_0= ruleEFeatureMapEntry ) )? )
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:240:2: () otherlv_1= 'Properties' ( (lv_any_2_0= ruleEFeatureMapEntry ) )?
            {
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:240:2: ()
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:241:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPropertiesAccess().getPropertiesAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleProperties495); 

                	newLeafNode(otherlv_1, grammarAccess.getPropertiesAccess().getPropertiesKeyword_1());
                
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:250:1: ( (lv_any_2_0= ruleEFeatureMapEntry ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:251:1: (lv_any_2_0= ruleEFeatureMapEntry )
                    {
                    // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:251:1: (lv_any_2_0= ruleEFeatureMapEntry )
                    // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:252:3: lv_any_2_0= ruleEFeatureMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertiesAccess().getAnyEFeatureMapEntryParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEFeatureMapEntry_in_ruleProperties516);
                    lv_any_2_0=ruleEFeatureMapEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertiesRule());
                    	        }
                           		add(
                           			current, 
                           			"any",
                            		lv_any_2_0, 
                            		"EFeatureMapEntry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

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
    // $ANTLR end "ruleProperties"


    // $ANTLR start "entryRuleEFeatureMapEntry"
    // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:276:1: entryRuleEFeatureMapEntry returns [String current=null] : iv_ruleEFeatureMapEntry= ruleEFeatureMapEntry EOF ;
    public final String entryRuleEFeatureMapEntry() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFeatureMapEntry = null;


        try {
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:277:2: (iv_ruleEFeatureMapEntry= ruleEFeatureMapEntry EOF )
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:278:2: iv_ruleEFeatureMapEntry= ruleEFeatureMapEntry EOF
            {
             newCompositeNode(grammarAccess.getEFeatureMapEntryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFeatureMapEntry_in_entryRuleEFeatureMapEntry554);
            iv_ruleEFeatureMapEntry=ruleEFeatureMapEntry();

            state._fsp--;

             current =iv_ruleEFeatureMapEntry.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEFeatureMapEntry565); 

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
    // $ANTLR end "entryRuleEFeatureMapEntry"


    // $ANTLR start "ruleEFeatureMapEntry"
    // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:285:1: ruleEFeatureMapEntry returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEFeatureMapEntry() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:288:28: (this_STRING_0= RULE_STRING )
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:289:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEFeatureMapEntry604); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getEFeatureMapEntryAccess().getSTRINGTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleEFeatureMapEntry"


    // $ANTLR start "entryRuleString0"
    // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:304:1: entryRuleString0 returns [String current=null] : iv_ruleString0= ruleString0 EOF ;
    public final String entryRuleString0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleString0 = null;


        try {
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:305:2: (iv_ruleString0= ruleString0 EOF )
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:306:2: iv_ruleString0= ruleString0 EOF
            {
             newCompositeNode(grammarAccess.getString0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_entryRuleString0649);
            iv_ruleString0=ruleString0();

            state._fsp--;

             current =iv_ruleString0.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleString0660); 

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
    // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:313:1: ruleString0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleString0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:316:28: (this_STRING_0= RULE_STRING )
            // ../org.xtext.example.mydsl.anyfeature/src-gen/org/xtext/example/mydsl/anyfeature/parser/antlr/internal/InternalMyDsl.g:317:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleString0699); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getString0Access().getSTRINGTerminalRuleCall()); 
                

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
        public static final BitSet FOLLOW_13_in_ruleRootElementType146 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_ruleElement1_in_ruleRootElementType167 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleRootElementType180 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleProperties_in_ruleRootElementType201 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRootElementType215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement1_in_entryRuleElement1251 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElement1261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleElement1307 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleElement1319 = new BitSet(new long[]{0x0000000000068000L});
        public static final BitSet FOLLOW_17_in_ruleElement1332 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleElement1353 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_18_in_ruleElement1368 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleElement1389 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleElement1403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperties_in_entryRuleProperties439 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperties449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleProperties495 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_ruleEFeatureMapEntry_in_ruleProperties516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFeatureMapEntry_in_entryRuleEFeatureMapEntry554 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFeatureMapEntry565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEFeatureMapEntry604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString0649 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString0660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleString0699 = new BitSet(new long[]{0x0000000000000002L});
    }


}