public class sortName {

    static String[] metodo(int numSort, String[] nomes) {
        System.out.printf("\n\n%s\n\n\n", nomes[numSort - 1]);
        return nomes;    
    }
    
    public static void main(String[] args) {
        String[] nomes = {"Enrique", "Augusto", "Letícia", "Marcos", "Ester", "Érica", "Michelly", "Rodrigo", "Ricardo", "Fernanda", "Maxsuel", "Paulo", "Gabriel", "Fábio", "Andreia", "Benjamin", "Rodolfo", "Gustavo", "Rebecca", "Gabriela", "Luzia", "Maria"};
        
        metodo( (int) (Math.random() * nomes.length) , nomes);    
        
    }
}
