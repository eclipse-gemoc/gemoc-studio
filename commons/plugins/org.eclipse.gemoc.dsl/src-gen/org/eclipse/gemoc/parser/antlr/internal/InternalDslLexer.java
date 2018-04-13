package org.eclipse.gemoc.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslLexer extends Lexer {
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
            // InternalDsl.g:11:6: ( '\\r' )
            // InternalDsl.g:11:8: '\\r'
            {
            match('\r'); 

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
            // InternalDsl.g:12:6: ( '\\n' )
            // InternalDsl.g:12:8: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:13:7: ( '\\\\' )
            // InternalDsl.g:13:9: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:578:17: ( ( '!' | '#' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDsl.g:578:19: ( '!' | '#' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            if ( input.LA(1)=='!'||input.LA(1)=='#' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalDsl.g:578:29: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:578:29: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalDsl.g:578:45: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:578:46: ( '\\r' )? '\\n'
                    {
                    // InternalDsl.g:578:46: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalDsl.g:578:46: '\\r'
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
            // InternalDsl.g:580:13: (~ ( ( RULE_SEPARATOR | RULE_SPACE | '\\\\\\n' | '\\r' | '\\n' ) ) )
            // InternalDsl.g:580:15: ~ ( ( RULE_SEPARATOR | RULE_SPACE | '\\\\\\n' | '\\r' | '\\n' ) )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='9')||(input.LA(1)>=';' && input.LA(1)<='<')||(input.LA(1)>='>' && input.LA(1)<='\uFFFF') ) {
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
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_SEPARATOR"
    public final void mRULE_SEPARATOR() throws RecognitionException {
        try {
            int _type = RULE_SEPARATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:582:16: ( ( '=' | ':' ) )
            // InternalDsl.g:582:18: ( '=' | ':' )
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

    // $ANTLR start "RULE_SPACE"
    public final void mRULE_SPACE() throws RecognitionException {
        try {
            int _type = RULE_SPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:584:12: ( ( ' ' | '\\t' ) )
            // InternalDsl.g:584:14: ( ' ' | '\\t' )
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
        // InternalDsl.g:1:8: ( T__8 | T__9 | T__10 | RULE_SL_COMMENT | RULE_LETTER | RULE_SEPARATOR | RULE_SPACE )
        int alt4=7;
        alt4 = dfa4.predict(input);
        switch (alt4) {
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
                // InternalDsl.g:1:20: T__10
                {
                mT__10(); 

                }
                break;
            case 4 :
                // InternalDsl.g:1:26: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 5 :
                // InternalDsl.g:1:42: RULE_LETTER
                {
                mRULE_LETTER(); 

                }
                break;
            case 6 :
                // InternalDsl.g:1:54: RULE_SEPARATOR
                {
                mRULE_SEPARATOR(); 

                }
                break;
            case 7 :
                // InternalDsl.g:1:69: RULE_SPACE
                {
                mRULE_SPACE(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\12\uffff";
    static final String DFA4_eofS =
        "\12\uffff";
    static final String DFA4_minS =
        "\1\0\11\uffff";
    static final String DFA4_maxS =
        "\1\uffff\11\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\3\1\4";
    static final String DFA4_specialS =
        "\1\0\11\uffff}>";
    static final String[] DFA4_transitionS = {
            "\11\5\1\7\1\2\2\5\1\1\22\5\1\7\1\4\1\5\1\4\26\5\1\6\2\5\1\6\36\5\1\3\uffa3\5",
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

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | RULE_SL_COMMENT | RULE_LETTER | RULE_SEPARATOR | RULE_SPACE );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_0 = input.LA(1);

                        s = -1;
                        if ( (LA4_0=='\r') ) {s = 1;}

                        else if ( (LA4_0=='\n') ) {s = 2;}

                        else if ( (LA4_0=='\\') ) {s = 3;}

                        else if ( (LA4_0=='!'||LA4_0=='#') ) {s = 4;}

                        else if ( ((LA4_0>='\u0000' && LA4_0<='\b')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\u001F')||LA4_0=='\"'||(LA4_0>='$' && LA4_0<='9')||(LA4_0>=';' && LA4_0<='<')||(LA4_0>='>' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {s = 5;}

                        else if ( (LA4_0==':'||LA4_0=='=') ) {s = 6;}

                        else if ( (LA4_0=='\t'||LA4_0==' ') ) {s = 7;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}