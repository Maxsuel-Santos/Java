import java.io.PrintStream;

public class Teste03 {
    private static PrintStream printf;

    public static void main(String[] args) {
        double[] nums = {5.15, 10.5, -32.51, -0.1, -0.9, 3.9, 3.1};

        // Números absolutos
        System.out.printf("\n* Números absolutos *\n");
        for(int i = 0; i < nums.length; i++) {
            System.out.printf("%.2f -> ", nums[i]);
        } System.out.print("FIM\n\n");

        // Números decimais mais baixos
        System.out.printf("\n* Números decimais mais baixos *\n");
        for(int i = 0; i < nums.length; i++) {
            System.out.printf("%.2f -> ", Math.floor(nums[i]));
        } System.out.print("FIM\n\n");

        // Números decimais mais altos
        System.out.printf("\n* Números decimais mais altos *\n");
        for(int i = 0; i < nums.length; i++) {
            System.out.printf("%.2f -> ", Math.ceil(nums[i]));
        } System.out.print("FIM\n\n");

        // Números mais próximos
        System.out.printf("\n* Números mais próximos *\n");
        for(int i = 0; i < nums.length; i++) {
            System.out.printf("%.2f -> ", Math.rint(nums[i]));
        } System.out.print("FIM\n\n");

        // Arredondamento aritmético
        System.out.printf("\n* Arredondamento aritmético *\n");
        for(int i = 0; i < nums.length; i++) {
            printf = System.out.printf("%d -> ", Math.round(nums[i]));
        } System.out.print("FIM\n\n");
    }
}
