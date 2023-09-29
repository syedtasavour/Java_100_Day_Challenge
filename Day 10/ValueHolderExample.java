// ValueHolder class representing a value holder
class ValueHolder {
    private int value;

    // Method to get the value
    public int getValue() {
        return value;
    }

    // Method to set the value
    public void setValue(int value) {
        this.value = value;
    }

    // Method to print a message
    public void printMessage() {
        System.out.println("I am a ValueHolder");
    }
}

// DerivedValueHolder class extending the ValueHolder class
class DerivedValueHolder extends ValueHolder {
    private int derivedValue;
    // No additional methods or variables are defined in this class yet
}

public class ValueHolderExample {
    public static void main(String[] args) {
        // Create a ValueHolder instance
        ValueHolder valueHolder = new ValueHolder();
        valueHolder.setValue(4);
        valueHolder.printMessage();
        System.out.println("Value: " + valueHolder.getValue());

        // Create a DerivedValueHolder instance
        DerivedValueHolder derivedValueHolder = new DerivedValueHolder();
        derivedValueHolder.setValue(valueHolder.getValue() * 2);
        System.out.println("Derived Value: " + derivedValueHolder.getValue());
        derivedValueHolder.printMessage();
    }
}
