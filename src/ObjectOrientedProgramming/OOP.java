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

        // creating an instance for the smartPhone class

        SmartPhone phone=new SmartPhone("Samsung","A23",1600);
        SmartPhone apple=new SmartPhone("Apple","iPhone 14",1200);
        // method chaining
        phone.applyDiscount(-10).comparePrice(apple).showDetails();
    }
}


