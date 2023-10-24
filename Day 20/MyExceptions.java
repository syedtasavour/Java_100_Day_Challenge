import java.util.Scanner;

// Custom exception class extending the Exception class
class MyException extends Exception {
    // Override toString method to provide a custom message
    public String toString() {
        return "I am toString";
    }

    // Override getMessage method to provide a custom message
    public String getMessage() {
        return "I am getMessage";
    }
}

public class MyExceptions {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter a value and storing it in 'a'
        System.out.print("Enter an integer: ");
        a = sc.nextInt();

        // Check if 'a' is less than 99
        if (a < 99) {
            try {
                // Throw a custom exception of type MyException
                throw new MyException();

                // The following line is commented out, as it's not executed due to the previous throw statement.
                // throw new ArithmeticException("This is An Exception");
            } catch (Exception e) {
                // Catch the exception and print it
                System.out.println(e);
                e.printStackTrace();

                // Print "Done" after handling the exception
                System.out.println("Done");
            }
        }
    }
}
