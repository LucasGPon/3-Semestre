package Veiculos;

public interface Veiculo {
    
    public void gastoCombustivel(float distancia, float valorCombustivel);

    public float getCombustivel();

    public float getConsumo();

    public String getPlaca();

    public String getNome();

    public String getTipo();

    public void setNome(String nome);

    public void setTipo(String tipo);

    public void setCombustivel(float combustivel);

    public void setConsumo(float consumo);

    public void setPlaca(String placa);

    
}