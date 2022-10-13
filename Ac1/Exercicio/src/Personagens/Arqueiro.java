package Personagens;

public class Arqueiro extends Personagem {
    private float velocidade;

    public Arqueiro(String tipo, String nome, String arma, float vida, float nivelExp, float velocidade)
            throws Exception {
        super(tipo, nome, arma, vida, nivelExp);
        setVelocidade(velocidade);
    }

    @Override
    public String toString() {
        return super.toString() + "\nVelocidade: " + velocidade;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) throws Exception {
        if (velocidade <= 0) {
            throw new Exception("Velocidade menor ou igual a zero!!!");
        }
        this.velocidade = velocidade;
    }

}
