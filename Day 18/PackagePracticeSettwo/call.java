import java.util.Scanner;
import PackagePracticeSettwo.Error;
import PackagePracticeSettwo.TryAgain;
import PackagePracticeSettwo.Greeting;

public class call {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String userInput = scanner.next();

        if (isInteger(userInput)) {
            Error e = new Error();
            e.display();
        } else if (isDouble(userInput)) {
            TryAgain t = new TryAgain();
            t.display();
        } else {
            Greeting g = new Greeting();
            g.display();
        }
    }

    private static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isDouble(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
