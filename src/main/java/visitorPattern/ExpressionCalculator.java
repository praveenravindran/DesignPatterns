package visitorPattern;

public class ExpressionCalculator implements ExpressionVisitor {
    double value;

    @Override
    public void visit(DoubleExpression ex) {
        value = ex.getValue();
    }

    @Override
    public void visit(AdditionExpression ex) {
      ex.getLeft().accept(this);
      double a = value;
      ex.getRight().accept(this);
      double b = value;
      value = a + b;
    }
}
