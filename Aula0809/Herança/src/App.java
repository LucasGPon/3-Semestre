public class App {
    public static void main(String[] args) throws Exception {
        PessoaFisica pf = new PessoaFisica("Lucas", "Indaiatuba",
                "facens@facens.br", "123.456.987-98");

        PessoaJuridica pj = new PessoaJuridica("Facens",
                "Sorocaba", "oficial@facens.br", "12.456.0004-24");

        Funcionario f = new Funcionario("Julius", "Bed-Stuy",
                "newyork@york.com", "045.465.798-98", 2000);

        System.out.println("Pessoa Jurifica: " + pj.nome + "\n" + pj.endereco + "\n" + pj.email + "\n"
                + pj.cnpj);

        System.out.println();

        System.out.println("Pessoa Fisica: " + pf.nome + "\n" + pf.endereco + "\n" + pf.email + "\n"
                + pf.cpf);

        System.out.println();

        System.out.println("Funcionario: " + f.nome + "\n" + f.endereco + "\n" + f.email + "\n"
                + f.cpf + "\n" + f.salario);
    }
}
