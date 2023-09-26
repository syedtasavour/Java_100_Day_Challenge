import java.util.*;

public class PatternPrinter {

    // Method to print a pattern of stars
    void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create an instance of the PatternPrinter class
        PatternPrinter obj = new PatternPrinter();

        // Create a Scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number for the pattern
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Call the printPattern method to print the pattern with the given number of rows
        obj.printPattern(num);
    }
}
