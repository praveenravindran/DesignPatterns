package DecoratorPattern;

public class Circle implements Shape{

    public float radius;

    public Circle() {
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    public void resize(float factor){
        radius *= factor;
    }

    @Override
    public String info() {
     return "This is a circle with radius " + radius;
    }
}
