import java.util.*;

public class DrivingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter Your Age In Years: ");
        int age = scanner.nextInt();

        if (age >= 18 && age <= 54) {
            // Age is between 18 and 54
            System.out.println("You are eligible to drive.");
        } else if (age > 54 && age <= 80) {
            // Age is between 55 and 80
            System.out.println("You can apply for a driving license by visiting the nearest RTO for a physical checkup.");
        } else {
            // Age is below 18 or above 80
            System.out.println("You are not eligible to drive.");
        }
    }
}
