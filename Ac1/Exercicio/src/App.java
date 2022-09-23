
import Personagens.Arqueiro;
import Personagens.Guerreiro;
import Personagens.Mago;

public class App {
    public static void main(String[] args) throws Exception {
        Mago mago = new Mago("Luiz", 10, 2, 5, 7);
        Guerreiro guerreiro = new Guerreiro("tio", 10, 5, 5);
        Arqueiro arqueiro = new Arqueiro("Gavião", 10, 9, 8);

        System.out.println(guerreiro.toString());
    }
}
