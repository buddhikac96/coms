package expressions;

public class Multiplication extends Expression {
    public Expression left;
    public Expression right;

    public Multiplication(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return new StringBuilder(this.left.toString())
                .append("*")
                .append(this.right.toString())
                .toString();
    }
}
