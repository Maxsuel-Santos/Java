import java.util.Scanner;

public final class Gerente extends Funcionario implements Autenticavel {
    private long codigoGerente;

    @Override
    public void receberSalario() {
        System.out.printf("Salário do Gerente: R$ 3.200.\n");
    }

    @Override
    public void listaDeTarefas() {
        System.out.printf("Lista de Tarefas do Gerente: Fazer isso, aquilo e isso aqui.\n");
    }

    @Override
    public void login() {
        Scanner scan = new Scanner(System.in);
        scan.next();
        System.out.println("Informe seu email: ");
        String email = scan.nextLine();

        System.out.println("Informe sua senha: ");
        String senha = scan.nextLine();
        
        if("gerente123".equals(senha) && "gerente@gmail.com".equals(email)) {
            System.out.println("Seja Bem-Vindo(a) Gerente!");
        } else {
            System.err.println("ERRO AO LOGAR!");
        }

        scan.close();
    }

    public long getcodigoGerente() {
        return codigoGerente;
    }

    public void setcodigoGerente(long codigoGerente) {
        this.codigoGerente = codigoGerente;
    }

}
