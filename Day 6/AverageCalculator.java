import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Float[] values = new Float[10];  // Create a Float array with 10 elements
        Scanner scanner = new Scanner(System.in);

        // Assign values to specific indices in the array
        values[9] = 19F;
        values[8] = 18F;
        values[7] = 17F;
        values[6] = 16F;
        values[5] = 15F;
        values[4] = 14F;
        values[3] = 11F;
        values[2] = 12F;
        values[1] = 11F;
        values[0] = 10F;

        Float sum = 0F;  // Initialize the sum

        // Calculate the sum of elements in the array
        for (Float element : values) {
            sum += element;
        }

        // Calculate the average of the elements
        Float average = sum / values.length;

        // Print the average as a percentage
        System.out.println("The average is: " + average + "%");
    }
}
