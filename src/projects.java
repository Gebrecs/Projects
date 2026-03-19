import java.util.Scanner;
public class projects{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // creating a simple chatbot

        System.out.println("please enter something");

        String userInput = scanner.nextLine();

        if (userInput.equalsIgnoreCase("hello") || userInput.equalsIgnoreCase("hi")) {
            System.out.println("Chatbot: Hello there!, how are you?");
        }

       else if (userInput.equalsIgnoreCase("weather") || userInput.equalsIgnoreCase("how is the weather condition today?")) {
            System.out.println("Chatbot: It is sunny today!");
        }

        else if (userInput.equalsIgnoreCase("bye") || userInput.equalsIgnoreCase("have a nice day")) {
            System.out.println("Chatbot: Have a nice day!");
        }
        else{
            System.out.println("Chatbot: I don't understand you!");
        }
    }
}