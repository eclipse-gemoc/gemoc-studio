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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SPACE", "RULE_SL_COMMENT", "RULE_SEPARATOR", "RULE_LETTER", "'\\r'", "'\\n'", "'\\\\'"
    };
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int RULE_SEPARATOR=6;
    public static final int RULE_SL_COMMENT=5;
    public static final int RULE_LETTER=7;
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
    // InternalDsl.g:71:1: ruleDsl returns [EObject current=null] : ( () ( ( (this_SPACE_1= RULE_SPACE )+ (otherlv_2= '\\r' )? otherlv_3= '\\n' ) | ( (otherlv_4= '\\r' )? otherlv_5= '\\n' ) )* (this_SL_COMMENT_6= RULE_SL_COMMENT ( (otherlv_7= '\\r' )? otherlv_8= '\\n' )+ )* (this_SPACE_9= RULE_SPACE )* ( (lv_entries_10_0= ruleEntry ) ) ( ( (otherlv_11= '\\r' )? otherlv_12= '\\n' )+ ( (this_SPACE_13= RULE_SPACE )+ (otherlv_14= '\\r' )? otherlv_15= '\\n' )* ( (lv_entries_16_0= ruleEntry ) ) )* ( (otherlv_17= '\\r' )? otherlv_18= '\\n' ( ( (this_SPACE_19= RULE_SPACE )+ (otherlv_20= '\\r' )? otherlv_21= '\\n' ) | ( (otherlv_22= '\\r' )? otherlv_23= '\\n' ) )* )? ) ;
    public final EObject ruleDsl() throws RecognitionException {
        EObject current = null;

        Token this_SPACE_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token this_SL_COMMENT_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token this_SPACE_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token this_SPACE_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token this_SPACE_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        EObject lv_entries_10_0 = null;

        EObject lv_entries_16_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( ( () ( ( (this_SPACE_1= RULE_SPACE )+ (otherlv_2= '\\r' )? otherlv_3= '\\n' ) | ( (otherlv_4= '\\r' )? otherlv_5= '\\n' ) )* (this_SL_COMMENT_6= RULE_SL_COMMENT ( (otherlv_7= '\\r' )? otherlv_8= '\\n' )+ )* (this_SPACE_9= RULE_SPACE )* ( (lv_entries_10_0= ruleEntry ) ) ( ( (otherlv_11= '\\r' )? otherlv_12= '\\n' )+ ( (this_SPACE_13= RULE_SPACE )+ (otherlv_14= '\\r' )? otherlv_15= '\\n' )* ( (lv_entries_16_0= ruleEntry ) ) )* ( (otherlv_17= '\\r' )? otherlv_18= '\\n' ( ( (this_SPACE_19= RULE_SPACE )+ (otherlv_20= '\\r' )? otherlv_21= '\\n' ) | ( (otherlv_22= '\\r' )? otherlv_23= '\\n' ) )* )? ) )
            // InternalDsl.g:78:2: ( () ( ( (this_SPACE_1= RULE_SPACE )+ (otherlv_2= '\\r' )? otherlv_3= '\\n' ) | ( (otherlv_4= '\\r' )? otherlv_5= '\\n' ) )* (this_SL_COMMENT_6= RULE_SL_COMMENT ( (otherlv_7= '\\r' )? otherlv_8= '\\n' )+ )* (this_SPACE_9= RULE_SPACE )* ( (lv_entries_10_0= ruleEntry ) ) ( ( (otherlv_11= '\\r' )? otherlv_12= '\\n' )+ ( (this_SPACE_13= RULE_SPACE )+ (otherlv_14= '\\r' )? otherlv_15= '\\n' )* ( (lv_entries_16_0= ruleEntry ) ) )* ( (otherlv_17= '\\r' )? otherlv_18= '\\n' ( ( (this_SPACE_19= RULE_SPACE )+ (otherlv_20= '\\r' )? otherlv_21= '\\n' ) | ( (otherlv_22= '\\r' )? otherlv_23= '\\n' ) )* )? )
            {
            // InternalDsl.g:78:2: ( () ( ( (this_SPACE_1= RULE_SPACE )+ (otherlv_2= '\\r' )? otherlv_3= '\\n' ) | ( (otherlv_4= '\\r' )? otherlv_5= '\\n' ) )* (this_SL_COMMENT_6= RULE_SL_COMMENT ( (otherlv_7= '\\r' )? otherlv_8= '\\n' )+ )* (this_SPACE_9= RULE_SPACE )* ( (lv_entries_10_0= ruleEntry ) ) ( ( (otherlv_11= '\\r' )? otherlv_12= '\\n' )+ ( (this_SPACE_13= RULE_SPACE )+ (otherlv_14= '\\r' )? otherlv_15= '\\n' )* ( (lv_entries_16_0= ruleEntry ) ) )* ( (otherlv_17= '\\r' )? otherlv_18= '\\n' ( ( (this_SPACE_19= RULE_SPACE )+ (otherlv_20= '\\r' )? otherlv_21= '\\n' ) | ( (otherlv_22= '\\r' )? otherlv_23= '\\n' ) )* )? )
            // InternalDsl.g:79:3: () ( ( (this_SPACE_1= RULE_SPACE )+ (otherlv_2= '\\r' )? otherlv_3= '\\n' ) | ( (otherlv_4= '\\r' )? otherlv_5= '\\n' ) )* (this_SL_COMMENT_6= RULE_SL_COMMENT ( (otherlv_7= '\\r' )? otherlv_8= '\\n' )+ )* (this_SPACE_9= RULE_SPACE )* ( (lv_entries_10_0= ruleEntry ) ) ( ( (otherlv_11= '\\r' )? otherlv_12= '\\n' )+ ( (this_SPACE_13= RULE_SPACE )+ (otherlv_14= '\\r' )? otherlv_15= '\\n' )* ( (lv_entries_16_0= ruleEntry ) ) )* ( (otherlv_17= '\\r' )? otherlv_18= '\\n' ( ( (this_SPACE_19= RULE_SPACE )+ (otherlv_20= '\\r' )? otherlv_21= '\\n' ) | ( (otherlv_22= '\\r' )? otherlv_23= '\\n' ) )* )?
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

            // InternalDsl.g:86:3: ( ( (this_SPACE_1= RULE_SPACE )+ (otherlv_2= '\\r' )? otherlv_3= '\\n' ) | ( (otherlv_4= '\\r' )? otherlv_5= '\\n' ) )*
            loop4:
            do {
                int alt4=3;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // InternalDsl.g:87:4: ( (this_SPACE_1= RULE_SPACE )+ (otherlv_2= '\\r' )? otherlv_3= '\\n' )
            	    {
            	    // InternalDsl.g:87:4: ( (this_SPACE_1= RULE_SPACE )+ (otherlv_2= '\\r' )? otherlv_3= '\\n' )
            	    // InternalDsl.g:88:5: (this_SPACE_1= RULE_SPACE )+ (otherlv_2= '\\r' )? otherlv_3= '\\n'
            	    {
            	    // InternalDsl.g:88:5: (this_SPACE_1= RULE_SPACE )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==RULE_SPACE) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalDsl.g:89:6: this_SPACE_1= RULE_SPACE
            	    	    {
            	    	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_3); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(this_SPACE_1, grammarAccess.getDslAccess().getSPACETerminalRuleCall_1_0_0());
            	    	      					
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt1 >= 1 ) break loop1;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(1, input);
            	                throw eee;
            	        }
            	        cnt1++;
            	    } while (true);

            	    // InternalDsl.g:94:5: (otherlv_2= '\\r' )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==8) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalDsl.g:95:6: otherlv_2= '\\r'
            	            {
            	            otherlv_2=(Token)match(input,8,FOLLOW_4); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getDslAccess().getCarriageReturnKeyword_1_0_1());
            	              					
            	            }

            	            }
            	            break;

            	    }

            	    otherlv_3=(Token)match(input,9,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_3, grammarAccess.getDslAccess().getLineFeedKeyword_1_0_2());
            	      				
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDsl.g:106:4: ( (otherlv_4= '\\r' )? otherlv_5= '\\n' )
            	    {
            	    // InternalDsl.g:106:4: ( (otherlv_4= '\\r' )? otherlv_5= '\\n' )
            	    // InternalDsl.g:107:5: (otherlv_4= '\\r' )? otherlv_5= '\\n'
            	    {
            	    // InternalDsl.g:107:5: (otherlv_4= '\\r' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==8) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalDsl.g:108:6: otherlv_4= '\\r'
            	            {
            	            otherlv_4=(Token)match(input,8,FOLLOW_4); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getDslAccess().getCarriageReturnKeyword_1_1_0());
            	              					
            	            }

            	            }
            	            break;

            	    }

            	    otherlv_5=(Token)match(input,9,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getDslAccess().getLineFeedKeyword_1_1_1());
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalDsl.g:119:3: (this_SL_COMMENT_6= RULE_SL_COMMENT ( (otherlv_7= '\\r' )? otherlv_8= '\\n' )+ )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_SL_COMMENT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:120:4: this_SL_COMMENT_6= RULE_SL_COMMENT ( (otherlv_7= '\\r' )? otherlv_8= '\\n' )+
            	    {
            	    this_SL_COMMENT_6=(Token)match(input,RULE_SL_COMMENT,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_SL_COMMENT_6, grammarAccess.getDslAccess().getSL_COMMENTTerminalRuleCall_2_0());
            	      			
            	    }
            	    // InternalDsl.g:124:4: ( (otherlv_7= '\\r' )? otherlv_8= '\\n' )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( ((LA6_0>=8 && LA6_0<=9)) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalDsl.g:125:5: (otherlv_7= '\\r' )? otherlv_8= '\\n'
            	    	    {
            	    	    // InternalDsl.g:125:5: (otherlv_7= '\\r' )?
            	    	    int alt5=2;
            	    	    int LA5_0 = input.LA(1);

            	    	    if ( (LA5_0==8) ) {
            	    	        alt5=1;
            	    	    }
            	    	    switch (alt5) {
            	    	        case 1 :
            	    	            // InternalDsl.g:126:6: otherlv_7= '\\r'
            	    	            {
            	    	            otherlv_7=(Token)match(input,8,FOLLOW_4); if (state.failed) return current;
            	    	            if ( state.backtracking==0 ) {

            	    	              						newLeafNode(otherlv_7, grammarAccess.getDslAccess().getCarriageReturnKeyword_2_1_0());
            	    	              					
            	    	            }

            	    	            }
            	    	            break;

            	    	    }

            	    	    otherlv_8=(Token)match(input,9,FOLLOW_5); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(otherlv_8, grammarAccess.getDslAccess().getLineFeedKeyword_2_1_1());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt6 >= 1 ) break loop6;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(6, input);
            	                throw eee;
            	        }
            	        cnt6++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalDsl.g:137:3: (this_SPACE_9= RULE_SPACE )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_SPACE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:138:4: this_SPACE_9= RULE_SPACE
            	    {
            	    this_SPACE_9=(Token)match(input,RULE_SPACE,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_SPACE_9, grammarAccess.getDslAccess().getSPACETerminalRuleCall_3());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalDsl.g:143:3: ( (lv_entries_10_0= ruleEntry ) )
            // InternalDsl.g:144:4: (lv_entries_10_0= ruleEntry )
            {
            // InternalDsl.g:144:4: (lv_entries_10_0= ruleEntry )
            // InternalDsl.g:145:5: lv_entries_10_0= ruleEntry
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDslAccess().getEntriesEntryParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_entries_10_0=ruleEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDslRule());
              					}
              					add(
              						current,
              						"entries",
              						lv_entries_10_0,
              						"org.eclipse.gemoc.Dsl.Entry");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDsl.g:162:3: ( ( (otherlv_11= '\\r' )? otherlv_12= '\\n' )+ ( (this_SPACE_13= RULE_SPACE )+ (otherlv_14= '\\r' )? otherlv_15= '\\n' )* ( (lv_entries_16_0= ruleEntry ) ) )*
            loop14:
            do {
                int alt14=2;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:163:4: ( (otherlv_11= '\\r' )? otherlv_12= '\\n' )+ ( (this_SPACE_13= RULE_SPACE )+ (otherlv_14= '\\r' )? otherlv_15= '\\n' )* ( (lv_entries_16_0= ruleEntry ) )
            	    {
            	    // InternalDsl.g:163:4: ( (otherlv_11= '\\r' )? otherlv_12= '\\n' )+
            	    int cnt10=0;
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( ((LA10_0>=8 && LA10_0<=9)) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalDsl.g:164:5: (otherlv_11= '\\r' )? otherlv_12= '\\n'
            	    	    {
            	    	    // InternalDsl.g:164:5: (otherlv_11= '\\r' )?
            	    	    int alt9=2;
            	    	    int LA9_0 = input.LA(1);

            	    	    if ( (LA9_0==8) ) {
            	    	        alt9=1;
            	    	    }
            	    	    switch (alt9) {
            	    	        case 1 :
            	    	            // InternalDsl.g:165:6: otherlv_11= '\\r'
            	    	            {
            	    	            otherlv_11=(Token)match(input,8,FOLLOW_4); if (state.failed) return current;
            	    	            if ( state.backtracking==0 ) {

            	    	              						newLeafNode(otherlv_11, grammarAccess.getDslAccess().getCarriageReturnKeyword_5_0_0());
            	    	              					
            	    	            }

            	    	            }
            	    	            break;

            	    	    }

            	    	    otherlv_12=(Token)match(input,9,FOLLOW_5); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(otherlv_12, grammarAccess.getDslAccess().getLineFeedKeyword_5_0_1());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt10 >= 1 ) break loop10;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(10, input);
            	                throw eee;
            	        }
            	        cnt10++;
            	    } while (true);

            	    // InternalDsl.g:175:4: ( (this_SPACE_13= RULE_SPACE )+ (otherlv_14= '\\r' )? otherlv_15= '\\n' )*
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( (LA13_0==RULE_SPACE) ) {
            	            alt13=1;
            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // InternalDsl.g:176:5: (this_SPACE_13= RULE_SPACE )+ (otherlv_14= '\\r' )? otherlv_15= '\\n'
            	    	    {
            	    	    // InternalDsl.g:176:5: (this_SPACE_13= RULE_SPACE )+
            	    	    int cnt11=0;
            	    	    loop11:
            	    	    do {
            	    	        int alt11=2;
            	    	        int LA11_0 = input.LA(1);

            	    	        if ( (LA11_0==RULE_SPACE) ) {
            	    	            alt11=1;
            	    	        }


            	    	        switch (alt11) {
            	    	    	case 1 :
            	    	    	    // InternalDsl.g:177:6: this_SPACE_13= RULE_SPACE
            	    	    	    {
            	    	    	    this_SPACE_13=(Token)match(input,RULE_SPACE,FOLLOW_3); if (state.failed) return current;
            	    	    	    if ( state.backtracking==0 ) {

            	    	    	      						newLeafNode(this_SPACE_13, grammarAccess.getDslAccess().getSPACETerminalRuleCall_5_1_0());
            	    	    	      					
            	    	    	    }

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    if ( cnt11 >= 1 ) break loop11;
            	    	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	    	                EarlyExitException eee =
            	    	                    new EarlyExitException(11, input);
            	    	                throw eee;
            	    	        }
            	    	        cnt11++;
            	    	    } while (true);

            	    	    // InternalDsl.g:182:5: (otherlv_14= '\\r' )?
            	    	    int alt12=2;
            	    	    int LA12_0 = input.LA(1);

            	    	    if ( (LA12_0==8) ) {
            	    	        alt12=1;
            	    	    }
            	    	    switch (alt12) {
            	    	        case 1 :
            	    	            // InternalDsl.g:183:6: otherlv_14= '\\r'
            	    	            {
            	    	            otherlv_14=(Token)match(input,8,FOLLOW_4); if (state.failed) return current;
            	    	            if ( state.backtracking==0 ) {

            	    	              						newLeafNode(otherlv_14, grammarAccess.getDslAccess().getCarriageReturnKeyword_5_1_1());
            	    	              					
            	    	            }

            	    	            }
            	    	            break;

            	    	    }

            	    	    otherlv_15=(Token)match(input,9,FOLLOW_7); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(otherlv_15, grammarAccess.getDslAccess().getLineFeedKeyword_5_1_2());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop13;
            	        }
            	    } while (true);

            	    // InternalDsl.g:193:4: ( (lv_entries_16_0= ruleEntry ) )
            	    // InternalDsl.g:194:5: (lv_entries_16_0= ruleEntry )
            	    {
            	    // InternalDsl.g:194:5: (lv_entries_16_0= ruleEntry )
            	    // InternalDsl.g:195:6: lv_entries_16_0= ruleEntry
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDslAccess().getEntriesEntryParserRuleCall_5_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_entries_16_0=ruleEntry();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDslRule());
            	      						}
            	      						add(
            	      							current,
            	      							"entries",
            	      							lv_entries_16_0,
            	      							"org.eclipse.gemoc.Dsl.Entry");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalDsl.g:213:3: ( (otherlv_17= '\\r' )? otherlv_18= '\\n' ( ( (this_SPACE_19= RULE_SPACE )+ (otherlv_20= '\\r' )? otherlv_21= '\\n' ) | ( (otherlv_22= '\\r' )? otherlv_23= '\\n' ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=8 && LA20_0<=9)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:214:4: (otherlv_17= '\\r' )? otherlv_18= '\\n' ( ( (this_SPACE_19= RULE_SPACE )+ (otherlv_20= '\\r' )? otherlv_21= '\\n' ) | ( (otherlv_22= '\\r' )? otherlv_23= '\\n' ) )*
                    {
                    // InternalDsl.g:214:4: (otherlv_17= '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==8) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalDsl.g:215:5: otherlv_17= '\\r'
                            {
                            otherlv_17=(Token)match(input,8,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_17, grammarAccess.getDslAccess().getCarriageReturnKeyword_6_0());
                              				
                            }

                            }
                            break;

                    }

                    otherlv_18=(Token)match(input,9,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getDslAccess().getLineFeedKeyword_6_1());
                      			
                    }
                    // InternalDsl.g:224:4: ( ( (this_SPACE_19= RULE_SPACE )+ (otherlv_20= '\\r' )? otherlv_21= '\\n' ) | ( (otherlv_22= '\\r' )? otherlv_23= '\\n' ) )*
                    loop19:
                    do {
                        int alt19=3;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_SPACE) ) {
                            alt19=1;
                        }
                        else if ( ((LA19_0>=8 && LA19_0<=9)) ) {
                            alt19=2;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalDsl.g:225:5: ( (this_SPACE_19= RULE_SPACE )+ (otherlv_20= '\\r' )? otherlv_21= '\\n' )
                    	    {
                    	    // InternalDsl.g:225:5: ( (this_SPACE_19= RULE_SPACE )+ (otherlv_20= '\\r' )? otherlv_21= '\\n' )
                    	    // InternalDsl.g:226:6: (this_SPACE_19= RULE_SPACE )+ (otherlv_20= '\\r' )? otherlv_21= '\\n'
                    	    {
                    	    // InternalDsl.g:226:6: (this_SPACE_19= RULE_SPACE )+
                    	    int cnt16=0;
                    	    loop16:
                    	    do {
                    	        int alt16=2;
                    	        int LA16_0 = input.LA(1);

                    	        if ( (LA16_0==RULE_SPACE) ) {
                    	            alt16=1;
                    	        }


                    	        switch (alt16) {
                    	    	case 1 :
                    	    	    // InternalDsl.g:227:7: this_SPACE_19= RULE_SPACE
                    	    	    {
                    	    	    this_SPACE_19=(Token)match(input,RULE_SPACE,FOLLOW_3); if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	      							newLeafNode(this_SPACE_19, grammarAccess.getDslAccess().getSPACETerminalRuleCall_6_2_0_0());
                    	    	      						
                    	    	    }

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt16 >= 1 ) break loop16;
                    	    	    if (state.backtracking>0) {state.failed=true; return current;}
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(16, input);
                    	                throw eee;
                    	        }
                    	        cnt16++;
                    	    } while (true);

                    	    // InternalDsl.g:232:6: (otherlv_20= '\\r' )?
                    	    int alt17=2;
                    	    int LA17_0 = input.LA(1);

                    	    if ( (LA17_0==8) ) {
                    	        alt17=1;
                    	    }
                    	    switch (alt17) {
                    	        case 1 :
                    	            // InternalDsl.g:233:7: otherlv_20= '\\r'
                    	            {
                    	            otherlv_20=(Token)match(input,8,FOLLOW_4); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							newLeafNode(otherlv_20, grammarAccess.getDslAccess().getCarriageReturnKeyword_6_2_0_1());
                    	              						
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    otherlv_21=(Token)match(input,9,FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_21, grammarAccess.getDslAccess().getLineFeedKeyword_6_2_0_2());
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDsl.g:244:5: ( (otherlv_22= '\\r' )? otherlv_23= '\\n' )
                    	    {
                    	    // InternalDsl.g:244:5: ( (otherlv_22= '\\r' )? otherlv_23= '\\n' )
                    	    // InternalDsl.g:245:6: (otherlv_22= '\\r' )? otherlv_23= '\\n'
                    	    {
                    	    // InternalDsl.g:245:6: (otherlv_22= '\\r' )?
                    	    int alt18=2;
                    	    int LA18_0 = input.LA(1);

                    	    if ( (LA18_0==8) ) {
                    	        alt18=1;
                    	    }
                    	    switch (alt18) {
                    	        case 1 :
                    	            // InternalDsl.g:246:7: otherlv_22= '\\r'
                    	            {
                    	            otherlv_22=(Token)match(input,8,FOLLOW_4); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							newLeafNode(otherlv_22, grammarAccess.getDslAccess().getCarriageReturnKeyword_6_2_1_0());
                    	              						
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    otherlv_23=(Token)match(input,9,FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_23, grammarAccess.getDslAccess().getLineFeedKeyword_6_2_1_1());
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
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
    // $ANTLR end "ruleDsl"


    // $ANTLR start "entryRuleEntry"
    // InternalDsl.g:262:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // InternalDsl.g:262:46: (iv_ruleEntry= ruleEntry EOF )
            // InternalDsl.g:263:2: iv_ruleEntry= ruleEntry EOF
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
    // InternalDsl.g:269:1: ruleEntry returns [EObject current=null] : ( () ( (lv_key_1_0= ruleWORD ) ) (this_SPACE_2= RULE_SPACE )* ( ( ( RULE_SEPARATOR )=>this_SEPARATOR_3= RULE_SEPARATOR ) (this_SPACE_4= RULE_SPACE )* ( (lv_value_5_0= ruleMULTILINE ) ) ) ) ;
    public final EObject ruleEntry() throws RecognitionException {
        EObject current = null;

        Token this_SPACE_2=null;
        Token this_SEPARATOR_3=null;
        Token this_SPACE_4=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:275:2: ( ( () ( (lv_key_1_0= ruleWORD ) ) (this_SPACE_2= RULE_SPACE )* ( ( ( RULE_SEPARATOR )=>this_SEPARATOR_3= RULE_SEPARATOR ) (this_SPACE_4= RULE_SPACE )* ( (lv_value_5_0= ruleMULTILINE ) ) ) ) )
            // InternalDsl.g:276:2: ( () ( (lv_key_1_0= ruleWORD ) ) (this_SPACE_2= RULE_SPACE )* ( ( ( RULE_SEPARATOR )=>this_SEPARATOR_3= RULE_SEPARATOR ) (this_SPACE_4= RULE_SPACE )* ( (lv_value_5_0= ruleMULTILINE ) ) ) )
            {
            // InternalDsl.g:276:2: ( () ( (lv_key_1_0= ruleWORD ) ) (this_SPACE_2= RULE_SPACE )* ( ( ( RULE_SEPARATOR )=>this_SEPARATOR_3= RULE_SEPARATOR ) (this_SPACE_4= RULE_SPACE )* ( (lv_value_5_0= ruleMULTILINE ) ) ) )
            // InternalDsl.g:277:3: () ( (lv_key_1_0= ruleWORD ) ) (this_SPACE_2= RULE_SPACE )* ( ( ( RULE_SEPARATOR )=>this_SEPARATOR_3= RULE_SEPARATOR ) (this_SPACE_4= RULE_SPACE )* ( (lv_value_5_0= ruleMULTILINE ) ) )
            {
            // InternalDsl.g:277:3: ()
            // InternalDsl.g:278:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEntryAccess().getEntryAction_0(),
              					current);
              			
            }

            }

            // InternalDsl.g:284:3: ( (lv_key_1_0= ruleWORD ) )
            // InternalDsl.g:285:4: (lv_key_1_0= ruleWORD )
            {
            // InternalDsl.g:285:4: (lv_key_1_0= ruleWORD )
            // InternalDsl.g:286:5: lv_key_1_0= ruleWORD
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEntryAccess().getKeyWORDParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_10);
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

            // InternalDsl.g:303:3: (this_SPACE_2= RULE_SPACE )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_SPACE) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDsl.g:304:4: this_SPACE_2= RULE_SPACE
            	    {
            	    this_SPACE_2=(Token)match(input,RULE_SPACE,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_SPACE_2, grammarAccess.getEntryAccess().getSPACETerminalRuleCall_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // InternalDsl.g:309:3: ( ( ( RULE_SEPARATOR )=>this_SEPARATOR_3= RULE_SEPARATOR ) (this_SPACE_4= RULE_SPACE )* ( (lv_value_5_0= ruleMULTILINE ) ) )
            // InternalDsl.g:310:4: ( ( RULE_SEPARATOR )=>this_SEPARATOR_3= RULE_SEPARATOR ) (this_SPACE_4= RULE_SPACE )* ( (lv_value_5_0= ruleMULTILINE ) )
            {
            // InternalDsl.g:310:4: ( ( RULE_SEPARATOR )=>this_SEPARATOR_3= RULE_SEPARATOR )
            // InternalDsl.g:311:5: ( RULE_SEPARATOR )=>this_SEPARATOR_3= RULE_SEPARATOR
            {
            this_SEPARATOR_3=(Token)match(input,RULE_SEPARATOR,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(this_SEPARATOR_3, grammarAccess.getEntryAccess().getSEPARATORTerminalRuleCall_3_0());
              				
            }

            }

            // InternalDsl.g:317:4: (this_SPACE_4= RULE_SPACE )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_SPACE) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDsl.g:318:5: this_SPACE_4= RULE_SPACE
            	    {
            	    this_SPACE_4=(Token)match(input,RULE_SPACE,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(this_SPACE_4, grammarAccess.getEntryAccess().getSPACETerminalRuleCall_3_1());
            	      				
            	    }

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalDsl.g:323:4: ( (lv_value_5_0= ruleMULTILINE ) )
            // InternalDsl.g:324:5: (lv_value_5_0= ruleMULTILINE )
            {
            // InternalDsl.g:324:5: (lv_value_5_0= ruleMULTILINE )
            // InternalDsl.g:325:6: lv_value_5_0= ruleMULTILINE
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getEntryAccess().getValueMULTILINEParserRuleCall_3_2_0());
              					
            }
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleVALUE_WORD"
    // InternalDsl.g:347:1: entryRuleVALUE_WORD returns [String current=null] : iv_ruleVALUE_WORD= ruleVALUE_WORD EOF ;
    public final String entryRuleVALUE_WORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALUE_WORD = null;


        try {
            // InternalDsl.g:347:50: (iv_ruleVALUE_WORD= ruleVALUE_WORD EOF )
            // InternalDsl.g:348:2: iv_ruleVALUE_WORD= ruleVALUE_WORD EOF
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
    // InternalDsl.g:354:1: ruleVALUE_WORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_LETTER_0= RULE_LETTER | this_SEPARATOR_1= RULE_SEPARATOR )+ (this_SPACE_2= RULE_SPACE (this_SPACE_3= RULE_SPACE | (this_LETTER_4= RULE_LETTER | this_SEPARATOR_5= RULE_SEPARATOR ) )* (this_LETTER_6= RULE_LETTER | this_SEPARATOR_7= RULE_SEPARATOR ) )? ) ;
    public final AntlrDatatypeRuleToken ruleVALUE_WORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_LETTER_0=null;
        Token this_SEPARATOR_1=null;
        Token this_SPACE_2=null;
        Token this_SPACE_3=null;
        Token this_LETTER_4=null;
        Token this_SEPARATOR_5=null;
        Token this_LETTER_6=null;
        Token this_SEPARATOR_7=null;


        	enterRule();

        try {
            // InternalDsl.g:360:2: ( ( (this_LETTER_0= RULE_LETTER | this_SEPARATOR_1= RULE_SEPARATOR )+ (this_SPACE_2= RULE_SPACE (this_SPACE_3= RULE_SPACE | (this_LETTER_4= RULE_LETTER | this_SEPARATOR_5= RULE_SEPARATOR ) )* (this_LETTER_6= RULE_LETTER | this_SEPARATOR_7= RULE_SEPARATOR ) )? ) )
            // InternalDsl.g:361:2: ( (this_LETTER_0= RULE_LETTER | this_SEPARATOR_1= RULE_SEPARATOR )+ (this_SPACE_2= RULE_SPACE (this_SPACE_3= RULE_SPACE | (this_LETTER_4= RULE_LETTER | this_SEPARATOR_5= RULE_SEPARATOR ) )* (this_LETTER_6= RULE_LETTER | this_SEPARATOR_7= RULE_SEPARATOR ) )? )
            {
            // InternalDsl.g:361:2: ( (this_LETTER_0= RULE_LETTER | this_SEPARATOR_1= RULE_SEPARATOR )+ (this_SPACE_2= RULE_SPACE (this_SPACE_3= RULE_SPACE | (this_LETTER_4= RULE_LETTER | this_SEPARATOR_5= RULE_SEPARATOR ) )* (this_LETTER_6= RULE_LETTER | this_SEPARATOR_7= RULE_SEPARATOR ) )? )
            // InternalDsl.g:362:3: (this_LETTER_0= RULE_LETTER | this_SEPARATOR_1= RULE_SEPARATOR )+ (this_SPACE_2= RULE_SPACE (this_SPACE_3= RULE_SPACE | (this_LETTER_4= RULE_LETTER | this_SEPARATOR_5= RULE_SEPARATOR ) )* (this_LETTER_6= RULE_LETTER | this_SEPARATOR_7= RULE_SEPARATOR ) )?
            {
            // InternalDsl.g:362:3: (this_LETTER_0= RULE_LETTER | this_SEPARATOR_1= RULE_SEPARATOR )+
            int cnt23=0;
            loop23:
            do {
                int alt23=3;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_LETTER) ) {
                    alt23=1;
                }
                else if ( (LA23_0==RULE_SEPARATOR) ) {
                    alt23=2;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDsl.g:363:4: this_LETTER_0= RULE_LETTER
            	    {
            	    this_LETTER_0=(Token)match(input,RULE_LETTER,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_LETTER_0);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_LETTER_0, grammarAccess.getVALUE_WORDAccess().getLETTERTerminalRuleCall_0_0());
            	      			
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalDsl.g:371:4: this_SEPARATOR_1= RULE_SEPARATOR
            	    {
            	    this_SEPARATOR_1=(Token)match(input,RULE_SEPARATOR,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_SEPARATOR_1);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_SEPARATOR_1, grammarAccess.getVALUE_WORDAccess().getSEPARATORTerminalRuleCall_0_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            // InternalDsl.g:379:3: (this_SPACE_2= RULE_SPACE (this_SPACE_3= RULE_SPACE | (this_LETTER_4= RULE_LETTER | this_SEPARATOR_5= RULE_SEPARATOR ) )* (this_LETTER_6= RULE_LETTER | this_SEPARATOR_7= RULE_SEPARATOR ) )?
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalDsl.g:380:4: this_SPACE_2= RULE_SPACE (this_SPACE_3= RULE_SPACE | (this_LETTER_4= RULE_LETTER | this_SEPARATOR_5= RULE_SEPARATOR ) )* (this_LETTER_6= RULE_LETTER | this_SEPARATOR_7= RULE_SEPARATOR )
                    {
                    this_SPACE_2=(Token)match(input,RULE_SPACE,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_SPACE_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_SPACE_2, grammarAccess.getVALUE_WORDAccess().getSPACETerminalRuleCall_1_0());
                      			
                    }
                    // InternalDsl.g:387:4: (this_SPACE_3= RULE_SPACE | (this_LETTER_4= RULE_LETTER | this_SEPARATOR_5= RULE_SEPARATOR ) )*
                    loop25:
                    do {
                        int alt25=3;
                        alt25 = dfa25.predict(input);
                        switch (alt25) {
                    	case 1 :
                    	    // InternalDsl.g:388:5: this_SPACE_3= RULE_SPACE
                    	    {
                    	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_SPACE_3);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_SPACE_3, grammarAccess.getVALUE_WORDAccess().getSPACETerminalRuleCall_1_1_0());
                    	      				
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDsl.g:396:5: (this_LETTER_4= RULE_LETTER | this_SEPARATOR_5= RULE_SEPARATOR )
                    	    {
                    	    // InternalDsl.g:396:5: (this_LETTER_4= RULE_LETTER | this_SEPARATOR_5= RULE_SEPARATOR )
                    	    int alt24=2;
                    	    int LA24_0 = input.LA(1);

                    	    if ( (LA24_0==RULE_LETTER) ) {
                    	        alt24=1;
                    	    }
                    	    else if ( (LA24_0==RULE_SEPARATOR) ) {
                    	        alt24=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 24, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt24) {
                    	        case 1 :
                    	            // InternalDsl.g:397:6: this_LETTER_4= RULE_LETTER
                    	            {
                    	            this_LETTER_4=(Token)match(input,RULE_LETTER,FOLLOW_11); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						current.merge(this_LETTER_4);
                    	              					
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(this_LETTER_4, grammarAccess.getVALUE_WORDAccess().getLETTERTerminalRuleCall_1_1_1_0());
                    	              					
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalDsl.g:405:6: this_SEPARATOR_5= RULE_SEPARATOR
                    	            {
                    	            this_SEPARATOR_5=(Token)match(input,RULE_SEPARATOR,FOLLOW_11); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						current.merge(this_SEPARATOR_5);
                    	              					
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(this_SEPARATOR_5, grammarAccess.getVALUE_WORDAccess().getSEPARATORTerminalRuleCall_1_1_1_1());
                    	              					
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    // InternalDsl.g:414:4: (this_LETTER_6= RULE_LETTER | this_SEPARATOR_7= RULE_SEPARATOR )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==RULE_LETTER) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==RULE_SEPARATOR) ) {
                        alt26=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalDsl.g:415:5: this_LETTER_6= RULE_LETTER
                            {
                            this_LETTER_6=(Token)match(input,RULE_LETTER,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_LETTER_6);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_LETTER_6, grammarAccess.getVALUE_WORDAccess().getLETTERTerminalRuleCall_1_2_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalDsl.g:423:5: this_SEPARATOR_7= RULE_SEPARATOR
                            {
                            this_SEPARATOR_7=(Token)match(input,RULE_SEPARATOR,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_SEPARATOR_7);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_SEPARATOR_7, grammarAccess.getVALUE_WORDAccess().getSEPARATORTerminalRuleCall_1_2_1());
                              				
                            }

                            }
                            break;

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
    // InternalDsl.g:436:1: entryRuleMULTILINE returns [String current=null] : iv_ruleMULTILINE= ruleMULTILINE EOF ;
    public final String entryRuleMULTILINE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULTILINE = null;


        try {
            // InternalDsl.g:436:49: (iv_ruleMULTILINE= ruleMULTILINE EOF )
            // InternalDsl.g:437:2: iv_ruleMULTILINE= ruleMULTILINE EOF
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
    // InternalDsl.g:443:1: ruleMULTILINE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VALUE_WORD_0= ruleVALUE_WORD ( (this_SPACE_1= RULE_SPACE )* kw= '\\\\' (kw= '\\r' )? kw= '\\n' (this_SPACE_5= RULE_SPACE )* this_VALUE_WORD_6= ruleVALUE_WORD )* ) ;
    public final AntlrDatatypeRuleToken ruleMULTILINE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SPACE_1=null;
        Token kw=null;
        Token this_SPACE_5=null;
        AntlrDatatypeRuleToken this_VALUE_WORD_0 = null;

        AntlrDatatypeRuleToken this_VALUE_WORD_6 = null;



        	enterRule();

        try {
            // InternalDsl.g:449:2: ( (this_VALUE_WORD_0= ruleVALUE_WORD ( (this_SPACE_1= RULE_SPACE )* kw= '\\\\' (kw= '\\r' )? kw= '\\n' (this_SPACE_5= RULE_SPACE )* this_VALUE_WORD_6= ruleVALUE_WORD )* ) )
            // InternalDsl.g:450:2: (this_VALUE_WORD_0= ruleVALUE_WORD ( (this_SPACE_1= RULE_SPACE )* kw= '\\\\' (kw= '\\r' )? kw= '\\n' (this_SPACE_5= RULE_SPACE )* this_VALUE_WORD_6= ruleVALUE_WORD )* )
            {
            // InternalDsl.g:450:2: (this_VALUE_WORD_0= ruleVALUE_WORD ( (this_SPACE_1= RULE_SPACE )* kw= '\\\\' (kw= '\\r' )? kw= '\\n' (this_SPACE_5= RULE_SPACE )* this_VALUE_WORD_6= ruleVALUE_WORD )* )
            // InternalDsl.g:451:3: this_VALUE_WORD_0= ruleVALUE_WORD ( (this_SPACE_1= RULE_SPACE )* kw= '\\\\' (kw= '\\r' )? kw= '\\n' (this_SPACE_5= RULE_SPACE )* this_VALUE_WORD_6= ruleVALUE_WORD )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMULTILINEAccess().getVALUE_WORDParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_13);
            this_VALUE_WORD_0=ruleVALUE_WORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_VALUE_WORD_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDsl.g:461:3: ( (this_SPACE_1= RULE_SPACE )* kw= '\\\\' (kw= '\\r' )? kw= '\\n' (this_SPACE_5= RULE_SPACE )* this_VALUE_WORD_6= ruleVALUE_WORD )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_SPACE||LA31_0==10) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalDsl.g:462:4: (this_SPACE_1= RULE_SPACE )* kw= '\\\\' (kw= '\\r' )? kw= '\\n' (this_SPACE_5= RULE_SPACE )* this_VALUE_WORD_6= ruleVALUE_WORD
            	    {
            	    // InternalDsl.g:462:4: (this_SPACE_1= RULE_SPACE )*
            	    loop28:
            	    do {
            	        int alt28=2;
            	        int LA28_0 = input.LA(1);

            	        if ( (LA28_0==RULE_SPACE) ) {
            	            alt28=1;
            	        }


            	        switch (alt28) {
            	    	case 1 :
            	    	    // InternalDsl.g:463:5: this_SPACE_1= RULE_SPACE
            	    	    {
            	    	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_14); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					current.merge(this_SPACE_1);
            	    	      				
            	    	    }
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(this_SPACE_1, grammarAccess.getMULTILINEAccess().getSPACETerminalRuleCall_1_0());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop28;
            	        }
            	    } while (true);

            	    kw=(Token)match(input,10,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getMULTILINEAccess().getBackslashKeyword_1_1());
            	      			
            	    }
            	    // InternalDsl.g:476:4: (kw= '\\r' )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==8) ) {
            	        alt29=1;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalDsl.g:477:5: kw= '\\r'
            	            {
            	            kw=(Token)match(input,8,FOLLOW_4); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getMULTILINEAccess().getCarriageReturnKeyword_1_2());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    kw=(Token)match(input,9,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getMULTILINEAccess().getLineFeedKeyword_1_3());
            	      			
            	    }
            	    // InternalDsl.g:488:4: (this_SPACE_5= RULE_SPACE )*
            	    loop30:
            	    do {
            	        int alt30=2;
            	        int LA30_0 = input.LA(1);

            	        if ( (LA30_0==RULE_SPACE) ) {
            	            alt30=1;
            	        }


            	        switch (alt30) {
            	    	case 1 :
            	    	    // InternalDsl.g:489:5: this_SPACE_5= RULE_SPACE
            	    	    {
            	    	    this_SPACE_5=(Token)match(input,RULE_SPACE,FOLLOW_11); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					current.merge(this_SPACE_5);
            	    	      				
            	    	    }
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(this_SPACE_5, grammarAccess.getMULTILINEAccess().getSPACETerminalRuleCall_1_4());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop30;
            	        }
            	    } while (true);

            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getMULTILINEAccess().getVALUE_WORDParserRuleCall_1_5());
            	      			
            	    }
            	    pushFollow(FOLLOW_13);
            	    this_VALUE_WORD_6=ruleVALUE_WORD();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_VALUE_WORD_6);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop31;
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


    // $ANTLR start "entryRuleWORD"
    // InternalDsl.g:512:1: entryRuleWORD returns [String current=null] : iv_ruleWORD= ruleWORD EOF ;
    public final String entryRuleWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWORD = null;


        try {
            // InternalDsl.g:512:44: (iv_ruleWORD= ruleWORD EOF )
            // InternalDsl.g:513:2: iv_ruleWORD= ruleWORD EOF
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
    // InternalDsl.g:519:1: ruleWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_LETTER_0= RULE_LETTER )+ (this_SPACE_1= RULE_SPACE (this_SPACE_2= RULE_SPACE | this_LETTER_3= RULE_LETTER )* this_LETTER_4= RULE_LETTER )? ) ;
    public final AntlrDatatypeRuleToken ruleWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_LETTER_0=null;
        Token this_SPACE_1=null;
        Token this_SPACE_2=null;
        Token this_LETTER_3=null;
        Token this_LETTER_4=null;


        	enterRule();

        try {
            // InternalDsl.g:525:2: ( ( (this_LETTER_0= RULE_LETTER )+ (this_SPACE_1= RULE_SPACE (this_SPACE_2= RULE_SPACE | this_LETTER_3= RULE_LETTER )* this_LETTER_4= RULE_LETTER )? ) )
            // InternalDsl.g:526:2: ( (this_LETTER_0= RULE_LETTER )+ (this_SPACE_1= RULE_SPACE (this_SPACE_2= RULE_SPACE | this_LETTER_3= RULE_LETTER )* this_LETTER_4= RULE_LETTER )? )
            {
            // InternalDsl.g:526:2: ( (this_LETTER_0= RULE_LETTER )+ (this_SPACE_1= RULE_SPACE (this_SPACE_2= RULE_SPACE | this_LETTER_3= RULE_LETTER )* this_LETTER_4= RULE_LETTER )? )
            // InternalDsl.g:527:3: (this_LETTER_0= RULE_LETTER )+ (this_SPACE_1= RULE_SPACE (this_SPACE_2= RULE_SPACE | this_LETTER_3= RULE_LETTER )* this_LETTER_4= RULE_LETTER )?
            {
            // InternalDsl.g:527:3: (this_LETTER_0= RULE_LETTER )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_LETTER) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalDsl.g:528:4: this_LETTER_0= RULE_LETTER
            	    {
            	    this_LETTER_0=(Token)match(input,RULE_LETTER,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_LETTER_0);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_LETTER_0, grammarAccess.getWORDAccess().getLETTERTerminalRuleCall_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            // InternalDsl.g:536:3: (this_SPACE_1= RULE_SPACE (this_SPACE_2= RULE_SPACE | this_LETTER_3= RULE_LETTER )* this_LETTER_4= RULE_LETTER )?
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // InternalDsl.g:537:4: this_SPACE_1= RULE_SPACE (this_SPACE_2= RULE_SPACE | this_LETTER_3= RULE_LETTER )* this_LETTER_4= RULE_LETTER
                    {
                    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_SPACE_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_SPACE_1, grammarAccess.getWORDAccess().getSPACETerminalRuleCall_1_0());
                      			
                    }
                    // InternalDsl.g:544:4: (this_SPACE_2= RULE_SPACE | this_LETTER_3= RULE_LETTER )*
                    loop33:
                    do {
                        int alt33=3;
                        alt33 = dfa33.predict(input);
                        switch (alt33) {
                    	case 1 :
                    	    // InternalDsl.g:545:5: this_SPACE_2= RULE_SPACE
                    	    {
                    	    this_SPACE_2=(Token)match(input,RULE_SPACE,FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_SPACE_2);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_SPACE_2, grammarAccess.getWORDAccess().getSPACETerminalRuleCall_1_1_0());
                    	      				
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDsl.g:553:5: this_LETTER_3= RULE_LETTER
                    	    {
                    	    this_LETTER_3=(Token)match(input,RULE_LETTER,FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_LETTER_3);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_LETTER_3, grammarAccess.getWORDAccess().getLETTERTerminalRuleCall_1_1_1());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    this_LETTER_4=(Token)match(input,RULE_LETTER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_LETTER_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_LETTER_4, grammarAccess.getWORDAccess().getLETTERTerminalRuleCall_1_2());
                      			
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

    // $ANTLR start synpred1_InternalDsl
    public final void synpred1_InternalDsl_fragment() throws RecognitionException {   
        // InternalDsl.g:311:5: ( RULE_SEPARATOR )
        // InternalDsl.g:311:6: RULE_SEPARATOR
        {
        match(input,RULE_SEPARATOR,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalDsl

    // Delegated rules

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


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA33 dfa33 = new DFA33(this);
    static final String dfa_1s = "\5\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\4\2\uffff";
    static final String dfa_3s = "\1\11\1\uffff\1\11\2\uffff";
    static final String dfa_4s = "\1\uffff\1\3\1\uffff\1\2\1\1";
    static final String dfa_5s = "\5\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\1\1\uffff\1\1\2\3",
            "",
            "\1\2\2\uffff\1\1\2\4",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 86:3: ( ( (this_SPACE_1= RULE_SPACE )+ (otherlv_2= '\\r' )? otherlv_3= '\\n' ) | ( (otherlv_4= '\\r' )? otherlv_5= '\\n' ) )*";
        }
    }
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\1\3\1\uffff\1\3\4\uffff\1\3\1\uffff\1\3";
    static final String dfa_9s = "\1\10\1\11\1\4\1\uffff\1\4\1\uffff\1\11\1\4\1\11\1\4";
    static final String dfa_10s = "\3\11\1\uffff\1\11\1\uffff\4\11";
    static final String dfa_11s = "\3\uffff\1\2\1\uffff\1\1\4\uffff";
    static final String dfa_12s = "\12\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\1\2",
            "\1\2",
            "\1\4\2\uffff\1\5\1\6\1\7",
            "",
            "\1\4\3\uffff\1\10\1\11",
            "",
            "\1\7",
            "\1\4\2\uffff\1\5\1\6\1\7",
            "\1\11",
            "\1\4\2\uffff\1\5\2\3"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 162:3: ( ( (otherlv_11= '\\r' )? otherlv_12= '\\n' )+ ( (this_SPACE_13= RULE_SPACE )+ (otherlv_14= '\\r' )? otherlv_15= '\\n' )* ( (lv_entries_16_0= ruleEntry ) ) )*";
        }
    }
    static final String dfa_14s = "\1\2\4\uffff";
    static final String dfa_15s = "\2\4\1\uffff\1\4\1\uffff";
    static final String dfa_16s = "\2\12\1\uffff\1\12\1\uffff";
    static final String dfa_17s = "\2\uffff\1\2\1\uffff\1\1";
    static final String[] dfa_18s = {
            "\1\1\3\uffff\3\2",
            "\1\3\1\uffff\2\4\2\uffff\1\2",
            "",
            "\1\3\1\uffff\2\4\2\uffff\1\2",
            ""
    };
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_1;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_5;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "379:3: (this_SPACE_2= RULE_SPACE (this_SPACE_3= RULE_SPACE | (this_LETTER_4= RULE_LETTER | this_SEPARATOR_5= RULE_SEPARATOR ) )* (this_LETTER_6= RULE_LETTER | this_SEPARATOR_7= RULE_SEPARATOR ) )?";
        }
    }
    static final String dfa_19s = "\7\uffff";
    static final String dfa_20s = "\1\uffff\2\6\4\uffff";
    static final String dfa_21s = "\3\4\2\uffff\1\4\1\uffff";
    static final String dfa_22s = "\1\7\2\12\2\uffff\1\12\1\uffff";
    static final String dfa_23s = "\3\uffff\1\1\1\2\1\uffff\1\3";
    static final String dfa_24s = "\7\uffff}>";
    static final String[] dfa_25s = {
            "\1\3\1\uffff\1\2\1\1",
            "\1\5\1\uffff\2\4\3\6",
            "\1\5\1\uffff\2\4\3\6",
            "",
            "",
            "\1\5\1\uffff\2\4\2\uffff\1\6",
            ""
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_19;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "()* loopback of 387:4: (this_SPACE_3= RULE_SPACE | (this_LETTER_4= RULE_LETTER | this_SEPARATOR_5= RULE_SEPARATOR ) )*";
        }
    }
    static final String dfa_26s = "\1\6\1\7\1\uffff\1\7\1\uffff";
    static final String[] dfa_27s = {
            "\1\1\1\uffff\1\2",
            "\1\3\1\uffff\1\2\1\4",
            "",
            "\1\3\1\uffff\1\2\1\4",
            ""
    };
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final short[][] dfa_27 = unpackEncodedStringArray(dfa_27s);

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_1;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_26;
            this.accept = dfa_17;
            this.special = dfa_5;
            this.transition = dfa_27;
        }
        public String getDescription() {
            return "536:3: (this_SPACE_1= RULE_SPACE (this_SPACE_2= RULE_SPACE | this_LETTER_3= RULE_LETTER )* this_LETTER_4= RULE_LETTER )?";
        }
    }
    static final String dfa_28s = "\6\uffff";
    static final String dfa_29s = "\1\uffff\1\5\4\uffff";
    static final String dfa_30s = "\2\4\2\uffff\1\4\1\uffff";
    static final String dfa_31s = "\2\7\2\uffff\1\7\1\uffff";
    static final String dfa_32s = "\2\uffff\1\1\1\2\1\uffff\1\3";
    static final String dfa_33s = "\6\uffff}>";
    static final String[] dfa_34s = {
            "\1\2\2\uffff\1\1",
            "\1\4\1\uffff\1\5\1\3",
            "",
            "",
            "\1\4\1\uffff\1\5\1\3",
            ""
    };

    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final short[][] dfa_34 = unpackEncodedStringArray(dfa_34s);

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_28;
            this.eof = dfa_29;
            this.min = dfa_30;
            this.max = dfa_31;
            this.accept = dfa_32;
            this.special = dfa_33;
            this.transition = dfa_34;
        }
        public String getDescription() {
            return "()* loopback of 544:4: (this_SPACE_2= RULE_SPACE | this_LETTER_3= RULE_LETTER )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000310L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000003B0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000000B0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000312L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000000D2L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000412L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000092L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000090L});

}