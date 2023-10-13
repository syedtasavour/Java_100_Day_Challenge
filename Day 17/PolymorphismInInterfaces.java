interface Camera {
    void takeSnap(); // Method to take a snapshot
    void recordVideo(); // Method to record a video
    default void record4KVideo() {
        System.out.println("Recording in 4k...");
    }
}

interface Wifi {
    String[] getAvailableNetworks(); // Method to get the available networks
    void connectToNetwork(String network); // Method to connect to a network
}

class CellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting... ");
    }
}

class Smartphone extends CellPhone implements Wifi, Camera {
    public void takeSnap() {
        System.out.println("Taking snap");
    }

    public void recordVideo() {
        System.out.println("Recording video");
    }

    public String[] getAvailableNetworks() {
        System.out.println("Getting List of Networks");
        String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }

    public void sampleMethod() {
        System.out.println("Sample method");
    }
}

public class PolymorphismInInterfaces {
    public static void main(String[] args) {
        Camera camera = new Smartphone(); // Use the Smartphone as a camera
        // camera.getAvailableNetworks(); --> Not allowed
        // camera.sampleMethod(); --> Not allowed

        camera.record4KVideo();

        Smartphone smartphone = new Smartphone();
        smartphone.sampleMethod();
        smartphone.recordVideo();
        smartphone.getAvailableNetworks();
        smartphone.callNumber(7979);
    }
}
