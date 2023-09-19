import java.util.*;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter their name
        System.out.println("Enter Your Name");
        String name = sc.nextLine();

        // Print the entered name
        System.out.println("Entered Name: " + name);

        // Calculate the length of the name
        int length = name.length();
        System.out.println("Length of the Name: " + length);

        // Convert the name to lowercase
        String lowerCaseName = name.toLowerCase();
        System.out.println("Name in Lowercase: " + lowerCaseName);

        // Convert the name to uppercase
        String upperCaseName = name.toUpperCase();
        System.out.println("Name in Uppercase: " + upperCaseName);

        // Trim the whitespace from the name
        String trimmedName = name.trim();
        System.out.println("Trimmed Name: " + trimmedName);

        // Get a substring starting from index 3
        String substringFrom3 = name.substring(3);
        System.out.println("Substring from index 3: " + substringFrom3);

        // Get a substring from index 1 to 3 (exclusive)
        String substring1to3 = name.substring(1, 3);
        System.out.println("Substring from index 1 to 3: " + substring1to3);

        // Replace 'a' with 'e' in the name
        String replacedChar = name.replace("a", "e");
        System.out.println("Name with 'a' replaced by 'e': " + replacedChar);

        // Replace 'ur' with 'yew ' in the name
        String replacedUr = name.replace("ur", "yew ");
        System.out.println("Name with 'ur' replaced by 'yew ': " + replacedUr);

        // Check if the name starts with "Sye"
        boolean startsWithSye = name.startsWith("Sye");
        System.out.println("Does the name start with 'Sye'? " + startsWithSye);

        // Check if the name ends with "erv"
        boolean endsWithErv = name.endsWith("erv");
        System.out.println("Does the name end with 'erv'? " + endsWithErv);

        // Get the character at index 1 in the name
        char charAtIndex1 = name.charAt(1);
        System.out.println("Character at index 1: " + charAtIndex1);

        // Get the index of the first occurrence of 'a' in the name
        int indexOfA = name.indexOf("a");
        System.out.println("Index of 'a': " + indexOfA);

        // Get the index of the first occurrence of 'a' starting from index 7
        int indexOfAFrom7 = name.indexOf("a", 7);
        System.out.println("Index of 'a' starting from index 7: " + indexOfAFrom7);

        // Get the last index of 'd' in the name
        int lastIndexOfD = name.lastIndexOf("d");
        System.out.println("Last index of 'd': " + lastIndexOfD);

        // Get the last index of 'd' before index 3
        int lastIndexOfDBefore3 = name.lastIndexOf("d", 3);
        System.out.println("Last index of 'd' before index 3: " + lastIndexOfDBefore3);

        // Check if the name equals the lowercase version of the name
        boolean equalsLowerCase = name.equals(lowerCaseName);
        System.out.println("Does the name equal its lowercase version? " + equalsLowerCase);
    }
}
