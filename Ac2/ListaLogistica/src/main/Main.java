package main;

import java.util.ArrayList;
import java.util.List;

import Etinerario.Condutor;
import Etinerario.Viagem;
import RelatoriosViagens.FolhaDePagamento;
import RelatoriosViagens.Relatorios;
import Veiculos.Caminhao;
import Veiculos.Carro;
import Veiculos.Moto;
import Veiculos.Veiculo;

public class Main {
    public static void main(String[] args) throws Exception {

        Moto kawasaki = new Moto("Kawasaki", "gasolina", 7, "POK-TYM", 900);
        Moto honda = new Moto("Honda", "gasolina", 15, "JLK-POJM", 150);
        Moto yamaha = new Moto("Yamaha", "gasolina", 20, "FJO-23JM", 200);
        Moto suzuki = new Moto("Suzuki", "etanol", 12, "MHV-AWE", 150);
        Carro astra = new Carro("Astra", "etanol", 10, "JJK-LMJK", 5);
        Caminhao scania = new Caminhao("Scania", "diesel", 5, "PQL=KLJM", 5);

        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(kawasaki);
        veiculos.add(honda);
        veiculos.add(yamaha);
        veiculos.add(suzuki);
        veiculos.add(astra);
        veiculos.add(scania);

        Condutor flavio = new Condutor("Flavio Silva", "123-156-564-8", "27/06/1980", 2500);
        Condutor luiz = new Condutor("Luiz Augusto", "789-654-158-2", "16/02/1999", 2200);
        Condutor larissa = new Condutor("Larissa Almeida", "399-931-872-1", "02/10/1996", 2800);

        List<Condutor> condutores = new ArrayList<>();
        condutores.add(larissa);
        condutores.add(flavio);
        condutores.add(luiz);

        Viagem niteroi = new Viagem("Lins", "Niteroi", 800, 3, kawasaki, larissa);
        Viagem ubatuba = new Viagem("Indaiatuba", "Ubatuba", 450, 4, scania, luiz);
        Viagem natal = new Viagem("Sorocaba", "Natal", 1500, 2, suzuki, flavio);

        List<Viagem> viagens = new ArrayList<>();
        viagens.add(niteroi);
        viagens.add(ubatuba);
        viagens.add(natal);

        try {
            // Relatorios.imprimirVeiculos(veiculos);
            // Relatorios.imprimirCondutores(condutores);
            Relatorios.imprimirViagens(viagens);
            // FolhaDePagamento.imprimir(condutores);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
