import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        Media m = new Media();

        System.out.println("Nota 1");
        m.setNota1(ler.nextDouble());

        System.out.println("Nota 2");
        m.setNota2(ler.nextDouble());
        
        System.out.println("Primeira nota foi: " + m.getNota1()+"\n");
        System.out.println("Segunda nota é: "+ m.getNota2()+"\n");
        System.out.println("A média é:" + m.getResultado());
        ler.close();

    }
}
