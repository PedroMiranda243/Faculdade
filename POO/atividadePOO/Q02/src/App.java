import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();
        double menu = 1;

        while(menu == 1){

        System.out.println("Bem-vindo ao sistema do banco, qual ação deseja realizar? \n1)Depositar \n2)Sacar \n3) Ver saldo \n4)Sair");
        int digito = scanner.nextInt();
        if(digito != 1 && digito != 2 && digito != 3 && digito != 4 ){
        System.out.println("Não há esta opção no menu!\n");
        }
          menu = 1;
        switch(digito){
          case(1):
          conta.depositar();
          menu = 1;
          break;

          case(2):
          conta.sacar();
          menu = 1;
          break;

          case(3):
          conta.versaldo();
          menu = 1;
          break;

          case(4):
          menu = 2;
          scanner.close();
          break;
          
        } 
      }
    }

}
