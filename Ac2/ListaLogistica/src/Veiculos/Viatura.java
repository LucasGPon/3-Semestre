package Veiculos;

public abstract class Viatura implements Veiculo, Comparable<Veiculo> {
    private String nome, tipo, combustivel, placa;
    private float consumo;

    public Viatura(String nome, String tipo, String combustivel, float consumo, String placa) throws Exception {
        setNome(nome);
        setTipo(tipo);
        setCombustivel(combustivel);
        setConsumo(consumo);
        setPlaca(placa);
    }

    @Override
    public float gastoCombustivel(float distancia, float valorCombustivel) {
        return (distancia / consumo) * valorCombustivel;
    }

    @Override
    public int compareTo(Veiculo v) {
        return this.nome.compareTo(v.getNome());
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public String getCombustivel() {
        return combustivel;
    }

    @Override
    public float getConsumo() {
        return consumo;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public void setNome(String nome) throws Exception {
        if (nome == null)
            throw new Exception("Nome em branco, \nPreencher campo Nome!!!");
        this.nome = nome;
    }

    @Override
    public void setTipo(String tipo) throws Exception {
        if (tipo == null)
            throw new Exception("Tipo em branco!!!");
        this.tipo = tipo;
    }

    @Override
    public void setCombustivel(String combustivel) throws Exception {
        if (combustivel == null) {
            throw new Exception("Combustivel em branco!!!");

        } else if ("etanol".equals(combustivel) || "diesel".equals(combustivel) || "gasolina".equals(combustivel)) {
            this.combustivel = combustivel;
        } else {
            throw new Exception("Combustivel fora do especificado!!!");
        }
    }

    @Override
    public void setConsumo(float consumo) throws Exception {
        if (consumo <= 0)
            throw new Exception("Valor para consumo invalído \nInformar um valor valído!!!");
        this.consumo = consumo;
    }

    @Override
    public void setPlaca(String placa) throws Exception {
        if (placa == null)
            throw new Exception("Placa do veiculo em branco!!!");
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "\nVeiculo: " + nome + " Tipo: " + tipo + " Combustivel: " + combustivel + " Consumo: " + consumo + " Placa: "
                + placa;
    }

}
