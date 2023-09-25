import java.util.Scanner;

public class FibonacciSequence {
    // Method to print the Fibonacci sequence up to n terms
    public static void printFibonacci(int numTerms) {
        int prev = 0;
        int current = 1;
        for (int i = numTerms; i > 0; i--) {
            System.out.print(prev + "  ");
            int sum = prev + current;
            prev = current;
            current = sum;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int numTerms = scanner.nextInt();
        printFibonacci(numTerms);
    }
}
