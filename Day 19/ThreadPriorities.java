// Custom thread class MyThr1 extending Thread
class MyThr1 extends Thread {
    // Constructor to set the name of the thread
    public MyThr1(String name) {
        super(name);
    }

    // The run method is invoked when the thread starts
    public void run() {
        while (true) {
            // Print a message with the thread's name
            System.out.println("Thank you: " + this.getName());
        }
    }
}

public class ThreadPriorities {
    public static void main(String[] args) {
        // Create instances of the custom thread class
        MyThr1 t1 = new MyThr1("Harry1"); // Thread instance 1
        MyThr1 t2 = new MyThr1("Harry2"); // Thread instance 2
        MyThr1 t3 = new MyThr1("Harry3"); // Thread instance 3
        MyThr1 t4 = new MyThr1("Harry4"); // Thread instance 4
        MyThr1 t5 = new MyThr1("Harry5 (most Important)"); // Thread instance 5

        // Set thread priorities
        t5.setPriority(Thread.MAX_PRIORITY); // Set highest priority for t5
        t1.setPriority(Thread.MIN_PRIORITY); // Set lowest priority for t1
        t2.setPriority(Thread.MIN_PRIORITY); // Set lowest priority for t2
        t3.setPriority(Thread.MIN_PRIORITY); // Set lowest priority for t3
        t4.setPriority(Thread.MIN_PRIORITY); // Set lowest priority for t4

        // Start the threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
