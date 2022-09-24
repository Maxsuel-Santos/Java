public final class Engenheiro extends Funcionario {
    private long codigoEngenheiro;

    public void receberSalario() {
        System.out.printf("Salário do Engenheiro: R$ 6.700.\n");
    }

    public void listaDeTarefas() {
        System.out.printf("Lista de Tarefas do Engenheiro: Fazer isso, aquilo e isso aqui.\n");
    }

    public long getcodigoEngenheiro() {
        return codigoEngenheiro;
    }

    public void setcodigoEngenheiro(long codigoEngenheiro) {
        this.codigoEngenheiro = codigoEngenheiro;
    }

}
