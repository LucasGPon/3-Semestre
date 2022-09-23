package Personagens;

public class Personagem {
    private String tipo;
    private String nome;
    private String arma;
    private float vida;
    private float nivelExp;

    @Override
    public String toString() {
        return "Tipo: " + tipo + "\nNome: " + nome + "\nArma: " + arma + "\nVida: " + vida + "\nNivel Experiência: "
                + nivelExp;
    }

    public Personagem(String tipo, String nome, String arma, float vida, float nivelExp) {
        this.tipo = tipo;
        this.nome = nome;
        this.arma = arma;
        this.vida = vida;
        this.nivelExp = nivelExp;
    }

    public void ataque() {
        this.nivelExp += 1;
        System.out.println("O " + this.tipo + " " + this.nome + " Atacou o inimigo com " + arma);
    }

    public void sofrerAtaque(float dano) throws Exception {
        if (dano >= vida) {
            if (dano <= 0) {
                throw new Exception("Dano menor ou igual a zero!!!");
            }
        }
        this.vida -= dano;
    }

    public void restaurarVida(float ganho) throws Exception {
        if (ganho <= 0) {
            throw new Exception("Ganho menor ou igual a zero!!!");
        }
        this.vida += ganho;
    }

    boolean morrer() {
        if (this.vida > 0) {

        }
        return false;
    }

}
