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
        System.out.println();
        h.seApresenta();
        System.out.println();

        // seção do universitário.
        Universitario u = new Universitario();
        u.setNome("Ricardo");
        u.setAltura(1.85);
        u.setIdade(20);
        u.setSexo('M');

        u.setCurso("Engenharia da computação");
        u.setPeriodo(2);

        u.passaPeriodo();
        System.out.println();

        // seção do trabalhador
        Trabalhador t = new Trabalhador();
        t.setNome("Rafael");
        t.setAltura(1.76);
        t.setIdade(18);
        t.setSexo('M');

        t.setProfissao("Policial Federal");
        t.setSalario(7000);

        t.exibeAumento(25);
        System.out.println();
    }
}
