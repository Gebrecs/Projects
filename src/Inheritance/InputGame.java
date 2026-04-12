package Inheritance;
import java.util.Scanner;
public class InputGame extends WordGame {

    public InputGame(String word) {
        super(word);
    }

    @Override
    public void playGame() {
        Scanner sc=new Scanner(System.in);
        while(!(isWordGuessed())){
            System.out.print("Enter a word: ");
            String guessedWord=sc.nextLine();
            if(guessedWord.equalsIgnoreCase(word)){
                System.out.println("Word Guessed!");

            }
        }

    }
}
