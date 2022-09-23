
import Personagens.Arqueiro;
import Personagens.Guerreiro;
import Personagens.Mago;

public class App {
    public static void main(String[] args) throws Exception {

        Mago mago = new Mago("Mago", "Luiz", "Magia", 10, 2, 5, 7);
        Guerreiro guerreiro = new Guerreiro("Guerreiro", "tio", "Magia", 10, 5, 5);
        Arqueiro arqueiro = new Arqueiro("Arqueiro", "Gavião", "Magia", 10, 9, 8);

        try {
            mago.ataque();
            System.out.println(mago.toString());
            guerreiro.sofrerAtaque(20);
            System.out.println(guerreiro.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
