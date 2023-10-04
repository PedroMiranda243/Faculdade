import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner ler = new Scanner(System.in);
    double nota[] = new double[4];
   
    
    
    for(int i = 0; i < 4 ;i++){
        System.out.println("Digite a nota do aluno");
        nota[i] = ler.nextDouble();
      
    }
    double media = (nota[0] +nota[1] + nota[2] + nota[3])/4;
    System.out.println("A media do aluno é: " + media);
    ler.close();
    }
}
