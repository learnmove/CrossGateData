// Generated from D:\My_space\CrossGateData\src\cg\data\script\antlr\GMSV.g4 by ANTLR 4.5.1

package cg.data.script.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GMSVParser}.
 */
public interface GMSVListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GMSVParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(GMSVParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(GMSVParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#exprString}.
	 * @param ctx the parse tree
	 */
	void enterExprString(GMSVParser.ExprStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#exprString}.
	 * @param ctx the parse tree
	 */
	void exitExprString(GMSVParser.ExprStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boo}
	 * labeled alternative in {@link GMSVParser#exprBoolean}.
	 * @param ctx the parse tree
	 */
	void enterBoo(GMSVParser.BooContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boo}
	 * labeled alternative in {@link GMSVParser#exprBoolean}.
	 * @param ctx the parse tree
	 */
	void exitBoo(GMSVParser.BooContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booParens}
	 * labeled alternative in {@link GMSVParser#exprBoolean}.
	 * @param ctx the parse tree
	 */
	void enterBooParens(GMSVParser.BooParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booParens}
	 * labeled alternative in {@link GMSVParser#exprBoolean}.
	 * @param ctx the parse tree
	 */
	void exitBooParens(GMSVParser.BooParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBoo}
	 * labeled alternative in {@link GMSVParser#exprBoolean}.
	 * @param ctx the parse tree
	 */
	void enterExprBoo(GMSVParser.ExprBooContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoo}
	 * labeled alternative in {@link GMSVParser#exprBoolean}.
	 * @param ctx the parse tree
	 */
	void exitExprBoo(GMSVParser.ExprBooContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulBoo}
	 * labeled alternative in {@link GMSVParser#exprBoolean}.
	 * @param ctx the parse tree
	 */
	void enterMulBoo(GMSVParser.MulBooContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulBoo}
	 * labeled alternative in {@link GMSVParser#exprBoolean}.
	 * @param ctx the parse tree
	 */
	void exitMulBoo(GMSVParser.MulBooContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndOr}
	 * labeled alternative in {@link GMSVParser#exprBoolean}.
	 * @param ctx the parse tree
	 */
	void enterAndOr(GMSVParser.AndOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndOr}
	 * labeled alternative in {@link GMSVParser#exprBoolean}.
	 * @param ctx the parse tree
	 */
	void exitAndOr(GMSVParser.AndOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link GMSVParser#exprInt}.
	 * @param ctx the parse tree
	 */
	void enterParens(GMSVParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link GMSVParser#exprInt}.
	 * @param ctx the parse tree
	 */
	void exitParens(GMSVParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link GMSVParser#exprInt}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(GMSVParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link GMSVParser#exprInt}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(GMSVParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link GMSVParser#exprInt}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(GMSVParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link GMSVParser#exprInt}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(GMSVParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intRule}
	 * labeled alternative in {@link GMSVParser#exprInt}.
	 * @param ctx the parse tree
	 */
	void enterIntRule(GMSVParser.IntRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intRule}
	 * labeled alternative in {@link GMSVParser#exprInt}.
	 * @param ctx the parse tree
	 */
	void exitIntRule(GMSVParser.IntRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link GMSVParser#exprInt}.
	 * @param ctx the parse tree
	 */
	void enterId(GMSVParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link GMSVParser#exprInt}.
	 * @param ctx the parse tree
	 */
	void exitId(GMSVParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link GMSVParser#exprInt}.
	 * @param ctx the parse tree
	 */
	void enterInt(GMSVParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link GMSVParser#exprInt}.
	 * @param ctx the parse tree
	 */
	void exitInt(GMSVParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiBlock}
	 * labeled alternative in {@link GMSVParser#progRule}.
	 * @param ctx the parse tree
	 */
	void enterMultiBlock(GMSVParser.MultiBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiBlock}
	 * labeled alternative in {@link GMSVParser#progRule}.
	 * @param ctx the parse tree
	 */
	void exitMultiBlock(GMSVParser.MultiBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comRule}
	 * labeled alternative in {@link GMSVParser#progRule}.
	 * @param ctx the parse tree
	 */
	void enterComRule(GMSVParser.ComRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comRule}
	 * labeled alternative in {@link GMSVParser#progRule}.
	 * @param ctx the parse tree
	 */
	void exitComRule(GMSVParser.ComRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#commonRule}.
	 * @param ctx the parse tree
	 */
	void enterCommonRule(GMSVParser.CommonRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#commonRule}.
	 * @param ctx the parse tree
	 */
	void exitCommonRule(GMSVParser.CommonRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#blockRule}.
	 * @param ctx the parse tree
	 */
	void enterBlockRule(GMSVParser.BlockRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#blockRule}.
	 * @param ctx the parse tree
	 */
	void exitBlockRule(GMSVParser.BlockRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#addfeversec}.
	 * @param ctx the parse tree
	 */
	void enterAddfeversec(GMSVParser.AddfeversecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#addfeversec}.
	 * @param ctx the parse tree
	 */
	void exitAddfeversec(GMSVParser.AddfeversecContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#addgold}.
	 * @param ctx the parse tree
	 */
	void enterAddgold(GMSVParser.AddgoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#addgold}.
	 * @param ctx the parse tree
	 */
	void exitAddgold(GMSVParser.AddgoldContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#addgoldlevel}.
	 * @param ctx the parse tree
	 */
	void enterAddgoldlevel(GMSVParser.AddgoldlevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#addgoldlevel}.
	 * @param ctx the parse tree
	 */
	void exitAddgoldlevel(GMSVParser.AddgoldlevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#addluck}.
	 * @param ctx the parse tree
	 */
	void enterAddluck(GMSVParser.AddluckContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#addluck}.
	 * @param ctx the parse tree
	 */
	void exitAddluck(GMSVParser.AddluckContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#addskillslot}.
	 * @param ctx the parse tree
	 */
	void enterAddskillslot(GMSVParser.AddskillslotContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#addskillslot}.
	 * @param ctx the parse tree
	 */
	void exitAddskillslot(GMSVParser.AddskillslotContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#addstampcount}.
	 * @param ctx the parse tree
	 */
	void enterAddstampcount(GMSVParser.AddstampcountContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#addstampcount}.
	 * @param ctx the parse tree
	 */
	void exitAddstampcount(GMSVParser.AddstampcountContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#bimage}.
	 * @param ctx the parse tree
	 */
	void enterBimage(GMSVParser.BimageContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#bimage}.
	 * @param ctx the parse tree
	 */
	void exitBimage(GMSVParser.BimageContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#bbimage}.
	 * @param ctx the parse tree
	 */
	void enterBbimage(GMSVParser.BbimageContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#bbimage}.
	 * @param ctx the parse tree
	 */
	void exitBbimage(GMSVParser.BbimageContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GMSVParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GMSVParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#changepal}.
	 * @param ctx the parse tree
	 */
	void enterChangepal(GMSVParser.ChangepalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#changepal}.
	 * @param ctx the parse tree
	 */
	void exitChangepal(GMSVParser.ChangepalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#checkitemcategory}.
	 * @param ctx the parse tree
	 */
	void enterCheckitemcategory(GMSVParser.CheckitemcategoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#checkitemcategory}.
	 * @param ctx the parse tree
	 */
	void exitCheckitemcategory(GMSVParser.CheckitemcategoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#checkrealtime}.
	 * @param ctx the parse tree
	 */
	void enterCheckrealtime(GMSVParser.CheckrealtimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#checkrealtime}.
	 * @param ctx the parse tree
	 */
	void exitCheckrealtime(GMSVParser.CheckrealtimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#checkskillslot}.
	 * @param ctx the parse tree
	 */
	void enterCheckskillslot(GMSVParser.CheckskillslotContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#checkskillslot}.
	 * @param ctx the parse tree
	 */
	void exitCheckskillslot(GMSVParser.CheckskillslotContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#checktitle}.
	 * @param ctx the parse tree
	 */
	void enterChecktitle(GMSVParser.ChecktitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#checktitle}.
	 * @param ctx the parse tree
	 */
	void exitChecktitle(GMSVParser.ChecktitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#encount}.
	 * @param ctx the parse tree
	 */
	void enterEncount(GMSVParser.EncountContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#encount}.
	 * @param ctx the parse tree
	 */
	void exitEncount(GMSVParser.EncountContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#endevent}.
	 * @param ctx the parse tree
	 */
	void enterEndevent(GMSVParser.EndeventContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#endevent}.
	 * @param ctx the parse tree
	 */
	void exitEndevent(GMSVParser.EndeventContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#endwindow}.
	 * @param ctx the parse tree
	 */
	void enterEndwindow(GMSVParser.EndwindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#endwindow}.
	 * @param ctx the parse tree
	 */
	void exitEndwindow(GMSVParser.EndwindowContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#equipitem}.
	 * @param ctx the parse tree
	 */
	void enterEquipitem(GMSVParser.EquipitemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#equipitem}.
	 * @param ctx the parse tree
	 */
	void exitEquipitem(GMSVParser.EquipitemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#fame}.
	 * @param ctx the parse tree
	 */
	void enterFame(GMSVParser.FameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#fame}.
	 * @param ctx the parse tree
	 */
	void exitFame(GMSVParser.FameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#floor}.
	 * @param ctx the parse tree
	 */
	void enterFloor(GMSVParser.FloorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#floor}.
	 * @param ctx the parse tree
	 */
	void exitFloor(GMSVParser.FloorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#fp}.
	 * @param ctx the parse tree
	 */
	void enterFp(GMSVParser.FpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#fp}.
	 * @param ctx the parse tree
	 */
	void exitFp(GMSVParser.FpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#gaendwindow}.
	 * @param ctx the parse tree
	 */
	void enterGaendwindow(GMSVParser.GaendwindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#gaendwindow}.
	 * @param ctx the parse tree
	 */
	void exitGaendwindow(GMSVParser.GaendwindowContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#gawindow}.
	 * @param ctx the parse tree
	 */
	void enterGawindow(GMSVParser.GawindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#gawindow}.
	 * @param ctx the parse tree
	 */
	void exitGawindow(GMSVParser.GawindowContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#giveitem}.
	 * @param ctx the parse tree
	 */
	void enterGiveitem(GMSVParser.GiveitemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#giveitem}.
	 * @param ctx the parse tree
	 */
	void exitGiveitem(GMSVParser.GiveitemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#giveleak0item}.
	 * @param ctx the parse tree
	 */
	void enterGiveleak0item(GMSVParser.Giveleak0itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#giveleak0item}.
	 * @param ctx the parse tree
	 */
	void exitGiveleak0item(GMSVParser.Giveleak0itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#giveleak1item}.
	 * @param ctx the parse tree
	 */
	void enterGiveleak1item(GMSVParser.Giveleak1itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#giveleak1item}.
	 * @param ctx the parse tree
	 */
	void exitGiveleak1item(GMSVParser.Giveleak1itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#givepet}.
	 * @param ctx the parse tree
	 */
	void enterGivepet(GMSVParser.GivepetContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#givepet}.
	 * @param ctx the parse tree
	 */
	void exitGivepet(GMSVParser.GivepetContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#giverecipe}.
	 * @param ctx the parse tree
	 */
	void enterGiverecipe(GMSVParser.GiverecipeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#giverecipe}.
	 * @param ctx the parse tree
	 */
	void exitGiverecipe(GMSVParser.GiverecipeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#givestackitem}.
	 * @param ctx the parse tree
	 */
	void enterGivestackitem(GMSVParser.GivestackitemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#givestackitem}.
	 * @param ctx the parse tree
	 */
	void exitGivestackitem(GMSVParser.GivestackitemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#globalflag}.
	 * @param ctx the parse tree
	 */
	void enterGlobalflag(GMSVParser.GlobalflagContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#globalflag}.
	 * @param ctx the parse tree
	 */
	void exitGlobalflag(GMSVParser.GlobalflagContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#globaltimer}.
	 * @param ctx the parse tree
	 */
	void enterGlobaltimer(GMSVParser.GlobaltimerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#globaltimer}.
	 * @param ctx the parse tree
	 */
	void exitGlobaltimer(GMSVParser.GlobaltimerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#gold}.
	 * @param ctx the parse tree
	 */
	void enterGold(GMSVParser.GoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#gold}.
	 * @param ctx the parse tree
	 */
	void exitGold(GMSVParser.GoldContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#gotob}.
	 * @param ctx the parse tree
	 */
	void enterGotob(GMSVParser.GotobContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#gotob}.
	 * @param ctx the parse tree
	 */
	void exitGotob(GMSVParser.GotobContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#gotof}.
	 * @param ctx the parse tree
	 */
	void enterGotof(GMSVParser.GotofContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#gotof}.
	 * @param ctx the parse tree
	 */
	void exitGotof(GMSVParser.GotofContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(GMSVParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(GMSVParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#haveitem}.
	 * @param ctx the parse tree
	 */
	void enterHaveitem(GMSVParser.HaveitemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#haveitem}.
	 * @param ctx the parse tree
	 */
	void exitHaveitem(GMSVParser.HaveitemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#haveleak0item}.
	 * @param ctx the parse tree
	 */
	void enterHaveleak0item(GMSVParser.Haveleak0itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#haveleak0item}.
	 * @param ctx the parse tree
	 */
	void exitHaveleak0item(GMSVParser.Haveleak0itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#haveleak1item}.
	 * @param ctx the parse tree
	 */
	void enterHaveleak1item(GMSVParser.Haveleak1itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#haveleak1item}.
	 * @param ctx the parse tree
	 */
	void exitHaveleak1item(GMSVParser.Haveleak1itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#havetitle}.
	 * @param ctx the parse tree
	 */
	void enterHavetitle(GMSVParser.HavetitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#havetitle}.
	 * @param ctx the parse tree
	 */
	void exitHavetitle(GMSVParser.HavetitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#houseid}.
	 * @param ctx the parse tree
	 */
	void enterHouseid(GMSVParser.HouseidContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#houseid}.
	 * @param ctx the parse tree
	 */
	void exitHouseid(GMSVParser.HouseidContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#imagetype}.
	 * @param ctx the parse tree
	 */
	void enterImagetype(GMSVParser.ImagetypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#imagetype}.
	 * @param ctx the parse tree
	 */
	void exitImagetype(GMSVParser.ImagetypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(GMSVParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(GMSVParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#itemcreatetime}.
	 * @param ctx the parse tree
	 */
	void enterItemcreatetime(GMSVParser.ItemcreatetimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#itemcreatetime}.
	 * @param ctx the parse tree
	 */
	void exitItemcreatetime(GMSVParser.ItemcreatetimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#itemdur}.
	 * @param ctx the parse tree
	 */
	void enterItemdur(GMSVParser.ItemdurContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#itemdur}.
	 * @param ctx the parse tree
	 */
	void exitItemdur(GMSVParser.ItemdurContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#itemdurper}.
	 * @param ctx the parse tree
	 */
	void enterItemdurper(GMSVParser.ItemdurperContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#itemdurper}.
	 * @param ctx the parse tree
	 */
	void exitItemdurper(GMSVParser.ItemdurperContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#itemspace}.
	 * @param ctx the parse tree
	 */
	void enterItemspace(GMSVParser.ItemspaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#itemspace}.
	 * @param ctx the parse tree
	 */
	void exitItemspace(GMSVParser.ItemspaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#job}.
	 * @param ctx the parse tree
	 */
	void enterJob(GMSVParser.JobContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#job}.
	 * @param ctx the parse tree
	 */
	void exitJob(GMSVParser.JobContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#jobancestry}.
	 * @param ctx the parse tree
	 */
	void enterJobancestry(GMSVParser.JobancestryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#jobancestry}.
	 * @param ctx the parse tree
	 */
	void exitJobancestry(GMSVParser.JobancestryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#jobrank}.
	 * @param ctx the parse tree
	 */
	void enterJobrank(GMSVParser.JobrankContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#jobrank}.
	 * @param ctx the parse tree
	 */
	void exitJobrank(GMSVParser.JobrankContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#killdrugdish}.
	 * @param ctx the parse tree
	 */
	void enterKilldrugdish(GMSVParser.KilldrugdishContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#killdrugdish}.
	 * @param ctx the parse tree
	 */
	void exitKilldrugdish(GMSVParser.KilldrugdishContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#killitem}.
	 * @param ctx the parse tree
	 */
	void enterKillitem(GMSVParser.KillitemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#killitem}.
	 * @param ctx the parse tree
	 */
	void exitKillitem(GMSVParser.KillitemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#killitemall}.
	 * @param ctx the parse tree
	 */
	void enterKillitemall(GMSVParser.KillitemallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#killitemall}.
	 * @param ctx the parse tree
	 */
	void exitKillitemall(GMSVParser.KillitemallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#killleak0item}.
	 * @param ctx the parse tree
	 */
	void enterKillleak0item(GMSVParser.Killleak0itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#killleak0item}.
	 * @param ctx the parse tree
	 */
	void exitKillleak0item(GMSVParser.Killleak0itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#killleak1item}.
	 * @param ctx the parse tree
	 */
	void enterKillleak1item(GMSVParser.Killleak1itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#killleak1item}.
	 * @param ctx the parse tree
	 */
	void exitKillleak1item(GMSVParser.Killleak1itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#killpet}.
	 * @param ctx the parse tree
	 */
	void enterKillpet(GMSVParser.KillpetContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#killpet}.
	 * @param ctx the parse tree
	 */
	void exitKillpet(GMSVParser.KillpetContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#killpeth}.
	 * @param ctx the parse tree
	 */
	void enterKillpeth(GMSVParser.KillpethContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#killpeth}.
	 * @param ctx the parse tree
	 */
	void exitKillpeth(GMSVParser.KillpethContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#killpetl}.
	 * @param ctx the parse tree
	 */
	void enterKillpetl(GMSVParser.KillpetlContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#killpetl}.
	 * @param ctx the parse tree
	 */
	void exitKillpetl(GMSVParser.KillpetlContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#leavegroup}.
	 * @param ctx the parse tree
	 */
	void enterLeavegroup(GMSVParser.LeavegroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#leavegroup}.
	 * @param ctx the parse tree
	 */
	void exitLeavegroup(GMSVParser.LeavegroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#level}.
	 * @param ctx the parse tree
	 */
	void enterLevel(GMSVParser.LevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#level}.
	 * @param ctx the parse tree
	 */
	void exitLevel(GMSVParser.LevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#localcount}.
	 * @param ctx the parse tree
	 */
	void enterLocalcount(GMSVParser.LocalcountContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#localcount}.
	 * @param ctx the parse tree
	 */
	void exitLocalcount(GMSVParser.LocalcountContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#localflag}.
	 * @param ctx the parse tree
	 */
	void enterLocalflag(GMSVParser.LocalflagContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#localflag}.
	 * @param ctx the parse tree
	 */
	void exitLocalflag(GMSVParser.LocalflagContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#lp}.
	 * @param ctx the parse tree
	 */
	void enterLp(GMSVParser.LpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#lp}.
	 * @param ctx the parse tree
	 */
	void exitLp(GMSVParser.LpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#maxfp}.
	 * @param ctx the parse tree
	 */
	void enterMaxfp(GMSVParser.MaxfpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#maxfp}.
	 * @param ctx the parse tree
	 */
	void exitMaxfp(GMSVParser.MaxfpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#maxlp}.
	 * @param ctx the parse tree
	 */
	void enterMaxlp(GMSVParser.MaxlpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#maxlp}.
	 * @param ctx the parse tree
	 */
	void exitMaxlp(GMSVParser.MaxlpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(GMSVParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(GMSVParser.MessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#metamocount}.
	 * @param ctx the parse tree
	 */
	void enterMetamocount(GMSVParser.MetamocountContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#metamocount}.
	 * @param ctx the parse tree
	 */
	void exitMetamocount(GMSVParser.MetamocountContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#next}.
	 * @param ctx the parse tree
	 */
	void enterNext(GMSVParser.NextContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#next}.
	 * @param ctx the parse tree
	 */
	void exitNext(GMSVParser.NextContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#no}.
	 * @param ctx the parse tree
	 */
	void enterNo(GMSVParser.NoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#no}.
	 * @param ctx the parse tree
	 */
	void exitNo(GMSVParser.NoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#nowevent}.
	 * @param ctx the parse tree
	 */
	void enterNowevent(GMSVParser.NoweventContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#nowevent}.
	 * @param ctx the parse tree
	 */
	void exitNowevent(GMSVParser.NoweventContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#nowtime}.
	 * @param ctx the parse tree
	 */
	void enterNowtime(GMSVParser.NowtimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#nowtime}.
	 * @param ctx the parse tree
	 */
	void exitNowtime(GMSVParser.NowtimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#ok}.
	 * @param ctx the parse tree
	 */
	void enterOk(GMSVParser.OkContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#ok}.
	 * @param ctx the parse tree
	 */
	void exitOk(GMSVParser.OkContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#pequipitem}.
	 * @param ctx the parse tree
	 */
	void enterPequipitem(GMSVParser.PequipitemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#pequipitem}.
	 * @param ctx the parse tree
	 */
	void exitPequipitem(GMSVParser.PequipitemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#petlevel}.
	 * @param ctx the parse tree
	 */
	void enterPetlevel(GMSVParser.PetlevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#petlevel}.
	 * @param ctx the parse tree
	 */
	void exitPetlevel(GMSVParser.PetlevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#petspace}.
	 * @param ctx the parse tree
	 */
	void enterPetspace(GMSVParser.PetspaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#petspace}.
	 * @param ctx the parse tree
	 */
	void exitPetspace(GMSVParser.PetspaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#phitem}.
	 * @param ctx the parse tree
	 */
	void enterPhitem(GMSVParser.PhitemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#phitem}.
	 * @param ctx the parse tree
	 */
	void exitPhitem(GMSVParser.PhitemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#playse}.
	 * @param ctx the parse tree
	 */
	void enterPlayse(GMSVParser.PlayseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#playse}.
	 * @param ctx the parse tree
	 */
	void exitPlayse(GMSVParser.PlayseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#random}.
	 * @param ctx the parse tree
	 */
	void enterRandom(GMSVParser.RandomContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#random}.
	 * @param ctx the parse tree
	 */
	void exitRandom(GMSVParser.RandomContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#setaction}.
	 * @param ctx the parse tree
	 */
	void enterSetaction(GMSVParser.SetactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#setaction}.
	 * @param ctx the parse tree
	 */
	void exitSetaction(GMSVParser.SetactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#setcharm}.
	 * @param ctx the parse tree
	 */
	void enterSetcharm(GMSVParser.SetcharmContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#setcharm}.
	 * @param ctx the parse tree
	 */
	void exitSetcharm(GMSVParser.SetcharmContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#setdur}.
	 * @param ctx the parse tree
	 */
	void enterSetdur(GMSVParser.SetdurContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#setdur}.
	 * @param ctx the parse tree
	 */
	void exitSetdur(GMSVParser.SetdurContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#setfeverflg}.
	 * @param ctx the parse tree
	 */
	void enterSetfeverflg(GMSVParser.SetfeverflgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#setfeverflg}.
	 * @param ctx the parse tree
	 */
	void exitSetfeverflg(GMSVParser.SetfeverflgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#sethouse}.
	 * @param ctx the parse tree
	 */
	void enterSethouse(GMSVParser.SethouseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#sethouse}.
	 * @param ctx the parse tree
	 */
	void exitSethouse(GMSVParser.SethouseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#sethouselimit}.
	 * @param ctx the parse tree
	 */
	void enterSethouselimit(GMSVParser.SethouselimitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#sethouselimit}.
	 * @param ctx the parse tree
	 */
	void exitSethouselimit(GMSVParser.SethouselimitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#setlevel}.
	 * @param ctx the parse tree
	 */
	void enterSetlevel(GMSVParser.SetlevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#setlevel}.
	 * @param ctx the parse tree
	 */
	void exitSetlevel(GMSVParser.SetlevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#setloginpoint}.
	 * @param ctx the parse tree
	 */
	void enterSetloginpoint(GMSVParser.SetloginpointContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#setloginpoint}.
	 * @param ctx the parse tree
	 */
	void exitSetloginpoint(GMSVParser.SetloginpointContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#setlp}.
	 * @param ctx the parse tree
	 */
	void enterSetlp(GMSVParser.SetlpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#setlp}.
	 * @param ctx the parse tree
	 */
	void exitSetlp(GMSVParser.SetlpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#setobject}.
	 * @param ctx the parse tree
	 */
	void enterSetobject(GMSVParser.SetobjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#setobject}.
	 * @param ctx the parse tree
	 */
	void exitSetobject(GMSVParser.SetobjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#setvisitor}.
	 * @param ctx the parse tree
	 */
	void enterSetvisitor(GMSVParser.SetvisitorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#setvisitor}.
	 * @param ctx the parse tree
	 */
	void exitSetvisitor(GMSVParser.SetvisitorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#shapenext}.
	 * @param ctx the parse tree
	 */
	void enterShapenext(GMSVParser.ShapenextContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#shapenext}.
	 * @param ctx the parse tree
	 */
	void exitShapenext(GMSVParser.ShapenextContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#shipchardown}.
	 * @param ctx the parse tree
	 */
	void enterShipchardown(GMSVParser.ShipchardownContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#shipchardown}.
	 * @param ctx the parse tree
	 */
	void exitShipchardown(GMSVParser.ShipchardownContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#shipchartake}.
	 * @param ctx the parse tree
	 */
	void enterShipchartake(GMSVParser.ShipchartakeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#shipchartake}.
	 * @param ctx the parse tree
	 */
	void exitShipchartake(GMSVParser.ShipchartakeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#shipgetstoptime}.
	 * @param ctx the parse tree
	 */
	void enterShipgetstoptime(GMSVParser.ShipgetstoptimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#shipgetstoptime}.
	 * @param ctx the parse tree
	 */
	void exitShipgetstoptime(GMSVParser.ShipgetstoptimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#skilllevel}.
	 * @param ctx the parse tree
	 */
	void enterSkilllevel(GMSVParser.SkilllevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#skilllevel}.
	 * @param ctx the parse tree
	 */
	void exitSkilllevel(GMSVParser.SkilllevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#stackitemspace}.
	 * @param ctx the parse tree
	 */
	void enterStackitemspace(GMSVParser.StackitemspaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#stackitemspace}.
	 * @param ctx the parse tree
	 */
	void exitStackitemspace(GMSVParser.StackitemspaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#strcmpchat}.
	 * @param ctx the parse tree
	 */
	void enterStrcmpchat(GMSVParser.StrcmpchatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#strcmpchat}.
	 * @param ctx the parse tree
	 */
	void exitStrcmpchat(GMSVParser.StrcmpchatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#strstrchat}.
	 * @param ctx the parse tree
	 */
	void enterStrstrchat(GMSVParser.StrstrchatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#strstrchat}.
	 * @param ctx the parse tree
	 */
	void exitStrstrchat(GMSVParser.StrstrchatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#systemmessage}.
	 * @param ctx the parse tree
	 */
	void enterSystemmessage(GMSVParser.SystemmessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#systemmessage}.
	 * @param ctx the parse tree
	 */
	void exitSystemmessage(GMSVParser.SystemmessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#trueimage}.
	 * @param ctx the parse tree
	 */
	void enterTrueimage(GMSVParser.TrueimageContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#trueimage}.
	 * @param ctx the parse tree
	 */
	void exitTrueimage(GMSVParser.TrueimageContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#warp}.
	 * @param ctx the parse tree
	 */
	void enterWarp(GMSVParser.WarpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#warp}.
	 * @param ctx the parse tree
	 */
	void exitWarp(GMSVParser.WarpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#window_no}.
	 * @param ctx the parse tree
	 */
	void enterWindow_no(GMSVParser.Window_noContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#window_no}.
	 * @param ctx the parse tree
	 */
	void exitWindow_no(GMSVParser.Window_noContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#window_ok}.
	 * @param ctx the parse tree
	 */
	void enterWindow_ok(GMSVParser.Window_okContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#window_ok}.
	 * @param ctx the parse tree
	 */
	void exitWindow_ok(GMSVParser.Window_okContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#window_yes}.
	 * @param ctx the parse tree
	 */
	void enterWindow_yes(GMSVParser.Window_yesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#window_yes}.
	 * @param ctx the parse tree
	 */
	void exitWindow_yes(GMSVParser.Window_yesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#xpos}.
	 * @param ctx the parse tree
	 */
	void enterXpos(GMSVParser.XposContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#xpos}.
	 * @param ctx the parse tree
	 */
	void exitXpos(GMSVParser.XposContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#yes}.
	 * @param ctx the parse tree
	 */
	void enterYes(GMSVParser.YesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#yes}.
	 * @param ctx the parse tree
	 */
	void exitYes(GMSVParser.YesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#multiCOMMON}.
	 * @param ctx the parse tree
	 */
	void enterMultiCOMMON(GMSVParser.MultiCOMMONContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#multiCOMMON}.
	 * @param ctx the parse tree
	 */
	void exitMultiCOMMON(GMSVParser.MultiCOMMONContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#multiINT}.
	 * @param ctx the parse tree
	 */
	void enterMultiINT(GMSVParser.MultiINTContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#multiINT}.
	 * @param ctx the parse tree
	 */
	void exitMultiINT(GMSVParser.MultiINTContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#multiBOOLEAN}.
	 * @param ctx the parse tree
	 */
	void enterMultiBOOLEAN(GMSVParser.MultiBOOLEANContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#multiBOOLEAN}.
	 * @param ctx the parse tree
	 */
	void exitMultiBOOLEAN(GMSVParser.MultiBOOLEANContext ctx);
}