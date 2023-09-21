import java.util.Scanner;

public class ReverseMultiplicationTable {
    public static void main(String[] args) {
        // Initialize a scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the table number
        System.out.print("Enter the table number: ");
        int tableNumber = scanner.nextInt();

        // Generate and display the reverse multiplication table for the given number
        for (int i = 10; i > 0; i--) {
            int result = tableNumber * i;
            System.out.println(tableNumber + " * " + i + " = " + result);
        }
    }
}
