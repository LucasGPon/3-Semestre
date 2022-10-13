package Personagens;

public class Personagem {
    private String tipo;
    private String nome;
    private String arma;
    private float vida;
    private float nivelExp;

    @Override
    public String toString() {
        return "\nTipo: " + tipo + "\nNome: " + nome + "\nArma: " + arma + "\nVida: " + vida + "\nNivel Experiência: "
                + nivelExp;
    }

    public Personagem(String tipo, String nome, String arma, float vida, float nivelExp) throws Exception {
        setTipo(tipo);
        setNome(nome);
        setArma(arma);
        setVida(vida);
        setNivelExp(nivelExp);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) throws Exception {
        if (tipo == "") {
            throw new Exception("Tipo vazio !!!");
        } else {
            this.tipo = tipo;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome == "") {
            throw new Exception("Nome vazio !!!");
        } else {
            this.nome = nome;
        }
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) throws Exception {
        if (arma == "") {
            throw new Exception("Arma vazia !!!");
        } else {
            this.arma = arma;
        }
    }

    public float getVida() {
        return vida;
    }

    public void setVida(float vida) throws Exception {
        if (vida <= 0) {
            throw new Exception("Vida menor ou igual a 0 !!!");
        } else {
            this.vida = vida;
        }
    }

    public float getNivelExp() {
        return nivelExp;
    }

    public void setNivelExp(float nivelExp) throws Exception {
        if (nivelExp <= 0) {
            throw new Exception("Nivel experiência menor ou igual a 0 !!!");
        } else {
            this.nivelExp = nivelExp;
        }
    }

    public void ataque() {
        this.nivelExp += 1;
        System.out.println("O " + this.tipo + " " + this.nome + " Atacou o inimigo com " + arma);
    }

    public void sofrerAtaque(float dano) throws Exception {
        if (dano <= 0) {
            throw new Exception("Dano menor ou igual a zero!!!");
        } else if (dano >= vida) {
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

    void morrer() {
        System.out.println("\n"+ tipo + " " + nome + " morreu\n");
    }

}
