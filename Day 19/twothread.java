// Class representing a thread that prints "Good Morning" and a number
class GoodMorningThread extends Thread {
    public GoodMorningThread() {
        int count = 0;  // Initialize a counter for the messages

        // Print "Good Morning" and a number
        while (count < 1) {
            System.out.println("Good Morning " + count);

            try {
                Thread.sleep(1);  // Introduce a 1 millisecond delay
            } catch (InterruptedException e) {
                e.printStackTrace();  // Print stack trace if interrupted
            }

            count++;  // Increment the counter
        }
    }
}

// Class representing a thread that prints "Welcome" and a number
class WelcomeThread extends Thread {
    public WelcomeThread() {
        int count = 0;  // Initialize a counter for the messages

        // Print "Welcome" and a number
        while (count < 1) {
            System.out.println("Welcome " + count);

            try {
                Thread.sleep(1);  // Introduce a 1 millisecond delay
            } catch (InterruptedException e) {
                e.printStackTrace();  // Print stack trace if interrupted
            }

            count++;  // Increment the counter
        }
    }
}

// Main class to start the two threads
public class twothread {
    public static void main(String[] args) {
        // Create instances of the thread classes
        GoodMorningThread goodMorningThread = new GoodMorningThread();
        WelcomeThread welcomeThread = new WelcomeThread();

        // Set thread priorities
        welcomeThread.setPriority(6);  // Higher priority for WelcomeThread
        goodMorningThread.setPriority(1);  // Lower priority for GoodMorningThread

        // Print the priorities of the threads
        System.out.println("WelcomeThread Priority: " + welcomeThread.getPriority());
        System.out.println("GoodMorningThread Priority: " + goodMorningThread.getPriority());

        // Print the state of the GoodMorningThread
        System.out.println("GoodMorningThread State: " + goodMorningThread.getState());
        System.out.println("Current Thread State: " + Thread.currentThread().getState());

        // Start the threads
        goodMorningThread.start();
        welcomeThread.start();
    }
}
