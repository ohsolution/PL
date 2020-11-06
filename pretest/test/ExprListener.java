// Generated from Expr.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(ExprParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(ExprParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#packageR}.
	 * @param ctx the parse tree
	 */
	void enterPackageR(ExprParser.PackageRContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#packageR}.
	 * @param ctx the parse tree
	 */
	void exitPackageR(ExprParser.PackageRContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#importL}.
	 * @param ctx the parse tree
	 */
	void enterImportL(ExprParser.ImportLContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#importL}.
	 * @param ctx the parse tree
	 */
	void exitImportL(ExprParser.ImportLContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#importR}.
	 * @param ctx the parse tree
	 */
	void enterImportR(ExprParser.ImportRContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#importR}.
	 * @param ctx the parse tree
	 */
	void exitImportR(ExprParser.ImportRContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#outerL}.
	 * @param ctx the parse tree
	 */
	void enterOuterL(ExprParser.OuterLContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#outerL}.
	 * @param ctx the parse tree
	 */
	void exitOuterL(ExprParser.OuterLContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#outerR}.
	 * @param ctx the parse tree
	 */
	void enterOuterR(ExprParser.OuterRContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#outerR}.
	 * @param ctx the parse tree
	 */
	void exitOuterR(ExprParser.OuterRContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#propertyD}.
	 * @param ctx the parse tree
	 */
	void enterPropertyD(ExprParser.PropertyDContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#propertyD}.
	 * @param ctx the parse tree
	 */
	void exitPropertyD(ExprParser.PropertyDContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#typef}.
	 * @param ctx the parse tree
	 */
	void enterTypef(ExprParser.TypefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#typef}.
	 * @param ctx the parse tree
	 */
	void exitTypef(ExprParser.TypefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ExprParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ExprParser.ValueContext ctx);
}