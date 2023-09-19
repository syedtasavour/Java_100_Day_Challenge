import java.util.*;

public class StringManipulation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter Your Name: ");
        String enteredName = scanner.nextLine();

        // Print the entered name
        System.out.println("Entered Name: " + enteredName);

        // Calculate the length of the name
        int nameLength = enteredName.length();
        System.out.println("Length of the Name: " + nameLength);

        // Convert the name to lowercase
        String nameInLowerCase = enteredName.toLowerCase();
        System.out.println("Name in Lowercase: " + nameInLowerCase);

        // Convert the name to uppercase
        String nameInUpperCase = enteredName.toUpperCase();
        System.out.println("Name in Uppercase: " + nameInUpperCase);

        // Trim the whitespace from the name
        String trimmedName = enteredName.trim();
        System.out.println("Trimmed Name: " + trimmedName);

        // Get a substring starting from index 3
        String substringFromIndex3 = enteredName.substring(3);
        System.out.println("Substring from index 3: " + substringFromIndex3);

        // Get a substring from index 1 to 3 (exclusive)
        String substringFrom1to3 = enteredName.substring(1, 3);
        System.out.println("Substring from index 1 to 3: " + substringFrom1to3);

        // Replace 'a' with 'e' in the name
        String replacedChar = enteredName.replace("a", "e");
        System.out.println("Name with 'a' replaced by 'e': " + replacedChar);

        // Replace 'ur' with 'yew ' in the name
        String replacedUr = enteredName.replace("ur", "yew ");
        System.out.println("Name with 'ur' replaced by 'yew ': " + replacedUr);

        // Check if the name starts with "Sye"
        boolean startsWithSye = enteredName.startsWith("Sye");
        System.out.println("Does the name start with 'Sye'? " + startsWithSye);

        // Check if the name ends with "erv"
        boolean endsWithErv = enteredName.endsWith("erv");
        System.out.println("Does the name end with 'erv'? " + endsWithErv);

        // Get the character at index 1 in the name
        char charAtIndex1 = enteredName.charAt(1);
        System.out.println("Character at index 1: " + charAtIndex1);

        // Get the index of the first occurrence of 'a' in the name
        int indexOfA = enteredName.indexOf("a");
        System.out.println("Index of 'a': " + indexOfA);

        // Get the index of the first occurrence of 'a' starting from index 7
        int indexOfAFrom7 = enteredName.indexOf("a", 7);
        System.out.println("Index of 'a' starting from index 7: " + indexOfAFrom7);

        // Get the last index of 'd' in the name
        int lastIndexOfD = enteredName.lastIndexOf("d");
        System.out.println("Last index of 'd': " + lastIndexOfD);

        // Get the last index of 'd' before index 3
        int lastIndexOfDBefore3 = enteredName.lastIndexOf("d", 3);
        System.out.println("Last index of 'd' before index 3: " + lastIndexOfDBefore3);

        // Check if the name equals a specific string
        boolean equals = enteredName.equals("name");
        System.out.println("Does the name equal 'name'? " + equals);

        // Check if the name equals its uppercase version
        boolean equalsIgnoreCase = enteredName.equalsIgnoreCase(nameInUpperCase);
        System.out.println("Does the name equal its uppercase version? " + equalsIgnoreCase);
    }
}
