import java.util.Scanner;

public class ArraySortChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the length of the array from the user
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] arr = new int[length];

        // Get array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        // Check if the array is sorted in ascending order
        boolean isSorted = isSorted(arr);

        // Display the result
        if (isSorted) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted in ascending order.");
        }
    }

    // Function to check if the array is sorted in ascending order
    public static boolean isSorted(int[] arr) {
        int n = arr.length;

        // Traverse the array and check if each element is less than or equal to the next element
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // Array is not sorted
            }
        }

        return true; // Array is sorted
    }
}
