package org.eclipse.gemoc.example.k3fsm.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.gemoc.example.k3fsm.services.K3FSMGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalK3FSMParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FSM'", "'{'", "'unprocessedString'", "'consummedString'", "'producedString'", "'initialState'", "'finalState'", "'currentState'", "'ownedStates'", "','", "'}'", "'State'", "'outgoingTransitions'", "'Transition'", "'input'", "'output'", "'target'"
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


        public InternalK3FSMParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalK3FSMParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalK3FSMParser.tokenNames; }
    public String getGrammarFileName() { return "InternalK3FSM.g"; }



     	private K3FSMGrammarAccess grammarAccess;

        public InternalK3FSMParser(TokenStream input, K3FSMGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "FSM";
       	}

       	@Override
       	protected K3FSMGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFSM"
    // InternalK3FSM.g:64:1: entryRuleFSM returns [EObject current=null] : iv_ruleFSM= ruleFSM EOF ;
    public final EObject entryRuleFSM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFSM = null;


        try {
            // InternalK3FSM.g:64:44: (iv_ruleFSM= ruleFSM EOF )
            // InternalK3FSM.g:65:2: iv_ruleFSM= ruleFSM EOF
            {
             newCompositeNode(grammarAccess.getFSMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFSM=ruleFSM();

            state._fsp--;

             current =iv_ruleFSM; 
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
    // $ANTLR end "entryRuleFSM"


    // $ANTLR start "ruleFSM"
    // InternalK3FSM.g:71:1: ruleFSM returns [EObject current=null] : (otherlv_0= 'FSM' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'unprocessedString' ( (lv_unprocessedString_4_0= ruleEString ) ) )? (otherlv_5= 'consummedString' ( (lv_consummedString_6_0= ruleEString ) ) )? (otherlv_7= 'producedString' ( (lv_producedString_8_0= ruleEString ) ) )? otherlv_9= 'initialState' ( ( ruleEString ) ) (otherlv_11= 'finalState' ( ( ruleEString ) ) )? (otherlv_13= 'currentState' ( ( ruleEString ) ) )? (otherlv_15= 'ownedStates' otherlv_16= '{' ( (lv_ownedStates_17_0= ruleState ) ) (otherlv_18= ',' ( (lv_ownedStates_19_0= ruleState ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleFSM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_unprocessedString_4_0 = null;

        AntlrDatatypeRuleToken lv_consummedString_6_0 = null;

        AntlrDatatypeRuleToken lv_producedString_8_0 = null;

        EObject lv_ownedStates_17_0 = null;

        EObject lv_ownedStates_19_0 = null;



        	enterRule();

        try {
            // InternalK3FSM.g:77:2: ( (otherlv_0= 'FSM' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'unprocessedString' ( (lv_unprocessedString_4_0= ruleEString ) ) )? (otherlv_5= 'consummedString' ( (lv_consummedString_6_0= ruleEString ) ) )? (otherlv_7= 'producedString' ( (lv_producedString_8_0= ruleEString ) ) )? otherlv_9= 'initialState' ( ( ruleEString ) ) (otherlv_11= 'finalState' ( ( ruleEString ) ) )? (otherlv_13= 'currentState' ( ( ruleEString ) ) )? (otherlv_15= 'ownedStates' otherlv_16= '{' ( (lv_ownedStates_17_0= ruleState ) ) (otherlv_18= ',' ( (lv_ownedStates_19_0= ruleState ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalK3FSM.g:78:2: (otherlv_0= 'FSM' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'unprocessedString' ( (lv_unprocessedString_4_0= ruleEString ) ) )? (otherlv_5= 'consummedString' ( (lv_consummedString_6_0= ruleEString ) ) )? (otherlv_7= 'producedString' ( (lv_producedString_8_0= ruleEString ) ) )? otherlv_9= 'initialState' ( ( ruleEString ) ) (otherlv_11= 'finalState' ( ( ruleEString ) ) )? (otherlv_13= 'currentState' ( ( ruleEString ) ) )? (otherlv_15= 'ownedStates' otherlv_16= '{' ( (lv_ownedStates_17_0= ruleState ) ) (otherlv_18= ',' ( (lv_ownedStates_19_0= ruleState ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalK3FSM.g:78:2: (otherlv_0= 'FSM' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'unprocessedString' ( (lv_unprocessedString_4_0= ruleEString ) ) )? (otherlv_5= 'consummedString' ( (lv_consummedString_6_0= ruleEString ) ) )? (otherlv_7= 'producedString' ( (lv_producedString_8_0= ruleEString ) ) )? otherlv_9= 'initialState' ( ( ruleEString ) ) (otherlv_11= 'finalState' ( ( ruleEString ) ) )? (otherlv_13= 'currentState' ( ( ruleEString ) ) )? (otherlv_15= 'ownedStates' otherlv_16= '{' ( (lv_ownedStates_17_0= ruleState ) ) (otherlv_18= ',' ( (lv_ownedStates_19_0= ruleState ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // InternalK3FSM.g:79:3: otherlv_0= 'FSM' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'unprocessedString' ( (lv_unprocessedString_4_0= ruleEString ) ) )? (otherlv_5= 'consummedString' ( (lv_consummedString_6_0= ruleEString ) ) )? (otherlv_7= 'producedString' ( (lv_producedString_8_0= ruleEString ) ) )? otherlv_9= 'initialState' ( ( ruleEString ) ) (otherlv_11= 'finalState' ( ( ruleEString ) ) )? (otherlv_13= 'currentState' ( ( ruleEString ) ) )? (otherlv_15= 'ownedStates' otherlv_16= '{' ( (lv_ownedStates_17_0= ruleState ) ) (otherlv_18= ',' ( (lv_ownedStates_19_0= ruleState ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFSMAccess().getFSMKeyword_0());
            		
            // InternalK3FSM.g:83:3: ( (lv_name_1_0= ruleEString ) )
            // InternalK3FSM.g:84:4: (lv_name_1_0= ruleEString )
            {
            // InternalK3FSM.g:84:4: (lv_name_1_0= ruleEString )
            // InternalK3FSM.g:85:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFSMAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFSMRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.gemoc.example.k3fsm.K3FSM.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalK3FSM.g:106:3: (otherlv_3= 'unprocessedString' ( (lv_unprocessedString_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalK3FSM.g:107:4: otherlv_3= 'unprocessedString' ( (lv_unprocessedString_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getFSMAccess().getUnprocessedStringKeyword_3_0());
                    			
                    // InternalK3FSM.g:111:4: ( (lv_unprocessedString_4_0= ruleEString ) )
                    // InternalK3FSM.g:112:5: (lv_unprocessedString_4_0= ruleEString )
                    {
                    // InternalK3FSM.g:112:5: (lv_unprocessedString_4_0= ruleEString )
                    // InternalK3FSM.g:113:6: lv_unprocessedString_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFSMAccess().getUnprocessedStringEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_unprocessedString_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFSMRule());
                    						}
                    						set(
                    							current,
                    							"unprocessedString",
                    							lv_unprocessedString_4_0,
                    							"org.eclipse.gemoc.example.k3fsm.K3FSM.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalK3FSM.g:131:3: (otherlv_5= 'consummedString' ( (lv_consummedString_6_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalK3FSM.g:132:4: otherlv_5= 'consummedString' ( (lv_consummedString_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getFSMAccess().getConsummedStringKeyword_4_0());
                    			
                    // InternalK3FSM.g:136:4: ( (lv_consummedString_6_0= ruleEString ) )
                    // InternalK3FSM.g:137:5: (lv_consummedString_6_0= ruleEString )
                    {
                    // InternalK3FSM.g:137:5: (lv_consummedString_6_0= ruleEString )
                    // InternalK3FSM.g:138:6: lv_consummedString_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFSMAccess().getConsummedStringEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_consummedString_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFSMRule());
                    						}
                    						set(
                    							current,
                    							"consummedString",
                    							lv_consummedString_6_0,
                    							"org.eclipse.gemoc.example.k3fsm.K3FSM.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalK3FSM.g:156:3: (otherlv_7= 'producedString' ( (lv_producedString_8_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalK3FSM.g:157:4: otherlv_7= 'producedString' ( (lv_producedString_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getFSMAccess().getProducedStringKeyword_5_0());
                    			
                    // InternalK3FSM.g:161:4: ( (lv_producedString_8_0= ruleEString ) )
                    // InternalK3FSM.g:162:5: (lv_producedString_8_0= ruleEString )
                    {
                    // InternalK3FSM.g:162:5: (lv_producedString_8_0= ruleEString )
                    // InternalK3FSM.g:163:6: lv_producedString_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFSMAccess().getProducedStringEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_producedString_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFSMRule());
                    						}
                    						set(
                    							current,
                    							"producedString",
                    							lv_producedString_8_0,
                    							"org.eclipse.gemoc.example.k3fsm.K3FSM.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getFSMAccess().getInitialStateKeyword_6());
            		
            // InternalK3FSM.g:185:3: ( ( ruleEString ) )
            // InternalK3FSM.g:186:4: ( ruleEString )
            {
            // InternalK3FSM.g:186:4: ( ruleEString )
            // InternalK3FSM.g:187:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFSMRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFSMAccess().getInitialStateStateCrossReference_7_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalK3FSM.g:201:3: (otherlv_11= 'finalState' ( ( ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalK3FSM.g:202:4: otherlv_11= 'finalState' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getFSMAccess().getFinalStateKeyword_8_0());
                    			
                    // InternalK3FSM.g:206:4: ( ( ruleEString ) )
                    // InternalK3FSM.g:207:5: ( ruleEString )
                    {
                    // InternalK3FSM.g:207:5: ( ruleEString )
                    // InternalK3FSM.g:208:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFSMRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFSMAccess().getFinalStateStateCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalK3FSM.g:223:3: (otherlv_13= 'currentState' ( ( ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalK3FSM.g:224:4: otherlv_13= 'currentState' ( ( ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getFSMAccess().getCurrentStateKeyword_9_0());
                    			
                    // InternalK3FSM.g:228:4: ( ( ruleEString ) )
                    // InternalK3FSM.g:229:5: ( ruleEString )
                    {
                    // InternalK3FSM.g:229:5: ( ruleEString )
                    // InternalK3FSM.g:230:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFSMRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFSMAccess().getCurrentStateStateCrossReference_9_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalK3FSM.g:245:3: (otherlv_15= 'ownedStates' otherlv_16= '{' ( (lv_ownedStates_17_0= ruleState ) ) (otherlv_18= ',' ( (lv_ownedStates_19_0= ruleState ) ) )* otherlv_20= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalK3FSM.g:246:4: otherlv_15= 'ownedStates' otherlv_16= '{' ( (lv_ownedStates_17_0= ruleState ) ) (otherlv_18= ',' ( (lv_ownedStates_19_0= ruleState ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getFSMAccess().getOwnedStatesKeyword_10_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_16, grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalK3FSM.g:254:4: ( (lv_ownedStates_17_0= ruleState ) )
                    // InternalK3FSM.g:255:5: (lv_ownedStates_17_0= ruleState )
                    {
                    // InternalK3FSM.g:255:5: (lv_ownedStates_17_0= ruleState )
                    // InternalK3FSM.g:256:6: lv_ownedStates_17_0= ruleState
                    {

                    						newCompositeNode(grammarAccess.getFSMAccess().getOwnedStatesStateParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_ownedStates_17_0=ruleState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFSMRule());
                    						}
                    						add(
                    							current,
                    							"ownedStates",
                    							lv_ownedStates_17_0,
                    							"org.eclipse.gemoc.example.k3fsm.K3FSM.State");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalK3FSM.g:273:4: (otherlv_18= ',' ( (lv_ownedStates_19_0= ruleState ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==20) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalK3FSM.g:274:5: otherlv_18= ',' ( (lv_ownedStates_19_0= ruleState ) )
                    	    {
                    	    otherlv_18=(Token)match(input,20,FOLLOW_12); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getFSMAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalK3FSM.g:278:5: ( (lv_ownedStates_19_0= ruleState ) )
                    	    // InternalK3FSM.g:279:6: (lv_ownedStates_19_0= ruleState )
                    	    {
                    	    // InternalK3FSM.g:279:6: (lv_ownedStates_19_0= ruleState )
                    	    // InternalK3FSM.g:280:7: lv_ownedStates_19_0= ruleState
                    	    {

                    	    							newCompositeNode(grammarAccess.getFSMAccess().getOwnedStatesStateParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_ownedStates_19_0=ruleState();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFSMRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedStates",
                    	    								lv_ownedStates_19_0,
                    	    								"org.eclipse.gemoc.example.k3fsm.K3FSM.State");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_20, grammarAccess.getFSMAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getFSMAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleFSM"


    // $ANTLR start "entryRuleEString"
    // InternalK3FSM.g:311:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalK3FSM.g:311:47: (iv_ruleEString= ruleEString EOF )
            // InternalK3FSM.g:312:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalK3FSM.g:318:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalK3FSM.g:324:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalK3FSM.g:325:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalK3FSM.g:325:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalK3FSM.g:326:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalK3FSM.g:334:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleState"
    // InternalK3FSM.g:345:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalK3FSM.g:345:46: (iv_ruleState= ruleState EOF )
            // InternalK3FSM.g:346:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalK3FSM.g:352:1: ruleState returns [EObject current=null] : ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'outgoingTransitions' otherlv_5= '{' ( (lv_outgoingTransitions_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_outgoingTransitions_8_0= ruleTransition ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_outgoingTransitions_6_0 = null;

        EObject lv_outgoingTransitions_8_0 = null;



        	enterRule();

        try {
            // InternalK3FSM.g:358:2: ( ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'outgoingTransitions' otherlv_5= '{' ( (lv_outgoingTransitions_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_outgoingTransitions_8_0= ruleTransition ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalK3FSM.g:359:2: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'outgoingTransitions' otherlv_5= '{' ( (lv_outgoingTransitions_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_outgoingTransitions_8_0= ruleTransition ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalK3FSM.g:359:2: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'outgoingTransitions' otherlv_5= '{' ( (lv_outgoingTransitions_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_outgoingTransitions_8_0= ruleTransition ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalK3FSM.g:360:3: () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'outgoingTransitions' otherlv_5= '{' ( (lv_outgoingTransitions_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_outgoingTransitions_8_0= ruleTransition ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalK3FSM.g:360:3: ()
            // InternalK3FSM.g:361:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateAccess().getStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
            		
            // InternalK3FSM.g:371:3: ( (lv_name_2_0= ruleEString ) )
            // InternalK3FSM.g:372:4: (lv_name_2_0= ruleEString )
            {
            // InternalK3FSM.g:372:4: (lv_name_2_0= ruleEString )
            // InternalK3FSM.g:373:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.gemoc.example.k3fsm.K3FSM.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalK3FSM.g:394:3: (otherlv_4= 'outgoingTransitions' otherlv_5= '{' ( (lv_outgoingTransitions_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_outgoingTransitions_8_0= ruleTransition ) ) )* otherlv_9= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalK3FSM.g:395:4: otherlv_4= 'outgoingTransitions' otherlv_5= '{' ( (lv_outgoingTransitions_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_outgoingTransitions_8_0= ruleTransition ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getStateAccess().getOutgoingTransitionsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalK3FSM.g:403:4: ( (lv_outgoingTransitions_6_0= ruleTransition ) )
                    // InternalK3FSM.g:404:5: (lv_outgoingTransitions_6_0= ruleTransition )
                    {
                    // InternalK3FSM.g:404:5: (lv_outgoingTransitions_6_0= ruleTransition )
                    // InternalK3FSM.g:405:6: lv_outgoingTransitions_6_0= ruleTransition
                    {

                    						newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_outgoingTransitions_6_0=ruleTransition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStateRule());
                    						}
                    						add(
                    							current,
                    							"outgoingTransitions",
                    							lv_outgoingTransitions_6_0,
                    							"org.eclipse.gemoc.example.k3fsm.K3FSM.Transition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalK3FSM.g:422:4: (otherlv_7= ',' ( (lv_outgoingTransitions_8_0= ruleTransition ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==20) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalK3FSM.g:423:5: otherlv_7= ',' ( (lv_outgoingTransitions_8_0= ruleTransition ) )
                    	    {
                    	    otherlv_7=(Token)match(input,20,FOLLOW_16); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getStateAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalK3FSM.g:427:5: ( (lv_outgoingTransitions_8_0= ruleTransition ) )
                    	    // InternalK3FSM.g:428:6: (lv_outgoingTransitions_8_0= ruleTransition )
                    	    {
                    	    // InternalK3FSM.g:428:6: (lv_outgoingTransitions_8_0= ruleTransition )
                    	    // InternalK3FSM.g:429:7: lv_outgoingTransitions_8_0= ruleTransition
                    	    {

                    	    							newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_outgoingTransitions_8_0=ruleTransition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"outgoingTransitions",
                    	    								lv_outgoingTransitions_8_0,
                    	    								"org.eclipse.gemoc.example.k3fsm.K3FSM.Transition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalK3FSM.g:460:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalK3FSM.g:460:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalK3FSM.g:461:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalK3FSM.g:467:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'input' ( (lv_input_4_0= ruleEString ) ) )? (otherlv_5= 'output' ( (lv_output_6_0= ruleEString ) ) )? otherlv_7= 'target' ( ( ruleEString ) ) otherlv_9= '}' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_input_4_0 = null;

        AntlrDatatypeRuleToken lv_output_6_0 = null;



        	enterRule();

        try {
            // InternalK3FSM.g:473:2: ( (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'input' ( (lv_input_4_0= ruleEString ) ) )? (otherlv_5= 'output' ( (lv_output_6_0= ruleEString ) ) )? otherlv_7= 'target' ( ( ruleEString ) ) otherlv_9= '}' ) )
            // InternalK3FSM.g:474:2: (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'input' ( (lv_input_4_0= ruleEString ) ) )? (otherlv_5= 'output' ( (lv_output_6_0= ruleEString ) ) )? otherlv_7= 'target' ( ( ruleEString ) ) otherlv_9= '}' )
            {
            // InternalK3FSM.g:474:2: (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'input' ( (lv_input_4_0= ruleEString ) ) )? (otherlv_5= 'output' ( (lv_output_6_0= ruleEString ) ) )? otherlv_7= 'target' ( ( ruleEString ) ) otherlv_9= '}' )
            // InternalK3FSM.g:475:3: otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'input' ( (lv_input_4_0= ruleEString ) ) )? (otherlv_5= 'output' ( (lv_output_6_0= ruleEString ) ) )? otherlv_7= 'target' ( ( ruleEString ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            // InternalK3FSM.g:479:3: ( (lv_name_1_0= ruleEString ) )
            // InternalK3FSM.g:480:4: (lv_name_1_0= ruleEString )
            {
            // InternalK3FSM.g:480:4: (lv_name_1_0= ruleEString )
            // InternalK3FSM.g:481:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.gemoc.example.k3fsm.K3FSM.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalK3FSM.g:502:3: (otherlv_3= 'input' ( (lv_input_4_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalK3FSM.g:503:4: otherlv_3= 'input' ( (lv_input_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getInputKeyword_3_0());
                    			
                    // InternalK3FSM.g:507:4: ( (lv_input_4_0= ruleEString ) )
                    // InternalK3FSM.g:508:5: (lv_input_4_0= ruleEString )
                    {
                    // InternalK3FSM.g:508:5: (lv_input_4_0= ruleEString )
                    // InternalK3FSM.g:509:6: lv_input_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getInputEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_input_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"input",
                    							lv_input_4_0,
                    							"org.eclipse.gemoc.example.k3fsm.K3FSM.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalK3FSM.g:527:3: (otherlv_5= 'output' ( (lv_output_6_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalK3FSM.g:528:4: otherlv_5= 'output' ( (lv_output_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getOutputKeyword_4_0());
                    			
                    // InternalK3FSM.g:532:4: ( (lv_output_6_0= ruleEString ) )
                    // InternalK3FSM.g:533:5: (lv_output_6_0= ruleEString )
                    {
                    // InternalK3FSM.g:533:5: (lv_output_6_0= ruleEString )
                    // InternalK3FSM.g:534:6: lv_output_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getOutputEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_output_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"output",
                    							lv_output_6_0,
                    							"org.eclipse.gemoc.example.k3fsm.K3FSM.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getTargetKeyword_5());
            		
            // InternalK3FSM.g:556:3: ( ( ruleEString ) )
            // InternalK3FSM.g:557:4: ( ruleEString )
            {
            // InternalK3FSM.g:557:4: ( ruleEString )
            // InternalK3FSM.g:558:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getTargetStateCrossReference_6_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleTransition"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000002E0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000002C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});

}