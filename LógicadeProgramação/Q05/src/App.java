import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite em metros a distância a ser convertida: ");
        double metros = ler.nextDouble();
        double centimetros = metros*100;
        System.out.println(metros + " Metros convertido em centímetro é: " + centimetros + " Cm");
        ler.close();
    }
}
