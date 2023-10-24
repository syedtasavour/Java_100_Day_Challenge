// Custom exception class for negative radius values
class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}

public class throwvsthrowss {

    // Calculate the area of a circle
    public static double calculateArea(int radius) throws NegativeRadiusException {
        if (radius < 0) {
            throw new NegativeRadiusException();
        }
        double area = Math.PI * radius * radius;
        return area;
    }

    // Divide two integers and handle division by zero
    public static int divide(int dividend, int divisor) throws ArithmeticException {
        // Made By Harry
        int result = dividend / divisor;
        return result;
    }

    public static void main(String[] args) {
        // Shivam - uses divide function created by Harry
        try {
            // Example of dividing two integers
            // int result = divide(6, 0);
            // System.out.println(result);

            // Example of calculating the area of a circle
            double area = calculateArea(6);
            System.out.println("Area of the circle: " + area);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
