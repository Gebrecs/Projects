import java.util.Scanner;
import java.util.Random;
public class wordScramble {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // predefined word list

        String[] wordList={"apple","football", "run",
                "takeaway","library", "campus",
                "frequent","convenient","resilient",
                "scramble","congratulations","environment",
                "forestry","countryside","sophisticated"};

        int playerScore=0;
        boolean keepPlaying=true;

        System.out.println("Welcome to word scramble game ");
        System.out.println("please unscramble the word to score points!");


        // game loop
        while(keepPlaying){
            // create a random word from the word list
            String words=wordList[random.nextInt(wordList.length)];
            // scramble the word,calling the scrambleWords method
            String scrambledWords=scrambleWords(words,random);

            System.out.println("Unscrambled word: " + scrambledWords);

            boolean wordGuessed=false;

            int attempts=3;

            while(!wordGuessed && attempts>0){
                System.out.println("Enter your guess: ");
                String guess=scanner.nextLine();
                if(guess.equalsIgnoreCase(words)){
                    System.out.println("Congratulations🎉🎉🎉! You guessed the word correctly!");
                    wordGuessed=true;
                    playerScore++;
                }else{
                    System.out.println("Incorrect guess❌❌❌. You have " + attempts-- + " attempts remaining.");

                }

            }
            if(!wordGuessed){
                System.out.println("You ran out of attempts. The word was: " + words);
            }
            System.out.println("Your score: " + playerScore);
            System.out.println("Do you want to play again? (yes/no)");
            String playAgain=scanner.nextLine();

            // loops again if the user wants to play again
            keepPlaying=playAgain.equalsIgnoreCase("yes");

        }

        System.out.println("Thank you for playing! Your final score is: " + playerScore);

        scanner.close();

    }
    public static String scrambleWords(String word,Random random){
        // creates a character array to manipulate the word easily
        char[] chars=word.toCharArray();
        for(int i=0;i<chars.length;i++){
            // creates a random index to swap the characters
            int randomIndex=random.nextInt(chars.length);
            // swaps the characters
            char temp=chars[i];
            chars[i]=chars[randomIndex];
            chars[randomIndex]=temp;
        }
        return new String(chars);
    }
}