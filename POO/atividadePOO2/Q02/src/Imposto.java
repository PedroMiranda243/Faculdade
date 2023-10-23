import java.util.Scanner;

public class Imposto {
    double ht, vh, sal, salli, ir, inss, fgts;
     Scanner scan = new Scanner(System.in);
    public double callir(){
        System.out.println("Digite suas horas trabalhadas no mês: ");
        ht = scan.nextDouble();
        System.out.println("Digite o valor da sua hora de trabalho: ");
        vh = scan.nextDouble();
        sal = vh*ht;
        if(sal <= 1500){
            ir = 5;
            salli = sal - ((sal*ir)/100);
        }

        if(sal > 1500 && sal <= 2500){
            ir = 10;
            salli = sal - ((sal*ir)/100);
        }

        if(sal > 2500){
            ir = 20;
            salli = sal - ((sal*ir)/100);
        }

        fgts = sal*0.11;

        inss= sal* 0.03;

        System.out.println("Salário Bruto("+ht+"+"+vh+"): R$"+sal+"\n\n(-)IR("+ir+"%): R$"+((sal)*ir)/100+"\n");
        System.out.println("(-)INSS(3%): R$"+inss);
        System.out.println("\nFGTS(11%): R$"+fgts);
        System.out.println("\ntotal descontado: R$"+(inss+((sal)*ir)/100));
        System.out.println("\n Salário líquido: R$"+(salli-inss));
        return sal;
    }
}
