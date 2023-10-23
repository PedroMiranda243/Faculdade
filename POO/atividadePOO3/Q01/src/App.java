import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        precos client = new precos();
        boolean exit = false;   
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Bem-vindo ao posto!\n");
            while(exit == false){
                System.out.println("\n-----Qual tipo de Combustivel você deseja colocar-----\n");
                System.out.println("A-para alcool.\nG- para Gasolina.\nE-Não quero abastecer.");
                String op = ler.next();
                
                switch(op){
                
                    case "A":
                     System.out.println("Quantos litros você deseja colocar?");
                     double litro = ler.nextDouble();
                     client.alcool(litro);
                       break;
                        
                    case "G":
                        System.out.println("Quantos litros você deseja colocar?");
                      litro = ler.nextDouble();
                      client.gasolina(litro);
                      
                       break;
                        
                    case "E":
                       System.out.println("Fechando o sistema...");
                       exit = true;
                        break;
                        
                    default:
                        System.out.println("sinto muito,essa opção não é válida");
                        
                   
                }
                
                
                
                
            }
        }
    }
    
}
    

