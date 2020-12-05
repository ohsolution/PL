// Generated from Kotlin.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KotlinParser}.
 */
public interface KotlinListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KotlinParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(KotlinParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(KotlinParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#packageR}.
	 * @param ctx the parse tree
	 */
	void enterPackageR(KotlinParser.PackageRContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#packageR}.
	 * @param ctx the parse tree
	 */
	void exitPackageR(KotlinParser.PackageRContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#importL}.
	 * @param ctx the parse tree
	 */
	void enterImportL(KotlinParser.ImportLContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#importL}.
	 * @param ctx the parse tree
	 */
	void exitImportL(KotlinParser.ImportLContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#importR}.
	 * @param ctx the parse tree
	 */
	void enterImportR(KotlinParser.ImportRContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#importR}.
	 * @param ctx the parse tree
	 */
	void exitImportR(KotlinParser.ImportRContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#outerL}.
	 * @param ctx the parse tree
	 */
	void enterOuterL(KotlinParser.OuterLContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#outerL}.
	 * @param ctx the parse tree
	 */
	void exitOuterL(KotlinParser.OuterLContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#outerR}.
	 * @param ctx the parse tree
	 */
	void enterOuterR(KotlinParser.OuterRContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#outerR}.
	 * @param ctx the parse tree
	 */
	void exitOuterR(KotlinParser.OuterRContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#classD}.
	 * @param ctx the parse tree
	 */
	void enterClassD(KotlinParser.ClassDContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#classD}.
	 * @param ctx the parse tree
	 */
	void exitClassD(KotlinParser.ClassDContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#typec}.
	 * @param ctx the parse tree
	 */
	void enterTypec(KotlinParser.TypecContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#typec}.
	 * @param ctx the parse tree
	 */
	void exitTypec(KotlinParser.TypecContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#classinner}.
	 * @param ctx the parse tree
	 */
	void enterClassinner(KotlinParser.ClassinnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#classinner}.
	 * @param ctx the parse tree
	 */
	void exitClassinner(KotlinParser.ClassinnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#propertyC}.
	 * @param ctx the parse tree
	 */
	void enterPropertyC(KotlinParser.PropertyCContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#propertyC}.
	 * @param ctx the parse tree
	 */
	void exitPropertyC(KotlinParser.PropertyCContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#valcD}.
	 * @param ctx the parse tree
	 */
	void enterValcD(KotlinParser.ValcDContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#valcD}.
	 * @param ctx the parse tree
	 */
	void exitValcD(KotlinParser.ValcDContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#funcD}.
	 * @param ctx the parse tree
	 */
	void enterFuncD(KotlinParser.FuncDContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#funcD}.
	 * @param ctx the parse tree
	 */
	void exitFuncD(KotlinParser.FuncDContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#cargus}.
	 * @param ctx the parse tree
	 */
	void enterCargus(KotlinParser.CargusContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#cargus}.
	 * @param ctx the parse tree
	 */
	void exitCargus(KotlinParser.CargusContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#cargu}.
	 * @param ctx the parse tree
	 */
	void enterCargu(KotlinParser.CarguContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#cargu}.
	 * @param ctx the parse tree
	 */
	void exitCargu(KotlinParser.CarguContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#mainf}.
	 * @param ctx the parse tree
	 */
	void enterMainf(KotlinParser.MainfContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#mainf}.
	 * @param ctx the parse tree
	 */
	void exitMainf(KotlinParser.MainfContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#functionD}.
	 * @param ctx the parse tree
	 */
	void enterFunctionD(KotlinParser.FunctionDContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#functionD}.
	 * @param ctx the parse tree
	 */
	void exitFunctionD(KotlinParser.FunctionDContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(KotlinParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(KotlinParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#whichfunction}.
	 * @param ctx the parse tree
	 */
	void enterWhichfunction(KotlinParser.WhichfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#whichfunction}.
	 * @param ctx the parse tree
	 */
	void exitWhichfunction(KotlinParser.WhichfunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(KotlinParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(KotlinParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#assignopr}.
	 * @param ctx the parse tree
	 */
	void enterAssignopr(KotlinParser.AssignoprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#assignopr}.
	 * @param ctx the parse tree
	 */
	void exitAssignopr(KotlinParser.AssignoprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#innerblock}.
	 * @param ctx the parse tree
	 */
	void enterInnerblock(KotlinParser.InnerblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#innerblock}.
	 * @param ctx the parse tree
	 */
	void exitInnerblock(KotlinParser.InnerblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(KotlinParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(KotlinParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#forloop}.
	 * @param ctx the parse tree
	 */
	void enterForloop(KotlinParser.ForloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#forloop}.
	 * @param ctx the parse tree
	 */
	void exitForloop(KotlinParser.ForloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void enterWhileloop(KotlinParser.WhileloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void exitWhileloop(KotlinParser.WhileloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#ifthenelse}.
	 * @param ctx the parse tree
	 */
	void enterIfthenelse(KotlinParser.IfthenelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#ifthenelse}.
	 * @param ctx the parse tree
	 */
	void exitIfthenelse(KotlinParser.IfthenelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#elif}.
	 * @param ctx the parse tree
	 */
	void enterElif(KotlinParser.ElifContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#elif}.
	 * @param ctx the parse tree
	 */
	void exitElif(KotlinParser.ElifContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#exit}.
	 * @param ctx the parse tree
	 */
	void enterExit(KotlinParser.ExitContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#exit}.
	 * @param ctx the parse tree
	 */
	void exitExit(KotlinParser.ExitContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(KotlinParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(KotlinParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#expor}.
	 * @param ctx the parse tree
	 */
	void enterExpor(KotlinParser.ExporContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#expor}.
	 * @param ctx the parse tree
	 */
	void exitExpor(KotlinParser.ExporContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#expand}.
	 * @param ctx the parse tree
	 */
	void enterExpand(KotlinParser.ExpandContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#expand}.
	 * @param ctx the parse tree
	 */
	void exitExpand(KotlinParser.ExpandContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#expeq}.
	 * @param ctx the parse tree
	 */
	void enterExpeq(KotlinParser.ExpeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#expeq}.
	 * @param ctx the parse tree
	 */
	void exitExpeq(KotlinParser.ExpeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#expcmp}.
	 * @param ctx the parse tree
	 */
	void enterExpcmp(KotlinParser.ExpcmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#expcmp}.
	 * @param ctx the parse tree
	 */
	void exitExpcmp(KotlinParser.ExpcmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#exppre}.
	 * @param ctx the parse tree
	 */
	void enterExppre(KotlinParser.ExppreContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#exppre}.
	 * @param ctx the parse tree
	 */
	void exitExppre(KotlinParser.ExppreContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#exprange}.
	 * @param ctx the parse tree
	 */
	void enterExprange(KotlinParser.ExprangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#exprange}.
	 * @param ctx the parse tree
	 */
	void exitExprange(KotlinParser.ExprangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#expR}.
	 * @param ctx the parse tree
	 */
	void enterExpR(KotlinParser.ExpRContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#expR}.
	 * @param ctx the parse tree
	 */
	void exitExpR(KotlinParser.ExpRContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#expadd}.
	 * @param ctx the parse tree
	 */
	void enterExpadd(KotlinParser.ExpaddContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#expadd}.
	 * @param ctx the parse tree
	 */
	void exitExpadd(KotlinParser.ExpaddContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#expmul}.
	 * @param ctx the parse tree
	 */
	void enterExpmul(KotlinParser.ExpmulContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#expmul}.
	 * @param ctx the parse tree
	 */
	void exitExpmul(KotlinParser.ExpmulContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#prefixexp}.
	 * @param ctx the parse tree
	 */
	void enterPrefixexp(KotlinParser.PrefixexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#prefixexp}.
	 * @param ctx the parse tree
	 */
	void exitPrefixexp(KotlinParser.PrefixexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#exppostfix}.
	 * @param ctx the parse tree
	 */
	void enterExppostfix(KotlinParser.ExppostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#exppostfix}.
	 * @param ctx the parse tree
	 */
	void exitExppostfix(KotlinParser.ExppostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#indexing}.
	 * @param ctx the parse tree
	 */
	void enterIndexing(KotlinParser.IndexingContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#indexing}.
	 * @param ctx the parse tree
	 */
	void exitIndexing(KotlinParser.IndexingContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#fccall}.
	 * @param ctx the parse tree
	 */
	void enterFccall(KotlinParser.FccallContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#fccall}.
	 * @param ctx the parse tree
	 */
	void exitFccall(KotlinParser.FccallContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#argus}.
	 * @param ctx the parse tree
	 */
	void enterArgus(KotlinParser.ArgusContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#argus}.
	 * @param ctx the parse tree
	 */
	void exitArgus(KotlinParser.ArgusContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#argu}.
	 * @param ctx the parse tree
	 */
	void enterArgu(KotlinParser.ArguContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#argu}.
	 * @param ctx the parse tree
	 */
	void exitArgu(KotlinParser.ArguContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#oprpostfix}.
	 * @param ctx the parse tree
	 */
	void enterOprpostfix(KotlinParser.OprpostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#oprpostfix}.
	 * @param ctx the parse tree
	 */
	void exitOprpostfix(KotlinParser.OprpostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#prefixopr}.
	 * @param ctx the parse tree
	 */
	void enterPrefixopr(KotlinParser.PrefixoprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#prefixopr}.
	 * @param ctx the parse tree
	 */
	void exitPrefixopr(KotlinParser.PrefixoprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#mulopr}.
	 * @param ctx the parse tree
	 */
	void enterMulopr(KotlinParser.MuloprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#mulopr}.
	 * @param ctx the parse tree
	 */
	void exitMulopr(KotlinParser.MuloprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#addopr}.
	 * @param ctx the parse tree
	 */
	void enterAddopr(KotlinParser.AddoprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#addopr}.
	 * @param ctx the parse tree
	 */
	void exitAddopr(KotlinParser.AddoprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#inopr}.
	 * @param ctx the parse tree
	 */
	void enterInopr(KotlinParser.InoprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#inopr}.
	 * @param ctx the parse tree
	 */
	void exitInopr(KotlinParser.InoprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#isopr}.
	 * @param ctx the parse tree
	 */
	void enterIsopr(KotlinParser.IsoprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#isopr}.
	 * @param ctx the parse tree
	 */
	void exitIsopr(KotlinParser.IsoprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#eqopr}.
	 * @param ctx the parse tree
	 */
	void enterEqopr(KotlinParser.EqoprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#eqopr}.
	 * @param ctx the parse tree
	 */
	void exitEqopr(KotlinParser.EqoprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#cmpopr}.
	 * @param ctx the parse tree
	 */
	void enterCmpopr(KotlinParser.CmpoprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#cmpopr}.
	 * @param ctx the parse tree
	 */
	void exitCmpopr(KotlinParser.CmpoprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#variableD}.
	 * @param ctx the parse tree
	 */
	void enterVariableD(KotlinParser.VariableDContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#variableD}.
	 * @param ctx the parse tree
	 */
	void exitVariableD(KotlinParser.VariableDContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#propertyD}.
	 * @param ctx the parse tree
	 */
	void enterPropertyD(KotlinParser.PropertyDContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#propertyD}.
	 * @param ctx the parse tree
	 */
	void exitPropertyD(KotlinParser.PropertyDContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#typef}.
	 * @param ctx the parse tree
	 */
	void enterTypef(KotlinParser.TypefContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#typef}.
	 * @param ctx the parse tree
	 */
	void exitTypef(KotlinParser.TypefContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(KotlinParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(KotlinParser.ValueContext ctx);
}