import java.util.Scanner;

public class morango {    
    
    static int metodo_abcd(int a, int b, int c, int d) {
        if((a * b) > (c * d))
            return a * b;
        else 
            return c * d;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        
        int v = metodo_abcd(a, b, c, d);
        System.out.println(v);
    }
}
