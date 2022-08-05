import java.util.Scanner;

public class Conta {
    private int id; // Valor do usuário
    private int numeroConta; // Preveniente da máquina
    private int codigoCliente; // Valor do usuário
    private double saldo; // Pré definido pela máquina
    private int digitoVerificador; // Preveniente da máquina

    // Construtores
    public Conta(int id, int codigoCliente) {
        this.id = id;
        this.codigoCliente = codigoCliente;
    }

    public Conta(int id, int codigoCliente, int numeroConta) {
        this.id = id;
        this.codigoCliente = codigoCliente;
        this.numeroConta = numeroConta;
    }

    // Conta
    public Conta() {
        // Número da Conta
        int numConta = (int) (Math.random()  * 100000); // de 0 a 99.999
        this.numeroConta = numConta;

        // Dígito Verificador
        int result1, resto1, result2, resto2, result3, resto3, result4, resto4, result5;

        result1 = numConta / 10000; // 1.2345
        resto1 = numConta % 10000; // 1º dígito.
        
        result2 = resto1 / 1000;
        resto2 = resto1 % 1000; // 2º dígito.
        
        result3 = resto2 / 100;
        resto3 = resto2 % 100; // 3º dígito.
        
        result4 = resto3 / 10;
        resto4 = resto3 % 10; // 4º dígito.
        
        result5 = resto4; // 5º dígito (o que sobrou).

        int dvMult = result1 * result2 * result3 * result4 * result5;
        int dvRest = dvMult % 11;

        // Análise de dados do Dígito Verificador
        if(dvRest == 10) // Resto 10
            this.digitoVerificador = 0;
        else {
            this.digitoVerificador = dvRest;
        }

        // Saldo fixo
        this.saldo = 23717.98;
    }

    // Line
    public void line() {
        System.out.print("===========================================================\n");
    }

    // Dados da Conta
    public void dadosConta() {
        Scanner scan = new Scanner(System.in);
      
        int id = 0, codigoCliente = 0;
        
        System.out.print("Digite o ID da conta: ");
        id = scan.nextInt();
        this.id = id;
        
        line();
        System.out.print("Digite o código de cliente: ");
        codigoCliente = scan.nextInt();
        this.codigoCliente = codigoCliente;
        line();
    }

    // Sacar
    public double sacar(double valor) {
        if(this.saldo > valor) {
            return this.saldo -= valor;
        }
        return valor;
    }

    // Depositar
    public double depositar(double valor) {
            return this.saldo += valor;
    }

    // Imprimir Saldo
    public void imprimirSaldo() {
        line();
        System.out.printf("Saldo: %f", getsaldo()); // this.saldo
        line();
    }

    // Métodos Get
    public int getid() {
        return this.id;
    }

    public int getnumeroConta() {
        return this.numeroConta;
    }

    public int getcodigoCliente() {
        return this.codigoCliente;
    }

    public double getsaldo() {
        return this.saldo;
    }

    public int getdigitoVerificador() {
        return this.digitoVerificador;
    }

    // Métodos Set
    private int setid() {
        return this.id;
    }

    private int setnumeroConta() {
        return this.numeroConta;
    }

    private int setcodigoCliente() {
        return this.codigoCliente;
    }

    private double setsaldo() {
        return this.saldo;
    }

    private int setdigitoVerificador() {
        return this.digitoVerificador;
    }
}
