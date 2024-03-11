import java.util.*;

public class loops {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        // Sum of numbers up to a given number
        System.out.print("Enter a number: ");
        int limit = scanner.nextInt();
        int sum = 0;
        int currentNumber = 1;
        while (currentNumber <= limit) {
            sum += currentNumber;
            System.out.println("Number: " + currentNumber + ", Sum: " + sum);
            currentNumber++;
        }
        
        // Printing a square pattern
        for (int i = 0; i < 4; i++) {
            System.out.println("****");
        }
        
        // Reversing a number
        int numberToReverse = 6458;
        int reversedNumber = 0;
        while (numberToReverse > 0) {
            reversedNumber = (reversedNumber * 10) + numberToReverse % 10;
            numberToReverse /= 10;
        }
        System.out.println("Reversed number: " + reversedNumber);
        
        // Sum of even and odd numbers
        int enteredNumber, evenSum = 0, oddSum = 0;
        int userChoice = 1;
        do {
            System.out.print("Enter a number: ");
            enteredNumber = scanner.nextInt();

            if (enteredNumber % 2 == 0) {
                evenSum += enteredNumber;
            } else {
                oddSum += enteredNumber;
            }

            System.out.print("Do you want to continue? Press 1 for yes or 0 for no: ");
            userChoice = scanner.nextInt();
        } while (userChoice == 1);
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        
        // Factorial of a number
        int numberForFactorial = 5; 
        int factorial = 1;
        for (int i = 1; i <= numberForFactorial; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + numberForFactorial + ": " + factorial);
        
        // Multiplication table
        System.out.print("Enter a number: ");
        int tableNumber = scanner.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.println(tableNumber + " X " + i + " = " + (tableNumber * i));
        }
        
        scanner.close();
    }
}
