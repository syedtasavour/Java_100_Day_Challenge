import java.util.Scanner;

public class SumCalculator {
    // Method to calculate the sum of two integers
    public static int calculateSum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the first number from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Get the second number from the user
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate and print the sum of the two numbers
        int sum = calculateSum(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
