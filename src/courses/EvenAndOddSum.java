package courses;
import java.util.Scanner;
public class EvenAndOddSum {
    public static void main(String[] args) {
        int sumEven=0;
        int sumOdd=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many number do you want to enter to get the sum of evens and odds separately?");
        int num=scanner.nextInt();
        int[] sumArr=new int [num];
        System.out.println("Enter the numbers to collect in the array and again get the sum of evens and odds separately. ");
        for(int i=0;i<num;i++){
            sumArr[i]=scanner.nextInt();
        }
        for(int i=0;i<num;i++){

            if(sumArr[i]%2==0){
                sumEven+=sumArr[i];
            }
            if(sumArr[i]%2!=0){
                sumOdd+=sumArr[i];
            }
        }
        System.out.println("The sum of evens is : "+sumEven);
        System.out.println("the sum of odds is : "+sumOdd);
    }
}
