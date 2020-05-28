import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            if (n == 0 && a == 0) {
                break;
            }
            int[] num = new int[20000];
            for (int i = 0; i < a; i++) {
                num[sc.nextInt()]++;
            }
            int dup = 0;
            for (int value : num) {
                if (value > 1) {
                    dup ++;
                }
            }
            System.out.println(dup);
        }
    }
}
