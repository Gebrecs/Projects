
// a library that forms  a random number
import java.util.Random;

// a class that enables a user to enter his.....
import java.util.Scanner;

public class applications {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter a length of a desired password");
        int userLengthOfPassword = scanner.nextInt();
        String password = generatePassword(userLengthOfPassword);

        System.out.println("Randomly generated password is : " + password);

        scanner.close();// closing the scanner object

    }
    public static String generatePassword(int lengthOfPassword){
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+~`|}{[]:;?><,./-=";
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        for(int i=0;i<lengthOfPassword;i++){
            int index = random.nextInt(chars.length());
            password.append(chars.charAt(index));
        }
        return password.toString();

    }
}
