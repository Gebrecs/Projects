package emailValidator;
import java.util.Scanner;

public class EmailValidator {
     static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your email address:");
        String email = scanner.nextLine();

        if (isValidEmail(email)) {
            System.out.println("Valid email address");
        } else {
            System.out.println("Invalid email address");
        }

        scanner.close();
    }

    // Main validator method
    public static boolean isValidEmail(String email) {

        // 1. Check for spaces
        if (email.contains(" ")) {
            return false;
        }

        // 2. Check that there is exactly one '@'
        int atIndex = email.indexOf("@");
        if (atIndex == -1 || atIndex != email.lastIndexOf("@")) {
            return false;
        }

        // 3. Check there is at least one character before and after '@'
        if (atIndex == 0 || atIndex == email.length() - 1) {
            return false;
        }

        // 4. Check for dot after '@' and validate its position
        // this searches for dot beginning from the '@'
        int dotIndex = email.indexOf(".", atIndex);
        if (dotIndex == -1 || dotIndex == atIndex + 1 || dotIndex == email.length() - 1) {
            return false;
        }

        // 5. Check that the username (before '@') does not start or end with '.'
        String username = email.substring(0, atIndex);
        if (username.startsWith(".") || username.endsWith(".")) {
            return false;
        }

        // If all checks pass, the email is valid
        return true;
    }



        // we can do this all code very simplified way,but it is the most advisable way to do it.
        // This teaches us different methods and how they work dynamically.


        // let's do it in a simplified way

    // Regex pattern used to validate a simple email structure
    //String pattern = "^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$";

   /*
    if(email.matches(pattern)){
        System.out.println("Valid email address");
    }
    else{
        System.out.println("Invalid email address");
    }

    ^ start of the string (the email must begin here)

    [^\\s@]+ one or more characters that are NOT:
                - whitespace (\s)
                - '@'
               this represents the username part before '@'
               example: "user"

    @            → the email must contain exactly one '@' symbol

    [^\\s@]+ one or more characters that are NOT:
                - whitespace
                - '@'
               this represents the domain name
               example: "gmail"

    \\.          → a literal dot '.'
               (we escape it with \\ because '.' normally means "any character" in regex)

    [^\\s@]+ one or more characters that are NOT:
                - whitespace
                - '@'
               this represents the domain extension
               example: "com", "org", "net"

    $ end of the string (nothing should come after this)



*/


    }
