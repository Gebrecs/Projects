
import java.util.Scanner;
public class Stack{
    public static void main(String[] args){
        Stack stack= new Stack();
        System.out.println(stack.breadMaking(100));
        stackExample();
        stackExample2();
    }
    public static void stackExample(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        System.out.println("Number entered is " + num);
    }
    public static void stackExample2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter two numbers to get the power of the two numbers");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println("the power of the two numbers is = " + Math.pow(a,b));
    }
    public String breadMaking(int input) {
        if (input <= 0) {
            return "Invalid input";
        } else if (input <= 3) {
            return "This is a very small order for our capacity";
        } else if (input <= 9) {
            return "We can handle this amount";
        } else {
            return "We can provide this amount efficiently";
        }
    }
}