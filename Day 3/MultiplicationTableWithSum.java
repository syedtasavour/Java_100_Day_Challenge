import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Initialize a scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the table number
        System.out.print("Enter the table number: ");
        int tableNumber = scanner.nextInt();
        int sumOfProducts = 0; // Initialize the sum of products to 0

        // Generate and display the multiplication table for the given number
        for (int i = 0; i <= 10; i++) {
            int product = tableNumber * i; // Calculate the product
            sumOfProducts = sumOfProducts + product; // Add the product to the sum of products
            System.out.println(tableNumber + " * " + i + " = " + product + " Sum so far: " + sumOfProducts);
        }
    }
}
