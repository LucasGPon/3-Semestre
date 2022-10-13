package Personagens;

public class Mago extends Personagem {
    private float magia;
    private float cura;

    public Mago(String tipo, String nome, String arma, float vida, float nivelExp, float magia, float cura)
            throws Exception {
        super(tipo, nome, arma, vida, nivelExp);
        setMagia(magia);
        setCura(cura);
    }

    @Override
    public String toString() {
        return super.toString() + "\nCura: " + cura + "\nMagia: " + magia;
    }

    public float getMagia() {
        return magia;
    }

    public void setMagia(float magia) throws Exception {
        if (magia <= 0) {
            throw new Exception("Magia menor ou igual a zero!!!");
        }
        this.magia = magia;
    }

    public float getCura() {
        return cura;
    }

    public void setCura(float cura) throws Exception {
        if (cura <= 0) {
            throw new Exception("Cura menor ou igual a zero!!!");
        }
        this.cura = cura;
    }

}
