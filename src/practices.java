import java.util.Scanner;
public class practices{
    public static void main(String[] args){

        String food1, food2, food3;
        int calories1, calories2 , calories3;
        int totalCalories;

        Scanner scanner= new Scanner(System.in);

        /*

        System.out.println("please enter the name of the first food items");

        food1= scanner.nextLine();
        System.out.println("please enter the calories of the first food items");
        calories1= scanner.nextInt();

        scanner.nextLine();

        System.out.println("please enter the name of the second food items");

        food2= scanner.nextLine();
        System.out.println("please enter the calories of the second food items");
        calories2= scanner.nextInt();

        scanner.nextLine();

        System.out.println("please enter the name of the third food items");
        food3= scanner.nextLine();
        System.out.println("please enter the calories of the third food items");
        calories3= scanner.nextInt();

        scanner.nextLine();// it is used to consume the int buffer(Enter key)

        totalCalories= calories1+calories2+calories3;

        // displaying the result per each food item

        System.out.println("Your calory intake is summarized as the following");
        System.out.println(food1 + " has " + calories1 + " calories");
        System.out.println(food2 + " has " + calories2 + " calories");
        System.out.println(food3 + " has " + calories3 + " calories");

        // showing total calory intake

        System.out.println("your total calories intake for the three food items is : " + totalCalories + " calories");
*/


        // building a pyramid using for loop

        System.out.println("Enter a number of rows  to build the shape of pyramid");

        int rows = scanner.nextInt();
        // outer loop that controls the number of rows
        for(int i=1;i<=rows;i++){
        // first inner loop that controls the number of spaces,spaces are horizontal wide with respect to the center of the pyramid
            for(int j=0;j<rows -i;j++){

                System.out.print(" ");
            }
            // second inner loop that controls the number of stars
            for(int k=0;k<2*i-1;k++){

                System.out.print("*");
            }
            System.out.println();
        }

        // building a fibonacci number

        // 0 1 1 2 3 5 8 13 21 33 ......

        System.out.println("please enter the number of terms ");

        int terms = scanner.nextInt();

        int firstTerm = 0, secondTerm = 1;

        if(terms==1){
            System.out.println(firstTerm);
        } else {

            System.out.print(firstTerm + " " + secondTerm);

            for(int i=3;i<=terms;++i){

                int nextTerm=firstTerm+secondTerm;

                System.out.print(" " + nextTerm);

                firstTerm=secondTerm;
                secondTerm=nextTerm;

            }

        }
        // Harshad number
        //  is a number in which it is divisibly by the sum of the digits of the number.

        int userInputNum;
        System.out.println("Enter a number to check if it is harshad number or not");

        userInputNum=scanner.nextInt(); // accepts the user input

        int originalNum=userInputNum;// saves the original number because the userInputNum will be changed.

        int sumOfDigits=0;

        int tempNum =Math.abs(userInputNum);// handles negative numbers too.
        while(tempNum>0){

            sumOfDigits+=tempNum%10;

            tempNum/=10;
        }
        if(sumOfDigits==0){
            System.out.println(originalNum+" is not Harshad number");
        }else if(originalNum%sumOfDigits==0){
            System.out.println(originalNum+" is  Harshad number");
        }else{
            System.out.println(originalNum+" is not Harshad number");
        }
    }
}

