package ObjectOrientedProgramming;
public class OOP {

    public static void main(String[] args) {

        Car car = new Car();
        // method chaining

        car.setColor("Black")
           .setYear(2005)
           .setModel("BMW")
           .showDetails();

        Car newCar = new Car();
        newCar.setColor("Red")
                .setModel("Toyota")
                .setYear(2010)
                .showDetails();
    }
}


