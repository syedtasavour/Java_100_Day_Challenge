public class StarPattern {
    public static void main(String[] args) {
        // Print a pattern of stars
        for (int row = 4; row >= 0; row--) {
            for (int col = row; col >= 0; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
