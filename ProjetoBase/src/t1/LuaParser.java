// Generated from Lua.g4 by ANTLR 4.7
package t1;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LuaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, Nome=48, Numero=49, Inteiro=50, Float=51, Cadeia=52, 
		Comentario=53, Whitespace=54;
	public static final int
		RULE_programa = 0, RULE_trecho = 1, RULE_bloco = 2, RULE_comando = 3, 
		RULE_ultimocomando = 4, RULE_nomedafuncao = 5, RULE_listavar = 6, RULE_var = 7, 
		RULE_chamadadefuncao = 8, RULE_var2 = 9, RULE_cham2 = 10, RULE_listadenomes = 11, 
		RULE_listaexp = 12, RULE_exp = 13, RULE_args = 14, RULE_funcao = 15, RULE_corpodafuncao = 16, 
		RULE_listapar = 17, RULE_construtortabela = 18, RULE_listadecampos = 19, 
		RULE_campo = 20, RULE_separadordecampos = 21, RULE_opbin = 22, RULE_opunaria = 23;
	public static final String[] ruleNames = {
		"programa", "trecho", "bloco", "comando", "ultimocomando", "nomedafuncao", 
		"listavar", "var", "chamadadefuncao", "var2", "cham2", "listadenomes", 
		"listaexp", "exp", "args", "funcao", "corpodafuncao", "listapar", "construtortabela", 
		"listadecampos", "campo", "separadordecampos", "opbin", "opunaria"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "'do'", "'end'", "'while'", "'repeat'", "'until'", 
		"'if'", "'then'", "'elseif'", "'else'", "'for'", "','", "'in'", "'function'", 
		"'local'", "'return'", "'break'", "'.'", "':'", "'['", "']'", "'('", "')'", 
		"'nil'", "'false'", "'true'", "'...'", "'{'", "'}'", "'+'", "'-'", "'*'", 
		"'/'", "'^'", "'%'", "'..'", "'<'", "'<='", "'>'", "'>='", "'=='", "'~='", 
		"'and'", "'or'", "'not'", "'#'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"Nome", "Numero", "Inteiro", "Float", "Cadeia", "Comentario", "Whitespace"
	};
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
	public String getGrammarFileName() { return "Lua.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	   public static String grupo="<<587052 e 586919>>";

	public LuaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public TrechoContext trecho() {
			return getRuleContext(TrechoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			trecho();
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

	public static class TrechoContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public UltimocomandoContext ultimocomando() {
			return getRuleContext(UltimocomandoContext.class,0);
		}
		public TrechoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trecho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterTrecho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitTrecho(this);
		}
	}

	public final TrechoContext trecho() throws RecognitionException {
		TrechoContext _localctx = new TrechoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_trecho);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__22) | (1L << Nome))) != 0)) {
				{
				{
				setState(50);
				comando();
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(51);
					match(T__0);
					}
				}

				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16 || _la==T__17) {
				{
				setState(59);
				ultimocomando();
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(60);
					match(T__0);
					}
				}

				}
			}

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

	public static class BlocoContext extends ParserRuleContext {
		public TrechoContext trecho() {
			return getRuleContext(TrechoContext.class,0);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			trecho();
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

	public static class ComandoContext extends ParserRuleContext {
		public ListavarContext listavar() {
			return getRuleContext(ListavarContext.class,0);
		}
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public ChamadadefuncaoContext chamadadefuncao() {
			return getRuleContext(ChamadadefuncaoContext.class,0);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode Nome() { return getToken(LuaParser.Nome, 0); }
		public ListadenomesContext listadenomes() {
			return getRuleContext(ListadenomesContext.class,0);
		}
		public NomedafuncaoContext nomedafuncao() {
			return getRuleContext(NomedafuncaoContext.class,0);
		}
		public CorpodafuncaoContext corpodafuncao() {
			return getRuleContext(CorpodafuncaoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comando);
		int _la;
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				listavar();
				setState(68);
				match(T__1);
				setState(69);
				listaexp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				chamadadefuncao(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				match(T__2);
				setState(73);
				bloco();
				setState(74);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				match(T__4);
				setState(77);
				exp(0);
				setState(78);
				match(T__2);
				setState(79);
				bloco();
				setState(80);
				match(T__3);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				match(T__5);
				setState(83);
				bloco();
				setState(84);
				match(T__6);
				setState(85);
				exp(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				match(T__7);
				setState(88);
				exp(0);
				setState(89);
				match(T__8);
				setState(90);
				bloco();
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(91);
					match(T__9);
					setState(92);
					exp(0);
					setState(93);
					match(T__8);
					setState(94);
					bloco();
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(101);
					match(T__10);
					setState(102);
					bloco();
					}
				}

				setState(105);
				match(T__3);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(107);
				match(T__11);
				setState(108);
				match(Nome);
				setState(109);
				match(T__1);
				setState(110);
				exp(0);
				setState(111);
				match(T__12);
				setState(112);
				exp(0);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(113);
					match(T__12);
					setState(114);
					exp(0);
					}
				}

				setState(117);
				match(T__2);
				setState(118);
				bloco();
				setState(119);
				match(T__3);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(121);
				match(T__11);
				setState(122);
				listadenomes();
				setState(123);
				match(T__13);
				setState(124);
				listaexp();
				setState(125);
				match(T__2);
				setState(126);
				bloco();
				setState(127);
				match(T__3);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(129);
				match(T__14);
				setState(130);
				nomedafuncao();
				setState(131);
				corpodafuncao();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(133);
				match(T__15);
				setState(134);
				match(T__14);
				setState(135);
				match(Nome);
				setState(136);
				corpodafuncao();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(137);
				match(T__15);
				setState(138);
				listadenomes();
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(139);
					match(T__1);
					setState(140);
					listaexp();
					}
				}

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

	public static class UltimocomandoContext extends ParserRuleContext {
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public UltimocomandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ultimocomando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterUltimocomando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitUltimocomando(this);
		}
	}

	public final UltimocomandoContext ultimocomando() throws RecognitionException {
		UltimocomandoContext _localctx = new UltimocomandoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ultimocomando);
		int _la;
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(T__16);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__31) | (1L << T__45) | (1L << T__46) | (1L << Nome) | (1L << Numero) | (1L << Cadeia))) != 0)) {
					{
					setState(146);
					listaexp();
					}
				}

				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(T__17);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NomedafuncaoContext extends ParserRuleContext {
		public List<TerminalNode> Nome() { return getTokens(LuaParser.Nome); }
		public TerminalNode Nome(int i) {
			return getToken(LuaParser.Nome, i);
		}
		public NomedafuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomedafuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterNomedafuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitNomedafuncao(this);
		}
	}

	public final NomedafuncaoContext nomedafuncao() throws RecognitionException {
		NomedafuncaoContext _localctx = new NomedafuncaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nomedafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(Nome);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(153);
				match(T__18);
				setState(154);
				match(Nome);
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(160);
				match(T__19);
				setState(161);
				match(Nome);
				}
			}

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

	public static class ListavarContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public ListavarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listavar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListavar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListavar(this);
		}
	}

	public final ListavarContext listavar() throws RecognitionException {
		ListavarContext _localctx = new ListavarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listavar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			var(0);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(165);
				match(T__12);
				setState(166);
				var(0);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class VarContext extends ParserRuleContext {
		public List<TerminalNode> Nome() { return getTokens(LuaParser.Nome); }
		public TerminalNode Nome(int i) {
			return getToken(LuaParser.Nome, i);
		}
		public Var2Context var2() {
			return getRuleContext(Var2Context.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Cham2Context cham2() {
			return getRuleContext(Cham2Context.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		return var(0);
	}

	private VarContext var(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VarContext _localctx = new VarContext(_ctx, _parentState);
		VarContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_var, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(173);
				match(Nome);
				setState(174);
				var2();
				}
				break;
			case 2:
				{
				setState(175);
				match(T__22);
				setState(176);
				exp(0);
				setState(177);
				match(T__23);
				setState(182);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__22:
				case T__28:
				case Cadeia:
					{
					setState(178);
					args();
					}
					break;
				case T__19:
					{
					setState(179);
					match(T__19);
					setState(180);
					match(Nome);
					setState(181);
					args();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(184);
				cham2();
				setState(191);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__20:
					{
					setState(185);
					match(T__20);
					setState(186);
					exp(0);
					setState(187);
					match(T__21);
					}
					break;
				case T__18:
					{
					setState(189);
					match(T__18);
					setState(190);
					match(Nome);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(193);
				var2();
				}
				break;
			case 3:
				{
				setState(195);
				match(T__22);
				setState(196);
				exp(0);
				setState(197);
				match(T__23);
				setState(204);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__20:
					{
					setState(198);
					match(T__20);
					setState(199);
					exp(0);
					setState(200);
					match(T__21);
					}
					break;
				case T__18:
					{
					setState(202);
					match(T__18);
					setState(203);
					match(Nome);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(206);
				var2();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VarContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_var);
					setState(210);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(215);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__22:
					case T__28:
					case Cadeia:
						{
						setState(211);
						args();
						}
						break;
					case T__19:
						{
						setState(212);
						match(T__19);
						setState(213);
						match(Nome);
						setState(214);
						args();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(217);
					cham2();
					setState(224);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__20:
						{
						setState(218);
						match(T__20);
						setState(219);
						exp(0);
						setState(220);
						match(T__21);
						}
						break;
					case T__18:
						{
						setState(222);
						match(T__18);
						setState(223);
						match(Nome);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(226);
					var2();
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class ChamadadefuncaoContext extends ParserRuleContext {
		public List<TerminalNode> Nome() { return getTokens(LuaParser.Nome); }
		public TerminalNode Nome(int i) {
			return getToken(LuaParser.Nome, i);
		}
		public Var2Context var2() {
			return getRuleContext(Var2Context.class,0);
		}
		public Cham2Context cham2() {
			return getRuleContext(Cham2Context.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ChamadadefuncaoContext chamadadefuncao() {
			return getRuleContext(ChamadadefuncaoContext.class,0);
		}
		public ChamadadefuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadadefuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterChamadadefuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitChamadadefuncao(this);
		}
	}

	public final ChamadadefuncaoContext chamadadefuncao() throws RecognitionException {
		return chamadadefuncao(0);
	}

	private ChamadadefuncaoContext chamadadefuncao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ChamadadefuncaoContext _localctx = new ChamadadefuncaoContext(_ctx, _parentState);
		ChamadadefuncaoContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_chamadadefuncao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(234);
				match(Nome);
				setState(235);
				var2();
				setState(240);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__22:
				case T__28:
				case Cadeia:
					{
					setState(236);
					args();
					}
					break;
				case T__19:
					{
					setState(237);
					match(T__19);
					setState(238);
					match(Nome);
					setState(239);
					args();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(242);
				cham2();
				}
				break;
			case 2:
				{
				setState(244);
				match(T__22);
				setState(245);
				exp(0);
				setState(246);
				match(T__23);
				setState(253);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__20:
					{
					setState(247);
					match(T__20);
					setState(248);
					exp(0);
					setState(249);
					match(T__21);
					}
					break;
				case T__18:
					{
					setState(251);
					match(T__18);
					setState(252);
					match(Nome);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(255);
				var2();
				setState(260);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__22:
				case T__28:
				case Cadeia:
					{
					setState(256);
					args();
					}
					break;
				case T__19:
					{
					setState(257);
					match(T__19);
					setState(258);
					match(Nome);
					setState(259);
					args();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(262);
				cham2();
				}
				break;
			case 3:
				{
				setState(264);
				match(T__22);
				setState(265);
				exp(0);
				setState(266);
				match(T__23);
				setState(271);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__22:
				case T__28:
				case Cadeia:
					{
					setState(267);
					args();
					}
					break;
				case T__19:
					{
					setState(268);
					match(T__19);
					setState(269);
					match(Nome);
					setState(270);
					args();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(273);
				cham2();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ChamadadefuncaoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_chamadadefuncao);
					setState(277);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(284);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__20:
						{
						setState(278);
						match(T__20);
						setState(279);
						exp(0);
						setState(280);
						match(T__21);
						}
						break;
					case T__18:
						{
						setState(282);
						match(T__18);
						setState(283);
						match(Nome);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(286);
					var2();
					setState(291);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__22:
					case T__28:
					case Cadeia:
						{
						setState(287);
						args();
						}
						break;
					case T__19:
						{
						setState(288);
						match(T__19);
						setState(289);
						match(Nome);
						setState(290);
						args();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(293);
					cham2();
					}
					} 
				}
				setState(299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class Var2Context extends ParserRuleContext {
		public Var2Context var2() {
			return getRuleContext(Var2Context.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Nome() { return getToken(LuaParser.Nome, 0); }
		public Var2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterVar2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitVar2(this);
		}
	}

	public final Var2Context var2() throws RecognitionException {
		Var2Context _localctx = new Var2Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_var2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(306);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__20:
					{
					setState(300);
					match(T__20);
					setState(301);
					exp(0);
					setState(302);
					match(T__21);
					}
					break;
				case T__18:
					{
					setState(304);
					match(T__18);
					setState(305);
					match(Nome);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(308);
				var2();
				}
				break;
			}
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

	public static class Cham2Context extends ParserRuleContext {
		public Cham2Context cham2() {
			return getRuleContext(Cham2Context.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode Nome() { return getToken(LuaParser.Nome, 0); }
		public Cham2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cham2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterCham2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitCham2(this);
		}
	}

	public final Cham2Context cham2() throws RecognitionException {
		Cham2Context _localctx = new Cham2Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_cham2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(315);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__22:
				case T__28:
				case Cadeia:
					{
					setState(311);
					args();
					}
					break;
				case T__19:
					{
					setState(312);
					match(T__19);
					setState(313);
					match(Nome);
					setState(314);
					args();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(317);
				cham2();
				}
				break;
			}
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

	public static class ListadenomesContext extends ParserRuleContext {
		public List<TerminalNode> Nome() { return getTokens(LuaParser.Nome); }
		public TerminalNode Nome(int i) {
			return getToken(LuaParser.Nome, i);
		}
		public ListadenomesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listadenomes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListadenomes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListadenomes(this);
		}
	}

	public final ListadenomesContext listadenomes() throws RecognitionException {
		ListadenomesContext _localctx = new ListadenomesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_listadenomes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(Nome);
			setState(326);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(322);
					match(T__12);
					setState(323);
					match(Nome);
					}
					} 
				}
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
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

	public static class ListaexpContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ListaexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListaexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListaexp(this);
		}
	}

	public final ListaexpContext listaexp() throws RecognitionException {
		ListaexpContext _localctx = new ListaexpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_listaexp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(329);
					exp(0);
					setState(330);
					match(T__12);
					}
					} 
				}
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(337);
			exp(0);
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

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode Numero() { return getToken(LuaParser.Numero, 0); }
		public TerminalNode Cadeia() { return getToken(LuaParser.Cadeia, 0); }
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ChamadadefuncaoContext chamadadefuncao() {
			return getRuleContext(ChamadadefuncaoContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ConstrutortabelaContext construtortabela() {
			return getRuleContext(ConstrutortabelaContext.class,0);
		}
		public OpunariaContext opunaria() {
			return getRuleContext(OpunariaContext.class,0);
		}
		public OpbinContext opbin() {
			return getRuleContext(OpbinContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				{
				setState(340);
				match(T__24);
				}
				break;
			case T__25:
				{
				setState(341);
				match(T__25);
				}
				break;
			case T__26:
				{
				setState(342);
				match(T__26);
				}
				break;
			case Numero:
				{
				setState(343);
				match(Numero);
				}
				break;
			case Cadeia:
				{
				setState(344);
				match(Cadeia);
				}
				break;
			case T__27:
				{
				setState(345);
				match(T__27);
				}
				break;
			case T__14:
				{
				setState(346);
				funcao();
				}
				break;
			case T__22:
			case Nome:
				{
				setState(353);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(347);
					var(0);
					}
					break;
				case 2:
					{
					setState(348);
					chamadadefuncao(0);
					}
					break;
				case 3:
					{
					setState(349);
					match(T__22);
					setState(350);
					exp(0);
					setState(351);
					match(T__23);
					}
					break;
				}
				}
				break;
			case T__28:
				{
				setState(355);
				construtortabela();
				}
				break;
			case T__31:
			case T__45:
			case T__46:
				{
				setState(356);
				opunaria();
				setState(357);
				exp(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(361);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(362);
					opbin();
					setState(363);
					exp(3);
					}
					} 
				}
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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

	public static class ArgsContext extends ParserRuleContext {
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public ConstrutortabelaContext construtortabela() {
			return getRuleContext(ConstrutortabelaContext.class,0);
		}
		public TerminalNode Cadeia() { return getToken(LuaParser.Cadeia, 0); }
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_args);
		int _la;
		try {
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				match(T__22);
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__31) | (1L << T__45) | (1L << T__46) | (1L << Nome) | (1L << Numero) | (1L << Cadeia))) != 0)) {
					{
					setState(371);
					listaexp();
					}
				}

				setState(374);
				match(T__23);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				construtortabela();
				}
				break;
			case Cadeia:
				enterOuterAlt(_localctx, 3);
				{
				setState(376);
				match(Cadeia);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FuncaoContext extends ParserRuleContext {
		public CorpodafuncaoContext corpodafuncao() {
			return getRuleContext(CorpodafuncaoContext.class,0);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(T__14);
			setState(380);
			corpodafuncao();
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

	public static class CorpodafuncaoContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ListaparContext listapar() {
			return getRuleContext(ListaparContext.class,0);
		}
		public CorpodafuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpodafuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterCorpodafuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitCorpodafuncao(this);
		}
	}

	public final CorpodafuncaoContext corpodafuncao() throws RecognitionException {
		CorpodafuncaoContext _localctx = new CorpodafuncaoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_corpodafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(T__22);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27 || _la==Nome) {
				{
				setState(383);
				listapar();
				}
			}

			setState(386);
			match(T__23);
			setState(387);
			bloco();
			setState(388);
			match(T__3);
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

	public static class ListaparContext extends ParserRuleContext {
		public ListadenomesContext listadenomes() {
			return getRuleContext(ListadenomesContext.class,0);
		}
		public ListaparContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listapar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListapar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListapar(this);
		}
	}

	public final ListaparContext listapar() throws RecognitionException {
		ListaparContext _localctx = new ListaparContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_listapar);
		int _la;
		try {
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Nome:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				listadenomes();
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(391);
					match(T__12);
					setState(392);
					match(T__27);
					}
				}

				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				match(T__27);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ConstrutortabelaContext extends ParserRuleContext {
		public ListadecamposContext listadecampos() {
			return getRuleContext(ListadecamposContext.class,0);
		}
		public ConstrutortabelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_construtortabela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterConstrutortabela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitConstrutortabela(this);
		}
	}

	public final ConstrutortabelaContext construtortabela() throws RecognitionException {
		ConstrutortabelaContext _localctx = new ConstrutortabelaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_construtortabela);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(T__28);
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__20) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__31) | (1L << T__45) | (1L << T__46) | (1L << Nome) | (1L << Numero) | (1L << Cadeia))) != 0)) {
				{
				setState(399);
				listadecampos();
				}
			}

			setState(402);
			match(T__29);
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

	public static class ListadecamposContext extends ParserRuleContext {
		public List<CampoContext> campo() {
			return getRuleContexts(CampoContext.class);
		}
		public CampoContext campo(int i) {
			return getRuleContext(CampoContext.class,i);
		}
		public List<SeparadordecamposContext> separadordecampos() {
			return getRuleContexts(SeparadordecamposContext.class);
		}
		public SeparadordecamposContext separadordecampos(int i) {
			return getRuleContext(SeparadordecamposContext.class,i);
		}
		public ListadecamposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listadecampos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterListadecampos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitListadecampos(this);
		}
	}

	public final ListadecamposContext listadecampos() throws RecognitionException {
		ListadecamposContext _localctx = new ListadecamposContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_listadecampos);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			campo();
			setState(410);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(405);
					separadordecampos();
					setState(406);
					campo();
					}
					} 
				}
				setState(412);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__12) {
				{
				setState(413);
				separadordecampos();
				}
			}

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

	public static class CampoContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode Nome() { return getToken(LuaParser.Nome, 0); }
		public CampoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterCampo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitCampo(this);
		}
	}

	public final CampoContext campo() throws RecognitionException {
		CampoContext _localctx = new CampoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_campo);
		try {
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				match(T__20);
				setState(417);
				exp(0);
				setState(418);
				match(T__21);
				setState(419);
				match(T__1);
				setState(420);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				match(Nome);
				setState(423);
				match(T__1);
				setState(424);
				exp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(425);
				exp(0);
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

	public static class SeparadordecamposContext extends ParserRuleContext {
		public SeparadordecamposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separadordecampos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterSeparadordecampos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitSeparadordecampos(this);
		}
	}

	public final SeparadordecamposContext separadordecampos() throws RecognitionException {
		SeparadordecamposContext _localctx = new SeparadordecamposContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_separadordecampos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__12) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class OpbinContext extends ParserRuleContext {
		public OpbinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opbin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpbin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpbin(this);
		}
	}

	public final OpbinContext opbin() throws RecognitionException {
		OpbinContext _localctx = new OpbinContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_opbin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class OpunariaContext extends ParserRuleContext {
		public OpunariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opunaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOpunaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOpunaria(this);
		}
	}

	public final OpunariaContext opunaria() throws RecognitionException {
		OpunariaContext _localctx = new OpunariaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_opunaria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__45) | (1L << T__46))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		case 7:
			return var_sempred((VarContext)_localctx, predIndex);
		case 8:
			return chamadadefuncao_sempred((ChamadadefuncaoContext)_localctx, predIndex);
		case 13:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean var_sempred(VarContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean chamadadefuncao_sempred(ChamadadefuncaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u01b5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\3\3\3\5\3\67\n\3\7\39\n\3\f\3\16\3<\13\3\3\3\3\3\5\3@\n\3\5"+
		"\3B\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5c\n"+
		"\5\f\5\16\5f\13\5\3\5\3\5\5\5j\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5v\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0090\n\5\5\5\u0092\n\5\3"+
		"\6\3\6\5\6\u0096\n\6\3\6\5\6\u0099\n\6\3\7\3\7\3\7\7\7\u009e\n\7\f\7\16"+
		"\7\u00a1\13\7\3\7\3\7\5\7\u00a5\n\7\3\b\3\b\3\b\7\b\u00aa\n\b\f\b\16\b"+
		"\u00ad\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b9\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c2\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u00cf\n\t\3\t\3\t\5\t\u00d3\n\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u00da\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00e3\n\t\3\t\3\t\7\t\u00e7"+
		"\n\t\f\t\16\t\u00ea\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00f3\n\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0100\n\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u0107\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0112\n\n\3"+
		"\n\3\n\5\n\u0116\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u011f\n\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u0126\n\n\3\n\3\n\7\n\u012a\n\n\f\n\16\n\u012d\13\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u0135\n\13\3\13\5\13\u0138\n\13\3\f"+
		"\3\f\3\f\3\f\5\f\u013e\n\f\3\f\3\f\5\f\u0142\n\f\3\r\3\r\3\r\7\r\u0147"+
		"\n\r\f\r\16\r\u014a\13\r\3\16\3\16\3\16\7\16\u014f\n\16\f\16\16\16\u0152"+
		"\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u0164\n\17\3\17\3\17\3\17\3\17\5\17\u016a\n\17\3"+
		"\17\3\17\3\17\3\17\7\17\u0170\n\17\f\17\16\17\u0173\13\17\3\20\3\20\5"+
		"\20\u0177\n\20\3\20\3\20\3\20\5\20\u017c\n\20\3\21\3\21\3\21\3\22\3\22"+
		"\5\22\u0183\n\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u018c\n\23\3"+
		"\23\5\23\u018f\n\23\3\24\3\24\5\24\u0193\n\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\7\25\u019b\n\25\f\25\16\25\u019e\13\25\3\25\5\25\u01a1\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01ad\n\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\31\2\5\20\22\34\32\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\2\5\4\2\3\3\17\17\3\2!/\4\2\"\"\60\61\2\u01e1\2"+
		"\62\3\2\2\2\4:\3\2\2\2\6C\3\2\2\2\b\u0091\3\2\2\2\n\u0098\3\2\2\2\f\u009a"+
		"\3\2\2\2\16\u00a6\3\2\2\2\20\u00d2\3\2\2\2\22\u0115\3\2\2\2\24\u0137\3"+
		"\2\2\2\26\u0141\3\2\2\2\30\u0143\3\2\2\2\32\u0150\3\2\2\2\34\u0169\3\2"+
		"\2\2\36\u017b\3\2\2\2 \u017d\3\2\2\2\"\u0180\3\2\2\2$\u018e\3\2\2\2&\u0190"+
		"\3\2\2\2(\u0196\3\2\2\2*\u01ac\3\2\2\2,\u01ae\3\2\2\2.\u01b0\3\2\2\2\60"+
		"\u01b2\3\2\2\2\62\63\5\4\3\2\63\3\3\2\2\2\64\66\5\b\5\2\65\67\7\3\2\2"+
		"\66\65\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\64\3\2\2\29<\3\2\2\2:8\3\2\2"+
		"\2:;\3\2\2\2;A\3\2\2\2<:\3\2\2\2=?\5\n\6\2>@\7\3\2\2?>\3\2\2\2?@\3\2\2"+
		"\2@B\3\2\2\2A=\3\2\2\2AB\3\2\2\2B\5\3\2\2\2CD\5\4\3\2D\7\3\2\2\2EF\5\16"+
		"\b\2FG\7\4\2\2GH\5\32\16\2H\u0092\3\2\2\2I\u0092\5\22\n\2JK\7\5\2\2KL"+
		"\5\6\4\2LM\7\6\2\2M\u0092\3\2\2\2NO\7\7\2\2OP\5\34\17\2PQ\7\5\2\2QR\5"+
		"\6\4\2RS\7\6\2\2S\u0092\3\2\2\2TU\7\b\2\2UV\5\6\4\2VW\7\t\2\2WX\5\34\17"+
		"\2X\u0092\3\2\2\2YZ\7\n\2\2Z[\5\34\17\2[\\\7\13\2\2\\d\5\6\4\2]^\7\f\2"+
		"\2^_\5\34\17\2_`\7\13\2\2`a\5\6\4\2ac\3\2\2\2b]\3\2\2\2cf\3\2\2\2db\3"+
		"\2\2\2de\3\2\2\2ei\3\2\2\2fd\3\2\2\2gh\7\r\2\2hj\5\6\4\2ig\3\2\2\2ij\3"+
		"\2\2\2jk\3\2\2\2kl\7\6\2\2l\u0092\3\2\2\2mn\7\16\2\2no\7\62\2\2op\7\4"+
		"\2\2pq\5\34\17\2qr\7\17\2\2ru\5\34\17\2st\7\17\2\2tv\5\34\17\2us\3\2\2"+
		"\2uv\3\2\2\2vw\3\2\2\2wx\7\5\2\2xy\5\6\4\2yz\7\6\2\2z\u0092\3\2\2\2{|"+
		"\7\16\2\2|}\5\30\r\2}~\7\20\2\2~\177\5\32\16\2\177\u0080\7\5\2\2\u0080"+
		"\u0081\5\6\4\2\u0081\u0082\7\6\2\2\u0082\u0092\3\2\2\2\u0083\u0084\7\21"+
		"\2\2\u0084\u0085\5\f\7\2\u0085\u0086\5\"\22\2\u0086\u0092\3\2\2\2\u0087"+
		"\u0088\7\22\2\2\u0088\u0089\7\21\2\2\u0089\u008a\7\62\2\2\u008a\u0092"+
		"\5\"\22\2\u008b\u008c\7\22\2\2\u008c\u008f\5\30\r\2\u008d\u008e\7\4\2"+
		"\2\u008e\u0090\5\32\16\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0092\3\2\2\2\u0091E\3\2\2\2\u0091I\3\2\2\2\u0091J\3\2\2\2\u0091N\3\2"+
		"\2\2\u0091T\3\2\2\2\u0091Y\3\2\2\2\u0091m\3\2\2\2\u0091{\3\2\2\2\u0091"+
		"\u0083\3\2\2\2\u0091\u0087\3\2\2\2\u0091\u008b\3\2\2\2\u0092\t\3\2\2\2"+
		"\u0093\u0095\7\23\2\2\u0094\u0096\5\32\16\2\u0095\u0094\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0099\7\24\2\2\u0098\u0093\3"+
		"\2\2\2\u0098\u0097\3\2\2\2\u0099\13\3\2\2\2\u009a\u009f\7\62\2\2\u009b"+
		"\u009c\7\25\2\2\u009c\u009e\7\62\2\2\u009d\u009b\3\2\2\2\u009e\u00a1\3"+
		"\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a4\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a3\7\26\2\2\u00a3\u00a5\7\62\2\2\u00a4\u00a2\3"+
		"\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\r\3\2\2\2\u00a6\u00ab\5\20\t\2\u00a7"+
		"\u00a8\7\17\2\2\u00a8\u00aa\5\20\t\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3"+
		"\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\17\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ae\u00af\b\t\1\2\u00af\u00b0\7\62\2\2\u00b0\u00d3\5"+
		"\24\13\2\u00b1\u00b2\7\31\2\2\u00b2\u00b3\5\34\17\2\u00b3\u00b8\7\32\2"+
		"\2\u00b4\u00b9\5\36\20\2\u00b5\u00b6\7\26\2\2\u00b6\u00b7\7\62\2\2\u00b7"+
		"\u00b9\5\36\20\2\u00b8\u00b4\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b9\u00ba\3"+
		"\2\2\2\u00ba\u00c1\5\26\f\2\u00bb\u00bc\7\27\2\2\u00bc\u00bd\5\34\17\2"+
		"\u00bd\u00be\7\30\2\2\u00be\u00c2\3\2\2\2\u00bf\u00c0\7\25\2\2\u00c0\u00c2"+
		"\7\62\2\2\u00c1\u00bb\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\3\2\2\2"+
		"\u00c3\u00c4\5\24\13\2\u00c4\u00d3\3\2\2\2\u00c5\u00c6\7\31\2\2\u00c6"+
		"\u00c7\5\34\17\2\u00c7\u00ce\7\32\2\2\u00c8\u00c9\7\27\2\2\u00c9\u00ca"+
		"\5\34\17\2\u00ca\u00cb\7\30\2\2\u00cb\u00cf\3\2\2\2\u00cc\u00cd\7\25\2"+
		"\2\u00cd\u00cf\7\62\2\2\u00ce\u00c8\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d1\5\24\13\2\u00d1\u00d3\3\2\2\2\u00d2\u00ae\3"+
		"\2\2\2\u00d2\u00b1\3\2\2\2\u00d2\u00c5\3\2\2\2\u00d3\u00e8\3\2\2\2\u00d4"+
		"\u00d9\f\5\2\2\u00d5\u00da\5\36\20\2\u00d6\u00d7\7\26\2\2\u00d7\u00d8"+
		"\7\62\2\2\u00d8\u00da\5\36\20\2\u00d9\u00d5\3\2\2\2\u00d9\u00d6\3\2\2"+
		"\2\u00da\u00db\3\2\2\2\u00db\u00e2\5\26\f\2\u00dc\u00dd\7\27\2\2\u00dd"+
		"\u00de\5\34\17\2\u00de\u00df\7\30\2\2\u00df\u00e3\3\2\2\2\u00e0\u00e1"+
		"\7\25\2\2\u00e1\u00e3\7\62\2\2\u00e2\u00dc\3\2\2\2\u00e2\u00e0\3\2\2\2"+
		"\u00e3\u00e4\3\2\2\2\u00e4\u00e5\5\24\13\2\u00e5\u00e7\3\2\2\2\u00e6\u00d4"+
		"\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\21\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\b\n\1\2\u00ec\u00ed\7\62\2"+
		"\2\u00ed\u00f2\5\24\13\2\u00ee\u00f3\5\36\20\2\u00ef\u00f0\7\26\2\2\u00f0"+
		"\u00f1\7\62\2\2\u00f1\u00f3\5\36\20\2\u00f2\u00ee\3\2\2\2\u00f2\u00ef"+
		"\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\5\26\f\2\u00f5\u0116\3\2\2\2"+
		"\u00f6\u00f7\7\31\2\2\u00f7\u00f8\5\34\17\2\u00f8\u00ff\7\32\2\2\u00f9"+
		"\u00fa\7\27\2\2\u00fa\u00fb\5\34\17\2\u00fb\u00fc\7\30\2\2\u00fc\u0100"+
		"\3\2\2\2\u00fd\u00fe\7\25\2\2\u00fe\u0100\7\62\2\2\u00ff\u00f9\3\2\2\2"+
		"\u00ff\u00fd\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0106\5\24\13\2\u0102\u0107"+
		"\5\36\20\2\u0103\u0104\7\26\2\2\u0104\u0105\7\62\2\2\u0105\u0107\5\36"+
		"\20\2\u0106\u0102\3\2\2\2\u0106\u0103\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0109\5\26\f\2\u0109\u0116\3\2\2\2\u010a\u010b\7\31\2\2\u010b\u010c\5"+
		"\34\17\2\u010c\u0111\7\32\2\2\u010d\u0112\5\36\20\2\u010e\u010f\7\26\2"+
		"\2\u010f\u0110\7\62\2\2\u0110\u0112\5\36\20\2\u0111\u010d\3\2\2\2\u0111"+
		"\u010e\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\5\26\f\2\u0114\u0116\3"+
		"\2\2\2\u0115\u00eb\3\2\2\2\u0115\u00f6\3\2\2\2\u0115\u010a\3\2\2\2\u0116"+
		"\u012b\3\2\2\2\u0117\u011e\f\5\2\2\u0118\u0119\7\27\2\2\u0119\u011a\5"+
		"\34\17\2\u011a\u011b\7\30\2\2\u011b\u011f\3\2\2\2\u011c\u011d\7\25\2\2"+
		"\u011d\u011f\7\62\2\2\u011e\u0118\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120"+
		"\3\2\2\2\u0120\u0125\5\24\13\2\u0121\u0126\5\36\20\2\u0122\u0123\7\26"+
		"\2\2\u0123\u0124\7\62\2\2\u0124\u0126\5\36\20\2\u0125\u0121\3\2\2\2\u0125"+
		"\u0122\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\5\26\f\2\u0128\u012a\3"+
		"\2\2\2\u0129\u0117\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\23\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\7\27\2"+
		"\2\u012f\u0130\5\34\17\2\u0130\u0131\7\30\2\2\u0131\u0135\3\2\2\2\u0132"+
		"\u0133\7\25\2\2\u0133\u0135\7\62\2\2\u0134\u012e\3\2\2\2\u0134\u0132\3"+
		"\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\5\24\13\2\u0137\u0134\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\25\3\2\2\2\u0139\u013e\5\36\20\2\u013a\u013b\7\26"+
		"\2\2\u013b\u013c\7\62\2\2\u013c\u013e\5\36\20\2\u013d\u0139\3\2\2\2\u013d"+
		"\u013a\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\5\26\f\2\u0140\u0142\3"+
		"\2\2\2\u0141\u013d\3\2\2\2\u0141\u0142\3\2\2\2\u0142\27\3\2\2\2\u0143"+
		"\u0148\7\62\2\2\u0144\u0145\7\17\2\2\u0145\u0147\7\62\2\2\u0146\u0144"+
		"\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\31\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c\5\34\17\2\u014c\u014d\7\17"+
		"\2\2\u014d\u014f\3\2\2\2\u014e\u014b\3\2\2\2\u014f\u0152\3\2\2\2\u0150"+
		"\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0150\3\2"+
		"\2\2\u0153\u0154\5\34\17\2\u0154\33\3\2\2\2\u0155\u0156\b\17\1\2\u0156"+
		"\u016a\7\33\2\2\u0157\u016a\7\34\2\2\u0158\u016a\7\35\2\2\u0159\u016a"+
		"\7\63\2\2\u015a\u016a\7\66\2\2\u015b\u016a\7\36\2\2\u015c\u016a\5 \21"+
		"\2\u015d\u0164\5\20\t\2\u015e\u0164\5\22\n\2\u015f\u0160\7\31\2\2\u0160"+
		"\u0161\5\34\17\2\u0161\u0162\7\32\2\2\u0162\u0164\3\2\2\2\u0163\u015d"+
		"\3\2\2\2\u0163\u015e\3\2\2\2\u0163\u015f\3\2\2\2\u0164\u016a\3\2\2\2\u0165"+
		"\u016a\5&\24\2\u0166\u0167\5\60\31\2\u0167\u0168\5\34\17\3\u0168\u016a"+
		"\3\2\2\2\u0169\u0155\3\2\2\2\u0169\u0157\3\2\2\2\u0169\u0158\3\2\2\2\u0169"+
		"\u0159\3\2\2\2\u0169\u015a\3\2\2\2\u0169\u015b\3\2\2\2\u0169\u015c\3\2"+
		"\2\2\u0169\u0163\3\2\2\2\u0169\u0165\3\2\2\2\u0169\u0166\3\2\2\2\u016a"+
		"\u0171\3\2\2\2\u016b\u016c\f\4\2\2\u016c\u016d\5.\30\2\u016d\u016e\5\34"+
		"\17\5\u016e\u0170\3\2\2\2\u016f\u016b\3\2\2\2\u0170\u0173\3\2\2\2\u0171"+
		"\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\35\3\2\2\2\u0173\u0171\3\2\2"+
		"\2\u0174\u0176\7\31\2\2\u0175\u0177\5\32\16\2\u0176\u0175\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017c\7\32\2\2\u0179\u017c\5"+
		"&\24\2\u017a\u017c\7\66\2\2\u017b\u0174\3\2\2\2\u017b\u0179\3\2\2\2\u017b"+
		"\u017a\3\2\2\2\u017c\37\3\2\2\2\u017d\u017e\7\21\2\2\u017e\u017f\5\"\22"+
		"\2\u017f!\3\2\2\2\u0180\u0182\7\31\2\2\u0181\u0183\5$\23\2\u0182\u0181"+
		"\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\7\32\2\2"+
		"\u0185\u0186\5\6\4\2\u0186\u0187\7\6\2\2\u0187#\3\2\2\2\u0188\u018b\5"+
		"\30\r\2\u0189\u018a\7\17\2\2\u018a\u018c\7\36\2\2\u018b\u0189\3\2\2\2"+
		"\u018b\u018c\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018f\7\36\2\2\u018e\u0188"+
		"\3\2\2\2\u018e\u018d\3\2\2\2\u018f%\3\2\2\2\u0190\u0192\7\37\2\2\u0191"+
		"\u0193\5(\25\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2"+
		"\2\2\u0194\u0195\7 \2\2\u0195\'\3\2\2\2\u0196\u019c\5*\26\2\u0197\u0198"+
		"\5,\27\2\u0198\u0199\5*\26\2\u0199\u019b\3\2\2\2\u019a\u0197\3\2\2\2\u019b"+
		"\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u01a0\3\2"+
		"\2\2\u019e\u019c\3\2\2\2\u019f\u01a1\5,\27\2\u01a0\u019f\3\2\2\2\u01a0"+
		"\u01a1\3\2\2\2\u01a1)\3\2\2\2\u01a2\u01a3\7\27\2\2\u01a3\u01a4\5\34\17"+
		"\2\u01a4\u01a5\7\30\2\2\u01a5\u01a6\7\4\2\2\u01a6\u01a7\5\34\17\2\u01a7"+
		"\u01ad\3\2\2\2\u01a8\u01a9\7\62\2\2\u01a9\u01aa\7\4\2\2\u01aa\u01ad\5"+
		"\34\17\2\u01ab\u01ad\5\34\17\2\u01ac\u01a2\3\2\2\2\u01ac\u01a8\3\2\2\2"+
		"\u01ac\u01ab\3\2\2\2\u01ad+\3\2\2\2\u01ae\u01af\t\2\2\2\u01af-\3\2\2\2"+
		"\u01b0\u01b1\t\3\2\2\u01b1/\3\2\2\2\u01b2\u01b3\t\4\2\2\u01b3\61\3\2\2"+
		"\2\61\66:?Adiu\u008f\u0091\u0095\u0098\u009f\u00a4\u00ab\u00b8\u00c1\u00ce"+
		"\u00d2\u00d9\u00e2\u00e8\u00f2\u00ff\u0106\u0111\u0115\u011e\u0125\u012b"+
		"\u0134\u0137\u013d\u0141\u0148\u0150\u0163\u0169\u0171\u0176\u017b\u0182"+
		"\u018b\u018e\u0192\u019c\u01a0\u01ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}