// Generated from bindec.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link bindecParser}.
 */
public interface bindecListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link bindecParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(bindecParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link bindecParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(bindecParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link bindecParser#l}.
	 * @param ctx the parse tree
	 */
	void enterL(bindecParser.LContext ctx);
	/**
	 * Exit a parse tree produced by {@link bindecParser#l}.
	 * @param ctx the parse tree
	 */
	void exitL(bindecParser.LContext ctx);
	/**
	 * Enter a parse tree produced by {@link bindecParser#b}.
	 * @param ctx the parse tree
	 */
	void enterB(bindecParser.BContext ctx);
	/**
	 * Exit a parse tree produced by {@link bindecParser#b}.
	 * @param ctx the parse tree
	 */
	void exitB(bindecParser.BContext ctx);
}