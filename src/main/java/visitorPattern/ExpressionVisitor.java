package visitorPattern;

interface ExpressionVisitor{
    void visit(DoubleExpression ex);
    void visit(AdditionExpression ex);

}