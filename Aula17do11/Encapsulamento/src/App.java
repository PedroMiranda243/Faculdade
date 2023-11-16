public class App {
    public static void main(String[] args) throws Exception {
        Humano h = new Humano();

        h.setNome("Pedro");
        h.setAltura(1.85);
        h.setIdade(18);
        h.setSexo('M');

        h.seApresenta();
        h.fazAniversário();
        System.out.println();
        h.seApresenta();
    }
}
