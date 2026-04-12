package Inheritance;


public class PetAnimals extends Mammals {
    int age;

    public PetAnimals(String name,String color, int speed,int age,String breed) {
        // the super keyword is used to fetch the parent class data like what we did below
        super(name,color,speed,breed);
        this.age=age;
        System.out.println("Pet animals are created");
    }
    // super keyword is also used to methods
    void bark(){
        // let's invoke the eat method here

        super.walk();
        System.out.println("Dogs bark but cats cannot bark");
        System.out.println("Dogs age is " + age);
    }
}
