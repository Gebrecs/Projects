package ObjectOrientedProgramming;
public class OOP {

    public static void main(String[] args) {

        Car car = new Car();
        car.color = "red";
        car.year = 2030;
        car.model = "BMW";

        // calling the method using the object
        car.showDetails();

        Car car2 = new Car();
        car2.color = "blue";
        car2.year = 2040;
        car2.model = "Mercedes";

        // calling the method using the object for the second car
        car2.showDetails();



    }
}