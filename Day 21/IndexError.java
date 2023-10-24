import java.util.Scanner;

// Create a class named 'ArrayDemo' to encapsulate the functionality related to arrays.
class ArrayDemo {
    // Constructor for the ArrayDemo class.
    ArrayDemo() {
        // Define an integer array 'a' with some initial values.
        int[] a = {1, 45, 53, 45, 6};
        
        // Create a Scanner object to read user input.
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter an index number.
        System.out.print("Enter Index Num: ");
        
        // Read the user's input into the variable 'b'.
        int b = sc.nextInt();
        
        // Handle potential exceptions when accessing the array.
        try {
            // Print the value at the specified index 'b' in the array 'a'.
            System.out.println(a[b]);
        } catch (Exception e) {
            // Inform the user if the index is out of bounds.
            System.out.println("Index " + b + " is out of bounds for an array of length " + a.length);
        }
    }
}

public class IndexError {
    public static void main(String[] args) {
        // Create an instance of the 'ArrayDemo' class and call its constructor.
        ArrayDemo obj = new ArrayDemo();
    }
}
