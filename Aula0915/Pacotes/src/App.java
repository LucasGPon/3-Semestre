import java.util.Scanner;

import utilidades.FuncoesUteis;

public class App {
    public static void main(String[] args) throws Exception {
        String msg = "A soma é: " + FuncoesUteis.Soma(5,6);
        System.out.println(msg);

        Scanner sc = new Scanner(System.in);
        int altura;

        System.out.println("Digite um numero");
        altura = sc.nextInt();

        FuncoesUteis.Triangulo(altura);

        sc.close();

    }
}
