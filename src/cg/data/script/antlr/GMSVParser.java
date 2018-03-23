// Generated from D:\My_space\CrossGateData\src\cg\data\script\antlr\GMSV.g4 by ANTLR 4.5.1

package cg.data.script.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GMSVParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, T__104=105, T__105=106, T__106=107, 
		T__107=108, T__108=109, T__109=110, T__110=111, T__111=112, T__112=113, 
		T__113=114, T__114=115, T__115=116, T__116=117, T__117=118, T__118=119, 
		T__119=120, T__120=121, T__121=122, T__122=123, T__123=124, T__124=125, 
		T__125=126, T__126=127, T__127=128, T__128=129, T__129=130, T__130=131, 
		T__131=132, T__132=133, T__133=134, T__134=135, T__135=136, T__136=137, 
		T__137=138, T__138=139, T__139=140, T__140=141, T__141=142, T__142=143, 
		T__143=144, T__144=145, T__145=146, T__146=147, T__147=148, T__148=149, 
		T__149=150, T__150=151, T__151=152, T__152=153, T__153=154, T__154=155, 
		T__155=156, T__156=157, T__157=158, T__158=159, T__159=160, T__160=161, 
		T__161=162, T__162=163, T__163=164, T__164=165, T__165=166, T__166=167, 
		T__167=168, T__168=169, T__169=170, T__170=171, T__171=172, T__172=173, 
		T__173=174, T__174=175, T__175=176, T__176=177, T__177=178, T__178=179, 
		T__179=180, T__180=181, T__181=182, T__182=183, T__183=184, T__184=185, 
		T__185=186, T__186=187, T__187=188, T__188=189, T__189=190, T__190=191, 
		T__191=192, T__192=193, T__193=194, T__194=195, T__195=196, T__196=197, 
		T__197=198, T__198=199, T__199=200, T__200=201, T__201=202, T__202=203, 
		T__203=204, T__204=205, T__205=206, T__206=207, T__207=208, T__208=209, 
		T__209=210, T__210=211, T__211=212, T__212=213, T__213=214, T__214=215, 
		T__215=216, T__216=217, T__217=218, T__218=219, BOOLEAN=220, NEWLINE=221, 
		STRING=222, NAME=223, INT=224, COLON=225, COMMA=226, SEMICOLON=227, LPAREN=228, 
		RPAREN=229, LSQUARE=230, RSQUARE=231, LCURLY=232, RCURLY=233, DOT=234, 
		UNDERLINE=235, ASSIGNEQUAL=236, NOTEQUAL1=237, NOTEQUAL2=238, LESSTHANOREQUALTO=239, 
		LESSTHAN=240, GREATERTHANOREQUALTO=241, GREATERTHAN=242, DIV=243, ADD=244, 
		SUB=245, MUL=246, MOD=247, TILDE=248, BITWISEOR=249, BITWISEXOR=250, POUND=251, 
		DOLLAR=252, COMMENT=253, LINE_COMMENT=254, WS=255, EQUAL=256, AND=257, 
		OR=258;
	public static final int
		RULE_r = 0, RULE_booleanRule = 1, RULE_exprBoolean = 2, RULE_expr = 3, 
		RULE_startRule = 4, RULE_commonRule = 5, RULE_addfeversec = 6, RULE_addgold = 7, 
		RULE_addgoldlevel = 8, RULE_addluck = 9, RULE_addskillslot = 10, RULE_addstampcount = 11, 
		RULE_bimage = 12, RULE_bbimage = 13, RULE_block = 14, RULE_changepal = 15, 
		RULE_checkitemcategory = 16, RULE_checkrealtime = 17, RULE_checkskillslot = 18, 
		RULE_checktitle = 19, RULE_encount = 20, RULE_endevent = 21, RULE_endwindow = 22, 
		RULE_equipitem = 23, RULE_fame = 24, RULE_floor = 25, RULE_fp = 26, RULE_gaendwindow = 27, 
		RULE_gawindow = 28, RULE_giveitem = 29, RULE_giveleak0item = 30, RULE_giveleak1item = 31, 
		RULE_givepet = 32, RULE_giverecipe = 33, RULE_givestackitem = 34, RULE_globalflag = 35, 
		RULE_globaltimer = 36, RULE_gold = 37, RULE_gotob = 38, RULE_gotof = 39, 
		RULE_group = 40, RULE_haveitem = 41, RULE_haveleak0item = 42, RULE_haveleak1item = 43, 
		RULE_havetitle = 44, RULE_houseid = 45, RULE_imagetype = 46, RULE_item = 47, 
		RULE_itemcreatetime = 48, RULE_itemdur = 49, RULE_itemdurper = 50, RULE_itemspace = 51, 
		RULE_job = 52, RULE_jobancestry = 53, RULE_jobrank = 54, RULE_killdrugdish = 55, 
		RULE_killitem = 56, RULE_killitemall = 57, RULE_killleak0item = 58, RULE_killleak1item = 59, 
		RULE_killpet = 60, RULE_killpeth = 61, RULE_killpetl = 62, RULE_leavegroup = 63, 
		RULE_level = 64, RULE_localcount = 65, RULE_localflag = 66, RULE_lp = 67, 
		RULE_maxfp = 68, RULE_maxlp = 69, RULE_message = 70, RULE_metamocount = 71, 
		RULE_next = 72, RULE_no = 73, RULE_nowevent = 74, RULE_nowtime = 75, RULE_ok = 76, 
		RULE_pequipitem = 77, RULE_petlevel = 78, RULE_petspace = 79, RULE_phitem = 80, 
		RULE_playse = 81, RULE_random = 82, RULE_setaction = 83, RULE_setcharm = 84, 
		RULE_setdur = 85, RULE_setfeverflg = 86, RULE_sethouse = 87, RULE_sethouselimit = 88, 
		RULE_setlevel = 89, RULE_setloginpoint = 90, RULE_setlp = 91, RULE_setobject = 92, 
		RULE_setvisitor = 93, RULE_shapenext = 94, RULE_shipchardown = 95, RULE_shipchartake = 96, 
		RULE_shipgetstoptime = 97, RULE_skilllevel = 98, RULE_stackitemspace = 99, 
		RULE_strcmpchat = 100, RULE_strstrchat = 101, RULE_systemmessage = 102, 
		RULE_trueimage = 103, RULE_warp = 104, RULE_window_no = 105, RULE_window_ok = 106, 
		RULE_window_yes = 107, RULE_xpos = 108, RULE_yes = 109, RULE_mutilCOMMON = 110, 
		RULE_mutilINT = 111, RULE_mutilBOOLEAN = 112;
	public static final String[] ruleNames = {
		"r", "booleanRule", "exprBoolean", "expr", "startRule", "commonRule", 
		"addfeversec", "addgold", "addgoldlevel", "addluck", "addskillslot", "addstampcount", 
		"bimage", "bbimage", "block", "changepal", "checkitemcategory", "checkrealtime", 
		"checkskillslot", "checktitle", "encount", "endevent", "endwindow", "equipitem", 
		"fame", "floor", "fp", "gaendwindow", "gawindow", "giveitem", "giveleak0item", 
		"giveleak1item", "givepet", "giverecipe", "givestackitem", "globalflag", 
		"globaltimer", "gold", "gotob", "gotof", "group", "haveitem", "haveleak0item", 
		"haveleak1item", "havetitle", "houseid", "imagetype", "item", "itemcreatetime", 
		"itemdur", "itemdurper", "itemspace", "job", "jobancestry", "jobrank", 
		"killdrugdish", "killitem", "killitemall", "killleak0item", "killleak1item", 
		"killpet", "killpeth", "killpetl", "leavegroup", "level", "localcount", 
		"localflag", "lp", "maxfp", "maxlp", "message", "metamocount", "next", 
		"no", "nowevent", "nowtime", "ok", "pequipitem", "petlevel", "petspace", 
		"phitem", "playse", "random", "setaction", "setcharm", "setdur", "setfeverflg", 
		"sethouse", "sethouselimit", "setlevel", "setloginpoint", "setlp", "setobject", 
		"setvisitor", "shapenext", "shipchardown", "shipchartake", "shipgetstoptime", 
		"skilllevel", "stackitemspace", "strcmpchat", "strstrchat", "systemmessage", 
		"trueimage", "warp", "window_no", "window_ok", "window_yes", "xpos", "yes", 
		"mutilCOMMON", "mutilINT", "mutilBOOLEAN"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Addfeversec'", "'AddFeverSec'", "'addfeversec'", "'AddGold'", 
		"'Addgold'", "'addgold'", "'AddGoldLevel'", "'addluck'", "'addskillslot'", 
		"'AddStampCount'", "'BImage'", "'Bimage'", "'BBImage'", "'BBimage'", "'bbimage'", 
		"'block'", "'ChangePal'", "'Changepal'", "'changepal'", "'CheckItemCategory'", 
		"'checkitemcategory'", "'CheckRealTime'", "'checkskillslot'", "'CheckTitle'", 
		"'checktitle'", "'Checktitle'", "'Encount'", "'encount'", "'endevent'", 
		"'EndEvent'", "'Endevent'", "'EndWindow'", "'endWindow'", "'EndWIndow'", 
		"'Endwindow'", "'ENDWindow'", "'endwindow'", "'EquipItem'", "'Fame'", 
		"'Floor'", "'fp'", "'FP'", "'GAendWindow'", "'GAendwindow'", "'GAEndWindow'", 
		"'GAwindow'", "'GAWindow'", "'giveItem'", "'Giveitem'", "'GIveitem'", 
		"'GiveItem'", "'GIveItem'", "'giveitem'", "'Giveleak0Item'", "'GiveLeak0Item'", 
		"'GiveLeak0item'", "'GIveleak1Item'", "'Giveleak1item'", "'Giveleak1Item'", 
		"'GiveLeak1item'", "'GiveLeak1Item'", "'Givepet'", "'GivePet'", "'givepet'", 
		"'GiveRecipe'", "'Giverecipe'", "'giverecipe'", "'GiveStackItem'", "'GAglobalFlag'", 
		"'GlobalTimerA'", "'gold'", "'Gold'", "'GOLD'", "'gotoB'", "'GotoB'", 
		"'gotoF'", "'GotoF'", "'Group'", "'group'", "'HaveItem'", "'HaveLeak0Item'", 
		"'HaveLeak1Item'", "'havetitle'", "'Havetitle'", "'HaveTitle'", "'HouseId'", 
		"'Imagetype'", "'Item'", "'itemcreatetime'", "'ItemCreateTime'", "'Itemcreatetime'", 
		"'ItemDur'", "'ItemDUR'", "'ItemDurPer'", "'ItemSpace'", "'Itemspace'", 
		"'itemspace'", "'job'", "'Job'", "'jobancestry'", "'JobAncestry'", "'Jobrank'", 
		"'JobRank'", "'killdrugdish'", "'killitem'", "'Killitem'", "'killItem'", 
		"'KillItem'", "'Killitemall'", "'killitemall'", "'KillItemall'", "'KillItemAll'", 
		"'KillItemALL'", "'KIllItemall'", "'killItemall'", "'killleak0item'", 
		"'KillLeak0item'", "'KillLeak0Item'", "'KillLeak1Item'", "'KillLeak1item'", 
		"'KillPet'", "'KillPetH'", "'KillPeth'", "'Killpeth'", "'KillPetl'", "'KillPetL'", 
		"'killpetL'", "'Leavegroup'", "'LeaveGroup'", "'leavegroup'", "'level'", 
		"'Level'", "'localCount'", "'LocalCount'", "'LocalFlag'", "'Localflag'", 
		"'lp'", "'maxfp'", "'maxlp'", "'Message'", "'message'", "'MetamoCount'", 
		"'next'", "'NEXT'", "'No'", "'NO'", "'nowevent'", "'Nowevent'", "'NowEvent'", 
		"'Nowtime'", "'nowtime'", "'NowTime'", "'OK'", "'PEquipItem'", "'PetLevel'", 
		"'petlevel'", "'Petlevel'", "'Petspace'", "'petspace'", "'PetSpace'", 
		"'petSpace'", "'PHItem'", "'playse'", "'Random'", "'random'", "'Setaction'", 
		"'SetAction'", "'setaction'", "'SetCharm'", "'setcharm'", "'SetDur'", 
		"'Setdur'", "'SetDUR'", "'Setfeverflg'", "'SetHouse'", "'SetHouseLimit'", 
		"'SetLevel'", "'SetLoginPoint'", "'SetLP'", "'SetLp'", "'SetObject'", 
		"'SetVisitor'", "'ShapeNext'", "'shapenext'", "'ShipCharDown'", "'ShipCharTake'", 
		"'ShipGetStopTime'", "'Skilllevel'", "'skilllevel'", "'SkillLevel'", "'StackItemSpace'", 
		"'StrCmpChat'", "'strcmpchat'", "'StrStrChat'", "'systemmessage'", "'SystemMessage'", 
		"'trueimage'", "'Warp'", "'warp'", "'window_no'", "'Window_no'", "'Window_NO'", 
		"'Window_No'", "'Window_OK'", "'Window_ok'", "'Window_Ok'", "'window_ok'", 
		"'window_OK'", "'WIndow_OK'", "'window_yes'", "'Window_YES'", "'Window_Yes'", 
		"'Window_yes'", "'WindoW_YES'", "'xpos'", "'Xpos'", "'XPos'", "'YES'", 
		"'Yes'", null, null, null, null, null, "':'", "','", "';'", "'('", "')'", 
		"'['", "']'", "'{'", "'}'", "'.'", "'_'", "'='", "'<>'", "'!='", "'<='", 
		"'<'", "'>='", "'>'", "'/'", "'+'", "'-'", "'*'", "'%'", "'~'", "'|'", 
		"'^'", "'#'", "'$'", null, null, null, "'=='", "'&&'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "BOOLEAN", "NEWLINE", "STRING", "NAME", "INT", 
		"COLON", "COMMA", "SEMICOLON", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", 
		"LCURLY", "RCURLY", "DOT", "UNDERLINE", "ASSIGNEQUAL", "NOTEQUAL1", "NOTEQUAL2", 
		"LESSTHANOREQUALTO", "LESSTHAN", "GREATERTHANOREQUALTO", "GREATERTHAN", 
		"DIV", "ADD", "SUB", "MUL", "MOD", "TILDE", "BITWISEOR", "BITWISEXOR", 
		"POUND", "DOLLAR", "COMMENT", "LINE_COMMENT", "WS", "EQUAL", "AND", "OR"
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
	public String getGrammarFileName() { return "GMSV.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GMSVParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GMSVParser.NAME, 0); }
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(NAME);
			setState(227);
			match(INT);
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

	public static class BooleanRuleContext extends ParserRuleContext {
		public BooleanRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanRule; }
	 
		public BooleanRuleContext() { }
		public void copyFrom(BooleanRuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooContext extends BooleanRuleContext {
		public TerminalNode BOOLEAN() { return getToken(GMSVParser.BOOLEAN, 0); }
		public BooContext(BooleanRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterBoo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitBoo(this);
		}
	}
	public static class BooParensContext extends BooleanRuleContext {
		public BooleanRuleContext booleanRule() {
			return getRuleContext(BooleanRuleContext.class,0);
		}
		public BooParensContext(BooleanRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterBooParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitBooParens(this);
		}
	}
	public static class MulBooContext extends BooleanRuleContext {
		public MutilBOOLEANContext mutilBOOLEAN() {
			return getRuleContext(MutilBOOLEANContext.class,0);
		}
		public MulBooContext(BooleanRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterMulBoo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitMulBoo(this);
		}
	}
	public static class ExpBooContext extends BooleanRuleContext {
		public ExprBooleanContext exprBoolean() {
			return getRuleContext(ExprBooleanContext.class,0);
		}
		public ExpBooContext(BooleanRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterExpBoo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitExpBoo(this);
		}
	}
	public static class AndOrContext extends BooleanRuleContext {
		public Token op;
		public List<BooleanRuleContext> booleanRule() {
			return getRuleContexts(BooleanRuleContext.class);
		}
		public BooleanRuleContext booleanRule(int i) {
			return getRuleContext(BooleanRuleContext.class,i);
		}
		public AndOrContext(BooleanRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterAndOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitAndOr(this);
		}
	}

	public final BooleanRuleContext booleanRule() throws RecognitionException {
		return booleanRule(0);
	}

	private BooleanRuleContext booleanRule(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanRuleContext _localctx = new BooleanRuleContext(_ctx, _parentState);
		BooleanRuleContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_booleanRule, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				_localctx = new MulBooContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(230);
				mutilBOOLEAN();
				}
				break;
			case 2:
				{
				_localctx = new ExpBooContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(231);
				exprBoolean();
				}
				break;
			case 3:
				{
				_localctx = new BooContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232);
				match(BOOLEAN);
				}
				break;
			case 4:
				{
				_localctx = new BooParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
				match(LPAREN);
				setState(234);
				booleanRule(0);
				setState(235);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndOrContext(new BooleanRuleContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_booleanRule);
					setState(239);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(240);
					((AndOrContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
						((AndOrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(241);
					booleanRule(6);
					}
					} 
				}
				setState(246);
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

	public static class ExprBooleanContext extends ParserRuleContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprBooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprBoolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterExprBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitExprBoolean(this);
		}
	}

	public final ExprBooleanContext exprBoolean() throws RecognitionException {
		ExprBooleanContext _localctx = new ExprBooleanContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exprBoolean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			expr(0);
			setState(248);
			((ExprBooleanContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 237)) & ~0x3f) == 0 && ((1L << (_la - 237)) & ((1L << (NOTEQUAL1 - 237)) | (1L << (NOTEQUAL2 - 237)) | (1L << (LESSTHANOREQUALTO - 237)) | (1L << (LESSTHAN - 237)) | (1L << (GREATERTHANOREQUALTO - 237)) | (1L << (GREATERTHAN - 237)) | (1L << (EQUAL - 237)))) != 0)) ) {
				((ExprBooleanContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(249);
			expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitParens(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitMulDiv(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitAddSub(this);
		}
	}
	public static class IntRuleContext extends ExprContext {
		public MutilINTContext mutilINT() {
			return getRuleContext(MutilINTContext.class,0);
		}
		public IntRuleContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterIntRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitIntRule(this);
		}
	}
	public static class IdContext extends ExprContext {
		public RContext r() {
			return getRuleContext(RContext.class,0);
		}
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitId(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitInt(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			switch (_input.LA(1)) {
			case NAME:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(252);
				r();
				}
				break;
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253);
				match(INT);
				}
				break;
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__70:
			case T__71:
			case T__72:
			case T__77:
			case T__78:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__97:
			case T__98:
			case T__99:
			case T__100:
			case T__101:
			case T__102:
			case T__130:
			case T__131:
			case T__136:
			case T__137:
			case T__138:
			case T__141:
			case T__146:
			case T__147:
			case T__148:
			case T__149:
			case T__150:
			case T__151:
			case T__153:
			case T__154:
			case T__155:
			case T__156:
			case T__157:
			case T__158:
			case T__159:
			case T__160:
			case T__161:
			case T__163:
			case T__164:
			case T__184:
			case T__185:
			case T__186:
			case T__187:
			case T__188:
			case T__189:
			case T__196:
			case T__214:
			case T__215:
			case T__216:
				{
				_localctx = new IntRuleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(254);
				mutilINT();
				}
				break;
			case LPAREN:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(255);
				match(LPAREN);
				setState(256);
				expr(0);
				setState(257);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(267);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(261);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(262);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 243)) & ~0x3f) == 0 && ((1L << (_la - 243)) & ((1L << (DIV - 243)) | (1L << (MUL - 243)) | (1L << (MOD - 243)))) != 0)) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(263);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(264);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(265);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(266);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class StartRuleContext extends ParserRuleContext {
		public BooleanRuleContext booleanRule() {
			return getRuleContext(BooleanRuleContext.class,0);
		}
		public CommonRuleContext commonRule() {
			return getRuleContext(CommonRuleContext.class,0);
		}
		public StartRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterStartRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitStartRule(this);
		}
	}

	public final StartRuleContext startRule() throws RecognitionException {
		StartRuleContext _localctx = new StartRuleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_startRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			booleanRule(0);
			setState(273);
			commonRule();
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

	public static class CommonRuleContext extends ParserRuleContext {
		public List<MutilCOMMONContext> mutilCOMMON() {
			return getRuleContexts(MutilCOMMONContext.class);
		}
		public MutilCOMMONContext mutilCOMMON(int i) {
			return getRuleContext(MutilCOMMONContext.class,i);
		}
		public CommonRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterCommonRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitCommonRule(this);
		}
	}

	public final CommonRuleContext commonRule() throws RecognitionException {
		CommonRuleContext _localctx = new CommonRuleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_commonRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__139 - 128)) | (1L << (T__140 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__152 - 128)) | (1L << (T__162 - 128)) | (1L << (T__165 - 128)) | (1L << (T__166 - 128)) | (1L << (T__167 - 128)) | (1L << (T__168 - 128)) | (1L << (T__169 - 128)) | (1L << (T__170 - 128)) | (1L << (T__171 - 128)) | (1L << (T__172 - 128)) | (1L << (T__173 - 128)) | (1L << (T__174 - 128)) | (1L << (T__175 - 128)) | (1L << (T__176 - 128)) | (1L << (T__177 - 128)) | (1L << (T__178 - 128)) | (1L << (T__179 - 128)) | (1L << (T__180 - 128)) | (1L << (T__181 - 128)) | (1L << (T__182 - 128)) | (1L << (T__183 - 128)) | (1L << (T__190 - 128)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (T__194 - 195)) | (1L << (T__195 - 195)) | (1L << (T__197 - 195)) | (1L << (T__198 - 195)) | (1L << (T__199 - 195)) | (1L << (T__200 - 195)) | (1L << (T__201 - 195)) | (1L << (T__202 - 195)) | (1L << (T__203 - 195)) | (1L << (T__204 - 195)) | (1L << (T__205 - 195)) | (1L << (T__206 - 195)) | (1L << (T__207 - 195)) | (1L << (T__208 - 195)) | (1L << (T__209 - 195)) | (1L << (T__210 - 195)) | (1L << (T__211 - 195)) | (1L << (T__212 - 195)) | (1L << (T__213 - 195)) | (1L << (T__217 - 195)) | (1L << (T__218 - 195)))) != 0)) {
				{
				{
				setState(275);
				mutilCOMMON();
				}
				}
				setState(280);
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

	public static class AddfeversecContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GMSVParser.STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public AddfeversecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addfeversec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterAddfeversec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitAddfeversec(this);
		}
	}

	public final AddfeversecContext addfeversec() throws RecognitionException {
		AddfeversecContext _localctx = new AddfeversecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_addfeversec);
		try {
			setState(286);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(T__0);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				match(T__2);
				setState(284);
				match(STRING);
				setState(285);
				match(NEWLINE);
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

	public static class AddgoldContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GMSVParser.STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public AddgoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addgold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterAddgold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitAddgold(this);
		}
	}

	public final AddgoldContext addgold() throws RecognitionException {
		AddgoldContext _localctx = new AddgoldContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_addgold);
		try {
			setState(293);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				match(T__5);
				setState(291);
				match(STRING);
				setState(292);
				match(NEWLINE);
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

	public static class AddgoldlevelContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public AddgoldlevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addgoldlevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterAddgoldlevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitAddgoldlevel(this);
		}
	}

	public final AddgoldlevelContext addgoldlevel() throws RecognitionException {
		AddgoldlevelContext _localctx = new AddgoldlevelContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_addgoldlevel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(T__6);
			setState(296);
			match(NEWLINE);
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

	public static class AddluckContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public AddluckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addluck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterAddluck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitAddluck(this);
		}
	}

	public final AddluckContext addluck() throws RecognitionException {
		AddluckContext _localctx = new AddluckContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_addluck);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(T__7);
			setState(299);
			match(INT);
			setState(300);
			match(INT);
			setState(301);
			match(NEWLINE);
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

	public static class AddskillslotContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public AddskillslotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addskillslot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterAddskillslot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitAddskillslot(this);
		}
	}

	public final AddskillslotContext addskillslot() throws RecognitionException {
		AddskillslotContext _localctx = new AddskillslotContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_addskillslot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(T__8);
			setState(304);
			match(NEWLINE);
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

	public static class AddstampcountContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public AddstampcountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addstampcount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterAddstampcount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitAddstampcount(this);
		}
	}

	public final AddstampcountContext addstampcount() throws RecognitionException {
		AddstampcountContext _localctx = new AddstampcountContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_addstampcount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(T__9);
			setState(307);
			match(INT);
			setState(308);
			match(INT);
			setState(309);
			match(NEWLINE);
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

	public static class BimageContext extends ParserRuleContext {
		public BimageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bimage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterBimage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitBimage(this);
		}
	}

	public final BimageContext bimage() throws RecognitionException {
		BimageContext _localctx = new BimageContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bimage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class BbimageContext extends ParserRuleContext {
		public BbimageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bbimage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterBbimage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitBbimage(this);
		}
	}

	public final BbimageContext bbimage() throws RecognitionException {
		BbimageContext _localctx = new BbimageContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bbimage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(GMSVParser.BOOLEAN, 0); }
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(T__15);
			setState(316);
			match(BOOLEAN);
			setState(317);
			match(NEWLINE);
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

	public static class ChangepalContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public ChangepalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_changepal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterChangepal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitChangepal(this);
		}
	}

	public final ChangepalContext changepal() throws RecognitionException {
		ChangepalContext _localctx = new ChangepalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_changepal);
		try {
			setState(325);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(T__16);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				match(T__18);
				setState(322);
				match(INT);
				setState(323);
				match(INT);
				setState(324);
				match(NEWLINE);
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

	public static class CheckitemcategoryContext extends ParserRuleContext {
		public CheckitemcategoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkitemcategory; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterCheckitemcategory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitCheckitemcategory(this);
		}
	}

	public final CheckitemcategoryContext checkitemcategory() throws RecognitionException {
		CheckitemcategoryContext _localctx = new CheckitemcategoryContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_checkitemcategory);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==T__20) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class CheckrealtimeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GMSVParser.STRING, 0); }
		public CheckrealtimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkrealtime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterCheckrealtime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitCheckrealtime(this);
		}
	}

	public final CheckrealtimeContext checkrealtime() throws RecognitionException {
		CheckrealtimeContext _localctx = new CheckrealtimeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_checkrealtime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(T__21);
			setState(330);
			match(STRING);
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

	public static class CheckskillslotContext extends ParserRuleContext {
		public CheckskillslotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkskillslot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterCheckskillslot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitCheckskillslot(this);
		}
	}

	public final CheckskillslotContext checkskillslot() throws RecognitionException {
		CheckskillslotContext _localctx = new CheckskillslotContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_checkskillslot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(T__22);
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

	public static class ChecktitleContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public ChecktitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checktitle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterChecktitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitChecktitle(this);
		}
	}

	public final ChecktitleContext checktitle() throws RecognitionException {
		ChecktitleContext _localctx = new ChecktitleContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_checktitle);
		try {
			setState(338);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				match(T__23);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				match(T__24);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(336);
				match(T__25);
				setState(337);
				match(NEWLINE);
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

	public static class EncountContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GMSVParser.STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public EncountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterEncount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitEncount(this);
		}
	}

	public final EncountContext encount() throws RecognitionException {
		EncountContext _localctx = new EncountContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_encount);
		try {
			setState(344);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				match(T__26);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				match(T__27);
				setState(342);
				match(STRING);
				setState(343);
				match(NEWLINE);
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

	public static class EndeventContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public EndeventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endevent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterEndevent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitEndevent(this);
		}
	}

	public final EndeventContext endevent() throws RecognitionException {
		EndeventContext _localctx = new EndeventContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_endevent);
		try {
			setState(352);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 3);
				{
				setState(348);
				match(T__30);
				setState(349);
				match(INT);
				setState(350);
				match(INT);
				setState(351);
				match(NEWLINE);
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

	public static class EndwindowContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(GMSVParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(GMSVParser.STRING, i);
		}
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public EndwindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endwindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterEndwindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitEndwindow(this);
		}
	}

	public final EndwindowContext endwindow() throws RecognitionException {
		EndwindowContext _localctx = new EndwindowContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_endwindow);
		try {
			setState(363);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(356);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 4);
				{
				setState(357);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 5);
				{
				setState(358);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 6);
				{
				setState(359);
				match(T__36);
				setState(360);
				match(STRING);
				setState(361);
				match(STRING);
				setState(362);
				match(NEWLINE);
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

	public static class EquipitemContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public EquipitemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equipitem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterEquipitem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitEquipitem(this);
		}
	}

	public final EquipitemContext equipitem() throws RecognitionException {
		EquipitemContext _localctx = new EquipitemContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_equipitem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(T__37);
			setState(366);
			match(INT);
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

	public static class FameContext extends ParserRuleContext {
		public FameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterFame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitFame(this);
		}
	}

	public final FameContext fame() throws RecognitionException {
		FameContext _localctx = new FameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fame);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(T__38);
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

	public static class FloorContext extends ParserRuleContext {
		public FloorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterFloor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitFloor(this);
		}
	}

	public final FloorContext floor() throws RecognitionException {
		FloorContext _localctx = new FloorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_floor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(T__39);
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

	public static class FpContext extends ParserRuleContext {
		public FpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterFp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitFp(this);
		}
	}

	public final FpContext fp() throws RecognitionException {
		FpContext _localctx = new FpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_la = _input.LA(1);
			if ( !(_la==T__40 || _la==T__41) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class GaendwindowContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GMSVParser.STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public GaendwindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gaendwindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterGaendwindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitGaendwindow(this);
		}
	}

	public final GaendwindowContext gaendwindow() throws RecognitionException {
		GaendwindowContext _localctx = new GaendwindowContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_gaendwindow);
		try {
			setState(379);
			switch (_input.LA(1)) {
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				match(T__42);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				match(T__43);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 3);
				{
				setState(376);
				match(T__44);
				setState(377);
				match(STRING);
				setState(378);
				match(NEWLINE);
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

	public static class GawindowContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(GMSVParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(GMSVParser.STRING, i);
		}
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public GawindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gawindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterGawindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitGawindow(this);
		}
	}

	public final GawindowContext gawindow() throws RecognitionException {
		GawindowContext _localctx = new GawindowContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_gawindow);
		try {
			setState(386);
			switch (_input.LA(1)) {
			case T__45:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				match(T__45);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				match(T__46);
				setState(383);
				match(STRING);
				setState(384);
				match(STRING);
				setState(385);
				match(NEWLINE);
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

	public static class GiveitemContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public GiveitemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_giveitem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterGiveitem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitGiveitem(this);
		}
	}

	public final GiveitemContext giveitem() throws RecognitionException {
		GiveitemContext _localctx = new GiveitemContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_giveitem);
		try {
			setState(397);
			switch (_input.LA(1)) {
			case T__47:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				match(T__47);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				match(T__48);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 4);
				{
				setState(391);
				match(T__50);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 5);
				{
				setState(392);
				match(T__51);
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 6);
				{
				setState(393);
				match(T__52);
				setState(394);
				match(INT);
				setState(395);
				match(INT);
				setState(396);
				match(NEWLINE);
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

	public static class Giveleak0itemContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public Giveleak0itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_giveleak0item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterGiveleak0item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitGiveleak0item(this);
		}
	}

	public final Giveleak0itemContext giveleak0item() throws RecognitionException {
		Giveleak0itemContext _localctx = new Giveleak0itemContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_giveleak0item);
		try {
			setState(404);
			switch (_input.LA(1)) {
			case T__53:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				match(T__53);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				match(T__54);
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 3);
				{
				setState(401);
				match(T__55);
				setState(402);
				match(INT);
				setState(403);
				match(NEWLINE);
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

	public static class Giveleak1itemContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public Giveleak1itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_giveleak1item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterGiveleak1item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitGiveleak1item(this);
		}
	}

	public final Giveleak1itemContext giveleak1item() throws RecognitionException {
		Giveleak1itemContext _localctx = new Giveleak1itemContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_giveleak1item);
		try {
			setState(413);
			switch (_input.LA(1)) {
			case T__56:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				match(T__56);
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				match(T__57);
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
				match(T__58);
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 4);
				{
				setState(409);
				match(T__59);
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 5);
				{
				setState(410);
				match(T__60);
				setState(411);
				match(INT);
				setState(412);
				match(NEWLINE);
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

	public static class GivepetContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public GivepetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_givepet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterGivepet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitGivepet(this);
		}
	}

	public final GivepetContext givepet() throws RecognitionException {
		GivepetContext _localctx = new GivepetContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_givepet);
		try {
			setState(420);
			switch (_input.LA(1)) {
			case T__61:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				match(T__61);
				}
				break;
			case T__62:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				match(T__62);
				}
				break;
			case T__63:
				enterOuterAlt(_localctx, 3);
				{
				setState(417);
				match(T__63);
				setState(418);
				match(INT);
				setState(419);
				match(NEWLINE);
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

	public static class GiverecipeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public GiverecipeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_giverecipe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterGiverecipe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitGiverecipe(this);
		}
	}

	public final GiverecipeContext giverecipe() throws RecognitionException {
		GiverecipeContext _localctx = new GiverecipeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_giverecipe);
		try {
			setState(427);
			switch (_input.LA(1)) {
			case T__64:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				match(T__64);
				}
				break;
			case T__65:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				match(T__65);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
				match(T__66);
				setState(425);
				match(INT);
				setState(426);
				match(NEWLINE);
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

	public static class GivestackitemContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public GivestackitemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_givestackitem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterGivestackitem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitGivestackitem(this);
		}
	}

	public final GivestackitemContext givestackitem() throws RecognitionException {
		GivestackitemContext _localctx = new GivestackitemContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_givestackitem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(T__67);
			setState(430);
			match(INT);
			setState(431);
			match(INT);
			setState(432);
			match(NEWLINE);
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

	public static class GlobalflagContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public GlobalflagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalflag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterGlobalflag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitGlobalflag(this);
		}
	}

	public final GlobalflagContext globalflag() throws RecognitionException {
		GlobalflagContext _localctx = new GlobalflagContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_globalflag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(T__68);
			setState(435);
			match(NEWLINE);
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

	public static class GlobaltimerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GMSVParser.STRING, 0); }
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public GlobaltimerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globaltimer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterGlobaltimer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitGlobaltimer(this);
		}
	}

	public final GlobaltimerContext globaltimer() throws RecognitionException {
		GlobaltimerContext _localctx = new GlobaltimerContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_globaltimer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(T__69);
			setState(438);
			match(STRING);
			setState(439);
			match(INT);
			setState(440);
			match(NEWLINE);
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

	public static class GoldContext extends ParserRuleContext {
		public GoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterGold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitGold(this);
		}
	}

	public final GoldContext gold() throws RecognitionException {
		GoldContext _localctx = new GoldContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_gold);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			_la = _input.LA(1);
			if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__70 - 71)) | (1L << (T__71 - 71)) | (1L << (T__72 - 71)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class GotobContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public GotobContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotob; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterGotob(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitGotob(this);
		}
	}

	public final GotobContext gotob() throws RecognitionException {
		GotobContext _localctx = new GotobContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_gotob);
		try {
			setState(447);
			switch (_input.LA(1)) {
			case T__73:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				match(T__73);
				}
				break;
			case T__74:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				match(T__74);
				setState(446);
				match(NEWLINE);
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

	public static class GotofContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public GotofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterGotof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitGotof(this);
		}
	}

	public final GotofContext gotof() throws RecognitionException {
		GotofContext _localctx = new GotofContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_gotof);
		try {
			setState(452);
			switch (_input.LA(1)) {
			case T__75:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				match(T__75);
				}
				break;
			case T__76:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				match(T__76);
				setState(451);
				match(NEWLINE);
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

	public static class GroupContext extends ParserRuleContext {
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitGroup(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_la = _input.LA(1);
			if ( !(_la==T__77 || _la==T__78) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class HaveitemContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public HaveitemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_haveitem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterHaveitem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitHaveitem(this);
		}
	}

	public final HaveitemContext haveitem() throws RecognitionException {
		HaveitemContext _localctx = new HaveitemContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_haveitem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(T__79);
			setState(457);
			match(INT);
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

	public static class Haveleak0itemContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public Haveleak0itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_haveleak0item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterHaveleak0item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitHaveleak0item(this);
		}
	}

	public final Haveleak0itemContext haveleak0item() throws RecognitionException {
		Haveleak0itemContext _localctx = new Haveleak0itemContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_haveleak0item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(T__80);
			setState(460);
			match(INT);
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

	public static class Haveleak1itemContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public Haveleak1itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_haveleak1item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterHaveleak1item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitHaveleak1item(this);
		}
	}

	public final Haveleak1itemContext haveleak1item() throws RecognitionException {
		Haveleak1itemContext _localctx = new Haveleak1itemContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_haveleak1item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(T__81);
			setState(463);
			match(INT);
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

	public static class HavetitleContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public HavetitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havetitle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterHavetitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitHavetitle(this);
		}
	}

	public final HavetitleContext havetitle() throws RecognitionException {
		HavetitleContext _localctx = new HavetitleContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_havetitle);
		try {
			setState(469);
			switch (_input.LA(1)) {
			case T__82:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				match(T__82);
				}
				break;
			case T__83:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				match(T__83);
				}
				break;
			case T__84:
				enterOuterAlt(_localctx, 3);
				{
				setState(467);
				match(T__84);
				setState(468);
				match(INT);
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

	public static class HouseidContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public HouseidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_houseid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterHouseid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitHouseid(this);
		}
	}

	public final HouseidContext houseid() throws RecognitionException {
		HouseidContext _localctx = new HouseidContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_houseid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(T__85);
			setState(472);
			match(INT);
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

	public static class ImagetypeContext extends ParserRuleContext {
		public ImagetypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imagetype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterImagetype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitImagetype(this);
		}
	}

	public final ImagetypeContext imagetype() throws RecognitionException {
		ImagetypeContext _localctx = new ImagetypeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_imagetype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(T__86);
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

	public static class ItemContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitItem(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(T__87);
			setState(477);
			match(INT);
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

	public static class ItemcreatetimeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public ItemcreatetimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemcreatetime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterItemcreatetime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitItemcreatetime(this);
		}
	}

	public final ItemcreatetimeContext itemcreatetime() throws RecognitionException {
		ItemcreatetimeContext _localctx = new ItemcreatetimeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_itemcreatetime);
		try {
			setState(483);
			switch (_input.LA(1)) {
			case T__88:
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				match(T__88);
				}
				break;
			case T__89:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				match(T__89);
				}
				break;
			case T__90:
				enterOuterAlt(_localctx, 3);
				{
				setState(481);
				match(T__90);
				setState(482);
				match(INT);
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

	public static class ItemdurContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public ItemdurContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemdur; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterItemdur(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitItemdur(this);
		}
	}

	public final ItemdurContext itemdur() throws RecognitionException {
		ItemdurContext _localctx = new ItemdurContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_itemdur);
		try {
			setState(488);
			switch (_input.LA(1)) {
			case T__91:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				match(T__91);
				}
				break;
			case T__92:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				match(T__92);
				setState(487);
				match(INT);
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

	public static class ItemdurperContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public ItemdurperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemdurper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterItemdurper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitItemdurper(this);
		}
	}

	public final ItemdurperContext itemdurper() throws RecognitionException {
		ItemdurperContext _localctx = new ItemdurperContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_itemdurper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(T__93);
			setState(491);
			match(INT);
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

	public static class ItemspaceContext extends ParserRuleContext {
		public ItemspaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemspace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterItemspace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitItemspace(this);
		}
	}

	public final ItemspaceContext itemspace() throws RecognitionException {
		ItemspaceContext _localctx = new ItemspaceContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_itemspace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			_la = _input.LA(1);
			if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (T__94 - 95)) | (1L << (T__95 - 95)) | (1L << (T__96 - 95)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class JobContext extends ParserRuleContext {
		public JobContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_job; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterJob(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitJob(this);
		}
	}

	public final JobContext job() throws RecognitionException {
		JobContext _localctx = new JobContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_job);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			_la = _input.LA(1);
			if ( !(_la==T__97 || _la==T__98) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class JobancestryContext extends ParserRuleContext {
		public JobancestryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jobancestry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterJobancestry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitJobancestry(this);
		}
	}

	public final JobancestryContext jobancestry() throws RecognitionException {
		JobancestryContext _localctx = new JobancestryContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_jobancestry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			_la = _input.LA(1);
			if ( !(_la==T__99 || _la==T__100) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class JobrankContext extends ParserRuleContext {
		public JobrankContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jobrank; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterJobrank(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitJobrank(this);
		}
	}

	public final JobrankContext jobrank() throws RecognitionException {
		JobrankContext _localctx = new JobrankContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_jobrank);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_la = _input.LA(1);
			if ( !(_la==T__101 || _la==T__102) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class KilldrugdishContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public KilldrugdishContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_killdrugdish; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterKilldrugdish(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitKilldrugdish(this);
		}
	}

	public final KilldrugdishContext killdrugdish() throws RecognitionException {
		KilldrugdishContext _localctx = new KilldrugdishContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_killdrugdish);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(T__103);
			setState(502);
			match(NEWLINE);
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

	public static class KillitemContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public KillitemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_killitem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterKillitem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitKillitem(this);
		}
	}

	public final KillitemContext killitem() throws RecognitionException {
		KillitemContext _localctx = new KillitemContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_killitem);
		try {
			setState(510);
			switch (_input.LA(1)) {
			case T__104:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				match(T__104);
				}
				break;
			case T__105:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				match(T__105);
				}
				break;
			case T__106:
				enterOuterAlt(_localctx, 3);
				{
				setState(506);
				match(T__106);
				}
				break;
			case T__107:
				enterOuterAlt(_localctx, 4);
				{
				setState(507);
				match(T__107);
				setState(508);
				match(INT);
				setState(509);
				match(NEWLINE);
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

	public static class KillitemallContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public KillitemallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_killitemall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterKillitemall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitKillitemall(this);
		}
	}

	public final KillitemallContext killitemall() throws RecognitionException {
		KillitemallContext _localctx = new KillitemallContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_killitemall);
		try {
			setState(521);
			switch (_input.LA(1)) {
			case T__108:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				match(T__108);
				}
				break;
			case T__109:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				match(T__109);
				}
				break;
			case T__110:
				enterOuterAlt(_localctx, 3);
				{
				setState(514);
				match(T__110);
				}
				break;
			case T__111:
				enterOuterAlt(_localctx, 4);
				{
				setState(515);
				match(T__111);
				}
				break;
			case T__112:
				enterOuterAlt(_localctx, 5);
				{
				setState(516);
				match(T__112);
				}
				break;
			case T__113:
				enterOuterAlt(_localctx, 6);
				{
				setState(517);
				match(T__113);
				}
				break;
			case T__114:
				enterOuterAlt(_localctx, 7);
				{
				setState(518);
				match(T__114);
				setState(519);
				match(INT);
				setState(520);
				match(NEWLINE);
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

	public static class Killleak0itemContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public Killleak0itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_killleak0item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterKillleak0item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitKillleak0item(this);
		}
	}

	public final Killleak0itemContext killleak0item() throws RecognitionException {
		Killleak0itemContext _localctx = new Killleak0itemContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_killleak0item);
		try {
			setState(529);
			switch (_input.LA(1)) {
			case T__115:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				match(T__115);
				}
				break;
			case T__116:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				match(T__116);
				}
				break;
			case T__117:
				enterOuterAlt(_localctx, 3);
				{
				setState(525);
				match(T__117);
				setState(526);
				match(INT);
				setState(527);
				match(INT);
				setState(528);
				match(NEWLINE);
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

	public static class Killleak1itemContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public Killleak1itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_killleak1item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterKillleak1item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitKillleak1item(this);
		}
	}

	public final Killleak1itemContext killleak1item() throws RecognitionException {
		Killleak1itemContext _localctx = new Killleak1itemContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_killleak1item);
		try {
			setState(535);
			switch (_input.LA(1)) {
			case T__118:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				match(T__118);
				}
				break;
			case T__119:
				enterOuterAlt(_localctx, 2);
				{
				setState(532);
				match(T__119);
				setState(533);
				match(INT);
				setState(534);
				match(NEWLINE);
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

	public static class KillpetContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public KillpetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_killpet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterKillpet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitKillpet(this);
		}
	}

	public final KillpetContext killpet() throws RecognitionException {
		KillpetContext _localctx = new KillpetContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_killpet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(T__120);
			setState(538);
			match(INT);
			setState(539);
			match(NEWLINE);
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

	public static class KillpethContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public KillpethContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_killpeth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterKillpeth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitKillpeth(this);
		}
	}

	public final KillpethContext killpeth() throws RecognitionException {
		KillpethContext _localctx = new KillpethContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_killpeth);
		try {
			setState(547);
			switch (_input.LA(1)) {
			case T__121:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				match(T__121);
				}
				break;
			case T__122:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				match(T__122);
				}
				break;
			case T__123:
				enterOuterAlt(_localctx, 3);
				{
				setState(543);
				match(T__123);
				setState(544);
				match(INT);
				setState(545);
				match(INT);
				setState(546);
				match(NEWLINE);
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

	public static class KillpetlContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public KillpetlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_killpetl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterKillpetl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitKillpetl(this);
		}
	}

	public final KillpetlContext killpetl() throws RecognitionException {
		KillpetlContext _localctx = new KillpetlContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_killpetl);
		try {
			setState(555);
			switch (_input.LA(1)) {
			case T__124:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				match(T__124);
				}
				break;
			case T__125:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				match(T__125);
				}
				break;
			case T__126:
				enterOuterAlt(_localctx, 3);
				{
				setState(551);
				match(T__126);
				setState(552);
				match(INT);
				setState(553);
				match(INT);
				setState(554);
				match(NEWLINE);
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

	public static class LeavegroupContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public LeavegroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leavegroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterLeavegroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitLeavegroup(this);
		}
	}

	public final LeavegroupContext leavegroup() throws RecognitionException {
		LeavegroupContext _localctx = new LeavegroupContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_leavegroup);
		try {
			setState(561);
			switch (_input.LA(1)) {
			case T__127:
				enterOuterAlt(_localctx, 1);
				{
				setState(557);
				match(T__127);
				}
				break;
			case T__128:
				enterOuterAlt(_localctx, 2);
				{
				setState(558);
				match(T__128);
				}
				break;
			case T__129:
				enterOuterAlt(_localctx, 3);
				{
				setState(559);
				match(T__129);
				setState(560);
				match(NEWLINE);
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

	public static class LevelContext extends ParserRuleContext {
		public LevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitLevel(this);
		}
	}

	public final LevelContext level() throws RecognitionException {
		LevelContext _localctx = new LevelContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_level);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			_la = _input.LA(1);
			if ( !(_la==T__130 || _la==T__131) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class LocalcountContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public LocalcountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localcount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterLocalcount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitLocalcount(this);
		}
	}

	public final LocalcountContext localcount() throws RecognitionException {
		LocalcountContext _localctx = new LocalcountContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_localcount);
		try {
			setState(568);
			switch (_input.LA(1)) {
			case T__132:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				match(T__132);
				}
				break;
			case T__133:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				match(T__133);
				setState(567);
				match(NEWLINE);
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

	public static class LocalflagContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public LocalflagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localflag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterLocalflag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitLocalflag(this);
		}
	}

	public final LocalflagContext localflag() throws RecognitionException {
		LocalflagContext _localctx = new LocalflagContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_localflag);
		try {
			setState(573);
			switch (_input.LA(1)) {
			case T__134:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				match(T__134);
				}
				break;
			case T__135:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				match(T__135);
				setState(572);
				match(NEWLINE);
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

	public static class LpContext extends ParserRuleContext {
		public LpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterLp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitLp(this);
		}
	}

	public final LpContext lp() throws RecognitionException {
		LpContext _localctx = new LpContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_lp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(T__136);
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

	public static class MaxfpContext extends ParserRuleContext {
		public MaxfpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maxfp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterMaxfp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitMaxfp(this);
		}
	}

	public final MaxfpContext maxfp() throws RecognitionException {
		MaxfpContext _localctx = new MaxfpContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_maxfp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(T__137);
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

	public static class MaxlpContext extends ParserRuleContext {
		public MaxlpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maxlp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterMaxlp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitMaxlp(this);
		}
	}

	public final MaxlpContext maxlp() throws RecognitionException {
		MaxlpContext _localctx = new MaxlpContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_maxlp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(T__138);
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

	public static class MessageContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public MessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitMessage(this);
		}
	}

	public final MessageContext message() throws RecognitionException {
		MessageContext _localctx = new MessageContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_message);
		try {
			setState(585);
			switch (_input.LA(1)) {
			case T__139:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				match(T__139);
				}
				break;
			case T__140:
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				match(T__140);
				setState(583);
				match(INT);
				setState(584);
				match(NEWLINE);
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

	public static class MetamocountContext extends ParserRuleContext {
		public MetamocountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metamocount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterMetamocount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitMetamocount(this);
		}
	}

	public final MetamocountContext metamocount() throws RecognitionException {
		MetamocountContext _localctx = new MetamocountContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_metamocount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(T__141);
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

	public static class NextContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public NextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterNext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitNext(this);
		}
	}

	public final NextContext next() throws RecognitionException {
		NextContext _localctx = new NextContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_next);
		try {
			setState(592);
			switch (_input.LA(1)) {
			case T__142:
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				match(T__142);
				}
				break;
			case T__143:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				match(T__143);
				setState(591);
				match(NEWLINE);
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

	public static class NoContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public NoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterNo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitNo(this);
		}
	}

	public final NoContext no() throws RecognitionException {
		NoContext _localctx = new NoContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_no);
		try {
			setState(597);
			switch (_input.LA(1)) {
			case T__144:
				enterOuterAlt(_localctx, 1);
				{
				setState(594);
				match(T__144);
				}
				break;
			case T__145:
				enterOuterAlt(_localctx, 2);
				{
				setState(595);
				match(T__145);
				setState(596);
				match(NEWLINE);
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

	public static class NoweventContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public NoweventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nowevent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterNowevent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitNowevent(this);
		}
	}

	public final NoweventContext nowevent() throws RecognitionException {
		NoweventContext _localctx = new NoweventContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_nowevent);
		try {
			setState(603);
			switch (_input.LA(1)) {
			case T__146:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				match(T__146);
				}
				break;
			case T__147:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				match(T__147);
				}
				break;
			case T__148:
				enterOuterAlt(_localctx, 3);
				{
				setState(601);
				match(T__148);
				setState(602);
				match(INT);
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

	public static class NowtimeContext extends ParserRuleContext {
		public NowtimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nowtime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterNowtime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitNowtime(this);
		}
	}

	public final NowtimeContext nowtime() throws RecognitionException {
		NowtimeContext _localctx = new NowtimeContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_nowtime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			_la = _input.LA(1);
			if ( !(((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & ((1L << (T__149 - 150)) | (1L << (T__150 - 150)) | (1L << (T__151 - 150)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class OkContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public OkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterOk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitOk(this);
		}
	}

	public final OkContext ok() throws RecognitionException {
		OkContext _localctx = new OkContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_ok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(T__152);
			setState(608);
			match(NEWLINE);
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

	public static class PequipitemContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public PequipitemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pequipitem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterPequipitem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitPequipitem(this);
		}
	}

	public final PequipitemContext pequipitem() throws RecognitionException {
		PequipitemContext _localctx = new PequipitemContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_pequipitem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(T__153);
			setState(611);
			match(INT);
			setState(612);
			match(INT);
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

	public static class PetlevelContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public PetlevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_petlevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterPetlevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitPetlevel(this);
		}
	}

	public final PetlevelContext petlevel() throws RecognitionException {
		PetlevelContext _localctx = new PetlevelContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_petlevel);
		try {
			setState(618);
			switch (_input.LA(1)) {
			case T__154:
				enterOuterAlt(_localctx, 1);
				{
				setState(614);
				match(T__154);
				}
				break;
			case T__155:
				enterOuterAlt(_localctx, 2);
				{
				setState(615);
				match(T__155);
				}
				break;
			case T__156:
				enterOuterAlt(_localctx, 3);
				{
				setState(616);
				match(T__156);
				setState(617);
				match(INT);
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

	public static class PetspaceContext extends ParserRuleContext {
		public PetspaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_petspace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterPetspace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitPetspace(this);
		}
	}

	public final PetspaceContext petspace() throws RecognitionException {
		PetspaceContext _localctx = new PetspaceContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_petspace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			_la = _input.LA(1);
			if ( !(((((_la - 158)) & ~0x3f) == 0 && ((1L << (_la - 158)) & ((1L << (T__157 - 158)) | (1L << (T__158 - 158)) | (1L << (T__159 - 158)) | (1L << (T__160 - 158)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class PhitemContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public PhitemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phitem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterPhitem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitPhitem(this);
		}
	}

	public final PhitemContext phitem() throws RecognitionException {
		PhitemContext _localctx = new PhitemContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_phitem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(T__161);
			setState(623);
			match(INT);
			setState(624);
			match(INT);
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

	public static class PlayseContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public PlayseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterPlayse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitPlayse(this);
		}
	}

	public final PlayseContext playse() throws RecognitionException {
		PlayseContext _localctx = new PlayseContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_playse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(T__162);
			setState(627);
			match(INT);
			setState(628);
			match(INT);
			setState(629);
			match(INT);
			setState(630);
			match(NEWLINE);
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

	public static class RandomContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public RandomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_random; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterRandom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitRandom(this);
		}
	}

	public final RandomContext random() throws RecognitionException {
		RandomContext _localctx = new RandomContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_random);
		try {
			setState(636);
			switch (_input.LA(1)) {
			case T__163:
				enterOuterAlt(_localctx, 1);
				{
				setState(632);
				match(T__163);
				}
				break;
			case T__164:
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				match(T__164);
				setState(634);
				match(INT);
				setState(635);
				match(INT);
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

	public static class SetactionContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public SetactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setaction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterSetaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitSetaction(this);
		}
	}

	public final SetactionContext setaction() throws RecognitionException {
		SetactionContext _localctx = new SetactionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_setaction);
		try {
			setState(643);
			switch (_input.LA(1)) {
			case T__165:
				enterOuterAlt(_localctx, 1);
				{
				setState(638);
				match(T__165);
				}
				break;
			case T__166:
				enterOuterAlt(_localctx, 2);
				{
				setState(639);
				match(T__166);
				}
				break;
			case T__167:
				enterOuterAlt(_localctx, 3);
				{
				setState(640);
				match(T__167);
				setState(641);
				match(INT);
				setState(642);
				match(NEWLINE);
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

	public static class SetcharmContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GMSVParser.STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public SetcharmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setcharm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterSetcharm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitSetcharm(this);
		}
	}

	public final SetcharmContext setcharm() throws RecognitionException {
		SetcharmContext _localctx = new SetcharmContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_setcharm);
		try {
			setState(649);
			switch (_input.LA(1)) {
			case T__168:
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				match(T__168);
				}
				break;
			case T__169:
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
				match(T__169);
				setState(647);
				match(STRING);
				setState(648);
				match(NEWLINE);
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

	public static class SetdurContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public TerminalNode STRING() { return getToken(GMSVParser.STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public SetdurContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setdur; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterSetdur(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitSetdur(this);
		}
	}

	public final SetdurContext setdur() throws RecognitionException {
		SetdurContext _localctx = new SetdurContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_setdur);
		try {
			setState(657);
			switch (_input.LA(1)) {
			case T__170:
				enterOuterAlt(_localctx, 1);
				{
				setState(651);
				match(T__170);
				}
				break;
			case T__171:
				enterOuterAlt(_localctx, 2);
				{
				setState(652);
				match(T__171);
				}
				break;
			case T__172:
				enterOuterAlt(_localctx, 3);
				{
				setState(653);
				match(T__172);
				setState(654);
				match(INT);
				setState(655);
				match(STRING);
				setState(656);
				match(NEWLINE);
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

	public static class SetfeverflgContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public SetfeverflgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setfeverflg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterSetfeverflg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitSetfeverflg(this);
		}
	}

	public final SetfeverflgContext setfeverflg() throws RecognitionException {
		SetfeverflgContext _localctx = new SetfeverflgContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_setfeverflg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			match(T__173);
			setState(660);
			match(INT);
			setState(661);
			match(NEWLINE);
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

	public static class SethouseContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public SethouseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sethouse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterSethouse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitSethouse(this);
		}
	}

	public final SethouseContext sethouse() throws RecognitionException {
		SethouseContext _localctx = new SethouseContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_sethouse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(T__174);
			setState(664);
			match(INT);
			setState(665);
			match(INT);
			setState(666);
			match(NEWLINE);
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

	public static class SethouselimitContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public SethouselimitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sethouselimit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterSethouselimit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitSethouselimit(this);
		}
	}

	public final SethouselimitContext sethouselimit() throws RecognitionException {
		SethouselimitContext _localctx = new SethouselimitContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_sethouselimit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(T__175);
			setState(669);
			match(INT);
			setState(670);
			match(INT);
			setState(671);
			match(NEWLINE);
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

	public static class SetlevelContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public SetlevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setlevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterSetlevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitSetlevel(this);
		}
	}

	public final SetlevelContext setlevel() throws RecognitionException {
		SetlevelContext _localctx = new SetlevelContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_setlevel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			match(T__176);
			setState(674);
			match(INT);
			setState(675);
			match(NEWLINE);
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

	public static class SetloginpointContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public SetloginpointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setloginpoint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterSetloginpoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitSetloginpoint(this);
		}
	}

	public final SetloginpointContext setloginpoint() throws RecognitionException {
		SetloginpointContext _localctx = new SetloginpointContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_setloginpoint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			match(T__177);
			setState(678);
			match(INT);
			setState(679);
			match(NEWLINE);
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

	public static class SetlpContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public SetlpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setlp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterSetlp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitSetlp(this);
		}
	}

	public final SetlpContext setlp() throws RecognitionException {
		SetlpContext _localctx = new SetlpContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_setlp);
		try {
			setState(685);
			switch (_input.LA(1)) {
			case T__178:
				enterOuterAlt(_localctx, 1);
				{
				setState(681);
				match(T__178);
				}
				break;
			case T__179:
				enterOuterAlt(_localctx, 2);
				{
				setState(682);
				match(T__179);
				setState(683);
				match(INT);
				setState(684);
				match(NEWLINE);
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

	public static class SetobjectContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public SetobjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setobject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterSetobject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitSetobject(this);
		}
	}

	public final SetobjectContext setobject() throws RecognitionException {
		SetobjectContext _localctx = new SetobjectContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_setobject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(T__180);
			setState(688);
			match(INT);
			setState(689);
			match(INT);
			setState(690);
			match(INT);
			setState(691);
			match(INT);
			setState(692);
			match(INT);
			setState(693);
			match(NEWLINE);
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

	public static class SetvisitorContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public SetvisitorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setvisitor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterSetvisitor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitSetvisitor(this);
		}
	}

	public final SetvisitorContext setvisitor() throws RecognitionException {
		SetvisitorContext _localctx = new SetvisitorContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_setvisitor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			match(T__181);
			setState(696);
			match(INT);
			setState(697);
			match(NEWLINE);
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

	public static class ShapenextContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public ShapenextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shapenext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterShapenext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitShapenext(this);
		}
	}

	public final ShapenextContext shapenext() throws RecognitionException {
		ShapenextContext _localctx = new ShapenextContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_shapenext);
		try {
			setState(703);
			switch (_input.LA(1)) {
			case T__182:
				enterOuterAlt(_localctx, 1);
				{
				setState(699);
				match(T__182);
				}
				break;
			case T__183:
				enterOuterAlt(_localctx, 2);
				{
				setState(700);
				match(T__183);
				setState(701);
				match(INT);
				setState(702);
				match(NEWLINE);
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

	public static class ShipchardownContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public ShipchardownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shipchardown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterShipchardown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitShipchardown(this);
		}
	}

	public final ShipchardownContext shipchardown() throws RecognitionException {
		ShipchardownContext _localctx = new ShipchardownContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_shipchardown);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			match(T__184);
			setState(706);
			match(INT);
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

	public static class ShipchartakeContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GMSVParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GMSVParser.INT, i);
		}
		public ShipchartakeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shipchartake; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterShipchartake(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitShipchartake(this);
		}
	}

	public final ShipchartakeContext shipchartake() throws RecognitionException {
		ShipchartakeContext _localctx = new ShipchartakeContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_shipchartake);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			match(T__185);
			setState(709);
			match(INT);
			setState(710);
			match(INT);
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

	public static class ShipgetstoptimeContext extends ParserRuleContext {
		public ShipgetstoptimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shipgetstoptime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterShipgetstoptime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitShipgetstoptime(this);
		}
	}

	public final ShipgetstoptimeContext shipgetstoptime() throws RecognitionException {
		ShipgetstoptimeContext _localctx = new ShipgetstoptimeContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_shipgetstoptime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			match(T__186);
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

	public static class SkilllevelContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public SkilllevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skilllevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterSkilllevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitSkilllevel(this);
		}
	}

	public final SkilllevelContext skilllevel() throws RecognitionException {
		SkilllevelContext _localctx = new SkilllevelContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_skilllevel);
		try {
			setState(718);
			switch (_input.LA(1)) {
			case T__187:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				match(T__187);
				}
				break;
			case T__188:
				enterOuterAlt(_localctx, 2);
				{
				setState(715);
				match(T__188);
				}
				break;
			case T__189:
				enterOuterAlt(_localctx, 3);
				{
				setState(716);
				match(T__189);
				setState(717);
				match(INT);
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

	public static class StackitemspaceContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public StackitemspaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackitemspace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterStackitemspace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitStackitemspace(this);
		}
	}

	public final StackitemspaceContext stackitemspace() throws RecognitionException {
		StackitemspaceContext _localctx = new StackitemspaceContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_stackitemspace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(T__190);
			setState(721);
			match(NEWLINE);
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

	public static class StrcmpchatContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GMSVParser.STRING, 0); }
		public StrcmpchatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strcmpchat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterStrcmpchat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitStrcmpchat(this);
		}
	}

	public final StrcmpchatContext strcmpchat() throws RecognitionException {
		StrcmpchatContext _localctx = new StrcmpchatContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_strcmpchat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			_la = _input.LA(1);
			if ( !(_la==T__191 || _la==T__192) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(724);
			_la = _input.LA(1);
			if ( !(_la==ASSIGNEQUAL || _la==EQUAL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(725);
			match(STRING);
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

	public static class StrstrchatContext extends ParserRuleContext {
		public StrstrchatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strstrchat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterStrstrchat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitStrstrchat(this);
		}
	}

	public final StrstrchatContext strstrchat() throws RecognitionException {
		StrstrchatContext _localctx = new StrstrchatContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_strstrchat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			match(T__193);
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

	public static class SystemmessageContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GMSVParser.STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public SystemmessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemmessage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterSystemmessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitSystemmessage(this);
		}
	}

	public final SystemmessageContext systemmessage() throws RecognitionException {
		SystemmessageContext _localctx = new SystemmessageContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_systemmessage);
		try {
			setState(733);
			switch (_input.LA(1)) {
			case T__194:
				enterOuterAlt(_localctx, 1);
				{
				setState(729);
				match(T__194);
				}
				break;
			case T__195:
				enterOuterAlt(_localctx, 2);
				{
				setState(730);
				match(T__195);
				setState(731);
				match(STRING);
				setState(732);
				match(NEWLINE);
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

	public static class TrueimageContext extends ParserRuleContext {
		public TrueimageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueimage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterTrueimage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitTrueimage(this);
		}
	}

	public final TrueimageContext trueimage() throws RecognitionException {
		TrueimageContext _localctx = new TrueimageContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_trueimage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(T__196);
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

	public static class WarpContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(GMSVParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(GMSVParser.STRING, i);
		}
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public WarpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_warp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterWarp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitWarp(this);
		}
	}

	public final WarpContext warp() throws RecognitionException {
		WarpContext _localctx = new WarpContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_warp);
		try {
			setState(743);
			switch (_input.LA(1)) {
			case T__197:
				enterOuterAlt(_localctx, 1);
				{
				setState(737);
				match(T__197);
				}
				break;
			case T__198:
				enterOuterAlt(_localctx, 2);
				{
				setState(738);
				match(T__198);
				setState(739);
				match(STRING);
				setState(740);
				match(STRING);
				setState(741);
				match(STRING);
				setState(742);
				match(NEWLINE);
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

	public static class Window_noContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public Window_noContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_no; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterWindow_no(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitWindow_no(this);
		}
	}

	public final Window_noContext window_no() throws RecognitionException {
		Window_noContext _localctx = new Window_noContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_window_no);
		try {
			setState(750);
			switch (_input.LA(1)) {
			case T__199:
				enterOuterAlt(_localctx, 1);
				{
				setState(745);
				match(T__199);
				}
				break;
			case T__200:
				enterOuterAlt(_localctx, 2);
				{
				setState(746);
				match(T__200);
				}
				break;
			case T__201:
				enterOuterAlt(_localctx, 3);
				{
				setState(747);
				match(T__201);
				}
				break;
			case T__202:
				enterOuterAlt(_localctx, 4);
				{
				setState(748);
				match(T__202);
				setState(749);
				match(NEWLINE);
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

	public static class Window_okContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public Window_okContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_ok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterWindow_ok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitWindow_ok(this);
		}
	}

	public final Window_okContext window_ok() throws RecognitionException {
		Window_okContext _localctx = new Window_okContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_window_ok);
		try {
			setState(759);
			switch (_input.LA(1)) {
			case T__203:
				enterOuterAlt(_localctx, 1);
				{
				setState(752);
				match(T__203);
				}
				break;
			case T__204:
				enterOuterAlt(_localctx, 2);
				{
				setState(753);
				match(T__204);
				}
				break;
			case T__205:
				enterOuterAlt(_localctx, 3);
				{
				setState(754);
				match(T__205);
				}
				break;
			case T__206:
				enterOuterAlt(_localctx, 4);
				{
				setState(755);
				match(T__206);
				}
				break;
			case T__207:
				enterOuterAlt(_localctx, 5);
				{
				setState(756);
				match(T__207);
				}
				break;
			case T__208:
				enterOuterAlt(_localctx, 6);
				{
				setState(757);
				match(T__208);
				setState(758);
				match(NEWLINE);
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

	public static class Window_yesContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(GMSVParser.BOOLEAN, 0); }
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public Window_yesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_yes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterWindow_yes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitWindow_yes(this);
		}
	}

	public final Window_yesContext window_yes() throws RecognitionException {
		Window_yesContext _localctx = new Window_yesContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_window_yes);
		try {
			setState(768);
			switch (_input.LA(1)) {
			case T__209:
				enterOuterAlt(_localctx, 1);
				{
				setState(761);
				match(T__209);
				}
				break;
			case T__210:
				enterOuterAlt(_localctx, 2);
				{
				setState(762);
				match(T__210);
				}
				break;
			case T__211:
				enterOuterAlt(_localctx, 3);
				{
				setState(763);
				match(T__211);
				}
				break;
			case T__212:
				enterOuterAlt(_localctx, 4);
				{
				setState(764);
				match(T__212);
				}
				break;
			case T__213:
				enterOuterAlt(_localctx, 5);
				{
				setState(765);
				match(T__213);
				setState(766);
				match(BOOLEAN);
				setState(767);
				match(NEWLINE);
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

	public static class XposContext extends ParserRuleContext {
		public XposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xpos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterXpos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitXpos(this);
		}
	}

	public final XposContext xpos() throws RecognitionException {
		XposContext _localctx = new XposContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_xpos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			_la = _input.LA(1);
			if ( !(((((_la - 215)) & ~0x3f) == 0 && ((1L << (_la - 215)) & ((1L << (T__214 - 215)) | (1L << (T__215 - 215)) | (1L << (T__216 - 215)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class YesContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(GMSVParser.BOOLEAN, 0); }
		public TerminalNode NEWLINE() { return getToken(GMSVParser.NEWLINE, 0); }
		public YesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterYes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitYes(this);
		}
	}

	public final YesContext yes() throws RecognitionException {
		YesContext _localctx = new YesContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_yes);
		try {
			setState(776);
			switch (_input.LA(1)) {
			case T__217:
				enterOuterAlt(_localctx, 1);
				{
				setState(772);
				match(T__217);
				}
				break;
			case T__218:
				enterOuterAlt(_localctx, 2);
				{
				setState(773);
				match(T__218);
				setState(774);
				match(BOOLEAN);
				setState(775);
				match(NEWLINE);
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

	public static class MutilCOMMONContext extends ParserRuleContext {
		public AddfeversecContext addfeversec() {
			return getRuleContext(AddfeversecContext.class,0);
		}
		public AddgoldContext addgold() {
			return getRuleContext(AddgoldContext.class,0);
		}
		public AddgoldlevelContext addgoldlevel() {
			return getRuleContext(AddgoldlevelContext.class,0);
		}
		public AddluckContext addluck() {
			return getRuleContext(AddluckContext.class,0);
		}
		public AddskillslotContext addskillslot() {
			return getRuleContext(AddskillslotContext.class,0);
		}
		public AddstampcountContext addstampcount() {
			return getRuleContext(AddstampcountContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ChangepalContext changepal() {
			return getRuleContext(ChangepalContext.class,0);
		}
		public ChecktitleContext checktitle() {
			return getRuleContext(ChecktitleContext.class,0);
		}
		public EncountContext encount() {
			return getRuleContext(EncountContext.class,0);
		}
		public EndeventContext endevent() {
			return getRuleContext(EndeventContext.class,0);
		}
		public EndwindowContext endwindow() {
			return getRuleContext(EndwindowContext.class,0);
		}
		public GaendwindowContext gaendwindow() {
			return getRuleContext(GaendwindowContext.class,0);
		}
		public GawindowContext gawindow() {
			return getRuleContext(GawindowContext.class,0);
		}
		public GiveitemContext giveitem() {
			return getRuleContext(GiveitemContext.class,0);
		}
		public Giveleak0itemContext giveleak0item() {
			return getRuleContext(Giveleak0itemContext.class,0);
		}
		public Giveleak1itemContext giveleak1item() {
			return getRuleContext(Giveleak1itemContext.class,0);
		}
		public GivepetContext givepet() {
			return getRuleContext(GivepetContext.class,0);
		}
		public GiverecipeContext giverecipe() {
			return getRuleContext(GiverecipeContext.class,0);
		}
		public GivestackitemContext givestackitem() {
			return getRuleContext(GivestackitemContext.class,0);
		}
		public GlobalflagContext globalflag() {
			return getRuleContext(GlobalflagContext.class,0);
		}
		public GlobaltimerContext globaltimer() {
			return getRuleContext(GlobaltimerContext.class,0);
		}
		public GotobContext gotob() {
			return getRuleContext(GotobContext.class,0);
		}
		public GotofContext gotof() {
			return getRuleContext(GotofContext.class,0);
		}
		public KilldrugdishContext killdrugdish() {
			return getRuleContext(KilldrugdishContext.class,0);
		}
		public KillitemContext killitem() {
			return getRuleContext(KillitemContext.class,0);
		}
		public KillitemallContext killitemall() {
			return getRuleContext(KillitemallContext.class,0);
		}
		public Killleak0itemContext killleak0item() {
			return getRuleContext(Killleak0itemContext.class,0);
		}
		public Killleak1itemContext killleak1item() {
			return getRuleContext(Killleak1itemContext.class,0);
		}
		public KillpetContext killpet() {
			return getRuleContext(KillpetContext.class,0);
		}
		public KillpethContext killpeth() {
			return getRuleContext(KillpethContext.class,0);
		}
		public KillpetlContext killpetl() {
			return getRuleContext(KillpetlContext.class,0);
		}
		public LeavegroupContext leavegroup() {
			return getRuleContext(LeavegroupContext.class,0);
		}
		public LocalcountContext localcount() {
			return getRuleContext(LocalcountContext.class,0);
		}
		public LocalflagContext localflag() {
			return getRuleContext(LocalflagContext.class,0);
		}
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
		public NextContext next() {
			return getRuleContext(NextContext.class,0);
		}
		public NoContext no() {
			return getRuleContext(NoContext.class,0);
		}
		public OkContext ok() {
			return getRuleContext(OkContext.class,0);
		}
		public PlayseContext playse() {
			return getRuleContext(PlayseContext.class,0);
		}
		public SetactionContext setaction() {
			return getRuleContext(SetactionContext.class,0);
		}
		public SetcharmContext setcharm() {
			return getRuleContext(SetcharmContext.class,0);
		}
		public SetdurContext setdur() {
			return getRuleContext(SetdurContext.class,0);
		}
		public SetfeverflgContext setfeverflg() {
			return getRuleContext(SetfeverflgContext.class,0);
		}
		public SethouseContext sethouse() {
			return getRuleContext(SethouseContext.class,0);
		}
		public SethouselimitContext sethouselimit() {
			return getRuleContext(SethouselimitContext.class,0);
		}
		public SetlevelContext setlevel() {
			return getRuleContext(SetlevelContext.class,0);
		}
		public SetloginpointContext setloginpoint() {
			return getRuleContext(SetloginpointContext.class,0);
		}
		public SetlpContext setlp() {
			return getRuleContext(SetlpContext.class,0);
		}
		public SetobjectContext setobject() {
			return getRuleContext(SetobjectContext.class,0);
		}
		public SetvisitorContext setvisitor() {
			return getRuleContext(SetvisitorContext.class,0);
		}
		public ShapenextContext shapenext() {
			return getRuleContext(ShapenextContext.class,0);
		}
		public StackitemspaceContext stackitemspace() {
			return getRuleContext(StackitemspaceContext.class,0);
		}
		public SystemmessageContext systemmessage() {
			return getRuleContext(SystemmessageContext.class,0);
		}
		public WarpContext warp() {
			return getRuleContext(WarpContext.class,0);
		}
		public Window_noContext window_no() {
			return getRuleContext(Window_noContext.class,0);
		}
		public Window_okContext window_ok() {
			return getRuleContext(Window_okContext.class,0);
		}
		public Window_yesContext window_yes() {
			return getRuleContext(Window_yesContext.class,0);
		}
		public YesContext yes() {
			return getRuleContext(YesContext.class,0);
		}
		public MutilCOMMONContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mutilCOMMON; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterMutilCOMMON(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitMutilCOMMON(this);
		}
	}

	public final MutilCOMMONContext mutilCOMMON() throws RecognitionException {
		MutilCOMMONContext _localctx = new MutilCOMMONContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_mutilCOMMON);
		try {
			setState(837);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(778);
				addfeversec();
				}
				break;
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(779);
				addgold();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(780);
				addgoldlevel();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(781);
				addluck();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(782);
				addskillslot();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				setState(783);
				addstampcount();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 7);
				{
				setState(784);
				block();
				}
				break;
			case T__16:
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 8);
				{
				setState(785);
				changepal();
				}
				break;
			case T__23:
			case T__24:
			case T__25:
				enterOuterAlt(_localctx, 9);
				{
				setState(786);
				checktitle();
				}
				break;
			case T__26:
			case T__27:
				enterOuterAlt(_localctx, 10);
				{
				setState(787);
				encount();
				}
				break;
			case T__28:
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 11);
				{
				setState(788);
				endevent();
				}
				break;
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
				enterOuterAlt(_localctx, 12);
				{
				setState(789);
				endwindow();
				}
				break;
			case T__42:
			case T__43:
			case T__44:
				enterOuterAlt(_localctx, 13);
				{
				setState(790);
				gaendwindow();
				}
				break;
			case T__45:
			case T__46:
				enterOuterAlt(_localctx, 14);
				{
				setState(791);
				gawindow();
				}
				break;
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
				enterOuterAlt(_localctx, 15);
				{
				setState(792);
				giveitem();
				}
				break;
			case T__53:
			case T__54:
			case T__55:
				enterOuterAlt(_localctx, 16);
				{
				setState(793);
				giveleak0item();
				}
				break;
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
				enterOuterAlt(_localctx, 17);
				{
				setState(794);
				giveleak1item();
				}
				break;
			case T__61:
			case T__62:
			case T__63:
				enterOuterAlt(_localctx, 18);
				{
				setState(795);
				givepet();
				}
				break;
			case T__64:
			case T__65:
			case T__66:
				enterOuterAlt(_localctx, 19);
				{
				setState(796);
				giverecipe();
				}
				break;
			case T__67:
				enterOuterAlt(_localctx, 20);
				{
				setState(797);
				givestackitem();
				}
				break;
			case T__68:
				enterOuterAlt(_localctx, 21);
				{
				setState(798);
				globalflag();
				}
				break;
			case T__69:
				enterOuterAlt(_localctx, 22);
				{
				setState(799);
				globaltimer();
				}
				break;
			case T__73:
			case T__74:
				enterOuterAlt(_localctx, 23);
				{
				setState(800);
				gotob();
				}
				break;
			case T__75:
			case T__76:
				enterOuterAlt(_localctx, 24);
				{
				setState(801);
				gotof();
				}
				break;
			case T__103:
				enterOuterAlt(_localctx, 25);
				{
				setState(802);
				killdrugdish();
				}
				break;
			case T__104:
			case T__105:
			case T__106:
			case T__107:
				enterOuterAlt(_localctx, 26);
				{
				setState(803);
				killitem();
				}
				break;
			case T__108:
			case T__109:
			case T__110:
			case T__111:
			case T__112:
			case T__113:
			case T__114:
				enterOuterAlt(_localctx, 27);
				{
				setState(804);
				killitemall();
				}
				break;
			case T__115:
			case T__116:
			case T__117:
				enterOuterAlt(_localctx, 28);
				{
				setState(805);
				killleak0item();
				}
				break;
			case T__118:
			case T__119:
				enterOuterAlt(_localctx, 29);
				{
				setState(806);
				killleak1item();
				}
				break;
			case T__120:
				enterOuterAlt(_localctx, 30);
				{
				setState(807);
				killpet();
				}
				break;
			case T__121:
			case T__122:
			case T__123:
				enterOuterAlt(_localctx, 31);
				{
				setState(808);
				killpeth();
				}
				break;
			case T__124:
			case T__125:
			case T__126:
				enterOuterAlt(_localctx, 32);
				{
				setState(809);
				killpetl();
				}
				break;
			case T__127:
			case T__128:
			case T__129:
				enterOuterAlt(_localctx, 33);
				{
				setState(810);
				leavegroup();
				}
				break;
			case T__132:
			case T__133:
				enterOuterAlt(_localctx, 34);
				{
				setState(811);
				localcount();
				}
				break;
			case T__134:
			case T__135:
				enterOuterAlt(_localctx, 35);
				{
				setState(812);
				localflag();
				}
				break;
			case T__139:
			case T__140:
				enterOuterAlt(_localctx, 36);
				{
				setState(813);
				message();
				}
				break;
			case T__142:
			case T__143:
				enterOuterAlt(_localctx, 37);
				{
				setState(814);
				next();
				}
				break;
			case T__144:
			case T__145:
				enterOuterAlt(_localctx, 38);
				{
				setState(815);
				no();
				}
				break;
			case T__152:
				enterOuterAlt(_localctx, 39);
				{
				setState(816);
				ok();
				}
				break;
			case T__162:
				enterOuterAlt(_localctx, 40);
				{
				setState(817);
				playse();
				}
				break;
			case T__165:
			case T__166:
			case T__167:
				enterOuterAlt(_localctx, 41);
				{
				setState(818);
				setaction();
				}
				break;
			case T__168:
			case T__169:
				enterOuterAlt(_localctx, 42);
				{
				setState(819);
				setcharm();
				}
				break;
			case T__170:
			case T__171:
			case T__172:
				enterOuterAlt(_localctx, 43);
				{
				setState(820);
				setdur();
				}
				break;
			case T__173:
				enterOuterAlt(_localctx, 44);
				{
				setState(821);
				setfeverflg();
				}
				break;
			case T__174:
				enterOuterAlt(_localctx, 45);
				{
				setState(822);
				sethouse();
				}
				break;
			case T__175:
				enterOuterAlt(_localctx, 46);
				{
				setState(823);
				sethouselimit();
				}
				break;
			case T__176:
				enterOuterAlt(_localctx, 47);
				{
				setState(824);
				setlevel();
				}
				break;
			case T__177:
				enterOuterAlt(_localctx, 48);
				{
				setState(825);
				setloginpoint();
				}
				break;
			case T__178:
			case T__179:
				enterOuterAlt(_localctx, 49);
				{
				setState(826);
				setlp();
				}
				break;
			case T__180:
				enterOuterAlt(_localctx, 50);
				{
				setState(827);
				setobject();
				}
				break;
			case T__181:
				enterOuterAlt(_localctx, 51);
				{
				setState(828);
				setvisitor();
				}
				break;
			case T__182:
			case T__183:
				enterOuterAlt(_localctx, 52);
				{
				setState(829);
				shapenext();
				}
				break;
			case T__190:
				enterOuterAlt(_localctx, 53);
				{
				setState(830);
				stackitemspace();
				}
				break;
			case T__194:
			case T__195:
				enterOuterAlt(_localctx, 54);
				{
				setState(831);
				systemmessage();
				}
				break;
			case T__197:
			case T__198:
				enterOuterAlt(_localctx, 55);
				{
				setState(832);
				warp();
				}
				break;
			case T__199:
			case T__200:
			case T__201:
			case T__202:
				enterOuterAlt(_localctx, 56);
				{
				setState(833);
				window_no();
				}
				break;
			case T__203:
			case T__204:
			case T__205:
			case T__206:
			case T__207:
			case T__208:
				enterOuterAlt(_localctx, 57);
				{
				setState(834);
				window_ok();
				}
				break;
			case T__209:
			case T__210:
			case T__211:
			case T__212:
			case T__213:
				enterOuterAlt(_localctx, 58);
				{
				setState(835);
				window_yes();
				}
				break;
			case T__217:
			case T__218:
				enterOuterAlt(_localctx, 59);
				{
				setState(836);
				yes();
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

	public static class MutilINTContext extends ParserRuleContext {
		public BimageContext bimage() {
			return getRuleContext(BimageContext.class,0);
		}
		public BbimageContext bbimage() {
			return getRuleContext(BbimageContext.class,0);
		}
		public CheckitemcategoryContext checkitemcategory() {
			return getRuleContext(CheckitemcategoryContext.class,0);
		}
		public CheckrealtimeContext checkrealtime() {
			return getRuleContext(CheckrealtimeContext.class,0);
		}
		public CheckskillslotContext checkskillslot() {
			return getRuleContext(CheckskillslotContext.class,0);
		}
		public FameContext fame() {
			return getRuleContext(FameContext.class,0);
		}
		public FloorContext floor() {
			return getRuleContext(FloorContext.class,0);
		}
		public FpContext fp() {
			return getRuleContext(FpContext.class,0);
		}
		public GoldContext gold() {
			return getRuleContext(GoldContext.class,0);
		}
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public ImagetypeContext imagetype() {
			return getRuleContext(ImagetypeContext.class,0);
		}
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public ItemcreatetimeContext itemcreatetime() {
			return getRuleContext(ItemcreatetimeContext.class,0);
		}
		public ItemdurContext itemdur() {
			return getRuleContext(ItemdurContext.class,0);
		}
		public ItemdurperContext itemdurper() {
			return getRuleContext(ItemdurperContext.class,0);
		}
		public ItemspaceContext itemspace() {
			return getRuleContext(ItemspaceContext.class,0);
		}
		public JobContext job() {
			return getRuleContext(JobContext.class,0);
		}
		public JobancestryContext jobancestry() {
			return getRuleContext(JobancestryContext.class,0);
		}
		public JobrankContext jobrank() {
			return getRuleContext(JobrankContext.class,0);
		}
		public LevelContext level() {
			return getRuleContext(LevelContext.class,0);
		}
		public LpContext lp() {
			return getRuleContext(LpContext.class,0);
		}
		public MaxfpContext maxfp() {
			return getRuleContext(MaxfpContext.class,0);
		}
		public MaxlpContext maxlp() {
			return getRuleContext(MaxlpContext.class,0);
		}
		public MetamocountContext metamocount() {
			return getRuleContext(MetamocountContext.class,0);
		}
		public NoweventContext nowevent() {
			return getRuleContext(NoweventContext.class,0);
		}
		public NowtimeContext nowtime() {
			return getRuleContext(NowtimeContext.class,0);
		}
		public PequipitemContext pequipitem() {
			return getRuleContext(PequipitemContext.class,0);
		}
		public PetlevelContext petlevel() {
			return getRuleContext(PetlevelContext.class,0);
		}
		public PetspaceContext petspace() {
			return getRuleContext(PetspaceContext.class,0);
		}
		public PhitemContext phitem() {
			return getRuleContext(PhitemContext.class,0);
		}
		public RandomContext random() {
			return getRuleContext(RandomContext.class,0);
		}
		public ShipchardownContext shipchardown() {
			return getRuleContext(ShipchardownContext.class,0);
		}
		public ShipchartakeContext shipchartake() {
			return getRuleContext(ShipchartakeContext.class,0);
		}
		public ShipgetstoptimeContext shipgetstoptime() {
			return getRuleContext(ShipgetstoptimeContext.class,0);
		}
		public SkilllevelContext skilllevel() {
			return getRuleContext(SkilllevelContext.class,0);
		}
		public TrueimageContext trueimage() {
			return getRuleContext(TrueimageContext.class,0);
		}
		public XposContext xpos() {
			return getRuleContext(XposContext.class,0);
		}
		public MutilINTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mutilINT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterMutilINT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitMutilINT(this);
		}
	}

	public final MutilINTContext mutilINT() throws RecognitionException {
		MutilINTContext _localctx = new MutilINTContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_mutilINT);
		try {
			setState(876);
			switch (_input.LA(1)) {
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(839);
				bimage();
				}
				break;
			case T__12:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(840);
				bbimage();
				}
				break;
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(841);
				checkitemcategory();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(842);
				checkrealtime();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 5);
				{
				setState(843);
				checkskillslot();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 6);
				{
				setState(844);
				fame();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 7);
				{
				setState(845);
				floor();
				}
				break;
			case T__40:
			case T__41:
				enterOuterAlt(_localctx, 8);
				{
				setState(846);
				fp();
				}
				break;
			case T__70:
			case T__71:
			case T__72:
				enterOuterAlt(_localctx, 9);
				{
				setState(847);
				gold();
				}
				break;
			case T__77:
			case T__78:
				enterOuterAlt(_localctx, 10);
				{
				setState(848);
				group();
				}
				break;
			case T__86:
				enterOuterAlt(_localctx, 11);
				{
				setState(849);
				imagetype();
				}
				break;
			case T__87:
				enterOuterAlt(_localctx, 12);
				{
				setState(850);
				item();
				}
				break;
			case T__88:
			case T__89:
			case T__90:
				enterOuterAlt(_localctx, 13);
				{
				setState(851);
				itemcreatetime();
				}
				break;
			case T__91:
			case T__92:
				enterOuterAlt(_localctx, 14);
				{
				setState(852);
				itemdur();
				}
				break;
			case T__93:
				enterOuterAlt(_localctx, 15);
				{
				setState(853);
				itemdurper();
				}
				break;
			case T__94:
			case T__95:
			case T__96:
				enterOuterAlt(_localctx, 16);
				{
				setState(854);
				itemspace();
				}
				break;
			case T__97:
			case T__98:
				enterOuterAlt(_localctx, 17);
				{
				setState(855);
				job();
				}
				break;
			case T__99:
			case T__100:
				enterOuterAlt(_localctx, 18);
				{
				setState(856);
				jobancestry();
				}
				break;
			case T__101:
			case T__102:
				enterOuterAlt(_localctx, 19);
				{
				setState(857);
				jobrank();
				}
				break;
			case T__130:
			case T__131:
				enterOuterAlt(_localctx, 20);
				{
				setState(858);
				level();
				}
				break;
			case T__136:
				enterOuterAlt(_localctx, 21);
				{
				setState(859);
				lp();
				}
				break;
			case T__137:
				enterOuterAlt(_localctx, 22);
				{
				setState(860);
				maxfp();
				}
				break;
			case T__138:
				enterOuterAlt(_localctx, 23);
				{
				setState(861);
				maxlp();
				}
				break;
			case T__141:
				enterOuterAlt(_localctx, 24);
				{
				setState(862);
				metamocount();
				}
				break;
			case T__146:
			case T__147:
			case T__148:
				enterOuterAlt(_localctx, 25);
				{
				setState(863);
				nowevent();
				}
				break;
			case T__149:
			case T__150:
			case T__151:
				enterOuterAlt(_localctx, 26);
				{
				setState(864);
				nowtime();
				}
				break;
			case T__153:
				enterOuterAlt(_localctx, 27);
				{
				setState(865);
				pequipitem();
				}
				break;
			case T__154:
			case T__155:
			case T__156:
				enterOuterAlt(_localctx, 28);
				{
				setState(866);
				petlevel();
				}
				break;
			case T__157:
			case T__158:
			case T__159:
			case T__160:
				enterOuterAlt(_localctx, 29);
				{
				setState(867);
				petspace();
				}
				break;
			case T__161:
				enterOuterAlt(_localctx, 30);
				{
				setState(868);
				phitem();
				}
				break;
			case T__163:
			case T__164:
				enterOuterAlt(_localctx, 31);
				{
				setState(869);
				random();
				}
				break;
			case T__184:
				enterOuterAlt(_localctx, 32);
				{
				setState(870);
				shipchardown();
				}
				break;
			case T__185:
				enterOuterAlt(_localctx, 33);
				{
				setState(871);
				shipchartake();
				}
				break;
			case T__186:
				enterOuterAlt(_localctx, 34);
				{
				setState(872);
				shipgetstoptime();
				}
				break;
			case T__187:
			case T__188:
			case T__189:
				enterOuterAlt(_localctx, 35);
				{
				setState(873);
				skilllevel();
				}
				break;
			case T__196:
				enterOuterAlt(_localctx, 36);
				{
				setState(874);
				trueimage();
				}
				break;
			case T__214:
			case T__215:
			case T__216:
				enterOuterAlt(_localctx, 37);
				{
				setState(875);
				xpos();
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

	public static class MutilBOOLEANContext extends ParserRuleContext {
		public EquipitemContext equipitem() {
			return getRuleContext(EquipitemContext.class,0);
		}
		public HaveitemContext haveitem() {
			return getRuleContext(HaveitemContext.class,0);
		}
		public Haveleak0itemContext haveleak0item() {
			return getRuleContext(Haveleak0itemContext.class,0);
		}
		public Haveleak1itemContext haveleak1item() {
			return getRuleContext(Haveleak1itemContext.class,0);
		}
		public HavetitleContext havetitle() {
			return getRuleContext(HavetitleContext.class,0);
		}
		public HouseidContext houseid() {
			return getRuleContext(HouseidContext.class,0);
		}
		public StrcmpchatContext strcmpchat() {
			return getRuleContext(StrcmpchatContext.class,0);
		}
		public StrstrchatContext strstrchat() {
			return getRuleContext(StrstrchatContext.class,0);
		}
		public MutilBOOLEANContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mutilBOOLEAN; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterMutilBOOLEAN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitMutilBOOLEAN(this);
		}
	}

	public final MutilBOOLEANContext mutilBOOLEAN() throws RecognitionException {
		MutilBOOLEANContext _localctx = new MutilBOOLEANContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_mutilBOOLEAN);
		try {
			setState(886);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(878);
				equipitem();
				}
				break;
			case T__79:
				enterOuterAlt(_localctx, 2);
				{
				setState(879);
				haveitem();
				}
				break;
			case T__80:
				enterOuterAlt(_localctx, 3);
				{
				setState(880);
				haveleak0item();
				}
				break;
			case T__81:
				enterOuterAlt(_localctx, 4);
				{
				setState(881);
				haveleak1item();
				}
				break;
			case T__82:
			case T__83:
			case T__84:
				enterOuterAlt(_localctx, 5);
				{
				setState(882);
				havetitle();
				}
				break;
			case T__85:
				enterOuterAlt(_localctx, 6);
				{
				setState(883);
				houseid();
				}
				break;
			case T__191:
			case T__192:
				enterOuterAlt(_localctx, 7);
				{
				setState(884);
				strcmpchat();
				}
				break;
			case T__193:
				enterOuterAlt(_localctx, 8);
				{
				setState(885);
				strstrchat();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return booleanRule_sempred((BooleanRuleContext)_localctx, predIndex);
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean booleanRule_sempred(BooleanRuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0104\u037b\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3\u00f0\n\3\3\3\3\3\3\3\7\3\u00f5\n\3\f\3\16\3\u00f8"+
		"\13\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0106\n\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\7\5\u010e\n\5\f\5\16\5\u0111\13\5\3\6\3\6\3\6\3"+
		"\7\7\7\u0117\n\7\f\7\16\7\u011a\13\7\3\b\3\b\3\b\3\b\3\b\5\b\u0121\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u0128\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0148\n\21\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u0155\n\25\3\26\3\26\3\26\3\26"+
		"\5\26\u015b\n\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0163\n\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u016e\n\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u017e\n\35"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u0185\n\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u0190\n\37\3 \3 \3 \3 \3 \5 \u0197\n \3!\3!\3!\3"+
		"!\3!\3!\3!\5!\u01a0\n!\3\"\3\"\3\"\3\"\3\"\5\"\u01a7\n\"\3#\3#\3#\3#\3"+
		"#\5#\u01ae\n#\3$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3(\3(\3("+
		"\5(\u01c2\n(\3)\3)\3)\5)\u01c7\n)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3."+
		"\3.\3.\3.\5.\u01d8\n.\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\62\5\62\u01e6\n\62\3\63\3\63\3\63\5\63\u01eb\n\63\3\64\3\64\3\64\3"+
		"\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\39\3:\3:\3:\3:\3:\3:\5:\u0201"+
		"\n:\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u020c\n;\3<\3<\3<\3<\3<\3<\5<\u0214"+
		"\n<\3=\3=\3=\3=\5=\u021a\n=\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\5?\u0226\n?"+
		"\3@\3@\3@\3@\3@\3@\5@\u022e\n@\3A\3A\3A\3A\5A\u0234\nA\3B\3B\3C\3C\3C"+
		"\5C\u023b\nC\3D\3D\3D\5D\u0240\nD\3E\3E\3F\3F\3G\3G\3H\3H\3H\3H\5H\u024c"+
		"\nH\3I\3I\3J\3J\3J\5J\u0253\nJ\3K\3K\3K\5K\u0258\nK\3L\3L\3L\3L\5L\u025e"+
		"\nL\3M\3M\3N\3N\3N\3O\3O\3O\3O\3P\3P\3P\3P\5P\u026d\nP\3Q\3Q\3R\3R\3R"+
		"\3R\3S\3S\3S\3S\3S\3S\3T\3T\3T\3T\5T\u027f\nT\3U\3U\3U\3U\3U\5U\u0286"+
		"\nU\3V\3V\3V\3V\5V\u028c\nV\3W\3W\3W\3W\3W\3W\5W\u0294\nW\3X\3X\3X\3X"+
		"\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3]\3]\3]\3"+
		"]\5]\u02b0\n]\3^\3^\3^\3^\3^\3^\3^\3^\3_\3_\3_\3_\3`\3`\3`\3`\5`\u02c2"+
		"\n`\3a\3a\3a\3b\3b\3b\3b\3c\3c\3d\3d\3d\3d\5d\u02d1\nd\3e\3e\3e\3f\3f"+
		"\3f\3f\3g\3g\3h\3h\3h\3h\5h\u02e0\nh\3i\3i\3j\3j\3j\3j\3j\3j\5j\u02ea"+
		"\nj\3k\3k\3k\3k\3k\5k\u02f1\nk\3l\3l\3l\3l\3l\3l\3l\5l\u02fa\nl\3m\3m"+
		"\3m\3m\3m\3m\3m\5m\u0303\nm\3n\3n\3o\3o\3o\3o\5o\u030b\no\3p\3p\3p\3p"+
		"\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p"+
		"\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p"+
		"\3p\3p\3p\3p\3p\3p\3p\3p\3p\5p\u0348\np\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\3q\3q\5q\u036f\nq\3r\3r\3r\3r\3r\3r\3r\3r\5r\u0379\nr\3r\2\4\4"+
		"\bs\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\2\26\3\2\u0103\u0104\4\2\u00ef"+
		"\u00f4\u0102\u0102\4\2\u00f5\u00f5\u00f8\u00f9\3\2\u00f6\u00f7\3\2\r\16"+
		"\3\2\17\21\3\2\26\27\3\2+,\3\2IK\3\2PQ\3\2ac\3\2de\3\2fg\3\2hi\3\2\u0085"+
		"\u0086\3\2\u0098\u009a\3\2\u00a0\u00a3\3\2\u00c2\u00c3\4\2\u00ee\u00ee"+
		"\u0102\u0102\3\2\u00d9\u00db\u03d5\2\u00e4\3\2\2\2\4\u00ef\3\2\2\2\6\u00f9"+
		"\3\2\2\2\b\u0105\3\2\2\2\n\u0112\3\2\2\2\f\u0118\3\2\2\2\16\u0120\3\2"+
		"\2\2\20\u0127\3\2\2\2\22\u0129\3\2\2\2\24\u012c\3\2\2\2\26\u0131\3\2\2"+
		"\2\30\u0134\3\2\2\2\32\u0139\3\2\2\2\34\u013b\3\2\2\2\36\u013d\3\2\2\2"+
		" \u0147\3\2\2\2\"\u0149\3\2\2\2$\u014b\3\2\2\2&\u014e\3\2\2\2(\u0154\3"+
		"\2\2\2*\u015a\3\2\2\2,\u0162\3\2\2\2.\u016d\3\2\2\2\60\u016f\3\2\2\2\62"+
		"\u0172\3\2\2\2\64\u0174\3\2\2\2\66\u0176\3\2\2\28\u017d\3\2\2\2:\u0184"+
		"\3\2\2\2<\u018f\3\2\2\2>\u0196\3\2\2\2@\u019f\3\2\2\2B\u01a6\3\2\2\2D"+
		"\u01ad\3\2\2\2F\u01af\3\2\2\2H\u01b4\3\2\2\2J\u01b7\3\2\2\2L\u01bc\3\2"+
		"\2\2N\u01c1\3\2\2\2P\u01c6\3\2\2\2R\u01c8\3\2\2\2T\u01ca\3\2\2\2V\u01cd"+
		"\3\2\2\2X\u01d0\3\2\2\2Z\u01d7\3\2\2\2\\\u01d9\3\2\2\2^\u01dc\3\2\2\2"+
		"`\u01de\3\2\2\2b\u01e5\3\2\2\2d\u01ea\3\2\2\2f\u01ec\3\2\2\2h\u01ef\3"+
		"\2\2\2j\u01f1\3\2\2\2l\u01f3\3\2\2\2n\u01f5\3\2\2\2p\u01f7\3\2\2\2r\u0200"+
		"\3\2\2\2t\u020b\3\2\2\2v\u0213\3\2\2\2x\u0219\3\2\2\2z\u021b\3\2\2\2|"+
		"\u0225\3\2\2\2~\u022d\3\2\2\2\u0080\u0233\3\2\2\2\u0082\u0235\3\2\2\2"+
		"\u0084\u023a\3\2\2\2\u0086\u023f\3\2\2\2\u0088\u0241\3\2\2\2\u008a\u0243"+
		"\3\2\2\2\u008c\u0245\3\2\2\2\u008e\u024b\3\2\2\2\u0090\u024d\3\2\2\2\u0092"+
		"\u0252\3\2\2\2\u0094\u0257\3\2\2\2\u0096\u025d\3\2\2\2\u0098\u025f\3\2"+
		"\2\2\u009a\u0261\3\2\2\2\u009c\u0264\3\2\2\2\u009e\u026c\3\2\2\2\u00a0"+
		"\u026e\3\2\2\2\u00a2\u0270\3\2\2\2\u00a4\u0274\3\2\2\2\u00a6\u027e\3\2"+
		"\2\2\u00a8\u0285\3\2\2\2\u00aa\u028b\3\2\2\2\u00ac\u0293\3\2\2\2\u00ae"+
		"\u0295\3\2\2\2\u00b0\u0299\3\2\2\2\u00b2\u029e\3\2\2\2\u00b4\u02a3\3\2"+
		"\2\2\u00b6\u02a7\3\2\2\2\u00b8\u02af\3\2\2\2\u00ba\u02b1\3\2\2\2\u00bc"+
		"\u02b9\3\2\2\2\u00be\u02c1\3\2\2\2\u00c0\u02c3\3\2\2\2\u00c2\u02c6\3\2"+
		"\2\2\u00c4\u02ca\3\2\2\2\u00c6\u02d0\3\2\2\2\u00c8\u02d2\3\2\2\2\u00ca"+
		"\u02d5\3\2\2\2\u00cc\u02d9\3\2\2\2\u00ce\u02df\3\2\2\2\u00d0\u02e1\3\2"+
		"\2\2\u00d2\u02e9\3\2\2\2\u00d4\u02f0\3\2\2\2\u00d6\u02f9\3\2\2\2\u00d8"+
		"\u0302\3\2\2\2\u00da\u0304\3\2\2\2\u00dc\u030a\3\2\2\2\u00de\u0347\3\2"+
		"\2\2\u00e0\u036e\3\2\2\2\u00e2\u0378\3\2\2\2\u00e4\u00e5\7\u00e1\2\2\u00e5"+
		"\u00e6\7\u00e2\2\2\u00e6\3\3\2\2\2\u00e7\u00e8\b\3\1\2\u00e8\u00f0\5\u00e2"+
		"r\2\u00e9\u00f0\5\6\4\2\u00ea\u00f0\7\u00de\2\2\u00eb\u00ec\7\u00e6\2"+
		"\2\u00ec\u00ed\5\4\3\2\u00ed\u00ee\7\u00e7\2\2\u00ee\u00f0\3\2\2\2\u00ef"+
		"\u00e7\3\2\2\2\u00ef\u00e9\3\2\2\2\u00ef\u00ea\3\2\2\2\u00ef\u00eb\3\2"+
		"\2\2\u00f0\u00f6\3\2\2\2\u00f1\u00f2\f\7\2\2\u00f2\u00f3\t\2\2\2\u00f3"+
		"\u00f5\5\4\3\b\u00f4\u00f1\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f6\u00f7\3\2\2\2\u00f7\5\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa"+
		"\5\b\5\2\u00fa\u00fb\t\3\2\2\u00fb\u00fc\5\b\5\2\u00fc\7\3\2\2\2\u00fd"+
		"\u00fe\b\5\1\2\u00fe\u0106\5\2\2\2\u00ff\u0106\7\u00e2\2\2\u0100\u0106"+
		"\5\u00e0q\2\u0101\u0102\7\u00e6\2\2\u0102\u0103\5\b\5\2\u0103\u0104\7"+
		"\u00e7\2\2\u0104\u0106\3\2\2\2\u0105\u00fd\3\2\2\2\u0105\u00ff\3\2\2\2"+
		"\u0105\u0100\3\2\2\2\u0105\u0101\3\2\2\2\u0106\u010f\3\2\2\2\u0107\u0108"+
		"\f\b\2\2\u0108\u0109\t\4\2\2\u0109\u010e\5\b\5\t\u010a\u010b\f\7\2\2\u010b"+
		"\u010c\t\5\2\2\u010c\u010e\5\b\5\b\u010d\u0107\3\2\2\2\u010d\u010a\3\2"+
		"\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\t\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\5\4\3\2\u0113\u0114\5\f\7\2"+
		"\u0114\13\3\2\2\2\u0115\u0117\5\u00dep\2\u0116\u0115\3\2\2\2\u0117\u011a"+
		"\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\r\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011b\u0121\7\3\2\2\u011c\u0121\7\4\2\2\u011d\u011e\7\5"+
		"\2\2\u011e\u011f\7\u00e0\2\2\u011f\u0121\7\u00df\2\2\u0120\u011b\3\2\2"+
		"\2\u0120\u011c\3\2\2\2\u0120\u011d\3\2\2\2\u0121\17\3\2\2\2\u0122\u0128"+
		"\7\6\2\2\u0123\u0128\7\7\2\2\u0124\u0125\7\b\2\2\u0125\u0126\7\u00e0\2"+
		"\2\u0126\u0128\7\u00df\2\2\u0127\u0122\3\2\2\2\u0127\u0123\3\2\2\2\u0127"+
		"\u0124\3\2\2\2\u0128\21\3\2\2\2\u0129\u012a\7\t\2\2\u012a\u012b\7\u00df"+
		"\2\2\u012b\23\3\2\2\2\u012c\u012d\7\n\2\2\u012d\u012e\7\u00e2\2\2\u012e"+
		"\u012f\7\u00e2\2\2\u012f\u0130\7\u00df\2\2\u0130\25\3\2\2\2\u0131\u0132"+
		"\7\13\2\2\u0132\u0133\7\u00df\2\2\u0133\27\3\2\2\2\u0134\u0135\7\f\2\2"+
		"\u0135\u0136\7\u00e2\2\2\u0136\u0137\7\u00e2\2\2\u0137\u0138\7\u00df\2"+
		"\2\u0138\31\3\2\2\2\u0139\u013a\t\6\2\2\u013a\33\3\2\2\2\u013b\u013c\t"+
		"\7\2\2\u013c\35\3\2\2\2\u013d\u013e\7\22\2\2\u013e\u013f\7\u00de\2\2\u013f"+
		"\u0140\7\u00df\2\2\u0140\37\3\2\2\2\u0141\u0148\7\23\2\2\u0142\u0148\7"+
		"\24\2\2\u0143\u0144\7\25\2\2\u0144\u0145\7\u00e2\2\2\u0145\u0146\7\u00e2"+
		"\2\2\u0146\u0148\7\u00df\2\2\u0147\u0141\3\2\2\2\u0147\u0142\3\2\2\2\u0147"+
		"\u0143\3\2\2\2\u0148!\3\2\2\2\u0149\u014a\t\b\2\2\u014a#\3\2\2\2\u014b"+
		"\u014c\7\30\2\2\u014c\u014d\7\u00e0\2\2\u014d%\3\2\2\2\u014e\u014f\7\31"+
		"\2\2\u014f\'\3\2\2\2\u0150\u0155\7\32\2\2\u0151\u0155\7\33\2\2\u0152\u0153"+
		"\7\34\2\2\u0153\u0155\7\u00df\2\2\u0154\u0150\3\2\2\2\u0154\u0151\3\2"+
		"\2\2\u0154\u0152\3\2\2\2\u0155)\3\2\2\2\u0156\u015b\7\35\2\2\u0157\u0158"+
		"\7\36\2\2\u0158\u0159\7\u00e0\2\2\u0159\u015b\7\u00df\2\2\u015a\u0156"+
		"\3\2\2\2\u015a\u0157\3\2\2\2\u015b+\3\2\2\2\u015c\u0163\7\37\2\2\u015d"+
		"\u0163\7 \2\2\u015e\u015f\7!\2\2\u015f\u0160\7\u00e2\2\2\u0160\u0161\7"+
		"\u00e2\2\2\u0161\u0163\7\u00df\2\2\u0162\u015c\3\2\2\2\u0162\u015d\3\2"+
		"\2\2\u0162\u015e\3\2\2\2\u0163-\3\2\2\2\u0164\u016e\7\"\2\2\u0165\u016e"+
		"\7#\2\2\u0166\u016e\7$\2\2\u0167\u016e\7%\2\2\u0168\u016e\7&\2\2\u0169"+
		"\u016a\7\'\2\2\u016a\u016b\7\u00e0\2\2\u016b\u016c\7\u00e0\2\2\u016c\u016e"+
		"\7\u00df\2\2\u016d\u0164\3\2\2\2\u016d\u0165\3\2\2\2\u016d\u0166\3\2\2"+
		"\2\u016d\u0167\3\2\2\2\u016d\u0168\3\2\2\2\u016d\u0169\3\2\2\2\u016e/"+
		"\3\2\2\2\u016f\u0170\7(\2\2\u0170\u0171\7\u00e2\2\2\u0171\61\3\2\2\2\u0172"+
		"\u0173\7)\2\2\u0173\63\3\2\2\2\u0174\u0175\7*\2\2\u0175\65\3\2\2\2\u0176"+
		"\u0177\t\t\2\2\u0177\67\3\2\2\2\u0178\u017e\7-\2\2\u0179\u017e\7.\2\2"+
		"\u017a\u017b\7/\2\2\u017b\u017c\7\u00e0\2\2\u017c\u017e\7\u00df\2\2\u017d"+
		"\u0178\3\2\2\2\u017d\u0179\3\2\2\2\u017d\u017a\3\2\2\2\u017e9\3\2\2\2"+
		"\u017f\u0185\7\60\2\2\u0180\u0181\7\61\2\2\u0181\u0182\7\u00e0\2\2\u0182"+
		"\u0183\7\u00e0\2\2\u0183\u0185\7\u00df\2\2\u0184\u017f\3\2\2\2\u0184\u0180"+
		"\3\2\2\2\u0185;\3\2\2\2\u0186\u0190\7\62\2\2\u0187\u0190\7\63\2\2\u0188"+
		"\u0190\7\64\2\2\u0189\u0190\7\65\2\2\u018a\u0190\7\66\2\2\u018b\u018c"+
		"\7\67\2\2\u018c\u018d\7\u00e2\2\2\u018d\u018e\7\u00e2\2\2\u018e\u0190"+
		"\7\u00df\2\2\u018f\u0186\3\2\2\2\u018f\u0187\3\2\2\2\u018f\u0188\3\2\2"+
		"\2\u018f\u0189\3\2\2\2\u018f\u018a\3\2\2\2\u018f\u018b\3\2\2\2\u0190="+
		"\3\2\2\2\u0191\u0197\78\2\2\u0192\u0197\79\2\2\u0193\u0194\7:\2\2\u0194"+
		"\u0195\7\u00e2\2\2\u0195\u0197\7\u00df\2\2\u0196\u0191\3\2\2\2\u0196\u0192"+
		"\3\2\2\2\u0196\u0193\3\2\2\2\u0197?\3\2\2\2\u0198\u01a0\7;\2\2\u0199\u01a0"+
		"\7<\2\2\u019a\u01a0\7=\2\2\u019b\u01a0\7>\2\2\u019c\u019d\7?\2\2\u019d"+
		"\u019e\7\u00e2\2\2\u019e\u01a0\7\u00df\2\2\u019f\u0198\3\2\2\2\u019f\u0199"+
		"\3\2\2\2\u019f\u019a\3\2\2\2\u019f\u019b\3\2\2\2\u019f\u019c\3\2\2\2\u01a0"+
		"A\3\2\2\2\u01a1\u01a7\7@\2\2\u01a2\u01a7\7A\2\2\u01a3\u01a4\7B\2\2\u01a4"+
		"\u01a5\7\u00e2\2\2\u01a5\u01a7\7\u00df\2\2\u01a6\u01a1\3\2\2\2\u01a6\u01a2"+
		"\3\2\2\2\u01a6\u01a3\3\2\2\2\u01a7C\3\2\2\2\u01a8\u01ae\7C\2\2\u01a9\u01ae"+
		"\7D\2\2\u01aa\u01ab\7E\2\2\u01ab\u01ac\7\u00e2\2\2\u01ac\u01ae\7\u00df"+
		"\2\2\u01ad\u01a8\3\2\2\2\u01ad\u01a9\3\2\2\2\u01ad\u01aa\3\2\2\2\u01ae"+
		"E\3\2\2\2\u01af\u01b0\7F\2\2\u01b0\u01b1\7\u00e2\2\2\u01b1\u01b2\7\u00e2"+
		"\2\2\u01b2\u01b3\7\u00df\2\2\u01b3G\3\2\2\2\u01b4\u01b5\7G\2\2\u01b5\u01b6"+
		"\7\u00df\2\2\u01b6I\3\2\2\2\u01b7\u01b8\7H\2\2\u01b8\u01b9\7\u00e0\2\2"+
		"\u01b9\u01ba\7\u00e2\2\2\u01ba\u01bb\7\u00df\2\2\u01bbK\3\2\2\2\u01bc"+
		"\u01bd\t\n\2\2\u01bdM\3\2\2\2\u01be\u01c2\7L\2\2\u01bf\u01c0\7M\2\2\u01c0"+
		"\u01c2\7\u00df\2\2\u01c1\u01be\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2O\3\2"+
		"\2\2\u01c3\u01c7\7N\2\2\u01c4\u01c5\7O\2\2\u01c5\u01c7\7\u00df\2\2\u01c6"+
		"\u01c3\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7Q\3\2\2\2\u01c8\u01c9\t\13\2\2"+
		"\u01c9S\3\2\2\2\u01ca\u01cb\7R\2\2\u01cb\u01cc\7\u00e2\2\2\u01ccU\3\2"+
		"\2\2\u01cd\u01ce\7S\2\2\u01ce\u01cf\7\u00e2\2\2\u01cfW\3\2\2\2\u01d0\u01d1"+
		"\7T\2\2\u01d1\u01d2\7\u00e2\2\2\u01d2Y\3\2\2\2\u01d3\u01d8\7U\2\2\u01d4"+
		"\u01d8\7V\2\2\u01d5\u01d6\7W\2\2\u01d6\u01d8\7\u00e2\2\2\u01d7\u01d3\3"+
		"\2\2\2\u01d7\u01d4\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8[\3\2\2\2\u01d9\u01da"+
		"\7X\2\2\u01da\u01db\7\u00e2\2\2\u01db]\3\2\2\2\u01dc\u01dd\7Y\2\2\u01dd"+
		"_\3\2\2\2\u01de\u01df\7Z\2\2\u01df\u01e0\7\u00e2\2\2\u01e0a\3\2\2\2\u01e1"+
		"\u01e6\7[\2\2\u01e2\u01e6\7\\\2\2\u01e3\u01e4\7]\2\2\u01e4\u01e6\7\u00e2"+
		"\2\2\u01e5\u01e1\3\2\2\2\u01e5\u01e2\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6"+
		"c\3\2\2\2\u01e7\u01eb\7^\2\2\u01e8\u01e9\7_\2\2\u01e9\u01eb\7\u00e2\2"+
		"\2\u01ea\u01e7\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ebe\3\2\2\2\u01ec\u01ed"+
		"\7`\2\2\u01ed\u01ee\7\u00e2\2\2\u01eeg\3\2\2\2\u01ef\u01f0\t\f\2\2\u01f0"+
		"i\3\2\2\2\u01f1\u01f2\t\r\2\2\u01f2k\3\2\2\2\u01f3\u01f4\t\16\2\2\u01f4"+
		"m\3\2\2\2\u01f5\u01f6\t\17\2\2\u01f6o\3\2\2\2\u01f7\u01f8\7j\2\2\u01f8"+
		"\u01f9\7\u00df\2\2\u01f9q\3\2\2\2\u01fa\u0201\7k\2\2\u01fb\u0201\7l\2"+
		"\2\u01fc\u0201\7m\2\2\u01fd\u01fe\7n\2\2\u01fe\u01ff\7\u00e2\2\2\u01ff"+
		"\u0201\7\u00df\2\2\u0200\u01fa\3\2\2\2\u0200\u01fb\3\2\2\2\u0200\u01fc"+
		"\3\2\2\2\u0200\u01fd\3\2\2\2\u0201s\3\2\2\2\u0202\u020c\7o\2\2\u0203\u020c"+
		"\7p\2\2\u0204\u020c\7q\2\2\u0205\u020c\7r\2\2\u0206\u020c\7s\2\2\u0207"+
		"\u020c\7t\2\2\u0208\u0209\7u\2\2\u0209\u020a\7\u00e2\2\2\u020a\u020c\7"+
		"\u00df\2\2\u020b\u0202\3\2\2\2\u020b\u0203\3\2\2\2\u020b\u0204\3\2\2\2"+
		"\u020b\u0205\3\2\2\2\u020b\u0206\3\2\2\2\u020b\u0207\3\2\2\2\u020b\u0208"+
		"\3\2\2\2\u020cu\3\2\2\2\u020d\u0214\7v\2\2\u020e\u0214\7w\2\2\u020f\u0210"+
		"\7x\2\2\u0210\u0211\7\u00e2\2\2\u0211\u0212\7\u00e2\2\2\u0212\u0214\7"+
		"\u00df\2\2\u0213\u020d\3\2\2\2\u0213\u020e\3\2\2\2\u0213\u020f\3\2\2\2"+
		"\u0214w\3\2\2\2\u0215\u021a\7y\2\2\u0216\u0217\7z\2\2\u0217\u0218\7\u00e2"+
		"\2\2\u0218\u021a\7\u00df\2\2\u0219\u0215\3\2\2\2\u0219\u0216\3\2\2\2\u021a"+
		"y\3\2\2\2\u021b\u021c\7{\2\2\u021c\u021d\7\u00e2\2\2\u021d\u021e\7\u00df"+
		"\2\2\u021e{\3\2\2\2\u021f\u0226\7|\2\2\u0220\u0226\7}\2\2\u0221\u0222"+
		"\7~\2\2\u0222\u0223\7\u00e2\2\2\u0223\u0224\7\u00e2\2\2\u0224\u0226\7"+
		"\u00df\2\2\u0225\u021f\3\2\2\2\u0225\u0220\3\2\2\2\u0225\u0221\3\2\2\2"+
		"\u0226}\3\2\2\2\u0227\u022e\7\177\2\2\u0228\u022e\7\u0080\2\2\u0229\u022a"+
		"\7\u0081\2\2\u022a\u022b\7\u00e2\2\2\u022b\u022c\7\u00e2\2\2\u022c\u022e"+
		"\7\u00df\2\2\u022d\u0227\3\2\2\2\u022d\u0228\3\2\2\2\u022d\u0229\3\2\2"+
		"\2\u022e\177\3\2\2\2\u022f\u0234\7\u0082\2\2\u0230\u0234\7\u0083\2\2\u0231"+
		"\u0232\7\u0084\2\2\u0232\u0234\7\u00df\2\2\u0233\u022f\3\2\2\2\u0233\u0230"+
		"\3\2\2\2\u0233\u0231\3\2\2\2\u0234\u0081\3\2\2\2\u0235\u0236\t\20\2\2"+
		"\u0236\u0083\3\2\2\2\u0237\u023b\7\u0087\2\2\u0238\u0239\7\u0088\2\2\u0239"+
		"\u023b\7\u00df\2\2\u023a\u0237\3\2\2\2\u023a\u0238\3\2\2\2\u023b\u0085"+
		"\3\2\2\2\u023c\u0240\7\u0089\2\2\u023d\u023e\7\u008a\2\2\u023e\u0240\7"+
		"\u00df\2\2\u023f\u023c\3\2\2\2\u023f\u023d\3\2\2\2\u0240\u0087\3\2\2\2"+
		"\u0241\u0242\7\u008b\2\2\u0242\u0089\3\2\2\2\u0243\u0244\7\u008c\2\2\u0244"+
		"\u008b\3\2\2\2\u0245\u0246\7\u008d\2\2\u0246\u008d\3\2\2\2\u0247\u024c"+
		"\7\u008e\2\2\u0248\u0249\7\u008f\2\2\u0249\u024a\7\u00e2\2\2\u024a\u024c"+
		"\7\u00df\2\2\u024b\u0247\3\2\2\2\u024b\u0248\3\2\2\2\u024c\u008f\3\2\2"+
		"\2\u024d\u024e\7\u0090\2\2\u024e\u0091\3\2\2\2\u024f\u0253\7\u0091\2\2"+
		"\u0250\u0251\7\u0092\2\2\u0251\u0253\7\u00df\2\2\u0252\u024f\3\2\2\2\u0252"+
		"\u0250\3\2\2\2\u0253\u0093\3\2\2\2\u0254\u0258\7\u0093\2\2\u0255\u0256"+
		"\7\u0094\2\2\u0256\u0258\7\u00df\2\2\u0257\u0254\3\2\2\2\u0257\u0255\3"+
		"\2\2\2\u0258\u0095\3\2\2\2\u0259\u025e\7\u0095\2\2\u025a\u025e\7\u0096"+
		"\2\2\u025b\u025c\7\u0097\2\2\u025c\u025e\7\u00e2\2\2\u025d\u0259\3\2\2"+
		"\2\u025d\u025a\3\2\2\2\u025d\u025b\3\2\2\2\u025e\u0097\3\2\2\2\u025f\u0260"+
		"\t\21\2\2\u0260\u0099\3\2\2\2\u0261\u0262\7\u009b\2\2\u0262\u0263\7\u00df"+
		"\2\2\u0263\u009b\3\2\2\2\u0264\u0265\7\u009c\2\2\u0265\u0266\7\u00e2\2"+
		"\2\u0266\u0267\7\u00e2\2\2\u0267\u009d\3\2\2\2\u0268\u026d\7\u009d\2\2"+
		"\u0269\u026d\7\u009e\2\2\u026a\u026b\7\u009f\2\2\u026b\u026d\7\u00e2\2"+
		"\2\u026c\u0268\3\2\2\2\u026c\u0269\3\2\2\2\u026c\u026a\3\2\2\2\u026d\u009f"+
		"\3\2\2\2\u026e\u026f\t\22\2\2\u026f\u00a1\3\2\2\2\u0270\u0271\7\u00a4"+
		"\2\2\u0271\u0272\7\u00e2\2\2\u0272\u0273\7\u00e2\2\2\u0273\u00a3\3\2\2"+
		"\2\u0274\u0275\7\u00a5\2\2\u0275\u0276\7\u00e2\2\2\u0276\u0277\7\u00e2"+
		"\2\2\u0277\u0278\7\u00e2\2\2\u0278\u0279\7\u00df\2\2\u0279\u00a5\3\2\2"+
		"\2\u027a\u027f\7\u00a6\2\2\u027b\u027c\7\u00a7\2\2\u027c\u027d\7\u00e2"+
		"\2\2\u027d\u027f\7\u00e2\2\2\u027e\u027a\3\2\2\2\u027e\u027b\3\2\2\2\u027f"+
		"\u00a7\3\2\2\2\u0280\u0286\7\u00a8\2\2\u0281\u0286\7\u00a9\2\2\u0282\u0283"+
		"\7\u00aa\2\2\u0283\u0284\7\u00e2\2\2\u0284\u0286\7\u00df\2\2\u0285\u0280"+
		"\3\2\2\2\u0285\u0281\3\2\2\2\u0285\u0282\3\2\2\2\u0286\u00a9\3\2\2\2\u0287"+
		"\u028c\7\u00ab\2\2\u0288\u0289\7\u00ac\2\2\u0289\u028a\7\u00e0\2\2\u028a"+
		"\u028c\7\u00df\2\2\u028b\u0287\3\2\2\2\u028b\u0288\3\2\2\2\u028c\u00ab"+
		"\3\2\2\2\u028d\u0294\7\u00ad\2\2\u028e\u0294\7\u00ae\2\2\u028f\u0290\7"+
		"\u00af\2\2\u0290\u0291\7\u00e2\2\2\u0291\u0292\7\u00e0\2\2\u0292\u0294"+
		"\7\u00df\2\2\u0293\u028d\3\2\2\2\u0293\u028e\3\2\2\2\u0293\u028f\3\2\2"+
		"\2\u0294\u00ad\3\2\2\2\u0295\u0296\7\u00b0\2\2\u0296\u0297\7\u00e2\2\2"+
		"\u0297\u0298\7\u00df\2\2\u0298\u00af\3\2\2\2\u0299\u029a\7\u00b1\2\2\u029a"+
		"\u029b\7\u00e2\2\2\u029b\u029c\7\u00e2\2\2\u029c\u029d\7\u00df\2\2\u029d"+
		"\u00b1\3\2\2\2\u029e\u029f\7\u00b2\2\2\u029f\u02a0\7\u00e2\2\2\u02a0\u02a1"+
		"\7\u00e2\2\2\u02a1\u02a2\7\u00df\2\2\u02a2\u00b3\3\2\2\2\u02a3\u02a4\7"+
		"\u00b3\2\2\u02a4\u02a5\7\u00e2\2\2\u02a5\u02a6\7\u00df\2\2\u02a6\u00b5"+
		"\3\2\2\2\u02a7\u02a8\7\u00b4\2\2\u02a8\u02a9\7\u00e2\2\2\u02a9\u02aa\7"+
		"\u00df\2\2\u02aa\u00b7\3\2\2\2\u02ab\u02b0\7\u00b5\2\2\u02ac\u02ad\7\u00b6"+
		"\2\2\u02ad\u02ae\7\u00e2\2\2\u02ae\u02b0\7\u00df\2\2\u02af\u02ab\3\2\2"+
		"\2\u02af\u02ac\3\2\2\2\u02b0\u00b9\3\2\2\2\u02b1\u02b2\7\u00b7\2\2\u02b2"+
		"\u02b3\7\u00e2\2\2\u02b3\u02b4\7\u00e2\2\2\u02b4\u02b5\7\u00e2\2\2\u02b5"+
		"\u02b6\7\u00e2\2\2\u02b6\u02b7\7\u00e2\2\2\u02b7\u02b8\7\u00df\2\2\u02b8"+
		"\u00bb\3\2\2\2\u02b9\u02ba\7\u00b8\2\2\u02ba\u02bb\7\u00e2\2\2\u02bb\u02bc"+
		"\7\u00df\2\2\u02bc\u00bd\3\2\2\2\u02bd\u02c2\7\u00b9\2\2\u02be\u02bf\7"+
		"\u00ba\2\2\u02bf\u02c0\7\u00e2\2\2\u02c0\u02c2\7\u00df\2\2\u02c1\u02bd"+
		"\3\2\2\2\u02c1\u02be\3\2\2\2\u02c2\u00bf\3\2\2\2\u02c3\u02c4\7\u00bb\2"+
		"\2\u02c4\u02c5\7\u00e2\2\2\u02c5\u00c1\3\2\2\2\u02c6\u02c7\7\u00bc\2\2"+
		"\u02c7\u02c8\7\u00e2\2\2\u02c8\u02c9\7\u00e2\2\2\u02c9\u00c3\3\2\2\2\u02ca"+
		"\u02cb\7\u00bd\2\2\u02cb\u00c5\3\2\2\2\u02cc\u02d1\7\u00be\2\2\u02cd\u02d1"+
		"\7\u00bf\2\2\u02ce\u02cf\7\u00c0\2\2\u02cf\u02d1\7\u00e2\2\2\u02d0\u02cc"+
		"\3\2\2\2\u02d0\u02cd\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d1\u00c7\3\2\2\2\u02d2"+
		"\u02d3\7\u00c1\2\2\u02d3\u02d4\7\u00df\2\2\u02d4\u00c9\3\2\2\2\u02d5\u02d6"+
		"\t\23\2\2\u02d6\u02d7\t\24\2\2\u02d7\u02d8\7\u00e0\2\2\u02d8\u00cb\3\2"+
		"\2\2\u02d9\u02da\7\u00c4\2\2\u02da\u00cd\3\2\2\2\u02db\u02e0\7\u00c5\2"+
		"\2\u02dc\u02dd\7\u00c6\2\2\u02dd\u02de\7\u00e0\2\2\u02de\u02e0\7\u00df"+
		"\2\2\u02df\u02db\3\2\2\2\u02df\u02dc\3\2\2\2\u02e0\u00cf\3\2\2\2\u02e1"+
		"\u02e2\7\u00c7\2\2\u02e2\u00d1\3\2\2\2\u02e3\u02ea\7\u00c8\2\2\u02e4\u02e5"+
		"\7\u00c9\2\2\u02e5\u02e6\7\u00e0\2\2\u02e6\u02e7\7\u00e0\2\2\u02e7\u02e8"+
		"\7\u00e0\2\2\u02e8\u02ea\7\u00df\2\2\u02e9\u02e3\3\2\2\2\u02e9\u02e4\3"+
		"\2\2\2\u02ea\u00d3\3\2\2\2\u02eb\u02f1\7\u00ca\2\2\u02ec\u02f1\7\u00cb"+
		"\2\2\u02ed\u02f1\7\u00cc\2\2\u02ee\u02ef\7\u00cd\2\2\u02ef\u02f1\7\u00df"+
		"\2\2\u02f0\u02eb\3\2\2\2\u02f0\u02ec\3\2\2\2\u02f0\u02ed\3\2\2\2\u02f0"+
		"\u02ee\3\2\2\2\u02f1\u00d5\3\2\2\2\u02f2\u02fa\7\u00ce\2\2\u02f3\u02fa"+
		"\7\u00cf\2\2\u02f4\u02fa\7\u00d0\2\2\u02f5\u02fa\7\u00d1\2\2\u02f6\u02fa"+
		"\7\u00d2\2\2\u02f7\u02f8\7\u00d3\2\2\u02f8\u02fa\7\u00df\2\2\u02f9\u02f2"+
		"\3\2\2\2\u02f9\u02f3\3\2\2\2\u02f9\u02f4\3\2\2\2\u02f9\u02f5\3\2\2\2\u02f9"+
		"\u02f6\3\2\2\2\u02f9\u02f7\3\2\2\2\u02fa\u00d7\3\2\2\2\u02fb\u0303\7\u00d4"+
		"\2\2\u02fc\u0303\7\u00d5\2\2\u02fd\u0303\7\u00d6\2\2\u02fe\u0303\7\u00d7"+
		"\2\2\u02ff\u0300\7\u00d8\2\2\u0300\u0301\7\u00de\2\2\u0301\u0303\7\u00df"+
		"\2\2\u0302\u02fb\3\2\2\2\u0302\u02fc\3\2\2\2\u0302\u02fd\3\2\2\2\u0302"+
		"\u02fe\3\2\2\2\u0302\u02ff\3\2\2\2\u0303\u00d9\3\2\2\2\u0304\u0305\t\25"+
		"\2\2\u0305\u00db\3\2\2\2\u0306\u030b\7\u00dc\2\2\u0307\u0308\7\u00dd\2"+
		"\2\u0308\u0309\7\u00de\2\2\u0309\u030b\7\u00df\2\2\u030a\u0306\3\2\2\2"+
		"\u030a\u0307\3\2\2\2\u030b\u00dd\3\2\2\2\u030c\u0348\5\16\b\2\u030d\u0348"+
		"\5\20\t\2\u030e\u0348\5\22\n\2\u030f\u0348\5\24\13\2\u0310\u0348\5\26"+
		"\f\2\u0311\u0348\5\30\r\2\u0312\u0348\5\36\20\2\u0313\u0348\5 \21\2\u0314"+
		"\u0348\5(\25\2\u0315\u0348\5*\26\2\u0316\u0348\5,\27\2\u0317\u0348\5."+
		"\30\2\u0318\u0348\58\35\2\u0319\u0348\5:\36\2\u031a\u0348\5<\37\2\u031b"+
		"\u0348\5> \2\u031c\u0348\5@!\2\u031d\u0348\5B\"\2\u031e\u0348\5D#\2\u031f"+
		"\u0348\5F$\2\u0320\u0348\5H%\2\u0321\u0348\5J&\2\u0322\u0348\5N(\2\u0323"+
		"\u0348\5P)\2\u0324\u0348\5p9\2\u0325\u0348\5r:\2\u0326\u0348\5t;\2\u0327"+
		"\u0348\5v<\2\u0328\u0348\5x=\2\u0329\u0348\5z>\2\u032a\u0348\5|?\2\u032b"+
		"\u0348\5~@\2\u032c\u0348\5\u0080A\2\u032d\u0348\5\u0084C\2\u032e\u0348"+
		"\5\u0086D\2\u032f\u0348\5\u008eH\2\u0330\u0348\5\u0092J\2\u0331\u0348"+
		"\5\u0094K\2\u0332\u0348\5\u009aN\2\u0333\u0348\5\u00a4S\2\u0334\u0348"+
		"\5\u00a8U\2\u0335\u0348\5\u00aaV\2\u0336\u0348\5\u00acW\2\u0337\u0348"+
		"\5\u00aeX\2\u0338\u0348\5\u00b0Y\2\u0339\u0348\5\u00b2Z\2\u033a\u0348"+
		"\5\u00b4[\2\u033b\u0348\5\u00b6\\\2\u033c\u0348\5\u00b8]\2\u033d\u0348"+
		"\5\u00ba^\2\u033e\u0348\5\u00bc_\2\u033f\u0348\5\u00be`\2\u0340\u0348"+
		"\5\u00c8e\2\u0341\u0348\5\u00ceh\2\u0342\u0348\5\u00d2j\2\u0343\u0348"+
		"\5\u00d4k\2\u0344\u0348\5\u00d6l\2\u0345\u0348\5\u00d8m\2\u0346\u0348"+
		"\5\u00dco\2\u0347\u030c\3\2\2\2\u0347\u030d\3\2\2\2\u0347\u030e\3\2\2"+
		"\2\u0347\u030f\3\2\2\2\u0347\u0310\3\2\2\2\u0347\u0311\3\2\2\2\u0347\u0312"+
		"\3\2\2\2\u0347\u0313\3\2\2\2\u0347\u0314\3\2\2\2\u0347\u0315\3\2\2\2\u0347"+
		"\u0316\3\2\2\2\u0347\u0317\3\2\2\2\u0347\u0318\3\2\2\2\u0347\u0319\3\2"+
		"\2\2\u0347\u031a\3\2\2\2\u0347\u031b\3\2\2\2\u0347\u031c\3\2\2\2\u0347"+
		"\u031d\3\2\2\2\u0347\u031e\3\2\2\2\u0347\u031f\3\2\2\2\u0347\u0320\3\2"+
		"\2\2\u0347\u0321\3\2\2\2\u0347\u0322\3\2\2\2\u0347\u0323\3\2\2\2\u0347"+
		"\u0324\3\2\2\2\u0347\u0325\3\2\2\2\u0347\u0326\3\2\2\2\u0347\u0327\3\2"+
		"\2\2\u0347\u0328\3\2\2\2\u0347\u0329\3\2\2\2\u0347\u032a\3\2\2\2\u0347"+
		"\u032b\3\2\2\2\u0347\u032c\3\2\2\2\u0347\u032d\3\2\2\2\u0347\u032e\3\2"+
		"\2\2\u0347\u032f\3\2\2\2\u0347\u0330\3\2\2\2\u0347\u0331\3\2\2\2\u0347"+
		"\u0332\3\2\2\2\u0347\u0333\3\2\2\2\u0347\u0334\3\2\2\2\u0347\u0335\3\2"+
		"\2\2\u0347\u0336\3\2\2\2\u0347\u0337\3\2\2\2\u0347\u0338\3\2\2\2\u0347"+
		"\u0339\3\2\2\2\u0347\u033a\3\2\2\2\u0347\u033b\3\2\2\2\u0347\u033c\3\2"+
		"\2\2\u0347\u033d\3\2\2\2\u0347\u033e\3\2\2\2\u0347\u033f\3\2\2\2\u0347"+
		"\u0340\3\2\2\2\u0347\u0341\3\2\2\2\u0347\u0342\3\2\2\2\u0347\u0343\3\2"+
		"\2\2\u0347\u0344\3\2\2\2\u0347\u0345\3\2\2\2\u0347\u0346\3\2\2\2\u0348"+
		"\u00df\3\2\2\2\u0349\u036f\5\32\16\2\u034a\u036f\5\34\17\2\u034b\u036f"+
		"\5\"\22\2\u034c\u036f\5$\23\2\u034d\u036f\5&\24\2\u034e\u036f\5\62\32"+
		"\2\u034f\u036f\5\64\33\2\u0350\u036f\5\66\34\2\u0351\u036f\5L\'\2\u0352"+
		"\u036f\5R*\2\u0353\u036f\5^\60\2\u0354\u036f\5`\61\2\u0355\u036f\5b\62"+
		"\2\u0356\u036f\5d\63\2\u0357\u036f\5f\64\2\u0358\u036f\5h\65\2\u0359\u036f"+
		"\5j\66\2\u035a\u036f\5l\67\2\u035b\u036f\5n8\2\u035c\u036f\5\u0082B\2"+
		"\u035d\u036f\5\u0088E\2\u035e\u036f\5\u008aF\2\u035f\u036f\5\u008cG\2"+
		"\u0360\u036f\5\u0090I\2\u0361\u036f\5\u0096L\2\u0362\u036f\5\u0098M\2"+
		"\u0363\u036f\5\u009cO\2\u0364\u036f\5\u009eP\2\u0365\u036f\5\u00a0Q\2"+
		"\u0366\u036f\5\u00a2R\2\u0367\u036f\5\u00a6T\2\u0368\u036f\5\u00c0a\2"+
		"\u0369\u036f\5\u00c2b\2\u036a\u036f\5\u00c4c\2\u036b\u036f\5\u00c6d\2"+
		"\u036c\u036f\5\u00d0i\2\u036d\u036f\5\u00dan\2\u036e\u0349\3\2\2\2\u036e"+
		"\u034a\3\2\2\2\u036e\u034b\3\2\2\2\u036e\u034c\3\2\2\2\u036e\u034d\3\2"+
		"\2\2\u036e\u034e\3\2\2\2\u036e\u034f\3\2\2\2\u036e\u0350\3\2\2\2\u036e"+
		"\u0351\3\2\2\2\u036e\u0352\3\2\2\2\u036e\u0353\3\2\2\2\u036e\u0354\3\2"+
		"\2\2\u036e\u0355\3\2\2\2\u036e\u0356\3\2\2\2\u036e\u0357\3\2\2\2\u036e"+
		"\u0358\3\2\2\2\u036e\u0359\3\2\2\2\u036e\u035a\3\2\2\2\u036e\u035b\3\2"+
		"\2\2\u036e\u035c\3\2\2\2\u036e\u035d\3\2\2\2\u036e\u035e\3\2\2\2\u036e"+
		"\u035f\3\2\2\2\u036e\u0360\3\2\2\2\u036e\u0361\3\2\2\2\u036e\u0362\3\2"+
		"\2\2\u036e\u0363\3\2\2\2\u036e\u0364\3\2\2\2\u036e\u0365\3\2\2\2\u036e"+
		"\u0366\3\2\2\2\u036e\u0367\3\2\2\2\u036e\u0368\3\2\2\2\u036e\u0369\3\2"+
		"\2\2\u036e\u036a\3\2\2\2\u036e\u036b\3\2\2\2\u036e\u036c\3\2\2\2\u036e"+
		"\u036d\3\2\2\2\u036f\u00e1\3\2\2\2\u0370\u0379\5\60\31\2\u0371\u0379\5"+
		"T+\2\u0372\u0379\5V,\2\u0373\u0379\5X-\2\u0374\u0379\5Z.\2\u0375\u0379"+
		"\5\\/\2\u0376\u0379\5\u00caf\2\u0377\u0379\5\u00ccg\2\u0378\u0370\3\2"+
		"\2\2\u0378\u0371\3\2\2\2\u0378\u0372\3\2\2\2\u0378\u0373\3\2\2\2\u0378"+
		"\u0374\3\2\2\2\u0378\u0375\3\2\2\2\u0378\u0376\3\2\2\2\u0378\u0377\3\2"+
		"\2\2\u0379\u00e3\3\2\2\29\u00ef\u00f6\u0105\u010d\u010f\u0118\u0120\u0127"+
		"\u0147\u0154\u015a\u0162\u016d\u017d\u0184\u018f\u0196\u019f\u01a6\u01ad"+
		"\u01c1\u01c6\u01d7\u01e5\u01ea\u0200\u020b\u0213\u0219\u0225\u022d\u0233"+
		"\u023a\u023f\u024b\u0252\u0257\u025d\u026c\u027e\u0285\u028b\u0293\u02af"+
		"\u02c1\u02d0\u02df\u02e9\u02f0\u02f9\u0302\u030a\u0347\u036e\u0378";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}