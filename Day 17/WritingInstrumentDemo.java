abstract class WritingInstrument {
    abstract void write(); // Abstract method to write
    abstract void refill(); // Abstract method to refill
}

class Pen extends WritingInstrument {
    public void write() {
        System.out.println("Writing");
    }

    public void refill() {
        // Implement refill functionality
        System.out.println("Refilling pen.");
    }
    void ChangeNib(){
        System.out.println("Changing The Nib");
    }
} 

public class WritingInstrumentDemo {
    public static void main(String[] args) {
        Pen penInstance = new Pen();  // Create an instance of the Pen subclass
        penInstance.write();  // Invoke the write method
        penInstance.refill();  // Invoke the refill method
        penInstance.ChangeNib(); // Invoke the ChangeNib method
    }
}
