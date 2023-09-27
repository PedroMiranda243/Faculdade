import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o raio do círculo: ");
        double raio = ler.nextDouble();
        double area = Math.PI*raio*raio;
        System.out.println("A área deste círculo é: " + area);
        ler.close();

    }
}
