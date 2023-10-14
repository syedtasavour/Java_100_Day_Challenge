abstract class Telephone {
    // Abstract method to ring the phone
    abstract void ring();

    // Abstract method to disconnect the call
    abstract void disconnect();
}

class SmartTelephone extends Telephone {
    @Override
    public void ring() {
        System.out.println("Ringing....");
    }

    @Override
    public void disconnect() {
        System.out.println("Call Disconnected....");
    }

    // New method to vibrate the phone
    public void vibrate() {
        System.out.println("Vibrating....");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Telephone telephone = new SmartTelephone();
        telephone.ring();
        telephone.disconnect();

        SmartTelephone smartTelephone = new SmartTelephone();
        smartTelephone.vibrate();
    }
}
