package Veiculos;

public interface Veiculo {

    public float gastoCombustivel(float distancia, float valorCombustivel);

    public String getCombustivel();

    public float getConsumo();

    public String getPlaca();

    public String getTipo();

    public String getNome();

    public void setCombustivel(String combustivel) throws Exception;

    public void setConsumo(float consumo) throws Exception;

    public void setPlaca(String placa) throws Exception;

    public void setTipo(String tipo) throws Exception;

    public void setNome(String nome) throws Exception;

}