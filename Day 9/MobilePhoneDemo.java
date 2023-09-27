class MobilePhone {
    void makeCall() {
        System.out.println("Making a call...");
    }

    void receiveCall() {
        System.out.println("Receiving a call...");
    }

    void vibrate() {
        System.out.println("Vibrating...");
    }

    void endCall() {
        System.out.println("Call ended...");
    }
}

public class MobilePhoneDemo {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();

        // Making a call
        mobilePhone.makeCall();

        // Receiving a call
        mobilePhone.receiveCall();

        // Vibrating
        mobilePhone.vibrate();

        // Ending the call
        mobilePhone.endCall();
    }
}
