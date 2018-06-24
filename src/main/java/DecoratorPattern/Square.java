package DecoratorPattern;

public class Square implements Shape {

    public float side;

    public Square() {
    }

    public Square(float side) {
        this.side = side;
    }

    @Override
    public String info() {
        return "this is a square with side " + side;
    }
}
