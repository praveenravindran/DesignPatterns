package DecoratorPattern;

import java.util.function.Supplier;

public class StaticTransparentShape<T extends Shape> implements Shape {

    public Shape shape;
    public float transparencyPercent;

    public StaticTransparentShape(Supplier<? extends T> ctor, float transparencyPercent) {
        shape = ctor.get();
        this.transparencyPercent = transparencyPercent;
    }

    @Override
    public String info() {
        return shape.info() + " with " + transparencyPercent + "% transparency";
    }
}
