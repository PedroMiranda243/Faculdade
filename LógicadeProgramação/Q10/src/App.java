import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner ler = new Scanner(System.in);
        String menu = """
                Digite seu sexo:
                F - para Feminino.
                M - para Masculino.
                """;
        System.out.println(menu);
        String sexo = ler.next();
        
            if(sexo.equalsIgnoreCase("F")){
                System.out.println("Sexo Feminino!");
            }
            else if(sexo.equalsIgnoreCase("M")){
                System.out.println("Sexo Masculino!");
            }
            else{
                System.out.println("Sexo inválido!");
            }
        
        ler.close();
    }
}
