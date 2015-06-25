package org.xtext.example.mydsl.datatypes.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:11:7: ( 'AnySimpleType' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:11:9: 'AnySimpleType'
            {
            match("AnySimpleType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:12:7: ( 'AnyURI' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:12:9: 'AnyURI'
            {
            match("AnyURI"); 


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
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:13:7: ( 'Base64Binary' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:13:9: 'Base64Binary'
            {
            match("Base64Binary"); 


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
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:14:7: ( 'Boolean' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:14:9: 'Boolean'
            {
            match("Boolean"); 


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
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:15:7: ( 'Byte' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:15:9: 'Byte'
            {
            match("Byte"); 


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
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:16:7: ( 'Date' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:16:9: 'Date'
            {
            match("Date"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:17:7: ( 'DateTime' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:17:9: 'DateTime'
            {
            match("DateTime"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:18:7: ( 'Decimal' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:18:9: 'Decimal'
            {
            match("Decimal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:19:7: ( 'Double' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:19:9: 'Double'
            {
            match("Double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:20:7: ( 'Duration' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:20:9: 'Duration'
            {
            match("Duration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:21:7: ( 'ENTITIES' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:21:9: 'ENTITIES'
            {
            match("ENTITIES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:22:7: ( 'ENTITY' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:22:9: 'ENTITY'
            {
            match("ENTITY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:23:7: ( 'Float' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:23:9: 'Float'
            {
            match("Float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:24:7: ( 'GDay' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:24:9: 'GDay'
            {
            match("GDay"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:25:7: ( 'GMonth' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:25:9: 'GMonth'
            {
            match("GMonth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:26:7: ( 'GMonthDay' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:26:9: 'GMonthDay'
            {
            match("GMonthDay"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:27:7: ( 'GYear' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:27:9: 'GYear'
            {
            match("GYear"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:28:7: ( 'GYearMonth' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:28:9: 'GYearMonth'
            {
            match("GYearMonth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:29:7: ( 'HexBinary' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:29:9: 'HexBinary'
            {
            match("HexBinary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:30:7: ( 'ID' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:30:9: 'ID'
            {
            match("ID"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:31:7: ( 'IDREF' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:31:9: 'IDREF'
            {
            match("IDREF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:32:7: ( 'IDREFS' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:32:9: 'IDREFS'
            {
            match("IDREFS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:33:7: ( 'Int' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:33:9: 'Int'
            {
            match("Int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:34:7: ( 'Integer' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:34:9: 'Integer'
            {
            match("Integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:35:7: ( 'Language' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:35:9: 'Language'
            {
            match("Language"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:36:7: ( 'Long' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:36:9: 'Long'
            {
            match("Long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:37:7: ( 'Name' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:37:9: 'Name'
            {
            match("Name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:38:7: ( 'NCName' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:38:9: 'NCName'
            {
            match("NCName"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:39:7: ( 'NMTOKEN' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:39:9: 'NMTOKEN'
            {
            match("NMTOKEN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:40:7: ( 'NMTOKENS' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:40:9: 'NMTOKENS'
            {
            match("NMTOKENS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:41:7: ( 'NonNegativeInteger' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:41:9: 'NonNegativeInteger'
            {
            match("NonNegativeInteger"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:42:7: ( 'NonPositiveInteger' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:42:9: 'NonPositiveInteger'
            {
            match("NonPositiveInteger"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:43:7: ( 'PositiveInteger' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:43:9: 'PositiveInteger'
            {
            match("PositiveInteger"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:44:7: ( 'QName' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:44:9: 'QName'
            {
            match("QName"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:45:7: ( 'Short' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:45:9: 'Short'
            {
            match("Short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:46:7: ( 'String' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:46:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:47:7: ( 'Time' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:47:9: 'Time'
            {
            match("Time"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:48:7: ( 'Token' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:48:9: 'Token'
            {
            match("Token"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:49:7: ( 'UnsignedByte' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:49:9: 'UnsignedByte'
            {
            match("UnsignedByte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:50:7: ( 'UnsignedInt' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:50:9: 'UnsignedInt'
            {
            match("UnsignedInt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:51:7: ( 'UnsignedLong' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:51:9: 'UnsignedLong'
            {
            match("UnsignedLong"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:52:7: ( 'UnsignedShort' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:52:9: 'UnsignedShort'
            {
            match("UnsignedShort"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:53:7: ( 'DataTypeTest' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:53:9: 'DataTypeTest'
            {
            match("DataTypeTest"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:54:7: ( '{' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:54:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:55:7: ( '}' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:55:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:56:7: ( 'aAnySimpleType' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:56:9: 'aAnySimpleType'
            {
            match("aAnySimpleType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:57:7: ( 'aAnyURI' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:57:9: 'aAnyURI'
            {
            match("aAnyURI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:58:7: ( 'aBase64Binary' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:58:9: 'aBase64Binary'
            {
            match("aBase64Binary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:59:7: ( 'aBoolean' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:59:9: 'aBoolean'
            {
            match("aBoolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:60:7: ( 'aByte' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:60:9: 'aByte'
            {
            match("aByte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:61:7: ( 'aDate' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:61:9: 'aDate'
            {
            match("aDate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:62:7: ( 'aDateTime' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:62:9: 'aDateTime'
            {
            match("aDateTime"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:63:7: ( 'aDecimal' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:63:9: 'aDecimal'
            {
            match("aDecimal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:64:7: ( 'aDouble' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:64:9: 'aDouble'
            {
            match("aDouble"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:65:7: ( 'aDuration' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:65:9: 'aDuration'
            {
            match("aDuration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:66:7: ( 'aEntities' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:66:9: 'aEntities'
            {
            match("aEntities"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:67:7: ( 'aEntity' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:67:9: 'aEntity'
            {
            match("aEntity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:68:7: ( 'aFloat' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:68:9: 'aFloat'
            {
            match("aFloat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:69:7: ( 'aGDay' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:69:9: 'aGDay'
            {
            match("aGDay"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:70:7: ( 'aGMonth' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:70:9: 'aGMonth'
            {
            match("aGMonth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:71:7: ( 'aGMonthDay' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:71:9: 'aGMonthDay'
            {
            match("aGMonthDay"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:72:7: ( 'aGYear' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:72:9: 'aGYear'
            {
            match("aGYear"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:73:7: ( 'aGYearMonth' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:73:9: 'aGYearMonth'
            {
            match("aGYearMonth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:74:7: ( 'aHexBinary' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:74:9: 'aHexBinary'
            {
            match("aHexBinary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:75:7: ( 'aIDREF' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:75:9: 'aIDREF'
            {
            match("aIDREF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:76:7: ( 'aIDREFS' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:76:9: 'aIDREFS'
            {
            match("aIDREFS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:77:7: ( 'aInt' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:77:9: 'aInt'
            {
            match("aInt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:78:7: ( 'aInteger' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:78:9: 'aInteger'
            {
            match("aInteger"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:79:7: ( 'aLanguage' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:79:9: 'aLanguage'
            {
            match("aLanguage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:80:7: ( 'aLong' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:80:9: 'aLong'
            {
            match("aLong"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:81:7: ( 'aName' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:81:9: 'aName'
            {
            match("aName"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:82:7: ( 'aNCName' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:82:9: 'aNCName'
            {
            match("aNCName"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:83:7: ( 'aNMTOKEN' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:83:9: 'aNMTOKEN'
            {
            match("aNMTOKEN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:84:7: ( 'aNMTOKENS' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:84:9: 'aNMTOKENS'
            {
            match("aNMTOKENS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:85:7: ( 'aNonNegativeInteger' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:85:9: 'aNonNegativeInteger'
            {
            match("aNonNegativeInteger"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:86:7: ( 'aNonPositiveInteger' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:86:9: 'aNonPositiveInteger'
            {
            match("aNonPositiveInteger"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:87:7: ( 'aPositiveInteger' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:87:9: 'aPositiveInteger'
            {
            match("aPositiveInteger"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:88:7: ( 'aQName' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:88:9: 'aQName'
            {
            match("aQName"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:89:7: ( 'aShort' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:89:9: 'aShort'
            {
            match("aShort"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:90:7: ( 'aString' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:90:9: 'aString'
            {
            match("aString"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:91:7: ( 'aTime' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:91:9: 'aTime'
            {
            match("aTime"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:92:7: ( 'aToken' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:92:9: 'aToken'
            {
            match("aToken"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:93:7: ( 'aUnsignedByte' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:93:9: 'aUnsignedByte'
            {
            match("aUnsignedByte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:94:7: ( 'aUnsignedInt' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:94:9: 'aUnsignedInt'
            {
            match("aUnsignedInt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:95:7: ( 'aUnsignedLong' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:95:9: 'aUnsignedLong'
            {
            match("aUnsignedLong"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:96:7: ( 'aUnsignedShort' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:96:9: 'aUnsignedShort'
            {
            match("aUnsignedShort"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5998:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5998:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5998:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5998:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:5998:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:6000:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:6000:12: ( '0' .. '9' )+
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:6000:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:6000:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:6002:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:6002:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:6002:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:6002:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:6002:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:6002:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:6002:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:6002:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:6002:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:6002:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:6002:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
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

                    match('\''); 

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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:6004:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:6004:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:6004:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:6004:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:6006:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:6006:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:6006:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:6006:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:6006:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:6006:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:6006:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:6006:41: '\\r'
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:6008:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:6008:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:6008:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:6010:16: ( . )
            // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:6010:18: .
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
        // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=93;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:280: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:286: T__57
                {
                mT__57(); 

                }
                break;
            case 48 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:292: T__58
                {
                mT__58(); 

                }
                break;
            case 49 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:298: T__59
                {
                mT__59(); 

                }
                break;
            case 50 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:304: T__60
                {
                mT__60(); 

                }
                break;
            case 51 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:310: T__61
                {
                mT__61(); 

                }
                break;
            case 52 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:316: T__62
                {
                mT__62(); 

                }
                break;
            case 53 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:322: T__63
                {
                mT__63(); 

                }
                break;
            case 54 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:328: T__64
                {
                mT__64(); 

                }
                break;
            case 55 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:334: T__65
                {
                mT__65(); 

                }
                break;
            case 56 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:340: T__66
                {
                mT__66(); 

                }
                break;
            case 57 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:346: T__67
                {
                mT__67(); 

                }
                break;
            case 58 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:352: T__68
                {
                mT__68(); 

                }
                break;
            case 59 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:358: T__69
                {
                mT__69(); 

                }
                break;
            case 60 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:364: T__70
                {
                mT__70(); 

                }
                break;
            case 61 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:370: T__71
                {
                mT__71(); 

                }
                break;
            case 62 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:376: T__72
                {
                mT__72(); 

                }
                break;
            case 63 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:382: T__73
                {
                mT__73(); 

                }
                break;
            case 64 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:388: T__74
                {
                mT__74(); 

                }
                break;
            case 65 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:394: T__75
                {
                mT__75(); 

                }
                break;
            case 66 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:400: T__76
                {
                mT__76(); 

                }
                break;
            case 67 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:406: T__77
                {
                mT__77(); 

                }
                break;
            case 68 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:412: T__78
                {
                mT__78(); 

                }
                break;
            case 69 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:418: T__79
                {
                mT__79(); 

                }
                break;
            case 70 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:424: T__80
                {
                mT__80(); 

                }
                break;
            case 71 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:430: T__81
                {
                mT__81(); 

                }
                break;
            case 72 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:436: T__82
                {
                mT__82(); 

                }
                break;
            case 73 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:442: T__83
                {
                mT__83(); 

                }
                break;
            case 74 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:448: T__84
                {
                mT__84(); 

                }
                break;
            case 75 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:454: T__85
                {
                mT__85(); 

                }
                break;
            case 76 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:460: T__86
                {
                mT__86(); 

                }
                break;
            case 77 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:466: T__87
                {
                mT__87(); 

                }
                break;
            case 78 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:472: T__88
                {
                mT__88(); 

                }
                break;
            case 79 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:478: T__89
                {
                mT__89(); 

                }
                break;
            case 80 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:484: T__90
                {
                mT__90(); 

                }
                break;
            case 81 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:490: T__91
                {
                mT__91(); 

                }
                break;
            case 82 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:496: T__92
                {
                mT__92(); 

                }
                break;
            case 83 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:502: T__93
                {
                mT__93(); 

                }
                break;
            case 84 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:508: T__94
                {
                mT__94(); 

                }
                break;
            case 85 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:514: T__95
                {
                mT__95(); 

                }
                break;
            case 86 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:520: T__96
                {
                mT__96(); 

                }
                break;
            case 87 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:526: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 88 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:534: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 89 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:543: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 90 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:555: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 91 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:571: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 92 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:587: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 93 :
                // ../org.xtext.example.mydsl.datatypes.ui/src-gen/org/xtext/example/mydsl/datatypes/ui/contentassist/antlr/internal/InternalMyDsl.g:1:595: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\17\34\2\uffff\1\34\1\32\2\uffff\3\32\2\uffff\1\34\1\uffff"+
        "\15\34\1\136\16\34\2\uffff\17\34\5\uffff\17\34\1\uffff\1\u009c\56"+
        "\34\1\u00cc\1\u00ce\6\34\1\u00d5\5\34\1\uffff\1\34\1\u00dc\1\u00dd"+
        "\10\34\1\u00e6\21\34\1\u00fa\21\34\1\uffff\1\34\1\uffff\5\34\1\u0114"+
        "\1\uffff\1\34\1\u0117\1\34\1\u011a\2\34\2\uffff\5\34\1\u0122\1\u0123"+
        "\1\34\1\uffff\1\u0125\5\34\1\u012b\1\u012d\5\34\1\u0133\5\34\1\uffff"+
        "\1\34\1\u013a\1\u013b\10\34\1\u0144\3\34\1\u0148\5\34\1\u014e\2"+
        "\34\1\u0151\1\uffff\1\u0153\1\34\1\uffff\1\34\1\u0156\1\uffff\2"+
        "\34\1\u0159\4\34\2\uffff\1\u015e\1\uffff\5\34\1\uffff\1\34\1\uffff"+
        "\4\34\1\u016a\1\uffff\1\34\1\u016d\1\34\1\u0170\2\34\2\uffff\5\34"+
        "\1\u0178\1\u0179\1\34\1\uffff\1\u017b\2\34\1\uffff\1\34\1\u017f"+
        "\2\34\1\u0182\1\uffff\2\34\1\uffff\1\34\1\uffff\2\34\1\uffff\1\u0188"+
        "\1\34\1\uffff\1\u018b\3\34\1\uffff\2\34\1\u0191\4\34\1\u0196\2\34"+
        "\1\u0199\1\uffff\1\u019b\1\34\1\uffff\1\34\1\u019e\1\uffff\2\34"+
        "\1\u01a1\4\34\2\uffff\1\u01a6\1\uffff\3\34\1\uffff\1\u01aa\1\34"+
        "\1\uffff\1\u01ac\1\u01ad\3\34\1\uffff\1\u01b1\1\u01b2\1\uffff\5"+
        "\34\1\uffff\1\34\1\u01bc\1\34\1\u01be\1\uffff\2\34\1\uffff\1\34"+
        "\1\uffff\2\34\1\uffff\1\u01c4\1\34\1\uffff\1\u01c7\3\34\1\uffff"+
        "\3\34\1\uffff\1\34\2\uffff\1\u01cf\1\34\1\u01d1\2\uffff\11\34\1"+
        "\uffff\1\u01db\1\uffff\1\u01dc\1\u01dd\3\34\1\uffff\1\u01e1\1\u01e2"+
        "\1\uffff\7\34\1\uffff\1\u01ed\1\uffff\11\34\3\uffff\1\u01f7\1\34"+
        "\1\u01f9\2\uffff\12\34\1\uffff\4\34\1\u0208\4\34\1\uffff\1\u020d"+
        "\1\uffff\10\34\1\u0216\1\u0217\3\34\1\u021b\1\uffff\1\u021c\3\34"+
        "\1\uffff\4\34\1\u0224\2\34\1\u0227\2\uffff\3\34\2\uffff\1\u022b"+
        "\1\34\1\u022d\3\34\1\u0231\1\uffff\1\u0232\1\34\1\uffff\3\34\1\uffff"+
        "\1\u0237\1\uffff\3\34\2\uffff\1\u023b\2\34\1\u023e\1\uffff\3\34"+
        "\1\uffff\2\34\1\uffff\2\34\1\u0246\4\34\1\uffff\1\u024b\1\u024c"+
        "\2\34\2\uffff\1\u024f\1\u0250\2\uffff";
    static final String DFA12_eofS =
        "\u0251\uffff";
    static final String DFA12_minS =
        "\1\0\1\156\2\141\1\116\1\154\1\104\1\145\1\104\1\141\1\103\1\157"+
        "\1\116\1\150\1\151\1\156\2\uffff\2\101\2\uffff\2\0\1\52\2\uffff"+
        "\1\171\1\uffff\1\163\1\157\2\164\1\143\1\165\1\162\1\124\1\157\1"+
        "\141\1\157\1\145\1\170\1\60\1\164\2\156\1\155\1\116\1\124\1\156"+
        "\1\163\1\141\1\157\1\162\1\155\1\153\1\163\2\uffff\1\156\2\141\1"+
        "\156\1\154\1\104\1\145\1\104\1\141\1\103\1\157\1\116\1\150\1\151"+
        "\1\156\5\uffff\1\123\1\145\1\154\1\145\1\141\1\151\1\142\1\141\1"+
        "\111\1\141\1\171\1\156\1\141\1\102\1\105\1\uffff\1\60\2\147\1\145"+
        "\1\141\1\117\1\116\1\151\1\155\1\162\1\151\2\145\1\151\1\171\1\163"+
        "\1\157\2\164\1\143\1\165\1\162\1\164\1\157\1\141\1\157\1\145\1\170"+
        "\1\122\1\164\2\156\1\155\1\116\1\124\1\156\1\163\1\141\1\157\1\162"+
        "\1\155\1\153\1\163\1\151\1\122\1\66\1\145\2\60\1\124\1\155\1\154"+
        "\1\164\1\124\1\164\1\60\1\164\1\162\1\151\1\106\1\147\1\uffff\1"+
        "\165\2\60\1\155\1\113\1\145\1\157\1\164\1\145\1\164\1\156\1\60\1"+
        "\156\1\147\1\123\1\145\1\154\2\145\1\151\1\142\1\141\1\151\1\141"+
        "\1\171\1\156\1\141\1\102\1\105\1\60\2\147\1\145\1\141\1\117\1\116"+
        "\1\151\1\155\1\162\1\151\2\145\1\151\1\155\1\111\1\64\1\141\1\uffff"+
        "\1\151\1\uffff\1\171\1\141\1\145\1\151\1\111\1\60\1\uffff\1\150"+
        "\1\60\1\156\1\60\1\145\1\141\2\uffff\1\145\1\105\1\147\1\163\1\151"+
        "\2\60\1\147\1\uffff\1\60\1\156\1\151\1\122\1\66\1\145\2\60\1\155"+
        "\1\154\3\164\1\60\1\164\1\162\1\151\1\106\1\147\1\uffff\1\165\2"+
        "\60\1\155\1\113\1\145\1\157\1\164\1\145\1\164\1\156\1\60\1\156\1"+
        "\147\1\160\1\60\1\102\1\156\1\155\1\160\1\154\1\60\1\157\1\105\1"+
        "\60\1\uffff\1\60\1\157\1\uffff\1\141\1\60\1\uffff\1\162\1\147\1"+
        "\60\1\116\1\141\1\151\1\166\2\uffff\1\60\1\uffff\1\145\1\155\1\111"+
        "\1\64\1\141\1\uffff\1\151\1\uffff\1\141\1\145\2\151\1\60\1\uffff"+
        "\1\150\1\60\1\156\1\60\1\145\1\141\2\uffff\1\145\1\105\1\147\1\163"+
        "\1\151\2\60\1\147\1\uffff\1\60\1\156\1\154\1\uffff\1\151\1\60\2"+
        "\145\1\60\1\uffff\1\156\1\123\1\uffff\1\141\1\uffff\1\156\1\162"+
        "\1\uffff\1\60\1\145\1\uffff\1\60\2\164\1\145\1\uffff\1\144\1\160"+
        "\1\60\1\102\1\156\1\155\1\154\1\60\1\157\1\145\1\60\1\uffff\1\60"+
        "\1\157\1\uffff\1\141\1\60\1\uffff\1\162\1\147\1\60\1\116\1\141\1"+
        "\151\1\166\2\uffff\1\60\1\uffff\2\145\1\156\1\uffff\1\60\1\124\1"+
        "\uffff\2\60\1\171\1\164\1\171\1\uffff\2\60\1\uffff\2\151\1\111\1"+
        "\102\1\154\1\uffff\1\151\1\60\1\145\1\60\1\uffff\1\156\1\163\1\uffff"+
        "\1\141\1\uffff\1\156\1\162\1\uffff\1\60\1\145\1\uffff\1\60\2\164"+
        "\1\145\1\uffff\1\144\1\124\1\141\1\uffff\1\145\2\uffff\1\60\1\150"+
        "\1\60\2\uffff\2\166\1\156\1\171\1\156\1\157\1\150\1\145\1\156\1"+
        "\uffff\1\60\1\uffff\2\60\1\171\1\164\1\171\1\uffff\2\60\1\uffff"+
        "\2\151\1\111\1\102\1\171\1\162\1\163\1\uffff\1\60\1\uffff\2\145"+
        "\3\164\1\156\1\157\1\124\1\141\3\uffff\1\60\1\150\1\60\2\uffff\2"+
        "\166\1\156\1\171\1\156\1\157\1\150\1\160\1\171\1\164\1\uffff\2\111"+
        "\2\145\1\60\1\147\1\162\1\171\1\162\1\uffff\1\60\1\uffff\2\145\3"+
        "\164\1\156\1\157\1\145\2\60\2\156\1\147\1\60\1\uffff\1\60\1\164"+
        "\1\160\1\171\1\uffff\2\111\2\145\1\60\1\147\1\162\1\60\2\uffff\2"+
        "\164\1\145\2\uffff\1\60\1\145\1\60\2\156\1\147\1\60\1\uffff\1\60"+
        "\1\164\1\uffff\2\145\1\162\1\uffff\1\60\1\uffff\2\164\1\145\2\uffff"+
        "\1\60\2\147\1\60\1\uffff\2\145\1\162\1\uffff\2\145\1\uffff\2\147"+
        "\1\60\2\162\2\145\1\uffff\2\60\2\162\2\uffff\2\60\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\156\1\171\1\165\1\116\1\154\1\131\1\145\1\156\3\157"+
        "\1\116\1\164\1\157\1\156\2\uffff\1\125\1\172\2\uffff\2\uffff\1\57"+
        "\2\uffff\1\171\1\uffff\1\163\1\157\2\164\1\143\1\165\1\162\1\124"+
        "\1\157\1\141\1\157\1\145\1\170\1\172\1\164\2\156\1\155\1\116\1\124"+
        "\1\156\1\163\1\141\1\157\1\162\1\155\1\153\1\163\2\uffff\1\156\1"+
        "\171\1\165\1\156\1\154\1\131\1\145\1\156\3\157\1\116\1\164\1\157"+
        "\1\156\5\uffff\1\125\1\145\1\154\2\145\1\151\1\142\1\141\1\111\1"+
        "\141\1\171\1\156\1\141\1\102\1\105\1\uffff\1\172\2\147\1\145\1\141"+
        "\1\117\1\120\1\151\1\155\1\162\1\151\2\145\1\151\1\171\1\163\1\157"+
        "\2\164\1\143\1\165\1\162\1\164\1\157\1\141\1\157\1\145\1\170\1\122"+
        "\1\164\2\156\1\155\1\116\1\124\1\156\1\163\1\141\1\157\1\162\1\155"+
        "\1\153\1\163\1\151\1\122\1\66\1\145\2\172\1\124\1\155\1\154\1\164"+
        "\1\124\1\164\1\172\1\164\1\162\1\151\1\106\1\147\1\uffff\1\165\2"+
        "\172\1\155\1\113\1\145\1\157\1\164\1\145\1\164\1\156\1\172\1\156"+
        "\1\147\1\125\1\145\1\154\2\145\1\151\1\142\1\141\1\151\1\141\1\171"+
        "\1\156\1\141\1\102\1\105\1\172\2\147\1\145\1\141\1\117\1\120\1\151"+
        "\1\155\1\162\1\151\2\145\1\151\1\155\1\111\1\64\1\141\1\uffff\1"+
        "\151\1\uffff\1\171\1\141\1\145\1\151\1\131\1\172\1\uffff\1\150\1"+
        "\172\1\156\1\172\1\145\1\141\2\uffff\1\145\1\105\1\147\1\163\1\151"+
        "\2\172\1\147\1\uffff\1\172\1\156\1\151\1\122\1\66\1\145\2\172\1"+
        "\155\1\154\3\164\1\172\1\164\1\162\1\151\1\106\1\147\1\uffff\1\165"+
        "\2\172\1\155\1\113\1\145\1\157\1\164\1\145\1\164\1\156\1\172\1\156"+
        "\1\147\1\160\1\172\1\102\1\156\1\155\1\160\1\154\1\172\1\157\1\105"+
        "\1\172\1\uffff\1\172\1\157\1\uffff\1\141\1\172\1\uffff\1\162\1\147"+
        "\1\172\1\116\1\141\1\151\1\166\2\uffff\1\172\1\uffff\1\145\1\155"+
        "\1\111\1\64\1\141\1\uffff\1\151\1\uffff\1\141\1\145\1\151\1\171"+
        "\1\172\1\uffff\1\150\1\172\1\156\1\172\1\145\1\141\2\uffff\1\145"+
        "\1\105\1\147\1\163\1\151\2\172\1\147\1\uffff\1\172\1\156\1\154\1"+
        "\uffff\1\151\1\172\2\145\1\172\1\uffff\1\156\1\123\1\uffff\1\141"+
        "\1\uffff\1\156\1\162\1\uffff\1\172\1\145\1\uffff\1\172\2\164\1\145"+
        "\1\uffff\1\144\1\160\1\172\1\102\1\156\1\155\1\154\1\172\1\157\1"+
        "\145\1\172\1\uffff\1\172\1\157\1\uffff\1\141\1\172\1\uffff\1\162"+
        "\1\147\1\172\1\116\1\141\1\151\1\166\2\uffff\1\172\1\uffff\2\145"+
        "\1\156\1\uffff\1\172\1\124\1\uffff\2\172\1\171\1\164\1\171\1\uffff"+
        "\2\172\1\uffff\2\151\1\111\1\123\1\154\1\uffff\1\151\1\172\1\145"+
        "\1\172\1\uffff\1\156\1\163\1\uffff\1\141\1\uffff\1\156\1\162\1\uffff"+
        "\1\172\1\145\1\uffff\1\172\2\164\1\145\1\uffff\1\144\1\124\1\141"+
        "\1\uffff\1\145\2\uffff\1\172\1\150\1\172\2\uffff\2\166\1\156\1\171"+
        "\1\156\1\157\1\150\1\145\1\156\1\uffff\1\172\1\uffff\2\172\1\171"+
        "\1\164\1\171\1\uffff\2\172\1\uffff\2\151\1\111\1\123\1\171\1\162"+
        "\1\163\1\uffff\1\172\1\uffff\2\145\3\164\1\156\1\157\1\124\1\141"+
        "\3\uffff\1\172\1\150\1\172\2\uffff\2\166\1\156\1\171\1\156\1\157"+
        "\1\150\1\160\1\171\1\164\1\uffff\2\111\2\145\1\172\1\147\1\162\1"+
        "\171\1\162\1\uffff\1\172\1\uffff\2\145\3\164\1\156\1\157\1\145\2"+
        "\172\2\156\1\147\1\172\1\uffff\1\172\1\164\1\160\1\171\1\uffff\2"+
        "\111\2\145\1\172\1\147\1\162\1\172\2\uffff\2\164\1\145\2\uffff\1"+
        "\172\1\145\1\172\2\156\1\147\1\172\1\uffff\1\172\1\164\1\uffff\2"+
        "\145\1\162\1\uffff\1\172\1\uffff\2\164\1\145\2\uffff\1\172\2\147"+
        "\1\172\1\uffff\2\145\1\162\1\uffff\2\145\1\uffff\2\147\1\172\2\162"+
        "\2\145\1\uffff\2\172\2\162\2\uffff\2\172\2\uffff";
    static final String DFA12_acceptS =
        "\20\uffff\1\54\1\55\2\uffff\1\127\1\130\3\uffff\1\134\1\135\1\uffff"+
        "\1\127\34\uffff\1\54\1\55\17\uffff\1\130\1\131\1\132\1\133\1\134"+
        "\17\uffff\1\24\75\uffff\1\27\57\uffff\1\5\1\uffff\1\6\6\uffff\1"+
        "\16\6\uffff\1\32\1\33\10\uffff\1\45\23\uffff\1\103\31\uffff\1\15"+
        "\2\uffff\1\21\2\uffff\1\25\7\uffff\1\42\1\43\1\uffff\1\46\5\uffff"+
        "\1\62\1\uffff\1\63\5\uffff\1\73\6\uffff\1\106\1\107\10\uffff\1\121"+
        "\3\uffff\1\2\5\uffff\1\11\2\uffff\1\14\1\uffff\1\17\2\uffff\1\26"+
        "\2\uffff\1\34\4\uffff\1\44\13\uffff\1\72\2\uffff\1\76\2\uffff\1"+
        "\101\7\uffff\1\116\1\117\1\uffff\1\122\3\uffff\1\4\2\uffff\1\10"+
        "\5\uffff\1\30\2\uffff\1\35\5\uffff\1\57\4\uffff\1\66\2\uffff\1\71"+
        "\1\uffff\1\74\2\uffff\1\102\2\uffff\1\110\4\uffff\1\120\3\uffff"+
        "\1\7\1\uffff\1\12\1\13\3\uffff\1\31\1\36\11\uffff\1\61\1\uffff\1"+
        "\65\5\uffff\1\104\2\uffff\1\111\7\uffff\1\20\1\uffff\1\23\11\uffff"+
        "\1\64\1\67\1\70\3\uffff\1\105\1\112\12\uffff\1\22\11\uffff\1\75"+
        "\1\uffff\1\100\16\uffff\1\50\4\uffff\1\77\10\uffff\1\3\1\53\3\uffff"+
        "\1\47\1\51\7\uffff\1\124\2\uffff\1\1\3\uffff\1\52\1\uffff\1\60\3"+
        "\uffff\1\123\1\125\4\uffff\1\56\3\uffff\1\126\2\uffff\1\41\7\uffff"+
        "\1\115\4\uffff\1\37\1\40\2\uffff\1\113\1\114";
    static final String DFA12_specialS =
        "\1\0\25\uffff\1\1\1\2\u0239\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\32\2\31\2\32\1\31\22\32\1\31\1\32\1\26\4\32\1\27\7\32\1"+
            "\30\12\25\7\32\1\1\1\2\1\24\1\3\1\4\1\5\1\6\1\7\1\10\2\24\1"+
            "\11\1\24\1\12\1\24\1\13\1\14\1\24\1\15\1\16\1\17\5\24\3\32\1"+
            "\23\1\24\1\32\1\22\31\24\1\20\1\32\1\21\uff82\32",
            "\1\33",
            "\1\35\15\uffff\1\36\11\uffff\1\37",
            "\1\40\3\uffff\1\41\11\uffff\1\42\5\uffff\1\43",
            "\1\44",
            "\1\45",
            "\1\46\10\uffff\1\47\13\uffff\1\50",
            "\1\51",
            "\1\52\51\uffff\1\53",
            "\1\54\15\uffff\1\55",
            "\1\57\11\uffff\1\60\23\uffff\1\56\15\uffff\1\61",
            "\1\62",
            "\1\63",
            "\1\64\13\uffff\1\65",
            "\1\66\5\uffff\1\67",
            "\1\70",
            "",
            "",
            "\1\73\1\74\1\uffff\1\75\1\76\1\77\1\100\1\101\1\102\2\uffff"+
            "\1\103\1\uffff\1\104\1\uffff\1\105\1\106\1\uffff\1\107\1\110"+
            "\1\111",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "\0\113",
            "\0\113",
            "\1\114\4\uffff\1\115",
            "",
            "",
            "\1\117",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\12\34\7\uffff\21\34\1\135\10\34\4\uffff\1\34\1\uffff\32\34",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "",
            "",
            "\1\155",
            "\1\156\15\uffff\1\157\11\uffff\1\160",
            "\1\161\3\uffff\1\162\11\uffff\1\163\5\uffff\1\164",
            "\1\165",
            "\1\166",
            "\1\167\10\uffff\1\170\13\uffff\1\171",
            "\1\172",
            "\1\173\51\uffff\1\174",
            "\1\175\15\uffff\1\176",
            "\1\u0080\11\uffff\1\u0081\23\uffff\1\177\15\uffff\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085\13\uffff\1\u0086",
            "\1\u0087\5\uffff\1\u0088",
            "\1\u0089",
            "",
            "",
            "",
            "",
            "",
            "\1\u008a\1\uffff\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u0090\3\uffff\1\u008f",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u009b\25"+
            "\34",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2\1\uffff\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\23\34\1\u00cd\6\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "",
            "\1\u00db",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9\1\uffff\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\u00f9\25"+
            "\34",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100\1\uffff\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "",
            "\1\u010d",
            "",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112\17\uffff\1\u0113",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\u0115",
            "\12\34\7\uffff\14\34\1\u0116\15\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u0118",
            "\12\34\7\uffff\22\34\1\u0119\7\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u011b",
            "\1\u011c",
            "",
            "",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0124",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\23\34\1\u012c\6\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "",
            "\1\u0139",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u014f",
            "\1\u0150",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\12\34\7\uffff\3\34\1\u0152\26\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u0154",
            "",
            "\1\u0155",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\u0157",
            "\1\u0158",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "",
            "\1\u0164",
            "",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168\17\uffff\1\u0169",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\u016b",
            "\12\34\7\uffff\14\34\1\u016c\15\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u016e",
            "\12\34\7\uffff\22\34\1\u016f\7\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u0171",
            "\1\u0172",
            "",
            "",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u017a",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u017c",
            "\1\u017d",
            "",
            "\1\u017e",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0180",
            "\1\u0181",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\u0183",
            "\1\u0184",
            "",
            "\1\u0185",
            "",
            "\1\u0186",
            "\1\u0187",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0189",
            "",
            "\12\34\7\uffff\22\34\1\u018a\7\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "",
            "\1\u018f",
            "\1\u0190",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0197",
            "\1\u0198",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\12\34\7\uffff\3\34\1\u019a\26\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u019c",
            "",
            "\1\u019d",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\u019f",
            "\1\u01a0",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u01ab",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6\6\uffff\1\u01b7\2\uffff\1\u01b8\6\uffff\1\u01b9",
            "\1\u01ba",
            "",
            "\1\u01bb",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u01bd",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\u01bf",
            "\1\u01c0",
            "",
            "\1\u01c1",
            "",
            "\1\u01c2",
            "\1\u01c3",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u01c5",
            "",
            "\12\34\7\uffff\22\34\1\u01c6\7\34\4\uffff\1\34\1\uffff\32"+
            "\34",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "",
            "\1\u01ce",
            "",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u01d0",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\u01e3",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e6\6\uffff\1\u01e7\2\uffff\1\u01e8\6\uffff\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f4",
            "\1\u01f5",
            "\1\u01f6",
            "",
            "",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u01f8",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "\1\u01fa",
            "\1\u01fb",
            "\1\u01fc",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0201",
            "\1\u0202",
            "\1\u0203",
            "",
            "\1\u0204",
            "\1\u0205",
            "\1\u0206",
            "\1\u0207",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0209",
            "\1\u020a",
            "\1\u020b",
            "\1\u020c",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\u020e",
            "\1\u020f",
            "\1\u0210",
            "\1\u0211",
            "\1\u0212",
            "\1\u0213",
            "\1\u0214",
            "\1\u0215",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u021d",
            "\1\u021e",
            "\1\u021f",
            "",
            "\1\u0220",
            "\1\u0221",
            "\1\u0222",
            "\1\u0223",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0225",
            "\1\u0226",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "\1\u0228",
            "\1\u0229",
            "\1\u022a",
            "",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u022c",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u022e",
            "\1\u022f",
            "\1\u0230",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0233",
            "",
            "\1\u0234",
            "\1\u0235",
            "\1\u0236",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\u0238",
            "\1\u0239",
            "\1\u023a",
            "",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u023c",
            "\1\u023d",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\u023f",
            "\1\u0240",
            "\1\u0241",
            "",
            "\1\u0242",
            "\1\u0243",
            "",
            "\1\u0244",
            "\1\u0245",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0247",
            "\1\u0248",
            "\1\u0249",
            "\1\u024a",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u024d",
            "\1\u024e",
            "",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    static class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='A') ) {s = 1;}

                        else if ( (LA12_0=='B') ) {s = 2;}

                        else if ( (LA12_0=='D') ) {s = 3;}

                        else if ( (LA12_0=='E') ) {s = 4;}

                        else if ( (LA12_0=='F') ) {s = 5;}

                        else if ( (LA12_0=='G') ) {s = 6;}

                        else if ( (LA12_0=='H') ) {s = 7;}

                        else if ( (LA12_0=='I') ) {s = 8;}

                        else if ( (LA12_0=='L') ) {s = 9;}

                        else if ( (LA12_0=='N') ) {s = 10;}

                        else if ( (LA12_0=='P') ) {s = 11;}

                        else if ( (LA12_0=='Q') ) {s = 12;}

                        else if ( (LA12_0=='S') ) {s = 13;}

                        else if ( (LA12_0=='T') ) {s = 14;}

                        else if ( (LA12_0=='U') ) {s = 15;}

                        else if ( (LA12_0=='{') ) {s = 16;}

                        else if ( (LA12_0=='}') ) {s = 17;}

                        else if ( (LA12_0=='a') ) {s = 18;}

                        else if ( (LA12_0=='^') ) {s = 19;}

                        else if ( (LA12_0=='C'||(LA12_0>='J' && LA12_0<='K')||LA12_0=='M'||LA12_0=='O'||LA12_0=='R'||(LA12_0>='V' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='b' && LA12_0<='z')) ) {s = 20;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 21;}

                        else if ( (LA12_0=='\"') ) {s = 22;}

                        else if ( (LA12_0=='\'') ) {s = 23;}

                        else if ( (LA12_0=='/') ) {s = 24;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 25;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='.')||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_22 = input.LA(1);

                        s = -1;
                        if ( ((LA12_22>='\u0000' && LA12_22<='\uFFFF')) ) {s = 75;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_23 = input.LA(1);

                        s = -1;
                        if ( ((LA12_23>='\u0000' && LA12_23<='\uFFFF')) ) {s = 75;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}