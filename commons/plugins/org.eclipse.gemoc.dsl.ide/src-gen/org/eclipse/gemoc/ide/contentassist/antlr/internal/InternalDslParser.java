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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LETTER", "RULE_SEPARATOR", "RULE_SPACE", "RULE_SL_COMMENT", "'\\r'", "'\\n'", "'\\\\'"
    };
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int RULE_SEPARATOR=5;
    public static final int RULE_SL_COMMENT=7;
    public static final int RULE_LETTER=4;
    public static final int RULE_SPACE=6;
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


    // $ANTLR start "entryRuleVALUE_WORD"
    // InternalDsl.g:104:1: entryRuleVALUE_WORD : ruleVALUE_WORD EOF ;
    public final void entryRuleVALUE_WORD() throws RecognitionException {
        try {
            // InternalDsl.g:105:1: ( ruleVALUE_WORD EOF )
            // InternalDsl.g:106:1: ruleVALUE_WORD EOF
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
    // InternalDsl.g:113:1: ruleVALUE_WORD : ( ( rule__VALUE_WORD__Group__0 ) ) ;
    public final void ruleVALUE_WORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:117:2: ( ( ( rule__VALUE_WORD__Group__0 ) ) )
            // InternalDsl.g:118:2: ( ( rule__VALUE_WORD__Group__0 ) )
            {
            // InternalDsl.g:118:2: ( ( rule__VALUE_WORD__Group__0 ) )
            // InternalDsl.g:119:3: ( rule__VALUE_WORD__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVALUE_WORDAccess().getGroup()); 
            }
            // InternalDsl.g:120:3: ( rule__VALUE_WORD__Group__0 )
            // InternalDsl.g:120:4: rule__VALUE_WORD__Group__0
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
    // InternalDsl.g:129:1: entryRuleMULTILINE : ruleMULTILINE EOF ;
    public final void entryRuleMULTILINE() throws RecognitionException {
        try {
            // InternalDsl.g:130:1: ( ruleMULTILINE EOF )
            // InternalDsl.g:131:1: ruleMULTILINE EOF
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
    // InternalDsl.g:138:1: ruleMULTILINE : ( ( rule__MULTILINE__Group__0 ) ) ;
    public final void ruleMULTILINE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:142:2: ( ( ( rule__MULTILINE__Group__0 ) ) )
            // InternalDsl.g:143:2: ( ( rule__MULTILINE__Group__0 ) )
            {
            // InternalDsl.g:143:2: ( ( rule__MULTILINE__Group__0 ) )
            // InternalDsl.g:144:3: ( rule__MULTILINE__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMULTILINEAccess().getGroup()); 
            }
            // InternalDsl.g:145:3: ( rule__MULTILINE__Group__0 )
            // InternalDsl.g:145:4: rule__MULTILINE__Group__0
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


    // $ANTLR start "entryRuleWORD"
    // InternalDsl.g:154:1: entryRuleWORD : ruleWORD EOF ;
    public final void entryRuleWORD() throws RecognitionException {
        try {
            // InternalDsl.g:155:1: ( ruleWORD EOF )
            // InternalDsl.g:156:1: ruleWORD EOF
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
    // InternalDsl.g:163:1: ruleWORD : ( ( rule__WORD__Group__0 ) ) ;
    public final void ruleWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:167:2: ( ( ( rule__WORD__Group__0 ) ) )
            // InternalDsl.g:168:2: ( ( rule__WORD__Group__0 ) )
            {
            // InternalDsl.g:168:2: ( ( rule__WORD__Group__0 ) )
            // InternalDsl.g:169:3: ( rule__WORD__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWORDAccess().getGroup()); 
            }
            // InternalDsl.g:170:3: ( rule__WORD__Group__0 )
            // InternalDsl.g:170:4: rule__WORD__Group__0
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


    // $ANTLR start "rule__Dsl__Alternatives_1"
    // InternalDsl.g:178:1: rule__Dsl__Alternatives_1 : ( ( ( rule__Dsl__Group_1_0__0 ) ) | ( ( rule__Dsl__Group_1_1__0 ) ) );
    public final void rule__Dsl__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:182:1: ( ( ( rule__Dsl__Group_1_0__0 ) ) | ( ( rule__Dsl__Group_1_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_SPACE) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=8 && LA1_0<=9)) ) {
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
                    // InternalDsl.g:183:2: ( ( rule__Dsl__Group_1_0__0 ) )
                    {
                    // InternalDsl.g:183:2: ( ( rule__Dsl__Group_1_0__0 ) )
                    // InternalDsl.g:184:3: ( rule__Dsl__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDslAccess().getGroup_1_0()); 
                    }
                    // InternalDsl.g:185:3: ( rule__Dsl__Group_1_0__0 )
                    // InternalDsl.g:185:4: rule__Dsl__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dsl__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDslAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:189:2: ( ( rule__Dsl__Group_1_1__0 ) )
                    {
                    // InternalDsl.g:189:2: ( ( rule__Dsl__Group_1_1__0 ) )
                    // InternalDsl.g:190:3: ( rule__Dsl__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDslAccess().getGroup_1_1()); 
                    }
                    // InternalDsl.g:191:3: ( rule__Dsl__Group_1_1__0 )
                    // InternalDsl.g:191:4: rule__Dsl__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dsl__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDslAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__Dsl__Alternatives_1"


    // $ANTLR start "rule__Dsl__Alternatives_6_2"
    // InternalDsl.g:199:1: rule__Dsl__Alternatives_6_2 : ( ( ( rule__Dsl__Group_6_2_0__0 ) ) | ( ( rule__Dsl__Group_6_2_1__0 ) ) );
    public final void rule__Dsl__Alternatives_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:203:1: ( ( ( rule__Dsl__Group_6_2_0__0 ) ) | ( ( rule__Dsl__Group_6_2_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_SPACE) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=8 && LA2_0<=9)) ) {
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
                    // InternalDsl.g:204:2: ( ( rule__Dsl__Group_6_2_0__0 ) )
                    {
                    // InternalDsl.g:204:2: ( ( rule__Dsl__Group_6_2_0__0 ) )
                    // InternalDsl.g:205:3: ( rule__Dsl__Group_6_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDslAccess().getGroup_6_2_0()); 
                    }
                    // InternalDsl.g:206:3: ( rule__Dsl__Group_6_2_0__0 )
                    // InternalDsl.g:206:4: rule__Dsl__Group_6_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dsl__Group_6_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDslAccess().getGroup_6_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:210:2: ( ( rule__Dsl__Group_6_2_1__0 ) )
                    {
                    // InternalDsl.g:210:2: ( ( rule__Dsl__Group_6_2_1__0 ) )
                    // InternalDsl.g:211:3: ( rule__Dsl__Group_6_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDslAccess().getGroup_6_2_1()); 
                    }
                    // InternalDsl.g:212:3: ( rule__Dsl__Group_6_2_1__0 )
                    // InternalDsl.g:212:4: rule__Dsl__Group_6_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dsl__Group_6_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDslAccess().getGroup_6_2_1()); 
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
    // $ANTLR end "rule__Dsl__Alternatives_6_2"


    // $ANTLR start "rule__VALUE_WORD__Alternatives_0"
    // InternalDsl.g:220:1: rule__VALUE_WORD__Alternatives_0 : ( ( RULE_LETTER ) | ( RULE_SEPARATOR ) );
    public final void rule__VALUE_WORD__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:224:1: ( ( RULE_LETTER ) | ( RULE_SEPARATOR ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_LETTER) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_SEPARATOR) ) {
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
                    // InternalDsl.g:225:2: ( RULE_LETTER )
                    {
                    // InternalDsl.g:225:2: ( RULE_LETTER )
                    // InternalDsl.g:226:3: RULE_LETTER
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
                    // InternalDsl.g:231:2: ( RULE_SEPARATOR )
                    {
                    // InternalDsl.g:231:2: ( RULE_SEPARATOR )
                    // InternalDsl.g:232:3: RULE_SEPARATOR
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


    // $ANTLR start "rule__VALUE_WORD__Alternatives_1_1"
    // InternalDsl.g:241:1: rule__VALUE_WORD__Alternatives_1_1 : ( ( RULE_SPACE ) | ( ( rule__VALUE_WORD__Alternatives_1_1_1 ) ) );
    public final void rule__VALUE_WORD__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:245:1: ( ( RULE_SPACE ) | ( ( rule__VALUE_WORD__Alternatives_1_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_SPACE) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=RULE_LETTER && LA4_0<=RULE_SEPARATOR)) ) {
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
                    // InternalDsl.g:246:2: ( RULE_SPACE )
                    {
                    // InternalDsl.g:246:2: ( RULE_SPACE )
                    // InternalDsl.g:247:3: RULE_SPACE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVALUE_WORDAccess().getSPACETerminalRuleCall_1_1_0()); 
                    }
                    match(input,RULE_SPACE,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVALUE_WORDAccess().getSPACETerminalRuleCall_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:252:2: ( ( rule__VALUE_WORD__Alternatives_1_1_1 ) )
                    {
                    // InternalDsl.g:252:2: ( ( rule__VALUE_WORD__Alternatives_1_1_1 ) )
                    // InternalDsl.g:253:3: ( rule__VALUE_WORD__Alternatives_1_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVALUE_WORDAccess().getAlternatives_1_1_1()); 
                    }
                    // InternalDsl.g:254:3: ( rule__VALUE_WORD__Alternatives_1_1_1 )
                    // InternalDsl.g:254:4: rule__VALUE_WORD__Alternatives_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VALUE_WORD__Alternatives_1_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVALUE_WORDAccess().getAlternatives_1_1_1()); 
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
    // $ANTLR end "rule__VALUE_WORD__Alternatives_1_1"


    // $ANTLR start "rule__VALUE_WORD__Alternatives_1_1_1"
    // InternalDsl.g:262:1: rule__VALUE_WORD__Alternatives_1_1_1 : ( ( RULE_LETTER ) | ( RULE_SEPARATOR ) );
    public final void rule__VALUE_WORD__Alternatives_1_1_1() throws RecognitionException {

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
                       before(grammarAccess.getVALUE_WORDAccess().getLETTERTerminalRuleCall_1_1_1_0()); 
                    }
                    match(input,RULE_LETTER,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVALUE_WORDAccess().getLETTERTerminalRuleCall_1_1_1_0()); 
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
                       before(grammarAccess.getVALUE_WORDAccess().getSEPARATORTerminalRuleCall_1_1_1_1()); 
                    }
                    match(input,RULE_SEPARATOR,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVALUE_WORDAccess().getSEPARATORTerminalRuleCall_1_1_1_1()); 
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
    // $ANTLR end "rule__VALUE_WORD__Alternatives_1_1_1"


    // $ANTLR start "rule__VALUE_WORD__Alternatives_1_2"
    // InternalDsl.g:283:1: rule__VALUE_WORD__Alternatives_1_2 : ( ( RULE_LETTER ) | ( RULE_SEPARATOR ) );
    public final void rule__VALUE_WORD__Alternatives_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:287:1: ( ( RULE_LETTER ) | ( RULE_SEPARATOR ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_LETTER) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_SEPARATOR) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:288:2: ( RULE_LETTER )
                    {
                    // InternalDsl.g:288:2: ( RULE_LETTER )
                    // InternalDsl.g:289:3: RULE_LETTER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVALUE_WORDAccess().getLETTERTerminalRuleCall_1_2_0()); 
                    }
                    match(input,RULE_LETTER,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVALUE_WORDAccess().getLETTERTerminalRuleCall_1_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:294:2: ( RULE_SEPARATOR )
                    {
                    // InternalDsl.g:294:2: ( RULE_SEPARATOR )
                    // InternalDsl.g:295:3: RULE_SEPARATOR
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVALUE_WORDAccess().getSEPARATORTerminalRuleCall_1_2_1()); 
                    }
                    match(input,RULE_SEPARATOR,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVALUE_WORDAccess().getSEPARATORTerminalRuleCall_1_2_1()); 
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
    // $ANTLR end "rule__VALUE_WORD__Alternatives_1_2"


    // $ANTLR start "rule__WORD__Alternatives_1_1"
    // InternalDsl.g:304:1: rule__WORD__Alternatives_1_1 : ( ( RULE_SPACE ) | ( RULE_LETTER ) );
    public final void rule__WORD__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:308:1: ( ( RULE_SPACE ) | ( RULE_LETTER ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_SPACE) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_LETTER) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:309:2: ( RULE_SPACE )
                    {
                    // InternalDsl.g:309:2: ( RULE_SPACE )
                    // InternalDsl.g:310:3: RULE_SPACE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWORDAccess().getSPACETerminalRuleCall_1_1_0()); 
                    }
                    match(input,RULE_SPACE,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWORDAccess().getSPACETerminalRuleCall_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:315:2: ( RULE_LETTER )
                    {
                    // InternalDsl.g:315:2: ( RULE_LETTER )
                    // InternalDsl.g:316:3: RULE_LETTER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWORDAccess().getLETTERTerminalRuleCall_1_1_1()); 
                    }
                    match(input,RULE_LETTER,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWORDAccess().getLETTERTerminalRuleCall_1_1_1()); 
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
    // $ANTLR end "rule__WORD__Alternatives_1_1"


    // $ANTLR start "rule__Dsl__Group__0"
    // InternalDsl.g:325:1: rule__Dsl__Group__0 : rule__Dsl__Group__0__Impl rule__Dsl__Group__1 ;
    public final void rule__Dsl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:329:1: ( rule__Dsl__Group__0__Impl rule__Dsl__Group__1 )
            // InternalDsl.g:330:2: rule__Dsl__Group__0__Impl rule__Dsl__Group__1
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
    // InternalDsl.g:337:1: rule__Dsl__Group__0__Impl : ( () ) ;
    public final void rule__Dsl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:341:1: ( ( () ) )
            // InternalDsl.g:342:1: ( () )
            {
            // InternalDsl.g:342:1: ( () )
            // InternalDsl.g:343:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getDslAction_0()); 
            }
            // InternalDsl.g:344:2: ()
            // InternalDsl.g:344:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getDslAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dsl__Group__0__Impl"


    // $ANTLR start "rule__Dsl__Group__1"
    // InternalDsl.g:352:1: rule__Dsl__Group__1 : rule__Dsl__Group__1__Impl rule__Dsl__Group__2 ;
    public final void rule__Dsl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:356:1: ( rule__Dsl__Group__1__Impl rule__Dsl__Group__2 )
            // InternalDsl.g:357:2: rule__Dsl__Group__1__Impl rule__Dsl__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalDsl.g:364:1: rule__Dsl__Group__1__Impl : ( ( rule__Dsl__Alternatives_1 )* ) ;
    public final void rule__Dsl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:368:1: ( ( ( rule__Dsl__Alternatives_1 )* ) )
            // InternalDsl.g:369:1: ( ( rule__Dsl__Alternatives_1 )* )
            {
            // InternalDsl.g:369:1: ( ( rule__Dsl__Alternatives_1 )* )
            // InternalDsl.g:370:2: ( rule__Dsl__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getAlternatives_1()); 
            }
            // InternalDsl.g:371:2: ( rule__Dsl__Alternatives_1 )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:371:3: rule__Dsl__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Dsl__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getAlternatives_1()); 
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
    // InternalDsl.g:379:1: rule__Dsl__Group__2 : rule__Dsl__Group__2__Impl rule__Dsl__Group__3 ;
    public final void rule__Dsl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:383:1: ( rule__Dsl__Group__2__Impl rule__Dsl__Group__3 )
            // InternalDsl.g:384:2: rule__Dsl__Group__2__Impl rule__Dsl__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalDsl.g:391:1: rule__Dsl__Group__2__Impl : ( ( rule__Dsl__Group_2__0 )* ) ;
    public final void rule__Dsl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:395:1: ( ( ( rule__Dsl__Group_2__0 )* ) )
            // InternalDsl.g:396:1: ( ( rule__Dsl__Group_2__0 )* )
            {
            // InternalDsl.g:396:1: ( ( rule__Dsl__Group_2__0 )* )
            // InternalDsl.g:397:2: ( rule__Dsl__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getGroup_2()); 
            }
            // InternalDsl.g:398:2: ( rule__Dsl__Group_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_SL_COMMENT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:398:3: rule__Dsl__Group_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Dsl__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getGroup_2()); 
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
    // InternalDsl.g:406:1: rule__Dsl__Group__3 : rule__Dsl__Group__3__Impl rule__Dsl__Group__4 ;
    public final void rule__Dsl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:410:1: ( rule__Dsl__Group__3__Impl rule__Dsl__Group__4 )
            // InternalDsl.g:411:2: rule__Dsl__Group__3__Impl rule__Dsl__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalDsl.g:418:1: rule__Dsl__Group__3__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__Dsl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:422:1: ( ( ( RULE_SPACE )* ) )
            // InternalDsl.g:423:1: ( ( RULE_SPACE )* )
            {
            // InternalDsl.g:423:1: ( ( RULE_SPACE )* )
            // InternalDsl.g:424:2: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getSPACETerminalRuleCall_3()); 
            }
            // InternalDsl.g:425:2: ( RULE_SPACE )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_SPACE) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:425:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_6); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getSPACETerminalRuleCall_3()); 
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
    // InternalDsl.g:433:1: rule__Dsl__Group__4 : rule__Dsl__Group__4__Impl rule__Dsl__Group__5 ;
    public final void rule__Dsl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:437:1: ( rule__Dsl__Group__4__Impl rule__Dsl__Group__5 )
            // InternalDsl.g:438:2: rule__Dsl__Group__4__Impl rule__Dsl__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalDsl.g:445:1: rule__Dsl__Group__4__Impl : ( ( rule__Dsl__EntriesAssignment_4 ) ) ;
    public final void rule__Dsl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:449:1: ( ( ( rule__Dsl__EntriesAssignment_4 ) ) )
            // InternalDsl.g:450:1: ( ( rule__Dsl__EntriesAssignment_4 ) )
            {
            // InternalDsl.g:450:1: ( ( rule__Dsl__EntriesAssignment_4 ) )
            // InternalDsl.g:451:2: ( rule__Dsl__EntriesAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getEntriesAssignment_4()); 
            }
            // InternalDsl.g:452:2: ( rule__Dsl__EntriesAssignment_4 )
            // InternalDsl.g:452:3: rule__Dsl__EntriesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Dsl__EntriesAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getEntriesAssignment_4()); 
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
    // InternalDsl.g:460:1: rule__Dsl__Group__5 : rule__Dsl__Group__5__Impl rule__Dsl__Group__6 ;
    public final void rule__Dsl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:464:1: ( rule__Dsl__Group__5__Impl rule__Dsl__Group__6 )
            // InternalDsl.g:465:2: rule__Dsl__Group__5__Impl rule__Dsl__Group__6
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
    // InternalDsl.g:472:1: rule__Dsl__Group__5__Impl : ( ( rule__Dsl__Group_5__0 )* ) ;
    public final void rule__Dsl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:476:1: ( ( ( rule__Dsl__Group_5__0 )* ) )
            // InternalDsl.g:477:1: ( ( rule__Dsl__Group_5__0 )* )
            {
            // InternalDsl.g:477:1: ( ( rule__Dsl__Group_5__0 )* )
            // InternalDsl.g:478:2: ( rule__Dsl__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getGroup_5()); 
            }
            // InternalDsl.g:479:2: ( rule__Dsl__Group_5__0 )*
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:479:3: rule__Dsl__Group_5__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Dsl__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getGroup_5()); 
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
    // InternalDsl.g:487:1: rule__Dsl__Group__6 : rule__Dsl__Group__6__Impl ;
    public final void rule__Dsl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:491:1: ( rule__Dsl__Group__6__Impl )
            // InternalDsl.g:492:2: rule__Dsl__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dsl__Group__6__Impl();

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
    // InternalDsl.g:498:1: rule__Dsl__Group__6__Impl : ( ( rule__Dsl__Group_6__0 )? ) ;
    public final void rule__Dsl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:502:1: ( ( ( rule__Dsl__Group_6__0 )? ) )
            // InternalDsl.g:503:1: ( ( rule__Dsl__Group_6__0 )? )
            {
            // InternalDsl.g:503:1: ( ( rule__Dsl__Group_6__0 )? )
            // InternalDsl.g:504:2: ( rule__Dsl__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getGroup_6()); 
            }
            // InternalDsl.g:505:2: ( rule__Dsl__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=8 && LA12_0<=9)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:505:3: rule__Dsl__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dsl__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getGroup_6()); 
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


    // $ANTLR start "rule__Dsl__Group_1_0__0"
    // InternalDsl.g:514:1: rule__Dsl__Group_1_0__0 : rule__Dsl__Group_1_0__0__Impl rule__Dsl__Group_1_0__1 ;
    public final void rule__Dsl__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:518:1: ( rule__Dsl__Group_1_0__0__Impl rule__Dsl__Group_1_0__1 )
            // InternalDsl.g:519:2: rule__Dsl__Group_1_0__0__Impl rule__Dsl__Group_1_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Dsl__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Dsl__Group_1_0__1();

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
    // $ANTLR end "rule__Dsl__Group_1_0__0"


    // $ANTLR start "rule__Dsl__Group_1_0__0__Impl"
    // InternalDsl.g:526:1: rule__Dsl__Group_1_0__0__Impl : ( ( ( RULE_SPACE ) ) ( ( RULE_SPACE )* ) ) ;
    public final void rule__Dsl__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:530:1: ( ( ( ( RULE_SPACE ) ) ( ( RULE_SPACE )* ) ) )
            // InternalDsl.g:531:1: ( ( ( RULE_SPACE ) ) ( ( RULE_SPACE )* ) )
            {
            // InternalDsl.g:531:1: ( ( ( RULE_SPACE ) ) ( ( RULE_SPACE )* ) )
            // InternalDsl.g:532:2: ( ( RULE_SPACE ) ) ( ( RULE_SPACE )* )
            {
            // InternalDsl.g:532:2: ( ( RULE_SPACE ) )
            // InternalDsl.g:533:3: ( RULE_SPACE )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getSPACETerminalRuleCall_1_0_0()); 
            }
            // InternalDsl.g:534:3: ( RULE_SPACE )
            // InternalDsl.g:534:4: RULE_SPACE
            {
            match(input,RULE_SPACE,FOLLOW_6); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getSPACETerminalRuleCall_1_0_0()); 
            }

            }

            // InternalDsl.g:537:2: ( ( RULE_SPACE )* )
            // InternalDsl.g:538:3: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getSPACETerminalRuleCall_1_0_0()); 
            }
            // InternalDsl.g:539:3: ( RULE_SPACE )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_SPACE) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:539:4: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_6); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getSPACETerminalRuleCall_1_0_0()); 
            }

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
    // $ANTLR end "rule__Dsl__Group_1_0__0__Impl"


    // $ANTLR start "rule__Dsl__Group_1_0__1"
    // InternalDsl.g:548:1: rule__Dsl__Group_1_0__1 : rule__Dsl__Group_1_0__1__Impl rule__Dsl__Group_1_0__2 ;
    public final void rule__Dsl__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:552:1: ( rule__Dsl__Group_1_0__1__Impl rule__Dsl__Group_1_0__2 )
            // InternalDsl.g:553:2: rule__Dsl__Group_1_0__1__Impl rule__Dsl__Group_1_0__2
            {
            pushFollow(FOLLOW_7);
            rule__Dsl__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Dsl__Group_1_0__2();

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
    // $ANTLR end "rule__Dsl__Group_1_0__1"


    // $ANTLR start "rule__Dsl__Group_1_0__1__Impl"
    // InternalDsl.g:560:1: rule__Dsl__Group_1_0__1__Impl : ( ( '\\r' )? ) ;
    public final void rule__Dsl__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:564:1: ( ( ( '\\r' )? ) )
            // InternalDsl.g:565:1: ( ( '\\r' )? )
            {
            // InternalDsl.g:565:1: ( ( '\\r' )? )
            // InternalDsl.g:566:2: ( '\\r' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getCarriageReturnKeyword_1_0_1()); 
            }
            // InternalDsl.g:567:2: ( '\\r' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==8) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:567:3: '\\r'
                    {
                    match(input,8,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getCarriageReturnKeyword_1_0_1()); 
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
    // $ANTLR end "rule__Dsl__Group_1_0__1__Impl"


    // $ANTLR start "rule__Dsl__Group_1_0__2"
    // InternalDsl.g:575:1: rule__Dsl__Group_1_0__2 : rule__Dsl__Group_1_0__2__Impl ;
    public final void rule__Dsl__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:579:1: ( rule__Dsl__Group_1_0__2__Impl )
            // InternalDsl.g:580:2: rule__Dsl__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dsl__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__Dsl__Group_1_0__2"


    // $ANTLR start "rule__Dsl__Group_1_0__2__Impl"
    // InternalDsl.g:586:1: rule__Dsl__Group_1_0__2__Impl : ( '\\n' ) ;
    public final void rule__Dsl__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:590:1: ( ( '\\n' ) )
            // InternalDsl.g:591:1: ( '\\n' )
            {
            // InternalDsl.g:591:1: ( '\\n' )
            // InternalDsl.g:592:2: '\\n'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getLineFeedKeyword_1_0_2()); 
            }
            match(input,9,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getLineFeedKeyword_1_0_2()); 
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
    // $ANTLR end "rule__Dsl__Group_1_0__2__Impl"


    // $ANTLR start "rule__Dsl__Group_1_1__0"
    // InternalDsl.g:602:1: rule__Dsl__Group_1_1__0 : rule__Dsl__Group_1_1__0__Impl rule__Dsl__Group_1_1__1 ;
    public final void rule__Dsl__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:606:1: ( rule__Dsl__Group_1_1__0__Impl rule__Dsl__Group_1_1__1 )
            // InternalDsl.g:607:2: rule__Dsl__Group_1_1__0__Impl rule__Dsl__Group_1_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Dsl__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Dsl__Group_1_1__1();

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
    // $ANTLR end "rule__Dsl__Group_1_1__0"


    // $ANTLR start "rule__Dsl__Group_1_1__0__Impl"
    // InternalDsl.g:614:1: rule__Dsl__Group_1_1__0__Impl : ( ( '\\r' )? ) ;
    public final void rule__Dsl__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:618:1: ( ( ( '\\r' )? ) )
            // InternalDsl.g:619:1: ( ( '\\r' )? )
            {
            // InternalDsl.g:619:1: ( ( '\\r' )? )
            // InternalDsl.g:620:2: ( '\\r' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getCarriageReturnKeyword_1_1_0()); 
            }
            // InternalDsl.g:621:2: ( '\\r' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==8) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:621:3: '\\r'
                    {
                    match(input,8,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getCarriageReturnKeyword_1_1_0()); 
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
    // $ANTLR end "rule__Dsl__Group_1_1__0__Impl"


    // $ANTLR start "rule__Dsl__Group_1_1__1"
    // InternalDsl.g:629:1: rule__Dsl__Group_1_1__1 : rule__Dsl__Group_1_1__1__Impl ;
    public final void rule__Dsl__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:633:1: ( rule__Dsl__Group_1_1__1__Impl )
            // InternalDsl.g:634:2: rule__Dsl__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dsl__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__Dsl__Group_1_1__1"


    // $ANTLR start "rule__Dsl__Group_1_1__1__Impl"
    // InternalDsl.g:640:1: rule__Dsl__Group_1_1__1__Impl : ( '\\n' ) ;
    public final void rule__Dsl__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:644:1: ( ( '\\n' ) )
            // InternalDsl.g:645:1: ( '\\n' )
            {
            // InternalDsl.g:645:1: ( '\\n' )
            // InternalDsl.g:646:2: '\\n'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getLineFeedKeyword_1_1_1()); 
            }
            match(input,9,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getLineFeedKeyword_1_1_1()); 
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
    // $ANTLR end "rule__Dsl__Group_1_1__1__Impl"


    // $ANTLR start "rule__Dsl__Group_2__0"
    // InternalDsl.g:656:1: rule__Dsl__Group_2__0 : rule__Dsl__Group_2__0__Impl rule__Dsl__Group_2__1 ;
    public final void rule__Dsl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:660:1: ( rule__Dsl__Group_2__0__Impl rule__Dsl__Group_2__1 )
            // InternalDsl.g:661:2: rule__Dsl__Group_2__0__Impl rule__Dsl__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__Dsl__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Dsl__Group_2__1();

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
    // $ANTLR end "rule__Dsl__Group_2__0"


    // $ANTLR start "rule__Dsl__Group_2__0__Impl"
    // InternalDsl.g:668:1: rule__Dsl__Group_2__0__Impl : ( RULE_SL_COMMENT ) ;
    public final void rule__Dsl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:672:1: ( ( RULE_SL_COMMENT ) )
            // InternalDsl.g:673:1: ( RULE_SL_COMMENT )
            {
            // InternalDsl.g:673:1: ( RULE_SL_COMMENT )
            // InternalDsl.g:674:2: RULE_SL_COMMENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getSL_COMMENTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_SL_COMMENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getSL_COMMENTTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Dsl__Group_2__0__Impl"


    // $ANTLR start "rule__Dsl__Group_2__1"
    // InternalDsl.g:683:1: rule__Dsl__Group_2__1 : rule__Dsl__Group_2__1__Impl ;
    public final void rule__Dsl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:687:1: ( rule__Dsl__Group_2__1__Impl )
            // InternalDsl.g:688:2: rule__Dsl__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dsl__Group_2__1__Impl();

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
    // $ANTLR end "rule__Dsl__Group_2__1"


    // $ANTLR start "rule__Dsl__Group_2__1__Impl"
    // InternalDsl.g:694:1: rule__Dsl__Group_2__1__Impl : ( ( ( rule__Dsl__Group_2_1__0 ) ) ( ( rule__Dsl__Group_2_1__0 )* ) ) ;
    public final void rule__Dsl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:698:1: ( ( ( ( rule__Dsl__Group_2_1__0 ) ) ( ( rule__Dsl__Group_2_1__0 )* ) ) )
            // InternalDsl.g:699:1: ( ( ( rule__Dsl__Group_2_1__0 ) ) ( ( rule__Dsl__Group_2_1__0 )* ) )
            {
            // InternalDsl.g:699:1: ( ( ( rule__Dsl__Group_2_1__0 ) ) ( ( rule__Dsl__Group_2_1__0 )* ) )
            // InternalDsl.g:700:2: ( ( rule__Dsl__Group_2_1__0 ) ) ( ( rule__Dsl__Group_2_1__0 )* )
            {
            // InternalDsl.g:700:2: ( ( rule__Dsl__Group_2_1__0 ) )
            // InternalDsl.g:701:3: ( rule__Dsl__Group_2_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getGroup_2_1()); 
            }
            // InternalDsl.g:702:3: ( rule__Dsl__Group_2_1__0 )
            // InternalDsl.g:702:4: rule__Dsl__Group_2_1__0
            {
            pushFollow(FOLLOW_8);
            rule__Dsl__Group_2_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getGroup_2_1()); 
            }

            }

            // InternalDsl.g:705:2: ( ( rule__Dsl__Group_2_1__0 )* )
            // InternalDsl.g:706:3: ( rule__Dsl__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getGroup_2_1()); 
            }
            // InternalDsl.g:707:3: ( rule__Dsl__Group_2_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=8 && LA16_0<=9)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDsl.g:707:4: rule__Dsl__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Dsl__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getGroup_2_1()); 
            }

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
    // $ANTLR end "rule__Dsl__Group_2__1__Impl"


    // $ANTLR start "rule__Dsl__Group_2_1__0"
    // InternalDsl.g:717:1: rule__Dsl__Group_2_1__0 : rule__Dsl__Group_2_1__0__Impl rule__Dsl__Group_2_1__1 ;
    public final void rule__Dsl__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:721:1: ( rule__Dsl__Group_2_1__0__Impl rule__Dsl__Group_2_1__1 )
            // InternalDsl.g:722:2: rule__Dsl__Group_2_1__0__Impl rule__Dsl__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Dsl__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Dsl__Group_2_1__1();

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
    // $ANTLR end "rule__Dsl__Group_2_1__0"


    // $ANTLR start "rule__Dsl__Group_2_1__0__Impl"
    // InternalDsl.g:729:1: rule__Dsl__Group_2_1__0__Impl : ( ( '\\r' )? ) ;
    public final void rule__Dsl__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:733:1: ( ( ( '\\r' )? ) )
            // InternalDsl.g:734:1: ( ( '\\r' )? )
            {
            // InternalDsl.g:734:1: ( ( '\\r' )? )
            // InternalDsl.g:735:2: ( '\\r' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getCarriageReturnKeyword_2_1_0()); 
            }
            // InternalDsl.g:736:2: ( '\\r' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==8) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:736:3: '\\r'
                    {
                    match(input,8,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getCarriageReturnKeyword_2_1_0()); 
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
    // $ANTLR end "rule__Dsl__Group_2_1__0__Impl"


    // $ANTLR start "rule__Dsl__Group_2_1__1"
    // InternalDsl.g:744:1: rule__Dsl__Group_2_1__1 : rule__Dsl__Group_2_1__1__Impl ;
    public final void rule__Dsl__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:748:1: ( rule__Dsl__Group_2_1__1__Impl )
            // InternalDsl.g:749:2: rule__Dsl__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dsl__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__Dsl__Group_2_1__1"


    // $ANTLR start "rule__Dsl__Group_2_1__1__Impl"
    // InternalDsl.g:755:1: rule__Dsl__Group_2_1__1__Impl : ( '\\n' ) ;
    public final void rule__Dsl__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:759:1: ( ( '\\n' ) )
            // InternalDsl.g:760:1: ( '\\n' )
            {
            // InternalDsl.g:760:1: ( '\\n' )
            // InternalDsl.g:761:2: '\\n'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getLineFeedKeyword_2_1_1()); 
            }
            match(input,9,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getLineFeedKeyword_2_1_1()); 
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
    // $ANTLR end "rule__Dsl__Group_2_1__1__Impl"


    // $ANTLR start "rule__Dsl__Group_5__0"
    // InternalDsl.g:771:1: rule__Dsl__Group_5__0 : rule__Dsl__Group_5__0__Impl rule__Dsl__Group_5__1 ;
    public final void rule__Dsl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:775:1: ( rule__Dsl__Group_5__0__Impl rule__Dsl__Group_5__1 )
            // InternalDsl.g:776:2: rule__Dsl__Group_5__0__Impl rule__Dsl__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Dsl__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Dsl__Group_5__1();

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
    // $ANTLR end "rule__Dsl__Group_5__0"


    // $ANTLR start "rule__Dsl__Group_5__0__Impl"
    // InternalDsl.g:783:1: rule__Dsl__Group_5__0__Impl : ( ( ( rule__Dsl__Group_5_0__0 ) ) ( ( rule__Dsl__Group_5_0__0 )* ) ) ;
    public final void rule__Dsl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:787:1: ( ( ( ( rule__Dsl__Group_5_0__0 ) ) ( ( rule__Dsl__Group_5_0__0 )* ) ) )
            // InternalDsl.g:788:1: ( ( ( rule__Dsl__Group_5_0__0 ) ) ( ( rule__Dsl__Group_5_0__0 )* ) )
            {
            // InternalDsl.g:788:1: ( ( ( rule__Dsl__Group_5_0__0 ) ) ( ( rule__Dsl__Group_5_0__0 )* ) )
            // InternalDsl.g:789:2: ( ( rule__Dsl__Group_5_0__0 ) ) ( ( rule__Dsl__Group_5_0__0 )* )
            {
            // InternalDsl.g:789:2: ( ( rule__Dsl__Group_5_0__0 ) )
            // InternalDsl.g:790:3: ( rule__Dsl__Group_5_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getGroup_5_0()); 
            }
            // InternalDsl.g:791:3: ( rule__Dsl__Group_5_0__0 )
            // InternalDsl.g:791:4: rule__Dsl__Group_5_0__0
            {
            pushFollow(FOLLOW_8);
            rule__Dsl__Group_5_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getGroup_5_0()); 
            }

            }

            // InternalDsl.g:794:2: ( ( rule__Dsl__Group_5_0__0 )* )
            // InternalDsl.g:795:3: ( rule__Dsl__Group_5_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getGroup_5_0()); 
            }
            // InternalDsl.g:796:3: ( rule__Dsl__Group_5_0__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=8 && LA18_0<=9)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDsl.g:796:4: rule__Dsl__Group_5_0__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Dsl__Group_5_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getGroup_5_0()); 
            }

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
    // $ANTLR end "rule__Dsl__Group_5__0__Impl"


    // $ANTLR start "rule__Dsl__Group_5__1"
    // InternalDsl.g:805:1: rule__Dsl__Group_5__1 : rule__Dsl__Group_5__1__Impl rule__Dsl__Group_5__2 ;
    public final void rule__Dsl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:809:1: ( rule__Dsl__Group_5__1__Impl rule__Dsl__Group_5__2 )
            // InternalDsl.g:810:2: rule__Dsl__Group_5__1__Impl rule__Dsl__Group_5__2
            {
            pushFollow(FOLLOW_3);
            rule__Dsl__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Dsl__Group_5__2();

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
    // $ANTLR end "rule__Dsl__Group_5__1"


    // $ANTLR start "rule__Dsl__Group_5__1__Impl"
    // InternalDsl.g:817:1: rule__Dsl__Group_5__1__Impl : ( ( rule__Dsl__Group_5_1__0 )* ) ;
    public final void rule__Dsl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:821:1: ( ( ( rule__Dsl__Group_5_1__0 )* ) )
            // InternalDsl.g:822:1: ( ( rule__Dsl__Group_5_1__0 )* )
            {
            // InternalDsl.g:822:1: ( ( rule__Dsl__Group_5_1__0 )* )
            // InternalDsl.g:823:2: ( rule__Dsl__Group_5_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getGroup_5_1()); 
            }
            // InternalDsl.g:824:2: ( rule__Dsl__Group_5_1__0 )*
            loop19:
            do {
                int alt19=2;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // InternalDsl.g:824:3: rule__Dsl__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Dsl__Group_5_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getGroup_5_1()); 
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
    // $ANTLR end "rule__Dsl__Group_5__1__Impl"


    // $ANTLR start "rule__Dsl__Group_5__2"
    // InternalDsl.g:832:1: rule__Dsl__Group_5__2 : rule__Dsl__Group_5__2__Impl rule__Dsl__Group_5__3 ;
    public final void rule__Dsl__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:836:1: ( rule__Dsl__Group_5__2__Impl rule__Dsl__Group_5__3 )
            // InternalDsl.g:837:2: rule__Dsl__Group_5__2__Impl rule__Dsl__Group_5__3
            {
            pushFollow(FOLLOW_3);
            rule__Dsl__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Dsl__Group_5__3();

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
    // $ANTLR end "rule__Dsl__Group_5__2"


    // $ANTLR start "rule__Dsl__Group_5__2__Impl"
    // InternalDsl.g:844:1: rule__Dsl__Group_5__2__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__Dsl__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:848:1: ( ( ( RULE_SPACE )* ) )
            // InternalDsl.g:849:1: ( ( RULE_SPACE )* )
            {
            // InternalDsl.g:849:1: ( ( RULE_SPACE )* )
            // InternalDsl.g:850:2: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getSPACETerminalRuleCall_5_2()); 
            }
            // InternalDsl.g:851:2: ( RULE_SPACE )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_SPACE) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDsl.g:851:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_6); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getSPACETerminalRuleCall_5_2()); 
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
    // $ANTLR end "rule__Dsl__Group_5__2__Impl"


    // $ANTLR start "rule__Dsl__Group_5__3"
    // InternalDsl.g:859:1: rule__Dsl__Group_5__3 : rule__Dsl__Group_5__3__Impl ;
    public final void rule__Dsl__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:863:1: ( rule__Dsl__Group_5__3__Impl )
            // InternalDsl.g:864:2: rule__Dsl__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dsl__Group_5__3__Impl();

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
    // $ANTLR end "rule__Dsl__Group_5__3"


    // $ANTLR start "rule__Dsl__Group_5__3__Impl"
    // InternalDsl.g:870:1: rule__Dsl__Group_5__3__Impl : ( ( rule__Dsl__EntriesAssignment_5_3 ) ) ;
    public final void rule__Dsl__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:874:1: ( ( ( rule__Dsl__EntriesAssignment_5_3 ) ) )
            // InternalDsl.g:875:1: ( ( rule__Dsl__EntriesAssignment_5_3 ) )
            {
            // InternalDsl.g:875:1: ( ( rule__Dsl__EntriesAssignment_5_3 ) )
            // InternalDsl.g:876:2: ( rule__Dsl__EntriesAssignment_5_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getEntriesAssignment_5_3()); 
            }
            // InternalDsl.g:877:2: ( rule__Dsl__EntriesAssignment_5_3 )
            // InternalDsl.g:877:3: rule__Dsl__EntriesAssignment_5_3
            {
            pushFollow(FOLLOW_2);
            rule__Dsl__EntriesAssignment_5_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getEntriesAssignment_5_3()); 
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
    // $ANTLR end "rule__Dsl__Group_5__3__Impl"


    // $ANTLR start "rule__Dsl__Group_5_0__0"
    // InternalDsl.g:886:1: rule__Dsl__Group_5_0__0 : rule__Dsl__Group_5_0__0__Impl rule__Dsl__Group_5_0__1 ;
    public final void rule__Dsl__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:890:1: ( rule__Dsl__Group_5_0__0__Impl rule__Dsl__Group_5_0__1 )
            // InternalDsl.g:891:2: rule__Dsl__Group_5_0__0__Impl rule__Dsl__Group_5_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Dsl__Group_5_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Dsl__Group_5_0__1();

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
    // $ANTLR end "rule__Dsl__Group_5_0__0"


    // $ANTLR start "rule__Dsl__Group_5_0__0__Impl"
    // InternalDsl.g:898:1: rule__Dsl__Group_5_0__0__Impl : ( ( '\\r' )? ) ;
    public final void rule__Dsl__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:902:1: ( ( ( '\\r' )? ) )
            // InternalDsl.g:903:1: ( ( '\\r' )? )
            {
            // InternalDsl.g:903:1: ( ( '\\r' )? )
            // InternalDsl.g:904:2: ( '\\r' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getCarriageReturnKeyword_5_0_0()); 
            }
            // InternalDsl.g:905:2: ( '\\r' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==8) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDsl.g:905:3: '\\r'
                    {
                    match(input,8,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getCarriageReturnKeyword_5_0_0()); 
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
    // $ANTLR end "rule__Dsl__Group_5_0__0__Impl"


    // $ANTLR start "rule__Dsl__Group_5_0__1"
    // InternalDsl.g:913:1: rule__Dsl__Group_5_0__1 : rule__Dsl__Group_5_0__1__Impl ;
    public final void rule__Dsl__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:917:1: ( rule__Dsl__Group_5_0__1__Impl )
            // InternalDsl.g:918:2: rule__Dsl__Group_5_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dsl__Group_5_0__1__Impl();

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
    // $ANTLR end "rule__Dsl__Group_5_0__1"


    // $ANTLR start "rule__Dsl__Group_5_0__1__Impl"
    // InternalDsl.g:924:1: rule__Dsl__Group_5_0__1__Impl : ( '\\n' ) ;
    public final void rule__Dsl__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:928:1: ( ( '\\n' ) )
            // InternalDsl.g:929:1: ( '\\n' )
            {
            // InternalDsl.g:929:1: ( '\\n' )
            // InternalDsl.g:930:2: '\\n'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getLineFeedKeyword_5_0_1()); 
            }
            match(input,9,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getLineFeedKeyword_5_0_1()); 
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
    // $ANTLR end "rule__Dsl__Group_5_0__1__Impl"


    // $ANTLR start "rule__Dsl__Group_5_1__0"
    // InternalDsl.g:940:1: rule__Dsl__Group_5_1__0 : rule__Dsl__Group_5_1__0__Impl rule__Dsl__Group_5_1__1 ;
    public final void rule__Dsl__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:944:1: ( rule__Dsl__Group_5_1__0__Impl rule__Dsl__Group_5_1__1 )
            // InternalDsl.g:945:2: rule__Dsl__Group_5_1__0__Impl rule__Dsl__Group_5_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Dsl__Group_5_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Dsl__Group_5_1__1();

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
    // $ANTLR end "rule__Dsl__Group_5_1__0"


    // $ANTLR start "rule__Dsl__Group_5_1__0__Impl"
    // InternalDsl.g:952:1: rule__Dsl__Group_5_1__0__Impl : ( ( ( RULE_SPACE ) ) ( ( RULE_SPACE )* ) ) ;
    public final void rule__Dsl__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:956:1: ( ( ( ( RULE_SPACE ) ) ( ( RULE_SPACE )* ) ) )
            // InternalDsl.g:957:1: ( ( ( RULE_SPACE ) ) ( ( RULE_SPACE )* ) )
            {
            // InternalDsl.g:957:1: ( ( ( RULE_SPACE ) ) ( ( RULE_SPACE )* ) )
            // InternalDsl.g:958:2: ( ( RULE_SPACE ) ) ( ( RULE_SPACE )* )
            {
            // InternalDsl.g:958:2: ( ( RULE_SPACE ) )
            // InternalDsl.g:959:3: ( RULE_SPACE )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getSPACETerminalRuleCall_5_1_0()); 
            }
            // InternalDsl.g:960:3: ( RULE_SPACE )
            // InternalDsl.g:960:4: RULE_SPACE
            {
            match(input,RULE_SPACE,FOLLOW_6); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getSPACETerminalRuleCall_5_1_0()); 
            }

            }

            // InternalDsl.g:963:2: ( ( RULE_SPACE )* )
            // InternalDsl.g:964:3: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getSPACETerminalRuleCall_5_1_0()); 
            }
            // InternalDsl.g:965:3: ( RULE_SPACE )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_SPACE) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDsl.g:965:4: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_6); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getSPACETerminalRuleCall_5_1_0()); 
            }

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
    // $ANTLR end "rule__Dsl__Group_5_1__0__Impl"


    // $ANTLR start "rule__Dsl__Group_5_1__1"
    // InternalDsl.g:974:1: rule__Dsl__Group_5_1__1 : rule__Dsl__Group_5_1__1__Impl rule__Dsl__Group_5_1__2 ;
    public final void rule__Dsl__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:978:1: ( rule__Dsl__Group_5_1__1__Impl rule__Dsl__Group_5_1__2 )
            // InternalDsl.g:979:2: rule__Dsl__Group_5_1__1__Impl rule__Dsl__Group_5_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Dsl__Group_5_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Dsl__Group_5_1__2();

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
    // $ANTLR end "rule__Dsl__Group_5_1__1"


    // $ANTLR start "rule__Dsl__Group_5_1__1__Impl"
    // InternalDsl.g:986:1: rule__Dsl__Group_5_1__1__Impl : ( ( '\\r' )? ) ;
    public final void rule__Dsl__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:990:1: ( ( ( '\\r' )? ) )
            // InternalDsl.g:991:1: ( ( '\\r' )? )
            {
            // InternalDsl.g:991:1: ( ( '\\r' )? )
            // InternalDsl.g:992:2: ( '\\r' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getCarriageReturnKeyword_5_1_1()); 
            }
            // InternalDsl.g:993:2: ( '\\r' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==8) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDsl.g:993:3: '\\r'
                    {
                    match(input,8,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getCarriageReturnKeyword_5_1_1()); 
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
    // $ANTLR end "rule__Dsl__Group_5_1__1__Impl"


    // $ANTLR start "rule__Dsl__Group_5_1__2"
    // InternalDsl.g:1001:1: rule__Dsl__Group_5_1__2 : rule__Dsl__Group_5_1__2__Impl ;
    public final void rule__Dsl__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1005:1: ( rule__Dsl__Group_5_1__2__Impl )
            // InternalDsl.g:1006:2: rule__Dsl__Group_5_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dsl__Group_5_1__2__Impl();

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
    // $ANTLR end "rule__Dsl__Group_5_1__2"


    // $ANTLR start "rule__Dsl__Group_5_1__2__Impl"
    // InternalDsl.g:1012:1: rule__Dsl__Group_5_1__2__Impl : ( '\\n' ) ;
    public final void rule__Dsl__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1016:1: ( ( '\\n' ) )
            // InternalDsl.g:1017:1: ( '\\n' )
            {
            // InternalDsl.g:1017:1: ( '\\n' )
            // InternalDsl.g:1018:2: '\\n'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getLineFeedKeyword_5_1_2()); 
            }
            match(input,9,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getLineFeedKeyword_5_1_2()); 
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
    // $ANTLR end "rule__Dsl__Group_5_1__2__Impl"


    // $ANTLR start "rule__Dsl__Group_6__0"
    // InternalDsl.g:1028:1: rule__Dsl__Group_6__0 : rule__Dsl__Group_6__0__Impl rule__Dsl__Group_6__1 ;
    public final void rule__Dsl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1032:1: ( rule__Dsl__Group_6__0__Impl rule__Dsl__Group_6__1 )
            // InternalDsl.g:1033:2: rule__Dsl__Group_6__0__Impl rule__Dsl__Group_6__1
            {
            pushFollow(FOLLOW_7);
            rule__Dsl__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Dsl__Group_6__1();

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
    // $ANTLR end "rule__Dsl__Group_6__0"


    // $ANTLR start "rule__Dsl__Group_6__0__Impl"
    // InternalDsl.g:1040:1: rule__Dsl__Group_6__0__Impl : ( ( '\\r' )? ) ;
    public final void rule__Dsl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1044:1: ( ( ( '\\r' )? ) )
            // InternalDsl.g:1045:1: ( ( '\\r' )? )
            {
            // InternalDsl.g:1045:1: ( ( '\\r' )? )
            // InternalDsl.g:1046:2: ( '\\r' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getCarriageReturnKeyword_6_0()); 
            }
            // InternalDsl.g:1047:2: ( '\\r' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==8) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:1047:3: '\\r'
                    {
                    match(input,8,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getCarriageReturnKeyword_6_0()); 
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
    // $ANTLR end "rule__Dsl__Group_6__0__Impl"


    // $ANTLR start "rule__Dsl__Group_6__1"
    // InternalDsl.g:1055:1: rule__Dsl__Group_6__1 : rule__Dsl__Group_6__1__Impl rule__Dsl__Group_6__2 ;
    public final void rule__Dsl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1059:1: ( rule__Dsl__Group_6__1__Impl rule__Dsl__Group_6__2 )
            // InternalDsl.g:1060:2: rule__Dsl__Group_6__1__Impl rule__Dsl__Group_6__2
            {
            pushFollow(FOLLOW_9);
            rule__Dsl__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Dsl__Group_6__2();

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
    // $ANTLR end "rule__Dsl__Group_6__1"


    // $ANTLR start "rule__Dsl__Group_6__1__Impl"
    // InternalDsl.g:1067:1: rule__Dsl__Group_6__1__Impl : ( '\\n' ) ;
    public final void rule__Dsl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1071:1: ( ( '\\n' ) )
            // InternalDsl.g:1072:1: ( '\\n' )
            {
            // InternalDsl.g:1072:1: ( '\\n' )
            // InternalDsl.g:1073:2: '\\n'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getLineFeedKeyword_6_1()); 
            }
            match(input,9,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getLineFeedKeyword_6_1()); 
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
    // $ANTLR end "rule__Dsl__Group_6__1__Impl"


    // $ANTLR start "rule__Dsl__Group_6__2"
    // InternalDsl.g:1082:1: rule__Dsl__Group_6__2 : rule__Dsl__Group_6__2__Impl ;
    public final void rule__Dsl__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1086:1: ( rule__Dsl__Group_6__2__Impl )
            // InternalDsl.g:1087:2: rule__Dsl__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dsl__Group_6__2__Impl();

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
    // $ANTLR end "rule__Dsl__Group_6__2"


    // $ANTLR start "rule__Dsl__Group_6__2__Impl"
    // InternalDsl.g:1093:1: rule__Dsl__Group_6__2__Impl : ( ( rule__Dsl__Alternatives_6_2 )* ) ;
    public final void rule__Dsl__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1097:1: ( ( ( rule__Dsl__Alternatives_6_2 )* ) )
            // InternalDsl.g:1098:1: ( ( rule__Dsl__Alternatives_6_2 )* )
            {
            // InternalDsl.g:1098:1: ( ( rule__Dsl__Alternatives_6_2 )* )
            // InternalDsl.g:1099:2: ( rule__Dsl__Alternatives_6_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getAlternatives_6_2()); 
            }
            // InternalDsl.g:1100:2: ( rule__Dsl__Alternatives_6_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_SPACE||(LA25_0>=8 && LA25_0<=9)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalDsl.g:1100:3: rule__Dsl__Alternatives_6_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Dsl__Alternatives_6_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getAlternatives_6_2()); 
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
    // $ANTLR end "rule__Dsl__Group_6__2__Impl"


    // $ANTLR start "rule__Dsl__Group_6_2_0__0"
    // InternalDsl.g:1109:1: rule__Dsl__Group_6_2_0__0 : rule__Dsl__Group_6_2_0__0__Impl rule__Dsl__Group_6_2_0__1 ;
    public final void rule__Dsl__Group_6_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1113:1: ( rule__Dsl__Group_6_2_0__0__Impl rule__Dsl__Group_6_2_0__1 )
            // InternalDsl.g:1114:2: rule__Dsl__Group_6_2_0__0__Impl rule__Dsl__Group_6_2_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Dsl__Group_6_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Dsl__Group_6_2_0__1();

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
    // $ANTLR end "rule__Dsl__Group_6_2_0__0"


    // $ANTLR start "rule__Dsl__Group_6_2_0__0__Impl"
    // InternalDsl.g:1121:1: rule__Dsl__Group_6_2_0__0__Impl : ( ( ( RULE_SPACE ) ) ( ( RULE_SPACE )* ) ) ;
    public final void rule__Dsl__Group_6_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1125:1: ( ( ( ( RULE_SPACE ) ) ( ( RULE_SPACE )* ) ) )
            // InternalDsl.g:1126:1: ( ( ( RULE_SPACE ) ) ( ( RULE_SPACE )* ) )
            {
            // InternalDsl.g:1126:1: ( ( ( RULE_SPACE ) ) ( ( RULE_SPACE )* ) )
            // InternalDsl.g:1127:2: ( ( RULE_SPACE ) ) ( ( RULE_SPACE )* )
            {
            // InternalDsl.g:1127:2: ( ( RULE_SPACE ) )
            // InternalDsl.g:1128:3: ( RULE_SPACE )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getSPACETerminalRuleCall_6_2_0_0()); 
            }
            // InternalDsl.g:1129:3: ( RULE_SPACE )
            // InternalDsl.g:1129:4: RULE_SPACE
            {
            match(input,RULE_SPACE,FOLLOW_6); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getSPACETerminalRuleCall_6_2_0_0()); 
            }

            }

            // InternalDsl.g:1132:2: ( ( RULE_SPACE )* )
            // InternalDsl.g:1133:3: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getSPACETerminalRuleCall_6_2_0_0()); 
            }
            // InternalDsl.g:1134:3: ( RULE_SPACE )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_SPACE) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalDsl.g:1134:4: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_6); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getSPACETerminalRuleCall_6_2_0_0()); 
            }

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
    // $ANTLR end "rule__Dsl__Group_6_2_0__0__Impl"


    // $ANTLR start "rule__Dsl__Group_6_2_0__1"
    // InternalDsl.g:1143:1: rule__Dsl__Group_6_2_0__1 : rule__Dsl__Group_6_2_0__1__Impl rule__Dsl__Group_6_2_0__2 ;
    public final void rule__Dsl__Group_6_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1147:1: ( rule__Dsl__Group_6_2_0__1__Impl rule__Dsl__Group_6_2_0__2 )
            // InternalDsl.g:1148:2: rule__Dsl__Group_6_2_0__1__Impl rule__Dsl__Group_6_2_0__2
            {
            pushFollow(FOLLOW_7);
            rule__Dsl__Group_6_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Dsl__Group_6_2_0__2();

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
    // $ANTLR end "rule__Dsl__Group_6_2_0__1"


    // $ANTLR start "rule__Dsl__Group_6_2_0__1__Impl"
    // InternalDsl.g:1155:1: rule__Dsl__Group_6_2_0__1__Impl : ( ( '\\r' )? ) ;
    public final void rule__Dsl__Group_6_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1159:1: ( ( ( '\\r' )? ) )
            // InternalDsl.g:1160:1: ( ( '\\r' )? )
            {
            // InternalDsl.g:1160:1: ( ( '\\r' )? )
            // InternalDsl.g:1161:2: ( '\\r' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getCarriageReturnKeyword_6_2_0_1()); 
            }
            // InternalDsl.g:1162:2: ( '\\r' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==8) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDsl.g:1162:3: '\\r'
                    {
                    match(input,8,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getCarriageReturnKeyword_6_2_0_1()); 
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
    // $ANTLR end "rule__Dsl__Group_6_2_0__1__Impl"


    // $ANTLR start "rule__Dsl__Group_6_2_0__2"
    // InternalDsl.g:1170:1: rule__Dsl__Group_6_2_0__2 : rule__Dsl__Group_6_2_0__2__Impl ;
    public final void rule__Dsl__Group_6_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1174:1: ( rule__Dsl__Group_6_2_0__2__Impl )
            // InternalDsl.g:1175:2: rule__Dsl__Group_6_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dsl__Group_6_2_0__2__Impl();

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
    // $ANTLR end "rule__Dsl__Group_6_2_0__2"


    // $ANTLR start "rule__Dsl__Group_6_2_0__2__Impl"
    // InternalDsl.g:1181:1: rule__Dsl__Group_6_2_0__2__Impl : ( '\\n' ) ;
    public final void rule__Dsl__Group_6_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1185:1: ( ( '\\n' ) )
            // InternalDsl.g:1186:1: ( '\\n' )
            {
            // InternalDsl.g:1186:1: ( '\\n' )
            // InternalDsl.g:1187:2: '\\n'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getLineFeedKeyword_6_2_0_2()); 
            }
            match(input,9,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getLineFeedKeyword_6_2_0_2()); 
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
    // $ANTLR end "rule__Dsl__Group_6_2_0__2__Impl"


    // $ANTLR start "rule__Dsl__Group_6_2_1__0"
    // InternalDsl.g:1197:1: rule__Dsl__Group_6_2_1__0 : rule__Dsl__Group_6_2_1__0__Impl rule__Dsl__Group_6_2_1__1 ;
    public final void rule__Dsl__Group_6_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1201:1: ( rule__Dsl__Group_6_2_1__0__Impl rule__Dsl__Group_6_2_1__1 )
            // InternalDsl.g:1202:2: rule__Dsl__Group_6_2_1__0__Impl rule__Dsl__Group_6_2_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Dsl__Group_6_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Dsl__Group_6_2_1__1();

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
    // $ANTLR end "rule__Dsl__Group_6_2_1__0"


    // $ANTLR start "rule__Dsl__Group_6_2_1__0__Impl"
    // InternalDsl.g:1209:1: rule__Dsl__Group_6_2_1__0__Impl : ( ( '\\r' )? ) ;
    public final void rule__Dsl__Group_6_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1213:1: ( ( ( '\\r' )? ) )
            // InternalDsl.g:1214:1: ( ( '\\r' )? )
            {
            // InternalDsl.g:1214:1: ( ( '\\r' )? )
            // InternalDsl.g:1215:2: ( '\\r' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getCarriageReturnKeyword_6_2_1_0()); 
            }
            // InternalDsl.g:1216:2: ( '\\r' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==8) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDsl.g:1216:3: '\\r'
                    {
                    match(input,8,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getCarriageReturnKeyword_6_2_1_0()); 
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
    // $ANTLR end "rule__Dsl__Group_6_2_1__0__Impl"


    // $ANTLR start "rule__Dsl__Group_6_2_1__1"
    // InternalDsl.g:1224:1: rule__Dsl__Group_6_2_1__1 : rule__Dsl__Group_6_2_1__1__Impl ;
    public final void rule__Dsl__Group_6_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1228:1: ( rule__Dsl__Group_6_2_1__1__Impl )
            // InternalDsl.g:1229:2: rule__Dsl__Group_6_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dsl__Group_6_2_1__1__Impl();

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
    // $ANTLR end "rule__Dsl__Group_6_2_1__1"


    // $ANTLR start "rule__Dsl__Group_6_2_1__1__Impl"
    // InternalDsl.g:1235:1: rule__Dsl__Group_6_2_1__1__Impl : ( '\\n' ) ;
    public final void rule__Dsl__Group_6_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1239:1: ( ( '\\n' ) )
            // InternalDsl.g:1240:1: ( '\\n' )
            {
            // InternalDsl.g:1240:1: ( '\\n' )
            // InternalDsl.g:1241:2: '\\n'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getLineFeedKeyword_6_2_1_1()); 
            }
            match(input,9,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getLineFeedKeyword_6_2_1_1()); 
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
    // $ANTLR end "rule__Dsl__Group_6_2_1__1__Impl"


    // $ANTLR start "rule__Entry__Group__0"
    // InternalDsl.g:1251:1: rule__Entry__Group__0 : rule__Entry__Group__0__Impl rule__Entry__Group__1 ;
    public final void rule__Entry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1255:1: ( rule__Entry__Group__0__Impl rule__Entry__Group__1 )
            // InternalDsl.g:1256:2: rule__Entry__Group__0__Impl rule__Entry__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalDsl.g:1263:1: rule__Entry__Group__0__Impl : ( () ) ;
    public final void rule__Entry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1267:1: ( ( () ) )
            // InternalDsl.g:1268:1: ( () )
            {
            // InternalDsl.g:1268:1: ( () )
            // InternalDsl.g:1269:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryAccess().getEntryAction_0()); 
            }
            // InternalDsl.g:1270:2: ()
            // InternalDsl.g:1270:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryAccess().getEntryAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__0__Impl"


    // $ANTLR start "rule__Entry__Group__1"
    // InternalDsl.g:1278:1: rule__Entry__Group__1 : rule__Entry__Group__1__Impl rule__Entry__Group__2 ;
    public final void rule__Entry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1282:1: ( rule__Entry__Group__1__Impl rule__Entry__Group__2 )
            // InternalDsl.g:1283:2: rule__Entry__Group__1__Impl rule__Entry__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:1290:1: rule__Entry__Group__1__Impl : ( ( rule__Entry__KeyAssignment_1 ) ) ;
    public final void rule__Entry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1294:1: ( ( ( rule__Entry__KeyAssignment_1 ) ) )
            // InternalDsl.g:1295:1: ( ( rule__Entry__KeyAssignment_1 ) )
            {
            // InternalDsl.g:1295:1: ( ( rule__Entry__KeyAssignment_1 ) )
            // InternalDsl.g:1296:2: ( rule__Entry__KeyAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryAccess().getKeyAssignment_1()); 
            }
            // InternalDsl.g:1297:2: ( rule__Entry__KeyAssignment_1 )
            // InternalDsl.g:1297:3: rule__Entry__KeyAssignment_1
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
    // InternalDsl.g:1305:1: rule__Entry__Group__2 : rule__Entry__Group__2__Impl rule__Entry__Group__3 ;
    public final void rule__Entry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1309:1: ( rule__Entry__Group__2__Impl rule__Entry__Group__3 )
            // InternalDsl.g:1310:2: rule__Entry__Group__2__Impl rule__Entry__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:1317:1: rule__Entry__Group__2__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__Entry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1321:1: ( ( ( RULE_SPACE )* ) )
            // InternalDsl.g:1322:1: ( ( RULE_SPACE )* )
            {
            // InternalDsl.g:1322:1: ( ( RULE_SPACE )* )
            // InternalDsl.g:1323:2: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryAccess().getSPACETerminalRuleCall_2()); 
            }
            // InternalDsl.g:1324:2: ( RULE_SPACE )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_SPACE) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalDsl.g:1324:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_6); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalDsl.g:1332:1: rule__Entry__Group__3 : rule__Entry__Group__3__Impl ;
    public final void rule__Entry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1336:1: ( rule__Entry__Group__3__Impl )
            // InternalDsl.g:1337:2: rule__Entry__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entry__Group__3__Impl();

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
    // InternalDsl.g:1343:1: rule__Entry__Group__3__Impl : ( ( rule__Entry__Group_3__0 ) ) ;
    public final void rule__Entry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1347:1: ( ( ( rule__Entry__Group_3__0 ) ) )
            // InternalDsl.g:1348:1: ( ( rule__Entry__Group_3__0 ) )
            {
            // InternalDsl.g:1348:1: ( ( rule__Entry__Group_3__0 ) )
            // InternalDsl.g:1349:2: ( rule__Entry__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryAccess().getGroup_3()); 
            }
            // InternalDsl.g:1350:2: ( rule__Entry__Group_3__0 )
            // InternalDsl.g:1350:3: rule__Entry__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__Entry__Group_3__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryAccess().getGroup_3()); 
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


    // $ANTLR start "rule__Entry__Group_3__0"
    // InternalDsl.g:1359:1: rule__Entry__Group_3__0 : rule__Entry__Group_3__0__Impl rule__Entry__Group_3__1 ;
    public final void rule__Entry__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1363:1: ( rule__Entry__Group_3__0__Impl rule__Entry__Group_3__1 )
            // InternalDsl.g:1364:2: rule__Entry__Group_3__0__Impl rule__Entry__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Entry__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entry__Group_3__1();

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
    // $ANTLR end "rule__Entry__Group_3__0"


    // $ANTLR start "rule__Entry__Group_3__0__Impl"
    // InternalDsl.g:1371:1: rule__Entry__Group_3__0__Impl : ( ( RULE_SEPARATOR ) ) ;
    public final void rule__Entry__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1375:1: ( ( ( RULE_SEPARATOR ) ) )
            // InternalDsl.g:1376:1: ( ( RULE_SEPARATOR ) )
            {
            // InternalDsl.g:1376:1: ( ( RULE_SEPARATOR ) )
            // InternalDsl.g:1377:2: ( RULE_SEPARATOR )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryAccess().getSEPARATORTerminalRuleCall_3_0()); 
            }
            // InternalDsl.g:1378:2: ( RULE_SEPARATOR )
            // InternalDsl.g:1378:3: RULE_SEPARATOR
            {
            match(input,RULE_SEPARATOR,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryAccess().getSEPARATORTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__Entry__Group_3__0__Impl"


    // $ANTLR start "rule__Entry__Group_3__1"
    // InternalDsl.g:1386:1: rule__Entry__Group_3__1 : rule__Entry__Group_3__1__Impl rule__Entry__Group_3__2 ;
    public final void rule__Entry__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1390:1: ( rule__Entry__Group_3__1__Impl rule__Entry__Group_3__2 )
            // InternalDsl.g:1391:2: rule__Entry__Group_3__1__Impl rule__Entry__Group_3__2
            {
            pushFollow(FOLLOW_11);
            rule__Entry__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Entry__Group_3__2();

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
    // $ANTLR end "rule__Entry__Group_3__1"


    // $ANTLR start "rule__Entry__Group_3__1__Impl"
    // InternalDsl.g:1398:1: rule__Entry__Group_3__1__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__Entry__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1402:1: ( ( ( RULE_SPACE )* ) )
            // InternalDsl.g:1403:1: ( ( RULE_SPACE )* )
            {
            // InternalDsl.g:1403:1: ( ( RULE_SPACE )* )
            // InternalDsl.g:1404:2: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryAccess().getSPACETerminalRuleCall_3_1()); 
            }
            // InternalDsl.g:1405:2: ( RULE_SPACE )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_SPACE) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalDsl.g:1405:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_6); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryAccess().getSPACETerminalRuleCall_3_1()); 
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
    // $ANTLR end "rule__Entry__Group_3__1__Impl"


    // $ANTLR start "rule__Entry__Group_3__2"
    // InternalDsl.g:1413:1: rule__Entry__Group_3__2 : rule__Entry__Group_3__2__Impl ;
    public final void rule__Entry__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1417:1: ( rule__Entry__Group_3__2__Impl )
            // InternalDsl.g:1418:2: rule__Entry__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entry__Group_3__2__Impl();

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
    // $ANTLR end "rule__Entry__Group_3__2"


    // $ANTLR start "rule__Entry__Group_3__2__Impl"
    // InternalDsl.g:1424:1: rule__Entry__Group_3__2__Impl : ( ( rule__Entry__ValueAssignment_3_2 ) ) ;
    public final void rule__Entry__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1428:1: ( ( ( rule__Entry__ValueAssignment_3_2 ) ) )
            // InternalDsl.g:1429:1: ( ( rule__Entry__ValueAssignment_3_2 ) )
            {
            // InternalDsl.g:1429:1: ( ( rule__Entry__ValueAssignment_3_2 ) )
            // InternalDsl.g:1430:2: ( rule__Entry__ValueAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryAccess().getValueAssignment_3_2()); 
            }
            // InternalDsl.g:1431:2: ( rule__Entry__ValueAssignment_3_2 )
            // InternalDsl.g:1431:3: rule__Entry__ValueAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Entry__ValueAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryAccess().getValueAssignment_3_2()); 
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
    // $ANTLR end "rule__Entry__Group_3__2__Impl"


    // $ANTLR start "rule__VALUE_WORD__Group__0"
    // InternalDsl.g:1440:1: rule__VALUE_WORD__Group__0 : rule__VALUE_WORD__Group__0__Impl rule__VALUE_WORD__Group__1 ;
    public final void rule__VALUE_WORD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1444:1: ( rule__VALUE_WORD__Group__0__Impl rule__VALUE_WORD__Group__1 )
            // InternalDsl.g:1445:2: rule__VALUE_WORD__Group__0__Impl rule__VALUE_WORD__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalDsl.g:1452:1: rule__VALUE_WORD__Group__0__Impl : ( ( ( rule__VALUE_WORD__Alternatives_0 ) ) ( ( rule__VALUE_WORD__Alternatives_0 )* ) ) ;
    public final void rule__VALUE_WORD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1456:1: ( ( ( ( rule__VALUE_WORD__Alternatives_0 ) ) ( ( rule__VALUE_WORD__Alternatives_0 )* ) ) )
            // InternalDsl.g:1457:1: ( ( ( rule__VALUE_WORD__Alternatives_0 ) ) ( ( rule__VALUE_WORD__Alternatives_0 )* ) )
            {
            // InternalDsl.g:1457:1: ( ( ( rule__VALUE_WORD__Alternatives_0 ) ) ( ( rule__VALUE_WORD__Alternatives_0 )* ) )
            // InternalDsl.g:1458:2: ( ( rule__VALUE_WORD__Alternatives_0 ) ) ( ( rule__VALUE_WORD__Alternatives_0 )* )
            {
            // InternalDsl.g:1458:2: ( ( rule__VALUE_WORD__Alternatives_0 ) )
            // InternalDsl.g:1459:3: ( rule__VALUE_WORD__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVALUE_WORDAccess().getAlternatives_0()); 
            }
            // InternalDsl.g:1460:3: ( rule__VALUE_WORD__Alternatives_0 )
            // InternalDsl.g:1460:4: rule__VALUE_WORD__Alternatives_0
            {
            pushFollow(FOLLOW_13);
            rule__VALUE_WORD__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVALUE_WORDAccess().getAlternatives_0()); 
            }

            }

            // InternalDsl.g:1463:2: ( ( rule__VALUE_WORD__Alternatives_0 )* )
            // InternalDsl.g:1464:3: ( rule__VALUE_WORD__Alternatives_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVALUE_WORDAccess().getAlternatives_0()); 
            }
            // InternalDsl.g:1465:3: ( rule__VALUE_WORD__Alternatives_0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_LETTER && LA31_0<=RULE_SEPARATOR)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalDsl.g:1465:4: rule__VALUE_WORD__Alternatives_0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__VALUE_WORD__Alternatives_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVALUE_WORDAccess().getAlternatives_0()); 
            }

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
    // InternalDsl.g:1474:1: rule__VALUE_WORD__Group__1 : rule__VALUE_WORD__Group__1__Impl ;
    public final void rule__VALUE_WORD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1478:1: ( rule__VALUE_WORD__Group__1__Impl )
            // InternalDsl.g:1479:2: rule__VALUE_WORD__Group__1__Impl
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
    // InternalDsl.g:1485:1: rule__VALUE_WORD__Group__1__Impl : ( ( rule__VALUE_WORD__Group_1__0 )? ) ;
    public final void rule__VALUE_WORD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1489:1: ( ( ( rule__VALUE_WORD__Group_1__0 )? ) )
            // InternalDsl.g:1490:1: ( ( rule__VALUE_WORD__Group_1__0 )? )
            {
            // InternalDsl.g:1490:1: ( ( rule__VALUE_WORD__Group_1__0 )? )
            // InternalDsl.g:1491:2: ( rule__VALUE_WORD__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVALUE_WORDAccess().getGroup_1()); 
            }
            // InternalDsl.g:1492:2: ( rule__VALUE_WORD__Group_1__0 )?
            int alt32=2;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // InternalDsl.g:1492:3: rule__VALUE_WORD__Group_1__0
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
    // InternalDsl.g:1501:1: rule__VALUE_WORD__Group_1__0 : rule__VALUE_WORD__Group_1__0__Impl rule__VALUE_WORD__Group_1__1 ;
    public final void rule__VALUE_WORD__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1505:1: ( rule__VALUE_WORD__Group_1__0__Impl rule__VALUE_WORD__Group_1__1 )
            // InternalDsl.g:1506:2: rule__VALUE_WORD__Group_1__0__Impl rule__VALUE_WORD__Group_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalDsl.g:1513:1: rule__VALUE_WORD__Group_1__0__Impl : ( RULE_SPACE ) ;
    public final void rule__VALUE_WORD__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1517:1: ( ( RULE_SPACE ) )
            // InternalDsl.g:1518:1: ( RULE_SPACE )
            {
            // InternalDsl.g:1518:1: ( RULE_SPACE )
            // InternalDsl.g:1519:2: RULE_SPACE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVALUE_WORDAccess().getSPACETerminalRuleCall_1_0()); 
            }
            match(input,RULE_SPACE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVALUE_WORDAccess().getSPACETerminalRuleCall_1_0()); 
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
    // InternalDsl.g:1528:1: rule__VALUE_WORD__Group_1__1 : rule__VALUE_WORD__Group_1__1__Impl rule__VALUE_WORD__Group_1__2 ;
    public final void rule__VALUE_WORD__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1532:1: ( rule__VALUE_WORD__Group_1__1__Impl rule__VALUE_WORD__Group_1__2 )
            // InternalDsl.g:1533:2: rule__VALUE_WORD__Group_1__1__Impl rule__VALUE_WORD__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__VALUE_WORD__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VALUE_WORD__Group_1__2();

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
    // InternalDsl.g:1540:1: rule__VALUE_WORD__Group_1__1__Impl : ( ( rule__VALUE_WORD__Alternatives_1_1 )* ) ;
    public final void rule__VALUE_WORD__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1544:1: ( ( ( rule__VALUE_WORD__Alternatives_1_1 )* ) )
            // InternalDsl.g:1545:1: ( ( rule__VALUE_WORD__Alternatives_1_1 )* )
            {
            // InternalDsl.g:1545:1: ( ( rule__VALUE_WORD__Alternatives_1_1 )* )
            // InternalDsl.g:1546:2: ( rule__VALUE_WORD__Alternatives_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVALUE_WORDAccess().getAlternatives_1_1()); 
            }
            // InternalDsl.g:1547:2: ( rule__VALUE_WORD__Alternatives_1_1 )*
            loop33:
            do {
                int alt33=2;
                alt33 = dfa33.predict(input);
                switch (alt33) {
            	case 1 :
            	    // InternalDsl.g:1547:3: rule__VALUE_WORD__Alternatives_1_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__VALUE_WORD__Alternatives_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVALUE_WORDAccess().getAlternatives_1_1()); 
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


    // $ANTLR start "rule__VALUE_WORD__Group_1__2"
    // InternalDsl.g:1555:1: rule__VALUE_WORD__Group_1__2 : rule__VALUE_WORD__Group_1__2__Impl ;
    public final void rule__VALUE_WORD__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1559:1: ( rule__VALUE_WORD__Group_1__2__Impl )
            // InternalDsl.g:1560:2: rule__VALUE_WORD__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VALUE_WORD__Group_1__2__Impl();

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
    // $ANTLR end "rule__VALUE_WORD__Group_1__2"


    // $ANTLR start "rule__VALUE_WORD__Group_1__2__Impl"
    // InternalDsl.g:1566:1: rule__VALUE_WORD__Group_1__2__Impl : ( ( rule__VALUE_WORD__Alternatives_1_2 ) ) ;
    public final void rule__VALUE_WORD__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1570:1: ( ( ( rule__VALUE_WORD__Alternatives_1_2 ) ) )
            // InternalDsl.g:1571:1: ( ( rule__VALUE_WORD__Alternatives_1_2 ) )
            {
            // InternalDsl.g:1571:1: ( ( rule__VALUE_WORD__Alternatives_1_2 ) )
            // InternalDsl.g:1572:2: ( rule__VALUE_WORD__Alternatives_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVALUE_WORDAccess().getAlternatives_1_2()); 
            }
            // InternalDsl.g:1573:2: ( rule__VALUE_WORD__Alternatives_1_2 )
            // InternalDsl.g:1573:3: rule__VALUE_WORD__Alternatives_1_2
            {
            pushFollow(FOLLOW_2);
            rule__VALUE_WORD__Alternatives_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVALUE_WORDAccess().getAlternatives_1_2()); 
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
    // $ANTLR end "rule__VALUE_WORD__Group_1__2__Impl"


    // $ANTLR start "rule__MULTILINE__Group__0"
    // InternalDsl.g:1582:1: rule__MULTILINE__Group__0 : rule__MULTILINE__Group__0__Impl rule__MULTILINE__Group__1 ;
    public final void rule__MULTILINE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1586:1: ( rule__MULTILINE__Group__0__Impl rule__MULTILINE__Group__1 )
            // InternalDsl.g:1587:2: rule__MULTILINE__Group__0__Impl rule__MULTILINE__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:1594:1: rule__MULTILINE__Group__0__Impl : ( ruleVALUE_WORD ) ;
    public final void rule__MULTILINE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1598:1: ( ( ruleVALUE_WORD ) )
            // InternalDsl.g:1599:1: ( ruleVALUE_WORD )
            {
            // InternalDsl.g:1599:1: ( ruleVALUE_WORD )
            // InternalDsl.g:1600:2: ruleVALUE_WORD
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
    // InternalDsl.g:1609:1: rule__MULTILINE__Group__1 : rule__MULTILINE__Group__1__Impl ;
    public final void rule__MULTILINE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1613:1: ( rule__MULTILINE__Group__1__Impl )
            // InternalDsl.g:1614:2: rule__MULTILINE__Group__1__Impl
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
    // InternalDsl.g:1620:1: rule__MULTILINE__Group__1__Impl : ( ( rule__MULTILINE__Group_1__0 )* ) ;
    public final void rule__MULTILINE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1624:1: ( ( ( rule__MULTILINE__Group_1__0 )* ) )
            // InternalDsl.g:1625:1: ( ( rule__MULTILINE__Group_1__0 )* )
            {
            // InternalDsl.g:1625:1: ( ( rule__MULTILINE__Group_1__0 )* )
            // InternalDsl.g:1626:2: ( rule__MULTILINE__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMULTILINEAccess().getGroup_1()); 
            }
            // InternalDsl.g:1627:2: ( rule__MULTILINE__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_SPACE||LA34_0==10) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalDsl.g:1627:3: rule__MULTILINE__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__MULTILINE__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalDsl.g:1636:1: rule__MULTILINE__Group_1__0 : rule__MULTILINE__Group_1__0__Impl rule__MULTILINE__Group_1__1 ;
    public final void rule__MULTILINE__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1640:1: ( rule__MULTILINE__Group_1__0__Impl rule__MULTILINE__Group_1__1 )
            // InternalDsl.g:1641:2: rule__MULTILINE__Group_1__0__Impl rule__MULTILINE__Group_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:1648:1: rule__MULTILINE__Group_1__0__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__MULTILINE__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1652:1: ( ( ( RULE_SPACE )* ) )
            // InternalDsl.g:1653:1: ( ( RULE_SPACE )* )
            {
            // InternalDsl.g:1653:1: ( ( RULE_SPACE )* )
            // InternalDsl.g:1654:2: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMULTILINEAccess().getSPACETerminalRuleCall_1_0()); 
            }
            // InternalDsl.g:1655:2: ( RULE_SPACE )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_SPACE) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalDsl.g:1655:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_6); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMULTILINEAccess().getSPACETerminalRuleCall_1_0()); 
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
    // InternalDsl.g:1663:1: rule__MULTILINE__Group_1__1 : rule__MULTILINE__Group_1__1__Impl rule__MULTILINE__Group_1__2 ;
    public final void rule__MULTILINE__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1667:1: ( rule__MULTILINE__Group_1__1__Impl rule__MULTILINE__Group_1__2 )
            // InternalDsl.g:1668:2: rule__MULTILINE__Group_1__1__Impl rule__MULTILINE__Group_1__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalDsl.g:1675:1: rule__MULTILINE__Group_1__1__Impl : ( '\\\\' ) ;
    public final void rule__MULTILINE__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1679:1: ( ( '\\\\' ) )
            // InternalDsl.g:1680:1: ( '\\\\' )
            {
            // InternalDsl.g:1680:1: ( '\\\\' )
            // InternalDsl.g:1681:2: '\\\\'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMULTILINEAccess().getBackslashKeyword_1_1()); 
            }
            match(input,10,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMULTILINEAccess().getBackslashKeyword_1_1()); 
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
    // InternalDsl.g:1690:1: rule__MULTILINE__Group_1__2 : rule__MULTILINE__Group_1__2__Impl rule__MULTILINE__Group_1__3 ;
    public final void rule__MULTILINE__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1694:1: ( rule__MULTILINE__Group_1__2__Impl rule__MULTILINE__Group_1__3 )
            // InternalDsl.g:1695:2: rule__MULTILINE__Group_1__2__Impl rule__MULTILINE__Group_1__3
            {
            pushFollow(FOLLOW_7);
            rule__MULTILINE__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MULTILINE__Group_1__3();

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
    // InternalDsl.g:1702:1: rule__MULTILINE__Group_1__2__Impl : ( ( '\\r' )? ) ;
    public final void rule__MULTILINE__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1706:1: ( ( ( '\\r' )? ) )
            // InternalDsl.g:1707:1: ( ( '\\r' )? )
            {
            // InternalDsl.g:1707:1: ( ( '\\r' )? )
            // InternalDsl.g:1708:2: ( '\\r' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMULTILINEAccess().getCarriageReturnKeyword_1_2()); 
            }
            // InternalDsl.g:1709:2: ( '\\r' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==8) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDsl.g:1709:3: '\\r'
                    {
                    match(input,8,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMULTILINEAccess().getCarriageReturnKeyword_1_2()); 
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


    // $ANTLR start "rule__MULTILINE__Group_1__3"
    // InternalDsl.g:1717:1: rule__MULTILINE__Group_1__3 : rule__MULTILINE__Group_1__3__Impl rule__MULTILINE__Group_1__4 ;
    public final void rule__MULTILINE__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1721:1: ( rule__MULTILINE__Group_1__3__Impl rule__MULTILINE__Group_1__4 )
            // InternalDsl.g:1722:2: rule__MULTILINE__Group_1__3__Impl rule__MULTILINE__Group_1__4
            {
            pushFollow(FOLLOW_11);
            rule__MULTILINE__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MULTILINE__Group_1__4();

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
    // $ANTLR end "rule__MULTILINE__Group_1__3"


    // $ANTLR start "rule__MULTILINE__Group_1__3__Impl"
    // InternalDsl.g:1729:1: rule__MULTILINE__Group_1__3__Impl : ( '\\n' ) ;
    public final void rule__MULTILINE__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1733:1: ( ( '\\n' ) )
            // InternalDsl.g:1734:1: ( '\\n' )
            {
            // InternalDsl.g:1734:1: ( '\\n' )
            // InternalDsl.g:1735:2: '\\n'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMULTILINEAccess().getLineFeedKeyword_1_3()); 
            }
            match(input,9,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMULTILINEAccess().getLineFeedKeyword_1_3()); 
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
    // $ANTLR end "rule__MULTILINE__Group_1__3__Impl"


    // $ANTLR start "rule__MULTILINE__Group_1__4"
    // InternalDsl.g:1744:1: rule__MULTILINE__Group_1__4 : rule__MULTILINE__Group_1__4__Impl rule__MULTILINE__Group_1__5 ;
    public final void rule__MULTILINE__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1748:1: ( rule__MULTILINE__Group_1__4__Impl rule__MULTILINE__Group_1__5 )
            // InternalDsl.g:1749:2: rule__MULTILINE__Group_1__4__Impl rule__MULTILINE__Group_1__5
            {
            pushFollow(FOLLOW_11);
            rule__MULTILINE__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MULTILINE__Group_1__5();

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
    // $ANTLR end "rule__MULTILINE__Group_1__4"


    // $ANTLR start "rule__MULTILINE__Group_1__4__Impl"
    // InternalDsl.g:1756:1: rule__MULTILINE__Group_1__4__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__MULTILINE__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1760:1: ( ( ( RULE_SPACE )* ) )
            // InternalDsl.g:1761:1: ( ( RULE_SPACE )* )
            {
            // InternalDsl.g:1761:1: ( ( RULE_SPACE )* )
            // InternalDsl.g:1762:2: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMULTILINEAccess().getSPACETerminalRuleCall_1_4()); 
            }
            // InternalDsl.g:1763:2: ( RULE_SPACE )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_SPACE) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalDsl.g:1763:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_6); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMULTILINEAccess().getSPACETerminalRuleCall_1_4()); 
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
    // $ANTLR end "rule__MULTILINE__Group_1__4__Impl"


    // $ANTLR start "rule__MULTILINE__Group_1__5"
    // InternalDsl.g:1771:1: rule__MULTILINE__Group_1__5 : rule__MULTILINE__Group_1__5__Impl ;
    public final void rule__MULTILINE__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1775:1: ( rule__MULTILINE__Group_1__5__Impl )
            // InternalDsl.g:1776:2: rule__MULTILINE__Group_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MULTILINE__Group_1__5__Impl();

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
    // $ANTLR end "rule__MULTILINE__Group_1__5"


    // $ANTLR start "rule__MULTILINE__Group_1__5__Impl"
    // InternalDsl.g:1782:1: rule__MULTILINE__Group_1__5__Impl : ( ruleVALUE_WORD ) ;
    public final void rule__MULTILINE__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1786:1: ( ( ruleVALUE_WORD ) )
            // InternalDsl.g:1787:1: ( ruleVALUE_WORD )
            {
            // InternalDsl.g:1787:1: ( ruleVALUE_WORD )
            // InternalDsl.g:1788:2: ruleVALUE_WORD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMULTILINEAccess().getVALUE_WORDParserRuleCall_1_5()); 
            }
            pushFollow(FOLLOW_2);
            ruleVALUE_WORD();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMULTILINEAccess().getVALUE_WORDParserRuleCall_1_5()); 
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
    // $ANTLR end "rule__MULTILINE__Group_1__5__Impl"


    // $ANTLR start "rule__WORD__Group__0"
    // InternalDsl.g:1798:1: rule__WORD__Group__0 : rule__WORD__Group__0__Impl rule__WORD__Group__1 ;
    public final void rule__WORD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1802:1: ( rule__WORD__Group__0__Impl rule__WORD__Group__1 )
            // InternalDsl.g:1803:2: rule__WORD__Group__0__Impl rule__WORD__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalDsl.g:1810:1: rule__WORD__Group__0__Impl : ( ( ( RULE_LETTER ) ) ( ( RULE_LETTER )* ) ) ;
    public final void rule__WORD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1814:1: ( ( ( ( RULE_LETTER ) ) ( ( RULE_LETTER )* ) ) )
            // InternalDsl.g:1815:1: ( ( ( RULE_LETTER ) ) ( ( RULE_LETTER )* ) )
            {
            // InternalDsl.g:1815:1: ( ( ( RULE_LETTER ) ) ( ( RULE_LETTER )* ) )
            // InternalDsl.g:1816:2: ( ( RULE_LETTER ) ) ( ( RULE_LETTER )* )
            {
            // InternalDsl.g:1816:2: ( ( RULE_LETTER ) )
            // InternalDsl.g:1817:3: ( RULE_LETTER )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWORDAccess().getLETTERTerminalRuleCall_0()); 
            }
            // InternalDsl.g:1818:3: ( RULE_LETTER )
            // InternalDsl.g:1818:4: RULE_LETTER
            {
            match(input,RULE_LETTER,FOLLOW_16); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWORDAccess().getLETTERTerminalRuleCall_0()); 
            }

            }

            // InternalDsl.g:1821:2: ( ( RULE_LETTER )* )
            // InternalDsl.g:1822:3: ( RULE_LETTER )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWORDAccess().getLETTERTerminalRuleCall_0()); 
            }
            // InternalDsl.g:1823:3: ( RULE_LETTER )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_LETTER) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalDsl.g:1823:4: RULE_LETTER
            	    {
            	    match(input,RULE_LETTER,FOLLOW_16); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWORDAccess().getLETTERTerminalRuleCall_0()); 
            }

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
    // InternalDsl.g:1832:1: rule__WORD__Group__1 : rule__WORD__Group__1__Impl ;
    public final void rule__WORD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1836:1: ( rule__WORD__Group__1__Impl )
            // InternalDsl.g:1837:2: rule__WORD__Group__1__Impl
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
    // InternalDsl.g:1843:1: rule__WORD__Group__1__Impl : ( ( rule__WORD__Group_1__0 )? ) ;
    public final void rule__WORD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1847:1: ( ( ( rule__WORD__Group_1__0 )? ) )
            // InternalDsl.g:1848:1: ( ( rule__WORD__Group_1__0 )? )
            {
            // InternalDsl.g:1848:1: ( ( rule__WORD__Group_1__0 )? )
            // InternalDsl.g:1849:2: ( rule__WORD__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWORDAccess().getGroup_1()); 
            }
            // InternalDsl.g:1850:2: ( rule__WORD__Group_1__0 )?
            int alt39=2;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // InternalDsl.g:1850:3: rule__WORD__Group_1__0
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
    // InternalDsl.g:1859:1: rule__WORD__Group_1__0 : rule__WORD__Group_1__0__Impl rule__WORD__Group_1__1 ;
    public final void rule__WORD__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1863:1: ( rule__WORD__Group_1__0__Impl rule__WORD__Group_1__1 )
            // InternalDsl.g:1864:2: rule__WORD__Group_1__0__Impl rule__WORD__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalDsl.g:1871:1: rule__WORD__Group_1__0__Impl : ( RULE_SPACE ) ;
    public final void rule__WORD__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1875:1: ( ( RULE_SPACE ) )
            // InternalDsl.g:1876:1: ( RULE_SPACE )
            {
            // InternalDsl.g:1876:1: ( RULE_SPACE )
            // InternalDsl.g:1877:2: RULE_SPACE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWORDAccess().getSPACETerminalRuleCall_1_0()); 
            }
            match(input,RULE_SPACE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWORDAccess().getSPACETerminalRuleCall_1_0()); 
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
    // InternalDsl.g:1886:1: rule__WORD__Group_1__1 : rule__WORD__Group_1__1__Impl rule__WORD__Group_1__2 ;
    public final void rule__WORD__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1890:1: ( rule__WORD__Group_1__1__Impl rule__WORD__Group_1__2 )
            // InternalDsl.g:1891:2: rule__WORD__Group_1__1__Impl rule__WORD__Group_1__2
            {
            pushFollow(FOLLOW_17);
            rule__WORD__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__WORD__Group_1__2();

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
    // InternalDsl.g:1898:1: rule__WORD__Group_1__1__Impl : ( ( rule__WORD__Alternatives_1_1 )* ) ;
    public final void rule__WORD__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1902:1: ( ( ( rule__WORD__Alternatives_1_1 )* ) )
            // InternalDsl.g:1903:1: ( ( rule__WORD__Alternatives_1_1 )* )
            {
            // InternalDsl.g:1903:1: ( ( rule__WORD__Alternatives_1_1 )* )
            // InternalDsl.g:1904:2: ( rule__WORD__Alternatives_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWORDAccess().getAlternatives_1_1()); 
            }
            // InternalDsl.g:1905:2: ( rule__WORD__Alternatives_1_1 )*
            loop40:
            do {
                int alt40=2;
                alt40 = dfa40.predict(input);
                switch (alt40) {
            	case 1 :
            	    // InternalDsl.g:1905:3: rule__WORD__Alternatives_1_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__WORD__Alternatives_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWORDAccess().getAlternatives_1_1()); 
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


    // $ANTLR start "rule__WORD__Group_1__2"
    // InternalDsl.g:1913:1: rule__WORD__Group_1__2 : rule__WORD__Group_1__2__Impl ;
    public final void rule__WORD__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1917:1: ( rule__WORD__Group_1__2__Impl )
            // InternalDsl.g:1918:2: rule__WORD__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WORD__Group_1__2__Impl();

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
    // $ANTLR end "rule__WORD__Group_1__2"


    // $ANTLR start "rule__WORD__Group_1__2__Impl"
    // InternalDsl.g:1924:1: rule__WORD__Group_1__2__Impl : ( RULE_LETTER ) ;
    public final void rule__WORD__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1928:1: ( ( RULE_LETTER ) )
            // InternalDsl.g:1929:1: ( RULE_LETTER )
            {
            // InternalDsl.g:1929:1: ( RULE_LETTER )
            // InternalDsl.g:1930:2: RULE_LETTER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWORDAccess().getLETTERTerminalRuleCall_1_2()); 
            }
            match(input,RULE_LETTER,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWORDAccess().getLETTERTerminalRuleCall_1_2()); 
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
    // $ANTLR end "rule__WORD__Group_1__2__Impl"


    // $ANTLR start "rule__Dsl__EntriesAssignment_4"
    // InternalDsl.g:1940:1: rule__Dsl__EntriesAssignment_4 : ( ruleEntry ) ;
    public final void rule__Dsl__EntriesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1944:1: ( ( ruleEntry ) )
            // InternalDsl.g:1945:2: ( ruleEntry )
            {
            // InternalDsl.g:1945:2: ( ruleEntry )
            // InternalDsl.g:1946:3: ruleEntry
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getEntriesEntryParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEntry();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getEntriesEntryParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Dsl__EntriesAssignment_4"


    // $ANTLR start "rule__Dsl__EntriesAssignment_5_3"
    // InternalDsl.g:1955:1: rule__Dsl__EntriesAssignment_5_3 : ( ruleEntry ) ;
    public final void rule__Dsl__EntriesAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1959:1: ( ( ruleEntry ) )
            // InternalDsl.g:1960:2: ( ruleEntry )
            {
            // InternalDsl.g:1960:2: ( ruleEntry )
            // InternalDsl.g:1961:3: ruleEntry
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getEntriesEntryParserRuleCall_5_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEntry();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getEntriesEntryParserRuleCall_5_3_0()); 
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
    // $ANTLR end "rule__Dsl__EntriesAssignment_5_3"


    // $ANTLR start "rule__Entry__KeyAssignment_1"
    // InternalDsl.g:1970:1: rule__Entry__KeyAssignment_1 : ( ruleWORD ) ;
    public final void rule__Entry__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1974:1: ( ( ruleWORD ) )
            // InternalDsl.g:1975:2: ( ruleWORD )
            {
            // InternalDsl.g:1975:2: ( ruleWORD )
            // InternalDsl.g:1976:3: ruleWORD
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


    // $ANTLR start "rule__Entry__ValueAssignment_3_2"
    // InternalDsl.g:1985:1: rule__Entry__ValueAssignment_3_2 : ( ruleMULTILINE ) ;
    public final void rule__Entry__ValueAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1989:1: ( ( ruleMULTILINE ) )
            // InternalDsl.g:1990:2: ( ruleMULTILINE )
            {
            // InternalDsl.g:1990:2: ( ruleMULTILINE )
            // InternalDsl.g:1991:3: ruleMULTILINE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryAccess().getValueMULTILINEParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMULTILINE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryAccess().getValueMULTILINEParserRuleCall_3_2_0()); 
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
    // $ANTLR end "rule__Entry__ValueAssignment_3_2"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA40 dfa40 = new DFA40(this);
    static final String dfa_1s = "\5\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\4\1\uffff\1\4";
    static final String dfa_3s = "\1\11\1\uffff\1\11\1\uffff\1\11";
    static final String dfa_4s = "\1\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String dfa_5s = "\5\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\1\2\1\1\2\3",
            "",
            "\1\1\1\uffff\1\4\1\uffff\2\3",
            "",
            "\1\1\1\uffff\1\4\1\uffff\2\3"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 371:2: ( rule__Dsl__Alternatives_1 )*";
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\1\3\1\uffff\1\3\3\uffff\1\3\3\uffff\1\3";
    static final String dfa_9s = "\1\10\1\11\1\4\1\uffff\1\4\1\11\1\4\1\uffff\1\4\1\11\1\4";
    static final String dfa_10s = "\3\11\1\uffff\3\11\1\uffff\3\11";
    static final String dfa_11s = "\3\uffff\1\2\3\uffff\1\1\3\uffff";
    static final String dfa_12s = "\13\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\1\2",
            "\1\2",
            "\1\7\1\uffff\1\4\1\uffff\1\5\1\6",
            "",
            "\1\7\1\uffff\1\10\1\uffff\1\11\1\12",
            "\1\6",
            "\1\7\1\uffff\1\4\1\uffff\1\5\1\6",
            "",
            "\1\7\1\uffff\1\10\1\uffff\1\11\1\12",
            "\1\12",
            "\1\7\1\uffff\1\4\1\uffff\2\3"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
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
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 479:2: ( rule__Dsl__Group_5__0 )*";
        }
    }
    static final String dfa_14s = "\2\4\1\uffff\1\4\1\uffff";
    static final String dfa_15s = "\1\6\1\11\1\uffff\1\11\1\uffff";
    static final String dfa_16s = "\2\uffff\1\2\1\uffff\1\1";
    static final String[] dfa_17s = {
            "\1\2\1\uffff\1\1",
            "\1\2\1\uffff\1\3\1\uffff\2\4",
            "",
            "\1\2\1\uffff\1\3\1\uffff\2\4",
            ""
    };
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[][] dfa_17 = unpackEncodedStringArray(dfa_17s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_5;
            this.transition = dfa_17;
        }
        public String getDescription() {
            return "()* loopback of 824:2: ( rule__Dsl__Group_5_1__0 )*";
        }
    }
    static final String dfa_18s = "\1\2\4\uffff";
    static final String dfa_19s = "\1\6\1\4\1\uffff\1\4\1\uffff";
    static final String dfa_20s = "\2\12\1\uffff\1\12\1\uffff";
    static final String[] dfa_21s = {
            "\1\1\1\uffff\3\2",
            "\2\4\1\3\3\uffff\1\2",
            "",
            "\2\4\1\3\3\uffff\1\2",
            ""
    };
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_1;
            this.eof = dfa_18;
            this.min = dfa_19;
            this.max = dfa_20;
            this.accept = dfa_16;
            this.special = dfa_5;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "1492:2: ( rule__VALUE_WORD__Group_1__0 )?";
        }
    }
    static final String dfa_22s = "\6\uffff";
    static final String dfa_23s = "\1\uffff\2\4\3\uffff";
    static final String dfa_24s = "\3\4\2\uffff\1\4";
    static final String dfa_25s = "\1\6\2\12\2\uffff\1\12";
    static final String dfa_26s = "\3\uffff\1\1\1\2\1\uffff";
    static final String dfa_27s = "\6\uffff}>";
    static final String[] dfa_28s = {
            "\1\1\1\2\1\3",
            "\2\3\1\5\1\uffff\3\4",
            "\2\3\1\5\1\uffff\3\4",
            "",
            "",
            "\2\3\1\5\3\uffff\1\4"
    };

    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[][] dfa_28 = unpackEncodedStringArray(dfa_28s);

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_22;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "()* loopback of 1547:2: ( rule__VALUE_WORD__Alternatives_1_1 )*";
        }
    }
    static final String dfa_29s = "\1\5\1\4\1\uffff\1\4\1\uffff";
    static final String dfa_30s = "\2\6\1\uffff\1\6\1\uffff";
    static final String[] dfa_31s = {
            "\1\2\1\1",
            "\1\4\1\2\1\3",
            "",
            "\1\4\1\2\1\3",
            ""
    };
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final short[][] dfa_31 = unpackEncodedStringArray(dfa_31s);

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = dfa_1;
            this.eof = dfa_18;
            this.min = dfa_29;
            this.max = dfa_30;
            this.accept = dfa_16;
            this.special = dfa_5;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "1850:2: ( rule__WORD__Group_1__0 )?";
        }
    }
    static final String dfa_32s = "\1\uffff\1\3\3\uffff";
    static final String dfa_33s = "\2\4\2\uffff\1\4";
    static final String dfa_34s = "\2\6\2\uffff\1\6";
    static final String dfa_35s = "\2\uffff\1\1\1\2\1\uffff";
    static final String[] dfa_36s = {
            "\1\1\1\uffff\1\2",
            "\1\2\1\3\1\4",
            "",
            "",
            "\1\2\1\3\1\4"
    };
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[][] dfa_36 = unpackEncodedStringArray(dfa_36s);

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = dfa_1;
            this.eof = dfa_32;
            this.min = dfa_33;
            this.max = dfa_34;
            this.accept = dfa_35;
            this.special = dfa_5;
            this.transition = dfa_36;
        }
        public String getDescription() {
            return "()* loopback of 1905:2: ( rule__WORD__Alternatives_1_1 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000003D0L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000342L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000340L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000442L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000052L});

}