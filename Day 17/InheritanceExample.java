class Animal {
    void jump() {
        System.out.println("Animal is jumping");
    }

    void bite() {
        System.out.println("Animal is biting");
    }
}

interface BasicActions {
    void eat();

    void sleep();
}

class Human extends Animal implements BasicActions {
    @Override
    public void eat() {
        System.out.println("Human is eating");
    }
    @Override
    public void sleep() {
        System.out.println("Human is sleeping");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Human human = new Human();  // Creating an instance of the Human class
        human.sleep();  // Calling the sleep method of the Human class
        human.bite();   // Calling the bite method inherited from the Animal class
        human.eat();    // Calling the eat method of the Human class
        human.jump();   // Calling the jump method inherited from the Animal class
    }
}