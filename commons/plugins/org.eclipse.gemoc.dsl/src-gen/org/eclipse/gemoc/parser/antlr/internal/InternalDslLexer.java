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
    public static final int RULE_SPECIAL_CHAR=10;
    public static final int RULE_WS=5;
    public static final int RULE_STRING=8;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SEPARATOR=6;
    public static final int RULE_SL_COMMENT=4;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_ENTRYKEY=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_LINE_START=9;
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

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:11:7: ( '\\r' )
            // InternalDsl.g:11:9: '\\r'
            {
            match('\r'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:12:7: ( '\\n' )
            // InternalDsl.g:12:9: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:13:7: ( 'name' )
            // InternalDsl.g:13:9: 'name'
            {
            match("name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:14:7: ( ',' )
            // InternalDsl.g:14:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:15:7: ( '\\\\' )
            // InternalDsl.g:15:9: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "RULE_ENTRYKEY"
    public final void mRULE_ENTRYKEY() throws RecognitionException {
        try {
            int _type = RULE_ENTRYKEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:646:15: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '0' .. '9' )* )
            // InternalDsl.g:646:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '0' .. '9' )*
            {
            if ( input.LA(1)=='.'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalDsl.g:646:54: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='.'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:
            	    {
            	    if ( input.LA(1)=='.'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENTRYKEY"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:648:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' | '\\r' | '\\n' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"' )
            // InternalDsl.g:648:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' | '\\r' | '\\n' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"'
            {
            match('\"'); 
            // InternalDsl.g:648:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' | '\\r' | '\\n' ) | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDsl.g:648:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' | '\\r' | '\\n' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\n'||input.LA(1)=='\r'||input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalDsl.g:648:75: ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_LINE_START"
    public final void mRULE_LINE_START() throws RecognitionException {
        try {
            int _type = RULE_LINE_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:650:17: ( ( '\\r' )? '\\n' ( RULE_WS )* )
            // InternalDsl.g:650:19: ( '\\r' )? '\\n' ( RULE_WS )*
            {
            // InternalDsl.g:650:19: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:650:19: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            // InternalDsl.g:650:30: ( RULE_WS )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\t'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDsl.g:650:30: RULE_WS
            	    {
            	    mRULE_WS(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LINE_START"

    // $ANTLR start "RULE_SEPARATOR"
    public final void mRULE_SEPARATOR() throws RecognitionException {
        try {
            int _type = RULE_SEPARATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:652:16: ( '=' )
            // InternalDsl.g:652:18: '='
            {
            match('='); 

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
            // InternalDsl.g:654:17: ( ( '!' | '#' ) (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalDsl.g:654:19: ( '!' | '#' ) (~ ( ( '\\n' | '\\r' ) ) )*
            {
            if ( input.LA(1)=='!'||input.LA(1)=='#' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalDsl.g:654:29: (~ ( ( '\\n' | '\\r' ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:654:29: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:656:9: ( ( ' ' | '\\t' ) )
            // InternalDsl.g:656:11: ( ' ' | '\\t' )
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
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_SPECIAL_CHAR"
    public final void mRULE_SPECIAL_CHAR() throws RecognitionException {
        try {
            int _type = RULE_SPECIAL_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:658:19: ( ( '#' .. '+' | '-' .. '/' | ':' .. '<' | '>' .. '@' | '[' .. '^' | '{' .. '~' ) )
            // InternalDsl.g:658:21: ( '#' .. '+' | '-' .. '/' | ':' .. '<' | '>' .. '@' | '[' .. '^' | '{' .. '~' )
            {
            if ( (input.LA(1)>='#' && input.LA(1)<='+')||(input.LA(1)>='-' && input.LA(1)<='/')||(input.LA(1)>=':' && input.LA(1)<='<')||(input.LA(1)>='>' && input.LA(1)<='@')||(input.LA(1)>='[' && input.LA(1)<='^')||(input.LA(1)>='{' && input.LA(1)<='~') ) {
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
    // $ANTLR end "RULE_SPECIAL_CHAR"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:660:16: ( . )
            // InternalDsl.g:660:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalDsl.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | RULE_ENTRYKEY | RULE_STRING | RULE_LINE_START | RULE_SEPARATOR | RULE_SL_COMMENT | RULE_WS | RULE_SPECIAL_CHAR | RULE_ANY_OTHER )
        int alt6=13;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // InternalDsl.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalDsl.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalDsl.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalDsl.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalDsl.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalDsl.g:1:40: RULE_ENTRYKEY
                {
                mRULE_ENTRYKEY(); 

                }
                break;
            case 7 :
                // InternalDsl.g:1:54: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 8 :
                // InternalDsl.g:1:66: RULE_LINE_START
                {
                mRULE_LINE_START(); 

                }
                break;
            case 9 :
                // InternalDsl.g:1:82: RULE_SEPARATOR
                {
                mRULE_SEPARATOR(); 

                }
                break;
            case 10 :
                // InternalDsl.g:1:97: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 11 :
                // InternalDsl.g:1:113: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 12 :
                // InternalDsl.g:1:121: RULE_SPECIAL_CHAR
                {
                mRULE_SPECIAL_CHAR(); 

                }
                break;
            case 13 :
                // InternalDsl.g:1:139: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\1\17\1\21\1\23\3\uffff\1\16\12\uffff\1\23\10\uffff\1\23\1\35\1\uffff";
    static final String DFA6_eofS =
        "\36\uffff";
    static final String DFA6_minS =
        "\1\0\1\12\1\11\1\141\3\uffff\1\0\12\uffff\1\155\10\uffff\1\145\1\56\1\uffff";
    static final String DFA6_maxS =
        "\1\uffff\1\12\1\40\1\141\3\uffff\1\uffff\12\uffff\1\155\10\uffff\1\145\1\172\1\uffff";
    static final String DFA6_acceptS =
        "\4\uffff\1\4\1\5\1\6\1\uffff\1\11\1\12\1\13\1\6\1\12\1\14\1\15\1\1\1\10\1\2\1\uffff\1\6\1\4\1\5\1\7\1\11\1\12\1\13\1\14\2\uffff\1\3";
    static final String DFA6_specialS =
        "\1\1\6\uffff\1\0\26\uffff}>";
    static final String[] DFA6_transitionS = {
            "\11\16\1\12\1\2\2\16\1\1\22\16\1\12\1\14\1\7\1\11\10\15\1\4\1\15\1\6\1\15\12\13\3\15\1\10\3\15\32\13\1\15\1\5\2\15\1\13\1\16\15\13\1\3\14\13\4\15\uff81\16",
            "\1\20",
            "\1\20\26\uffff\1\20",
            "\1\22",
            "",
            "",
            "",
            "\12\26\1\uffff\2\26\1\uffff\ufff2\26",
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
            "\1\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\34",
            "\1\23\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | RULE_ENTRYKEY | RULE_STRING | RULE_LINE_START | RULE_SEPARATOR | RULE_SL_COMMENT | RULE_WS | RULE_SPECIAL_CHAR | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_7 = input.LA(1);

                        s = -1;
                        if ( ((LA6_7>='\u0000' && LA6_7<='\t')||(LA6_7>='\u000B' && LA6_7<='\f')||(LA6_7>='\u000E' && LA6_7<='\uFFFF')) ) {s = 22;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_0 = input.LA(1);

                        s = -1;
                        if ( (LA6_0=='\r') ) {s = 1;}

                        else if ( (LA6_0=='\n') ) {s = 2;}

                        else if ( (LA6_0=='n') ) {s = 3;}

                        else if ( (LA6_0==',') ) {s = 4;}

                        else if ( (LA6_0=='\\') ) {s = 5;}

                        else if ( (LA6_0=='.') ) {s = 6;}

                        else if ( (LA6_0=='\"') ) {s = 7;}

                        else if ( (LA6_0=='=') ) {s = 8;}

                        else if ( (LA6_0=='#') ) {s = 9;}

                        else if ( (LA6_0=='\t'||LA6_0==' ') ) {s = 10;}

                        else if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='m')||(LA6_0>='o' && LA6_0<='z')) ) {s = 11;}

                        else if ( (LA6_0=='!') ) {s = 12;}

                        else if ( ((LA6_0>='$' && LA6_0<='+')||LA6_0=='-'||LA6_0=='/'||(LA6_0>=':' && LA6_0<='<')||(LA6_0>='>' && LA6_0<='@')||LA6_0=='['||(LA6_0>=']' && LA6_0<='^')||(LA6_0>='{' && LA6_0<='~')) ) {s = 13;}

                        else if ( ((LA6_0>='\u0000' && LA6_0<='\b')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\u001F')||LA6_0=='`'||(LA6_0>='\u007F' && LA6_0<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}