// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link goParser}.
 */
public interface goListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link goParser#golang}.
	 * @param ctx the parse tree
	 */
	void enterGolang(goParser.GolangContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#golang}.
	 * @param ctx the parse tree
	 */
	void exitGolang(goParser.GolangContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#package}.
	 * @param ctx the parse tree
	 */
	void enterPackage(goParser.PackageContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#package}.
	 * @param ctx the parse tree
	 */
	void exitPackage(goParser.PackageContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(goParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(goParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(goParser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(goParser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#importPackage}.
	 * @param ctx the parse tree
	 */
	void enterImportPackage(goParser.ImportPackageContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#importPackage}.
	 * @param ctx the parse tree
	 */
	void exitImportPackage(goParser.ImportPackageContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#dependencyPackage}.
	 * @param ctx the parse tree
	 */
	void enterDependencyPackage(goParser.DependencyPackageContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#dependencyPackage}.
	 * @param ctx the parse tree
	 */
	void exitDependencyPackage(goParser.DependencyPackageContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#globalVars}.
	 * @param ctx the parse tree
	 */
	void enterGlobalVars(goParser.GlobalVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#globalVars}.
	 * @param ctx the parse tree
	 */
	void exitGlobalVars(goParser.GlobalVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#globalVarsDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGlobalVarsDeclaration(goParser.GlobalVarsDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#globalVarsDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGlobalVarsDeclaration(goParser.GlobalVarsDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#globalBasicVarDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGlobalBasicVarDeclaration(goParser.GlobalBasicVarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#globalBasicVarDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGlobalBasicVarDeclaration(goParser.GlobalBasicVarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#globalVarsAssignment}.
	 * @param ctx the parse tree
	 */
	void enterGlobalVarsAssignment(goParser.GlobalVarsAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#globalVarsAssignment}.
	 * @param ctx the parse tree
	 */
	void exitGlobalVarsAssignment(goParser.GlobalVarsAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#basicVarsDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBasicVarsDeclaration(goParser.BasicVarsDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#basicVarsDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBasicVarsDeclaration(goParser.BasicVarsDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#varName}.
	 * @param ctx the parse tree
	 */
	void enterVarName(goParser.VarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#varName}.
	 * @param ctx the parse tree
	 */
	void exitVarName(goParser.VarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(goParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(goParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#structName}.
	 * @param ctx the parse tree
	 */
	void enterStructName(goParser.StructNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#structName}.
	 * @param ctx the parse tree
	 */
	void exitStructName(goParser.StructNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#funcDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclaration(goParser.FuncDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#funcDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclaration(goParser.FuncDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(goParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(goParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(goParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(goParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#interfaceName}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceName(goParser.InterfaceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#interfaceName}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceName(goParser.InterfaceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(goParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(goParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#funcs}.
	 * @param ctx the parse tree
	 */
	void enterFuncs(goParser.FuncsContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#funcs}.
	 * @param ctx the parse tree
	 */
	void exitFuncs(goParser.FuncsContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(goParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(goParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#fromStruct}.
	 * @param ctx the parse tree
	 */
	void enterFromStruct(goParser.FromStructContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#fromStruct}.
	 * @param ctx the parse tree
	 */
	void exitFromStruct(goParser.FromStructContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(goParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(goParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(goParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(goParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#returnTypes}.
	 * @param ctx the parse tree
	 */
	void enterReturnTypes(goParser.ReturnTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#returnTypes}.
	 * @param ctx the parse tree
	 */
	void exitReturnTypes(goParser.ReturnTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#parameterTypes}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypes(goParser.ParameterTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#parameterTypes}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypes(goParser.ParameterTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#compoundTypes}.
	 * @param ctx the parse tree
	 */
	void enterCompoundTypes(goParser.CompoundTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#compoundTypes}.
	 * @param ctx the parse tree
	 */
	void exitCompoundTypes(goParser.CompoundTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#arraySize}.
	 * @param ctx the parse tree
	 */
	void enterArraySize(goParser.ArraySizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#arraySize}.
	 * @param ctx the parse tree
	 */
	void exitArraySize(goParser.ArraySizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#basicTypes}.
	 * @param ctx the parse tree
	 */
	void enterBasicTypes(goParser.BasicTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#basicTypes}.
	 * @param ctx the parse tree
	 */
	void exitBasicTypes(goParser.BasicTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(goParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(goParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#localVarsDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVarsDeclaration(goParser.LocalVarsDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#localVarsDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVarsDeclaration(goParser.LocalVarsDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(goParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(goParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code noAtom}
	 * labeled alternative in {@link goParser#computationalStatement}.
	 * @param ctx the parse tree
	 */
	void enterNoAtom(goParser.NoAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code noAtom}
	 * labeled alternative in {@link goParser#computationalStatement}.
	 * @param ctx the parse tree
	 */
	void exitNoAtom(goParser.NoAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryOperator}
	 * labeled alternative in {@link goParser#computationalStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(goParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryOperator}
	 * labeled alternative in {@link goParser#computationalStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(goParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryOperator}
	 * labeled alternative in {@link goParser#computationalStatement}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator(goParser.BinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryOperator}
	 * labeled alternative in {@link goParser#computationalStatement}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator(goParser.BinaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructValue}
	 * labeled alternative in {@link goParser#computationalStatement}.
	 * @param ctx the parse tree
	 */
	void enterStructValue(goParser.StructValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructValue}
	 * labeled alternative in {@link goParser#computationalStatement}.
	 * @param ctx the parse tree
	 */
	void exitStructValue(goParser.StructValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link goParser#computationalStatement}.
	 * @param ctx the parse tree
	 */
	void enterString(goParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link goParser#computationalStatement}.
	 * @param ctx the parse tree
	 */
	void exitString(goParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callFunc}
	 * labeled alternative in {@link goParser#computationalStatement}.
	 * @param ctx the parse tree
	 */
	void enterCallFunc(goParser.CallFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callFunc}
	 * labeled alternative in {@link goParser#computationalStatement}.
	 * @param ctx the parse tree
	 */
	void exitCallFunc(goParser.CallFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayValue}
	 * labeled alternative in {@link goParser#computationalStatement}.
	 * @param ctx the parse tree
	 */
	void enterArrayValue(goParser.ArrayValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayValue}
	 * labeled alternative in {@link goParser#computationalStatement}.
	 * @param ctx the parse tree
	 */
	void exitArrayValue(goParser.ArrayValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Atom}
	 * labeled alternative in {@link goParser#computationalStatement}.
	 * @param ctx the parse tree
	 */
	void enterAtom(goParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Atom}
	 * labeled alternative in {@link goParser#computationalStatement}.
	 * @param ctx the parse tree
	 */
	void exitAtom(goParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryOperatorRight}
	 * labeled alternative in {@link goParser#computationalStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperatorRight(goParser.UnaryOperatorRightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryOperatorRight}
	 * labeled alternative in {@link goParser#computationalStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperatorRight(goParser.UnaryOperatorRightContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#callFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterCallFunctionName(goParser.CallFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#callFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitCallFunctionName(goParser.CallFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#callFunctionparameters}.
	 * @param ctx the parse tree
	 */
	void enterCallFunctionparameters(goParser.CallFunctionparametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#callFunctionparameters}.
	 * @param ctx the parse tree
	 */
	void exitCallFunctionparameters(goParser.CallFunctionparametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(goParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(goParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#arithOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithOperator(goParser.ArithOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#arithOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithOperator(goParser.ArithOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#bitOperator}.
	 * @param ctx the parse tree
	 */
	void enterBitOperator(goParser.BitOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#bitOperator}.
	 * @param ctx the parse tree
	 */
	void exitBitOperator(goParser.BitOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(goParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(goParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#ifConditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfConditionalStatement(goParser.IfConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#ifConditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfConditionalStatement(goParser.IfConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition(goParser.IfConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition(goParser.IfConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#ifConditionBody}.
	 * @param ctx the parse tree
	 */
	void enterIfConditionBody(goParser.IfConditionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#ifConditionBody}.
	 * @param ctx the parse tree
	 */
	void exitIfConditionBody(goParser.IfConditionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#switchConditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchConditionalStatement(goParser.SwitchConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#switchConditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchConditionalStatement(goParser.SwitchConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#switchCondition}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCondition(goParser.SwitchConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#switchCondition}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCondition(goParser.SwitchConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#switchCaseClause}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCaseClause(goParser.SwitchCaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#switchCaseClause}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCaseClause(goParser.SwitchCaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#caseCondition}.
	 * @param ctx the parse tree
	 */
	void enterCaseCondition(goParser.CaseConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#caseCondition}.
	 * @param ctx the parse tree
	 */
	void exitCaseCondition(goParser.CaseConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#caseConditionBody}.
	 * @param ctx the parse tree
	 */
	void enterCaseConditionBody(goParser.CaseConditionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#caseConditionBody}.
	 * @param ctx the parse tree
	 */
	void exitCaseConditionBody(goParser.CaseConditionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#selectconditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectconditionalStatement(goParser.SelectconditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#selectconditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectconditionalStatement(goParser.SelectconditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#selectCaseClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectCaseClause(goParser.SelectCaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#selectCaseClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectCaseClause(goParser.SelectCaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(goParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(goParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#loopBody}.
	 * @param ctx the parse tree
	 */
	void enterLoopBody(goParser.LoopBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#loopBody}.
	 * @param ctx the parse tree
	 */
	void exitLoopBody(goParser.LoopBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#forFlag}.
	 * @param ctx the parse tree
	 */
	void enterForFlag(goParser.ForFlagContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#forFlag}.
	 * @param ctx the parse tree
	 */
	void exitForFlag(goParser.ForFlagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code triCondition}
	 * labeled alternative in {@link goParser#forConditionClause}.
	 * @param ctx the parse tree
	 */
	void enterTriCondition(goParser.TriConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code triCondition}
	 * labeled alternative in {@link goParser#forConditionClause}.
	 * @param ctx the parse tree
	 */
	void exitTriCondition(goParser.TriConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleCondition}
	 * labeled alternative in {@link goParser#forConditionClause}.
	 * @param ctx the parse tree
	 */
	void enterSingleCondition(goParser.SingleConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleCondition}
	 * labeled alternative in {@link goParser#forConditionClause}.
	 * @param ctx the parse tree
	 */
	void exitSingleCondition(goParser.SingleConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyCondition}
	 * labeled alternative in {@link goParser#forConditionClause}.
	 * @param ctx the parse tree
	 */
	void enterEmptyCondition(goParser.EmptyConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyCondition}
	 * labeled alternative in {@link goParser#forConditionClause}.
	 * @param ctx the parse tree
	 */
	void exitEmptyCondition(goParser.EmptyConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rangeCondition}
	 * labeled alternative in {@link goParser#forConditionClause}.
	 * @param ctx the parse tree
	 */
	void enterRangeCondition(goParser.RangeConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rangeCondition}
	 * labeled alternative in {@link goParser#forConditionClause}.
	 * @param ctx the parse tree
	 */
	void exitRangeCondition(goParser.RangeConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(goParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(goParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(goParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(goParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#post}.
	 * @param ctx the parse tree
	 */
	void enterPost(goParser.PostContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#post}.
	 * @param ctx the parse tree
	 */
	void exitPost(goParser.PostContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(goParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(goParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#callFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void enterCallFunctionStatement(goParser.CallFunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#callFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void exitCallFunctionStatement(goParser.CallFunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#varValue}.
	 * @param ctx the parse tree
	 */
	void enterVarValue(goParser.VarValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#varValue}.
	 * @param ctx the parse tree
	 */
	void exitVarValue(goParser.VarValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#staticValue}.
	 * @param ctx the parse tree
	 */
	void enterStaticValue(goParser.StaticValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#staticValue}.
	 * @param ctx the parse tree
	 */
	void exitStaticValue(goParser.StaticValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link goParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(goParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link goParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(goParser.ArrayContext ctx);
}