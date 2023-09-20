import java.util.Scanner;

public class WebsiteDomainChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the URL from the user
        System.out.print("Enter Website URL Without End Slash (/): ");
        String url = scanner.nextLine();

        // Extract the domain extension from the URL
        int dotIndex = url.lastIndexOf(".");
        String domainExtension = url.substring(dotIndex + 1);

        // Check the domain extension and provide information accordingly
        switch (domainExtension) {
            case "org":
                System.out.println("The domain extension \".org\" indicates an organization.");
                System.out.println("Standard: Typically used by non-profit organizations, educational institutions, or any other organizations.");
                break;
            case "in":
                System.out.println("The domain extension \".in\" indicates a domain related to India.");
                System.out.println("Standard: It is the country code top-level domain (ccTLD) for India.");
                break;
            case "com":
                System.out.println("The domain extension \".com\" indicates a commercial website.");
                System.out.println("Standard: Widely used for commercial or business purposes.");
                break;
            case "shop":
                System.out.println("The domain extension \".shop\" indicates an online store or shopping site.");
                System.out.println("Standard: Used for e-commerce and online shopping websites.");
                break;
            case "ai":
                System.out.println("The domain extension \".ai\" indicates a domain related to artificial intelligence (AI).");
                System.out.println("Standard: Sometimes used for websites related to AI technologies, research, or businesses.");
                break;
            case "online":
                System.out.println("The domain extension \".online\" indicates an online presence or business.");
                System.out.println("Standard: Used by businesses and individuals to establish a strong online presence.");
                break;
            default:
                System.out.println("The domain extension \"" + domainExtension + "\" is not a common type.");
                System.out.println("No specific information available for this domain extension.");
                break;
        }
    }
}
