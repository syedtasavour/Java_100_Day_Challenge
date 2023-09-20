public class ContinueBreakExample {
    public static void main(String[] args) {
        // Example of 'continue'
        System.out.println("Example of 'continue':");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println("Odd number: " + i);
        }

        // Example of 'break'
        System.out.println("\nExample of 'break':");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break; // Exit the loop when i equals 6
            }
            System.out.println("Number: " + i);
        }
    }
}
