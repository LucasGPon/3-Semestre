package Personagens;

public class Mago extends Personagem {
    private float magia;
    private float cura;

    public Mago(String tipo, String nome, String arma, float vida, float nivelExp, float magia, float cura) {
        super(tipo, nome, arma, vida, nivelExp);
        this.magia = magia;
        this.cura = cura;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCura: " + cura + "\nMagia: " + magia;
    }

}
