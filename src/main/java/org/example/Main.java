package org.example;

/*Create a class called House that has 3 instance variables:
     a string address
     an int numberOfFloors
     Define a constructor method for House that will print in console a message as soon as a House object is created
     Define a testing class (e.g. Tester, Start or another reasonable name you prefer) with a main method where:
     you declare two House variables house1 and house2
     you create two House objects and assign them to the variables house1 and house2 */
public class Main {
    public static void main(String[] args) {


        House house1 = new House("Via Roma", 3);
        System.out.println("La casa si trova in " + house1.address + " e possiede " + house1.numberOfFloors + " piani");
        House house2 = new House("Via Milano", 4);
        System.out.println("La casa si trova in " + house2.address + " e possiede " + house2.numberOfFloors + " piani");
    }
}
