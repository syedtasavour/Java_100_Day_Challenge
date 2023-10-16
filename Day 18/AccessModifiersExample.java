class ExampleClass {
    // Public, protected, default (package-private), and private variables
    public int publicVar = 5;
    protected int protectedVar = 45;
    int defaultVar = 6;
    private int privateVar = 78;

    // Method to print the values of the variables
    public void printVariables() {
        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
        System.out.println(privateVar);
    }
}

public class AccessModifiersExample {
    public static void main(String[] args) {
        // Create an instance of ExampleClass
        ExampleClass example = new ExampleClass();

        // Call the method to print variables
        example.printVariables();
        
        // Accessing variables directly (commented out)
        // System.out.println(example.protectedVar);
    }
}
