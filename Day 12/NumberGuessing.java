
import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame {
    private int targetNumber;  // The number to be guessed
    private int remainingGuesses;  // Number of remaining attempts
    private int userGuess;  // User's input

    // Constructor to initialize the game with a random target number
    public NumberGuessingGame(int range) {
        Random rand = new Random();
        this.targetNumber = rand.nextInt(range);  // Generate a random number within the specified range
    }

    // Setter for the number of remaining guesses
    public void setRemainingGuesses(int remainingGuesses) {
        this.remainingGuesses = remainingGuesses;
    }

    // Getter for the number of remaining guesses
    public int getRemainingGuesses() {
        return remainingGuesses;
    }

    // Method to take user input
    public void takeUserInput() {
        System.out.println("Welcome to the Number Guessing Game! Guess the number between 0 and 100.");
        Scanner scanner = new Scanner(System.in);
        userGuess = scanner.nextInt();
    }

    // Method to check if the user's guess is correct and provide feedback
    public void checkGuess() {
        if (userGuess == targetNumber) {
            System.out.format("Congratulations! You guessed correctly in %d attempt(s).\n", remainingGuesses);
        } else if (userGuess > targetNumber) {
            System.out.format("Guess a lower number. Attempts left: %d\n", remainingGuesses);
        } else {
            System.out.format("Guess a higher number. Attempts left: %d\n", remainingGuesses);
        }
    }
}

public class NumberGuessing {
    public static void main(String[] args) {
        int maxGuesses = 5;  // Maximum number of guesses
        NumberGuessingGame game = new NumberGuessingGame(100);

        for (int i = maxGuesses; i >= 0; i--) {
            game.setRemainingGuesses(i);
            game.takeUserInput();
            game.checkGuess();
        }
    }
}
