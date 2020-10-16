// Generated from /home/hackerbuddy/dev/opensource/coms/grammar/Coms.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ComsParser}.
 */
public interface ComsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ComsParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ComsParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComsParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ComsParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComsParser#com}.
	 * @param ctx the parse tree
	 */
	void enterCom(ComsParser.ComContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComsParser#com}.
	 * @param ctx the parse tree
	 */
	void exitCom(ComsParser.ComContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComsParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(ComsParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComsParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(ComsParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComsParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(ComsParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComsParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(ComsParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComsParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(ComsParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComsParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(ComsParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComsParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(ComsParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComsParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(ComsParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComsParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ComsParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComsParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ComsParser.ValueContext ctx);
}