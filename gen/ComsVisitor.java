// Generated from /home/hackerbuddy/dev/opensource/coms/grammar/Coms.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ComsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ComsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ComsParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ComsParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComsParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCom(ComsParser.ComContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComsParser#declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(ComsParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComsParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(ComsParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComsParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(ComsParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComsParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(ComsParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ComsParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(ComsParser.ValueContext ctx);
}