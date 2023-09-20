import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the year from the user
        System.out.print("Enter Year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
            System.out.println("In a leap year, February has 29 days which helps to keep the calendar year synchronized with the astronomical or seasonal year.");
        } else {
            System.out.println(year + " is not a leap year.");
            System.out.println("In a non-leap year, February has 28 days.");
        }
    }
}
