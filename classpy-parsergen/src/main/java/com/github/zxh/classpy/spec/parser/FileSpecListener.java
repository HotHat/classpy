// Generated from FileSpec.g4 by ANTLR 4.7.2

package com.github.zxh.classpy.spec.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FileSpecParser}.
 */
public interface FileSpecListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FileSpecParser#spec}.
	 * @param ctx the parse tree
	 */
	void enterSpec(FileSpecParser.SpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link FileSpecParser#spec}.
	 * @param ctx the parse tree
	 */
	void exitSpec(FileSpecParser.SpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link FileSpecParser#part}.
	 * @param ctx the parse tree
	 */
	void enterPart(FileSpecParser.PartContext ctx);
	/**
	 * Exit a parse tree produced by {@link FileSpecParser#part}.
	 * @param ctx the parse tree
	 */
	void exitPart(FileSpecParser.PartContext ctx);
	/**
	 * Enter a parse tree produced by {@link FileSpecParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(FileSpecParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link FileSpecParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(FileSpecParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link FileSpecParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(FileSpecParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FileSpecParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(FileSpecParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FileSpecParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(FileSpecParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FileSpecParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(FileSpecParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FileSpecParser#branch}.
	 * @param ctx the parse tree
	 */
	void enterBranch(FileSpecParser.BranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link FileSpecParser#branch}.
	 * @param ctx the parse tree
	 */
	void exitBranch(FileSpecParser.BranchContext ctx);
}