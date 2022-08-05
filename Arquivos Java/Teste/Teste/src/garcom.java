import java.util.Scanner;

public class garcom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int L, C, X = 0;
        
        for(int i = 1; i <= N; i++) {
            L = in.nextInt();
            C = in.nextInt();
            if(C < L)
                X += C;
        } System.out.printf("%d", X);
    }
}
