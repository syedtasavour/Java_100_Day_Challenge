import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Initialize a scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number for which factorial is to be calculated
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        int factorial = 1;
        int temp = number - 1;

        // Calculate factorial of the input number
        for (int i = number; i > 1; i--) {
            factorial *= i;
            temp--;
        }

        // Display the factorial of the input number
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
