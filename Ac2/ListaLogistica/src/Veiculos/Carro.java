package Veiculos;

public class Carro implements Veiculo {
    private int portas;
    private float combustivel;
    private float consumo;
    private String nome;
    private String placa;
    private String tipo;

    public Carro(String nome, String tipo, String placa, float combustivel, float consumo, int portas) {
        setNome(nome);
        setTipo(tipo);
        setPlaca(placa);
        setCombustivel(combustivel);
        setConsumo(consumo);
        setPortas(portas);
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public void gastoCombustivel(float distancia, float valorCombustivel) {
        // TODO Auto-generated method stub

    }

    @Override
    public float getCombustivel() {
        // TODO Auto-generated method stub
        return combustivel;
    }

    @Override
    public float getConsumo() {
        // TODO Auto-generated method stub
        return consumo;
    }

    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        return nome;
    }

    @Override
    public String getPlaca() {
        // TODO Auto-generated method stub
        return placa;
    }

    @Override
    public String getTipo() {
        // TODO Auto-generated method stub
        return tipo;
    }

    @Override
    public void setCombustivel(float combustivel) {
        this.combustivel = combustivel;

    }

    @Override
    public void setConsumo(float consumo) {
        this.consumo = consumo;

    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;

    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;

    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;

    }

}
