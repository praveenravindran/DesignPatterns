package DecoratorPattern;

import specificationDesignPattern.Color;

import java.util.function.Supplier;

public class StaticColoredShape<T extends Shape> implements Shape {

    private Shape shape;
    private String color;

    public StaticColoredShape(Supplier<? extends T> ctor, String color){
        shape = ctor.get();
        this.color = color;
    }

    @Override
    public String info() {
        return shape.info() + " with color " + color;
    }
}
