package courses;
import java.util.Scanner;

public class LuckyDiceCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char playAgain;
        do {
            System.out.println("Welcome to the lucky game");
            System.out.println("enter the target to win the game");
            int target = scanner.nextInt();
            Game game = new Game(target);

            boolean playing = true;
            while (playing) {
                System.out.println("press 'r' to roll or press 's' to stop the game");
                char choice = scanner.next().charAt(0);
                if (choice == 'r') {
                    game.rollDice();
                    game.showCurrentScore();
                    if (game.isTargetReached()) {
                        System.out.println("Congrats on your victory 🎉🎉🎉👏㊗️🎊,You win!");
                        playing = false;
                    }
                } else if (choice == 's') {
                    System.out.println("You choose to stop the game with final score ");
                    game.rollDice();
                    game.showCurrentScore();
                    playing = false;
                }
            }
            // ask the user if they want to play again
            System.out.println("Do you want to play again? (y/n)");
            playAgain = scanner.next().charAt(0);
        }while (playAgain == 'y' || playAgain == 'Y');
        System.out.println("Thank you for playing!");
        scanner.close();
    }
}
