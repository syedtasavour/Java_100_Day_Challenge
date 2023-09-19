import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.println("Enter Num 1");
        int a = sc.nextInt();

        // Prompt the user to enter the second number
        System.out.println("Enter Num 2");
        int b = sc.nextInt();

        // Prompt the user to enter the third number
        System.out.println("Enter Num 3");
        int c = sc.nextInt();

        // Calculate the sum of the three numbers
        int sum = a + b + c;

        // Display the sum of the three numbers
        System.out.print("Sum of three numbers is: " + sum);
    }
}
