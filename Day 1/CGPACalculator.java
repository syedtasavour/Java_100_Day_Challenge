import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for subject marks
        System.out.print("Enter marks for Subject 1: ");
        float subject1Marks = scanner.nextFloat();

        System.out.print("Enter marks for Subject 2: ");
        float subject2Marks = scanner.nextFloat();

        System.out.print("Enter marks for Subject 3: ");
        float subject3Marks = scanner.nextFloat();

        System.out.print("Enter marks for Subject 4: ");
        float subject4Marks = scanner.nextFloat();

        System.out.print("Enter marks for Subject 5: ");
        float subject5Marks = scanner.nextFloat();

        // Calculate the CGPA (assuming a maximum possible CGPA of 10)
        float cgpa = (subject1Marks + subject2Marks + subject3Marks + subject4Marks + subject5Marks) / 10;

        // Display the CGPA
        System.out.println("Your CGPA is: " + cgpa);
    }
}
