// Abstract base class representing a greeting
abstract class GreetingBase {
    // Constructor for the base class
    public GreetingBase() {
        System.out.println("I am Base constructor");
    }

    // Method to say hi
    public void sayHi() {
        System.out.println("I am here");
    }

    // Abstract method for a greeting
    abstract public void greet();
}

// Class extending the base class to provide a specific greeting
class MorningGreeting extends GreetingBase {
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }
}

// Abstract base class for morning greetings
abstract class AbstractMorningGreeting extends GreetingBase {
    public void displayMorningMessage() {
        System.out.println("Good Morning");
    }
}

public class GreetingApp {
    public static void main(String[] args) {
        GreetingBase greeting = new MorningGreeting();
        greeting.sayHi();
        greeting.greet();
    }
}

