package Personagens;

public class Guerreiro extends Personagem {
    private float forcaFisica;

    public Guerreiro(String tipo, String nome, String arma, float vida, float nivelExp, float forcaFisica)
            throws Exception {
        super(tipo, nome, arma, vida, nivelExp);
        setForcaFisica(forcaFisica);
    }

    @Override
    public String toString() {
        return super.toString() + "\nForca Fisica: " + forcaFisica;
    }

    public float getForcaFisica() {
        return forcaFisica;
    }

    public void setForcaFisica(float forcaFisica) throws Exception {
        if (forcaFisica <= 0) {
            throw new Exception("Força fisica menor ou igual a zero!!!");
        }
        this.forcaFisica = forcaFisica;
    }

}
