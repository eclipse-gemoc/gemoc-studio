package org.eclipse.gemoc.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.gemoc.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_QUALIFIED", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DSL'", "'{'", "'}'", "'='", "','", "'displayName'", "'metaprog'", "'abstract-syntax'", "'semantics'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int RULE_QUALIFIED=4;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=7;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Dsl";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDsl"
    // InternalDsl.g:64:1: entryRuleDsl returns [EObject current=null] : iv_ruleDsl= ruleDsl EOF ;
    public final EObject entryRuleDsl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDsl = null;


        try {
            // InternalDsl.g:64:44: (iv_ruleDsl= ruleDsl EOF )
            // InternalDsl.g:65:2: iv_ruleDsl= ruleDsl EOF
            {
             newCompositeNode(grammarAccess.getDslRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDsl=ruleDsl();

            state._fsp--;

             current =iv_ruleDsl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDsl"


    // $ANTLR start "ruleDsl"
    // InternalDsl.g:71:1: ruleDsl returns [EObject current=null] : (otherlv_0= 'DSL' ( ( (lv_name_1_1= RULE_QUALIFIED | lv_name_1_2= RULE_ID ) ) ) otherlv_2= '{' ( (lv_displayName_3_0= ruleDisplayName ) )? ( (lv_metaprog_4_0= ruleMetaprog ) )? ( (lv_abstractSyntax_5_0= ruleAbstractSyntax ) )? ( (lv_semantic_6_0= ruleSemantic ) )? ( (lv_values_7_0= ruleValue ) )* otherlv_8= '}' ) ;
    public final EObject ruleDsl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token otherlv_2=null;
        Token otherlv_8=null;
        EObject lv_displayName_3_0 = null;

        EObject lv_metaprog_4_0 = null;

        EObject lv_abstractSyntax_5_0 = null;

        EObject lv_semantic_6_0 = null;

        EObject lv_values_7_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( (otherlv_0= 'DSL' ( ( (lv_name_1_1= RULE_QUALIFIED | lv_name_1_2= RULE_ID ) ) ) otherlv_2= '{' ( (lv_displayName_3_0= ruleDisplayName ) )? ( (lv_metaprog_4_0= ruleMetaprog ) )? ( (lv_abstractSyntax_5_0= ruleAbstractSyntax ) )? ( (lv_semantic_6_0= ruleSemantic ) )? ( (lv_values_7_0= ruleValue ) )* otherlv_8= '}' ) )
            // InternalDsl.g:78:2: (otherlv_0= 'DSL' ( ( (lv_name_1_1= RULE_QUALIFIED | lv_name_1_2= RULE_ID ) ) ) otherlv_2= '{' ( (lv_displayName_3_0= ruleDisplayName ) )? ( (lv_metaprog_4_0= ruleMetaprog ) )? ( (lv_abstractSyntax_5_0= ruleAbstractSyntax ) )? ( (lv_semantic_6_0= ruleSemantic ) )? ( (lv_values_7_0= ruleValue ) )* otherlv_8= '}' )
            {
            // InternalDsl.g:78:2: (otherlv_0= 'DSL' ( ( (lv_name_1_1= RULE_QUALIFIED | lv_name_1_2= RULE_ID ) ) ) otherlv_2= '{' ( (lv_displayName_3_0= ruleDisplayName ) )? ( (lv_metaprog_4_0= ruleMetaprog ) )? ( (lv_abstractSyntax_5_0= ruleAbstractSyntax ) )? ( (lv_semantic_6_0= ruleSemantic ) )? ( (lv_values_7_0= ruleValue ) )* otherlv_8= '}' )
            // InternalDsl.g:79:3: otherlv_0= 'DSL' ( ( (lv_name_1_1= RULE_QUALIFIED | lv_name_1_2= RULE_ID ) ) ) otherlv_2= '{' ( (lv_displayName_3_0= ruleDisplayName ) )? ( (lv_metaprog_4_0= ruleMetaprog ) )? ( (lv_abstractSyntax_5_0= ruleAbstractSyntax ) )? ( (lv_semantic_6_0= ruleSemantic ) )? ( (lv_values_7_0= ruleValue ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDslAccess().getDSLKeyword_0());
            		
            // InternalDsl.g:83:3: ( ( (lv_name_1_1= RULE_QUALIFIED | lv_name_1_2= RULE_ID ) ) )
            // InternalDsl.g:84:4: ( (lv_name_1_1= RULE_QUALIFIED | lv_name_1_2= RULE_ID ) )
            {
            // InternalDsl.g:84:4: ( (lv_name_1_1= RULE_QUALIFIED | lv_name_1_2= RULE_ID ) )
            // InternalDsl.g:85:5: (lv_name_1_1= RULE_QUALIFIED | lv_name_1_2= RULE_ID )
            {
            // InternalDsl.g:85:5: (lv_name_1_1= RULE_QUALIFIED | lv_name_1_2= RULE_ID )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_QUALIFIED) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:86:6: lv_name_1_1= RULE_QUALIFIED
                    {
                    lv_name_1_1=(Token)match(input,RULE_QUALIFIED,FOLLOW_4); 

                    						newLeafNode(lv_name_1_1, grammarAccess.getDslAccess().getNameQUALIFIEDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDslRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_1,
                    							"org.eclipse.gemoc.Dsl.QUALIFIED");
                    					

                    }
                    break;
                case 2 :
                    // InternalDsl.g:101:6: lv_name_1_2= RULE_ID
                    {
                    lv_name_1_2=(Token)match(input,RULE_ID,FOLLOW_4); 

                    						newLeafNode(lv_name_1_2, grammarAccess.getDslAccess().getNameIDTerminalRuleCall_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDslRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_2,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getDslAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:122:3: ( (lv_displayName_3_0= ruleDisplayName ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:123:4: (lv_displayName_3_0= ruleDisplayName )
                    {
                    // InternalDsl.g:123:4: (lv_displayName_3_0= ruleDisplayName )
                    // InternalDsl.g:124:5: lv_displayName_3_0= ruleDisplayName
                    {

                    					newCompositeNode(grammarAccess.getDslAccess().getDisplayNameDisplayNameParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_displayName_3_0=ruleDisplayName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDslRule());
                    					}
                    					set(
                    						current,
                    						"displayName",
                    						lv_displayName_3_0,
                    						"org.eclipse.gemoc.Dsl.DisplayName");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:141:3: ( (lv_metaprog_4_0= ruleMetaprog ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:142:4: (lv_metaprog_4_0= ruleMetaprog )
                    {
                    // InternalDsl.g:142:4: (lv_metaprog_4_0= ruleMetaprog )
                    // InternalDsl.g:143:5: lv_metaprog_4_0= ruleMetaprog
                    {

                    					newCompositeNode(grammarAccess.getDslAccess().getMetaprogMetaprogParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_metaprog_4_0=ruleMetaprog();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDslRule());
                    					}
                    					set(
                    						current,
                    						"metaprog",
                    						lv_metaprog_4_0,
                    						"org.eclipse.gemoc.Dsl.Metaprog");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:160:3: ( (lv_abstractSyntax_5_0= ruleAbstractSyntax ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:161:4: (lv_abstractSyntax_5_0= ruleAbstractSyntax )
                    {
                    // InternalDsl.g:161:4: (lv_abstractSyntax_5_0= ruleAbstractSyntax )
                    // InternalDsl.g:162:5: lv_abstractSyntax_5_0= ruleAbstractSyntax
                    {

                    					newCompositeNode(grammarAccess.getDslAccess().getAbstractSyntaxAbstractSyntaxParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_abstractSyntax_5_0=ruleAbstractSyntax();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDslRule());
                    					}
                    					set(
                    						current,
                    						"abstractSyntax",
                    						lv_abstractSyntax_5_0,
                    						"org.eclipse.gemoc.Dsl.AbstractSyntax");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:179:3: ( (lv_semantic_6_0= ruleSemantic ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:180:4: (lv_semantic_6_0= ruleSemantic )
                    {
                    // InternalDsl.g:180:4: (lv_semantic_6_0= ruleSemantic )
                    // InternalDsl.g:181:5: lv_semantic_6_0= ruleSemantic
                    {

                    					newCompositeNode(grammarAccess.getDslAccess().getSemanticSemanticParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_semantic_6_0=ruleSemantic();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDslRule());
                    					}
                    					set(
                    						current,
                    						"semantic",
                    						lv_semantic_6_0,
                    						"org.eclipse.gemoc.Dsl.Semantic");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:198:3: ( (lv_values_7_0= ruleValue ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:199:4: (lv_values_7_0= ruleValue )
            	    {
            	    // InternalDsl.g:199:4: (lv_values_7_0= ruleValue )
            	    // InternalDsl.g:200:5: lv_values_7_0= ruleValue
            	    {

            	    					newCompositeNode(grammarAccess.getDslAccess().getValuesValueParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_values_7_0=ruleValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDslRule());
            	    					}
            	    					add(
            	    						current,
            	    						"values",
            	    						lv_values_7_0,
            	    						"org.eclipse.gemoc.Dsl.Value");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDslAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleDsl"


    // $ANTLR start "entryRuleValue"
    // InternalDsl.g:225:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalDsl.g:225:46: (iv_ruleValue= ruleValue EOF )
            // InternalDsl.g:226:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalDsl.g:232:1: ruleValue returns [EObject current=null] : (this_SimpleValue_0= ruleSimpleValue | this_CompositeValue_1= ruleCompositeValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleValue_0 = null;

        EObject this_CompositeValue_1 = null;



        	enterRule();

        try {
            // InternalDsl.g:238:2: ( (this_SimpleValue_0= ruleSimpleValue | this_CompositeValue_1= ruleCompositeValue ) )
            // InternalDsl.g:239:2: (this_SimpleValue_0= ruleSimpleValue | this_CompositeValue_1= ruleCompositeValue )
            {
            // InternalDsl.g:239:2: (this_SimpleValue_0= ruleSimpleValue | this_CompositeValue_1= ruleCompositeValue )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==15) ) {
                    alt7=1;
                }
                else if ( (LA7_1==13) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:240:3: this_SimpleValue_0= ruleSimpleValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getSimpleValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleValue_0=ruleSimpleValue();

                    state._fsp--;


                    			current = this_SimpleValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:249:3: this_CompositeValue_1= ruleCompositeValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getCompositeValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeValue_1=ruleCompositeValue();

                    state._fsp--;


                    			current = this_CompositeValue_1;
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleSimpleValue"
    // InternalDsl.g:261:1: entryRuleSimpleValue returns [EObject current=null] : iv_ruleSimpleValue= ruleSimpleValue EOF ;
    public final EObject entryRuleSimpleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleValue = null;


        try {
            // InternalDsl.g:261:52: (iv_ruleSimpleValue= ruleSimpleValue EOF )
            // InternalDsl.g:262:2: iv_ruleSimpleValue= ruleSimpleValue EOF
            {
             newCompositeNode(grammarAccess.getSimpleValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleValue=ruleSimpleValue();

            state._fsp--;

             current =iv_ruleSimpleValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSimpleValue"


    // $ANTLR start "ruleSimpleValue"
    // InternalDsl.g:268:1: ruleSimpleValue returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleSimpleValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;


        	enterRule();

        try {
            // InternalDsl.g:274:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) )
            // InternalDsl.g:275:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            {
            // InternalDsl.g:275:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            // InternalDsl.g:276:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            {
            // InternalDsl.g:276:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:277:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:277:4: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:278:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSimpleValueAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleValueAccess().getEqualsSignKeyword_1());
            		
            // InternalDsl.g:298:3: ( (lv_values_2_0= RULE_STRING ) )
            // InternalDsl.g:299:4: (lv_values_2_0= RULE_STRING )
            {
            // InternalDsl.g:299:4: (lv_values_2_0= RULE_STRING )
            // InternalDsl.g:300:5: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_values_2_0, grammarAccess.getSimpleValueAccess().getValuesSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleValueRule());
            					}
            					addWithLastConsumed(
            						current,
            						"values",
            						lv_values_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDsl.g:316:3: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:317:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_11); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSimpleValueAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalDsl.g:321:4: ( (lv_values_4_0= RULE_STRING ) )
            	    // InternalDsl.g:322:5: (lv_values_4_0= RULE_STRING )
            	    {
            	    // InternalDsl.g:322:5: (lv_values_4_0= RULE_STRING )
            	    // InternalDsl.g:323:6: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            	    						newLeafNode(lv_values_4_0, grammarAccess.getSimpleValueAccess().getValuesSTRINGTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSimpleValueRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"values",
            	    							lv_values_4_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


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
    // $ANTLR end "ruleSimpleValue"


    // $ANTLR start "entryRuleCompositeValue"
    // InternalDsl.g:344:1: entryRuleCompositeValue returns [EObject current=null] : iv_ruleCompositeValue= ruleCompositeValue EOF ;
    public final EObject entryRuleCompositeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeValue = null;


        try {
            // InternalDsl.g:344:55: (iv_ruleCompositeValue= ruleCompositeValue EOF )
            // InternalDsl.g:345:2: iv_ruleCompositeValue= ruleCompositeValue EOF
            {
             newCompositeNode(grammarAccess.getCompositeValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeValue=ruleCompositeValue();

            state._fsp--;

             current =iv_ruleCompositeValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCompositeValue"


    // $ANTLR start "ruleCompositeValue"
    // InternalDsl.g:351:1: ruleCompositeValue returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_values_2_0= ruleValue ) )* otherlv_3= '}' ) ;
    public final EObject ruleCompositeValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:357:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_values_2_0= ruleValue ) )* otherlv_3= '}' ) )
            // InternalDsl.g:358:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_values_2_0= ruleValue ) )* otherlv_3= '}' )
            {
            // InternalDsl.g:358:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_values_2_0= ruleValue ) )* otherlv_3= '}' )
            // InternalDsl.g:359:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_values_2_0= ruleValue ) )* otherlv_3= '}'
            {
            // InternalDsl.g:359:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:360:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:360:4: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:361:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCompositeValueAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositeValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositeValueAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDsl.g:381:3: ( (lv_values_2_0= ruleValue ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:382:4: (lv_values_2_0= ruleValue )
            	    {
            	    // InternalDsl.g:382:4: (lv_values_2_0= ruleValue )
            	    // InternalDsl.g:383:5: lv_values_2_0= ruleValue
            	    {

            	    					newCompositeNode(grammarAccess.getCompositeValueAccess().getValuesValueParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_values_2_0=ruleValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCompositeValueRule());
            	    					}
            	    					add(
            	    						current,
            	    						"values",
            	    						lv_values_2_0,
            	    						"org.eclipse.gemoc.Dsl.Value");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCompositeValueAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleCompositeValue"


    // $ANTLR start "entryRuleDisplayName"
    // InternalDsl.g:408:1: entryRuleDisplayName returns [EObject current=null] : iv_ruleDisplayName= ruleDisplayName EOF ;
    public final EObject entryRuleDisplayName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisplayName = null;


        try {
            // InternalDsl.g:408:52: (iv_ruleDisplayName= ruleDisplayName EOF )
            // InternalDsl.g:409:2: iv_ruleDisplayName= ruleDisplayName EOF
            {
             newCompositeNode(grammarAccess.getDisplayNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisplayName=ruleDisplayName();

            state._fsp--;

             current =iv_ruleDisplayName; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDisplayName"


    // $ANTLR start "ruleDisplayName"
    // InternalDsl.g:415:1: ruleDisplayName returns [EObject current=null] : ( () otherlv_1= 'displayName' otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleDisplayName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalDsl.g:421:2: ( ( () otherlv_1= 'displayName' otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) )
            // InternalDsl.g:422:2: ( () otherlv_1= 'displayName' otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:422:2: ( () otherlv_1= 'displayName' otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            // InternalDsl.g:423:3: () otherlv_1= 'displayName' otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) )
            {
            // InternalDsl.g:423:3: ()
            // InternalDsl.g:424:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDisplayNameAccess().getDisplayNameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getDisplayNameAccess().getDisplayNameKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getDisplayNameAccess().getEqualsSignKeyword_2());
            		
            // InternalDsl.g:438:3: ( (lv_value_3_0= RULE_STRING ) )
            // InternalDsl.g:439:4: (lv_value_3_0= RULE_STRING )
            {
            // InternalDsl.g:439:4: (lv_value_3_0= RULE_STRING )
            // InternalDsl.g:440:5: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getDisplayNameAccess().getValueSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDisplayNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleDisplayName"


    // $ANTLR start "entryRuleMetaprog"
    // InternalDsl.g:460:1: entryRuleMetaprog returns [EObject current=null] : iv_ruleMetaprog= ruleMetaprog EOF ;
    public final EObject entryRuleMetaprog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaprog = null;


        try {
            // InternalDsl.g:460:49: (iv_ruleMetaprog= ruleMetaprog EOF )
            // InternalDsl.g:461:2: iv_ruleMetaprog= ruleMetaprog EOF
            {
             newCompositeNode(grammarAccess.getMetaprogRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetaprog=ruleMetaprog();

            state._fsp--;

             current =iv_ruleMetaprog; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMetaprog"


    // $ANTLR start "ruleMetaprog"
    // InternalDsl.g:467:1: ruleMetaprog returns [EObject current=null] : ( () otherlv_1= 'metaprog' otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleMetaprog() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalDsl.g:473:2: ( ( () otherlv_1= 'metaprog' otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) )
            // InternalDsl.g:474:2: ( () otherlv_1= 'metaprog' otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:474:2: ( () otherlv_1= 'metaprog' otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            // InternalDsl.g:475:3: () otherlv_1= 'metaprog' otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) )
            {
            // InternalDsl.g:475:3: ()
            // InternalDsl.g:476:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMetaprogAccess().getMetaprogAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getMetaprogAccess().getMetaprogKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getMetaprogAccess().getEqualsSignKeyword_2());
            		
            // InternalDsl.g:490:3: ( (lv_value_3_0= RULE_STRING ) )
            // InternalDsl.g:491:4: (lv_value_3_0= RULE_STRING )
            {
            // InternalDsl.g:491:4: (lv_value_3_0= RULE_STRING )
            // InternalDsl.g:492:5: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getMetaprogAccess().getValueSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetaprogRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleMetaprog"


    // $ANTLR start "entryRuleAbstractSyntax"
    // InternalDsl.g:512:1: entryRuleAbstractSyntax returns [EObject current=null] : iv_ruleAbstractSyntax= ruleAbstractSyntax EOF ;
    public final EObject entryRuleAbstractSyntax() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractSyntax = null;


        try {
            // InternalDsl.g:512:55: (iv_ruleAbstractSyntax= ruleAbstractSyntax EOF )
            // InternalDsl.g:513:2: iv_ruleAbstractSyntax= ruleAbstractSyntax EOF
            {
             newCompositeNode(grammarAccess.getAbstractSyntaxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractSyntax=ruleAbstractSyntax();

            state._fsp--;

             current =iv_ruleAbstractSyntax; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractSyntax"


    // $ANTLR start "ruleAbstractSyntax"
    // InternalDsl.g:519:1: ruleAbstractSyntax returns [EObject current=null] : ( () otherlv_1= 'abstract-syntax' otherlv_2= '{' ( (lv_values_3_0= ruleValue ) )* otherlv_4= '}' ) ;
    public final EObject ruleAbstractSyntax() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:525:2: ( ( () otherlv_1= 'abstract-syntax' otherlv_2= '{' ( (lv_values_3_0= ruleValue ) )* otherlv_4= '}' ) )
            // InternalDsl.g:526:2: ( () otherlv_1= 'abstract-syntax' otherlv_2= '{' ( (lv_values_3_0= ruleValue ) )* otherlv_4= '}' )
            {
            // InternalDsl.g:526:2: ( () otherlv_1= 'abstract-syntax' otherlv_2= '{' ( (lv_values_3_0= ruleValue ) )* otherlv_4= '}' )
            // InternalDsl.g:527:3: () otherlv_1= 'abstract-syntax' otherlv_2= '{' ( (lv_values_3_0= ruleValue ) )* otherlv_4= '}'
            {
            // InternalDsl.g:527:3: ()
            // InternalDsl.g:528:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAbstractSyntaxAccess().getAbstractSyntaxAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAbstractSyntaxAccess().getAbstractSyntaxKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getAbstractSyntaxAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:542:3: ( (lv_values_3_0= ruleValue ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:543:4: (lv_values_3_0= ruleValue )
            	    {
            	    // InternalDsl.g:543:4: (lv_values_3_0= ruleValue )
            	    // InternalDsl.g:544:5: lv_values_3_0= ruleValue
            	    {

            	    					newCompositeNode(grammarAccess.getAbstractSyntaxAccess().getValuesValueParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_values_3_0=ruleValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAbstractSyntaxRule());
            	    					}
            	    					add(
            	    						current,
            	    						"values",
            	    						lv_values_3_0,
            	    						"org.eclipse.gemoc.Dsl.Value");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAbstractSyntaxAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleAbstractSyntax"


    // $ANTLR start "entryRuleSemantic"
    // InternalDsl.g:569:1: entryRuleSemantic returns [EObject current=null] : iv_ruleSemantic= ruleSemantic EOF ;
    public final EObject entryRuleSemantic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSemantic = null;


        try {
            // InternalDsl.g:569:49: (iv_ruleSemantic= ruleSemantic EOF )
            // InternalDsl.g:570:2: iv_ruleSemantic= ruleSemantic EOF
            {
             newCompositeNode(grammarAccess.getSemanticRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSemantic=ruleSemantic();

            state._fsp--;

             current =iv_ruleSemantic; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSemantic"


    // $ANTLR start "ruleSemantic"
    // InternalDsl.g:576:1: ruleSemantic returns [EObject current=null] : ( () otherlv_1= 'semantics' otherlv_2= '{' ( (lv_values_3_0= ruleValue ) )* otherlv_4= '}' ) ;
    public final EObject ruleSemantic() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:582:2: ( ( () otherlv_1= 'semantics' otherlv_2= '{' ( (lv_values_3_0= ruleValue ) )* otherlv_4= '}' ) )
            // InternalDsl.g:583:2: ( () otherlv_1= 'semantics' otherlv_2= '{' ( (lv_values_3_0= ruleValue ) )* otherlv_4= '}' )
            {
            // InternalDsl.g:583:2: ( () otherlv_1= 'semantics' otherlv_2= '{' ( (lv_values_3_0= ruleValue ) )* otherlv_4= '}' )
            // InternalDsl.g:584:3: () otherlv_1= 'semantics' otherlv_2= '{' ( (lv_values_3_0= ruleValue ) )* otherlv_4= '}'
            {
            // InternalDsl.g:584:3: ()
            // InternalDsl.g:585:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSemanticAccess().getSemanticAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSemanticAccess().getSemanticsKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSemanticAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:599:3: ( (lv_values_3_0= ruleValue ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:600:4: (lv_values_3_0= ruleValue )
            	    {
            	    // InternalDsl.g:600:4: (lv_values_3_0= ruleValue )
            	    // InternalDsl.g:601:5: lv_values_3_0= ruleValue
            	    {

            	    					newCompositeNode(grammarAccess.getSemanticAccess().getValuesValueParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_values_3_0=ruleValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSemanticRule());
            	    					}
            	    					add(
            	    						current,
            	    						"values",
            	    						lv_values_3_0,
            	    						"org.eclipse.gemoc.Dsl.Value");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSemanticAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSemantic"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000001E4020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001C4020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000184020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000104020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010002L});

}