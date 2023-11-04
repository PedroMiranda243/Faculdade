import java.util.Scanner;

public class Conta {
    Scanner acao = new Scanner(System.in);

    double saldo = 0, deposito, saque;
    double limite = 2000;

    public double depositar(){
        System.out.println("Qual o valor do depósito? \n");
        deposito = acao.nextDouble();
        saldo += deposito;
        System.out.println("Depósito realizado no valor de: R$"+deposito);
        return deposito;
    }

    public double sacar(){
        System.out.println("Qual o valor do saque?\n");
        saque = acao.nextDouble();
         double taxa = (saque*0.005);
        if((saldo+limite)>=(saque+taxa)){
        saldo -= saque + taxa;
         System.out.println("Saque realizado no valor de: R$"+saque);
         return saque;
        }
        else{
            System.out.println("Saldo insuficiente!");
            return taxa = 0;
        }
    }

    public void versaldo(){
        if(saldo<0){
            System.out.println("ATENÇÃO!\nVocê está utilizando do cheque especial! \nSeu saldo é de: R$"+ saldo);
        }
        else{
        System.out.println("Seu saldo é de: R$"+saldo);
        }
    }

}
