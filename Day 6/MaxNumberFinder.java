import java.util.Scanner;

public class MaxNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the array
        int[] numbers = {1, 7, 8, 77, 5, 76};
        int maxNumber = Integer.MIN_VALUE;  // Initialize maxNumber to the lowest possible value

        // Iterate through the array to find the maximum number
        for (int num : numbers) {
            if (num > maxNumber) {
                maxNumber = num;  // Update maxNumber if a larger element is found
            }
        }

        // Print the maximum number
        System.out.println("Maximum number: " + maxNumber);
    }
}
