public final class Secretario extends Funcionario {
    private long codigoSecretario;

    public void receberSalario() {
        System.out.printf("Salário do Secretário: R$ 3.200.\n");
    }

    public void listaDeTarefas() {
        System.out.printf("Lista de Tarefas do Secretário: Fazer isso, aquilo e isso aqui.\n");
    }

    public long getCodigoSecretario() {
        return codigoSecretario;
    }

    public void setCodigoSecretario(long codigoSecretario) {
        this.codigoSecretario = codigoSecretario;
    }

}
