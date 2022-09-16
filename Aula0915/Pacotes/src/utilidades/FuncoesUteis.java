package utilidades;

public class FuncoesUteis {
    public static int Soma(int a, int b) {
        return a + b;
    }

    public static void Triangulo(int a) {
        int i, j;
        // outer loop to handle number of rows
        // n in this case
        for (i = 0; i < a; i++) {

            // inner loop to handle number of columns
            // values changing acc. to outer loop
            for (j = 0; j <= i; j++) {
                // printing stars
                System.out.print("X ");
            }

            // ending line after each row
            System.out.println();
        }
    }
}