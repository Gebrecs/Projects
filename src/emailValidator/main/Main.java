package emailValidator.main;
import emailValidator.person.Person;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        // 1. Ask for the number of persons
        System.out.print("Enter number of persons: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // creating an array of person objects to store them

        Person[] people=new Person[n];

        // reading person data

        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + i);

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.print("Enter city: ");
            String city = scanner.nextLine();

            people[i] = new Person(name, age, city);
        }
        // updating an age

        System.out.println("Enter an index to update the age: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        if(index>=0 && index<n){
            System.out.print("Enter new age: ");
            int newAge = scanner.nextInt();
            people[index].updateAge(people[index],newAge);
        }else {
            System.out.println("Invalid index, updating is not done");
        }

        // creating modified person

        Person modifiedPerson = null;
        System.out.println("Enter an index to modify the person: ");

        int index2 = scanner.nextInt();
        scanner.nextLine(); // removes enter key buffer
        if(index2>=0&&index2<n){
            System.out.println("Enter new name: ");
            String newName=scanner.nextLine();
            

        }
    }

}
