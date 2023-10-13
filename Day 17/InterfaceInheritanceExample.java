import java.util.*;

// Define a parent interface with common methods
interface ParentInterface {
    void method1();
    void method2();
}

// Define a child interface that extends the parent interface and adds more methods
interface ChildInterface extends ParentInterface {
    void method3();
    void method4();
}

// Implementation class that implements the child interface
class ChildClass implements ChildInterface {
    public void method1() {
        System.out.println("Method 1");
    }

    public void method2() {
        System.out.println("Method 2");
    }

    public void method3() {
        System.out.println("Method 3");
    }

    public void method4() {
        System.out.println("Method 4");
    }
}

public class InterfaceInheritanceExample {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
    }
}
