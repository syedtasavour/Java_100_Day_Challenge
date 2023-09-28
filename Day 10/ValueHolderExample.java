// Base class
class BaseClass {
    int baseValue;

    // Method to get the value of baseValue
    public int getBaseValue() {
        return baseValue;
    }

    // Method to set the value of baseValue
    public void setBaseValue(int baseValue) {
        this.baseValue = baseValue;
    }

    // Method to print a message
    public void printMessage() {
        System.out.println("I am a Constructor");
    }
}

// Derived class extending the BaseClass
class DerivedClass extends BaseClass {
    int derivedValue;
    // No methods or variables are defined in this class yet
}

public class Main {
    public static void main(String[] args) {
        // BaseClass
        BaseClass b = new BaseClass();
        b.setBaseValue(4);
        b.printMessage();
        System.out.println(b.getBaseValue());
        // DerivedClass
        DerivedClass d = new DerivedClass();
        d.derivedValue = b.baseValue*2;
        System.out.println(d.derivedValue);
         d.printMessage();

    } 
}
