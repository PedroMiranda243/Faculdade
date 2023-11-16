public class App {
    public static void main(String[] args) throws Exception {

        // seção do humano.
        Humano h = new Humano();

        h.setNome("Camile");
        h.setAltura(1.59);
        h.setIdade(20);
        h.setSexo('F');

        h.seApresenta();
        h.fazAniversário();

        h.seApresenta();

        // seção do universitário.
        Universitario u = new Universitario();
        u.setNome("Ricardo");
        u.setAltura(1.85);
        u.setIdade(20);
        u.setSexo('M');

        u.setCurso("Engenharia da computação");
        u.setPeriodo(2);

        u.passaPeriodo();

        u.seApresenta();

        // seção do trabalhador
        Trabalhador t = new Trabalhador();
        t.setNome("Rafael");
        t.setAltura(1.76);
        t.setIdade(18);
        t.setSexo('M');

        t.setProfissao("Policial Federal");
        t.setSalario(7000);

        t.exibeAumento(25);

        t.seApresenta();

        // seção amigo de Pedro
        amigoPedro(h);
        amigoPedro(u);
        amigoPedro(t);

    }

    // Método só pra exemplificar uma propriedade de polimorfismo
    public static void amigoPedro(Humano x) {
        System.out.println(x.getNome() + " e Pedro são melhores amigos! :)");
        System.out.println();
    }
}
