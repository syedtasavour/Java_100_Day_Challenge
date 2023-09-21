public class StarPatternUsingWhileLoop {
    public static void main(String[] args) {
        int rows = 5;  // Number of rows for the pattern

        // Print a pattern of stars
        int i = rows - 1;  // Initialize i to one less than the number of rows
        while (i >= 0) {
            int j = 0;  // Initialize j for each row
            while (j <= i) {
                System.out.print("*");  // Print a star
                j++;  // Move to the next column
            }
            i--;  // Move to the next row (decrement i for the next iteration)
            System.out.println();  // Move to the next line after each row
        }
    }
}
