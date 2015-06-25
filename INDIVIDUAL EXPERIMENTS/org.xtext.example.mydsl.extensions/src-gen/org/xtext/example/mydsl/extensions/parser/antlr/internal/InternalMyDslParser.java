package org.xtext.example.mydsl.extensions.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.extensions.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RootElementType'", "'{'", "'extendedAddress'", "'address'", "'language'", "'}'", "'ExtendedAddress'", "'street'", "'city'", "'country'", "'latitude'", "'longitude'", "'Address'", "'Language'", "'value'", "'.'"
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
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
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g"; }



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
    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleRootElementType returns [EObject current=null] : iv_ruleRootElementType= ruleRootElementType EOF ;
    public final EObject entryRuleRootElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootElementType = null;


        try {
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleRootElementType= ruleRootElementType EOF )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleRootElementType= ruleRootElementType EOF
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
    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:76:1: ruleRootElementType returns [EObject current=null] : (otherlv_0= 'RootElementType' otherlv_1= '{' otherlv_2= 'extendedAddress' ( (lv_extendedAddress_3_0= ruleExtendedAddress ) ) otherlv_4= 'address' ( (lv_address_5_0= ruleAddress ) ) otherlv_6= 'language' ( (lv_language_7_0= ruleLanguage ) ) otherlv_8= '}' ) ;
    public final EObject ruleRootElementType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_extendedAddress_3_0 = null;

        EObject lv_address_5_0 = null;

        EObject lv_language_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:79:28: ( (otherlv_0= 'RootElementType' otherlv_1= '{' otherlv_2= 'extendedAddress' ( (lv_extendedAddress_3_0= ruleExtendedAddress ) ) otherlv_4= 'address' ( (lv_address_5_0= ruleAddress ) ) otherlv_6= 'language' ( (lv_language_7_0= ruleLanguage ) ) otherlv_8= '}' ) )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'RootElementType' otherlv_1= '{' otherlv_2= 'extendedAddress' ( (lv_extendedAddress_3_0= ruleExtendedAddress ) ) otherlv_4= 'address' ( (lv_address_5_0= ruleAddress ) ) otherlv_6= 'language' ( (lv_language_7_0= ruleLanguage ) ) otherlv_8= '}' )
            {
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'RootElementType' otherlv_1= '{' otherlv_2= 'extendedAddress' ( (lv_extendedAddress_3_0= ruleExtendedAddress ) ) otherlv_4= 'address' ( (lv_address_5_0= ruleAddress ) ) otherlv_6= 'language' ( (lv_language_7_0= ruleLanguage ) ) otherlv_8= '}' )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:80:3: otherlv_0= 'RootElementType' otherlv_1= '{' otherlv_2= 'extendedAddress' ( (lv_extendedAddress_3_0= ruleExtendedAddress ) ) otherlv_4= 'address' ( (lv_address_5_0= ruleAddress ) ) otherlv_6= 'language' ( (lv_language_7_0= ruleLanguage ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRootElementType122); 

                	newLeafNode(otherlv_0, grammarAccess.getRootElementTypeAccess().getRootElementTypeKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRootElementType134); 

                	newLeafNode(otherlv_1, grammarAccess.getRootElementTypeAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRootElementType146); 

                	newLeafNode(otherlv_2, grammarAccess.getRootElementTypeAccess().getExtendedAddressKeyword_2());
                
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:92:1: ( (lv_extendedAddress_3_0= ruleExtendedAddress ) )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:93:1: (lv_extendedAddress_3_0= ruleExtendedAddress )
            {
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:93:1: (lv_extendedAddress_3_0= ruleExtendedAddress )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:94:3: lv_extendedAddress_3_0= ruleExtendedAddress
            {
             
            	        newCompositeNode(grammarAccess.getRootElementTypeAccess().getExtendedAddressExtendedAddressParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExtendedAddress_in_ruleRootElementType167);
            lv_extendedAddress_3_0=ruleExtendedAddress();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRootElementTypeRule());
            	        }
                   		set(
                   			current, 
                   			"extendedAddress",
                    		lv_extendedAddress_3_0, 
                    		"ExtendedAddress");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRootElementType179); 

                	newLeafNode(otherlv_4, grammarAccess.getRootElementTypeAccess().getAddressKeyword_4());
                
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:114:1: ( (lv_address_5_0= ruleAddress ) )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:115:1: (lv_address_5_0= ruleAddress )
            {
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:115:1: (lv_address_5_0= ruleAddress )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:116:3: lv_address_5_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getRootElementTypeAccess().getAddressAddressParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAddress_in_ruleRootElementType200);
            lv_address_5_0=ruleAddress();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRootElementTypeRule());
            	        }
                   		set(
                   			current, 
                   			"address",
                    		lv_address_5_0, 
                    		"Address");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRootElementType212); 

                	newLeafNode(otherlv_6, grammarAccess.getRootElementTypeAccess().getLanguageKeyword_6());
                
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:136:1: ( (lv_language_7_0= ruleLanguage ) )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:137:1: (lv_language_7_0= ruleLanguage )
            {
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:137:1: (lv_language_7_0= ruleLanguage )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:138:3: lv_language_7_0= ruleLanguage
            {
             
            	        newCompositeNode(grammarAccess.getRootElementTypeAccess().getLanguageLanguageParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLanguage_in_ruleRootElementType233);
            lv_language_7_0=ruleLanguage();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRootElementTypeRule());
            	        }
                   		set(
                   			current, 
                   			"language",
                    		lv_language_7_0, 
                    		"Language");
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


    // $ANTLR start "entryRuleAddress"
    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:166:1: entryRuleAddress returns [EObject current=null] : iv_ruleAddress= ruleAddress EOF ;
    public final EObject entryRuleAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddress = null;


        try {
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:167:2: (iv_ruleAddress= ruleAddress EOF )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:168:2: iv_ruleAddress= ruleAddress EOF
            {
             newCompositeNode(grammarAccess.getAddressRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddress_in_entryRuleAddress281);
            iv_ruleAddress=ruleAddress();

            state._fsp--;

             current =iv_ruleAddress; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddress291); 

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
    // $ANTLR end "entryRuleAddress"


    // $ANTLR start "ruleAddress"
    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:175:1: ruleAddress returns [EObject current=null] : (this_Address_Impl_0= ruleAddress_Impl | this_ExtendedAddress_1= ruleExtendedAddress ) ;
    public final EObject ruleAddress() throws RecognitionException {
        EObject current = null;

        EObject this_Address_Impl_0 = null;

        EObject this_ExtendedAddress_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:178:28: ( (this_Address_Impl_0= ruleAddress_Impl | this_ExtendedAddress_1= ruleExtendedAddress ) )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:179:1: (this_Address_Impl_0= ruleAddress_Impl | this_ExtendedAddress_1= ruleExtendedAddress )
            {
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:179:1: (this_Address_Impl_0= ruleAddress_Impl | this_ExtendedAddress_1= ruleExtendedAddress )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            else if ( (LA1_0==17) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:180:5: this_Address_Impl_0= ruleAddress_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getAddressAccess().getAddress_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAddress_Impl_in_ruleAddress338);
                    this_Address_Impl_0=ruleAddress_Impl();

                    state._fsp--;

                     
                            current = this_Address_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:190:5: this_ExtendedAddress_1= ruleExtendedAddress
                    {
                     
                            newCompositeNode(grammarAccess.getAddressAccess().getExtendedAddressParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExtendedAddress_in_ruleAddress365);
                    this_ExtendedAddress_1=ruleExtendedAddress();

                    state._fsp--;

                     
                            current = this_ExtendedAddress_1; 
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
    // $ANTLR end "ruleAddress"


    // $ANTLR start "entryRuleExtendedAddress"
    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:206:1: entryRuleExtendedAddress returns [EObject current=null] : iv_ruleExtendedAddress= ruleExtendedAddress EOF ;
    public final EObject entryRuleExtendedAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendedAddress = null;


        try {
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:207:2: (iv_ruleExtendedAddress= ruleExtendedAddress EOF )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:208:2: iv_ruleExtendedAddress= ruleExtendedAddress EOF
            {
             newCompositeNode(grammarAccess.getExtendedAddressRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedAddress_in_entryRuleExtendedAddress400);
            iv_ruleExtendedAddress=ruleExtendedAddress();

            state._fsp--;

             current =iv_ruleExtendedAddress; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtendedAddress410); 

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
    // $ANTLR end "entryRuleExtendedAddress"


    // $ANTLR start "ruleExtendedAddress"
    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:215:1: ruleExtendedAddress returns [EObject current=null] : (otherlv_0= 'ExtendedAddress' otherlv_1= '{' otherlv_2= 'street' ( (lv_street_3_0= ruleString0 ) ) otherlv_4= 'city' ( (lv_city_5_0= ruleString0 ) ) otherlv_6= 'country' ( (lv_country_7_0= ruleString0 ) ) (otherlv_8= 'latitude' ( (lv_latitude_9_0= ruleDecimal ) ) )? (otherlv_10= 'longitude' ( (lv_longitude_11_0= ruleDecimal ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleExtendedAddress() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_street_3_0 = null;

        AntlrDatatypeRuleToken lv_city_5_0 = null;

        AntlrDatatypeRuleToken lv_country_7_0 = null;

        AntlrDatatypeRuleToken lv_latitude_9_0 = null;

        AntlrDatatypeRuleToken lv_longitude_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:218:28: ( (otherlv_0= 'ExtendedAddress' otherlv_1= '{' otherlv_2= 'street' ( (lv_street_3_0= ruleString0 ) ) otherlv_4= 'city' ( (lv_city_5_0= ruleString0 ) ) otherlv_6= 'country' ( (lv_country_7_0= ruleString0 ) ) (otherlv_8= 'latitude' ( (lv_latitude_9_0= ruleDecimal ) ) )? (otherlv_10= 'longitude' ( (lv_longitude_11_0= ruleDecimal ) ) )? otherlv_12= '}' ) )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:219:1: (otherlv_0= 'ExtendedAddress' otherlv_1= '{' otherlv_2= 'street' ( (lv_street_3_0= ruleString0 ) ) otherlv_4= 'city' ( (lv_city_5_0= ruleString0 ) ) otherlv_6= 'country' ( (lv_country_7_0= ruleString0 ) ) (otherlv_8= 'latitude' ( (lv_latitude_9_0= ruleDecimal ) ) )? (otherlv_10= 'longitude' ( (lv_longitude_11_0= ruleDecimal ) ) )? otherlv_12= '}' )
            {
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:219:1: (otherlv_0= 'ExtendedAddress' otherlv_1= '{' otherlv_2= 'street' ( (lv_street_3_0= ruleString0 ) ) otherlv_4= 'city' ( (lv_city_5_0= ruleString0 ) ) otherlv_6= 'country' ( (lv_country_7_0= ruleString0 ) ) (otherlv_8= 'latitude' ( (lv_latitude_9_0= ruleDecimal ) ) )? (otherlv_10= 'longitude' ( (lv_longitude_11_0= ruleDecimal ) ) )? otherlv_12= '}' )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:219:3: otherlv_0= 'ExtendedAddress' otherlv_1= '{' otherlv_2= 'street' ( (lv_street_3_0= ruleString0 ) ) otherlv_4= 'city' ( (lv_city_5_0= ruleString0 ) ) otherlv_6= 'country' ( (lv_country_7_0= ruleString0 ) ) (otherlv_8= 'latitude' ( (lv_latitude_9_0= ruleDecimal ) ) )? (otherlv_10= 'longitude' ( (lv_longitude_11_0= ruleDecimal ) ) )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleExtendedAddress447); 

                	newLeafNode(otherlv_0, grammarAccess.getExtendedAddressAccess().getExtendedAddressKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleExtendedAddress459); 

                	newLeafNode(otherlv_1, grammarAccess.getExtendedAddressAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleExtendedAddress471); 

                	newLeafNode(otherlv_2, grammarAccess.getExtendedAddressAccess().getStreetKeyword_2());
                
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:231:1: ( (lv_street_3_0= ruleString0 ) )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:232:1: (lv_street_3_0= ruleString0 )
            {
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:232:1: (lv_street_3_0= ruleString0 )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:233:3: lv_street_3_0= ruleString0
            {
             
            	        newCompositeNode(grammarAccess.getExtendedAddressAccess().getStreetString0ParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleExtendedAddress492);
            lv_street_3_0=ruleString0();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExtendedAddressRule());
            	        }
                   		set(
                   			current, 
                   			"street",
                    		lv_street_3_0, 
                    		"String0");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleExtendedAddress504); 

                	newLeafNode(otherlv_4, grammarAccess.getExtendedAddressAccess().getCityKeyword_4());
                
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:253:1: ( (lv_city_5_0= ruleString0 ) )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:254:1: (lv_city_5_0= ruleString0 )
            {
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:254:1: (lv_city_5_0= ruleString0 )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:255:3: lv_city_5_0= ruleString0
            {
             
            	        newCompositeNode(grammarAccess.getExtendedAddressAccess().getCityString0ParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleExtendedAddress525);
            lv_city_5_0=ruleString0();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExtendedAddressRule());
            	        }
                   		set(
                   			current, 
                   			"city",
                    		lv_city_5_0, 
                    		"String0");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleExtendedAddress537); 

                	newLeafNode(otherlv_6, grammarAccess.getExtendedAddressAccess().getCountryKeyword_6());
                
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:275:1: ( (lv_country_7_0= ruleString0 ) )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:276:1: (lv_country_7_0= ruleString0 )
            {
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:276:1: (lv_country_7_0= ruleString0 )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:277:3: lv_country_7_0= ruleString0
            {
             
            	        newCompositeNode(grammarAccess.getExtendedAddressAccess().getCountryString0ParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleExtendedAddress558);
            lv_country_7_0=ruleString0();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExtendedAddressRule());
            	        }
                   		set(
                   			current, 
                   			"country",
                    		lv_country_7_0, 
                    		"String0");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:293:2: (otherlv_8= 'latitude' ( (lv_latitude_9_0= ruleDecimal ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:293:4: otherlv_8= 'latitude' ( (lv_latitude_9_0= ruleDecimal ) )
                    {
                    otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleExtendedAddress571); 

                        	newLeafNode(otherlv_8, grammarAccess.getExtendedAddressAccess().getLatitudeKeyword_8_0());
                        
                    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:297:1: ( (lv_latitude_9_0= ruleDecimal ) )
                    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:298:1: (lv_latitude_9_0= ruleDecimal )
                    {
                    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:298:1: (lv_latitude_9_0= ruleDecimal )
                    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:299:3: lv_latitude_9_0= ruleDecimal
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtendedAddressAccess().getLatitudeDecimalParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDecimal_in_ruleExtendedAddress592);
                    lv_latitude_9_0=ruleDecimal();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExtendedAddressRule());
                    	        }
                           		set(
                           			current, 
                           			"latitude",
                            		lv_latitude_9_0, 
                            		"Decimal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:315:4: (otherlv_10= 'longitude' ( (lv_longitude_11_0= ruleDecimal ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:315:6: otherlv_10= 'longitude' ( (lv_longitude_11_0= ruleDecimal ) )
                    {
                    otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleExtendedAddress607); 

                        	newLeafNode(otherlv_10, grammarAccess.getExtendedAddressAccess().getLongitudeKeyword_9_0());
                        
                    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:319:1: ( (lv_longitude_11_0= ruleDecimal ) )
                    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:320:1: (lv_longitude_11_0= ruleDecimal )
                    {
                    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:320:1: (lv_longitude_11_0= ruleDecimal )
                    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:321:3: lv_longitude_11_0= ruleDecimal
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtendedAddressAccess().getLongitudeDecimalParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDecimal_in_ruleExtendedAddress628);
                    lv_longitude_11_0=ruleDecimal();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExtendedAddressRule());
                    	        }
                           		set(
                           			current, 
                           			"longitude",
                            		lv_longitude_11_0, 
                            		"Decimal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleExtendedAddress642); 

                	newLeafNode(otherlv_12, grammarAccess.getExtendedAddressAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleExtendedAddress"


    // $ANTLR start "entryRuleAddress_Impl"
    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:349:1: entryRuleAddress_Impl returns [EObject current=null] : iv_ruleAddress_Impl= ruleAddress_Impl EOF ;
    public final EObject entryRuleAddress_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddress_Impl = null;


        try {
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:350:2: (iv_ruleAddress_Impl= ruleAddress_Impl EOF )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:351:2: iv_ruleAddress_Impl= ruleAddress_Impl EOF
            {
             newCompositeNode(grammarAccess.getAddress_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddress_Impl_in_entryRuleAddress_Impl678);
            iv_ruleAddress_Impl=ruleAddress_Impl();

            state._fsp--;

             current =iv_ruleAddress_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddress_Impl688); 

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
    // $ANTLR end "entryRuleAddress_Impl"


    // $ANTLR start "ruleAddress_Impl"
    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:358:1: ruleAddress_Impl returns [EObject current=null] : (otherlv_0= 'Address' otherlv_1= '{' otherlv_2= 'street' ( (lv_street_3_0= ruleString0 ) ) otherlv_4= 'city' ( (lv_city_5_0= ruleString0 ) ) otherlv_6= 'country' ( (lv_country_7_0= ruleString0 ) ) otherlv_8= '}' ) ;
    public final EObject ruleAddress_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_street_3_0 = null;

        AntlrDatatypeRuleToken lv_city_5_0 = null;

        AntlrDatatypeRuleToken lv_country_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:361:28: ( (otherlv_0= 'Address' otherlv_1= '{' otherlv_2= 'street' ( (lv_street_3_0= ruleString0 ) ) otherlv_4= 'city' ( (lv_city_5_0= ruleString0 ) ) otherlv_6= 'country' ( (lv_country_7_0= ruleString0 ) ) otherlv_8= '}' ) )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:362:1: (otherlv_0= 'Address' otherlv_1= '{' otherlv_2= 'street' ( (lv_street_3_0= ruleString0 ) ) otherlv_4= 'city' ( (lv_city_5_0= ruleString0 ) ) otherlv_6= 'country' ( (lv_country_7_0= ruleString0 ) ) otherlv_8= '}' )
            {
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:362:1: (otherlv_0= 'Address' otherlv_1= '{' otherlv_2= 'street' ( (lv_street_3_0= ruleString0 ) ) otherlv_4= 'city' ( (lv_city_5_0= ruleString0 ) ) otherlv_6= 'country' ( (lv_country_7_0= ruleString0 ) ) otherlv_8= '}' )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:362:3: otherlv_0= 'Address' otherlv_1= '{' otherlv_2= 'street' ( (lv_street_3_0= ruleString0 ) ) otherlv_4= 'city' ( (lv_city_5_0= ruleString0 ) ) otherlv_6= 'country' ( (lv_country_7_0= ruleString0 ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAddress_Impl725); 

                	newLeafNode(otherlv_0, grammarAccess.getAddress_ImplAccess().getAddressKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAddress_Impl737); 

                	newLeafNode(otherlv_1, grammarAccess.getAddress_ImplAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAddress_Impl749); 

                	newLeafNode(otherlv_2, grammarAccess.getAddress_ImplAccess().getStreetKeyword_2());
                
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:374:1: ( (lv_street_3_0= ruleString0 ) )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:375:1: (lv_street_3_0= ruleString0 )
            {
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:375:1: (lv_street_3_0= ruleString0 )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:376:3: lv_street_3_0= ruleString0
            {
             
            	        newCompositeNode(grammarAccess.getAddress_ImplAccess().getStreetString0ParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleAddress_Impl770);
            lv_street_3_0=ruleString0();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAddress_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"street",
                    		lv_street_3_0, 
                    		"String0");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAddress_Impl782); 

                	newLeafNode(otherlv_4, grammarAccess.getAddress_ImplAccess().getCityKeyword_4());
                
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:396:1: ( (lv_city_5_0= ruleString0 ) )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:397:1: (lv_city_5_0= ruleString0 )
            {
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:397:1: (lv_city_5_0= ruleString0 )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:398:3: lv_city_5_0= ruleString0
            {
             
            	        newCompositeNode(grammarAccess.getAddress_ImplAccess().getCityString0ParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleAddress_Impl803);
            lv_city_5_0=ruleString0();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAddress_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"city",
                    		lv_city_5_0, 
                    		"String0");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAddress_Impl815); 

                	newLeafNode(otherlv_6, grammarAccess.getAddress_ImplAccess().getCountryKeyword_6());
                
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:418:1: ( (lv_country_7_0= ruleString0 ) )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:419:1: (lv_country_7_0= ruleString0 )
            {
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:419:1: (lv_country_7_0= ruleString0 )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:420:3: lv_country_7_0= ruleString0
            {
             
            	        newCompositeNode(grammarAccess.getAddress_ImplAccess().getCountryString0ParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleAddress_Impl836);
            lv_country_7_0=ruleString0();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAddress_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"country",
                    		lv_country_7_0, 
                    		"String0");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAddress_Impl848); 

                	newLeafNode(otherlv_8, grammarAccess.getAddress_ImplAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleAddress_Impl"


    // $ANTLR start "entryRuleLanguage"
    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:448:1: entryRuleLanguage returns [EObject current=null] : iv_ruleLanguage= ruleLanguage EOF ;
    public final EObject entryRuleLanguage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguage = null;


        try {
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:449:2: (iv_ruleLanguage= ruleLanguage EOF )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:450:2: iv_ruleLanguage= ruleLanguage EOF
            {
             newCompositeNode(grammarAccess.getLanguageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLanguage_in_entryRuleLanguage884);
            iv_ruleLanguage=ruleLanguage();

            state._fsp--;

             current =iv_ruleLanguage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLanguage894); 

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
    // $ANTLR end "entryRuleLanguage"


    // $ANTLR start "ruleLanguage"
    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:457:1: ruleLanguage returns [EObject current=null] : ( () otherlv_1= 'Language' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleString0 ) ) )? (otherlv_5= 'language' ( (lv_language_6_0= ruleLanguage0 ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleLanguage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;

        AntlrDatatypeRuleToken lv_language_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:460:28: ( ( () otherlv_1= 'Language' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleString0 ) ) )? (otherlv_5= 'language' ( (lv_language_6_0= ruleLanguage0 ) ) )? otherlv_7= '}' ) )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:461:1: ( () otherlv_1= 'Language' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleString0 ) ) )? (otherlv_5= 'language' ( (lv_language_6_0= ruleLanguage0 ) ) )? otherlv_7= '}' )
            {
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:461:1: ( () otherlv_1= 'Language' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleString0 ) ) )? (otherlv_5= 'language' ( (lv_language_6_0= ruleLanguage0 ) ) )? otherlv_7= '}' )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:461:2: () otherlv_1= 'Language' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleString0 ) ) )? (otherlv_5= 'language' ( (lv_language_6_0= ruleLanguage0 ) ) )? otherlv_7= '}'
            {
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:461:2: ()
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:462:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLanguageAccess().getLanguageAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleLanguage940); 

                	newLeafNode(otherlv_1, grammarAccess.getLanguageAccess().getLanguageKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLanguage952); 

                	newLeafNode(otherlv_2, grammarAccess.getLanguageAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:475:1: (otherlv_3= 'value' ( (lv_value_4_0= ruleString0 ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:475:3: otherlv_3= 'value' ( (lv_value_4_0= ruleString0 ) )
                    {
                    otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleLanguage965); 

                        	newLeafNode(otherlv_3, grammarAccess.getLanguageAccess().getValueKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:479:1: ( (lv_value_4_0= ruleString0 ) )
                    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:480:1: (lv_value_4_0= ruleString0 )
                    {
                    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:480:1: (lv_value_4_0= ruleString0 )
                    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:481:3: lv_value_4_0= ruleString0
                    {
                     
                    	        newCompositeNode(grammarAccess.getLanguageAccess().getValueString0ParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleString0_in_ruleLanguage986);
                    lv_value_4_0=ruleString0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLanguageRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_4_0, 
                            		"String0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:497:4: (otherlv_5= 'language' ( (lv_language_6_0= ruleLanguage0 ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:497:6: otherlv_5= 'language' ( (lv_language_6_0= ruleLanguage0 ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLanguage1001); 

                        	newLeafNode(otherlv_5, grammarAccess.getLanguageAccess().getLanguageKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:501:1: ( (lv_language_6_0= ruleLanguage0 ) )
                    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:502:1: (lv_language_6_0= ruleLanguage0 )
                    {
                    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:502:1: (lv_language_6_0= ruleLanguage0 )
                    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:503:3: lv_language_6_0= ruleLanguage0
                    {
                     
                    	        newCompositeNode(grammarAccess.getLanguageAccess().getLanguageLanguage0ParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLanguage0_in_ruleLanguage1022);
                    lv_language_6_0=ruleLanguage0();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLanguageRule());
                    	        }
                           		set(
                           			current, 
                           			"language",
                            		lv_language_6_0, 
                            		"Language0");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleLanguage1036); 

                	newLeafNode(otherlv_7, grammarAccess.getLanguageAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleLanguage"


    // $ANTLR start "entryRuleString0"
    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:531:1: entryRuleString0 returns [String current=null] : iv_ruleString0= ruleString0 EOF ;
    public final String entryRuleString0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleString0 = null;


        try {
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:532:2: (iv_ruleString0= ruleString0 EOF )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:533:2: iv_ruleString0= ruleString0 EOF
            {
             newCompositeNode(grammarAccess.getString0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleString0_in_entryRuleString01073);
            iv_ruleString0=ruleString0();

            state._fsp--;

             current =iv_ruleString0.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleString01084); 

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
    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:540:1: ruleString0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleString0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:543:28: (this_STRING_0= RULE_STRING )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:544:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleString01123); 

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


    // $ANTLR start "entryRuleDecimal"
    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:559:1: entryRuleDecimal returns [String current=null] : iv_ruleDecimal= ruleDecimal EOF ;
    public final String entryRuleDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecimal = null;


        try {
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:560:2: (iv_ruleDecimal= ruleDecimal EOF )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:561:2: iv_ruleDecimal= ruleDecimal EOF
            {
             newCompositeNode(grammarAccess.getDecimalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDecimal_in_entryRuleDecimal1168);
            iv_ruleDecimal=ruleDecimal();

            state._fsp--;

             current =iv_ruleDecimal.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDecimal1179); 

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
    // $ANTLR end "entryRuleDecimal"


    // $ANTLR start "ruleDecimal"
    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:568:1: ruleDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:571:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:572:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:572:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:572:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleDecimal1219); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDecimalAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleDecimal1237); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDecimalAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleDecimal1252); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getDecimalAccess().getINTTerminalRuleCall_2()); 
                

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
    // $ANTLR end "ruleDecimal"


    // $ANTLR start "entryRuleLanguage0"
    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:600:1: entryRuleLanguage0 returns [String current=null] : iv_ruleLanguage0= ruleLanguage0 EOF ;
    public final String entryRuleLanguage0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLanguage0 = null;


        try {
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:601:2: (iv_ruleLanguage0= ruleLanguage0 EOF )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:602:2: iv_ruleLanguage0= ruleLanguage0 EOF
            {
             newCompositeNode(grammarAccess.getLanguage0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLanguage0_in_entryRuleLanguage01298);
            iv_ruleLanguage0=ruleLanguage0();

            state._fsp--;

             current =iv_ruleLanguage0.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLanguage01309); 

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
    // $ANTLR end "entryRuleLanguage0"


    // $ANTLR start "ruleLanguage0"
    // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:609:1: ruleLanguage0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleLanguage0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:612:28: (this_STRING_0= RULE_STRING )
            // ../org.xtext.example.mydsl.extensions/src-gen/org/xtext/example/mydsl/extensions/parser/antlr/internal/InternalMyDsl.g:613:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleLanguage01348); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getLanguage0Access().getSTRINGTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleLanguage0"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRootElementType_in_entryRuleRootElementType75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRootElementType85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleRootElementType122 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRootElementType134 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleRootElementType146 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_ruleExtendedAddress_in_ruleRootElementType167 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRootElementType179 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_ruleAddress_in_ruleRootElementType200 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRootElementType212 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleLanguage_in_ruleRootElementType233 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRootElementType245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddress_in_entryRuleAddress281 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddress291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddress_Impl_in_ruleAddress338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedAddress_in_ruleAddress365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedAddress_in_entryRuleExtendedAddress400 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtendedAddress410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleExtendedAddress447 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleExtendedAddress459 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleExtendedAddress471 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleExtendedAddress492 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleExtendedAddress504 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleExtendedAddress525 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleExtendedAddress537 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleExtendedAddress558 = new BitSet(new long[]{0x0000000000610000L});
        public static final BitSet FOLLOW_21_in_ruleExtendedAddress571 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleDecimal_in_ruleExtendedAddress592 = new BitSet(new long[]{0x0000000000410000L});
        public static final BitSet FOLLOW_22_in_ruleExtendedAddress607 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleDecimal_in_ruleExtendedAddress628 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleExtendedAddress642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddress_Impl_in_entryRuleAddress_Impl678 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddress_Impl688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleAddress_Impl725 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAddress_Impl737 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleAddress_Impl749 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleAddress_Impl770 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleAddress_Impl782 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleAddress_Impl803 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAddress_Impl815 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleAddress_Impl836 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleAddress_Impl848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLanguage_in_entryRuleLanguage884 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLanguage894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleLanguage940 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLanguage952 = new BitSet(new long[]{0x0000000002018000L});
        public static final BitSet FOLLOW_25_in_ruleLanguage965 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleString0_in_ruleLanguage986 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleLanguage1001 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleLanguage0_in_ruleLanguage1022 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleLanguage1036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleString0_in_entryRuleString01073 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleString01084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleString01123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDecimal_in_entryRuleDecimal1168 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDecimal1179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleDecimal1219 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleDecimal1237 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleDecimal1252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLanguage0_in_entryRuleLanguage01298 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLanguage01309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleLanguage01348 = new BitSet(new long[]{0x0000000000000002L});
    }


}