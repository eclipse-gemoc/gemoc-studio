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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SPACE", "RULE_SEPARATOR", "RULE_LETTER", "RULE_SL_COMMENT", "'\\n'", "'\\\\\\n'"
    };
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int RULE_SEPARATOR=5;
    public static final int RULE_SL_COMMENT=7;
    public static final int RULE_LETTER=6;
    public static final int RULE_SPACE=4;
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
    // InternalDsl.g:71:1: ruleDsl returns [EObject current=null] : ( (lv_entries_0_0= ruleEntry ) )* ;
    public final EObject ruleDsl() throws RecognitionException {
        EObject current = null;

        EObject lv_entries_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( ( (lv_entries_0_0= ruleEntry ) )* )
            // InternalDsl.g:78:2: ( (lv_entries_0_0= ruleEntry ) )*
            {
            // InternalDsl.g:78:2: ( (lv_entries_0_0= ruleEntry ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_SPACE||LA1_0==RULE_LETTER) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:79:3: (lv_entries_0_0= ruleEntry )
            	    {
            	    // InternalDsl.g:79:3: (lv_entries_0_0= ruleEntry )
            	    // InternalDsl.g:80:4: lv_entries_0_0= ruleEntry
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getDslAccess().getEntriesEntryParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_entries_0_0=ruleEntry();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getDslRule());
            	      				}
            	      				add(
            	      					current,
            	      					"entries",
            	      					lv_entries_0_0,
            	      					"org.eclipse.gemoc.Dsl.Entry");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // InternalDsl.g:100:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // InternalDsl.g:100:46: (iv_ruleEntry= ruleEntry EOF )
            // InternalDsl.g:101:2: iv_ruleEntry= ruleEntry EOF
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
    // InternalDsl.g:107:1: ruleEntry returns [EObject current=null] : ( (this_SPACE_0= RULE_SPACE )* ( (lv_key_1_0= ruleWORD ) ) (this_SPACE_2= RULE_SPACE )* this_SEPARATOR_3= RULE_SEPARATOR (this_SPACE_4= RULE_SPACE )* ( (lv_value_5_0= ruleMULTILINE ) ) (this_SPACE_6= RULE_SPACE )* (otherlv_7= '\\n' )? ) ;
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
            // InternalDsl.g:113:2: ( ( (this_SPACE_0= RULE_SPACE )* ( (lv_key_1_0= ruleWORD ) ) (this_SPACE_2= RULE_SPACE )* this_SEPARATOR_3= RULE_SEPARATOR (this_SPACE_4= RULE_SPACE )* ( (lv_value_5_0= ruleMULTILINE ) ) (this_SPACE_6= RULE_SPACE )* (otherlv_7= '\\n' )? ) )
            // InternalDsl.g:114:2: ( (this_SPACE_0= RULE_SPACE )* ( (lv_key_1_0= ruleWORD ) ) (this_SPACE_2= RULE_SPACE )* this_SEPARATOR_3= RULE_SEPARATOR (this_SPACE_4= RULE_SPACE )* ( (lv_value_5_0= ruleMULTILINE ) ) (this_SPACE_6= RULE_SPACE )* (otherlv_7= '\\n' )? )
            {
            // InternalDsl.g:114:2: ( (this_SPACE_0= RULE_SPACE )* ( (lv_key_1_0= ruleWORD ) ) (this_SPACE_2= RULE_SPACE )* this_SEPARATOR_3= RULE_SEPARATOR (this_SPACE_4= RULE_SPACE )* ( (lv_value_5_0= ruleMULTILINE ) ) (this_SPACE_6= RULE_SPACE )* (otherlv_7= '\\n' )? )
            // InternalDsl.g:115:3: (this_SPACE_0= RULE_SPACE )* ( (lv_key_1_0= ruleWORD ) ) (this_SPACE_2= RULE_SPACE )* this_SEPARATOR_3= RULE_SEPARATOR (this_SPACE_4= RULE_SPACE )* ( (lv_value_5_0= ruleMULTILINE ) ) (this_SPACE_6= RULE_SPACE )* (otherlv_7= '\\n' )?
            {
            // InternalDsl.g:115:3: (this_SPACE_0= RULE_SPACE )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_SPACE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDsl.g:116:4: this_SPACE_0= RULE_SPACE
            	    {
            	    this_SPACE_0=(Token)match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_SPACE_0, grammarAccess.getEntryAccess().getSPACETerminalRuleCall_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalDsl.g:121:3: ( (lv_key_1_0= ruleWORD ) )
            // InternalDsl.g:122:4: (lv_key_1_0= ruleWORD )
            {
            // InternalDsl.g:122:4: (lv_key_1_0= ruleWORD )
            // InternalDsl.g:123:5: lv_key_1_0= ruleWORD
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEntryAccess().getKeyWORDParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
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

            // InternalDsl.g:140:3: (this_SPACE_2= RULE_SPACE )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_SPACE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDsl.g:141:4: this_SPACE_2= RULE_SPACE
            	    {
            	    this_SPACE_2=(Token)match(input,RULE_SPACE,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_SPACE_2, grammarAccess.getEntryAccess().getSPACETerminalRuleCall_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            this_SEPARATOR_3=(Token)match(input,RULE_SEPARATOR,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_SEPARATOR_3, grammarAccess.getEntryAccess().getSEPARATORTerminalRuleCall_3());
              		
            }
            // InternalDsl.g:150:3: (this_SPACE_4= RULE_SPACE )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_SPACE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDsl.g:151:4: this_SPACE_4= RULE_SPACE
            	    {
            	    this_SPACE_4=(Token)match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_SPACE_4, grammarAccess.getEntryAccess().getSPACETerminalRuleCall_4());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalDsl.g:156:3: ( (lv_value_5_0= ruleMULTILINE ) )
            // InternalDsl.g:157:4: (lv_value_5_0= ruleMULTILINE )
            {
            // InternalDsl.g:157:4: (lv_value_5_0= ruleMULTILINE )
            // InternalDsl.g:158:5: lv_value_5_0= ruleMULTILINE
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEntryAccess().getValueMULTILINEParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_6);
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

            // InternalDsl.g:175:3: (this_SPACE_6= RULE_SPACE )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_SPACE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:176:4: this_SPACE_6= RULE_SPACE
            	    {
            	    this_SPACE_6=(Token)match(input,RULE_SPACE,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_SPACE_6, grammarAccess.getEntryAccess().getSPACETerminalRuleCall_6());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalDsl.g:181:3: (otherlv_7= '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==8) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:182:4: otherlv_7= '\\n'
                    {
                    otherlv_7=(Token)match(input,8,FOLLOW_2); if (state.failed) return current;
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
    // InternalDsl.g:191:1: entryRuleWORD returns [String current=null] : iv_ruleWORD= ruleWORD EOF ;
    public final String entryRuleWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWORD = null;


        try {
            // InternalDsl.g:191:44: (iv_ruleWORD= ruleWORD EOF )
            // InternalDsl.g:192:2: iv_ruleWORD= ruleWORD EOF
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
    // InternalDsl.g:198:1: ruleWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LETTER_0= RULE_LETTER ( (this_LETTER_1= RULE_LETTER | this_SPACE_2= RULE_SPACE )* ( ( RULE_LETTER )=>this_LETTER_3= RULE_LETTER ) )? ) ;
    public final AntlrDatatypeRuleToken ruleWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_LETTER_0=null;
        Token this_LETTER_1=null;
        Token this_SPACE_2=null;
        Token this_LETTER_3=null;


        	enterRule();

        try {
            // InternalDsl.g:204:2: ( (this_LETTER_0= RULE_LETTER ( (this_LETTER_1= RULE_LETTER | this_SPACE_2= RULE_SPACE )* ( ( RULE_LETTER )=>this_LETTER_3= RULE_LETTER ) )? ) )
            // InternalDsl.g:205:2: (this_LETTER_0= RULE_LETTER ( (this_LETTER_1= RULE_LETTER | this_SPACE_2= RULE_SPACE )* ( ( RULE_LETTER )=>this_LETTER_3= RULE_LETTER ) )? )
            {
            // InternalDsl.g:205:2: (this_LETTER_0= RULE_LETTER ( (this_LETTER_1= RULE_LETTER | this_SPACE_2= RULE_SPACE )* ( ( RULE_LETTER )=>this_LETTER_3= RULE_LETTER ) )? )
            // InternalDsl.g:206:3: this_LETTER_0= RULE_LETTER ( (this_LETTER_1= RULE_LETTER | this_SPACE_2= RULE_SPACE )* ( ( RULE_LETTER )=>this_LETTER_3= RULE_LETTER ) )?
            {
            this_LETTER_0=(Token)match(input,RULE_LETTER,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_LETTER_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LETTER_0, grammarAccess.getWORDAccess().getLETTERTerminalRuleCall_0());
              		
            }
            // InternalDsl.g:213:3: ( (this_LETTER_1= RULE_LETTER | this_SPACE_2= RULE_SPACE )* ( ( RULE_LETTER )=>this_LETTER_3= RULE_LETTER ) )?
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:214:4: (this_LETTER_1= RULE_LETTER | this_SPACE_2= RULE_SPACE )* ( ( RULE_LETTER )=>this_LETTER_3= RULE_LETTER )
                    {
                    // InternalDsl.g:214:4: (this_LETTER_1= RULE_LETTER | this_SPACE_2= RULE_SPACE )*
                    loop7:
                    do {
                        int alt7=3;
                        alt7 = dfa7.predict(input);
                        switch (alt7) {
                    	case 1 :
                    	    // InternalDsl.g:215:5: this_LETTER_1= RULE_LETTER
                    	    {
                    	    this_LETTER_1=(Token)match(input,RULE_LETTER,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_LETTER_1);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_LETTER_1, grammarAccess.getWORDAccess().getLETTERTerminalRuleCall_1_0_0());
                    	      				
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDsl.g:223:5: this_SPACE_2= RULE_SPACE
                    	    {
                    	    this_SPACE_2=(Token)match(input,RULE_SPACE,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_SPACE_2);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_SPACE_2, grammarAccess.getWORDAccess().getSPACETerminalRuleCall_1_0_1());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    // InternalDsl.g:231:4: ( ( RULE_LETTER )=>this_LETTER_3= RULE_LETTER )
                    // InternalDsl.g:232:5: ( RULE_LETTER )=>this_LETTER_3= RULE_LETTER
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
    // InternalDsl.g:246:1: entryRuleVALUE_WORD returns [String current=null] : iv_ruleVALUE_WORD= ruleVALUE_WORD EOF ;
    public final String entryRuleVALUE_WORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALUE_WORD = null;


        try {
            // InternalDsl.g:246:50: (iv_ruleVALUE_WORD= ruleVALUE_WORD EOF )
            // InternalDsl.g:247:2: iv_ruleVALUE_WORD= ruleVALUE_WORD EOF
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
    // InternalDsl.g:253:1: ruleVALUE_WORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_LETTER_0= RULE_LETTER | this_SEPARATOR_1= RULE_SEPARATOR ) ( ( (this_LETTER_2= RULE_LETTER | this_SEPARATOR_3= RULE_SEPARATOR ) | this_SPACE_4= RULE_SPACE )* ( ( RULE_LETTER | RULE_SEPARATOR )=> (this_LETTER_5= RULE_LETTER | this_SEPARATOR_6= RULE_SEPARATOR ) ) )? ) ;
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
            // InternalDsl.g:259:2: ( ( (this_LETTER_0= RULE_LETTER | this_SEPARATOR_1= RULE_SEPARATOR ) ( ( (this_LETTER_2= RULE_LETTER | this_SEPARATOR_3= RULE_SEPARATOR ) | this_SPACE_4= RULE_SPACE )* ( ( RULE_LETTER | RULE_SEPARATOR )=> (this_LETTER_5= RULE_LETTER | this_SEPARATOR_6= RULE_SEPARATOR ) ) )? ) )
            // InternalDsl.g:260:2: ( (this_LETTER_0= RULE_LETTER | this_SEPARATOR_1= RULE_SEPARATOR ) ( ( (this_LETTER_2= RULE_LETTER | this_SEPARATOR_3= RULE_SEPARATOR ) | this_SPACE_4= RULE_SPACE )* ( ( RULE_LETTER | RULE_SEPARATOR )=> (this_LETTER_5= RULE_LETTER | this_SEPARATOR_6= RULE_SEPARATOR ) ) )? )
            {
            // InternalDsl.g:260:2: ( (this_LETTER_0= RULE_LETTER | this_SEPARATOR_1= RULE_SEPARATOR ) ( ( (this_LETTER_2= RULE_LETTER | this_SEPARATOR_3= RULE_SEPARATOR ) | this_SPACE_4= RULE_SPACE )* ( ( RULE_LETTER | RULE_SEPARATOR )=> (this_LETTER_5= RULE_LETTER | this_SEPARATOR_6= RULE_SEPARATOR ) ) )? )
            // InternalDsl.g:261:3: (this_LETTER_0= RULE_LETTER | this_SEPARATOR_1= RULE_SEPARATOR ) ( ( (this_LETTER_2= RULE_LETTER | this_SEPARATOR_3= RULE_SEPARATOR ) | this_SPACE_4= RULE_SPACE )* ( ( RULE_LETTER | RULE_SEPARATOR )=> (this_LETTER_5= RULE_LETTER | this_SEPARATOR_6= RULE_SEPARATOR ) ) )?
            {
            // InternalDsl.g:261:3: (this_LETTER_0= RULE_LETTER | this_SEPARATOR_1= RULE_SEPARATOR )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_LETTER) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_SEPARATOR) ) {
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
                    // InternalDsl.g:262:4: this_LETTER_0= RULE_LETTER
                    {
                    this_LETTER_0=(Token)match(input,RULE_LETTER,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_LETTER_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_LETTER_0, grammarAccess.getVALUE_WORDAccess().getLETTERTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDsl.g:270:4: this_SEPARATOR_1= RULE_SEPARATOR
                    {
                    this_SEPARATOR_1=(Token)match(input,RULE_SEPARATOR,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_SEPARATOR_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_SEPARATOR_1, grammarAccess.getVALUE_WORDAccess().getSEPARATORTerminalRuleCall_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalDsl.g:278:3: ( ( (this_LETTER_2= RULE_LETTER | this_SEPARATOR_3= RULE_SEPARATOR ) | this_SPACE_4= RULE_SPACE )* ( ( RULE_LETTER | RULE_SEPARATOR )=> (this_LETTER_5= RULE_LETTER | this_SEPARATOR_6= RULE_SEPARATOR ) ) )?
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:279:4: ( (this_LETTER_2= RULE_LETTER | this_SEPARATOR_3= RULE_SEPARATOR ) | this_SPACE_4= RULE_SPACE )* ( ( RULE_LETTER | RULE_SEPARATOR )=> (this_LETTER_5= RULE_LETTER | this_SEPARATOR_6= RULE_SEPARATOR ) )
                    {
                    // InternalDsl.g:279:4: ( (this_LETTER_2= RULE_LETTER | this_SEPARATOR_3= RULE_SEPARATOR ) | this_SPACE_4= RULE_SPACE )*
                    loop11:
                    do {
                        int alt11=3;
                        alt11 = dfa11.predict(input);
                        switch (alt11) {
                    	case 1 :
                    	    // InternalDsl.g:280:5: (this_LETTER_2= RULE_LETTER | this_SEPARATOR_3= RULE_SEPARATOR )
                    	    {
                    	    // InternalDsl.g:280:5: (this_LETTER_2= RULE_LETTER | this_SEPARATOR_3= RULE_SEPARATOR )
                    	    int alt10=2;
                    	    int LA10_0 = input.LA(1);

                    	    if ( (LA10_0==RULE_LETTER) ) {
                    	        alt10=1;
                    	    }
                    	    else if ( (LA10_0==RULE_SEPARATOR) ) {
                    	        alt10=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 10, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt10) {
                    	        case 1 :
                    	            // InternalDsl.g:281:6: this_LETTER_2= RULE_LETTER
                    	            {
                    	            this_LETTER_2=(Token)match(input,RULE_LETTER,FOLLOW_4); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						current.merge(this_LETTER_2);
                    	              					
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(this_LETTER_2, grammarAccess.getVALUE_WORDAccess().getLETTERTerminalRuleCall_1_0_0_0());
                    	              					
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalDsl.g:289:6: this_SEPARATOR_3= RULE_SEPARATOR
                    	            {
                    	            this_SEPARATOR_3=(Token)match(input,RULE_SEPARATOR,FOLLOW_4); if (state.failed) return current;
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
                    	    // InternalDsl.g:298:5: this_SPACE_4= RULE_SPACE
                    	    {
                    	    this_SPACE_4=(Token)match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_SPACE_4);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_SPACE_4, grammarAccess.getVALUE_WORDAccess().getSPACETerminalRuleCall_1_0_1());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    // InternalDsl.g:306:4: ( ( RULE_LETTER | RULE_SEPARATOR )=> (this_LETTER_5= RULE_LETTER | this_SEPARATOR_6= RULE_SEPARATOR ) )
                    // InternalDsl.g:307:5: ( RULE_LETTER | RULE_SEPARATOR )=> (this_LETTER_5= RULE_LETTER | this_SEPARATOR_6= RULE_SEPARATOR )
                    {
                    // InternalDsl.g:308:5: (this_LETTER_5= RULE_LETTER | this_SEPARATOR_6= RULE_SEPARATOR )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_LETTER) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==RULE_SEPARATOR) ) {
                        alt12=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalDsl.g:309:6: this_LETTER_5= RULE_LETTER
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
                            // InternalDsl.g:317:6: this_SEPARATOR_6= RULE_SEPARATOR
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
    // InternalDsl.g:331:1: entryRuleMULTILINE returns [String current=null] : iv_ruleMULTILINE= ruleMULTILINE EOF ;
    public final String entryRuleMULTILINE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULTILINE = null;


        try {
            // InternalDsl.g:331:49: (iv_ruleMULTILINE= ruleMULTILINE EOF )
            // InternalDsl.g:332:2: iv_ruleMULTILINE= ruleMULTILINE EOF
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
    // InternalDsl.g:338:1: ruleMULTILINE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VALUE_WORD_0= ruleVALUE_WORD (kw= '\\\\\\n' (this_SPACE_2= RULE_SPACE )* this_VALUE_WORD_3= ruleVALUE_WORD )* ) ;
    public final AntlrDatatypeRuleToken ruleMULTILINE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_SPACE_2=null;
        AntlrDatatypeRuleToken this_VALUE_WORD_0 = null;

        AntlrDatatypeRuleToken this_VALUE_WORD_3 = null;



        	enterRule();

        try {
            // InternalDsl.g:344:2: ( (this_VALUE_WORD_0= ruleVALUE_WORD (kw= '\\\\\\n' (this_SPACE_2= RULE_SPACE )* this_VALUE_WORD_3= ruleVALUE_WORD )* ) )
            // InternalDsl.g:345:2: (this_VALUE_WORD_0= ruleVALUE_WORD (kw= '\\\\\\n' (this_SPACE_2= RULE_SPACE )* this_VALUE_WORD_3= ruleVALUE_WORD )* )
            {
            // InternalDsl.g:345:2: (this_VALUE_WORD_0= ruleVALUE_WORD (kw= '\\\\\\n' (this_SPACE_2= RULE_SPACE )* this_VALUE_WORD_3= ruleVALUE_WORD )* )
            // InternalDsl.g:346:3: this_VALUE_WORD_0= ruleVALUE_WORD (kw= '\\\\\\n' (this_SPACE_2= RULE_SPACE )* this_VALUE_WORD_3= ruleVALUE_WORD )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMULTILINEAccess().getVALUE_WORDParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_9);
            this_VALUE_WORD_0=ruleVALUE_WORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_VALUE_WORD_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDsl.g:356:3: (kw= '\\\\\\n' (this_SPACE_2= RULE_SPACE )* this_VALUE_WORD_3= ruleVALUE_WORD )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==9) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDsl.g:357:4: kw= '\\\\\\n' (this_SPACE_2= RULE_SPACE )* this_VALUE_WORD_3= ruleVALUE_WORD
            	    {
            	    kw=(Token)match(input,9,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getMULTILINEAccess().getReverseSolidusControl000aKeyword_1_0());
            	      			
            	    }
            	    // InternalDsl.g:362:4: (this_SPACE_2= RULE_SPACE )*
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==RULE_SPACE) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // InternalDsl.g:363:5: this_SPACE_2= RULE_SPACE
            	    	    {
            	    	    this_SPACE_2=(Token)match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					current.merge(this_SPACE_2);
            	    	      				
            	    	    }
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(this_SPACE_2, grammarAccess.getMULTILINEAccess().getSPACETerminalRuleCall_1_1());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop14;
            	        }
            	    } while (true);

            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getMULTILINEAccess().getVALUE_WORDParserRuleCall_1_2());
            	      			
            	    }
            	    pushFollow(FOLLOW_9);
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
    // $ANTLR end "ruleMULTILINE"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA11 dfa11 = new DFA11(this);
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

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "213:3: ( (this_LETTER_1= RULE_LETTER | this_SPACE_2= RULE_SPACE )* ( ( RULE_LETTER )=>this_LETTER_3= RULE_LETTER ) )?";
        }
    }
    static final String dfa_8s = "\6\uffff";
    static final String dfa_9s = "\1\uffff\1\5\4\uffff";
    static final String dfa_10s = "\2\4\2\uffff\1\4\1\uffff";
    static final String dfa_11s = "\2\6\2\uffff\1\6\1\uffff";
    static final String dfa_12s = "\2\uffff\1\2\1\1\1\uffff\1\3";
    static final String dfa_13s = "\6\uffff}>";
    static final String[] dfa_14s = {
            "\1\2\1\uffff\1\1",
            "\1\4\1\5\1\3",
            "",
            "",
            "\1\4\1\5\1\3",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 214:4: (this_LETTER_1= RULE_LETTER | this_SPACE_2= RULE_SPACE )*";
        }
    }
    static final String dfa_15s = "\13\uffff";
    static final String dfa_16s = "\1\4\1\5\1\uffff\1\4\2\uffff\2\5\1\12\2\uffff";
    static final String dfa_17s = "\2\4\1\uffff\1\4\2\uffff\3\4\2\uffff";
    static final String dfa_18s = "\2\11\1\uffff\1\10\2\uffff\1\10\1\11\1\10\2\uffff";
    static final String dfa_19s = "\2\uffff\1\1\1\uffff\1\2\1\1\3\uffff\2\1";
    static final String dfa_20s = "\13\uffff}>";
    static final String[] dfa_21s = {
            "\1\3\1\2\1\1\1\uffff\2\4",
            "\1\6\1\7\1\5\1\uffff\2\5",
            "",
            "\1\3\1\2\1\1\1\uffff\1\4",
            "",
            "",
            "\1\6\1\7\1\5\1\uffff\1\5",
            "\1\10\1\12\1\11\1\uffff\2\5",
            "\1\10\1\12\1\11\1\uffff\1\12",
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

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "278:3: ( ( (this_LETTER_2= RULE_LETTER | this_SEPARATOR_3= RULE_SEPARATOR ) | this_SPACE_4= RULE_SPACE )* ( ( RULE_LETTER | RULE_SEPARATOR )=> (this_LETTER_5= RULE_LETTER | this_SEPARATOR_6= RULE_SEPARATOR ) ) )?";
        }
    }
    static final String dfa_22s = "\16\uffff";
    static final String dfa_23s = "\1\uffff\2\4\2\uffff\1\4\1\10\2\uffff\2\10\1\15\2\uffff";
    static final String dfa_24s = "\3\4\2\uffff\2\4\2\uffff\3\4\2\uffff";
    static final String dfa_25s = "\1\6\2\11\2\uffff\1\10\1\11\2\uffff\1\10\1\11\1\10\2\uffff";
    static final String dfa_26s = "\3\uffff\1\2\1\3\2\uffff\2\1\3\uffff\2\1";
    static final String dfa_27s = "\16\uffff}>";
    static final String[] dfa_28s = {
            "\1\3\1\2\1\1",
            "\1\5\1\7\1\6\1\uffff\2\4",
            "\1\5\1\7\1\6\1\uffff\2\4",
            "",
            "",
            "\1\5\1\7\1\6\1\uffff\1\4",
            "\1\11\1\12\1\10\1\uffff\2\10",
            "",
            "",
            "\1\11\1\12\1\10\1\uffff\1\10",
            "\1\13\1\15\1\14\1\uffff\2\10",
            "\1\13\1\15\1\14\1\uffff\1\15",
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

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_22;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "()* loopback of 279:4: ( (this_LETTER_2= RULE_LETTER | this_SEPARATOR_3= RULE_SEPARATOR ) | this_SPACE_4= RULE_SPACE )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000112L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000202L});

}