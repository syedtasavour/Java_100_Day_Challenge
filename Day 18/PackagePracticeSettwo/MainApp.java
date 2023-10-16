package PackagePracticeSettwo;

public class Greeting {
    public Greeting() {
        System.out.println("Thank you! We have received your information. We will contact you as soon as possible.");
    }
}

public class Error {
    public Error() {
        System.out.println("Invalid input. Please enter valid information.");
    }
}

public class TryAgain {
    public TryAgain() {
        System.out.println("The server is busy. Please try again later.");
    }
}

public class MainApp {
    public static void main(String[] args) {
        Greeting g = new Greeting();
        Error e = new Error();
        TryAgain t = new TryAgain();
    }
}
