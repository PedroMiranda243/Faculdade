import java.util.Scanner;

public class Medias {
    Scanner ler = new Scanner(System.in);
    double n1, n2, n3, ma, mp;

    public double callmediaA() {

        System.out.println("Digite a primeira nota");
        n1 = ler.nextDouble();
        System.out.println("Digite a segunda nota");
        n2 = ler.nextDouble();
        ma = (n1 + n2) / 2;
        System.out.println("A sua média aritimética é " + ma);

        return ma;
    }

    public double callmediaP() {
        System.out.println("Digite a primeira nota");
        n1 = ler.nextDouble();
        System.out.println("Digite a segunda nota");
        n2 = ler.nextDouble();
        System.out.println("Digite a terceira nota");
        n3 = ler.nextDouble();
        mp = (n1 * 1 + n2 * 2 + n3 * 3) / 6;
        System.out.println("A sua média ponderada é " + mp);

        return mp;

    }
}
