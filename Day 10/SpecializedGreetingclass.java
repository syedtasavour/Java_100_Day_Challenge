class Greeting {
    public void greet() {
        System.out.println("Hi, Welcome to Java");
    }

    public void displayName() {
        System.out.println("My name is Java");
    }
}

class SpecializedGreeting extends Greeting {
    @Override
    public void displayName() {
        System.out.println("My name is Java, SpecializedGreeting class");
    }

    public void specialGreet() {
        System.out.println("Hi, Welcome to Java in SpecializedGreeting class");
    }
}

public class SpecializedGreetingclass {
    public static void Main(String[] args) {
        Greeting greetingObj = new Greeting();
        SpecializedGreeting specializedGreetingObj = new SpecializedGreeting();
        Greeting polymorphicObj = new SpecializedGreeting(); // Demonstrating polymorphism
        polymorphicObj.displayName();
    }
}
