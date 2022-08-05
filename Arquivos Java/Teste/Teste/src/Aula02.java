import java.util.Scanner;

public class Aula02 {
    
    // Method
    static void metodo(double a, double b, double d) {
        System.out.printf("\nXPositivo: %.2f\n", (-b + Math.sqrt(d)) / (2*a));
    }
    
    public static void main(String[] args) {
       double a, b, d;
       
       try (Scanner input = new Scanner(System.in)) {
           System.out.print("Digite A: ");
           a = input.nextDouble();
           //
           System.out.print("Digite B: ");
           b = input.nextDouble();
           //
           System.out.print("Digite D: ");
           d = input.nextDouble();
           
           metodo(a, b, d);
       }
    }
}
