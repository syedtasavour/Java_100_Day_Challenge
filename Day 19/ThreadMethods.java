// Class representing a custom thread (MyNewThr1) that extends Thread
class MyNewThr1 extends Thread {
    public void run() {
        int count = 0; // Variable to keep track of iterations
        while (true) {
            System.out.println("Thank you: " + count);
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
        }
    }
}

// Class representing another custom thread (MyNewThr2) that extends Thread
class MyNewThr2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("My Thank you");
        }
    }
}

// Main class to demonstrate thread usage
public class ThreadMethods {
    public static void main(String[] args) {
        MyNewThr1 thread1 = new MyNewThr1(); // Create an instance of MyNewThr1
        MyNewThr2 thread2 = new MyNewThr2(); // Create an instance of MyNewThr2

        thread1.start(); // Start the first thread (MyNewThr1)
        thread2.start(); // Start the second thread (MyNewThr2)
    }
}
