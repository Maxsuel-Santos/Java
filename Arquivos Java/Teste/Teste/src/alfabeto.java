import java.util.Scanner;

public class alfabeto {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String alfabeto[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        int resp;

        System.out.print("\n\n\n\nDigite a letra do alfabeto que você quer ver [ 1 a 26]: ");
        resp = in.nextInt();

        System.out.printf("A letra solicitada é: %s\n\n\n\n", alfabeto[resp-1]);
    
    }
}
