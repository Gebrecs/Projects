package ObjectOrientedProgramming;

import java.util.Scanner;

public class Car {
    String color;
    int year;
    String model;


    // setters with chaining
    public Car setColor(String color) {
        this.color = color;
        // return the current object to allow method chaining
        return this;
    }
    public Car setYear(int year) {
        this.year = year;
        return this;
    }
    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    void showDetails(){
        System.out.println("My dream car will have " + color + " color and it is going to be built " + year + " by " + model);
    }


}
