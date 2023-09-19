import java.util.*;

public class ComparisonExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to compare: ");
        
        // Get the number from the user
        double userNumber = sc.nextDouble();

        // Predefined number for comparison
        int predefinedNumber = 128;

        // Compare the user's number with the predefined number
        if (userNumber > predefinedNumber) {
            System.out.println("Yes, the entered number is greater than " + predefinedNumber);
        } else {
            System.out.println("No, the predefined number " + predefinedNumber + " is greater");
        }
    }
}
