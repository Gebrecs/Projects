package emailValidator.person;

public class Person {
    protected String name;
    protected int age;
    protected String city;

    // constructor chaining or cascading

    public Person(String name){
        this.name=name;
    }
    // second constructor
    public Person(String name,int age){
        this(name);
        this.age=age;
    }

    // third constructor

    public Person(String name,int age,String city){
        this(name,age);
        this.city=city;
    }
    // methods to implement different tasks

    // method to update a person's age
    public void updateAge(Person person,int newAge){
        person.age=newAge;
    }

    // method that updates the whole person's details and return a new object

    public Person getModifiedPerson(String newName,int newAge,String newCity){
        return new Person(newName,newAge,newCity);
    }

    // method to display information

    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("City: "+city);
    }
}