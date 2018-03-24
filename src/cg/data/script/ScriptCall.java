package cg.data.script;

	/**
	 * This interface defines a complete call for a syscall.
	 * Generate file by tool.script.ScriptCallMaker.
	 */
public interface ScriptCall {

	/**
	 * 加卡时
	 * @param	param0
	 * 			"+/-"卡时
	 */
	void addFeversec(String param0);
	/**
	 * 加钱
	 * @param	param0
	 * 			"+/-"金钱
	 */
	void addGold(String param0);
	/**
	 * 
	 */
	void addGoldLevel ();
	/**
	 * 加幸运度
	 * @param	param0
	 * 			幸运度下限
	 * @param	param1
	 * 			幸运度上限
	 */
	void addLuck(int param0, int param1);
	/**
	 * 加1技能格
	 */
	void addSkillSlot();
	/**
	 * 给某一道具加计数值 
	 * @param	param0
	 * 			道具模板id
	 * @param	param1
	 * 			道具数量
	 */
	void addStampCount(int param0, int param1);
	/**
	 * 变更人物头象
	 */
	void albumItemFlg();
	/**
	 * 
	 */
	void bankItem();
	/**
	 * 判断人物图形编号
	 * @return	人物图形编号
	 */
	int bImage();
	/**
	 * 判断人物图形编号
	 * @return	人物图形编号
	 */
	int bBImage();
	/**
	 * NPC指令开端（类似设定一块一块脚本块）
	 */
	void block();
	/**
	 * 改变地图调色板
	 * @param	param0
	 * 			调色板id
	 * @param	param1
	 * 			时间（秒）
	 */
	void changePal(int param0, int param1);
	/**
	 * 
	 * @return	道具类型
	 */
	int checkItemCategory ();
	/**
	 * 检查真实时间
	 * @param	param0
	 * 			时间戳
	 * @return	1=TRUE
	 */
	int checkRealTime(String param0);
	/**
	 * 检查技能格数
	 * @return	技能格数
	 */
	int checkSkillSlot();
	/**
	 * 檢查是否有新称号
	 */
	void checkTitle();
	/**
	 * 打怪
	 * @param	param0
	 * 			怪物信息
	 */
	void encount(String param0);
	/**
	 * 
	 */
	void endBlock ();
	/**
	 * 赋予指定event编号
	 * @param	param0
	 * 			事件索引
	 * @param	param1
	 * 			事件编号
	 */
	void endEvent(int param0, int param1);
	/**
	 * 对话结束关闭对话视窗
	 * @param	param0
	 * 			内容
	 * @param	param1
	 * 			按钮类型
	 */
	void endWindow(String param0, String param1);
	/**
	 * 检测否拥有装备
	 * @param	param0
	 * 			装备模板id
	 * @return	否拥有装备
	 */
	boolean equipItem(int param0);
	/**
	 * 称号值
	 * @return	声望
	 */
	int fame();
	/**
	 * 判断所在地图的编号比如法兰 1000
	 * @return	地图模板id
	 */
	int floor();
	/**
	 * 给予+-生命值
	 * @return	当前魔力值
	 */
	int fp();
	/**
	 * 全队endwindow？
	 * @param	param0
	 * 			内容
	 */
	void gaEndWindow(String param0);
	/**
	 * 全队globalFlag条件判断
	 */
	void gaGlobalFlag();
	/**
	 * 全队window？
	 * @param	param0
	 * 			内容
	 * @param	param1
	 * 			按钮类型
	 */
	void gaWindow(String param0, String param1);
	/**
	 * 
	 */
	void getAlbumFlgTotal();
	/**
	 * 给予指定道具编号指令
	 * @param	param0
	 * 			道具模板id
	 * @param	param1
	 * 			道具数量
	 */
	void giveItem(int param0, int param1);
	/**
	 * 给予特定道具编号指令（未鉴定道具）
	 * @param	param0
	 * 			道具模板id
	 */
	void giveLeak0Item(int param0);
	/**
	 * 给予指定关键道具编号指令（已鉴定道具）
	 * @param	param0
	 * 			道具模板id
	 */
	void giveLeak1Item(int param0);
	/**
	 * 给予指定宠物
	 * @param	param0
	 * 			宠物模板id
	 */
	void givePet(int param0);
	/**
	 * 给予指定技能编号
	 * @param	param0
	 * 			技能模板id
	 */
	void giveRecipe(int param0);
	/**
	 * 给予指定道具编号指令（已鉴定道具，计算堆叠）
	 * @param	param0
	 * 			道具模板id
	 * @param	param1
	 * 			道具数量
	 */
	void giveStackItem(int param0, int param1);
	/**
	 * 类似ENDEVENT的判断？？ 
	 */
	void globalFlag();
	/**
	 * 设置计时器值
	 * @param	param0
	 * 			计时器名称
	 * @param	param1
	 * 			计时器值
	 */
	void globalTimer(String param0, int param1);
	/**
	 * 检查当前金钱值
	 * @return	当前金钱
	 */
	int gold();
	/**
	 * 用于语句跳转，向上跳（goto back）
	 */
	void gotoB();
	/**
	 * 用语语句跳转，向下跳（goto forward）
	 */
	void gotoF();
	/**
	 * 检查当前組对人数
	 * @return	队伍人数
	 */
	int group();
	/**
	 * 
	 */
	void guildMember();
	/**
	 * 检测是否拥有道具
	 * @param	param0
	 * 			道具模板id
	 * @return	否拥有道具
	 */
	boolean haveItem(int param0);
	/**
	 * 检测是否拥有道具（未鉴定道具）
	 * @param	param0
	 * 			道具模板id
	 * @return	否拥有道具
	 */
	boolean haveLeak0Item(int param0);
	/**
	 * 检测是否拥有道具（已鉴定道具）
	 * @param	param0
	 * 			道具模板id
	 * @return	否拥有道具
	 */
	boolean haveLeak1Item(int param0);
	/**
	 * 检测是否拥有称号
	 * @param	param0
	 * 			称号id
	 * @return	否拥有称号
	 */
	boolean haveTitle(int param0);
	/**
	 * 检测是否拥有出租屋
	 * @param	param0
	 * 			屋子id
	 * @return	否拥有出租屋
	 */
	boolean houseId(int param0);
	/**
	 * 判断形象类型
	 * @return	形象类型
	 */
	int imageType();
	/**
	 * 道具编号开端(如Item1234)
	 * @param	param0
	 * 			Id of item.
	 * @return	否拥有道具
	 */
	int item(int param0);
	/**
	 * 判断道具创建到現在的时间差
	 * @param	param0
	 * 			道具模板id
	 * @return	时间差
	 */
	int ItemCreateTime(int param0);
	/**
	 * 判断指定道具当前耐久
	 * @param	param0
	 * 			道具模板id
	 * @return	耐久
	 */
	int itemdur(int param0);
	/**
	 * 判断指定道具当前耐久百分比
	 * @param	param0
	 * 			道具模板id
	 * @return	耐久百分比
	 */
	int itemdurper(int param0);
	/**
	 * 判断道具空间
	 * @return	物品栏剩余数量
	 */
	int ItemSpace();
	/**
	 * 判断人物职业编号
	 * @return	职业编号
	 */
	int job();
	/**
	 * 判断人物职业基础编号
	 * @return	职业基础编号
	 */
	int jobAncestry();
	/**
	 * 判断人物职业等級
	 * @return	职业等級
	 */
	int jobRank();
	/**
	 * 
	 */
	void killDrugdish();
	/**
	 * 刪除指定编号道具
	 * @param	param0
	 * 			道具模板id
	 */
	void killItem(int param0);
	/**
	 * 刪除指定编号下的所有道具
	 * @param	param0
	 * 			道具模板id
	 */
	void killItemall(int param0);
	/**
	 * 刪除指定编号下未鉴定的所有道具
	 * @param	param0
	 * 			道具模板id
	 * @param	param1
	 * 			道具数量
	 */
	void killLeak0Item(int param0, int param1);
	/**
	 * 刪除指定编号下已鉴定的所有道具
	 * @param	param0
	 * 			道具模板id
	 */
	void killLeak1Item(int param0);
	/**
	 * 刪除指定宠物
	 * @param	param0
	 * 			宠物模板id
	 */
	void killPet(int param0);
	/**
	 * 刪除指定宠物，级别不小于定值
	 * @param	param0
	 * 			宠物模板id
	 * @param	param1
	 * 			等级
	 */
	void killPetH(int param0, int param1);
	/**
	 * 刪除指定宠物，级别不大于定值
	 * @param	param0
	 * 			宠物模板id
	 * @param	param1
	 * 			等级
	 */
	void killPetL(int param0, int param1);
	/**
	 * 强制离队
	 */
	void leaveGroup();
	/**
	 * 判断等級
	 * @return	等级
	 */
	int level();
	/**
	 * 本地计量？类似与局部计量变量
	 */
	void localCount();
	/**
	 * 
	 */
	void localFlag();
	/**
	 * 判断生命值
	 * @return	当前生命值
	 */
	int lp();
	/**
	 * 判断最大魔法值
	 * @return	最大魔力值
	 */
	int maxFp();
	/**
	 * 判断最大生命值
	 * @return	最大生命值
	 */
	int maxLp();
	/**
	 * 显示系统提示 ，参数为msg编号
	 * @param	param0
	 * 			消息编号
	 */
	void message(int param0);
	/**
	 * 人物指定变更变身编号
	 * @return	变更变身编号
	 */
	int metamoCount();
	/**
	 * 
	 */
	void moveTo();
	/**
	 * 搭配Window指令
	 */
	void next();
	/**
	 * 搭配Window指令
	 */
	void no();
	/**
	 * 判断当前event值
	 * @param	param0
	 * 			事件索引
	 * @return	事件编号
	 */
	int nowEvent(int param0);
	/**
	 * 判断当前魔力时间(0~15)
	 * @return	时间
	 */
	int nowTime();
	/**
	 * 搭配Window指令
	 */
	void ok();
	/**
	 * 整个队伍中有几人装备某道具
	 * @param	param0
	 * 			道具模板id
	 * @param	param1
	 * 			
	 * @return	装备某道具人数
	 */
	int pEquipItem(int param0, int param1);
	/**
	 * 设定指定宠物等级
	 * @param	param0
	 * 			宠物模板id
	 * @return	等级
	 */
	int petLevel(int param0);
	/**
	 * 判断宠物栏当前剩余空格
	 * @return	宠物栏剩余空格
	 */
	int petSpace();
	/**
	 * 整个队伍的道具判断
	 * @param	param0
	 * 			道具模板id
	 * @param	param1
	 * 			
	 * @return	拥有某道具人数
	 */
	int phItem(int param0, int param1);
	/**
	 * 播放指定音效
	 */
	void play_SE();
	/**
	 * 播放指定音效
	 * @param	param0
	 * 			音效编号
	 * @param	param1
	 * 			
	 * @param	param2
	 * 			
	 */
	void playSe(int param0, int param1, int param2);
	/**
	 * 随即数设定
	 * @param	param0
	 * 			随机上限
	 * @param	param1
	 * 			随机下限
	 * @return	随机值
	 */
	int random(int param0, int param1);
	/**
	 * 指定npc动作(必須是可动的npc)
	 * @param	param0
	 * 			动作
	 */
	void setaction(int param0);
	/**
	 * 设定魅力值
	 * @param	param0
	 * 			"+/-"魅力
	 */
	void setCharm(String param0);
	/**
	 * 设定物品耐久
	 * @param	param0
	 * 			道具模板id
	 * @param	param1
	 * 			"+/-"耐久
	 */
	void setDur(int param0, String param1);
	/**
	 * 设定称号值
	 * @param	param0
	 * 			称号值
	 */
	void setFeverFlg(int param0);
	/**
	 * 设定房间剩余时间
	 * @param	param0
	 * 			屋子id
	 * @param	param1
	 * 			时间
	 */
	void setHouse(int param0, int param1);
	/**
	 * 设定房间剩余时间
	 * @param	param0
	 * 			屋子id
	 * @param	param1
	 * 			"+/-"时间
	 */
	void setHouseLimit(int param0, int param1);
	/**
	 * 设定等级
	 * @param	param0
	 * 			"+/-"等级
	 */
	void setLevel(int param0);
	/**
	 * 设定登陆点指令
	 * @param	param0
	 * 			登陆点
	 */
	void setLoginPoint(int param0);
	/**
	 * 设定生命值
	 * @param	param0
	 * 			"+/-"血量
	 */
	void setLp(int param0);
	/**
	 * 设定指定不可穿越道具
	 * @param	param0
	 * 			
	 * @param	param1
	 * 			地图模板id
	 * @param	param2
	 * 			东
	 * @param	param3
	 * 			南
	 * @param	param4
	 * 			物体id
	 */
	void setObject(int param0, int param1, int param2, int param3, int param4);
	/**
	 * 
	 */
	void setParameter();
	/**
	 * 设置访问者数量
	 * @param	param0
	 * 			"+/-"数量
	 */
	void setVisitor(int param0);
	/**
	 * 设定NPC变换形象
	 * @param	param0
	 * 			形象编号
	 */
	void shapeNext(int param0);
	/**
	 * 设定NPC取消形象
	 */
	void shapeOff();
	/**
	 * 设定NPC开启形象
	 */
	void shapeOn();
	/**
	 * 下船？
	 * @param	param0
	 * 			船编号
	 * @return	1=TRUE
	 */
	int shipcharDown(int param0);
	/**
	 * 上船
	 * @param	param0
	 * 			船编号
	 * @param	param1
	 * 			村子编号
	 * @return	1=TRUE
	 */
	int shipcharTake(int param0, int param1);
	/**
	 * 获取靠岸时间
	 * @return	停船时间
	 */
	int shipGetStopTime();
	/**
	 * 设定技能等級
	 * @param	param0
	 * 			技能模板id
	 * @return	技能等级
	 */
	int skillLevel(int param0);
	/**
	 * 
	 */
	void stackItemSpace();
	/**
	 * 判断 msg对话字句
	 * @param	param0
	 * 			内容
	 * @return	是否为指定字句
	 */
	boolean strCmpChat(String param0);
	/**
	 * 同上？
	 * @return	是否为指定字句
	 */
	boolean strStrchat();
	/**
	 * 系统信息？
	 * @param	param0
	 * 			内容
	 */
	void systemMessage(String param0);
	/**
	 * 
	 */
	void tGlobalFlag();
	/**
	 * 角色本身形象
	 * @return	形象编号
	 */
	int trueImage();
	/**
	 * 移动指令
	 * @param	param0
	 * 			地图信息
	 * @param	param1
	 * 			地图信息
	 * @param	param2
	 * 			地图信息
	 */
	void warp(String param0, String param1, String param2);
	/**
	 * 搭配Window_yes使用(玩家选no时)
	 */
	void window_NO();
	/**
	 * 玩家选确定后
	 */
	void window_OK();
	/**
	 * 玩家选"yes"时
	 * @param	param0
	 * 			布尔值
	 */
	void window_YES(boolean param0);
	/**
	 * 指定x坐标
	 * @return	东
	 */
	int xPos();
	/**
	 * 搭配window使用
	 * @param	param0
	 * 			布尔值
	 */
	void yes (boolean param0);

}
