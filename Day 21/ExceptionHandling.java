import java.util.*;

// Class for handling 'hehe' exception
class HeheException {
    void handleException() {
        System.out.println("Hehe exception occurred.");
    }
}

// Class for handling 'haha' exception
class HahaException {
    void handleException() {
        System.out.println("Haha exception occurred.");
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            
            // Prompt the user to enter two numbers
            System.out.print("Enter Num a: ");
            int a = scanner.nextInt();
            System.out.print("Enter Num b: ");
            int b = scanner.nextInt();
            

            // Handle division by zero exception
            System.out.println(a / b);
        } catch (IllegalArgumentException e) {
            HeheException heheException = new HeheException();
            
            // Handle 'hehe' exception
            heheException.handleException();
        } catch (ArithmeticException e) {
            HahaException hahaException = new HahaException();
            
            // Handle 'haha' exception
            hahaException.handleException();
        }
    }
}
