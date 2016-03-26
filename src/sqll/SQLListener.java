// Generated from C:\Users\William\Documents\NetBeansProjects\SQLL\src\sqll\SQL.g4 by ANTLR 4.4
package ide;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLParser}.
 */
public interface SQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code showTB}
	 * labeled alternative in {@link SQLParser#table}.
	 * @param ctx the parse tree
	 */
	void enterShowTB(@NotNull SQLParser.ShowTBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTB}
	 * labeled alternative in {@link SQLParser#table}.
	 * @param ctx the parse tree
	 */
	void exitShowTB(@NotNull SQLParser.ShowTBContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#logicExpOr}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpOr(@NotNull SQLParser.LogicExpOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#logicExpOr}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpOr(@NotNull SQLParser.LogicExpOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(@NotNull SQLParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(@NotNull SQLParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTB}
	 * labeled alternative in {@link SQLParser#table}.
	 * @param ctx the parse tree
	 */
	void enterDropTB(@NotNull SQLParser.DropTBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTB}
	 * labeled alternative in {@link SQLParser#table}.
	 * @param ctx the parse tree
	 */
	void exitDropTB(@NotNull SQLParser.DropTBContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(@NotNull SQLParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(@NotNull SQLParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#references}.
	 * @param ctx the parse tree
	 */
	void enterReferences(@NotNull SQLParser.ReferencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#references}.
	 * @param ctx the parse tree
	 */
	void exitReferences(@NotNull SQLParser.ReferencesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expGL}
	 * labeled alternative in {@link SQLParser#exp4}.
	 * @param ctx the parse tree
	 */
	void enterExpGL(@NotNull SQLParser.ExpGLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expGL}
	 * labeled alternative in {@link SQLParser#exp4}.
	 * @param ctx the parse tree
	 */
	void exitExpGL(@NotNull SQLParser.ExpGLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipoFloat}
	 * labeled alternative in {@link SQLParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipoFloat(@NotNull SQLParser.TipoFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipoFloat}
	 * labeled alternative in {@link SQLParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipoFloat(@NotNull SQLParser.TipoFloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#entero}.
	 * @param ctx the parse tree
	 */
	void enterEntero(@NotNull SQLParser.EnteroContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#entero}.
	 * @param ctx the parse tree
	 */
	void exitEntero(@NotNull SQLParser.EnteroContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#constraints}.
	 * @param ctx the parse tree
	 */
	void enterConstraints(@NotNull SQLParser.ConstraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#constraints}.
	 * @param ctx the parse tree
	 */
	void exitConstraints(@NotNull SQLParser.ConstraintsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterDB}
	 * labeled alternative in {@link SQLParser#database}.
	 * @param ctx the parse tree
	 */
	void enterAlterDB(@NotNull SQLParser.AlterDBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterDB}
	 * labeled alternative in {@link SQLParser#database}.
	 * @param ctx the parse tree
	 */
	void exitAlterDB(@NotNull SQLParser.AlterDBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showDB}
	 * labeled alternative in {@link SQLParser#database}.
	 * @param ctx the parse tree
	 */
	void enterShowDB(@NotNull SQLParser.ShowDBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showDB}
	 * labeled alternative in {@link SQLParser#database}.
	 * @param ctx the parse tree
	 */
	void exitShowDB(@NotNull SQLParser.ShowDBContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(@NotNull SQLParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(@NotNull SQLParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expNotOr}
	 * labeled alternative in {@link SQLParser#exp2}.
	 * @param ctx the parse tree
	 */
	void enterExpNotOr(@NotNull SQLParser.ExpNotOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expNotOr}
	 * labeled alternative in {@link SQLParser#exp2}.
	 * @param ctx the parse tree
	 */
	void exitExpNotOr(@NotNull SQLParser.ExpNotOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expNotGl}
	 * labeled alternative in {@link SQLParser#exp4}.
	 * @param ctx the parse tree
	 */
	void enterExpNotGl(@NotNull SQLParser.ExpNotGlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expNotGl}
	 * labeled alternative in {@link SQLParser#exp4}.
	 * @param ctx the parse tree
	 */
	void exitExpNotGl(@NotNull SQLParser.ExpNotGlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(@NotNull SQLParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(@NotNull SQLParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterTB}
	 * labeled alternative in {@link SQLParser#table}.
	 * @param ctx the parse tree
	 */
	void enterAlterTB(@NotNull SQLParser.AlterTBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterTB}
	 * labeled alternative in {@link SQLParser#table}.
	 * @param ctx the parse tree
	 */
	void exitAlterTB(@NotNull SQLParser.AlterTBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cPK}
	 * labeled alternative in {@link SQLParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterCPK(@NotNull SQLParser.CPKContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cPK}
	 * labeled alternative in {@link SQLParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitCPK(@NotNull SQLParser.CPKContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expNotEq}
	 * labeled alternative in {@link SQLParser#exp3}.
	 * @param ctx the parse tree
	 */
	void enterExpNotEq(@NotNull SQLParser.ExpNotEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expNotEq}
	 * labeled alternative in {@link SQLParser#exp3}.
	 * @param ctx the parse tree
	 */
	void exitExpNotEq(@NotNull SQLParser.ExpNotEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expOr}
	 * labeled alternative in {@link SQLParser#exp2}.
	 * @param ctx the parse tree
	 */
	void enterExpOr(@NotNull SQLParser.ExpOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expOr}
	 * labeled alternative in {@link SQLParser#exp2}.
	 * @param ctx the parse tree
	 */
	void exitExpOr(@NotNull SQLParser.ExpOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(@NotNull SQLParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(@NotNull SQLParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#orderby}.
	 * @param ctx the parse tree
	 */
	void enterOrderby(@NotNull SQLParser.OrderbyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#orderby}.
	 * @param ctx the parse tree
	 */
	void exitOrderby(@NotNull SQLParser.OrderbyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropConstraintTB}
	 * labeled alternative in {@link SQLParser#tableAction}.
	 * @param ctx the parse tree
	 */
	void enterDropConstraintTB(@NotNull SQLParser.DropConstraintTBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropConstraintTB}
	 * labeled alternative in {@link SQLParser#tableAction}.
	 * @param ctx the parse tree
	 */
	void exitDropConstraintTB(@NotNull SQLParser.DropConstraintTBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showColums}
	 * labeled alternative in {@link SQLParser#table}.
	 * @param ctx the parse tree
	 */
	void enterShowColums(@NotNull SQLParser.ShowColumsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showColums}
	 * labeled alternative in {@link SQLParser#table}.
	 * @param ctx the parse tree
	 */
	void exitShowColums(@NotNull SQLParser.ShowColumsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fecha}.
	 * @param ctx the parse tree
	 */
	void enterFecha(@NotNull SQLParser.FechaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fecha}.
	 * @param ctx the parse tree
	 */
	void exitFecha(@NotNull SQLParser.FechaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropDB}
	 * labeled alternative in {@link SQLParser#database}.
	 * @param ctx the parse tree
	 */
	void enterDropDB(@NotNull SQLParser.DropDBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropDB}
	 * labeled alternative in {@link SQLParser#database}.
	 * @param ctx the parse tree
	 */
	void exitDropDB(@NotNull SQLParser.DropDBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expNotAnd}
	 * labeled alternative in {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpNotAnd(@NotNull SQLParser.ExpNotAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expNotAnd}
	 * labeled alternative in {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpNotAnd(@NotNull SQLParser.ExpNotAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addConstraintTB}
	 * labeled alternative in {@link SQLParser#tableAction}.
	 * @param ctx the parse tree
	 */
	void enterAddConstraintTB(@NotNull SQLParser.AddConstraintTBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addConstraintTB}
	 * labeled alternative in {@link SQLParser#tableAction}.
	 * @param ctx the parse tree
	 */
	void exitAddConstraintTB(@NotNull SQLParser.AddConstraintTBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cCheck}
	 * labeled alternative in {@link SQLParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterCCheck(@NotNull SQLParser.CCheckContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cCheck}
	 * labeled alternative in {@link SQLParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitCCheck(@NotNull SQLParser.CCheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#logicExpAnd}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpAnd(@NotNull SQLParser.LogicExpAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#logicExpAnd}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpAnd(@NotNull SQLParser.LogicExpAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#logicExpNot}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpNot(@NotNull SQLParser.LogicExpNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#logicExpNot}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpNot(@NotNull SQLParser.LogicExpNotContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#decimal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(@NotNull SQLParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#decimal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(@NotNull SQLParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#nullType}.
	 * @param ctx the parse tree
	 */
	void enterNullType(@NotNull SQLParser.NullTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#nullType}.
	 * @param ctx the parse tree
	 */
	void exitNullType(@NotNull SQLParser.NullTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expID}
	 * labeled alternative in {@link SQLParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterExpID(@NotNull SQLParser.ExpIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expID}
	 * labeled alternative in {@link SQLParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitExpID(@NotNull SQLParser.ExpIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addColumnTB}
	 * labeled alternative in {@link SQLParser#tableAction}.
	 * @param ctx the parse tree
	 */
	void enterAddColumnTB(@NotNull SQLParser.AddColumnTBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addColumnTB}
	 * labeled alternative in {@link SQLParser#tableAction}.
	 * @param ctx the parse tree
	 */
	void exitAddColumnTB(@NotNull SQLParser.AddColumnTBContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#relationalExpEq}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpEq(@NotNull SQLParser.RelationalExpEqContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#relationalExpEq}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpEq(@NotNull SQLParser.RelationalExpEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipoInt}
	 * labeled alternative in {@link SQLParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipoInt(@NotNull SQLParser.TipoIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipoInt}
	 * labeled alternative in {@link SQLParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipoInt(@NotNull SQLParser.TipoIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(@NotNull SQLParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(@NotNull SQLParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(@NotNull SQLParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(@NotNull SQLParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(@NotNull SQLParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(@NotNull SQLParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull SQLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull SQLParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(@NotNull SQLParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(@NotNull SQLParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expAnd}
	 * labeled alternative in {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpAnd(@NotNull SQLParser.ExpAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expAnd}
	 * labeled alternative in {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpAnd(@NotNull SQLParser.ExpAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipoDate}
	 * labeled alternative in {@link SQLParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipoDate(@NotNull SQLParser.TipoDateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipoDate}
	 * labeled alternative in {@link SQLParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipoDate(@NotNull SQLParser.TipoDateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#formatValue}.
	 * @param ctx the parse tree
	 */
	void enterFormatValue(@NotNull SQLParser.FormatValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#formatValue}.
	 * @param ctx the parse tree
	 */
	void exitFormatValue(@NotNull SQLParser.FormatValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#logicExp}.
	 * @param ctx the parse tree
	 */
	void enterLogicExp(@NotNull SQLParser.LogicExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#logicExp}.
	 * @param ctx the parse tree
	 */
	void exitLogicExp(@NotNull SQLParser.LogicExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expNotFactor}
	 * labeled alternative in {@link SQLParser#unifactor}.
	 * @param ctx the parse tree
	 */
	void enterExpNotFactor(@NotNull SQLParser.ExpNotFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expNotFactor}
	 * labeled alternative in {@link SQLParser#unifactor}.
	 * @param ctx the parse tree
	 */
	void exitExpNotFactor(@NotNull SQLParser.ExpNotFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#relationalExp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExp(@NotNull SQLParser.RelationalExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#relationalExp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExp(@NotNull SQLParser.RelationalExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#relationalExpGL}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpGL(@NotNull SQLParser.RelationalExpGLContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#relationalExpGL}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpGL(@NotNull SQLParser.RelationalExpGLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code useDB}
	 * labeled alternative in {@link SQLParser#database}.
	 * @param ctx the parse tree
	 */
	void enterUseDB(@NotNull SQLParser.UseDBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code useDB}
	 * labeled alternative in {@link SQLParser#database}.
	 * @param ctx the parse tree
	 */
	void exitUseDB(@NotNull SQLParser.UseDBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropColumnTB}
	 * labeled alternative in {@link SQLParser#tableAction}.
	 * @param ctx the parse tree
	 */
	void enterDropColumnTB(@NotNull SQLParser.DropColumnTBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropColumnTB}
	 * labeled alternative in {@link SQLParser#tableAction}.
	 * @param ctx the parse tree
	 */
	void exitDropColumnTB(@NotNull SQLParser.DropColumnTBContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(@NotNull SQLParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(@NotNull SQLParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cFK}
	 * labeled alternative in {@link SQLParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterCFK(@NotNull SQLParser.CFKContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cFK}
	 * labeled alternative in {@link SQLParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitCFK(@NotNull SQLParser.CFKContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTB}
	 * labeled alternative in {@link SQLParser#table}.
	 * @param ctx the parse tree
	 */
	void enterCreateTB(@NotNull SQLParser.CreateTBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTB}
	 * labeled alternative in {@link SQLParser#table}.
	 * @param ctx the parse tree
	 */
	void exitCreateTB(@NotNull SQLParser.CreateTBContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(@NotNull SQLParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(@NotNull SQLParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expEq}
	 * labeled alternative in {@link SQLParser#exp3}.
	 * @param ctx the parse tree
	 */
	void enterExpEq(@NotNull SQLParser.ExpEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expEq}
	 * labeled alternative in {@link SQLParser#exp3}.
	 * @param ctx the parse tree
	 */
	void exitExpEq(@NotNull SQLParser.ExpEqContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#todo}.
	 * @param ctx the parse tree
	 */
	void enterTodo(@NotNull SQLParser.TodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#todo}.
	 * @param ctx the parse tree
	 */
	void exitTodo(@NotNull SQLParser.TodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expFactor}
	 * labeled alternative in {@link SQLParser#unifactor}.
	 * @param ctx the parse tree
	 */
	void enterExpFactor(@NotNull SQLParser.ExpFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expFactor}
	 * labeled alternative in {@link SQLParser#unifactor}.
	 * @param ctx the parse tree
	 */
	void exitExpFactor(@NotNull SQLParser.ExpFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expParentheses}
	 * labeled alternative in {@link SQLParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterExpParentheses(@NotNull SQLParser.ExpParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expParentheses}
	 * labeled alternative in {@link SQLParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitExpParentheses(@NotNull SQLParser.ExpParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#casitodo}.
	 * @param ctx the parse tree
	 */
	void enterCasitodo(@NotNull SQLParser.CasitodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#casitodo}.
	 * @param ctx the parse tree
	 */
	void exitCasitodo(@NotNull SQLParser.CasitodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTB}
	 * labeled alternative in {@link SQLParser#table}.
	 * @param ctx the parse tree
	 */
	void enterRenameTB(@NotNull SQLParser.RenameTBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTB}
	 * labeled alternative in {@link SQLParser#table}.
	 * @param ctx the parse tree
	 */
	void exitRenameTB(@NotNull SQLParser.RenameTBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expLiteral}
	 * labeled alternative in {@link SQLParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterExpLiteral(@NotNull SQLParser.ExpLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expLiteral}
	 * labeled alternative in {@link SQLParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitExpLiteral(@NotNull SQLParser.ExpLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createDB}
	 * labeled alternative in {@link SQLParser#database}.
	 * @param ctx the parse tree
	 */
	void enterCreateDB(@NotNull SQLParser.CreateDBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createDB}
	 * labeled alternative in {@link SQLParser#database}.
	 * @param ctx the parse tree
	 */
	void exitCreateDB(@NotNull SQLParser.CreateDBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipoChar}
	 * labeled alternative in {@link SQLParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipoChar(@NotNull SQLParser.TipoCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipoChar}
	 * labeled alternative in {@link SQLParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipoChar(@NotNull SQLParser.TipoCharContext ctx);
}