public class App {
    public static void main(String[] args) throws Exception {
        // O instânciamento geralmente ocorre aqui
        Humano h = new Humano();

        h.nome = "Camile";
        h.altura = 1.59;
        h.idade = 20;
        h.sexo = 'F';

        h.seApresenta();
        h.fazAniversário();
        System.out.println();
        h.seApresenta();

    }
}
