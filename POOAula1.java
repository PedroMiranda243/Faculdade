
package poo.aula1;
import java.util.Scanner;

public class POOAula1 {

    
    
    public static void main(String[] args) {
    
    Matematica Resultado = new Matematica();
    Scanner scan = new Scanner(System.in);    
       
    
        System.out.println("digite um numero:");   
         Resultado.a1 = scan.nextFloat();
        
        System.out.println("digite outro numero:");   
        Resultado.a2= scan.nextFloat();
        
        
        Resultado.media();
    }//public static void main(String[] args)
    
}//
