public class IncrementDecrementExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        // Increment num1 by 1
        num1++;
        System.out.println("num1 after increment: " + num1);  // num1 is now 11

        // Decrement num2 by 1
        num2--;
        System.out.println("num2 after decrement: " + num2);  // num2 is now 19

        // Example of pre-increment (++num1)
        int result1 = ++num1;  // Increment num1 by 1 and assign the incremented value to result1
        System.out.println("result1: " + result1);  // result1 is now 12 (num1 was incremented before assigning)

        // Example of post-decrement (num2--)
        int result2 = num2--;  // Assign the current value of num2 to result2 and then decrement num2
        System.out.println("result2: " + result2);  // result2 is now 19 (num2 was decremented after assigning)

        // Display the final values of num1 and num2
        System.out.println("Final value of num1: " + num1);  // Final value of num1 is 11
        System.out.println("Final value of num2: " + num2);  // Final value of num2 is 18 (num2 was decremented)
    }
}
