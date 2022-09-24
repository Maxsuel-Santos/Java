import java.util.Scanner;

public final class Cliente implements Autenticavel {
    private long codigoCliente;

    @Override
    public void login() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe seu email: ");
        String email = scan.nextLine();

        System.out.print("Informe sua senha: ");
        String senha = scan.nextLine();
        
        if("cliente123".equals(senha) && "cliente@gmail.com".equals(email)) {
            System.out.println("Seja Bem-Vindo(a) Cliente!");
        } else {
            System.err.println("ERRO AO LOGAR!");
        }

        scan.close();
    }

    public long getcodigoCliente() {
        return codigoCliente;
    }

    public void setcodigoCliente(long codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

}
