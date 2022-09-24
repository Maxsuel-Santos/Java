import java.util.Scanner;

public final class Diretor extends Funcionario implements Autenticavel {
    private long codigoDiretor;

    public void receberSalario() {
        System.out.printf("Salário do Diretor: R$ 2.500.\n");
    }

    public void listaDeTarefas() {
        System.out.printf("Lista de Tarefas do Diretor: Fazer isso, aquilo e isso aqui.\n");
    }

    @Override
    public void login() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu email: ");
        String email = scan.nextLine();

        System.out.println("Informe sua senha: ");
        String senha = scan.nextLine();
        
        if("diretor123".equals(senha) && "diretor@gmail.com".equals(email)) {
            System.out.println("Seja Bem-Vindo(a) Diretor(a)!");
        } else {
            System.err.println("ERRO AO LOGAR!");
        }

        scan.close();
    }

    public long getcodigoDiretor() {
        return codigoDiretor;
    }

    public void setcodigoDiretor(long codigoDiretor) {
        this.codigoDiretor = codigoDiretor;
    }

}
