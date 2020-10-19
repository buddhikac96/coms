package expressions;

public class Variable extends Expression {
    String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
