package org.eclipse.gemoc.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslLexer extends Lexer {
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int RULE_SEPARATOR=6;
    public static final int RULE_SL_COMMENT=7;
    public static final int RULE_LETTER=4;
    public static final int RULE_SPACE=5;
    public static final int EOF=-1;

    // delegates
    // delegators

    public InternalDslLexer() {;} 
    public InternalDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalDsl.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:11:6: ( '\\n' )
            // InternalDsl.g:11:8: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:12:6: ( '\\\\\\n' )
            // InternalDsl.g:12:8: '\\\\\\n'
            {
            match("\\\n"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "RULE_SEPARATOR"
    public final void mRULE_SEPARATOR() throws RecognitionException {
        try {
            int _type = RULE_SEPARATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:922:16: ( ( '=' | ':' ) )
            // InternalDsl.g:922:18: ( '=' | ':' )
            {
            if ( input.LA(1)==':'||input.LA(1)=='=' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEPARATOR"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:924:17: ( ( '!' | '#' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDsl.g:924:19: ( '!' | '#' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            if ( input.LA(1)=='!'||input.LA(1)=='#' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalDsl.g:924:29: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:924:29: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalDsl.g:924:45: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:924:46: ( '\\r' )? '\\n'
                    {
                    // InternalDsl.g:924:46: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalDsl.g:924:46: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            int _type = RULE_LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:926:13: ( (~ ( ( RULE_SEPARATOR | RULE_SPACE | '\\\\\\n' | '\\r' | '\\n' ) ) | '\\\\=' | '\\\\:' | '\\\\#' | '\\\\!' ) )
            // InternalDsl.g:926:15: (~ ( ( RULE_SEPARATOR | RULE_SPACE | '\\\\\\n' | '\\r' | '\\n' ) ) | '\\\\=' | '\\\\:' | '\\\\#' | '\\\\!' )
            {
            // InternalDsl.g:926:15: (~ ( ( RULE_SEPARATOR | RULE_SPACE | '\\\\\\n' | '\\r' | '\\n' ) ) | '\\\\=' | '\\\\:' | '\\\\#' | '\\\\!' )
            int alt4=5;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '=':
                    {
                    alt4=2;
                    }
                    break;
                case ':':
                    {
                    alt4=3;
                    }
                    break;
                case '#':
                    {
                    alt4=4;
                    }
                    break;
                case '!':
                    {
                    alt4=5;
                    }
                    break;
                default:
                    alt4=1;}

            }
            else if ( ((LA4_0>='\u0000' && LA4_0<='\b')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\u001F')||(LA4_0>='!' && LA4_0<='9')||(LA4_0>=';' && LA4_0<='<')||(LA4_0>='>' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                alt4=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:926:16: ~ ( ( RULE_SEPARATOR | RULE_SPACE | '\\\\\\n' | '\\r' | '\\n' ) )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='9')||(input.LA(1)>=';' && input.LA(1)<='<')||(input.LA(1)>='>' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // InternalDsl.g:926:64: '\\\\='
                    {
                    match("\\="); 


                    }
                    break;
                case 3 :
                    // InternalDsl.g:926:70: '\\\\:'
                    {
                    match("\\:"); 


                    }
                    break;
                case 4 :
                    // InternalDsl.g:926:76: '\\\\#'
                    {
                    match("\\#"); 


                    }
                    break;
                case 5 :
                    // InternalDsl.g:926:82: '\\\\!'
                    {
                    match("\\!"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_SPACE"
    public final void mRULE_SPACE() throws RecognitionException {
        try {
            int _type = RULE_SPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:928:12: ( ( ' ' | '\\t' ) )
            // InternalDsl.g:928:14: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SPACE"

    public void mTokens() throws RecognitionException {
        // InternalDsl.g:1:8: ( T__8 | T__9 | RULE_SEPARATOR | RULE_SL_COMMENT | RULE_LETTER | RULE_SPACE )
        int alt5=6;
        int LA5_0 = input.LA(1);

        if ( (LA5_0=='\n') ) {
            alt5=1;
        }
        else if ( (LA5_0=='\\') ) {
            int LA5_2 = input.LA(2);

            if ( (LA5_2=='\n') ) {
                alt5=2;
            }
            else {
                alt5=5;}
        }
        else if ( (LA5_0==':'||LA5_0=='=') ) {
            alt5=3;
        }
        else if ( (LA5_0=='!'||LA5_0=='#') ) {
            alt5=4;
        }
        else if ( ((LA5_0>='\u0000' && LA5_0<='\b')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\u001F')||LA5_0=='\"'||(LA5_0>='$' && LA5_0<='9')||(LA5_0>=';' && LA5_0<='<')||(LA5_0>='>' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
            alt5=5;
        }
        else if ( (LA5_0=='\t'||LA5_0==' ') ) {
            alt5=6;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("", 5, 0, input);

            throw nvae;
        }
        switch (alt5) {
            case 1 :
                // InternalDsl.g:1:10: T__8
                {
                mT__8(); 

                }
                break;
            case 2 :
                // InternalDsl.g:1:15: T__9
                {
                mT__9(); 

                }
                break;
            case 3 :
                // InternalDsl.g:1:20: RULE_SEPARATOR
                {
                mRULE_SEPARATOR(); 

                }
                break;
            case 4 :
                // InternalDsl.g:1:35: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 5 :
                // InternalDsl.g:1:51: RULE_LETTER
                {
                mRULE_LETTER(); 

                }
                break;
            case 6 :
                // InternalDsl.g:1:63: RULE_SPACE
                {
                mRULE_SPACE(); 

                }
                break;

        }

    }


 

}