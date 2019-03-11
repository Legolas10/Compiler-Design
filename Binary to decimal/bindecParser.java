// Generated from bindec.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class bindecParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUM=1;
	public static final int
		RULE_equation = 0, RULE_l = 1, RULE_b = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"equation", "l", "b"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUM"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "bindec.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public bindecParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class EquationContext extends ParserRuleContext {
		public Integer value;
		public LContext e;
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bindecListener ) ((bindecListener)listener).enterEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bindecListener ) ((bindecListener)listener).exitEquation(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_equation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			((EquationContext)_localctx).e = l(0);
			((EquationContext)_localctx).value = ((EquationContext)_localctx).e.value; System.out.println("vadachennai nigga "+_localctx.value);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LContext extends ParserRuleContext {
		public Integer value;
		public LContext lv;
		public BContext bv;
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public LContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bindecListener ) ((bindecListener)listener).enterL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bindecListener ) ((bindecListener)listener).exitL(this);
		}
	}

	public final LContext l() throws RecognitionException {
		return l(0);
	}

	private LContext l(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LContext _localctx = new LContext(_ctx, _parentState);
		LContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_l, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(10);
			((LContext)_localctx).bv = b();
			((LContext)_localctx).value = ((LContext)_localctx).bv.value;
			}
			_ctx.stop = _input.LT(-1);
			setState(19);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LContext(_parentctx, _parentState);
					_localctx.lv = _prevctx;
					_localctx.lv = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_l);
					setState(13);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(14);
					((LContext)_localctx).bv = b();
					((LContext)_localctx).value = (2*((LContext)_localctx).lv.value)+((LContext)_localctx).bv.value;
					}
					} 
				}
				setState(21);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BContext extends ParserRuleContext {
		public Integer value;
		public Token NUM;
		public TerminalNode NUM() { return getToken(bindecParser.NUM, 0); }
		public BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bindecListener ) ((bindecListener)listener).enterB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bindecListener ) ((bindecListener)listener).exitB(this);
		}
	}

	public final BContext b() throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_b);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			((BContext)_localctx).NUM = match(NUM);
			((BContext)_localctx).value = Integer.parseInt((((BContext)_localctx).NUM!=null?((BContext)_localctx).NUM.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return l_sempred((LContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean l_sempred(LContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\3\34\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\24\n\3\f"+
		"\3\16\3\27\13\3\3\4\3\4\3\4\3\4\2\3\4\5\2\4\6\2\2\2\31\2\b\3\2\2\2\4\13"+
		"\3\2\2\2\6\30\3\2\2\2\b\t\5\4\3\2\t\n\b\2\1\2\n\3\3\2\2\2\13\f\b\3\1\2"+
		"\f\r\5\6\4\2\r\16\b\3\1\2\16\25\3\2\2\2\17\20\f\4\2\2\20\21\5\6\4\2\21"+
		"\22\b\3\1\2\22\24\3\2\2\2\23\17\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25"+
		"\26\3\2\2\2\26\5\3\2\2\2\27\25\3\2\2\2\30\31\7\3\2\2\31\32\b\4\1\2\32"+
		"\7\3\2\2\2\3\25";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}