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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LINE_START", "RULE_SL_COMMENT", "RULE_WS", "RULE_ENTRYKEY", "RULE_STRING", "RULE_SPECIAL_CHAR", "RULE_SEPARATOR", "RULE_ANY_OTHER", "'\\r'", "'\\n'", "','", "'\\\\'"
    };
    public static final int RULE_SPECIAL_CHAR=9;
    public static final int RULE_WS=6;
    public static final int RULE_STRING=8;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SEPARATOR=10;
    public static final int RULE_SL_COMMENT=5;
    public static final int T__15=15;
    public static final int RULE_ENTRYKEY=7;
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
    // InternalDsl.g:138:1: ruleENTRYVALUE_LINE : ( ( rule__ENTRYVALUE_LINE__Group__0 ) ) ;
    public final void ruleENTRYVALUE_LINE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:142:2: ( ( ( rule__ENTRYVALUE_LINE__Group__0 ) ) )
            // InternalDsl.g:143:2: ( ( rule__ENTRYVALUE_LINE__Group__0 ) )
            {
            // InternalDsl.g:143:2: ( ( rule__ENTRYVALUE_LINE__Group__0 ) )
            // InternalDsl.g:144:3: ( rule__ENTRYVALUE_LINE__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENTRYVALUE_LINEAccess().getGroup()); 
            }
            // InternalDsl.g:145:3: ( rule__ENTRYVALUE_LINE__Group__0 )
            // InternalDsl.g:145:4: rule__ENTRYVALUE_LINE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ENTRYVALUE_LINE__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENTRYVALUE_LINEAccess().getGroup()); 
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
            case RULE_WS:
            case RULE_ENTRYKEY:
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
    // InternalDsl.g:205:1: rule__EntryValue__Alternatives_2_1 : ( ( ( rule__EntryValue__Group_2_1_0__0 ) ) | ( ( rule__EntryValue__Group_2_1_1__0 ) ) );
    public final void rule__EntryValue__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:209:1: ( ( ( rule__EntryValue__Group_2_1_0__0 ) ) | ( ( rule__EntryValue__Group_2_1_1__0 ) ) )
            int alt2=2;
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

            }
        }
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


    // $ANTLR start "rule__ENTRYVALUE_LINE__Alternatives_0_1"
    // InternalDsl.g:226:1: rule__ENTRYVALUE_LINE__Alternatives_0_1 : ( ( ( rule__ENTRYVALUE_LINE__Group_0_1_0__0 ) ) | ( ( RULE_WS )* ) );
    public final void rule__ENTRYVALUE_LINE__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:230:1: ( ( ( rule__ENTRYVALUE_LINE__Group_0_1_0__0 ) ) | ( ( RULE_WS )* ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:231:2: ( ( rule__ENTRYVALUE_LINE__Group_0_1_0__0 ) )
                    {
                    // InternalDsl.g:231:2: ( ( rule__ENTRYVALUE_LINE__Group_0_1_0__0 ) )
                    // InternalDsl.g:232:3: ( rule__ENTRYVALUE_LINE__Group_0_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getENTRYVALUE_LINEAccess().getGroup_0_1_0()); 
                    }
                    // InternalDsl.g:233:3: ( rule__ENTRYVALUE_LINE__Group_0_1_0__0 )
                    // InternalDsl.g:233:4: rule__ENTRYVALUE_LINE__Group_0_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ENTRYVALUE_LINE__Group_0_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getENTRYVALUE_LINEAccess().getGroup_0_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:237:2: ( ( RULE_WS )* )
                    {
                    // InternalDsl.g:237:2: ( ( RULE_WS )* )
                    // InternalDsl.g:238:3: ( RULE_WS )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getENTRYVALUE_LINEAccess().getWSTerminalRuleCall_0_1_1()); 
                    }
                    // InternalDsl.g:239:3: ( RULE_WS )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_WS) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalDsl.g:239:4: RULE_WS
                    	    {
                    	    match(input,RULE_WS,FOLLOW_3); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getENTRYVALUE_LINEAccess().getWSTerminalRuleCall_0_1_1()); 
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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Alternatives_0_1"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Alternatives_1"
    // InternalDsl.g:247:1: rule__ENTRYVALUE_LINE__Alternatives_1 : ( ( RULE_ENTRYKEY ) | ( RULE_STRING ) );
    public final void rule__ENTRYVALUE_LINE__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:251:1: ( ( RULE_ENTRYKEY ) | ( RULE_STRING ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ENTRYKEY) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
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
                    // InternalDsl.g:252:2: ( RULE_ENTRYKEY )
                    {
                    // InternalDsl.g:252:2: ( RULE_ENTRYKEY )
                    // InternalDsl.g:253:3: RULE_ENTRYKEY
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getENTRYVALUE_LINEAccess().getENTRYKEYTerminalRuleCall_1_0()); 
                    }
                    match(input,RULE_ENTRYKEY,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getENTRYVALUE_LINEAccess().getENTRYKEYTerminalRuleCall_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:258:2: ( RULE_STRING )
                    {
                    // InternalDsl.g:258:2: ( RULE_STRING )
                    // InternalDsl.g:259:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getENTRYVALUE_LINEAccess().getSTRINGTerminalRuleCall_1_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getENTRYVALUE_LINEAccess().getSTRINGTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Alternatives_1"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Alternatives_2_0"
    // InternalDsl.g:268:1: rule__ENTRYVALUE_LINE__Alternatives_2_0 : ( ( RULE_WS ) | ( RULE_SPECIAL_CHAR ) );
    public final void rule__ENTRYVALUE_LINE__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:272:1: ( ( RULE_WS ) | ( RULE_SPECIAL_CHAR ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_WS) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_SPECIAL_CHAR) ) {
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
                    // InternalDsl.g:273:2: ( RULE_WS )
                    {
                    // InternalDsl.g:273:2: ( RULE_WS )
                    // InternalDsl.g:274:3: RULE_WS
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getENTRYVALUE_LINEAccess().getWSTerminalRuleCall_2_0_0()); 
                    }
                    match(input,RULE_WS,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getENTRYVALUE_LINEAccess().getWSTerminalRuleCall_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:279:2: ( RULE_SPECIAL_CHAR )
                    {
                    // InternalDsl.g:279:2: ( RULE_SPECIAL_CHAR )
                    // InternalDsl.g:280:3: RULE_SPECIAL_CHAR
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getENTRYVALUE_LINEAccess().getSPECIAL_CHARTerminalRuleCall_2_0_1()); 
                    }
                    match(input,RULE_SPECIAL_CHAR,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getENTRYVALUE_LINEAccess().getSPECIAL_CHARTerminalRuleCall_2_0_1()); 
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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Alternatives_2_0"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Alternatives_2_1"
    // InternalDsl.g:289:1: rule__ENTRYVALUE_LINE__Alternatives_2_1 : ( ( RULE_ENTRYKEY ) | ( RULE_STRING ) );
    public final void rule__ENTRYVALUE_LINE__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:293:1: ( ( RULE_ENTRYKEY ) | ( RULE_STRING ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ENTRYKEY) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRING) ) {
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
                    // InternalDsl.g:294:2: ( RULE_ENTRYKEY )
                    {
                    // InternalDsl.g:294:2: ( RULE_ENTRYKEY )
                    // InternalDsl.g:295:3: RULE_ENTRYKEY
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getENTRYVALUE_LINEAccess().getENTRYKEYTerminalRuleCall_2_1_0()); 
                    }
                    match(input,RULE_ENTRYKEY,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getENTRYVALUE_LINEAccess().getENTRYKEYTerminalRuleCall_2_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:300:2: ( RULE_STRING )
                    {
                    // InternalDsl.g:300:2: ( RULE_STRING )
                    // InternalDsl.g:301:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getENTRYVALUE_LINEAccess().getSTRINGTerminalRuleCall_2_1_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getENTRYVALUE_LINEAccess().getSTRINGTerminalRuleCall_2_1_1()); 
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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Alternatives_2_1"


    // $ANTLR start "rule__Dsl__Group__0"
    // InternalDsl.g:310:1: rule__Dsl__Group__0 : rule__Dsl__Group__0__Impl rule__Dsl__Group__1 ;
    public final void rule__Dsl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:314:1: ( rule__Dsl__Group__0__Impl rule__Dsl__Group__1 )
            // InternalDsl.g:315:2: rule__Dsl__Group__0__Impl rule__Dsl__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalDsl.g:322:1: rule__Dsl__Group__0__Impl : ( () ) ;
    public final void rule__Dsl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:326:1: ( ( () ) )
            // InternalDsl.g:327:1: ( () )
            {
            // InternalDsl.g:327:1: ( () )
            // InternalDsl.g:328:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getDslAction_0()); 
            }
            // InternalDsl.g:329:2: ()
            // InternalDsl.g:329:3: 
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
    // InternalDsl.g:337:1: rule__Dsl__Group__1 : rule__Dsl__Group__1__Impl ;
    public final void rule__Dsl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:341:1: ( rule__Dsl__Group__1__Impl )
            // InternalDsl.g:342:2: rule__Dsl__Group__1__Impl
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
    // InternalDsl.g:348:1: rule__Dsl__Group__1__Impl : ( ( rule__Dsl__Group_1__0 )* ) ;
    public final void rule__Dsl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:352:1: ( ( ( rule__Dsl__Group_1__0 )* ) )
            // InternalDsl.g:353:1: ( ( rule__Dsl__Group_1__0 )* )
            {
            // InternalDsl.g:353:1: ( ( rule__Dsl__Group_1__0 )* )
            // InternalDsl.g:354:2: ( rule__Dsl__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getGroup_1()); 
            }
            // InternalDsl.g:355:2: ( rule__Dsl__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_LINE_START && LA8_0<=RULE_ENTRYKEY)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:355:3: rule__Dsl__Group_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Dsl__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalDsl.g:364:1: rule__Dsl__Group_1__0 : rule__Dsl__Group_1__0__Impl rule__Dsl__Group_1__1 ;
    public final void rule__Dsl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:368:1: ( rule__Dsl__Group_1__0__Impl rule__Dsl__Group_1__1 )
            // InternalDsl.g:369:2: rule__Dsl__Group_1__0__Impl rule__Dsl__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalDsl.g:376:1: rule__Dsl__Group_1__0__Impl : ( ( rule__Dsl__Alternatives_1_0 ) ) ;
    public final void rule__Dsl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:380:1: ( ( ( rule__Dsl__Alternatives_1_0 ) ) )
            // InternalDsl.g:381:1: ( ( rule__Dsl__Alternatives_1_0 ) )
            {
            // InternalDsl.g:381:1: ( ( rule__Dsl__Alternatives_1_0 ) )
            // InternalDsl.g:382:2: ( rule__Dsl__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getAlternatives_1_0()); 
            }
            // InternalDsl.g:383:2: ( rule__Dsl__Alternatives_1_0 )
            // InternalDsl.g:383:3: rule__Dsl__Alternatives_1_0
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
    // InternalDsl.g:391:1: rule__Dsl__Group_1__1 : rule__Dsl__Group_1__1__Impl ;
    public final void rule__Dsl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:395:1: ( rule__Dsl__Group_1__1__Impl )
            // InternalDsl.g:396:2: rule__Dsl__Group_1__1__Impl
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
    // InternalDsl.g:402:1: rule__Dsl__Group_1__1__Impl : ( ( rule__Dsl__Group_1_1__0 )* ) ;
    public final void rule__Dsl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:406:1: ( ( ( rule__Dsl__Group_1_1__0 )* ) )
            // InternalDsl.g:407:1: ( ( rule__Dsl__Group_1_1__0 )* )
            {
            // InternalDsl.g:407:1: ( ( rule__Dsl__Group_1_1__0 )* )
            // InternalDsl.g:408:2: ( rule__Dsl__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getGroup_1_1()); 
            }
            // InternalDsl.g:409:2: ( rule__Dsl__Group_1_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=12 && LA9_0<=13)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:409:3: rule__Dsl__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Dsl__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalDsl.g:418:1: rule__Dsl__Group_1_1__0 : rule__Dsl__Group_1_1__0__Impl rule__Dsl__Group_1_1__1 ;
    public final void rule__Dsl__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:422:1: ( rule__Dsl__Group_1_1__0__Impl rule__Dsl__Group_1_1__1 )
            // InternalDsl.g:423:2: rule__Dsl__Group_1_1__0__Impl rule__Dsl__Group_1_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalDsl.g:430:1: rule__Dsl__Group_1_1__0__Impl : ( ( '\\r' )? ) ;
    public final void rule__Dsl__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:434:1: ( ( ( '\\r' )? ) )
            // InternalDsl.g:435:1: ( ( '\\r' )? )
            {
            // InternalDsl.g:435:1: ( ( '\\r' )? )
            // InternalDsl.g:436:2: ( '\\r' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getCarriageReturnKeyword_1_1_0()); 
            }
            // InternalDsl.g:437:2: ( '\\r' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:437:3: '\\r'
                    {
                    match(input,12,FOLLOW_2); if (state.failed) return ;

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
    // InternalDsl.g:445:1: rule__Dsl__Group_1_1__1 : rule__Dsl__Group_1_1__1__Impl ;
    public final void rule__Dsl__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:449:1: ( rule__Dsl__Group_1_1__1__Impl )
            // InternalDsl.g:450:2: rule__Dsl__Group_1_1__1__Impl
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
    // InternalDsl.g:456:1: rule__Dsl__Group_1_1__1__Impl : ( '\\n' ) ;
    public final void rule__Dsl__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:460:1: ( ( '\\n' ) )
            // InternalDsl.g:461:1: ( '\\n' )
            {
            // InternalDsl.g:461:1: ( '\\n' )
            // InternalDsl.g:462:2: '\\n'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDslAccess().getLineFeedKeyword_1_1_1()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
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
    // InternalDsl.g:472:1: rule__Entry__Group__0 : rule__Entry__Group__0__Impl rule__Entry__Group__1 ;
    public final void rule__Entry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:476:1: ( rule__Entry__Group__0__Impl rule__Entry__Group__1 )
            // InternalDsl.g:477:2: rule__Entry__Group__0__Impl rule__Entry__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:484:1: rule__Entry__Group__0__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Entry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:488:1: ( ( ( RULE_WS )* ) )
            // InternalDsl.g:489:1: ( ( RULE_WS )* )
            {
            // InternalDsl.g:489:1: ( ( RULE_WS )* )
            // InternalDsl.g:490:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_0()); 
            }
            // InternalDsl.g:491:2: ( RULE_WS )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_WS) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:491:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_3); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalDsl.g:499:1: rule__Entry__Group__1 : rule__Entry__Group__1__Impl rule__Entry__Group__2 ;
    public final void rule__Entry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:503:1: ( rule__Entry__Group__1__Impl rule__Entry__Group__2 )
            // InternalDsl.g:504:2: rule__Entry__Group__1__Impl rule__Entry__Group__2
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
    // InternalDsl.g:511:1: rule__Entry__Group__1__Impl : ( ( rule__Entry__KeyAssignment_1 ) ) ;
    public final void rule__Entry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:515:1: ( ( ( rule__Entry__KeyAssignment_1 ) ) )
            // InternalDsl.g:516:1: ( ( rule__Entry__KeyAssignment_1 ) )
            {
            // InternalDsl.g:516:1: ( ( rule__Entry__KeyAssignment_1 ) )
            // InternalDsl.g:517:2: ( rule__Entry__KeyAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryAccess().getKeyAssignment_1()); 
            }
            // InternalDsl.g:518:2: ( rule__Entry__KeyAssignment_1 )
            // InternalDsl.g:518:3: rule__Entry__KeyAssignment_1
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
    // InternalDsl.g:526:1: rule__Entry__Group__2 : rule__Entry__Group__2__Impl rule__Entry__Group__3 ;
    public final void rule__Entry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:530:1: ( rule__Entry__Group__2__Impl rule__Entry__Group__3 )
            // InternalDsl.g:531:2: rule__Entry__Group__2__Impl rule__Entry__Group__3
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
    // InternalDsl.g:538:1: rule__Entry__Group__2__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Entry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:542:1: ( ( ( RULE_WS )* ) )
            // InternalDsl.g:543:1: ( ( RULE_WS )* )
            {
            // InternalDsl.g:543:1: ( ( RULE_WS )* )
            // InternalDsl.g:544:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_2()); 
            }
            // InternalDsl.g:545:2: ( RULE_WS )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_WS) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:545:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_3); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalDsl.g:553:1: rule__Entry__Group__3 : rule__Entry__Group__3__Impl rule__Entry__Group__4 ;
    public final void rule__Entry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:557:1: ( rule__Entry__Group__3__Impl rule__Entry__Group__4 )
            // InternalDsl.g:558:2: rule__Entry__Group__3__Impl rule__Entry__Group__4
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
    // InternalDsl.g:565:1: rule__Entry__Group__3__Impl : ( RULE_SEPARATOR ) ;
    public final void rule__Entry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:569:1: ( ( RULE_SEPARATOR ) )
            // InternalDsl.g:570:1: ( RULE_SEPARATOR )
            {
            // InternalDsl.g:570:1: ( RULE_SEPARATOR )
            // InternalDsl.g:571:2: RULE_SEPARATOR
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
    // InternalDsl.g:580:1: rule__Entry__Group__4 : rule__Entry__Group__4__Impl rule__Entry__Group__5 ;
    public final void rule__Entry__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:584:1: ( rule__Entry__Group__4__Impl rule__Entry__Group__5 )
            // InternalDsl.g:585:2: rule__Entry__Group__4__Impl rule__Entry__Group__5
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
    // InternalDsl.g:592:1: rule__Entry__Group__4__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Entry__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:596:1: ( ( ( RULE_WS )* ) )
            // InternalDsl.g:597:1: ( ( RULE_WS )* )
            {
            // InternalDsl.g:597:1: ( ( RULE_WS )* )
            // InternalDsl.g:598:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_4()); 
            }
            // InternalDsl.g:599:2: ( RULE_WS )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_WS) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:599:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_3); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalDsl.g:607:1: rule__Entry__Group__5 : rule__Entry__Group__5__Impl ;
    public final void rule__Entry__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:611:1: ( rule__Entry__Group__5__Impl )
            // InternalDsl.g:612:2: rule__Entry__Group__5__Impl
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
    // InternalDsl.g:618:1: rule__Entry__Group__5__Impl : ( ( rule__Entry__ValueAssignment_5 ) ) ;
    public final void rule__Entry__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:622:1: ( ( ( rule__Entry__ValueAssignment_5 ) ) )
            // InternalDsl.g:623:1: ( ( rule__Entry__ValueAssignment_5 ) )
            {
            // InternalDsl.g:623:1: ( ( rule__Entry__ValueAssignment_5 ) )
            // InternalDsl.g:624:2: ( rule__Entry__ValueAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryAccess().getValueAssignment_5()); 
            }
            // InternalDsl.g:625:2: ( rule__Entry__ValueAssignment_5 )
            // InternalDsl.g:625:3: rule__Entry__ValueAssignment_5
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
    // InternalDsl.g:634:1: rule__EntryValue__Group__0 : rule__EntryValue__Group__0__Impl rule__EntryValue__Group__1 ;
    public final void rule__EntryValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:638:1: ( rule__EntryValue__Group__0__Impl rule__EntryValue__Group__1 )
            // InternalDsl.g:639:2: rule__EntryValue__Group__0__Impl rule__EntryValue__Group__1
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
    // InternalDsl.g:646:1: rule__EntryValue__Group__0__Impl : ( () ) ;
    public final void rule__EntryValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:650:1: ( ( () ) )
            // InternalDsl.g:651:1: ( () )
            {
            // InternalDsl.g:651:1: ( () )
            // InternalDsl.g:652:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getEntryValueAction_0()); 
            }
            // InternalDsl.g:653:2: ()
            // InternalDsl.g:653:3: 
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
    // InternalDsl.g:661:1: rule__EntryValue__Group__1 : rule__EntryValue__Group__1__Impl rule__EntryValue__Group__2 ;
    public final void rule__EntryValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:665:1: ( rule__EntryValue__Group__1__Impl rule__EntryValue__Group__2 )
            // InternalDsl.g:666:2: rule__EntryValue__Group__1__Impl rule__EntryValue__Group__2
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
    // InternalDsl.g:673:1: rule__EntryValue__Group__1__Impl : ( ( rule__EntryValue__EntryLinesAssignment_1 ) ) ;
    public final void rule__EntryValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:677:1: ( ( ( rule__EntryValue__EntryLinesAssignment_1 ) ) )
            // InternalDsl.g:678:1: ( ( rule__EntryValue__EntryLinesAssignment_1 ) )
            {
            // InternalDsl.g:678:1: ( ( rule__EntryValue__EntryLinesAssignment_1 ) )
            // InternalDsl.g:679:2: ( rule__EntryValue__EntryLinesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getEntryLinesAssignment_1()); 
            }
            // InternalDsl.g:680:2: ( rule__EntryValue__EntryLinesAssignment_1 )
            // InternalDsl.g:680:3: rule__EntryValue__EntryLinesAssignment_1
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
    // InternalDsl.g:688:1: rule__EntryValue__Group__2 : rule__EntryValue__Group__2__Impl ;
    public final void rule__EntryValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:692:1: ( rule__EntryValue__Group__2__Impl )
            // InternalDsl.g:693:2: rule__EntryValue__Group__2__Impl
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
    // InternalDsl.g:699:1: rule__EntryValue__Group__2__Impl : ( ( rule__EntryValue__Group_2__0 )* ) ;
    public final void rule__EntryValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:703:1: ( ( ( rule__EntryValue__Group_2__0 )* ) )
            // InternalDsl.g:704:1: ( ( rule__EntryValue__Group_2__0 )* )
            {
            // InternalDsl.g:704:1: ( ( rule__EntryValue__Group_2__0 )* )
            // InternalDsl.g:705:2: ( rule__EntryValue__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getGroup_2()); 
            }
            // InternalDsl.g:706:2: ( rule__EntryValue__Group_2__0 )*
            loop14:
            do {
                int alt14=2;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:706:3: rule__EntryValue__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__EntryValue__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalDsl.g:715:1: rule__EntryValue__Group_2__0 : rule__EntryValue__Group_2__0__Impl rule__EntryValue__Group_2__1 ;
    public final void rule__EntryValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:719:1: ( rule__EntryValue__Group_2__0__Impl rule__EntryValue__Group_2__1 )
            // InternalDsl.g:720:2: rule__EntryValue__Group_2__0__Impl rule__EntryValue__Group_2__1
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
    // InternalDsl.g:727:1: rule__EntryValue__Group_2__0__Impl : ( ( RULE_WS )* ) ;
    public final void rule__EntryValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:731:1: ( ( ( RULE_WS )* ) )
            // InternalDsl.g:732:1: ( ( RULE_WS )* )
            {
            // InternalDsl.g:732:1: ( ( RULE_WS )* )
            // InternalDsl.g:733:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getWSTerminalRuleCall_2_0()); 
            }
            // InternalDsl.g:734:2: ( RULE_WS )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_WS) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDsl.g:734:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_3); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalDsl.g:742:1: rule__EntryValue__Group_2__1 : rule__EntryValue__Group_2__1__Impl ;
    public final void rule__EntryValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:746:1: ( rule__EntryValue__Group_2__1__Impl )
            // InternalDsl.g:747:2: rule__EntryValue__Group_2__1__Impl
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
    // InternalDsl.g:753:1: rule__EntryValue__Group_2__1__Impl : ( ( rule__EntryValue__Alternatives_2_1 ) ) ;
    public final void rule__EntryValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:757:1: ( ( ( rule__EntryValue__Alternatives_2_1 ) ) )
            // InternalDsl.g:758:1: ( ( rule__EntryValue__Alternatives_2_1 ) )
            {
            // InternalDsl.g:758:1: ( ( rule__EntryValue__Alternatives_2_1 ) )
            // InternalDsl.g:759:2: ( rule__EntryValue__Alternatives_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getAlternatives_2_1()); 
            }
            // InternalDsl.g:760:2: ( rule__EntryValue__Alternatives_2_1 )
            // InternalDsl.g:760:3: rule__EntryValue__Alternatives_2_1
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
    // InternalDsl.g:769:1: rule__EntryValue__Group_2_1_0__0 : rule__EntryValue__Group_2_1_0__0__Impl rule__EntryValue__Group_2_1_0__1 ;
    public final void rule__EntryValue__Group_2_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:773:1: ( rule__EntryValue__Group_2_1_0__0__Impl rule__EntryValue__Group_2_1_0__1 )
            // InternalDsl.g:774:2: rule__EntryValue__Group_2_1_0__0__Impl rule__EntryValue__Group_2_1_0__1
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
    // InternalDsl.g:781:1: rule__EntryValue__Group_2_1_0__0__Impl : ( ( rule__EntryValue__Group_2_1_0_0__0 ) ) ;
    public final void rule__EntryValue__Group_2_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:785:1: ( ( ( rule__EntryValue__Group_2_1_0_0__0 ) ) )
            // InternalDsl.g:786:1: ( ( rule__EntryValue__Group_2_1_0_0__0 ) )
            {
            // InternalDsl.g:786:1: ( ( rule__EntryValue__Group_2_1_0_0__0 ) )
            // InternalDsl.g:787:2: ( rule__EntryValue__Group_2_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getGroup_2_1_0_0()); 
            }
            // InternalDsl.g:788:2: ( rule__EntryValue__Group_2_1_0_0__0 )
            // InternalDsl.g:788:3: rule__EntryValue__Group_2_1_0_0__0
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
    // InternalDsl.g:796:1: rule__EntryValue__Group_2_1_0__1 : rule__EntryValue__Group_2_1_0__1__Impl ;
    public final void rule__EntryValue__Group_2_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:800:1: ( rule__EntryValue__Group_2_1_0__1__Impl )
            // InternalDsl.g:801:2: rule__EntryValue__Group_2_1_0__1__Impl
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
    // InternalDsl.g:807:1: rule__EntryValue__Group_2_1_0__1__Impl : ( ( rule__EntryValue__EntryLinesAssignment_2_1_0_1 ) ) ;
    public final void rule__EntryValue__Group_2_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:811:1: ( ( ( rule__EntryValue__EntryLinesAssignment_2_1_0_1 ) ) )
            // InternalDsl.g:812:1: ( ( rule__EntryValue__EntryLinesAssignment_2_1_0_1 ) )
            {
            // InternalDsl.g:812:1: ( ( rule__EntryValue__EntryLinesAssignment_2_1_0_1 ) )
            // InternalDsl.g:813:2: ( rule__EntryValue__EntryLinesAssignment_2_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getEntryLinesAssignment_2_1_0_1()); 
            }
            // InternalDsl.g:814:2: ( rule__EntryValue__EntryLinesAssignment_2_1_0_1 )
            // InternalDsl.g:814:3: rule__EntryValue__EntryLinesAssignment_2_1_0_1
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
    // InternalDsl.g:823:1: rule__EntryValue__Group_2_1_0_0__0 : rule__EntryValue__Group_2_1_0_0__0__Impl ;
    public final void rule__EntryValue__Group_2_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:827:1: ( rule__EntryValue__Group_2_1_0_0__0__Impl )
            // InternalDsl.g:828:2: rule__EntryValue__Group_2_1_0_0__0__Impl
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
    // InternalDsl.g:834:1: rule__EntryValue__Group_2_1_0_0__0__Impl : ( ( rule__EntryValue__Group_2_1_0_0_0__0 ) ) ;
    public final void rule__EntryValue__Group_2_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:838:1: ( ( ( rule__EntryValue__Group_2_1_0_0_0__0 ) ) )
            // InternalDsl.g:839:1: ( ( rule__EntryValue__Group_2_1_0_0_0__0 ) )
            {
            // InternalDsl.g:839:1: ( ( rule__EntryValue__Group_2_1_0_0_0__0 ) )
            // InternalDsl.g:840:2: ( rule__EntryValue__Group_2_1_0_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getGroup_2_1_0_0_0()); 
            }
            // InternalDsl.g:841:2: ( rule__EntryValue__Group_2_1_0_0_0__0 )
            // InternalDsl.g:841:3: rule__EntryValue__Group_2_1_0_0_0__0
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
    // InternalDsl.g:850:1: rule__EntryValue__Group_2_1_0_0_0__0 : rule__EntryValue__Group_2_1_0_0_0__0__Impl rule__EntryValue__Group_2_1_0_0_0__1 ;
    public final void rule__EntryValue__Group_2_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:854:1: ( rule__EntryValue__Group_2_1_0_0_0__0__Impl rule__EntryValue__Group_2_1_0_0_0__1 )
            // InternalDsl.g:855:2: rule__EntryValue__Group_2_1_0_0_0__0__Impl rule__EntryValue__Group_2_1_0_0_0__1
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
    // InternalDsl.g:862:1: rule__EntryValue__Group_2_1_0_0_0__0__Impl : ( ',' ) ;
    public final void rule__EntryValue__Group_2_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:866:1: ( ( ',' ) )
            // InternalDsl.g:867:1: ( ',' )
            {
            // InternalDsl.g:867:1: ( ',' )
            // InternalDsl.g:868:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getCommaKeyword_2_1_0_0_0_0()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
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
    // InternalDsl.g:877:1: rule__EntryValue__Group_2_1_0_0_0__1 : rule__EntryValue__Group_2_1_0_0_0__1__Impl rule__EntryValue__Group_2_1_0_0_0__2 ;
    public final void rule__EntryValue__Group_2_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:881:1: ( rule__EntryValue__Group_2_1_0_0_0__1__Impl rule__EntryValue__Group_2_1_0_0_0__2 )
            // InternalDsl.g:882:2: rule__EntryValue__Group_2_1_0_0_0__1__Impl rule__EntryValue__Group_2_1_0_0_0__2
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
    // InternalDsl.g:889:1: rule__EntryValue__Group_2_1_0_0_0__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__EntryValue__Group_2_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:893:1: ( ( ( RULE_WS )* ) )
            // InternalDsl.g:894:1: ( ( RULE_WS )* )
            {
            // InternalDsl.g:894:1: ( ( RULE_WS )* )
            // InternalDsl.g:895:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getWSTerminalRuleCall_2_1_0_0_0_1()); 
            }
            // InternalDsl.g:896:2: ( RULE_WS )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_WS) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDsl.g:896:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_3); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalDsl.g:904:1: rule__EntryValue__Group_2_1_0_0_0__2 : rule__EntryValue__Group_2_1_0_0_0__2__Impl rule__EntryValue__Group_2_1_0_0_0__3 ;
    public final void rule__EntryValue__Group_2_1_0_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:908:1: ( rule__EntryValue__Group_2_1_0_0_0__2__Impl rule__EntryValue__Group_2_1_0_0_0__3 )
            // InternalDsl.g:909:2: rule__EntryValue__Group_2_1_0_0_0__2__Impl rule__EntryValue__Group_2_1_0_0_0__3
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
    // InternalDsl.g:916:1: rule__EntryValue__Group_2_1_0_0_0__2__Impl : ( '\\\\' ) ;
    public final void rule__EntryValue__Group_2_1_0_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:920:1: ( ( '\\\\' ) )
            // InternalDsl.g:921:1: ( '\\\\' )
            {
            // InternalDsl.g:921:1: ( '\\\\' )
            // InternalDsl.g:922:2: '\\\\'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getBackslashKeyword_2_1_0_0_0_2()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
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
    // InternalDsl.g:931:1: rule__EntryValue__Group_2_1_0_0_0__3 : rule__EntryValue__Group_2_1_0_0_0__3__Impl ;
    public final void rule__EntryValue__Group_2_1_0_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:935:1: ( rule__EntryValue__Group_2_1_0_0_0__3__Impl )
            // InternalDsl.g:936:2: rule__EntryValue__Group_2_1_0_0_0__3__Impl
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
    // InternalDsl.g:942:1: rule__EntryValue__Group_2_1_0_0_0__3__Impl : ( RULE_LINE_START ) ;
    public final void rule__EntryValue__Group_2_1_0_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:946:1: ( ( RULE_LINE_START ) )
            // InternalDsl.g:947:1: ( RULE_LINE_START )
            {
            // InternalDsl.g:947:1: ( RULE_LINE_START )
            // InternalDsl.g:948:2: RULE_LINE_START
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
    // InternalDsl.g:958:1: rule__EntryValue__Group_2_1_1__0 : rule__EntryValue__Group_2_1_1__0__Impl rule__EntryValue__Group_2_1_1__1 ;
    public final void rule__EntryValue__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:962:1: ( rule__EntryValue__Group_2_1_1__0__Impl rule__EntryValue__Group_2_1_1__1 )
            // InternalDsl.g:963:2: rule__EntryValue__Group_2_1_1__0__Impl rule__EntryValue__Group_2_1_1__1
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
    // InternalDsl.g:970:1: rule__EntryValue__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__EntryValue__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:974:1: ( ( ',' ) )
            // InternalDsl.g:975:1: ( ',' )
            {
            // InternalDsl.g:975:1: ( ',' )
            // InternalDsl.g:976:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getCommaKeyword_2_1_1_0()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryValueAccess().getCommaKeyword_2_1_1_0()); 
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
    // InternalDsl.g:985:1: rule__EntryValue__Group_2_1_1__1 : rule__EntryValue__Group_2_1_1__1__Impl rule__EntryValue__Group_2_1_1__2 ;
    public final void rule__EntryValue__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:989:1: ( rule__EntryValue__Group_2_1_1__1__Impl rule__EntryValue__Group_2_1_1__2 )
            // InternalDsl.g:990:2: rule__EntryValue__Group_2_1_1__1__Impl rule__EntryValue__Group_2_1_1__2
            {
            pushFollow(FOLLOW_10);
            rule__EntryValue__Group_2_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EntryValue__Group_2_1_1__2();

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
    // InternalDsl.g:997:1: rule__EntryValue__Group_2_1_1__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__EntryValue__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1001:1: ( ( ( RULE_WS )* ) )
            // InternalDsl.g:1002:1: ( ( RULE_WS )* )
            {
            // InternalDsl.g:1002:1: ( ( RULE_WS )* )
            // InternalDsl.g:1003:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getWSTerminalRuleCall_2_1_1_1()); 
            }
            // InternalDsl.g:1004:2: ( RULE_WS )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_WS) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDsl.g:1004:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_3); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryValueAccess().getWSTerminalRuleCall_2_1_1_1()); 
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


    // $ANTLR start "rule__EntryValue__Group_2_1_1__2"
    // InternalDsl.g:1012:1: rule__EntryValue__Group_2_1_1__2 : rule__EntryValue__Group_2_1_1__2__Impl ;
    public final void rule__EntryValue__Group_2_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1016:1: ( rule__EntryValue__Group_2_1_1__2__Impl )
            // InternalDsl.g:1017:2: rule__EntryValue__Group_2_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntryValue__Group_2_1_1__2__Impl();

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
    // $ANTLR end "rule__EntryValue__Group_2_1_1__2"


    // $ANTLR start "rule__EntryValue__Group_2_1_1__2__Impl"
    // InternalDsl.g:1023:1: rule__EntryValue__Group_2_1_1__2__Impl : ( ( rule__EntryValue__EntryLinesAssignment_2_1_1_2 ) ) ;
    public final void rule__EntryValue__Group_2_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1027:1: ( ( ( rule__EntryValue__EntryLinesAssignment_2_1_1_2 ) ) )
            // InternalDsl.g:1028:1: ( ( rule__EntryValue__EntryLinesAssignment_2_1_1_2 ) )
            {
            // InternalDsl.g:1028:1: ( ( rule__EntryValue__EntryLinesAssignment_2_1_1_2 ) )
            // InternalDsl.g:1029:2: ( rule__EntryValue__EntryLinesAssignment_2_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getEntryLinesAssignment_2_1_1_2()); 
            }
            // InternalDsl.g:1030:2: ( rule__EntryValue__EntryLinesAssignment_2_1_1_2 )
            // InternalDsl.g:1030:3: rule__EntryValue__EntryLinesAssignment_2_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EntryValue__EntryLinesAssignment_2_1_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryValueAccess().getEntryLinesAssignment_2_1_1_2()); 
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
    // $ANTLR end "rule__EntryValue__Group_2_1_1__2__Impl"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Group__0"
    // InternalDsl.g:1039:1: rule__ENTRYVALUE_LINE__Group__0 : rule__ENTRYVALUE_LINE__Group__0__Impl rule__ENTRYVALUE_LINE__Group__1 ;
    public final void rule__ENTRYVALUE_LINE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1043:1: ( rule__ENTRYVALUE_LINE__Group__0__Impl rule__ENTRYVALUE_LINE__Group__1 )
            // InternalDsl.g:1044:2: rule__ENTRYVALUE_LINE__Group__0__Impl rule__ENTRYVALUE_LINE__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ENTRYVALUE_LINE__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ENTRYVALUE_LINE__Group__1();

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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Group__0"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Group__0__Impl"
    // InternalDsl.g:1051:1: rule__ENTRYVALUE_LINE__Group__0__Impl : ( ( rule__ENTRYVALUE_LINE__Group_0__0 )? ) ;
    public final void rule__ENTRYVALUE_LINE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1055:1: ( ( ( rule__ENTRYVALUE_LINE__Group_0__0 )? ) )
            // InternalDsl.g:1056:1: ( ( rule__ENTRYVALUE_LINE__Group_0__0 )? )
            {
            // InternalDsl.g:1056:1: ( ( rule__ENTRYVALUE_LINE__Group_0__0 )? )
            // InternalDsl.g:1057:2: ( rule__ENTRYVALUE_LINE__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENTRYVALUE_LINEAccess().getGroup_0()); 
            }
            // InternalDsl.g:1058:2: ( rule__ENTRYVALUE_LINE__Group_0__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_SPECIAL_CHAR) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDsl.g:1058:3: rule__ENTRYVALUE_LINE__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ENTRYVALUE_LINE__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENTRYVALUE_LINEAccess().getGroup_0()); 
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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Group__0__Impl"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Group__1"
    // InternalDsl.g:1066:1: rule__ENTRYVALUE_LINE__Group__1 : rule__ENTRYVALUE_LINE__Group__1__Impl rule__ENTRYVALUE_LINE__Group__2 ;
    public final void rule__ENTRYVALUE_LINE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1070:1: ( rule__ENTRYVALUE_LINE__Group__1__Impl rule__ENTRYVALUE_LINE__Group__2 )
            // InternalDsl.g:1071:2: rule__ENTRYVALUE_LINE__Group__1__Impl rule__ENTRYVALUE_LINE__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ENTRYVALUE_LINE__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ENTRYVALUE_LINE__Group__2();

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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Group__1"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Group__1__Impl"
    // InternalDsl.g:1078:1: rule__ENTRYVALUE_LINE__Group__1__Impl : ( ( rule__ENTRYVALUE_LINE__Alternatives_1 ) ) ;
    public final void rule__ENTRYVALUE_LINE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1082:1: ( ( ( rule__ENTRYVALUE_LINE__Alternatives_1 ) ) )
            // InternalDsl.g:1083:1: ( ( rule__ENTRYVALUE_LINE__Alternatives_1 ) )
            {
            // InternalDsl.g:1083:1: ( ( rule__ENTRYVALUE_LINE__Alternatives_1 ) )
            // InternalDsl.g:1084:2: ( rule__ENTRYVALUE_LINE__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENTRYVALUE_LINEAccess().getAlternatives_1()); 
            }
            // InternalDsl.g:1085:2: ( rule__ENTRYVALUE_LINE__Alternatives_1 )
            // InternalDsl.g:1085:3: rule__ENTRYVALUE_LINE__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__ENTRYVALUE_LINE__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENTRYVALUE_LINEAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Group__1__Impl"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Group__2"
    // InternalDsl.g:1093:1: rule__ENTRYVALUE_LINE__Group__2 : rule__ENTRYVALUE_LINE__Group__2__Impl rule__ENTRYVALUE_LINE__Group__3 ;
    public final void rule__ENTRYVALUE_LINE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1097:1: ( rule__ENTRYVALUE_LINE__Group__2__Impl rule__ENTRYVALUE_LINE__Group__3 )
            // InternalDsl.g:1098:2: rule__ENTRYVALUE_LINE__Group__2__Impl rule__ENTRYVALUE_LINE__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__ENTRYVALUE_LINE__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ENTRYVALUE_LINE__Group__3();

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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Group__2"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Group__2__Impl"
    // InternalDsl.g:1105:1: rule__ENTRYVALUE_LINE__Group__2__Impl : ( ( rule__ENTRYVALUE_LINE__Group_2__0 )* ) ;
    public final void rule__ENTRYVALUE_LINE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1109:1: ( ( ( rule__ENTRYVALUE_LINE__Group_2__0 )* ) )
            // InternalDsl.g:1110:1: ( ( rule__ENTRYVALUE_LINE__Group_2__0 )* )
            {
            // InternalDsl.g:1110:1: ( ( rule__ENTRYVALUE_LINE__Group_2__0 )* )
            // InternalDsl.g:1111:2: ( rule__ENTRYVALUE_LINE__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENTRYVALUE_LINEAccess().getGroup_2()); 
            }
            // InternalDsl.g:1112:2: ( rule__ENTRYVALUE_LINE__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // InternalDsl.g:1112:3: rule__ENTRYVALUE_LINE__Group_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ENTRYVALUE_LINE__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENTRYVALUE_LINEAccess().getGroup_2()); 
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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Group__2__Impl"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Group__3"
    // InternalDsl.g:1120:1: rule__ENTRYVALUE_LINE__Group__3 : rule__ENTRYVALUE_LINE__Group__3__Impl ;
    public final void rule__ENTRYVALUE_LINE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1124:1: ( rule__ENTRYVALUE_LINE__Group__3__Impl )
            // InternalDsl.g:1125:2: rule__ENTRYVALUE_LINE__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ENTRYVALUE_LINE__Group__3__Impl();

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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Group__3"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Group__3__Impl"
    // InternalDsl.g:1131:1: rule__ENTRYVALUE_LINE__Group__3__Impl : ( ( rule__ENTRYVALUE_LINE__Group_3__0 )? ) ;
    public final void rule__ENTRYVALUE_LINE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1135:1: ( ( ( rule__ENTRYVALUE_LINE__Group_3__0 )? ) )
            // InternalDsl.g:1136:1: ( ( rule__ENTRYVALUE_LINE__Group_3__0 )? )
            {
            // InternalDsl.g:1136:1: ( ( rule__ENTRYVALUE_LINE__Group_3__0 )? )
            // InternalDsl.g:1137:2: ( rule__ENTRYVALUE_LINE__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENTRYVALUE_LINEAccess().getGroup_3()); 
            }
            // InternalDsl.g:1138:2: ( rule__ENTRYVALUE_LINE__Group_3__0 )?
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:1138:3: rule__ENTRYVALUE_LINE__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ENTRYVALUE_LINE__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENTRYVALUE_LINEAccess().getGroup_3()); 
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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Group__3__Impl"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Group_0__0"
    // InternalDsl.g:1147:1: rule__ENTRYVALUE_LINE__Group_0__0 : rule__ENTRYVALUE_LINE__Group_0__0__Impl rule__ENTRYVALUE_LINE__Group_0__1 ;
    public final void rule__ENTRYVALUE_LINE__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1151:1: ( rule__ENTRYVALUE_LINE__Group_0__0__Impl rule__ENTRYVALUE_LINE__Group_0__1 )
            // InternalDsl.g:1152:2: rule__ENTRYVALUE_LINE__Group_0__0__Impl rule__ENTRYVALUE_LINE__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__ENTRYVALUE_LINE__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ENTRYVALUE_LINE__Group_0__1();

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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Group_0__0"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Group_0__0__Impl"
    // InternalDsl.g:1159:1: rule__ENTRYVALUE_LINE__Group_0__0__Impl : ( ( ( RULE_SPECIAL_CHAR ) ) ( ( RULE_SPECIAL_CHAR )* ) ) ;
    public final void rule__ENTRYVALUE_LINE__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1163:1: ( ( ( ( RULE_SPECIAL_CHAR ) ) ( ( RULE_SPECIAL_CHAR )* ) ) )
            // InternalDsl.g:1164:1: ( ( ( RULE_SPECIAL_CHAR ) ) ( ( RULE_SPECIAL_CHAR )* ) )
            {
            // InternalDsl.g:1164:1: ( ( ( RULE_SPECIAL_CHAR ) ) ( ( RULE_SPECIAL_CHAR )* ) )
            // InternalDsl.g:1165:2: ( ( RULE_SPECIAL_CHAR ) ) ( ( RULE_SPECIAL_CHAR )* )
            {
            // InternalDsl.g:1165:2: ( ( RULE_SPECIAL_CHAR ) )
            // InternalDsl.g:1166:3: ( RULE_SPECIAL_CHAR )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENTRYVALUE_LINEAccess().getSPECIAL_CHARTerminalRuleCall_0_0()); 
            }
            // InternalDsl.g:1167:3: ( RULE_SPECIAL_CHAR )
            // InternalDsl.g:1167:4: RULE_SPECIAL_CHAR
            {
            match(input,RULE_SPECIAL_CHAR,FOLLOW_17); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENTRYVALUE_LINEAccess().getSPECIAL_CHARTerminalRuleCall_0_0()); 
            }

            }

            // InternalDsl.g:1170:2: ( ( RULE_SPECIAL_CHAR )* )
            // InternalDsl.g:1171:3: ( RULE_SPECIAL_CHAR )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENTRYVALUE_LINEAccess().getSPECIAL_CHARTerminalRuleCall_0_0()); 
            }
            // InternalDsl.g:1172:3: ( RULE_SPECIAL_CHAR )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_SPECIAL_CHAR) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDsl.g:1172:4: RULE_SPECIAL_CHAR
            	    {
            	    match(input,RULE_SPECIAL_CHAR,FOLLOW_17); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENTRYVALUE_LINEAccess().getSPECIAL_CHARTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Group_0__0__Impl"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Group_0__1"
    // InternalDsl.g:1181:1: rule__ENTRYVALUE_LINE__Group_0__1 : rule__ENTRYVALUE_LINE__Group_0__1__Impl ;
    public final void rule__ENTRYVALUE_LINE__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1185:1: ( rule__ENTRYVALUE_LINE__Group_0__1__Impl )
            // InternalDsl.g:1186:2: rule__ENTRYVALUE_LINE__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ENTRYVALUE_LINE__Group_0__1__Impl();

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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Group_0__1"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Group_0__1__Impl"
    // InternalDsl.g:1192:1: rule__ENTRYVALUE_LINE__Group_0__1__Impl : ( ( rule__ENTRYVALUE_LINE__Alternatives_0_1 ) ) ;
    public final void rule__ENTRYVALUE_LINE__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1196:1: ( ( ( rule__ENTRYVALUE_LINE__Alternatives_0_1 ) ) )
            // InternalDsl.g:1197:1: ( ( rule__ENTRYVALUE_LINE__Alternatives_0_1 ) )
            {
            // InternalDsl.g:1197:1: ( ( rule__ENTRYVALUE_LINE__Alternatives_0_1 ) )
            // InternalDsl.g:1198:2: ( rule__ENTRYVALUE_LINE__Alternatives_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENTRYVALUE_LINEAccess().getAlternatives_0_1()); 
            }
            // InternalDsl.g:1199:2: ( rule__ENTRYVALUE_LINE__Alternatives_0_1 )
            // InternalDsl.g:1199:3: rule__ENTRYVALUE_LINE__Alternatives_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ENTRYVALUE_LINE__Alternatives_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENTRYVALUE_LINEAccess().getAlternatives_0_1()); 
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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Group_0__1__Impl"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Group_0_1_0__0"
    // InternalDsl.g:1208:1: rule__ENTRYVALUE_LINE__Group_0_1_0__0 : rule__ENTRYVALUE_LINE__Group_0_1_0__0__Impl rule__ENTRYVALUE_LINE__Group_0_1_0__1 ;
    public final void rule__ENTRYVALUE_LINE__Group_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1212:1: ( rule__ENTRYVALUE_LINE__Group_0_1_0__0__Impl rule__ENTRYVALUE_LINE__Group_0_1_0__1 )
            // InternalDsl.g:1213:2: rule__ENTRYVALUE_LINE__Group_0_1_0__0__Impl rule__ENTRYVALUE_LINE__Group_0_1_0__1
            {
            pushFollow(FOLLOW_18);
            rule__ENTRYVALUE_LINE__Group_0_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ENTRYVALUE_LINE__Group_0_1_0__1();

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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Group_0_1_0__0"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Group_0_1_0__0__Impl"
    // InternalDsl.g:1220:1: rule__ENTRYVALUE_LINE__Group_0_1_0__0__Impl : ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) ;
    public final void rule__ENTRYVALUE_LINE__Group_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1224:1: ( ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) )
            // InternalDsl.g:1225:1: ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) )
            {
            // InternalDsl.g:1225:1: ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) )
            // InternalDsl.g:1226:2: ( ( RULE_WS ) ) ( ( RULE_WS )* )
            {
            // InternalDsl.g:1226:2: ( ( RULE_WS ) )
            // InternalDsl.g:1227:3: ( RULE_WS )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENTRYVALUE_LINEAccess().getWSTerminalRuleCall_0_1_0_0()); 
            }
            // InternalDsl.g:1228:3: ( RULE_WS )
            // InternalDsl.g:1228:4: RULE_WS
            {
            match(input,RULE_WS,FOLLOW_3); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENTRYVALUE_LINEAccess().getWSTerminalRuleCall_0_1_0_0()); 
            }

            }

            // InternalDsl.g:1231:2: ( ( RULE_WS )* )
            // InternalDsl.g:1232:3: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENTRYVALUE_LINEAccess().getWSTerminalRuleCall_0_1_0_0()); 
            }
            // InternalDsl.g:1233:3: ( RULE_WS )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_WS) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDsl.g:1233:4: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_3); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENTRYVALUE_LINEAccess().getWSTerminalRuleCall_0_1_0_0()); 
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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Group_0_1_0__0__Impl"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Group_0_1_0__1"
    // InternalDsl.g:1242:1: rule__ENTRYVALUE_LINE__Group_0_1_0__1 : rule__ENTRYVALUE_LINE__Group_0_1_0__1__Impl ;
    public final void rule__ENTRYVALUE_LINE__Group_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1246:1: ( rule__ENTRYVALUE_LINE__Group_0_1_0__1__Impl )
            // InternalDsl.g:1247:2: rule__ENTRYVALUE_LINE__Group_0_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ENTRYVALUE_LINE__Group_0_1_0__1__Impl();

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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Group_0_1_0__1"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Group_0_1_0__1__Impl"
    // InternalDsl.g:1253:1: rule__ENTRYVALUE_LINE__Group_0_1_0__1__Impl : ( ( ( RULE_SPECIAL_CHAR ) ) ( ( RULE_SPECIAL_CHAR )* ) ) ;
    public final void rule__ENTRYVALUE_LINE__Group_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1257:1: ( ( ( ( RULE_SPECIAL_CHAR ) ) ( ( RULE_SPECIAL_CHAR )* ) ) )
            // InternalDsl.g:1258:1: ( ( ( RULE_SPECIAL_CHAR ) ) ( ( RULE_SPECIAL_CHAR )* ) )
            {
            // InternalDsl.g:1258:1: ( ( ( RULE_SPECIAL_CHAR ) ) ( ( RULE_SPECIAL_CHAR )* ) )
            // InternalDsl.g:1259:2: ( ( RULE_SPECIAL_CHAR ) ) ( ( RULE_SPECIAL_CHAR )* )
            {
            // InternalDsl.g:1259:2: ( ( RULE_SPECIAL_CHAR ) )
            // InternalDsl.g:1260:3: ( RULE_SPECIAL_CHAR )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENTRYVALUE_LINEAccess().getSPECIAL_CHARTerminalRuleCall_0_1_0_1()); 
            }
            // InternalDsl.g:1261:3: ( RULE_SPECIAL_CHAR )
            // InternalDsl.g:1261:4: RULE_SPECIAL_CHAR
            {
            match(input,RULE_SPECIAL_CHAR,FOLLOW_17); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENTRYVALUE_LINEAccess().getSPECIAL_CHARTerminalRuleCall_0_1_0_1()); 
            }

            }

            // InternalDsl.g:1264:2: ( ( RULE_SPECIAL_CHAR )* )
            // InternalDsl.g:1265:3: ( RULE_SPECIAL_CHAR )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENTRYVALUE_LINEAccess().getSPECIAL_CHARTerminalRuleCall_0_1_0_1()); 
            }
            // InternalDsl.g:1266:3: ( RULE_SPECIAL_CHAR )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_SPECIAL_CHAR) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDsl.g:1266:4: RULE_SPECIAL_CHAR
            	    {
            	    match(input,RULE_SPECIAL_CHAR,FOLLOW_17); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENTRYVALUE_LINEAccess().getSPECIAL_CHARTerminalRuleCall_0_1_0_1()); 
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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Group_0_1_0__1__Impl"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Group_2__0"
    // InternalDsl.g:1276:1: rule__ENTRYVALUE_LINE__Group_2__0 : rule__ENTRYVALUE_LINE__Group_2__0__Impl rule__ENTRYVALUE_LINE__Group_2__1 ;
    public final void rule__ENTRYVALUE_LINE__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1280:1: ( rule__ENTRYVALUE_LINE__Group_2__0__Impl rule__ENTRYVALUE_LINE__Group_2__1 )
            // InternalDsl.g:1281:2: rule__ENTRYVALUE_LINE__Group_2__0__Impl rule__ENTRYVALUE_LINE__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__ENTRYVALUE_LINE__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ENTRYVALUE_LINE__Group_2__1();

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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Group_2__0"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Group_2__0__Impl"
    // InternalDsl.g:1288:1: rule__ENTRYVALUE_LINE__Group_2__0__Impl : ( ( rule__ENTRYVALUE_LINE__Alternatives_2_0 )* ) ;
    public final void rule__ENTRYVALUE_LINE__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1292:1: ( ( ( rule__ENTRYVALUE_LINE__Alternatives_2_0 )* ) )
            // InternalDsl.g:1293:1: ( ( rule__ENTRYVALUE_LINE__Alternatives_2_0 )* )
            {
            // InternalDsl.g:1293:1: ( ( rule__ENTRYVALUE_LINE__Alternatives_2_0 )* )
            // InternalDsl.g:1294:2: ( rule__ENTRYVALUE_LINE__Alternatives_2_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENTRYVALUE_LINEAccess().getAlternatives_2_0()); 
            }
            // InternalDsl.g:1295:2: ( rule__ENTRYVALUE_LINE__Alternatives_2_0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_WS||LA24_0==RULE_SPECIAL_CHAR) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalDsl.g:1295:3: rule__ENTRYVALUE_LINE__Alternatives_2_0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ENTRYVALUE_LINE__Alternatives_2_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENTRYVALUE_LINEAccess().getAlternatives_2_0()); 
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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Group_2__0__Impl"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Group_2__1"
    // InternalDsl.g:1303:1: rule__ENTRYVALUE_LINE__Group_2__1 : rule__ENTRYVALUE_LINE__Group_2__1__Impl ;
    public final void rule__ENTRYVALUE_LINE__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1307:1: ( rule__ENTRYVALUE_LINE__Group_2__1__Impl )
            // InternalDsl.g:1308:2: rule__ENTRYVALUE_LINE__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ENTRYVALUE_LINE__Group_2__1__Impl();

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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Group_2__1"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Group_2__1__Impl"
    // InternalDsl.g:1314:1: rule__ENTRYVALUE_LINE__Group_2__1__Impl : ( ( rule__ENTRYVALUE_LINE__Alternatives_2_1 ) ) ;
    public final void rule__ENTRYVALUE_LINE__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1318:1: ( ( ( rule__ENTRYVALUE_LINE__Alternatives_2_1 ) ) )
            // InternalDsl.g:1319:1: ( ( rule__ENTRYVALUE_LINE__Alternatives_2_1 ) )
            {
            // InternalDsl.g:1319:1: ( ( rule__ENTRYVALUE_LINE__Alternatives_2_1 ) )
            // InternalDsl.g:1320:2: ( rule__ENTRYVALUE_LINE__Alternatives_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENTRYVALUE_LINEAccess().getAlternatives_2_1()); 
            }
            // InternalDsl.g:1321:2: ( rule__ENTRYVALUE_LINE__Alternatives_2_1 )
            // InternalDsl.g:1321:3: rule__ENTRYVALUE_LINE__Alternatives_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ENTRYVALUE_LINE__Alternatives_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENTRYVALUE_LINEAccess().getAlternatives_2_1()); 
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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Group_2__1__Impl"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Group_3__0"
    // InternalDsl.g:1330:1: rule__ENTRYVALUE_LINE__Group_3__0 : rule__ENTRYVALUE_LINE__Group_3__0__Impl rule__ENTRYVALUE_LINE__Group_3__1 ;
    public final void rule__ENTRYVALUE_LINE__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1334:1: ( rule__ENTRYVALUE_LINE__Group_3__0__Impl rule__ENTRYVALUE_LINE__Group_3__1 )
            // InternalDsl.g:1335:2: rule__ENTRYVALUE_LINE__Group_3__0__Impl rule__ENTRYVALUE_LINE__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__ENTRYVALUE_LINE__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ENTRYVALUE_LINE__Group_3__1();

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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Group_3__0"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Group_3__0__Impl"
    // InternalDsl.g:1342:1: rule__ENTRYVALUE_LINE__Group_3__0__Impl : ( ( RULE_WS )* ) ;
    public final void rule__ENTRYVALUE_LINE__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1346:1: ( ( ( RULE_WS )* ) )
            // InternalDsl.g:1347:1: ( ( RULE_WS )* )
            {
            // InternalDsl.g:1347:1: ( ( RULE_WS )* )
            // InternalDsl.g:1348:2: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENTRYVALUE_LINEAccess().getWSTerminalRuleCall_3_0()); 
            }
            // InternalDsl.g:1349:2: ( RULE_WS )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_WS) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalDsl.g:1349:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_3); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENTRYVALUE_LINEAccess().getWSTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Group_3__0__Impl"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Group_3__1"
    // InternalDsl.g:1357:1: rule__ENTRYVALUE_LINE__Group_3__1 : rule__ENTRYVALUE_LINE__Group_3__1__Impl rule__ENTRYVALUE_LINE__Group_3__2 ;
    public final void rule__ENTRYVALUE_LINE__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1361:1: ( rule__ENTRYVALUE_LINE__Group_3__1__Impl rule__ENTRYVALUE_LINE__Group_3__2 )
            // InternalDsl.g:1362:2: rule__ENTRYVALUE_LINE__Group_3__1__Impl rule__ENTRYVALUE_LINE__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__ENTRYVALUE_LINE__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ENTRYVALUE_LINE__Group_3__2();

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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Group_3__1"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Group_3__1__Impl"
    // InternalDsl.g:1369:1: rule__ENTRYVALUE_LINE__Group_3__1__Impl : ( ( ( RULE_SPECIAL_CHAR ) ) ( ( RULE_SPECIAL_CHAR )* ) ) ;
    public final void rule__ENTRYVALUE_LINE__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1373:1: ( ( ( ( RULE_SPECIAL_CHAR ) ) ( ( RULE_SPECIAL_CHAR )* ) ) )
            // InternalDsl.g:1374:1: ( ( ( RULE_SPECIAL_CHAR ) ) ( ( RULE_SPECIAL_CHAR )* ) )
            {
            // InternalDsl.g:1374:1: ( ( ( RULE_SPECIAL_CHAR ) ) ( ( RULE_SPECIAL_CHAR )* ) )
            // InternalDsl.g:1375:2: ( ( RULE_SPECIAL_CHAR ) ) ( ( RULE_SPECIAL_CHAR )* )
            {
            // InternalDsl.g:1375:2: ( ( RULE_SPECIAL_CHAR ) )
            // InternalDsl.g:1376:3: ( RULE_SPECIAL_CHAR )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENTRYVALUE_LINEAccess().getSPECIAL_CHARTerminalRuleCall_3_1()); 
            }
            // InternalDsl.g:1377:3: ( RULE_SPECIAL_CHAR )
            // InternalDsl.g:1377:4: RULE_SPECIAL_CHAR
            {
            match(input,RULE_SPECIAL_CHAR,FOLLOW_17); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENTRYVALUE_LINEAccess().getSPECIAL_CHARTerminalRuleCall_3_1()); 
            }

            }

            // InternalDsl.g:1380:2: ( ( RULE_SPECIAL_CHAR )* )
            // InternalDsl.g:1381:3: ( RULE_SPECIAL_CHAR )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENTRYVALUE_LINEAccess().getSPECIAL_CHARTerminalRuleCall_3_1()); 
            }
            // InternalDsl.g:1382:3: ( RULE_SPECIAL_CHAR )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_SPECIAL_CHAR) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalDsl.g:1382:4: RULE_SPECIAL_CHAR
            	    {
            	    match(input,RULE_SPECIAL_CHAR,FOLLOW_17); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENTRYVALUE_LINEAccess().getSPECIAL_CHARTerminalRuleCall_3_1()); 
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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Group_3__1__Impl"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Group_3__2"
    // InternalDsl.g:1391:1: rule__ENTRYVALUE_LINE__Group_3__2 : rule__ENTRYVALUE_LINE__Group_3__2__Impl ;
    public final void rule__ENTRYVALUE_LINE__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1395:1: ( rule__ENTRYVALUE_LINE__Group_3__2__Impl )
            // InternalDsl.g:1396:2: rule__ENTRYVALUE_LINE__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ENTRYVALUE_LINE__Group_3__2__Impl();

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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Group_3__2"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Group_3__2__Impl"
    // InternalDsl.g:1402:1: rule__ENTRYVALUE_LINE__Group_3__2__Impl : ( ( rule__ENTRYVALUE_LINE__Group_3_2__0 )* ) ;
    public final void rule__ENTRYVALUE_LINE__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1406:1: ( ( ( rule__ENTRYVALUE_LINE__Group_3_2__0 )* ) )
            // InternalDsl.g:1407:1: ( ( rule__ENTRYVALUE_LINE__Group_3_2__0 )* )
            {
            // InternalDsl.g:1407:1: ( ( rule__ENTRYVALUE_LINE__Group_3_2__0 )* )
            // InternalDsl.g:1408:2: ( rule__ENTRYVALUE_LINE__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENTRYVALUE_LINEAccess().getGroup_3_2()); 
            }
            // InternalDsl.g:1409:2: ( rule__ENTRYVALUE_LINE__Group_3_2__0 )*
            loop27:
            do {
                int alt27=2;
                alt27 = dfa27.predict(input);
                switch (alt27) {
            	case 1 :
            	    // InternalDsl.g:1409:3: rule__ENTRYVALUE_LINE__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ENTRYVALUE_LINE__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENTRYVALUE_LINEAccess().getGroup_3_2()); 
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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Group_3__2__Impl"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Group_3_2__0"
    // InternalDsl.g:1418:1: rule__ENTRYVALUE_LINE__Group_3_2__0 : rule__ENTRYVALUE_LINE__Group_3_2__0__Impl rule__ENTRYVALUE_LINE__Group_3_2__1 ;
    public final void rule__ENTRYVALUE_LINE__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1422:1: ( rule__ENTRYVALUE_LINE__Group_3_2__0__Impl rule__ENTRYVALUE_LINE__Group_3_2__1 )
            // InternalDsl.g:1423:2: rule__ENTRYVALUE_LINE__Group_3_2__0__Impl rule__ENTRYVALUE_LINE__Group_3_2__1
            {
            pushFollow(FOLLOW_18);
            rule__ENTRYVALUE_LINE__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ENTRYVALUE_LINE__Group_3_2__1();

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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Group_3_2__0"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Group_3_2__0__Impl"
    // InternalDsl.g:1430:1: rule__ENTRYVALUE_LINE__Group_3_2__0__Impl : ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) ;
    public final void rule__ENTRYVALUE_LINE__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1434:1: ( ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) )
            // InternalDsl.g:1435:1: ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) )
            {
            // InternalDsl.g:1435:1: ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) )
            // InternalDsl.g:1436:2: ( ( RULE_WS ) ) ( ( RULE_WS )* )
            {
            // InternalDsl.g:1436:2: ( ( RULE_WS ) )
            // InternalDsl.g:1437:3: ( RULE_WS )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENTRYVALUE_LINEAccess().getWSTerminalRuleCall_3_2_0()); 
            }
            // InternalDsl.g:1438:3: ( RULE_WS )
            // InternalDsl.g:1438:4: RULE_WS
            {
            match(input,RULE_WS,FOLLOW_3); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENTRYVALUE_LINEAccess().getWSTerminalRuleCall_3_2_0()); 
            }

            }

            // InternalDsl.g:1441:2: ( ( RULE_WS )* )
            // InternalDsl.g:1442:3: ( RULE_WS )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENTRYVALUE_LINEAccess().getWSTerminalRuleCall_3_2_0()); 
            }
            // InternalDsl.g:1443:3: ( RULE_WS )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_WS) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalDsl.g:1443:4: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_3); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENTRYVALUE_LINEAccess().getWSTerminalRuleCall_3_2_0()); 
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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Group_3_2__0__Impl"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Group_3_2__1"
    // InternalDsl.g:1452:1: rule__ENTRYVALUE_LINE__Group_3_2__1 : rule__ENTRYVALUE_LINE__Group_3_2__1__Impl ;
    public final void rule__ENTRYVALUE_LINE__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1456:1: ( rule__ENTRYVALUE_LINE__Group_3_2__1__Impl )
            // InternalDsl.g:1457:2: rule__ENTRYVALUE_LINE__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ENTRYVALUE_LINE__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Group_3_2__1"


    // $ANTLR start "rule__ENTRYVALUE_LINE__Group_3_2__1__Impl"
    // InternalDsl.g:1463:1: rule__ENTRYVALUE_LINE__Group_3_2__1__Impl : ( ( ( RULE_SPECIAL_CHAR ) ) ( ( RULE_SPECIAL_CHAR )* ) ) ;
    public final void rule__ENTRYVALUE_LINE__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1467:1: ( ( ( ( RULE_SPECIAL_CHAR ) ) ( ( RULE_SPECIAL_CHAR )* ) ) )
            // InternalDsl.g:1468:1: ( ( ( RULE_SPECIAL_CHAR ) ) ( ( RULE_SPECIAL_CHAR )* ) )
            {
            // InternalDsl.g:1468:1: ( ( ( RULE_SPECIAL_CHAR ) ) ( ( RULE_SPECIAL_CHAR )* ) )
            // InternalDsl.g:1469:2: ( ( RULE_SPECIAL_CHAR ) ) ( ( RULE_SPECIAL_CHAR )* )
            {
            // InternalDsl.g:1469:2: ( ( RULE_SPECIAL_CHAR ) )
            // InternalDsl.g:1470:3: ( RULE_SPECIAL_CHAR )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENTRYVALUE_LINEAccess().getSPECIAL_CHARTerminalRuleCall_3_2_1()); 
            }
            // InternalDsl.g:1471:3: ( RULE_SPECIAL_CHAR )
            // InternalDsl.g:1471:4: RULE_SPECIAL_CHAR
            {
            match(input,RULE_SPECIAL_CHAR,FOLLOW_17); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENTRYVALUE_LINEAccess().getSPECIAL_CHARTerminalRuleCall_3_2_1()); 
            }

            }

            // InternalDsl.g:1474:2: ( ( RULE_SPECIAL_CHAR )* )
            // InternalDsl.g:1475:3: ( RULE_SPECIAL_CHAR )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getENTRYVALUE_LINEAccess().getSPECIAL_CHARTerminalRuleCall_3_2_1()); 
            }
            // InternalDsl.g:1476:3: ( RULE_SPECIAL_CHAR )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_SPECIAL_CHAR) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalDsl.g:1476:4: RULE_SPECIAL_CHAR
            	    {
            	    match(input,RULE_SPECIAL_CHAR,FOLLOW_17); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getENTRYVALUE_LINEAccess().getSPECIAL_CHARTerminalRuleCall_3_2_1()); 
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
    // $ANTLR end "rule__ENTRYVALUE_LINE__Group_3_2__1__Impl"


    // $ANTLR start "rule__Dsl__EntriesAssignment_1_0_0"
    // InternalDsl.g:1486:1: rule__Dsl__EntriesAssignment_1_0_0 : ( ruleEntry ) ;
    public final void rule__Dsl__EntriesAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1490:1: ( ( ruleEntry ) )
            // InternalDsl.g:1491:2: ( ruleEntry )
            {
            // InternalDsl.g:1491:2: ( ruleEntry )
            // InternalDsl.g:1492:3: ruleEntry
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
    // InternalDsl.g:1501:1: rule__Entry__KeyAssignment_1 : ( RULE_ENTRYKEY ) ;
    public final void rule__Entry__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1505:1: ( ( RULE_ENTRYKEY ) )
            // InternalDsl.g:1506:2: ( RULE_ENTRYKEY )
            {
            // InternalDsl.g:1506:2: ( RULE_ENTRYKEY )
            // InternalDsl.g:1507:3: RULE_ENTRYKEY
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
    // InternalDsl.g:1516:1: rule__Entry__ValueAssignment_5 : ( ruleEntryValue ) ;
    public final void rule__Entry__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1520:1: ( ( ruleEntryValue ) )
            // InternalDsl.g:1521:2: ( ruleEntryValue )
            {
            // InternalDsl.g:1521:2: ( ruleEntryValue )
            // InternalDsl.g:1522:3: ruleEntryValue
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
    // InternalDsl.g:1531:1: rule__EntryValue__EntryLinesAssignment_1 : ( ruleENTRYVALUE_LINE ) ;
    public final void rule__EntryValue__EntryLinesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1535:1: ( ( ruleENTRYVALUE_LINE ) )
            // InternalDsl.g:1536:2: ( ruleENTRYVALUE_LINE )
            {
            // InternalDsl.g:1536:2: ( ruleENTRYVALUE_LINE )
            // InternalDsl.g:1537:3: ruleENTRYVALUE_LINE
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
    // InternalDsl.g:1546:1: rule__EntryValue__EntryLinesAssignment_2_1_0_1 : ( ruleENTRYVALUE_LINE ) ;
    public final void rule__EntryValue__EntryLinesAssignment_2_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1550:1: ( ( ruleENTRYVALUE_LINE ) )
            // InternalDsl.g:1551:2: ( ruleENTRYVALUE_LINE )
            {
            // InternalDsl.g:1551:2: ( ruleENTRYVALUE_LINE )
            // InternalDsl.g:1552:3: ruleENTRYVALUE_LINE
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


    // $ANTLR start "rule__EntryValue__EntryLinesAssignment_2_1_1_2"
    // InternalDsl.g:1561:1: rule__EntryValue__EntryLinesAssignment_2_1_1_2 : ( ruleENTRYVALUE_LINE ) ;
    public final void rule__EntryValue__EntryLinesAssignment_2_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1565:1: ( ( ruleENTRYVALUE_LINE ) )
            // InternalDsl.g:1566:2: ( ruleENTRYVALUE_LINE )
            {
            // InternalDsl.g:1566:2: ( ruleENTRYVALUE_LINE )
            // InternalDsl.g:1567:3: ruleENTRYVALUE_LINE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntryValueAccess().getEntryLinesENTRYVALUE_LINEParserRuleCall_2_1_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleENTRYVALUE_LINE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntryValueAccess().getEntryLinesENTRYVALUE_LINEParserRuleCall_2_1_1_2_0()); 
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
    // $ANTLR end "rule__EntryValue__EntryLinesAssignment_2_1_1_2"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA27 dfa27 = new DFA27(this);
    static final String dfa_1s = "\5\uffff";
    static final String dfa_2s = "\1\16\2\6\2\uffff";
    static final String dfa_3s = "\1\16\2\17\2\uffff";
    static final String dfa_4s = "\3\uffff\1\2\1\1";
    static final String dfa_5s = "\5\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2\3\3\5\uffff\1\4",
            "\1\2\3\3\5\uffff\1\4",
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
            return "205:1: rule__EntryValue__Alternatives_2_1 : ( ( ( rule__EntryValue__Group_2_1_0__0 ) ) | ( ( rule__EntryValue__Group_2_1_1__0 ) ) );";
        }
    }
    static final String dfa_7s = "\2\2\1\uffff\1\2\1\uffff";
    static final String dfa_8s = "\2\6\1\uffff\1\6\1\uffff";
    static final String dfa_9s = "\1\10\1\11\1\uffff\1\11\1\uffff";
    static final String dfa_10s = "\2\uffff\1\2\1\uffff\1\1";
    static final String[] dfa_11s = {
            "\1\1\2\2",
            "\1\3\2\2\1\4",
            "",
            "\1\3\2\2\1\4",
            ""
    };
    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[][] dfa_11 = unpackEncodedStringArray(dfa_11s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_5;
            this.transition = dfa_11;
        }
        public String getDescription() {
            return "226:1: rule__ENTRYVALUE_LINE__Alternatives_0_1 : ( ( ( rule__ENTRYVALUE_LINE__Group_0_1_0__0 ) ) | ( ( RULE_WS )* ) );";
        }
    }
    static final String dfa_12s = "\4\uffff";
    static final String dfa_13s = "\1\1\3\uffff";
    static final String dfa_14s = "\1\4\1\uffff\1\6\1\uffff";
    static final String dfa_15s = "\1\16\1\uffff\1\16\1\uffff";
    static final String dfa_16s = "\1\uffff\1\2\1\uffff\1\1";
    static final String dfa_17s = "\4\uffff}>";
    static final String[] dfa_18s = {
            "\2\1\1\2\1\1\4\uffff\2\1\1\3",
            "",
            "\1\2\1\1\6\uffff\1\3",
            ""
    };

    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_12;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "()* loopback of 706:2: ( rule__EntryValue__Group_2__0 )*";
        }
    }
    static final String dfa_19s = "\14\uffff";
    static final String dfa_20s = "\1\3\1\uffff\1\3\1\uffff\1\5\2\uffff\1\3\2\uffff\2\3";
    static final String dfa_21s = "\1\4\1\6\1\4\1\uffff\1\4\1\uffff\1\6\1\4\2\6\2\4";
    static final String dfa_22s = "\3\16\1\uffff\1\16\1\uffff\6\16";
    static final String dfa_23s = "\3\uffff\1\2\1\uffff\1\1\6\uffff";
    static final String dfa_24s = "\14\uffff}>";
    static final String[] dfa_25s = {
            "\2\3\1\1\1\4\1\5\1\2\2\uffff\3\3",
            "\1\1\1\4\1\5\1\2\4\uffff\1\3",
            "\2\3\1\6\1\4\1\5\1\7\2\uffff\3\3",
            "",
            "\2\5\1\10\3\5\1\3\1\uffff\3\5",
            "",
            "\1\11\1\4\1\5\1\12\4\uffff\1\3",
            "\2\3\1\6\1\4\1\5\1\7\2\uffff\3\3",
            "\1\10\3\5\1\3\3\uffff\1\5",
            "\1\11\1\4\1\5\1\12\4\uffff\1\3",
            "\2\3\1\6\1\4\1\5\1\13\2\uffff\3\3",
            "\2\3\1\6\1\4\1\5\1\13\2\uffff\3\3"
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_19;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "()* loopback of 1112:2: ( rule__ENTRYVALUE_LINE__Group_2__0 )*";
        }
    }
    static final String dfa_26s = "\1\3\3\uffff";
    static final String dfa_27s = "\1\4\1\6\2\uffff";
    static final String dfa_28s = "\2\16\2\uffff";
    static final String dfa_29s = "\2\uffff\1\1\1\2";
    static final String[] dfa_30s = {
            "\2\3\1\1\1\3\1\uffff\1\2\2\uffff\3\3",
            "\1\1\1\3\1\uffff\1\2\4\uffff\1\3",
            "",
            ""
    };
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_12;
            this.eof = dfa_26;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_17;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "1138:2: ( rule__ENTRYVALUE_LINE__Group_3__0 )?";
        }
    }
    static final String dfa_31s = "\1\1\4\uffff";
    static final String dfa_32s = "\1\4\1\uffff\2\6\1\uffff";
    static final String dfa_33s = "\1\16\1\uffff\2\16\1\uffff";
    static final String dfa_34s = "\1\uffff\1\2\2\uffff\1\1";
    static final String[] dfa_35s = {
            "\2\1\1\2\1\1\4\uffff\3\1",
            "",
            "\1\3\1\1\1\uffff\1\4\4\uffff\1\1",
            "\1\3\1\1\1\uffff\1\4\4\uffff\1\1",
            ""
    };
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final char[] dfa_32 = DFA.unpackEncodedStringToUnsignedChars(dfa_32s);
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[][] dfa_35 = unpackEncodedStringArray(dfa_35s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_1;
            this.eof = dfa_31;
            this.min = dfa_32;
            this.max = dfa_33;
            this.accept = dfa_34;
            this.special = dfa_5;
            this.transition = dfa_35;
        }
        public String getDescription() {
            return "()* loopback of 1409:2: ( rule__ENTRYVALUE_LINE__Group_3_2__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004042L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000003C2L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000242L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000240L});

}