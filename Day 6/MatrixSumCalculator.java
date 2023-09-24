import java.util.Scanner;

public class MatrixSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define two 2D arrays
        int[][] matrixA = {{1, 2, 3}, {1, 2, 3}};
        int[][] matrixB = {{1, 2, 3}, {1, 2, 3}};
        
        int sum = 0;  // Initialize the sum to 0

        // Perform element-wise addition of the arrays
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                sum += matrixA[i][j] + matrixB[i][j];
            }
        }

        // Print the sum of the corresponding elements
        System.out.println("The sum of corresponding elements in the matrices is: " + sum);
    }
}
