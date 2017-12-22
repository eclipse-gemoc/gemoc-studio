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
            // InternalDsl.g:11:6: ( 'name' )
            // InternalDsl.g:11:8: 'name'
            {
            match("name"); 


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
            // InternalDsl.g:13:7: ( '\\\\\\n' )
            // InternalDsl.g:13:9: '\\\\\\n'
            {
            match("\\\n"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "RULE_SEPARATOR"
    public final void mRULE_SEPARATOR() throws RecognitionException {
        try {
            int _type = RULE_SEPARATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:1180:16: ( ( '=' | ':' ) )
            // InternalDsl.g:1180:18: ( '=' | ':' )
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
            // InternalDsl.g:1182:17: ( ( '!' | '#' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDsl.g:1182:19: ( '!' | '#' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            if ( input.LA(1)=='!'||input.LA(1)=='#' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalDsl.g:1182:29: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:1182:29: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalDsl.g:1182:45: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:1182:46: ( '\\r' )? '\\n'
                    {
                    // InternalDsl.g:1182:46: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalDsl.g:1182:46: '\\r'
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
            // InternalDsl.g:1184:13: ( (~ ( ( RULE_SEPARATOR | RULE_SPACE | '\\\\\\n' | '\\r' | '\\n' ) ) | '\\\\=' | '\\\\:' | '\\\\#' | '\\\\!' ) )
            // InternalDsl.g:1184:15: (~ ( ( RULE_SEPARATOR | RULE_SPACE | '\\\\\\n' | '\\r' | '\\n' ) ) | '\\\\=' | '\\\\:' | '\\\\#' | '\\\\!' )
            {
            // InternalDsl.g:1184:15: (~ ( ( RULE_SEPARATOR | RULE_SPACE | '\\\\\\n' | '\\r' | '\\n' ) ) | '\\\\=' | '\\\\:' | '\\\\#' | '\\\\!' )
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
                    // InternalDsl.g:1184:16: ~ ( ( RULE_SEPARATOR | RULE_SPACE | '\\\\\\n' | '\\r' | '\\n' ) )
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
                    // InternalDsl.g:1184:64: '\\\\='
                    {
                    match("\\="); 


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1184:70: '\\\\:'
                    {
                    match("\\:"); 


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1184:76: '\\\\#'
                    {
                    match("\\#"); 


                    }
                    break;
                case 5 :
                    // InternalDsl.g:1184:82: '\\\\!'
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
            // InternalDsl.g:1186:12: ( ( ' ' | '\\t' ) )
            // InternalDsl.g:1186:14: ( ' ' | '\\t' )
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
        // InternalDsl.g:1:8: ( T__8 | T__9 | T__10 | RULE_SEPARATOR | RULE_SL_COMMENT | RULE_LETTER | RULE_SPACE )
        int alt5=7;
        alt5 = dfa5.predict(input);
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
                // InternalDsl.g:1:20: T__10
                {
                mT__10(); 

                }
                break;
            case 4 :
                // InternalDsl.g:1:26: RULE_SEPARATOR
                {
                mRULE_SEPARATOR(); 

                }
                break;
            case 5 :
                // InternalDsl.g:1:41: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 6 :
                // InternalDsl.g:1:57: RULE_LETTER
                {
                mRULE_LETTER(); 

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


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\1\uffff\1\6\1\uffff\1\6\7\uffff";
    static final String DFA5_eofS =
        "\13\uffff";
    static final String DFA5_minS =
        "\1\0\1\141\1\uffff\1\12\7\uffff";
    static final String DFA5_maxS =
        "\1\uffff\1\141\1\uffff\1\12\7\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\5\1\6\1\7\1\1\1\3\1\5";
    static final String DFA5_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA5_transitionS = {
            "\11\6\1\7\1\2\2\6\1\uffff\22\6\1\7\1\5\1\6\1\5\26\6\1\4\2\6\1\4\36\6\1\3\21\6\1\1\uff91\6",
            "\1\10",
            "",
            "\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | RULE_SEPARATOR | RULE_SL_COMMENT | RULE_LETTER | RULE_SPACE );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_0 = input.LA(1);

                        s = -1;
                        if ( (LA5_0=='n') ) {s = 1;}

                        else if ( (LA5_0=='\n') ) {s = 2;}

                        else if ( (LA5_0=='\\') ) {s = 3;}

                        else if ( (LA5_0==':'||LA5_0=='=') ) {s = 4;}

                        else if ( (LA5_0=='!'||LA5_0=='#') ) {s = 5;}

                        else if ( ((LA5_0>='\u0000' && LA5_0<='\b')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\u001F')||LA5_0=='\"'||(LA5_0>='$' && LA5_0<='9')||(LA5_0>=';' && LA5_0<='<')||(LA5_0>='>' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='m')||(LA5_0>='o' && LA5_0<='\uFFFF')) ) {s = 6;}

                        else if ( (LA5_0=='\t'||LA5_0==' ') ) {s = 7;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}