package com.github.zxh.classpy.parsergen;

import com.github.zxh.classpy.spec.parser.*;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ParserGen extends FileSpecBaseListener {

    private final String outDir;
    private StringWriter sw = new StringWriter();
    private PrintWriter pw = new PrintWriter(sw);

    public ParserGen(String outDir) {
        this.outDir = outDir;
    }

    @Override
    public void enterSpec(FileSpecParser.SpecContext ctx) {
        // TODO
    }

    @Override
    public void exitSpec(FileSpecParser.SpecContext ctx) {
        System.out.println(sw.toString());
    }

    @Override
    public void enterPart(FileSpecParser.PartContext ctx) {
        pw.printf("public class %s {\n", ctx.name.getText());
    }

    @Override
    public void exitPart(FileSpecParser.PartContext ctx) {
        pw.println("}");
    }

    @Override
    public void enterField(FileSpecParser.FieldContext ctx) {
        pw.printf("    public %s %s;\n",
                ctx.type.getText(), ctx.name.getText());
    }

    @Override
    public void enterTable(FileSpecParser.TableContext ctx) {
        pw.printf("    public %s[] %s\n",
                ctx.type.getText(), ctx.name.getText());
    }

}
