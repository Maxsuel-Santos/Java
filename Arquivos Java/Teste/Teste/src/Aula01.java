import java.util.Scanner;

public class Aula01 {
    
    // Method
    static void metodo(double a, double b){
        double x = (Math.pow(a, 2)) + (Math.pow(b, 2));
        System.out.printf("X = %.2f\n", x);
    }
    
    // Line
    static void line() {
        System.out.print("*******************************************\n");
    }
    
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            double a, b;

            line();

            System.out.print("Digite o valor A: ");
            a = input.nextDouble();

            line();

            System.out.printf("Digite o valor B: ");
            b = input.nextDouble();

            line();

            metodo(a, b);

            //System.out.printf("X = %.2f\n", );
            
            line();
        }
    }
}
