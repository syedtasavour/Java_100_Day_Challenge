import java.util.Scanner;

public class FibonacciCalculator {

    // Method to calculate Fibonacci numbers recursively
    int calculateFibonacci(int n) {
        // Base case: return n-1 for 1 and 2
        if (n == 1 || n == 2) {
            return n - 1;
        }
        
        // Recursive calculation of Fibonacci
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }

    public static void main(String[] args) {
        FibonacciCalculator calculator = new FibonacciCalculator();
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the Fibonacci number using recursion
        int fibonacciNumber = calculator.calculateFibonacci(number);

        // Print the Fibonacci number
        System.out.println("The Fibonacci number at position " + number + " is: " + fibonacciNumber);
    }
}
