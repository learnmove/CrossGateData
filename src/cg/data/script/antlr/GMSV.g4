grammar GMSV;

@header {
package cg.data.script.antlr;
}

BOOLEAN : 'true' | 'false' ;
NEWLINE : '\r'? '\n' ; 
STRING : [a-zA-Z]+ ;
NAME : (STRING | UNDERLINE) (STRING | UNDERLINE | INT)* ;
INT : [0-9]+;
COLON : ':' ;
COMMA : ',' ;
SEMICOLON : ';' ;
LPAREN : '(' ;
RPAREN : ')' ;
LSQUARE : '[' ;
RSQUARE : ']' ;
LCURLY : '{';
RCURLY : '}';
DOT : '.' ;
UNDERLINE : '_';
ASSIGNEQUAL : '=' ;
NOTEQUAL1 : '<>' ;
NOTEQUAL2 : '!=' ;
LESSTHANOREQUALTO : '<=' ;
LESSTHAN : '<' ;
GREATERTHANOREQUALTO : '>=' ;
GREATERTHAN : '>' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
MUL : '*' ;
MOD : '%' ;
TILDE : '~' ;
BITWISEOR : '|' ;
BITWISEXOR : '^' ;
POUND : '#';
DOLLAR : '$';
COMMENT : '/*' ( options {} : ()*? ) * '*/' {setChannel(HIDDEN);} ;
LINE_COMMENT : ('#' | '//') ~ ('\n' | '\r') * NEWLINE {setChannel(HIDDEN);} ;
WS : ( ' ' | '\t' ) + -> skip ;
EQUAL : '==' ;
AND : '&&' ;
OR : '||' ;

/* =========================================== */
/*               system function               */
/* =========================================== */

r : NAME INT;
booleanRule : booleanRule op=('&&'|'||') booleanRule	# AndOr
	| mutilBOOLEAN 										# mulBoo
	| exprBoolean 										# expBoo
	| BOOLEAN											# boo
	| '(' booleanRule ')'								# booParens
	;
exprBoolean : expr op=('<>'|'!='|'>='|'>'|'<='|'<'|'==') expr;
expr : expr op=('*'|'/'|'%') expr	# MulDiv
	| expr op=('+'|'-') expr 		# AddSub
	| r 							# id
	| INT 							# int
	| mutilINT 						# intRule
	| '(' expr ')'					# parens
	;
startRule : booleanRule commonRule ;
commonRule : mutilCOMMON* ;

/* =========================================== */
/*                game function                */
/* =========================================== */

addfeversec : 'Addfeversec' | 'AddFeverSec' | 'addfeversec' STRING NEWLINE; // 加卡时
addgold : 'AddGold' | 'Addgold' | 'addgold' STRING NEWLINE; // 加钱
addgoldlevel : 'AddGoldLevel' NEWLINE; // 
addluck : 'addluck' INT INT NEWLINE; // 加幸运度
addskillslot : 'addskillslot' NEWLINE; // 加1技能格
addstampcount : 'AddStampCount' INT INT NEWLINE; // 给某一道具加计数值 
bimage : 'BImage' | 'Bimage'; // 判断人物图形编号
bbimage : 'BBImage' | 'BBimage' | 'bbimage'; // 判断人物图形编号
block : 'block' BOOLEAN NEWLINE; // NPC指令开端（类似设定一块一块脚本块）
changepal : 'ChangePal' | 'Changepal' | 'changepal' INT INT NEWLINE; // 改变地图调色板
checkitemcategory : 'CheckItemCategory' | 'checkitemcategory'; // 
checkrealtime : 'CheckRealTime' STRING; // 检查真实时间
checkskillslot : 'checkskillslot'; // 检查技能格数
checktitle : 'CheckTitle' | 'checktitle' | 'Checktitle' NEWLINE; // 檢查是否有新称号
encount : 'Encount' | 'encount' STRING NEWLINE; // 打怪
endevent : 'endevent' | 'EndEvent' | 'Endevent' INT INT NEWLINE; // 赋予指定event编号
endwindow : 'EndWindow' | 'endWindow' | 'EndWIndow' | 'Endwindow' | 'ENDWindow' | 'endwindow' STRING STRING NEWLINE; // 对话结束关闭对话视窗
equipitem : 'EquipItem' INT; // 检测否拥有装备
fame : 'Fame'; // 称号值
floor : 'Floor'; // 判断所在地图的编号比如法兰 1000
fp : 'fp' | 'FP'; // 给予+-生命值
gaendwindow : 'GAendWindow' | 'GAendwindow' | 'GAEndWindow' STRING NEWLINE; // 全队endwindow？
gawindow : 'GAwindow' | 'GAWindow' STRING STRING NEWLINE; // 全队window？
giveitem : 'giveItem' | 'Giveitem' | 'GIveitem' | 'GiveItem' | 'GIveItem' | 'giveitem' INT INT NEWLINE; // 给予指定道具编号指令
giveleak0item : 'Giveleak0Item' | 'GiveLeak0Item' | 'GiveLeak0item' INT NEWLINE; // 给予特定道具编号指令（未鉴定道具）
giveleak1item : 'GIveleak1Item' | 'Giveleak1item' | 'Giveleak1Item' | 'GiveLeak1item' | 'GiveLeak1Item' INT NEWLINE; // 给予指定关键道具编号指令（已鉴定道具）
givepet : 'Givepet' | 'GivePet' | 'givepet' INT NEWLINE; // 给予指定宠物
giverecipe : 'GiveRecipe' | 'Giverecipe' | 'giverecipe' INT NEWLINE; // 给予指定技能编号
givestackitem : 'GiveStackItem' INT INT NEWLINE; // 给予指定道具编号指令（已鉴定道具，计算堆叠）
globalflag : 'GAglobalFlag' NEWLINE; // 类似ENDEVENT的判断？？ 
globaltimer : 'GlobalTimerA' STRING INT NEWLINE; // 设置计时器值
gold : 'gold' | 'Gold' | 'GOLD'; // 检查当前金钱值
gotob : 'gotoB' | 'GotoB' NEWLINE; // 用于语句跳转，向上跳（goto back）
gotof : 'gotoF' | 'GotoF' NEWLINE; // 用语语句跳转，向下跳（goto forward）
group : 'Group' | 'group'; // 检查当前組对人数
haveitem :  'HaveItem' INT; // 检测是否拥有道具
haveleak0item : 'HaveLeak0Item' INT; // 检测是否拥有道具（未鉴定道具）
haveleak1item : 'HaveLeak1Item' INT; // 检测是否拥有道具（已鉴定道具）
havetitle : 'havetitle' | 'Havetitle' | 'HaveTitle' INT; // 检测是否拥有称号
houseid : 'HouseId' INT; // 检测是否拥有出租屋
imagetype : 'Imagetype'; // 判断形象类型
item :  'Item' INT; // 道具编号开端(如Item1234)
itemcreatetime : 'itemcreatetime' | 'ItemCreateTime' | 'Itemcreatetime' INT; // 判断道具创建到現在的时间差
itemdur : 'ItemDur' | 'ItemDUR' INT; // 判断指定道具当前耐久
itemdurper : 'ItemDurPer' INT; // 判断指定道具当前耐久百分比
itemspace : 'ItemSpace' | 'Itemspace' | 'itemspace'; // 判断道具空间
job : 'job' | 'Job'; // 判断人物职业编号
jobancestry : 'jobancestry' | 'JobAncestry'; // 判断人物职业基础编号
jobrank : 'Jobrank' | 'JobRank'; // 判断人物职业等級
killdrugdish : 'killdrugdish' NEWLINE; // 
killitem : 'killitem' | 'Killitem' | 'killItem' | 'KillItem' INT NEWLINE; // 刪除指定编号道具
killitemall : 'Killitemall' | 'killitemall' | 'KillItemall' | 'KillItemAll' | 'KillItemALL' | 'KIllItemall' | 'killItemall' INT NEWLINE; // 刪除指定编号下的所有道具
killleak0item : 'killleak0item' | 'KillLeak0item' | 'KillLeak0Item' INT INT NEWLINE; // 刪除指定编号下未鉴定的所有道具
killleak1item : 'KillLeak1Item' | 'KillLeak1item' INT NEWLINE; // 刪除指定编号下已鉴定的所有道具
killpet : 'KillPet' INT NEWLINE; // 刪除指定宠物
killpeth : 'KillPetH' | 'KillPeth' | 'Killpeth' INT INT NEWLINE; // 刪除指定宠物，级别不小于定值
killpetl : 'KillPetl' | 'KillPetL' | 'killpetL' INT INT NEWLINE; // 刪除指定宠物，级别不大于定值
leavegroup : 'Leavegroup' | 'LeaveGroup' | 'leavegroup' NEWLINE; // 强制离队
level : 'level' | 'Level'; // 判断等級
localcount : 'localCount' | 'LocalCount' NEWLINE; // 本地计量？类似与局部计量变量
localflag : 'LocalFlag' | 'Localflag' NEWLINE; // 
lp : 'lp'; // 判断生命值
maxfp : 'maxfp'; // 判断最大魔法值
maxlp : 'maxlp'; // 判断最大生命值
message : 'Message' | 'message' INT NEWLINE; // 显示系统提示 ，参数为msg编号
metamocount : 'MetamoCount'; // 人物指定变更变身编号
next : 'next' | 'NEXT' NEWLINE; // 搭配Window指令
no : 'No' | 'NO' NEWLINE; // 搭配Window指令
nowevent : 'nowevent' | 'Nowevent' | 'NowEvent' INT; // 判断当前event值
nowtime : 'Nowtime' | 'nowtime' | 'NowTime'; // 判断当前魔力时间(0~15)
ok : 'OK' NEWLINE; // 搭配Window指令
pequipitem : 'PEquipItem' INT INT; // 整个队伍中有几人装备某道具
petlevel : 'PetLevel' | 'petlevel' | 'Petlevel' INT; // 设定指定宠物等级
petspace : 'Petspace' | 'petspace' | 'PetSpace' | 'petSpace'; // 判断宠物栏当前剩余空格
phitem : 'PHItem' INT INT; // 整个队伍的道具判断
playse : 'playse' INT INT INT NEWLINE; // 播放指定音效
random : 'Random' | 'random' INT INT; // 随即数设定
setaction : 'Setaction' | 'SetAction' | 'setaction' INT NEWLINE; // 指定npc动作(必須是可动的npc)
setcharm : 'SetCharm' | 'setcharm' STRING NEWLINE; // 设定魅力值
setdur : 'SetDur' | 'Setdur' | 'SetDUR' INT STRING NEWLINE; // 设定物品耐久
setfeverflg : 'Setfeverflg' INT NEWLINE; // 设定称号值
sethouse : 'SetHouse' INT INT NEWLINE; // 设定房间剩余时间
sethouselimit : 'SetHouseLimit' INT INT NEWLINE; // 设定房间剩余时间
setlevel : 'SetLevel' INT NEWLINE; // 设定等级
setloginpoint : 'SetLoginPoint' INT NEWLINE; // 设定登陆点指令
setlp : 'SetLP' | 'SetLp' INT NEWLINE; // 设定生命值
setobject : 'SetObject' INT INT INT INT INT NEWLINE; // 设定指定不可穿越道具
setvisitor : 'SetVisitor' INT NEWLINE; // 设置访问者数量
shapenext : 'ShapeNext' | 'shapenext' INT NEWLINE; // 设定NPC变换形象
shipchardown : 'ShipCharDown' INT; // 下船？
shipchartake : 'ShipCharTake' INT INT; // 上船
shipgetstoptime : 'ShipGetStopTime'; // 
skilllevel : 'Skilllevel' | 'skilllevel' | 'SkillLevel' INT; // 设定技能等級
stackitemspace : 'StackItemSpace' NEWLINE; // 
strcmpchat : ('StrCmpChat' | 'strcmpchat') ('=' | '==') STRING; // 判断 msg对话字句
strstrchat : 'StrStrChat'; // 同上？
systemmessage : 'systemmessage' | 'SystemMessage' STRING NEWLINE; // 系统信息？
trueimage : 'trueimage'; // 角色本身形象
warp : 'Warp' | 'warp' STRING STRING STRING NEWLINE; // 移动指令
window_no : 'window_no' | 'Window_no' | 'Window_NO' | 'Window_No' NEWLINE; // 搭配Window_yes使用(玩家选no时)
window_ok : 'Window_OK' | 'Window_ok' | 'Window_Ok' | 'window_ok' | 'window_OK' | 'WIndow_OK' NEWLINE; // 玩家选确定后
window_yes : 'window_yes' | 'Window_YES' | 'Window_Yes' | 'Window_yes' | 'WindoW_YES' BOOLEAN NEWLINE; // 玩家选"yes"时
xpos : 'xpos' | 'Xpos' | 'XPos'; // 指定x坐标
yes : 'YES' | 'Yes' BOOLEAN NEWLINE; // 搭配window使用
mutilCOMMON : addfeversec | addgold | addgoldlevel | addluck | addskillslot | addstampcount | block | changepal | checktitle | encount | endevent | endwindow | gaendwindow | gawindow | giveitem | giveleak0item | giveleak1item | givepet | giverecipe | givestackitem | globalflag | globaltimer | gotob | gotof | killdrugdish | killitem | killitemall | killleak0item | killleak1item | killpet | killpeth | killpetl | leavegroup | localcount | localflag | message | next | no | ok | playse | setaction | setcharm | setdur | setfeverflg | sethouse | sethouselimit | setlevel | setloginpoint | setlp | setobject | setvisitor | shapenext | stackitemspace | systemmessage | warp | window_no | window_ok | window_yes | yes;
mutilINT : bimage | bbimage | checkitemcategory | checkrealtime | checkskillslot | fame | floor | fp | gold | group | imagetype | item | itemcreatetime | itemdur | itemdurper | itemspace | job | jobancestry | jobrank | level | lp | maxfp | maxlp | metamocount | nowevent | nowtime | pequipitem | petlevel | petspace | phitem | random | shipchardown | shipchartake | shipgetstoptime | skilllevel | trueimage | xpos;
mutilBOOLEAN : equipitem | haveitem | haveleak0item | haveleak1item | havetitle | houseid | strcmpchat | strstrchat;
