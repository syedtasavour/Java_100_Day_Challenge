import java.util.Scanner;

// Class representing a pattern with asterisks
class AsteriskPattern {
    public AsteriskPattern() {
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Class calculating the average of three numbers
class NumberAverage {
    public NumberAverage() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Num A: ");
        int a = scanner.nextInt();
        System.out.print("Enter Num B: ");
        int b = scanner.nextInt();
        System.out.print("Enter Num C: ");
        int c = scanner.nextInt();

        float average = (a + b + c) / 3f;
        System.out.println("Average: " + average);
    }
}

// Class calculating the area of a square
class SquareArea {
    public SquareArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Side Length of Square: ");
        int sideLength = scanner.nextInt();
        System.out.println("Area Of Square Is: " + sideLength * sideLength);
    }
}

// Class calculating the total cost of items including tax
class ItemCost {
    public ItemCost() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Product A Price: ");
        int productA = scanner.nextInt();
        System.out.print("Enter Product B Price: ");
        int productB = scanner.nextInt();
        System.out.print("Enter Product C Price: ");
        int productC = scanner.nextInt();

        float totalCost = productA + productB + productC;
        totalCost += totalCost * 0.18f; // Adding 18% tax
        System.out.println("Total Cost with Tax: " + totalCost);
    }
}

public class PrintPattern {
    public static void main(String[] args) {
        AsteriskPattern pattern = new AsteriskPattern();
        NumberAverage average = new NumberAverage();
        SquareArea square = new SquareArea();
        ItemCost itemCost = new ItemCost();
    }
}
