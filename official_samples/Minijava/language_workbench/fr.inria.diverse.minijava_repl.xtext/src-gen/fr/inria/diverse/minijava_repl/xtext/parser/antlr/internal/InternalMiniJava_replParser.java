package fr.inria.diverse.minijava_repl.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.inria.diverse.minijava_repl.xtext.services.MiniJava_replGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMiniJava_replParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'.'", "'.*'", "'abstract'", "'class'", "'extends'", "'implements'", "','", "'{'", "'}'", "'interface'", "'static'", "'('", "')'", "'='", "'System'", "'out'", "'println'", "'return'", "'if'", "'else'", "'while'", "'for'", "'['", "']'", "'int'", "'boolean'", "'String'", "'void'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'%'", "'+'", "'-'", "'*'", "'/'", "'length'", "'!'", "'\\'\\'\\''", "'true'", "'false'", "'this'", "'super'", "'null'", "'new'", "'private'", "'protected'", "'public'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
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
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMiniJava_replParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMiniJava_replParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMiniJava_replParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMiniJava_repl.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private MiniJava_replGrammarAccess grammarAccess;

        public InternalMiniJava_replParser(TokenStream input, MiniJava_replGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "EntryPoint";
       	}

       	@Override
       	protected MiniJava_replGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEntryPoint"
    // InternalMiniJava_repl.g:71:1: entryRuleEntryPoint returns [EObject current=null] : iv_ruleEntryPoint= ruleEntryPoint EOF ;
    public final EObject entryRuleEntryPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryPoint = null;


        try {
            // InternalMiniJava_repl.g:71:51: (iv_ruleEntryPoint= ruleEntryPoint EOF )
            // InternalMiniJava_repl.g:72:2: iv_ruleEntryPoint= ruleEntryPoint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryPointRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEntryPoint=ruleEntryPoint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryPoint; 
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
    // $ANTLR end "entryRuleEntryPoint"


    // $ANTLR start "ruleEntryPoint"
    // InternalMiniJava_repl.g:78:1: ruleEntryPoint returns [EObject current=null] : (this_InterpretableInstruction_0= ruleInterpretableInstruction | this_Interpreter_1= ruleInterpreter ) ;
    public final EObject ruleEntryPoint() throws RecognitionException {
        EObject current = null;

        EObject this_InterpretableInstruction_0 = null;

        EObject this_Interpreter_1 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:84:2: ( (this_InterpretableInstruction_0= ruleInterpretableInstruction | this_Interpreter_1= ruleInterpreter ) )
            // InternalMiniJava_repl.g:85:2: (this_InterpretableInstruction_0= ruleInterpretableInstruction | this_Interpreter_1= ruleInterpreter )
            {
            // InternalMiniJava_repl.g:85:2: (this_InterpretableInstruction_0= ruleInterpretableInstruction | this_Interpreter_1= ruleInterpreter )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||LA1_0==11||(LA1_0>=15 && LA1_0<=16)||LA1_0==20||(LA1_0>=22 && LA1_0<=24)||LA1_0==31||(LA1_0>=33 && LA1_0<=34)||(LA1_0>=37 && LA1_0<=40)||LA1_0==51||(LA1_0>=55 && LA1_0<=65)) ) {
                alt1=1;
            }
            else if ( (LA1_0==EOF) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMiniJava_repl.g:86:3: this_InterpretableInstruction_0= ruleInterpretableInstruction
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEntryPointAccess().getInterpretableInstructionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InterpretableInstruction_0=ruleInterpretableInstruction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InterpretableInstruction_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMiniJava_repl.g:98:3: this_Interpreter_1= ruleInterpreter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEntryPointAccess().getInterpreterParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Interpreter_1=ruleInterpreter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Interpreter_1;
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
    // $ANTLR end "ruleEntryPoint"


    // $ANTLR start "entryRuleInterpretableInstruction"
    // InternalMiniJava_repl.g:113:1: entryRuleInterpretableInstruction returns [EObject current=null] : iv_ruleInterpretableInstruction= ruleInterpretableInstruction EOF ;
    public final EObject entryRuleInterpretableInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterpretableInstruction = null;


        try {
            // InternalMiniJava_repl.g:113:65: (iv_ruleInterpretableInstruction= ruleInterpretableInstruction EOF )
            // InternalMiniJava_repl.g:114:2: iv_ruleInterpretableInstruction= ruleInterpretableInstruction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterpretableInstructionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInterpretableInstruction=ruleInterpretableInstruction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterpretableInstruction; 
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
    // $ANTLR end "entryRuleInterpretableInstruction"


    // $ANTLR start "ruleInterpretableInstruction"
    // InternalMiniJava_repl.g:120:1: ruleInterpretableInstruction returns [EObject current=null] : ( ( () ( (lv_original_1_0= ruleTypeDeclaration ) ) ) | ( () ( (lv_original_3_0= ruleImport ) ) ) | ( () ( (lv_original_5_0= ruleBlock ) ) ) | ( () ( (lv_original_7_0= ruleVariableDeclaration ) ) ) | ( () ( (lv_original_9_0= ruleAssignment ) ) ) | ( () ( (lv_original_11_0= ruleForStatement ) ) ) | ( () ( (lv_original_13_0= ruleIfStatement ) ) ) | ( () ( (lv_original_15_0= ruleWhileStatement ) ) ) | ( () ( (lv_original_17_0= ruleMethod ) ) ) | ( () ( (lv_original_19_0= ruleExpression ) ) ) ) ;
    public final EObject ruleInterpretableInstruction() throws RecognitionException {
        EObject current = null;

        EObject lv_original_1_0 = null;

        EObject lv_original_3_0 = null;

        EObject lv_original_5_0 = null;

        EObject lv_original_7_0 = null;

        EObject lv_original_9_0 = null;

        EObject lv_original_11_0 = null;

        EObject lv_original_13_0 = null;

        EObject lv_original_15_0 = null;

        EObject lv_original_17_0 = null;

        EObject lv_original_19_0 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:126:2: ( ( ( () ( (lv_original_1_0= ruleTypeDeclaration ) ) ) | ( () ( (lv_original_3_0= ruleImport ) ) ) | ( () ( (lv_original_5_0= ruleBlock ) ) ) | ( () ( (lv_original_7_0= ruleVariableDeclaration ) ) ) | ( () ( (lv_original_9_0= ruleAssignment ) ) ) | ( () ( (lv_original_11_0= ruleForStatement ) ) ) | ( () ( (lv_original_13_0= ruleIfStatement ) ) ) | ( () ( (lv_original_15_0= ruleWhileStatement ) ) ) | ( () ( (lv_original_17_0= ruleMethod ) ) ) | ( () ( (lv_original_19_0= ruleExpression ) ) ) ) )
            // InternalMiniJava_repl.g:127:2: ( ( () ( (lv_original_1_0= ruleTypeDeclaration ) ) ) | ( () ( (lv_original_3_0= ruleImport ) ) ) | ( () ( (lv_original_5_0= ruleBlock ) ) ) | ( () ( (lv_original_7_0= ruleVariableDeclaration ) ) ) | ( () ( (lv_original_9_0= ruleAssignment ) ) ) | ( () ( (lv_original_11_0= ruleForStatement ) ) ) | ( () ( (lv_original_13_0= ruleIfStatement ) ) ) | ( () ( (lv_original_15_0= ruleWhileStatement ) ) ) | ( () ( (lv_original_17_0= ruleMethod ) ) ) | ( () ( (lv_original_19_0= ruleExpression ) ) ) )
            {
            // InternalMiniJava_repl.g:127:2: ( ( () ( (lv_original_1_0= ruleTypeDeclaration ) ) ) | ( () ( (lv_original_3_0= ruleImport ) ) ) | ( () ( (lv_original_5_0= ruleBlock ) ) ) | ( () ( (lv_original_7_0= ruleVariableDeclaration ) ) ) | ( () ( (lv_original_9_0= ruleAssignment ) ) ) | ( () ( (lv_original_11_0= ruleForStatement ) ) ) | ( () ( (lv_original_13_0= ruleIfStatement ) ) ) | ( () ( (lv_original_15_0= ruleWhileStatement ) ) ) | ( () ( (lv_original_17_0= ruleMethod ) ) ) | ( () ( (lv_original_19_0= ruleExpression ) ) ) )
            int alt2=10;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalMiniJava_repl.g:128:3: ( () ( (lv_original_1_0= ruleTypeDeclaration ) ) )
                    {
                    // InternalMiniJava_repl.g:128:3: ( () ( (lv_original_1_0= ruleTypeDeclaration ) ) )
                    // InternalMiniJava_repl.g:129:4: () ( (lv_original_1_0= ruleTypeDeclaration ) )
                    {
                    // InternalMiniJava_repl.g:129:4: ()
                    // InternalMiniJava_repl.g:130:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInterpretableInstructionAccess().getTypeDeclaration_InstructionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMiniJava_repl.g:139:4: ( (lv_original_1_0= ruleTypeDeclaration ) )
                    // InternalMiniJava_repl.g:140:5: (lv_original_1_0= ruleTypeDeclaration )
                    {
                    // InternalMiniJava_repl.g:140:5: (lv_original_1_0= ruleTypeDeclaration )
                    // InternalMiniJava_repl.g:141:6: lv_original_1_0= ruleTypeDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInterpretableInstructionAccess().getOriginalTypeDeclarationParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_original_1_0=ruleTypeDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInterpretableInstructionRule());
                      						}
                      						set(
                      							current,
                      							"original",
                      							lv_original_1_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.TypeDeclaration");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava_repl.g:160:3: ( () ( (lv_original_3_0= ruleImport ) ) )
                    {
                    // InternalMiniJava_repl.g:160:3: ( () ( (lv_original_3_0= ruleImport ) ) )
                    // InternalMiniJava_repl.g:161:4: () ( (lv_original_3_0= ruleImport ) )
                    {
                    // InternalMiniJava_repl.g:161:4: ()
                    // InternalMiniJava_repl.g:162:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInterpretableInstructionAccess().getImport_InstructionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMiniJava_repl.g:171:4: ( (lv_original_3_0= ruleImport ) )
                    // InternalMiniJava_repl.g:172:5: (lv_original_3_0= ruleImport )
                    {
                    // InternalMiniJava_repl.g:172:5: (lv_original_3_0= ruleImport )
                    // InternalMiniJava_repl.g:173:6: lv_original_3_0= ruleImport
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInterpretableInstructionAccess().getOriginalImportParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_original_3_0=ruleImport();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInterpretableInstructionRule());
                      						}
                      						set(
                      							current,
                      							"original",
                      							lv_original_3_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.Import");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava_repl.g:192:3: ( () ( (lv_original_5_0= ruleBlock ) ) )
                    {
                    // InternalMiniJava_repl.g:192:3: ( () ( (lv_original_5_0= ruleBlock ) ) )
                    // InternalMiniJava_repl.g:193:4: () ( (lv_original_5_0= ruleBlock ) )
                    {
                    // InternalMiniJava_repl.g:193:4: ()
                    // InternalMiniJava_repl.g:194:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInterpretableInstructionAccess().getBlock_InstructionAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMiniJava_repl.g:203:4: ( (lv_original_5_0= ruleBlock ) )
                    // InternalMiniJava_repl.g:204:5: (lv_original_5_0= ruleBlock )
                    {
                    // InternalMiniJava_repl.g:204:5: (lv_original_5_0= ruleBlock )
                    // InternalMiniJava_repl.g:205:6: lv_original_5_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInterpretableInstructionAccess().getOriginalBlockParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_original_5_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInterpretableInstructionRule());
                      						}
                      						set(
                      							current,
                      							"original",
                      							lv_original_5_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.Block");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava_repl.g:224:3: ( () ( (lv_original_7_0= ruleVariableDeclaration ) ) )
                    {
                    // InternalMiniJava_repl.g:224:3: ( () ( (lv_original_7_0= ruleVariableDeclaration ) ) )
                    // InternalMiniJava_repl.g:225:4: () ( (lv_original_7_0= ruleVariableDeclaration ) )
                    {
                    // InternalMiniJava_repl.g:225:4: ()
                    // InternalMiniJava_repl.g:226:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInterpretableInstructionAccess().getVariableDeclaration_InstructionAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMiniJava_repl.g:235:4: ( (lv_original_7_0= ruleVariableDeclaration ) )
                    // InternalMiniJava_repl.g:236:5: (lv_original_7_0= ruleVariableDeclaration )
                    {
                    // InternalMiniJava_repl.g:236:5: (lv_original_7_0= ruleVariableDeclaration )
                    // InternalMiniJava_repl.g:237:6: lv_original_7_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInterpretableInstructionAccess().getOriginalVariableDeclarationParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_original_7_0=ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInterpretableInstructionRule());
                      						}
                      						set(
                      							current,
                      							"original",
                      							lv_original_7_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.VariableDeclaration");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMiniJava_repl.g:256:3: ( () ( (lv_original_9_0= ruleAssignment ) ) )
                    {
                    // InternalMiniJava_repl.g:256:3: ( () ( (lv_original_9_0= ruleAssignment ) ) )
                    // InternalMiniJava_repl.g:257:4: () ( (lv_original_9_0= ruleAssignment ) )
                    {
                    // InternalMiniJava_repl.g:257:4: ()
                    // InternalMiniJava_repl.g:258:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInterpretableInstructionAccess().getAssignment_InstructionAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMiniJava_repl.g:267:4: ( (lv_original_9_0= ruleAssignment ) )
                    // InternalMiniJava_repl.g:268:5: (lv_original_9_0= ruleAssignment )
                    {
                    // InternalMiniJava_repl.g:268:5: (lv_original_9_0= ruleAssignment )
                    // InternalMiniJava_repl.g:269:6: lv_original_9_0= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInterpretableInstructionAccess().getOriginalAssignmentParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_original_9_0=ruleAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInterpretableInstructionRule());
                      						}
                      						set(
                      							current,
                      							"original",
                      							lv_original_9_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.Assignment");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalMiniJava_repl.g:288:3: ( () ( (lv_original_11_0= ruleForStatement ) ) )
                    {
                    // InternalMiniJava_repl.g:288:3: ( () ( (lv_original_11_0= ruleForStatement ) ) )
                    // InternalMiniJava_repl.g:289:4: () ( (lv_original_11_0= ruleForStatement ) )
                    {
                    // InternalMiniJava_repl.g:289:4: ()
                    // InternalMiniJava_repl.g:290:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInterpretableInstructionAccess().getForStatement_InstructionAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMiniJava_repl.g:299:4: ( (lv_original_11_0= ruleForStatement ) )
                    // InternalMiniJava_repl.g:300:5: (lv_original_11_0= ruleForStatement )
                    {
                    // InternalMiniJava_repl.g:300:5: (lv_original_11_0= ruleForStatement )
                    // InternalMiniJava_repl.g:301:6: lv_original_11_0= ruleForStatement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInterpretableInstructionAccess().getOriginalForStatementParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_original_11_0=ruleForStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInterpretableInstructionRule());
                      						}
                      						set(
                      							current,
                      							"original",
                      							lv_original_11_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.ForStatement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalMiniJava_repl.g:320:3: ( () ( (lv_original_13_0= ruleIfStatement ) ) )
                    {
                    // InternalMiniJava_repl.g:320:3: ( () ( (lv_original_13_0= ruleIfStatement ) ) )
                    // InternalMiniJava_repl.g:321:4: () ( (lv_original_13_0= ruleIfStatement ) )
                    {
                    // InternalMiniJava_repl.g:321:4: ()
                    // InternalMiniJava_repl.g:322:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInterpretableInstructionAccess().getIfStatement_InstructionAction_6_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMiniJava_repl.g:331:4: ( (lv_original_13_0= ruleIfStatement ) )
                    // InternalMiniJava_repl.g:332:5: (lv_original_13_0= ruleIfStatement )
                    {
                    // InternalMiniJava_repl.g:332:5: (lv_original_13_0= ruleIfStatement )
                    // InternalMiniJava_repl.g:333:6: lv_original_13_0= ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInterpretableInstructionAccess().getOriginalIfStatementParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_original_13_0=ruleIfStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInterpretableInstructionRule());
                      						}
                      						set(
                      							current,
                      							"original",
                      							lv_original_13_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.IfStatement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalMiniJava_repl.g:352:3: ( () ( (lv_original_15_0= ruleWhileStatement ) ) )
                    {
                    // InternalMiniJava_repl.g:352:3: ( () ( (lv_original_15_0= ruleWhileStatement ) ) )
                    // InternalMiniJava_repl.g:353:4: () ( (lv_original_15_0= ruleWhileStatement ) )
                    {
                    // InternalMiniJava_repl.g:353:4: ()
                    // InternalMiniJava_repl.g:354:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInterpretableInstructionAccess().getWhileStatement_InstructionAction_7_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMiniJava_repl.g:363:4: ( (lv_original_15_0= ruleWhileStatement ) )
                    // InternalMiniJava_repl.g:364:5: (lv_original_15_0= ruleWhileStatement )
                    {
                    // InternalMiniJava_repl.g:364:5: (lv_original_15_0= ruleWhileStatement )
                    // InternalMiniJava_repl.g:365:6: lv_original_15_0= ruleWhileStatement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInterpretableInstructionAccess().getOriginalWhileStatementParserRuleCall_7_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_original_15_0=ruleWhileStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInterpretableInstructionRule());
                      						}
                      						set(
                      							current,
                      							"original",
                      							lv_original_15_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.WhileStatement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalMiniJava_repl.g:384:3: ( () ( (lv_original_17_0= ruleMethod ) ) )
                    {
                    // InternalMiniJava_repl.g:384:3: ( () ( (lv_original_17_0= ruleMethod ) ) )
                    // InternalMiniJava_repl.g:385:4: () ( (lv_original_17_0= ruleMethod ) )
                    {
                    // InternalMiniJava_repl.g:385:4: ()
                    // InternalMiniJava_repl.g:386:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInterpretableInstructionAccess().getMethod_InstructionAction_8_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMiniJava_repl.g:395:4: ( (lv_original_17_0= ruleMethod ) )
                    // InternalMiniJava_repl.g:396:5: (lv_original_17_0= ruleMethod )
                    {
                    // InternalMiniJava_repl.g:396:5: (lv_original_17_0= ruleMethod )
                    // InternalMiniJava_repl.g:397:6: lv_original_17_0= ruleMethod
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInterpretableInstructionAccess().getOriginalMethodParserRuleCall_8_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_original_17_0=ruleMethod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInterpretableInstructionRule());
                      						}
                      						set(
                      							current,
                      							"original",
                      							lv_original_17_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.Method");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalMiniJava_repl.g:416:3: ( () ( (lv_original_19_0= ruleExpression ) ) )
                    {
                    // InternalMiniJava_repl.g:416:3: ( () ( (lv_original_19_0= ruleExpression ) ) )
                    // InternalMiniJava_repl.g:417:4: () ( (lv_original_19_0= ruleExpression ) )
                    {
                    // InternalMiniJava_repl.g:417:4: ()
                    // InternalMiniJava_repl.g:418:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getInterpretableInstructionAccess().getExpression_InstructionAction_9_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMiniJava_repl.g:427:4: ( (lv_original_19_0= ruleExpression ) )
                    // InternalMiniJava_repl.g:428:5: (lv_original_19_0= ruleExpression )
                    {
                    // InternalMiniJava_repl.g:428:5: (lv_original_19_0= ruleExpression )
                    // InternalMiniJava_repl.g:429:6: lv_original_19_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInterpretableInstructionAccess().getOriginalExpressionParserRuleCall_9_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_original_19_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getInterpretableInstructionRule());
                      						}
                      						set(
                      							current,
                      							"original",
                      							lv_original_19_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.Expression");
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
    // $ANTLR end "ruleInterpretableInstruction"


    // $ANTLR start "entryRuleInterpreter"
    // InternalMiniJava_repl.g:451:1: entryRuleInterpreter returns [EObject current=null] : iv_ruleInterpreter= ruleInterpreter EOF ;
    public final EObject entryRuleInterpreter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterpreter = null;


        try {
            // InternalMiniJava_repl.g:451:52: (iv_ruleInterpreter= ruleInterpreter EOF )
            // InternalMiniJava_repl.g:452:2: iv_ruleInterpreter= ruleInterpreter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterpreterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInterpreter=ruleInterpreter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterpreter; 
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
    // $ANTLR end "entryRuleInterpreter"


    // $ANTLR start "ruleInterpreter"
    // InternalMiniJava_repl.g:458:1: ruleInterpreter returns [EObject current=null] : () ;
    public final EObject ruleInterpreter() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalMiniJava_repl.g:464:2: ( () )
            // InternalMiniJava_repl.g:465:2: ()
            {
            // InternalMiniJava_repl.g:465:2: ()
            // InternalMiniJava_repl.g:466:3: 
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			current = forceCreateModelElement(
              				grammarAccess.getInterpreterAccess().getInterpreterAction(),
              				current);
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterpreter"


    // $ANTLR start "entryRuleImport"
    // InternalMiniJava_repl.g:478:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalMiniJava_repl.g:478:47: (iv_ruleImport= ruleImport EOF )
            // InternalMiniJava_repl.g:479:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalMiniJava_repl.g:485:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:491:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) )
            // InternalMiniJava_repl.g:492:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            {
            // InternalMiniJava_repl.g:492:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            // InternalMiniJava_repl.g:493:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
              		
            }
            // InternalMiniJava_repl.g:497:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalMiniJava_repl.g:498:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalMiniJava_repl.g:498:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalMiniJava_repl.g:499:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getImportRule());
              					}
              					set(
              						current,
              						"importedNamespace",
              						lv_importedNamespace_1_0,
              						"org.tetrabox.minijava.xtext.MiniJava.QualifiedNameWithWildcard");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getImportAccess().getSemicolonKeyword_2());
              		
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMiniJava_repl.g:524:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalMiniJava_repl.g:524:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalMiniJava_repl.g:525:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMiniJava_repl.g:531:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalMiniJava_repl.g:537:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalMiniJava_repl.g:538:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalMiniJava_repl.g:538:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalMiniJava_repl.g:539:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalMiniJava_repl.g:546:3: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMiniJava_repl.g:547:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalMiniJava_repl.g:564:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalMiniJava_repl.g:564:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalMiniJava_repl.g:565:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalMiniJava_repl.g:571:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:577:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalMiniJava_repl.g:578:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalMiniJava_repl.g:578:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalMiniJava_repl.g:579:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_6);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniJava_repl.g:589:3: (kw= '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMiniJava_repl.g:590:4: kw= '.*'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                      			
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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleTypeDeclaration"
    // InternalMiniJava_repl.g:600:1: entryRuleTypeDeclaration returns [EObject current=null] : iv_ruleTypeDeclaration= ruleTypeDeclaration EOF ;
    public final EObject entryRuleTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDeclaration = null;


        try {
            // InternalMiniJava_repl.g:600:56: (iv_ruleTypeDeclaration= ruleTypeDeclaration EOF )
            // InternalMiniJava_repl.g:601:2: iv_ruleTypeDeclaration= ruleTypeDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeDeclaration=ruleTypeDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDeclaration; 
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
    // $ANTLR end "entryRuleTypeDeclaration"


    // $ANTLR start "ruleTypeDeclaration"
    // InternalMiniJava_repl.g:607:1: ruleTypeDeclaration returns [EObject current=null] : (this_Clazz_0= ruleClazz | this_Interface_1= ruleInterface ) ;
    public final EObject ruleTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Clazz_0 = null;

        EObject this_Interface_1 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:613:2: ( (this_Clazz_0= ruleClazz | this_Interface_1= ruleInterface ) )
            // InternalMiniJava_repl.g:614:2: (this_Clazz_0= ruleClazz | this_Interface_1= ruleInterface )
            {
            // InternalMiniJava_repl.g:614:2: (this_Clazz_0= ruleClazz | this_Interface_1= ruleInterface )
            int alt5=2;
            switch ( input.LA(1) ) {
            case 63:
                {
                int LA5_1 = input.LA(2);

                if ( ((LA5_1>=15 && LA5_1<=16)) ) {
                    alt5=1;
                }
                else if ( (LA5_1==22) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case 64:
                {
                int LA5_2 = input.LA(2);

                if ( ((LA5_2>=15 && LA5_2<=16)) ) {
                    alt5=1;
                }
                else if ( (LA5_2==22) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case 65:
                {
                int LA5_3 = input.LA(2);

                if ( ((LA5_3>=15 && LA5_3<=16)) ) {
                    alt5=1;
                }
                else if ( (LA5_3==22) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;
                }
                }
                break;
            case 15:
            case 16:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMiniJava_repl.g:615:3: this_Clazz_0= ruleClazz
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeDeclarationAccess().getClazzParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Clazz_0=ruleClazz();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Clazz_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMiniJava_repl.g:627:3: this_Interface_1= ruleInterface
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeDeclarationAccess().getInterfaceParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Interface_1=ruleInterface();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Interface_1;
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
    // $ANTLR end "ruleTypeDeclaration"


    // $ANTLR start "entryRuleClazz"
    // InternalMiniJava_repl.g:642:1: entryRuleClazz returns [EObject current=null] : iv_ruleClazz= ruleClazz EOF ;
    public final EObject entryRuleClazz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClazz = null;


        try {
            // InternalMiniJava_repl.g:642:46: (iv_ruleClazz= ruleClazz EOF )
            // InternalMiniJava_repl.g:643:2: iv_ruleClazz= ruleClazz EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClazzRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClazz=ruleClazz();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClazz; 
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
    // $ANTLR end "entryRuleClazz"


    // $ANTLR start "ruleClazz"
    // InternalMiniJava_repl.g:649:1: ruleClazz returns [EObject current=null] : ( ( (lv_accessLevel_0_0= ruleAccessLevel ) )? ( (lv_isabstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_6= 'implements' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )* otherlv_12= '}' ) ;
    public final EObject ruleClazz() throws RecognitionException {
        EObject current = null;

        Token lv_isabstract_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Enumerator lv_accessLevel_0_0 = null;

        EObject lv_members_11_0 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:655:2: ( ( ( (lv_accessLevel_0_0= ruleAccessLevel ) )? ( (lv_isabstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_6= 'implements' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )* otherlv_12= '}' ) )
            // InternalMiniJava_repl.g:656:2: ( ( (lv_accessLevel_0_0= ruleAccessLevel ) )? ( (lv_isabstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_6= 'implements' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )* otherlv_12= '}' )
            {
            // InternalMiniJava_repl.g:656:2: ( ( (lv_accessLevel_0_0= ruleAccessLevel ) )? ( (lv_isabstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_6= 'implements' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )* otherlv_12= '}' )
            // InternalMiniJava_repl.g:657:3: ( (lv_accessLevel_0_0= ruleAccessLevel ) )? ( (lv_isabstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_6= 'implements' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_10= '{' ( (lv_members_11_0= ruleMember ) )* otherlv_12= '}'
            {
            // InternalMiniJava_repl.g:657:3: ( (lv_accessLevel_0_0= ruleAccessLevel ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=63 && LA6_0<=65)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMiniJava_repl.g:658:4: (lv_accessLevel_0_0= ruleAccessLevel )
                    {
                    // InternalMiniJava_repl.g:658:4: (lv_accessLevel_0_0= ruleAccessLevel )
                    // InternalMiniJava_repl.g:659:5: lv_accessLevel_0_0= ruleAccessLevel
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getClazzAccess().getAccessLevelAccessLevelEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_7);
                    lv_accessLevel_0_0=ruleAccessLevel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getClazzRule());
                      					}
                      					set(
                      						current,
                      						"accessLevel",
                      						lv_accessLevel_0_0,
                      						"org.tetrabox.minijava.xtext.MiniJava.AccessLevel");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMiniJava_repl.g:676:3: ( (lv_isabstract_1_0= 'abstract' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMiniJava_repl.g:677:4: (lv_isabstract_1_0= 'abstract' )
                    {
                    // InternalMiniJava_repl.g:677:4: (lv_isabstract_1_0= 'abstract' )
                    // InternalMiniJava_repl.g:678:5: lv_isabstract_1_0= 'abstract'
                    {
                    lv_isabstract_1_0=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isabstract_1_0, grammarAccess.getClazzAccess().getIsabstractAbstractKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getClazzRule());
                      					}
                      					setWithLastConsumed(current, "isabstract", lv_isabstract_1_0 != null, "abstract");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getClazzAccess().getClassKeyword_2());
              		
            }
            // InternalMiniJava_repl.g:694:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMiniJava_repl.g:695:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMiniJava_repl.g:695:4: (lv_name_3_0= RULE_ID )
            // InternalMiniJava_repl.g:696:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getClazzAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getClazzRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalMiniJava_repl.g:712:3: (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMiniJava_repl.g:713:4: otherlv_4= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getClazzAccess().getExtendsKeyword_4_0());
                      			
                    }
                    // InternalMiniJava_repl.g:717:4: ( ( ruleQualifiedName ) )
                    // InternalMiniJava_repl.g:718:5: ( ruleQualifiedName )
                    {
                    // InternalMiniJava_repl.g:718:5: ( ruleQualifiedName )
                    // InternalMiniJava_repl.g:719:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getClazzRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getClazzAccess().getSuperClassClazzCrossReference_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalMiniJava_repl.g:737:3: (otherlv_6= 'implements' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMiniJava_repl.g:738:4: otherlv_6= 'implements' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getClazzAccess().getImplementsKeyword_5_0());
                      			
                    }
                    // InternalMiniJava_repl.g:742:4: ( ( ruleQualifiedName ) )
                    // InternalMiniJava_repl.g:743:5: ( ruleQualifiedName )
                    {
                    // InternalMiniJava_repl.g:743:5: ( ruleQualifiedName )
                    // InternalMiniJava_repl.g:744:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getClazzRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getClazzAccess().getImplementzInterfaceCrossReference_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMiniJava_repl.g:761:4: (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==19) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMiniJava_repl.g:762:5: otherlv_8= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_8=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_8, grammarAccess.getClazzAccess().getCommaKeyword_5_2_0());
                    	      				
                    	    }
                    	    // InternalMiniJava_repl.g:766:5: ( ( ruleQualifiedName ) )
                    	    // InternalMiniJava_repl.g:767:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalMiniJava_repl.g:767:6: ( ruleQualifiedName )
                    	    // InternalMiniJava_repl.g:768:7: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getClazzRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getClazzAccess().getImplementzInterfaceCrossReference_5_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_11);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getClazzAccess().getLeftCurlyBracketKeyword_6());
              		
            }
            // InternalMiniJava_repl.g:791:3: ( (lv_members_11_0= ruleMember ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==15||LA11_0==23||(LA11_0>=37 && LA11_0<=40)||(LA11_0>=63 && LA11_0<=65)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMiniJava_repl.g:792:4: (lv_members_11_0= ruleMember )
            	    {
            	    // InternalMiniJava_repl.g:792:4: (lv_members_11_0= ruleMember )
            	    // InternalMiniJava_repl.g:793:5: lv_members_11_0= ruleMember
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getClazzAccess().getMembersMemberParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_members_11_0=ruleMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getClazzRule());
            	      					}
            	      					add(
            	      						current,
            	      						"members",
            	      						lv_members_11_0,
            	      						"org.tetrabox.minijava.xtext.MiniJava.Member");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_12=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getClazzAccess().getRightCurlyBracketKeyword_8());
              		
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
    // $ANTLR end "ruleClazz"


    // $ANTLR start "entryRuleInterface"
    // InternalMiniJava_repl.g:818:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalMiniJava_repl.g:818:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalMiniJava_repl.g:819:2: iv_ruleInterface= ruleInterface EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInterface=ruleInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterface; 
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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalMiniJava_repl.g:825:1: ruleInterface returns [EObject current=null] : ( ( (lv_accessLevel_0_0= ruleAccessLevel ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_accessLevel_0_0 = null;

        EObject lv_members_8_0 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:831:2: ( ( ( (lv_accessLevel_0_0= ruleAccessLevel ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' ) )
            // InternalMiniJava_repl.g:832:2: ( ( (lv_accessLevel_0_0= ruleAccessLevel ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' )
            {
            // InternalMiniJava_repl.g:832:2: ( ( (lv_accessLevel_0_0= ruleAccessLevel ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' )
            // InternalMiniJava_repl.g:833:3: ( (lv_accessLevel_0_0= ruleAccessLevel ) )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}'
            {
            // InternalMiniJava_repl.g:833:3: ( (lv_accessLevel_0_0= ruleAccessLevel ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=63 && LA12_0<=65)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMiniJava_repl.g:834:4: (lv_accessLevel_0_0= ruleAccessLevel )
                    {
                    // InternalMiniJava_repl.g:834:4: (lv_accessLevel_0_0= ruleAccessLevel )
                    // InternalMiniJava_repl.g:835:5: lv_accessLevel_0_0= ruleAccessLevel
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getInterfaceAccess().getAccessLevelAccessLevelEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_13);
                    lv_accessLevel_0_0=ruleAccessLevel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getInterfaceRule());
                      					}
                      					set(
                      						current,
                      						"accessLevel",
                      						lv_accessLevel_0_0,
                      						"org.tetrabox.minijava.xtext.MiniJava.AccessLevel");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getInterfaceKeyword_1());
              		
            }
            // InternalMiniJava_repl.g:856:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMiniJava_repl.g:857:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMiniJava_repl.g:857:4: (lv_name_2_0= RULE_ID )
            // InternalMiniJava_repl.g:858:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInterfaceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalMiniJava_repl.g:874:3: (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMiniJava_repl.g:875:4: otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getExtendsKeyword_3_0());
                      			
                    }
                    // InternalMiniJava_repl.g:879:4: ( ( ruleQualifiedName ) )
                    // InternalMiniJava_repl.g:880:5: ( ruleQualifiedName )
                    {
                    // InternalMiniJava_repl.g:880:5: ( ruleQualifiedName )
                    // InternalMiniJava_repl.g:881:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getInterfaceRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getInterfaceAccess().getImplementzInterfaceCrossReference_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMiniJava_repl.g:898:4: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==19) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalMiniJava_repl.g:899:5: otherlv_5= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getInterfaceAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalMiniJava_repl.g:903:5: ( ( ruleQualifiedName ) )
                    	    // InternalMiniJava_repl.g:904:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalMiniJava_repl.g:904:6: ( ruleQualifiedName )
                    	    // InternalMiniJava_repl.g:905:7: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							/* */
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getInterfaceRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getInterfaceAccess().getImplementzInterfaceCrossReference_3_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_11);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalMiniJava_repl.g:928:3: ( (lv_members_8_0= ruleMember ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==15||LA15_0==23||(LA15_0>=37 && LA15_0<=40)||(LA15_0>=63 && LA15_0<=65)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMiniJava_repl.g:929:4: (lv_members_8_0= ruleMember )
            	    {
            	    // InternalMiniJava_repl.g:929:4: (lv_members_8_0= ruleMember )
            	    // InternalMiniJava_repl.g:930:5: lv_members_8_0= ruleMember
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getInterfaceAccess().getMembersMemberParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_members_8_0=ruleMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getInterfaceRule());
            	      					}
            	      					add(
            	      						current,
            	      						"members",
            	      						lv_members_8_0,
            	      						"org.tetrabox.minijava.xtext.MiniJava.Member");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_9=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_6());
              		
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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleMember"
    // InternalMiniJava_repl.g:955:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalMiniJava_repl.g:955:47: (iv_ruleMember= ruleMember EOF )
            // InternalMiniJava_repl.g:956:2: iv_ruleMember= ruleMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMember=ruleMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMember; 
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
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalMiniJava_repl.g:962:1: ruleMember returns [EObject current=null] : (this_Field_0= ruleField | this_Method_1= ruleMethod ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_Method_1 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:968:2: ( (this_Field_0= ruleField | this_Method_1= ruleMethod ) )
            // InternalMiniJava_repl.g:969:2: (this_Field_0= ruleField | this_Method_1= ruleMethod )
            {
            // InternalMiniJava_repl.g:969:2: (this_Field_0= ruleField | this_Method_1= ruleMethod )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalMiniJava_repl.g:970:3: this_Field_0= ruleField
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMemberAccess().getFieldParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Field_0=ruleField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Field_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMiniJava_repl.g:982:3: this_Method_1= ruleMethod
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMemberAccess().getMethodParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Method_1=ruleMethod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Method_1;
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
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleMethod"
    // InternalMiniJava_repl.g:997:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalMiniJava_repl.g:997:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalMiniJava_repl.g:998:2: iv_ruleMethod= ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethod; 
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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalMiniJava_repl.g:1004:1: ruleMethod returns [EObject current=null] : ( ( (lv_access_0_0= ruleAccessLevel ) )? ( (lv_isabstract_1_0= 'abstract' ) )? ( (lv_isstatic_2_0= 'static' ) )? ( (lv_typeRef_3_0= ruleTypeRef ) ) ( (lv_name_4_0= RULE_ID ) )? otherlv_5= '(' ( ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* )? otherlv_9= ')' ( ( (lv_body_10_0= ruleBlock ) ) | otherlv_11= ';' ) ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_isabstract_1_0=null;
        Token lv_isstatic_2_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_access_0_0 = null;

        EObject lv_typeRef_3_0 = null;

        EObject lv_params_6_0 = null;

        EObject lv_params_8_0 = null;

        EObject lv_body_10_0 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:1010:2: ( ( ( (lv_access_0_0= ruleAccessLevel ) )? ( (lv_isabstract_1_0= 'abstract' ) )? ( (lv_isstatic_2_0= 'static' ) )? ( (lv_typeRef_3_0= ruleTypeRef ) ) ( (lv_name_4_0= RULE_ID ) )? otherlv_5= '(' ( ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* )? otherlv_9= ')' ( ( (lv_body_10_0= ruleBlock ) ) | otherlv_11= ';' ) ) )
            // InternalMiniJava_repl.g:1011:2: ( ( (lv_access_0_0= ruleAccessLevel ) )? ( (lv_isabstract_1_0= 'abstract' ) )? ( (lv_isstatic_2_0= 'static' ) )? ( (lv_typeRef_3_0= ruleTypeRef ) ) ( (lv_name_4_0= RULE_ID ) )? otherlv_5= '(' ( ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* )? otherlv_9= ')' ( ( (lv_body_10_0= ruleBlock ) ) | otherlv_11= ';' ) )
            {
            // InternalMiniJava_repl.g:1011:2: ( ( (lv_access_0_0= ruleAccessLevel ) )? ( (lv_isabstract_1_0= 'abstract' ) )? ( (lv_isstatic_2_0= 'static' ) )? ( (lv_typeRef_3_0= ruleTypeRef ) ) ( (lv_name_4_0= RULE_ID ) )? otherlv_5= '(' ( ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* )? otherlv_9= ')' ( ( (lv_body_10_0= ruleBlock ) ) | otherlv_11= ';' ) )
            // InternalMiniJava_repl.g:1012:3: ( (lv_access_0_0= ruleAccessLevel ) )? ( (lv_isabstract_1_0= 'abstract' ) )? ( (lv_isstatic_2_0= 'static' ) )? ( (lv_typeRef_3_0= ruleTypeRef ) ) ( (lv_name_4_0= RULE_ID ) )? otherlv_5= '(' ( ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* )? otherlv_9= ')' ( ( (lv_body_10_0= ruleBlock ) ) | otherlv_11= ';' )
            {
            // InternalMiniJava_repl.g:1012:3: ( (lv_access_0_0= ruleAccessLevel ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=63 && LA17_0<=65)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMiniJava_repl.g:1013:4: (lv_access_0_0= ruleAccessLevel )
                    {
                    // InternalMiniJava_repl.g:1013:4: (lv_access_0_0= ruleAccessLevel )
                    // InternalMiniJava_repl.g:1014:5: lv_access_0_0= ruleAccessLevel
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getMethodAccess().getAccessAccessLevelEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_15);
                    lv_access_0_0=ruleAccessLevel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getMethodRule());
                      					}
                      					set(
                      						current,
                      						"access",
                      						lv_access_0_0,
                      						"org.tetrabox.minijava.xtext.MiniJava.AccessLevel");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMiniJava_repl.g:1031:3: ( (lv_isabstract_1_0= 'abstract' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==15) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMiniJava_repl.g:1032:4: (lv_isabstract_1_0= 'abstract' )
                    {
                    // InternalMiniJava_repl.g:1032:4: (lv_isabstract_1_0= 'abstract' )
                    // InternalMiniJava_repl.g:1033:5: lv_isabstract_1_0= 'abstract'
                    {
                    lv_isabstract_1_0=(Token)match(input,15,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isabstract_1_0, grammarAccess.getMethodAccess().getIsabstractAbstractKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMethodRule());
                      					}
                      					setWithLastConsumed(current, "isabstract", lv_isabstract_1_0 != null, "abstract");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMiniJava_repl.g:1045:3: ( (lv_isstatic_2_0= 'static' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMiniJava_repl.g:1046:4: (lv_isstatic_2_0= 'static' )
                    {
                    // InternalMiniJava_repl.g:1046:4: (lv_isstatic_2_0= 'static' )
                    // InternalMiniJava_repl.g:1047:5: lv_isstatic_2_0= 'static'
                    {
                    lv_isstatic_2_0=(Token)match(input,23,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isstatic_2_0, grammarAccess.getMethodAccess().getIsstaticStaticKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMethodRule());
                      					}
                      					setWithLastConsumed(current, "isstatic", lv_isstatic_2_0 != null, "static");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMiniJava_repl.g:1059:3: ( (lv_typeRef_3_0= ruleTypeRef ) )
            // InternalMiniJava_repl.g:1060:4: (lv_typeRef_3_0= ruleTypeRef )
            {
            // InternalMiniJava_repl.g:1060:4: (lv_typeRef_3_0= ruleTypeRef )
            // InternalMiniJava_repl.g:1061:5: lv_typeRef_3_0= ruleTypeRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMethodAccess().getTypeRefTypeRefParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_typeRef_3_0=ruleTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMethodRule());
              					}
              					set(
              						current,
              						"typeRef",
              						lv_typeRef_3_0,
              						"org.tetrabox.minijava.xtext.MiniJava.TypeRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMiniJava_repl.g:1078:3: ( (lv_name_4_0= RULE_ID ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMiniJava_repl.g:1079:4: (lv_name_4_0= RULE_ID )
                    {
                    // InternalMiniJava_repl.g:1079:4: (lv_name_4_0= RULE_ID )
                    // InternalMiniJava_repl.g:1080:5: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_4_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_4_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMethodRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_4_0,
                      						"org.eclipse.xtext.common.Terminals.ID");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_5());
              		
            }
            // InternalMiniJava_repl.g:1100:3: ( ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID||(LA22_0>=37 && LA22_0<=40)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMiniJava_repl.g:1101:4: ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )*
                    {
                    // InternalMiniJava_repl.g:1101:4: ( (lv_params_6_0= ruleParameter ) )
                    // InternalMiniJava_repl.g:1102:5: (lv_params_6_0= ruleParameter )
                    {
                    // InternalMiniJava_repl.g:1102:5: (lv_params_6_0= ruleParameter )
                    // InternalMiniJava_repl.g:1103:6: lv_params_6_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_6_0_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
                    lv_params_6_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMethodRule());
                      						}
                      						add(
                      							current,
                      							"params",
                      							lv_params_6_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.Parameter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMiniJava_repl.g:1120:4: (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==19) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalMiniJava_repl.g:1121:5: otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,19,FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getCommaKeyword_6_1_0());
                    	      				
                    	    }
                    	    // InternalMiniJava_repl.g:1125:5: ( (lv_params_8_0= ruleParameter ) )
                    	    // InternalMiniJava_repl.g:1126:6: (lv_params_8_0= ruleParameter )
                    	    {
                    	    // InternalMiniJava_repl.g:1126:6: (lv_params_8_0= ruleParameter )
                    	    // InternalMiniJava_repl.g:1127:7: lv_params_8_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_6_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_21);
                    	    lv_params_8_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getMethodRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"params",
                    	      								lv_params_8_0,
                    	      								"org.tetrabox.minijava.xtext.MiniJava.Parameter");
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
                    break;

            }

            otherlv_9=(Token)match(input,25,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getRightParenthesisKeyword_7());
              		
            }
            // InternalMiniJava_repl.g:1150:3: ( ( (lv_body_10_0= ruleBlock ) ) | otherlv_11= ';' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==20) ) {
                alt23=1;
            }
            else if ( (LA23_0==12) ) {
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
                    // InternalMiniJava_repl.g:1151:4: ( (lv_body_10_0= ruleBlock ) )
                    {
                    // InternalMiniJava_repl.g:1151:4: ( (lv_body_10_0= ruleBlock ) )
                    // InternalMiniJava_repl.g:1152:5: (lv_body_10_0= ruleBlock )
                    {
                    // InternalMiniJava_repl.g:1152:5: (lv_body_10_0= ruleBlock )
                    // InternalMiniJava_repl.g:1153:6: lv_body_10_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMethodAccess().getBodyBlockParserRuleCall_8_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_body_10_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMethodRule());
                      						}
                      						set(
                      							current,
                      							"body",
                      							lv_body_10_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.Block");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava_repl.g:1171:4: otherlv_11= ';'
                    {
                    otherlv_11=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getMethodAccess().getSemicolonKeyword_8_1());
                      			
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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleParameter"
    // InternalMiniJava_repl.g:1180:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalMiniJava_repl.g:1180:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalMiniJava_repl.g:1181:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalMiniJava_repl.g:1187:1: ruleParameter returns [EObject current=null] : ( ( (lv_typeRef_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_typeRef_0_0 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:1193:2: ( ( ( (lv_typeRef_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMiniJava_repl.g:1194:2: ( ( (lv_typeRef_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMiniJava_repl.g:1194:2: ( ( (lv_typeRef_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMiniJava_repl.g:1195:3: ( (lv_typeRef_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMiniJava_repl.g:1195:3: ( (lv_typeRef_0_0= ruleTypeRef ) )
            // InternalMiniJava_repl.g:1196:4: (lv_typeRef_0_0= ruleTypeRef )
            {
            // InternalMiniJava_repl.g:1196:4: (lv_typeRef_0_0= ruleTypeRef )
            // InternalMiniJava_repl.g:1197:5: lv_typeRef_0_0= ruleTypeRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterAccess().getTypeRefTypeRefParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_typeRef_0_0=ruleTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterRule());
              					}
              					set(
              						current,
              						"typeRef",
              						lv_typeRef_0_0,
              						"org.tetrabox.minijava.xtext.MiniJava.TypeRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMiniJava_repl.g:1214:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMiniJava_repl.g:1215:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMiniJava_repl.g:1215:4: (lv_name_1_0= RULE_ID )
            // InternalMiniJava_repl.g:1216:5: lv_name_1_0= RULE_ID
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


    // $ANTLR start "entryRuleField"
    // InternalMiniJava_repl.g:1236:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalMiniJava_repl.g:1236:46: (iv_ruleField= ruleField EOF )
            // InternalMiniJava_repl.g:1237:2: iv_ruleField= ruleField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField; 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalMiniJava_repl.g:1243:1: ruleField returns [EObject current=null] : ( ( (lv_access_0_0= ruleAccessLevel ) )? ( (lv_typeRef_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleExpression ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_access_0_0 = null;

        EObject lv_typeRef_1_0 = null;

        EObject lv_defaultValue_4_0 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:1249:2: ( ( ( (lv_access_0_0= ruleAccessLevel ) )? ( (lv_typeRef_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleExpression ) ) )? otherlv_5= ';' ) )
            // InternalMiniJava_repl.g:1250:2: ( ( (lv_access_0_0= ruleAccessLevel ) )? ( (lv_typeRef_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleExpression ) ) )? otherlv_5= ';' )
            {
            // InternalMiniJava_repl.g:1250:2: ( ( (lv_access_0_0= ruleAccessLevel ) )? ( (lv_typeRef_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleExpression ) ) )? otherlv_5= ';' )
            // InternalMiniJava_repl.g:1251:3: ( (lv_access_0_0= ruleAccessLevel ) )? ( (lv_typeRef_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleExpression ) ) )? otherlv_5= ';'
            {
            // InternalMiniJava_repl.g:1251:3: ( (lv_access_0_0= ruleAccessLevel ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=63 && LA24_0<=65)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMiniJava_repl.g:1252:4: (lv_access_0_0= ruleAccessLevel )
                    {
                    // InternalMiniJava_repl.g:1252:4: (lv_access_0_0= ruleAccessLevel )
                    // InternalMiniJava_repl.g:1253:5: lv_access_0_0= ruleAccessLevel
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFieldAccess().getAccessAccessLevelEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_17);
                    lv_access_0_0=ruleAccessLevel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFieldRule());
                      					}
                      					set(
                      						current,
                      						"access",
                      						lv_access_0_0,
                      						"org.tetrabox.minijava.xtext.MiniJava.AccessLevel");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMiniJava_repl.g:1270:3: ( (lv_typeRef_1_0= ruleTypeRef ) )
            // InternalMiniJava_repl.g:1271:4: (lv_typeRef_1_0= ruleTypeRef )
            {
            // InternalMiniJava_repl.g:1271:4: (lv_typeRef_1_0= ruleTypeRef )
            // InternalMiniJava_repl.g:1272:5: lv_typeRef_1_0= ruleTypeRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFieldAccess().getTypeRefTypeRefParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_typeRef_1_0=ruleTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFieldRule());
              					}
              					set(
              						current,
              						"typeRef",
              						lv_typeRef_1_0,
              						"org.tetrabox.minijava.xtext.MiniJava.TypeRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMiniJava_repl.g:1289:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMiniJava_repl.g:1290:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMiniJava_repl.g:1290:4: (lv_name_2_0= RULE_ID )
            // InternalMiniJava_repl.g:1291:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalMiniJava_repl.g:1307:3: (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleExpression ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==26) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMiniJava_repl.g:1308:4: otherlv_3= '=' ( (lv_defaultValue_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getEqualsSignKeyword_3_0());
                      			
                    }
                    // InternalMiniJava_repl.g:1312:4: ( (lv_defaultValue_4_0= ruleExpression ) )
                    // InternalMiniJava_repl.g:1313:5: (lv_defaultValue_4_0= ruleExpression )
                    {
                    // InternalMiniJava_repl.g:1313:5: (lv_defaultValue_4_0= ruleExpression )
                    // InternalMiniJava_repl.g:1314:6: lv_defaultValue_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFieldAccess().getDefaultValueExpressionParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_defaultValue_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFieldRule());
                      						}
                      						set(
                      							current,
                      							"defaultValue",
                      							lv_defaultValue_4_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getFieldAccess().getSemicolonKeyword_4());
              		
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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleBlock"
    // InternalMiniJava_repl.g:1340:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalMiniJava_repl.g:1340:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalMiniJava_repl.g:1341:2: iv_ruleBlock= ruleBlock EOF
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
    // InternalMiniJava_repl.g:1347:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:1353:2: ( ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // InternalMiniJava_repl.g:1354:2: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // InternalMiniJava_repl.g:1354:2: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            // InternalMiniJava_repl.g:1355:3: () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            // InternalMiniJava_repl.g:1355:3: ()
            // InternalMiniJava_repl.g:1356:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBlockAccess().getBlockAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalMiniJava_repl.g:1369:3: ( (lv_statements_2_0= ruleStatement ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_INT)||LA26_0==20||LA26_0==24||LA26_0==27||(LA26_0>=30 && LA26_0<=31)||(LA26_0>=33 && LA26_0<=34)||(LA26_0>=37 && LA26_0<=40)||LA26_0==51||(LA26_0>=55 && LA26_0<=62)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMiniJava_repl.g:1370:4: (lv_statements_2_0= ruleStatement )
            	    {
            	    // InternalMiniJava_repl.g:1370:4: (lv_statements_2_0= ruleStatement )
            	    // InternalMiniJava_repl.g:1371:5: lv_statements_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_statements_2_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statements",
            	      						lv_statements_2_0,
            	      						"org.tetrabox.minijava.xtext.MiniJava.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3());
              		
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


    // $ANTLR start "entryRuleStatement"
    // InternalMiniJava_repl.g:1396:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMiniJava_repl.g:1396:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMiniJava_repl.g:1397:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalMiniJava_repl.g:1403:1: ruleStatement returns [EObject current=null] : ( (this_Return_0= ruleReturn otherlv_1= ';' ) | ( ( ( ruleAssignment )=>this_Assignment_2= ruleAssignment ) otherlv_3= ';' ) | this_IfStatement_4= ruleIfStatement | this_WhileStatement_5= ruleWhileStatement | this_ForStatement_6= ruleForStatement | (this_PrintStatement_7= rulePrintStatement otherlv_8= ';' ) | this_Block_9= ruleBlock | (this_SelectionExpression_10= ruleSelectionExpression otherlv_11= ';' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject this_Return_0 = null;

        EObject this_Assignment_2 = null;

        EObject this_IfStatement_4 = null;

        EObject this_WhileStatement_5 = null;

        EObject this_ForStatement_6 = null;

        EObject this_PrintStatement_7 = null;

        EObject this_Block_9 = null;

        EObject this_SelectionExpression_10 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:1409:2: ( ( (this_Return_0= ruleReturn otherlv_1= ';' ) | ( ( ( ruleAssignment )=>this_Assignment_2= ruleAssignment ) otherlv_3= ';' ) | this_IfStatement_4= ruleIfStatement | this_WhileStatement_5= ruleWhileStatement | this_ForStatement_6= ruleForStatement | (this_PrintStatement_7= rulePrintStatement otherlv_8= ';' ) | this_Block_9= ruleBlock | (this_SelectionExpression_10= ruleSelectionExpression otherlv_11= ';' ) ) )
            // InternalMiniJava_repl.g:1410:2: ( (this_Return_0= ruleReturn otherlv_1= ';' ) | ( ( ( ruleAssignment )=>this_Assignment_2= ruleAssignment ) otherlv_3= ';' ) | this_IfStatement_4= ruleIfStatement | this_WhileStatement_5= ruleWhileStatement | this_ForStatement_6= ruleForStatement | (this_PrintStatement_7= rulePrintStatement otherlv_8= ';' ) | this_Block_9= ruleBlock | (this_SelectionExpression_10= ruleSelectionExpression otherlv_11= ';' ) )
            {
            // InternalMiniJava_repl.g:1410:2: ( (this_Return_0= ruleReturn otherlv_1= ';' ) | ( ( ( ruleAssignment )=>this_Assignment_2= ruleAssignment ) otherlv_3= ';' ) | this_IfStatement_4= ruleIfStatement | this_WhileStatement_5= ruleWhileStatement | this_ForStatement_6= ruleForStatement | (this_PrintStatement_7= rulePrintStatement otherlv_8= ';' ) | this_Block_9= ruleBlock | (this_SelectionExpression_10= ruleSelectionExpression otherlv_11= ';' ) )
            int alt27=8;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalMiniJava_repl.g:1411:3: (this_Return_0= ruleReturn otherlv_1= ';' )
                    {
                    // InternalMiniJava_repl.g:1411:3: (this_Return_0= ruleReturn otherlv_1= ';' )
                    // InternalMiniJava_repl.g:1412:4: this_Return_0= ruleReturn otherlv_1= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getReturnParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_Return_0=ruleReturn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Return_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_1=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getSemicolonKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava_repl.g:1429:3: ( ( ( ruleAssignment )=>this_Assignment_2= ruleAssignment ) otherlv_3= ';' )
                    {
                    // InternalMiniJava_repl.g:1429:3: ( ( ( ruleAssignment )=>this_Assignment_2= ruleAssignment ) otherlv_3= ';' )
                    // InternalMiniJava_repl.g:1430:4: ( ( ruleAssignment )=>this_Assignment_2= ruleAssignment ) otherlv_3= ';'
                    {
                    // InternalMiniJava_repl.g:1430:4: ( ( ruleAssignment )=>this_Assignment_2= ruleAssignment )
                    // InternalMiniJava_repl.g:1431:5: ( ruleAssignment )=>this_Assignment_2= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_4);
                    this_Assignment_2=ruleAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_Assignment_2;
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }

                    otherlv_3=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getStatementAccess().getSemicolonKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava_repl.g:1450:3: this_IfStatement_4= ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfStatement_4=ruleIfStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfStatement_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMiniJava_repl.g:1462:3: this_WhileStatement_5= ruleWhileStatement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getWhileStatementParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_WhileStatement_5=ruleWhileStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_WhileStatement_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMiniJava_repl.g:1474:3: this_ForStatement_6= ruleForStatement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getForStatementParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ForStatement_6=ruleForStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ForStatement_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalMiniJava_repl.g:1486:3: (this_PrintStatement_7= rulePrintStatement otherlv_8= ';' )
                    {
                    // InternalMiniJava_repl.g:1486:3: (this_PrintStatement_7= rulePrintStatement otherlv_8= ';' )
                    // InternalMiniJava_repl.g:1487:4: this_PrintStatement_7= rulePrintStatement otherlv_8= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getPrintStatementParserRuleCall_5_0());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_PrintStatement_7=rulePrintStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PrintStatement_7;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_8=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getStatementAccess().getSemicolonKeyword_5_1());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMiniJava_repl.g:1504:3: this_Block_9= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getBlockParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Block_9=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Block_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalMiniJava_repl.g:1516:3: (this_SelectionExpression_10= ruleSelectionExpression otherlv_11= ';' )
                    {
                    // InternalMiniJava_repl.g:1516:3: (this_SelectionExpression_10= ruleSelectionExpression otherlv_11= ';' )
                    // InternalMiniJava_repl.g:1517:4: this_SelectionExpression_10= ruleSelectionExpression otherlv_11= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getSelectionExpressionParserRuleCall_7_0());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_SelectionExpression_10=ruleSelectionExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_SelectionExpression_10;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_11=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getStatementAccess().getSemicolonKeyword_7_1());
                      			
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRulePrintStatement"
    // InternalMiniJava_repl.g:1537:1: entryRulePrintStatement returns [EObject current=null] : iv_rulePrintStatement= rulePrintStatement EOF ;
    public final EObject entryRulePrintStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintStatement = null;


        try {
            // InternalMiniJava_repl.g:1537:55: (iv_rulePrintStatement= rulePrintStatement EOF )
            // InternalMiniJava_repl.g:1538:2: iv_rulePrintStatement= rulePrintStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrintStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrintStatement=rulePrintStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrintStatement; 
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
    // $ANTLR end "entryRulePrintStatement"


    // $ANTLR start "rulePrintStatement"
    // InternalMiniJava_repl.g:1544:1: rulePrintStatement returns [EObject current=null] : (otherlv_0= 'System' otherlv_1= '.' otherlv_2= 'out' otherlv_3= '.' otherlv_4= 'println' otherlv_5= '(' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ')' ) ;
    public final EObject rulePrintStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_expression_6_0 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:1550:2: ( (otherlv_0= 'System' otherlv_1= '.' otherlv_2= 'out' otherlv_3= '.' otherlv_4= 'println' otherlv_5= '(' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ')' ) )
            // InternalMiniJava_repl.g:1551:2: (otherlv_0= 'System' otherlv_1= '.' otherlv_2= 'out' otherlv_3= '.' otherlv_4= 'println' otherlv_5= '(' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ')' )
            {
            // InternalMiniJava_repl.g:1551:2: (otherlv_0= 'System' otherlv_1= '.' otherlv_2= 'out' otherlv_3= '.' otherlv_4= 'println' otherlv_5= '(' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ')' )
            // InternalMiniJava_repl.g:1552:3: otherlv_0= 'System' otherlv_1= '.' otherlv_2= 'out' otherlv_3= '.' otherlv_4= 'println' otherlv_5= '(' ( (lv_expression_6_0= ruleExpression ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPrintStatementAccess().getSystemKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,13,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPrintStatementAccess().getFullStopKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,28,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPrintStatementAccess().getOutKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPrintStatementAccess().getFullStopKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,29,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPrintStatementAccess().getPrintlnKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,24,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getPrintStatementAccess().getLeftParenthesisKeyword_5());
              		
            }
            // InternalMiniJava_repl.g:1576:3: ( (lv_expression_6_0= ruleExpression ) )
            // InternalMiniJava_repl.g:1577:4: (lv_expression_6_0= ruleExpression )
            {
            // InternalMiniJava_repl.g:1577:4: (lv_expression_6_0= ruleExpression )
            // InternalMiniJava_repl.g:1578:5: lv_expression_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPrintStatementAccess().getExpressionExpressionParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_29);
            lv_expression_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPrintStatementRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_6_0,
              						"org.tetrabox.minijava.xtext.MiniJava.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getPrintStatementAccess().getRightParenthesisKeyword_7());
              		
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
    // $ANTLR end "rulePrintStatement"


    // $ANTLR start "entryRuleReturn"
    // InternalMiniJava_repl.g:1603:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // InternalMiniJava_repl.g:1603:47: (iv_ruleReturn= ruleReturn EOF )
            // InternalMiniJava_repl.g:1604:2: iv_ruleReturn= ruleReturn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReturn=ruleReturn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturn; 
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
    // $ANTLR end "entryRuleReturn"


    // $ANTLR start "ruleReturn"
    // InternalMiniJava_repl.g:1610:1: ruleReturn returns [EObject current=null] : (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:1616:2: ( (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) ) )
            // InternalMiniJava_repl.g:1617:2: (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // InternalMiniJava_repl.g:1617:2: (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) )
            // InternalMiniJava_repl.g:1618:3: otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReturnAccess().getReturnKeyword_0());
              		
            }
            // InternalMiniJava_repl.g:1622:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalMiniJava_repl.g:1623:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalMiniJava_repl.g:1623:4: (lv_expression_1_0= ruleExpression )
            // InternalMiniJava_repl.g:1624:5: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReturnAccess().getExpressionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReturnRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_1_0,
              						"org.tetrabox.minijava.xtext.MiniJava.Expression");
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
    // $ANTLR end "ruleReturn"


    // $ANTLR start "entryRuleIfStatement"
    // InternalMiniJava_repl.g:1645:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalMiniJava_repl.g:1645:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalMiniJava_repl.g:1646:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStatement; 
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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalMiniJava_repl.g:1652:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleBlock ) ) )? ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expression_2_0 = null;

        EObject lv_thenBlock_4_0 = null;

        EObject lv_elseBlock_6_0 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:1658:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleBlock ) ) )? ) )
            // InternalMiniJava_repl.g:1659:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleBlock ) ) )? )
            {
            // InternalMiniJava_repl.g:1659:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleBlock ) ) )? )
            // InternalMiniJava_repl.g:1660:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleBlock ) ) )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,24,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalMiniJava_repl.g:1668:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalMiniJava_repl.g:1669:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalMiniJava_repl.g:1669:4: (lv_expression_2_0= ruleExpression )
            // InternalMiniJava_repl.g:1670:5: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStatementAccess().getExpressionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_29);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfStatementRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"org.tetrabox.minijava.xtext.MiniJava.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalMiniJava_repl.g:1691:3: ( (lv_thenBlock_4_0= ruleBlock ) )
            // InternalMiniJava_repl.g:1692:4: (lv_thenBlock_4_0= ruleBlock )
            {
            // InternalMiniJava_repl.g:1692:4: (lv_thenBlock_4_0= ruleBlock )
            // InternalMiniJava_repl.g:1693:5: lv_thenBlock_4_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStatementAccess().getThenBlockBlockParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_thenBlock_4_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfStatementRule());
              					}
              					set(
              						current,
              						"thenBlock",
              						lv_thenBlock_4_0,
              						"org.tetrabox.minijava.xtext.MiniJava.Block");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMiniJava_repl.g:1710:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleBlock ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMiniJava_repl.g:1711:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleBlock ) )
                    {
                    // InternalMiniJava_repl.g:1711:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalMiniJava_repl.g:1712:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalMiniJava_repl.g:1718:4: ( (lv_elseBlock_6_0= ruleBlock ) )
                    // InternalMiniJava_repl.g:1719:5: (lv_elseBlock_6_0= ruleBlock )
                    {
                    // InternalMiniJava_repl.g:1719:5: (lv_elseBlock_6_0= ruleBlock )
                    // InternalMiniJava_repl.g:1720:6: lv_elseBlock_6_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfStatementAccess().getElseBlockBlockParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_elseBlock_6_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfStatementRule());
                      						}
                      						set(
                      							current,
                      							"elseBlock",
                      							lv_elseBlock_6_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.Block");
                      						afterParserOrEnumRuleCall();
                      					
                    }

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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleWhileStatement"
    // InternalMiniJava_repl.g:1742:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalMiniJava_repl.g:1742:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalMiniJava_repl.g:1743:2: iv_ruleWhileStatement= ruleWhileStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhileStatement=ruleWhileStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhileStatement; 
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
    // $ANTLR end "entryRuleWhileStatement"


    // $ANTLR start "ruleWhileStatement"
    // InternalMiniJava_repl.g:1749:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_block_4_0 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:1755:2: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) ) )
            // InternalMiniJava_repl.g:1756:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) )
            {
            // InternalMiniJava_repl.g:1756:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) )
            // InternalMiniJava_repl.g:1757:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWhileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,24,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWhileStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalMiniJava_repl.g:1765:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalMiniJava_repl.g:1766:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalMiniJava_repl.g:1766:4: (lv_condition_2_0= ruleExpression )
            // InternalMiniJava_repl.g:1767:5: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileStatementAccess().getConditionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_29);
            lv_condition_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_2_0,
              						"org.tetrabox.minijava.xtext.MiniJava.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getWhileStatementAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalMiniJava_repl.g:1788:3: ( (lv_block_4_0= ruleBlock ) )
            // InternalMiniJava_repl.g:1789:4: (lv_block_4_0= ruleBlock )
            {
            // InternalMiniJava_repl.g:1789:4: (lv_block_4_0= ruleBlock )
            // InternalMiniJava_repl.g:1790:5: lv_block_4_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileStatementAccess().getBlockBlockParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_block_4_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
              					}
              					set(
              						current,
              						"block",
              						lv_block_4_0,
              						"org.tetrabox.minijava.xtext.MiniJava.Block");
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
    // $ANTLR end "ruleWhileStatement"


    // $ANTLR start "entryRuleForStatement"
    // InternalMiniJava_repl.g:1811:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // InternalMiniJava_repl.g:1811:53: (iv_ruleForStatement= ruleForStatement EOF )
            // InternalMiniJava_repl.g:1812:2: iv_ruleForStatement= ruleForStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForStatement=ruleForStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForStatement; 
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
    // $ANTLR end "entryRuleForStatement"


    // $ANTLR start "ruleForStatement"
    // InternalMiniJava_repl.g:1818:1: ruleForStatement returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_declaration_2_0= ruleAssignment ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_progression_6_0= ruleAssignment ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) ) ) ;
    public final EObject ruleForStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_declaration_2_0 = null;

        EObject lv_condition_4_0 = null;

        EObject lv_progression_6_0 = null;

        EObject lv_block_8_0 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:1824:2: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_declaration_2_0= ruleAssignment ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_progression_6_0= ruleAssignment ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) ) ) )
            // InternalMiniJava_repl.g:1825:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_declaration_2_0= ruleAssignment ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_progression_6_0= ruleAssignment ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) ) )
            {
            // InternalMiniJava_repl.g:1825:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_declaration_2_0= ruleAssignment ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_progression_6_0= ruleAssignment ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) ) )
            // InternalMiniJava_repl.g:1826:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_declaration_2_0= ruleAssignment ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_progression_6_0= ruleAssignment ) ) otherlv_7= ')' ( (lv_block_8_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getForKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,24,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getForStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalMiniJava_repl.g:1834:3: ( (lv_declaration_2_0= ruleAssignment ) )
            // InternalMiniJava_repl.g:1835:4: (lv_declaration_2_0= ruleAssignment )
            {
            // InternalMiniJava_repl.g:1835:4: (lv_declaration_2_0= ruleAssignment )
            // InternalMiniJava_repl.g:1836:5: lv_declaration_2_0= ruleAssignment
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForStatementAccess().getDeclarationAssignmentParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_declaration_2_0=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForStatementRule());
              					}
              					set(
              						current,
              						"declaration",
              						lv_declaration_2_0,
              						"org.tetrabox.minijava.xtext.MiniJava.Assignment");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getForStatementAccess().getSemicolonKeyword_3());
              		
            }
            // InternalMiniJava_repl.g:1857:3: ( (lv_condition_4_0= ruleExpression ) )
            // InternalMiniJava_repl.g:1858:4: (lv_condition_4_0= ruleExpression )
            {
            // InternalMiniJava_repl.g:1858:4: (lv_condition_4_0= ruleExpression )
            // InternalMiniJava_repl.g:1859:5: lv_condition_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForStatementAccess().getConditionExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_condition_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForStatementRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_4_0,
              						"org.tetrabox.minijava.xtext.MiniJava.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getForStatementAccess().getSemicolonKeyword_5());
              		
            }
            // InternalMiniJava_repl.g:1880:3: ( (lv_progression_6_0= ruleAssignment ) )
            // InternalMiniJava_repl.g:1881:4: (lv_progression_6_0= ruleAssignment )
            {
            // InternalMiniJava_repl.g:1881:4: (lv_progression_6_0= ruleAssignment )
            // InternalMiniJava_repl.g:1882:5: lv_progression_6_0= ruleAssignment
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForStatementAccess().getProgressionAssignmentParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_29);
            lv_progression_6_0=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForStatementRule());
              					}
              					set(
              						current,
              						"progression",
              						lv_progression_6_0,
              						"org.tetrabox.minijava.xtext.MiniJava.Assignment");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getForStatementAccess().getRightParenthesisKeyword_7());
              		
            }
            // InternalMiniJava_repl.g:1903:3: ( (lv_block_8_0= ruleBlock ) )
            // InternalMiniJava_repl.g:1904:4: (lv_block_8_0= ruleBlock )
            {
            // InternalMiniJava_repl.g:1904:4: (lv_block_8_0= ruleBlock )
            // InternalMiniJava_repl.g:1905:5: lv_block_8_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForStatementAccess().getBlockBlockParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_block_8_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForStatementRule());
              					}
              					set(
              						current,
              						"block",
              						lv_block_8_0,
              						"org.tetrabox.minijava.xtext.MiniJava.Block");
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
    // $ANTLR end "ruleForStatement"


    // $ANTLR start "entryRuleTypeRef"
    // InternalMiniJava_repl.g:1926:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // InternalMiniJava_repl.g:1926:48: (iv_ruleTypeRef= ruleTypeRef EOF )
            // InternalMiniJava_repl.g:1927:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeRef=ruleTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeRef; 
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
    // $ANTLR end "entryRuleTypeRef"


    // $ANTLR start "ruleTypeRef"
    // InternalMiniJava_repl.g:1933:1: ruleTypeRef returns [EObject current=null] : (this_SingleTypeRef_0= ruleSingleTypeRef ( () otherlv_2= '[' otherlv_3= ']' )? ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_SingleTypeRef_0 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:1939:2: ( (this_SingleTypeRef_0= ruleSingleTypeRef ( () otherlv_2= '[' otherlv_3= ']' )? ) )
            // InternalMiniJava_repl.g:1940:2: (this_SingleTypeRef_0= ruleSingleTypeRef ( () otherlv_2= '[' otherlv_3= ']' )? )
            {
            // InternalMiniJava_repl.g:1940:2: (this_SingleTypeRef_0= ruleSingleTypeRef ( () otherlv_2= '[' otherlv_3= ']' )? )
            // InternalMiniJava_repl.g:1941:3: this_SingleTypeRef_0= ruleSingleTypeRef ( () otherlv_2= '[' otherlv_3= ']' )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeRefAccess().getSingleTypeRefParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_33);
            this_SingleTypeRef_0=ruleSingleTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SingleTypeRef_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniJava_repl.g:1952:3: ( () otherlv_2= '[' otherlv_3= ']' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==35) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==36) ) {
                    alt29=1;
                }
            }
            switch (alt29) {
                case 1 :
                    // InternalMiniJava_repl.g:1953:4: () otherlv_2= '[' otherlv_3= ']'
                    {
                    // InternalMiniJava_repl.g:1953:4: ()
                    // InternalMiniJava_repl.g:1954:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getTypeRefAccess().getArrayTypeRefTypeRefAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,35,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getTypeRefAccess().getLeftSquareBracketKeyword_1_1());
                      			
                    }
                    otherlv_3=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getTypeRefAccess().getRightSquareBracketKeyword_1_2());
                      			
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
    // $ANTLR end "ruleTypeRef"


    // $ANTLR start "entryRuleSingleTypeRef"
    // InternalMiniJava_repl.g:1976:1: entryRuleSingleTypeRef returns [EObject current=null] : iv_ruleSingleTypeRef= ruleSingleTypeRef EOF ;
    public final EObject entryRuleSingleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleTypeRef = null;


        try {
            // InternalMiniJava_repl.g:1976:54: (iv_ruleSingleTypeRef= ruleSingleTypeRef EOF )
            // InternalMiniJava_repl.g:1977:2: iv_ruleSingleTypeRef= ruleSingleTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleTypeRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSingleTypeRef=ruleSingleTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleTypeRef; 
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
    // $ANTLR end "entryRuleSingleTypeRef"


    // $ANTLR start "ruleSingleTypeRef"
    // InternalMiniJava_repl.g:1983:1: ruleSingleTypeRef returns [EObject current=null] : (this_ClassRef_0= ruleClassRef | ( () otherlv_2= 'int' ) | ( () otherlv_4= 'boolean' ) | ( () otherlv_6= 'String' ) | ( () otherlv_8= 'void' ) ) ;
    public final EObject ruleSingleTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_ClassRef_0 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:1989:2: ( (this_ClassRef_0= ruleClassRef | ( () otherlv_2= 'int' ) | ( () otherlv_4= 'boolean' ) | ( () otherlv_6= 'String' ) | ( () otherlv_8= 'void' ) ) )
            // InternalMiniJava_repl.g:1990:2: (this_ClassRef_0= ruleClassRef | ( () otherlv_2= 'int' ) | ( () otherlv_4= 'boolean' ) | ( () otherlv_6= 'String' ) | ( () otherlv_8= 'void' ) )
            {
            // InternalMiniJava_repl.g:1990:2: (this_ClassRef_0= ruleClassRef | ( () otherlv_2= 'int' ) | ( () otherlv_4= 'boolean' ) | ( () otherlv_6= 'String' ) | ( () otherlv_8= 'void' ) )
            int alt30=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt30=1;
                }
                break;
            case 37:
                {
                alt30=2;
                }
                break;
            case 38:
                {
                alt30=3;
                }
                break;
            case 39:
                {
                alt30=4;
                }
                break;
            case 40:
                {
                alt30=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalMiniJava_repl.g:1991:3: this_ClassRef_0= ruleClassRef
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSingleTypeRefAccess().getClassRefParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ClassRef_0=ruleClassRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ClassRef_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMiniJava_repl.g:2003:3: ( () otherlv_2= 'int' )
                    {
                    // InternalMiniJava_repl.g:2003:3: ( () otherlv_2= 'int' )
                    // InternalMiniJava_repl.g:2004:4: () otherlv_2= 'int'
                    {
                    // InternalMiniJava_repl.g:2004:4: ()
                    // InternalMiniJava_repl.g:2005:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSingleTypeRefAccess().getIntegerTypeRefAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSingleTypeRefAccess().getIntKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava_repl.g:2020:3: ( () otherlv_4= 'boolean' )
                    {
                    // InternalMiniJava_repl.g:2020:3: ( () otherlv_4= 'boolean' )
                    // InternalMiniJava_repl.g:2021:4: () otherlv_4= 'boolean'
                    {
                    // InternalMiniJava_repl.g:2021:4: ()
                    // InternalMiniJava_repl.g:2022:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSingleTypeRefAccess().getBooleanTypeRefAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_4=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getSingleTypeRefAccess().getBooleanKeyword_2_1());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava_repl.g:2037:3: ( () otherlv_6= 'String' )
                    {
                    // InternalMiniJava_repl.g:2037:3: ( () otherlv_6= 'String' )
                    // InternalMiniJava_repl.g:2038:4: () otherlv_6= 'String'
                    {
                    // InternalMiniJava_repl.g:2038:4: ()
                    // InternalMiniJava_repl.g:2039:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSingleTypeRefAccess().getStringTypeRefAction_3_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_6=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getSingleTypeRefAccess().getStringKeyword_3_1());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMiniJava_repl.g:2054:3: ( () otherlv_8= 'void' )
                    {
                    // InternalMiniJava_repl.g:2054:3: ( () otherlv_8= 'void' )
                    // InternalMiniJava_repl.g:2055:4: () otherlv_8= 'void'
                    {
                    // InternalMiniJava_repl.g:2055:4: ()
                    // InternalMiniJava_repl.g:2056:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSingleTypeRefAccess().getVoidTypeRefAction_4_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_8=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getSingleTypeRefAccess().getVoidKeyword_4_1());
                      			
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
    // $ANTLR end "ruleSingleTypeRef"


    // $ANTLR start "entryRuleClassRef"
    // InternalMiniJava_repl.g:2074:1: entryRuleClassRef returns [EObject current=null] : iv_ruleClassRef= ruleClassRef EOF ;
    public final EObject entryRuleClassRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassRef = null;


        try {
            // InternalMiniJava_repl.g:2074:49: (iv_ruleClassRef= ruleClassRef EOF )
            // InternalMiniJava_repl.g:2075:2: iv_ruleClassRef= ruleClassRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClassRef=ruleClassRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassRef; 
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
    // $ANTLR end "entryRuleClassRef"


    // $ANTLR start "ruleClassRef"
    // InternalMiniJava_repl.g:2081:1: ruleClassRef returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleClassRef() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalMiniJava_repl.g:2087:2: ( ( ( ruleQualifiedName ) ) )
            // InternalMiniJava_repl.g:2088:2: ( ( ruleQualifiedName ) )
            {
            // InternalMiniJava_repl.g:2088:2: ( ( ruleQualifiedName ) )
            // InternalMiniJava_repl.g:2089:3: ( ruleQualifiedName )
            {
            // InternalMiniJava_repl.g:2089:3: ( ruleQualifiedName )
            // InternalMiniJava_repl.g:2090:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getClassRefRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getClassRefAccess().getReferencedClassTypeDeclarationCrossReference_0());
              			
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
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
    // $ANTLR end "ruleClassRef"


    // $ANTLR start "entryRuleTypedDeclaration"
    // InternalMiniJava_repl.g:2110:1: entryRuleTypedDeclaration returns [EObject current=null] : iv_ruleTypedDeclaration= ruleTypedDeclaration EOF ;
    public final EObject entryRuleTypedDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedDeclaration = null;


        try {
            // InternalMiniJava_repl.g:2110:57: (iv_ruleTypedDeclaration= ruleTypedDeclaration EOF )
            // InternalMiniJava_repl.g:2111:2: iv_ruleTypedDeclaration= ruleTypedDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypedDeclaration=ruleTypedDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedDeclaration; 
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
    // $ANTLR end "entryRuleTypedDeclaration"


    // $ANTLR start "ruleTypedDeclaration"
    // InternalMiniJava_repl.g:2117:1: ruleTypedDeclaration returns [EObject current=null] : (this_Symbol_0= ruleSymbol | this_Member_1= ruleMember ) ;
    public final EObject ruleTypedDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Symbol_0 = null;

        EObject this_Member_1 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:2123:2: ( (this_Symbol_0= ruleSymbol | this_Member_1= ruleMember ) )
            // InternalMiniJava_repl.g:2124:2: (this_Symbol_0= ruleSymbol | this_Member_1= ruleMember )
            {
            // InternalMiniJava_repl.g:2124:2: (this_Symbol_0= ruleSymbol | this_Member_1= ruleMember )
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // InternalMiniJava_repl.g:2125:3: this_Symbol_0= ruleSymbol
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypedDeclarationAccess().getSymbolParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Symbol_0=ruleSymbol();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Symbol_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMiniJava_repl.g:2137:3: this_Member_1= ruleMember
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypedDeclarationAccess().getMemberParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Member_1=ruleMember();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Member_1;
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
    // $ANTLR end "ruleTypedDeclaration"


    // $ANTLR start "entryRuleSymbol"
    // InternalMiniJava_repl.g:2152:1: entryRuleSymbol returns [EObject current=null] : iv_ruleSymbol= ruleSymbol EOF ;
    public final EObject entryRuleSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbol = null;


        try {
            // InternalMiniJava_repl.g:2152:47: (iv_ruleSymbol= ruleSymbol EOF )
            // InternalMiniJava_repl.g:2153:2: iv_ruleSymbol= ruleSymbol EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSymbolRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSymbol=ruleSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSymbol; 
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
    // $ANTLR end "entryRuleSymbol"


    // $ANTLR start "ruleSymbol"
    // InternalMiniJava_repl.g:2159:1: ruleSymbol returns [EObject current=null] : ( ( ( ruleParameter )=>this_Parameter_0= ruleParameter ) | this_VariableDeclaration_1= ruleVariableDeclaration ) ;
    public final EObject ruleSymbol() throws RecognitionException {
        EObject current = null;

        EObject this_Parameter_0 = null;

        EObject this_VariableDeclaration_1 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:2165:2: ( ( ( ( ruleParameter )=>this_Parameter_0= ruleParameter ) | this_VariableDeclaration_1= ruleVariableDeclaration ) )
            // InternalMiniJava_repl.g:2166:2: ( ( ( ruleParameter )=>this_Parameter_0= ruleParameter ) | this_VariableDeclaration_1= ruleVariableDeclaration )
            {
            // InternalMiniJava_repl.g:2166:2: ( ( ( ruleParameter )=>this_Parameter_0= ruleParameter ) | this_VariableDeclaration_1= ruleVariableDeclaration )
            int alt32=2;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // InternalMiniJava_repl.g:2167:3: ( ( ruleParameter )=>this_Parameter_0= ruleParameter )
                    {
                    // InternalMiniJava_repl.g:2167:3: ( ( ruleParameter )=>this_Parameter_0= ruleParameter )
                    // InternalMiniJava_repl.g:2168:4: ( ruleParameter )=>this_Parameter_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSymbolAccess().getParameterParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Parameter_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Parameter_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava_repl.g:2182:3: this_VariableDeclaration_1= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSymbolAccess().getVariableDeclarationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VariableDeclaration_1=ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VariableDeclaration_1;
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
    // $ANTLR end "ruleSymbol"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalMiniJava_repl.g:2197:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalMiniJava_repl.g:2197:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalMiniJava_repl.g:2198:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalMiniJava_repl.g:2204:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_typeRef_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_typeRef_0_0 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:2210:2: ( ( ( (lv_typeRef_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMiniJava_repl.g:2211:2: ( ( (lv_typeRef_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMiniJava_repl.g:2211:2: ( ( (lv_typeRef_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMiniJava_repl.g:2212:3: ( (lv_typeRef_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMiniJava_repl.g:2212:3: ( (lv_typeRef_0_0= ruleTypeRef ) )
            // InternalMiniJava_repl.g:2213:4: (lv_typeRef_0_0= ruleTypeRef )
            {
            // InternalMiniJava_repl.g:2213:4: (lv_typeRef_0_0= ruleTypeRef )
            // InternalMiniJava_repl.g:2214:5: lv_typeRef_0_0= ruleTypeRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeRefTypeRefParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_typeRef_0_0=ruleTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
              					}
              					set(
              						current,
              						"typeRef",
              						lv_typeRef_0_0,
              						"org.tetrabox.minijava.xtext.MiniJava.TypeRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMiniJava_repl.g:2231:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMiniJava_repl.g:2232:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMiniJava_repl.g:2232:4: (lv_name_1_0= RULE_ID )
            // InternalMiniJava_repl.g:2233:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVariableDeclarationRule());
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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleAssignment"
    // InternalMiniJava_repl.g:2253:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalMiniJava_repl.g:2253:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalMiniJava_repl.g:2254:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalMiniJava_repl.g:2260:1: ruleAssignment returns [EObject current=null] : ( ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_assignee_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:2266:2: ( ( ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // InternalMiniJava_repl.g:2267:2: ( ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // InternalMiniJava_repl.g:2267:2: ( ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // InternalMiniJava_repl.g:2268:3: ( (lv_assignee_0_0= ruleAssignee ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // InternalMiniJava_repl.g:2268:3: ( (lv_assignee_0_0= ruleAssignee ) )
            // InternalMiniJava_repl.g:2269:4: (lv_assignee_0_0= ruleAssignee )
            {
            // InternalMiniJava_repl.g:2269:4: (lv_assignee_0_0= ruleAssignee )
            // InternalMiniJava_repl.g:2270:5: lv_assignee_0_0= ruleAssignee
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignmentAccess().getAssigneeAssigneeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_35);
            lv_assignee_0_0=ruleAssignee();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignmentRule());
              					}
              					set(
              						current,
              						"assignee",
              						lv_assignee_0_0,
              						"org.tetrabox.minijava.xtext.MiniJava.Assignee");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalMiniJava_repl.g:2291:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalMiniJava_repl.g:2292:4: (lv_value_2_0= ruleExpression )
            {
            // InternalMiniJava_repl.g:2292:4: (lv_value_2_0= ruleExpression )
            // InternalMiniJava_repl.g:2293:5: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignmentAccess().getValueExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignmentRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"org.tetrabox.minijava.xtext.MiniJava.Expression");
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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleAssignee"
    // InternalMiniJava_repl.g:2314:1: entryRuleAssignee returns [EObject current=null] : iv_ruleAssignee= ruleAssignee EOF ;
    public final EObject entryRuleAssignee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignee = null;


        try {
            // InternalMiniJava_repl.g:2314:49: (iv_ruleAssignee= ruleAssignee EOF )
            // InternalMiniJava_repl.g:2315:2: iv_ruleAssignee= ruleAssignee EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssigneeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignee=ruleAssignee();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignee; 
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
    // $ANTLR end "entryRuleAssignee"


    // $ANTLR start "ruleAssignee"
    // InternalMiniJava_repl.g:2321:1: ruleAssignee returns [EObject current=null] : ( ( ( ruleArrayAccess )=>this_ArrayAccess_0= ruleArrayAccess ) | this_VariableDeclaration_1= ruleVariableDeclaration ) ;
    public final EObject ruleAssignee() throws RecognitionException {
        EObject current = null;

        EObject this_ArrayAccess_0 = null;

        EObject this_VariableDeclaration_1 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:2327:2: ( ( ( ( ruleArrayAccess )=>this_ArrayAccess_0= ruleArrayAccess ) | this_VariableDeclaration_1= ruleVariableDeclaration ) )
            // InternalMiniJava_repl.g:2328:2: ( ( ( ruleArrayAccess )=>this_ArrayAccess_0= ruleArrayAccess ) | this_VariableDeclaration_1= ruleVariableDeclaration )
            {
            // InternalMiniJava_repl.g:2328:2: ( ( ( ruleArrayAccess )=>this_ArrayAccess_0= ruleArrayAccess ) | this_VariableDeclaration_1= ruleVariableDeclaration )
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // InternalMiniJava_repl.g:2329:3: ( ( ruleArrayAccess )=>this_ArrayAccess_0= ruleArrayAccess )
                    {
                    // InternalMiniJava_repl.g:2329:3: ( ( ruleArrayAccess )=>this_ArrayAccess_0= ruleArrayAccess )
                    // InternalMiniJava_repl.g:2330:4: ( ruleArrayAccess )=>this_ArrayAccess_0= ruleArrayAccess
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAssigneeAccess().getArrayAccessParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ArrayAccess_0=ruleArrayAccess();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ArrayAccess_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava_repl.g:2344:3: this_VariableDeclaration_1= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAssigneeAccess().getVariableDeclarationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VariableDeclaration_1=ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VariableDeclaration_1;
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
    // $ANTLR end "ruleAssignee"


    // $ANTLR start "entryRuleExpression"
    // InternalMiniJava_repl.g:2359:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMiniJava_repl.g:2359:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMiniJava_repl.g:2360:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalMiniJava_repl.g:2366:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:2372:2: (this_Or_0= ruleOr )
            // InternalMiniJava_repl.g:2373:2: this_Or_0= ruleOr
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall());
              	
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


    // $ANTLR start "entryRuleOr"
    // InternalMiniJava_repl.g:2387:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalMiniJava_repl.g:2387:43: (iv_ruleOr= ruleOr EOF )
            // InternalMiniJava_repl.g:2388:2: iv_ruleOr= ruleOr EOF
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
    // InternalMiniJava_repl.g:2394:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:2400:2: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalMiniJava_repl.g:2401:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalMiniJava_repl.g:2401:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalMiniJava_repl.g:2402:3: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_36);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_And_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniJava_repl.g:2413:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==41) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalMiniJava_repl.g:2414:4: () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalMiniJava_repl.g:2414:4: ()
            	    // InternalMiniJava_repl.g:2415:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,41,FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	      			
            	    }
            	    // InternalMiniJava_repl.g:2428:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalMiniJava_repl.g:2429:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalMiniJava_repl.g:2429:5: (lv_right_3_0= ruleAnd )
            	    // InternalMiniJava_repl.g:2430:6: lv_right_3_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_36);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.tetrabox.minijava.xtext.MiniJava.And");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalMiniJava_repl.g:2452:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalMiniJava_repl.g:2452:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalMiniJava_repl.g:2453:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalMiniJava_repl.g:2459:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:2465:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalMiniJava_repl.g:2466:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalMiniJava_repl.g:2466:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalMiniJava_repl.g:2467:3: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_37);
            this_Equality_0=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Equality_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniJava_repl.g:2478:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==42) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalMiniJava_repl.g:2479:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalMiniJava_repl.g:2479:4: ()
            	    // InternalMiniJava_repl.g:2480:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,42,FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	      			
            	    }
            	    // InternalMiniJava_repl.g:2493:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalMiniJava_repl.g:2494:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalMiniJava_repl.g:2494:5: (lv_right_3_0= ruleEquality )
            	    // InternalMiniJava_repl.g:2495:6: lv_right_3_0= ruleEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_37);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.tetrabox.minijava.xtext.MiniJava.Equality");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalMiniJava_repl.g:2517:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalMiniJava_repl.g:2517:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalMiniJava_repl.g:2518:2: iv_ruleEquality= ruleEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEquality=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquality; 
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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalMiniJava_repl.g:2524:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:2530:2: ( (this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleComparison ) ) )* ) )
            // InternalMiniJava_repl.g:2531:2: (this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleComparison ) ) )* )
            {
            // InternalMiniJava_repl.g:2531:2: (this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleComparison ) ) )* )
            // InternalMiniJava_repl.g:2532:3: this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_38);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniJava_repl.g:2543:3: ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleComparison ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=43 && LA37_0<=44)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalMiniJava_repl.g:2544:4: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleComparison ) )
            	    {
            	    // InternalMiniJava_repl.g:2544:4: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) )
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==43) ) {
            	        alt36=1;
            	    }
            	    else if ( (LA36_0==44) ) {
            	        alt36=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // InternalMiniJava_repl.g:2545:5: ( () otherlv_2= '==' )
            	            {
            	            // InternalMiniJava_repl.g:2545:5: ( () otherlv_2= '==' )
            	            // InternalMiniJava_repl.g:2546:6: () otherlv_2= '=='
            	            {
            	            // InternalMiniJava_repl.g:2546:6: ()
            	            // InternalMiniJava_repl.g:2547:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,43,FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMiniJava_repl.g:2562:5: ( () otherlv_4= '!=' )
            	            {
            	            // InternalMiniJava_repl.g:2562:5: ( () otherlv_4= '!=' )
            	            // InternalMiniJava_repl.g:2563:6: () otherlv_4= '!='
            	            {
            	            // InternalMiniJava_repl.g:2563:6: ()
            	            // InternalMiniJava_repl.g:2564:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getEqualityAccess().getInequalityLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,44,FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMiniJava_repl.g:2579:4: ( (lv_right_5_0= ruleComparison ) )
            	    // InternalMiniJava_repl.g:2580:5: (lv_right_5_0= ruleComparison )
            	    {
            	    // InternalMiniJava_repl.g:2580:5: (lv_right_5_0= ruleComparison )
            	    // InternalMiniJava_repl.g:2581:6: lv_right_5_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_38);
            	    lv_right_5_0=ruleComparison();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_5_0,
            	      							"org.tetrabox.minijava.xtext.MiniJava.Comparison");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalMiniJava_repl.g:2603:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalMiniJava_repl.g:2603:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalMiniJava_repl.g:2604:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalMiniJava_repl.g:2610:1: ruleComparison returns [EObject current=null] : (this_Modulo_0= ruleModulo ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<' ) ) ( (lv_right_9_0= ruleModulo ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_Modulo_0 = null;

        EObject lv_right_9_0 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:2616:2: ( (this_Modulo_0= ruleModulo ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<' ) ) ( (lv_right_9_0= ruleModulo ) ) )* ) )
            // InternalMiniJava_repl.g:2617:2: (this_Modulo_0= ruleModulo ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<' ) ) ( (lv_right_9_0= ruleModulo ) ) )* )
            {
            // InternalMiniJava_repl.g:2617:2: (this_Modulo_0= ruleModulo ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<' ) ) ( (lv_right_9_0= ruleModulo ) ) )* )
            // InternalMiniJava_repl.g:2618:3: this_Modulo_0= ruleModulo ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<' ) ) ( (lv_right_9_0= ruleModulo ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonAccess().getModuloParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_39);
            this_Modulo_0=ruleModulo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Modulo_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniJava_repl.g:2629:3: ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<' ) ) ( (lv_right_9_0= ruleModulo ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=45 && LA39_0<=48)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalMiniJava_repl.g:2630:4: ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<' ) ) ( (lv_right_9_0= ruleModulo ) )
            	    {
            	    // InternalMiniJava_repl.g:2630:4: ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<' ) )
            	    int alt38=4;
            	    switch ( input.LA(1) ) {
            	    case 45:
            	        {
            	        alt38=1;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt38=2;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt38=3;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt38=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 38, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt38) {
            	        case 1 :
            	            // InternalMiniJava_repl.g:2631:5: ( () otherlv_2= '>=' )
            	            {
            	            // InternalMiniJava_repl.g:2631:5: ( () otherlv_2= '>=' )
            	            // InternalMiniJava_repl.g:2632:6: () otherlv_2= '>='
            	            {
            	            // InternalMiniJava_repl.g:2632:6: ()
            	            // InternalMiniJava_repl.g:2633:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getComparisonAccess().getSuperiorOrEqualLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,45,FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMiniJava_repl.g:2648:5: ( () otherlv_4= '<=' )
            	            {
            	            // InternalMiniJava_repl.g:2648:5: ( () otherlv_4= '<=' )
            	            // InternalMiniJava_repl.g:2649:6: () otherlv_4= '<='
            	            {
            	            // InternalMiniJava_repl.g:2649:6: ()
            	            // InternalMiniJava_repl.g:2650:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getComparisonAccess().getInferiorOrEqualLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,46,FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalMiniJava_repl.g:2665:5: ( () otherlv_6= '>' )
            	            {
            	            // InternalMiniJava_repl.g:2665:5: ( () otherlv_6= '>' )
            	            // InternalMiniJava_repl.g:2666:6: () otherlv_6= '>'
            	            {
            	            // InternalMiniJava_repl.g:2666:6: ()
            	            // InternalMiniJava_repl.g:2667:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getComparisonAccess().getSuperiorLeftAction_1_0_2_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_6=(Token)match(input,47,FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_6, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_2_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalMiniJava_repl.g:2682:5: ( () otherlv_8= '<' )
            	            {
            	            // InternalMiniJava_repl.g:2682:5: ( () otherlv_8= '<' )
            	            // InternalMiniJava_repl.g:2683:6: () otherlv_8= '<'
            	            {
            	            // InternalMiniJava_repl.g:2683:6: ()
            	            // InternalMiniJava_repl.g:2684:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getComparisonAccess().getInferiorLeftAction_1_0_3_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_8=(Token)match(input,48,FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_8, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_3_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMiniJava_repl.g:2699:4: ( (lv_right_9_0= ruleModulo ) )
            	    // InternalMiniJava_repl.g:2700:5: (lv_right_9_0= ruleModulo )
            	    {
            	    // InternalMiniJava_repl.g:2700:5: (lv_right_9_0= ruleModulo )
            	    // InternalMiniJava_repl.g:2701:6: lv_right_9_0= ruleModulo
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getRightModuloParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
            	    lv_right_9_0=ruleModulo();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_9_0,
            	      							"org.tetrabox.minijava.xtext.MiniJava.Modulo");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleModulo"
    // InternalMiniJava_repl.g:2723:1: entryRuleModulo returns [EObject current=null] : iv_ruleModulo= ruleModulo EOF ;
    public final EObject entryRuleModulo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModulo = null;


        try {
            // InternalMiniJava_repl.g:2723:47: (iv_ruleModulo= ruleModulo EOF )
            // InternalMiniJava_repl.g:2724:2: iv_ruleModulo= ruleModulo EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuloRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModulo=ruleModulo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModulo; 
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
    // $ANTLR end "entryRuleModulo"


    // $ANTLR start "ruleModulo"
    // InternalMiniJava_repl.g:2730:1: ruleModulo returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () otherlv_2= '%' ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
    public final EObject ruleModulo() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:2736:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () otherlv_2= '%' ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalMiniJava_repl.g:2737:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () otherlv_2= '%' ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalMiniJava_repl.g:2737:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () otherlv_2= '%' ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalMiniJava_repl.g:2738:3: this_PlusOrMinus_0= rulePlusOrMinus ( () otherlv_2= '%' ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getModuloAccess().getPlusOrMinusParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_40);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PlusOrMinus_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniJava_repl.g:2749:3: ( () otherlv_2= '%' ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==49) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalMiniJava_repl.g:2750:4: () otherlv_2= '%' ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalMiniJava_repl.g:2750:4: ()
            	    // InternalMiniJava_repl.g:2751:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getModuloAccess().getModuloLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,49,FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getModuloAccess().getPercentSignKeyword_1_1());
            	      			
            	    }
            	    // InternalMiniJava_repl.g:2764:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalMiniJava_repl.g:2765:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalMiniJava_repl.g:2765:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalMiniJava_repl.g:2766:6: lv_right_3_0= rulePlusOrMinus
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getModuloAccess().getRightPlusOrMinusParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
            	    lv_right_3_0=rulePlusOrMinus();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getModuloRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.tetrabox.minijava.xtext.MiniJava.PlusOrMinus");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // $ANTLR end "ruleModulo"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalMiniJava_repl.g:2788:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalMiniJava_repl.g:2788:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalMiniJava_repl.g:2789:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusOrMinus; 
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
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalMiniJava_repl.g:2795:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:2801:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalMiniJava_repl.g:2802:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalMiniJava_repl.g:2802:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // InternalMiniJava_repl.g:2803:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_41);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MulOrDiv_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniJava_repl.g:2814:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=50 && LA42_0<=51)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalMiniJava_repl.g:2815:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalMiniJava_repl.g:2815:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==50) ) {
            	        alt41=1;
            	    }
            	    else if ( (LA41_0==51) ) {
            	        alt41=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 41, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // InternalMiniJava_repl.g:2816:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalMiniJava_repl.g:2816:5: ( () otherlv_2= '+' )
            	            // InternalMiniJava_repl.g:2817:6: () otherlv_2= '+'
            	            {
            	            // InternalMiniJava_repl.g:2817:6: ()
            	            // InternalMiniJava_repl.g:2818:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,50,FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMiniJava_repl.g:2833:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalMiniJava_repl.g:2833:5: ( () otherlv_4= '-' )
            	            // InternalMiniJava_repl.g:2834:6: () otherlv_4= '-'
            	            {
            	            // InternalMiniJava_repl.g:2834:6: ()
            	            // InternalMiniJava_repl.g:2835:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,51,FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMiniJava_repl.g:2850:4: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // InternalMiniJava_repl.g:2851:5: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // InternalMiniJava_repl.g:2851:5: (lv_right_5_0= ruleMulOrDiv )
            	    // InternalMiniJava_repl.g:2852:6: lv_right_5_0= ruleMulOrDiv
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_41);
            	    lv_right_5_0=ruleMulOrDiv();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_5_0,
            	      							"org.tetrabox.minijava.xtext.MiniJava.MulOrDiv");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalMiniJava_repl.g:2874:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalMiniJava_repl.g:2874:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalMiniJava_repl.g:2875:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMulOrDivRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMulOrDiv; 
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
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalMiniJava_repl.g:2881:1: ruleMulOrDiv returns [EObject current=null] : (this_ArrayAccess_0= ruleArrayAccess ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleArrayAccess ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ArrayAccess_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:2887:2: ( (this_ArrayAccess_0= ruleArrayAccess ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleArrayAccess ) ) )* ) )
            // InternalMiniJava_repl.g:2888:2: (this_ArrayAccess_0= ruleArrayAccess ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleArrayAccess ) ) )* )
            {
            // InternalMiniJava_repl.g:2888:2: (this_ArrayAccess_0= ruleArrayAccess ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleArrayAccess ) ) )* )
            // InternalMiniJava_repl.g:2889:3: this_ArrayAccess_0= ruleArrayAccess ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleArrayAccess ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMulOrDivAccess().getArrayAccessParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_42);
            this_ArrayAccess_0=ruleArrayAccess();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ArrayAccess_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniJava_repl.g:2900:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleArrayAccess ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=52 && LA44_0<=53)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalMiniJava_repl.g:2901:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleArrayAccess ) )
            	    {
            	    // InternalMiniJava_repl.g:2901:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==52) ) {
            	        alt43=1;
            	    }
            	    else if ( (LA43_0==53) ) {
            	        alt43=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 43, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // InternalMiniJava_repl.g:2902:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalMiniJava_repl.g:2902:5: ( () otherlv_2= '*' )
            	            // InternalMiniJava_repl.g:2903:6: () otherlv_2= '*'
            	            {
            	            // InternalMiniJava_repl.g:2903:6: ()
            	            // InternalMiniJava_repl.g:2904:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getMulOrDivAccess().getMultiplicationLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,52,FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getMulOrDivAccess().getAsteriskKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMiniJava_repl.g:2919:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalMiniJava_repl.g:2919:5: ( () otherlv_4= '/' )
            	            // InternalMiniJava_repl.g:2920:6: () otherlv_4= '/'
            	            {
            	            // InternalMiniJava_repl.g:2920:6: ()
            	            // InternalMiniJava_repl.g:2921:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getMulOrDivAccess().getDivisionLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,53,FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getMulOrDivAccess().getSolidusKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMiniJava_repl.g:2936:4: ( (lv_right_5_0= ruleArrayAccess ) )
            	    // InternalMiniJava_repl.g:2937:5: (lv_right_5_0= ruleArrayAccess )
            	    {
            	    // InternalMiniJava_repl.g:2937:5: (lv_right_5_0= ruleArrayAccess )
            	    // InternalMiniJava_repl.g:2938:6: lv_right_5_0= ruleArrayAccess
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightArrayAccessParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
            	    lv_right_5_0=ruleArrayAccess();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_5_0,
            	      							"org.tetrabox.minijava.xtext.MiniJava.ArrayAccess");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRuleArrayAccess"
    // InternalMiniJava_repl.g:2960:1: entryRuleArrayAccess returns [EObject current=null] : iv_ruleArrayAccess= ruleArrayAccess EOF ;
    public final EObject entryRuleArrayAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayAccess = null;


        try {
            // InternalMiniJava_repl.g:2960:52: (iv_ruleArrayAccess= ruleArrayAccess EOF )
            // InternalMiniJava_repl.g:2961:2: iv_ruleArrayAccess= ruleArrayAccess EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayAccessRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayAccess=ruleArrayAccess();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayAccess; 
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
    // $ANTLR end "entryRuleArrayAccess"


    // $ANTLR start "ruleArrayAccess"
    // InternalMiniJava_repl.g:2967:1: ruleArrayAccess returns [EObject current=null] : (this_ArrayLength_0= ruleArrayLength ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )? ) ;
    public final EObject ruleArrayAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ArrayLength_0 = null;

        EObject lv_index_3_0 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:2973:2: ( (this_ArrayLength_0= ruleArrayLength ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )? ) )
            // InternalMiniJava_repl.g:2974:2: (this_ArrayLength_0= ruleArrayLength ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )? )
            {
            // InternalMiniJava_repl.g:2974:2: (this_ArrayLength_0= ruleArrayLength ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )? )
            // InternalMiniJava_repl.g:2975:3: this_ArrayLength_0= ruleArrayLength ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getArrayAccessAccess().getArrayLengthParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_33);
            this_ArrayLength_0=ruleArrayLength();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ArrayLength_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniJava_repl.g:2986:3: ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==35) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMiniJava_repl.g:2987:4: () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']'
                    {
                    // InternalMiniJava_repl.g:2987:4: ()
                    // InternalMiniJava_repl.g:2988:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getArrayAccessAccess().getArrayAccessObjectAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,35,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getArrayAccessAccess().getLeftSquareBracketKeyword_1_1());
                      			
                    }
                    // InternalMiniJava_repl.g:3001:4: ( (lv_index_3_0= ruleExpression ) )
                    // InternalMiniJava_repl.g:3002:5: (lv_index_3_0= ruleExpression )
                    {
                    // InternalMiniJava_repl.g:3002:5: (lv_index_3_0= ruleExpression )
                    // InternalMiniJava_repl.g:3003:6: lv_index_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArrayAccessAccess().getIndexExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_34);
                    lv_index_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getArrayAccessRule());
                      						}
                      						set(
                      							current,
                      							"index",
                      							lv_index_3_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getArrayAccessAccess().getRightSquareBracketKeyword_1_3());
                      			
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
    // $ANTLR end "ruleArrayAccess"


    // $ANTLR start "entryRuleArrayLength"
    // InternalMiniJava_repl.g:3029:1: entryRuleArrayLength returns [EObject current=null] : iv_ruleArrayLength= ruleArrayLength EOF ;
    public final EObject entryRuleArrayLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayLength = null;


        try {
            // InternalMiniJava_repl.g:3029:52: (iv_ruleArrayLength= ruleArrayLength EOF )
            // InternalMiniJava_repl.g:3030:2: iv_ruleArrayLength= ruleArrayLength EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayLengthRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayLength=ruleArrayLength();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayLength; 
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
    // $ANTLR end "entryRuleArrayLength"


    // $ANTLR start "ruleArrayLength"
    // InternalMiniJava_repl.g:3036:1: ruleArrayLength returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= '.' otherlv_3= 'length' )? ) ;
    public final EObject ruleArrayLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Primary_0 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:3042:2: ( (this_Primary_0= rulePrimary ( () otherlv_2= '.' otherlv_3= 'length' )? ) )
            // InternalMiniJava_repl.g:3043:2: (this_Primary_0= rulePrimary ( () otherlv_2= '.' otherlv_3= 'length' )? )
            {
            // InternalMiniJava_repl.g:3043:2: (this_Primary_0= rulePrimary ( () otherlv_2= '.' otherlv_3= 'length' )? )
            // InternalMiniJava_repl.g:3044:3: this_Primary_0= rulePrimary ( () otherlv_2= '.' otherlv_3= 'length' )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getArrayLengthAccess().getPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_5);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Primary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniJava_repl.g:3055:3: ( () otherlv_2= '.' otherlv_3= 'length' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==13) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMiniJava_repl.g:3056:4: () otherlv_2= '.' otherlv_3= 'length'
                    {
                    // InternalMiniJava_repl.g:3056:4: ()
                    // InternalMiniJava_repl.g:3057:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getArrayLengthAccess().getArrayLengthArrayAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getArrayLengthAccess().getFullStopKeyword_1_1());
                      			
                    }
                    otherlv_3=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getArrayLengthAccess().getLengthKeyword_1_2());
                      			
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
    // $ANTLR end "ruleArrayLength"


    // $ANTLR start "entryRulePrimary"
    // InternalMiniJava_repl.g:3079:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMiniJava_repl.g:3079:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMiniJava_repl.g:3080:2: iv_rulePrimary= rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMiniJava_repl.g:3086:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( ( '!' )=>otherlv_4= '!' ) ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( ( '-' )=>otherlv_7= '-' ) ( (lv_expression_8_0= rulePrimary ) ) ) | this_SelectionExpression_9= ruleSelectionExpression ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject this_Expression_1 = null;

        EObject lv_expression_5_0 = null;

        EObject lv_expression_8_0 = null;

        EObject this_SelectionExpression_9 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:3092:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( ( '!' )=>otherlv_4= '!' ) ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( ( '-' )=>otherlv_7= '-' ) ( (lv_expression_8_0= rulePrimary ) ) ) | this_SelectionExpression_9= ruleSelectionExpression ) )
            // InternalMiniJava_repl.g:3093:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( ( '!' )=>otherlv_4= '!' ) ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( ( '-' )=>otherlv_7= '-' ) ( (lv_expression_8_0= rulePrimary ) ) ) | this_SelectionExpression_9= ruleSelectionExpression )
            {
            // InternalMiniJava_repl.g:3093:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( ( '!' )=>otherlv_4= '!' ) ( (lv_expression_5_0= rulePrimary ) ) ) | ( () ( ( '-' )=>otherlv_7= '-' ) ( (lv_expression_8_0= rulePrimary ) ) ) | this_SelectionExpression_9= ruleSelectionExpression )
            int alt47=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt47=1;
                }
                break;
            case 55:
                {
                alt47=2;
                }
                break;
            case 51:
                {
                alt47=3;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
                {
                alt47=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalMiniJava_repl.g:3094:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalMiniJava_repl.g:3094:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalMiniJava_repl.g:3095:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_29);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava_repl.g:3116:3: ( () ( ( '!' )=>otherlv_4= '!' ) ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // InternalMiniJava_repl.g:3116:3: ( () ( ( '!' )=>otherlv_4= '!' ) ( (lv_expression_5_0= rulePrimary ) ) )
                    // InternalMiniJava_repl.g:3117:4: () ( ( '!' )=>otherlv_4= '!' ) ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // InternalMiniJava_repl.g:3117:4: ()
                    // InternalMiniJava_repl.g:3118:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMiniJava_repl.g:3127:4: ( ( '!' )=>otherlv_4= '!' )
                    // InternalMiniJava_repl.g:3128:5: ( '!' )=>otherlv_4= '!'
                    {
                    otherlv_4=(Token)match(input,55,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                      				
                    }

                    }

                    // InternalMiniJava_repl.g:3134:4: ( (lv_expression_5_0= rulePrimary ) )
                    // InternalMiniJava_repl.g:3135:5: (lv_expression_5_0= rulePrimary )
                    {
                    // InternalMiniJava_repl.g:3135:5: (lv_expression_5_0= rulePrimary )
                    // InternalMiniJava_repl.g:3136:6: lv_expression_5_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_5_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_5_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.Primary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava_repl.g:3155:3: ( () ( ( '-' )=>otherlv_7= '-' ) ( (lv_expression_8_0= rulePrimary ) ) )
                    {
                    // InternalMiniJava_repl.g:3155:3: ( () ( ( '-' )=>otherlv_7= '-' ) ( (lv_expression_8_0= rulePrimary ) ) )
                    // InternalMiniJava_repl.g:3156:4: () ( ( '-' )=>otherlv_7= '-' ) ( (lv_expression_8_0= rulePrimary ) )
                    {
                    // InternalMiniJava_repl.g:3156:4: ()
                    // InternalMiniJava_repl.g:3157:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getNegAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMiniJava_repl.g:3166:4: ( ( '-' )=>otherlv_7= '-' )
                    // InternalMiniJava_repl.g:3167:5: ( '-' )=>otherlv_7= '-'
                    {
                    otherlv_7=(Token)match(input,51,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_2_1());
                      				
                    }

                    }

                    // InternalMiniJava_repl.g:3173:4: ( (lv_expression_8_0= rulePrimary ) )
                    // InternalMiniJava_repl.g:3174:5: (lv_expression_8_0= rulePrimary )
                    {
                    // InternalMiniJava_repl.g:3174:5: (lv_expression_8_0= rulePrimary )
                    // InternalMiniJava_repl.g:3175:6: lv_expression_8_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_8_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_8_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.Primary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava_repl.g:3194:3: this_SelectionExpression_9= ruleSelectionExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryAccess().getSelectionExpressionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SelectionExpression_9=ruleSelectionExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SelectionExpression_9;
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleSelectionExpression"
    // InternalMiniJava_repl.g:3209:1: entryRuleSelectionExpression returns [EObject current=null] : iv_ruleSelectionExpression= ruleSelectionExpression EOF ;
    public final EObject entryRuleSelectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionExpression = null;


        try {
            // InternalMiniJava_repl.g:3209:60: (iv_ruleSelectionExpression= ruleSelectionExpression EOF )
            // InternalMiniJava_repl.g:3210:2: iv_ruleSelectionExpression= ruleSelectionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectionExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSelectionExpression=ruleSelectionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectionExpression; 
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
    // $ANTLR end "entryRuleSelectionExpression"


    // $ANTLR start "ruleSelectionExpression"
    // InternalMiniJava_repl.g:3216:1: ruleSelectionExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) | ( () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( (lv_args_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )* )? otherlv_11= ')' ) )* ) ;
    public final EObject ruleSelectionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject this_TerminalExpression_0 = null;

        EObject lv_args_8_0 = null;

        EObject lv_args_10_0 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:3222:2: ( (this_TerminalExpression_0= ruleTerminalExpression ( ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) | ( () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( (lv_args_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )* )? otherlv_11= ')' ) )* ) )
            // InternalMiniJava_repl.g:3223:2: (this_TerminalExpression_0= ruleTerminalExpression ( ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) | ( () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( (lv_args_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )* )? otherlv_11= ')' ) )* )
            {
            // InternalMiniJava_repl.g:3223:2: (this_TerminalExpression_0= ruleTerminalExpression ( ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) | ( () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( (lv_args_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )* )? otherlv_11= ')' ) )* )
            // InternalMiniJava_repl.g:3224:3: this_TerminalExpression_0= ruleTerminalExpression ( ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) | ( () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( (lv_args_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )* )? otherlv_11= ')' ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSelectionExpressionAccess().getTerminalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_5);
            this_TerminalExpression_0=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_TerminalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniJava_repl.g:3235:3: ( ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) | ( () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( (lv_args_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )* )? otherlv_11= ')' ) )*
            loop50:
            do {
                int alt50=3;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==13) ) {
                    int LA50_2 = input.LA(2);

                    if ( (LA50_2==RULE_ID) ) {
                        int LA50_3 = input.LA(3);

                        if ( (LA50_3==24) ) {
                            alt50=2;
                        }
                        else if ( (LA50_3==EOF||(LA50_3>=12 && LA50_3<=13)||LA50_3==19||(LA50_3>=25 && LA50_3<=26)||(LA50_3>=35 && LA50_3<=36)||(LA50_3>=41 && LA50_3<=53)) ) {
                            alt50=1;
                        }


                    }


                }


                switch (alt50) {
            	case 1 :
            	    // InternalMiniJava_repl.g:3236:4: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalMiniJava_repl.g:3236:4: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    // InternalMiniJava_repl.g:3237:5: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalMiniJava_repl.g:3237:5: ()
            	    // InternalMiniJava_repl.g:3238:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getSelectionExpressionAccess().getFieldAccessReceiverAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,13,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getSelectionExpressionAccess().getFullStopKeyword_1_0_1());
            	      				
            	    }
            	    // InternalMiniJava_repl.g:3251:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalMiniJava_repl.g:3252:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalMiniJava_repl.g:3252:6: (otherlv_3= RULE_ID )
            	    // InternalMiniJava_repl.g:3253:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							/* */
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getSelectionExpressionRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getSelectionExpressionAccess().getFieldFieldCrossReference_1_0_2_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMiniJava_repl.g:3269:4: ( () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( (lv_args_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )* )? otherlv_11= ')' )
            	    {
            	    // InternalMiniJava_repl.g:3269:4: ( () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( (lv_args_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )* )? otherlv_11= ')' )
            	    // InternalMiniJava_repl.g:3270:5: () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= '(' ( ( (lv_args_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )* )? otherlv_11= ')'
            	    {
            	    // InternalMiniJava_repl.g:3270:5: ()
            	    // InternalMiniJava_repl.g:3271:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getSelectionExpressionAccess().getMethodCallReceiverAction_1_1_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_5=(Token)match(input,13,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getSelectionExpressionAccess().getFullStopKeyword_1_1_1());
            	      				
            	    }
            	    // InternalMiniJava_repl.g:3284:5: ( (otherlv_6= RULE_ID ) )
            	    // InternalMiniJava_repl.g:3285:6: (otherlv_6= RULE_ID )
            	    {
            	    // InternalMiniJava_repl.g:3285:6: (otherlv_6= RULE_ID )
            	    // InternalMiniJava_repl.g:3286:7: otherlv_6= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							/* */
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getSelectionExpressionRule());
            	      							}
            	      						
            	    }
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_6, grammarAccess.getSelectionExpressionAccess().getMethodMethodCrossReference_1_1_2_0());
            	      						
            	    }

            	    }


            	    }

            	    otherlv_7=(Token)match(input,24,FOLLOW_44); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_7, grammarAccess.getSelectionExpressionAccess().getLeftParenthesisKeyword_1_1_3());
            	      				
            	    }
            	    // InternalMiniJava_repl.g:3304:5: ( ( (lv_args_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )* )?
            	    int alt49=2;
            	    int LA49_0 = input.LA(1);

            	    if ( ((LA49_0>=RULE_ID && LA49_0<=RULE_INT)||LA49_0==24||LA49_0==51||(LA49_0>=55 && LA49_0<=62)) ) {
            	        alt49=1;
            	    }
            	    switch (alt49) {
            	        case 1 :
            	            // InternalMiniJava_repl.g:3305:6: ( (lv_args_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )*
            	            {
            	            // InternalMiniJava_repl.g:3305:6: ( (lv_args_8_0= ruleExpression ) )
            	            // InternalMiniJava_repl.g:3306:7: (lv_args_8_0= ruleExpression )
            	            {
            	            // InternalMiniJava_repl.g:3306:7: (lv_args_8_0= ruleExpression )
            	            // InternalMiniJava_repl.g:3307:8: lv_args_8_0= ruleExpression
            	            {
            	            if ( state.backtracking==0 ) {

            	              								newCompositeNode(grammarAccess.getSelectionExpressionAccess().getArgsExpressionParserRuleCall_1_1_4_0_0());
            	              							
            	            }
            	            pushFollow(FOLLOW_21);
            	            lv_args_8_0=ruleExpression();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElementForParent(grammarAccess.getSelectionExpressionRule());
            	              								}
            	              								add(
            	              									current,
            	              									"args",
            	              									lv_args_8_0,
            	              									"org.tetrabox.minijava.xtext.MiniJava.Expression");
            	              								afterParserOrEnumRuleCall();
            	              							
            	            }

            	            }


            	            }

            	            // InternalMiniJava_repl.g:3324:6: (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )*
            	            loop48:
            	            do {
            	                int alt48=2;
            	                int LA48_0 = input.LA(1);

            	                if ( (LA48_0==19) ) {
            	                    alt48=1;
            	                }


            	                switch (alt48) {
            	            	case 1 :
            	            	    // InternalMiniJava_repl.g:3325:7: otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) )
            	            	    {
            	            	    otherlv_9=(Token)match(input,19,FOLLOW_24); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      							newLeafNode(otherlv_9, grammarAccess.getSelectionExpressionAccess().getCommaKeyword_1_1_4_1_0());
            	            	      						
            	            	    }
            	            	    // InternalMiniJava_repl.g:3329:7: ( (lv_args_10_0= ruleExpression ) )
            	            	    // InternalMiniJava_repl.g:3330:8: (lv_args_10_0= ruleExpression )
            	            	    {
            	            	    // InternalMiniJava_repl.g:3330:8: (lv_args_10_0= ruleExpression )
            	            	    // InternalMiniJava_repl.g:3331:9: lv_args_10_0= ruleExpression
            	            	    {
            	            	    if ( state.backtracking==0 ) {

            	            	      									newCompositeNode(grammarAccess.getSelectionExpressionAccess().getArgsExpressionParserRuleCall_1_1_4_1_1_0());
            	            	      								
            	            	    }
            	            	    pushFollow(FOLLOW_21);
            	            	    lv_args_10_0=ruleExpression();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      									if (current==null) {
            	            	      										current = createModelElementForParent(grammarAccess.getSelectionExpressionRule());
            	            	      									}
            	            	      									add(
            	            	      										current,
            	            	      										"args",
            	            	      										lv_args_10_0,
            	            	      										"org.tetrabox.minijava.xtext.MiniJava.Expression");
            	            	      									afterParserOrEnumRuleCall();
            	            	      								
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop48;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    otherlv_11=(Token)match(input,25,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_11, grammarAccess.getSelectionExpressionAccess().getRightParenthesisKeyword_1_1_5());
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // $ANTLR end "ruleSelectionExpression"


    // $ANTLR start "entryRuleTerminalExpression"
    // InternalMiniJava_repl.g:3360:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // InternalMiniJava_repl.g:3360:59: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // InternalMiniJava_repl.g:3361:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTerminalExpression=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminalExpression; 
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
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // InternalMiniJava_repl.g:3367:1: ruleTerminalExpression returns [EObject current=null] : ( ( () otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '\\'\\'\\'' ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_INT ) ) ) | ( () ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) ) ) | ( () otherlv_11= 'this' ) | ( () otherlv_13= 'super' ) | ( () otherlv_15= 'null' ) | ( () otherlv_17= 'new' ( (otherlv_18= RULE_ID ) ) ( ( '(' )=>otherlv_19= '(' ) ( ( (lv_args_20_0= ruleExpression ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleExpression ) ) )* )? otherlv_23= ')' ) | ( () otherlv_25= 'new' ( (lv_type_26_0= ruleTypeRef ) ) ( ( '[' )=>otherlv_27= '[' ) ( (lv_size_28_0= ruleExpression ) ) otherlv_29= ']' ) | ( () ( (otherlv_31= RULE_ID ) ) ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token lv_value_5_0=null;
        Token lv_value_7_0=null;
        Token lv_value_9_1=null;
        Token lv_value_9_2=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        EObject lv_args_20_0 = null;

        EObject lv_args_22_0 = null;

        EObject lv_type_26_0 = null;

        EObject lv_size_28_0 = null;



        	enterRule();

        try {
            // InternalMiniJava_repl.g:3373:2: ( ( ( () otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '\\'\\'\\'' ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_INT ) ) ) | ( () ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) ) ) | ( () otherlv_11= 'this' ) | ( () otherlv_13= 'super' ) | ( () otherlv_15= 'null' ) | ( () otherlv_17= 'new' ( (otherlv_18= RULE_ID ) ) ( ( '(' )=>otherlv_19= '(' ) ( ( (lv_args_20_0= ruleExpression ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleExpression ) ) )* )? otherlv_23= ')' ) | ( () otherlv_25= 'new' ( (lv_type_26_0= ruleTypeRef ) ) ( ( '[' )=>otherlv_27= '[' ) ( (lv_size_28_0= ruleExpression ) ) otherlv_29= ']' ) | ( () ( (otherlv_31= RULE_ID ) ) ) ) )
            // InternalMiniJava_repl.g:3374:2: ( ( () otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '\\'\\'\\'' ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_INT ) ) ) | ( () ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) ) ) | ( () otherlv_11= 'this' ) | ( () otherlv_13= 'super' ) | ( () otherlv_15= 'null' ) | ( () otherlv_17= 'new' ( (otherlv_18= RULE_ID ) ) ( ( '(' )=>otherlv_19= '(' ) ( ( (lv_args_20_0= ruleExpression ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleExpression ) ) )* )? otherlv_23= ')' ) | ( () otherlv_25= 'new' ( (lv_type_26_0= ruleTypeRef ) ) ( ( '[' )=>otherlv_27= '[' ) ( (lv_size_28_0= ruleExpression ) ) otherlv_29= ']' ) | ( () ( (otherlv_31= RULE_ID ) ) ) )
            {
            // InternalMiniJava_repl.g:3374:2: ( ( () otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '\\'\\'\\'' ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_INT ) ) ) | ( () ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) ) ) | ( () otherlv_11= 'this' ) | ( () otherlv_13= 'super' ) | ( () otherlv_15= 'null' ) | ( () otherlv_17= 'new' ( (otherlv_18= RULE_ID ) ) ( ( '(' )=>otherlv_19= '(' ) ( ( (lv_args_20_0= ruleExpression ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleExpression ) ) )* )? otherlv_23= ')' ) | ( () otherlv_25= 'new' ( (lv_type_26_0= ruleTypeRef ) ) ( ( '[' )=>otherlv_27= '[' ) ( (lv_size_28_0= ruleExpression ) ) otherlv_29= ']' ) | ( () ( (otherlv_31= RULE_ID ) ) ) )
            int alt54=10;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // InternalMiniJava_repl.g:3375:3: ( () otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '\\'\\'\\'' )
                    {
                    // InternalMiniJava_repl.g:3375:3: ( () otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '\\'\\'\\'' )
                    // InternalMiniJava_repl.g:3376:4: () otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '\\'\\'\\''
                    {
                    // InternalMiniJava_repl.g:3376:4: ()
                    // InternalMiniJava_repl.g:3377:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getNativeExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,56,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTerminalExpressionAccess().getApostropheApostropheApostropheKeyword_0_1());
                      			
                    }
                    // InternalMiniJava_repl.g:3390:4: ( (lv_value_2_0= RULE_STRING ) )
                    // InternalMiniJava_repl.g:3391:5: (lv_value_2_0= RULE_STRING )
                    {
                    // InternalMiniJava_repl.g:3391:5: (lv_value_2_0= RULE_STRING )
                    // InternalMiniJava_repl.g:3392:6: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_2_0, grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_2_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getTerminalExpressionAccess().getApostropheApostropheApostropheKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava_repl.g:3414:3: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    {
                    // InternalMiniJava_repl.g:3414:3: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    // InternalMiniJava_repl.g:3415:4: () ( (lv_value_5_0= RULE_STRING ) )
                    {
                    // InternalMiniJava_repl.g:3415:4: ()
                    // InternalMiniJava_repl.g:3416:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getStringConstantAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMiniJava_repl.g:3425:4: ( (lv_value_5_0= RULE_STRING ) )
                    // InternalMiniJava_repl.g:3426:5: (lv_value_5_0= RULE_STRING )
                    {
                    // InternalMiniJava_repl.g:3426:5: (lv_value_5_0= RULE_STRING )
                    // InternalMiniJava_repl.g:3427:6: lv_value_5_0= RULE_STRING
                    {
                    lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_5_0, grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_5_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava_repl.g:3445:3: ( () ( (lv_value_7_0= RULE_INT ) ) )
                    {
                    // InternalMiniJava_repl.g:3445:3: ( () ( (lv_value_7_0= RULE_INT ) ) )
                    // InternalMiniJava_repl.g:3446:4: () ( (lv_value_7_0= RULE_INT ) )
                    {
                    // InternalMiniJava_repl.g:3446:4: ()
                    // InternalMiniJava_repl.g:3447:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getIntConstantAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMiniJava_repl.g:3456:4: ( (lv_value_7_0= RULE_INT ) )
                    // InternalMiniJava_repl.g:3457:5: (lv_value_7_0= RULE_INT )
                    {
                    // InternalMiniJava_repl.g:3457:5: (lv_value_7_0= RULE_INT )
                    // InternalMiniJava_repl.g:3458:6: lv_value_7_0= RULE_INT
                    {
                    lv_value_7_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_7_0, grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_7_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava_repl.g:3476:3: ( () ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) ) )
                    {
                    // InternalMiniJava_repl.g:3476:3: ( () ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) ) )
                    // InternalMiniJava_repl.g:3477:4: () ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) )
                    {
                    // InternalMiniJava_repl.g:3477:4: ()
                    // InternalMiniJava_repl.g:3478:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getBoolConstantAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMiniJava_repl.g:3487:4: ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) )
                    // InternalMiniJava_repl.g:3488:5: ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) )
                    {
                    // InternalMiniJava_repl.g:3488:5: ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) )
                    // InternalMiniJava_repl.g:3489:6: (lv_value_9_1= 'true' | lv_value_9_2= 'false' )
                    {
                    // InternalMiniJava_repl.g:3489:6: (lv_value_9_1= 'true' | lv_value_9_2= 'false' )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==57) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==58) ) {
                        alt51=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalMiniJava_repl.g:3490:7: lv_value_9_1= 'true'
                            {
                            lv_value_9_1=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_9_1, grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_3_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTerminalExpressionRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_9_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalMiniJava_repl.g:3501:7: lv_value_9_2= 'false'
                            {
                            lv_value_9_2=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_9_2, grammarAccess.getTerminalExpressionAccess().getValueFalseKeyword_3_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTerminalExpressionRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_9_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMiniJava_repl.g:3516:3: ( () otherlv_11= 'this' )
                    {
                    // InternalMiniJava_repl.g:3516:3: ( () otherlv_11= 'this' )
                    // InternalMiniJava_repl.g:3517:4: () otherlv_11= 'this'
                    {
                    // InternalMiniJava_repl.g:3517:4: ()
                    // InternalMiniJava_repl.g:3518:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getThisAction_4_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_11=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getTerminalExpressionAccess().getThisKeyword_4_1());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMiniJava_repl.g:3533:3: ( () otherlv_13= 'super' )
                    {
                    // InternalMiniJava_repl.g:3533:3: ( () otherlv_13= 'super' )
                    // InternalMiniJava_repl.g:3534:4: () otherlv_13= 'super'
                    {
                    // InternalMiniJava_repl.g:3534:4: ()
                    // InternalMiniJava_repl.g:3535:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getSuperAction_5_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_13=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getTerminalExpressionAccess().getSuperKeyword_5_1());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMiniJava_repl.g:3550:3: ( () otherlv_15= 'null' )
                    {
                    // InternalMiniJava_repl.g:3550:3: ( () otherlv_15= 'null' )
                    // InternalMiniJava_repl.g:3551:4: () otherlv_15= 'null'
                    {
                    // InternalMiniJava_repl.g:3551:4: ()
                    // InternalMiniJava_repl.g:3552:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getNullAction_6_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_15=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getTerminalExpressionAccess().getNullKeyword_6_1());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMiniJava_repl.g:3567:3: ( () otherlv_17= 'new' ( (otherlv_18= RULE_ID ) ) ( ( '(' )=>otherlv_19= '(' ) ( ( (lv_args_20_0= ruleExpression ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleExpression ) ) )* )? otherlv_23= ')' )
                    {
                    // InternalMiniJava_repl.g:3567:3: ( () otherlv_17= 'new' ( (otherlv_18= RULE_ID ) ) ( ( '(' )=>otherlv_19= '(' ) ( ( (lv_args_20_0= ruleExpression ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleExpression ) ) )* )? otherlv_23= ')' )
                    // InternalMiniJava_repl.g:3568:4: () otherlv_17= 'new' ( (otherlv_18= RULE_ID ) ) ( ( '(' )=>otherlv_19= '(' ) ( ( (lv_args_20_0= ruleExpression ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleExpression ) ) )* )? otherlv_23= ')'
                    {
                    // InternalMiniJava_repl.g:3568:4: ()
                    // InternalMiniJava_repl.g:3569:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getNewObjectAction_7_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_17=(Token)match(input,62,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getTerminalExpressionAccess().getNewKeyword_7_1());
                      			
                    }
                    // InternalMiniJava_repl.g:3582:4: ( (otherlv_18= RULE_ID ) )
                    // InternalMiniJava_repl.g:3583:5: (otherlv_18= RULE_ID )
                    {
                    // InternalMiniJava_repl.g:3583:5: (otherlv_18= RULE_ID )
                    // InternalMiniJava_repl.g:3584:6: otherlv_18= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      					
                    }
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_18, grammarAccess.getTerminalExpressionAccess().getTypeClazzCrossReference_7_2_0());
                      					
                    }

                    }


                    }

                    // InternalMiniJava_repl.g:3598:4: ( ( '(' )=>otherlv_19= '(' )
                    // InternalMiniJava_repl.g:3599:5: ( '(' )=>otherlv_19= '('
                    {
                    otherlv_19=(Token)match(input,24,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_19, grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_7_3());
                      				
                    }

                    }

                    // InternalMiniJava_repl.g:3605:4: ( ( (lv_args_20_0= ruleExpression ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleExpression ) ) )* )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( ((LA53_0>=RULE_ID && LA53_0<=RULE_INT)||LA53_0==24||LA53_0==51||(LA53_0>=55 && LA53_0<=62)) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalMiniJava_repl.g:3606:5: ( (lv_args_20_0= ruleExpression ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleExpression ) ) )*
                            {
                            // InternalMiniJava_repl.g:3606:5: ( (lv_args_20_0= ruleExpression ) )
                            // InternalMiniJava_repl.g:3607:6: (lv_args_20_0= ruleExpression )
                            {
                            // InternalMiniJava_repl.g:3607:6: (lv_args_20_0= ruleExpression )
                            // InternalMiniJava_repl.g:3608:7: lv_args_20_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTerminalExpressionAccess().getArgsExpressionParserRuleCall_7_4_0_0());
                              						
                            }
                            pushFollow(FOLLOW_21);
                            lv_args_20_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                              							}
                              							add(
                              								current,
                              								"args",
                              								lv_args_20_0,
                              								"org.tetrabox.minijava.xtext.MiniJava.Expression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalMiniJava_repl.g:3625:5: (otherlv_21= ',' ( (lv_args_22_0= ruleExpression ) ) )*
                            loop52:
                            do {
                                int alt52=2;
                                int LA52_0 = input.LA(1);

                                if ( (LA52_0==19) ) {
                                    alt52=1;
                                }


                                switch (alt52) {
                            	case 1 :
                            	    // InternalMiniJava_repl.g:3626:6: otherlv_21= ',' ( (lv_args_22_0= ruleExpression ) )
                            	    {
                            	    otherlv_21=(Token)match(input,19,FOLLOW_24); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_21, grammarAccess.getTerminalExpressionAccess().getCommaKeyword_7_4_1_0());
                            	      					
                            	    }
                            	    // InternalMiniJava_repl.g:3630:6: ( (lv_args_22_0= ruleExpression ) )
                            	    // InternalMiniJava_repl.g:3631:7: (lv_args_22_0= ruleExpression )
                            	    {
                            	    // InternalMiniJava_repl.g:3631:7: (lv_args_22_0= ruleExpression )
                            	    // InternalMiniJava_repl.g:3632:8: lv_args_22_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getTerminalExpressionAccess().getArgsExpressionParserRuleCall_7_4_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_21);
                            	    lv_args_22_0=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"args",
                            	      									lv_args_22_0,
                            	      									"org.tetrabox.minijava.xtext.MiniJava.Expression");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop52;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_23=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_7_5());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalMiniJava_repl.g:3657:3: ( () otherlv_25= 'new' ( (lv_type_26_0= ruleTypeRef ) ) ( ( '[' )=>otherlv_27= '[' ) ( (lv_size_28_0= ruleExpression ) ) otherlv_29= ']' )
                    {
                    // InternalMiniJava_repl.g:3657:3: ( () otherlv_25= 'new' ( (lv_type_26_0= ruleTypeRef ) ) ( ( '[' )=>otherlv_27= '[' ) ( (lv_size_28_0= ruleExpression ) ) otherlv_29= ']' )
                    // InternalMiniJava_repl.g:3658:4: () otherlv_25= 'new' ( (lv_type_26_0= ruleTypeRef ) ) ( ( '[' )=>otherlv_27= '[' ) ( (lv_size_28_0= ruleExpression ) ) otherlv_29= ']'
                    {
                    // InternalMiniJava_repl.g:3658:4: ()
                    // InternalMiniJava_repl.g:3659:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getNewArrayAction_8_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_25=(Token)match(input,62,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getTerminalExpressionAccess().getNewKeyword_8_1());
                      			
                    }
                    // InternalMiniJava_repl.g:3672:4: ( (lv_type_26_0= ruleTypeRef ) )
                    // InternalMiniJava_repl.g:3673:5: (lv_type_26_0= ruleTypeRef )
                    {
                    // InternalMiniJava_repl.g:3673:5: (lv_type_26_0= ruleTypeRef )
                    // InternalMiniJava_repl.g:3674:6: lv_type_26_0= ruleTypeRef
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getTypeTypeRefParserRuleCall_8_2_0());
                      					
                    }
                    pushFollow(FOLLOW_47);
                    lv_type_26_0=ruleTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_26_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.TypeRef");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMiniJava_repl.g:3691:4: ( ( '[' )=>otherlv_27= '[' )
                    // InternalMiniJava_repl.g:3692:5: ( '[' )=>otherlv_27= '['
                    {
                    otherlv_27=(Token)match(input,35,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_27, grammarAccess.getTerminalExpressionAccess().getLeftSquareBracketKeyword_8_3());
                      				
                    }

                    }

                    // InternalMiniJava_repl.g:3698:4: ( (lv_size_28_0= ruleExpression ) )
                    // InternalMiniJava_repl.g:3699:5: (lv_size_28_0= ruleExpression )
                    {
                    // InternalMiniJava_repl.g:3699:5: (lv_size_28_0= ruleExpression )
                    // InternalMiniJava_repl.g:3700:6: lv_size_28_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getSizeExpressionParserRuleCall_8_4_0());
                      					
                    }
                    pushFollow(FOLLOW_34);
                    lv_size_28_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                      						}
                      						set(
                      							current,
                      							"size",
                      							lv_size_28_0,
                      							"org.tetrabox.minijava.xtext.MiniJava.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_29=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_29, grammarAccess.getTerminalExpressionAccess().getRightSquareBracketKeyword_8_5());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalMiniJava_repl.g:3723:3: ( () ( (otherlv_31= RULE_ID ) ) )
                    {
                    // InternalMiniJava_repl.g:3723:3: ( () ( (otherlv_31= RULE_ID ) ) )
                    // InternalMiniJava_repl.g:3724:4: () ( (otherlv_31= RULE_ID ) )
                    {
                    // InternalMiniJava_repl.g:3724:4: ()
                    // InternalMiniJava_repl.g:3725:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getSymbolRefAction_9_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMiniJava_repl.g:3734:4: ( (otherlv_31= RULE_ID ) )
                    // InternalMiniJava_repl.g:3735:5: (otherlv_31= RULE_ID )
                    {
                    // InternalMiniJava_repl.g:3735:5: (otherlv_31= RULE_ID )
                    // InternalMiniJava_repl.g:3736:6: otherlv_31= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalExpressionRule());
                      						}
                      					
                    }
                    otherlv_31=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_31, grammarAccess.getTerminalExpressionAccess().getSymbolSymbolCrossReference_9_1_0());
                      					
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
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "ruleAccessLevel"
    // InternalMiniJava_repl.g:3755:1: ruleAccessLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'private' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'public' ) ) ;
    public final Enumerator ruleAccessLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMiniJava_repl.g:3761:2: ( ( (enumLiteral_0= 'private' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'public' ) ) )
            // InternalMiniJava_repl.g:3762:2: ( (enumLiteral_0= 'private' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'public' ) )
            {
            // InternalMiniJava_repl.g:3762:2: ( (enumLiteral_0= 'private' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'public' ) )
            int alt55=3;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt55=1;
                }
                break;
            case 64:
                {
                alt55=2;
                }
                break;
            case 65:
                {
                alt55=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalMiniJava_repl.g:3763:3: (enumLiteral_0= 'private' )
                    {
                    // InternalMiniJava_repl.g:3763:3: (enumLiteral_0= 'private' )
                    // InternalMiniJava_repl.g:3764:4: enumLiteral_0= 'private'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAccessLevelAccess().getPRIVATEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getAccessLevelAccess().getPRIVATEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava_repl.g:3771:3: (enumLiteral_1= 'protected' )
                    {
                    // InternalMiniJava_repl.g:3771:3: (enumLiteral_1= 'protected' )
                    // InternalMiniJava_repl.g:3772:4: enumLiteral_1= 'protected'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAccessLevelAccess().getPROTECTEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getAccessLevelAccess().getPROTECTEDEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava_repl.g:3779:3: (enumLiteral_2= 'public' )
                    {
                    // InternalMiniJava_repl.g:3779:3: (enumLiteral_2= 'public' )
                    // InternalMiniJava_repl.g:3780:4: enumLiteral_2= 'public'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAccessLevelAccess().getPUBLICEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getAccessLevelAccess().getPUBLICEnumLiteralDeclaration_2());
                      			
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
    // $ANTLR end "ruleAccessLevel"

    // $ANTLR start synpred2_InternalMiniJava_repl
    public final void synpred2_InternalMiniJava_repl_fragment() throws RecognitionException {   
        EObject lv_original_1_0 = null;


        // InternalMiniJava_repl.g:128:3: ( ( () ( (lv_original_1_0= ruleTypeDeclaration ) ) ) )
        // InternalMiniJava_repl.g:128:3: ( () ( (lv_original_1_0= ruleTypeDeclaration ) ) )
        {
        // InternalMiniJava_repl.g:128:3: ( () ( (lv_original_1_0= ruleTypeDeclaration ) ) )
        // InternalMiniJava_repl.g:129:4: () ( (lv_original_1_0= ruleTypeDeclaration ) )
        {
        // InternalMiniJava_repl.g:129:4: ()
        // InternalMiniJava_repl.g:130:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalMiniJava_repl.g:139:4: ( (lv_original_1_0= ruleTypeDeclaration ) )
        // InternalMiniJava_repl.g:140:5: (lv_original_1_0= ruleTypeDeclaration )
        {
        // InternalMiniJava_repl.g:140:5: (lv_original_1_0= ruleTypeDeclaration )
        // InternalMiniJava_repl.g:141:6: lv_original_1_0= ruleTypeDeclaration
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getInterpretableInstructionAccess().getOriginalTypeDeclarationParserRuleCall_0_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_original_1_0=ruleTypeDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalMiniJava_repl

    // $ANTLR start synpred5_InternalMiniJava_repl
    public final void synpred5_InternalMiniJava_repl_fragment() throws RecognitionException {   
        EObject lv_original_7_0 = null;


        // InternalMiniJava_repl.g:224:3: ( ( () ( (lv_original_7_0= ruleVariableDeclaration ) ) ) )
        // InternalMiniJava_repl.g:224:3: ( () ( (lv_original_7_0= ruleVariableDeclaration ) ) )
        {
        // InternalMiniJava_repl.g:224:3: ( () ( (lv_original_7_0= ruleVariableDeclaration ) ) )
        // InternalMiniJava_repl.g:225:4: () ( (lv_original_7_0= ruleVariableDeclaration ) )
        {
        // InternalMiniJava_repl.g:225:4: ()
        // InternalMiniJava_repl.g:226:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalMiniJava_repl.g:235:4: ( (lv_original_7_0= ruleVariableDeclaration ) )
        // InternalMiniJava_repl.g:236:5: (lv_original_7_0= ruleVariableDeclaration )
        {
        // InternalMiniJava_repl.g:236:5: (lv_original_7_0= ruleVariableDeclaration )
        // InternalMiniJava_repl.g:237:6: lv_original_7_0= ruleVariableDeclaration
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getInterpretableInstructionAccess().getOriginalVariableDeclarationParserRuleCall_3_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_original_7_0=ruleVariableDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalMiniJava_repl

    // $ANTLR start synpred6_InternalMiniJava_repl
    public final void synpred6_InternalMiniJava_repl_fragment() throws RecognitionException {   
        EObject lv_original_9_0 = null;


        // InternalMiniJava_repl.g:256:3: ( ( () ( (lv_original_9_0= ruleAssignment ) ) ) )
        // InternalMiniJava_repl.g:256:3: ( () ( (lv_original_9_0= ruleAssignment ) ) )
        {
        // InternalMiniJava_repl.g:256:3: ( () ( (lv_original_9_0= ruleAssignment ) ) )
        // InternalMiniJava_repl.g:257:4: () ( (lv_original_9_0= ruleAssignment ) )
        {
        // InternalMiniJava_repl.g:257:4: ()
        // InternalMiniJava_repl.g:258:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalMiniJava_repl.g:267:4: ( (lv_original_9_0= ruleAssignment ) )
        // InternalMiniJava_repl.g:268:5: (lv_original_9_0= ruleAssignment )
        {
        // InternalMiniJava_repl.g:268:5: (lv_original_9_0= ruleAssignment )
        // InternalMiniJava_repl.g:269:6: lv_original_9_0= ruleAssignment
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getInterpretableInstructionAccess().getOriginalAssignmentParserRuleCall_4_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_original_9_0=ruleAssignment();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalMiniJava_repl

    // $ANTLR start synpred10_InternalMiniJava_repl
    public final void synpred10_InternalMiniJava_repl_fragment() throws RecognitionException {   
        EObject lv_original_17_0 = null;


        // InternalMiniJava_repl.g:384:3: ( ( () ( (lv_original_17_0= ruleMethod ) ) ) )
        // InternalMiniJava_repl.g:384:3: ( () ( (lv_original_17_0= ruleMethod ) ) )
        {
        // InternalMiniJava_repl.g:384:3: ( () ( (lv_original_17_0= ruleMethod ) ) )
        // InternalMiniJava_repl.g:385:4: () ( (lv_original_17_0= ruleMethod ) )
        {
        // InternalMiniJava_repl.g:385:4: ()
        // InternalMiniJava_repl.g:386:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalMiniJava_repl.g:395:4: ( (lv_original_17_0= ruleMethod ) )
        // InternalMiniJava_repl.g:396:5: (lv_original_17_0= ruleMethod )
        {
        // InternalMiniJava_repl.g:396:5: (lv_original_17_0= ruleMethod )
        // InternalMiniJava_repl.g:397:6: lv_original_17_0= ruleMethod
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getInterpretableInstructionAccess().getOriginalMethodParserRuleCall_8_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_original_17_0=ruleMethod();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalMiniJava_repl

    // $ANTLR start synpred37_InternalMiniJava_repl
    public final void synpred37_InternalMiniJava_repl_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        EObject this_Assignment_2 = null;


        // InternalMiniJava_repl.g:1429:3: ( ( ( ( ruleAssignment )=>this_Assignment_2= ruleAssignment ) otherlv_3= ';' ) )
        // InternalMiniJava_repl.g:1429:3: ( ( ( ruleAssignment )=>this_Assignment_2= ruleAssignment ) otherlv_3= ';' )
        {
        // InternalMiniJava_repl.g:1429:3: ( ( ( ruleAssignment )=>this_Assignment_2= ruleAssignment ) otherlv_3= ';' )
        // InternalMiniJava_repl.g:1430:4: ( ( ruleAssignment )=>this_Assignment_2= ruleAssignment ) otherlv_3= ';'
        {
        // InternalMiniJava_repl.g:1430:4: ( ( ruleAssignment )=>this_Assignment_2= ruleAssignment )
        // InternalMiniJava_repl.g:1431:5: ( ruleAssignment )=>this_Assignment_2= ruleAssignment
        {
        pushFollow(FOLLOW_4);
        this_Assignment_2=ruleAssignment();

        state._fsp--;
        if (state.failed) return ;

        }

        otherlv_3=(Token)match(input,12,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred37_InternalMiniJava_repl

    // $ANTLR start synpred52_InternalMiniJava_repl
    public final void synpred52_InternalMiniJava_repl_fragment() throws RecognitionException {   
        EObject this_Parameter_0 = null;


        // InternalMiniJava_repl.g:2167:3: ( ( ( ruleParameter )=>this_Parameter_0= ruleParameter ) )
        // InternalMiniJava_repl.g:2167:3: ( ( ruleParameter )=>this_Parameter_0= ruleParameter )
        {
        // InternalMiniJava_repl.g:2167:3: ( ( ruleParameter )=>this_Parameter_0= ruleParameter )
        // InternalMiniJava_repl.g:2168:4: ( ruleParameter )=>this_Parameter_0= ruleParameter
        {
        pushFollow(FOLLOW_2);
        this_Parameter_0=ruleParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred52_InternalMiniJava_repl

    // Delegated rules

    public final boolean synpred52_InternalMiniJava_repl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_InternalMiniJava_repl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalMiniJava_repl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalMiniJava_repl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalMiniJava_repl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalMiniJava_repl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalMiniJava_repl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalMiniJava_repl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalMiniJava_repl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalMiniJava_repl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalMiniJava_repl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalMiniJava_repl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA54 dfa54 = new DFA54(this);
    static final String dfa_1s = "\41\uffff";
    static final String dfa_2s = "\1\4\4\0\4\uffff\21\0\7\uffff";
    static final String dfa_3s = "\1\101\4\0\4\uffff\21\0\7\uffff";
    static final String dfa_4s = "\5\uffff\1\1\1\uffff\1\2\1\3\21\uffff\1\6\1\7\1\10\1\11\1\4\1\5\1\12";
    static final String dfa_5s = "\1\uffff\1\0\1\1\1\2\1\3\4\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\11\1\22\1\23\4\uffff\1\7\3\uffff\1\4\1\5\3\uffff\1\10\1\uffff\1\5\1\35\1\16\6\uffff\1\33\1\uffff\1\34\1\32\2\uffff\1\12\1\13\1\14\1\15\12\uffff\1\20\3\uffff\1\17\1\21\1\24\1\25\1\26\1\27\1\30\1\31\1\1\1\2\1\3",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "127:2: ( ( () ( (lv_original_1_0= ruleTypeDeclaration ) ) ) | ( () ( (lv_original_3_0= ruleImport ) ) ) | ( () ( (lv_original_5_0= ruleBlock ) ) ) | ( () ( (lv_original_7_0= ruleVariableDeclaration ) ) ) | ( () ( (lv_original_9_0= ruleAssignment ) ) ) | ( () ( (lv_original_11_0= ruleForStatement ) ) ) | ( () ( (lv_original_13_0= ruleIfStatement ) ) ) | ( () ( (lv_original_15_0= ruleWhileStatement ) ) ) | ( () ( (lv_original_17_0= ruleMethod ) ) ) | ( () ( (lv_original_19_0= ruleExpression ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_1 = input.LA(1);

                         
                        int index2_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMiniJava_repl()) ) {s = 5;}

                        else if ( (synpred10_InternalMiniJava_repl()) ) {s = 29;}

                         
                        input.seek(index2_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_2 = input.LA(1);

                         
                        int index2_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMiniJava_repl()) ) {s = 5;}

                        else if ( (synpred10_InternalMiniJava_repl()) ) {s = 29;}

                         
                        input.seek(index2_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_3 = input.LA(1);

                         
                        int index2_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMiniJava_repl()) ) {s = 5;}

                        else if ( (synpred10_InternalMiniJava_repl()) ) {s = 29;}

                         
                        input.seek(index2_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_4 = input.LA(1);

                         
                        int index2_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMiniJava_repl()) ) {s = 5;}

                        else if ( (synpred10_InternalMiniJava_repl()) ) {s = 29;}

                         
                        input.seek(index2_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_9 = input.LA(1);

                         
                        int index2_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalMiniJava_repl()) ) {s = 30;}

                        else if ( (synpred6_InternalMiniJava_repl()) ) {s = 31;}

                        else if ( (synpred10_InternalMiniJava_repl()) ) {s = 29;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index2_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_10 = input.LA(1);

                         
                        int index2_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalMiniJava_repl()) ) {s = 30;}

                        else if ( (synpred6_InternalMiniJava_repl()) ) {s = 31;}

                        else if ( (synpred10_InternalMiniJava_repl()) ) {s = 29;}

                         
                        input.seek(index2_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA2_11 = input.LA(1);

                         
                        int index2_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalMiniJava_repl()) ) {s = 30;}

                        else if ( (synpred6_InternalMiniJava_repl()) ) {s = 31;}

                        else if ( (synpred10_InternalMiniJava_repl()) ) {s = 29;}

                         
                        input.seek(index2_11);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA2_12 = input.LA(1);

                         
                        int index2_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalMiniJava_repl()) ) {s = 30;}

                        else if ( (synpred6_InternalMiniJava_repl()) ) {s = 31;}

                        else if ( (synpred10_InternalMiniJava_repl()) ) {s = 29;}

                         
                        input.seek(index2_12);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA2_13 = input.LA(1);

                         
                        int index2_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalMiniJava_repl()) ) {s = 30;}

                        else if ( (synpred6_InternalMiniJava_repl()) ) {s = 31;}

                        else if ( (synpred10_InternalMiniJava_repl()) ) {s = 29;}

                         
                        input.seek(index2_13);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA2_14 = input.LA(1);

                         
                        int index2_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalMiniJava_repl()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index2_14);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA2_15 = input.LA(1);

                         
                        int index2_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalMiniJava_repl()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index2_15);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA2_16 = input.LA(1);

                         
                        int index2_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalMiniJava_repl()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index2_16);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA2_17 = input.LA(1);

                         
                        int index2_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalMiniJava_repl()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index2_17);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA2_18 = input.LA(1);

                         
                        int index2_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalMiniJava_repl()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index2_18);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA2_19 = input.LA(1);

                         
                        int index2_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalMiniJava_repl()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index2_19);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA2_20 = input.LA(1);

                         
                        int index2_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalMiniJava_repl()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index2_20);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA2_21 = input.LA(1);

                         
                        int index2_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalMiniJava_repl()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index2_21);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA2_22 = input.LA(1);

                         
                        int index2_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalMiniJava_repl()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index2_22);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA2_23 = input.LA(1);

                         
                        int index2_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalMiniJava_repl()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index2_23);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA2_24 = input.LA(1);

                         
                        int index2_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalMiniJava_repl()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index2_24);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA2_25 = input.LA(1);

                         
                        int index2_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalMiniJava_repl()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index2_25);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\20\uffff";
    static final String dfa_8s = "\11\4\1\uffff\1\4\1\44\1\14\2\4\1\uffff";
    static final String dfa_9s = "\1\101\3\50\5\43\1\uffff\1\4\1\44\1\32\1\43\1\30\1\uffff";
    static final String dfa_10s = "\11\uffff\1\2\5\uffff\1\1";
    static final String dfa_11s = "\20\uffff}>";
    static final String[] dfa_12s = {
            "\1\4\12\uffff\1\11\7\uffff\1\11\15\uffff\1\5\1\6\1\7\1\10\26\uffff\1\1\1\2\1\3",
            "\1\4\12\uffff\1\11\7\uffff\1\11\15\uffff\1\5\1\6\1\7\1\10",
            "\1\4\12\uffff\1\11\7\uffff\1\11\15\uffff\1\5\1\6\1\7\1\10",
            "\1\4\12\uffff\1\11\7\uffff\1\11\15\uffff\1\5\1\6\1\7\1\10",
            "\1\14\10\uffff\1\12\12\uffff\1\11\12\uffff\1\13",
            "\1\14\23\uffff\1\11\12\uffff\1\13",
            "\1\14\23\uffff\1\11\12\uffff\1\13",
            "\1\14\23\uffff\1\11\12\uffff\1\13",
            "\1\14\23\uffff\1\11\12\uffff\1\13",
            "",
            "\1\15",
            "\1\16",
            "\1\17\13\uffff\1\11\1\uffff\1\17",
            "\1\14\10\uffff\1\12\12\uffff\1\11\12\uffff\1\13",
            "\1\14\23\uffff\1\11",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "969:2: (this_Field_0= ruleField | this_Method_1= ruleMethod )";
        }
    }
    static final String dfa_13s = "\31\uffff";
    static final String dfa_14s = "\1\4\4\uffff\12\0\12\uffff";
    static final String dfa_15s = "\1\76\4\uffff\12\0\12\uffff";
    static final String dfa_16s = "\1\uffff\1\1\1\2\20\uffff\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_17s = "\5\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\12\uffff}>";
    static final String[] dfa_18s = {
            "\1\16\1\6\1\7\15\uffff\1\27\3\uffff\1\2\2\uffff\1\26\2\uffff\1\1\1\23\1\uffff\1\24\1\25\2\uffff\4\2\12\uffff\1\2\3\uffff\1\2\1\5\1\10\1\11\1\12\1\13\1\14\1\15",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "1410:2: ( (this_Return_0= ruleReturn otherlv_1= ';' ) | ( ( ( ruleAssignment )=>this_Assignment_2= ruleAssignment ) otherlv_3= ';' ) | this_IfStatement_4= ruleIfStatement | this_WhileStatement_5= ruleWhileStatement | this_ForStatement_6= ruleForStatement | (this_PrintStatement_7= rulePrintStatement otherlv_8= ';' ) | this_Block_9= ruleBlock | (this_SelectionExpression_10= ruleSelectionExpression otherlv_11= ';' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_5 = input.LA(1);

                         
                        int index27_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalMiniJava_repl()) ) {s = 2;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_6 = input.LA(1);

                         
                        int index27_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalMiniJava_repl()) ) {s = 2;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_7 = input.LA(1);

                         
                        int index27_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalMiniJava_repl()) ) {s = 2;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA27_8 = input.LA(1);

                         
                        int index27_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalMiniJava_repl()) ) {s = 2;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA27_9 = input.LA(1);

                         
                        int index27_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalMiniJava_repl()) ) {s = 2;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA27_10 = input.LA(1);

                         
                        int index27_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalMiniJava_repl()) ) {s = 2;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA27_11 = input.LA(1);

                         
                        int index27_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalMiniJava_repl()) ) {s = 2;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_11);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA27_12 = input.LA(1);

                         
                        int index27_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalMiniJava_repl()) ) {s = 2;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_12);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA27_13 = input.LA(1);

                         
                        int index27_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalMiniJava_repl()) ) {s = 2;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_13);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA27_14 = input.LA(1);

                         
                        int index27_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalMiniJava_repl()) ) {s = 2;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index27_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_19s = "\15\uffff";
    static final String dfa_20s = "\11\uffff\1\14\3\uffff";
    static final String dfa_21s = "\6\4\1\uffff\1\4\1\44\1\14\2\4\1\uffff";
    static final String dfa_22s = "\1\101\5\43\1\uffff\1\4\1\44\1\32\1\43\1\30\1\uffff";
    static final String dfa_23s = "\6\uffff\1\2\5\uffff\1\1";
    static final String dfa_24s = "\15\uffff}>";
    static final String[] dfa_25s = {
            "\1\1\12\uffff\1\6\7\uffff\1\6\15\uffff\1\2\1\3\1\4\1\5\26\uffff\3\6",
            "\1\11\10\uffff\1\7\12\uffff\1\6\12\uffff\1\10",
            "\1\11\23\uffff\1\6\12\uffff\1\10",
            "\1\11\23\uffff\1\6\12\uffff\1\10",
            "\1\11\23\uffff\1\6\12\uffff\1\10",
            "\1\11\23\uffff\1\6\12\uffff\1\10",
            "",
            "\1\12",
            "\1\13",
            "\1\6\13\uffff\1\6\1\uffff\1\6",
            "\1\11\10\uffff\1\7\12\uffff\1\6\12\uffff\1\10",
            "\1\11\23\uffff\1\6",
            ""
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_19;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "2124:2: (this_Symbol_0= ruleSymbol | this_Member_1= ruleMember )";
        }
    }
    static final String dfa_26s = "\7\4\1\44\1\0\2\4\2\uffff";
    static final String dfa_27s = "\1\50\5\43\1\4\1\44\1\0\1\43\1\4\2\uffff";
    static final String dfa_28s = "\13\uffff\1\1\1\2";
    static final String dfa_29s = "\10\uffff\1\0\4\uffff}>";
    static final String[] dfa_30s = {
            "\1\1\40\uffff\1\2\1\3\1\4\1\5",
            "\1\10\10\uffff\1\6\25\uffff\1\7",
            "\1\10\36\uffff\1\7",
            "\1\10\36\uffff\1\7",
            "\1\10\36\uffff\1\7",
            "\1\10\36\uffff\1\7",
            "\1\11",
            "\1\12",
            "\1\uffff",
            "\1\10\10\uffff\1\6\25\uffff\1\7",
            "\1\10",
            "",
            ""
    };
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_28;
            this.special = dfa_29;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "2166:2: ( ( ( ruleParameter )=>this_Parameter_0= ruleParameter ) | this_VariableDeclaration_1= ruleVariableDeclaration )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_8 = input.LA(1);

                         
                        int index32_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalMiniJava_repl()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index32_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_31s = "\7\uffff";
    static final String dfa_32s = "\2\uffff\1\1\3\uffff\1\1";
    static final String dfa_33s = "\1\4\1\uffff\1\4\1\uffff\3\4";
    static final String dfa_34s = "\1\76\1\uffff\1\43\1\uffff\1\66\1\76\1\43";
    static final String dfa_35s = "\1\uffff\1\1\1\uffff\1\2\3\uffff";
    static final String dfa_36s = "\7\uffff}>";
    static final String[] dfa_37s = {
            "\1\2\2\1\21\uffff\1\1\14\uffff\4\3\12\uffff\1\1\3\uffff\10\1",
            "",
            "\1\3\10\uffff\1\4\14\uffff\1\1\10\uffff\1\5",
            "",
            "\1\6\61\uffff\1\1",
            "\3\1\21\uffff\1\1\13\uffff\1\3\16\uffff\1\1\3\uffff\10\1",
            "\1\3\10\uffff\1\4\12\uffff\1\1\1\uffff\1\1\10\uffff\1\5"
    };

    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[][] dfa_37 = unpackEncodedStringArray(dfa_37s);

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_31;
            this.eof = dfa_32;
            this.min = dfa_33;
            this.max = dfa_34;
            this.accept = dfa_35;
            this.special = dfa_36;
            this.transition = dfa_37;
        }
        public String getDescription() {
            return "2328:2: ( ( ( ruleArrayAccess )=>this_ArrayAccess_0= ruleArrayAccess ) | this_VariableDeclaration_1= ruleVariableDeclaration )";
        }
    }
    static final String dfa_38s = "\1\4\7\uffff\1\4\1\uffff\1\15\2\uffff";
    static final String dfa_39s = "\1\76\7\uffff\1\50\1\uffff\1\43\2\uffff";
    static final String dfa_40s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\12\1\uffff\1\11\1\10";
    static final String[] dfa_41s = {
            "\1\11\1\2\1\3\61\uffff\1\1\2\4\1\5\1\6\1\7\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\40\uffff\4\13",
            "",
            "\1\13\12\uffff\1\14\12\uffff\1\13",
            "",
            ""
    };
    static final char[] dfa_38 = DFA.unpackEncodedStringToUnsignedChars(dfa_38s);
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final short[][] dfa_41 = unpackEncodedStringArray(dfa_41s);

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_38;
            this.max = dfa_39;
            this.accept = dfa_40;
            this.special = dfa_24;
            this.transition = dfa_41;
        }
        public String getDescription() {
            return "3374:2: ( ( () otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '\\'\\'\\'' ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_INT ) ) ) | ( () ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) ) ) | ( () otherlv_11= 'this' ) | ( () otherlv_13= 'super' ) | ( () otherlv_15= 'null' ) | ( () otherlv_17= 'new' ( (otherlv_18= RULE_ID ) ) ( ( '(' )=>otherlv_19= '(' ) ( ( (lv_args_20_0= ruleExpression ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleExpression ) ) )* )? otherlv_23= ')' ) | ( () otherlv_25= 'new' ( (lv_type_26_0= ruleTypeRef ) ) ( ( '[' )=>otherlv_27= '[' ) ( (lv_size_28_0= ruleExpression ) ) otherlv_29= ']' ) | ( () ( (otherlv_31= RULE_ID ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000160000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x800001E000A08010L,0x0000000000000003L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x800001E000808010L,0x0000000000000003L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x800001E000800010L,0x0000000000000003L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x800001E000000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x800001E002000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004001000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x7F88000001000070L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0xFF8801E6C9300070L,0x0000000000000003L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0xFF8801E001000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001E00000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x7F88000003000070L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000800000000L});

}