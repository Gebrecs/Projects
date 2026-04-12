
package Inheritance;
public class Mammals extends Animal {
    String breed;
    public Mammals(String name, String color, int speed,String breed) {
        super(name, color, speed);
        this.breed=breed;
        System.out.println("Mammals's name is:" +name + " and  breed is " + breed);

    }
    void walk(){
        super.eat();
        System.out.println("Mammals walks");


    }
}
