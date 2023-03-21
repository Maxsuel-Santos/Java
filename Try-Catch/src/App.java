import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite um valor: ");
            int x = sc.nextInt();
            int y = 100 / x;
            System.out.println ("Resultado: " + y);
        }
        catch (InputMismatchException e) {
            System.out.println ("Formato inválido!");
            System.out.println("\n Detalhes do erro:"+ e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println ("Operação inválida!");
            System.out.println("\n Detalhes do erro:"+ e.getMessage());
        }
        finally {
            System.out.println("Fim do 'Try - Catch'.");
        }
    }
}
