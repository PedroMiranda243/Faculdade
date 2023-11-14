import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList <Double> s;
		s = new ArrayList<Double>();
		
		int qtd, qtd_acima;
		double sal, media, soma;
		
		System.out.print("Digite a quantidade de salários: ");
		qtd = leia.nextInt();
		
		for (int i = 0; i < qtd; i++) {
			System.out.print("Digite o salário: ");
			sal = leia.nextDouble();
			s.add(sal);
		}
		
		soma =0;
		for (int i = 0; i < qtd; i++) {
			soma = soma + s.get(i);
		}
		
		media = soma / qtd;

		qtd_acima = 0;
		for (int i = 0; i < qtd; i++) {
			if ( s.get(i) > media )
				qtd_acima++;
		}
		
		System.out.println("Quantide acima da média: "+qtd_acima);
	}

}
