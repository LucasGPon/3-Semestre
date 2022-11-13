package RelatoriosViagens;

import java.util.List;

import Etinerario.Condutor;

public class FolhaDePagamento {
    private static float total = 0;
    private static int mes = 10;
    private static int ano = 2017;

    private static float totalAPagar(List<Condutor> condutores) {
        for (Condutor c : condutores) {
            total += c.getSalario();
        }
        return total;
    }

    public static void imprimir(List<Condutor> condutores) {
        for (Condutor c : condutores) {
            System.out.println(c);
        }
        System.out.println("Total a Pagar: " + totalAPagar(condutores) + "\nAno/Mês: " + ano + "/" + mes);
    }

}
