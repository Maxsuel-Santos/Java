/* 
    Entrega de Caixas
*/

package transporte;
import java.util.Scanner;

public class Transporte {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = 0, B = 0, C = 0;
        
        System.out.print("A: ");
        A = scan.nextInt();
        
        System.out.print("B: ");
        B = scan.nextInt();
        
        System.out.print("C: ");
        C = scan.nextInt();
        
        if(A >= 1 && B <= C && C <= 1000) {
            if((A + B) < C || A < B && B < C) {
                System.out.println("1");
            } else if ((A + B) < C) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        } else {
            System.out.println("-1");
        }
        
        System.out.println("FIM");
        
        scan.close();
    }
    
}
