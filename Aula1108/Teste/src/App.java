public class App {
    public static void main(String[] args) throws Exception {
        Produto p = new Produto("Notebook", "Dell", 50, 300);
        
        System.out.println("Lucro " + p.lucro());
    }
}
