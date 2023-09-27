import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner ler = new Scanner(System.in);
        System.out.println("Digite o tamanho de um dos lados do quadrado: ");
        double lado = ler.nextDouble();
        double area = lado*lado;
        double areadobro = area*2;
        System.out.println("A área do quadrado é: " + area +
        "\n o dobro da área deste quadrado é: " + areadobro);
        ler.close();
    }
}
