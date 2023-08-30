import java.util.Scanner;

public class Hipotenusa {
 double Ca, Cb;
    public void leitura(){
    Scanner catetos = new Scanner (System.in);
    System.out.println("Digite o cateto A: ");
    Ca = catetos.nextDouble();
    System.out.println("Digite o cateto B: ");
    Cb = catetos.nextDouble();
    catetos.close();
    }
    public double Calculo(){
    return Math.sqrt(Ca*Ca+Cb*Cb);
    }
}
