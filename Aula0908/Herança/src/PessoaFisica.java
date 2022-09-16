public class PessoaFisica extends Pessoa {
    String cpf;

    public PessoaFisica(String nome, String endereco, String email, String cpf) {
        super(nome, endereco, email);
        this.cpf = cpf;
    }
}
