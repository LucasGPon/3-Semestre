import java.time.Month;
import java.util.Calendar;

public class Produto {
    String nome;
    double precoCusto;
    double precoVenda;
    Calendar dataFab = Calendar.getInstance();
    Calendar dataVal = Calendar.getInstance();

    public Produto(String nome, double precoCusto, double precoVenda, Calendar dataFab, Calendar dataVal) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.dataFab = dataFab;
        this.dataVal = dataVal;
    }

    public Produto(String nome, double precoCusto, double precoVenda, Calendar dataFab) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.dataFab = dataFab;
    }

    public Produto(String nome, double precoCusto, Calendar dataFab) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoCusto + (precoCusto * 0.1);
        this.dataFab = dataFab;
    }
}
