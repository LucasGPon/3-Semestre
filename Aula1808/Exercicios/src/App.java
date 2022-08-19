import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        Tarefas t = new Tarefas();

        System.out.println("Digite o primeiro valor: ");
        int num1 = ler.nextInt();

        System.out.println("Digite o segundo valor: ");
        int num2 = ler.nextInt();

        System.out.println("Digite o terceiro valor: ");
        int num3 = ler.nextInt();

        System.out.println("Digite o quarto valor: ");
        int num4 = ler.nextInt();

    
        System.out.println("Primeiro numero: " + t.positivoNegativo(num1));

        System.out.println("Produtos dos 1° 2° 3° valores: " + t.retornaProduto(num1, num2, num3));

        System.out.println("Produtos dos 4 valores: " + t.mediaAritmetica(num1, num2, num3, num4));

        System.out.println("Primeiro numero: " + t.parImpar(num1));
        
        ler.close();
    }
}
