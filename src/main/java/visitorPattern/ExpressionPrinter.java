package visitorPattern;

public class ExpressionPrinter implements ExpressionVisitor {
    private StringBuilder sb = new StringBuilder();

     static void print(Expression e, StringBuilder sb){
        if(e.getClass() == DoubleExpression.class){
            sb.append( ((DoubleExpression)e).getValue());
        } else if (e.getClass() == AdditionExpression.class){
            sb.append("(");
            print(((AdditionExpression)e).getLeft(), sb);
            sb.append("+");
            print(((AdditionExpression)e).getRight(), sb);
            sb.append(")");
        }
    }

    @Override
    public void visit(DoubleExpression ex) {
        sb.append(ex.getValue());
    }

    @Override
    public void visit(AdditionExpression ex) {
        sb.append("(");
        ex.getLeft().accept(this);
        sb.append("+");
        ex.getRight().accept(this);
        sb.append(")");
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
