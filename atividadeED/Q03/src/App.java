import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double soma;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o primeiro número da soma: ");
    double n1 = ler.nextDouble();
    System.out.println("Informe o segundo número da soma: ");
    double n2 = ler.nextDouble();
        soma = n1 + n2;
        System.out.println("O resultado da soma é: " + soma);
        ler.close();

    }
}
