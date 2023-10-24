public class FinallyBlock {

    // This method demonstrates the use of try, catch, and finally blocks
    public static int greet() {
        try {
            int a = 50;
            int b = 10;
            int c = a / b; // Divide a by b and store the result in c
            return c;      // Return the result if no exception occurs
        } catch (Exception e) {
            System.out.println(e); // Print any exception that occurs
        } finally {
            System.out.println("Cleaning up resources... This is the end of this function");
        }
        return -1; // Return -1 if an exception occurs
    }

    public static void main(String[] args) {
        int k = greet(); // Call the greet() method and store the result in k
        System.out.println(k); // Print the result

        int a = 7;
        int b = 9;

        // Use a while loop to demonstrate try, catch, and finally within a loop
        while (true) {
            try {
                System.out.println(a / b); // Attempt to divide a by b and print the result
            } catch (Exception e) {
                System.out.println(e); // Print any exception that occurs
                break; // Exit the loop if an exception occurs
            } finally {
                System.out.println("I am finally for value of b = " + b);
            }
            b--;
        }

        try {
            System.out.println(50 / 3); // Attempt to divide 50 by 3 and print the result
        } finally {
            System.out.println("Yes, this is finally");
        }
    }
}
