package PackagePracticeSet;


class Calculator {
    // Public, protected, default (package-private), and private variables
    public int publicVar = 5;
    protected int protectedVar = 45;
    int defaultVar = 6;
    private int privateVar = 78;

    // Method to print the values of the variables
    public Calculator() {
        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
        System.out.println(privateVar);
    }
}class ScCalculator {
    // Public, protected, default (package-private), and private variables
    public int publicVar = 5;
    protected int protectedVar = 45;
    int defaultVar = 6;
    private int privateVar = 78;

    // Method to print the values of the variables
    public ScCalculator() {
        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
        System.out.println(privateVar);
}}class HybridCalculator {
    // Public, protected, default (package-private), and private variables
    public int publicVar = 5;
    protected int protectedVar = 45;
    int defaultVar = 6;
    private int privateVar = 78;
   

    // Method to print the values of the variables
    public HybridCalculator() {
        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
        System.out.println(privateVar);
}}



public class main {
    public static void main(String[] args) {
        // Create an instance of ExampleClass
        Calculator example = new Calculator();

        // Call the method to print variables
        // example.printVariables();
        
        // Accessing variables directly (commented out)
        // System.out.println(example.protectedVar);
    }
}
