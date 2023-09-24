public class TwoDimensionalArrayPrint {
    public static void main(String[] args) {
        int[][] array;  // Declare a 2D array
        array = new int[2][3];  // Initialize the 2D array with 2 rows and 3 columns

        // Assign values to the elements of the 2D array
        array[0][0] = 10;
        array[0][1] = 11;
        array[0][2] = 12;
        array[1][0] = 13;
        array[1][1] = 14;
        array[1][2] = 15;

        // Print the elements of the 2D array with proper formatting
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");  // Print each element with space
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
