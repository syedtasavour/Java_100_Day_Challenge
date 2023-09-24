import java.util.Scanner;

public class ArrayReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the array to be reversed
        int[] originalArray = {1, 2, 3, 4, 5, 6};
        int temp = 0;

        // Reverse the array in-place
        for (int i = 0; i < originalArray.length / 2; i++) {
            int j = originalArray.length - 1 - i;
            temp = originalArray[i];
            originalArray[i] = originalArray[j];
            originalArray[j] = temp;
        }

        // Print the reversed array
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i] + " ");
        }
    }
}
