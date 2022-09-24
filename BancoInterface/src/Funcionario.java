public abstract class Funcionario {
    protected String nome;
    protected String sobrenome;
    protected int idade;
    protected long cpf;
    protected long rg;
    protected float salario;

    public abstract void receberSalario();
    public abstract void listaDeTarefas();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public long getCpf() {
        return cpf;
    }
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    public long getRg() {
        return rg;
    }
    public void setRg(long rg) {
        this.rg = rg;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

}
