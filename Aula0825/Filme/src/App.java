public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria c = new ContaBancaria();

        c.Deposito(300);

        System.out.println(c.Consulta());
        

        // Filme f = new Filme();

        // try {
        //     f.setTitulo("Oblivion");
        //     f.setDuracao(90.0);
        //     f.setGenero("Romance");

        //     System.out.println(f.getTitulo() + "\n" + f.getDuracao() + "\n" + f.getGenero());
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }

    }
}
