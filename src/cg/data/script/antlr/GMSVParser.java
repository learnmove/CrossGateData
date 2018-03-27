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
		T__215=216, T__216=217, T__217=218, T__218=219, T__219=220, T__220=221, 
		T__221=222, BOOLEAN=223, NEWLINE=224, INT=225, STRING=226, ALLSTRING=227, 
		NAME=228, COLON=229, COMMA=230, SEMICOLON=231, LPAREN=232, RPAREN=233, 
		LSQUARE=234, RSQUARE=235, LCURLY=236, RCURLY=237, DOT=238, UNDERLINE=239, 
		ASSIGNEQUAL=240, NOTEQUAL1=241, NOTEQUAL2=242, LESSTHANOREQUALTO=243, 
		LESSTHAN=244, GREATERTHANOREQUALTO=245, GREATERTHAN=246, DIV=247, ADD=248, 
		SUB=249, MUL=250, MOD=251, TILDE=252, BITWISEOR=253, BITWISEXOR=254, POUND=255, 
		DOLLAR=256, COMMENT=257, LINE_COMMENT=258, WS=259, EQUAL=260, AND=261, 
		OR=262;
	public static final int
		RULE_r = 0, RULE_exprString = 1, RULE_exprBoolean = 2, RULE_exprInt = 3, 
		RULE_progRule = 4, RULE_commonRule = 5, RULE_blockRule = 6, RULE_addfeversec = 7, 
		RULE_addgold = 8, RULE_addgoldlevel = 9, RULE_addluck = 10, RULE_addskillslot = 11, 
		RULE_addstampcount = 12, RULE_bimage = 13, RULE_bbimage = 14, RULE_block = 15, 
		RULE_changepal = 16, RULE_checkitemcategory = 17, RULE_checkrealtime = 18, 
		RULE_checkskillslot = 19, RULE_checktitle = 20, RULE_encount = 21, RULE_endevent = 22, 
		RULE_endwindow = 23, RULE_equipitem = 24, RULE_fame = 25, RULE_floor = 26, 
		RULE_fp = 27, RULE_gaendwindow = 28, RULE_gawindow = 29, RULE_giveitem = 30, 
		RULE_giveleak0item = 31, RULE_giveleak1item = 32, RULE_givepet = 33, RULE_giverecipe = 34, 
		RULE_givestackitem = 35, RULE_globalflag = 36, RULE_globaltimer = 37, 
		RULE_gold = 38, RULE_gotob = 39, RULE_gotof = 40, RULE_group = 41, RULE_haveitem = 42, 
		RULE_haveleak0item = 43, RULE_haveleak1item = 44, RULE_havetitle = 45, 
		RULE_houseid = 46, RULE_imagetype = 47, RULE_item = 48, RULE_itemcreatetime = 49, 
		RULE_itemdur = 50, RULE_itemdurper = 51, RULE_itemspace = 52, RULE_job = 53, 
		RULE_jobancestry = 54, RULE_jobrank = 55, RULE_killdrugdish = 56, RULE_killitem = 57, 
		RULE_killitemall = 58, RULE_killleak0item = 59, RULE_killleak1item = 60, 
		RULE_killpet = 61, RULE_killpeth = 62, RULE_killpetl = 63, RULE_leavegroup = 64, 
		RULE_level = 65, RULE_localcount = 66, RULE_localflag = 67, RULE_lp = 68, 
		RULE_maxfp = 69, RULE_maxlp = 70, RULE_message = 71, RULE_metamocount = 72, 
		RULE_next = 73, RULE_no = 74, RULE_nowevent = 75, RULE_nowtime = 76, RULE_ok = 77, 
		RULE_pequipitem = 78, RULE_petlevel = 79, RULE_petspace = 80, RULE_phitem = 81, 
		RULE_playse = 82, RULE_random = 83, RULE_setaction = 84, RULE_setcharm = 85, 
		RULE_setdur = 86, RULE_setfeverflg = 87, RULE_sethouse = 88, RULE_sethouselimit = 89, 
		RULE_setlevel = 90, RULE_setloginpoint = 91, RULE_setlp = 92, RULE_setobject = 93, 
		RULE_setvisitor = 94, RULE_shapenext = 95, RULE_shipchardown = 96, RULE_shipchartake = 97, 
		RULE_shipgetstoptime = 98, RULE_skilllevel = 99, RULE_stackitemspace = 100, 
		RULE_strcmpchat = 101, RULE_strstrchat = 102, RULE_systemmessage = 103, 
		RULE_trueimage = 104, RULE_warp = 105, RULE_window_no = 106, RULE_window_ok = 107, 
		RULE_window_yes = 108, RULE_xpos = 109, RULE_yes = 110, RULE_multiCOMMON = 111, 
		RULE_multiINT = 112, RULE_multiBOOLEAN = 113;
	public static final String[] ruleNames = {
		"r", "exprString", "exprBoolean", "exprInt", "progRule", "commonRule", 
		"blockRule", "addfeversec", "addgold", "addgoldlevel", "addluck", "addskillslot", 
		"addstampcount", "bimage", "bbimage", "block", "changepal", "checkitemcategory", 
		"checkrealtime", "checkskillslot", "checktitle", "encount", "endevent", 
		"endwindow", "equipitem", "fame", "floor", "fp", "gaendwindow", "gawindow", 
		"giveitem", "giveleak0item", "giveleak1item", "givepet", "giverecipe", 
		"givestackitem", "globalflag", "globaltimer", "gold", "gotob", "gotof", 
		"group", "haveitem", "haveleak0item", "haveleak1item", "havetitle", "houseid", 
		"imagetype", "item", "itemcreatetime", "itemdur", "itemdurper", "itemspace", 
		"job", "jobancestry", "jobrank", "killdrugdish", "killitem", "killitemall", 
		"killleak0item", "killleak1item", "killpet", "killpeth", "killpetl", "leavegroup", 
		"level", "localcount", "localflag", "lp", "maxfp", "maxlp", "message", 
		"metamocount", "next", "no", "nowevent", "nowtime", "ok", "pequipitem", 
		"petlevel", "petspace", "phitem", "playse", "random", "setaction", "setcharm", 
		"setdur", "setfeverflg", "sethouse", "sethouselimit", "setlevel", "setloginpoint", 
		"setlp", "setobject", "setvisitor", "shapenext", "shipchardown", "shipchartake", 
		"shipgetstoptime", "skilllevel", "stackitemspace", "strcmpchat", "strstrchat", 
		"systemmessage", "trueimage", "warp", "window_no", "window_ok", "window_yes", 
		"xpos", "yes", "multiCOMMON", "multiINT", "multiBOOLEAN"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'endBlock'", "'Addfeversec'", "'AddFeverSec'", "'addfeversec'", 
		"'AddGold'", "'Addgold'", "'addgold'", "'AddGoldLevel'", "'addluck'", 
		"'addskillslot'", "'AddStampCount'", "'BImage'", "'Bimage'", "'BBImage'", 
		"'BBimage'", "'bbimage'", "'block'", "'ChangePal'", "'Changepal'", "'changepal'", 
		"'CheckItemCategory'", "'checkitemcategory'", "'CheckRealTime'", "'checkskillslot'", 
		"'CheckTitle'", "'checktitle'", "'Checktitle'", "'Encount'", "'encount'", 
		"'endevent'", "'EndEvent'", "'Endevent'", "'EndWindow'", "'endWindow'", 
		"'EndWIndow'", "'Endwindow'", "'ENDWindow'", "'endwindow'", "'EquipItem'", 
		"'Fame'", "'Floor'", "'fp'", "'FP'", "'GAendWindow'", "'GAendwindow'", 
		"'GAEndWindow'", "'GAwindow'", "'GAWindow'", "'giveItem'", "'Giveitem'", 
		"'GIveitem'", "'GiveItem'", "'GIveItem'", "'giveitem'", "'Giveleak0Item'", 
		"'GiveLeak0Item'", "'GiveLeak0item'", "'GIveleak1Item'", "'Giveleak1item'", 
		"'Giveleak1Item'", "'GiveLeak1item'", "'GiveLeak1Item'", "'Givepet'", 
		"'GivePet'", "'givepet'", "'GiveRecipe'", "'Giverecipe'", "'giverecipe'", 
		"'GiveStackItem'", "'GAglobalFlag'", "'GlobalTimerA'", "'gold'", "'Gold'", 
		"'GOLD'", "'gotoB'", "'GotoB'", "'gotoF'", "'GotoF'", "'Group'", "'group'", 
		"'HaveItem'", "'HaveLeak0Item'", "'HaveLeak1Item'", "'havetitle'", "'Havetitle'", 
		"'HaveTitle'", "'HouseId'", "'Imagetype'", "'Item'", "'item'", "'ITem'", 
		"'itemcreatetime'", "'ItemCreateTime'", "'Itemcreatetime'", "'ItemDur'", 
		"'ItemDUR'", "'ItemDurPer'", "'ItemSpace'", "'Itemspace'", "'itemspace'", 
		"'job'", "'Job'", "'jobancestry'", "'JobAncestry'", "'Jobrank'", "'JobRank'", 
		"'killdrugdish'", "'killitem'", "'Killitem'", "'killItem'", "'KillItem'", 
		"'Killitemall'", "'killitemall'", "'KillItemall'", "'KillItemAll'", "'KillItemALL'", 
		"'KIllItemall'", "'killItemall'", "'killleak0item'", "'KillLeak0item'", 
		"'KillLeak0Item'", "'KillLeak1Item'", "'KillLeak1item'", "'KillPet'", 
		"'KillPetH'", "'KillPeth'", "'Killpeth'", "'KillPetl'", "'KillPetL'", 
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
		"'Yes'", null, null, null, null, null, null, "':'", "','", "';'", "'('", 
		"')'", "'['", "']'", "'{'", "'}'", "'.'", "'_'", "'='", "'<>'", "'!='", 
		"'<='", "'<'", "'>='", "'>'", "'/'", "'+'", "'-'", "'*'", "'%'", "'~'", 
		"'|'", "'^'", "'#'", "'$'", null, null, null, "'=='", "'&&'", "'||'"
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
		null, null, null, null, null, null, null, "BOOLEAN", "NEWLINE", "INT", 
		"STRING", "ALLSTRING", "NAME", "COLON", "COMMA", "SEMICOLON", "LPAREN", 
		"RPAREN", "LSQUARE", "RSQUARE", "LCURLY", "RCURLY", "DOT", "UNDERLINE", 
		"ASSIGNEQUAL", "NOTEQUAL1", "NOTEQUAL2", "LESSTHANOREQUALTO", "LESSTHAN", 
		"GREATERTHANOREQUALTO", "GREATERTHAN", "DIV", "ADD", "SUB", "MUL", "MOD", 
		"TILDE", "BITWISEOR", "BITWISEXOR", "POUND", "DOLLAR", "COMMENT", "LINE_COMMENT", 
		"WS", "EQUAL", "AND", "OR"
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
			setState(228);
			match(NAME);
			setState(229);
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

	public static class ExprStringContext extends ParserRuleContext {
		public TerminalNode ALLSTRING() { return getToken(GMSVParser.ALLSTRING, 0); }
		public ExprStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterExprString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitExprString(this);
		}
	}

	public final ExprStringContext exprString() throws RecognitionException {
		ExprStringContext _localctx = new ExprStringContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exprString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(ALLSTRING);
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

	public static class ExprBooleanContext extends ParserRuleContext {
		public ExprBooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprBoolean; }
	 
		public ExprBooleanContext() { }
		public void copyFrom(ExprBooleanContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooContext extends ExprBooleanContext {
		public TerminalNode BOOLEAN() { return getToken(GMSVParser.BOOLEAN, 0); }
		public BooContext(ExprBooleanContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterBoo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitBoo(this);
		}
	}
	public static class BooParensContext extends ExprBooleanContext {
		public ExprBooleanContext exprBoolean() {
			return getRuleContext(ExprBooleanContext.class,0);
		}
		public BooParensContext(ExprBooleanContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterBooParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitBooParens(this);
		}
	}
	public static class ExprBooContext extends ExprBooleanContext {
		public Token op;
		public List<ExprIntContext> exprInt() {
			return getRuleContexts(ExprIntContext.class);
		}
		public ExprIntContext exprInt(int i) {
			return getRuleContext(ExprIntContext.class,i);
		}
		public ExprBooContext(ExprBooleanContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterExprBoo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitExprBoo(this);
		}
	}
	public static class MulBooContext extends ExprBooleanContext {
		public MultiBOOLEANContext multiBOOLEAN() {
			return getRuleContext(MultiBOOLEANContext.class,0);
		}
		public MulBooContext(ExprBooleanContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterMulBoo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitMulBoo(this);
		}
	}
	public static class AndOrContext extends ExprBooleanContext {
		public Token op;
		public List<ExprBooleanContext> exprBoolean() {
			return getRuleContexts(ExprBooleanContext.class);
		}
		public ExprBooleanContext exprBoolean(int i) {
			return getRuleContext(ExprBooleanContext.class,i);
		}
		public AndOrContext(ExprBooleanContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterAndOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitAndOr(this);
		}
	}

	public final ExprBooleanContext exprBoolean() throws RecognitionException {
		return exprBoolean(0);
	}

	private ExprBooleanContext exprBoolean(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprBooleanContext _localctx = new ExprBooleanContext(_ctx, _parentState);
		ExprBooleanContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_exprBoolean, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				_localctx = new ExprBooContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(234);
				exprInt(0);
				setState(235);
				((ExprBooContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 241)) & ~0x3f) == 0 && ((1L << (_la - 241)) & ((1L << (NOTEQUAL1 - 241)) | (1L << (NOTEQUAL2 - 241)) | (1L << (LESSTHANOREQUALTO - 241)) | (1L << (LESSTHAN - 241)) | (1L << (GREATERTHANOREQUALTO - 241)) | (1L << (GREATERTHAN - 241)) | (1L << (EQUAL - 241)))) != 0)) ) {
					((ExprBooContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(236);
				exprInt(0);
				}
				break;
			case 2:
				{
				_localctx = new MulBooContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(238);
				multiBOOLEAN();
				}
				break;
			case 3:
				{
				_localctx = new BooContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239);
				match(BOOLEAN);
				}
				break;
			case 4:
				{
				_localctx = new BooParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(240);
				match(LPAREN);
				setState(241);
				exprBoolean(0);
				setState(242);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndOrContext(new ExprBooleanContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_exprBoolean);
					setState(246);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(247);
					((AndOrContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
						((AndOrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(248);
					exprBoolean(5);
					}
					} 
				}
				setState(253);
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

	public static class ExprIntContext extends ParserRuleContext {
		public ExprIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprInt; }
	 
		public ExprIntContext() { }
		public void copyFrom(ExprIntContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParensContext extends ExprIntContext {
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
		public ParensContext(ExprIntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitParens(this);
		}
	}
	public static class MulDivContext extends ExprIntContext {
		public Token op;
		public List<ExprIntContext> exprInt() {
			return getRuleContexts(ExprIntContext.class);
		}
		public ExprIntContext exprInt(int i) {
			return getRuleContext(ExprIntContext.class,i);
		}
		public MulDivContext(ExprIntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitMulDiv(this);
		}
	}
	public static class AddSubContext extends ExprIntContext {
		public Token op;
		public List<ExprIntContext> exprInt() {
			return getRuleContexts(ExprIntContext.class);
		}
		public ExprIntContext exprInt(int i) {
			return getRuleContext(ExprIntContext.class,i);
		}
		public AddSubContext(ExprIntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitAddSub(this);
		}
	}
	public static class IntRuleContext extends ExprIntContext {
		public MultiINTContext multiINT() {
			return getRuleContext(MultiINTContext.class,0);
		}
		public IntRuleContext(ExprIntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterIntRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitIntRule(this);
		}
	}
	public static class IdContext extends ExprIntContext {
		public RContext r() {
			return getRuleContext(RContext.class,0);
		}
		public IdContext(ExprIntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitId(this);
		}
	}
	public static class IntContext extends ExprIntContext {
		public TerminalNode INT() { return getToken(GMSVParser.INT, 0); }
		public IntContext(ExprIntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitInt(this);
		}
	}

	public final ExprIntContext exprInt() throws RecognitionException {
		return exprInt(0);
	}

	private ExprIntContext exprInt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprIntContext _localctx = new ExprIntContext(_ctx, _parentState);
		ExprIntContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_exprInt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			switch (_input.LA(1)) {
			case NAME:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(255);
				r();
				}
				break;
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(256);
				match(INT);
				}
				break;
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__71:
			case T__72:
			case T__73:
			case T__78:
			case T__79:
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
			case T__103:
			case T__104:
			case T__105:
			case T__133:
			case T__134:
			case T__139:
			case T__140:
			case T__141:
			case T__144:
			case T__149:
			case T__150:
			case T__151:
			case T__152:
			case T__153:
			case T__154:
			case T__156:
			case T__157:
			case T__158:
			case T__159:
			case T__160:
			case T__161:
			case T__162:
			case T__163:
			case T__164:
			case T__166:
			case T__167:
			case T__187:
			case T__188:
			case T__189:
			case T__190:
			case T__191:
			case T__192:
			case T__199:
			case T__217:
			case T__218:
			case T__219:
				{
				_localctx = new IntRuleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(257);
				multiINT();
				}
				break;
			case LPAREN:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258);
				match(LPAREN);
				setState(259);
				exprInt(0);
				setState(260);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(270);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprIntContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprInt);
						setState(264);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(265);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 247)) & ~0x3f) == 0 && ((1L << (_la - 247)) & ((1L << (DIV - 247)) | (1L << (MUL - 247)) | (1L << (MOD - 247)))) != 0)) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(266);
						exprInt(7);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprIntContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprInt);
						setState(267);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(268);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(269);
						exprInt(6);
						}
						break;
					}
					} 
				}
				setState(274);
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

	public static class ProgRuleContext extends ParserRuleContext {
		public ProgRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_progRule; }
	 
		public ProgRuleContext() { }
		public void copyFrom(ProgRuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComRuleContext extends ProgRuleContext {
		public CommonRuleContext commonRule() {
			return getRuleContext(CommonRuleContext.class,0);
		}
		public ComRuleContext(ProgRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterComRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitComRule(this);
		}
	}
	public static class MultiBlockContext extends ProgRuleContext {
		public List<BlockRuleContext> blockRule() {
			return getRuleContexts(BlockRuleContext.class);
		}
		public BlockRuleContext blockRule(int i) {
			return getRuleContext(BlockRuleContext.class,i);
		}
		public MultiBlockContext(ProgRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterMultiBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitMultiBlock(this);
		}
	}

	public final ProgRuleContext progRule() throws RecognitionException {
		ProgRuleContext _localctx = new ProgRuleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_progRule);
		int _la;
		try {
			setState(281);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new MultiBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(276); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(275);
					blockRule();
					}
					}
					setState(278); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__16 );
				}
				break;
			case 2:
				_localctx = new ComRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				commonRule();
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

	public static class CommonRuleContext extends ParserRuleContext {
		public List<MultiCOMMONContext> multiCOMMON() {
			return getRuleContexts(MultiCOMMONContext.class);
		}
		public MultiCOMMONContext multiCOMMON(int i) {
			return getRuleContext(MultiCOMMONContext.class,i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(283);
					multiCOMMON();
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class BlockRuleContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExprBooleanContext exprBoolean() {
			return getRuleContext(ExprBooleanContext.class,0);
		}
		public CommonRuleContext commonRule() {
			return getRuleContext(CommonRuleContext.class,0);
		}
		public BlockRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterBlockRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitBlockRule(this);
		}
	}

	public final BlockRuleContext blockRule() throws RecognitionException {
		BlockRuleContext _localctx = new BlockRuleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_blockRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			block();
			setState(290);
			exprBoolean(0);
			setState(291);
			commonRule();
			setState(293);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(292);
				match(T__0);
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

	public static class AddfeversecContext extends ParserRuleContext {
		public ExprStringContext exprString() {
			return getRuleContext(ExprStringContext.class,0);
		}
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
		enterRule(_localctx, 14, RULE_addfeversec);
		try {
			setState(301);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				match(T__3);
				setState(298);
				exprString();
				setState(299);
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
		public ExprStringContext exprString() {
			return getRuleContext(ExprStringContext.class,0);
		}
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
		enterRule(_localctx, 16, RULE_addgold);
		try {
			setState(309);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				match(T__6);
				setState(306);
				exprString();
				setState(307);
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
		enterRule(_localctx, 18, RULE_addgoldlevel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(T__7);
			setState(312);
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
		public List<ExprIntContext> exprInt() {
			return getRuleContexts(ExprIntContext.class);
		}
		public ExprIntContext exprInt(int i) {
			return getRuleContext(ExprIntContext.class,i);
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
		enterRule(_localctx, 20, RULE_addluck);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(T__8);
			setState(315);
			exprInt(0);
			setState(316);
			exprInt(0);
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
		enterRule(_localctx, 22, RULE_addskillslot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(T__9);
			setState(320);
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
		public List<ExprIntContext> exprInt() {
			return getRuleContexts(ExprIntContext.class);
		}
		public ExprIntContext exprInt(int i) {
			return getRuleContext(ExprIntContext.class,i);
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
		enterRule(_localctx, 24, RULE_addstampcount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(T__10);
			setState(323);
			exprInt(0);
			setState(324);
			exprInt(0);
			setState(325);
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
		enterRule(_localctx, 26, RULE_bimage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
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
		enterRule(_localctx, 28, RULE_bbimage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
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
		public ExprBooleanContext exprBoolean() {
			return getRuleContext(ExprBooleanContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GMSVParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GMSVParser.NEWLINE, i);
		}
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
		enterRule(_localctx, 30, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(T__16);
			setState(332);
			exprBoolean(0);
			setState(333);
			match(NEWLINE);
			setState(334);
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
		public List<ExprIntContext> exprInt() {
			return getRuleContexts(ExprIntContext.class);
		}
		public ExprIntContext exprInt(int i) {
			return getRuleContext(ExprIntContext.class,i);
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
		enterRule(_localctx, 32, RULE_changepal);
		try {
			setState(343);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				match(T__18);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				match(T__19);
				setState(339);
				exprInt(0);
				setState(340);
				exprInt(0);
				setState(341);
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
		enterRule(_localctx, 34, RULE_checkitemcategory);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_la = _input.LA(1);
			if ( !(_la==T__20 || _la==T__21) ) {
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
		public ExprStringContext exprString() {
			return getRuleContext(ExprStringContext.class,0);
		}
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
		enterRule(_localctx, 36, RULE_checkrealtime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(T__22);
			setState(348);
			exprString();
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
		enterRule(_localctx, 38, RULE_checkskillslot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(T__23);
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
		enterRule(_localctx, 40, RULE_checktitle);
		try {
			setState(356);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				match(T__24);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				match(T__25);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 3);
				{
				setState(354);
				match(T__26);
				setState(355);
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
		public ExprStringContext exprString() {
			return getRuleContext(ExprStringContext.class,0);
		}
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
		enterRule(_localctx, 42, RULE_encount);
		try {
			setState(363);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				match(T__27);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				match(T__28);
				setState(360);
				exprString();
				setState(361);
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
		public List<ExprIntContext> exprInt() {
			return getRuleContexts(ExprIntContext.class);
		}
		public ExprIntContext exprInt(int i) {
			return getRuleContext(ExprIntContext.class,i);
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
		enterRule(_localctx, 44, RULE_endevent);
		try {
			setState(372);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				match(T__31);
				setState(368);
				exprInt(0);
				setState(369);
				exprInt(0);
				setState(370);
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
		public List<ExprStringContext> exprString() {
			return getRuleContexts(ExprStringContext.class);
		}
		public ExprStringContext exprString(int i) {
			return getRuleContext(ExprStringContext.class,i);
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
		enterRule(_localctx, 46, RULE_endwindow);
		try {
			setState(384);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 3);
				{
				setState(376);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 4);
				{
				setState(377);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 5);
				{
				setState(378);
				match(T__36);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 6);
				{
				setState(379);
				match(T__37);
				setState(380);
				exprString();
				setState(381);
				exprString();
				setState(382);
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
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
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
		enterRule(_localctx, 48, RULE_equipitem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(T__38);
			setState(387);
			exprInt(0);
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
		enterRule(_localctx, 50, RULE_fame);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
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
		enterRule(_localctx, 52, RULE_floor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(T__40);
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
		enterRule(_localctx, 54, RULE_fp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_la = _input.LA(1);
			if ( !(_la==T__41 || _la==T__42) ) {
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
		public ExprStringContext exprString() {
			return getRuleContext(ExprStringContext.class,0);
		}
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
		enterRule(_localctx, 56, RULE_gaendwindow);
		try {
			setState(401);
			switch (_input.LA(1)) {
			case T__43:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				match(T__43);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				match(T__44);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 3);
				{
				setState(397);
				match(T__45);
				setState(398);
				exprString();
				setState(399);
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
		public List<ExprStringContext> exprString() {
			return getRuleContexts(ExprStringContext.class);
		}
		public ExprStringContext exprString(int i) {
			return getRuleContext(ExprStringContext.class,i);
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
		enterRule(_localctx, 58, RULE_gawindow);
		try {
			setState(409);
			switch (_input.LA(1)) {
			case T__46:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(T__46);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				match(T__47);
				setState(405);
				exprString();
				setState(406);
				exprString();
				setState(407);
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
		public List<ExprIntContext> exprInt() {
			return getRuleContexts(ExprIntContext.class);
		}
		public ExprIntContext exprInt(int i) {
			return getRuleContext(ExprIntContext.class,i);
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
		enterRule(_localctx, 60, RULE_giveitem);
		try {
			setState(421);
			switch (_input.LA(1)) {
			case T__48:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				match(T__48);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
				match(T__50);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 4);
				{
				setState(414);
				match(T__51);
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 5);
				{
				setState(415);
				match(T__52);
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 6);
				{
				setState(416);
				match(T__53);
				setState(417);
				exprInt(0);
				setState(418);
				exprInt(0);
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

	public static class Giveleak0itemContext extends ParserRuleContext {
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
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
		enterRule(_localctx, 62, RULE_giveleak0item);
		try {
			setState(429);
			switch (_input.LA(1)) {
			case T__54:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				match(T__54);
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				match(T__55);
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 3);
				{
				setState(425);
				match(T__56);
				setState(426);
				exprInt(0);
				setState(427);
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
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
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
		enterRule(_localctx, 64, RULE_giveleak1item);
		try {
			setState(439);
			switch (_input.LA(1)) {
			case T__57:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				match(T__57);
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				match(T__58);
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 3);
				{
				setState(433);
				match(T__59);
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 4);
				{
				setState(434);
				match(T__60);
				}
				break;
			case T__61:
				enterOuterAlt(_localctx, 5);
				{
				setState(435);
				match(T__61);
				setState(436);
				exprInt(0);
				setState(437);
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
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
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
		enterRule(_localctx, 66, RULE_givepet);
		try {
			setState(447);
			switch (_input.LA(1)) {
			case T__62:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				match(T__62);
				}
				break;
			case T__63:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				match(T__63);
				}
				break;
			case T__64:
				enterOuterAlt(_localctx, 3);
				{
				setState(443);
				match(T__64);
				setState(444);
				exprInt(0);
				setState(445);
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
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
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
		enterRule(_localctx, 68, RULE_giverecipe);
		try {
			setState(455);
			switch (_input.LA(1)) {
			case T__65:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				match(T__65);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				match(T__66);
				}
				break;
			case T__67:
				enterOuterAlt(_localctx, 3);
				{
				setState(451);
				match(T__67);
				setState(452);
				exprInt(0);
				setState(453);
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
		public List<ExprIntContext> exprInt() {
			return getRuleContexts(ExprIntContext.class);
		}
		public ExprIntContext exprInt(int i) {
			return getRuleContext(ExprIntContext.class,i);
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
		enterRule(_localctx, 70, RULE_givestackitem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(T__68);
			setState(458);
			exprInt(0);
			setState(459);
			exprInt(0);
			setState(460);
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
		enterRule(_localctx, 72, RULE_globalflag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(T__69);
			setState(463);
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
		public ExprStringContext exprString() {
			return getRuleContext(ExprStringContext.class,0);
		}
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
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
		enterRule(_localctx, 74, RULE_globaltimer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(T__70);
			setState(466);
			exprString();
			setState(467);
			exprInt(0);
			setState(468);
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
		enterRule(_localctx, 76, RULE_gold);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			_la = _input.LA(1);
			if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T__71 - 72)) | (1L << (T__72 - 72)) | (1L << (T__73 - 72)))) != 0)) ) {
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
		enterRule(_localctx, 78, RULE_gotob);
		try {
			setState(475);
			switch (_input.LA(1)) {
			case T__74:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				match(T__74);
				}
				break;
			case T__75:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				match(T__75);
				setState(474);
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
		enterRule(_localctx, 80, RULE_gotof);
		try {
			setState(480);
			switch (_input.LA(1)) {
			case T__76:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				match(T__76);
				}
				break;
			case T__77:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				match(T__77);
				setState(479);
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
		enterRule(_localctx, 82, RULE_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			_la = _input.LA(1);
			if ( !(_la==T__78 || _la==T__79) ) {
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
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
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
		enterRule(_localctx, 84, RULE_haveitem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(T__80);
			setState(485);
			exprInt(0);
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
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
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
		enterRule(_localctx, 86, RULE_haveleak0item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(T__81);
			setState(488);
			exprInt(0);
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
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
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
		enterRule(_localctx, 88, RULE_haveleak1item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(T__82);
			setState(491);
			exprInt(0);
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
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
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
		enterRule(_localctx, 90, RULE_havetitle);
		try {
			setState(497);
			switch (_input.LA(1)) {
			case T__83:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				match(T__83);
				}
				break;
			case T__84:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				match(T__84);
				}
				break;
			case T__85:
				enterOuterAlt(_localctx, 3);
				{
				setState(495);
				match(T__85);
				setState(496);
				exprInt(0);
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
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
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
		enterRule(_localctx, 92, RULE_houseid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(T__86);
			setState(500);
			exprInt(0);
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
		enterRule(_localctx, 94, RULE_imagetype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(T__87);
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
		enterRule(_localctx, 96, RULE_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			_la = _input.LA(1);
			if ( !(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (T__88 - 89)) | (1L << (T__89 - 89)) | (1L << (T__90 - 89)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(505);
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
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
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
		enterRule(_localctx, 98, RULE_itemcreatetime);
		try {
			setState(511);
			switch (_input.LA(1)) {
			case T__91:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				match(T__91);
				}
				break;
			case T__92:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				match(T__92);
				}
				break;
			case T__93:
				enterOuterAlt(_localctx, 3);
				{
				setState(509);
				match(T__93);
				setState(510);
				exprInt(0);
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
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
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
		enterRule(_localctx, 100, RULE_itemdur);
		try {
			setState(516);
			switch (_input.LA(1)) {
			case T__94:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				match(T__94);
				}
				break;
			case T__95:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				match(T__95);
				setState(515);
				exprInt(0);
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
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
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
		enterRule(_localctx, 102, RULE_itemdurper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(T__96);
			setState(519);
			exprInt(0);
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
		enterRule(_localctx, 104, RULE_itemspace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			_la = _input.LA(1);
			if ( !(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (T__97 - 98)) | (1L << (T__98 - 98)) | (1L << (T__99 - 98)))) != 0)) ) {
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
		enterRule(_localctx, 106, RULE_job);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			_la = _input.LA(1);
			if ( !(_la==T__100 || _la==T__101) ) {
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
		enterRule(_localctx, 108, RULE_jobancestry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			_la = _input.LA(1);
			if ( !(_la==T__102 || _la==T__103) ) {
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
		enterRule(_localctx, 110, RULE_jobrank);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			_la = _input.LA(1);
			if ( !(_la==T__104 || _la==T__105) ) {
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
		enterRule(_localctx, 112, RULE_killdrugdish);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(T__106);
			setState(530);
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
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
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
		enterRule(_localctx, 114, RULE_killitem);
		try {
			setState(539);
			switch (_input.LA(1)) {
			case T__107:
				enterOuterAlt(_localctx, 1);
				{
				setState(532);
				match(T__107);
				}
				break;
			case T__108:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				match(T__108);
				}
				break;
			case T__109:
				enterOuterAlt(_localctx, 3);
				{
				setState(534);
				match(T__109);
				}
				break;
			case T__110:
				enterOuterAlt(_localctx, 4);
				{
				setState(535);
				match(T__110);
				setState(536);
				exprInt(0);
				setState(537);
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
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
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
		enterRule(_localctx, 116, RULE_killitemall);
		try {
			setState(551);
			switch (_input.LA(1)) {
			case T__111:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				match(T__111);
				}
				break;
			case T__112:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				match(T__112);
				}
				break;
			case T__113:
				enterOuterAlt(_localctx, 3);
				{
				setState(543);
				match(T__113);
				}
				break;
			case T__114:
				enterOuterAlt(_localctx, 4);
				{
				setState(544);
				match(T__114);
				}
				break;
			case T__115:
				enterOuterAlt(_localctx, 5);
				{
				setState(545);
				match(T__115);
				}
				break;
			case T__116:
				enterOuterAlt(_localctx, 6);
				{
				setState(546);
				match(T__116);
				}
				break;
			case T__117:
				enterOuterAlt(_localctx, 7);
				{
				setState(547);
				match(T__117);
				setState(548);
				exprInt(0);
				setState(549);
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
		public List<ExprIntContext> exprInt() {
			return getRuleContexts(ExprIntContext.class);
		}
		public ExprIntContext exprInt(int i) {
			return getRuleContext(ExprIntContext.class,i);
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
		enterRule(_localctx, 118, RULE_killleak0item);
		try {
			setState(560);
			switch (_input.LA(1)) {
			case T__118:
				enterOuterAlt(_localctx, 1);
				{
				setState(553);
				match(T__118);
				}
				break;
			case T__119:
				enterOuterAlt(_localctx, 2);
				{
				setState(554);
				match(T__119);
				}
				break;
			case T__120:
				enterOuterAlt(_localctx, 3);
				{
				setState(555);
				match(T__120);
				setState(556);
				exprInt(0);
				setState(557);
				exprInt(0);
				setState(558);
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
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
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
		enterRule(_localctx, 120, RULE_killleak1item);
		try {
			setState(567);
			switch (_input.LA(1)) {
			case T__121:
				enterOuterAlt(_localctx, 1);
				{
				setState(562);
				match(T__121);
				}
				break;
			case T__122:
				enterOuterAlt(_localctx, 2);
				{
				setState(563);
				match(T__122);
				setState(564);
				exprInt(0);
				setState(565);
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
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
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
		enterRule(_localctx, 122, RULE_killpet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(T__123);
			setState(570);
			exprInt(0);
			setState(571);
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
		public List<ExprIntContext> exprInt() {
			return getRuleContexts(ExprIntContext.class);
		}
		public ExprIntContext exprInt(int i) {
			return getRuleContext(ExprIntContext.class,i);
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
		enterRule(_localctx, 124, RULE_killpeth);
		try {
			setState(580);
			switch (_input.LA(1)) {
			case T__124:
				enterOuterAlt(_localctx, 1);
				{
				setState(573);
				match(T__124);
				}
				break;
			case T__125:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				match(T__125);
				}
				break;
			case T__126:
				enterOuterAlt(_localctx, 3);
				{
				setState(575);
				match(T__126);
				setState(576);
				exprInt(0);
				setState(577);
				exprInt(0);
				setState(578);
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
		public List<ExprIntContext> exprInt() {
			return getRuleContexts(ExprIntContext.class);
		}
		public ExprIntContext exprInt(int i) {
			return getRuleContext(ExprIntContext.class,i);
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
		enterRule(_localctx, 126, RULE_killpetl);
		try {
			setState(589);
			switch (_input.LA(1)) {
			case T__127:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				match(T__127);
				}
				break;
			case T__128:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
				match(T__128);
				}
				break;
			case T__129:
				enterOuterAlt(_localctx, 3);
				{
				setState(584);
				match(T__129);
				setState(585);
				exprInt(0);
				setState(586);
				exprInt(0);
				setState(587);
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
		enterRule(_localctx, 128, RULE_leavegroup);
		try {
			setState(595);
			switch (_input.LA(1)) {
			case T__130:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				match(T__130);
				}
				break;
			case T__131:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				match(T__131);
				}
				break;
			case T__132:
				enterOuterAlt(_localctx, 3);
				{
				setState(593);
				match(T__132);
				setState(594);
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
		enterRule(_localctx, 130, RULE_level);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			_la = _input.LA(1);
			if ( !(_la==T__133 || _la==T__134) ) {
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
		enterRule(_localctx, 132, RULE_localcount);
		try {
			setState(602);
			switch (_input.LA(1)) {
			case T__135:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				match(T__135);
				}
				break;
			case T__136:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				match(T__136);
				setState(601);
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
		enterRule(_localctx, 134, RULE_localflag);
		try {
			setState(607);
			switch (_input.LA(1)) {
			case T__137:
				enterOuterAlt(_localctx, 1);
				{
				setState(604);
				match(T__137);
				}
				break;
			case T__138:
				enterOuterAlt(_localctx, 2);
				{
				setState(605);
				match(T__138);
				setState(606);
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
		enterRule(_localctx, 136, RULE_lp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(T__139);
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
		enterRule(_localctx, 138, RULE_maxfp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(T__140);
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
		enterRule(_localctx, 140, RULE_maxlp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
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

	public static class MessageContext extends ParserRuleContext {
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
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
		enterRule(_localctx, 142, RULE_message);
		try {
			setState(620);
			switch (_input.LA(1)) {
			case T__142:
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				match(T__142);
				}
				break;
			case T__143:
				enterOuterAlt(_localctx, 2);
				{
				setState(616);
				match(T__143);
				setState(617);
				exprInt(0);
				setState(618);
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
		enterRule(_localctx, 144, RULE_metamocount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(T__144);
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
		enterRule(_localctx, 146, RULE_next);
		try {
			setState(627);
			switch (_input.LA(1)) {
			case T__145:
				enterOuterAlt(_localctx, 1);
				{
				setState(624);
				match(T__145);
				}
				break;
			case T__146:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				match(T__146);
				setState(626);
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
		enterRule(_localctx, 148, RULE_no);
		try {
			setState(632);
			switch (_input.LA(1)) {
			case T__147:
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				match(T__147);
				}
				break;
			case T__148:
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
				match(T__148);
				setState(631);
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
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
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
		enterRule(_localctx, 150, RULE_nowevent);
		try {
			setState(638);
			switch (_input.LA(1)) {
			case T__149:
				enterOuterAlt(_localctx, 1);
				{
				setState(634);
				match(T__149);
				}
				break;
			case T__150:
				enterOuterAlt(_localctx, 2);
				{
				setState(635);
				match(T__150);
				}
				break;
			case T__151:
				enterOuterAlt(_localctx, 3);
				{
				setState(636);
				match(T__151);
				setState(637);
				exprInt(0);
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
		enterRule(_localctx, 152, RULE_nowtime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			_la = _input.LA(1);
			if ( !(((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (T__152 - 153)) | (1L << (T__153 - 153)) | (1L << (T__154 - 153)))) != 0)) ) {
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
		enterRule(_localctx, 154, RULE_ok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			match(T__155);
			setState(643);
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
		public List<ExprIntContext> exprInt() {
			return getRuleContexts(ExprIntContext.class);
		}
		public ExprIntContext exprInt(int i) {
			return getRuleContext(ExprIntContext.class,i);
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
		enterRule(_localctx, 156, RULE_pequipitem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(T__156);
			setState(646);
			exprInt(0);
			setState(647);
			exprInt(0);
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
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
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
		enterRule(_localctx, 158, RULE_petlevel);
		try {
			setState(653);
			switch (_input.LA(1)) {
			case T__157:
				enterOuterAlt(_localctx, 1);
				{
				setState(649);
				match(T__157);
				}
				break;
			case T__158:
				enterOuterAlt(_localctx, 2);
				{
				setState(650);
				match(T__158);
				}
				break;
			case T__159:
				enterOuterAlt(_localctx, 3);
				{
				setState(651);
				match(T__159);
				setState(652);
				exprInt(0);
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
		enterRule(_localctx, 160, RULE_petspace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			_la = _input.LA(1);
			if ( !(((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & ((1L << (T__160 - 161)) | (1L << (T__161 - 161)) | (1L << (T__162 - 161)) | (1L << (T__163 - 161)))) != 0)) ) {
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
		public List<ExprIntContext> exprInt() {
			return getRuleContexts(ExprIntContext.class);
		}
		public ExprIntContext exprInt(int i) {
			return getRuleContext(ExprIntContext.class,i);
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
		enterRule(_localctx, 162, RULE_phitem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			match(T__164);
			setState(658);
			exprInt(0);
			setState(659);
			exprInt(0);
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
		public List<ExprIntContext> exprInt() {
			return getRuleContexts(ExprIntContext.class);
		}
		public ExprIntContext exprInt(int i) {
			return getRuleContext(ExprIntContext.class,i);
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
		enterRule(_localctx, 164, RULE_playse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(T__165);
			setState(662);
			exprInt(0);
			setState(663);
			exprInt(0);
			setState(664);
			exprInt(0);
			setState(665);
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
		public List<ExprIntContext> exprInt() {
			return getRuleContexts(ExprIntContext.class);
		}
		public ExprIntContext exprInt(int i) {
			return getRuleContext(ExprIntContext.class,i);
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
		enterRule(_localctx, 166, RULE_random);
		try {
			setState(672);
			switch (_input.LA(1)) {
			case T__166:
				enterOuterAlt(_localctx, 1);
				{
				setState(667);
				match(T__166);
				}
				break;
			case T__167:
				enterOuterAlt(_localctx, 2);
				{
				setState(668);
				match(T__167);
				setState(669);
				exprInt(0);
				setState(670);
				exprInt(0);
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
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
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
		enterRule(_localctx, 168, RULE_setaction);
		try {
			setState(680);
			switch (_input.LA(1)) {
			case T__168:
				enterOuterAlt(_localctx, 1);
				{
				setState(674);
				match(T__168);
				}
				break;
			case T__169:
				enterOuterAlt(_localctx, 2);
				{
				setState(675);
				match(T__169);
				}
				break;
			case T__170:
				enterOuterAlt(_localctx, 3);
				{
				setState(676);
				match(T__170);
				setState(677);
				exprInt(0);
				setState(678);
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
		public ExprStringContext exprString() {
			return getRuleContext(ExprStringContext.class,0);
		}
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
		enterRule(_localctx, 170, RULE_setcharm);
		try {
			setState(687);
			switch (_input.LA(1)) {
			case T__171:
				enterOuterAlt(_localctx, 1);
				{
				setState(682);
				match(T__171);
				}
				break;
			case T__172:
				enterOuterAlt(_localctx, 2);
				{
				setState(683);
				match(T__172);
				setState(684);
				exprString();
				setState(685);
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
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
		public ExprStringContext exprString() {
			return getRuleContext(ExprStringContext.class,0);
		}
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
		enterRule(_localctx, 172, RULE_setdur);
		try {
			setState(696);
			switch (_input.LA(1)) {
			case T__173:
				enterOuterAlt(_localctx, 1);
				{
				setState(689);
				match(T__173);
				}
				break;
			case T__174:
				enterOuterAlt(_localctx, 2);
				{
				setState(690);
				match(T__174);
				}
				break;
			case T__175:
				enterOuterAlt(_localctx, 3);
				{
				setState(691);
				match(T__175);
				setState(692);
				exprInt(0);
				setState(693);
				exprString();
				setState(694);
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
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
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
		enterRule(_localctx, 174, RULE_setfeverflg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(T__176);
			setState(699);
			exprInt(0);
			setState(700);
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
		public List<ExprIntContext> exprInt() {
			return getRuleContexts(ExprIntContext.class);
		}
		public ExprIntContext exprInt(int i) {
			return getRuleContext(ExprIntContext.class,i);
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
		enterRule(_localctx, 176, RULE_sethouse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			match(T__177);
			setState(703);
			exprInt(0);
			setState(704);
			exprInt(0);
			setState(705);
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
		public List<ExprIntContext> exprInt() {
			return getRuleContexts(ExprIntContext.class);
		}
		public ExprIntContext exprInt(int i) {
			return getRuleContext(ExprIntContext.class,i);
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
		enterRule(_localctx, 178, RULE_sethouselimit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(T__178);
			setState(708);
			exprInt(0);
			setState(709);
			exprInt(0);
			setState(710);
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
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
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
		enterRule(_localctx, 180, RULE_setlevel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			match(T__179);
			setState(713);
			exprInt(0);
			setState(714);
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
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
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
		enterRule(_localctx, 182, RULE_setloginpoint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			match(T__180);
			setState(717);
			exprInt(0);
			setState(718);
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
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
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
		enterRule(_localctx, 184, RULE_setlp);
		try {
			setState(725);
			switch (_input.LA(1)) {
			case T__181:
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
				match(T__181);
				}
				break;
			case T__182:
				enterOuterAlt(_localctx, 2);
				{
				setState(721);
				match(T__182);
				setState(722);
				exprInt(0);
				setState(723);
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
		public List<ExprIntContext> exprInt() {
			return getRuleContexts(ExprIntContext.class);
		}
		public ExprIntContext exprInt(int i) {
			return getRuleContext(ExprIntContext.class,i);
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
		enterRule(_localctx, 186, RULE_setobject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			match(T__183);
			setState(728);
			exprInt(0);
			setState(729);
			exprInt(0);
			setState(730);
			exprInt(0);
			setState(731);
			exprInt(0);
			setState(732);
			exprInt(0);
			setState(733);
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
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
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
		enterRule(_localctx, 188, RULE_setvisitor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(T__184);
			setState(736);
			exprInt(0);
			setState(737);
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
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
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
		enterRule(_localctx, 190, RULE_shapenext);
		try {
			setState(744);
			switch (_input.LA(1)) {
			case T__185:
				enterOuterAlt(_localctx, 1);
				{
				setState(739);
				match(T__185);
				}
				break;
			case T__186:
				enterOuterAlt(_localctx, 2);
				{
				setState(740);
				match(T__186);
				setState(741);
				exprInt(0);
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

	public static class ShipchardownContext extends ParserRuleContext {
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
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
		enterRule(_localctx, 192, RULE_shipchardown);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			match(T__187);
			setState(747);
			exprInt(0);
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
		public List<ExprIntContext> exprInt() {
			return getRuleContexts(ExprIntContext.class);
		}
		public ExprIntContext exprInt(int i) {
			return getRuleContext(ExprIntContext.class,i);
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
		enterRule(_localctx, 194, RULE_shipchartake);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			match(T__188);
			setState(750);
			exprInt(0);
			setState(751);
			exprInt(0);
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
		enterRule(_localctx, 196, RULE_shipgetstoptime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(T__189);
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
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
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
		enterRule(_localctx, 198, RULE_skilllevel);
		try {
			setState(759);
			switch (_input.LA(1)) {
			case T__190:
				enterOuterAlt(_localctx, 1);
				{
				setState(755);
				match(T__190);
				}
				break;
			case T__191:
				enterOuterAlt(_localctx, 2);
				{
				setState(756);
				match(T__191);
				}
				break;
			case T__192:
				enterOuterAlt(_localctx, 3);
				{
				setState(757);
				match(T__192);
				setState(758);
				exprInt(0);
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
		enterRule(_localctx, 200, RULE_stackitemspace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			match(T__193);
			setState(762);
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
		public ExprStringContext exprString() {
			return getRuleContext(ExprStringContext.class,0);
		}
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
		enterRule(_localctx, 202, RULE_strcmpchat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			_la = _input.LA(1);
			if ( !(_la==T__194 || _la==T__195) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(765);
			_la = _input.LA(1);
			if ( !(_la==ASSIGNEQUAL || _la==EQUAL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(766);
			exprString();
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
		enterRule(_localctx, 204, RULE_strstrchat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
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

	public static class SystemmessageContext extends ParserRuleContext {
		public ExprStringContext exprString() {
			return getRuleContext(ExprStringContext.class,0);
		}
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
		enterRule(_localctx, 206, RULE_systemmessage);
		try {
			setState(775);
			switch (_input.LA(1)) {
			case T__197:
				enterOuterAlt(_localctx, 1);
				{
				setState(770);
				match(T__197);
				}
				break;
			case T__198:
				enterOuterAlt(_localctx, 2);
				{
				setState(771);
				match(T__198);
				setState(772);
				exprString();
				setState(773);
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
		enterRule(_localctx, 208, RULE_trueimage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(T__199);
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
		public List<ExprStringContext> exprString() {
			return getRuleContexts(ExprStringContext.class);
		}
		public ExprStringContext exprString(int i) {
			return getRuleContext(ExprStringContext.class,i);
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
		enterRule(_localctx, 210, RULE_warp);
		try {
			setState(786);
			switch (_input.LA(1)) {
			case T__200:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				match(T__200);
				}
				break;
			case T__201:
				enterOuterAlt(_localctx, 2);
				{
				setState(780);
				match(T__201);
				setState(781);
				exprString();
				setState(782);
				exprString();
				setState(783);
				exprString();
				setState(784);
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
		enterRule(_localctx, 212, RULE_window_no);
		try {
			setState(793);
			switch (_input.LA(1)) {
			case T__202:
				enterOuterAlt(_localctx, 1);
				{
				setState(788);
				match(T__202);
				}
				break;
			case T__203:
				enterOuterAlt(_localctx, 2);
				{
				setState(789);
				match(T__203);
				}
				break;
			case T__204:
				enterOuterAlt(_localctx, 3);
				{
				setState(790);
				match(T__204);
				}
				break;
			case T__205:
				enterOuterAlt(_localctx, 4);
				{
				setState(791);
				match(T__205);
				setState(792);
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
		enterRule(_localctx, 214, RULE_window_ok);
		try {
			setState(802);
			switch (_input.LA(1)) {
			case T__206:
				enterOuterAlt(_localctx, 1);
				{
				setState(795);
				match(T__206);
				}
				break;
			case T__207:
				enterOuterAlt(_localctx, 2);
				{
				setState(796);
				match(T__207);
				}
				break;
			case T__208:
				enterOuterAlt(_localctx, 3);
				{
				setState(797);
				match(T__208);
				}
				break;
			case T__209:
				enterOuterAlt(_localctx, 4);
				{
				setState(798);
				match(T__209);
				}
				break;
			case T__210:
				enterOuterAlt(_localctx, 5);
				{
				setState(799);
				match(T__210);
				}
				break;
			case T__211:
				enterOuterAlt(_localctx, 6);
				{
				setState(800);
				match(T__211);
				setState(801);
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
		public ExprBooleanContext exprBoolean() {
			return getRuleContext(ExprBooleanContext.class,0);
		}
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
		enterRule(_localctx, 216, RULE_window_yes);
		try {
			setState(812);
			switch (_input.LA(1)) {
			case T__212:
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				match(T__212);
				}
				break;
			case T__213:
				enterOuterAlt(_localctx, 2);
				{
				setState(805);
				match(T__213);
				}
				break;
			case T__214:
				enterOuterAlt(_localctx, 3);
				{
				setState(806);
				match(T__214);
				}
				break;
			case T__215:
				enterOuterAlt(_localctx, 4);
				{
				setState(807);
				match(T__215);
				}
				break;
			case T__216:
				enterOuterAlt(_localctx, 5);
				{
				setState(808);
				match(T__216);
				setState(809);
				exprBoolean(0);
				setState(810);
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
		enterRule(_localctx, 218, RULE_xpos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			_la = _input.LA(1);
			if ( !(((((_la - 218)) & ~0x3f) == 0 && ((1L << (_la - 218)) & ((1L << (T__217 - 218)) | (1L << (T__218 - 218)) | (1L << (T__219 - 218)))) != 0)) ) {
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
		public ExprBooleanContext exprBoolean() {
			return getRuleContext(ExprBooleanContext.class,0);
		}
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
		enterRule(_localctx, 220, RULE_yes);
		try {
			setState(821);
			switch (_input.LA(1)) {
			case T__220:
				enterOuterAlt(_localctx, 1);
				{
				setState(816);
				match(T__220);
				}
				break;
			case T__221:
				enterOuterAlt(_localctx, 2);
				{
				setState(817);
				match(T__221);
				setState(818);
				exprBoolean(0);
				setState(819);
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

	public static class MultiCOMMONContext extends ParserRuleContext {
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
		public MultiCOMMONContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiCOMMON; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterMultiCOMMON(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitMultiCOMMON(this);
		}
	}

	public final MultiCOMMONContext multiCOMMON() throws RecognitionException {
		MultiCOMMONContext _localctx = new MultiCOMMONContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_multiCOMMON);
		try {
			setState(882);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(823);
				addfeversec();
				}
				break;
			case T__4:
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(824);
				addgold();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(825);
				addgoldlevel();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(826);
				addluck();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(827);
				addskillslot();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 6);
				{
				setState(828);
				addstampcount();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 7);
				{
				setState(829);
				block();
				}
				break;
			case T__17:
			case T__18:
			case T__19:
				enterOuterAlt(_localctx, 8);
				{
				setState(830);
				changepal();
				}
				break;
			case T__24:
			case T__25:
			case T__26:
				enterOuterAlt(_localctx, 9);
				{
				setState(831);
				checktitle();
				}
				break;
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 10);
				{
				setState(832);
				encount();
				}
				break;
			case T__29:
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 11);
				{
				setState(833);
				endevent();
				}
				break;
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 12);
				{
				setState(834);
				endwindow();
				}
				break;
			case T__43:
			case T__44:
			case T__45:
				enterOuterAlt(_localctx, 13);
				{
				setState(835);
				gaendwindow();
				}
				break;
			case T__46:
			case T__47:
				enterOuterAlt(_localctx, 14);
				{
				setState(836);
				gawindow();
				}
				break;
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
				enterOuterAlt(_localctx, 15);
				{
				setState(837);
				giveitem();
				}
				break;
			case T__54:
			case T__55:
			case T__56:
				enterOuterAlt(_localctx, 16);
				{
				setState(838);
				giveleak0item();
				}
				break;
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
				enterOuterAlt(_localctx, 17);
				{
				setState(839);
				giveleak1item();
				}
				break;
			case T__62:
			case T__63:
			case T__64:
				enterOuterAlt(_localctx, 18);
				{
				setState(840);
				givepet();
				}
				break;
			case T__65:
			case T__66:
			case T__67:
				enterOuterAlt(_localctx, 19);
				{
				setState(841);
				giverecipe();
				}
				break;
			case T__68:
				enterOuterAlt(_localctx, 20);
				{
				setState(842);
				givestackitem();
				}
				break;
			case T__69:
				enterOuterAlt(_localctx, 21);
				{
				setState(843);
				globalflag();
				}
				break;
			case T__70:
				enterOuterAlt(_localctx, 22);
				{
				setState(844);
				globaltimer();
				}
				break;
			case T__74:
			case T__75:
				enterOuterAlt(_localctx, 23);
				{
				setState(845);
				gotob();
				}
				break;
			case T__76:
			case T__77:
				enterOuterAlt(_localctx, 24);
				{
				setState(846);
				gotof();
				}
				break;
			case T__106:
				enterOuterAlt(_localctx, 25);
				{
				setState(847);
				killdrugdish();
				}
				break;
			case T__107:
			case T__108:
			case T__109:
			case T__110:
				enterOuterAlt(_localctx, 26);
				{
				setState(848);
				killitem();
				}
				break;
			case T__111:
			case T__112:
			case T__113:
			case T__114:
			case T__115:
			case T__116:
			case T__117:
				enterOuterAlt(_localctx, 27);
				{
				setState(849);
				killitemall();
				}
				break;
			case T__118:
			case T__119:
			case T__120:
				enterOuterAlt(_localctx, 28);
				{
				setState(850);
				killleak0item();
				}
				break;
			case T__121:
			case T__122:
				enterOuterAlt(_localctx, 29);
				{
				setState(851);
				killleak1item();
				}
				break;
			case T__123:
				enterOuterAlt(_localctx, 30);
				{
				setState(852);
				killpet();
				}
				break;
			case T__124:
			case T__125:
			case T__126:
				enterOuterAlt(_localctx, 31);
				{
				setState(853);
				killpeth();
				}
				break;
			case T__127:
			case T__128:
			case T__129:
				enterOuterAlt(_localctx, 32);
				{
				setState(854);
				killpetl();
				}
				break;
			case T__130:
			case T__131:
			case T__132:
				enterOuterAlt(_localctx, 33);
				{
				setState(855);
				leavegroup();
				}
				break;
			case T__135:
			case T__136:
				enterOuterAlt(_localctx, 34);
				{
				setState(856);
				localcount();
				}
				break;
			case T__137:
			case T__138:
				enterOuterAlt(_localctx, 35);
				{
				setState(857);
				localflag();
				}
				break;
			case T__142:
			case T__143:
				enterOuterAlt(_localctx, 36);
				{
				setState(858);
				message();
				}
				break;
			case T__145:
			case T__146:
				enterOuterAlt(_localctx, 37);
				{
				setState(859);
				next();
				}
				break;
			case T__147:
			case T__148:
				enterOuterAlt(_localctx, 38);
				{
				setState(860);
				no();
				}
				break;
			case T__155:
				enterOuterAlt(_localctx, 39);
				{
				setState(861);
				ok();
				}
				break;
			case T__165:
				enterOuterAlt(_localctx, 40);
				{
				setState(862);
				playse();
				}
				break;
			case T__168:
			case T__169:
			case T__170:
				enterOuterAlt(_localctx, 41);
				{
				setState(863);
				setaction();
				}
				break;
			case T__171:
			case T__172:
				enterOuterAlt(_localctx, 42);
				{
				setState(864);
				setcharm();
				}
				break;
			case T__173:
			case T__174:
			case T__175:
				enterOuterAlt(_localctx, 43);
				{
				setState(865);
				setdur();
				}
				break;
			case T__176:
				enterOuterAlt(_localctx, 44);
				{
				setState(866);
				setfeverflg();
				}
				break;
			case T__177:
				enterOuterAlt(_localctx, 45);
				{
				setState(867);
				sethouse();
				}
				break;
			case T__178:
				enterOuterAlt(_localctx, 46);
				{
				setState(868);
				sethouselimit();
				}
				break;
			case T__179:
				enterOuterAlt(_localctx, 47);
				{
				setState(869);
				setlevel();
				}
				break;
			case T__180:
				enterOuterAlt(_localctx, 48);
				{
				setState(870);
				setloginpoint();
				}
				break;
			case T__181:
			case T__182:
				enterOuterAlt(_localctx, 49);
				{
				setState(871);
				setlp();
				}
				break;
			case T__183:
				enterOuterAlt(_localctx, 50);
				{
				setState(872);
				setobject();
				}
				break;
			case T__184:
				enterOuterAlt(_localctx, 51);
				{
				setState(873);
				setvisitor();
				}
				break;
			case T__185:
			case T__186:
				enterOuterAlt(_localctx, 52);
				{
				setState(874);
				shapenext();
				}
				break;
			case T__193:
				enterOuterAlt(_localctx, 53);
				{
				setState(875);
				stackitemspace();
				}
				break;
			case T__197:
			case T__198:
				enterOuterAlt(_localctx, 54);
				{
				setState(876);
				systemmessage();
				}
				break;
			case T__200:
			case T__201:
				enterOuterAlt(_localctx, 55);
				{
				setState(877);
				warp();
				}
				break;
			case T__202:
			case T__203:
			case T__204:
			case T__205:
				enterOuterAlt(_localctx, 56);
				{
				setState(878);
				window_no();
				}
				break;
			case T__206:
			case T__207:
			case T__208:
			case T__209:
			case T__210:
			case T__211:
				enterOuterAlt(_localctx, 57);
				{
				setState(879);
				window_ok();
				}
				break;
			case T__212:
			case T__213:
			case T__214:
			case T__215:
			case T__216:
				enterOuterAlt(_localctx, 58);
				{
				setState(880);
				window_yes();
				}
				break;
			case T__220:
			case T__221:
				enterOuterAlt(_localctx, 59);
				{
				setState(881);
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

	public static class MultiINTContext extends ParserRuleContext {
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
		public MultiINTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiINT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterMultiINT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitMultiINT(this);
		}
	}

	public final MultiINTContext multiINT() throws RecognitionException {
		MultiINTContext _localctx = new MultiINTContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_multiINT);
		try {
			setState(921);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(884);
				bimage();
				}
				break;
			case T__13:
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(885);
				bbimage();
				}
				break;
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 3);
				{
				setState(886);
				checkitemcategory();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 4);
				{
				setState(887);
				checkrealtime();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 5);
				{
				setState(888);
				checkskillslot();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 6);
				{
				setState(889);
				fame();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 7);
				{
				setState(890);
				floor();
				}
				break;
			case T__41:
			case T__42:
				enterOuterAlt(_localctx, 8);
				{
				setState(891);
				fp();
				}
				break;
			case T__71:
			case T__72:
			case T__73:
				enterOuterAlt(_localctx, 9);
				{
				setState(892);
				gold();
				}
				break;
			case T__78:
			case T__79:
				enterOuterAlt(_localctx, 10);
				{
				setState(893);
				group();
				}
				break;
			case T__87:
				enterOuterAlt(_localctx, 11);
				{
				setState(894);
				imagetype();
				}
				break;
			case T__88:
			case T__89:
			case T__90:
				enterOuterAlt(_localctx, 12);
				{
				setState(895);
				item();
				}
				break;
			case T__91:
			case T__92:
			case T__93:
				enterOuterAlt(_localctx, 13);
				{
				setState(896);
				itemcreatetime();
				}
				break;
			case T__94:
			case T__95:
				enterOuterAlt(_localctx, 14);
				{
				setState(897);
				itemdur();
				}
				break;
			case T__96:
				enterOuterAlt(_localctx, 15);
				{
				setState(898);
				itemdurper();
				}
				break;
			case T__97:
			case T__98:
			case T__99:
				enterOuterAlt(_localctx, 16);
				{
				setState(899);
				itemspace();
				}
				break;
			case T__100:
			case T__101:
				enterOuterAlt(_localctx, 17);
				{
				setState(900);
				job();
				}
				break;
			case T__102:
			case T__103:
				enterOuterAlt(_localctx, 18);
				{
				setState(901);
				jobancestry();
				}
				break;
			case T__104:
			case T__105:
				enterOuterAlt(_localctx, 19);
				{
				setState(902);
				jobrank();
				}
				break;
			case T__133:
			case T__134:
				enterOuterAlt(_localctx, 20);
				{
				setState(903);
				level();
				}
				break;
			case T__139:
				enterOuterAlt(_localctx, 21);
				{
				setState(904);
				lp();
				}
				break;
			case T__140:
				enterOuterAlt(_localctx, 22);
				{
				setState(905);
				maxfp();
				}
				break;
			case T__141:
				enterOuterAlt(_localctx, 23);
				{
				setState(906);
				maxlp();
				}
				break;
			case T__144:
				enterOuterAlt(_localctx, 24);
				{
				setState(907);
				metamocount();
				}
				break;
			case T__149:
			case T__150:
			case T__151:
				enterOuterAlt(_localctx, 25);
				{
				setState(908);
				nowevent();
				}
				break;
			case T__152:
			case T__153:
			case T__154:
				enterOuterAlt(_localctx, 26);
				{
				setState(909);
				nowtime();
				}
				break;
			case T__156:
				enterOuterAlt(_localctx, 27);
				{
				setState(910);
				pequipitem();
				}
				break;
			case T__157:
			case T__158:
			case T__159:
				enterOuterAlt(_localctx, 28);
				{
				setState(911);
				petlevel();
				}
				break;
			case T__160:
			case T__161:
			case T__162:
			case T__163:
				enterOuterAlt(_localctx, 29);
				{
				setState(912);
				petspace();
				}
				break;
			case T__164:
				enterOuterAlt(_localctx, 30);
				{
				setState(913);
				phitem();
				}
				break;
			case T__166:
			case T__167:
				enterOuterAlt(_localctx, 31);
				{
				setState(914);
				random();
				}
				break;
			case T__187:
				enterOuterAlt(_localctx, 32);
				{
				setState(915);
				shipchardown();
				}
				break;
			case T__188:
				enterOuterAlt(_localctx, 33);
				{
				setState(916);
				shipchartake();
				}
				break;
			case T__189:
				enterOuterAlt(_localctx, 34);
				{
				setState(917);
				shipgetstoptime();
				}
				break;
			case T__190:
			case T__191:
			case T__192:
				enterOuterAlt(_localctx, 35);
				{
				setState(918);
				skilllevel();
				}
				break;
			case T__199:
				enterOuterAlt(_localctx, 36);
				{
				setState(919);
				trueimage();
				}
				break;
			case T__217:
			case T__218:
			case T__219:
				enterOuterAlt(_localctx, 37);
				{
				setState(920);
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

	public static class MultiBOOLEANContext extends ParserRuleContext {
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
		public MultiBOOLEANContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiBOOLEAN; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).enterMultiBOOLEAN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMSVListener ) ((GMSVListener)listener).exitMultiBOOLEAN(this);
		}
	}

	public final MultiBOOLEANContext multiBOOLEAN() throws RecognitionException {
		MultiBOOLEANContext _localctx = new MultiBOOLEANContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_multiBOOLEAN);
		try {
			setState(931);
			switch (_input.LA(1)) {
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(923);
				equipitem();
				}
				break;
			case T__80:
				enterOuterAlt(_localctx, 2);
				{
				setState(924);
				haveitem();
				}
				break;
			case T__81:
				enterOuterAlt(_localctx, 3);
				{
				setState(925);
				haveleak0item();
				}
				break;
			case T__82:
				enterOuterAlt(_localctx, 4);
				{
				setState(926);
				haveleak1item();
				}
				break;
			case T__83:
			case T__84:
			case T__85:
				enterOuterAlt(_localctx, 5);
				{
				setState(927);
				havetitle();
				}
				break;
			case T__86:
				enterOuterAlt(_localctx, 6);
				{
				setState(928);
				houseid();
				}
				break;
			case T__194:
			case T__195:
				enterOuterAlt(_localctx, 7);
				{
				setState(929);
				strcmpchat();
				}
				break;
			case T__196:
				enterOuterAlt(_localctx, 8);
				{
				setState(930);
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
		case 2:
			return exprBoolean_sempred((ExprBooleanContext)_localctx, predIndex);
		case 3:
			return exprInt_sempred((ExprIntContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprBoolean_sempred(ExprBooleanContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean exprInt_sempred(ExprIntContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0108\u03a8\4\2\t"+
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
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\3\2\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00f7\n\4\3\4\3\4\3\4"+
		"\7\4\u00fc\n\4\f\4\16\4\u00ff\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"\u0109\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0111\n\5\f\5\16\5\u0114\13\5\3"+
		"\6\6\6\u0117\n\6\r\6\16\6\u0118\3\6\5\6\u011c\n\6\3\7\7\7\u011f\n\7\f"+
		"\7\16\7\u0122\13\7\3\b\3\b\3\b\3\b\5\b\u0128\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u0130\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0138\n\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5"+
		"\22\u015a\n\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\5\26\u0167\n\26\3\27\3\27\3\27\3\27\3\27\5\27\u016e\n\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\5\30\u0177\n\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u0183\n\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0194\n\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u019c\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u01a8"+
		"\n \3!\3!\3!\3!\3!\3!\5!\u01b0\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\""+
		"\u01ba\n\"\3#\3#\3#\3#\3#\3#\5#\u01c2\n#\3$\3$\3$\3$\3$\3$\5$\u01ca\n"+
		"$\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3)\5)\u01de"+
		"\n)\3*\3*\3*\5*\u01e3\n*\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/"+
		"\5/\u01f4\n/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3"+
		"\63\5\63\u0202\n\63\3\64\3\64\3\64\5\64\u0207\n\64\3\65\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\38\38\39\39\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\5;\u021e\n;"+
		"\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u022a\n<\3=\3=\3=\3=\3=\3=\3=\5=\u0233"+
		"\n=\3>\3>\3>\3>\3>\5>\u023a\n>\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\5@\u0247"+
		"\n@\3A\3A\3A\3A\3A\3A\3A\5A\u0250\nA\3B\3B\3B\3B\5B\u0256\nB\3C\3C\3D"+
		"\3D\3D\5D\u025d\nD\3E\3E\3E\5E\u0262\nE\3F\3F\3G\3G\3H\3H\3I\3I\3I\3I"+
		"\3I\5I\u026f\nI\3J\3J\3K\3K\3K\5K\u0276\nK\3L\3L\3L\5L\u027b\nL\3M\3M"+
		"\3M\3M\5M\u0281\nM\3N\3N\3O\3O\3O\3P\3P\3P\3P\3Q\3Q\3Q\3Q\5Q\u0290\nQ"+
		"\3R\3R\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\5U\u02a3\nU\3V\3V"+
		"\3V\3V\3V\3V\5V\u02ab\nV\3W\3W\3W\3W\3W\5W\u02b2\nW\3X\3X\3X\3X\3X\3X"+
		"\3X\5X\u02bb\nX\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3\\\3\\\3\\"+
		"\3\\\3]\3]\3]\3]\3^\3^\3^\3^\3^\5^\u02d8\n^\3_\3_\3_\3_\3_\3_\3_\3_\3"+
		"`\3`\3`\3`\3a\3a\3a\3a\3a\5a\u02eb\na\3b\3b\3b\3c\3c\3c\3c\3d\3d\3e\3"+
		"e\3e\3e\5e\u02fa\ne\3f\3f\3f\3g\3g\3g\3g\3h\3h\3i\3i\3i\3i\3i\5i\u030a"+
		"\ni\3j\3j\3k\3k\3k\3k\3k\3k\3k\5k\u0315\nk\3l\3l\3l\3l\3l\5l\u031c\nl"+
		"\3m\3m\3m\3m\3m\3m\3m\5m\u0325\nm\3n\3n\3n\3n\3n\3n\3n\3n\5n\u032f\nn"+
		"\3o\3o\3p\3p\3p\3p\3p\5p\u0338\np\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\3q\5q\u0375\nq\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r"+
		"\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\5r\u039c\nr"+
		"\3s\3s\3s\3s\3s\3s\3s\3s\5s\u03a6\ns\3s\2\4\6\bt\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\2\27\4\2\u00f3\u00f8\u0106\u0106\3\2\u0107\u0108"+
		"\4\2\u00f9\u00f9\u00fc\u00fd\3\2\u00fa\u00fb\3\2\16\17\3\2\20\22\3\2\27"+
		"\30\3\2,-\3\2JL\3\2QR\3\2[]\3\2df\3\2gh\3\2ij\3\2kl\3\2\u0088\u0089\3"+
		"\2\u009b\u009d\3\2\u00a3\u00a6\3\2\u00c5\u00c6\4\2\u00f2\u00f2\u0106\u0106"+
		"\3\2\u00dc\u00de\u0404\2\u00e6\3\2\2\2\4\u00e9\3\2\2\2\6\u00f6\3\2\2\2"+
		"\b\u0108\3\2\2\2\n\u011b\3\2\2\2\f\u0120\3\2\2\2\16\u0123\3\2\2\2\20\u012f"+
		"\3\2\2\2\22\u0137\3\2\2\2\24\u0139\3\2\2\2\26\u013c\3\2\2\2\30\u0141\3"+
		"\2\2\2\32\u0144\3\2\2\2\34\u0149\3\2\2\2\36\u014b\3\2\2\2 \u014d\3\2\2"+
		"\2\"\u0159\3\2\2\2$\u015b\3\2\2\2&\u015d\3\2\2\2(\u0160\3\2\2\2*\u0166"+
		"\3\2\2\2,\u016d\3\2\2\2.\u0176\3\2\2\2\60\u0182\3\2\2\2\62\u0184\3\2\2"+
		"\2\64\u0187\3\2\2\2\66\u0189\3\2\2\28\u018b\3\2\2\2:\u0193\3\2\2\2<\u019b"+
		"\3\2\2\2>\u01a7\3\2\2\2@\u01af\3\2\2\2B\u01b9\3\2\2\2D\u01c1\3\2\2\2F"+
		"\u01c9\3\2\2\2H\u01cb\3\2\2\2J\u01d0\3\2\2\2L\u01d3\3\2\2\2N\u01d8\3\2"+
		"\2\2P\u01dd\3\2\2\2R\u01e2\3\2\2\2T\u01e4\3\2\2\2V\u01e6\3\2\2\2X\u01e9"+
		"\3\2\2\2Z\u01ec\3\2\2\2\\\u01f3\3\2\2\2^\u01f5\3\2\2\2`\u01f8\3\2\2\2"+
		"b\u01fa\3\2\2\2d\u0201\3\2\2\2f\u0206\3\2\2\2h\u0208\3\2\2\2j\u020b\3"+
		"\2\2\2l\u020d\3\2\2\2n\u020f\3\2\2\2p\u0211\3\2\2\2r\u0213\3\2\2\2t\u021d"+
		"\3\2\2\2v\u0229\3\2\2\2x\u0232\3\2\2\2z\u0239\3\2\2\2|\u023b\3\2\2\2~"+
		"\u0246\3\2\2\2\u0080\u024f\3\2\2\2\u0082\u0255\3\2\2\2\u0084\u0257\3\2"+
		"\2\2\u0086\u025c\3\2\2\2\u0088\u0261\3\2\2\2\u008a\u0263\3\2\2\2\u008c"+
		"\u0265\3\2\2\2\u008e\u0267\3\2\2\2\u0090\u026e\3\2\2\2\u0092\u0270\3\2"+
		"\2\2\u0094\u0275\3\2\2\2\u0096\u027a\3\2\2\2\u0098\u0280\3\2\2\2\u009a"+
		"\u0282\3\2\2\2\u009c\u0284\3\2\2\2\u009e\u0287\3\2\2\2\u00a0\u028f\3\2"+
		"\2\2\u00a2\u0291\3\2\2\2\u00a4\u0293\3\2\2\2\u00a6\u0297\3\2\2\2\u00a8"+
		"\u02a2\3\2\2\2\u00aa\u02aa\3\2\2\2\u00ac\u02b1\3\2\2\2\u00ae\u02ba\3\2"+
		"\2\2\u00b0\u02bc\3\2\2\2\u00b2\u02c0\3\2\2\2\u00b4\u02c5\3\2\2\2\u00b6"+
		"\u02ca\3\2\2\2\u00b8\u02ce\3\2\2\2\u00ba\u02d7\3\2\2\2\u00bc\u02d9\3\2"+
		"\2\2\u00be\u02e1\3\2\2\2\u00c0\u02ea\3\2\2\2\u00c2\u02ec\3\2\2\2\u00c4"+
		"\u02ef\3\2\2\2\u00c6\u02f3\3\2\2\2\u00c8\u02f9\3\2\2\2\u00ca\u02fb\3\2"+
		"\2\2\u00cc\u02fe\3\2\2\2\u00ce\u0302\3\2\2\2\u00d0\u0309\3\2\2\2\u00d2"+
		"\u030b\3\2\2\2\u00d4\u0314\3\2\2\2\u00d6\u031b\3\2\2\2\u00d8\u0324\3\2"+
		"\2\2\u00da\u032e\3\2\2\2\u00dc\u0330\3\2\2\2\u00de\u0337\3\2\2\2\u00e0"+
		"\u0374\3\2\2\2\u00e2\u039b\3\2\2\2\u00e4\u03a5\3\2\2\2\u00e6\u00e7\7\u00e6"+
		"\2\2\u00e7\u00e8\7\u00e3\2\2\u00e8\3\3\2\2\2\u00e9\u00ea\7\u00e5\2\2\u00ea"+
		"\5\3\2\2\2\u00eb\u00ec\b\4\1\2\u00ec\u00ed\5\b\5\2\u00ed\u00ee\t\2\2\2"+
		"\u00ee\u00ef\5\b\5\2\u00ef\u00f7\3\2\2\2\u00f0\u00f7\5\u00e4s\2\u00f1"+
		"\u00f7\7\u00e1\2\2\u00f2\u00f3\7\u00ea\2\2\u00f3\u00f4\5\6\4\2\u00f4\u00f5"+
		"\7\u00eb\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00eb\3\2\2\2\u00f6\u00f0\3\2\2"+
		"\2\u00f6\u00f1\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f7\u00fd\3\2\2\2\u00f8\u00f9"+
		"\f\6\2\2\u00f9\u00fa\t\3\2\2\u00fa\u00fc\5\6\4\7\u00fb\u00f8\3\2\2\2\u00fc"+
		"\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\7\3\2\2\2"+
		"\u00ff\u00fd\3\2\2\2\u0100\u0101\b\5\1\2\u0101\u0109\5\2\2\2\u0102\u0109"+
		"\7\u00e3\2\2\u0103\u0109\5\u00e2r\2\u0104\u0105\7\u00ea\2\2\u0105\u0106"+
		"\5\b\5\2\u0106\u0107\7\u00eb\2\2\u0107\u0109\3\2\2\2\u0108\u0100\3\2\2"+
		"\2\u0108\u0102\3\2\2\2\u0108\u0103\3\2\2\2\u0108\u0104\3\2\2\2\u0109\u0112"+
		"\3\2\2\2\u010a\u010b\f\b\2\2\u010b\u010c\t\4\2\2\u010c\u0111\5\b\5\t\u010d"+
		"\u010e\f\7\2\2\u010e\u010f\t\5\2\2\u010f\u0111\5\b\5\b\u0110\u010a\3\2"+
		"\2\2\u0110\u010d\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\t\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0117\5\16\b"+
		"\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119"+
		"\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u011c\5\f\7\2\u011b\u0116\3\2\2\2\u011b"+
		"\u011a\3\2\2\2\u011c\13\3\2\2\2\u011d\u011f\5\u00e0q\2\u011e\u011d\3\2"+
		"\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\r\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\5 \21\2\u0124\u0125\5\6\4\2"+
		"\u0125\u0127\5\f\7\2\u0126\u0128\7\3\2\2\u0127\u0126\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0128\17\3\2\2\2\u0129\u0130\7\4\2\2\u012a\u0130\7\5\2\2\u012b"+
		"\u012c\7\6\2\2\u012c\u012d\5\4\3\2\u012d\u012e\7\u00e2\2\2\u012e\u0130"+
		"\3\2\2\2\u012f\u0129\3\2\2\2\u012f\u012a\3\2\2\2\u012f\u012b\3\2\2\2\u0130"+
		"\21\3\2\2\2\u0131\u0138\7\7\2\2\u0132\u0138\7\b\2\2\u0133\u0134\7\t\2"+
		"\2\u0134\u0135\5\4\3\2\u0135\u0136\7\u00e2\2\2\u0136\u0138\3\2\2\2\u0137"+
		"\u0131\3\2\2\2\u0137\u0132\3\2\2\2\u0137\u0133\3\2\2\2\u0138\23\3\2\2"+
		"\2\u0139\u013a\7\n\2\2\u013a\u013b\7\u00e2\2\2\u013b\25\3\2\2\2\u013c"+
		"\u013d\7\13\2\2\u013d\u013e\5\b\5\2\u013e\u013f\5\b\5\2\u013f\u0140\7"+
		"\u00e2\2\2\u0140\27\3\2\2\2\u0141\u0142\7\f\2\2\u0142\u0143\7\u00e2\2"+
		"\2\u0143\31\3\2\2\2\u0144\u0145\7\r\2\2\u0145\u0146\5\b\5\2\u0146\u0147"+
		"\5\b\5\2\u0147\u0148\7\u00e2\2\2\u0148\33\3\2\2\2\u0149\u014a\t\6\2\2"+
		"\u014a\35\3\2\2\2\u014b\u014c\t\7\2\2\u014c\37\3\2\2\2\u014d\u014e\7\23"+
		"\2\2\u014e\u014f\5\6\4\2\u014f\u0150\7\u00e2\2\2\u0150\u0151\7\u00e2\2"+
		"\2\u0151!\3\2\2\2\u0152\u015a\7\24\2\2\u0153\u015a\7\25\2\2\u0154\u0155"+
		"\7\26\2\2\u0155\u0156\5\b\5\2\u0156\u0157\5\b\5\2\u0157\u0158\7\u00e2"+
		"\2\2\u0158\u015a\3\2\2\2\u0159\u0152\3\2\2\2\u0159\u0153\3\2\2\2\u0159"+
		"\u0154\3\2\2\2\u015a#\3\2\2\2\u015b\u015c\t\b\2\2\u015c%\3\2\2\2\u015d"+
		"\u015e\7\31\2\2\u015e\u015f\5\4\3\2\u015f\'\3\2\2\2\u0160\u0161\7\32\2"+
		"\2\u0161)\3\2\2\2\u0162\u0167\7\33\2\2\u0163\u0167\7\34\2\2\u0164\u0165"+
		"\7\35\2\2\u0165\u0167\7\u00e2\2\2\u0166\u0162\3\2\2\2\u0166\u0163\3\2"+
		"\2\2\u0166\u0164\3\2\2\2\u0167+\3\2\2\2\u0168\u016e\7\36\2\2\u0169\u016a"+
		"\7\37\2\2\u016a\u016b\5\4\3\2\u016b\u016c\7\u00e2\2\2\u016c\u016e\3\2"+
		"\2\2\u016d\u0168\3\2\2\2\u016d\u0169\3\2\2\2\u016e-\3\2\2\2\u016f\u0177"+
		"\7 \2\2\u0170\u0177\7!\2\2\u0171\u0172\7\"\2\2\u0172\u0173\5\b\5\2\u0173"+
		"\u0174\5\b\5\2\u0174\u0175\7\u00e2\2\2\u0175\u0177\3\2\2\2\u0176\u016f"+
		"\3\2\2\2\u0176\u0170\3\2\2\2\u0176\u0171\3\2\2\2\u0177/\3\2\2\2\u0178"+
		"\u0183\7#\2\2\u0179\u0183\7$\2\2\u017a\u0183\7%\2\2\u017b\u0183\7&\2\2"+
		"\u017c\u0183\7\'\2\2\u017d\u017e\7(\2\2\u017e\u017f\5\4\3\2\u017f\u0180"+
		"\5\4\3\2\u0180\u0181\7\u00e2\2\2\u0181\u0183\3\2\2\2\u0182\u0178\3\2\2"+
		"\2\u0182\u0179\3\2\2\2\u0182\u017a\3\2\2\2\u0182\u017b\3\2\2\2\u0182\u017c"+
		"\3\2\2\2\u0182\u017d\3\2\2\2\u0183\61\3\2\2\2\u0184\u0185\7)\2\2\u0185"+
		"\u0186\5\b\5\2\u0186\63\3\2\2\2\u0187\u0188\7*\2\2\u0188\65\3\2\2\2\u0189"+
		"\u018a\7+\2\2\u018a\67\3\2\2\2\u018b\u018c\t\t\2\2\u018c9\3\2\2\2\u018d"+
		"\u0194\7.\2\2\u018e\u0194\7/\2\2\u018f\u0190\7\60\2\2\u0190\u0191\5\4"+
		"\3\2\u0191\u0192\7\u00e2\2\2\u0192\u0194\3\2\2\2\u0193\u018d\3\2\2\2\u0193"+
		"\u018e\3\2\2\2\u0193\u018f\3\2\2\2\u0194;\3\2\2\2\u0195\u019c\7\61\2\2"+
		"\u0196\u0197\7\62\2\2\u0197\u0198\5\4\3\2\u0198\u0199\5\4\3\2\u0199\u019a"+
		"\7\u00e2\2\2\u019a\u019c\3\2\2\2\u019b\u0195\3\2\2\2\u019b\u0196\3\2\2"+
		"\2\u019c=\3\2\2\2\u019d\u01a8\7\63\2\2\u019e\u01a8\7\64\2\2\u019f\u01a8"+
		"\7\65\2\2\u01a0\u01a8\7\66\2\2\u01a1\u01a8\7\67\2\2\u01a2\u01a3\78\2\2"+
		"\u01a3\u01a4\5\b\5\2\u01a4\u01a5\5\b\5\2\u01a5\u01a6\7\u00e2\2\2\u01a6"+
		"\u01a8\3\2\2\2\u01a7\u019d\3\2\2\2\u01a7\u019e\3\2\2\2\u01a7\u019f\3\2"+
		"\2\2\u01a7\u01a0\3\2\2\2\u01a7\u01a1\3\2\2\2\u01a7\u01a2\3\2\2\2\u01a8"+
		"?\3\2\2\2\u01a9\u01b0\79\2\2\u01aa\u01b0\7:\2\2\u01ab\u01ac\7;\2\2\u01ac"+
		"\u01ad\5\b\5\2\u01ad\u01ae\7\u00e2\2\2\u01ae\u01b0\3\2\2\2\u01af\u01a9"+
		"\3\2\2\2\u01af\u01aa\3\2\2\2\u01af\u01ab\3\2\2\2\u01b0A\3\2\2\2\u01b1"+
		"\u01ba\7<\2\2\u01b2\u01ba\7=\2\2\u01b3\u01ba\7>\2\2\u01b4\u01ba\7?\2\2"+
		"\u01b5\u01b6\7@\2\2\u01b6\u01b7\5\b\5\2\u01b7\u01b8\7\u00e2\2\2\u01b8"+
		"\u01ba\3\2\2\2\u01b9\u01b1\3\2\2\2\u01b9\u01b2\3\2\2\2\u01b9\u01b3\3\2"+
		"\2\2\u01b9\u01b4\3\2\2\2\u01b9\u01b5\3\2\2\2\u01baC\3\2\2\2\u01bb\u01c2"+
		"\7A\2\2\u01bc\u01c2\7B\2\2\u01bd\u01be\7C\2\2\u01be\u01bf\5\b\5\2\u01bf"+
		"\u01c0\7\u00e2\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01bb\3\2\2\2\u01c1\u01bc"+
		"\3\2\2\2\u01c1\u01bd\3\2\2\2\u01c2E\3\2\2\2\u01c3\u01ca\7D\2\2\u01c4\u01ca"+
		"\7E\2\2\u01c5\u01c6\7F\2\2\u01c6\u01c7\5\b\5\2\u01c7\u01c8\7\u00e2\2\2"+
		"\u01c8\u01ca\3\2\2\2\u01c9\u01c3\3\2\2\2\u01c9\u01c4\3\2\2\2\u01c9\u01c5"+
		"\3\2\2\2\u01caG\3\2\2\2\u01cb\u01cc\7G\2\2\u01cc\u01cd\5\b\5\2\u01cd\u01ce"+
		"\5\b\5\2\u01ce\u01cf\7\u00e2\2\2\u01cfI\3\2\2\2\u01d0\u01d1\7H\2\2\u01d1"+
		"\u01d2\7\u00e2\2\2\u01d2K\3\2\2\2\u01d3\u01d4\7I\2\2\u01d4\u01d5\5\4\3"+
		"\2\u01d5\u01d6\5\b\5\2\u01d6\u01d7\7\u00e2\2\2\u01d7M\3\2\2\2\u01d8\u01d9"+
		"\t\n\2\2\u01d9O\3\2\2\2\u01da\u01de\7M\2\2\u01db\u01dc\7N\2\2\u01dc\u01de"+
		"\7\u00e2\2\2\u01dd\u01da\3\2\2\2\u01dd\u01db\3\2\2\2\u01deQ\3\2\2\2\u01df"+
		"\u01e3\7O\2\2\u01e0\u01e1\7P\2\2\u01e1\u01e3\7\u00e2\2\2\u01e2\u01df\3"+
		"\2\2\2\u01e2\u01e0\3\2\2\2\u01e3S\3\2\2\2\u01e4\u01e5\t\13\2\2\u01e5U"+
		"\3\2\2\2\u01e6\u01e7\7S\2\2\u01e7\u01e8\5\b\5\2\u01e8W\3\2\2\2\u01e9\u01ea"+
		"\7T\2\2\u01ea\u01eb\5\b\5\2\u01ebY\3\2\2\2\u01ec\u01ed\7U\2\2\u01ed\u01ee"+
		"\5\b\5\2\u01ee[\3\2\2\2\u01ef\u01f4\7V\2\2\u01f0\u01f4\7W\2\2\u01f1\u01f2"+
		"\7X\2\2\u01f2\u01f4\5\b\5\2\u01f3\u01ef\3\2\2\2\u01f3\u01f0\3\2\2\2\u01f3"+
		"\u01f1\3\2\2\2\u01f4]\3\2\2\2\u01f5\u01f6\7Y\2\2\u01f6\u01f7\5\b\5\2\u01f7"+
		"_\3\2\2\2\u01f8\u01f9\7Z\2\2\u01f9a\3\2\2\2\u01fa\u01fb\t\f\2\2\u01fb"+
		"\u01fc\7\u00e3\2\2\u01fcc\3\2\2\2\u01fd\u0202\7^\2\2\u01fe\u0202\7_\2"+
		"\2\u01ff\u0200\7`\2\2\u0200\u0202\5\b\5\2\u0201\u01fd\3\2\2\2\u0201\u01fe"+
		"\3\2\2\2\u0201\u01ff\3\2\2\2\u0202e\3\2\2\2\u0203\u0207\7a\2\2\u0204\u0205"+
		"\7b\2\2\u0205\u0207\5\b\5\2\u0206\u0203\3\2\2\2\u0206\u0204\3\2\2\2\u0207"+
		"g\3\2\2\2\u0208\u0209\7c\2\2\u0209\u020a\5\b\5\2\u020ai\3\2\2\2\u020b"+
		"\u020c\t\r\2\2\u020ck\3\2\2\2\u020d\u020e\t\16\2\2\u020em\3\2\2\2\u020f"+
		"\u0210\t\17\2\2\u0210o\3\2\2\2\u0211\u0212\t\20\2\2\u0212q\3\2\2\2\u0213"+
		"\u0214\7m\2\2\u0214\u0215\7\u00e2\2\2\u0215s\3\2\2\2\u0216\u021e\7n\2"+
		"\2\u0217\u021e\7o\2\2\u0218\u021e\7p\2\2\u0219\u021a\7q\2\2\u021a\u021b"+
		"\5\b\5\2\u021b\u021c\7\u00e2\2\2\u021c\u021e\3\2\2\2\u021d\u0216\3\2\2"+
		"\2\u021d\u0217\3\2\2\2\u021d\u0218\3\2\2\2\u021d\u0219\3\2\2\2\u021eu"+
		"\3\2\2\2\u021f\u022a\7r\2\2\u0220\u022a\7s\2\2\u0221\u022a\7t\2\2\u0222"+
		"\u022a\7u\2\2\u0223\u022a\7v\2\2\u0224\u022a\7w\2\2\u0225\u0226\7x\2\2"+
		"\u0226\u0227\5\b\5\2\u0227\u0228\7\u00e2\2\2\u0228\u022a\3\2\2\2\u0229"+
		"\u021f\3\2\2\2\u0229\u0220\3\2\2\2\u0229\u0221\3\2\2\2\u0229\u0222\3\2"+
		"\2\2\u0229\u0223\3\2\2\2\u0229\u0224\3\2\2\2\u0229\u0225\3\2\2\2\u022a"+
		"w\3\2\2\2\u022b\u0233\7y\2\2\u022c\u0233\7z\2\2\u022d\u022e\7{\2\2\u022e"+
		"\u022f\5\b\5\2\u022f\u0230\5\b\5\2\u0230\u0231\7\u00e2\2\2\u0231\u0233"+
		"\3\2\2\2\u0232\u022b\3\2\2\2\u0232\u022c\3\2\2\2\u0232\u022d\3\2\2\2\u0233"+
		"y\3\2\2\2\u0234\u023a\7|\2\2\u0235\u0236\7}\2\2\u0236\u0237\5\b\5\2\u0237"+
		"\u0238\7\u00e2\2\2\u0238\u023a\3\2\2\2\u0239\u0234\3\2\2\2\u0239\u0235"+
		"\3\2\2\2\u023a{\3\2\2\2\u023b\u023c\7~\2\2\u023c\u023d\5\b\5\2\u023d\u023e"+
		"\7\u00e2\2\2\u023e}\3\2\2\2\u023f\u0247\7\177\2\2\u0240\u0247\7\u0080"+
		"\2\2\u0241\u0242\7\u0081\2\2\u0242\u0243\5\b\5\2\u0243\u0244\5\b\5\2\u0244"+
		"\u0245\7\u00e2\2\2\u0245\u0247\3\2\2\2\u0246\u023f\3\2\2\2\u0246\u0240"+
		"\3\2\2\2\u0246\u0241\3\2\2\2\u0247\177\3\2\2\2\u0248\u0250\7\u0082\2\2"+
		"\u0249\u0250\7\u0083\2\2\u024a\u024b\7\u0084\2\2\u024b\u024c\5\b\5\2\u024c"+
		"\u024d\5\b\5\2\u024d\u024e\7\u00e2\2\2\u024e\u0250\3\2\2\2\u024f\u0248"+
		"\3\2\2\2\u024f\u0249\3\2\2\2\u024f\u024a\3\2\2\2\u0250\u0081\3\2\2\2\u0251"+
		"\u0256\7\u0085\2\2\u0252\u0256\7\u0086\2\2\u0253\u0254\7\u0087\2\2\u0254"+
		"\u0256\7\u00e2\2\2\u0255\u0251\3\2\2\2\u0255\u0252\3\2\2\2\u0255\u0253"+
		"\3\2\2\2\u0256\u0083\3\2\2\2\u0257\u0258\t\21\2\2\u0258\u0085\3\2\2\2"+
		"\u0259\u025d\7\u008a\2\2\u025a\u025b\7\u008b\2\2\u025b\u025d\7\u00e2\2"+
		"\2\u025c\u0259\3\2\2\2\u025c\u025a\3\2\2\2\u025d\u0087\3\2\2\2\u025e\u0262"+
		"\7\u008c\2\2\u025f\u0260\7\u008d\2\2\u0260\u0262\7\u00e2\2\2\u0261\u025e"+
		"\3\2\2\2\u0261\u025f\3\2\2\2\u0262\u0089\3\2\2\2\u0263\u0264\7\u008e\2"+
		"\2\u0264\u008b\3\2\2\2\u0265\u0266\7\u008f\2\2\u0266\u008d\3\2\2\2\u0267"+
		"\u0268\7\u0090\2\2\u0268\u008f\3\2\2\2\u0269\u026f\7\u0091\2\2\u026a\u026b"+
		"\7\u0092\2\2\u026b\u026c\5\b\5\2\u026c\u026d\7\u00e2\2\2\u026d\u026f\3"+
		"\2\2\2\u026e\u0269\3\2\2\2\u026e\u026a\3\2\2\2\u026f\u0091\3\2\2\2\u0270"+
		"\u0271\7\u0093\2\2\u0271\u0093\3\2\2\2\u0272\u0276\7\u0094\2\2\u0273\u0274"+
		"\7\u0095\2\2\u0274\u0276\7\u00e2\2\2\u0275\u0272\3\2\2\2\u0275\u0273\3"+
		"\2\2\2\u0276\u0095\3\2\2\2\u0277\u027b\7\u0096\2\2\u0278\u0279\7\u0097"+
		"\2\2\u0279\u027b\7\u00e2\2\2\u027a\u0277\3\2\2\2\u027a\u0278\3\2\2\2\u027b"+
		"\u0097\3\2\2\2\u027c\u0281\7\u0098\2\2\u027d\u0281\7\u0099\2\2\u027e\u027f"+
		"\7\u009a\2\2\u027f\u0281\5\b\5\2\u0280\u027c\3\2\2\2\u0280\u027d\3\2\2"+
		"\2\u0280\u027e\3\2\2\2\u0281\u0099\3\2\2\2\u0282\u0283\t\22\2\2\u0283"+
		"\u009b\3\2\2\2\u0284\u0285\7\u009e\2\2\u0285\u0286\7\u00e2\2\2\u0286\u009d"+
		"\3\2\2\2\u0287\u0288\7\u009f\2\2\u0288\u0289\5\b\5\2\u0289\u028a\5\b\5"+
		"\2\u028a\u009f\3\2\2\2\u028b\u0290\7\u00a0\2\2\u028c\u0290\7\u00a1\2\2"+
		"\u028d\u028e\7\u00a2\2\2\u028e\u0290\5\b\5\2\u028f\u028b\3\2\2\2\u028f"+
		"\u028c\3\2\2\2\u028f\u028d\3\2\2\2\u0290\u00a1\3\2\2\2\u0291\u0292\t\23"+
		"\2\2\u0292\u00a3\3\2\2\2\u0293\u0294\7\u00a7\2\2\u0294\u0295\5\b\5\2\u0295"+
		"\u0296\5\b\5\2\u0296\u00a5\3\2\2\2\u0297\u0298\7\u00a8\2\2\u0298\u0299"+
		"\5\b\5\2\u0299\u029a\5\b\5\2\u029a\u029b\5\b\5\2\u029b\u029c\7\u00e2\2"+
		"\2\u029c\u00a7\3\2\2\2\u029d\u02a3\7\u00a9\2\2\u029e\u029f\7\u00aa\2\2"+
		"\u029f\u02a0\5\b\5\2\u02a0\u02a1\5\b\5\2\u02a1\u02a3\3\2\2\2\u02a2\u029d"+
		"\3\2\2\2\u02a2\u029e\3\2\2\2\u02a3\u00a9\3\2\2\2\u02a4\u02ab\7\u00ab\2"+
		"\2\u02a5\u02ab\7\u00ac\2\2\u02a6\u02a7\7\u00ad\2\2\u02a7\u02a8\5\b\5\2"+
		"\u02a8\u02a9\7\u00e2\2\2\u02a9\u02ab\3\2\2\2\u02aa\u02a4\3\2\2\2\u02aa"+
		"\u02a5\3\2\2\2\u02aa\u02a6\3\2\2\2\u02ab\u00ab\3\2\2\2\u02ac\u02b2\7\u00ae"+
		"\2\2\u02ad\u02ae\7\u00af\2\2\u02ae\u02af\5\4\3\2\u02af\u02b0\7\u00e2\2"+
		"\2\u02b0\u02b2\3\2\2\2\u02b1\u02ac\3\2\2\2\u02b1\u02ad\3\2\2\2\u02b2\u00ad"+
		"\3\2\2\2\u02b3\u02bb\7\u00b0\2\2\u02b4\u02bb\7\u00b1\2\2\u02b5\u02b6\7"+
		"\u00b2\2\2\u02b6\u02b7\5\b\5\2\u02b7\u02b8\5\4\3\2\u02b8\u02b9\7\u00e2"+
		"\2\2\u02b9\u02bb\3\2\2\2\u02ba\u02b3\3\2\2\2\u02ba\u02b4\3\2\2\2\u02ba"+
		"\u02b5\3\2\2\2\u02bb\u00af\3\2\2\2\u02bc\u02bd\7\u00b3\2\2\u02bd\u02be"+
		"\5\b\5\2\u02be\u02bf\7\u00e2\2\2\u02bf\u00b1\3\2\2\2\u02c0\u02c1\7\u00b4"+
		"\2\2\u02c1\u02c2\5\b\5\2\u02c2\u02c3\5\b\5\2\u02c3\u02c4\7\u00e2\2\2\u02c4"+
		"\u00b3\3\2\2\2\u02c5\u02c6\7\u00b5\2\2\u02c6\u02c7\5\b\5\2\u02c7\u02c8"+
		"\5\b\5\2\u02c8\u02c9\7\u00e2\2\2\u02c9\u00b5\3\2\2\2\u02ca\u02cb\7\u00b6"+
		"\2\2\u02cb\u02cc\5\b\5\2\u02cc\u02cd\7\u00e2\2\2\u02cd\u00b7\3\2\2\2\u02ce"+
		"\u02cf\7\u00b7\2\2\u02cf\u02d0\5\b\5\2\u02d0\u02d1\7\u00e2\2\2\u02d1\u00b9"+
		"\3\2\2\2\u02d2\u02d8\7\u00b8\2\2\u02d3\u02d4\7\u00b9\2\2\u02d4\u02d5\5"+
		"\b\5\2\u02d5\u02d6\7\u00e2\2\2\u02d6\u02d8\3\2\2\2\u02d7\u02d2\3\2\2\2"+
		"\u02d7\u02d3\3\2\2\2\u02d8\u00bb\3\2\2\2\u02d9\u02da\7\u00ba\2\2\u02da"+
		"\u02db\5\b\5\2\u02db\u02dc\5\b\5\2\u02dc\u02dd\5\b\5\2\u02dd\u02de\5\b"+
		"\5\2\u02de\u02df\5\b\5\2\u02df\u02e0\7\u00e2\2\2\u02e0\u00bd\3\2\2\2\u02e1"+
		"\u02e2\7\u00bb\2\2\u02e2\u02e3\5\b\5\2\u02e3\u02e4\7\u00e2\2\2\u02e4\u00bf"+
		"\3\2\2\2\u02e5\u02eb\7\u00bc\2\2\u02e6\u02e7\7\u00bd\2\2\u02e7\u02e8\5"+
		"\b\5\2\u02e8\u02e9\7\u00e2\2\2\u02e9\u02eb\3\2\2\2\u02ea\u02e5\3\2\2\2"+
		"\u02ea\u02e6\3\2\2\2\u02eb\u00c1\3\2\2\2\u02ec\u02ed\7\u00be\2\2\u02ed"+
		"\u02ee\5\b\5\2\u02ee\u00c3\3\2\2\2\u02ef\u02f0\7\u00bf\2\2\u02f0\u02f1"+
		"\5\b\5\2\u02f1\u02f2\5\b\5\2\u02f2\u00c5\3\2\2\2\u02f3\u02f4\7\u00c0\2"+
		"\2\u02f4\u00c7\3\2\2\2\u02f5\u02fa\7\u00c1\2\2\u02f6\u02fa\7\u00c2\2\2"+
		"\u02f7\u02f8\7\u00c3\2\2\u02f8\u02fa\5\b\5\2\u02f9\u02f5\3\2\2\2\u02f9"+
		"\u02f6\3\2\2\2\u02f9\u02f7\3\2\2\2\u02fa\u00c9\3\2\2\2\u02fb\u02fc\7\u00c4"+
		"\2\2\u02fc\u02fd\7\u00e2\2\2\u02fd\u00cb\3\2\2\2\u02fe\u02ff\t\24\2\2"+
		"\u02ff\u0300\t\25\2\2\u0300\u0301\5\4\3\2\u0301\u00cd\3\2\2\2\u0302\u0303"+
		"\7\u00c7\2\2\u0303\u00cf\3\2\2\2\u0304\u030a\7\u00c8\2\2\u0305\u0306\7"+
		"\u00c9\2\2\u0306\u0307\5\4\3\2\u0307\u0308\7\u00e2\2\2\u0308\u030a\3\2"+
		"\2\2\u0309\u0304\3\2\2\2\u0309\u0305\3\2\2\2\u030a\u00d1\3\2\2\2\u030b"+
		"\u030c\7\u00ca\2\2\u030c\u00d3\3\2\2\2\u030d\u0315\7\u00cb\2\2\u030e\u030f"+
		"\7\u00cc\2\2\u030f\u0310\5\4\3\2\u0310\u0311\5\4\3\2\u0311\u0312\5\4\3"+
		"\2\u0312\u0313\7\u00e2\2\2\u0313\u0315\3\2\2\2\u0314\u030d\3\2\2\2\u0314"+
		"\u030e\3\2\2\2\u0315\u00d5\3\2\2\2\u0316\u031c\7\u00cd\2\2\u0317\u031c"+
		"\7\u00ce\2\2\u0318\u031c\7\u00cf\2\2\u0319\u031a\7\u00d0\2\2\u031a\u031c"+
		"\7\u00e2\2\2\u031b\u0316\3\2\2\2\u031b\u0317\3\2\2\2\u031b\u0318\3\2\2"+
		"\2\u031b\u0319\3\2\2\2\u031c\u00d7\3\2\2\2\u031d\u0325\7\u00d1\2\2\u031e"+
		"\u0325\7\u00d2\2\2\u031f\u0325\7\u00d3\2\2\u0320\u0325\7\u00d4\2\2\u0321"+
		"\u0325\7\u00d5\2\2\u0322\u0323\7\u00d6\2\2\u0323\u0325\7\u00e2\2\2\u0324"+
		"\u031d\3\2\2\2\u0324\u031e\3\2\2\2\u0324\u031f\3\2\2\2\u0324\u0320\3\2"+
		"\2\2\u0324\u0321\3\2\2\2\u0324\u0322\3\2\2\2\u0325\u00d9\3\2\2\2\u0326"+
		"\u032f\7\u00d7\2\2\u0327\u032f\7\u00d8\2\2\u0328\u032f\7\u00d9\2\2\u0329"+
		"\u032f\7\u00da\2\2\u032a\u032b\7\u00db\2\2\u032b\u032c\5\6\4\2\u032c\u032d"+
		"\7\u00e2\2\2\u032d\u032f\3\2\2\2\u032e\u0326\3\2\2\2\u032e\u0327\3\2\2"+
		"\2\u032e\u0328\3\2\2\2\u032e\u0329\3\2\2\2\u032e\u032a\3\2\2\2\u032f\u00db"+
		"\3\2\2\2\u0330\u0331\t\26\2\2\u0331\u00dd\3\2\2\2\u0332\u0338\7\u00df"+
		"\2\2\u0333\u0334\7\u00e0\2\2\u0334\u0335\5\6\4\2\u0335\u0336\7\u00e2\2"+
		"\2\u0336\u0338\3\2\2\2\u0337\u0332\3\2\2\2\u0337\u0333\3\2\2\2\u0338\u00df"+
		"\3\2\2\2\u0339\u0375\5\20\t\2\u033a\u0375\5\22\n\2\u033b\u0375\5\24\13"+
		"\2\u033c\u0375\5\26\f\2\u033d\u0375\5\30\r\2\u033e\u0375\5\32\16\2\u033f"+
		"\u0375\5 \21\2\u0340\u0375\5\"\22\2\u0341\u0375\5*\26\2\u0342\u0375\5"+
		",\27\2\u0343\u0375\5.\30\2\u0344\u0375\5\60\31\2\u0345\u0375\5:\36\2\u0346"+
		"\u0375\5<\37\2\u0347\u0375\5> \2\u0348\u0375\5@!\2\u0349\u0375\5B\"\2"+
		"\u034a\u0375\5D#\2\u034b\u0375\5F$\2\u034c\u0375\5H%\2\u034d\u0375\5J"+
		"&\2\u034e\u0375\5L\'\2\u034f\u0375\5P)\2\u0350\u0375\5R*\2\u0351\u0375"+
		"\5r:\2\u0352\u0375\5t;\2\u0353\u0375\5v<\2\u0354\u0375\5x=\2\u0355\u0375"+
		"\5z>\2\u0356\u0375\5|?\2\u0357\u0375\5~@\2\u0358\u0375\5\u0080A\2\u0359"+
		"\u0375\5\u0082B\2\u035a\u0375\5\u0086D\2\u035b\u0375\5\u0088E\2\u035c"+
		"\u0375\5\u0090I\2\u035d\u0375\5\u0094K\2\u035e\u0375\5\u0096L\2\u035f"+
		"\u0375\5\u009cO\2\u0360\u0375\5\u00a6T\2\u0361\u0375\5\u00aaV\2\u0362"+
		"\u0375\5\u00acW\2\u0363\u0375\5\u00aeX\2\u0364\u0375\5\u00b0Y\2\u0365"+
		"\u0375\5\u00b2Z\2\u0366\u0375\5\u00b4[\2\u0367\u0375\5\u00b6\\\2\u0368"+
		"\u0375\5\u00b8]\2\u0369\u0375\5\u00ba^\2\u036a\u0375\5\u00bc_\2\u036b"+
		"\u0375\5\u00be`\2\u036c\u0375\5\u00c0a\2\u036d\u0375\5\u00caf\2\u036e"+
		"\u0375\5\u00d0i\2\u036f\u0375\5\u00d4k\2\u0370\u0375\5\u00d6l\2\u0371"+
		"\u0375\5\u00d8m\2\u0372\u0375\5\u00dan\2\u0373\u0375\5\u00dep\2\u0374"+
		"\u0339\3\2\2\2\u0374\u033a\3\2\2\2\u0374\u033b\3\2\2\2\u0374\u033c\3\2"+
		"\2\2\u0374\u033d\3\2\2\2\u0374\u033e\3\2\2\2\u0374\u033f\3\2\2\2\u0374"+
		"\u0340\3\2\2\2\u0374\u0341\3\2\2\2\u0374\u0342\3\2\2\2\u0374\u0343\3\2"+
		"\2\2\u0374\u0344\3\2\2\2\u0374\u0345\3\2\2\2\u0374\u0346\3\2\2\2\u0374"+
		"\u0347\3\2\2\2\u0374\u0348\3\2\2\2\u0374\u0349\3\2\2\2\u0374\u034a\3\2"+
		"\2\2\u0374\u034b\3\2\2\2\u0374\u034c\3\2\2\2\u0374\u034d\3\2\2\2\u0374"+
		"\u034e\3\2\2\2\u0374\u034f\3\2\2\2\u0374\u0350\3\2\2\2\u0374\u0351\3\2"+
		"\2\2\u0374\u0352\3\2\2\2\u0374\u0353\3\2\2\2\u0374\u0354\3\2\2\2\u0374"+
		"\u0355\3\2\2\2\u0374\u0356\3\2\2\2\u0374\u0357\3\2\2\2\u0374\u0358\3\2"+
		"\2\2\u0374\u0359\3\2\2\2\u0374\u035a\3\2\2\2\u0374\u035b\3\2\2\2\u0374"+
		"\u035c\3\2\2\2\u0374\u035d\3\2\2\2\u0374\u035e\3\2\2\2\u0374\u035f\3\2"+
		"\2\2\u0374\u0360\3\2\2\2\u0374\u0361\3\2\2\2\u0374\u0362\3\2\2\2\u0374"+
		"\u0363\3\2\2\2\u0374\u0364\3\2\2\2\u0374\u0365\3\2\2\2\u0374\u0366\3\2"+
		"\2\2\u0374\u0367\3\2\2\2\u0374\u0368\3\2\2\2\u0374\u0369\3\2\2\2\u0374"+
		"\u036a\3\2\2\2\u0374\u036b\3\2\2\2\u0374\u036c\3\2\2\2\u0374\u036d\3\2"+
		"\2\2\u0374\u036e\3\2\2\2\u0374\u036f\3\2\2\2\u0374\u0370\3\2\2\2\u0374"+
		"\u0371\3\2\2\2\u0374\u0372\3\2\2\2\u0374\u0373\3\2\2\2\u0375\u00e1\3\2"+
		"\2\2\u0376\u039c\5\34\17\2\u0377\u039c\5\36\20\2\u0378\u039c\5$\23\2\u0379"+
		"\u039c\5&\24\2\u037a\u039c\5(\25\2\u037b\u039c\5\64\33\2\u037c\u039c\5"+
		"\66\34\2\u037d\u039c\58\35\2\u037e\u039c\5N(\2\u037f\u039c\5T+\2\u0380"+
		"\u039c\5`\61\2\u0381\u039c\5b\62\2\u0382\u039c\5d\63\2\u0383\u039c\5f"+
		"\64\2\u0384\u039c\5h\65\2\u0385\u039c\5j\66\2\u0386\u039c\5l\67\2\u0387"+
		"\u039c\5n8\2\u0388\u039c\5p9\2\u0389\u039c\5\u0084C\2\u038a\u039c\5\u008a"+
		"F\2\u038b\u039c\5\u008cG\2\u038c\u039c\5\u008eH\2\u038d\u039c\5\u0092"+
		"J\2\u038e\u039c\5\u0098M\2\u038f\u039c\5\u009aN\2\u0390\u039c\5\u009e"+
		"P\2\u0391\u039c\5\u00a0Q\2\u0392\u039c\5\u00a2R\2\u0393\u039c\5\u00a4"+
		"S\2\u0394\u039c\5\u00a8U\2\u0395\u039c\5\u00c2b\2\u0396\u039c\5\u00c4"+
		"c\2\u0397\u039c\5\u00c6d\2\u0398\u039c\5\u00c8e\2\u0399\u039c\5\u00d2"+
		"j\2\u039a\u039c\5\u00dco\2\u039b\u0376\3\2\2\2\u039b\u0377\3\2\2\2\u039b"+
		"\u0378\3\2\2\2\u039b\u0379\3\2\2\2\u039b\u037a\3\2\2\2\u039b\u037b\3\2"+
		"\2\2\u039b\u037c\3\2\2\2\u039b\u037d\3\2\2\2\u039b\u037e\3\2\2\2\u039b"+
		"\u037f\3\2\2\2\u039b\u0380\3\2\2\2\u039b\u0381\3\2\2\2\u039b\u0382\3\2"+
		"\2\2\u039b\u0383\3\2\2\2\u039b\u0384\3\2\2\2\u039b\u0385\3\2\2\2\u039b"+
		"\u0386\3\2\2\2\u039b\u0387\3\2\2\2\u039b\u0388\3\2\2\2\u039b\u0389\3\2"+
		"\2\2\u039b\u038a\3\2\2\2\u039b\u038b\3\2\2\2\u039b\u038c\3\2\2\2\u039b"+
		"\u038d\3\2\2\2\u039b\u038e\3\2\2\2\u039b\u038f\3\2\2\2\u039b\u0390\3\2"+
		"\2\2\u039b\u0391\3\2\2\2\u039b\u0392\3\2\2\2\u039b\u0393\3\2\2\2\u039b"+
		"\u0394\3\2\2\2\u039b\u0395\3\2\2\2\u039b\u0396\3\2\2\2\u039b\u0397\3\2"+
		"\2\2\u039b\u0398\3\2\2\2\u039b\u0399\3\2\2\2\u039b\u039a\3\2\2\2\u039c"+
		"\u00e3\3\2\2\2\u039d\u03a6\5\62\32\2\u039e\u03a6\5V,\2\u039f\u03a6\5X"+
		"-\2\u03a0\u03a6\5Z.\2\u03a1\u03a6\5\\/\2\u03a2\u03a6\5^\60\2\u03a3\u03a6"+
		"\5\u00ccg\2\u03a4\u03a6\5\u00ceh\2\u03a5\u039d\3\2\2\2\u03a5\u039e\3\2"+
		"\2\2\u03a5\u039f\3\2\2\2\u03a5\u03a0\3\2\2\2\u03a5\u03a1\3\2\2\2\u03a5"+
		"\u03a2\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a5\u03a4\3\2\2\2\u03a6\u00e5\3\2"+
		"\2\2<\u00f6\u00fd\u0108\u0110\u0112\u0118\u011b\u0120\u0127\u012f\u0137"+
		"\u0159\u0166\u016d\u0176\u0182\u0193\u019b\u01a7\u01af\u01b9\u01c1\u01c9"+
		"\u01dd\u01e2\u01f3\u0201\u0206\u021d\u0229\u0232\u0239\u0246\u024f\u0255"+
		"\u025c\u0261\u026e\u0275\u027a\u0280\u028f\u02a2\u02aa\u02b1\u02ba\u02d7"+
		"\u02ea\u02f9\u0309\u0314\u031b\u0324\u032e\u0337\u0374\u039b\u03a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}