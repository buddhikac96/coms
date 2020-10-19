package expressions;

public class Declaration extends Expression {
    public String name;
    public String dtype;
    public int value;

    public Declaration(String name, String dtype, int value) {
        this.name = name;
        this.dtype = dtype;
        this.value = value;
    }

    @Override
    public String toString() {
        return new StringBuilder(this.dtype)
                .append(" ")
                .append(this.name)
                .append(" = ")
                .append(new Integer(this.value).toString())
                .toString();
    }
}

