import java.util.Scanner;

public class Media {
    double n1, n2, contamedia;
    public void ler(){
         Scanner notas = new Scanner(System.in);
             System.out.println("Digite a primeira nota:");
             n1 = notas.nextDouble();
             System.out.println("Digite a segunda nota:");
             n2 = notas.nextDouble();
             notas.close();
    }
    public void calculo(){
        contamedia = ((n1+n2)/2);
    }
    public void analise(){
        if(contamedia >= 7){
        System.out.println("Aprovado!");
        }
        else if(contamedia == 10){
            System.out.println("Aprovado com distinção!");
        }
        else{
            System.out.println("Reprovado!");
        }
    }
}
