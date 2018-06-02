package factoryPattern;

public class PointWithoutFactory {

    private double x;
    private double y;

    public PointWithoutFactory(double a, double b, CoordinateSystem cs){
        switch (cs){
            case CARTESIANSYSTEM:
                this.x = a;
                this.y = b;
                break;

            case POLAR:
                this.x = Math.cos(a);
                this.y = Math.cos(b);
        }
    }
}
