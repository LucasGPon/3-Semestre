package Etinerario;

public class Condutor {
    private String nome;
    private String cpf;
    private String dataNasc;
    private float salario;

    public Condutor(String nome, String cpf, String dataNasc, float salario) {
        setNome(nome);
        setCpf(cpf);
        setDataNasc(dataNasc);
        setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Condutor [nome=" + nome + ", cpf=" + cpf + ", dataNasc=" + dataNasc + ", salario=" + salario + "]";
    }

}
