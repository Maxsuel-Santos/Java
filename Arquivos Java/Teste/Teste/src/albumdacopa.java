// Álbum da Copa do Mundo
// Maxsuel Santos & Rafael Áquila

import java.util.Scanner;

public class albumdacopa {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt(); // Num. total de figurinhas
        int M = in.nextInt(); // Num. de figurinhas já compradas
		int Y = 0, cont = 0, fig_f = 0;
        int[] X = new int[N + 1]; 

        for(int i = 0; i < N + 1; i++) 
            X[i] = 0; // Atribui 0 a todas as posições do vetor

		for(int i = 0; i < M; i++) {
			Y = in.nextInt();
			X[Y] = 1;
		}

		for(int i = 1; i < N + 1; i++) {
			if(X[i] == 1) 
				cont++;
		}

		System.out.printf("%d", fig_f = N - cont); // Output

		in.close(); // Fechar o Scanner in
	}
}
