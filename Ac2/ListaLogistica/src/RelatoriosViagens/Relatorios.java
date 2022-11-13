package RelatoriosViagens;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Etinerario.Condutor;
import Etinerario.Viagem;
import Veiculos.Veiculo;
import Veiculos.Viatura;

public class Relatorios {

    public static void imprimirVeiculos(List<Veiculo> veiculos) {
        for (Veiculo v : veiculos) {
            System.out.println(v);
        }
    }

    public static void imprimirCondutores(List<Condutor> condutores) {
        Collections.sort(condutores);
        for (Condutor c : condutores) {
            System.out.println("\nCondutor Nome: " + c.getNome());
            System.out.println("CPF: " + c.getCpf());
        }
    }

    public static void imprimirViagens(List<Viagem> viagens) {
        Collections.sort(viagens);
        for (Viagem e : viagens) {
            System.out.println(e);
        }
    }

}
