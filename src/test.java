import java.util.Scanner;

public class test{
    public static void main(String[] args){
        System.out.println("Hello World");// semicolon is mandatory here
        System.out.println("Java is one of the most popular programming language right now!");


        // handling user inputs

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter your name: ");

        String name = scanner.nextLine();

        System.out.println("Hello " + name + "!");


        double numDouble =1.0/2.0;
        System.out.println(numDouble);

        // explicit type casting
        // there will be a value lose

        double shapeValue=42.75;
        System.out.println("Current Shape (double): " + shapeValue);
        int intShape =(int) shapeValue;
        System.out.println("Transformed into long: " + intShape);

        float floatShape =(float) shapeValue;
        System.out.println("Current Shape (float): " + floatShape);

        // implicit type casting
        // there is no value loss
        int num=10;
        // no value lose is  here
        System.out.println("Transformed into int: " + num);
        System.out.println("Current Num: " + (double) num);



        // switch statement and nested switch statement

        System.out.println("enter ur choice");
        String choice=scanner.nextLine();
        switch(choice){

            case "1":

                System.out.println("u are choosing the right thing");
                break;
            case "2":
                System.out.println("u choose choice 2 , actually bad choice");
                break;

            case "3":

                String choice2=scanner.nextLine();
                System.out.println("enter ur choice2");
                switch(choice2){
                    case "1":
                        System.out.println("this an other type of choice!");
                        break;
                    case "2":
                        System.out.println("This this a miracle choice!");
                        break;
                    default:
                            System.out.println("Invalid choice!");
                }
                break;
            case "4":
                    System.out.println("it is the most ugly choice u make ever!");
                    break;
            default:
                        System.out.println("Invalid choice!");


        }

        scanner.close();


    }

}