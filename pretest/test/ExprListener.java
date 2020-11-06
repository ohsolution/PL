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
	 * Enter a parse tree produced by {@link ExprParser#functionD}.
	 * @param ctx the parse tree
	 */
	void enterFunctionD(ExprParser.FunctionDContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#functionD}.
	 * @param ctx the parse tree
	 */
	void exitFunctionD(ExprParser.FunctionDContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(ExprParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(ExprParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#whichfunction}.
	 * @param ctx the parse tree
	 */
	void enterWhichfunction(ExprParser.WhichfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#whichfunction}.
	 * @param ctx the parse tree
	 */
	void exitWhichfunction(ExprParser.WhichfunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ExprParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ExprParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assignopr}.
	 * @param ctx the parse tree
	 */
	void enterAssignopr(ExprParser.AssignoprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assignopr}.
	 * @param ctx the parse tree
	 */
	void exitAssignopr(ExprParser.AssignoprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#innerblock}.
	 * @param ctx the parse tree
	 */
	void enterInnerblock(ExprParser.InnerblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#innerblock}.
	 * @param ctx the parse tree
	 */
	void exitInnerblock(ExprParser.InnerblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ExprParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ExprParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#exit}.
	 * @param ctx the parse tree
	 */
	void enterExit(ExprParser.ExitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#exit}.
	 * @param ctx the parse tree
	 */
	void exitExit(ExprParser.ExitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ExprParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ExprParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expor}.
	 * @param ctx the parse tree
	 */
	void enterExpor(ExprParser.ExporContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expor}.
	 * @param ctx the parse tree
	 */
	void exitExpor(ExprParser.ExporContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expand}.
	 * @param ctx the parse tree
	 */
	void enterExpand(ExprParser.ExpandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expand}.
	 * @param ctx the parse tree
	 */
	void exitExpand(ExprParser.ExpandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expeq}.
	 * @param ctx the parse tree
	 */
	void enterExpeq(ExprParser.ExpeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expeq}.
	 * @param ctx the parse tree
	 */
	void exitExpeq(ExprParser.ExpeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expcmp}.
	 * @param ctx the parse tree
	 */
	void enterExpcmp(ExprParser.ExpcmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expcmp}.
	 * @param ctx the parse tree
	 */
	void exitExpcmp(ExprParser.ExpcmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#exppre}.
	 * @param ctx the parse tree
	 */
	void enterExppre(ExprParser.ExppreContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#exppre}.
	 * @param ctx the parse tree
	 */
	void exitExppre(ExprParser.ExppreContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expR}.
	 * @param ctx the parse tree
	 */
	void enterExpR(ExprParser.ExpRContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expR}.
	 * @param ctx the parse tree
	 */
	void exitExpR(ExprParser.ExpRContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expadd}.
	 * @param ctx the parse tree
	 */
	void enterExpadd(ExprParser.ExpaddContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expadd}.
	 * @param ctx the parse tree
	 */
	void exitExpadd(ExprParser.ExpaddContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expmul}.
	 * @param ctx the parse tree
	 */
	void enterExpmul(ExprParser.ExpmulContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expmul}.
	 * @param ctx the parse tree
	 */
	void exitExpmul(ExprParser.ExpmulContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#prefixexp}.
	 * @param ctx the parse tree
	 */
	void enterPrefixexp(ExprParser.PrefixexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prefixexp}.
	 * @param ctx the parse tree
	 */
	void exitPrefixexp(ExprParser.PrefixexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#exppostfix}.
	 * @param ctx the parse tree
	 */
	void enterExppostfix(ExprParser.ExppostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#exppostfix}.
	 * @param ctx the parse tree
	 */
	void exitExppostfix(ExprParser.ExppostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(ExprParser.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(ExprParser.FunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#argu}.
	 * @param ctx the parse tree
	 */
	void enterArgu(ExprParser.ArguContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#argu}.
	 * @param ctx the parse tree
	 */
	void exitArgu(ExprParser.ArguContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#oprpostfix}.
	 * @param ctx the parse tree
	 */
	void enterOprpostfix(ExprParser.OprpostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#oprpostfix}.
	 * @param ctx the parse tree
	 */
	void exitOprpostfix(ExprParser.OprpostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#prefixopr}.
	 * @param ctx the parse tree
	 */
	void enterPrefixopr(ExprParser.PrefixoprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prefixopr}.
	 * @param ctx the parse tree
	 */
	void exitPrefixopr(ExprParser.PrefixoprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#mulopr}.
	 * @param ctx the parse tree
	 */
	void enterMulopr(ExprParser.MuloprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#mulopr}.
	 * @param ctx the parse tree
	 */
	void exitMulopr(ExprParser.MuloprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#addopr}.
	 * @param ctx the parse tree
	 */
	void enterAddopr(ExprParser.AddoprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#addopr}.
	 * @param ctx the parse tree
	 */
	void exitAddopr(ExprParser.AddoprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#inopr}.
	 * @param ctx the parse tree
	 */
	void enterInopr(ExprParser.InoprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#inopr}.
	 * @param ctx the parse tree
	 */
	void exitInopr(ExprParser.InoprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#isopr}.
	 * @param ctx the parse tree
	 */
	void enterIsopr(ExprParser.IsoprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#isopr}.
	 * @param ctx the parse tree
	 */
	void exitIsopr(ExprParser.IsoprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#eqopr}.
	 * @param ctx the parse tree
	 */
	void enterEqopr(ExprParser.EqoprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#eqopr}.
	 * @param ctx the parse tree
	 */
	void exitEqopr(ExprParser.EqoprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#cmpopr}.
	 * @param ctx the parse tree
	 */
	void enterCmpopr(ExprParser.CmpoprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#cmpopr}.
	 * @param ctx the parse tree
	 */
	void exitCmpopr(ExprParser.CmpoprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#variableD}.
	 * @param ctx the parse tree
	 */
	void enterVariableD(ExprParser.VariableDContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#variableD}.
	 * @param ctx the parse tree
	 */
	void exitVariableD(ExprParser.VariableDContext ctx);
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