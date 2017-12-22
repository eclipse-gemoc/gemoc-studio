package org.eclipse.gemoc.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.eclipse.gemoc.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LETTER", "RULE_SPACE", "RULE_SEPARATOR", "RULE_SL_COMMENT", "'name'", "'\\n'", "'\\\\\\n'"
    };
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int RULE_SEPARATOR=6;
    public static final int RULE_SL_COMMENT=7;
    public static final int RULE_LETTER=4;
    public static final int RULE_SPACE=5;
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

    	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDsl"
    // InternalDsl.g:54:1: entryRuleDsl : ruleDsl EOF ;
    public final void entryRuleDsl() throws RecognitionException {
        try {
            // InternalDsl.g:55:1: ( ruleDsl EOF )
            // InternalDsl.g:56:1: ruleDsl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDsl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDsl"


    // $ANTLR start "ruleDsl"
    // InternalDsl.g:63:1: ruleDsl : ( ( rule__Dsl__Group__0 ) ) ;
    public final void ruleDsl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:67:2: ( ( ( rule__Dsl__Group__0 ) ) )
            // InternalDsl.g:68:2: ( ( rule__Dsl__Group__0 ) )
            {
            // InternalDsl.g:68:2: ( ( rule__Dsl__Group__0 ) )
            // InternalDsl.g:69:3: ( rule__Dsl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getGroup()); 
            }
            // InternalDsl.g:70:3: ( rule__Dsl__Group__0 )
            // InternalDsl.g:70:4: rule__Dsl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dsl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDsl"


    // $ANTLR start "entryRuleEntry"
    // InternalDsl.g:79:1: entryRuleEntry : ruleEntry EOF ;
    public final void entryRuleEntry() throws RecognitionException {
        try {
            // InternalDsl.g:80:1: ( ruleEntry EOF )
            // InternalDsl.g:81:1: ruleEntry EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEntry();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntry"


    // $ANTLR start "ruleEntry"
    // InternalDsl.g:88:1: ruleEntry : ( ( rule__Entry__Group__0 ) ) ;
    public final void ruleEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:92:2: ( ( ( rule__Entry__Group__0 ) ) )
            // InternalDsl.g:93:2: ( ( rule__Entry__Group__0 ) )
            {
            // InternalDsl.g:93:2: ( ( rule__Entry__Group__0 ) )
            // InternalDsl.g:94:3: ( rule__Entry__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryAccess().getGroup()); 
            }
            // InternalDsl.g:95:3: ( rule__Entry__Group__0 )
            // InternalDsl.g:95:4: rule__Entry__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entry__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntry"


    // $ANTLR start "entryRuleWORD"
    // InternalDsl.g:104:1: entryRuleWORD : ruleWORD EOF ;
    public final void entryRuleWORD() throws RecognitionException {
        try {
            // InternalDsl.g:105:1: ( ruleWORD EOF )
            // InternalDsl.g:106:1: ruleWORD EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWORDRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleWORD();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWORDRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWORD"


    // $ANTLR start "ruleWORD"
    // InternalDsl.g:113:1: ruleWORD : ( ( rule__WORD__Group__0 ) ) ;
    public final void ruleWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:117:2: ( ( ( rule__WORD__Group__0 ) ) )
            // InternalDsl.g:118:2: ( ( rule__WORD__Group__0 ) )
            {
            // InternalDsl.g:118:2: ( ( rule__WORD__Group__0 ) )
            // InternalDsl.g:119:3: ( rule__WORD__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWORDAccess().getGroup()); 
            }
            // InternalDsl.g:120:3: ( rule__WORD__Group__0 )
            // InternalDsl.g:120:4: rule__WORD__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WORD__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWORDAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWORD"


    // $ANTLR start "entryRuleVALUE_WORD"
    // InternalDsl.g:129:1: entryRuleVALUE_WORD : ruleVALUE_WORD EOF ;
    public final void entryRuleVALUE_WORD() throws RecognitionException {
        try {
            // InternalDsl.g:130:1: ( ruleVALUE_WORD EOF )
            // InternalDsl.g:131:1: ruleVALUE_WORD EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVALUE_WORDRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVALUE_WORD();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVALUE_WORDRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVALUE_WORD"


    // $ANTLR start "ruleVALUE_WORD"
    // InternalDsl.g:138:1: ruleVALUE_WORD : ( ( rule__VALUE_WORD__Group__0 ) ) ;
    public final void ruleVALUE_WORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:142:2: ( ( ( rule__VALUE_WORD__Group__0 ) ) )
            // InternalDsl.g:143:2: ( ( rule__VALUE_WORD__Group__0 ) )
            {
            // InternalDsl.g:143:2: ( ( rule__VALUE_WORD__Group__0 ) )
            // InternalDsl.g:144:3: ( rule__VALUE_WORD__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVALUE_WORDAccess().getGroup()); 
            }
            // InternalDsl.g:145:3: ( rule__VALUE_WORD__Group__0 )
            // InternalDsl.g:145:4: rule__VALUE_WORD__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VALUE_WORD__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVALUE_WORDAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVALUE_WORD"


    // $ANTLR start "entryRuleMULTILINE"
    // InternalDsl.g:154:1: entryRuleMULTILINE : ruleMULTILINE EOF ;
    public final void entryRuleMULTILINE() throws RecognitionException {
        try {
            // InternalDsl.g:155:1: ( ruleMULTILINE EOF )
            // InternalDsl.g:156:1: ruleMULTILINE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMULTILINERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMULTILINE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMULTILINERule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMULTILINE"


    // $ANTLR start "ruleMULTILINE"
    // InternalDsl.g:163:1: ruleMULTILINE : ( ( rule__MULTILINE__Group__0 ) ) ;
    public final void ruleMULTILINE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:167:2: ( ( ( rule__MULTILINE__Group__0 ) ) )
            // InternalDsl.g:168:2: ( ( rule__MULTILINE__Group__0 ) )
            {
            // InternalDsl.g:168:2: ( ( rule__MULTILINE__Group__0 ) )
            // InternalDsl.g:169:3: ( rule__MULTILINE__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMULTILINEAccess().getGroup()); 
            }
            // InternalDsl.g:170:3: ( rule__MULTILINE__Group__0 )
            // InternalDsl.g:170:4: rule__MULTILINE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MULTILINE__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMULTILINEAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMULTILINE"


    // $ANTLR start "rule__WORD__Alternatives_1_0"
    // InternalDsl.g:178:1: rule__WORD__Alternatives_1_0 : ( ( RULE_LETTER ) | ( RULE_SPACE ) );
    public final void rule__WORD__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:182:1: ( ( RULE_LETTER ) | ( RULE_SPACE ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_LETTER) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_SPACE) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:183:2: ( RULE_LETTER )
                    {
                    // InternalDsl.g:183:2: ( RULE_LETTER )
                    // InternalDsl.g:184:3: RULE_LETTER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWORDAccess().getLETTERTerminalRuleCall_1_0_0()); 
                    }
                    match(input,RULE_LETTER,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWORDAccess().getLETTERTerminalRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:189:2: ( RULE_SPACE )
                    {
                    // InternalDsl.g:189:2: ( RULE_SPACE )
                    // InternalDsl.g:190:3: RULE_SPACE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWORDAccess().getSPACETerminalRuleCall_1_0_1()); 
                    }
                    match(input,RULE_SPACE,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWORDAccess().getSPACETerminalRuleCall_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WORD__Alternatives_1_0"


    // $ANTLR start "rule__VALUE_WORD__Alternatives_0"
    // InternalDsl.g:199:1: rule__VALUE_WORD__Alternatives_0 : ( ( RULE_LETTER ) | ( RULE_SEPARATOR ) );
    public final void rule__VALUE_WORD__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:203:1: ( ( RULE_LETTER ) | ( RULE_SEPARATOR ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_LETTER) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_SEPARATOR) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:204:2: ( RULE_LETTER )
                    {
                    // InternalDsl.g:204:2: ( RULE_LETTER )
                    // InternalDsl.g:205:3: RULE_LETTER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVALUE_WORDAccess().getLETTERTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_LETTER,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVALUE_WORDAccess().getLETTERTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:210:2: ( RULE_SEPARATOR )
                    {
                    // InternalDsl.g:210:2: ( RULE_SEPARATOR )
                    // InternalDsl.g:211:3: RULE_SEPARATOR
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVALUE_WORDAccess().getSEPARATORTerminalRuleCall_0_1()); 
                    }
                    match(input,RULE_SEPARATOR,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVALUE_WORDAccess().getSEPARATORTerminalRuleCall_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALUE_WORD__Alternatives_0"


    // $ANTLR start "rule__VALUE_WORD__Alternatives_1_0"
    // InternalDsl.g:220:1: rule__VALUE_WORD__Alternatives_1_0 : ( ( ( rule__VALUE_WORD__Alternatives_1_0_0 ) ) | ( RULE_SPACE ) );
    public final void rule__VALUE_WORD__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:224:1: ( ( ( rule__VALUE_WORD__Alternatives_1_0_0 ) ) | ( RULE_SPACE ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_LETTER||LA3_0==RULE_SEPARATOR) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_SPACE) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:225:2: ( ( rule__VALUE_WORD__Alternatives_1_0_0 ) )
                    {
                    // InternalDsl.g:225:2: ( ( rule__VALUE_WORD__Alternatives_1_0_0 ) )
                    // InternalDsl.g:226:3: ( rule__VALUE_WORD__Alternatives_1_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVALUE_WORDAccess().getAlternatives_1_0_0()); 
                    }
                    // InternalDsl.g:227:3: ( rule__VALUE_WORD__Alternatives_1_0_0 )
                    // InternalDsl.g:227:4: rule__VALUE_WORD__Alternatives_1_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VALUE_WORD__Alternatives_1_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVALUE_WORDAccess().getAlternatives_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:231:2: ( RULE_SPACE )
                    {
                    // InternalDsl.g:231:2: ( RULE_SPACE )
                    // InternalDsl.g:232:3: RULE_SPACE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVALUE_WORDAccess().getSPACETerminalRuleCall_1_0_1()); 
                    }
                    match(input,RULE_SPACE,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVALUE_WORDAccess().getSPACETerminalRuleCall_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALUE_WORD__Alternatives_1_0"


    // $ANTLR start "rule__VALUE_WORD__Alternatives_1_0_0"
    // InternalDsl.g:241:1: rule__VALUE_WORD__Alternatives_1_0_0 : ( ( RULE_LETTER ) | ( RULE_SEPARATOR ) );
    public final void rule__VALUE_WORD__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:245:1: ( ( RULE_LETTER ) | ( RULE_SEPARATOR ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_LETTER) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_SEPARATOR) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:246:2: ( RULE_LETTER )
                    {
                    // InternalDsl.g:246:2: ( RULE_LETTER )
                    // InternalDsl.g:247:3: RULE_LETTER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVALUE_WORDAccess().getLETTERTerminalRuleCall_1_0_0_0()); 
                    }
                    match(input,RULE_LETTER,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVALUE_WORDAccess().getLETTERTerminalRuleCall_1_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:252:2: ( RULE_SEPARATOR )
                    {
                    // InternalDsl.g:252:2: ( RULE_SEPARATOR )
                    // InternalDsl.g:253:3: RULE_SEPARATOR
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVALUE_WORDAccess().getSEPARATORTerminalRuleCall_1_0_0_1()); 
                    }
                    match(input,RULE_SEPARATOR,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVALUE_WORDAccess().getSEPARATORTerminalRuleCall_1_0_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALUE_WORD__Alternatives_1_0_0"


    // $ANTLR start "rule__VALUE_WORD__Alternatives_1_1_0"
    // InternalDsl.g:262:1: rule__VALUE_WORD__Alternatives_1_1_0 : ( ( RULE_LETTER ) | ( RULE_SEPARATOR ) );
    public final void rule__VALUE_WORD__Alternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:266:1: ( ( RULE_LETTER ) | ( RULE_SEPARATOR ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_LETTER) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_SEPARATOR) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:267:2: ( RULE_LETTER )
                    {
                    // InternalDsl.g:267:2: ( RULE_LETTER )
                    // InternalDsl.g:268:3: RULE_LETTER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVALUE_WORDAccess().getLETTERTerminalRuleCall_1_1_0_0()); 
                    }
                    match(input,RULE_LETTER,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVALUE_WORDAccess().getLETTERTerminalRuleCall_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:273:2: ( RULE_SEPARATOR )
                    {
                    // InternalDsl.g:273:2: ( RULE_SEPARATOR )
                    // InternalDsl.g:274:3: RULE_SEPARATOR
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVALUE_WORDAccess().getSEPARATORTerminalRuleCall_1_1_0_1()); 
                    }
                    match(input,RULE_SEPARATOR,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVALUE_WORDAccess().getSEPARATORTerminalRuleCall_1_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALUE_WORD__Alternatives_1_1_0"


    // $ANTLR start "rule__Dsl__Group__0"
    // InternalDsl.g:283:1: rule__Dsl__Group__0 : rule__Dsl__Group__0__Impl rule__Dsl__Group__1 ;
    public final void rule__Dsl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:287:1: ( rule__Dsl__Group__0__Impl rule__Dsl__Group__1 )
            // InternalDsl.g:288:2: rule__Dsl__Group__0__Impl rule__Dsl__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Dsl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Dsl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dsl__Group__0"


    // $ANTLR start "rule__Dsl__Group__0__Impl"
    // InternalDsl.g:295:1: rule__Dsl__Group__0__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__Dsl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:299:1: ( ( ( RULE_SPACE )* ) )
            // InternalDsl.g:300:1: ( ( RULE_SPACE )* )
            {
            // InternalDsl.g:300:1: ( ( RULE_SPACE )* )
            // InternalDsl.g:301:2: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getSPACETerminalRuleCall_0()); 
            }
            // InternalDsl.g:302:2: ( RULE_SPACE )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_SPACE) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:302:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getSPACETerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dsl__Group__0__Impl"


    // $ANTLR start "rule__Dsl__Group__1"
    // InternalDsl.g:310:1: rule__Dsl__Group__1 : rule__Dsl__Group__1__Impl rule__Dsl__Group__2 ;
    public final void rule__Dsl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:314:1: ( rule__Dsl__Group__1__Impl rule__Dsl__Group__2 )
            // InternalDsl.g:315:2: rule__Dsl__Group__1__Impl rule__Dsl__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Dsl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Dsl__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dsl__Group__1"


    // $ANTLR start "rule__Dsl__Group__1__Impl"
    // InternalDsl.g:322:1: rule__Dsl__Group__1__Impl : ( 'name' ) ;
    public final void rule__Dsl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:326:1: ( ( 'name' ) )
            // InternalDsl.g:327:1: ( 'name' )
            {
            // InternalDsl.g:327:1: ( 'name' )
            // InternalDsl.g:328:2: 'name'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getNameKeyword_1()); 
            }
            match(input,8,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getNameKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dsl__Group__1__Impl"


    // $ANTLR start "rule__Dsl__Group__2"
    // InternalDsl.g:337:1: rule__Dsl__Group__2 : rule__Dsl__Group__2__Impl rule__Dsl__Group__3 ;
    public final void rule__Dsl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:341:1: ( rule__Dsl__Group__2__Impl rule__Dsl__Group__3 )
            // InternalDsl.g:342:2: rule__Dsl__Group__2__Impl rule__Dsl__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Dsl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Dsl__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dsl__Group__2"


    // $ANTLR start "rule__Dsl__Group__2__Impl"
    // InternalDsl.g:349:1: rule__Dsl__Group__2__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__Dsl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:353:1: ( ( ( RULE_SPACE )* ) )
            // InternalDsl.g:354:1: ( ( RULE_SPACE )* )
            {
            // InternalDsl.g:354:1: ( ( RULE_SPACE )* )
            // InternalDsl.g:355:2: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getSPACETerminalRuleCall_2()); 
            }
            // InternalDsl.g:356:2: ( RULE_SPACE )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_SPACE) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:356:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getSPACETerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dsl__Group__2__Impl"


    // $ANTLR start "rule__Dsl__Group__3"
    // InternalDsl.g:364:1: rule__Dsl__Group__3 : rule__Dsl__Group__3__Impl rule__Dsl__Group__4 ;
    public final void rule__Dsl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:368:1: ( rule__Dsl__Group__3__Impl rule__Dsl__Group__4 )
            // InternalDsl.g:369:2: rule__Dsl__Group__3__Impl rule__Dsl__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Dsl__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Dsl__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dsl__Group__3"


    // $ANTLR start "rule__Dsl__Group__3__Impl"
    // InternalDsl.g:376:1: rule__Dsl__Group__3__Impl : ( RULE_SEPARATOR ) ;
    public final void rule__Dsl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:380:1: ( ( RULE_SEPARATOR ) )
            // InternalDsl.g:381:1: ( RULE_SEPARATOR )
            {
            // InternalDsl.g:381:1: ( RULE_SEPARATOR )
            // InternalDsl.g:382:2: RULE_SEPARATOR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getSEPARATORTerminalRuleCall_3()); 
            }
            match(input,RULE_SEPARATOR,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getSEPARATORTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dsl__Group__3__Impl"


    // $ANTLR start "rule__Dsl__Group__4"
    // InternalDsl.g:391:1: rule__Dsl__Group__4 : rule__Dsl__Group__4__Impl rule__Dsl__Group__5 ;
    public final void rule__Dsl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:395:1: ( rule__Dsl__Group__4__Impl rule__Dsl__Group__5 )
            // InternalDsl.g:396:2: rule__Dsl__Group__4__Impl rule__Dsl__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Dsl__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Dsl__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dsl__Group__4"


    // $ANTLR start "rule__Dsl__Group__4__Impl"
    // InternalDsl.g:403:1: rule__Dsl__Group__4__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__Dsl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:407:1: ( ( ( RULE_SPACE )* ) )
            // InternalDsl.g:408:1: ( ( RULE_SPACE )* )
            {
            // InternalDsl.g:408:1: ( ( RULE_SPACE )* )
            // InternalDsl.g:409:2: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getSPACETerminalRuleCall_4()); 
            }
            // InternalDsl.g:410:2: ( RULE_SPACE )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_SPACE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:410:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getSPACETerminalRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dsl__Group__4__Impl"


    // $ANTLR start "rule__Dsl__Group__5"
    // InternalDsl.g:418:1: rule__Dsl__Group__5 : rule__Dsl__Group__5__Impl rule__Dsl__Group__6 ;
    public final void rule__Dsl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:422:1: ( rule__Dsl__Group__5__Impl rule__Dsl__Group__6 )
            // InternalDsl.g:423:2: rule__Dsl__Group__5__Impl rule__Dsl__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Dsl__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Dsl__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dsl__Group__5"


    // $ANTLR start "rule__Dsl__Group__5__Impl"
    // InternalDsl.g:430:1: rule__Dsl__Group__5__Impl : ( ( rule__Dsl__NameAssignment_5 ) ) ;
    public final void rule__Dsl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:434:1: ( ( ( rule__Dsl__NameAssignment_5 ) ) )
            // InternalDsl.g:435:1: ( ( rule__Dsl__NameAssignment_5 ) )
            {
            // InternalDsl.g:435:1: ( ( rule__Dsl__NameAssignment_5 ) )
            // InternalDsl.g:436:2: ( rule__Dsl__NameAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getNameAssignment_5()); 
            }
            // InternalDsl.g:437:2: ( rule__Dsl__NameAssignment_5 )
            // InternalDsl.g:437:3: rule__Dsl__NameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Dsl__NameAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getNameAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dsl__Group__5__Impl"


    // $ANTLR start "rule__Dsl__Group__6"
    // InternalDsl.g:445:1: rule__Dsl__Group__6 : rule__Dsl__Group__6__Impl rule__Dsl__Group__7 ;
    public final void rule__Dsl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:449:1: ( rule__Dsl__Group__6__Impl rule__Dsl__Group__7 )
            // InternalDsl.g:450:2: rule__Dsl__Group__6__Impl rule__Dsl__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Dsl__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Dsl__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dsl__Group__6"


    // $ANTLR start "rule__Dsl__Group__6__Impl"
    // InternalDsl.g:457:1: rule__Dsl__Group__6__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__Dsl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:461:1: ( ( ( RULE_SPACE )* ) )
            // InternalDsl.g:462:1: ( ( RULE_SPACE )* )
            {
            // InternalDsl.g:462:1: ( ( RULE_SPACE )* )
            // InternalDsl.g:463:2: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getSPACETerminalRuleCall_6()); 
            }
            // InternalDsl.g:464:2: ( RULE_SPACE )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_SPACE) ) {
                    int LA9_2 = input.LA(2);

                    if ( (synpred9_InternalDsl()) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:464:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getSPACETerminalRuleCall_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dsl__Group__6__Impl"


    // $ANTLR start "rule__Dsl__Group__7"
    // InternalDsl.g:472:1: rule__Dsl__Group__7 : rule__Dsl__Group__7__Impl rule__Dsl__Group__8 ;
    public final void rule__Dsl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:476:1: ( rule__Dsl__Group__7__Impl rule__Dsl__Group__8 )
            // InternalDsl.g:477:2: rule__Dsl__Group__7__Impl rule__Dsl__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Dsl__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Dsl__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dsl__Group__7"


    // $ANTLR start "rule__Dsl__Group__7__Impl"
    // InternalDsl.g:484:1: rule__Dsl__Group__7__Impl : ( ( '\\n' )? ) ;
    public final void rule__Dsl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:488:1: ( ( ( '\\n' )? ) )
            // InternalDsl.g:489:1: ( ( '\\n' )? )
            {
            // InternalDsl.g:489:1: ( ( '\\n' )? )
            // InternalDsl.g:490:2: ( '\\n' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getLineFeedKeyword_7()); 
            }
            // InternalDsl.g:491:2: ( '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==9) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:491:3: '\\n'
                    {
                    match(input,9,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getLineFeedKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dsl__Group__7__Impl"


    // $ANTLR start "rule__Dsl__Group__8"
    // InternalDsl.g:499:1: rule__Dsl__Group__8 : rule__Dsl__Group__8__Impl ;
    public final void rule__Dsl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:503:1: ( rule__Dsl__Group__8__Impl )
            // InternalDsl.g:504:2: rule__Dsl__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dsl__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dsl__Group__8"


    // $ANTLR start "rule__Dsl__Group__8__Impl"
    // InternalDsl.g:510:1: rule__Dsl__Group__8__Impl : ( ( rule__Dsl__EntriesAssignment_8 )* ) ;
    public final void rule__Dsl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:514:1: ( ( ( rule__Dsl__EntriesAssignment_8 )* ) )
            // InternalDsl.g:515:1: ( ( rule__Dsl__EntriesAssignment_8 )* )
            {
            // InternalDsl.g:515:1: ( ( rule__Dsl__EntriesAssignment_8 )* )
            // InternalDsl.g:516:2: ( rule__Dsl__EntriesAssignment_8 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getEntriesAssignment_8()); 
            }
            // InternalDsl.g:517:2: ( rule__Dsl__EntriesAssignment_8 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_LETTER && LA11_0<=RULE_SPACE)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:517:3: rule__Dsl__EntriesAssignment_8
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Dsl__EntriesAssignment_8();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getEntriesAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dsl__Group__8__Impl"


    // $ANTLR start "rule__Entry__Group__0"
    // InternalDsl.g:526:1: rule__Entry__Group__0 : rule__Entry__Group__0__Impl rule__Entry__Group__1 ;
    public final void rule__Entry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:530:1: ( rule__Entry__Group__0__Impl rule__Entry__Group__1 )
            // InternalDsl.g:531:2: rule__Entry__Group__0__Impl rule__Entry__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Entry__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entry__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__0"


    // $ANTLR start "rule__Entry__Group__0__Impl"
    // InternalDsl.g:538:1: rule__Entry__Group__0__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__Entry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:542:1: ( ( ( RULE_SPACE )* ) )
            // InternalDsl.g:543:1: ( ( RULE_SPACE )* )
            {
            // InternalDsl.g:543:1: ( ( RULE_SPACE )* )
            // InternalDsl.g:544:2: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryAccess().getSPACETerminalRuleCall_0()); 
            }
            // InternalDsl.g:545:2: ( RULE_SPACE )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_SPACE) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:545:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryAccess().getSPACETerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__0__Impl"


    // $ANTLR start "rule__Entry__Group__1"
    // InternalDsl.g:553:1: rule__Entry__Group__1 : rule__Entry__Group__1__Impl rule__Entry__Group__2 ;
    public final void rule__Entry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:557:1: ( rule__Entry__Group__1__Impl rule__Entry__Group__2 )
            // InternalDsl.g:558:2: rule__Entry__Group__1__Impl rule__Entry__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Entry__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entry__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__1"


    // $ANTLR start "rule__Entry__Group__1__Impl"
    // InternalDsl.g:565:1: rule__Entry__Group__1__Impl : ( ( rule__Entry__KeyAssignment_1 ) ) ;
    public final void rule__Entry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:569:1: ( ( ( rule__Entry__KeyAssignment_1 ) ) )
            // InternalDsl.g:570:1: ( ( rule__Entry__KeyAssignment_1 ) )
            {
            // InternalDsl.g:570:1: ( ( rule__Entry__KeyAssignment_1 ) )
            // InternalDsl.g:571:2: ( rule__Entry__KeyAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryAccess().getKeyAssignment_1()); 
            }
            // InternalDsl.g:572:2: ( rule__Entry__KeyAssignment_1 )
            // InternalDsl.g:572:3: rule__Entry__KeyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entry__KeyAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryAccess().getKeyAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__1__Impl"


    // $ANTLR start "rule__Entry__Group__2"
    // InternalDsl.g:580:1: rule__Entry__Group__2 : rule__Entry__Group__2__Impl rule__Entry__Group__3 ;
    public final void rule__Entry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:584:1: ( rule__Entry__Group__2__Impl rule__Entry__Group__3 )
            // InternalDsl.g:585:2: rule__Entry__Group__2__Impl rule__Entry__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Entry__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entry__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__2"


    // $ANTLR start "rule__Entry__Group__2__Impl"
    // InternalDsl.g:592:1: rule__Entry__Group__2__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__Entry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:596:1: ( ( ( RULE_SPACE )* ) )
            // InternalDsl.g:597:1: ( ( RULE_SPACE )* )
            {
            // InternalDsl.g:597:1: ( ( RULE_SPACE )* )
            // InternalDsl.g:598:2: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryAccess().getSPACETerminalRuleCall_2()); 
            }
            // InternalDsl.g:599:2: ( RULE_SPACE )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_SPACE) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:599:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryAccess().getSPACETerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__2__Impl"


    // $ANTLR start "rule__Entry__Group__3"
    // InternalDsl.g:607:1: rule__Entry__Group__3 : rule__Entry__Group__3__Impl rule__Entry__Group__4 ;
    public final void rule__Entry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:611:1: ( rule__Entry__Group__3__Impl rule__Entry__Group__4 )
            // InternalDsl.g:612:2: rule__Entry__Group__3__Impl rule__Entry__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Entry__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entry__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__3"


    // $ANTLR start "rule__Entry__Group__3__Impl"
    // InternalDsl.g:619:1: rule__Entry__Group__3__Impl : ( RULE_SEPARATOR ) ;
    public final void rule__Entry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:623:1: ( ( RULE_SEPARATOR ) )
            // InternalDsl.g:624:1: ( RULE_SEPARATOR )
            {
            // InternalDsl.g:624:1: ( RULE_SEPARATOR )
            // InternalDsl.g:625:2: RULE_SEPARATOR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryAccess().getSEPARATORTerminalRuleCall_3()); 
            }
            match(input,RULE_SEPARATOR,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryAccess().getSEPARATORTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__3__Impl"


    // $ANTLR start "rule__Entry__Group__4"
    // InternalDsl.g:634:1: rule__Entry__Group__4 : rule__Entry__Group__4__Impl rule__Entry__Group__5 ;
    public final void rule__Entry__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:638:1: ( rule__Entry__Group__4__Impl rule__Entry__Group__5 )
            // InternalDsl.g:639:2: rule__Entry__Group__4__Impl rule__Entry__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Entry__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entry__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__4"


    // $ANTLR start "rule__Entry__Group__4__Impl"
    // InternalDsl.g:646:1: rule__Entry__Group__4__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__Entry__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:650:1: ( ( ( RULE_SPACE )* ) )
            // InternalDsl.g:651:1: ( ( RULE_SPACE )* )
            {
            // InternalDsl.g:651:1: ( ( RULE_SPACE )* )
            // InternalDsl.g:652:2: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryAccess().getSPACETerminalRuleCall_4()); 
            }
            // InternalDsl.g:653:2: ( RULE_SPACE )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_SPACE) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:653:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryAccess().getSPACETerminalRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__4__Impl"


    // $ANTLR start "rule__Entry__Group__5"
    // InternalDsl.g:661:1: rule__Entry__Group__5 : rule__Entry__Group__5__Impl rule__Entry__Group__6 ;
    public final void rule__Entry__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:665:1: ( rule__Entry__Group__5__Impl rule__Entry__Group__6 )
            // InternalDsl.g:666:2: rule__Entry__Group__5__Impl rule__Entry__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Entry__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entry__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__5"


    // $ANTLR start "rule__Entry__Group__5__Impl"
    // InternalDsl.g:673:1: rule__Entry__Group__5__Impl : ( ( rule__Entry__ValueAssignment_5 ) ) ;
    public final void rule__Entry__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:677:1: ( ( ( rule__Entry__ValueAssignment_5 ) ) )
            // InternalDsl.g:678:1: ( ( rule__Entry__ValueAssignment_5 ) )
            {
            // InternalDsl.g:678:1: ( ( rule__Entry__ValueAssignment_5 ) )
            // InternalDsl.g:679:2: ( rule__Entry__ValueAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryAccess().getValueAssignment_5()); 
            }
            // InternalDsl.g:680:2: ( rule__Entry__ValueAssignment_5 )
            // InternalDsl.g:680:3: rule__Entry__ValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Entry__ValueAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryAccess().getValueAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__5__Impl"


    // $ANTLR start "rule__Entry__Group__6"
    // InternalDsl.g:688:1: rule__Entry__Group__6 : rule__Entry__Group__6__Impl rule__Entry__Group__7 ;
    public final void rule__Entry__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:692:1: ( rule__Entry__Group__6__Impl rule__Entry__Group__7 )
            // InternalDsl.g:693:2: rule__Entry__Group__6__Impl rule__Entry__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Entry__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entry__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__6"


    // $ANTLR start "rule__Entry__Group__6__Impl"
    // InternalDsl.g:700:1: rule__Entry__Group__6__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__Entry__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:704:1: ( ( ( RULE_SPACE )* ) )
            // InternalDsl.g:705:1: ( ( RULE_SPACE )* )
            {
            // InternalDsl.g:705:1: ( ( RULE_SPACE )* )
            // InternalDsl.g:706:2: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryAccess().getSPACETerminalRuleCall_6()); 
            }
            // InternalDsl.g:707:2: ( RULE_SPACE )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_SPACE) ) {
                    int LA15_2 = input.LA(2);

                    if ( (synpred15_InternalDsl()) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalDsl.g:707:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryAccess().getSPACETerminalRuleCall_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__6__Impl"


    // $ANTLR start "rule__Entry__Group__7"
    // InternalDsl.g:715:1: rule__Entry__Group__7 : rule__Entry__Group__7__Impl ;
    public final void rule__Entry__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:719:1: ( rule__Entry__Group__7__Impl )
            // InternalDsl.g:720:2: rule__Entry__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entry__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__7"


    // $ANTLR start "rule__Entry__Group__7__Impl"
    // InternalDsl.g:726:1: rule__Entry__Group__7__Impl : ( ( '\\n' )? ) ;
    public final void rule__Entry__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:730:1: ( ( ( '\\n' )? ) )
            // InternalDsl.g:731:1: ( ( '\\n' )? )
            {
            // InternalDsl.g:731:1: ( ( '\\n' )? )
            // InternalDsl.g:732:2: ( '\\n' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryAccess().getLineFeedKeyword_7()); 
            }
            // InternalDsl.g:733:2: ( '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==9) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:733:3: '\\n'
                    {
                    match(input,9,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryAccess().getLineFeedKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__7__Impl"


    // $ANTLR start "rule__WORD__Group__0"
    // InternalDsl.g:742:1: rule__WORD__Group__0 : rule__WORD__Group__0__Impl rule__WORD__Group__1 ;
    public final void rule__WORD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:746:1: ( rule__WORD__Group__0__Impl rule__WORD__Group__1 )
            // InternalDsl.g:747:2: rule__WORD__Group__0__Impl rule__WORD__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__WORD__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WORD__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WORD__Group__0"


    // $ANTLR start "rule__WORD__Group__0__Impl"
    // InternalDsl.g:754:1: rule__WORD__Group__0__Impl : ( RULE_LETTER ) ;
    public final void rule__WORD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:758:1: ( ( RULE_LETTER ) )
            // InternalDsl.g:759:1: ( RULE_LETTER )
            {
            // InternalDsl.g:759:1: ( RULE_LETTER )
            // InternalDsl.g:760:2: RULE_LETTER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWORDAccess().getLETTERTerminalRuleCall_0()); 
            }
            match(input,RULE_LETTER,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWORDAccess().getLETTERTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WORD__Group__0__Impl"


    // $ANTLR start "rule__WORD__Group__1"
    // InternalDsl.g:769:1: rule__WORD__Group__1 : rule__WORD__Group__1__Impl ;
    public final void rule__WORD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:773:1: ( rule__WORD__Group__1__Impl )
            // InternalDsl.g:774:2: rule__WORD__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WORD__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WORD__Group__1"


    // $ANTLR start "rule__WORD__Group__1__Impl"
    // InternalDsl.g:780:1: rule__WORD__Group__1__Impl : ( ( rule__WORD__Group_1__0 )? ) ;
    public final void rule__WORD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:784:1: ( ( ( rule__WORD__Group_1__0 )? ) )
            // InternalDsl.g:785:1: ( ( rule__WORD__Group_1__0 )? )
            {
            // InternalDsl.g:785:1: ( ( rule__WORD__Group_1__0 )? )
            // InternalDsl.g:786:2: ( rule__WORD__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWORDAccess().getGroup_1()); 
            }
            // InternalDsl.g:787:2: ( rule__WORD__Group_1__0 )?
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:787:3: rule__WORD__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WORD__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWORDAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WORD__Group__1__Impl"


    // $ANTLR start "rule__WORD__Group_1__0"
    // InternalDsl.g:796:1: rule__WORD__Group_1__0 : rule__WORD__Group_1__0__Impl rule__WORD__Group_1__1 ;
    public final void rule__WORD__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:800:1: ( rule__WORD__Group_1__0__Impl rule__WORD__Group_1__1 )
            // InternalDsl.g:801:2: rule__WORD__Group_1__0__Impl rule__WORD__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__WORD__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WORD__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WORD__Group_1__0"


    // $ANTLR start "rule__WORD__Group_1__0__Impl"
    // InternalDsl.g:808:1: rule__WORD__Group_1__0__Impl : ( ( rule__WORD__Alternatives_1_0 )* ) ;
    public final void rule__WORD__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:812:1: ( ( ( rule__WORD__Alternatives_1_0 )* ) )
            // InternalDsl.g:813:1: ( ( rule__WORD__Alternatives_1_0 )* )
            {
            // InternalDsl.g:813:1: ( ( rule__WORD__Alternatives_1_0 )* )
            // InternalDsl.g:814:2: ( rule__WORD__Alternatives_1_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWORDAccess().getAlternatives_1_0()); 
            }
            // InternalDsl.g:815:2: ( rule__WORD__Alternatives_1_0 )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // InternalDsl.g:815:3: rule__WORD__Alternatives_1_0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__WORD__Alternatives_1_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWORDAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WORD__Group_1__0__Impl"


    // $ANTLR start "rule__WORD__Group_1__1"
    // InternalDsl.g:823:1: rule__WORD__Group_1__1 : rule__WORD__Group_1__1__Impl ;
    public final void rule__WORD__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:827:1: ( rule__WORD__Group_1__1__Impl )
            // InternalDsl.g:828:2: rule__WORD__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WORD__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WORD__Group_1__1"


    // $ANTLR start "rule__WORD__Group_1__1__Impl"
    // InternalDsl.g:834:1: rule__WORD__Group_1__1__Impl : ( ( RULE_LETTER ) ) ;
    public final void rule__WORD__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:838:1: ( ( ( RULE_LETTER ) ) )
            // InternalDsl.g:839:1: ( ( RULE_LETTER ) )
            {
            // InternalDsl.g:839:1: ( ( RULE_LETTER ) )
            // InternalDsl.g:840:2: ( RULE_LETTER )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWORDAccess().getLETTERTerminalRuleCall_1_1()); 
            }
            // InternalDsl.g:841:2: ( RULE_LETTER )
            // InternalDsl.g:841:3: RULE_LETTER
            {
            match(input,RULE_LETTER,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWORDAccess().getLETTERTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WORD__Group_1__1__Impl"


    // $ANTLR start "rule__VALUE_WORD__Group__0"
    // InternalDsl.g:850:1: rule__VALUE_WORD__Group__0 : rule__VALUE_WORD__Group__0__Impl rule__VALUE_WORD__Group__1 ;
    public final void rule__VALUE_WORD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:854:1: ( rule__VALUE_WORD__Group__0__Impl rule__VALUE_WORD__Group__1 )
            // InternalDsl.g:855:2: rule__VALUE_WORD__Group__0__Impl rule__VALUE_WORD__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__VALUE_WORD__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VALUE_WORD__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALUE_WORD__Group__0"


    // $ANTLR start "rule__VALUE_WORD__Group__0__Impl"
    // InternalDsl.g:862:1: rule__VALUE_WORD__Group__0__Impl : ( ( rule__VALUE_WORD__Alternatives_0 ) ) ;
    public final void rule__VALUE_WORD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:866:1: ( ( ( rule__VALUE_WORD__Alternatives_0 ) ) )
            // InternalDsl.g:867:1: ( ( rule__VALUE_WORD__Alternatives_0 ) )
            {
            // InternalDsl.g:867:1: ( ( rule__VALUE_WORD__Alternatives_0 ) )
            // InternalDsl.g:868:2: ( rule__VALUE_WORD__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVALUE_WORDAccess().getAlternatives_0()); 
            }
            // InternalDsl.g:869:2: ( rule__VALUE_WORD__Alternatives_0 )
            // InternalDsl.g:869:3: rule__VALUE_WORD__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__VALUE_WORD__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVALUE_WORDAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALUE_WORD__Group__0__Impl"


    // $ANTLR start "rule__VALUE_WORD__Group__1"
    // InternalDsl.g:877:1: rule__VALUE_WORD__Group__1 : rule__VALUE_WORD__Group__1__Impl ;
    public final void rule__VALUE_WORD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:881:1: ( rule__VALUE_WORD__Group__1__Impl )
            // InternalDsl.g:882:2: rule__VALUE_WORD__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VALUE_WORD__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALUE_WORD__Group__1"


    // $ANTLR start "rule__VALUE_WORD__Group__1__Impl"
    // InternalDsl.g:888:1: rule__VALUE_WORD__Group__1__Impl : ( ( rule__VALUE_WORD__Group_1__0 )? ) ;
    public final void rule__VALUE_WORD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:892:1: ( ( ( rule__VALUE_WORD__Group_1__0 )? ) )
            // InternalDsl.g:893:1: ( ( rule__VALUE_WORD__Group_1__0 )? )
            {
            // InternalDsl.g:893:1: ( ( rule__VALUE_WORD__Group_1__0 )? )
            // InternalDsl.g:894:2: ( rule__VALUE_WORD__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVALUE_WORDAccess().getGroup_1()); 
            }
            // InternalDsl.g:895:2: ( rule__VALUE_WORD__Group_1__0 )?
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalDsl.g:895:3: rule__VALUE_WORD__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VALUE_WORD__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVALUE_WORDAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALUE_WORD__Group__1__Impl"


    // $ANTLR start "rule__VALUE_WORD__Group_1__0"
    // InternalDsl.g:904:1: rule__VALUE_WORD__Group_1__0 : rule__VALUE_WORD__Group_1__0__Impl rule__VALUE_WORD__Group_1__1 ;
    public final void rule__VALUE_WORD__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:908:1: ( rule__VALUE_WORD__Group_1__0__Impl rule__VALUE_WORD__Group_1__1 )
            // InternalDsl.g:909:2: rule__VALUE_WORD__Group_1__0__Impl rule__VALUE_WORD__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__VALUE_WORD__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VALUE_WORD__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALUE_WORD__Group_1__0"


    // $ANTLR start "rule__VALUE_WORD__Group_1__0__Impl"
    // InternalDsl.g:916:1: rule__VALUE_WORD__Group_1__0__Impl : ( ( rule__VALUE_WORD__Alternatives_1_0 )* ) ;
    public final void rule__VALUE_WORD__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:920:1: ( ( ( rule__VALUE_WORD__Alternatives_1_0 )* ) )
            // InternalDsl.g:921:1: ( ( rule__VALUE_WORD__Alternatives_1_0 )* )
            {
            // InternalDsl.g:921:1: ( ( rule__VALUE_WORD__Alternatives_1_0 )* )
            // InternalDsl.g:922:2: ( rule__VALUE_WORD__Alternatives_1_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVALUE_WORDAccess().getAlternatives_1_0()); 
            }
            // InternalDsl.g:923:2: ( rule__VALUE_WORD__Alternatives_1_0 )*
            loop20:
            do {
                int alt20=2;
                alt20 = dfa20.predict(input);
                switch (alt20) {
            	case 1 :
            	    // InternalDsl.g:923:3: rule__VALUE_WORD__Alternatives_1_0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__VALUE_WORD__Alternatives_1_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVALUE_WORDAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALUE_WORD__Group_1__0__Impl"


    // $ANTLR start "rule__VALUE_WORD__Group_1__1"
    // InternalDsl.g:931:1: rule__VALUE_WORD__Group_1__1 : rule__VALUE_WORD__Group_1__1__Impl ;
    public final void rule__VALUE_WORD__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:935:1: ( rule__VALUE_WORD__Group_1__1__Impl )
            // InternalDsl.g:936:2: rule__VALUE_WORD__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VALUE_WORD__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALUE_WORD__Group_1__1"


    // $ANTLR start "rule__VALUE_WORD__Group_1__1__Impl"
    // InternalDsl.g:942:1: rule__VALUE_WORD__Group_1__1__Impl : ( ( rule__VALUE_WORD__Group_1_1__0 ) ) ;
    public final void rule__VALUE_WORD__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:946:1: ( ( ( rule__VALUE_WORD__Group_1_1__0 ) ) )
            // InternalDsl.g:947:1: ( ( rule__VALUE_WORD__Group_1_1__0 ) )
            {
            // InternalDsl.g:947:1: ( ( rule__VALUE_WORD__Group_1_1__0 ) )
            // InternalDsl.g:948:2: ( rule__VALUE_WORD__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVALUE_WORDAccess().getGroup_1_1()); 
            }
            // InternalDsl.g:949:2: ( rule__VALUE_WORD__Group_1_1__0 )
            // InternalDsl.g:949:3: rule__VALUE_WORD__Group_1_1__0
            {
            pushFollow(FOLLOW_2);
            rule__VALUE_WORD__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVALUE_WORDAccess().getGroup_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALUE_WORD__Group_1__1__Impl"


    // $ANTLR start "rule__VALUE_WORD__Group_1_1__0"
    // InternalDsl.g:958:1: rule__VALUE_WORD__Group_1_1__0 : rule__VALUE_WORD__Group_1_1__0__Impl ;
    public final void rule__VALUE_WORD__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:962:1: ( rule__VALUE_WORD__Group_1_1__0__Impl )
            // InternalDsl.g:963:2: rule__VALUE_WORD__Group_1_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VALUE_WORD__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALUE_WORD__Group_1_1__0"


    // $ANTLR start "rule__VALUE_WORD__Group_1_1__0__Impl"
    // InternalDsl.g:969:1: rule__VALUE_WORD__Group_1_1__0__Impl : ( ( rule__VALUE_WORD__Alternatives_1_1_0 ) ) ;
    public final void rule__VALUE_WORD__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:973:1: ( ( ( rule__VALUE_WORD__Alternatives_1_1_0 ) ) )
            // InternalDsl.g:974:1: ( ( rule__VALUE_WORD__Alternatives_1_1_0 ) )
            {
            // InternalDsl.g:974:1: ( ( rule__VALUE_WORD__Alternatives_1_1_0 ) )
            // InternalDsl.g:975:2: ( rule__VALUE_WORD__Alternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVALUE_WORDAccess().getAlternatives_1_1_0()); 
            }
            // InternalDsl.g:976:2: ( rule__VALUE_WORD__Alternatives_1_1_0 )
            // InternalDsl.g:976:3: rule__VALUE_WORD__Alternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__VALUE_WORD__Alternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVALUE_WORDAccess().getAlternatives_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALUE_WORD__Group_1_1__0__Impl"


    // $ANTLR start "rule__MULTILINE__Group__0"
    // InternalDsl.g:985:1: rule__MULTILINE__Group__0 : rule__MULTILINE__Group__0__Impl rule__MULTILINE__Group__1 ;
    public final void rule__MULTILINE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:989:1: ( rule__MULTILINE__Group__0__Impl rule__MULTILINE__Group__1 )
            // InternalDsl.g:990:2: rule__MULTILINE__Group__0__Impl rule__MULTILINE__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__MULTILINE__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MULTILINE__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MULTILINE__Group__0"


    // $ANTLR start "rule__MULTILINE__Group__0__Impl"
    // InternalDsl.g:997:1: rule__MULTILINE__Group__0__Impl : ( ruleVALUE_WORD ) ;
    public final void rule__MULTILINE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1001:1: ( ( ruleVALUE_WORD ) )
            // InternalDsl.g:1002:1: ( ruleVALUE_WORD )
            {
            // InternalDsl.g:1002:1: ( ruleVALUE_WORD )
            // InternalDsl.g:1003:2: ruleVALUE_WORD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMULTILINEAccess().getVALUE_WORDParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVALUE_WORD();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMULTILINEAccess().getVALUE_WORDParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MULTILINE__Group__0__Impl"


    // $ANTLR start "rule__MULTILINE__Group__1"
    // InternalDsl.g:1012:1: rule__MULTILINE__Group__1 : rule__MULTILINE__Group__1__Impl ;
    public final void rule__MULTILINE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1016:1: ( rule__MULTILINE__Group__1__Impl )
            // InternalDsl.g:1017:2: rule__MULTILINE__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MULTILINE__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MULTILINE__Group__1"


    // $ANTLR start "rule__MULTILINE__Group__1__Impl"
    // InternalDsl.g:1023:1: rule__MULTILINE__Group__1__Impl : ( ( rule__MULTILINE__Group_1__0 )* ) ;
    public final void rule__MULTILINE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1027:1: ( ( ( rule__MULTILINE__Group_1__0 )* ) )
            // InternalDsl.g:1028:1: ( ( rule__MULTILINE__Group_1__0 )* )
            {
            // InternalDsl.g:1028:1: ( ( rule__MULTILINE__Group_1__0 )* )
            // InternalDsl.g:1029:2: ( rule__MULTILINE__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMULTILINEAccess().getGroup_1()); 
            }
            // InternalDsl.g:1030:2: ( rule__MULTILINE__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==10) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDsl.g:1030:3: rule__MULTILINE__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__MULTILINE__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMULTILINEAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MULTILINE__Group__1__Impl"


    // $ANTLR start "rule__MULTILINE__Group_1__0"
    // InternalDsl.g:1039:1: rule__MULTILINE__Group_1__0 : rule__MULTILINE__Group_1__0__Impl rule__MULTILINE__Group_1__1 ;
    public final void rule__MULTILINE__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1043:1: ( rule__MULTILINE__Group_1__0__Impl rule__MULTILINE__Group_1__1 )
            // InternalDsl.g:1044:2: rule__MULTILINE__Group_1__0__Impl rule__MULTILINE__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__MULTILINE__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MULTILINE__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MULTILINE__Group_1__0"


    // $ANTLR start "rule__MULTILINE__Group_1__0__Impl"
    // InternalDsl.g:1051:1: rule__MULTILINE__Group_1__0__Impl : ( '\\\\\\n' ) ;
    public final void rule__MULTILINE__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1055:1: ( ( '\\\\\\n' ) )
            // InternalDsl.g:1056:1: ( '\\\\\\n' )
            {
            // InternalDsl.g:1056:1: ( '\\\\\\n' )
            // InternalDsl.g:1057:2: '\\\\\\n'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMULTILINEAccess().getReverseSolidusControl000aKeyword_1_0()); 
            }
            match(input,10,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMULTILINEAccess().getReverseSolidusControl000aKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MULTILINE__Group_1__0__Impl"


    // $ANTLR start "rule__MULTILINE__Group_1__1"
    // InternalDsl.g:1066:1: rule__MULTILINE__Group_1__1 : rule__MULTILINE__Group_1__1__Impl rule__MULTILINE__Group_1__2 ;
    public final void rule__MULTILINE__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1070:1: ( rule__MULTILINE__Group_1__1__Impl rule__MULTILINE__Group_1__2 )
            // InternalDsl.g:1071:2: rule__MULTILINE__Group_1__1__Impl rule__MULTILINE__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__MULTILINE__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MULTILINE__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MULTILINE__Group_1__1"


    // $ANTLR start "rule__MULTILINE__Group_1__1__Impl"
    // InternalDsl.g:1078:1: rule__MULTILINE__Group_1__1__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__MULTILINE__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1082:1: ( ( ( RULE_SPACE )* ) )
            // InternalDsl.g:1083:1: ( ( RULE_SPACE )* )
            {
            // InternalDsl.g:1083:1: ( ( RULE_SPACE )* )
            // InternalDsl.g:1084:2: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMULTILINEAccess().getSPACETerminalRuleCall_1_1()); 
            }
            // InternalDsl.g:1085:2: ( RULE_SPACE )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_SPACE) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDsl.g:1085:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMULTILINEAccess().getSPACETerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MULTILINE__Group_1__1__Impl"


    // $ANTLR start "rule__MULTILINE__Group_1__2"
    // InternalDsl.g:1093:1: rule__MULTILINE__Group_1__2 : rule__MULTILINE__Group_1__2__Impl ;
    public final void rule__MULTILINE__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1097:1: ( rule__MULTILINE__Group_1__2__Impl )
            // InternalDsl.g:1098:2: rule__MULTILINE__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MULTILINE__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MULTILINE__Group_1__2"


    // $ANTLR start "rule__MULTILINE__Group_1__2__Impl"
    // InternalDsl.g:1104:1: rule__MULTILINE__Group_1__2__Impl : ( ruleVALUE_WORD ) ;
    public final void rule__MULTILINE__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1108:1: ( ( ruleVALUE_WORD ) )
            // InternalDsl.g:1109:1: ( ruleVALUE_WORD )
            {
            // InternalDsl.g:1109:1: ( ruleVALUE_WORD )
            // InternalDsl.g:1110:2: ruleVALUE_WORD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMULTILINEAccess().getVALUE_WORDParserRuleCall_1_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleVALUE_WORD();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMULTILINEAccess().getVALUE_WORDParserRuleCall_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MULTILINE__Group_1__2__Impl"


    // $ANTLR start "rule__Dsl__NameAssignment_5"
    // InternalDsl.g:1120:1: rule__Dsl__NameAssignment_5 : ( ruleMULTILINE ) ;
    public final void rule__Dsl__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1124:1: ( ( ruleMULTILINE ) )
            // InternalDsl.g:1125:2: ( ruleMULTILINE )
            {
            // InternalDsl.g:1125:2: ( ruleMULTILINE )
            // InternalDsl.g:1126:3: ruleMULTILINE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getNameMULTILINEParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMULTILINE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getNameMULTILINEParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dsl__NameAssignment_5"


    // $ANTLR start "rule__Dsl__EntriesAssignment_8"
    // InternalDsl.g:1135:1: rule__Dsl__EntriesAssignment_8 : ( ruleEntry ) ;
    public final void rule__Dsl__EntriesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1139:1: ( ( ruleEntry ) )
            // InternalDsl.g:1140:2: ( ruleEntry )
            {
            // InternalDsl.g:1140:2: ( ruleEntry )
            // InternalDsl.g:1141:3: ruleEntry
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getEntriesEntryParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEntry();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getEntriesEntryParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dsl__EntriesAssignment_8"


    // $ANTLR start "rule__Entry__KeyAssignment_1"
    // InternalDsl.g:1150:1: rule__Entry__KeyAssignment_1 : ( ruleWORD ) ;
    public final void rule__Entry__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1154:1: ( ( ruleWORD ) )
            // InternalDsl.g:1155:2: ( ruleWORD )
            {
            // InternalDsl.g:1155:2: ( ruleWORD )
            // InternalDsl.g:1156:3: ruleWORD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryAccess().getKeyWORDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleWORD();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryAccess().getKeyWORDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__KeyAssignment_1"


    // $ANTLR start "rule__Entry__ValueAssignment_5"
    // InternalDsl.g:1165:1: rule__Entry__ValueAssignment_5 : ( ruleMULTILINE ) ;
    public final void rule__Entry__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1169:1: ( ( ruleMULTILINE ) )
            // InternalDsl.g:1170:2: ( ruleMULTILINE )
            {
            // InternalDsl.g:1170:2: ( ruleMULTILINE )
            // InternalDsl.g:1171:3: ruleMULTILINE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryAccess().getValueMULTILINEParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMULTILINE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryAccess().getValueMULTILINEParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__ValueAssignment_5"

    // $ANTLR start synpred9_InternalDsl
    public final void synpred9_InternalDsl_fragment() throws RecognitionException {   
        // InternalDsl.g:464:3: ( RULE_SPACE )
        // InternalDsl.g:464:3: RULE_SPACE
        {
        match(input,RULE_SPACE,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalDsl

    // $ANTLR start synpred15_InternalDsl
    public final void synpred15_InternalDsl_fragment() throws RecognitionException {   
        // InternalDsl.g:707:3: ( RULE_SPACE )
        // InternalDsl.g:707:3: RULE_SPACE
        {
        match(input,RULE_SPACE,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalDsl

    // $ANTLR start synpred19_InternalDsl
    public final void synpred19_InternalDsl_fragment() throws RecognitionException {   
        // InternalDsl.g:895:3: ( rule__VALUE_WORD__Group_1__0 )
        // InternalDsl.g:895:3: rule__VALUE_WORD__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__VALUE_WORD__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_InternalDsl

    // $ANTLR start synpred20_InternalDsl
    public final void synpred20_InternalDsl_fragment() throws RecognitionException {   
        // InternalDsl.g:923:3: ( rule__VALUE_WORD__Alternatives_1_0 )
        // InternalDsl.g:923:3: rule__VALUE_WORD__Alternatives_1_0
        {
        pushFollow(FOLLOW_2);
        rule__VALUE_WORD__Alternatives_1_0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_InternalDsl

    // Delegated rules

    public final boolean synpred9_InternalDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String dfa_1s = "\4\uffff";
    static final String dfa_2s = "\1\3\3\uffff";
    static final String dfa_3s = "\1\4\1\uffff\1\4\1\uffff";
    static final String dfa_4s = "\1\6\1\uffff\1\6\1\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\uffff\1\2";
    static final String dfa_6s = "\4\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3",
            "",
            "\1\1\1\2\1\3",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "787:2: ( rule__WORD__Group_1__0 )?";
        }
    }
    static final String dfa_8s = "\5\uffff";
    static final String dfa_9s = "\1\uffff\1\3\3\uffff";
    static final String dfa_10s = "\2\4\2\uffff\1\4";
    static final String dfa_11s = "\1\5\1\6\2\uffff\1\6";
    static final String dfa_12s = "\2\uffff\1\1\1\2\1\uffff";
    static final String dfa_13s = "\5\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\1\2",
            "\1\2\1\4\1\3",
            "",
            "",
            "\1\2\1\4\1\3"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 815:2: ( rule__WORD__Alternatives_1_0 )*";
        }
    }
    static final String dfa_15s = "\13\uffff";
    static final String dfa_16s = "\1\4\1\2\1\uffff\1\4\2\uffff\3\2\2\uffff";
    static final String dfa_17s = "\2\4\1\uffff\1\4\1\uffff\1\0\3\4\2\0";
    static final String dfa_18s = "\2\12\1\uffff\1\11\1\uffff\1\0\1\12\2\11\2\0";
    static final String dfa_19s = "\2\uffff\1\1\1\uffff\1\2\6\uffff";
    static final String dfa_20s = "\5\uffff\1\0\3\uffff\1\2\1\1}>";
    static final String[] dfa_21s = {
            "\1\1\1\3\1\2\2\uffff\2\4",
            "\1\5\1\7\1\6\2\uffff\2\2",
            "",
            "\1\1\1\3\1\2\2\uffff\1\4",
            "",
            "\1\uffff",
            "\1\11\1\10\1\12\2\uffff\2\2",
            "\1\5\1\7\1\6\2\uffff\1\2",
            "\1\11\1\10\1\12\2\uffff\1\2",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "895:2: ( rule__VALUE_WORD__Group_1__0 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_5 = input.LA(1);

                         
                        int index19_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalDsl()) ) {s = 2;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index19_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_10 = input.LA(1);

                         
                        int index19_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalDsl()) ) {s = 2;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index19_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_9 = input.LA(1);

                         
                        int index19_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalDsl()) ) {s = 2;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index19_9);
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
    static final String dfa_22s = "\15\uffff";
    static final String dfa_23s = "\1\uffff\2\4\2\uffff\1\4\1\3\1\uffff\3\3\2\uffff";
    static final String dfa_24s = "\3\4\2\uffff\2\4\1\0\3\4\2\0";
    static final String dfa_25s = "\1\6\2\12\2\uffff\1\11\1\12\1\0\1\11\1\12\1\11\2\0";
    static final String dfa_26s = "\3\uffff\1\1\1\2\10\uffff";
    static final String dfa_27s = "\7\uffff\1\2\3\uffff\1\0\1\1}>";
    static final String[] dfa_28s = {
            "\1\1\1\3\1\2",
            "\1\6\1\5\1\3\2\uffff\2\4",
            "\1\6\1\5\1\3\2\uffff\2\4",
            "",
            "",
            "\1\6\1\5\1\3\2\uffff\1\4",
            "\1\7\1\10\1\11\2\uffff\2\3",
            "\1\uffff",
            "\1\7\1\10\1\11\2\uffff\1\3",
            "\1\13\1\12\1\14\2\uffff\2\3",
            "\1\13\1\12\1\14\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[][] dfa_28 = unpackEncodedStringArray(dfa_28s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_22;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "()* loopback of 923:2: ( rule__VALUE_WORD__Alternatives_1_0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_11 = input.LA(1);

                         
                        int index20_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalDsl()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index20_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_12 = input.LA(1);

                         
                        int index20_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalDsl()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index20_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_7 = input.LA(1);

                         
                        int index20_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalDsl()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index20_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000230L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000402L});

}