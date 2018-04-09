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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_WS", "RULE_SEPARATOR", "RULE_ENTRYKEY", "RULE_STRING", "RULE_LINE_START", "RULE_SPECIAL_CHAR", "RULE_ANY_OTHER", "'\\r'", "'\\n'", "'name'", "','", "'\\\\'"
    };
    public static final int RULE_SPECIAL_CHAR=10;
    public static final int RULE_WS=5;
    public static final int RULE_STRING=8;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SEPARATOR=6;
    public static final int RULE_SL_COMMENT=4;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_ENTRYKEY=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_LINE_START=9;
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
    // InternalDsl.g:71:1: ruleDsl returns [EObject current=null] : ( () ( (otherlv_1= '\\r' )? otherlv_2= '\\n' )* ( ( ( ( ruleEMPTY_LINE )=> ruleEMPTY_LINE ) | this_SL_COMMENT_4= RULE_SL_COMMENT ) ( (otherlv_5= '\\r' )? otherlv_6= '\\n' )* )* otherlv_7= 'name' (this_WS_8= RULE_WS )* this_SEPARATOR_9= RULE_SEPARATOR (this_WS_10= RULE_WS )* ( ( (lv_name_11_1= RULE_ENTRYKEY | lv_name_11_2= RULE_STRING ) ) ) ( (otherlv_12= '\\r' )? otherlv_13= '\\n' )* ( ( ( (lv_entries_14_0= ruleEntry ) ) | ( ( ruleEMPTY_LINE )=> ruleEMPTY_LINE ) | this_SL_COMMENT_16= RULE_SL_COMMENT ) ( (otherlv_17= '\\r' )? otherlv_18= '\\n' )* )* ) ;
    public final EObject ruleDsl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_SL_COMMENT_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_WS_8=null;
        Token this_SEPARATOR_9=null;
        Token this_WS_10=null;
        Token lv_name_11_1=null;
        Token lv_name_11_2=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token this_SL_COMMENT_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_entries_14_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( ( () ( (otherlv_1= '\\r' )? otherlv_2= '\\n' )* ( ( ( ( ruleEMPTY_LINE )=> ruleEMPTY_LINE ) | this_SL_COMMENT_4= RULE_SL_COMMENT ) ( (otherlv_5= '\\r' )? otherlv_6= '\\n' )* )* otherlv_7= 'name' (this_WS_8= RULE_WS )* this_SEPARATOR_9= RULE_SEPARATOR (this_WS_10= RULE_WS )* ( ( (lv_name_11_1= RULE_ENTRYKEY | lv_name_11_2= RULE_STRING ) ) ) ( (otherlv_12= '\\r' )? otherlv_13= '\\n' )* ( ( ( (lv_entries_14_0= ruleEntry ) ) | ( ( ruleEMPTY_LINE )=> ruleEMPTY_LINE ) | this_SL_COMMENT_16= RULE_SL_COMMENT ) ( (otherlv_17= '\\r' )? otherlv_18= '\\n' )* )* ) )
            // InternalDsl.g:78:2: ( () ( (otherlv_1= '\\r' )? otherlv_2= '\\n' )* ( ( ( ( ruleEMPTY_LINE )=> ruleEMPTY_LINE ) | this_SL_COMMENT_4= RULE_SL_COMMENT ) ( (otherlv_5= '\\r' )? otherlv_6= '\\n' )* )* otherlv_7= 'name' (this_WS_8= RULE_WS )* this_SEPARATOR_9= RULE_SEPARATOR (this_WS_10= RULE_WS )* ( ( (lv_name_11_1= RULE_ENTRYKEY | lv_name_11_2= RULE_STRING ) ) ) ( (otherlv_12= '\\r' )? otherlv_13= '\\n' )* ( ( ( (lv_entries_14_0= ruleEntry ) ) | ( ( ruleEMPTY_LINE )=> ruleEMPTY_LINE ) | this_SL_COMMENT_16= RULE_SL_COMMENT ) ( (otherlv_17= '\\r' )? otherlv_18= '\\n' )* )* )
            {
            // InternalDsl.g:78:2: ( () ( (otherlv_1= '\\r' )? otherlv_2= '\\n' )* ( ( ( ( ruleEMPTY_LINE )=> ruleEMPTY_LINE ) | this_SL_COMMENT_4= RULE_SL_COMMENT ) ( (otherlv_5= '\\r' )? otherlv_6= '\\n' )* )* otherlv_7= 'name' (this_WS_8= RULE_WS )* this_SEPARATOR_9= RULE_SEPARATOR (this_WS_10= RULE_WS )* ( ( (lv_name_11_1= RULE_ENTRYKEY | lv_name_11_2= RULE_STRING ) ) ) ( (otherlv_12= '\\r' )? otherlv_13= '\\n' )* ( ( ( (lv_entries_14_0= ruleEntry ) ) | ( ( ruleEMPTY_LINE )=> ruleEMPTY_LINE ) | this_SL_COMMENT_16= RULE_SL_COMMENT ) ( (otherlv_17= '\\r' )? otherlv_18= '\\n' )* )* )
            // InternalDsl.g:79:3: () ( (otherlv_1= '\\r' )? otherlv_2= '\\n' )* ( ( ( ( ruleEMPTY_LINE )=> ruleEMPTY_LINE ) | this_SL_COMMENT_4= RULE_SL_COMMENT ) ( (otherlv_5= '\\r' )? otherlv_6= '\\n' )* )* otherlv_7= 'name' (this_WS_8= RULE_WS )* this_SEPARATOR_9= RULE_SEPARATOR (this_WS_10= RULE_WS )* ( ( (lv_name_11_1= RULE_ENTRYKEY | lv_name_11_2= RULE_STRING ) ) ) ( (otherlv_12= '\\r' )? otherlv_13= '\\n' )* ( ( ( (lv_entries_14_0= ruleEntry ) ) | ( ( ruleEMPTY_LINE )=> ruleEMPTY_LINE ) | this_SL_COMMENT_16= RULE_SL_COMMENT ) ( (otherlv_17= '\\r' )? otherlv_18= '\\n' )* )*
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

            // InternalDsl.g:86:3: ( (otherlv_1= '\\r' )? otherlv_2= '\\n' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=12 && LA2_0<=13)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDsl.g:87:4: (otherlv_1= '\\r' )? otherlv_2= '\\n'
            	    {
            	    // InternalDsl.g:87:4: (otherlv_1= '\\r' )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==12) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalDsl.g:88:5: otherlv_1= '\\r'
            	            {
            	            otherlv_1=(Token)match(input,12,FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_1, grammarAccess.getDslAccess().getCarriageReturnKeyword_1_0());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    otherlv_2=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDslAccess().getLineFeedKeyword_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalDsl.g:98:3: ( ( ( ( ruleEMPTY_LINE )=> ruleEMPTY_LINE ) | this_SL_COMMENT_4= RULE_SL_COMMENT ) ( (otherlv_5= '\\r' )? otherlv_6= '\\n' )* )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_SL_COMMENT||LA6_0==RULE_LINE_START) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:99:4: ( ( ( ruleEMPTY_LINE )=> ruleEMPTY_LINE ) | this_SL_COMMENT_4= RULE_SL_COMMENT ) ( (otherlv_5= '\\r' )? otherlv_6= '\\n' )*
            	    {
            	    // InternalDsl.g:99:4: ( ( ( ruleEMPTY_LINE )=> ruleEMPTY_LINE ) | this_SL_COMMENT_4= RULE_SL_COMMENT )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==RULE_LINE_START) && (synpred1_InternalDsl())) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==RULE_SL_COMMENT) ) {
            	        alt3=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalDsl.g:100:5: ( ( ruleEMPTY_LINE )=> ruleEMPTY_LINE )
            	            {
            	            // InternalDsl.g:100:5: ( ( ruleEMPTY_LINE )=> ruleEMPTY_LINE )
            	            // InternalDsl.g:101:6: ( ruleEMPTY_LINE )=> ruleEMPTY_LINE
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getDslAccess().getEMPTY_LINEParserRuleCall_2_0_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_4);
            	            ruleEMPTY_LINE();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDsl.g:111:5: this_SL_COMMENT_4= RULE_SL_COMMENT
            	            {
            	            this_SL_COMMENT_4=(Token)match(input,RULE_SL_COMMENT,FOLLOW_4); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_SL_COMMENT_4, grammarAccess.getDslAccess().getSL_COMMENTTerminalRuleCall_2_0_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalDsl.g:116:4: ( (otherlv_5= '\\r' )? otherlv_6= '\\n' )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( ((LA5_0>=12 && LA5_0<=13)) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalDsl.g:117:5: (otherlv_5= '\\r' )? otherlv_6= '\\n'
            	    	    {
            	    	    // InternalDsl.g:117:5: (otherlv_5= '\\r' )?
            	    	    int alt4=2;
            	    	    int LA4_0 = input.LA(1);

            	    	    if ( (LA4_0==12) ) {
            	    	        alt4=1;
            	    	    }
            	    	    switch (alt4) {
            	    	        case 1 :
            	    	            // InternalDsl.g:118:6: otherlv_5= '\\r'
            	    	            {
            	    	            otherlv_5=(Token)match(input,12,FOLLOW_3); if (state.failed) return current;
            	    	            if ( state.backtracking==0 ) {

            	    	              						newLeafNode(otherlv_5, grammarAccess.getDslAccess().getCarriageReturnKeyword_2_1_0());
            	    	              					
            	    	            }

            	    	            }
            	    	            break;

            	    	    }

            	    	    otherlv_6=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(otherlv_6, grammarAccess.getDslAccess().getLineFeedKeyword_2_1_1());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDslAccess().getNameKeyword_3());
              		
            }
            // InternalDsl.g:133:3: (this_WS_8= RULE_WS )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_WS) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:134:4: this_WS_8= RULE_WS
            	    {
            	    this_WS_8=(Token)match(input,RULE_WS,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_WS_8, grammarAccess.getDslAccess().getWSTerminalRuleCall_4());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            this_SEPARATOR_9=(Token)match(input,RULE_SEPARATOR,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_SEPARATOR_9, grammarAccess.getDslAccess().getSEPARATORTerminalRuleCall_5());
              		
            }
            // InternalDsl.g:143:3: (this_WS_10= RULE_WS )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_WS) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:144:4: this_WS_10= RULE_WS
            	    {
            	    this_WS_10=(Token)match(input,RULE_WS,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_WS_10, grammarAccess.getDslAccess().getWSTerminalRuleCall_6());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalDsl.g:149:3: ( ( (lv_name_11_1= RULE_ENTRYKEY | lv_name_11_2= RULE_STRING ) ) )
            // InternalDsl.g:150:4: ( (lv_name_11_1= RULE_ENTRYKEY | lv_name_11_2= RULE_STRING ) )
            {
            // InternalDsl.g:150:4: ( (lv_name_11_1= RULE_ENTRYKEY | lv_name_11_2= RULE_STRING ) )
            // InternalDsl.g:151:5: (lv_name_11_1= RULE_ENTRYKEY | lv_name_11_2= RULE_STRING )
            {
            // InternalDsl.g:151:5: (lv_name_11_1= RULE_ENTRYKEY | lv_name_11_2= RULE_STRING )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ENTRYKEY) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_STRING) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:152:6: lv_name_11_1= RULE_ENTRYKEY
                    {
                    lv_name_11_1=(Token)match(input,RULE_ENTRYKEY,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_11_1, grammarAccess.getDslAccess().getNameENTRYKEYTerminalRuleCall_7_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDslRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_11_1,
                      							"org.eclipse.gemoc.Dsl.ENTRYKEY");
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalDsl.g:167:6: lv_name_11_2= RULE_STRING
                    {
                    lv_name_11_2=(Token)match(input,RULE_STRING,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_11_2, grammarAccess.getDslAccess().getNameSTRINGTerminalRuleCall_7_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDslRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_11_2,
                      							"org.eclipse.gemoc.Dsl.STRING");
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalDsl.g:184:3: ( (otherlv_12= '\\r' )? otherlv_13= '\\n' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=12 && LA11_0<=13)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:185:4: (otherlv_12= '\\r' )? otherlv_13= '\\n'
            	    {
            	    // InternalDsl.g:185:4: (otherlv_12= '\\r' )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==12) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalDsl.g:186:5: otherlv_12= '\\r'
            	            {
            	            otherlv_12=(Token)match(input,12,FOLLOW_3); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_12, grammarAccess.getDslAccess().getCarriageReturnKeyword_8_0());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    otherlv_13=(Token)match(input,13,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_13, grammarAccess.getDslAccess().getLineFeedKeyword_8_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalDsl.g:196:3: ( ( ( (lv_entries_14_0= ruleEntry ) ) | ( ( ruleEMPTY_LINE )=> ruleEMPTY_LINE ) | this_SL_COMMENT_16= RULE_SL_COMMENT ) ( (otherlv_17= '\\r' )? otherlv_18= '\\n' )* )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_SL_COMMENT && LA15_0<=RULE_WS)||LA15_0==RULE_ENTRYKEY||LA15_0==RULE_LINE_START) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDsl.g:197:4: ( ( (lv_entries_14_0= ruleEntry ) ) | ( ( ruleEMPTY_LINE )=> ruleEMPTY_LINE ) | this_SL_COMMENT_16= RULE_SL_COMMENT ) ( (otherlv_17= '\\r' )? otherlv_18= '\\n' )*
            	    {
            	    // InternalDsl.g:197:4: ( ( (lv_entries_14_0= ruleEntry ) ) | ( ( ruleEMPTY_LINE )=> ruleEMPTY_LINE ) | this_SL_COMMENT_16= RULE_SL_COMMENT )
            	    int alt12=3;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==RULE_WS||LA12_0==RULE_ENTRYKEY) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==RULE_LINE_START) && (synpred2_InternalDsl())) {
            	        alt12=2;
            	    }
            	    else if ( (LA12_0==RULE_SL_COMMENT) ) {
            	        alt12=3;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalDsl.g:198:5: ( (lv_entries_14_0= ruleEntry ) )
            	            {
            	            // InternalDsl.g:198:5: ( (lv_entries_14_0= ruleEntry ) )
            	            // InternalDsl.g:199:6: (lv_entries_14_0= ruleEntry )
            	            {
            	            // InternalDsl.g:199:6: (lv_entries_14_0= ruleEntry )
            	            // InternalDsl.g:200:7: lv_entries_14_0= ruleEntry
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getDslAccess().getEntriesEntryParserRuleCall_9_0_0_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_7);
            	            lv_entries_14_0=ruleEntry();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getDslRule());
            	              							}
            	              							add(
            	              								current,
            	              								"entries",
            	              								lv_entries_14_0,
            	              								"org.eclipse.gemoc.Dsl.Entry");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDsl.g:218:5: ( ( ruleEMPTY_LINE )=> ruleEMPTY_LINE )
            	            {
            	            // InternalDsl.g:218:5: ( ( ruleEMPTY_LINE )=> ruleEMPTY_LINE )
            	            // InternalDsl.g:219:6: ( ruleEMPTY_LINE )=> ruleEMPTY_LINE
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getDslAccess().getEMPTY_LINEParserRuleCall_9_0_1());
            	              					
            	            }
            	            pushFollow(FOLLOW_7);
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
            	            // InternalDsl.g:229:5: this_SL_COMMENT_16= RULE_SL_COMMENT
            	            {
            	            this_SL_COMMENT_16=(Token)match(input,RULE_SL_COMMENT,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_SL_COMMENT_16, grammarAccess.getDslAccess().getSL_COMMENTTerminalRuleCall_9_0_2());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalDsl.g:234:4: ( (otherlv_17= '\\r' )? otherlv_18= '\\n' )*
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( ((LA14_0>=12 && LA14_0<=13)) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // InternalDsl.g:235:5: (otherlv_17= '\\r' )? otherlv_18= '\\n'
            	    	    {
            	    	    // InternalDsl.g:235:5: (otherlv_17= '\\r' )?
            	    	    int alt13=2;
            	    	    int LA13_0 = input.LA(1);

            	    	    if ( (LA13_0==12) ) {
            	    	        alt13=1;
            	    	    }
            	    	    switch (alt13) {
            	    	        case 1 :
            	    	            // InternalDsl.g:236:6: otherlv_17= '\\r'
            	    	            {
            	    	            otherlv_17=(Token)match(input,12,FOLLOW_3); if (state.failed) return current;
            	    	            if ( state.backtracking==0 ) {

            	    	              						newLeafNode(otherlv_17, grammarAccess.getDslAccess().getCarriageReturnKeyword_9_1_0());
            	    	              					
            	    	            }

            	    	            }
            	    	            break;

            	    	    }

            	    	    otherlv_18=(Token)match(input,13,FOLLOW_7); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(otherlv_18, grammarAccess.getDslAccess().getLineFeedKeyword_9_1_1());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop14;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalDsl.g:251:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // InternalDsl.g:251:46: (iv_ruleEntry= ruleEntry EOF )
            // InternalDsl.g:252:2: iv_ruleEntry= ruleEntry EOF
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
    // InternalDsl.g:258:1: ruleEntry returns [EObject current=null] : ( (this_WS_0= RULE_WS )* ( (lv_key_1_0= RULE_ENTRYKEY ) ) (this_WS_2= RULE_WS )* this_SEPARATOR_3= RULE_SEPARATOR (this_WS_4= RULE_WS )* ( (lv_value_5_0= ruleEntryValue ) ) ) ;
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
            // InternalDsl.g:264:2: ( ( (this_WS_0= RULE_WS )* ( (lv_key_1_0= RULE_ENTRYKEY ) ) (this_WS_2= RULE_WS )* this_SEPARATOR_3= RULE_SEPARATOR (this_WS_4= RULE_WS )* ( (lv_value_5_0= ruleEntryValue ) ) ) )
            // InternalDsl.g:265:2: ( (this_WS_0= RULE_WS )* ( (lv_key_1_0= RULE_ENTRYKEY ) ) (this_WS_2= RULE_WS )* this_SEPARATOR_3= RULE_SEPARATOR (this_WS_4= RULE_WS )* ( (lv_value_5_0= ruleEntryValue ) ) )
            {
            // InternalDsl.g:265:2: ( (this_WS_0= RULE_WS )* ( (lv_key_1_0= RULE_ENTRYKEY ) ) (this_WS_2= RULE_WS )* this_SEPARATOR_3= RULE_SEPARATOR (this_WS_4= RULE_WS )* ( (lv_value_5_0= ruleEntryValue ) ) )
            // InternalDsl.g:266:3: (this_WS_0= RULE_WS )* ( (lv_key_1_0= RULE_ENTRYKEY ) ) (this_WS_2= RULE_WS )* this_SEPARATOR_3= RULE_SEPARATOR (this_WS_4= RULE_WS )* ( (lv_value_5_0= ruleEntryValue ) )
            {
            // InternalDsl.g:266:3: (this_WS_0= RULE_WS )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_WS) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDsl.g:267:4: this_WS_0= RULE_WS
            	    {
            	    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_WS_0, grammarAccess.getEntryAccess().getWSTerminalRuleCall_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalDsl.g:272:3: ( (lv_key_1_0= RULE_ENTRYKEY ) )
            // InternalDsl.g:273:4: (lv_key_1_0= RULE_ENTRYKEY )
            {
            // InternalDsl.g:273:4: (lv_key_1_0= RULE_ENTRYKEY )
            // InternalDsl.g:274:5: lv_key_1_0= RULE_ENTRYKEY
            {
            lv_key_1_0=(Token)match(input,RULE_ENTRYKEY,FOLLOW_5); if (state.failed) return current;
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

            // InternalDsl.g:290:3: (this_WS_2= RULE_WS )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_WS) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDsl.g:291:4: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_WS_2, grammarAccess.getEntryAccess().getWSTerminalRuleCall_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            this_SEPARATOR_3=(Token)match(input,RULE_SEPARATOR,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_SEPARATOR_3, grammarAccess.getEntryAccess().getSEPARATORTerminalRuleCall_3());
              		
            }
            // InternalDsl.g:300:3: (this_WS_4= RULE_WS )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_WS) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDsl.g:301:4: this_WS_4= RULE_WS
            	    {
            	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_WS_4, grammarAccess.getEntryAccess().getWSTerminalRuleCall_4());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalDsl.g:306:3: ( (lv_value_5_0= ruleEntryValue ) )
            // InternalDsl.g:307:4: (lv_value_5_0= ruleEntryValue )
            {
            // InternalDsl.g:307:4: (lv_value_5_0= ruleEntryValue )
            // InternalDsl.g:308:5: lv_value_5_0= ruleEntryValue
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
    // InternalDsl.g:329:1: entryRuleEntryValue returns [EObject current=null] : iv_ruleEntryValue= ruleEntryValue EOF ;
    public final EObject entryRuleEntryValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryValue = null;


        try {
            // InternalDsl.g:329:51: (iv_ruleEntryValue= ruleEntryValue EOF )
            // InternalDsl.g:330:2: iv_ruleEntryValue= ruleEntryValue EOF
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
    // InternalDsl.g:336:1: ruleEntryValue returns [EObject current=null] : ( () ( (lv_entryLines_1_0= ruleENTRYVALUE_LINE ) ) ( (this_WS_2= RULE_WS )* ( ( ( ( ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START ) )=> (otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START ) ) ( (lv_entryLines_7_0= ruleENTRYVALUE_LINE ) ) ) | (otherlv_8= ',' (this_WS_9= RULE_WS )* ( (lv_entryLines_10_0= ruleENTRYVALUE_LINE ) ) ) ) )* ) ;
    public final EObject ruleEntryValue() throws RecognitionException {
        EObject current = null;

        Token this_WS_2=null;
        Token otherlv_3=null;
        Token this_WS_4=null;
        Token otherlv_5=null;
        Token this_LINE_START_6=null;
        Token otherlv_8=null;
        Token this_WS_9=null;
        AntlrDatatypeRuleToken lv_entryLines_1_0 = null;

        AntlrDatatypeRuleToken lv_entryLines_7_0 = null;

        AntlrDatatypeRuleToken lv_entryLines_10_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:342:2: ( ( () ( (lv_entryLines_1_0= ruleENTRYVALUE_LINE ) ) ( (this_WS_2= RULE_WS )* ( ( ( ( ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START ) )=> (otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START ) ) ( (lv_entryLines_7_0= ruleENTRYVALUE_LINE ) ) ) | (otherlv_8= ',' (this_WS_9= RULE_WS )* ( (lv_entryLines_10_0= ruleENTRYVALUE_LINE ) ) ) ) )* ) )
            // InternalDsl.g:343:2: ( () ( (lv_entryLines_1_0= ruleENTRYVALUE_LINE ) ) ( (this_WS_2= RULE_WS )* ( ( ( ( ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START ) )=> (otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START ) ) ( (lv_entryLines_7_0= ruleENTRYVALUE_LINE ) ) ) | (otherlv_8= ',' (this_WS_9= RULE_WS )* ( (lv_entryLines_10_0= ruleENTRYVALUE_LINE ) ) ) ) )* )
            {
            // InternalDsl.g:343:2: ( () ( (lv_entryLines_1_0= ruleENTRYVALUE_LINE ) ) ( (this_WS_2= RULE_WS )* ( ( ( ( ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START ) )=> (otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START ) ) ( (lv_entryLines_7_0= ruleENTRYVALUE_LINE ) ) ) | (otherlv_8= ',' (this_WS_9= RULE_WS )* ( (lv_entryLines_10_0= ruleENTRYVALUE_LINE ) ) ) ) )* )
            // InternalDsl.g:344:3: () ( (lv_entryLines_1_0= ruleENTRYVALUE_LINE ) ) ( (this_WS_2= RULE_WS )* ( ( ( ( ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START ) )=> (otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START ) ) ( (lv_entryLines_7_0= ruleENTRYVALUE_LINE ) ) ) | (otherlv_8= ',' (this_WS_9= RULE_WS )* ( (lv_entryLines_10_0= ruleENTRYVALUE_LINE ) ) ) ) )*
            {
            // InternalDsl.g:344:3: ()
            // InternalDsl.g:345:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEntryValueAccess().getEntryValueAction_0(),
              					current);
              			
            }

            }

            // InternalDsl.g:351:3: ( (lv_entryLines_1_0= ruleENTRYVALUE_LINE ) )
            // InternalDsl.g:352:4: (lv_entryLines_1_0= ruleENTRYVALUE_LINE )
            {
            // InternalDsl.g:352:4: (lv_entryLines_1_0= ruleENTRYVALUE_LINE )
            // InternalDsl.g:353:5: lv_entryLines_1_0= ruleENTRYVALUE_LINE
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEntryValueAccess().getEntryLinesENTRYVALUE_LINEParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_10);
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

            // InternalDsl.g:370:3: ( (this_WS_2= RULE_WS )* ( ( ( ( ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START ) )=> (otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START ) ) ( (lv_entryLines_7_0= ruleENTRYVALUE_LINE ) ) ) | (otherlv_8= ',' (this_WS_9= RULE_WS )* ( (lv_entryLines_10_0= ruleENTRYVALUE_LINE ) ) ) ) )*
            loop23:
            do {
                int alt23=2;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // InternalDsl.g:371:4: (this_WS_2= RULE_WS )* ( ( ( ( ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START ) )=> (otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START ) ) ( (lv_entryLines_7_0= ruleENTRYVALUE_LINE ) ) ) | (otherlv_8= ',' (this_WS_9= RULE_WS )* ( (lv_entryLines_10_0= ruleENTRYVALUE_LINE ) ) ) )
            	    {
            	    // InternalDsl.g:371:4: (this_WS_2= RULE_WS )*
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0==RULE_WS) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // InternalDsl.g:372:5: this_WS_2= RULE_WS
            	    	    {
            	    	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_11); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(this_WS_2, grammarAccess.getEntryValueAccess().getWSTerminalRuleCall_2_0());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop19;
            	        }
            	    } while (true);

            	    // InternalDsl.g:377:4: ( ( ( ( ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START ) )=> (otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START ) ) ( (lv_entryLines_7_0= ruleENTRYVALUE_LINE ) ) ) | (otherlv_8= ',' (this_WS_9= RULE_WS )* ( (lv_entryLines_10_0= ruleENTRYVALUE_LINE ) ) ) )
            	    int alt22=2;
            	    alt22 = dfa22.predict(input);
            	    switch (alt22) {
            	        case 1 :
            	            // InternalDsl.g:378:5: ( ( ( ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START ) )=> (otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START ) ) ( (lv_entryLines_7_0= ruleENTRYVALUE_LINE ) ) )
            	            {
            	            // InternalDsl.g:378:5: ( ( ( ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START ) )=> (otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START ) ) ( (lv_entryLines_7_0= ruleENTRYVALUE_LINE ) ) )
            	            // InternalDsl.g:379:6: ( ( ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START ) )=> (otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START ) ) ( (lv_entryLines_7_0= ruleENTRYVALUE_LINE ) )
            	            {
            	            // InternalDsl.g:379:6: ( ( ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START ) )=> (otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START ) )
            	            // InternalDsl.g:380:7: ( ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START ) )=> (otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START )
            	            {
            	            // InternalDsl.g:389:7: (otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START )
            	            // InternalDsl.g:390:8: otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START
            	            {
            	            otherlv_3=(Token)match(input,15,FOLLOW_12); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(otherlv_3, grammarAccess.getEntryValueAccess().getCommaKeyword_2_1_0_0_0_0());
            	              							
            	            }
            	            // InternalDsl.g:394:8: (this_WS_4= RULE_WS )*
            	            loop20:
            	            do {
            	                int alt20=2;
            	                int LA20_0 = input.LA(1);

            	                if ( (LA20_0==RULE_WS) ) {
            	                    alt20=1;
            	                }


            	                switch (alt20) {
            	            	case 1 :
            	            	    // InternalDsl.g:395:9: this_WS_4= RULE_WS
            	            	    {
            	            	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_12); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      									newLeafNode(this_WS_4, grammarAccess.getEntryValueAccess().getWSTerminalRuleCall_2_1_0_0_0_1());
            	            	      								
            	            	    }

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop20;
            	                }
            	            } while (true);

            	            otherlv_5=(Token)match(input,16,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(otherlv_5, grammarAccess.getEntryValueAccess().getBackslashKeyword_2_1_0_0_0_2());
            	              							
            	            }
            	            this_LINE_START_6=(Token)match(input,RULE_LINE_START,FOLLOW_9); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(this_LINE_START_6, grammarAccess.getEntryValueAccess().getLINE_STARTTerminalRuleCall_2_1_0_0_0_3());
            	              							
            	            }

            	            }


            	            }

            	            // InternalDsl.g:410:6: ( (lv_entryLines_7_0= ruleENTRYVALUE_LINE ) )
            	            // InternalDsl.g:411:7: (lv_entryLines_7_0= ruleENTRYVALUE_LINE )
            	            {
            	            // InternalDsl.g:411:7: (lv_entryLines_7_0= ruleENTRYVALUE_LINE )
            	            // InternalDsl.g:412:8: lv_entryLines_7_0= ruleENTRYVALUE_LINE
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getEntryValueAccess().getEntryLinesENTRYVALUE_LINEParserRuleCall_2_1_0_1_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_10);
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
            	            // InternalDsl.g:431:5: (otherlv_8= ',' (this_WS_9= RULE_WS )* ( (lv_entryLines_10_0= ruleENTRYVALUE_LINE ) ) )
            	            {
            	            // InternalDsl.g:431:5: (otherlv_8= ',' (this_WS_9= RULE_WS )* ( (lv_entryLines_10_0= ruleENTRYVALUE_LINE ) ) )
            	            // InternalDsl.g:432:6: otherlv_8= ',' (this_WS_9= RULE_WS )* ( (lv_entryLines_10_0= ruleENTRYVALUE_LINE ) )
            	            {
            	            otherlv_8=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_8, grammarAccess.getEntryValueAccess().getCommaKeyword_2_1_1_0());
            	              					
            	            }
            	            // InternalDsl.g:436:6: (this_WS_9= RULE_WS )*
            	            loop21:
            	            do {
            	                int alt21=2;
            	                int LA21_0 = input.LA(1);

            	                if ( (LA21_0==RULE_WS) ) {
            	                    alt21=1;
            	                }


            	                switch (alt21) {
            	            	case 1 :
            	            	    // InternalDsl.g:437:7: this_WS_9= RULE_WS
            	            	    {
            	            	    this_WS_9=(Token)match(input,RULE_WS,FOLLOW_9); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      							newLeafNode(this_WS_9, grammarAccess.getEntryValueAccess().getWSTerminalRuleCall_2_1_1_1());
            	            	      						
            	            	    }

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop21;
            	                }
            	            } while (true);

            	            // InternalDsl.g:442:6: ( (lv_entryLines_10_0= ruleENTRYVALUE_LINE ) )
            	            // InternalDsl.g:443:7: (lv_entryLines_10_0= ruleENTRYVALUE_LINE )
            	            {
            	            // InternalDsl.g:443:7: (lv_entryLines_10_0= ruleENTRYVALUE_LINE )
            	            // InternalDsl.g:444:8: lv_entryLines_10_0= ruleENTRYVALUE_LINE
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getEntryValueAccess().getEntryLinesENTRYVALUE_LINEParserRuleCall_2_1_1_2_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_10);
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

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalDsl.g:468:1: entryRuleENTRYVALUE_LINE returns [String current=null] : iv_ruleENTRYVALUE_LINE= ruleENTRYVALUE_LINE EOF ;
    public final String entryRuleENTRYVALUE_LINE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleENTRYVALUE_LINE = null;


        try {
            // InternalDsl.g:468:55: (iv_ruleENTRYVALUE_LINE= ruleENTRYVALUE_LINE EOF )
            // InternalDsl.g:469:2: iv_ruleENTRYVALUE_LINE= ruleENTRYVALUE_LINE EOF
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
    // InternalDsl.g:475:1: ruleENTRYVALUE_LINE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_SPECIAL_CHAR_0= RULE_SPECIAL_CHAR )+ ( ( (this_WS_1= RULE_WS )+ (this_SPECIAL_CHAR_2= RULE_SPECIAL_CHAR )+ ) | (this_WS_3= RULE_WS )* ) )? (this_ENTRYKEY_4= RULE_ENTRYKEY | this_STRING_5= RULE_STRING ) ( (this_WS_6= RULE_WS | this_SPECIAL_CHAR_7= RULE_SPECIAL_CHAR )* (this_ENTRYKEY_8= RULE_ENTRYKEY | this_STRING_9= RULE_STRING ) )* ( (this_WS_10= RULE_WS )* (this_SPECIAL_CHAR_11= RULE_SPECIAL_CHAR )+ ( (this_WS_12= RULE_WS )+ (this_SPECIAL_CHAR_13= RULE_SPECIAL_CHAR )+ )* )? ) ;
    public final AntlrDatatypeRuleToken ruleENTRYVALUE_LINE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SPECIAL_CHAR_0=null;
        Token this_WS_1=null;
        Token this_SPECIAL_CHAR_2=null;
        Token this_WS_3=null;
        Token this_ENTRYKEY_4=null;
        Token this_STRING_5=null;
        Token this_WS_6=null;
        Token this_SPECIAL_CHAR_7=null;
        Token this_ENTRYKEY_8=null;
        Token this_STRING_9=null;
        Token this_WS_10=null;
        Token this_SPECIAL_CHAR_11=null;
        Token this_WS_12=null;
        Token this_SPECIAL_CHAR_13=null;


        	enterRule();

        try {
            // InternalDsl.g:481:2: ( ( ( (this_SPECIAL_CHAR_0= RULE_SPECIAL_CHAR )+ ( ( (this_WS_1= RULE_WS )+ (this_SPECIAL_CHAR_2= RULE_SPECIAL_CHAR )+ ) | (this_WS_3= RULE_WS )* ) )? (this_ENTRYKEY_4= RULE_ENTRYKEY | this_STRING_5= RULE_STRING ) ( (this_WS_6= RULE_WS | this_SPECIAL_CHAR_7= RULE_SPECIAL_CHAR )* (this_ENTRYKEY_8= RULE_ENTRYKEY | this_STRING_9= RULE_STRING ) )* ( (this_WS_10= RULE_WS )* (this_SPECIAL_CHAR_11= RULE_SPECIAL_CHAR )+ ( (this_WS_12= RULE_WS )+ (this_SPECIAL_CHAR_13= RULE_SPECIAL_CHAR )+ )* )? ) )
            // InternalDsl.g:482:2: ( ( (this_SPECIAL_CHAR_0= RULE_SPECIAL_CHAR )+ ( ( (this_WS_1= RULE_WS )+ (this_SPECIAL_CHAR_2= RULE_SPECIAL_CHAR )+ ) | (this_WS_3= RULE_WS )* ) )? (this_ENTRYKEY_4= RULE_ENTRYKEY | this_STRING_5= RULE_STRING ) ( (this_WS_6= RULE_WS | this_SPECIAL_CHAR_7= RULE_SPECIAL_CHAR )* (this_ENTRYKEY_8= RULE_ENTRYKEY | this_STRING_9= RULE_STRING ) )* ( (this_WS_10= RULE_WS )* (this_SPECIAL_CHAR_11= RULE_SPECIAL_CHAR )+ ( (this_WS_12= RULE_WS )+ (this_SPECIAL_CHAR_13= RULE_SPECIAL_CHAR )+ )* )? )
            {
            // InternalDsl.g:482:2: ( ( (this_SPECIAL_CHAR_0= RULE_SPECIAL_CHAR )+ ( ( (this_WS_1= RULE_WS )+ (this_SPECIAL_CHAR_2= RULE_SPECIAL_CHAR )+ ) | (this_WS_3= RULE_WS )* ) )? (this_ENTRYKEY_4= RULE_ENTRYKEY | this_STRING_5= RULE_STRING ) ( (this_WS_6= RULE_WS | this_SPECIAL_CHAR_7= RULE_SPECIAL_CHAR )* (this_ENTRYKEY_8= RULE_ENTRYKEY | this_STRING_9= RULE_STRING ) )* ( (this_WS_10= RULE_WS )* (this_SPECIAL_CHAR_11= RULE_SPECIAL_CHAR )+ ( (this_WS_12= RULE_WS )+ (this_SPECIAL_CHAR_13= RULE_SPECIAL_CHAR )+ )* )? )
            // InternalDsl.g:483:3: ( (this_SPECIAL_CHAR_0= RULE_SPECIAL_CHAR )+ ( ( (this_WS_1= RULE_WS )+ (this_SPECIAL_CHAR_2= RULE_SPECIAL_CHAR )+ ) | (this_WS_3= RULE_WS )* ) )? (this_ENTRYKEY_4= RULE_ENTRYKEY | this_STRING_5= RULE_STRING ) ( (this_WS_6= RULE_WS | this_SPECIAL_CHAR_7= RULE_SPECIAL_CHAR )* (this_ENTRYKEY_8= RULE_ENTRYKEY | this_STRING_9= RULE_STRING ) )* ( (this_WS_10= RULE_WS )* (this_SPECIAL_CHAR_11= RULE_SPECIAL_CHAR )+ ( (this_WS_12= RULE_WS )+ (this_SPECIAL_CHAR_13= RULE_SPECIAL_CHAR )+ )* )?
            {
            // InternalDsl.g:483:3: ( (this_SPECIAL_CHAR_0= RULE_SPECIAL_CHAR )+ ( ( (this_WS_1= RULE_WS )+ (this_SPECIAL_CHAR_2= RULE_SPECIAL_CHAR )+ ) | (this_WS_3= RULE_WS )* ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_SPECIAL_CHAR) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDsl.g:484:4: (this_SPECIAL_CHAR_0= RULE_SPECIAL_CHAR )+ ( ( (this_WS_1= RULE_WS )+ (this_SPECIAL_CHAR_2= RULE_SPECIAL_CHAR )+ ) | (this_WS_3= RULE_WS )* )
                    {
                    // InternalDsl.g:484:4: (this_SPECIAL_CHAR_0= RULE_SPECIAL_CHAR )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_SPECIAL_CHAR) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalDsl.g:485:5: this_SPECIAL_CHAR_0= RULE_SPECIAL_CHAR
                    	    {
                    	    this_SPECIAL_CHAR_0=(Token)match(input,RULE_SPECIAL_CHAR,FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_SPECIAL_CHAR_0);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_SPECIAL_CHAR_0, grammarAccess.getENTRYVALUE_LINEAccess().getSPECIAL_CHARTerminalRuleCall_0_0());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);

                    // InternalDsl.g:493:4: ( ( (this_WS_1= RULE_WS )+ (this_SPECIAL_CHAR_2= RULE_SPECIAL_CHAR )+ ) | (this_WS_3= RULE_WS )* )
                    int alt28=2;
                    alt28 = dfa28.predict(input);
                    switch (alt28) {
                        case 1 :
                            // InternalDsl.g:494:5: ( (this_WS_1= RULE_WS )+ (this_SPECIAL_CHAR_2= RULE_SPECIAL_CHAR )+ )
                            {
                            // InternalDsl.g:494:5: ( (this_WS_1= RULE_WS )+ (this_SPECIAL_CHAR_2= RULE_SPECIAL_CHAR )+ )
                            // InternalDsl.g:495:6: (this_WS_1= RULE_WS )+ (this_SPECIAL_CHAR_2= RULE_SPECIAL_CHAR )+
                            {
                            // InternalDsl.g:495:6: (this_WS_1= RULE_WS )+
                            int cnt25=0;
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( (LA25_0==RULE_WS) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // InternalDsl.g:496:7: this_WS_1= RULE_WS
                            	    {
                            	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_14); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							current.merge(this_WS_1);
                            	      						
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(this_WS_1, grammarAccess.getENTRYVALUE_LINEAccess().getWSTerminalRuleCall_0_1_0_0());
                            	      						
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt25 >= 1 ) break loop25;
                            	    if (state.backtracking>0) {state.failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(25, input);
                                        throw eee;
                                }
                                cnt25++;
                            } while (true);

                            // InternalDsl.g:504:6: (this_SPECIAL_CHAR_2= RULE_SPECIAL_CHAR )+
                            int cnt26=0;
                            loop26:
                            do {
                                int alt26=2;
                                int LA26_0 = input.LA(1);

                                if ( (LA26_0==RULE_SPECIAL_CHAR) ) {
                                    alt26=1;
                                }


                                switch (alt26) {
                            	case 1 :
                            	    // InternalDsl.g:505:7: this_SPECIAL_CHAR_2= RULE_SPECIAL_CHAR
                            	    {
                            	    this_SPECIAL_CHAR_2=(Token)match(input,RULE_SPECIAL_CHAR,FOLLOW_15); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							current.merge(this_SPECIAL_CHAR_2);
                            	      						
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(this_SPECIAL_CHAR_2, grammarAccess.getENTRYVALUE_LINEAccess().getSPECIAL_CHARTerminalRuleCall_0_1_0_1());
                            	      						
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt26 >= 1 ) break loop26;
                            	    if (state.backtracking>0) {state.failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(26, input);
                                        throw eee;
                                }
                                cnt26++;
                            } while (true);


                            }


                            }
                            break;
                        case 2 :
                            // InternalDsl.g:515:5: (this_WS_3= RULE_WS )*
                            {
                            // InternalDsl.g:515:5: (this_WS_3= RULE_WS )*
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( (LA27_0==RULE_WS) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // InternalDsl.g:516:6: this_WS_3= RULE_WS
                            	    {
                            	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_6); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						current.merge(this_WS_3);
                            	      					
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(this_WS_3, grammarAccess.getENTRYVALUE_LINEAccess().getWSTerminalRuleCall_0_1_1());
                            	      					
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop27;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalDsl.g:526:3: (this_ENTRYKEY_4= RULE_ENTRYKEY | this_STRING_5= RULE_STRING )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ENTRYKEY) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_STRING) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalDsl.g:527:4: this_ENTRYKEY_4= RULE_ENTRYKEY
                    {
                    this_ENTRYKEY_4=(Token)match(input,RULE_ENTRYKEY,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ENTRYKEY_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ENTRYKEY_4, grammarAccess.getENTRYVALUE_LINEAccess().getENTRYKEYTerminalRuleCall_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDsl.g:535:4: this_STRING_5= RULE_STRING
                    {
                    this_STRING_5=(Token)match(input,RULE_STRING,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_STRING_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_STRING_5, grammarAccess.getENTRYVALUE_LINEAccess().getSTRINGTerminalRuleCall_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalDsl.g:543:3: ( (this_WS_6= RULE_WS | this_SPECIAL_CHAR_7= RULE_SPECIAL_CHAR )* (this_ENTRYKEY_8= RULE_ENTRYKEY | this_STRING_9= RULE_STRING ) )*
            loop33:
            do {
                int alt33=2;
                alt33 = dfa33.predict(input);
                switch (alt33) {
            	case 1 :
            	    // InternalDsl.g:544:4: (this_WS_6= RULE_WS | this_SPECIAL_CHAR_7= RULE_SPECIAL_CHAR )* (this_ENTRYKEY_8= RULE_ENTRYKEY | this_STRING_9= RULE_STRING )
            	    {
            	    // InternalDsl.g:544:4: (this_WS_6= RULE_WS | this_SPECIAL_CHAR_7= RULE_SPECIAL_CHAR )*
            	    loop31:
            	    do {
            	        int alt31=3;
            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==RULE_WS) ) {
            	            alt31=1;
            	        }
            	        else if ( (LA31_0==RULE_SPECIAL_CHAR) ) {
            	            alt31=2;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // InternalDsl.g:545:5: this_WS_6= RULE_WS
            	    	    {
            	    	    this_WS_6=(Token)match(input,RULE_WS,FOLLOW_9); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					current.merge(this_WS_6);
            	    	      				
            	    	    }
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(this_WS_6, grammarAccess.getENTRYVALUE_LINEAccess().getWSTerminalRuleCall_2_0_0());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalDsl.g:553:5: this_SPECIAL_CHAR_7= RULE_SPECIAL_CHAR
            	    	    {
            	    	    this_SPECIAL_CHAR_7=(Token)match(input,RULE_SPECIAL_CHAR,FOLLOW_9); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					current.merge(this_SPECIAL_CHAR_7);
            	    	      				
            	    	    }
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(this_SPECIAL_CHAR_7, grammarAccess.getENTRYVALUE_LINEAccess().getSPECIAL_CHARTerminalRuleCall_2_0_1());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop31;
            	        }
            	    } while (true);

            	    // InternalDsl.g:561:4: (this_ENTRYKEY_8= RULE_ENTRYKEY | this_STRING_9= RULE_STRING )
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==RULE_ENTRYKEY) ) {
            	        alt32=1;
            	    }
            	    else if ( (LA32_0==RULE_STRING) ) {
            	        alt32=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 32, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // InternalDsl.g:562:5: this_ENTRYKEY_8= RULE_ENTRYKEY
            	            {
            	            this_ENTRYKEY_8=(Token)match(input,RULE_ENTRYKEY,FOLLOW_16); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_ENTRYKEY_8);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_ENTRYKEY_8, grammarAccess.getENTRYVALUE_LINEAccess().getENTRYKEYTerminalRuleCall_2_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalDsl.g:570:5: this_STRING_9= RULE_STRING
            	            {
            	            this_STRING_9=(Token)match(input,RULE_STRING,FOLLOW_16); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_STRING_9);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_STRING_9, grammarAccess.getENTRYVALUE_LINEAccess().getSTRINGTerminalRuleCall_2_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // InternalDsl.g:579:3: ( (this_WS_10= RULE_WS )* (this_SPECIAL_CHAR_11= RULE_SPECIAL_CHAR )+ ( (this_WS_12= RULE_WS )+ (this_SPECIAL_CHAR_13= RULE_SPECIAL_CHAR )+ )* )?
            int alt39=2;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // InternalDsl.g:580:4: (this_WS_10= RULE_WS )* (this_SPECIAL_CHAR_11= RULE_SPECIAL_CHAR )+ ( (this_WS_12= RULE_WS )+ (this_SPECIAL_CHAR_13= RULE_SPECIAL_CHAR )+ )*
                    {
                    // InternalDsl.g:580:4: (this_WS_10= RULE_WS )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==RULE_WS) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalDsl.g:581:5: this_WS_10= RULE_WS
                    	    {
                    	    this_WS_10=(Token)match(input,RULE_WS,FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_WS_10);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_WS_10, grammarAccess.getENTRYVALUE_LINEAccess().getWSTerminalRuleCall_3_0());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    // InternalDsl.g:589:4: (this_SPECIAL_CHAR_11= RULE_SPECIAL_CHAR )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==RULE_SPECIAL_CHAR) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalDsl.g:590:5: this_SPECIAL_CHAR_11= RULE_SPECIAL_CHAR
                    	    {
                    	    this_SPECIAL_CHAR_11=(Token)match(input,RULE_SPECIAL_CHAR,FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_SPECIAL_CHAR_11);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_SPECIAL_CHAR_11, grammarAccess.getENTRYVALUE_LINEAccess().getSPECIAL_CHARTerminalRuleCall_3_1());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt35 >= 1 ) break loop35;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);

                    // InternalDsl.g:598:4: ( (this_WS_12= RULE_WS )+ (this_SPECIAL_CHAR_13= RULE_SPECIAL_CHAR )+ )*
                    loop38:
                    do {
                        int alt38=2;
                        alt38 = dfa38.predict(input);
                        switch (alt38) {
                    	case 1 :
                    	    // InternalDsl.g:599:5: (this_WS_12= RULE_WS )+ (this_SPECIAL_CHAR_13= RULE_SPECIAL_CHAR )+
                    	    {
                    	    // InternalDsl.g:599:5: (this_WS_12= RULE_WS )+
                    	    int cnt36=0;
                    	    loop36:
                    	    do {
                    	        int alt36=2;
                    	        int LA36_0 = input.LA(1);

                    	        if ( (LA36_0==RULE_WS) ) {
                    	            alt36=1;
                    	        }


                    	        switch (alt36) {
                    	    	case 1 :
                    	    	    // InternalDsl.g:600:6: this_WS_12= RULE_WS
                    	    	    {
                    	    	    this_WS_12=(Token)match(input,RULE_WS,FOLLOW_14); if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	      						current.merge(this_WS_12);
                    	    	      					
                    	    	    }
                    	    	    if ( state.backtracking==0 ) {

                    	    	      						newLeafNode(this_WS_12, grammarAccess.getENTRYVALUE_LINEAccess().getWSTerminalRuleCall_3_2_0());
                    	    	      					
                    	    	    }

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt36 >= 1 ) break loop36;
                    	    	    if (state.backtracking>0) {state.failed=true; return current;}
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(36, input);
                    	                throw eee;
                    	        }
                    	        cnt36++;
                    	    } while (true);

                    	    // InternalDsl.g:608:5: (this_SPECIAL_CHAR_13= RULE_SPECIAL_CHAR )+
                    	    int cnt37=0;
                    	    loop37:
                    	    do {
                    	        int alt37=2;
                    	        int LA37_0 = input.LA(1);

                    	        if ( (LA37_0==RULE_SPECIAL_CHAR) ) {
                    	            alt37=1;
                    	        }


                    	        switch (alt37) {
                    	    	case 1 :
                    	    	    // InternalDsl.g:609:6: this_SPECIAL_CHAR_13= RULE_SPECIAL_CHAR
                    	    	    {
                    	    	    this_SPECIAL_CHAR_13=(Token)match(input,RULE_SPECIAL_CHAR,FOLLOW_17); if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	      						current.merge(this_SPECIAL_CHAR_13);
                    	    	      					
                    	    	    }
                    	    	    if ( state.backtracking==0 ) {

                    	    	      						newLeafNode(this_SPECIAL_CHAR_13, grammarAccess.getENTRYVALUE_LINEAccess().getSPECIAL_CHARTerminalRuleCall_3_2_1());
                    	    	      					
                    	    	    }

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt37 >= 1 ) break loop37;
                    	    	    if (state.backtracking>0) {state.failed=true; return current;}
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(37, input);
                    	                throw eee;
                    	        }
                    	        cnt37++;
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "ruleENTRYVALUE_LINE"


    // $ANTLR start "entryRuleEMPTY_LINE"
    // InternalDsl.g:623:1: entryRuleEMPTY_LINE returns [String current=null] : iv_ruleEMPTY_LINE= ruleEMPTY_LINE EOF ;
    public final String entryRuleEMPTY_LINE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEMPTY_LINE = null;


        try {
            // InternalDsl.g:623:50: (iv_ruleEMPTY_LINE= ruleEMPTY_LINE EOF )
            // InternalDsl.g:624:2: iv_ruleEMPTY_LINE= ruleEMPTY_LINE EOF
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
    // InternalDsl.g:630:1: ruleEMPTY_LINE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_LINE_START_0= RULE_LINE_START ;
    public final AntlrDatatypeRuleToken ruleEMPTY_LINE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_LINE_START_0=null;


        	enterRule();

        try {
            // InternalDsl.g:636:2: (this_LINE_START_0= RULE_LINE_START )
            // InternalDsl.g:637:2: this_LINE_START_0= RULE_LINE_START
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
        // InternalDsl.g:101:6: ( ruleEMPTY_LINE )
        // InternalDsl.g:101:7: ruleEMPTY_LINE
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
        // InternalDsl.g:219:6: ( ruleEMPTY_LINE )
        // InternalDsl.g:219:7: ruleEMPTY_LINE
        {
        pushFollow(FOLLOW_2);
        ruleEMPTY_LINE();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalDsl

    // $ANTLR start synpred3_InternalDsl
    public final void synpred3_InternalDsl_fragment() throws RecognitionException {   
        // InternalDsl.g:380:7: ( ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START ) )
        // InternalDsl.g:380:8: ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START )
        {
        // InternalDsl.g:380:8: ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START )
        // InternalDsl.g:381:8: ',' ( RULE_WS )* '\\\\' RULE_LINE_START
        {
        match(input,15,FOLLOW_12); if (state.failed) return ;
        // InternalDsl.g:382:8: ( RULE_WS )*
        loop40:
        do {
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_WS) ) {
                alt40=1;
            }


            switch (alt40) {
        	case 1 :
        	    // InternalDsl.g:383:9: RULE_WS
        	    {
        	    match(input,RULE_WS,FOLLOW_12); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop40;
            }
        } while (true);

        match(input,16,FOLLOW_13); if (state.failed) return ;
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


    protected DFA23 dfa23 = new DFA23(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA38 dfa38 = new DFA38(this);
    static final String dfa_1s = "\4\uffff";
    static final String dfa_2s = "\1\1\3\uffff";
    static final String dfa_3s = "\1\4\1\uffff\1\5\1\uffff";
    static final String dfa_4s = "\1\17\1\uffff\1\17\1\uffff";
    static final String dfa_5s = "\1\uffff\1\2\1\uffff\1\1";
    static final String dfa_6s = "\4\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\uffff\1\1\1\uffff\1\1\2\uffff\2\1\1\uffff\1\3",
            "",
            "\1\2\1\uffff\1\1\7\uffff\1\3",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 370:3: ( (this_WS_2= RULE_WS )* ( ( ( ( ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START ) )=> (otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START ) ) ( (lv_entryLines_7_0= ruleENTRYVALUE_LINE ) ) ) | (otherlv_8= ',' (this_WS_9= RULE_WS )* ( (lv_entryLines_10_0= ruleENTRYVALUE_LINE ) ) ) ) )*";
        }
    }
    static final String dfa_8s = "\5\uffff";
    static final String dfa_9s = "\1\17\2\5\2\uffff";
    static final String dfa_10s = "\1\17\2\20\2\uffff";
    static final String dfa_11s = "\3\uffff\1\1\1\2";
    static final String dfa_12s = "\1\uffff\1\0\1\1\2\uffff}>";
    static final String[] dfa_13s = {
            "\1\1",
            "\1\2\1\uffff\2\4\1\uffff\1\4\5\uffff\1\3",
            "\1\2\1\uffff\2\4\1\uffff\1\4\5\uffff\1\3",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "377:4: ( ( ( ( ( ',' ( RULE_WS )* '\\\\' RULE_LINE_START ) )=> (otherlv_3= ',' (this_WS_4= RULE_WS )* otherlv_5= '\\\\' this_LINE_START_6= RULE_LINE_START ) ) ( (lv_entryLines_7_0= ruleENTRYVALUE_LINE ) ) ) | (otherlv_8= ',' (this_WS_9= RULE_WS )* ( (lv_entryLines_10_0= ruleENTRYVALUE_LINE ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_1 = input.LA(1);

                         
                        int index22_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA22_1==RULE_WS) ) {s = 2;}

                        else if ( (LA22_1==16) && (synpred3_InternalDsl())) {s = 3;}

                        else if ( ((LA22_1>=RULE_ENTRYKEY && LA22_1<=RULE_STRING)||LA22_1==RULE_SPECIAL_CHAR) ) {s = 4;}

                         
                        input.seek(index22_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_2 = input.LA(1);

                         
                        int index22_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA22_2==16) && (synpred3_InternalDsl())) {s = 3;}

                        else if ( (LA22_2==RULE_WS) ) {s = 2;}

                        else if ( ((LA22_2>=RULE_ENTRYKEY && LA22_2<=RULE_STRING)||LA22_2==RULE_SPECIAL_CHAR) ) {s = 4;}

                         
                        input.seek(index22_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\2\5\2\uffff";
    static final String dfa_15s = "\1\10\1\12\2\uffff";
    static final String dfa_16s = "\2\uffff\1\2\1\1";
    static final String[] dfa_17s = {
            "\1\1\1\uffff\2\2",
            "\1\1\1\uffff\2\2\1\uffff\1\3",
            "",
            ""
    };
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[][] dfa_17 = unpackEncodedStringArray(dfa_17s);

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_6;
            this.transition = dfa_17;
        }
        public String getDescription() {
            return "493:4: ( ( (this_WS_1= RULE_WS )+ (this_SPECIAL_CHAR_2= RULE_SPECIAL_CHAR )+ ) | (this_WS_3= RULE_WS )* )";
        }
    }
    static final String dfa_18s = "\11\uffff";
    static final String dfa_19s = "\1\3\1\uffff\1\3\1\uffff\1\5\3\uffff\1\3";
    static final String dfa_20s = "\1\4\1\5\1\4\1\uffff\1\4\1\uffff\2\5\1\4";
    static final String dfa_21s = "\3\17\1\uffff\1\17\1\uffff\3\17";
    static final String dfa_22s = "\3\uffff\1\2\1\uffff\1\1\3\uffff";
    static final String dfa_23s = "\11\uffff}>";
    static final String[] dfa_24s = {
            "\1\3\1\1\1\uffff\1\4\1\5\1\3\1\2\1\uffff\2\3\1\uffff\1\3",
            "\1\1\1\uffff\1\4\1\5\1\uffff\1\2\4\uffff\1\3",
            "\1\3\1\6\1\uffff\1\4\1\5\1\3\1\2\1\uffff\2\3\1\uffff\1\3",
            "",
            "\1\5\1\7\1\3\4\5\1\uffff\2\5\1\uffff\1\5",
            "",
            "\1\6\1\uffff\1\4\1\5\1\uffff\1\10\4\uffff\1\3",
            "\1\7\1\3\2\5\1\uffff\1\5\4\uffff\1\5",
            "\1\3\1\6\1\uffff\1\4\1\5\1\3\1\10\1\uffff\2\3\1\uffff\1\3"
    };

    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_18;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "()* loopback of 543:3: ( (this_WS_6= RULE_WS | this_SPECIAL_CHAR_7= RULE_SPECIAL_CHAR )* (this_ENTRYKEY_8= RULE_ENTRYKEY | this_STRING_9= RULE_STRING ) )*";
        }
    }
    static final String dfa_25s = "\1\3\3\uffff";
    static final String dfa_26s = "\1\4\1\5\2\uffff";
    static final String dfa_27s = "\2\17\2\uffff";
    static final String dfa_28s = "\2\uffff\1\1\1\2";
    static final String[] dfa_29s = {
            "\1\3\1\1\1\uffff\1\3\1\uffff\1\3\1\2\1\uffff\2\3\1\uffff\1\3",
            "\1\1\1\uffff\1\3\2\uffff\1\2\4\uffff\1\3",
            "",
            ""
    };
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[][] dfa_29 = unpackEncodedStringArray(dfa_29s);

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = dfa_1;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_28;
            this.special = dfa_6;
            this.transition = dfa_29;
        }
        public String getDescription() {
            return "579:3: ( (this_WS_10= RULE_WS )* (this_SPECIAL_CHAR_11= RULE_SPECIAL_CHAR )+ ( (this_WS_12= RULE_WS )+ (this_SPECIAL_CHAR_13= RULE_SPECIAL_CHAR )+ )* )?";
        }
    }
    static final String dfa_30s = "\1\2\3\uffff";
    static final String[] dfa_31s = {
            "\1\2\1\1\1\uffff\1\2\1\uffff\1\2\2\uffff\2\2\1\uffff\1\2",
            "\1\1\1\uffff\1\2\2\uffff\1\3\4\uffff\1\2",
            "",
            ""
    };
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[][] dfa_31 = unpackEncodedStringArray(dfa_31s);

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = dfa_1;
            this.eof = dfa_30;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_16;
            this.special = dfa_6;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "()* loopback of 598:4: ( (this_WS_12= RULE_WS )+ (this_SPECIAL_CHAR_13= RULE_SPECIAL_CHAR )+ )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000007210L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000001A0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000032B2L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000005A0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008022L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000580L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000005A2L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000422L});

}