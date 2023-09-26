import java.util.*;

public class factorialMethods {

    // Method to calculate factorial without recursion
    static int factorialWithoutRecursion(int n) {
        for (int i = n - 1; i > 0; i--) {
            n = n * i; // Calculate the factorial
        }
        return n;
    }

    // Method to calculate factorial with recursion
    static int factorialWithRecursion(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Recursive case: n! = n * (n-1)!
            return n * factorialWithRecursion(n - 1);
        }
    }

    public static void main(String[] args) {
        // Calculate factorial without recursion for a given number (here, 5)
        int factorialWithoutRecursionResult = factorialWithoutRecursion(5);
        System.out.println("Factorial without recursion: " + factorialWithoutRecursionResult);

        // Calculate factorial with recursion for a given number (here, 5)
        int factorialWithRecursionResult = factorialWithRecursion(5);
        System.out.println("Factorial with recursion: " + factorialWithRecursionResult);
    }
}
