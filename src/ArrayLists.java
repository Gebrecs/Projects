import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {

    public static void main(String[] args){
        Fruits.fruitExamples();
        language.ethiopianLanguages();
    }

    static class Fruits{

        static void fruitExamples(){

            ArrayList<String> fruits = new ArrayList<>();

            // <>
            //This is the diamond operator
            //Java infers the type (String) from the left side

            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Mango");
            fruits.add("Orange");
            fruits.add("Pineapple");
            fruits.add("Strawberry");
            fruits.add(6,"Avocado");

            System.out.println();

            // this prints out each fruit in the array

           for(String fruit:fruits){
               System.out.println(fruit);
           }

           // if we want to print in array form like ([Apple,Banana,Mango])
           // we use this ont (System.out.println(fruits);)



            // get method

            System.out.println("get method to get each individual fruits element");

           System.out.println(fruits.get(0)); // prints Apple

            System.out.println();


            // contains method
            // this method returns a boolean value
            System.out.println("contains method to check if the array contains a specific fruit");

            System.out.println(fruits.contains("apple"));

            System.out.println();


            // remove,set methods

            System.out.println("remove method to remove a specific fruit from the array");
            fruits.remove("Banana");
            System.out.println(fruits);
            System.out.println();

            // set method
            System.out.println("set method to change the value of a specific fruit in the array");
            fruits.set(0,"Watermelon");// we have to specify the index of the fruit to be changed
            System.out.println(fruits);
        }

    }

    // other methods

    static class language{
       public static void ethiopianLanguages(){
           ArrayList<String> Languages = new ArrayList<>();
           Languages.add("Amharic");
           Languages.add("Kementisa");
           Languages.add("Afan Oromo");
           Languages.add("Tigregna");
           Languages.add("Gafatigna");

           // logging languages of array to the console
           System.out.println(Languages);

       }
    }
}