package Etinerario;

public class Viagem {
    private String cidOrigem;
    private String cidDestino;
    private float distancia;
    private String veiculo;
    private String condutor;

    public Viagem(String cidOrigem, String cidDestino, float distancia, String veiculo, String condutor) {
        setCidOrigem(cidOrigem);
        setCidDestino(cidDestino);
        setDistancia(distancia);
        setVeiculo(veiculo);
        setCondutor(condutor);
    }

    public void custo() {

    }

    public String getCidOrigem() {
        return cidOrigem;
    }

    public void setCidOrigem(String cidOrigem) {
        this.cidOrigem = cidOrigem;
    }

    public String getCidDestino() {
        return cidDestino;
    }

    public void setCidDestino(String cidDestino) {
        this.cidDestino = cidDestino;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getCondutor() {
        return condutor;
    }

    public void setCondutor(String condutor) {
        this.condutor = condutor;
    }

    @Override
    public String toString() {
        return "Viagem [cidOrigem=" + cidOrigem + ", cidDestino=" + cidDestino + ", distancia=" + distancia
                + ", veiculo=" + veiculo + ", condutor=" + condutor + "]";
    }

}
