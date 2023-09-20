import java.util.Scanner;

public class DayOfWeekIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the day number from the user
        System.out.print("Enter Day Number: ");
        int dayNumber = scanner.nextInt();

        // Determine the day of the week based on the day number
        String dayOfWeek;
        switch (dayNumber) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                dayOfWeek = "Invalid day number. There are only seven days in a week on Earth.";
        }

        // Display the day of the week
        System.out.println("Day of the week for day number " + dayNumber + " is: " + dayOfWeek);
    }
}
