package visitorPattern;

abstract class Expression {
    abstract void print(StringBuilder sb);
    public abstract void accept(ExpressionVisitor ex);
}
