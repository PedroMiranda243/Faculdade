import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner ler = new Scanner(System.in);
        System.out.println("Insira o valor a ser análisado: ");
        double n = ler.nextDouble();
        if(n > 0){
            System.out.println(n + " é positivo!");
        }
        if(n == 0){
            System.out.println(n + " é nulo!");
        }
        else{
            System.out.println(n + " é negativo!");
        }
        ler.close();
    }
}
