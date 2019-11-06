// Generated from FileSpec.g4 by ANTLR 4.7.2

package com.github.zxh.classpy.spec.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FileSpecParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FileSpecVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FileSpecParser#spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpec(FileSpecParser.SpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link FileSpecParser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart(FileSpecParser.PartContext ctx);
	/**
	 * Visit a parse tree produced by {@link FileSpecParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(FileSpecParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link FileSpecParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(FileSpecParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link FileSpecParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(FileSpecParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FileSpecParser#branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch(FileSpecParser.BranchContext ctx);
}