import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get yearly salary from the user
        System.out.print("Enter Yearly salary: ");
        double salary = scanner.nextDouble();

        // Calculate tax based on salary
        double tax;
        if (salary <= 500000) {
            tax = 0; // Nil tax for salary up to 500,000
            System.out.print("You do not need to pay any tax for the year 2023.");
        } else if (salary <= 1000000) {
            tax = salary * 0.05; // 5% tax for salary between 500,001 and 1,000,000
            System.out.print("You need to pay a tax of " + tax + " for the year 2023.");
        } else {
            tax = (salary * 0.10) + 12500; // 10% tax for salary over 1,000,000
            System.out.print("You need to pay a tax of " + tax + " for the year 2023.");
        }
    }
}
