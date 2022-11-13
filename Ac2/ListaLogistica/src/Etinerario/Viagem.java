package Etinerario;

import java.util.List;

import Veiculos.Veiculo;

public class Viagem implements Comparable<Viagem> {
    private String cidOrigem, cidDestino;
    private float distancia, diaria, valorCombustivel;
    private Veiculo veiculos;
    private Condutor condutores;

    public Viagem(String cidOrigem, String cidDestino, float distancia, float valorCombustivel,
            Veiculo veiculos, Condutor condutores) throws Exception {
        setCidOrigem(cidOrigem);
        setCidDestino(cidDestino);
        setDistancia(distancia);
        setVeiculos(veiculos);
        setCondutores(condutores);
        setValorCombustivel(valorCombustivel);
    }

    private float custo() {
        if (distancia > 0) {
            diaria = 100;
            if (distancia >= 700) {
                diaria++;
            }
        }
        return veiculos.gastoCombustivel(distancia, valorCombustivel) + diaria;
    }

    @Override
    public int compareTo(Viagem v) {
        return (int) (this.custo() - v.custo());
    }

    public String getCidDestino() {
        return cidDestino;
    }

    public String getCidOrigem() {
        return cidOrigem;
    }

    public float getDistancia() {
        return distancia;
    }

    public Veiculo getVeiculos() {
        return veiculos;
    }

    public Condutor getCondutores() {
        return condutores;
    }

    public void setCidOrigem(String cidOrigem) throws Exception {
        if (cidOrigem == null)
            throw new Exception("Informar a cidade de origem!!!");
        this.cidOrigem = cidOrigem;
    }

    public void setCidDestino(String cidDestino) throws Exception {
        if (cidDestino == null)
            throw new Exception("Informar a cidade destino!!!");
        this.cidDestino = cidDestino;
    }

    public void setDistancia(float distancia) throws Exception {
        if (distancia <= 0)
            throw new Exception("Informar a distância!!!");
        this.distancia = distancia;
    }

    public void setValorCombustivel(float valorCombustivel) throws Exception {
        if (valorCombustivel <= 0)
            throw new Exception("Informar o valor do combustivel!!!");

        this.valorCombustivel = valorCombustivel;
    }

    public void setVeiculos(Veiculo veiculos) throws Exception {
        if (veiculos == null)
            throw new Exception("Informar o veiculo que será utilizado na viagem!!!");
        this.veiculos = veiculos;
    }

    public void setCondutores(Condutor condutores) throws Exception {
        if (condutores == null)
            throw new Exception("Informar o condutor da viagem!!!");
        this.condutores = condutores;
    }

    @Override
    public String toString() {
        return "\nOrigem: " + cidOrigem + "\nDestino: " + cidDestino + "\nCusto: " + custo();
    }

}
