package prototypePattern;

import java.io.Serializable;

public class Address implements Cloneable, Serializable{
    public String streetName;
    public Integer houseNumber;

    public Address(String streetName, Integer houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    public Address(Address other){
       this(other.streetName, other.houseNumber);
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }

    @Override
    public Address clone(){
        return new Address(streetName, houseNumber);
    }
}
