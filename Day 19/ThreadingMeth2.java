class MyThreadRunnable implements Runnable {
    public void run() {
        int count = 0;  // Initialize a counter for Thread Zero
        int maxCount = 4000;  // Maximum count for Thread Zero
        
        while (count < maxCount) {
            System.out.println("I am Thread Zero");  // Print a message for Thread Zero
            count++;
        }
    }
}

class MyThreadRunnable1 implements Runnable {
    public void run() {
        int count = 0;  // Initialize a counter for Thread One
        int maxCount = 400099;  // Maximum count for Thread One
        
        while (count < maxCount) {
            System.out.println("I am Thread One");  // Print a message for Thread One
            count++;
        }
    }
}

public class ThreadingMeth2 {
    public static void main(String[] args) {
        // Create instances of the Runnable classes
        MyThreadRunnable threadZeroRunnable = new MyThreadRunnable();
        MyThreadRunnable1 threadOneRunnable = new MyThreadRunnable1();
        
        // Create threads using the Runnable instances
        Thread threadZero = new Thread(threadZeroRunnable);
        Thread threadOne = new Thread(threadOneRunnable);
        
        // Start the threads
        threadZero.start();
        threadOne.start();
    }
}
