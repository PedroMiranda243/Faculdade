import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner ler = new Scanner(System.in);
        System.out.println("Quanto você ganha por hora trabalhada? ");
        double vh = ler.nextDouble();
        System.out.println("Quantas horas você trabalhou no mês? ");
        double ht = ler.nextDouble();
        double sal = vh*ht;
        System.out.println("Seu salário no final do mês é de: R$" + sal);
        ler.close();
    }
}
