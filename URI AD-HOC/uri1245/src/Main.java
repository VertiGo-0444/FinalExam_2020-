import java.util.*;

public class Main {
    static final int M = 60;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextInt()) {
            int n = scan.nextInt();
            int[] left = new int[M + 1];
            int[] right = new int[M + 1];
            for (int i = 0; i < n; i++) {
                int size = scan.nextInt();
                String type = scan.next();
                if (type.equals("E")) {
                    ++left[size];
                } else {
                    ++right[size];
                }

            }
            int r = 0;
            for (int i = 0; i < left.length; ++i) {
                r += Math.min(left[i], right[i]);
            }
            System.out.println(r);

        }
    }
}