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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_WS", "RULE_ENTRYKEY", "RULE_SEPARATOR", "RULE_LINE_START", "RULE_STRING", "RULE_ANY_OTHER", "'\\r'", "'\\n'", "','", "'\\\\'"
    };
    public static final int RULE_WS=5;
    public static final int RULE_STRING=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SEPARATOR=7;
    public static final int RULE_SL_COMMENT=4;
    public static final int RULE_ENTRYKEY=6;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_LINE_START=8;
    public static final int EOF=-1;

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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDslRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDsl=ruleDsl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDsl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalDsl.g:71:1: ruleDsl returns [EObject current=null] : ( () ( ( ( (lv_entries_1_0= ruleEntry ) ) | ( ( ruleEMPTY_LINE )=> ruleEMPTY_LINE ) | this_SL_COMMENT_3= RULE_SL_COMMENT ) ( (otherlv_4= '\\r' )? otherlv_5= '\\n' )* )* ) ;
    public final EObject ruleDsl() throws RecognitionException {
        EObject current = null;

        Token this_SL_COMMENT_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_entries_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( ( () ( ( ( (lv_entries_1_0= ruleEntry ) ) | ( ( ruleEMPTY_LINE )=> ruleEMPTY_LINE ) | this_SL_COMMENT_3= RULE_SL_COMMENT ) ( (otherlv_4= '\\r' )? otherlv_5= '\\n' )* )* ) )
            // InternalDsl.g:78:2: ( () ( ( ( (lv_entries_1_0= ruleEntry ) ) | ( ( ruleEMPTY_LINE )=> ruleEMPTY_LINE ) | this_SL_COMMENT_3= RULE_SL_COMMENT ) ( (otherlv_4= '\\r' )? otherlv_5= '\\n' )* )* )
            {
            // InternalDsl.g:78:2: ( () ( ( ( (lv_entries_1_0= ruleEntry ) ) | ( ( ruleEMPTY_LINE )=> ruleEMPTY_LINE ) | this_SL_COMMENT_3= RULE_SL_COMMENT ) ( (otherlv_4= '\\r' )? otherlv_5= '\\n' )* )* )
            // InternalDsl.g:79:3: () ( ( ( (lv_entries_1_0= ruleEntry ) ) | ( ( ruleEMPTY_LINE )=> ruleEMPTY_LINE ) | this_SL_COMMENT_3= RULE_SL_COMMENT ) ( (otherlv_4= '\\r' )? otherlv_5= '\\n' )* )*
            {
            // InternalDsl.g:79:3: ()
            // InternalDsl.g:80:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDslAccess().getDslAction_0(),
              					current);
              			
            }

            }

            // InternalDsl.g:86:3: ( ( ( (lv_entries_1_0= ruleEntry ) ) | ( ( ruleEMPTY_LINE )=> ruleEMPTY_LINE ) | this_SL_COMMENT_3= RULE_SL_COMMENT ) ( (otherlv_4= '\\r' )? otherlv_5= '\\n' )* )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_SL_COMMENT && LA4_0<=RULE_ENTRYKEY)||LA4_0==RULE_LINE_START) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDsl.g:87:4: ( ( (lv_entries_1_0= ruleEntry ) ) | ( ( ruleEMPTY_LINE )=> ruleEMPTY_LINE ) | this_SL_COMMENT_3= RULE_SL_COMMENT ) ( (otherlv_4= '\\r' )? otherlv_5= '\\n' )*
            	    {
            	    // InternalDsl.g:87:4: ( ( (lv_entries_1_0= ruleEntry ) ) | ( ( ruleEMPTY_LINE )=> ruleEMPTY_LINE ) | this_SL_COMMENT_3= RULE_SL_COMMENT )
            	    int alt1=3;
            	    int LA1_0 = input.LA(1);

            	    if ( ((LA1_0>=RULE_WS && LA1_0<=RULE_ENTRYKEY)) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==RULE_LINE_START) && (synpred1_InternalDsl())) {
            	        alt1=2;
            	    }
            	    else if ( (LA1_0==RULE_SL_COMMENT) ) {
            	        alt1=3;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalDsl.g:88:5: ( (lv_entries_1_0= ruleEntry ) )
            	            {
            	            // InternalDsl.g:88:5: ( (lv_entries_1_0= ruleEntry ) )
            	            // InternalDsl.g:89:6: (lv_entries_1_0= ruleEntry )
            	            {
            	            // InternalDsl.g:89:6: (lv_entries_1_0= ruleEntry )
            	            // InternalDsl.g:90:7: lv_entries_1_0= ruleEntry
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getDslAccess().getEntriesEntryParserRuleCall_1_0_0_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_3);
            	            lv_entries_1_0=ruleEntry();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getDslRule());
            	              							}
            	              							add(
            	              								current,
            	              								"entries",
            	              								lv_entries_1_0,
            	              								"org.eclipse.gemoc.Dsl.Entry");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDsl.g:108:5: ( ( ruleEMPTY_LINE )=> ruleEMPTY_LINE )
            	            {
            	            // InternalDsl.g:108:5: ( ( ruleEMPTY_LINE )=> ruleEMPTY_LINE )
            	            // InternalDsl.g:109:6: ( ruleEMPTY_LINE )=> ruleEMPTY_LINE
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getDslAccess().getEMPTY_LINEParserRuleCall_1_0_1());
            	              					
            	            }
            	            pushFollow(FOLLOW_3);
            	            ruleEMPTY_LINE();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalDsl.g:119:5: this_SL_COMMENT_3= RULE_SL_COMMENT
            	            {
            	            this_SL_COMMENT_3=(Token)match(input,RULE_SL_COMMENT,FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_SL_COMMENT_3, grammarAccess.getDslAccess().getSL_COMMENTTerminalRuleCall_1_0_2());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalDsl.g:124:4: ( (otherlv_4= '\\r' )? otherlv_5= '\\n' )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( ((LA3_0>=11 && LA3_0<=12)) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalDsl.g:125:5: (otherlv_4= '\\r' )? otherlv_5= '\\n'
            	    	    {
            	    	    // InternalDsl.g:125:5: (otherlv_4= '\\r' )?
            	    	    int alt2=2;
            	    	    int LA2_0 = input.LA(1);

            	    	    if ( (LA2_0==11) ) {
            	    	        alt2=1;
            	    	    }
            	    	    switch (alt2) {
            	    	        case 1 :
            	    	            // InternalDsl.g:126:6: otherlv_4= '\\r'
            	    	            {
            	    	            otherlv_4=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
            	    	            if ( state.backtracking==0 ) {

            	    	              						newLeafNode(otherlv_4, grammarAccess.getDslAccess().getCarriageReturnKeyword_1_1_0());
            	    	              					
            	    	            }

            	    	            }
            	    	            break;

            	    	    }

            	    	    otherlv_5=(Token)match(input,12,FOLLOW_3); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(otherlv_5, grammarAccess.getDslAccess().getLineFeedKeyword_1_1_1());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDsl"


    // $ANTLR start "entryRuleEntry"
    // InternalDsl.g:141:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // InternalDsl.g:141:46: (iv_ruleEntry= ruleEntry EOF )
            // InternalDsl.g:142:2: iv_ruleEntry= ruleEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEntry=ruleEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntry; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEntry"


    // $ANTLR start "ruleEntry"
    // InternalDsl.g:148:1: ruleEntry returns [EObject current=null] : ( (this_WS_0= RULE_WS )* ( (lv_key_1_0= RULE_ENTRYKEY ) ) (this_WS_2= RULE_WS )* this_SEPARATOR_3= RULE_SEPARATOR (this_WS_4= RULE_WS )* ( (lv_value_5_0= ruleEntryValue ) ) ) ;
    public final EObject ruleEntry() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token lv_key_1_0=null;
        Token this_WS_2=null;
        Token this_SEPARATOR_3=null;
        Token this_WS_4=null;
        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:154:2: ( ( (this_WS_0= RULE_WS )* ( (lv_key_1_0= RULE_ENTRYKEY ) ) (this_WS_2= RULE_WS )* this_SEPARATOR_3= RULE_SEPARATOR (this_WS_4= RULE_WS )* ( (lv_value_5_0= ruleEntryValue ) ) ) )
            // InternalDsl.g:155:2: ( (this_WS_0= RULE_WS )* ( (lv_key_1_0= RULE_ENTRYKEY ) ) (this_WS_2= RULE_WS )* this_SEPARATOR_3= RULE_SEPARATOR (this_WS_4= RULE_WS )* ( (lv_value_5_0= ruleEntryValue ) ) )
            {
            // InternalDsl.g:155:2: ( (this_WS_0= RULE_WS )* ( (lv_key_1_0= RULE_ENTRYKEY ) ) (this_WS_2= RULE_WS )* this_SEPARATOR_3= RULE_SEPARATOR (this_WS_4= RULE_WS )* ( (lv_value_5_0= ruleEntryValue ) ) )
            // InternalDsl.g:156:3: (this_WS_0= RULE_WS )* ( (lv_key_1_0= RULE_ENTRYKEY ) ) (this_WS_2= RULE_WS )* this_SEPARATOR_3= RULE_SEPARATOR (this_WS_4= RULE_WS )* ( (lv_value_5_0= ruleEntryValue ) )
            {
            // InternalDsl.g:156:3: (this_WS_0= RULE_WS )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_WS) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:157:4: this_WS_0= RULE_WS
            	    {
            	    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_WS_0, grammarAccess.getEntryAccess().getWSTerminalRuleCall_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalDsl.g:162:3: ( (lv_key_1_0= RULE_ENTRYKEY ) )
            // InternalDsl.g:163:4: (lv_key_1_0= RULE_ENTRYKEY )
            {
            // InternalDsl.g:163:4: (lv_key_1_0= RULE_ENTRYKEY )
            // InternalDsl.g:164:5: lv_key_1_0= RULE_ENTRYKEY
            {
            lv_key_1_0=(Token)match(input,RULE_ENTRYKEY,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_key_1_0, grammarAccess.getEntryAccess().getKeyENTRYKEYTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEntryRule());
              					}
              					setWithLastConsumed(
              						current,
              						"key",
              						lv_key_1_0,
              						"org.eclipse.gemoc.Dsl.ENTRYKEY");
              				
            }

            }


            }

            // InternalDsl.g:180:3: (this_WS_2= RULE_WS )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_WS) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:181:4: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_WS_2, grammarAccess.getEntryAccess().getWSTerminalRuleCall_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            this_SEPARATOR_3=(Token)match(input,RULE_SEPARATOR,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_SEPARATOR_3, grammarAccess.getEntryAccess().getSEPARATORTerminalRuleCall_3());
              		
            }
            // InternalDsl.g:190:3: (this_WS_4= RULE_WS )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_WS) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:191:4: this_WS_4= RULE_WS
            	    {
            	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_WS_4, grammarAccess.getEntryAccess().getWSTerminalRuleCall_4());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalDsl.g:196:3: ( (lv_value_5_0= ruleEntryValue ) )
            // InternalDsl.g:197:4: (lv_value_5_0= ruleEntryValue )
            {
            // InternalDsl.g:197:4: (lv_value_5_0= ruleEntryValue )
            // InternalDsl.g:198:5: lv_value_5_0= ruleEntryValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEntryAccess().getValueEntryValueParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_5_0=ruleEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEntryRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_5_0,
              						"org.eclipse.gemoc.Dsl.EntryValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEntry"


    // $ANTLR start "entryRuleEntryValue"
    // InternalDsl.g:219:1: entryRuleEntryValue returns [EObject current=null] : iv_ruleEntryValue= ruleEntryValue EOF ;
    public final EObject entryRuleEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryValue = null;


        try {
            // InternalDsl.g:219:51: (iv_ruleEntryValue= ruleEntryValue EOF )
            // InternalDsl.g:220:2: iv_ruleEntryValue= ruleEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEntryValue=ruleEntryValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEntryValue"


    // $ANTLR start "ruleEntryValue"
    // InternalDsl.g:226:1: ruleEntryValue returns [EObject current=null] : ( () ( (lv_entryLines_1_0= ruleENTRYVALUE_LINE ) ) ( (this_WS_2= RULE_WS )* ( ( ( ( ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START ) )=> (otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START ) ) ( (lv_entryLines_7_0= ruleENTRYVALUE_LINE ) ) ) | ( ( ( ( '\\\\' RULE_LINE_START ) )=> (otherlv_8= '\\\\' this_LINE_START_9= RULE_LINE_START ) ) ( (lv_entryLines_10_0= ruleENTRYVALUE_LINE ) ) ) | (otherlv_11= ',' (this_WS_12= RULE_WS )* ( (lv_entryLines_13_0= ruleENTRYVALUE_LINE ) ) ) ) )* ) ;
    public final EObject ruleEntryValue() throws RecognitionException {
        EObject current = null;

        Token this_WS_2=null;
        Token otherlv_3=null;
        Token this_WS_4=null;
        Token otherlv_5=null;
        Token this_LINE_START_6=null;
        Token otherlv_8=null;
        Token this_LINE_START_9=null;
        Token otherlv_11=null;
        Token this_WS_12=null;
        AntlrDatatypeRuleToken lv_entryLines_1_0 = null;

        AntlrDatatypeRuleToken lv_entryLines_7_0 = null;

        AntlrDatatypeRuleToken lv_entryLines_10_0 = null;

        AntlrDatatypeRuleToken lv_entryLines_13_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:232:2: ( ( () ( (lv_entryLines_1_0= ruleENTRYVALUE_LINE ) ) ( (this_WS_2= RULE_WS )* ( ( ( ( ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START ) )=> (otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START ) ) ( (lv_entryLines_7_0= ruleENTRYVALUE_LINE ) ) ) | ( ( ( ( '\\\\' RULE_LINE_START ) )=> (otherlv_8= '\\\\' this_LINE_START_9= RULE_LINE_START ) ) ( (lv_entryLines_10_0= ruleENTRYVALUE_LINE ) ) ) | (otherlv_11= ',' (this_WS_12= RULE_WS )* ( (lv_entryLines_13_0= ruleENTRYVALUE_LINE ) ) ) ) )* ) )
            // InternalDsl.g:233:2: ( () ( (lv_entryLines_1_0= ruleENTRYVALUE_LINE ) ) ( (this_WS_2= RULE_WS )* ( ( ( ( ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START ) )=> (otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START ) ) ( (lv_entryLines_7_0= ruleENTRYVALUE_LINE ) ) ) | ( ( ( ( '\\\\' RULE_LINE_START ) )=> (otherlv_8= '\\\\' this_LINE_START_9= RULE_LINE_START ) ) ( (lv_entryLines_10_0= ruleENTRYVALUE_LINE ) ) ) | (otherlv_11= ',' (this_WS_12= RULE_WS )* ( (lv_entryLines_13_0= ruleENTRYVALUE_LINE ) ) ) ) )* )
            {
            // InternalDsl.g:233:2: ( () ( (lv_entryLines_1_0= ruleENTRYVALUE_LINE ) ) ( (this_WS_2= RULE_WS )* ( ( ( ( ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START ) )=> (otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START ) ) ( (lv_entryLines_7_0= ruleENTRYVALUE_LINE ) ) ) | ( ( ( ( '\\\\' RULE_LINE_START ) )=> (otherlv_8= '\\\\' this_LINE_START_9= RULE_LINE_START ) ) ( (lv_entryLines_10_0= ruleENTRYVALUE_LINE ) ) ) | (otherlv_11= ',' (this_WS_12= RULE_WS )* ( (lv_entryLines_13_0= ruleENTRYVALUE_LINE ) ) ) ) )* )
            // InternalDsl.g:234:3: () ( (lv_entryLines_1_0= ruleENTRYVALUE_LINE ) ) ( (this_WS_2= RULE_WS )* ( ( ( ( ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START ) )=> (otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START ) ) ( (lv_entryLines_7_0= ruleENTRYVALUE_LINE ) ) ) | ( ( ( ( '\\\\' RULE_LINE_START ) )=> (otherlv_8= '\\\\' this_LINE_START_9= RULE_LINE_START ) ) ( (lv_entryLines_10_0= ruleENTRYVALUE_LINE ) ) ) | (otherlv_11= ',' (this_WS_12= RULE_WS )* ( (lv_entryLines_13_0= ruleENTRYVALUE_LINE ) ) ) ) )*
            {
            // InternalDsl.g:234:3: ()
            // InternalDsl.g:235:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEntryValueAccess().getEntryValueAction_0(),
              					current);
              			
            }

            }

            // InternalDsl.g:241:3: ( (lv_entryLines_1_0= ruleENTRYVALUE_LINE ) )
            // InternalDsl.g:242:4: (lv_entryLines_1_0= ruleENTRYVALUE_LINE )
            {
            // InternalDsl.g:242:4: (lv_entryLines_1_0= ruleENTRYVALUE_LINE )
            // InternalDsl.g:243:5: lv_entryLines_1_0= ruleENTRYVALUE_LINE
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEntryValueAccess().getEntryLinesENTRYVALUE_LINEParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_entryLines_1_0=ruleENTRYVALUE_LINE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEntryValueRule());
              					}
              					add(
              						current,
              						"entryLines",
              						lv_entryLines_1_0,
              						"org.eclipse.gemoc.Dsl.ENTRYVALUE_LINE");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDsl.g:260:3: ( (this_WS_2= RULE_WS )* ( ( ( ( ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START ) )=> (otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START ) ) ( (lv_entryLines_7_0= ruleENTRYVALUE_LINE ) ) ) | ( ( ( ( '\\\\' RULE_LINE_START ) )=> (otherlv_8= '\\\\' this_LINE_START_9= RULE_LINE_START ) ) ( (lv_entryLines_10_0= ruleENTRYVALUE_LINE ) ) ) | (otherlv_11= ',' (this_WS_12= RULE_WS )* ( (lv_entryLines_13_0= ruleENTRYVALUE_LINE ) ) ) ) )*
            loop12:
            do {
                int alt12=2;
                alt12 = dfa12.predict(input);
                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:261:4: (this_WS_2= RULE_WS )* ( ( ( ( ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START ) )=> (otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START ) ) ( (lv_entryLines_7_0= ruleENTRYVALUE_LINE ) ) ) | ( ( ( ( '\\\\' RULE_LINE_START ) )=> (otherlv_8= '\\\\' this_LINE_START_9= RULE_LINE_START ) ) ( (lv_entryLines_10_0= ruleENTRYVALUE_LINE ) ) ) | (otherlv_11= ',' (this_WS_12= RULE_WS )* ( (lv_entryLines_13_0= ruleENTRYVALUE_LINE ) ) ) )
            	    {
            	    // InternalDsl.g:261:4: (this_WS_2= RULE_WS )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==RULE_WS) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalDsl.g:262:5: this_WS_2= RULE_WS
            	    	    {
            	    	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_9); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(this_WS_2, grammarAccess.getEntryValueAccess().getWSTerminalRuleCall_2_0());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop8;
            	        }
            	    } while (true);

            	    // InternalDsl.g:267:4: ( ( ( ( ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START ) )=> (otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START ) ) ( (lv_entryLines_7_0= ruleENTRYVALUE_LINE ) ) ) | ( ( ( ( '\\\\' RULE_LINE_START ) )=> (otherlv_8= '\\\\' this_LINE_START_9= RULE_LINE_START ) ) ( (lv_entryLines_10_0= ruleENTRYVALUE_LINE ) ) ) | (otherlv_11= ',' (this_WS_12= RULE_WS )* ( (lv_entryLines_13_0= ruleENTRYVALUE_LINE ) ) ) )
            	    int alt11=3;
            	    alt11 = dfa11.predict(input);
            	    switch (alt11) {
            	        case 1 :
            	            // InternalDsl.g:268:5: ( ( ( ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START ) )=> (otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START ) ) ( (lv_entryLines_7_0= ruleENTRYVALUE_LINE ) ) )
            	            {
            	            // InternalDsl.g:268:5: ( ( ( ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START ) )=> (otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START ) ) ( (lv_entryLines_7_0= ruleENTRYVALUE_LINE ) ) )
            	            // InternalDsl.g:269:6: ( ( ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START ) )=> (otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START ) ) ( (lv_entryLines_7_0= ruleENTRYVALUE_LINE ) )
            	            {
            	            // InternalDsl.g:269:6: ( ( ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START ) )=> (otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START ) )
            	            // InternalDsl.g:270:7: ( ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START ) )=> (otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START )
            	            {
            	            // InternalDsl.g:279:7: (otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START )
            	            // InternalDsl.g:280:8: otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START
            	            {
            	            otherlv_3=(Token)match(input,13,FOLLOW_10); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(otherlv_3, grammarAccess.getEntryValueAccess().getCommaKeyword_2_1_0_0_0_0());
            	              							
            	            }
            	            // InternalDsl.g:284:8: (this_WS_4= RULE_WS )*
            	            loop9:
            	            do {
            	                int alt9=2;
            	                int LA9_0 = input.LA(1);

            	                if ( (LA9_0==RULE_WS) ) {
            	                    alt9=1;
            	                }


            	                switch (alt9) {
            	            	case 1 :
            	            	    // InternalDsl.g:285:9: this_WS_4= RULE_WS
            	            	    {
            	            	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_10); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      									newLeafNode(this_WS_4, grammarAccess.getEntryValueAccess().getWSTerminalRuleCall_2_1_0_0_0_1());
            	            	      								
            	            	    }

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop9;
            	                }
            	            } while (true);

            	            otherlv_5=(Token)match(input,14,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(otherlv_5, grammarAccess.getEntryValueAccess().getBackslashKeyword_2_1_0_0_0_2());
            	              							
            	            }
            	            this_LINE_START_6=(Token)match(input,RULE_LINE_START,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(this_LINE_START_6, grammarAccess.getEntryValueAccess().getLINE_STARTTerminalRuleCall_2_1_0_0_0_3());
            	              							
            	            }

            	            }


            	            }

            	            // InternalDsl.g:300:6: ( (lv_entryLines_7_0= ruleENTRYVALUE_LINE ) )
            	            // InternalDsl.g:301:7: (lv_entryLines_7_0= ruleENTRYVALUE_LINE )
            	            {
            	            // InternalDsl.g:301:7: (lv_entryLines_7_0= ruleENTRYVALUE_LINE )
            	            // InternalDsl.g:302:8: lv_entryLines_7_0= ruleENTRYVALUE_LINE
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getEntryValueAccess().getEntryLinesENTRYVALUE_LINEParserRuleCall_2_1_0_1_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_entryLines_7_0=ruleENTRYVALUE_LINE();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getEntryValueRule());
            	              								}
            	              								add(
            	              									current,
            	              									"entryLines",
            	              									lv_entryLines_7_0,
            	              									"org.eclipse.gemoc.Dsl.ENTRYVALUE_LINE");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDsl.g:321:5: ( ( ( ( '\\\\' RULE_LINE_START ) )=> (otherlv_8= '\\\\' this_LINE_START_9= RULE_LINE_START ) ) ( (lv_entryLines_10_0= ruleENTRYVALUE_LINE ) ) )
            	            {
            	            // InternalDsl.g:321:5: ( ( ( ( '\\\\' RULE_LINE_START ) )=> (otherlv_8= '\\\\' this_LINE_START_9= RULE_LINE_START ) ) ( (lv_entryLines_10_0= ruleENTRYVALUE_LINE ) ) )
            	            // InternalDsl.g:322:6: ( ( ( '\\\\' RULE_LINE_START ) )=> (otherlv_8= '\\\\' this_LINE_START_9= RULE_LINE_START ) ) ( (lv_entryLines_10_0= ruleENTRYVALUE_LINE ) )
            	            {
            	            // InternalDsl.g:322:6: ( ( ( '\\\\' RULE_LINE_START ) )=> (otherlv_8= '\\\\' this_LINE_START_9= RULE_LINE_START ) )
            	            // InternalDsl.g:323:7: ( ( '\\\\' RULE_LINE_START ) )=> (otherlv_8= '\\\\' this_LINE_START_9= RULE_LINE_START )
            	            {
            	            // InternalDsl.g:328:7: (otherlv_8= '\\\\' this_LINE_START_9= RULE_LINE_START )
            	            // InternalDsl.g:329:8: otherlv_8= '\\\\' this_LINE_START_9= RULE_LINE_START
            	            {
            	            otherlv_8=(Token)match(input,14,FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(otherlv_8, grammarAccess.getEntryValueAccess().getBackslashKeyword_2_1_1_0_0_0());
            	              							
            	            }
            	            this_LINE_START_9=(Token)match(input,RULE_LINE_START,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(this_LINE_START_9, grammarAccess.getEntryValueAccess().getLINE_STARTTerminalRuleCall_2_1_1_0_0_1());
            	              							
            	            }

            	            }


            	            }

            	            // InternalDsl.g:339:6: ( (lv_entryLines_10_0= ruleENTRYVALUE_LINE ) )
            	            // InternalDsl.g:340:7: (lv_entryLines_10_0= ruleENTRYVALUE_LINE )
            	            {
            	            // InternalDsl.g:340:7: (lv_entryLines_10_0= ruleENTRYVALUE_LINE )
            	            // InternalDsl.g:341:8: lv_entryLines_10_0= ruleENTRYVALUE_LINE
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getEntryValueAccess().getEntryLinesENTRYVALUE_LINEParserRuleCall_2_1_1_1_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_entryLines_10_0=ruleENTRYVALUE_LINE();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getEntryValueRule());
            	              								}
            	              								add(
            	              									current,
            	              									"entryLines",
            	              									lv_entryLines_10_0,
            	              									"org.eclipse.gemoc.Dsl.ENTRYVALUE_LINE");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalDsl.g:360:5: (otherlv_11= ',' (this_WS_12= RULE_WS )* ( (lv_entryLines_13_0= ruleENTRYVALUE_LINE ) ) )
            	            {
            	            // InternalDsl.g:360:5: (otherlv_11= ',' (this_WS_12= RULE_WS )* ( (lv_entryLines_13_0= ruleENTRYVALUE_LINE ) ) )
            	            // InternalDsl.g:361:6: otherlv_11= ',' (this_WS_12= RULE_WS )* ( (lv_entryLines_13_0= ruleENTRYVALUE_LINE ) )
            	            {
            	            otherlv_11=(Token)match(input,13,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_11, grammarAccess.getEntryValueAccess().getCommaKeyword_2_1_2_0());
            	              					
            	            }
            	            // InternalDsl.g:365:6: (this_WS_12= RULE_WS )*
            	            loop10:
            	            do {
            	                int alt10=2;
            	                int LA10_0 = input.LA(1);

            	                if ( (LA10_0==RULE_WS) ) {
            	                    alt10=1;
            	                }


            	                switch (alt10) {
            	            	case 1 :
            	            	    // InternalDsl.g:366:7: this_WS_12= RULE_WS
            	            	    {
            	            	    this_WS_12=(Token)match(input,RULE_WS,FOLLOW_7); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      							newLeafNode(this_WS_12, grammarAccess.getEntryValueAccess().getWSTerminalRuleCall_2_1_2_1());
            	            	      						
            	            	    }

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop10;
            	                }
            	            } while (true);

            	            // InternalDsl.g:371:6: ( (lv_entryLines_13_0= ruleENTRYVALUE_LINE ) )
            	            // InternalDsl.g:372:7: (lv_entryLines_13_0= ruleENTRYVALUE_LINE )
            	            {
            	            // InternalDsl.g:372:7: (lv_entryLines_13_0= ruleENTRYVALUE_LINE )
            	            // InternalDsl.g:373:8: lv_entryLines_13_0= ruleENTRYVALUE_LINE
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getEntryValueAccess().getEntryLinesENTRYVALUE_LINEParserRuleCall_2_1_2_2_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_entryLines_13_0=ruleENTRYVALUE_LINE();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getEntryValueRule());
            	              								}
            	              								add(
            	              									current,
            	              									"entryLines",
            	              									lv_entryLines_13_0,
            	              									"org.eclipse.gemoc.Dsl.ENTRYVALUE_LINE");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEntryValue"


    // $ANTLR start "entryRuleENTRYVALUE_LINE"
    // InternalDsl.g:397:1: entryRuleENTRYVALUE_LINE returns [String current=null] : iv_ruleENTRYVALUE_LINE= ruleENTRYVALUE_LINE EOF ;
    public final String entryRuleENTRYVALUE_LINE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleENTRYVALUE_LINE = null;


        try {
            // InternalDsl.g:397:55: (iv_ruleENTRYVALUE_LINE= ruleENTRYVALUE_LINE EOF )
            // InternalDsl.g:398:2: iv_ruleENTRYVALUE_LINE= ruleENTRYVALUE_LINE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getENTRYVALUE_LINERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleENTRYVALUE_LINE=ruleENTRYVALUE_LINE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleENTRYVALUE_LINE.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleENTRYVALUE_LINE"


    // $ANTLR start "ruleENTRYVALUE_LINE"
    // InternalDsl.g:404:1: ruleENTRYVALUE_LINE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ENTRYKEY_0= RULE_ENTRYKEY | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleENTRYVALUE_LINE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ENTRYKEY_0=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalDsl.g:410:2: ( (this_ENTRYKEY_0= RULE_ENTRYKEY | this_STRING_1= RULE_STRING ) )
            // InternalDsl.g:411:2: (this_ENTRYKEY_0= RULE_ENTRYKEY | this_STRING_1= RULE_STRING )
            {
            // InternalDsl.g:411:2: (this_ENTRYKEY_0= RULE_ENTRYKEY | this_STRING_1= RULE_STRING )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ENTRYKEY) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_STRING) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:412:3: this_ENTRYKEY_0= RULE_ENTRYKEY
                    {
                    this_ENTRYKEY_0=(Token)match(input,RULE_ENTRYKEY,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ENTRYKEY_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ENTRYKEY_0, grammarAccess.getENTRYVALUE_LINEAccess().getENTRYKEYTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDsl.g:420:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_1, grammarAccess.getENTRYVALUE_LINEAccess().getSTRINGTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleENTRYVALUE_LINE"


    // $ANTLR start "entryRuleEMPTY_LINE"
    // InternalDsl.g:431:1: entryRuleEMPTY_LINE returns [String current=null] : iv_ruleEMPTY_LINE= ruleEMPTY_LINE EOF ;
    public final String entryRuleEMPTY_LINE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEMPTY_LINE = null;


        try {
            // InternalDsl.g:431:50: (iv_ruleEMPTY_LINE= ruleEMPTY_LINE EOF )
            // InternalDsl.g:432:2: iv_ruleEMPTY_LINE= ruleEMPTY_LINE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEMPTY_LINERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEMPTY_LINE=ruleEMPTY_LINE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEMPTY_LINE.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEMPTY_LINE"


    // $ANTLR start "ruleEMPTY_LINE"
    // InternalDsl.g:438:1: ruleEMPTY_LINE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_LINE_START_0= RULE_LINE_START ;
    public final AntlrDatatypeRuleToken ruleEMPTY_LINE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_LINE_START_0=null;


        	enterRule();

        try {
            // InternalDsl.g:444:2: (this_LINE_START_0= RULE_LINE_START )
            // InternalDsl.g:445:2: this_LINE_START_0= RULE_LINE_START
            {
            this_LINE_START_0=(Token)match(input,RULE_LINE_START,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_LINE_START_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_LINE_START_0, grammarAccess.getEMPTY_LINEAccess().getLINE_STARTTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEMPTY_LINE"

    // $ANTLR start synpred1_InternalDsl
    public final void synpred1_InternalDsl_fragment() throws RecognitionException {   
        // InternalDsl.g:109:6: ( ruleEMPTY_LINE )
        // InternalDsl.g:109:7: ruleEMPTY_LINE
        {
        pushFollow(FOLLOW_2);
        ruleEMPTY_LINE();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalDsl

    // $ANTLR start synpred2_InternalDsl
    public final void synpred2_InternalDsl_fragment() throws RecognitionException {   
        // InternalDsl.g:270:7: ( ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START ) )
        // InternalDsl.g:270:8: ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START )
        {
        // InternalDsl.g:270:8: ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START )
        // InternalDsl.g:271:8: ',' ( RULE_WS )* '\\\\' RULE_LINE_START
        {
        match(input,13,FOLLOW_10); if (state.failed) return ;
        // InternalDsl.g:272:8: ( RULE_WS )*
        loop14:
        do {
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_WS) ) {
                alt14=1;
            }


            switch (alt14) {
        	case 1 :
        	    // InternalDsl.g:273:9: RULE_WS
        	    {
        	    match(input,RULE_WS,FOLLOW_10); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop14;
            }
        } while (true);

        match(input,14,FOLLOW_11); if (state.failed) return ;
        match(input,RULE_LINE_START,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalDsl

    // $ANTLR start synpred3_InternalDsl
    public final void synpred3_InternalDsl_fragment() throws RecognitionException {   
        // InternalDsl.g:323:7: ( ( '\\\\' RULE_LINE_START ) )
        // InternalDsl.g:323:8: ( '\\\\' RULE_LINE_START )
        {
        // InternalDsl.g:323:8: ( '\\\\' RULE_LINE_START )
        // InternalDsl.g:324:8: '\\\\' RULE_LINE_START
        {
        match(input,14,FOLLOW_11); if (state.failed) return ;
        match(input,RULE_LINE_START,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalDsl

    // Delegated rules

    public final boolean synpred2_InternalDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\4\uffff";
    static final String dfa_2s = "\1\1\3\uffff";
    static final String dfa_3s = "\1\4\1\uffff\1\5\1\uffff";
    static final String dfa_4s = "\1\16\1\uffff\1\16\1\uffff";
    static final String dfa_5s = "\1\uffff\1\2\1\uffff\1\1";
    static final String dfa_6s = "\4\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\1\1\uffff\1\1\2\uffff\2\1\2\3",
            "",
            "\1\2\1\1\6\uffff\2\3",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 260:3: ( (this_WS_2= RULE_WS )* ( ( ( ( ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START ) )=> (otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START ) ) ( (lv_entryLines_7_0= ruleENTRYVALUE_LINE ) ) ) | ( ( ( ( '\\\\' RULE_LINE_START ) )=> (otherlv_8= '\\\\' this_LINE_START_9= RULE_LINE_START ) ) ( (lv_entryLines_10_0= ruleENTRYVALUE_LINE ) ) ) | (otherlv_11= ',' (this_WS_12= RULE_WS )* ( (lv_entryLines_13_0= ruleENTRYVALUE_LINE ) ) ) ) )*";
        }
    }
    static final String dfa_8s = "\6\uffff";
    static final String dfa_9s = "\1\15\1\5\1\uffff\1\5\2\uffff";
    static final String dfa_10s = "\2\16\1\uffff\1\16\2\uffff";
    static final String dfa_11s = "\2\uffff\1\2\1\uffff\1\3\1\1";
    static final String dfa_12s = "\1\0\1\1\1\uffff\1\2\2\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\1\2",
            "\1\3\1\4\2\uffff\1\4\4\uffff\1\5",
            "",
            "\1\3\1\4\2\uffff\1\4\4\uffff\1\5",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "267:4: ( ( ( ( ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START ) )=> (otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START ) ) ( (lv_entryLines_7_0= ruleENTRYVALUE_LINE ) ) ) | ( ( ( ( '\\\\' RULE_LINE_START ) )=> (otherlv_8= '\\\\' this_LINE_START_9= RULE_LINE_START ) ) ( (lv_entryLines_10_0= ruleENTRYVALUE_LINE ) ) ) | (otherlv_11= ',' (this_WS_12= RULE_WS )* ( (lv_entryLines_13_0= ruleENTRYVALUE_LINE ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_0 = input.LA(1);

                         
                        int index11_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_0==13) ) {s = 1;}

                        else if ( (LA11_0==14) && (synpred3_InternalDsl())) {s = 2;}

                         
                        input.seek(index11_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_1 = input.LA(1);

                         
                        int index11_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_1==RULE_WS) ) {s = 3;}

                        else if ( (LA11_1==RULE_ENTRYKEY||LA11_1==RULE_STRING) ) {s = 4;}

                        else if ( (LA11_1==14) && (synpred2_InternalDsl())) {s = 5;}

                         
                        input.seek(index11_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_3==14) && (synpred2_InternalDsl())) {s = 5;}

                        else if ( (LA11_3==RULE_WS) ) {s = 3;}

                        else if ( (LA11_3==RULE_ENTRYKEY||LA11_3==RULE_STRING) ) {s = 4;}

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001972L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000260L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000006022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000006020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000100L});

}