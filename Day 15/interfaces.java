// Interface for a generic greeting
interface Greeting {
    void greet();
}

// Class implementing the Greeting interface with a specific greeting
class GreetingImplementation implements Greeting {
    @Override
    public void greet() {
        System.out.println("Greetings from GreetingImplementation!");
    }
}

// Another class implementing the Greeting interface with a different greeting
class AnotherGreetingImplementation implements Greeting {
    @Override
    public void greet() {
        System.out.println("Greetings from AnotherGreetingImplementation!");
    }
}

public class interfaces {
    public static void main(String[] args) {
        GreetingImplementation greeting1 = new GreetingImplementation();
        greeting1.greet();

        AnotherGreetingImplementation greeting2 = new AnotherGreetingImplementation();
        greeting2.greet();
    }
}
