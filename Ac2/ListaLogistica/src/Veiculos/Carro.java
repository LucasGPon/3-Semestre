package Veiculos;

public class Carro extends Viatura {
    private int portas;

    public Carro(String nome, String combustivel, float consumo, String placa, int portas) throws Exception {
        super(nome, "Carro", combustivel, consumo, placa);
        setPortas(portas);
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) throws Exception {
        if (portas <= 0)
            throw new Exception("Informar as portas do carro!!!");
        this.portas = portas;
    }

    @Override
    public String toString() {
        return super.toString() + " Portas: " + portas;
    }

}
