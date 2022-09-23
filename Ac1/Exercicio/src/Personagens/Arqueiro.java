package Personagens;

public class Arqueiro extends Personagem {
    private float velocidade;

    public Arqueiro(String tipo, String nome, String arma, float vida, float nivelExp, float velocidade) {
        super(tipo, nome, arma, vida, nivelExp);
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return super.toString() + "\nVelocidade: " + velocidade;
    }

}
