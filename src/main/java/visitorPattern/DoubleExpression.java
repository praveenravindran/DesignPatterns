package visitorPattern;

public class DoubleExpression extends Expression{
    private Double value;

    public DoubleExpression(Double value) {
        this.value = value;
    }

    @Override
    void print(StringBuilder sb) {
       sb.append(value);
    }

    @Override
    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "DoubleExpression{" +
                "value=" + value +
                '}';
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
