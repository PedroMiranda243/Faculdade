import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite o número a ser impresso na tela: ");
        double numero = ler.nextDouble();
        System.out.println("O número informado foi: " + numero);
        ler.close();
    }
}
