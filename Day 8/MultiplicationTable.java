import java.util.*;

public class MultiplicationTable {

    // Method to print the multiplication table for a given number
    void printMultiplicationTable(int n) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        // Create an instance of the MultiplicationTable class
        MultiplicationTable obj = new MultiplicationTable();

        // Create a Scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number for the multiplication table
        System.out.print("Enter a number: ");
        int tableNumber = scanner.nextInt();

        // Call the printMultiplicationTable method to print the table for the given number
        obj.printMultiplicationTable(tableNumber);
    }
}
