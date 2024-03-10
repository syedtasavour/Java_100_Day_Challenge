import java.util.*;

public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking for total marks input
        System.out.println("Enter Total Marks");
        int number = sc.nextInt();

        // Determining if the number is even or odd
        String type = ((number % 2) == 0) ? "Even" : "Odd";
        // Determining if the student passed or failed based on total marks
        String result = ((number >= 33 && number <= 100)) ? "Pass" : "Fail";

        // Printing whether the number is even or odd
        System.out.println("Number Type: " + type);
        // Printing if the student passed or failed
        System.out.println("Result: " + result);

        // Asking for case number input
        System.out.println("Enter case num");
        int cse = sc.nextInt();

        // Switch case based on the input case number
        switch (cse) {
            case 1:
                System.out.println("Selected case: 1 - Input Value: " + cse);
                break;
            case 2:
                System.out.println("Selected case: 2 - Input Value: " + cse);
                break;
            case 3:
                System.out.println("Selected case: 3 - Input Value: " + cse);
                break;
            case 4:
                System.out.println("Selected case: 4 - Input Value: " + cse);
                break;
            case 5:
                System.out.println("Selected case: 5 - Input Value: " + cse);
                break;
            default:
                System.out.println("Enter a valid number");
        }

        // Prompting user to choose an arithmetic operation
        System.out.println("Enter\n1 For '+'\n2 For '-'\n3 For '*'\n4 For '/'\n5 For '%'");
        int exp = sc.nextInt();

        // Getting two numbers for arithmetic operation
        System.out.print("Enter Number One: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number Two: ");
        int num2 = sc.nextInt();

        // Performing arithmetic operation based on user input
        switch (exp) {
            case 1:
                System.out.println("Addition Result: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtraction Result: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplication Result: " + (num1 * num2));
                break;
            case 4:
                // Checking for division by zero
                if (num2 != 0) {
                    System.out.println("Division Result: " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            case 5:
                System.out.println("Modulus Result: " + (num1 % num2));
                break;
            default:
                System.out.println("Enter a valid input");
        }

        // Checking if a number is positive or negative
        System.out.print("Enter a number to check if it's Positive or Negative: ");
        int num11 = sc.nextInt();
        String positivity = (num11 < 0) ? "Negative" : "Positive";
        System.out.println("Number is: " + positivity);

        // Checking if a temperature indicates fever or not
        System.out.println("Enter Temperature");
        double fever = sc.nextDouble();
        String feverStatus = (fever > 100) ? "Fever" : "Normal";
        System.out.println("Fever Status: " + feverStatus);

        // Checking if a year is a leap year or not
        System.out.println("Enter Year");
        int year = sc.nextInt();
        String leap = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? "Leap Year" : "Not Leap Year";
        System.out.println("Leap Year Status: " + leap);
    }
}
```