package expressions;

import antlr.ExprBaseVisitor;
import antlr.ExprParser;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

public class AntlrToExpression extends ExprBaseVisitor<Expression> {

    private List<String> variables;
    private List<String> semanticErrors;

    public AntlrToExpression(List<String> semanticErrors) {
        this.semanticErrors = semanticErrors;
        this.variables = new ArrayList<>();
    }

    @Override
    public Expression visitDeclaration(ExprParser.DeclarationContext ctx) {
        String id = ctx.getChild(0).getText();
        if(variables.contains(id)){
            Token idToken = ctx.ID().getSymbol();
            int lineNumber = idToken.getLine();
            int colNumber = idToken.getCharPositionInLine() + 1;

            String errMsg = String.format(
              "Error(%d,%d): Variable %s already declared",
                    lineNumber, colNumber, id
            );

            this.semanticErrors.add(errMsg);
        }else{
            variables.add(id);
        }

        String dtype = ctx.getChild(2).getText();
        int number = Integer.parseInt(ctx.getChild(4).getText());

        return new Declaration(id, dtype, number);
    }

    @Override
    public Expression visitMultiplication(ExprParser.MultiplicationContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));

        return new Multiplication(left, right);
    }

    @Override
    public Expression visitAddition(ExprParser.AdditionContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));

        return new Addition(left, right);
    }

    @Override
    public Expression visitVariable(ExprParser.VariableContext ctx) {
        String id = ctx.ID().getText();
        if(variables.contains(id)){
            this.semanticErrors.add(
                    "Error: Variable " + id + " is not declared"
            );
        }
        return new Variable(id);
    }

    @Override
    public Expression visitNumber(ExprParser.NumberContext ctx) {
        String number = ctx.getChild(0).getText();
        int num = Integer.parseInt(number);
        return new Number(num);
    }
}
