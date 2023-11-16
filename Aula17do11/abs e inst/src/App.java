public class App {
    public static void main(String[] args) throws Exception {
        Humano h = new Humano();

        h.nome = "Pedro";
        h.altura = 1.85;
        h.idade = 18;
        h.sexo = 'M';

        h.seApresenta();
        h.fazAniversário();
        System.out.println();
        h.seApresenta();

    }
}
