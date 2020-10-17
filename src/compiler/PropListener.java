package compiler;// Generated from /home/hackerbuddy/dev/opensource/coms/grammar/Prop.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PropParser}.
 */
@SuppressWarnings("ALL")
public interface PropListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PropParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(PropParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PropParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(PropParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PropParser#prop}.
	 * @param ctx the parse tree
	 */
	void enterProp(PropParser.PropContext ctx);
	/**
	 * Exit a parse tree produced by {@link PropParser#prop}.
	 * @param ctx the parse tree
	 */
	void exitProp(PropParser.PropContext ctx);
}