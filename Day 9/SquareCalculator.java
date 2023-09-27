class Square {
    // Side length of the square
    int sideLength;

    // Method to calculate the area of the square
    public int calculateArea() {
        return sideLength * sideLength;
    }

    // Method to calculate the perimeter of the square
    public int SquareCalculatorlculatePerimeter() {
        return 4 * sideLength;
    }
}

public class SquareCalculator {
    public static void main(String[] args) {
        // Create an instance of the Square class
        Square square = new Square();

        // Set the side length of the square
        square.sideLength = 4;

        // Calculate and print the area of the square
        System.out.println("Area of the square: " + square.calculateArea());

        // Calculate and print the perimeter of the square
        System.out.println("Perimeter of the square: " + square.SquareCalculatorlculatePerimeter());
    }
}
