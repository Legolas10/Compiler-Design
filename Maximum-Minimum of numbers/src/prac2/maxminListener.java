package prac2;
// Generated from maxmin.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link maxminParser}.
 */
public interface maxminListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link maxminParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(maxminParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link maxminParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(maxminParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link maxminParser#b}.
	 * @param ctx the parse tree
	 */
	void enterB(maxminParser.BContext ctx);
	/**
	 * Exit a parse tree produced by {@link maxminParser#b}.
	 * @param ctx the parse tree
	 */
	void exitB(maxminParser.BContext ctx);
	/**
	 * Enter a parse tree produced by {@link maxminParser#c}.
	 * @param ctx the parse tree
	 */
	void enterC(maxminParser.CContext ctx);
	/**
	 * Exit a parse tree produced by {@link maxminParser#c}.
	 * @param ctx the parse tree
	 */
	void exitC(maxminParser.CContext ctx);
}