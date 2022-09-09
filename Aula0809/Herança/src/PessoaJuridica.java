public class PessoaJuridica extends Pessoa {
    String cnpj;

    public PessoaJuridica(String nome, String endereco, String email, String cnpj) {
        super(nome, endereco, email);
        this.cnpj = cnpj;
    }
}
