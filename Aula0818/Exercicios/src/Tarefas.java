public class Tarefas {

    public String positivoNegativo(int n1) {
        if (n1 >= 0) {
            return "Positivo";
        } else {
            return "Negativo";
        }
    }

    public double retornaProduto(int n1, int n2, int n3) {
        return n1 * n2 * n3;
    }

    public double mediaAritmetica(int n1, int n2, int n3, int n4) {
        return n1 + n2 + n3 + n4 / 4;
    }

    public String parImpar(int n1) {
        if (n1 % 2 == 0) {
            return "Par";
        } else {
            return "Impar";
        }
    }

    public int potencias(int b, int e) {
        int result = 1;

        for (int i = 0; i < e; i++) {
            result = result * b;
        }

        return result;
    }

}
