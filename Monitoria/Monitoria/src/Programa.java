import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);

        Conta conta = new Conta();
        
        // Conta[] Conta = new Conta[7]; // Array de Objetos de 7 posições
        
        int actionBank = 0;
        double valorSaq = 0, deposito = 0;

        conta.line();
        System.out.print("\t\t\tBanco IFBA\n");
        conta.line();
        
        conta.dadosConta(); // id e codigoCliente
        
        do {
            System.out.print("[ 1 ] Sacar\n[ 2 ] Depositar \n[ 3 ] Sair\n-> Escolha uma opção: ");
            actionBank = scan.nextInt();
            conta.line();

            switch (actionBank) {

                case 1:
                    System.out.print("Valor a sacar: ");
                    valorSaq = scan.nextDouble();
                    conta.sacar(valorSaq);
                    conta.line();
                    System.out.print("Saque efetuado! \n");
                    conta.line();
                    Thread.sleep(2000);
                    break;
                
                case 2:
                    System.out.print("Valor de depósito: ");
                    deposito = scan.nextDouble();
                    conta.depositar(deposito);
                    conta.line();
                    System.out.print("Depósito efetuado! \n");
                    conta.line();
                    Thread.sleep(2000);
                    break;
                    
                case 3:
                    System.out.print("Saindo...\n");
                    conta.line();
                    Thread.sleep(3000);
                    break;
                    
                default:
                    System.out.print("Valor inválido.\n");
                    conta.line();
                    Thread.sleep(2000);
            } 
        } while(actionBank != 3);

        // Imprimir dados da conta
        System.out.print("\t\t\tDados Bancários\n");
        conta.line();
        
        System.out.printf("ID: %d\nNúmero da Conta: %d\nCódigo do Cliente: %d\nSaldo: %.2f\nDígito Verificador: %d\n", conta.getid(), conta.getnumeroConta(), conta.getcodigoCliente(), conta.getsaldo(), conta.getdigitoVerificador());

        conta.line();

    }

}
