// Generated from C:\Users\William\Documents\NetBeansProjects\SQLL\src\sqll\SQL.g4 by ANTLR 4.4
package ide;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code showTB}
	 * labeled alternative in {@link SQLParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTB(@NotNull SQLParser.ShowTBContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#logicExpOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExpOr(@NotNull SQLParser.LogicExpOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(@NotNull SQLParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTB}
	 * labeled alternative in {@link SQLParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTB(@NotNull SQLParser.DropTBContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(@NotNull SQLParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#references}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferences(@NotNull SQLParser.ReferencesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expGL}
	 * labeled alternative in {@link SQLParser#exp4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpGL(@NotNull SQLParser.ExpGLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tipoFloat}
	 * labeled alternative in {@link SQLParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoFloat(@NotNull SQLParser.TipoFloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#entero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntero(@NotNull SQLParser.EnteroContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#constraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraints(@NotNull SQLParser.ConstraintsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterDB}
	 * labeled alternative in {@link SQLParser#database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDB(@NotNull SQLParser.AlterDBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showDB}
	 * labeled alternative in {@link SQLParser#database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDB(@NotNull SQLParser.ShowDBContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(@NotNull SQLParser.CharacterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expNotOr}
	 * labeled alternative in {@link SQLParser#exp2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNotOr(@NotNull SQLParser.ExpNotOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expNotGl}
	 * labeled alternative in {@link SQLParser#exp4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNotGl(@NotNull SQLParser.ExpNotGlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(@NotNull SQLParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterTB}
	 * labeled alternative in {@link SQLParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTB(@NotNull SQLParser.AlterTBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cPK}
	 * labeled alternative in {@link SQLParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCPK(@NotNull SQLParser.CPKContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expNotEq}
	 * labeled alternative in {@link SQLParser#exp3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNotEq(@NotNull SQLParser.ExpNotEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expOr}
	 * labeled alternative in {@link SQLParser#exp2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpOr(@NotNull SQLParser.ExpOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(@NotNull SQLParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#orderby}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderby(@NotNull SQLParser.OrderbyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropConstraintTB}
	 * labeled alternative in {@link SQLParser#tableAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropConstraintTB(@NotNull SQLParser.DropConstraintTBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showColums}
	 * labeled alternative in {@link SQLParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowColums(@NotNull SQLParser.ShowColumsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#fecha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFecha(@NotNull SQLParser.FechaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropDB}
	 * labeled alternative in {@link SQLParser#database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDB(@NotNull SQLParser.DropDBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expNotAnd}
	 * labeled alternative in {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNotAnd(@NotNull SQLParser.ExpNotAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addConstraintTB}
	 * labeled alternative in {@link SQLParser#tableAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddConstraintTB(@NotNull SQLParser.AddConstraintTBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cCheck}
	 * labeled alternative in {@link SQLParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCCheck(@NotNull SQLParser.CCheckContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#logicExpAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExpAnd(@NotNull SQLParser.LogicExpAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#logicExpNot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExpNot(@NotNull SQLParser.LogicExpNotContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#decimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(@NotNull SQLParser.DecimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#nullType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullType(@NotNull SQLParser.NullTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expID}
	 * labeled alternative in {@link SQLParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpID(@NotNull SQLParser.ExpIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addColumnTB}
	 * labeled alternative in {@link SQLParser#tableAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddColumnTB(@NotNull SQLParser.AddColumnTBContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#relationalExpEq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpEq(@NotNull SQLParser.RelationalExpEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tipoInt}
	 * labeled alternative in {@link SQLParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoInt(@NotNull SQLParser.TipoIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(@NotNull SQLParser.InsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(@NotNull SQLParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(@NotNull SQLParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull SQLParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(@NotNull SQLParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expAnd}
	 * labeled alternative in {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpAnd(@NotNull SQLParser.ExpAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tipoDate}
	 * labeled alternative in {@link SQLParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoDate(@NotNull SQLParser.TipoDateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#formatValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatValue(@NotNull SQLParser.FormatValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#logicExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExp(@NotNull SQLParser.LogicExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expNotFactor}
	 * labeled alternative in {@link SQLParser#unifactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNotFactor(@NotNull SQLParser.ExpNotFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#relationalExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExp(@NotNull SQLParser.RelationalExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#relationalExpGL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpGL(@NotNull SQLParser.RelationalExpGLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code useDB}
	 * labeled alternative in {@link SQLParser#database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseDB(@NotNull SQLParser.UseDBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropColumnTB}
	 * labeled alternative in {@link SQLParser#tableAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropColumnTB(@NotNull SQLParser.DropColumnTBContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(@NotNull SQLParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cFK}
	 * labeled alternative in {@link SQLParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCFK(@NotNull SQLParser.CFKContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTB}
	 * labeled alternative in {@link SQLParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTB(@NotNull SQLParser.CreateTBContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(@NotNull SQLParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expEq}
	 * labeled alternative in {@link SQLParser#exp3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpEq(@NotNull SQLParser.ExpEqContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#todo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTodo(@NotNull SQLParser.TodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expFactor}
	 * labeled alternative in {@link SQLParser#unifactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpFactor(@NotNull SQLParser.ExpFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expParentheses}
	 * labeled alternative in {@link SQLParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpParentheses(@NotNull SQLParser.ExpParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#casitodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasitodo(@NotNull SQLParser.CasitodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTB}
	 * labeled alternative in {@link SQLParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTB(@NotNull SQLParser.RenameTBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expLiteral}
	 * labeled alternative in {@link SQLParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpLiteral(@NotNull SQLParser.ExpLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createDB}
	 * labeled alternative in {@link SQLParser#database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDB(@NotNull SQLParser.CreateDBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tipoChar}
	 * labeled alternative in {@link SQLParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoChar(@NotNull SQLParser.TipoCharContext ctx);
}