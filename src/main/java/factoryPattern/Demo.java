package factoryPattern;

public class Demo {

    public static void main(String[] args) {
        Point cartesianPoint = Point.Factory.newCartesianPoint(2,3 );
        Point polarPoint = Point.Factory.newPolarPoint(2,3 );
        System.out.println("the cartesian coordinates are " + cartesianPoint.getX() + " : " + cartesianPoint.getY());
        System.out.println("the polar coordinates are " + polarPoint.getX() + " : " + polarPoint.getY());

        System.out.println(" ");

        Person person = new PersonFactory().createPerson("Praveen");
        System.out.println("Person is " + person.name + " and id is " +  person.id);
        Person person2 = new PersonFactory().createPerson("Raskhni");
        System.out.println("Person is " + person2.name + " and id is " +  person2.id);
    }
}
