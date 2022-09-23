package Personagens;

public class Guerreiro extends Personagem {
    private float forcaFisica;

    public Guerreiro(String tipo, String nome, String arma, float vida, float nivelExp, float forcaFisica) {
        super(tipo, nome, arma, vida, nivelExp);
        this.forcaFisica = forcaFisica;
    }

    @Override
    public String toString() {
        return super.toString() + "\nForca Fisica: " + forcaFisica;
    }

}
