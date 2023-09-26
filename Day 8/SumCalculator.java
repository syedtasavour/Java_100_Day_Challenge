import java.util.*;

public class SumCalculator {

    // Method to calculate the sum of a variable number of arguments
    // The "..." syntax allows the method to accept a variable number of arguments of the same type.
    // For example, calculateSum(4, 6, 4, 1) will pass 4, 6, 4, and 1 as arguments.
    // Inside the method, these arguments are treated as an array of integers.
    // The method iterates through the array and calculates the sum of all elements.
    // Finally, it returns the sum.
    static int calculateSum(int ...numbers) {
        int sum = 0;

        // Iterate through the variable number of arguments (treated as an array)
        for (int number : numbers) {
            sum += number; // Accumulate the sum
        }

        return sum; // Return the calculated sum
    }

    public static void main(String[] args) {
        // Calculate and print the sum of specific numbers
        int sumOfNumbers = calculateSum(4, 6, 4, 1);
        System.out.println("Sum of the given numbers: " + sumOfNumbers);
    }
}
