public class Aula03 {

    // Method
    static void metodo(double n1, double n2, double n3, double n4, double n5, double n6, double n7) {

        System.out.printf("Valores absolutos: %.2f / %.2f / %.2f / %.2f / %.2f / %.2f / %.2f \n", Math.abs(n1), Math.abs(n2), Math.abs(n3), Math.abs(n4), Math.abs(n5), Math.abs(n6), Math.abs(n7));

        System.out.printf("Valores decimais mais baixos: %.2f / %.2f / %.2f / %.2f / %.2f / %.2f / %.2f \n", Math.floor(n1), Math.floor(n2), Math.floor(n3), Math.floor(n4), Math.floor(n5), Math.floor(n6), Math.floor(n7));

        System.out.printf("Valores decimais mais altos: %.2f / %.2f / %.2f / %.2f / %.2f / %.2f / %.2f \n", Math.ceil(n1), Math.ceil(n2), Math.ceil(n3), Math.ceil(n4), Math.ceil(n5), Math.ceil(n6), Math.ceil(n7));

        System.out.printf("Valores decimais mais próximos: %.2f / %.2f / %.2f / %.2f / %.2f / %.2f / %.2f \n", Math.rint(n1), Math.rint(n2), Math.rint(n3), Math.rint(n4), Math.rint(n5), Math.rint(n6), Math.rint(n7));

        System.out.printf("Valores arredondados aritmeticamente: %d / %d / %d / %d / %d / %d / %d \n", Math.round(n1), Math.round(n2), Math.round(n3), Math.round(n4), Math.round(n5), Math.round(n6), Math.round(n7));
    }

    public static void main(String[] args) {
        metodo(5.15, 10.5, -32.51, -0.1, -0.9, 3.9, 3.1);
    }
}
