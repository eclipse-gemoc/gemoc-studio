package fr.inria.diverse.logo.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.inria.diverse.logo.xtext.services.LogoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLogoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'right'", "'left'", "'forward'", "'pendown'", "'penup'", "'to'", "'end'", "'['", "']'", "'if'", "'ifelse'", "'while'", "'repeat'", "'and'", "'or'", "'='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'not'", "'true'", "'false'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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


        public InternalLogoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLogoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLogoParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLogo.g"; }



     	private LogoGrammarAccess grammarAccess;

        public InternalLogoParser(TokenStream input, LogoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Logo";
       	}

       	@Override
       	protected LogoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleLogo"
    // InternalLogo.g:64:1: entryRuleLogo returns [EObject current=null] : iv_ruleLogo= ruleLogo EOF ;
    public final EObject entryRuleLogo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogo = null;


        try {
            // InternalLogo.g:64:45: (iv_ruleLogo= ruleLogo EOF )
            // InternalLogo.g:65:2: iv_ruleLogo= ruleLogo EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogoRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogo=ruleLogo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogo; 
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
    // $ANTLR end "entryRuleLogo"


    // $ANTLR start "ruleLogo"
    // InternalLogo.g:71:1: ruleLogo returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )+ ;
    public final EObject ruleLogo() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalLogo.g:77:2: ( ( (lv_statements_0_0= ruleStatement ) )+ )
            // InternalLogo.g:78:2: ( (lv_statements_0_0= ruleStatement ) )+
            {
            // InternalLogo.g:78:2: ( (lv_statements_0_0= ruleStatement ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=12 && LA1_0<=17)||LA1_0==19||(LA1_0>=21 && LA1_0<=24)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLogo.g:79:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalLogo.g:79:3: (lv_statements_0_0= ruleStatement )
            	    // InternalLogo.g:80:4: lv_statements_0_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getLogoAccess().getStatementsStatementParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getLogoRule());
            	      				}
            	      				add(
            	      					current,
            	      					"statements",
            	      					lv_statements_0_0,
            	      					"fr.inria.diverse.logo.xtext.Logo.Statement");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

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
    // $ANTLR end "ruleLogo"


    // $ANTLR start "entryRuleParameter"
    // InternalLogo.g:100:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalLogo.g:100:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalLogo.g:101:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalLogo.g:107:1: ruleParameter returns [EObject current=null] : (otherlv_0= ':' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalLogo.g:113:2: ( (otherlv_0= ':' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalLogo.g:114:2: (otherlv_0= ':' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalLogo.g:114:2: (otherlv_0= ':' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalLogo.g:115:3: otherlv_0= ':' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getColonKeyword_0());
              		
            }
            // InternalLogo.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLogo.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLogo.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalLogo.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getParameterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleStatement"
    // InternalLogo.g:141:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalLogo.g:141:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalLogo.g:142:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalLogo.g:148:1: ruleStatement returns [EObject current=null] : (this_Right_0= ruleRight | this_Left_1= ruleLeft | this_Forward_2= ruleForward | this_PenDown_3= rulePenDown | this_PenUp_4= rulePenUp | this_ProcedureDefinition_5= ruleProcedureDefinition | this_ProcedureCall_6= ruleProcedureCall | this_ControlStatement_7= ruleControlStatement | this_Block_8= ruleBlock ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Right_0 = null;

        EObject this_Left_1 = null;

        EObject this_Forward_2 = null;

        EObject this_PenDown_3 = null;

        EObject this_PenUp_4 = null;

        EObject this_ProcedureDefinition_5 = null;

        EObject this_ProcedureCall_6 = null;

        EObject this_ControlStatement_7 = null;

        EObject this_Block_8 = null;



        	enterRule();

        try {
            // InternalLogo.g:154:2: ( (this_Right_0= ruleRight | this_Left_1= ruleLeft | this_Forward_2= ruleForward | this_PenDown_3= rulePenDown | this_PenUp_4= rulePenUp | this_ProcedureDefinition_5= ruleProcedureDefinition | this_ProcedureCall_6= ruleProcedureCall | this_ControlStatement_7= ruleControlStatement | this_Block_8= ruleBlock ) )
            // InternalLogo.g:155:2: (this_Right_0= ruleRight | this_Left_1= ruleLeft | this_Forward_2= ruleForward | this_PenDown_3= rulePenDown | this_PenUp_4= rulePenUp | this_ProcedureDefinition_5= ruleProcedureDefinition | this_ProcedureCall_6= ruleProcedureCall | this_ControlStatement_7= ruleControlStatement | this_Block_8= ruleBlock )
            {
            // InternalLogo.g:155:2: (this_Right_0= ruleRight | this_Left_1= ruleLeft | this_Forward_2= ruleForward | this_PenDown_3= rulePenDown | this_PenUp_4= rulePenUp | this_ProcedureDefinition_5= ruleProcedureDefinition | this_ProcedureCall_6= ruleProcedureCall | this_ControlStatement_7= ruleControlStatement | this_Block_8= ruleBlock )
            int alt2=9;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            case 16:
                {
                alt2=5;
                }
                break;
            case 17:
                {
                alt2=6;
                }
                break;
            case RULE_ID:
                {
                alt2=7;
                }
                break;
            case 21:
            case 22:
            case 23:
            case 24:
                {
                alt2=8;
                }
                break;
            case 19:
                {
                alt2=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalLogo.g:156:3: this_Right_0= ruleRight
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getRightParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Right_0=ruleRight();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Right_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalLogo.g:165:3: this_Left_1= ruleLeft
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getLeftParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Left_1=ruleLeft();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Left_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalLogo.g:174:3: this_Forward_2= ruleForward
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getForwardParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Forward_2=ruleForward();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Forward_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalLogo.g:183:3: this_PenDown_3= rulePenDown
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getPenDownParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PenDown_3=rulePenDown();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PenDown_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalLogo.g:192:3: this_PenUp_4= rulePenUp
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getPenUpParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PenUp_4=rulePenUp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PenUp_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalLogo.g:201:3: this_ProcedureDefinition_5= ruleProcedureDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getProcedureDefinitionParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ProcedureDefinition_5=ruleProcedureDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ProcedureDefinition_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalLogo.g:210:3: this_ProcedureCall_6= ruleProcedureCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getProcedureCallParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ProcedureCall_6=ruleProcedureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ProcedureCall_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalLogo.g:219:3: this_ControlStatement_7= ruleControlStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getControlStatementParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ControlStatement_7=ruleControlStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ControlStatement_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalLogo.g:228:3: this_Block_8= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getBlockParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Block_8=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Block_8;
                      			afterParserOrEnumRuleCall();
                      		
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalLogo.g:240:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalLogo.g:240:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalLogo.g:241:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalLogo.g:247:1: ruleExpression returns [EObject current=null] : (this_EqualsGreaterLower_0= ruleEqualsGreaterLower | this_ExtendedExpression_1= ruleExtendedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EqualsGreaterLower_0 = null;

        EObject this_ExtendedExpression_1 = null;



        	enterRule();

        try {
            // InternalLogo.g:253:2: ( (this_EqualsGreaterLower_0= ruleEqualsGreaterLower | this_ExtendedExpression_1= ruleExtendedExpression ) )
            // InternalLogo.g:254:2: (this_EqualsGreaterLower_0= ruleEqualsGreaterLower | this_ExtendedExpression_1= ruleExtendedExpression )
            {
            // InternalLogo.g:254:2: (this_EqualsGreaterLower_0= ruleEqualsGreaterLower | this_ExtendedExpression_1= ruleExtendedExpression )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT||LA3_0==11||LA3_0==31||LA3_0==34||(LA3_0>=36 && LA3_0<=38)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=25 && LA3_0<=26)) ) {
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
                    // InternalLogo.g:255:3: this_EqualsGreaterLower_0= ruleEqualsGreaterLower
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getEqualsGreaterLowerParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EqualsGreaterLower_0=ruleEqualsGreaterLower();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EqualsGreaterLower_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalLogo.g:264:3: this_ExtendedExpression_1= ruleExtendedExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getExtendedExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExtendedExpression_1=ruleExtendedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExtendedExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExtendedExpression"
    // InternalLogo.g:276:1: entryRuleExtendedExpression returns [EObject current=null] : iv_ruleExtendedExpression= ruleExtendedExpression EOF ;
    public final EObject entryRuleExtendedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendedExpression = null;


        try {
            // InternalLogo.g:276:59: (iv_ruleExtendedExpression= ruleExtendedExpression EOF )
            // InternalLogo.g:277:2: iv_ruleExtendedExpression= ruleExtendedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExtendedExpression=ruleExtendedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedExpression; 
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
    // $ANTLR end "entryRuleExtendedExpression"


    // $ANTLR start "ruleExtendedExpression"
    // InternalLogo.g:283:1: ruleExtendedExpression returns [EObject current=null] : (this_Or_0= ruleOr | this_And_1= ruleAnd ) ;
    public final EObject ruleExtendedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;

        EObject this_And_1 = null;



        	enterRule();

        try {
            // InternalLogo.g:289:2: ( (this_Or_0= ruleOr | this_And_1= ruleAnd ) )
            // InternalLogo.g:290:2: (this_Or_0= ruleOr | this_And_1= ruleAnd )
            {
            // InternalLogo.g:290:2: (this_Or_0= ruleOr | this_And_1= ruleAnd )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            else if ( (LA4_0==25) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalLogo.g:291:3: this_Or_0= ruleOr
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExtendedExpressionAccess().getOrParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Or_0=ruleOr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Or_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalLogo.g:300:3: this_And_1= ruleAnd
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExtendedExpressionAccess().getAndParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_And_1=ruleAnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_And_1;
                      			afterParserOrEnumRuleCall();
                      		
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
    // $ANTLR end "ruleExtendedExpression"


    // $ANTLR start "entryRuleConstant"
    // InternalLogo.g:312:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalLogo.g:312:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalLogo.g:313:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalLogo.g:319:1: ruleConstant returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_BoolValue_1= ruleBoolValue ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_BoolValue_1 = null;



        	enterRule();

        try {
            // InternalLogo.g:325:2: ( (this_IntValue_0= ruleIntValue | this_BoolValue_1= ruleBoolValue ) )
            // InternalLogo.g:326:2: (this_IntValue_0= ruleIntValue | this_BoolValue_1= ruleBoolValue )
            {
            // InternalLogo.g:326:2: (this_IntValue_0= ruleIntValue | this_BoolValue_1= ruleBoolValue )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=37 && LA5_0<=38)) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalLogo.g:327:3: this_IntValue_0= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConstantAccess().getIntValueParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IntValue_0=ruleIntValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntValue_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalLogo.g:336:3: this_BoolValue_1= ruleBoolValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConstantAccess().getBoolValueParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BoolValue_1=ruleBoolValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BoolValue_1;
                      			afterParserOrEnumRuleCall();
                      		
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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleRight"
    // InternalLogo.g:348:1: entryRuleRight returns [EObject current=null] : iv_ruleRight= ruleRight EOF ;
    public final EObject entryRuleRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRight = null;


        try {
            // InternalLogo.g:348:46: (iv_ruleRight= ruleRight EOF )
            // InternalLogo.g:349:2: iv_ruleRight= ruleRight EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRightRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRight=ruleRight();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRight; 
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
    // $ANTLR end "entryRuleRight"


    // $ANTLR start "ruleRight"
    // InternalLogo.g:355:1: ruleRight returns [EObject current=null] : (otherlv_0= 'right' ( (lv_angle_1_0= ruleExpression ) ) ) ;
    public final EObject ruleRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_angle_1_0 = null;



        	enterRule();

        try {
            // InternalLogo.g:361:2: ( (otherlv_0= 'right' ( (lv_angle_1_0= ruleExpression ) ) ) )
            // InternalLogo.g:362:2: (otherlv_0= 'right' ( (lv_angle_1_0= ruleExpression ) ) )
            {
            // InternalLogo.g:362:2: (otherlv_0= 'right' ( (lv_angle_1_0= ruleExpression ) ) )
            // InternalLogo.g:363:3: otherlv_0= 'right' ( (lv_angle_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRightAccess().getRightKeyword_0());
              		
            }
            // InternalLogo.g:367:3: ( (lv_angle_1_0= ruleExpression ) )
            // InternalLogo.g:368:4: (lv_angle_1_0= ruleExpression )
            {
            // InternalLogo.g:368:4: (lv_angle_1_0= ruleExpression )
            // InternalLogo.g:369:5: lv_angle_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRightAccess().getAngleExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_angle_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRightRule());
              					}
              					set(
              						current,
              						"angle",
              						lv_angle_1_0,
              						"fr.inria.diverse.logo.xtext.Logo.Expression");
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
    // $ANTLR end "ruleRight"


    // $ANTLR start "entryRuleLeft"
    // InternalLogo.g:390:1: entryRuleLeft returns [EObject current=null] : iv_ruleLeft= ruleLeft EOF ;
    public final EObject entryRuleLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeft = null;


        try {
            // InternalLogo.g:390:45: (iv_ruleLeft= ruleLeft EOF )
            // InternalLogo.g:391:2: iv_ruleLeft= ruleLeft EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeftRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLeft=ruleLeft();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLeft; 
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
    // $ANTLR end "entryRuleLeft"


    // $ANTLR start "ruleLeft"
    // InternalLogo.g:397:1: ruleLeft returns [EObject current=null] : (otherlv_0= 'left' ( (lv_angle_1_0= ruleExpression ) ) ) ;
    public final EObject ruleLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_angle_1_0 = null;



        	enterRule();

        try {
            // InternalLogo.g:403:2: ( (otherlv_0= 'left' ( (lv_angle_1_0= ruleExpression ) ) ) )
            // InternalLogo.g:404:2: (otherlv_0= 'left' ( (lv_angle_1_0= ruleExpression ) ) )
            {
            // InternalLogo.g:404:2: (otherlv_0= 'left' ( (lv_angle_1_0= ruleExpression ) ) )
            // InternalLogo.g:405:3: otherlv_0= 'left' ( (lv_angle_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLeftAccess().getLeftKeyword_0());
              		
            }
            // InternalLogo.g:409:3: ( (lv_angle_1_0= ruleExpression ) )
            // InternalLogo.g:410:4: (lv_angle_1_0= ruleExpression )
            {
            // InternalLogo.g:410:4: (lv_angle_1_0= ruleExpression )
            // InternalLogo.g:411:5: lv_angle_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLeftAccess().getAngleExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_angle_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLeftRule());
              					}
              					set(
              						current,
              						"angle",
              						lv_angle_1_0,
              						"fr.inria.diverse.logo.xtext.Logo.Expression");
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
    // $ANTLR end "ruleLeft"


    // $ANTLR start "entryRuleForward"
    // InternalLogo.g:432:1: entryRuleForward returns [EObject current=null] : iv_ruleForward= ruleForward EOF ;
    public final EObject entryRuleForward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForward = null;


        try {
            // InternalLogo.g:432:48: (iv_ruleForward= ruleForward EOF )
            // InternalLogo.g:433:2: iv_ruleForward= ruleForward EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForwardRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForward=ruleForward();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForward; 
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
    // $ANTLR end "entryRuleForward"


    // $ANTLR start "ruleForward"
    // InternalLogo.g:439:1: ruleForward returns [EObject current=null] : (otherlv_0= 'forward' ( (lv_step_1_0= ruleExpression ) ) ) ;
    public final EObject ruleForward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_step_1_0 = null;



        	enterRule();

        try {
            // InternalLogo.g:445:2: ( (otherlv_0= 'forward' ( (lv_step_1_0= ruleExpression ) ) ) )
            // InternalLogo.g:446:2: (otherlv_0= 'forward' ( (lv_step_1_0= ruleExpression ) ) )
            {
            // InternalLogo.g:446:2: (otherlv_0= 'forward' ( (lv_step_1_0= ruleExpression ) ) )
            // InternalLogo.g:447:3: otherlv_0= 'forward' ( (lv_step_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForwardAccess().getForwardKeyword_0());
              		
            }
            // InternalLogo.g:451:3: ( (lv_step_1_0= ruleExpression ) )
            // InternalLogo.g:452:4: (lv_step_1_0= ruleExpression )
            {
            // InternalLogo.g:452:4: (lv_step_1_0= ruleExpression )
            // InternalLogo.g:453:5: lv_step_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForwardAccess().getStepExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_step_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForwardRule());
              					}
              					set(
              						current,
              						"step",
              						lv_step_1_0,
              						"fr.inria.diverse.logo.xtext.Logo.Expression");
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
    // $ANTLR end "ruleForward"


    // $ANTLR start "entryRulePenDown"
    // InternalLogo.g:474:1: entryRulePenDown returns [EObject current=null] : iv_rulePenDown= rulePenDown EOF ;
    public final EObject entryRulePenDown() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePenDown = null;


        try {
            // InternalLogo.g:474:48: (iv_rulePenDown= rulePenDown EOF )
            // InternalLogo.g:475:2: iv_rulePenDown= rulePenDown EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPenDownRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePenDown=rulePenDown();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePenDown; 
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
    // $ANTLR end "entryRulePenDown"


    // $ANTLR start "rulePenDown"
    // InternalLogo.g:481:1: rulePenDown returns [EObject current=null] : ( () otherlv_1= 'pendown' ) ;
    public final EObject rulePenDown() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalLogo.g:487:2: ( ( () otherlv_1= 'pendown' ) )
            // InternalLogo.g:488:2: ( () otherlv_1= 'pendown' )
            {
            // InternalLogo.g:488:2: ( () otherlv_1= 'pendown' )
            // InternalLogo.g:489:3: () otherlv_1= 'pendown'
            {
            // InternalLogo.g:489:3: ()
            // InternalLogo.g:490:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPenDownAccess().getPenDownAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPenDownAccess().getPendownKeyword_1());
              		
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
    // $ANTLR end "rulePenDown"


    // $ANTLR start "entryRulePenUp"
    // InternalLogo.g:504:1: entryRulePenUp returns [EObject current=null] : iv_rulePenUp= rulePenUp EOF ;
    public final EObject entryRulePenUp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePenUp = null;


        try {
            // InternalLogo.g:504:46: (iv_rulePenUp= rulePenUp EOF )
            // InternalLogo.g:505:2: iv_rulePenUp= rulePenUp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPenUpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePenUp=rulePenUp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePenUp; 
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
    // $ANTLR end "entryRulePenUp"


    // $ANTLR start "rulePenUp"
    // InternalLogo.g:511:1: rulePenUp returns [EObject current=null] : ( () otherlv_1= 'penup' ) ;
    public final EObject rulePenUp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalLogo.g:517:2: ( ( () otherlv_1= 'penup' ) )
            // InternalLogo.g:518:2: ( () otherlv_1= 'penup' )
            {
            // InternalLogo.g:518:2: ( () otherlv_1= 'penup' )
            // InternalLogo.g:519:3: () otherlv_1= 'penup'
            {
            // InternalLogo.g:519:3: ()
            // InternalLogo.g:520:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPenUpAccess().getPenUpAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPenUpAccess().getPenupKeyword_1());
              		
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
    // $ANTLR end "rulePenUp"


    // $ANTLR start "entryRuleProcedureDefinition"
    // InternalLogo.g:534:1: entryRuleProcedureDefinition returns [EObject current=null] : iv_ruleProcedureDefinition= ruleProcedureDefinition EOF ;
    public final EObject entryRuleProcedureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedureDefinition = null;


        try {
            // InternalLogo.g:534:60: (iv_ruleProcedureDefinition= ruleProcedureDefinition EOF )
            // InternalLogo.g:535:2: iv_ruleProcedureDefinition= ruleProcedureDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcedureDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProcedureDefinition=ruleProcedureDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProcedureDefinition; 
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
    // $ANTLR end "entryRuleProcedureDefinition"


    // $ANTLR start "ruleProcedureDefinition"
    // InternalLogo.g:541:1: ruleProcedureDefinition returns [EObject current=null] : (otherlv_0= 'to' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameter ) )* ( (lv_statements_3_0= ruleStatement ) )+ otherlv_4= 'end' ) ;
    public final EObject ruleProcedureDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_4=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalLogo.g:547:2: ( (otherlv_0= 'to' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameter ) )* ( (lv_statements_3_0= ruleStatement ) )+ otherlv_4= 'end' ) )
            // InternalLogo.g:548:2: (otherlv_0= 'to' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameter ) )* ( (lv_statements_3_0= ruleStatement ) )+ otherlv_4= 'end' )
            {
            // InternalLogo.g:548:2: (otherlv_0= 'to' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameter ) )* ( (lv_statements_3_0= ruleStatement ) )+ otherlv_4= 'end' )
            // InternalLogo.g:549:3: otherlv_0= 'to' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameter ) )* ( (lv_statements_3_0= ruleStatement ) )+ otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getProcedureDefinitionAccess().getToKeyword_0());
              		
            }
            // InternalLogo.g:553:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLogo.g:554:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLogo.g:554:4: (lv_name_1_0= RULE_ID )
            // InternalLogo.g:555:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getProcedureDefinitionAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getProcedureDefinitionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalLogo.g:571:3: ( (lv_parameters_2_0= ruleParameter ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==11) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLogo.g:572:4: (lv_parameters_2_0= ruleParameter )
            	    {
            	    // InternalLogo.g:572:4: (lv_parameters_2_0= ruleParameter )
            	    // InternalLogo.g:573:5: lv_parameters_2_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getProcedureDefinitionAccess().getParametersParameterParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_parameters_2_0=ruleParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getProcedureDefinitionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"parameters",
            	      						lv_parameters_2_0,
            	      						"fr.inria.diverse.logo.xtext.Logo.Parameter");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalLogo.g:590:3: ( (lv_statements_3_0= ruleStatement ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=12 && LA7_0<=17)||LA7_0==19||(LA7_0>=21 && LA7_0<=24)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLogo.g:591:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalLogo.g:591:4: (lv_statements_3_0= ruleStatement )
            	    // InternalLogo.g:592:5: lv_statements_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getProcedureDefinitionAccess().getStatementsStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getProcedureDefinitionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statements",
            	      						lv_statements_3_0,
            	      						"fr.inria.diverse.logo.xtext.Logo.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getProcedureDefinitionAccess().getEndKeyword_4());
              		
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
    // $ANTLR end "ruleProcedureDefinition"


    // $ANTLR start "entryRuleProcedureCall"
    // InternalLogo.g:617:1: entryRuleProcedureCall returns [EObject current=null] : iv_ruleProcedureCall= ruleProcedureCall EOF ;
    public final EObject entryRuleProcedureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedureCall = null;


        try {
            // InternalLogo.g:617:54: (iv_ruleProcedureCall= ruleProcedureCall EOF )
            // InternalLogo.g:618:2: iv_ruleProcedureCall= ruleProcedureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcedureCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProcedureCall=ruleProcedureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProcedureCall; 
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
    // $ANTLR end "entryRuleProcedureCall"


    // $ANTLR start "ruleProcedureCall"
    // InternalLogo.g:624:1: ruleProcedureCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_parameterValues_1_0= ruleExpression ) )* ) ;
    public final EObject ruleProcedureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_parameterValues_1_0 = null;



        	enterRule();

        try {
            // InternalLogo.g:630:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_parameterValues_1_0= ruleExpression ) )* ) )
            // InternalLogo.g:631:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_parameterValues_1_0= ruleExpression ) )* )
            {
            // InternalLogo.g:631:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_parameterValues_1_0= ruleExpression ) )* )
            // InternalLogo.g:632:3: ( (otherlv_0= RULE_ID ) ) ( (lv_parameterValues_1_0= ruleExpression ) )*
            {
            // InternalLogo.g:632:3: ( (otherlv_0= RULE_ID ) )
            // InternalLogo.g:633:4: (otherlv_0= RULE_ID )
            {
            // InternalLogo.g:633:4: (otherlv_0= RULE_ID )
            // InternalLogo.g:634:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getProcedureCallRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getProcedureCallAccess().getDefinitionProcedureDefinitionCrossReference_0_0());
              				
            }

            }


            }

            // InternalLogo.g:645:3: ( (lv_parameterValues_1_0= ruleExpression ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_INT||LA8_0==11||(LA8_0>=25 && LA8_0<=26)||LA8_0==31||LA8_0==34||(LA8_0>=36 && LA8_0<=38)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLogo.g:646:4: (lv_parameterValues_1_0= ruleExpression )
            	    {
            	    // InternalLogo.g:646:4: (lv_parameterValues_1_0= ruleExpression )
            	    // InternalLogo.g:647:5: lv_parameterValues_1_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getProcedureCallAccess().getParameterValuesExpressionParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_parameterValues_1_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getProcedureCallRule());
            	      					}
            	      					add(
            	      						current,
            	      						"parameterValues",
            	      						lv_parameterValues_1_0,
            	      						"fr.inria.diverse.logo.xtext.Logo.Expression");
            	      					afterParserOrEnumRuleCall();
            	      				
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
    // $ANTLR end "ruleProcedureCall"


    // $ANTLR start "entryRuleBlock"
    // InternalLogo.g:668:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalLogo.g:668:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalLogo.g:669:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock; 
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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalLogo.g:675:1: ruleBlock returns [EObject current=null] : (otherlv_0= '[' ( (lv_statements_1_0= ruleStatement ) )+ otherlv_2= ']' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_statements_1_0 = null;



        	enterRule();

        try {
            // InternalLogo.g:681:2: ( (otherlv_0= '[' ( (lv_statements_1_0= ruleStatement ) )+ otherlv_2= ']' ) )
            // InternalLogo.g:682:2: (otherlv_0= '[' ( (lv_statements_1_0= ruleStatement ) )+ otherlv_2= ']' )
            {
            // InternalLogo.g:682:2: (otherlv_0= '[' ( (lv_statements_1_0= ruleStatement ) )+ otherlv_2= ']' )
            // InternalLogo.g:683:3: otherlv_0= '[' ( (lv_statements_1_0= ruleStatement ) )+ otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalLogo.g:687:3: ( (lv_statements_1_0= ruleStatement ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||(LA9_0>=12 && LA9_0<=17)||LA9_0==19||(LA9_0>=21 && LA9_0<=24)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLogo.g:688:4: (lv_statements_1_0= ruleStatement )
            	    {
            	    // InternalLogo.g:688:4: (lv_statements_1_0= ruleStatement )
            	    // InternalLogo.g:689:5: lv_statements_1_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_statements_1_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statements",
            	      						lv_statements_1_0,
            	      						"fr.inria.diverse.logo.xtext.Logo.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_2=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBlockAccess().getRightSquareBracketKeyword_2());
              		
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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleControlStatement"
    // InternalLogo.g:714:1: entryRuleControlStatement returns [EObject current=null] : iv_ruleControlStatement= ruleControlStatement EOF ;
    public final EObject entryRuleControlStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlStatement = null;


        try {
            // InternalLogo.g:714:57: (iv_ruleControlStatement= ruleControlStatement EOF )
            // InternalLogo.g:715:2: iv_ruleControlStatement= ruleControlStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getControlStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleControlStatement=ruleControlStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleControlStatement; 
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
    // $ANTLR end "entryRuleControlStatement"


    // $ANTLR start "ruleControlStatement"
    // InternalLogo.g:721:1: ruleControlStatement returns [EObject current=null] : (this_If_0= ruleIf | this_IfElse_1= ruleIfElse | this_While_2= ruleWhile | this_Repeat_3= ruleRepeat ) ;
    public final EObject ruleControlStatement() throws RecognitionException {
        EObject current = null;

        EObject this_If_0 = null;

        EObject this_IfElse_1 = null;

        EObject this_While_2 = null;

        EObject this_Repeat_3 = null;



        	enterRule();

        try {
            // InternalLogo.g:727:2: ( (this_If_0= ruleIf | this_IfElse_1= ruleIfElse | this_While_2= ruleWhile | this_Repeat_3= ruleRepeat ) )
            // InternalLogo.g:728:2: (this_If_0= ruleIf | this_IfElse_1= ruleIfElse | this_While_2= ruleWhile | this_Repeat_3= ruleRepeat )
            {
            // InternalLogo.g:728:2: (this_If_0= ruleIf | this_IfElse_1= ruleIfElse | this_While_2= ruleWhile | this_Repeat_3= ruleRepeat )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt10=1;
                }
                break;
            case 22:
                {
                alt10=2;
                }
                break;
            case 23:
                {
                alt10=3;
                }
                break;
            case 24:
                {
                alt10=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalLogo.g:729:3: this_If_0= ruleIf
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getControlStatementAccess().getIfParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_If_0=ruleIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_If_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalLogo.g:738:3: this_IfElse_1= ruleIfElse
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getControlStatementAccess().getIfElseParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfElse_1=ruleIfElse();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfElse_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalLogo.g:747:3: this_While_2= ruleWhile
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getControlStatementAccess().getWhileParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_While_2=ruleWhile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_While_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalLogo.g:756:3: this_Repeat_3= ruleRepeat
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getControlStatementAccess().getRepeatParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Repeat_3=ruleRepeat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Repeat_3;
                      			afterParserOrEnumRuleCall();
                      		
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
    // $ANTLR end "ruleControlStatement"


    // $ANTLR start "entryRuleIf"
    // InternalLogo.g:768:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalLogo.g:768:43: (iv_ruleIf= ruleIf EOF )
            // InternalLogo.g:769:2: iv_ruleIf= ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIf; 
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
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalLogo.g:775:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' ( ( (lv_condition_1_0= ruleExpression ) ) | (otherlv_2= '[' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ']' ) ) ( (lv_ifBlock_5_0= ruleBlock ) ) ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_1_0 = null;

        EObject lv_condition_3_0 = null;

        EObject lv_ifBlock_5_0 = null;



        	enterRule();

        try {
            // InternalLogo.g:781:2: ( (otherlv_0= 'if' ( ( (lv_condition_1_0= ruleExpression ) ) | (otherlv_2= '[' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ']' ) ) ( (lv_ifBlock_5_0= ruleBlock ) ) ) )
            // InternalLogo.g:782:2: (otherlv_0= 'if' ( ( (lv_condition_1_0= ruleExpression ) ) | (otherlv_2= '[' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ']' ) ) ( (lv_ifBlock_5_0= ruleBlock ) ) )
            {
            // InternalLogo.g:782:2: (otherlv_0= 'if' ( ( (lv_condition_1_0= ruleExpression ) ) | (otherlv_2= '[' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ']' ) ) ( (lv_ifBlock_5_0= ruleBlock ) ) )
            // InternalLogo.g:783:3: otherlv_0= 'if' ( ( (lv_condition_1_0= ruleExpression ) ) | (otherlv_2= '[' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ']' ) ) ( (lv_ifBlock_5_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
              		
            }
            // InternalLogo.g:787:3: ( ( (lv_condition_1_0= ruleExpression ) ) | (otherlv_2= '[' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ']' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT||LA11_0==11||(LA11_0>=25 && LA11_0<=26)||LA11_0==31||LA11_0==34||(LA11_0>=36 && LA11_0<=38)) ) {
                alt11=1;
            }
            else if ( (LA11_0==19) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalLogo.g:788:4: ( (lv_condition_1_0= ruleExpression ) )
                    {
                    // InternalLogo.g:788:4: ( (lv_condition_1_0= ruleExpression ) )
                    // InternalLogo.g:789:5: (lv_condition_1_0= ruleExpression )
                    {
                    // InternalLogo.g:789:5: (lv_condition_1_0= ruleExpression )
                    // InternalLogo.g:790:6: lv_condition_1_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfAccess().getConditionExpressionParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_condition_1_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfRule());
                      						}
                      						set(
                      							current,
                      							"condition",
                      							lv_condition_1_0,
                      							"fr.inria.diverse.logo.xtext.Logo.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLogo.g:808:4: (otherlv_2= '[' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ']' )
                    {
                    // InternalLogo.g:808:4: (otherlv_2= '[' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ']' )
                    // InternalLogo.g:809:5: otherlv_2= '[' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getIfAccess().getLeftSquareBracketKeyword_1_1_0());
                      				
                    }
                    // InternalLogo.g:813:5: ( (lv_condition_3_0= ruleExpression ) )
                    // InternalLogo.g:814:6: (lv_condition_3_0= ruleExpression )
                    {
                    // InternalLogo.g:814:6: (lv_condition_3_0= ruleExpression )
                    // InternalLogo.g:815:7: lv_condition_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getIfAccess().getConditionExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_12);
                    lv_condition_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getIfRule());
                      							}
                      							set(
                      								current,
                      								"condition",
                      								lv_condition_3_0,
                      								"fr.inria.diverse.logo.xtext.Logo.Expression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getIfAccess().getRightSquareBracketKeyword_1_1_2());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalLogo.g:838:3: ( (lv_ifBlock_5_0= ruleBlock ) )
            // InternalLogo.g:839:4: (lv_ifBlock_5_0= ruleBlock )
            {
            // InternalLogo.g:839:4: (lv_ifBlock_5_0= ruleBlock )
            // InternalLogo.g:840:5: lv_ifBlock_5_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfAccess().getIfBlockBlockParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_ifBlock_5_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfRule());
              					}
              					set(
              						current,
              						"ifBlock",
              						lv_ifBlock_5_0,
              						"fr.inria.diverse.logo.xtext.Logo.Block");
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
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleIfElse"
    // InternalLogo.g:861:1: entryRuleIfElse returns [EObject current=null] : iv_ruleIfElse= ruleIfElse EOF ;
    public final EObject entryRuleIfElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfElse = null;


        try {
            // InternalLogo.g:861:47: (iv_ruleIfElse= ruleIfElse EOF )
            // InternalLogo.g:862:2: iv_ruleIfElse= ruleIfElse EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfElseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfElse=ruleIfElse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfElse; 
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
    // $ANTLR end "entryRuleIfElse"


    // $ANTLR start "ruleIfElse"
    // InternalLogo.g:868:1: ruleIfElse returns [EObject current=null] : (otherlv_0= 'ifelse' ( ( (lv_condition_1_0= ruleExpression ) ) | (otherlv_2= '[' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ']' ) ) ( (lv_ifBlock_5_0= ruleBlock ) ) ( (lv_elseBlock_6_0= ruleBlock ) ) ) ;
    public final EObject ruleIfElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_1_0 = null;

        EObject lv_condition_3_0 = null;

        EObject lv_ifBlock_5_0 = null;

        EObject lv_elseBlock_6_0 = null;



        	enterRule();

        try {
            // InternalLogo.g:874:2: ( (otherlv_0= 'ifelse' ( ( (lv_condition_1_0= ruleExpression ) ) | (otherlv_2= '[' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ']' ) ) ( (lv_ifBlock_5_0= ruleBlock ) ) ( (lv_elseBlock_6_0= ruleBlock ) ) ) )
            // InternalLogo.g:875:2: (otherlv_0= 'ifelse' ( ( (lv_condition_1_0= ruleExpression ) ) | (otherlv_2= '[' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ']' ) ) ( (lv_ifBlock_5_0= ruleBlock ) ) ( (lv_elseBlock_6_0= ruleBlock ) ) )
            {
            // InternalLogo.g:875:2: (otherlv_0= 'ifelse' ( ( (lv_condition_1_0= ruleExpression ) ) | (otherlv_2= '[' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ']' ) ) ( (lv_ifBlock_5_0= ruleBlock ) ) ( (lv_elseBlock_6_0= ruleBlock ) ) )
            // InternalLogo.g:876:3: otherlv_0= 'ifelse' ( ( (lv_condition_1_0= ruleExpression ) ) | (otherlv_2= '[' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ']' ) ) ( (lv_ifBlock_5_0= ruleBlock ) ) ( (lv_elseBlock_6_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfElseAccess().getIfelseKeyword_0());
              		
            }
            // InternalLogo.g:880:3: ( ( (lv_condition_1_0= ruleExpression ) ) | (otherlv_2= '[' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ']' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT||LA12_0==11||(LA12_0>=25 && LA12_0<=26)||LA12_0==31||LA12_0==34||(LA12_0>=36 && LA12_0<=38)) ) {
                alt12=1;
            }
            else if ( (LA12_0==19) ) {
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
                    // InternalLogo.g:881:4: ( (lv_condition_1_0= ruleExpression ) )
                    {
                    // InternalLogo.g:881:4: ( (lv_condition_1_0= ruleExpression ) )
                    // InternalLogo.g:882:5: (lv_condition_1_0= ruleExpression )
                    {
                    // InternalLogo.g:882:5: (lv_condition_1_0= ruleExpression )
                    // InternalLogo.g:883:6: lv_condition_1_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfElseAccess().getConditionExpressionParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_condition_1_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfElseRule());
                      						}
                      						set(
                      							current,
                      							"condition",
                      							lv_condition_1_0,
                      							"fr.inria.diverse.logo.xtext.Logo.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLogo.g:901:4: (otherlv_2= '[' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ']' )
                    {
                    // InternalLogo.g:901:4: (otherlv_2= '[' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ']' )
                    // InternalLogo.g:902:5: otherlv_2= '[' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getIfElseAccess().getLeftSquareBracketKeyword_1_1_0());
                      				
                    }
                    // InternalLogo.g:906:5: ( (lv_condition_3_0= ruleExpression ) )
                    // InternalLogo.g:907:6: (lv_condition_3_0= ruleExpression )
                    {
                    // InternalLogo.g:907:6: (lv_condition_3_0= ruleExpression )
                    // InternalLogo.g:908:7: lv_condition_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getIfElseAccess().getConditionExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_12);
                    lv_condition_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getIfElseRule());
                      							}
                      							set(
                      								current,
                      								"condition",
                      								lv_condition_3_0,
                      								"fr.inria.diverse.logo.xtext.Logo.Expression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getIfElseAccess().getRightSquareBracketKeyword_1_1_2());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalLogo.g:931:3: ( (lv_ifBlock_5_0= ruleBlock ) )
            // InternalLogo.g:932:4: (lv_ifBlock_5_0= ruleBlock )
            {
            // InternalLogo.g:932:4: (lv_ifBlock_5_0= ruleBlock )
            // InternalLogo.g:933:5: lv_ifBlock_5_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfElseAccess().getIfBlockBlockParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_ifBlock_5_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfElseRule());
              					}
              					set(
              						current,
              						"ifBlock",
              						lv_ifBlock_5_0,
              						"fr.inria.diverse.logo.xtext.Logo.Block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLogo.g:950:3: ( (lv_elseBlock_6_0= ruleBlock ) )
            // InternalLogo.g:951:4: (lv_elseBlock_6_0= ruleBlock )
            {
            // InternalLogo.g:951:4: (lv_elseBlock_6_0= ruleBlock )
            // InternalLogo.g:952:5: lv_elseBlock_6_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfElseAccess().getElseBlockBlockParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_elseBlock_6_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfElseRule());
              					}
              					set(
              						current,
              						"elseBlock",
              						lv_elseBlock_6_0,
              						"fr.inria.diverse.logo.xtext.Logo.Block");
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
    // $ANTLR end "ruleIfElse"


    // $ANTLR start "entryRuleWhile"
    // InternalLogo.g:973:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // InternalLogo.g:973:46: (iv_ruleWhile= ruleWhile EOF )
            // InternalLogo.g:974:2: iv_ruleWhile= ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhile=ruleWhile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile; 
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
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalLogo.g:980:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' ( ( (lv_condition_1_0= ruleExpression ) ) | (otherlv_2= '[' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ']' ) ) ( (lv_block_5_0= ruleBlock ) ) ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_1_0 = null;

        EObject lv_condition_3_0 = null;

        EObject lv_block_5_0 = null;



        	enterRule();

        try {
            // InternalLogo.g:986:2: ( (otherlv_0= 'while' ( ( (lv_condition_1_0= ruleExpression ) ) | (otherlv_2= '[' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ']' ) ) ( (lv_block_5_0= ruleBlock ) ) ) )
            // InternalLogo.g:987:2: (otherlv_0= 'while' ( ( (lv_condition_1_0= ruleExpression ) ) | (otherlv_2= '[' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ']' ) ) ( (lv_block_5_0= ruleBlock ) ) )
            {
            // InternalLogo.g:987:2: (otherlv_0= 'while' ( ( (lv_condition_1_0= ruleExpression ) ) | (otherlv_2= '[' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ']' ) ) ( (lv_block_5_0= ruleBlock ) ) )
            // InternalLogo.g:988:3: otherlv_0= 'while' ( ( (lv_condition_1_0= ruleExpression ) ) | (otherlv_2= '[' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ']' ) ) ( (lv_block_5_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
              		
            }
            // InternalLogo.g:992:3: ( ( (lv_condition_1_0= ruleExpression ) ) | (otherlv_2= '[' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ']' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT||LA13_0==11||(LA13_0>=25 && LA13_0<=26)||LA13_0==31||LA13_0==34||(LA13_0>=36 && LA13_0<=38)) ) {
                alt13=1;
            }
            else if ( (LA13_0==19) ) {
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
                    // InternalLogo.g:993:4: ( (lv_condition_1_0= ruleExpression ) )
                    {
                    // InternalLogo.g:993:4: ( (lv_condition_1_0= ruleExpression ) )
                    // InternalLogo.g:994:5: (lv_condition_1_0= ruleExpression )
                    {
                    // InternalLogo.g:994:5: (lv_condition_1_0= ruleExpression )
                    // InternalLogo.g:995:6: lv_condition_1_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getWhileAccess().getConditionExpressionParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_condition_1_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getWhileRule());
                      						}
                      						set(
                      							current,
                      							"condition",
                      							lv_condition_1_0,
                      							"fr.inria.diverse.logo.xtext.Logo.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLogo.g:1013:4: (otherlv_2= '[' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ']' )
                    {
                    // InternalLogo.g:1013:4: (otherlv_2= '[' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ']' )
                    // InternalLogo.g:1014:5: otherlv_2= '[' ( (lv_condition_3_0= ruleExpression ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getWhileAccess().getLeftSquareBracketKeyword_1_1_0());
                      				
                    }
                    // InternalLogo.g:1018:5: ( (lv_condition_3_0= ruleExpression ) )
                    // InternalLogo.g:1019:6: (lv_condition_3_0= ruleExpression )
                    {
                    // InternalLogo.g:1019:6: (lv_condition_3_0= ruleExpression )
                    // InternalLogo.g:1020:7: lv_condition_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getWhileAccess().getConditionExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_12);
                    lv_condition_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getWhileRule());
                      							}
                      							set(
                      								current,
                      								"condition",
                      								lv_condition_3_0,
                      								"fr.inria.diverse.logo.xtext.Logo.Expression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getWhileAccess().getRightSquareBracketKeyword_1_1_2());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalLogo.g:1043:3: ( (lv_block_5_0= ruleBlock ) )
            // InternalLogo.g:1044:4: (lv_block_5_0= ruleBlock )
            {
            // InternalLogo.g:1044:4: (lv_block_5_0= ruleBlock )
            // InternalLogo.g:1045:5: lv_block_5_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileAccess().getBlockBlockParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_block_5_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileRule());
              					}
              					set(
              						current,
              						"block",
              						lv_block_5_0,
              						"fr.inria.diverse.logo.xtext.Logo.Block");
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
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleRepeat"
    // InternalLogo.g:1066:1: entryRuleRepeat returns [EObject current=null] : iv_ruleRepeat= ruleRepeat EOF ;
    public final EObject entryRuleRepeat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeat = null;


        try {
            // InternalLogo.g:1066:47: (iv_ruleRepeat= ruleRepeat EOF )
            // InternalLogo.g:1067:2: iv_ruleRepeat= ruleRepeat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRepeatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRepeat=ruleRepeat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRepeat; 
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
    // $ANTLR end "entryRuleRepeat"


    // $ANTLR start "ruleRepeat"
    // InternalLogo.g:1073:1: ruleRepeat returns [EObject current=null] : (otherlv_0= 'repeat' ( (lv_condition_1_0= ruleExpression ) ) ( (lv_block_2_0= ruleBlock ) ) ) ;
    public final EObject ruleRepeat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_condition_1_0 = null;

        EObject lv_block_2_0 = null;



        	enterRule();

        try {
            // InternalLogo.g:1079:2: ( (otherlv_0= 'repeat' ( (lv_condition_1_0= ruleExpression ) ) ( (lv_block_2_0= ruleBlock ) ) ) )
            // InternalLogo.g:1080:2: (otherlv_0= 'repeat' ( (lv_condition_1_0= ruleExpression ) ) ( (lv_block_2_0= ruleBlock ) ) )
            {
            // InternalLogo.g:1080:2: (otherlv_0= 'repeat' ( (lv_condition_1_0= ruleExpression ) ) ( (lv_block_2_0= ruleBlock ) ) )
            // InternalLogo.g:1081:3: otherlv_0= 'repeat' ( (lv_condition_1_0= ruleExpression ) ) ( (lv_block_2_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRepeatAccess().getRepeatKeyword_0());
              		
            }
            // InternalLogo.g:1085:3: ( (lv_condition_1_0= ruleExpression ) )
            // InternalLogo.g:1086:4: (lv_condition_1_0= ruleExpression )
            {
            // InternalLogo.g:1086:4: (lv_condition_1_0= ruleExpression )
            // InternalLogo.g:1087:5: lv_condition_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRepeatAccess().getConditionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_condition_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRepeatRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_1_0,
              						"fr.inria.diverse.logo.xtext.Logo.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLogo.g:1104:3: ( (lv_block_2_0= ruleBlock ) )
            // InternalLogo.g:1105:4: (lv_block_2_0= ruleBlock )
            {
            // InternalLogo.g:1105:4: (lv_block_2_0= ruleBlock )
            // InternalLogo.g:1106:5: lv_block_2_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRepeatAccess().getBlockBlockParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_block_2_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRepeatRule());
              					}
              					set(
              						current,
              						"block",
              						lv_block_2_0,
              						"fr.inria.diverse.logo.xtext.Logo.Block");
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
    // $ANTLR end "ruleRepeat"


    // $ANTLR start "entryRuleAnd"
    // InternalLogo.g:1127:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalLogo.g:1127:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalLogo.g:1128:2: iv_ruleAnd= ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnd; 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalLogo.g:1134:1: ruleAnd returns [EObject current=null] : (otherlv_0= 'and' ( (lv_expressions_1_0= ruleEqualsGreaterLower ) ) ( ( ( ( ruleEqualsGreaterLower ) ) )=> ( (lv_expressions_2_0= ruleEqualsGreaterLower ) ) )+ ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalLogo.g:1140:2: ( (otherlv_0= 'and' ( (lv_expressions_1_0= ruleEqualsGreaterLower ) ) ( ( ( ( ruleEqualsGreaterLower ) ) )=> ( (lv_expressions_2_0= ruleEqualsGreaterLower ) ) )+ ) )
            // InternalLogo.g:1141:2: (otherlv_0= 'and' ( (lv_expressions_1_0= ruleEqualsGreaterLower ) ) ( ( ( ( ruleEqualsGreaterLower ) ) )=> ( (lv_expressions_2_0= ruleEqualsGreaterLower ) ) )+ )
            {
            // InternalLogo.g:1141:2: (otherlv_0= 'and' ( (lv_expressions_1_0= ruleEqualsGreaterLower ) ) ( ( ( ( ruleEqualsGreaterLower ) ) )=> ( (lv_expressions_2_0= ruleEqualsGreaterLower ) ) )+ )
            // InternalLogo.g:1142:3: otherlv_0= 'and' ( (lv_expressions_1_0= ruleEqualsGreaterLower ) ) ( ( ( ( ruleEqualsGreaterLower ) ) )=> ( (lv_expressions_2_0= ruleEqualsGreaterLower ) ) )+
            {
            otherlv_0=(Token)match(input,25,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAndAccess().getAndKeyword_0());
              		
            }
            // InternalLogo.g:1146:3: ( (lv_expressions_1_0= ruleEqualsGreaterLower ) )
            // InternalLogo.g:1147:4: (lv_expressions_1_0= ruleEqualsGreaterLower )
            {
            // InternalLogo.g:1147:4: (lv_expressions_1_0= ruleEqualsGreaterLower )
            // InternalLogo.g:1148:5: lv_expressions_1_0= ruleEqualsGreaterLower
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAndAccess().getExpressionsEqualsGreaterLowerParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_expressions_1_0=ruleEqualsGreaterLower();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAndRule());
              					}
              					add(
              						current,
              						"expressions",
              						lv_expressions_1_0,
              						"fr.inria.diverse.logo.xtext.Logo.EqualsGreaterLower");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLogo.g:1165:3: ( ( ( ( ruleEqualsGreaterLower ) ) )=> ( (lv_expressions_2_0= ruleEqualsGreaterLower ) ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // InternalLogo.g:1166:4: ( ( ( ruleEqualsGreaterLower ) ) )=> ( (lv_expressions_2_0= ruleEqualsGreaterLower ) )
            	    {
            	    // InternalLogo.g:1172:4: ( (lv_expressions_2_0= ruleEqualsGreaterLower ) )
            	    // InternalLogo.g:1173:5: (lv_expressions_2_0= ruleEqualsGreaterLower )
            	    {
            	    // InternalLogo.g:1173:5: (lv_expressions_2_0= ruleEqualsGreaterLower )
            	    // InternalLogo.g:1174:6: lv_expressions_2_0= ruleEqualsGreaterLower
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndAccess().getExpressionsEqualsGreaterLowerParserRuleCall_2_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_expressions_2_0=ruleEqualsGreaterLower();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndRule());
            	      						}
            	      						add(
            	      							current,
            	      							"expressions",
            	      							lv_expressions_2_0,
            	      							"fr.inria.diverse.logo.xtext.Logo.EqualsGreaterLower");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleOr"
    // InternalLogo.g:1196:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalLogo.g:1196:43: (iv_ruleOr= ruleOr EOF )
            // InternalLogo.g:1197:2: iv_ruleOr= ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOr; 
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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalLogo.g:1203:1: ruleOr returns [EObject current=null] : (otherlv_0= 'or' ( (lv_expressions_1_0= ruleEqualsGreaterLower ) ) ( ( ( ( ruleEqualsGreaterLower ) ) )=> ( (lv_expressions_2_0= ruleEqualsGreaterLower ) ) )+ ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalLogo.g:1209:2: ( (otherlv_0= 'or' ( (lv_expressions_1_0= ruleEqualsGreaterLower ) ) ( ( ( ( ruleEqualsGreaterLower ) ) )=> ( (lv_expressions_2_0= ruleEqualsGreaterLower ) ) )+ ) )
            // InternalLogo.g:1210:2: (otherlv_0= 'or' ( (lv_expressions_1_0= ruleEqualsGreaterLower ) ) ( ( ( ( ruleEqualsGreaterLower ) ) )=> ( (lv_expressions_2_0= ruleEqualsGreaterLower ) ) )+ )
            {
            // InternalLogo.g:1210:2: (otherlv_0= 'or' ( (lv_expressions_1_0= ruleEqualsGreaterLower ) ) ( ( ( ( ruleEqualsGreaterLower ) ) )=> ( (lv_expressions_2_0= ruleEqualsGreaterLower ) ) )+ )
            // InternalLogo.g:1211:3: otherlv_0= 'or' ( (lv_expressions_1_0= ruleEqualsGreaterLower ) ) ( ( ( ( ruleEqualsGreaterLower ) ) )=> ( (lv_expressions_2_0= ruleEqualsGreaterLower ) ) )+
            {
            otherlv_0=(Token)match(input,26,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOrAccess().getOrKeyword_0());
              		
            }
            // InternalLogo.g:1215:3: ( (lv_expressions_1_0= ruleEqualsGreaterLower ) )
            // InternalLogo.g:1216:4: (lv_expressions_1_0= ruleEqualsGreaterLower )
            {
            // InternalLogo.g:1216:4: (lv_expressions_1_0= ruleEqualsGreaterLower )
            // InternalLogo.g:1217:5: lv_expressions_1_0= ruleEqualsGreaterLower
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOrAccess().getExpressionsEqualsGreaterLowerParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_expressions_1_0=ruleEqualsGreaterLower();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOrRule());
              					}
              					add(
              						current,
              						"expressions",
              						lv_expressions_1_0,
              						"fr.inria.diverse.logo.xtext.Logo.EqualsGreaterLower");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLogo.g:1234:3: ( ( ( ( ruleEqualsGreaterLower ) ) )=> ( (lv_expressions_2_0= ruleEqualsGreaterLower ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // InternalLogo.g:1235:4: ( ( ( ruleEqualsGreaterLower ) ) )=> ( (lv_expressions_2_0= ruleEqualsGreaterLower ) )
            	    {
            	    // InternalLogo.g:1241:4: ( (lv_expressions_2_0= ruleEqualsGreaterLower ) )
            	    // InternalLogo.g:1242:5: (lv_expressions_2_0= ruleEqualsGreaterLower )
            	    {
            	    // InternalLogo.g:1242:5: (lv_expressions_2_0= ruleEqualsGreaterLower )
            	    // InternalLogo.g:1243:6: lv_expressions_2_0= ruleEqualsGreaterLower
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrAccess().getExpressionsEqualsGreaterLowerParserRuleCall_2_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_expressions_2_0=ruleEqualsGreaterLower();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrRule());
            	      						}
            	      						add(
            	      							current,
            	      							"expressions",
            	      							lv_expressions_2_0,
            	      							"fr.inria.diverse.logo.xtext.Logo.EqualsGreaterLower");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleEqualsGreaterLower"
    // InternalLogo.g:1265:1: entryRuleEqualsGreaterLower returns [EObject current=null] : iv_ruleEqualsGreaterLower= ruleEqualsGreaterLower EOF ;
    public final EObject entryRuleEqualsGreaterLower() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualsGreaterLower = null;


        try {
            // InternalLogo.g:1265:59: (iv_ruleEqualsGreaterLower= ruleEqualsGreaterLower EOF )
            // InternalLogo.g:1266:2: iv_ruleEqualsGreaterLower= ruleEqualsGreaterLower EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualsGreaterLowerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEqualsGreaterLower=ruleEqualsGreaterLower();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualsGreaterLower; 
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
    // $ANTLR end "entryRuleEqualsGreaterLower"


    // $ANTLR start "ruleEqualsGreaterLower"
    // InternalLogo.g:1272:1: ruleEqualsGreaterLower returns [EObject current=null] : (this_PlusMinus_0= rulePlusMinus ( ( ( () otherlv_2= '=' ) | ( () otherlv_4= '>' ) | ( () otherlv_6= '<' ) ) ( (lv_rightExpression_7_0= rulePlusMinus ) ) )* ) ;
    public final EObject ruleEqualsGreaterLower() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_PlusMinus_0 = null;

        EObject lv_rightExpression_7_0 = null;



        	enterRule();

        try {
            // InternalLogo.g:1278:2: ( (this_PlusMinus_0= rulePlusMinus ( ( ( () otherlv_2= '=' ) | ( () otherlv_4= '>' ) | ( () otherlv_6= '<' ) ) ( (lv_rightExpression_7_0= rulePlusMinus ) ) )* ) )
            // InternalLogo.g:1279:2: (this_PlusMinus_0= rulePlusMinus ( ( ( () otherlv_2= '=' ) | ( () otherlv_4= '>' ) | ( () otherlv_6= '<' ) ) ( (lv_rightExpression_7_0= rulePlusMinus ) ) )* )
            {
            // InternalLogo.g:1279:2: (this_PlusMinus_0= rulePlusMinus ( ( ( () otherlv_2= '=' ) | ( () otherlv_4= '>' ) | ( () otherlv_6= '<' ) ) ( (lv_rightExpression_7_0= rulePlusMinus ) ) )* )
            // InternalLogo.g:1280:3: this_PlusMinus_0= rulePlusMinus ( ( ( () otherlv_2= '=' ) | ( () otherlv_4= '>' ) | ( () otherlv_6= '<' ) ) ( (lv_rightExpression_7_0= rulePlusMinus ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualsGreaterLowerAccess().getPlusMinusParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_15);
            this_PlusMinus_0=rulePlusMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PlusMinus_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalLogo.g:1288:3: ( ( ( () otherlv_2= '=' ) | ( () otherlv_4= '>' ) | ( () otherlv_6= '<' ) ) ( (lv_rightExpression_7_0= rulePlusMinus ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=27 && LA17_0<=29)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalLogo.g:1289:4: ( ( () otherlv_2= '=' ) | ( () otherlv_4= '>' ) | ( () otherlv_6= '<' ) ) ( (lv_rightExpression_7_0= rulePlusMinus ) )
            	    {
            	    // InternalLogo.g:1289:4: ( ( () otherlv_2= '=' ) | ( () otherlv_4= '>' ) | ( () otherlv_6= '<' ) )
            	    int alt16=3;
            	    switch ( input.LA(1) ) {
            	    case 27:
            	        {
            	        alt16=1;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt16=2;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt16=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt16) {
            	        case 1 :
            	            // InternalLogo.g:1290:5: ( () otherlv_2= '=' )
            	            {
            	            // InternalLogo.g:1290:5: ( () otherlv_2= '=' )
            	            // InternalLogo.g:1291:6: () otherlv_2= '='
            	            {
            	            // InternalLogo.g:1291:6: ()
            	            // InternalLogo.g:1292:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getEqualsGreaterLowerAccess().getEqualsLeftExpressionAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,27,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getEqualsGreaterLowerAccess().getEqualsSignKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalLogo.g:1304:5: ( () otherlv_4= '>' )
            	            {
            	            // InternalLogo.g:1304:5: ( () otherlv_4= '>' )
            	            // InternalLogo.g:1305:6: () otherlv_4= '>'
            	            {
            	            // InternalLogo.g:1305:6: ()
            	            // InternalLogo.g:1306:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getEqualsGreaterLowerAccess().getGreaterLeftExpressionAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,28,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getEqualsGreaterLowerAccess().getGreaterThanSignKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalLogo.g:1318:5: ( () otherlv_6= '<' )
            	            {
            	            // InternalLogo.g:1318:5: ( () otherlv_6= '<' )
            	            // InternalLogo.g:1319:6: () otherlv_6= '<'
            	            {
            	            // InternalLogo.g:1319:6: ()
            	            // InternalLogo.g:1320:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getEqualsGreaterLowerAccess().getLowerLeftExpressionAction_1_0_2_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_6=(Token)match(input,29,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_6, grammarAccess.getEqualsGreaterLowerAccess().getLessThanSignKeyword_1_0_2_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalLogo.g:1332:4: ( (lv_rightExpression_7_0= rulePlusMinus ) )
            	    // InternalLogo.g:1333:5: (lv_rightExpression_7_0= rulePlusMinus )
            	    {
            	    // InternalLogo.g:1333:5: (lv_rightExpression_7_0= rulePlusMinus )
            	    // InternalLogo.g:1334:6: lv_rightExpression_7_0= rulePlusMinus
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualsGreaterLowerAccess().getRightExpressionPlusMinusParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_rightExpression_7_0=rulePlusMinus();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEqualsGreaterLowerRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightExpression",
            	      							lv_rightExpression_7_0,
            	      							"fr.inria.diverse.logo.xtext.Logo.PlusMinus");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleEqualsGreaterLower"


    // $ANTLR start "entryRulePlusMinus"
    // InternalLogo.g:1356:1: entryRulePlusMinus returns [EObject current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
    public final EObject entryRulePlusMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusMinus = null;


        try {
            // InternalLogo.g:1356:50: (iv_rulePlusMinus= rulePlusMinus EOF )
            // InternalLogo.g:1357:2: iv_rulePlusMinus= rulePlusMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePlusMinus=rulePlusMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusMinus; 
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
    // $ANTLR end "entryRulePlusMinus"


    // $ANTLR start "rulePlusMinus"
    // InternalLogo.g:1363:1: rulePlusMinus returns [EObject current=null] : (this_MultDiv_0= ruleMultDiv ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleMultDiv ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rightExpression_5_0= ruleMultDiv ) ) ) )* ) ;
    public final EObject rulePlusMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MultDiv_0 = null;

        EObject lv_rightExpression_5_0 = null;



        	enterRule();

        try {
            // InternalLogo.g:1369:2: ( (this_MultDiv_0= ruleMultDiv ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleMultDiv ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rightExpression_5_0= ruleMultDiv ) ) ) )* ) )
            // InternalLogo.g:1370:2: (this_MultDiv_0= ruleMultDiv ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleMultDiv ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rightExpression_5_0= ruleMultDiv ) ) ) )* )
            {
            // InternalLogo.g:1370:2: (this_MultDiv_0= ruleMultDiv ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleMultDiv ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rightExpression_5_0= ruleMultDiv ) ) ) )* )
            // InternalLogo.g:1371:3: this_MultDiv_0= ruleMultDiv ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleMultDiv ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rightExpression_5_0= ruleMultDiv ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPlusMinusAccess().getMultDivParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_16);
            this_MultDiv_0=ruleMultDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MultDiv_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalLogo.g:1379:3: ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleMultDiv ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rightExpression_5_0= ruleMultDiv ) ) ) )*
            loop19:
            do {
                int alt19=2;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // InternalLogo.g:1380:4: ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleMultDiv ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rightExpression_5_0= ruleMultDiv ) ) )
            	    {
            	    // InternalLogo.g:1401:4: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rightExpression_5_0= ruleMultDiv ) ) )
            	    // InternalLogo.g:1402:5: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rightExpression_5_0= ruleMultDiv ) )
            	    {
            	    // InternalLogo.g:1402:5: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==30) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==31) ) {
            	        alt18=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalLogo.g:1403:6: ( () otherlv_2= '+' )
            	            {
            	            // InternalLogo.g:1403:6: ( () otherlv_2= '+' )
            	            // InternalLogo.g:1404:7: () otherlv_2= '+'
            	            {
            	            // InternalLogo.g:1404:7: ()
            	            // InternalLogo.g:1405:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getPlusMinusAccess().getPlusLeftExpressionAction_1_0_0_0_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_2=(Token)match(input,30,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_2, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_1_0_0_0_1());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalLogo.g:1417:6: ( () otherlv_4= '-' )
            	            {
            	            // InternalLogo.g:1417:6: ( () otherlv_4= '-' )
            	            // InternalLogo.g:1418:7: () otherlv_4= '-'
            	            {
            	            // InternalLogo.g:1418:7: ()
            	            // InternalLogo.g:1419:8: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              								current = forceCreateModelElementAndSet(
            	              									grammarAccess.getPlusMinusAccess().getMinusLeftExpressionAction_1_0_0_1_0(),
            	              									current);
            	              							
            	            }

            	            }

            	            otherlv_4=(Token)match(input,31,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_4, grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_0_0_1_1());
            	              						
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalLogo.g:1431:5: ( (lv_rightExpression_5_0= ruleMultDiv ) )
            	    // InternalLogo.g:1432:6: (lv_rightExpression_5_0= ruleMultDiv )
            	    {
            	    // InternalLogo.g:1432:6: (lv_rightExpression_5_0= ruleMultDiv )
            	    // InternalLogo.g:1433:7: lv_rightExpression_5_0= ruleMultDiv
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getPlusMinusAccess().getRightExpressionMultDivParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_rightExpression_5_0=ruleMultDiv();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getPlusMinusRule());
            	      							}
            	      							set(
            	      								current,
            	      								"rightExpression",
            	      								lv_rightExpression_5_0,
            	      								"fr.inria.diverse.logo.xtext.Logo.MultDiv");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // $ANTLR end "rulePlusMinus"


    // $ANTLR start "entryRuleMultDiv"
    // InternalLogo.g:1456:1: entryRuleMultDiv returns [EObject current=null] : iv_ruleMultDiv= ruleMultDiv EOF ;
    public final EObject entryRuleMultDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultDiv = null;


        try {
            // InternalLogo.g:1456:48: (iv_ruleMultDiv= ruleMultDiv EOF )
            // InternalLogo.g:1457:2: iv_ruleMultDiv= ruleMultDiv EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultDivRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultDiv=ruleMultDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultDiv; 
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
    // $ANTLR end "entryRuleMultDiv"


    // $ANTLR start "ruleMultDiv"
    // InternalLogo.g:1463:1: ruleMultDiv returns [EObject current=null] : (this_NotOpposite_0= ruleNotOpposite ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rightExpression_5_0= ruleNotOpposite ) ) )* ) ;
    public final EObject ruleMultDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_NotOpposite_0 = null;

        EObject lv_rightExpression_5_0 = null;



        	enterRule();

        try {
            // InternalLogo.g:1469:2: ( (this_NotOpposite_0= ruleNotOpposite ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rightExpression_5_0= ruleNotOpposite ) ) )* ) )
            // InternalLogo.g:1470:2: (this_NotOpposite_0= ruleNotOpposite ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rightExpression_5_0= ruleNotOpposite ) ) )* )
            {
            // InternalLogo.g:1470:2: (this_NotOpposite_0= ruleNotOpposite ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rightExpression_5_0= ruleNotOpposite ) ) )* )
            // InternalLogo.g:1471:3: this_NotOpposite_0= ruleNotOpposite ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rightExpression_5_0= ruleNotOpposite ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultDivAccess().getNotOppositeParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_17);
            this_NotOpposite_0=ruleNotOpposite();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_NotOpposite_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalLogo.g:1479:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rightExpression_5_0= ruleNotOpposite ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=32 && LA21_0<=33)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalLogo.g:1480:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_rightExpression_5_0= ruleNotOpposite ) )
            	    {
            	    // InternalLogo.g:1480:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==32) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==33) ) {
            	        alt20=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalLogo.g:1481:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalLogo.g:1481:5: ( () otherlv_2= '*' )
            	            // InternalLogo.g:1482:6: () otherlv_2= '*'
            	            {
            	            // InternalLogo.g:1482:6: ()
            	            // InternalLogo.g:1483:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getMultDivAccess().getMultLeftExpressionAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,32,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getMultDivAccess().getAsteriskKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalLogo.g:1495:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalLogo.g:1495:5: ( () otherlv_4= '/' )
            	            // InternalLogo.g:1496:6: () otherlv_4= '/'
            	            {
            	            // InternalLogo.g:1496:6: ()
            	            // InternalLogo.g:1497:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getMultDivAccess().getDivLeftExpressionAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,33,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getMultDivAccess().getSolidusKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalLogo.g:1509:4: ( (lv_rightExpression_5_0= ruleNotOpposite ) )
            	    // InternalLogo.g:1510:5: (lv_rightExpression_5_0= ruleNotOpposite )
            	    {
            	    // InternalLogo.g:1510:5: (lv_rightExpression_5_0= ruleNotOpposite )
            	    // InternalLogo.g:1511:6: lv_rightExpression_5_0= ruleNotOpposite
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultDivAccess().getRightExpressionNotOppositeParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_rightExpression_5_0=ruleNotOpposite();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMultDivRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightExpression",
            	      							lv_rightExpression_5_0,
            	      							"fr.inria.diverse.logo.xtext.Logo.NotOpposite");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end "ruleMultDiv"


    // $ANTLR start "entryRuleNotOpposite"
    // InternalLogo.g:1533:1: entryRuleNotOpposite returns [EObject current=null] : iv_ruleNotOpposite= ruleNotOpposite EOF ;
    public final EObject entryRuleNotOpposite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOpposite = null;


        try {
            // InternalLogo.g:1533:52: (iv_ruleNotOpposite= ruleNotOpposite EOF )
            // InternalLogo.g:1534:2: iv_ruleNotOpposite= ruleNotOpposite EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOppositeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNotOpposite=ruleNotOpposite();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOpposite; 
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
    // $ANTLR end "entryRuleNotOpposite"


    // $ANTLR start "ruleNotOpposite"
    // InternalLogo.g:1540:1: ruleNotOpposite returns [EObject current=null] : (this_Constant_0= ruleConstant | this_VariableRead_1= ruleVariableRead | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) | ( () otherlv_6= 'not' ( (lv_expression_7_0= ruleNotOpposite ) ) ) | ( () otherlv_9= '-' ( (lv_expression_10_0= ruleNotOpposite ) ) ) ) ;
    public final EObject ruleNotOpposite() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject this_Constant_0 = null;

        EObject this_VariableRead_1 = null;

        EObject this_Expression_3 = null;

        EObject lv_expression_7_0 = null;

        EObject lv_expression_10_0 = null;



        	enterRule();

        try {
            // InternalLogo.g:1546:2: ( (this_Constant_0= ruleConstant | this_VariableRead_1= ruleVariableRead | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) | ( () otherlv_6= 'not' ( (lv_expression_7_0= ruleNotOpposite ) ) ) | ( () otherlv_9= '-' ( (lv_expression_10_0= ruleNotOpposite ) ) ) ) )
            // InternalLogo.g:1547:2: (this_Constant_0= ruleConstant | this_VariableRead_1= ruleVariableRead | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) | ( () otherlv_6= 'not' ( (lv_expression_7_0= ruleNotOpposite ) ) ) | ( () otherlv_9= '-' ( (lv_expression_10_0= ruleNotOpposite ) ) ) )
            {
            // InternalLogo.g:1547:2: (this_Constant_0= ruleConstant | this_VariableRead_1= ruleVariableRead | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) | ( () otherlv_6= 'not' ( (lv_expression_7_0= ruleNotOpposite ) ) ) | ( () otherlv_9= '-' ( (lv_expression_10_0= ruleNotOpposite ) ) ) )
            int alt22=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 37:
            case 38:
                {
                alt22=1;
                }
                break;
            case 11:
                {
                alt22=2;
                }
                break;
            case 34:
                {
                alt22=3;
                }
                break;
            case 36:
                {
                alt22=4;
                }
                break;
            case 31:
                {
                alt22=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalLogo.g:1548:3: this_Constant_0= ruleConstant
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNotOppositeAccess().getConstantParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Constant_0=ruleConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Constant_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalLogo.g:1557:3: this_VariableRead_1= ruleVariableRead
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNotOppositeAccess().getVariableReadParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VariableRead_1=ruleVariableRead();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VariableRead_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalLogo.g:1566:3: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    {
                    // InternalLogo.g:1566:3: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    // InternalLogo.g:1567:4: otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getNotOppositeAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNotOppositeAccess().getExpressionParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_18);
                    this_Expression_3=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_4=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getNotOppositeAccess().getRightParenthesisKeyword_2_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalLogo.g:1585:3: ( () otherlv_6= 'not' ( (lv_expression_7_0= ruleNotOpposite ) ) )
                    {
                    // InternalLogo.g:1585:3: ( () otherlv_6= 'not' ( (lv_expression_7_0= ruleNotOpposite ) ) )
                    // InternalLogo.g:1586:4: () otherlv_6= 'not' ( (lv_expression_7_0= ruleNotOpposite ) )
                    {
                    // InternalLogo.g:1586:4: ()
                    // InternalLogo.g:1587:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNotOppositeAccess().getNotAction_3_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_6=(Token)match(input,36,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getNotOppositeAccess().getNotKeyword_3_1());
                      			
                    }
                    // InternalLogo.g:1597:4: ( (lv_expression_7_0= ruleNotOpposite ) )
                    // InternalLogo.g:1598:5: (lv_expression_7_0= ruleNotOpposite )
                    {
                    // InternalLogo.g:1598:5: (lv_expression_7_0= ruleNotOpposite )
                    // InternalLogo.g:1599:6: lv_expression_7_0= ruleNotOpposite
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNotOppositeAccess().getExpressionNotOppositeParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_7_0=ruleNotOpposite();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNotOppositeRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_7_0,
                      							"fr.inria.diverse.logo.xtext.Logo.NotOpposite");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalLogo.g:1618:3: ( () otherlv_9= '-' ( (lv_expression_10_0= ruleNotOpposite ) ) )
                    {
                    // InternalLogo.g:1618:3: ( () otherlv_9= '-' ( (lv_expression_10_0= ruleNotOpposite ) ) )
                    // InternalLogo.g:1619:4: () otherlv_9= '-' ( (lv_expression_10_0= ruleNotOpposite ) )
                    {
                    // InternalLogo.g:1619:4: ()
                    // InternalLogo.g:1620:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNotOppositeAccess().getOppositeAction_4_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_9=(Token)match(input,31,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getNotOppositeAccess().getHyphenMinusKeyword_4_1());
                      			
                    }
                    // InternalLogo.g:1630:4: ( (lv_expression_10_0= ruleNotOpposite ) )
                    // InternalLogo.g:1631:5: (lv_expression_10_0= ruleNotOpposite )
                    {
                    // InternalLogo.g:1631:5: (lv_expression_10_0= ruleNotOpposite )
                    // InternalLogo.g:1632:6: lv_expression_10_0= ruleNotOpposite
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNotOppositeAccess().getExpressionNotOppositeParserRuleCall_4_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_10_0=ruleNotOpposite();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNotOppositeRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_10_0,
                      							"fr.inria.diverse.logo.xtext.Logo.NotOpposite");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


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
    // $ANTLR end "ruleNotOpposite"


    // $ANTLR start "entryRuleVariableRead"
    // InternalLogo.g:1654:1: entryRuleVariableRead returns [EObject current=null] : iv_ruleVariableRead= ruleVariableRead EOF ;
    public final EObject entryRuleVariableRead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableRead = null;


        try {
            // InternalLogo.g:1654:53: (iv_ruleVariableRead= ruleVariableRead EOF )
            // InternalLogo.g:1655:2: iv_ruleVariableRead= ruleVariableRead EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableReadRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariableRead=ruleVariableRead();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableRead; 
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
    // $ANTLR end "entryRuleVariableRead"


    // $ANTLR start "ruleVariableRead"
    // InternalLogo.g:1661:1: ruleVariableRead returns [EObject current=null] : (otherlv_0= ':' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariableRead() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalLogo.g:1667:2: ( (otherlv_0= ':' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalLogo.g:1668:2: (otherlv_0= ':' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalLogo.g:1668:2: (otherlv_0= ':' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalLogo.g:1669:3: otherlv_0= ':' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVariableReadAccess().getColonKeyword_0());
              		
            }
            // InternalLogo.g:1673:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLogo.g:1674:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLogo.g:1674:4: (lv_name_1_0= RULE_ID )
            // InternalLogo.g:1675:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getVariableReadAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVariableReadRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
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
    // $ANTLR end "ruleVariableRead"


    // $ANTLR start "entryRuleIntValue"
    // InternalLogo.g:1695:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalLogo.g:1695:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalLogo.g:1696:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntValue; 
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
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalLogo.g:1702:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalLogo.g:1708:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalLogo.g:1709:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalLogo.g:1709:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalLogo.g:1710:3: (lv_value_0_0= RULE_INT )
            {
            // InternalLogo.g:1710:3: (lv_value_0_0= RULE_INT )
            // InternalLogo.g:1711:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getIntValueRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.eclipse.xtext.common.Terminals.INT");
              			
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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleBoolValue"
    // InternalLogo.g:1730:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolValue = null;


        try {
            // InternalLogo.g:1730:50: (iv_ruleBoolValue= ruleBoolValue EOF )
            // InternalLogo.g:1731:2: iv_ruleBoolValue= ruleBoolValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoolValue=ruleBoolValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolValue; 
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
    // $ANTLR end "entryRuleBoolValue"


    // $ANTLR start "ruleBoolValue"
    // InternalLogo.g:1737:1: ruleBoolValue returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalLogo.g:1743:2: ( ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) ) )
            // InternalLogo.g:1744:2: ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            {
            // InternalLogo.g:1744:2: ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            // InternalLogo.g:1745:3: () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' )
            {
            // InternalLogo.g:1745:3: ()
            // InternalLogo.g:1746:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBoolValueAccess().getBoolValueAction_0(),
              					current);
              			
            }

            }

            // InternalLogo.g:1752:3: ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            else if ( (LA23_0==38) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalLogo.g:1753:4: ( (lv_value_1_0= 'true' ) )
                    {
                    // InternalLogo.g:1753:4: ( (lv_value_1_0= 'true' ) )
                    // InternalLogo.g:1754:5: (lv_value_1_0= 'true' )
                    {
                    // InternalLogo.g:1754:5: (lv_value_1_0= 'true' )
                    // InternalLogo.g:1755:6: lv_value_1_0= 'true'
                    {
                    lv_value_1_0=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getBoolValueAccess().getValueTrueKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBoolValueRule());
                      						}
                      						setWithLastConsumed(current, "value", true, "true");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLogo.g:1768:4: otherlv_2= 'false'
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getBoolValueAccess().getFalseKeyword_1_1());
                      			
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
    // $ANTLR end "ruleBoolValue"

    // $ANTLR start synpred1_InternalLogo
    public final void synpred1_InternalLogo_fragment() throws RecognitionException {   
        // InternalLogo.g:1166:4: ( ( ( ruleEqualsGreaterLower ) ) )
        // InternalLogo.g:1166:5: ( ( ruleEqualsGreaterLower ) )
        {
        // InternalLogo.g:1166:5: ( ( ruleEqualsGreaterLower ) )
        // InternalLogo.g:1167:5: ( ruleEqualsGreaterLower )
        {
        // InternalLogo.g:1167:5: ( ruleEqualsGreaterLower )
        // InternalLogo.g:1168:6: ruleEqualsGreaterLower
        {
        pushFollow(FOLLOW_2);
        ruleEqualsGreaterLower();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred1_InternalLogo

    // $ANTLR start synpred2_InternalLogo
    public final void synpred2_InternalLogo_fragment() throws RecognitionException {   
        // InternalLogo.g:1235:4: ( ( ( ruleEqualsGreaterLower ) ) )
        // InternalLogo.g:1235:5: ( ( ruleEqualsGreaterLower ) )
        {
        // InternalLogo.g:1235:5: ( ( ruleEqualsGreaterLower ) )
        // InternalLogo.g:1236:5: ( ruleEqualsGreaterLower )
        {
        // InternalLogo.g:1236:5: ( ruleEqualsGreaterLower )
        // InternalLogo.g:1237:6: ruleEqualsGreaterLower
        {
        pushFollow(FOLLOW_2);
        ruleEqualsGreaterLower();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred2_InternalLogo

    // $ANTLR start synpred3_InternalLogo
    public final void synpred3_InternalLogo_fragment() throws RecognitionException {   
        // InternalLogo.g:1380:4: ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleMultDiv ) ) ) )
        // InternalLogo.g:1380:5: ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleMultDiv ) ) )
        {
        // InternalLogo.g:1380:5: ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleMultDiv ) ) )
        // InternalLogo.g:1381:5: ( ( () '+' ) | ( () '-' ) ) ( ( ruleMultDiv ) )
        {
        // InternalLogo.g:1381:5: ( ( () '+' ) | ( () '-' ) )
        int alt24=2;
        int LA24_0 = input.LA(1);

        if ( (LA24_0==30) ) {
            alt24=1;
        }
        else if ( (LA24_0==31) ) {
            alt24=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 24, 0, input);

            throw nvae;
        }
        switch (alt24) {
            case 1 :
                // InternalLogo.g:1382:6: ( () '+' )
                {
                // InternalLogo.g:1382:6: ( () '+' )
                // InternalLogo.g:1383:7: () '+'
                {
                // InternalLogo.g:1383:7: ()
                // InternalLogo.g:1384:7: 
                {
                }

                match(input,30,FOLLOW_13); if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalLogo.g:1388:6: ( () '-' )
                {
                // InternalLogo.g:1388:6: ( () '-' )
                // InternalLogo.g:1389:7: () '-'
                {
                // InternalLogo.g:1389:7: ()
                // InternalLogo.g:1390:7: 
                {
                }

                match(input,31,FOLLOW_13); if (state.failed) return ;

                }


                }
                break;

        }

        // InternalLogo.g:1394:5: ( ( ruleMultDiv ) )
        // InternalLogo.g:1395:6: ( ruleMultDiv )
        {
        // InternalLogo.g:1395:6: ( ruleMultDiv )
        // InternalLogo.g:1396:7: ruleMultDiv
        {
        pushFollow(FOLLOW_2);
        ruleMultDiv();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalLogo

    // Delegated rules

    public final boolean synpred1_InternalLogo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalLogo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalLogo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalLogo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalLogo() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalLogo_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String dfa_1s = "\33\uffff";
    static final String dfa_2s = "\1\1\32\uffff";
    static final String dfa_3s = "\1\4\17\uffff\7\0\4\uffff";
    static final String dfa_4s = "\1\46\17\uffff\7\0\4\uffff";
    static final String dfa_5s = "\1\uffff\1\2\30\uffff\1\1";
    static final String dfa_6s = "\20\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\4\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\20\5\uffff\1\23\17\1\4\uffff\1\26\2\uffff\1\24\1\1\1\25\1\21\1\22",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 1165:3: ( ( ( ( ruleEqualsGreaterLower ) ) )=> ( (lv_expressions_2_0= ruleEqualsGreaterLower ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_16 = input.LA(1);

                         
                        int index14_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalLogo()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_16);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_17 = input.LA(1);

                         
                        int index14_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalLogo()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_17);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_18 = input.LA(1);

                         
                        int index14_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalLogo()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_18);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_19 = input.LA(1);

                         
                        int index14_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalLogo()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_19);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_20 = input.LA(1);

                         
                        int index14_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalLogo()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_20);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_21 = input.LA(1);

                         
                        int index14_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalLogo()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_21);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_22 = input.LA(1);

                         
                        int index14_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalLogo()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_22);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 1234:3: ( ( ( ( ruleEqualsGreaterLower ) ) )=> ( (lv_expressions_2_0= ruleEqualsGreaterLower ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_16 = input.LA(1);

                         
                        int index15_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalLogo()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_16);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_17 = input.LA(1);

                         
                        int index15_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalLogo()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_17);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_18 = input.LA(1);

                         
                        int index15_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalLogo()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_18);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_19 = input.LA(1);

                         
                        int index15_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalLogo()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_19);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_20 = input.LA(1);

                         
                        int index15_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalLogo()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_20);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_21 = input.LA(1);

                         
                        int index15_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalLogo()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_21);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA15_22 = input.LA(1);

                         
                        int index15_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalLogo()) ) {s = 26;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_22);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\36\uffff";
    static final String dfa_9s = "\1\1\35\uffff";
    static final String dfa_10s = "\1\4\30\uffff\1\0\4\uffff";
    static final String dfa_11s = "\1\46\30\uffff\1\0\4\uffff";
    static final String dfa_12s = "\1\uffff\1\2\33\uffff\1\1";
    static final String dfa_13s = "\1\0\30\uffff\1\1\4\uffff}>";
    static final String[] dfa_14s = {
            "\2\1\5\uffff\23\1\1\35\1\31\2\uffff\5\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
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

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 1379:3: ( ( ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleMultDiv ) ) ) )=> ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_rightExpression_5_0= ruleMultDiv ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_0 = input.LA(1);

                         
                        int index19_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA19_0==EOF||(LA19_0>=RULE_ID && LA19_0<=RULE_INT)||(LA19_0>=11 && LA19_0<=29)||(LA19_0>=34 && LA19_0<=38)) ) {s = 1;}

                        else if ( (LA19_0==31) ) {s = 25;}

                        else if ( (LA19_0==30) && (synpred3_InternalLogo())) {s = 29;}

                         
                        input.seek(index19_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_25 = input.LA(1);

                         
                        int index19_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalLogo()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_25);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001EBF012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000007486000820L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001EFF810L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001EFF010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000007486000822L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001FBF010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000007486080820L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001EBF010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000007480000820L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000007480000822L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});

}