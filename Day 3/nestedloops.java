import java.util.*;

public class nestedloops {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        // Getting user input
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();
        
        // Pattern 1: Increasing asterisks
        System.out.println("Pattern 1:");
        for (int i = 0; i < userInput; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println("________________________________");

        // Pattern 2: Decreasing asterisks
        System.out.println("Pattern 2:");
        for (int i = userInput; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println("________________________________");

        // Pattern 3: Increasing numbers
        System.out.println("Pattern 3:");
        for (int i = 1; i <= userInput; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("________________________________");

        // Pattern 4: Increasing characters
        System.out.println("Pattern 4:");
        char currentChar = 'A';
        for (int i = 0; i < userInput; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(currentChar++);
            }
            System.out.println();
        }
        System.out.println("________________________________");
    }
}
