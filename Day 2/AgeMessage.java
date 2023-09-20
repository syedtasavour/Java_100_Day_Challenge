import java.util.*;

public class AgeMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter Your Age In Years: ");
        int age = scanner.nextInt();

        // Switch statement to provide messages based on age
        switch (age) {
            case 18:
                // If age is 18
                System.out.println("You are 18. You are a student. You should complete your college now.");
                break;
            case 24:
                // If age is 24
                System.out.println("You are 24. You are an adult. You should find a job now.");
                break;
            case 60:
                // If age is 60
                System.out.println("You are 60. You are an aged person. You should retire and take rest now.");
                break;
            default:
                // If age doesn't match any case
                System.out.println("Enter a valid age.");
                break;
        }
    }
}
