class BaseClass {
    int baseValue;  // Member variable to store an integer value

    // Constructor to initialize the 'baseValue'
    BaseClass(int baseValue) {
        this.baseValue = baseValue;  // Initialize the baseValue using 'this'
    }

    // Method to get the 'baseValue'
    public int getBaseValue() {
        return baseValue;
    }
}

class DerivedClass extends BaseClass {
    int derivedValue;  // Member variable to store an integer value in DerivedClass

    // Constructor to initialize the 'derivedValue' and call the base class constructor
    DerivedClass(int baseValue, int derivedValue) {
        super(baseValue);  // Call the constructor of the base class using 'super'
        this.derivedValue = derivedValue;  // Initialize the derivedValue using 'this'
    }

    // Method to get the 'derivedValue'
    public int getDerivedValue() {
        return derivedValue;
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        // Create an instance of DerivedClass and initialize with baseValue 5 and derivedValue 10
        DerivedClass derivedInstance = new DerivedClass(5, 10);

        // Print the baseValue and derivedValue using respective methods
        System.out.println("BaseValue: " + derivedInstance.getBaseValue());
        System.out.println("DerivedValue: " + derivedInstance.getDerivedValue());
    }
}
