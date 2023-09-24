import java.util.Scanner;

public class MinNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the array
        int[] numbers = {1, 7, 8, 77, 5, 76};
        int minNumber = Integer.MAX_VALUE;  // Initialize minNumber to the highest possible value

        // Iterate through the array to find the minimum number
        for (int num : numbers) {
            if (num < minNumber) {
                minNumber = num;  // Update minNumber if a smaller element is found
            }
        }

        // Print the minimum number
        System.out.println("Minimum number: " + minNumber);
    }
}
