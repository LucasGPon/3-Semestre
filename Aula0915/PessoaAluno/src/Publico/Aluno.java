package Publico;

public class Aluno extends Pessoa {
    int nota;
    int presenca;
    
    public Aluno(String nome, String cpf, int peso, int altura, int nota, int presenca) {
        super(nome, cpf, peso, altura);
        this.nota = nota;
        this.presenca = presenca;
    }
    
}
