class Monkey {
    // Method to make the monkey jump
    void jump() {
        System.out.println("Monkey is jumping");
    }

    // Method to make the monkey bite
    void bite() {
        System.out.println("Monkey is biting");
    }
}

class Human extends Monkey {
    // Method to make the human eat
    void eat() {
        System.out.println("Human is eating");
    }

    // Method to make the human sleep
    void sleep() {
        System.out.println("Human is sleeping");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Human humanObj = new Human();  // Creating an instance of the Human class
        humanObj.sleep();  // Calling the sleep method of the Human class
        humanObj.bite();   // Calling the bite method inherited from the Monkey class
        humanObj.eat();    // Calling the eat method of the Human class
        humanObj.jump();   // Calling the jump method inherited from the Monkey class
    }
}
