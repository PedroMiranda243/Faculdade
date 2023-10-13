import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        Potenciacao pot = new Potenciacao();//criação do objeto  
        
        double basedocara;
        int expdocara; 
        System.err.println("Insira a base");
        basedocara =ler.nextDouble();
        System.out.println("Insira o expoente");
        expdocara = ler.nextInt();

        System.out.println(pot.potencia(basedocara, expdocara));
        
        
    }
}
