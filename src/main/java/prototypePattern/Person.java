package prototypePattern;

import java.io.Serializable;
import java.util.Arrays;

public class Person implements Cloneable, Serializable{
    public String[] names;
    public Address address;

    public Person(String[] names, Address address) {
        this.names = names;
        this.address = address;
    }


    @Override
    public String toString() {
        return "Person{" +
                "names=" + Arrays.toString(names) +
                ", address=" + address +
                '}';
    }

    @Override
    public Person clone(){
        return new Person(names.clone(), address.clone());
    }
}
