import java.util.*;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        byte matchesLeft = 5;  // Number of matches to play

        while (true) {
            System.out.println("Enter:\n0 For Rock\n1 For Paper\n2 For Scissors");
            byte userChoice = scanner.nextByte();  // User's choice
            int systemChoice = random.nextInt(3);  // System's choice (0: Rock, 1: Paper, 2: Scissors)

            if (userChoice == systemChoice) {
                System.out.println("It's a draw!");
            } else if (userChoice == 0 && systemChoice == 2) {
                System.out.println("You win! System chose Scissors.");
            } else if (userChoice == 1 && systemChoice == 0) {
                System.out.println("You win! System chose Rock.");
            } else if (userChoice == 2 && systemChoice == 1) {
                System.out.println("You win! System chose Paper.");
            } else if (userChoice >= 3) {
                System.out.println("Invalid choice. Please choose between 0, 1, or 2.");
                matchesLeft++;  // Increment matchesLeft since this round didn't count due to invalid input
            } else {
                System.out.println("System wins. System chose: " + systemChoice + ", You chose: " + userChoice);
            }
            
            System.out.println("Matches Left: " + --matchesLeft);  // Decrement matchesLeft and display remaining matches

            if (matchesLeft <= 0) {
                break;  // Exit the loop when matchesLeft is zero or less
            }
        }
    }
}
