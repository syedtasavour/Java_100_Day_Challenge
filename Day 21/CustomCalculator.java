import java.util.*;

class Multi extends Exception {
    Multi(String message) {
        super(message);
    }
}

class Custom extends Exception {
    Custom(String message) {
        super(message);
    }
}

class DivByZero extends Exception {
    DivByZero(String message) {
        super(message);
    }
}

class Addition {
    Addition(double a, double b) {
        System.out.println("Result of addition: " + (a + b));
    }
}

class Subtraction {
    Subtraction(double a, double b) {
        System.out.println("Result of subtraction: " + (a - b));
    }
}

class Multiplication {
    Multiplication(double a, double b) {
        System.out.println("Result of multiplication: " + (a * b));
    }
}

class Division {
    Division(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            System.out.println("Result of division: " + (a / b));
        }
    }
}

public class CustomCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Press 1 For Addition\nPress 2 For Subtraction\nPress 3 For Multiplication\nPress 4 For Division");
            int user = sc.nextInt();

            if (user < 1 || user > 4) {
                throw new Custom("Invalid Input: Please enter a number between 1 and 4.");
            } else {
                System.out.println("Enter Num A");
                double a = sc.nextDouble();
                System.out.println("Enter Num B");
                double b = sc.nextDouble();

                switch (user) {
                    case 1:
                        Addition ad = new Addition(a, b);
                        break;
                    case 2:
                        Subtraction sb = new Subtraction(a, b);
                        break;
                    case 3:
                        if (a >= 7000 || b >= 7000) {
                            throw new Multi("Max Multiplier Reached Exception: Numbers are too large for multiplication.");
                        } else {
                            Multiplication mp = new Multiplication(a, b);
                        }
                        break;
                    case 4:
                        if (b == 0 || a == 0) {
                            throw new DivByZero("Division by zero is not allowed.");
                        } else {
                            Division dv = new Division(a, b);
                        }
                        break;
                    default:
                        break;
                }
            }
        } catch (Custom e) {
            System.out.println("Custom Input exception: " + e.getMessage());
        } catch (Multi e) {
            System.out.println("Custom Multiplication exception: " + e.getMessage());
        } catch (DivByZero e) {
            System.out.println("Custom Division exception: " + e.getMessage());
        }
    }
}
