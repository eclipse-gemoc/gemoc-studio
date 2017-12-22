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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SPACE", "RULE_SEPARATOR", "RULE_LETTER", "RULE_SL_COMMENT", "'name'", "'\\n'", "'\\\\\\n'"
    };
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int RULE_SEPARATOR=5;
    public static final int RULE_SL_COMMENT=7;
    public static final int RULE_LETTER=6;
    public static final int RULE_SPACE=4;
    public static final int EOF=-1;
    public static final int T__10=10;

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
    // InternalDsl.g:71:1: ruleDsl returns [EObject current=null] : ( (this_SPACE_0= RULE_SPACE )* otherlv_1= 'name' (this_SPACE_2= RULE_SPACE )* this_SEPARATOR_3= RULE_SEPARATOR (this_SPACE_4= RULE_SPACE )* ( (lv_name_5_0= ruleMULTILINE ) ) (this_SPACE_6= RULE_SPACE )* (otherlv_7= '\\n' )? ( (lv_entries_8_0= ruleEntry ) )* ) ;
    public final EObject ruleDsl() throws RecognitionException {
        EObject current = null;

        Token this_SPACE_0=null;
        Token otherlv_1=null;
        Token this_SPACE_2=null;
        Token this_SEPARATOR_3=null;
        Token this_SPACE_4=null;
        Token this_SPACE_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_entries_8_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( ( (this_SPACE_0= RULE_SPACE )* otherlv_1= 'name' (this_SPACE_2= RULE_SPACE )* this_SEPARATOR_3= RULE_SEPARATOR (this_SPACE_4= RULE_SPACE )* ( (lv_name_5_0= ruleMULTILINE ) ) (this_SPACE_6= RULE_SPACE )* (otherlv_7= '\\n' )? ( (lv_entries_8_0= ruleEntry ) )* ) )
            // InternalDsl.g:78:2: ( (this_SPACE_0= RULE_SPACE )* otherlv_1= 'name' (this_SPACE_2= RULE_SPACE )* this_SEPARATOR_3= RULE_SEPARATOR (this_SPACE_4= RULE_SPACE )* ( (lv_name_5_0= ruleMULTILINE ) ) (this_SPACE_6= RULE_SPACE )* (otherlv_7= '\\n' )? ( (lv_entries_8_0= ruleEntry ) )* )
            {
            // InternalDsl.g:78:2: ( (this_SPACE_0= RULE_SPACE )* otherlv_1= 'name' (this_SPACE_2= RULE_SPACE )* this_SEPARATOR_3= RULE_SEPARATOR (this_SPACE_4= RULE_SPACE )* ( (lv_name_5_0= ruleMULTILINE ) ) (this_SPACE_6= RULE_SPACE )* (otherlv_7= '\\n' )? ( (lv_entries_8_0= ruleEntry ) )* )
            // InternalDsl.g:79:3: (this_SPACE_0= RULE_SPACE )* otherlv_1= 'name' (this_SPACE_2= RULE_SPACE )* this_SEPARATOR_3= RULE_SEPARATOR (this_SPACE_4= RULE_SPACE )* ( (lv_name_5_0= ruleMULTILINE ) ) (this_SPACE_6= RULE_SPACE )* (otherlv_7= '\\n' )? ( (lv_entries_8_0= ruleEntry ) )*
            {
            // InternalDsl.g:79:3: (this_SPACE_0= RULE_SPACE )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_SPACE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:80:4: this_SPACE_0= RULE_SPACE
            	    {
            	    this_SPACE_0=(Token)match(input,RULE_SPACE,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_SPACE_0, grammarAccess.getDslAccess().getSPACETerminalRuleCall_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_1=(Token)match(input,8,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDslAccess().getNameKeyword_1());
              		
            }
            // InternalDsl.g:89:3: (this_SPACE_2= RULE_SPACE )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_SPACE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDsl.g:90:4: this_SPACE_2= RULE_SPACE
            	    {
            	    this_SPACE_2=(Token)match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_SPACE_2, grammarAccess.getDslAccess().getSPACETerminalRuleCall_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            this_SEPARATOR_3=(Token)match(input,RULE_SEPARATOR,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_SEPARATOR_3, grammarAccess.getDslAccess().getSEPARATORTerminalRuleCall_3());
              		
            }
            // InternalDsl.g:99:3: (this_SPACE_4= RULE_SPACE )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_SPACE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDsl.g:100:4: this_SPACE_4= RULE_SPACE
            	    {
            	    this_SPACE_4=(Token)match(input,RULE_SPACE,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_SPACE_4, grammarAccess.getDslAccess().getSPACETerminalRuleCall_4());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalDsl.g:105:3: ( (lv_name_5_0= ruleMULTILINE ) )
            // InternalDsl.g:106:4: (lv_name_5_0= ruleMULTILINE )
            {
            // InternalDsl.g:106:4: (lv_name_5_0= ruleMULTILINE )
            // InternalDsl.g:107:5: lv_name_5_0= ruleMULTILINE
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDslAccess().getNameMULTILINEParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_name_5_0=ruleMULTILINE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDslRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_5_0,
              						"org.eclipse.gemoc.Dsl.MULTILINE");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDsl.g:124:3: (this_SPACE_6= RULE_SPACE )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_SPACE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDsl.g:125:4: this_SPACE_6= RULE_SPACE
            	    {
            	    this_SPACE_6=(Token)match(input,RULE_SPACE,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_SPACE_6, grammarAccess.getDslAccess().getSPACETerminalRuleCall_6());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalDsl.g:130:3: (otherlv_7= '\\n' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==9) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:131:4: otherlv_7= '\\n'
                    {
                    otherlv_7=(Token)match(input,9,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDslAccess().getLineFeedKeyword_7());
                      			
                    }

                    }
                    break;

            }

            // InternalDsl.g:136:3: ( (lv_entries_8_0= ruleEntry ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_SPACE||LA6_0==RULE_LETTER) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:137:4: (lv_entries_8_0= ruleEntry )
            	    {
            	    // InternalDsl.g:137:4: (lv_entries_8_0= ruleEntry )
            	    // InternalDsl.g:138:5: lv_entries_8_0= ruleEntry
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDslAccess().getEntriesEntryParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_entries_8_0=ruleEntry();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDslRule());
            	      					}
            	      					add(
            	      						current,
            	      						"entries",
            	      						lv_entries_8_0,
            	      						"org.eclipse.gemoc.Dsl.Entry");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalDsl.g:159:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // InternalDsl.g:159:46: (iv_ruleEntry= ruleEntry EOF )
            // InternalDsl.g:160:2: iv_ruleEntry= ruleEntry EOF
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
    // InternalDsl.g:166:1: ruleEntry returns [EObject current=null] : ( (this_SPACE_0= RULE_SPACE )* ( (lv_key_1_0= ruleWORD ) ) (this_SPACE_2= RULE_SPACE )* this_SEPARATOR_3= RULE_SEPARATOR (this_SPACE_4= RULE_SPACE )* ( (lv_value_5_0= ruleMULTILINE ) ) (this_SPACE_6= RULE_SPACE )* (otherlv_7= '\\n' )? ) ;
    public final EObject ruleEntry() throws RecognitionException {
        EObject current = null;

        Token this_SPACE_0=null;
        Token this_SPACE_2=null;
        Token this_SEPARATOR_3=null;
        Token this_SPACE_4=null;
        Token this_SPACE_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:172:2: ( ( (this_SPACE_0= RULE_SPACE )* ( (lv_key_1_0= ruleWORD ) ) (this_SPACE_2= RULE_SPACE )* this_SEPARATOR_3= RULE_SEPARATOR (this_SPACE_4= RULE_SPACE )* ( (lv_value_5_0= ruleMULTILINE ) ) (this_SPACE_6= RULE_SPACE )* (otherlv_7= '\\n' )? ) )
            // InternalDsl.g:173:2: ( (this_SPACE_0= RULE_SPACE )* ( (lv_key_1_0= ruleWORD ) ) (this_SPACE_2= RULE_SPACE )* this_SEPARATOR_3= RULE_SEPARATOR (this_SPACE_4= RULE_SPACE )* ( (lv_value_5_0= ruleMULTILINE ) ) (this_SPACE_6= RULE_SPACE )* (otherlv_7= '\\n' )? )
            {
            // InternalDsl.g:173:2: ( (this_SPACE_0= RULE_SPACE )* ( (lv_key_1_0= ruleWORD ) ) (this_SPACE_2= RULE_SPACE )* this_SEPARATOR_3= RULE_SEPARATOR (this_SPACE_4= RULE_SPACE )* ( (lv_value_5_0= ruleMULTILINE ) ) (this_SPACE_6= RULE_SPACE )* (otherlv_7= '\\n' )? )
            // InternalDsl.g:174:3: (this_SPACE_0= RULE_SPACE )* ( (lv_key_1_0= ruleWORD ) ) (this_SPACE_2= RULE_SPACE )* this_SEPARATOR_3= RULE_SEPARATOR (this_SPACE_4= RULE_SPACE )* ( (lv_value_5_0= ruleMULTILINE ) ) (this_SPACE_6= RULE_SPACE )* (otherlv_7= '\\n' )?
            {
            // InternalDsl.g:174:3: (this_SPACE_0= RULE_SPACE )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_SPACE) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:175:4: this_SPACE_0= RULE_SPACE
            	    {
            	    this_SPACE_0=(Token)match(input,RULE_SPACE,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_SPACE_0, grammarAccess.getEntryAccess().getSPACETerminalRuleCall_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalDsl.g:180:3: ( (lv_key_1_0= ruleWORD ) )
            // InternalDsl.g:181:4: (lv_key_1_0= ruleWORD )
            {
            // InternalDsl.g:181:4: (lv_key_1_0= ruleWORD )
            // InternalDsl.g:182:5: lv_key_1_0= ruleWORD
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEntryAccess().getKeyWORDParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_key_1_0=ruleWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEntryRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_1_0,
              						"org.eclipse.gemoc.Dsl.WORD");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDsl.g:199:3: (this_SPACE_2= RULE_SPACE )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_SPACE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:200:4: this_SPACE_2= RULE_SPACE
            	    {
            	    this_SPACE_2=(Token)match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_SPACE_2, grammarAccess.getEntryAccess().getSPACETerminalRuleCall_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            this_SEPARATOR_3=(Token)match(input,RULE_SEPARATOR,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_SEPARATOR_3, grammarAccess.getEntryAccess().getSEPARATORTerminalRuleCall_3());
              		
            }
            // InternalDsl.g:209:3: (this_SPACE_4= RULE_SPACE )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_SPACE) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:210:4: this_SPACE_4= RULE_SPACE
            	    {
            	    this_SPACE_4=(Token)match(input,RULE_SPACE,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_SPACE_4, grammarAccess.getEntryAccess().getSPACETerminalRuleCall_4());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalDsl.g:215:3: ( (lv_value_5_0= ruleMULTILINE ) )
            // InternalDsl.g:216:4: (lv_value_5_0= ruleMULTILINE )
            {
            // InternalDsl.g:216:4: (lv_value_5_0= ruleMULTILINE )
            // InternalDsl.g:217:5: lv_value_5_0= ruleMULTILINE
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEntryAccess().getValueMULTILINEParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_value_5_0=ruleMULTILINE();

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
              						"org.eclipse.gemoc.Dsl.MULTILINE");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDsl.g:234:3: (this_SPACE_6= RULE_SPACE )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_SPACE) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:235:4: this_SPACE_6= RULE_SPACE
            	    {
            	    this_SPACE_6=(Token)match(input,RULE_SPACE,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_SPACE_6, grammarAccess.getEntryAccess().getSPACETerminalRuleCall_6());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalDsl.g:240:3: (otherlv_7= '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==9) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:241:4: otherlv_7= '\\n'
                    {
                    otherlv_7=(Token)match(input,9,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getEntryAccess().getLineFeedKeyword_7());
                      			
                    }

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
    // $ANTLR end "ruleEntry"


    // $ANTLR start "entryRuleWORD"
    // InternalDsl.g:250:1: entryRuleWORD returns [String current=null] : iv_ruleWORD= ruleWORD EOF ;
    public final String entryRuleWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWORD = null;


        try {
            // InternalDsl.g:250:44: (iv_ruleWORD= ruleWORD EOF )
            // InternalDsl.g:251:2: iv_ruleWORD= ruleWORD EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWORDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWORD=ruleWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWORD.getText(); 
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
    // $ANTLR end "entryRuleWORD"


    // $ANTLR start "ruleWORD"
    // InternalDsl.g:257:1: ruleWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LETTER_0= RULE_LETTER ( (this_LETTER_1= RULE_LETTER | this_SPACE_2= RULE_SPACE )* ( ( RULE_LETTER )=>this_LETTER_3= RULE_LETTER ) )? ) ;
    public final AntlrDatatypeRuleToken ruleWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_LETTER_0=null;
        Token this_LETTER_1=null;
        Token this_SPACE_2=null;
        Token this_LETTER_3=null;


        	enterRule();

        try {
            // InternalDsl.g:263:2: ( (this_LETTER_0= RULE_LETTER ( (this_LETTER_1= RULE_LETTER | this_SPACE_2= RULE_SPACE )* ( ( RULE_LETTER )=>this_LETTER_3= RULE_LETTER ) )? ) )
            // InternalDsl.g:264:2: (this_LETTER_0= RULE_LETTER ( (this_LETTER_1= RULE_LETTER | this_SPACE_2= RULE_SPACE )* ( ( RULE_LETTER )=>this_LETTER_3= RULE_LETTER ) )? )
            {
            // InternalDsl.g:264:2: (this_LETTER_0= RULE_LETTER ( (this_LETTER_1= RULE_LETTER | this_SPACE_2= RULE_SPACE )* ( ( RULE_LETTER )=>this_LETTER_3= RULE_LETTER ) )? )
            // InternalDsl.g:265:3: this_LETTER_0= RULE_LETTER ( (this_LETTER_1= RULE_LETTER | this_SPACE_2= RULE_SPACE )* ( ( RULE_LETTER )=>this_LETTER_3= RULE_LETTER ) )?
            {
            this_LETTER_0=(Token)match(input,RULE_LETTER,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_LETTER_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LETTER_0, grammarAccess.getWORDAccess().getLETTERTerminalRuleCall_0());
              		
            }
            // InternalDsl.g:272:3: ( (this_LETTER_1= RULE_LETTER | this_SPACE_2= RULE_SPACE )* ( ( RULE_LETTER )=>this_LETTER_3= RULE_LETTER ) )?
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:273:4: (this_LETTER_1= RULE_LETTER | this_SPACE_2= RULE_SPACE )* ( ( RULE_LETTER )=>this_LETTER_3= RULE_LETTER )
                    {
                    // InternalDsl.g:273:4: (this_LETTER_1= RULE_LETTER | this_SPACE_2= RULE_SPACE )*
                    loop12:
                    do {
                        int alt12=3;
                        alt12 = dfa12.predict(input);
                        switch (alt12) {
                    	case 1 :
                    	    // InternalDsl.g:274:5: this_LETTER_1= RULE_LETTER
                    	    {
                    	    this_LETTER_1=(Token)match(input,RULE_LETTER,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_LETTER_1);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_LETTER_1, grammarAccess.getWORDAccess().getLETTERTerminalRuleCall_1_0_0());
                    	      				
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDsl.g:282:5: this_SPACE_2= RULE_SPACE
                    	    {
                    	    this_SPACE_2=(Token)match(input,RULE_SPACE,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_SPACE_2);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_SPACE_2, grammarAccess.getWORDAccess().getSPACETerminalRuleCall_1_0_1());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // InternalDsl.g:290:4: ( ( RULE_LETTER )=>this_LETTER_3= RULE_LETTER )
                    // InternalDsl.g:291:5: ( RULE_LETTER )=>this_LETTER_3= RULE_LETTER
                    {
                    this_LETTER_3=(Token)match(input,RULE_LETTER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_LETTER_3);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_LETTER_3, grammarAccess.getWORDAccess().getLETTERTerminalRuleCall_1_1());
                      				
                    }

                    }


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
    // $ANTLR end "ruleWORD"


    // $ANTLR start "entryRuleVALUE_WORD"
    // InternalDsl.g:305:1: entryRuleVALUE_WORD returns [String current=null] : iv_ruleVALUE_WORD= ruleVALUE_WORD EOF ;
    public final String entryRuleVALUE_WORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALUE_WORD = null;


        try {
            // InternalDsl.g:305:50: (iv_ruleVALUE_WORD= ruleVALUE_WORD EOF )
            // InternalDsl.g:306:2: iv_ruleVALUE_WORD= ruleVALUE_WORD EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVALUE_WORDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVALUE_WORD=ruleVALUE_WORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVALUE_WORD.getText(); 
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
    // $ANTLR end "entryRuleVALUE_WORD"


    // $ANTLR start "ruleVALUE_WORD"
    // InternalDsl.g:312:1: ruleVALUE_WORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_LETTER_0= RULE_LETTER | this_SEPARATOR_1= RULE_SEPARATOR ) ( ( (this_LETTER_2= RULE_LETTER | this_SEPARATOR_3= RULE_SEPARATOR ) | this_SPACE_4= RULE_SPACE )* ( ( RULE_LETTER | RULE_SEPARATOR )=> (this_LETTER_5= RULE_LETTER | this_SEPARATOR_6= RULE_SEPARATOR ) ) )? ) ;
    public final AntlrDatatypeRuleToken ruleVALUE_WORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_LETTER_0=null;
        Token this_SEPARATOR_1=null;
        Token this_LETTER_2=null;
        Token this_SEPARATOR_3=null;
        Token this_SPACE_4=null;
        Token this_LETTER_5=null;
        Token this_SEPARATOR_6=null;


        	enterRule();

        try {
            // InternalDsl.g:318:2: ( ( (this_LETTER_0= RULE_LETTER | this_SEPARATOR_1= RULE_SEPARATOR ) ( ( (this_LETTER_2= RULE_LETTER | this_SEPARATOR_3= RULE_SEPARATOR ) | this_SPACE_4= RULE_SPACE )* ( ( RULE_LETTER | RULE_SEPARATOR )=> (this_LETTER_5= RULE_LETTER | this_SEPARATOR_6= RULE_SEPARATOR ) ) )? ) )
            // InternalDsl.g:319:2: ( (this_LETTER_0= RULE_LETTER | this_SEPARATOR_1= RULE_SEPARATOR ) ( ( (this_LETTER_2= RULE_LETTER | this_SEPARATOR_3= RULE_SEPARATOR ) | this_SPACE_4= RULE_SPACE )* ( ( RULE_LETTER | RULE_SEPARATOR )=> (this_LETTER_5= RULE_LETTER | this_SEPARATOR_6= RULE_SEPARATOR ) ) )? )
            {
            // InternalDsl.g:319:2: ( (this_LETTER_0= RULE_LETTER | this_SEPARATOR_1= RULE_SEPARATOR ) ( ( (this_LETTER_2= RULE_LETTER | this_SEPARATOR_3= RULE_SEPARATOR ) | this_SPACE_4= RULE_SPACE )* ( ( RULE_LETTER | RULE_SEPARATOR )=> (this_LETTER_5= RULE_LETTER | this_SEPARATOR_6= RULE_SEPARATOR ) ) )? )
            // InternalDsl.g:320:3: (this_LETTER_0= RULE_LETTER | this_SEPARATOR_1= RULE_SEPARATOR ) ( ( (this_LETTER_2= RULE_LETTER | this_SEPARATOR_3= RULE_SEPARATOR ) | this_SPACE_4= RULE_SPACE )* ( ( RULE_LETTER | RULE_SEPARATOR )=> (this_LETTER_5= RULE_LETTER | this_SEPARATOR_6= RULE_SEPARATOR ) ) )?
            {
            // InternalDsl.g:320:3: (this_LETTER_0= RULE_LETTER | this_SEPARATOR_1= RULE_SEPARATOR )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_LETTER) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_SEPARATOR) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:321:4: this_LETTER_0= RULE_LETTER
                    {
                    this_LETTER_0=(Token)match(input,RULE_LETTER,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_LETTER_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_LETTER_0, grammarAccess.getVALUE_WORDAccess().getLETTERTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDsl.g:329:4: this_SEPARATOR_1= RULE_SEPARATOR
                    {
                    this_SEPARATOR_1=(Token)match(input,RULE_SEPARATOR,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_SEPARATOR_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_SEPARATOR_1, grammarAccess.getVALUE_WORDAccess().getSEPARATORTerminalRuleCall_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalDsl.g:337:3: ( ( (this_LETTER_2= RULE_LETTER | this_SEPARATOR_3= RULE_SEPARATOR ) | this_SPACE_4= RULE_SPACE )* ( ( RULE_LETTER | RULE_SEPARATOR )=> (this_LETTER_5= RULE_LETTER | this_SEPARATOR_6= RULE_SEPARATOR ) ) )?
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalDsl.g:338:4: ( (this_LETTER_2= RULE_LETTER | this_SEPARATOR_3= RULE_SEPARATOR ) | this_SPACE_4= RULE_SPACE )* ( ( RULE_LETTER | RULE_SEPARATOR )=> (this_LETTER_5= RULE_LETTER | this_SEPARATOR_6= RULE_SEPARATOR ) )
                    {
                    // InternalDsl.g:338:4: ( (this_LETTER_2= RULE_LETTER | this_SEPARATOR_3= RULE_SEPARATOR ) | this_SPACE_4= RULE_SPACE )*
                    loop16:
                    do {
                        int alt16=3;
                        alt16 = dfa16.predict(input);
                        switch (alt16) {
                    	case 1 :
                    	    // InternalDsl.g:339:5: (this_LETTER_2= RULE_LETTER | this_SEPARATOR_3= RULE_SEPARATOR )
                    	    {
                    	    // InternalDsl.g:339:5: (this_LETTER_2= RULE_LETTER | this_SEPARATOR_3= RULE_SEPARATOR )
                    	    int alt15=2;
                    	    int LA15_0 = input.LA(1);

                    	    if ( (LA15_0==RULE_LETTER) ) {
                    	        alt15=1;
                    	    }
                    	    else if ( (LA15_0==RULE_SEPARATOR) ) {
                    	        alt15=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 15, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt15) {
                    	        case 1 :
                    	            // InternalDsl.g:340:6: this_LETTER_2= RULE_LETTER
                    	            {
                    	            this_LETTER_2=(Token)match(input,RULE_LETTER,FOLLOW_5); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						current.merge(this_LETTER_2);
                    	              					
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(this_LETTER_2, grammarAccess.getVALUE_WORDAccess().getLETTERTerminalRuleCall_1_0_0_0());
                    	              					
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalDsl.g:348:6: this_SEPARATOR_3= RULE_SEPARATOR
                    	            {
                    	            this_SEPARATOR_3=(Token)match(input,RULE_SEPARATOR,FOLLOW_5); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						current.merge(this_SEPARATOR_3);
                    	              					
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(this_SEPARATOR_3, grammarAccess.getVALUE_WORDAccess().getSEPARATORTerminalRuleCall_1_0_0_1());
                    	              					
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDsl.g:357:5: this_SPACE_4= RULE_SPACE
                    	    {
                    	    this_SPACE_4=(Token)match(input,RULE_SPACE,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_SPACE_4);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_SPACE_4, grammarAccess.getVALUE_WORDAccess().getSPACETerminalRuleCall_1_0_1());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    // InternalDsl.g:365:4: ( ( RULE_LETTER | RULE_SEPARATOR )=> (this_LETTER_5= RULE_LETTER | this_SEPARATOR_6= RULE_SEPARATOR ) )
                    // InternalDsl.g:366:5: ( RULE_LETTER | RULE_SEPARATOR )=> (this_LETTER_5= RULE_LETTER | this_SEPARATOR_6= RULE_SEPARATOR )
                    {
                    // InternalDsl.g:367:5: (this_LETTER_5= RULE_LETTER | this_SEPARATOR_6= RULE_SEPARATOR )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_LETTER) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==RULE_SEPARATOR) ) {
                        alt17=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalDsl.g:368:6: this_LETTER_5= RULE_LETTER
                            {
                            this_LETTER_5=(Token)match(input,RULE_LETTER,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_LETTER_5);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						newLeafNode(this_LETTER_5, grammarAccess.getVALUE_WORDAccess().getLETTERTerminalRuleCall_1_1_0_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalDsl.g:376:6: this_SEPARATOR_6= RULE_SEPARATOR
                            {
                            this_SEPARATOR_6=(Token)match(input,RULE_SEPARATOR,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_SEPARATOR_6);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						newLeafNode(this_SEPARATOR_6, grammarAccess.getVALUE_WORDAccess().getSEPARATORTerminalRuleCall_1_1_0_1());
                              					
                            }

                            }
                            break;

                    }


                    }


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
    // $ANTLR end "ruleVALUE_WORD"


    // $ANTLR start "entryRuleMULTILINE"
    // InternalDsl.g:390:1: entryRuleMULTILINE returns [String current=null] : iv_ruleMULTILINE= ruleMULTILINE EOF ;
    public final String entryRuleMULTILINE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULTILINE = null;


        try {
            // InternalDsl.g:390:49: (iv_ruleMULTILINE= ruleMULTILINE EOF )
            // InternalDsl.g:391:2: iv_ruleMULTILINE= ruleMULTILINE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMULTILINERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMULTILINE=ruleMULTILINE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMULTILINE.getText(); 
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
    // $ANTLR end "entryRuleMULTILINE"


    // $ANTLR start "ruleMULTILINE"
    // InternalDsl.g:397:1: ruleMULTILINE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VALUE_WORD_0= ruleVALUE_WORD (kw= '\\\\\\n' (this_SPACE_2= RULE_SPACE )* this_VALUE_WORD_3= ruleVALUE_WORD )* ) ;
    public final AntlrDatatypeRuleToken ruleMULTILINE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_SPACE_2=null;
        AntlrDatatypeRuleToken this_VALUE_WORD_0 = null;

        AntlrDatatypeRuleToken this_VALUE_WORD_3 = null;



        	enterRule();

        try {
            // InternalDsl.g:403:2: ( (this_VALUE_WORD_0= ruleVALUE_WORD (kw= '\\\\\\n' (this_SPACE_2= RULE_SPACE )* this_VALUE_WORD_3= ruleVALUE_WORD )* ) )
            // InternalDsl.g:404:2: (this_VALUE_WORD_0= ruleVALUE_WORD (kw= '\\\\\\n' (this_SPACE_2= RULE_SPACE )* this_VALUE_WORD_3= ruleVALUE_WORD )* )
            {
            // InternalDsl.g:404:2: (this_VALUE_WORD_0= ruleVALUE_WORD (kw= '\\\\\\n' (this_SPACE_2= RULE_SPACE )* this_VALUE_WORD_3= ruleVALUE_WORD )* )
            // InternalDsl.g:405:3: this_VALUE_WORD_0= ruleVALUE_WORD (kw= '\\\\\\n' (this_SPACE_2= RULE_SPACE )* this_VALUE_WORD_3= ruleVALUE_WORD )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMULTILINEAccess().getVALUE_WORDParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_11);
            this_VALUE_WORD_0=ruleVALUE_WORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_VALUE_WORD_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDsl.g:415:3: (kw= '\\\\\\n' (this_SPACE_2= RULE_SPACE )* this_VALUE_WORD_3= ruleVALUE_WORD )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==10) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDsl.g:416:4: kw= '\\\\\\n' (this_SPACE_2= RULE_SPACE )* this_VALUE_WORD_3= ruleVALUE_WORD
            	    {
            	    kw=(Token)match(input,10,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getMULTILINEAccess().getReverseSolidusControl000aKeyword_1_0());
            	      			
            	    }
            	    // InternalDsl.g:421:4: (this_SPACE_2= RULE_SPACE )*
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0==RULE_SPACE) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // InternalDsl.g:422:5: this_SPACE_2= RULE_SPACE
            	    	    {
            	    	    this_SPACE_2=(Token)match(input,RULE_SPACE,FOLLOW_5); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					current.merge(this_SPACE_2);
            	    	      				
            	    	    }
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(this_SPACE_2, grammarAccess.getMULTILINEAccess().getSPACETerminalRuleCall_1_1());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop19;
            	        }
            	    } while (true);

            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getMULTILINEAccess().getVALUE_WORDParserRuleCall_1_2());
            	      			
            	    }
            	    pushFollow(FOLLOW_11);
            	    this_VALUE_WORD_3=ruleVALUE_WORD();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_VALUE_WORD_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end "ruleMULTILINE"

    // Delegated rules


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\4\uffff";
    static final String dfa_2s = "\1\3\3\uffff";
    static final String dfa_3s = "\1\4\1\uffff\1\4\1\uffff";
    static final String dfa_4s = "\1\6\1\uffff\1\6\1\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\uffff\1\2";
    static final String dfa_6s = "\4\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\3\1\1",
            "",
            "\1\2\1\3\1\1",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "272:3: ( (this_LETTER_1= RULE_LETTER | this_SPACE_2= RULE_SPACE )* ( ( RULE_LETTER )=>this_LETTER_3= RULE_LETTER ) )?";
        }
    }
    static final String dfa_8s = "\6\uffff";
    static final String dfa_9s = "\1\uffff\1\4\4\uffff";
    static final String dfa_10s = "\2\4\1\uffff\1\4\2\uffff";
    static final String dfa_11s = "\2\6\1\uffff\1\6\2\uffff";
    static final String dfa_12s = "\2\uffff\1\2\1\uffff\1\3\1\1";
    static final String dfa_13s = "\6\uffff}>";
    static final String[] dfa_14s = {
            "\1\2\1\uffff\1\1",
            "\1\3\1\4\1\5",
            "",
            "\1\3\1\4\1\5",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 273:4: (this_LETTER_1= RULE_LETTER | this_SPACE_2= RULE_SPACE )*";
        }
    }
    static final String dfa_15s = "\13\uffff";
    static final String dfa_16s = "\1\4\1\2\1\uffff\1\4\1\uffff\1\6\1\uffff\2\12\2\uffff";
    static final String dfa_17s = "\2\4\1\uffff\1\4\1\uffff\1\4\1\uffff\2\4\2\uffff";
    static final String dfa_18s = "\2\12\1\uffff\1\11\1\uffff\1\11\1\uffff\1\12\1\11\2\uffff";
    static final String dfa_19s = "\2\uffff\1\1\1\uffff\1\2\1\uffff\1\1\2\uffff\2\1";
    static final String dfa_20s = "\13\uffff}>";
    static final String[] dfa_21s = {
            "\1\3\1\2\1\1\2\uffff\2\4",
            "\1\5\1\7\1\6\2\uffff\2\2",
            "",
            "\1\3\1\2\1\1\2\uffff\1\4",
            "",
            "\1\5\1\7\1\6\2\uffff\1\6",
            "",
            "\1\10\1\12\1\11\2\uffff\2\12",
            "\1\10\1\12\1\11\2\uffff\1\12",
            "",
            ""
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "337:3: ( ( (this_LETTER_2= RULE_LETTER | this_SEPARATOR_3= RULE_SEPARATOR ) | this_SPACE_4= RULE_SPACE )* ( ( RULE_LETTER | RULE_SEPARATOR )=> (this_LETTER_5= RULE_LETTER | this_SEPARATOR_6= RULE_SEPARATOR ) ) )?";
        }
    }
    static final String dfa_22s = "\16\uffff";
    static final String dfa_23s = "\1\uffff\2\4\2\uffff\1\4\1\7\1\uffff\1\11\1\uffff\2\15\2\uffff";
    static final String dfa_24s = "\3\4\2\uffff\2\4\1\uffff\1\4\1\uffff\2\4\2\uffff";
    static final String dfa_25s = "\1\6\2\12\2\uffff\1\11\1\12\1\uffff\1\11\1\uffff\1\12\1\11\2\uffff";
    static final String dfa_26s = "\3\uffff\1\2\1\3\2\uffff\1\1\1\uffff\1\1\2\uffff\2\1";
    static final String dfa_27s = "\16\uffff}>";
    static final String[] dfa_28s = {
            "\1\3\1\2\1\1",
            "\1\5\1\7\1\6\2\uffff\2\4",
            "\1\5\1\7\1\6\2\uffff\2\4",
            "",
            "",
            "\1\5\1\7\1\6\2\uffff\1\4",
            "\1\10\1\12\1\11\2\uffff\2\7",
            "",
            "\1\10\1\12\1\11\2\uffff\1\11",
            "",
            "\1\13\1\15\1\14\2\uffff\2\15",
            "\1\13\1\15\1\14\2\uffff\1\15",
            "",
            ""
    };

    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[][] dfa_28 = unpackEncodedStringArray(dfa_28s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_22;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "()* loopback of 338:4: ( (this_LETTER_2= RULE_LETTER | this_SEPARATOR_3= RULE_SEPARATOR ) | this_SPACE_4= RULE_SPACE )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000252L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000212L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000402L});

}