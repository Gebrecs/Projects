package ObjectOrientedProgramming;
public class SmartPhone {

    private String brand;
    private String model;
    private double price;

    public SmartPhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;

    }
 // methods
    public SmartPhone applyDiscount(double discount){
        if(discount>100 || discount<0){
            System.out.println("Invalid input , please enter a valid discount percentage");
        }
        this.price -= this.price*(discount/100);
        return this;
    }

    // this method takes an object as parameter
    public SmartPhone comparePrice(SmartPhone otherPhone){
        if(this.price > otherPhone.price){
            System.out.println("This phone is expensive than " +otherPhone.model);
        }else if(this.price < otherPhone.price){
            System.out.println("This phone is cheaper than " +otherPhone.model);
        }else {
            System.out.println("This phone is as expensive as " +otherPhone.model);
        }
        return this;
    }

    public SmartPhone showDetails(){
        System.out.println("This phone is " + brand + " " + model + " and it costs " + price);
        return this;
    }
}
