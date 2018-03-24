package cg.data.script;

import java.io.File;
import java.io.FileReader;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.google.common.collect.Lists;

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
	
	private List<Object> variables = Lists.newLinkedList();
	
	@Override
	public void enterBlock(BlockContext ctx) {
		System.out.println("BlockContext : " + ctx.getText());
		printChildren(ctx);
	}
	
	@Override
	public void enterJob(JobContext ctx) {
		pushVariable(1);
	}
	
	protected final <T> void pushVariable(T variable) {
		variables.add(variable);
	}

	@Override
	public void enterInt(IntContext ctx) {
		pushVariable(Integer.parseInt(ctx.getText()));
	}

	@Override
	public void exitItem(ItemContext ctx) {
		int itemId = Integer.parseInt(ctx.getChild(1).getText());
		System.out.println("exitItem itemId = " + itemId);
		pushVariable(1);
	}

	@Override
	public final void exitExprBoo(ExprBooContext ctx) {
		printChildren(ctx);
		boolean result = IntBooleanHelpers.reverseCompare(ctx.op.getType(), popLast(), popLast());
		System.out.println("ctx result : " + ctx.getText() + " = " + result);
		pushVariable(result);
	}
	
	@SuppressWarnings("unchecked")
	protected final <T> T popLast() {
		return (T) variables.remove(variables.size() - 1);
	}

	@Override
	public void exitAndOr(AndOrContext ctx) {
		boolean result = BooleanHelpers.reverseCompare(ctx.op.getType(), popLast(), popLast());
		System.out.println("ctx result : " + ctx.getText() + " = " + result);
		pushVariable(result);
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
	
	@SuppressWarnings("unchecked")
	public final <T> T getResult() {
		return (T) variables.get(variables.size() - 1);
	}
	
	public final void clear() {
		variables.clear();
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
			System.out.println("Result : " + syscall.getResult().toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
