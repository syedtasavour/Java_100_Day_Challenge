public class binary {
    public static int bs(int[] n, int key) {
        int b = n.length / 2;
        for (int i = 0; i < n.length; i++) {
            if (key >= n[b]) {
                if (key == n[b]) {
                    return b;
                }
                b++;
            } else if (key <= n[b]) {
                if (key == n[b]) {
                    return b;
                }
                b--;
            }

        }
        return -1;
    }

    public static int ss(int[] n, int key) {
        int start = 0;
        int end = n.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == n[mid]) {
                return mid;
            } else if (key < n[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;}}
        return -1;}

    public static void main(String args[]) {
        int n[] = { 2, 4, 6, 8, 10, 12, 14 };
        System.out.print(bs(n, 14));

    }

}
