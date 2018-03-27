package cg.data.script;

import java.io.File;
import java.io.FileReader;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import cg.data.script.antlr.GMSVBaseListener;
import cg.data.script.antlr.GMSVLexer;
import cg.data.script.antlr.GMSVParser;
import cg.data.script.antlr.GMSVParser.AndOrContext;
import cg.data.script.antlr.GMSVParser.BlockContext;
import cg.data.script.antlr.GMSVParser.EndwindowContext;
import cg.data.script.antlr.GMSVParser.ExprBooContext;
import cg.data.script.antlr.GMSVParser.IntContext;
import cg.data.script.antlr.GMSVParser.ItemContext;
import cg.data.script.antlr.GMSVParser.JobContext;
import cg.data.script.help.BooleanHelpers;
import cg.data.script.help.IntBooleanHelpers;

public class Syscall extends GMSVBaseListener {
	
	private final ParseTreeProperty<Integer> intProperty = new ParseTreeProperty<>();
	
	private final ParseTreeProperty<Boolean> booleanProperty = new ParseTreeProperty<>();
	
	private ScriptCall call;
	
	protected void putValue(ParseTree node, int value) {
		intProperty.put(node, value);
	}
	
	protected int getIntValue(ParseTree node) {
		return intProperty.get(node);
	}
	
	protected void putValue(ParseTree node, boolean value) {
		booleanProperty.put(node, value);
	}
	
	protected boolean getBooleanValue(ParseTree node) {
		return booleanProperty.get(node);
	}
	
	@Override
	public void enterBlock(BlockContext ctx) {
		System.out.println("BlockContext : " + ctx.getText());
		printChildren(ctx);
	}
	
	@Override
	public void enterJob(JobContext ctx) {
		putValue(ctx, call.job());
	}
	
//	protected final <T> void pushVariable(T variable) {
//		variables.add(variable);
//	}

	@Override
	public void enterInt(IntContext ctx) {
		putValue(ctx, Integer.parseInt(ctx.INT().getText()));
	}

	@Override
	public void exitItem(ItemContext ctx) {
		int itemId = Integer.parseInt(ctx.getChild(1).getText());
		System.out.println("exitItem itemId = " + itemId);
		putValue(ctx, call.item(itemId));
	}

	@Override
	public final void exitExprBoo(ExprBooContext ctx) {
		printChildren(ctx);
		int left = getIntValue(ctx.getChild(0));
		int right = getIntValue(ctx.getChild(1));
		boolean result = IntBooleanHelpers.compare(ctx.op.getType(), left, right);
		System.out.println("ctx result : " + ctx.getText() + " = " + result);
		putValue(ctx, result);
	}

	@Override
	public void exitAndOr(AndOrContext ctx) {
		boolean left = getBooleanValue(ctx.getChild(0));
		boolean right = getBooleanValue(ctx.getChild(1));
		boolean result = BooleanHelpers.compare(ctx.op.getType(), left, right);
		System.out.println("ctx result : " + ctx.getText() + " = " + result);
		putValue(ctx, result);
	}

	@Override
	public void enterEndwindow(EndwindowContext ctx) {
		System.out.println("enterEndwindow" + ctx.getText());
		printChildren(ctx);
	}

	protected static void printChildren(ParserRuleContext ctx) {
		for (int i = 0, loop = ctx.getChildCount();i < loop;i++) {
			System.out.println(i + " : " + ctx.getChild(i).getText());
		}
	}
	
	public final void clear(ParseTree node) {
		intProperty.removeFrom(node);
		booleanProperty.removeFrom(node);
	}

	public static void main(String[] args) {
		try {
			ANTLRInputStream in = new ANTLRInputStream(new FileReader(new File("D:/My_space/CrossGateData/src/cg/data/script/test.txt")));
//			ANTLRInputStream in = new ANTLRInputStream(System.in);
			GMSVLexer lexer = new GMSVLexer(in);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			GMSVParser parse = new GMSVParser(tokens);
//			ParseTree parseTree = parse.mutilCOMMON();
//			ParseTree parseTree = parse.block();
			ParseTree parseTree = parse.exprBoolean();
			ParseTreeWalker walker = new ParseTreeWalker();
			Syscall syscall = new Syscall();
			walker.walk(syscall, parseTree);
			syscall.clear(parseTree);
//			System.out.println("Result : " + syscall.getResult().toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
