/*import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            int number1;

            System.out.print("N1: ");
            number1 = input.nextInt();

            System.out.printf("Valor: %d", number1);
            
        }
    }
}*/


import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Qual seu nome?");

        String message = String.format("Bem vindo, %s!", name);

        JOptionPane.showMessageDialog(null, message);
         
    }
}
