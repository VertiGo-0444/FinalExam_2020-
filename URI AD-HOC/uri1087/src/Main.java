import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1, y1, x2, y2;
        while(true) {
            x1 = scan.nextInt();
            y1 = scan.nextInt();
            x2 = scan.nextInt();
            y2 = scan.nextInt();
            if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0)
                break;
            if(x1 == x2 && y1 == y2)
                System.out.printf("0\n");
            else if ((x2-x1) == -(y2-y1) || -(x2-x1) == -(y2-y1) || -(x2-x1) == (y2-y1) || (x2-x1) == (y2-y1))
                System.out.printf("1\n");
            else if(x1 == x2 || y1 == y2)
                System.out.printf("1\n");
            else
                System.out.printf("2\n");
        }
    }
}
