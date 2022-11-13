package Veiculos;

public class Caminhao extends Viatura {
    private int eixos;

    public Caminhao(String nome, String combustivel, float consumo, String placa, int eixos) throws Exception {
        super(nome, "Caminhão", combustivel, consumo, placa);
        setEixos(eixos);
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) throws Exception {
        if (eixos <= 0)
            throw new Exception("Informar os eixos do caminhão!!!");
        this.eixos = eixos;
    }

    @Override
    public String toString() {
        return super.toString() + " Eixos: " + eixos;
    }

}
