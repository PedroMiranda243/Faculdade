import java.util.Scanner;

public class Conta {
    Scanner acao = new Scanner(System.in);

    double saldo = 0, deposito, saque, taxa = 0.005;

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
        saque = saque-(saque*taxa);
        saldo -= saque;
         System.out.println("Saque realizado no valor de: R$"+saque);
         return saque;
    }

    public double versaldo(){
        System.out.println("Seu saldo é de: R$"+saldo);
        return saldo;
    }

}
