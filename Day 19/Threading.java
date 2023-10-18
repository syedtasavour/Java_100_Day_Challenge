// Define a class for running a thread
class MyThread1 extends Thread {

    // Run method for thread execution
    @Override
    public void run() {
        int i = 0;  // Initialize a counter for thread 1

        // Execute the following code while i is less than 4000
        while (i < 4000) {
            // Print a message indicating thread 1 is running and the corresponding class
            System.out.println("Thread1 Is Running Class 1");
            // Print the next output line for thread 1
            System.out.println("NextOutput Line Class 1");
            i++;  // Increment the counter
        }
    }
}

// Define another class for running a thread
class MyThread2 extends Thread {

    // Run method for thread execution
    @Override
    public void run() {
        int i = 0;  // Initialize a counter for thread 2

        // Execute the following code while i is less than 4000
        while (i < 4000) {
            // Print a message indicating thread 2 is running and the corresponding class
            System.out.println("Thread2 Is Running Class 2");
            // Print the next output line for thread 2
            System.out.println("NextOutput Line Class 2");
            i++;  // Increment the counter
        }
    }
}

// Main class to start the threads
public class Threading {
    public static void main(String[] args) {
        // Create an instance of MyThread1
        MyThread1 t1 = new MyThread1();

        // Create an instance of MyThread2
        MyThread2 t2 = new MyThread2();

        // Start thread 1
        t1.start();

        // Start thread 2
        t2.start();
    }
}
