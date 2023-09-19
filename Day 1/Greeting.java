import java.util.*;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt for user's name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Greet the user with a personalized message
        System.out.println("Hi " + name + "!");
        System.out.println("Wishing you a fantastic day filled with joy, success, and meaningful moments.");
        System.out.println("Take care and make the most of today!");
    }
}
