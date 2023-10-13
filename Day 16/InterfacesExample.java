import java.util.*;

// Interface for camera functionality
interface Camera {
    void takeSnap();
    void recordVideo();
    
    default void record4KVideo() {
        greet();
        System.out.println("Recording 4K Video");
    }

    void greet(); // Added method to greet for 4K video recording
}

// Interface for WiFi functionality
interface Wifi {
    String[] getAvailableNetworks();
    void connectToNetwork(String network);
}

class MobilePhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickNumber() {
        System.out.println("Connecting...");
    }
}

class Smartphone extends MobilePhone implements Wifi, Camera {
    
    public void takeSnap() {
        System.out.println("Taking Snap");
    }
    
    public void recordVideo() {
        System.out.println("Recording Video");
    }
    
    public void record4KVideo() {
        System.out.println("Recording 4K Video Plus");
    }
    
    public String[] getAvailableNetworks() {
        System.out.println("Getting List Of Wifi");
        String[] networkList = {"SSID1", "SSID2", "SSID3"};
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to Wifi " + network);
    }

    public void greet() {
        System.out.println("Greetings before 4K video recording.");
    }
}

public class InterfacesExample {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        smartphone.record4KVideo();

        String[] availableNetworks = smartphone.getAvailableNetworks();
        for (String network : availableNetworks) {
            System.out.println(network);
        }
    }
}
