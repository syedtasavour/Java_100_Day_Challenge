public class OperatorPrecedenceAssociativity {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 2;

        // Examples demonstrating precedence and associativity
        int result1 = a + b * c;  // '*' has higher precedence than '+'
        int result2 = a / b + c;  // '/' and '+' have the same precedence, left to right associativity
        int result3 = a % c;      // '%' has higher precedence than '+'

        // Display the results
        System.out.println("Result 1: " + result1);  // Result: 10 + (5 * 2) = 20
        System.out.println("Result 2: " + result2);  // Result: (10 / 5) + 2 = 4
        System.out.println("Result 3: " + result3);  // Result: 10 % 2 = 0
    }
}
