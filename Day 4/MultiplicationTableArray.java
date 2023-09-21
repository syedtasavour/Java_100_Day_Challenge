import java.util.Scanner;

public class MultiplicationTableArray {
    public static void main(String[] args) {
        // Initialize a scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Create an array to store multiplication results
        int[] multiplicationResults = new int[100];

        // Calculate the multiplication results and store them in the array
        for (int i = multiplicationResults.length - 1; i >= 0; i--) {
            multiplicationResults[i] = i * number;
        }

        // Display the multiplication results stored in the array
        for (int i = multiplicationResults.length - 1; i >= 0; i--) {
            System.out.println("At Index: " + i + " Multiplication Result: " + multiplicationResults[i]);
        }
    }
}
