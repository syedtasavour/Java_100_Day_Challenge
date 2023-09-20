import java.util.Scanner;

public class ExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get marks for each subject
        System.out.print("Enter marks for Subject One out of 100: ");
        float subject1Marks = scanner.nextFloat();

        System.out.print("Enter marks for Subject Two out of 100: ");
        float subject2Marks = scanner.nextFloat();

        System.out.print("Enter marks for Subject Three out of 100: ");
        float subject3Marks = scanner.nextFloat();

        // Calculate the total percentage
        double totalPercentage = (subject1Marks + subject2Marks + subject3Marks) * 100 / (100 * 3);

        // Check if the student passed all subjects
        if (subject1Marks >= 33 && subject2Marks >= 33 && subject3Marks >= 33) {
            System.out.println("Congratulations! You have passed all subjects with the following percentages:\n" +
                    "Subject 1: " + subject1Marks +"%" + "\nSubject 2: " + subject2Marks + "%"+"\nSubject 3: " + subject3Marks +"%"+
                    "\nTotal Percentage: " + totalPercentage+"%");
        } else {
            System.out.println("You have not passed all the subjects. Here are the percentages:\n" +
                    "Subject 1: " + subject1Marks +"%"+ "\nSubject 2: " + subject2Marks +"%"+ "\nSubject 3: " + subject3Marks +"%"+
                    "\nTotal Percentage: " + totalPercentage+"%");
        }
    }
}
