package Personagens;

public class Arqueiro extends Personagem {
    private float velocidade;

    public Arqueiro(String nome, float vida, float nivelExp, float velocidade) {
        super(nome, vida, nivelExp);
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Arqueiro [velocidade=" + velocidade + "]";
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

}
