// This class extends the Thread class to create a custom thread.
class MyThr extends Thread {
    // Constructor to set the name of the thread
    public MyThr(String name) {
        super(name);
    }

    // The run method is invoked when the thread starts
    public void run() {
        int i = 34;
        System.out.println("I am Thread");

        // TODO: Add the logic for the desired behavior of the thread

        // while (false) {
        //     System.out.println("I am Thread");
        // }
    }
}

public class threadclass {
    public static void main(String[] args) {
        // Create an instance of the custom thread with a name "HGs"
        MyThr t = new MyThr("HGs");

        // Create another instance of the custom thread with a name "HGsz"
        MyThr t1 = new MyThr("HGsz");

        // Start the first thread
        t.start();

        // Display the ID and name of the first thread
        System.out.println("The id of the Thread t is " + t.getId());
        System.out.println("The Name of the Thread t is " + t.getName());

        // Display the ID and name of the second thread
        System.out.println("The id of the Thread t1 is " + t1.getId());
        System.out.println("The Name of the Thread t1 is " + t1.getName());
    }
}
