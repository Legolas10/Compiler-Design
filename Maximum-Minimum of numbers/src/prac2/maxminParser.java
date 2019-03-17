package prac2;
// Generated from maxmin.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class maxminParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUM=1, PLUS=2, MINUS=3, COM=4, WS=5;
	public static final int
		RULE_s = 0, RULE_b = 1, RULE_c = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "b", "c"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'+'", "'-'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUM", "PLUS", "MINUS", "COM", "WS"
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
	public String getGrammarFileName() { return "maxmin.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public maxminParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public Integer value;
		public BContext bval;
		public CContext cval;
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(maxminParser.PLUS, 0); }
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(maxminParser.MINUS, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof maxminListener ) ((maxminListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof maxminListener ) ((maxminListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			setState(14);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				((SContext)_localctx).bval = b(0);
				{
				setState(7);
				match(PLUS);
				}
				((SContext)_localctx).value = ((SContext)_localctx).bval.value; System.out.println(_localctx.value);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(10);
				((SContext)_localctx).cval = c(0);
				{
				setState(11);
				match(MINUS);
				}
				((SContext)_localctx).value = ((SContext)_localctx).cval.value; System.out.println(_localctx.value);
				}
				break;
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

	public static class BContext extends ParserRuleContext {
		public Integer value;
		public BContext bval;
		public Token NUM;
		public TerminalNode NUM() { return getToken(maxminParser.NUM, 0); }
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public TerminalNode COM() { return getToken(maxminParser.COM, 0); }
		public BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof maxminListener ) ((maxminListener)listener).enterB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof maxminListener ) ((maxminListener)listener).exitB(this);
		}
	}

	public final BContext b() throws RecognitionException {
		return b(0);
	}

	private BContext b(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BContext _localctx = new BContext(_ctx, _parentState);
		BContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_b, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(17);
			((BContext)_localctx).NUM = match(NUM);
			((BContext)_localctx).value = Integer.parseInt((((BContext)_localctx).NUM!=null?((BContext)_localctx).NUM.getText():null));
			}
			_ctx.stop = _input.LT(-1);
			setState(26);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BContext(_parentctx, _parentState);
					_localctx.bval = _prevctx;
					_localctx.bval = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_b);
					setState(20);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					{
					setState(21);
					match(COM);
					}
					setState(22);
					((BContext)_localctx).NUM = match(NUM);
					((BContext)_localctx).value = Math.max(((BContext)_localctx).bval.value,(Integer.parseInt((((BContext)_localctx).NUM!=null?((BContext)_localctx).NUM.getText():null))));
					}
					} 
				}
				setState(28);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class CContext extends ParserRuleContext {
		public Integer value;
		public CContext cval;
		public Token NUM;
		public TerminalNode NUM() { return getToken(maxminParser.NUM, 0); }
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public TerminalNode COM() { return getToken(maxminParser.COM, 0); }
		public CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof maxminListener ) ((maxminListener)listener).enterC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof maxminListener ) ((maxminListener)listener).exitC(this);
		}
	}

	public final CContext c() throws RecognitionException {
		return c(0);
	}

	private CContext c(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CContext _localctx = new CContext(_ctx, _parentState);
		CContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_c, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(30);
			((CContext)_localctx).NUM = match(NUM);
			((CContext)_localctx).value = Integer.parseInt((((CContext)_localctx).NUM!=null?((CContext)_localctx).NUM.getText():null));
			}
			_ctx.stop = _input.LT(-1);
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CContext(_parentctx, _parentState);
					_localctx.cval = _prevctx;
					_localctx.cval = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_c);
					setState(33);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					{
					setState(34);
					match(COM);
					}
					setState(35);
					((CContext)_localctx).NUM = match(NUM);
					((CContext)_localctx).value = Math.min(((CContext)_localctx).cval.value,(Integer.parseInt((((CContext)_localctx).NUM!=null?((CContext)_localctx).NUM.getText():null))));
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return b_sempred((BContext)_localctx, predIndex);
		case 2:
			return c_sempred((CContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean b_sempred(BContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean c_sempred(CContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7-\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\21\n\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\7\4(\n\4\f\4\16\4+\13\4\3\4\2\4\4\6\5\2\4\6\2\2\2,\2\20\3\2\2\2"+
		"\4\22\3\2\2\2\6\37\3\2\2\2\b\t\5\4\3\2\t\n\7\4\2\2\n\13\b\2\1\2\13\21"+
		"\3\2\2\2\f\r\5\6\4\2\r\16\7\5\2\2\16\17\b\2\1\2\17\21\3\2\2\2\20\b\3\2"+
		"\2\2\20\f\3\2\2\2\21\3\3\2\2\2\22\23\b\3\1\2\23\24\7\3\2\2\24\25\b\3\1"+
		"\2\25\34\3\2\2\2\26\27\f\4\2\2\27\30\7\6\2\2\30\31\7\3\2\2\31\33\b\3\1"+
		"\2\32\26\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\5\3\2\2"+
		"\2\36\34\3\2\2\2\37 \b\4\1\2 !\7\3\2\2!\"\b\4\1\2\")\3\2\2\2#$\f\4\2\2"+
		"$%\7\6\2\2%&\7\3\2\2&(\b\4\1\2\'#\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2"+
		"\2*\7\3\2\2\2+)\3\2\2\2\5\20\34)";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}