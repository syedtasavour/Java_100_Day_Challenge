import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        // Initialize a scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the count of even numbers
        System.out.print("Enter the count of even numbers you need: ");
        int count = scanner.nextInt();

        int number = 0;  // Initialize a variable to keep track of the current even number
        int sum = 0;     // Initialize a variable to store the sum of even numbers

        // Iterate through even numbers and calculate the sum
        while (count > 0) {
            sum += number;  // Add the current even number to the sum
            number += 2;    // Move to the next even number
            count--;        // Decrement the count of even numbers
        }

        // Display the sum of the specified count of even numbers
        System.out.println("Sum of " + count + " even numbers: " + sum);
    }
}
