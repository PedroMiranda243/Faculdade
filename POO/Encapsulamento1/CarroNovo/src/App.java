import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler= new Scanner(System.in);
        Carro c = new Carro();
        System.out.println("Inira o valo do carro");
        c.setCarroP(ler.nextDouble());
         System.out.println("Preço do carro com impostos é de: " + c.getCarroP());
         ler.close();
    }
}