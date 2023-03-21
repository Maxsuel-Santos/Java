// Exceção personalizada
class TesteMinhaClase extends Exception {
    private String mensagem;

    public TesteMinhaClase(String mensagem) {
        super(mensagem);
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return "MinhaExcecao: " + mensagem;
    }
}

// Classe que contém o método que lança a exceção personalizada
class MinhaClasse {
    public void meuMetodo() throws TesteMinhaClase {
        throw new TesteMinhaClase("Minha mensagem de exceção personalizada");
    }
}

// Classe principal (main) que testa o método e trata a exceção
public class App3 {
    public static void main(String[] args) {
    	MinhaClasse classe = new MinhaClasse();
    	
        try {
            classe.meuMetodo();
           
        } catch (TesteMinhaClase e) {
            System.out.println("Capturada exceção: " + e.toString());
        }
    }
}