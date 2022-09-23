package Personagens;

public class Personagem {
    private String nome;
    private float vida;
    private float nivelExp;

    @Override
    public String toString() {
        return "Personagem [nivelExp=" + nivelExp + ", nome=" + nome + ", vida=" + vida + "]";
    }

    public Personagem(String nome, float vida, float nivelExp) {
        this.nome = nome;
        this.vida = vida;
        this.nivelExp = nivelExp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getVida() {
        return vida;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }

    public float getNivelExp() {
        return nivelExp;
    }

    public void setNivelExp(float nivelExp) {
        this.nivelExp = nivelExp;
    }

    public void ataque() {
        this.nivelExp += 1;
        System.out.println("O " + this.nome + " Atacou");
    }

    public void sofrerAtaque(float dano) throws Exception {
        if (dano >= vida) {
            if (dano <= 0) {
                throw new Exception("Dano menor ou igual a zero!!!");
            }
            morrer();
        }
        this.vida -= dano;
    }

    public void restaurarVida(float ganho) throws Exception {
        if (ganho <= 0) {
            throw new Exception("Ganho menor ou igual a zero!!!");
        }
        this.vida += ganho;
    }

    public void morrer() {
        if (this.vida <= 0) {
            System.out.println("O " + this.nome + " Morreu");
        }
    }

}
