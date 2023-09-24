import java.util.Scanner;

public class NameSearch {
    public static void main(String[] args) {
        String[] names = new String[10];  // Create a String array with 10 elements
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a name
        System.out.print("Enter a name: ");
        String enteredName = scanner.nextLine();

        // Assign names to specific indices in the array
        names[0] = "NameZero";
        names[1] = "NameOne";
        names[2] = "NameTwo";
        names[3] = "NameThree";
        names[4] = "NameFour";
        names[5] = "NameFive";
        names[6] = "NameSix";
        names[7] = "NameSeven";
        names[8] = "NameEight";
        names[9] = "NameNine";

        boolean found = false;  // Variable to track if the name is found

        // Search for the entered name in the array
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(enteredName)) {
                System.out.println("The string '" + enteredName + "' was found at index " + i);
                found = true;
                break;
            }
        }

        // Print a message if the name was not found
        if (!found) {
            System.out.println("The string '" + enteredName + "' was not found.");
        }
    }
}
