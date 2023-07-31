package org.example;
/* Create a class called House that has 3 instance variables:
    a string address
    an int numberOfFloors
    Define a constructor method for House that will print in console a message as soon as a House object is created
    Define a testing class (e.g. Tester, Start or another reasonable name you prefer) with a main method where:
    you declare two House variables house1 and house2
    you create two House objects and assign them to the variables house1 and house2 */
public class House {
    public String address;
    public int numberOfFloors;

    public House(String address, int numberOfFloors) {
        System.out.println(" as soon as a House object is created");
        this.address = address;
        this.numberOfFloors = numberOfFloors;


    }

    public String toString() {
        return address + " " +numberOfFloors;
    }
}
