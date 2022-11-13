package Veiculos;

public class Moto extends Viatura {
    private float cilindradas;

    public Moto(String nome, String combustivel, float consumo, String placa, float cilindradas) throws Exception {
        super(nome, "Moto", combustivel, consumo, placa);
        setCilindradas(cilindradas);
    }

    public float getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(float cilindradas) throws Exception {
        if (cilindradas <= 0)
            throw new Exception("Informar as cilindradas da moto!!!");
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return super.toString() + " Cilindradas: " + cilindradas;
    }

}
