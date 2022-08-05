import java.util.Scanner;

public class campeonato {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Cormengo 
        int v_c = in.nextInt(); // Vitórias
        int e_c = in.nextInt(); // Empates
        int sd_c = in.nextInt(); // Saldo de Gols

        // Flaminthians
        int v_f = in.nextInt(); // Vitórias
        int e_f = in.nextInt(); // Empates
        int sd_f = in.nextInt(); // Saldo de Gols

        // Análise Cormengo
        int calc_v_c = v_c * 3; // Vitórias
        int calc_e_c = e_c * 1; // Empates

        // Análise Flaminthians
        int calc_v_f = v_f * 3; // Vitórias
        int calc_e_f = e_f * 1; // Empates

        // Análise Geral
        if (calc_v_c + calc_e_c > calc_v_f + calc_e_f) {
            System.out.println("C");
        } 
        else if (calc_v_c + calc_e_c < calc_v_f + calc_e_f) {
            System.out.println("F");
        }
        else if(calc_v_c + calc_e_c == calc_v_f + calc_e_f && sd_c > sd_f) {
            System.out.println("C");
        }
        else if(calc_v_c + calc_e_c == calc_v_f + calc_e_f && sd_c < sd_f) {
            System.out.println("F");
        }
        else {
            System.out.println("=");
        }
    }
}
