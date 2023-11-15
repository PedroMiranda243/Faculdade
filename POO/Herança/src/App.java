import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Quadrado q = new Quadrado();
        Retangulo r = new Retangulo();
        Triangulo t = new Triangulo();
        Scanner ler = new Scanner(System.in);

        boolean m = true;
        int opc;
        String menu = """
                SELECIONE A OPÇÃO
                1- ÁREA DO RETÂNGULO
                2- ÁREA DO QUADRADO
                3- ÁREA DO TRIÂNGULO
                4- SAIR
                """;

        while (m == true) {
            System.out.println(menu);
            opc = ler.nextInt();
            if (opc == 1) {
                System.out.println("Insira a base: ");
                r.setBase(ler.nextDouble());
                System.out.println("Insira a altura: ");
                r.setAltura(ler.nextDouble());
                System.out.println("Valor da base: " + r.getBase()+"\n");
                System.out.println("Valor da altura: " + r.getAltura()+"\n");
                System.out.println("A área do retângulo é: " + r.getResultado()+"\n");
            }

            else if (opc == 2) {
                System.out.println("Insira a base: ");
                q.setBase(ler.nextDouble());
                System.out.println("Valor da base: " + q.getBase()+"\n");
                System.out.println("A área do quadrado é: " + q.getResultado()+"\n");

            }

            else if (opc == 3) {
                System.out.println("Insira a base: ");
                t.setBase(ler.nextDouble());
                System.out.println("Insira a altura: ");
                t.setAltura(ler.nextDouble());
                System.out.println("Valor da base: " + t.getBase()+"\n");
                System.out.println("Valor da altura: " + t.getAltura()+"\n");
                System.out.println("A área do triângulo é: " + t.getResultado()+"\n");
            }

            else if (opc == 4) {
                System.out.println("Saindo do programa...");
                m = false;
            }
        }
    }
}
