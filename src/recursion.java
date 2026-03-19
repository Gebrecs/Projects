import java.util.Scanner;
import java.util.Stack;
public class recursion {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a whole number to get its factorial:");
        int num= scanner.nextInt();
        System.out.println("Factorial of " + num + " is " + factorial(num));


        // building an encoder of characters

        // display menu

        System.out.println("Welcome to the encoder-decoder game trial");
        System.out.println("1.encode characters");
        System.out.println("2. decode characters");

        char again;

        do{

            System.out.println("Choose 1 to encode or 2 to decode:");
            int choice= scanner.nextInt();
            scanner.nextLine(); // consumes the Enter key

            System.out.println("enter a string");
            String input=scanner.nextLine();

            if(choice==1){
                System.out.println("encoded string is: " + encode(input,0));
            }else if(choice==2){
                System.out.println("decoded string is: " + decode(input,0));
            }else{
                System.out.println("invalid choice");
            }
            System.out.println("do you want to encode or decode again? (y/n)");
            again=scanner.next().charAt(0);

        }while(again=='y' || again=='Y');

        System.out.println("Thank you for playing!");


    }

    public static String encode(String input,int index){

        // base case
        // returns an empty string if the index is equal to the length of the input string
        if(index==input.length()){
            return "";

        }

        // recursive case

       char ch= input.charAt(index); // takes a single character from the input string at the specified index
       char encodedChar=atbash(ch); // takes that character and takes its atbash value

       return encodedChar + encode(input,index+1); // takes the next character of the input string
    }

    // decoding a character


    public static String decode(String input,int index){

        // base case
        // returns an empty string if the index is equal to the length of the input string
        if(index==input.length()){
            return "";

        }

        // recursive case

        char ch= input.charAt(index); // takes a single character from the input string at the specified index
        char decodedChar=atbash(ch); // takes that character and takes its atbash value

        return decodedChar + decode(input,index+1); // takes the next character of the input string
    }

     public static char atbash(char ch){
        if(ch<='z' && ch>='a'){
            return (char)('z'-(ch-'a')); // we have to cast here because without casting their ASCII  value is , which is numeric.
        }else if(ch<='Z' && ch >= 'A'){
             return (char) ('Z' - (ch - 'A'));
         }else{
            return ch;
         }
     }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
}
