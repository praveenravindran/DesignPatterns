package prototypePattern;



public class Demo {

    public static void main(String[] args) {

        // Example with Cloneable
        Person john = new Person(new String[]{"John", "Smith"}, new Address("102 Street", 102));
        System.out.println("Original" + john);
        Person jane = john.clone();
        jane.names[0] = "Jane";
        jane.address.houseNumber = 103;
        System.out.println("Cloned" + jane);

        System.out.println("");

        //Example with Copy Constructor
        Employee jack = new Employee("Jack", new Address("102 Street", 102));
        System.out.println("Original " + jack);
        Employee jimmy = new Employee(jack);
        jimmy.name = "Jimmy";
        jimmy.address.houseNumber = 103;
        System.out.println("Created with copy construcyor  " + jimmy);
        
    }
}
