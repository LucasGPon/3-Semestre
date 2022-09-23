package Personagens;

public class Guerreiro extends Personagem {
    private float forcaFisica;

    public Guerreiro(String nome, float vida, float nivelExp, float forcaFisica) {
        super(nome, vida, nivelExp);
        this.forcaFisica = forcaFisica;
    }

    @Override
    public String toString() {
        return "Guerreiro [forcaFisica=" + forcaFisica + "]";
    }

    public float getForcaFisica() {
        return forcaFisica;
    }

    public void setForcaFisica(float forcaFisica) {
        this.forcaFisica = forcaFisica;
    }

}
