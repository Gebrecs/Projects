package courses;
import java.util.Scanner;

public class LuckyDiceCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char playAgain;
        do {
            System.out.println("🎲 Welcome to Lucky Dice Adventure!");
            int target;
            do {
                System.out.print("Enter the target score to win: ");
                target = scanner.nextInt();

                if (target <= 0) {
                    System.out.println("Please enter a number greater than 0.");
                }
            } while (target <= 0);
            Game game = new Game(target);

            while (true) {
                System.out.println("press 'r' to roll or press 's' to stop the game");
                char choice = scanner.next().charAt(0);
                if (choice == 'r'|| choice=='R') {
                    game.rollDice();
                    game.showCurrentScore();
                    if (game.isTargetReached()) {
                        System.out.println("🏆 You reached the target! You win!");
                        break;
                    }
                } else if (choice == 's'||choice=='S') {
                    System.out.println("You choose to stop the game with final score ");
                    game.showCurrentScore();
                    break;
                }else {
                    System.out.println("Invalid choice. Please enter 'r' or 's'.");
                }
            }
            // ask the user if they want to play again
            System.out.println("Do you want to play again? (y/n)");
            playAgain = Character.toLowerCase(scanner.next().charAt(0));
        }while (playAgain =='y');
        System.out.println("Thank you for playing!");
        scanner.close();
    }
}
