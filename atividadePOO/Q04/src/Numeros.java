import java.util.Scanner;

public class Numeros {
     double n1, n2, n3;
    public void ler(){
    Scanner numero = new Scanner(System.in);
    System.out.println("Digite o primeiro número: ");
    n1 = numero.nextDouble();
    System.out.println("Digite o segundo número: ");
    n2 = numero.nextDouble();
    System.out.println("Digite o terceiro número: ");
    n3 = numero.nextDouble();
    numero.close();
    }
    public void Maior() {
    if (n1 > n2 && n1 > n3){
        System.out.println(n1+" é o maior dos três números");
    }
    else if(n2 > n1 && n2 > n3){
        System.out.println(n2+" é o maior dos três números");
    }
    else{
        System.out.println(n3+" é o maior dos três números");
    }
    }
}