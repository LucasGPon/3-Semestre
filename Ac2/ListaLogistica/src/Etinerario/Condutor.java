package Etinerario;

public class Condutor implements Comparable<Condutor> {
    private String nome, cpf, dataNasc;
    private float salario;

    public Condutor(String nome, String cpf, String dataNasc, float salario) throws Exception {
        setNome(nome);
        setCpf(cpf);
        setDataNasc(dataNasc);
        setSalario(salario);
    }

    @Override
    public int compareTo(Condutor c) {
        return this.cpf.compareTo(c.getCpf());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome == null)
            throw new Exception("Informar o nome do condutor!!!");
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws Exception {
        if (cpf == null)
            throw new Exception("Informar o CPF do condutor!!!");
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) throws Exception {
        if (dataNasc == null)
            throw new Exception("Informar a data de nascimento do condutor!!!");
        this.dataNasc = dataNasc;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) throws Exception {
        if (salario <= 0)
            throw new Exception("Informar o salário do condutor!!!");
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Condutor \nnome: " + nome + "\ncpf: " + cpf + "\nData nascimento: " + dataNasc + "\nSalario: " + salario
                + "\n";
    }

}
