import java.util.Scanner;

public class RecursiveSumCalculator {

    // Method to calculate the sum of numbers from 1 to n recursively
    int calculateSum(int n) {
        if (n > 0) {
            // Recursively calculate the sum
            return n + calculateSum(n - 1);
        } else {
            // Base case: Return 0 when n is not positive
            return 0;
        }
    }

    public static void main(String[] args) {
        RecursiveSumCalculator calculator = new RecursiveSumCalculator();
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the sum using the calculateSum method
        int sum = calculator.calculateSum(number);

        // Print the calculated sum
        System.out.println("Sum of numbers from 1 to " + number + " is: " + sum);
    }
}
