public class Produto {
    String nome, marca;
    double precoVenda, precoCusto;


    public Produto(String nome, String marca, double precoCusto, double precoVenda) {
        this.nome = nome;
        this.marca = marca;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    public double lucro() {
        return this.precoVenda - this.precoCusto;
    }

}
