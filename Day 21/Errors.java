// Class to represent syntax-related errors
class SyntaxError {
    // Method to demonstrate syntax errors
    void Syntax() {
        int a = 10 // Initialize variable 'a' with value 10
        int b = 100; // Initialize variable 'b' with value 100
    }
}

// Class to demonstrate logical errors
class Logical {
    // Constructor
    Logical() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i); // Print even numbers in the range 0-99
            }
        }
    }
}

// Class to demonstrate runtime errors
class RunTime {
    // Constructor
    RunTime() {
        int a = 10;
        int b = 100;
        while (true) {
            a = a - 1;
            int c = b / a; // Potential division by zero if 'a' reaches 0
            System.out.println(a); // Print the current value of 'a'
        }
    }
}

public class Errors {
    public static void main(String[] args) {
        RunTime rt = new RunTime(); // Create a RunTime object
        rt.RunTime(); // Invoke the RunTime method to demonstrate runtime errors
    }
}
