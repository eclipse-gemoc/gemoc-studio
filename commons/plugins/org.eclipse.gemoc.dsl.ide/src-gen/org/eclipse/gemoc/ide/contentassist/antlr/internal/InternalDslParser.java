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

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_QUALIFIED", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DSL'", "'{'", "'}'", "'='", "','", "'displayName'", "'metaprog'", "'abstract-syntax'", "'semantics'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int RULE_QUALIFIED=4;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=7;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__20=20;

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
    // InternalDsl.g:53:1: entryRuleDsl : ruleDsl EOF ;
    public final void entryRuleDsl() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleDsl EOF )
            // InternalDsl.g:55:1: ruleDsl EOF
            {
             before(grammarAccess.getDslRule()); 
            pushFollow(FOLLOW_1);
            ruleDsl();

            state._fsp--;

             after(grammarAccess.getDslRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDsl.g:62:1: ruleDsl : ( ( rule__Dsl__Group__0 ) ) ;
    public final void ruleDsl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__Dsl__Group__0 ) ) )
            // InternalDsl.g:67:2: ( ( rule__Dsl__Group__0 ) )
            {
            // InternalDsl.g:67:2: ( ( rule__Dsl__Group__0 ) )
            // InternalDsl.g:68:3: ( rule__Dsl__Group__0 )
            {
             before(grammarAccess.getDslAccess().getGroup()); 
            // InternalDsl.g:69:3: ( rule__Dsl__Group__0 )
            // InternalDsl.g:69:4: rule__Dsl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dsl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDslAccess().getGroup()); 

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


    // $ANTLR start "entryRuleValue"
    // InternalDsl.g:78:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( ruleValue EOF )
            // InternalDsl.g:80:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalDsl.g:87:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalDsl.g:92:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalDsl.g:92:2: ( ( rule__Value__Alternatives ) )
            // InternalDsl.g:93:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalDsl.g:94:3: ( rule__Value__Alternatives )
            // InternalDsl.g:94:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleSimpleValue"
    // InternalDsl.g:103:1: entryRuleSimpleValue : ruleSimpleValue EOF ;
    public final void entryRuleSimpleValue() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleSimpleValue EOF )
            // InternalDsl.g:105:1: ruleSimpleValue EOF
            {
             before(grammarAccess.getSimpleValueRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleValue();

            state._fsp--;

             after(grammarAccess.getSimpleValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSimpleValue"


    // $ANTLR start "ruleSimpleValue"
    // InternalDsl.g:112:1: ruleSimpleValue : ( ( rule__SimpleValue__Group__0 ) ) ;
    public final void ruleSimpleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__SimpleValue__Group__0 ) ) )
            // InternalDsl.g:117:2: ( ( rule__SimpleValue__Group__0 ) )
            {
            // InternalDsl.g:117:2: ( ( rule__SimpleValue__Group__0 ) )
            // InternalDsl.g:118:3: ( rule__SimpleValue__Group__0 )
            {
             before(grammarAccess.getSimpleValueAccess().getGroup()); 
            // InternalDsl.g:119:3: ( rule__SimpleValue__Group__0 )
            // InternalDsl.g:119:4: rule__SimpleValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleValueAccess().getGroup()); 

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
    // $ANTLR end "ruleSimpleValue"


    // $ANTLR start "entryRuleCompositeValue"
    // InternalDsl.g:128:1: entryRuleCompositeValue : ruleCompositeValue EOF ;
    public final void entryRuleCompositeValue() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleCompositeValue EOF )
            // InternalDsl.g:130:1: ruleCompositeValue EOF
            {
             before(grammarAccess.getCompositeValueRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositeValue();

            state._fsp--;

             after(grammarAccess.getCompositeValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCompositeValue"


    // $ANTLR start "ruleCompositeValue"
    // InternalDsl.g:137:1: ruleCompositeValue : ( ( rule__CompositeValue__Group__0 ) ) ;
    public final void ruleCompositeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__CompositeValue__Group__0 ) ) )
            // InternalDsl.g:142:2: ( ( rule__CompositeValue__Group__0 ) )
            {
            // InternalDsl.g:142:2: ( ( rule__CompositeValue__Group__0 ) )
            // InternalDsl.g:143:3: ( rule__CompositeValue__Group__0 )
            {
             before(grammarAccess.getCompositeValueAccess().getGroup()); 
            // InternalDsl.g:144:3: ( rule__CompositeValue__Group__0 )
            // InternalDsl.g:144:4: rule__CompositeValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeValueAccess().getGroup()); 

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
    // $ANTLR end "ruleCompositeValue"


    // $ANTLR start "entryRuleDisplayName"
    // InternalDsl.g:153:1: entryRuleDisplayName : ruleDisplayName EOF ;
    public final void entryRuleDisplayName() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleDisplayName EOF )
            // InternalDsl.g:155:1: ruleDisplayName EOF
            {
             before(grammarAccess.getDisplayNameRule()); 
            pushFollow(FOLLOW_1);
            ruleDisplayName();

            state._fsp--;

             after(grammarAccess.getDisplayNameRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDisplayName"


    // $ANTLR start "ruleDisplayName"
    // InternalDsl.g:162:1: ruleDisplayName : ( ( rule__DisplayName__Group__0 ) ) ;
    public final void ruleDisplayName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__DisplayName__Group__0 ) ) )
            // InternalDsl.g:167:2: ( ( rule__DisplayName__Group__0 ) )
            {
            // InternalDsl.g:167:2: ( ( rule__DisplayName__Group__0 ) )
            // InternalDsl.g:168:3: ( rule__DisplayName__Group__0 )
            {
             before(grammarAccess.getDisplayNameAccess().getGroup()); 
            // InternalDsl.g:169:3: ( rule__DisplayName__Group__0 )
            // InternalDsl.g:169:4: rule__DisplayName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DisplayName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDisplayNameAccess().getGroup()); 

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
    // $ANTLR end "ruleDisplayName"


    // $ANTLR start "entryRuleMetaprog"
    // InternalDsl.g:178:1: entryRuleMetaprog : ruleMetaprog EOF ;
    public final void entryRuleMetaprog() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleMetaprog EOF )
            // InternalDsl.g:180:1: ruleMetaprog EOF
            {
             before(grammarAccess.getMetaprogRule()); 
            pushFollow(FOLLOW_1);
            ruleMetaprog();

            state._fsp--;

             after(grammarAccess.getMetaprogRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMetaprog"


    // $ANTLR start "ruleMetaprog"
    // InternalDsl.g:187:1: ruleMetaprog : ( ( rule__Metaprog__Group__0 ) ) ;
    public final void ruleMetaprog() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__Metaprog__Group__0 ) ) )
            // InternalDsl.g:192:2: ( ( rule__Metaprog__Group__0 ) )
            {
            // InternalDsl.g:192:2: ( ( rule__Metaprog__Group__0 ) )
            // InternalDsl.g:193:3: ( rule__Metaprog__Group__0 )
            {
             before(grammarAccess.getMetaprogAccess().getGroup()); 
            // InternalDsl.g:194:3: ( rule__Metaprog__Group__0 )
            // InternalDsl.g:194:4: rule__Metaprog__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Metaprog__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetaprogAccess().getGroup()); 

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
    // $ANTLR end "ruleMetaprog"


    // $ANTLR start "entryRuleAbstractSyntax"
    // InternalDsl.g:203:1: entryRuleAbstractSyntax : ruleAbstractSyntax EOF ;
    public final void entryRuleAbstractSyntax() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( ruleAbstractSyntax EOF )
            // InternalDsl.g:205:1: ruleAbstractSyntax EOF
            {
             before(grammarAccess.getAbstractSyntaxRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractSyntax();

            state._fsp--;

             after(grammarAccess.getAbstractSyntaxRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractSyntax"


    // $ANTLR start "ruleAbstractSyntax"
    // InternalDsl.g:212:1: ruleAbstractSyntax : ( ( rule__AbstractSyntax__Group__0 ) ) ;
    public final void ruleAbstractSyntax() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__AbstractSyntax__Group__0 ) ) )
            // InternalDsl.g:217:2: ( ( rule__AbstractSyntax__Group__0 ) )
            {
            // InternalDsl.g:217:2: ( ( rule__AbstractSyntax__Group__0 ) )
            // InternalDsl.g:218:3: ( rule__AbstractSyntax__Group__0 )
            {
             before(grammarAccess.getAbstractSyntaxAccess().getGroup()); 
            // InternalDsl.g:219:3: ( rule__AbstractSyntax__Group__0 )
            // InternalDsl.g:219:4: rule__AbstractSyntax__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AbstractSyntax__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractSyntaxAccess().getGroup()); 

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
    // $ANTLR end "ruleAbstractSyntax"


    // $ANTLR start "entryRuleSemantic"
    // InternalDsl.g:228:1: entryRuleSemantic : ruleSemantic EOF ;
    public final void entryRuleSemantic() throws RecognitionException {
        try {
            // InternalDsl.g:229:1: ( ruleSemantic EOF )
            // InternalDsl.g:230:1: ruleSemantic EOF
            {
             before(grammarAccess.getSemanticRule()); 
            pushFollow(FOLLOW_1);
            ruleSemantic();

            state._fsp--;

             after(grammarAccess.getSemanticRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSemantic"


    // $ANTLR start "ruleSemantic"
    // InternalDsl.g:237:1: ruleSemantic : ( ( rule__Semantic__Group__0 ) ) ;
    public final void ruleSemantic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:241:2: ( ( ( rule__Semantic__Group__0 ) ) )
            // InternalDsl.g:242:2: ( ( rule__Semantic__Group__0 ) )
            {
            // InternalDsl.g:242:2: ( ( rule__Semantic__Group__0 ) )
            // InternalDsl.g:243:3: ( rule__Semantic__Group__0 )
            {
             before(grammarAccess.getSemanticAccess().getGroup()); 
            // InternalDsl.g:244:3: ( rule__Semantic__Group__0 )
            // InternalDsl.g:244:4: rule__Semantic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Semantic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSemanticAccess().getGroup()); 

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
    // $ANTLR end "ruleSemantic"


    // $ANTLR start "rule__Dsl__NameAlternatives_1_0"
    // InternalDsl.g:252:1: rule__Dsl__NameAlternatives_1_0 : ( ( RULE_QUALIFIED ) | ( RULE_ID ) );
    public final void rule__Dsl__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:256:1: ( ( RULE_QUALIFIED ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_QUALIFIED) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:257:2: ( RULE_QUALIFIED )
                    {
                    // InternalDsl.g:257:2: ( RULE_QUALIFIED )
                    // InternalDsl.g:258:3: RULE_QUALIFIED
                    {
                     before(grammarAccess.getDslAccess().getNameQUALIFIEDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_QUALIFIED,FOLLOW_2); 
                     after(grammarAccess.getDslAccess().getNameQUALIFIEDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:263:2: ( RULE_ID )
                    {
                    // InternalDsl.g:263:2: ( RULE_ID )
                    // InternalDsl.g:264:3: RULE_ID
                    {
                     before(grammarAccess.getDslAccess().getNameIDTerminalRuleCall_1_0_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getDslAccess().getNameIDTerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__Dsl__NameAlternatives_1_0"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalDsl.g:273:1: rule__Value__Alternatives : ( ( ruleSimpleValue ) | ( ruleCompositeValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:277:1: ( ( ruleSimpleValue ) | ( ruleCompositeValue ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==13) ) {
                    alt2=2;
                }
                else if ( (LA2_1==15) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:278:2: ( ruleSimpleValue )
                    {
                    // InternalDsl.g:278:2: ( ruleSimpleValue )
                    // InternalDsl.g:279:3: ruleSimpleValue
                    {
                     before(grammarAccess.getValueAccess().getSimpleValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getSimpleValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:284:2: ( ruleCompositeValue )
                    {
                    // InternalDsl.g:284:2: ( ruleCompositeValue )
                    // InternalDsl.g:285:3: ruleCompositeValue
                    {
                     before(grammarAccess.getValueAccess().getCompositeValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCompositeValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getCompositeValueParserRuleCall_1()); 

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
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Dsl__Group__0"
    // InternalDsl.g:294:1: rule__Dsl__Group__0 : rule__Dsl__Group__0__Impl rule__Dsl__Group__1 ;
    public final void rule__Dsl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:298:1: ( rule__Dsl__Group__0__Impl rule__Dsl__Group__1 )
            // InternalDsl.g:299:2: rule__Dsl__Group__0__Impl rule__Dsl__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Dsl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dsl__Group__1();

            state._fsp--;


            }

        }
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
    // InternalDsl.g:306:1: rule__Dsl__Group__0__Impl : ( 'DSL' ) ;
    public final void rule__Dsl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:310:1: ( ( 'DSL' ) )
            // InternalDsl.g:311:1: ( 'DSL' )
            {
            // InternalDsl.g:311:1: ( 'DSL' )
            // InternalDsl.g:312:2: 'DSL'
            {
             before(grammarAccess.getDslAccess().getDSLKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDslAccess().getDSLKeyword_0()); 

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
    // InternalDsl.g:321:1: rule__Dsl__Group__1 : rule__Dsl__Group__1__Impl rule__Dsl__Group__2 ;
    public final void rule__Dsl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:325:1: ( rule__Dsl__Group__1__Impl rule__Dsl__Group__2 )
            // InternalDsl.g:326:2: rule__Dsl__Group__1__Impl rule__Dsl__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Dsl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dsl__Group__2();

            state._fsp--;


            }

        }
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
    // InternalDsl.g:333:1: rule__Dsl__Group__1__Impl : ( ( rule__Dsl__NameAssignment_1 ) ) ;
    public final void rule__Dsl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:337:1: ( ( ( rule__Dsl__NameAssignment_1 ) ) )
            // InternalDsl.g:338:1: ( ( rule__Dsl__NameAssignment_1 ) )
            {
            // InternalDsl.g:338:1: ( ( rule__Dsl__NameAssignment_1 ) )
            // InternalDsl.g:339:2: ( rule__Dsl__NameAssignment_1 )
            {
             before(grammarAccess.getDslAccess().getNameAssignment_1()); 
            // InternalDsl.g:340:2: ( rule__Dsl__NameAssignment_1 )
            // InternalDsl.g:340:3: rule__Dsl__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Dsl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDslAccess().getNameAssignment_1()); 

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
    // InternalDsl.g:348:1: rule__Dsl__Group__2 : rule__Dsl__Group__2__Impl rule__Dsl__Group__3 ;
    public final void rule__Dsl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:352:1: ( rule__Dsl__Group__2__Impl rule__Dsl__Group__3 )
            // InternalDsl.g:353:2: rule__Dsl__Group__2__Impl rule__Dsl__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Dsl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dsl__Group__3();

            state._fsp--;


            }

        }
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
    // InternalDsl.g:360:1: rule__Dsl__Group__2__Impl : ( '{' ) ;
    public final void rule__Dsl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:364:1: ( ( '{' ) )
            // InternalDsl.g:365:1: ( '{' )
            {
            // InternalDsl.g:365:1: ( '{' )
            // InternalDsl.g:366:2: '{'
            {
             before(grammarAccess.getDslAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDslAccess().getLeftCurlyBracketKeyword_2()); 

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
    // InternalDsl.g:375:1: rule__Dsl__Group__3 : rule__Dsl__Group__3__Impl rule__Dsl__Group__4 ;
    public final void rule__Dsl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:379:1: ( rule__Dsl__Group__3__Impl rule__Dsl__Group__4 )
            // InternalDsl.g:380:2: rule__Dsl__Group__3__Impl rule__Dsl__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Dsl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dsl__Group__4();

            state._fsp--;


            }

        }
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
    // InternalDsl.g:387:1: rule__Dsl__Group__3__Impl : ( ( rule__Dsl__DisplayNameAssignment_3 )? ) ;
    public final void rule__Dsl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:391:1: ( ( ( rule__Dsl__DisplayNameAssignment_3 )? ) )
            // InternalDsl.g:392:1: ( ( rule__Dsl__DisplayNameAssignment_3 )? )
            {
            // InternalDsl.g:392:1: ( ( rule__Dsl__DisplayNameAssignment_3 )? )
            // InternalDsl.g:393:2: ( rule__Dsl__DisplayNameAssignment_3 )?
            {
             before(grammarAccess.getDslAccess().getDisplayNameAssignment_3()); 
            // InternalDsl.g:394:2: ( rule__Dsl__DisplayNameAssignment_3 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:394:3: rule__Dsl__DisplayNameAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dsl__DisplayNameAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDslAccess().getDisplayNameAssignment_3()); 

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
    // InternalDsl.g:402:1: rule__Dsl__Group__4 : rule__Dsl__Group__4__Impl rule__Dsl__Group__5 ;
    public final void rule__Dsl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:406:1: ( rule__Dsl__Group__4__Impl rule__Dsl__Group__5 )
            // InternalDsl.g:407:2: rule__Dsl__Group__4__Impl rule__Dsl__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Dsl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dsl__Group__5();

            state._fsp--;


            }

        }
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
    // InternalDsl.g:414:1: rule__Dsl__Group__4__Impl : ( ( rule__Dsl__MetaprogAssignment_4 )? ) ;
    public final void rule__Dsl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:418:1: ( ( ( rule__Dsl__MetaprogAssignment_4 )? ) )
            // InternalDsl.g:419:1: ( ( rule__Dsl__MetaprogAssignment_4 )? )
            {
            // InternalDsl.g:419:1: ( ( rule__Dsl__MetaprogAssignment_4 )? )
            // InternalDsl.g:420:2: ( rule__Dsl__MetaprogAssignment_4 )?
            {
             before(grammarAccess.getDslAccess().getMetaprogAssignment_4()); 
            // InternalDsl.g:421:2: ( rule__Dsl__MetaprogAssignment_4 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:421:3: rule__Dsl__MetaprogAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dsl__MetaprogAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDslAccess().getMetaprogAssignment_4()); 

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
    // InternalDsl.g:429:1: rule__Dsl__Group__5 : rule__Dsl__Group__5__Impl rule__Dsl__Group__6 ;
    public final void rule__Dsl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:433:1: ( rule__Dsl__Group__5__Impl rule__Dsl__Group__6 )
            // InternalDsl.g:434:2: rule__Dsl__Group__5__Impl rule__Dsl__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Dsl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dsl__Group__6();

            state._fsp--;


            }

        }
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
    // InternalDsl.g:441:1: rule__Dsl__Group__5__Impl : ( ( rule__Dsl__AbstractSyntaxAssignment_5 )? ) ;
    public final void rule__Dsl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:445:1: ( ( ( rule__Dsl__AbstractSyntaxAssignment_5 )? ) )
            // InternalDsl.g:446:1: ( ( rule__Dsl__AbstractSyntaxAssignment_5 )? )
            {
            // InternalDsl.g:446:1: ( ( rule__Dsl__AbstractSyntaxAssignment_5 )? )
            // InternalDsl.g:447:2: ( rule__Dsl__AbstractSyntaxAssignment_5 )?
            {
             before(grammarAccess.getDslAccess().getAbstractSyntaxAssignment_5()); 
            // InternalDsl.g:448:2: ( rule__Dsl__AbstractSyntaxAssignment_5 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:448:3: rule__Dsl__AbstractSyntaxAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dsl__AbstractSyntaxAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDslAccess().getAbstractSyntaxAssignment_5()); 

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
    // InternalDsl.g:456:1: rule__Dsl__Group__6 : rule__Dsl__Group__6__Impl rule__Dsl__Group__7 ;
    public final void rule__Dsl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:460:1: ( rule__Dsl__Group__6__Impl rule__Dsl__Group__7 )
            // InternalDsl.g:461:2: rule__Dsl__Group__6__Impl rule__Dsl__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Dsl__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dsl__Group__7();

            state._fsp--;


            }

        }
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
    // InternalDsl.g:468:1: rule__Dsl__Group__6__Impl : ( ( rule__Dsl__SemanticAssignment_6 )? ) ;
    public final void rule__Dsl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:472:1: ( ( ( rule__Dsl__SemanticAssignment_6 )? ) )
            // InternalDsl.g:473:1: ( ( rule__Dsl__SemanticAssignment_6 )? )
            {
            // InternalDsl.g:473:1: ( ( rule__Dsl__SemanticAssignment_6 )? )
            // InternalDsl.g:474:2: ( rule__Dsl__SemanticAssignment_6 )?
            {
             before(grammarAccess.getDslAccess().getSemanticAssignment_6()); 
            // InternalDsl.g:475:2: ( rule__Dsl__SemanticAssignment_6 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:475:3: rule__Dsl__SemanticAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dsl__SemanticAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDslAccess().getSemanticAssignment_6()); 

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
    // InternalDsl.g:483:1: rule__Dsl__Group__7 : rule__Dsl__Group__7__Impl rule__Dsl__Group__8 ;
    public final void rule__Dsl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:487:1: ( rule__Dsl__Group__7__Impl rule__Dsl__Group__8 )
            // InternalDsl.g:488:2: rule__Dsl__Group__7__Impl rule__Dsl__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__Dsl__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dsl__Group__8();

            state._fsp--;


            }

        }
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
    // InternalDsl.g:495:1: rule__Dsl__Group__7__Impl : ( ( rule__Dsl__ValuesAssignment_7 )* ) ;
    public final void rule__Dsl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:499:1: ( ( ( rule__Dsl__ValuesAssignment_7 )* ) )
            // InternalDsl.g:500:1: ( ( rule__Dsl__ValuesAssignment_7 )* )
            {
            // InternalDsl.g:500:1: ( ( rule__Dsl__ValuesAssignment_7 )* )
            // InternalDsl.g:501:2: ( rule__Dsl__ValuesAssignment_7 )*
            {
             before(grammarAccess.getDslAccess().getValuesAssignment_7()); 
            // InternalDsl.g:502:2: ( rule__Dsl__ValuesAssignment_7 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:502:3: rule__Dsl__ValuesAssignment_7
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Dsl__ValuesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getDslAccess().getValuesAssignment_7()); 

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
    // InternalDsl.g:510:1: rule__Dsl__Group__8 : rule__Dsl__Group__8__Impl ;
    public final void rule__Dsl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:514:1: ( rule__Dsl__Group__8__Impl )
            // InternalDsl.g:515:2: rule__Dsl__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dsl__Group__8__Impl();

            state._fsp--;


            }

        }
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
    // InternalDsl.g:521:1: rule__Dsl__Group__8__Impl : ( '}' ) ;
    public final void rule__Dsl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:525:1: ( ( '}' ) )
            // InternalDsl.g:526:1: ( '}' )
            {
            // InternalDsl.g:526:1: ( '}' )
            // InternalDsl.g:527:2: '}'
            {
             before(grammarAccess.getDslAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDslAccess().getRightCurlyBracketKeyword_8()); 

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


    // $ANTLR start "rule__SimpleValue__Group__0"
    // InternalDsl.g:537:1: rule__SimpleValue__Group__0 : rule__SimpleValue__Group__0__Impl rule__SimpleValue__Group__1 ;
    public final void rule__SimpleValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:541:1: ( rule__SimpleValue__Group__0__Impl rule__SimpleValue__Group__1 )
            // InternalDsl.g:542:2: rule__SimpleValue__Group__0__Impl rule__SimpleValue__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__SimpleValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleValue__Group__0"


    // $ANTLR start "rule__SimpleValue__Group__0__Impl"
    // InternalDsl.g:549:1: rule__SimpleValue__Group__0__Impl : ( ( rule__SimpleValue__NameAssignment_0 ) ) ;
    public final void rule__SimpleValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:553:1: ( ( ( rule__SimpleValue__NameAssignment_0 ) ) )
            // InternalDsl.g:554:1: ( ( rule__SimpleValue__NameAssignment_0 ) )
            {
            // InternalDsl.g:554:1: ( ( rule__SimpleValue__NameAssignment_0 ) )
            // InternalDsl.g:555:2: ( rule__SimpleValue__NameAssignment_0 )
            {
             before(grammarAccess.getSimpleValueAccess().getNameAssignment_0()); 
            // InternalDsl.g:556:2: ( rule__SimpleValue__NameAssignment_0 )
            // InternalDsl.g:556:3: rule__SimpleValue__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleValue__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleValueAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__SimpleValue__Group__0__Impl"


    // $ANTLR start "rule__SimpleValue__Group__1"
    // InternalDsl.g:564:1: rule__SimpleValue__Group__1 : rule__SimpleValue__Group__1__Impl rule__SimpleValue__Group__2 ;
    public final void rule__SimpleValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:568:1: ( rule__SimpleValue__Group__1__Impl rule__SimpleValue__Group__2 )
            // InternalDsl.g:569:2: rule__SimpleValue__Group__1__Impl rule__SimpleValue__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__SimpleValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleValue__Group__1"


    // $ANTLR start "rule__SimpleValue__Group__1__Impl"
    // InternalDsl.g:576:1: rule__SimpleValue__Group__1__Impl : ( '=' ) ;
    public final void rule__SimpleValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:580:1: ( ( '=' ) )
            // InternalDsl.g:581:1: ( '=' )
            {
            // InternalDsl.g:581:1: ( '=' )
            // InternalDsl.g:582:2: '='
            {
             before(grammarAccess.getSimpleValueAccess().getEqualsSignKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSimpleValueAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__SimpleValue__Group__1__Impl"


    // $ANTLR start "rule__SimpleValue__Group__2"
    // InternalDsl.g:591:1: rule__SimpleValue__Group__2 : rule__SimpleValue__Group__2__Impl rule__SimpleValue__Group__3 ;
    public final void rule__SimpleValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:595:1: ( rule__SimpleValue__Group__2__Impl rule__SimpleValue__Group__3 )
            // InternalDsl.g:596:2: rule__SimpleValue__Group__2__Impl rule__SimpleValue__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__SimpleValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleValue__Group__2"


    // $ANTLR start "rule__SimpleValue__Group__2__Impl"
    // InternalDsl.g:603:1: rule__SimpleValue__Group__2__Impl : ( ( rule__SimpleValue__ValuesAssignment_2 ) ) ;
    public final void rule__SimpleValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:607:1: ( ( ( rule__SimpleValue__ValuesAssignment_2 ) ) )
            // InternalDsl.g:608:1: ( ( rule__SimpleValue__ValuesAssignment_2 ) )
            {
            // InternalDsl.g:608:1: ( ( rule__SimpleValue__ValuesAssignment_2 ) )
            // InternalDsl.g:609:2: ( rule__SimpleValue__ValuesAssignment_2 )
            {
             before(grammarAccess.getSimpleValueAccess().getValuesAssignment_2()); 
            // InternalDsl.g:610:2: ( rule__SimpleValue__ValuesAssignment_2 )
            // InternalDsl.g:610:3: rule__SimpleValue__ValuesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SimpleValue__ValuesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleValueAccess().getValuesAssignment_2()); 

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
    // $ANTLR end "rule__SimpleValue__Group__2__Impl"


    // $ANTLR start "rule__SimpleValue__Group__3"
    // InternalDsl.g:618:1: rule__SimpleValue__Group__3 : rule__SimpleValue__Group__3__Impl ;
    public final void rule__SimpleValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:622:1: ( rule__SimpleValue__Group__3__Impl )
            // InternalDsl.g:623:2: rule__SimpleValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleValue__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleValue__Group__3"


    // $ANTLR start "rule__SimpleValue__Group__3__Impl"
    // InternalDsl.g:629:1: rule__SimpleValue__Group__3__Impl : ( ( rule__SimpleValue__Group_3__0 )* ) ;
    public final void rule__SimpleValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:633:1: ( ( ( rule__SimpleValue__Group_3__0 )* ) )
            // InternalDsl.g:634:1: ( ( rule__SimpleValue__Group_3__0 )* )
            {
            // InternalDsl.g:634:1: ( ( rule__SimpleValue__Group_3__0 )* )
            // InternalDsl.g:635:2: ( rule__SimpleValue__Group_3__0 )*
            {
             before(grammarAccess.getSimpleValueAccess().getGroup_3()); 
            // InternalDsl.g:636:2: ( rule__SimpleValue__Group_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:636:3: rule__SimpleValue__Group_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__SimpleValue__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSimpleValueAccess().getGroup_3()); 

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
    // $ANTLR end "rule__SimpleValue__Group__3__Impl"


    // $ANTLR start "rule__SimpleValue__Group_3__0"
    // InternalDsl.g:645:1: rule__SimpleValue__Group_3__0 : rule__SimpleValue__Group_3__0__Impl rule__SimpleValue__Group_3__1 ;
    public final void rule__SimpleValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:649:1: ( rule__SimpleValue__Group_3__0__Impl rule__SimpleValue__Group_3__1 )
            // InternalDsl.g:650:2: rule__SimpleValue__Group_3__0__Impl rule__SimpleValue__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__SimpleValue__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleValue__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleValue__Group_3__0"


    // $ANTLR start "rule__SimpleValue__Group_3__0__Impl"
    // InternalDsl.g:657:1: rule__SimpleValue__Group_3__0__Impl : ( ',' ) ;
    public final void rule__SimpleValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:661:1: ( ( ',' ) )
            // InternalDsl.g:662:1: ( ',' )
            {
            // InternalDsl.g:662:1: ( ',' )
            // InternalDsl.g:663:2: ','
            {
             before(grammarAccess.getSimpleValueAccess().getCommaKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSimpleValueAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__SimpleValue__Group_3__0__Impl"


    // $ANTLR start "rule__SimpleValue__Group_3__1"
    // InternalDsl.g:672:1: rule__SimpleValue__Group_3__1 : rule__SimpleValue__Group_3__1__Impl ;
    public final void rule__SimpleValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:676:1: ( rule__SimpleValue__Group_3__1__Impl )
            // InternalDsl.g:677:2: rule__SimpleValue__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleValue__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleValue__Group_3__1"


    // $ANTLR start "rule__SimpleValue__Group_3__1__Impl"
    // InternalDsl.g:683:1: rule__SimpleValue__Group_3__1__Impl : ( ( rule__SimpleValue__ValuesAssignment_3_1 ) ) ;
    public final void rule__SimpleValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:687:1: ( ( ( rule__SimpleValue__ValuesAssignment_3_1 ) ) )
            // InternalDsl.g:688:1: ( ( rule__SimpleValue__ValuesAssignment_3_1 ) )
            {
            // InternalDsl.g:688:1: ( ( rule__SimpleValue__ValuesAssignment_3_1 ) )
            // InternalDsl.g:689:2: ( rule__SimpleValue__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getSimpleValueAccess().getValuesAssignment_3_1()); 
            // InternalDsl.g:690:2: ( rule__SimpleValue__ValuesAssignment_3_1 )
            // InternalDsl.g:690:3: rule__SimpleValue__ValuesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleValue__ValuesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleValueAccess().getValuesAssignment_3_1()); 

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
    // $ANTLR end "rule__SimpleValue__Group_3__1__Impl"


    // $ANTLR start "rule__CompositeValue__Group__0"
    // InternalDsl.g:699:1: rule__CompositeValue__Group__0 : rule__CompositeValue__Group__0__Impl rule__CompositeValue__Group__1 ;
    public final void rule__CompositeValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:703:1: ( rule__CompositeValue__Group__0__Impl rule__CompositeValue__Group__1 )
            // InternalDsl.g:704:2: rule__CompositeValue__Group__0__Impl rule__CompositeValue__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CompositeValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeValue__Group__0"


    // $ANTLR start "rule__CompositeValue__Group__0__Impl"
    // InternalDsl.g:711:1: rule__CompositeValue__Group__0__Impl : ( ( rule__CompositeValue__NameAssignment_0 ) ) ;
    public final void rule__CompositeValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:715:1: ( ( ( rule__CompositeValue__NameAssignment_0 ) ) )
            // InternalDsl.g:716:1: ( ( rule__CompositeValue__NameAssignment_0 ) )
            {
            // InternalDsl.g:716:1: ( ( rule__CompositeValue__NameAssignment_0 ) )
            // InternalDsl.g:717:2: ( rule__CompositeValue__NameAssignment_0 )
            {
             before(grammarAccess.getCompositeValueAccess().getNameAssignment_0()); 
            // InternalDsl.g:718:2: ( rule__CompositeValue__NameAssignment_0 )
            // InternalDsl.g:718:3: rule__CompositeValue__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeValue__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeValueAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__CompositeValue__Group__0__Impl"


    // $ANTLR start "rule__CompositeValue__Group__1"
    // InternalDsl.g:726:1: rule__CompositeValue__Group__1 : rule__CompositeValue__Group__1__Impl rule__CompositeValue__Group__2 ;
    public final void rule__CompositeValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:730:1: ( rule__CompositeValue__Group__1__Impl rule__CompositeValue__Group__2 )
            // InternalDsl.g:731:2: rule__CompositeValue__Group__1__Impl rule__CompositeValue__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__CompositeValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeValue__Group__1"


    // $ANTLR start "rule__CompositeValue__Group__1__Impl"
    // InternalDsl.g:738:1: rule__CompositeValue__Group__1__Impl : ( '{' ) ;
    public final void rule__CompositeValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:742:1: ( ( '{' ) )
            // InternalDsl.g:743:1: ( '{' )
            {
            // InternalDsl.g:743:1: ( '{' )
            // InternalDsl.g:744:2: '{'
            {
             before(grammarAccess.getCompositeValueAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCompositeValueAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__CompositeValue__Group__1__Impl"


    // $ANTLR start "rule__CompositeValue__Group__2"
    // InternalDsl.g:753:1: rule__CompositeValue__Group__2 : rule__CompositeValue__Group__2__Impl rule__CompositeValue__Group__3 ;
    public final void rule__CompositeValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:757:1: ( rule__CompositeValue__Group__2__Impl rule__CompositeValue__Group__3 )
            // InternalDsl.g:758:2: rule__CompositeValue__Group__2__Impl rule__CompositeValue__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__CompositeValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeValue__Group__2"


    // $ANTLR start "rule__CompositeValue__Group__2__Impl"
    // InternalDsl.g:765:1: rule__CompositeValue__Group__2__Impl : ( ( rule__CompositeValue__ValuesAssignment_2 )* ) ;
    public final void rule__CompositeValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:769:1: ( ( ( rule__CompositeValue__ValuesAssignment_2 )* ) )
            // InternalDsl.g:770:1: ( ( rule__CompositeValue__ValuesAssignment_2 )* )
            {
            // InternalDsl.g:770:1: ( ( rule__CompositeValue__ValuesAssignment_2 )* )
            // InternalDsl.g:771:2: ( rule__CompositeValue__ValuesAssignment_2 )*
            {
             before(grammarAccess.getCompositeValueAccess().getValuesAssignment_2()); 
            // InternalDsl.g:772:2: ( rule__CompositeValue__ValuesAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:772:3: rule__CompositeValue__ValuesAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__CompositeValue__ValuesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getCompositeValueAccess().getValuesAssignment_2()); 

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
    // $ANTLR end "rule__CompositeValue__Group__2__Impl"


    // $ANTLR start "rule__CompositeValue__Group__3"
    // InternalDsl.g:780:1: rule__CompositeValue__Group__3 : rule__CompositeValue__Group__3__Impl ;
    public final void rule__CompositeValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:784:1: ( rule__CompositeValue__Group__3__Impl )
            // InternalDsl.g:785:2: rule__CompositeValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeValue__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeValue__Group__3"


    // $ANTLR start "rule__CompositeValue__Group__3__Impl"
    // InternalDsl.g:791:1: rule__CompositeValue__Group__3__Impl : ( '}' ) ;
    public final void rule__CompositeValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:795:1: ( ( '}' ) )
            // InternalDsl.g:796:1: ( '}' )
            {
            // InternalDsl.g:796:1: ( '}' )
            // InternalDsl.g:797:2: '}'
            {
             before(grammarAccess.getCompositeValueAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCompositeValueAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__CompositeValue__Group__3__Impl"


    // $ANTLR start "rule__DisplayName__Group__0"
    // InternalDsl.g:807:1: rule__DisplayName__Group__0 : rule__DisplayName__Group__0__Impl rule__DisplayName__Group__1 ;
    public final void rule__DisplayName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:811:1: ( rule__DisplayName__Group__0__Impl rule__DisplayName__Group__1 )
            // InternalDsl.g:812:2: rule__DisplayName__Group__0__Impl rule__DisplayName__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__DisplayName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DisplayName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DisplayName__Group__0"


    // $ANTLR start "rule__DisplayName__Group__0__Impl"
    // InternalDsl.g:819:1: rule__DisplayName__Group__0__Impl : ( () ) ;
    public final void rule__DisplayName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:823:1: ( ( () ) )
            // InternalDsl.g:824:1: ( () )
            {
            // InternalDsl.g:824:1: ( () )
            // InternalDsl.g:825:2: ()
            {
             before(grammarAccess.getDisplayNameAccess().getDisplayNameAction_0()); 
            // InternalDsl.g:826:2: ()
            // InternalDsl.g:826:3: 
            {
            }

             after(grammarAccess.getDisplayNameAccess().getDisplayNameAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DisplayName__Group__0__Impl"


    // $ANTLR start "rule__DisplayName__Group__1"
    // InternalDsl.g:834:1: rule__DisplayName__Group__1 : rule__DisplayName__Group__1__Impl rule__DisplayName__Group__2 ;
    public final void rule__DisplayName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:838:1: ( rule__DisplayName__Group__1__Impl rule__DisplayName__Group__2 )
            // InternalDsl.g:839:2: rule__DisplayName__Group__1__Impl rule__DisplayName__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__DisplayName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DisplayName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DisplayName__Group__1"


    // $ANTLR start "rule__DisplayName__Group__1__Impl"
    // InternalDsl.g:846:1: rule__DisplayName__Group__1__Impl : ( 'displayName' ) ;
    public final void rule__DisplayName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:850:1: ( ( 'displayName' ) )
            // InternalDsl.g:851:1: ( 'displayName' )
            {
            // InternalDsl.g:851:1: ( 'displayName' )
            // InternalDsl.g:852:2: 'displayName'
            {
             before(grammarAccess.getDisplayNameAccess().getDisplayNameKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDisplayNameAccess().getDisplayNameKeyword_1()); 

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
    // $ANTLR end "rule__DisplayName__Group__1__Impl"


    // $ANTLR start "rule__DisplayName__Group__2"
    // InternalDsl.g:861:1: rule__DisplayName__Group__2 : rule__DisplayName__Group__2__Impl rule__DisplayName__Group__3 ;
    public final void rule__DisplayName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:865:1: ( rule__DisplayName__Group__2__Impl rule__DisplayName__Group__3 )
            // InternalDsl.g:866:2: rule__DisplayName__Group__2__Impl rule__DisplayName__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__DisplayName__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DisplayName__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DisplayName__Group__2"


    // $ANTLR start "rule__DisplayName__Group__2__Impl"
    // InternalDsl.g:873:1: rule__DisplayName__Group__2__Impl : ( '=' ) ;
    public final void rule__DisplayName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:877:1: ( ( '=' ) )
            // InternalDsl.g:878:1: ( '=' )
            {
            // InternalDsl.g:878:1: ( '=' )
            // InternalDsl.g:879:2: '='
            {
             before(grammarAccess.getDisplayNameAccess().getEqualsSignKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDisplayNameAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__DisplayName__Group__2__Impl"


    // $ANTLR start "rule__DisplayName__Group__3"
    // InternalDsl.g:888:1: rule__DisplayName__Group__3 : rule__DisplayName__Group__3__Impl ;
    public final void rule__DisplayName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:892:1: ( rule__DisplayName__Group__3__Impl )
            // InternalDsl.g:893:2: rule__DisplayName__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DisplayName__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DisplayName__Group__3"


    // $ANTLR start "rule__DisplayName__Group__3__Impl"
    // InternalDsl.g:899:1: rule__DisplayName__Group__3__Impl : ( ( rule__DisplayName__ValueAssignment_3 ) ) ;
    public final void rule__DisplayName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:903:1: ( ( ( rule__DisplayName__ValueAssignment_3 ) ) )
            // InternalDsl.g:904:1: ( ( rule__DisplayName__ValueAssignment_3 ) )
            {
            // InternalDsl.g:904:1: ( ( rule__DisplayName__ValueAssignment_3 ) )
            // InternalDsl.g:905:2: ( rule__DisplayName__ValueAssignment_3 )
            {
             before(grammarAccess.getDisplayNameAccess().getValueAssignment_3()); 
            // InternalDsl.g:906:2: ( rule__DisplayName__ValueAssignment_3 )
            // InternalDsl.g:906:3: rule__DisplayName__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DisplayName__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDisplayNameAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__DisplayName__Group__3__Impl"


    // $ANTLR start "rule__Metaprog__Group__0"
    // InternalDsl.g:915:1: rule__Metaprog__Group__0 : rule__Metaprog__Group__0__Impl rule__Metaprog__Group__1 ;
    public final void rule__Metaprog__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:919:1: ( rule__Metaprog__Group__0__Impl rule__Metaprog__Group__1 )
            // InternalDsl.g:920:2: rule__Metaprog__Group__0__Impl rule__Metaprog__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Metaprog__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metaprog__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metaprog__Group__0"


    // $ANTLR start "rule__Metaprog__Group__0__Impl"
    // InternalDsl.g:927:1: rule__Metaprog__Group__0__Impl : ( () ) ;
    public final void rule__Metaprog__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:931:1: ( ( () ) )
            // InternalDsl.g:932:1: ( () )
            {
            // InternalDsl.g:932:1: ( () )
            // InternalDsl.g:933:2: ()
            {
             before(grammarAccess.getMetaprogAccess().getMetaprogAction_0()); 
            // InternalDsl.g:934:2: ()
            // InternalDsl.g:934:3: 
            {
            }

             after(grammarAccess.getMetaprogAccess().getMetaprogAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metaprog__Group__0__Impl"


    // $ANTLR start "rule__Metaprog__Group__1"
    // InternalDsl.g:942:1: rule__Metaprog__Group__1 : rule__Metaprog__Group__1__Impl rule__Metaprog__Group__2 ;
    public final void rule__Metaprog__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:946:1: ( rule__Metaprog__Group__1__Impl rule__Metaprog__Group__2 )
            // InternalDsl.g:947:2: rule__Metaprog__Group__1__Impl rule__Metaprog__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Metaprog__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metaprog__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metaprog__Group__1"


    // $ANTLR start "rule__Metaprog__Group__1__Impl"
    // InternalDsl.g:954:1: rule__Metaprog__Group__1__Impl : ( 'metaprog' ) ;
    public final void rule__Metaprog__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:958:1: ( ( 'metaprog' ) )
            // InternalDsl.g:959:1: ( 'metaprog' )
            {
            // InternalDsl.g:959:1: ( 'metaprog' )
            // InternalDsl.g:960:2: 'metaprog'
            {
             before(grammarAccess.getMetaprogAccess().getMetaprogKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMetaprogAccess().getMetaprogKeyword_1()); 

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
    // $ANTLR end "rule__Metaprog__Group__1__Impl"


    // $ANTLR start "rule__Metaprog__Group__2"
    // InternalDsl.g:969:1: rule__Metaprog__Group__2 : rule__Metaprog__Group__2__Impl rule__Metaprog__Group__3 ;
    public final void rule__Metaprog__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:973:1: ( rule__Metaprog__Group__2__Impl rule__Metaprog__Group__3 )
            // InternalDsl.g:974:2: rule__Metaprog__Group__2__Impl rule__Metaprog__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Metaprog__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metaprog__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metaprog__Group__2"


    // $ANTLR start "rule__Metaprog__Group__2__Impl"
    // InternalDsl.g:981:1: rule__Metaprog__Group__2__Impl : ( '=' ) ;
    public final void rule__Metaprog__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:985:1: ( ( '=' ) )
            // InternalDsl.g:986:1: ( '=' )
            {
            // InternalDsl.g:986:1: ( '=' )
            // InternalDsl.g:987:2: '='
            {
             before(grammarAccess.getMetaprogAccess().getEqualsSignKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMetaprogAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__Metaprog__Group__2__Impl"


    // $ANTLR start "rule__Metaprog__Group__3"
    // InternalDsl.g:996:1: rule__Metaprog__Group__3 : rule__Metaprog__Group__3__Impl ;
    public final void rule__Metaprog__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1000:1: ( rule__Metaprog__Group__3__Impl )
            // InternalDsl.g:1001:2: rule__Metaprog__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Metaprog__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metaprog__Group__3"


    // $ANTLR start "rule__Metaprog__Group__3__Impl"
    // InternalDsl.g:1007:1: rule__Metaprog__Group__3__Impl : ( ( rule__Metaprog__ValueAssignment_3 ) ) ;
    public final void rule__Metaprog__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1011:1: ( ( ( rule__Metaprog__ValueAssignment_3 ) ) )
            // InternalDsl.g:1012:1: ( ( rule__Metaprog__ValueAssignment_3 ) )
            {
            // InternalDsl.g:1012:1: ( ( rule__Metaprog__ValueAssignment_3 ) )
            // InternalDsl.g:1013:2: ( rule__Metaprog__ValueAssignment_3 )
            {
             before(grammarAccess.getMetaprogAccess().getValueAssignment_3()); 
            // InternalDsl.g:1014:2: ( rule__Metaprog__ValueAssignment_3 )
            // InternalDsl.g:1014:3: rule__Metaprog__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Metaprog__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMetaprogAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__Metaprog__Group__3__Impl"


    // $ANTLR start "rule__AbstractSyntax__Group__0"
    // InternalDsl.g:1023:1: rule__AbstractSyntax__Group__0 : rule__AbstractSyntax__Group__0__Impl rule__AbstractSyntax__Group__1 ;
    public final void rule__AbstractSyntax__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1027:1: ( rule__AbstractSyntax__Group__0__Impl rule__AbstractSyntax__Group__1 )
            // InternalDsl.g:1028:2: rule__AbstractSyntax__Group__0__Impl rule__AbstractSyntax__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__AbstractSyntax__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractSyntax__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractSyntax__Group__0"


    // $ANTLR start "rule__AbstractSyntax__Group__0__Impl"
    // InternalDsl.g:1035:1: rule__AbstractSyntax__Group__0__Impl : ( () ) ;
    public final void rule__AbstractSyntax__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1039:1: ( ( () ) )
            // InternalDsl.g:1040:1: ( () )
            {
            // InternalDsl.g:1040:1: ( () )
            // InternalDsl.g:1041:2: ()
            {
             before(grammarAccess.getAbstractSyntaxAccess().getAbstractSyntaxAction_0()); 
            // InternalDsl.g:1042:2: ()
            // InternalDsl.g:1042:3: 
            {
            }

             after(grammarAccess.getAbstractSyntaxAccess().getAbstractSyntaxAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractSyntax__Group__0__Impl"


    // $ANTLR start "rule__AbstractSyntax__Group__1"
    // InternalDsl.g:1050:1: rule__AbstractSyntax__Group__1 : rule__AbstractSyntax__Group__1__Impl rule__AbstractSyntax__Group__2 ;
    public final void rule__AbstractSyntax__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1054:1: ( rule__AbstractSyntax__Group__1__Impl rule__AbstractSyntax__Group__2 )
            // InternalDsl.g:1055:2: rule__AbstractSyntax__Group__1__Impl rule__AbstractSyntax__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AbstractSyntax__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractSyntax__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractSyntax__Group__1"


    // $ANTLR start "rule__AbstractSyntax__Group__1__Impl"
    // InternalDsl.g:1062:1: rule__AbstractSyntax__Group__1__Impl : ( 'abstract-syntax' ) ;
    public final void rule__AbstractSyntax__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1066:1: ( ( 'abstract-syntax' ) )
            // InternalDsl.g:1067:1: ( 'abstract-syntax' )
            {
            // InternalDsl.g:1067:1: ( 'abstract-syntax' )
            // InternalDsl.g:1068:2: 'abstract-syntax'
            {
             before(grammarAccess.getAbstractSyntaxAccess().getAbstractSyntaxKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAbstractSyntaxAccess().getAbstractSyntaxKeyword_1()); 

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
    // $ANTLR end "rule__AbstractSyntax__Group__1__Impl"


    // $ANTLR start "rule__AbstractSyntax__Group__2"
    // InternalDsl.g:1077:1: rule__AbstractSyntax__Group__2 : rule__AbstractSyntax__Group__2__Impl rule__AbstractSyntax__Group__3 ;
    public final void rule__AbstractSyntax__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1081:1: ( rule__AbstractSyntax__Group__2__Impl rule__AbstractSyntax__Group__3 )
            // InternalDsl.g:1082:2: rule__AbstractSyntax__Group__2__Impl rule__AbstractSyntax__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__AbstractSyntax__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractSyntax__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractSyntax__Group__2"


    // $ANTLR start "rule__AbstractSyntax__Group__2__Impl"
    // InternalDsl.g:1089:1: rule__AbstractSyntax__Group__2__Impl : ( '{' ) ;
    public final void rule__AbstractSyntax__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1093:1: ( ( '{' ) )
            // InternalDsl.g:1094:1: ( '{' )
            {
            // InternalDsl.g:1094:1: ( '{' )
            // InternalDsl.g:1095:2: '{'
            {
             before(grammarAccess.getAbstractSyntaxAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAbstractSyntaxAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__AbstractSyntax__Group__2__Impl"


    // $ANTLR start "rule__AbstractSyntax__Group__3"
    // InternalDsl.g:1104:1: rule__AbstractSyntax__Group__3 : rule__AbstractSyntax__Group__3__Impl rule__AbstractSyntax__Group__4 ;
    public final void rule__AbstractSyntax__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1108:1: ( rule__AbstractSyntax__Group__3__Impl rule__AbstractSyntax__Group__4 )
            // InternalDsl.g:1109:2: rule__AbstractSyntax__Group__3__Impl rule__AbstractSyntax__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__AbstractSyntax__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractSyntax__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractSyntax__Group__3"


    // $ANTLR start "rule__AbstractSyntax__Group__3__Impl"
    // InternalDsl.g:1116:1: rule__AbstractSyntax__Group__3__Impl : ( ( rule__AbstractSyntax__ValuesAssignment_3 )* ) ;
    public final void rule__AbstractSyntax__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1120:1: ( ( ( rule__AbstractSyntax__ValuesAssignment_3 )* ) )
            // InternalDsl.g:1121:1: ( ( rule__AbstractSyntax__ValuesAssignment_3 )* )
            {
            // InternalDsl.g:1121:1: ( ( rule__AbstractSyntax__ValuesAssignment_3 )* )
            // InternalDsl.g:1122:2: ( rule__AbstractSyntax__ValuesAssignment_3 )*
            {
             before(grammarAccess.getAbstractSyntaxAccess().getValuesAssignment_3()); 
            // InternalDsl.g:1123:2: ( rule__AbstractSyntax__ValuesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:1123:3: rule__AbstractSyntax__ValuesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__AbstractSyntax__ValuesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getAbstractSyntaxAccess().getValuesAssignment_3()); 

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
    // $ANTLR end "rule__AbstractSyntax__Group__3__Impl"


    // $ANTLR start "rule__AbstractSyntax__Group__4"
    // InternalDsl.g:1131:1: rule__AbstractSyntax__Group__4 : rule__AbstractSyntax__Group__4__Impl ;
    public final void rule__AbstractSyntax__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1135:1: ( rule__AbstractSyntax__Group__4__Impl )
            // InternalDsl.g:1136:2: rule__AbstractSyntax__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractSyntax__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractSyntax__Group__4"


    // $ANTLR start "rule__AbstractSyntax__Group__4__Impl"
    // InternalDsl.g:1142:1: rule__AbstractSyntax__Group__4__Impl : ( '}' ) ;
    public final void rule__AbstractSyntax__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1146:1: ( ( '}' ) )
            // InternalDsl.g:1147:1: ( '}' )
            {
            // InternalDsl.g:1147:1: ( '}' )
            // InternalDsl.g:1148:2: '}'
            {
             before(grammarAccess.getAbstractSyntaxAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAbstractSyntaxAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__AbstractSyntax__Group__4__Impl"


    // $ANTLR start "rule__Semantic__Group__0"
    // InternalDsl.g:1158:1: rule__Semantic__Group__0 : rule__Semantic__Group__0__Impl rule__Semantic__Group__1 ;
    public final void rule__Semantic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1162:1: ( rule__Semantic__Group__0__Impl rule__Semantic__Group__1 )
            // InternalDsl.g:1163:2: rule__Semantic__Group__0__Impl rule__Semantic__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Semantic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Semantic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semantic__Group__0"


    // $ANTLR start "rule__Semantic__Group__0__Impl"
    // InternalDsl.g:1170:1: rule__Semantic__Group__0__Impl : ( () ) ;
    public final void rule__Semantic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1174:1: ( ( () ) )
            // InternalDsl.g:1175:1: ( () )
            {
            // InternalDsl.g:1175:1: ( () )
            // InternalDsl.g:1176:2: ()
            {
             before(grammarAccess.getSemanticAccess().getSemanticAction_0()); 
            // InternalDsl.g:1177:2: ()
            // InternalDsl.g:1177:3: 
            {
            }

             after(grammarAccess.getSemanticAccess().getSemanticAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semantic__Group__0__Impl"


    // $ANTLR start "rule__Semantic__Group__1"
    // InternalDsl.g:1185:1: rule__Semantic__Group__1 : rule__Semantic__Group__1__Impl rule__Semantic__Group__2 ;
    public final void rule__Semantic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1189:1: ( rule__Semantic__Group__1__Impl rule__Semantic__Group__2 )
            // InternalDsl.g:1190:2: rule__Semantic__Group__1__Impl rule__Semantic__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Semantic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Semantic__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semantic__Group__1"


    // $ANTLR start "rule__Semantic__Group__1__Impl"
    // InternalDsl.g:1197:1: rule__Semantic__Group__1__Impl : ( 'semantics' ) ;
    public final void rule__Semantic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1201:1: ( ( 'semantics' ) )
            // InternalDsl.g:1202:1: ( 'semantics' )
            {
            // InternalDsl.g:1202:1: ( 'semantics' )
            // InternalDsl.g:1203:2: 'semantics'
            {
             before(grammarAccess.getSemanticAccess().getSemanticsKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSemanticAccess().getSemanticsKeyword_1()); 

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
    // $ANTLR end "rule__Semantic__Group__1__Impl"


    // $ANTLR start "rule__Semantic__Group__2"
    // InternalDsl.g:1212:1: rule__Semantic__Group__2 : rule__Semantic__Group__2__Impl rule__Semantic__Group__3 ;
    public final void rule__Semantic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1216:1: ( rule__Semantic__Group__2__Impl rule__Semantic__Group__3 )
            // InternalDsl.g:1217:2: rule__Semantic__Group__2__Impl rule__Semantic__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Semantic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Semantic__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semantic__Group__2"


    // $ANTLR start "rule__Semantic__Group__2__Impl"
    // InternalDsl.g:1224:1: rule__Semantic__Group__2__Impl : ( '{' ) ;
    public final void rule__Semantic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1228:1: ( ( '{' ) )
            // InternalDsl.g:1229:1: ( '{' )
            {
            // InternalDsl.g:1229:1: ( '{' )
            // InternalDsl.g:1230:2: '{'
            {
             before(grammarAccess.getSemanticAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSemanticAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Semantic__Group__2__Impl"


    // $ANTLR start "rule__Semantic__Group__3"
    // InternalDsl.g:1239:1: rule__Semantic__Group__3 : rule__Semantic__Group__3__Impl rule__Semantic__Group__4 ;
    public final void rule__Semantic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1243:1: ( rule__Semantic__Group__3__Impl rule__Semantic__Group__4 )
            // InternalDsl.g:1244:2: rule__Semantic__Group__3__Impl rule__Semantic__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Semantic__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Semantic__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semantic__Group__3"


    // $ANTLR start "rule__Semantic__Group__3__Impl"
    // InternalDsl.g:1251:1: rule__Semantic__Group__3__Impl : ( ( rule__Semantic__ValuesAssignment_3 )* ) ;
    public final void rule__Semantic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1255:1: ( ( ( rule__Semantic__ValuesAssignment_3 )* ) )
            // InternalDsl.g:1256:1: ( ( rule__Semantic__ValuesAssignment_3 )* )
            {
            // InternalDsl.g:1256:1: ( ( rule__Semantic__ValuesAssignment_3 )* )
            // InternalDsl.g:1257:2: ( rule__Semantic__ValuesAssignment_3 )*
            {
             before(grammarAccess.getSemanticAccess().getValuesAssignment_3()); 
            // InternalDsl.g:1258:2: ( rule__Semantic__ValuesAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:1258:3: rule__Semantic__ValuesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Semantic__ValuesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getSemanticAccess().getValuesAssignment_3()); 

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
    // $ANTLR end "rule__Semantic__Group__3__Impl"


    // $ANTLR start "rule__Semantic__Group__4"
    // InternalDsl.g:1266:1: rule__Semantic__Group__4 : rule__Semantic__Group__4__Impl ;
    public final void rule__Semantic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1270:1: ( rule__Semantic__Group__4__Impl )
            // InternalDsl.g:1271:2: rule__Semantic__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Semantic__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semantic__Group__4"


    // $ANTLR start "rule__Semantic__Group__4__Impl"
    // InternalDsl.g:1277:1: rule__Semantic__Group__4__Impl : ( '}' ) ;
    public final void rule__Semantic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1281:1: ( ( '}' ) )
            // InternalDsl.g:1282:1: ( '}' )
            {
            // InternalDsl.g:1282:1: ( '}' )
            // InternalDsl.g:1283:2: '}'
            {
             before(grammarAccess.getSemanticAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSemanticAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Semantic__Group__4__Impl"


    // $ANTLR start "rule__Dsl__NameAssignment_1"
    // InternalDsl.g:1293:1: rule__Dsl__NameAssignment_1 : ( ( rule__Dsl__NameAlternatives_1_0 ) ) ;
    public final void rule__Dsl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1297:1: ( ( ( rule__Dsl__NameAlternatives_1_0 ) ) )
            // InternalDsl.g:1298:2: ( ( rule__Dsl__NameAlternatives_1_0 ) )
            {
            // InternalDsl.g:1298:2: ( ( rule__Dsl__NameAlternatives_1_0 ) )
            // InternalDsl.g:1299:3: ( rule__Dsl__NameAlternatives_1_0 )
            {
             before(grammarAccess.getDslAccess().getNameAlternatives_1_0()); 
            // InternalDsl.g:1300:3: ( rule__Dsl__NameAlternatives_1_0 )
            // InternalDsl.g:1300:4: rule__Dsl__NameAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Dsl__NameAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getDslAccess().getNameAlternatives_1_0()); 

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
    // $ANTLR end "rule__Dsl__NameAssignment_1"


    // $ANTLR start "rule__Dsl__DisplayNameAssignment_3"
    // InternalDsl.g:1308:1: rule__Dsl__DisplayNameAssignment_3 : ( ruleDisplayName ) ;
    public final void rule__Dsl__DisplayNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1312:1: ( ( ruleDisplayName ) )
            // InternalDsl.g:1313:2: ( ruleDisplayName )
            {
            // InternalDsl.g:1313:2: ( ruleDisplayName )
            // InternalDsl.g:1314:3: ruleDisplayName
            {
             before(grammarAccess.getDslAccess().getDisplayNameDisplayNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDisplayName();

            state._fsp--;

             after(grammarAccess.getDslAccess().getDisplayNameDisplayNameParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Dsl__DisplayNameAssignment_3"


    // $ANTLR start "rule__Dsl__MetaprogAssignment_4"
    // InternalDsl.g:1323:1: rule__Dsl__MetaprogAssignment_4 : ( ruleMetaprog ) ;
    public final void rule__Dsl__MetaprogAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1327:1: ( ( ruleMetaprog ) )
            // InternalDsl.g:1328:2: ( ruleMetaprog )
            {
            // InternalDsl.g:1328:2: ( ruleMetaprog )
            // InternalDsl.g:1329:3: ruleMetaprog
            {
             before(grammarAccess.getDslAccess().getMetaprogMetaprogParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaprog();

            state._fsp--;

             after(grammarAccess.getDslAccess().getMetaprogMetaprogParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Dsl__MetaprogAssignment_4"


    // $ANTLR start "rule__Dsl__AbstractSyntaxAssignment_5"
    // InternalDsl.g:1338:1: rule__Dsl__AbstractSyntaxAssignment_5 : ( ruleAbstractSyntax ) ;
    public final void rule__Dsl__AbstractSyntaxAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1342:1: ( ( ruleAbstractSyntax ) )
            // InternalDsl.g:1343:2: ( ruleAbstractSyntax )
            {
            // InternalDsl.g:1343:2: ( ruleAbstractSyntax )
            // InternalDsl.g:1344:3: ruleAbstractSyntax
            {
             before(grammarAccess.getDslAccess().getAbstractSyntaxAbstractSyntaxParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractSyntax();

            state._fsp--;

             after(grammarAccess.getDslAccess().getAbstractSyntaxAbstractSyntaxParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Dsl__AbstractSyntaxAssignment_5"


    // $ANTLR start "rule__Dsl__SemanticAssignment_6"
    // InternalDsl.g:1353:1: rule__Dsl__SemanticAssignment_6 : ( ruleSemantic ) ;
    public final void rule__Dsl__SemanticAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1357:1: ( ( ruleSemantic ) )
            // InternalDsl.g:1358:2: ( ruleSemantic )
            {
            // InternalDsl.g:1358:2: ( ruleSemantic )
            // InternalDsl.g:1359:3: ruleSemantic
            {
             before(grammarAccess.getDslAccess().getSemanticSemanticParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSemantic();

            state._fsp--;

             after(grammarAccess.getDslAccess().getSemanticSemanticParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Dsl__SemanticAssignment_6"


    // $ANTLR start "rule__Dsl__ValuesAssignment_7"
    // InternalDsl.g:1368:1: rule__Dsl__ValuesAssignment_7 : ( ruleValue ) ;
    public final void rule__Dsl__ValuesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1372:1: ( ( ruleValue ) )
            // InternalDsl.g:1373:2: ( ruleValue )
            {
            // InternalDsl.g:1373:2: ( ruleValue )
            // InternalDsl.g:1374:3: ruleValue
            {
             before(grammarAccess.getDslAccess().getValuesValueParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getDslAccess().getValuesValueParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Dsl__ValuesAssignment_7"


    // $ANTLR start "rule__SimpleValue__NameAssignment_0"
    // InternalDsl.g:1383:1: rule__SimpleValue__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SimpleValue__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1387:1: ( ( RULE_ID ) )
            // InternalDsl.g:1388:2: ( RULE_ID )
            {
            // InternalDsl.g:1388:2: ( RULE_ID )
            // InternalDsl.g:1389:3: RULE_ID
            {
             before(grammarAccess.getSimpleValueAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSimpleValueAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__SimpleValue__NameAssignment_0"


    // $ANTLR start "rule__SimpleValue__ValuesAssignment_2"
    // InternalDsl.g:1398:1: rule__SimpleValue__ValuesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SimpleValue__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1402:1: ( ( RULE_STRING ) )
            // InternalDsl.g:1403:2: ( RULE_STRING )
            {
            // InternalDsl.g:1403:2: ( RULE_STRING )
            // InternalDsl.g:1404:3: RULE_STRING
            {
             before(grammarAccess.getSimpleValueAccess().getValuesSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSimpleValueAccess().getValuesSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__SimpleValue__ValuesAssignment_2"


    // $ANTLR start "rule__SimpleValue__ValuesAssignment_3_1"
    // InternalDsl.g:1413:1: rule__SimpleValue__ValuesAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__SimpleValue__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1417:1: ( ( RULE_STRING ) )
            // InternalDsl.g:1418:2: ( RULE_STRING )
            {
            // InternalDsl.g:1418:2: ( RULE_STRING )
            // InternalDsl.g:1419:3: RULE_STRING
            {
             before(grammarAccess.getSimpleValueAccess().getValuesSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSimpleValueAccess().getValuesSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__SimpleValue__ValuesAssignment_3_1"


    // $ANTLR start "rule__CompositeValue__NameAssignment_0"
    // InternalDsl.g:1428:1: rule__CompositeValue__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__CompositeValue__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1432:1: ( ( RULE_ID ) )
            // InternalDsl.g:1433:2: ( RULE_ID )
            {
            // InternalDsl.g:1433:2: ( RULE_ID )
            // InternalDsl.g:1434:3: RULE_ID
            {
             before(grammarAccess.getCompositeValueAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompositeValueAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__CompositeValue__NameAssignment_0"


    // $ANTLR start "rule__CompositeValue__ValuesAssignment_2"
    // InternalDsl.g:1443:1: rule__CompositeValue__ValuesAssignment_2 : ( ruleValue ) ;
    public final void rule__CompositeValue__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1447:1: ( ( ruleValue ) )
            // InternalDsl.g:1448:2: ( ruleValue )
            {
            // InternalDsl.g:1448:2: ( ruleValue )
            // InternalDsl.g:1449:3: ruleValue
            {
             before(grammarAccess.getCompositeValueAccess().getValuesValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getCompositeValueAccess().getValuesValueParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__CompositeValue__ValuesAssignment_2"


    // $ANTLR start "rule__DisplayName__ValueAssignment_3"
    // InternalDsl.g:1458:1: rule__DisplayName__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__DisplayName__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1462:1: ( ( RULE_STRING ) )
            // InternalDsl.g:1463:2: ( RULE_STRING )
            {
            // InternalDsl.g:1463:2: ( RULE_STRING )
            // InternalDsl.g:1464:3: RULE_STRING
            {
             before(grammarAccess.getDisplayNameAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDisplayNameAccess().getValueSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__DisplayName__ValueAssignment_3"


    // $ANTLR start "rule__Metaprog__ValueAssignment_3"
    // InternalDsl.g:1473:1: rule__Metaprog__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Metaprog__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1477:1: ( ( RULE_STRING ) )
            // InternalDsl.g:1478:2: ( RULE_STRING )
            {
            // InternalDsl.g:1478:2: ( RULE_STRING )
            // InternalDsl.g:1479:3: RULE_STRING
            {
             before(grammarAccess.getMetaprogAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMetaprogAccess().getValueSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Metaprog__ValueAssignment_3"


    // $ANTLR start "rule__AbstractSyntax__ValuesAssignment_3"
    // InternalDsl.g:1488:1: rule__AbstractSyntax__ValuesAssignment_3 : ( ruleValue ) ;
    public final void rule__AbstractSyntax__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1492:1: ( ( ruleValue ) )
            // InternalDsl.g:1493:2: ( ruleValue )
            {
            // InternalDsl.g:1493:2: ( ruleValue )
            // InternalDsl.g:1494:3: ruleValue
            {
             before(grammarAccess.getAbstractSyntaxAccess().getValuesValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getAbstractSyntaxAccess().getValuesValueParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__AbstractSyntax__ValuesAssignment_3"


    // $ANTLR start "rule__Semantic__ValuesAssignment_3"
    // InternalDsl.g:1503:1: rule__Semantic__ValuesAssignment_3 : ( ruleValue ) ;
    public final void rule__Semantic__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1507:1: ( ( ruleValue ) )
            // InternalDsl.g:1508:2: ( ruleValue )
            {
            // InternalDsl.g:1508:2: ( ruleValue )
            // InternalDsl.g:1509:3: ruleValue
            {
             before(grammarAccess.getSemanticAccess().getValuesValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getSemanticAccess().getValuesValueParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Semantic__ValuesAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000001E4020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});

}