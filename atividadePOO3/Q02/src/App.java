import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       try (Scanner ler = new Scanner(System.in)) {
        boolean exit = false;
        Medias usuario = new Medias();
        
        System.out.println("*****Bem vindo ao sistema de medias*****");
       
        while(exit == false){
            System.out.println("\n----qual operação deseja fazer?----\n1)Media Aritmetica\n2)Media Ponderada\n3)Sair");
            String escolha = ler.next();
            switch(escolha){
            
            case "1":
           
                usuario.callmediaA();
                break;
                
            case "2":
                usuario.callmediaP();
                break;
                
            case "3":
            System.out.println("Fechando o programa...");
            exit = true;
            break;
            default:
                System.out.println("sinto muito, essa opção está invalida");
          
                break;
                
                
        
        }
            
        }
    }
        
        
    }
    
}