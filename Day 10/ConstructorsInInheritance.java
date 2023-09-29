class BaseClass {
    // Default constructor
    BaseClass() {
        System.out.println("BaseClass Default Constructor");
    }

    // Overloaded constructor with an int parameter
    BaseClass(int x) {
        System.out.println("BaseClass Overloaded Constructor: " + x);
    }

    public int baseValue;

    // Method to get the baseValue
    public int getBaseValue() {
        return baseValue;
    }

    // Method to set the baseValue
    public void setBaseValue(int value) {
        this.baseValue = value;
    }
}

class DerivedClass extends BaseClass {
    // Default constructor of DerivedClass
    DerivedClass() {
        super(0);  // Call the overloaded constructor of the base class
        System.out.println("DerivedClass Default Constructor");
    }

    // Overloaded constructor with an int parameter
    DerivedClass(int y) {
        super(y);  // Call the overloaded constructor of the base class
        System.out.println("DerivedClass Overloaded Constructor: " + y);
    }

    public int derivedValue;

    // Method to get the derivedValue
    public int getDerivedValue() {
        return derivedValue;
    }

    // Method to set the derivedValue
    public void setDerivedValue(int value) {
        this.derivedValue = value;
    }
}

class ChildDerived extends DerivedClass {
    ChildDerived(int z) {
        super(z);  // Call the overloaded constructor of the derived class
        System.out.println("ChildDerived Constructor: " + z);
    }
}

public class ConstructorsInInheritance {
    public static void main(String[] args ) {
        BaseClass base = new BaseClass(5);  // Create an instance of BaseClass
        DerivedClass derived = new DerivedClass(3);  // Create an instance of DerivedClass
        ChildDerived child = new ChildDerived(2);  // Create an instance of ChildDerived
    }
}
