import javax.swing.JOptionPane;

public final class App {    
    public static void line() {
        System.out.print("=====================================================================\n");
    }
    public static void main(String[] args) throws Exception {
        JOptionPane.showMessageDialog(null, "Bem-Vindo(a) ao Banco IFBA!", "Banco IFBA", JOptionPane.INFORMATION_MESSAGE);

        line();
        Cliente cli = new Cliente();
        System.out.println("CLIENTE: ");
        cli.login();

        line();
        
        Secretario sec = new Secretario();
        Engenheiro eng = new Engenheiro(); 
        Diretor dir = new Diretor(); 
        Gerente ger = new Gerente(); 

        System.out.println("TODOS OS FUNCIONÁRIOS: ");

        sec.receberSalario();
        sec.listaDeTarefas();
        line();

        eng.receberSalario();
        eng.listaDeTarefas();
        line();

        dir.receberSalario();
        dir.listaDeTarefas();
        line();
        
        ger.receberSalario();
        ger.listaDeTarefas();
    }
}
