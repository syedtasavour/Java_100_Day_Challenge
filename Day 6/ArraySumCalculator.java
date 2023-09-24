public class ArraySumCalculator {
    public static void main(String[] args) {
        float[][] array = new float[2][4]; // Create a 2D array with 2 rows and 4 columns

        // Assign values to array elements
        array[0][0] = 10.3f;
        array[0][2] = 90.1f;
        array[0][3] = 50.55f;
        array[1][0] = 550.45f;
        array[1][2] = 14.950f;
        array[1][3] = 1.670f;

        // Calculate and print the sum of elements in each row
        for (int i = 0; i < array.length; i++) {
            float rowSum = 0; // Initialize sum for each row

            // Calculate sum of elements in the current row
            for (int j = 0; j < array[i].length; j++) {
                rowSum += array[i][j];
            }

            // Print the sum for the current row
            System.out.println("Sum of elements in row " + i + ": " + rowSum);
        }
    }
}
