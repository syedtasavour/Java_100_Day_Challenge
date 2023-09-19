import java.util.Scanner;

public class CheckIntegerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for user input
        System.out.print("Enter a number: ");

        // Check if the input is an integer
        boolean isInteger = scanner.hasNextInt();

        // Display whether the input is an integer or not
        System.out.println("Is the input an integer? " + isInteger);
    }
}
