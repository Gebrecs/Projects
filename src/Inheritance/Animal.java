
package Inheritance;
public class Animal {
    private static boolean creationMessageShown = false;
    String name; // field, attribute or data
    String color;
    int speed;

    // constructor
    public Animal(String name,String color,int speed){
        this.name=name;
        this.color=color;
        this.speed=speed;
        // This constructor is called twice because the two classes inherit from it and then created two objects of their own.
        // To remove this thing we can use the following handling method
       if (!creationMessageShown) {
           System.out.println("Animals are created");
           creationMessageShown = true;
        }
    }
    void eat(){
        System.out.println("Animals eat lots of foods than humans");
    }
}
