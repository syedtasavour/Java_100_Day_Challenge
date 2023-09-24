import java.util.*;

public class ArraySumCalculatorUsingForEach {
    public static void main(String[] args) {
        float[] array = new float[10];  // Create a float array with 10 elements

        // Assign the value 10f to each element in the array
        for (int i = 0; i < array.length; i++) {
            array[i] = 10f;
        }

        float sum = 0;  // Initialize the sum

        // Calculate the sum of elements in the array
        for (float element : array) {
            sum += element;
        }

        // Print the sum of elements in the array
        System.out.println("Sum of elements in the array: " + sum);
    }
}
