import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Initialize a scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number for which factorial is to be calculated
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        int factorial = 1; // Initialize the factorial variable to 1
        int i = number;    // Initialize a counter 'i' to the input number

        // Calculate factorial of the input number
        while (i > 1) {
            factorial *= i; // Multiply factorial by the current 'i' value
            i--;             // Decrement 'i' for the next iteration
        }

        // Display the factorial of the input number
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
