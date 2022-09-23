package Personagens;

public class Mago extends Personagem {
    private float magia;
    private float cura;

    public Mago(String nome, float vida, float nivelExp, float magia, float cura) {
        super(nome, vida, nivelExp);
        this.magia = magia;
        this.cura = cura;
    }

    @Override
    public String toString() {
        return "Mago [cura=" + cura + ", magia=" + magia + "]";
    }

    public float getMagia() {
        return magia;
    }

    public void setMagia(float magia) {
        this.magia = magia;
    }

    public float getCura() {
        return cura;
    }

    public void setCura(float cura) {
        this.cura = cura;
    }

}
