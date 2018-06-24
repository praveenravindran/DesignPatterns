package DecoratorPattern;

public class TransparentShape implements Shape {

    public Shape shape;
    public float transparencyPercent;

    public TransparentShape(Shape shape, float transparencyPercent) {
        this.shape = shape;
        this.transparencyPercent = transparencyPercent;
    }


    @Override
    public String info() {
        return shape.info() + " with " + transparencyPercent + "% transparency";
    }
}
