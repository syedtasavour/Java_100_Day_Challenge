import java.util.Scanner;

public class Main {
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

        // Prompt for total marks
        System.out.print("Enter total marks: ");
        float totalMarks = scanner.nextFloat();

        // Calculate the sum of subject marks
        float sumOfMarks = subject1Marks + subject2Marks + subject3Marks + subject4Marks + subject5Marks;

        // Calculate the percentage
        float percentage = (sumOfMarks / totalMarks) * 100;

        // Display the result
        System.out.println("You scored " + percentage + "%");
    }
}
