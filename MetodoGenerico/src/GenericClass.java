package genericclass;

public class GenericClass {
    
     public static <T extends Number & Comparable<T> > void encontrarSoma(T[] vetor) {
            double soma = 0.0;
            for (int i = 0; i < vetor.length; i++) {
                soma += vetor[i].doubleValue();
            }
            System.out.println("soma: " + soma + " ");

           
            if(vetor[0].compareTo(vetor[1]) > 0)
                System.out.println("elemento 1 maior que 2 ");
           
            if(vetor[0].compareTo(vetor[1]) < 0)
                System.out.println("elemento 1 menor que 2 ");
           
            if(vetor[0].compareTo(vetor[1]) == 0)
                System.out.println("elemento 1 igua a 2 ");

        }
           
       public static <T> void imprimirVetor(T[] vetor) {
            for (T elemento : vetor) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    
    public static void main(String[] args) {
            Float[] vetorFloat = { 2.4F, 2.5F, 3.1F};
            Integer[] vetorInteiros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            String[] vetorStrings = { "foo", "bar", "baz" };

            encontrarSoma(vetorFloat);
           
            System.out.println("Vetor de inteiros:");
            imprimirVetor(vetorInteiros);

            System.out.println("Vetor de strings generics:");
            imprimirVetor(vetorStrings);
        }
    
}
