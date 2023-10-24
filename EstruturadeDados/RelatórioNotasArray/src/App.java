import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double[] notas= new double[20];
         
        for(int i = 0; i < notas.length; i++){
            System.out.println("Insira a " + (i+1) +"º nota");
            notas[i]= ler.nextDouble();
        }
        System.out.println("Notas acima de 7,5");
        for(int i=0; i<notas.length; i++){
            if(notas[i]>7.5){
                System.out.println(notas[i]);
            }
        }
        ler.close();
    }
}
