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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LINE_START", "RULE_SL_COMMENT", "RULE_ENTRYKEY", "RULE_STRING", "RULE_WS", "RULE_SEPARATOR", "RULE_ANY_OTHER", "'\\r'", "'\\n'", "','", "'\\\\'"
    };
    public static final int RULE_WS=8;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SEPARATOR=9;
    public static final int RULE_SL_COMMENT=5;
    public static final int RULE_ENTRYKEY=6;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_LINE_START=4;
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


    // $ANTLR start "entryRuleEntryValue"
    // InternalDsl.g:104:1: entryRuleEntryValue : ruleEntryValue EOF ;
    public final void entryRuleEntryValue() throws RecognitionException {
        try {
            // InternalDsl.g:105:1: ( ruleEntryValue EOF )
            // InternalDsl.g:106:1: ruleEntryValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEntryValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryValueRule()); 
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
    // $ANTLR end "entryRuleEntryValue"


    // $ANTLR start "ruleEntryValue"
    // InternalDsl.g:113:1: ruleEntryValue : ( ( rule__EntryValue__Group__0 ) ) ;
    public final void ruleEntryValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:117:2: ( ( ( rule__EntryValue__Group__0 ) ) )
            // InternalDsl.g:118:2: ( ( rule__EntryValue__Group__0 ) )
            {
            // InternalDsl.g:118:2: ( ( rule__EntryValue__Group__0 ) )
            // InternalDsl.g:119:3: ( rule__EntryValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getGroup()); 
            }
            // InternalDsl.g:120:3: ( rule__EntryValue__Group__0 )
            // InternalDsl.g:120:4: rule__EntryValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntryValue__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryValueAccess().getGroup()); 
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
    // $ANTLR end "ruleEntryValue"


    // $ANTLR start "entryRuleENTRYVALUE_LINE"
    // InternalDsl.g:129:1: entryRuleENTRYVALUE_LINE : ruleENTRYVALUE_LINE EOF ;
    public final void entryRuleENTRYVALUE_LINE() throws RecognitionException {
        try {
            // InternalDsl.g:130:1: ( ruleENTRYVALUE_LINE EOF )
            // InternalDsl.g:131:1: ruleENTRYVALUE_LINE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENTRYVALUE_LINERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleENTRYVALUE_LINE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getENTRYVALUE_LINERule()); 
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
    // $ANTLR end "entryRuleENTRYVALUE_LINE"


    // $ANTLR start "ruleENTRYVALUE_LINE"
    // InternalDsl.g:138:1: ruleENTRYVALUE_LINE : ( ( rule__ENTRYVALUE_LINE__Alternatives ) ) ;
    public final void ruleENTRYVALUE_LINE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:142:2: ( ( ( rule__ENTRYVALUE_LINE__Alternatives ) ) )
            // InternalDsl.g:143:2: ( ( rule__ENTRYVALUE_LINE__Alternatives ) )
            {
            // InternalDsl.g:143:2: ( ( rule__ENTRYVALUE_LINE__Alternatives ) )
            // InternalDsl.g:144:3: ( rule__ENTRYVALUE_LINE__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENTRYVALUE_LINEAccess().getAlternatives()); 
            }
            // InternalDsl.g:145:3: ( rule__ENTRYVALUE_LINE__Alternatives )
            // InternalDsl.g:145:4: rule__ENTRYVALUE_LINE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ENTRYVALUE_LINE__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENTRYVALUE_LINEAccess().getAlternatives()); 
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
    // $ANTLR end "ruleENTRYVALUE_LINE"


    // $ANTLR start "entryRuleEMPTY_LINE"
    // InternalDsl.g:154:1: entryRuleEMPTY_LINE : ruleEMPTY_LINE EOF ;
    public final void entryRuleEMPTY_LINE() throws RecognitionException {
        try {
            // InternalDsl.g:155:1: ( ruleEMPTY_LINE EOF )
            // InternalDsl.g:156:1: ruleEMPTY_LINE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMPTY_LINERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEMPTY_LINE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMPTY_LINERule()); 
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
    // $ANTLR end "entryRuleEMPTY_LINE"


    // $ANTLR start "ruleEMPTY_LINE"
    // InternalDsl.g:163:1: ruleEMPTY_LINE : ( RULE_LINE_START ) ;
    public final void ruleEMPTY_LINE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:167:2: ( ( RULE_LINE_START ) )
            // InternalDsl.g:168:2: ( RULE_LINE_START )
            {
            // InternalDsl.g:168:2: ( RULE_LINE_START )
            // InternalDsl.g:169:3: RULE_LINE_START
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEMPTY_LINEAccess().getLINE_STARTTerminalRuleCall()); 
            }
            match(input,RULE_LINE_START,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEMPTY_LINEAccess().getLINE_STARTTerminalRuleCall()); 
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
    // $ANTLR end "ruleEMPTY_LINE"


    // $ANTLR start "rule__Dsl__Alternatives_1_0"
    // InternalDsl.g:178:1: rule__Dsl__Alternatives_1_0 : ( ( ( rule__Dsl__EntriesAssignment_1_0_0 ) ) | ( ( ruleEMPTY_LINE ) ) | ( RULE_SL_COMMENT ) );
    public final void rule__Dsl__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:182:1: ( ( ( rule__Dsl__EntriesAssignment_1_0_0 ) ) | ( ( ruleEMPTY_LINE ) ) | ( RULE_SL_COMMENT ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_ENTRYKEY:
            case RULE_WS:
                {
                alt1=1;
                }
                break;
            case RULE_LINE_START:
                {
                alt1=2;
                }
                break;
            case RULE_SL_COMMENT:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalDsl.g:183:2: ( ( rule__Dsl__EntriesAssignment_1_0_0 ) )
                    {
                    // InternalDsl.g:183:2: ( ( rule__Dsl__EntriesAssignment_1_0_0 ) )
                    // InternalDsl.g:184:3: ( rule__Dsl__EntriesAssignment_1_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDslAccess().getEntriesAssignment_1_0_0()); 
                    }
                    // InternalDsl.g:185:3: ( rule__Dsl__EntriesAssignment_1_0_0 )
                    // InternalDsl.g:185:4: rule__Dsl__EntriesAssignment_1_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dsl__EntriesAssignment_1_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDslAccess().getEntriesAssignment_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:189:2: ( ( ruleEMPTY_LINE ) )
                    {
                    // InternalDsl.g:189:2: ( ( ruleEMPTY_LINE ) )
                    // InternalDsl.g:190:3: ( ruleEMPTY_LINE )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDslAccess().getEMPTY_LINEParserRuleCall_1_0_1()); 
                    }
                    // InternalDsl.g:191:3: ( ruleEMPTY_LINE )
                    // InternalDsl.g:191:4: ruleEMPTY_LINE
                    {
                    pushFollow(FOLLOW_2);
                    ruleEMPTY_LINE();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDslAccess().getEMPTY_LINEParserRuleCall_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:195:2: ( RULE_SL_COMMENT )
                    {
                    // InternalDsl.g:195:2: ( RULE_SL_COMMENT )
                    // InternalDsl.g:196:3: RULE_SL_COMMENT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDslAccess().getSL_COMMENTTerminalRuleCall_1_0_2()); 
                    }
                    match(input,RULE_SL_COMMENT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDslAccess().getSL_COMMENTTerminalRuleCall_1_0_2()); 
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
    // $ANTLR end "rule__Dsl__Alternatives_1_0"


    // $ANTLR start "rule__EntryValue__Alternatives_2_1"
    // InternalDsl.g:205:1: rule__EntryValue__Alternatives_2_1 : ( ( ( rule__EntryValue__Group_2_1_0__0 ) ) | ( ( rule__EntryValue__Group_2_1_1__0 ) ) | ( ( rule__EntryValue__Group_2_1_2__0 ) ) );
    public final void rule__EntryValue__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:209:1: ( ( ( rule__EntryValue__Group_2_1_0__0 ) ) | ( ( rule__EntryValue__Group_2_1_1__0 ) ) | ( ( rule__EntryValue__Group_2_1_2__0 ) ) )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:210:2: ( ( rule__EntryValue__Group_2_1_0__0 ) )
                    {
                    // InternalDsl.g:210:2: ( ( rule__EntryValue__Group_2_1_0__0 ) )
                    // InternalDsl.g:211:3: ( rule__EntryValue__Group_2_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntryValueAccess().getGroup_2_1_0()); 
                    }
                    // InternalDsl.g:212:3: ( rule__EntryValue__Group_2_1_0__0 )
                    // InternalDsl.g:212:4: rule__EntryValue__Group_2_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EntryValue__Group_2_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntryValueAccess().getGroup_2_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:216:2: ( ( rule__EntryValue__Group_2_1_1__0 ) )
                    {
                    // InternalDsl.g:216:2: ( ( rule__EntryValue__Group_2_1_1__0 ) )
                    // InternalDsl.g:217:3: ( rule__EntryValue__Group_2_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntryValueAccess().getGroup_2_1_1()); 
                    }
                    // InternalDsl.g:218:3: ( rule__EntryValue__Group_2_1_1__0 )
                    // InternalDsl.g:218:4: rule__EntryValue__Group_2_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EntryValue__Group_2_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntryValueAccess().getGroup_2_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:222:2: ( ( rule__EntryValue__Group_2_1_2__0 ) )
                    {
                    // InternalDsl.g:222:2: ( ( rule__EntryValue__Group_2_1_2__0 ) )
                    // InternalDsl.g:223:3: ( rule__EntryValue__Group_2_1_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntryValueAccess().getGroup_2_1_2()); 
                    }
                    // InternalDsl.g:224:3: ( rule__EntryValue__Group_2_1_2__0 )
                    // InternalDsl.g:224:4: rule__EntryValue__Group_2_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EntryValue__Group_2_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntryValueAccess().getGroup_2_1_2()); 
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
    // $ANTLR end "rule__EntryValue__Alternatives_2_1"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Alternatives"
    // InternalDsl.g:232:1: rule__ENTRYVALUE_LINE__Alternatives : ( ( RULE_ENTRYKEY ) | ( RULE_STRING ) );
    public final void rule__ENTRYVALUE_LINE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:236:1: ( ( RULE_ENTRYKEY ) | ( RULE_STRING ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ENTRYKEY) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_STRING) ) {
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
                    // InternalDsl.g:237:2: ( RULE_ENTRYKEY )
                    {
                    // InternalDsl.g:237:2: ( RULE_ENTRYKEY )
                    // InternalDsl.g:238:3: RULE_ENTRYKEY
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getENTRYVALUE_LINEAccess().getENTRYKEYTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ENTRYKEY,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getENTRYVALUE_LINEAccess().getENTRYKEYTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:243:2: ( RULE_STRING )
                    {
                    // InternalDsl.g:243:2: ( RULE_STRING )
                    // InternalDsl.g:244:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getENTRYVALUE_LINEAccess().getSTRINGTerminalRuleCall_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getENTRYVALUE_LINEAccess().getSTRINGTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Alternatives"


    // $ANTLR start "rule__Dsl__Group__0"
    // InternalDsl.g:253:1: rule__Dsl__Group__0 : rule__Dsl__Group__0__Impl rule__Dsl__Group__1 ;
    public final void rule__Dsl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:257:1: ( rule__Dsl__Group__0__Impl rule__Dsl__Group__1 )
            // InternalDsl.g:258:2: rule__Dsl__Group__0__Impl rule__Dsl__Group__1
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
    // InternalDsl.g:265:1: rule__Dsl__Group__0__Impl : ( () ) ;
    public final void rule__Dsl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:269:1: ( ( () ) )
            // InternalDsl.g:270:1: ( () )
            {
            // InternalDsl.g:270:1: ( () )
            // InternalDsl.g:271:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getDslAction_0()); 
            }
            // InternalDsl.g:272:2: ()
            // InternalDsl.g:272:3: 
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
    // InternalDsl.g:280:1: rule__Dsl__Group__1 : rule__Dsl__Group__1__Impl ;
    public final void rule__Dsl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:284:1: ( rule__Dsl__Group__1__Impl )
            // InternalDsl.g:285:2: rule__Dsl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dsl__Group__1__Impl();

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
    // InternalDsl.g:291:1: rule__Dsl__Group__1__Impl : ( ( rule__Dsl__Group_1__0 )* ) ;
    public final void rule__Dsl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:295:1: ( ( ( rule__Dsl__Group_1__0 )* ) )
            // InternalDsl.g:296:1: ( ( rule__Dsl__Group_1__0 )* )
            {
            // InternalDsl.g:296:1: ( ( rule__Dsl__Group_1__0 )* )
            // InternalDsl.g:297:2: ( rule__Dsl__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getGroup_1()); 
            }
            // InternalDsl.g:298:2: ( rule__Dsl__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_LINE_START && LA4_0<=RULE_ENTRYKEY)||LA4_0==RULE_WS) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDsl.g:298:3: rule__Dsl__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Dsl__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getGroup_1()); 
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


    // $ANTLR start "rule__Dsl__Group_1__0"
    // InternalDsl.g:307:1: rule__Dsl__Group_1__0 : rule__Dsl__Group_1__0__Impl rule__Dsl__Group_1__1 ;
    public final void rule__Dsl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:311:1: ( rule__Dsl__Group_1__0__Impl rule__Dsl__Group_1__1 )
            // InternalDsl.g:312:2: rule__Dsl__Group_1__0__Impl rule__Dsl__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Dsl__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Dsl__Group_1__1();

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
    // $ANTLR end "rule__Dsl__Group_1__0"


    // $ANTLR start "rule__Dsl__Group_1__0__Impl"
    // InternalDsl.g:319:1: rule__Dsl__Group_1__0__Impl : ( ( rule__Dsl__Alternatives_1_0 ) ) ;
    public final void rule__Dsl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:323:1: ( ( ( rule__Dsl__Alternatives_1_0 ) ) )
            // InternalDsl.g:324:1: ( ( rule__Dsl__Alternatives_1_0 ) )
            {
            // InternalDsl.g:324:1: ( ( rule__Dsl__Alternatives_1_0 ) )
            // InternalDsl.g:325:2: ( rule__Dsl__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getAlternatives_1_0()); 
            }
            // InternalDsl.g:326:2: ( rule__Dsl__Alternatives_1_0 )
            // InternalDsl.g:326:3: rule__Dsl__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Dsl__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getAlternatives_1_0()); 
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
    // $ANTLR end "rule__Dsl__Group_1__0__Impl"


    // $ANTLR start "rule__Dsl__Group_1__1"
    // InternalDsl.g:334:1: rule__Dsl__Group_1__1 : rule__Dsl__Group_1__1__Impl ;
    public final void rule__Dsl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:338:1: ( rule__Dsl__Group_1__1__Impl )
            // InternalDsl.g:339:2: rule__Dsl__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dsl__Group_1__1__Impl();

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
    // $ANTLR end "rule__Dsl__Group_1__1"


    // $ANTLR start "rule__Dsl__Group_1__1__Impl"
    // InternalDsl.g:345:1: rule__Dsl__Group_1__1__Impl : ( ( rule__Dsl__Group_1_1__0 )* ) ;
    public final void rule__Dsl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:349:1: ( ( ( rule__Dsl__Group_1_1__0 )* ) )
            // InternalDsl.g:350:1: ( ( rule__Dsl__Group_1_1__0 )* )
            {
            // InternalDsl.g:350:1: ( ( rule__Dsl__Group_1_1__0 )* )
            // InternalDsl.g:351:2: ( rule__Dsl__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getGroup_1_1()); 
            }
            // InternalDsl.g:352:2: ( rule__Dsl__Group_1_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=11 && LA5_0<=12)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:352:3: rule__Dsl__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Dsl__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__Dsl__Group_1__1__Impl"


    // $ANTLR start "rule__Dsl__Group_1_1__0"
    // InternalDsl.g:361:1: rule__Dsl__Group_1_1__0 : rule__Dsl__Group_1_1__0__Impl rule__Dsl__Group_1_1__1 ;
    public final void rule__Dsl__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:365:1: ( rule__Dsl__Group_1_1__0__Impl rule__Dsl__Group_1_1__1 )
            // InternalDsl.g:366:2: rule__Dsl__Group_1_1__0__Impl rule__Dsl__Group_1_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalDsl.g:373:1: rule__Dsl__Group_1_1__0__Impl : ( ( '\\r' )? ) ;
    public final void rule__Dsl__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:377:1: ( ( ( '\\r' )? ) )
            // InternalDsl.g:378:1: ( ( '\\r' )? )
            {
            // InternalDsl.g:378:1: ( ( '\\r' )? )
            // InternalDsl.g:379:2: ( '\\r' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getCarriageReturnKeyword_1_1_0()); 
            }
            // InternalDsl.g:380:2: ( '\\r' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:380:3: '\\r'
                    {
                    match(input,11,FOLLOW_2); if (state.failed) return ;

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
    // InternalDsl.g:388:1: rule__Dsl__Group_1_1__1 : rule__Dsl__Group_1_1__1__Impl ;
    public final void rule__Dsl__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:392:1: ( rule__Dsl__Group_1_1__1__Impl )
            // InternalDsl.g:393:2: rule__Dsl__Group_1_1__1__Impl
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
    // InternalDsl.g:399:1: rule__Dsl__Group_1_1__1__Impl : ( '\\n' ) ;
    public final void rule__Dsl__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:403:1: ( ( '\\n' ) )
            // InternalDsl.g:404:1: ( '\\n' )
            {
            // InternalDsl.g:404:1: ( '\\n' )
            // InternalDsl.g:405:2: '\\n'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getLineFeedKeyword_1_1_1()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__Entry__Group__0"
    // InternalDsl.g:415:1: rule__Entry__Group__0 : rule__Entry__Group__0__Impl rule__Entry__Group__1 ;
    public final void rule__Entry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:419:1: ( rule__Entry__Group__0__Impl rule__Entry__Group__1 )
            // InternalDsl.g:420:2: rule__Entry__Group__0__Impl rule__Entry__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDsl.g:427:1: rule__Entry__Group__0__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Entry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:431:1: ( ( ( RULE_WS )* ) )
            // InternalDsl.g:432:1: ( ( RULE_WS )* )
            {
            // InternalDsl.g:432:1: ( ( RULE_WS )* )
            // InternalDsl.g:433:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_0()); 
            }
            // InternalDsl.g:434:2: ( RULE_WS )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_WS) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:434:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_8); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryAccess().getWSTerminalRuleCall_0()); 
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
    // InternalDsl.g:442:1: rule__Entry__Group__1 : rule__Entry__Group__1__Impl rule__Entry__Group__2 ;
    public final void rule__Entry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:446:1: ( rule__Entry__Group__1__Impl rule__Entry__Group__2 )
            // InternalDsl.g:447:2: rule__Entry__Group__1__Impl rule__Entry__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalDsl.g:454:1: rule__Entry__Group__1__Impl : ( ( rule__Entry__KeyAssignment_1 ) ) ;
    public final void rule__Entry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:458:1: ( ( ( rule__Entry__KeyAssignment_1 ) ) )
            // InternalDsl.g:459:1: ( ( rule__Entry__KeyAssignment_1 ) )
            {
            // InternalDsl.g:459:1: ( ( rule__Entry__KeyAssignment_1 ) )
            // InternalDsl.g:460:2: ( rule__Entry__KeyAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryAccess().getKeyAssignment_1()); 
            }
            // InternalDsl.g:461:2: ( rule__Entry__KeyAssignment_1 )
            // InternalDsl.g:461:3: rule__Entry__KeyAssignment_1
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
    // InternalDsl.g:469:1: rule__Entry__Group__2 : rule__Entry__Group__2__Impl rule__Entry__Group__3 ;
    public final void rule__Entry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:473:1: ( rule__Entry__Group__2__Impl rule__Entry__Group__3 )
            // InternalDsl.g:474:2: rule__Entry__Group__2__Impl rule__Entry__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalDsl.g:481:1: rule__Entry__Group__2__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Entry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:485:1: ( ( ( RULE_WS )* ) )
            // InternalDsl.g:486:1: ( ( RULE_WS )* )
            {
            // InternalDsl.g:486:1: ( ( RULE_WS )* )
            // InternalDsl.g:487:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_2()); 
            }
            // InternalDsl.g:488:2: ( RULE_WS )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_WS) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:488:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_8); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryAccess().getWSTerminalRuleCall_2()); 
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
    // InternalDsl.g:496:1: rule__Entry__Group__3 : rule__Entry__Group__3__Impl rule__Entry__Group__4 ;
    public final void rule__Entry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:500:1: ( rule__Entry__Group__3__Impl rule__Entry__Group__4 )
            // InternalDsl.g:501:2: rule__Entry__Group__3__Impl rule__Entry__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:508:1: rule__Entry__Group__3__Impl : ( RULE_SEPARATOR ) ;
    public final void rule__Entry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:512:1: ( ( RULE_SEPARATOR ) )
            // InternalDsl.g:513:1: ( RULE_SEPARATOR )
            {
            // InternalDsl.g:513:1: ( RULE_SEPARATOR )
            // InternalDsl.g:514:2: RULE_SEPARATOR
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
    // InternalDsl.g:523:1: rule__Entry__Group__4 : rule__Entry__Group__4__Impl rule__Entry__Group__5 ;
    public final void rule__Entry__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:527:1: ( rule__Entry__Group__4__Impl rule__Entry__Group__5 )
            // InternalDsl.g:528:2: rule__Entry__Group__4__Impl rule__Entry__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:535:1: rule__Entry__Group__4__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Entry__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:539:1: ( ( ( RULE_WS )* ) )
            // InternalDsl.g:540:1: ( ( RULE_WS )* )
            {
            // InternalDsl.g:540:1: ( ( RULE_WS )* )
            // InternalDsl.g:541:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_4()); 
            }
            // InternalDsl.g:542:2: ( RULE_WS )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_WS) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:542:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_8); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryAccess().getWSTerminalRuleCall_4()); 
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
    // InternalDsl.g:550:1: rule__Entry__Group__5 : rule__Entry__Group__5__Impl ;
    public final void rule__Entry__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:554:1: ( rule__Entry__Group__5__Impl )
            // InternalDsl.g:555:2: rule__Entry__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entry__Group__5__Impl();

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
    // InternalDsl.g:561:1: rule__Entry__Group__5__Impl : ( ( rule__Entry__ValueAssignment_5 ) ) ;
    public final void rule__Entry__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:565:1: ( ( ( rule__Entry__ValueAssignment_5 ) ) )
            // InternalDsl.g:566:1: ( ( rule__Entry__ValueAssignment_5 ) )
            {
            // InternalDsl.g:566:1: ( ( rule__Entry__ValueAssignment_5 ) )
            // InternalDsl.g:567:2: ( rule__Entry__ValueAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryAccess().getValueAssignment_5()); 
            }
            // InternalDsl.g:568:2: ( rule__Entry__ValueAssignment_5 )
            // InternalDsl.g:568:3: rule__Entry__ValueAssignment_5
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


    // $ANTLR start "rule__EntryValue__Group__0"
    // InternalDsl.g:577:1: rule__EntryValue__Group__0 : rule__EntryValue__Group__0__Impl rule__EntryValue__Group__1 ;
    public final void rule__EntryValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:581:1: ( rule__EntryValue__Group__0__Impl rule__EntryValue__Group__1 )
            // InternalDsl.g:582:2: rule__EntryValue__Group__0__Impl rule__EntryValue__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__EntryValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EntryValue__Group__1();

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
    // $ANTLR end "rule__EntryValue__Group__0"


    // $ANTLR start "rule__EntryValue__Group__0__Impl"
    // InternalDsl.g:589:1: rule__EntryValue__Group__0__Impl : ( () ) ;
    public final void rule__EntryValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:593:1: ( ( () ) )
            // InternalDsl.g:594:1: ( () )
            {
            // InternalDsl.g:594:1: ( () )
            // InternalDsl.g:595:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getEntryValueAction_0()); 
            }
            // InternalDsl.g:596:2: ()
            // InternalDsl.g:596:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryValueAccess().getEntryValueAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryValue__Group__0__Impl"


    // $ANTLR start "rule__EntryValue__Group__1"
    // InternalDsl.g:604:1: rule__EntryValue__Group__1 : rule__EntryValue__Group__1__Impl rule__EntryValue__Group__2 ;
    public final void rule__EntryValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:608:1: ( rule__EntryValue__Group__1__Impl rule__EntryValue__Group__2 )
            // InternalDsl.g:609:2: rule__EntryValue__Group__1__Impl rule__EntryValue__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__EntryValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EntryValue__Group__2();

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
    // $ANTLR end "rule__EntryValue__Group__1"


    // $ANTLR start "rule__EntryValue__Group__1__Impl"
    // InternalDsl.g:616:1: rule__EntryValue__Group__1__Impl : ( ( rule__EntryValue__EntryLinesAssignment_1 ) ) ;
    public final void rule__EntryValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:620:1: ( ( ( rule__EntryValue__EntryLinesAssignment_1 ) ) )
            // InternalDsl.g:621:1: ( ( rule__EntryValue__EntryLinesAssignment_1 ) )
            {
            // InternalDsl.g:621:1: ( ( rule__EntryValue__EntryLinesAssignment_1 ) )
            // InternalDsl.g:622:2: ( rule__EntryValue__EntryLinesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getEntryLinesAssignment_1()); 
            }
            // InternalDsl.g:623:2: ( rule__EntryValue__EntryLinesAssignment_1 )
            // InternalDsl.g:623:3: rule__EntryValue__EntryLinesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EntryValue__EntryLinesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryValueAccess().getEntryLinesAssignment_1()); 
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
    // $ANTLR end "rule__EntryValue__Group__1__Impl"


    // $ANTLR start "rule__EntryValue__Group__2"
    // InternalDsl.g:631:1: rule__EntryValue__Group__2 : rule__EntryValue__Group__2__Impl ;
    public final void rule__EntryValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:635:1: ( rule__EntryValue__Group__2__Impl )
            // InternalDsl.g:636:2: rule__EntryValue__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntryValue__Group__2__Impl();

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
    // $ANTLR end "rule__EntryValue__Group__2"


    // $ANTLR start "rule__EntryValue__Group__2__Impl"
    // InternalDsl.g:642:1: rule__EntryValue__Group__2__Impl : ( ( rule__EntryValue__Group_2__0 )* ) ;
    public final void rule__EntryValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:646:1: ( ( ( rule__EntryValue__Group_2__0 )* ) )
            // InternalDsl.g:647:1: ( ( rule__EntryValue__Group_2__0 )* )
            {
            // InternalDsl.g:647:1: ( ( rule__EntryValue__Group_2__0 )* )
            // InternalDsl.g:648:2: ( rule__EntryValue__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getGroup_2()); 
            }
            // InternalDsl.g:649:2: ( rule__EntryValue__Group_2__0 )*
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:649:3: rule__EntryValue__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__EntryValue__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryValueAccess().getGroup_2()); 
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
    // $ANTLR end "rule__EntryValue__Group__2__Impl"


    // $ANTLR start "rule__EntryValue__Group_2__0"
    // InternalDsl.g:658:1: rule__EntryValue__Group_2__0 : rule__EntryValue__Group_2__0__Impl rule__EntryValue__Group_2__1 ;
    public final void rule__EntryValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:662:1: ( rule__EntryValue__Group_2__0__Impl rule__EntryValue__Group_2__1 )
            // InternalDsl.g:663:2: rule__EntryValue__Group_2__0__Impl rule__EntryValue__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__EntryValue__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EntryValue__Group_2__1();

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
    // $ANTLR end "rule__EntryValue__Group_2__0"


    // $ANTLR start "rule__EntryValue__Group_2__0__Impl"
    // InternalDsl.g:670:1: rule__EntryValue__Group_2__0__Impl : ( ( RULE_WS )* ) ;
    public final void rule__EntryValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:674:1: ( ( ( RULE_WS )* ) )
            // InternalDsl.g:675:1: ( ( RULE_WS )* )
            {
            // InternalDsl.g:675:1: ( ( RULE_WS )* )
            // InternalDsl.g:676:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getWSTerminalRuleCall_2_0()); 
            }
            // InternalDsl.g:677:2: ( RULE_WS )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_WS) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:677:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_8); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryValueAccess().getWSTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__EntryValue__Group_2__0__Impl"


    // $ANTLR start "rule__EntryValue__Group_2__1"
    // InternalDsl.g:685:1: rule__EntryValue__Group_2__1 : rule__EntryValue__Group_2__1__Impl ;
    public final void rule__EntryValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:689:1: ( rule__EntryValue__Group_2__1__Impl )
            // InternalDsl.g:690:2: rule__EntryValue__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntryValue__Group_2__1__Impl();

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
    // $ANTLR end "rule__EntryValue__Group_2__1"


    // $ANTLR start "rule__EntryValue__Group_2__1__Impl"
    // InternalDsl.g:696:1: rule__EntryValue__Group_2__1__Impl : ( ( rule__EntryValue__Alternatives_2_1 ) ) ;
    public final void rule__EntryValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:700:1: ( ( ( rule__EntryValue__Alternatives_2_1 ) ) )
            // InternalDsl.g:701:1: ( ( rule__EntryValue__Alternatives_2_1 ) )
            {
            // InternalDsl.g:701:1: ( ( rule__EntryValue__Alternatives_2_1 ) )
            // InternalDsl.g:702:2: ( rule__EntryValue__Alternatives_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getAlternatives_2_1()); 
            }
            // InternalDsl.g:703:2: ( rule__EntryValue__Alternatives_2_1 )
            // InternalDsl.g:703:3: rule__EntryValue__Alternatives_2_1
            {
            pushFollow(FOLLOW_2);
            rule__EntryValue__Alternatives_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryValueAccess().getAlternatives_2_1()); 
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
    // $ANTLR end "rule__EntryValue__Group_2__1__Impl"


    // $ANTLR start "rule__EntryValue__Group_2_1_0__0"
    // InternalDsl.g:712:1: rule__EntryValue__Group_2_1_0__0 : rule__EntryValue__Group_2_1_0__0__Impl rule__EntryValue__Group_2_1_0__1 ;
    public final void rule__EntryValue__Group_2_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:716:1: ( rule__EntryValue__Group_2_1_0__0__Impl rule__EntryValue__Group_2_1_0__1 )
            // InternalDsl.g:717:2: rule__EntryValue__Group_2_1_0__0__Impl rule__EntryValue__Group_2_1_0__1
            {
            pushFollow(FOLLOW_10);
            rule__EntryValue__Group_2_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EntryValue__Group_2_1_0__1();

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
    // $ANTLR end "rule__EntryValue__Group_2_1_0__0"


    // $ANTLR start "rule__EntryValue__Group_2_1_0__0__Impl"
    // InternalDsl.g:724:1: rule__EntryValue__Group_2_1_0__0__Impl : ( ( rule__EntryValue__Group_2_1_0_0__0 ) ) ;
    public final void rule__EntryValue__Group_2_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:728:1: ( ( ( rule__EntryValue__Group_2_1_0_0__0 ) ) )
            // InternalDsl.g:729:1: ( ( rule__EntryValue__Group_2_1_0_0__0 ) )
            {
            // InternalDsl.g:729:1: ( ( rule__EntryValue__Group_2_1_0_0__0 ) )
            // InternalDsl.g:730:2: ( rule__EntryValue__Group_2_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getGroup_2_1_0_0()); 
            }
            // InternalDsl.g:731:2: ( rule__EntryValue__Group_2_1_0_0__0 )
            // InternalDsl.g:731:3: rule__EntryValue__Group_2_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__EntryValue__Group_2_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryValueAccess().getGroup_2_1_0_0()); 
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
    // $ANTLR end "rule__EntryValue__Group_2_1_0__0__Impl"


    // $ANTLR start "rule__EntryValue__Group_2_1_0__1"
    // InternalDsl.g:739:1: rule__EntryValue__Group_2_1_0__1 : rule__EntryValue__Group_2_1_0__1__Impl ;
    public final void rule__EntryValue__Group_2_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:743:1: ( rule__EntryValue__Group_2_1_0__1__Impl )
            // InternalDsl.g:744:2: rule__EntryValue__Group_2_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntryValue__Group_2_1_0__1__Impl();

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
    // $ANTLR end "rule__EntryValue__Group_2_1_0__1"


    // $ANTLR start "rule__EntryValue__Group_2_1_0__1__Impl"
    // InternalDsl.g:750:1: rule__EntryValue__Group_2_1_0__1__Impl : ( ( rule__EntryValue__EntryLinesAssignment_2_1_0_1 ) ) ;
    public final void rule__EntryValue__Group_2_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:754:1: ( ( ( rule__EntryValue__EntryLinesAssignment_2_1_0_1 ) ) )
            // InternalDsl.g:755:1: ( ( rule__EntryValue__EntryLinesAssignment_2_1_0_1 ) )
            {
            // InternalDsl.g:755:1: ( ( rule__EntryValue__EntryLinesAssignment_2_1_0_1 ) )
            // InternalDsl.g:756:2: ( rule__EntryValue__EntryLinesAssignment_2_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getEntryLinesAssignment_2_1_0_1()); 
            }
            // InternalDsl.g:757:2: ( rule__EntryValue__EntryLinesAssignment_2_1_0_1 )
            // InternalDsl.g:757:3: rule__EntryValue__EntryLinesAssignment_2_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__EntryValue__EntryLinesAssignment_2_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryValueAccess().getEntryLinesAssignment_2_1_0_1()); 
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
    // $ANTLR end "rule__EntryValue__Group_2_1_0__1__Impl"


    // $ANTLR start "rule__EntryValue__Group_2_1_0_0__0"
    // InternalDsl.g:766:1: rule__EntryValue__Group_2_1_0_0__0 : rule__EntryValue__Group_2_1_0_0__0__Impl ;
    public final void rule__EntryValue__Group_2_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:770:1: ( rule__EntryValue__Group_2_1_0_0__0__Impl )
            // InternalDsl.g:771:2: rule__EntryValue__Group_2_1_0_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntryValue__Group_2_1_0_0__0__Impl();

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
    // $ANTLR end "rule__EntryValue__Group_2_1_0_0__0"


    // $ANTLR start "rule__EntryValue__Group_2_1_0_0__0__Impl"
    // InternalDsl.g:777:1: rule__EntryValue__Group_2_1_0_0__0__Impl : ( ( rule__EntryValue__Group_2_1_0_0_0__0 ) ) ;
    public final void rule__EntryValue__Group_2_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:781:1: ( ( ( rule__EntryValue__Group_2_1_0_0_0__0 ) ) )
            // InternalDsl.g:782:1: ( ( rule__EntryValue__Group_2_1_0_0_0__0 ) )
            {
            // InternalDsl.g:782:1: ( ( rule__EntryValue__Group_2_1_0_0_0__0 ) )
            // InternalDsl.g:783:2: ( rule__EntryValue__Group_2_1_0_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getGroup_2_1_0_0_0()); 
            }
            // InternalDsl.g:784:2: ( rule__EntryValue__Group_2_1_0_0_0__0 )
            // InternalDsl.g:784:3: rule__EntryValue__Group_2_1_0_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__EntryValue__Group_2_1_0_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryValueAccess().getGroup_2_1_0_0_0()); 
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
    // $ANTLR end "rule__EntryValue__Group_2_1_0_0__0__Impl"


    // $ANTLR start "rule__EntryValue__Group_2_1_0_0_0__0"
    // InternalDsl.g:793:1: rule__EntryValue__Group_2_1_0_0_0__0 : rule__EntryValue__Group_2_1_0_0_0__0__Impl rule__EntryValue__Group_2_1_0_0_0__1 ;
    public final void rule__EntryValue__Group_2_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:797:1: ( rule__EntryValue__Group_2_1_0_0_0__0__Impl rule__EntryValue__Group_2_1_0_0_0__1 )
            // InternalDsl.g:798:2: rule__EntryValue__Group_2_1_0_0_0__0__Impl rule__EntryValue__Group_2_1_0_0_0__1
            {
            pushFollow(FOLLOW_13);
            rule__EntryValue__Group_2_1_0_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EntryValue__Group_2_1_0_0_0__1();

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
    // $ANTLR end "rule__EntryValue__Group_2_1_0_0_0__0"


    // $ANTLR start "rule__EntryValue__Group_2_1_0_0_0__0__Impl"
    // InternalDsl.g:805:1: rule__EntryValue__Group_2_1_0_0_0__0__Impl : ( ',' ) ;
    public final void rule__EntryValue__Group_2_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:809:1: ( ( ',' ) )
            // InternalDsl.g:810:1: ( ',' )
            {
            // InternalDsl.g:810:1: ( ',' )
            // InternalDsl.g:811:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getCommaKeyword_2_1_0_0_0_0()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryValueAccess().getCommaKeyword_2_1_0_0_0_0()); 
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
    // $ANTLR end "rule__EntryValue__Group_2_1_0_0_0__0__Impl"


    // $ANTLR start "rule__EntryValue__Group_2_1_0_0_0__1"
    // InternalDsl.g:820:1: rule__EntryValue__Group_2_1_0_0_0__1 : rule__EntryValue__Group_2_1_0_0_0__1__Impl rule__EntryValue__Group_2_1_0_0_0__2 ;
    public final void rule__EntryValue__Group_2_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:824:1: ( rule__EntryValue__Group_2_1_0_0_0__1__Impl rule__EntryValue__Group_2_1_0_0_0__2 )
            // InternalDsl.g:825:2: rule__EntryValue__Group_2_1_0_0_0__1__Impl rule__EntryValue__Group_2_1_0_0_0__2
            {
            pushFollow(FOLLOW_13);
            rule__EntryValue__Group_2_1_0_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EntryValue__Group_2_1_0_0_0__2();

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
    // $ANTLR end "rule__EntryValue__Group_2_1_0_0_0__1"


    // $ANTLR start "rule__EntryValue__Group_2_1_0_0_0__1__Impl"
    // InternalDsl.g:832:1: rule__EntryValue__Group_2_1_0_0_0__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__EntryValue__Group_2_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:836:1: ( ( ( RULE_WS )* ) )
            // InternalDsl.g:837:1: ( ( RULE_WS )* )
            {
            // InternalDsl.g:837:1: ( ( RULE_WS )* )
            // InternalDsl.g:838:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getWSTerminalRuleCall_2_1_0_0_0_1()); 
            }
            // InternalDsl.g:839:2: ( RULE_WS )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_WS) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:839:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_8); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryValueAccess().getWSTerminalRuleCall_2_1_0_0_0_1()); 
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
    // $ANTLR end "rule__EntryValue__Group_2_1_0_0_0__1__Impl"


    // $ANTLR start "rule__EntryValue__Group_2_1_0_0_0__2"
    // InternalDsl.g:847:1: rule__EntryValue__Group_2_1_0_0_0__2 : rule__EntryValue__Group_2_1_0_0_0__2__Impl rule__EntryValue__Group_2_1_0_0_0__3 ;
    public final void rule__EntryValue__Group_2_1_0_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:851:1: ( rule__EntryValue__Group_2_1_0_0_0__2__Impl rule__EntryValue__Group_2_1_0_0_0__3 )
            // InternalDsl.g:852:2: rule__EntryValue__Group_2_1_0_0_0__2__Impl rule__EntryValue__Group_2_1_0_0_0__3
            {
            pushFollow(FOLLOW_14);
            rule__EntryValue__Group_2_1_0_0_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EntryValue__Group_2_1_0_0_0__3();

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
    // $ANTLR end "rule__EntryValue__Group_2_1_0_0_0__2"


    // $ANTLR start "rule__EntryValue__Group_2_1_0_0_0__2__Impl"
    // InternalDsl.g:859:1: rule__EntryValue__Group_2_1_0_0_0__2__Impl : ( '\\\\' ) ;
    public final void rule__EntryValue__Group_2_1_0_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:863:1: ( ( '\\\\' ) )
            // InternalDsl.g:864:1: ( '\\\\' )
            {
            // InternalDsl.g:864:1: ( '\\\\' )
            // InternalDsl.g:865:2: '\\\\'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getBackslashKeyword_2_1_0_0_0_2()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryValueAccess().getBackslashKeyword_2_1_0_0_0_2()); 
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
    // $ANTLR end "rule__EntryValue__Group_2_1_0_0_0__2__Impl"


    // $ANTLR start "rule__EntryValue__Group_2_1_0_0_0__3"
    // InternalDsl.g:874:1: rule__EntryValue__Group_2_1_0_0_0__3 : rule__EntryValue__Group_2_1_0_0_0__3__Impl ;
    public final void rule__EntryValue__Group_2_1_0_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:878:1: ( rule__EntryValue__Group_2_1_0_0_0__3__Impl )
            // InternalDsl.g:879:2: rule__EntryValue__Group_2_1_0_0_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntryValue__Group_2_1_0_0_0__3__Impl();

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
    // $ANTLR end "rule__EntryValue__Group_2_1_0_0_0__3"


    // $ANTLR start "rule__EntryValue__Group_2_1_0_0_0__3__Impl"
    // InternalDsl.g:885:1: rule__EntryValue__Group_2_1_0_0_0__3__Impl : ( RULE_LINE_START ) ;
    public final void rule__EntryValue__Group_2_1_0_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:889:1: ( ( RULE_LINE_START ) )
            // InternalDsl.g:890:1: ( RULE_LINE_START )
            {
            // InternalDsl.g:890:1: ( RULE_LINE_START )
            // InternalDsl.g:891:2: RULE_LINE_START
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getLINE_STARTTerminalRuleCall_2_1_0_0_0_3()); 
            }
            match(input,RULE_LINE_START,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryValueAccess().getLINE_STARTTerminalRuleCall_2_1_0_0_0_3()); 
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
    // $ANTLR end "rule__EntryValue__Group_2_1_0_0_0__3__Impl"


    // $ANTLR start "rule__EntryValue__Group_2_1_1__0"
    // InternalDsl.g:901:1: rule__EntryValue__Group_2_1_1__0 : rule__EntryValue__Group_2_1_1__0__Impl rule__EntryValue__Group_2_1_1__1 ;
    public final void rule__EntryValue__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:905:1: ( rule__EntryValue__Group_2_1_1__0__Impl rule__EntryValue__Group_2_1_1__1 )
            // InternalDsl.g:906:2: rule__EntryValue__Group_2_1_1__0__Impl rule__EntryValue__Group_2_1_1__1
            {
            pushFollow(FOLLOW_10);
            rule__EntryValue__Group_2_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EntryValue__Group_2_1_1__1();

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
    // $ANTLR end "rule__EntryValue__Group_2_1_1__0"


    // $ANTLR start "rule__EntryValue__Group_2_1_1__0__Impl"
    // InternalDsl.g:913:1: rule__EntryValue__Group_2_1_1__0__Impl : ( ( rule__EntryValue__Group_2_1_1_0__0 ) ) ;
    public final void rule__EntryValue__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:917:1: ( ( ( rule__EntryValue__Group_2_1_1_0__0 ) ) )
            // InternalDsl.g:918:1: ( ( rule__EntryValue__Group_2_1_1_0__0 ) )
            {
            // InternalDsl.g:918:1: ( ( rule__EntryValue__Group_2_1_1_0__0 ) )
            // InternalDsl.g:919:2: ( rule__EntryValue__Group_2_1_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getGroup_2_1_1_0()); 
            }
            // InternalDsl.g:920:2: ( rule__EntryValue__Group_2_1_1_0__0 )
            // InternalDsl.g:920:3: rule__EntryValue__Group_2_1_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__EntryValue__Group_2_1_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryValueAccess().getGroup_2_1_1_0()); 
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
    // $ANTLR end "rule__EntryValue__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__EntryValue__Group_2_1_1__1"
    // InternalDsl.g:928:1: rule__EntryValue__Group_2_1_1__1 : rule__EntryValue__Group_2_1_1__1__Impl ;
    public final void rule__EntryValue__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:932:1: ( rule__EntryValue__Group_2_1_1__1__Impl )
            // InternalDsl.g:933:2: rule__EntryValue__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntryValue__Group_2_1_1__1__Impl();

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
    // $ANTLR end "rule__EntryValue__Group_2_1_1__1"


    // $ANTLR start "rule__EntryValue__Group_2_1_1__1__Impl"
    // InternalDsl.g:939:1: rule__EntryValue__Group_2_1_1__1__Impl : ( ( rule__EntryValue__EntryLinesAssignment_2_1_1_1 ) ) ;
    public final void rule__EntryValue__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:943:1: ( ( ( rule__EntryValue__EntryLinesAssignment_2_1_1_1 ) ) )
            // InternalDsl.g:944:1: ( ( rule__EntryValue__EntryLinesAssignment_2_1_1_1 ) )
            {
            // InternalDsl.g:944:1: ( ( rule__EntryValue__EntryLinesAssignment_2_1_1_1 ) )
            // InternalDsl.g:945:2: ( rule__EntryValue__EntryLinesAssignment_2_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getEntryLinesAssignment_2_1_1_1()); 
            }
            // InternalDsl.g:946:2: ( rule__EntryValue__EntryLinesAssignment_2_1_1_1 )
            // InternalDsl.g:946:3: rule__EntryValue__EntryLinesAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EntryValue__EntryLinesAssignment_2_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryValueAccess().getEntryLinesAssignment_2_1_1_1()); 
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
    // $ANTLR end "rule__EntryValue__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__EntryValue__Group_2_1_1_0__0"
    // InternalDsl.g:955:1: rule__EntryValue__Group_2_1_1_0__0 : rule__EntryValue__Group_2_1_1_0__0__Impl ;
    public final void rule__EntryValue__Group_2_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:959:1: ( rule__EntryValue__Group_2_1_1_0__0__Impl )
            // InternalDsl.g:960:2: rule__EntryValue__Group_2_1_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntryValue__Group_2_1_1_0__0__Impl();

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
    // $ANTLR end "rule__EntryValue__Group_2_1_1_0__0"


    // $ANTLR start "rule__EntryValue__Group_2_1_1_0__0__Impl"
    // InternalDsl.g:966:1: rule__EntryValue__Group_2_1_1_0__0__Impl : ( ( rule__EntryValue__Group_2_1_1_0_0__0 ) ) ;
    public final void rule__EntryValue__Group_2_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:970:1: ( ( ( rule__EntryValue__Group_2_1_1_0_0__0 ) ) )
            // InternalDsl.g:971:1: ( ( rule__EntryValue__Group_2_1_1_0_0__0 ) )
            {
            // InternalDsl.g:971:1: ( ( rule__EntryValue__Group_2_1_1_0_0__0 ) )
            // InternalDsl.g:972:2: ( rule__EntryValue__Group_2_1_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getGroup_2_1_1_0_0()); 
            }
            // InternalDsl.g:973:2: ( rule__EntryValue__Group_2_1_1_0_0__0 )
            // InternalDsl.g:973:3: rule__EntryValue__Group_2_1_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__EntryValue__Group_2_1_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryValueAccess().getGroup_2_1_1_0_0()); 
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
    // $ANTLR end "rule__EntryValue__Group_2_1_1_0__0__Impl"


    // $ANTLR start "rule__EntryValue__Group_2_1_1_0_0__0"
    // InternalDsl.g:982:1: rule__EntryValue__Group_2_1_1_0_0__0 : rule__EntryValue__Group_2_1_1_0_0__0__Impl rule__EntryValue__Group_2_1_1_0_0__1 ;
    public final void rule__EntryValue__Group_2_1_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:986:1: ( rule__EntryValue__Group_2_1_1_0_0__0__Impl rule__EntryValue__Group_2_1_1_0_0__1 )
            // InternalDsl.g:987:2: rule__EntryValue__Group_2_1_1_0_0__0__Impl rule__EntryValue__Group_2_1_1_0_0__1
            {
            pushFollow(FOLLOW_14);
            rule__EntryValue__Group_2_1_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EntryValue__Group_2_1_1_0_0__1();

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
    // $ANTLR end "rule__EntryValue__Group_2_1_1_0_0__0"


    // $ANTLR start "rule__EntryValue__Group_2_1_1_0_0__0__Impl"
    // InternalDsl.g:994:1: rule__EntryValue__Group_2_1_1_0_0__0__Impl : ( '\\\\' ) ;
    public final void rule__EntryValue__Group_2_1_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:998:1: ( ( '\\\\' ) )
            // InternalDsl.g:999:1: ( '\\\\' )
            {
            // InternalDsl.g:999:1: ( '\\\\' )
            // InternalDsl.g:1000:2: '\\\\'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getBackslashKeyword_2_1_1_0_0_0()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryValueAccess().getBackslashKeyword_2_1_1_0_0_0()); 
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
    // $ANTLR end "rule__EntryValue__Group_2_1_1_0_0__0__Impl"


    // $ANTLR start "rule__EntryValue__Group_2_1_1_0_0__1"
    // InternalDsl.g:1009:1: rule__EntryValue__Group_2_1_1_0_0__1 : rule__EntryValue__Group_2_1_1_0_0__1__Impl ;
    public final void rule__EntryValue__Group_2_1_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1013:1: ( rule__EntryValue__Group_2_1_1_0_0__1__Impl )
            // InternalDsl.g:1014:2: rule__EntryValue__Group_2_1_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntryValue__Group_2_1_1_0_0__1__Impl();

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
    // $ANTLR end "rule__EntryValue__Group_2_1_1_0_0__1"


    // $ANTLR start "rule__EntryValue__Group_2_1_1_0_0__1__Impl"
    // InternalDsl.g:1020:1: rule__EntryValue__Group_2_1_1_0_0__1__Impl : ( RULE_LINE_START ) ;
    public final void rule__EntryValue__Group_2_1_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1024:1: ( ( RULE_LINE_START ) )
            // InternalDsl.g:1025:1: ( RULE_LINE_START )
            {
            // InternalDsl.g:1025:1: ( RULE_LINE_START )
            // InternalDsl.g:1026:2: RULE_LINE_START
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getLINE_STARTTerminalRuleCall_2_1_1_0_0_1()); 
            }
            match(input,RULE_LINE_START,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryValueAccess().getLINE_STARTTerminalRuleCall_2_1_1_0_0_1()); 
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
    // $ANTLR end "rule__EntryValue__Group_2_1_1_0_0__1__Impl"


    // $ANTLR start "rule__EntryValue__Group_2_1_2__0"
    // InternalDsl.g:1036:1: rule__EntryValue__Group_2_1_2__0 : rule__EntryValue__Group_2_1_2__0__Impl rule__EntryValue__Group_2_1_2__1 ;
    public final void rule__EntryValue__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1040:1: ( rule__EntryValue__Group_2_1_2__0__Impl rule__EntryValue__Group_2_1_2__1 )
            // InternalDsl.g:1041:2: rule__EntryValue__Group_2_1_2__0__Impl rule__EntryValue__Group_2_1_2__1
            {
            pushFollow(FOLLOW_10);
            rule__EntryValue__Group_2_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EntryValue__Group_2_1_2__1();

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
    // $ANTLR end "rule__EntryValue__Group_2_1_2__0"


    // $ANTLR start "rule__EntryValue__Group_2_1_2__0__Impl"
    // InternalDsl.g:1048:1: rule__EntryValue__Group_2_1_2__0__Impl : ( ',' ) ;
    public final void rule__EntryValue__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1052:1: ( ( ',' ) )
            // InternalDsl.g:1053:1: ( ',' )
            {
            // InternalDsl.g:1053:1: ( ',' )
            // InternalDsl.g:1054:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getCommaKeyword_2_1_2_0()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryValueAccess().getCommaKeyword_2_1_2_0()); 
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
    // $ANTLR end "rule__EntryValue__Group_2_1_2__0__Impl"


    // $ANTLR start "rule__EntryValue__Group_2_1_2__1"
    // InternalDsl.g:1063:1: rule__EntryValue__Group_2_1_2__1 : rule__EntryValue__Group_2_1_2__1__Impl rule__EntryValue__Group_2_1_2__2 ;
    public final void rule__EntryValue__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1067:1: ( rule__EntryValue__Group_2_1_2__1__Impl rule__EntryValue__Group_2_1_2__2 )
            // InternalDsl.g:1068:2: rule__EntryValue__Group_2_1_2__1__Impl rule__EntryValue__Group_2_1_2__2
            {
            pushFollow(FOLLOW_10);
            rule__EntryValue__Group_2_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EntryValue__Group_2_1_2__2();

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
    // $ANTLR end "rule__EntryValue__Group_2_1_2__1"


    // $ANTLR start "rule__EntryValue__Group_2_1_2__1__Impl"
    // InternalDsl.g:1075:1: rule__EntryValue__Group_2_1_2__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__EntryValue__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1079:1: ( ( ( RULE_WS )* ) )
            // InternalDsl.g:1080:1: ( ( RULE_WS )* )
            {
            // InternalDsl.g:1080:1: ( ( RULE_WS )* )
            // InternalDsl.g:1081:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getWSTerminalRuleCall_2_1_2_1()); 
            }
            // InternalDsl.g:1082:2: ( RULE_WS )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_WS) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:1082:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_8); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryValueAccess().getWSTerminalRuleCall_2_1_2_1()); 
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
    // $ANTLR end "rule__EntryValue__Group_2_1_2__1__Impl"


    // $ANTLR start "rule__EntryValue__Group_2_1_2__2"
    // InternalDsl.g:1090:1: rule__EntryValue__Group_2_1_2__2 : rule__EntryValue__Group_2_1_2__2__Impl ;
    public final void rule__EntryValue__Group_2_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1094:1: ( rule__EntryValue__Group_2_1_2__2__Impl )
            // InternalDsl.g:1095:2: rule__EntryValue__Group_2_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntryValue__Group_2_1_2__2__Impl();

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
    // $ANTLR end "rule__EntryValue__Group_2_1_2__2"


    // $ANTLR start "rule__EntryValue__Group_2_1_2__2__Impl"
    // InternalDsl.g:1101:1: rule__EntryValue__Group_2_1_2__2__Impl : ( ( rule__EntryValue__EntryLinesAssignment_2_1_2_2 ) ) ;
    public final void rule__EntryValue__Group_2_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1105:1: ( ( ( rule__EntryValue__EntryLinesAssignment_2_1_2_2 ) ) )
            // InternalDsl.g:1106:1: ( ( rule__EntryValue__EntryLinesAssignment_2_1_2_2 ) )
            {
            // InternalDsl.g:1106:1: ( ( rule__EntryValue__EntryLinesAssignment_2_1_2_2 ) )
            // InternalDsl.g:1107:2: ( rule__EntryValue__EntryLinesAssignment_2_1_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getEntryLinesAssignment_2_1_2_2()); 
            }
            // InternalDsl.g:1108:2: ( rule__EntryValue__EntryLinesAssignment_2_1_2_2 )
            // InternalDsl.g:1108:3: rule__EntryValue__EntryLinesAssignment_2_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__EntryValue__EntryLinesAssignment_2_1_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryValueAccess().getEntryLinesAssignment_2_1_2_2()); 
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
    // $ANTLR end "rule__EntryValue__Group_2_1_2__2__Impl"


    // $ANTLR start "rule__Dsl__EntriesAssignment_1_0_0"
    // InternalDsl.g:1117:1: rule__Dsl__EntriesAssignment_1_0_0 : ( ruleEntry ) ;
    public final void rule__Dsl__EntriesAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1121:1: ( ( ruleEntry ) )
            // InternalDsl.g:1122:2: ( ruleEntry )
            {
            // InternalDsl.g:1122:2: ( ruleEntry )
            // InternalDsl.g:1123:3: ruleEntry
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getEntriesEntryParserRuleCall_1_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEntry();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDslAccess().getEntriesEntryParserRuleCall_1_0_0_0()); 
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
    // $ANTLR end "rule__Dsl__EntriesAssignment_1_0_0"


    // $ANTLR start "rule__Entry__KeyAssignment_1"
    // InternalDsl.g:1132:1: rule__Entry__KeyAssignment_1 : ( RULE_ENTRYKEY ) ;
    public final void rule__Entry__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1136:1: ( ( RULE_ENTRYKEY ) )
            // InternalDsl.g:1137:2: ( RULE_ENTRYKEY )
            {
            // InternalDsl.g:1137:2: ( RULE_ENTRYKEY )
            // InternalDsl.g:1138:3: RULE_ENTRYKEY
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryAccess().getKeyENTRYKEYTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ENTRYKEY,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryAccess().getKeyENTRYKEYTerminalRuleCall_1_0()); 
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
    // InternalDsl.g:1147:1: rule__Entry__ValueAssignment_5 : ( ruleEntryValue ) ;
    public final void rule__Entry__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1151:1: ( ( ruleEntryValue ) )
            // InternalDsl.g:1152:2: ( ruleEntryValue )
            {
            // InternalDsl.g:1152:2: ( ruleEntryValue )
            // InternalDsl.g:1153:3: ruleEntryValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryAccess().getValueEntryValueParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEntryValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryAccess().getValueEntryValueParserRuleCall_5_0()); 
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


    // $ANTLR start "rule__EntryValue__EntryLinesAssignment_1"
    // InternalDsl.g:1162:1: rule__EntryValue__EntryLinesAssignment_1 : ( ruleENTRYVALUE_LINE ) ;
    public final void rule__EntryValue__EntryLinesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1166:1: ( ( ruleENTRYVALUE_LINE ) )
            // InternalDsl.g:1167:2: ( ruleENTRYVALUE_LINE )
            {
            // InternalDsl.g:1167:2: ( ruleENTRYVALUE_LINE )
            // InternalDsl.g:1168:3: ruleENTRYVALUE_LINE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getEntryLinesENTRYVALUE_LINEParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleENTRYVALUE_LINE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryValueAccess().getEntryLinesENTRYVALUE_LINEParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__EntryValue__EntryLinesAssignment_1"


    // $ANTLR start "rule__EntryValue__EntryLinesAssignment_2_1_0_1"
    // InternalDsl.g:1177:1: rule__EntryValue__EntryLinesAssignment_2_1_0_1 : ( ruleENTRYVALUE_LINE ) ;
    public final void rule__EntryValue__EntryLinesAssignment_2_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1181:1: ( ( ruleENTRYVALUE_LINE ) )
            // InternalDsl.g:1182:2: ( ruleENTRYVALUE_LINE )
            {
            // InternalDsl.g:1182:2: ( ruleENTRYVALUE_LINE )
            // InternalDsl.g:1183:3: ruleENTRYVALUE_LINE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getEntryLinesENTRYVALUE_LINEParserRuleCall_2_1_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleENTRYVALUE_LINE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryValueAccess().getEntryLinesENTRYVALUE_LINEParserRuleCall_2_1_0_1_0()); 
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
    // $ANTLR end "rule__EntryValue__EntryLinesAssignment_2_1_0_1"


    // $ANTLR start "rule__EntryValue__EntryLinesAssignment_2_1_1_1"
    // InternalDsl.g:1192:1: rule__EntryValue__EntryLinesAssignment_2_1_1_1 : ( ruleENTRYVALUE_LINE ) ;
    public final void rule__EntryValue__EntryLinesAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1196:1: ( ( ruleENTRYVALUE_LINE ) )
            // InternalDsl.g:1197:2: ( ruleENTRYVALUE_LINE )
            {
            // InternalDsl.g:1197:2: ( ruleENTRYVALUE_LINE )
            // InternalDsl.g:1198:3: ruleENTRYVALUE_LINE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getEntryLinesENTRYVALUE_LINEParserRuleCall_2_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleENTRYVALUE_LINE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryValueAccess().getEntryLinesENTRYVALUE_LINEParserRuleCall_2_1_1_1_0()); 
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
    // $ANTLR end "rule__EntryValue__EntryLinesAssignment_2_1_1_1"


    // $ANTLR start "rule__EntryValue__EntryLinesAssignment_2_1_2_2"
    // InternalDsl.g:1207:1: rule__EntryValue__EntryLinesAssignment_2_1_2_2 : ( ruleENTRYVALUE_LINE ) ;
    public final void rule__EntryValue__EntryLinesAssignment_2_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1211:1: ( ( ruleENTRYVALUE_LINE ) )
            // InternalDsl.g:1212:2: ( ruleENTRYVALUE_LINE )
            {
            // InternalDsl.g:1212:2: ( ruleENTRYVALUE_LINE )
            // InternalDsl.g:1213:3: ruleENTRYVALUE_LINE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getEntryLinesENTRYVALUE_LINEParserRuleCall_2_1_2_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleENTRYVALUE_LINE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryValueAccess().getEntryLinesENTRYVALUE_LINEParserRuleCall_2_1_2_2_0()); 
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
    // $ANTLR end "rule__EntryValue__EntryLinesAssignment_2_1_2_2"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\6\uffff";
    static final String dfa_2s = "\1\15\1\6\1\uffff\1\6\2\uffff";
    static final String dfa_3s = "\2\16\1\uffff\1\16\2\uffff";
    static final String dfa_4s = "\2\uffff\1\2\1\uffff\1\3\1\1";
    static final String dfa_5s = "\6\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2",
            "\2\4\1\3\5\uffff\1\5",
            "",
            "\2\4\1\3\5\uffff\1\5",
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
            return "205:1: rule__EntryValue__Alternatives_2_1 : ( ( ( rule__EntryValue__Group_2_1_0__0 ) ) | ( ( rule__EntryValue__Group_2_1_1__0 ) ) | ( ( rule__EntryValue__Group_2_1_2__0 ) ) );";
        }
    }
    static final String dfa_7s = "\4\uffff";
    static final String dfa_8s = "\1\1\3\uffff";
    static final String dfa_9s = "\1\4\1\uffff\1\6\1\uffff";
    static final String dfa_10s = "\1\16\1\uffff\1\16\1\uffff";
    static final String dfa_11s = "\1\uffff\1\2\1\uffff\1\1";
    static final String dfa_12s = "\4\uffff}>";
    static final String[] dfa_13s = {
            "\3\1\1\uffff\1\2\2\uffff\2\1\2\3",
            "",
            "\1\1\1\uffff\1\2\4\uffff\2\3",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 649:2: ( rule__EntryValue__Group_2__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000170L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000172L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000001C0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000006100L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000006102L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004100L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});

}