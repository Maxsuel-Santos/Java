import java.util.Scanner;

public class escher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int seq = in.nextInt();
        int[] alt = new int[seq]; 
        int flag = 0;

        if(seq % 2 == 0) {
            for(int i = 0; i < seq; i++)
                alt[i] = in.nextInt();

        int soma = alt[0] + alt[seq - 1];
        int soma_c = 0;

        for(int i = 1; i < seq / 2; i++) {
            soma_c = alt[i] + alt[seq - i - 1];
            if(soma != soma_c)
                flag = 1;
        }

        if(flag == 0)
            System.out.println("S");
        else 
            System.out.println("N");
    } else
        System.out.println("N");
    }
}
