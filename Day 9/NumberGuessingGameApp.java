import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame {
    private int remainingAttempts = 5;  // Number of attempts allowed

    // Method to play the number guessing game
    void guessNumber(int userGuess) {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(100);

        if (userGuess == randomNumber) {
            System.out.format("Congratulations! You guessed correctly in %d attempt(s).\n", 5 - remainingAttempts + 1);
        } else if (remainingAttempts == 1) {
            System.out.println("You Lose. The correct number was: " + randomNumber);
        } else if (userGuess > randomNumber) {
            System.out.format("Guess a lower number. Attempts left: %d\n", remainingAttempts - 1);
        } else if (userGuess < randomNumber) {
            System.out.format("Guess a higher number. Attempts left: %d\n", remainingAttempts - 1);
        }

        remainingAttempts--;
    }

    // Method to get the remaining attempts
    int getRemainingAttempts() {
        return remainingAttempts;
    }
}

public class NumberGuessingGameApp {
    public static void main(String[] args) {
        NumberGuessingGame game = new NumberGuessingGame();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game! Guess the number between 0 and 100.");

        while (game.getRemainingAttempts() > 0) {
            System.out.printf("Attempts left: %d. Enter your guess: ", game.getRemainingAttempts());
            int userGuess = scanner.nextInt();
            game.guessNumber(userGuess);
        }

        scanner.close();
    }
}
