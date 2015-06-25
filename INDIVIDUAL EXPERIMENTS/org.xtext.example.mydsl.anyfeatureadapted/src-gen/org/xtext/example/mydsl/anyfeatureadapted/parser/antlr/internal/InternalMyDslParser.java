package org.xtext.example.mydsl.anyfeatureadapted.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.anyfeatureadapted.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RootElementType'", "'{'", "'element1'", "'properties'", "'}'", "'Element1'", "'city'", "'street'", "'Properties'", "'anyGenericElem'", "','", "'AnyGenericElement'", "'elemName'", "'elemValue'", "'anyGenericAttr'", "'childElem'", "'AnyGenericText'", "'textValue'", "'AnyGenericAttribute'", "'attrName'", "'attrValue'"
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
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g"; }



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
    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleRootElementType returns [EObject current=null] : iv_ruleRootElementType= ruleRootElementType EOF ;
    public final EObject entryRuleRootElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootElementType = null;


        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleRootElementType= ruleRootElementType EOF )
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleRootElementType= ruleRootElementType EOF
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
    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:76:1: ruleRootElementType returns [EObject current=null] : (otherlv_0= 'RootElementType' otherlv_1= '{' otherlv_2= 'element1' ( (lv_element1_3_0= ruleElement1 ) ) (otherlv_4= 'properties' ( (lv_properties_5_0= ruleProperties ) ) )? otherlv_6= '}' ) ;
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
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:79:28: ( (otherlv_0= 'RootElementType' otherlv_1= '{' otherlv_2= 'element1' ( (lv_element1_3_0= ruleElement1 ) ) (otherlv_4= 'properties' ( (lv_properties_5_0= ruleProperties ) ) )? otherlv_6= '}' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'RootElementType' otherlv_1= '{' otherlv_2= 'element1' ( (lv_element1_3_0= ruleElement1 ) ) (otherlv_4= 'properties' ( (lv_properties_5_0= ruleProperties ) ) )? otherlv_6= '}' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'RootElementType' otherlv_1= '{' otherlv_2= 'element1' ( (lv_element1_3_0= ruleElement1 ) ) (otherlv_4= 'properties' ( (lv_properties_5_0= ruleProperties ) ) )? otherlv_6= '}' )
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:80:3: otherlv_0= 'RootElementType' otherlv_1= '{' otherlv_2= 'element1' ( (lv_element1_3_0= ruleElement1 ) ) (otherlv_4= 'properties' ( (lv_properties_5_0= ruleProperties ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRootElementType122); 

                	newLeafNode(otherlv_0, grammarAccess.getRootElementTypeAccess().getRootElementTypeKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRootElementType134); 

                	newLeafNode(otherlv_1, grammarAccess.getRootElementTypeAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRootElementType146); 

                	newLeafNode(otherlv_2, grammarAccess.getRootElementTypeAccess().getElement1Keyword_2());
                
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:92:1: ( (lv_element1_3_0= ruleElement1 ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:93:1: (lv_element1_3_0= ruleElement1 )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:93:1: (lv_element1_3_0= ruleElement1 )
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:94:3: lv_element1_3_0= ruleElement1
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

            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:110:2: (otherlv_4= 'properties' ( (lv_properties_5_0= ruleProperties ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:110:4: otherlv_4= 'properties' ( (lv_properties_5_0= ruleProperties ) )
                    {
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRootElementType180); 

                        	newLeafNode(otherlv_4, grammarAccess.getRootElementTypeAccess().getPropertiesKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:114:1: ( (lv_properties_5_0= ruleProperties ) )
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:115:1: (lv_properties_5_0= ruleProperties )
                    {
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:115:1: (lv_properties_5_0= ruleProperties )
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:116:3: lv_properties_5_0= ruleProperties
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


    // $ANTLR start "entryRuleAnyGenericConstruct"
    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:144:1: entryRuleAnyGenericConstruct returns [EObject current=null] : iv_ruleAnyGenericConstruct= ruleAnyGenericConstruct EOF ;
    public final EObject entryRuleAnyGenericConstruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyGenericConstruct = null;


        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:145:2: (iv_ruleAnyGenericConstruct= ruleAnyGenericConstruct EOF )
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:146:2: iv_ruleAnyGenericConstruct= ruleAnyGenericConstruct EOF
            {
             newCompositeNode(grammarAccess.getAnyGenericConstructRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyGenericConstruct_in_entryRuleAnyGenericConstruct251);
            iv_ruleAnyGenericConstruct=ruleAnyGenericConstruct();

            state._fsp--;

             current =iv_ruleAnyGenericConstruct; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnyGenericConstruct261); 

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
    // $ANTLR end "entryRuleAnyGenericConstruct"


    // $ANTLR start "ruleAnyGenericConstruct"
    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:153:1: ruleAnyGenericConstruct returns [EObject current=null] : (this_AnyGenericElement_0= ruleAnyGenericElement | this_AnyGenericText_1= ruleAnyGenericText ) ;
    public final EObject ruleAnyGenericConstruct() throws RecognitionException {
        EObject current = null;

        EObject this_AnyGenericElement_0 = null;

        EObject this_AnyGenericText_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:156:28: ( (this_AnyGenericElement_0= ruleAnyGenericElement | this_AnyGenericText_1= ruleAnyGenericText ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:157:1: (this_AnyGenericElement_0= ruleAnyGenericElement | this_AnyGenericText_1= ruleAnyGenericText )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:157:1: (this_AnyGenericElement_0= ruleAnyGenericElement | this_AnyGenericText_1= ruleAnyGenericText )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            else if ( (LA2_0==27) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:158:5: this_AnyGenericElement_0= ruleAnyGenericElement
                    {
                     
                            newCompositeNode(grammarAccess.getAnyGenericConstructAccess().getAnyGenericElementParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnyGenericElement_in_ruleAnyGenericConstruct308);
                    this_AnyGenericElement_0=ruleAnyGenericElement();

                    state._fsp--;

                     
                            current = this_AnyGenericElement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:168:5: this_AnyGenericText_1= ruleAnyGenericText
                    {
                     
                            newCompositeNode(grammarAccess.getAnyGenericConstructAccess().getAnyGenericTextParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnyGenericText_in_ruleAnyGenericConstruct335);
                    this_AnyGenericText_1=ruleAnyGenericText();

                    state._fsp--;

                     
                            current = this_AnyGenericText_1; 
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
    // $ANTLR end "ruleAnyGenericConstruct"


    // $ANTLR start "entryRuleElement1"
    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:184:1: entryRuleElement1 returns [EObject current=null] : iv_ruleElement1= ruleElement1 EOF ;
    public final EObject entryRuleElement1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement1 = null;


        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:185:2: (iv_ruleElement1= ruleElement1 EOF )
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:186:2: iv_ruleElement1= ruleElement1 EOF
            {
             newCompositeNode(grammarAccess.getElement1Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement1_in_entryRuleElement1370);
            iv_ruleElement1=ruleElement1();

            state._fsp--;

             current =iv_ruleElement1; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElement1380); 

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
    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:193:1: ruleElement1 returns [EObject current=null] : ( () otherlv_1= 'Element1' otherlv_2= '{' (otherlv_3= 'city' ( (lv_city_4_0= RULE_STRING ) ) )? (otherlv_5= 'street' ( (lv_street_6_0= RULE_STRING ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleElement1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_city_4_0=null;
        Token otherlv_5=null;
        Token lv_street_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:196:28: ( ( () otherlv_1= 'Element1' otherlv_2= '{' (otherlv_3= 'city' ( (lv_city_4_0= RULE_STRING ) ) )? (otherlv_5= 'street' ( (lv_street_6_0= RULE_STRING ) ) )? otherlv_7= '}' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:197:1: ( () otherlv_1= 'Element1' otherlv_2= '{' (otherlv_3= 'city' ( (lv_city_4_0= RULE_STRING ) ) )? (otherlv_5= 'street' ( (lv_street_6_0= RULE_STRING ) ) )? otherlv_7= '}' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:197:1: ( () otherlv_1= 'Element1' otherlv_2= '{' (otherlv_3= 'city' ( (lv_city_4_0= RULE_STRING ) ) )? (otherlv_5= 'street' ( (lv_street_6_0= RULE_STRING ) ) )? otherlv_7= '}' )
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:197:2: () otherlv_1= 'Element1' otherlv_2= '{' (otherlv_3= 'city' ( (lv_city_4_0= RULE_STRING ) ) )? (otherlv_5= 'street' ( (lv_street_6_0= RULE_STRING ) ) )? otherlv_7= '}'
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:197:2: ()
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:198:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getElement1Access().getElement1Action_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleElement1426); 

                	newLeafNode(otherlv_1, grammarAccess.getElement1Access().getElement1Keyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleElement1438); 

                	newLeafNode(otherlv_2, grammarAccess.getElement1Access().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:211:1: (otherlv_3= 'city' ( (lv_city_4_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:211:3: otherlv_3= 'city' ( (lv_city_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleElement1451); 

                        	newLeafNode(otherlv_3, grammarAccess.getElement1Access().getCityKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:215:1: ( (lv_city_4_0= RULE_STRING ) )
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:216:1: (lv_city_4_0= RULE_STRING )
                    {
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:216:1: (lv_city_4_0= RULE_STRING )
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:217:3: lv_city_4_0= RULE_STRING
                    {
                    lv_city_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleElement1468); 

                    			newLeafNode(lv_city_4_0, grammarAccess.getElement1Access().getCitySTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getElement1Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"city",
                            		lv_city_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:233:4: (otherlv_5= 'street' ( (lv_street_6_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:233:6: otherlv_5= 'street' ( (lv_street_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleElement1488); 

                        	newLeafNode(otherlv_5, grammarAccess.getElement1Access().getStreetKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:237:1: ( (lv_street_6_0= RULE_STRING ) )
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:238:1: (lv_street_6_0= RULE_STRING )
                    {
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:238:1: (lv_street_6_0= RULE_STRING )
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:239:3: lv_street_6_0= RULE_STRING
                    {
                    lv_street_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleElement1505); 

                    			newLeafNode(lv_street_6_0, grammarAccess.getElement1Access().getStreetSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getElement1Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"street",
                            		lv_street_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleElement1524); 

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
    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:267:1: entryRuleProperties returns [EObject current=null] : iv_ruleProperties= ruleProperties EOF ;
    public final EObject entryRuleProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperties = null;


        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:268:2: (iv_ruleProperties= ruleProperties EOF )
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:269:2: iv_ruleProperties= ruleProperties EOF
            {
             newCompositeNode(grammarAccess.getPropertiesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperties_in_entryRuleProperties560);
            iv_ruleProperties=ruleProperties();

            state._fsp--;

             current =iv_ruleProperties; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProperties570); 

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
    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:276:1: ruleProperties returns [EObject current=null] : (otherlv_0= 'Properties' otherlv_1= '{' otherlv_2= 'anyGenericElem' otherlv_3= '{' ( (lv_anyGenericElem_4_0= ruleAnyGenericConstruct ) ) (otherlv_5= ',' ( (lv_anyGenericElem_6_0= ruleAnyGenericConstruct ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_anyGenericElem_4_0 = null;

        EObject lv_anyGenericElem_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:279:28: ( (otherlv_0= 'Properties' otherlv_1= '{' otherlv_2= 'anyGenericElem' otherlv_3= '{' ( (lv_anyGenericElem_4_0= ruleAnyGenericConstruct ) ) (otherlv_5= ',' ( (lv_anyGenericElem_6_0= ruleAnyGenericConstruct ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:280:1: (otherlv_0= 'Properties' otherlv_1= '{' otherlv_2= 'anyGenericElem' otherlv_3= '{' ( (lv_anyGenericElem_4_0= ruleAnyGenericConstruct ) ) (otherlv_5= ',' ( (lv_anyGenericElem_6_0= ruleAnyGenericConstruct ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:280:1: (otherlv_0= 'Properties' otherlv_1= '{' otherlv_2= 'anyGenericElem' otherlv_3= '{' ( (lv_anyGenericElem_4_0= ruleAnyGenericConstruct ) ) (otherlv_5= ',' ( (lv_anyGenericElem_6_0= ruleAnyGenericConstruct ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:280:3: otherlv_0= 'Properties' otherlv_1= '{' otherlv_2= 'anyGenericElem' otherlv_3= '{' ( (lv_anyGenericElem_4_0= ruleAnyGenericConstruct ) ) (otherlv_5= ',' ( (lv_anyGenericElem_6_0= ruleAnyGenericConstruct ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleProperties607); 

                	newLeafNode(otherlv_0, grammarAccess.getPropertiesAccess().getPropertiesKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleProperties619); 

                	newLeafNode(otherlv_1, grammarAccess.getPropertiesAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleProperties631); 

                	newLeafNode(otherlv_2, grammarAccess.getPropertiesAccess().getAnyGenericElemKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleProperties643); 

                	newLeafNode(otherlv_3, grammarAccess.getPropertiesAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:296:1: ( (lv_anyGenericElem_4_0= ruleAnyGenericConstruct ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:297:1: (lv_anyGenericElem_4_0= ruleAnyGenericConstruct )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:297:1: (lv_anyGenericElem_4_0= ruleAnyGenericConstruct )
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:298:3: lv_anyGenericElem_4_0= ruleAnyGenericConstruct
            {
             
            	        newCompositeNode(grammarAccess.getPropertiesAccess().getAnyGenericElemAnyGenericConstructParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnyGenericConstruct_in_ruleProperties664);
            lv_anyGenericElem_4_0=ruleAnyGenericConstruct();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertiesRule());
            	        }
                   		add(
                   			current, 
                   			"anyGenericElem",
                    		lv_anyGenericElem_4_0, 
                    		"AnyGenericConstruct");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:314:2: (otherlv_5= ',' ( (lv_anyGenericElem_6_0= ruleAnyGenericConstruct ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:314:4: otherlv_5= ',' ( (lv_anyGenericElem_6_0= ruleAnyGenericConstruct ) )
            	    {
            	    otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleProperties677); 

            	        	newLeafNode(otherlv_5, grammarAccess.getPropertiesAccess().getCommaKeyword_5_0());
            	        
            	    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:318:1: ( (lv_anyGenericElem_6_0= ruleAnyGenericConstruct ) )
            	    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:319:1: (lv_anyGenericElem_6_0= ruleAnyGenericConstruct )
            	    {
            	    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:319:1: (lv_anyGenericElem_6_0= ruleAnyGenericConstruct )
            	    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:320:3: lv_anyGenericElem_6_0= ruleAnyGenericConstruct
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertiesAccess().getAnyGenericElemAnyGenericConstructParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnyGenericConstruct_in_ruleProperties698);
            	    lv_anyGenericElem_6_0=ruleAnyGenericConstruct();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPropertiesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"anyGenericElem",
            	            		lv_anyGenericElem_6_0, 
            	            		"AnyGenericConstruct");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProperties712); 

                	newLeafNode(otherlv_7, grammarAccess.getPropertiesAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProperties724); 

                	newLeafNode(otherlv_8, grammarAccess.getPropertiesAccess().getRightCurlyBracketKeyword_7());
                

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


    // $ANTLR start "entryRuleAnyGenericElement"
    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:354:1: entryRuleAnyGenericElement returns [EObject current=null] : iv_ruleAnyGenericElement= ruleAnyGenericElement EOF ;
    public final EObject entryRuleAnyGenericElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyGenericElement = null;


        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:355:2: (iv_ruleAnyGenericElement= ruleAnyGenericElement EOF )
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:356:2: iv_ruleAnyGenericElement= ruleAnyGenericElement EOF
            {
             newCompositeNode(grammarAccess.getAnyGenericElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyGenericElement_in_entryRuleAnyGenericElement762);
            iv_ruleAnyGenericElement=ruleAnyGenericElement();

            state._fsp--;

             current =iv_ruleAnyGenericElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnyGenericElement772); 

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
    // $ANTLR end "entryRuleAnyGenericElement"


    // $ANTLR start "ruleAnyGenericElement"
    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:363:1: ruleAnyGenericElement returns [EObject current=null] : ( () otherlv_1= 'AnyGenericElement' otherlv_2= '{' (otherlv_3= 'elemName' ( (lv_elemName_4_0= RULE_STRING ) ) )? (otherlv_5= 'elemValue' ( (lv_elemValue_6_0= RULE_STRING ) ) )? (otherlv_7= 'anyGenericAttr' otherlv_8= '{' ( (lv_anyGenericAttr_9_0= ruleAnyGenericAttribute ) ) (otherlv_10= ',' ( (lv_anyGenericAttr_11_0= ruleAnyGenericAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'childElem' otherlv_14= '{' ( (lv_childElem_15_0= ruleAnyGenericElement ) ) (otherlv_16= ',' ( (lv_childElem_17_0= ruleAnyGenericElement ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) ;
    public final EObject ruleAnyGenericElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_elemName_4_0=null;
        Token otherlv_5=null;
        Token lv_elemValue_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        EObject lv_anyGenericAttr_9_0 = null;

        EObject lv_anyGenericAttr_11_0 = null;

        EObject lv_childElem_15_0 = null;

        EObject lv_childElem_17_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:366:28: ( ( () otherlv_1= 'AnyGenericElement' otherlv_2= '{' (otherlv_3= 'elemName' ( (lv_elemName_4_0= RULE_STRING ) ) )? (otherlv_5= 'elemValue' ( (lv_elemValue_6_0= RULE_STRING ) ) )? (otherlv_7= 'anyGenericAttr' otherlv_8= '{' ( (lv_anyGenericAttr_9_0= ruleAnyGenericAttribute ) ) (otherlv_10= ',' ( (lv_anyGenericAttr_11_0= ruleAnyGenericAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'childElem' otherlv_14= '{' ( (lv_childElem_15_0= ruleAnyGenericElement ) ) (otherlv_16= ',' ( (lv_childElem_17_0= ruleAnyGenericElement ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:367:1: ( () otherlv_1= 'AnyGenericElement' otherlv_2= '{' (otherlv_3= 'elemName' ( (lv_elemName_4_0= RULE_STRING ) ) )? (otherlv_5= 'elemValue' ( (lv_elemValue_6_0= RULE_STRING ) ) )? (otherlv_7= 'anyGenericAttr' otherlv_8= '{' ( (lv_anyGenericAttr_9_0= ruleAnyGenericAttribute ) ) (otherlv_10= ',' ( (lv_anyGenericAttr_11_0= ruleAnyGenericAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'childElem' otherlv_14= '{' ( (lv_childElem_15_0= ruleAnyGenericElement ) ) (otherlv_16= ',' ( (lv_childElem_17_0= ruleAnyGenericElement ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:367:1: ( () otherlv_1= 'AnyGenericElement' otherlv_2= '{' (otherlv_3= 'elemName' ( (lv_elemName_4_0= RULE_STRING ) ) )? (otherlv_5= 'elemValue' ( (lv_elemValue_6_0= RULE_STRING ) ) )? (otherlv_7= 'anyGenericAttr' otherlv_8= '{' ( (lv_anyGenericAttr_9_0= ruleAnyGenericAttribute ) ) (otherlv_10= ',' ( (lv_anyGenericAttr_11_0= ruleAnyGenericAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'childElem' otherlv_14= '{' ( (lv_childElem_15_0= ruleAnyGenericElement ) ) (otherlv_16= ',' ( (lv_childElem_17_0= ruleAnyGenericElement ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:367:2: () otherlv_1= 'AnyGenericElement' otherlv_2= '{' (otherlv_3= 'elemName' ( (lv_elemName_4_0= RULE_STRING ) ) )? (otherlv_5= 'elemValue' ( (lv_elemValue_6_0= RULE_STRING ) ) )? (otherlv_7= 'anyGenericAttr' otherlv_8= '{' ( (lv_anyGenericAttr_9_0= ruleAnyGenericAttribute ) ) (otherlv_10= ',' ( (lv_anyGenericAttr_11_0= ruleAnyGenericAttribute ) ) )* otherlv_12= '}' )? (otherlv_13= 'childElem' otherlv_14= '{' ( (lv_childElem_15_0= ruleAnyGenericElement ) ) (otherlv_16= ',' ( (lv_childElem_17_0= ruleAnyGenericElement ) ) )* otherlv_18= '}' )? otherlv_19= '}'
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:367:2: ()
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:368:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnyGenericElementAccess().getAnyGenericElementAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAnyGenericElement818); 

                	newLeafNode(otherlv_1, grammarAccess.getAnyGenericElementAccess().getAnyGenericElementKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAnyGenericElement830); 

                	newLeafNode(otherlv_2, grammarAccess.getAnyGenericElementAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:381:1: (otherlv_3= 'elemName' ( (lv_elemName_4_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:381:3: otherlv_3= 'elemName' ( (lv_elemName_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAnyGenericElement843); 

                        	newLeafNode(otherlv_3, grammarAccess.getAnyGenericElementAccess().getElemNameKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:385:1: ( (lv_elemName_4_0= RULE_STRING ) )
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:386:1: (lv_elemName_4_0= RULE_STRING )
                    {
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:386:1: (lv_elemName_4_0= RULE_STRING )
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:387:3: lv_elemName_4_0= RULE_STRING
                    {
                    lv_elemName_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAnyGenericElement860); 

                    			newLeafNode(lv_elemName_4_0, grammarAccess.getAnyGenericElementAccess().getElemNameSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnyGenericElementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"elemName",
                            		lv_elemName_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:403:4: (otherlv_5= 'elemValue' ( (lv_elemValue_6_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:403:6: otherlv_5= 'elemValue' ( (lv_elemValue_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAnyGenericElement880); 

                        	newLeafNode(otherlv_5, grammarAccess.getAnyGenericElementAccess().getElemValueKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:407:1: ( (lv_elemValue_6_0= RULE_STRING ) )
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:408:1: (lv_elemValue_6_0= RULE_STRING )
                    {
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:408:1: (lv_elemValue_6_0= RULE_STRING )
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:409:3: lv_elemValue_6_0= RULE_STRING
                    {
                    lv_elemValue_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAnyGenericElement897); 

                    			newLeafNode(lv_elemValue_6_0, grammarAccess.getAnyGenericElementAccess().getElemValueSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnyGenericElementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"elemValue",
                            		lv_elemValue_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:425:4: (otherlv_7= 'anyGenericAttr' otherlv_8= '{' ( (lv_anyGenericAttr_9_0= ruleAnyGenericAttribute ) ) (otherlv_10= ',' ( (lv_anyGenericAttr_11_0= ruleAnyGenericAttribute ) ) )* otherlv_12= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:425:6: otherlv_7= 'anyGenericAttr' otherlv_8= '{' ( (lv_anyGenericAttr_9_0= ruleAnyGenericAttribute ) ) (otherlv_10= ',' ( (lv_anyGenericAttr_11_0= ruleAnyGenericAttribute ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleAnyGenericElement917); 

                        	newLeafNode(otherlv_7, grammarAccess.getAnyGenericElementAccess().getAnyGenericAttrKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAnyGenericElement929); 

                        	newLeafNode(otherlv_8, grammarAccess.getAnyGenericElementAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:433:1: ( (lv_anyGenericAttr_9_0= ruleAnyGenericAttribute ) )
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:434:1: (lv_anyGenericAttr_9_0= ruleAnyGenericAttribute )
                    {
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:434:1: (lv_anyGenericAttr_9_0= ruleAnyGenericAttribute )
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:435:3: lv_anyGenericAttr_9_0= ruleAnyGenericAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnyGenericElementAccess().getAnyGenericAttrAnyGenericAttributeParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnyGenericAttribute_in_ruleAnyGenericElement950);
                    lv_anyGenericAttr_9_0=ruleAnyGenericAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnyGenericElementRule());
                    	        }
                           		add(
                           			current, 
                           			"anyGenericAttr",
                            		lv_anyGenericAttr_9_0, 
                            		"AnyGenericAttribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:451:2: (otherlv_10= ',' ( (lv_anyGenericAttr_11_0= ruleAnyGenericAttribute ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==21) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:451:4: otherlv_10= ',' ( (lv_anyGenericAttr_11_0= ruleAnyGenericAttribute ) )
                    	    {
                    	    otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnyGenericElement963); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getAnyGenericElementAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:455:1: ( (lv_anyGenericAttr_11_0= ruleAnyGenericAttribute ) )
                    	    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:456:1: (lv_anyGenericAttr_11_0= ruleAnyGenericAttribute )
                    	    {
                    	    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:456:1: (lv_anyGenericAttr_11_0= ruleAnyGenericAttribute )
                    	    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:457:3: lv_anyGenericAttr_11_0= ruleAnyGenericAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnyGenericElementAccess().getAnyGenericAttrAnyGenericAttributeParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnyGenericAttribute_in_ruleAnyGenericElement984);
                    	    lv_anyGenericAttr_11_0=ruleAnyGenericAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAnyGenericElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"anyGenericAttr",
                    	            		lv_anyGenericAttr_11_0, 
                    	            		"AnyGenericAttribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAnyGenericElement998); 

                        	newLeafNode(otherlv_12, grammarAccess.getAnyGenericElementAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:477:3: (otherlv_13= 'childElem' otherlv_14= '{' ( (lv_childElem_15_0= ruleAnyGenericElement ) ) (otherlv_16= ',' ( (lv_childElem_17_0= ruleAnyGenericElement ) ) )* otherlv_18= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:477:5: otherlv_13= 'childElem' otherlv_14= '{' ( (lv_childElem_15_0= ruleAnyGenericElement ) ) (otherlv_16= ',' ( (lv_childElem_17_0= ruleAnyGenericElement ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleAnyGenericElement1013); 

                        	newLeafNode(otherlv_13, grammarAccess.getAnyGenericElementAccess().getChildElemKeyword_6_0());
                        
                    otherlv_14=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAnyGenericElement1025); 

                        	newLeafNode(otherlv_14, grammarAccess.getAnyGenericElementAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:485:1: ( (lv_childElem_15_0= ruleAnyGenericElement ) )
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:486:1: (lv_childElem_15_0= ruleAnyGenericElement )
                    {
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:486:1: (lv_childElem_15_0= ruleAnyGenericElement )
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:487:3: lv_childElem_15_0= ruleAnyGenericElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnyGenericElementAccess().getChildElemAnyGenericElementParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnyGenericElement_in_ruleAnyGenericElement1046);
                    lv_childElem_15_0=ruleAnyGenericElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnyGenericElementRule());
                    	        }
                           		add(
                           			current, 
                           			"childElem",
                            		lv_childElem_15_0, 
                            		"AnyGenericElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:503:2: (otherlv_16= ',' ( (lv_childElem_17_0= ruleAnyGenericElement ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==21) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:503:4: otherlv_16= ',' ( (lv_childElem_17_0= ruleAnyGenericElement ) )
                    	    {
                    	    otherlv_16=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnyGenericElement1059); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getAnyGenericElementAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:507:1: ( (lv_childElem_17_0= ruleAnyGenericElement ) )
                    	    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:508:1: (lv_childElem_17_0= ruleAnyGenericElement )
                    	    {
                    	    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:508:1: (lv_childElem_17_0= ruleAnyGenericElement )
                    	    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:509:3: lv_childElem_17_0= ruleAnyGenericElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnyGenericElementAccess().getChildElemAnyGenericElementParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnyGenericElement_in_ruleAnyGenericElement1080);
                    	    lv_childElem_17_0=ruleAnyGenericElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAnyGenericElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"childElem",
                    	            		lv_childElem_17_0, 
                    	            		"AnyGenericElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAnyGenericElement1094); 

                        	newLeafNode(otherlv_18, grammarAccess.getAnyGenericElementAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_19=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAnyGenericElement1108); 

                	newLeafNode(otherlv_19, grammarAccess.getAnyGenericElementAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleAnyGenericElement"


    // $ANTLR start "entryRuleAnyGenericText"
    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:541:1: entryRuleAnyGenericText returns [EObject current=null] : iv_ruleAnyGenericText= ruleAnyGenericText EOF ;
    public final EObject entryRuleAnyGenericText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyGenericText = null;


        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:542:2: (iv_ruleAnyGenericText= ruleAnyGenericText EOF )
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:543:2: iv_ruleAnyGenericText= ruleAnyGenericText EOF
            {
             newCompositeNode(grammarAccess.getAnyGenericTextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyGenericText_in_entryRuleAnyGenericText1144);
            iv_ruleAnyGenericText=ruleAnyGenericText();

            state._fsp--;

             current =iv_ruleAnyGenericText; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnyGenericText1154); 

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
    // $ANTLR end "entryRuleAnyGenericText"


    // $ANTLR start "ruleAnyGenericText"
    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:550:1: ruleAnyGenericText returns [EObject current=null] : ( () otherlv_1= 'AnyGenericText' otherlv_2= '{' (otherlv_3= 'textValue' ( (lv_textValue_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleAnyGenericText() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_textValue_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:553:28: ( ( () otherlv_1= 'AnyGenericText' otherlv_2= '{' (otherlv_3= 'textValue' ( (lv_textValue_4_0= RULE_STRING ) ) )? otherlv_5= '}' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:554:1: ( () otherlv_1= 'AnyGenericText' otherlv_2= '{' (otherlv_3= 'textValue' ( (lv_textValue_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:554:1: ( () otherlv_1= 'AnyGenericText' otherlv_2= '{' (otherlv_3= 'textValue' ( (lv_textValue_4_0= RULE_STRING ) ) )? otherlv_5= '}' )
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:554:2: () otherlv_1= 'AnyGenericText' otherlv_2= '{' (otherlv_3= 'textValue' ( (lv_textValue_4_0= RULE_STRING ) ) )? otherlv_5= '}'
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:554:2: ()
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:555:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnyGenericTextAccess().getAnyGenericTextAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAnyGenericText1200); 

                	newLeafNode(otherlv_1, grammarAccess.getAnyGenericTextAccess().getAnyGenericTextKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAnyGenericText1212); 

                	newLeafNode(otherlv_2, grammarAccess.getAnyGenericTextAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:568:1: (otherlv_3= 'textValue' ( (lv_textValue_4_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:568:3: otherlv_3= 'textValue' ( (lv_textValue_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAnyGenericText1225); 

                        	newLeafNode(otherlv_3, grammarAccess.getAnyGenericTextAccess().getTextValueKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:572:1: ( (lv_textValue_4_0= RULE_STRING ) )
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:573:1: (lv_textValue_4_0= RULE_STRING )
                    {
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:573:1: (lv_textValue_4_0= RULE_STRING )
                    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:574:3: lv_textValue_4_0= RULE_STRING
                    {
                    lv_textValue_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAnyGenericText1242); 

                    			newLeafNode(lv_textValue_4_0, grammarAccess.getAnyGenericTextAccess().getTextValueSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnyGenericTextRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"textValue",
                            		lv_textValue_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAnyGenericText1261); 

                	newLeafNode(otherlv_5, grammarAccess.getAnyGenericTextAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleAnyGenericText"


    // $ANTLR start "entryRuleAnyGenericAttribute"
    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:602:1: entryRuleAnyGenericAttribute returns [EObject current=null] : iv_ruleAnyGenericAttribute= ruleAnyGenericAttribute EOF ;
    public final EObject entryRuleAnyGenericAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyGenericAttribute = null;


        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:603:2: (iv_ruleAnyGenericAttribute= ruleAnyGenericAttribute EOF )
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:604:2: iv_ruleAnyGenericAttribute= ruleAnyGenericAttribute EOF
            {
             newCompositeNode(grammarAccess.getAnyGenericAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnyGenericAttribute_in_entryRuleAnyGenericAttribute1297);
            iv_ruleAnyGenericAttribute=ruleAnyGenericAttribute();

            state._fsp--;

             current =iv_ruleAnyGenericAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnyGenericAttribute1307); 

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
    // $ANTLR end "entryRuleAnyGenericAttribute"


    // $ANTLR start "ruleAnyGenericAttribute"
    // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:611:1: ruleAnyGenericAttribute returns [EObject current=null] : (otherlv_0= 'AnyGenericAttribute' otherlv_1= '{' otherlv_2= 'attrName' ( (lv_attrName_3_0= RULE_STRING ) ) otherlv_4= 'attrValue' ( (lv_attrValue_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
    public final EObject ruleAnyGenericAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_attrName_3_0=null;
        Token otherlv_4=null;
        Token lv_attrValue_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:614:28: ( (otherlv_0= 'AnyGenericAttribute' otherlv_1= '{' otherlv_2= 'attrName' ( (lv_attrName_3_0= RULE_STRING ) ) otherlv_4= 'attrValue' ( (lv_attrValue_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:615:1: (otherlv_0= 'AnyGenericAttribute' otherlv_1= '{' otherlv_2= 'attrName' ( (lv_attrName_3_0= RULE_STRING ) ) otherlv_4= 'attrValue' ( (lv_attrValue_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:615:1: (otherlv_0= 'AnyGenericAttribute' otherlv_1= '{' otherlv_2= 'attrName' ( (lv_attrName_3_0= RULE_STRING ) ) otherlv_4= 'attrValue' ( (lv_attrValue_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:615:3: otherlv_0= 'AnyGenericAttribute' otherlv_1= '{' otherlv_2= 'attrName' ( (lv_attrName_3_0= RULE_STRING ) ) otherlv_4= 'attrValue' ( (lv_attrValue_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAnyGenericAttribute1344); 

                	newLeafNode(otherlv_0, grammarAccess.getAnyGenericAttributeAccess().getAnyGenericAttributeKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAnyGenericAttribute1356); 

                	newLeafNode(otherlv_1, grammarAccess.getAnyGenericAttributeAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAnyGenericAttribute1368); 

                	newLeafNode(otherlv_2, grammarAccess.getAnyGenericAttributeAccess().getAttrNameKeyword_2());
                
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:627:1: ( (lv_attrName_3_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:628:1: (lv_attrName_3_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:628:1: (lv_attrName_3_0= RULE_STRING )
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:629:3: lv_attrName_3_0= RULE_STRING
            {
            lv_attrName_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAnyGenericAttribute1385); 

            			newLeafNode(lv_attrName_3_0, grammarAccess.getAnyGenericAttributeAccess().getAttrNameSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnyGenericAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"attrName",
                    		lv_attrName_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleAnyGenericAttribute1402); 

                	newLeafNode(otherlv_4, grammarAccess.getAnyGenericAttributeAccess().getAttrValueKeyword_4());
                
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:649:1: ( (lv_attrValue_5_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:650:1: (lv_attrValue_5_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:650:1: (lv_attrValue_5_0= RULE_STRING )
            // ../org.xtext.example.mydsl.anyfeatureadapted/src-gen/org/xtext/example/mydsl/anyfeatureadapted/parser/antlr/internal/InternalMyDsl.g:651:3: lv_attrValue_5_0= RULE_STRING
            {
            lv_attrValue_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAnyGenericAttribute1419); 

            			newLeafNode(lv_attrValue_5_0, grammarAccess.getAnyGenericAttributeAccess().getAttrValueSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnyGenericAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"attrValue",
                    		lv_attrValue_5_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAnyGenericAttribute1436); 

                	newLeafNode(otherlv_6, grammarAccess.getAnyGenericAttributeAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleAnyGenericAttribute"

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
        public static final BitSet FOLLOW_ruleAnyGenericConstruct_in_entryRuleAnyGenericConstruct251 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnyGenericConstruct261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyGenericElement_in_ruleAnyGenericConstruct308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyGenericText_in_ruleAnyGenericConstruct335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement1_in_entryRuleElement1370 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElement1380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleElement1426 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleElement1438 = new BitSet(new long[]{0x0000000000068000L});
        public static final BitSet FOLLOW_17_in_ruleElement1451 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleElement1468 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_18_in_ruleElement1488 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleElement1505 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleElement1524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperties_in_entryRuleProperties560 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperties570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleProperties607 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleProperties619 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleProperties631 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleProperties643 = new BitSet(new long[]{0x0000000008400000L});
        public static final BitSet FOLLOW_ruleAnyGenericConstruct_in_ruleProperties664 = new BitSet(new long[]{0x0000000000208000L});
        public static final BitSet FOLLOW_21_in_ruleProperties677 = new BitSet(new long[]{0x0000000008400000L});
        public static final BitSet FOLLOW_ruleAnyGenericConstruct_in_ruleProperties698 = new BitSet(new long[]{0x0000000000208000L});
        public static final BitSet FOLLOW_15_in_ruleProperties712 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleProperties724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyGenericElement_in_entryRuleAnyGenericElement762 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnyGenericElement772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleAnyGenericElement818 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAnyGenericElement830 = new BitSet(new long[]{0x0000000007808000L});
        public static final BitSet FOLLOW_23_in_ruleAnyGenericElement843 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAnyGenericElement860 = new BitSet(new long[]{0x0000000007008000L});
        public static final BitSet FOLLOW_24_in_ruleAnyGenericElement880 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAnyGenericElement897 = new BitSet(new long[]{0x0000000006008000L});
        public static final BitSet FOLLOW_25_in_ruleAnyGenericElement917 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAnyGenericElement929 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnyGenericAttribute_in_ruleAnyGenericElement950 = new BitSet(new long[]{0x0000000000208000L});
        public static final BitSet FOLLOW_21_in_ruleAnyGenericElement963 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleAnyGenericAttribute_in_ruleAnyGenericElement984 = new BitSet(new long[]{0x0000000000208000L});
        public static final BitSet FOLLOW_15_in_ruleAnyGenericElement998 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_26_in_ruleAnyGenericElement1013 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAnyGenericElement1025 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_ruleAnyGenericElement_in_ruleAnyGenericElement1046 = new BitSet(new long[]{0x0000000000208000L});
        public static final BitSet FOLLOW_21_in_ruleAnyGenericElement1059 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_ruleAnyGenericElement_in_ruleAnyGenericElement1080 = new BitSet(new long[]{0x0000000000208000L});
        public static final BitSet FOLLOW_15_in_ruleAnyGenericElement1094 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAnyGenericElement1108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyGenericText_in_entryRuleAnyGenericText1144 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnyGenericText1154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleAnyGenericText1200 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAnyGenericText1212 = new BitSet(new long[]{0x0000000010008000L});
        public static final BitSet FOLLOW_28_in_ruleAnyGenericText1225 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAnyGenericText1242 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAnyGenericText1261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyGenericAttribute_in_entryRuleAnyGenericAttribute1297 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnyGenericAttribute1307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleAnyGenericAttribute1344 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAnyGenericAttribute1356 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleAnyGenericAttribute1368 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAnyGenericAttribute1385 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleAnyGenericAttribute1402 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAnyGenericAttribute1419 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAnyGenericAttribute1436 = new BitSet(new long[]{0x0000000000000002L});
    }


}