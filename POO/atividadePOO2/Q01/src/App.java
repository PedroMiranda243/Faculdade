import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Ajuste ajustes = new Ajuste();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu salário atual: ");
        ajustes.salario = scan.nextDouble();
        ajustes.reajuste();
        
    }
}
