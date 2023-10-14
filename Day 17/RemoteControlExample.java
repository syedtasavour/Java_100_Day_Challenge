// Define a TV control interface
interface TelevisionControl {
    void powerOn();  // Turn on the TV
    void powerOff();  // Turn off the TV
    void channelUp();  // Increase the channel
    void channelDown();  // Decrease the channel
}

// Extend the TV control interface to include smart TV features
interface SmartTelevisionControl extends TelevisionControl {
    void nearbySharing();  // Find nearby devices for sharing
    void openSettings();  // Open TV settings
    void cast();  // Share mobile display
    void wifi();  // Get available Wi-Fi list
    void openAppStore();  // Find the best apps for the TV
}

// Remote control class implementing the smart TV control interface
class SmartRemote implements SmartTelevisionControl {
    public void powerOn() {
        System.out.println("Turning On TV");
    }

    public void powerOff() {
        System.out.println("Turning Off TV");
    }

    public void channelUp() {
        System.out.println("Changing Channel Up");
    }

    public void channelDown() {
        System.out.println("Changing Channel Down");
    }

    public void nearbySharing() {
        System.out.println("Finding Nearby Devices for Sharing");
    }

    public void openSettings() {
        System.out.println("Opening TV Settings");
    }

    public void cast() {
        System.out.println("Sharing Mobile Display");
    }

    public void wifi() {
        System.out.println("Getting Available Wi-Fi List");
    }

    public void openAppStore() {
        System.out.println("Finding Best Apps for Your TV");
    }
}

public class RemoteControlExample {
    public static void main(String[] args) {
        SmartTelevisionControl smartRemote = new SmartRemote();

        // Control basic TV functions
        smartRemote.powerOn();
        smartRemote.channelUp();
        smartRemote.channelDown();
        smartRemote.powerOff();

        // Control smart TV functions
        smartRemote.openAppStore();
        smartRemote.wifi();
        smartRemote.cast();
        smartRemote.openSettings();
        smartRemote.nearbySharing();
        smartRemote.powerOff();
    }
}
