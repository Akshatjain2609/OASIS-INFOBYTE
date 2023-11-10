import java.util.Scanner;

public class NumberGuess{
    public static void main(String[] args) {
        playNumberGuessingGame();
    }

    public static void playNumberGuessingGame() {
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = 1 + (int) (100 * Math.random());
        int maxAttempts = 6;

        System.out.println("Guess the number between 1 and 100 within " + maxAttempts + " trials.");

        for (int attempt = 0; attempt < maxAttempts; attempt++) {
            System.out.print("Attempt " + (attempt + 1) + ": Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number.");
                return;
            } else if (userGuess < numberToGuess) {
                System.out.println("The number is greater than " + userGuess);
            } else {
                System.out.println("The number is less than " + userGuess);
            }
        }

        System.out.println("You have exhausted all " + maxAttempts + " trials.");
        System.out.println("The correct number was " + numberToGuess);
    }
}
