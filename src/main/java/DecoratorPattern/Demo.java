package DecoratorPattern;

public class Demo {

    public static void main(String[] args) {
        //String Decorator
        MagicString magicString = new MagicString("apple");
        System.out.println(magicString + " contains " + magicString.vowelCount() + " vowels");

        // Dynamic Decorators
        Circle circle = new Circle(10);
        System.out.println(circle.info());

        ColoredShape blueSquare = new ColoredShape(new Square(20), "blue");
        System.out.println(blueSquare.info());

        TransparentShape myCircle = new TransparentShape(new ColoredShape(new Circle(5), "green"), 50);
        System.out.println(myCircle.info());

        //Static Decorators
        StaticColoredShape<Circle> coloredShape = new StaticColoredShape<>(
                () -> new Circle(5),
                "red"
        );

        StaticTransparentShape<StaticColoredShape<Circle>> uglyCircle =
                new StaticTransparentShape<>(() ->
                        new StaticColoredShape<>(() -> new Circle(5), "green"), 50
                );

        // Adapter Decorator
        MyStringBuilder myStringBuilder = new MyStringBuilder();
        myStringBuilder.append("Hello World").addNewLine("And this too");
        MyStringBuilder builder2 = myStringBuilder.concat(" CONCAT");
        System.out.println(myStringBuilder.toString());
        System.out.println(builder2.toString());

    }


}
