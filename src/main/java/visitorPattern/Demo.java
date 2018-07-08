package visitorPattern;

public class Demo {

    public static void main(String[] args) {
        //1. Intrusive visitor
        AdditionExpression ex = new AdditionExpression(new DoubleExpression(5.0), new AdditionExpression(
                new DoubleExpression(4.0), new DoubleExpression(3.0)
        ));

        StringBuilder sb = new StringBuilder();
        ex.print(sb);
        System.out.println(sb);

        //2. Reflective visitor
        StringBuilder sb2 = new StringBuilder();
        ExpressionPrinter.print(ex, sb2);
        System.out.println(sb2);

        //3. Classic Visitor
        ExpressionVisitor expressionVisitor = new ExpressionPrinter();
        expressionVisitor.visit(ex);
        System.out.println(expressionVisitor);
        ExpressionCalculator expressionCalculator = new ExpressionCalculator();
        expressionCalculator.visit(ex);
        System.out.println(expressionVisitor + " equals " + expressionCalculator.value);


    }

}
