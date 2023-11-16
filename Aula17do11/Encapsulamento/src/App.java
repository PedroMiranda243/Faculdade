public class App {
    public static void main(String[] args) throws Exception {
        Humano h = new Humano();

        // Aqui um exemplo do sistema definindo os atributos.
        h.setNome("Camile");
        h.setAltura(1.59);
        h.setIdade(20);
        h.setSexo('F');

        h.seApresenta();
        h.fazAniversário();
        System.out.println();
        h.seApresenta();
    }
}
