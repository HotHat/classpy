package com.github.zxh.classpy.parsergen;

import com.github.zxh.classpy.spec.parser.FileSpecLexer;
import com.github.zxh.classpy.spec.parser.FileSpecParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String specFile = args[0];
        ParserGen pg = new ParserGen(args[1]);

        CharStream input = CharStreams.fromFileName(specFile);
        FileSpecLexer lexer = new FileSpecLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FileSpecParser parser = new FileSpecParser(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(pg, parser.spec());
    }

}
