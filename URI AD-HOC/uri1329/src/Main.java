import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String l;
        String[] P;
        int M, J;
        while (!(l = in.readLine()).equals("0")) {
            P = in.readLine().split("\\s+");
            M = 0;
            J = 0;
            for (String Pi : P) {
                if (Pi.equals("0")) {
                    M++;
                } else {
                    J++;
                }
            }
            out.println("Mary won " + M + " times and John won " + J + " times");
        }
        out.close();
    }

}