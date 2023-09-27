class Rectangle {
    // Length and width of the rectangle
    int length;
    int width;

    // Method to calculate the area of the rectangle
    public int calculateArea() {
        return length * width;
    }

    // Method to calculate the perimeter of the rectangle
    public int calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class RectangleCalculatorApp {
    public static void main(String[] args) {
        // Create an instance of the Rectangle class
        Rectangle rectangle = new Rectangle();

        // Set the dimensions of the rectangle
        rectangle.length = 5;
        rectangle.width = 5;

        // Calculate and print the area of the rectangle
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());

        // Calculate and print the perimeter of the rectangle
        System.out.println("Perimeter of the rectangle: " + rectangle.calculatePerimeter());
    }
}
