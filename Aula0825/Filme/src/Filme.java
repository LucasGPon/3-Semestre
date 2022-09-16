public class Filme {
    private String titulo;
    private Double duracao;
    private String genero;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws Exception {
        titulo = titulo.trim();
        if (titulo == "" || titulo == null) {
            throw new Exception("Titulo é obrigatório!");
        }
        this.titulo = titulo;
    }

    public Double getDuracao() {
        return duracao;
    }

    public void setDuracao(Double duracao) throws Exception {
        if (duracao <= 0) {
            throw new Exception("Duração não pode ser 0!");
        }
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) throws Exception {
        if (genero != "Romance" && genero != "Terror" && genero != "Comédia") {
            throw new Exception("O genêro deve ser Romance,Terror ou Comédia!");
        }
        this.genero = genero;
    }

}
