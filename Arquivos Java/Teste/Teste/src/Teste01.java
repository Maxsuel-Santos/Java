import java.util.Scanner;

public class Teste01 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            double a, b, x;

            line();

            System.out.print("Digite o valor A: ");
            a = input.nextDouble();

            line();

            System.out.printf("Digite o valor B: ");
            b = input.nextDouble();

            line();

            x = (Math.pow(a, 2)) + (Math.pow(b, 2)); 

            System.out.printf("X = %.2f\n", x);

            line();
        }
    }

    private static void line() {
        System.err.print("*******************************************\n");
    }
}
