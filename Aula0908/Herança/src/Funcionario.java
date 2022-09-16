public class Funcionario extends PessoaFisica {
    int salario;

    public Funcionario(String nome, String endereco, String email, String cpf, int salario) {
        super(nome, endereco, email, cpf);
        this.salario = salario;
    }
}
