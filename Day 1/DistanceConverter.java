import java.util.*;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt for the value in kilometers
        System.out.print("Enter value in kilometers: ");
        float kilometers = sc.nextFloat();

        // Convert kilometers to miles using the conversion factor
        double miles = kilometers * 0.621371;

        // Display the result in miles
        System.out.println("Equivalent miles: " + miles);
    }
}
