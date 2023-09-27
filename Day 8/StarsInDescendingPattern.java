import java.util.*;

public class StarsInDescendingPattern {
    public static void main(String[] args) {
        printStarsInDescendingPattern(5);
    }

    static void printStarsInDescendingPattern(int numStars) {
        if (numStars > 0) {
            // Print '*' in a descending pattern
            for (int i = numStars; i > 0; i--) {
                System.out.print("*");
            }
            System.out.println();
            // Recur for the next iteration with a decreased number of stars
            printStarsInDescendingPattern(numStars - 1);
        }
    }
}
