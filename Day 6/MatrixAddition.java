import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define two 2D arrays
        int[][] matrixA = {{1, 2, 3}, {1, 2, 3}};
        int[][] matrixB = {{1, 2, 3}, {1, 2, 3}};
        
        // Create a 2D array to store the sum of matrixA and matrixB
        int[][] sumMatrix = new int[2][3];

        // Perform matrix addition
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        // Print the sum matrix
        for (int i = 0; i < sumMatrix.length; i++) {
            for (int j = 0; j < sumMatrix[i].length; j++) {
                System.out.print(sumMatrix[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
