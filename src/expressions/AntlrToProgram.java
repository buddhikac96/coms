package expressions;

import antlr.ExprBaseVisitor;
import antlr.ExprParser;

import java.util.ArrayList;
import java.util.List;

public class AntlrToProgram extends ExprBaseVisitor<Program> {

    public List<String> semanticErrors;

    @Override
    public Program visitProgram(ExprParser.ProgramContext ctx) {
        Program program = new Program();
        this.semanticErrors = new ArrayList<>();

        AntlrToExpression exprVisitor = new AntlrToExpression(semanticErrors);
        for(int i = 0; i < ctx.getChildCount() - 1; i++){
            program.addExpression(exprVisitor.visit(ctx.getChild(i)));
        }

        return program;
    }
}
