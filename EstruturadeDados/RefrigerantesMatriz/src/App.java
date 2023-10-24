import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int[][] vendas = new int[4][5];
        int soma = 0;
        for(int i=0; i < vendas.length; i++){
            for(int j = 0; j < vendas.length;  j++){
        System.out.println("Insira a quantidade vendida");
            vendas[i][j]= ler.nextInt();
            }
        }
        for(int i=0;  i<vendas.length; i++){
            for(int j=0; j<vendas.length; j++){
                soma += vendas[i][j];
            }
        }
        System.out.println("A quantidade total vendida foi de: "+ soma +" garrafas");
        ler.close();
    }
}
