import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Triangulos contas = new Triangulos();
     try (Scanner scan = new Scanner(System.in)) {
        System.out.println("Digite os valores dos lados A, B e C de um triângulo: ");
        contas.la = scan.nextDouble();
        contas.lb = scan.nextDouble();
        contas.lc = scan.nextDouble();
    }
        contas.triangulo();

        
    }
}
