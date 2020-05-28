import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while(true) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            if(N == 0 && M == 0){
                break;
            }
            boolean nobody = true, every = true, solved = true, one = true;
            int contest[][] = new int[N][M];
            for(int i = 0; i < N; i++){
                int noSolution = 0;
                for(int j = 0; j < M; j++){
                    contest[i][j] = scan.nextInt();
                    if(contest[i][j] == 1){
                        noSolution++;
                    }
                }
                if(noSolution == M){
                    nobody = false;
                }else if(noSolution == 0){
                    one = false;
                }
            }
            for(int j = 0; j < M; j++){
                int allSolved = 0;
                for(int i = 0; i < N; i++){
                    if(contest[i][j] == 1){
                        allSolved++;
                    }
                }
                if(allSolved < 1){
                    every = false;
                }else if(allSolved == N){
                    solved = false;
                }
            }
            System.out.println((nobody ? 1 : 0) + (every ? 1 : 0) + (solved ? 1 : 0) + (one ? 1 : 0));
        }
    }
}
